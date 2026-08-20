import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cs")
public class ArchiveLoader {
   @ObfuscatedName("an")
   int loadedCount = 0;
   @ObfuscatedSignature(descriptor = "Lqn;")
   @ObfuscatedName("at")
   final Archive archive;
   @ObfuscatedName("ag")
   final int groupCount;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field1192 = 1024;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field1193 = 10000;

   ArchiveLoader(Archive var1, String var2) {
      this.archive = var1;
      this.groupCount = var1.getGroupCount(-603952951) * 126969407;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lclient;I)V")
   @ObfuscatedName("sf")
   public static void method2862(client var0, int var1) {
      if (var0 == null) {
         var0.getWorldType();
      }

      PacketBufferNode var2 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3932, client.packetWriter.isaacCipher, -1211432041);
      var2.packetBuffer.writeByte(var1, (short)-11787);
      PacketWriter.method3330(client.packetWriter, var2, -1771370198);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcs;)Z")
   @ObfuscatedName("yh")
   public static boolean method2855(ArchiveLoader var0) {
      if (var0 == null) {
         return var0.method2857();
      } else {
         var0.loadedCount = 0;

         for (int var1 = 0; var1 < 1140033983 * var0.groupCount; var1++) {
            if (!var0.archive.method9097(var1, 1344023781) || var0.archive.method9093(var1, -1808649127)) {
               var0.loadedCount += 996853545;
            }
         }

         return var0.loadedCount * 1188087065 >= 1140033983 * var0.groupCount;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("jq")
   static final int method2861(byte var0) {
      try {
         if (class468.clientPreferences.isRoofsHidden(519647284)) {
            if (var0 >= 18) {
               throw new IllegalStateException();
            } else {
               return 2115028565 * Occluder.topLevelWorldView.plane;
            }
         } else {
            int var1 = -201184013 * SpriteBufferProperties.cameraX >> 7;
            int var2 = class528.cameraZ * 1084219535 >> 7;
            if (var1 >= 0) {
               if (var0 >= 18) {
                  throw new IllegalStateException();
               }

               if (104 > var1) {
                  if (var0 >= 18) {
                     throw new IllegalStateException();
                  }

                  if (var2 >= 0) {
                     if (var0 >= 18) {
                        throw new IllegalStateException();
                     }

                     if (104 > var2) {
                        int var3 = NPCComposition.getTileHeight(
                           Occluder.topLevelWorldView,
                           SpriteBufferProperties.cameraX * -201184013,
                           1084219535 * class528.cameraZ,
                           2115028565 * Occluder.topLevelWorldView.plane,
                           -253070517
                        );
                        if (var3 - 2001367751 * ScriptFrame.cameraY < 800
                           && (Occluder.topLevelWorldView.tileSettings[2115028565 * Occluder.topLevelWorldView.plane][var1][var2] & 4) != 0) {
                           if (var0 >= 18) {
                              throw new IllegalStateException();
                           }

                           return Occluder.topLevelWorldView.plane * 2115028565;
                        }

                        return 3;
                     }

                     if (var0 >= 18) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }

            return Occluder.topLevelWorldView.plane * 2115028565;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "cs.jq(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcs;)Z")
   @ObfuscatedName("so")
   public static boolean method2856(ArchiveLoader var0) {
      if (var0 == null) {
         var0.method2857();
      }

      var0.loadedCount = 0;

      for (int var1 = 0; var1 < 930519194 * var0.groupCount; var1++) {
         if (!var0.archive.method9097(var1, 1344023781) || var0.archive.method9093(var1, 947281960)) {
            var0.loadedCount += 158456843;
         }
      }

      return var0.loadedCount * 1188087065 >= 1140033983 * var0.groupCount;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("an")
   boolean method2857() {
      this.loadedCount = 0;

      for (int var1 = 0; var1 < 1140033983 * this.groupCount; var1++) {
         if (!this.archive.method9097(var1, 1344023781) || this.archive.method9093(var1, 1975526371)) {
            this.loadedCount += 996853545;
         }
      }

      return this.loadedCount * 1188087065 >= 1140033983 * this.groupCount;
   }

   @ObfuscatedSignature(descriptor = "(Lcs;B)Z")
   @ObfuscatedName("ja")
   public static boolean method2858(ArchiveLoader var0, byte var1) {
      if (var0 == null) {
         return var0.isLoaded(var1);
      } else {
         try {
            var0.loadedCount = 0;

            for (int var2 = 0; var2 < 1140033983 * var0.groupCount; var2++) {
               if (var1 >= 43) {
                  throw new IllegalStateException();
               }

               if (var0.archive.method9097(var2, 1344023781)) {
                  if (var1 >= 43) {
                     throw new IllegalStateException();
                  }

                  if (!var0.archive.method9093(var2, 985857643)) {
                     continue;
                  }

                  if (var1 >= 43) {
                     throw new IllegalStateException();
                  }
               }

               var0.loadedCount += 996853545;
            }

            boolean var10000;
            if (var0.loadedCount * 1188087065 >= 1140033983 * var0.groupCount) {
               if (var1 >= 43) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "cs.av(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lbu;")
   @ObfuscatedName("an")
   static Message Messages_getMessage(int var0, byte var1) {
      try {
         return (Message)Messages.Messages_hashTable.get((long)var0);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "cs.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("av")
   boolean isLoaded(byte var1) {
      try {
         this.loadedCount = 0;

         for (int var2 = 0; var2 < 1140033983 * this.groupCount; var2++) {
            if (var1 >= 43) {
               throw new IllegalStateException();
            }

            if (this.archive.method9093(var2, 1344023781)) {
               if (var1 >= 43) {
                  throw new IllegalStateException();
               }

               if (!this.archive.method9097(var2, 985857643)) {
                  continue;
               }

               if (var1 >= 43) {
                  throw new IllegalStateException();
               }
            }

            this.loadedCount += 996853545;
         }

         boolean var10000;
         if (this.loadedCount * 1188087065 >= 1140033983 * this.groupCount) {
            if (var1 >= 43) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "cs.av(" + ')');
      }
   }
}
