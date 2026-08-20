import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lx")
public class classLX {
   @ObfuscatedSignature(descriptor = "Lxm;")
   @ObfuscatedName("cs")
   static IndexedSprite field3801;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field3796 = 96;
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   public static final int field3799 = 25;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   static final int field3800 = 79;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field3797 = 25;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3798 = 16711935;

   @ObfuscatedSignature(descriptor = "(FI)I")
   @ObfuscatedName("at")
   public static int method7323(float var0, int var1) {
      try {
         return (int)(var0 / (Math.PI * 2) * 2048.0) & 2047;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lx.at(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aj")
   static int method7319(int var0, int var1) {
      FloorOverlayDefinition var2 = class189.method4809(var0, 1907284407);
      if (var2 == null) {
         return var1;
      } else if (705541053 * var2.secondaryRgb >= 0) {
         int var6 = MoveSpeed.method7343(
            var2.secondaryHue * -680947654, var2.secondarySaturation * 1867539670, 2020271701 * var2.secondaryLightness, -1707581112
         );
         int var7 = classJO.method6145(var6, -1356922524, (byte)115);
         return Rasterizer3D.Rasterizer3D_colorPalette[var7] | 923507526;
      } else if (-1755380356 * var2.texture >= 0) {
         int var5 = classJO.method6145(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture * -171308690, 682393131), 96, (byte)53);
         return Rasterizer3D.Rasterizer3D_colorPalette[var5] | -496011869;
      } else if (50022547 * var2.primaryRgb == -159537537) {
         return var1;
      } else {
         int var3 = MoveSpeed.method7343(var2.hue * 1368386643, -1834712605 * var2.saturation, -82956939 * var2.lightness, -1707581112);
         int var4 = classJO.method6145(var3, 96, (byte)34);
         return Rasterizer3D.Rasterizer3D_colorPalette[var4] | 1723631592;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ae")
   static int method7320(int var0, int var1) {
      FloorOverlayDefinition var2 = class189.method4809(var0, 1875838059);
      if (var2 == null) {
         return var1;
      } else if (705541053 * var2.secondaryRgb >= 0) {
         int var6 = MoveSpeed.method7343(
            var2.secondaryHue * -347808971, var2.secondarySaturation * -796039805, 2020271701 * var2.secondaryLightness, -1707581112
         );
         int var7 = classJO.method6145(var6, 96, (byte)65);
         return Rasterizer3D.Rasterizer3D_colorPalette[var7] | 0xFF000000;
      } else if (892155017 * var2.texture >= 0) {
         int var5 = classJO.method6145(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture * 892155017, 1346213663), 96, (byte)86);
         return Rasterizer3D.Rasterizer3D_colorPalette[var5] | 0xFF000000;
      } else if (50022547 * var2.primaryRgb == 16711935) {
         return var1;
      } else {
         int var3 = MoveSpeed.method7343(var2.hue * -1914711119, -1834712605 * var2.saturation, 1894985397 * var2.lightness, -1707581112);
         int var4 = classJO.method6145(var3, 96, (byte)81);
         return Rasterizer3D.Rasterizer3D_colorPalette[var4] | 0xFF000000;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ak")
   static int method7322(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 0) {
            var1 = 0;
         } else if (var1 > 127) {
            var1 = 127;
         }

         return 127 - var1;
      } else {
         var1 = var1 * (var0 & 127) / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 65408) + var1;
      }
   }

   classLX() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("aw")
   static int method7324(int var0, int var1, int var2) {
      if (var2 > -1932710971) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > -1537081054) {
         var1 /= 2;
      }

      return var2 / 2 + (var1 / -1167867333 << 7) + (var0 / 4 << 10);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ap")
   static int method7325(int var0, int var1, int var2) {
      if (var2 > -1534617167) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > -1283252439) {
         var1 /= 2;
      }

      if (var2 > 830484016) {
         var1 /= 2;
      }

      return var2 / 2 + (var1 / 32 << 7) + (var0 / 4 << 10);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lof;)I")
   @ObfuscatedName("nb")
   public static int method7327(Widget var0) {
      if (var0 == null) {
         var0.method8191();
      }

      return var0.field4553 != null && !var0.field4553.isEmpty() ? 1 : 0;
   }

   @ObfuscatedSignature(descriptor = "(J)I")
   @ObfuscatedName("aj")
   public static int method7326(long var0) {
      try {
         int var2 = (int)(var0 >>> 52 & 4095L);
         if (var2 == 4095L) {
            var2 = -1;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "lx.aj(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("an")
   static int method7321(int var0, int var1) {
      FloorOverlayDefinition var2 = class189.method4809(var0, 1875549255);
      if (var2 == null) {
         return var1;
      } else if (705541053 * var2.secondaryRgb >= 0) {
         int var6 = MoveSpeed.method7343(
            var2.secondaryHue * -347808971, var2.secondarySaturation * -796039805, 2020271701 * var2.secondaryLightness, -1707581112
         );
         int var7 = classJO.method6145(var6, 96, (byte)14);
         return Rasterizer3D.Rasterizer3D_colorPalette[var7] | 0xFF000000;
      } else if (892155017 * var2.texture >= 0) {
         int var5 = classJO.method6145(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture * 892155017, -255492008), 96, (byte)32);
         return Rasterizer3D.Rasterizer3D_colorPalette[var5] | 0xFF000000;
      } else if (50022547 * var2.primaryRgb == 16711935) {
         return var1;
      } else {
         int var3 = MoveSpeed.method7343(var2.hue * -1914711119, -1834712605 * var2.saturation, 1894985397 * var2.lightness, -1707581112);
         int var4 = classJO.method6145(var3, 96, (byte)125);
         return Rasterizer3D.Rasterizer3D_colorPalette[var4] | 0xFF000000;
      }
   }

   @ObfuscatedSignature(descriptor = "(ILoj;ZB)V")
   @ObfuscatedName("cg")
   static void method7328(int var0, Coord var1, boolean var2, byte var3) {
      try {
         WorldMapArea var4 = class455.getWorldMap(119954652).getMapArea(var0, (byte)4);
         int var5 = -2060016843 * class330.localPlayer.plane;
         int var6 = (class330.localPlayer.x * 340712311 >> 7) + Occluder.topLevelWorldView.baseX * 825809917;
         int var7 = (-1747310679 * class330.localPlayer.y >> 7) + 1279964673 * Occluder.topLevelWorldView.baseY;
         Coord var8 = new Coord(var5, var6, var7);
         class455.getWorldMap(-1573741966).method11432(var4, var8, var1, var2, -957506500);
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "lx.cg(" + ')');
      }
   }
}
