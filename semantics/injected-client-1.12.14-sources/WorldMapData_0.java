import java.security.SecureRandom;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ld")
public class WorldMapData_0 extends AbstractWorldMapData {
   @ObfuscatedName("lv")
   static int cameraYaw;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ao")
   static AbstractArchive SequenceDefinition_skeletonsArchive;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field3638 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("dl")
   static final int field3639 = 0;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfs;)Lry;")
   @ObfuscatedName("tq")
   public static TransformationMatrix method7124(class136 var0) {
      return var0.field1859;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("apf")
   public int method7123() {
      return this.regionX * 1415052445 | -588647407 * this.regionY << 8;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;)I")
   @ObfuscatedName("rm")
   public static int method7125(classSF var0) {
      if (!var0.field5767.isEmpty() && var0.method10201(-1894339103) == 1) {
         return var0.field5767.isEmpty() ? 0 : ((class472)var0.field5767.get(var0.field5767.size() - 1)).field5868 * 1415121929 + var0.method10202((short)255);
      } else {
         int var1 = -1;
         int var2 = 0;

         for (int var3 = var0.field5767.size() - 1; var3 >= 0; var3--) {
            class472 var4 = (class472)var0.field5767.get(var3);
            if (var1 != -798824383 * var4.field5867) {
               int var5 = var0.method10244(var4, false, (byte)8) + var4.field5868 * 1415121929;
               var2 = Math.max(var5, var2);
               var1 = -798824383 * var4.field5867;
            }
         }

         return var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldv;Ljava/lang/String;)V")
   @ObfuscatedName("kr")
   public static void method7118(NPC var0, String var1) {
      if (var0 == null) {
         var0.vmethod148();
      }

      var0.field1497 = var1 == null ? "" : var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("av")
   void init(Buffer var1, int var2) {
      try {
         int var3 = var1.readUnsignedByte(-200134871);
         if (var3 != WorldMapID.field3658.value * 1166744947) {
            if (var2 == -1727864648) {
               throw new IllegalStateException("");
            }
         } else {
            this.minPlane = var1.readUnsignedByte(1505283087) * 1575898727;
            this.planes = var1.readUnsignedByte(485219229) * 1802827095;
            this.regionXLow = Buffer.method12008(var1, (byte)5) * 1597123053;
            this.regionYLow = Buffer.method12008(var1, (byte)5) * -114939813;
            this.regionX = Buffer.method12008(var1, (byte)5) * 830892469;
            this.regionY = Buffer.method12008(var1, (byte)5) * 1106869489;
            this.groupId = var1.readNullableLargeSmart(-2120608969) * 514790051;
            this.fileId = var1.readNullableLargeSmart(-1882797214) * -881501843;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ld.av(" + ')');
      }
   }

   WorldMapData_0() {
   }

   @Override
   public boolean equals(Object var1) {
      try {
         if (!(var1 instanceof WorldMapData_0)) {
            return false;
         } else {
            WorldMapData_0 var2 = (WorldMapData_0)var1;
            return 1415052445 * this.regionX == 1415052445 * var2.regionX && -588647407 * var2.regionY == -588647407 * this.regionY;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ld.equals(" + ')');
      }
   }

   @Override
   public int hashCode() {
      try {
         return this.regionX * 1415052445 | -588647407 * this.regionY << 8;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ld.hashCode(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("hd")
   public boolean method7120(Object var1) {
      if (!(var1 instanceof WorldMapData_0)) {
         return false;
      } else {
         WorldMapData_0 var2 = (WorldMapData_0)var1;
         return 1415052445 * this.regionX == 1415052445 * var2.regionX && -588647407 * var2.regionY == -491499614 * this.regionY;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("at")
   @Override
   void readGeography(Buffer var1, int var2) {
      try {
         this.planes = Math.min(this.planes * -1789868441, 4) * 1802827095;
         this.floorUnderlayIds = new short[1][64][64];
         this.floorOverlayIds = new short[-1789868441 * this.planes][64][64];
         this.field3755 = new byte[-1789868441 * this.planes][64][64];
         this.field3754 = new byte[this.planes * -1789868441][64][64];
         this.decorations = new WorldMapDecoration[this.planes * -1789868441][64][64][];
         int var3 = var1.readUnsignedByte(1799710235);
         if (var3 != -1492311435 * class309.field3702.value) {
            if (var2 >= -1199104632) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            int var4 = var1.readUnsignedByte(463400601);
            int var5 = var1.readUnsignedByte(-195752605);
            if (var4 == this.regionX * 1415052445 && this.regionY * -588647407 == var5) {
               for (int var6 = 0; var6 < 64; var6++) {
                  if (var2 >= -1199104632) {
                     return;
                  }

                  for (int var7 = 0; var7 < 64; var7++) {
                     if (var2 >= -1199104632) {
                        return;
                     }

                     AbstractWorldMapData.method7240(this, var6, var7, var1, (byte)40);
                  }
               }
            } else {
               throw new IllegalStateException("");
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "ld.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("he")
   public boolean method7121(Object var1) {
      if (!(var1 instanceof WorldMapData_0)) {
         return false;
      } else {
         WorldMapData_0 var2 = (WorldMapData_0)var1;
         return 1415052445 * this.regionX == 1415052445 * var2.regionX && -588647407 * var2.regionY == -588647407 * this.regionY;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod286(Buffer var1) {
      this.planes = Math.min(this.planes * -1789868441, 4) * 1802827095;
      this.floorUnderlayIds = new short[1][64][64];
      this.floorOverlayIds = new short[-1789868441 * this.planes][64][64];
      this.field3755 = new byte[-1789868441 * this.planes][64][64];
      this.field3754 = new byte[this.planes * -1789868441][64][64];
      this.decorations = new WorldMapDecoration[this.planes * -1789868441][64][64][];
      int var2 = var1.readUnsignedByte(-783873054);
      if (var2 != -1492311435 * class309.field3702.value) {
         throw new IllegalStateException("");
      } else {
         int var3 = var1.readUnsignedByte(307554346);
         int var4 = var1.readUnsignedByte(246576531);
         if (var3 == this.regionX * 1415052445 && this.regionY * -588647407 == var4) {
            for (int var5 = 0; var5 < 64; var5++) {
               for (int var6 = 0; var6 < 64; var6++) {
                  AbstractWorldMapData.method7240(this, var5, var6, var1, (byte)118);
               }
            }
         } else {
            throw new IllegalStateException("");
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lld;Lxa;)V")
   @ObfuscatedName("ro")
   public static void method7116(WorldMapData_0 var0, Buffer var1) {
      if (var0 == null) {
         var0.hashCode();
      }

      int var2 = var1.readUnsignedByte(1839228867);
      if (var2 != WorldMapID.field3658.value * 1166744947) {
         throw new IllegalStateException("");
      } else {
         var0.minPlane = var1.readUnsignedByte(1768032699) * 1575898727;
         var0.planes = var1.readUnsignedByte(2128779384) * 1802827095;
         var0.regionXLow = Buffer.method12008(var1, (byte)5) * 1597123053;
         var0.regionYLow = Buffer.method12008(var1, (byte)5) * -114939813;
         var0.regionX = Buffer.method12008(var1, (byte)5) * 830892469;
         var0.regionY = Buffer.method12008(var1, (byte)5) * 1106869489;
         var0.groupId = var1.readNullableLargeSmart(-210734488) * 514790051;
         var0.fileId = var1.readNullableLargeSmart(-1447136171) * -881501843;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lal;)Ljava/util/Map;")
   @ObfuscatedName("xm")
   public static Map method7122(HttpResponse var0) {
      return var0.field33;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;III)Ljava/lang/String;")
   @ObfuscatedName("av")
   public static String method7117(Object[] var0, int var1, int var2, int var3) {
      try {
         if (var2 == 0) {
            if (var3 == -513941937) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else if (var2 == 1) {
            CharSequence var10 = (CharSequence)var0[var1];
            if (var10 == null) {
               if (var3 == -513941937) {
                  throw new IllegalStateException();
               } else {
                  return "null";
               }
            } else {
               return var10.toString();
            }
         } else {
            int var4 = var2 + var1;
            int var5 = 0;

            for (int var6 = var1; var6 < var4; var6++) {
               if (var3 == -513941937) {
                  throw new IllegalStateException();
               }

               CharSequence var7 = (CharSequence)var0[var6];
               if (var7 == null) {
                  var5 += 4;
               } else {
                  var5 += var7.length();
               }
            }

            StringBuilder var11 = new StringBuilder(var5);

            for (int var12 = var1; var12 < var4; var12++) {
               if (var3 == -513941937) {
                  throw new IllegalStateException();
               }

               CharSequence var8 = (CharSequence)var0[var12];
               if (var8 == null) {
                  var11.append("null");
               } else {
                  var11.append(var8);
               }
            }

            return var11.toString();
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "ld.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod287(Buffer var1) {
      this.planes = Math.min(this.planes * -1496854789, 4) * 1191211610;
      this.floorUnderlayIds = new short[1][484770133][64];
      this.floorOverlayIds = new short[-544187621 * this.planes][798760986][64];
      this.field3755 = new byte[-1789868441 * this.planes][-503632159][-1786673373];
      this.field3754 = new byte[this.planes * -1789868441][-121402083][1471129920];
      this.decorations = new WorldMapDecoration[this.planes * 1502136645][-265532223][-467365012][];
      int var2 = var1.readUnsignedByte(-108841725);
      if (var2 != 929256151 * class309.field3702.value) {
         throw new IllegalStateException("");
      } else {
         int var3 = var1.readUnsignedByte(-1521160544);
         int var4 = var1.readUnsignedByte(-1346623989);
         if (var3 == this.regionX * -411530250 && this.regionY * -588647407 == var4) {
            for (int var5 = 0; var5 < 1192882175; var5++) {
               for (int var6 = 0; var6 < 994501657; var6++) {
                  AbstractWorldMapData.method7240(this, var5, var6, var1, (byte)40);
               }
            }
         } else {
            throw new IllegalStateException("");
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/security/SecureRandom;")
   @ObfuscatedName("ag")
   static SecureRandom method7119(int var0) {
      try {
         SecureRandom var1 = new SecureRandom();
         var1.nextInt();
         return var1;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ld.ag(" + ')');
      }
   }
}
