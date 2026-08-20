import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ma")
public class WorldMapAreaData extends WorldMapArea {
   @ObfuscatedName("ac")
   List iconList;
   @ObfuscatedName("as")
   HashSet field3816;
   @ToRemove(unused = "true")
   @ObfuscatedName("cl")
   public static final int field3814 = 99;
   @ObfuscatedName("ai")
   HashSet field3815;

   @ObfuscatedSignature(descriptor = "(Lxa;Z)V")
   @ObfuscatedName("dc")
   void method7350(Buffer var1, boolean var2) {
      this.iconList = new LinkedList();
      int var3 = Buffer.method12008(var1, (byte)5);

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = var1.readNullableLargeSmart(-1883787719);
         Coord var6 = new Coord(Buffer.method12015(var1, 1846974751));
         boolean var7 = var1.readUnsignedByte(621126619) == 1;
         if (var2 || !var7) {
            this.iconList.add(new WorldMapIcon_0(null, var6, var5, null));
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Lxa;IZI)V")
   @ObfuscatedName("cj")
   void method7346(Buffer var1, Buffer var2, int var3, boolean var4, int var5) {
      try {
         WorldMapArea.method6905(this, var1, var3, (byte)64);
         int var6 = Buffer.method12008(var2, (byte)5);
         this.field3815 = new HashSet(var6);

         for (int var7 = 0; var7 < var6; var7++) {
            if (var5 <= -135513434) {
               throw new IllegalStateException();
            }

            WorldMapData_0 var8 = new WorldMapData_0();

            try {
               var8.init(var2, -1727864648);
            } catch (IllegalStateException var12) {
               continue;
            }

            this.field3815.add(var8);
         }

         int var14 = Buffer.method12008(var2, (byte)5);
         this.field3816 = new HashSet(var14);

         for (int var15 = 0; var15 < var14; var15++) {
            if (var5 <= -135513434) {
               throw new IllegalStateException();
            }

            WorldMapData_1 var9 = new WorldMapData_1();

            try {
               var9.init(var2, -1934724914);
            } catch (IllegalStateException var11) {
               continue;
            }

            this.field3816.add(var9);
         }

         method7354(this, var2, var4, -715824821);
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "ma.cj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("pl")
   static void method7358(int var0) {
      try {
         class468.clientPreferences.method1638(744188887 * client.field715, 2088135263);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ma.pl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Z)V")
   @ObfuscatedName("dv")
   void method7351(Buffer var1, boolean var2) {
      this.iconList = new LinkedList();
      int var3 = Buffer.method12008(var1, (byte)5);

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = var1.readNullableLargeSmart(-1784232284);
         Coord var6 = new Coord(Buffer.method12015(var1, 596305808));
         boolean var7 = var1.readUnsignedByte(187190203) == 1;
         if (var2 || !var7) {
            this.iconList.add(new WorldMapIcon_0(null, var6, var5, null));
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Lxa;IZ)V")
   @ObfuscatedName("dd")
   void method7347(Buffer var1, Buffer var2, int var3, boolean var4) {
      WorldMapArea.method6905(this, var1, var3, (byte)107);
      int var5 = Buffer.method12008(var2, (byte)5);
      this.field3815 = new HashSet(var5);

      for (int var6 = 0; var6 < var5; var6++) {
         WorldMapData_0 var7 = new WorldMapData_0();

         try {
            var7.init(var2, -1727864648);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.field3815.add(var7);
      }

      int var12 = Buffer.method12008(var2, (byte)5);
      this.field3816 = new HashSet(var12);

      for (int var13 = 0; var13 < var12; var13++) {
         WorldMapData_1 var8 = new WorldMapData_1();

         try {
            var8.init(var2, -1934724914);
         } catch (IllegalStateException var10) {
            continue;
         }

         this.field3816.add(var8);
      }

      method7354(this, var2, var4, 2005675285);
   }

   WorldMapAreaData() {
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Z)V")
   @ObfuscatedName("df")
   void method7352(Buffer var1, boolean var2) {
      this.iconList = new LinkedList();
      int var3 = Buffer.method12008(var1, (byte)5);

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = var1.readNullableLargeSmart(-1649354231);
         Coord var6 = new Coord(Buffer.method12015(var1, 634680920));
         boolean var7 = var1.readUnsignedByte(1027899625) == 1;
         if (var2 || !var7) {
            this.iconList.add(new WorldMapIcon_0(null, var6, var5, null));
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Z)V")
   @ObfuscatedName("db")
   void method7353(Buffer var1, boolean var2) {
      this.iconList = new LinkedList();
      int var3 = Buffer.method12008(var1, (byte)5);

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = var1.readNullableLargeSmart(-25991077);
         Coord var6 = new Coord(Buffer.method12015(var1, 2012345139));
         boolean var7 = var1.readUnsignedByte(-334114664) == 1;
         if (var2 || !var7) {
            this.iconList.add(new WorldMapIcon_0(null, var6, var5, null));
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lle;IIB)F")
   @ObfuscatedName("ji")
   public static float method7357(WorldMapRenderer var0, int var1, int var2, byte var3) {
      return var0 == null ? var0.getPixelsPerTile(var1, var1, var3) : SecureUrlRequester.client.method2541().getWorldMapZoom();
   }

   @ObfuscatedSignature(descriptor = "(Lma;Lxa;ZI)V")
   @ObfuscatedName("hj")
   public static void method7354(WorldMapAreaData var0, Buffer var1, boolean var2, int var3) {
      if (var0 == null) {
         var0.initIconsList(var1, var2, var3);
      }

      try {
         var0.iconList = new LinkedList();
         int var4 = Buffer.method12008(var1, (byte)5);

         for (int var5 = 0; var5 < var4; var5++) {
            if (var3 == -1793120611) {
               throw new IllegalStateException();
            }

            int var6 = var1.readNullableLargeSmart(-1859477312);
            Coord var7 = new Coord(Buffer.method12015(var1, -223678391));
            boolean var10000;
            if (var1.readUnsignedByte(2131769806) == 1) {
               if (var3 == -1793120611) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var8 = var10000;
            if (!var2) {
               if (var8) {
                  continue;
               }

               if (var3 == -1793120611) {
                  throw new IllegalStateException();
               }
            }

            var0.iconList.add(new WorldMapIcon_0(null, var7, var6, null));
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "ma.ca(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Lxa;IZ)V")
   @ObfuscatedName("cl")
   void method7348(Buffer var1, Buffer var2, int var3, boolean var4) {
      WorldMapArea.method6905(this, var1, var3, (byte)91);
      int var5 = Buffer.method12008(var2, (byte)5);
      this.field3815 = new HashSet(var5);

      for (int var6 = 0; var6 < var5; var6++) {
         WorldMapData_0 var7 = new WorldMapData_0();

         try {
            var7.init(var2, -1727864648);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.field3815.add(var7);
      }

      int var12 = Buffer.method12008(var2, (byte)5);
      this.field3816 = new HashSet(var12);

      for (int var13 = 0; var13 < var12; var13++) {
         WorldMapData_1 var8 = new WorldMapData_1();

         try {
            var8.init(var2, -1934724914);
         } catch (IllegalStateException var10) {
            continue;
         }

         this.field3816.add(var8);
      }

      method7354(this, var2, var4, -1017505981);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lma;Lxa;Lxa;IZ)V")
   @ObfuscatedName("zt")
   public static void method7349(WorldMapAreaData var0, Buffer var1, Buffer var2, int var3, boolean var4) {
      if (var0 == null) {
         var0.method7347(var1, var1, var3, var4);
      } else {
         WorldMapArea.method6905(var0, var1, var3, (byte)96);
         int var5 = Buffer.method12008(var2, (byte)5);
         var0.field3815 = new HashSet(var5);

         for (int var6 = 0; var6 < var5; var6++) {
            WorldMapData_0 var7 = new WorldMapData_0();

            try {
               var7.init(var2, -1727864648);
            } catch (IllegalStateException var11) {
               continue;
            }

            var0.field3815.add(var7);
         }

         int var12 = Buffer.method12008(var2, (byte)5);
         var0.field3816 = new HashSet(var12);

         for (int var13 = 0; var13 < var12; var13++) {
            WorldMapData_1 var8 = new WorldMapData_1();

            try {
               var8.init(var2, -1934724914);
            } catch (IllegalStateException var10) {
               continue;
            }

            var0.field3816.add(var8);
         }

         method7354(var0, var2, var4, 3250381);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Z)V")
   @ObfuscatedName("dy")
   void method7355(Buffer var1, boolean var2) {
      this.iconList = new LinkedList();
      int var3 = Buffer.method12008(var1, (byte)5);

      for (int var4 = 0; var4 < var3; var4++) {
         int var5 = var1.readNullableLargeSmart(-1418727059);
         Coord var6 = new Coord(Buffer.method12015(var1, 1210295859));
         boolean var7 = var1.readUnsignedByte(-1716781454) == 1;
         if (var2 || !var7) {
            this.iconList.add(new WorldMapIcon_0(null, var6, var5, null));
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;ZI)V")
   @ObfuscatedName("ca")
   void initIconsList(Buffer var1, boolean var2, int var3) {
      try {
         this.iconList = new LinkedList();
         int var4 = Buffer.method12008(var1, (byte)5);

         for (int var5 = 0; var5 < var4; var5++) {
            if (var3 == -1793120611) {
               throw new IllegalStateException();
            }

            int var6 = var1.readMedium(-1859477312);
            Coord var7 = new Coord(Buffer.method12015(var1, -223678391));
            boolean var10000;
            if (var1.readUnsignedIntIME(2131769806) == 1) {
               if (var3 == -1793120611) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var8 = var10000;
            if (!var2) {
               if (var8) {
                  continue;
               }

               if (var3 == -1793120611) {
                  throw new IllegalStateException();
               }
            }

            this.iconList.add(new WorldMapIcon_0(null, var7, var6, null));
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "ma.ca(" + ')');
      }
   }
}
