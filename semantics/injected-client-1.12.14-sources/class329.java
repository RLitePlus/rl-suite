import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("me")
public class class329 {
   @ToRemove(unused = "true")
   @ObfuscatedName("bi")
   static final int field3832 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field3830 = 8388607;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field3831 = 8388607;

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ne")
   static void method7395(int var0, byte var1) {
      try {
         WorldMapSection2.tempMenuAction = new MenuAction();
         client.method2372(-1);
         WorldMapSection2.tempMenuAction.param0 = 1867697229 * client.menu.menuArguments1[var0];
         WorldMapSection2.tempMenuAction.param1 = -1812746979 * client.menu.menuArguments2[var0];
         WorldMapSection2.tempMenuAction.opcode = 353141889 * client.menu.menuOpcodes[var0];
         WorldMapSection2.tempMenuAction.identifier = client.menu.menuIdentifiers[var0] * -1699428933;
         WorldMapSection2.tempMenuAction.itemId = -1560334611 * client.menu.menuItemIds[var0];
         WorldMapSection2.tempMenuAction.action = client.menu.menuActions[var0];
         WorldMapSection2.tempMenuAction.target = client.menu.menuTargets[var0];
         WorldMapSection2.tempMenuAction.worldViewId = client.menu.menuWorldViewIds[var0] * -1820948869;
         WorldMapSection2.tempMenuAction.field332 = client.menu.menuShiftClick[var0];
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "me.ne(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[Lpz;")
   @ObfuscatedName("ae")
   public static CameraViewMode[] method7392(int var0) {
      try {
         return new CameraViewMode[]{CameraViewMode.field5269, CameraViewMode.field5271, CameraViewMode.field5270};
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "me.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(CLqd;B)I")
   @ObfuscatedName("an")
   static int lowercaseChar(char var0, Language var1, byte var2) {
      try {
         int var3;
         label34: {
            var3 = var0 << 4;
            if (!Character.isUpperCase(var0)) {
               if (!Character.isTitleCase(var0)) {
                  break label34;
               }

               if (var2 == 0) {
                  throw new IllegalStateException();
               }
            }

            var0 = Character.toLowerCase(var0);
            var3 = 1 + (var0 << 4);
         }

         if (241 == var0) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            if (var1 == Language.Language_ES) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               var3 = 1762;
            }
         }

         return var3;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "me.an(" + 41);
      }
   }

   class329() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("az")
   static int method7394(int var0, Script var1, boolean var2, int var3) {
      try {
         Widget var4;
         if (var0 >= 2000) {
            if (var3 <= 357354993) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            int var5 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            var4 = class226.widgetDefinition.method7953(var5, -1520588109);
         } else {
            var4 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         }

         if (1000 == var0) {
            if (var3 <= 357354993) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 1417452148;
               var4.rawX = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize] * -1005032755;
               var4.rawY = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789] * -752065015;
               var4.xAlignment = -1747850943 * Interpreter.Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
               var4.yAlignment = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 3] * -1356647925;
               class376.invalidateWidget(var4, (byte)5);
               SecureUrlRequester.client.alignWidget(var4, 256412667);
               if (928687775 * var4.type == 0) {
                  if (var3 <= 357354993) {
                     throw new IllegalStateException();
                  }

                  Widget[] var10;
                  if (-1 == 2077538819 * var4.childIndex) {
                     if (var3 <= 357354993) {
                        throw new IllegalStateException();
                     }

                     var10 = class226.widgetDefinition.Widget_interfaceComponents[278777747 * var4.id >> 16];
                  } else {
                     var10 = class226.widgetDefinition.method7953(var4.parentId * 794900977, 1849466983).children;
                  }

                  Widget[] var9 = var10;
                  class339.revalidateWidgetScroll(var9, var4, false, -1264499565);
               }

               return 1;
            }
         } else if (var0 == 1001) {
            if (var3 <= 357354993) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 1417452148;
               var4.rawWidth = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789] * 1403700735;
               var4.rawHeight = 449174585 * Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               var4.widthAlignment = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2] * -1384270729;
               var4.heightAlignment = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 3] * -500921095;
               class376.invalidateWidget(var4, (byte)5);
               SecureUrlRequester.client.alignWidget(var4, 860705086);
               if (var4.type * 928687775 == 0) {
                  if (var3 <= 357354993) {
                     throw new IllegalStateException();
                  }

                  Widget[] var10000;
                  if (2077538819 * var4.childIndex == -1) {
                     if (var3 <= 357354993) {
                        throw new IllegalStateException();
                     }

                     var10000 = class226.widgetDefinition.Widget_interfaceComponents[var4.id * 278777747 >> 16];
                  } else {
                     var10000 = class226.widgetDefinition.method7953(var4.parentId * 794900977, -1933543685).children;
                  }

                  Widget[] var8 = var10000;
                  class339.revalidateWidgetScroll(var8, var4, false, -2015162548);
               }

               return 1;
            }
         } else if (var0 == 1003) {
            if (var3 <= 357354993) {
               throw new IllegalStateException();
            } else {
               boolean var7 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1;
               if (var7 != var4.isHidden) {
                  if (var3 <= 357354993) {
                     throw new IllegalStateException();
                  }

                  var4.isHidden = var7;
                  class376.invalidateWidget(var4, (byte)5);
               }

               return 1;
            }
         } else if (var0 == 1005) {
            boolean var11;
            if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
               if (var3 <= 357354993) {
                  throw new IllegalStateException();
               }

               var11 = true;
            } else {
               var11 = false;
            }

            var4.noClickThrough = var11;
            return 1;
         } else if (1006 == var0) {
            if (var3 <= 357354993) {
               throw new IllegalStateException();
            } else {
               boolean var10001;
               if (Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789] == 1) {
                  if (var3 <= 357354993) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               var4.noScrollThrough = var10001;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "me.az(" + 41);
      }
   }
}
