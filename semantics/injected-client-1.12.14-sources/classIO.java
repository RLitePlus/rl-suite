import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("io")
class classIO implements ThreadFactory {
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   static final int field2532 = 100;

   classIO(SequenceDefinition var1) {
      this.this$0 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lad;)[Ljava/lang/String;")
   @ObfuscatedName("kv")
   public static String[] method4944(SecureRandomSSLSocket var0) {
      if (var0 == null) {
         var0.method38();
      }

      return null;
   }

   @Override
   public Thread newThread(Runnable var1) {
      try {
         return new Thread(var1, "OSRS Maya Anim Load");
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "io.newThread(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("av")
   public Thread method4946(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
   @ObfuscatedName("at")
   public Thread method4947(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   @ObfuscatedSignature(descriptor = "(IIZI)V")
   @ObfuscatedName("of")
   static final void method4948(int var0, int var1, boolean var2, int var3) {
      try {
         if (null == client.currentClanChannels[var0]) {
            if (var3 <= 1419409073) {
               throw new IllegalStateException();
            }
         } else {
            if (var1 >= 0) {
               if (var3 <= 1419409073) {
                  throw new IllegalStateException();
               }

               if (var1 < client.currentClanChannels[var0].method4425(1830116530)) {
                  ClanChannelMember var4 = (ClanChannelMember)client.currentClanChannels[var0].members.get(var1);
                  PacketBufferNode var5 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3862, client.packetWriter.isaacCipher, -1299813741);
                  var5.packetBuffer
                     .writeByte(4 + AccessFile.stringCp1252NullTerminatedByteSize(Username.method12702(var4.username, (byte)2), 1310557520), (short)-4367);
                  var5.packetBuffer.writeByte(var0, (short)-13926);
                  var5.packetBuffer.writeShort(var1, -1384285187);
                  var5.packetBuffer.writeBoolean(var2, (byte)19);
                  var5.packetBuffer.writeStringCp1252NullTerminated(Username.method12702(var4.username, (byte)10), 998990159);
                  PacketWriter.method3330(client.packetWriter, var5, -1771370198);
                  return;
               }

               if (var3 <= 1419409073) {
                  throw new IllegalStateException();
               }
            }
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "io.of(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lxt;")
   @ObfuscatedName("az")
   static SpritePixels method4945(int var0) {
      try {
         SpritePixels var1 = new SpritePixels();
         var1.width = class208.SpriteBuffer_spriteWidth * -1309012693;
         var1.height = class144.SpriteBuffer_spriteHeight * 722593713;
         var1.xOffset = class615.SpriteBuffer_xOffsets[0];
         var1.yOffset = class615.SpriteBuffer_yOffsets[0];
         var1.subWidth = IntHashTable.SpriteBuffer_spriteWidths[0];
         var1.subHeight = class615.SpriteBuffer_spriteHeights[0];
         int var2 = var1.subWidth * var1.subHeight;
         byte[] var3 = class320.SpriteBuffer_pixels[0];
         var1.pixels = new int[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            var1.pixels[var4] = BufferedSource.SpriteBuffer_spritePalette[var3[var4] & 255];
         }

         class615.SpriteBuffer_xOffsets = null;
         class615.SpriteBuffer_yOffsets = null;
         IntHashTable.SpriteBuffer_spriteWidths = null;
         class615.SpriteBuffer_spriteHeights = null;
         BufferedSource.SpriteBuffer_spritePalette = null;
         class320.SpriteBuffer_pixels = (byte[][])null;
         return var1;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "io.az(" + ')');
      }
   }
}
