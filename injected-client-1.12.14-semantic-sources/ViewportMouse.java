import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kv")
public class ViewportMouse {
   @ObfuscatedName("bz")
   public static int ViewportMouse_x = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field3485 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field3482 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field3484 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field3481 = 3;
   @ObfuscatedSignature(descriptor = "Lrx;")
   @ObfuscatedName("bg")
   static final ProjectionCoord field3473 = new ProjectionCoord();
   @ObfuscatedName("bs")
   public static boolean ViewportMouse_isInViewport = false;
   @ObfuscatedName("bf")
   public static int ViewportMouse_entityCount = 0;
   @ObfuscatedName("bk")
   public static int ViewportMouse_y = 0;
   @ObfuscatedName("bb")
   public static boolean ViewportMouse_false0 = false;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field3483 = 1;
   @ObfuscatedName("bn")
   public static long[] ViewportMouse_entityTags = new long[1000];
   @ObfuscatedName("bd")
   public static int[] field3480 = new int[1000];
   @ToRemove(unused = "true")
   @ObfuscatedName("dj")
   static final int field3486 = 15;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("bn")
   static void method6679(int var0, int var1, int var2, int var3, int var4, int var5) {
      SecureUrlRequester.field1707 = (var3 + var0) / 2 * -1457320511;
      FloorUnderlayDefinition.field2186 = 59999848 * ((var4 + var1) / 2);
      class339.field4374 = 2033293141 * ((var2 + var5) / 2);
      class142.field1811 = (var3 - var0) / 2 * 642617493;
      VarpDefinition.field2411 = (var4 - var1) / 2 * 255531725;
      Varcs.field1384 = -213085267 * ((var5 - var2) / 2);
      class108.field1676 = Math.abs(-1750453943 * class142.field1811) * -1966259260;
      TileItem.field1292 = Math.abs(VarpDefinition.field2411 * -840015355) * 1960113946;
      classFY.field1931 = Math.abs(-1842480661 * Varcs.field1384) * -469573922;
      field3473.method9868(var3 - var0, var4 - var1, var5 - var2, -897607103);
      field3473.method9920((short)3141);
      ViewportMouse_false0 = true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   public static int method6653() {
      return 1 + ViewportMouse_entityCount * -1556503267;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   public static int method6654() {
      return 1 + ViewportMouse_entityCount * -1556503267;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)Z")
   @ObfuscatedName("af")
   public static boolean method6655(long var0) {
      boolean var2 = var0 != 0L;
      if (var2) {
         boolean var3 = (int)(var0 >>> 19 & 1L) == 1;
         var2 = !var3;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)Z")
   @ObfuscatedName("am")
   public static boolean method6656(long var0) {
      boolean var2 = var0 != 0L;
      if (var2) {
         boolean var3 = (int)(var0 >>> 19 & 1L) == 1;
         var2 = !var3;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)I")
   @ObfuscatedName("bg")
   public static int method6661(long var0) {
      return (int)(var0 >>> 20 & 4294967295L);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)I")
   @ObfuscatedName("aa")
   public static int method6658(long var0) {
      return (int)(var0 >>> 0 & 127L);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)I")
   @ObfuscatedName("bk")
   public static int method6664(long var0) {
      int var2 = (int)(var0 >>> 52 & 4095L);
      if (var2 == 4095L) {
         var2 = -1;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIII)Z")
   @ObfuscatedName("ch")
   static final boolean method6688(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var6 + -459009589 * ViewportMouse_y;
      if (var7 < var0 && var7 < var1 && var7 < var2) {
         return false;
      } else {
         var7 = ViewportMouse_y * -459009589 - var6;
         if (var7 > var0 && var7 > var1 && var7 > var2) {
            return false;
         } else {
            var7 = var6 + 770621097 * ViewportMouse_x;
            if (var7 < var3 && var7 < var4 && var7 < var5) {
               return false;
            } else {
               var7 = ViewportMouse_x * 770621097 - var6;
               return var7 <= var3 || var7 <= var4 || var7 <= var5;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cm")
   public static void method6692() {
      boolean var0;
      do {
         var0 = true;

         for (int var1 = 0; var1 < ViewportMouse_entityCount * -1556503267; var1++) {
            if (field3480[var1] < field3480[var1 + 1]) {
               long var2 = ViewportMouse_entityTags[var1];
               ViewportMouse_entityTags[var1] = ViewportMouse_entityTags[var1 + 1];
               ViewportMouse_entityTags[var1 + 1] = var2;
               int var4 = field3480[var1];
               field3480[var1] = field3480[var1 + 1];
               field3480[1 + var1] = var4;
               var0 = false;
            }
         }
      } while (!var0);

      for (int var5 = 0; var5 < ViewportMouse_entityCount * -1556503267; var5++) {
         for (int var6 = var5 + 1; var6 <= -1556503267 * ViewportMouse_entityCount; var6++) {
            if (ViewportMouse_entityTags[var6] == ViewportMouse_entityTags[var5]) {
               ViewportMouse_entityTags[var5] = -1L;
               break;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bu")
   public static final void method6673() {
      ViewportMouse_isInViewport = false;
      ViewportMouse_entityCount = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;IIIIFFFFIII)Z")
   @ObfuscatedName("bc")
   static final boolean method6681(
      Model var0, int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      boolean var12 = ViewportMouse_isInViewport;
      if (!var12) {
         return false;
      } else {
         WorldMapEvent.method7540(var5, var6, var7, var8, var9, var10, var11, 1101116837);
         return class179.method4238(var0, var1, var2, var3, var4, 1891315171);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)I")
   @ObfuscatedName("bz")
   public static int method6665(long var0) {
      int var2 = (int)(var0 >>> 52 & 4095L);
      if (var2 == 4095L) {
         var2 = -1;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIZII)J")
   @ObfuscatedName("bp")
   public static long method6667(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
      long var7 = (var1 & 127) << 0 | (var2 & 127) << 7 | (var0 & 3) << 14 | (var3 & 7) << 16 | (var5 & 4294967295L) << 20 | (var6 & 4095L) << 52;
      if (var4) {
         var7 |= 524288L;
      }

      return var7;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)I")
   @ObfuscatedName("bb")
   public static int method6666(long var0) {
      int var2 = (int)(var0 >>> -483480419 & 4095L);
      if (var2 == 4095L) {
         var2 = -1;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)Z")
   @ObfuscatedName("ao")
   public static boolean method6657(long var0) {
      boolean var2 = var0 != 0L;
      if (var2) {
         boolean var3 = (int)(var0 >>> 19 & 1L) == 1;
         var2 = !var3;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIZII)J")
   @ObfuscatedName("bm")
   public static long method6668(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
      long var7 = (var1 & -813295082) << 0 | (var2 & 127) << 7 | (var0 & 3) << 14 | (var3 & 7) << 16 | (var5 & 4294967295L) << 20 | (var6 & 4095L) << 52;
      if (var4) {
         var7 |= 524288L;
      }

      return var7;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)I")
   @ObfuscatedName("aq")
   static int method6659(long var0) {
      return (int)(var0 >>> 16 & 7L);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bt")
   static void method6671() {
      ViewportMouse_false0 = false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIZII)J")
   @ObfuscatedName("bj")
   public static long method6669(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
      long var7 = (var1 & 127) << 0 | (var2 & 127) << 7 | (var0 & 3) << 14 | (var3 & 7) << 16 | (var5 & 4294967295L) << 20 | (var6 & 4095L) << 52;
      if (var4) {
         var7 |= 524288L;
      }

      return var7;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ba")
   public static final void method6674() {
      ViewportMouse_isInViewport = false;
      ViewportMouse_entityCount = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(JI)V")
   @ObfuscatedName("bi")
   static final void method6675(long var0, int var2) {
      if (Integer.MAX_VALUE != field3480[ViewportMouse_entityCount * -1556503267] && var0 != ViewportMouse_entityTags[ViewportMouse_entityCount * -1556503267]) {
         ViewportMouse_entityCount += 1422935349;
         field3480[ViewportMouse_entityCount * -1556503267] = Integer.MAX_VALUE;
      }

      ViewportMouse_entityTags[-1556503267 * ViewportMouse_entityCount] = var0;
      field3480[-1556503267 * ViewportMouse_entityCount] = Math.min(field3480[ViewportMouse_entityCount * -1556503267], var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(JI)V")
   @ObfuscatedName("by")
   static final void method6676(long var0, int var2) {
      if (Integer.MAX_VALUE != field3480[ViewportMouse_entityCount * -1556503267] && var0 != ViewportMouse_entityTags[ViewportMouse_entityCount * -1556503267]) {
         ViewportMouse_entityCount += 1422935349;
         field3480[ViewportMouse_entityCount * -1556503267] = Integer.MAX_VALUE;
      }

      ViewportMouse_entityTags[-1556503267 * ViewportMouse_entityCount] = var0;
      field3480[-1556503267 * ViewportMouse_entityCount] = Math.min(field3480[ViewportMouse_entityCount * -1556503267], var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bw")
   static final int method6677() {
      return -232344288 * ViewportMouse_y;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bf")
   static final int method6678() {
      return -459009589 * ViewportMouse_y;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)I")
   @ObfuscatedName("bs")
   public static int method6662(long var0) {
      return (int)(var0 >>> 20 & 4294967295L);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsj;II)V")
   @ObfuscatedName("nl")
   public static void method6672(AnimationSequence var0, int var1, int var2) {
      if (var0 == null) {
         var0.method10352(var1, var1);
      }

      var0.frame = var1 * -449915737;
      var0.frameCount = -1227346829 * var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("bd")
   static void method6680(int var0, int var1, int var2, int var3, int var4, int var5) {
      SecureUrlRequester.field1707 = (var3 + var0) / 2 * 733044230;
      FloorUnderlayDefinition.field2186 = -952646133 * ((var4 + var1) / 2);
      class339.field4374 = 2033293141 * ((var2 + var5) / 2);
      class142.field1811 = (var3 - var0) / 2 * 899326985;
      VarpDefinition.field2411 = (var4 - var1) / 2 * 150852816;
      Varcs.field1384 = 1801588447 * ((var5 - var2) / 2);
      class108.field1676 = Math.abs(510143033 * class142.field1811) * 1536532539;
      TileItem.field1292 = Math.abs(VarpDefinition.field2411 * -378676608) * -1960747559;
      classFY.field1931 = Math.abs(-1797444321 * Varcs.field1384) * -177308609;
      field3473.method9868(var3 - var0, var4 - var1, var5 - var2, 2135953037);
      field3473.method9920((short)3141);
      ViewportMouse_false0 = true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;IIIIFFFFIII)Z")
   @ObfuscatedName("br")
   static final boolean method6682(
      Model var0, int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      boolean var12 = ViewportMouse_isInViewport;
      if (!var12) {
         return false;
      } else {
         WorldMapEvent.method7540(var5, var6, var7, var8, var9, var10, var11, 1666371877);
         return class179.method4238(var0, var1, var2, var3, var4, -851199298);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;IIIIFFFFIII)Z")
   @ObfuscatedName("bh")
   static final boolean method6683(
      Model var0, int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      boolean var12 = ViewportMouse_isInViewport;
      if (!var12) {
         return false;
      } else {
         WorldMapEvent.method7540(var5, var6, var7, var8, var9, var10, var11, 19662856);
         return class179.method4238(var0, var1, var2, var3, var4, -754480031);
      }
   }

   ViewportMouse() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;IIII)Z")
   @ObfuscatedName("bx")
   static boolean method6685(Model var0, int var1, int var2, int var3, int var4) {
      AABB var5 = var0.getAABB(var1);
      int var6 = var2 + var5.xMid * -1721312265;
      int var7 = 1267849313 * var5.yMid + var3;
      int var8 = var4 + 266507379 * var5.zMid;
      int var9 = var5.xMidOffset * 984504841;
      int var10 = var5.yMidOffset * -157622439;
      int var11 = 528344083 * var5.zMidOffset;
      int var12 = SecureUrlRequester.field1707 * -1015152063 - var6;
      int var13 = FloorUnderlayDefinition.field2186 * 2038044067 - var7;
      int var14 = class339.field4374 * -1714049539 - var8;
      if (Math.abs(var12) > var9 + class108.field1676 * 788805875) {
         return false;
      } else if (Math.abs(var13) > var10 + TileItem.field1292 * -1012313495) {
         return false;
      } else if (Math.abs(var14) > 50295743 * classFY.field1931 + var11) {
         return false;
      } else if (Math.abs(VarpDefinition.field2411 * -840015355 * var14 - -1797444321 * Varcs.field1384 * var13)
         > 50295743 * classFY.field1931 * var10 + var11 * TileItem.field1292 * -1012313495) {
         return false;
      } else {
         return Math.abs(var12 * -1797444321 * Varcs.field1384 - var14 * class142.field1811 * 510143033)
               > 788805875 * class108.field1676 * var11 + 50295743 * classFY.field1931 * var9
            ? false
            : Math.abs(var13 * 510143033 * class142.field1811 - -840015355 * VarpDefinition.field2411 * var12)
               <= var9 * TileItem.field1292 * -1012313495 + class108.field1676 * 788805875 * var10;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;IIII)Z")
   @ObfuscatedName("bq")
   static boolean method6686(Model var0, int var1, int var2, int var3, int var4) {
      AABB var5 = var0.getAABB(var1);
      int var6 = var2 + var5.xMid * -1721312265;
      int var7 = 1267849313 * var5.yMid + var3;
      int var8 = var4 + 266507379 * var5.zMid;
      int var9 = var5.xMidOffset * 984504841;
      int var10 = var5.yMidOffset * -157622439;
      int var11 = 528344083 * var5.zMidOffset;
      int var12 = SecureUrlRequester.field1707 * -1015152063 - var6;
      int var13 = FloorUnderlayDefinition.field2186 * 2038044067 - var7;
      int var14 = class339.field4374 * -1714049539 - var8;
      if (Math.abs(var12) > var9 + class108.field1676 * 788805875) {
         return false;
      } else if (Math.abs(var13) > var10 + TileItem.field1292 * -1012313495) {
         return false;
      } else if (Math.abs(var14) > 50295743 * classFY.field1931 + var11) {
         return false;
      } else if (Math.abs(VarpDefinition.field2411 * -840015355 * var14 - -1797444321 * Varcs.field1384 * var13)
         > 50295743 * classFY.field1931 * var10 + var11 * TileItem.field1292 * -1012313495) {
         return false;
      } else {
         return Math.abs(var12 * -1797444321 * Varcs.field1384 - var14 * class142.field1811 * 510143033)
               > 788805875 * class108.field1676 * var11 + 50295743 * classFY.field1931 * var9
            ? false
            : Math.abs(var13 * 510143033 * class142.field1811 - -840015355 * VarpDefinition.field2411 * var12)
               <= var9 * TileItem.field1292 * -1012313495 + class108.field1676 * 788805875 * var10;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)I")
   @ObfuscatedName("be")
   static int method6660(long var0) {
      return (int)(var0 >>> 16 & 7L);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;IIII)Z")
   @ObfuscatedName("bv")
   static boolean method6687(Model var0, int var1, int var2, int var3, int var4) {
      AABB var5 = var0.getAABB(var1);
      int var6 = var2 + var5.xMid * 597720511;
      int var7 = -1714647117 * var5.yMid + var3;
      int var8 = var4 + 266507379 * var5.zMid;
      int var9 = var5.xMidOffset * -1687550710;
      int var10 = var5.yMidOffset * -468014728;
      int var11 = 528344083 * var5.zMidOffset;
      int var12 = SecureUrlRequester.field1707 * -1015152063 - var6;
      int var13 = FloorUnderlayDefinition.field2186 * -1799385693 - var7;
      int var14 = class339.field4374 * -1714049539 - var8;
      if (Math.abs(var12) > var9 + class108.field1676 * 2108027495) {
         return false;
      } else if (Math.abs(var13) > var10 + TileItem.field1292 * 1981255850) {
         return false;
      } else if (Math.abs(var14) > -2049164636 * classFY.field1931 + var11) {
         return false;
      } else if (Math.abs(VarpDefinition.field2411 * -817936521 * var14 - -634504075 * Varcs.field1384 * var13)
         > 1636089513 * classFY.field1931 * var10 + var11 * TileItem.field1292 * 199426093) {
         return false;
      } else {
         return Math.abs(var12 * 1425029795 * Varcs.field1384 - var14 * class142.field1811 * 510143033)
               > 1485428061 * class108.field1676 * var11 + 1252372287 * classFY.field1931 * var9
            ? false
            : Math.abs(var13 * -318491653 * class142.field1811 - -840015355 * VarpDefinition.field2411 * var12)
               <= var9 * TileItem.field1292 * -1012313495 + class108.field1676 * 788805875 * var10;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrx;FI)Lrx;")
   @ObfuscatedName("an")
   public static final ProjectionCoord method6670(ProjectionCoord var0, float var1, int var2) {
      try {
         ProjectionCoord var3 = class30.method1304(var0, 742787141);
         var3.method9907(var1, (byte)-65);
         return var3;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "kv.an(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;IIIIIII)Lrx;")
   @ObfuscatedName("ce")
   public static final ProjectionCoord method6689(Scene var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      float var8 = 1.0E-5F;
      ModelData0.method6707((byte)-19);
      WorldMapEvent.method7540(var0.field2970, var0.field2969, var0.field2972, var0.field2971, var5, var6, var7, -1962048992);
      ProjectionCoord var9 = FaceNormal.method6214(0.0F, 1.0F, 0.0F, 1440629540);
      ProjectionCoord var11 = field3473;
      float var10 = var9.method9897(var11, -2117687789);
      if (Math.abs(var10) < 1.0E-5F) {
         var9.release(-804947546);
         return null;
      } else {
         ProjectionCoord var13 = FaceNormal.method6214(var2, var3, var4, -1383934237);
         ProjectionCoord var14 = FaceNormal.method6214(var13.x, var13.z - var1, var13.y, 2110102467);
         float var15 = var9.method9897(var14, -151368699);
         float var16 = -var15 / var10;
         var9.release(-804947546);
         if (var16 < 0.0F) {
            var14.release(-804947546);
            var13.release(-804947546);
            return null;
         } else {
            ProjectionCoord var17 = method6670(field3473, var16, 682680474);
            ProjectionCoord var19 = class30.method1304(var13, 742787141);
            var19.method9884(var17, (byte)-120);
            var17.release(-804947546);
            var14.release(-804947546);
            var13.release(-804947546);
            return var19;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)I")
   @ObfuscatedName("bo")
   public static int method6663(long var0) {
      return (int)(var0 >>> 20 & 4294967295L);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;IIIIIII)Lrx;")
   @ObfuscatedName("ct")
   public static final ProjectionCoord method6690(Scene var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      float var8 = 1.0E-5F;
      ModelData0.method6707((byte)1);
      WorldMapEvent.method7540(var0.field2970, var0.field2969, var0.field2972, var0.field2971, var5, var6, var7, 1822113533);
      ProjectionCoord var9 = FaceNormal.method6214(0.0F, 1.0F, 0.0F, -714499705);
      ProjectionCoord var11 = field3473;
      float var10 = var9.method9897(var11, 1452548837);
      if (Math.abs(var10) < 1.0E-5F) {
         var9.release(-804947546);
         return null;
      } else {
         ProjectionCoord var13 = FaceNormal.method6214(var2, var3, var4, -746743842);
         ProjectionCoord var14 = FaceNormal.method6214(var13.x, var13.z - var1, var13.y, -1313048262);
         float var15 = var9.method9897(var14, -1641562625);
         float var16 = -var15 / var10;
         var9.release(-804947546);
         if (var16 < 0.0F) {
            var14.release(-804947546);
            var13.release(-804947546);
            return null;
         } else {
            ProjectionCoord var17 = method6670(field3473, var16, -2030768020);
            ProjectionCoord var19 = class30.method1304(var13, 742787141);
            var19.method9884(var17, (byte)-59);
            var17.release(-804947546);
            var14.release(-804947546);
            var13.release(-804947546);
            return var19;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljh;IIIIIII)Lrx;")
   @ObfuscatedName("cu")
   public static final ProjectionCoord method6691(Scene var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      float var8 = 1.0E-5F;
      ModelData0.method6707((byte)-120);
      WorldMapEvent.method7540(var0.field2970, var0.field2969, var0.field2972, var0.field2971, var5, var6, var7, -1558896822);
      ProjectionCoord var9 = FaceNormal.method6214(0.0F, 1.0F, 0.0F, 488860080);
      ProjectionCoord var11 = field3473;
      float var10 = var9.method9897(var11, -2065240138);
      if (Math.abs(var10) < 1.0E-5F) {
         var9.release(-804947546);
         return null;
      } else {
         ProjectionCoord var13 = FaceNormal.method6214(var2, var3, var4, -280878358);
         ProjectionCoord var14 = FaceNormal.method6214(var13.x, var13.z - var1, var13.y, 92940663);
         float var15 = var9.method9897(var14, 414167965);
         float var16 = -var15 / var10;
         var9.release(-804947546);
         if (var16 < 0.0F) {
            var14.release(-804947546);
            var13.release(-804947546);
            return null;
         } else {
            ProjectionCoord var17 = method6670(field3473, var16, -210875341);
            ProjectionCoord var19 = class30.method1304(var13, 742787141);
            var19.method9884(var17, (byte)-91);
            var17.release(-804947546);
            var14.release(-804947546);
            var13.release(-804947546);
            return var19;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cb")
   public static void method6693() {
      boolean var0;
      do {
         var0 = true;

         for (int var1 = 0; var1 < ViewportMouse_entityCount * -1556503267; var1++) {
            if (field3480[var1] < field3480[var1 + 1]) {
               long var2 = ViewportMouse_entityTags[var1];
               ViewportMouse_entityTags[var1] = ViewportMouse_entityTags[var1 + 1];
               ViewportMouse_entityTags[var1 + 1] = var2;
               int var4 = field3480[var1];
               field3480[var1] = field3480[var1 + 1];
               field3480[1 + var1] = var4;
               var0 = false;
            }
         }
      } while (!var0);

      for (int var5 = 0; var5 < ViewportMouse_entityCount * -1556503267; var5++) {
         for (int var6 = var5 + 1; var6 <= -1556503267 * ViewportMouse_entityCount; var6++) {
            if (ViewportMouse_entityTags[var6] == ViewportMouse_entityTags[var5]) {
               ViewportMouse_entityTags[var5] = -1L;
               break;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ck")
   public static void method6694() {
      boolean var0;
      do {
         var0 = true;

         for (int var1 = 0; var1 < ViewportMouse_entityCount * -1556503267; var1++) {
            if (field3480[var1] < field3480[var1 + 1]) {
               long var2 = ViewportMouse_entityTags[var1];
               ViewportMouse_entityTags[var1] = ViewportMouse_entityTags[var1 + 1];
               ViewportMouse_entityTags[var1 + 1] = var2;
               int var4 = field3480[var1];
               field3480[var1] = field3480[var1 + 1];
               field3480[1 + var1] = var4;
               var0 = false;
            }
         }
      } while (!var0);

      for (int var5 = 0; var5 < ViewportMouse_entityCount * -1556503267; var5++) {
         for (int var6 = var5 + 1; var6 <= -1556503267 * ViewportMouse_entityCount; var6++) {
            if (ViewportMouse_entityTags[var6] == ViewportMouse_entityTags[var5]) {
               ViewportMouse_entityTags[var5] = -1L;
               break;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;IIIIFFFFIII)Z")
   @ObfuscatedName("bl")
   static final boolean method6684(
      Model var0, int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      boolean var12 = ViewportMouse_isInViewport;
      if (!var12) {
         return false;
      } else {
         WorldMapEvent.method7540(var5, var6, var7, var8, var9, var10, var11, 2060293686);
         return class179.method4238(var0, var1, var2, var3, var4, -896694499);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)Z")
   @ObfuscatedName("at")
   public static boolean isNumber(CharSequence var0, int var1) {
      try {
         return classEM.method3785(var0, 10, true, 1412810971);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "kv.at(" + ')');
      }
   }
}
