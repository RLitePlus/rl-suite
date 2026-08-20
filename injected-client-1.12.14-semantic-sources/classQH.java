import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qh")
public class classQH {
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field5334 = -2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field5332 = 25;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field5333 = 10;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final float field5331 = 30.0F;

   classQH() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("jj")
   static void method8913(byte var0) {
      try {
         if (client.packetWriter != null) {
            if (var0 != 0) {
               throw new IllegalStateException();
            }

            if (client.packetWriter.isaacCipher != null) {
               PacketBufferNode var1 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3952, client.packetWriter.isaacCipher, -1590704464);
               var1.packetBuffer.writeByte(class182.getWindowedMode(1749939918), (short)-3389);
               var1.packetBuffer.writeShort(class489.canvasWidth * 120179835, -1466854792);
               var1.packetBuffer.writeShort(19292887 * class374.canvasHeight, -1338589201);
               PacketWriter.method3330(client.packetWriter, var1, -1771370198);
               return;
            }

            if (var0 != 0) {
               throw new IllegalStateException();
            }
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "qh.jj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Lqr;I)Lqr;")
   @ObfuscatedName("at")
   public static Enum method8912(Enum[] var0, int var1) {
      Enum[] var2 = var0;

      for (int var3 = 0; var3 < var2.length; var3++) {
         Enum var4 = var2[var3];
         if (var1 == var4.rsOrdinal((byte)21)) {
            return var4;
         }
      }

      return null;
   }

   static {
      new HashMap();
   }
}
