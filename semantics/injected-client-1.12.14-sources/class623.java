import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xl")
public class class623 {
   @ObfuscatedName("az")
   static short[][][] Tiles_overlays;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field6577 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field6576 = 12;
   @ObfuscatedName("av")
   public static final int[] field6575 = new int[]{
      16777215,
      14942979,
      16747520,
      16772352,
      32806,
      2375822,
      7547266,
      16720268,
      11884176,
      5261772,
      10724259,
      13970688,
      15693351,
      16577588,
      494960,
      2208255,
      10178454,
      16756679,
      13722276,
      8105443,
      16751190,
      2543274,
      7591918,
      10246609,
      10021057,
      11894492,
      2894892,
      9699842,
      6371605,
      13680896,
      4882723,
      14504,
      8388736,
      14025328,
      10682978,
      4004472
   };

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Lqd;I)Lmj;")
   @ObfuscatedName("at")
   public static PacketBufferNode method12414(int var0, String var1, Language var2, int var3) {
      PacketBufferNode var4 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3878, client.packetWriter.isaacCipher, -1674263385);
      var4.packetBuffer.writeByte(0, (short)-8992);
      int var5 = var4.packetBuffer.offset * 2108391709;
      var4.packetBuffer.writeByte(var0, (short)-14655);
      String var6 = var1.toLowerCase();
      int var7 = 0;
      byte[] var8 = null;
      if (var6.startsWith(Strings.field5046)) {
         var7 = 0;
         var1 = var1.substring(Strings.field5046.length());
      } else if (var6.startsWith(Strings.field4976)) {
         var7 = 1;
         var1 = var1.substring(Strings.field4976.length());
      } else if (var6.startsWith(Strings.field5048)) {
         var7 = 2;
         var1 = var1.substring(Strings.field5048.length());
      } else if (var6.startsWith(Strings.field4857)) {
         var7 = 3;
         var1 = var1.substring(Strings.field4857.length());
      } else if (var6.startsWith(Strings.field4860)) {
         var7 = 4;
         var1 = var1.substring(Strings.field4860.length());
      } else if (var6.startsWith(Strings.field5007)) {
         var7 = 5;
         var1 = var1.substring(Strings.field5007.length());
      } else if (var6.startsWith(Strings.field4921)) {
         var7 = 6;
         var1 = var1.substring(Strings.field4921.length());
      } else if (var6.startsWith(Strings.field5121)) {
         var7 = 7;
         var1 = var1.substring(Strings.field5121.length());
      } else if (var6.startsWith(Strings.field5054)) {
         var7 = 8;
         var1 = var1.substring(Strings.field5054.length());
      } else if (var6.startsWith(Strings.field5055)) {
         var7 = 9;
         var1 = var1.substring(Strings.field5055.length());
      } else if (var6.startsWith(Strings.field5056)) {
         var7 = 10;
         var1 = var1.substring(Strings.field5056.length());
      } else if (var6.startsWith(Strings.field5057)) {
         var7 = 11;
         var1 = var1.substring(Strings.field5057.length());
      } else if (var6.startsWith(Strings.field5013)) {
         var7 = 12;
         var1 = var1.substring(Strings.field5013.length());
      } else if (var6.startsWith(Strings.field5014)) {
         int var10 = -1844401472;
         int var11 = 1203371332;
         int var12 = Strings.field5014.length();
         int var13 = 0;
         byte[] var14 = new byte[8];

         byte[] var9;
         while (true) {
            int var15 = var12 + var13;
            if (var15 >= var6.length()) {
               var9 = null;
               break;
            }

            char var16 = var6.charAt(var15);
            if (var16 == 599697378) {
               if (var13 == 0) {
                  var9 = null;
               } else {
                  byte[] var20 = new byte[var13];
                  System.arraycopy(var14, 0, var20, 0, var13);
                  var9 = var20;
               }
               break;
            }

            if (var13 == var14.length) {
               var9 = null;
               break;
            }

            if (var16 >= -2016325119 && var16 <= '9') {
               var16 = (char)(var16 - -1985176976);
            } else {
               if (var16 < 746203060 || var16 > 'z') {
                  var9 = null;
                  break;
               }

               var16 = (char)(var16 - 1690577223);
            }

            var14[var13++] = (byte)var16;
         }

         var8 = var9;
         if (var9 != null) {
            var7 = 12 + var9.length;
            var1 = var1.substring(Strings.field5014.length() + var9.length + 1);
         }
      }

      var6 = var1.toLowerCase();
      byte var18 = 0;
      if (var6.startsWith(Strings.field5060)) {
         var18 = 1;
         var1 = var1.substring(Strings.field5060.length());
      } else if (var6.startsWith(Strings.field5061)) {
         var18 = 2;
         var1 = var1.substring(Strings.field5061.length());
      } else if (var6.startsWith(Strings.field5062)) {
         var18 = 3;
         var1 = var1.substring(Strings.field5062.length());
      } else if (var6.startsWith(Strings.field4913)) {
         var18 = 4;
         var1 = var1.substring(Strings.field4913.length());
      } else if (var6.startsWith(Strings.field5064)) {
         var18 = 5;
         var1 = var1.substring(Strings.field5064.length());
      }

      var4.packetBuffer.writeByte(var7, (short)-22828);
      var4.packetBuffer.writeByte(var18, (short)-6757);
      if (var8 != null) {
         for (int var19 = 0; var19 < var8.length; var19++) {
            var4.packetBuffer.writeByte(var8[var19], (short)-31244);
         }
      }

      classLN.method7205(var4.packetBuffer, var1, -293496581);
      if (var0 == class383.field4696.rsOrdinal((byte)24)) {
         var4.packetBuffer.writeByte(var3, (short)-9096);
      }

      var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset * 1664682125 - var5, 520225464);
      return var4;
   }

   @ObfuscatedSignature(descriptor = "(Ljh;IIII)Z")
   @ObfuscatedName("cj")
   public static boolean method12415(Scene var0, int var1, int var2, int var3, int var4) {
      return var0 == null ? var0.method5595(var1, var1, var1, var1) : Scene.method5581(var0, var0.field2958, var1, var2, var3, var4);
   }

   class623() throws Throwable {
      throw new Error();
   }
}
