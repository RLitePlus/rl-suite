import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uo")
public class classUO implements classXZ {
   @ObfuscatedSignature(descriptor = "Luo;")
   @ObfuscatedName("az")
   static final classUO field6357 = new classUO(3, 1);
   @ObfuscatedSignature(descriptor = "Luo;")
   @ObfuscatedName("af")
   static final classUO field6359 = new classUO(0, 2);
   @ObfuscatedSignature(descriptor = "Luo;")
   @ObfuscatedName("ae")
   static final classUO field6360 = new classUO(2, 3);
   @ObfuscatedSignature(descriptor = "Luo;")
   @ObfuscatedName("ab")
   static final classUO field6358 = new classUO(1, 10);
   @ObfuscatedName("ag")
   final int field6356;
   @ObfuscatedName("as")
   final int field6355;
   @ObfuscatedSignature(descriptor = "[Lym;")
   @ObfuscatedName("ac")
   static SpritePixels[] field6361;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return -364102079 * this.field6355;
   }

   classUO(int var1, int var2) {
      this.field6356 = var1 * -979953685;
      this.field6355 = var2 * -1254960703;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return 1182923174 * this.field6355;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return -364102079 * this.field6355;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "uo.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxk;III)I")
   @ObfuscatedName("yf")
   public static int method11412(classXK var0, int var1, int var2, int var3) {
      return var0.field6885[var1][var2][var3];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return -295184380 * this.field6355;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Luo;")
   @ObfuscatedName("as")
   static classUO[] method11410() {
      return new classUO[]{field6360, field6358, field6359, field6357};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Luo;")
   @ObfuscatedName("ax")
   static classUO[] method11411() {
      return new classUO[]{field6360, field6358, field6359, field6357};
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bh")
   static void method11414(int var0, int var1) {
      try {
         client.field860 = 0L;
         if (var0 >= 2) {
            if (var1 >= -2042311248) {
               return;
            }

            client.field861 = true;
            client.method2299(-1);
         } else {
            client.field861 = false;
            client.method2299(-1);
         }

         if (classLH.method7105(-615017728) == 1) {
            if (var1 >= -2042311248) {
               return;
            }

            classOE.client.method11097(765, 503, (byte)82);
         } else {
            classOE.client.method11097(7680, 2160, (byte)81);
         }

         if (client.field828 * -44590225 >= 25) {
            if (var1 >= -2042311248) {
               throw new IllegalStateException();
            }

            if (client.packetWriter != null) {
               if (var1 >= -2042311248) {
                  return;
               }

               if (null == client.packetWriter.isaacCipher) {
                  if (var1 >= -2042311248) {
                     throw new IllegalStateException();
                  }
               } else {
                  PacketBufferNode var2 = classEF.getPacketBufferNode(ClientPacket.WINDOW_STATUS, client.packetWriter.isaacCipher, (byte)43);
                  Buffer.method12971(var2.packetBuffer, classLH.method7105(1212026946), (byte)-100);
                  var2.packetBuffer.method12973(773246731 * classSA.field5897, -1542382992);
                  var2.packetBuffer.method12973(8379747 * IntProjection.field1938, -1542382992);
                  client.packetWriter.addNode(var2, -1301097035);
               }
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "uo.bh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[II)V")
   @ObfuscatedName("ae")
   public static void method11413(String[] var0, int[] var1, int var2) {
      try {
         classCZ.method2848(var0, var1, 0, var0.length - 1, 361165951);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "uo.ae(" + ')');
      }
   }
}
