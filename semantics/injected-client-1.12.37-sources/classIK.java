import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ik")
public class classIK extends classHB {
   @ObfuscatedName("af")
   int field2983;
   @ObfuscatedName("az")
   int field2985;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field2984 = 74;

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("bl")
   static int method6220(int var0, byte var1) {
      try {
         return (int)((Math.log(var0) / classBB.field325 - 7.0) * 256.0);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "ik.bl(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxk;Lxs;)V")
   @ObfuscatedName("lz")
   public static void method6217(classXK var0, PacketBuffer var1) {
      if (var0 == null) {
         var0.method12826(var1);
      } else {
         var0.method12830(var1, 4, 13, 13, 829052598);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod498(Buffer var1, int var2) {
      try {
         this.field2985 = var1.method13056((byte)1) * -648578623;
         this.field2983 = var1.method13056((byte)1) * 553629733;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ik.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod501(Buffer var1) {
      this.field2985 = var1.method13056((byte)1) * -648578623;
      this.field2983 = var1.method13056((byte)1) * 553629733;
   }

   classIK(classIF var1) {
      this.this$0 = var1;
   }

   @ObfuscatedSignature(descriptor = "(FFFB)Luz;")
   @ObfuscatedName("af")
   public static classUZ method6218(float var0, float var1, float var2, byte var3) {
      try {
         synchronized (classUZ.field6430) {
            if (-1124722655 * classUZ.field6435 == 0) {
               if (var3 == 16) {
                  throw new IllegalStateException();
               } else {
                  return new classUZ(var0, var1, var2);
               }
            } else {
               classUZ.field6430[(classUZ.field6435 -= 801074145) * -1124722655].method11728(var0, var1, var2, 1996170472);
               return classUZ.field6430[-1124722655 * classUZ.field6435];
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "ik.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod502(ClanSettings var1) {
      ClanSettings.method6282(var1, this.field2985 * 1086748175, 1977459629 * this.field2983, (short)-6161);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod503(ClanSettings var1) {
      ClanSettings.method6282(var1, this.field2985 * -835479999, -2117980742 * this.field2983, (short)-3048);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llh;)V")
   @ObfuscatedName("nv")
   public static void method6219(classLH var0) {
      if (var0.field4166 != null) {
         var0.field4166.vmethod147(-2143360612);
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod504(ClanSettings var1) {
      ClanSettings.method6282(var1, this.field2985 * -835479999, 264471570 * this.field2983, (short)9639);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIIII)V")
   @ObfuscatedName("ez")
   static void method6221(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (var2 == 3) {
            if (var8 == 129979076) {
               return;
            }

            client.field957 = -727473855 * var4;
            client.field958 = var5 * 527203475;
            client.field863 = -921463806;
            client.field969 = 0;
            client.field859 = -1254957895 * var0;
            client.field834 = -877699493 * var1;
            int var9 = var3 & 65535;
            int var10 = var3 >> 16;
            PacketBufferNode var11 = classEF.getPacketBufferNode(ClientPacket.OPLOC1_V2, client.packetWriter.isaacCipher, (byte)-123);
            PacketBuffer var10000 = var11.packetBuffer;
            byte var10001;
            if (classFA.method4540(client.field931, 82, 754522953)) {
               if (var8 == 129979076) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var10000.method13156(var10001, (byte)38);
            var11.packetBuffer.method13188(var1 + var7, (short)-16375);
            Buffer.method12971(var11.packetBuffer, var10, (byte)-9);
            var11.packetBuffer.method13188(var0 + var6, (short)-17819);
            Buffer.method13186(var11.packetBuffer, var9, (byte)16);
            client.packetWriter.addNode(var11, -1301097035);
         }

         if (var2 == 4) {
            client.field957 = var4 * -727473855;
            client.field958 = var5 * 527203475;
            client.field863 = -921463806;
            client.field969 = 0;
            client.field859 = -1254957895 * var0;
            client.field834 = var1 * -877699493;
            int var13 = var3 & 65535;
            int var17 = var3 >> 16;
            PacketBufferNode var21 = classEF.getPacketBufferNode(ClientPacket.OPLOC2_V2, client.packetWriter.isaacCipher, (byte)29);
            var21.packetBuffer.method12973(var1 + var7, -1542382992);
            var21.packetBuffer.method13153(var17, (byte)25);
            PacketBuffer var25 = var21.packetBuffer;
            byte var29;
            if (classFA.method4540(client.field931, 82, 234334098)) {
               if (var8 == 129979076) {
                  throw new IllegalStateException();
               }

               var29 = 1;
            } else {
               var29 = 0;
            }

            var25.method13156(var29, (byte)-94);
            var21.packetBuffer.method12973(var13, -1542382992);
            Buffer.method13180(var21.packetBuffer, var6 + var0, (byte)72);
            client.packetWriter.addNode(var21, -1301097035);
         }

         if (5 == var2) {
            if (var8 == 129979076) {
               throw new IllegalStateException();
            }

            client.field957 = -727473855 * var4;
            client.field958 = var5 * 527203475;
            client.field863 = -921463806;
            client.field969 = 0;
            client.field859 = var0 * -1254957895;
            client.field834 = var1 * -877699493;
            int var14 = var3 & 65535;
            int var18 = var3 >> 16;
            PacketBufferNode var22 = classEF.getPacketBufferNode(ClientPacket.OPLOC3_V2, client.packetWriter.isaacCipher, (byte)12);
            var22.packetBuffer.method13156(var18, (byte)76);
            PacketBuffer var26 = var22.packetBuffer;
            byte var30;
            if (classFA.method4540(client.field931, 82, 2109348940)) {
               if (var8 == 129979076) {
                  throw new IllegalStateException();
               }

               var30 = 1;
            } else {
               var30 = 0;
            }

            var26.method13156(var30, (byte)-82);
            Buffer.method13186(var22.packetBuffer, var7 + var1, (byte)16);
            var22.packetBuffer.method13188(var14, (short)-2341);
            var22.packetBuffer.method12973(var6 + var0, -1542382992);
            client.packetWriter.addNode(var22, -1301097035);
         }

         if (6 == var2) {
            if (var8 == 129979076) {
               return;
            }

            client.field957 = var4 * -727473855;
            client.field958 = 527203475 * var5;
            client.field863 = -921463806;
            client.field969 = 0;
            client.field859 = -1254957895 * var0;
            client.field834 = var1 * -877699493;
            int var15 = var3 & 65535;
            int var19 = var3 >> 16;
            PacketBufferNode var23 = classEF.getPacketBufferNode(ClientPacket.OPLOC4_V2, client.packetWriter.isaacCipher, (byte)71);
            PacketBuffer var27 = var23.packetBuffer;
            byte var31;
            if (classFA.method4540(client.field931, 82, -64012912)) {
               if (var8 == 129979076) {
                  throw new IllegalStateException();
               }

               var31 = 1;
            } else {
               var31 = 0;
            }

            var27.method13151(var31, -1910538783);
            Buffer.method13180(var23.packetBuffer, var15, (byte)-11);
            var23.packetBuffer.method12973(var1 + var7, -1542382992);
            var23.packetBuffer.method13151(var19, -1910538783);
            var23.packetBuffer.method12973(var6 + var0, -1542382992);
            client.packetWriter.addNode(var23, -1301097035);
         }

         if (var2 == 1001) {
            client.field957 = var4 * -727473855;
            client.field958 = 527203475 * var5;
            client.field863 = -921463806;
            client.field969 = 0;
            client.field859 = var0 * -1254957895;
            client.field834 = -877699493 * var1;
            int var16 = var3 & 65535;
            int var20 = var3 >> 16;
            PacketBufferNode var24 = classEF.getPacketBufferNode(ClientPacket.OPLOC5_V2, client.packetWriter.isaacCipher, (byte)-47);
            Buffer.method13180(var24.packetBuffer, var7 + var1, (byte)-87);
            var24.packetBuffer.method12973(var6 + var0, -1542382992);
            var24.packetBuffer.method13151(var20, -1910538783);
            PacketBuffer var28 = var24.packetBuffer;
            byte var32;
            if (classFA.method4540(client.field931, 82, 640552038)) {
               if (var8 == 129979076) {
                  return;
               }

               var32 = 1;
            } else {
               var32 = 0;
            }

            var28.method13156(var32, (byte)23);
            var24.packetBuffer.method13188(var16, (short)-320);
            client.packetWriter.addNode(var24, -1301097035);
         }
      } catch (RuntimeException var12) {
         throw classEG.newRunException(var12, "ik.ez(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;B)V")
   @ObfuscatedName("af")
   @Override
   void vmethod499(ClanSettings var1, byte var2) {
      try {
         ClanSettings.method6282(var1, this.field2985 * -835479999, 1977459629 * this.field2983, (short)738);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ik.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod500(Buffer var1) {
      this.field2985 = var1.method13056((byte)1) * -648578623;
      this.field2983 = var1.method13056((byte)1) * 553629733;
   }
}
