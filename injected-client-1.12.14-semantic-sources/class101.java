import java.util.concurrent.locks.ReentrantLock;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("do")
public class class101 {
   @ObfuscatedSignature(descriptor = "Ler;")
   @ObfuscatedName("av")
   VorbisSample field1453;
   @ObfuscatedSignature(descriptor = "Ldq;")
   @ObfuscatedName("at")
   RawSound field1451;
   @ObfuscatedName("ag")
   ReentrantLock field1452;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final int field1455 = 71;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field1454 = 20;

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("bj")
   static int method3398(int var0, Script var1, boolean var2, int var3) {
      try {
         if (3300 == var0) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1759706017 * client.cycle;
            return 1;
         } else if (var0 == 3301) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var25 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var33 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = GrandExchangeOfferTotalQuantityComparator.method9178(
                  var25, var33, 2098335019
               );
               return 1;
            }
         } else if (var0 == 3302) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var24 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var32 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class209.ItemContainer_getCount(
                  var24, var32, 1148857744
               );
               return 1;
            }
         } else if (3303 == var0) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var23 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var31 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class320.method7362(
                  var23, var31, 1876982269
               );
               return 1;
            }
         } else if (3304 == var0) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               int var22 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = WallDecoration.getInvDefinition(
                        var22, -385995351
                     )
                     .size
                  * -882743441;
               return 1;
            }
         } else if (var0 == 3305) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               int var21 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.currentLevels[var21];
               return 1;
            }
         } else if (3306 == var0) {
            int var20 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.levels[var20];
            return 1;
         } else if (3307 == var0) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               int var19 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.experience[var19];
               return 1;
            }
         } else if (3308 == var0) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               int var18 = 2115028565 * Occluder.topLevelWorldView.plane;
               int var30 = (class330.localPlayer.x * 340712311 >> 7) + 825809917 * Occluder.topLevelWorldView.baseX;
               int var34 = (class330.localPlayer.y * -1747310679 >> 7) + 1279964673 * Occluder.topLevelWorldView.baseY;
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Coord.method8286(
                  var18, var30, var34, (byte)-5
               );
               return 1;
            }
         } else if (var0 == 3309) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               int var17 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Coord.method8292(var17, 468697806);
               return 1;
            }
         } else if (3310 == var0) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               int var16 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Coord.method8288(var16, -1895727629);
               return 1;
            }
         } else if (var0 == 3311) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               int var15 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Coord.method8294(var15, 1346086770);
               return 1;
            }
         } else if (var0 == 3312) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.isMembersWorld ? 1 : 0;
               return 1;
            }
         } else if (var0 == 3313) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var14 = 32768 + Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var29 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = GrandExchangeOfferTotalQuantityComparator.method9178(
                  var14, var29, 2113253956
               );
               return 1;
            }
         } else if (var0 == 3314) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var13 = 32768 + Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var28 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class209.ItemContainer_getCount(
                  var13, var28, 1148857744
               );
               return 1;
            }
         } else if (3315 == var0) {
            class408.Interpreter_intStackSize -= 708726074;
            int var12 = 32768 + Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            int var27 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class320.method7362(var12, var27, 1876982269);
            return 1;
         } else if (var0 == 3316) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               if (427594063 * client.staffModLevel >= 2) {
                  if (var3 <= 1762004765) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 427594063 * client.staffModLevel;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               }

               return 1;
            }
         } else if (3317 == var0) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 257591815 * client.rebootTimer;
               return 1;
            }
         } else if (var0 == 3318) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1312022025 * client.worldId;
               return 1;
            }
         } else if (3321 == var0) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.runEnergy * -1850849067 / 100;
               return 1;
            }
         } else if (3322 == var0) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -17542531 * client.weight;
               return 1;
            }
         } else if (var0 == 3323) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               if (client.playerMod) {
                  if (var3 <= 1762004765) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               }

               return 1;
            }
         } else if (3324 == var0) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1330094789 * client.worldProperties;
            return 1;
         } else if (3325 == var0) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 1417452148;
               int var11 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var26 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               int var6 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
               int var7 = Interpreter.Interpreter_intStack[3 + class408.Interpreter_intStackSize * 327716789];
               int var8 = Coord.method8286(var6, var26, var7, (byte)-33);
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var11 + var8;
               return 1;
            }
         } else if (3326 == var0) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.field722 * -2071788461;
               return 1;
            }
         } else if (var0 == 3327) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.field723 * -1318930041;
               return 1;
            }
         } else if (var0 == 3331) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.runEnergy * -1850849067;
               return 1;
            }
         } else if (3332 == var0) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               int var10 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.field682[var10];
               return 1;
            }
         } else if (var0 == 3333) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = client.field673;
               return 1;
            }
         } else if (var0 == 3339) {
            if (var3 <= 1762004765) {
               throw new IllegalStateException();
            } else {
               int var4 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               if (-1 == var4) {
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
               } else {
                  WorldEntityConfig var5 = WorldMapRegion.method6991(var4, (byte)-67);
                  Object[] var10000 = Interpreter.Interpreter_objectStack;
                  int var10001 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
                  String var10002;
                  if (var5 == null) {
                     if (var3 <= 1762004765) {
                        throw new IllegalStateException();
                     }

                     var10002 = "";
                  } else {
                     var10002 = var5.field2378;
                  }

                  var10000[var10001] = var10002;
               }

               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "do.bj(" + 41);
      }
   }

   class101(VorbisSample var1, RawSound var2) {
      this.field1453 = var1;
      this.field1451 = var2;
      this.field1452 = new ReentrantLock();
   }

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("av")
   public static int method3396(int var0, int var1, byte var2) {
      try {
         return (int)(Math.atan2(var0, var1) * 325.94932345220167) & 2047;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "do.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZB)I")
   @ObfuscatedName("cn")
   static int method3399(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (var0 == 8000) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
               DynamicArray var38 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -1327921751
               );
               DynamicArray var63 = (DynamicArray)Interpreter.Interpreter_objectStack[1 + SecureRandomFuture.Interpreter_objectStackSize * -1595015587];
               class520.method11173(var38, var63, 529503132);
               return 1;
            }
         } else if (var0 == 8001) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var37 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var62 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
               DynamicArray var80 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -562437116
               );
               classPK.method8766(var80, var37, var62, -1362640853);
               return 1;
            }
         } else if (8002 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               DynamicArray var36 = (DynamicArray)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661)
                  * -1595015587];
               int[] var97 = Interpreter.Interpreter_intStack;
               int var103 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var109;
               if (var36 == null) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  var109 = 1;
               } else {
                  var109 = 0;
               }

               var97[var103] = var109;
               return 1;
            }
         } else if (var0 == 8003) {
            DynamicArray var35 = (DynamicArray)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            int[] var96 = Interpreter.Interpreter_intStack;
            int var102 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
            int var108;
            if (null != var35) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               var108 = var35.method11215((byte)8);
            } else {
               var108 = 0;
            }

            var96[var102] = var108;
            return 1;
         } else if (var0 == 8004) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
               DynamicArray var34 = (DynamicArray)Interpreter.Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
               DynamicArray var61 = (DynamicArray)Interpreter.Interpreter_objectStack[1 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = HttpHeaders.method10933(
                  var34, var61, 560781970
               );
               return 1;
            }
         } else if (var0 == 8005) {
            class408.Interpreter_intStackSize -= -1084394537;
            int var33 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            int var60 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
            int var79 = Interpreter.Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
            Object var86 = class39.method651(var79, 837868253);
            DynamicArray var90 = (DynamicArray)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
            int[] var95 = Interpreter.Interpreter_intStack;
            int var101 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
            int var107;
            if (null != var90) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               var107 = BufferedSink.method10916(var90, var86, var33, var60, 1261331872);
            } else {
               var107 = -1;
            }

            var95[var101] = var107;
            return 1;
         } else if (8006 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1084394537;
               int var32 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var59 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
               int var78 = Interpreter.Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
               Object var85 = class39.method651(var78, 1492945410);
               DynamicArray var89 = (DynamicArray)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661)
                  * -1595015587];
               int[] var94 = Interpreter.Interpreter_intStack;
               int var100 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               int var106;
               if (var89 != null) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  var106 = classPE.method8718(var89, var85, var32, var59, 703900950);
               } else {
                  var106 = -1;
               }

               var94[var100] = var106;
               return 1;
            }
         } else if (8007 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1084394537;
               int var31 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var58 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
               int var77 = Interpreter.Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
               Object var84 = class39.method651(var77, -560114750);
               DynamicArray var88 = (DynamicArray)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661)
                  * -1595015587];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = null != var88
                  ? class320.method7365(var88, var84, var31, var58, -1585877182)
                  : 0;
               return 1;
            }
         } else if (var0 == 8008) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               DynamicArray var30 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -345069706
               );
               int var57 = FloorUnderlayDefinition.method4514(var30, (byte)100);
               if (var30.field6107 == class586.field6376) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  int[] var91 = Interpreter.Interpreter_intStack;
                  int var98 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
                  int var104;
                  if (var57 >= 0) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var104 = var30.method11207(2053374425)[var57];
                  } else {
                     var104 = -1;
                  }

                  var91[var98] = var104;
               } else {
                  if (class586.field6379 != var30.field6107) {
                     throw new IllegalStateException();
                  }

                  Object var92;
                  if (var57 >= 0) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var92 = var30.method11214((byte)-8)[var57];
                  } else {
                     var92 = null;
                  }

                  String var76 = (String)var92;
                  var92 = Interpreter.Interpreter_objectStack;
                  int var99 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
                  String var105;
                  if (null != var76) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var105 = var76;
                  } else {
                     var105 = "";
                  }

                  ((Object[])var92)[var99] = var105;
               }

               return 1;
            }
         } else if (8009 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               DynamicArray var29 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -2000824117
               );
               int var56 = Projectile.method1427(var29, 1393891487);
               if (var29.field6107 == class586.field6376) {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var56 >= 0
                     ? var29.method11207(2053374425)[var56]
                     : -1;
               } else {
                  if (class586.field6379 != var29.field6107) {
                     throw new IllegalStateException();
                  }

                  String var75 = (String)(var56 >= 0 ? var29.method11214((byte)-79)[var56] : null);
                  Object[] var10000 = Interpreter.Interpreter_objectStack;
                  int var10001 = (SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1;
                  String var10002;
                  if (var75 != null) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var10002 = var75;
                  } else {
                     var10002 = "";
                  }

                  var10000[var10001] = var10002;
               }

               return 1;
            }
         } else if (var0 == 8010) {
            class408.Interpreter_intStackSize -= -1084394537;
            int var28 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            int var55 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
            int var74 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
            Object var83 = class39.method651(var74, -240585418);
            DynamicArray var87 = VarcInt.method4531(
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -667751496
            );
            class532.method11167(var87, var83, var28, var55, -1668673809);
            return 1;
         } else if (8011 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1084394537;
               int var27 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var54 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
               int var73 = Interpreter.Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
               DynamicArray var82 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -440118890
               );
               IntHashTable.method10488(var82, var27, 1, var54, var73, 1461486816);
               return 1;
            }
         } else if (var0 == 8012) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               DynamicArray var26 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -1708396593
               );
               FriendSystem.method470(var26, (byte)17);
               return 1;
            }
         } else if (var0 == 8013) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               int var25 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               DynamicArray var53 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -1574252737
               );
               VarpDefinition.method4805(var53, var25, (byte)30);
               return 1;
            }
         } else if (var0 == 8014) {
            class408.Interpreter_intStackSize -= 708726074;
            int var24 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            int var52 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
            DynamicArray var72 = VarcInt.method4531(
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -1355250123
            );
            class380.method8275(var72, var24, var52, (byte)1);
            return 1;
         } else if (8015 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1084394537;
               int var23 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var51 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
               int var71 = Interpreter.Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
               SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
               DynamicArray var81 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587], null, -666351299
               );
               DynamicArray var8 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize + 1], null, -1901820893
               );
               ItemLayer.method5390(var81, var8, var23, var51, var71, -44564641);
               return 1;
            }
         } else if (var0 == 8016) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               DynamicArray var22 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -224908234
               );
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)class6.method121(var22, 764544479);
               return 1;
            }
         } else if (8017 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               DynamicArray var21 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -1267377361
               );
               int var50 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class236.method6007(
                  var21, var50, -965381295
               );
               return 1;
            }
         } else if (var0 == 8018) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
               String var20 = (String)Interpreter.Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
               String var49 = (String)Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 1];
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = classIL.method4911(
                  var20, var49, -979757086
               );
               return 1;
            }
         } else if (8019 == var0) {
            SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
            DynamicArray var19 = VarcInt.method4531(
               Interpreter.Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, 158205433
            );
            String var48 = (String)Interpreter.Interpreter_objectStack[1 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize];
            Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = class383.method8658(
               var19, var48, 921778921
            );
            return 1;
         } else if (var0 == 8020) {
            class408.Interpreter_intStackSize -= 708726074;
            int var18 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            int var47 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
            EnumComposition var70 = class108.getEnum(var47, 286335379);
            if (var70.outputType != var18) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException();
               }
            } else {
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var70.method4463(
                  1579342349
               );
               return 1;
            }
         } else if (8021 == var0) {
            class408.Interpreter_intStackSize -= 708726074;
            int var17 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            int var46 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
            EnumComposition var69 = class108.getEnum(var46, -44936012);
            if (var69.inputType != var17) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException();
               }
            } else {
               Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = EnumComposition.method4465(
                  var69, -1693502457
               );
               return 1;
            }
         } else if (var0 == 8022) {
            class408.Interpreter_intStackSize -= -1084394537;
            int var16 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            int var45 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
            int var68 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
            if (var68 < var45) {
               var68 = var45;
            }

            if (var45 >= 0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               if (var45 <= 5000) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var68 >= 0) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (var68 <= 5000) {
                        if (115 == var16) {
                           if (var3 >= 0) {
                              throw new IllegalStateException();
                           }

                           Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = new DynamicArray(
                              class586.field6379, "", var45, var68
                           );
                        } else {
                           if (var16 != 105) {
                              if (var16 != 49) {
                                 Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = new DynamicArray(
                                    class586.field6376, -1, var45, var68
                                 );
                                 return 1;
                              }

                              if (var3 >= 0) {
                                 throw new IllegalStateException();
                              }
                           }

                           Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = new DynamicArray(
                              class586.field6376, 0, var45, var68
                           );
                        }

                        return 1;
                     }
                  }
               }
            }

            throw new RuntimeException();
         } else if (var0 == 8023) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               int var15 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               DynamicArray var44 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -214746987
               );
               if (var15 >= 0) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var15 <= 5000) {
                     var44.method11226(var15, (byte)100);
                     return 1;
                  }

                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }
               }

               throw new RuntimeException();
            }
         } else if (8024 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               int var14 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Object var43 = class39.method651(var14, 339967065);
               DynamicArray var67 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -716582492
               );
               ProjectionCoord.method9918(var67, var67.method11215((byte)106), var43, 1789263116);
               return 1;
            }
         } else if (8025 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var13 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var42 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
               Object var66 = class39.method651(var42, 1545222975);
               DynamicArray var7 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -1740211454
               );
               ProjectionCoord.method9918(var7, var13, var66, 934475115);
               return 1;
            }
         } else if (var0 == 8026) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               int var12 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               DynamicArray var41 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -1337111586
               );
               Object var65 = GrandExchangeEvent.method8939(var41, var12, -2055203679);
               SwapSongTask.method10272(var41.field6107, var65, (byte)-89);
               return 1;
            }
         } else if (8027 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
               DynamicArray var11 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -920040249
               );
               DynamicArray var40 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[SecureRandomFuture.Interpreter_objectStackSize * -1595015587 + 1], null, 273912307
               );
               GrandExchangeOfferNameComparator.method9136(var11, var40, var11.method11215((byte)73), 122104396);
               return 1;
            }
         } else if (var0 == 8028) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               int var10 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               SecureRandomFuture.Interpreter_objectStackSize -= 1663929322;
               DynamicArray var39 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[-1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -836985938
               );
               DynamicArray var64 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[1 + -1595015587 * SecureRandomFuture.Interpreter_objectStackSize], null, -1435893919
               );
               GrandExchangeOfferNameComparator.method9136(var39, var64, var10, 122104396);
               return 1;
            }
         } else if (8029 == var0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var4 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var5 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
               DynamicArray var6 = VarcInt.method4531(
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587], null, -1362533302
               );
               SpotAnimationDefinition.method4623(var6, var4, var5, -1027917603);
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "do.cn(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;IIB)V")
   @ObfuscatedName("lx")
   public static final void menuAction(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9, byte var10) {
      rl5 var11 = client.method2370(client.menu, var0, var1, var2, var3, var4, var5, var6, var7);
      boolean var12 = false;
      if (WorldMapSection2.tempMenuAction != null) {
         var12 = WorldMapSection2.tempMenuAction.method978() == var2
            && WorldMapSection2.tempMenuAction.method980() == var3
            && WorldMapSection2.tempMenuAction.method982() == var6
            && WorldMapSection2.tempMenuAction.method979() == var7
            && WorldMapSection2.tempMenuAction.method983() == var0
            && WorldMapSection2.tempMenuAction.method989() == var1
            && WorldMapSection2.tempMenuAction.method991() == var4
            && WorldMapSection2.tempMenuAction.method988() == var5;
      }

      if (var11 == null && var12) {
         int var13;
         if (client.menu.field6552 * 1759446067 < 500) {
            int var10000 = client.menu.field6552 * 1759446067;
            client.menu.field6552 = (client.menu.field6552 * 1759446067 + 1) * 849057531;
            var13 = var10000;
         } else {
            var13 = 0;
         }

         client.menu.menuOpcodes[var13] = var2;
         client.menu.menuIdentifiers[var13] = var3;
         client.menu.menuActions[var13] = var6;
         client.menu.menuTargets[var13] = var7;
         client.menu.menuArguments1[var13] = var0;
         client.menu.menuArguments2[var13] = var1;
         client.menu.menuItemIds[var13] = var4;
         client.menu.menuWorldViewIds[var13] = var5;
         client.menu.menuShiftClick[var13] = false;
         client.menu.subMenus[var13] = null;
         var11 = client.menu.field6564[var13];
         if (var11 == null) {
            var11 = client.menu.field6564[var13] = new rl5(client.menu, var13);
         }

         var11.field5667 = WorldMapSection2.tempMenuAction.field331;
      }

      if (var11 == null) {
         if (var8 != -1 || var9 != -1) {
            client.field938
               .warn("Unable to find clicked menu op {} targ {} action {} id {} p0 {} p1 {} world {}", new Object[]{var6, var7, var2, var3, var0, var1, var5});
         }
      } else {
         client.field938.trace("Menu click op {} targ {} action {} id {} p0 {} p1 {} world {}", new Object[]{var6, var7, var2, var3, var0, var1, var5});
         MenuOptionClicked var35 = new MenuOptionClicked(var11);
         SecureUrlRequester.client.getCallbacks().post(var35);
         if (var11.field5667 != null) {
            try {
               var11.field5667.accept(var11);
            } catch (Exception var34) {
               client.field938.warn("exception in menu callback", var34);
            }
         }

         if (var35.isConsumed()) {
            return;
         }

         var0 = var11.getParam0();
         var1 = var11.getParam1();
         var3 = var11.getIdentifier();
      }

      int var17 = var2;
      byte var25 = -32;
      WorldView var26 = WorldViewManager.method2901(client.worldViewManager, var5, (byte)1);
      if (null == var26) {
         if (var25 == 31) {
         }
      } else {
         int var27 = var26.baseX * 825809917;
         int var28 = 1279964673 * var26.baseY;
         IndexedObjectSet var29 = var26.players;
         IndexedObjectSet var30 = var26.npcs;
         if (var2 >= 2000) {
            var17 = var2 - 2000;
         }

         if (var17 == 1001) {
            if (var25 == 31) {
               return;
            }

            client.mouseCrossX = var8 * -1644257037;
            client.mouseCrossY = -881990251 * var9;
            client.mouseCrossColor = 768588770;
            client.mouseCrossState = 0;
            client.destinationX = var0 * -1650976811;
            client.destinationY = var1 * -1742931333;
            PacketBufferNode var31 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3913, client.packetWriter.isaacCipher, -1204341826);
            var31.packetBuffer.writeShort(var0 + var27, -1816047112);
            var31.packetBuffer.writeByteAdd(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, 89757649);
            var31.packetBuffer.writeShortAddLE(var1 + var28, -2024706027);
            var31.packetBuffer.writeShortAddLE(var3, -2097971821);
            PacketWriter.method3330(client.packetWriter, var31, -1771370198);
         }

         if (17 == var17) {
            client.mouseCrossX = -1644257037 * var8;
            client.mouseCrossY = -881990251 * var9;
            client.mouseCrossColor = 768588770;
            client.mouseCrossState = 0;
            client.destinationX = -1650976811 * var0;
            client.destinationY = -1742931333 * var1;
            PacketBufferNode var36 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3883, client.packetWriter.isaacCipher, -2023891791);
            var36.packetBuffer.writeShortAdd(var27 + var0, 1417762965);
            PacketBuffer var111 = var36.packetBuffer;
            byte var10001;
            if (IndexCheck.method6514(client.indexCheck, 82, (short)1337)) {
               if (var25 == 31) {
                  return;
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var111.writeByteNeg(var10001, 338397670);
            var36.packetBuffer.writeShortAdd(client.selectedSpellItemId * -2111303253, 1663270660);
            var36.packetBuffer.writeShortLE(var28 + var1, 1929945279);
            var36.packetBuffer.writeShort(var3, -1938419257);
            Buffer.method12187(var36.packetBuffer, -1070656277 * Skills.selectedSpellWidget, 1120174976);
            var36.packetBuffer.writeShortAdd(client.selectedSpellChildIndex * -436571069, -1855665837);
            PacketWriter.method3330(client.packetWriter, var36, -1771370198);
         }

         if (var17 == 23) {
            if (client.isMenuOpen) {
               RouteStrategy.method6613(var26.scene);
            } else {
               Scene.method5628(var26.scene, true);
            }
         }

         if (62 == var17) {
            WorldEntity var37 = (WorldEntity)var26.worldEntities.get((long)var3);
            if (var37 != null) {
               client.mouseCrossX = -1644257037 * var8;
               client.mouseCrossY = var9 * -881990251;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = -1650976811 * var0;
               client.destinationY = -1742931333 * var1;
               PacketBufferNode var32 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3922, client.packetWriter.isaacCipher, -2005411760);
               var32.packetBuffer.writeShortLE(client.selectedSpellItemId * -2111303253, 909810002);
               PacketBuffer var112 = var32.packetBuffer;
               byte var118;
               if (IndexCheck.method6514(client.indexCheck, 82, (short)1337)) {
                  if (var25 == 31) {
                     return;
                  }

                  var118 = 1;
               } else {
                  var118 = 0;
               }

               var112.writeByteNeg(var118, 338397670);
               var32.packetBuffer.writeIntIME(Skills.selectedSpellWidget * -1070656277, 783375377);
               var32.packetBuffer.writeShortAdd(var3, 1627213529);
               var32.packetBuffer.writeShortAddLE(client.selectedSpellChildIndex * -436571069, -1959581546);
               PacketWriter.method3330(client.packetWriter, var32, -1771370198);
            }
         }

         if (var17 == 47) {
            Player var38 = (Player)var30.get(var3);
            if (null != var38) {
               client.mouseCrossX = var8 * -1644257037;
               client.mouseCrossY = -881990251 * var9;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = var0 * -1650976811;
               client.destinationY = var1 * -1742931333;
               PacketBufferNode var84 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3870, client.packetWriter.isaacCipher, -1931429429);
               var84.packetBuffer.writeShort(var3, -1264258006);
               var84.packetBuffer.writeByteNeg(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, 338397670);
               PacketWriter.method3330(client.packetWriter, var84, -1771370198);
            }
         }

         if (var17 == 6) {
            client.mouseCrossX = var8 * -1644257037;
            client.mouseCrossY = var9 * -881990251;
            client.mouseCrossColor = 768588770;
            client.mouseCrossState = 0;
            client.destinationX = -1650976811 * var0;
            client.destinationY = -1742931333 * var1;
            PacketBufferNode var39 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3887, client.packetWriter.isaacCipher, -1667929457);
            var39.packetBuffer.writeShortAddLE(var27 + var0, -1933095992);
            var39.packetBuffer.writeShortLE(var3, 1411274598);
            var39.packetBuffer.writeShortAddLE(var1 + var28, -2022566745);
            var39.packetBuffer.writeByteNeg(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, 338397670);
            PacketWriter.method3330(client.packetWriter, var39, -1771370198);
         }

         if (50 == var17) {
            Player var40 = (Player)var30.get(var3);
            if (var40 != null) {
               client.mouseCrossX = -1644257037 * var8;
               client.mouseCrossY = var9 * -881990251;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = -1650976811 * var0;
               client.destinationY = -1742931333 * var1;
               PacketBufferNode var85 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3892, client.packetWriter.isaacCipher, -1284357973);
               var85.packetBuffer.writeShortAddLE(var3, -2078569295);
               Buffer.method12113(var85.packetBuffer, IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, (short)-22347);
               PacketWriter.method3330(client.packetWriter, var85, -1771370198);
            }
         }

         if (var17 == 28) {
            PacketBufferNode var41 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3917, client.packetWriter.isaacCipher, -1442106867);
            var41.packetBuffer.writeInt(var1, -88235596);
            PacketWriter.method3330(client.packetWriter, var41, -1771370198);
            Widget var86 = class226.widgetDefinition.method7953(var1, 2130014054);
            if (null != var86 && var86.cs1Instructions != null && var86.cs1Instructions[0][0] == 5) {
               int var33 = var86.cs1Instructions[0][1];
               Varps.Varps_main[var33] = 1 - Varps.Varps_main[var33];
               client.method2414(var33);
               Huffman.changeGameOptions(var33, 1382603152);
            }
         }

         if (67 == var17) {
            client.mouseCrossX = var8 * -1644257037;
            client.mouseCrossY = -881990251 * var9;
            client.mouseCrossColor = 768588770;
            client.mouseCrossState = 0;
            client.destinationX = -1650976811 * var0;
            client.destinationY = -1742931333 * var1;
            PacketBufferNode var42 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3955, client.packetWriter.isaacCipher, -2061353862);
            var42.packetBuffer.writeShortAddLE(var3, -1953332351);
            Buffer.method12113(var42.packetBuffer, IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, (short)-8301);
            PacketWriter.method3330(client.packetWriter, var42, -1771370198);
         }

         if (var17 == 48) {
            Player var43 = (Player)var30.get(var3);
            if (null != var43) {
               client.mouseCrossX = -1644257037 * var8;
               client.mouseCrossY = var9 * -881990251;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = -1650976811 * var0;
               client.destinationY = -1742931333 * var1;
               PacketBufferNode var87 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3879, client.packetWriter.isaacCipher, -2083273678);
               var87.packetBuffer.writeShortAdd(var3, 266511834);
               Buffer.method12113(var87.packetBuffer, IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, (short)-22302);
               PacketWriter.method3330(client.packetWriter, var87, -1771370198);
            }
         }

         if (46 == var17) {
            Player var44 = (Player)var30.get(var3);
            if (null != var44) {
               client.mouseCrossX = -1644257037 * var8;
               client.mouseCrossY = -881990251 * var9;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = -1650976811 * var0;
               client.destinationY = -1742931333 * var1;
               PacketBufferNode var88 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3928, client.packetWriter.isaacCipher, -1390375776);
               Buffer.method12113(var88.packetBuffer, IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, (short)-17562);
               var88.packetBuffer.writeShort(var3, -1324937712);
               PacketWriter.method3330(client.packetWriter, var88, -1771370198);
            }
         }

         if (var17 == 1004) {
            client.mouseCrossX = -1644257037 * var8;
            client.mouseCrossY = var9 * -881990251;
            client.mouseCrossColor = 768588770;
            client.mouseCrossState = 0;
            PacketBufferNode var45 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3941, client.packetWriter.isaacCipher, -1737734133);
            var45.packetBuffer.writeShort(var3, -2064106916);
            var45.packetBuffer.writeShortLE(var1 + var28, 892807809);
            var45.packetBuffer.writeShortLE(var0 + var27, 1000236725);
            PacketWriter.method3330(client.packetWriter, var45, -1771370198);
         }

         if (var17 == 60) {
            client.mouseCrossX = -1644257037 * var8;
            client.mouseCrossY = -881990251 * var9;
            client.mouseCrossColor = 384294385;
            client.mouseCrossState = 0;
            client.field891 = var3 * -1033955559;
            client.field893 = 1353646930;
            PacketBufferNode var46 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3947, client.packetWriter.isaacCipher, -1285736655);
            var46.packetBuffer.writeByteAdd(var3, -1190025729);
            PacketWriter.method3330(client.packetWriter, var46, -1771370198);
         }

         if (var17 == 10) {
            NPC var47 = (NPC)var29.get(var3);
            if (null != var47) {
               client.mouseCrossX = var8 * -1644257037;
               client.mouseCrossY = var9 * -881990251;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = var0 * -1650976811;
               client.destinationY = -1742931333 * var1;
               PacketBufferNode var89 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3885, client.packetWriter.isaacCipher, -1825896617);
               var89.packetBuffer.writeShort(var3, -2062444213);
               var89.packetBuffer.writeByteNeg(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, 338397670);
               PacketWriter.method3330(client.packetWriter, var89, -1771370198);
            }
         }

         if (var17 == 29) {
            PacketBufferNode var48 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3917, client.packetWriter.isaacCipher, -1384421240);
            var48.packetBuffer.writeInt(var1, 651864959);
            PacketWriter.method3330(client.packetWriter, var48, -1771370198);
            Widget var90 = class226.widgetDefinition.method7953(var1, 1774051072);
            if (null != var90 && null != var90.cs1Instructions && var90.cs1Instructions[0][0] == 5) {
               if (var25 == 31) {
                  return;
               }

               int var108 = var90.cs1Instructions[0][1];
               if (Varps.Varps_main[var108] != var90.cs1ComparisonValues[0]) {
                  Varps.Varps_main[var108] = var90.cs1ComparisonValues[0];
                  client.method2414(var108);
                  Huffman.changeGameOptions(var108, 1382603152);
               }
            }
         }

         if (8 == var17) {
            NPC var49 = (NPC)var29.get(var3);
            if (var49 != null) {
               client.mouseCrossX = -1644257037 * var8;
               client.mouseCrossY = -881990251 * var9;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = var0 * -1650976811;
               client.destinationY = -1742931333 * var1;
               PacketBufferNode var91 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3949, client.packetWriter.isaacCipher, -1510685827);
               var91.packetBuffer.writeShortAdd(client.selectedSpellItemId * -2111303253, -602471947);
               var91.packetBuffer.writeIntIME(-1070656277 * Skills.selectedSpellWidget, 783375377);
               var91.packetBuffer.writeShortLE(client.selectedSpellChildIndex * -436571069, 1988896130);
               PacketBuffer var113 = var91.packetBuffer;
               byte var119;
               if (IndexCheck.method6514(client.indexCheck, 82, (short)1337)) {
                  if (var25 == 31) {
                     return;
                  }

                  var119 = 1;
               } else {
                  var119 = 0;
               }

               Buffer.method12113(var113, var119, (short)6004);
               var91.packetBuffer.writeShortAdd(var3, 687632049);
               PacketWriter.method3330(client.packetWriter, var91, -1771370198);
            }
         }

         if (5 == var17) {
            client.mouseCrossX = -1644257037 * var8;
            client.mouseCrossY = -881990251 * var9;
            client.mouseCrossColor = 768588770;
            client.mouseCrossState = 0;
            client.destinationX = var0 * -1650976811;
            client.destinationY = var1 * -1742931333;
            PacketBufferNode var50 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3876, client.packetWriter.isaacCipher, -2009552408);
            var50.packetBuffer.writeShortLE(var1 + var28, 1864357230);
            var50.packetBuffer.writeShortLE(var3, 1755624741);
            var50.packetBuffer.writeShortAdd(var0 + var27, 1886495588);
            Buffer.method12113(var50.packetBuffer, IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, (short)-14573);
            PacketWriter.method3330(client.packetWriter, var50, -1771370198);
         }

         if (var17 == 1003) {
            client.mouseCrossX = var8 * -1644257037;
            client.mouseCrossY = -881990251 * var9;
            client.mouseCrossColor = 768588770;
            client.mouseCrossState = 0;
            NPC var51 = (NPC)var29.get(var3);
            if (var51 != null) {
               NPCComposition var92 = var51.definition;
               if (var92.transforms != null) {
                  var92 = NPCComposition.method4683(var92, (byte)0);
               }

               if (var92 != null) {
                  PacketBufferNode var109 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3907, client.packetWriter.isaacCipher, -2128852570);
                  var109.packetBuffer.writeShortAddLE(1435750363 * var92.id, -1835834115);
                  PacketWriter.method3330(client.packetWriter, var109, -1771370198);
               }
            }
         }

         if (20 == var17) {
            client.mouseCrossX = var8 * -1644257037;
            client.mouseCrossY = -881990251 * var9;
            client.mouseCrossColor = 768588770;
            client.mouseCrossState = 0;
            client.destinationX = var0 * -1650976811;
            client.destinationY = -1742931333 * var1;
            PacketBufferNode var52 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3915, client.packetWriter.isaacCipher, -1963166992);
            var52.packetBuffer.writeShortAddLE(var27 + var0, -1975665443);
            var52.packetBuffer.writeByteNeg(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, 338397670);
            var52.packetBuffer.writeShortAdd(var3, 958136981);
            var52.packetBuffer.writeShortLE(var28 + var1, 1625927830);
            PacketWriter.method3330(client.packetWriter, var52, -1771370198);
         }

         if (var17 == 1002) {
            if (var25 == 31) {
               return;
            }

            client.mouseCrossX = -1644257037 * var8;
            client.mouseCrossY = var9 * -881990251;
            client.mouseCrossColor = 768588770;
            client.mouseCrossState = 0;
            PacketBufferNode var53 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3909, client.packetWriter.isaacCipher, -1272210832);
            var53.packetBuffer.writeShortAdd(var3, -882183191);
            PacketWriter.method3330(client.packetWriter, var53, -1771370198);
         }

         if (var17 == 21) {
            client.mouseCrossX = -1644257037 * var8;
            client.mouseCrossY = -881990251 * var9;
            client.mouseCrossColor = 768588770;
            client.mouseCrossState = 0;
            client.destinationX = var0 * -1650976811;
            client.destinationY = -1742931333 * var1;
            PacketBufferNode var54 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3959, client.packetWriter.isaacCipher, -2059501445);
            var54.packetBuffer.writeShort(var28 + var1, -1565874166);
            var54.packetBuffer.writeByteNeg(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, 338397670);
            var54.packetBuffer.writeShort(var3, -1274453672);
            var54.packetBuffer.writeShortAdd(var0 + var27, 1705716937);
            PacketWriter.method3330(client.packetWriter, var54, -1771370198);
         }

         if (var17 == 57 || var17 == 1007) {
            Widget var55 = class226.widgetDefinition.getWidgetChild(var1, var0, -1650671860);
            if (null != var55) {
               FontName.widgetDefaultMenuAction(var3, var1, var0, var4, var7, -1376442236);
            }
         }

         if (18 == var17) {
            client.mouseCrossX = -1644257037 * var8;
            client.mouseCrossY = var9 * -881990251;
            client.mouseCrossColor = 768588770;
            client.mouseCrossState = 0;
            client.destinationX = var0 * -1650976811;
            client.destinationY = -1742931333 * var1;
            PacketBufferNode var56 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3912, client.packetWriter.isaacCipher, -1489240849);
            Buffer.method12113(var56.packetBuffer, IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, (short)-30543);
            var56.packetBuffer.writeShortAddLE(var27 + var0, -2140311976);
            var56.packetBuffer.writeShort(var1 + var28, -1565581865);
            var56.packetBuffer.writeShortAddLE(var3, -1992680858);
            PacketWriter.method3330(client.packetWriter, var56, -1771370198);
         }

         label1008: {
            if (1008 != var17) {
               if (var25 == 31) {
                  return;
               }

               if (var17 != 1009) {
                  if (var25 == 31) {
                     return;
                  }

                  if (var17 != 1010 && 1011 != var17 && var17 != 1012) {
                     break label1008;
                  }
               }
            }

            Skills.worldMap.worldMapMenuAction(var17, var3, new Coord(var0), new Coord(var1), 121891825);
         }

         if (14 == var17) {
            if (var25 == 31) {
               return;
            }

            Player var57 = (Player)var30.get(var3);
            if (null != var57) {
               client.mouseCrossX = -1644257037 * var8;
               client.mouseCrossY = -881990251 * var9;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = var0 * -1650976811;
               client.destinationY = var1 * -1742931333;
               PacketBufferNode var93 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3911, client.packetWriter.isaacCipher, -1985175083);
               Buffer.method12191(var93.packetBuffer, ModelData0.field3491 * 424083009, -1382899092);
               var93.packetBuffer.writeShortAdd(var3, 1081469145);
               var93.packetBuffer.writeShortAdd(1572525395 * class113.field1724, -1615607708);
               var93.packetBuffer.writeShortAddLE(-750344411 * classSY.field5877, -1803717389);
               var93.packetBuffer.writeByteAdd(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, -827703406);
               PacketWriter.method3330(client.packetWriter, var93, -1771370198);
            }
         }

         if (var17 == 4) {
            client.mouseCrossX = var8 * -1644257037;
            client.mouseCrossY = -881990251 * var9;
            client.mouseCrossColor = 768588770;
            client.mouseCrossState = 0;
            client.destinationX = -1650976811 * var0;
            client.destinationY = -1742931333 * var1;
            PacketBufferNode var58 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3859, client.packetWriter.isaacCipher, -1395492388);
            var58.packetBuffer.writeShortAdd(var27 + var0, -1674950687);
            var58.packetBuffer.writeShortAdd(var28 + var1, 2136787106);
            Buffer.method12113(var58.packetBuffer, IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, (short)-32256);
            var58.packetBuffer.writeShort(var3, -1454047627);
            PacketWriter.method3330(client.packetWriter, var58, -1771370198);
         }

         if (var17 == 13) {
            if (var25 == 31) {
               return;
            }

            NPC var59 = (NPC)var29.get(var3);
            if (var59 != null) {
               client.mouseCrossX = var8 * -1644257037;
               client.mouseCrossY = var9 * -881990251;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = -1650976811 * var0;
               client.destinationY = var1 * -1742931333;
               PacketBufferNode var94 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3902, client.packetWriter.isaacCipher, -1672405761);
               var94.packetBuffer.writeShortAddLE(var3, -1999373392);
               var94.packetBuffer.writeByteNeg(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, 338397670);
               PacketWriter.method3330(client.packetWriter, var94, -1771370198);
            }
         }

         if (var17 == 25) {
            Widget var60 = class226.widgetDefinition.getWidgetChild(var1, var0, -1086986694);
            if (null != var60) {
               class62.method2636(798665770);
               class406.method8778(var1, var0, LoginPacket.Widget_unpackTargetMask(class191.getWidgetFlags(var60, (byte)75), -1940826752), var4, (byte)1);
               client.isItemSelected = 0;
               client.selectedSpellActionName = ItemComposition.Widget_getSpellActionName(var60, 1622961087);
               if (client.selectedSpellActionName == null) {
                  client.selectedSpellActionName = Strings.field4861;
               }

               if (var60.isIf3) {
                  client.selectedSpellName = var60.dataText + class144.colorStartTag(16777215, -1070582704);
               } else {
                  client.selectedSpellName = class144.colorStartTag(65280, 124551863) + var60.field4506 + class144.colorStartTag(16777215, -1131542144);
               }
            }
         } else {
            if (44 == var17) {
               Player var61 = (Player)var30.get(var3);
               if (null != var61) {
                  client.mouseCrossX = -1644257037 * var8;
                  client.mouseCrossY = var9 * -881990251;
                  client.mouseCrossColor = 768588770;
                  client.mouseCrossState = 0;
                  client.destinationX = -1650976811 * var0;
                  client.destinationY = var1 * -1742931333;
                  PacketBufferNode var95 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3873, client.packetWriter.isaacCipher, -1381769007);
                  Buffer.method12113(var95.packetBuffer, IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, (short)-31663);
                  var95.packetBuffer.writeShort(var3, -1873520106);
                  PacketWriter.method3330(client.packetWriter, var95, -1771370198);
               }
            }

            if (65 == var17) {
               client.mouseCrossX = var8 * -1644257037;
               client.mouseCrossY = var9 * -881990251;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = var0 * -1650976811;
               client.destinationY = -1742931333 * var1;
               PacketBufferNode var62 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3923, client.packetWriter.isaacCipher, -1788895664);
               var62.packetBuffer.writeByteAdd(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, -636774765);
               var62.packetBuffer.writeShortAdd(var3, 1793077217);
               PacketWriter.method3330(client.packetWriter, var62, -1771370198);
            }

            if (var17 == 16) {
               client.mouseCrossX = -1644257037 * var8;
               client.mouseCrossY = -881990251 * var9;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = var0 * -1650976811;
               client.destinationY = -1742931333 * var1;
               PacketBufferNode var63 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3880, client.packetWriter.isaacCipher, -1585019489);
               Buffer.method12187(var63.packetBuffer, ModelData0.field3491 * 424083009, -1062690277);
               var63.packetBuffer.writeByteAdd(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, -1873001151);
               var63.packetBuffer.writeShortAdd(classSY.field5877 * -750344411, -619874763);
               var63.packetBuffer.writeShort(var0 + var27, -1996807484);
               var63.packetBuffer.writeShort(var1 + var28, -1226205373);
               var63.packetBuffer.writeShortLE(1572525395 * class113.field1724, 2014271738);
               var63.packetBuffer.writeShort(var3, -1766146757);
               PacketWriter.method3330(client.packetWriter, var63, -1771370198);
            }

            if (26 == var17) {
               if (var25 == 31) {
                  return;
               }

               Login.method1274((byte)1);
            }

            if (66 == var17) {
               client.mouseCrossX = -1644257037 * var8;
               client.mouseCrossY = -881990251 * var9;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = var0 * -1650976811;
               client.destinationY = var1 * -1742931333;
               PacketBufferNode var64 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3916, client.packetWriter.isaacCipher, -1278088761);
               var64.packetBuffer.writeByteNeg(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, 338397670);
               var64.packetBuffer.writeShort(var3, -1800122199);
               PacketWriter.method3330(client.packetWriter, var64, -1771370198);
            }

            if (3 == var17) {
               client.mouseCrossX = var8 * -1644257037;
               client.mouseCrossY = -881990251 * var9;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = var0 * -1650976811;
               client.destinationY = -1742931333 * var1;
               PacketBufferNode var65 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3946, client.packetWriter.isaacCipher, -1351557665);
               var65.packetBuffer.writeShortAddLE(var27 + var0, -1893461991);
               var65.packetBuffer.writeShortLE(var1 + var28, 1435670110);
               var65.packetBuffer.writeByteNeg(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, 338397670);
               var65.packetBuffer.writeShortAdd(var3, -1802936656);
               PacketWriter.method3330(client.packetWriter, var65, -1771370198);
            }

            if (49 == var17) {
               Player var66 = (Player)var30.get(var3);
               if (var66 != null) {
                  if (var25 == 31) {
                     return;
                  }

                  client.mouseCrossX = -1644257037 * var8;
                  client.mouseCrossY = var9 * -881990251;
                  client.mouseCrossColor = 768588770;
                  client.mouseCrossState = 0;
                  client.destinationX = var0 * -1650976811;
                  client.destinationY = var1 * -1742931333;
                  PacketBufferNode var96 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3958, client.packetWriter.isaacCipher, -1310735626);
                  var96.packetBuffer.writeShort(var3, -1400528292);
                  PacketBuffer var114 = var96.packetBuffer;
                  byte var120;
                  if (IndexCheck.method6514(client.indexCheck, 82, (short)1337)) {
                     if (var25 == 31) {
                        return;
                     }

                     var120 = 1;
                  } else {
                     var120 = 0;
                  }

                  var114.writeByteNeg(var120, 338397670);
                  PacketWriter.method3330(client.packetWriter, var96, -1771370198);
               }
            }

            if (19 == var17) {
               client.mouseCrossX = -1644257037 * var8;
               client.mouseCrossY = var9 * -881990251;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = -1650976811 * var0;
               client.destinationY = -1742931333 * var1;
               PacketBufferNode var67 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3940, client.packetWriter.isaacCipher, -1881824024);
               var67.packetBuffer.writeShortAdd(var28 + var1, -1639632492);
               var67.packetBuffer.writeShort(var27 + var0, -1278918804);
               var67.packetBuffer.writeByteAdd(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, 1992538993);
               var67.packetBuffer.writeShortAdd(var3, 113705974);
               PacketWriter.method3330(client.packetWriter, var67, -1771370198);
            }

            if (64 == var17) {
               client.mouseCrossX = -1644257037 * var8;
               client.mouseCrossY = -881990251 * var9;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = -1650976811 * var0;
               client.destinationY = var1 * -1742931333;
               PacketBufferNode var68 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3874, client.packetWriter.isaacCipher, -1685615194);
               PacketBuffer var115 = var68.packetBuffer;
               byte var121;
               if (IndexCheck.method6514(client.indexCheck, 82, (short)1337)) {
                  if (var25 == 31) {
                     return;
                  }

                  var121 = 1;
               } else {
                  var121 = 0;
               }

               var115.writeByte(var121, (short)-8143);
               var68.packetBuffer.writeShortAdd(var3, -1261761976);
               PacketWriter.method3330(client.packetWriter, var68, -1771370198);
            }

            if (11 == var17) {
               if (var25 == 31) {
                  return;
               }

               NPC var69 = (NPC)var29.get(var3);
               if (null != var69) {
                  client.mouseCrossX = var8 * -1644257037;
                  client.mouseCrossY = var9 * -881990251;
                  client.mouseCrossColor = 768588770;
                  client.mouseCrossState = 0;
                  client.destinationX = -1650976811 * var0;
                  client.destinationY = var1 * -1742931333;
                  PacketBufferNode var97 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3939, client.packetWriter.isaacCipher, -1997491933);
                  var97.packetBuffer.writeByte(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, (short)-20484);
                  var97.packetBuffer.writeShortLE(var3, 1174263593);
                  PacketWriter.method3330(client.packetWriter, var97, -1771370198);
               }
            }

            if (var17 == 51) {
               Player var70 = (Player)var30.get(var3);
               if (var70 != null) {
                  client.mouseCrossX = var8 * -1644257037;
                  client.mouseCrossY = -881990251 * var9;
                  client.mouseCrossColor = 768588770;
                  client.mouseCrossState = 0;
                  client.destinationX = -1650976811 * var0;
                  client.destinationY = var1 * -1742931333;
                  PacketBufferNode var98 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3936, client.packetWriter.isaacCipher, -1300345493);
                  var98.packetBuffer.writeByte(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, (short)-6210);
                  var98.packetBuffer.writeShortAddLE(var3, -1941378512);
                  PacketWriter.method3330(client.packetWriter, var98, -1771370198);
               }
            }

            if (15 == var17) {
               if (var25 == 31) {
                  return;
               }

               Player var71 = (Player)var30.get(var3);
               if (null != var71) {
                  client.mouseCrossX = -1644257037 * var8;
                  client.mouseCrossY = var9 * -881990251;
                  client.mouseCrossColor = 768588770;
                  client.mouseCrossState = 0;
                  client.destinationX = var0 * -1650976811;
                  client.destinationY = -1742931333 * var1;
                  PacketBufferNode var99 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3919, client.packetWriter.isaacCipher, -1814037255);
                  var99.packetBuffer.writeShortAddLE(-436571069 * client.selectedSpellChildIndex, -1818497071);
                  var99.packetBuffer.writeShort(var3, -2018525850);
                  Buffer.method12187(var99.packetBuffer, Skills.selectedSpellWidget * -1070656277, 1418496937);
                  var99.packetBuffer.writeShortAdd(-2111303253 * client.selectedSpellItemId, 89649400);
                  PacketBuffer var116 = var99.packetBuffer;
                  byte var122;
                  if (IndexCheck.method6514(client.indexCheck, 82, (short)1337)) {
                     if (var25 == 31) {
                        return;
                     }

                     var122 = 1;
                  } else {
                     var122 = 0;
                  }

                  var116.writeByte(var122, (short)-10006);
                  PacketWriter.method3330(client.packetWriter, var99, -1771370198);
               }
            }

            if (1013 == var17) {
               if (var25 == 31) {
                  return;
               }

               client.mouseCrossX = var8 * -1644257037;
               client.mouseCrossY = -881990251 * var9;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               PacketBufferNode var72 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3957, client.packetWriter.isaacCipher, -1341671752);
               var72.packetBuffer.writeShort(var3, -1905274856);
               PacketWriter.method3330(client.packetWriter, var72, -1771370198);
            }

            if (var17 == 9) {
               NPC var73 = (NPC)var29.get(var3);
               if (var73 != null) {
                  if (var25 == 31) {
                     return;
                  }

                  client.mouseCrossX = -1644257037 * var8;
                  client.mouseCrossY = -881990251 * var9;
                  client.mouseCrossColor = 768588770;
                  client.mouseCrossState = 0;
                  client.destinationX = var0 * -1650976811;
                  client.destinationY = -1742931333 * var1;
                  PacketBufferNode var100 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3877, client.packetWriter.isaacCipher, -1214001740);
                  var100.packetBuffer.writeByteAdd(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, 1868494073);
                  var100.packetBuffer.writeShortLE(var3, 1504394378);
                  PacketWriter.method3330(client.packetWriter, var100, -1771370198);
               }
            }

            if (var17 == 1) {
               client.mouseCrossX = var8 * -1644257037;
               client.mouseCrossY = -881990251 * var9;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = var0 * -1650976811;
               client.destinationY = -1742931333 * var1;
               PacketBufferNode var74 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3867, client.packetWriter.isaacCipher, -1664586090);
               PacketBuffer var117 = var74.packetBuffer;
               byte var123;
               if (IndexCheck.method6514(client.indexCheck, 82, (short)1337)) {
                  if (var25 == 31) {
                     return;
                  }

                  var123 = 1;
               } else {
                  var123 = 0;
               }

               var117.writeByte(var123, (short)-29482);
               var74.packetBuffer.writeShortAdd(classSY.field5877 * -750344411, -2084734141);
               var74.packetBuffer.writeShort(var28 + var1, -1594835575);
               var74.packetBuffer.writeInt(424083009 * ModelData0.field3491, 247973774);
               var74.packetBuffer.writeShort(var0 + var27, -1546726423);
               var74.packetBuffer.writeShort(class113.field1724 * 1572525395, -1511788688);
               var74.packetBuffer.writeShortAdd(var3, 1290270053);
               PacketWriter.method3330(client.packetWriter, var74, -1771370198);
            }

            if (58 == var17) {
               Widget var75 = class226.widgetDefinition.getWidgetChild(var1, var0, -1674743038);
               if (var75 != null) {
                  if (null != var75.onClanTransmit) {
                     if (var25 == 31) {
                        return;
                     }

                     ScriptEvent var101 = new ScriptEvent();
                     var101.widget = var75;
                     var101.opIndex = 1362671939 * var3;
                     var101.targetName = var7;
                     var101.args = var75.onClanTransmit;
                     class141.runScriptEvent(var101, 1856325427);
                  }

                  PacketBufferNode var102 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3868, client.packetWriter.isaacCipher, -1962194588);
                  var102.packetBuffer.writeIntIME(var1, 783375377);
                  var102.packetBuffer.writeShortAddLE(client.selectedSpellChildIndex * -436571069, -1796007809);
                  var102.packetBuffer.writeShortLE(var0, 1899299889);
                  var102.packetBuffer.writeShortLE(-2111303253 * client.selectedSpellItemId, 1084586981);
                  var102.packetBuffer.writeIntIME(-1070656277 * Skills.selectedSpellWidget, 783375377);
                  var102.packetBuffer.writeShortAdd(var4, 1480563755);
                  PacketWriter.method3330(client.packetWriter, var102, -1771370198);
               }
            }

            if (12 == var17) {
               NPC var76 = (NPC)var29.get(var3);
               if (var76 != null) {
                  client.mouseCrossX = var8 * -1644257037;
                  client.mouseCrossY = -881990251 * var9;
                  client.mouseCrossColor = 768588770;
                  client.mouseCrossState = 0;
                  client.destinationX = var0 * -1650976811;
                  client.destinationY = var1 * -1742931333;
                  PacketBufferNode var103 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3918, client.packetWriter.isaacCipher, -1229709391);
                  var103.packetBuffer.writeShortAdd(var3, -100255444);
                  var103.packetBuffer.writeByte(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, (short)-22395);
                  PacketWriter.method3330(client.packetWriter, var103, -1771370198);
               }
            }

            if (2 == var17) {
               client.mouseCrossX = var8 * -1644257037;
               client.mouseCrossY = -881990251 * var9;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = var0 * -1650976811;
               client.destinationY = -1742931333 * var1;
               PacketBufferNode var77 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3920, client.packetWriter.isaacCipher, -1984066268);
               var77.packetBuffer.writeShort(var28 + var1, -1863525375);
               var77.packetBuffer.writeShortAddLE(-2111303253 * client.selectedSpellItemId, -1982588198);
               var77.packetBuffer.writeShort(var27 + var0, -1335058629);
               var77.packetBuffer.writeByte(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, (short)-7614);
               Buffer.method12187(var77.packetBuffer, -1070656277 * Skills.selectedSpellWidget, -1492129158);
               var77.packetBuffer.writeShortAddLE(client.selectedSpellChildIndex * -436571069, -1924752398);
               var77.packetBuffer.writeShortAddLE(var3, -1827133203);
               PacketWriter.method3330(client.packetWriter, var77, -1771370198);
            }

            if (var17 == 22) {
               client.mouseCrossX = var8 * -1644257037;
               client.mouseCrossY = var9 * -881990251;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = var0 * -1650976811;
               client.destinationY = -1742931333 * var1;
               PacketBufferNode var78 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3950, client.packetWriter.isaacCipher, -1418074107);
               var78.packetBuffer.writeShortLE(var3, 1790353118);
               var78.packetBuffer.writeShortAdd(var27 + var0, -1341778008);
               var78.packetBuffer.writeShortAddLE(var28 + var1, -1849184367);
               Buffer.method12113(var78.packetBuffer, IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, (short)-22945);
               PacketWriter.method3330(client.packetWriter, var78, -1771370198);
            }

            if (7 == var17) {
               NPC var79 = (NPC)var29.get(var3);
               if (var79 != null) {
                  client.mouseCrossX = var8 * -1644257037;
                  client.mouseCrossY = var9 * -881990251;
                  client.mouseCrossColor = 768588770;
                  client.mouseCrossState = 0;
                  client.destinationX = -1650976811 * var0;
                  client.destinationY = -1742931333 * var1;
                  PacketBufferNode var104 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3934, client.packetWriter.isaacCipher, -1312185664);
                  var104.packetBuffer.writeShort(var3, -1347995735);
                  var104.packetBuffer.writeByteAdd(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, -1859171660);
                  var104.packetBuffer.writeShortAdd(-750344411 * classSY.field5877, 1788175174);
                  var104.packetBuffer.writeShortLE(1572525395 * class113.field1724, 1735884807);
                  Buffer.method12191(var104.packetBuffer, ModelData0.field3491 * 424083009, -501192368);
                  PacketWriter.method3330(client.packetWriter, var104, -1771370198);
               }
            }

            if (30 == var17) {
               if (var25 == 31) {
                  return;
               }

               if (null == client.meslayerContinueWidget) {
                  HealthBarDefinition.resumePauseWidget(var1, var0, 1560720306);
                  client.meslayerContinueWidget = class226.widgetDefinition.getWidgetChild(var1, var0, -760931723);
                  class376.invalidateWidget(client.meslayerContinueWidget, (byte)5);
               }
            }

            if (61 == var17) {
               if (var25 == 31) {
                  return;
               }

               WorldEntity var80 = (WorldEntity)var26.worldEntities.get((long)var3);
               if (var80 != null) {
                  client.mouseCrossX = -1644257037 * var8;
                  client.mouseCrossY = -881990251 * var9;
                  client.mouseCrossColor = 768588770;
                  client.mouseCrossState = 0;
                  client.destinationX = var0 * -1650976811;
                  client.destinationY = var1 * -1742931333;
                  PacketBufferNode var105 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3875, client.packetWriter.isaacCipher, -2133640359);
                  var105.packetBuffer.writeShortAdd(class113.field1724 * 1572525395, -539281733);
                  var105.packetBuffer.writeShort(-750344411 * classSY.field5877, -1997445218);
                  var105.packetBuffer.writeByte(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, (short)-17528);
                  var105.packetBuffer.writeShort(var3, -1787498587);
                  var105.packetBuffer.writeInt(ModelData0.field3491 * 424083009, 690677740);
                  PacketWriter.method3330(client.packetWriter, var105, -1771370198);
               }
            }

            if (24 == var17) {
               Widget var81 = class226.widgetDefinition.method7953(var1, 354826461);
               if (var81 != null) {
                  boolean var106 = true;
                  if (var81.contentType * 1889823193 > 0) {
                     var106 = classVK.method11310(var81, 807253553);
                  }

                  if (var106) {
                     PacketBufferNode var110 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3917, client.packetWriter.isaacCipher, -1752698904);
                     var110.packetBuffer.writeInt(var1, 1223446041);
                     PacketWriter.method3330(client.packetWriter, var110, -1771370198);
                  }
               }
            }

            if (var17 == 45) {
               Player var82 = (Player)var30.get(var3);
               if (null != var82) {
                  client.mouseCrossX = var8 * -1644257037;
                  client.mouseCrossY = var9 * -881990251;
                  client.mouseCrossColor = 768588770;
                  client.mouseCrossState = 0;
                  client.destinationX = var0 * -1650976811;
                  client.destinationY = var1 * -1742931333;
                  PacketBufferNode var107 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3865, client.packetWriter.isaacCipher, -1628257578);
                  var107.packetBuffer.writeByte(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, (short)-14584);
                  var107.packetBuffer.writeShort(var3, -2005972205);
                  PacketWriter.method3330(client.packetWriter, var107, -1771370198);
               }
            }

            if (63 == var17) {
               if (var25 == 31) {
                  return;
               }

               client.mouseCrossX = var8 * -1644257037;
               client.mouseCrossY = var9 * -881990251;
               client.mouseCrossColor = 768588770;
               client.mouseCrossState = 0;
               client.destinationX = var0 * -1650976811;
               client.destinationY = var1 * -1742931333;
               PacketBufferNode var83 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3882, client.packetWriter.isaacCipher, -2126353666);
               var83.packetBuffer.writeByteNeg(IndexCheck.method6514(client.indexCheck, 82, (short)1337) ? 1 : 0, 338397670);
               var83.packetBuffer.writeShortAddLE(var3, -2131747618);
               PacketWriter.method3330(client.packetWriter, var83, -1771370198);
            }

            if (0 != client.isItemSelected * -415813337) {
               client.isItemSelected = 0;
               class376.invalidateWidget(class226.widgetDefinition.method7953(ModelData0.field3491 * 424083009, 1779194198), (byte)5);
            }

            if (client.isSpellSelected) {
               class62.method2636(798665770);
            }
         }
      }
   }
}
