import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ug")
public class class545 {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field6052 = 10;
   @ObfuscatedName("aw")
   static int[] field6044 = new int[32768];
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field6046 = 63;
   @ToRemove(unused = "true")
   @ObfuscatedName("cq")
   static final int field6055 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field6045 = 127;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field6048 = 64;
   @ObfuscatedName("ap")
   public static int[] field6056;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field6050 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field6051 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   static final int field6054 = 49;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field6049 = 896;
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   public static final int field6053 = 43;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   public static final int field6047 = 2;

   static {
      for (int var0 = 0; var0 < 32768; var0++) {
         int[] var1 = field6044;
         double var4 = (var0 >> 10 & 31) / 31.0;
         double var6 = (var0 >> 5 & 31) / 31.0;
         double var8 = (var0 & 31) / 31.0;
         double var10 = var4;
         if (var6 < var4) {
            var10 = var6;
         }

         if (var8 < var10) {
            var10 = var8;
         }

         double var12 = var4;
         if (var6 > var4) {
            var12 = var6;
         }

         if (var8 > var12) {
            var12 = var8;
         }

         double var14 = 0.0;
         double var16 = 0.0;
         double var18 = (var12 + var10) / 2.0;
         if (var12 != var10) {
            if (var18 < 0.5) {
               var16 = (var12 - var10) / (var10 + var12);
            }

            if (var18 >= 0.5) {
               var16 = (var12 - var10) / (2.0 - var12 - var10);
            }

            if (var12 == var4) {
               var14 = (var6 - var8) / (var12 - var10);
            } else if (var6 == var12) {
               var14 = 2.0 + (var8 - var4) / (var12 - var10);
            } else if (var12 == var8) {
               var14 = (var4 - var6) / (var12 - var10) + 4.0;
            }
         }

         int var20 = (int)(256.0 * var14 / 6.0);
         var20 &= 255;
         double var21 = 256.0 * var16;
         if (var21 < 0.0) {
            var21 = 0.0;
         } else if (var21 > 255.0) {
            var21 = 255.0;
         }

         if (var18 > 0.7) {
            var21 /= 2.0;
            var21 = Math.floor(var21);
         }

         if (var18 > 0.75) {
            var21 /= 2.0;
            var21 = Math.floor(var21);
         }

         if (var18 > 0.85) {
            var21 /= 2.0;
            var21 = Math.floor(var21);
         }

         if (var18 > 0.95) {
            var21 /= 2.0;
            var21 = Math.floor(var21);
         }

         if (var18 > 0.995) {
            var18 = 0.995;
         }

         int var23 = (int)(var20 / 4 * 8 + var21 / 32.0);
         int var3 = (int)(128.0 * var18) + (var23 << 7);
         var1[var0] = var3;
      }

      method11160(-1563030653);
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("ct")
   static int method11165(int var0, Script var1, boolean var2, int var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ug.ct(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("at")
   public static int method11161(int var0, byte var1) {
      try {
         return 255 - (var0 & 0xFF);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ug.at(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   public static int method11162(int var0) {
      return 1952551859 - (var0 & -2098293777);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public static int method11163(int var0) {
      return 255 - (var0 & 2065030670);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   static void method11160(int var0) {
      try {
         if (null == field6056) {
            field6056 = new int[65536];
            double var1 = 0.95F;

            for (int var3 = 0; var3 < 65536; var3++) {
               if (var0 == 332291898) {
                  return;
               }

               double var4 = 0.0078125 + (var3 >> 10 & 63) / 64.0;
               double var6 = 0.0625 + (var3 >> 7 & 7) / 8.0;
               double var8 = (var3 & 127) / 128.0;
               double var10 = var8;
               double var12 = var8;
               double var14 = var8;
               if (var6 != 0.0) {
                  double var16;
                  if (var8 < 0.5) {
                     if (var0 == 332291898) {
                        throw new IllegalStateException();
                     }

                     var16 = (var6 + 1.0) * var8;
                  } else {
                     var16 = var8 + var6 - var6 * var8;
                  }

                  double var18 = 2.0 * var8 - var16;
                  double var20 = 0.3333333333333333 + var4;
                  if (var20 > 1.0) {
                     if (var0 == 332291898) {
                        return;
                     }

                     var20--;
                  }

                  double var24 = var4 - 0.3333333333333333;
                  if (var24 < 0.0) {
                     if (var0 == 332291898) {
                        throw new IllegalStateException();
                     }

                     var24++;
                  }

                  if (6.0 * var20 < 1.0) {
                     if (var0 == 332291898) {
                        throw new IllegalStateException();
                     }

                     var10 = 6.0 * (var16 - var18) * var20 + var18;
                  } else if (2.0 * var20 < 1.0) {
                     if (var0 == 332291898) {
                        return;
                     }

                     var10 = var16;
                  } else if (3.0 * var20 < 2.0) {
                     if (var0 == 332291898) {
                        throw new IllegalStateException();
                     }

                     var10 = 6.0 * ((0.6666666666666666 - var20) * (var16 - var18)) + var18;
                  } else {
                     var10 = var18;
                  }

                  if (var4 * 6.0 < 1.0) {
                     if (var0 == 332291898) {
                        throw new IllegalStateException();
                     }

                     var12 = var18 + var4 * ((var16 - var18) * 6.0);
                  } else if (var4 * 2.0 < 1.0) {
                     if (var0 == 332291898) {
                        throw new IllegalStateException();
                     }

                     var12 = var16;
                  } else if (3.0 * var4 < 2.0) {
                     if (var0 == 332291898) {
                        throw new IllegalStateException();
                     }

                     var12 = var18 + (0.6666666666666666 - var4) * (var16 - var18) * 6.0;
                  } else {
                     var12 = var18;
                  }

                  if (6.0 * var24 < 1.0) {
                     if (var0 == 332291898) {
                        throw new IllegalStateException();
                     }

                     var14 = var18 + (var16 - var18) * 6.0 * var24;
                  } else if (var24 * 2.0 < 1.0) {
                     if (var0 == 332291898) {
                        throw new IllegalStateException();
                     }

                     var14 = var16;
                  } else if (3.0 * var24 < 2.0) {
                     if (var0 == 332291898) {
                        return;
                     }

                     var14 = (0.6666666666666666 - var24) * (var16 - var18) * 6.0 + var18;
                  } else {
                     var14 = var18;
                  }
               }

               var10 = Math.pow(var10, var1);
               var12 = Math.pow(var12, var1);
               var14 = Math.pow(var14, var1);
               int var30 = (int)(256.0 * var10);
               int var17 = (int)(var12 * 256.0);
               int var31 = (int)(256.0 * var14);
               int var19 = (var17 << 8) + (var30 << 16) + var31;
               field6056[var3] = var19 & 16777215;
            }
         }
      } catch (RuntimeException var26) {
         throw RestClientThreadFactory.newRunException(var26, "ug.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public static int method11164(int var0) {
      return 255 - (var0 & 0xFF);
   }

   class545() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "([Lof;IIIIIIIIIII)V")
   @ObfuscatedName("nc")
   static final void updateInterface(
      Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11
   ) {
      client.method1791(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);

      try {
         for (int var12 = var1; var12 <= var2; var12++) {
            Widget var13 = var0[var12];
            if (null != var13
               && var3 == 794900977 * var13.parentId
               && var4 == 1865628485 * var13.field4451
               && (
                  Widget.method8060(var13, -219595018)
                     || class191.getWidgetFlags(var13, (byte)75) != 0
                     || class69.getWidgetFlags2(var13, (byte)-5) != 0
                     || client.clickedWidgetParent == var13
               )
               && (
                  var13.isIf3
                     ? !class330.isComponentHidden(var13, (byte)-56)
                     : 928687775 * var13.type != 0 || var13 == class330.mousedOverWidgetIf1 || !class330.isComponentHidden(var13, (byte)-25)
               )) {
               if (11 == 928687775 * var13.type) {
                  if (var11 == 1232247124) {
                     return;
                  }

                  if (var13.method8143(class226.widgetDefinition, class164.urlRequester, -691285690)) {
                     if (var13.method8113((byte)14)) {
                        class376.invalidateWidget(var13, (byte)5);
                        class339.revalidateWidgetScroll(var13.children, var13, true, -518450788);
                        class234.method5918(
                           class225.method5282(Widget.method8141(var13, 621875208), (byte)-52),
                           3,
                           Widget.method8141(var13, 1274205259).method5322((byte)-72),
                           953143368
                        );
                     }

                     if (var13.onTimer != null) {
                        ScriptEvent var14 = new ScriptEvent();
                        var14.widget = var13;
                        var14.args = var13.onTimer;
                        client.scriptEvents.addFirst(var14);
                     }
                  }
               } else if (var13.type * 928687775 == 12 && var13.method8170(class226.widgetDefinition, (byte)-17)) {
                  class376.invalidateWidget(var13, (byte)5);
               }

               int var31 = var9 + var13.x * -814361553;
               int var15 = var10 + var13.y * -286860451;
               int var16;
               int var17;
               int var18;
               int var19;
               if (928687775 * var13.type == 9) {
                  int var20 = var31;
                  int var21 = var15;
                  int var22 = -1946208531 * var13.width + var31;
                  int var23 = -905446999 * var13.height + var15;
                  if (var22 < var31) {
                     var20 = var22;
                     var22 = var31;
                  }

                  if (var23 < var15) {
                     if (var11 == 1232247124) {
                        return;
                     }

                     var21 = var23;
                     var23 = var15;
                  }

                  var22++;
                  var23++;
                  var16 = var20 > var5 ? var20 : var5;
                  int var10000;
                  if (var21 > var6) {
                     if (var11 == 1232247124) {
                        return;
                     }

                     var10000 = var21;
                  } else {
                     var10000 = var6;
                  }

                  var17 = var10000;
                  var18 = var22 < var7 ? var22 : var7;
                  var19 = var23 < var8 ? var23 : var8;
               } else {
                  int var32 = var31 + var13.width * -1946208531;
                  int var34 = -905446999 * var13.height + var15;
                  int var88;
                  if (var31 > var5) {
                     if (var11 == 1232247124) {
                        return;
                     }

                     var88 = var31;
                  } else {
                     var88 = var5;
                  }

                  var16 = var88;
                  var17 = var15 > var6 ? var15 : var6;
                  var18 = var32 < var7 ? var32 : var7;
                  var19 = var34 < var8 ? var34 : var8;
               }

               if (var13 == client.clickedWidget) {
                  client.field796 = true;
                  client.field844 = 878443989 * var31;
                  client.field860 = var15 * 1930024591;
               }

               boolean var33 = false;
               if (var13.field4460) {
                  switch (-976706363 * client.field636) {
                     case 0:
                        var33 = true;
                     case 1:
                     default:
                        break;
                     case 2:
                        if (client.field733 * 1031483927 == 278777747 * var13.id >>> 16) {
                           if (var11 == 1232247124) {
                              return;
                           }

                           var33 = true;
                        }
                        break;
                     case 3:
                        if (var13.id * 278777747 == client.field733 * 1031483927) {
                           var33 = true;
                        }
                  }
               }

               if (!var33 && var13.isIf3) {
                  if (var16 >= var18) {
                     continue;
                  }

                  if (var17 >= var19) {
                     if (var11 == 1232247124) {
                        return;
                     }
                     continue;
                  }
               }

               if (var13.isIf3) {
                  if (var13.noClickThrough) {
                     if (MouseHandler.MouseHandler_x * 1856325427 >= var16
                        && -1427762751 * MouseHandler.MouseHandler_y >= var17
                        && 1856325427 * MouseHandler.MouseHandler_x < var18) {
                        if (var11 == 1232247124) {
                           return;
                        }

                        if (MouseHandler.MouseHandler_y * -1427762751 < var19) {
                           if (var11 == 1232247124) {
                              return;
                           }

                           for (ScriptEvent var35 = (ScriptEvent)client.scriptEvents.last(); null != var35; var35 = (ScriptEvent)client.scriptEvents.previous()) {
                              if (var35.field535) {
                                 var35.remove();
                                 var35.widget.field4571 = false;
                              }
                           }

                           class30.method1309((byte)102);
                           if (class201.widgetDragDuration * 1375819053 == 0) {
                              client.clickedWidget = null;
                              client.clickedWidgetParent = null;
                           }

                           if (!client.isMenuOpen) {
                              class33.addCancelMenuEntry(-433401203);
                           }
                        }
                     }
                  } else if (var13.noScrollThrough
                     && 1856325427 * MouseHandler.MouseHandler_x >= var16
                     && -1427762751 * MouseHandler.MouseHandler_y >= var17
                     && 1856325427 * MouseHandler.MouseHandler_x < var18) {
                     if (var11 == 1232247124) {
                        return;
                     }

                     if (-1427762751 * MouseHandler.MouseHandler_y < var19) {
                        for (ScriptEvent var36 = (ScriptEvent)client.scriptEvents.last(); null != var36; var36 = (ScriptEvent)client.scriptEvents.previous()) {
                           if (var36.field535 && var36.args == var36.widget.onVarTransmit) {
                              var36.remove();
                           }
                        }
                     }
                  }
               }

               int var37 = 1856325427 * MouseHandler.MouseHandler_x;
               int var39 = -1427762751 * MouseHandler.MouseHandler_y;
               if (0 != MouseHandler.MouseHandler_lastButton * 1721626731) {
                  var37 = -1018773713 * MouseHandler.MouseHandler_lastPressedX;
                  var39 = MouseHandler.MouseHandler_lastPressedY * -261967643;
               }

               boolean var89;
               label1178: {
                  if (var37 >= var16) {
                     if (var11 == 1232247124) {
                        return;
                     }

                     if (var39 >= var17 && var37 < var18 && var39 < var19) {
                        if (var11 == 1232247124) {
                           return;
                        }

                        var89 = true;
                        break label1178;
                     }
                  }

                  var89 = false;
               }

               boolean var41 = var89;
               if (var13.contentType * 1889823193 == 1337) {
                  if (!client.isLoading && !client.isMenuOpen && var41) {
                     class62.addSceneMenuOptions(var37, var39, var16, var17, -1050697004);
                  }
               } else if (1338 == var13.contentType * 1889823193) {
                  if (var11 == 1232247124) {
                     return;
                  }

                  class1.checkIfMinimapClicked(var13, var31, var15, 964510254);
               } else {
                  if (1400 == var13.contentType * 1889823193) {
                     Skills.worldMap
                        .onCycle(
                           MouseHandler.MouseHandler_x * 1856325427,
                           -1427762751 * MouseHandler.MouseHandler_y,
                           var41,
                           var31,
                           var15,
                           var13.width * -1946208531,
                           var13.height * -905446999,
                           758379863
                        );
                  }

                  if (!client.isMenuOpen && var41) {
                     if (var13.contentType * 1889823193 == 1400) {
                        Skills.worldMap.addElementMenuOptions(var31, var15, -1946208531 * var13.width, -905446999 * var13.height, var37, var39, 1238743849);
                     } else {
                        WorldMapScaleHandler.Widget_addToMenu(var13, -1553701375);
                     }
                  }

                  if (var33) {
                     for (int var24 = 0; var24 < var13.field4557.length; var24++) {
                        if (var11 == 1232247124) {
                           return;
                        }

                        boolean var25;
                        boolean var26;
                        var25 = false;
                        var26 = false;
                        label1122:
                        if (!var25 && null != var13.field4557[var24]) {
                           int var27 = 0;

                           while (true) {
                              if (var27 >= var13.field4557[var24].length) {
                                 break label1122;
                              }

                              boolean var28 = false;
                              if (var13.field4595 != null) {
                                 if (var11 == 1232247124) {
                                    return;
                                 }

                                 var28 = IndexCheck.method6514(client.indexCheck, var13.field4557[var24][var27], (short)1337);
                              }

                              label1227: {
                                 if (!class142.method4017(var13.field4557[var24][var27], -240032281)) {
                                    if (!var28) {
                                       break label1227;
                                    }

                                    if (var11 == 1232247124) {
                                       return;
                                    }
                                 }

                                 var25 = true;
                                 if (var13.field4595 != null && var13.field4595[var24] > client.cycle * 1759706017) {
                                    break label1122;
                                 }

                                 byte var29 = var13.field4452[var24][var27];
                                 if (var29 == 0) {
                                    break;
                                 }

                                 if (var11 == 1232247124) {
                                    return;
                                 }

                                 if ((var29 & 8) != 0) {
                                    if (IndexCheck.method6514(client.indexCheck, 86, (short)1337)) {
                                       break label1227;
                                    }

                                    if (var11 == 1232247124) {
                                       return;
                                    }

                                    if (IndexCheck.method6514(client.indexCheck, 82, (short)1337)) {
                                       break label1227;
                                    }

                                    if (var11 == 1232247124) {
                                       return;
                                    }

                                    if (IndexCheck.method6514(client.indexCheck, 81, (short)1337)) {
                                       break label1227;
                                    }
                                 }

                                 if (((var29 & 2) == 0 || IndexCheck.method6514(client.indexCheck, 86, (short)1337))
                                    && ((var29 & 1) == 0 || IndexCheck.method6514(client.indexCheck, 82, (short)1337))
                                    && (0 == (var29 & 4) || IndexCheck.method6514(client.indexCheck, 81, (short)1337))) {
                                    break;
                                 }
                              }

                              var27++;
                           }

                           var26 = true;
                        }

                        if (var26) {
                           if (var24 < 10) {
                              FontName.widgetDefaultMenuAction(
                                 var24 + 1, 278777747 * var13.id, 2077538819 * var13.childIndex, var13.itemId * -231674939, "", -1376442236
                              );
                           } else if (10 == var24) {
                              class62.method2636(798665770);
                              class406.method8778(
                                 var13.id * 278777747,
                                 2077538819 * var13.childIndex,
                                 LoginPacket.Widget_unpackTargetMask(class191.getWidgetFlags(var13, (byte)75), -1070777750),
                                 -231674939 * var13.itemId,
                                 (byte)1
                              );
                              client.selectedSpellActionName = ItemComposition.Widget_getSpellActionName(var13, 1761057055);
                              if (client.selectedSpellActionName == null) {
                                 client.selectedSpellActionName = Strings.field4861;
                              }

                              client.selectedSpellName = var13.dataText + class144.colorStartTag(16777215, 1916999785);
                           }

                           int var73 = var13.field4560[var24];
                           if (var13.field4595 == null) {
                              var13.field4595 = new int[var13.field4557.length];
                           }

                           if (var13.field4561 == null) {
                              var13.field4561 = new int[var13.field4557.length];
                           }

                           if (var73 != 0) {
                              if (var13.field4595[var24] == 0) {
                                 var13.field4595[var24] = 1759706017 * client.cycle + var73 + var13.field4561[var24];
                              } else {
                                 var13.field4595[var24] = var73 + client.cycle * 1759706017;
                              }
                           } else {
                              var13.field4595[var24] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var25 && var13.field4595 != null) {
                           var13.field4595[var24] = 0;
                        }
                     }
                  }

                  if (var13.isIf3) {
                     if (1856325427 * MouseHandler.MouseHandler_x >= var16
                        && MouseHandler.MouseHandler_y * -1427762751 >= var17
                        && 1856325427 * MouseHandler.MouseHandler_x < var18
                        && MouseHandler.MouseHandler_y * -1427762751 < var19) {
                        var41 = true;
                     } else {
                        var41 = false;
                     }

                     boolean var43;
                     label1101: {
                        var43 = false;
                        if (1 != MouseHandler.MouseHandler_currentButton * -233863237) {
                           if (UrlRequest.mouseCam || 4 != MouseHandler.MouseHandler_currentButton * -233863237) {
                              break label1101;
                           }

                           if (var11 == 1232247124) {
                              return;
                           }
                        }

                        if (var41) {
                           var43 = true;
                        }
                     }

                     boolean var45 = false;
                     if ((
                           1 == MouseHandler.MouseHandler_lastButton * 1721626731
                              || !UrlRequest.mouseCam && 4 == MouseHandler.MouseHandler_lastButton * 1721626731
                        )
                        && -1018773713 * MouseHandler.MouseHandler_lastPressedX >= var16
                        && -261967643 * MouseHandler.MouseHandler_lastPressedY >= var17
                        && -1018773713 * MouseHandler.MouseHandler_lastPressedX < var18) {
                        if (var11 == 1232247124) {
                           return;
                        }

                        if (-261967643 * MouseHandler.MouseHandler_lastPressedY < var19) {
                           if (var11 == 1232247124) {
                              return;
                           }

                           var45 = true;
                        }
                     }

                     if (var45) {
                        class141.clickWidget(
                           var13,
                           -1018773713 * MouseHandler.MouseHandler_lastPressedX - var31,
                           -261967643 * MouseHandler.MouseHandler_lastPressedY - var15,
                           -1951975841
                        );
                     }

                     if (var13.method8063((short)22886)) {
                        if (var45) {
                           client.field762
                              .addFirst(
                                 new class279(0, 1856325427 * MouseHandler.MouseHandler_x - var31, -1427762751 * MouseHandler.MouseHandler_y - var15, var13)
                              );
                        }

                        if (var43) {
                           client.field762
                              .addFirst(
                                 new class279(1, 1856325427 * MouseHandler.MouseHandler_x - var31, -1427762751 * MouseHandler.MouseHandler_y - var15, var13)
                              );
                        }
                     }

                     if (1400 == 1889823193 * var13.contentType) {
                        if (var11 == 1232247124) {
                           return;
                        }

                        Skills.worldMap.method11377(var37, var39, var41 & var43, var41 & var45, 772812730);
                     }

                     if (client.clickedWidget != null
                        && var13 != client.clickedWidget
                        && var41
                        && classDY.method3598(class191.getWidgetFlags(var13, (byte)75), -1561811723)) {
                        client.draggedOnWidget = var13;
                     }

                     if (var13 == client.clickedWidgetParent) {
                        client.field855 = true;
                        client.field856 = var31 * -397919865;
                        client.field727 = var15 * -920062167;
                     }

                     if (var13.hasListener) {
                        if (var41 && client.mouseWheelRotation * -2138892451 != 0 && null != var13.onVarTransmit) {
                           if (var11 == 1232247124) {
                              return;
                           }

                           ScriptEvent var47 = new ScriptEvent();
                           var47.field535 = true;
                           var47.widget = var13;
                           var47.mouseY = client.mouseWheelRotation * 64266987;
                           var47.args = var13.onVarTransmit;
                           client.scriptEvents.addFirst(var47);
                        }

                        if (client.clickedWidget != null || client.isMenuOpen) {
                           var45 = false;
                           var43 = false;
                           var41 = false;
                        }

                        if (!var13.field4511) {
                           if (var11 == 1232247124) {
                              return;
                           }

                           if (var45) {
                              var13.field4511 = true;
                              if (null != var13.onDialogAbort) {
                                 if (var11 == 1232247124) {
                                    return;
                                 }

                                 ScriptEvent var48 = new ScriptEvent();
                                 var48.field535 = true;
                                 var48.widget = var13;
                                 var48.mouseX = -37518185 * (-1018773713 * MouseHandler.MouseHandler_lastPressedX - var31);
                                 var48.mouseY = -386799897 * (MouseHandler.MouseHandler_lastPressedY * -261967643 - var15);
                                 var48.args = var13.onDialogAbort;
                                 client.scriptEvents.addFirst(var48);
                              }
                           }
                        }

                        if (var13.field4511 && var43) {
                           if (var11 == 1232247124) {
                              return;
                           }

                           if (var13.onMouseRepeat != null) {
                              if (var11 == 1232247124) {
                                 return;
                              }

                              ScriptEvent var49 = new ScriptEvent();
                              var49.field535 = true;
                              var49.widget = var13;
                              var49.mouseX = -37518185 * (MouseHandler.MouseHandler_x * 1856325427 - var31);
                              var49.mouseY = -386799897 * (-1427762751 * MouseHandler.MouseHandler_y - var15);
                              var49.args = var13.onMouseRepeat;
                              client.scriptEvents.addFirst(var49);
                           }
                        }

                        if (var13.field4511 && !var43) {
                           var13.field4511 = false;
                           if (null != var13.field4569) {
                              ScriptEvent var50 = new ScriptEvent();
                              var50.field535 = true;
                              var50.widget = var13;
                              var50.mouseX = (1856325427 * MouseHandler.MouseHandler_x - var31) * -37518185;
                              var50.mouseY = -386799897 * (MouseHandler.MouseHandler_y * -1427762751 - var15);
                              var50.args = var13.field4569;
                              client.scriptEvents3.addFirst(var50);
                           }
                        }

                        if (var43 && var13.onResize != null) {
                           ScriptEvent var51 = new ScriptEvent();
                           var51.field535 = true;
                           var51.widget = var13;
                           var51.mouseX = -37518185 * (1856325427 * MouseHandler.MouseHandler_x - var31);
                           var51.mouseY = -386799897 * (-1427762751 * MouseHandler.MouseHandler_y - var15);
                           var51.args = var13.onResize;
                           client.scriptEvents.addFirst(var51);
                        }

                        if (!var13.field4571 && var41) {
                           var13.field4571 = true;
                           if (var13.field4547 != null) {
                              ScriptEvent var52 = new ScriptEvent();
                              var52.field535 = true;
                              var52.widget = var13;
                              var52.mouseX = (MouseHandler.MouseHandler_x * 1856325427 - var31) * -37518185;
                              var52.mouseY = -386799897 * (MouseHandler.MouseHandler_y * -1427762751 - var15);
                              var52.args = var13.field4547;
                              client.scriptEvents.addFirst(var52);
                           }
                        }

                        if (var13.field4571 && var41 && null != var13.onRelease) {
                           if (var11 == 1232247124) {
                              return;
                           }

                           ScriptEvent var53 = new ScriptEvent();
                           var53.field535 = true;
                           var53.widget = var13;
                           var53.mouseX = (MouseHandler.MouseHandler_x * 1856325427 - var31) * -37518185;
                           var53.mouseY = -386799897 * (-1427762751 * MouseHandler.MouseHandler_y - var15);
                           var53.args = var13.onRelease;
                           client.scriptEvents.addFirst(var53);
                        }

                        if (var13.field4571 && !var41) {
                           var13.field4571 = false;
                           if (null != var13.onMiscTransmit) {
                              ScriptEvent var54 = new ScriptEvent();
                              var54.field535 = true;
                              var54.widget = var13;
                              var54.mouseX = -37518185 * (MouseHandler.MouseHandler_x * 1856325427 - var31);
                              var54.mouseY = (-1427762751 * MouseHandler.MouseHandler_y - var15) * -386799897;
                              var54.args = var13.onMiscTransmit;
                              client.scriptEvents3.addFirst(var54);
                           }
                        }

                        if (null != var13.onTargetEnter) {
                           ScriptEvent var55 = new ScriptEvent();
                           var55.widget = var13;
                           var55.args = var13.onTargetEnter;
                           client.scriptEvents2.addFirst(var55);
                        }

                        if (var13.onLoad != null && client.changedVarpCount * -191208899 > 69055063 * var13.field4513) {
                           if (var11 == 1232247124) {
                              return;
                           }

                           if (var13.varTransmitTriggers != null && client.changedVarpCount * -191208899 - 69055063 * var13.field4513 <= 32) {
                              label1053:
                              for (int var57 = 69055063 * var13.field4513; var57 < -191208899 * client.changedVarpCount; var57++) {
                                 int var74 = client.changedVarps[var57 & 31];

                                 for (int var80 = 0; var80 < var13.varTransmitTriggers.length; var80++) {
                                    if (var74 == var13.varTransmitTriggers[var80]) {
                                       ScriptEvent var85 = new ScriptEvent();
                                       var85.widget = var13;
                                       var85.args = var13.onLoad;
                                       client.scriptEvents.addFirst(var85);
                                       break label1053;
                                    }
                                 }
                              }
                           } else {
                              ScriptEvent var56 = new ScriptEvent();
                              var56.widget = var13;
                              var56.args = var13.onLoad;
                              client.scriptEvents.addFirst(var56);
                           }

                           var13.field4513 = 1397996427 * client.changedVarpCount;
                        }

                        if (null != var13.onStatTransmit && -460472563 * client.changedItemsCount > var13.field4514 * -433459891) {
                           if (null != var13.invTransmitTriggers && client.changedItemsCount * -460472563 - var13.field4514 * -433459891 <= 32) {
                              label1028:
                              for (int var59 = var13.field4514 * -433459891; var59 < -460472563 * client.changedItemsCount; var59++) {
                                 int var75 = client.changedItemContainers[var59 & 31];

                                 for (int var81 = 0; var81 < var13.invTransmitTriggers.length; var81++) {
                                    if (var75 == var13.invTransmitTriggers[var81]) {
                                       ScriptEvent var86 = new ScriptEvent();
                                       var86.widget = var13;
                                       var86.args = var13.onStatTransmit;
                                       client.scriptEvents.addFirst(var86);
                                       break label1028;
                                    }
                                 }
                              }
                           } else {
                              ScriptEvent var58 = new ScriptEvent();
                              var58.widget = var13;
                              var58.args = var13.onStatTransmit;
                              client.scriptEvents.addFirst(var58);
                           }

                           var13.field4514 = 783104193 * client.changedItemsCount;
                        }

                        if (var13.onScroll != null && 407516417 * client.changedSkillsCount > var13.field4515 * 2018191091) {
                           label1009: {
                              if (var13.statTransmitTriggers != null) {
                                 if (407516417 * client.changedSkillsCount - var13.field4515 * 2018191091 <= 32) {
                                    int var61 = 2018191091 * var13.field4515;

                                    while (true) {
                                       if (var61 >= 407516417 * client.changedSkillsCount) {
                                          break label1009;
                                       }

                                       int var76 = client.changedSkills[var61 & 31];

                                       for (int var82 = 0; var82 < var13.statTransmitTriggers.length; var82++) {
                                          if (var13.statTransmitTriggers[var82] == var76) {
                                             ScriptEvent var87 = new ScriptEvent();
                                             var87.widget = var13;
                                             var87.args = var13.onScroll;
                                             client.scriptEvents.addFirst(var87);
                                             break label1009;
                                          }
                                       }

                                       var61++;
                                    }
                                 }

                                 if (var11 == 1232247124) {
                                    return;
                                 }
                              }

                              ScriptEvent var60 = new ScriptEvent();
                              var60.widget = var13;
                              var60.args = var13.onScroll;
                              client.scriptEvents.addFirst(var60);
                           }

                           var13.field4515 = client.changedSkillsCount * -1496606405;
                        }

                        if (-2011583141 * client.chatCycle > var13.field4512 * 698168635 && var13.onInvTransmit != null) {
                           ScriptEvent var62 = new ScriptEvent();
                           var62.widget = var13;
                           var62.args = var13.onInvTransmit;
                           client.scriptEvents.addFirst(var62);
                        }

                        if (client.field869 * 897615935 > var13.field4512 * 698168635 && null != var13.onKey) {
                           ScriptEvent var63 = new ScriptEvent();
                           var63.widget = var13;
                           var63.args = var13.onKey;
                           client.scriptEvents.addFirst(var63);
                        }

                        if (client.field870 * -1315253043 > var13.field4512 * 698168635 && var13.field4567 != null) {
                           ScriptEvent var64 = new ScriptEvent();
                           var64.widget = var13;
                           var64.args = var13.field4567;
                           client.scriptEvents.addFirst(var64);
                        }

                        if (-1633769837 * client.field845 > var13.field4512 * 698168635) {
                           if (var11 == 1232247124) {
                              return;
                           }

                           if (var13.onStockTransmit != null) {
                              ScriptEvent var65 = new ScriptEvent();
                              var65.widget = var13;
                              var65.args = var13.onStockTransmit;
                              client.scriptEvents.addFirst(var65);
                           }
                        }

                        if (client.field872 * -1787912091 > 698168635 * var13.field4512 && var13.onMouseLeave != null) {
                           if (var11 == 1232247124) {
                              return;
                           }

                           ScriptEvent var66 = new ScriptEvent();
                           var66.widget = var13;
                           var66.args = var13.onMouseLeave;
                           client.scriptEvents.addFirst(var66);
                        }

                        if (client.field873 * 1556719127 > 698168635 * var13.field4512 && null != var13.onSubChange) {
                           if (var11 == 1232247124) {
                              return;
                           }

                           ScriptEvent var67 = new ScriptEvent();
                           var67.widget = var13;
                           var67.args = var13.onSubChange;
                           client.scriptEvents.addFirst(var67);
                        }

                        if (client.field874 * 639504709 > var13.field4512 * 698168635) {
                           if (var11 == 1232247124) {
                              return;
                           }

                           if (null != var13.onDragComplete) {
                              ScriptEvent var68 = new ScriptEvent();
                              var68.widget = var13;
                              var68.args = var13.onDragComplete;
                              client.scriptEvents.addFirst(var68);
                           }
                        }

                        if (-1975452093 * client.field883 > 698168635 * var13.field4512 && null != var13.onHold) {
                           ScriptEvent var69 = new ScriptEvent();
                           var69.widget = var13;
                           var69.args = var13.onHold;
                           client.scriptEvents.addFirst(var69);
                        }

                        var13.field4512 = client.cycleCntr * 2138714209;
                        if (null != var13.onDrag) {
                           for (int var70 = 0; var70 < client.field767 * -1698979265; var70++) {
                              if (var11 == 1232247124) {
                                 return;
                              }

                              ScriptEvent var77 = new ScriptEvent();
                              var77.widget = var13;
                              var77.keyTyped = client.field720[var70] * 1219530839;
                              var77.keyPressed = 1545171591 * client.field909[var70];
                              var77.args = var13.onDrag;
                              client.scriptEvents.addFirst(var77);
                           }
                        }

                        if (null != var13.onFriendTransmit) {
                           if (var11 == 1232247124) {
                              return;
                           }

                           int[] var71 = client.indexCheck.method6526(1169373205);

                           for (int var78 = 0; var78 < var71.length; var78++) {
                              ScriptEvent var83 = new ScriptEvent();
                              var83.widget = var13;
                              var83.keyTyped = 1219530839 * var71[var78];
                              var83.args = var13.onFriendTransmit;
                              client.scriptEvents.addFirst(var83);
                           }
                        }

                        if (var13.onClick != null) {
                           if (var11 == 1232247124) {
                              return;
                           }

                           int[] var72 = IndexCheck.method6524(client.indexCheck, -1631973653);

                           for (int var79 = 0; var79 < var72.length; var79++) {
                              ScriptEvent var84 = new ScriptEvent();
                              var84.widget = var13;
                              var84.keyTyped = 1219530839 * var72[var79];
                              var84.args = var13.onClick;
                              client.scriptEvents.addFirst(var84);
                           }
                        }
                     }
                  }

                  if (!var13.isIf3) {
                     if (client.clickedWidget != null) {
                        continue;
                     }

                     if (var11 == 1232247124) {
                        return;
                     }

                     if (client.isMenuOpen) {
                        if (var11 == 1232247124) {
                           return;
                        }
                        continue;
                     }

                     if ((1325862771 * var13.mouseOverRedirect >= 0 || 0 != var13.mouseOverColor * 1479122145)
                        && MouseHandler.MouseHandler_x * 1856325427 >= var16
                        && MouseHandler.MouseHandler_y * -1427762751 >= var17
                        && 1856325427 * MouseHandler.MouseHandler_x < var18
                        && MouseHandler.MouseHandler_y * -1427762751 < var19) {
                        if (var13.mouseOverRedirect * 1325862771 >= 0) {
                           class330.mousedOverWidgetIf1 = var0[var13.mouseOverRedirect * 1325862771];
                        } else {
                           class330.mousedOverWidgetIf1 = var13;
                        }
                     }

                     if (928687775 * var13.type == 8
                        && MouseHandler.MouseHandler_x * 1856325427 >= var16
                        && MouseHandler.MouseHandler_y * -1427762751 >= var17
                        && MouseHandler.MouseHandler_x * 1856325427 < var18
                        && -1427762751 * MouseHandler.MouseHandler_y < var19) {
                        WorldView.field1333 = var13;
                     }

                     if (var13.scrollHeight * -1963554889 > -905446999 * var13.height) {
                        class339.method7871(
                           var13,
                           -1946208531 * var13.width + var31,
                           var15,
                           -905446999 * var13.height,
                           -1963554889 * var13.scrollHeight,
                           MouseHandler.MouseHandler_x * 1856325427,
                           MouseHandler.MouseHandler_y * -1427762751,
                           -714083267
                        );
                     }
                  }

                  if (0 == var13.type * 928687775) {
                     if (var11 == 1232247124) {
                        return;
                     }

                     updateInterface(
                        var0,
                        -1516264759 * var13.field4453,
                        var13.field4454 * -86298045,
                        278777747 * var13.id,
                        var13.childIndex * 2077538819,
                        var16,
                        var17,
                        var18,
                        var19,
                        var31 - 1068149169 * var13.scrollX,
                        var15 - -497311503 * var13.scrollY,
                        1105242075
                     );
                     if (null != var13.children) {
                        updateInterface(
                           var13.children,
                           0,
                           var13.children.length - 1,
                           278777747 * var13.id,
                           -1,
                           var16,
                           var17,
                           var18,
                           var19,
                           var31 - 1068149169 * var13.scrollX,
                           var15 - -497311503 * var13.scrollY,
                           1383089624
                        );
                     }

                     if (-1 == var13.childIndex * 2077538819) {
                        if (var11 == 1232247124) {
                           return;
                        }

                        InterfaceParent var44 = (InterfaceParent)client.interfaceParents.method8915(278777747 * var13.id);
                        if (null != var44) {
                           if (var11 == 1232247124) {
                              return;
                           }

                           if (var44.type * -953539367 == 0
                              && MouseHandler.MouseHandler_x * 1856325427 >= var16
                              && MouseHandler.MouseHandler_y * -1427762751 >= var17) {
                              if (var11 == 1232247124) {
                                 return;
                              }

                              if (MouseHandler.MouseHandler_x * 1856325427 < var18) {
                                 if (var11 == 1232247124) {
                                    return;
                                 }

                                 if (MouseHandler.MouseHandler_y * -1427762751 < var19 && !client.isMenuOpen) {
                                    for (ScriptEvent var46 = (ScriptEvent)client.scriptEvents.last();
                                       null != var46;
                                       var46 = (ScriptEvent)client.scriptEvents.previous()
                                    ) {
                                       if (var46.field535) {
                                          var46.remove();
                                          var46.widget.field4571 = false;
                                       }
                                    }

                                    if (1375819053 * class201.widgetDragDuration == 0) {
                                       if (var11 == 1232247124) {
                                          return;
                                       }

                                       client.clickedWidget = null;
                                       client.clickedWidgetParent = null;
                                    }

                                    if (!client.isMenuOpen) {
                                       if (var11 == 1232247124) {
                                          return;
                                       }

                                       class33.addCancelMenuEntry(-433401203);
                                    }
                                 }
                              }
                           }

                           PcmPlayer.updateRootInterface(var44.group * -1385287145, var16, var17, var18, var19, var31, var15, -722766257);
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var30) {
         throw RestClientThreadFactory.newRunException(var30, "ug.nc(" + ')');
      }
   }
}
