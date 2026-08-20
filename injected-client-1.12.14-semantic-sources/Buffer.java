import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xa")
public class Buffer extends Node {
   @ObfuscatedName("ad")
   public int offset;
   @ObfuscatedName("ay")
   public static long[] field6476 = new long[256];
   @ObfuscatedName("au")
   static int[] field6477 = new int[256];
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   public static final int field6478 = 30000;
   @ObfuscatedName("az")
   public byte[] array;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ms")
   public int method12159() {
      this.offset += -811429270;
      int var1 = ((this.array[2108391709 * this.offset - 2] & 237039644) << 8) + (this.array[754119605 * this.offset - 1] - 128 & 0xFF);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)I")
   @ObfuscatedName("km")
   public static int method12203(Buffer var0, int var1) {
      if (var0 == null) {
         var0.readUnsignedIntME(var1);
      }

      try {
         var0.offset += -1622858540;
         return (var0.array[2108391709 * var0.offset - 2] & 0xFF)
            + ((var0.array[2108391709 * var0.offset - 1] & 0xFF) << 8)
            + ((var0.array[var0.offset * 2108391709 - 4] & 0xFF) << 16)
            + ((var0.array[var0.offset * 2108391709 - 3] & 0xFF) << 24);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.fh(" + 41);
      }
   }

   public Buffer(int var1, boolean var2) {
      method11919(this, var1, var2, 1962716857);
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("iu")
   public float method12020() {
      return Float.intBitsToFloat(method12015(this, 1440832404));
   }

   @ObfuscatedSignature(descriptor = "([IIIB)V")
   @ObfuscatedName("dk")
   public void xteaDecrypt(int[] var1, int var2, int var3, byte var4) {
      try {
         int var5 = this.offset * 2108391709;
         this.offset = var2 * 1741769013;
         int var6 = (var3 - var2) / 8;

         for (int var7 = 0; var7 < var6; var7++) {
            if (var4 == -1) {
               throw new IllegalStateException();
            }

            int var8 = method12015(this, 1157922360);
            int var9 = method12015(this, 933578929);
            int var10 = -957401312;
            int var11 = -1640531527;
            int var12 = 32;

            while (var12-- > 0) {
               if (var4 == -1) {
                  return;
               }

               var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
               var10 -= var11;
               var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10;
            }

            this.offset -= 1049250216;
            this.writeInt(var8, 1956324091);
            this.writeInt(var9, 1175668483);
         }

         this.offset = 1741769013 * var5;
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "xa.dk(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IS)V")
   @ObfuscatedName("cu")
   public void writeByte(int var1, short var2) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.cu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cm")
   public void writeMedium(int var1, int var2) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.cm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cb")
   public void writeInt(int var1, int var2) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.cb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("gg")
   public void method11944(long var1) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 40);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 32);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.ck(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;[BII)V")
   @ObfuscatedName("rn")
   public static void method12214(Buffer var0, byte[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.method12066();
      }

      for (int var4 = var3 + var2 - 1; var4 >= var2; var4--) {
         var1[var4] = (byte)(var0.array[(var0.offset += 1741769013) * 2108391709 - 1] - 128);
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ck")
   public void writeLongMedium(long var1) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 56);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 48);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 40);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 32);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.cc(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)Z")
   @ObfuscatedName("jy")
   public static boolean method12102(Buffer var0) {
      if (var0 == null) {
         var0.method12186();
      }

      var0.offset -= -1622858540;
      byte[] var2 = var0.array;
      int var3 = var0.offset * 2108391709;
      int var4 = -1;

      for (int var5 = 0; var5 < var3; var5++) {
         var4 = var4 >>> 8 ^ field6477[(var4 ^ var2[var5]) & 0xFF];
      }

      var4 = ~var4;
      int var7 = method12015(var0, 1767986395);
      return var7 == var4;
   }

