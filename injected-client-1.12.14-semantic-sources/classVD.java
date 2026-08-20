import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vd")
public class classVD {
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field6153 = 128;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6151 = 64;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field6155 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field6154 = 32;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field6152 = 512;
   @ObfuscatedName("ap")
   static final int[] field6150 = new int[17];
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   public static final int field6156 = 49;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIII)Z")
   @ObfuscatedName("ay")
   static boolean method11276(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      return ModelData0.method6706(var0, var1, var2, var3, var8, var9, var10, var11, -1303071933)
         || ModelData0.method6706(var2, var3, var4, var5, var8, var9, var10, var11, 430713369)
         || ModelData0.method6706(var4, var5, var6, var7, var8, var9, var10, var11, 799730702)
         || ModelData0.method6706(var6, var7, var0, var1, var8, var9, var10, var11, -843435281);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIII)Z")
   @ObfuscatedName("aw")
   static boolean method11277(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      return ModelData0.method6706(var0, var1, var2, var3, var8, var9, var10, var11, -786755474)
         || ModelData0.method6706(var2, var3, var4, var5, var8, var9, var10, var11, 977637171)
         || ModelData0.method6706(var4, var5, var6, var7, var8, var9, var10, var11, -204393185)
         || ModelData0.method6706(var6, var7, var0, var1, var8, var9, var10, var11, -185413130);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIII)Z")
   @ObfuscatedName("ak")
   static boolean method11278(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      return ModelData0.method6706(var0, var1, var2, var3, var8, var9, var10, var11, 1208174802)
         || ModelData0.method6706(var2, var3, var4, var5, var8, var9, var10, var11, -1436374877)
         || ModelData0.method6706(var4, var5, var6, var7, var8, var9, var10, var11, -727540311)
         || ModelData0.method6706(var6, var7, var0, var1, var8, var9, var10, var11, 1135764472);
   }

   static {
      field6150[0] = 0;

      for (short var0 = 0; var0 < 2048; var0 += 128) {
         int var1 = class117.method3808(var0, 1971930331);
         short var2 = 0;
         if (var0 > 0 && var0 < 1024) {
            var2 |= 272;
         }

         if (var0 > 512 && var0 < 1536) {
            var2 |= 1088;
         }

         if (var0 > 1024) {
            var2 |= 544;
         }

         if (var0 > 1536 || var0 < 512) {
            var2 |= 2176;
         }

         if (0 == var0 || 1024 == var0) {
            var2 |= 48;
         }

         if (var0 == 512 || 1536 == var0) {
            var2 |= 1152;
         }

         field6150[var1] = var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIII)Z")
   @ObfuscatedName("ap")
   static boolean method11279(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      return ModelData0.method6706(var0, var1, var2, var3, var8, var9, var10, var11, 2128228055)
         || ModelData0.method6706(var2, var3, var4, var5, var8, var9, var10, var11, 443721929)
         || ModelData0.method6706(var4, var5, var6, var7, var8, var9, var10, var11, -1810078559)
         || ModelData0.method6706(var6, var7, var0, var1, var8, var9, var10, var11, 1742319209);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIII)Z")
   @ObfuscatedName("au")
   static boolean method11280(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      return ModelData0.method6706(var0, var1, var2, var3, var8, var9, var10, var11, -195202894)
         || ModelData0.method6706(var2, var3, var4, var5, var8, var9, var10, var11, 1972942891)
         || ModelData0.method6706(var4, var5, var6, var7, var8, var9, var10, var11, 112770062)
         || ModelData0.method6706(var6, var7, var0, var1, var8, var9, var10, var11, -125780358);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   static int method11281(int var0) {
      return (var0 >> 7) + 1;
   }

   classVD() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkb;Lvt;)Lrl;")
   @ObfuscatedName("ad")
   public static Bounds method11282(WorldEntityCoord var0, classVT var1) {
      int var2 = 809239137 * var1.field6161;
      int var3 = 978893637 * var1.field6159;
      int var4 = 299509079 * var1.field6163;
      int var5 = var1.field6164 * -1524422205;
      int var6 = var0.getX(-1107671707);
      int var7 = var0.getY(-1858068103);
      int var8 = var0.getZ(1398912894);
      double var9 = DevicePcmPlayerProvider.method146(var6, 192801641);
      double var11 = class66.method1386(var6, 1341755379) / 65536.0;
      int var15 = (int)(var9 * var2 - var3 * var11);
      int var16 = (int)(var3 * var9 + var11 * var2);
      var7 += var15;
      var8 += var16;
      int var17 = (int)(var9 * var4 - var11 * var5);
      int var18 = (int)(var11 * var4 + var5 * var9);
      int var19 = (int)(var9 * var4 + var5 * var11);
      int var20 = (int)(var5 * var9 - var4 * var11);
      int var21 = var7 - var17;
      int var22 = var18 + var8;
      int var23 = var7 + var19;
      int var24 = var8 + var20;
      int var25 = var7 + var17;
      int var26 = var8 - var18;
      int var27 = var7 - var19;
      int var28 = var8 - var20;
      int var29 = Math.min(var21, Math.min(var23, Math.min(var25, var27)));
      int var30 = Math.max(var21, Math.max(var23, Math.max(var25, var27)));
      int var31 = Math.min(var22, Math.min(var24, Math.min(var26, var28)));
      int var32 = Math.max(var22, Math.max(var24, Math.max(var26, var28)));
      return AbstractArchive.method8960(var29, var31, 1 + (var30 - var29), var32 - var31 + 1, -1215837129);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkb;Lvt;)Lrl;")
   @ObfuscatedName("ai")
   public static Bounds method11283(WorldEntityCoord var0, classVT var1) {
      int var2 = 809239137 * var1.field6161;
      int var3 = 978893637 * var1.field6159;
      int var4 = 299509079 * var1.field6163;
      int var5 = var1.field6164 * -170612595;
      int var6 = var0.getX(592225148);
      int var7 = var0.getY(-2113488024);
      int var8 = var0.getZ(1672910804);
      double var9 = DevicePcmPlayerProvider.method146(var6, 192801641);
      double var11 = class66.method1386(var6, 822388637) / 65536.0;
      int var15 = (int)(var9 * var2 - var3 * var11);
      int var16 = (int)(var3 * var9 + var11 * var2);
      var7 += var15;
      var8 += var16;
      int var17 = (int)(var9 * var4 - var11 * var5);
      int var18 = (int)(var11 * var4 + var5 * var9);
      int var19 = (int)(var9 * var4 + var5 * var11);
      int var20 = (int)(var5 * var9 - var4 * var11);
      int var21 = var7 - var17;
      int var22 = var18 + var8;
      int var23 = var7 + var19;
      int var24 = var8 + var20;
      int var25 = var7 + var17;
      int var26 = var8 - var18;
      int var27 = var7 - var19;
      int var28 = var8 - var20;
      int var29 = Math.min(var21, Math.min(var23, Math.min(var25, var27)));
      int var30 = Math.max(var21, Math.max(var23, Math.max(var25, var27)));
      int var31 = Math.min(var22, Math.min(var24, Math.min(var26, var28)));
      int var32 = Math.max(var22, Math.max(var24, Math.max(var26, var28)));
      return AbstractArchive.method8960(var29, var31, 1 + (var30 - var29), var32 - var31 + 1, -1294522820);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkb;Lvt;)Lrl;")
   @ObfuscatedName("as")
   public static Bounds method11284(WorldEntityCoord var0, classVT var1) {
      int var2 = 1042516783 * var1.field6161;
      int var3 = -270811691 * var1.field6159;
      int var4 = 1489316132 * var1.field6163;
      int var5 = var1.field6164 * -1524422205;
      int var6 = var0.getX(1980733799);
      int var7 = var0.getY(-1617993169);
      int var8 = var0.getZ(1541211336);
      double var9 = DevicePcmPlayerProvider.method146(var6, 192801641);
      double var11 = class66.method1386(var6, 1021955977) / 65536.0;
      int var15 = (int)(var9 * var2 - var3 * var11);
      int var16 = (int)(var3 * var9 + var11 * var2);
      var7 += var15;
      var8 += var16;
      int var17 = (int)(var9 * var4 - var11 * var5);
      int var18 = (int)(var11 * var4 + var5 * var9);
      int var19 = (int)(var9 * var4 + var5 * var11);
      int var20 = (int)(var5 * var9 - var4 * var11);
      int var21 = var7 - var17;
      int var22 = var18 + var8;
      int var23 = var7 + var19;
      int var24 = var8 + var20;
      int var25 = var7 + var17;
      int var26 = var8 - var18;
      int var27 = var7 - var19;
      int var28 = var8 - var20;
      int var29 = Math.min(var21, Math.min(var23, Math.min(var25, var27)));
      int var30 = Math.max(var21, Math.max(var23, Math.max(var25, var27)));
      int var31 = Math.min(var22, Math.min(var24, Math.min(var26, var28)));
      int var32 = Math.max(var22, Math.max(var24, Math.max(var26, var28)));
      return AbstractArchive.method8960(var29, var31, 1 + (var30 - var29), var32 - var31 + 1, 654908548);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lkb;I)V")
   @ObfuscatedName("th")
   public static void method11275(WorldEntityCoord var0, int var1) {
      if (var0 == null) {
         var0.method6267(var1, var1);
      } else {
         var0.orientation = -398195395 * (var1 & 2047);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvu;IIII)Z")
   @ObfuscatedName("ac")
   static boolean method11285(classVU var0, int var1, int var2, int var3, int var4) {
      int var6 = classVU.method11618(var0, (byte)4);
      int var7 = var0.method11614((byte)61);
      int var8 = var0.method11616(228833251);
      int var9 = var7 - var1;
      int var10 = var8 - var2;
      int var11 = var9 * var9;
      int var12 = var10 * var10;
      boolean var5;
      if (var11 + var12 <= var6) {
         var5 = true;
      } else {
         int var13 = var7 - var3;
         int var14 = var13 * var13;
         if (var14 + var12 <= var6) {
            var5 = true;
         } else {
            int var15 = var8 - var4;
            int var16 = var15 * var15;
            if (var16 + var11 <= var6) {
               var5 = true;
            } else {
               var5 = var16 + var14 <= var6;
            }
         }
      }

      return var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIII)Z")
   @ObfuscatedName("ab")
   static boolean method11286(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      var8++;
      var9++;
      var10--;
      var11--;
      if (var0 >= var8 && var0 <= var10 && var1 >= var9 && var1 <= var11) {
         return true;
      } else if (var2 >= var8 && var2 <= var10 && var3 >= var9 && var3 <= var11) {
         return true;
      } else if (var4 >= var8 && var4 <= var10 && var5 >= var9 && var5 <= var11) {
         return true;
      } else if (var6 >= var8 && var6 <= var10 && var7 >= var9 && var7 <= var11) {
         return true;
      } else {
         return WorldMapArea.method6907(var8, var9, var0, var1, var2, var3, var4, var5, 1470952445)
               || WorldMapArea.method6907(var8, var11, var0, var1, var2, var3, var4, var5, 808753464)
               || WorldMapArea.method6907(var10, var9, var0, var1, var2, var3, var4, var5, -892489789)
               || WorldMapArea.method6907(var10, var11, var0, var1, var2, var3, var4, var5, 1178461737)
            ? true
            : Actor.method2741(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9, 1990098953)
               || Actor.method2741(var0, var1, var2, var3, var4, var5, var6, var7, var10, var9, var10, var11, 2119261471)
               || Actor.method2741(var0, var1, var2, var3, var4, var5, var6, var7, var10, var11, var8, var11, 2063356228)
               || Actor.method2741(var0, var1, var2, var3, var4, var5, var6, var7, var8, var11, var8, var9, 1987088522);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIIIIIII)Z")
   @ObfuscatedName("ax")
   static boolean method11287(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      var8++;
      var9++;
      var10--;
      var11--;
      if (var0 >= var8 && var0 <= var10 && var1 >= var9 && var1 <= var11) {
         return true;
      } else if (var2 >= var8 && var2 <= var10 && var3 >= var9 && var3 <= var11) {
         return true;
      } else if (var4 >= var8 && var4 <= var10 && var5 >= var9 && var5 <= var11) {
         return true;
      } else if (var6 >= var8 && var6 <= var10 && var7 >= var9 && var7 <= var11) {
         return true;
      } else {
         return WorldMapArea.method6907(var8, var9, var0, var1, var2, var3, var4, var5, -702813676)
               || WorldMapArea.method6907(var8, var11, var0, var1, var2, var3, var4, var5, -1996723560)
               || WorldMapArea.method6907(var10, var9, var0, var1, var2, var3, var4, var5, 1454289735)
               || WorldMapArea.method6907(var10, var11, var0, var1, var2, var3, var4, var5, -1202241983)
            ? true
            : Actor.method2741(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var9, 1924390726)
               || Actor.method2741(var0, var1, var2, var3, var4, var5, var6, var7, var10, var9, var10, var11, 1942930119)
               || Actor.method2741(var0, var1, var2, var3, var4, var5, var6, var7, var10, var11, var8, var11, 1834324324)
               || Actor.method2741(var0, var1, var2, var3, var4, var5, var6, var7, var8, var11, var8, var9, 1938725280);
      }
   }
}
