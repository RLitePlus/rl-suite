import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dl")
public class PacketWriter {
   @ObfuscatedName("au")
   int field1408;
   @ObfuscatedName("at")
   int bufferSize;
   @ObfuscatedSignature(descriptor = "Lxa;")
   @ObfuscatedName("ag")
   Buffer buffer;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final int field1419 = 95;
   @ObfuscatedSignature(descriptor = "Lxj;")
   @ObfuscatedName("ae")
   PacketBuffer packetBuffer;
   @ObfuscatedSignature(descriptor = "Lmz;")
   @ObfuscatedName("as")
   ServerPacket field1422;
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   public static final int field1418 = 65536;
   @ObfuscatedName("aw")
   boolean field1407;
   @ObfuscatedName("ap")
   int field1413;
   @ObfuscatedName("ay")
   int pendingWrites;
   @ObfuscatedSignature(descriptor = "Lmz;")
   @ObfuscatedName("ad")
   ServerPacket field1420;
   @ObfuscatedName("az")
   int field1417;
   @ObfuscatedName("ak")
   int serverPacketLength;
   @ObfuscatedSignature(descriptor = "Lmz;")
   @ObfuscatedName("ai")
   ServerPacket field1421;
   @ObfuscatedSignature(descriptor = "Lmz;")
   @ObfuscatedName("aj")
   ServerPacket serverPacket;
   @ObfuscatedSignature(descriptor = "Ltd;")
   @ObfuscatedName("ac")
   AbstractSocket socket;
   @ObfuscatedSignature(descriptor = "Lxo;")
   @ObfuscatedName("an")
   public IsaacCipher isaacCipher;
   @ObfuscatedSignature(descriptor = "Lrm;")
   @ObfuscatedName("av")
   IterableNodeDeque packetBufferNodes = new IterableNodeDeque();

   @ObfuscatedSignature(descriptor = "()Ltd;")
   @ObfuscatedName("af")
   AbstractSocket method3342() {
      return this.socket;
   }

