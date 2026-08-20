import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gq")
public class class180 extends DualNode {
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final int field2048 = 22;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("av")
   public static EvictingDualNodeHashTable field1913 = new EvictingDualNodeHashTable(64);
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field2047 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field2050 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field2049 = 1;

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("ak")
   public static void method4263(Buffer var0, int var1, int var2) {
      try {
         if (null != JagexCache.JagexCache_randomDat) {
            if (var2 == 1695686760) {
               throw new IllegalStateException();
            }

            try {
               JagexCache.JagexCache_randomDat.seek(0L);
               JagexCache.JagexCache_randomDat.write(var0.array, var1, 24, -1507952609);
            } catch (Exception var4) {
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "gq.ak(" + ')');
      }
   }

   class180() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("bz")
   static int method4265(int var0, Script var1, boolean var2, int var3) {
      try {
         Widget var4 = class226.widgetDefinition
            .method7953(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], -1830125306);
         if (2800 == var0) {
            if (var3 == 316037303) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = LoginPacket.Widget_unpackTargetMask(
                  class191.getWidgetFlags(var4, (byte)75), -536342493
               );
               return 1;
            }
         } else if (2801 != var0) {
            if (var0 == 2802) {
               if (var3 == 316037303) {
                  throw new IllegalStateException();
               } else {
                  if (null == var4.dataText) {
                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
                  } else {
                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var4.dataText;
                  }

                  return 1;
               }
            } else {
               return 2;
            }
         } else {
            int var5 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
            var5--;
            if (var4.actions != null) {
               if (var3 == 316037303) {
                  throw new IllegalStateException();
               }

               if (var5 < var4.actions.length) {
                  if (var3 == 316037303) {
                     throw new IllegalStateException();
                  }

                  if (var4.actions[var5] != null) {
                     Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var4.actions[var5];
                     return 1;
                  }

                  if (var3 == 316037303) {
                     throw new IllegalStateException();
                  }
               }
            }

            Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = "";
            return 1;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "gq.bz(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbm;I)V")
   @ObfuscatedName("ah")
   static void method4264(GameEngine var0, int var1) {
      try {
         IndexCheck var2 = HttpRequest.method280((byte)1);

         while (var2.method6510((byte)-118)) {
            if (var1 >= 81622619) {
               return;
            }

            if (2044709447 * var2.field3386 == 13) {
               if (var1 >= 81622619) {
                  throw new IllegalStateException();
               }

               classSX.method10523((byte)0);
               return;
            }

            if (2044709447 * var2.field3386 == 96) {
               if (var1 >= 81622619) {
                  return;
               }

               if (1401993025 * Login.worldSelectPage > 0) {
                  if (var1 >= 81622619) {
                     return;
                  }

                  if (class70.worldSelectLeftSprite != null) {
                     if (var1 >= 81622619) {
                        return;
                     }

                     Login.worldSelectPage -= -1031284543;
                  }
               }
            } else if (var2.field3386 * 2044709447 == 97 && Login.worldSelectPage * 1401993025 < 2126332771 * Login.worldSelectPagesCount) {
               if (var1 >= 81622619) {
                  throw new IllegalStateException();
               }

               if (class339.worldSelectRightSprite != null) {
                  Login.worldSelectPage += -1031284543;
               }
            }
         }

         if (MouseHandler.MouseHandler_lastButton * 1721626731 != 1) {
            if (var1 >= 81622619) {
               return;
            }

            if (UrlRequest.mouseCam) {
               return;
            }

            if (var1 >= 81622619) {
               throw new IllegalStateException();
            }

            if (4 != 1721626731 * MouseHandler.MouseHandler_lastButton) {
               return;
            }

            if (var1 >= 81622619) {
               throw new IllegalStateException();
            }
         }

         int var3 = Login.xPadding * 921778921 + 280;
         if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var3) {
            if (var1 >= 81622619) {
               throw new IllegalStateException();
            }

            if (MouseHandler.MouseHandler_lastPressedX * -1018773713 <= 14 + var3) {
               if (var1 >= 81622619) {
                  return;
               }

               if (MouseHandler.MouseHandler_lastPressedY * -261967643 >= 4) {
                  if (var1 >= 81622619) {
                     throw new IllegalStateException();
                  }

                  if (-261967643 * MouseHandler.MouseHandler_lastPressedY <= 18) {
                     if (var1 >= 81622619) {
                        throw new IllegalStateException();
                     }

                     class165.changeWorldSelectSorting(0, 0, -1741154066);
                     return;
                  }
               }
            }
         }

         if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var3 + 15) {
            if (var1 >= 81622619) {
               throw new IllegalStateException();
            }

            if (MouseHandler.MouseHandler_lastPressedX * -1018773713 <= 80 + var3) {
               if (var1 >= 81622619) {
                  throw new IllegalStateException();
               }

               if (MouseHandler.MouseHandler_lastPressedY * -261967643 >= 4 && MouseHandler.MouseHandler_lastPressedY * -261967643 <= 18) {
                  if (var1 >= 81622619) {
                     throw new IllegalStateException();
                  }

                  class165.changeWorldSelectSorting(0, 1, -1858158130);
                  return;
               }
            }
         }

         int var4 = 390 + Login.xPadding * 921778921;
         if (-1018773713 * MouseHandler.MouseHandler_lastPressedX >= var4
            && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= 14 + var4
            && MouseHandler.MouseHandler_lastPressedY * -261967643 >= 4) {
            if (var1 >= 81622619) {
               throw new IllegalStateException();
            }

            if (-261967643 * MouseHandler.MouseHandler_lastPressedY <= 18) {
               if (var1 >= 81622619) {
                  throw new IllegalStateException();
               }

               class165.changeWorldSelectSorting(1, 0, -1645887357);
               return;
            }
         }

         if (-1018773713 * MouseHandler.MouseHandler_lastPressedX >= 15 + var4) {
            if (var1 >= 81622619) {
               throw new IllegalStateException();
            }

            if (-1018773713 * MouseHandler.MouseHandler_lastPressedX <= var4 + 80) {
               if (var1 >= 81622619) {
                  throw new IllegalStateException();
               }

               if (-261967643 * MouseHandler.MouseHandler_lastPressedY >= 4) {
                  if (var1 >= 81622619) {
                     throw new IllegalStateException();
                  }

                  if (-261967643 * MouseHandler.MouseHandler_lastPressedY <= 18) {
                     if (var1 >= 81622619) {
                        throw new IllegalStateException();
                     }

                     class165.changeWorldSelectSorting(1, 1, -1739827148);
                     return;
                  }
               }
            }
         }

         int var5 = 500 + 921778921 * Login.xPadding;
         if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var5) {
            if (var1 >= 81622619) {
               throw new IllegalStateException();
            }

            if (-1018773713 * MouseHandler.MouseHandler_lastPressedX <= var5 + 14) {
               if (var1 >= 81622619) {
                  return;
               }

               if (MouseHandler.MouseHandler_lastPressedY * -261967643 >= 4) {
                  if (var1 >= 81622619) {
                     throw new IllegalStateException();
                  }

                  if (MouseHandler.MouseHandler_lastPressedY * -261967643 <= 18) {
                     if (var1 >= 81622619) {
                        throw new IllegalStateException();
                     }

                     class165.changeWorldSelectSorting(2, 0, -2146694886);
                     return;
                  }
               }
            }
         }

