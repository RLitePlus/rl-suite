import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lg")
public class WorldMapSectionType implements Enum {
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field3672 = 6;
   @ObfuscatedName("ae")
   final int type;
   @ObfuscatedSignature(descriptor = "Llg;")
   @ObfuscatedName("ag")
   static final WorldMapSectionType WORLDMAPSECTIONTYPE2 = new WorldMapSectionType(1, (byte)2);
   @ObfuscatedSignature(descriptor = "Llg;")
   @ObfuscatedName("an")
   static final WorldMapSectionType WORLDMAPSECTIONTYPE3 = new WorldMapSectionType(3, (byte)3);
   @ObfuscatedSignature(descriptor = "Llg;")
   @ObfuscatedName("at")
   static final WorldMapSectionType WORLDMAPSECTIONTYPE1 = new WorldMapSectionType(2, (byte)1);
   @ObfuscatedName("aj")
   final byte id;
   @ObfuscatedSignature(descriptor = "Llg;")
   @ObfuscatedName("av")
   static final WorldMapSectionType WORLDMAPSECTIONTYPE0 = new WorldMapSectionType(0, (byte)0);
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field3671 = 13;
   @ObfuscatedName("ab")
   static int[] Tiles_hue;
   @ToRemove(unused = "true")
   @ObfuscatedName("ck")
   static final int field3676 = 1013;
   @ToRemove(unused = "true")
   @ObfuscatedName("bv")
   static final int field3675 = 249;
   @ToRemove(unused = "true")
   @ObfuscatedName("bq")
   public static final int field3674 = 300;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   public static final int field3673 = 35;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.id;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.id;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lg.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("hz")
   static void updateGameState(int var0, byte var1) {
      try {
         if (1271535343 * client.gameState == var0) {
            if (var1 != 45) {
               throw new IllegalStateException();
            }
         } else {
            if (30 == 1271535343 * client.gameState) {
               client.widgetFocusInputManager.method6358(1289335265);
            }

            if (1271535343 * client.gameState == 0) {
               if (var1 != 45) {
                  throw new IllegalStateException();
               }

               GameEngine.method813(SecureUrlRequester.client, 1501290785);
            }

            label165: {
               if (20 != var0) {
                  if (var1 != 45) {
                     return;
                  }

                  if (var0 != 40) {
                     if (var1 != 45) {
                        throw new IllegalStateException();
                     }

                     if (45 != var0) {
                        if (var1 != 45) {
                           throw new IllegalStateException();
                        }

                        if (50 != var0) {
                           break label165;
                        }

                        if (var1 != 45) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }

               NpcOverrides.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION, 1997907614);
               client.field732 = 0;
               client.field866 = 0;
               client.timer.method8699(var0, 1573036037);
               if (20 != var0) {
                  if (var1 != 45) {
                     throw new IllegalStateException();
                  }

                  classFR.method4050(false, 1616941148);
               }
            }

            if (var0 != 20 && var0 != 40 && null != FadeInTask.field5856) {
               if (var1 != 45) {
                  throw new IllegalStateException();
               }

               FadeInTask.field5856.close(-1883200549);
               FadeInTask.field5856 = null;
            }

            if (client.gameState * 1271535343 == 25) {
               if (var1 != 45) {
                  throw new IllegalStateException();
               }

               client.field739 = 0;
               client.field736 = 0;
               client.field737 = -328869223;
               client.field799 = 0;
               client.field871 = 1591752961;
            }

            label174: {
               if (var0 != 5) {
                  if (var1 != 45) {
                     throw new IllegalStateException();
                  }

                  if (var0 != 10) {
                     if (var0 == 20) {
                        if (var1 != 45) {
                           throw new IllegalStateException();
                        }

                        int var5 = 1271535343 * client.gameState == 11 ? 4 : 0;
                        HttpResponse.method139(HttpRequestTask.archive10, class147.archive8, ApproximateRouteStrategy.field106, false, var5, -1917962351);
                     } else if (var0 == 11) {
                        HttpResponse.method139(HttpRequestTask.archive10, class147.archive8, ApproximateRouteStrategy.field106, false, 4, -2108274334);
                     } else if (var0 == 50) {
                        if (var1 != 45) {
                           throw new IllegalStateException();
                        }

                        class525.setLoginResponseString("", "Updating date of birth...", "", (byte)1);
                        HttpResponse.method139(HttpRequestTask.archive10, class147.archive8, ApproximateRouteStrategy.field106, false, 7, 563955105);
                     } else if (0 != var0) {
                        if (!class217.clearLoginScreen) {
                           if (var1 != 45) {
                              throw new IllegalStateException();
                           }
                        } else {
                           class208.titleboxSprite = null;
                           World.titlebuttonSprite = null;
                           DirectByteArrayCopier.runesSprite = null;
                           class560.leftTitleSprite = null;
                           client.method2471(-1);
                           WorldMapData_1.rightTitleSprite = null;
                           client.method2484(-1);
                           class50.logoSprite = null;
                           FadeOutTask.title_muteSprite = null;
                           class456.options_buttons_0Sprite = null;
                           WidgetConfigNode.options_buttons_2Sprite = null;
                           class461.worldSelectBackSprites = null;
                           class107.worldSelectFlagSprites = null;
                           MoveSpeed.worldSelectArrows = null;
                           class148.worldSelectStars = null;
                           ModelData0.field3492 = null;
                           LoginScreenAnimation.method1321(class204.loginScreenRunesAnimation, -436034096);
                           classGK.method4244(0, 100, 611860577);
                           Script.method2880((short)-2262).method9232(true, -993857280);
                           class217.clearLoginScreen = false;
                        }
                     }
                     break label174;
                  }

                  if (var1 != 45) {
                     throw new IllegalStateException();
                  }
               }

               boolean var10000;
               if (class468.clientPreferences.getEULA((byte)-66) >= 744188887 * client.field715) {
                  if (var1 != 45) {
                     throw new IllegalStateException();
                  }

                  var10000 = 1;
               } else {
                  var10000 = 0;
               }

               boolean var2 = (boolean)var10000;
               if (var2) {
                  if (var1 != 45) {
                     throw new IllegalStateException();
                  }

                  var10000 = 0;
               } else {
                  var10000 = 12;
               }

               byte var3 = var10000;
               HttpResponse.method139(HttpRequestTask.archive10, class147.archive8, ApproximateRouteStrategy.field106, true, var3, -1412508735);
            }

            client.gameState = var0 * 1495390223;
            client.method2039(-1);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "lg.hz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("aj")
   static final void method7177(String var0, int var1) {
      try {
         SwapSongTask.method10270(var0 + Strings.field5039, (byte)8);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lg.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.id;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.id;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Lcu;")
   @ObfuscatedName("at")
   static Script getWorldMapScript(int var0, int var1, int var2, int var3) {
      try {
         int var4 = (var1 << 8) + var0;
         Script var6 = EnumComposition.getScript(var4, var0, 1410068873);
         if (var6 != null) {
            if (var3 >= -1875787528) {
               throw new IllegalStateException();
            } else {
               return var6;
            }
         } else {
            int var5 = classTR.method10800(var2, var0, (byte)26);
            var6 = EnumComposition.getScript(var5, var0, -724854240);
            if (var6 != null) {
               if (var3 >= -1875787528) {
                  throw new IllegalStateException();
               } else {
                  return var6;
               }
            } else {
               var5 = class341.method7848(var0, (byte)49);
               var6 = EnumComposition.getScript(var5, var0, -1857491782);
               return null != var6 ? var6 : null;
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "lg.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIII)Lrx;")
   @ObfuscatedName("kr")
   static ProjectionCoord method7179(WorldView var0, int var1, int var2, int var3, int var4) {
      try {
         int var5 = var1 * 128;
         int var6 = 128 * var2;
         ProjectionCoord var7 = FaceNormal.method6214(var5, var0.tileHeights[var3][var1][var2], var6, 83981978);
         ProjectionCoord var8 = FaceNormal.method6214(var5 + 128, var0.tileHeights[var3][var1 + 1][var2], var6, -1146455000);
         ProjectionCoord var9 = FaceNormal.method6214(128 + var5, var0.tileHeights[var3][1 + var1][1 + var2], 128 + var6, -1458817235);
         ProjectionCoord var10 = FaceNormal.method6214(var5, var0.tileHeights[var3][var1][1 + var2], var6 + 128, -863251620);
         if (var8.z == var7.z) {
            if (var4 == -2080513522) {
               throw new IllegalStateException();
            }

            if (var7.z == var9.z && var7.z == var10.z) {
               if (var4 == -2080513522) {
                  throw new IllegalStateException();
               }

               var7.release(-804947546);
               var8.release(-804947546);
               var9.release(-804947546);
               var10.release(-804947546);
               return ProjectionCoord.field5716;
            }
         }

         ProjectionCoord var12 = class30.method1304(var8, 742787141);
         var12.method9892(var7, 1902119957);
         ProjectionCoord var14 = class30.method1304(var10, 742787141);
         var14.method9892(var7, 1657246225);
         ProjectionCoord var15 = class451.method9731(var12, var14, (byte)1);
         var12.release(-804947546);
         var14.release(-804947546);
         ProjectionCoord var17 = class30.method1304(var8, 742787141);
         var17.method9892(var9, 1721222763);
         ProjectionCoord var19 = class30.method1304(var10, 742787141);
         var19.method9892(var9, 2090355101);
         ProjectionCoord var20 = class451.method9731(var19, var17, (byte)1);
         var17.release(-804947546);
         var19.release(-804947546);
         var7.release(-804947546);
         var8.release(-804947546);
         var9.release(-804947546);
         var10.release(-804947546);
         ProjectionCoord var22 = class30.method1304(var15, 742787141);
         var22.method9884(var20, (byte)-3);
         var15.release(-804947546);
         var20.release(-804947546);
         ProjectionCoord var24;
         synchronized (ProjectionCoord.field5722) {
            if (1970955523 * ProjectionCoord.field5720 == 0) {
               if (var4 == -2080513522) {
                  throw new IllegalStateException();
               }

               var24 = new ProjectionCoord();
            } else {
               ProjectionCoord.field5722[(ProjectionCoord.field5720 -= 1300180395) * 1970955523].method9878(1701153650);
               var24 = ProjectionCoord.field5722[1970955523 * ProjectionCoord.field5720];
            }
         }

         float var26 = 1.0F / var22.method9903((byte)-8);
         var24.x = var26 * var22.x;
         var24.z = var26 * var22.z;
         var24.y = var26 * var22.y;
         var22.release(-804947546);
         return var24;
      } catch (RuntimeException var28) {
         throw RestClientThreadFactory.newRunException(var28, "lg.kr(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;II)Z")
   @ObfuscatedName("av")
   public static boolean method7176(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
      try {
         byte[] var4 = AbstractArchive.method9044(var0, var2 >> 16 & 65535, var2 & 65535, -2053428314);
         if (var4 == null) {
            if (var3 != -1267610787) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            int var5 = (var4[1] & 255) << 8 | var4[2] & 255;
            byte[] var6 = AbstractArchive.method9044(var1, var5, 0, -2024685020);
            boolean var10000;
            if (var6 != null) {
               if (var3 != -1267610787) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "lg.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FI)F")
   @ObfuscatedName("ag")
   static final float method7174(float var0, int var1) {
      try {
         var0 = (var0 - 75.0F) * 1.0100503F;
         return 1.0100503F + 150.75377F / var0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "lg.ag(" + ')');
      }
   }

   WorldMapSectionType(int var1, byte var2) {
      this.type = var1 * -1509529761;
      this.id = var2;
   }
}
