import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("io")
public class classIO extends classHB {
   @ObfuscatedName("ab")
   int field3006;
   @ObfuscatedName("af")
   int field3008;
   @ObfuscatedName("ae")
   int field3007;
   @ObfuscatedName("az")
   int field3010;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field3009 = 22;

   classIO(classIF var1) {
      this.this$0 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod500(Buffer var1) {
      this.field3010 = var1.method13056((byte)1) * 642195729;
      this.field3006 = var1.method13056((byte)1) * -902955675;
      this.field3008 = Buffer.method13039(var1, -346779531) * 870058123;
      this.field3007 = Buffer.method13039(var1, -346779531) * -991622745;
   }

   @ObfuscatedSignature(descriptor = "(Liq;B)V")
   @ObfuscatedName("af")
   @Override
   void vmethod499(ClanSettings var1, byte var2) {
      try {
         var1.method6285(this.field3010 * -327421967, this.field3006 * 627764333, this.field3008 * -1511645405, -1835856361 * this.field3007, (short)16256);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "io.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Lwm;")
   @ObfuscatedName("ag")
   static WorldMap method6230(byte var0) {
      try {
         return client.field1125;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "io.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod501(Buffer var1) {
      this.field3010 = var1.method13056((byte)1) * 642195729;
      this.field3006 = var1.method13056((byte)1) * 1720158720;
      this.field3008 = Buffer.method13039(var1, -346779531) * 870058123;
      this.field3007 = Buffer.method13039(var1, -346779531) * -1083626788;
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod502(ClanSettings var1) {
      var1.method6285(this.field3010 * -327421967, this.field3006 * 627764333, this.field3008 * -1511645405, -1835856361 * this.field3007, (short)16256);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod503(ClanSettings var1) {
      var1.method6285(this.field3010 * 544225221, this.field3006 * 627764333, this.field3008 * -1511645405, 974560067 * this.field3007, (short)16256);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod504(ClanSettings var1) {
      var1.method6285(this.field3010 * -327421967, this.field3006 * 627764333, this.field3008 * -1511645405, -1835856361 * this.field3007, (short)16256);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod498(Buffer var1, int var2) {
      try {
         this.field3010 = var1.method13056((byte)1) * 642195729;
         this.field3006 = var1.method13056((byte)1) * -902955675;
         this.field3008 = Buffer.method13039(var1, -346779531) * 870058123;
         this.field3007 = Buffer.method13039(var1, -346779531) * -991622745;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "io.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("gm")
   static final void method6231(byte var0) {
      try {
         PacketBufferNode var1 = classEF.getPacketBufferNode(ClientPacket.FRIENDCHAT_JOIN_LEAVE, client.packetWriter.isaacCipher, (byte)46);
         Buffer.method12971(var1.packetBuffer, 0, (byte)-115);
         client.packetWriter.addNode(var1, -1301097035);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "io.gm(" + ')');
      }
   }
}
