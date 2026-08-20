import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lu")
public final class WorldMapSprite {
   @ObfuscatedName("at")
   final int[] tileColors;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final int field3782 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   static final int field3783 = 52;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3781 = 4096;
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   static final int field3784 = 102;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxv;Ljava/lang/Object;)I")
   @ObfuscatedName("xn")
   public static int method7291(Username var0, Object var1) {
      if (var0 == null) {
         var0.method12725();
      }

      return var0.compareToTyped((Username)var1, 1494287869);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)Llu;")
   @ObfuscatedName("ag")
   static WorldMapSprite method7286(byte[] var0) {
      if (null == var0) {
         return new WorldMapSprite();
      } else {
         SpritePixels var1 = class201.readSpritePixelsFromBytes(var0, (byte)-51);
         return null == var1 ? new WorldMapSprite() : new WorldMapSprite(var1.pixels);
      }
   }

   WorldMapSprite() {
      this.tileColors = new int[4096];
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIILoz;I)V")
   @ObfuscatedName("an")
   static void method7292(WorldView var0, int var1, int var2, int var3, SpriteMask var4, int var5) {
      try {
         int var6 = client.playerUpdateManager.field1538 * 1320060371;
         int[] var7 = client.playerUpdateManager.playerIndices;

         for (int var8 = 0; var8 < var6; var8++) {
            if (var5 == -1548769816) {
               throw new IllegalStateException();
            }

            Player var9 = (Player)var0.npcs.get(var7[var8]);
            if (var9 != null) {
               if (var5 == -1548769816) {
                  throw new IllegalStateException();
               }

               if (var9.isVisible(-1021917197)) {
                  if (var5 == -1548769816) {
                     throw new IllegalStateException();
                  }

                  if (!var9.isHidden) {
                     if (var5 == -1548769816) {
                        throw new IllegalStateException();
                     }

                     ProjectionCoord var10 = classDH.method3122(var0, var9.x * 340712311, -1747310679 * var9.y, (byte)96);
                     int var11 = (int)var10.x;
                     int var12 = (int)var10.y;
                     var10.release(-804947546);
                     int var13 = var11 / 32 - client.field828 * -361115983 / 32;
                     int var14 = var12 / 32 - -291215063 * client.field674 / 32;
                     if (var9 == client.worldViewManager.method2961(1069843077)) {
                        if (var5 == -1548769816) {
                           return;
                        }

                        int var15 = Rasterizer3D.Rasterizer3D_sine[var3];
                        int var16 = Rasterizer3D.Rasterizer3D_cosine[var3];
                        int var17 = var16 * var13 + var15 * var14 >> 16;
                        int var18 = var16 * var14 - var15 * var13 >> 16;
                        class39.field185 = var17 * -1321678457;
                        class39.Players_count = -851581775 * var18;
                     } else if (var9.isFriend(1395283750)) {
                        if (var5 == -1548769816) {
                           throw new IllegalStateException();
                        }

                        SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var13, var14, var3, classWZ.field6473[3], var4, -1354846003);
                     } else {
                        if (-2140200207 * class330.localPlayer.team != 0) {
                           if (var5 == -1548769816) {
                              throw new IllegalStateException();
                           }

                           if (var9.team * -2140200207 != 0) {
                              if (var5 == -1548769816) {
                                 throw new IllegalStateException();
                              }

                              if (var9.team * -2140200207 == class330.localPlayer.team * -2140200207) {
                                 SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var13, var14, var3, classWZ.field6473[4], var4, 1406062677);
                                 continue;
                              }
                           }
                        }

                        if (var9.isClanMember((byte)-82)) {
                           if (var5 == -1548769816) {
                              throw new IllegalStateException();
                           }

                           SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var13, var14, var3, classWZ.field6473[5], var4, 778318201);
                        } else if (Player.method1460(var9, (byte)0)) {
                           if (var5 == -1548769816) {
                              throw new IllegalStateException();
                           }

                           SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var13, var14, var3, classWZ.field6473[6], var4, 297544980);
                        } else {
                           SecureRandomFuture.drawSpriteOnMinimap(var1, var2, var13, var14, var3, classWZ.field6473[2], var4, 557215872);
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var19) {
         throw RestClientThreadFactory.newRunException(var19, "lu.an(" + ')');
      }
   }

   WorldMapSprite(int[] var1) {
      this.tileColors = var1;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("an")
   final int method7288(int var1, int var2) {
      return this.tileColors[var1 + var2 * 64];
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ae")
   final int method7289(int var1, int var2) {
      return this.tileColors[var1 + var2 * 64];
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("at")
   final int getTileColor(int var1, int var2, int var3) {
      try {
         return this.tileColors[var1 + var2 * 64];
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lu.at(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;)I")
   @ObfuscatedName("hy")
   public static int method7293(classSF var0) {
      if (var0 == null) {
         var0.method10239();
      }

      return var0.method10125((byte)-5) ? 0 : var0.field5780.ascent + ((class472)var0.field5767.get(var0.field5767.size() - 1)).field5867 * -798824383;
   }

   @ObfuscatedSignature(descriptor = "(B)[Luf;")
   @ObfuscatedName("ae")
   public static class524[] method7287(byte var0) {
      try {
         return new class524[]{class524.field6034, class524.field6036, class524.field6037, class524.field6035};
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "lu.ae(" + ')');
      }
   }
}
