import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ck")
public final class Tiles {
   @ObfuscatedName("ak")
   static final int[] field603 = new int[]{0, -1, 0, 1};
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field611 = 1170;
   @ObfuscatedName("an")
   static final int[] field602 = new int[]{1, 2, 4, 8};
   @ObfuscatedName("am")
   static int rndHue = ((int)(Math.random() * 17.0) - 8) * 392617369;
   @ObfuscatedName("aj")
   static final int[] field604 = new int[]{1, 0, -1, 0};
   @ObfuscatedName("aw")
   static final int[] field606 = new int[]{1, -1, -1, 1};
   @ObfuscatedName("ae")
   static final int[] field605 = new int[]{16, 32, 64, 128};
   @ObfuscatedName("ap")
   static final int[] field607 = new int[]{-1, -1, 1, 1};
   @ObfuscatedName("ay")
   static int Tiles_minPlane = -226730897;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field612 = 585;
   @ObfuscatedName("as")
   static byte[][][] Tiles_underlays2;
   @ObfuscatedName("ao")
   static int rndLightness = ((int)(Math.random() * 33.0) - 16) * -1098612701;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("af")
   static AbstractArchive SequenceDefinition_archive;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;[BII)V")
   @ObfuscatedName("bh")
   static final void method1516(WorldView var0, byte[] var1, int var2, int var3) {
      Buffer var4 = new Buffer(var1);
      int var5 = -1;

      while (true) {
         int var6 = Buffer.method12056(var4, 233229148);
         if (var6 == 0) {
            return;
         }

         var5 += var6;
         int var7 = 0;

         while (true) {
            int var8 = Buffer.method12050(var4, 2010535962);
            if (var8 == 0) {
               break;
            }

            var7 += var8 - 1;
            int var9 = var7 & 63;
            int var10 = var7 >> 6 & 63;
            int var11 = var7 >> 12;
            int var12 = var4.readUnsignedByte(838211737);
            int var13 = var12 >> 2;
            int var14 = var12 & 3;
            int var15 = var2 + var10;
            int var16 = var3 + var9;
            if (var15 > 0 && var16 > 0 && var15 < var0.tileHeights[0].length - 2 && var16 < var0.tileHeights[0][0].length - 2) {
               int var17 = var11;
               if (2 == (var0.tileSettings[1][var15][var16] & 2)) {
                  var17 = var11 - 1;
               }

               CollisionMap var18 = null;
               if (var17 >= 0 && null != var0.collisionMaps) {
                  var18 = var0.collisionMaps[var17];
               }

               FriendSystem.addObjects(var0, var11, var15, var16, var5, var14, var13, var18, -377379976);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;[BIIIIIII)V")
   @ObfuscatedName("au")
   static final void method1521(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Buffer var9 = new Buffer(var1);
      int var10 = -1;

      while (true) {
         int var11 = Buffer.method12056(var9, -1939772642);
         if (0 == var11) {
            return;
         }

         var10 += var11;
         int var12 = 0;

         while (true) {
            int var13 = Buffer.method12050(var9, -1133583147);
            if (0 == var13) {
               break;
            }

            var12 += var13 - 1;
            int var14 = var12 & 63;
            int var15 = var12 >> 6 & 63;
            int var16 = var12 >> 12;
            int var17 = var9.readUnsignedByte(112085741);
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            if (var5 == var16 && var15 >= var6 && var15 < 8 + var6 && var14 >= var7 && var14 < 8 + var7) {
               ObjectComposition var20 = AsyncHttpResponse.getObjectDefinition(var10, 2119667895);
               int var23 = var15 & 7;
               int var24 = var14 & 7;
               int var26 = var20.sizeX * 1813358617;
               int var27 = -352504863 * var20.sizeY;
               if (1 == (var19 & 1)) {
                  int var28 = var26;
                  var26 = var27;
                  var27 = var28;
               }

               int var25 = var8 & 3;
               int var22;
               if (var25 == 0) {
                  var22 = var23;
               } else if (1 == var25) {
                  var22 = var24;
               } else if (2 == var25) {
                  var22 = 7 - var23 - (var26 - 1);
               } else {
                  var22 = 7 - var24 - (var27 - 1);
               }

               int var32 = var22 + var3;
               int var29 = var4 + class69.method1396(var15 & 7, var14 & 7, var8, 1813358617 * var20.sizeX, var20.sizeY * -352504863, var19, -1538746252);
               if (var32 > 0 && var29 > 0 && var32 < var0.sizeX * 2010544793 - 1 && var29 < var0.sizeY * 1823353167 - 1) {
                  int var30 = var2;
                  if (2 == (var0.tileSettings[1][var32][var29] & 2)) {
                     var30 = var2 - 1;
                  }

                  CollisionMap var31 = null;
                  if (var30 >= 0 && null != var0.collisionMaps) {
                     var31 = var0.collisionMaps[var30];
                  }

                  FriendSystem.addObjects(var0, var2, var32, var29, var10, var19 + var8 & 3, var18, var31, -434056318);
               }
            }
         }
      }
   }

   Tiles() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   static void method1490() {
      Tiles_minPlane = -1461850002;
      class33.Tiles_underlays = new short[4][-1682123338][-1167098846];
      class623.Tiles_overlays = new short[4][-461988401][104];
      class200.Tiles_shapes = new byte[4][104][104];
      HttpRequest.field83 = new byte[4][1107341762][831680999];
      class148.field1911 = new int[4][-829244924][2090118043];
      Tiles_underlays2 = new byte[4][105][1308928901];
      MouseRecorder.field1086 = new int[105][105];
      WorldMapSectionType.Tiles_hue = new int[585648452];
      class565.Tiles_saturation = new int[104];
      class67.Tiles_lightness = new int[2075584780];
      class161.Tiles_hueMultiplier = new int[-775682895];
      class154.field1761 = new int[104];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   static void method1492() {
      class33.Tiles_underlays = (short[][][])null;
      class623.Tiles_overlays = (short[][][])null;
      class200.Tiles_shapes = (byte[][][])null;
      HttpRequest.field83 = (byte[][][])null;
      class148.field1911 = (int[][][])null;
      Tiles_underlays2 = (byte[][][])null;
      MouseRecorder.field1086 = (int[][])null;
      WorldMapSectionType.Tiles_hue = null;
      class565.Tiles_saturation = null;
      class67.Tiles_lightness = null;
      class161.Tiles_hueMultiplier = null;
      class154.field1761 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cx")
   static final int method1534(int var0, int var1) {
      int var2 = classRE.method9418(var0 - 1, var1 - 1, -1187940143)
         + classRE.method9418(var0 + 1, var1 - 1, 698757795)
         + classRE.method9418(var0 - 1, 1 + var1, -1719508269)
         + classRE.method9418(1 + var0, var1 + 1, -2099886120);
      int var3 = classRE.method9418(var0 - 1, var1, 534571314)
         + classRE.method9418(var0 + 1, var1, 1426458184)
         + classRE.method9418(var0, var1 - 1, 1376649000)
         + classRE.method9418(var0, 1 + var1, -1827439311);
      int var4 = classRE.method9418(var0, var1, -1245684017);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   static void method1493() {
      class33.Tiles_underlays = (short[][][])null;
      class623.Tiles_overlays = (short[][][])null;
      class200.Tiles_shapes = (byte[][][])null;
      HttpRequest.field83 = (byte[][][])null;
      class148.field1911 = (int[][][])null;
      Tiles_underlays2 = (byte[][][])null;
      MouseRecorder.field1086 = (int[][])null;
      WorldMapSectionType.Tiles_hue = null;
      class565.Tiles_saturation = null;
      class67.Tiles_lightness = null;
      class161.Tiles_hueMultiplier = null;
      class154.field1761 = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;IIII)V")
   @ObfuscatedName("aq")
   static final void method1495(WorldView var0, int var1, int var2, int var3, int var4) {
      int[][][] var5 = var0.tileHeights;
      int var6 = 2010544793 * var0.sizeX - 1;
      int var7 = 1823353167 * var0.sizeY - 1;

      for (int var8 = var2; var8 <= var2 + var4; var8++) {
         for (int var9 = var1; var9 <= var3 + var1; var9++) {
            if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
               Tiles_underlays2[0][var9][var8] = 127;
               if (var1 == var9 && var9 > 0) {
                  var5[0][var9][var8] = var5[0][var9 - 1][var8];
               }

               if (var9 == var3 + var1 && var9 < var6) {
                  var5[0][var9][var8] = var5[0][var9 + 1][var8];
               }

               if (var8 == var2 && var8 > 0) {
                  var5[0][var9][var8] = var5[0][var9][var8 - 1];
               }

               if (var2 + var4 == var8 && var8 < var7) {
                  var5[0][var9][var8] = var5[0][var9][var8 + 1];
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;IIII)V")
   @ObfuscatedName("be")
   static final void method1496(WorldView var0, int var1, int var2, int var3, int var4) {
      int[][][] var5 = var0.tileHeights;
      int var6 = 2010544793 * var0.sizeX - 1;
      int var7 = 1823353167 * var0.sizeY - 1;

      for (int var8 = var2; var8 <= var2 + var4; var8++) {
         for (int var9 = var1; var9 <= var3 + var1; var9++) {
            if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
               Tiles_underlays2[0][var9][var8] = 127;
               if (var1 == var9 && var9 > 0) {
                  var5[0][var9][var8] = var5[0][var9 - 1][var8];
               }

               if (var9 == var3 + var1 && var9 < var6) {
                  var5[0][var9][var8] = var5[0][var9 + 1][var8];
               }

               if (var8 == var2 && var8 > 0) {
                  var5[0][var9][var8] = var5[0][var9][var8 - 1];
               }

               if (var2 + var4 == var8 && var8 < var7) {
                  var5[0][var9][var8] = var5[0][var9][var8 + 1];
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;[BIIII)V")
   @ObfuscatedName("bg")
   static final void method1497(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5) {
      if (null != var0.collisionMaps) {
         for (int var6 = 0; var6 < 4; var6++) {
            CollisionMap var7 = var0.collisionMaps[var6];

            for (int var8 = var2; var8 < var2 + 64; var8++) {
               for (int var9 = var3; var9 < var3 + 64; var9++) {
                  if (var7.method6401(var8, var9, -933066075)) {
                     var7.method6398(var8, var9, 1073741824, 1412302415);
                  }
               }
            }
         }
      }

      Buffer var12 = new Buffer(var1);

      for (int var13 = 0; var13 < 4; var13++) {
         for (int var15 = 0; var15 < 64; var15++) {
            for (int var17 = 0; var17 < 64; var17++) {
               int var10 = var2 + var15;
               int var11 = var17 + var3;
               class264.loadTerrain(var0, var12, var13, var10, var11, var10 + var4, var11 + var5, 0, 2113207911);
            }
         }
      }

      int var14 = var12.offset * 2108391709 < var12.array.length ? var12.readUnsignedByte(241806142) : 0;
      boolean var16 = 0 != (var14 & 1);
      if (var16) {
         for (int var18 = 0; var18 < 64; var18++) {
            for (int var19 = 0; var19 < 64; var19++) {
               class148.method4142(var12, (byte)47);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;[BIIII)V")
   @ObfuscatedName("bs")
   static final void method1498(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5) {
      if (null != var0.collisionMaps) {
         for (int var6 = 0; var6 < 4; var6++) {
            CollisionMap var7 = var0.collisionMaps[var6];

            for (int var8 = var2; var8 < var2 + 64; var8++) {
               for (int var9 = var3; var9 < var3 + 64; var9++) {
                  if (var7.method6401(var8, var9, -1094376784)) {
                     var7.method6398(var8, var9, 1073741824, 574075299);
                  }
               }
            }
         }
      }

      Buffer var12 = new Buffer(var1);

      for (int var13 = 0; var13 < 4; var13++) {
         for (int var15 = 0; var15 < -1031814393; var15++) {
            for (int var17 = 0; var17 < 64; var17++) {
               int var10 = var2 + var15;
               int var11 = var17 + var3;
               class264.loadTerrain(var0, var12, var13, var10, var11, var10 + var4, var11 + var5, 0, 2120306205);
            }
         }
      }

      int var14 = var12.offset * -1842962485 < var12.array.length ? var12.readUnsignedByte(-107913758) : 0;
      boolean var16 = 0 != (var14 & 1);
      if (var16) {
         for (int var18 = 0; var18 < 64; var18++) {
            for (int var19 = 0; var19 < -81102285; var19++) {
               class148.method4142(var12, (byte)80);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;[BIIIIIIIII)V")
   @ObfuscatedName("bz")
   static final void method1500(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      CollisionMap[] var11 = var0.collisionMaps;
      if (null != var11 && var2 >= 0 && var2 < var11.length) {
         CollisionMap var12 = var11[var2];

         for (int var13 = var3; var13 < 8 + var3; var13++) {
            for (int var14 = var4; var14 < 8 + var4; var14++) {
               if (var12.method6401(var13, var14, 383619979)) {
                  var12.method6398(var13, var14, 1073741824, 1079901257);
               }
            }
         }
      }

      Buffer var25 = new Buffer(var1);

      for (int var26 = 0; var26 < 4; var26++) {
         for (int var28 = 0; var28 < 64; var28++) {
            for (int var15 = 0; var15 < 64; var15++) {
               if (var5 == var26 && var28 >= var6 && var28 < var6 + 8 && var15 >= var7 && var15 < 8 + var7) {
                  int var16 = var3 + FontName.method11646(var28 & 7, var15 & 7, var8, (byte)-126);
                  int var19 = var28 & 7;
                  int var20 = var15 & 7;
                  int var21 = var8 & 3;
                  int var18;
                  if (0 == var21) {
                     var18 = var20;
                  } else if (1 == var21) {
                     var18 = 7 - var19;
                  } else if (var21 == 2) {
                     var18 = 7 - var20;
                  } else {
                     var18 = var19;
                  }

                  int var22 = var4 + var18;
                  int var23 = (var28 & 7) + var9 + var3;
                  int var24 = var4 + var10 + (var15 & 7);
                  class264.loadTerrain(var0, var25, var2, var16, var22, var23, var24, var8, 2128395763);
               } else {
                  class264.loadTerrain(var0, var25, 0, -1, -1, 0, 0, 0, 2143015310);
               }
            }
         }
      }

      int var27 = var25.offset * 2108391709 < var25.array.length ? var25.readUnsignedByte(-540113349) : 0;
      boolean var29 = 0 != (var27 & 1);
      if (var29) {
         for (int var30 = 0; var30 < 64; var30++) {
            for (int var31 = 0; var31 < 64; var31++) {
               class148.method4142(var25, (byte)67);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cz")
   static final int method1538(int var0, int var1) {
      if (-1 == var0) {
         return 12345678;
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

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;[BIIIIIIIII)V")
   @ObfuscatedName("bb")
   static final void method1501(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      CollisionMap[] var11 = var0.collisionMaps;
      if (null != var11 && var2 >= 0 && var2 < var11.length) {
         CollisionMap var12 = var11[var2];

         for (int var13 = var3; var13 < 8 + var3; var13++) {
            for (int var14 = var4; var14 < 8 + var4; var14++) {
               if (var12.method6401(var13, var14, 404882068)) {
                  var12.method6398(var13, var14, 1073741824, 623306950);
               }
            }
         }
      }

      Buffer var25 = new Buffer(var1);

      for (int var26 = 0; var26 < 4; var26++) {
         for (int var28 = 0; var28 < 64; var28++) {
            for (int var15 = 0; var15 < 64; var15++) {
               if (var5 == var26 && var28 >= var6 && var28 < var6 + 8 && var15 >= var7 && var15 < 8 + var7) {
                  int var16 = var3 + FontName.method11646(var28 & 7, var15 & 7, var8, (byte)13);
                  int var19 = var28 & 7;
                  int var20 = var15 & 7;
                  int var21 = var8 & 3;
                  int var18;
                  if (0 == var21) {
                     var18 = var20;
                  } else if (1 == var21) {
                     var18 = 7 - var19;
                  } else if (var21 == 2) {
                     var18 = 7 - var20;
                  } else {
                     var18 = var19;
                  }

                  int var22 = var4 + var18;
                  int var23 = (var28 & 7) + var9 + var3;
                  int var24 = var4 + var10 + (var15 & 7);
                  class264.loadTerrain(var0, var25, var2, var16, var22, var23, var24, var8, 2131363861);
               } else {
                  class264.loadTerrain(var0, var25, 0, -1, -1, 0, 0, 0, 2115041522);
               }
            }
         }
      }

      int var27 = var25.offset * 326736281 < var25.array.length ? var25.readUnsignedByte(-298147692) : 0;
      boolean var29 = 0 != (var27 & 1);
      if (var29) {
         for (int var30 = 0; var30 < 1407164985; var30++) {
            for (int var31 = 0; var31 < 64; var31++) {
               class148.method4142(var25, (byte)79);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;[BIIIIIIIII)V")
   @ObfuscatedName("bj")
   static final void method1502(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      CollisionMap[] var11 = var0.collisionMaps;
      if (null != var11 && var2 >= 0 && var2 < var11.length) {
         CollisionMap var12 = var11[var2];

         for (int var13 = var3; var13 < 8 + var3; var13++) {
            for (int var14 = var4; var14 < 8 + var4; var14++) {
               if (var12.method6401(var13, var14, -1558915045)) {
                  var12.method6398(var13, var14, 1073741824, 1380628238);
               }
            }
         }
      }

      Buffer var25 = new Buffer(var1);

      for (int var26 = 0; var26 < 4; var26++) {
         for (int var28 = 0; var28 < -1576633361; var28++) {
            for (int var15 = 0; var15 < 64; var15++) {
               if (var5 == var26 && var28 >= var6 && var28 < var6 + 8 && var15 >= var7 && var15 < 8 + var7) {
                  int var16 = var3 + FontName.method11646(var28 & 7, var15 & 7, var8, (byte)19);
                  int var19 = var28 & 7;
                  int var20 = var15 & 7;
                  int var21 = var8 & 3;
                  int var18;
                  if (0 == var21) {
                     var18 = var20;
                  } else if (1 == var21) {
                     var18 = 7 - var19;
                  } else if (var21 == 2) {
                     var18 = 7 - var20;
                  } else {
                     var18 = var19;
                  }

                  int var22 = var4 + var18;
                  int var23 = (var28 & 7) + var9 + var3;
                  int var24 = var4 + var10 + (var15 & 7);
                  class264.loadTerrain(var0, var25, var2, var16, var22, var23, var24, var8, 2112861595);
               } else {
                  class264.loadTerrain(var0, var25, 0, -1, -1, 0, 0, 0, 2129814614);
               }
            }
         }
      }

      int var27 = var25.offset * 2108391709 < var25.array.length ? var25.readUnsignedByte(100689842) : 0;
      boolean var29 = 0 != (var27 & 1);
      if (var29) {
         for (int var30 = 0; var30 < -1579974632; var30++) {
            for (int var31 = 0; var31 < 64; var31++) {
               class148.method4142(var25, (byte)84);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([[[IIII)V")
   @ObfuscatedName("bm")
   static final void method1504(int[][][] var0, int var1, int var2, int var3) {
      for (int var4 = 0; var4 < 8; var4++) {
         for (int var5 = 0; var5 < 8; var5++) {
            var0[var1][var4 + var2][var5 + var3] = 0;
         }
      }

      if (var2 > 0) {
         for (int var6 = 1; var6 < 8; var6++) {
            var0[var1][var2][var6 + var3] = var0[var1][var2 - 1][var6 + var3];
         }
      }

      if (var3 > 0) {
         for (int var7 = 1; var7 < 8; var7++) {
            var0[var1][var7 + var2][var3] = var0[var1][var2 + var7][var3 - 1];
         }
      }

      if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
         var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
      } else if (var3 > 0 && 0 != var0[var1][var2][var3 - 1]) {
         var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
      } else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
         var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([[[IIII)V")
   @ObfuscatedName("bp")
   static final void method1505(int[][][] var0, int var1, int var2, int var3) {
      for (int var4 = 0; var4 < 8; var4++) {
         for (int var5 = 0; var5 < 8; var5++) {
            var0[var1][var4 + var2][var5 + var3] = 0;
         }
      }

      if (var2 > 0) {
         for (int var6 = 1; var6 < 8; var6++) {
            var0[var1][var2][var6 + var3] = var0[var1][var2 - 1][var6 + var3];
         }
      }

      if (var3 > 0) {
         for (int var7 = 1; var7 < 8; var7++) {
            var0[var1][var7 + var2][var3] = var0[var1][var2 + var7][var3 - 1];
         }
      }

      if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
         var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
      } else if (var3 > 0 && 0 != var0[var1][var2][var3 - 1]) {
         var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
      } else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
         var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;Lxa;IIIIII)V")
   @ObfuscatedName("bt")
   static final void method1506(WorldView var0, Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[][][] var8 = var0.tileHeights;
      byte[][][] var9 = var0.tileSettings;
      if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
         var9[var2][var3][var4] = 0;

         while (true) {
            int var10 = Buffer.method12008(var1, (byte)5);
            if (0 == var10) {
               if (0 == var2) {
                  int[] var17 = var8[0][var3];
                  int var14 = var5 + -600643026;
                  int var15 = -914827892 + var6;
                  int var16 = class236.method6008(45365 + var14, var15 + 91923, 4, 1141203966)
                     - 128
                     + (class236.method6008(var14 + 10294, var15 + 37821, 2, 1865749129) - 1927705606 >> 1)
                     + (class236.method6008(var14, var15, 1, 786724539) - -581699459 >> 2);
                  var16 = (int)(var16 * 0.3) + 569140798;
                  if (var16 < 10) {
                     var16 = 10;
                  } else if (var16 > 60) {
                     var16 = 60;
                  }

                  var17[var4] = -var16 * 8;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
               }
               break;
            }

            if (1 == var10) {
               int var11 = var1.readUnsignedByte(-858689378);
               if (1 == var11) {
                  var11 = 0;
               }

               if (0 == var2) {
                  var8[0][var3][var4] = 8 * -var11;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
               }
               break;
            }

            if (var10 <= 49) {
               class623.Tiles_overlays[var2][var3][var4] = (short)var1.readShort((byte)-74);
               class200.Tiles_shapes[var2][var3][var4] = (byte)((var10 - 2) / 4);
               HttpRequest.field83[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
            } else if (var10 <= 81) {
               var9[var2][var3][var4] = (byte)(var10 - -1212464163);
            } else {
               class33.Tiles_underlays[var2][var3][var4] = (short)(var10 - -1475267424);
            }
         }
      } else {
         class148.method4142(var1, (byte)81);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;Lxa;IIIIII)V")
   @ObfuscatedName("bu")
   static final void method1507(WorldView var0, Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[][][] var8 = var0.tileHeights;
      byte[][][] var9 = var0.tileSettings;
      if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
         var9[var2][var3][var4] = 0;

         while (true) {
            int var10 = Buffer.method12008(var1, (byte)5);
            if (0 == var10) {
               if (0 == var2) {
                  int[] var17 = var8[0][var3];
                  int var14 = var5 + 932731;
                  int var15 = 556238 + var6;
                  int var16 = class236.method6008(45365 + var14, var15 + 91923, 4, 299120806)
                     - 128
                     + (class236.method6008(var14 + 10294, var15 + 37821, 2, 315409658) - 128 >> 1)
                     + (class236.method6008(var14, var15, 1, 698549217) - 128 >> 2);
                  var16 = (int)(var16 * 0.3) + 35;
                  if (var16 < 10) {
                     var16 = 10;
                  } else if (var16 > 60) {
                     var16 = 60;
                  }

                  var17[var4] = -var16 * 8;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
               }
               break;
            }

            if (1 == var10) {
               int var11 = var1.readUnsignedByte(-660825332);
               if (1 == var11) {
                  var11 = 0;
               }

               if (0 == var2) {
                  var8[0][var3][var4] = 8 * -var11;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
               }
               break;
            }

            if (var10 <= 49) {
               class623.Tiles_overlays[var2][var3][var4] = (short)var1.readShort((byte)-1);
               class200.Tiles_shapes[var2][var3][var4] = (byte)((var10 - 2) / 4);
               HttpRequest.field83[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
            } else if (var10 <= 81) {
               var9[var2][var3][var4] = (byte)(var10 - 49);
            } else {
               class33.Tiles_underlays[var2][var3][var4] = (short)(var10 - 81);
            }
         }
      } else {
         class148.method4142(var1, (byte)109);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;Lxa;IIIIII)V")
   @ObfuscatedName("ba")
   static final void method1508(WorldView var0, Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[][][] var8 = var0.tileHeights;
      byte[][][] var9 = var0.tileSettings;
      if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
         var9[var2][var3][var4] = 0;

         while (true) {
            int var10 = Buffer.method12008(var1, (byte)5);
            if (0 == var10) {
               if (0 == var2) {
                  int[] var17 = var8[0][var3];
                  int var14 = var5 + 932731;
                  int var15 = 1448403889 + var6;
                  int var16 = class236.method6008(1163696561 + var14, var15 + 91923, 4, 1049939900)
                     - -450203349
                     + (class236.method6008(var14 + -1745030089, var15 + 37821, 2, 207312987) - 128 >> 1)
                     + (class236.method6008(var14, var15, 1, 2002108538) - 1317540214 >> 2);
                  var16 = (int)(var16 * 0.3) + 35;
                  if (var16 < 10) {
                     var16 = 10;
                  } else if (var16 > -1215662288) {
                     var16 = 1891616311;
                  }

                  var17[var4] = -var16 * 8;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 1868959338;
               }
               break;
            }

            if (1 == var10) {
               int var11 = var1.readUnsignedByte(139933165);
               if (1 == var11) {
                  var11 = 0;
               }

               if (0 == var2) {
                  var8[0][var3][var4] = 8 * -var11;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
               }
               break;
            }

            if (var10 <= 49) {
               class623.Tiles_overlays[var2][var3][var4] = (short)var1.readShort((byte)-64);
               class200.Tiles_shapes[var2][var3][var4] = (byte)((var10 - 2) / 4);
               HttpRequest.field83[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
            } else if (var10 <= 81) {
               var9[var2][var3][var4] = (byte)(var10 - 49);
            } else {
               class33.Tiles_underlays[var2][var3][var4] = (short)(var10 - -1380750132);
            }
         }
      } else {
         class148.method4142(var1, (byte)55);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;Lxa;IIIIII)V")
   @ObfuscatedName("bi")
   static final void method1509(WorldView var0, Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[][][] var8 = var0.tileHeights;
      byte[][][] var9 = var0.tileSettings;
      if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
         var9[var2][var3][var4] = 0;

         while (true) {
            int var10 = Buffer.method12008(var1, (byte)5);
            if (0 == var10) {
               if (0 == var2) {
                  int[] var17 = var8[0][var3];
                  int var14 = var5 + -1400689704;
                  int var15 = 556238 + var6;
                  int var16 = class236.method6008(45365 + var14, var15 + 1300477059, 4, 1299770546)
                     - 128
                     + (class236.method6008(var14 + 959373147, var15 + -1503323896, 2, 850407843) - 128 >> 1)
                     + (class236.method6008(var14, var15, 1, 1431636432) - 1716333666 >> 2);
                  var16 = (int)(var16 * 0.3) + 35;
                  if (var16 < 10) {
                     var16 = 10;
                  } else if (var16 > -2090392981) {
                     var16 = 60;
                  }

                  var17[var4] = -var16 * 8;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 1171979615;
               }
               break;
            }

            if (1 == var10) {
               int var11 = var1.readUnsignedByte(-302127332);
               if (1 == var11) {
                  var11 = 0;
               }

               if (0 == var2) {
                  var8[0][var3][var4] = 8 * -var11;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
               }
               break;
            }

            if (var10 <= 49) {
               class623.Tiles_overlays[var2][var3][var4] = (short)var1.readShort((byte)-76);
               class200.Tiles_shapes[var2][var3][var4] = (byte)((var10 - 2) / 4);
               HttpRequest.field83[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
            } else if (var10 <= 81) {
               var9[var2][var3][var4] = (byte)(var10 - 49);
            } else {
               class33.Tiles_underlays[var2][var3][var4] = (short)(var10 - 81);
            }
         }
      } else {
         class148.method4142(var1, (byte)110);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("by")
   static void method1510(Buffer var0) {
      while (true) {
         int var1 = Buffer.method12008(var0, (byte)5);
         if (var1 != 0) {
            if (var1 != 1) {
               if (var1 <= 49) {
                  var0.readShort((byte)-108);
               }
               continue;
            }

            var0.readUnsignedByte(-856505717);
         }

         return;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bw")
   static void method1511(Buffer var0) {
      while (true) {
         int var1 = Buffer.method12008(var0, (byte)5);
         if (var1 != 0) {
            if (var1 != 1) {
               if (var1 <= -1309413099) {
                  var0.readShort((byte)-19);
               }
               continue;
            }

            var0.readUnsignedByte(-1175878947);
         }

         return;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bf")
   static void method1512(Buffer var0) {
      while (true) {
         int var1 = Buffer.method12008(var0, (byte)5);
         if (var1 != 0) {
            if (var1 != 1) {
               if (var1 <= 49) {
                  var0.readShort((byte)-8);
               }
               continue;
            }

            var0.readUnsignedByte(-576272832);
         }

         return;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BII)Z")
   @ObfuscatedName("bn")
   static final boolean method1513(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      Buffer var4 = new Buffer(var0);
      int var5 = -1;

      label81:
      while (true) {
         int var6 = Buffer.method12056(var4, -1859111725);
         if (var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while (true) {
            while (!var8) {
               int var9 = Buffer.method12050(var4, 1079032438);
               if (0 == var9) {
                  continue label81;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.readUnsignedByte(-50497128) >> 2;
               int var13 = var1 + var11;
               int var14 = var2 + var10;
               if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  ObjectComposition var15 = AsyncHttpResponse.getObjectDefinition(var5, 2020597909);
                  if (var12 != 22 || !client.isLowDetail || -1900812067 * var15.int1 != 0 || 1 == var15.interactType * 756705879 || var15.boolean2) {
                     if (!var15.method5158(1976509330)) {
                        client.field799 += -1601593403;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            int var16 = Buffer.method12050(var4, -536968686);
            if (0 == var16) {
               break;
            }

            var4.readUnsignedByte(901587165);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("ct")
   static final void method1526(WorldView var0) {
      int var1 = 2010544793 * var0.sizeX;
      int var2 = 1823353167 * var0.sizeY;
      int[][][] var3 = var0.tileHeights;
      byte[][][] var4 = var0.tileSettings;
      Scene var5 = var0.scene;
      CollisionMap[] var6 = var0.collisionMaps;

      for (int var7 = 0; var7 < 4; var7++) {
         for (int var8 = 0; var8 < var1; var8++) {
            for (int var9 = 0; var9 < var2; var9++) {
               if ((var0.tileSettings[var7][var8][var9] & 1) == 1) {
                  int var10 = var7;
                  if (2 == (var0.tileSettings[1][var8][var9] & 2)) {
                     var10 = var7 - 1;
                  }

                  if (var10 >= 0 && null != var6) {
                     var6[var10].setBlockedByFloor(var8, var9, (byte)-120);
                  }
               }
            }
         }
      }

      rndHue = rndHue + ((int)(Math.random() * 5.0) - 2) * 392617369;
      if (1001072297 * rndHue < -8) {
         rndHue = 1154028344;
      }

      if (rndHue * 1001072297 > 8) {
         rndHue = -1154028344;
      }

      rndLightness = rndLightness + ((int)(Math.random() * 5.0) - 2) * -1098612701;
      if (rndLightness * -1076351093 < -16) {
         rndLightness = 397934032;
      }

      if (rndLightness * -1076351093 > 16) {
         rndLightness = -397934032;
      }

      for (int var48 = 0; var48 < 4; var48++) {
         byte[][] var50 = Tiles_underlays2[var48];
         byte var52 = 96;
         short var53 = 768;
         byte var11 = -50;
         byte var12 = -10;
         byte var13 = -50;
         int var14 = (int)Math.sqrt(5100.0);
         int var15 = var14 * 768 >> 8;

         for (int var16 = 1; var16 < var2 - 1; var16++) {
            for (int var17 = 1; var17 < var1 - 1; var17++) {
               int var18 = var3[var48][var17 + 1][var16] - var3[var48][var17 - 1][var16];
               int var19 = var3[var48][var17][var16 + 1] - var3[var48][var17][var16 - 1];
               int var20 = (int)Math.sqrt(var18 * var18 + 65536 + var19 * var19);
               int var21 = (var18 << 8) / var20;
               int var22 = 65536 / var20;
               int var23 = (var19 << 8) / var20;
               int var24 = (-50 * var23 + var21 * -50 + -10 * var22) / var15 + 96;
               int var25 = (var50[1 + var17][var16] >> 3)
                  + (var50[var17 - 1][var16] >> 2)
                  + (var50[var17][var16 - 1] >> 2)
                  + (var50[var17][1 + var16] >> 3)
                  + (var50[var17][var16] >> 1);
               MouseRecorder.field1086[var17][var16] = var24 - var25;
            }
         }

         for (int var54 = 0; var54 < var2; var54++) {
            WorldMapSectionType.Tiles_hue[var54] = 0;
            class565.Tiles_saturation[var54] = 0;
            class67.Tiles_lightness[var54] = 0;
            class161.Tiles_hueMultiplier[var54] = 0;
            class154.field1761[var54] = 0;
         }

         for (int var55 = -5; var55 < var1 + 5; var55++) {
            for (int var57 = 0; var57 < var2; var57++) {
               int var60 = var55 + 5;
               if (var60 >= 0 && var60 < var1) {
                  int var62 = (int)InvDefinition.method4227(15, (byte)0);
                  int var65 = class33.Tiles_underlays[var48][var60][var57] & var62;
                  if (var65 > 0) {
                     int var71 = var65 - 1;
                     FloorUnderlayDefinition var75 = (FloorUnderlayDefinition)class402.method8806(FloorUnderlayDefinition.FloorUnderlayDefinition_cached, var71);
                     FloorUnderlayDefinition var68;
                     if (var75 != null) {
                        var68 = var75;
                     } else {
                        byte[] var79 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.getFile(1, var71, 1183969597);
                        var75 = new FloorUnderlayDefinition();
                        if (null != var79) {
                           FloorUnderlayDefinition.method4504(var75, new Buffer(var79), var71, 217856287);
                        }

                        var75.postDecode(-1500289702);
                        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var75, var71);
                        var68 = var75;
                     }

                     WorldMapSectionType.Tiles_hue[var57] = WorldMapSectionType.Tiles_hue[var57] + 124413169 * var68.hue;
                     class565.Tiles_saturation[var57] = class565.Tiles_saturation[var57] + -1731148931 * var68.saturation;
                     class67.Tiles_lightness[var57] = class67.Tiles_lightness[var57] + var68.lightness * -1928632847;
                     class161.Tiles_hueMultiplier[var57] = class161.Tiles_hueMultiplier[var57] + var68.hueMultiplier * -1636648267;
                     class154.field1761[var57]++;
                  }
               }

               int var63 = var55 - 5;
               if (var63 >= 0 && var63 < var1) {
                  int var66 = (int)InvDefinition.method4227(15, (byte)0);
                  int var69 = class33.Tiles_underlays[var48][var63][var57] & var66;
                  if (var69 > 0) {
                     int var77 = var69 - 1;
                     FloorUnderlayDefinition var80 = (FloorUnderlayDefinition)class402.method8806(FloorUnderlayDefinition.FloorUnderlayDefinition_cached, var77);
                     FloorUnderlayDefinition var72;
                     if (var80 != null) {
                        var72 = var80;
                     } else {
                        byte[] var83 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.getFile(1, var77, -506831021);
                        var80 = new FloorUnderlayDefinition();
                        if (var83 != null) {
                           FloorUnderlayDefinition.method4504(var80, new Buffer(var83), var77, 491222349);
                        }

                        var80.postDecode(-346520954);
                        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var80, var77);
                        var72 = var80;
                     }

                     WorldMapSectionType.Tiles_hue[var57] = WorldMapSectionType.Tiles_hue[var57] - 124413169 * var72.hue;
                     class565.Tiles_saturation[var57] = class565.Tiles_saturation[var57] - var72.saturation * -1731148931;
                     class67.Tiles_lightness[var57] = class67.Tiles_lightness[var57] - -1928632847 * var72.lightness;
                     class161.Tiles_hueMultiplier[var57] = class161.Tiles_hueMultiplier[var57] - -1636648267 * var72.hueMultiplier;
                     class154.field1761[var57]--;
                  }
               }
            }

            if (var55 >= 1 && var55 < var1 - 1) {
               int var58 = 0;
               int var61 = 0;
               int var64 = 0;
               int var67 = 0;
               int var70 = 0;

               for (int var73 = -5; var73 < var2 + 5; var73++) {
                  int var78 = 5 + var73;
                  if (var78 >= 0 && var78 < var2) {
                     var58 += WorldMapSectionType.Tiles_hue[var78];
                     var61 += class565.Tiles_saturation[var78];
                     var64 += class67.Tiles_lightness[var78];
                     var67 += class161.Tiles_hueMultiplier[var78];
                     var70 += class154.field1761[var78];
                  }

                  int var82 = var73 - 5;
                  if (var82 >= 0 && var82 < var2) {
                     var58 -= WorldMapSectionType.Tiles_hue[var82];
                     var61 -= class565.Tiles_saturation[var82];
                     var64 -= class67.Tiles_lightness[var82];
                     var67 -= class161.Tiles_hueMultiplier[var82];
                     var70 -= class154.field1761[var82];
                  }

                  if (var73 >= 1 && var73 < var2 - 1 && (!client.isLowDetail || (var4[0][var55][var73] & 2) != 0 || (var4[var48][var55][var73] & 16) == 0)) {
                     if (var48 < Tiles_minPlane * -957711027) {
                        Tiles_minPlane = var48 * 84476805;
                     }

                     int var84 = (int)InvDefinition.method4227(15, (byte)0);
                     int var26 = class33.Tiles_underlays[var48][var55][var73] & var84;
                     int var27 = class623.Tiles_overlays[var48][var55][var73] & var84;
                     if (var26 > 0 || var27 > 0) {
                        int var28 = var3[var48][var55][var73];
                        int var29 = var3[var48][var55 + 1][var73];
                        int var30 = var3[var48][var55 + 1][1 + var73];
                        int var31 = var3[var48][var55][var73 + 1];
                        int var32 = MouseRecorder.field1086[var55][var73];
                        int var33 = MouseRecorder.field1086[var55 + 1][var73];
                        int var34 = MouseRecorder.field1086[var55 + 1][1 + var73];
                        int var35 = MouseRecorder.field1086[var55][1 + var73];
                        int var36 = -1;
                        int var37 = -1;
                        if (var26 > 0) {
                           int var38 = var58 * 256 / var67;
                           int var39 = var61 / var70;
                           int var40 = var64 / var70;
                           var36 = class39.method649(var38, var39, var40, 1128984967);
                           var38 = 1001072297 * rndHue + var38 & 0xFF;
                           var40 += -1076351093 * rndLightness;
                           if (var40 < 0) {
                              var40 = 0;
                           } else if (var40 > 255) {
                              var40 = 255;
                           }

                           var37 = class39.method649(var38, var39, var40, 1128984967);
                        }

                        if (var48 > 0) {
                           boolean var86 = true;
                           if (var26 == 0 && 0 != class200.Tiles_shapes[var48][var55][var73]) {
                              var86 = false;
                           }

                           if (var27 > 0 && !class189.method4809(var27 - 1, 2138714436).hideUnderlay) {
                              var86 = false;
                           }

                           if (var86 && var28 == var29 && var30 == var28 && var28 == var31) {
                              class148.field1911[var48][var55][var73] = class148.field1911[var48][var55][var73] | 2340;
                           }
                        }

                        int var87 = 0;
                        if (-1 != var37) {
                           var87 = Rasterizer3D.Rasterizer3D_colorPalette[class57.method1371(var37, 96, (byte)-113)];
                        }

                        if (var27 == 0) {
                           var5.addTile(
                              var48,
                              var55,
                              var73,
                              0,
                              0,
                              -1,
                              var28,
                              var29,
                              var30,
                              var31,
                              class57.method1371(var36, var32, (byte)-127),
                              class57.method1371(var36, var33, (byte)-87),
                              class57.method1371(var36, var34, (byte)-32),
                              class57.method1371(var36, var35, (byte)-17),
                              0,
                              0,
                              0,
                              0,
                              var87,
                              0
                           );
                        } else {
                           int var88 = class200.Tiles_shapes[var48][var55][var73] + 1;
                           byte var90 = HttpRequest.field83[var48][var55][var73];
                           FloorOverlayDefinition var41 = class189.method4809(var27 - 1, 1965108548);
                           int var42 = var41.texture * 892155017;
                           int var43;
                           int var44;
                           if (var42 >= 0) {
                              var44 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var42, 1468933595);
                              var43 = -1;
                           } else if (16711935 == 50022547 * var41.primaryRgb) {
                              var43 = -2;
                              var42 = -1;
                              var44 = -2;
                           } else {
                              var43 = class39.method649(-1914711119 * var41.hue, -1834712605 * var41.saturation, 1894985397 * var41.lightness, 1128984967);
                              int var45 = -1914711119 * var41.hue + rndHue * 1001072297 & 0xFF;
                              int var46 = -1076351093 * rndLightness + var41.lightness * 1894985397;
                              if (var46 < 0) {
                                 var46 = 0;
                              } else if (var46 > 255) {
                                 var46 = 255;
                              }

                              var44 = class39.method649(var45, var41.saturation * -1834712605, var46, 1128984967);
                           }

                           int var92 = 0;
                           if (var44 != -2) {
                              var92 = Rasterizer3D.Rasterizer3D_colorPalette[class212.method5134(var44, 96, 1625464917)];
                           }

                           if (var41.secondaryRgb * 705541053 != -1) {
                              int var93 = rndHue * 1001072297 + var41.secondaryHue * -347808971 & 0xFF;
                              int var47 = -1076351093 * rndLightness + var41.secondaryLightness * 2020271701;
                              if (var47 < 0) {
                                 var47 = 0;
                              } else if (var47 > 255) {
                                 var47 = 255;
                              }

                              var44 = class39.method649(var93, -796039805 * var41.secondarySaturation, var47, 1128984967);
                              var92 = Rasterizer3D.Rasterizer3D_colorPalette[class212.method5134(var44, 96, -1758957395)];
                           }

                           var5.addTile(
                              var48,
                              var55,
                              var73,
                              var88,
                              var90,
                              var42,
                              var28,
                              var29,
                              var30,
                              var31,
                              class57.method1371(var36, var32, (byte)-3),
                              class57.method1371(var36, var33, (byte)-27),
                              class57.method1371(var36, var34, (byte)-38),
                              class57.method1371(var36, var35, (byte)-93),
                              class212.method5134(var43, var32, 524574661),
                              class212.method5134(var43, var33, 748635144),
                              class212.method5134(var43, var34, -1793000998),
                              class212.method5134(var43, var35, 665619302),
                              var87,
                              var92
                           );
                        }
                     }
                  }
               }
            }
         }

         for (int var56 = 1; var56 < var2 - 1; var56++) {
            for (int var59 = 1; var59 < var1 - 1; var59++) {
               int var74;
               if (0 != (var0.tileSettings[var48][var59][var56] & 8)) {
                  var74 = 0;
               } else if (var48 > 0 && (var0.tileSettings[1][var59][var56] & 2) != 0) {
                  var74 = var48 - 1;
               } else {
                  var74 = var48;
               }

               var5.method5706(var48, var59, var56, var74);
            }
         }

         class33.Tiles_underlays[var48] = (short[][])null;
         class623.Tiles_overlays[var48] = (short[][])null;
         class200.Tiles_shapes[var48] = (byte[][])null;
         HttpRequest.field83[var48] = (byte[][])null;
         Tiles_underlays2[var48] = (byte[][])null;
      }

      Scene.method5718(var5, -50, -10, -50);

      for (int var49 = 0; var49 < var1; var49++) {
         for (int var51 = 0; var51 < var2; var51++) {
            if ((var4[1][var49][var51] & 2) == 2) {
               Scene.method5722(var5, var49, var51);
            }
         }
      }

      if (WorldView.method3060(var0, (byte)0)) {
         HttpResponse.method143(var0, (byte)1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BII)Z")
   @ObfuscatedName("br")
   static final boolean method1514(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      Buffer var4 = new Buffer(var0);
      int var5 = -1;

      label75:
      while (true) {
         int var6 = Buffer.method12056(var4, 1475227594);
         if (var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while (true) {
            while (!var8) {
               int var9 = Buffer.method12050(var4, -1298772913);
               if (0 == var9) {
                  continue label75;
               }

               var7 += var9 - 1;
               int var10 = var7 & 1239362073;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.readUnsignedByte(781803384) >> 2;
               int var13 = var1 + var11;
               int var14 = var2 + var10;
               if (var13 > 0 && var14 > 0 && var13 < -1123418620 && var14 < -993776759) {
                  ObjectComposition var15 = AsyncHttpResponse.getObjectDefinition(var5, 2115499292);
                  if (var12 != 22 || !client.isLowDetail || -1900812067 * var15.int1 != 0 || 1 == var15.interactType * 1765904342 || var15.boolean2) {
                     if (!var15.method5158(1731972222)) {
                        client.field799 += -87187701;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            int var16 = Buffer.method12050(var4, -87162806);
            if (0 == var16) {
               break;
            }

            var4.readUnsignedByte(-1367305701);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(J)I")
   @ObfuscatedName("ag")
   public static int method1494(long var0) {
      try {
         return (int)(var0 >>> 0 & 127L);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ck.ag(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;[BII)V")
   @ObfuscatedName("bl")
   static final void method1517(WorldView var0, byte[] var1, int var2, int var3) {
      Buffer var4 = new Buffer(var1);
      int var5 = -1;

      while (true) {
         int var6 = Buffer.method12056(var4, -495955160);
         if (var6 == 0) {
            return;
         }

         var5 += var6;
         int var7 = 0;

         while (true) {
            int var8 = Buffer.method12050(var4, -856127352);
            if (var8 == 0) {
               break;
            }

            var7 += var8 - 1;
            int var9 = var7 & -1331170452;
            int var10 = var7 >> 6 & -1151687633;
            int var11 = var7 >> 12;
            int var12 = var4.readUnsignedByte(721367762);
            int var13 = var12 >> 2;
            int var14 = var12 & 3;
            int var15 = var2 + var10;
            int var16 = var3 + var9;
            if (var15 > 0 && var16 > 0 && var15 < var0.tileHeights[0].length - 2 && var16 < var0.tileHeights[0][0].length - 2) {
               int var17 = var11;
               if (2 == (var0.tileSettings[1][var15][var16] & 2)) {
                  var17 = var11 - 1;
               }

               CollisionMap var18 = null;
               if (var17 >= 0 && null != var0.collisionMaps) {
                  var18 = var0.collisionMaps[var17];
               }

               FriendSystem.addObjects(var0, var11, var15, var16, var5, var14, var13, var18, -282796486);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;IIIIIILkk;)V")
   @ObfuscatedName("cu")
   static final void method1524(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, CollisionMap var7) {
      if (!client.isLowDetail || (var0.tileSettings[0][var2][var3] & 2) != 0 || 0 == (var0.tileSettings[var1][var2][var3] & 16)) {
         if (var1 < -957711027 * Tiles_minPlane) {
            Tiles_minPlane = var1 * 84476805;
         }

         ObjectComposition var8 = AsyncHttpResponse.getObjectDefinition(var4, 2082558878);
         int var9;
         int var10;
         if (1 != var5 && var5 != 3) {
            var9 = 1813358617 * var8.sizeX;
            var10 = var8.sizeY * -352504863;
         } else {
            var9 = -352504863 * var8.sizeY;
            var10 = var8.sizeX * 1813358617;
         }

         int var11;
         int var12;
         if (var9 + var2 <= 2010544793 * var0.sizeX) {
            var11 = var2 + (var9 >> 1);
            var12 = (1 + var9 >> 1) + var2;
         } else {
            var11 = var2;
            var12 = var2 + 1;
         }

         int var13;
         int var14;
         if (var10 + var3 <= var0.sizeY * 1823353167) {
            var13 = (var10 >> 1) + var3;
            var14 = var3 + (var10 + 1 >> 1);
         } else {
            var13 = var3;
            var14 = var3 + 1;
         }

         int[][] var15 = var0.tileHeights[var1];
         int var16 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
         int var17 = (var9 << 6) + (var2 << 7);
         int var18 = (var10 << 6) + (var3 << 7);
         long var19 = class236.calculateTag(var1, var2, var3, 2, 0 == -1900812067 * var8.int1, var4, var0.id * 577964535, -1329739818);
         int var21 = var6 + (var5 << 6);
         if (1 == 1768476057 * var8.int3) {
            var21 += 256;
         }

         if (var8.hasSound(1284396008)) {
            var0.createObjectSound(var1, var2, var3, var8, var5, -1715502619);
         }

         Scene var22 = var0.scene;
         if (22 == var6) {
            if (!client.isLowDetail || 0 != var8.int1 * -1900812067 || 1 == var8.interactType * 756705879 || var8.boolean2) {
               Object var40;
               if (-1 == 930784507 * var8.animationId && var8.transforms == null) {
                  var40 = var8.getEntity(22, var5, var15, var17, var16, var18, -1400444893);
               } else {
                  var40 = new DynamicObject(var0, var4, 22, var5, var1, var2, var3, var8.animationId * 930784507, var8.boolean3, null);
               }

               Scene.method5745(var22, var1, var2, var3, var16, (Renderable)var40, var19, var21);
               if (1 == 756705879 * var8.interactType && var7 != null) {
                  var7.setBlockedByFloorDec(var2, var3, (byte)76);
               }
            }
         } else if (var6 != 10 && 11 != var6) {
            if (var6 >= 12) {
               Object var39;
               if (-1 == var8.animationId * 930784507 && null == var8.transforms) {
                  var39 = var8.getEntity(var6, var5, var15, var17, var16, var18, -1973585238);
               } else {
                  var39 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var8.animationId * 930784507, var8.boolean3, null);
               }

               var22.method5502(var1, var2, var3, var16, 1, 1, (Renderable)var39, 0, var19, var21);
               if (var6 >= 12 && var6 <= 17 && 13 != var6 && var1 > 0) {
                  class148.field1911[var1][var2][var3] = class148.field1911[var1][var2][var3] | 2340;
               }

               if (0 != var8.interactType * 756705879 && null != var7) {
                  CollisionMap.method6417(var7, var2, var3, var9, var10, var8.boolean1, -744686489);
               }
            } else if (0 == var6) {
               Object var38;
               if (930784507 * var8.animationId == -1 && var8.transforms == null) {
                  var38 = var8.getEntity(0, var5, var15, var17, var16, var18, -1952078362);
               } else {
                  var38 = new DynamicObject(var0, var4, 0, var5, var1, var2, var3, 930784507 * var8.animationId, var8.boolean3, null);
               }

               var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var38, null, field602[var5], 0, var19, var21);
               if (0 == var5) {
                  if (var8.clipped) {
                     Tiles_underlays2[var1][var2][var3] = 50;
                     Tiles_underlays2[var1][var2][1 + var3] = 50;
                  }

                  if (var8.modelClipped) {
                     class148.field1911[var1][var2][var3] = class148.field1911[var1][var2][var3] | 585;
                  }
               } else if (1 == var5) {
                  if (var8.clipped) {
                     Tiles_underlays2[var1][var2][1 + var3] = 50;
                     Tiles_underlays2[var1][1 + var2][var3 + 1] = 50;
                  }

                  if (var8.modelClipped) {
                     class148.field1911[var1][var2][1 + var3] = class148.field1911[var1][var2][1 + var3] | 1170;
                  }
               } else if (var5 == 2) {
                  if (var8.clipped) {
                     Tiles_underlays2[var1][var2 + 1][var3] = 50;
                     Tiles_underlays2[var1][var2 + 1][1 + var3] = 50;
                  }

                  if (var8.modelClipped) {
                     class148.field1911[var1][var2 + 1][var3] = class148.field1911[var1][var2 + 1][var3] | 585;
                  }
               } else if (var5 == 3) {
                  if (var8.clipped) {
                     Tiles_underlays2[var1][var2][var3] = 50;
                     Tiles_underlays2[var1][var2 + 1][var3] = 50;
                  }

                  if (var8.modelClipped) {
                     class148.field1911[var1][var2][var3] = class148.field1911[var1][var2][var3] | 1170;
                  }
               }

               if (0 != 756705879 * var8.interactType && null != var7) {
                  CollisionMap.method6408(var7, var2, var3, var6, var5, var8.boolean1, -749556228);
               }

               if (16 != 854845213 * var8.int2) {
                  var22.method5715(var1, var2, var3, 854845213 * var8.int2);
               }
            } else if (var6 == 1) {
               Object var37;
               if (-1 == 930784507 * var8.animationId && var8.transforms == null) {
                  var37 = var8.getEntity(1, var5, var15, var17, var16, var18, -1599887284);
               } else {
                  var37 = new DynamicObject(var0, var4, 1, var5, var1, var2, var3, var8.animationId * 930784507, var8.boolean3, null);
               }

               var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var37, null, field605[var5], 0, var19, var21);
               if (var8.clipped) {
                  if (var5 == 0) {
                     Tiles_underlays2[var1][var2][var3 + 1] = 50;
                  } else if (var5 == 1) {
                     Tiles_underlays2[var1][var2 + 1][1 + var3] = 50;
                  } else if (2 == var5) {
                     Tiles_underlays2[var1][1 + var2][var3] = 50;
                  } else if (var5 == 3) {
                     Tiles_underlays2[var1][var2][var3] = 50;
                  }
               }

               if (756705879 * var8.interactType != 0 && null != var7) {
                  CollisionMap.method6408(var7, var2, var3, var6, var5, var8.boolean1, -287576682);
               }
            } else if (2 == var6) {
               int var36 = var5 + 1 & 3;
               Object var45;
               Object var46;
               if (var8.animationId * 930784507 == -1 && null == var8.transforms) {
                  var45 = var8.getEntity(2, 4 + var5, var15, var17, var16, var18, -1388024224);
                  var46 = var8.getEntity(2, var36, var15, var17, var16, var18, -1898630593);
               } else {
                  var45 = new DynamicObject(var0, var4, 2, 4 + var5, var1, var2, var3, var8.animationId * 930784507, var8.boolean3, null);
                  var46 = new DynamicObject(var0, var4, 2, var36, var1, var2, var3, var8.animationId * 930784507, var8.boolean3, null);
               }

               var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var45, (Renderable)var46, field602[var5], field602[var36], var19, var21);
               if (var8.modelClipped) {
                  if (0 == var5) {
                     class148.field1911[var1][var2][var3] = class148.field1911[var1][var2][var3] | 585;
                     class148.field1911[var1][var2][var3 + 1] = class148.field1911[var1][var2][var3 + 1] | 1170;
                  } else if (1 == var5) {
                     class148.field1911[var1][var2][1 + var3] = class148.field1911[var1][var2][1 + var3] | 1170;
                     class148.field1911[var1][1 + var2][var3] = class148.field1911[var1][1 + var2][var3] | 585;
                  } else if (2 == var5) {
                     class148.field1911[var1][1 + var2][var3] = class148.field1911[var1][1 + var2][var3] | 585;
                     class148.field1911[var1][var2][var3] = class148.field1911[var1][var2][var3] | 1170;
                  } else if (var5 == 3) {
                     class148.field1911[var1][var2][var3] = class148.field1911[var1][var2][var3] | 1170;
                     class148.field1911[var1][var2][var3] = class148.field1911[var1][var2][var3] | 585;
                  }
               }

               if (0 != 756705879 * var8.interactType && null != var7) {
                  CollisionMap.method6408(var7, var2, var3, var6, var5, var8.boolean1, 349931605);
               }

               if (var8.int2 * 854845213 != 16) {
                  var22.method5715(var1, var2, var3, var8.int2 * 854845213);
               }
            } else if (3 == var6) {
               Object var35;
               if (-1 == 930784507 * var8.animationId && null == var8.transforms) {
                  var35 = var8.getEntity(3, var5, var15, var17, var16, var18, -1512150644);
               } else {
                  var35 = new DynamicObject(var0, var4, 3, var5, var1, var2, var3, var8.animationId * 930784507, var8.boolean3, null);
               }

               var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var35, null, field605[var5], 0, var19, var21);
               if (var8.clipped) {
                  if (0 == var5) {
                     Tiles_underlays2[var1][var2][var3 + 1] = 50;
                  } else if (1 == var5) {
                     Tiles_underlays2[var1][var2 + 1][1 + var3] = 50;
                  } else if (2 == var5) {
                     Tiles_underlays2[var1][var2 + 1][var3] = 50;
                  } else if (var5 == 3) {
                     Tiles_underlays2[var1][var2][var3] = 50;
                  }
               }

               if (756705879 * var8.interactType != 0 && var7 != null) {
                  CollisionMap.method6408(var7, var2, var3, var6, var5, var8.boolean1, -1050904887);
               }
            } else if (var6 == 9) {
               Object var34;
               if (-1 == 930784507 * var8.animationId && null == var8.transforms) {
                  var34 = var8.getEntity(var6, var5, var15, var17, var16, var18, -2026345015);
               } else {
                  var34 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, 930784507 * var8.animationId, var8.boolean3, null);
               }

               var22.method5502(var1, var2, var3, var16, 1, 1, (Renderable)var34, 0, var19, var21);
               if (0 != 756705879 * var8.interactType && null != var7) {
                  CollisionMap.method6417(var7, var2, var3, var9, var10, var8.boolean1, -1381143115);
               }

               if (16 != var8.int2 * 854845213) {
                  var22.method5715(var1, var2, var3, var8.int2 * 854845213);
               }
            } else if (4 == var6) {
               Object var33;
               if (930784507 * var8.animationId == -1 && null == var8.transforms) {
                  var33 = var8.getEntity(4, var5, var15, var17, var16, var18, -2012378887);
               } else {
                  var33 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var8.animationId * 930784507, var8.boolean3, null);
               }

               var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var33, null, field602[var5], 0, 0, 0, var19, var21);
            } else if (var6 == 5) {
               int var32 = 16;
               long var44 = Scene.method5731(var22, var1, var2, var3);
               if (0L != var44) {
                  var32 = AsyncHttpResponse.getObjectDefinition(HorizontalAlignment.Entity_unpackID(var44), 2081803574).int2 * 854845213;
               }

               Object var49;
               if (930784507 * var8.animationId == -1 && null == var8.transforms) {
                  var49 = var8.getEntity(4, var5, var15, var17, var16, var18, -1610212732);
               } else {
                  var49 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var8.animationId * 930784507, var8.boolean3, null);
               }

               var22.newWallDecoration(
                  var1, var2, var3, var16, (Renderable)var49, null, field602[var5], 0, field604[var5] * var32, var32 * field603[var5], var19, var21
               );
            } else if (var6 == 6) {
               int var31 = 8;
               long var43 = Scene.method5731(var22, var1, var2, var3);
               if (0L != var43) {
                  var31 = AsyncHttpResponse.getObjectDefinition(HorizontalAlignment.Entity_unpackID(var43), 1991520466).int2 * 854845213 / 2;
               }

               Object var48;
               if (930784507 * var8.animationId == -1 && null == var8.transforms) {
                  var48 = var8.getEntity(4, 4 + var5, var15, var17, var16, var18, -1921345420);
               } else {
                  var48 = new DynamicObject(var0, var4, 4, 4 + var5, var1, var2, var3, var8.animationId * 930784507, var8.boolean3, null);
               }

               var22.newWallDecoration(
                  var1, var2, var3, var16, (Renderable)var48, null, 256, var5, field606[var5] * var31, var31 * field607[var5], var19, var21
               );
            } else if (var6 == 7) {
               int var42 = 2 + var5 & 3;
               Object var30;
               if (-1 == 930784507 * var8.animationId && null == var8.transforms) {
                  var30 = var8.getEntity(4, var42 + 4, var15, var17, var16, var18, -1801290134);
               } else {
                  var30 = new DynamicObject(var0, var4, 4, 4 + var42, var1, var2, var3, var8.animationId * 930784507, var8.boolean3, null);
               }

               var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var30, null, 256, var42, 0, 0, var19, var21);
            } else if (var6 == 8) {
               int var29 = 8;
               long var41 = Scene.method5731(var22, var1, var2, var3);
               if (0L != var41) {
                  var29 = AsyncHttpResponse.getObjectDefinition(HorizontalAlignment.Entity_unpackID(var41), 2077343467).int2 * 854845213 / 2;
               }

               int var28 = var5 + 2 & 3;
               Object var27;
               Object var47;
               if (var8.animationId * 930784507 == -1 && null == var8.transforms) {
                  var47 = var8.getEntity(4, 4 + var5, var15, var17, var16, var18, -1666092132);
                  var27 = var8.getEntity(4, 4 + var28, var15, var17, var16, var18, -1563380171);
               } else {
                  var47 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, 930784507 * var8.animationId, var8.boolean3, null);
                  var27 = new DynamicObject(var0, var4, 4, var28 + 4, var1, var2, var3, 930784507 * var8.animationId, var8.boolean3, null);
               }

               var22.newWallDecoration(
                  var1, var2, var3, var16, (Renderable)var47, (Renderable)var27, 256, var5, field606[var5] * var29, var29 * field607[var5], var19, var21
               );
            }
         } else {
            Object var23;
            if (-1 == 930784507 * var8.animationId && var8.transforms == null) {
               var23 = var8.getEntity(10, var5, var15, var17, var16, var18, -1975441972);
            } else {
               var23 = new DynamicObject(var0, var4, 10, var5, var1, var2, var3, 930784507 * var8.animationId, var8.boolean3, null);
            }

            if (null != var23 && var22.method5502(var1, var2, var3, var16, var9, var10, (Renderable)var23, 11 == var6 ? 256 : 0, var19, var21) && var8.clipped) {
               int var24 = 15;
               if (var23 instanceof Model) {
                  var24 = WorldMapCacheName.method7398((Model)var23) / 4;
                  if (var24 > 30) {
                     var24 = 30;
                  }
               }

               for (int var25 = 0; var25 <= var9; var25++) {
                  for (int var26 = 0; var26 <= var10; var26++) {
                     if (var24 > Tiles_underlays2[var1][var25 + var2][var3 + var26]) {
                        Tiles_underlays2[var1][var25 + var2][var26 + var3] = (byte)var24;
                     }
                  }
               }
            }

            if (var8.interactType * 756705879 != 0 && var7 != null) {
               CollisionMap.method6417(var7, var2, var3, var9, var10, var8.boolean1, -1197965933);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;[BII)V")
   @ObfuscatedName("bq")
   static final void method1518(WorldView var0, byte[] var1, int var2, int var3) {
      Buffer var4 = new Buffer(var1);
      int var5 = -1;

      while (true) {
         int var6 = Buffer.method12056(var4, -1317803586);
         if (var6 == 0) {
            return;
         }

         var5 += var6;
         int var7 = 0;

         while (true) {
            int var8 = Buffer.method12050(var4, 1317716081);
            if (var8 == 0) {
               break;
            }

            var7 += var8 - 1;
            int var9 = var7 & -1132660638;
            int var10 = var7 >> 6 & 63;
            int var11 = var7 >> 12;
            int var12 = var4.readUnsignedByte(-1711084013);
            int var13 = var12 >> 2;
            int var14 = var12 & 3;
            int var15 = var2 + var10;
            int var16 = var3 + var9;
            if (var15 > 0 && var16 > 0 && var15 < var0.tileHeights[0].length - 2 && var16 < var0.tileHeights[0][0].length - 2) {
               int var17 = var11;
               if (2 == (var0.tileSettings[1][var15][var16] & 2)) {
                  var17 = var11 - 1;
               }

               CollisionMap var18 = null;
               if (var17 >= 0 && null != var0.collisionMaps) {
                  var18 = var0.collisionMaps[var17];
               }

               FriendSystem.addObjects(var0, var11, var15, var16, var5, var14, var13, var18, -491549075);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ci")
   static final int method1539(int var0, int var1) {
      if (var0 == -2) {
         return 1816854014;
      } else if (-1 == var0) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > -936783543) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & 65408);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;[BIIIIIII)V")
   @ObfuscatedName("bv")
   static final void method1522(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Buffer var9 = new Buffer(var1);
      int var10 = -1;

      while (true) {
         int var11 = Buffer.method12056(var9, -1820082682);
         if (0 == var11) {
            return;
         }

         var10 += var11;
         int var12 = 0;

         while (true) {
            int var13 = Buffer.method12050(var9, -495218951);
            if (0 == var13) {
               break;
            }

            var12 += var13 - 1;
            int var14 = var12 & 63;
            int var15 = var12 >> 6 & 63;
            int var16 = var12 >> 12;
            int var17 = var9.readUnsignedByte(1181796151);
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            if (var5 == var16 && var15 >= var6 && var15 < 8 + var6 && var14 >= var7 && var14 < 8 + var7) {
               ObjectComposition var20 = AsyncHttpResponse.getObjectDefinition(var10, 2016705242);
               int var23 = var15 & 7;
               int var24 = var14 & 7;
               int var26 = var20.sizeX * 1813358617;
               int var27 = -352504863 * var20.sizeY;
               if (1 == (var19 & 1)) {
                  int var28 = var26;
                  var26 = var27;
                  var27 = var28;
               }

               int var25 = var8 & 3;
               int var22;
               if (var25 == 0) {
                  var22 = var23;
               } else if (1 == var25) {
                  var22 = var24;
               } else if (2 == var25) {
                  var22 = 7 - var23 - (var26 - 1);
               } else {
                  var22 = 7 - var24 - (var27 - 1);
               }

               int var32 = var22 + var3;
               int var29 = var4 + class69.method1396(var15 & 7, var14 & 7, var8, 1813358617 * var20.sizeX, var20.sizeY * -352504863, var19, -267479305);
               if (var32 > 0 && var29 > 0 && var32 < var0.sizeX * 2010544793 - 1 && var29 < var0.sizeY * 1823353167 - 1) {
                  int var30 = var2;
                  if (2 == (var0.tileSettings[1][var32][var29] & 2)) {
                     var30 = var2 - 1;
                  }

                  CollisionMap var31 = null;
                  if (var30 >= 0 && null != var0.collisionMaps) {
                     var31 = var0.collisionMaps[var30];
                  }

                  FriendSystem.addObjects(var0, var2, var32, var29, var10, var19 + var8 & 3, var18, var31, -163168253);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;[BIIIIIII)V")
   @ObfuscatedName("ch")
   static final void method1523(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      Buffer var9 = new Buffer(var1);
      int var10 = -1;

      while (true) {
         int var11 = Buffer.method12056(var9, 1300691709);
         if (0 == var11) {
            return;
         }

         var10 += var11;
         int var12 = 0;

         while (true) {
            int var13 = Buffer.method12050(var9, -1041439748);
            if (0 == var13) {
               break;
            }

            var12 += var13 - 1;
            int var14 = var12 & 63;
            int var15 = var12 >> 6 & 63;
            int var16 = var12 >> 12;
            int var17 = var9.readUnsignedByte(1240178858);
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            if (var5 == var16 && var15 >= var6 && var15 < 8 + var6 && var14 >= var7 && var14 < 8 + var7) {
               ObjectComposition var20 = AsyncHttpResponse.getObjectDefinition(var10, 1999597827);
               int var23 = var15 & 7;
               int var24 = var14 & 7;
               int var26 = var20.sizeX * 1813358617;
               int var27 = -352504863 * var20.sizeY;
               if (1 == (var19 & 1)) {
                  int var28 = var26;
                  var26 = var27;
                  var27 = var28;
               }

               int var25 = var8 & 3;
               int var22;
               if (var25 == 0) {
                  var22 = var23;
               } else if (1 == var25) {
                  var22 = var24;
               } else if (2 == var25) {
                  var22 = 7 - var23 - (var26 - 1);
               } else {
                  var22 = 7 - var24 - (var27 - 1);
               }

               int var32 = var22 + var3;
               int var29 = var4 + class69.method1396(var15 & 7, var14 & 7, var8, 1813358617 * var20.sizeX, var20.sizeY * 2013076765, var19, 2034172774);
               if (var32 > 0 && var29 > 0 && var32 < var0.sizeX * -1532214257 - 1 && var29 < var0.sizeY * 1251151633 - 1) {
                  int var30 = var2;
                  if (2 == (var0.tileSettings[1][var32][var29] & 2)) {
                     var30 = var2 - 1;
                  }

                  CollisionMap var31 = null;
                  if (var30 >= 0 && null != var0.collisionMaps) {
                     var31 = var0.collisionMaps[var30];
                  }

                  FriendSystem.addObjects(var0, var2, var32, var29, var10, var19 + var8 & 3, var18, var31, -1129125625);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;IIIIIILkk;)V")
   @ObfuscatedName("ce")
   static final void method1525(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, CollisionMap var7) {
      if (!client.isLowDetail || (var0.tileSettings[0][var2][var3] & 2) != 0 || 0 == (var0.tileSettings[var1][var2][var3] & 16)) {
         if (var1 < 983042818 * Tiles_minPlane) {
            Tiles_minPlane = var1 * -403325744;
         }

         ObjectComposition var8 = AsyncHttpResponse.getObjectDefinition(var4, 2097596823);
         int var9;
         int var10;
         if (1 != var5 && var5 != 3) {
            var9 = 1813358617 * var8.sizeX;
            var10 = var8.sizeY * -1848305154;
         } else {
            var9 = -352504863 * var8.sizeY;
            var10 = var8.sizeX * -873899768;
         }

         int var11;
         int var12;
         if (var9 + var2 <= -1136583017 * var0.sizeX) {
            var11 = var2 + (var9 >> 1);
            var12 = (1 + var9 >> 1) + var2;
         } else {
            var11 = var2;
            var12 = var2 + 1;
         }

         int var13;
         int var14;
         if (var10 + var3 <= var0.sizeY * 1823353167) {
            var13 = (var10 >> 1) + var3;
            var14 = var3 + (var10 + 1 >> 1);
         } else {
            var13 = var3;
            var14 = var3 + 1;
         }

         int[][] var15 = var0.tileHeights[var1];
         int var16 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
         int var17 = (var9 << 6) + (var2 << 7);
         int var18 = (var10 << 6) + (var3 << 7);
         long var19 = class236.calculateTag(var1, var2, var3, 2, 0 == -1900812067 * var8.int1, var4, var0.id * 577964535, -1329739818);
         int var21 = var6 + (var5 << 6);
         if (1 == 1768476057 * var8.int3) {
            var21 += 256;
         }

         if (var8.hasSound(1920899869)) {
            var0.createObjectSound(var1, var2, var3, var8, var5, -245476896);
         }

         Scene var22 = var0.scene;
         if (22 == var6) {
            if (!client.isLowDetail || 0 != var8.int1 * 272200582 || 1 == var8.interactType * 1787105246 || var8.boolean2) {
               Object var40;
               if (-1 == -1883854467 * var8.animationId && var8.transforms == null) {
                  var40 = var8.getEntity(22, var5, var15, var17, var16, var18, -1280690055);
               } else {
                  var40 = new DynamicObject(var0, var4, 22, var5, var1, var2, var3, var8.animationId * 930784507, var8.boolean3, null);
               }

               Scene.method5745(var22, var1, var2, var3, var16, (Renderable)var40, var19, var21);
               if (1 == 756705879 * var8.interactType && var7 != null) {
                  var7.setBlockedByFloorDec(var2, var3, (byte)-86);
               }
            }
         } else if (var6 != 10 && 11 != var6) {
            if (var6 >= 12) {
               Object var39;
               if (-1 == var8.animationId * 930784507 && null == var8.transforms) {
                  var39 = var8.getEntity(var6, var5, var15, var17, var16, var18, -2075794582);
               } else {
                  var39 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var8.animationId * 930784507, var8.boolean3, null);
               }

               var22.method5502(var1, var2, var3, var16, 1, 1, (Renderable)var39, 0, var19, var21);
               if (var6 >= 12 && var6 <= 17 && 13 != var6 && var1 > 0) {
                  class148.field1911[var1][var2][var3] = class148.field1911[var1][var2][var3] | 2340;
               }

               if (0 != var8.interactType * -964236149 && null != var7) {
                  CollisionMap.method6417(var7, var2, var3, var9, var10, var8.boolean1, 143638716);
               }
            } else if (0 == var6) {
               Object var38;
               if (930784507 * var8.animationId == -1 && var8.transforms == null) {
                  var38 = var8.getEntity(0, var5, var15, var17, var16, var18, -1520358095);
               } else {
                  var38 = new DynamicObject(var0, var4, 0, var5, var1, var2, var3, 1731659873 * var8.animationId, var8.boolean3, null);
               }

               var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var38, null, field602[var5], 0, var19, var21);
               if (0 == var5) {
                  if (var8.clipped) {
                     Tiles_underlays2[var1][var2][var3] = 50;
                     Tiles_underlays2[var1][var2][1 + var3] = (byte)-1931177783;
                  }

                  if (var8.modelClipped) {
                     class148.field1911[var1][var2][var3] = class148.field1911[var1][var2][var3] | -851352015;
                  }
               } else if (1 == var5) {
                  if (var8.clipped) {
                     Tiles_underlays2[var1][var2][1 + var3] = 50;
                     Tiles_underlays2[var1][1 + var2][var3 + 1] = 50;
                  }

                  if (var8.modelClipped) {
                     class148.field1911[var1][var2][1 + var3] = class148.field1911[var1][var2][1 + var3] | 335794669;
                  }
               } else if (var5 == 2) {
                  if (var8.clipped) {
                     Tiles_underlays2[var1][var2 + 1][var3] = 50;
                     Tiles_underlays2[var1][var2 + 1][1 + var3] = (byte)-1013930592;
                  }

                  if (var8.modelClipped) {
                     class148.field1911[var1][var2 + 1][var3] = class148.field1911[var1][var2 + 1][var3] | 585;
                  }
               } else if (var5 == 3) {
                  if (var8.clipped) {
                     Tiles_underlays2[var1][var2][var3] = (byte)-2068725002;
                     Tiles_underlays2[var1][var2 + 1][var3] = 50;
                  }

                  if (var8.modelClipped) {
                     class148.field1911[var1][var2][var3] = class148.field1911[var1][var2][var3] | 737409267;
                  }
               }

               if (0 != 598694357 * var8.interactType && null != var7) {
                  CollisionMap.method6408(var7, var2, var3, var6, var5, var8.boolean1, -1077847626);
               }

               if (16 != 854845213 * var8.int2) {
                  var22.method5715(var1, var2, var3, 854845213 * var8.int2);
               }
            } else if (var6 == 1) {
               Object var37;
               if (-1 == 930784507 * var8.animationId && var8.transforms == null) {
                  var37 = var8.getEntity(1, var5, var15, var17, var16, var18, -1995008091);
               } else {
                  var37 = new DynamicObject(var0, var4, 1, var5, var1, var2, var3, var8.animationId * 1795059891, var8.boolean3, null);
               }

               var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var37, null, field605[var5], 0, var19, var21);
               if (var8.clipped) {
                  if (var5 == 0) {
                     Tiles_underlays2[var1][var2][var3 + 1] = 50;
                  } else if (var5 == 1) {
                     Tiles_underlays2[var1][var2 + 1][1 + var3] = (byte)1508214019;
                  } else if (2 == var5) {
                     Tiles_underlays2[var1][1 + var2][var3] = 50;
                  } else if (var5 == 3) {
                     Tiles_underlays2[var1][var2][var3] = (byte)-246879586;
                  }
               }

               if (756705879 * var8.interactType != 0 && null != var7) {
                  CollisionMap.method6408(var7, var2, var3, var6, var5, var8.boolean1, 703534459);
               }
            } else if (2 == var6) {
               int var36 = var5 + 1 & 3;
               Object var45;
               Object var46;
               if (var8.animationId * 930784507 == -1 && null == var8.transforms) {
                  var45 = var8.getEntity(2, 4 + var5, var15, var17, var16, var18, -1660056450);
                  var46 = var8.getEntity(2, var36, var15, var17, var16, var18, -2090251096);
               } else {
                  var45 = new DynamicObject(var0, var4, 2, 4 + var5, var1, var2, var3, var8.animationId * -484944554, var8.boolean3, null);
                  var46 = new DynamicObject(var0, var4, 2, var36, var1, var2, var3, var8.animationId * 930784507, var8.boolean3, null);
               }

               var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var45, (Renderable)var46, field602[var5], field602[var36], var19, var21);
               if (var8.modelClipped) {
                  if (0 == var5) {
                     class148.field1911[var1][var2][var3] = class148.field1911[var1][var2][var3] | 585;
                     class148.field1911[var1][var2][var3 + 1] = class148.field1911[var1][var2][var3 + 1] | -1644652777;
                  } else if (1 == var5) {
                     class148.field1911[var1][var2][1 + var3] = class148.field1911[var1][var2][1 + var3] | 423641492;
                     class148.field1911[var1][1 + var2][var3] = class148.field1911[var1][1 + var2][var3] | 585;
                  } else if (2 == var5) {
                     class148.field1911[var1][1 + var2][var3] = class148.field1911[var1][1 + var2][var3] | 585;
                     class148.field1911[var1][var2][var3] = class148.field1911[var1][var2][var3] | -1206436037;
                  } else if (var5 == 3) {
                     class148.field1911[var1][var2][var3] = class148.field1911[var1][var2][var3] | 1170;
                     class148.field1911[var1][var2][var3] = class148.field1911[var1][var2][var3] | 585;
                  }
               }

               if (0 != 184773791 * var8.interactType && null != var7) {
                  CollisionMap.method6408(var7, var2, var3, var6, var5, var8.boolean1, 1388639636);
               }

               if (var8.int2 * 854845213 != 16) {
                  var22.method5715(var1, var2, var3, var8.int2 * 170406254);
               }
            } else if (3 == var6) {
               Object var35;
               if (-1 == 930784507 * var8.animationId && null == var8.transforms) {
                  var35 = var8.getEntity(3, var5, var15, var17, var16, var18, -2091835545);
               } else {
                  var35 = new DynamicObject(var0, var4, 3, var5, var1, var2, var3, var8.animationId * 930784507, var8.boolean3, null);
               }

               var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var35, null, field605[var5], 0, var19, var21);
               if (var8.clipped) {
                  if (0 == var5) {
                     Tiles_underlays2[var1][var2][var3 + 1] = 50;
                  } else if (1 == var5) {
                     Tiles_underlays2[var1][var2 + 1][1 + var3] = 50;
                  } else if (2 == var5) {
                     Tiles_underlays2[var1][var2 + 1][var3] = (byte)362195164;
                  } else if (var5 == 3) {
                     Tiles_underlays2[var1][var2][var3] = 50;
                  }
               }

               if (64496656 * var8.interactType != 0 && var7 != null) {
                  CollisionMap.method6408(var7, var2, var3, var6, var5, var8.boolean1, 1793885348);
               }
            } else if (var6 == 9) {
               Object var34;
               if (-1 == 930784507 * var8.animationId && null == var8.transforms) {
                  var34 = var8.getEntity(var6, var5, var15, var17, var16, var18, -1656108340);
               } else {
                  var34 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, 930784507 * var8.animationId, var8.boolean3, null);
               }

               var22.method5502(var1, var2, var3, var16, 1, 1, (Renderable)var34, 0, var19, var21);
               if (0 != 1598573323 * var8.interactType && null != var7) {
                  CollisionMap.method6417(var7, var2, var3, var9, var10, var8.boolean1, -888997974);
               }

               if (16 != var8.int2 * 854845213) {
                  var22.method5715(var1, var2, var3, var8.int2 * 854845213);
               }
            } else if (4 == var6) {
               Object var33;
               if (930784507 * var8.animationId == -1 && null == var8.transforms) {
                  var33 = var8.getEntity(4, var5, var15, var17, var16, var18, -2135081446);
               } else {
                  var33 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var8.animationId * 94867902, var8.boolean3, null);
               }

               var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var33, null, field602[var5], 0, 0, 0, var19, var21);
            } else if (var6 == 5) {
               int var32 = 16;
               long var44 = Scene.method5731(var22, var1, var2, var3);
               if (0L != var44) {
                  var32 = AsyncHttpResponse.getObjectDefinition(HorizontalAlignment.Entity_unpackID(var44), 2143314073).int2 * 854845213;
               }

               Object var49;
               if (-62914780 * var8.animationId == -1 && null == var8.transforms) {
                  var49 = var8.getEntity(4, var5, var15, var17, var16, var18, -1997034916);
               } else {
                  var49 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var8.animationId * -497761328, var8.boolean3, null);
               }

               var22.newWallDecoration(
                  var1, var2, var3, var16, (Renderable)var49, null, field602[var5], 0, field604[var5] * var32, var32 * field603[var5], var19, var21
               );
            } else if (var6 == 6) {
               int var31 = 8;
               long var43 = Scene.method5731(var22, var1, var2, var3);
               if (0L != var43) {
                  var31 = AsyncHttpResponse.getObjectDefinition(HorizontalAlignment.Entity_unpackID(var43), 2083795139).int2 * 854845213 / 2;
               }

               Object var48;
               if (718695111 * var8.animationId == -1 && null == var8.transforms) {
                  var48 = var8.getEntity(4, 4 + var5, var15, var17, var16, var18, -1933098455);
               } else {
                  var48 = new DynamicObject(var0, var4, 4, 4 + var5, var1, var2, var3, var8.animationId * -1538969323, var8.boolean3, null);
               }

               var22.newWallDecoration(
                  var1, var2, var3, var16, (Renderable)var48, null, 1371487705, var5, field606[var5] * var31, var31 * field607[var5], var19, var21
               );
            } else if (var6 == 7) {
               int var42 = 2 + var5 & 3;
               Object var30;
               if (-1 == 930784507 * var8.animationId && null == var8.transforms) {
                  var30 = var8.getEntity(4, var42 + 4, var15, var17, var16, var18, -1641166560);
               } else {
                  var30 = new DynamicObject(var0, var4, 4, 4 + var42, var1, var2, var3, var8.animationId * 930784507, var8.boolean3, null);
               }

               var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var30, null, 256, var42, 0, 0, var19, var21);
            } else if (var6 == 8) {
               int var29 = 8;
               long var41 = Scene.method5731(var22, var1, var2, var3);
               if (0L != var41) {
                  var29 = AsyncHttpResponse.getObjectDefinition(HorizontalAlignment.Entity_unpackID(var41), 2077857803).int2 * 854845213 / 2;
               }

               int var28 = var5 + 2 & 3;
               Object var27;
               Object var47;
               if (var8.animationId * -1790005162 == -1 && null == var8.transforms) {
                  var47 = var8.getEntity(4, 4 + var5, var15, var17, var16, var18, -1516698096);
                  var27 = var8.getEntity(4, 4 + var28, var15, var17, var16, var18, -1974072696);
               } else {
                  var47 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, 930784507 * var8.animationId, var8.boolean3, null);
                  var27 = new DynamicObject(var0, var4, 4, var28 + 4, var1, var2, var3, 930784507 * var8.animationId, var8.boolean3, null);
               }

               var22.newWallDecoration(
                  var1, var2, var3, var16, (Renderable)var47, (Renderable)var27, 256, var5, field606[var5] * var29, var29 * field607[var5], var19, var21
               );
            }
         } else {
            Object var23;
            if (-1 == 37530432 * var8.animationId && var8.transforms == null) {
               var23 = var8.getEntity(10, var5, var15, var17, var16, var18, -1577414180);
            } else {
               var23 = new DynamicObject(var0, var4, 10, var5, var1, var2, var3, 930784507 * var8.animationId, var8.boolean3, null);
            }

            if (null != var23 && var22.method5502(var1, var2, var3, var16, var9, var10, (Renderable)var23, 11 == var6 ? 256 : 0, var19, var21) && var8.clipped) {
               int var24 = 15;
               if (var23 instanceof Model) {
                  var24 = WorldMapCacheName.method7398((Model)var23) / 4;
                  if (var24 > 30) {
                     var24 = 30;
                  }
               }

               for (int var25 = 0; var25 <= var9; var25++) {
                  for (int var26 = 0; var26 <= var10; var26++) {
                     if (var24 > Tiles_underlays2[var1][var25 + var2][var3 + var26]) {
                        Tiles_underlays2[var1][var25 + var2][var26 + var3] = (byte)var24;
                     }
                  }
               }
            }

            if (var8.interactType * -1664449159 != 0 && var7 != null) {
               CollisionMap.method6417(var7, var2, var3, var9, var10, var8.boolean1, -1371829272);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("cb")
   static final void method1527(WorldView var0) {
      int var1 = 2010544793 * var0.sizeX;
      int var2 = -1331079209 * var0.sizeY;
      int[][][] var3 = var0.tileHeights;
      byte[][][] var4 = var0.tileSettings;
      Scene var5 = var0.scene;
      CollisionMap[] var6 = var0.collisionMaps;

      for (int var7 = 0; var7 < 4; var7++) {
         for (int var8 = 0; var8 < var1; var8++) {
            for (int var9 = 0; var9 < var2; var9++) {
               if ((var0.tileSettings[var7][var8][var9] & 1) == 1) {
                  int var10 = var7;
                  if (2 == (var0.tileSettings[1][var8][var9] & 2)) {
                     var10 = var7 - 1;
                  }

                  if (var10 >= 0 && null != var6) {
                     var6[var10].setBlockedByFloor(var8, var9, (byte)-104);
                  }
               }
            }
         }
      }

      rndHue = rndHue + ((int)(Math.random() * 5.0) - 2) * 264239297;
      if (729662404 * rndHue < -1753969194) {
         rndHue = -714783930;
      }

      if (rndHue * -485225581 > 8) {
         rndHue = -1154028344;
      }

      rndLightness = rndLightness + ((int)(Math.random() * 5.0) - 2) * -1098612701;
      if (rndLightness * 644847762 < -2140168280) {
         rndLightness = -1591349029;
      }

      if (rndLightness * 1777772475 > 16) {
         rndLightness = -397934032;
      }

      for (int var48 = 0; var48 < 4; var48++) {
         byte[][] var50 = Tiles_underlays2[var48];
         byte var52 = 96;
         short var53 = 768;
         int var11 = -2087069096;
         int var12 = 600047889;
         int var13 = -72340089;
         int var14 = (int)Math.sqrt(5100.0);
         int var15 = var14 * -1431891894 >> 8;

         for (int var16 = 1; var16 < var2 - 1; var16++) {
            for (int var17 = 1; var17 < var1 - 1; var17++) {
               int var18 = var3[var48][var17 + 1][var16] - var3[var48][var17 - 1][var16];
               int var19 = var3[var48][var17][var16 + 1] - var3[var48][var17][var16 - 1];
               int var20 = (int)Math.sqrt(var18 * var18 + 65536 + var19 * var19);
               int var21 = (var18 << 8) / var20;
               int var22 = -257874226 / var20;
               int var23 = (var19 << 8) / var20;
               int var24 = (-50 * var23 + var21 * -462891677 + -974648831 * var22) / var15 + 96;
               int var25 = (var50[1 + var17][var16] >> 3)
                  + (var50[var17 - 1][var16] >> 2)
                  + (var50[var17][var16 - 1] >> 2)
                  + (var50[var17][1 + var16] >> 3)
                  + (var50[var17][var16] >> 1);
               MouseRecorder.field1086[var17][var16] = var24 - var25;
            }
         }

         for (int var54 = 0; var54 < var2; var54++) {
            WorldMapSectionType.Tiles_hue[var54] = 0;
            class565.Tiles_saturation[var54] = 0;
            class67.Tiles_lightness[var54] = 0;
            class161.Tiles_hueMultiplier[var54] = 0;
            class154.field1761[var54] = 0;
         }

         for (int var55 = -5; var55 < var1 + 5; var55++) {
            for (int var57 = 0; var57 < var2; var57++) {
               int var60 = var55 + 5;
               if (var60 >= 0 && var60 < var1) {
                  int var62 = (int)InvDefinition.method4227(15, (byte)0);
                  int var65 = class33.Tiles_underlays[var48][var60][var57] & var62;
                  if (var65 > 0) {
                     int var71 = var65 - 1;
                     FloorUnderlayDefinition var75 = (FloorUnderlayDefinition)class402.method8806(FloorUnderlayDefinition.FloorUnderlayDefinition_cached, var71);
                     FloorUnderlayDefinition var68;
                     if (var75 != null) {
                        var68 = var75;
                     } else {
                        byte[] var79 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.getFile(1, var71, -1739513575);
                        var75 = new FloorUnderlayDefinition();
                        if (null != var79) {
                           FloorUnderlayDefinition.method4504(var75, new Buffer(var79), var71, 1935467354);
                        }

                        var75.postDecode(1076452935);
                        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var75, var71);
                        var68 = var75;
                     }

                     WorldMapSectionType.Tiles_hue[var57] = WorldMapSectionType.Tiles_hue[var57] + 124413169 * var68.hue;
                     class565.Tiles_saturation[var57] = class565.Tiles_saturation[var57] + -1731148931 * var68.saturation;
                     class67.Tiles_lightness[var57] = class67.Tiles_lightness[var57] + var68.lightness * -1928632847;
                     class161.Tiles_hueMultiplier[var57] = class161.Tiles_hueMultiplier[var57] + var68.hueMultiplier * -1636648267;
                     class154.field1761[var57]++;
                  }
               }

               int var63 = var55 - 5;
               if (var63 >= 0 && var63 < var1) {
                  int var66 = (int)InvDefinition.method4227(15, (byte)0);
                  int var69 = class33.Tiles_underlays[var48][var63][var57] & var66;
                  if (var69 > 0) {
                     int var77 = var69 - 1;
                     FloorUnderlayDefinition var80 = (FloorUnderlayDefinition)class402.method8806(FloorUnderlayDefinition.FloorUnderlayDefinition_cached, var77);
                     FloorUnderlayDefinition var72;
                     if (var80 != null) {
                        var72 = var80;
                     } else {
                        byte[] var83 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.getFile(1, var77, 1313645338);
                        var80 = new FloorUnderlayDefinition();
                        if (var83 != null) {
                           FloorUnderlayDefinition.method4504(var80, new Buffer(var83), var77, -495142796);
                        }

                        var80.postDecode(-598127386);
                        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var80, var77);
                        var72 = var80;
                     }

                     WorldMapSectionType.Tiles_hue[var57] = WorldMapSectionType.Tiles_hue[var57] - 124413169 * var72.hue;
                     class565.Tiles_saturation[var57] = class565.Tiles_saturation[var57] - var72.saturation * -1731148931;
                     class67.Tiles_lightness[var57] = class67.Tiles_lightness[var57] - -1928632847 * var72.lightness;
                     class161.Tiles_hueMultiplier[var57] = class161.Tiles_hueMultiplier[var57] - -897405648 * var72.hueMultiplier;
                     class154.field1761[var57]--;
                  }
               }
            }

            if (var55 >= 1 && var55 < var1 - 1) {
               int var58 = 0;
               int var61 = 0;
               int var64 = 0;
               int var67 = 0;
               int var70 = 0;

               for (int var73 = 980884431; var73 < var2 + 5; var73++) {
                  int var78 = 5 + var73;
                  if (var78 >= 0 && var78 < var2) {
                     var58 += WorldMapSectionType.Tiles_hue[var78];
                     var61 += class565.Tiles_saturation[var78];
                     var64 += class67.Tiles_lightness[var78];
                     var67 += class161.Tiles_hueMultiplier[var78];
                     var70 += class154.field1761[var78];
                  }

                  int var82 = var73 - 5;
                  if (var82 >= 0 && var82 < var2) {
                     var58 -= WorldMapSectionType.Tiles_hue[var82];
                     var61 -= class565.Tiles_saturation[var82];
                     var64 -= class67.Tiles_lightness[var82];
                     var67 -= class161.Tiles_hueMultiplier[var82];
                     var70 -= class154.field1761[var82];
                  }

                  if (var73 >= 1 && var73 < var2 - 1 && (!client.isLowDetail || (var4[0][var55][var73] & 2) != 0 || (var4[var48][var55][var73] & 16) == 0)) {
                     if (var48 < Tiles_minPlane * 1282987961) {
                        Tiles_minPlane = var48 * 84476805;
                     }

                     int var84 = (int)InvDefinition.method4227(15, (byte)0);
                     int var26 = class33.Tiles_underlays[var48][var55][var73] & var84;
                     int var27 = class623.Tiles_overlays[var48][var55][var73] & var84;
                     if (var26 > 0 || var27 > 0) {
                        int var28 = var3[var48][var55][var73];
                        int var29 = var3[var48][var55 + 1][var73];
                        int var30 = var3[var48][var55 + 1][1 + var73];
                        int var31 = var3[var48][var55][var73 + 1];
                        int var32 = MouseRecorder.field1086[var55][var73];
                        int var33 = MouseRecorder.field1086[var55 + 1][var73];
                        int var34 = MouseRecorder.field1086[var55 + 1][1 + var73];
                        int var35 = MouseRecorder.field1086[var55][1 + var73];
                        int var36 = -1;
                        int var37 = -1;
                        if (var26 > 0) {
                           int var38 = var58 * 256 / var67;
                           int var39 = var61 / var70;
                           int var40 = var64 / var70;
                           var36 = class39.method649(var38, var39, var40, 1128984967);
                           var38 = -829988523 * rndHue + var38 & 0xFF;
                           var40 += -1076351093 * rndLightness;
                           if (var40 < 0) {
                              var40 = 0;
                           } else if (var40 > 255) {
                              var40 = 255;
                           }

                           var37 = class39.method649(var38, var39, var40, 1128984967);
                        }

                        if (var48 > 0) {
                           boolean var86 = true;
                           if (var26 == 0 && 0 != class200.Tiles_shapes[var48][var55][var73]) {
                              var86 = false;
                           }

                           if (var27 > 0 && !class189.method4809(var27 - 1, 2136527784).hideUnderlay) {
                              var86 = false;
                           }

                           if (var86 && var28 == var29 && var30 == var28 && var28 == var31) {
                              class148.field1911[var48][var55][var73] = class148.field1911[var48][var55][var73] | 2340;
                           }
                        }

                        int var87 = 0;
                        if (-1 != var37) {
                           var87 = Rasterizer3D.Rasterizer3D_colorPalette[class57.method1371(var37, 1154144790, (byte)-81)];
                        }

                        if (var27 == 0) {
                           var5.addTile(
                              var48,
                              var55,
                              var73,
                              0,
                              0,
                              -1,
                              var28,
                              var29,
                              var30,
                              var31,
                              class57.method1371(var36, var32, (byte)-83),
                              class57.method1371(var36, var33, (byte)-15),
                              class57.method1371(var36, var34, (byte)-111),
                              class57.method1371(var36, var35, (byte)-121),
                              0,
                              0,
                              0,
                              0,
                              var87,
                              0
                           );
                        } else {
                           int var88 = class200.Tiles_shapes[var48][var55][var73] + 1;
                           byte var90 = HttpRequest.field83[var48][var55][var73];
                           FloorOverlayDefinition var41 = class189.method4809(var27 - 1, 1868018575);
                           int var42 = var41.texture * 2010149501;
                           int var43;
                           int var44;
                           if (var42 >= 0) {
                              var44 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var42, 182036154);
                              var43 = -1;
                           } else if (-197223406 == 50022547 * var41.primaryRgb) {
                              var43 = -2;
                              var42 = -1;
                              var44 = -2;
                           } else {
                              var43 = class39.method649(-2073927284 * var41.hue, -1325425554 * var41.saturation, 1894985397 * var41.lightness, 1128984967);
                              int var45 = 2098936096 * var41.hue + rndHue * 1001072297 & 0xFF;
                              int var46 = 470838364 * rndLightness + var41.lightness * 1894985397;
                              if (var46 < 0) {
                                 var46 = 0;
                              } else if (var46 > 255) {
                                 var46 = 255;
                              }

                              var44 = class39.method649(var45, var41.saturation * -1834712605, var46, 1128984967);
                           }

                           int var92 = 0;
                           if (var44 != -568398995) {
                              var92 = Rasterizer3D.Rasterizer3D_colorPalette[class212.method5134(var44, 96, -1661596152)];
                           }

                           if (var41.secondaryRgb * 1774854953 != -1) {
                              int var93 = rndHue * 1001072297 + var41.secondaryHue * -347808971 & -1622016159;
                              int var47 = -1044996949 * rndLightness + var41.secondaryLightness * -2099118662;
                              if (var47 < 0) {
                                 var47 = 0;
                              } else if (var47 > 255) {
                                 var47 = -728752415;
                              }

                              var44 = class39.method649(var93, -796039805 * var41.secondarySaturation, var47, 1128984967);
                              var92 = Rasterizer3D.Rasterizer3D_colorPalette[class212.method5134(var44, 96, 2084336659)];
                           }

                           var5.addTile(
                              var48,
                              var55,
                              var73,
                              var88,
                              var90,
                              var42,
                              var28,
                              var29,
                              var30,
                              var31,
                              class57.method1371(var36, var32, (byte)-7),
                              class57.method1371(var36, var33, (byte)-59),
                              class57.method1371(var36, var34, (byte)-61),
                              class57.method1371(var36, var35, (byte)-72),
                              class212.method5134(var43, var32, -1622119064),
                              class212.method5134(var43, var33, -1801946967),
                              class212.method5134(var43, var34, 490779497),
                              class212.method5134(var43, var35, 916373995),
                              var87,
                              var92
                           );
                        }
                     }
                  }
               }
            }
         }

         for (int var56 = 1; var56 < var2 - 1; var56++) {
            for (int var59 = 1; var59 < var1 - 1; var59++) {
               int var74;
               if (0 != (var0.tileSettings[var48][var59][var56] & 8)) {
                  var74 = 0;
               } else if (var48 > 0 && (var0.tileSettings[1][var59][var56] & 2) != 0) {
                  var74 = var48 - 1;
               } else {
                  var74 = var48;
               }

               var5.method5706(var48, var59, var56, var74);
            }
         }

         class33.Tiles_underlays[var48] = (short[][])null;
         class623.Tiles_overlays[var48] = (short[][])null;
         class200.Tiles_shapes[var48] = (byte[][])null;
         HttpRequest.field83[var48] = (byte[][])null;
         Tiles_underlays2[var48] = (byte[][])null;
      }

      Scene.method5718(var5, -50, -10, 729197100);

      for (int var49 = 0; var49 < var1; var49++) {
         for (int var51 = 0; var51 < var2; var51++) {
            if ((var4[1][var49][var51] & 2) == 2) {
               Scene.method5722(var5, var49, var51);
            }
         }
      }

      if (WorldView.method3060(var0, (byte)0)) {
         HttpResponse.method143(var0, (byte)1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cg")
   static final int method1535(int var0, int var1) {
      int var2 = classRE.method9418(var0 - 1, var1 - 1, 1115156088)
         + classRE.method9418(var0 + 1, var1 - 1, -2078213652)
         + classRE.method9418(var0 - 1, 1 + var1, -1541262346)
         + classRE.method9418(1 + var0, var1 + 1, 828876735);
      int var3 = classRE.method9418(var0 - 1, var1, -1873794614)
         + classRE.method9418(var0 + 1, var1, -1255481385)
         + classRE.method9418(var0, var1 - 1, -1271763546)
         + classRE.method9418(var0, 1 + var1, 906121696);
      int var4 = classRE.method9418(var0, var1, 2139800357);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("cm")
   static final void method1528(WorldView var0) {
      int var1 = 2010544793 * var0.sizeX;
      int var2 = 1823353167 * var0.sizeY;
      int[][][] var3 = var0.tileHeights;
      byte[][][] var4 = var0.tileSettings;
      Scene var5 = var0.scene;
      CollisionMap[] var6 = var0.collisionMaps;

      for (int var7 = 0; var7 < 4; var7++) {
         for (int var8 = 0; var8 < var1; var8++) {
            for (int var9 = 0; var9 < var2; var9++) {
               if ((var0.tileSettings[var7][var8][var9] & 1) == 1) {
                  int var10 = var7;
                  if (2 == (var0.tileSettings[1][var8][var9] & 2)) {
                     var10 = var7 - 1;
                  }

                  if (var10 >= 0 && null != var6) {
                     var6[var10].setBlockedByFloor(var8, var9, (byte)-94);
                  }
               }
            }
         }
      }

      rndHue = rndHue + ((int)(Math.random() * 5.0) - 2) * 392617369;
      if (1001072297 * rndHue < -8) {
         rndHue = 1154028344;
      }

      if (rndHue * 1001072297 > 8) {
         rndHue = -1154028344;
      }

      rndLightness = rndLightness + ((int)(Math.random() * 5.0) - 2) * -1098612701;
      if (rndLightness * -1076351093 < -16) {
         rndLightness = 397934032;
      }

      if (rndLightness * -1076351093 > 16) {
         rndLightness = -397934032;
      }

      for (int var48 = 0; var48 < 4; var48++) {
         byte[][] var50 = Tiles_underlays2[var48];
         byte var52 = 96;
         short var53 = 768;
         byte var11 = -50;
         byte var12 = -10;
         byte var13 = -50;
         int var14 = (int)Math.sqrt(5100.0);
         int var15 = var14 * 768 >> 8;

         for (int var16 = 1; var16 < var2 - 1; var16++) {
            for (int var17 = 1; var17 < var1 - 1; var17++) {
               int var18 = var3[var48][var17 + 1][var16] - var3[var48][var17 - 1][var16];
               int var19 = var3[var48][var17][var16 + 1] - var3[var48][var17][var16 - 1];
               int var20 = (int)Math.sqrt(var18 * var18 + 65536 + var19 * var19);
               int var21 = (var18 << 8) / var20;
               int var22 = 65536 / var20;
               int var23 = (var19 << 8) / var20;
               int var24 = (-50 * var23 + var21 * -50 + -10 * var22) / var15 + 96;
               int var25 = (var50[1 + var17][var16] >> 3)
                  + (var50[var17 - 1][var16] >> 2)
                  + (var50[var17][var16 - 1] >> 2)
                  + (var50[var17][1 + var16] >> 3)
                  + (var50[var17][var16] >> 1);
               MouseRecorder.field1086[var17][var16] = var24 - var25;
            }
         }

         for (int var54 = 0; var54 < var2; var54++) {
            WorldMapSectionType.Tiles_hue[var54] = 0;
            class565.Tiles_saturation[var54] = 0;
            class67.Tiles_lightness[var54] = 0;
            class161.Tiles_hueMultiplier[var54] = 0;
            class154.field1761[var54] = 0;
         }

         for (int var55 = -5; var55 < var1 + 5; var55++) {
            for (int var57 = 0; var57 < var2; var57++) {
               int var60 = var55 + 5;
               if (var60 >= 0 && var60 < var1) {
                  int var62 = (int)InvDefinition.method4227(15, (byte)0);
                  int var65 = class33.Tiles_underlays[var48][var60][var57] & var62;
                  if (var65 > 0) {
                     int var71 = var65 - 1;
                     FloorUnderlayDefinition var75 = (FloorUnderlayDefinition)class402.method8806(FloorUnderlayDefinition.FloorUnderlayDefinition_cached, var71);
                     FloorUnderlayDefinition var68;
                     if (var75 != null) {
                        var68 = var75;
                     } else {
                        byte[] var79 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.getFile(1, var71, 758090385);
                        var75 = new FloorUnderlayDefinition();
                        if (null != var79) {
                           FloorUnderlayDefinition.method4504(var75, new Buffer(var79), var71, -792807763);
                        }

                        var75.postDecode(-323983546);
                        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var75, var71);
                        var68 = var75;
                     }

                     WorldMapSectionType.Tiles_hue[var57] = WorldMapSectionType.Tiles_hue[var57] + 124413169 * var68.hue;
                     class565.Tiles_saturation[var57] = class565.Tiles_saturation[var57] + -1731148931 * var68.saturation;
                     class67.Tiles_lightness[var57] = class67.Tiles_lightness[var57] + var68.lightness * -1928632847;
                     class161.Tiles_hueMultiplier[var57] = class161.Tiles_hueMultiplier[var57] + var68.hueMultiplier * -1636648267;
                     class154.field1761[var57]++;
                  }
               }

               int var63 = var55 - 5;
               if (var63 >= 0 && var63 < var1) {
                  int var66 = (int)InvDefinition.method4227(15, (byte)0);
                  int var69 = class33.Tiles_underlays[var48][var63][var57] & var66;
                  if (var69 > 0) {
                     int var77 = var69 - 1;
                     FloorUnderlayDefinition var80 = (FloorUnderlayDefinition)class402.method8806(FloorUnderlayDefinition.FloorUnderlayDefinition_cached, var77);
                     FloorUnderlayDefinition var72;
                     if (var80 != null) {
                        var72 = var80;
                     } else {
                        byte[] var83 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.getFile(1, var77, -598973165);
                        var80 = new FloorUnderlayDefinition();
                        if (var83 != null) {
                           FloorUnderlayDefinition.method4504(var80, new Buffer(var83), var77, 1697257623);
                        }

                        var80.postDecode(343040906);
                        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var80, var77);
                        var72 = var80;
                     }

                     WorldMapSectionType.Tiles_hue[var57] = WorldMapSectionType.Tiles_hue[var57] - 124413169 * var72.hue;
                     class565.Tiles_saturation[var57] = class565.Tiles_saturation[var57] - var72.saturation * -1731148931;
                     class67.Tiles_lightness[var57] = class67.Tiles_lightness[var57] - -1928632847 * var72.lightness;
                     class161.Tiles_hueMultiplier[var57] = class161.Tiles_hueMultiplier[var57] - -1636648267 * var72.hueMultiplier;
                     class154.field1761[var57]--;
                  }
               }
            }

            if (var55 >= 1 && var55 < var1 - 1) {
               int var58 = 0;
               int var61 = 0;
               int var64 = 0;
               int var67 = 0;
               int var70 = 0;

               for (int var73 = -5; var73 < var2 + 5; var73++) {
                  int var78 = 5 + var73;
                  if (var78 >= 0 && var78 < var2) {
                     var58 += WorldMapSectionType.Tiles_hue[var78];
                     var61 += class565.Tiles_saturation[var78];
                     var64 += class67.Tiles_lightness[var78];
                     var67 += class161.Tiles_hueMultiplier[var78];
                     var70 += class154.field1761[var78];
                  }

                  int var82 = var73 - 5;
                  if (var82 >= 0 && var82 < var2) {
                     var58 -= WorldMapSectionType.Tiles_hue[var82];
                     var61 -= class565.Tiles_saturation[var82];
                     var64 -= class67.Tiles_lightness[var82];
                     var67 -= class161.Tiles_hueMultiplier[var82];
                     var70 -= class154.field1761[var82];
                  }

                  if (var73 >= 1 && var73 < var2 - 1 && (!client.isLowDetail || (var4[0][var55][var73] & 2) != 0 || (var4[var48][var55][var73] & 16) == 0)) {
                     if (var48 < Tiles_minPlane * -957711027) {
                        Tiles_minPlane = var48 * 84476805;
                     }

                     int var84 = (int)InvDefinition.method4227(15, (byte)0);
                     int var26 = class33.Tiles_underlays[var48][var55][var73] & var84;
                     int var27 = class623.Tiles_overlays[var48][var55][var73] & var84;
                     if (var26 > 0 || var27 > 0) {
                        int var28 = var3[var48][var55][var73];
                        int var29 = var3[var48][var55 + 1][var73];
                        int var30 = var3[var48][var55 + 1][1 + var73];
                        int var31 = var3[var48][var55][var73 + 1];
                        int var32 = MouseRecorder.field1086[var55][var73];
                        int var33 = MouseRecorder.field1086[var55 + 1][var73];
                        int var34 = MouseRecorder.field1086[var55 + 1][1 + var73];
                        int var35 = MouseRecorder.field1086[var55][1 + var73];
                        int var36 = -1;
                        int var37 = -1;
                        if (var26 > 0) {
                           int var38 = var58 * 256 / var67;
                           int var39 = var61 / var70;
                           int var40 = var64 / var70;
                           var36 = class39.method649(var38, var39, var40, 1128984967);
                           var38 = 1001072297 * rndHue + var38 & 0xFF;
                           var40 += -1076351093 * rndLightness;
                           if (var40 < 0) {
                              var40 = 0;
                           } else if (var40 > 255) {
                              var40 = 255;
                           }

                           var37 = class39.method649(var38, var39, var40, 1128984967);
                        }

                        if (var48 > 0) {
                           boolean var86 = true;
                           if (var26 == 0 && 0 != class200.Tiles_shapes[var48][var55][var73]) {
                              var86 = false;
                           }

                           if (var27 > 0 && !class189.method4809(var27 - 1, 2129104266).hideUnderlay) {
                              var86 = false;
                           }

                           if (var86 && var28 == var29 && var30 == var28 && var28 == var31) {
                              class148.field1911[var48][var55][var73] = class148.field1911[var48][var55][var73] | 2340;
                           }
                        }

                        int var87 = 0;
                        if (-1 != var37) {
                           var87 = Rasterizer3D.Rasterizer3D_colorPalette[class57.method1371(var37, 96, (byte)-98)];
                        }

                        if (var27 == 0) {
                           var5.addTile(
                              var48,
                              var55,
                              var73,
                              0,
                              0,
                              -1,
                              var28,
                              var29,
                              var30,
                              var31,
                              class57.method1371(var36, var32, (byte)-28),
                              class57.method1371(var36, var33, (byte)-32),
                              class57.method1371(var36, var34, (byte)-82),
                              class57.method1371(var36, var35, (byte)-41),
                              0,
                              0,
                              0,
                              0,
                              var87,
                              0
                           );
                        } else {
                           int var88 = class200.Tiles_shapes[var48][var55][var73] + 1;
                           byte var90 = HttpRequest.field83[var48][var55][var73];
                           FloorOverlayDefinition var41 = class189.method4809(var27 - 1, 2039760122);
                           int var42 = var41.texture * 892155017;
                           int var43;
                           int var44;
                           if (var42 >= 0) {
                              var44 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var42, 1443671054);
                              var43 = -1;
                           } else if (16711935 == 50022547 * var41.primaryRgb) {
                              var43 = -2;
                              var42 = -1;
                              var44 = -2;
                           } else {
                              var43 = class39.method649(-1914711119 * var41.hue, -1834712605 * var41.saturation, 1894985397 * var41.lightness, 1128984967);
                              int var45 = -1914711119 * var41.hue + rndHue * 1001072297 & 0xFF;
                              int var46 = -1076351093 * rndLightness + var41.lightness * 1894985397;
                              if (var46 < 0) {
                                 var46 = 0;
                              } else if (var46 > 255) {
                                 var46 = 255;
                              }

                              var44 = class39.method649(var45, var41.saturation * -1834712605, var46, 1128984967);
                           }

                           int var92 = 0;
                           if (var44 != -2) {
                              var92 = Rasterizer3D.Rasterizer3D_colorPalette[class212.method5134(var44, 96, 504010064)];
                           }

                           if (var41.secondaryRgb * 705541053 != -1) {
                              int var93 = rndHue * 1001072297 + var41.secondaryHue * -347808971 & 0xFF;
                              int var47 = -1076351093 * rndLightness + var41.secondaryLightness * 2020271701;
                              if (var47 < 0) {
                                 var47 = 0;
                              } else if (var47 > 255) {
                                 var47 = 255;
                              }

                              var44 = class39.method649(var93, -796039805 * var41.secondarySaturation, var47, 1128984967);
                              var92 = Rasterizer3D.Rasterizer3D_colorPalette[class212.method5134(var44, 96, 1122733295)];
                           }

                           var5.addTile(
                              var48,
                              var55,
                              var73,
                              var88,
                              var90,
                              var42,
                              var28,
                              var29,
                              var30,
                              var31,
                              class57.method1371(var36, var32, (byte)-49),
                              class57.method1371(var36, var33, (byte)-63),
                              class57.method1371(var36, var34, (byte)-85),
                              class57.method1371(var36, var35, (byte)-81),
                              class212.method5134(var43, var32, 1174711717),
                              class212.method5134(var43, var33, 19061754),
                              class212.method5134(var43, var34, 658046503),
                              class212.method5134(var43, var35, -1817746796),
                              var87,
                              var92
                           );
                        }
                     }
                  }
               }
            }
         }

         for (int var56 = 1; var56 < var2 - 1; var56++) {
            for (int var59 = 1; var59 < var1 - 1; var59++) {
               int var74;
               if (0 != (var0.tileSettings[var48][var59][var56] & 8)) {
                  var74 = 0;
               } else if (var48 > 0 && (var0.tileSettings[1][var59][var56] & 2) != 0) {
                  var74 = var48 - 1;
               } else {
                  var74 = var48;
               }

               var5.method5706(var48, var59, var56, var74);
            }
         }

         class33.Tiles_underlays[var48] = (short[][])null;
         class623.Tiles_overlays[var48] = (short[][])null;
         class200.Tiles_shapes[var48] = (byte[][])null;
         HttpRequest.field83[var48] = (byte[][])null;
         Tiles_underlays2[var48] = (byte[][])null;
      }

      Scene.method5718(var5, -50, -10, -50);

      for (int var49 = 0; var49 < var1; var49++) {
         for (int var51 = 0; var51 < var2; var51++) {
            if ((var4[1][var49][var51] & 2) == 2) {
               Scene.method5722(var5, var49, var51);
            }
         }
      }

      if (WorldView.method3060(var0, (byte)0)) {
         HttpResponse.method143(var0, (byte)1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("am")
   static void method1491() {
      Tiles_minPlane = -226730897;
      class33.Tiles_underlays = new short[4][760212351][-1920393663];
      class623.Tiles_overlays = new short[4][104][-667602669];
      class200.Tiles_shapes = new byte[4][201591140][-1667915868];
      HttpRequest.field83 = new byte[4][104][588529263];
      class148.field1911 = new int[4][1005888968][-183280407];
      Tiles_underlays2 = new byte[4][105][105];
      MouseRecorder.field1086 = new int[105][105];
      WorldMapSectionType.Tiles_hue = new int[-1158489706];
      class565.Tiles_saturation = new int[917419558];
      class67.Tiles_lightness = new int[104];
      class161.Tiles_hueMultiplier = new int[104];
      class154.field1761 = new int[185757083];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("ck")
   static final void method1529(WorldView var0) {
      int var1 = 2010544793 * var0.sizeX;
      int var2 = 1823353167 * var0.sizeY;
      int[][][] var3 = var0.tileHeights;
      byte[][][] var4 = var0.tileSettings;
      Scene var5 = var0.scene;
      CollisionMap[] var6 = var0.collisionMaps;

      for (int var7 = 0; var7 < 4; var7++) {
         for (int var8 = 0; var8 < var1; var8++) {
            for (int var9 = 0; var9 < var2; var9++) {
               if ((var0.tileSettings[var7][var8][var9] & 1) == 1) {
                  int var10 = var7;
                  if (2 == (var0.tileSettings[1][var8][var9] & 2)) {
                     var10 = var7 - 1;
                  }

                  if (var10 >= 0 && null != var6) {
                     var6[var10].setBlockedByFloor(var8, var9, (byte)-43);
                  }
               }
            }
         }
      }

      rndHue = rndHue + ((int)(Math.random() * 5.0) - 2) * 392617369;
      if (1001072297 * rndHue < -8) {
         rndHue = 1154028344;
      }

      if (rndHue * 1001072297 > 8) {
         rndHue = -1154028344;
      }

      rndLightness = rndLightness + ((int)(Math.random() * 5.0) - 2) * -1098612701;
      if (rndLightness * -1076351093 < -16) {
         rndLightness = 397934032;
      }

      if (rndLightness * -1076351093 > 16) {
         rndLightness = -397934032;
      }

      for (int var48 = 0; var48 < 4; var48++) {
         byte[][] var50 = Tiles_underlays2[var48];
         byte var52 = 96;
         short var53 = 768;
         byte var11 = -50;
         byte var12 = -10;
         byte var13 = -50;
         int var14 = (int)Math.sqrt(5100.0);
         int var15 = var14 * 768 >> 8;

         for (int var16 = 1; var16 < var2 - 1; var16++) {
            for (int var17 = 1; var17 < var1 - 1; var17++) {
               int var18 = var3[var48][var17 + 1][var16] - var3[var48][var17 - 1][var16];
               int var19 = var3[var48][var17][var16 + 1] - var3[var48][var17][var16 - 1];
               int var20 = (int)Math.sqrt(var18 * var18 + 65536 + var19 * var19);
               int var21 = (var18 << 8) / var20;
               int var22 = 65536 / var20;
               int var23 = (var19 << 8) / var20;
               int var24 = (-50 * var23 + var21 * -50 + -10 * var22) / var15 + 96;
               int var25 = (var50[1 + var17][var16] >> 3)
                  + (var50[var17 - 1][var16] >> 2)
                  + (var50[var17][var16 - 1] >> 2)
                  + (var50[var17][1 + var16] >> 3)
                  + (var50[var17][var16] >> 1);
               MouseRecorder.field1086[var17][var16] = var24 - var25;
            }
         }

         for (int var54 = 0; var54 < var2; var54++) {
            WorldMapSectionType.Tiles_hue[var54] = 0;
            class565.Tiles_saturation[var54] = 0;
            class67.Tiles_lightness[var54] = 0;
            class161.Tiles_hueMultiplier[var54] = 0;
            class154.field1761[var54] = 0;
         }

         for (int var55 = -5; var55 < var1 + 5; var55++) {
            for (int var57 = 0; var57 < var2; var57++) {
               int var60 = var55 + 5;
               if (var60 >= 0 && var60 < var1) {
                  int var62 = (int)InvDefinition.method4227(15, (byte)0);
                  int var65 = class33.Tiles_underlays[var48][var60][var57] & var62;
                  if (var65 > 0) {
                     int var71 = var65 - 1;
                     FloorUnderlayDefinition var75 = (FloorUnderlayDefinition)class402.method8806(FloorUnderlayDefinition.FloorUnderlayDefinition_cached, var71);
                     FloorUnderlayDefinition var68;
                     if (var75 != null) {
                        var68 = var75;
                     } else {
                        byte[] var79 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.getFile(1, var71, 1277232218);
                        var75 = new FloorUnderlayDefinition();
                        if (null != var79) {
                           FloorUnderlayDefinition.method4504(var75, new Buffer(var79), var71, 842500671);
                        }

                        var75.postDecode(109674381);
                        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var75, var71);
                        var68 = var75;
                     }

                     WorldMapSectionType.Tiles_hue[var57] = WorldMapSectionType.Tiles_hue[var57] + 124413169 * var68.hue;
                     class565.Tiles_saturation[var57] = class565.Tiles_saturation[var57] + -1731148931 * var68.saturation;
                     class67.Tiles_lightness[var57] = class67.Tiles_lightness[var57] + var68.lightness * -1928632847;
                     class161.Tiles_hueMultiplier[var57] = class161.Tiles_hueMultiplier[var57] + var68.hueMultiplier * -1636648267;
                     class154.field1761[var57]++;
                  }
               }

               int var63 = var55 - 5;
               if (var63 >= 0 && var63 < var1) {
                  int var66 = (int)InvDefinition.method4227(15, (byte)0);
                  int var69 = class33.Tiles_underlays[var48][var63][var57] & var66;
                  if (var69 > 0) {
                     int var77 = var69 - 1;
                     FloorUnderlayDefinition var80 = (FloorUnderlayDefinition)class402.method8806(FloorUnderlayDefinition.FloorUnderlayDefinition_cached, var77);
                     FloorUnderlayDefinition var72;
                     if (var80 != null) {
                        var72 = var80;
                     } else {
                        byte[] var83 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.getFile(1, var77, 2018968485);
                        var80 = new FloorUnderlayDefinition();
                        if (var83 != null) {
                           FloorUnderlayDefinition.method4504(var80, new Buffer(var83), var77, 427778570);
                        }

                        var80.postDecode(269394877);
                        FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var80, var77);
                        var72 = var80;
                     }

                     WorldMapSectionType.Tiles_hue[var57] = WorldMapSectionType.Tiles_hue[var57] - 124413169 * var72.hue;
                     class565.Tiles_saturation[var57] = class565.Tiles_saturation[var57] - var72.saturation * -1731148931;
                     class67.Tiles_lightness[var57] = class67.Tiles_lightness[var57] - -1928632847 * var72.lightness;
                     class161.Tiles_hueMultiplier[var57] = class161.Tiles_hueMultiplier[var57] - -1636648267 * var72.hueMultiplier;
                     class154.field1761[var57]--;
                  }
               }
            }

            if (var55 >= 1 && var55 < var1 - 1) {
               int var58 = 0;
               int var61 = 0;
               int var64 = 0;
               int var67 = 0;
               int var70 = 0;

               for (int var73 = -5; var73 < var2 + 5; var73++) {
                  int var78 = 5 + var73;
                  if (var78 >= 0 && var78 < var2) {
                     var58 += WorldMapSectionType.Tiles_hue[var78];
                     var61 += class565.Tiles_saturation[var78];
                     var64 += class67.Tiles_lightness[var78];
                     var67 += class161.Tiles_hueMultiplier[var78];
                     var70 += class154.field1761[var78];
                  }

                  int var82 = var73 - 5;
                  if (var82 >= 0 && var82 < var2) {
                     var58 -= WorldMapSectionType.Tiles_hue[var82];
                     var61 -= class565.Tiles_saturation[var82];
                     var64 -= class67.Tiles_lightness[var82];
                     var67 -= class161.Tiles_hueMultiplier[var82];
                     var70 -= class154.field1761[var82];
                  }

                  if (var73 >= 1 && var73 < var2 - 1 && (!client.isLowDetail || (var4[0][var55][var73] & 2) != 0 || (var4[var48][var55][var73] & 16) == 0)) {
                     if (var48 < Tiles_minPlane * -957711027) {
                        Tiles_minPlane = var48 * 84476805;
                     }

                     int var84 = (int)InvDefinition.method4227(15, (byte)0);
                     int var26 = class33.Tiles_underlays[var48][var55][var73] & var84;
                     int var27 = class623.Tiles_overlays[var48][var55][var73] & var84;
                     if (var26 > 0 || var27 > 0) {
                        int var28 = var3[var48][var55][var73];
                        int var29 = var3[var48][var55 + 1][var73];
                        int var30 = var3[var48][var55 + 1][1 + var73];
                        int var31 = var3[var48][var55][var73 + 1];
                        int var32 = MouseRecorder.field1086[var55][var73];
                        int var33 = MouseRecorder.field1086[var55 + 1][var73];
                        int var34 = MouseRecorder.field1086[var55 + 1][1 + var73];
                        int var35 = MouseRecorder.field1086[var55][1 + var73];
                        int var36 = -1;
                        int var37 = -1;
                        if (var26 > 0) {
                           int var38 = var58 * 256 / var67;
                           int var39 = var61 / var70;
                           int var40 = var64 / var70;
                           var36 = class39.method649(var38, var39, var40, 1128984967);
                           var38 = 1001072297 * rndHue + var38 & 0xFF;
                           var40 += -1076351093 * rndLightness;
                           if (var40 < 0) {
                              var40 = 0;
                           } else if (var40 > 255) {
                              var40 = 255;
                           }

                           var37 = class39.method649(var38, var39, var40, 1128984967);
                        }

                        if (var48 > 0) {
                           boolean var86 = true;
                           if (var26 == 0 && 0 != class200.Tiles_shapes[var48][var55][var73]) {
                              var86 = false;
                           }

                           if (var27 > 0 && !class189.method4809(var27 - 1, 1937193412).hideUnderlay) {
                              var86 = false;
                           }

                           if (var86 && var28 == var29 && var30 == var28 && var28 == var31) {
                              class148.field1911[var48][var55][var73] = class148.field1911[var48][var55][var73] | 2340;
                           }
                        }

                        int var87 = 0;
                        if (-1 != var37) {
                           var87 = Rasterizer3D.Rasterizer3D_colorPalette[class57.method1371(var37, 96, (byte)-43)];
                        }

                        if (var27 == 0) {
                           var5.addTile(
                              var48,
                              var55,
                              var73,
                              0,
                              0,
                              -1,
                              var28,
                              var29,
                              var30,
                              var31,
                              class57.method1371(var36, var32, (byte)-37),
                              class57.method1371(var36, var33, (byte)-92),
                              class57.method1371(var36, var34, (byte)-113),
                              class57.method1371(var36, var35, (byte)-40),
                              0,
                              0,
                              0,
                              0,
                              var87,
                              0
                           );
                        } else {
                           int var88 = class200.Tiles_shapes[var48][var55][var73] + 1;
                           byte var90 = HttpRequest.field83[var48][var55][var73];
                           FloorOverlayDefinition var41 = class189.method4809(var27 - 1, 1880580249);
                           int var42 = var41.texture * 892155017;
                           int var43;
                           int var44;
                           if (var42 >= 0) {
                              var44 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var42, 256883326);
                              var43 = -1;
                           } else if (16711935 == 50022547 * var41.primaryRgb) {
                              var43 = -2;
                              var42 = -1;
                              var44 = -2;
                           } else {
                              var43 = class39.method649(-1914711119 * var41.hue, -1834712605 * var41.saturation, 1894985397 * var41.lightness, 1128984967);
                              int var45 = -1914711119 * var41.hue + rndHue * 1001072297 & 0xFF;
                              int var46 = -1076351093 * rndLightness + var41.lightness * 1894985397;
                              if (var46 < 0) {
                                 var46 = 0;
                              } else if (var46 > 255) {
                                 var46 = 255;
                              }

                              var44 = class39.method649(var45, var41.saturation * -1834712605, var46, 1128984967);
                           }

                           int var92 = 0;
                           if (var44 != -2) {
                              var92 = Rasterizer3D.Rasterizer3D_colorPalette[class212.method5134(var44, 96, -1263973057)];
                           }

                           if (var41.secondaryRgb * 705541053 != -1) {
                              int var93 = rndHue * 1001072297 + var41.secondaryHue * -347808971 & 0xFF;
                              int var47 = -1076351093 * rndLightness + var41.secondaryLightness * 2020271701;
                              if (var47 < 0) {
                                 var47 = 0;
                              } else if (var47 > 255) {
                                 var47 = 255;
                              }

                              var44 = class39.method649(var93, -796039805 * var41.secondarySaturation, var47, 1128984967);
                              var92 = Rasterizer3D.Rasterizer3D_colorPalette[class212.method5134(var44, 96, -690481043)];
                           }

                           var5.addTile(
                              var48,
                              var55,
                              var73,
                              var88,
                              var90,
                              var42,
                              var28,
                              var29,
                              var30,
                              var31,
                              class57.method1371(var36, var32, (byte)-11),
                              class57.method1371(var36, var33, (byte)-38),
                              class57.method1371(var36, var34, (byte)-69),
                              class57.method1371(var36, var35, (byte)-11),
                              class212.method5134(var43, var32, 424685117),
                              class212.method5134(var43, var33, 1203540552),
                              class212.method5134(var43, var34, 1183412456),
                              class212.method5134(var43, var35, 1761231537),
                              var87,
                              var92
                           );
                        }
                     }
                  }
               }
            }
         }

         for (int var56 = 1; var56 < var2 - 1; var56++) {
            for (int var59 = 1; var59 < var1 - 1; var59++) {
               int var74;
               if (0 != (var0.tileSettings[var48][var59][var56] & 8)) {
                  var74 = 0;
               } else if (var48 > 0 && (var0.tileSettings[1][var59][var56] & 2) != 0) {
                  var74 = var48 - 1;
               } else {
                  var74 = var48;
               }

               var5.method5706(var48, var59, var56, var74);
            }
         }

         class33.Tiles_underlays[var48] = (short[][])null;
         class623.Tiles_overlays[var48] = (short[][])null;
         class200.Tiles_shapes[var48] = (byte[][])null;
         HttpRequest.field83[var48] = (byte[][])null;
         Tiles_underlays2[var48] = (byte[][])null;
      }

      Scene.method5718(var5, -50, -10, -50);

      for (int var49 = 0; var49 < var1; var49++) {
         for (int var51 = 0; var51 < var2; var51++) {
            if ((var4[1][var49][var51] & 2) == 2) {
               Scene.method5722(var5, var49, var51);
            }
         }
      }

      if (WorldView.method3060(var0, (byte)0)) {
         HttpResponse.method143(var0, (byte)1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("cc")
   static void method1530(WorldView var0) {
      int var1 = var0.sizeX * 2010544793;
      int var2 = var0.sizeY * 1823353167;
      int[][][] var3 = var0.tileHeights;
      Scene var4 = var0.scene;
      byte var5 = 1;
      byte var6 = 2;
      byte var7 = 4;

      for (int var8 = 0; var8 < 4; var8++) {
         if (var8 > 0) {
            var5 <<= 3;
            var6 <<= 3;
            var7 <<= 3;
         }

         for (int var9 = 0; var9 <= var8; var9++) {
            for (int var10 = 0; var10 <= var2; var10++) {
               for (int var11 = 0; var11 <= var1; var11++) {
                  if (0 != (class148.field1911[var9][var11][var10] & var5)) {
                     int var12 = var10;
                     int var13 = var10;
                     int var14 = var9;
                     int var15 = var9;

                     while (var12 > 0 && (class148.field1911[var9][var11][var12 - 1] & var5) != 0) {
                        var12--;
                     }

                     while (var13 < var2 && (class148.field1911[var9][var11][var13 + 1] & var5) != 0) {
                        var13++;
                     }

                     label203:
                     while (var14 > 0) {
                        for (int var16 = var12; var16 <= var13; var16++) {
                           if ((class148.field1911[var14 - 1][var11][var16] & var5) == 0) {
                              break label203;
                           }
                        }

                        var14--;
                     }

                     label192:
                     while (var15 < var8) {
                        for (int var30 = var12; var30 <= var13; var30++) {
                           if (0 == (class148.field1911[1 + var15][var11][var30] & var5)) {
                              break label192;
                           }
                        }

                        var15++;
                     }

                     int var31 = (1 + var15 - var14) * (1 + (var13 - var12));
                     if (var31 >= 8) {
                        short var17 = 240;
                        int var18 = var3[var15][var11][var12] - var17;
                        int var19 = var3[var14][var11][var12];
                        var4.Scene_addOccluder(var8, 1, var11 * 128, var11 * 128, var12 * 128, 128 + 128 * var13, var18, var19);

                        for (int var20 = var14; var20 <= var15; var20++) {
                           for (int var21 = var12; var21 <= var13; var21++) {
                              class148.field1911[var20][var11][var21] = class148.field1911[var20][var11][var21] & ~var5;
                           }
                        }
                     }
                  }

                  if ((class148.field1911[var9][var11][var10] & var6) != 0) {
                     int var22 = var11;
                     int var24 = var11;
                     int var26 = var9;
                     int var28 = var9;

                     while (var22 > 0 && 0 != (class148.field1911[var9][var22 - 1][var10] & var6)) {
                        var22--;
                     }

                     while (var24 < var1 && 0 != (class148.field1911[var9][var24 + 1][var10] & var6)) {
                        var24++;
                     }

                     label256:
                     while (var26 > 0) {
                        for (int var32 = var22; var32 <= var24; var32++) {
                           if ((class148.field1911[var26 - 1][var32][var10] & var6) == 0) {
                              break label256;
                           }
                        }

                        var26--;
                     }

                     label245:
                     while (var28 < var8) {
                        for (int var33 = var22; var33 <= var24; var33++) {
                           if ((class148.field1911[var28 + 1][var33][var10] & var6) == 0) {
                              break label245;
                           }
                        }

                        var28++;
                     }

                     int var34 = (1 + var28 - var26) * (var24 - var22 + 1);
                     if (var34 >= 8) {
                        short var38 = 240;
                        int var40 = var3[var28][var22][var10] - var38;
                        int var42 = var3[var26][var22][var10];
                        var4.Scene_addOccluder(var8, 2, 128 * var22, 128 * var24 + 128, var10 * 128, var10 * 128, var40, var42);

                        for (int var43 = var26; var43 <= var28; var43++) {
                           for (int var44 = var22; var44 <= var24; var44++) {
                              class148.field1911[var43][var44][var10] = class148.field1911[var43][var44][var10] & ~var6;
                           }
                        }
                     }
                  }

                  if ((class148.field1911[var9][var11][var10] & var7) != 0) {
                     int var23 = var11;
                     int var25 = var11;
                     int var27 = var10;
                     int var29 = var10;

                     while (var27 > 0 && (class148.field1911[var9][var11][var27 - 1] & var7) != 0) {
                        var27--;
                     }

                     while (var29 < var2 && (class148.field1911[var9][var11][var29 + 1] & var7) != 0) {
                        var29++;
                     }

                     label309:
                     while (var23 > 0) {
                        for (int var35 = var27; var35 <= var29; var35++) {
                           if ((class148.field1911[var9][var23 - 1][var35] & var7) == 0) {
                              break label309;
                           }
                        }

                        var23--;
                     }

                     label298:
                     while (var25 < var1) {
                        for (int var36 = var27; var36 <= var29; var36++) {
                           if ((class148.field1911[var9][1 + var25][var36] & var7) == 0) {
                              break label298;
                           }
                        }

                        var25++;
                     }

                     if ((1 + (var25 - var23)) * (1 + (var29 - var27)) >= 4) {
                        int var37 = var3[var9][var23][var27];
                        var4.Scene_addOccluder(var8, 4, var23 * 128, 128 * var25 + 128, 128 * var27, 128 + 128 * var29, var37, var37);

                        for (int var39 = var23; var39 <= var25; var39++) {
                           for (int var41 = var27; var41 <= var29; var41++) {
                              class148.field1911[var9][var39][var41] = class148.field1911[var9][var39][var41] & ~var7;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("cs")
   static void method1531(WorldView var0) {
      int var1 = var0.sizeX * 2010544793;
      int var2 = var0.sizeY * 1823353167;
      int[][][] var3 = var0.tileHeights;
      Scene var4 = var0.scene;
      byte var5 = 1;
      byte var6 = 2;
      byte var7 = 4;

      for (int var8 = 0; var8 < 4; var8++) {
         if (var8 > 0) {
            var5 <<= 3;
            var6 <<= 3;
            var7 <<= 3;
         }

         for (int var9 = 0; var9 <= var8; var9++) {
            for (int var10 = 0; var10 <= var2; var10++) {
               for (int var11 = 0; var11 <= var1; var11++) {
                  if (0 != (class148.field1911[var9][var11][var10] & var5)) {
                     int var12 = var10;
                     int var13 = var10;
                     int var14 = var9;
                     int var15 = var9;

                     while (var12 > 0 && (class148.field1911[var9][var11][var12 - 1] & var5) != 0) {
                        var12--;
                     }

                     while (var13 < var2 && (class148.field1911[var9][var11][var13 + 1] & var5) != 0) {
                        var13++;
                     }

                     label202:
                     while (var14 > 0) {
                        for (int var16 = var12; var16 <= var13; var16++) {
                           if ((class148.field1911[var14 - 1][var11][var16] & var5) == 0) {
                              break label202;
                           }
                        }

                        var14--;
                     }

                     label191:
                     while (var15 < var8) {
                        for (int var30 = var12; var30 <= var13; var30++) {
                           if (0 == (class148.field1911[1 + var15][var11][var30] & var5)) {
                              break label191;
                           }
                        }

                        var15++;
                     }

                     int var31 = (1 + var15 - var14) * (1 + (var13 - var12));
                     if (var31 >= 8) {
                        short var17 = 240;
                        int var18 = var3[var15][var11][var12] - var17;
                        int var19 = var3[var14][var11][var12];
                        var4.Scene_addOccluder(var8, 1, var11 * 128, var11 * 128, var12 * 128, 128 + 128 * var13, var18, var19);

                        for (int var20 = var14; var20 <= var15; var20++) {
                           for (int var21 = var12; var21 <= var13; var21++) {
                              class148.field1911[var20][var11][var21] = class148.field1911[var20][var11][var21] & ~var5;
                           }
                        }
                     }
                  }

                  if ((class148.field1911[var9][var11][var10] & var6) != 0) {
                     int var22 = var11;
                     int var24 = var11;
                     int var26 = var9;
                     int var28 = var9;

                     while (var22 > 0 && 0 != (class148.field1911[var9][var22 - 1][var10] & var6)) {
                        var22--;
                     }

                     while (var24 < var1 && 0 != (class148.field1911[var9][var24 + 1][var10] & var6)) {
                        var24++;
                     }

                     label255:
                     while (var26 > 0) {
                        for (int var32 = var22; var32 <= var24; var32++) {
                           if ((class148.field1911[var26 - 1][var32][var10] & var6) == 0) {
                              break label255;
                           }
                        }

                        var26--;
                     }

                     label244:
                     while (var28 < var8) {
                        for (int var33 = var22; var33 <= var24; var33++) {
                           if ((class148.field1911[var28 + 1][var33][var10] & var6) == 0) {
                              break label244;
                           }
                        }

                        var28++;
                     }

                     int var34 = (1 + var28 - var26) * (var24 - var22 + 1);
                     if (var34 >= 8) {
                        short var38 = 240;
                        int var40 = var3[var28][var22][var10] - var38;
                        int var42 = var3[var26][var22][var10];
                        var4.Scene_addOccluder(var8, 2, 128 * var22, 128 * var24 + 128, var10 * 128, var10 * 128, var40, var42);

                        for (int var43 = var26; var43 <= var28; var43++) {
                           for (int var44 = var22; var44 <= var24; var44++) {
                              class148.field1911[var43][var44][var10] = class148.field1911[var43][var44][var10] & ~var6;
                           }
                        }
                     }
                  }

                  if ((class148.field1911[var9][var11][var10] & var7) != 0) {
                     int var23 = var11;
                     int var25 = var11;
                     int var27 = var10;
                     int var29 = var10;

                     while (var27 > 0 && (class148.field1911[var9][var11][var27 - 1] & var7) != 0) {
                        var27--;
                     }

                     while (var29 < var2 && (class148.field1911[var9][var11][var29 + 1] & var7) != 0) {
                        var29++;
                     }

                     label308:
                     while (var23 > 0) {
                        for (int var35 = var27; var35 <= var29; var35++) {
                           if ((class148.field1911[var9][var23 - 1][var35] & var7) == 0) {
                              break label308;
                           }
                        }

                        var23--;
                     }

                     label297:
                     while (var25 < var1) {
                        for (int var36 = var27; var36 <= var29; var36++) {
                           if ((class148.field1911[var9][1 + var25][var36] & var7) == 0) {
                              break label297;
                           }
                        }

                        var25++;
                     }

                     if ((1 + (var25 - var23)) * (1 + (var29 - var27)) >= 4) {
                        int var37 = var3[var9][var23][var27];
                        var4.Scene_addOccluder(var8, 4, var23 * 128, 128 * var25 + 128, 128 * var27, 128 + 128 * var29, var37, var37);

                        for (int var39 = var23; var39 <= var25; var39++) {
                           for (int var41 = var27; var41 <= var29; var41++) {
                              class148.field1911[var9][var39][var41] = class148.field1911[var9][var39][var41] & ~var7;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;)V")
   @ObfuscatedName("cn")
   static void method1532(WorldView var0) {
      int var1 = var0.sizeX * 2010544793;
      int var2 = var0.sizeY * 1332258039;
      int[][][] var3 = var0.tileHeights;
      Scene var4 = var0.scene;
      byte var5 = 1;
      byte var6 = 2;
      byte var7 = 4;

      for (int var8 = 0; var8 < 4; var8++) {
         if (var8 > 0) {
            var5 <<= 3;
            var6 <<= 3;
            var7 <<= 3;
         }

         for (int var9 = 0; var9 <= var8; var9++) {
            for (int var10 = 0; var10 <= var2; var10++) {
               for (int var11 = 0; var11 <= var1; var11++) {
                  if (0 != (class148.field1911[var9][var11][var10] & var5)) {
                     int var12 = var10;
                     int var13 = var10;
                     int var14 = var9;
                     int var15 = var9;

                     while (var12 > 0 && (class148.field1911[var9][var11][var12 - 1] & var5) != 0) {
                        var12--;
                     }

                     while (var13 < var2 && (class148.field1911[var9][var11][var13 + 1] & var5) != 0) {
                        var13++;
                     }

                     label204:
                     while (var14 > 0) {
                        for (int var16 = var12; var16 <= var13; var16++) {
                           if ((class148.field1911[var14 - 1][var11][var16] & var5) == 0) {
                              break label204;
                           }
                        }

                        var14--;
                     }

                     label193:
                     while (var15 < var8) {
                        for (int var30 = var12; var30 <= var13; var30++) {
                           if (0 == (class148.field1911[1 + var15][var11][var30] & var5)) {
                              break label193;
                           }
                        }

                        var15++;
                     }

                     int var31 = (1 + var15 - var14) * (1 + (var13 - var12));
                     if (var31 >= 8) {
                        int var17 = -1964193309;
                        int var18 = var3[var15][var11][var12] - var17;
                        int var19 = var3[var14][var11][var12];
                        var4.Scene_addOccluder(var8, 1, var11 * -1856542491, var11 * -268588445, var12 * 128, -1773371973 + -144337909 * var13, var18, var19);

                        for (int var20 = var14; var20 <= var15; var20++) {
                           for (int var21 = var12; var21 <= var13; var21++) {
                              class148.field1911[var20][var11][var21] = class148.field1911[var20][var11][var21] & ~var5;
                           }
                        }
                     }
                  }

                  if ((class148.field1911[var9][var11][var10] & var6) != 0) {
                     int var22 = var11;
                     int var24 = var11;
                     int var26 = var9;
                     int var28 = var9;

                     while (var22 > 0 && 0 != (class148.field1911[var9][var22 - 1][var10] & var6)) {
                        var22--;
                     }

                     while (var24 < var1 && 0 != (class148.field1911[var9][var24 + 1][var10] & var6)) {
                        var24++;
                     }

                     label257:
                     while (var26 > 0) {
                        for (int var32 = var22; var32 <= var24; var32++) {
                           if ((class148.field1911[var26 - 1][var32][var10] & var6) == 0) {
                              break label257;
                           }
                        }

                        var26--;
                     }

                     label246:
                     while (var28 < var8) {
                        for (int var33 = var22; var33 <= var24; var33++) {
                           if ((class148.field1911[var28 + 1][var33][var10] & var6) == 0) {
                              break label246;
                           }
                        }

                        var28++;
                     }

                     int var34 = (1 + var28 - var26) * (var24 - var22 + 1);
                     if (var34 >= 8) {
                        int var38 = -9716889;
                        int var40 = var3[var28][var22][var10] - var38;
                        int var42 = var3[var26][var22][var10];
                        var4.Scene_addOccluder(var8, 2, 619685882 * var22, 128 * var24 + -108108644, var10 * 1725116857, var10 * 128, var40, var42);

                        for (int var43 = var26; var43 <= var28; var43++) {
                           for (int var44 = var22; var44 <= var24; var44++) {
                              class148.field1911[var43][var44][var10] = class148.field1911[var43][var44][var10] & ~var6;
                           }
                        }
                     }
                  }

                  if ((class148.field1911[var9][var11][var10] & var7) != 0) {
                     int var23 = var11;
                     int var25 = var11;
                     int var27 = var10;
                     int var29 = var10;

                     while (var27 > 0 && (class148.field1911[var9][var11][var27 - 1] & var7) != 0) {
                        var27--;
                     }

                     while (var29 < var2 && (class148.field1911[var9][var11][var29 + 1] & var7) != 0) {
                        var29++;
                     }

                     label310:
                     while (var23 > 0) {
                        for (int var35 = var27; var35 <= var29; var35++) {
                           if ((class148.field1911[var9][var23 - 1][var35] & var7) == 0) {
                              break label310;
                           }
                        }

                        var23--;
                     }

                     label299:
                     while (var25 < var1) {
                        for (int var36 = var27; var36 <= var29; var36++) {
                           if ((class148.field1911[var9][1 + var25][var36] & var7) == 0) {
                              break label299;
                           }
                        }

                        var25++;
                     }

                     if ((1 + (var25 - var23)) * (1 + (var29 - var27)) >= 4) {
                        int var37 = var3[var9][var23][var27];
                        var4.Scene_addOccluder(var8, 4, var23 * -926775505, 128 * var25 + 128, 128 * var27, 128 + 128 * var29, var37, var37);

                        for (int var39 = var23; var39 <= var25; var39++) {
                           for (int var41 = var27; var41 <= var29; var41++) {
                              class148.field1911[var9][var39][var41] = class148.field1911[var9][var39][var41] & ~var7;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BII)Z")
   @ObfuscatedName("bd")
   static final boolean method1515(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      Buffer var4 = new Buffer(var0);
      int var5 = -1;

      label81:
      while (true) {
         int var6 = Buffer.method12056(var4, 1630233543);
         if (var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while (true) {
            while (!var8) {
               int var9 = Buffer.method12050(var4, 164406080);
               if (0 == var9) {
                  continue label81;
               }

               var7 += var9 - 1;
               int var10 = var7 & 1941598296;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.readUnsignedByte(1976853717) >> 2;
               int var13 = var1 + var11;
               int var14 = var2 + var10;
               if (var13 > 0 && var14 > 0 && var13 < -967900060 && var14 < 704668564) {
                  ObjectComposition var15 = AsyncHttpResponse.getObjectDefinition(var5, 2080797769);
                  if (var12 != 22 || !client.isLowDetail || -396507725 * var15.int1 != 0 || 1 == var15.interactType * 694170966 || var15.boolean2) {
                     if (!var15.method5158(1885629999)) {
                        client.field799 += -1601593403;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            int var16 = Buffer.method12050(var4, -760803623);
            if (0 == var16) {
               break;
            }

            var4.readUnsignedByte(1537557991);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;[BIIIIIIIII)V")
   @ObfuscatedName("bk")
   static final void method1503(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      CollisionMap[] var11 = var0.collisionMaps;
      if (null != var11 && var2 >= 0 && var2 < var11.length) {
         CollisionMap var12 = var11[var2];

         for (int var13 = var3; var13 < 8 + var3; var13++) {
            for (int var14 = var4; var14 < 8 + var4; var14++) {
               if (var12.method6401(var13, var14, -80486063)) {
                  var12.method6398(var13, var14, 1073741824, -805332517);
               }
            }
         }
      }

      Buffer var25 = new Buffer(var1);

      for (int var26 = 0; var26 < 4; var26++) {
         for (int var28 = 0; var28 < 62138800; var28++) {
            for (int var15 = 0; var15 < 979967251; var15++) {
               if (var5 == var26 && var28 >= var6 && var28 < var6 + 8 && var15 >= var7 && var15 < 8 + var7) {
                  int var16 = var3 + FontName.method11646(var28 & 7, var15 & 7, var8, (byte)-29);
                  int var19 = var28 & 7;
                  int var20 = var15 & 7;
                  int var21 = var8 & 3;
                  int var18;
                  if (0 == var21) {
                     var18 = var20;
                  } else if (1 == var21) {
                     var18 = 7 - var19;
                  } else if (var21 == 2) {
                     var18 = 7 - var20;
                  } else {
                     var18 = var19;
                  }

                  int var22 = var4 + var18;
                  int var23 = (var28 & 7) + var9 + var3;
                  int var24 = var4 + var10 + (var15 & 7);
                  class264.loadTerrain(var0, var25, var2, var16, var22, var23, var24, var8, 2120799283);
               } else {
                  class264.loadTerrain(var0, var25, 0, -1, -1, 0, 0, 0, 2131490166);
               }
            }
         }
      }

      int var27 = var25.offset * -1076356764 < var25.array.length ? var25.readUnsignedByte(-1133974682) : 0;
      boolean var29 = 0 != (var27 & 1);
      if (var29) {
         for (int var30 = 0; var30 < 1100383324; var30++) {
            for (int var31 = 0; var31 < 64; var31++) {
               class148.method4142(var25, (byte)67);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cf")
   static final int method1540(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (-1 == var0) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 1418603654;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1 + (var0 & 65408);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cp")
   static final int method1536(int var0, int var1) {
      int var2 = classRE.method9418(var0 - 1, var1 - 1, -1922487692)
         + classRE.method9418(var0 + 1, var1 - 1, 556428561)
         + classRE.method9418(var0 - 1, 1 + var1, -2062691095)
         + classRE.method9418(1 + var0, var1 + 1, -1204106306);
      int var3 = classRE.method9418(var0 - 1, var1, -2117465569)
         + classRE.method9418(var0 + 1, var1, -225472429)
         + classRE.method9418(var0, var1 - 1, 660274265)
         + classRE.method9418(var0, 1 + var1, 317117725);
      int var4 = classRE.method9418(var0, var1, -945917951);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cd")
   static final int method1537(int var0, int var1) {
      int var2 = 57 * var1 + var0;
      var2 = var2 << 13 ^ var2;
      int var3 = (789221 + var2 * var2 * 15731) * var2 + 1376312589 & 2147483647;
      return var3 >> 19 & 0xFF;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("co")
   static final int method1533(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = Projection.method6227(var3, var5, -1644257037);
      int var8 = Projection.method6227(1 + var3, var5, -1644257037);
      int var9 = Projection.method6227(var3, var5 + 1, -1644257037);
      int var10 = Projection.method6227(var3 + 1, var5 + 1, -1644257037);
      int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
      int var11 = (var7 * (65536 - var12) >> 16) + (var12 * var8 >> 16);
      int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
      int var13 = (var9 * (65536 - var14) >> 16) + (var14 * var10 >> 16);
      int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[1024 * var6 / var2] >> 1;
      return (var16 * var13 >> 16) + ((65536 - var16) * var11 >> 16);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;[BIIII)V")
   @ObfuscatedName("bo")
   static final void method1499(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5) {
      if (null != var0.collisionMaps) {
         for (int var6 = 0; var6 < 4; var6++) {
            CollisionMap var7 = var0.collisionMaps[var6];

            for (int var8 = var2; var8 < var2 + 64; var8++) {
               for (int var9 = var3; var9 < var3 + 64; var9++) {
                  if (var7.method6401(var8, var9, -74685966)) {
                     var7.method6398(var8, var9, -1621826544, -898632104);
                  }
               }
            }
         }
      }

      Buffer var12 = new Buffer(var1);

      for (int var13 = 0; var13 < 4; var13++) {
         for (int var15 = 0; var15 < 64; var15++) {
            for (int var17 = 0; var17 < 148234058; var17++) {
               int var10 = var2 + var15;
               int var11 = var17 + var3;
               class264.loadTerrain(var0, var12, var13, var10, var11, var10 + var4, var11 + var5, 0, 2134996819);
            }
         }
      }

      int var14 = var12.offset * 2108391709 < var12.array.length ? var12.readUnsignedByte(689397794) : 0;
      boolean var16 = 0 != (var14 & 1);
      if (var16) {
         for (int var18 = 0; var18 < 64; var18++) {
            for (int var19 = 0; var19 < 64; var19++) {
               class148.method4142(var12, (byte)113);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;[BII)V")
   @ObfuscatedName("bc")
   static final void method1519(WorldView var0, byte[] var1, int var2, int var3) {
      Buffer var4 = new Buffer(var1);
      int var5 = -1;

      while (true) {
         int var6 = Buffer.method12056(var4, -1281759724);
         if (var6 == 0) {
            return;
         }

         var5 += var6;
         int var7 = 0;

         while (true) {
            int var8 = Buffer.method12050(var4, -1753507053);
            if (var8 == 0) {
               break;
            }

            var7 += var8 - 1;
            int var9 = var7 & 63;
            int var10 = var7 >> 6 & 63;
            int var11 = var7 >> 12;
            int var12 = var4.readUnsignedByte(1584376458);
            int var13 = var12 >> 2;
            int var14 = var12 & 3;
            int var15 = var2 + var10;
            int var16 = var3 + var9;
            if (var15 > 0 && var16 > 0 && var15 < var0.tileHeights[0].length - 2 && var16 < var0.tileHeights[0][0].length - 2) {
               int var17 = var11;
               if (2 == (var0.tileSettings[1][var15][var16] & 2)) {
                  var17 = var11 - 1;
               }

               CollisionMap var18 = null;
               if (var17 >= 0 && null != var0.collisionMaps) {
                  var18 = var0.collisionMaps[var17];
               }

               FriendSystem.addObjects(var0, var11, var15, var16, var5, var14, var13, var18, -1925081690);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("cy")
   static final boolean method1541(int var0, int var1) {
      ObjectComposition var2 = AsyncHttpResponse.getObjectDefinition(var0, 2000143275);
      if (var1 == 11) {
         var1 = 10;
      }

      if (var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var2.method5157(var1, (byte)21);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("cq")
   static final boolean method1542(int var0, int var1) {
      ObjectComposition var2 = AsyncHttpResponse.getObjectDefinition(var0, 2095426159);
      if (var1 == 11) {
         var1 = 10;
      }

      if (var1 >= 5 && var1 <= 8) {
         var1 = 4;
      }

      return var2.method5157(var1, (byte)27);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;[BII)V")
   @ObfuscatedName("bx")
   static final void method1520(WorldView var0, byte[] var1, int var2, int var3) {
      Buffer var4 = new Buffer(var1);
      int var5 = -1;

      while (true) {
         int var6 = Buffer.method12056(var4, 956983737);
         if (var6 == 0) {
            return;
         }

         var5 += var6;
         int var7 = 0;

         while (true) {
            int var8 = Buffer.method12050(var4, -560280217);
            if (var8 == 0) {
               break;
            }

            var7 += var8 - 1;
            int var9 = var7 & -2125163558;
            int var10 = var7 >> 6 & 63;
            int var11 = var7 >> 12;
            int var12 = var4.readUnsignedByte(-1293794186);
            int var13 = var12 >> 2;
            int var14 = var12 & 3;
            int var15 = var2 + var10;
            int var16 = var3 + var9;
            if (var15 > 0 && var16 > 0 && var15 < var0.tileHeights[0].length - 2 && var16 < var0.tileHeights[0][0].length - 2) {
               int var17 = var11;
               if (2 == (var0.tileSettings[1][var15][var16] & 2)) {
                  var17 = var11 - 1;
               }

               CollisionMap var18 = null;
               if (var17 >= 0 && null != var0.collisionMaps) {
                  var18 = var0.collisionMaps[var17];
               }

               FriendSystem.addObjects(var0, var11, var15, var16, var5, var14, var13, var18, 2013142179);
            }
         }
      }
   }
}
