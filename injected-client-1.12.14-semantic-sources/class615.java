import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xq")
public class class615 {
   @ObfuscatedName("ae")
   public static int[] SpriteBuffer_yOffsets;
   @ObfuscatedName("ak")
   public static int[] SpriteBuffer_spriteHeights;
   @ObfuscatedName("an")
   public static int[] SpriteBuffer_xOffsets;
   @ObfuscatedName("av")
   public static int SpriteBuffer_spriteCount;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)[Lxt;")
   @ObfuscatedName("al")
   public static SpritePixels[] method12468(AbstractArchive var0, int var1, int var2) {
      return !FloorOverlayDefinition.method5355(var0, var1, var2, -1366279867) ? null : class145.method4147(-32669496);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)[Lxm;")
   @ObfuscatedName("ac")
   public static IndexedSprite[] method12462(AbstractArchive var0, int var1, int var2) {
      if (!FloorOverlayDefinition.method5355(var0, var1, var2, -1366279867)) {
         return null;
      } else {
         IndexedSprite[] var4 = new IndexedSprite[1626067939 * SpriteBuffer_spriteCount];

         for (int var5 = 0; var5 < 1626067939 * SpriteBuffer_spriteCount; var5++) {
            IndexedSprite var6 = var4[var5] = new IndexedSprite();
            var6.width = -1531546032 * class208.SpriteBuffer_spriteWidth;
            var6.height = class144.SpriteBuffer_spriteHeight * -1761547384;
            var6.xOffset = SpriteBuffer_xOffsets[var5];
            var6.yOffset = SpriteBuffer_yOffsets[var5];
            var6.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var5];
            var6.subHeight = SpriteBuffer_spriteHeights[var5];
            var6.palette = BufferedSource.SpriteBuffer_spritePalette;
            var6.pixels = class320.SpriteBuffer_pixels[var5];
         }

         SpriteBuffer_xOffsets = null;
         SpriteBuffer_yOffsets = null;
         IntHashTable.SpriteBuffer_spriteWidths = null;
         SpriteBuffer_spriteHeights = null;
         BufferedSource.SpriteBuffer_spritePalette = null;
         class320.SpriteBuffer_pixels = (byte[][])null;
         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)[Lxm;")
   @ObfuscatedName("ab")
   public static IndexedSprite[] method12463(AbstractArchive var0, int var1, int var2) {
      if (!FloorOverlayDefinition.method5355(var0, var1, var2, -1366279867)) {
         return null;
      } else {
         IndexedSprite[] var4 = new IndexedSprite[1626067939 * SpriteBuffer_spriteCount];

         for (int var5 = 0; var5 < 1626067939 * SpriteBuffer_spriteCount; var5++) {
            IndexedSprite var6 = var4[var5] = new IndexedSprite();
            var6.width = -1309012693 * class208.SpriteBuffer_spriteWidth;
            var6.height = class144.SpriteBuffer_spriteHeight * 722593713;
            var6.xOffset = SpriteBuffer_xOffsets[var5];
            var6.yOffset = SpriteBuffer_yOffsets[var5];
            var6.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var5];
            var6.subHeight = SpriteBuffer_spriteHeights[var5];
            var6.palette = BufferedSource.SpriteBuffer_spritePalette;
            var6.pixels = class320.SpriteBuffer_pixels[var5];
         }

         SpriteBuffer_xOffsets = null;
         SpriteBuffer_yOffsets = null;
         IntHashTable.SpriteBuffer_spriteWidths = null;
         SpriteBuffer_spriteHeights = null;
         BufferedSource.SpriteBuffer_spritePalette = null;
         class320.SpriteBuffer_pixels = (byte[][])null;
         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)Lxt;")
   @ObfuscatedName("am")
   public static SpritePixels method12470(AbstractArchive var0, int var1, int var2) {
      return !FloorOverlayDefinition.method5355(var0, var1, var2, -1366279867) ? null : classIO.method4945(-983432407);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lxt;")
   @ObfuscatedName("bi")
   static SpritePixels method12487() {
      SpritePixels var0 = new SpritePixels();
      var0.width = class208.SpriteBuffer_spriteWidth * -1309012693;
      var0.height = class144.SpriteBuffer_spriteHeight * 722593713;
      var0.xOffset = SpriteBuffer_xOffsets[0];
      var0.yOffset = SpriteBuffer_yOffsets[0];
      var0.subWidth = IntHashTable.SpriteBuffer_spriteWidths[0];
      var0.subHeight = SpriteBuffer_spriteHeights[0];
      int var1 = var0.subWidth * var0.subHeight;
      byte[] var2 = class320.SpriteBuffer_pixels[0];
      var0.pixels = new int[var1];

      for (int var3 = 0; var3 < var1; var3++) {
         var0.pixels[var3] = BufferedSource.SpriteBuffer_spritePalette[var2[var3] & -700082933];
      }

      SpriteBuffer_xOffsets = null;
      SpriteBuffer_yOffsets = null;
      IntHashTable.SpriteBuffer_spriteWidths = null;
      SpriteBuffer_spriteHeights = null;
      BufferedSource.SpriteBuffer_spritePalette = null;
      class320.SpriteBuffer_pixels = (byte[][])null;
      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)Lxm;")
   @ObfuscatedName("ah")
   static IndexedSprite method12466(AbstractArchive var0, int var1, int var2) {
      if (!FloorOverlayDefinition.method5355(var0, var1, var2, -1366279867)) {
         return null;
      } else {
         IndexedSprite var4 = new IndexedSprite();
         var4.width = class208.SpriteBuffer_spriteWidth * -1309012693;
         var4.height = class144.SpriteBuffer_spriteHeight * 187692080;
         var4.xOffset = SpriteBuffer_xOffsets[0];
         var4.yOffset = SpriteBuffer_yOffsets[0];
         var4.subWidth = IntHashTable.SpriteBuffer_spriteWidths[0];
         var4.subHeight = SpriteBuffer_spriteHeights[0];
         var4.palette = BufferedSource.SpriteBuffer_spritePalette;
         var4.pixels = class320.SpriteBuffer_pixels[0];
         SpriteBuffer_xOffsets = null;
         SpriteBuffer_yOffsets = null;
         IntHashTable.SpriteBuffer_spriteWidths = null;
         SpriteBuffer_spriteHeights = null;
         BufferedSource.SpriteBuffer_spritePalette = null;
         class320.SpriteBuffer_pixels = (byte[][])null;
         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("br")
   static void method12493(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      var1.offset = 1741769013 * (var0.length - 2);
      SpriteBuffer_spriteCount = Buffer.method12008(var1, (byte)5) * 956565963;
      SpriteBuffer_xOffsets = new int[SpriteBuffer_spriteCount * 1602914576];
      SpriteBuffer_yOffsets = new int[SpriteBuffer_spriteCount * 1780726080];
      IntHashTable.SpriteBuffer_spriteWidths = new int[1626067939 * SpriteBuffer_spriteCount];
      SpriteBuffer_spriteHeights = new int[1626067939 * SpriteBuffer_spriteCount];
      class320.SpriteBuffer_pixels = new byte[1626067939 * SpriteBuffer_spriteCount][];
      var1.offset = 1741769013 * (var0.length - 7 - 123641624 * SpriteBuffer_spriteCount);
      class208.SpriteBuffer_spriteWidth = Buffer.method12008(var1, (byte)5) * -1663153789;
      class144.SpriteBuffer_spriteHeight = Buffer.method12008(var1, (byte)5) * -1760688780;
      int var2 = (var1.readUnsignedByte(-610742144) & 0xFF) + 1;

      for (int var3 = 0; var3 < 1626067939 * SpriteBuffer_spriteCount; var3++) {
         SpriteBuffer_xOffsets[var3] = Buffer.method12008(var1, (byte)5);
      }

      for (int var13 = 0; var13 < SpriteBuffer_spriteCount * -1304886718; var13++) {
         SpriteBuffer_yOffsets[var13] = Buffer.method12008(var1, (byte)5);
      }

      for (int var14 = 0; var14 < -1618955529 * SpriteBuffer_spriteCount; var14++) {
         IntHashTable.SpriteBuffer_spriteWidths[var14] = Buffer.method12008(var1, (byte)5);
      }

      for (int var15 = 0; var15 < SpriteBuffer_spriteCount * 1626067939; var15++) {
         SpriteBuffer_spriteHeights[var15] = Buffer.method12008(var1, (byte)5);
      }

      var1.offset = (var0.length - 7 - SpriteBuffer_spriteCount * 1312262976 - 3 * (var2 - 1)) * 1741769013;
      BufferedSource.SpriteBuffer_spritePalette = new int[var2];

      for (int var16 = 1; var16 < var2; var16++) {
         BufferedSource.SpriteBuffer_spritePalette[var16] = var1.readMedium(-1491032865);
         if (BufferedSource.SpriteBuffer_spritePalette[var16] == 0) {
            BufferedSource.SpriteBuffer_spritePalette[var16] = 1;
         }
      }

      var1.offset = 0;

      for (int var17 = 0; var17 < -815835794 * SpriteBuffer_spriteCount; var17++) {
         int var4 = IntHashTable.SpriteBuffer_spriteWidths[var17];
         int var5 = SpriteBuffer_spriteHeights[var17];
         int var6 = var4 * var5;
         byte[] var7 = new byte[var6];
         class320.SpriteBuffer_pixels[var17] = var7;
         int var8 = var1.readUnsignedByte(1734481200);
         boolean var9 = 1 == (var8 & 1);
         boolean var10 = 2 == (var8 & 2);
         if (!var9) {
            for (int var18 = 0; var18 < var6; var18++) {
               var7[var18] = Buffer.method12001(var1, (byte)115);
            }
         } else {
            for (int var11 = 0; var11 < var4; var11++) {
               for (int var12 = 0; var12 < var5; var12++) {
                  var7[var4 * var12 + var11] = Buffer.method12001(var1, (byte)105);
               }
            }
         }

         if (var10) {
            var1.offset += -681971138 * var6;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)[Lxt;")
   @ObfuscatedName("af")
   public static SpritePixels[] method12469(AbstractArchive var0, int var1, int var2) {
      return !FloorOverlayDefinition.method5355(var0, var1, var2, -1366279867) ? null : class145.method4147(-491224428);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lxm;")
   @ObfuscatedName("ba")
   static IndexedSprite method12484() {
      IndexedSprite var0 = new IndexedSprite();
      var0.width = class208.SpriteBuffer_spriteWidth * -1309012693;
      var0.height = 722593713 * class144.SpriteBuffer_spriteHeight;
      var0.xOffset = SpriteBuffer_xOffsets[0];
      var0.yOffset = SpriteBuffer_yOffsets[0];
      var0.subWidth = IntHashTable.SpriteBuffer_spriteWidths[0];
      var0.subHeight = SpriteBuffer_spriteHeights[0];
      var0.palette = BufferedSource.SpriteBuffer_spritePalette;
      var0.pixels = class320.SpriteBuffer_pixels[0];
      SpriteBuffer_xOffsets = null;
      SpriteBuffer_yOffsets = null;
      IntHashTable.SpriteBuffer_spriteWidths = null;
      SpriteBuffer_spriteHeights = null;
      BufferedSource.SpriteBuffer_spritePalette = null;
      class320.SpriteBuffer_pixels = (byte[][])null;
      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)Lxt;")
   @ObfuscatedName("ao")
   public static SpritePixels method12471(AbstractArchive var0, int var1, int var2) {
      return !FloorOverlayDefinition.method5355(var0, var1, var2, -1366279867) ? null : classIO.method4945(-1714299017);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)Lxt;")
   @ObfuscatedName("aa")
   public static SpritePixels method12472(AbstractArchive var0, int var1, int var2) {
      return !FloorOverlayDefinition.method5355(var0, var1, var2, -1366279867) ? null : classIO.method4945(-1928368921);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;Ljava/lang/String;)[Lxm;")
   @ObfuscatedName("aq")
   public static IndexedSprite[] method12473(AbstractArchive var0, String var1, String var2) {
      if (!var0.isValidFileName(var1, var2, -1818619226)) {
         return null;
      } else {
         int var3 = var0.groupLoadPercentByName(var1, (byte)-96);
         int var4 = AbstractArchive.method9022(var0, var3, var2, -209931404);
         IndexedSprite[] var5;
         if (!FloorOverlayDefinition.method5355(var0, var3, var4, -1366279867)) {
            var5 = null;
         } else {
            IndexedSprite[] var7 = new IndexedSprite[SpriteBuffer_spriteCount * 1626067939];

            for (int var8 = 0; var8 < SpriteBuffer_spriteCount * -97965986; var8++) {
               IndexedSprite var9 = var7[var8] = new IndexedSprite();
               var9.width = 1485338922 * class208.SpriteBuffer_spriteWidth;
               var9.height = 722593713 * class144.SpriteBuffer_spriteHeight;
               var9.xOffset = SpriteBuffer_xOffsets[var8];
               var9.yOffset = SpriteBuffer_yOffsets[var8];
               var9.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var8];
               var9.subHeight = SpriteBuffer_spriteHeights[var8];
               var9.palette = BufferedSource.SpriteBuffer_spritePalette;
               var9.pixels = class320.SpriteBuffer_pixels[var8];
            }

            SpriteBuffer_xOffsets = null;
            SpriteBuffer_yOffsets = null;
            IntHashTable.SpriteBuffer_spriteWidths = null;
            SpriteBuffer_spriteHeights = null;
            BufferedSource.SpriteBuffer_spritePalette = null;
            class320.SpriteBuffer_pixels = (byte[][])null;
            var5 = var7;
         }

         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxk;II)V")
   @ObfuscatedName("rn")
   public static void method12467(Menu var0, int var1, int var2) {
      if (var0 == null) {
         var0.method12380();
      } else {
         class604.method12442(var0, (byte)39);
         var0.menuX = -876072597 * (var1 - var0.menuWidth * 1653973263 / 2);
         if (121140035 * var0.menuX + var0.menuWidth * 1653973263 > 120179835 * class489.canvasWidth) {
            var0.menuX = 1202979433 * class489.canvasWidth - -1860816827 * var0.menuWidth;
         }

         if (var0.menuX * 121140035 < 0) {
            var0.menuX = 0;
         }

         var0.menuY = 1877284923 * var2;
         if (var0.menuY * 1308492019 + var0.menuHeight * 399255337 > 19292887 * class374.canvasHeight) {
            var0.menuY = -2140147827 * class374.canvasHeight - 1852169843 * var0.menuHeight;
         }

         if (1308492019 * var0.menuY < 0) {
            var0.menuY = 0;
         }

         if (180456857 * var0.field6567 != -1 && var0.subMenus[180456857 * var0.field6567] != null) {
            var0.subMenus[180456857 * var0.field6567].method12404(var0, 219952160);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;Ljava/lang/String;)[Lxm;")
   @ObfuscatedName("be")
   public static IndexedSprite[] method12474(AbstractArchive var0, String var1, String var2) {
      if (!var0.isValidFileName(var1, var2, -1995223303)) {
         return null;
      } else {
         int var3 = var0.groupLoadPercentByName(var1, (byte)-1);
         int var4 = AbstractArchive.method9022(var0, var3, var2, 547877114);
         IndexedSprite[] var5;
         if (!FloorOverlayDefinition.method5355(var0, var3, var4, -1366279867)) {
            var5 = null;
         } else {
            IndexedSprite[] var7 = new IndexedSprite[SpriteBuffer_spriteCount * 1626067939];

            for (int var8 = 0; var8 < SpriteBuffer_spriteCount * 1626067939; var8++) {
               IndexedSprite var9 = var7[var8] = new IndexedSprite();
               var9.width = -1309012693 * class208.SpriteBuffer_spriteWidth;
               var9.height = 722593713 * class144.SpriteBuffer_spriteHeight;
               var9.xOffset = SpriteBuffer_xOffsets[var8];
               var9.yOffset = SpriteBuffer_yOffsets[var8];
               var9.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var8];
               var9.subHeight = SpriteBuffer_spriteHeights[var8];
               var9.palette = BufferedSource.SpriteBuffer_spritePalette;
               var9.pixels = class320.SpriteBuffer_pixels[var8];
            }

            SpriteBuffer_xOffsets = null;
            SpriteBuffer_yOffsets = null;
            IntHashTable.SpriteBuffer_spriteWidths = null;
            SpriteBuffer_spriteHeights = null;
            BufferedSource.SpriteBuffer_spritePalette = null;
            class320.SpriteBuffer_pixels = (byte[][])null;
            var5 = var7;
         }

         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;Ljava/lang/String;)[Lxm;")
   @ObfuscatedName("bo")
   public static IndexedSprite[] method12475(AbstractArchive var0, String var1, String var2) {
      if (!var0.isValidFileName(var1, var2, -2007061317)) {
         return null;
      } else {
         int var3 = var0.groupLoadPercentByName(var1, (byte)59);
         int var4 = AbstractArchive.method9022(var0, var3, var2, 1700683371);
         IndexedSprite[] var5;
         if (!FloorOverlayDefinition.method5355(var0, var3, var4, -1366279867)) {
            var5 = null;
         } else {
            IndexedSprite[] var7 = new IndexedSprite[SpriteBuffer_spriteCount * 1626067939];

            for (int var8 = 0; var8 < SpriteBuffer_spriteCount * -973677459; var8++) {
               IndexedSprite var9 = var7[var8] = new IndexedSprite();
               var9.width = -1847794187 * class208.SpriteBuffer_spriteWidth;
               var9.height = 722593713 * class144.SpriteBuffer_spriteHeight;
               var9.xOffset = SpriteBuffer_xOffsets[var8];
               var9.yOffset = SpriteBuffer_yOffsets[var8];
               var9.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var8];
               var9.subHeight = SpriteBuffer_spriteHeights[var8];
               var9.palette = BufferedSource.SpriteBuffer_spritePalette;
               var9.pixels = class320.SpriteBuffer_pixels[var8];
            }

            SpriteBuffer_xOffsets = null;
            SpriteBuffer_yOffsets = null;
            IntHashTable.SpriteBuffer_spriteWidths = null;
            SpriteBuffer_spriteHeights = null;
            BufferedSource.SpriteBuffer_spritePalette = null;
            class320.SpriteBuffer_pixels = (byte[][])null;
            var5 = var7;
         }

         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;Ljava/lang/String;)[Lxm;")
   @ObfuscatedName("bg")
   public static IndexedSprite[] method12476(AbstractArchive var0, String var1, String var2) {
      if (!var0.isValidFileName(var1, var2, -1550020062)) {
         return null;
      } else {
         int var3 = var0.groupLoadPercentByName(var1, (byte)-66);
         int var4 = AbstractArchive.method9022(var0, var3, var2, -501305069);
         IndexedSprite[] var5;
         if (!FloorOverlayDefinition.method5355(var0, var3, var4, -1366279867)) {
            var5 = null;
         } else {
            IndexedSprite[] var7 = new IndexedSprite[SpriteBuffer_spriteCount * -1109728761];

            for (int var8 = 0; var8 < SpriteBuffer_spriteCount * 975052899; var8++) {
               IndexedSprite var9 = var7[var8] = new IndexedSprite();
               var9.width = -1594438507 * class208.SpriteBuffer_spriteWidth;
               var9.height = 722593713 * class144.SpriteBuffer_spriteHeight;
               var9.xOffset = SpriteBuffer_xOffsets[var8];
               var9.yOffset = SpriteBuffer_yOffsets[var8];
               var9.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var8];
               var9.subHeight = SpriteBuffer_spriteHeights[var8];
               var9.palette = BufferedSource.SpriteBuffer_spritePalette;
               var9.pixels = class320.SpriteBuffer_pixels[var8];
            }

            SpriteBuffer_xOffsets = null;
            SpriteBuffer_yOffsets = null;
            IntHashTable.SpriteBuffer_spriteWidths = null;
            SpriteBuffer_spriteHeights = null;
            BufferedSource.SpriteBuffer_spritePalette = null;
            class320.SpriteBuffer_pixels = (byte[][])null;
            var5 = var7;
         }

         return var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;Ljava/lang/String;)Lxm;")
   @ObfuscatedName("bz")
   public static IndexedSprite method12477(AbstractArchive var0, String var1, String var2) {
      if (!var0.isValidFileName(var1, var2, -1590024847)) {
         return null;
      } else {
         int var3 = var0.groupLoadPercentByName(var1, (byte)-6);
         int var4 = AbstractArchive.method9022(var0, var3, var2, 109246343);
         return HitSplatDefinition.method4982(var0, var3, var4, -1268219190);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)[Lxm;")
   @ObfuscatedName("ar")
   public static IndexedSprite[] method12464(AbstractArchive var0, int var1, int var2) {
      if (!FloorOverlayDefinition.method5355(var0, var1, var2, -1366279867)) {
         return null;
      } else {
         IndexedSprite[] var4 = new IndexedSprite[-1380301374 * SpriteBuffer_spriteCount];

         for (int var5 = 0; var5 < 1626067939 * SpriteBuffer_spriteCount; var5++) {
            IndexedSprite var6 = var4[var5] = new IndexedSprite();
            var6.width = -388070088 * class208.SpriteBuffer_spriteWidth;
            var6.height = class144.SpriteBuffer_spriteHeight * -2076669555;
            var6.xOffset = SpriteBuffer_xOffsets[var5];
            var6.yOffset = SpriteBuffer_yOffsets[var5];
            var6.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var5];
            var6.subHeight = SpriteBuffer_spriteHeights[var5];
            var6.palette = BufferedSource.SpriteBuffer_spritePalette;
            var6.pixels = class320.SpriteBuffer_pixels[var5];
         }

         SpriteBuffer_xOffsets = null;
         SpriteBuffer_yOffsets = null;
         IntHashTable.SpriteBuffer_spriteWidths = null;
         SpriteBuffer_spriteHeights = null;
         BufferedSource.SpriteBuffer_spritePalette = null;
         class320.SpriteBuffer_pixels = (byte[][])null;
         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;Ljava/lang/String;)[Lxt;")
   @ObfuscatedName("bk")
   public static SpritePixels[] method12479(AbstractArchive var0, String var1, String var2) {
      if (!var0.isValidFileName(var1, var2, -1795882329)) {
         return null;
      } else {
         int var3 = var0.groupLoadPercentByName(var1, (byte)40);
         int var4 = AbstractArchive.method9022(var0, var3, var2, 502837342);
         return class69.method1399(var0, var3, var4, 796865849);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;Ljava/lang/String;Ljava/lang/String;)Lsu;")
   @ObfuscatedName("bb")
   public static Font method12480(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
      if (!var0.isValidFileName(var2, var3, -1693526660)) {
         return null;
      } else {
         int var4 = var0.groupLoadPercentByName(var2, (byte)89);
         int var5 = AbstractArchive.method9022(var0, var4, var3, 1791935207);
         Font var6;
         if (!FloorOverlayDefinition.method5355(var0, var4, var5, -1366279867)) {
            var6 = null;
         } else {
            var6 = class181.method4267(var1.getFile(var4, var5, -1854539831), 16777215);
         }

         return var6;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;I)Lxm;")
   @ObfuscatedName("bp")
   public static IndexedSprite method12481(AbstractArchive var0, int var1) {
      byte[] var3 = var0.takeFileFlat(var1, -755456173);
      boolean var2;
      if (var3 == null) {
         var2 = false;
      } else {
         ConcurrentMidiTask.SpriteBuffer_decode(var3, -1560461024);
         var2 = true;
      }

      return !var2 ? null : class209.method4885((byte)11);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;I)Lxm;")
   @ObfuscatedName("bm")
   public static IndexedSprite method12482(AbstractArchive var0, int var1) {
      byte[] var3 = var0.takeFileFlat(var1, 487972551);
      boolean var2;
      if (var3 == null) {
         var2 = false;
      } else {
         ConcurrentMidiTask.SpriteBuffer_decode(var3, -2086013074);
         var2 = true;
      }

      return !var2 ? null : class209.method4885((byte)29);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;I)Lxm;")
   @ObfuscatedName("bj")
   public static IndexedSprite method12483(AbstractArchive var0, int var1) {
      byte[] var3 = var0.takeFileFlat(var1, -1759595322);
      boolean var2;
      if (var3 == null) {
         var2 = false;
      } else {
         ConcurrentMidiTask.SpriteBuffer_decode(var3, -1120374940);
         var2 = true;
      }

      return !var2 ? null : class209.method4885((byte)97);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lxm;")
   @ObfuscatedName("bt")
   static IndexedSprite method12485() {
      IndexedSprite var0 = new IndexedSprite();
      var0.width = class208.SpriteBuffer_spriteWidth * -1309012693;
      var0.height = 722593713 * class144.SpriteBuffer_spriteHeight;
      var0.xOffset = SpriteBuffer_xOffsets[0];
      var0.yOffset = SpriteBuffer_yOffsets[0];
      var0.subWidth = IntHashTable.SpriteBuffer_spriteWidths[0];
      var0.subHeight = SpriteBuffer_spriteHeights[0];
      var0.palette = BufferedSource.SpriteBuffer_spritePalette;
      var0.pixels = class320.SpriteBuffer_pixels[0];
      SpriteBuffer_xOffsets = null;
      SpriteBuffer_yOffsets = null;
      IntHashTable.SpriteBuffer_spriteWidths = null;
      SpriteBuffer_spriteHeights = null;
      BufferedSource.SpriteBuffer_spritePalette = null;
      class320.SpriteBuffer_pixels = (byte[][])null;
      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lxm;")
   @ObfuscatedName("bu")
   static IndexedSprite method12486() {
      IndexedSprite var0 = new IndexedSprite();
      var0.width = class208.SpriteBuffer_spriteWidth * -1309012693;
      var0.height = 722593713 * class144.SpriteBuffer_spriteHeight;
      var0.xOffset = SpriteBuffer_xOffsets[0];
      var0.yOffset = SpriteBuffer_yOffsets[0];
      var0.subWidth = IntHashTable.SpriteBuffer_spriteWidths[0];
      var0.subHeight = SpriteBuffer_spriteHeights[0];
      var0.palette = BufferedSource.SpriteBuffer_spritePalette;
      var0.pixels = class320.SpriteBuffer_pixels[0];
      SpriteBuffer_xOffsets = null;
      SpriteBuffer_yOffsets = null;
      IntHashTable.SpriteBuffer_spriteWidths = null;
      SpriteBuffer_spriteHeights = null;
      BufferedSource.SpriteBuffer_spritePalette = null;
      class320.SpriteBuffer_pixels = (byte[][])null;
      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)Z")
   @ObfuscatedName("bn")
   public static boolean method12490(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.getFile(var1, var2, -560738950);
      if (null == var3) {
         return false;
      } else {
         ConcurrentMidiTask.SpriteBuffer_decode(var3, -1703624932);
         return true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)[Lxm;")
   @ObfuscatedName("ax")
   public static IndexedSprite[] method12465(AbstractArchive var0, int var1, int var2) {
      if (!FloorOverlayDefinition.method5355(var0, var1, var2, -1366279867)) {
         return null;
      } else {
         IndexedSprite[] var4 = new IndexedSprite[-757313065 * SpriteBuffer_spriteCount];

         for (int var5 = 0; var5 < 1546477840 * SpriteBuffer_spriteCount; var5++) {
            IndexedSprite var6 = var4[var5] = new IndexedSprite();
            var6.width = -1309012693 * class208.SpriteBuffer_spriteWidth;
            var6.height = class144.SpriteBuffer_spriteHeight * -1786820354;
            var6.xOffset = SpriteBuffer_xOffsets[var5];
            var6.yOffset = SpriteBuffer_yOffsets[var5];
            var6.subWidth = IntHashTable.SpriteBuffer_spriteWidths[var5];
            var6.subHeight = SpriteBuffer_spriteHeights[var5];
            var6.palette = BufferedSource.SpriteBuffer_spritePalette;
            var6.pixels = class320.SpriteBuffer_pixels[var5];
         }

         SpriteBuffer_xOffsets = null;
         SpriteBuffer_yOffsets = null;
         IntHashTable.SpriteBuffer_spriteWidths = null;
         SpriteBuffer_spriteHeights = null;
         BufferedSource.SpriteBuffer_spritePalette = null;
         class320.SpriteBuffer_pixels = (byte[][])null;
         return var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)Lsu;")
   @ObfuscatedName("by")
   public static Font method12488(byte[] var0) {
      if (null == var0) {
         return null;
      } else {
         Font var1 = new Font(
            var0,
            SpriteBuffer_xOffsets,
            SpriteBuffer_yOffsets,
            IntHashTable.SpriteBuffer_spriteWidths,
            SpriteBuffer_spriteHeights,
            BufferedSource.SpriteBuffer_spritePalette,
            class320.SpriteBuffer_pixels
         );
         SpriteBuffer_xOffsets = null;
         SpriteBuffer_yOffsets = null;
         IntHashTable.SpriteBuffer_spriteWidths = null;
         SpriteBuffer_spriteHeights = null;
         BufferedSource.SpriteBuffer_spritePalette = null;
         class320.SpriteBuffer_pixels = (byte[][])null;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)Lsu;")
   @ObfuscatedName("bw")
   public static Font method12489(byte[] var0) {
      if (null == var0) {
         return null;
      } else {
         Font var1 = new Font(
            var0,
            SpriteBuffer_xOffsets,
            SpriteBuffer_yOffsets,
            IntHashTable.SpriteBuffer_spriteWidths,
            SpriteBuffer_spriteHeights,
            BufferedSource.SpriteBuffer_spritePalette,
            class320.SpriteBuffer_pixels
         );
         SpriteBuffer_xOffsets = null;
         SpriteBuffer_yOffsets = null;
         IntHashTable.SpriteBuffer_spriteWidths = null;
         SpriteBuffer_spriteHeights = null;
         BufferedSource.SpriteBuffer_spritePalette = null;
         class320.SpriteBuffer_pixels = (byte[][])null;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)Z")
   @ObfuscatedName("bf")
   public static boolean method12491(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.getFile(var1, var2, -516966058);
      if (null == var3) {
         return false;
      } else {
         ConcurrentMidiTask.SpriteBuffer_decode(var3, -1433208677);
         return true;
      }
   }

   class615() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;II)Z")
   @ObfuscatedName("bd")
   public static boolean method12492(AbstractArchive var0, int var1, int var2) {
      byte[] var3 = var0.getFile(var1, var2, 1256852607);
      if (null == var3) {
         return false;
      } else {
         ConcurrentMidiTask.SpriteBuffer_decode(var3, -1190476099);
         return true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Ljava/lang/String;Ljava/lang/String;)Lxm;")
   @ObfuscatedName("bs")
   public static IndexedSprite method12478(AbstractArchive var0, String var1, String var2) {
      if (!var0.isValidFileName(var1, var2, -2071020420)) {
         return null;
      } else {
         int var3 = var0.groupLoadPercentByName(var1, (byte)-14);
         int var4 = AbstractArchive.method9022(var0, var3, var2, -24184147);
         return HitSplatDefinition.method4982(var0, var3, var4, -1268219190);
      }
   }
}
