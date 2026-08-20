import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fr")
public class classFR extends classFM {
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field1844 = 500;
   @ObfuscatedName("at")
   byte field1843;
   @ObfuscatedName("lw")
   static int field1846;
   @ObfuscatedName("av")
   int field1842;
   @ToRemove(unused = "true")
   @ObfuscatedName("bw")
   public static final int field1845 = 65;

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod183(Buffer var1) {
      this.field1842 = Buffer.method12008(var1, (byte)5) * 1999864523;
      this.field1843 = Buffer.method12001(var1, (byte)30);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod182(Buffer var1, byte var2) {
      try {
         this.field1842 = Buffer.method12008(var1, (byte)5) * 1999864523;
         this.field1843 = Buffer.method12001(var1, (byte)74);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fr.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod185(ClanSettings var1, byte var2) {
      try {
         var1.method4311(1686786787 * this.field1842, this.field1843, -1415493742);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fr.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod184(Buffer var1) {
      this.field1842 = Buffer.method12008(var1, (byte)5) * 1999864523;
      this.field1843 = Buffer.method12001(var1, (byte)110);
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("ap")
   static int method4049(int var0, Script var1, boolean var2, int var3) {
      try {
         if (100 == var0) {
            if (var3 == -417216683) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 1417452148;
               int var34 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var50 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
               int var61 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
               boolean var98;
               if (Interpreter.Interpreter_intStack[3 + class408.Interpreter_intStackSize * 327716789] != 0) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  }

                  var98 = true;
               } else {
                  var98 = false;
               }

               boolean var70 = var98;
               Widget var78 = class226.widgetDefinition.method7953(var34, -250408112);
               if (928687775 * var78.type != 0) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException("");
                  }
               } else {
                  GrandExchangeOfferOwnWorldComparator.method1278(var78, var61, var70, var1, 555015274);
                  Widget var82 = new Widget();
                  var82.type = var50 * -530909857;
                  var82.parentId = (var82.id = var78.id * 1) * -1601929789;
                  var82.childIndex = 1657618603 * var61;
                  var82.isIf3 = true;
                  if (var50 == 12) {
                     if (var3 == -417216683) {
                        throw new IllegalStateException();
                     }

                     SongTask.method10543(var82, (short)1847);
                  }

                  var78.children[var61] = var82;
                  if (var2) {
                     if (var3 == -417216683) {
                        throw new IllegalStateException();
                     }

                     UserComparator3.scriptDotWidget = var82;
                  } else {
                     class222.scriptActiveWidget = var82;
                  }

                  class376.invalidateWidget(var78, (byte)5);
                  return 1;
               }
            }
         } else if (101 == var0) {
            if (var3 == -417216683) {
               throw new IllegalStateException();
            } else {
               Widget var97;
               if (var2) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  }

                  var97 = UserComparator3.scriptDotWidget;
               } else {
                  var97 = class222.scriptActiveWidget;
               }

               Widget var33 = var97;
               Widget var49 = class226.widgetDefinition.method7953(278777747 * var33.id, 809076250);
               ClickAction.method11249(var33, var49, (short)265);
               class376.invalidateWidget(var49, (byte)5);
               return 1;
            }
         } else if (var0 == 102) {
            class408.Interpreter_intStackSize -= -1793120611;
            int var32 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            Widget var48 = class226.widgetDefinition.method7953(var32, -1797267556);
            var48.children = null;
            class376.invalidateWidget(var48, (byte)5);
            return 1;
         } else if (var0 == 105) {
            class408.Interpreter_intStackSize -= -1084394537;
            int var31 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            int var47 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
            int var60 = Interpreter.Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
            Widget var69 = class226.widgetDefinition.method7953(var31, -521955073);
            Widget var77 = class226.widgetDefinition.getWidgetChild(var31, var47, -2059324749);
            if (null == var69) {
               if (var3 == -417216683) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException("");
               }
            } else if (var47 < 0) {
               if (var3 == -417216683) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException("");
               }
            } else if (var77 == null) {
               throw new RuntimeException("");
            } else if (0 == 928687775 * var77.type) {
               throw new RuntimeException("");
            } else {
               GrandExchangeOfferOwnWorldComparator.method1278(var69, var60, true, var1, -178325953);
               if (-1 != var77.field4451 * 1865628485) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  }

