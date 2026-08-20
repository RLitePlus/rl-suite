import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cn")
public class classCN {
   @ObfuscatedSignature(descriptor = "Lyn;")
   @ObfuscatedName("af")
   static final IterableNodeHashTable field1174 = new IterableNodeHashTable(1024);
   @ObfuscatedName("ab")
   static int field1172 = 0;
   @ObfuscatedSignature(descriptor = "Lnz;")
   @ObfuscatedName("ae")
   static final classNZ field1173 = new classNZ();
   @ToRemove(unused = "true")
   @ObfuscatedName("bk")
   static final int field1175 = 50;
   @ObfuscatedName("az")
   static final Map field1171 = new HashMap();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   static void method2541() {
      field1171.clear();
      IterableNodeHashTable.method13579(field1174);
      field1173.method8262();
      field1172 = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("aa")
   static void method2530(int var0, String var1, String var2) {
      classFM.method4848(var0, var1, var2, null, (byte)-61);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("ao")
   static void method2531(int var0, String var1, String var2) {
      classFM.method4848(var0, var1, var2, null, (byte)-67);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bx")
   static int method2548(int var0) {
      Message var1 = (Message)field1174.method13595(var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.field6515 == field1173.field4800 ? -1 : -1176735578 * ((Message)var1.field6515).field725;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ah")
   static final void method2556(byte var0) {
      try {
         if (client.field820 * -355071157 > 0) {
            if (var0 < 0) {
               classGI.method5463((byte)-107);
            }
         } else {
            client.field917.method6755(-1020808753);
            classJB.method6345(40, -1192966987);
            classDS.field1623 = PacketWriter.method3383(client.packetWriter, 856860878);
            client.packetWriter.method3380(-580316386);
         }
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "cn.ah(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Lcg;")
   @ObfuscatedName("ay")
   static Message method2533(int var0, int var1) {
      ChatChannel var2 = (ChatChannel)field1171.get(var0);
      return ChatChannel.method1252(var2, var1, -771078329);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Lcg;")
   @ObfuscatedName("aq")
   static Message method2534(int var0, int var1) {
      ChatChannel var2 = (ChatChannel)field1171.get(var0);
      return ChatChannel.method1252(var2, var1, 1058172900);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("av")
   static void method2542() {
      field1171.clear();
      IterableNodeHashTable.method13579(field1174);
      field1173.method8262();
      field1172 = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lcg;")
   @ObfuscatedName("ap")
   static Message method2536(int var0) {
      return (Message)field1174.method13595(var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lcg;")
   @ObfuscatedName("au")
   static Message method2537(int var0) {
      return (Message)field1174.method13595(var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ai")
   static int method2539(int var0) {
      ChatChannel var1 = (ChatChannel)field1171.get(var0);
      return var1 == null ? 0 : var1.method1255((byte)-30);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   static int method2540(int var0) {
      ChatChannel var1 = (ChatChannel)field1171.get(var0);
      return var1 == null ? 0 : var1.method1255((byte)-62);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Lcg;")
   @ObfuscatedName("aj")
   static Message method2535(int var0, int var1) {
      ChatChannel var2 = (ChatChannel)field1171.get(var0);
      return ChatChannel.method1252(var2, var1, 1671620827);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   static void method2543() {
      field1171.clear();
      IterableNodeHashTable.method13579(field1174);
      field1173.method8262();
      field1172 = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lcg;")
   @ObfuscatedName("ad")
   static Message method2538(int var0) {
      return (Message)field1174.method13595(var0);
   }

   classCN() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   static int method2544(int var0) {
      Message var1 = (Message)field1174.method13595(var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.field6516 == field1173.field4800 ? -1 : 707758669 * ((Message)var1.field6516).field725;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("am")
   static int method2545(int var0) {
      Message var1 = (Message)field1174.method13595(var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.field6516 == field1173.field4800 ? -1 : -1216729741 * ((Message)var1.field6516).field725;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ah")
   static int method2546(int var0) {
      Message var1 = (Message)field1174.method13595(var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.field6516 == field1173.field4800 ? -1 : 707758669 * ((Message)var1.field6516).field725;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ac")
   static boolean method2555(byte var0) {
      try {
         Date var1;
         try {
            SimpleDateFormat var3 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
            var3.setLenient(false);
            StringBuilder var4 = new StringBuilder();
            String[] var5 = classBF.field407;
            int var6 = 0;

            Date var2;
            while (true) {
               if (var6 >= var5.length) {
                  var4.append("12");
                  var2 = var3.parse(var4.toString());
                  break;
               }

               String var7 = var5[var6];
               if (null == var7) {
                  if (var0 == -1) {
                     throw new IllegalStateException();
                  }

                  classAB.setLoginResponse("Date not valid.", "Please ensure all characters are populated.", "", 1688879482);
                  var2 = null;
                  break;
               }

               var4.append(var7);
               var6++;
            }

            var1 = var2;
         } catch (ParseException var8) {
            classAB.setLoginResponse("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -177917866);
            return false;
         }

         if (null == var1) {
            if (var0 == -1) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            Calendar var11 = Calendar.getInstance();
            var11.set(1, var11.get(1) - 13);
            var11.set(5, var11.get(5) + 1);
            var11.set(11, 0);
            var11.set(12, 0);
            var11.set(13, 0);
            var11.set(14, 0);
            Date var12 = var11.getTime();
            boolean var10 = var1.before(var12);
            boolean var13 = classLX.method7373(var1, 531702551);
            if (!var13) {
               if (var0 == -1) {
                  throw new IllegalStateException();
               } else {
                  classAB.setLoginResponse("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -884389559);
                  return false;
               }
            } else {
               if (!var10) {
                  IntProjection.field1937 = 485945013;
               } else {
                  IntProjection.field1937 = (int)(var1.getTime() / 86400000L - 11745L) * -2004283061;
               }

               return true;
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "cn.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bn")
   static int method2549(int var0) {
      Message var1 = (Message)field1174.method13595(var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.field6515 == field1173.field4800 ? -1 : 707758669 * ((Message)var1.field6515).field725;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bc")
   static int method2550(int var0) {
      Message var1 = (Message)field1174.method13595(var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.field6515 == field1173.field4800 ? -1 : -282470758 * ((Message)var1.field6515).field725;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lfs;")
   @ObfuscatedName("af")
   static classFS method2557(int var0, int var1) {
      synchronized (SequenceDefinition.field5145) {
         int var4 = var0;
         int var5 = 1275003202;

         classFS var10000;
         try {
            classFS var6 = (classFS)SequenceDefinition.field5145.method6422(var4);
            if (var6 != null) {
               if (var5 <= 741528736) {
                  throw new IllegalStateException();
               }

               var10000 = var6;
            } else {
               var6 = classMS.method7649(classKP.field3986, classIY.field3099, var4, -2117599441);
               if (null != var6) {
                  if (var5 <= 741528736) {
                     throw new IllegalStateException();
                  }

                  SequenceDefinition.field5145.method6428(var6, var4);
               }

               var10000 = var6;
            }
         } catch (RuntimeException var7) {
            throw classEG.newRunException(var7, "cn.af(" + ')');
         }

         return var10000;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;I)I")
   @ObfuscatedName("kk")
   public static int method2554(Buffer var0, int var1) {
      if (var0 == null) {
         return var0.method13230(var1);
      } else {
         int var2 = classPY.method9375(var0.array, var1, 702114061 * var0.offset, -1829759419);
         var0.method12979(var2, -148783494);
         return var2;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIZLvv;Lqn;S)V")
   @ObfuscatedName("ae")
   public static final void method2551(int var0, int var1, int var2, boolean var3, classVV var4, classQN var5, short var6) {
      try {
         if (classLY.method7381(var4, var0, 2131710019)) {
            NpcOverrides.method9086(var4.field4440[var0], 0, var4.field4440[var0].length - 1, -1, -1, var1, var2, var3, var4, var5, 1452131038);
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "cn.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   static int method2547(int var0) {
      Message var1 = (Message)field1174.method13595(var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.field6516 == field1173.field4800 ? -1 : 707758669 * ((Message)var1.field6516).field725;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("al")
   static void method2532(int var0, String var1, String var2, String var3) {
      ChatChannel var4 = (ChatChannel)field1171.get(var0);
      if (null == var4) {
         var4 = new ChatChannel();
         field1171.put(var0, var4);
      }

      Message var5 = var4.method1249(var0, var1, var2, var3, -464900164);
      IterableNodeHashTable.method13576(field1174, var5, var5.field725 * -142289306);
      classNZ.method8265(field1173, var5);
      classPV.method9261(client.field824, 1963850608);
   }

   @ObfuscatedSignature(descriptor = "(J)I")
   @ObfuscatedName("ag")
   public static int method2552(long var0) {
      try {
         return (int)(var0 >>> 20 & 4294967295L);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "cn.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lte;IIIIB)V")
   @ObfuscatedName("ac")
   public static void method2553(classTE var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         classHO.method6078(var0, classYY.field7111, (byte)63);
         if (var3 < 0) {
            if (var5 != 0) {
               throw new IllegalStateException();
            }

            var3 = 0;
         }

         int var6;
         label52: {
            var6 = var4 + var3;
            if (var4 >= 0) {
               if (var5 != 0) {
                  throw new IllegalStateException();
               }

               if (var6 >= 0) {
                  if (var5 != 0) {
                     throw new IllegalStateException();
                  }

                  if (var6 <= var0.method10756(-199101565)) {
                     break label52;
                  }

                  if (var5 != 0) {
                     throw new IllegalStateException();
                  }
               }
            }

            var6 = var0.method10756(-995563996);
         }

         int[] var7 = var0.method10748(1815488006);
         int var8 = var1;

         for (int var9 = var3; var9 < var6; var9++) {
            if (var5 != 0) {
               throw new IllegalStateException();
            }

            var7[var9] = var8;
            var8 += var2;
         }

         var0.field6133 = true;
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "cn.ac(" + ')');
      }
   }
}