         if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var5 + 15) {
            if (var1 >= 81622619) {
               throw new IllegalStateException();
            }

            if (MouseHandler.MouseHandler_lastPressedX * -1018773713 <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY * -261967643 >= 4) {
               if (var1 >= 81622619) {
                  throw new IllegalStateException();
               }

               if (MouseHandler.MouseHandler_lastPressedY * -261967643 <= 18) {
                  if (var1 >= 81622619) {
                     throw new IllegalStateException();
                  }

                  class165.changeWorldSelectSorting(2, 1, -1652675932);
                  return;
               }
            }
         }

         int var6 = Login.xPadding * 921778921 + 610;
         if (-1018773713 * MouseHandler.MouseHandler_lastPressedX >= var6) {
            if (var1 >= 81622619) {
               throw new IllegalStateException();
            }

            if (-1018773713 * MouseHandler.MouseHandler_lastPressedX <= var6 + 14) {
               if (var1 >= 81622619) {
                  throw new IllegalStateException();
               }

               if (-261967643 * MouseHandler.MouseHandler_lastPressedY >= 4) {
                  if (var1 >= 81622619) {
                     return;
                  }

                  if (MouseHandler.MouseHandler_lastPressedY * -261967643 <= 18) {
                     if (var1 >= 81622619) {
                        throw new IllegalStateException();
                     }

                     class165.changeWorldSelectSorting(3, 0, -1889823658);
                     return;
                  }
               }
            }
         }

         if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var6 + 15) {
            if (var1 >= 81622619) {
               throw new IllegalStateException();
            }

            if (-1018773713 * MouseHandler.MouseHandler_lastPressedX <= var6 + 80) {
               if (var1 >= 81622619) {
                  return;
               }

               if (-261967643 * MouseHandler.MouseHandler_lastPressedY >= 4) {
                  if (var1 >= 81622619) {
                     throw new IllegalStateException();
                  }

                  if (-261967643 * MouseHandler.MouseHandler_lastPressedY <= 18) {
                     if (var1 >= 81622619) {
                        throw new IllegalStateException();
                     }

                     class165.changeWorldSelectSorting(3, 1, -1876429019);
                     return;
                  }
               }
            }
         }

         if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= 708 + 921778921 * Login.xPadding) {
            if (var1 >= 81622619) {
               return;
            }

            if (-261967643 * MouseHandler.MouseHandler_lastPressedY >= 4) {
               if (var1 >= 81622619) {
                  throw new IllegalStateException();
               }

               if (-1018773713 * MouseHandler.MouseHandler_lastPressedX <= 708 + 921778921 * Login.xPadding + 50) {
                  if (var1 >= 81622619) {
                     throw new IllegalStateException();
                  }

                  if (-261967643 * MouseHandler.MouseHandler_lastPressedY <= 20) {
                     classSX.method10523((byte)-59);
                     return;
                  }
               }
            }
         }

         if (Login.hoveredWorldIndex * 1691792603 != -1) {
            World var7 = World.World_worlds[Login.hoveredWorldIndex * 1691792603];
            boolean var8 = class320.method7360(client.worldProperties * -1330094789, class594.field6422, -1420734120);
            boolean var9 = World.method891(var7, -1307357302);
            class452.field5534 = var9;
            var7.field283 = var9 ? "beta" : var7.field283;
            EnumComposition.changeWorld(var7, -1579678277);
            classSX.method10523((byte)81);
            if (var9 != var8) {
               if (var1 >= 81622619) {
                  return;
               }

               class144.method3969((byte)-64);
            }
         } else {
            if (Login.worldSelectPage * 1401993025 > 0) {
               if (var1 >= 81622619) {
                  throw new IllegalStateException();
               }

               if (null != class70.worldSelectLeftSprite) {
                  if (var1 >= 81622619) {
                     throw new IllegalStateException();
                  }

                  if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= 0
                     && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= class70.worldSelectLeftSprite.subWidth
                     && MouseHandler.MouseHandler_lastPressedY * -261967643 >= class374.canvasHeight * 19292887 / 2 - 50) {
                     if (var1 >= 81622619) {
                        return;
                     }

                     if (-261967643 * MouseHandler.MouseHandler_lastPressedY <= class374.canvasHeight * 19292887 / 2 + 50) {
                        if (var1 >= 81622619) {
                           throw new IllegalStateException();
                        }

                        Login.worldSelectPage -= -1031284543;
                     }
                  }
               }
            }

            if (1401993025 * Login.worldSelectPage < Login.worldSelectPagesCount * 2126332771) {
               if (var1 >= 81622619) {
                  throw new IllegalStateException();
               }

               if (class339.worldSelectRightSprite != null) {
                  if (var1 >= 81622619) {
                     throw new IllegalStateException();
                  }

                  if (-1018773713 * MouseHandler.MouseHandler_lastPressedX >= 120179835 * class489.canvasWidth - class339.worldSelectRightSprite.subWidth - 5) {
                     if (var1 >= 81622619) {
                        throw new IllegalStateException();
                     }

                     if (-1018773713 * MouseHandler.MouseHandler_lastPressedX <= 120179835 * class489.canvasWidth
                        && MouseHandler.MouseHandler_lastPressedY * -261967643 >= 19292887 * class374.canvasHeight / 2 - 50
                        && MouseHandler.MouseHandler_lastPressedY * -261967643 <= class374.canvasHeight * 19292887 / 2 + 50) {
                        if (var1 >= 81622619) {
                           return;
                        }

                        Login.worldSelectPage += -1031284543;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "gq.ah(" + ')');
      }
   }
}