                  Widget var80 = class226.widgetDefinition.getWidgetChild(var31, var77.field4451 * 1865628485, -1384770161);
                  class418.method9195(var80, var60, (byte)0);
               }

               Widget var81 = new Widget(var77);
               var81.childIndex = var60 * 1657618603;
               if (12 == var77.type * 928687775) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  }

                  SongTask.method10543(var81, (short)3197);
               }

               var69.children[var60] = var81;
               if (var2) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  }

                  UserComparator3.scriptDotWidget = var81;
               } else {
                  class222.scriptActiveWidget = var81;
               }

               class376.invalidateWidget(var69, (byte)5);
               return 1;
            }
         } else if (106 == var0) {
            if (var3 == -417216683) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var30 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var46 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
               Widget var96;
               if (var2) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  }

                  var96 = UserComparator3.scriptDotWidget;
               } else {
                  var96 = class222.scriptActiveWidget;
               }

               Widget var59 = var96;
               if (var59 == null) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException("");
                  }
               } else {
                  Widget var68 = class226.widgetDefinition.method7953(var59.parentId * 794900977, -106639346);
                  if (0 != var59.type * 928687775) {
                     if (var3 == -417216683) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException("");
                     }
                  } else if (0 != var68.type * 928687775) {
                     if (var3 == -417216683) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException();
                     }
                  } else {
                     GrandExchangeOfferOwnWorldComparator.method1278(var68, var46, true, var1, -878764398);
                     class418.method9195(var59, var46, (byte)0);
                     Widget var76 = new Widget();
                     var76.type = -530909857 * var30;
                     var76.parentId = (var76.id = 1 * var68.id) * -1601929789;
                     var76.field4451 = var59.childIndex * -1613901657;
                     var76.childIndex = 1657618603 * var46;
                     var76.isIf3 = true;
                     if (var30 == 12) {
                        if (var3 == -417216683) {
                           throw new IllegalStateException();
                        }

                        SongTask.method10543(var76, (short)28856);
                     }

                     var68.children[var46] = var76;
                     if (var2) {
                        if (var3 == -417216683) {
                           throw new IllegalStateException();
                        }

                        UserComparator3.scriptDotWidget = var76;
                     } else {
                        class222.scriptActiveWidget = var76;
                     }

                     class376.invalidateWidget(var68, (byte)5);
                     return 1;
                  }
               }
            }
         } else if (107 == var0) {
            if (var3 == -417216683) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var29 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var45 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
               Widget var95;
               if (var2) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  }

                  var95 = UserComparator3.scriptDotWidget;
               } else {
                  var95 = class222.scriptActiveWidget;
               }

               Widget var58 = var95;
               if (var58 == null) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException("");
                  }
               } else {
                  Widget var67 = class226.widgetDefinition.getWidgetChild(var58.parentId * 794900977, var58.field4451 * 1865628485, -614854875);
                  Widget var75 = class226.widgetDefinition.method7953(794900977 * var67.parentId, 1553818534);
                  if (928687775 * var67.type != 0) {
                     if (var3 == -417216683) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException("");
                     }
                  } else if (0 != var75.type * 928687775) {
                     if (var3 == -417216683) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException();
                     }
                  } else {
                     GrandExchangeOfferOwnWorldComparator.method1278(var75, var45, true, var1, 1385210502);
                     class418.method9195(var67, var45, (byte)0);
                     Widget var79 = new Widget();
                     var79.type = -530909857 * var29;
                     var79.parentId = (var79.id = var75.id * 1) * -1601929789;
                     var79.field4451 = var67.childIndex * -1613901657;
                     var79.childIndex = 1657618603 * var45;
                     var79.isIf3 = true;
                     if (var29 == 12) {
                        if (var3 == -417216683) {
                           throw new IllegalStateException();
                        }

                        SongTask.method10543(var79, (short)28731);
                     }

                     var75.children[var45] = var79;
                     if (var2) {
                        if (var3 == -417216683) {
                           throw new IllegalStateException();
                        }

                        UserComparator3.scriptDotWidget = var79;
                     } else {
                        class222.scriptActiveWidget = var79;
                     }

                     class376.invalidateWidget(var75, (byte)5);
                     return 1;
                  }
               }
            }
         } else if (var0 == 200) {
            class408.Interpreter_intStackSize -= 708726074;
            int var28 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            int var44 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
            Widget var94;
            if (var44 != -1) {
               if (var3 == -417216683) {
                  throw new IllegalStateException();
               }

               var94 = class226.widgetDefinition.getWidgetChild(var28, var44, -613506358);
            } else {
               var94 = null;
            }

            Widget var57 = var94;
            WorldMapRectangle.method7261(var57, var2, -605910890);
            return 1;
         } else if (201 == var0) {
            if (var3 == -417216683) {
               throw new IllegalStateException();
            } else {
               WorldMapRectangle.method7261(
                  class226.widgetDefinition
                     .method7953(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 90707882),
                  var2,
                  -1502104336
               );
               return 1;
            }
         } else if (204 == var0) {
            if (var3 == -417216683) {
               throw new IllegalStateException();
            } else {
               Widget var92;
               if (var2) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  }

                  var92 = UserComparator3.scriptDotWidget;
               } else {
                  var92 = class222.scriptActiveWidget;
               }

               Widget var27 = var92;
               if (null != var27) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  }

                  var92 = class226.widgetDefinition.getWidgetChild(var27.parentId * 794900977, var27.field4451 * 1865628485, -786196098);
               } else {
                  var92 = null;
               }

               Widget var43 = var92;
               WorldMapRectangle.method7261(var43, var2, -1816987106);
               return 1;
            }
         } else if (205 == var0) {
            if (var3 == -417216683) {
               throw new IllegalStateException();
            } else {
               Widget var26 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
               Widget var91;
               if (null != var26) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  }

                  var91 = class226.widgetDefinition.method7953(var26.parentId * 794900977, -595200475);
               } else {
                  var91 = null;
               }

               Widget var42 = var91;
               WorldMapRectangle.method7261(var42, var2, -52259014);
               return 1;
            }
         } else if (var0 == 206) {
            if (var3 == -417216683) {
               throw new IllegalStateException();
            } else {
               Widget var90;
               if (var2) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  }

                  var90 = UserComparator3.scriptDotWidget;
               } else {
                  var90 = class222.scriptActiveWidget;
               }

               Widget var25 = var90;
               if (var25 == null) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  } else {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                     return 1;
                  }
               } else if (var25.childIndex * 2077538819 == -1) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  } else {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                     return 1;
                  }
               } else {
                  Widget var41 = class226.widgetDefinition.method7953(var25.parentId * 794900977, -401724386);
                  Widget var56 = null;

                  for (int var66 = var25.childIndex * 2077538819 + 1; var66 < var41.children.length; var66++) {
                     if (var3 == -417216683) {
                        throw new IllegalStateException();
                     }

                     Widget var74 = var41.children[var66];
                     if (null == var74) {
                        if (var3 == -417216683) {
                           throw new IllegalStateException();
                        }
                     } else if (var74.field4451 * 1865628485 == var25.field4451 * 1865628485) {
                        if (var3 == -417216683) {
                           throw new IllegalStateException();
                        }

                        var56 = var74;
                        break;
                     }
                  }

                  WorldMapRectangle.method7261(var56, var2, -531019462);
                  return 1;
               }
            }
         } else if (207 == var0) {
            if (var3 == -417216683) {
               throw new IllegalStateException();
            } else {
               Widget var89;
               if (var2) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  }

                  var89 = UserComparator3.scriptDotWidget;
               } else {
                  var89 = class222.scriptActiveWidget;
               }

               Widget var24 = var89;
               if (null == var24) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  } else {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                     return 1;
                  }
               } else if (var24.childIndex * 2077538819 == -1) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  } else {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                     return 1;
                  }
               } else {
                  Widget var40 = class226.widgetDefinition.method7953(794900977 * var24.parentId, 1742754275);
                  Widget var55 = null;

                  for (int var65 = 2077538819 * var24.childIndex - 1; var65 >= 0; var65--) {
                     if (var3 == -417216683) {
                        throw new IllegalStateException();
                     }

                     Widget var73 = var40.children[var65];
                     if (var73 == null) {
                        if (var3 == -417216683) {
                           throw new IllegalStateException();
                        }
                     } else if (var24.field4451 * 1865628485 == 1865628485 * var73.field4451) {
                        if (var3 == -417216683) {
                           throw new IllegalStateException();
                        }

                        var55 = var73;
                        break;
                     }
                  }

                  WorldMapRectangle.method7261(var55, var2, -1735081000);
                  return 1;
               }
            }
         } else if (var0 == 208) {
            if (var3 == -417216683) {
               throw new IllegalStateException();
            } else {
               Widget var23 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
               if (null == var23) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  } else {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                     return 1;
                  }
               } else if (0 != var23.type * 928687775) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  } else {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                     return 1;
                  }
               } else {
                  Widget var39 = class226.widgetDefinition.method7953(794900977 * var23.parentId, 939960142);
                  if (var39.children == null) {
                     if (var3 == -417216683) {
                        throw new IllegalStateException();
                     } else {
                        Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                        return 1;
                     }
                  } else {
                     int var54 = 0;

                     for (int var64 = 0; var64 < var39.children.length; var64++) {
                        if (var3 == -417216683) {
                           throw new IllegalStateException();
                        }

                        Widget var72 = var39.children[var64];
                        if (var72 == null) {
                           if (var3 == -417216683) {
                              throw new IllegalStateException();
                           }
                        } else if (1865628485 * var72.field4451 == var23.childIndex * 2077538819) {
                           var54++;
                        }
                     }

                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var54;
                     return 1;
                  }
               }
            }
         } else if (var0 == 209) {
            if (var3 == -417216683) {
               throw new IllegalStateException();
            } else {
               Widget var22 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
               int[] var88 = Interpreter.Interpreter_intStack;
               int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               int var10002;
               if (var22 != null) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1865628485 * var22.field4451;
               } else {
                  var10002 = -1;
               }

               var88[var10001] = var10002;
               return 1;
            }
         } else if (210 != var0) {
            if (var0 == 211) {
               if (var3 == -417216683) {
                  throw new IllegalStateException();
               } else {
                  class408.Interpreter_intStackSize -= -1084394537;
                  int var21 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
                  Widget var38 = class226.widgetDefinition
                     .method7953(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1], -1237601815);
                  int var53 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
                  Interpreter.field340.method8241(var21, var38, var53, (byte)93);
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Interpreter.field340
                     .method8251(2055214562);
                  return 1;
               }
            } else if (var0 == 212) {
               if (var3 == -417216683) {
                  throw new IllegalStateException();
               } else {
                  int var20 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                  Widget var87;
                  if (var2) {
                     if (var3 == -417216683) {
                        throw new IllegalStateException();
                     }

                     var87 = UserComparator3.scriptDotWidget;
                  } else {
                     var87 = class222.scriptActiveWidget;
                  }

                  Widget var37 = var87;
                  if (var37.childIndex * 2077538819 == -1) {
                     Interpreter.field340.method8241(var20, var37, -1, (byte)38);
                  } else {
                     Interpreter.field340
                        .method8241(
                           var20, class226.widgetDefinition.method7953(var37.parentId * 794900977, 1923033777), var37.childIndex * 2077538819, (byte)31
                        );
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Interpreter.field340
                     .method8251(-868455747);
                  return 1;
               }
            } else if (var0 == 213) {
               if (var3 == -417216683) {
                  throw new IllegalStateException();
               } else {
                  WorldMapRectangle.method7261(Interpreter.field340.method8255(-1020629248), var2, -1974287011);
                  return 1;
               }
            } else if (214 == var0) {
               if (var3 == -417216683) {
                  throw new IllegalStateException();
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Interpreter.field340
                     .method8259((short)8505);
                  return 1;
               }
            } else if (var0 == 215) {
               if (var3 == -417216683) {
                  throw new IllegalStateException();
               } else {
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class356.method7752(
                     class380.method8267(Interpreter.field340, 257628676), 1719321819
                  );
                  return 1;
               }
            } else if (216 == var0) {
               if (var3 == -417216683) {
                  throw new IllegalStateException();
               } else {
                  int var19 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                  Object var36 = class39.method651(var19, 649583879);
                  int var52 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                  ParamComposition var63 = WorldMap.getParamDefinition(var52, -263450748);
                  Object var86;
                  if (ParamComposition.method4969(var63, -564420368)) {
                     if (var3 == -417216683) {
                        throw new IllegalStateException();
                     }

                     var86 = var63.defaultStr;
                  } else {
                     var86 = -822826545 * var63.defaultInt;
                  }

                  Object var71 = var86;
                  class380.method8270(Interpreter.field340, var52, var36, var71, -651505321);
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Interpreter.field340
                     .method8251(961663460);
                  return 1;
               }
            } else if (217 == var0) {
               if (var3 == -417216683) {
                  throw new IllegalStateException();
               } else {
                  int var18 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
                  Widget var85;
                  if (var2) {
                     if (var3 == -417216683) {
                        throw new IllegalStateException();
                     }

                     var85 = UserComparator3.scriptDotWidget;
                  } else {
                     var85 = class222.scriptActiveWidget;
                  }

                  Widget var35 = var85;
                  if (var35 == null) {
                     throw new RuntimeException("");
                  } else if (0 != 928687775 * var35.type) {
                     if (var3 == -417216683) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException("");
                     }
                  } else {
                     Widget var51 = class226.widgetDefinition.method7953(794900977 * var35.parentId, 1782810359);
                     if (928687775 * var51.type != 0) {
                        if (var3 == -417216683) {
                           throw new IllegalStateException();
                        } else {
                           throw new RuntimeException();
                        }
                     } else {
                        Widget var62 = GrandExchangeOfferOwnWorldComparator.method1279(var18, var51, var35, -1609870633);
                        WorldMapRectangle.method7261(var62, var2, -691056244);
                        return 1;
                     }
                  }
               }
            } else {
               return 2;
            }
         } else if (var3 == -417216683) {
            throw new IllegalStateException();
         } else {
            int var4 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            int var5 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Object var6 = class39.method651(var4, 1851348870);
            int var7 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Object var8 = class39.method651(var5, 1431281195);
            int var9 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            ParamComposition var10 = WorldMap.getParamDefinition(var9, -885508734);
            Object var10000;
            if (ParamComposition.method4969(var10, -667029158)) {
               if (var3 == -417216683) {
                  throw new IllegalStateException();
               }

               var10000 = var10.defaultStr;
            } else {
               var10000 = -822826545 * var10.defaultInt;
            }

            Object var11 = var10000;
            Object var12 = null;
            if (var7 >= 0) {
               if (var3 == -417216683) {
                  throw new IllegalStateException();
               }

               ParamComposition var13 = WorldMap.getParamDefinition(var7, -421480832);
               if (ParamComposition.method4969(var13, -659712582)) {
                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  }

                  var10000 = var13.defaultStr;
               } else {
                  var10000 = -822826545 * var13.defaultInt;
               }

               var12 = var10000;
            }

            Widget var14;
            Widget var83 = class226.widgetDefinition
               .method7953(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], 768314794);
            var14 = null;
            label780:
            if (var83 != null && null != var83.children) {
               if (var3 == -417216683) {
                  throw new IllegalStateException();
               }

               int var15 = 0;

               Widget var16;
               while (true) {
                  if (var15 >= var83.children.length) {
                     break label780;
                  }

                  if (var3 == -417216683) {
                     throw new IllegalStateException();
                  }

                  var16 = var83.children[var15];
                  if (null == var16) {
                     if (var3 == -417216683) {
                        throw new IllegalStateException();
                     }
                  } else {
                     label829: {
                        if (var9 >= 0) {
                           if (var3 == -417216683) {
                              throw new IllegalStateException();
                           }

                           if (!var16.method8068(var9, var11, (byte)107).equals(var8)) {
                              if (var3 == -417216683) {
                                 throw new IllegalStateException();
                              }
                              break label829;
                           }
                        }

                        if (var7 < 0) {
                           break;
                        }

                        if (var3 == -417216683) {
                           throw new IllegalStateException();
                        }

                        if (var16.method8068(var7, var12, (byte)82).equals(var6)) {
                           break;
                        }

                        if (var3 == -417216683) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  var15++;
               }

               var14 = var16;
            }

            WorldMapRectangle.method7261(var14, var2, -2014044374);
            return 1;
         }
      } catch (RuntimeException var17) {
         throw RestClientThreadFactory.newRunException(var17, "fr.ap(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod186(ClanSettings var1) {
      var1.method4311(1686786787 * this.field1842, this.field1843, -1415493742);
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("ii")
   static final void method4050(boolean var0, int var1) {
      try {
         if (var0) {
            AuthenticationScheme var10000;
            if (Login.rememberUsername) {
               if (var1 == 1325031512) {
                  return;
               }

               var10000 = AuthenticationScheme.USERNAME_PASSWORD_REMEMBER;
            } else {
               var10000 = AuthenticationScheme.USERNAME_PASSWORD;
            }

            client.authenticationScheme = var10000;
         } else {
            AuthenticationScheme var3;
            if (ClientPreferences.method1650(class468.clientPreferences, Login.Login_username, (byte)-59)) {
               if (var1 == 1325031512) {
                  throw new IllegalStateException();
               }

               var3 = AuthenticationScheme.TOKEN_REMEMBER;
            } else {
               var3 = AuthenticationScheme.TOKEN;
            }

            client.authenticationScheme = var3;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fr.ii(" + ')');
      }
   }

   classFR(class154 var1) {
      this.this$0 = var1;
      this.field1842 = -1999864523;
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIIII)V")
   @ObfuscatedName("kl")
   static void method4051(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = var1;
         int var7 = var2;
         int var8 = class67.method3009(var0, var1, var2, var0.plane * 2115028565, var4, -491504606) - var3;
         if (!WorldView.method3060(var0, (byte)0)) {
            if (var5 == -1300507091) {
               throw new IllegalStateException();
            }

            WorldEntity var9 = (WorldEntity)Occluder.topLevelWorldView.worldEntities.get((long)(577964535 * var0.id));
            if (var9 != null) {
               if (var5 == -1300507091) {
                  throw new IllegalStateException();
               }

               ProjectionCoord var10 = classDH.method3122(var0, var1, var2, (byte)48);
               var6 = (int)var10.x;
               var7 = (int)var10.y;
               var8 += NPCComposition.getTileHeight(
                  Occluder.topLevelWorldView, var9.getY(-546244981), var9.getX(-727737924), 2115028565 * Occluder.topLevelWorldView.plane, -253070517
               );
               var10.release(-804947546);
            }
         }

         if (var6 >= 128 && 13056 >= var6) {
            if (var5 == -1300507091) {
               throw new IllegalStateException();
            }

            if (var7 >= 128) {
               if (var5 == -1300507091) {
                  return;
               }

               if (13056 >= var7) {
                  int var18 = var6 - SpriteBufferProperties.cameraX * -201184013;
                  int var11 = var8 - 2001367751 * ScriptFrame.cameraY;
                  int var20 = var7 - 1084219535 * class528.cameraZ;
                  int var12 = Rasterizer3D.Rasterizer3D_sine[-1593954547 * GraphicsObject.cameraPitch];
                  int var13 = Rasterizer3D.Rasterizer3D_cosine[GraphicsObject.cameraPitch * -1593954547];
                  int var14 = Rasterizer3D.Rasterizer3D_sine[197556079 * WorldMapData_0.cameraYaw];
                  int var15 = Rasterizer3D.Rasterizer3D_cosine[197556079 * WorldMapData_0.cameraYaw];
                  int var16 = var20 * var14 + var15 * var18 >> 16;
                  var20 = var20 * var15 - var14 * var18 >> 16;
                  var16 = var13 * var11 - var12 * var20 >> 16;
                  var20 = var13 * var20 + var12 * var11 >> 16;
                  if (var20 >= 50) {
                     if (var5 == -1300507091) {
                        return;
                     }

                     client.viewportTempX = 1024916153 * (client.viewportZoom * 1624872185 * var16 / var20 + 164941911 * client.viewportWidth / 2);
                     client.viewportTempY = (var16 * client.viewportZoom * 1624872185 / var20 + client.viewportHeight * 620574401 / 2) * 237478937;
                  } else {
                     client.viewportTempX = -1024916153;
                     client.viewportTempY = -237478937;
                  }

                  return;
               }
            }
         }

         client.viewportTempX = -1024916153;
         client.viewportTempY = -237478937;
      } catch (RuntimeException var17) {
         throw RestClientThreadFactory.newRunException(var17, "fr.kl(" + ')');
      }
   }
}
