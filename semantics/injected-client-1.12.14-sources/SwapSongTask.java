import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sh")
public class SwapSongTask extends SongTask {
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("av")
   static final void method10270(String var0, byte var1) {
      try {
         class356.addGameMessage(30, "", var0, -927447914);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sh.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("av")
   @Override
   public boolean vmethod325(byte var1) {
      try {
         if (class345.midiRequests.size() > 1) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            if (class345.midiRequests.get(0) != null) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               if (((MidiRequest)class345.midiRequests.get(0)).midiPcmStream.isReady(-1986069003)) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (class345.midiRequests.get(1) != null) {
                     if (var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (((MidiRequest)class345.midiRequests.get(1)).midiPcmStream.isReady(-1143582852)) {
                        if (var1 <= 1) {
                           throw new IllegalStateException();
                        }

                        MidiRequest var2 = (MidiRequest)class345.midiRequests.get(0);
                        class345.midiRequests.set(0, class345.midiRequests.get(1));
                        class345.midiRequests.set(1, var2);
                     }
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sh.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("an")
   @Override
   public boolean vmethod326() {
      if (class345.midiRequests.size() > 1
         && class345.midiRequests.get(0) != null
         && ((MidiRequest)class345.midiRequests.get(0)).midiPcmStream.isReady(-1010481227)
         && class345.midiRequests.get(1) != null
         && ((MidiRequest)class345.midiRequests.get(1)).midiPcmStream.isReady(1426667502)) {
         MidiRequest var1 = (MidiRequest)class345.midiRequests.get(0);
         class345.midiRequests.set(0, class345.midiRequests.get(1));
         class345.midiRequests.set(1, var1);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod327() {
      if (class345.midiRequests.size() > 1
         && class345.midiRequests.get(0) != null
         && ((MidiRequest)class345.midiRequests.get(0)).midiPcmStream.isReady(-858355345)
         && class345.midiRequests.get(1) != null
         && ((MidiRequest)class345.midiRequests.get(1)).midiPcmStream.isReady(-38307933)) {
         MidiRequest var1 = (MidiRequest)class345.midiRequests.get(0);
         class345.midiRequests.set(0, class345.midiRequests.get(1));
         class345.midiRequests.set(1, var1);
      }

      return true;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ph")
   static void method10273(byte var0) {
      try {
         if (client.field665) {
            if (var0 != 7) {
               return;
            }

            if (null != class330.localPlayer) {
               if (var0 != 7) {
                  throw new IllegalStateException();
               }

               int var1 = class330.localPlayer.pathX[0];
               int var2 = class330.localPlayer.pathY[0];
               if (var1 < 0) {
                  return;
               }

               if (var0 != 7) {
                  throw new IllegalStateException();
               }

               if (104 <= var1) {
                  return;
               }

               if (var0 != 7) {
                  throw new IllegalStateException();
               }

               if (var2 < 0 || 104 <= var2) {
                  return;
               }

               class40.oculusOrbFocalPointX = 1020315521 * class330.localPlayer.x;
               client.method2450(-1);
               int var3 = NPCComposition.getTileHeight(
                     Occluder.topLevelWorldView,
                     class330.localPlayer.x * 340712311,
                     class330.localPlayer.y * -1747310679,
                     2115028565 * Occluder.topLevelWorldView.plane,
                     -253070517
                  )
                  - client.camFollowHeight * 249033505;
               if (var3 < class289.oculusOrbFocalPointZ * -971818949) {
                  if (var0 != 7) {
                     throw new IllegalStateException();
                  }

                  class289.oculusOrbFocalPointZ = var3 * -1530208013;
                  client.method2453(-1);
               }

               class4.oculusOrbFocalPointY = -130647351 * class330.localPlayer.y;
               client.method2530(-1);
               client.field665 = false;
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "sh.ph(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lwh;Ljava/lang/Object;B)V")
   @ObfuscatedName("cz")
   static void method10272(class586 var0, Object var1, byte var2) {
      try {
         if (null == var0) {
            if (var2 == 1) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
            }
         } else {
            switch (676106613 * var0.field6375) {
               case 0:
                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var1;
                  break;
               case 3:
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = (Integer)var1;
                  break;
               default:
                  throw new IllegalStateException("pushValueOfType() failure - unsupported type");
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sh.cz(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcr;II)V")
   @ObfuscatedName("hh")
   public static void method10271(Actor var0, int var1, int var2) {
      if (var0 == null) {
         var0.getGraphic();
      }

      var0.pathLength = 0;
      var0.field1164 = 0;
      var0.field1145 = 0;
      var0.pathX[0] = var1;
      var0.pathY[0] = var2;
      var0.x = 792581824 * var0.size + -432594048 * var0.pathX[0];
      var0.y = var0.size * 207061312 + 1438010496 * var0.pathY[0];
   }

   public SwapSongTask(SongTask var1) {
      super(var1);
      this.field5881 = "SwapSongTask";
   }
}
