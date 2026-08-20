import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lq")
public abstract class AbstractWorldMapData {
   @ObfuscatedSignature(descriptor = "Lbf;")
   @ObfuscatedName("np")
   static LoginState loginState;
   @ObfuscatedName("aj")
   int regionXLow;
   @ObfuscatedName("ak")
   int regionYLow;
   @ObfuscatedName("aw")
   int regionX;
   @ObfuscatedName("ap")
   int regionY;
   @ObfuscatedName("ay")
   int minPlane;
   @ObfuscatedName("ax")
   boolean field3745;
   @ObfuscatedName("ar")
   boolean field3742;
   @ObfuscatedName("ad")
   int fileId;
   @ObfuscatedName("ae")
   short[][][] floorUnderlayIds;
   @ObfuscatedName("ai")
   short[][][] floorOverlayIds;
   @ObfuscatedName("ac")
   byte[][][] field3754;
   @ObfuscatedSignature(descriptor = "[[[[Llm;")
   @ObfuscatedName("ab")
   WorldMapDecoration[][][][] decorations;
   @ObfuscatedName("as")
   byte[][][] field3755;
   @ObfuscatedName("au")
   int planes;
   @ToRemove(unused = "true")
   @ObfuscatedName("ck")
   public static final int field3752 = 80;
   @ObfuscatedName("az")
   int groupId = -514790051;

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("af")
   boolean isFullyLoaded(int var1) {
      try {
         if (this.field3745) {
            if (var1 != 886741517) {
               throw new IllegalStateException();
            }

            if (this.field3742) {
               if (var1 != 886741517) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lq.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llq;)Z")
   @ObfuscatedName("ng")
   public static boolean method7226(AbstractWorldMapData var0) {
      return var0.field3745 && var0.field3742;
   }

   @ObfuscatedSignature(descriptor = "(Lqm;I)V")
   @ObfuscatedName("am")
   void loadGeography(AbstractArchive var1, int var2) {
      try {
         if (!this.isFullyLoaded(886741517)) {
            byte[] var3 = var1.getFile(2080583947 * this.groupId, this.fileId * 1713870949, -1266341933);
            if (null != var3) {
               if (var2 == -1083217587) {
                  throw new IllegalStateException();
               }

               this.readGeography(new Buffer(var3), -1502866197);
               this.field3745 = true;
               this.field3742 = true;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lq.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(CI)Z")
   @ObfuscatedName("ag")
   public static boolean method7256(char var0, int var1) {
      try {
         if (var0 >= ' ') {
            if (var1 != -580673349) {
               throw new IllegalStateException();
            }

            if (var0 < 127) {
               return true;
            }

            if (var1 != -580673349) {
               throw new IllegalStateException();
            }
         }

         if (var0 > 127) {
            if (var1 != -580673349) {
               throw new IllegalStateException();
            }

            if (var0 < 160) {
               return true;
            }

            if (var1 != -580673349) {
               throw new IllegalStateException();
            }
         }

         if (var0 <= 160 || var0 > 255) {
            if (0 != var0) {
               if (var1 != -580673349) {
                  throw new IllegalStateException();
               }

               char[] var2 = class451.cp1252AsciiExtension;

               for (int var3 = 0; var3 < var2.length; var3++) {
                  if (var1 != -580673349) {
                     throw new IllegalStateException();
                  }

                  char var4 = var2[var3];
                  if (var0 == var4) {
                     return true;
                  }
               }
            }

            return false;
         } else if (var1 != -580673349) {
            throw new IllegalStateException();
         } else {
            return true;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "lq.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   void method7236() {
      this.floorUnderlayIds = (short[][][])null;
      this.floorOverlayIds = (short[][][])null;
      this.field3755 = (byte[][][])null;
      this.field3754 = (byte[][][])null;
      this.decorations = (WorldMapDecoration[][][][])null;
      this.field3745 = false;
      this.field3742 = false;
   }

   @ObfuscatedSignature(descriptor = "(IILxa;II)V")
   @ObfuscatedName("be")
   void method7246(int var1, int var2, Buffer var3, int var4, int var5) {
      try {
         int var6 = ((var4 & 24) >> 3) + 1;
         boolean var10000;
         if ((var4 & 2) != 0) {
            if (var5 != -231674939) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var7 = var10000;
         if ((var4 & 4) != 0) {
            if (var5 != -231674939) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var8 = var10000;
         this.floorUnderlayIds[0][var1][var2] = (short)Buffer.method12008(var3, (byte)5);
         if (var7) {
            int var9 = var3.readUnsignedByte(922556714);

            for (int var10 = 0; var10 < var9; var10++) {
               if (var5 != -231674939) {
                  return;
               }

               int var11 = Buffer.method12008(var3, (byte)5);
               if (var11 != 0) {
                  this.floorOverlayIds[var10][var1][var2] = (short)var11;
                  int var12 = var3.readUnsignedByte(-1264893761);
                  this.field3755[var10][var1][var2] = (byte)(var12 >> 2);
                  this.field3754[var10][var1][var2] = (byte)(var12 & 3);
               }
            }
         }

         if (var8) {
            for (int var16 = 0; var16 < var6; var16++) {
               int var17 = var3.readUnsignedByte(838569768);
               if (var17 == 0) {
                  if (var5 != -231674939) {
                     return;
                  }
               } else {
                  WorldMapDecoration[] var18 = this.decorations[var16][var1][var2] = new WorldMapDecoration[var17];

                  for (int var19 = 0; var19 < var17; var19++) {
                     int var13 = var3.readNullableLargeSmart(-1155008031);
                     int var14 = var3.readUnsignedByte(1220668384);
                     var18[var19] = new WorldMapDecoration(var13, var14 >> 2, var14 & 3);
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "lq.be(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("bo")
   int getRegionX(byte var1) {
      try {
         return 1415052445 * this.regionX;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lq.bo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bq")
   int method7251() {
      return this.regionY * -588647407;
   }

   @ObfuscatedSignature(descriptor = "(Llq;I)I")
   @ObfuscatedName("kk")
   public static int method7252(AbstractWorldMapData var0, int var1) {
      if (var0 == null) {
         return var0.getRegionY(var1);
      } else {
         try {
            return var0.regionY * -588647407;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "lq.bg(" + 41);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llq;)Z")
   @ObfuscatedName("xs")
   public static boolean method7227(AbstractWorldMapData var0) {
      return var0.field3745 && var0.field3742;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ae")
   abstract void vmethod287(Buffer var1);

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   abstract void vmethod286(Buffer var1);

   @ObfuscatedSignature(descriptor = "(IILxa;)V")
   @ObfuscatedName("by")
   void method7239(int var1, int var2, Buffer var3) {
      int var4 = var3.readUnsignedByte(1874670536);
      if (var4 != 0) {
         if (0 != (var4 & 1)) {
            this.method7245(var1, var2, var3, var4, 771309514);
         } else {
            this.method7246(var1, var2, var3, var4, -231674939);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("at")
   abstract void readGeography(Buffer var1, int var2);

   @ObfuscatedSignature(descriptor = "(Llq;IILxa;B)V")
   @ObfuscatedName("lq")
   public static void method7240(AbstractWorldMapData var0, int var1, int var2, Buffer var3, byte var4) {
      if (var0 == null) {
         var0.readTile(var1, var1, var3, var4);
      } else {
         try {
            int var5 = var3.readUnsignedByte(-191242777);
            if (var5 == 0) {
               if (var4 <= 0) {
                  throw new IllegalStateException();
               }
            } else {
               if (0 != (var5 & 1)) {
                  var0.method7245(var1, var2, var3, var5, 2089758707);
               } else {
                  var0.method7246(var1, var2, var3, var5, -231674939);
               }
            }
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "lq.aa(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bm")
   boolean method7228() {
      return this.field3745 && this.field3742;
   }

   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("bp")
   void method7233(AbstractArchive var1) {
      if (!this.isFullyLoaded(886741517)) {
         byte[] var2 = var1.getFile(2080583947 * this.groupId, this.fileId * -1959981760, -1001831049);
         if (null != var2) {
            this.readGeography(new Buffer(var2), -1697452628);
            this.field3745 = true;
            this.field3742 = true;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llq;)Z")
   @ObfuscatedName("xu")
   public static boolean method7229(AbstractWorldMapData var0) {
      return var0.field3745 && var0.field3742;
   }

   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("bt")
   void method7234(AbstractArchive var1) {
      if (!this.isFullyLoaded(886741517)) {
         byte[] var2 = var1.getFile(2080583947 * this.groupId, this.fileId * 1713870949, -847799057);
         if (null != var2) {
            this.readGeography(new Buffer(var2), -1227880074);
            this.field3745 = true;
            this.field3742 = true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;)V")
   @ObfuscatedName("bu")
   void method7235(AbstractArchive var1) {
      if (!this.isFullyLoaded(886741517)) {
         byte[] var2 = var1.getFile(-139210736 * this.groupId, this.fileId * 1713870949, 1069907093);
         if (null != var2) {
            this.readGeography(new Buffer(var2), -1894611648);
            this.field3745 = true;
            this.field3742 = true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ba")
   void method7237() {
      this.floorUnderlayIds = (short[][][])null;
      this.floorOverlayIds = (short[][][])null;
      this.field3755 = (byte[][][])null;
      this.field3754 = (byte[][][])null;
      this.decorations = (WorldMapDecoration[][][][])null;
      this.field3745 = false;
      this.field3742 = false;
   }

   AbstractWorldMapData() {
      this.fileId = 881501843;
      this.field3745 = false;
      this.field3742 = false;
      new LinkedList();
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ao")
   void reset(byte var1) {
      try {
         this.floorUnderlayIds = (short[][][])null;
         this.floorOverlayIds = (short[][][])null;
         this.field3755 = (byte[][][])null;
         this.field3754 = (byte[][][])null;
         this.decorations = (WorldMapDecoration[][][][])null;
         this.field3745 = false;
         this.field3742 = false;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lq.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILxa;)V")
   @ObfuscatedName("bw")
   void method7241(int var1, int var2, Buffer var3) {
      int var4 = var3.readUnsignedByte(775029324);
      if (var4 != 0) {
         if (0 != (var4 & 1)) {
            this.method7245(var1, var2, var3, var4, 544510827);
         } else {
            this.method7246(var1, var2, var3, var4, -231674939);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IILxa;I)V")
   @ObfuscatedName("bn")
   void method7243(int var1, int var2, Buffer var3, int var4) {
      boolean var5 = 0 != (var4 & 2);
      if (var5) {
         this.floorOverlayIds[0][var1][var2] = (short)Buffer.method12008(var3, (byte)5);
      }

      this.floorUnderlayIds[0][var1][var2] = (short)Buffer.method12008(var3, (byte)5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llq;IILxa;I)V")
   @ObfuscatedName("tc")
   public static void method7244(AbstractWorldMapData var0, int var1, int var2, Buffer var3, int var4) {
      if (var0 == null) {
         var0.method7246(var1, var1, var3, var1, var1);
      } else {
         boolean var5 = 0 != (var4 & 2);
         if (var5) {
            var0.floorOverlayIds[0][var1][var2] = (short)Buffer.method12008(var3, (byte)5);
         }

         var0.floorUnderlayIds[0][var1][var2] = (short)Buffer.method12008(var3, (byte)5);
      }
   }

   @ObfuscatedSignature(descriptor = "(IILxa;II)V")
   @ObfuscatedName("aq")
   void method7245(int var1, int var2, Buffer var3, int var4, int var5) {
      try {
         boolean var10000;
         if (0 != (var4 & 2)) {
            if (var5 == 992961277) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var6 = var10000;
         if (var6) {
            if (var5 == 992961277) {
               throw new IllegalStateException();
            }

            this.floorOverlayIds[0][var1][var2] = (short)Buffer.method12008(var3, (byte)5);
         }

         this.floorUnderlayIds[0][var1][var2] = (short)Buffer.method12008(var3, (byte)5);
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "lq.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILxa;I)V")
   @ObfuscatedName("br")
   void method7247(int var1, int var2, Buffer var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = (var4 & 4) != 0;
      this.floorUnderlayIds[0][var1][var2] = (short)Buffer.method12008(var3, (byte)5);
      if (var6) {
         int var8 = var3.readUnsignedByte(1154931202);

         for (int var9 = 0; var9 < var8; var9++) {
            int var10 = Buffer.method12008(var3, (byte)5);
            if (var10 != 0) {
               this.floorOverlayIds[var9][var1][var2] = (short)var10;
               int var11 = var3.readUnsignedByte(605263434);
               this.field3755[var9][var1][var2] = (byte)(var11 >> 2);
               this.field3754[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if (var7) {
         for (int var14 = 0; var14 < var5; var14++) {
            int var15 = var3.readUnsignedByte(-834437643);
            if (var15 != 0) {
               WorldMapDecoration[] var16 = this.decorations[var14][var1][var2] = new WorldMapDecoration[var15];

               for (int var17 = 0; var17 < var15; var17++) {
                  int var12 = var3.readNullableLargeSmart(-44138542);
                  int var13 = var3.readUnsignedByte(-728265216);
                  var16[var17] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bh")
   int method7250() {
      return 1415052445 * this.regionX;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llq;)Z")
   @ObfuscatedName("yu")
   public static boolean method7230(AbstractWorldMapData var0) {
      return var0.field3745 && var0.field3742;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bs")
   boolean method7231() {
      return this.field3745 && this.field3742;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bc")
   int method7253() {
      return this.regionY * -588647407;
   }

   @ObfuscatedSignature(descriptor = "(IILxa;I)V")
   @ObfuscatedName("bd")
   void method7248(int var1, int var2, Buffer var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = (var4 & 4) != 0;
      this.floorUnderlayIds[0][var1][var2] = (short)Buffer.method12008(var3, (byte)5);
      if (var6) {
         int var8 = var3.readUnsignedByte(73351409);

         for (int var9 = 0; var9 < var8; var9++) {
            int var10 = Buffer.method12008(var3, (byte)5);
            if (var10 != 0) {
               this.floorOverlayIds[var9][var1][var2] = (short)var10;
               int var11 = var3.readUnsignedByte(831378641);
               this.field3755[var9][var1][var2] = (byte)(var11 >> 2);
               this.field3754[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if (var7) {
         for (int var14 = 0; var14 < var5; var14++) {
            int var15 = var3.readUnsignedByte(-463452628);
            if (var15 != 0) {
               WorldMapDecoration[] var16 = this.decorations[var14][var1][var2] = new WorldMapDecoration[var15];

               for (int var17 = 0; var17 < var15; var17++) {
                  int var12 = var3.readNullableLargeSmart(-1225633235);
                  int var13 = var3.readUnsignedByte(352182517);
                  var16[var17] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bl")
   int method7254() {
      return this.regionY * -588647407;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIB)V")
   @ObfuscatedName("kh")
   static void method7258(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         class136.method4083(AsyncHttpResponse.worldView, var0, var1, var2, var3, var4, 1949871975);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "lq.kh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIISISIII)V")
   @ObfuscatedName("kf")
   static void method7257(int var0, int var1, int var2, int var3, int var4, short var5, int var6, short var7, int var8, int var9, int var10) {
      try {
         WorldMapIcon_1.method7190(AsyncHttpResponse.worldView, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, -1779441028);
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "lq.kf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IILxa;B)V")
   @ObfuscatedName("aa")
   void readTile(int var1, int var2, Buffer var3, byte var4) {
      try {
         int var5 = var3.method12100(-191242777);
         if (var5 == 0) {
            if (var4 <= 0) {
               throw new IllegalStateException();
            }
         } else {
            if (0 != (var5 & 1)) {
               this.method7246(var1, var2, var3, var5, 2089758707);
            } else {
               this.method7245(var1, var2, var3, var5, -231674939);
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "lq.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bg")
   int getRegionY(int var1) {
      try {
         return this.minPlane * -588647407;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lq.bg(" + 41);
      }
   }
}