   @ObfuscatedSignature(descriptor = "(Ldl;Lmj;I)V")
   @ObfuscatedName("je")
   public static void method3330(PacketWriter var0, PacketBufferNode var1, int var2) {
      if (var0 == null) {
         var0.addNode(var1, var2);
      }

      try {
         var0.packetBufferNodes.addFirst(var1);
         var1.clientPacketLength = var1.packetBuffer.offset * -2068854399;
         var1.packetBuffer.offset = 0;
         var0.bufferSize = var0.bufferSize + 1226371229 * var1.clientPacketLength;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dl.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   void method3334() {
      if (null != this.socket) {
         this.socket.close(-1883200549);
         this.socket = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   final void flush(int var1) throws IOException {
      try {
         if (this.socket != null) {
            if (var1 != -489061727) {
               throw new IllegalStateException();
            }

            if (-630103807 * this.bufferSize > 0) {
               if (var1 != -489061727) {
                  return;
               }

               this.buffer.offset = 0;

               while (true) {
                  PacketBufferNode var2 = (PacketBufferNode)this.packetBufferNodes.method9642();
                  if (null == var2) {
                     if (var1 != -489061727) {
                        return;
                     }
                     break;
                  }

                  if (-1550750307 * var2.clientPacketLength > this.buffer.array.length - 2108391709 * this.buffer.offset) {
                     break;
                  }

                  Buffer.method11967(this.buffer, var2.packetBuffer.array, 0, var2.clientPacketLength * -1550750307, -1187258379);
                  this.bufferSize = this.bufferSize - 1226371229 * var2.clientPacketLength;
                  var2.remove();
                  var2.packetBuffer.releaseArray((byte)-44);
                  PacketBufferNode.method7437(var2, (short)148);
               }

               this.socket.write(this.buffer.array, 0, this.buffer.offset * 2108391709, 236947338);
               this.pendingWrites = 0;
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dl.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("an")
   void close(byte var1) {
      try {
         if (null != this.socket) {
            if (var1 <= 16) {
               throw new IllegalStateException();
            }

            this.socket.close(-1883200549);
            this.socket = null;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dl.an(" + ')');
      }
   }

   PacketWriter() {
      this.bufferSize = 0;
      this.buffer = new Buffer(5000);
      this.packetBuffer = new PacketBuffer(40000);
      this.serverPacket = null;
      this.serverPacketLength = 0;
      this.field1407 = true;
      this.field1413 = 0;
      this.pendingWrites = 0;
      this.field1408 = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   final void method3324() {
      IterableNodeDeque.method9629(this.packetBufferNodes);
      this.bufferSize = 0;
   }

   @ObfuscatedSignature(descriptor = "(Ltd;)V")
   @ObfuscatedName("am")
   void method3348(AbstractSocket var1) {
      this.socket = var1;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("av")
   final void clearBuffer(byte var1) {
      try {
         IterableNodeDeque.method9629(this.packetBufferNodes);
         this.bufferSize = 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dl.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltd;I)V")
   @ObfuscatedName("ak")
   void setSocket(AbstractSocket var1, int var2) {
      try {
         this.socket = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dl.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;Lci;IILlz;B)V")
   @ObfuscatedName("lg")
   static final void method3352(WorldView var0, Player var1, int var2, int var3, MoveSpeed var4, byte var5) {
      try {
         int var6 = var1.pathX[0];
         int var7 = var1.pathY[0];
         int var8 = -919874483 * var1.size;
         CollisionMap var9 = var0.collisionMaps[2115028565 * var0.plane];
         if (var6 >= var8 && var6 < var9.method6375(-920691729) - var8 && var7 >= var8) {
            if (var5 == 21) {
               return;
            }

            if (var7 < var9.method6377(-1618689043) - var8) {
               if (var2 >= var8) {
                  if (var5 == 21) {
                     throw new IllegalStateException();
                  }

                  if (var2 < var9.method6375(-1368622563) - var8) {
                     if (var5 == 21) {
                        throw new IllegalStateException();
                     }

                     if (var3 >= var8) {
                        if (var5 == 21) {
                           throw new IllegalStateException();
                        }

                        if (var3 < var9.method6377(-1955481609) - var8) {
                           class288 var10 = client.field793;
                           client.field651.approxDestinationSizeY = var2 * 565889611;
                           client.field651.approxDestinationX = var3 * 1677895175;
                           client.field651.approxDestinationSizeX = -2055351055;
                           client.field651.approxDestinationY = -2323205;
                           ApproximateRouteStrategy var14 = client.field651;
                           int var15 = var10.method7300(var6, var7, var8, var14, var9, true, client.field911, client.field718, -1552550640);
                           if (var15 < 1) {
                              if (var5 == 21) {
                                 throw new IllegalStateException();
                              }

                              return;
                           }

                           for (int var16 = 0; var16 < var15 - 1; var16++) {
                              if (var5 == 21) {
                                 return;
                              }

                              Actor.method2765(var1, client.field911[var16], client.field718[var16], var4, -645794364);
                           }

                           return;
                        }

                        if (var5 == 21) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }

               return;
            }

            if (var5 == 21) {
               throw new IllegalStateException();
            }
         }
      } catch (RuntimeException var17) {
         throw RestClientThreadFactory.newRunException(var17, "dl.lg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lmj;)V")
   @ObfuscatedName("ad")
   public final void method3331(PacketBufferNode var1) {
      this.packetBufferNodes.addFirst(var1);
      var1.clientPacketLength = var1.packetBuffer.offset * -2068854399;
      var1.packetBuffer.offset = 0;
      this.bufferSize = this.bufferSize + 1226371229 * var1.clientPacketLength;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   void method3336() {
      if (null != this.socket) {
         this.socket.close(-1883200549);
         this.socket = null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldl;)V")
   @ObfuscatedName("bu")
   public static void method3337(PacketWriter var0) {
      if (null != var0.socket) {
         var0.socket.close(-1883200549);
         var0.socket = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   void method3338() {
      if (null != this.socket) {
         this.socket.close(-1883200549);
         this.socket = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   void method3339() {
      this.socket = null;
   }

   @ObfuscatedSignature(descriptor = "()Ltd;")
   @ObfuscatedName("ar")
   AbstractSocket method3343() {
      return this.socket;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldl;Lmj;)V")
   @ObfuscatedName("qt")
   public static void method3332(PacketWriter var0, PacketBufferNode var1) {
      var0.packetBufferNodes.addFirst(var1);
      var1.clientPacketLength = var1.packetBuffer.offset * -475706857;
      var1.packetBuffer.offset = 0;
      var0.bufferSize = var0.bufferSize + -1256855509 * var1.clientPacketLength;
   }

   @ObfuscatedSignature(descriptor = "()Ltd;")
   @ObfuscatedName("ah")
   AbstractSocket method3344() {
      return this.socket;
   }

   @ObfuscatedSignature(descriptor = "()Ltd;")
   @ObfuscatedName("al")
   AbstractSocket method3345() {
      return this.socket;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpb;)V")
   @ObfuscatedName("ie")
   public static void method3329(Timer var0) {
      if (var0 == null) {
         var0.method8705();
      } else {
         Timer.method8700(var0, (byte)78);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldl;I)V")
   @ObfuscatedName("ka")
   public static void method3340(PacketWriter var0, int var1) {
      if (var0 == null) {
         var0.removeSocket(var1);
      } else {
         try {
            var0.socket = null;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "dl.ae(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldl;I)Ltd;")
   @ObfuscatedName("ko")
   public static AbstractSocket method3346(PacketWriter var0, int var1) {
      if (var0 == null) {
         return var0.getSocket(var1);
      } else {
         try {
            return var0.socket;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "dl.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   final void method3327() throws IOException {
      if (this.socket != null && -630103807 * this.bufferSize > 0) {
         this.buffer.offset = 0;

         while (true) {
            PacketBufferNode var1 = (PacketBufferNode)this.packetBufferNodes.method9642();
            if (null == var1 || -1550750307 * var1.clientPacketLength > this.buffer.array.length - 2108391709 * this.buffer.offset) {
               this.socket.write(this.buffer.array, 0, this.buffer.offset * 2108391709, 1991527531);
               this.pendingWrites = 0;
               break;
            }

            Buffer.method11967(this.buffer, var1.packetBuffer.array, 0, var1.clientPacketLength * -1550750307, -1187258379);
            this.bufferSize = this.bufferSize - 1226371229 * var1.clientPacketLength;
            var1.remove();
            var1.packetBuffer.releaseArray((byte)35);
            PacketBufferNode.method7437(var1, (short)148);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltd;)V")
   @ObfuscatedName("ao")
   void method3350(AbstractSocket var1) {
      this.socket = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldl;)V")
   @ObfuscatedName("hi")
   public static void method3328(PacketWriter var0) throws IOException {
      if (var0.socket != null && -630103807 * var0.bufferSize > 0) {
         var0.buffer.offset = 0;

         while (true) {
            PacketBufferNode var1 = (PacketBufferNode)var0.packetBufferNodes.method9642();
            if (null == var1 || -1550750307 * var1.clientPacketLength > var0.buffer.array.length - 2108391709 * var0.buffer.offset) {
               var0.socket.write(var0.buffer.array, 0, var0.buffer.offset * 2108391709, -23254104);
               var0.pendingWrites = 0;
               break;
            }

            Buffer.method11967(var0.buffer, var1.packetBuffer.array, 0, var1.clientPacketLength * -1550750307, -1187258379);
            var0.bufferSize = var0.bufferSize - 1226371229 * var1.clientPacketLength;
            var1.remove();
            var1.packetBuffer.releaseArray((byte)-8);
            PacketBufferNode.method7437(var1, (short)148);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltd;)V")
   @ObfuscatedName("aa")
   void method3351(AbstractSocket var1) {
      this.socket = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lmj;I)V")
   @ObfuscatedName("ag")
   public final void addNode(PacketBufferNode var1, int var2) {
      try {
         this.packetBufferNodes.addLast(var1);
         var1.clientPacketLength = var1.packetBuffer.offset * -2068854399;
         var1.packetBuffer.offset = 0;
         this.field1408 = this.field1417 + 1226371229 * var1.clientPacketLength;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "dl.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   void removeSocket(int var1) {
      try {
         this.socket = null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dl.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ltd;")
   @ObfuscatedName("aj")
   AbstractSocket getSocket(int var1) {
      try {
         return this.socket;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "dl.aj(" + ')');
      }
   }
}
