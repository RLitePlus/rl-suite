import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hk")
public class VerticalAlignment implements Enum {
   @ObfuscatedName("ae")
   final int id;
   @ObfuscatedSignature(descriptor = "Lhk;")
   @ObfuscatedName("at")
   static final VerticalAlignment VerticalAlignment_centered = new VerticalAlignment(0, 1);
   @ObfuscatedSignature(descriptor = "Lhk;")
   @ObfuscatedName("av")
   static final VerticalAlignment field2244 = new VerticalAlignment(2, 0);
   @ObfuscatedName("an")
   public final int value;
   @ObfuscatedSignature(descriptor = "Lhk;")
   @ObfuscatedName("ag")
   static final VerticalAlignment field2246 = new VerticalAlignment(1, 2);
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field2249 = 32;

   @ObfuscatedSignature(descriptor = "(IIB)I")
   @ObfuscatedName("av")
   static int method4594(int var0, int var1, byte var2) {
      try {
         FloorOverlayDefinition var3 = class189.method4809(var0, 1895523500);
         if (var3 == null) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else if (705541053 * var3.secondaryRgb >= 0) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            } else {
               int var8 = MoveSpeed.method7343(
                  var3.secondaryHue * -347808971, var3.secondarySaturation * -796039805, 2020271701 * var3.secondaryLightness, -1707581112
               );
               int var9 = classJO.method6145(var8, 96, (byte)112);
               return Rasterizer3D.Rasterizer3D_colorPalette[var9] | 0xFF000000;
            }
         } else if (892155017 * var3.texture >= 0) {
            int var7 = classJO.method6145(
               Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var3.texture * 892155017, 1063818451), 96, (byte)79
            );
            return Rasterizer3D.Rasterizer3D_colorPalette[var7] | 0xFF000000;
         } else if (50022547 * var3.primaryRgb == 16711935) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else {
            int var4 = MoveSpeed.method7343(var3.hue * -1914711119, -1834712605 * var3.saturation, 1894985397 * var3.lightness, -1707581112);
            int var5 = classJO.method6145(var4, 96, (byte)103);
            return Rasterizer3D.Rasterizer3D_colorPalette[var5] | 0xFF000000;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "hk.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   @Override
   public int vmethod28() {
      return this.id * -704843113;
   }

   VerticalAlignment(int var1, int var2) {
      this.value = 1531057981 * var1;
      this.id = var2 * 1234283815;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod29() {
      return this.id * -704843113;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   public static void method4595(int var0) {
      try {
         FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "hk.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod30() {
      return this.id * 1890253388;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIII)I")
   @ObfuscatedName("mb")
   static final int method4597(String var0, String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         return ClanChannel.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false, -1, 65535);
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "hk.mb(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   @Override
   public int rsOrdinal(byte var1) {
      try {
         return this.id * -704843113;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "hk.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("by")
   static int method4596(int var0, Script var1, boolean var2, int var3) {
      try {
         if (4000 == var0) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var37 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var59 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var59 + var37;
               return 1;
            }
         } else if (4001 == var0) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var36 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var58 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var36 - var58;
               return 1;
            }
         } else if (var0 == 4002) {
            class408.Interpreter_intStackSize -= 708726074;
            int var35 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            int var57 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var57 * var35;
            return 1;
         } else if (var0 == 4003) {
            class408.Interpreter_intStackSize -= 708726074;
            int var34 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            int var56 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var34 / var56;
            return 1;
         } else if (var0 == 4004) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               int var33 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)(Math.random() * var33);
               return 1;
            }
         } else if (4005 == var0) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               int var32 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)(Math.random() * (1 + var32));
               return 1;
            }
         } else if (var0 == 4006) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -375668463;
               int var31 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var55 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
               int var65 = Interpreter.Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
               int var67 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 3];
               int var69 = Interpreter.Interpreter_intStack[4 + class408.Interpreter_intStackSize * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (var55 - var31)
                     * (var69 - var65)
                     / (var67 - var65)
                  + var31;
               return 1;
            }
         } else if (var0 == 4007) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var30 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var54 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var54 * var30 / 100 + var30;
               return 1;
            }
         } else if (4008 == var0) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var29 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var53 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var29 | 1 << var53;
               return 1;
            }
         } else if (4009 == var0) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var28 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var52 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var28 & -1 - (1 << var52);
               return 1;
            }
         } else if (4010 == var0) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var27 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var51 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
               int[] var70 = Interpreter.Interpreter_intStack;
               int var71 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var72;
               if ((var27 & 1 << var51) != 0) {
                  if (var3 <= -944629476) {
                     throw new IllegalStateException();
                  }

                  var72 = 1;
               } else {
                  var72 = 0;
               }

               var70[var71] = var72;
               return 1;
            }
         } else if (var0 == 4011) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var26 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var50 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var26 % var50;
               return 1;
            }
         } else if (var0 == 4012) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var25 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var49 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
               if (var25 == 0) {
                  if (var3 <= -944629476) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)Math.pow(var25, var49);
               }

               return 1;
            }
         } else if (4013 == var0) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var24 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var48 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
               if (var24 == 0) {
                  if (var3 <= -944629476) {
                     throw new IllegalStateException();
                  } else {
                     Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
                     return 1;
                  }
               } else {
                  switch (var48) {
                     case 0:
                        Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = Integer.MAX_VALUE;
                        break;
                     case 1:
                        Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var24;
                        break;
                     case 2:
                        Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)Math.sqrt(var24);
                        break;
                     case 3:
                        Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)Math.cbrt(var24);
                        break;
                     case 4:
                        Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)Math.sqrt(Math.sqrt(var24));
                        break;
                     default:
                        Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)Math.pow(var24, 1.0 / var48);
                  }

                  return 1;
               }
            }
         } else if (4014 == var0) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var23 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var47 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var23 & var47;
               return 1;
            }
         } else if (4015 == var0) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var22 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var46 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var22 | var46;
               return 1;
            }
         } else if (4016 == var0) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var21 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var45 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var21 < var45 ? var21 : var45;
               return 1;
            }
         } else if (4017 == var0) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var20 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var44 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
               int[] var10000 = Interpreter.Interpreter_intStack;
               int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               int var10002;
               if (var20 > var44) {
                  if (var3 <= -944629476) {
                     throw new IllegalStateException();
                  }

                  var10002 = var20;
               } else {
                  var10002 = var44;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else if (var0 == 4018) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1084394537;
               long var19 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               long var64 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
               long var68 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (int)(var19 * var68 / var64);
               return 1;
            }
         } else if (var0 == 4025) {
            int var18 = ServerPacket.method7545(Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789], (byte)-46);
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var18;
            return 1;
         } else if (4026 == var0) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var17 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var43 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var17 ^ 1 << var43;
               return 1;
            }
         } else if (4027 == var0) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1084394537;
               int var16 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var42 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
               int var63 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 2];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class309.method7191(
                  var16, var42, var63, (short)-11561
               );
               return 1;
            }
         } else if (4028 == var0) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= -1084394537;
               int var15 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               int var41 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 1];
               int var62 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = FloatProjection.method6012(
                  var15, var41, var62, 2131319982
               );
               return 1;
            }
         } else if (var0 == 4029) {
            class408.Interpreter_intStackSize -= -1084394537;
            int var14 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            int var40 = Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789];
            int var61 = Interpreter.Interpreter_intStack[2 + 327716789 * class408.Interpreter_intStackSize];
            int var66 = 31 - var61;
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var14 << var66 >>> var40 + var66;
            return 1;
         } else if (4030 == var0) {
            class408.Interpreter_intStackSize -= 1417452148;
            int var12 = Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            int var39 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
            int var60 = Interpreter.Interpreter_intStack[2 + class408.Interpreter_intStackSize * 327716789];
            int var7 = Interpreter.Interpreter_intStack[3 + 327716789 * class408.Interpreter_intStackSize];
            var12 = FloatProjection.method6012(var12, var60, var7, 1693940697);
            int var8 = SpotAnimationDefinition.method4605(1 + (var7 - var60), -528275311);
            if (var39 > var8) {
               var39 = var8;
            }

            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var12 | var39 << var60;
            return 1;
         } else if (var0 == 4032) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1] = class137.method4002(
                  Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1], -1846807064
               );
               return 1;
            }
         } else if (var0 == 4033) {
            Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1] = class33.method657(
               Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1], 2115780482
            );
            return 1;
         } else if (4034 == var0) {
            class408.Interpreter_intStackSize -= 708726074;
            int var11 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
            int var38 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
            int var6 = class394.method8799(var11, var38, -368351008);
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var6;
            return 1;
         } else if (4035 == var0) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1] = Math.abs(
                  Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize - 1]
               );
               return 1;
            }
         } else if (4036 == var0) {
            if (var3 <= -944629476) {
               throw new IllegalStateException();
            } else {
               String var4 = (String)Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize -= 831964661) * -1595015587];
               int var5 = -1;
               if (ViewportMouse.isNumber(var4, 137744967)) {
                  if (var3 <= -944629476) {
                     throw new IllegalStateException();
                  }

                  var5 = Message.method1204(var4, (byte)-59);
               }

               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var5;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "hk.by(" + 41);
      }
   }
}
