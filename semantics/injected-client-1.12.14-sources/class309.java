import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lk")
public class class309 {
   @ObfuscatedName("ag")
   final int value;
   @ObfuscatedSignature(descriptor = "Llk;")
   @ObfuscatedName("at")
   static final class309 field3703 = new class309(1);
   @ObfuscatedSignature(descriptor = "Llk;")
   @ObfuscatedName("av")
   static final class309 field3702 = new class309(0);
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field3706 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field3704 = 10;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   public static final int field3705 = 17;

   class309(int var1) {
      this.value = var1 * 1031413213;
   }

   @ObfuscatedSignature(descriptor = "(IIIS)I")
   @ObfuscatedName("ae")
   public static int method7191(int var0, int var1, int var2, short var3) {
      try {
         int var4 = SpotAnimationDefinition.method4605(var2 - var1 + 1, -3699724);
         var4 <<= var1;
         return var0 | var4;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "lk.ae(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;Ljava/lang/String;)Z")
   @ObfuscatedName("bc")
   public static boolean method7192(ClientPreferences var0, String var1) {
      if (var0 == null) {
         var0.method1689();
      }

      int var2 = ClientPreferences.method1657(var0, var1, 1693391124);
      return var0.parameters.containsKey(var2);
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("od")
   static final void method7193(int var0, int var1, int var2) {
      try {
         ClanChannel var10000;
         if (var0 >= 0) {
            if (var2 != -844830756) {
               throw new IllegalStateException();
            }

            var10000 = client.currentClanChannels[var0];
         } else {
            var10000 = class57.guestClanChannel;
         }

         ClanChannel var3 = var10000;
         if (null != var3) {
            if (var2 != -844830756) {
               throw new IllegalStateException();
            }

            if (var1 >= 0) {
               if (var2 != -844830756) {
                  throw new IllegalStateException();
               }

               if (var1 < var3.method4425(-711413350)) {
                  ClanChannelMember var4 = (ClanChannelMember)var3.members.get(var1);
                  if (var4.rank != -1) {
                     if (var2 != -844830756) {
                        throw new IllegalStateException();
                     }

                     return;
                  }

                  String var5 = Username.method12702(var4.username, (byte)3);
                  PacketBufferNode var6 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3904, client.packetWriter.isaacCipher, -2024085017);
                  var6.packetBuffer.writeByte(3 + AccessFile.stringCp1252NullTerminatedByteSize(var5, 1523497343), (short)-28424);
                  var6.packetBuffer.writeByte(var0, (short)-23712);
                  var6.packetBuffer.writeShort(var1, -1700092506);
                  var6.packetBuffer.writeStringCp1252NullTerminated(var5, 998990159);
                  PacketWriter.method3330(client.packetWriter, var6, -1771370198);
                  return;
               }

               if (var2 != -844830756) {
                  throw new IllegalStateException();
               }
            }
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "lk.od(" + ')');
      }
   }
}
