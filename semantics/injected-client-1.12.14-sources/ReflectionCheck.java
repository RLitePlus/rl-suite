import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("et")
public class ReflectionCheck extends Node {
   @ObfuscatedName("av")
   int id;
   @ObfuscatedName("ag")
   int[] operations;
   @ObfuscatedName("ak")
   Method[] methods;
   @ObfuscatedName("an")
   int[] creationErrors;
   @ObfuscatedName("ae")
   Field[] fields;
   @ObfuscatedName("aj")
   int[] intReplaceValues;
   @ObfuscatedName("at")
   int size;
   @ObfuscatedName("aw")
   byte[][][] arguments;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field1698 = 34;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   public static final int field1699 = 2;

   @ObfuscatedSignature(descriptor = "(Lml;Lxo;I)Lmj;")
   @ObfuscatedName("at")
   public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1, int var2) {
      try {
         PacketBufferNode var3 = class191.method4625((byte)0);
         var3.clientPacket = var0;
         var3.index = var0.length * 422186151;
         if (-1 == 2022752529 * var3.index) {
            if (var2 >= -1191270757) {
               throw new IllegalStateException();
            }

            var3.packetBuffer = new PacketBuffer(260);
         } else if (var3.index * 2022752529 == -2) {
            if (var2 >= -1191270757) {
               throw new IllegalStateException();
            }

            var3.packetBuffer = new PacketBuffer(10000);
         } else if (var3.index * 2022752529 <= 18) {
            if (var2 >= -1191270757) {
               throw new IllegalStateException();
            }

            var3.packetBuffer = new PacketBuffer(20);
         } else if (var3.index * 2022752529 <= 98) {
            if (var2 >= -1191270757) {
               throw new IllegalStateException();
            }

            var3.packetBuffer = new PacketBuffer(100);
         } else {
            var3.packetBuffer = new PacketBuffer(260);
         }

         var3.packetBuffer.setIsaacCipher(var1, 2029445353);
         var3.packetBuffer.writeByteIsaac(var3.clientPacket.id * 922007241, (short)326);
         var3.clientPacketLength = 0;
         return var3;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "et.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("ai")
   static void method3891(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         SecureUrlRequester.field1707 = (var3 + var0) / 2 * -1457320511;
         FloorUnderlayDefinition.field2186 = -952646133 * ((var4 + var1) / 2);
         class339.field4374 = 2033293141 * ((var2 + var5) / 2);
         class142.field1811 = (var3 - var0) / 2 * 899326985;
         VarpDefinition.field2411 = (var4 - var1) / 2 * 255531725;
         Varcs.field1384 = 1801588447 * ((var5 - var2) / 2);
         class108.field1676 = Math.abs(510143033 * class142.field1811) * 1536532539;
         TileItem.field1292 = Math.abs(VarpDefinition.field2411 * -840015355) * -1960747559;
         classFY.field1931 = Math.abs(-1797444321 * Varcs.field1384) * -177308609;
         ViewportMouse.field3473.method9868(var3 - var0, var4 - var1, var5 - var2, 941828254);
         ViewportMouse.field3473.method9920((short)3141);
         ViewportMouse.ViewportMouse_false0 = true;
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "et.ai(" + ')');
      }
   }

   ReflectionCheck() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lar;)Ljava/lang/String;")
   @ObfuscatedName("ep")
   public static String method3889(AsyncHttpResponse var0) {
      return var0.errorMessage;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("pg")
   static void method3892(byte var0) {
      try {
         if (null != client.field1026) {
            if (var0 <= 8) {
               throw new IllegalStateException();
            }

            client.field710 = 689645471 * client.cycle;
            client.field1026.method9215(954655421);

            for (Player var2 : Occluder.topLevelWorldView.npcs) {
               client.field1026
                  .method9212(
                     (340712311 * var2.x >> 7) + Occluder.topLevelWorldView.baseX * 825809917,
                     1279964673 * Occluder.topLevelWorldView.baseY + (-1747310679 * var2.y >> 7),
                     -183280906
                  );
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "et.pg(" + ')');
      }
   }
}
