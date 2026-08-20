import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lk")
public class classLK {
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field4181 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field4180 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("bi")
   public static final int field4183 = 43;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field4182 = 240;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lclient;)V")
   @ObfuscatedName("te")
   public static void method7118(client var0) {
      if (var0 == null) {
         var0.getCanvasHeight();
      }

      if (MouseHandler.field6261 * 1229235359 == 1
         || !classON.field4995 && 4 == 1959663729 * MouseHandler.field6261
         || 2 == MouseHandler.field6261 * 1229235359) {
         long var1 = MouseHandler.field6258 * 5802030557961029083L - client.mouseLastPressedTimeMillis * -1592775510923690537L;
         if (var1 > 32767L) {
            var1 = 32767L;
         }

         client.mouseLastPressedTimeMillis = MouseHandler.field6258 * 3775164370123526045L;
         int var3 = 1243590197 * MouseHandler.field6257;
         if (var3 < 0) {
            var3 = 0;
         } else if (var3 > IntProjection.field1938 * -623430708) {
            var3 = 1195329415 * IntProjection.field1938;
         }

         int var4 = 1422993977 * MouseHandler.field6266;
         if (var4 < 0) {
            var4 = 0;
         } else if (var4 > classSA.field5897 * 170012027) {
            var4 = classSA.field5897 * 263831000;
         }

         int var5 = (int)var1;
         PacketBufferNode var6 = classEF.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK_V2, client.packetWriter.isaacCipher, (byte)98);
         Buffer.method12971(var6.packetBuffer, 0, (byte)-82);
         var6.packetBuffer.method13188(var3, (short)-10933);
         var6.packetBuffer.method12973((var5 << 1) + (1229235359 * MouseHandler.field6261 == 2 ? 1 : 0), -1542382992);
         var6.packetBuffer.method13188(var4, (short)-1261);
         client.packetWriter.addNode(var6, -1301097035);
      }
   }

   @ObfuscatedSignature(descriptor = "([IIII)V")
   @ObfuscatedName("bx")
   static void method7117(int[] var0, int var1, int var2, int var3) {
      try {
         while (var1 < var2) {
            int var4 = var0[var1];
            var0[var1] = var0[var2];
            var0[var2] = var4;
            var1++;
            var2--;
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "lk.bx(" + ')');
      }
   }

   classLK() throws Throwable {
      throw new Error();
   }
}
