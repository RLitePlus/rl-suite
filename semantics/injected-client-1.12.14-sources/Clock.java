import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jx")
public abstract class Clock {
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field3236 = 9;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   public abstract void vmethod201();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   public abstract void vmethod200();

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("at")
   public abstract int wait(int var1, int var2, int var3);

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ak")
   public abstract int vmethod205(int var1, int var2);

   Clock() {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public abstract void vmethod202();

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("uq")
   public int vmethod209(int var1, int var2) {
      return this.wait(var1, var2, 205232251);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)V")
   @ObfuscatedName("ap")
   static final void method6212(String var0, int var1, int var2) {
      try {
         PacketBufferNode var3 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3933, client.packetWriter.isaacCipher, -2047326196);
         var3.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var0, 1440712140) + 1, (short)-3067);
         Buffer.method12113(var3.packetBuffer, var1, (short)-9943);
         var3.packetBuffer.writeStringCp1252NullTerminated(var0, 998990159);
         PacketWriter.method3330(client.packetWriter, var3, -1771370198);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "jx.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aj")
   public abstract int vmethod204(int var1, int var2);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljx;")
   @ObfuscatedName("ap")
   public static Clock method6211() {
      try {
         return new NanoClock();
      } catch (Throwable var1) {
         return new MilliClock();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;ILky;B)V")
   @ObfuscatedName("jn")
   static void method6213(WorldView var0, int var1, Model var2, byte var3) {
      try {
         short var4 = 512;
         float var5 = client.viewportHeight * 620574401 / 334.0F;
         float var6 = 4.0F * (1624872185 * client.viewportZoom) / var5;
         int var7 = Math.max(512, (int)(1400.0F - var6));
         int var8 = client.field828 * -361115983;
         double var9 = class66.method1386(var1, 840102612) / 65536.0;
         int var11 = var8 - (int)(var9 * var7);
         int var12 = -291215063 * client.field674 - (int)(DevicePcmPlayerProvider.method146(var1, 192801641) * var7);
         long var13 = class236.calculateTag(
            var0.plane * 2115028565, Coord.method8304(var11, (byte)-90), Coord.method8304(var12, (byte)-28), 5, false, -1, 577964535 * var0.id, -1329739818
         );
         var0.scene.method5503(2115028565 * var0.plane, var11, var12, client.field867 * -852488123, 60, var2, var1, var13, false);
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "jx.jn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   public abstract void mark(int var1);
}
