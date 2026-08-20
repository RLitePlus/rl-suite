import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("od")
public class class379 {
   @ObfuscatedName("an")
   public static final short[][] field4418 = new short[][]{
      {
            6554,
            115,
            10304,
            28,
            5702,
            7756,
            5681,
            4510,
            -31835,
            22437,
            2859,
            -11339,
            16,
            5157,
            10446,
            3658,
            -27314,
            -21965,
            472,
            580,
            784,
            21966,
            28950,
            -15697,
            -14002,
            -22116,
            945,
            8144,
            -13414,
            30389
      },
      {
            9104,
            10275,
            7595,
            3610,
            7975,
            8526,
            918,
            -26734,
            24466,
            10145,
            -6882,
            5027,
            1457,
            16565,
            -30545,
            25486,
            24,
            5392,
            10429,
            3673,
            -27335,
            -21957,
            192,
            687,
            412,
            21821,
            28835,
            -15460,
            -14019
      },
      new short[0],
      new short[0],
      new short[0]
   };
   @ObfuscatedName("at")
   public static final short[][] field4417 = new short[][]{
      {
            6798,
            107,
            10283,
            16,
            4797,
            7744,
            5799,
            4634,
            -31839,
            22433,
            2983,
            -11343,
            8,
            5281,
            10438,
            3650,
            -27322,
            -21845,
            200,
            571,
            908,
            21830,
            28946,
            -15701,
            -14010,
            -22122,
            937,
            8130,
            -13422,
            30385
      },
      {
            8741,
            12,
            -1506,
            -22374,
            7735,
            8404,
            1701,
            -27106,
            24094,
            10153,
            -8915,
            4783,
            1341,
            16578,
            -30533,
            25239,
            8,
            5281,
            10438,
            3650,
            -27322,
            -21845,
            200,
            571,
            908,
            21830,
            28946,
            -15701,
            -14010
      },
      {
            25238,
            8742,
            12,
            -1506,
            -22374,
            7735,
            8404,
            1701,
            -27106,
            24094,
            10153,
            -8915,
            4783,
            1341,
            16578,
            -30533,
            8,
            5281,
            10438,
            3650,
            -27322,
            -21845,
            200,
            571,
            908,
            21830,
            28946,
            -15701,
            -14010
      },
      {4626, 11146, 6439, 12, 4758, 10270},
      {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}
   };
   @ObfuscatedName("av")
   public static final short[] field4415 = new short[]{6798, 8741, 25238, 4626, 4550};
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final String field4420 = "passwordchoice.ws";
   @ObfuscatedName("ag")
   public static final short[] field4416 = new short[]{-10304, 9104, -1, -1, -1};
   @ToRemove(unused = "true")
   @ObfuscatedName("cr")
   static final int field4419 = 765;

   class379() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("at")
   static boolean method7974(int var0, int var1) {
      return 4 != var0 || var1 < 8;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ag")
   static boolean method7975(int var0, int var1) {
      return 4 != var0 || var1 < 8;
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("bm")
   static int method7978(int var0, Script var1, boolean var2, int var3) {
      try {
         if (var0 == 3400) {
            if (var3 != -1813085635) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var12 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var14 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               EnumComposition var15 = class108.getEnum(var12, -527943295);
               if ('s' != var15.inputType && var3 != -1813085635) {
                  throw new IllegalStateException();
               } else {
                  for (int var16 = 0; var16 < -132553189 * var15.outputCount; var16++) {
                     if (var3 != -1813085635) {
                        throw new IllegalStateException();
                     }

                     if (var14 == var15.keys[var16]) {
                        if (var3 != -1813085635) {
                           throw new IllegalStateException();
                        }

                        Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var15.strVals[var16];
                        var15 = null;
                        break;
                     }
                  }

                  if (null != var15) {
                     if (var3 != -1813085635) {
                        throw new IllegalStateException();
                     }

                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var15.defaultStr;
                  }

                  return 1;
               }
            }
         } else if (var0 == 3408) {
            if (var3 != -1813085635) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 1417452148;
               int var11 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var13 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
               int var6 = Interpreter.Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
               int var7 = Interpreter.Interpreter_intStack[3 + class408.Interpreter_intStackSize * 327716789];
               EnumComposition var8 = class108.getEnum(var6, -1774522752);
               if (var8.outputType == var11) {
                  if (var3 != -1813085635) {
                     throw new IllegalStateException();
                  }

                  if (var13 == var8.inputType) {
                     for (int var9 = 0; var9 < -132553189 * var8.outputCount; var9++) {
                        if (var3 != -1813085635) {
                           throw new IllegalStateException();
                        }

                        if (var7 == var8.keys[var9]) {
                           if (var3 != -1813085635) {
                              throw new IllegalStateException();
                           }

                           if (var13 == 115) {
                              if (var3 != -1813085635) {
                                 throw new IllegalStateException();
                              }

                              Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var8.strVals[var9];
                           } else {
                              Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var8.intVals[var9];
                           }

                           var8 = null;
                           break;
                        }
                     }

                     if (null != var8) {
                        if (var3 != -1813085635) {
                           throw new IllegalStateException();
                        }

                        if (115 == var13) {
                           if (var3 != -1813085635) {
                              throw new IllegalStateException();
                           }

                           Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var8.defaultStr;
                        } else {
                           Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var8.defaultInt * 1780171489;
                        }
                     }

                     return 1;
                  }
               }

               if (var13 == 115) {
                  if (var3 != -1813085635) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = Strings.field4861;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               }

               return 1;
            }
         } else if (var0 == 3411) {
            if (var3 != -1813085635) {
               throw new IllegalStateException();
            } else {
               int var4 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               EnumComposition var5 = class108.getEnum(var4, 427919016);
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = EnumComposition.method4460(var5, 89055037);
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "od.bm(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;IS)V")
   @ObfuscatedName("ax")
   static final void Widget_setKeyIgnoreHeld(Widget var0, int var1, short var2) {
      try {
         if (null == var0.field4557) {
            if (var2 <= 184) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            if (var0.field4595 == null) {
               if (var2 <= 184) {
                  return;
               }

               var0.field4595 = new int[var0.field4557.length];
            }

            var0.field4595[var1] = Integer.MAX_VALUE;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "od.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("an")
   static boolean method7976(int var0, int var1) {
      return 4 != var0 || var1 < 8;
   }
}
