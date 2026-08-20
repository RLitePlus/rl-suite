import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fx")
public class LoginPacket extends classFM {
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field1919 = 1;
   @ObfuscatedName("at")
   String field1916;
   @ObfuscatedName("av")
   long field1915;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   public static final int field1918 = 512;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field1917 = 8;

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("av")
   public static int Widget_unpackTargetMask(int var0, int var1) {
      try {
         return var0 >> 11 & 63;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fx.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod182(Buffer var1, byte var2) {
      try {
         if (var1.readUnsignedByte(-1357548206) != 255) {
            if (var2 == 0) {
               return;
            }

            var1.offset -= 1741769013;
            this.field1915 = Buffer.method12018(var1, -2018940179) * 2602142268484682419L;
         }

         this.field1916 = var1.readCESU8(792604665);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fx.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("ar")
   static int method4152(int var0, Script var1, boolean var2, int var3) {
      try {
         Widget var4;
         if (var0 >= 2000) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            var4 = class226.widgetDefinition
               .method7953(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -1127260695);
         } else {
            Widget var10000;
            if (var2) {
               if (var3 != -364498099) {
                  throw new IllegalStateException();
               }

               var10000 = UserComparator3.scriptDotWidget;
            } else {
               var10000 = class222.scriptActiveWidget;
            }

            var4 = var10000;
         }

         String var5 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
         int[] var6 = null;
         if (!var5.isEmpty()) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            if (var5.charAt(var5.length() - 1) == 'Y') {
               if (var3 != -364498099) {
                  throw new IllegalStateException();
               }

               int var7 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               if (var7 > 0) {
                  if (var3 != -364498099) {
                     throw new IllegalStateException();
                  }

                  for (var6 = new int[var7];
                     var7-- > 0;
                     var6[var7] = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]
                  ) {
                     if (var3 != -364498099) {
                        throw new IllegalStateException();
                     }
                  }
               }

               var5 = var5.substring(0, var5.length() - 1);
            }
         }

         Object[] var11 = new Object[var5.length() + 1];

         for (int var8 = var11.length - 1; var8 >= 1; var8--) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            switch (var5.charAt(var8 - 1)) {
               case 'W':
               case 'X':
               case 's':
                  var11[var8] = Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
                  break;
               default:
                  var11[var8] = new Integer(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789]);
            }
         }

         int var12 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
         if (var12 != -1) {
            var11[0] = new Integer(var12);
         } else {
            var11 = null;
         }

         if (1400 == var0) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onDialogAbort = var11;
         } else if (var0 == 1401) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onResize = var11;
         } else if (1402 == var0) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.field4569 = var11;
         } else if (1403 == var0) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.field4547 = var11;
         } else if (var0 == 1404) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onMiscTransmit = var11;
         } else if (var0 == 1405) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onOp = var11;
         } else if (var0 == 1406) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onMouseOver = var11;
         } else if (1407 == var0) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onLoad = var11;
            var4.varTransmitTriggers = var6;
         } else if (var0 == 1408) {
            var4.onTargetEnter = var11;
         } else if (1409 == var0) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onClickRepeat = var11;
         } else if (1410 == var0) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.field4575 = var11;
         } else if (var0 == 1411) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onMouseRepeat = var11;
         } else if (1412 == var0) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onRelease = var11;
         } else if (1414 == var0) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onStatTransmit = var11;
            var4.invTransmitTriggers = var6;
         } else if (1415 == var0) {
            var4.onScroll = var11;
            var4.statTransmitTriggers = var6;
         } else if (var0 == 1416) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onChatTransmit = var11;
         } else if (var0 == 1417) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onVarTransmit = var11;
         } else if (1418 == var0) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onInvTransmit = var11;
         } else if (var0 == 1419) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onDrag = var11;
         } else if (var0 == 1420) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onKey = var11;
         } else if (var0 == 1421) {
            var4.field4567 = var11;
         } else if (1422 == var0) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onHold = var11;
         } else if (var0 == 1423) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.field4587 = var11;
         } else if (var0 == 1424) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.field4541 = var11;
         } else if (1425 == var0) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onSubChange = var11;
         } else if (var0 == 1426) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onDragComplete = var11;
         } else if (1427 == var0) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onTargetLeave = var11;
         } else if (1428 == var0) {
            var4.onStockTransmit = var11;
         } else if (var0 == 1429) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onMouseLeave = var11;
         } else if (var0 == 1430) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onFriendTransmit = var11;
         } else if (1431 == var0) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onClick = var11;
         } else if (1434 == var0) {
            var4.onTimer = var11;
         } else if (1435 == var0) {
            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            var4.onClanTransmit = var11;
         } else {
            if (var0 < 1436 || var0 > 1439) {
               return 2;
            }

            if (var3 != -364498099) {
               throw new IllegalStateException();
            }

            class376 var9 = var4.method8164((byte)-54);
            if (null != var9) {
               if (1436 == var0) {
                  var9.field4682 = var11;
               } else if (var0 == 1437) {
                  if (var3 != -364498099) {
                     throw new IllegalStateException();
                  }

                  var9.field4683 = var11;
               } else if (var0 == 1438) {
                  var9.field4684 = var11;
               } else if (var0 == 1439) {
                  if (var3 != -364498099) {
                     throw new IllegalStateException();
                  }

                  var9.field4685 = var11;
               }
            }
         }

         var4.hasListener = true;
         return 1;
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "fx.ar(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod184(Buffer var1) {
      if (var1.readUnsignedByte(-1522325146) != 255) {
         var1.offset -= 1741769013;
         this.field1915 = Buffer.method12018(var1, -1913992404) * 2602142268484682419L;
      }

      this.field1916 = var1.readCESU8(792604665);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lce;)Z")
   @ObfuscatedName("ql")
   public static boolean method4151(SecureRandomFuture var0) {
      return var0.future.isDone();
   }

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod185(ClanSettings var1, byte var2) {
      try {
         ClanSettings.method4293(var1, this.field1915 * 7034894779562949755L, this.field1916, 0, 1565052257);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "fx.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod186(ClanSettings var1) {
      ClanSettings.method4293(var1, this.field1915 * 7034894779562949755L, this.field1916, 0, -1761582437);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Lkb;IIB)V")
   @ObfuscatedName("av")
   public static void method4150(Buffer var0, WorldEntityCoord var1, int var2, int var3, byte var4) {
      try {
         var1.method6266(Coord.method8301(var2, -355008838), Coord.method8301(var3, -355008838), 1339422254);
         var1.setZ(0, (byte)-36);
         var1.setOrientation(0, 2044267556);
         byte var5 = Buffer.method12001(var0, (byte)52);
         if (var5 == 0) {
            if (var4 != -1) {
               return;
            }
         } else {
            int var6 = HttpRequestTask.method83(var0, var5, 0, -307194023);
            int var7 = HttpRequestTask.method83(var0, var5, 2, 1321882702);
            int var8 = HttpRequestTask.method83(var0, var5, 4, 1598495049);
            int var9 = HttpRequestTask.method83(var0, var5, 6, -121711497);
            WorldEntityCoord.method6278(var1, var6, var7, var8, var9, (byte)60);
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "fx.av(" + ')');
      }
   }

   LoginPacket(class154 var1) {
      this.this$0 = var1;
      this.field1915 = -2602142268484682419L;
      this.field1916 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod183(Buffer var1) {
      if (var1.readUnsignedByte(-359053343) != 255) {
         var1.offset -= 1741769013;
         this.field1915 = Buffer.method12018(var1, -2116833294) * 2602142268484682419L;
      }

      this.field1916 = var1.readCESU8(792604665);
   }
}
