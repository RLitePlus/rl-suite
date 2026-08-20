import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("by")
public class class40 {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field433 = -1;
   @ToRemove(unused = "true")
   @ObfuscatedName("dd")
   static final float field431 = 0.5F;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field432 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   static final int field434 = 38;
   @ObfuscatedName("pp")
   static int oculusOrbFocalPointX;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;Lxj;)V")
   @ObfuscatedName("aj")
   static void method1294(WorldEntity var0, PacketBuffer var1) {
      int var2 = var1.readUnsignedByte(1196641547);
      if (0 != (var2 & 1)) {
         int var3 = Buffer.method12008(var1, (byte)5);
         int var4 = var1.readUnsignedByte(-1262113767);
         if (65535 == var3) {
            byte var7 = -1;
            AnimationSequence.method10313(var0.field5966, var7, -1105177964);
            var0.field5966.method10332((byte)41);
            var0.field5968 = -1041917121 * var4;
         } else {
            label46: {
               SequenceDefinition var5 = AnimationSequence.method10318(var0.field5966, -1179724060);
               if (null != var5) {
                  if (var3 == var0.method10863(435334531)) {
                     int var6 = 564693013 * var5.restartMode;
                     if (var6 == 1) {
                        var0.field5966.method10332((byte)110);
                        var0.field5968 = -1041917121 * var4;
                     }

                     if (var6 == 2) {
                        var0.field5966.method10333((byte)20);
                     }
                     break label46;
                  }

                  if (ClientPacket.SequenceDefinition_get(var3, -1520528977).field2726 * -1808717695 < var5.field2726 * -1808717695) {
                     break label46;
                  }
               }

               AnimationSequence.method10313(var0.field5966, var3, 964913389);
               var0.field5966.method10332((byte)104);
               var0.field5968 = -1041917121 * var4;
            }
         }
      }

      if ((var2 & 2) != 0) {
         var0.method10849(var1.readUnsignedByte(16009207), (byte)1);
      }
   }

   class40() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;Lxj;I)V")
   @ObfuscatedName("an")
   static void method1292(WorldView var0, PacketBuffer var1, int var2) {
      int var3 = var1.readUnsignedByte(585921947);
      if (var3 < var0.field1314.method10502(-1711579365)) {
         for (int var4 = var3; var4 < var0.field1314.method10502(-1915351715); var4++) {
            int var5 = var0.field1314.method10498(var4, (byte)9);
            WorldView var6 = WorldViewManager.method2901(client.worldViewManager, var5, (byte)1);
            if (null != var6) {
               for (int var7 = 0; var7 < -2092959140 * client.playerUpdateManager.field1538; var7++) {
                  int var8 = client.playerUpdateManager.playerIndices[var7];
                  client.playerUpdateManager.method3657((Player)var6.npcs.get(var8), -592623601);
               }

               client.worldViewManager.removeWorldViewById(var5, -155551498);
            }

            WorldEntity var17 = (WorldEntity)var0.worldEntities.get((long)var5);
            if (var17 != null) {
               var17.remove();
            }
         }
      }

      if (var3 > var0.field1314.method10502(-1925909392)) {
         throw new RuntimeException("");
      } else {
         classSR.method10505(var0.field1314, -1488134002);
         WorldEntityCoord var14 = new WorldEntityCoord();

         for (int var15 = 0; var15 < var3; var15++) {
            int var18 = var0.field1314.method10498(var15, (byte)28);
            WorldEntity var20 = (WorldEntity)var0.worldEntities.get((long)var18);
            int var22 = var1.readUnsignedByte(-528418869);
            if (0 != var22) {
               var0.field1314.method10495(var18, (byte)-9);
               if (var22 != 1) {
                  var14.method6262(var20.method10837(-2118442908), -625126421);
                  byte var24 = Buffer.method12001(var1, (byte)1);
                  if (0 != var24) {
                     int var26 = HttpRequestTask.method83(var1, var24, 0, 2076569441);
                     int var28 = HttpRequestTask.method83(var1, var24, 2, -414182520);
                     int var12 = HttpRequestTask.method83(var1, var24, 4, 125405490);
                     int var13 = HttpRequestTask.method83(var1, var24, 6, -1151107650);
                     WorldEntityCoord.method6278(var14, var26, var28, var12, var13, (byte)64);
                  }

                  if (2 == var22) {
                     var20.method10869(var14, -1362188805);
                  } else {
                     WorldEntity.method10874(var20, var14, -34741077);
                  }
               }

               if (var2 >= 6) {
                  Fonts.method11308(var20, var1, (byte)2);
               }
            } else {
               WorldView var9 = WorldViewManager.method2901(client.worldViewManager, var18, (byte)1);
               if (null != var9) {
                  for (int var10 = 0; var10 < client.playerUpdateManager.field1538 * 1320060371; var10++) {
                     int var11 = client.playerUpdateManager.playerIndices[var10];
                     client.playerUpdateManager.method3657((Player)var9.npcs.get(var11), -263069168);
                  }

                  client.worldViewManager.removeWorldViewById(var18, 1296641003);
               }

               if (null != var20) {
                  var20.remove();
               }
            }
         }

         while (var1.bitsRemaining(1059946106 * client.packetWriter.serverPacketLength, 1635524350) > 0) {
            int var16 = Buffer.method12008(var1, (byte)5);
            var0.field1314.method10495(var16, (byte)-67);
            int var19 = var1.readUnsignedByte(-1371656632);
            int var21 = var1.readUnsignedByte(-130919953);
            int var23 = var19 * 8;
            int var25 = var21 * 8;
            WorldView var27 = classGT.method4366(var16, var23, var25, -1679068865);
            WorldEntity var29 = new WorldEntity(var16, var27);
            var0.worldEntities.put((Node)var29, (long)var16);
            var29.plane = -1403921783 * var16;
            var29.field5964 = -1524912752 * var0.id;
            var29.method10838(WorldMapRegion.method6991(var1.readShort((byte)-56), (byte)-103), 1522483384);
            LoginPacket.method4150(var1, var29.worldEntityCoord, 0, 0, (byte)-1);
            var29.method10869(var29.worldEntityCoord, -522295651);
            var29.method10848(
               (WorldEntityOwnerType)GrandExchangeOffer.findEnumerated(class85.method3474(1808372204), var1.readUnsignedByte(1935015245), (byte)1), 2067565025
            );
            if (var2 >= 6) {
               Fonts.method11308(var29, var1, (byte)2);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldd;Lxj;I)V")
   @ObfuscatedName("ag")
   static void method1293(WorldView var0, PacketBuffer var1, int var2) {
      int var3 = var1.readUnsignedByte(1157564937);
      if (var3 < var0.field1314.method10502(-1979262684)) {
         for (int var4 = var3; var4 < var0.field1314.method10502(-1733132364); var4++) {
            int var5 = var0.field1314.method10498(var4, (byte)115);
            WorldView var6 = WorldViewManager.method2901(client.worldViewManager, var5, (byte)1);
            if (null != var6) {
               for (int var7 = 0; var7 < 1320060371 * client.playerUpdateManager.field1538; var7++) {
                  int var8 = client.playerUpdateManager.playerIndices[var7];
                  client.playerUpdateManager.method3657((Player)var6.npcs.get(var8), -1856877484);
               }

               client.worldViewManager.removeWorldViewById(var5, 60369225);
            }

            WorldEntity var17 = (WorldEntity)var0.worldEntities.get((long)var5);
            if (var17 != null) {
               var17.remove();
            }
         }
      }

      if (var3 > var0.field1314.method10502(-2045512709)) {
         throw new RuntimeException("");
      } else {
         classSR.method10505(var0.field1314, -1016962369);
         WorldEntityCoord var14 = new WorldEntityCoord();

         for (int var15 = 0; var15 < var3; var15++) {
            int var18 = var0.field1314.method10498(var15, (byte)82);
            WorldEntity var20 = (WorldEntity)var0.worldEntities.get((long)var18);
            int var22 = var1.readUnsignedByte(638834483);
            if (0 != var22) {
               var0.field1314.method10495(var18, (byte)-89);
               if (var22 != 1) {
                  var14.method6262(var20.method10837(-881974809), 428760572);
                  byte var24 = Buffer.method12001(var1, (byte)123);
                  if (0 != var24) {
                     int var26 = HttpRequestTask.method83(var1, var24, 0, -18253243);
                     int var28 = HttpRequestTask.method83(var1, var24, 2, -370318090);
                     int var12 = HttpRequestTask.method83(var1, var24, 4, 1474162063);
                     int var13 = HttpRequestTask.method83(var1, var24, 6, -85825875);
                     WorldEntityCoord.method6278(var14, var26, var28, var12, var13, (byte)107);
                  }

                  if (2 == var22) {
                     var20.method10869(var14, -399192913);
                  } else {
                     WorldEntity.method10874(var20, var14, -803444566);
                  }
               }

               if (var2 >= 6) {
                  Fonts.method11308(var20, var1, (byte)2);
               }
            } else {
               WorldView var9 = WorldViewManager.method2901(client.worldViewManager, var18, (byte)1);
               if (null != var9) {
                  for (int var10 = 0; var10 < client.playerUpdateManager.field1538 * 1320060371; var10++) {
                     int var11 = client.playerUpdateManager.playerIndices[var10];
                     client.playerUpdateManager.method3657((Player)var9.npcs.get(var11), -1187256638);
                  }

                  client.worldViewManager.removeWorldViewById(var18, 721909825);
               }

               if (null != var20) {
                  var20.remove();
               }
            }
         }

         while (var1.bitsRemaining(253081433 * client.packetWriter.serverPacketLength, -1973137525) > 0) {
            int var16 = Buffer.method12008(var1, (byte)5);
            var0.field1314.method10495(var16, (byte)-91);
            int var19 = var1.readUnsignedByte(-929879390);
            int var21 = var1.readUnsignedByte(-1611944872);
            int var23 = var19 * 8;
            int var25 = var21 * 8;
            WorldView var27 = classGT.method4366(var16, var23, var25, -1953220989);
            WorldEntity var29 = new WorldEntity(var16, var27);
            var0.worldEntities.put((Node)var29, (long)var16);
            var29.plane = -1403921783 * var16;
            var29.field5964 = 162183745 * var0.id;
            var29.method10838(WorldMapRegion.method6991(var1.readShort((byte)-101), (byte)-119), -525628360);
            LoginPacket.method4150(var1, var29.worldEntityCoord, 0, 0, (byte)-1);
            var29.method10869(var29.worldEntityCoord, -926751512);
            var29.method10848(
               (WorldEntityOwnerType)GrandExchangeOffer.findEnumerated(class85.method3474(-1325252597), var1.readUnsignedByte(-606699552), (byte)1), 1880448791
            );
            if (var2 >= 6) {
               Fonts.method11308(var29, var1, (byte)2);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([Lof;IIIIIIIIIIII)V")
   @ObfuscatedName("me")
   static final void drawInterface(
      Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      client.method1739(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);

      try {
         Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
         Rasterizer3D.resetRasterClipping();

         for (int var13 = var1; var13 <= var2; var13++) {
            Widget var14 = var0[var13];
            if (var14 == null) {
               if (var12 != 1105137527) {
                  client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                  return;
               }
            } else {
               label880: {
                  if (var3 == var14.parentId * 794900977) {
                     if (var14.field4451 * 1865628485 == var4) {
                        break label880;
                     }

                     if (var12 != 1105137527) {
                        client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                        return;
                     }
                  }

                  if (var3 != -1412584499 || var14 != client.clickedWidget) {
                     continue;
                  }
               }

               int var15;
               if (var11 == -1) {
                  client.rootWidgetXs[client.rootWidgetCount * -1020775279] = var14.x * -814361553 + var9;
                  client.rootWidgetYs[-1020775279 * client.rootWidgetCount] = var14.y * -286860451 + var10;
                  client.rootWidgetWidths[client.rootWidgetCount * -1020775279] = var14.width * -1946208531;
                  client.rootWidgetHeights[client.rootWidgetCount * -1020775279] = var14.height * -905446999;
                  var15 = (client.rootWidgetCount += 1227492465) * -1020775279 - 1;
               } else {
                  var15 = var11;
               }

               var14.rootIndex = 1337068023 * var15;
               var14.cycle = 2118945039 * client.cycle;
               if (!var14.isIf3 || !class330.isComponentHidden(var14, (byte)-6)) {
                  if (var14.contentType * 1889823193 > 0) {
                     class88.method3125(var14, -1166894490);
                  }

                  int var16 = var9 + -814361553 * var14.x;
                  int var17 = var10 + var14.y * -286860451;
                  int var18 = var14.transparencyTop * -2090288859;
                  if (client.clickedWidget == var14) {
                     if (-1412584499 != var3 && !var14.isScrollBar) {
                        class66.field488 = var0;
                        DevicePcmPlayerProvider.field42 = var9 * -2029252573;
                        UserComparator3.field1559 = -1406789677 * var10;
                        continue;
                     }

                     if (client.isDraggingWidget && client.field855) {
                        int var19 = 1856325427 * MouseHandler.MouseHandler_x;
                        int var20 = MouseHandler.MouseHandler_y * -1427762751;
                        var19 -= client.widgetClickX * -87154783;
                        var20 -= client.widgetClickY * 1162132169;
                        if (var19 < client.field856 * 1023425591) {
                           var19 = 1023425591 * client.field856;
                        }

                        if (-1946208531 * var14.width + var19 > client.clickedWidgetParent.width * -1946208531 + 1023425591 * client.field856) {
                           if (var12 != 1105137527) {
                              client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                              return;
                           }

                           var19 = client.field856 * 1023425591 + client.clickedWidgetParent.width * -1946208531 - var14.width * -1946208531;
                        }

                        if (var20 < client.field727 * 1469945113) {
                           if (var12 != 1105137527) {
                              client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                              return;
                           }

                           var20 = client.field727 * 1469945113;
                        }

                        if (-905446999 * var14.height + var20 > client.field727 * 1469945113 + client.clickedWidgetParent.height * -905446999) {
                           var20 = client.clickedWidgetParent.height * -905446999 + 1469945113 * client.field727 - var14.height * -905446999;
                        }

                        var16 = var19;
                        var17 = var20;
                     }

                     if (!var14.isScrollBar) {
                        var18 = 128;
                     }
                  }

                  int var21;
                  int var22;
                  int var38;
                  int var40;
                  if (var14.type * 928687775 == 9) {
                     int var23 = var16;
                     int var24 = var17;
                     int var25 = var14.width * -1946208531 + var16;
                     int var26 = var17 + var14.height * -905446999;
                     if (var25 < var16) {
                        var23 = var25;
                        var25 = var16;
                     }

                     if (var26 < var17) {
                        if (var12 != 1105137527) {
                           client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                           return;
                        }

                        var24 = var26;
                        var26 = var17;
                     }

                     var25++;
                     var26++;
                     var38 = var23 > var5 ? var23 : var5;
                     var40 = var24 > var6 ? var24 : var6;
                     var21 = var25 < var7 ? var25 : var7;
                     var22 = var26 < var8 ? var26 : var8;
                  } else {
                     int var41 = var16 + var14.width * -1946208531;
                     int var53 = var14.height * -905446999 + var17;
                     var38 = var16 > var5 ? var16 : var5;
                     var40 = var17 > var6 ? var17 : var6;
                     var21 = var41 < var7 ? var41 : var7;
                     var22 = var53 < var8 ? var53 : var8;
                  }

                  if (var14.isIf3) {
                     if (var12 != 1105137527) {
                        client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                        return;
                     }

                     if (var38 >= var21 || var40 >= var22) {
                        continue;
                     }
                  }

                  if (0 != var14.contentType * 1889823193) {
                     if (var12 != 1105137527) {
                        client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                        return;
                     }

                     if (1336 == 1889823193 * var14.contentType) {
                        if (class468.clientPreferences.isDisplayingFps(756705879)) {
                           var17 += 15;
                           AbstractFont.method10407(
                              UserComparator5.fontPlain12, "Fps:" + client.fps * -789935841, var14.width * -1946208531 + var16, var17, 16776960, -1
                           );
                           var17 += 15;
                           Runtime var52 = Runtime.getRuntime();
                           int var61 = (int)((var52.totalMemory() - var52.freeMemory()) / 1024L);
                           int var69 = 16776960;
                           if (var61 > 327680) {
                              if (var12 != 1105137527) {
                                 client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                                 return;
                              }

                              if (!client.isLowDetail) {
                                 var69 = 16711680;
                              }
                           }

                           AbstractFont.method10407(UserComparator5.fontPlain12, "Mem:" + var61 + "k", var16 + -1946208531 * var14.width, var17, var69, -1);
                           var17 += 15;
                        }
                        continue;
                     }

                     if (1337 == var14.contentType * 1889823193) {
                        client.viewportX = 967755043 * var16;
                        client.viewportY = var17 * -1828920023;
                        class108.drawEntities(var16, var17, -1946208531 * var14.width, var14.height * -905446999, (byte)21);
                        client.validRootWidgets[321882055 * var14.rootIndex] = true;
                        Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
                        continue;
                     }

                     if (1338 == var14.contentType * 1889823193) {
                        class222.drawMinimap(var14, var16, var17, var15, (byte)100);
                        Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
                        continue;
                     }

                     if (1889823193 * var14.contentType == 1339) {
                        classGV.method4372(var14, var16, var17, var15, (byte)82);
                        Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
                        continue;
                     }

                     if (1400 == var14.contentType * 1889823193) {
                        Skills.worldMap
                           .method11437(
                              var16,
                              var17,
                              var14.width * -1946208531,
                              var14.height * -905446999,
                              client.cycle * 1759706017,
                              class468.clientPreferences.getBrightness(-457601331)
                           );
                     }

                     if (1401 == 1889823193 * var14.contentType) {
                        Skills.worldMap.drawOverview(var16, var17, var14.width * -1946208531, -905446999 * var14.height, 646714535);
                     }

                     if (var14.contentType * 1889823193 == 1402) {
                        LoginScreenAnimation.method1353(class204.loginScreenRunesAnimation, var16, 1759706017 * client.cycle, -597923252);
                     }
                  }

                  if (928687775 * var14.type == 0) {
                     if (!var14.isIf3) {
                        if (var12 != 1105137527) {
                           client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                           return;
                        }

                        if (class330.isComponentHidden(var14, (byte)-58) && var14 != class330.mousedOverWidgetIf1) {
                           if (var12 != 1105137527) {
                              client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                              return;
                           }
                           continue;
                        }
                     }

                     if (!var14.isIf3) {
                        if (var12 != 1105137527) {
                           client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                           return;
                        }

                        if (var14.scrollY * -497311503 > -1963554889 * var14.scrollHeight - var14.height * -905446999) {
                           var14.scrollY = var14.scrollHeight * -50253017 - var14.height * 351495225;
                        }

                        if (var14.scrollY * -497311503 < 0) {
                           var14.scrollY = 0;
                        }
                     }

                     drawInterface(
                        var0,
                        var14.field4453 * -1516264759,
                        -86298045 * var14.field4454,
                        278777747 * var14.id,
                        var14.childIndex * 2077538819,
                        var38,
                        var40,
                        var21,
                        var22,
                        var16 - 1068149169 * var14.scrollX,
                        var17 - -497311503 * var14.scrollY,
                        var15,
                        1105137527
                     );
                     if (var14.children != null) {
                        if (var12 != 1105137527) {
                           client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                           return;
                        }

                        drawInterface(
                           var14.children,
                           0,
                           var14.children.length - 1,
                           278777747 * var14.id,
                           -1,
                           var38,
                           var40,
                           var21,
                           var22,
                           var16 - 1068149169 * var14.scrollX,
                           var17 - var14.scrollY * -497311503,
                           var15,
                           1105137527
                        );
                     }

                     if (2077538819 * var14.childIndex == -1) {
                        InterfaceParent var42 = (InterfaceParent)client.interfaceParents.method8915(var14.id * 278777747);
                        if (var42 != null) {
                           class150.drawWidgets(var42.group * -1385287145, var38, var40, var21, var22, var16, var17, var15, (byte)20);
                        }
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
                     Rasterizer3D.resetRasterClipping();
                  } else if (11 == 928687775 * var14.type) {
                     if (class330.isComponentHidden(var14, (byte)-54) && var14 != class330.mousedOverWidgetIf1) {
                        continue;
                     }

                     if (null != var14.children) {
                        drawInterface(
                           var14.children,
                           0,
                           var14.children.length - 1,
                           var14.id * 278777747,
                           -1,
                           var38,
                           var40,
                           var21,
                           var22,
                           var16 - var14.scrollX * 1068149169,
                           var17 - var14.scrollY * -497311503,
                           var15,
                           1105137527
                        );
                     }

                     Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
                     Rasterizer3D.resetRasterClipping();
                  }

                  if (!client.isResizable) {
                     if (var12 != 1105137527) {
                        client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                        return;
                     }

                     if (!client.field880[var15]) {
                        if (var12 != 1105137527) {
                           client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                           return;
                        }

                        if (client.gameDrawingMode * -1637255475 <= 1) {
                           if (var12 != 1105137527) {
                              client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                              return;
                           }
                           continue;
                        }
                     }
                  }

                  if (928687775 * var14.type == 0) {
                     if (var12 != 1105137527) {
                        client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                        return;
                     }

                     if (!var14.isIf3 && var14.scrollHeight * -1963554889 > var14.height * -905446999) {
                        WorldMapScaleHandler.drawScrollBar(
                           var14.width * -1946208531 + var16,
                           var17,
                           var14.scrollY * -497311503,
                           var14.height * -905446999,
                           var14.scrollHeight * -1963554889,
                           946944204
                        );
                     }
                  }

                  if (1 != 928687775 * var14.type) {
                     if (3 == var14.type * 928687775) {
                        int var51;
                        if (class556.runCs1(var14, -1333135934)) {
                           if (var12 != 1105137527) {
                              client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                              return;
                           }

                           var51 = var14.color2 * -1402291999;
                           if (class330.mousedOverWidgetIf1 == var14 && 0 != var14.mouseOverColor2 * -2076474873) {
                              var51 = var14.mouseOverColor2 * -2076474873;
                           }
                        } else {
                           var51 = 7845467 * var14.color;
                           if (var14 == class330.mousedOverWidgetIf1 && 0 != 1479122145 * var14.mouseOverColor) {
                              var51 = 1479122145 * var14.mouseOverColor;
                           }
                        }

                        if (var14.fill) {
                           switch (var14.fillMode.field6495 * 451987283) {
                              case 1:
                                 Rasterizer2D.Rasterizer2D_fillRectangleGradient(
                                    var16, var17, var14.width * -1946208531, -905446999 * var14.height, var14.color * 7845467, var14.color2 * -1402291999
                                 );
                                 break;
                              case 2:
                                 Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(
                                    var16,
                                    var17,
                                    -1946208531 * var14.width,
                                    -905446999 * var14.height,
                                    var14.color * 7845467,
                                    -1402291999 * var14.color2,
                                    255 - (-2090288859 * var14.transparencyTop & 0xFF),
                                    255 - (-185564907 * var14.transparencyBot & 0xFF)
                                 );
                                 break;
                              default:
                                 if (var18 == 0) {
                                    Rasterizer2D.Rasterizer2D_fillRectangle(var16, var17, -1946208531 * var14.width, var14.height * -905446999, var51);
                                 } else {
                                    Rasterizer2D.Rasterizer2D_fillRectangleAlpha(
                                       var16, var17, -1946208531 * var14.width, var14.height * -905446999, var51, 256 - (var18 & 0xFF)
                                    );
                                 }
                           }
                        } else if (var18 == 0) {
                           Rasterizer2D.Rasterizer2D_drawRectangle(var16, var17, var14.width * -1946208531, var14.height * -905446999, var51);
                        } else {
                           Rasterizer2D.Rasterizer2D_drawRectangleAlpha(
                              var16, var17, var14.width * -1946208531, -905446999 * var14.height, var51, 256 - (var18 & 0xFF)
                           );
                        }
                     } else if (4 == 928687775 * var14.type) {
                        if (var12 != 1105137527) {
                           client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                           return;
                        }

                        Font var50 = var14.getFont(class226.widgetDefinition, -1094266041);
                        if (null == var50) {
                           if (Widget.field4598) {
                              class376.invalidateWidget(var14, (byte)5);
                           }
                        } else {
                           String var68 = var14.text;
                           int var60;
                           if (class556.runCs1(var14, -1333135934)) {
                              var60 = var14.color2 * -1402291999;
                              if (class330.mousedOverWidgetIf1 == var14 && 0 != var14.mouseOverColor2 * -2076474873) {
                                 if (var12 != 1105137527) {
                                    client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                                    return;
                                 }

                                 var60 = var14.mouseOverColor2 * -2076474873;
                              }

                              if (!var14.text2.isEmpty()) {
                                 var68 = var14.text2;
                              }
                           } else {
                              var60 = var14.color * 7845467;
                              if (var14 == class330.mousedOverWidgetIf1 && var14.mouseOverColor * 1479122145 != 0) {
                                 var60 = var14.mouseOverColor * 1479122145;
                              }
                           }

                           if (var14.isIf3 && -1 != -231674939 * var14.itemId) {
                              if (var12 != 1105137527) {
                                 client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                                 return;
                              }

                              ItemComposition var80 = class150.ItemDefinition_get(var14.itemId * -231674939, -757204811);
                              var68 = var80.name;
                              if (var68 == null) {
                                 var68 = Strings.field4861;
                              }

                              if ((var80.isStackable * 1515235515 == 1 || 1 != var14.itemQuantity * 1070452379) && -1 != 1070452379 * var14.itemQuantity) {
                                 var68 = class144.colorStartTag(16748608, -1232315636)
                                    + var68
                                    + classDF.field1352
                                    + " "
                                    + 'x'
                                    + class4.formatItemStacks(1070452379 * var14.itemQuantity, (byte)-61);
                              }
                           }

                           if (client.meslayerContinueWidget == var14) {
                              var68 = Strings.field5028;
                              var60 = var14.color * 7845467;
                           }

                           if (!var14.isIf3) {
                              if (var12 != 1105137527) {
                                 client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                                 return;
                              }

                              var68 = classFH.method4001(var68, var14, 2108391709);
                           }

                           AbstractFont.method10422(
                              var50,
                              var68,
                              var16,
                              var17,
                              var14.width * -1946208531,
                              -905446999 * var14.height,
                              var60,
                              var14.textShadowed ? 0 : -1,
                              class545.method11161(-2090288859 * var14.transparencyTop, (byte)77),
                              450368173 * var14.textXAlignment,
                              1404399019 * var14.textYAlignment,
                              -1315307335 * var14.textLineHeight
                           );
                        }
                     } else if (5 == 928687775 * var14.type) {
                        if (!var14.isIf3) {
                           SpritePixels var49 = var14.getSprite(
                              class226.widgetDefinition, class556.runCs1(var14, -1333135934), class164.urlRequester, -2067381412
                           );
                           if (null != var49) {
                              if (var12 != 1105137527) {
                                 client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                                 return;
                              }

                              var49.method12650(var16, var17);
                           } else if (Widget.field4598) {
                              class376.invalidateWidget(var14, (byte)5);
                           }
                        } else {
                           SpritePixels var48;
                           if (-1 != var14.itemId * -231674939) {
                              var48 = Archive.getItemSprite(
                                 var14.itemId * -231674939,
                                 var14.itemQuantity * 1070452379,
                                 -1211507623 * var14.outline,
                                 771853131 * var14.spriteShadow,
                                 var14.itemQuantityMode * -1574117989,
                                 false,
                                 Math.max(36, var14.width * -1946208531),
                                 Math.max(32, -905446999 * var14.height),
                                 -1750200916
                              );
                           } else {
                              var48 = var14.getSprite(class226.widgetDefinition, false, class164.urlRequester, -2145928297);
                           }

                           if (null == var48) {
                              if (Widget.field4598) {
                                 if (var12 != 1105137527) {
                                    client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                                    return;
                                 }

                                 class376.invalidateWidget(var14, (byte)5);
                              }
                           } else {
                              int var59 = var48.width;
                              int var67 = var48.height;
                              if (!var14.spriteTiling) {
                                 int var79 = -210841600 * var14.width / var59;
                                 if (-1646072231 * var14.spriteAngle != 0) {
                                    if (var12 != 1105137527) {
                                       client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                                       return;
                                    }

                                    SpritePixels.method12685(
                                       var48,
                                       -1946208531 * var14.width / 2 + var16,
                                       -905446999 * var14.height / 2 + var17,
                                       var14.spriteAngle * -1646072231,
                                       var79
                                    );
                                 } else if (0 != var18) {
                                    var48.drawTransScaledAt(var16, var17, -1946208531 * var14.width, var14.height * -905446999, 256 - (var18 & 0xFF));
                                 } else if (var59 == var14.width * -1946208531 && var67 == -905446999 * var14.height) {
                                    var48.method12650(var16, var17);
                                 } else {
                                    var48.drawScaledAt(var16, var17, -1946208531 * var14.width, var14.height * -905446999);
                                 }
                              } else {
                                 Rasterizer2D.Rasterizer2D_expandClip(var16, var17, -1946208531 * var14.width + var16, -905446999 * var14.height + var17);
                                 int var78 = (var59 - 1 + var14.width * -1946208531) / var59;
                                 int var83 = (-905446999 * var14.height + (var67 - 1)) / var67;

                                 for (int var86 = 0; var86 < var78; var86++) {
                                    for (int var94 = 0; var94 < var83; var94++) {
                                       if (var14.spriteAngle * -1646072231 != 0) {
                                          SpritePixels.method12685(
                                             var48, var59 / 2 + var16 + var86 * var59, var67 / 2 + var94 * var67 + var17, var14.spriteAngle * -1646072231, 4096
                                          );
                                       } else if (var18 != 0) {
                                          var48.method12659(var59 * var86 + var16, var17 + var67 * var94, 256 - (var18 & 0xFF));
                                       } else {
                                          var48.method12650(var16 + var86 * var59, var17 + var94 * var67);
                                       }
                                    }
                                 }

                                 Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
                              }
                           }
                        }
                     } else if (6 == var14.type * 928687775) {
                        SequenceDefinition var47 = null;
                        int var58 = -1;
                        boolean var66 = class556.runCs1(var14, -1333135934);
                        int var77;
                        if (var66) {
                           var77 = 1986719883 * var14.sequenceId2;
                        } else {
                           var77 = var14.sequenceId * -750054055;
                        }

                        if (-1 != var77) {
                           var47 = ClientPacket.SequenceDefinition_get(var77, 817882271);
                           var58 = var14.modelFrame * 81622619;
                        }

                        Model var82 = null;
                        int var85 = 0;
                        if (-231674939 * var14.itemId != -1) {
                           ItemComposition var88 = class150.ItemDefinition_get(var14.itemId * -231674939, -331260554);
                           if (var88 != null) {
                              var88 = ItemComposition.method5065(var88, 1070452379 * var14.itemQuantity, (byte)1);
                              var82 = var88.getModel(1, 326960462);
                              if (var82 != null) {
                                 var82.method6864();
                                 var85 = -1272589951 * var82.height / 2;
                              } else {
                                 class376.invalidateWidget(var14, (byte)5);
                              }
                           }
                        } else if (2124425241 * var14.modelType == 5) {
                           if (94743803 * var14.modelId == 0) {
                              var82 = PlayerComposition.method7912(client.playerAppearance, null, -1, null, -1, (byte)35);
                           } else {
                              var82 = class330.localPlayer.getModel(566725961);
                           }
                        } else if (7 == 2124425241 * var14.modelType) {
                           var82 = PlayerComposition.method7912(
                              var14.field4497,
                              null,
                              -1,
                              ClientPacket.SequenceDefinition_get(class330.localPlayer.idleSequence * 1683244579, 663939226),
                              class330.localPlayer.poseAnimationSequence.getFrame(-609025707),
                              (byte)52
                           );
                        } else if (var14.modelType * 2124425241 == 8) {
                           if (94743803 * var14.modelId != -1) {
                              ObjectComposition var90 = AsyncHttpResponse.getObjectDefinition(var14.modelId * 94743803, 2130369490);
                              var82 = Fonts.method11309(var90, 10, 0, (int[][])null, 0, 0, 0, var47, var58, (byte)8);
                           }
                        } else if (9 == var14.modelType * 2124425241) {
                           if (var12 != 1105137527) {
                              client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                              return;
                           }

                           if (-1 != 94743803 * var14.modelId) {
                              NPCComposition var91 = AsyncHttpResponse.getNpcDefinition(94743803 * var14.modelId, (byte)83);
                              var82 = var91.getModel(var47, var58, null, -1, null, (short)8798);
                           }
                        } else {
                           NPCComposition var92 = null;
                           NpcOverrides var95 = null;
                           if (6 == var14.modelType * 2124425241) {
                              int var97 = 94743803 * var14.modelId;
                              if (var97 >= 0) {
                                 NPC var32 = (NPC)Occluder.topLevelWorldView.players.get(var97);
                                 if (var32 != null && var32.definition != null) {
                                    var92 = var32.definition;
                                    if (var92.transforms != null) {
                                       var92 = NPCComposition.method4683(var92, (byte)0);
                                    }

                                    var95 = var32.method3536(1827789378);
                                 }
                              }
                           } else if (2 == var14.modelType * 2124425241) {
                              int var98 = var14.modelId * 94743803;
                              var92 = AsyncHttpResponse.getNpcDefinition(var98, (byte)71);
                              if (null != var92.transforms) {
                                 var92 = NPCComposition.method4683(var92, (byte)0);
                              }
                           }

                           var82 = var14.getModel(class226.widgetDefinition, var47, var58, var66, class330.localPlayer.appearance, var92, var95, (byte)-70);
                           if (null == var82 && Widget.field4598) {
                              class376.invalidateWidget(var14, (byte)5);
                           }
                        }

                        Rasterizer3D.setCustomClipBounds(var16 + -1946208531 * var14.width / 2, -905446999 * var14.height / 2 + var17);
                        int var93 = Rasterizer3D.Rasterizer3D_sine[var14.modelAngleX * 751747207] * -1417816983 * var14.modelZoom >> 16;
                        int var96 = Rasterizer3D.Rasterizer3D_cosine[var14.modelAngleX * 751747207] * var14.modelZoom * -1417816983 >> 16;
                        if (var82 != null) {
                           Rasterizer3D.method5817(false);
                           if (!var14.isIf3) {
                              var82.method6850(0, var14.modelAngleY * 1629507461, 0, 751747207 * var14.modelAngleX, 0, var93, var96);
                           } else {
                              var82.method6864();
                              if (var14.modelOrthog) {
                                 var82.method6790(
                                    0,
                                    var14.modelAngleY * 1629507461,
                                    var14.modelAngleZ * 1415481045,
                                    var14.modelAngleX * 751747207,
                                    -1658952283 * var14.modelOffsetX,
                                    var14.modelOffsetY * 656283015 + var85 + var93,
                                    var14.modelOffsetY * 656283015 + var96,
                                    -1417816983 * var14.modelZoom
                                 );
                              } else {
                                 var82.method6850(
                                    0,
                                    var14.modelAngleY * 1629507461,
                                    1415481045 * var14.modelAngleZ,
                                    var14.modelAngleX * 751747207,
                                    var14.modelOffsetX * -1658952283,
                                    656283015 * var14.modelOffsetY + var85 + var93,
                                    var96 + var14.modelOffsetY * 656283015
                                 );
                              }
                           }
                        }

                        Rasterizer3D.setClipBounds();
                     } else if (8 == var14.type * 928687775) {
                        if (var14 == WorldView.field1333 && -1806931041 * client.field834 == -950537631 * client.field842) {
                           int var45 = 0;
                           int var56 = 0;
                           Font var65 = UserComparator5.fontPlain12;
                           String var73 = var14.text;

                           for (String var74 = classFH.method4001(var73, var14, 2108391709); !var74.isEmpty(); var56 += var65.ascent + 1) {
                              int var28 = var74.indexOf(classDF.field1348);
                              String var27;
                              if (-1 != var28) {
                                 if (var12 != 1105137527) {
                                    client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                                    return;
                                 }

                                 var27 = var74.substring(0, var28);
                                 var74 = var74.substring(var28 + 4);
                              } else {
                                 var27 = var74;
                                 var74 = "";
                              }

                              int var29 = var65.stringWidth(var27);
                              if (var29 > var45) {
                                 var45 = var29;
                              }
                           }

                           var45 += 6;
                           var56 += 7;
                           int var84 = var14.width * -1946208531 + var16 - 5 - var45;
                           int var87 = 5 + -905446999 * var14.height + var17;
                           if (var84 < var16 + 5) {
                              if (var12 != 1105137527) {
                                 client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                                 return;
                              }

                              var84 = var16 + 5;
                           }

                           if (var84 + var45 > var7) {
                              if (var12 != 1105137527) {
                                 client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                                 return;
                              }

                              var84 = var7 - var45;
                           }

                           if (var56 + var87 > var8) {
                              if (var12 != 1105137527) {
                                 client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                                 return;
                              }

                              var87 = var8 - var56;
                           }

                           Rasterizer2D.Rasterizer2D_fillRectangle(var84, var87, var45, var56, 16777120);
                           Rasterizer2D.Rasterizer2D_drawRectangle(var84, var87, var45, var56, 0);
                           var73 = var14.text;
                           int var30 = 2 + var65.ascent + var87;

                           for (String var76 = classFH.method4001(var73, var14, 2108391709); !var76.isEmpty(); var30 += 1 + var65.ascent) {
                              int var31 = var76.indexOf(classDF.field1348);
                              String var81;
                              if (var31 != -1) {
                                 if (var12 != 1105137527) {
                                    client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                                    return;
                                 }

                                 var81 = var76.substring(0, var31);
                                 var76 = var76.substring(var31 + 4);
                              } else {
                                 var81 = var76;
                                 var76 = "";
                              }

                              var65.method10402(var81, var84 + 3, var30, 0, -1);
                           }
                        }
                     } else if (9 == var14.type * 928687775) {
                        int var44;
                        int var55;
                        int var64;
                        int var72;
                        if (var14.field4526) {
                           if (var12 != 1105137527) {
                              client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                              return;
                           }

                           var44 = var16;
                           var55 = var17 + var14.height * -905446999;
                           var64 = var16 + -1946208531 * var14.width;
                           var72 = var17;
                        } else {
                           var44 = var16;
                           var55 = var17;
                           var64 = var16 + -1946208531 * var14.width;
                           var72 = var17 + var14.height * -905446999;
                        }

                        if (1 == 745861049 * var14.lineWid) {
                           Rasterizer2D.Rasterizer2D_drawLine(var44, var55, var64, var72, var14.color * 7845467);
                        } else {
                           GrandExchangeOffer.method8910(var44, var55, var64, var72, var14.color * 7845467, var14.lineWid * 745861049, (byte)3);
                        }
                     } else if (12 == var14.type * 928687775) {
                        classOO var43 = var14.method8156(1410687352);
                        class372 var54 = var14.method8158((short)16256);
                        if (null != var43) {
                           if (var12 != 1105137527) {
                              client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                              return;
                           }

                           if (null != var54 && var43.method8557((byte)10)) {
                              Font var63 = var14.getFont(class226.widgetDefinition, -1094266041);
                              if (null != var63) {
                                 label846: {
                                    client.field708
                                       .method12728(
                                          var16,
                                          var17,
                                          -1946208531 * var14.width,
                                          var14.height * -905446999,
                                          var43.method8558((byte)-69),
                                          var43.method8559(-16777216),
                                          var43.method8549(1757525191),
                                          var43.method8550((byte)-10),
                                          var43.method8545(-1987300362),
                                          (byte)-62
                                       );
                                    int var71 = var14.textShadowed ? var14.spriteShadow * 771853131 : -1;
                                    if (!var43.method8538((byte)0)) {
                                       if (var12 != 1105137527) {
                                          client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
                                          return;
                                       }

                                       if (classOO.method8531(var43, 537330381).method10125((byte)55)) {
                                          classXW.method12732(
                                             client.field708,
                                             1635834675 * var54.field4641,
                                             var71,
                                             var54.field4640 * -936277931,
                                             527385781 * var54.field4642,
                                             -1717371563
                                          );
                                          client.field708.method12738(var43.method8533(-999315124), var63, (byte)-65);
                                          break label846;
                                       }
                                    }

                                    classXW.method12732(
                                       client.field708, 7845467 * var14.color, var71, var54.field4640 * -936277931, var54.field4642 * 527385781, -1425856690
                                    );
                                    client.field708.method12738(classOO.method8531(var43, -431965519), var63, (byte)-35);
                                 }

                                 Rasterizer2D.Rasterizer2D_setClip(var5, var6, var7, var8);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         client.method1976(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      } catch (RuntimeException var33) {
         throw RestClientThreadFactory.newRunException(var33, "by.me(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;Lxj;)V")
   @ObfuscatedName("ak")
   static void method1295(WorldEntity var0, PacketBuffer var1) {
      int var2 = var1.readUnsignedByte(-1689679929);
      if (0 != (var2 & 1)) {
         int var3 = Buffer.method12008(var1, (byte)5);
         int var4 = var1.readUnsignedByte(1070892775);
         if (65535 == var3) {
            byte var7 = -1;
            AnimationSequence.method10313(var0.field5966, var7, 6824825);
            var0.field5966.method10332((byte)84);
            var0.field5968 = 1254897545 * var4;
         } else {
            label42: {
               SequenceDefinition var5 = AnimationSequence.method10318(var0.field5966, -62338009);
               if (null != var5) {
                  if (var3 == var0.method10863(435334531)) {
                     int var6 = -1424973920 * var5.restartMode;
                     if (var6 == 1) {
                        var0.field5966.method10332((byte)64);
                        var0.field5968 = -1041917121 * var4;
                     }

                     if (var6 == 2) {
                        var0.field5966.method10333((byte)51);
                     }
                     break label42;
                  }

                  if (ClientPacket.SequenceDefinition_get(var3, -954583549).field2726 * -1808717695 < var5.field2726 * -1808717695) {
                     break label42;
                  }
               }

               AnimationSequence.method10313(var0.field5966, var3, 1105674639);
               var0.field5966.method10332((byte)58);
               var0.field5968 = -1041917121 * var4;
            }
         }
      }

      if ((var2 & 2) != 0) {
         var0.method10849(var1.readUnsignedByte(1100259355), (byte)1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lts;Lxj;)V")
   @ObfuscatedName("ae")
   static void method1296(WorldEntity var0, PacketBuffer var1) {
      int var2 = var1.readUnsignedByte(501334054);
      if (0 != (var2 & 1)) {
         int var3 = Buffer.method12008(var1, (byte)5);
         int var4 = var1.readUnsignedByte(-770385531);
         if (65535 == var3) {
            byte var7 = -1;
            AnimationSequence.method10313(var0.field5966, var7, -910483937);
            var0.field5966.method10332((byte)112);
            var0.field5968 = 1153803987 * var4;
         } else {
            label45: {
               SequenceDefinition var5 = AnimationSequence.method10318(var0.field5966, -1183598064);
               if (null != var5) {
                  if (var3 == var0.method10863(435334531)) {
                     int var6 = 564693013 * var5.restartMode;
                     if (var6 == 1) {
                        var0.field5966.method10332((byte)18);
                        var0.field5968 = -534289159 * var4;
                     }

                     if (var6 == 2) {
                        var0.field5966.method10333((byte)92);
                     }
                     break label45;
                  }

                  if (ClientPacket.SequenceDefinition_get(var3, 681178272).field2726 * -1808717695 < var5.field2726 * -272529019) {
                     break label45;
                  }
               }

               AnimationSequence.method10313(var0.field5966, var3, -1920632167);
               var0.field5966.method10332((byte)75);
               var0.field5968 = -1041917121 * var4;
            }
         }
      }

      if ((var2 & 2) != 0) {
         var0.method10849(var1.readUnsignedByte(-541393851), (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldv;IIIIS)V")
   @ObfuscatedName("mx")
   static final void addNpcToMenu(NPC var0, int var1, int var2, int var3, int var4, short var5) {
      boolean var6 = Scene.method5720(var0, false);
      if (var6) {
         int var11 = var4;
         int var10 = var3;
         int var9 = var2;
         int var8 = var1;
         NPC var7 = var0;
         short var12 = 32557;

         try {
            NPCComposition var13 = var7.definition;
            if (client.menu.field6552 * 1759446067 >= 400) {
               if (var12 <= 154) {
               }
            } else {
               if (null != var13.transforms) {
                  var13 = NPCComposition.method4683(var13, (byte)0);
               }

               if (var13 == null) {
                  if (var12 <= 154) {
                     throw new IllegalStateException();
                  }
               } else if (var13.isInteractable && (!var13.isFollower || var8 == 708717389 * client.followerIndex)) {
                  String var14 = var7.method3504(944066099);
                  if (0 != var13.combatLevel * 1601675895) {
                     if (var12 <= 154) {
                        throw new IllegalStateException();
                     }

                     if (-920641079 * var7.field1165 != 0) {
                        if (var12 <= 154) {
                           throw new IllegalStateException();
                        }

                        int var10000;
                        if (-1 != -920641079 * var7.field1165) {
                           if (var12 <= 154) {
                              throw new IllegalStateException();
                           }

                           var10000 = var7.field1165 * -920641079;
                        } else {
                           var10000 = var13.combatLevel * 1601675895;
                        }

                        int var15 = var10000;
                        var14 = var14
                           + class108.method3888(var15, -545684123 * class330.localPlayer.combatLevel, (byte)-124)
                           + " "
                           + classDF.field1351
                           + Strings.field5026
                           + var15
                           + classDF.field1349;
                     }
                  }

                  if (var13.lowPriorityFollowerOps) {
                     if (var12 <= 154) {
                        throw new IllegalStateException();
                     }

                     if (client.followerOpsLowPriority) {
                        if (var12 <= 154) {
                           throw new IllegalStateException();
                        }

                        ClanChannel.insertMenuItem(
                           Strings.field5125, class144.colorStartTag(16776960, -2141217142) + var14, 1003, var8, var9, var10, -1, false, var11, 65535
                        );
                     }
                  }

                  if (!classNR.field4331) {
                     if (var12 <= 154) {
                        throw new IllegalStateException();
                     }

                     if (client.isItemSelected * -415813337 == 1) {
                        ClanChannel.insertMenuItem(
                           Strings.field5019,
                           client.field790 + " " + classDF.field1350 + " " + class144.colorStartTag(16776960, -752695423) + var14,
                           7,
                           var8,
                           var9,
                           var10,
                           -1,
                           false,
                           var11,
                           65535
                        );
                        return;
                     }
                  }

                  if (client.isSpellSelected) {
                     if (var12 <= 154) {
                        throw new IllegalStateException();
                     }

                     if (!classNR.field4331) {
                        if (var12 <= 154) {
                           throw new IllegalStateException();
                        }

                        if ((485276933 * DesktopPlatformInfoProvider.selectedSpellFlags & 2) == 2) {
                           if (var12 <= 154) {
                              throw new IllegalStateException();
                           }

                           ClanChannel.insertMenuItem(
                              client.selectedSpellActionName,
                              client.selectedSpellName + " " + classDF.field1350 + " " + class144.colorStartTag(16776960, 1232961593) + var14,
                              8,
                              var8,
                              var9,
                              var10,
                              -1,
                              false,
                              var11,
                              65535
                           );
                        }
                     }
                  } else {
                     short var24;
                     label301: {
                        if (var13.lowPriorityFollowerOps) {
                           if (var12 <= 154) {
                              throw new IllegalStateException();
                           }

                           if (client.followerOpsLowPriority) {
                              if (var12 <= 154) {
                                 throw new IllegalStateException();
                              }

                              var24 = 2000;
                              break label301;
                           }
                        }

                        var24 = 0;
                     }

                     short var20 = var24;
                     String[] var16 = var13.actions;
                     if (var16 != null) {
                        for (int var17 = 4; var17 >= 0; var17--) {
                           if (var12 <= 154) {
                              throw new IllegalStateException();
                           }

                           if (!classNR.field4331) {
                              if (!NPC.method3502(var7, var17, -1831974512)) {
                                 if (var12 <= 154) {
                                    throw new IllegalStateException();
                                 }
                              } else if (var16[var17] != null) {
                                 if (var12 <= 154) {
                                    throw new IllegalStateException();
                                 }

                                 if (!var16[var17].equalsIgnoreCase(Strings.field5021)) {
                                    int var18 = 0;
                                    if (0 == var17) {
                                       if (var12 <= 154) {
                                          throw new IllegalStateException();
                                       }

                                       var18 = 9 + var20;
                                    }

                                    if (var17 == 1) {
                                       if (var12 <= 154) {
                                          return;
                                       }

                                       var18 = var20 + 10;
                                    }

                                    if (2 == var17) {
                                       if (var12 <= 154) {
                                          throw new IllegalStateException();
                                       }

                                       var18 = 11 + var20;
                                    }

                                    if (var17 == 3) {
                                       if (var12 <= 154) {
                                          throw new IllegalStateException();
                                       }

                                       var18 = 12 + var20;
                                    }

                                    if (var17 == 4) {
                                       if (var12 <= 154) {
                                          throw new IllegalStateException();
                                       }

                                       var18 = 13 + var20;
                                    }

                                    ClanChannel.insertMenuItem(
                                       var16[var17], class144.colorStartTag(16776960, -491303667) + var14, var18, var8, var9, var10, -1, false, var11, 65535
                                    );
                                 }
                              }
                           }
                        }
                     }

                     if (null != var16) {
                        for (int var22 = 4; var22 >= 0; var22--) {
                           if (var12 <= 154) {
                              throw new IllegalStateException();
                           }

                           if (!classNR.field4331) {
                              if (var12 <= 154) {
                                 throw new IllegalStateException();
                              }

                              if (!NPC.method3502(var7, var22, -2075894887)) {
                                 if (var12 <= 154) {
                                    throw new IllegalStateException();
                                 }
                              } else if (null != var16[var22]) {
                                 if (var12 <= 154) {
                                    throw new IllegalStateException();
                                 }

                                 if (var16[var22].equalsIgnoreCase(Strings.field5021)) {
                                    if (var12 <= 154) {
                                       throw new IllegalStateException();
                                    }

                                    var20 = 0;
                                    if (AttackOption.AttackOption_hidden == client.npcAttackOption) {
                                       if (var12 <= 154) {
                                          return;
                                       }
                                    } else {
                                       label261: {
                                          if (AttackOption.AttackOption_alwaysRightClick != client.npcAttackOption) {
                                             if (client.npcAttackOption != AttackOption.AttackOption_dependsOnCombatLevels) {
                                                break label261;
                                             }

                                             if (var12 <= 154) {
                                                throw new IllegalStateException();
                                             }

                                             if (1601675895 * var13.combatLevel <= -545684123 * class330.localPlayer.combatLevel) {
                                                break label261;
                                             }
                                          }

                                          var20 = 2000;
                                       }

                                       int var23 = 0;
                                       if (0 == var22) {
                                          if (var12 <= 154) {
                                             return;
                                          }

                                          var23 = var20 + 9;
                                       }

                                       if (var22 == 1) {
                                          if (var12 <= 154) {
                                             return;
                                          }

                                          var23 = 10 + var20;
                                       }

                                       if (var22 == 2) {
                                          var23 = var20 + 11;
                                       }

                                       if (3 == var22) {
                                          if (var12 <= 154) {
                                             return;
                                          }

                                          var23 = 12 + var20;
                                       }

                                       if (var22 == 4) {
                                          var23 = var20 + 13;
                                       }

                                       ClanChannel.insertMenuItem(
                                          var16[var22], class144.colorStartTag(16776960, 1138145957) + var14, var23, var8, var9, var10, -1, false, var11, 65535
                                       );
                                    }
                                 }
                              }
                           }
                        }
                     }

                     if (var13.lowPriorityFollowerOps) {
                        if (var12 <= 154) {
                           throw new IllegalStateException();
                        }

                        if (client.followerOpsLowPriority) {
                           return;
                        }
                     }

                     ClanChannel.insertMenuItem(
                        Strings.field5125, class144.colorStartTag(16776960, -77205820) + var14, 1003, var8, var9, var10, -1, false, var11, 65535
                     );
                  }
               }
            }
         } catch (RuntimeException var19) {
            throw RestClientThreadFactory.newRunException(var19, "by.mx(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("hv")
   static long getUserHash(int var0) {
      try {
         return 3891958124439016377L * client.userHash;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "by.hv(" + ')');
      }
   }
}