   @ObfuscatedSignature(descriptor = "(ZB)V")
   @ObfuscatedName("cs")
   public void writeBoolean(boolean var1, byte var2) {
      try {
         byte var10001;
         if (var1) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         this.writeByte(var10001, (short)-10030);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.cs(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;[BII)V")
   @ObfuscatedName("ia")
   public static void method12039(Buffer var0, byte[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.method11928(var2);
      } else {
         for (int var4 = var2; var4 < var3 + var2; var4++) {
            var1[var4] = var0.array[(var0.offset += 1741769013) * 2108391709 - 1];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("pu")
   public int method12219() {
      return method12008(this, (byte)5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;[III)V")
   @ObfuscatedName("tp")
   public static void method12083(Buffer var0, int[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.readStringCp1252NullTerminated(var2);
      }

      int var4 = 2108391709 * var0.offset;
      var0.offset = 1741769013 * var2;
      int var5 = (var3 - var2) / 8;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = method12015(var0, 1177811874);
         int var8 = method12015(var0, -214472290);
         int var9 = 0;
         int var10 = -1640531527;
         int var11 = 32;

         while (var11-- > 0) {
            var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var9 & 3] + var9;
            var9 += var10;
            var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
         }

         var0.offset -= 189951826;
         var0.writeInt(var7, 292038789);
         var0.writeInt(var8, -6564761);
      }

      var0.offset = var4 * 1328227997;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("cn")
   public void writeStringCp1252NullTerminated(String var1, int var2) {
      try {
         int var3 = var1.indexOf(0);
         if (var3 >= 0) {
            throw new IllegalArgumentException("");
         } else {
            this.offset = this.offset + class459.encodeStringCp1252(var1, 0, var1.length(), this.array, 2108391709 * this.offset, 1648591361) * 1741769013;
            this.array[(this.offset += 1741769013) * 2108391709 - 1] = 0;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "xa.cn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("le")
   public void method12135(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jo")
   public int method12059() {
      return this.array[this.offset * 2108391709] < 0 ? method12015(this, -670222356) & 2147483647 : method12008(this, (byte)5);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;IB)V")
   @ObfuscatedName("tp")
   public static void method11983(Buffer var0, int var1, byte var2) {
      if (var0 == null) {
         var0.writeVarInt(var1, var2);
      } else {
         try {
            if (var1 >= 0 && var1 < 128) {
               if (var2 > 0) {
                  var0.writeByte(var1, (short)-23477);
               }
            } else {
               if (var1 >= 0) {
                  if (var2 <= 0) {
                     return;
                  }

                  if (var1 < 32768) {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     var0.writeShort(32768 + var1, -1669094569);
                     return;
                  }
               }

               throw new IllegalArgumentException();
            }
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "xa.cf(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gu")
   public void method11936(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;[III)V")
   @ObfuscatedName("py")
   public static void method12089(Buffer var0, int[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.writeIntME(var2, var2);
      } else {
         int var4 = var0.offset * 2108391709;
         var0.offset = var2 * 1741769013;
         int var5 = (var3 - var2) / 8;

         for (int var6 = 0; var6 < var5; var6++) {
            int var7 = method12015(var0, 321110422);
            int var8 = method12015(var0, -1006839038);
            int var9 = -957401312;
            int var10 = -1640531527;
            int var11 = 32;

            while (var11-- > 0) {
               var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
               var9 -= var10;
               var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var9 & 3] + var9;
            }

            var0.offset -= 1049250216;
            var0.writeInt(var7, 782625839);
            var0.writeInt(var8, 1647328241);
         }

         var0.offset = 1741769013 * var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ct")
   public void writeShort(int var1, int var2) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.ct(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mw")
   public int method12163() {
      this.offset += 1424020516;
      int var1 = (this.array[2108391709 * this.offset - 2] - 128 & 0xFF) + ((this.array[this.offset * 2108391709 - 1] & -1788365067) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)Ljava/lang/String;")
   @ObfuscatedName("wf")
   public static String method12033(Buffer var0, int var1) {
      if (var0 == null) {
         var0.readStringCp1252NullTerminated(var1);
      }

      try {
         byte var2 = var0.array[(var0.offset += 1741769013) * 2108391709 - 1];
         if (0 != var2) {
            if (var1 >= 1800859672) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            int var3 = var0.readVarInt(1493126422);
            if (var0.offset * 2108391709 + var3 > var0.array.length) {
               if (var1 >= 1800859672) {
                  throw new IllegalStateException();
               } else {
                  throw new IllegalStateException("");
               }
            } else {
               String var4 = class228.method4854(var0.array, 2108391709 * var0.offset, var3, -1346356197);
               var0.offset += var3 * 1741769013;
               return var4;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "xa.dh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ky")
   public int method12097(int var1) {
      byte[] var3 = this.array;
      int var4 = 2108391709 * this.offset;
      int var5 = -1;

      for (int var6 = var1; var6 < var4; var6++) {
         var5 = var5 >>> 8 ^ field6477[(var5 ^ var3[var6]) & 0xFF];
      }

      var5 = ~var5;
      this.writeInt(var5, 577811445);
      return var5;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("me")
   public int method12180() {
      this.offset += 930339743;
      int var1 = ((this.array[this.offset * 2108391709 - 1] & 255) << 16)
         + ((this.array[this.offset * 2108391709 - 2] & 255) << 8)
         + (this.array[this.offset * 161266415 - 3] & 255);
      if (var1 > -1573889909) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;[BII)V")
   @ObfuscatedName("wy")
   public static void method12040(Buffer var0, byte[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.method12218(var1, var2, var2);
      } else {
         for (int var4 = var2; var4 < var3 + var2; var4++) {
            var1[var4] = var0.array[(var0.offset += 1741769013) * 2108391709 - 1];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cr")
   public int readUnsignedByte(int var1) {
      try {
         return this.array[(this.offset += 1741769013) * 2108391709 - 1] & 0xFF;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.cr(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dd")
   public int readMedium(int var1) {
      try {
         this.offset += 930339743;
         return (this.array[this.offset * 2108391709 - 1] & 0xFF)
            + ((this.array[this.offset * 2108391709 - 3] & 0xFF) << 16)
            + ((this.array[2108391709 * this.offset - 2] & 0xFF) << 8);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.dd(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hi")
   public void method11973(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.array[this.offset * 2108391709 - var1 - 4] = (byte)(var1 >> 24);
         this.array[this.offset * 2108391709 - var1 - 3] = (byte)(var1 >> 16);
         this.array[2108391709 * this.offset - var1 - 2] = (byte)(var1 >> 8);
         this.array[2108391709 * this.offset - var1 - 1] = (byte)var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lw")
   public int method12124() {
      return 128 - this.array[(this.offset += 1741769013) * 2108391709 - 1] & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("df")
   public float method12021(int var1) {
      try {
         return Float.intBitsToFloat(method12015(this, 765156138));
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.df(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;IS)V")
   @ObfuscatedName("od")
   public static void method12113(Buffer var0, int var1, short var2) {
      if (var0 == null) {
         var0.writeByteSub(var1, var2);
      } else {
         try {
            var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(128 - var1);
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "xa.es(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)I")
   @ObfuscatedName("cm")
   public static int method12012(Buffer var0) {
      if (var0 == null) {
         var0.method12035();
      }

      var0.offset += 930339743;
      return (var0.array[var0.offset * -1695107911 - 1] & 0xFF)
         + ((var0.array[var0.offset * 2108391709 - 3] & 0xFF) << 16)
         + ((var0.array[700182617 * var0.offset - 2] & -1644983826) << 8);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)I")
   @ObfuscatedName("rb")
   public static int method12015(Buffer var0, int var1) {
      if (var0 == null) {
         var0.readInt(var1);
      }

      try {
         var0.offset += -1622858540;
         return (var0.array[var0.offset * 2108391709 - 1] & 0xFF)
            + ((var0.array[2108391709 * var0.offset - 3] & 0xFF) << 16)
            + ((var0.array[var0.offset * 2108391709 - 4] & 0xFF) << 24)
            + ((var0.array[var0.offset * 2108391709 - 2] & 0xFF) << 8);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.dw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jb")
   public int method12066() {
      byte var1 = this.array[(this.offset += -1339066647) * 1388008445 - 1];

      int var2;
      for (var2 = 0; var1 < 0; var1 = this.array[(this.offset += 1741769013) * 559230104 - 1]) {
         var2 = (var2 | var1 & -1528677724) << 7;
      }

      return var2 | var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ig")
   public int method12016() {
      this.offset += -1622858540;
      return (this.array[this.offset * 2108391709 - 1] & 0xFF)
         + ((this.array[2108391709 * this.offset - 3] & 0xFF) << 16)
         + ((this.array[this.offset * 2108391709 - 4] & 0xFF) << 24)
         + ((this.array[this.offset * 2108391709 - 2] & 0xFF) << 8);
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("dt")
   public String readStringCp1252NullCircumfixed(int var1) {
      try {
         int var2 = this.offset * 2108391709;

         while (this.array[(this.offset += 1741769013) * 2108391709 - 1] != 0) {
            if (var1 == 160996041) {
               throw new IllegalStateException();
            }
         }

         int var3 = 2108391709 * this.offset - var2 - 1;
         if (var3 != 0) {
            return RouteStrategy.decodeStringCp1252(this.array, var2, var3, 1895064943);
         } else if (var1 == 160996041) {
            throw new IllegalStateException();
         } else {
            return "";
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "xa.db(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("dc")
   public String readStringCp1252NullTerminatedOrNull(int var1) {
      try {
         byte var2 = this.array[(this.offset += 1741769013) * 2108391709 - 1];
         if (var2 != 0) {
            if (var1 <= -1412272091) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            int var3 = 2108391709 * this.offset;

            while (this.array[(this.offset += 1741769013) * 2108391709 - 1] != 0) {
            }

            int var4 = 2108391709 * this.offset - var3 - 1;
            if (var4 == 0) {
               if (var1 <= -1412272091) {
                  throw new IllegalStateException();
               } else {
                  return "";
               }
            } else {
               return RouteStrategy.decodeStringCp1252(this.array, var3, var4, 1895064943);
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "xa.dt(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("ft")
   void method11917(int var1, boolean var2) {
      this.releaseArray((byte)-12);
      this.array = WorldEntityCoord.ByteArrayPool_getArrayBool(var1, var2, (byte)-6);
      this.offset = 0;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("di")
   public int readShortSmart(int var1) {
      try {
         int var2 = this.array[this.offset * 2108391709] & 255;
         if (var2 < 128) {
            if (var1 == -1781017119) {
               throw new IllegalStateException();
            } else {
               return this.readUnsignedByte(-1198645761) - 64;
            }
         } else {
            return method12008(this, (byte)5) - 49152;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.di(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dr")
   public int readShortSmartSub(int var1) {
      try {
         int var2 = this.array[2108391709 * this.offset] & 255;
         if (var2 < 128) {
            if (var1 <= -872963753) {
               throw new IllegalStateException();
            } else {
               return this.readUnsignedByte(38327145) - 1;
            }
         } else {
            return method12008(this, (byte)5) - 32769;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.dr(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("hk")
   public byte method12220() {
      return method12001(this, (byte)29);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fj")
   public void method11932(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dm")
   public int readVarInt(int var1) {
      try {
         byte var2 = this.array[(this.offset += 1741769013) * 2108391709 - 1];

         int var3;
         for (var3 = 0; var2 < 0; var2 = this.array[(this.offset += 1741769013) * 2108391709 - 1]) {
            if (var1 == 690382148) {
               throw new IllegalStateException();
            }

            var3 = (var3 | var2 & 127) << 7;
         }

         return var3 | var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "xa.dm(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("ax")
   public static void method12191(Buffer var0, int var1, int var2) {
      if (var0 == null) {
         var0.writeIntME(var1, var1);
      }

      try {
         var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
         var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
         var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
         var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.fp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dp")
   public int packBytesToInt(int var1) {
      try {
         int var3 = 0;
         byte var4 = 0;

         int var2;
         do {
            var2 = this.readUnsignedByte(1859328934);
            var3 |= (var2 & 127) << var4;
            var4 += 7;
         } while (var2 > 127);

         if (var1 >= 995141691) {
            throw new IllegalStateException();
         } else {
            return var3;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "xa.dp(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dg")
   public int method12075(int var1) {
      try {
         int var2 = this.packBytesToInt(88259189);
         return var2 >>> 1 ^ -(var2 & 1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.dg(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;[BII)V")
   @ObfuscatedName("ub")
   public static void method12041(Buffer var0, byte[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.method11936(var2);
      } else {
         for (int var4 = var2; var4 < var3 + var2; var4++) {
            var1[var4] = var0.array[(var0.offset += 1741769013) * 2108391709 - 1];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lf")
   public int method12155() {
      this.offset += -811429270;
      int var1 = ((this.array[669971723 * this.offset - 1] & -1956282119) << 8) + (this.array[this.offset * -2096243741 - 2] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("du")
   public int readNullableLargeSmart(int var1) {
      try {
         if (this.array[2108391709 * this.offset] < 0) {
            return method12015(this, 2061471492) & 2147483647;
         } else {
            int var2 = method12008(this, (byte)5);
            if (32767 == var2) {
               if (var1 >= 172659183) {
                  throw new IllegalStateException();
               } else {
                  return -1;
               }
            } else {
               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.du(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([IIIB)V")
   @ObfuscatedName("do")
   public void xteaEncrypt(int[] var1, int var2, int var3, byte var4) {
      try {
         int var5 = 2108391709 * this.offset;
         this.offset = 1741769013 * var2;
         int var6 = (var3 - var2) / 8;

         for (int var7 = 0; var7 < var6; var7++) {
            if (var4 != 73) {
               throw new IllegalStateException();
            }

            int var8 = method12015(this, -861814183);
            int var9 = method12015(this, 180680457);
            int var10 = 0;
            int var11 = -1640531527;
            int var12 = 32;

            while (var12-- > 0) {
               if (var4 != 73) {
                  throw new IllegalStateException();
               }

               var8 += var9 + (var9 << 4 ^ var9 >>> 5) ^ var1[var10 & 3] + var10;
               var10 += var11;
               var9 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
            }

            this.offset -= 1049250216;
            this.writeInt(var8, 385414688);
            this.writeInt(var9, 1721761984);
         }

         this.offset = var5 * 1741769013;
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "xa.do(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)Z")
   @ObfuscatedName("yz")
   public static boolean method12022(Buffer var0, int var1) {
      if (var0 == null) {
         return var0.readBoolean(var1);
      } else {
         try {
            boolean var10000;
            if ((var0.readUnsignedByte(-788066384) & 1) == 1) {
               if (var1 != 2004535120) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "xa.dy(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jm")
   public int method12068() {
      byte var1 = this.array[(this.offset += 1741769013) * 2108391709 - 1];

      int var2;
      for (var2 = 0; var1 < 0; var1 = this.array[(this.offset += 1741769013) * 2108391709 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cv")
   void method11989(int var1, int var2) {
      try {
         while (true) {
            if (var1 >= 0) {
               if (var2 <= -1793120611) {
                  throw new IllegalStateException();
               }

               if (var1 <= 127) {
                  this.writeByte(var1, (short)-14891);
                  return;
               }
            }

            this.writeByte(128 | var1 & 127, (short)-27443);
            var1 >>>= 7;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.cv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("eb")
   public int method12183(int var1) {
      try {
         this.offset += 930339743;
         int var2 = (this.array[2108391709 * this.offset - 2] & 255)
            + ((this.array[2108391709 * this.offset - 1] & 255) << 8)
            + ((this.array[this.offset * 2108391709 - 3] & 255) << 16);
         if (var2 > 8388607) {
            var2 -= 16777216;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.eb(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ea")
   public boolean checkCrc(int var1) {
      try {
         this.offset -= -1622858540;
         byte[] var3 = this.array;
         int var4 = this.offset * 2108391709;
         int var5 = -1;

         for (int var6 = 0; var6 < var4; var6++) {
            if (var1 >= -1757695766) {
               throw new IllegalStateException();
            }

            var5 = var5 >>> 8 ^ field6477[(var5 ^ var3[var6]) & 0xFF];
         }

         var5 = ~var5;
         int var9 = method12015(this, -956469490);
         if (var9 != var5) {
            return false;
         } else if (var1 >= -1757695766) {
            throw new IllegalStateException();
         } else {
            return true;
         }
      } catch (RuntimeException var7) {
         throw RestClientThreadFactory.newRunException(var7, "xa.ea(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
   @ObfuscatedName("dn")
   public void encryptRsa(BigInteger var1, BigInteger var2, byte var3) {
      try {
         int var4 = 2108391709 * this.offset;
         this.offset = 0;
         byte[] var5 = new byte[var4];
         this.readBytes(var5, 0, var4, (byte)-29);
         BigInteger var6 = new BigInteger(var5);
         BigInteger var7 = var6.modPow(var1, var2);
         byte[] var8 = var7.toByteArray();
         this.offset = 0;
         this.writeShort(var8.length, -2020974806);
         method11967(this, var8, 0, var8.length, -1187258379);
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "xa.dn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("eq")
   public void writeByteNeg(int var1, int var2) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(0 - var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.eq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("er")
   public int readUnsignedByteAdd(int var1) {
      try {
         return this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128 & 0xFF;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.er(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;IZ)V")
   @ObfuscatedName("vk")
   public static void method11918(Buffer var0, int var1, boolean var2) {
      if (var0 == null) {
         var0.method12108(var1, var1);
      } else {
         var0.releaseArray((byte)40);
         var0.array = WorldEntityCoord.ByteArrayPool_getArrayBool(var1, var2, (byte)-64);
         var0.offset = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ek")
   public int readUnsignedByteNeg(int var1) {
      try {
         return 0 - this.array[(this.offset += 1741769013) * 2108391709 - 1] & 0xFF;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.ek(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("cu")
   public static void method11990(Buffer var0, int var1) {
      if (var0 == null) {
         var0.readShortSmart(var1);
      }

      while (var1 < 0 || var1 > -1679038431) {
         var0.writeByte(128 | var1 & -1985447527, (short)-3232);
         var1 >>>= 7;
      }

      var0.writeByte(var1, (short)-16449);
   }

   @ObfuscatedSignature(descriptor = "(B)B")
   @ObfuscatedName("ej")
   public byte readByteAdd(byte var1) {
      try {
         return (byte)(this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.ej(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)B")
   @ObfuscatedName("ew")
   public byte readByteNeg(int var1) {
      try {
         return (byte)(0 - this.array[(this.offset += 1741769013) * 2108391709 - 1]);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.ew(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)B")
   @ObfuscatedName("em")
   public byte readByteSub(int var1) {
      try {
         return (byte)(128 - this.array[(this.offset += 1741769013) * 2108391709 - 1]);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.em(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("eg")
   public void writeShortLE(int var1, int var2) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.eg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("el")
   public void writeShortAddLE(int var1, int var2) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(128 + var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.el(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ep")
   public void writeShortAdd(int var1, int var2) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 + 128);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.ep(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([IS)V")
   @ObfuscatedName("ds")
   public void xteaEncryptAll(int[] var1, short var2) {
      try {
         int var3 = 2108391709 * this.offset / 8;
         this.offset = 0;

         for (int var4 = 0; var4 < var3; var4++) {
            if (var2 <= 13056) {
               throw new IllegalStateException();
            }

            int var5 = method12015(this, 1185292887);
            int var6 = method12015(this, -918822391);
            int var7 = 0;
            int var8 = -1640531527;
            int var9 = 32;

            while (var9-- > 0) {
               if (var2 <= 13056) {
                  throw new IllegalStateException();
               }

               var5 += (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3];
               var7 += var8;
               var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7;
            }

            this.offset -= 1049250216;
            this.writeInt(var5, 1224328099);
            this.writeInt(var6, 864125700);
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "xa.ds(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("zn")
   public int method12221() {
      return this.readUnsignedByte(-11030725);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ex")
   public int readUnsignedShortAdd(int var1) {
      try {
         this.offset += -811429270;
         return ((this.array[this.offset * 2108391709 - 2] & 0xFF) << 8) + (this.array[2108391709 * this.offset - 1] - 128 & 0xFF);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.ex(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ez")
   public void method11977(int var1, byte var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            if (var1 <= 65535) {
               this.array[this.offset * 2108391709 - var1 - 2] = (byte)(var1 >> 8);
               this.array[2108391709 * this.offset - var1 - 1] = (byte)var1;
               return;
            }

            if (var2 <= 1) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException();
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.cz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ey")
   public int readSignedShort(int var1) {
      try {
         this.offset += -811429270;
         int var2 = ((this.array[2108391709 * this.offset - 2] & 255) << 8) + (this.array[2108391709 * this.offset - 1] - 128 & 0xFF);
         if (var2 > 32767) {
            if (var1 == 1459961457) {
               throw new IllegalStateException();
            }

            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.ey(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("sh")
   public int method12222() {
      return method12056(this, -496650014);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ev")
   public int method12164(byte var1) {
      try {
         this.offset += -811429270;
         int var2 = (this.array[2108391709 * this.offset - 2] - 128 & 0xFF) + ((this.array[this.offset * 2108391709 - 1] & 255) << 8);
         if (var2 > 32767) {
            if (var1 == 3) {
               throw new IllegalStateException();
            }

            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.ev(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("cf")
   public void writeSmartByteShort(int var1, byte var2) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.ez(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("eh")
   public int method12170(byte var1) {
      try {
         this.offset += 930339743;
         return (this.array[this.offset * 2108391709 - 3] & 0xFF)
            + ((this.array[2108391709 * this.offset - 2] & 0xFF) << 8)
            + ((this.array[2108391709 * this.offset - 1] & 0xFF) << 16);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.eh(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("eo")
   public int method12174(byte var1) {
      try {
         this.offset += 930339743;
         return ((this.array[this.offset * 2108391709 - 3] & 0xFF) << 16)
            + ((this.array[this.offset * 2108391709 - 1] & 0xFF) << 8)
            + (this.array[2108391709 * this.offset - 2] & 0xFF);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.eo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("en")
   public int method12181(int var1) {
      try {
         this.offset += 930339743;
         int var2 = ((this.array[this.offset * 2108391709 - 1] & 255) << 16)
            + ((this.array[this.offset * 2108391709 - 2] & 255) << 8)
            + (this.array[this.offset * 2108391709 - 3] & 255);
         if (var2 > 8388607) {
            var2 -= 16777216;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.en(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jv")
   public int method12069() {
      byte var1 = this.array[(this.offset += 1741769013) * 1656336417 - 1];

      int var2;
      for (var2 = 0; var1 < 0; var1 = this.array[(this.offset += -1481511124) * 2108391709 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("vd")
   public int method12223() {
      return this.offset * 2108391709;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ef")
   public int readUnsignedByteSub(byte var1) {
      try {
         return 128 - this.array[(this.offset += 1741769013) * 2108391709 - 1] & 0xFF;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.ef(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIB)V")
   @ObfuscatedName("fi")
   public void method12209(byte[] var1, int var2, int var3, byte var4) {
      try {
         for (int var5 = var2; var5 < var2 + var3; var5++) {
            var1[var5] = (byte)(this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "xa.fi(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("bn")
   public void method12224(byte[] var1, int var2, int var3) {
      this.readBytes(var1, var2, var3, (byte)66);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)I")
   @ObfuscatedName("wt")
   public static int method12003(Buffer var0) {
      if (var0 == null) {
         return var0.method12046();
      } else {
         var0.offset += -811429270;
         return (var0.array[var0.offset * 2108391709 - 1] & 0xFF) + ((var0.array[2108391709 * var0.offset - 2] & 0xFF) << 8);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIB)V")
   @ObfuscatedName("fs")
   public void method12206(byte[] var1, int var2, int var3, byte var4) {
      try {
         for (int var5 = var2 + var3 - 1; var5 >= var2; var5--) {
            if (var4 >= 47) {
               throw new IllegalStateException();
            }

            var1[var5] = this.array[(this.offset += 1741769013) * 2108391709 - 1];
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "xa.fs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fr")
   public void method11937(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      this.array[(this.offset += -1817805950) * 2108391709 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += -83028761) * -411219228 - 1] = (byte)var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("oj")
   public static void method11991(Buffer var0, int var1) {
      if (var0 == null) {
         var0.method11998();
      }

      while (var1 < 0 || var1 > 127) {
         var0.writeByte(128 | var1 & 127, (short)-1270);
         var1 >>>= 7;
      }

      var0.writeByte(var1, (short)-14549);
   }

   @ObfuscatedSignature(descriptor = "([BIII)V")
   @ObfuscatedName("cg")
   public void writeBytes(byte[] var1, int var2, int var3, int var4) {
      try {
         for (int var5 = var3 + var2 - 1; var5 >= var2; var5--) {
            if (var4 != 1425102174) {
               return;
            }

            var1[var5] = (byte)(this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "xa.fg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("mz")
   public void method12195(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   void vmethod448() {
      if (this.array != null) {
         class372.ByteArrayPool_release(this.array, (byte)-65);
      }

      this.array = null;
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("nb")
   public void method12207(byte[] var1, int var2, int var3) {
      for (int var4 = var2 + var3 - 1; var4 >= var2; var4--) {
         var1[var4] = this.array[(this.offset += 1513544638) * -1373652910 - 1];
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bb")
   public void method12225(int var1) {
      this.writeInt(var1, 707622539);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   void vmethod449() {
      if (this.array != null) {
         class372.ByteArrayPool_release(this.array, (byte)-107);
      }

      this.array = null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("rh")
   public int method12226() {
      return method12015(this, -907484938);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dq")
   public int readLargeSmart(int var1) {
      try {
         if (this.array[this.offset * 2108391709] < 0) {
            if (var1 >= -525814551) {
               throw new IllegalStateException();
            } else {
               return method12015(this, 1311095492) & 2147483647;
            }
         } else {
            return method12008(this, (byte)5);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.dq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mh")
   public int method12184() {
      this.offset += -633658384;
      int var1 = (this.array[1996191676 * this.offset - 2] & 107392623)
         + ((this.array[1133973825 * this.offset - 1] & 255) << 8)
         + ((this.array[this.offset * -876315993 - 3] & 2011960650) << 16);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BI)I")
   @ObfuscatedName("fz")
   public static int method11921(byte[] var0, int var1) {
      int var3 = -1;

      for (int var4 = 0; var4 < var1; var4++) {
         var3 = var3 >>> 8 ^ field6477[(var3 ^ var0[var4]) & -487489527];
      }

      return ~var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BI)I")
   @ObfuscatedName("fk")
   public static int method11922(byte[] var0, int var1) {
      int var3 = -1;

      for (int var4 = 0; var4 < var1; var4++) {
         var3 = var3 >>> 8 ^ field6477[(var3 ^ var0[var4]) & 0xFF];
      }

      return ~var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("fe")
   public static int method11924(String var0) {
      return var0.length() + 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)I")
   @ObfuscatedName("js")
   public static int method12052(Buffer var0) {
      int var1 = var0.array[2108391709 * var0.offset] & 255;
      return var1 < 128 ? var0.readUnsignedByte(-924270389) - 1 : method12008(var0, (byte)5) - 32769;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("fw")
   public static int method11925(String var0) {
      return var0.length() + 2;
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ec")
   public int writeCrc(int var1, int var2) {
      try {
         byte[] var4 = this.array;
         int var5 = 2108391709 * this.offset;
         int var6 = -1;

         for (int var7 = var1; var7 < var5; var7++) {
            if (var2 != -1693282382) {
               throw new IllegalStateException();
            }

            var6 = var6 >>> 8 ^ field6477[(var6 ^ var4[var7]) & 0xFF];
         }

         var6 = ~var6;
         this.writeInt(var6, 2070952657);
         return var6;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "xa.ec(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;[BII)V")
   @ObfuscatedName("hm")
   public static void method12210(Buffer var0, byte[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.method12097(var2);
      }

      for (int var4 = var2; var4 < var2 + var3; var4++) {
         var1[var4] = (byte)(var0.array[(var0.offset += 1741769013) * 2108391709 - 1] - 128);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)I")
   @ObfuscatedName("mf")
   public static int method12013(Buffer var0) {
      if (var0 == null) {
         var0.method12070();
      }

      var0.offset += 930339743;
      return (var0.array[var0.offset * 110142881 - 1] & 1758694908)
         + ((var0.array[var0.offset * -2143933998 - 3] & 1406868748) << 16)
         + ((var0.array[2108391709 * var0.offset - 2] & 0xFF) << 8);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fu")
   public void method11928(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;Ljava/lang/String;)V")
   @ObfuscatedName("cq")
   public static void method11958(Buffer var0, String var1) {
      if (var0 == null) {
         var0.method12177();
      }

      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         var0.array[(var0.offset += 1741769013) * 838624742 - 1] = 0;
         var0.offset = var0.offset + class459.encodeStringCp1252(var1, 0, var1.length(), var0.array, 2108391709 * var0.offset, 233188438) * 1741769013;
         var0.array[(var0.offset += 1741769013) * -1089366648 - 1] = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fv")
   public void method11929(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)I")
   @ObfuscatedName("sa")
   public static int method11995(Buffer var0) {
      return var0 == null ? var0.method11998() : var0.array[(var0.offset += 1741769013) * -544304457 - 1] & 150682100;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gb")
   public void method11953(boolean var1) {
      this.writeByte(var1 ? 1 : 0, (short)-31493);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("fy")
   public static int method11926(String var0) {
      return var0.length() + 2;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ki")
   public int method12118() {
      return this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128 & 0xFF;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;[I)V")
   @ObfuscatedName("da")
   public static void method12078(Buffer var0, int[] var1) {
      int var2 = -1582856000 * var0.offset / 8;
      var0.offset = 0;

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = method12015(var0, 1327718112);
         int var5 = method12015(var0, 1121529734);
         int var6 = 0;
         int var7 = -1640531527;
         int var8 = -453391561;

         while (var8-- > 0) {
            var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var6 + var1[var6 & 3];
            var6 += var7;
            var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
         }

         var0.offset -= 1049250216;
         var0.writeInt(var4, 402667071);
         var0.writeInt(var5, 1714222905);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)J")
   @ObfuscatedName("oo")
   public static long method12018(Buffer var0, int var1) {
      if (var0 == null) {
         var0.readLong(var1);
      }

      try {
         long var2 = method12015(var0, -271104735) & 4294967295L;
         long var4 = method12015(var0, 1047481720) & 4294967295L;
         return var4 + (var2 << 32);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "xa.dv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ng")
   public void method12211(byte[] var1, int var2, int var3) {
      for (int var4 = var2; var4 < var2 + var3; var4++) {
         var1[var4] = (byte)(this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jp")
   public int method12053() {
      int var1 = this.array[805015301 * this.offset] & -691900004;
      return var1 < 128 ? this.readUnsignedByte(478977979) - 1 : method12008(this, (byte)5) - 32769;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gf")
   public void method11941(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gd")
   public void method11942(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      this.array[(this.offset += 1267210141) * -1101415744 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1741769013) * -581199940 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ga")
   public void method11945(long var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 40);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 32);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("go")
   public void method11946(long var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 40);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 32);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)I")
   @ObfuscatedName("lr")
   public static int method12047(Buffer var0) {
      int var1 = var0.array[var0.offset * 2108391709] & 255;
      return var1 < 128 ? var0.readUnsignedByte(-322294935) : method12008(var0, (byte)5) - 32768;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("sy")
   public static void method11992(Buffer var0, int var1, int var2) {
      if (var0 == null) {
         var0.method12108(var1, var1);
      }

      try {
         var1 = var1 << 1 ^ var1 >> 31;
         var0.method11989(var1, -726685052);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.cw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("gy")
   public void method11947(long var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 40);
      this.array[(this.offset += 1269843297) * 1284486103 - 1] = (byte)(var1 >> 32);
      this.array[(this.offset += 1741769013) * -2068990845 - 1] = (byte)(var1 >> 24);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1266854702) * 2108391709 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("fb")
   public void writeIntIME(int var1, int var2) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.fb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hl")
   public int method11996() {
      return this.array[(this.offset += 1741769013) * 1952126304 - 1] & 753341685;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gt")
   public void method11954(boolean var1) {
      this.writeByte(var1 ? 1 : 0, (short)-15934);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)I")
   @ObfuscatedName("ao")
   public static int method12099(Buffer var0, int var1) {
      if (var0 == null) {
         var0.method11978(var1);
      }

      byte[] var3 = var0.array;
      int var4 = 548992083 * var0.offset;
      int var5 = -1;

      for (int var6 = var1; var6 < var4; var6++) {
         var5 = var5 >>> 8 ^ field6477[(var5 ^ var3[var6]) & 0xFF];
      }

      var5 = ~var5;
      var0.writeInt(var5, 930429634);
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gw")
   public void method11955(boolean var1) {
      this.writeByte(var1 ? 1 : 0, (short)-146);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)I")
   @ObfuscatedName("gx")
   public static int method12056(Buffer var0, int var1) {
      if (var0 == null) {
         var0.readIncrSmallSmart(var1);
      }

      try {
         short var2 = 0;

         int var3;
         for (var3 = method12050(var0, 812914525); var3 == 32767; var3 = method12050(var0, -1844396026)) {
            if (var1 >= 1787833001) {
               throw new IllegalStateException();
            }

            var2 += 32767;
         }

         return var2 + var3;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "xa.dx(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("it")
   public boolean method12023() {
      return (this.readUnsignedByte(682012705) & 1) == 1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("gz")
   public void method11957(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.offset = this.offset + class459.encodeStringCp1252(var1, 0, var1.length(), this.array, 2108391709 * this.offset, 2123506950) * 1741769013;
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("gh")
   public void method11959(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.array[(this.offset += 571358454) * -728105949 - 1] = 0;
         this.offset = this.offset + class459.encodeStringCp1252(var1, 0, var1.length(), this.array, -1368950664 * this.offset, -526132089) * 1668990749;
         this.array[(this.offset += 1741769013) * 130073758 - 1] = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)V")
   @ObfuscatedName("gp")
   public void method11961(CharSequence var1) {
      int var2 = class498.method10640(var1, (byte)95);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = 0;
      method11986(this, var2, (byte)-3);
      this.offset = this.offset + class431.method9198(this.array, 2108391709 * this.offset, var1, -2105735243) * 1741769013;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)V")
   @ObfuscatedName("gx")
   public void method11962(CharSequence var1) {
      int var2 = class498.method10640(var1, (byte)84);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = 0;
      method11986(this, var2, (byte)-24);
      this.offset = this.offset + class431.method9198(this.array, 2108391709 * this.offset, var1, -2016351049) * 1741769013;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)V")
   @ObfuscatedName("gl")
   public void method11963(CharSequence var1) {
      int var2 = class498.method10640(var1, (byte)80);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = 0;
      method11986(this, var2, (byte)-72);
      this.offset = this.offset + class431.method9198(this.array, 2108391709 * this.offset, var1, -2026053710) * 1741769013;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Lxa;I)V")
   @ObfuscatedName("ba")
   public static void method11969(Buffer var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.writeBuffer(var0, var2);
      } else {
         try {
            method11967(var0, var1.array, 0, var1.offset * 2108391709, -1187258379);
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "xa.cp(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)V")
   @ObfuscatedName("ge")
   public void method11964(CharSequence var1) {
      int var2 = class498.method10640(var1, (byte)126);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = 0;
      method11986(this, var2, (byte)36);
      this.offset = this.offset + class431.method9198(this.array, 2108391709 * this.offset, var1, -2133206775) * 1741769013;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("gi")
   public void method11970(Buffer var1) {
      method11967(this, var1.array, 0, var1.offset * 861018357, -1187258379);
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("qm")
   public float method12227() {
      return this.method12021(148945505);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("iv")
   public String method12029() {
      int var1 = this.offset * 2108391709;

      while (this.array[(this.offset += 1741769013) * 2108391709 - 1] != 0) {
      }

      int var2 = 2108391709 * this.offset - var1 - 1;
      return var2 == 0 ? "" : RouteStrategy.decodeStringCp1252(this.array, var1, var2, 1895064943);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;[BII)V")
   @ObfuscatedName("oz")
   public static void method12042(Buffer var0, byte[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.method12124();
      }

      for (int var4 = var2; var4 < var3 + var2; var4++) {
         var1[var4] = var0.array[(var0.offset += 1741769013) * 2108391709 - 1];
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("cc")
   public void writeLong(long var1) {
      this.array[(this.offset += -1031914542) * -1388133367 - 1] = (byte)(var1 >> 40);
      this.array[(this.offset += 1741769013) * 900715397 - 1] = (byte)(var1 >> 32);
      this.array[(this.offset += 1051115594) * 2108391709 - 1] = (byte)(var1 >> 24);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      this.array[(this.offset += -1257465337) * 1650426645 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;[III)V")
   @ObfuscatedName("kw")
   public static void method12085(Buffer var0, int[] var1, int var2, int var3) {
      int var4 = 2108391709 * var0.offset;
      var0.offset = 1741769013 * var2;
      int var5 = (var3 - var2) / 8;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = method12015(var0, 1403114208);
         int var8 = method12015(var0, 4659087);
         int var9 = 0;
         int var10 = -1640531527;
         int var11 = 32;

         while (var11-- > 0) {
            var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var9 & 3] + var9;
            var9 += var10;
            var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
         }

         var0.offset -= 1049250216;
         var0.writeInt(var7, 1817983874);
         var0.writeInt(var8, 1540216563);
      }

      var0.offset = var4 * 1741769013;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hg")
   public void method11978(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.array[this.offset * -1096751901 - var1 - 2] = (byte)(var1 >> 8);
         this.array[1703252027 * this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hy")
   public void method11979(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.array[-817504019 * this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ci")
   public void writeLengthByte(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= 479456896) {
               throw new IllegalStateException();
            }

            if (var1 <= 255) {
               this.array[2108391709 * this.offset - var1 - 1] = (byte)var1;
               return;
            }

            if (var2 <= 479456896) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException();
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.ci(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hq")
   public void method11985(int var1) {
      if ((var1 & -128) != 0) {
         if (0 != (var1 & -16384)) {
            if ((var1 & -2097152) != 0) {
               if ((var1 & -268435456) != 0) {
                  this.writeByte(var1 >>> 28 | 128, (short)-22138);
               }

               this.writeByte(var1 >>> 21 | 128, (short)-21257);
            }

            this.writeByte(var1 >>> 14 | 128, (short)-24632);
         }

         this.writeByte(var1 >>> 7 | 128, (short)-10089);
      }

      this.writeByte(var1 & 127, (short)-29015);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fm")
   public void method11933(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1645913790) * 2108391709 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("iz")
   public String method12034() {
      byte var1 = this.array[(this.offset += 1741769013) * 2108391709 - 1];
      if (0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.readVarInt(2077983340);
         if (this.offset * 2108391709 + var2 > this.array.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = class228.method4854(this.array, 2108391709 * this.offset, var2, 816953446);
            this.offset += var2 * 1741769013;
            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mk")
   public int method12171() {
      this.offset += 930339743;
      return (this.array[this.offset * 503187823 - 3] & -666741944)
         + ((this.array[2108391709 * this.offset - 2] & 0xFF) << 8)
         + ((this.array[-1711897692 * this.offset - 1] & 2055939837) << 16);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ha")
   public int method11997() {
      return this.array[(this.offset += 1741769013) * -1504139213 - 1] & -1636998980;
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("hu")
   public byte method11999() {
      return this.array[(this.offset += 1741769013) * 2108391709 - 1];
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("ht")
   public byte method12000() {
      return this.array[(this.offset += 1741769013) * 845104371 - 1];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hk")
   public int method12004() {
      this.offset += -811429270;
      return (this.array[this.offset * 2108391709 - 1] & -1285958137) + ((this.array[2108391709 * this.offset - 2] & 0xFF) << 8);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ho")
   public int method12005() {
      this.offset += -811429270;
      return (this.array[this.offset * -135076387 - 1] & 1885690129) + ((this.array[2108391709 * this.offset - 2] & 2105351573) << 8);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hs")
   public int method12006() {
      this.offset += -811429270;
      return (this.array[this.offset * 2108391709 - 1] & 0xFF) + ((this.array[2108391709 * this.offset - 2] & 0xFF) << 8);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gn")
   public void method11938(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)I")
   @ObfuscatedName("is")
   public static int method12178(Buffer var0, int var1) {
      if (var0 == null) {
         var0.method12071(var1);
      }

      try {
         var0.offset += 930339743;
         return (var0.array[var0.offset * 2108391709 - 1] & 0xFF)
            + ((var0.array[var0.offset * 2108391709 - 2] & 0xFF) << 16)
            + ((var0.array[var0.offset * 2108391709 - 3] & 0xFF) << 8);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.ed(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jx")
   public int method12064() {
      if (this.array[-889503745 * this.offset] < 0) {
         return method12015(this, 1104232078) & 2147483647;
      } else {
         int var1 = method12008(this, (byte)5);
         return 32767 == var1 ? -1 : var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ge")
   public static void method12192(Buffer var0, int var1) {
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("zw")
   public static void method12187(Buffer var0, int var1, int var2) {
      if (var0 == null) {
         var0.writeIntLE(var1, var1);
      } else {
         try {
            var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
            var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
            var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
            var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "xa.ff(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("fo")
   public static int method11923(String var0) {
      return var0.length() + 1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("kf")
   public void method12114(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(128 - var1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ii")
   public int method12017() {
      this.offset += 112862507;
      return (this.array[this.offset * 2108391709 - 1] & -2141286644)
         + ((this.array[-881723276 * this.offset - 3] & -429782441) << 16)
         + ((this.array[this.offset * 2108391709 - 4] & 1871749462) << 24)
         + ((this.array[this.offset * -1004389138 - 2] & 0xFF) << 8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("gg")
   public static void method11939(Buffer var0, int var1) {
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("et")
   public int readUnsignedShortLE(byte var1) {
      try {
         this.offset += -811429270;
         return (this.array[this.offset * 2108391709 - 2] & 0xFF) + ((this.array[this.offset * 2108391709 - 1] & 0xFF) << 8);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.et(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("uf")
   public void method12228(int var1) {
      this.writeByte(var1, (short)-15420);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ip")
   public boolean method12024() {
      return (this.readUnsignedByte(1332811995) & 1) == 1;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("jz")
   public void method12090(int[] var1, int var2, int var3) {
      int var4 = this.offset * 2108391709;
      this.offset = var2 * 1741769013;
      int var5 = (var3 - var2) / 8;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = method12015(this, 1774158427);
         int var8 = method12015(this, 808326692);
         int var9 = -957401312;
         int var10 = -1640531527;
         int var11 = 32;

         while (var11-- > 0) {
            var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
            var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var9 & 3] + var9;
         }

         this.offset -= 1049250216;
         this.writeInt(var7, 527476846);
         this.writeInt(var8, 368235040);
      }

      this.offset = 1741769013 * var4;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("iq")
   public String method12026() {
      if (this.array[2108391709 * this.offset] == 0) {
         this.offset += 1741769013;
         return null;
      } else {
         return this.readStringCp1252NullCircumfixed(2146137633);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lc")
   public void method12137(int var1) {
      this.array[(this.offset += -339124550) * 59594741 - 1] = (byte)var1;
      this.array[(this.offset += -1969909854) * 2108391709 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("kt")
   public void method12110(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(0 - var1);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("is")
   public String method12032() {
      byte var1 = this.array[(this.offset += 1741769013) * 2108391709 - 1];
      if (var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = 707077473 * this.offset;

         while (this.array[(this.offset += 801964950) * 2108391709 - 1] != 0) {
         }

         int var3 = -79689309 * this.offset - var2 - 1;
         return var3 == 0 ? "" : RouteStrategy.decodeStringCp1252(this.array, var2, var3, 1895064943);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   void vmethod450() {
      if (this.array != null) {
         class372.ByteArrayPool_release(this.array, (byte)-68);
      }

      this.array = null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("id")
   public String method12035() {
      byte var1 = this.array[(this.offset += 1741769013) * 2108391709 - 1];
      if (0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.readVarInt(2067993490);
         if (this.offset * 2108391709 + var2 > this.array.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = class228.method4854(this.array, 2108391709 * this.offset, var2, 1170809362);
            this.offset += var2 * 1741769013;
            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ir")
   public String method12036() {
      byte var1 = this.array[(this.offset += 1741769013) * 2108391709 - 1];
      if (0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.readVarInt(-1179654355);
         if (this.offset * 2108391709 + var2 > this.array.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = class228.method4854(this.array, 2108391709 * this.offset, var2, 926206034);
            this.offset += var2 * 1741769013;
            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("cl")
   public int readShort(byte var1) {
      try {
         this.offset += -811429270;
         int var2 = ((this.array[2108391709 * this.offset - 2] & 255) << 8) + (this.array[2108391709 * this.offset - 1] & 255);
         if (var2 > 32767) {
            if (var1 >= 3) {
               throw new IllegalStateException();
            }

            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.cl(" + 41);
      }
   }

   public Buffer(byte[] var1) {
      this.array = var1;
      this.offset = 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ia")
   public int method12045() {
      int var1 = this.array[this.offset * -1475045732] & -801029900;
      return var1 < 1700373835 ? this.readUnsignedByte(-262143563) - 64 : method12008(this, (byte)5) - 49152;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ei")
   public int readUnsignedShortAddLE(int var1) {
      try {
         this.offset += -811429270;
         return ((this.array[this.offset * 2108391709 - 1] & 0xFF) << 8) + (this.array[2108391709 * this.offset - 2] - 128 & 0xFF);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.ei(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ih")
   public int method12048() {
      int var1 = this.array[this.offset * 2108391709] & 255;
      return var1 < 128 ? this.readUnsignedByte(1093514698) : method12008(this, (byte)5) - 32768;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)Ljava/lang/String;")
   @ObfuscatedName("ny")
   public static String method12037(Buffer var0) {
      byte var1 = var0.array[(var0.offset += 1741769013) * 2108391709 - 1];
      if (0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = var0.readVarInt(1474470014);
         if (var0.offset * 2108391709 + var2 > var0.array.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = class228.method4854(var0.array, 2108391709 * var0.offset, var2, 304451040);
            var0.offset += var2 * 1741769013;
            return var3;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;J)V")
   @ObfuscatedName("os")
   public static void method11950(Buffer var0, long var1) {
      if (var0 == null) {
         var0.method12154();
      }

      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 56);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 48);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 40);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 32);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("il")
   public int method12054() {
      int var1 = this.array[2016050414 * this.offset] & 255;
      return var1 < 128 ? this.readUnsignedByte(1838441988) - 1 : method12008(this, (byte)5) - 32769;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jj")
   public int method12055() {
      int var1 = this.array[2108391709 * this.offset] & 255;
      return var1 < 128 ? this.readUnsignedByte(9832648) - 1 : method12008(this, (byte)5) - 32769;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("co")
   public void writeStringCp1252NullCircumfixed(String var1, int var2) {
      try {
         int var3 = var1.indexOf(0);
         if (var3 >= 0) {
            if (var2 == 2046082977) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException("");
            }
         } else {
            this.array[(this.offset += 1741769013) * 2108391709 - 1] = 0;
            this.offset = this.offset + class459.encodeStringCp1252(var1, 0, var1.length(), this.array, 2108391709 * this.offset, 1931836748) * 1741769013;
            this.array[(this.offset += 1741769013) * 2108391709 - 1] = 0;
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "xa.co(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)I")
   @ObfuscatedName("qs")
   public static int method12156(Buffer var0) {
      if (var0 == null) {
         return var0.method11996();
      } else {
         var0.offset += -811429270;
         int var1 = ((var0.array[2108391709 * var0.offset - 1] & 147139792) << 8) + (var0.array[var0.offset * -724727634 - 2] & 255);
         if (var1 > 385583858) {
            var1 -= 65536;
         }

         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jk")
   public int method12057() {
      short var1 = 0;

      int var2;
      for (var2 = method12050(this, 207981982); var2 == 32767; var2 = method12050(this, 1626163982)) {
         var1 += 32767;
      }

      return var1 + var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)I")
   @ObfuscatedName("dg")
   public static int method12014(Buffer var0) {
      if (var0 == null) {
         var0.method12105();
      }

      var0.offset += 930339743;
      return (var0.array[var0.offset * 2108391709 - 1] & 0xFF)
         + ((var0.array[var0.offset * 2108391709 - 3] & 0xFF) << 16)
         + ((var0.array[2108391709 * var0.offset - 2] & 0xFF) << 8);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)B")
   @ObfuscatedName("ir")
   public static byte method12001(Buffer var0, byte var1) {
      if (var0 == null) {
         return var0.readByte(var1);
      } else {
         try {
            return var0.array[(var0.offset += 1741769013) * 2108391709 - 1];
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "xa.cj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jd")
   public int method12061() {
      return this.array[this.offset * 2108391709] < 0 ? method12015(this, 767495491) & 371319944 : method12008(this, (byte)5);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   public void method12229(int var1) {
      this.offset = var1 * 1741769013;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ee")
   public void writeByteAdd(int var1, int var2) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 + 128);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.ee(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("gc")
   public void method11971(Buffer var1) {
      method11967(this, var1.array, 0, var1.offset * 2108391709, -1187258379);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jn")
   public int method12065() {
      if (this.array[730504538 * this.offset] < 0) {
         return method12015(this, 1957583216) & 2147483647;
      } else {
         int var1 = method12008(this, (byte)5);
         return -1217334046 == var1 ? -1 : var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("dh")
   public String readCESU8(int var1) {
      try {
         if (this.array[2108391709 * this.offset] == 0) {
            this.offset += 1741769013;
            return null;
         } else {
            return this.readStringCp1252NullCircumfixed(-1200448169);
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.dc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIB)V")
   @ObfuscatedName("dz")
   public void readBytes(byte[] var1, int var2, int var3, byte var4) {
      try {
         for (int var5 = var2; var5 < var3 + var2; var5++) {
            if (var4 == -1) {
               return;
            }

            var1[var5] = this.array[(this.offset += 1741769013) * 2108391709 - 1];
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "xa.dz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("fl")
   public int readUnsignedIntIME(int var1) {
      try {
         this.offset += -1622858540;
         return (this.array[2108391709 * this.offset - 3] & 0xFF)
            + ((this.array[this.offset * 2108391709 - 2] & 0xFF) << 24)
            + ((this.array[2108391709 * this.offset - 1] & 0xFF) << 16)
            + ((this.array[this.offset * 2108391709 - 4] & 0xFF) << 8);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.fl(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ju")
   public int method12073() {
      int var2 = 0;
      byte var3 = 0;

      int var1;
      do {
         var1 = this.readUnsignedByte(-110200188);
         var2 |= (var1 & 127) << var3;
         var3 += 7;
      } while (var1 > 127);

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)I")
   @ObfuscatedName("fu")
   public static int method12172(Buffer var0) {
      if (var0 == null) {
         var0.method12057();
      }

      var0.offset += 274433998;
      return (var0.array[var0.offset * -1040705702 - 3] & 0xFF)
         + ((var0.array[624014092 * var0.offset - 2] & 0xFF) << 8)
         + ((var0.array[2108391709 * var0.offset - 1] & -35895298) << 16);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jw")
   public int method12074() {
      int var2 = 0;
      byte var3 = 0;

      int var1;
      do {
         var1 = this.readUnsignedByte(-1220755967);
         var2 |= (var1 & -832929322) << var3;
         var3 += 7;
      } while (var1 > -1329140569);

      return var2;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("js")
   public int method12076() {
      int var1 = this.packBytesToInt(-335385562);
      return var1 >>> 1 ^ -(var1 & 1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("in")
   public int method12046() {
      int var1 = this.array[this.offset * 2108391709] & 255;
      return var1 < 128 ? this.readUnsignedByte(1817470016) - 64 : method12008(this, (byte)5) - 49152;
   }

   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("jr")
   public void method12079(int[] var1) {
      int var2 = 2108391709 * this.offset / 8;
      this.offset = 0;

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = method12015(this, -253564654);
         int var5 = method12015(this, 1779375665);
         int var6 = 0;
         int var7 = -1640531527;
         int var8 = 32;

         while (var8-- > 0) {
            var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var6 + var1[var6 & 3];
            var6 += var7;
            var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
         }

         this.offset -= 1049250216;
         this.writeInt(var4, 1007163320);
         this.writeInt(var5, 877531651);
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("kj")
   public void method12091(int[] var1, int var2, int var3) {
      int var4 = this.offset * 1805890399;
      this.offset = var2 * 1741769013;
      int var5 = (var3 - var2) / 8;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = method12015(this, 588613950);
         int var8 = method12015(this, -38415539);
         int var9 = -1432682373;
         int var10 = -1640531527;
         int var11 = -1282294690;

         while (var11-- > 0) {
            var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
            var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var9 & 3] + var9;
         }

         this.offset -= 1049250216;
         this.writeInt(var7, 400320652);
         this.writeInt(var8, 1764640719);
      }

      this.offset = 1117849409 * var4;
   }

   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("jg")
   public void method12080(int[] var1) {
      int var2 = 19774438 * this.offset / 8;
      this.offset = 0;

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = method12015(this, 262895394);
         int var5 = method12015(this, 1992954561);
         int var6 = 0;
         int var7 = -1640531527;
         int var8 = 751222038;

         while (var8-- > 0) {
            var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var6 + var1[var6 & 3];
            var6 += var7;
            var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
         }

         this.offset -= 1049250216;
         this.writeInt(var4, 1311700279);
         this.writeInt(var5, 1650533673);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("kz")
   public boolean method12104() {
      this.offset -= -1622858540;
      byte[] var2 = this.array;
      int var3 = this.offset * 2108391709;
      int var4 = -1;

      for (int var5 = 0; var5 < var3; var5++) {
         var4 = var4 >>> 8 ^ field6477[(var4 ^ var2[var5]) & 600378380];
      }

      var4 = ~var4;
      int var7 = method12015(this, -920742208);
      return var7 == var4;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hf")
   public int method12010() {
      this.offset += -811429270;
      int var1 = ((this.array[2108391709 * this.offset - 2] & 255) << 8) + (this.array[2108391709 * this.offset - 1] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("hi")
   public static void method11934(Buffer var0, int var1) {
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("jy")
   public void method12092(int[] var1, int var2, int var3) {
      int var4 = this.offset * 2108391709;
      this.offset = var2 * 1741769013;
      int var5 = (var3 - var2) / 8;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = method12015(this, 1494339969);
         int var8 = method12015(this, 233747703);
         int var9 = -957401312;
         int var10 = -1640531527;
         int var11 = 32;

         while (var11-- > 0) {
            var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
            var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var9 & 3] + var9;
         }

         this.offset -= 1049250216;
         this.writeInt(var7, 2085511380);
         this.writeInt(var8, 1038808156);
      }

      this.offset = 1741769013 * var4;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("nz")
   public int method12230() {
      return this.readShort((byte)-118);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hx")
   public void method11981(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.array[2108391709 * this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("jq")
   public void method12081(int[] var1) {
      int var2 = 2108391709 * this.offset / 8;
      this.offset = 0;

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = method12015(this, -683860445);
         int var5 = method12015(this, 1866771815);
         int var6 = 0;
         int var7 = -1640531527;
         int var8 = 32;

         while (var8-- > 0) {
            var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var6 + var1[var6 & 3];
            var6 += var7;
            var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
         }

         this.offset -= 1049250216;
         this.writeInt(var4, 1132456789);
         this.writeInt(var5, 1027148579);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
   @ObfuscatedName("ka")
   public void method12095(BigInteger var1, BigInteger var2) {
      int var3 = 2052975481 * this.offset;
      this.offset = 0;
      byte[] var4 = new byte[var3];
      this.readBytes(var4, 0, var3, (byte)-11);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.offset = 0;
      this.writeShort(var7.length, -1854742309);
      method11967(this, var7, 0, var7.length, -1187258379);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
   @ObfuscatedName("kr")
   public void method12096(BigInteger var1, BigInteger var2) {
      int var3 = 2108391709 * this.offset;
      this.offset = 0;
      byte[] var4 = new byte[var3];
      this.readBytes(var4, 0, var3, (byte)32);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.offset = 0;
      this.writeShort(var7.length, -1853935725);
      method11967(this, var7, 0, var7.length, -1187258379);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("kw")
   public int method12100(int var1) {
      byte[] var3 = this.array;
      int var4 = -10534382 * this.offset;
      int var5 = -1;

      for (int var6 = var1; var6 < var4; var6++) {
         var5 = var5 >>> 8 ^ field6477[(var5 ^ var3[var6]) & -1262044718];
      }

      var5 = ~var5;
      this.writeInt(var5, 1410614350);
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cd")
   public void writeLengthInt(int var1, int var2) {
      try {
         if (var1 < 0) {
            if (var2 == 1708490112) {
               throw new IllegalArgumentException();
            }
         } else {
            this.array[this.offset * 2108391709 - var1 - 4] = (byte)(var1 >> 24);
            this.array[this.offset * 2108391709 - var1 - 3] = (byte)(var1 >> 16);
            this.array[2108391709 * this.offset - var1 - 2] = (byte)(var1 >> 8);
            this.array[2108391709 * this.offset - var1 - 1] = (byte)var1;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.cd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("kp")
   public boolean method12105() {
      this.offset -= -1622858540;
      byte[] var2 = this.array;
      int var3 = this.offset * 2108391709;
      int var4 = -1;

      for (int var5 = 0; var5 < var3; var5++) {
         var4 = var4 >>> 8 ^ field6477[(var4 ^ var2[var5]) & 0xFF];
      }

      var4 = ~var4;
      int var7 = method12015(this, 1955557865);
      return var7 == var4;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("no")
   public int method12202() {
      this.offset += -1622858540;
      return (this.array[2108391709 * this.offset - 3] & -612133954)
         + ((this.array[this.offset * 2108391709 - 2] & -708542655) << 24)
         + ((this.array[2108391709 * this.offset - 1] & 85739394) << 16)
         + ((this.array[this.offset * -1478770330 - 4] & 0xFF) << 8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;[III)V")
   @ObfuscatedName("rh")
   public static void method12086(Buffer var0, int[] var1, int var2, int var3) {
      int var4 = 2108391709 * var0.offset;
      var0.offset = 1741769013 * var2;
      int var5 = (var3 - var2) / 8;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = method12015(var0, -969659419);
         int var8 = method12015(var0, 1001131191);
         int var9 = 0;
         int var10 = 1621747378;
         int var11 = 32;

         while (var11-- > 0) {
            var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var9 & 3] + var9;
            var9 += var10;
            var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
         }

         var0.offset -= 2140966622;
         var0.writeInt(var7, 739801132);
         var0.writeInt(var8, 1186797364);
      }

      var0.offset = var4 * 1741769013;
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("nc")
   public void method12212(byte[] var1, int var2, int var3) {
      for (int var4 = var2; var4 < var2 + var3; var4++) {
         var1[var4] = (byte)(this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128);
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("nj")
   public void method12208(byte[] var1, int var2, int var3) {
      for (int var4 = var2 + var3 - 1; var4 >= var2; var4--) {
         var1[var4] = this.array[(this.offset += -1988661274) * 2108391709 - 1];
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("kx")
   public void method12111(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(0 - var1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("nv")
   public int method12198() {
      this.offset += 1575089229;
      return ((this.array[2108391709 * this.offset - 3] & 0xFF) << 8)
         + ((this.array[this.offset * -1407502561 - 1] & 0xFF) << 24)
         + ((this.array[-1372123981 * this.offset - 2] & -160151608) << 16)
         + (this.array[110335749 * this.offset - 4] & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("kd")
   public void method12115(int var1) {
      this.array[(this.offset += 1229078082) * 2108391709 - 1] = (byte)(128 - var1);
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("gs")
   public void method11951(long var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 56);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 48);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 40);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 32);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)B")
   @ObfuscatedName("zr")
   public static byte method12132(Buffer var0) {
      return (byte)(0 - var0.array[(var0.offset += 1129537113) * 2108391709 - 1]);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gm")
   public void method11943(int var1) {
      this.array[(this.offset += 1393333848) * 2108391709 - 1] = (byte)(var1 >> 24);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1741769013) * -1825328168 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kn")
   public int method12119() {
      return this.array[(this.offset += -1044618896) * 2108391709 - 1] - 128 & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;IB)V")
   @ObfuscatedName("ez")
   public static void method11986(Buffer var0, int var1, byte var2) {
      if (var0 == null) {
         var0.writeLengthShort(var1, var2);
      } else {
         try {
            if ((var1 & -128) != 0) {
               if (var2 == 1) {
                  throw new IllegalStateException();
               }

               if (0 != (var1 & -16384)) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if ((var1 & -2097152) != 0) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     if ((var1 & -268435456) != 0) {
                        var0.writeByte(var1 >>> 28 | 128, (short)-5741);
                     }

                     var0.writeByte(var1 >>> 21 | 128, (short)-13248);
                  }

                  var0.writeByte(var1 >>> 14 | 128, (short)-10888);
               }

               var0.writeByte(var1 >>> 7 | 128, (short)-27940);
            }

            var0.writeByte(var1 & 127, (short)-31073);
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "xa.cq(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kk")
   public int method12122() {
      return 0 - this.array[(this.offset += 1741769013) * 2108391709 - 1] & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kh")
   public int method12120() {
      return this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128 & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ln")
   public int method12123() {
      return 0 - this.array[(this.offset += 1741769013) * 2108391709 - 1] & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("nr")
   public void method12216(byte[] var1, int var2, int var3) {
      for (int var4 = var3 + var2 - 1; var4 >= var2; var4--) {
         var1[var4] = (byte)(this.array[(this.offset += 643122931) * 216605828 - 1] - 1958693067);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ly")
   public int method12126() {
      return 128 - this.array[(this.offset += 1741769013) * -1276621265 - 1] & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("ld")
   public byte method12128() {
      return (byte)(this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128);
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("ls")
   public byte method12129() {
      return (byte)(this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128);
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("lp")
   public byte method12130() {
      return (byte)(this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128);
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("lh")
   public byte method12134() {
      return (byte)(128 - this.array[(this.offset += 1741769013) * 2108391709 - 1]);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("la")
   public void method12138(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;[BIII)V")
   @ObfuscatedName("kj")
   public static void method11967(Buffer var0, byte[] var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method11968(var1, var2, var2, var2);
      } else {
         try {
            for (int var5 = var2; var5 < var3 + var2; var5++) {
               if (var4 != -1187258379) {
                  return;
               }

               var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = var1[var5];
            }
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "xa.cg(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("av")
   void releaseArray(byte var1) {
      try {
         if (this.array != null) {
            if (var1 == 4) {
               throw new IllegalStateException();
            }

            class372.ByteArrayPool_release(this.array, (byte)-23);
         }

         this.array = null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("kq")
   public void method12112(int var1) {
      this.array[(this.offset += -701898563) * -865053390 - 1] = (byte)(0 - var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lt")
   public void method12139(int var1) {
      this.array[(this.offset += 587815578) * 2108391709 - 1] = (byte)var1;
      this.array[(this.offset += 1741769013) * -1699970235 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("fo")
   public void method12231(String var1) {
      this.writeStringCp1252NullTerminated(var1, 998990159);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lb")
   public void method12140(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("li")
   public void method12142(int var1) {
      this.array[(this.offset += 1741769013) * 1378948711 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(128 + var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lo")
   public void method12143(int var1) {
      this.array[(this.offset += 1741769013) * -1254162604 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1517996164) * 2108391709 - 1] = (byte)(128 + var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gq")
   public void method11975(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.array[this.offset * 988174967 - var1 - 4] = (byte)(var1 >> 24);
         this.array[this.offset * 2108391709 - var1 - 3] = (byte)(var1 >> 16);
         this.array[2108391709 * this.offset - var1 - 2] = (byte)(var1 >> 8);
         this.array[2108391709 * this.offset - var1 - 1] = (byte)var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lm")
   public int method12152() {
      this.offset += -811429270;
      return ((this.array[this.offset * 2108391709 - 1] & 0xFF) << 8) + (this.array[2108391709 * this.offset - 2] - 128 & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lu")
   public int method12153() {
      this.offset += -811429270;
      return ((this.array[this.offset * 2108391709 - 1] & 0xFF) << 8) + (this.array[2108391709 * this.offset - 2] - 128 & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lv")
   public int method12154() {
      this.offset += -811429270;
      return ((this.array[this.offset * 2108391709 - 1] & 0xFF) << 8) + (this.array[2108391709 * this.offset - 2] - 128 & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lk")
   public int method12157() {
      this.offset += -1374216793;
      int var1 = ((this.array[2108391709 * this.offset - 1] & 364107409) << 8) + (this.array[this.offset * -1825894099 - 2] & 626959744);
      if (var1 > -484215215) {
         var1 -= -1583418143;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("cv")
   public static void method11930(Buffer var0, int var1) {
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
   }

   static {
      for (int var1 = 0; var1 < 256; var1++) {
         int var0 = var1;

         for (int var2 = 0; var2 < 8; var2++) {
            if (1 == (var0 & 1)) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         field6477[var1] = var0;
      }

      for (int var5 = 0; var5 < 256; var5++) {
         long var4 = var5;

         for (int var3 = 0; var3 < 8; var3++) {
            if (1L == (var4 & 1L)) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field6476[var5] = var4;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ur")
   public static void method11993(Buffer var0, int var1) {
      if (var0 == null) {
         var0.method11933(var1);
      }

      var1 = var1 << 1 ^ var1 >> 31;
      var0.method11989(var1, 581042329);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mn")
   public int method12161() {
      this.offset += 398903228;
      int var1 = ((this.array[1255088624 * this.offset - 2] & 255) << 8) + (this.array[-1036698965 * this.offset - 1] - 128 & 0xFF);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("fn")
   public int readUnsignedIntLE(int var1) {
      try {
         this.offset += -1622858540;
         return ((this.array[2108391709 * this.offset - 3] & 0xFF) << 8)
            + ((this.array[this.offset * 2108391709 - 1] & 0xFF) << 24)
            + ((this.array[2108391709 * this.offset - 2] & 0xFF) << 16)
            + (this.array[2108391709 * this.offset - 4] & 0xFF);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.fn(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mf")
   public int method12162() {
      this.offset += -811429270;
      int var1 = ((this.array[2108391709 * this.offset - 2] & 255) << 8) + (this.array[207126831 * this.offset - 1] - 1222729126 & 0xFF);
      if (var1 > 443368148) {
         var1 -= 65536;
      }

      return var1;
   }

   public Buffer(int var1) {
      byte[] var2 = WorldEntityCoord.ByteArrayPool_getArrayBool(var1, false, (byte)43);
      this.array = var2;
      this.offset = 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ma")
   public int method12165() {
      this.offset += -811429270;
      int var1 = (this.array[1974953159 * this.offset - 2] - 128 & 0xFF) + ((this.array[this.offset * 2108391709 - 1] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 956638533;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mr")
   public int method12166() {
      this.offset += 207574217;
      int var1 = (this.array[2108391709 * this.offset - 2] - 128 & 1618515789) + ((this.array[this.offset * 2108391709 - 1] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 1767711527;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mu")
   public int method12167() {
      this.offset += -811429270;
      int var1 = (this.array[2108391709 * this.offset - 2] - 128 & 0xFF) + ((this.array[this.offset * 2108391709 - 1] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("fj")
   public byte[] method12232() {
      return this.array;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("mi")
   public void method12169(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1741769013) * -1229229525 - 1] = (byte)(var1 >> 16);
      this.array[(this.offset += 1928026964) * 2108391709 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mo")
   public int method12173() {
      this.offset += 930339743;
      return (this.array[this.offset * 2108391709 - 3] & 0xFF)
         + ((this.array[2108391709 * this.offset - 2] & 0xFF) << 8)
         + ((this.array[2108391709 * this.offset - 1] & 0xFF) << 16);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ij")
   public String method12030() {
      int var1 = this.offset * 2108391709;

      while (this.array[(this.offset += 1741769013) * -1524337860 - 1] != 0) {
      }

      int var2 = -89455165 * this.offset - var1 - 1;
      return var2 == 0 ? "" : RouteStrategy.decodeStringCp1252(this.array, var1, var2, 1895064943);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;[III)V")
   @ObfuscatedName("yn")
   public static void method12087(Buffer var0, int[] var1, int var2, int var3) {
      int var4 = 2108391709 * var0.offset;
      var0.offset = 1741769013 * var2;
      int var5 = (var3 - var2) / 8;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = method12015(var0, 2068100060);
         int var8 = method12015(var0, 1613020270);
         int var9 = 0;
         int var10 = -1640531527;
         int var11 = 32;

         while (var11-- > 0) {
            var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var9 & 3] + var9;
            var9 += var10;
            var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
         }

         var0.offset -= 1049250216;
         var0.writeInt(var7, 1998326263);
         var0.writeInt(var8, 1939639725);
      }

      var0.offset = var4 * 1741769013;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mq")
   public int method12175() {
      this.offset += 930339743;
      return ((this.array[this.offset * 2108391709 - 3] & 0xFF) << 16)
         + ((this.array[this.offset * 2108391709 - 1] & 0xFF) << 8)
         + (this.array[829734488 * this.offset - 2] & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mg")
   public int method12176() {
      this.offset += 635659269;
      return ((this.array[this.offset * -999361058 - 3] & -507314114) << 16)
         + ((this.array[this.offset * 2108391709 - 1] & 1785817436) << 8)
         + (this.array[2108391709 * this.offset - 2] & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mx")
   public int method12177() {
      this.offset += 930339743;
      return ((this.array[this.offset * -921257718 - 3] & -1617910535) << 16)
         + ((this.array[this.offset * 2108391709 - 1] & 726187410) << 8)
         + (this.array[-1680146830 * this.offset - 2] & 793545441);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;IZI)V")
   @ObfuscatedName("mz")
   public static void method11919(Buffer var0, int var1, boolean var2, int var3) {
      if (var0 == null) {
         var0.method11920(var1, var2, var1);
      }

      try {
         var0.releaseArray((byte)-27);
         var0.array = WorldEntityCoord.ByteArrayPool_getArrayBool(var1, var2, (byte)85);
         var0.offset = 0;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "xa.bx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("md")
   public int method12182() {
      this.offset += 930339743;
      int var1 = ((this.array[this.offset * 2108391709 - 1] & 255) << 16)
         + ((this.array[this.offset * 2108391709 - 2] & 255) << 8)
         + (this.array[this.offset * 2108391709 - 3] & 255);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gr")
   public void method11976(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.array[this.offset * 2108391709 - var1 - 4] = (byte)(var1 >> 24);
         this.array[this.offset * -167742686 - var1 - 3] = (byte)(var1 >> 16);
         this.array[2108391709 * this.offset - var1 - 2] = (byte)(var1 >> 8);
         this.array[653358310 * this.offset - var1 - 1] = (byte)var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mt")
   public int method12185() {
      this.offset += 930339743;
      int var1 = (this.array[2108391709 * this.offset - 2] & 255)
         + ((this.array[2108391709 * this.offset - 1] & 255) << 8)
         + ((this.array[this.offset * 2108391709 - 3] & 255) << 16);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lq")
   public int method12149() {
      this.offset += -560464310;
      return ((this.array[this.offset * -2108953349 - 2] & 0xFF) << 8) + (this.array[2108391709 * this.offset - 1] - 129689082 & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("mp")
   public void method12188(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("mm")
   public void method12193(int var1) {
      this.array[(this.offset += 91278403) * 2108391709 - 1] = (byte)(var1 >> 8);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
      this.array[(this.offset += 1741769013) * -942028437 - 1] = (byte)(var1 >> 24);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("my")
   public void method12197(int var1) {
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
      this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)I")
   @ObfuscatedName("zp")
   public static int method12179(Buffer var0) {
      if (var0 == null) {
         var0.method12157();
      }

      var0.offset += 930339743;
      return (var0.array[var0.offset * -431525109 - 1] & 0xFF)
         + ((var0.array[var0.offset * 2108391709 - 2] & 0xFF) << 16)
         + ((var0.array[var0.offset * 165356367 - 3] & 0xFF) << 8);
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("jt")
   public void method12093(int[] var1, int var2, int var3) {
      int var4 = this.offset * 2108391709;
      this.offset = var2 * 1741769013;
      int var5 = (var3 - var2) / 8;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = method12015(this, 2015807386);
         int var8 = method12015(this, -319010326);
         int var9 = -957401312;
         int var10 = -1640531527;
         int var11 = 32;

         while (var11-- > 0) {
            var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
            var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var9 & 3] + var9;
         }

         this.offset -= 1049250216;
         this.writeInt(var7, 903165749);
         this.writeInt(var8, 1941518245);
      }

      this.offset = 1741769013 * var4;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ny")
   public int method12200() {
      this.offset += -703287557;
      return ((this.array[2108391709 * this.offset - 3] & -157234978) << 8)
         + ((this.array[this.offset * 2108391709 - 1] & 0xFF) << 24)
         + ((this.array[-602817437 * this.offset - 2] & 1671028827) << 16)
         + (this.array[-1981168259 * this.offset - 4] & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jf")
   public int method12070() {
      byte var1 = this.array[(this.offset += 1741769013) * 2108391709 - 1];

      int var2;
      for (var2 = 0; var1 < 0; var1 = this.array[(this.offset += 1741769013) * 2108391709 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("nu")
   public int method12204() {
      this.offset += -639094595;
      return (this.array[-897732790 * this.offset - 2] & 0xFF)
         + ((this.array[2108391709 * this.offset - 1] & 0xFF) << 8)
         + ((this.array[this.offset * 1204213186 - 4] & 0xFF) << 16)
         + ((this.array[this.offset * 2108391709 - 3] & -73541731) << 24);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hj")
   public void method11982(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.array[2108391709 * this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("nk")
   public int method12233() {
      return method12050(this, -1165629396);
   }

   @ObfuscatedSignature(descriptor = "([IB)V")
   @ObfuscatedName("de")
   public void xteaDecryptAll(int[] var1, byte var2) {
      try {
         int var3 = this.offset * 2108391709 / 8;
         this.offset = 0;

         for (int var4 = 0; var4 < var3; var4++) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            int var5 = method12015(this, -715939632);
            int var6 = method12015(this, -672625403);
            int var7 = -957401312;
            int var8 = -1640531527;
            int var9 = 32;

            while (var9-- > 0) {
               if (var2 == 1) {
                  throw new IllegalStateException();
               }

               var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var7 >>> 11 & 3] + var7;
               var7 -= var8;
               var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
            }

            this.offset -= 1049250216;
            this.writeInt(var5, 802097392);
            this.writeInt(var6, 666582416);
         }
      } catch (RuntimeException var10) {
         throw RestClientThreadFactory.newRunException(var10, "xa.de(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ja")
   public int method12062() {
      return this.array[this.offset * 2108391709] < 0 ? method12015(this, -572226852) & 2147483647 : method12008(this, (byte)5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)I")
   @ObfuscatedName("de")
   public static int method12146(Buffer var0) {
      if (var0 == null) {
         var0.method12055();
      }

      var0.offset += -1752254890;
      return (var0.array[var0.offset * 1162513268 - 2] & 0xFF) + ((var0.array[var0.offset * 2108391709 - 1] & 0xFF) << 8);
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("nl")
   public void method12213(byte[] var1, int var2, int var3) {
      for (int var4 = var2; var4 < var2 + var3; var4++) {
         var1[var4] = (byte)(this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ke")
   public boolean method12106() {
      this.offset -= -1622858540;
      byte[] var2 = this.array;
      int var3 = this.offset * 2108391709;
      int var4 = -1;

      for (int var5 = 0; var5 < var3; var5++) {
         var4 = var4 >>> 8 ^ field6477[(var4 ^ var2[var5]) & 1646375574];
      }

      var4 = ~var4;
      int var7 = method12015(this, 529498165);
      return var7 == var4;
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("nh")
   public void method12217(byte[] var1, int var2, int var3) {
      for (int var4 = var3 + var2 - 1; var4 >= var2; var4--) {
         var1[var4] = (byte)(this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("me")
   public static void method11987(Buffer var0, int var1) {
      if (var0 == null) {
         var0.method12177();
      }

      if ((var1 & -128) != 0) {
         if (0 != (var1 & -16384)) {
            if ((var1 & -2097152) != 0) {
               if ((var1 & -268435456) != 0) {
                  var0.writeByte(var1 >>> 28 | 128, (short)-18256);
               }

               var0.writeByte(var1 >>> 21 | 128, (short)-31803);
            }

            var0.writeByte(var1 >>> 14 | 128, (short)-14120);
         }

         var0.writeByte(var1 >>> 7 | 128, (short)-21272);
      }

      var0.writeByte(var1 & 127, (short)-10717);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("eu")
   public int readShortLE(int var1) {
      try {
         this.offset += -811429270;
         int var2 = ((this.array[2108391709 * this.offset - 1] & 255) << 8) + (this.array[this.offset * 2108391709 - 2] & 255);
         if (var2 > 32767) {
            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.eu(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("cz")
   public void writeLengthShort(int var1, byte var2) {
      try {
         if ((var1 & -128) != 0) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            if (0 != (var1 & -16384)) {
               if (var2 == 1) {
                  throw new IllegalStateException();
               }

               if ((var1 & -2097152) != 0) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if ((var1 & -268435456) != 0) {
                     this.writeByte(var1 >>> 28 | 128, (short)-5741);
                  }

                  this.writeByte(var1 >>> 21 | 128, (short)-13248);
               }

               this.writeByte(var1 >>> 14 | 128, (short)-10888);
            }

            this.writeByte(var1 >>> 7 | 128, (short)-27940);
         }

         this.writeByte(var1 & 127, (short)-31073);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.cq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)V")
   @ObfuscatedName("cx")
   public void writeCESU8(CharSequence var1, int var2) {
      try {
         int var3 = class498.method10640(var1, (byte)67);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = 0;
         method11986(this, var3, (byte)3);
         this.offset = this.offset + class431.method9198(this.array, 2108391709 * this.offset, var1, -2056260639) * 1741769013;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "xa.cx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BIII)V")
   @ObfuscatedName("fg")
   public void method11968(byte[] var1, int var2, int var3, int var4) {
      try {
         for (int var5 = var2; var5 < var3 + var2; var5++) {
            if (var4 != -1187258379) {
               return;
            }

            this.array[(this.offset += 1741769013) * 2108391709 - 1] = var1[var5];
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "xa.cg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("cq")
   public void writeVarInt(int var1, byte var2) {
      try {
         if (var1 >= 0 && var1 < 128) {
            if (var2 > 0) {
               this.writeByte(var1, (short)-23477);
            }
         } else {
            if (var1 >= 0) {
               if (var2 <= 0) {
                  return;
               }

               if (var1 < 32768) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  this.writeShort(32768 + var1, -1669094569);
                  return;
               }
            }

            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.cf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cw")
   public void method12108(int var1, int var2) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 + 128);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.ee(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)B")
   @ObfuscatedName("cj")
   public byte readByte(byte var1) {
      try {
         return this.array[(this.offset += 1741769013) * 2108391709 - 1];
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.cj(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("oi")
   public static void method12189(Buffer var0, int var1) {
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ca")
   public int readUnsignedShort(byte var1) {
      try {
         this.offset += -811429270;
         return (this.array[this.offset * 2108391709 - 1] & 0xFF) + ((this.array[2108391709 * this.offset - 2] & 0xFF) << 8);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.ca(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IZI)V")
   @ObfuscatedName("bx")
   void method11920(int var1, boolean var2, int var3) {
      try {
         this.releaseArray((byte)-27);
         this.array = WorldEntityCoord.ByteArrayPool_getArrayBool(var1, var2, (byte)85);
         this.offset = 0;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "xa.bx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dl")
   public int readUShortSmart(int var1) {
      try {
         int var2 = this.array[this.offset * 2108391709] & 255;
         if (var2 < 128) {
            if (var1 == 117389541) {
               throw new IllegalStateException();
            } else {
               return this.method12183(-1330421958);
            }
         } else {
            return method12008(this, (byte)5) - 32768;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.dl(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dx")
   public int readIncrSmallSmart(int var1) {
      try {
         short var2 = 0;

         int var3;
         for (var3 = method12050(this, 812914525); var3 == 32767; var3 = method12050(this, -1844396026)) {
            if (var1 >= 1787833001) {
               throw new IllegalStateException();
            }

            var2 += 32767;
         }

         return var2 + var3;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "xa.dx(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("ic")
   public void method12218(byte[] var1, int var2, int var3) {
      for (int var4 = var3 + var2 - 1; var4 >= var2; var4--) {
         var1[var4] = (byte)(this.array[(this.offset += 1741769013) * 2108391709 - 1] - 128);
      }
   }

   @ObfuscatedSignature(descriptor = "(IS)V")
   @ObfuscatedName("es")
   public void writeByteSub(int var1, short var2) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(128 - var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.es(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("db")
   public String readStringCp1252NullTerminated(int var1) {
      try {
         byte var2 = this.array[(this.offset += 1741769013) * 2108391709 - 1];
         if (0 != var2) {
            if (var1 >= 1800859672) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            int var3 = this.readNullableLargeSmart(1493126422);
            if (this.offset * 2108391709 + var3 > this.array.length) {
               if (var1 >= 1800859672) {
                  throw new IllegalStateException();
               } else {
                  throw new IllegalStateException("");
               }
            } else {
               String var4 = class228.method4854(this.array, 2108391709 * this.offset, var3, -1346356197);
               this.offset += var3 * 1741769013;
               return var4;
            }
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "xa.dh(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)I")
   @ObfuscatedName("rx")
   public static int method12050(Buffer var0, int var1) {
      if (var0 == null) {
         var0.readUShortSmart(var1);
      }

      try {
         int var2 = var0.array[var0.offset * 2108391709] & 255;
         if (var2 < 128) {
            if (var1 == 117389541) {
               throw new IllegalStateException();
            } else {
               return var0.readUnsignedByte(-1330421958);
            }
         } else {
            return method12008(var0, (byte)5) - 32768;
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.dl(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hr")
   public int method11998() {
      return this.array[(this.offset += 1741769013) * -544304457 - 1] & 150682100;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("rr")
   public int method12234() {
      return this.readShortSmart(-1344439755);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;Ljava/lang/CharSequence;I)V")
   @ObfuscatedName("ma")
   public static void method11966(Buffer var0, CharSequence var1, int var2) {
      if (var0 == null) {
         var0.writeCESU8(var1, var2);
      } else {
         try {
            int var3 = class498.method10640(var1, (byte)67);
            var0.array[(var0.offset += 1741769013) * 2108391709 - 1] = 0;
            method11986(var0, var3, (byte)3);
            var0.offset = var0.offset + class431.method9198(var0.array, 2108391709 * var0.offset, var1, -2056260639) * 1741769013;
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "xa.cx(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)I")
   @ObfuscatedName("zl")
   public static int method12008(Buffer var0, byte var1) {
      if (var0 == null) {
         return var0.readUnsignedShort(var1);
      } else {
         try {
            var0.offset += -811429270;
            return (var0.array[var0.offset * 2108391709 - 1] & 0xFF) + ((var0.array[2108391709 * var0.offset - 2] & 0xFF) << 8);
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "xa.ca(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ed")
   public int method12071(int var1) {
      try {
         byte var2 = this.array[(this.offset += 1741769013) * 2108391709 - 1];

         int var3;
         for (var3 = 0; var2 < 0; var2 = this.array[(this.offset += 1741769013) * 2108391709 - 1]) {
            if (var1 == 690382148) {
               throw new IllegalStateException();
            }

            var3 = (var3 | var2 & 127) << 7;
         }

         return var3 | var2;
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "xa.dm(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("fp")
   public void writeIntME(int var1, int var2) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.fp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kc")
   public int method12186() {
      this.offset += 930339743;
      int var1 = (this.array[2108391709 * this.offset - 2] & 255)
         + ((this.array[2108391709 * this.offset - 1] & 255) << 8)
         + ((this.array[this.offset * 2108391709 - 3] & 255) << 16);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)I")
   @ObfuscatedName("tt")
   public static int method12147(Buffer var0) {
      if (var0 == null) {
         var0.method12182();
      }

      var0.offset += -811429270;
      return (var0.array[var0.offset * 2108391709 - 2] & 0xFF) + ((var0.array[var0.offset * 2108391709 - 1] & 0xFF) << 8);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("dy")
   public boolean readBoolean(int var1) {
      try {
         boolean var10000;
         if ((this.readUnsignedIntLE(-788066384) & 1) == 1) {
            if (var1 != 2004535120) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.dy(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("dv")
   public long readLong(int var1) {
      try {
         long var2 = method12015(this, -271104735) & 4294967295L;
         long var4 = method12015(this, 1047481720) & 4294967295L;
         return var4 + (var2 << 32);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "xa.dv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("cp")
   public void writeBuffer(Buffer var1, int var2) {
      try {
         method11967(this, var1.array, 0, var1.offset * 2108391709, -1187258379);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.cp(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxa;)I")
   @ObfuscatedName("va")
   public static int method12150(Buffer var0) {
      if (var0 == null) {
         return var0.method12048();
      } else {
         var0.offset += -1287277593;
         return ((var0.array[var0.offset * -861107510 - 2] & 1809845000) << 8) + (var0.array[2108391709 * var0.offset - 1] - 128 & -271580729);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ff")
   public void writeIntLE(int var1, int var2) {
      try {
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)var1;
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 8);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 16);
         this.array[(this.offset += 1741769013) * 2108391709 - 1] = (byte)(var1 >> 24);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "xa.ff(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dw")
   public int readInt(int var1) {
      byte[] var3 = this.array;
      int var4 = 548992083 * this.offset;
      int var5 = -1;

      for (int var6 = var1; var6 < var4; var6++) {
         var5 = var5 >>> 8 ^ field6477[(var5 ^ var3[var6]) & 0xFF];
      }

      var5 = ~var5;
      this.writeIntME(var5, 930429634);
      return var5;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("fh")
   public int readUnsignedIntME(int var1) {
      try {
         this.offset += -1622858540;
         return (this.array[2108391709 * this.offset - 2] & 0xFF)
            + ((this.array[2108391709 * this.offset - 1] & 0xFF) << 8)
            + ((this.array[this.offset * 2108391709 - 4] & 0xFF) << 16)
            + ((this.array[this.offset * 2108391709 - 3] & 0xFF) << 24);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "xa.fh(" + 41);
      }
   }
}
