import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.api.Point;
import net.runelite.api.RenderOverview;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.worldmap.WorldMapData;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vs")
public class WorldMap implements RenderOverview {
   @ObfuscatedName("bb")
   float zoom;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6271 = 8;
   @ObfuscatedName("bx")
   int field6245;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6266 = 3;
   @ObfuscatedSignature(descriptor = "Lvy;")
   @ObfuscatedName("ak")
   static final FontName fontNameVerdana11 = FontName.FontName_verdana11;
   @ObfuscatedSignature(descriptor = "Lvy;")
   @ObfuscatedName("aw")
   static final FontName fontNameVerdana13 = FontName.FontName_verdana13;
   @ObfuscatedSignature(descriptor = "Lvy;")
   @ObfuscatedName("ap")
   static final FontName fontNameVerdana15 = FontName.FontName_verdana15;
   @ObfuscatedName("ai")
   final int[] menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
   @ObfuscatedName("bs")
   int centerTileY;
   @ObfuscatedName("ac")
   HashSet field6264;
   @ObfuscatedName("bz")
   int worldMapTargetX;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ab")
   AbstractArchive WorldMap_archive;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ax")
   AbstractArchive WorldMap_geographyArchive;
   @ObfuscatedName("as")
   public boolean showCoord = false;
   @ObfuscatedName("al")
   HashMap fonts;
   @ObfuscatedSignature(descriptor = "[Lxm;")
   @ObfuscatedName("af")
   IndexedSprite[] mapSceneSprites;
   @ObfuscatedName("am")
   HashMap details;
   @ObfuscatedName("cm")
   boolean elementsDisabled;
   @ObfuscatedSignature(descriptor = "Lla;")
   @ObfuscatedName("ao")
   WorldMapArea mainMapArea;
   @ObfuscatedName("ch")
   HashSet enabledElements;
   @ObfuscatedSignature(descriptor = "Lle;")
   @ObfuscatedName("be")
   WorldMapRenderer worldMapRenderer;
   @ObfuscatedSignature(descriptor = "Lvv;")
   @ObfuscatedName("bo")
   WorldMapArchiveLoader cacheLoader;
   @ObfuscatedName("bf")
   int flashCount;
   @ObfuscatedName("bq")
   int field6278;
   @ObfuscatedName("bh")
   int field6238;
   @ObfuscatedName("cx")
   int minCachedTileX;
   @ObfuscatedName("bn")
   int flashCycle;
   @ObfuscatedName("bj")
   float zoomTarget;
   @ObfuscatedName("bm")
   int worldMapDisplayWidth;
   @ObfuscatedName("cb")
   int field6241;
   @ObfuscatedName("bk")
   int worldMapTargetY;
   @ObfuscatedName("br")
   int field6243;
   @ObfuscatedName("bt")
   int worldMapDisplayX;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ar")
   AbstractArchive WorldMap_groundArchive;
   @ObfuscatedName("by")
   boolean perpetualFlash;
   @ObfuscatedName("bw")
   HashSet flashingElements;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field6272 = -1;
   @ObfuscatedName("ba")
   int maxFlashCount;
   @ObfuscatedName("cp")
   int field6247;
   @ObfuscatedSignature(descriptor = "Loj;")
   @ObfuscatedName("cs")
   Coord mouseCoord;
   @ObfuscatedName("bi")
   int cyclesPerFlash;
   @ObfuscatedName("cg")
   int minCachedTileY;
   @ObfuscatedName("bc")
   long field6279;
   @ObfuscatedName("bp")
   int worldMapDisplayHeight;
   @ObfuscatedName("bl")
   int field6275;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field6273 = -65536;
   @ObfuscatedSignature(descriptor = "Lla;")
   @ObfuscatedName("aq")
   WorldMapArea field6286;
   @ObfuscatedName("ce")
   HashSet enabledCategories;
   @ObfuscatedName("cu")
   HashSet enabledElementIds;
   @ObfuscatedName("ct")
   HashSet field6258;
   @ObfuscatedName("cc")
   Iterator iconIterator;
   @ObfuscatedSignature(descriptor = "Lla;")
   @ObfuscatedName("aa")
   WorldMapArea currentMapArea;
   @ObfuscatedName("ck")
   List field6283;
   @ObfuscatedSignature(descriptor = "Lsu;")
   @ObfuscatedName("ah")
   Font font;
   @ObfuscatedName("co")
   int cachedPixelsPerTile;
   @ObfuscatedSignature(descriptor = "Lxt;")
   @ObfuscatedName("cn")
   SpritePixels sprite;
   @ObfuscatedName("bd")
   int field6240;
   @ObfuscatedName("bv")
   boolean field6254;
   @ObfuscatedName("bg")
   int centerTileX;
   @ObfuscatedName("bu")
   int worldMapDisplayY;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fo")
   public int method11491() {
      return null == this.mainMapArea ? -1 : this.worldMapTargetY * 605996841 + WorldMapArea.method6961(this.mainMapArea, (byte)30) * 1155264994;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;I)V")
   @ObfuscatedName("if")
   public static void method11522(WorldMap var0, int var1) {
      if (var0 == null) {
         var0.method11447();
      } else {
         var0.flashingElements = new HashSet();
         var0.flashingElements.add(var1);
         var0.cachedPixelsPerTile = 0;
         var0.maxFlashCount = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   public void method11372(int var1) {
      try {
         DemotingHashTable.method7417(WorldMapRegion.WorldMapRegion_cachedSprites, 5);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZIIIII)V")
   @ObfuscatedName("ag")
   public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (!this.cacheLoader.isLoaded(-881076330)) {
            if (var8 <= 65536) {
               throw new IllegalStateException();
            }
         } else {
            this.smoothZoom(1843211763);
            this.scrollToTarget((byte)-61);
            if (!var3) {
               if (var8 <= 65536) {
                  throw new IllegalStateException();
               }
            } else {
               int var9 = (int)Math.ceil(var6 / this.zoom);
               int var10 = (int)Math.ceil(var7 / this.zoom);
               List var11 = WorldMapRenderer.method7145(
                  this.worldMapRenderer,
                  1385473505 * this.field6278 - var9 / 2 - 1,
                  this.worldMapTargetY * 605996841 - var10 / 2 - 1,
                  1 + 1385473505 * this.field6278 + var9 / 2,
                  var10 / 2 + 605996841 * this.worldMapTargetY + 1,
                  var4,
                  var5,
                  var6,
                  var7,
                  var1,
                  var2,
                  -1959601549
               );
               HashSet var12 = new HashSet();

               for (AbstractWorldMapIcon var14 : var11) {
                  var12.add(var14);
                  ScriptEvent var15 = new ScriptEvent();
                  WorldMapEvent var16 = new WorldMapEvent(var14.getElement(-1022817339), var14.coord1, var14.coord2);
                  var15.setArgs(new Object[]{var16, var1, var2}, 1707589862);
                  if (this.field6264.contains(var14)) {
                     if (var8 <= 65536) {
                        throw new IllegalStateException();
                     }

                     ScriptEvent.method1406(var15, 17, (byte)-83);
                  } else {
                     ScriptEvent.method1406(var15, 15, (byte)-76);
                  }

                  class141.runScriptEvent(var15, 1856325427);
               }

               Iterator var18 = this.field6264.iterator();

               while (var18.hasNext()) {
                  if (var8 <= 65536) {
                     throw new IllegalStateException();
                  }

                  AbstractWorldMapIcon var19 = (AbstractWorldMapIcon)var18.next();
                  if (!var12.contains(var19)) {
                     if (var8 <= 65536) {
                        throw new IllegalStateException();
                     }

                     ScriptEvent var20 = new ScriptEvent();
                     WorldMapEvent var21 = new WorldMapEvent(var19.getElement(-632326291), var19.coord1, var19.coord2);
                     var20.setArgs(new Object[]{var21, var1, var2}, -988961991);
                     ScriptEvent.method1406(var20, 16, (byte)-9);
                     class141.runScriptEvent(var20, 1856325427);
                  }
               }

               this.field6264 = var12;
            }
         }
      } catch (RuntimeException var17) {
         throw RestClientThreadFactory.newRunException(var17, "vs.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZZI)V")
   @ObfuscatedName("an")
   public void method11377(int var1, int var2, boolean var3, boolean var4, int var5) {
      try {
         long var6;
         label73: {
            var6 = ParamComposition.method4949((byte)15);
            this.method11384(var1, var2, var4, var6);
            label72:
            if (!this.hasTarget(-841390354)) {
               if (var5 <= -170892348) {
                  return;
               }

               if (!var4) {
                  if (var5 <= -170892348) {
                     return;
                  }

                  if (!var3) {
                     break label72;
                  }

                  if (var5 <= -170892348) {
                     throw new IllegalStateException();
                  }
               }

               boolean var8 = client.clickedWidget != null;
               if (!var8) {
                  if (var5 <= -170892348) {
                     throw new IllegalStateException();
                  }

                  if (var4) {
                     if (var5 <= -170892348) {
                        return;
                     }

                     this.cyclesPerFlash = var1 * 1333966893;
                     this.minCachedTileY = -969746873 * var2;
                     this.field6247 = 1635372181 * this.field6278;
                     this.worldMapTargetX = 672358013 * this.worldMapTargetY;
                  }

                  if (this.field6247 * -911256291 != -1) {
                     if (var5 <= -170892348) {
                        throw new IllegalStateException();
                     }

                     int var9 = var1 - this.cyclesPerFlash * -708290651;
                     int var10 = var2 - 1388311415 * this.minCachedTileY;
                     method11396(
                        this,
                        -911256291 * this.field6247 - (int)(var9 / this.zoomTarget),
                        this.worldMapTargetX * 1535037213 + (int)(var10 / this.zoomTarget),
                        false,
                        -1686226617
                     );
                  }
                  break label73;
               }
            }

            method11403(this, (byte)1);
         }

         if (var4) {
            if (var5 <= -170892348) {
               return;
            }

            this.field6279 = 7903547019418784317L * var6;
            this.worldMapDisplayHeight = -1281124863 * var1;
            this.field6275 = var2 * -280459117;
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "vs.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gs")
   public void method11517(boolean var1) {
      this.perpetualFlash = var1;
   }

   @ObfuscatedSignature(descriptor = "()Lms;")
   @ObfuscatedName("hh")
   public AbstractWorldMapIcon method11561() {
      if (!this.cacheLoader.isLoaded(72563720)) {
         return null;
      } else if (!this.worldMapRenderer.isLoaded(-931823343)) {
         return null;
      } else {
         HashMap var1 = this.worldMapRenderer.buildIcons(-1403433911);
         this.field6283 = new LinkedList();

         for (List var3 : var1.values()) {
            this.field6283.addAll(var3);
         }

         this.iconIterator = this.field6283.iterator();
         return this.iconStart(-2050738694);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ff")
   public void method11469(int var1) {
      this.zoomTarget = this.getZoomFromPercentage(var1, -1920389958);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;)Lms;")
   @ObfuscatedName("kq")
   public static AbstractWorldMapIcon method11562(WorldMap var0) {
      if (!var0.cacheLoader.isLoaded(-1504894323)) {
         return null;
      } else if (!var0.worldMapRenderer.isLoaded(-106107944)) {
         return null;
      } else {
         HashMap var1 = var0.worldMapRenderer.buildIcons(-1403433911);
         var0.field6283 = new LinkedList();

         for (List var3 : var1.values()) {
            var0.field6283.addAll(var3);
         }

         var0.iconIterator = var0.field6283.iterator();
         return var0.iconStart(268214866);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ay")
   boolean hasTarget(int var1) {
      try {
         if (-1 != this.field6238 * -2014116575) {
            if (var1 == 1096119295) {
               throw new IllegalStateException();
            }

            if (1325693167 * this.minCachedTileX != -1) {
               if (var1 == 1096119295) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Lla;")
   @ObfuscatedName("au")
   public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3, int var4) {
      try {
         Iterator var5 = this.details.values().iterator();

         while (var5.hasNext()) {
            if (var4 <= -1505597843) {
               throw new IllegalStateException();
            }

            WorldMapArea var6 = (WorldMapArea)var5.next();
            if (var6.containsCoord(var1, var2, var3, 2136870681)) {
               if (var4 <= -1505597843) {
                  throw new IllegalStateException();
               }

               return var6;
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "vs.au(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;)Lla;")
   @ObfuscatedName("yb")
   public static WorldMapArea method11422(WorldMap var0) {
      return var0.mainMapArea;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ea")
   void method11434(int var1, int var2, int var3) {
      if (this.mainMapArea != null) {
         int[] var4 = WorldMapArea.method6923(this.mainMapArea, var1, var2, var3, 2116296522);
         if (var4 == null) {
            var4 = WorldMapArea.method6923(
               this.mainMapArea,
               this.mainMapArea.getOriginPlane(-1940782094),
               this.mainMapArea.getOriginX(1694603664),
               WorldMapArea.method6976(this.mainMapArea, (byte)-99),
               2129801093
            );
         }

         method11396(
            this,
            var4[0] - this.mainMapArea.getRegionLowX(-1436008625) * 64,
            var4[1] - WorldMapArea.method6961(this.mainMapArea, (byte)-5) * 64,
            true,
            -539094511
         );
         this.field6238 = -1482342113;
         this.minCachedTileX = -2104342031;
         this.zoom = this.getZoomFromPercentage(this.mainMapArea.getZoom((byte)42), -1344372210);
         this.zoomTarget = this.zoom;
         this.field6283 = null;
         this.iconIterator = null;
         this.worldMapRenderer.clearIcons(-2110100165);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("by")
   public void setMaxFlashCount(int var1, int var2) {
      try {
         WorldMapArea var3 = this.getMapArea(var1, (byte)4);
         if (null != var3) {
            if (var2 != 1265471425) {
               throw new IllegalStateException();
            }

            this.setCurrentMapArea(var3, 1711583028);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vs.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ai")
   public int currentMapAreaId(byte var1) {
      try {
         if (this.mainMapArea == null) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return WorldMapArea.method6931(this.mainMapArea, -1892420741);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.ai(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lla;I)V")
   @ObfuscatedName("ac")
   void setCurrentMapArea(WorldMapArea var1, int var2) {
      try {
         if (this.mainMapArea != null) {
            if (var2 != 1711583028) {
               throw new IllegalStateException();
            }

            if (var1 == this.mainMapArea) {
               return;
            }
         }

         this.initializeWorldMap(var1, (byte)-88);
         this.jump(-1, -1, -1, (byte)1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vs.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lla;B)V")
   @ObfuscatedName("ab")
   void initializeWorldMap(WorldMapArea var1, byte var2) {
      try {
         this.mainMapArea = var1;
         this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_archive, this.WorldMap_geographyArchive);
         String var10001;
         if (this.mainMapArea == null) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            var10001 = null;
         } else {
            var10001 = this.mainMapArea.getInternalName(268435520);
         }

         this.cacheLoader.reset(var10001, -1506087453);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vs.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cx")
   public void method11530() {
      this.flashingElements = null;
   }

   @ObfuscatedSignature(descriptor = "(IIIB)V")
   @ObfuscatedName("ar")
   void jump(int var1, int var2, int var3, byte var4) {
      try {
         if (this.mainMapArea == null) {
            if (var4 != 1) {
               throw new IllegalStateException();
            }
         } else {
            int[] var5 = WorldMapArea.method6923(this.mainMapArea, var1, var2, var3, 2134573010);
            if (var5 == null) {
               if (var4 != 1) {
                  return;
               }

               var5 = WorldMapArea.method6923(
                  this.mainMapArea,
                  this.mainMapArea.getOriginPlane(-1465225213),
                  this.mainMapArea.getOriginX(2089456729),
                  WorldMapArea.method6976(this.mainMapArea, (byte)-41),
                  2051453832
               );
            }

            method11396(
               this,
               var5[0] - this.mainMapArea.getRegionLowX(-1247948750) * 64,
               var5[1] - WorldMapArea.method6961(this.mainMapArea, (byte)60) * 64,
               true,
               -147167940
            );
            this.field6238 = -1482342113;
            this.minCachedTileX = -2104342031;
            this.zoom = this.getZoomFromPercentage(this.mainMapArea.getZoom((byte)-47), -1504844876);
            this.zoomTarget = this.zoom;
            this.field6283 = null;
            this.iconIterator = null;
            this.worldMapRenderer.clearIcons(-2116695625);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "vs.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILoj;I)Loj;")
   @ObfuscatedName("cm")
   public Coord method11555(int var1, Coord var2, int var3) {
      try {
         if (!this.cacheLoader.isLoaded(-3672179)) {
            return null;
         } else if (!this.worldMapRenderer.isLoaded(385242278)) {
            if (var3 <= 1010085172) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (!this.mainMapArea.containsPosition(-1931160809 * var2.x, var2.y * -263036313, (byte)-27)) {
            if (var3 <= 1010085172) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            HashMap var4 = this.worldMapRenderer.buildIcons(-1403433911);
            List var5 = (List)var4.get(var1);
            if (null != var5) {
               if (var3 <= 1010085172) {
                  throw new IllegalStateException();
               }

               if (!var5.isEmpty()) {
                  AbstractWorldMapIcon var6 = null;
                  int var7 = -1;
                  Iterator var8 = var5.iterator();

                  while (var8.hasNext()) {
                     if (var3 <= 1010085172) {
                        throw new IllegalStateException();
                     }

                     AbstractWorldMapIcon var9 = (AbstractWorldMapIcon)var8.next();
                     int var10 = var9.coord2.x * -1931160809 - var2.x * -1931160809;
                     int var11 = -263036313 * var9.coord2.y - var2.y * -263036313;
                     int var12 = var11 * var11 + var10 * var10;
                     if (0 == var12) {
                        if (var3 <= 1010085172) {
                           throw new IllegalStateException();
                        }

                        return var9.coord2;
                     }

                     if (var12 >= var7) {
                        if (var6 != null) {
                           continue;
                        }

                        if (var3 <= 1010085172) {
                           throw new IllegalStateException();
                        }
                     }

                     var6 = var9;
                     var7 = var12;
                  }

                  return var6.coord2;
               }

               if (var3 <= 1010085172) {
                  throw new IllegalStateException();
               }
            }

            return null;
         }
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "vs.cm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("al")
   public void method11443(int var1) {
      try {
         WorldMapRegion.WorldMapRegion_cachedSprites.clear();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILoj;Loj;I)V")
   @ObfuscatedName("cb")
   public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4, int var5) {
      try {
         ScriptEvent var6 = new ScriptEvent();
         WorldMapEvent var7 = new WorldMapEvent(var2, var3, var4);
         var6.setArgs(new Object[]{var7}, 897750466);
         switch (var1) {
            case 1008:
               ScriptEvent.method1406(var6, 10, (byte)-24);
               break;
            case 1009:
               ScriptEvent.method1406(var6, 11, (byte)-41);
               break;
            case 1010:
               ScriptEvent.method1406(var6, 12, (byte)-32);
               break;
            case 1011:
               ScriptEvent.method1406(var6, 13, (byte)4);
               break;
            case 1012:
               ScriptEvent.method1406(var6, 14, (byte)-97);
         }

         class141.runScriptEvent(var6, 1856325427);
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "vs.cb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gm")
   public void method11444() {
      WorldMapRegion.WorldMapRegion_cachedSprites.clear();
   }

   @ObfuscatedSignature(descriptor = "(IIIIIB)V")
   @ObfuscatedName("aa")
   void drawLoading(int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         byte var7 = 20;
         int var8 = var3 / 2 + var1;
         int var9 = var4 / 2 + var2 - 18 - var7;
         Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
         Rasterizer2D.Rasterizer2D_drawRectangle(var8 - 152, var9, 304, 34, -65536);
         Rasterizer2D.Rasterizer2D_fillRectangle(var8 - 150, 2 + var9, var5 * 3, 30, -65536);
         FadeOutTask.method10363(this.font, Strings.field5162, var8, var7 + var9, -1, -1);
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "vs.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvs;IIIIIII)Z")
   @ObfuscatedName("mu")
   public static boolean method11448(WorldMap var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var0 == null) {
         var0.method11453(var1, var1, var1, var1, var1, var1, var1);
      }

      try {
         if (null == var0.sprite) {
            if (var7 <= -1956925709) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            if (var1 == var0.sprite.subWidth) {
               if (var7 <= -1956925709) {
                  throw new IllegalStateException();
               }

               if (var2 == var0.sprite.subHeight) {
                  if (var0.worldMapDisplayWidth * 90135311 != 168937541 * var0.worldMapRenderer.pixelsPerTile) {
                     if (var7 <= -1956925709) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if (var0.worldMapDisplayY * -1049476409 != client.field710 * 1954026687) {
                     if (var7 <= -1956925709) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if (var3 <= 0) {
                     if (var7 <= -1956925709) {
                        throw new IllegalStateException();
                     }

                     if (var4 <= 0) {
                        if (var1 + var3 >= var5) {
                           if (var7 <= -1956925709) {
                              throw new IllegalStateException();
                           }

                           if (var2 + var4 >= var6) {
                              return false;
                           }

                           if (var7 <= -1956925709) {
                              throw new IllegalStateException();
                           }
                        }

                        return true;
                     }

                     if (var7 <= -1956925709) {
                        throw new IllegalStateException();
                     }
                  }

                  return true;
               }

               if (var7 <= -1956925709) {
                  throw new IllegalStateException();
               }
            }

            return true;
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "vs.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)F")
   @ObfuscatedName("aq")
   float getZoomFromPercentage(int var1, int var2) {
      try {
         if (25 == var1) {
            if (var2 >= 831964661) {
               throw new IllegalStateException();
            } else {
               return 1.0F;
            }
         } else if (37 == var1) {
            if (var2 >= 831964661) {
               throw new IllegalStateException();
            } else {
               return 1.5F;
            }
         } else if (50 == var1) {
            if (var2 >= 831964661) {
               throw new IllegalStateException();
            } else {
               return 2.0F;
            }
         } else if (var1 == 75) {
            if (var2 >= 831964661) {
               throw new IllegalStateException();
            } else {
               return 3.0F;
            }
         } else {
            return 100 == var1 ? 4.0F : 8.0F;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vs.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("qg")
   public int method11572() {
      return this.field6243 * 1809736341;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("be")
   public int getZoomLevel(byte var1) {
      try {
         if (1.0 == this.zoomTarget) {
            if (var1 >= 61) {
               throw new IllegalStateException();
            } else {
               return 25;
            }
         } else if (this.zoomTarget == 1.5) {
            if (var1 >= 61) {
               throw new IllegalStateException();
            } else {
               return 37;
            }
         } else if (2.0 == this.zoomTarget) {
            if (var1 >= 61) {
               throw new IllegalStateException();
            } else {
               return 50;
            }
         } else if (3.0 == this.zoomTarget) {
            if (var1 >= 61) {
               throw new IllegalStateException();
            } else {
               return 75;
            }
         } else if (4.0 == this.zoomTarget) {
            if (var1 >= 61) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            return 200;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.be(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   public int method11573() {
      return this.minCachedTileX * 1325693167;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ad")
   public void setCurrentMapAreaId(int var1, int var2) {
      try {
         this.zoomTarget = this.getZoomFromPercentage(var1, 130822462);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vs.bo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("bw")
   public void resetMaxFlashCount(byte var1) {
      try {
         this.cacheLoader.load(-813557134);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.bg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvs;I)Lms;")
   @ObfuscatedName("rw")
   public static AbstractWorldMapIcon method11563(WorldMap var0, int var1) {
      if (var0 == null) {
         return var0.iconNext(var1);
      } else {
         try {
            if (!var0.cacheLoader.isLoaded(-30632799)) {
               if (var1 != 1905763545) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else if (!var0.worldMapRenderer.isLoaded(-1016945015)) {
               if (var1 != 1905763545) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               HashMap var2 = var0.worldMapRenderer.buildIcons(-1403433911);
               var0.field6283 = new LinkedList();
               Iterator var3 = var2.values().iterator();

               while (var3.hasNext()) {
                  if (var1 != 1905763545) {
                     throw new IllegalStateException();
                  }

                  List var4 = (List)var3.next();
                  var0.field6283.addAll(var4);
               }

               var0.iconIterator = var0.field6283.iterator();
               return var0.iconStart(-378729766);
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "vs.ck(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("gr")
   public boolean method11474(int var1) {
      try {
         return this.cacheLoader.isLoaded(-1041580456);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.bs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bm")
   public void jumpToSourceCoordInstant(int var1, int var2, int var3, int var4) {
      if (this.cacheLoader.isLoaded(1000575465)) {
         if (!this.worldMapRenderer.isLoaded(517259706)) {
            this.worldMapRenderer.method7126(this.WorldMap_groundArchive, this.mainMapArea.getInternalName(268435520), client.isMembersWorld, -1996224089);
            if (!this.worldMapRenderer.isLoaded(2077977008)) {
               return;
            }
         }

         WorldMapRenderer.method7142(
            this.worldMapRenderer, var1, var2, var3, var4, this.flashingElements, this.maxFlashCount * -942155261, -393313075 * this.field6245, -1470025237
         );
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;Lqm;Lqm;Lqm;Lsu;Ljava/util/HashMap;[Lxm;)V")
   @ObfuscatedName("ys")
   public static void method11367(
      WorldMap var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6
   ) {
      if (var0 == null) {
         var0.method11565();
      }

      var0.mapSceneSprites = var6;
      var0.WorldMap_groundArchive = var1;
      var0.WorldMap_archive = var2;
      var0.WorldMap_geographyArchive = var3;
      var0.font = var4;
      var0.fonts = new HashMap();
      var0.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11));
      var0.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13));
      var0.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15));
      var0.cacheLoader = new WorldMapArchiveLoader(var1);
      int var7 = var0.WorldMap_groundArchive.groupLoadPercentByName(WorldMapCacheName.field3834.name, (byte)96);
      int[] var8 = AbstractArchive.method8992(var0.WorldMap_groundArchive, var7, -1775968255);
      int var9 = var8 == null ? 0 : var8.length;
      var0.details = new HashMap(var9);

      for (int var10 = 0; var10 < var9; var10++) {
         Buffer var11 = new Buffer(var0.WorldMap_groundArchive.getFile(var7, var8[var10], 38389428));
         WorldMapArea var12 = new WorldMapArea();
         WorldMapArea.method6905(var12, var11, var8[var10], (byte)103);
         var0.details.put(var12.getInternalName(268435520), var12);
         if (var12.getIsMain(1599863785)) {
            var0.field6286 = var12;
         }
      }

      var0.setCurrentMapArea(var0.field6286, 1711583028);
      var0.currentMapArea = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;IIII)V")
   @ObfuscatedName("mb")
   public static void method11460(WorldMap var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method11516();
      }

      if (var0.cacheLoader.isLoaded(-1575808274)) {
         if (!var0.worldMapRenderer.isLoaded(685477173)) {
            var0.worldMapRenderer.method7126(var0.WorldMap_groundArchive, var0.mainMapArea.getInternalName(268435520), client.isMembersWorld, -1989476887);
            if (!var0.worldMapRenderer.isLoaded(-375490734)) {
               return;
            }
         }

         WorldMapRenderer.method7142(
            var0.worldMapRenderer, var1, var2, var3, var4, var0.flashingElements, var0.maxFlashCount * -1862993161, -393313075 * var0.field6245, -1142824059
         );
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dc")
   final void method11401() {
      this.minCachedTileY = 969746873;
      this.cyclesPerFlash = -1333966893;
      this.worldMapTargetX = -696675125;
      this.field6247 = 904391371;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("eh")
   public void method11486(int var1, int var2, int var3, int var4) {
      try {
         if (null != this.mainMapArea) {
            int[] var5 = WorldMapArea.method6923(this.mainMapArea, var1, var2, var3, 2058321096);
            if (var5 != null) {
               if (var4 == -2112072413) {
                  throw new IllegalStateException();
               }

               method11482(this, var5[0], var5[1], (byte)33);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "vs.bm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZZ)V")
   @ObfuscatedName("cf")
   public void method11378(int var1, int var2, boolean var3, boolean var4) {
      long var5;
      label42: {
         var5 = ParamComposition.method4949((byte)15);
         this.method11384(var1, var2, var4, var5);
         if (!this.hasTarget(-1075583873) && (var4 || var3)) {
            boolean var7 = client.clickedWidget != null;
            if (!var7) {
               if (var4) {
                  this.cyclesPerFlash = var1 * 1333966893;
                  this.minCachedTileY = -969746873 * var2;
                  this.field6247 = 1635372181 * this.field6278;
                  this.worldMapTargetX = 672358013 * this.worldMapTargetY;
               }

               if (this.field6247 * -911256291 != -1) {
                  int var8 = var1 - this.cyclesPerFlash * -708290651;
                  int var9 = var2 - 1388311415 * this.minCachedTileY;
                  method11396(
                     this,
                     -911256291 * this.field6247 - (int)(var8 / this.zoomTarget),
                     this.worldMapTargetX * 1535037213 + (int)(var9 / this.zoomTarget),
                     false,
                     -296597579
                  );
               }
               break label42;
            }
         }

         method11403(this, (byte)1);
      }

      if (var4) {
         this.field6279 = 7903547019418784317L * var5;
         this.worldMapDisplayHeight = -1281124863 * var1;
         this.field6275 = var2 * -280459117;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gc")
   public void method11540(boolean var1) {
      this.elementsDisabled = !var1;
   }

   @ObfuscatedSignature(descriptor = "(B)Loj;")
   @ObfuscatedName("bu")
   public Coord getDisplayCoord(byte var1) {
      try {
         if (null == this.mainMapArea) {
            if (var1 <= 4) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return this.mainMapArea.coord(this.getDisplayX(-1260134904), method11492(this, (byte)43), (byte)73);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.bu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("bi")
   public int getDisplayHeight(byte var1) {
      try {
         return this.field6241 * 2062397631;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.bi(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fb")
   public void method11514() {
      this.field6245 = -1701080838;
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("bd")
   public void setPerpetualFlash(boolean var1, int var2) {
      try {
         this.perpetualFlash = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vs.bd(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;II)Lrx;")
   @ObfuscatedName("zm")
   public static ProjectionCoord method11385(WorldEntity var0, int var1, int var2) {
      if (var0 == null) {
         var0.method10818();
      }

      class456 var3 = BuddyRankComparator.method3976(-814754263);
      TransformationMatrix var4 = SecureUrlRequester.method3893(1008017523);
      var3.field5516.method9303(class6.method119(var0.worldEntityCoord.getX(1992491043), 339680734), 0.0F, 0.0F, -1574760321);
      var3.field5515.method9868(var0.worldEntityCoord.getY(-1806891694), 0.0F, var0.worldEntityCoord.getZ(1990974176), -723246400);
      var1 -= WorldEntity.method10852(var0, -1625881967);
      var2 -= var0.method10855(2131959522);
      var4.method10017(var3, (byte)89);
      var3.method9422((short)5720);
      ProjectionCoord var5 = var4.method9992(var1, 0.0F, var2, 1090173190);
      TransformationMatrix.method9929(var4, (byte)1);
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bn")
   public void resetCyclesPerFlash(int var1) {
      try {
         this.field6245 = -1701080838;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.bn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ao")
   public void drawOverview(int var1, int var2, int var3, int var4, int var5) {
      try {
         if (this.cacheLoader.isLoaded(938492482)) {
            if (!this.worldMapRenderer.isLoaded(-1162838980)) {
               this.worldMapRenderer.method7126(this.WorldMap_groundArchive, this.mainMapArea.getInternalName(268435520), client.isMembersWorld, -1951990473);
               if (!this.worldMapRenderer.isLoaded(-365776931)) {
                  return;
               }
            }

            WorldMapRenderer.method7142(
               this.worldMapRenderer, var1, var2, var3, var4, this.flashingElements, this.maxFlashCount * -942155261, -393313075 * this.field6245, -455850344
            );
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "vs.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("br")
   public void flashElement(int var1, byte var2) {
      try {
         this.flashingElements = new HashSet();
         this.flashingElements.add(var1);
         this.cachedPixelsPerTile = 0;
         this.maxFlashCount = 0;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vs.br(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bo")
   public void setZoomPercentage(int var1, int var2) {
      try {
         this.flashingElements = new HashSet();
         this.cachedPixelsPerTile = 0;
         this.maxFlashCount = 0;

         for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count * 143164541; var3++) {
            if (var2 == 1716890329) {
               return;
            }

            if (class463.WorldMapElement_get(var3, (byte)0) == null) {
               if (var2 == 1716890329) {
                  return;
               }
            } else if (class463.WorldMapElement_get(var3, (byte)0).category * -629421571 == var1) {
               this.flashingElements.add(class463.WorldMapElement_get(var3, (byte)0).objectId * 348284615);
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vs.bh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ba")
   public int getDisplayWith(int var1) {
      try {
         return -508056495 * this.field6240;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.ba(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("bx")
   public boolean getElementsDisabled(byte var1) {
      try {
         boolean var10000;
         if (!this.elementsDisabled) {
            if (var1 <= 63) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.bx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("ct")
   public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (!this.cacheLoader.isLoaded(986535913)) {
            if (var7 <= 1108377633) {
               throw new IllegalStateException();
            }
         } else {
            int var8 = (int)Math.ceil(var3 / this.zoom);
            int var9 = (int)Math.ceil(var4 / this.zoom);
            List var10 = WorldMapRenderer.method7145(
               this.worldMapRenderer,
               1385473505 * this.field6278 - var8 / 2 - 1,
               605996841 * this.worldMapTargetY - var9 / 2 - 1,
               var8 / 2 + this.field6278 * 1385473505 + 1,
               1 + this.worldMapTargetY * 605996841 + var9 / 2,
               var1,
               var2,
               var3,
               var4,
               var5,
               var6,
               -107374225
            );
            if (var10.isEmpty()) {
               if (var7 <= 1108377633) {
                  throw new IllegalStateException();
               }
            } else {
               Iterator var11 = var10.iterator();

               while (var11.hasNext()) {
                  if (var7 <= 1108377633) {
                     throw new IllegalStateException();
                  }

                  AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next();
                  WorldMapElement var13 = class463.WorldMapElement_get(var12.getElement(-1208594876), (byte)0);
                  boolean var14 = false;

                  for (int var15 = this.menuOpcodes.length - 1; var15 >= 0; var15--) {
                     if (var7 <= 1108377633) {
                        return;
                     }

                     if (null != var13.menuActions[var15]) {
                        if (var7 <= 1108377633) {
                           return;
                        }

                        client.insertMenuItemNoShift(
                           var13.menuActions[var15],
                           var13.name,
                           this.menuOpcodes[var15],
                           var12.getElement(-1689964372),
                           var12.coord1.packed(769917551),
                           var12.coord2.packed(781335460),
                           961779449
                        );
                        var14 = true;
                     }
                  }

                  if (var14) {
                     if (var7 <= 1108377633) {
                        throw new IllegalStateException();
                     }

                     return;
                  }
               }
            }
         }
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "vs.ct(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ch")
   public boolean isElementDisabled(int var1, int var2) {
      try {
         boolean var10000;
         if (!this.enabledElements.contains(var1)) {
            if (var2 <= 1445175755) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vs.ch(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ce")
   public boolean isCategoryDisabled(int var1, int var2) {
      try {
         boolean var10000;
         if (!this.enabledCategories.contains(var1)) {
            if (var2 <= -1547983287) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vs.ce(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;III)Lla;")
   @ObfuscatedName("fp")
   public static WorldMapArea method11409(WorldMap var0, int var1, int var2, int var3) {
      for (WorldMapArea var5 : var0.details.values()) {
         if (var5.containsCoord(var1, var2, var3, 2136870681)) {
            return var5;
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ft")
   public void method11487(int var1, int var2, int var3) {
      if (null != this.mainMapArea) {
         int[] var4 = WorldMapArea.method6923(this.mainMapArea, var1, var2, var3, 2141618755);
         if (var4 != null) {
            method11482(this, var4[0], var4[1], (byte)123);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvs;B)I")
   @ObfuscatedName("la")
   public static int method11492(WorldMap var0, byte var1) {
      if (var0 == null) {
         return var0.getDisplayY(var1);
      } else {
         try {
            if (null == var0.mainMapArea) {
               if (var1 == 32) {
                  throw new IllegalStateException();
               } else {
                  return -1;
               }
            } else {
               return var0.worldMapTargetY * 605996841 + WorldMapArea.method6961(var0.mainMapArea, (byte)91) * 64;
            }
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "vs.bt(" + 41);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;II)V")
   @ObfuscatedName("yh")
   public static void method11477(WorldMap var0, int var1, int var2) {
      if (var0.mainMapArea != null && var0.mainMapArea.containsPosition(var1, var2, (byte)-51)) {
         var0.field6238 = (var1 - var0.mainMapArea.getRegionLowX(-2000533580) * 64) * 1482342113;
         var0.minCachedTileX = (var2 - WorldMapArea.method6961(var0.mainMapArea, (byte)-18) * 64) * 2104342031;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIID)V")
   @ObfuscatedName("ek")
   public void method11437(int var1, int var2, int var3, int var4, int var5, double var6) {
      try {
         int[] var8 = new int[4];
         Rasterizer2D.Rasterizer2D_getClipArray(var8);
         Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var4 + var2);
         int var9 = this.cacheLoader.getPercentLoaded((byte)15);
         if (var9 < 100) {
            this.drawLoading(var1, var2, var3, var4, var9, (byte)-75);
         } else {
            if (!this.worldMapRenderer.isLoaded(492956248)) {
               this.worldMapRenderer.method7126(this.WorldMap_groundArchive, this.mainMapArea.getInternalName(268435520), client.isMembersWorld, -1888442170);
               if (!this.worldMapRenderer.isLoaded(1593013091)) {
                  return;
               }
            }

            int var11 = this.worldMapRenderer.method7157(-814506674);
            double var12 = (var11 >> 16 & 0xFF) / 256.0;
            double var14 = (var11 >> 8 & 0xFF) / 256.0;
            double var16 = (var11 & 0xFF) / 256.0;
            var12 = Math.pow(var12, var6);
            var14 = Math.pow(var14, var6);
            var16 = Math.pow(var16, var6);
            int var18 = (int)(var12 * 256.0);
            int var19 = (int)(var14 * 256.0);
            int var20 = (int)(var16 * 256.0);
            int var10 = var20 + -16777216 + (var18 << 16) + (var19 << 8);
            Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var10);
            if (null != this.flashingElements) {
               this.maxFlashCount += -1378148181;
               if (this.maxFlashCount * -942155261 % (this.field6245 * -393313075) == 0) {
                  this.maxFlashCount = 0;
                  this.cachedPixelsPerTile += 1630090091;
               }

               if (-1942724285 * this.cachedPixelsPerTile >= this.worldMapDisplayX * -737109373 && !this.perpetualFlash) {
                  this.flashingElements = null;
               }
            }

            int var13 = (int)Math.ceil(var3 / this.zoom);
            int var24 = (int)Math.ceil(var4 / this.zoom);
            double var15 = Rasterizer3D.method5835();
            this.worldMapRenderer
               .drawTiles(
                  this.field6278 * 1385473505 - var13 / 2,
                  this.worldMapTargetY * 605996841 - var24 / 2,
                  this.field6278 * 1385473505 + var13 / 2,
                  var24 / 2 + this.worldMapTargetY * 605996841,
                  var1,
                  var2,
                  var3 + var1,
                  var4 + var2,
                  (byte)0
               );
            if (!this.elementsDisabled) {
               boolean var17 = false;
               if (var5 - 841975307 * this.centerTileY > 100) {
                  this.centerTileY = var5 * 1580488099;
                  var17 = true;
               }

               this.worldMapRenderer
                  .drawElements(
                     1385473505 * this.field6278 - var13 / 2,
                     this.worldMapTargetY * 605996841 - var24 / 2,
                     var13 / 2 + this.field6278 * 1385473505,
                     605996841 * this.worldMapTargetY + var24 / 2,
                     var1,
                     var2,
                     var1 + var3,
                     var4 + var2,
                     this.field6258,
                     this.flashingElements,
                     this.maxFlashCount * -942155261,
                     this.field6245 * -393313075,
                     var17,
                     2136374336
                  );
            }

            method11454(this, var1, var2, var3, var4, var13, var24, (byte)-36);
            boolean var26 = 427594063 * client.staffModLevel >= 2;
            if (var26 && this.showCoord && null != this.mouseCoord) {
               this.font
                  .method10402("Coord: " + this.mouseCoord, 10 + Rasterizer2D.Rasterizer2D_xClipStart, 20 + Rasterizer2D.Rasterizer2D_yClipStart, 16776960, -1);
            }

            this.field6240 = -1587995471 * var13;
            this.field6241 = 1562230591 * var24;
            this.flashCount = var1 * -1630793649;
            this.field6243 = var2 * 1102469309;
            Rasterizer2D.Rasterizer2D_setClipArray(var8);
            if (var15 != Rasterizer3D.method5835()) {
               Rasterizer3D.buildPalette(var15);
            }
         }
      } catch (RuntimeException var21) {
         throw RestClientThreadFactory.newRunException(var21, "vs.ah(" + ')');
      }
   }

   public WorldMap() {
      this.field6264 = new HashSet();
      this.field6238 = -1482342113;
      this.minCachedTileX = -2104342031;
      this.field6240 = 1587995471;
      this.field6241 = -1562230591;
      this.flashCount = 1630793649;
      this.field6243 = -1102469309;
      this.worldMapDisplayX = 348916865;
      this.field6245 = -1701080838;
      this.perpetualFlash = false;
      this.flashingElements = null;
      this.cachedPixelsPerTile = -1630090091;
      this.maxFlashCount = 1378148181;
      this.field6247 = 904391371;
      this.worldMapTargetX = -696675125;
      this.cyclesPerFlash = -1333966893;
      this.minCachedTileY = 969746873;
      this.field6254 = true;
      this.enabledElements = new HashSet();
      this.enabledCategories = new HashSet();
      this.enabledElementIds = new HashSet();
      this.field6258 = new HashSet();
      this.elementsDisabled = false;
      this.centerTileY = 0;
      this.mouseCoord = null;
      this.flashCycle = 231121029;
      this.centerTileX = 21912291;
      this.worldMapDisplayY = 1688215817;
   }

   @ObfuscatedSignature(descriptor = "(I)Lla;")
   @ObfuscatedName("fh")
   public WorldMapArea method11475(int var1) {
      for (WorldMapArea var3 : this.details.values()) {
         if (WorldMapArea.method6931(var3, -2085459950) == var1) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(I)Lms;")
   @ObfuscatedName("ck")
   public AbstractWorldMapIcon iconStart(int var1) {
      try {
         if (this.iconIterator == null) {
            if (var1 == -434199641) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            while (this.iconIterator.hasNext()) {
               if (var1 == -434199641) {
                  throw new IllegalStateException();
               }

               AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)this.iconIterator.next();
               if (var2.getElement(386364357) != -1) {
                  return var2;
               }
            }

            return null;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vs.cc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("gl")
   public void method11536(int var1, boolean var2) {
      if (!var2) {
         this.enabledCategories.add(var1);
      } else {
         this.enabledCategories.remove(var1);
      }

      for (int var3 = 0; var3 < 1194578940 * WorldMapElement.WorldMapElement_count; var3++) {
         if (class463.WorldMapElement_get(var3, (byte)0) != null && class463.WorldMapElement_get(var3, (byte)0).category * -629421571 == var1) {
            int var4 = class463.WorldMapElement_get(var3, (byte)0).objectId * 348284615;
            if (!var2) {
               this.enabledElementIds.add(var4);
            } else {
               this.enabledElementIds.remove(var4);
            }
         }
      }

      this.method11550(-362186823);
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("gl")
   public void method11574(int var1, int var2, boolean var3) {
      method11396(this, var1, var2, var3, -147167940);
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("gh")
   public void method11537(int var1, boolean var2) {
      if (!var2) {
         this.enabledCategories.add(var1);
      } else {
         this.enabledCategories.remove(var1);
      }

      for (int var3 = 0; var3 < 143164541 * WorldMapElement.WorldMapElement_count; var3++) {
         if (class463.WorldMapElement_get(var3, (byte)0) != null && class463.WorldMapElement_get(var3, (byte)0).category * -629421571 == var1) {
            int var4 = class463.WorldMapElement_get(var3, (byte)0).objectId * 348284615;
            if (!var2) {
               this.enabledElementIds.add(var4);
            } else {
               this.enabledElementIds.remove(var4);
            }
         }
      }

      this.method11550(-362186823);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gd")
   public void method11373() {
      DemotingHashTable.method7417(WorldMapRegion.WorldMapRegion_cachedSprites, 5);
   }

   @ObfuscatedSignature(descriptor = "(IIZIIII)V")
   @ObfuscatedName("cg")
   public void method11375(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.cacheLoader.isLoaded(441732099)) {
         this.smoothZoom(447628106);
         this.scrollToTarget((byte)64);
         if (var3) {
            int var8 = (int)Math.ceil(var6 / this.zoom);
            int var9 = (int)Math.ceil(var7 / this.zoom);
            List var10 = WorldMapRenderer.method7145(
               this.worldMapRenderer,
               392148785 * this.field6278 - var8 / 2 - 1,
               this.worldMapTargetY * -807409700 - var9 / 2 - 1,
               1 + -2031948334 * this.field6278 + var8 / 2,
               var9 / 2 + 1351451762 * this.worldMapTargetY + 1,
               var4,
               var5,
               var6,
               var7,
               var1,
               var2,
               -2012079682
            );
            HashSet var11 = new HashSet();

            for (AbstractWorldMapIcon var13 : var10) {
               var11.add(var13);
               ScriptEvent var14 = new ScriptEvent();
               WorldMapEvent var15 = new WorldMapEvent(var13.getElement(123401073), var13.coord1, var13.coord2);
               var14.setArgs(new Object[]{var15, var1, var2}, 2058345666);
               if (this.field6264.contains(var13)) {
                  ScriptEvent.method1406(var14, 17, (byte)-16);
               } else {
                  ScriptEvent.method1406(var14, 15, (byte)-25);
               }

               class141.runScriptEvent(var14, 1856325427);
            }

            for (AbstractWorldMapIcon var17 : this.field6264) {
               if (!var11.contains(var17)) {
                  ScriptEvent var18 = new ScriptEvent();
                  WorldMapEvent var19 = new WorldMapEvent(var17.getElement(887655639), var17.coord1, var17.coord2);
                  var18.setArgs(new Object[]{var19, var1, var2}, 872073330);
                  ScriptEvent.method1406(var18, 16, (byte)-20);
                  class141.runScriptEvent(var18, 1856325427);
               }
            }

            this.field6264 = var11;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZIIII)V")
   @ObfuscatedName("cp")
   public void method11376(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.cacheLoader.isLoaded(-1551588660)) {
         this.smoothZoom(-1587577167);
         this.scrollToTarget((byte)-69);
         if (var3) {
            int var8 = (int)Math.ceil(var6 / this.zoom);
            int var9 = (int)Math.ceil(var7 / this.zoom);
            List var10 = WorldMapRenderer.method7145(
               this.worldMapRenderer,
               1385473505 * this.field6278 - var8 / 2 - 1,
               this.worldMapTargetY * 605996841 - var9 / 2 - 1,
               1 + 1385473505 * this.field6278 + var8 / 2,
               var9 / 2 + 605996841 * this.worldMapTargetY + 1,
               var4,
               var5,
               var6,
               var7,
               var1,
               var2,
               -426980277
            );
            HashSet var11 = new HashSet();

            for (AbstractWorldMapIcon var13 : var10) {
               var11.add(var13);
               ScriptEvent var14 = new ScriptEvent();
               WorldMapEvent var15 = new WorldMapEvent(var13.getElement(-192464781), var13.coord1, var13.coord2);
               var14.setArgs(new Object[]{var15, var1, var2}, 1419197751);
               if (this.field6264.contains(var13)) {
                  ScriptEvent.method1406(var14, 17, (byte)-111);
               } else {
                  ScriptEvent.method1406(var14, 15, (byte)-84);
               }

               class141.runScriptEvent(var14, 1856325427);
            }

            for (AbstractWorldMapIcon var17 : this.field6264) {
               if (!var11.contains(var17)) {
                  ScriptEvent var18 = new ScriptEvent();
                  WorldMapEvent var19 = new WorldMapEvent(var17.getElement(1616273364), var17.coord1, var17.coord2);
                  var18.setArgs(new Object[]{var19, var1, var2}, 1682147666);
                  ScriptEvent.method1406(var18, 16, (byte)-41);
                  class141.runScriptEvent(var18, 1856325427);
               }
            }

            this.field6264 = var11;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cp")
   public int method11575() {
      return this.field6278 * 1385473505;
   }

   @ObfuscatedSignature(descriptor = "(IIZZ)V")
   @ObfuscatedName("cd")
   public void method11379(int var1, int var2, boolean var3, boolean var4) {
      long var5;
      label45: {
         var5 = ParamComposition.method4949((byte)15);
         this.method11384(var1, var2, var4, var5);
         if (!this.hasTarget(-960495148) && (var4 || var3)) {
            boolean var7 = client.clickedWidget != null;
            if (!var7) {
               if (var4) {
                  this.cyclesPerFlash = var1 * 1333966893;
                  this.minCachedTileY = -667374258 * var2;
                  this.field6247 = -1715428952 * this.field6278;
                  this.worldMapTargetX = -480861163 * this.worldMapTargetY;
               }

               if (this.field6247 * -2097026790 != -1) {
                  int var8 = var1 - this.cyclesPerFlash * -708290651;
                  int var9 = var2 - 1715045304 * this.minCachedTileY;
                  method11396(
                     this,
                     1350645113 * this.field6247 - (int)(var8 / this.zoomTarget),
                     this.worldMapTargetX * -93733276 + (int)(var9 / this.zoomTarget),
                     false,
                     -1020284061
                  );
               }
               break label45;
            }
         }

         method11403(this, (byte)1);
      }

      if (var4) {
         this.field6279 = 7903547019418784317L * var5;
         this.worldMapDisplayHeight = -1281124863 * var1;
         this.field6275 = var2 * -280459117;
      }
   }

   public void initializeWorldMap(WorldMapData var1) {
      this.initializeWorldMap((WorldMapArea)var1, (byte)-88);
   }

   @ObfuscatedSignature(descriptor = "(Lvs;IIZI)V")
   @ObfuscatedName("oc")
   public static void method11396(WorldMap var0, int var1, int var2, boolean var3, int var4) {
      if (var0 == null) {
         var0.setWorldMapPosition(var1, var1, var3, var1);
      } else {
         try {
            var0.field6278 = -408003039 * var1;
            var0.worldMapTargetY = 1599915289 * var2;
            ParamComposition.method4949((byte)15);
            if (var3) {
               method11403(var0, (byte)1);
            }
         } catch (RuntimeException var5) {
            throw RestClientThreadFactory.newRunException(var5, "vs.aw(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fn")
   public void method11516() {
      this.field6245 = -1701080838;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("yk")
   public int method11576() {
      return this.field6238 * -2014116575;
   }

   @ObfuscatedSignature(descriptor = "(IIZZ)V")
   @ObfuscatedName("ci")
   public void method11380(int var1, int var2, boolean var3, boolean var4) {
      long var5;
      label50: {
         var5 = ParamComposition.method4949((byte)15);
         this.method11384(var1, var2, var4, var5);
         if (!this.hasTarget(-1955329979) && (var4 || var3)) {
            boolean var7 = client.clickedWidget != null;
            if (!var7) {
               if (var4) {
                  this.cyclesPerFlash = var1 * -101244093;
                  this.minCachedTileY = -726276309 * var2;
                  this.field6247 = -1345291600 * this.field6278;
                  this.worldMapTargetX = 672358013 * this.worldMapTargetY;
               }

               if (this.field6247 * -1056512548 != -1) {
                  int var8 = var1 - this.cyclesPerFlash * -1009783116;
                  int var9 = var2 - 1388311415 * this.minCachedTileY;
                  method11396(
                     this,
                     -911256291 * this.field6247 - (int)(var8 / this.zoomTarget),
                     this.worldMapTargetX * 1535037213 + (int)(var9 / this.zoomTarget),
                     false,
                     -1034396965
                  );
               }
               break label50;
            }
         }

         method11403(this, (byte)1);
      }

      if (var4) {
         this.field6279 = 7903547019418784317L * var5;
         this.worldMapDisplayHeight = 1806194045 * var1;
         this.field6275 = var2 * -1131405132;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZZ)V")
   @ObfuscatedName("cy")
   public void method11381(int var1, int var2, boolean var3, boolean var4) {
      long var5;
      label45: {
         var5 = ParamComposition.method4949((byte)15);
         this.method11384(var1, var2, var4, var5);
         if (!this.hasTarget(1529512836) && (var4 || var3)) {
            boolean var7 = client.clickedWidget != null;
            if (!var7) {
               if (var4) {
                  this.cyclesPerFlash = var1 * 1333966893;
                  this.minCachedTileY = -969746873 * var2;
                  this.field6247 = 1635372181 * this.field6278;
                  this.worldMapTargetX = 672358013 * this.worldMapTargetY;
               }

               if (this.field6247 * -911256291 != -1) {
                  int var8 = var1 - this.cyclesPerFlash * -708290651;
                  int var9 = var2 - 1388311415 * this.minCachedTileY;
                  method11396(
                     this,
                     -911256291 * this.field6247 - (int)(var8 / this.zoomTarget),
                     this.worldMapTargetX * 1535037213 + (int)(var9 / this.zoomTarget),
                     false,
                     -1238538612
                  );
               }
               break label45;
            }
         }

         method11403(this, (byte)1);
      }

      if (var4) {
         this.field6279 = 7903547019418784317L * var5;
         this.worldMapDisplayHeight = -1281124863 * var1;
         this.field6275 = var2 * -280459117;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZJ)V")
   @ObfuscatedName("cq")
   void method11383(int var1, int var2, boolean var3, long var4) {
      if (this.mainMapArea != null) {
         int var6 = (int)(13268879 * this.field6278 + (var1 - this.flashCount * 87099055 - this.getDisplayWith(-2000922676) * this.zoom / 2.0F) / this.zoom);
         int var7 = (int)(
            605996841 * this.worldMapTargetY - (var2 - -400929633 * this.field6243 - this.getDisplayHeight((byte)69) * this.zoom / 2.0F) / this.zoom
         );
         this.mouseCoord = this.mainMapArea
            .coord(
               var6 + this.mainMapArea.getRegionLowX(-1986154476) * -1449096243,
               var7 + WorldMapArea.method6961(this.mainMapArea, (byte)29) * -1862754664,
               (byte)96
            );
         if (null != this.mouseCoord && var3) {
            IndexCheck var8 = HttpRequest.method280((byte)1);
            boolean var9 = -618159567 * client.staffModLevel >= 2;
            if (var9 && IndexCheck.method6514(var8, 82, (short)1337) && IndexCheck.method6514(var8, 81, (short)1337)) {
               classEM.method3786(this.mouseCoord.x * -101934673, -263036313 * this.mouseCoord.y, this.mouseCoord.plane * 370217423, false, 367677811);
            } else {
               boolean var10 = true;
               if (this.field6254) {
                  int var11 = var1 - this.worldMapDisplayHeight * 272656897;
                  int var12 = var2 - 1000461723 * this.field6275;
                  if (var4 - 1871353599993697557L * this.field6279 > 500L || var11 < 1278136498 || var11 > 25 || var12 < 1009053834 || var12 > 25) {
                     var10 = false;
                  }
               }

               if (var10) {
                  PacketBufferNode var13 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3927, client.packetWriter.isaacCipher, -1207455147);
                  var13.packetBuffer.writeIntIME(this.mouseCoord.packed(-1416491271), 783375377);
                  PacketWriter.method3330(client.packetWriter, var13, -1771370198);
                  this.field6279 = 0L;
               }
            }
         }
      } else {
         this.mouseCoord = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cv")
   void method11386() {
      if (client.field1026 != null) {
         this.zoom = this.zoomTarget;
      } else {
         if (this.zoom < this.zoomTarget) {
            this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F);
         }

         if (this.zoom > this.zoomTarget) {
            this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cw")
   void method11387() {
      if (client.field1026 != null) {
         this.zoom = this.zoomTarget;
      } else {
         if (this.zoom < this.zoomTarget) {
            this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F);
         }

         if (this.zoom > this.zoomTarget) {
            this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cr")
   void method11388() {
      if (client.field1026 != null) {
         this.zoom = this.zoomTarget;
      } else {
         if (this.zoom < this.zoomTarget) {
            this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F);
         }

         if (this.zoom > this.zoomTarget) {
            this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;)V")
   @ObfuscatedName("od")
   public static void method11389(WorldMap var0) {
      if (var0 == null) {
         var0.method11565();
      }

      if (client.field1026 != null) {
         var0.zoom = var0.zoomTarget;
      } else {
         if (var0.zoom < var0.zoomTarget) {
            var0.zoom = Math.min(var0.zoomTarget, var0.zoom + var0.zoom / 30.0F);
         }

         if (var0.zoom > var0.zoomTarget) {
            var0.zoom = Math.max(var0.zoomTarget, var0.zoom - var0.zoom / 30.0F);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ca")
   void method11391() {
      if (this.hasTarget(2036380990)) {
         int var1 = this.field6238 * -2014116575 - 1385473505 * this.field6278;
         int var2 = 1325693167 * this.minCachedTileX - 605996841 * this.worldMapTargetY;
         if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (0 != var2) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         method11396(this, var1 + this.field6278 * 1385473505, this.worldMapTargetY * 605996841 + var2, true, -251578036);
         if (-2014116575 * this.field6238 == 1385473505 * this.field6278 && this.worldMapTargetY * 605996841 == 1325693167 * this.minCachedTileX) {
            this.field6238 = -1482342113;
            this.minCachedTileX = -2104342031;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cl")
   void method11392() {
      if (this.hasTarget(51752578)) {
         int var1 = this.field6238 * -2014116575 - 1385473505 * this.field6278;
         int var2 = 1325693167 * this.minCachedTileX - 605996841 * this.worldMapTargetY;
         if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (0 != var2) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         method11396(this, var1 + this.field6278 * 1385473505, this.worldMapTargetY * 605996841 + var2, true, -65876515);
         if (-2014116575 * this.field6238 == 1385473505 * this.field6278 && this.worldMapTargetY * 605996841 == 1325693167 * this.minCachedTileX) {
            this.field6238 = -1482342113;
            this.minCachedTileX = -2104342031;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dd")
   void method11393() {
      if (this.hasTarget(603391412)) {
         int var1 = this.field6238 * -2014116575 - 1789622047 * this.field6278;
         int var2 = 1325693167 * this.minCachedTileX - 605996841 * this.worldMapTargetY;
         if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (0 != var2) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         method11396(this, var1 + this.field6278 * 1385473505, this.worldMapTargetY * 605996841 + var2, true, -126490249);
         if (-2014116575 * this.field6238 == -1039549555 * this.field6278 && this.worldMapTargetY * 605996841 == 1325693167 * this.minCachedTileX) {
            this.field6238 = -1482342113;
            this.minCachedTileX = -1843099183;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("dv")
   final void method11397(int var1, int var2, boolean var3) {
      this.field6278 = -408003039 * var1;
      this.worldMapTargetY = 1599915289 * var2;
      ParamComposition.method4949((byte)15);
      if (var3) {
         method11403(this, (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "(IZI)V")
   @ObfuscatedName("bq")
   public void setCategoryDisabled(int var1, boolean var2, int var3) {
      try {
         if (!var2) {
            if (var3 == -1156191313) {
               return;
            }

            this.enabledCategories.add(var1);
         } else {
            this.enabledCategories.remove(var1);
         }

         for (int var4 = 0; var4 < 143164541 * WorldMapElement.WorldMapElement_count; var4++) {
            if (var3 == -1156191313) {
               return;
            }

            if (class463.WorldMapElement_get(var4, (byte)0) == null) {
               if (var3 == -1156191313) {
                  return;
               }
            } else if (class463.WorldMapElement_get(var4, (byte)0).category * -629421571 == var1) {
               if (var3 == -1156191313) {
                  return;
               }

               int var5 = class463.WorldMapElement_get(var4, (byte)0).objectId * 348284615;
               if (!var2) {
                  if (var3 == -1156191313) {
                     throw new IllegalStateException();
                  }

                  this.enabledElementIds.add(var5);
               } else {
                  this.enabledElementIds.remove(var5);
               }
            }
         }

         this.method11550(-362186823);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "vs.bq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dy")
   final void method11402() {
      this.minCachedTileY = 969746873;
      this.cyclesPerFlash = 996824642;
      this.worldMapTargetX = -1466600349;
      this.field6247 = 1574531058;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("bf")
   public void setCyclesPerFlash(int var1, byte var2) {
      try {
         if (var1 >= 1) {
            if (var2 >= 3) {
               throw new IllegalStateException();
            }

            this.field6245 = var1 * -1923807227;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vs.bf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvs;IIIIIIB)V")
   @ObfuscatedName("pi")
   public static void method11454(WorldMap var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      if (var0 == null) {
         var0.method11458(var1, var1, var1, var1, var1, var1, var7);
      } else {
         try {
            if (client.field1026 != null) {
               if (var7 >= 6) {
                  return;
               }

               int var8 = 512 / (var0.worldMapRenderer.pixelsPerTile * 337875082);
               int var9 = 512 + var3;
               int var10 = 512 + var4;
               float var11 = 1.0F;
               var9 = (int)(var9 / var11);
               var10 = (int)(var10 / var11);
               int var12 = var0.getDisplayX(500583151) - var5 / 2 - var8;
               int var13 = method11492(var0, (byte)-19) - var6 / 2 - var8;
               int var14 = var1 - 168937541 * var0.worldMapRenderer.pixelsPerTile * (var8 + var12 - var0.flashCycle * -1778669645);
               int var15 = var2 - (var8 - (var13 - var0.centerTileX * 1025000757)) * var0.worldMapRenderer.pixelsPerTile * 168937541;
               if (method11448(var0, var9, var10, var14, var15, var3, var4, -1301763726)) {
                  if (var7 >= 6) {
                     throw new IllegalStateException();
                  }

                  label62: {
                     if (var0.sprite != null) {
                        if (var7 >= 6) {
                           throw new IllegalStateException();
                        }

                        if (var9 == var0.sprite.subWidth) {
                           if (var7 >= 6) {
                              throw new IllegalStateException();
                           }

                           if (var0.sprite.subHeight == var10) {
                              Arrays.fill(var0.sprite.pixels, 0);
                              break label62;
                           }

                           if (var7 >= 6) {
                              return;
                           }
                        }
                     }

                     var0.sprite = new SpritePixels(var9, var10);
                  }

                  var0.flashCycle = (var0.getDisplayX(-1562952444) - var5 / 2 - var8) * -231121029;
                  var0.centerTileX = (method11492(var0, (byte)-99) - var6 / 2 - var8) * -21912291;
                  var0.worldMapDisplayWidth = var0.worldMapRenderer.pixelsPerTile * -1728989333;
                  client.field1026
                     .method9220(
                        var0.flashCycle * -1778669645, var0.centerTileX * 1025000757, var0.sprite, 90135311 * var0.worldMapDisplayWidth / var11, 16582757
                     );
                  var0.worldMapDisplayY = client.field710 * -642079159;
                  var14 = var1 - 168937541 * var0.worldMapRenderer.pixelsPerTile * (var12 + var8 - -1778669645 * var0.flashCycle);
                  var15 = var2 - (var8 - (var13 - var0.centerTileX * 1025000757)) * var0.worldMapRenderer.pixelsPerTile * 168937541;
               }

               Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
               if (var11 == 1.0F) {
                  var0.sprite.method12664(var14, var15, 192);
               } else {
                  var0.sprite.method12667(var14, var15, (int)(var9 * var11), (int)(var10 * var11), 192);
               }
            }
         } catch (RuntimeException var16) {
            throw RestClientThreadFactory.newRunException(var16, "vs.am(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cu")
   void method11550(int var1) {
      try {
         this.field6258.clear();
         this.field6258.addAll(this.enabledElements);
         this.field6258.addAll(this.enabledElementIds);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.cu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dt")
   boolean method11406() {
      return -1 != this.field6238 * -758531691 && 1648311174 * this.minCachedTileX != -1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("dh")
   boolean method11407() {
      return -1 != this.field6238 * -2014116575 && 1325693167 * this.minCachedTileX != -1;
   }

   @ObfuscatedSignature(descriptor = "()Lle;")
   @ObfuscatedName("ni")
   public WorldMapRenderer method11577() {
      return this.worldMapRenderer;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;III)V")
   @ObfuscatedName("zn")
   public static void method11436(WorldMap var0, int var1, int var2, int var3) {
      if (var0.mainMapArea != null) {
         int[] var4 = WorldMapArea.method6923(var0.mainMapArea, var1, var2, var3, 2105557474);
         if (var4 == null) {
            var4 = WorldMapArea.method6923(
               var0.mainMapArea,
               var0.mainMapArea.getOriginPlane(-1530719007),
               var0.mainMapArea.getOriginX(2089820750),
               WorldMapArea.method6976(var0.mainMapArea, (byte)-116),
               2099469832
            );
         }

         method11396(
            var0,
            var4[0] - var0.mainMapArea.getRegionLowX(-1840779501) * -639207441,
            var4[1] - WorldMapArea.method6961(var0.mainMapArea, (byte)-17) * 951922163,
            true,
            -2114176054
         );
         var0.field6238 = -1946831891;
         var0.minCachedTileX = -2104342031;
         var0.zoom = var0.getZoomFromPercentage(var0.mainMapArea.getZoom((byte)-27), -98486590);
         var0.zoomTarget = var0.zoom;
         var0.field6283 = null;
         var0.iconIterator = null;
         var0.worldMapRenderer.clearIcons(-2137413491);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lla;")
   @ObfuscatedName("dj")
   public WorldMapArea method11410(int var1, int var2, int var3) {
      for (WorldMapArea var5 : this.details.values()) {
         if (var5.containsCoord(var1, var2, var3, 2136870681)) {
            return var5;
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(ILoj;)Loj;")
   @ObfuscatedName("hx")
   public Coord method11556(int var1, Coord var2) {
      if (!this.cacheLoader.isLoaded(-2007521602)) {
         return null;
      } else if (!this.worldMapRenderer.isLoaded(1182908055)) {
         return null;
      } else if (!this.mainMapArea.containsPosition(-1931160809 * var2.x, var2.y * -263036313, (byte)29)) {
         return null;
      } else {
         HashMap var3 = this.worldMapRenderer.buildIcons(-1403433911);
         List var4 = (List)var3.get(var1);
         if (null != var4 && !var4.isEmpty()) {
            AbstractWorldMapIcon var5 = null;
            int var6 = -1;

            for (AbstractWorldMapIcon var8 : var4) {
               int var9 = var8.coord2.x * -1931160809 - var2.x * -1931160809;
               int var10 = -263036313 * var8.coord2.y - var2.y * -263036313;
               int var11 = var10 * var10 + var9 * var9;
               if (0 == var11) {
                  return var8.coord2;
               }

               if (var11 < var6 || var5 == null) {
                  var5 = var8;
                  var6 = var11;
               }
            }

            return var5.coord2;
         } else {
            return null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIZ)V")
   @ObfuscatedName("dl")
   public void method11412(int var1, int var2, int var3, boolean var4) {
      WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3, -669285781);
      if (null == var5) {
         if (!var4) {
            return;
         }

         var5 = this.field6286;
      }

      boolean var6 = false;
      if (this.currentMapArea != var5 || var4) {
         this.currentMapArea = var5;
         this.setCurrentMapArea(var5, 1711583028);
         var6 = true;
      }

      if (var6 || var4) {
         this.jump(var1, var2, var3, (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dx")
   public void method11417(int var1) {
      WorldMapArea var2 = this.getMapArea(var1, (byte)4);
      if (null != var2) {
         this.setCurrentMapArea(var2, 1711583028);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dq")
   public void method11418(int var1) {
      WorldMapArea var2 = this.getMapArea(var1, (byte)4);
      if (null != var2) {
         this.setCurrentMapArea(var2, 1711583028);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;IIIIID)V")
   @ObfuscatedName("eg")
   public static void method11438(WorldMap var0, int var1, int var2, int var3, int var4, int var5, double var6) {
      if (var0 == null) {
         var0.method11434(var1, var1, var1);
      } else {
         int[] var8 = new int[4];
         Rasterizer2D.Rasterizer2D_getClipArray(var8);
         Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var4 + var2);
         int var9 = var0.cacheLoader.getPercentLoaded((byte)15);
         if (var9 < 100) {
            var0.drawLoading(var1, var2, var3, var4, var9, (byte)-105);
         } else {
            if (!var0.worldMapRenderer.isLoaded(1712415238)) {
               var0.worldMapRenderer.method7126(var0.WorldMap_groundArchive, var0.mainMapArea.getInternalName(268435520), client.isMembersWorld, -2113786628);
               if (!var0.worldMapRenderer.isLoaded(475397406)) {
                  return;
               }
            }

            int var11 = var0.worldMapRenderer.method7157(-814506674);
            double var12 = (var11 >> 16 & 0xFF) / 256.0;
            double var14 = (var11 >> 8 & 0xFF) / 256.0;
            double var16 = (var11 & 0xFF) / 256.0;
            var12 = Math.pow(var12, var6);
            var14 = Math.pow(var14, var6);
            var16 = Math.pow(var16, var6);
            int var18 = (int)(var12 * 256.0);
            int var19 = (int)(var14 * 256.0);
            int var20 = (int)(var16 * 256.0);
            int var10 = var20 + -16777216 + (var18 << 16) + (var19 << 8);
            Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var10);
            if (null != var0.flashingElements) {
               var0.maxFlashCount += -1378148181;
               if (var0.maxFlashCount * -942155261 % (var0.field6245 * -393313075) == 0) {
                  var0.maxFlashCount = 0;
                  var0.cachedPixelsPerTile += 1630090091;
               }

               if (-1942724285 * var0.cachedPixelsPerTile >= var0.worldMapDisplayX * -737109373 && !var0.perpetualFlash) {
                  var0.flashingElements = null;
               }
            }

            int var13 = (int)Math.ceil(var3 / var0.zoom);
            int var23 = (int)Math.ceil(var4 / var0.zoom);
            double var15 = Rasterizer3D.method5835();
            var0.worldMapRenderer
               .drawTiles(
                  var0.field6278 * 1385473505 - var13 / 2,
                  var0.worldMapTargetY * 605996841 - var23 / 2,
                  var0.field6278 * 1385473505 + var13 / 2,
                  var23 / 2 + var0.worldMapTargetY * 605996841,
                  var1,
                  var2,
                  var3 + var1,
                  var4 + var2,
                  (byte)0
               );
            if (!var0.elementsDisabled) {
               boolean var17 = false;
               if (var5 - 841975307 * var0.centerTileY > 100) {
                  var0.centerTileY = var5 * 1580488099;
                  var17 = true;
               }

               var0.worldMapRenderer
                  .drawElements(
                     1385473505 * var0.field6278 - var13 / 2,
                     var0.worldMapTargetY * 605996841 - var23 / 2,
                     var13 / 2 + var0.field6278 * 1385473505,
                     605996841 * var0.worldMapTargetY + var23 / 2,
                     var1,
                     var2,
                     var1 + var3,
                     var4 + var2,
                     var0.field6258,
                     var0.flashingElements,
                     var0.maxFlashCount * -942155261,
                     var0.field6245 * -393313075,
                     var17,
                     2135760070
                  );
            }

            method11454(var0, var1, var2, var3, var4, var13, var23, (byte)-15);
            boolean var25 = 427594063 * client.staffModLevel >= 2;
            if (var25 && var0.showCoord && null != var0.mouseCoord) {
               var0.font
                  .method10402("Coord: " + var0.mouseCoord, 10 + Rasterizer2D.Rasterizer2D_xClipStart, 20 + Rasterizer2D.Rasterizer2D_yClipStart, 16776960, -1);
            }

            var0.field6240 = -1587995471 * var13;
            var0.field6241 = 1562230591 * var23;
            var0.flashCount = var1 * -1630793649;
            var0.field6243 = var2 * 1102469309;
            Rasterizer2D.Rasterizer2D_setClipArray(var8);
            if (var15 != Rasterizer3D.method5835()) {
               Rasterizer3D.buildPalette(var15);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lla;")
   @ObfuscatedName("dp")
   public WorldMapArea method11423() {
      return this.mainMapArea;
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("ed")
   float method11465(int var1) {
      if (25 == var1) {
         return 1.0F;
      } else if (37 == var1) {
         return 1.5F;
      } else if (50 == var1) {
         return 2.0F;
      } else if (var1 == -1829877403) {
         return 3.0F;
      } else {
         return 100 == var1 ? 4.0F : 8.0F;
      }
   }

   public float getWorldMapZoom() {
      return this.zoom;
   }

   @ObfuscatedSignature(descriptor = "(Lla;)V")
   @ObfuscatedName("de")
   void method11427(WorldMapArea var1) {
      if (this.mainMapArea == null || var1 != this.mainMapArea) {
         this.initializeWorldMap(var1, (byte)13);
         this.jump(-1, -1, -1, (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("df")
   final void method11398(int var1, int var2, boolean var3) {
      this.field6278 = -408003039 * var1;
      this.worldMapTargetY = 1194049082 * var2;
      ParamComposition.method4949((byte)15);
      if (var3) {
         method11403(this, (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lla;)V")
   @ObfuscatedName("dk")
   void method11429(WorldMapArea var1) {
      this.mainMapArea = var1;
      this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_archive, this.WorldMap_geographyArchive);
      this.cacheLoader.reset(this.mainMapArea == null ? null : this.mainMapArea.getInternalName(268435520), -1506087453);
   }

   @ObfuscatedSignature(descriptor = "(Lla;)V")
   @ObfuscatedName("dn")
   void method11430(WorldMapArea var1) {
      this.mainMapArea = var1;
      this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_archive, this.WorldMap_geographyArchive);
      this.cacheLoader.reset(this.mainMapArea == null ? null : this.mainMapArea.getInternalName(268435520), -1506087453);
   }

   @ObfuscatedSignature(descriptor = "(Lvs;II)V")
   @ObfuscatedName("pn")
   public static void method11505(WorldMap var0, int var1, int var2) {
      if (var0 == null) {
         var0.method11508(var1, var1);
      }

      try {
         if (var1 >= 1) {
            var0.worldMapDisplayX = var1 * 1547961387;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vs.by(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("et")
   boolean method11449(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null == this.sprite) {
         return true;
      } else if (var1 == this.sprite.subWidth && var2 == this.sprite.subHeight) {
         if (this.worldMapDisplayWidth * 90135311 != 168937541 * this.worldMapRenderer.pixelsPerTile) {
            return true;
         } else if (this.worldMapDisplayY * -1049476409 != client.field710 * 1954026687) {
            return true;
         } else {
            return var3 <= 0 && var4 <= 0 ? var1 + var3 < var5 || var2 + var4 < var6 : true;
         }
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvs;IIIZI)V")
   @ObfuscatedName("nn")
   public static void method11413(WorldMap var0, int var1, int var2, int var3, boolean var4, int var5) {
      if (var0 == null) {
         var0.method11415(var1, var1, var1, var4, var1);
      } else {
         try {
            WorldMapArea var6 = var0.mapAreaAtCoord(var1, var2, var3, 1731011168);
            if (null == var6) {
               if (var5 != -1091228177) {
                  return;
               }

               if (!var4) {
                  return;
               }

               var6 = var0.field6286;
            }

            boolean var7;
            label54: {
               var7 = false;
               if (var0.currentMapArea == var6) {
                  if (var5 != -1091228177) {
                     return;
                  }

                  if (!var4) {
                     break label54;
                  }

                  if (var5 != -1091228177) {
                     return;
                  }
               }

               var0.currentMapArea = var6;
               var0.setCurrentMapArea(var6, 1711583028);
               var7 = true;
            }

            if (!var7) {
               if (var5 != -1091228177) {
                  return;
               }

               if (!var4) {
                  return;
               }

               if (var5 != -1091228177) {
                  throw new IllegalStateException();
               }
            }

            var0.jump(var1, var2, var3, (byte)1);
         } catch (RuntimeException var8) {
            throw RestClientThreadFactory.newRunException(var8, "vs.az(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Loj;")
   @ObfuscatedName("fu")
   public Coord method11497() {
      return null == this.mainMapArea ? null : this.mainMapArea.coord(this.getDisplayX(795382767), method11492(this, (byte)-28), (byte)101);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;I)V")
   @ObfuscatedName("qn")
   public static void method11506(WorldMap var0, int var1) {
      if (var0 == null) {
         var0.method11565();
      }

      if (var1 >= 1) {
         var0.worldMapDisplayX = var1 * 1547961387;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lla;Loj;Loj;ZI)V")
   @ObfuscatedName("ax")
   public void method11432(WorldMapArea var1, Coord var2, Coord var3, boolean var4, int var5) {
      try {
         if (var1 == null) {
            if (var5 == 2108391709) {
               throw new IllegalStateException();
            }
         } else {
            label46: {
               if (null != this.mainMapArea) {
                  if (var5 == 2108391709) {
                     throw new IllegalStateException();
                  }

                  if (var1 == this.mainMapArea) {
                     break label46;
                  }

                  if (var5 == 2108391709) {
                     return;
                  }
               }

               this.initializeWorldMap(var1, (byte)61);
            }

            if (!var4) {
               if (var5 == 2108391709) {
                  throw new IllegalStateException();
               }

               if (this.mainMapArea.containsCoord(var2.plane * 370217423, var2.x * -1931160809, var2.y * -263036313, 2136870681)) {
                  this.jump(370217423 * var2.plane, var2.x * -1931160809, var2.y * -263036313, (byte)1);
                  return;
               }

               if (var5 == 2108391709) {
                  throw new IllegalStateException();
               }
            }

            this.jump(var3.plane * 370217423, var3.x * -1931160809, -263036313 * var3.y, (byte)1);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "vs.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIID)V")
   @ObfuscatedName("ef")
   public void method11439(int var1, int var2, int var3, int var4, int var5, double var6) {
      int[] var8 = new int[4];
      Rasterizer2D.Rasterizer2D_getClipArray(var8);
      Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var4 + var2);
      int var9 = this.cacheLoader.getPercentLoaded((byte)15);
      if (var9 < 100) {
         this.drawLoading(var1, var2, var3, var4, var9, (byte)-35);
      } else {
         if (!this.worldMapRenderer.isLoaded(735443219)) {
            this.worldMapRenderer.method7126(this.WorldMap_groundArchive, this.mainMapArea.getInternalName(268435520), client.isMembersWorld, -2014316367);
            if (!this.worldMapRenderer.isLoaded(1684619496)) {
               return;
            }
         }

         int var11 = this.worldMapRenderer.method7157(-814506674);
         double var12 = (var11 >> 16 & 0xFF) / 256.0;
         double var14 = (var11 >> 8 & 0xFF) / 256.0;
         double var16 = (var11 & 0xFF) / 256.0;
         var12 = Math.pow(var12, var6);
         var14 = Math.pow(var14, var6);
         var16 = Math.pow(var16, var6);
         int var18 = (int)(var12 * 256.0);
         int var19 = (int)(var14 * 256.0);
         int var20 = (int)(var16 * 256.0);
         int var10 = var20 + -16777216 + (var18 << 16) + (var19 << 8);
         Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var10);
         if (null != this.flashingElements) {
            this.maxFlashCount += -1378148181;
            if (this.maxFlashCount * -942155261 % (this.field6245 * -393313075) == 0) {
               this.maxFlashCount = 0;
               this.cachedPixelsPerTile += 1630090091;
            }

            if (-1942724285 * this.cachedPixelsPerTile >= this.worldMapDisplayX * -737109373 && !this.perpetualFlash) {
               this.flashingElements = null;
            }
         }

         int var13 = (int)Math.ceil(var3 / this.zoom);
         int var23 = (int)Math.ceil(var4 / this.zoom);
         double var15 = Rasterizer3D.method5835();
         this.worldMapRenderer
            .drawTiles(
               this.field6278 * 1385473505 - var13 / 2,
               this.worldMapTargetY * 605996841 - var23 / 2,
               this.field6278 * 1385473505 + var13 / 2,
               var23 / 2 + this.worldMapTargetY * 605996841,
               var1,
               var2,
               var3 + var1,
               var4 + var2,
               (byte)0
            );
         if (!this.elementsDisabled) {
            boolean var17 = false;
            if (var5 - 841975307 * this.centerTileY > 100) {
               this.centerTileY = var5 * 1580488099;
               var17 = true;
            }

            this.worldMapRenderer
               .drawElements(
                  1385473505 * this.field6278 - var13 / 2,
                  this.worldMapTargetY * 605996841 - var23 / 2,
                  var13 / 2 + this.field6278 * 1385473505,
                  605996841 * this.worldMapTargetY + var23 / 2,
                  var1,
                  var2,
                  var1 + var3,
                  var4 + var2,
                  this.field6258,
                  this.flashingElements,
                  this.maxFlashCount * -942155261,
                  this.field6245 * -393313075,
                  var17,
                  2110900478
               );
         }

         method11454(this, var1, var2, var3, var4, var13, var23, (byte)-113);
         boolean var25 = 427594063 * client.staffModLevel >= 2;
         if (var25 && this.showCoord && null != this.mouseCoord) {
            this.font
               .method10402("Coord: " + this.mouseCoord, 10 + Rasterizer2D.Rasterizer2D_xClipStart, 20 + Rasterizer2D.Rasterizer2D_yClipStart, 16776960, -1);
         }

         this.field6240 = -1587995471 * var13;
         this.field6241 = 1562230591 * var23;
         this.flashCount = var1 * -1630793649;
         this.field6243 = var2 * 1102469309;
         Rasterizer2D.Rasterizer2D_setClipArray(var8);
         if (var15 != Rasterizer3D.method5835()) {
            Rasterizer3D.buildPalette(var15);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIID)V")
   @ObfuscatedName("er")
   public void method11440(int var1, int var2, int var3, int var4, int var5, double var6) {
      int[] var8 = new int[4];
      Rasterizer2D.Rasterizer2D_getClipArray(var8);
      Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var4 + var2);
      int var9 = this.cacheLoader.getPercentLoaded((byte)15);
      if (var9 < 1568614565) {
         this.drawLoading(var1, var2, var3, var4, var9, (byte)-126);
      } else {
         if (!this.worldMapRenderer.isLoaded(-687995135)) {
            this.worldMapRenderer.method7126(this.WorldMap_groundArchive, this.mainMapArea.getInternalName(268435520), client.isMembersWorld, -2071058392);
            if (!this.worldMapRenderer.isLoaded(578681387)) {
               return;
            }
         }

         int var11 = this.worldMapRenderer.method7157(-814506674);
         double var12 = (var11 >> 16 & 0xFF) / 256.0;
         double var14 = (var11 >> 8 & 0xFF) / 256.0;
         double var16 = (var11 & -381097382) / 256.0;
         var12 = Math.pow(var12, var6);
         var14 = Math.pow(var14, var6);
         var16 = Math.pow(var16, var6);
         int var18 = (int)(var12 * 256.0);
         int var19 = (int)(var14 * 256.0);
         int var20 = (int)(var16 * 256.0);
         int var10 = var20 + -16777216 + (var18 << 16) + (var19 << 8);
         Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var10);
         if (null != this.flashingElements) {
            this.maxFlashCount += -1378148181;
            if (this.maxFlashCount * 671668490 % (this.field6245 * -393313075) == 0) {
               this.maxFlashCount = 0;
               this.cachedPixelsPerTile += 1630090091;
            }

            if (1841633624 * this.cachedPixelsPerTile >= this.worldMapDisplayX * -737109373 && !this.perpetualFlash) {
               this.flashingElements = null;
            }
         }

         int var13 = (int)Math.ceil(var3 / this.zoom);
         int var23 = (int)Math.ceil(var4 / this.zoom);
         double var15 = Rasterizer3D.method5835();
         this.worldMapRenderer
            .drawTiles(
               this.field6278 * 1385473505 - var13 / 2,
               this.worldMapTargetY * 605996841 - var23 / 2,
               this.field6278 * 1592516033 + var13 / 2,
               var23 / 2 + this.worldMapTargetY * 1018582338,
               var1,
               var2,
               var3 + var1,
               var4 + var2,
               (byte)0
            );
         if (!this.elementsDisabled) {
            boolean var17 = false;
            if (var5 - 1469371841 * this.centerTileY > 100) {
               this.centerTileY = var5 * -1343106826;
               var17 = true;
            }

            this.worldMapRenderer
               .drawElements(
                  -206282689 * this.field6278 - var13 / 2,
                  this.worldMapTargetY * 605996841 - var23 / 2,
                  var13 / 2 + this.field6278 * 1385473505,
                  -1377713460 * this.worldMapTargetY + var23 / 2,
                  var1,
                  var2,
                  var1 + var3,
                  var4 + var2,
                  this.field6258,
                  this.flashingElements,
                  this.maxFlashCount * 1214040912,
                  this.field6245 * -393313075,
                  var17,
                  2143411179
               );
         }

         method11454(this, var1, var2, var3, var4, var13, var23, (byte)-114);
         boolean var25 = 427594063 * client.staffModLevel >= 2;
         if (var25 && this.showCoord && null != this.mouseCoord) {
            this.font
               .method10402("Coord: " + this.mouseCoord, 10 + Rasterizer2D.Rasterizer2D_xClipStart, 20 + Rasterizer2D.Rasterizer2D_yClipStart, 16776960, -1);
         }

         this.field6240 = -1587995471 * var13;
         this.field6241 = 1562230591 * var23;
         this.flashCount = var1 * -1256475428;
         this.field6243 = var2 * 1102469309;
         Rasterizer2D.Rasterizer2D_setClipArray(var8);
         if (var15 != Rasterizer3D.method5835()) {
            Rasterizer3D.buildPalette(var15);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("bv")
   public void setElementsDisabled(boolean var1, byte var2) {
      try {
         boolean var10001;
         if (!var1) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.elementsDisabled = var10001;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vs.bv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IZB)V")
   @ObfuscatedName("bc")
   public void disableElement(int var1, boolean var2, byte var3) {
      try {
         if (!var2) {
            this.enabledElements.add(var1);
         } else {
            this.enabledElements.remove(var1);
         }

         this.method11550(-362186823);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vs.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gw")
   public void method11445() {
      WorldMapRegion.WorldMapRegion_cachedSprites.clear();
   }

   @ObfuscatedSignature(descriptor = "(Lvs;B)V")
   @ObfuscatedName("ye")
   public static void method11403(WorldMap var0, byte var1) {
      if (var0 == null) {
         var0.method11404(var1);
      }

      try {
         var0.minCachedTileY = 969746873;
         var0.cyclesPerFlash = -1333966893;
         var0.worldMapTargetX = -696675125;
         var0.field6247 = 904391371;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.ap(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;II)V")
   @ObfuscatedName("to")
   public static void method11478(WorldMap var0, int var1, int var2) {
      if (var0.mainMapArea != null && var0.mainMapArea.containsPosition(var1, var2, (byte)48)) {
         var0.field6238 = (var1 - var0.mainMapArea.getRegionLowX(-1906496688) * 64) * 1482342113;
         var0.minCachedTileX = (var2 - WorldMapArea.method6961(var0.mainMapArea, (byte)8) * 64) * 2104342031;
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("ge")
   public void method11534(int var1, boolean var2) {
      if (!var2) {
         this.enabledElements.add(var1);
      } else {
         this.enabledElements.remove(var1);
      }

      this.method11550(-362186823);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("du")
   public int method11420() {
      return this.mainMapArea == null ? -1 : WorldMapArea.method6931(this.mainMapArea, -1857481096);
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("ex")
   boolean method11450(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null == this.sprite) {
         return true;
      } else if (var1 == this.sprite.subWidth && var2 == this.sprite.subHeight) {
         if (this.worldMapDisplayWidth * 90135311 != 662982150 * this.worldMapRenderer.pixelsPerTile) {
            return true;
         } else if (this.worldMapDisplayY * -1049476409 != client.field710 * 1954026687) {
            return true;
         } else {
            return var3 <= 0 && var4 <= 0 ? var1 + var3 < var5 || var2 + var4 < var6 : true;
         }
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("ei")
   boolean method11451(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null == this.sprite) {
         return true;
      } else if (var1 == this.sprite.subWidth && var2 == this.sprite.subHeight) {
         if (this.worldMapDisplayWidth * 1621605060 != 168937541 * this.worldMapRenderer.pixelsPerTile) {
            return true;
         } else if (this.worldMapDisplayY * 567863520 != client.field710 * 1954026687) {
            return true;
         } else {
            return var3 <= 0 && var4 <= 0 ? var1 + var3 < var5 || var2 + var4 < var6 : true;
         }
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("eu")
   void method11455(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (client.field1026 != null) {
         int var7 = -1692404963 / (this.worldMapRenderer.pixelsPerTile * 337875082);
         int var8 = -2070832955 + var3;
         int var9 = 512 + var4;
         float var10 = 1.0F;
         var8 = (int)(var8 / var10);
         var9 = (int)(var9 / var10);
         int var11 = this.getDisplayX(-2072467469) - var5 / 2 - var7;
         int var12 = method11492(this, (byte)-42) - var6 / 2 - var7;
         int var13 = var1 - 168937541 * this.worldMapRenderer.pixelsPerTile * (var7 + var11 - this.flashCycle * -1778669645);
         int var14 = var2 - (var7 - (var12 - this.centerTileX * 1025000757)) * this.worldMapRenderer.pixelsPerTile * 168937541;
         if (method11448(this, var8, var9, var13, var14, var3, var4, 1032239810)) {
            if (this.sprite != null && var8 == this.sprite.subWidth && this.sprite.subHeight == var9) {
               Arrays.fill(this.sprite.pixels, 0);
            } else {
               this.sprite = new SpritePixels(var8, var9);
            }

            this.flashCycle = (this.getDisplayX(-404331255) - var5 / 2 - var7) * -369850259;
            this.centerTileX = (method11492(this, (byte)82) - var6 / 2 - var7) * -21912291;
            this.worldMapDisplayWidth = this.worldMapRenderer.pixelsPerTile * -1728989333;
            client.field1026
               .method9220(this.flashCycle * 750769452, this.centerTileX * 562029098, this.sprite, 1274277522 * this.worldMapDisplayWidth / var10, 16582757);
            this.worldMapDisplayY = client.field710 * -642079159;
            var13 = var1 - 168937541 * this.worldMapRenderer.pixelsPerTile * (var11 + var7 - -1778669645 * this.flashCycle);
            var14 = var2 - (var7 - (var12 - this.centerTileX * 1025000757)) * this.worldMapRenderer.pixelsPerTile * -1375444273;
         }

         Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
         if (var10 == 1.0F) {
            this.sprite.method12664(var13, var14, 1759042589);
         } else {
            this.sprite.method12667(var13, var14, (int)(var8 * var10), (int)(var9 * var10), 192);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ey")
   void method11456(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (client.field1026 != null) {
         int var7 = 14007040 / (this.worldMapRenderer.pixelsPerTile * 337875082);
         int var8 = 887246932 + var3;
         int var9 = 512 + var4;
         float var10 = 1.0F;
         var8 = (int)(var8 / var10);
         var9 = (int)(var9 / var10);
         int var11 = this.getDisplayX(-1431155138) - var5 / 2 - var7;
         int var12 = method11492(this, (byte)-88) - var6 / 2 - var7;
         int var13 = var1 - 399067214 * this.worldMapRenderer.pixelsPerTile * (var7 + var11 - this.flashCycle * -1778669645);
         int var14 = var2 - (var7 - (var12 - this.centerTileX * 1025000757)) * this.worldMapRenderer.pixelsPerTile * -1942693894;
         if (method11448(this, var8, var9, var13, var14, var3, var4, 260110659)) {
            if (this.sprite != null && var8 == this.sprite.subWidth && this.sprite.subHeight == var9) {
               Arrays.fill(this.sprite.pixels, 0);
            } else {
               this.sprite = new SpritePixels(var8, var9);
            }

            this.flashCycle = (this.getDisplayX(-412575925) - var5 / 2 - var7) * -231121029;
            this.centerTileX = (method11492(this, (byte)-59) - var6 / 2 - var7) * 1407914648;
            this.worldMapDisplayWidth = this.worldMapRenderer.pixelsPerTile * -1728989333;
            client.field1026
               .method9220(this.flashCycle * -1778669645, this.centerTileX * -491833800, this.sprite, 90135311 * this.worldMapDisplayWidth / var10, 16582757);
            this.worldMapDisplayY = client.field710 * -1704724689;
            var13 = var1 - -401818612 * this.worldMapRenderer.pixelsPerTile * (var11 + var7 - -1778669645 * this.flashCycle);
            var14 = var2 - (var7 - (var12 - this.centerTileX * 1025000757)) * this.worldMapRenderer.pixelsPerTile * -779385402;
         }

         Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
         if (var10 == 1.0F) {
            this.sprite.method12664(var13, var14, 192);
         } else {
            this.sprite.method12667(var13, var14, (int)(var8 * var10), (int)(var9 * var10), 192);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvs;I)V")
   @ObfuscatedName("dt")
   public static void method11531(WorldMap var0, int var1) {
      if (var0 == null) {
         var0.stopCurrentFlashes(var1);
      } else {
         try {
            var0.flashingElements = null;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "vs.bl(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gg")
   public void method11519(boolean var1) {
      this.perpetualFlash = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dk")
   public int method11578() {
      return this.field6240 * -508056495;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bk")
   public void setWorldMapPositionTarget(int var1, int var2, int var3) {
      if (null != this.mainMapArea) {
         int[] var4 = WorldMapArea.method6923(this.mainMapArea, var1, var2, var3, 2046290025);
         if (null != var4) {
            method11479(this, var4[0], var4[1], 196460225);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lla;")
   @ObfuscatedName("bz")
   public WorldMapArea getMapArea(int var1, byte var2) {
      try {
         Iterator var3 = this.details.values().iterator();

         while (var3.hasNext()) {
            if (var2 != 4) {
               throw new IllegalStateException();
            }

            WorldMapArea var4 = (WorldMapArea)var3.next();
            if (WorldMapArea.method6931(var4, -1775830795) == var1) {
               if (var2 != 4) {
                  throw new IllegalStateException();
               }

               return var4;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "vs.bz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("en")
   float method11466(int var1) {
      if (25 == var1) {
         return 1.0F;
      } else if (37 == var1) {
         return 1.5F;
      } else if (50 == var1) {
         return 2.0F;
      } else if (var1 == -1557908756) {
         return 3.0F;
      } else {
         return 100 == var1 ? 4.0F : 8.0F;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;Lqm;Lsu;Ljava/util/HashMap;[Lxm;)V")
   @ObfuscatedName("cn")
   public void method11368(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
      this.mapSceneSprites = var6;
      this.WorldMap_groundArchive = var1;
      this.WorldMap_archive = var2;
      this.WorldMap_geographyArchive = var3;
      this.font = var4;
      this.fonts = new HashMap();
      this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11));
      this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13));
      this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15));
      this.cacheLoader = new WorldMapArchiveLoader(var1);
      int var7 = this.WorldMap_groundArchive.groupLoadPercentByName(WorldMapCacheName.field3834.name, (byte)8);
      int[] var8 = AbstractArchive.method8992(this.WorldMap_groundArchive, var7, -1775968255);
      int var9 = var8 == null ? 0 : var8.length;
      this.details = new HashMap(var9);

      for (int var10 = 0; var10 < var9; var10++) {
         Buffer var11 = new Buffer(this.WorldMap_groundArchive.getFile(var7, var8[var10], -436787437));
         WorldMapArea var12 = new WorldMapArea();
         WorldMapArea.method6905(var12, var11, var8[var10], (byte)52);
         this.details.put(var12.getInternalName(268435520), var12);
         if (var12.getIsMain(1599863785)) {
            this.field6286 = var12;
         }
      }

      this.setCurrentMapArea(this.field6286, 1711583028);
      this.currentMapArea = null;
   }

   @ObfuscatedSignature(descriptor = "()Lms;")
   @ObfuscatedName("hl")
   public AbstractWorldMapIcon method11568() {
      if (this.iconIterator == null) {
         return null;
      } else {
         while (this.iconIterator.hasNext()) {
            AbstractWorldMapIcon var1 = (AbstractWorldMapIcon)this.iconIterator.next();
            if (var1.getElement(-1974502678) != -1) {
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ew")
   public void method11472() {
      this.cacheLoader.load(-1970992257);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("eo")
   void method11463(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var3 / 2 + var1;
      int var8 = var4 / 2 + var2 - 18 - var6;
      Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
      Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 1659554022, -65536);
      Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, 2 + var8, var5 * 3, 30, -65536);
      FadeOutTask.method10363(this.font, Strings.field5162, var7, var6 + var8, -1, -1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fx")
   public int method11501() {
      return -508056495 * this.field6240;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bp")
   public int getDisplayX(int var1) {
      try {
         if (null == this.mainMapArea) {
            if (var1 >= 889442703) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return this.field6278 * 1385473505 + this.mainMapArea.getRegionLowX(-1386086772) * 64;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.bp(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fz")
   public int method11489() {
      return null == this.mainMapArea ? -1 : this.field6278 * 1663608980 + this.mainMapArea.getRegionLowX(-1536261024) * 64;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fk")
   public int method11490() {
      return null == this.mainMapArea ? -1 : this.field6278 * 1385473505 + this.mainMapArea.getRegionLowX(-620611397) * 64;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lh")
   public int method11579() {
      return this.flashCount * 87099055;
   }

   @ObfuscatedSignature(descriptor = "()Lms;")
   @ObfuscatedName("hu")
   public AbstractWorldMapIcon method11569() {
      if (this.iconIterator == null) {
         return null;
      } else {
         while (this.iconIterator.hasNext()) {
            AbstractWorldMapIcon var1 = (AbstractWorldMapIcon)this.iconIterator.next();
            if (var1.getElement(1008801044) != -1) {
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;Lqm;Lsu;Ljava/util/HashMap;[Lxm;)V")
   @ObfuscatedName("co")
   public void method11369(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
      this.mapSceneSprites = var6;
      this.WorldMap_groundArchive = var1;
      this.WorldMap_archive = var2;
      this.WorldMap_geographyArchive = var3;
      this.font = var4;
      this.fonts = new HashMap();
      this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11));
      this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13));
      this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15));
      this.cacheLoader = new WorldMapArchiveLoader(var1);
      int var7 = this.WorldMap_groundArchive.groupLoadPercentByName(WorldMapCacheName.field3834.name, (byte)8);
      int[] var8 = AbstractArchive.method8992(this.WorldMap_groundArchive, var7, -1775968255);
      int var9 = var8 == null ? 0 : var8.length;
      this.details = new HashMap(var9);

      for (int var10 = 0; var10 < var9; var10++) {
         Buffer var11 = new Buffer(this.WorldMap_groundArchive.getFile(var7, var8[var10], 1661574078));
         WorldMapArea var12 = new WorldMapArea();
         WorldMapArea.method6905(var12, var11, var8[var10], (byte)14);
         this.details.put(var12.getInternalName(268435520), var12);
         if (var12.getIsMain(1599863785)) {
            this.field6286 = var12;
         }
      }

      this.setCurrentMapArea(this.field6286, 1711583028);
      this.currentMapArea = null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fw")
   public int method11493() {
      return null == this.mainMapArea ? -1 : this.worldMapTargetY * 605996841 + WorldMapArea.method6961(this.mainMapArea, (byte)50) * 64;
   }

   @ObfuscatedSignature(descriptor = "()Loj;")
   @ObfuscatedName("fy")
   public Coord method11498() {
      return null == this.mainMapArea ? null : this.mainMapArea.coord(this.getDisplayX(-257642970), method11492(this, (byte)54), (byte)95);
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ak")
   void scrollToTarget(byte var1) {
      try {
         if (!this.hasTarget(1212819561)) {
            if (var1 == 7) {
               throw new IllegalStateException();
            }
         } else {
            int var2 = this.field6238 * -2014116575 - 1385473505 * this.field6278;
            int var3 = 1325693167 * this.minCachedTileX - 605996841 * this.worldMapTargetY;
            if (var2 != 0) {
               if (var1 == 7) {
                  throw new IllegalStateException();
               }

               var2 /= Math.min(8, Math.abs(var2));
            }

            if (0 != var3) {
               if (var1 == 7) {
                  throw new IllegalStateException();
               }

               var3 /= Math.min(8, Math.abs(var3));
            }

            method11396(this, var2 + this.field6278 * 1385473505, this.worldMapTargetY * 605996841 + var3, true, -181585150);
            if (-2014116575 * this.field6238 == 1385473505 * this.field6278) {
               if (var1 == 7) {
                  throw new IllegalStateException();
               }

               if (this.worldMapTargetY * 605996841 == 1325693167 * this.minCachedTileX) {
                  if (var1 == 7) {
                     throw new IllegalStateException();
                  }

                  this.field6238 = -1482342113;
                  this.minCachedTileX = -2104342031;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vs.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Loj;")
   @ObfuscatedName("fv")
   public Coord method11499() {
      return null == this.mainMapArea ? null : this.mainMapArea.coord(this.getDisplayX(-1041387766), method11492(this, (byte)-84), (byte)58);
   }

   @ObfuscatedSignature(descriptor = "(IIIZ)V")
   @ObfuscatedName("dr")
   public void method11414(int var1, int var2, int var3, boolean var4) {
      WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3, 770060524);
      if (null == var5) {
         if (!var4) {
            return;
         }

         var5 = this.field6286;
      }

      boolean var6 = false;
      if (this.currentMapArea != var5 || var4) {
         this.currentMapArea = var5;
         this.setCurrentMapArea(var5, 1711583028);
         var6 = true;
      }

      if (var6 || var4) {
         this.jump(var1, var2, var3, (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gn")
   public void method11509() {
      this.worldMapDisplayX = 348916865;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fd")
   public int method11504() {
      return this.field6241 * -898886207;
   }

   @ObfuscatedSignature(descriptor = "(IIIIID)V")
   @ObfuscatedName("ah")
   public void draw(int var1, int var2, int var3, int var4, int var5, double var6) {
      int[] var8 = new int[4];
      Rasterizer2D.Rasterizer2D_getClipArray(var8);
      Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var4 + var2);
      int var9 = this.cacheLoader.getPercentLoaded((byte)15);
      if (var9 < 1447357344) {
         this.drawLoading(var1, var2, var3, var4, var9, (byte)3);
      } else {
         if (!this.worldMapRenderer.isLoaded(637533664)) {
            this.worldMapRenderer.method7126(this.WorldMap_groundArchive, this.mainMapArea.getInternalName(268435520), client.isMembersWorld, -1898485252);
            if (!this.worldMapRenderer.isLoaded(1230892474)) {
               return;
            }
         }

         int var11 = this.worldMapRenderer.method7157(-814506674);
         double var12 = (var11 >> 16 & -1335968955) / 256.0;
         double var14 = (var11 >> 8 & 0xFF) / 256.0;
         double var16 = (var11 & 0xFF) / 256.0;
         var12 = Math.pow(var12, var6);
         var14 = Math.pow(var14, var6);
         var16 = Math.pow(var16, var6);
         int var18 = (int)(var12 * 256.0);
         int var19 = (int)(var14 * 256.0);
         int var20 = (int)(var16 * 256.0);
         int var10 = var20 + -210481327 + (var18 << 16) + (var19 << 8);
         Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var10);
         if (null != this.flashingElements) {
            this.maxFlashCount += -2012861431;
            if (this.maxFlashCount * -1622938959 % (this.field6245 * -1892530307) == 0) {
               this.maxFlashCount = 0;
               this.cachedPixelsPerTile += 1630090091;
            }

            if (-1942724285 * this.cachedPixelsPerTile >= this.worldMapDisplayX * -857645341 && !this.perpetualFlash) {
               this.flashingElements = null;
            }
         }

         int var13 = (int)Math.ceil(var3 / this.zoom);
         int var23 = (int)Math.ceil(var4 / this.zoom);
         double var15 = Rasterizer3D.method5835();
         this.worldMapRenderer
            .drawTiles(
               this.field6278 * 1771827980 - var13 / 2,
               this.worldMapTargetY * 605996841 - var23 / 2,
               this.field6278 * 1385473505 + var13 / 2,
               var23 / 2 + this.worldMapTargetY * 605996841,
               var1,
               var2,
               var3 + var1,
               var4 + var2,
               (byte)0
            );
         if (!this.elementsDisabled) {
            boolean var17 = false;
            if (var5 - 841975307 * this.centerTileY > 100) {
               this.centerTileY = var5 * -1210313895;
               var17 = true;
            }

            this.worldMapRenderer
               .drawElements(
                  1385473505 * this.field6278 - var13 / 2,
                  this.worldMapTargetY * 319255878 - var23 / 2,
                  var13 / 2 + this.field6278 * -1855845714,
                  605996841 * this.worldMapTargetY + var23 / 2,
                  var1,
                  var2,
                  var1 + var3,
                  var4 + var2,
                  this.field6258,
                  this.flashingElements,
                  this.maxFlashCount * -1860718239,
                  this.field6245 * -393313075,
                  var17,
                  2084219969
               );
         }

         method11454(this, var1, var2, var3, var4, var13, var23, (byte)-28);
         boolean var25 = 664286254 * client.staffModLevel >= 2;
         if (var25 && this.showCoord && null != this.mouseCoord) {
            this.font
               .method10402("Coord: " + this.mouseCoord, 10 + Rasterizer2D.Rasterizer2D_xClipStart, 20 + Rasterizer2D.Rasterizer2D_yClipStart, 1840664432, -1);
         }

         this.field6240 = -1587995471 * var13;
         this.field6241 = 1562230591 * var23;
         this.flashCount = var1 * 1772194922;
         this.field6243 = var2 * 1102469309;
         Rasterizer2D.Rasterizer2D_setClipArray(var8);
         if (var15 != Rasterizer3D.method5835()) {
            Rasterizer3D.buildPalette(var15);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;)V")
   @ObfuscatedName("yb")
   public static void method11551(WorldMap var0) {
      var0.field6258.clear();
      var0.field6258.addAll(var0.enabledElements);
      var0.field6258.addAll(var0.enabledElementIds);
   }

   @ObfuscatedSignature(descriptor = "(IILoj;Loj;)V")
   @ObfuscatedName("hz")
   public void method11559(int var1, int var2, Coord var3, Coord var4) {
      ScriptEvent var5 = new ScriptEvent();
      WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4);
      var5.setArgs(new Object[]{var6}, 692177126);
      switch (var1) {
         case 1008:
            ScriptEvent.method1406(var5, 10, (byte)-58);
            break;
         case 1009:
            ScriptEvent.method1406(var5, 11, (byte)1);
            break;
         case 1010:
            ScriptEvent.method1406(var5, 12, (byte)-62);
            break;
         case 1011:
            ScriptEvent.method1406(var5, 13, (byte)-125);
            break;
         case 1012:
            ScriptEvent.method1406(var5, 14, (byte)-52);
      }

      class141.runScriptEvent(var5, 1856325427);
   }

   @ObfuscatedSignature(descriptor = "(Lvs;Lqm;Lqm;Lqm;Lsu;Ljava/util/HashMap;[Lxm;I)V")
   @ObfuscatedName("ah")
   public static void method11370(
      WorldMap var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6, int var7
   ) {
      if (var0 == null) {
         var0.init(var1, var1, var1, var4, var5, var6, var7);
      }

      try {
         var0.mapSceneSprites = var6;
         var0.WorldMap_groundArchive = var1;
         var0.WorldMap_archive = var2;
         var0.WorldMap_geographyArchive = var3;
         var0.font = var4;
         var0.fonts = new HashMap();
         var0.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11));
         var0.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13));
         var0.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15));
         var0.cacheLoader = new WorldMapArchiveLoader(var1);
         int var8 = var0.WorldMap_groundArchive.groupLoadPercentByName(WorldMapCacheName.field3834.name, (byte)22);
         int[] var9 = AbstractArchive.method8992(var0.WorldMap_groundArchive, var8, -1775968255);
         int var10000;
         if (var9 == null) {
            if (var7 <= 16777215) {
               return;
            }

            var10000 = 0;
         } else {
            var10000 = var9.length;
         }

         int var10 = var10000;
         var0.details = new HashMap(var10);

         for (int var11 = 0; var11 < var10; var11++) {
            Buffer var12 = new Buffer(var0.WorldMap_groundArchive.getFile(var8, var9[var11], -1079227898));
            WorldMapArea var13 = new WorldMapArea();
            WorldMapArea.method6905(var13, var12, var9[var11], (byte)46);
            var0.details.put(var13.getInternalName(268435520), var13);
            if (var13.getIsMain(1599863785)) {
               if (var7 <= 16777215) {
                  throw new IllegalStateException();
               }

               var0.field6286 = var13;
            }
         }

         var0.setCurrentMapArea(var0.field6286, 1711583028);
         var0.currentMapArea = null;
      } catch (RuntimeException var14) {
         throw RestClientThreadFactory.newRunException(var14, "vs.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("el")
   public void method11510() {
      this.worldMapDisplayX = 348916865;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fm")
   public int method11502() {
      return -508056495 * this.field6240;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bh")
   public void flashCategory(int var1, int var2) {
      method11479(this, var1, var2, 622690859);
   }

   @ObfuscatedSignature(descriptor = "(Lvs;III)V")
   @ObfuscatedName("cj")
   public static void method11479(WorldMap var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method11480(var1, var1, var1);
      } else {
         try {
            if (var0.mainMapArea != null) {
               if (var3 == 1824579356) {
                  throw new IllegalStateException();
               }

               if (var0.mainMapArea.containsPosition(var1, var2, (byte)-47)) {
                  var0.field6238 = (var1 - var0.mainMapArea.getRegionLowX(-1190701624) * 64) * 1482342113;
                  var0.minCachedTileX = (var2 - WorldMapArea.method6961(var0.mainMapArea, (byte)10) * 64) * 2104342031;
                  return;
               }
            }
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "vs.bk(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gu")
   public void method11511() {
      this.worldMapDisplayX = 348916865;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   void smoothZoom(int var1) {
      try {
         if (client.field1026 != null) {
            if (var1 == -1793120611) {
               throw new IllegalStateException();
            } else {
               this.zoom = this.zoomTarget;
            }
         } else {
            if (this.zoom < this.zoomTarget) {
               if (var1 == -1793120611) {
                  return;
               }

               this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F);
            }

            if (this.zoom > this.zoomTarget) {
               if (var1 == -1793120611) {
                  throw new IllegalStateException();
               }

               this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F);
            }
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lla;)V")
   @ObfuscatedName("do")
   void method11431(WorldMapArea var1) {
      this.mainMapArea = var1;
      this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_archive, this.WorldMap_geographyArchive);
      this.cacheLoader.reset(this.mainMapArea == null ? null : this.mainMapArea.getInternalName(268435520), -1506087453);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("go")
   public void method11520(boolean var1) {
      this.perpetualFlash = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lla;Loj;Loj;Z)V")
   @ObfuscatedName("ec")
   public void method11433(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
      if (var1 != null) {
         if (null == this.mainMapArea || var1 != this.mainMapArea) {
            this.initializeWorldMap(var1, (byte)42);
         }

         if (!var4 && this.mainMapArea.containsCoord(var2.plane * 370217423, var2.x * -1931160809, var2.y * -263036313, 2136870681)) {
            this.jump(370217423 * var2.plane, var2.x * -1931160809, var2.y * -263036313, (byte)1);
         } else {
            this.jump(var3.plane * 370217423, var3.x * -1931160809, -263036313 * var3.y, (byte)1);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILoj;Loj;)V")
   @ObfuscatedName("hn")
   public void method11560(int var1, int var2, Coord var3, Coord var4) {
      ScriptEvent var5 = new ScriptEvent();
      WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4);
      var5.setArgs(new Object[]{var6}, -652464700);
      switch (var1) {
         case 1008:
            ScriptEvent.method1406(var5, 10, (byte)-97);
            break;
         case 1009:
            ScriptEvent.method1406(var5, 11, (byte)-98);
            break;
         case 1010:
            ScriptEvent.method1406(var5, 12, (byte)-57);
            break;
         case 1011:
            ScriptEvent.method1406(var5, 13, (byte)-94);
            break;
         case 1012:
            ScriptEvent.method1406(var5, 14, (byte)-126);
      }

      class141.runScriptEvent(var5, 1856325427);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gy")
   public void method11524(int var1) {
      this.flashingElements = new HashSet();
      this.flashingElements.add(var1);
      this.cachedPixelsPerTile = 0;
      this.maxFlashCount = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gj")
   public void method11525(int var1) {
      this.flashingElements = new HashSet();
      this.flashingElements.add(var1);
      this.cachedPixelsPerTile = 0;
      this.maxFlashCount = 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ti")
   public int method11581() {
      return this.field6241 * 2062397631;
   }

   @ObfuscatedSignature(descriptor = "(IIZZ)V")
   @ObfuscatedName("cz")
   public void method11382(int var1, int var2, boolean var3, boolean var4) {
      long var5;
      label46: {
         var5 = ParamComposition.method4949((byte)15);
         this.method11384(var1, var2, var4, var5);
         if (!this.hasTarget(1062916024) && (var4 || var3)) {
            boolean var7 = client.clickedWidget != null;
            if (!var7) {
               if (var4) {
                  this.cyclesPerFlash = var1 * 1577136439;
                  this.minCachedTileY = -969746873 * var2;
                  this.field6247 = 1113251634 * this.field6278;
                  this.worldMapTargetX = 672358013 * this.worldMapTargetY;
               }

               if (this.field6247 * -911256291 != -1) {
                  int var8 = var1 - this.cyclesPerFlash * -1777092126;
                  int var9 = var2 - 1388311415 * this.minCachedTileY;
                  method11396(
                     this,
                     347107554 * this.field6247 - (int)(var8 / this.zoomTarget),
                     this.worldMapTargetX * 1535037213 + (int)(var9 / this.zoomTarget),
                     false,
                     -318372544
                  );
               }
               break label46;
            }
         }

         method11403(this, (byte)1);
      }

      if (var4) {
         this.field6279 = 7903547019418784317L * var5;
         this.worldMapDisplayHeight = 1714166725 * var1;
         this.field6275 = var2 * 2009204744;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gt")
   public void method11529(int var1) {
      this.flashingElements = new HashSet();
      this.cachedPixelsPerTile = 0;
      this.maxFlashCount = 0;

      for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count * 143164541; var2++) {
         if (class463.WorldMapElement_get(var2, (byte)0) != null && class463.WorldMapElement_get(var2, (byte)0).category * -629421571 == var1) {
            this.flashingElements.add(class463.WorldMapElement_get(var2, (byte)0).objectId * 348284615);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("dm")
   public int method11421() {
      return this.mainMapArea == null ? -1 : WorldMapArea.method6931(this.mainMapArea, -1930784669);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;I)F")
   @ObfuscatedName("oi")
   public static float method11467(WorldMap var0, int var1) {
      if (var0 == null) {
         var0.method11507(var1);
      }

      if (25 == var1) {
         return 1.0F;
      } else if (-1343403115 == var1) {
         return 1.5F;
      } else if (50 == var1) {
         return 2.0F;
      } else if (var1 == 75) {
         return 3.0F;
      } else {
         return 100 == var1 ? 4.0F : 8.0F;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lla;")
   @ObfuscatedName("di")
   public WorldMapArea method11411(int var1, int var2, int var3) {
      for (WorldMapArea var5 : this.details.values()) {
         if (var5.containsCoord(var1, var2, var3, 2136870681)) {
            return var5;
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("gv")
   public void method11535(int var1, boolean var2) {
      if (!var2) {
         this.enabledElements.add(var1);
      } else {
         this.enabledElements.remove(var1);
      }

      this.method11550(-362186823);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;IIIIII)V")
   @ObfuscatedName("vv")
   public static void method11457(WorldMap var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method11571();
      }

      if (client.field1026 != null) {
         int var7 = 512 / (var0.worldMapRenderer.pixelsPerTile * 337875082);
         int var8 = -19913377 + var3;
         int var9 = 1709066651 + var4;
         float var10 = 1.0F;
         var8 = (int)(var8 / var10);
         var9 = (int)(var9 / var10);
         int var11 = var0.getDisplayX(-2117421904) - var5 / 2 - var7;
         int var12 = method11492(var0, (byte)-27) - var6 / 2 - var7;
         int var13 = var1 - -1634675659 * var0.worldMapRenderer.pixelsPerTile * (var7 + var11 - var0.flashCycle * -1698544968);
         int var14 = var2 - (var7 - (var12 - var0.centerTileX * 293822466)) * var0.worldMapRenderer.pixelsPerTile * 168937541;
         if (method11448(var0, var8, var9, var13, var14, var3, var4, 1314817313)) {
            if (var0.sprite != null && var8 == var0.sprite.subWidth && var0.sprite.subHeight == var9) {
               Arrays.fill(var0.sprite.pixels, 0);
            } else {
               var0.sprite = new SpritePixels(var8, var9);
            }

            var0.flashCycle = (var0.getDisplayX(-71959168) - var5 / 2 - var7) * 457371631;
            var0.centerTileX = (method11492(var0, (byte)-44) - var6 / 2 - var7) * -21912291;
            var0.worldMapDisplayWidth = var0.worldMapRenderer.pixelsPerTile * 866964538;
            client.field1026
               .method9220(var0.flashCycle * -1778669645, var0.centerTileX * 1025000757, var0.sprite, 90135311 * var0.worldMapDisplayWidth / var10, 16582757);
            var0.worldMapDisplayY = client.field710 * -642079159;
            var13 = var1 - 1067306987 * var0.worldMapRenderer.pixelsPerTile * (var11 + var7 - -1777638805 * var0.flashCycle);
            var14 = var2 - (var7 - (var12 - var0.centerTileX * 1025000757)) * var0.worldMapRenderer.pixelsPerTile * -1653360337;
         }

         Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
         if (var10 == 1.0F) {
            var0.sprite.method12664(var13, var14, -1460721700);
         } else {
            var0.sprite.method12667(var13, var14, (int)(var8 * var10), (int)(var9 * var10), -1576966651);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fe")
   public int method11494() {
      return null == this.mainMapArea ? -1 : this.worldMapTargetY * 605996841 + WorldMapArea.method6961(this.mainMapArea, (byte)-35) * 64;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gf")
   public void method11532() {
      this.flashingElements = null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gk")
   public void method11526(int var1) {
      this.flashingElements = new HashSet();
      this.flashingElements.add(var1);
      this.cachedPixelsPerTile = 0;
      this.maxFlashCount = 0;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gi")
   public void method11542(boolean var1) {
      this.elementsDisabled = !var1;
   }

   @ObfuscatedSignature(descriptor = "()Lla;")
   @ObfuscatedName("xb")
   public WorldMapArea method11582() {
      return this.mainMapArea;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("bs")
   public boolean isCacheLoaded(int var1) {
      return !this.enabledElements.contains(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("hi")
   public boolean method11547(int var1) {
      return !this.enabledElements.contains(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("gq")
   public boolean method11549(int var1) {
      return !this.enabledCategories.contains(var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hg")
   void method11552() {
      this.field6258.clear();
      this.field6258.addAll(this.enabledElements);
      this.field6258.addAll(this.enabledElementIds);
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("hj")
   public void method11554(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.cacheLoader.isLoaded(804984463)) {
         int var7 = (int)Math.ceil(var3 / this.zoom);
         int var8 = (int)Math.ceil(var4 / this.zoom);
         List var9 = WorldMapRenderer.method7145(
            this.worldMapRenderer,
            1385473505 * this.field6278 - var7 / 2 - 1,
            605996841 * this.worldMapTargetY - var8 / 2 - 1,
            var7 / 2 + this.field6278 * 1385473505 + 1,
            1 + this.worldMapTargetY * 605996841 + var8 / 2,
            var1,
            var2,
            var3,
            var4,
            var5,
            var6,
            -1091395869
         );
         if (!var9.isEmpty()) {
            for (AbstractWorldMapIcon var11 : var9) {
               WorldMapElement var12 = class463.WorldMapElement_get(var11.getElement(513062970), (byte)0);
               boolean var13 = false;

               for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; var14--) {
                  if (null != var12.menuActions[var14]) {
                     client.insertMenuItemNoShift(
                        var12.menuActions[var14],
                        var12.name,
                        this.menuOpcodes[var14],
                        var11.getElement(-2022055900),
                        var11.coord1.packed(1640708228),
                        var11.coord2.packed(1744914048),
                        -1625844214
                     );
                     var13 = true;
                  }
               }

               if (var13) {
                  return;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILoj;)Loj;")
   @ObfuscatedName("hq")
   public Coord method11557(int var1, Coord var2) {
      if (!this.cacheLoader.isLoaded(-1115512678)) {
         return null;
      } else if (!this.worldMapRenderer.isLoaded(-873690773)) {
         return null;
      } else if (!this.mainMapArea.containsPosition(-1931160809 * var2.x, var2.y * -263036313, (byte)2)) {
         return null;
      } else {
         HashMap var3 = this.worldMapRenderer.buildIcons(-1403433911);
         List var4 = (List)var3.get(var1);
         if (null != var4 && !var4.isEmpty()) {
            AbstractWorldMapIcon var5 = null;
            int var6 = -1;

            for (AbstractWorldMapIcon var8 : var4) {
               int var9 = var8.coord2.x * -1931160809 - var2.x * -1931160809;
               int var10 = -263036313 * var8.coord2.y - var2.y * -263036313;
               int var11 = var10 * var10 + var9 * var9;
               if (0 == var11) {
                  return var8.coord2;
               }

               if (var11 < var6 || var5 == null) {
                  var5 = var8;
                  var6 = var11;
               }
            }

            return var5.coord2;
         } else {
            return null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZJ)V")
   @ObfuscatedName("ae")
   void method11384(int var1, int var2, boolean var3, long var4) {
      try {
         if (this.mainMapArea != null) {
            int var6 = (int)(
               1385473505 * this.field6278 + (var1 - this.flashCount * 87099055 - this.getDisplayWith(-1047335354) * this.zoom / 2.0F) / this.zoom
            );
            int var7 = (int)(
               605996841 * this.worldMapTargetY - (var2 - 1809736341 * this.field6243 - this.getDisplayHeight((byte)-90) * this.zoom / 2.0F) / this.zoom
            );
            this.mouseCoord = this.mainMapArea
               .coord(var6 + this.mainMapArea.getRegionLowX(-1763090183) * 64, var7 + WorldMapArea.method6961(this.mainMapArea, (byte)-118) * 64, (byte)27);
            if (null != this.mouseCoord && var3) {
               IndexCheck var8 = HttpRequest.method280((byte)1);
               boolean var9 = 427594063 * client.staffModLevel >= 2;
               if (var9 && IndexCheck.method6514(var8, 82, (short)1337) && IndexCheck.method6514(var8, 81, (short)1337)) {
                  classEM.method3786(this.mouseCoord.x * -1931160809, -263036313 * this.mouseCoord.y, this.mouseCoord.plane * 370217423, false, -251763298);
               } else {
                  boolean var10 = true;
                  if (this.field6254) {
                     int var11 = var1 - this.worldMapDisplayHeight * 272656897;
                     int var12 = var2 - 1000461723 * this.field6275;
                     if (var4 - 1871353599993697557L * this.field6279 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                        var10 = false;
                     }
                  }

                  if (var10) {
                     PacketBufferNode var14 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3927, client.packetWriter.isaacCipher, -1568559671);
                     var14.packetBuffer.writeIntIME(this.mouseCoord.packed(267795359), 783375377);
                     PacketWriter.method3330(client.packetWriter, var14, -1771370198);
                     this.field6279 = 0L;
                  }
               }
            }
         } else {
            this.mouseCoord = null;
         }
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "vs.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fc")
   public void method11507(int var1) {
      if (var1 >= 1) {
         this.worldMapDisplayX = var1 * 1547961387;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("em")
   public void method11473() {
      this.cacheLoader.load(-1403916189);
   }

   @ObfuscatedSignature(descriptor = "()Lms;")
   @ObfuscatedName("hb")
   public AbstractWorldMapIcon method11564() {
      if (!this.cacheLoader.isLoaded(-239322495)) {
         return null;
      } else if (!this.worldMapRenderer.isLoaded(67759686)) {
         return null;
      } else {
         HashMap var1 = this.worldMapRenderer.buildIcons(-1403433911);
         this.field6283 = new LinkedList();

         for (List var3 : var1.values()) {
            this.field6283.addAll(var3);
         }

         this.iconIterator = this.field6283.iterator();
         return this.iconStart(1454510953);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;IIZ)V")
   @ObfuscatedName("fy")
   public static void method11399(WorldMap var0, int var1, int var2, boolean var3) {
      if (var0 == null) {
         var0.getWorldMapZoom();
      }

      var0.field6278 = -408003039 * var1;
      var0.worldMapTargetY = 1599915289 * var2;
      ParamComposition.method4949((byte)15);
      if (var3) {
         method11403(var0, (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "()Lms;")
   @ObfuscatedName("hr")
   public AbstractWorldMapIcon method11565() {
      if (!this.cacheLoader.isLoaded(1222873997)) {
         return null;
      } else if (!this.worldMapRenderer.isLoaded(972461996)) {
         return null;
      } else {
         HashMap var1 = this.worldMapRenderer.buildIcons(-1403433911);
         this.field6283 = new LinkedList();

         for (List var3 : var1.values()) {
            this.field6283.addAll(var3);
         }

         this.iconIterator = this.field6283.iterator();
         return this.iconStart(-1744540492);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lip;")
   @ObfuscatedName("at")
   public static ParamComposition getParamDefinition(int var0, int var1) {
      try {
         ParamComposition var2 = (ParamComposition)class402.method8806(ParamComposition.ParamDefinition_cached, var0);
         if (var2 != null) {
            if (var1 >= -83083077) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = class190.ParamDefinition_archive.getFile(11, var0, 2029183778);
            var2 = new ParamComposition();
            if (var3 != null) {
               var2.decode(new Buffer(var3), (byte)-1);
            }

            var2.postDecode(653356064);
            ParamComposition.ParamDefinition_cached.put(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vs.at(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;)Lms;")
   @ObfuscatedName("yu")
   public static AbstractWorldMapIcon method11570(WorldMap var0) {
      if (var0.iconIterator == null) {
         return null;
      } else {
         while (var0.iconIterator.hasNext()) {
            AbstractWorldMapIcon var1 = (AbstractWorldMapIcon)var0.iconIterator.next();
            if (var1.getElement(-704525671) != -1) {
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()Lms;")
   @ObfuscatedName("ht")
   public AbstractWorldMapIcon method11571() {
      if (this.iconIterator == null) {
         return null;
      } else {
         while (this.iconIterator.hasNext()) {
            AbstractWorldMapIcon var1 = (AbstractWorldMapIcon)this.iconIterator.next();
            if (var1.getElement(-1013467465) != -1) {
               return var1;
            }
         }

         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("nb")
   public int method11583() {
      return this.worldMapTargetY * 605996841;
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("ep")
   boolean method11452(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null == this.sprite) {
         return true;
      } else if (var1 == this.sprite.subWidth && var2 == this.sprite.subHeight) {
         if (this.worldMapDisplayWidth * -981955452 != 168937541 * this.worldMapRenderer.pixelsPerTile) {
            return true;
         } else if (this.worldMapDisplayY * -1049476409 != client.field710 * 1954026687) {
            return true;
         } else {
            return var3 <= 0 && var4 <= 0 ? var1 + var3 < var5 || var2 + var4 < var6 : true;
         }
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvs;IIIB)V")
   @ObfuscatedName("no")
   public static void method11484(WorldMap var0, int var1, int var2, int var3, byte var4) {
      if (var0 == null) {
         var0.jumpToSourceCoord(var1, var1, var1, var4);
      } else {
         try {
            if (null == var0.mainMapArea) {
               if (var4 == 0) {
                  ;
               }
            } else {
               int[] var5 = WorldMapArea.method6923(var0.mainMapArea, var1, var2, var3, 2110774851);
               if (null != var5) {
                  method11479(var0, var5[0], var5[1], -1700759435);
               }
            }
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "vs.bj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;Lqm;Lsu;Ljava/util/HashMap;[Lxm;I)V")
   @ObfuscatedName("av")
   public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6, int var7) {
      try {
         this.mapSceneSprites = var6;
         this.WorldMap_geographyArchive = var1;
         this.WorldMap_groundArchive = var2;
         this.WorldMap_geographyArchive = var3;
         this.font = var4;
         this.fonts = new HashMap();
         this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana15));
         this.details.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana13));
         this.details.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11));
         this.cacheLoader = new WorldMapArchiveLoader(var1);
         int var8 = this.WorldMap_archive.groupLoadPercentByName(WorldMapCacheName.field3834.name, (byte)22);
         int[] var9 = AbstractArchive.method8992(this.WorldMap_groundArchive, var8, -1775968255);
         int var10000;
         if (var9 == null) {
            if (var7 <= 16777215) {
               return;
            }

            var10000 = 0;
         } else {
            var10000 = var9.length;
         }

         int var10 = var10000;
         this.details = new HashMap(var10);

         for (int var11 = 0; var11 < var10; var11++) {
            Buffer var12 = new Buffer(this.WorldMap_geographyArchive.takeFile(var8, var9[var11], -1079227898));
            WorldMapArea var13 = new WorldMapArea();
            WorldMapArea.method6905(var13, var12, var9[var11], (byte)46);
            this.fonts.put(var13.getExternalName(268435520), var13);
            if (var13.getIsMain(1599863785)) {
               if (var7 <= 16777215) {
                  throw new IllegalStateException();
               }

               this.field6286 = var13;
            }
         }

         this.setCurrentMapArea(this.currentMapArea, 1711583028);
         this.currentMapArea = null;
      } catch (RuntimeException var14) {
         throw RestClientThreadFactory.newRunException(var14, "vs.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("bt")
   public int getDisplayY(byte var1) {
      try {
         if (null == this.field6286) {
            if (var1 == 32) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return this.worldMapDisplayX * 605996841 + WorldMapArea.method6961(this.currentMapArea, (byte)91) * 64;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.bt(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZI)V")
   @ObfuscatedName("aw")
   final void setWorldMapPosition(int var1, int var2, boolean var3, int var4) {
      try {
         this.worldMapTargetY = -408003039 * var1;
         this.centerTileX = 1599915289 * var2;
         ParamComposition.method4949((byte)15);
         if (var3) {
            method11403(this, (byte)1);
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "vs.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lla;")
   @ObfuscatedName("as")
   public WorldMapArea getCurrentMapArea(int var1) {
      try {
         return this.currentMapArea;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)Z")
   @ObfuscatedName("af")
   boolean method11453(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (null == this.sprite) {
            if (var7 <= -1956925709) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            if (var1 == this.sprite.xOffset) {
               if (var7 <= -1956925709) {
                  throw new IllegalStateException();
               }

               if (var2 == this.sprite.width) {
                  if (this.worldMapDisplayWidth * 90135311 != 168937541 * this.worldMapRenderer.pixelsPerTile) {
                     if (var7 <= -1956925709) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if (this.field6278 * -1049476409 != client.field976 * 1954026687) {
                     if (var7 <= -1956925709) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if (var3 <= 0) {
                     if (var7 <= -1956925709) {
                        throw new IllegalStateException();
                     }

                     if (var4 <= 0) {
                        if (var1 + var3 >= var5) {
                           if (var7 <= -1956925709) {
                              throw new IllegalStateException();
                           }

                           if (var2 + var4 >= var6) {
                              return false;
                           }

                           if (var7 <= -1956925709) {
                              throw new IllegalStateException();
                           }
                        }

                        return true;
                     }

                     if (var7 <= -1956925709) {
                        throw new IllegalStateException();
                     }
                  }

                  return true;
               }

               if (var7 <= -1956925709) {
                  throw new IllegalStateException();
               }
            }

            return true;
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "vs.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fq")
   public void method11480(int var1, int var2, int var3) {
      try {
         if (this.currentMapArea != null) {
            if (var3 == 1824579356) {
               throw new IllegalStateException();
            }

            if (this.field6286.containsPosition(var1, var2, (byte)-47)) {
               this.field6275 = (var1 - this.mainMapArea.getRegionHighY(-1190701624) * 64) * 1482342113;
               this.field6243 = (var2 - WorldMapArea.method6961(this.currentMapArea, (byte)10) * 64) * 2104342031;
               return;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vs.bk(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;Z)V")
   @ObfuscatedName("sn")
   public static void method11543(WorldMap var0, boolean var1) {
      if (var0 == null) {
         var0.method11544(var1);
      } else {
         var0.elementsDisabled = !var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvs;I)Lla;")
   @ObfuscatedName("ez")
   public static WorldMapArea method11425(WorldMap var0, int var1) {
      if (var0 == null) {
         return var0.getCurrentMapArea(var1);
      } else {
         try {
            return var0.mainMapArea;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "vs.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("bb")
   public void setWorldMapPositionTargetInstant(int var1, int var2, byte var3) {
      try {
         if (this.currentMapArea == null) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }
         } else {
            method11396(
               this,
               var1 - this.currentMapArea.getOriginPlane(-752041990) * 64,
               var2 - WorldMapArea.method6961(this.mainMapArea, (byte)-111) * 64,
               true,
               -1645894355
            );
            this.field6245 = -1482342113;
            this.worldMapDisplayY = -2104342031;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vs.bb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("bg")
   public void loadCache(byte var1) {
      try {
         if (!this.hasTarget(1212819561)) {
            if (var1 == 7) {
               throw new IllegalStateException();
            }
         } else {
            int var2 = this.centerTileY * -2014116575 - 1385473505 * this.field6275;
            int var3 = 1325693167 * this.worldMapTargetX - 605996841 * this.maxFlashCount;
            if (var2 != 0) {
               if (var1 == 7) {
                  throw new IllegalStateException();
               }

               var2 /= Math.min(8, Math.abs(var2));
            }

            if (0 != var3) {
               if (var1 == 7) {
                  throw new IllegalStateException();
               }

               var3 /= Math.min(8, Math.abs(var3));
            }

            method11396(this, var2 + this.minCachedTileX * 1385473505, this.field6240 * 605996841 + var3, true, -181585150);
            if (-2014116575 * this.field6238 == 1385473505 * this.worldMapDisplayY) {
               if (var1 == 7) {
                  throw new IllegalStateException();
               }

               if (this.flashCount * 605996841 == 1325693167 * this.field6238) {
                  if (var1 == 7) {
                     throw new IllegalStateException();
                  }

                  this.worldMapTargetX = -1482342113;
                  this.centerTileX = -2104342031;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vs.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bl")
   public void stopCurrentFlashes(int var1) {
      this.enabledElements = new HashSet();
      this.enabledCategories.add(var1);
      this.field6275 = 0;
      this.worldMapTargetX = 0;
   }

   @ObfuscatedSignature(descriptor = "(IIIB)V")
   @ObfuscatedName("bj")
   public void jumpToSourceCoord(int var1, int var2, int var3, byte var4) {
      try {
         if (null == this.field6286) {
            if (var4 == 0) {
               ;
            }
         } else {
            int[] var5 = WorldMapArea.method6923(this.field6286, var1, var2, var3, 2110774851);
            if (null != var5) {
               method11479(this, var5[0], var5[1], -1700759435);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "vs.bj(" + ')');
      }
   }

   public void setWorldMapPositionTarget(WorldPoint var1) {
      this.flashCategory(var1.getX(), var1.getY());
   }

   @ObfuscatedSignature(descriptor = "(Lvs;IIB)V")
   @ObfuscatedName("ml")
   public static void method11482(WorldMap var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         var0.setWorldMapPositionTargetInstant(var1, var1, var3);
      } else {
         try {
            if (var0.mainMapArea == null) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }
            } else {
               method11396(
                  var0,
                  var1 - var0.mainMapArea.getRegionLowX(-752041990) * 64,
                  var2 - WorldMapArea.method6961(var0.mainMapArea, (byte)-111) * 64,
                  true,
                  -1645894355
               );
               var0.field6238 = -1482342113;
               var0.minCachedTileX = -2104342031;
            }
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "vs.bb(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lms;")
   @ObfuscatedName("cc")
   public AbstractWorldMapIcon iconNext(int var1) {
      try {
         if (!this.cacheLoader.isLoaded(-30632799)) {
            if (var1 != 1905763545) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (!this.worldMapRenderer.isLoaded(-1016945015)) {
            if (var1 != 1905763545) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            HashMap var2 = this.worldMapRenderer.buildIcons(-1403433911);
            this.field6283 = new LinkedList();
            Iterator var3 = var2.values().iterator();

            while (var3.hasNext()) {
               if (var1 != 1905763545) {
                  throw new IllegalStateException();
               }

               List var4 = (List)var3.next();
               this.field6283.addAll(var4);
            }

            this.iconIterator = this.field6283.iterator();
            return this.iconStart(-378729766);
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "vs.ck(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;)V")
   @ObfuscatedName("wv")
   public static void method11446(WorldMap var0) {
      if (var0 == null) {
         var0.method11447();
      }

      WorldMapRegion.WorldMapRegion_cachedSprites.clear();
   }

   public Point getWorldMapPosition() {
      WorldMapRenderer var1 = this.method11577();
      int var2 = this.method11575() + var1.method7170();
      int var3 = this.method11583() + var1.method7169();
      return new Point(var2, var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;IIIIID)V")
   @ObfuscatedName("ja")
   public static void method11442(WorldMap var0, int var1, int var2, int var3, int var4, int var5, double var6) {
      if (var0 == null) {
         var0.smoothZoom(var1);
      } else {
         int[] var8 = new int[4];
         Rasterizer2D.Rasterizer2D_getClipArray(var8);
         Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var4 + var2);
         int var9 = var0.cacheLoader.getPercentLoaded((byte)15);
         if (var9 < -478548673) {
            var0.drawLoading(var1, var2, var3, var4, var9, (byte)-125);
         } else {
            if (!var0.worldMapRenderer.isLoaded(834928832)) {
               var0.worldMapRenderer.method7126(var0.WorldMap_groundArchive, var0.mainMapArea.getInternalName(268435520), client.isMembersWorld, -2091412587);
               if (!var0.worldMapRenderer.isLoaded(-315454469)) {
                  return;
               }
            }

            int var11 = var0.worldMapRenderer.method7157(-814506674);
            double var12 = (var11 >> 16 & 1673161709) / 256.0;
            double var14 = (var11 >> 8 & 0xFF) / 256.0;
            double var16 = (var11 & 0xFF) / 256.0;
            var12 = Math.pow(var12, var6);
            var14 = Math.pow(var14, var6);
            var16 = Math.pow(var16, var6);
            int var18 = (int)(var12 * 256.0);
            int var19 = (int)(var14 * 256.0);
            int var20 = (int)(var16 * 256.0);
            int var10 = var20 + 1319443246 + (var18 << 16) + (var19 << 8);
            Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var10);
            if (null != var0.flashingElements) {
               var0.maxFlashCount += -1388937136;
               if (var0.maxFlashCount * -247764992 % (var0.field6245 * -1872125193) == 0) {
                  var0.maxFlashCount = 0;
                  var0.cachedPixelsPerTile += 1630090091;
               }

               if (-1942724285 * var0.cachedPixelsPerTile >= var0.worldMapDisplayX * -737109373 && !var0.perpetualFlash) {
                  var0.flashingElements = null;
               }
            }

            int var13 = (int)Math.ceil(var3 / var0.zoom);
            int var23 = (int)Math.ceil(var4 / var0.zoom);
            double var15 = Rasterizer3D.method5835();
            var0.worldMapRenderer
               .drawTiles(
                  var0.field6278 * 1385473505 - var13 / 2,
                  var0.worldMapTargetY * 605996841 - var23 / 2,
                  var0.field6278 * 1868989245 + var13 / 2,
                  var23 / 2 + var0.worldMapTargetY * 605996841,
                  var1,
                  var2,
                  var3 + var1,
                  var4 + var2,
                  (byte)0
               );
            if (!var0.elementsDisabled) {
               boolean var17 = false;
               if (var5 - 170370507 * var0.centerTileY > 1584270648) {
                  var0.centerTileY = var5 * 297350183;
                  var17 = true;
               }

               var0.worldMapRenderer
                  .drawElements(
                     1655178367 * var0.field6278 - var13 / 2,
                     var0.worldMapTargetY * -1943049780 - var23 / 2,
                     var13 / 2 + var0.field6278 * -625890267,
                     605996841 * var0.worldMapTargetY + var23 / 2,
                     var1,
                     var2,
                     var1 + var3,
                     var4 + var2,
                     var0.field6258,
                     var0.flashingElements,
                     var0.maxFlashCount * -942155261,
                     var0.field6245 * -393313075,
                     var17,
                     2139198805
                  );
            }

            method11454(var0, var1, var2, var3, var4, var13, var23, (byte)1);
            boolean var25 = 427594063 * client.staffModLevel >= 2;
            if (var25 && var0.showCoord && null != var0.mouseCoord) {
               var0.font
                  .method10402(
                     "Coord: " + var0.mouseCoord, 10 + Rasterizer2D.Rasterizer2D_xClipStart, 20 + Rasterizer2D.Rasterizer2D_yClipStart, -1028321422, -1
                  );
            }

            var0.field6240 = -1587995471 * var13;
            var0.field6241 = -1076156446 * var23;
            var0.flashCount = var1 * -1355802858;
            var0.field6243 = var2 * 1102469309;
            Rasterizer2D.Rasterizer2D_setClipArray(var8);
            if (var15 != Rasterizer3D.method5835()) {
               Rasterizer3D.buildPalette(var15);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("yh")
   public void method11508(int var1, int var2) {
      try {
         if (var1 >= 1) {
            this.field6238 = var1 * 1547961387;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vs.by(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("gb")
   public void method11447() {
      WorldMapRegion.WorldMapRegion_cachedSprites.clear();
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIB)V")
   @ObfuscatedName("am")
   void method11458(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         if (client.field1026 != null) {
            if (var7 >= 6) {
               return;
            }

            int var8 = 512 / (this.worldMapRenderer.pixelsPerTile * 337875082);
            int var9 = 512 + var3;
            int var10 = 512 + var4;
            float var11 = 1.0F;
            var9 = (int)(var9 / var11);
            var10 = (int)(var10 / var11);
            int var12 = this.getDisplayWith(500583151) - var5 / 2 - var8;
            int var13 = method11492(this, (byte)-19) - var6 / 2 - var8;
            int var14 = var1 - 168937541 * this.worldMapRenderer.pixelsPerTile * (var8 + var12 - this.field6278 * -1778669645);
            int var15 = var2 - (var8 - (var13 - this.field6240 * 1025000757)) * this.worldMapRenderer.pixelsPerTile * 168937541;
            if (method11448(this, var9, var10, var14, var15, var3, var4, -1301763726)) {
               if (var7 >= 6) {
                  throw new IllegalStateException();
               }

               label59: {
                  if (this.sprite != null) {
                     if (var7 >= 6) {
                        throw new IllegalStateException();
                     }

                     if (var9 == this.sprite.subHeight) {
                        if (var7 >= 6) {
                           throw new IllegalStateException();
                        }

                        if (this.sprite.xOffset == var10) {
                           Arrays.fill(this.sprite.pixels, 0);
                           break label59;
                        }

                        if (var7 >= 6) {
                           return;
                        }
                     }
                  }

                  this.sprite = new SpritePixels(var9, var10);
               }

               this.field6245 = (this.getDisplayWith(-1562952444) - var5 / 2 - var8) * -231121029;
               this.field6247 = (method11492(this, (byte)-99) - var6 / 2 - var8) * -21912291;
               this.field6247 = this.worldMapRenderer.pixelsPerTile * -1728989333;
               client.field1026
                  .method9220(
                     this.cachedPixelsPerTile * -1778669645, this.field6247 * 1025000757, this.sprite, 90135311 * this.worldMapDisplayWidth / var11, 16582757
                  );
               this.field6241 = client.field984 * -642079159;
               var14 = var1 - 168937541 * this.worldMapRenderer.pixelsPerTile * (var12 + var8 - -1778669645 * this.flashCount);
               var15 = var2 - (var8 - (var13 - this.worldMapDisplayY * 1025000757)) * this.worldMapRenderer.pixelsPerTile * 168937541;
            }

            Rasterizer2D.method12523(var1, var2, var3, var4, 0, 128);
            if (var11 == 1.0F) {
               this.sprite.drawTransAt(var14, var15, 192);
            } else {
               this.sprite.drawTransScaledAt(var14, var15, (int)(var9 * var11), (int)(var10 * var11), 192);
            }
         }
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "vs.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ap")
   final void method11404(byte var1) {
      try {
         this.field6247 = 969746873;
         this.flashCount = -1333966893;
         this.field6241 = -696675125;
         this.worldMapTargetY = 904391371;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "vs.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gp")
   public void method11521(boolean var1) {
      this.field6254 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lvs;B)V")
   @ObfuscatedName("mk")
   public static void method11512(WorldMap var0, byte var1) {
      if (var0 == null) {
         var0.loadCache(var1);
      } else {
         try {
            var0.worldMapDisplayX = 348916865;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "vs.bw(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gx")
   public void method11544(boolean var1) {
      this.perpetualFlash = !var1;
   }

   @ObfuscatedSignature(descriptor = "(IIIZI)V")
   @ObfuscatedName("az")
   public void method11415(int var1, int var2, int var3, boolean var4, int var5) {
      try {
         WorldMapArea var6 = this.mapAreaAtCoord(var1, var2, var3, 1731011168);
         if (null == var6) {
            if (var5 != -1091228177) {
               return;
            }

            if (!var4) {
               return;
            }

            var6 = this.field6286;
         }

         boolean var7;
         label52: {
            var7 = false;
            if (this.currentMapArea == var6) {
               if (var5 != -1091228177) {
                  return;
               }

               if (!var4) {
                  break label52;
               }

               if (var5 != -1091228177) {
                  return;
               }
            }

            this.mainMapArea = var6;
            this.setCurrentMapArea(var6, 1711583028);
            var7 = true;
         }

         if (!var7) {
            if (var5 != -1091228177) {
               return;
            }

            if (!var4) {
               return;
            }

            if (var5 != -1091228177) {
               throw new IllegalStateException();
            }
         }

         this.jump(var1, var2, var3, (byte)1);
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "vs.az(" + ')');
      }
   }
}
