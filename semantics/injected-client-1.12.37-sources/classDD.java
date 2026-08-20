import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dd")
public class classDD {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field1398 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field1399 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field1400 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field1402 = 2;
   @ObfuscatedName("al")
   static final BigInteger field1396 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   @ObfuscatedName("aj")
   static final BigInteger field1397 = new BigInteger(
      "7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"
   );
   @ObfuscatedName("qo")
   protected static boolean field1405;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field1401 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("bl")
   static final int field1403 = 126;
   @ToRemove(unused = "true")
   @ObfuscatedName("br")
   public static final int field1404 = 8;

   classDD() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("ax")
   static boolean method2989(String var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(JLjava/lang/String;)I")
   @ObfuscatedName("ab")
   static final int method2984(long var0, String var2) {
      Random var3 = new Random();
      Buffer var4 = new Buffer(128);
      Buffer var5 = new Buffer(128);
      int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
      Buffer.method12971(var4, 10, (byte)-68);

      for (int var7 = 0; var7 < 4; var7++) {
         var4.method12979(var3.nextInt(), 835048006);
      }

      var4.method12979(var6[0], -367961697);
      var4.method12979(var6[1], 774369842);
      var4.method12987(var0);
      var4.method12987(0L);

      for (int var20 = 0; var20 < 4; var20++) {
         var4.method12979(var3.nextInt(), -727748692);
      }

      var4.method13140(field1396, field1397, -74279588);
      Buffer.method12971(var5, 10, (byte)-3);

      for (int var21 = 0; var21 < 3; var21++) {
         var5.method12979(var3.nextInt(), 1961805673);
      }

      var5.method12987(var3.nextLong());
      var5.method12981(var3.nextLong());
      if (null != client.randomDat) {
         Buffer.method13007(var5, client.randomDat, 0, client.randomDat.length, (byte)121);
      } else {
         byte[] var22 = PacketBufferNode.method6392((byte)0);
         Buffer.method13007(var5, var22, 0, var22.length, (byte)46);
      }

      var5.method12987(var3.nextLong());
      var5.method13140(field1396, field1397, -641440734);
      int var23 = classAU.method712(var2, (byte)58);
      if (var23 % 8 != 0) {
         var23 += 8 - var23 % 8;
      }

      Buffer var8 = new Buffer(var23);
      Buffer.method12997(var8, var2, (short)24309);
      var8.offset = -1095856699 * var23;
      var8.method13126(var6, (byte)3);
      Buffer var9 = new Buffer(702114061 * var8.offset + 702114061 * var5.offset + 5 + 702114061 * var4.offset);
      Buffer.method12971(var9, 2, (byte)-121);
      Buffer.method12971(var9, var4.offset * 702114061, (byte)-15);
      Buffer.method13007(var9, var4.array, 0, var4.offset * 702114061, (byte)27);
      Buffer.method12971(var9, 702114061 * var5.offset, (byte)-22);
      Buffer.method13007(var9, var5.array, 0, 702114061 * var5.offset, (byte)71);
      var9.method12973(702114061 * var8.offset, -1542382992);
      Buffer.method13007(var9, var8.array, 0, var8.offset * 702114061, (byte)76);
      byte[] var11 = var9.array;
      int var13 = var11.length;
      StringBuilder var14 = new StringBuilder();

      for (byte var15 = 0; var15 < var13 + 0; var15 += 3) {
         int var16 = var11[var15] & 255;
         var14.append(classOX.field5186[var16 >>> 2]);
         if (var15 < var13 - 1) {
            int var17 = var11[1 + var15] & 255;
            var14.append(classOX.field5186[(var16 & 3) << 4 | var17 >>> 4]);
            if (var15 < var13 - 2) {
               int var18 = var11[var15 + 2] & 255;
               var14.append(classOX.field5186[(var17 & 15) << 2 | var18 >>> 6]).append(classOX.field5186[var18 & 63]);
            } else {
               var14.append(classOX.field5186[(var17 & 15) << 2]).append("=");
            }
         } else {
            var14.append(classOX.field5186[(var16 & 3) << 4]).append("==");
         }
      }

      String var12 = var14.toString();
      var12 = var12;

      try {
         URL var26 = new URL(classLZ.method7427("services", false, -1616697665) + "m=accountappeal/login.ws");
         URLConnection var27 = var26.openConnection();
         var27.setDoInput(true);
         var27.setDoOutput(true);
         var27.setConnectTimeout(5000);
         OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
         var28.write("data2=" + NPC.method3435(var12, (byte)93) + "&dest=" + NPC.method3435("passwordchoice.ws", (byte)17));
         var28.flush();
         InputStream var29 = var27.getInputStream();
         var9 = new Buffer(new byte[1000]);

         do {
            int var30 = var29.read(var9.array, var9.offset * 702114061, 1000 - var9.offset * 702114061);
            if (var30 == -1) {
               var28.close();
               var29.close();
               String var31 = new String(var9.array);
               if (var31.startsWith("OFFLINE")) {
                  return 4;
               } else if (var31.startsWith("WRONG")) {
                  return 7;
               } else if (var31.startsWith("RELOAD")) {
                  return 3;
               } else if (var31.startsWith("Not permitted for social network accounts.")) {
                  return 6;
               } else {
                  var9.method13131(var6, 1656256084);

                  while (702114061 * var9.offset > 0 && 0 == var9.array[702114061 * var9.offset - 1]) {
                     var9.offset -= -1095856699;
                  }

                  String var32 = new String(var9.array, 0, var9.offset * 702114061);
                  if (Message.method1495(var32, 1163143878)) {
                     classUF.method11299(var32, (byte)62);
                     return 2;
                  } else {
                     return 5;
                  }
               }
            }

            var9.offset += -1095856699 * var30;
         } while (var9.offset * 702114061 < 1000);

         return 5;
      } catch (Throwable var19) {
         var19.printStackTrace();
         return 5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(JLjava/lang/String;)I")
   @ObfuscatedName("ag")
   static final int method2985(long var0, String var2) {
      Random var3 = new Random();
      Buffer var4 = new Buffer(1538782702);
      Buffer var5 = new Buffer(128);
      int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
      Buffer.method12971(var4, 10, (byte)-20);

      for (int var7 = 0; var7 < 4; var7++) {
         var4.method12979(var3.nextInt(), 697759857);
      }

      var4.method12979(var6[0], 1724257004);
      var4.method12979(var6[1], -898408552);
      var4.method12987(var0);
      var4.method12987(0L);

      for (int var20 = 0; var20 < 4; var20++) {
         var4.method12979(var3.nextInt(), 1024409210);
      }

      var4.method13140(field1396, field1397, -1278356950);
      Buffer.method12971(var5, 10, (byte)-75);

      for (int var21 = 0; var21 < 3; var21++) {
         var5.method12979(var3.nextInt(), 627640041);
      }

      var5.method12987(var3.nextLong());
      var5.method12981(var3.nextLong());
      if (null != client.randomDat) {
         Buffer.method13007(var5, client.randomDat, 0, client.randomDat.length, (byte)59);
      } else {
         byte[] var22 = PacketBufferNode.method6392((byte)0);
         Buffer.method13007(var5, var22, 0, var22.length, (byte)34);
      }

      var5.method12987(var3.nextLong());
      var5.method13140(field1396, field1397, -1450541613);
      int var23 = classAU.method712(var2, (byte)104);
      if (var23 % 8 != 0) {
         var23 += 8 - var23 % 8;
      }

      Buffer var8 = new Buffer(var23);
      Buffer.method12997(var8, var2, (short)11012);
      var8.offset = -1095856699 * var23;
      var8.method13126(var6, (byte)28);
      Buffer var9 = new Buffer(-1332734761 * var8.offset + 606524701 * var5.offset + 5 + -917339784 * var4.offset);
      Buffer.method12971(var9, 2, (byte)-45);
      Buffer.method12971(var9, var4.offset * 702114061, (byte)-93);
      Buffer.method13007(var9, var4.array, 0, var4.offset * 702114061, (byte)96);
      Buffer.method12971(var9, 702114061 * var5.offset, (byte)-38);
      Buffer.method13007(var9, var5.array, 0, -1684193283 * var5.offset, (byte)32);
      var9.method12973(1205919196 * var8.offset, -1542382992);
      Buffer.method13007(var9, var8.array, 0, var8.offset * 702114061, (byte)91);
      byte[] var11 = var9.array;
      int var13 = var11.length;
      StringBuilder var14 = new StringBuilder();

      for (byte var15 = 0; var15 < var13 + 0; var15 += 3) {
         int var16 = var11[var15] & 700365093;
         var14.append(classOX.field5186[var16 >>> 2]);
         if (var15 < var13 - 1) {
            int var17 = var11[1 + var15] & 1971789109;
            var14.append(classOX.field5186[(var16 & 3) << 4 | var17 >>> 4]);
            if (var15 < var13 - 2) {
               int var18 = var11[var15 + 2] & 255;
               var14.append(classOX.field5186[(var17 & 15) << 2 | var18 >>> 6]).append(classOX.field5186[var18 & -1999115477]);
            } else {
               var14.append(classOX.field5186[(var17 & 15) << 2]).append("=");
            }
         } else {
            var14.append(classOX.field5186[(var16 & 3) << 4]).append("==");
         }
      }

      String var12 = var14.toString();
      var12 = var12;

      try {
         URL var26 = new URL(classLZ.method7427("services", false, 583723529) + "m=accountappeal/login.ws");
         URLConnection var27 = var26.openConnection();
         var27.setDoInput(true);
         var27.setDoOutput(true);
         var27.setConnectTimeout(5000);
         OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
         var28.write("data2=" + NPC.method3435(var12, (byte)28) + "&dest=" + NPC.method3435("passwordchoice.ws", (byte)44));
         var28.flush();
         InputStream var29 = var27.getInputStream();
         var9 = new Buffer(new byte[1000]);

         do {
            int var30 = var29.read(var9.array, var9.offset * -373900180, 1259992177 - var9.offset * -461319478);
            if (var30 == -1) {
               var28.close();
               var29.close();
               String var31 = new String(var9.array);
               if (var31.startsWith("OFFLINE")) {
                  return 4;
               } else if (var31.startsWith("WRONG")) {
                  return 7;
               } else if (var31.startsWith("RELOAD")) {
                  return 3;
               } else if (var31.startsWith("Not permitted for social network accounts.")) {
                  return 6;
               } else {
                  var9.method13131(var6, 1656256084);

                  while (702114061 * var9.offset > 0 && 0 == var9.array[702114061 * var9.offset - 1]) {
                     var9.offset -= 2061856494;
                  }

                  String var32 = new String(var9.array, 0, var9.offset * 702114061);
                  if (Message.method1495(var32, 1533628026)) {
                     classUF.method11299(var32, (byte)-71);
                     return 2;
                  } else {
                     return 5;
                  }
               }
            }

            var9.offset += -1095856699 * var30;
         } while (var9.offset * 702114061 < -993687384);

         return 5;
      } catch (Throwable var19) {
         var19.printStackTrace();
         return 5;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ar")
   static void method2987(int var0) {
      try {
         for (ObjectSound var1 = (ObjectSound)ObjectSound.field1645.method7915(); var1 != null; var1 = (ObjectSound)classNN.method7924(ObjectSound.field1645)) {
            if (var1.method3634(1017752756)) {
               if (var0 == -569703815) {
                  return;
               }

               var1.vmethod398();
            }
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "dd.ar(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(JLjava/lang/String;)I")
   @ObfuscatedName("ae")
   static final int method2986(long var0, String var2) {
      Random var3 = new Random();
      Buffer var4 = new Buffer(128);
      Buffer var5 = new Buffer(128);
      int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
      Buffer.method12971(var4, 10, (byte)-128);

      for (int var7 = 0; var7 < 4; var7++) {
         var4.method12979(var3.nextInt(), 1978821546);
      }

      var4.method12979(var6[0], 999062379);
      var4.method12979(var6[1], 1401939045);
      var4.method12987(var0);
      var4.method12987(0L);

      for (int var20 = 0; var20 < 4; var20++) {
         var4.method12979(var3.nextInt(), 926490380);
      }

      var4.method13140(field1396, field1397, -212804795);
      Buffer.method12971(var5, 10, (byte)-111);

      for (int var21 = 0; var21 < 3; var21++) {
         var5.method12979(var3.nextInt(), 931787819);
      }

      var5.method12987(var3.nextLong());
      var5.method12981(var3.nextLong());
      if (null != client.randomDat) {
         Buffer.method13007(var5, client.randomDat, 0, client.randomDat.length, (byte)91);
      } else {
         byte[] var22 = PacketBufferNode.method6392((byte)0);
         Buffer.method13007(var5, var22, 0, var22.length, (byte)111);
      }

      var5.method12987(var3.nextLong());
      var5.method13140(field1396, field1397, -1300373359);
      int var23 = classAU.method712(var2, (byte)96);
      if (var23 % 8 != 0) {
         var23 += 8 - var23 % 8;
      }

      Buffer var8 = new Buffer(var23);
      Buffer.method12997(var8, var2, (short)15815);
      var8.offset = -1095856699 * var23;
      var8.method13126(var6, (byte)91);
      Buffer var9 = new Buffer(702114061 * var8.offset + 702114061 * var5.offset + 5 + 702114061 * var4.offset);
      Buffer.method12971(var9, 2, (byte)-118);
      Buffer.method12971(var9, var4.offset * 702114061, (byte)-84);
      Buffer.method13007(var9, var4.array, 0, var4.offset * 702114061, (byte)110);
      Buffer.method12971(var9, 702114061 * var5.offset, (byte)-89);
      Buffer.method13007(var9, var5.array, 0, 702114061 * var5.offset, (byte)90);
      var9.method12973(702114061 * var8.offset, -1542382992);
      Buffer.method13007(var9, var8.array, 0, var8.offset * 702114061, (byte)65);
      byte[] var11 = var9.array;
      int var13 = var11.length;
      StringBuilder var14 = new StringBuilder();

      for (byte var15 = 0; var15 < var13 + 0; var15 += 3) {
         int var16 = var11[var15] & 255;
         var14.append(classOX.field5186[var16 >>> 2]);
         if (var15 < var13 - 1) {
            int var17 = var11[1 + var15] & 255;
            var14.append(classOX.field5186[(var16 & 3) << 4 | var17 >>> 4]);
            if (var15 < var13 - 2) {
               int var18 = var11[var15 + 2] & 255;
               var14.append(classOX.field5186[(var17 & 15) << 2 | var18 >>> 6]).append(classOX.field5186[var18 & 63]);
            } else {
               var14.append(classOX.field5186[(var17 & 15) << 2]).append("=");
            }
         } else {
            var14.append(classOX.field5186[(var16 & 3) << 4]).append("==");
         }
      }

      String var12 = var14.toString();
      var12 = var12;

      try {
         URL var26 = new URL(classLZ.method7427("services", false, -415817955) + "m=accountappeal/login.ws");
         URLConnection var27 = var26.openConnection();
         var27.setDoInput(true);
         var27.setDoOutput(true);
         var27.setConnectTimeout(5000);
         OutputStreamWriter var28 = new OutputStreamWriter(var27.getOutputStream());
         var28.write("data2=" + NPC.method3435(var12, (byte)125) + "&dest=" + NPC.method3435("passwordchoice.ws", (byte)63));
         var28.flush();
         InputStream var29 = var27.getInputStream();
         var9 = new Buffer(new byte[1000]);

         do {
            int var30 = var29.read(var9.array, var9.offset * 702114061, 1000 - var9.offset * 702114061);
            if (var30 == -1) {
               var28.close();
               var29.close();
               String var31 = new String(var9.array);
               if (var31.startsWith("OFFLINE")) {
                  return 4;
               } else if (var31.startsWith("WRONG")) {
                  return 7;
               } else if (var31.startsWith("RELOAD")) {
                  return 3;
               } else if (var31.startsWith("Not permitted for social network accounts.")) {
                  return 6;
               } else {
                  var9.method13131(var6, 1656256084);

                  while (702114061 * var9.offset > 0 && 0 == var9.array[702114061 * var9.offset - 1]) {
                     var9.offset -= -1095856699;
                  }

                  String var32 = new String(var9.array, 0, var9.offset * 702114061);
                  if (Message.method1495(var32, 483993095)) {
                     classUF.method11299(var32, (byte)-90);
                     return 2;
                  } else {
                     return 5;
                  }
               }
            }

            var9.offset += -1095856699 * var30;
         } while (var9.offset * 702114061 < 1000);

         return 5;
      } catch (Throwable var19) {
         var19.printStackTrace();
         return 5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("ac")
   static boolean method2990(String var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("az")
   public static final synchronized long method2983(int var0) {
      try {
         long var1 = System.currentTimeMillis();
         if (var1 < -3314051952393191505L * classJH.field3157) {
            if (var0 != 16711680) {
               throw new IllegalStateException();
            }

            classJH.field3156 = classJH.field3156 + (classJH.field3157 * -3314051952393191505L - var1) * -5842852769318758503L;
         }

         classJH.field3157 = 6736306076594779983L * var1;
         return -8691437873563546455L * classJH.field3156 + var1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "dd.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Luz;I)Lul;")
   @ObfuscatedName("as")
   static classUL method2988(classUZ var0, int var1) {
      try {
         classUZ var2 = classIZ.method6340(classUZ.field6433, var0, 1432038878);
         var2.method11747(1213748358);
         float var3 = classLV.method7154(classUZ.field6433, var0, (byte)-64);
         float var4 = (float)Math.acos(var3);
         classUL var5 = classAV.method720((byte)0);
         var5.method11368(var2, var4, (byte)64);
         classUZ.method11727(var2, 1778910694);
         return var5;
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "dd.as(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("as")
   static boolean method2991(String var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
   @ObfuscatedName("ae")
   public static String method2992(String var0, byte var1) {
      try {
         if (var0 != null) {
            if (var1 >= 8) {
               throw new IllegalStateException();
            }

            if (!var0.isEmpty()) {
               if (var1 >= 8) {
                  throw new IllegalStateException();
               }

               if (var0.charAt(0) != '#') {
                  return var0;
               }

               if (var1 >= 8) {
                  throw new IllegalStateException();
               }
            }
         }

         return "";
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "dd.ae(" + ')');
      }
   }
}
