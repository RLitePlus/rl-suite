import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ns")
public class classNS {
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   static final int field4334 = 34;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field4333 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field4332 = 1;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("vh")
   public static void method7840(Buffer var0, int var1) {
      var0.array[(var0.offset += 63052299) * 1373269301 - 1] = (byte)(16543594 - var1);
   }

   @ObfuscatedSignature(descriptor = "(Lmj;I)V")
   @ObfuscatedName("hu")
   static void method7841(PacketBufferNode var0, int var1) {
      try {
         Buffer.method12187(var0.packetBuffer, 1599863785 * class226.field2779.hash, 1815693708);
         Buffer.method12187(var0.packetBuffer, 1599863785 * HttpRequestTask.archive10.hash, 729725122);
         var0.packetBuffer.writeInt(ActorSpotAnim.archive13.hash * 1599863785, 1350212280);
         var0.packetBuffer.writeIntIME(1599863785 * AbstractWorldMapIcon.field3997.hash, 783375377);
         var0.packetBuffer.writeIntIME(class160.field1988.hash * 1599863785, 783375377);
         var0.packetBuffer.writeIntIME(AsyncHttpResponse.field63.hash * 1599863785, 783375377);
         Buffer.method12187(var0.packetBuffer, Varps.field4729.hash * 1599863785, 781778567);
         Buffer.method12187(var0.packetBuffer, class147.archive8.hash * 1599863785, -2065741757);
         var0.packetBuffer.writeIntIME(WorldMapRectangle.archive12.hash * 1599863785, 783375377);
         var0.packetBuffer.writeIntIME(class138.field1779.hash * 1599863785, 783375377);
         Buffer.method12187(var0.packetBuffer, 0, -2065033237);
         Buffer.method12187(var0.packetBuffer, class175.field1995.hash * 1599863785, -1699149692);
         Buffer.method12191(var0.packetBuffer, 1599863785 * Tile.archive9.hash, 139767133);
         var0.packetBuffer.writeInt(UserComparator4.archive6.hash * 1599863785, 1526288005);
         var0.packetBuffer.writeIntIME(class136.field1858.hash * 1599863785, 783375377);
         Buffer.method12191(var0.packetBuffer, VarcInt.field2195.hash * 1599863785, -485000542);
         var0.packetBuffer.writeIntIME(1599863785 * ParamComposition.field2543.hash, 783375377);
         Buffer.method12187(var0.packetBuffer, 1599863785 * PcmPlayer.field1445.hash, 713921911);
         Buffer.method12187(var0.packetBuffer, 1599863785 * StructComposition.archive2.hash, 597709544);
         Buffer.method12191(var0.packetBuffer, classSI.field5792.hash * 1599863785, 2136581624);
         Buffer.method12187(var0.packetBuffer, 1599863785 * class189.archive4.hash, 660079112);
         Buffer.method12191(var0.packetBuffer, 1599863785 * GrandExchangeOfferOwnWorldComparator.field422.hash, -1095878639);
         var0.packetBuffer.writeIntIME(Skeleton.field2818.hash * 1599863785, 783375377);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ns.hu(" + ')');
      }
   }

   classNS() throws Throwable {
      throw new Error();
   }
}
