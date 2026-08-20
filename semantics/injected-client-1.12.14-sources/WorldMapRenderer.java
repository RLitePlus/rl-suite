import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("le")
public final class WorldMapRenderer implements net.runelite.api.worldmap.WorldMapRenderer {
   @ObfuscatedName("ai")
   int tileY;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("av")
   final AbstractArchive geographyArchive;
   @ObfuscatedName("ag")
   final HashMap fonts;
   @ObfuscatedName("an")
   public int pixelsPerTile = 0;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("at")
   final AbstractArchive groundArchive;
   @ObfuscatedName("aj")
   boolean field3649;
   @ObfuscatedSignature(descriptor = "Lma;")
   @ObfuscatedName("ak")
   WorldMapAreaData mapAreaData;
   @ObfuscatedName("ad")
   int tileX;
   @ObfuscatedName("ap")
   HashMap icons;
   @ObfuscatedSignature(descriptor = "[[Llc;")
   @ObfuscatedName("ay")
   WorldMapRegion[][] regions;
   @ObfuscatedName("au")
   HashMap scaleHandlers;
   @ObfuscatedSignature(descriptor = "[Lxm;")
   @ObfuscatedName("az")
   IndexedSprite[] mapSceneSprites;
   @ObfuscatedName("ae")
   boolean loaded = false;
   @ObfuscatedSignature(descriptor = "Lxt;")
   @ObfuscatedName("aw")
   SpritePixels compositeTextureSprite;
   @ObfuscatedName("as")
   int tileWidth;
   @ObfuscatedName("ac")
   int tileHeight;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lle;IIIIIIII)V")
   @ObfuscatedName("mc")
   public static void method7129(WorldMapRenderer var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var0 == null) {
         var0.method7147(var1, var1, var1, var1, var1, var1, var1, var1, var1, var1);
      }

      int[] var9 = Rasterizer2D.Rasterizer2D_pixels;
      int var10 = Rasterizer2D.Rasterizer2D_width;
      int var11 = Rasterizer2D.Rasterizer2D_height;
      float[] var12 = Rasterizer2D.Rasterizer2D_brightness;
      int[] var13 = new int[4];
      Rasterizer2D.Rasterizer2D_getClipArray(var13);
      WorldMapRectangle var14 = method7150(var0, var1, var2, var3, var4, (byte)80);
      float var15 = WorldMapAreaData.method7357(var0, var7 - var5, var3 - var1, (byte)1);
      int var16 = (int)Math.ceil(var15);
      var0.pixelsPerTile = -470152563 * var16;
      if (!var0.scaleHandlers.containsKey(var16)) {
         WorldMapScaleHandler var17 = new WorldMapScaleHandler(var16);
         var17.init(289558270);
         var0.scaleHandlers.put(var16, var17);
      }

      int var24 = 1136783843 * var14.height + 1445175755 * var14.width - 1;
      int var18 = var14.y * 632501093 + 1674979267 * var14.x - 1;

      for (int var19 = var14.width * 1445175755; var19 <= var24; var19++) {
         for (int var20 = var14.x * 1674979267; var20 <= var18; var20++) {
            var0.regions[var19][var20]
               .drawTile(var16, (WorldMapScaleHandler)var0.scaleHandlers.get(var16), var0.mapSceneSprites, var0.geographyArchive, var0.groundArchive, 0.725);
         }
      }

      Rasterizer3D.method5873(var9, var10, var11, var12);
      Rasterizer2D.Rasterizer2D_setClipArray(var13);
      int var25 = (int)(var15 * 64.0F);
      int var26 = var0.tileX * -579556857 + var1;
      int var21 = var2 + var0.tileY * -1220821219;

      for (int var22 = var14.width * 1445175755; var22 < var14.height * 1136783843 + var14.width * 1445175755; var22++) {
         for (int var23 = var14.x * 1674979267; var23 < var14.x * 1674979267 + var14.y * 632501093; var23++) {
            var0.regions[var22][var23]
               .method6993(
                  var5 + var25 * (-1582512192 * var0.regions[var22][var23].backgroundColor - var26) / 64,
                  var8 - var25 * (64 + (587780544 * var0.regions[var22][var23].pixelsPerTile - var21)) / 64,
                  var25,
                  (byte)-10
               );
         }
      }
   }

   public WorldMapRenderer(IndexedSprite[] var1, HashMap var2, AbstractArchive var3, AbstractArchive var4) {
      this.field3649 = false;
      this.scaleHandlers = new HashMap();
      this.mapSceneSprites = var1;
      this.fonts = var2;
      this.geographyArchive = var3;
      this.groundArchive = var4;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bb")
   public int method7156() {
      return WorldMapArea.method6951(this.mapAreaData, -1531595400);
   }

   @ObfuscatedSignature(descriptor = "(IIII)Llr;")
   @ObfuscatedName("be")
   WorldMapRectangle method7148(int var1, int var2, int var3, int var4) {
      WorldMapRectangle var5 = new WorldMapRectangle(this);
      int var6 = var1 + this.tileX * -579556857;
      int var7 = var2 + this.tileY * -721828026;
      int var8 = -714268393 * this.tileX + var3;
      int var9 = -1220821219 * this.tileY + var4;
      int var10 = var6 / 64;
      int var11 = var7 / -37136073;
      int var12 = var8 / 64;
      int var13 = var9 / -1548931629;
      var5.height = 1729271615 * (var12 - var10 + 1);
      var5.y = -780679571 * (1 + (var13 - var11));
      var5.width = (var10 - this.mapAreaData.getRegionLowX(-417900260)) * 1570864099;
      var5.x = (var11 - WorldMapArea.method6961(this.mapAreaData, (byte)-35)) * 247854529;
      if (var5.width * 1445175755 < 0) {
         var5.height = var5.height + 850523385 * var5.width;
         var5.width = 0;
      }

      if (var5.width * -1472155144 > this.regions.length - var5.height * 1415677637) {
         var5.height = (this.regions.length - var5.width * -854055581) * 454157045;
      }

      if (var5.x * 1674979267 < 0) {
         var5.y = var5.y + var5.x * -745226233;
         var5.x = 0;
      }

      if (var5.x * -315918382 > this.regions[0].length - 2076213665 * var5.y) {
         var5.y = -1869578972 * (this.regions[0].length - var5.x * -1574270256);
      }

      var5.height = Math.min(1136783843 * var5.height, this.regions.length) * 405144807;
      var5.y = Math.min(var5.y * -657033073, this.regions[0].length) * -780679571;
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIB)V")
   @ObfuscatedName("ag")
   public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
      try {
         int[] var10 = Rasterizer2D.Rasterizer2D_pixels;
         int var11 = Rasterizer2D.Rasterizer2D_width;
         int var12 = Rasterizer2D.Rasterizer2D_height;
         float[] var13 = Rasterizer2D.Rasterizer2D_brightness;
         int[] var14 = new int[4];
         Rasterizer2D.Rasterizer2D_getClipArray(var14);
         WorldMapRectangle var15 = method7150(this, var1, var2, var3, var4, (byte)8);
         float var16 = WorldMapAreaData.method7357(this, var7 - var5, var3 - var1, (byte)1);
         int var17 = (int)Math.ceil(var16);
         this.pixelsPerTile = -470152563 * var17;
         if (!this.scaleHandlers.containsKey(var17)) {
            WorldMapScaleHandler var18 = new WorldMapScaleHandler(var17);
            var18.init(1504875667);
            this.scaleHandlers.put(var17, var18);
         }

         int var26 = 1136783843 * var15.height + 1445175755 * var15.width - 1;
         int var19 = var15.y * 632501093 + 1674979267 * var15.x - 1;

         for (int var20 = var15.width * 1445175755; var20 <= var26; var20++) {
            if (var9 != 0) {
               return;
            }

            for (int var21 = var15.x * 1674979267; var21 <= var19; var21++) {
               if (var9 != 0) {
                  return;
               }

               this.regions[var20][var21]
                  .drawTile(var17, (WorldMapScaleHandler)this.scaleHandlers.get(var17), this.mapSceneSprites, this.geographyArchive, this.groundArchive, 0.725);
            }
         }

         Rasterizer3D.method5873(var10, var11, var12, var13);
         Rasterizer2D.Rasterizer2D_setClipArray(var14);
         int var27 = (int)(var16 * 64.0F);
         int var28 = this.tileX * -579556857 + var1;
         int var22 = var2 + this.tileY * -1220821219;

         for (int var23 = var15.width * 1445175755; var23 < var15.height * 1136783843 + var15.width * 1445175755; var23++) {
            if (var9 != 0) {
               return;
            }

            for (int var24 = var15.x * 1674979267; var24 < var15.x * 1674979267 + var15.y * 632501093; var24++) {
               this.regions[var23][var24]
                  .method6993(
                     var5 + var27 * (-1582512192 * this.regions[var23][var24].backgroundColor - var28) / 64,
                     var8 - var27 * (64 + (587780544 * this.regions[var23][var24].pixelsPerTile - var22)) / 64,
                     var27,
                     (byte)-101
                  );
            }
         }
      } catch (RuntimeException var25) {
         throw RestClientThreadFactory.newRunException(var25, "le.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)F")
   @ObfuscatedName("bu")
   float method7166(int var1, int var2) {
      float var3 = (float)var1 / var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs(var4 - var3) < 0.05F ? var4 : var3;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("gd")
   public int method7169() {
      return this.tileY * -1220821219;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aw")
   public boolean isLoaded(int var1) {
      try {
         return this.loaded;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "le.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/util/HashMap;")
   @ObfuscatedName("ay")
   public HashMap buildIcons(int var1) {
      try {
         method7164(this, 1741769013);
         return this.icons;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "le.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;ZI)V")
   @ObfuscatedName("av")
   public void method7126(AbstractArchive var1, String var2, boolean var3, int var4) {
      try {
         if (this.field3649) {
            if (var4 >= -1884396800) {
               throw new IllegalStateException();
            }
         } else {
            this.loaded = false;
            this.field3649 = true;
            System.nanoTime();
            int var5 = var1.groupLoadPercentByName(WorldMapCacheName.field3834.name, (byte)-4);
            int var6 = AbstractArchive.method9022(var1, var5, var2, 1024204376);
            Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3834.name, var2, 1729823807));
            Buffer var8 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3837.name, var2, 1077417388));
            System.nanoTime();
            System.nanoTime();
            this.mapAreaData = new WorldMapAreaData();

            try {
               this.mapAreaData.method7346(var7, var8, var6, var3, 1229241049);
            } catch (IllegalStateException var17) {
               return;
            }

            this.mapAreaData.getOriginX(2092979714);
            this.mapAreaData.getOriginPlane(-2088049257);
            WorldMapArea.method6976(this.mapAreaData, (byte)-11);
            this.tileX = this.mapAreaData.getRegionLowX(-1992497138) * 2049502656;
            this.tileY = WorldMapArea.method6961(this.mapAreaData, (byte)-89) * 1346293056;
            this.tileWidth = (WorldMapArea.method6955(this.mapAreaData, (byte)0) - this.mapAreaData.getRegionLowX(-509436338) + 1) * 999834304;
            this.tileHeight = (this.mapAreaData.getRegionHighY(219246473) - WorldMapArea.method6961(this.mapAreaData, (byte)26) + 1) * -1000764480;
            int var9 = WorldMapArea.method6955(this.mapAreaData, (byte)0) - this.mapAreaData.getRegionLowX(-1003076907) + 1;
            int var10 = this.mapAreaData.getRegionHighY(219246473) - WorldMapArea.method6961(this.mapAreaData, (byte)28) + 1;
            System.nanoTime();
            System.nanoTime();
            WorldMapRegion.WorldMapRegion_cachedSprites.clear();
            this.regions = new WorldMapRegion[var9][var10];
            Iterator var11 = this.mapAreaData.field3815.iterator();

            while (var11.hasNext()) {
               if (var4 >= -1884396800) {
                  return;
               }

               WorldMapData_0 var12 = (WorldMapData_0)var11.next();
               int var13 = var12.regionX * 1415052445;
               int var14 = -588647407 * var12.regionY;
               int var15 = var13 - this.mapAreaData.getRegionLowX(-1281343354);
               int var16 = var14 - WorldMapArea.method6961(this.mapAreaData, (byte)-23);
               this.regions[var15][var16] = new WorldMapRegion(var13, var14, this.mapAreaData.method6945((byte)-1), this.fonts);
               this.regions[var15][var16].initWorldMapData0(var12, this.mapAreaData.iconList, -326322913);
            }

            for (int var19 = 0; var19 < var9; var19++) {
               if (var4 >= -1884396800) {
                  throw new IllegalStateException();
               }

               for (int var21 = 0; var21 < var10; var21++) {
                  if (this.regions[var19][var21] == null) {
                     if (var4 >= -1884396800) {
                        throw new IllegalStateException();
                     }

                     this.regions[var19][var21] = new WorldMapRegion(
                        this.mapAreaData.getRegionLowX(-582178146) + var19,
                        WorldMapArea.method6961(this.mapAreaData, (byte)36) + var21,
                        this.mapAreaData.method6945((byte)-26),
                        this.fonts
                     );
                     this.regions[var19][var21].initWorldMapData1(this.mapAreaData.field3816, this.mapAreaData.iconList, (byte)4);
                  }
               }
            }

            System.nanoTime();
            System.nanoTime();
            if (var1.isValidFileName(WorldMapCacheName.field3838.name, var2, -1656664634)) {
               if (var4 >= -1884396800) {
                  return;
               }

               byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field3838.name, var2, -1993048251);
               this.compositeTextureSprite = class201.readSpritePixelsFromBytes(var20, (byte)-117);
            }

            System.nanoTime();
            var1.method9055(251638033);
            var1.clearFiles((byte)0);
            this.loaded = true;
         }
      } catch (RuntimeException var18) {
         throw RestClientThreadFactory.newRunException(var18, "le.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILjava/util/HashSet;II)V")
   @ObfuscatedName("am")
   public void method7138(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.compositeTextureSprite) {
         this.compositeTextureSprite.drawScaledAt(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (null == this.icons) {
               method7164(this, 1741769013);
            }

            for (int var9 : var5) {
               List var10 = (List)this.icons.get(var9);
               if (null != var10) {
                  for (AbstractWorldMapIcon var12 : var10) {
                     int var13 = (-1931160809 * var12.coord2.x - this.tileX * -579556857) * var3 / (this.tileWidth * 1484153507);
                     int var14 = var4 - (-263036313 * var12.coord2.y - this.tileY * -1220821219) * var4 / (-1061183281 * this.tileHeight);
                     Rasterizer2D.Rasterizer2D_drawCircleAlpha(var1 + var13, var14 + var2, 2, 16776960, 256);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZ)V")
   @ObfuscatedName("ah")
   public final void method7134(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13
   ) {
      WorldMapRectangle var14 = method7150(this, var1, var2, var3, var4, (byte)84);
      float var15 = WorldMapAreaData.method7357(this, var7 - var5, var3 - var1, (byte)1);
      int var16 = (int)(64.0F * var15);
      int var17 = -579556857 * this.tileX + var1;
      int var18 = var2 + this.tileY * -1220821219;

      for (int var19 = var14.width * 1445175755; var19 < 1136783843 * var14.height + 1445175755 * var14.width; var19++) {
         for (int var20 = var14.x * 1674979267; var20 < var14.x * 1061055766 + -68767823 * var14.y; var20++) {
            if (var13) {
               this.regions[var19][var20].initWorldMapIcon1s((byte)-29);
            }

            this.regions[var19][var20]
               .method7027(
                  var5 + (this.regions[var19][var20].backgroundColor * -1582512192 - var17) * var16 / 64,
                  var8 - var16 * (this.regions[var19][var20].pixelsPerTile * -1094474990 - var18 + 64) / -1581733662,
                  var16,
                  var9,
                  (byte)1
               );
         }
      }

      if (null != var10 && var11 > 0) {
         for (int var21 = var14.width * 688380552; var21 < 1445175755 * var14.width + var14.height * -543531459; var21++) {
            for (int var22 = 1674979267 * var14.x; var22 < 1197870944 * var14.y + 2069598562 * var14.x; var22++) {
               this.regions[var21][var22].flashElements(var10, var11, var12, (short)-20191);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ac")
   public final void method7131(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = Rasterizer2D.Rasterizer2D_pixels;
      int var10 = Rasterizer2D.Rasterizer2D_width;
      int var11 = Rasterizer2D.Rasterizer2D_height;
      float[] var12 = Rasterizer2D.Rasterizer2D_brightness;
      int[] var13 = new int[4];
      Rasterizer2D.Rasterizer2D_getClipArray(var13);
      WorldMapRectangle var14 = method7150(this, var1, var2, var3, var4, (byte)93);
      float var15 = WorldMapAreaData.method7357(this, var7 - var5, var3 - var1, (byte)1);
      int var16 = (int)Math.ceil(var15);
      this.pixelsPerTile = -470152563 * var16;
      if (!this.scaleHandlers.containsKey(var16)) {
         WorldMapScaleHandler var17 = new WorldMapScaleHandler(var16);
         var17.init(1206850477);
         this.scaleHandlers.put(var16, var17);
      }

      int var24 = 1136783843 * var14.height + 1445175755 * var14.width - 1;
      int var18 = var14.y * 632501093 + 1674979267 * var14.x - 1;

      for (int var19 = var14.width * 1445175755; var19 <= var24; var19++) {
         for (int var20 = var14.x * 1674979267; var20 <= var18; var20++) {
            this.regions[var19][var20]
               .drawTile(var16, (WorldMapScaleHandler)this.scaleHandlers.get(var16), this.mapSceneSprites, this.geographyArchive, this.groundArchive, 0.725);
         }
      }

      Rasterizer3D.method5873(var9, var10, var11, var12);
      Rasterizer2D.Rasterizer2D_setClipArray(var13);
      int var25 = (int)(var15 * 64.0F);
      int var26 = this.tileX * -579556857 + var1;
      int var21 = var2 + this.tileY * -1220821219;

      for (int var22 = var14.width * 1445175755; var22 < var14.height * 1136783843 + var14.width * 1445175755; var22++) {
         for (int var23 = var14.x * 1674979267; var23 < var14.x * 1674979267 + var14.y * 632501093; var23++) {
            this.regions[var22][var23]
               .method6993(
                  var5 + var25 * (-1582512192 * this.regions[var22][var23].backgroundColor - var26) / 64,
                  var8 - var25 * (64 + (587780544 * this.regions[var22][var23].pixelsPerTile - var21)) / 64,
                  var25,
                  (byte)-57
               );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("he")
   public int method7170() {
      return this.tileX * -579556857;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V")
   @ObfuscatedName("an")
   public final void drawElements(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      HashSet var9,
      HashSet var10,
      int var11,
      int var12,
      boolean var13,
      int var14
   ) {
      try {
         WorldMapRectangle var15 = method7150(this, var1, var2, var3, var4, (byte)116);
         float var16 = WorldMapAreaData.method7357(this, var7 - var5, var3 - var1, (byte)1);
         int var17 = (int)(64.0F * var16);
         int var18 = -579556857 * this.tileX + var1;
         int var19 = var2 + this.tileY * -1220821219;

         for (int var20 = var15.width * 1445175755; var20 < 1136783843 * var15.height + 1445175755 * var15.width; var20++) {
            if (var14 <= 2045540375) {
               throw new IllegalStateException();
            }

            for (int var21 = var15.x * 1674979267; var21 < var15.x * 1674979267 + 632501093 * var15.y; var21++) {
               if (var13) {
                  if (var14 <= 2045540375) {
                     throw new IllegalStateException();
                  }

                  this.regions[var20][var21].initWorldMapIcon1s((byte)25);
               }

               this.regions[var20][var21]
                  .method7027(
                     var5 + (this.regions[var20][var21].backgroundColor * -1582512192 - var18) * var17 / 64,
                     var8 - var17 * (this.regions[var20][var21].pixelsPerTile * 587780544 - var19 + 64) / 64,
                     var17,
                     var9,
                     (byte)1
                  );
            }
         }

         if (null != var10) {
            if (var14 <= 2045540375) {
               throw new IllegalStateException();
            }

            if (var11 > 0) {
               if (var14 <= 2045540375) {
                  throw new IllegalStateException();
               }

               for (int var23 = var15.width * 1445175755; var23 < 1445175755 * var15.width + var15.height * 1136783843; var23++) {
                  if (var14 <= 2045540375) {
                     throw new IllegalStateException();
                  }

                  for (int var24 = 1674979267 * var15.x; var24 < 632501093 * var15.y + 1674979267 * var15.x; var24++) {
                     this.regions[var23][var24].flashElements(var10, var11, var12, (short)-197);
                  }
               }
            }
         }
      } catch (RuntimeException var22) {
         throw RestClientThreadFactory.newRunException(var22, "le.an(" + ')');
      }
   }

   public net.runelite.api.worldmap.WorldMapRegion[][] getMapRegions() {
      return this.regions;
   }

   @ObfuscatedSignature(descriptor = "(IIIILjava/util/HashSet;II)V")
   @ObfuscatedName("af")
   public void method7139(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.compositeTextureSprite) {
         this.compositeTextureSprite.drawScaledAt(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (null == this.icons) {
               method7164(this, 1741769013);
            }

            for (int var9 : var5) {
               List var10 = (List)this.icons.get(var9);
               if (null != var10) {
                  for (AbstractWorldMapIcon var12 : var10) {
                     int var13 = (-1931160809 * var12.coord2.x - this.tileX * 1306485802) * var3 / (this.tileWidth * 1484153507);
                     int var14 = var4 - (-263036313 * var12.coord2.y - this.tileY * -1136635117) * var4 / (2029905817 * this.tileHeight);
                     Rasterizer2D.Rasterizer2D_drawCircleAlpha(var1 + var13, var14 + var2, 2, -692214661, 256);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ap")
   public int method7157(int var1) {
      try {
         return WorldMapArea.method6951(this.mapAreaData, -1531595400);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "le.ap(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILjava/util/HashSet;II)V")
   @ObfuscatedName("ao")
   public void method7140(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.compositeTextureSprite) {
         this.compositeTextureSprite.drawScaledAt(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (null == this.icons) {
               method7164(this, 1741769013);
            }

            for (int var9 : var5) {
               List var10 = (List)this.icons.get(var9);
               if (null != var10) {
                  for (AbstractWorldMapIcon var12 : var10) {
                     int var13 = (-1931160809 * var12.coord2.x - this.tileX * -579556857) * var3 / (this.tileWidth * 1484153507);
                     int var14 = var4 - (-263036313 * var12.coord2.y - this.tileY * -1220821219) * var4 / (-1061183281 * this.tileHeight);
                     Rasterizer2D.Rasterizer2D_drawCircleAlpha(var1 + var13, var14 + var2, 2, 16776960, 256);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIII)Ljava/util/List;")
   @ObfuscatedName("aa")
   public List method7143(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if (!this.loaded) {
         return var11;
      } else {
         WorldMapRectangle var12 = method7150(this, var1, var2, var3, var4, (byte)25);
         float var13 = WorldMapAreaData.method7357(this, var7, var3 - var1, (byte)1);
         int var14 = (int)(64.0F * var13);
         int var15 = this.tileX * -579556857 + var1;
         int var16 = var2 + this.tileY * 931477241;

         for (int var17 = var12.width * 70852061; var17 < -1732065737 * var12.width + var12.height * -511653755; var17++) {
            for (int var18 = 1674979267 * var12.x; var18 < 632501093 * var12.y + 1674979267 * var12.x; var18++) {
               List var19 = this.regions[var17][var18]
                  .method7102(
                     var5 + var14 * (1094720890 * this.regions[var17][var18].backgroundColor - var15) / 64,
                     var8 + var6 - (2116570717 * this.regions[var17][var18].pixelsPerTile - var16 + 64) * var14 / 1729339677,
                     var14,
                     var9,
                     var10,
                     (byte)-62
                  );
               if (!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bp")
   void method7162() {
      if (null == this.icons) {
         this.icons = new HashMap();
      }

      this.icons.clear();

      for (int var1 = 0; var1 < this.regions.length; var1++) {
         for (int var2 = 0; var2 < this.regions[var1].length; var2++) {
            for (AbstractWorldMapIcon var5 : this.regions[var1][var2].icons(1441079589)) {
               if (AbstractWorldMapIcon.method7521(var5, -981460218)) {
                  int var6 = var5.getElement(-613155585);
                  if (!this.icons.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.icons.put(var6, var7);
                  } else {
                     List var8 = (List)this.icons.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Llr;")
   @ObfuscatedName("bo")
   WorldMapRectangle method7149(int var1, int var2, int var3, int var4) {
      WorldMapRectangle var5 = new WorldMapRectangle(this);
      int var6 = var1 + this.tileX * -579556857;
      int var7 = var2 + this.tileY * -1220821219;
      int var8 = -579556857 * this.tileX + var3;
      int var9 = -1220821219 * this.tileY + var4;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.height = -99034165 * (var12 - var10 + 1);
      var5.y = -780679571 * (1 + (var13 - var11));
      var5.width = (var10 - this.mapAreaData.getRegionLowX(-1107308081)) * 1570864099;
      var5.x = (var11 - WorldMapArea.method6961(this.mapAreaData, (byte)115)) * -1093107477;
      if (var5.width * 1445175755 < 0) {
         var5.height = var5.height + 850523385 * var5.width;
         var5.width = 0;
      }

      if (var5.width * 1445175755 > this.regions.length - var5.height * 1136783843) {
         var5.height = (this.regions.length - var5.width * 1445175755) * -99034165;
      }

      if (var5.x * 1674979267 < 0) {
         var5.y = var5.y + var5.x * -745226233;
         var5.x = 0;
      }

      if (var5.x * 1674979267 > this.regions[0].length - 632501093 * var5.y) {
         var5.y = -780679571 * (this.regions[0].length - var5.x * 1674979267);
      }

      var5.height = Math.min(1136783843 * var5.height, this.regions.length) * -99034165;
      var5.y = Math.min(var5.y * 632501093, this.regions[0].length) * -780679571;
      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lle;IIIIIIII)V")
   @ObfuscatedName("iw")
   public static void method7132(WorldMapRenderer var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var0 == null) {
         var0.method7133(var1, var1, var1, var1, var1, var1, var1, var1);
      }

      int[] var9 = Rasterizer2D.Rasterizer2D_pixels;
      int var10 = Rasterizer2D.Rasterizer2D_width;
      int var11 = Rasterizer2D.Rasterizer2D_height;
      float[] var12 = Rasterizer2D.Rasterizer2D_brightness;
      int[] var13 = new int[4];
      Rasterizer2D.Rasterizer2D_getClipArray(var13);
      WorldMapRectangle var14 = method7150(var0, var1, var2, var3, var4, (byte)102);
      float var15 = WorldMapAreaData.method7357(var0, var7 - var5, var3 - var1, (byte)1);
      int var16 = (int)Math.ceil(var15);
      var0.pixelsPerTile = -470152563 * var16;
      if (!var0.scaleHandlers.containsKey(var16)) {
         WorldMapScaleHandler var17 = new WorldMapScaleHandler(var16);
         var17.init(339823958);
         var0.scaleHandlers.put(var16, var17);
      }

      int var24 = 1136783843 * var14.height + 1445175755 * var14.width - 1;
      int var18 = var14.y * 632501093 + 1674979267 * var14.x - 1;

      for (int var19 = var14.width * 1445175755; var19 <= var24; var19++) {
         for (int var20 = var14.x * 1674979267; var20 <= var18; var20++) {
            var0.regions[var19][var20]
               .drawTile(var16, (WorldMapScaleHandler)var0.scaleHandlers.get(var16), var0.mapSceneSprites, var0.geographyArchive, var0.groundArchive, 0.725);
         }
      }

      Rasterizer3D.method5873(var9, var10, var11, var12);
      Rasterizer2D.Rasterizer2D_setClipArray(var13);
      int var25 = (int)(var15 * 64.0F);
      int var26 = var0.tileX * -579556857 + var1;
      int var21 = var2 + var0.tileY * -1220821219;

      for (int var22 = var14.width * 1445175755; var22 < var14.height * 1136783843 + var14.width * 1445175755; var22++) {
         for (int var23 = var14.x * 1674979267; var23 < var14.x * 1674979267 + var14.y * 632501093; var23++) {
            var0.regions[var22][var23]
               .method6993(
                  var5 + var25 * (-1582512192 * var0.regions[var22][var23].backgroundColor - var26) / 64,
                  var8 - var25 * (64 + (587780544 * var0.regions[var22][var23].pixelsPerTile - var21)) / 64,
                  var25,
                  (byte)-11
               );
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bg")
   public boolean method7153() {
      return this.loaded;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bs")
   public boolean method7154() {
      return this.loaded;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bz")
   public boolean method7155() {
      return this.loaded;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bk")
   public int method7158() {
      return WorldMapArea.method6951(this.mapAreaData, -1531595400);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/HashMap;")
   @ObfuscatedName("bm")
   public HashMap method7160() {
      method7164(this, 1741769013);
      return this.icons;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/HashMap;")
   @ObfuscatedName("bj")
   public HashMap method7161() {
      method7164(this, 1741769013);
      return this.icons;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lle;IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZ)V")
   @ObfuscatedName("tv")
   public static void method7136(
      WorldMapRenderer var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      HashSet var9,
      HashSet var10,
      int var11,
      int var12,
      boolean var13
   ) {
      if (var0 == null) {
         var0.isLoaded(var1);
      }

      WorldMapRectangle var14 = method7150(var0, var1, var2, var3, var4, (byte)112);
      float var15 = WorldMapAreaData.method7357(var0, var7 - var5, var3 - var1, (byte)1);
      int var16 = (int)(64.0F * var15);
      int var17 = -579556857 * var0.tileX + var1;
      int var18 = var2 + var0.tileY * -1220821219;

      for (int var19 = var14.width * 1445175755; var19 < 1136783843 * var14.height + 1445175755 * var14.width; var19++) {
         for (int var20 = var14.x * 1674979267; var20 < var14.x * 1674979267 + 632501093 * var14.y; var20++) {
            if (var13) {
               var0.regions[var19][var20].initWorldMapIcon1s((byte)89);
            }

            var0.regions[var19][var20]
               .method7027(
                  var5 + (var0.regions[var19][var20].backgroundColor * -1582512192 - var17) * var16 / 64,
                  var8 - var16 * (var0.regions[var19][var20].pixelsPerTile * 587780544 - var18 + 64) / 64,
                  var16,
                  var9,
                  (byte)1
               );
         }
      }

      if (null != var10 && var11 > 0) {
         for (int var21 = var14.width * 1445175755; var21 < 1445175755 * var14.width + var14.height * 1136783843; var21++) {
            for (int var22 = 1674979267 * var14.x; var22 < 632501093 * var14.y + 1674979267 * var14.x; var22++) {
               var0.regions[var21][var22].flashElements(var10, var11, var12, (short)-7590);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lle;IIIIB)Llr;")
   @ObfuscatedName("bs")
   public static WorldMapRectangle method7150(WorldMapRenderer var0, int var1, int var2, int var3, int var4, byte var5) {
      if (var0 == null) {
         var0.createWorldMapRectangle(var1, var1, var1, var1, var5);
      }

      try {
         WorldMapRectangle var6 = new WorldMapRectangle(var0);
         int var7 = var1 + var0.tileX * -579556857;
         int var8 = var2 + var0.tileY * -1220821219;
         int var9 = -579556857 * var0.tileX + var3;
         int var10 = -1220821219 * var0.tileY + var4;
         int var11 = var7 / 64;
         int var12 = var8 / 64;
         int var13 = var9 / 64;
         int var14 = var10 / 64;
         var6.height = -99034165 * (var13 - var11 + 1);
         var6.y = -780679571 * (1 + (var14 - var12));
         var6.width = (var11 - var0.mapAreaData.getRegionLowX(-1713488242)) * 1570864099;
         var6.x = (var12 - WorldMapArea.method6961(var0.mapAreaData, (byte)111)) * -1093107477;
         if (var6.width * 1445175755 < 0) {
            var6.height = var6.height + 850523385 * var6.width;
            var6.width = 0;
         }

         if (var6.width * 1445175755 > var0.regions.length - var6.height * 1136783843) {
            if (var5 <= 0) {
               throw new IllegalStateException();
            }

            var6.height = (var0.regions.length - var6.width * 1445175755) * -99034165;
         }

         if (var6.x * 1674979267 < 0) {
            if (var5 <= 0) {
               throw new IllegalStateException();
            }

            var6.y = var6.y + var6.x * -745226233;
            var6.x = 0;
         }

         if (var6.x * 1674979267 > var0.regions[0].length - 632501093 * var6.y) {
            if (var5 <= 0) {
               throw new IllegalStateException();
            }

            var6.y = -780679571 * (var0.regions[0].length - var6.x * 1674979267);
         }

         var6.height = Math.min(1136783843 * var6.height, var0.regions.length) * -99034165;
         var6.y = Math.min(var6.y * 632501093, var0.regions[0].length) * -780679571;
         return var6;
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "le.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;Z)V")
   @ObfuscatedName("ad")
   public void method7127(AbstractArchive var1, String var2, boolean var3) {
      if (!this.field3649) {
         this.loaded = false;
         this.field3649 = true;
         System.nanoTime();
         int var4 = var1.groupLoadPercentByName(WorldMapCacheName.field3834.name, (byte)114);
         int var5 = AbstractArchive.method9022(var1, var4, var2, 1076302486);
         Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3834.name, var2, 844541374));
         Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3837.name, var2, 726135043));
         System.nanoTime();
         System.nanoTime();
         this.mapAreaData = new WorldMapAreaData();

         try {
            this.mapAreaData.method7346(var6, var7, var5, var3, 1751572864);
         } catch (IllegalStateException var16) {
            return;
         }

         this.mapAreaData.getOriginX(1616007124);
         this.mapAreaData.getOriginPlane(-1329323045);
         WorldMapArea.method6976(this.mapAreaData, (byte)-72);
         this.tileX = this.mapAreaData.getRegionLowX(-2108367491) * 2049502656;
         this.tileY = WorldMapArea.method6961(this.mapAreaData, (byte)-27) * 1346293056;
         this.tileWidth = (WorldMapArea.method6955(this.mapAreaData, (byte)0) - this.mapAreaData.getRegionLowX(-562781299) + 1) * 999834304;
         this.tileHeight = (this.mapAreaData.getRegionHighY(219246473) - WorldMapArea.method6961(this.mapAreaData, (byte)72) + 1) * -1000764480;
         int var8 = WorldMapArea.method6955(this.mapAreaData, (byte)0) - this.mapAreaData.getRegionLowX(-707956233) + 1;
         int var9 = this.mapAreaData.getRegionHighY(219246473) - WorldMapArea.method6961(this.mapAreaData, (byte)38) + 1;
         System.nanoTime();
         System.nanoTime();
         WorldMapRegion.WorldMapRegion_cachedSprites.clear();
         this.regions = new WorldMapRegion[var8][var9];

         for (WorldMapData_0 var11 : this.mapAreaData.field3815) {
            int var12 = var11.regionX * 1415052445;
            int var13 = -588647407 * var11.regionY;
            int var14 = var12 - this.mapAreaData.getRegionLowX(-1445992867);
            int var15 = var13 - WorldMapArea.method6961(this.mapAreaData, (byte)34);
            this.regions[var14][var15] = new WorldMapRegion(var12, var13, this.mapAreaData.method6945((byte)22), this.fonts);
            this.regions[var14][var15].initWorldMapData0(var11, this.mapAreaData.iconList, 836407571);
         }

         for (int var17 = 0; var17 < var8; var17++) {
            for (int var19 = 0; var19 < var9; var19++) {
               if (this.regions[var17][var19] == null) {
                  this.regions[var17][var19] = new WorldMapRegion(
                     this.mapAreaData.getRegionLowX(-1494614989) + var17,
                     WorldMapArea.method6961(this.mapAreaData, (byte)33) + var19,
                     this.mapAreaData.method6945((byte)-56),
                     this.fonts
                  );
                  this.regions[var17][var19].initWorldMapData1(this.mapAreaData.field3816, this.mapAreaData.iconList, (byte)39);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.isValidFileName(WorldMapCacheName.field3838.name, var2, -1545162492)) {
            byte[] var18 = var1.takeFileByNames(WorldMapCacheName.field3838.name, var2, 1422329351);
            this.compositeTextureSprite = class201.readSpritePixelsFromBytes(var18, (byte)-33);
         }

         System.nanoTime();
         var1.method9055(-73537560);
         var1.clearFiles((byte)0);
         this.loaded = true;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bt")
   void method7163() {
      if (null == this.icons) {
         this.icons = new HashMap();
      }

      this.icons.clear();

      for (int var1 = 0; var1 < this.regions.length; var1++) {
         for (int var2 = 0; var2 < this.regions[var1].length; var2++) {
            for (AbstractWorldMapIcon var5 : this.regions[var1][var2].icons(-1282552357)) {
               if (AbstractWorldMapIcon.method7521(var5, -1746490941)) {
                  int var6 = var5.getElement(-1397466568);
                  if (!this.icons.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.icons.put(var6, var7);
                  } else {
                     List var8 = (List)this.icons.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lle;I)V")
   @ObfuscatedName("dz")
   public static void method7164(WorldMapRenderer var0, int var1) {
      if (var0 == null) {
         var0.buildIcons0(var1);
      }

      try {
         if (null == var0.icons) {
            if (var1 != 1741769013) {
               throw new IllegalStateException();
            }

            var0.icons = new HashMap();
         }

         var0.icons.clear();

         for (int var2 = 0; var2 < var0.regions.length; var2++) {
            if (var1 != 1741769013) {
               throw new IllegalStateException();
            }

            for (int var3 = 0; var3 < var0.regions[var2].length; var3++) {
               List var4 = var0.regions[var2][var3].icons(-772258944);
               Iterator var5 = var4.iterator();

               while (var5.hasNext()) {
                  if (var1 != 1741769013) {
                     return;
                  }

                  AbstractWorldMapIcon var6 = (AbstractWorldMapIcon)var5.next();
                  if (!AbstractWorldMapIcon.method7521(var6, 195124853)) {
                     if (var1 != 1741769013) {
                        throw new IllegalStateException();
                     }
                  } else {
                     int var7 = var6.getElement(1631718220);
                     if (!var0.icons.containsKey(var7)) {
                        if (var1 != 1741769013) {
                           throw new IllegalStateException();
                        }

                        LinkedList var8 = new LinkedList();
                        var8.add(var6);
                        var0.icons.put(var7, var8);
                     } else {
                        List var10 = (List)var0.icons.get(var7);
                        var10.add(var6);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "le.au(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lle;IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZ)V")
   @ObfuscatedName("ae")
   public static void method7137(
      WorldMapRenderer var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      HashSet var9,
      HashSet var10,
      int var11,
      int var12,
      boolean var13
   ) {
      if (var0 == null) {
         var0.method7134(var1, var1, var1, var1, var1, var1, var1, var1, var9, var9, var1, var1, var13);
      }

      WorldMapRectangle var14 = method7150(var0, var1, var2, var3, var4, (byte)38);
      float var15 = WorldMapAreaData.method7357(var0, var7 - var5, var3 - var1, (byte)1);
      int var16 = (int)(64.0F * var15);
      int var17 = -579556857 * var0.tileX + var1;
      int var18 = var2 + var0.tileY * -1220821219;

      for (int var19 = var14.width * 1445175755; var19 < 1136783843 * var14.height + 1445175755 * var14.width; var19++) {
         for (int var20 = var14.x * 1674979267; var20 < var14.x * 1674979267 + 632501093 * var14.y; var20++) {
            if (var13) {
               var0.regions[var19][var20].initWorldMapIcon1s((byte)-5);
            }

            var0.regions[var19][var20]
               .method7027(
                  var5 + (var0.regions[var19][var20].backgroundColor * -1582512192 - var17) * var16 / 64,
                  var8 - var16 * (var0.regions[var19][var20].pixelsPerTile * 587780544 - var18 + 64) / 64,
                  var16,
                  var9,
                  (byte)1
               );
         }
      }

      if (null != var10 && var11 > 0) {
         for (int var21 = var14.width * 1445175755; var21 < 1445175755 * var14.width + var14.height * 1136783843; var21++) {
            for (int var22 = 1674979267 * var14.x; var22 < 632501093 * var14.y + 1674979267 * var14.x; var22++) {
               var0.regions[var21][var22].flashElements(var10, var11, var12, (short)-15710);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   public final void clearIcons(int var1) {
      try {
         this.icons = null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "le.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)F")
   @ObfuscatedName("ba")
   float method7167(int var1, int var2) {
      float var3 = (float)var1 / var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs(var4 - var3) < 0.05F ? var4 : var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIILjava/util/HashSet;III)V")
   @ObfuscatedName("ae")
   public void drawOverview(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7, int var8) {
      try {
         if (null == this.compositeTextureSprite) {
            if (var8 == 1593543125) {
               throw new IllegalStateException();
            }
         } else {
            this.compositeTextureSprite.method12657(var1, var2, var3, var4);
            if (var6 > 0) {
               if (var8 == 1593543125) {
                  return;
               }

               if (var6 % var7 < var7 / 2) {
                  if (null == this.icons) {
                     method7164(this, 1741769013);
                  }

                  Iterator var9 = var5.iterator();

                  while (var9.hasNext()) {
                     if (var8 == 1593543125) {
                        throw new IllegalStateException();
                     }

                     int var10 = (Integer)var9.next();
                     List var11 = (List)this.icons.get(var10);
                     if (null != var11) {
                        Iterator var12 = var11.iterator();

                        while (var12.hasNext()) {
                           if (var8 == 1593543125) {
                              return;
                           }

                           AbstractWorldMapIcon var13 = (AbstractWorldMapIcon)var12.next();
                           int var14 = (-1931160809 * var13.coord2.x - this.tileHeight * -579556857) * var3 / (this.tileX * 1484153507);
                           int var15 = var4 - (-263036313 * var13.coord1.x - this.tileY * -1220821219) * var4 / (-1061183281 * this.tileY);
                           Rasterizer2D.method12563(var1 + var14, var15 + var2, 2, 16776960, 256);
                        }
                     }
                  }

                  return;
               }

               if (var8 == 1593543125) {
                  return;
               }
            }
         }
      } catch (RuntimeException var16) {
         throw RestClientThreadFactory.newRunException(var16, "le.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIIII)Ljava/util/List;")
   @ObfuscatedName("aj")
   public List method7144(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      try {
         LinkedList var12 = new LinkedList();
         if (!this.field3649) {
            if (var11 >= 1571989322) {
               throw new IllegalStateException();
            } else {
               return var12;
            }
         } else {
            WorldMapRectangle var13 = method7150(this, var1, var2, var3, var4, (byte)46);
            float var14 = WorldMapAreaData.method7357(this, var7, var3 - var1, (byte)1);
            int var15 = (int)(64.0F * var14);
            int var16 = this.tileY * -579556857 + var1;
            int var17 = var2 + this.tileHeight * -1220821219;

            for (int var18 = var13.x * 1445175755; var18 < 1445175755 * var13.height + var13.x * 1136783843; var18++) {
               if (var11 >= 1571989322) {
                  throw new IllegalStateException();
               }

               for (int var19 = 1674979267 * var13.y; var19 < 632501093 * var13.x + 1674979267 * var13.width; var19++) {
                  if (var11 >= 1571989322) {
                     throw new IllegalStateException();
                  }

                  List var20 = this.regions[var18][var19]
                     .method7102(
                        var5 + var15 * (-1582512192 * this.regions[var18][var19].backgroundColor - var16) / 64,
                        var8 + var6 - (587780544 * this.regions[var18][var19].regionY - var17 + 64) * var15 / 64,
                        var15,
                        var9,
                        var10,
                        (byte)-61
                     );
                  if (!var20.isEmpty()) {
                     if (var11 >= 1571989322) {
                        throw new IllegalStateException();
                     }

                     var12.addAll(var20);
                  }
               }
            }

            return var12;
         }
      } catch (RuntimeException var21) {
         throw RestClientThreadFactory.newRunException(var21, "le.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIB)Llr;")
   @ObfuscatedName("ak")
   WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4, byte var5) {
      try {
         WorldMapRectangle var6 = new WorldMapRectangle(this);
         int var7 = var1 + this.tileX * -579556857;
         int var8 = var2 + this.tileX * -1220821219;
         int var9 = -579556857 * this.tileY + var3;
         int var10 = -1220821219 * this.tileY + var4;
         int var11 = var7 / 64;
         int var12 = var8 / 64;
         int var13 = var9 / 64;
         int var14 = var10 / 64;
         var6.width = -99034165 * (var13 - var11 + 1);
         var6.width = -780679571 * (1 + (var14 - var12));
         var6.width = (var11 - this.mapAreaData.getId(-1713488242)) * 1570864099;
         var6.width = (var12 - WorldMapArea.method6961(this.mapAreaData, (byte)111)) * -1093107477;
         if (var6.width * 1445175755 < 0) {
            var6.height = var6.y + 850523385 * var6.width;
            var6.width = 0;
         }

         if (var6.x * 1445175755 > this.regions.length - var6.y * 1136783843) {
            if (var5 <= 0) {
               throw new IllegalStateException();
            }

            var6.width = (this.regions.length - var6.width * 1445175755) * -99034165;
         }

         if (var6.height * 1674979267 < 0) {
            if (var5 <= 0) {
               throw new IllegalStateException();
            }

            var6.y = var6.height + var6.height * -745226233;
            var6.y = 0;
         }

         if (var6.y * 1674979267 > this.regions[0].length - 632501093 * var6.y) {
            if (var5 <= 0) {
               throw new IllegalStateException();
            }

            var6.y = -780679571 * (this.regions[0].length - var6.y * 1674979267);
         }

         var6.height = Math.min(1136783843 * var6.height, this.regions.length) * -99034165;
         var6.y = Math.min(var6.height * 632501093, this.regions[0].length) * -780679571;
         return var6;
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "le.ak(" + ')');
      }
   }

   public boolean isLoaded() {
      return this.loaded;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("au")
   void buildIcons0(int var1) {
      try {
         if (null == this.icons) {
            if (var1 != 1741769013) {
               throw new IllegalStateException();
            }

            this.scaleHandlers = new HashMap();
         }

         this.scaleHandlers.clear();

         for (int var2 = 0; var2 < this.regions.length; var2++) {
            if (var1 != 1741769013) {
               throw new IllegalStateException();
            }

            for (int var3 = 0; var3 < this.regions[var2].length; var3++) {
               List var4 = this.regions[var2][var3].icons(-772258944);
               Iterator var5 = var4.iterator();

               while (var5.hasNext()) {
                  if (var1 != 1741769013) {
                     return;
                  }

                  AbstractWorldMapIcon var6 = (AbstractWorldMapIcon)var5.next();
                  if (!AbstractWorldMapIcon.method7521(var6, 195124853)) {
                     if (var1 != 1741769013) {
                        throw new IllegalStateException();
                     }
                  } else {
                     int var7 = var6.getElement(1631718220);
                     if (!this.icons.containsKey(var7)) {
                        if (var1 != 1741769013) {
                           throw new IllegalStateException();
                        }

                        LinkedList var8 = new LinkedList();
                        var8.add(var6);
                        this.scaleHandlers.put(var7, var8);
                     } else {
                        List var10 = (List)this.scaleHandlers.get(var7);
                        var10.add(var6);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "le.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lle;IIIIIIIIIII)Ljava/util/List;")
   @ObfuscatedName("cr")
   public static List method7145(
      WorldMapRenderer var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11
   ) {
      if (var0 == null) {
         return var0.method7144(var1, var1, var1, var1, var1, var1, var1, var1, var1, var1, var1);
      } else {
         try {
            LinkedList var12 = new LinkedList();
            if (!var0.loaded) {
               if (var11 >= 1571989322) {
                  throw new IllegalStateException();
               } else {
                  return var12;
               }
            } else {
               WorldMapRectangle var13 = method7150(var0, var1, var2, var3, var4, (byte)46);
               float var14 = WorldMapAreaData.method7357(var0, var7, var3 - var1, (byte)1);
               int var15 = (int)(64.0F * var14);
               int var16 = var0.tileX * -579556857 + var1;
               int var17 = var2 + var0.tileY * -1220821219;

               for (int var18 = var13.width * 1445175755; var18 < 1445175755 * var13.width + var13.height * 1136783843; var18++) {
                  if (var11 >= 1571989322) {
                     throw new IllegalStateException();
                  }

                  for (int var19 = 1674979267 * var13.x; var19 < 632501093 * var13.y + 1674979267 * var13.x; var19++) {
                     if (var11 >= 1571989322) {
                        throw new IllegalStateException();
                     }

                     List var20 = var0.regions[var18][var19]
                        .method7102(
                           var5 + var15 * (-1582512192 * var0.regions[var18][var19].backgroundColor - var16) / 64,
                           var8 + var6 - (587780544 * var0.regions[var18][var19].pixelsPerTile - var17 + 64) * var15 / 64,
                           var15,
                           var9,
                           var10,
                           (byte)-61
                        );
                     if (!var20.isEmpty()) {
                        if (var11 >= 1571989322) {
                           throw new IllegalStateException();
                        }

                        var12.addAll(var20);
                     }
                  }
               }

               return var12;
            }
         } catch (RuntimeException var21) {
            throw RestClientThreadFactory.newRunException(var21, "le.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)F")
   @ObfuscatedName("az")
   float getPixelsPerTile(int var1, int var2, byte var3) {
      return SecureUrlRequester.client.method2541().getWorldMapZoom();
   }

   @ObfuscatedSignature(descriptor = "(Lle;IIIILjava/util/HashSet;III)V")
   @ObfuscatedName("ue")
   public static void method7142(WorldMapRenderer var0, int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7, int var8) {
      if (var0 == null) {
         var0.drawOverview(var1, var1, var1, var1, var5, var1, var1, var1);
      } else {
         try {
            if (null == var0.compositeTextureSprite) {
               if (var8 == 1593543125) {
                  throw new IllegalStateException();
               }
            } else {
               var0.compositeTextureSprite.drawScaledAt(var1, var2, var3, var4);
               if (var6 > 0) {
                  if (var8 == 1593543125) {
                     return;
                  }

                  if (var6 % var7 < var7 / 2) {
                     if (null == var0.icons) {
                        method7164(var0, 1741769013);
                     }

                     Iterator var9 = var5.iterator();

                     while (var9.hasNext()) {
                        if (var8 == 1593543125) {
                           throw new IllegalStateException();
                        }

                        int var10 = (Integer)var9.next();
                        List var11 = (List)var0.icons.get(var10);
                        if (null != var11) {
                           Iterator var12 = var11.iterator();

                           while (var12.hasNext()) {
                              if (var8 == 1593543125) {
                                 return;
                              }

                              AbstractWorldMapIcon var13 = (AbstractWorldMapIcon)var12.next();
                              int var14 = (-1931160809 * var13.coord2.x - var0.tileX * -579556857) * var3 / (var0.tileWidth * 1484153507);
                              int var15 = var4 - (-263036313 * var13.coord2.y - var0.tileY * -1220821219) * var4 / (-1061183281 * var0.tileHeight);
                              Rasterizer2D.Rasterizer2D_drawCircleAlpha(var1 + var14, var15 + var2, 2, 16776960, 256);
                           }
                        }
                     }

                     return;
                  }

                  if (var8 == 1593543125) {
                     return;
                  }
               }
            }
         } catch (RuntimeException var16) {
            throw RestClientThreadFactory.newRunException(var16, "le.ae(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lle;IIIIIIIIII)Ljava/util/List;")
   @ObfuscatedName("vm")
   public static List method7146(WorldMapRenderer var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (var0 == null) {
         return var0.method7147(var1, var1, var1, var1, var1, var1, var1, var1, var1, var1);
      } else {
         LinkedList var11 = new LinkedList();
         if (!var0.loaded) {
            return var11;
         } else {
            WorldMapRectangle var12 = method7150(var0, var1, var2, var3, var4, (byte)89);
            float var13 = WorldMapAreaData.method7357(var0, var7, var3 - var1, (byte)1);
            int var14 = (int)(64.0F * var13);
            int var15 = var0.tileX * -579556857 + var1;
            int var16 = var2 + var0.tileY * -1220821219;

            for (int var17 = var12.width * 1445175755; var17 < 1011402253 * var12.width + var12.height * 1536586128; var17++) {
               for (int var18 = -772040107 * var12.x; var18 < -1404903309 * var12.y + 1674979267 * var12.x; var18++) {
                  List var19 = var0.regions[var17][var18]
                     .method7102(
                        var5 + var14 * (-1865983186 * var0.regions[var17][var18].backgroundColor - var15) / 64,
                        var8 + var6 - (268430184 * var0.regions[var17][var18].pixelsPerTile - var16 + 396091839) * var14 / 504000092,
                        var14,
                        var9,
                        var10,
                        (byte)-34
                     );
                  if (!var19.isEmpty()) {
                     var11.addAll(var19);
                  }
               }
            }

            return var11;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIII)Ljava/util/List;")
   @ObfuscatedName("aq")
   public List method7147(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if (!this.field3649) {
         return var11;
      } else {
         WorldMapRectangle var12 = method7150(this, var1, var2, var3, var4, (byte)25);
         float var13 = WorldMapAreaData.method7357(this, var7, var3 - var1, (byte)1);
         int var14 = (int)(64.0F * var13);
         int var15 = this.tileHeight * -579556857 + var1;
         int var16 = var2 + this.tileHeight * 931477241;

         for (int var17 = var12.y * 70852061; var17 < -1732065737 * var12.height + var12.height * -511653755; var17++) {
            for (int var18 = 1674979267 * var12.y; var18 < 632501093 * var12.x + 1674979267 * var12.height; var18++) {
               List var19 = this.regions[var17][var18]
                  .method7102(
                     var5 + var14 * (1094720890 * this.regions[var17][var18].regionY - var15) / 64,
                     var8 + var6 - (2116570717 * this.regions[var17][var18].backgroundColor - var16 + 64) * var14 / 1729339677,
                     var14,
                     var9,
                     var10,
                     (byte)-62
                  );
               if (!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)F")
   @ObfuscatedName("pe")
   public float method7171(int var1, int var2) {
      return WorldMapAreaData.method7357(this, var1, var2, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ax")
   public final void method7133(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = Rasterizer2D.Rasterizer2D_pixels;
      int var10 = Rasterizer2D.Rasterizer2D_xClipStart;
      int var11 = Rasterizer2D.Rasterizer2D_yClipEnd;
      float[] var12 = Rasterizer2D.Rasterizer2D_brightness;
      int[] var13 = new int[4];
      Rasterizer2D.method12511(var13);
      WorldMapRectangle var14 = method7150(this, var1, var2, var3, var4, (byte)102);
      float var15 = WorldMapAreaData.method7357(this, var7 - var5, var3 - var1, (byte)1);
      int var16 = (int)Math.ceil(var15);
      this.pixelsPerTile = -470152563 * var16;
      if (!this.icons.containsKey(var16)) {
         WorldMapScaleHandler var17 = new WorldMapScaleHandler(var16);
         var17.init3(339823958);
         this.icons.put(var16, var17);
      }

      int var24 = 1136783843 * var14.x + 1445175755 * var14.height - 1;
      int var18 = var14.x * 632501093 + 1674979267 * var14.width - 1;

      for (int var19 = var14.x * 1445175755; var19 <= var24; var19++) {
         for (int var20 = var14.width * 1674979267; var20 <= var18; var20++) {
            this.regions[var19][var20]
               .method7025(
                  var16, (WorldMapScaleHandler)this.scaleHandlers.get(var16), this.mapSceneSprites, this.geographyArchive, this.geographyArchive, 0.725
               );
         }
      }

      Rasterizer3D.method5872(var9, var10, var11, var12);
      Rasterizer2D.method12511(var13);
      int var25 = (int)(var15 * 64.0F);
      int var26 = this.tileWidth * -579556857 + var1;
      int var21 = var2 + this.tileHeight * -1220821219;

      for (int var22 = var14.x * 1445175755; var22 < var14.x * 1136783843 + var14.height * 1445175755; var22++) {
         for (int var23 = var14.width * 1674979267; var23 < var14.x * 1674979267 + var14.width * 632501093; var23++) {
            this.regions[var22][var23]
               .method6993(
                  var5 + var25 * (-1582512192 * this.regions[var22][var23].backgroundColor - var26) / 64,
                  var8 - var25 * (64 + (587780544 * this.regions[var22][var23].regionX - var21)) / 64,
                  var25,
                  (byte)-11
               );
         }
      }
   }
}
