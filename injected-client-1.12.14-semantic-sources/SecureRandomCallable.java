import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cc")
public class SecureRandomCallable implements Callable {
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ct")
   public static AbstractArchive ObjectDefinition_modelsArchive;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   public static final int field474 = 22;
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   static final int field475 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field473 = 4;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljava/security/SecureRandom;")
   @ObfuscatedName("ae")
   static SecureRandom method1374() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }

   @Override
   public Object call() {
      try {
         SecureRandom var2 = new SecureRandom();
         var2.nextInt();
         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cc.call(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljava/security/SecureRandom;")
   @ObfuscatedName("aj")
   static SecureRandom method1375() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("av")
   public Object method1377() {
      SecureRandom var2 = new SecureRandom();
      var2.nextInt();
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljava/security/SecureRandom;")
   @ObfuscatedName("an")
   static SecureRandom method1376() {
      SecureRandom var0 = new SecureRandom();
      var0.nextInt();
      return var0;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("at")
   public Object method1378() {
      SecureRandom var2 = new SecureRandom();
      var2.nextInt();
      return var2;
   }

   SecureRandomCallable() {
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ar")
   public static void method1380(int var0) {
      try {
         boolean var1;
         do {
            var1 = true;

            for (int var2 = 0; var2 < ViewportMouse.ViewportMouse_entityCount * -1556503267; var2++) {
               if (var0 <= 543940224) {
                  return;
               }

               if (ViewportMouse.field3480[var2] < ViewportMouse.field3480[var2 + 1]) {
                  long var3 = ViewportMouse.ViewportMouse_entityTags[var2];
                  ViewportMouse.ViewportMouse_entityTags[var2] = ViewportMouse.ViewportMouse_entityTags[var2 + 1];
                  ViewportMouse.ViewportMouse_entityTags[var2 + 1] = var3;
                  int var5 = ViewportMouse.field3480[var2];
                  ViewportMouse.field3480[var2] = ViewportMouse.field3480[var2 + 1];
                  ViewportMouse.field3480[1 + var2] = var5;
                  var1 = false;
               }
            }
         } while (!var1);

         if (var0 <= 543940224) {
            throw new IllegalStateException();
         } else {
            for (int var7 = 0; var7 < ViewportMouse.ViewportMouse_entityCount * -1556503267; var7++) {
               if (var0 <= 543940224) {
                  throw new IllegalStateException();
               }

               for (int var8 = var7 + 1; var8 <= -1556503267 * ViewportMouse.ViewportMouse_entityCount; var8++) {
                  if (var0 <= 543940224) {
                     return;
                  }

                  if (ViewportMouse.ViewportMouse_entityTags[var8] == ViewportMouse.ViewportMouse_entityTags[var7]) {
                     if (var0 <= 543940224) {
                        throw new IllegalStateException();
                     }

                     ViewportMouse.ViewportMouse_entityTags[var7] = -1L;
                     break;
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "cc.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ak")
   static final void method1381(int var0, int var1) {
      try {
         int[] var2 = class437.sceneMinimapSprite.pixels;
         int var3 = var2.length;

         for (int var4 = 0; var4 < var3; var4++) {
            if (var1 == 624586038) {
               return;
            }

            var2[var4] = 1;
         }

         for (int var13 = 1; var13 < 103; var13++) {
            if (var1 == 624586038) {
               throw new IllegalStateException();
            }

            int var5 = 2048 * (103 - var13) + 24628;

            for (int var6 = 1; var6 < 103; var6++) {
               if (var1 == 624586038) {
                  throw new IllegalStateException();
               }

               if ((Occluder.topLevelWorldView.tileSettings[var0][var6][var13] & 24) == 0) {
                  if (var1 == 624586038) {
                     throw new IllegalStateException();
                  }

                  Occluder.topLevelWorldView.scene.drawTileMinimap(var2, var5, 512, var0, var6, var13);
               }

               if (var0 < 3) {
                  if (var1 == 624586038) {
                     throw new IllegalStateException();
                  }

                  if (0 != (Occluder.topLevelWorldView.tileSettings[var0 + 1][var6][var13] & 8)) {
                     if (var1 == 624586038) {
                        return;
                     }

                     Occluder.topLevelWorldView.scene.drawTileMinimap(var2, var5, 512, 1 + var0, var6, var13);
                  }
               }

               var5 += 4;
            }
         }

         int var14 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
         int var15 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
         SpritePixels.method12620(class437.sceneMinimapSprite);

         for (int var16 = 1; var16 < 103; var16++) {
            if (var1 == 624586038) {
               throw new IllegalStateException();
            }

            for (int var7 = 1; var7 < 103; var7++) {
               if (var1 == 624586038) {
                  throw new IllegalStateException();
               }

               if (0 == (Occluder.topLevelWorldView.tileSettings[var0][var7][var16] & 24)) {
                  if (var1 == 624586038) {
                     throw new IllegalStateException();
                  }

                  HealthBarDefinition.drawObject(var0, var7, var16, var14, var15, 1143407585);
               }

               if (var0 < 3) {
                  if (var1 == 624586038) {
                     throw new IllegalStateException();
                  }

                  if ((Occluder.topLevelWorldView.tileSettings[1 + var0][var7][var16] & 8) != 0) {
                     if (var1 == 624586038) {
                        throw new IllegalStateException();
                     }

                     HealthBarDefinition.drawObject(var0 + 1, var7, var16, var14, var15, 2057105481);
                  }
               }
            }
         }

         class39.mapIconCount = 0;

         for (int var17 = 0; var17 < 104; var17++) {
            if (var1 == 624586038) {
               throw new IllegalStateException();
            }

            for (int var18 = 0; var18 < 104; var18++) {
               if (var1 == 624586038) {
                  throw new IllegalStateException();
               }

               long var8 = Occluder.topLevelWorldView.scene.getBoundaryObjectTag(2115028565 * Occluder.topLevelWorldView.plane, var17, var18);
               if (0L != var8) {
                  if (var1 == 624586038) {
                     return;
                  }

                  int var10 = HorizontalAlignment.Entity_unpackID(var8);
                  int var11 = AsyncHttpResponse.getObjectDefinition(var10, 2020289249).mapIconId * -2059094647;
                  if (var11 >= 0) {
                     if (var1 == 624586038) {
                        throw new IllegalStateException();
                     }

                     if (!class463.WorldMapElement_get(var11, (byte)0).field2214) {
                        if (var1 == 624586038) {
                           throw new IllegalStateException();
                        }
                     } else {
                        class39.mapIcons[1136885703 * class39.mapIconCount] = class463.WorldMapElement_get(var11, (byte)0).getSpriteBool(false, -666509786);
                        class39.mapIconXs[class39.mapIconCount * 1136885703] = var17;
                        class39.mapIconYs[1136885703 * class39.mapIconCount] = var18;
                        class39.mapIconCount += 83923447;
                     }
                  }
               }
            }
         }

         AbstractRasterProvider.method12262(GameEngine.rasterProvider, (byte)11);
      } catch (RuntimeException var12) {
         throw RestClientThreadFactory.newRunException(var12, "cc.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;Lqm;Lqm;I)V")
   @ObfuscatedName("av")
   public static void method1379(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, int var4) {
      try {
         Tiles.SequenceDefinition_archive = var0;
         class152.SequenceDefinition_animationsArchive = var1;
         WorldMapData_0.SequenceDefinition_skeletonsArchive = var2;
         WorldMapIcon_0.SpotAnimationDefinition_archive = var3;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "cc.av(" + ')');
      }
   }
}
