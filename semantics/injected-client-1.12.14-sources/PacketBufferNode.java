import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mj")
public class PacketBufferNode extends Node {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final int field3854 = 260;
   @ObfuscatedSignature(descriptor = "Lml;")
   @ObfuscatedName("aj")
   public ClientPacket clientPacket;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field3850 = 20;
   @ObfuscatedSignature(descriptor = "[Lmj;")
   @ObfuscatedName("an")
   static PacketBufferNode[] PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
   @ObfuscatedName("ae")
   static int PacketBufferNode_packetBufferNodeCount = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field3853 = 10000;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   public static final int field3855 = 76;
   @ObfuscatedSignature(descriptor = "Lxj;")
   @ObfuscatedName("aw")
   public PacketBuffer packetBuffer;
   @ObfuscatedName("ak")
   public int clientPacketLength;
   @ObfuscatedName("ap")
   public int index;
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   public static final int field3856 = 48;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   public void method7435() {
      if (-2135827649 * PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
         PacketBufferNode_packetBufferNodes[(PacketBufferNode_packetBufferNodeCount += -986475329) * -2135827649 - 1] = this;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   public void method7436() {
      if (-1724240618 * PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
         PacketBufferNode_packetBufferNodes[(PacketBufferNode_packetBufferNodeCount += -986475329) * -2135827649 - 1] = this;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lky;Ljt;ILjt;I[I)V")
   @ObfuscatedName("bb")
   public static void method7439(Model var0, Frames var1, int var2, Frames var3, int var4, int[] var5) {
      if (var0 == null) {
         var0.method6759(var1, var2, var1, var2, var5);
      }

      if (var2 != -1) {
         if (var5 != null && var4 != -1) {
            Animation var6 = var1.frames[var2];
            Animation var7 = var3.frames[var4];
            Skeleton var8 = var6.skeleton;
            Model.Model_transformTempX = 0;
            Model.Model_transformTempY = 0;
            Model.Model_transformTempZ = 0;
            int var9 = 0;
            int var10 = var5[var9++];

            for (int var11 = 0; var11 < var6.transformCount; var11++) {
               int var12 = var6.transformYs[var11];

               while (var12 > var10) {
                  var10 = var5[var9++];
               }

               if (var12 != var10 || var8.transformTypes[var12] == 0) {
                  var0.transform(
                     var8.transformTypes[var12], var8.labels[var12], var6.transformSkeletonLabels[var11], var6.transformZs[var11], var6.transformXs[var11]
                  );
               }
            }

            Model.Model_transformTempX = 0;
            Model.Model_transformTempY = 0;
            Model.Model_transformTempZ = 0;
            var9 = 0;
            var10 = var5[var9++];

            for (int var17 = 0; var17 < var7.transformCount; var17++) {
               int var18 = var7.transformYs[var17];

               while (var18 > var10) {
                  var10 = var5[var9++];
               }

               if (var18 == var10 || var8.transformTypes[var18] == 0) {
                  var0.transform(
                     var8.transformTypes[var18], var8.labels[var18], var7.transformSkeletonLabels[var17], var7.transformZs[var17], var7.transformXs[var17]
                  );
               }
            }

            var0.method6742();
         } else {
            var0.animate(var1, var2);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lmj;")
   @ObfuscatedName("an")
   public static PacketBufferNode method7429() {
      return PacketBufferNode_packetBufferNodeCount * -955637529 == 0
         ? new PacketBufferNode()
         : PacketBufferNode_packetBufferNodes[(PacketBufferNode_packetBufferNodeCount -= -986475329) * -224691600];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lml;Lxo;)Lmj;")
   @ObfuscatedName("ae")
   public static PacketBufferNode method7430(ClientPacket var0, IsaacCipher var1) {
      PacketBufferNode var2 = class191.method4625((byte)0);
      var2.clientPacket = var0;
      var2.index = var0.length * 422186151;
      if (-1 == 2022752529 * var2.index) {
         var2.packetBuffer = new PacketBuffer(260);
      } else if (var2.index * 2022752529 == -2) {
         var2.packetBuffer = new PacketBuffer(10000);
      } else if (var2.index * 2022752529 <= 18) {
         var2.packetBuffer = new PacketBuffer(20);
      } else if (var2.index * 2022752529 <= 98) {
         var2.packetBuffer = new PacketBuffer(100);
      } else {
         var2.packetBuffer = new PacketBuffer(260);
      }

      var2.packetBuffer.setIsaacCipher(var1, 2058608975);
      var2.packetBuffer.writeByteIsaac(var2.clientPacket.id * 922007241, (short)326);
      var2.clientPacketLength = 0;
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Lmj;S)V")
   @ObfuscatedName("pa")
   public static void method7437(PacketBufferNode var0, short var1) {
      if (var0 == null) {
         var0.release(var1);
      }

      try {
         if (-2135827649 * PacketBufferNode_packetBufferNodeCount >= PacketBufferNode_packetBufferNodes.length) {
            if (var1 != 148) {
               throw new IllegalStateException();
            }
         } else {
            PacketBufferNode_packetBufferNodes[(PacketBufferNode_packetBufferNodeCount += -986475329) * -2135827649 - 1] = var0;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "mj.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lml;Lxo;)Lmj;")
   @ObfuscatedName("aj")
   public static PacketBufferNode method7431(ClientPacket var0, IsaacCipher var1) {
      PacketBufferNode var2 = class191.method4625((byte)0);
      var2.clientPacket = var0;
      var2.index = var0.length * 422186151;
      if (-1 == 2022752529 * var2.index) {
         var2.packetBuffer = new PacketBuffer(260);
      } else if (var2.index * 2022752529 == -2) {
         var2.packetBuffer = new PacketBuffer(10000);
      } else if (var2.index * 2022752529 <= 18) {
         var2.packetBuffer = new PacketBuffer(20);
      } else if (var2.index * 2022752529 <= 98) {
         var2.packetBuffer = new PacketBuffer(100);
      } else {
         var2.packetBuffer = new PacketBuffer(260);
      }

      var2.packetBuffer.setIsaacCipher(var1, 2036839694);
      var2.packetBuffer.writeByteIsaac(var2.clientPacket.id * 922007241, (short)326);
      var2.clientPacketLength = 0;
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lml;Lxo;)Lmj;")
   @ObfuscatedName("ak")
   public static PacketBufferNode method7432(ClientPacket var0, IsaacCipher var1) {
      PacketBufferNode var2 = class191.method4625((byte)0);
      var2.clientPacket = var0;
      var2.index = var0.length * 422186151;
      if (-1 == 2022752529 * var2.index) {
         var2.packetBuffer = new PacketBuffer(260);
      } else if (var2.index * 2022752529 == -2) {
         var2.packetBuffer = new PacketBuffer(10000);
      } else if (var2.index * 2022752529 <= 18) {
         var2.packetBuffer = new PacketBuffer(20);
      } else if (var2.index * 2022752529 <= 98) {
         var2.packetBuffer = new PacketBuffer(100);
      } else {
         var2.packetBuffer = new PacketBuffer(260);
      }

      var2.packetBuffer.setIsaacCipher(var1, 2131068087);
      var2.packetBuffer.writeByteIsaac(var2.clientPacket.id * 922007241, (short)326);
      var2.clientPacketLength = 0;
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lml;Lxo;)Lmj;")
   @ObfuscatedName("aw")
   public static PacketBufferNode method7433(ClientPacket var0, IsaacCipher var1) {
      PacketBufferNode var2 = class191.method4625((byte)0);
      var2.clientPacket = var0;
      var2.index = var0.length * 422186151;
      if (-1 == 2022752529 * var2.index) {
         var2.packetBuffer = new PacketBuffer(260);
      } else if (var2.index * 2022752529 == -2) {
         var2.packetBuffer = new PacketBuffer(10000);
      } else if (var2.index * 2022752529 <= 18) {
         var2.packetBuffer = new PacketBuffer(20);
      } else if (var2.index * 2022752529 <= 98) {
         var2.packetBuffer = new PacketBuffer(100);
      } else {
         var2.packetBuffer = new PacketBuffer(260);
      }

      var2.packetBuffer.setIsaacCipher(var1, 2003831590);
      var2.packetBuffer.writeByteIsaac(var2.clientPacket.id * 922007241, (short)326);
      var2.clientPacketLength = 0;
      return var2;
   }

   PacketBufferNode() {
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)Z")
   @ObfuscatedName("an")
   static boolean method7434(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         int var7 = var4 - var2;
         int var8 = var5 - var3;
         int var9 = var0 - var2;
         int var10 = var1 - var3;
         int var11 = var8 * var10 + var9 * var7;
         int var13 = var8 * var8 + var7 * var7;
         return 0 <= var11 && var11 <= var13;
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "mj.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("ag")
   public void release(short var1) {
      try {
         if (-2135827649 * PacketBufferNode_packetBufferNodeCount >= PacketBufferNode_packetBufferNodes.length) {
            if (var1 != 148) {
               throw new IllegalStateException();
            }
         } else {
            PacketBufferNode_packetBufferNodes[(PacketBufferNode_packetBufferNodeCount += -986475329) * -2135827649 - 1] = this;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "mj.ag(" + ')');
      }
   }
}
