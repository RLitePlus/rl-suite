import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sw")
public class classSW {
   @ObfuscatedName("aw")
   public int field6090;
   @ObfuscatedName("al")
   public int field6083;
   @ObfuscatedName("ai")
   public int field6081;
   @ObfuscatedName("ac")
   public int field6076;
   @ObfuscatedName("ab")
   public int field6075;
   @ObfuscatedName("ay")
   public int field6092;
   @ObfuscatedName("ap")
   public int field6085;
   @ObfuscatedName("aq")
   public int field6086;
   @ObfuscatedName("as")
   public int field6088;
   @ObfuscatedName("ax")
   public int field6091;
   @ObfuscatedName("ao")
   public int field6084;
   @ObfuscatedName("aj")
   public int field6082;
   @ObfuscatedName("ad")
   public int field6077;
   @ObfuscatedName("ag")
   public int field6080;
   @ObfuscatedName("ar")
   public int field6087;
   @ObfuscatedName("az")
   public int field6093;
   @ObfuscatedName("af")
   public int field6079;
   @ObfuscatedName("aa")
   public int field6074;
   @ObfuscatedName("ae")
   public int field6078;
   @ObfuscatedName("au")
   public int field6089;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsg;I)[F")
   @ObfuscatedName("qe")
   public static float[] method10698(classSG var0, int var1) {
      return var0.field5934[var1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;I)Ldz;")
   @ObfuscatedName("lp")
   public static WorldView method10697(classCL var0, int var1) {
      return (WorldView)var0.field782.method13595(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lyk;IIIIIIS)V")
   @ObfuscatedName("ei")
   static void method10700(IndexedObjectSet var0, int var1, int var2, int var3, int var4, int var5, int var6, short var7) {
      try {
         if (9 == var3) {
            if (var7 == 765) {
               throw new IllegalStateException();
            }

            int var8 = var4 & 65535;
            NPC var9 = (NPC)var0.method13404(var8);
            if (null != var9) {
               if (var7 == 765) {
                  throw new IllegalStateException();
               }

               client.field957 = var5 * -727473855;
               client.field958 = 527203475 * var6;
               client.field863 = -921463806;
               client.field969 = 0;
               client.field859 = var1 * -1254957895;
               client.field834 = var2 * -877699493;
               int var10 = var4 >> 16;
               PacketBufferNode var11 = classEF.getPacketBufferNode(ClientPacket.OPNPC1_V2, client.packetWriter.isaacCipher, (byte)88);
               Buffer.method13180(var11.packetBuffer, var8, (byte)65);
               Buffer.method12971(var11.packetBuffer, var10, (byte)-86);
               var11.packetBuffer.method13151(classFA.method4540(client.field931, 82, 1700143560) ? 1 : 0, -1910538783);
               client.packetWriter.addNode(var11, -1301097035);
            }
         }

         if (var3 == 10) {
            int var13 = var4 & 65535;
            NPC var17 = (NPC)var0.method13404(var13);
            if (var17 != null) {
               if (var7 == 765) {
                  return;
               }

               client.field957 = var5 * -727473855;
               client.field958 = var6 * 527203475;
               client.field863 = -921463806;
               client.field969 = 0;
               client.field859 = var1 * -1254957895;
               client.field834 = var2 * -877699493;
               int var21 = var4 >> 16;
               PacketBufferNode var25 = classEF.getPacketBufferNode(ClientPacket.OPNPC2_V2, client.packetWriter.isaacCipher, (byte)52);
               Buffer.method13180(var25.packetBuffer, var13, (byte)11);
               var25.packetBuffer.method13151(var21, -1910538783);
               var25.packetBuffer.method13156(classFA.method4540(client.field931, 82, 748892206) ? 1 : 0, (byte)-8);
               client.packetWriter.addNode(var25, -1301097035);
            }
         }

         if (11 == var3) {
            if (var7 == 765) {
               throw new IllegalStateException();
            }

            int var14 = var4 & 65535;
            NPC var18 = (NPC)var0.method13404(var14);
            if (var18 != null) {
               if (var7 == 765) {
                  throw new IllegalStateException();
               }

               client.field957 = var5 * -727473855;
               client.field958 = var6 * 527203475;
               client.field863 = -921463806;
               client.field969 = 0;
               client.field859 = -1254957895 * var1;
               client.field834 = -877699493 * var2;
               int var22 = var4 >> 16;
               PacketBufferNode var26 = classEF.getPacketBufferNode(ClientPacket.OPNPC3_V2, client.packetWriter.isaacCipher, (byte)-45);
               Buffer.method13180(var26.packetBuffer, var14, (byte)-114);
               var26.packetBuffer.method13156(classFA.method4540(client.field931, 82, 1084239123) ? 1 : 0, (byte)107);
               var26.packetBuffer.method13153(var22, (byte)86);
               client.packetWriter.addNode(var26, -1301097035);
            }
         }

         if (var3 == 12) {
            int var15 = var4 & 65535;
            NPC var19 = (NPC)var0.method13404(var15);
            if (null != var19) {
               if (var7 == 765) {
                  return;
               }

               client.field957 = var5 * -727473855;
               client.field958 = var6 * 527203475;
               client.field863 = -921463806;
               client.field969 = 0;
               client.field859 = var1 * -1254957895;
               client.field834 = -877699493 * var2;
               int var23 = var4 >> 16;
               PacketBufferNode var27 = classEF.getPacketBufferNode(ClientPacket.OPNPC4_V2, client.packetWriter.isaacCipher, (byte)14);
               PacketBuffer var10000 = var27.packetBuffer;
               byte var10001;
               if (classFA.method4540(client.field931, 82, 807060348)) {
                  if (var7 == 765) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var10000.method13156(var10001, (byte)-15);
               Buffer.method12971(var27.packetBuffer, var23, (byte)-6);
               Buffer.method13186(var27.packetBuffer, var15, (byte)16);
               client.packetWriter.addNode(var27, -1301097035);
            }
         }

         if (var3 == 13) {
            int var16 = var4 & 65535;
            NPC var20 = (NPC)var0.method13404(var16);
            if (var20 != null) {
               if (var7 == 765) {
                  return;
               }

               client.field957 = -727473855 * var5;
               client.field958 = 527203475 * var6;
               client.field863 = -921463806;
               client.field969 = 0;
               client.field859 = -1254957895 * var1;
               client.field834 = var2 * -877699493;
               int var24 = var4 >> 16;
               PacketBufferNode var28 = classEF.getPacketBufferNode(ClientPacket.OPNPC5_V2, client.packetWriter.isaacCipher, (byte)108);
               Buffer.method12971(var28.packetBuffer, var24, (byte)-23);
               PacketBuffer var29 = var28.packetBuffer;
               byte var30;
               if (classFA.method4540(client.field931, 82, 1388532673)) {
                  if (var7 == 765) {
                     throw new IllegalStateException();
                  }

                  var30 = 1;
               } else {
                  var30 = 0;
               }

               var29.method13153(var30, (byte)59);
               var28.packetBuffer.method12973(var16, -1542382992);
               client.packetWriter.addNode(var28, -1301097035);
            }
         }
      } catch (RuntimeException var12) {
         throw classEG.newRunException(var12, "sw.ei(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvl;IIIII)Z")
   @ObfuscatedName("as")
   public static boolean method10699(classVL var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         return !classTW.method11208(var0, var1, var2, var3, var4, 1345844916)
            ? false
            : classNL.method7880(
               var0.method11976(0, -1811283006),
               var0.method11980(0, (byte)-91),
               var0.method11976(1, 647057276),
               var0.method11980(1, (byte)-14),
               var0.method11976(2, -1900315998),
               var0.method11980(2, (byte)6),
               var0.method11976(3, -1969765473),
               var0.method11980(3, (byte)-11),
               var1,
               var2,
               var3,
               var4,
               1417269648
            );
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "sw.as(" + ')');
      }
   }
}
