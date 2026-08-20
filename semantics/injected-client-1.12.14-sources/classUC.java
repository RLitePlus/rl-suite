import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uc")
public class classUC extends class520 {
   @ObfuscatedSignature(descriptor = "Lkb;")
   @ObfuscatedName("at")
   final WorldEntityCoord field6020;
   @ObfuscatedName("an")
   int field6017;
   @ObfuscatedSignature(descriptor = "Lkb;")
   @ObfuscatedName("ag")
   final WorldEntityCoord field6018 = new WorldEntityCoord();
   @ObfuscatedName("av")
   static final int field6016 = 743666367 + -1140525731 * client.revision;
   @ObfuscatedName("ae")
   int field6019;

   @ObfuscatedSignature(descriptor = "(Lkb;Lto;I)V")
   @ObfuscatedName("an")
   @Override
   void vmethod392(WorldEntityCoord var1, WorldEntityCoordSnapshot var2, int var3) {
      this.field6018.method6262(var1, 150686871);
      this.field6020.method6262(var2.worldEntityCoord, -348493495);
      this.field6017 = 1785496145 * (var3 - 1);
      this.field6019 = -2057452229 * field6016 + var2.field5948 * 1676142777;
   }

   @ObfuscatedSignature(descriptor = "(Lkb;Lto;II)V")
   @ObfuscatedName("av")
   @Override
   void vmethod393(WorldEntityCoord var1, WorldEntityCoordSnapshot var2, int var3, int var4) {
      try {
         this.field6018.method6262(var1, 1241919375);
         this.field6020.method6262(var2.worldEntityCoord, -786812552);
         this.field6017 = 963660187 * (var3 - 1);
         this.field6019 = -2057452229 * field6016 + var2.field5948 * 1676142777;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "uc.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;II)Z")
   @ObfuscatedName("ay")
   @Override
   boolean vmethod396(WorldEntityCoord var1, int var2, int var3) {
      if (1455643075 * this.field6017 >= this.field6019 * -1916515369) {
         var1.method6262(this.field6020, 1716951913);
         return true;
      } else {
         int var5 = this.field6017 * -1476725613;
         int var6 = this.field6019 * -1014011635;
         float var4 = (float)(var2 - var5) / (var6 - var5);
         WorldEntityCoord var8 = this.field6018;
         WorldEntityCoord var9 = this.field6020;
         float var10 = GameEngine.method693(0.0F, 1.0F, var4, -327702474);
         int var11 = var9.getY(-1876518155) - var8.getY(-1907898540);
         int var12 = var9.getZ(1451977832) - var8.getZ(1033108675);
         var11 = (int)(var11 * var10);
         var12 = (int)(var12 * var10);
         var1.method6266(var8.getY(-1797170372) + var11, var8.getZ(1265436059) + var12, 479850372);
         int var13 = WorldMapRegion.method6992(var8.getX(-821433751), var9.getX(-45211656), (byte)20);
         var13 = (int)(var10 * var13);
         var1.setOrientation(var8.getX(1341279154) + var13, 2082027121);
         return var4 >= 1.0F;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod401(int var1, int var2, byte var3) {
      try {
         this.field6018.setDirection(var1, var2, 1161831867);
         this.field6020.setDirection(var1, var2, 1161831867);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "uc.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;Lkb;FLkb;)V")
   @ObfuscatedName("ht")
   public static void method11095(WorldEntityCoord var0, WorldEntityCoord var1, float var2, WorldEntityCoord var3) {
      if (var2 < 0.0F) {
         var2 = 0.0F;
      }

      if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      int var4 = var1.x * -639471049 - var0.x * -639471049;
      int var5 = var1.y * -430111663 - var0.y * -430111663;
      var4 = (int)(var2 * var4);
      var5 = (int)(var2 * var5);
      var3.x = (var0.x * -639471049 + var4) * 1487528839;
      var3.y = (var0.y * -430111663 + var5) * 767739057;
      int var6 = var1.orientation * 459733525 - var0.orientation * 459733525 & 2047;
      if (var6 > 1024) {
         var6 = -(2048 - var6);
      }

      var6 = (int)(var6 * var2);
      var3.orientation = (var0.orientation * 459733525 + var6 & 2047) * -398195395;
   }

   @ObfuscatedSignature(descriptor = "(FII)F")
   @ObfuscatedName("st")
   public static float method11096(float var0, int var1, int var2) {
      return (var0 - var1) / (var2 - var1);
   }

   classUC() {
      this.field6020 = new WorldEntityCoord();
      this.field6017 = 0;
      this.field6019 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lkb;Lto;I)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod394(WorldEntityCoord var1, WorldEntityCoordSnapshot var2, int var3) {
      this.field6018.method6262(var1, -154267586);
      this.field6020.method6262(var2.worldEntityCoord, -485290178);
      this.field6017 = 963660187 * (var3 - 1);
      this.field6019 = -2057452229 * field6016 + var2.field5948 * 1676142777;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lja;Ljava/lang/String;)Ljk;")
   @ObfuscatedName("qd")
   public static class236 method11094(classJA var0, String var1) {
      return (class236)var0.field2797.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lkb;Lto;I)V")
   @ObfuscatedName("aj")
   @Override
   void vmethod395(WorldEntityCoord var1, WorldEntityCoordSnapshot var2, int var3) {
      this.field6018.method6262(var1, 271200141);
      this.field6020.method6262(var2.worldEntityCoord, 1498414422);
      this.field6017 = -1404221538 * (var3 - 1);
      this.field6019 = 1786323313 * field6016 + var2.field5948 * 1676142777;
   }

   @ObfuscatedSignature(descriptor = "(Lkb;II)Z")
   @ObfuscatedName("ak")
   @Override
   boolean vmethod397(WorldEntityCoord var1, int var2, int var3) {
      if (-1476725613 * this.field6017 >= this.field6019 * 98305895) {
         var1.method6262(this.field6020, 1768028865);
         return true;
      } else {
         int var5 = this.field6017 * -1476725613;
         int var6 = this.field6019 * 98305895;
         float var4 = (float)(var2 - var5) / (var6 - var5);
         WorldEntityCoord var8 = this.field6018;
         WorldEntityCoord var9 = this.field6020;
         float var10 = GameEngine.method693(0.0F, 1.0F, var4, -2064653909);
         int var11 = var9.getY(-2132441277) - var8.getY(-1677631810);
         int var12 = var9.getZ(1715141063) - var8.getZ(753636248);
         var11 = (int)(var11 * var10);
         var12 = (int)(var12 * var10);
         var1.method6266(var8.getY(-1824011675) + var11, var8.getZ(464997095) + var12, 1496457069);
         int var13 = WorldMapRegion.method6992(var8.getX(-1480103789), var9.getX(126005470), (byte)13);
         var13 = (int)(var10 * var13);
         var1.setOrientation(var8.getX(914197796) + var13, 2086328609);
         return var4 >= 1.0F;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ad")
   @Override
   void vmethod402(int var1, int var2) {
      this.field6018.setDirection(var1, var2, 1161831867);
      this.field6020.setDirection(var1, var2, 1161831867);
   }

   @ObfuscatedSignature(descriptor = "(Lkb;II)Z")
   @ObfuscatedName("ap")
   @Override
   boolean vmethod398(WorldEntityCoord var1, int var2, int var3) {
      if (-1476725613 * this.field6017 >= this.field6019 * 98305895) {
         var1.method6262(this.field6020, 1311845999);
         return true;
      } else {
         int var5 = this.field6017 * -1476725613;
         int var6 = this.field6019 * 98305895;
         float var4 = (float)(var2 - var5) / (var6 - var5);
         WorldEntityCoord var8 = this.field6018;
         WorldEntityCoord var9 = this.field6020;
         float var10 = GameEngine.method693(0.0F, 1.0F, var4, -1724260016);
         int var11 = var9.getY(-1828728155) - var8.getY(-1672849891);
         int var12 = var9.getZ(1422868209) - var8.getZ(467133610);
         var11 = (int)(var11 * var10);
         var12 = (int)(var12 * var10);
         var1.method6266(var8.getY(-1615351895) + var11, var8.getZ(1386431751) + var12, 1426477572);
         int var13 = WorldMapRegion.method6992(var8.getX(-312600610), var9.getX(-289165640), (byte)75);
         var13 = (int)(var10 * var13);
         var1.setOrientation(var8.getX(143127624) + var13, 1870337565);
         return var4 >= 1.0F;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;II)Z")
   @ObfuscatedName("aw")
   @Override
   boolean vmethod399(WorldEntityCoord var1, int var2, int var3) {
      if (-629319869 * this.field6017 >= this.field6019 * 98305895) {
         var1.method6262(this.field6020, -721490821);
         return true;
      } else {
         int var5 = this.field6017 * -1476725613;
         int var6 = this.field6019 * 105984619;
         float var4 = (float)(var2 - var5) / (var6 - var5);
         WorldEntityCoord var8 = this.field6018;
         WorldEntityCoord var9 = this.field6020;
         float var10 = GameEngine.method693(0.0F, 1.0F, var4, -2037483142);
         int var11 = var9.getY(-1809147549) - var8.getY(-1699160932);
         int var12 = var9.getZ(1582576615) - var8.getZ(2023739527);
         var11 = (int)(var11 * var10);
         var12 = (int)(var12 * var10);
         var1.method6266(var8.getY(-1694920908) + var11, var8.getZ(1633352865) + var12, 2092113412);
         int var13 = WorldMapRegion.method6992(var8.getX(1858147868), var9.getX(-1518933475), (byte)27);
         var13 = (int)(var10 * var13);
         var1.setOrientation(var8.getX(-364131283) + var13, 1861929073);
         return var4 >= 1.0F;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("au")
   @Override
   void vmethod403(int var1, int var2) {
      this.field6018.setDirection(var1, var2, 1161831867);
      this.field6020.setDirection(var1, var2, 1161831867);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("az")
   @Override
   void vmethod404(int var1, int var2) {
      this.field6018.setDirection(var1, var2, 1161831867);
      this.field6020.setDirection(var1, var2, 1161831867);
   }

   @ObfuscatedSignature(descriptor = "(Lkb;IIB)Z")
   @ObfuscatedName("at")
   @Override
   boolean vmethod400(WorldEntityCoord var1, int var2, int var3, byte var4) {
      try {
         if (-1476725613 * this.field6017 >= this.field6019 * 98305895) {
            if (var4 <= 0) {
               throw new IllegalStateException();
            } else {
               var1.method6262(this.field6020, -839741407);
               return true;
            }
         } else {
            int var6 = this.field6017 * -1476725613;
            int var7 = this.field6019 * 98305895;
            float var5 = (float)(var2 - var6) / (var7 - var6);
            WorldEntityCoord var9 = this.field6018;
            WorldEntityCoord var10 = this.field6020;
            float var11 = GameEngine.method693(0.0F, 1.0F, var5, 637192082);
            int var12 = var10.getY(-1833060287) - var9.getY(-1732320368);
            int var13 = var10.getZ(431227455) - var9.getZ(1702795284);
            var12 = (int)(var12 * var11);
            var13 = (int)(var13 * var11);
            var1.method6266(var9.getY(-1623266462) + var12, var9.getZ(1201461599) + var13, 2130198545);
            int var14 = WorldMapRegion.method6992(var9.getX(1016414934), var10.getX(984229141), (byte)40);
            var14 = (int)(var11 * var14);
            var1.setOrientation(var9.getX(1843278531) + var14, 2055300902);
            boolean var10000;
            if (var5 >= 1.0F) {
               if (var4 <= 0) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "uc.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lkb;FI)Z")
   @ObfuscatedName("hi")
   @Override
   public boolean vmethod405(WorldEntityCoord var1, float var2, int var3) {
      if (this.field6017 * -1476725613 >= this.field6019 * 98305895) {
         var1.method6293(this.field6020);
         return true;
      } else {
         float var4 = method11096(var2, this.field6017 * -1476725613, this.field6019 * 98305895);
         method11095(this.field6018, this.field6020, var4, var1);
         return var4 >= 1.0F;
      }
   }
}
