import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.api.ChatMessageType;
import net.runelite.api.MessageNode;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cg")
public class classCG extends classVJ implements MessageNode {
   @ObfuscatedName("az")
   int field727;
   @ObfuscatedName("ae")
   int field724;
   @ObfuscatedName("pb")
   public int field721 = (int)(System.currentTimeMillis() / 1000L);
   @ObfuscatedName("as")
   String field730;
   @ObfuscatedName("af")
   int field725;
   @ObfuscatedSignature(descriptor = "Laae;")
   @ObfuscatedName("ag")
   classAAE field728;
   @ObfuscatedSignature(descriptor = "Lrc;")
   @ObfuscatedName("ac")
   classRC field723 = classRC.field5640;
   @ObfuscatedName("ax")
   String field731;
   @ObfuscatedName("ab")
   String field729;
   @ObfuscatedSignature(descriptor = "Lrc;")
   @ObfuscatedName("aa")
   classRC field722 = classRC.field5640;
   @ObfuscatedName("ch")
   public String field732;
   @ObfuscatedSignature(descriptor = "[Lyz;")
   @ObfuscatedName("ca")
   static classYZ[] field733;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   public static final int field726 = 29;

   public int getTimestamp() {
      return this.field721;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("gy")
   static final void method1496(int var0, int var1, int var2) {
      try {
         classIE var10000;
         if (var0 >= 0) {
            if (var2 == -2028542429) {
               throw new IllegalStateException();
            }

            var10000 = client.field866[var0];
         } else {
            var10000 = classKA.field3513;
         }

         classIE var3 = var10000;
         if (var3 != null) {
            if (var2 == -2028542429) {
               throw new IllegalStateException();
            }

            if (var1 >= 0) {
               if (var2 == -2028542429) {
                  throw new IllegalStateException();
               }

               if (var1 < classIE.method6183(var3, (byte)-40)) {
                  classHN var4 = (classHN)var3.field2955.get(var1);
                  if (-1 != var4.field2841) {
                     return;
                  }

                  String var5 = var4.field2846.method164(1679046558);
                  classJL var6 = classEF.method3849(classJS.CLANCHANNEL_KICKUSER, client.field795.field1535, (byte)-16);
                  classXY.method12971(var6.field3343, 3 + classAU.method712(var5, (byte)109), (byte)-119);
                  classXY.method12971(var6.field3343, var0, (byte)-30);
                  var6.field3343.method12973(var1, -1542382992);
                  classXY.method12997(var6.field3343, var5, (short)6913);
                  client.field795.method3367(var6, -1301097035);
                  return;
               }

               if (var2 == -2028542429) {
                  return;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "cg.gy(" + ')');
      }
   }

   public ChatMessageType getType() {
      ChatMessageType var1 = ChatMessageType.of(this.field727 * -601203557);
      if (var1 == ChatMessageType.CLAN_CHAT) {
         if (this.field731 != null && this.field731.startsWith("|")) {
            return ChatMessageType.CLAN_GIM_CHAT;
         }
      } else if (var1 == ChatMessageType.CLAN_MESSAGE && this.field731 != null && this.field731.startsWith("|")) {
         return ChatMessageType.CLAN_GIM_MESSAGE;
      }

      return var1;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   void method1469(int var1) {
      try {
         this.field723 = classRC.field5640;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cg.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ae")
   final boolean method1473(int var1) {
      try {
         if (this.field723 == classRC.field5640) {
            if (var1 <= -460495914) {
               throw new IllegalStateException();
            }

            this.method1480((byte)-108);
         }

         boolean var10000;
         if (classRC.field5642 == this.field723) {
            if (var1 <= -460495914) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cg.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bn")
   final boolean method1485() {
      if (classRC.field5640 == this.field722) {
         this.method1490(-2079666610);
      }

      return this.field722 == classRC.field5642;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
   @ObfuscatedName("az")
   void method1466(int var1, String var2, String var3, String var4, byte var5) {
      try {
         int var6 = (classCN.field1172 += 544858879) * -985850625 - 1;
         this.field725 = 55099013 * var6;
         this.field724 = client.field855 * 1149202047;
         this.field727 = var1 * 302524819;
         this.field729 = var2;
         this.method1491(-867691668);
         this.field730 = var3;
         this.field731 = var4;
         this.method1469(1287164533);
         this.method1484(-533308968);
         this.method1498(var1, var2, var3, var4);
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "cg.az(" + ')');
      }
   }

   classCG(int var1, String var2, String var3, String var4) {
      this.method1466(var1, var2, var3, var4, (byte)-70);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ac")
   final void method1491(int var1) {
      try {
         if (null != this.field729) {
            if (var1 <= -1967686263) {
               throw new IllegalStateException();
            }

            this.field728 = new classAAE(classKW.method6577(this.field729, 88707466), classPK.field5279);
         } else {
            this.field728 = null;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cg.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lcg;I)Z")
   @ObfuscatedName("ti")
   public static boolean method1486(classCG var0, int var1) {
      if (var0 == null) {
         return var0.method1489(var1);
      } else {
         try {
            if (classRC.field5640 == var0.field722) {
               var0.method1490(-1965250193);
            }

            boolean var10000;
            if (var0.field722 == classRC.field5642) {
               if (var1 <= 1770980892) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "cg.as(" + ')');
         }
      }
   }

   public String getValue() {
      if (this.field731 != null && this.field731.startsWith("|")) {
         ChatMessageType var1 = ChatMessageType.of(this.field727 * -601203557);
         if (var1 == ChatMessageType.CLAN_CHAT || var1 == ChatMessageType.CLAN_MESSAGE) {
            return this.field731.substring(1);
         }
      }

      return this.field731;
   }

   public String getRuneLiteFormatMessage() {
      return this.field732;
   }

   @ObfuscatedSignature(descriptor = "(B)[Lku;")
   @ObfuscatedName("ag")
   public static classKU[] method1465(byte var0) {
      try {
         return new classKU[]{classKU.field4025, classKU.field4028, classKU.field4026, classKU.field4027};
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "cg.ag(" + ')');
      }
   }

   public String getName() {
      return this.field729;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   void method1490(int var1) {
      try {
         classRC var10001;
         if (classQQ.field5597.field591.method10202(this.field728, (byte)10)) {
            if (var1 >= -1507017492) {
               throw new IllegalStateException();
            }

            var10001 = classRC.field5642;
         } else {
            var10001 = classRC.field5641;
         }

         this.field722 = var10001;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cg.ax(" + ')');
      }
   }

   public void setRuneLiteFormatMessage(String var1) {
      this.field732 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcg;)V")
   @ObfuscatedName("of")
   public static void method1492(classCG var0) {
      if (var0 == null) {
         var0.method1471();
      }

      if (null != var0.field729) {
         var0.field728 = new classAAE(classKW.method6577(var0.field729, 1572821090), classPK.field5279);
      } else {
         var0.field728 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   void method1470() {
      this.field723 = classRC.field5640;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ay")
   void method1471() {
      this.field723 = classRC.field5640;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   final boolean method1474() {
      if (this.field723 == classRC.field5640) {
         this.method1480((byte)-50);
      }

      return classRC.field5642 == this.field723;
   }

   public void setValue(String var1) {
      ChatMessageType var2 = ChatMessageType.of(this.field727 * -601203557);
      if ((var2 == ChatMessageType.CLAN_CHAT || var2 == ChatMessageType.CLAN_MESSAGE) && this.field731 != null && this.field731.startsWith("|")) {
         this.field731 = "|" + var1;
      } else {
         this.field731 = var1;
      }
   }

   public void setSender(String var1) {
      this.field730 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   final boolean method1475() {
      if (this.field723 == classRC.field5640) {
         this.method1480((byte)-106);
      }

      return classRC.field5642 == this.field723;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("ao")
   void method1467(int var1, String var2, String var3, String var4) {
      int var5 = (classCN.field1172 += 544858879) * -985850625 - 1;
      this.field725 = 55099013 * var5;
      this.field724 = client.field855 * 1149202047;
      this.field727 = var1 * 302524819;
      this.field729 = var2;
      this.method1491(116783986);
      this.field730 = var3;
      this.field731 = var4;
      this.method1469(1287164533);
      this.method1484(1920169371);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   final boolean method1476() {
      if (this.field723 == classRC.field5640) {
         this.method1480((byte)-5);
      }

      return classRC.field5642 == this.field723;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   void method1478() {
      this.field723 = classQQ.field5597.field593.method10202(this.field728, (byte)10) ? classRC.field5642 : classRC.field5641;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("wt")
   public void method1498(int var1, String var2, String var3, String var4) {
      this.field732 = null;
      this.field721 = (int)(System.currentTimeMillis() / 1000L);
      if (var2 != null) {
         int var5 = var2.lastIndexOf(62);
         if (var5 != -1) {
            this.field728 = new classAAE(var2.substring(var5 + 1), classPK.field5279);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   void method1479() {
      this.field723 = classQQ.field5597.field593.method10202(this.field728, (byte)10) ? classRC.field5642 : classRC.field5641;
   }

   public String getSender() {
      return this.field730;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   void method1481() {
      this.field722 = classRC.field5640;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcg;)V")
   @ObfuscatedName("xb")
   public static void method1493(classCG var0) {
      if (null != var0.field729) {
         var0.field728 = new classAAE(classKW.method6577(var0.field729, -1026176828), classPK.field5279);
      } else {
         var0.field728 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("av")
   void method1482() {
      this.field722 = classRC.field5640;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcg;)V")
   @ObfuscatedName("ca")
   public static void method1494(classCG var0) {
      if (null != var0.field729) {
         var0.field728 = new classAAE(classKW.method6577(var0.field729, 1689865045), classPK.field5279);
      } else {
         var0.field728 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   void method1483() {
      this.field722 = classRC.field5640;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("am")
   final boolean method1487() {
      if (classRC.field5640 == this.field722) {
         this.method1490(-1605558729);
      }

      return this.field722 == classRC.field5642;
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("aa")
   void method1468(int var1, String var2, String var3, String var4) {
      int var5 = (classCN.field1172 += 544858879) * -599409003 - 1;
      this.field725 = -1095037074 * var5;
      this.field724 = client.field855 * 1149202047;
      this.field727 = var1 * 302524819;
      this.field729 = var2;
      this.method1491(-1168561304);
      this.field730 = var3;
      this.field731 = var4;
      this.method1469(1287164533);
      this.method1484(-436229319);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ah")
   final boolean method1488() {
      if (classRC.field5640 == this.field722) {
         this.method1490(-1625357087);
      }

      return this.field722 == classRC.field5642;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   void method1472() {
      this.field723 = classRC.field5640;
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ab")
   void method1480(byte var1) {
      try {
         classRC var10001;
         if (classQQ.field5597.field593.method10202(this.field728, (byte)10)) {
            if (var1 >= 2) {
               throw new IllegalStateException();
            }

            var10001 = classRC.field5642;
         } else {
            var10001 = classRC.field5641;
         }

         this.field723 = var10001;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cg.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ax")
   void method1484(int var1) {
      try {
         this.field722 = classRC.field5640;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cg.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   final boolean method1477() {
      if (this.field723 == classRC.field5640) {
         this.method1480((byte)-75);
      }

      return classRC.field5642 == this.field723;
   }

   public int getId() {
      return this.field725 * 707758669;
   }

   public void setTimestamp(int var1) {
      this.field721 = var1;
   }

   public void setName(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.field729 = var1;
         int var2 = var1.lastIndexOf(62);
         if (var2 != -1) {
            var1 = var1.substring(var2 + 1);
         }

         this.field728 = new classAAE(var1, classPK.field5279);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("hz")
   public static boolean method1497(byte var0) {
      try {
         boolean var10000;
         if (client.field911 * 313368463 >= 2) {
            if (var0 >= 3) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "cg.hz(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Z")
   @ObfuscatedName("af")
   static boolean method1495(String var0, int var1) {
      try {
         if (var0 == null) {
            if (var1 == -885661276) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            try {
               new URL(var0);
               return true;
            } catch (MalformedURLException var3) {
               return false;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "cg.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("as")
   final boolean method1489(int var1) {
      try {
         if (classRC.field5640 == this.field722) {
            this.method1469(-1965250193);
         }

         boolean var10000;
         if (this.field722 == classRC.field5642) {
            if (var1 <= 1770980892) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cg.as(" + ')');
      }
   }
}
