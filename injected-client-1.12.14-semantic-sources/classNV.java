import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nv")
public class classNV {
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field4349 = 10;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field4347 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field4348 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   public static final int field4346 = 65536;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ji")
   static final void method7854(int var0) {
      try {
         for (Projectile var1 = (Projectile)client.projectiles.last(); var1 != null; var1 = (Projectile)client.projectiles.previous()) {
            if (var0 != 1868866219) {
               throw new IllegalStateException();
            }

            if (1759706017 * client.cycle > var1.sourceIndex * 105886935) {
               var1.remove();
            } else if (1759706017 * client.cycle >= 1357932181 * var1.sourceLevel) {
               if (var0 != 1868866219) {
                  return;
               }

               var1.setDestination(client.worldViewManager, 1759706017 * client.cycle, -1533995753 * client.graphicsCycle, 1337199369);
               Occluder.topLevelWorldView
                  .scene
                  .method5503(var1.startHeight * 796966857, (int)var1.x, (int)var1.y, (int)var1.z, 60, var1, var1.cycleEnd * -157277177, -1L, false);
            }
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "nv.ji(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("bq")
   static int method7855(int var0, Script var1, boolean var2, int var3) {
      try {
         if (var0 == 6200) {
            class408.Interpreter_intStackSize -= 708726074;
            client.field695 = (short)SequenceDefinition.method5265(Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789], -679991811);
            if (client.field695 <= 0) {
               if (var3 != -222241638) {
                  throw new IllegalStateException();
               }

               client.field695 = 256;
            }

            client.field696 = (short)SequenceDefinition.method5265(
               Interpreter.Interpreter_intStack[1 + class408.Interpreter_intStackSize * 327716789], 853235102
            );
            if (client.field696 <= 0) {
               if (var3 != -222241638) {
                  throw new IllegalStateException();
               }

               client.field696 = 256;
            }

            return 1;
         } else if (var0 == 6201) {
            if (var3 != -222241638) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               client.zoomHeight = (short)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
               if (client.zoomHeight <= 0) {
                  if (var3 != -222241638) {
                     throw new IllegalStateException();
                  }

                  client.zoomHeight = 256;
               }

               client.zoomWidth = (short)Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
               if (client.zoomWidth <= 0) {
                  if (var3 != -222241638) {
                     throw new IllegalStateException();
                  }

                  client.zoomWidth = 320;
               }

               return 1;
            }
         } else if (6202 == var0) {
            class408.Interpreter_intStackSize -= 1417452148;
            client.field699 = (short)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789];
            if (client.field699 <= 0) {
               if (var3 != -222241638) {
                  throw new IllegalStateException();
               }

               client.field699 = 1;
            }

            client.field638 = (short)Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize + 1];
            if (client.field638 <= 0) {
               if (var3 != -222241638) {
                  throw new IllegalStateException();
               }

               client.field638 = 32767;
            } else if (client.field638 < client.field699) {
               if (var3 != -222241638) {
                  throw new IllegalStateException();
               }

               client.field638 = client.field699;
            }

            client.field700 = (short)Interpreter.Interpreter_intStack[class408.Interpreter_intStackSize * 327716789 + 2];
            if (client.field700 <= 0) {
               client.field700 = 1;
            }

            client.field701 = (short)Interpreter.Interpreter_intStack[3 + class408.Interpreter_intStackSize * 327716789];
            if (client.field701 <= 0) {
               if (var3 != -222241638) {
                  throw new IllegalStateException();
               }

               client.field701 = 32767;
            } else if (client.field701 < client.field700) {
               client.field701 = client.field700;
            }

            return 1;
         } else if (6203 == var0) {
            if (var3 != -222241638) {
               throw new IllegalStateException();
            } else {
               if (null != client.viewportWidget) {
                  if (var3 != -222241638) {
                     throw new IllegalStateException();
                  }

                  SoundCache.setViewportShape(0, 0, -1946208531 * client.viewportWidget.width, client.viewportWidget.height * -905446999, false, -1372301254);
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.viewportWidth * 164941911;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.viewportHeight * 620574401;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -1;
               }

               return 1;
            }
         } else if (var0 == 6204) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.zoomHeight;
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.zoomWidth;
            return 1;
         } else if (6205 == var0) {
            if (var3 != -222241638) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class160.method4229(
                  client.field695, 579418713
               );
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = class160.method4229(
                  client.field696, -1817031384
               );
               return 1;
            }
         } else if (6220 == var0) {
            if (var3 != -222241638) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (6221 == var0) {
            if (var3 != -222241638) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               return 1;
            }
         } else if (var0 == 6222) {
            if (var3 != -222241638) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 120179835 * class489.canvasWidth;
               return 1;
            }
         } else if (var0 == 6223) {
            Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 19292887 * class374.canvasHeight;
            return 1;
         } else {
            return 2;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "nv.bq(" + 41);
      }
   }

   classNV() throws Throwable {
      throw new Error();
   }
}
