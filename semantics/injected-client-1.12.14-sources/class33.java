import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bj")
public class class33 {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field204 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field201 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field203 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field205 = 1;
   @ObfuscatedName("pj")
   public static boolean field208;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field202 = 0;
   @ObfuscatedName("ak")
   int field200;
   @ObfuscatedName("ly")
   public boolean field198;
   @ObfuscatedName("no")
   public static boolean field207;
   @ObfuscatedName("aw")
   int field199;
   @ObfuscatedName("au")
   static short[][][] Tiles_underlays;
   @ToRemove(unused = "true")
   @ObfuscatedName("de")
   static final int field206 = 5;

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("jd")
   static final void worldToScreen(int var0, int var1, int var2, int var3, int var4) {
      try {
         SoundCache.setViewportShape(var0, var1, var2, var3, true, -1941494184);
         var0 = -1311789455 * client.viewportOffsetX;
         var1 = -2071412437 * client.viewportOffsetY;
         var2 = client.viewportWidth * 164941911;
         var3 = 620574401 * client.viewportHeight;
         Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
         Rasterizer3D.resetRasterClipping();
         Rasterizer2D.clearBrightness();
         int var5 = 1016118265 * client.camAngleX;
         if (client.field808 * -317552047 / 256 > var5) {
            if (var4 != -867112715) {
               throw new IllegalStateException();
            }

            var5 = -317552047 * client.field808 / 256;
         }

         if (client.field898[4]) {
            if (var4 != -867112715) {
               throw new IllegalStateException();
            }

            if (128 + client.field807[4] > var5) {
               if (var4 != -867112715) {
                  throw new IllegalStateException();
               }

               var5 = 128 + client.field807[4];
            }
         }

         int var6 = client.camAngleY * 1853484313 & 2047;
         int var7 = class40.oculusOrbFocalPointX * 605904631;
         int var8 = -971818949 * class289.oculusOrbFocalPointZ;
         int var9 = class4.oculusOrbFocalPointY * -1781017119;
         int var10 = GraphicsObject.method676(var5, (byte)61);
         int var12 = var3 - 334;
         if (var12 < 0) {
            if (var4 != -867112715) {
               throw new IllegalStateException();
            }

            var12 = 0;
         } else if (var12 > 100) {
            var12 = 100;
         }

         int var13 = client.zoomHeight + (client.zoomWidth - client.zoomHeight) * var12 / 100;
         int var11 = var13 * var10 / 256;
         var12 = 2048 - var5 & 2047;
         var13 = 2048 - var6 & 2047;
         int var14 = 0;
         int var15 = 0;
         int var16 = var11;
         if (0 != var12) {
            if (var4 != -867112715) {
               throw new IllegalStateException();
            }

            int var17 = Rasterizer3D.Rasterizer3D_sine[var12];
            int var18 = Rasterizer3D.Rasterizer3D_cosine[var12];
            int var19 = var15 * var18 - var17 * var11 >> 16;
            var16 = var18 * var11 + var17 * var15 >> 16;
            var15 = var19;
         }

         if (var13 != 0) {
            if (var4 != -867112715) {
               throw new IllegalStateException();
            }

            int var43 = Rasterizer3D.Rasterizer3D_sine[var13];
            int var48 = Rasterizer3D.Rasterizer3D_cosine[var13];
            int var53 = var16 * var43 + var48 * var14 >> 16;
            var16 = var16 * var48 - var14 * var43 >> 16;
            var14 = var53;
         }

         if (client.isCameraLocked) {
            if (var4 != -867112715) {
               throw new IllegalStateException();
            }

            WorldEntityConfig.field2402 = -561771131 * (var7 - var14);
            classPA.field4773 = (var8 - var15) * -327332311;
            RouteStrategy.field3430 = (var9 - var16) * -369138953;
            AsyncHttpResponse.field60 = 1868523425 * var5;
            classLI.field3694 = -28748421 * var6;
         } else {
            SpriteBufferProperties.cameraX = (var7 - var14) * 1830472763;
            ScriptFrame.cameraY = (var8 - var15) * -1583829257;
            class528.cameraZ = -393920913 * (var9 - var16);
            GraphicsObject.cameraPitch = -1628293179 * var5;
            WorldMapData_0.cameraYaw = -378222705 * var6;
         }

         if (client.oculusOrbState * -2124467559 == 1 && 427594063 * client.staffModLevel >= 2) {
            if (var4 != -867112715) {
               throw new IllegalStateException();
            }

            label688:
            if (0 == 1759706017 * client.cycle % 50) {
               if (var4 != -867112715) {
                  return;
               }

               if (605904631 * class40.oculusOrbFocalPointX >> 7 == class330.localPlayer.x * 340712311 >> 7) {
                  if (var4 != -867112715) {
                     throw new IllegalStateException();
                  }

                  if (-1781017119 * class4.oculusOrbFocalPointY >> 7 == class330.localPlayer.y * -1747310679 >> 7) {
                     break label688;
                  }

                  if (var4 != -867112715) {
                     throw new IllegalStateException();
                  }
               }

               int var44 = class330.localPlayer.plane * -2060016843;
               int var49 = (class40.oculusOrbFocalPointX * 605904631 >> 7) + Occluder.topLevelWorldView.baseX * 825809917;
               int var54 = (-1781017119 * class4.oculusOrbFocalPointY >> 7) + Occluder.topLevelWorldView.baseY * 1279964673;
               classEM.method3786(var49, var54, var44, true, 747168469);
            }
         }

         if (!client.isCameraLocked) {
            if (var4 != -867112715) {
               throw new IllegalStateException();
            }

            if (class468.clientPreferences.isRoofsHidden(1047034109)) {
               if (var4 != -867112715) {
                  throw new IllegalStateException();
               }

               var12 = Occluder.topLevelWorldView.plane * 2115028565;
            } else {
               label673: {
                  label672: {
                     label706: {
                        var13 = 3;
                        var14 = -361115983 * client.field828 >> 7;
                        var15 = -291215063 * client.field674 >> 7;
                        if (-1593954547 * GraphicsObject.cameraPitch < 310) {
                           if (var4 != -867112715) {
                              return;
                           }

                           int var45;
                           if (-2124467559 * client.oculusOrbState == 1) {
                              if (var4 != -867112715) {
                                 throw new IllegalStateException();
                              }

                              var16 = 605904631 * class40.oculusOrbFocalPointX >> 7;
                              var45 = -1781017119 * class4.oculusOrbFocalPointY >> 7;
                           } else {
                              var16 = var14;
                              var45 = var15;
                           }

                           int var50 = SpriteBufferProperties.cameraX * -201184013 >> 7;
                           int var55 = 1084219535 * class528.cameraZ >> 7;
                           if (var50 < 0 || 104 <= var50 || var55 < 0) {
                              break label706;
                           }

                           if (var4 != -867112715) {
                              throw new IllegalStateException();
                           }

                           if (104 <= var55) {
                              break label706;
                           }

                           if (var16 < 0 || 104 <= var16) {
                              break label672;
                           }

                           if (var4 != -867112715) {
                              throw new IllegalStateException();
                           }

                           if (var45 < 0) {
                              break label672;
                           }

                           if (var4 != -867112715) {
                              return;
                           }

                           if (104 <= var45) {
                              if (var4 != -867112715) {
                                 throw new IllegalStateException();
                              }
                              break label672;
                           }

                           if ((Occluder.topLevelWorldView.tileSettings[Occluder.topLevelWorldView.plane * 2115028565][var50][var55] & 4) != 0) {
                              var13 = 2115028565 * Occluder.topLevelWorldView.plane;
                           }

                           int var20;
                           if (var16 > var50) {
                              if (var4 != -867112715) {
                                 throw new IllegalStateException();
                              }

                              var20 = var16 - var50;
                           } else {
                              var20 = var50 - var16;
                           }

                           int var21;
                           if (var45 > var55) {
                              var21 = var45 - var55;
                           } else {
                              var21 = var55 - var45;
                           }

                           if (var20 > var21) {
                              int var22 = 65536 * var21 / var20;
                              int var23 = 32768;

                              while (var50 != var16) {
                                 if (var4 != -867112715) {
                                    throw new IllegalStateException();
                                 }

                                 if (var50 < var16) {
                                    if (var4 != -867112715) {
                                       return;
                                    }

                                    var50++;
                                 } else if (var50 > var16) {
                                    var50--;
                                 }

                                 if ((Occluder.topLevelWorldView.tileSettings[Occluder.topLevelWorldView.plane * 2115028565][var50][var55] & 4) != 0) {
                                    if (var4 != -867112715) {
                                       throw new IllegalStateException();
                                    }

                                    var13 = 2115028565 * Occluder.topLevelWorldView.plane;
                                 }

                                 var23 += var22;
                                 if (var23 >= 65536) {
                                    if (var4 != -867112715) {
                                       throw new IllegalStateException();
                                    }

                                    var23 -= 65536;
                                    if (var55 < var45) {
                                       if (var4 != -867112715) {
                                          throw new IllegalStateException();
                                       }

                                       var55++;
                                    } else if (var55 > var45) {
                                       if (var4 != -867112715) {
                                          throw new IllegalStateException();
                                       }

                                       var55--;
                                    }

                                    if (0 != (Occluder.topLevelWorldView.tileSettings[Occluder.topLevelWorldView.plane * 2115028565][var50][var55] & 4)) {
                                       if (var4 != -867112715) {
                                          throw new IllegalStateException();
                                       }

                                       var13 = Occluder.topLevelWorldView.plane * 2115028565;
                                    }
                                 }
                              }
                           } else if (var21 > 0) {
                              if (var4 != -867112715) {
                                 throw new IllegalStateException();
                              }

                              int var64 = var20 * 65536 / var21;
                              int var69 = 32768;

                              while (var45 != var55) {
                                 if (var4 != -867112715) {
                                    return;
                                 }

                                 if (var55 < var45) {
                                    var55++;
                                 } else if (var55 > var45) {
                                    if (var4 != -867112715) {
                                       return;
                                    }

                                    var55--;
                                 }

                                 if ((Occluder.topLevelWorldView.tileSettings[2115028565 * Occluder.topLevelWorldView.plane][var50][var55] & 4) != 0) {
                                    if (var4 != -867112715) {
                                       throw new IllegalStateException();
                                    }

                                    var13 = Occluder.topLevelWorldView.plane * 2115028565;
                                 }

                                 var69 += var64;
                                 if (var69 >= 65536) {
                                    if (var4 != -867112715) {
                                       return;
                                    }

                                    var69 -= 65536;
                                    if (var50 < var16) {
                                       if (var4 != -867112715) {
                                          throw new IllegalStateException();
                                       }

                                       var50++;
                                    } else if (var50 > var16) {
                                       if (var4 != -867112715) {
                                          throw new IllegalStateException();
                                       }

                                       var50--;
                                    }

                                    if (0 != (Occluder.topLevelWorldView.tileSettings[Occluder.topLevelWorldView.plane * 2115028565][var50][var55] & 4)) {
                                       if (var4 != -867112715) {
                                          throw new IllegalStateException();
                                       }

                                       var13 = 2115028565 * Occluder.topLevelWorldView.plane;
                                    }
                                 }
                              }
                           }
                        }

                        if (var14 >= 0) {
                           if (var4 != -867112715) {
                              throw new IllegalStateException();
                           }

                           if (104 > var14) {
                              if (var4 != -867112715) {
                                 throw new IllegalStateException();
                              }

                              if (var15 >= 0) {
                                 if (var4 != -867112715) {
                                    throw new IllegalStateException();
                                 }

                                 if (104 > var15) {
                                    if ((Occluder.topLevelWorldView.tileSettings[2115028565 * Occluder.topLevelWorldView.plane][var14][var15] & 4) != 0) {
                                       if (var4 != -867112715) {
                                          return;
                                       }

                                       var13 = 2115028565 * Occluder.topLevelWorldView.plane;
                                    }

                                    var12 = var13;
                                    break label673;
                                 }

                                 if (var4 != -867112715) {
                                    throw new IllegalStateException();
                                 }
                              }
                           }
                        }

                        var12 = Occluder.topLevelWorldView.plane * 2115028565;
                        break label673;
                     }

                     var12 = Occluder.topLevelWorldView.plane * 2115028565;
                     break label673;
                  }

                  var12 = Occluder.topLevelWorldView.plane * 2115028565;
               }
            }

            var11 = var12;
         } else {
            var11 = ArchiveLoader.method2861((byte)-25);
         }

         var12 = -201184013 * SpriteBufferProperties.cameraX;
         var13 = ScriptFrame.cameraY * 2001367751;
         var14 = class528.cameraZ * 1084219535;
         var15 = GraphicsObject.cameraPitch * -1593954547;
         var16 = 197556079 * WorldMapData_0.cameraYaw;

         for (int var46 = 0; var46 < 5; var46++) {
            if (var4 != -867112715) {
               return;
            }

            if (client.field898[var46]) {
               if (var4 != -867112715) {
                  return;
               }

               int var51 = (int)(
                  Math.random() * (1 + 2 * client.field899[var46])
                     - client.field899[var46]
                     + Math.sin(client.field901[var46] / 100.0 * client.field859[var46]) * client.field807[var46]
               );
               if (var46 == 0) {
                  if (var4 != -867112715) {
                     throw new IllegalStateException();
                  }

                  SpriteBufferProperties.cameraX += var51 * 1830472763;
               }

               if (1 == var46) {
                  ScriptFrame.cameraY += -1583829257 * var51;
               }

               if (2 == var46) {
                  if (var4 != -867112715) {
                     return;
                  }

                  class528.cameraZ += var51 * -393920913;
               }

               if (var46 == 3) {
                  if (var4 != -867112715) {
                     throw new IllegalStateException();
                  }

                  WorldMapData_0.cameraYaw = -378222705 * (var51 + 197556079 * WorldMapData_0.cameraYaw & 2047);
               }

               if (var46 == 4) {
                  if (var4 != -867112715) {
                     throw new IllegalStateException();
                  }

                  GraphicsObject.cameraPitch += var51 * -1628293179;
                  if (GraphicsObject.cameraPitch * -1593954547 < 128) {
                     if (var4 != -867112715) {
                        throw new IllegalStateException();
                     }

                     GraphicsObject.cameraPitch = 2031870592;
                  }

                  if (-1593954547 * GraphicsObject.cameraPitch > 383) {
                     if (var4 != -867112715) {
                        return;
                     }

                     GraphicsObject.cameraPitch = -866029637;
                  }
               }
            }
         }

         label608: {
            int var47 = 1856325427 * MouseHandler.MouseHandler_x;
            int var52 = -1427762751 * MouseHandler.MouseHandler_y;
            if (var47 >= var0) {
               if (var4 != -867112715) {
                  throw new IllegalStateException();
               }

               if (var47 < var2 + var0) {
                  if (var4 != -867112715) {
                     return;
                  }

                  if (var52 >= var1) {
                     if (var4 != -867112715) {
                        throw new IllegalStateException();
                     }

                     if (var52 < var3 + var1) {
                        if (var4 != -867112715) {
                           return;
                        }

                        int var56 = var47 - var0;
                        int var58 = var52 - var1;
                        ViewportMouse.ViewportMouse_x = 1842922905 * var56;
                        ViewportMouse.ViewportMouse_y = -1355707421 * var58;
                        ViewportMouse.ViewportMouse_isInViewport = true;
                        ViewportMouse.ViewportMouse_entityCount = 0;
                        ViewportMouse.ViewportMouse_entityTags[0] = -1L;
                        ViewportMouse.field3480[0] = Integer.MAX_VALUE;
                        ViewportMouse.ViewportMouse_false0 = false;
                        Iterator var60 = client.worldViewManager.iterator();

                        while (true) {
                           if (!var60.hasNext()) {
                              break label608;
                           }

                           if (var4 != -867112715) {
                              throw new IllegalStateException();
                           }

                           WorldView var65 = (WorldView)var60.next();
                           var65.scene.method5632(2115028565 * var65.plane, var47 - var0, var52 - var1);
                        }
                     }
                  }
               }
            }

            classFT.method4125(-1308175271);
         }

         HttpRequestTask.method93(-1037722482);
         client.method2437(var0, var1, var2, var3, 0);
         HttpRequestTask.method93(462652253);
         int var57 = Rasterizer3D.get3dZoom();
         Rasterizer3D.method5817(SecureUrlRequester.client.field242);
         Rasterizer3D.clips.zoom = 1624872185 * client.viewportZoom;
         TileRenderMode var10000;
         if (-1 == client.currentWorldViewId * 1201323213) {
            if (var4 != -867112715) {
               throw new IllegalStateException();
            }

            var10000 = TileRenderMode.field3137;
         } else {
            var10000 = TileRenderMode.field3138;
         }

         TileRenderMode var59 = var10000;
         Occluder.topLevelWorldView.scene.method5575(var59);
         Occluder.topLevelWorldView
            .scene
            .draw(
               -201184013 * SpriteBufferProperties.cameraX,
               ScriptFrame.cameraY * 2001367751,
               1084219535 * class528.cameraZ,
               GraphicsObject.cameraPitch * -1593954547,
               197556079 * WorldMapData_0.cameraYaw,
               var11,
               -361115983 * client.field828,
               -291215063 * client.field674,
               client.isCameraLocked
            );
         SecureRandomCallable.method1380(2026536314);
         Rasterizer3D.method5817(false);
         if (client.z) {
            if (var4 != -867112715) {
               return;
            }

            Rasterizer2D.adjustBrightness();
         }

         Rasterizer3D.clips.zoom = var57;
         HttpRequestTask.method93(1029676782);
         Varcs.method3165(Occluder.topLevelWorldView, var0, var1, var2, var3, (byte)80);

         for (int var61 = 0; var61 < Occluder.topLevelWorldView.field1314.method10502(-1806976554); var61++) {
            if (var4 != -867112715) {
               return;
            }

            WorldEntity var66 = (WorldEntity)Occluder.topLevelWorldView
               .worldEntities
               .get((long)Occluder.topLevelWorldView.field1314.method10498(var61, (byte)31));
            if (var66 != null) {
               if (var4 != -867112715) {
                  throw new IllegalStateException();
               }

               Varcs.method3165(var66.worldView, var0, var1, var2, var3, (byte)-9);
            }
         }

         if (client.hintArrow.method8736(1945711579) == 2) {
            WorldView var62 = WorldViewManager.method2912(
               client.worldViewManager, client.hintArrow.method8743(-526772361), HintArrow.method8745(client.hintArrow, 670254771), 400181261
            );
            int var67 = (client.hintArrow.method8743(-276396310) - 825809917 * var62.baseX << 7) + client.hintArrow.method8749(1131735270);
            int var70 = (HintArrow.method8745(client.hintArrow, 670254771) - var62.baseY * 1279964673 << 7) + client.hintArrow.method8752(-192119570);
            int var24 = client.hintArrow.method8757(-31080751) * 2;
            classFR.method4051(var62, var67, var70, var24, 0, -93464466);
            if (-1259541623 * client.viewportTempX > -1 && 1759706017 * client.cycle % 20 < 10) {
               SceneTilePaint.headIconHintSprites[0].method12650(var0 + client.viewportTempX * -1259541623 - 12, var1 + -604800983 * client.viewportTempY - 28);
            }
         }

         class431.method9226(var0, var1, (byte)20);
         TextureProvider.method6463((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader, client.graphicsCycle * -1533995753, (byte)-28);
         client.field668 = 0;
         int var63 = Occluder.topLevelWorldView.baseX * 825809917 + (340712311 * class330.localPlayer.x >> 7);
         int var68 = (class330.localPlayer.y * -1747310679 >> 7) + Occluder.topLevelWorldView.baseY * 1279964673;
         if (var63 >= 3053) {
            if (var4 != -867112715) {
               throw new IllegalStateException();
            }

            if (var63 <= 3156) {
               if (var4 != -867112715) {
                  throw new IllegalStateException();
               }

               if (var68 >= 3056 && var68 <= 3136) {
                  if (var4 != -867112715) {
                     throw new IllegalStateException();
                  }

                  client.field668 = 769481721;
               }
            }
         }

         if (var63 >= 3072) {
            if (var4 != -867112715) {
               throw new IllegalStateException();
            }

            if (var63 <= 3118) {
               if (var4 != -867112715) {
                  return;
               }

               if (var68 >= 9492) {
                  if (var4 != -867112715) {
                     throw new IllegalStateException();
                  }

                  if (var68 <= 9535) {
                     if (var4 != -867112715) {
                        throw new IllegalStateException();
                     }

                     client.field668 = 769481721;
                  }
               }
            }
         }

         if (1 == 106722889 * client.field668) {
            if (var4 != -867112715) {
               throw new IllegalStateException();
            }

            if (var63 >= 3139) {
               if (var4 != -867112715) {
                  throw new IllegalStateException();
               }

               if (var63 <= 3199 && var68 >= 3008) {
                  if (var4 != -867112715) {
                     throw new IllegalStateException();
                  }

                  if (var68 <= 3062) {
                     if (var4 != -867112715) {
                        throw new IllegalStateException();
                     }

                     client.field668 = 0;
                  }
               }
            }
         }

         SpriteBufferProperties.cameraX = 1830472763 * var12;
         ScriptFrame.cameraY = -1583829257 * var13;
         class528.cameraZ = var14 * -393920913;
         GraphicsObject.cameraPitch = -1628293179 * var15;
         WorldMapData_0.cameraYaw = var16 * -378222705;
         if (client.isLoading) {
            if (var4 != -867112715) {
               throw new IllegalStateException();
            }

            if (JagNetThread.method9263(VarbitComposition.field2488, true, false, 1631254210) == 0) {
               if (var4 != -867112715) {
                  throw new IllegalStateException();
               }

               client.isLoading = false;
            }
         }

         if (client.isLoading) {
            if (var4 != -867112715) {
               throw new IllegalStateException();
            }

            client.method2437(var0, var1, var2, var3, 0);
            HttpMethod.drawLoadingMessage(Strings.field4864, false, -796672841);
         }
      } catch (RuntimeException var25) {
         throw RestClientThreadFactory.newRunException(var25, "bj.jd(" + ')');
      }
   }

   class33(int var1, int var2) {
      this.field198 = field208;
      this.field200 = var1 * 2081915787;
      this.field199 = var2 * 1974928975;
   }

   @ObfuscatedSignature(descriptor = "(Lbs;)V")
   @ObfuscatedName("jy")
   public void method661(classBS var1) {
      field207 = this.field198;
   }

   @ObfuscatedSignature(descriptor = "(Lbs;)Z")
   @ObfuscatedName("at")
   boolean method655(classBS var1) {
      if (var1 == null) {
         return false;
      } else {
         switch (-844395485 * this.field200) {
            case 1:
               return var1.vmethod96(this.field199 * -621391697, 233789377);
            case 2:
               return var1.vmethod98(-621391697 * this.field199, (byte)-59);
            case 3:
               return var1.vmethod91((char)(-621391697 * this.field199), (byte)-109);
            case 4:
               return var1.vmethod92(this.field199 * -621391697 == 1, 588242873);
            default:
               return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lr")
   static void addCancelMenuEntry(int var0) {
      try {
         classGP.method4262((byte)84);
         client.menu.menuWorldViewIds[0] = -1;
         client.menu.menuActions[0] = Strings.field5137;
         client.menu.menuTargets[0] = "";
         client.menu.menuOpcodes[0] = 1006;
         client.menu.menuShiftClick[0] = false;
         client.menu.subMenus[0] = null;
         client.menu.field6552 = 849057531;
         client.menu.method12397(-1);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "bj.lr(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Lxy;")
   @ObfuscatedName("av")
   static PrivateChatMode[] method654(int var0) {
      try {
         return new PrivateChatMode[]{PrivateChatMode.field6651, PrivateChatMode.field6652, PrivateChatMode.field6653};
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "bj.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ag")
   public static int method657(int var0, int var1) {
      try {
         return classUS.field6100[var0 & 16383];
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "bj.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbs;)V")
   @ObfuscatedName("he")
   public void method660(classBS var1) {
      field207 = false;
   }

   @ObfuscatedSignature(descriptor = "(Lbs;I)Z")
   @ObfuscatedName("av")
   boolean method656(classBS var1, int var2) {
      this.method661(var1);

      try {
         if (var1 == null) {
            this.method660(var1);
            return false;
         } else {
            switch (-844395485 * this.field200) {
               case 1:
                  boolean var6 = var1.vmethod96(this.field199 * -621391697, -1696349320);
                  this.method660(var1);
                  return var6;
               case 2:
                  boolean var5 = var1.vmethod98(-621391697 * this.field199, (byte)63);
                  this.method660(var1);
                  return var5;
               case 3:
                  boolean var4 = var1.vmethod91((char)(-621391697 * this.field199), (byte)-128);
                  this.method660(var1);
                  return var4;
               case 4:
                  boolean var10001;
                  if (this.field199 * -621391697 == 1) {
                     if (var2 >= 957015666) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  boolean var10000 = var1.vmethod92(var10001, -885160198);
                  this.method660(var1);
                  return var10000;
               default:
                  this.method660(var1);
                  return false;
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bj.av(" + ')');
      }
   }
}
