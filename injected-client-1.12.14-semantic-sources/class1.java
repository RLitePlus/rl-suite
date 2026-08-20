import com.google.common.primitives.Doubles;
import java.util.concurrent.Callable;
import net.runelite.api.Perspective;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("at")
public class class1 implements Callable {
   @ObfuscatedSignature(descriptor = "Lan;")
   @ObfuscatedName("at")
   final classAN field68;
   @ObfuscatedSignature(descriptor = "Lxa;")
   @ObfuscatedName("av")
   final Buffer field69;
   @ObfuscatedSignature(descriptor = "Lpv;")
   @ObfuscatedName("iy")
   static GameBuild field71;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final int field70 = 27;

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("av")
   public Object method250() {
      return this.field68.vmethod37(this.field69);
   }

   @Override
   public Object call() {
      try {
         return this.field68.vmethod37(this.field69);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "at.call(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lof;III)V")
   @ObfuscatedName("ap")
   static final void checkIfMinimapClicked(Widget var0, int var1, int var2, int var3) {
      if (class39.minimapState * 597277019 == 0 || class39.minimapState * 597277019 == 3) {
         if (!SecureUrlRequester.client.isMenuOpen()) {
            int var4 = MouseHandler.MouseHandler_lastButton * 1721626731;
            if (var4 == 0) {
               int var5 = client.mouseWheelRotation * -2138892451;
               if (client.field1040 && var5 != 0) {
                  boolean var6 = MouseHandler.MouseHandler_x * 1856325427 >= var1
                     && MouseHandler.MouseHandler_y * -1427762751 >= var2
                     && MouseHandler.MouseHandler_x * 1856325427 < var1 + var0.getWidth()
                     && MouseHandler.MouseHandler_y * -1427762751 < var2 + var0.getHeight();
                  if (var6) {
                     double var7 = client.field932 + -var5 * 0.25;
                     client.field932 = Doubles.constrainToRange(var7, 2.0, 8.0);
                  }
               }
            } else {
               SpriteMask var19 = var0.method8195(class226.widgetDefinition, true);
               if (var19 == null) {
                  return;
               }

               int var20 = MouseHandler.MouseHandler_lastPressedX * -1018773713 - var1;
               int var22 = MouseHandler.MouseHandler_lastPressedY * -261967643 - var2;
               if (!var19.method8691(var20, var22)) {
                  return;
               }

               if (var4 == 1 || !UrlRequest.mouseCam && var4 == 4) {
                  ClickAction var8 = client.worldViewManager.method2966(-1);
                  if (var8 == ClickAction.field6119) {
                     var20 -= var19.method8688() / 2;
                     var22 -= var19.method8689() / 2;
                     int var9 = client.camAngleY * 1853484313 & 2047;
                     int var10 = Perspective.SINE[var9];
                     int var11 = Perspective.COSINE[var9];
                     int var12 = var11 * var20 + var10 * var22 >> 16;
                     int var13 = var11 * var22 - var10 * var20 >> 16;
                     float var14 = (float)client.field932 / 128.0F;
                     int var15 = (int)(var12 / var14);
                     int var16 = (int)(var13 / var14);
                     int var17 = client.field828 * -361115983 + var15 >> 7;
                     int var18 = client.field674 * -291215063 - var16 >> 7;
                     client.method2559(var17, var18, var20, var22);
                  } else if (var8 == ClickAction.field6120) {
                     int var24 = var1 + var19.method8688() / 2;
                     int var25 = var2 + var19.method8689() / 2;
                     int var26 = MouseHandler.MouseHandler_x * 1856325427 - var24;
                     int var27 = MouseHandler.MouseHandler_y * -1427762751 - var25;
                     int var28 = client.method2456(Math.atan2(var27, var26)) - 512;
                     var28 -= client.camAngleY * 1853484313;
                     int var30 = (var28 + 64 & 2047) / 128;
                     client.field891 = var30 * -1033955559;
                     client.field893 = 30 * 760949447;
                     client.method2563(var30);
                  }
               } else if (var4 == 2) {
                  client.field932 = 4.0;
                  MouseHandler.MouseHandler_lastButton = 0 * 1899183171;
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;)I")
   @ObfuscatedName("uj")
   public static int method252(classSF var0) {
      return var0.field5765 * 2134183747;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/Object;")
   @ObfuscatedName("at")
   public Object method251() {
      return this.field68.vmethod37(this.field69);
   }

   @ObfuscatedSignature(descriptor = "(Ldd;IIIIIB)V")
   @ObfuscatedName("kx")
   static void method254(WorldView var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         NodeDeque var7 = var0.groundItems[var1][var2][var3];
         if (var7 != null) {
            if (var6 == 1) {
               return;
            }

            for (TileItem var8 = (TileItem)var7.last(); var8 != null; var8 = (TileItem)var7.previous()) {
               if (var4 == var8.visibleTime * 782226465) {
                  if (var6 == 1) {
                     throw new IllegalStateException();
                  }

                  TileItem.method3035(var8, var5, (byte)6);
                  break;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "at.kx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("br")
   static int method253(int var0, Script var1, boolean var2, int var3) {
      try {
         if (5504 == var0) {
            if (var3 >= 2062020709) {
               throw new IllegalStateException();
            } else {
               class408.Interpreter_intStackSize -= 708726074;
               int var7 = Interpreter.Interpreter_intStack[327716789 * class408.Interpreter_intStackSize];
               int var5 = Interpreter.Interpreter_intStack[1 + 327716789 * class408.Interpreter_intStackSize];
               if (!client.isCameraLocked) {
                  if (var3 >= 2062020709) {
                     throw new IllegalStateException();
                  }

                  client.camAngleX = var7 * -437578167;
                  client.method1894(-1);
                  client.camAngleY = var5 * -700768471;
               }

               return 1;
            }
         } else if (var0 == 5505) {
            if (var3 >= 2062020709) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1016118265 * client.camAngleX;
               return 1;
            }
         } else if (var0 == 5506) {
            if (var3 >= 2062020709) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1853484313 * client.camAngleY;
               return 1;
            }
         } else if (5530 == var0) {
            if (var3 >= 2062020709) {
               throw new IllegalStateException();
            } else {
               int var4 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               if (var4 < 0) {
                  var4 = 0;
               }

               client.camFollowHeight = var4 * 2048479457;
               return 1;
            }
         } else if (var0 == 5531) {
            if (var3 >= 2062020709) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = client.camFollowHeight * 249033505;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "at.br(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljx;")
   @ObfuscatedName("aw")
   public static Clock method249(int var0) {
      try {
         try {
            return new NanoClock();
         } catch (Throwable var2) {
            return new MilliClock();
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "at.aw(" + ')');
      }
   }

   class1(SpriteBufferProperties var1, Buffer var2, classAN var3) {
      this.this$0 = var1;
      this.field69 = var2;
      this.field68 = var3;
   }
}
