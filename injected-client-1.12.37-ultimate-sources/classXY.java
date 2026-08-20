import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xy")
public class classXY extends classVQ {
   @ObfuscatedName("aj")
   public byte[] field6954;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field6959 = 5000;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   public static final int field6960 = 30000;
   @ObfuscatedName("ao")
   public static long[] field6956 = new long[256];
   @ObfuscatedName("al")
   static int[] field6957 = new int[256];
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field6958 = 100;
   @ObfuscatedName("ay")
   public int field6955;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hi")
   public void method13187(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 + 128);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
   }

   public classXY(byte[] var1) {
      this.field6954 = var1;
      this.field6955 = 0;
   }

   @ObfuscatedSignature(descriptor = "(IZB)V")
   @ObfuscatedName("bq")
   void method12957(int var1, boolean var2, byte var3) {
      try {
         this.vmethod649(-1910474756);
         this.field6954 = classTO.method10937(var1, var2, 1154989421);
         this.field6955 = 0;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "xy.bq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ex")
   public int method13202(byte var1) {
      try {
         this.field6955 += 2103253898;
         int var2 = ((this.field6954[702114061 * this.field6955 - 1] & 255) << 8) + (this.field6954[702114061 * this.field6955 - 2] & 255);
         if (var2 > 32767) {
            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.ex(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bv")
   public void method12973(int var1, int var2) {
      try {
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.bv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bz")
   public void method12979(int var1, int var2) {
      try {
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 24);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 16);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.bz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("cr")
   public void method12981(long var1) {
      try {
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 40);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 32);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 24);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 16);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.cr(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("cu")
   public void method12987(long var1) {
      try {
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 56);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 48);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 40);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 32);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 24);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 16);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.cu(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("cp")
   public void method12999(String var1, int var2) {
      try {
         int var3 = var1.indexOf(0);
         if (var3 >= 0) {
            if (var2 != -966414083) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException("");
            }
         } else {
            this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = 0;
            this.field6955 = this.field6955 + classOR.method8729(var1, 0, var1.length(), this.field6954, 702114061 * this.field6955, 305293424) * -1095856699;
            this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = 0;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "xy.cp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)V")
   @ObfuscatedName("cq")
   public void method13001(CharSequence var1, int var2) {
      try {
         int var3 = classAC.method310(var1, (byte)24);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = 0;
         method13031(this, var3, (byte)35);
         int var4 = this.field6955;
         byte[] var6 = this.field6954;
         int var7 = this.field6955 * 702114061;
         int var8 = var1.length();
         int var9 = var7;

         for (int var10 = 0; var10 < var8; var10++) {
            if (var2 != -910745300) {
               throw new IllegalStateException();
            }

            char var11 = var1.charAt(var10);
            if (var11 <= 127) {
               if (var2 != -910745300) {
                  throw new IllegalStateException();
               }

               var6[var9++] = (byte)var11;
            } else if (var11 <= 2047) {
               if (var2 != -910745300) {
                  throw new IllegalStateException();
               }

               var6[var9++] = (byte)(192 | var11 >> 6);
               var6[var9++] = (byte)(128 | var11 & '?');
            } else {
               var6[var9++] = (byte)(224 | var11 >> '\f');
               var6[var9++] = (byte)(128 | var11 >> 6 & 63);
               var6[var9++] = (byte)(128 | var11 & '?');
            }
         }

         int var5 = var9 - var7;
         this.field6955 = var4 + -1095856699 * var5;
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "xy.cq(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("hp")
   public static int method13045(classXY var0) {
      if (var0 == null) {
         var0.method13240();
      }

      var0.field6955 += 2103253898;
      return ((var0.field6954[67149838 * var0.field6955 - 2] & 0xFF) << 8) + (var0.field6954[var0.field6955 * 702114061 - 1] & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("iv")
   public int method13091() {
      int var1 = this.field6954[this.field6955 * 1381285267] & 1189011997;
      return var1 < -1013609909 ? method13039(this, -346779531) : method13047(this, 181741858) - 2028574499;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;B)V")
   @ObfuscatedName("cd")
   public void method13010(classXY var1, byte var2) {
      try {
         method13007(this, var1.field6954, 0, var1.field6955 * 702114061, (byte)51);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.cd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("dz")
   public int method13122(byte var1) {
      try {
         int var2 = method13119(this, -1614020296);
         return var2 >>> 1 ^ -(var2 & 1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.dz(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cs")
   public void method13016(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 == -467790787) {
               throw new IllegalStateException();
            }

            if (var1 <= 65535) {
               this.field6954[702114061 * this.field6955 - var1 - 2] = (byte)(var1 >> 8);
               this.field6954[702114061 * this.field6955 - var1 - 1] = (byte)var1;
               return;
            }

            if (var2 == -467790787) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException();
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.cs(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hw")
   public void method13185(int var1) {
      this.field6954[(this.field6955 += 1193493350) * -2084340756 - 1] = (byte)(var1 >> 8);
      this.field6954[(this.field6955 += 2135393065) * 702114061 - 1] = (byte)(1644197307 + var1);
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("ky")
   public byte method13176() {
      return (byte)(128 - this.field6954[(this.field6955 += 1750683781) * 702114061 - 1]);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("jh")
   public static int method13245(classXY var0) {
      if (var0 == null) {
         var0.method13055();
      }

      var0.field6955 += -88459500;
      return ((var0.field6954[var0.field6955 * 702114061 - 2] & 0xFF) << 24)
         + ((var0.field6954[var0.field6955 * 702114061 - 1] & 0xFF) << 16)
         + ((var0.field6954[var0.field6955 * 702114061 - 4] & 0xFF) << 8)
         + (var0.field6954[702114061 * var0.field6955 - 3] & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)I")
   @ObfuscatedName("tx")
   public static int method13119(classXY var0, int var1) {
      if (var0 == null) {
         var0.method13121(var1);
      }

      try {
         int var3 = 0;
         byte var4 = 0;

         int var2;
         do {
            var2 = method13039(var0, -346779531);
            var3 |= (var2 & 127) << var4;
            var4 += 7;
         } while (var2 > 127);

         if (var1 >= 465362749) {
            throw new IllegalStateException();
         } else {
            return var3;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "xy.de(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("js")
   public int method13123() {
      int var1 = method13119(this, -442548348);
      return var1 >>> 1 ^ -(var1 & 1);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("kx")
   public int method13051(int var1) {
      try {
         this.field6955 += 1007397199;
         return (this.field6954[this.field6955 * 702114061 - 1] & 0xFF)
            + ((this.field6954[702114061 * this.field6955 - 2] & 0xFF) << 8)
            + ((this.field6954[this.field6955 * 702114061 - 3] & 0xFF) << 16);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.cg(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)I")
   @ObfuscatedName("zz")
   public static int method13144(classXY var0, int var1) {
      if (var0 == null) {
         var0.method13146(var1);
      }

      int var2 = classPY.method9375(var0.field6954, var1, 702114061 * var0.field6955, -1872029579);
      var0.method12979(var2, 1855530005);
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
   @ObfuscatedName("gy")
   public static void method13139(classXY var0, BigInteger var1, BigInteger var2) {
      if (var0 == null) {
         var0.method13228();
      }

      int var3 = var0.field6955 * 1250165784;
      var0.field6955 = 0;
      byte[] var4 = new byte[var3];
      var0.method13084(var4, 0, var3, (byte)53);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      var0.field6955 = 0;
      var0.method12973(var7.length, -1542382992);
      method13007(var0, var7, 0, var7.length, (byte)16);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("db")
   public int method13053(int var1) {
      try {
         this.field6955 += 1007397199;
         int var2 = (this.field6954[this.field6955 * 702114061 - 1] & 255)
            + ((this.field6954[this.field6955 * 702114061 - 3] & 255) << 16)
            + ((this.field6954[this.field6955 * 702114061 - 2] & 255) << 8);
         if (var2 > 8388607) {
            if (var1 != 831951752) {
               throw new IllegalStateException();
            }

            var2 -= 16777216;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.cw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;II)V")
   @ObfuscatedName("ir")
   public static void method13235(classXY var0, int var1, int var2) {
      if (var0 == null) {
         var0.method13234(var1, var1);
      } else {
         try {
            var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
            var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
            var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 24);
            var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 16);
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "xy.em(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ej")
   public int method13258() {
      return this.method13094((short)17353);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("cj")
   public int method13056(byte var1) {
      try {
         this.field6955 += -88459500;
         return (this.field6954[702114061 * this.field6955 - 1] & 0xFF)
            + ((this.field6954[this.field6955 * 702114061 - 2] & 0xFF) << 8)
            + ((this.field6954[this.field6955 * 702114061 - 3] & 0xFF) << 16)
            + ((this.field6954[this.field6955 * 702114061 - 4] & 0xFF) << 24);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.cj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mv")
   public int method13259() {
      return this.method13050((byte)16);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("sf")
   public static void method13017(classXY var0, int var1) {
      if (var0 == null) {
         var0.method13021(var1);
      }

      if (var1 >= 0 && var1 <= 65535) {
         var0.field6954[-1557075232 * var0.field6955 - var1 - 2] = (byte)(var1 >> 8);
         var0.field6954[-322954203 * var0.field6955 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;J)V")
   @ObfuscatedName("zr")
   public static void method12982(classXY var0, long var1) {
      var0.field6954[(var0.field6955 += -1095856699) * -1872607112 - 1] = (byte)(var1 >> -1778874428);
      var0.field6954[(var0.field6955 += -1095856699) * -2020785323 - 1] = (byte)(var1 >> 32);
      var0.field6954[(var0.field6955 += 990512678) * 702114061 - 1] = (byte)(var1 >> 24);
      var0.field6954[(var0.field6955 += -1468723926) * 702114061 - 1] = (byte)(var1 >> 16);
      var0.field6954[(var0.field6955 += -472495183) * 938706690 - 1] = (byte)(var1 >> 8);
      var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;B)I")
   @ObfuscatedName("jl")
   public static int method13102(classXY var0, byte var1) {
      if (var0 == null) {
         return var0.method13206(var1);
      } else {
         try {
            int var2 = method13039(var0, -346779531);
            if (var2 < 252) {
               if (var1 == 1) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               return (var2 - 252 << 8) + method13039(var0, -346779531);
            }
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "xy.dr(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("ci")
   public long method13059(int var1) {
      try {
         long var2 = this.method13056((byte)1) & 4294967295L;
         long var4 = this.method13056((byte)1) & 4294967295L;
         return var4 + (var2 << 32);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "xy.ci(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("cx")
   public float method13062(int var1) {
      try {
         return Float.intBitsToFloat(this.method13056((byte)1));
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.cx(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("ol")
   public static int method13162(classXY var0) {
      if (var0 == null) {
         var0.method13262();
      }

      return 0 - var0.field6954[(var0.field6955 += -1095856699) * -1726304157 - 1] & 1831091440;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ce")
   public boolean method13065(byte var1) {
      try {
         boolean var10000;
         if ((method13039(this, -346779531) & 1) == 1) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.ce(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;")
   @ObfuscatedName("cm")
   public String method13069(byte var1) {
      try {
         if (this.field6954[702114061 * this.field6955] == 0) {
            if (var1 == 1) {
               throw new IllegalStateException();
            } else {
               this.field6955 += -1095856699;
               return null;
            }
         } else {
            return this.method13071(393802544);
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.cm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("dm")
   public String method13071(int var1) {
      try {
         int var2 = 702114061 * this.field6955;

         while (this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] != 0) {
            if (var1 <= -1369556939) {
               throw new IllegalStateException();
            }
         }

         int var3 = this.field6955 * 702114061 - var2 - 1;
         return 0 == var3 ? "" : classKQ.method6552(this.field6954, var2, var3, (byte)-95);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "xy.dc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("dk")
   public int method13107(short var1) {
      try {
         if (this.field6954[702114061 * this.field6955] < 0) {
            if (var1 == 256) {
               throw new IllegalStateException();
            } else {
               return this.method13056((byte)1) & 2147483647;
            }
         } else {
            return method13047(this, 1004254197);
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.dk(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIB)V")
   @ObfuscatedName("dx")
   public void method13084(byte[] var1, int var2, int var3, byte var4) {
      try {
         for (int var5 = var2; var5 < var2 + var3; var5++) {
            if (var4 <= 1) {
               throw new IllegalStateException();
            }

            var1[var5] = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1];
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "xy.dx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("mc")
   public void method13254(byte[] var1, int var2, int var3) {
      for (int var4 = var3 + var2 - 1; var4 >= var2; var4--) {
         var1[var4] = (byte)(this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - 128);
      }
   }

   @ObfuscatedSignature(descriptor = "([IIII)V")
   @ObfuscatedName("do")
   public void method13136(int[] var1, int var2, int var3, int var4) {
      try {
         int var5 = this.field6955 * 702114061;
         this.field6955 = var2 * -1095856699;
         int var6 = (var3 - var2) / 8;

         for (int var7 = 0; var7 < var6; var7++) {
            if (var4 != -1664008178) {
               return;
            }

            int var8 = this.method13056((byte)1);
            int var9 = this.method13056((byte)1);
            int var10 = -957401312;
            int var11 = -1640531527;
            int var12 = 32;

            while (var12-- > 0) {
               if (var4 != -1664008178) {
                  throw new IllegalStateException();
               }

               var9 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var10 + var1[var10 >>> 11 & 3];
               var10 -= var11;
               var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3];
            }

            this.field6955 -= -176919000;
            this.method12979(var8, -265300598);
            this.method12979(var9, 490672456);
         }

         this.field6955 = var5 * -1095856699;
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "xy.dg(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("kl")
   public byte method13174() {
      return (byte)(0 - this.field6954[(this.field6955 += 74762743) * 1105930774 - 1]);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("dt")
   public int method13100(byte var1) {
      try {
         short var2 = 0;

         int var3;
         for (var3 = this.method13094((short)28463); 32767 == var3; var3 = this.method13094((short)9880)) {
            if (var1 <= 2) {
               throw new IllegalStateException();
            }

            var2 += 32767;
         }

         return var2 + var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "xy.dt(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("az")
   void vmethod649(int var1) {
      try {
         if (null != this.field6954) {
            classUA.method11237(this.field6954, 2022759572);
         }

         this.field6954 = null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.az(" + ')');
      }
   }

   public classXY(int var1, boolean var2) {
      this.method12957(var1, var2, (byte)55);
   }

   @ObfuscatedSignature(descriptor = "(Lxf;I)I")
   @ObfuscatedName("dh")
   public int method13117(classXF var1, int var2) {
      try {
         switch (var1.vmethod648((byte)32).field6930 * 539966297) {
            case 0:
               return method13043(this, (byte)17);
            case 1:
               return method13039(this, -346779531);
            case 2:
               return this.method13050((byte)16);
            case 3:
               return method13047(this, -217498571);
            case 4:
               return this.method13053(831951752);
            case 5:
               return this.method13051(-758448158);
            case 6:
               return this.method13056((byte)1);
            default:
               throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.dh(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)Z")
   @ObfuscatedName("ce")
   public static boolean method13066(classXY var0) {
      return var0 == null ? var0.method13068() : (method13039(var0, -346779531) & 1) == 1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lm")
   public void method13027(int var1) {
      if ((var1 & 1267271701) != 0) {
         if ((var1 & -16384) != 0) {
            if ((var1 & -1774545842) != 0) {
               if ((var1 & 1958504830) != 0) {
                  method12971(this, var1 >>> 28 | 128, (byte)-48);
               }

               method12971(this, var1 >>> 21 | 128, (byte)-106);
            }

            method12971(this, var1 >>> 14 | 128, (byte)-27);
         }

         method12971(this, var1 >>> 7 | 128, (byte)-62);
      }

      method12971(this, var1 & -700163830, (byte)-109);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mu")
   public int method13240() {
      this.field6955 += -88459500;
      return ((this.field6954[1987360038 * this.field6955 - 3] & 0xFF) << 8)
         + ((this.field6954[this.field6955 * 1485073752 - 1] & 0xFF) << 24)
         + ((this.field6954[702114061 * this.field6955 - 2] & -569776059) << 16)
         + (this.field6954[this.field6955 * 702114061 - 4] & 0xFF);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("lf")
   public static int method13214(classXY var0) {
      if (var0 == null) {
         return var0.method13123();
      } else {
         var0.field6955 += 1007397199;
         return ((var0.field6954[702114061 * var0.field6955 - 2] & 0xFF) << 8)
            + ((var0.field6954[702114061 * var0.field6955 - 1] & 0xFF) << 16)
            + (var0.field6954[702114061 * var0.field6955 - 3] & 0xFF);
      }
   }

   @ObfuscatedSignature(descriptor = "([IB)V")
   @ObfuscatedName("dn")
   public void method13126(int[] var1, byte var2) {
      try {
         int var3 = this.field6955 * 702114061 / 8;
         this.field6955 = 0;

         for (int var4 = 0; var4 < var3; var4++) {
            int var5 = this.method13056((byte)1);
            int var6 = this.method13056((byte)1);
            int var7 = 0;
            int var8 = -1640531527;
            int var9 = 32;

            while (var9-- > 0) {
               if (var2 == 1) {
                  throw new IllegalStateException();
               }

               var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var1[var7 & 3] + var7;
               var7 += var8;
               var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7;
            }

            this.field6955 -= -176919000;
            this.method12979(var5, -701378243);
            this.method12979(var6, -710888510);
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "xy.dn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;[BIIB)V")
   @ObfuscatedName("ie")
   public static void method13007(classXY var0, byte[] var1, int var2, int var3, byte var4) {
      if (var0 == null) {
         var0.method13009(var1, var2, var2, var4);
      } else {
         try {
            for (int var5 = var2; var5 < var2 + var3; var5++) {
               if (var4 <= 4) {
                  throw new IllegalStateException();
               }

               var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = var1[var5];
            }
         } catch (RuntimeException var6) {
            throw classEG.method3884(var6, "xy.cl(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;[I)V")
   @ObfuscatedName("pp")
   public static void method13127(classXY var0, int[] var1) {
      int var2 = var0.field6955 * 702114061 / 8;
      var0.field6955 = 0;

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = var0.method13056((byte)1);
         int var5 = var0.method13056((byte)1);
         int var6 = 0;
         int var7 = -1640531527;
         int var8 = 32;

         while (var8-- > 0) {
            var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var6 & 3] + var6;
            var6 += var7;
            var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
         }

         var0.field6955 -= -176919000;
         var0.method12979(var4, -195451918);
         var0.method12979(var5, -602136646);
      }
   }

   @ObfuscatedSignature(descriptor = "([II)V")
   @ObfuscatedName("dv")
   public void method13131(int[] var1, int var2) {
      try {
         int var3 = 702114061 * this.field6955 / 8;
         this.field6955 = 0;

         for (int var4 = 0; var4 < var3; var4++) {
            if (var2 != 1656256084) {
               throw new IllegalStateException();
            }

            int var5 = this.method13056((byte)1);
            int var6 = this.method13056((byte)1);
            int var7 = -957401312;
            int var8 = -1640531527;
            int var9 = 32;

            while (var9-- > 0) {
               if (var2 != 1656256084) {
                  throw new IllegalStateException();
               }

               var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3];
               var7 -= var8;
               var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var1[var7 & 3] + var7;
            }

            this.field6955 -= -176919000;
            this.method12979(var5, 1547450637);
            this.method12979(var6, 915468689);
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "xy.dv(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("he")
   public int method13054() {
      this.field6955 += -938827362;
      int var1 = (this.field6954[this.field6955 * 853215974 - 1] & -1789864503)
         + ((this.field6954[this.field6955 * 702114061 - 3] & 1482456563) << 16)
         + ((this.field6954[this.field6955 * 1657656786 - 2] & -1191743872) << 8);
      if (var1 > 8388607) {
         var1 -= -905156477;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("dp")
   public int method13159(byte var1) {
      try {
         return this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - 128 & 0xFF;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.dp(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
   @ObfuscatedName("dl")
   public void method13140(BigInteger var1, BigInteger var2, int var3) {
      try {
         int var4 = this.field6955 * 702114061;
         this.field6955 = 0;
         byte[] var5 = new byte[var4];
         this.method13084(var5, 0, var4, (byte)127);
         BigInteger var6 = new BigInteger(var5);
         BigInteger var7 = var6.modPow(var1, var2);
         byte[] var8 = var7.toByteArray();
         this.field6955 = 0;
         this.method12973(var8.length, -1542382992);
         method13007(this, var8, 0, var8.length, (byte)40);
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "xy.dl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("dq")
   public int method13145(int var1, int var2) {
      try {
         int var3 = classPY.method9375(this.field6954, var1, 702114061 * this.field6955, -1480136460);
         this.method12979(var3, 1549079448);
         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "xy.dq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("if")
   public void method13085(byte[] var1, int var2, int var3) {
      for (int var4 = var2; var4 < var2 + var3; var4++) {
         var1[var4] = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1];
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ds")
   public void method13151(int var1, int var2) {
      try {
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 + 128);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.ds(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("dj")
   public void method13153(int var1, byte var2) {
      try {
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(0 - var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.dj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("da")
   public void method13156(int var1, byte var2) {
      try {
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(128 - var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.da(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ef")
   public void method13232(int var1, int var2) {
      try {
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 16);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 24);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.ef(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cw")
   public int method13215(int var1) {
      try {
         this.field6955 += 1007397199;
         return ((this.field6954[702114061 * this.field6955 - 2] & 0xFF) << 8)
            + ((this.field6954[702114061 * this.field6955 - 1] & 0xFF) << 16)
            + (this.field6954[702114061 * this.field6955 - 3] & 0xFF);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.eo(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hx")
   public void method13260(int var1) {
      method12971(this, var1, (byte)-55);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("de")
   public int method13165(int var1) {
      try {
         return 128 - this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] & 0xFF;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.ea(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ll")
   public int method13203() {
      this.field6955 += 2103253898;
      int var1 = ((this.field6954[-245403722 * this.field6955 - 1] & -640618010) << 8) + (this.field6954[1254311905 * this.field6955 - 2] & 255);
      if (var1 > 32767) {
         var1 -= 407778780;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;[I)V")
   @ObfuscatedName("wq")
   public static void method13132(classXY var0, int[] var1) {
      int var2 = 702114061 * var0.field6955 / 8;
      var0.field6955 = 0;

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = var0.method13056((byte)1);
         int var5 = var0.method13056((byte)1);
         int var6 = -1624817924;
         int var7 = 1484499080;
         int var8 = -863059770;

         while (var8-- > 0) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var6 + var1[var6 >>> 11 & 3];
            var6 -= var7;
            var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var6 & 3] + var6;
         }

         var0.field6955 -= 643367028;
         var0.method12979(var4, 1884081702);
         var0.method12979(var5, 1083778016);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)B")
   @ObfuscatedName("es")
   public byte method13175(byte var1) {
      try {
         return (byte)(0 - this.field6954[(this.field6955 += -1095856699) * 702114061 - 1]);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.es(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   void vmethod652() {
      if (null != this.field6954) {
         classUA.method11237(this.field6954, 2022759572);
      }

      this.field6954 = null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ma")
   public void method13024(int var1) {
      if (var1 >= 0 && var1 < 128) {
         method12971(this, var1, (byte)-77);
      } else if (var1 >= 0 && var1 < -764223002) {
         this.method12973(-1076056430 + var1, -1542382992);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "(IS)V")
   @ObfuscatedName("el")
   public void method13188(int var1, short var2) {
      try {
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 + 128);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.el(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("eh")
   public int method13198(int var1) {
      try {
         this.field6955 += 2103253898;
         return ((this.field6954[702114061 * this.field6955 - 1] & 0xFF) << 8) + (this.field6954[this.field6955 * 702114061 - 2] - 128 & 0xFF);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.en(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("cl")
   public static int method13218(classXY var0) {
      if (var0 == null) {
         var0.method13089();
      }

      var0.field6955 += 1007397199;
      int var1 = ((var0.field6954[702114061 * var0.field6955 - 1] & 255) << 16)
         + ((var0.field6954[var0.field6955 * 702114061 - 2] & 255) << 8)
         + (var0.field6954[var0.field6955 * 702114061 - 3] & 255);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ee")
   public int method13088(int var1) {
      try {
         int var2 = this.field6954[this.field6955 * 702114061] & 255;
         if (var2 < 128) {
            if (var1 >= 16776960) {
               throw new IllegalStateException();
            } else {
               return method13039(this, -346779531) - 64;
            }
         } else {
            return method13047(this, 1484717513) - 49152;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.dy(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("eq")
   public int method13207(byte var1) {
      try {
         this.field6955 += 2103253898;
         int var2 = ((this.field6954[702114061 * this.field6955 - 2] & 255) << 8) + (this.field6954[this.field6955 * 702114061 - 1] - 128 & 0xFF);
         if (var2 > 32767) {
            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.eq(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ij")
   public String method13079() {
      byte var1 = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1];
      if (0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.method13116(-1717263042);
         if (702114061 * this.field6955 + var2 > this.field6954.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = classBF.method996(this.field6954, 702114061 * this.field6955, var2, (byte)-96);
            this.field6955 += var2 * -1095856699;
            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fh")
   public void method13034(int var1) {
      var1 = var1 << 1 ^ var1 >> 31;
      this.method13033(var1, (byte)33);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("et")
   public int method13225(int var1) {
      try {
         this.field6955 += 1007397199;
         int var2 = (this.field6954[this.field6955 * 702114061 - 1] & 255)
            + ((this.field6954[702114061 * this.field6955 - 2] & 255) << 16)
            + ((this.field6954[702114061 * this.field6955 - 3] & 255) << 8);
         if (var2 > 8388607) {
            if (var1 != 1575549434) {
               throw new IllegalStateException();
            }

            var2 -= 16777216;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.eu(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("fl")
   void method12958(int var1, boolean var2) {
      this.vmethod649(-1721927912);
      this.field6954 = classTO.method10937(var1, var2, 1154989421);
      this.field6955 = 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mw")
   public int method13219() {
      this.field6955 += 1007397199;
      int var1 = ((this.field6954[702114061 * this.field6955 - 1] & 255) << 16)
         + ((this.field6954[this.field6955 * 702114061 - 2] & 255) << 8)
         + (this.field6954[this.field6955 * 702114061 - 3] & 255);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("zg")
   public static int method13192(classXY var0) {
      if (var0 == null) {
         return var0.method13109();
      } else {
         var0.field6955 += -1455235636;
         return ((var0.field6954[var0.field6955 * 264827605 - 1] & 0xFF) << 8) + (var0.field6954[var0.field6955 * 814475767 - 2] & 0xFF);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ez")
   public void method13238(int var1, int var2) {
      try {
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 16);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 24);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.ez(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dy")
   public int method13241(int var1) {
      try {
         this.field6955 += -88459500;
         return ((this.field6954[702114061 * this.field6955 - 3] & 0xFF) << 8)
            + ((this.field6954[this.field6955 * 702114061 - 1] & 0xFF) << 24)
            + ((this.field6954[702114061 * this.field6955 - 2] & 0xFF) << 16)
            + (this.field6954[this.field6955 * 702114061 - 4] & 0xFF);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.ei(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("dw")
   public int method13246(int var1) {
      try {
         this.field6955 += -88459500;
         return ((this.field6954[this.field6955 * 702114061 - 2] & 0xFF) << 24)
            + ((this.field6954[this.field6955 * 702114061 - 1] & 0xFF) << 16)
            + ((this.field6954[this.field6955 * 702114061 - 4] & 0xFF) << 8)
            + (this.field6954[702114061 * this.field6955 - 3] & 0xFF);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.ee(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("eb")
   public int method13249(byte var1) {
      try {
         this.field6955 += -88459500;
         return (this.field6954[702114061 * this.field6955 - 2] & 0xFF)
            + ((this.field6954[this.field6955 * 702114061 - 1] & 0xFF) << 8)
            + ((this.field6954[702114061 * this.field6955 - 4] & 0xFF) << 16)
            + ((this.field6954[this.field6955 * 702114061 - 3] & 0xFF) << 24);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.eb(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laac;)J")
   @ObfuscatedName("tp")
   public static long method12956(classAAC var0) {
      return -757454725848334387L * var0.field30;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("tp")
   public static void method12980(classXY var0, int var1) {
      var0.field6954[(var0.field6955 += -1095856699) * -544099772 - 1] = (byte)(var1 >> 24);
      var0.field6954[(var0.field6955 += -2076956018) * 702114061 - 1] = (byte)(var1 >> 16);
      var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
      var0.field6954[(var0.field6955 += -1095856699) * -672089042 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "([BIII)V")
   @ObfuscatedName("ec")
   public void method13252(byte[] var1, int var2, int var3, int var4) {
      try {
         for (int var5 = var2 + var3 - 1; var5 >= var2; var5--) {
            var1[var5] = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1];
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "xy.ep(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BIII)V")
   @ObfuscatedName("ep")
   public void method13255(byte[] var1, int var2, int var3, int var4) {
      try {
         for (int var5 = var3 + var2 - 1; var5 >= var2; var5--) {
            if (var4 <= 750051714) {
               throw new IllegalStateException();
            }

            var1[var5] = (byte)(this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - 128);
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "xy.ec(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("ku")
   public static int method13193(classXY var0) {
      if (var0 == null) {
         var0.method13098();
      }

      var0.field6955 += 2103253898;
      return ((var0.field6954[var0.field6955 * 702114061 - 1] & 0xFF) << 8) + (var0.field6954[var0.field6955 * 702114061 - 2] & 0xFF);
   }

   static {
      for (int var1 = 0; var1 < 256; var1++) {
         int var0 = var1;

         for (int var2 = 0; var2 < 8; var2++) {
            if ((var0 & 1) == 1) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         field6957[var1] = var0;
      }

      for (int var5 = 0; var5 < 256; var5++) {
         long var4 = var5;

         for (int var3 = 0; var3 < 8; var3++) {
            if ((var4 & 1L) == 1L) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field6956[var5] = var4;
      }
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("jb")
   public void method13137(int[] var1, int var2, int var3) {
      int var4 = this.field6955 * 702114061;
      this.field6955 = var2 * -1095856699;
      int var5 = (var3 - var2) / 8;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = this.method13056((byte)1);
         int var8 = this.method13056((byte)1);
         int var9 = -957401312;
         int var10 = -1640531527;
         int var11 = 32;

         while (var11-- > 0) {
            var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var9 + var1[var9 >>> 11 & 3];
            var9 -= var10;
            var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
         }

         this.field6955 -= -176919000;
         this.method12979(var7, 1128193373);
         this.method12979(var8, 396811701);
      }

      this.field6955 = var4 * -1095856699;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("dx")
   public static void method13028(classXY var0, int var1) {
      if (var0 == null) {
         var0.method13104();
      }

      if ((var1 & -128) != 0) {
         if ((var1 & -16384) != 0) {
            if ((var1 & -2097152) != 0) {
               if ((var1 & -268435456) != 0) {
                  method12971(var0, var1 >>> 28 | 128, (byte)-59);
               }

               method12971(var0, var1 >>> 21 | 128, (byte)-117);
            }

            method12971(var0, var1 >>> 14 | 128, (byte)-81);
         }

         method12971(var0, var1 >>> 7 | 128, (byte)-69);
      }

      method12971(var0, var1 & 127, (byte)-98);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("gm")
   public void method13011(classXY var1) {
      method13007(this, var1.field6954, 0, var1.field6955 * 702114061, (byte)67);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("il")
   public String method13080() {
      byte var1 = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1];
      if (0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.method13116(-1432241281);
         if (702114061 * this.field6955 + var2 > this.field6954.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = classBF.method996(this.field6954, 702114061 * this.field6955, var2, (byte)-26);
            this.field6955 += var2 * -1095856699;
            return var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IZ)V")
   @ObfuscatedName("fj")
   void method12959(int var1, boolean var2) {
      this.vmethod649(-1809870631);
      this.field6954 = classTO.method10937(var1, var2, 1154989421);
      this.field6955 = 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hc")
   public int method13261() {
      return this.method13088(-1383485269);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BII)I")
   @ObfuscatedName("fd")
   static int method12961(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for (int var4 = var1; var4 < var2; var4++) {
         var3 = var3 >>> 8 ^ field6957[(var3 ^ var0[var4]) & -417317427];
      }

      return ~var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BI)I")
   @ObfuscatedName("fy")
   public static int method12962(byte[] var0, int var1) {
      return classPY.method9375(var0, 0, var1, -1989390138);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BI)I")
   @ObfuscatedName("fg")
   public static int method12963(byte[] var0, int var1) {
      return classPY.method9375(var0, 0, var1, -2033880481);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BI)I")
   @ObfuscatedName("fi")
   public static int method12964(byte[] var0, int var1) {
      return classPY.method9375(var0, 0, var1, -1786775575);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("rq")
   public int method13262() {
      return this.field6955 * 702114061;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lu")
   public int method13199() {
      this.field6955 += 2103253898;
      return ((this.field6954[702114061 * this.field6955 - 1] & 0xFF) << 8) + (this.field6954[this.field6955 * 702114061 - 2] - 467618478 & 207023864);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("fu")
   public static int method12966(String var0) {
      return var0.length() + 1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("yh")
   public int method13263() {
      return this.method13100((byte)76);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hm")
   public void method12967(int var1) {
      this.field6954[(this.field6955 += -1199341552) * 680942549 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lf")
   public void method12968(int var1) {
      this.field6954[(this.field6955 += 1128119975) * 702114061 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lp")
   public void method12969(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("gv")
   public void method12995(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field6955 = this.field6955 + classOR.method8729(var1, 0, var1.length(), this.field6954, 702114061 * this.field6955, 305293424) * -1095856699;
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fs")
   public void method12974(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 1935020851 - 1] = (byte)(var1 >> 16);
      this.field6954[(this.field6955 += -1771215539) * 702114061 - 1] = (byte)(var1 >> 8);
      this.field6954[(this.field6955 += -1095856699) * 1593212274 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hp")
   public void method12975(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 16);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
      this.field6954[(this.field6955 += 1869839175) * 702114061 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("fw")
   public int method13264() {
      return this.method13056((byte)1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("nn")
   public static void method13018(classXY var0, int var1) {
      if (var0 == null) {
         var0.method13163();
      }

      if (var1 >= 0 && var1 <= 65535) {
         var0.field6954[702114061 * var0.field6955 - var1 - 2] = (byte)(var1 >> 8);
         var0.field6954[702114061 * var0.field6955 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("hn")
   public float method13265() {
      return this.method13062(1386282862);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("co")
   public static void method13029(classXY var0, int var1) {
      if (var0 == null) {
         var0.method13181(var1);
      } else {
         if ((var1 & -128) != 0) {
            if ((var1 & -16384) != 0) {
               if ((var1 & -2097152) != 0) {
                  if ((var1 & -268435456) != 0) {
                     method12971(var0, var1 >>> 28 | 128, (byte)-18);
                  }

                  method12971(var0, var1 >>> 21 | 128, (byte)-15);
               }

               method12971(var0, var1 >>> 14 | 128, (byte)-102);
            }

            method12971(var0, var1 >>> 7 | 128, (byte)-76);
         }

         method12971(var0, var1 & 127, (byte)-94);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lb")
   public void method12976(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 16);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("fr")
   public void method12983(long var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 40);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 32);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 24);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 16);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("ff")
   public void method12984(long var1) {
      this.field6954[(this.field6955 += -1686147559) * -331654220 - 1] = (byte)(var1 >> 2052552526);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> -80594588);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 24);
      this.field6954[(this.field6955 += 1861293942) * -500881110 - 1] = (byte)(var1 >> 16);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
      this.field6954[(this.field6955 += 19499404) * 702114061 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("fe")
   public void method12985(long var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 40);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 32);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 24);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 16);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("fm")
   public void method12988(long var1) {
      this.field6954[(this.field6955 += -1603988889) * 702114061 - 1] = (byte)(var1 >> 56);
      this.field6954[(this.field6955 += -1095856699) * -14991749 - 1] = (byte)(var1 >> 48);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 826860753);
      this.field6954[(this.field6955 += 643732765) * 702114061 - 1] = (byte)(var1 >> 32);
      this.field6954[(this.field6955 += -975985165) * 656952373 - 1] = (byte)(var1 >> 24);
      this.field6954[(this.field6955 += -1095856699) * -531556949 - 1] = (byte)(var1 >> 16);
      this.field6954[(this.field6955 += -346827319) * 702114061 - 1] = (byte)(var1 >> 8);
      this.field6954[(this.field6955 += -441374056) * -281416531 - 1] = (byte)var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("sk")
   public static int method13103(classXY var0) {
      if (var0 == null) {
         var0.method13167();
      }

      int var1 = method13039(var0, -346779531);
      return var1 < 252 ? var1 : (var1 - 252 << 8) + method13039(var0, -346779531);
   }

   @ObfuscatedSignature(descriptor = "(J)V")
   @ObfuscatedName("fa")
   public void method12989(long var1) {
      this.field6954[(this.field6955 += 1022654588) * 702114061 - 1] = (byte)(var1 >> 56);
      this.field6954[(this.field6955 += -1676737851) * 702114061 - 1] = (byte)(var1 >> 48);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 506646547);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 32);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 24);
      this.field6954[(this.field6955 += -1095856699) * 102047568 - 1] = (byte)(var1 >> 16);
      this.field6954[(this.field6955 += -1095856699) * 1438090105 - 1] = (byte)(var1 >> 8);
      this.field6954[(this.field6955 += 1355663608) * -393969585 - 1] = (byte)var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)F")
   @ObfuscatedName("av")
   public static float method13063(classXY var0) {
      if (var0 == null) {
         var0.method13170();
      }

      return Float.intBitsToFloat(var0.method13056((byte)1));
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ln")
   public void method12970(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gb")
   public void method12990(boolean var1) {
      method12971(this, var1 ? 1 : 0, (byte)-91);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;Ljava/lang/String;)V")
   @ObfuscatedName("qq")
   public static void method13000(classXY var0, String var1) {
      if (var0 == null) {
         var0.method13048();
      }

      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         var0.field6954[(var0.field6955 += -1340200791) * 702114061 - 1] = 0;
         var0.field6955 = var0.field6955 + classOR.method8729(var1, 0, var1.length(), var0.field6954, 1506017435 * var0.field6955, 305293424) * -2142957717;
         var0.field6954[(var0.field6955 += -1095856699) * 128449052 - 1] = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("fw")
   public void method12991(boolean var1) {
      method12971(this, var1 ? 1 : 0, (byte)-65);
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("vt")
   public byte[] method13266() {
      return this.field6954;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("df")
   public boolean method13147(int var1) {
      try {
         this.field6955 -= -88459500;
         int var2 = classPY.method9375(this.field6954, 0, this.field6955 * 702114061, -1961045550);
         int var3 = this.method13056((byte)1);
         if (var3 == var2) {
            if (var1 >= -511275367) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "xy.df(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("gk")
   public void method12996(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field6955 = this.field6955 + classOR.method8729(var1, 0, var1.length(), this.field6954, 702114061 * this.field6955, 305293424) * 1587581883;
         this.field6954[(this.field6955 += 442244364) * 314959979 - 1] = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)V")
   @ObfuscatedName("gz")
   public void method13002(CharSequence var1) {
      int var2 = classAC.method310(var1, (byte)15);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = 0;
      method13031(this, var2, (byte)-8);
      int var3 = this.field6955;
      byte[] var5 = this.field6954;
      int var6 = this.field6955 * -1219401553;
      int var7 = var1.length();
      int var8 = var6;

      for (int var9 = 0; var9 < var7; var9++) {
         char var10 = var1.charAt(var9);
         if (var10 <= 127) {
            var5[var8++] = (byte)var10;
         } else if (var10 <= 2047) {
            var5[var8++] = (byte)(192 | var10 >> 6);
            var5[var8++] = (byte)(128 | var10 & -110900941);
         } else {
            var5[var8++] = (byte)(224 | var10 >> '\f');
            var5[var8++] = (byte)(2027591184 | var10 >> 6 & -1945094716);
            var5[var8++] = (byte)(128 | var10 & '?');
         }
      }

      int var4 = var8 - var6;
      this.field6955 = var3 + 1924630173 * var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("qu")
   public static void method13020(classXY var0, int var1) {
      if (var0 == null) {
         var0.method13021(var1);
      } else if (var1 >= 0 && var1 <= 255) {
         var0.field6954[var0.field6955 * 702114061 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)V")
   @ObfuscatedName("gp")
   public void method13003(CharSequence var1) {
      int var2 = classAC.method310(var1, (byte)74);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = 0;
      method13031(this, var2, (byte)15);
      int var3 = this.field6955;
      byte[] var5 = this.field6954;
      int var6 = this.field6955 * 1951849305;
      int var7 = var1.length();
      int var8 = var6;

      for (int var9 = 0; var9 < var7; var9++) {
         char var10 = var1.charAt(var9);
         if (var10 <= 1419252854) {
            var5[var8++] = (byte)var10;
         } else if (var10 <= 2047) {
            var5[var8++] = (byte)(-676197916 | var10 >> 6);
            var5[var8++] = (byte)(128 | var10 & 1613020380);
         } else {
            var5[var8++] = (byte)(224 | var10 >> '\f');
            var5[var8++] = (byte)(-2112376634 | var10 >> 6 & 222512753);
            var5[var8++] = (byte)(-1351942012 | var10 & '?');
         }
      }

      int var4 = var8 - var6;
      this.field6955 = var3 + -1095856699 * var4;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)V")
   @ObfuscatedName("ga")
   public void method13004(CharSequence var1) {
      int var2 = classAC.method310(var1, (byte)9);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = 0;
      method13031(this, var2, (byte)17);
      int var3 = this.field6955;
      byte[] var5 = this.field6954;
      int var6 = this.field6955 * 702114061;
      int var7 = var1.length();
      int var8 = var6;

      for (int var9 = 0; var9 < var7; var9++) {
         char var10 = var1.charAt(var9);
         if (var10 <= 127) {
            var5[var8++] = (byte)var10;
         } else if (var10 <= 2047) {
            var5[var8++] = (byte)(192 | var10 >> 6);
            var5[var8++] = (byte)(128 | var10 & '?');
         } else {
            var5[var8++] = (byte)(224 | var10 >> '\f');
            var5[var8++] = (byte)(128 | var10 >> 6 & 63);
            var5[var8++] = (byte)(128 | var10 & '?');
         }
      }

      int var4 = var8 - var6;
      this.field6955 = var3 + -1095856699 * var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("wp")
   public static int method13124(classXY var0) {
      if (var0 == null) {
         return var0.method13090();
      } else {
         int var1 = method13119(var0, -1861532550);
         return var1 >>> 1 ^ -(var1 & 1);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kb")
   public int method13163() {
      return 0 - this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)V")
   @ObfuscatedName("gw")
   public void method13005(CharSequence var1) {
      int var2 = classAC.method310(var1, (byte)54);
      this.field6954[(this.field6955 += 937734424) * -2144720155 - 1] = 0;
      method13031(this, var2, (byte)-89);
      int var3 = this.field6955;
      byte[] var5 = this.field6954;
      int var6 = this.field6955 * 763438068;
      int var7 = var1.length();
      int var8 = var6;

      for (int var9 = 0; var9 < var7; var9++) {
         char var10 = var1.charAt(var9);
         if (var10 <= -235996150) {
            var5[var8++] = (byte)var10;
         } else if (var10 <= 2047) {
            var5[var8++] = (byte)(138375470 | var10 >> 6);
            var5[var8++] = (byte)(1461619992 | var10 & 161015874);
         } else {
            var5[var8++] = (byte)(224 | var10 >> '\f');
            var5[var8++] = (byte)(-1090401455 | var10 >> 6 & 63);
            var5[var8++] = (byte)(-32890985 | var10 & -934239767);
         }
      }

      int var4 = var8 - var6;
      this.field6955 = var3 + -1095856699 * var4;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)I")
   @ObfuscatedName("jp")
   public static int method13096(classXY var0, int var1) {
      if (var0 == null) {
         var0.method13099(var1);
      }

      try {
         int var2 = var0.field6954[var0.field6955 * 702114061] & 255;
         if (var2 < 128) {
            if (var1 <= -1422727666) {
               throw new IllegalStateException();
            } else {
               return method13039(var0, -346779531) - 1;
            }
         } else {
            return method13047(var0, -128414864) - 32769;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.du(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("gg")
   public void method13008(byte[] var1, int var2, int var3) {
      for (int var4 = var2; var4 < var2 + var3; var4++) {
         this.field6954[(this.field6955 += -1748865270) * -548462840 - 1] = var1[var4];
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("gn")
   public void method13012(classXY var1) {
      method13007(this, var1.field6954, 0, var1.field6955 * 702114061, (byte)22);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("li")
   public int method13196() {
      this.field6955 += 2103253898;
      return ((this.field6954[this.field6955 * 702114061 - 2] & 0xFF) << 8) + (this.field6954[this.field6955 * 702114061 - 1] - 128 & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fk")
   public void method13019(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.field6954[763660067 * this.field6955 - var1 - 2] = (byte)(var1 >> 8);
         this.field6954[702114061 * this.field6955 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("gj")
   public void method13021(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.field6954[this.field6955 * 702114061 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fn")
   public void method13025(int var1) {
      if (var1 >= 0 && var1 < 128) {
         method12971(this, var1, (byte)-7);
      } else if (var1 >= 0 && var1 < 653603893) {
         this.method12973(32768 + var1, -1542382992);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("hl")
   void method13032(int var1) {
      while (var1 < 0 || var1 > 127) {
         method12971(this, 128 | var1 & 127, (byte)-44);
         var1 >>>= 7;
      }

      method12971(this, var1, (byte)-80);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ih")
   public String method13072() {
      int var1 = 702114061 * this.field6955;

      while (this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] != 0) {
      }

      int var2 = this.field6955 * 702114061 - var1 - 1;
      return 0 == var2 ? "" : classKQ.method6552(this.field6954, var1, var2, (byte)-118);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("mj")
   public void method13035(int var1) {
      var1 = var1 << 1 ^ var1 >> 31;
      this.method13033(var1, (byte)-32);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ks")
   public boolean method13067() {
      return (method13039(this, -346779531) & 1) == 1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cf")
   public int method13211(int var1) {
      try {
         this.field6955 += 2103253898;
         int var2 = ((this.field6954[702114061 * this.field6955 - 1] & 255) << 8) + (this.field6954[this.field6955 * 702114061 - 2] - 128 & 0xFF);
         if (var2 > 32767) {
            if (var1 <= -4371317) {
               throw new IllegalStateException();
            }

            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.er(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hu")
   public int method13048() {
      this.field6955 += 2103253898;
      int var1 = (this.field6954[336153451 * this.field6955 - 1] & 255) + ((this.field6954[702114061 * this.field6955 - 2] & -205230730) << 8);
      if (var1 > -1724683251) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hj")
   public int method13052() {
      this.field6955 += 1007397199;
      return (this.field6954[this.field6955 * 702114061 - 1] & 747140538)
         + ((this.field6954[-443083867 * this.field6955 - 2] & 0xFF) << 8)
         + ((this.field6954[this.field6955 * 702114061 - 3] & 0xFF) << 16);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;B)B")
   @ObfuscatedName("pq")
   public static byte method13169(classXY var0, byte var1) {
      if (var0 == null) {
         return var0.method13173(var1);
      } else {
         try {
            return (byte)(var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] - 128);
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "xy.ek(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ro")
   public int method13267() {
      return method13039(this, -346779531);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hq")
   public int method13055() {
      this.field6955 += 1007397199;
      int var1 = (this.field6954[this.field6955 * 702114061 - 1] & 255)
         + ((this.field6954[this.field6955 * 702114061 - 3] & 255) << 16)
         + ((this.field6954[this.field6955 * 702114061 - 2] & 255) << 8);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("hr")
   public byte method13041() {
      return this.field6954[(this.field6955 += -1095856699) * 702114061 - 1];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hy")
   public int method13057() {
      this.field6955 += -88459500;
      return (this.field6954[-1179954455 * this.field6955 - 1] & -2109733244)
         + ((this.field6954[this.field6955 * 836149807 - 2] & -409619611) << 8)
         + ((this.field6954[this.field6955 * 702114061 - 3] & 0xFF) << 16)
         + ((this.field6954[this.field6955 * 702114061 - 4] & 671493176) << 24);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hh")
   public int method13058() {
      this.field6955 += -88459500;
      return (this.field6954[702114061 * this.field6955 - 1] & 0xFF)
         + ((this.field6954[this.field6955 * -1348338299 - 2] & -1494625167) << 8)
         + ((this.field6954[this.field6955 * 2011675830 - 3] & -1451914529) << 16)
         + ((this.field6954[this.field6955 * 702114061 - 4] & 0xFF) << 24);
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("hv")
   public long method13060() {
      long var1 = this.method13056((byte)1) & 4294967295L;
      long var3 = this.method13056((byte)1) & 4294967295L;
      return var3 + (var1 << -1317137739);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("ts")
   public static void method13014(classXY var0, int var1) {
      if (var0 == null) {
         var0.method13238(var1, var1);
      } else if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         var0.field6954[158248154 * var0.field6955 - var1 - 4] = (byte)(var1 >> 24);
         var0.field6954[702114061 * var0.field6955 - var1 - 3] = (byte)(var1 >> 16);
         var0.field6954[-286122995 * var0.field6955 - var1 - 2] = (byte)(var1 >> 8);
         var0.field6954[var0.field6955 * 702114061 - var1 - 1] = (byte)var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("mk")
   public void method13189(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 + 128);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ro")
   public void method12977(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 16);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("is")
   public String method13073() {
      int var1 = 702114061 * this.field6955;

      while (this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] != 0) {
      }

      int var2 = this.field6955 * 702114061 - var1 - 1;
      return 0 == var2 ? "" : classKQ.method6552(this.field6954, var1, var2, (byte)-100);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)I")
   @ObfuscatedName("uc")
   public static int method13110(classXY var0, int var1) {
      if (var0 == null) {
         return var0.method13229(var1);
      } else {
         try {
            if (var0.field6954[var0.field6955 * 702114061] < 0) {
               return var0.method13056((byte)1) & 2147483647;
            } else {
               int var2 = method13047(var0, -174107367);
               return var2 == 32767 ? -1 : var2;
            }
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "xy.db(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("hk")
   public byte method13042() {
      return this.field6954[(this.field6955 += -1095856699) * 702114061 - 1];
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("cc")
   public void method13036(int var1, byte var2) {
      try {
         var1 = var1 << 1 ^ var1 >> 31;
         this.method13033(var1, (byte)68);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.cc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("la")
   public int method13208() {
      this.field6955 += 2052860826;
      int var1 = ((this.field6954[-1106394113 * this.field6955 - 2] & 255) << 8) + (this.field6954[this.field6955 * -695284266 - 1] - 128 & -2085775090);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("eo")
   public int method13220(int var1) {
      try {
         this.field6955 += 1007397199;
         int var2 = ((this.field6954[702114061 * this.field6955 - 1] & 255) << 16)
            + ((this.field6954[this.field6955 * 702114061 - 2] & 255) << 8)
            + (this.field6954[this.field6955 * 702114061 - 3] & 255);
         if (var2 > 8388607) {
            if (var1 >= 643717713) {
               throw new IllegalStateException();
            }

            var2 -= 16777216;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.et(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("ig")
   public static int method13097(classXY var0) {
      int var1 = var0.field6954[var0.field6955 * 1262713184] & 120713348;
      return var1 < 1324328879 ? method13039(var0, -346779531) - 1 : method13047(var0, -744827610) - 32769;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ho")
   public int method13049() {
      this.field6955 += 2103253898;
      int var1 = (this.field6954[702114061 * this.field6955 - 1] & 255) + ((this.field6954[702114061 * this.field6955 - 2] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   void vmethod650() {
      if (null != this.field6954) {
         classUA.method11237(this.field6954, 2022759572);
      }

      this.field6954 = null;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("cz")
   public int method13050(byte var1) {
      try {
         this.field6955 += 2103253898;
         int var2 = (this.field6954[702114061 * this.field6955 - 1] & 255) + ((this.field6954[702114061 * this.field6955 - 2] & 255) << 8);
         if (var2 > 32767) {
            if (var1 != 16) {
               throw new IllegalStateException();
            }

            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.cz(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("gq")
   public void method12992(boolean var1) {
      method12971(this, var1 ? 1 : 0, (byte)-81);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;[BII)V")
   @ObfuscatedName("qf")
   public static void method13256(classXY var0, byte[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.method13125();
      }

      for (int var4 = var3 + var2 - 1; var4 >= var2; var4--) {
         var1[var4] = (byte)(var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] - 128);
      }
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("qm")
   public byte method13268() {
      return method13043(this, (byte)17);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;II)V")
   @ObfuscatedName("rg")
   public static void method13022(classXY var0, int var1, int var2) {
      if (var0 == null) {
         var0.method13023(var1, var1);
      } else {
         try {
            if (var1 >= 0) {
               if (var2 <= -1365423377) {
                  return;
               }

               if (var1 <= 255) {
                  var0.field6954[var0.field6955 * 702114061 - var1 - 1] = (byte)var1;
                  return;
               }

               if (var2 <= -1365423377) {
                  throw new IllegalStateException();
               }
            }

            throw new IllegalArgumentException();
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "xy.cy(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/String;")
   @ObfuscatedName("hs")
   public static String method13074(classXY var0) {
      int var1 = 702114061 * var0.field6955;

      while (var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] != 0) {
      }

      int var2 = var0.field6955 * 702114061 - var1 - 1;
      return 0 == var2 ? "" : classKQ.method6552(var0.field6954, var1, var2, (byte)-91);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kd")
   public int method13166() {
      return 128 - this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("iw")
   public int method13089() {
      int var1 = this.field6954[this.field6955 * 193865929] & 255;
      return var1 < -2058339421 ? method13039(this, -346779531) - 979202461 : method13047(this, -557719652) - 49152;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mp")
   public int method13226() {
      this.field6955 += 1007397199;
      int var1 = (this.field6954[this.field6955 * 1049684668 - 1] & 255)
         + ((this.field6954[702114061 * this.field6955 - 2] & 2098791897) << 16)
         + ((this.field6954[-104142781 * this.field6955 - 3] & 1885754947) << 8);
      if (var1 > 8388607) {
         var1 -= -1831103933;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ia")
   public int method13092() {
      int var1 = this.field6954[this.field6955 * 702114061] & 1843144058;
      return var1 < 399892850 ? method13039(this, -346779531) : method13047(this, 1628482492) - -697614494;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("im")
   public int method13093() {
      int var1 = this.field6954[this.field6955 * 702114061] & 255;
      return var1 < 128 ? method13039(this, -346779531) : method13047(this, 362246589) - 32768;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("io")
   public int method13090() {
      int var1 = this.field6954[this.field6955 * 702114061] & 255;
      return var1 < 128 ? method13039(this, -346779531) - 64 : method13047(this, 1069490016) - 49152;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrs;Lrs;)I")
   @ObfuscatedName("lc")
   public static int method12955(classRS var0, classRS var1) {
      return -847650061 * var0.field5836 - var1.field5836 * -847650061;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("co")
   public void method13026(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 == 1222866659) {
               return;
            }

            if (var1 < 128) {
               if (var2 == 1222866659) {
                  throw new IllegalStateException();
               }

               method12971(this, var1, (byte)-10);
               return;
            }
         }

         if (var1 >= 0) {
            if (var2 == 1222866659) {
               throw new IllegalStateException();
            }

            if (var1 < 32768) {
               if (var2 == 1222866659) {
                  return;
               }

               this.method12973(32768 + var1, -1542382992);
               return;
            }
         }

         throw new IllegalArgumentException();
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.co(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ls")
   public int method13212() {
      this.field6955 += 2103253898;
      int var1 = ((this.field6954[702114061 * this.field6955 - 1] & 255) << 8) + (this.field6954[this.field6955 * 702114061 - 2] - 128 & 0xFF);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ik")
   public int method13101() {
      short var1 = 0;

      int var2;
      for (var2 = this.method13094((short)12224); 32767 == var2; var2 = this.method13094((short)13883)) {
         var1 += 32767;
      }

      return var1 + var2;
   }

   @ObfuscatedSignature(descriptor = "(S)I")
   @ObfuscatedName("di")
   public int method13094(short var1) {
      try {
         int var2 = this.field6954[this.field6955 * 702114061] & 255;
         return var2 < 128 ? method13039(this, -346779531) : method13047(this, -1234107299) - 32768;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.di(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ii")
   public int method13104() {
      int var1 = method13039(this, -346779531);
      return var1 < 252 ? var1 : (var1 - -993418956 << 8) + method13039(this, -346779531);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ju")
   public int method13108() {
      return this.field6954[203919647 * this.field6955] < 0 ? this.method13056((byte)1) & 2147483647 : method13047(this, -1407068589);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jd")
   public int method13109() {
      return this.field6954[702114061 * this.field6955] < 0 ? this.method13056((byte)1) & 2147483647 : method13047(this, 1714810987);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jz")
   public int method13111() {
      if (this.field6954[this.field6955 * 702114061] < 0) {
         return this.method13056((byte)1) & 2147483647;
      } else {
         int var1 = method13047(this, -1524327791);
         return var1 == 32767 ? -1 : var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;IB)V")
   @ObfuscatedName("hm")
   public static void method13186(classXY var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method13038(var1, var2);
      }

      try {
         var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
         var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)(128 + var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.ev(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;B)B")
   @ObfuscatedName("ni")
   public static byte method13043(classXY var0, byte var1) {
      if (var0 == null) {
         var0.method13044(var1);
      }

      try {
         return var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1];
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.cn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jq")
   public int method13112() {
      if (this.field6954[this.field6955 * 702114061] < 0) {
         return this.method13056((byte)1) & -1283242690;
      } else {
         int var1 = method13047(this, -11953539);
         return var1 == 32767 ? -1 : var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ja")
   public int method13114() {
      byte var1 = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1];

      int var2;
      for (var2 = 0; var1 < 0; var1 = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   public classXY(int var1) {
      byte[] var2 = classTO.method10937(var1, false, 1154989421);
      this.field6954 = var2;
      this.field6955 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lxf;)I")
   @ObfuscatedName("ji")
   public int method13118(classXF var1) {
      switch (var1.vmethod648((byte)32).field6930 * 539966297) {
         case 0:
            return method13043(this, (byte)17);
         case 1:
            return method13039(this, -346779531);
         case 2:
            return this.method13050((byte)16);
         case 3:
            return method13047(this, -1118158241);
         case 4:
            return this.method13053(831951752);
         case 5:
            return this.method13051(-758448158);
         case 6:
            return this.method13056((byte)1);
         default:
            throw new IllegalArgumentException();
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jn")
   public int method13120() {
      int var2 = 0;
      byte var3 = 0;

      int var1;
      do {
         var1 = method13039(this, -346779531);
         var2 |= (var1 & 127) << var3;
         var3 += 7;
      } while (var1 > -146359649);

      return var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)V")
   @ObfuscatedName("gc")
   public void method13006(CharSequence var1) {
      int var2 = classAC.method310(var1, (byte)84);
      this.field6954[(this.field6955 += -1095856699) * -580813439 - 1] = 0;
      method13031(this, var2, (byte)26);
      int var3 = this.field6955;
      byte[] var5 = this.field6954;
      int var6 = this.field6955 * -1107026129;
      int var7 = var1.length();
      int var8 = var6;

      for (int var9 = 0; var9 < var7; var9++) {
         char var10 = var1.charAt(var9);
         if (var10 <= 276343490) {
            var5[var8++] = (byte)var10;
         } else if (var10 <= 2047) {
            var5[var8++] = (byte)(-427086650 | var10 >> 6);
            var5[var8++] = (byte)(1838949323 | var10 & 406853741);
         } else {
            var5[var8++] = (byte)(224 | var10 >> '\f');
            var5[var8++] = (byte)(-1595117182 | var10 >> 6 & 63);
            var5[var8++] = (byte)(1584480419 | var10 & '?');
         }
      }

      int var4 = var8 - var6;
      this.field6955 = var3 + -937760916 * var4;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jo")
   public int method13125() {
      int var1 = method13119(this, -1164554069);
      return var1 >>> 1 ^ -(var1 & 1);
   }

   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("jt")
   public void method13128(int[] var1) {
      int var2 = this.field6955 * 702114061 / 8;
      this.field6955 = 0;

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = this.method13056((byte)1);
         int var5 = this.method13056((byte)1);
         int var6 = 0;
         int var7 = -1640531527;
         int var8 = 32;

         while (var8-- > 0) {
            var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var6 & 3] + var6;
            var6 += var7;
            var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
         }

         this.field6955 -= -176919000;
         this.method12979(var4, -707461072);
         this.method12979(var5, 1626500652);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;[III)V")
   @ObfuscatedName("wb")
   public static void method13134(classXY var0, int[] var1, int var2, int var3) {
      int var4 = 1292325706 * var0.field6955;
      var0.field6955 = -1254940865 * var2;
      int var5 = (var3 - var2) / 8;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = var0.method13056((byte)1);
         int var8 = var0.method13056((byte)1);
         int var9 = 0;
         int var10 = 2104204502;
         int var11 = 32;

         while (var11-- > 0) {
            var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
            var9 += var10;
            var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
         }

         var0.field6955 -= 853303095;
         var0.method12979(var7, -524666268);
         var0.method12979(var8, -92347503);
      }

      var0.field6955 = var4 * -1783043332;
   }

   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("jm")
   public void method13129(int[] var1) {
      int var2 = this.field6955 * 1215515737 / 8;
      this.field6955 = 0;

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = this.method13056((byte)1);
         int var5 = this.method13056((byte)1);
         int var6 = 0;
         int var7 = -320058636;
         int var8 = 1124338910;

         while (var8-- > 0) {
            var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var6 & 3] + var6;
            var6 += var7;
            var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
         }

         this.field6955 -= -176919000;
         this.method12979(var4, 2052674087);
         this.method12979(var5, -334843501);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ig")
   public String method13076() {
      byte var1 = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1];
      if (0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = 1519465169 * this.field6955;

         while (this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] != 0) {
         }

         int var3 = 1740595012 * this.field6955 - var2 - 1;
         return 0 == var3 ? "" : classKQ.method6552(this.field6954, var2, var3, (byte)-52);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lv")
   public int method13204() {
      this.field6955 += 2103253898;
      int var1 = ((this.field6954[702114061 * this.field6955 - 1] & 255) << 8) + (this.field6954[702114061 * this.field6955 - 2] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;IB)V")
   @ObfuscatedName("vd")
   public static void method12971(classXY var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method12972(var1, var2);
      }

      try {
         var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.bl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("jj")
   public void method13133(int[] var1) {
      int var2 = 702114061 * this.field6955 / 8;
      this.field6955 = 0;

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = this.method13056((byte)1);
         int var5 = this.method13056((byte)1);
         int var6 = -957401312;
         int var7 = -1640531527;
         int var8 = 32;

         while (var8-- > 0) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var6 + var1[var6 >>> 11 & 3];
            var6 -= var7;
            var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var6 & 3] + var6;
         }

         this.field6955 -= -176919000;
         this.method12979(var4, 737109350);
         this.method12979(var5, 1771558898);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("md")
   public int method13250() {
      this.field6955 += -397441016;
      return (this.field6954[702114061 * this.field6955 - 2] & 0xFF)
         + ((this.field6954[this.field6955 * 702114061 - 1] & 0xFF) << 8)
         + ((this.field6954[702114061 * this.field6955 - 4] & 0xFF) << 16)
         + ((this.field6954[this.field6955 * 702114061 - 3] & 1854004724) << 24);
   }

   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("jy")
   public void method13138(int[] var1, int var2, int var3) {
      int var4 = this.field6955 * 702114061;
      this.field6955 = var2 * -1095856699;
      int var5 = (var3 - var2) / 8;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = this.method13056((byte)1);
         int var8 = this.method13056((byte)1);
         int var9 = -1355758882;
         int var10 = -1640531527;
         int var11 = 32;

         while (var11-- > 0) {
            var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var9 + var1[var9 >>> 11 & 3];
            var9 -= var10;
            var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
         }

         this.field6955 -= -79212316;
         this.method12979(var7, -475285763);
         this.method12979(var8, -617899535);
      }

      this.field6955 = var4 * -1095856699;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("hn")
   public static void method13157(classXY var0, int var1) {
      var0.field6954[(var0.field6955 += -1095856699) * -764142065 - 1] = (byte)(128 - var1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ms")
   public int method13247() {
      this.field6955 += -88459500;
      return ((this.field6954[this.field6955 * 702114061 - 2] & 0xFF) << 24)
         + ((this.field6954[this.field6955 * 702114061 - 1] & 0xFF) << 16)
         + ((this.field6954[this.field6955 * 702114061 - 4] & 0xFF) << 8)
         + (this.field6954[702114061 * this.field6955 - 3] & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
   @ObfuscatedName("jk")
   public void method13141(BigInteger var1, BigInteger var2) {
      int var3 = this.field6955 * 1120276224;
      this.field6955 = 0;
      byte[] var4 = new byte[var3];
      this.method13084(var4, 0, var3, (byte)125);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.field6955 = 0;
      this.method12973(var7.length, -1542382992);
      method13007(this, var7, 0, var7.length, (byte)15);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
   @ObfuscatedName("ke")
   public void method13142(BigInteger var1, BigInteger var2) {
      int var3 = this.field6955 * 702114061;
      this.field6955 = 0;
      byte[] var4 = new byte[var3];
      this.method13084(var4, 0, var3, (byte)106);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.field6955 = 0;
      this.method12973(var7.length, -1542382992);
      method13007(this, var7, 0, var7.length, (byte)56);
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("dc")
   public String method13077(int var1) {
      try {
         byte var2 = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1];
         if (0 != var2) {
            throw new IllegalStateException("");
         } else {
            int var3 = 702114061 * this.field6955;

            while (this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] != 0) {
            }

            int var4 = 702114061 * this.field6955 - var3 - 1;
            if (0 == var4) {
               if (var1 == 1596161501) {
                  throw new IllegalStateException();
               } else {
                  return "";
               }
            } else {
               return classKQ.method6552(this.field6954, var3, var4, (byte)-2);
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "xy.dd(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("hs")
   public boolean method13148() {
      this.field6955 -= -88459500;
      int var1 = classPY.method9375(this.field6954, 0, this.field6955 * 702114061, -1397183401);
      int var2 = this.method13056((byte)1);
      return var2 == var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ir")
   public boolean method13149() {
      this.field6955 -= -88459500;
      int var1 = classPY.method9375(this.field6954, 0, this.field6955 * 3251480, -1702057589);
      int var2 = this.method13056((byte)1);
      return var2 == var1;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ca")
   void method13033(int var1, byte var2) {
      try {
         while (true) {
            if (var1 >= 0) {
               if (var2 == 1) {
                  throw new IllegalStateException();
               }

               if (var1 <= 127) {
                  method12971(this, var1, (byte)-15);
                  return;
               }

               if (var2 == 1) {
                  return;
               }
            }

            method12971(this, 128 | var1 & 127, (byte)-6);
            var1 >>>= 7;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.ca(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("zd")
   public void method13154(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(0 - var1);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ge")
   public void method13155(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(0 - var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("nu")
   public static int method13095(classXY var0) {
      if (var0 == null) {
         var0.method13106();
      }

      int var1 = var0.field6954[var0.field6955 * 702114061] & 1104873993;
      return var1 < 128 ? method13039(var0, -346779531) : method13047(var0, -1091999984) - 32768;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;IB)V")
   @ObfuscatedName("yg")
   public static void method13180(classXY var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method13184(var1, var2);
      }

      try {
         var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
         var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.ed(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ld")
   public int method13216() {
      this.field6955 += 1007397199;
      return ((this.field6954[702114061 * this.field6955 - 2] & 0xFF) << 8)
         + ((this.field6954[702114061 * this.field6955 - 1] & 0xFF) << 16)
         + (this.field6954[702114061 * this.field6955 - 3] & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ip")
   public int method13105() {
      int var1 = method13039(this, -346779531);
      return var1 < 252 ? var1 : (var1 - 252 << 8) + method13039(this, -346779531);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("kt")
   public int method13160() {
      return this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - 128 & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ic")
   public int method13098() {
      int var1 = this.field6954[this.field6955 * 702114061] & 255;
      return var1 < 128 ? method13039(this, -346779531) - 1 : method13047(this, -1562734945) - 32769;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ku")
   public int method13167() {
      return 128 - this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("na")
   public void method13269(byte[] var1, int var2, int var3) {
      this.method13084(var1, var2, var3, (byte)94);
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("kk")
   public byte method13170() {
      return (byte)(this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - 128);
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("kc")
   public byte method13171() {
      return (byte)(this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - 128);
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("kz")
   public byte method13172() {
      return (byte)(this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - 128);
   }

   @ObfuscatedSignature(descriptor = "()B")
   @ObfuscatedName("kh")
   public byte method13177() {
      return (byte)(1569037615 - this.field6954[(this.field6955 += -2107936509) * -1624266703 - 1]);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("kq")
   public void method13181(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fv")
   public void method13182(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lh")
   public void method13270(int var1) {
      this.field6955 = var1 * -1095856699;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lz")
   public void method13183(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BI)I")
   @ObfuscatedName("fb")
   public static int method12965(byte[] var0, int var1) {
      return classPY.method9375(var0, 0, var1, -1868039813);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)B")
   @ObfuscatedName("td")
   public static byte method13178(classXY var0) {
      return (byte)(-21296263 - var0.field6954[(var0.field6955 += 1983978372) * 702114061 - 1]);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("qt")
   public int method13271() {
      return method13047(this, -1008441641);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fp")
   public void method13190(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 1723032646 - 1] = (byte)(var1 + 128);
      this.field6954[(this.field6955 += -1095856699) * -615007973 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("io")
   public void method13272(String var1) {
      method12997(this, var1, (short)8579);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ix")
   public String method13075() {
      int var1 = 702114061 * this.field6955;

      while (this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] != 0) {
      }

      int var2 = this.field6955 * 702114061 - var1 - 1;
      return 0 == var2 ? "" : classKQ.method6552(this.field6954, var1, var2, (byte)-46);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lr")
   public int method13209() {
      this.field6955 += 2103253898;
      int var1 = ((this.field6954[702114061 * this.field6955 - 2] & 255) << 8) + (this.field6954[this.field6955 * 702114061 - 1] - 128 & 0xFF);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lx")
   public int method13200() {
      this.field6955 += 2103253898;
      return ((this.field6954[702114061 * this.field6955 - 1] & 0xFF) << 8) + (this.field6954[this.field6955 * 702114061 - 2] - 128 & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("in")
   public String method13081() {
      byte var1 = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1];
      if (0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.method13116(-2142495228);
         if (702114061 * this.field6955 + var2 > this.field6954.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = classBF.method996(this.field6954, 702114061 * this.field6955, var2, (byte)-53);
            this.field6955 += var2 * -1095856699;
            return var3;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/String;")
   @ObfuscatedName("fq")
   public static String method13070(classXY var0) {
      if (var0.field6954[-1756316449 * var0.field6955] == 0) {
         var0.field6955 += 1755796878;
         return null;
      } else {
         return var0.method13071(290401256);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   void vmethod651() {
      if (null != this.field6954) {
         classUA.method11237(this.field6954, 2022759572);
      }

      this.field6954 = null;
   }

   @ObfuscatedSignature(descriptor = "(B)B")
   @ObfuscatedName("ej")
   public byte method13179(byte var1) {
      try {
         return (byte)(128 - this.field6954[(this.field6955 += -1095856699) * 702114061 - 1]);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.ej(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fq")
   public void method13273(int var1) {
      this.method12979(var1, 1840758601);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)I")
   @ObfuscatedName("du")
   public static int method13194(classXY var0, int var1) {
      if (var0 == null) {
         var0.method13195(var1);
      }

      try {
         var0.field6955 += 2103253898;
         return ((var0.field6954[var0.field6955 * 702114061 - 1] & 0xFF) << 8) + (var0.field6954[var0.field6955 * 702114061 - 2] & 0xFF);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.eh(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lo")
   public int method13210() {
      this.field6955 += -26810507;
      int var1 = ((this.field6954[702114061 * this.field6955 - 2] & -246843815) << 8) + (this.field6954[this.field6955 * 702114061 - 1] - 128 & 0xFF);
      if (var1 > -783748228) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lw")
   public int method13205() {
      this.field6955 += 2103253898;
      int var1 = ((this.field6954[702114061 * this.field6955 - 1] & 2143870035) << 8) + (this.field6954[702114061 * this.field6955 - 2] & -878567563);
      if (var1 > -1832339327) {
         var1 -= 65536;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("vw")
   public static int method13221(classXY var0) {
      if (var0 == null) {
         var0.method13209();
      }

      var0.field6955 += 1007397199;
      int var1 = ((var0.field6954[702114061 * var0.field6955 - 1] & 255) << 8)
         + ((var0.field6954[702114061 * var0.field6955 - 3] & 255) << 16)
         + (var0.field6954[702114061 * var0.field6955 - 2] & 255);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;IZ)V")
   @ObfuscatedName("dj")
   public static void method12960(classXY var0, int var1, boolean var2) {
      if (var0 == null) {
         var0.method13080();
      }

      var0.vmethod649(-1634418800);
      var0.field6954 = classTO.method10937(var1, var2, 1154989421);
      var0.field6955 = 0;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("le")
   public int method13217() {
      this.field6955 += 1007397199;
      return ((this.field6954[702114061 * this.field6955 - 2] & 0xFF) << 8)
         + ((this.field6954[702114061 * this.field6955 - 1] & 0xFF) << 16)
         + (this.field6954[702114061 * this.field6955 - 3] & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("mg")
   public void method13191(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 + 128);
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("cv")
   public void method13015(int var1, byte var2) {
      try {
         if (var1 < 0) {
            if (var2 == 104) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            this.field6954[702114061 * this.field6955 - var1 - 4] = (byte)(var1 >> 24);
            this.field6954[702114061 * this.field6955 - var1 - 3] = (byte)(var1 >> 16);
            this.field6954[702114061 * this.field6955 - var1 - 2] = (byte)(var1 >> 8);
            this.field6954[this.field6955 * 702114061 - var1 - 1] = (byte)var1;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.cv(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("ky")
   public static int method13113(classXY var0) {
      if (var0.field6954[var0.field6955 * 702114061] < 0) {
         return var0.method13056((byte)1) & 1101508388;
      } else {
         int var1 = method13047(var0, 673927479);
         return var1 == 902300339 ? -1 : var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;J)V")
   @ObfuscatedName("vt")
   public static void method12986(classXY var0, long var1) {
      if (var0 == null) {
         var0.method13263();
      }

      var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 40);
      var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 32);
      var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 24);
      var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 16);
      var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
      var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jf")
   public int method13115() {
      byte var1 = this.field6954[(this.field6955 += -607032926) * 702114061 - 1];

      int var2;
      for (var2 = 0; var1 < 0; var1 = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1]) {
         var2 = (var2 | var1 & -92018440) << 7;
      }

      return var2 | var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/String;")
   @ObfuscatedName("hd")
   public static String method13078(classXY var0) {
      byte var1 = var0.field6954[(var0.field6955 += -1095856699) * 2046008688 - 1];
      if (0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = -932858373 * var0.field6955;

         while (var0.field6954[(var0.field6955 += -1509055837) * 1003278507 - 1] != 0) {
         }

         int var3 = 702114061 * var0.field6955 - var2 - 1;
         return 0 == var3 ? "" : classKQ.method6552(var0.field6954, var2, var3, (byte)-9);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mn")
   public int method13222() {
      this.field6955 += -1319131602;
      int var1 = ((this.field6954[702114061 * this.field6955 - 1] & 255) << 8)
         + ((this.field6954[-597300105 * this.field6955 - 3] & 1919200966) << 16)
         + (this.field6954[702114061 * this.field6955 - 2] & 1689718682);
      if (var1 > 1780502241) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("kb")
   public static void method13152(classXY var0, int var1) {
      var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 + -2060422152);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mb")
   public int method13227() {
      this.field6955 += 1007397199;
      int var1 = (this.field6954[this.field6955 * 702114061 - 1] & 255)
         + ((this.field6954[702114061 * this.field6955 - 2] & 255) << 16)
         + ((this.field6954[702114061 * this.field6955 - 3] & 255) << 8);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mf")
   public int method13228() {
      this.field6955 += 1007397199;
      int var1 = (this.field6954[this.field6955 * 702114061 - 1] & 255)
         + ((this.field6954[702114061 * this.field6955 - 2] & -1024288003) << 16)
         + ((this.field6954[702114061 * this.field6955 - 3] & -1857014102) << 8);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;[I)V")
   @ObfuscatedName("fy")
   public static void method13130(classXY var0, int[] var1) {
      int var2 = var0.field6955 * 567469678 / 8;
      var0.field6955 = 0;

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = var0.method13056((byte)1);
         int var5 = var0.method13056((byte)1);
         int var6 = 0;
         int var7 = -1640531527;
         int var8 = -472401010;

         while (var8-- > 0) {
            var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var6 & 3] + var6;
            var6 += var7;
            var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
         }

         var0.field6955 -= -176919000;
         var0.method12979(var4, 446561558);
         var0.method12979(var5, 1300884961);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("du")
   public int method13116(int var1) {
      try {
         byte var2 = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1];

         int var3;
         for (var3 = 0; var2 < 0; var2 = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1]) {
            if (var1 >= -488065562) {
               throw new IllegalStateException();
            }

            var3 = (var3 | var2 & 127) << 7;
         }

         return var3 | var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "xy.dw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)I")
   @ObfuscatedName("ln")
   public static int method13197(classXY var0, int var1) {
      if (var0 == null) {
         return var0.method13168(var1);
      } else {
         try {
            var0.field6955 += 2103253898;
            return ((var0.field6954[var0.field6955 * 702114061 - 2] & 0xFF) << 8) + (var0.field6954[var0.field6955 * 702114061 - 1] - 128 & 0xFF);
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "xy.eg(" + 41);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("jq")
   public static int method13242(classXY var0) {
      if (var0 == null) {
         var0.method13265();
      }

      var0.field6955 += -88459500;
      return ((var0.field6954[702114061 * var0.field6955 - 3] & 0xFF) << 8)
         + ((var0.field6954[var0.field6955 * 702114061 - 1] & 0xFF) << 24)
         + ((var0.field6954[702114061 * var0.field6955 - 2] & 0xFF) << 16)
         + (var0.field6954[var0.field6955 * 702114061 - 4] & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ka")
   public void method13233(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
      this.field6954[(this.field6955 += -523510191) * -1602272621 - 1] = (byte)(var1 >> 16);
      this.field6954[(this.field6955 += -1095856699) * 108914099 - 1] = (byte)(var1 >> 24);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("fz")
   public void method13236(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 1011851338 - 1] = (byte)(var1 >> 8);
      this.field6954[(this.field6955 += -1948244849) * 702114061 - 1] = (byte)var1;
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 24);
      this.field6954[(this.field6955 += 1648634503) * 702114061 - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bp")
   public void method13237(int var1) {
      this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
      this.field6954[(this.field6955 += -1095856699) * 587433947 - 1] = (byte)var1;
      this.field6954[(this.field6955 += -1095856699) * 1727043761 - 1] = (byte)(var1 >> 24);
      this.field6954[(this.field6955 += -1095856699) * -275353355 - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lj")
   public void method13239(int var1) {
      this.field6954[(this.field6955 += 1284233221) * 702114061 - 1] = (byte)(var1 >> 16);
      this.field6954[(this.field6955 += -1719166144) * 1826159714 - 1] = (byte)(var1 >> 24);
      this.field6954[(this.field6955 += -1095856699) * 1119306866 - 1] = (byte)var1;
      this.field6954[(this.field6955 += -1095856699) * -510214640 - 1] = (byte)(var1 >> 8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;[BII)V")
   @ObfuscatedName("yt")
   public static void method13086(classXY var0, byte[] var1, int var2, int var3) {
      if (var0 == null) {
         var0.method13087(var1, var2, var2);
      } else {
         for (int var4 = var2; var4 < var2 + var3; var4++) {
            var1[var4] = var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("me")
   public int method13243() {
      this.field6955 += -88459500;
      return ((this.field6954[702114061 * this.field6955 - 3] & 0xFF) << 8)
         + ((this.field6954[this.field6955 * 702114061 - 1] & 0xFF) << 24)
         + ((this.field6954[702114061 * this.field6955 - 2] & 0xFF) << 16)
         + (this.field6954[this.field6955 * 702114061 - 4] & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mt")
   public int method13244() {
      this.field6955 += -88459500;
      return ((this.field6954[702114061 * this.field6955 - 3] & 0xFF) << 8)
         + ((this.field6954[this.field6955 * 702114061 - 1] & 0xFF) << 24)
         + ((this.field6954[702114061 * this.field6955 - 2] & 0xFF) << 16)
         + (this.field6954[this.field6955 * 702114061 - 4] & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;Ljava/lang/String;S)V")
   @ObfuscatedName("ee")
   public static void method12997(classXY var0, String var1, short var2) {
      if (var0 == null) {
         var0.method12998(var1, var2);
      } else {
         try {
            int var3 = var1.indexOf(0);
            if (var3 >= 0) {
               if (var2 <= 185) {
                  throw new IllegalStateException();
               } else {
                  throw new IllegalArgumentException("");
               }
            } else {
               var0.field6955 = var0.field6955
                  + classOR.method8729(var1, 0, var1.length(), var0.field6954, 702114061 * var0.field6955, 305293424) * -1095856699;
               var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = 0;
            }
         } catch (RuntimeException var4) {
            throw classEG.method3884(var4, "xy.ct(" + ')');
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;Lxy;)V")
   @ObfuscatedName("xl")
   public static void method13013(classXY var0, classXY var1) {
      if (var0 == null) {
         var0.method13216();
      }

      method13007(var0, var1.field6954, 0, var1.field6955 * 702114061, (byte)114);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lc")
   public int method13201() {
      this.field6955 += 2103253898;
      return ((this.field6954[702114061 * this.field6955 - 1] & 0xFF) << 8) + (this.field6954[this.field6955 * 702114061 - 2] - 128 & 0xFF);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)Z")
   @ObfuscatedName("kd")
   public static boolean method13150(classXY var0) {
      if (var0 == null) {
         var0.method13251();
      }

      var0.field6955 -= -88459500;
      int var1 = classPY.method9375(var0.field6954, 0, var0.field6955 * 702114061, -1848030444);
      int var2 = var0.method13056((byte)1);
      return var2 == var1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("kp")
   public int method13164(int var1) {
      try {
         return 0 - this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] & 0xFF;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.ey(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)Ljava/lang/String;")
   @ObfuscatedName("yd")
   public static String method13082(classXY var0, int var1) {
      if (var0 == null) {
         var0.method13083(var1);
      }

      try {
         byte var2 = var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1];
         if (0 != var2) {
            if (var1 == -67173954) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            int var3 = var0.method13116(-1673473703);
            if (702114061 * var0.field6955 + var3 > var0.field6954.length) {
               if (var1 == -67173954) {
                  throw new IllegalStateException();
               } else {
                  throw new IllegalStateException("");
               }
            } else {
               String var4 = classBF.method996(var0.field6954, 702114061 * var0.field6955, var3, (byte)-5);
               var0.field6955 += var3 * -1095856699;
               return var4;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "xy.dm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("hc")
   public long method13061() {
      long var1 = this.method13056((byte)1) & 4294967295L;
      long var3 = this.method13056((byte)1) & 4294967295L;
      return var3 + (var1 << 32);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("lk")
   public int method13213() {
      this.field6955 += 2103253898;
      int var1 = ((this.field6954[702114061 * this.field6955 - 1] & 659833714) << 8) + (this.field6954[this.field6955 * 418609119 - 2] - 1546368771 & 0xFF);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("mh")
   public int method13251() {
      this.field6955 += -88459500;
      return (this.field6954[702114061 * this.field6955 - 2] & 373161518)
         + ((this.field6954[this.field6955 * 1270135386 - 1] & 591869391) << 8)
         + ((this.field6954[-989019978 * this.field6955 - 4] & 0xFF) << 16)
         + ((this.field6954[this.field6955 * 702114061 - 3] & 0xFF) << 24);
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("mv")
   public void method13253(byte[] var1, int var2, int var3) {
      for (int var4 = var2 + var3 - 1; var4 >= var2; var4--) {
         var1[var4] = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1];
      }
   }

   @ObfuscatedSignature(descriptor = "([IIII)V")
   @ObfuscatedName("dg")
   public void method13135(int[] var1, int var2, int var3, int var4) {
      try {
         int var5 = 702114061 * this.field6955;
         this.field6955 = -1095856699 * var2;
         int var6 = (var3 - var2) / 8;

         for (int var7 = 0; var7 < var6; var7++) {
            if (var4 <= 1347323342) {
               throw new IllegalStateException();
            }

            int var8 = this.method13056((byte)1);
            int var9 = this.method13056((byte)1);
            int var10 = 0;
            int var11 = -1640531527;
            int var12 = 32;

            while (var12-- > 0) {
               if (var4 <= 1347323342) {
                  throw new IllegalStateException();
               }

               var8 += var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3];
               var10 += var11;
               var9 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
            }

            this.field6955 -= -176919000;
            this.method12979(var8, -650528597);
            this.method12979(var9, 1975893354);
         }

         this.field6955 = var5 * -1095856699;
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "xy.do(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)I")
   @ObfuscatedName("lr")
   public static int method13223(classXY var0, int var1) {
      if (var0 == null) {
         return var0.method13224(var1);
      } else {
         try {
            var0.field6955 += 1007397199;
            int var2 = ((var0.field6954[702114061 * var0.field6955 - 1] & 255) << 8)
               + ((var0.field6954[702114061 * var0.field6955 - 3] & 255) << 16)
               + (var0.field6954[702114061 * var0.field6955 - 2] & 255);
            if (var2 > 8388607) {
               var2 -= 16777216;
            }

            return var2;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "xy.ew(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("my")
   public void method13257(byte[] var1, int var2, int var3) {
      for (int var4 = var3 + var2 - 1; var4 >= var2; var4--) {
         var1[var4] = (byte)(this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - 128);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
   @ObfuscatedName("sv")
   public static void method13143(classXY var0, BigInteger var1, BigInteger var2) {
      int var3 = var0.field6955 * 702114061;
      var0.field6955 = 0;
      byte[] var4 = new byte[var3];
      var0.method13084(var4, 0, var3, (byte)6);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      var0.field6955 = 0;
      var0.method12973(var7.length, -1542382992);
      method13007(var0, var7, 0, var7.length, (byte)58);
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("bh")
   public void method13037(int var1, byte var2) {
      try {
         var1 = var1 << 1 ^ var1 >> 31;
         this.method13033(var1, (byte)68);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.cc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ZI)V")
   @ObfuscatedName("cb")
   public void method12993(boolean var1, int var2) {
      try {
         byte var10001;
         if (var1) {
            if (var2 != -1737488759) {
               return;
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         method12971(this, var10001, (byte)-108);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.cb(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;S)V")
   @ObfuscatedName("ct")
   public void method12998(String var1, short var2) {
      try {
         int var3 = var1.indexOf(0);
         if (var3 >= 0) {
            if (var2 <= 185) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException("");
            }
         } else {
            this.field6955 = this.field6955 + classOR.method8729(var1, 0, var1.length(), this.field6954, 702114061 * this.field6955, 305293424) * -1095856699;
            this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = 0;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "xy.ct(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)B")
   @ObfuscatedName("cn")
   public byte method13044(byte var1) {
      try {
         return this.field6954[(this.field6955 += -1095856699) * 702114061 - 1];
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.cn(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("vp")
   public static int method13161(classXY var0) {
      return var0.field6954[(var0.field6955 += -823724438) * 702114061 - 1] - 128 & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ey")
   public int method13046(int var1) {
      try {
         this.field6955 += 2103253898;
         return ((this.field6954[702114061 * this.field6955 - 2] & 0xFF) << 8) + (this.field6954[this.field6955 * 702114061 - 1] & 0xFF);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.ch(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;)I")
   @ObfuscatedName("kt")
   public static int method13248(classXY var0) {
      if (var0 == null) {
         var0.method13196();
      }

      var0.field6955 += -88459500;
      return ((var0.field6954[var0.field6955 * 702114061 - 2] & 0xFF) << 24)
         + ((var0.field6954[var0.field6955 * 702114061 - 1] & 0xFF) << 16)
         + ((var0.field6954[var0.field6955 * 702114061 - 4] & 0xFF) << 8)
         + (var0.field6954[702114061 * var0.field6955 - 3] & 0xFF);
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("dd")
   public String method13083(int var1) {
      try {
         byte var2 = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1];
         if (0 != var2) {
            if (var1 == -67173954) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            int var3 = this.method13215(-1673473703);
            if (702114061 * this.field6955 + var3 > this.field6954.length) {
               if (var1 == -67173954) {
                  throw new IllegalStateException();
               } else {
                  throw new IllegalStateException("");
               }
            } else {
               String var4 = classBF.method996(this.field6954, 702114061 * this.field6955, var3, (byte)-5);
               this.field6955 += var3 * -1095856699;
               return var4;
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "xy.dm(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("dr")
   public int method13206(byte var1) {
      try {
         this.field6955 += 2103253898;
         int var2 = ((this.field6954[702114061 * this.field6955 - 1] & 255) << 8) + (this.field6954[702114061 * this.field6955 - 2] & 255);
         if (var2 > 32767) {
            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.ex(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)I")
   @ObfuscatedName("yl")
   public static int method13047(classXY var0, int var1) {
      if (var0 == null) {
         var0.method13046(var1);
      }

      try {
         var0.field6955 += 2103253898;
         return ((var0.field6954[702114061 * var0.field6955 - 2] & 0xFF) << 8) + (var0.field6954[var0.field6955 * 702114061 - 1] & 0xFF);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.ch(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ei")
   public int method13229(int var1) {
      try {
         this.field6955 += 1007397199;
         int var2 = (this.field6954[this.field6955 * 702114061 - 1] & 255)
            + ((this.field6954[702114061 * this.field6955 - 2] & 255) << 16)
            + ((this.field6954[702114061 * this.field6955 - 3] & 255) << 8);
         if (var2 > 8388607) {
            if (var1 != 1575549434) {
               throw new IllegalStateException();
            }

            var2 -= 16777216;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.eu(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cg")
   public int method13168(int var1) {
      try {
         return 128 - this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] & 0xFF;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.ea(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ed")
   public void method13184(int var1, byte var2) {
      try {
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.ed(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("eg")
   public int method13224(int var1) {
      try {
         this.field6955 += 1007397199;
         int var2 = ((this.field6954[702114061 * this.field6955 - 1] & 255) << 8)
            + ((this.field6954[702114061 * this.field6955 - 3] & 255) << 16)
            + (this.field6954[702114061 * this.field6955 - 2] & 255);
         if (var2 > 8388607) {
            var2 -= 16777216;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.ew(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)I")
   @ObfuscatedName("lk")
   public static int method13039(classXY var0, int var1) {
      if (var0 == null) {
         var0.method13231(var1);
      }

      try {
         return var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] & 0xFF;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.cf(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("iu")
   public int method13106() {
      int var1 = method13039(this, -346779531);
      return var1 < 252 ? var1 : (var1 - 252 << 8) + method13039(this, -346779531);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ch")
   public int method13099(int var1) {
      try {
         int var2 = this.field6954[this.field6955 * 702114061] & 255;
         if (var2 < 128) {
            if (var1 <= -1422727666) {
               throw new IllegalStateException();
            } else {
               return method13039(this, -346779531) - 1;
            }
         } else {
            return method13047(this, -128414864) - 32769;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.du(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("hf")
   public int method13040() {
      return this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ck")
   public void method13030(int var1, byte var2) {
      try {
         if ((var1 & -128) != 0) {
            if ((var1 & -16384) != 0) {
               if (var2 == 1) {
                  return;
               }

               if ((var1 & -2097152) != 0) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if ((var1 & -268435456) != 0) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     method12971(this, var1 >>> 28 | 128, (byte)-115);
                  }

                  method12971(this, var1 >>> 21 | 128, (byte)-72);
               }

               method12971(this, var1 >>> 14 | 128, (byte)-27);
            }

            method12971(this, var1 >>> 7 | 128, (byte)-12);
         }

         method12971(this, var1 & 127, (byte)-13);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.ck(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()F")
   @ObfuscatedName("jv")
   public float method13064() {
      return Float.intBitsToFloat(this.method13122((byte)1));
   }

   @ObfuscatedSignature(descriptor = "([BII)V")
   @ObfuscatedName("iz")
   public void method13087(byte[] var1, int var2, int var3) {
      for (int var4 = var2; var4 < var2 + var3; var4++) {
         var1[var4] = this.field6954[(this.field6955 += -1095856699) * 702114061 - 1];
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;IB)V")
   @ObfuscatedName("yw")
   public static void method13031(classXY var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method13030(var1, var2);
      }

      try {
         if ((var1 & -128) != 0) {
            if ((var1 & -16384) != 0) {
               if (var2 == 1) {
                  return;
               }

               if ((var1 & -2097152) != 0) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if ((var1 & -268435456) != 0) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     method12971(var0, var1 >>> 28 | 128, (byte)-115);
                  }

                  method12971(var0, var1 >>> 21 | 128, (byte)-72);
               }

               method12971(var0, var1 >>> 14 | 128, (byte)-27);
            }

            method12971(var0, var1 >>> 7 | 128, (byte)-12);
         }

         method12971(var0, var1 & 127, (byte)-13);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.ck(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("er")
   public int method13195(int var1) {
      try {
         this.field6955 += 2103253898;
         return ((this.field6954[this.field6955 * 702114061 - 1] & 0xFF) << 8) + (this.field6954[this.field6955 * 702114061 - 2] & 0xFF);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.eh(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ev")
   public void method13038(int var1, byte var2) {
      try {
         var1 = var1 << 1 ^ var1 >> 31;
         this.method13033(var1, (byte)68);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.cc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ea")
   public int method13146(int var1) {
      int var2 = classPY.method9375(this.field6954, var1, 702114061 * this.field6955, -1872029579);
      this.method13016(var2, 1855530005);
      return var2;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("en")
   public int method13230(int var1) {
      try {
         this.field6955 += 1007397199;
         int var2 = (this.field6954[this.field6955 * 702114061 - 1] & 255)
            + ((this.field6954[702114061 * this.field6955 - 2] & 255) << 16)
            + ((this.field6954[702114061 * this.field6955 - 3] & 255) << 8);
         if (var2 > 8388607) {
            if (var1 != 1575549434) {
               throw new IllegalStateException();
            }

            var2 -= 16777216;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.eu(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIB)V")
   @ObfuscatedName("cl")
   public void method13009(byte[] var1, int var2, int var3, byte var4) {
      try {
         for (int var5 = var2; var5 < var2 + var3; var5++) {
            if (var4 <= 4) {
               throw new IllegalStateException();
            }

            this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = var1[var5];
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "xy.cl(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("em")
   public void method13234(int var1, int var2) {
      try {
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 16);
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 24);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.ef(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)B")
   @ObfuscatedName("ek")
   public byte method13173(byte var1) {
      try {
         return (byte)(this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] - 128);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xy.ek(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("eu")
   public int method13121(int var1) {
      try {
         int var3 = 0;
         byte var4 = 0;

         int var2;
         do {
            var2 = method13039(this, -346779531);
            var3 |= (var2 & 127) << var4;
            var4 += 7;
         } while (var2 > 127);

         if (var1 >= 465362749) {
            throw new IllegalStateException();
         } else {
            return var3;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "xy.de(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;ZI)V")
   @ObfuscatedName("yb")
   public static void method12994(classXY var0, boolean var1, int var2) {
      if (var0 == null) {
         var0.method12993(var1, var2);
      } else {
         try {
            byte var10001;
            if (var1) {
               if (var2 != -1737488759) {
                  return;
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            method12971(var0, var10001, (byte)-108);
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "xy.cb(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;IB)V")
   @ObfuscatedName("ky")
   public static void method12978(classXY var0, int var1, byte var2) {
      if (var0 == null) {
         var0.method13037(var1, var2);
      } else {
         try {
            var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 16);
            var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)(var1 >> 8);
            var0.field6954[(var0.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "xy.bh(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cy")
   public void method13023(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= -1365423377) {
               return;
            }

            if (var1 <= 255) {
               this.field6954[this.field6955 * 702114061 - var1 - 1] = (byte)var1;
               return;
            }

            if (var2 <= -1365423377) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException();
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.cy(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("kg")
   public boolean method13068() {
      return (method13039(this, -346779531) & 1) == 1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ew")
   public int method13231(int var1) {
      try {
         this.field6955 += 1007397199;
         int var2 = (this.field6954[this.field6955 * 702114061 - 1] & 255)
            + ((this.field6954[702114061 * this.field6955 - 2] & 255) << 16)
            + ((this.field6954[702114061 * this.field6955 - 3] & 255) << 8);
         if (var2 > 8388607) {
            if (var1 != 1575549434) {
               throw new IllegalStateException();
            }

            var2 -= 16777216;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.eu(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("nk")
   public static void method13158(classXY var0, int var1) {
      var0.field6954[(var0.field6955 += 354887611) * 702114061 - 1] = (byte)(1140765656 - var1);
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("bl")
   public void method12972(int var1, byte var2) {
      try {
         this.field6954[(this.field6955 += -1095856699) * 702114061 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xy.bl(" + ')');
      }
   }
}
