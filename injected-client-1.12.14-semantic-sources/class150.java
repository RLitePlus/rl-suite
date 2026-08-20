import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fj")
public class class150 extends classFM {
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final int field1802 = 75;
   @ToRemove(unused = "true")
   @ObfuscatedName("ca")
   static final int field1805 = 7680;
   @ObfuscatedName("ld")
   static int field1806;
   @ObfuscatedName("av")
   int field1801;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field1803 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   static final int field1804 = 78;

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod184(Buffer var1) {
      this.field1801 = Buffer.method12008(var1, (byte)5) * -970764527;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldq;)Z")
   @ObfuscatedName("tr")
   public static boolean method4010(RawSound var0) {
      if (var0 == null) {
         var0.method3414();
      }

      return var0.field1467;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod182(Buffer var1, byte var2) {
      try {
         this.field1801 = Buffer.method12008(var1, (byte)5) * -1591361979;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fj.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIIB)V")
   @ObfuscatedName("md")
   static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8) {
      try {
         if (!WidgetDefinition.method7961(class226.widgetDefinition, var0, -2144635281)) {
            if (var8 == 1) {
               throw new IllegalStateException();
            } else {
               if (var7 != -1) {
                  if (var8 == 1) {
                     throw new IllegalStateException();
                  }

                  client.validRootWidgets[var7] = true;
               } else {
                  for (int var9 = 0; var9 < 100; var9++) {
                     if (var8 == 1) {
                        throw new IllegalStateException();
                     }

                     client.validRootWidgets[var9] = true;
                  }
               }
            }
         } else {
            class66.field488 = null;
            class40.drawInterface(
               class226.widgetDefinition.Widget_interfaceComponents[var0],
               0,
               class226.widgetDefinition.Widget_interfaceComponents[var0].length - 1,
               -1,
               -1,
               var1,
               var2,
               var3,
               var4,
               var5,
               var6,
               var7,
               1105137527
            );
            if (null != class66.field488) {
               class40.drawInterface(
                  class66.field488,
                  0,
                  class66.field488.length - 1,
                  -1412584499,
                  -1412584499,
                  var1,
                  var2,
                  var3,
                  var4,
                  -134930549 * DevicePcmPlayerProvider.field42,
                  UserComparator3.field1559 * -2105059237,
                  var7,
                  1105137527
               );
               class66.field488 = null;
            }
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "fj.md(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod185(ClanSettings var1, byte var2) {
      try {
         var1.method4295(-2060802931 * this.field1801, -1999402040);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fj.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod183(Buffer var1) {
      this.field1801 = Buffer.method12008(var1, (byte)5) * -1591361979;
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod186(ClanSettings var1) {
      var1.method4295(-1198347094 * this.field1801, -239985217);
   }

   @ObfuscatedSignature(descriptor = "(II)Lis;")
   @ObfuscatedName("av")
   public static ItemComposition ItemDefinition_get(int var0, int var1) {
      try {
         ItemComposition var2 = (ItemComposition)class402.method8806(ItemComposition.ItemDefinition_cached, var0);
         if (var2 != null) {
            if (var1 >= 327716789) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = class138.ItemDefinition_archive.getFile(10, var0, -848874751);
            var2 = new ItemComposition();
            var2.id = 1969826605 * var0;
            if (var3 != null) {
               if (var1 >= 327716789) {
                  throw new IllegalStateException();
               }

               var2.decode(new Buffer(var3), 297032611);
            }

            var2.post(-1449464451);
            if (388376999 * var2.noteTemplate != -1) {
               if (var1 >= 327716789) {
                  throw new IllegalStateException();
               }

               ItemComposition.method5043(
                  var2, ItemDefinition_get(388376999 * var2.noteTemplate, -2012125313), ItemDefinition_get(98718905 * var2.note, -844329686), 381590163
               );
            }

            if (var2.notedId * 428085087 != -1) {
               if (var1 >= 327716789) {
                  throw new IllegalStateException();
               }

               var2.genBought(
                  ItemDefinition_get(var2.notedId * 428085087, -180938134), ItemDefinition_get(1181026761 * var2.unnotedId, -2043709357), -263061748
               );
            }

            if (-1 != var2.placeholderTemplate * 413316061) {
               var2.genPlaceholder(
                  ItemDefinition_get(var2.placeholderTemplate * 413316061, -1311262399),
                  ItemDefinition_get(var2.placeholder * -1134820861, -1476212644),
                  (byte)111
               );
            }

            if (!TileItem.ItemDefinition_inMembersWorld && var2.isTradable) {
               if (var1 >= 327716789) {
                  throw new IllegalStateException();
               }

               if (-1 == var2.noteTemplate * 388376999) {
                  if (var1 >= 327716789) {
                     throw new IllegalStateException();
                  }

                  if (var2.notedId * 428085087 == -1 && -1 == 413316061 * var2.placeholderTemplate) {
                     if (var1 >= 327716789) {
                        throw new IllegalStateException();
                     }

                     var2.name = var2.name + Strings.field4851;
                  }
               }

               var2.examine = Strings.field5139;
               var2.isMembersOnly = false;

               for (int var4 = 0; var4 < var2.groundActions.length; var4++) {
                  var2.groundActions[var4] = null;
               }

               for (int var9 = 0; var9 < var2.inventoryActions.length; var9++) {
                  if (var1 >= 327716789) {
                     throw new IllegalStateException();
                  }

                  if (4 != var9) {
                     if (null != var2.subOps) {
                        var2.subOps[var9] = null;
                     }

                     var2.inventoryActions[var9] = null;
                  }
               }

               var2.shiftClickIndex = 1732434494;
               var2.team = 0;
               if (null != var2.params) {
                  if (var1 >= 327716789) {
                     throw new IllegalStateException();
                  }

                  boolean var10 = false;

                  for (Node var5 = var2.params.first(); null != var5; var5 = var2.params.next()) {
                     ParamComposition var6 = WorldMap.getParamDefinition((int)var5.key, -953684731);
                     if (var6.autoDisable) {
                        if (var1 >= 327716789) {
                           throw new IllegalStateException();
                        }

                        var5.remove();
                     } else {
                        var10 = true;
                     }
                  }

                  if (!var10) {
                     if (var1 >= 327716789) {
                        throw new IllegalStateException();
                     }

                     var2.params = null;
                  }
               }
            }

            ItemComposition.ItemDefinition_cached.put(var2, var0);
            return var2;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "fj.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIIIIIIII)V")
   @ObfuscatedName("lj")
   static final void addPendingSpawnToScene(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      boolean var10 = client.isLowDetail;

      try {
         client.isLowDetail = false;
         int var20 = var8;
         int var19 = var7;
         int var18 = var6;
         int var17 = var5;
         int var16 = var4;
         int var15 = var3;
         int var14 = var2;
         int var13 = var1;
         WorldView var12 = var0;
         int var21 = -1704342885;

         try {
            Scene var22 = var12.scene;
            if (var15 >= 1 && var16 >= 1 && var21 > -1719085082 && var15 <= 2010544793 * var12.sizeX - 2) {
               if (var21 <= -1719085082) {
                  throw new IllegalStateException();
               }

               if (var16 <= 1823353167 * var12.sizeY - 2 && var21 > -1719085082) {
                  if (client.isLowDetail) {
                     if (var21 <= -1719085082) {
                        throw new IllegalStateException();
                     }

                     if (2115028565 * var12.plane != var13) {
                        return;
                     }
                  }

                  Renderable var23 = null;
                  Renderable var24 = null;
                  int var25 = -1;
                  long var26 = 0L;
                  int var28 = 0;
                  int var29 = 0;
                  if (var14 == 0) {
                     if (var21 <= -1719085082) {
                        return;
                     }

                     var26 = Scene.method5731(var22, var13, var15, var16);
                  }

                  if (1 == var14) {
                     if (var21 <= -1719085082) {
                        throw new IllegalStateException();
                     }

                     var26 = var22.method5763(var13, var15, var16);
                  }

                  if (2 == var14) {
                     if (var21 <= -1719085082) {
                        throw new IllegalStateException();
                     }

                     var26 = var22.getWallDecorationTag(var13, var15, var16);
                  }

                  if (3 == var14) {
                     if (var21 <= -1719085082) {
                        throw new IllegalStateException();
                     }

                     var26 = var22.getBoundaryObjectTag(var13, var15, var16);
                  }

                  if (0L != var26) {
                     if (var21 <= -1719085082) {
                        throw new IllegalStateException();
                     }

                     int var30 = var22.method5784(var13, var15, var16, var26);
                     var25 = HorizontalAlignment.Entity_unpackID(var26);
                     var28 = var30 & 31;
                     var29 = var30 >> 6 & 3;
                     ObjectComposition var31 = AsyncHttpResponse.getObjectDefinition(var25, 2027299183);
                     var12.method3091(var13, var15, var16, var31, var29, -576603424);
                     if (0 == var14) {
                        if (var21 <= -1719085082) {
                           throw new IllegalStateException();
                        }

                        BoundaryObject var32 = classXR.method12494(var22, var13, var15, var16);
                        var23 = var32.renderable1;
                        var24 = var32.renderable2;
                        var22.removeBoundaryObject(var13, var15, var16);
                        if (0 != 756705879 * var31.interactType) {
                           if (var21 <= -1719085082) {
                              throw new IllegalStateException();
                           }

                           var12.collisionMaps[var13].method6428(var15, var16, var28, var29, var31.boolean1, -127415640);
                        }
                     }

                     if (var14 == 1) {
                        if (var21 <= -1719085082) {
                           throw new IllegalStateException();
                        }

                        WallDecoration var62 = Scene.method5788(var22, var13, var15, var16);
                        var23 = var62.renderable1;
                        var24 = var62.renderable2;
                        var22.removeWallDecoration(var13, var15, var16);
                     }

                     if (2 == var14) {
                        if (var21 <= -1719085082) {
                           throw new IllegalStateException();
                        }

                        var23 = Scene.method5734(var22, var13, var15, var16).renderable;
                        Scene.method5692(var22, var13, var15, var16);
                        if (var15 + 1813358617 * var31.sizeX > 2010544793 * var12.sizeX - 1
                           || var21 <= -1719085082
                           || var31.sizeX * 1813358617 + var16 > 1823353167 * var12.sizeY - 1) {
                           return;
                        }

                        if (var21 <= -1719085082) {
                           throw new IllegalStateException();
                        }

                        if (var15 + -352504863 * var31.sizeY > 2010544793 * var12.sizeX - 1) {
                           return;
                        }

                        if (var21 <= -1719085082) {
                           throw new IllegalStateException();
                        }

                        if (var31.sizeY * -352504863 + var16 > var12.sizeY * 1823353167 - 1) {
                           if (var21 <= -1719085082) {
                              throw new IllegalStateException();
                           }

                           return;
                        }

                        if (var31.interactType * 756705879 != 0) {
                           if (var21 <= -1719085082) {
                              return;
                           }

                           CollisionMap.method6435(
                              var12.collisionMaps[var13], var15, var16, 1813358617 * var31.sizeX, var31.sizeY * -352504863, var29, var31.boolean1, (byte)88
                           );
                        }
                     }

                     if (3 == var14) {
                        if (var21 <= -1719085082) {
                           throw new IllegalStateException();
                        }

                        var23 = var22.method5778(var13, var15, var16).renderable;
                        var22.removeFloorDecoration(var13, var15, var16);
                        if (1 == var31.interactType * 756705879) {
                           if (var21 <= -1719085082) {
                              throw new IllegalStateException();
                           }

                           CollisionMap.method6439(var12.collisionMaps[var13], var15, var16, (byte)-100);
                        }
                     }
                  }

                  if (var17 >= 0 && var21 > -1719085082) {
                     int var60 = var13;
                     if (var13 < 3) {
                        if (var21 <= -1719085082) {
                           return;
                        }

                        if (2 == (var12.tileSettings[1][var15][var16] & 2)) {
                           if (var21 <= -1719085082) {
                              throw new IllegalStateException();
                           }

                           var60 = var13 + 1;
                        }
                     }

                     if (var25 != var17) {
                        var23 = null;
                        var24 = null;
                     }

                     CollisionMap var61 = var12.collisionMaps[var13];
                     ObjectComposition var63 = AsyncHttpResponse.getObjectDefinition(var17, 2032935528);
                     int var10000;
                     if (var20 >= 0) {
                        if (var21 <= -1719085082) {
                           throw new IllegalStateException();
                        }

                        var10000 = var20;
                     } else {
                        var10000 = 930784507 * var63.animationId;
                     }

                     int var33 = var10000;
                     int var34;
                     int var35;
                     if (1 != var18 && 3 != var18) {
                        var34 = 1813358617 * var63.sizeX;
                        var35 = var63.sizeY * -352504863;
                     } else {
                        var34 = -352504863 * var63.sizeY;
                        var35 = 1813358617 * var63.sizeX;
                     }

                     int var36;
                     int var37;
                     if (var34 + var15 <= 2010544793 * var12.sizeX) {
                        if (var21 <= -1719085082) {
                           return;
                        }

                        var36 = (var34 >> 1) + var15;
                        var37 = (1 + var34 >> 1) + var15;
                     } else {
                        var36 = var15;
                        var37 = var15 + 1;
                     }

                     int var38;
                     int var39;
                     if (var35 + var16 <= var12.sizeY * 1823353167) {
                        var38 = (var35 >> 1) + var16;
                        var39 = var16 + (var35 + 1 >> 1);
                     } else {
                        var38 = var16;
                        var39 = var16 + 1;
                     }

                     int[][] var40 = var12.tileHeights[var60];
                     int var41 = var40[var37][var39] + var40[var36][var39] + var40[var37][var38] + var40[var36][var38] >> 2;
                     int var42 = (var34 << 6) + (var15 << 7);
                     int var43 = (var16 << 7) + (var35 << 6);
                     Scene var44 = var12.scene;
                     boolean var10004;
                     if (0 == var63.int1 * -1900812067) {
                        if (var21 <= -1719085082) {
                           throw new IllegalStateException();
                        }

                        var10004 = true;
                     } else {
                        var10004 = false;
                     }

                     long var45 = class236.calculateTag(var13, var15, var16, 2, var10004, var17, var12.id * 577964535, -1329739818);
                     int var47 = (var18 << 6) + var19;
                     if (1 == 1768476057 * var63.int3) {
                        var47 += 256;
                     }

                     if (var19 == 22) {
                        Object var48;
                        if (var33 == -1 && var63.transforms == null) {
                           var48 = var63.getModel(22, var18, var40, var42, var41, var43, -1389358267);
                        } else {
                           var48 = new DynamicObject(var12, var17, 22, var18, var60, var15, var16, var33, var63.boolean3, var23);
                        }

                        Scene.method5745(var44, var13, var15, var16, var41, (Renderable)var48, var45, var47);
                        if (1 == var63.interactType * 756705879) {
                           if (var21 <= -1719085082) {
                              throw new IllegalStateException();
                           }

                           if (null != var61) {
                              if (var21 <= -1719085082) {
                                 return;
                              }

                              var61.setBlockedByFloorDec(var15, var16, (byte)56);
                           }
                        }
                     } else {
                        label1073: {
                           if (10 != var19) {
                              if (var21 <= -1719085082) {
                                 throw new IllegalStateException();
                              }

                              if (11 != var19) {
                                 if (var19 >= 12) {
                                    if (var21 <= -1719085082) {
                                       return;
                                    }

                                    Object var66;
                                    label983: {
                                       if (var33 == -1) {
                                          if (var21 <= -1719085082) {
                                             throw new IllegalStateException();
                                          }

                                          if (var63.transforms == null) {
                                             if (var21 <= -1719085082) {
                                                return;
                                             }

                                             var66 = var63.getModel(var19, var18, var40, var42, var41, var43, -247518158);
                                             break label983;
                                          }
                                       }

                                       var66 = new DynamicObject(var12, var17, var19, var18, var60, var15, var16, var33, var63.boolean3, var23);
                                    }

                                    var44.method5502(var13, var15, var16, var41, 1, 1, (Renderable)var66, 0, var45, var47);
                                    if (756705879 * var63.interactType != 0) {
                                       if (var21 <= -1719085082) {
                                          throw new IllegalStateException();
                                       }

                                       if (null != var61) {
                                          CollisionMap.method6417(var61, var15, var16, var34, var35, var63.boolean1, 67663564);
                                       }
                                    }
                                 } else if (0 == var19) {
                                    if (var21 <= -1719085082) {
                                       throw new IllegalStateException();
                                    }

                                    Object var67;
                                    if (var33 == -1 && var63.transforms == null) {
                                       var67 = var63.getModel(0, var18, var40, var42, var41, var43, -1265115870);
                                    } else {
                                       var67 = new DynamicObject(var12, var17, 0, var18, var60, var15, var16, var33, var63.boolean3, var23);
                                    }

                                    var44.newBoundaryObject(var13, var15, var16, var41, (Renderable)var67, null, Tiles.field602[var18], 0, var45, var47);
                                    if (0 != 756705879 * var63.interactType) {
                                       if (var21 <= -1719085082) {
                                          throw new IllegalStateException();
                                       }

                                       if (null != var61) {
                                          if (var21 <= -1719085082) {
                                             return;
                                          }

                                          CollisionMap.method6408(var61, var15, var16, var19, var18, var63.boolean1, -857405059);
                                       }
                                    }
                                 } else if (1 == var19) {
                                    if (var21 <= -1719085082) {
                                       return;
                                    }

                                    Object var68;
                                    label957: {
                                       if (var33 == -1) {
                                          if (var21 <= -1719085082) {
                                             throw new IllegalStateException();
                                          }

                                          if (var63.transforms == null) {
                                             if (var21 <= -1719085082) {
                                                return;
                                             }

                                             var68 = var63.getModel(1, var18, var40, var42, var41, var43, -458716637);
                                             break label957;
                                          }
                                       }

                                       var68 = new DynamicObject(var12, var17, 1, var18, var60, var15, var16, var33, var63.boolean3, var23);
                                    }

                                    var44.newBoundaryObject(var13, var15, var16, var41, (Renderable)var68, null, Tiles.field605[var18], 0, var45, var47);
                                    if (756705879 * var63.interactType != 0) {
                                       if (var21 <= -1719085082) {
                                          return;
                                       }

                                       if (null != var61) {
                                          CollisionMap.method6408(var61, var15, var16, var19, var18, var63.boolean1, 676360955);
                                       }
                                    }
                                 } else if (var19 == 2) {
                                    Object var49;
                                    Object var50;
                                    int var69;
                                    label970: {
                                       var69 = var18 + 1 & 3;
                                       if (var33 == -1) {
                                          if (var21 <= -1719085082) {
                                             throw new IllegalStateException();
                                          }

                                          if (null == var63.transforms) {
                                             var49 = var63.getModel(2, var18 + 4, var40, var42, var41, var43, -269505203);
                                             var50 = var63.getModel(2, var69, var40, var42, var41, var43, -1565885938);
                                             break label970;
                                          }
                                       }

                                       var49 = new DynamicObject(var12, var17, 2, var18 + 4, var60, var15, var16, var33, var63.boolean3, var23);
                                       var50 = new DynamicObject(var12, var17, 2, var69, var60, var15, var16, var33, var63.boolean3, var24);
                                    }

                                    var44.newBoundaryObject(
                                       var13,
                                       var15,
                                       var16,
                                       var41,
                                       (Renderable)var49,
                                       (Renderable)var50,
                                       Tiles.field602[var18],
                                       Tiles.field602[var69],
                                       var45,
                                       var47
                                    );
                                    if (0 != 756705879 * var63.interactType && var61 != null) {
                                       if (var21 <= -1719085082) {
                                          return;
                                       }

                                       CollisionMap.method6408(var61, var15, var16, var19, var18, var63.boolean1, 1411158181);
                                    }
                                 } else if (3 == var19) {
                                    if (var21 <= -1719085082) {
                                       throw new IllegalStateException();
                                    }

                                    Object var70;
                                    label976: {
                                       if (var33 == -1) {
                                          if (var21 <= -1719085082) {
                                             throw new IllegalStateException();
                                          }

                                          if (null == var63.transforms) {
                                             var70 = var63.getModel(3, var18, var40, var42, var41, var43, 54627777);
                                             break label976;
                                          }
                                       }

                                       var70 = new DynamicObject(var12, var17, 3, var18, var60, var15, var16, var33, var63.boolean3, var23);
                                    }

                                    var44.newBoundaryObject(var13, var15, var16, var41, (Renderable)var70, null, Tiles.field605[var18], 0, var45, var47);
                                    if (0 != 756705879 * var63.interactType) {
                                       if (var21 <= -1719085082) {
                                          return;
                                       }

                                       if (var61 != null) {
                                          if (var21 <= -1719085082) {
                                             throw new IllegalStateException();
                                          }

                                          CollisionMap.method6408(var61, var15, var16, var19, var18, var63.boolean1, -463880064);
                                       }
                                    }
                                 } else if (var19 == 9) {
                                    if (var21 <= -1719085082) {
                                       throw new IllegalStateException();
                                    }

                                    Object var71;
                                    label939: {
                                       if (var33 == -1) {
                                          if (var21 <= -1719085082) {
                                             throw new IllegalStateException();
                                          }

                                          if (var63.transforms == null) {
                                             if (var21 <= -1719085082) {
                                                throw new IllegalStateException();
                                             }

                                             var71 = var63.getModel(var19, var18, var40, var42, var41, var43, -1677662385);
                                             break label939;
                                          }
                                       }

                                       var71 = new DynamicObject(var12, var17, var19, var18, var60, var15, var16, var33, var63.boolean3, var23);
                                    }

                                    var44.method5502(var13, var15, var16, var41, 1, 1, (Renderable)var71, 0, var45, var47);
                                    if (0 != var63.interactType * 756705879) {
                                       if (var21 <= -1719085082) {
                                          throw new IllegalStateException();
                                       }

                                       if (null != var61) {
                                          if (var21 <= -1719085082) {
                                             return;
                                          }

                                          CollisionMap.method6417(var61, var15, var16, var34, var35, var63.boolean1, 260900196);
                                       }
                                    }
                                 } else if (4 == var19) {
                                    Object var72;
                                    label1017: {
                                       if (-1 == var33) {
                                          if (var21 <= -1719085082) {
                                             return;
                                          }

                                          if (var63.transforms == null) {
                                             if (var21 <= -1719085082) {
                                                return;
                                             }

                                             var72 = var63.getModel(4, var18, var40, var42, var41, var43, -1590120339);
                                             break label1017;
                                          }
                                       }

                                       var72 = new DynamicObject(var12, var17, 4, var18, var60, var15, var16, var33, var63.boolean3, var23);
                                    }

                                    var44.newWallDecoration(var13, var15, var16, var41, (Renderable)var72, null, Tiles.field602[var18], 0, 0, 0, var45, var47);
                                 } else if (var19 == 5) {
                                    if (var21 <= -1719085082) {
                                       throw new IllegalStateException();
                                    }

                                    int var73 = 16;
                                    long var77 = Scene.method5731(var44, var13, var15, var16);
                                    if (var77 != 0L) {
                                       var73 = AsyncHttpResponse.getObjectDefinition(HorizontalAlignment.Entity_unpackID(var77), 2086773846).int2 * 854845213;
                                    }

                                    Object var51;
                                    label1008: {
                                       if (-1 == var33) {
                                          if (var21 <= -1719085082) {
                                             throw new IllegalStateException();
                                          }

                                          if (var63.transforms == null) {
                                             if (var21 <= -1719085082) {
                                                throw new IllegalStateException();
                                             }

                                             var51 = var63.getModel(4, var18, var40, var42, var41, var43, -1247677611);
                                             break label1008;
                                          }
                                       }

                                       var51 = new DynamicObject(var12, var17, 4, var18, var60, var15, var16, var33, var63.boolean3, var23);
                                    }

                                    var44.newWallDecoration(
                                       var13,
                                       var15,
                                       var16,
                                       var41,
                                       (Renderable)var51,
                                       null,
                                       Tiles.field602[var18],
                                       0,
                                       Tiles.field604[var18] * var73,
                                       Tiles.field603[var18] * var73,
                                       var45,
                                       var47
                                    );
                                 } else if (var19 == 6) {
                                    if (var21 <= -1719085082) {
                                       throw new IllegalStateException();
                                    }

                                    int var74 = 8;
                                    long var78 = Scene.method5731(var44, var13, var15, var16);
                                    if (0L != var78) {
                                       if (var21 <= -1719085082) {
                                          throw new IllegalStateException();
                                       }

                                       var74 = AsyncHttpResponse.getObjectDefinition(HorizontalAlignment.Entity_unpackID(var78), 2142963479).int2
                                          * 854845213
                                          / 2;
                                    }

                                    Object var81;
                                    label1023: {
                                       if (var33 == -1) {
                                          if (var21 <= -1719085082) {
                                             throw new IllegalStateException();
                                          }

                                          if (var63.transforms == null) {
                                             if (var21 <= -1719085082) {
                                                return;
                                             }

                                             var81 = var63.getModel(4, var18 + 4, var40, var42, var41, var43, -1567704823);
                                             break label1023;
                                          }
                                       }

                                       var81 = new DynamicObject(var12, var17, 4, var18 + 4, var60, var15, var16, var33, var63.boolean3, var23);
                                    }

                                    var44.newWallDecoration(
                                       var13,
                                       var15,
                                       var16,
                                       var41,
                                       (Renderable)var81,
                                       null,
                                       256,
                                       var18,
                                       var74 * Tiles.field606[var18],
                                       var74 * Tiles.field607[var18],
                                       var45,
                                       var47
                                    );
                                 } else if (var19 == 7) {
                                    if (var21 <= -1719085082) {
                                       throw new IllegalStateException();
                                    }

                                    Object var75;
                                    int var79;
                                    label1000: {
                                       var79 = var18 + 2 & 3;
                                       if (-1 == var33) {
                                          if (var21 <= -1719085082) {
                                             throw new IllegalStateException();
                                          }

                                          if (var63.transforms == null) {
                                             if (var21 <= -1719085082) {
                                                throw new IllegalStateException();
                                             }

                                             var75 = var63.getModel(4, var79 + 4, var40, var42, var41, var43, -481157493);
                                             break label1000;
                                          }
                                       }

                                       var75 = new DynamicObject(var12, var17, 4, var79 + 4, var60, var15, var16, var33, var63.boolean3, var23);
                                    }

                                    var44.newWallDecoration(var13, var15, var16, var41, (Renderable)var75, null, 256, var79, 0, 0, var45, var47);
                                 } else if (var19 == 8) {
                                    if (var21 <= -1719085082) {
                                       throw new IllegalStateException();
                                    }

                                    int var76 = 8;
                                    long var80 = Scene.method5731(var44, var13, var15, var16);
                                    if (var80 != 0L) {
                                       if (var21 <= -1719085082) {
                                          throw new IllegalStateException();
                                       }

                                       var76 = AsyncHttpResponse.getObjectDefinition(HorizontalAlignment.Entity_unpackID(var80), 2089665677).int2
                                          * 854845213
                                          / 2;
                                    }

                                    Object var52;
                                    Object var82;
                                    label990: {
                                       int var53 = 2 + var18 & 3;
                                       if (var33 == -1) {
                                          if (var21 <= -1719085082) {
                                             throw new IllegalStateException();
                                          }

                                          if (null == var63.transforms) {
                                             if (var21 <= -1719085082) {
                                                throw new IllegalStateException();
                                             }

                                             var82 = var63.getModel(4, var18 + 4, var40, var42, var41, var43, -1897758167);
                                             var52 = var63.getModel(4, 4 + var53, var40, var42, var41, var43, -1959359497);
                                             break label990;
                                          }
                                       }

                                       var82 = new DynamicObject(var12, var17, 4, var18 + 4, var60, var15, var16, var33, var63.boolean3, var23);
                                       var52 = new DynamicObject(var12, var17, 4, var53 + 4, var60, var15, var16, var33, var63.boolean3, var24);
                                    }

                                    var44.newWallDecoration(
                                       var13,
                                       var15,
                                       var16,
                                       var41,
                                       (Renderable)var82,
                                       (Renderable)var52,
                                       256,
                                       var18,
                                       Tiles.field606[var18] * var76,
                                       Tiles.field607[var18] * var76,
                                       var45,
                                       var47
                                    );
                                 }
                                 break label1073;
                              }

                              if (var21 <= -1719085082) {
                                 return;
                              }
                           }

                           Object var65;
                           label964: {
                              if (var33 == -1) {
                                 if (var21 <= -1719085082) {
                                    throw new IllegalStateException();
                                 }

                                 if (null == var63.transforms) {
                                    if (var21 <= -1719085082) {
                                       throw new IllegalStateException();
                                    }

                                    var65 = var63.getModel(10, var18, var40, var42, var41, var43, -170909906);
                                    break label964;
                                 }
                              }

                              var65 = new DynamicObject(var12, var17, 10, var18, var60, var15, var16, var33, var63.boolean3, var23);
                           }

                           if (null != var65) {
                              if (var21 <= -1719085082) {
                                 throw new IllegalStateException();
                              }

                              short var10008;
                              if (var19 == 11) {
                                 if (var21 <= -1719085082) {
                                    throw new IllegalStateException();
                                 }

                                 var10008 = 256;
                              } else {
                                 var10008 = 0;
                              }

                              var44.method5502(var13, var15, var16, var41, var34, var35, (Renderable)var65, var10008, var45, var47);
                           }

                           if (756705879 * var63.interactType != 0) {
                              if (var21 <= -1719085082) {
                                 throw new IllegalStateException();
                              }

                              if (var61 != null) {
                                 if (var21 <= -1719085082) {
                                    return;
                                 }

                                 CollisionMap.method6417(var61, var15, var16, var34, var35, var63.boolean1, 35559696);
                              }
                           }
                        }
                     }

                     var63 = AsyncHttpResponse.getObjectDefinition(var17, 2029955503);
                     if (var63 != null && var63.hasSound(1476793453)) {
                        if (var21 <= -1719085082) {
                           throw new IllegalStateException();
                        }

                        var12.createObjectSound(var60, var15, var16, var63, var18, 1580200038);
                     }
                  }
               }
            }
         } catch (RuntimeException var56) {
            throw RestClientThreadFactory.newRunException(var56, "fj.lj(" + ')');
         }
      } finally {
         client.isLowDetail = var10;
      }
   }

   class150(class154 var1) {
      this.this$0 = var1;
      this.field1801 = 1591361979;
   }
}
