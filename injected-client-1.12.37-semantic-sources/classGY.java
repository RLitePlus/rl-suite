import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gy")
public class classGY {
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final int field2745 = 2;
   @ObfuscatedName("az")
   int field2741;
   @ObfuscatedName("af")
   int field2742;
   @ObfuscatedName("ae")
   int field2743;
   @ObfuscatedName("ab")
   int field2744 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field2747 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field2746 = 8;

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bg")
   public void method5935(int var1, int var2) {
      this.field2741 += var1 * 1397226421;
      this.field2742 += var2 * 1296710373;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   public int method5903(int var1) {
      try {
         return -787916131 * this.field2741;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gy.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   public int method5905(int var1) {
      try {
         return 1650177407 * this.field2743;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gy.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public int method5912(int var1) {
      try {
         return -787916131 * this.field2741 >> 7;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gy.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   public int method5920(int var1) {
      try {
         return 1859166197 * this.field2744;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gy.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   public int method5908() {
      return this.field2742 * -478154003;
   }

   @ObfuscatedSignature(descriptor = "(Lgy;)V")
   @ObfuscatedName("bn")
   public void method5925(classGY var1) {
      this.field2744 = var1.field2744 * 1;
      this.field2741 = 1 * var1.field2741;
      this.field2743 = 1 * var1.field2743;
      this.field2742 = var1.field2742 * 1;
   }

   @Override
   public String toString() {
      try {
         return this.field2741 * -787916131 + ", " + 1650177407 * this.field2743 + ", " + -478154003 * this.field2742 + ", " + this.field2744 * 1859166197;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "gy.toString(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("al")
   public void method5936(int var1, int var2, byte var3) {
      try {
         this.field2741 += var1 * 1397226421;
         this.field2742 += var2 * 1296710373;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gy.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("aj")
   public void method5939(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.field2741 += var1 * 1397226421;
         this.field2743 += var2 * 966134399;
         this.field2742 += var3 * 1296710373;
         this.method5923(var4 + this.field2744 * 1859166197, -2001730299);
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "gy.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgy;I)I")
   @ObfuscatedName("gy")
   public static int method5909(classGY var0, int var1) {
      if (var0 == null) {
         return var0.method5916(var1);
      } else {
         try {
            return var0.field2742 * -478154003;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "gy.ae(" + 41);
         }
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return var1 instanceof classGY ? this.method5943((classGY)var1, -735246478) : false;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gy.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgy;I)Z")
   @ObfuscatedName("ay")
   boolean method5943(classGY var1, int var2) {
      try {
         if (-787916131 * this.field2741 == -787916131 * var1.field2741) {
            if (var2 == -324749371) {
               throw new IllegalStateException();
            }

            if (this.field2743 * 1650177407 == var1.field2743 * 1650177407) {
               if (var2 == -324749371) {
                  throw new IllegalStateException();
               }

               if (this.field2742 * -478154003 == var1.field2742 * -478154003) {
                  if (var2 == -324749371) {
                     throw new IllegalStateException();
                  }

                  if (1859166197 * var1.field2744 == 1859166197 * this.field2744) {
                     if (var2 == -324749371) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "gy.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   public int method5906() {
      return 1650177407 * this.field2743;
   }

   @ObfuscatedSignature(descriptor = "(Lgy;IIB)V")
   @ObfuscatedName("zy")
   public static void method5929(classGY var0, int var1, int var2, byte var3) {
      if (var0 == null) {
         var0.method5932(var1, var1, var3);
      }

      try {
         var0.field2741 = 1397226421 * var1;
         var0.field2742 = 1296710373 * var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gy.aa(" + ')');
      }
   }

   public classGY() {
      this.field2741 = 0;
      this.field2742 = 0;
      this.field2743 = 0;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gd")
   public String method5947() {
      return this.field2741 * -787916131 + ", " + 1650177407 * this.field2743 + ", " + -478154003 * this.field2742 + ", " + this.field2744 * 1171001325;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method5941(Object var1) {
      return var1 instanceof classGY ? this.method5943((classGY)var1, 936510594) : false;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   public int method5904() {
      return -787916131 * this.field2741;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ax")
   public void method5923(int var1, int var2) {
      try {
         this.field2744 = -429665187 * (var1 & 2047);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "gy.ax(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgy;II)V")
   @ObfuscatedName("pq")
   public static void method5937(classGY var0, int var1, int var2) {
      if (var0 == null) {
         var0.method5917();
      }

      var0.field2741 += var1 * 1397226421;
      var0.field2742 += var2 * 1296710373;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bp")
   public void method5930(int var1, int var2) {
      this.field2741 = 1397226421 * var1;
      this.field2742 = 1296710373 * var2;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   public int method5910() {
      return this.field2742 * 2094420036;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   public int method5907() {
      return 1650177407 * this.field2743;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ad")
   public int method5913() {
      return 1120243403 * this.field2741 >> 7;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("am")
   public int method5914() {
      return -787916131 * this.field2741 >> 7;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   public int method5915() {
      return -787916131 * this.field2741 >> 7;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   public int method5917() {
      return this.field2742 * -1045233154 >> 7;
   }

   @ObfuscatedSignature(descriptor = "(Lgy;)V")
   @ObfuscatedName("pn")
   public void method5951(classGY var1) {
      this.method5926(var1, 578993763);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgy;Lgy;)Z")
   @ObfuscatedName("ba")
   public static boolean method5944(classGY var0, classGY var1) {
      return 2077926236 * var0.field2741 == -787916131 * var1.field2741
         && var0.field2743 * -9602252 == var1.field2743 * 1650177407
         && var0.field2742 * -478154003 == var1.field2742 * -478154003
         && 1859166197 * var1.field2744 == -1940900237 * var0.field2744;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   public int method5921() {
      return 1859166197 * this.field2744;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ah")
   public void method5924(int var1) {
      this.field2744 = -429665187 * (var1 & 2047);
   }

   @ObfuscatedSignature(descriptor = "(Lgy;I)V")
   @ObfuscatedName("ac")
   public void method5926(classGY var1, int var2) {
      try {
         this.field2744 = var1.field2744 * 1;
         this.field2741 = 1 * var1.field2741;
         this.field2743 = 1 * var1.field2743;
         this.field2742 = var1.field2742 * 1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "gy.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgy;IS)V")
   @ObfuscatedName("gu")
   public static void method5933(classGY var0, int var1, short var2) {
      if (var0 == null) {
         var0.method5934(var1, var2);
      }

      try {
         var0.field2743 = var1 * 966134399;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "gy.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgy;)V")
   @ObfuscatedName("bx")
   public void method5927(classGY var1) {
      this.field2744 = var1.field2744 * 1;
      this.field2741 = 1 * var1.field2741;
      this.field2743 = 1 * var1.field2743;
      this.field2742 = var1.field2742 * 1;
   }

   @ObfuscatedSignature(descriptor = "(Lgy;)V")
   @ObfuscatedName("bc")
   public void method5928(classGY var1) {
      this.field2744 = var1.field2744 * 1;
      this.field2741 = 1 * var1.field2741;
      this.field2743 = 1 * var1.field2743;
      this.field2742 = var1.field2742 * 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgy;Ljava/lang/Object;)Z")
   @ObfuscatedName("ll")
   public static boolean method5942(classGY var0, Object var1) {
      if (var0 == null) {
         var0.method5915();
      }

      return var1 instanceof classGY ? var0.method5943((classGY)var1, -1362004316) : false;
   }

   @ObfuscatedSignature(descriptor = "(Lgy;B)I")
   @ObfuscatedName("qc")
   public static int method5918(classGY var0, byte var1) {
      if (var0 == null) {
         var0.method5919(var1);
      }

      try {
         return var0.field2742 * -478154003 >> 7;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gy.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gi")
   public String method5948() {
      return this.field2741 * -787916131 + ", " + 1650177407 * this.field2743 + ", " + -478154003 * this.field2742 + ", " + this.field2744 * 1859166197;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bm")
   public void method5931(int var1, int var2) {
      this.field2741 = 2144975346 * var1;
      this.field2742 = 1296710373 * var2;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("gl")
   public String method5949() {
      return this.field2741 * -787916131 + ", " + 1650177407 * this.field2743 + ", " + -478154003 * this.field2742 + ", " + this.field2744 * 1859166197;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgy;)I")
   @ObfuscatedName("bm")
   public static int method5911(classGY var0) {
      return var0.field2742 * 729467839;
   }

   @ObfuscatedSignature(descriptor = "(Lgy;)Z")
   @ObfuscatedName("bu")
   boolean method5945(classGY var1) {
      return -787916131 * this.field2741 == 1011829641 * var1.field2741
         && this.field2743 * -1332787439 == var1.field2743 * 1650177407
         && this.field2742 * -478154003 == var1.field2742 * -809571305
         && 1859166197 * var1.field2744 == -546842966 * this.field2744;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lwm;)I")
   @ObfuscatedName("ir")
   public static int method5950(WorldMap var0) {
      return var0.field6744 == null ? -1 : var0.field6738 * 1010414839 + WorldMapArea.method5880(var0.field6744, (short)-15363) * 64;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bj")
   public void method5938(int var1, int var2) {
      this.field2741 += var1 * 1397226421;
      this.field2742 += var2 * 1296710373;
   }

   @ObfuscatedSignature(descriptor = "(Lgy;)Z")
   @ObfuscatedName("ba")
   boolean method5946(classGY var1) {
      return -787916131 * this.field2741 == -787916131 * var1.field2741
         && this.field2743 * 1650177407 == var1.field2743 * 1650177407
         && this.field2742 * -478154003 == var1.field2742 * -478154003
         && 1859166197 * var1.field2744 == 1859166197 * this.field2744;
   }

   @ObfuscatedSignature(descriptor = "(JLjava/lang/String;B)I")
   @ObfuscatedName("az")
   static final int method5922(long var0, String var2, byte var3) {
      try {
         Random var4 = new Random();
         classXY var5 = new classXY(128);
         classXY var6 = new classXY(128);
         int[] var7 = new int[]{var4.nextInt(), var4.nextInt(), (int)(var0 >> 32), (int)var0};
         classXY.method12971(var5, 10, (byte)-5);

         for (int var8 = 0; var8 < 4; var8++) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            var5.method12979(var4.nextInt(), 977469246);
         }

         var5.method12979(var7[0], -545239523);
         var5.method12979(var7[1], 2104395591);
         var5.method12987(var0);
         var5.method12987(0L);

         for (int var22 = 0; var22 < 4; var22++) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            var5.method12979(var4.nextInt(), -146300208);
         }

         var5.method13140(classDD.field1396, classDD.field1397, 720769824);
         classXY.method12971(var6, 10, (byte)-98);

         for (int var23 = 0; var23 < 3; var23++) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            var6.method12979(var4.nextInt(), -47986130);
         }

         var6.method12987(var4.nextLong());
         var6.method12981(var4.nextLong());
         if (null != client.field944) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            classXY.method13007(var6, client.field944, 0, client.field944.length, (byte)48);
         } else {
            byte[] var24 = classJL.method6392((byte)0);
            classXY.method13007(var6, var24, 0, var24.length, (byte)40);
         }

         var6.method12987(var4.nextLong());
         var6.method13140(classDD.field1396, classDD.field1397, -1920462257);
         int var25 = classAU.method712(var2, (byte)78);
         if (var25 % 8 != 0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            var25 += 8 - var25 % 8;
         }

         classXY var9 = new classXY(var25);
         classXY.method12997(var9, var2, (short)26214);
         var9.field6955 = -1095856699 * var25;
         var9.method13126(var7, (byte)17);
         classXY var10 = new classXY(702114061 * var9.field6955 + 702114061 * var6.field6955 + 5 + 702114061 * var5.field6955);
         classXY.method12971(var10, 2, (byte)-71);
         classXY.method12971(var10, var5.field6955 * 702114061, (byte)-97);
         classXY.method13007(var10, var5.field6954, 0, var5.field6955 * 702114061, (byte)44);
         classXY.method12971(var10, 702114061 * var6.field6955, (byte)-54);
         classXY.method13007(var10, var6.field6954, 0, 702114061 * var6.field6955, (byte)73);
         var10.method12973(702114061 * var9.field6955, -1542382992);
         classXY.method13007(var10, var9.field6954, 0, var9.field6955 * 702114061, (byte)19);
         byte[] var12 = var10.field6954;
         int var14 = var12.length;
         StringBuilder var15 = new StringBuilder();

         for (byte var16 = 0; var16 < var14 + 0; var16 += 3) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            int var17 = var12[var16] & 255;
            var15.append(classOX.field5186[var17 >>> 2]);
            if (var16 < var14 - 1) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               int var18 = var12[1 + var16] & 255;
               var15.append(classOX.field5186[(var17 & 3) << 4 | var18 >>> 4]);
               if (var16 < var14 - 2) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  int var19 = var12[var16 + 2] & 255;
                  var15.append(classOX.field5186[(var18 & 15) << 2 | var19 >>> 6]).append(classOX.field5186[var19 & 63]);
               } else {
                  var15.append(classOX.field5186[(var18 & 15) << 2]).append("=");
               }
            } else {
               var15.append(classOX.field5186[(var17 & 3) << 4]).append("==");
            }
         }

         String var13 = var15.toString();
         var13 = var13;

         try {
            URL var28 = new URL(classLZ.method7427("services", false, -1795033336) + "m=accountappeal/login.ws");
            URLConnection var29 = var28.openConnection();
            var29.setDoInput(true);
            var29.setDoOutput(true);
            var29.setConnectTimeout(5000);
            OutputStreamWriter var30 = new OutputStreamWriter(var29.getOutputStream());
            var30.write("data2=" + NPC.method3435(var13, (byte)60) + "&dest=" + NPC.method3435("passwordchoice.ws", (byte)17));
            var30.flush();
            InputStream var31 = var29.getInputStream();
            var10 = new classXY(new byte[1000]);

            do {
               int var32 = var31.read(var10.field6954, var10.field6955 * 702114061, 1000 - var10.field6955 * 702114061);
               if (var32 == -1) {
                  var30.close();
                  var31.close();
                  String var33 = new String(var10.field6954);
                  if (var33.startsWith("OFFLINE")) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     } else {
                        return 4;
                     }
                  } else if (var33.startsWith("WRONG")) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     } else {
                        return 7;
                     }
                  } else if (var33.startsWith("RELOAD")) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     } else {
                        return 3;
                     }
                  } else if (var33.startsWith("Not permitted for social network accounts.")) {
                     return 6;
                  } else {
                     var10.method13131(var7, 1656256084);

                     while (702114061 * var10.field6955 > 0) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (0 != var10.field6954[702114061 * var10.field6955 - 1]) {
                           break;
                        }

                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        var10.field6955 -= -1095856699;
                     }

                     String var34 = new String(var10.field6954, 0, var10.field6955 * 702114061);
                     if (Message.method1495(var34, 1385240717)) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        } else {
                           classUF.method11299(var34, (byte)-13);
                           return 2;
                        }
                     } else {
                        return 5;
                     }
                  }
               }

               var10.field6955 += -1095856699 * var32;
            } while (var10.field6955 * 702114061 < 1000);

            return 5;
         } catch (Throwable var20) {
            var20.printStackTrace();
            return 5;
         }
      } catch (RuntimeException var21) {
         throw classEG.method3884(var21, "gy.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public int method5916(int var1) {
      try {
         return -787916131 * this.field2741 >> 7;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gy.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ag")
   public int method5919(byte var1) {
      try {
         return this.field2743 * -478154003 >> 7;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gy.ag(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgy;IIII)V")
   @ObfuscatedName("nn")
   public static void method5940(classGY var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method5930(var1, var1);
      }

      var0.field2741 += var1 * 1397226421;
      var0.field2743 += var2 * 1547321988;
      var0.field2742 += var3 * 1771197592;
      var0.method5923(var4 + var0.field2744 * 1859166197, -611724391);
   }

   @ObfuscatedSignature(descriptor = "(IIB)V")
   @ObfuscatedName("aa")
   public void method5932(int var1, int var2, byte var3) {
      try {
         this.field2744 = 1397226421 * var1;
         this.field2742 = 1296710373 * var2;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gy.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IS)V")
   @ObfuscatedName("ao")
   public void method5934(int var1, short var2) {
      try {
         this.field2743 = var1 * 966134399;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "gy.ao(" + ')');
      }
   }
}
