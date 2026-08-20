import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bk")
public class class31 {
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field210 = 24624;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   static final int field212 = 93;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final String field213 = "osrs";
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field211 = 8;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ag")
   public static void method662(String var0) {
      if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
         try {
            Desktop.getDesktop().browse(new URI(var0));
         } catch (Exception var2) {
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrl;Lrl;Lrl;)V")
   @ObfuscatedName("fo")
   public static void method665(Bounds var0, Bounds var1, Bounds var2) {
      if (var0 == null) {
         var0.method9526();
      }

      var2.highX = 1 * var0.highX;
      var2.lowY = var0.lowY * 1;
      if (551012272 * var0.highX < var1.highX * -268027987) {
         var2.lowY = var2.lowY - (var1.highX * -828389648 - -1690359744 * var0.highX);
         var2.highX = var1.highX * 1;
      }

      if (var2.method9532(-962421992) > var1.method9532(1146265614)) {
         var2.lowY = var2.lowY - (var2.method9532(1670858696) - var1.method9532(-199180730)) * -817586498;
      }

      if (var2.lowY * 358269786 < 0) {
         var2.lowY = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("at")
   public static void method663(String var0) {
      if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
         try {
            Desktop.getDesktop().browse(new URI(var0));
         } catch (Exception var2) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIB)V")
   @ObfuscatedName("lu")
   public static final void method668(int var0, int var1, int var2, int var3, byte var4) {
      try {
         for (int var5 = 0; var5 < client.rootWidgetCount * -1020775279; var5++) {
            if (var4 <= 64) {
               throw new IllegalStateException();
            }

            if (client.rootWidgetWidths[var5] + client.rootWidgetXs[var5] > var0) {
               if (var4 <= 64) {
                  return;
               }

               if (client.rootWidgetXs[var5] < var2 + var0) {
                  if (var4 <= 64) {
                     throw new IllegalStateException();
                  }

                  if (client.rootWidgetHeights[var5] + client.rootWidgetYs[var5] > var1) {
                     if (var4 <= 64) {
                        throw new IllegalStateException();
                     }

                     if (client.rootWidgetYs[var5] < var1 + var3) {
                        if (var4 <= 64) {
                           throw new IllegalStateException();
                        }

                        client.validRootWidgets[var5] = true;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "bk.lu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lut;II)V")
   @ObfuscatedName("ae")
   static void method666(DynamicArray var0, int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 == 134349312) {
               throw new IllegalStateException();
            }

            if (var1 < var0.method11215((byte)74)) {
               return;
            }

            if (var2 == 134349312) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException();
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bk.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   public static void method664(int var0) {
      try {
         class191.field2007.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "bk.av(" + ')');
      }
   }

   class31() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ot")
   static final void method669(int var0) {
      try {
         client.field845 = 1392479513 * client.cycleCntr;
         DefaultsGroup.field6076 = true;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "bk.ot(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IZI)V")
   @ObfuscatedName("jm")
   static void addPlayerToScene(WorldView var0, int var1, boolean var2, int var3) {
      try {
         Player var4 = (Player)var0.npcs.get(var1);
         if (var4 != null && var4.isVisible(-1481041478)) {
            if (var3 <= 2076201616) {
               throw new IllegalStateException();
            }

            if (!var4.isHidden) {
               int var5;
               label122: {
                  label130: {
                     var5 = var4.plane * -2060016843;
                     var4.isUnanimated = false;
                     if (client.isLowDetail) {
                        if (var3 <= 2076201616) {
                           throw new IllegalStateException();
                        }

                        if (1320060371 * client.playerUpdateManager.field1538 > 50) {
                           break label130;
                        }

                        if (var3 <= 2076201616) {
                           throw new IllegalStateException();
                        }
                     }

                     if (client.playerUpdateManager.field1538 * 1320060371 <= 200) {
                        break label122;
                     }

                     if (var3 <= 2076201616) {
                        throw new IllegalStateException();
                     }
                  }

                  if (var2) {
                     if (var3 <= 2076201616) {
                        throw new IllegalStateException();
                     }

                     if (Actor.method2743(var4, 1356161355) == 1683244579 * var4.idleSequence) {
                        var4.isUnanimated = true;
                     }
                  }
               }

               int var6 = 340712311 * var4.x >> 7;
               int var7 = -1747310679 * var4.y >> 7;
               if (0 <= var6) {
                  if (var3 <= 2076201616) {
                     return;
                  }

                  if (var6 < 104) {
                     if (var3 <= 2076201616) {
                        return;
                     }

                     if (0 <= var7) {
                        if (var3 <= 2076201616) {
                           throw new IllegalStateException();
                        }

                        if (var7 < 104) {
                           if (var3 <= 2076201616) {
                              throw new IllegalStateException();
                           }

                           long var8 = class236.calculateTag(0, 0, 0, 0, false, var4.index * -1903023775, var0.id * 577964535, -1329739818);
                           if (null != var4.model0) {
                              if (var3 <= 2076201616) {
                                 throw new IllegalStateException();
                              }

                              if (1759706017 * client.cycle >= -920595127 * var4.animationCycleStart) {
                                 if (var3 <= 2076201616) {
                                    return;
                                 }

                                 if (client.cycle * 1759706017 < var4.animationCycleEnd * 2063009467) {
                                    if (var3 <= 2076201616) {
                                       return;
                                    }

                                    var4.isUnanimated = false;
                                    var4.tileHeight = class67.method3009(
                                          var0, 340712311 * var4.x, var4.y * -1747310679, var5, var4.vmethod115(-717207724), -1857023604
                                       )
                                       * 1781013361;
                                    var4.playerCycle = client.cycle * 1910844849;
                                    var0.scene
                                       .addNullableObject(
                                          var5,
                                          var4.x * 340712311,
                                          -1747310679 * var4.y,
                                          var4.tileHeight * 781403537,
                                          60,
                                          var4,
                                          1777129311 * var4.rotation,
                                          var8,
                                          var4.minX * -1171013343,
                                          -512742895 * var4.minY,
                                          -483984693 * var4.maxX,
                                          var4.maxY * 536054477
                                       );
                                    return;
                                 }
                              }
                           }

                           if (64 == (340712311 * var4.x & 127)) {
                              if (var3 <= 2076201616) {
                                 throw new IllegalStateException();
                              }

                              if ((-1747310679 * var4.y & 127) == 64) {
                                 if (var3 <= 2076201616) {
                                    return;
                                 }

                                 if (client.viewportDrawCount * 424038787 == var0.tileLastDrawnActor[var6][var7]) {
                                    if (var3 <= 2076201616) {
                                       return;
                                    }

                                    return;
                                 }

                                 var0.tileLastDrawnActor[var6][var7] = client.viewportDrawCount * 424038787;
                              }
                           }

                           var4.tileHeight = class67.method3009(var0, 340712311 * var4.x, var4.y * -1747310679, var5, var4.vmethod115(-458299933), 1558970585)
                              * 1781013361;
                           var4.playerCycle = 1910844849 * client.cycle;
                           var0.scene
                              .method5503(
                                 var5,
                                 340712311 * var4.x,
                                 var4.y * -1747310679,
                                 781403537 * var4.tileHeight,
                                 60,
                                 var4,
                                 var4.rotation * 1777129311,
                                 var8,
                                 var4.isWalking
                              );
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "bk.jm(" + ')');
      }
   }
}
