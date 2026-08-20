import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ff")
public class BuddyRankComparator extends AbstractUserComparator {
   @ObfuscatedName("av")
   final boolean reversed;
   @ObfuscatedSignature(descriptor = "Lta;")
   @ObfuscatedName("hq")
   static FriendsChat friendsChat;
   @ToRemove(unused = "true")
   @ObfuscatedName("cw")
   static final int field1771 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("bs")
   static final int field1770 = 44;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgs;IB)I")
   @ObfuscatedName("np")
   public static int method3977(ClanSettings var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method4297(var1);
      }

      if (126 != var2 && var2 != 127) {
         if (1172757763 * var0.currentOwner != var1 || var0.field2058 * 1673809521 != -1 && var0.memberRanks[1673809521 * var0.field2058] >= 125) {
            if (var0.memberRanks[var1] == var2) {
               return -1;
            } else {
               var0.memberRanks[var1] = var2;
               var0.updateOwner(1546762333);
               return var1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.compareBuddy((Buddy)var1, (Buddy)var2, (byte)116);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ff.compare(" + 41);
      }
   }

   public BuddyRankComparator(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIIIB)V")
   @ObfuscatedName("ij")
   static void method3978(int var0, int var1, int var2, int var3, byte var4) {
      try {
         PacketBufferNode var5 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3910, client.packetWriter.isaacCipher, -2005802293);
         var5.packetBuffer.writeByte(18, (short)-12339);
         PacketBuffer var10000 = var5.packetBuffer;
         byte var10001;
         if (IndexCheck.method6514(client.indexCheck, 82, (short)1337)) {
            if (var4 != 2) {
               throw new IllegalStateException();
            }

            if (IndexCheck.method6514(client.indexCheck, 81, (short)1337)) {
               if (var4 != 2) {
                  throw new IllegalStateException();
               }

               var10001 = 2;
            } else {
               var10001 = 1;
            }
         } else {
            var10001 = 0;
         }

         Buffer.method12113(var10000, var10001, (short)-15306);
         var5.packetBuffer.writeShortAdd(Occluder.topLevelWorldView.baseY * 1279964673 + var1, -790566917);
         var5.packetBuffer.writeShortAdd(var0 + 825809917 * Occluder.topLevelWorldView.baseX, 1526467420);
         var5.packetBuffer.writeByte(var2, (short)-31372);
         var5.packetBuffer.writeByte(var3, (short)-19811);
         var5.packetBuffer.writeShort(client.camAngleY * 1853484313, -2121326330);
         var5.packetBuffer.writeByte(57, (short)-5903);
         var5.packetBuffer.writeByte(0, (short)-20779);
         var5.packetBuffer.writeByte(0, (short)-13094);
         var5.packetBuffer.writeByte(89, (short)-11664);
         var5.packetBuffer.writeShort(class330.localPlayer.x * 340712311, -1483900495);
         var5.packetBuffer.writeShort(-1747310679 * class330.localPlayer.y, -1745021066);
         var5.packetBuffer.writeByte(63, (short)-4810);
         PacketWriter.method3330(client.packetWriter, var5, -1771370198);
         client.destinationX = var0 * -1650976811;
         client.destinationY = -1742931333 * var1;
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ff.ij(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("at")
   public int method3972(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, (byte)107);
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;B)I")
   @ObfuscatedName("av")
   int compareBuddy(Buddy var1, Buddy var2, byte var3) {
      try {
         if (var1.rank * 91500301 != var2.rank * 91500301) {
            if (var3 <= 2) {
               throw new IllegalStateException();
            } else {
               int var10000;
               if (this.reversed) {
                  if (var3 <= 2) {
                     throw new IllegalStateException();
                  }

                  var10000 = 91500301 * var1.rank - 91500301 * var2.rank;
               } else {
                  var10000 = 91500301 * var2.rank - 91500301 * var1.rank;
               }

               return var10000;
            }
         } else {
            return this.compareUser(var1, var2, (byte)-33);
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ff.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("an")
   public int method3973(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, (byte)72);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ag")
   public int method3974(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, (byte)109);
   }

   @ObfuscatedSignature(descriptor = "(Ltm;Ltm;)I")
   @ObfuscatedName("aj")
   int method3971(Buddy var1, Buddy var2) {
      if (var1.rank * 91500301 != var2.rank * 91500301) {
         return this.reversed ? 91500301 * var1.rank - -722729653 * var2.rank : 91500301 * var2.rank - 91500301 * var1.rank;
      } else {
         return this.compareUser(var1, var2, (byte)-8);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ae")
   public int method3975(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2, (byte)91);
   }

   @ObfuscatedSignature(descriptor = "(I)Lrf;")
   @ObfuscatedName("av")
   public static class456 method3976(int var0) {
      try {
         synchronized (class456.field5513) {
            if (class456.field5511 * -691516217 == 0) {
               if (var0 != -814754263) {
                  throw new IllegalStateException();
               } else {
                  return new class456();
               }
            } else {
               class456.field5513[(class456.field5511 -= -986794761) * -691516217].method9428(1433454718);
               return class456.field5513[-691516217 * class456.field5511];
            }
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ff.av(" + ')');
      }
   }
}
