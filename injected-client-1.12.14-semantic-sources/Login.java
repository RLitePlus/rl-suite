import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bv")
public class Login {
   @ObfuscatedName("cy")
   static int loginBoxX = Login.xPadding * -1970420125 + 1308961390;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field414 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field410 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field412 = 5;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field417 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field416 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   static final int field411 = 14;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field413 = 24;
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field408 = 22;
   @ObfuscatedName("dv")
   static boolean field377 = false;
   @ObfuscatedName("bf")
   static int Login_loadingPercent = 407727310;
   @ObfuscatedName("bn")
   static String Login_loadingText = "";
   @ObfuscatedName("dt")
   static boolean worldSelectOpen = false;
   @ObfuscatedName("br")
   static int field399 = 1924181287;
   @ObfuscatedName("bq")
   static String Login_username = "";
   @ObfuscatedName("bx")
   static String Login_password = "";
   @ObfuscatedName("bd")
   static int Login_banType = 494734729;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field415 = 0;
   @ObfuscatedName("cm")
   static boolean rememberUsername = true;
   @ObfuscatedName("ce")
   static String[] field387 = new String[8];
   @ObfuscatedName("cv")
   static int loginIndex = 0;
   @ObfuscatedName("df")
   static boolean field392 = false;
   @ObfuscatedName("cr")
   static String Login_response1 = "";
   @ObfuscatedName("cj")
   static String Login_response2 = "";
   @ObfuscatedName("ca")
   static String Login_response3 = "";
   @ObfuscatedName("cl")
   static String displayName = "";
   @ObfuscatedName("ds")
   static String[] field383 = new String[]{
      "logo",
      "logo_deadman_mode",
      "logo_seasonal_mode",
      "titlebox",
      "titlebutton",
      "titlebutton_large",
      "play_now_text",
      "titlebutton_wide42,1",
      "runes",
      "title_mute",
      "options_radio_buttons,0",
      "options_radio_buttons,2",
      "options_radio_buttons,4",
      "options_radio_buttons,6",
      "sl_back",
      "sl_flags",
      "sl_arrows",
      "sl_stars",
      "sl_button"
   };
   @ObfuscatedName("cw")
   static String Login_response0 = "";
   @ObfuscatedName("dy")
   static int currentLoginField = 0;
   @ObfuscatedName("dc")
   static String field398 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
   @ObfuscatedName("db")
   static String field396 = "1234567890";
   @ObfuscatedName("ch")
   static int field386 = 0;
   @ObfuscatedName("dx")
   static int hoveredWorldIndex = -660744019;
   @ObfuscatedName("dq")
   static int worldSelectPage = 0;
   @ObfuscatedName("du")
   static int worldSelectPagesCount = 0;
   @ObfuscatedName("dm")
   static long field389 = -4776144791020339515L;
   @ObfuscatedName("dp")
   static long field390 = -1917473899848792873L;
   @ObfuscatedName("dg")
   static String[] field405 = new String[]{"title.jpg"};
   @ObfuscatedName("by")
   static int xPadding = 0;
   @ObfuscatedName("de")
   static String[] field407 = new String[]{"logo_speedrunning", "logo_ugc_world"};
   @ToRemove(unused = "true")
   @ObfuscatedName("bh")
   public static final int field418 = 72;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field409 = 6;
   @ObfuscatedName("ox")
   static byte[][] field419;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;)V")
   @ObfuscatedName("cr")
   static void method1257(World var0) {
      if (var0.isMembersOnly(-1620748501) != client.isMembersWorld) {
         client.isMembersWorld = var0.isMembersOnly(-1394685881);
         class189.method4814(var0.isMembersOnly(-593873777), (byte)-28);
      }

      if (var0.location * -607869593 != -1330094789 * client.worldProperties) {
         Archive var1 = class147.archive8;
         int var2 = -607869593 * var0.location;
         if ((var2 & class594.field6435.rsOrdinal((byte)127)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "", 2027292743);
         } else if ((var2 & class594.field6409.rsOrdinal((byte)14)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "", 2088573713);
         } else if ((var2 & class594.field6433.rsOrdinal((byte)72)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "", 1930586944);
         } else if ((var2 & class594.field6417.rsOrdinal((byte)55)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_ugc_world", "", 2061665572);
         } else {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "", 1951969812);
         }
      }

      DynamicArray.worldHost = var0.host;
      client.worldId = 438507219 * var0.population;
      client.worldProperties = var0.location * -1978907195;
      class365.field4638 = var0.field283;
      WorldMapLabel.worldPort = (0 == client.gameBuild * -423864891 ? 'ꩊ' : 40000 + var0.population * 789563243) * -2014086695;
      class532.js5Port = -1309004683 * (client.gameBuild * -423864891 == 0 ? 443 : 50000 + 789563243 * var0.population);
      class46.currentPort = 564245299 * WorldMapLabel.worldPort;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cx")
   static void method1246(boolean var0) {
      if (!SecureUrlRequester.client.containsAccessAndRefreshToken(67205800)
         && !SecureUrlRequester.client.otlTokenRequesterInitialized((byte)-46)
         && !SecureUrlRequester.client.containsSessionAndCharacterId(15933612)) {
         Login_response1 = Strings.field4999;
         Login_response2 = Strings.field5100;
         Login_response3 = Strings.field5068;
         class30.method1308(2, 2125760426);
         if (var0) {
            Login_password = "";
         }

         if (Login_username == null || Login_username.isEmpty()) {
            if (class468.clientPreferences.getRememberedUsername(580719763) != null) {
               Login_username = class468.clientPreferences.getRememberedUsername(356022677);
               client.Login_isUsernameRemembered = true;
            } else {
               client.Login_isUsernameRemembered = false;
            }
         }

         WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
      } else {
         class30.method1308(10, -881096819);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;)I")
   @ObfuscatedName("bo")
   static int method1210(AbstractArchive var0, AbstractArchive var1) {
      int var2 = 0;
      String[] var3 = field405;

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];
         if (var0.tryLoadFileByNames(var5, "", -26463046)) {
            var2++;
         }
      }

      var3 = field383;

      for (int var8 = 0; var8 < var3.length; var8++) {
         String var10 = var3[var8];
         if (var1.tryLoadFileByNames(var10, "", 284829545)) {
            var2++;
         }
      }

      var3 = field407;

      for (int var9 = 0; var9 < var3.length; var9++) {
         String var11 = var3[var9];
         if (var1.groupLoadPercentByName(var11, (byte)-29) != -1 && var1.tryLoadFileByNames(var11, "", 38750383)) {
            var2++;
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;)I")
   @ObfuscatedName("bg")
   static int method1211(AbstractArchive var0, AbstractArchive var1) {
      int var2 = 0;
      String[] var3 = field405;

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];
         if (var0.tryLoadFileByNames(var5, "", -963975670)) {
            var2++;
         }
      }

      var3 = field383;

      for (int var8 = 0; var8 < var3.length; var8++) {
         String var10 = var3[var8];
         if (var1.tryLoadFileByNames(var10, "", 121850052)) {
            var2++;
         }
      }

      var3 = field407;

      for (int var9 = 0; var9 < var3.length; var9++) {
         String var11 = var3[var9];
         if (var1.groupLoadPercentByName(var11, (byte)-83) != -1 && var1.tryLoadFileByNames(var11, "", 266091788)) {
            var2++;
         }
      }

      return var2;
   }

   Login() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;)I")
   @ObfuscatedName("bz")
   static int method1212(AbstractArchive var0, AbstractArchive var1) {
      int var2 = 0;
      String[] var3 = field405;

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];
         if (var0.tryLoadFileByNames(var5, "", 653073175)) {
            var2++;
         }
      }

      var3 = field383;

      for (int var8 = 0; var8 < var3.length; var8++) {
         String var10 = var3[var8];
         if (var1.tryLoadFileByNames(var10, "", -337709161)) {
            var2++;
         }
      }

      var3 = field407;

      for (int var9 = 0; var9 < var3.length; var9++) {
         String var11 = var3[var9];
         if (var1.groupLoadPercentByName(var11, (byte)-14) != -1 && var1.tryLoadFileByNames(var11, "", -127551564)) {
            var2++;
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)I")
   @ObfuscatedName("bk")
   static int method1214(AbstractArchive var0) {
      int var1 = field405.length + field383.length;
      String[] var2 = field407;

      for (int var3 = 0; var3 < var2.length; var3++) {
         String var4 = var2[var3];
         if (var0.groupLoadPercentByName(var4, (byte)-100) != -1) {
            var1++;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;)V")
   @ObfuscatedName("cj")
   static void method1258(World var0) {
      if (var0.isMembersOnly(-1569425641) != client.isMembersWorld) {
         client.isMembersWorld = var0.isMembersOnly(-190865742);
         class189.method4814(var0.isMembersOnly(-1781301598), (byte)8);
      }

      if (var0.location * -607869593 != -1330094789 * client.worldProperties) {
         Archive var1 = class147.archive8;
         int var2 = -607869593 * var0.location;
         if ((var2 & class594.field6435.rsOrdinal((byte)106)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "", 2087547875);
         } else if ((var2 & class594.field6409.rsOrdinal((byte)19)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "", 2088581231);
         } else if ((var2 & class594.field6433.rsOrdinal((byte)15)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "", 2036195995);
         } else if ((var2 & class594.field6417.rsOrdinal((byte)2)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_ugc_world", "", 2026910466);
         } else {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "", 1906910004);
         }
      }

      DynamicArray.worldHost = var0.host;
      client.worldId = 438507219 * var0.population;
      client.worldProperties = var0.location * -1978907195;
      class365.field4638 = var0.field283;
      WorldMapLabel.worldPort = (0 == client.gameBuild * -423864891 ? 'ꩊ' : 40000 + var0.population * 789563243) * -2014086695;
      class532.js5Port = -1309004683 * (client.gameBuild * -423864891 == 0 ? 443 : 50000 + 789563243 * var0.population);
      class46.currentPort = 564245299 * WorldMapLabel.worldPort;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)I")
   @ObfuscatedName("bj")
   static int method1215(AbstractArchive var0) {
      int var1 = field405.length + field383.length;
      String[] var2 = field407;

      for (int var3 = 0; var3 < var2.length; var3++) {
         String var4 = var2[var3];
         if (var0.groupLoadPercentByName(var4, (byte)-7) != -1) {
            var1++;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)I")
   @ObfuscatedName("bm")
   static int method1216(AbstractArchive var0) {
      int var1 = field405.length + field383.length;
      String[] var2 = field407;

      for (int var3 = 0; var3 < var2.length; var3++) {
         String var4 = var2[var3];
         if (var0.groupLoadPercentByName(var4, (byte)-11) != -1) {
            var1++;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;Luw;ZI)V")
   @ObfuscatedName("bp")
   static void method1218(AbstractArchive var0, AbstractArchive var1, GraphicsDefaults var2, boolean var3, int var4) {
      if (class217.clearLoginScreen) {
         if (4 == var4) {
            class30.method1308(4, -567283882);
         }
      } else {
         if (var4 == 0) {
            class586.updateLoginStatusUsernameRemembered(var3, -1184320038);
         } else {
            class30.method1308(var4, 1254829635);
         }

         Rasterizer2D.Rasterizer2D_clear();
         byte[] var5 = var0.takeFileByNames("title.jpg", "", 291928741);
         class560.leftTitleSprite = class201.readSpritePixelsFromBytes(var5, (byte)-45);
         WorldMapData_1.rightTitleSprite = class560.leftTitleSprite.mirrorHorizontally();
         int var6 = client.worldProperties * -1330094789;
         if ((var6 & class594.field6435.rsOrdinal((byte)28)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "", 2027394711);
         } else if ((var6 & class594.field6409.rsOrdinal((byte)1)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "", 1961524314);
         } else if ((var6 & class594.field6433.rsOrdinal((byte)98)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "", 1911153230);
         } else if ((var6 & class594.field6417.rsOrdinal((byte)45)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_ugc_world", "", 2046864576);
         } else {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "", 1933947865);
         }

         class208.titleboxSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "", 1923662609);
         World.titlebuttonSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "", 2136582283);
         classLX.field3801 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "", 2050347352);
         TriBool.field5954 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "", 2034469845);
         HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "", 2138014446);
         DirectByteArrayCopier.runesSprite = class288.getFont(var1, "runes", "", (byte)-46);
         FadeOutTask.title_muteSprite = class288.getFont(var1, "title_mute", "", (byte)-29);
         class456.options_buttons_0Sprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "", 2048192392);
         UserComparator6.field1830 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "", 2067561532);
         WidgetConfigNode.options_buttons_2Sprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "", 1983908616);
         HealthBarDefinition.field2243 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "", 2024060365);
         class164.field1972 = class456.options_buttons_0Sprite.subWidth * 1636032297;
         TaskHandler.field2444 = class456.options_buttons_0Sprite.subHeight * 449044205;
         class204.loginScreenRunesAnimation = new LoginScreenAnimation(DirectByteArrayCopier.runesSprite, var2.field6140);
         if (var3) {
            Login_username = "";
            Login_password = "";
            field387 = new String[8];
            field386 = 0;
         }

         class28.otpMedium = 0;
         UserComparator6.otp = "";
         rememberUsername = true;
         worldSelectOpen = false;
         if (class468.clientPreferences.isTitleMusicDisabled(1295660215)) {
            classGK.method4244(0, 0, 1820067642);
         } else {
            class148.method4143("scape main", 255, -1604979633);
         }

         class179.method4237(-1931393605);
         JagNetThread var7 = VarbitComposition.field2488;
         var7.method9232(false, 250484711);
         class217.clearLoginScreen = true;
         xPadding = 816921945 * ((class489.canvasWidth * 120179835 - 765) / 2);
         loginBoxX = 1308961390 + xPadding * -1970420125;
         CollisionMap.loginBoxCenter = -729437604 + loginBoxX * -485361479;
         class560.leftTitleSprite.method12647(xPadding * 921778921, 0);
         WorldMapData_1.rightTitleSprite.method12647(921778921 * xPadding + 382, 0);
         class50.logoSprite.drawAt(xPadding * 921778921 + 382 - class50.logoSprite.subWidth / 2, 18);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;)V")
   @ObfuscatedName("cw")
   static void method1259(World var0) {
      if (var0.isMembersOnly(-1308423152) != client.isMembersWorld) {
         client.isMembersWorld = var0.isMembersOnly(-1858781493);
         class189.method4814(var0.isMembersOnly(-318593615), (byte)57);
      }

      if (var0.location * -607869593 != -1330094789 * client.worldProperties) {
         Archive var1 = class147.archive8;
         int var2 = -607869593 * var0.location;
         if ((var2 & class594.field6435.rsOrdinal((byte)37)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "", 2141510790);
         } else if ((var2 & class594.field6409.rsOrdinal((byte)77)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "", 1955957462);
         } else if ((var2 & class594.field6433.rsOrdinal((byte)123)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "", 2135104042);
         } else if ((var2 & class594.field6417.rsOrdinal((byte)95)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_ugc_world", "", 2088406337);
         } else {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "", 2091878840);
         }
      }

      DynamicArray.worldHost = var0.host;
      client.worldId = 438507219 * var0.population;
      client.worldProperties = var0.location * -1978907195;
      class365.field4638 = var0.field283;
      WorldMapLabel.worldPort = (0 == client.gameBuild * -423864891 ? 'ꩊ' : 40000 + var0.population * 789563243) * -2014086695;
      class532.js5Port = -1309004683 * (client.gameBuild * -423864891 == 0 ? 443 : 50000 + 789563243 * var0.population);
      class46.currentPort = 564245299 * WorldMapLabel.worldPort;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cg")
   static void method1247(boolean var0) {
      if (!SecureUrlRequester.client.containsAccessAndRefreshToken(-920017785)
         && !SecureUrlRequester.client.otlTokenRequesterInitialized((byte)-69)
         && !SecureUrlRequester.client.containsSessionAndCharacterId(626308606)) {
         Login_response1 = Strings.field4999;
         Login_response2 = Strings.field5100;
         Login_response3 = Strings.field5068;
         class30.method1308(2, -1765704973);
         if (var0) {
            Login_password = "";
         }

         if (Login_username == null || Login_username.isEmpty()) {
            if (class468.clientPreferences.getRememberedUsername(618328736) != null) {
               Login_username = class468.clientPreferences.getRememberedUsername(1204426018);
               client.Login_isUsernameRemembered = true;
            } else {
               client.Login_isUsernameRemembered = false;
            }
         }

         WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
      } else {
         class30.method1308(10, 1951794890);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cl")
   static void method1261() {
      if (class406.loadWorlds(-1112686703)) {
         worldSelectOpen = true;
         worldSelectPage = 0;
         worldSelectPagesCount = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bi")
   static void method1222() {
      if (client.Login_isUsernameRemembered && null != Login_username && !Login_username.isEmpty()) {
         currentLoginField = -1655472533;
      } else {
         currentLoginField = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("by")
   static void method1223() {
      if (client.Login_isUsernameRemembered && null != Login_username && !Login_username.isEmpty()) {
         currentLoginField = 2136561955;
      } else {
         currentLoginField = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Lsu;Lsu;)V")
   @ObfuscatedName("bw")
   static void method1224(GameEngine var0, Font var1, Font var2) {
      if (worldSelectOpen) {
         class180.method4264(var0, -1686294648);
      } else {
         if ((1 == MouseHandler.MouseHandler_lastButton * 1721626731 || !UrlRequest.mouseCam && 1721626731 * MouseHandler.MouseHandler_lastButton == 4)
            && MouseHandler.MouseHandler_lastPressedX * -1018773713 >= 765 + 921778921 * xPadding - 50
            && -261967643 * MouseHandler.MouseHandler_lastPressedY >= 453
            && MouseHandler.MouseHandler_lastPressedX * -1018773713 < 765 + xPadding * 921778921
            && -261967643 * MouseHandler.MouseHandler_lastPressedY < 503) {
            class468.clientPreferences.updateTitleMusicDisabled(!class468.clientPreferences.isTitleMusicDisabled(737902672), -895303553);
            if (class468.clientPreferences.isTitleMusicDisabled(-562410951)) {
               classGK.method4244(0, 0, 583907323);
            } else {
               class148.method4143("scape main", 255, -1251335061);
            }

            class179.method4237(-1931393605);
         }

         if (1271535343 * client.gameState != 5) {
            if (4427354477760720883L * field389 == -1L) {
               field389 = (ParamComposition.method4949((byte)15) + 1000L) * 4776144791020339515L;
            }

            long var3 = ParamComposition.method4949((byte)15);
            boolean var5;
            if (null != client.archiveLoaders && client.archiveLoadersDone * -251416631 < client.archiveLoaders.size()) {
               while (true) {
                  if (client.archiveLoadersDone * -251416631 >= client.archiveLoaders.size()) {
                     var5 = true;
                     break;
                  }

                  ArchiveLoader var6 = (ArchiveLoader)client.archiveLoaders.get(client.archiveLoadersDone * -251416631);
                  if (!ArchiveLoader.method2858(var6, (byte)-45)) {
                     var5 = false;
                     break;
                  }

                  client.archiveLoadersDone += -2132043143;
               }
            } else {
               var5 = true;
            }

            if (var5 && -1L == 9079282278280122649L * field390) {
               field390 = 1917473899848792873L * var3;
               if (field390 * 9079282278280122649L > 4427354477760720883L * field389) {
                  field389 = field390 * 4881547957185595843L;
               }
            }

            if (client.gameState * 1271535343 == 10 || 11 == client.gameState * 1271535343) {
               if (Language.Language_EN == class352.clientLanguage) {
                  if (1 == MouseHandler.MouseHandler_lastButton * 1721626731 || !UrlRequest.mouseCam && 4 == MouseHandler.MouseHandler_lastButton * 1721626731) {
                     int var25 = xPadding * 921778921 + 5;
                     short var7 = 463;
                     byte var8 = 100;
                     byte var9 = 35;
                     if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var25
                        && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= var8 + var25
                        && MouseHandler.MouseHandler_lastPressedY * -261967643 >= var7
                        && MouseHandler.MouseHandler_lastPressedY * -261967643 <= var7 + var9) {
                        classGP.method4261((short)31237);
                        return;
                     }
                  }

                  if (null != Huffman.World_request) {
                     classGP.method4261((short)32149);
                  }
               }

               int var26 = 1721626731 * MouseHandler.MouseHandler_lastButton;
               int var27 = -1018773713 * MouseHandler.MouseHandler_lastPressedX;
               int var28 = MouseHandler.MouseHandler_lastPressedY * -261967643;
               if (0 == var26) {
                  var27 = 1856325427 * MouseHandler.MouseHandler_x;
                  var28 = -1427762751 * MouseHandler.MouseHandler_y;
               }

               if (!UrlRequest.mouseCam && var26 == 4) {
                  var26 = 1;
               }

               IndexCheck var29 = HttpRequest.method280((byte)1);
               if (0 == -1614560929 * loginIndex) {
                  boolean var62 = false;

                  while (var29.method6510((byte)-85)) {
                     if (2044709447 * var29.field3386 == 84) {
                        var62 = true;
                     }
                  }

                  int var91 = -1998333989 * CollisionMap.loginBoxCenter - 80;
                  short var103 = 291;
                  if (1 == var26 && var27 >= var91 - 75 && var27 <= var91 + 75 && var28 >= var103 - 20 && var28 <= 20 + var103) {
                     class558.openURL(
                        EnumComposition.method4474("secure", true, 1756858956) + "m=account-creation/g=oldscape/create_account_funnel.ws", (short)12450
                     );
                  }

                  var91 = -1998333989 * CollisionMap.loginBoxCenter + 80;
                  if (1 == var26 && var27 >= var91 - 75 && var27 <= 75 + var91 && var28 >= var103 - 20 && var28 <= var103 + 20 || var62) {
                     if (class57.method1370(1103888673)) {
                        WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
                     } else {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)-13103);
                     }
                  }
               } else if (-1614560929 * loginIndex == 1) {
                  boolean var61 = SecureUrlRequester.client.containsAccessAndRefreshToken(-1313741327)
                     || SecureUrlRequester.client.otlTokenRequesterInitialized((byte)-35)
                     || SecureUrlRequester.client.containsSessionAndCharacterId(2022366431);

                  while (var29.method6510((byte)-110)) {
                     if (84 == var29.field3386 * 2044709447) {
                        if (var61) {
                           class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
                           client.field889 = class604.field6589;
                           classFR.method4050(false, 2027574531);
                           WorldMapSectionType.updateGameState(20, (byte)45);
                        } else {
                           SpotAnimationDefinition.Login_promptCredentials(false, (short)-23680);
                        }

                        return;
                     }

                     if (13 == var29.field3386 * 2044709447) {
                        class586.updateLoginStatusUsernameRemembered(true, -425594);
                        return;
                     }
                  }

                  int var89 = -1998333989 * CollisionMap.loginBoxCenter - 80;
                  short var102 = 321;
                  if (var26 == 1 && var27 >= var89 - 75 && var27 <= 75 + var89 && var28 >= var102 - 20 && var28 <= var102 + 20) {
                     if (var61) {
                        class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
                        client.field889 = class604.field6589;
                        classFR.method4050(false, -1192349553);
                        WorldMapSectionType.updateGameState(20, (byte)45);
                     } else {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)-17550);
                     }

                     return;
                  }

                  var89 = 80 + CollisionMap.loginBoxCenter * -1998333989;
                  if (1 == var26 && var27 >= var89 - 75 && var27 <= var89 + 75 && var28 >= var102 - 20 && var28 <= 20 + var102) {
                     class586.updateLoginStatusUsernameRemembered(true, -804103736);
                     return;
                  }
               } else if (loginIndex * -1614560929 == 2) {
                  int var56 = 201;
                  var56 += 52;
                  if (var26 == 1 && var28 >= var56 - 12 && var28 < 2 + var56) {
                     currentLoginField = 0;
                  }

                  var56 += 15;
                  if (1 == var26 && var28 >= var56 - 12 && var28 < var56 + 2) {
                     currentLoginField = -1340850443;
                  }

                  var56 += 15;
                  short var60 = 361;
                  if (class181.field2057 != null) {
                     int var84 = class181.field2057.lowX * -434199641 / 2;
                     if (var26 == 1
                        && var27 >= -316755897 * class181.field2057.highY - var84
                        && var27 <= var84 + class181.field2057.highY * -316755897
                        && var28 >= var60 - 15
                        && var28 < var60) {
                        switch (field399 * 1340994199) {
                           case 1:
                              class558.openURL(Strings.field4980, (short)-27280);
                              return;
                           case 2:
                              class558.openURL("https://support.runescape.com/hc/en-gb", (short)-20698);
                        }
                     }
                  }

                  int var85 = CollisionMap.loginBoxCenter * -1998333989 - 80;
                  short var99 = 321;
                  if (var26 == 1 && var27 >= var85 - 75 && var27 <= 75 + var85 && var28 >= var99 - 20 && var28 <= var99 + 20) {
                     classPC.method8714(-474346589);
                     return;
                  }

                  var85 = 743318851 * loginBoxX + 180 + 80;
                  if (1 == var26 && var27 >= var85 - 75 && var27 <= var85 + 75 && var28 >= var99 - 20 && var28 <= 20 + var99) {
                     class30.method1308(0, -1767811011);
                     Login_username = "";
                     Login_password = "";
                     class28.otpMedium = 0;
                     UserComparator6.otp = "";
                     rememberUsername = true;
                  }

                  var85 = -1998333989 * CollisionMap.loginBoxCenter + -117;
                  var99 = 277;
                  field377 = var27 >= var85
                     && var27 < class164.field1972 * -1436734183 + var85
                     && var28 >= var99
                     && var28 < var99 + 222768869 * TaskHandler.field2444;
                  if (1 == var26 && field377) {
                     client.Login_isUsernameRemembered = !client.Login_isUsernameRemembered;
                     if (!client.Login_isUsernameRemembered && class468.clientPreferences.getRememberedUsername(560646242) != null) {
                        class468.clientPreferences.updateRememberedUsername(null, (byte)1);
                     }
                  }

                  var85 = -1998333989 * CollisionMap.loginBoxCenter + 24;
                  var99 = 277;
                  field392 = var27 >= var85
                     && var27 < var85 + -1436734183 * class164.field1972
                     && var28 >= var99
                     && var28 < 222768869 * TaskHandler.field2444 + var99;
                  if (var26 == 1 && field392) {
                     ClientPreferences.method1569(
                        class468.clientPreferences, !ClientPreferences.method1560(class468.clientPreferences, -1353957738), 1830813007
                     );
                     if (!ClientPreferences.method1560(class468.clientPreferences, 353937217)) {
                        Login_username = "";
                        class468.clientPreferences.updateRememberedUsername(null, (byte)1);
                        WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
                     }
                  }

                  while (var29.method6510((byte)-97)) {
                     if (13 == 2044709447 * var29.field3386) {
                        class30.method1308(0, -151973972);
                        Login_username = "";
                        Login_password = "";
                        class28.otpMedium = 0;
                        UserComparator6.otp = "";
                        rememberUsername = true;
                     } else if (currentLoginField * 244972893 == 0) {
                        char var108 = var29.field3385;
                        int var113 = 0;

                        while (var113 < field398.length() && var108 != field398.charAt(var113)) {
                           var113++;
                        }

                        if (85 == var29.field3386 * 2044709447 && !Login_username.isEmpty()) {
                           Login_username = Login_username.substring(0, Login_username.length() - 1);
                        }

                        if (84 == 2044709447 * var29.field3386 || var29.field3386 * 2044709447 == 80) {
                           currentLoginField = -1340850443;
                        }

                        if (class145.method4148(var29.field3385, (byte)-37) && Login_username.length() < 320) {
                           Login_username = Login_username + var29.field3385;
                        }
                     } else if (currentLoginField * 244972893 == 1) {
                        if (2044709447 * var29.field3386 == 85 && !Login_password.isEmpty()) {
                           Login_password = Login_password.substring(0, Login_password.length() - 1);
                        } else if (84 == 2044709447 * var29.field3386 || 80 == var29.field3386 * 2044709447) {
                           currentLoginField = 0;
                           if (2044709447 * var29.field3386 == 84) {
                              classPC.method8714(-1951603230);
                              return;
                           }
                        }

                        if ((IndexCheck.method6514(var29, 82, (short)1337) || IndexCheck.method6514(var29, 87, (short)1337))
                           && 67 == var29.field3386 * 2044709447) {
                           Clipboard var109 = Toolkit.getDefaultToolkit().getSystemClipboard();
                           Transferable var114 = var109.getContents(SecureUrlRequester.client);
                           int var116 = 20 - Login_password.length();
                           if (var116 > 0) {
                              try {
                                 String var118 = (String)var114.getTransferData(DataFlavor.stringFlavor);
                                 int var120 = Math.min(var116, var118.length());

                                 for (int var122 = 0; var122 < var120; var122++) {
                                    if (!AbstractWorldMapData.method7256(var118.charAt(var122), -580673349)
                                       || !class145.method4148(var118.charAt(var122), (byte)-94)) {
                                       class30.method1308(3, -2141804834);
                                       return;
                                    }
                                 }

                                 Login_password = Login_password + var118.substring(0, var120);
                              } catch (UnsupportedFlavorException var23) {
                              } catch (IOException var24) {
                              }
                           }
                        } else if (AbstractWorldMapData.method7256(var29.field3385, -580673349)
                           && class145.method4148(var29.field3385, (byte)-54)
                           && Login_password.length() < 20) {
                           Login_password = Login_password + var29.field3385;
                        }
                     }
                  }
               } else if (loginIndex * -1614560929 == 3) {
                  int var10 = 743318851 * loginBoxX + 180;
                  short var11 = 241;
                  Bounds var12 = var1.method10401(25, Strings.field4906.length() - 34, Strings.field4906, var10, var11);
                  if (var26 == 1 && var12.method9506(var27, var28, -865920487)) {
                     class558.openURL(Strings.field5166, (short)12865);
                  }

                  var10 = 180 + loginBoxX * 743318851;
                  var11 = 276;
                  if (1 == var26 && var27 >= var10 - 75 && var27 <= var10 + 75 && var28 >= var11 - 20 && var28 <= var11 + 20) {
                     class586.updateLoginStatusUsernameRemembered(false, -1185104262);
                  }

                  var10 = 180 + 743318851 * loginBoxX;
                  var11 = 326;
                  if (var26 == 1 && var27 >= var10 - 75 && var27 <= 75 + var10 && var28 >= var11 - 20 && var28 <= var11 + 20) {
                     class558.openURL(Strings.field4980, (short)-5760);
                     return;
                  }
               } else if (4 == loginIndex * -1614560929) {
                  int var32 = 180 + loginBoxX * 743318851 - 80;
                  short var65 = 321;
                  if (1 == var26 && var27 >= var32 - 75 && var27 <= var32 + 75 && var28 >= var65 - 20 && var28 <= var65 + 20) {
                     FriendSystem.method471(2098873486);
                     return;
                  }

                  if (var26 == 1 && var27 >= loginBoxX * 743318851 + 180 - 9 && var27 <= 130 + loginBoxX * 743318851 + 180 && var28 >= 263 && var28 <= 296) {
                     rememberUsername = !rememberUsername;
                  }

                  if (var26 == 1 && var27 >= 180 + loginBoxX * 743318851 - 34 && var27 <= 180 + 743318851 * loginBoxX + 34 && var28 >= 351 && var28 <= 363) {
                     class558.openURL(Strings.field4980, (short)23508);
                  }

                  var32 = 80 + 180 + loginBoxX * 743318851;
                  if (1 == var26 && var27 >= var32 - 75 && var27 <= 75 + var32 && var28 >= var65 - 20 && var28 <= 20 + var65) {
                     class30.method1308(0, -398861606);
                     Login_username = "";
                     Login_password = "";
                     class28.otpMedium = 0;
                     UserComparator6.otp = "";
                  }

                  while (var29.method6510((byte)-109)) {
                     boolean var93 = false;

                     for (int var13 = 0; var13 < field396.length(); var13++) {
                        if (var29.field3385 == field396.charAt(var13)) {
                           var93 = true;
                           break;
                        }
                     }

                     if (var29.field3386 * 2044709447 == 13) {
                        class30.method1308(0, 1688745221);
                        Login_username = "";
                        Login_password = "";
                        class28.otpMedium = 0;
                        UserComparator6.otp = "";
                     } else {
                        if (2044709447 * var29.field3386 == 85 && !UserComparator6.otp.isEmpty()) {
                           UserComparator6.otp = UserComparator6.otp.substring(0, UserComparator6.otp.length() - 1);
                        }

                        if (var29.field3386 * 2044709447 == 84) {
                           FriendSystem.method471(2046243365);
                           return;
                        }

                        if (var93 && UserComparator6.otp.length() < 6) {
                           UserComparator6.otp = UserComparator6.otp + var29.field3385;
                        }
                     }
                  }
               } else if (5 == loginIndex * -1614560929) {
                  int var34 = 180 + loginBoxX * 743318851 - 80;
                  short var66 = 321;
                  if (var26 == 1 && var27 >= var34 - 75 && var27 <= var34 + 75 && var28 >= var66 - 20 && var28 <= var66 + 20) {
                     class299.performLoginRequest(1604318032);
                     return;
                  }

                  var34 = 180 + 743318851 * loginBoxX + 80;
                  if (var26 == 1 && var27 >= var34 - 75 && var27 <= 75 + var34 && var28 >= var66 - 20 && var28 <= var66 + 20) {
                     SpotAnimationDefinition.Login_promptCredentials(true, (short)-28734);
                  }

                  short var94 = 361;
                  if (WorldMapElement.field2221 != null) {
                     int var104 = -434199641 * WorldMapElement.field2221.lowX / 2;
                     if (1 == var26
                        && var27 >= -316755897 * WorldMapElement.field2221.highY - var104
                        && var27 <= WorldMapElement.field2221.highY * -316755897 + var104
                        && var28 >= var94 - 15
                        && var28 < var94) {
                        class558.openURL(EnumComposition.method4474("secure", true, 300876208) + "m=weblogin/g=oldscape/cant_log_in", (short)-13086);
                     }
                  }

                  while (var29.method6510((byte)11)) {
                     boolean var105 = false;

                     for (int var14 = 0; var14 < field398.length(); var14++) {
                        if (var29.field3385 == field398.charAt(var14)) {
                           var105 = true;
                           break;
                        }
                     }

                     if (2044709447 * var29.field3386 == 13) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-4203);
                     } else {
                        if (85 == var29.field3386 * 2044709447 && !Login_username.isEmpty()) {
                           Login_username = Login_username.substring(0, Login_username.length() - 1);
                        }

                        if (84 == 2044709447 * var29.field3386) {
                           class299.performLoginRequest(991050173);
                           return;
                        }

                        if (var105 && Login_username.length() < 320) {
                           Login_username = Login_username + var29.field3385;
                        }
                     }
                  }
               } else if (6 != -1614560929 * loginIndex) {
                  if (7 == loginIndex * -1614560929) {
                     if (Frames.field3189 && !client.onMobile) {
                        int var39 = -1998333989 * CollisionMap.loginBoxCenter - 150;
                        int var68 = var39 + 240 + 25 + 40;
                        short var95 = 231;
                        int var106 = var95 + 40;
                        if (1 == var26 && var27 >= var39 && var27 <= var68 && var28 >= var95 && var28 <= var106) {
                           field386 = classRE.method9417(var39, var27, (byte)71) * 262832811;
                        }

                        int var110 = 180 + 743318851 * loginBoxX - 80;
                        short var15 = 321;
                        if (1 == var26 && var27 >= var110 - 75 && var27 <= 75 + var110 && var28 >= var15 - 20 && var28 <= 20 + var15) {
                           boolean var16;
                           label912: {
                              Date var17;
                              try {
                                 var17 = class356.method7762(2098003466);
                              } catch (ParseException var22) {
                                 WorldMapEvent.method7541(
                                    "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -353953243
                                 );
                                 var16 = false;
                                 break label912;
                              }

                              if (var17 == null) {
                                 var16 = false;
                              } else {
                                 Calendar var19 = Calendar.getInstance();
                                 var19.set(1, var19.get(1) - 13);
                                 var19.set(5, var19.get(5) + 1);
                                 var19.set(11, 0);
                                 var19.set(12, 0);
                                 var19.set(13, 0);
                                 var19.set(14, 0);
                                 Date var20 = var19.getTime();
                                 boolean var18 = var17.before(var20);
                                 boolean var124 = class4.method74(var17, -1918074519);
                                 if (!var124) {
                                    WorldMapEvent.method7541(
                                       "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 1752287196
                                    );
                                    var16 = false;
                                 } else {
                                    if (!var18) {
                                       class67.field1275 = -325447997;
                                    } else {
                                       class67.field1275 = (int)(var17.getTime() / 86400000L - 11745L) * -1310330563;
                                    }

                                    var16 = true;
                                 }
                              }
                           }

                           if (var16) {
                              WorldMapSectionType.updateGameState(50, (byte)45);
                              return;
                           }
                        }

                        var110 = 80 + 180 + loginBoxX * 743318851;
                        if (1 == var26 && var27 >= var110 - 75 && var27 <= 75 + var110 && var28 >= var15 - 20 && var28 <= 20 + var15) {
                           field387 = new String[8];
                           SpotAnimationDefinition.Login_promptCredentials(true, (short)-12903);
                        }

                        while (var29.method6510((byte)-48)) {
                           if (101 == 2044709447 * var29.field3386) {
                              field387[465659907 * field386] = null;
                           }

                           if (85 == 2044709447 * var29.field3386) {
                              if (field387[465659907 * field386] == null && field386 * 465659907 > 0) {
                                 field386 -= 262832811;
                              }

                              field387[465659907 * field386] = null;
                           }

                           if (var29.field3385 >= '0' && var29.field3385 <= '9') {
                              field387[465659907 * field386] = "" + var29.field3385;
                              if (field386 * 465659907 < 7) {
                                 field386 += 262832811;
                              }
                           }

                           if (2044709447 * var29.field3386 == 84) {
                              boolean var117;
                              label832: {
                                 Date var119;
                                 try {
                                    var119 = class356.method7762(2005718870);
                                 } catch (ParseException var21) {
                                    WorldMapEvent.method7541(
                                       "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -845793167
                                    );
                                    var117 = false;
                                    break label832;
                                 }

                                 if (null == var119) {
                                    var117 = false;
                                 } else {
                                    Calendar var123 = Calendar.getInstance();
                                    var123.set(1, var123.get(1) - 13);
                                    var123.set(5, var123.get(5) + 1);
                                    var123.set(11, 0);
                                    var123.set(12, 0);
                                    var123.set(13, 0);
                                    var123.set(14, 0);
                                    Date var125 = var123.getTime();
                                    boolean var121 = var119.before(var125);
                                    boolean var126 = class4.method74(var119, -30168991);
                                    if (!var126) {
                                       WorldMapEvent.method7541(
                                          "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 1176349696
                                       );
                                       var117 = false;
                                    } else {
                                       if (!var121) {
                                          class67.field1275 = -325447997;
                                       } else {
                                          class67.field1275 = (int)(var119.getTime() / 86400000L - 11745L) * -1310330563;
                                       }

                                       var117 = true;
                                    }
                                 }
                              }

                              if (var117) {
                                 WorldMapSectionType.updateGameState(50, (byte)45);
                              }

                              return;
                           }
                        }
                     } else {
                        int var37 = 743318851 * loginBoxX + 180 - 80;
                        short var67 = 321;
                        if (1 == var26 && var27 >= var37 - 75 && var27 <= 75 + var37 && var28 >= var67 - 20 && var28 <= var67 + 20) {
                           class558.openURL(EnumComposition.method4474("secure", true, 760850452) + "m=dob/set_dob.ws", (short)12424);
                           class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                           class30.method1308(6, 296340222);
                           return;
                        }

                        var37 = 80 + 180 + 743318851 * loginBoxX;
                        if (var26 == 1 && var27 >= var37 - 75 && var27 <= var37 + 75 && var28 >= var67 - 20 && var28 <= 20 + var67) {
                           SpotAnimationDefinition.Login_promptCredentials(true, (short)-18948);
                        }
                     }
                  } else if (8 == loginIndex * -1614560929) {
                     int var40 = 743318851 * loginBoxX + 180 - 80;
                     short var69 = 321;
                     if (var26 == 1 && var27 >= var40 - 75 && var27 <= 75 + var40 && var28 >= var69 - 20 && var28 <= 20 + var69) {
                        class558.openURL("https://www.jagex.com/terms/privacy", (short)-14886);
                        class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                        class30.method1308(6, -72195227);
                        return;
                     }

                     var40 = 80 + 743318851 * loginBoxX + 180;
                     if (1 == var26 && var27 >= var40 - 75 && var27 <= 75 + var40 && var28 >= var69 - 20 && var28 <= var69 + 20) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-4050);
                     }
                  } else if (-1614560929 * loginIndex == 9) {
                     int var42 = 180 + 743318851 * loginBoxX;
                     short var70 = 311;
                     if (84 == 2044709447 * var29.field3386
                        || var29.field3386 * 2044709447 == 13
                        || 1 == var26 && var27 >= var42 - 75 && var27 <= var42 + 75 && var28 >= var70 - 20 && var28 <= 20 + var70) {
                        class586.updateLoginStatusUsernameRemembered(false, -74402998);
                     }
                  } else if (10 == loginIndex * -1614560929) {
                     int var43 = loginBoxX * 743318851 + 180;
                     short var71 = 209;
                     if (var29.field3386 * 2044709447 == 84
                        || var26 == 1 && var27 >= var43 - 109 && var27 <= 109 + var43 && var28 >= var71 && var28 <= var71 + 68) {
                        if (class57.method1370(1356570737)) {
                           return;
                        }

                        class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
                        client.field889 = class604.field6589;
                        classFR.method4050(false, 1229849872);
                        WorldMapSectionType.updateGameState(20, (byte)45);
                     }
                  } else if (-1614560929 * loginIndex == 12) {
                     int var44 = CollisionMap.loginBoxCenter * -1998333989;
                     int var72 = 233;
                     Bounds var96 = var2.method10401(0, 30, Strings.field4996, var44, var72);
                     Bounds var107 = var2.method10401(32, 32, Strings.field4996, var44, var72);
                     Bounds var112 = var2.method10401(70, 34, Strings.field4996, var44, var72);
                     var72 += 17;
                     Bounds var115 = var2.method10401(0, 34, Strings.field4865, var44, var72);
                     if (var26 == 1) {
                        if (var96.method9506(var27, var28, 1749352243)) {
                           class558.openURL("https://www.jagex.com/terms", (short)13571);
                        } else if (var107.method9506(var27, var28, 1757657286)) {
                           class558.openURL("https://www.jagex.com/terms/privacy", (short)-10023);
                        } else if (var112.method9506(var27, var28, -812893028) || var115.method9506(var27, var28, 723872739)) {
                           class558.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", (short)-3400);
                        }
                     }

                     var44 = CollisionMap.loginBoxCenter * -1998333989 - 80;
                     short var74 = 311;
                     if (1 == var26 && var27 >= var44 - 75 && var27 <= var44 + 75 && var28 >= var74 - 20 && var28 <= var74 + 20) {
                        WorldMapAreaData.method7358(-349606447);
                        class586.updateLoginStatusUsernameRemembered(true, -161485321);
                     }

                     var44 = 80 + CollisionMap.loginBoxCenter * -1998333989;
                     if (var26 == 1 && var27 >= var44 - 75 && var27 <= var44 + 75 && var28 >= var74 - 20 && var28 <= 20 + var74) {
                        loginIndex = -464840173;
                     }
                  } else if (loginIndex * -1614560929 == 13) {
                     int var47 = -1998333989 * CollisionMap.loginBoxCenter;
                     short var75 = 321;
                     if (var26 == 1 && var27 >= var47 - 75 && var27 <= var47 + 75 && var28 >= var75 - 20 && var28 <= 20 + var75) {
                        class586.updateLoginStatusUsernameRemembered(true, -188506011);
                     }
                  } else if (loginIndex * -1614560929 == 14) {
                     String var48 = "";
                     switch (-1858173113 * Login_banType) {
                        case 0:
                           var48 = "https://secure.runescape.com/m=offence-appeal/account-history";
                           break;
                        case 1:
                           var48 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                           break;
                        case 2:
                           var48 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                           break;
                        default:
                           SpotAnimationDefinition.Login_promptCredentials(false, (short)-20869);
                     }

                     int var76 = 180 + 743318851 * loginBoxX;
                     short var97 = 276;
                     if (var26 == 1 && var27 >= var76 - 75 && var27 <= 75 + var76 && var28 >= var97 - 20 && var28 <= 20 + var97) {
                        class558.openURL(var48, (short)-8977);
                        class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                        class30.method1308(6, 1781107394);
                        return;
                     }

                     var76 = 180 + loginBoxX * 743318851;
                     var97 = 326;
                     if (var26 == 1 && var27 >= var76 - 75 && var27 <= var76 + 75 && var28 >= var97 - 20 && var28 <= 20 + var97) {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)-6579);
                     }
                  } else if (24 == -1614560929 * loginIndex) {
                     int var49 = 180 + 743318851 * loginBoxX;
                     short var78 = 301;
                     if (1 == var26 && var27 >= var49 - 75 && var27 <= 75 + var49 && var28 >= var78 - 20 && var28 <= 20 + var78) {
                        class586.updateLoginStatusUsernameRemembered(false, 186200358);
                     }
                  } else if (loginIndex * -1614560929 == 32) {
                     int var50 = 180 + 743318851 * loginBoxX - 80;
                     short var79 = 321;
                     if (var26 == 1 && var27 >= var50 - 75 && var27 <= var50 + 75 && var28 >= var79 - 20 && var28 <= 20 + var79) {
                        class558.openURL(EnumComposition.method4474("secure", true, -276443666) + "m=dob/set_dob.ws", (short)-5096);
                        class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                        class30.method1308(6, 1882974358);
                        return;
                     }

                     var50 = 180 + loginBoxX * 743318851 + 80;
                     if (var26 == 1 && var27 >= var50 - 75 && var27 <= var50 + 75 && var28 >= var79 - 20 && var28 <= var79 + 20) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-10756);
                     }
                  } else if (33 == -1614560929 * loginIndex) {
                     int var52 = 743318851 * loginBoxX + 180;
                     short var80 = 276;
                     if (var26 == 1 && var27 >= var52 - 75 && var27 <= 75 + var52 && var28 >= var80 - 20 && var28 <= var80 + 20) {
                        class558.openURL(Strings.field5166, (short)3604);
                     }

                     var52 = 180 + 743318851 * loginBoxX;
                     var80 = 326;
                     if (var26 == 1 && var27 >= var52 - 75 && var27 <= var52 + 75 && var28 >= var80 - 20 && var28 <= var80 + 20) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-7940);
                     }
                  } else if (34 == -1614560929 * loginIndex) {
                     int var54 = 743318851 * loginBoxX + 180;
                     short var82 = 276;
                     if (var26 == 1 && var27 >= var54 - 75 && var27 <= 75 + var54 && var28 >= var82 - 20 && var28 <= var82 + 20) {
                        classGP.method4261((short)25266);
                        return;
                     }

                     if (null != Huffman.World_request) {
                        classGP.method4261((short)30306);
                     }

                     var54 = 180 + 743318851 * loginBoxX;
                     var82 = 326;
                     if (1 == var26 && var27 >= var54 - 75 && var27 <= 75 + var54 && var28 >= var82 - 20 && var28 <= var82 + 20) {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)1517);
                     }
                  }
               } else {
                  while (var29.method6510((byte)-120)) {
                     if (84 == 2044709447 * var29.field3386 || 13 == var29.field3386 * 2044709447) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-29925);
                     }
                  }

                  short var36 = 321;
                  if (var26 == 1 && var28 >= var36 - 20 && var28 <= 20 + var36) {
                     SpotAnimationDefinition.Login_promptCredentials(true, (short)-25069);
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Lsu;Lsu;)V")
   @ObfuscatedName("bf")
   static void method1225(GameEngine var0, Font var1, Font var2) {
      if (worldSelectOpen) {
         class180.method4264(var0, -1661853944);
      } else {
         if ((1 == MouseHandler.MouseHandler_lastButton * -969308172 || !UrlRequest.mouseCam && 1721626731 * MouseHandler.MouseHandler_lastButton == 4)
            && MouseHandler.MouseHandler_lastPressedX * 30540146 >= 765 + 790242385 * xPadding - 50
            && 1475987463 * MouseHandler.MouseHandler_lastPressedY >= 453
            && MouseHandler.MouseHandler_lastPressedX * -1018773713 < 765 + xPadding * -2080339186
            && -338019788 * MouseHandler.MouseHandler_lastPressedY < 503) {
            class468.clientPreferences.updateTitleMusicDisabled(!class468.clientPreferences.isTitleMusicDisabled(-2294909), 1276226831);
            if (class468.clientPreferences.isTitleMusicDisabled(579684970)) {
               classGK.method4244(0, 0, 1573424884);
            } else {
               class148.method4143("scape main", 255, -1082667479);
            }

            class179.method4237(-1931393605);
         }

         if (-742529898 * client.gameState != 5) {
            if (4427354477760720883L * field389 == -1L) {
               field389 = (ParamComposition.method4949((byte)15) + 1000L) * 4776144791020339515L;
            }

            long var3 = ParamComposition.method4949((byte)15);
            boolean var5;
            if (null != client.archiveLoaders && client.archiveLoadersDone * -251416631 < client.archiveLoaders.size()) {
               while (true) {
                  if (client.archiveLoadersDone * -2050050603 >= client.archiveLoaders.size()) {
                     var5 = true;
                     break;
                  }

                  ArchiveLoader var6 = (ArchiveLoader)client.archiveLoaders.get(client.archiveLoadersDone * -251416631);
                  if (!ArchiveLoader.method2858(var6, (byte)-111)) {
                     var5 = false;
                     break;
                  }

                  client.archiveLoadersDone += 1257713436;
               }
            } else {
               var5 = true;
            }

            if (var5 && -1L == 9079282278280122649L * field390) {
               field390 = 1917473899848792873L * var3;
               if (field390 * 9079282278280122649L > 4427354477760720883L * field389) {
                  field389 = field390 * 4881547957185595843L;
               }
            }

            if (client.gameState * 1271535343 == 10 || 11 == client.gameState * 1271535343) {
               if (Language.Language_EN == class352.clientLanguage) {
                  if (1 == MouseHandler.MouseHandler_lastButton * 1807847008 || !UrlRequest.mouseCam && 4 == MouseHandler.MouseHandler_lastButton * -1748777167
                     )
                   {
                     int var25 = xPadding * -139426712 + 5;
                     short var7 = 463;
                     byte var8 = 100;
                     byte var9 = 35;
                     if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var25
                        && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= var8 + var25
                        && MouseHandler.MouseHandler_lastPressedY * -275339191 >= var7
                        && MouseHandler.MouseHandler_lastPressedY * 560520440 <= var7 + var9) {
                        classGP.method4261((short)154);
                        return;
                     }
                  }

                  if (null != Huffman.World_request) {
                     classGP.method4261((short)23027);
                  }
               }

               int var26 = 603949388 * MouseHandler.MouseHandler_lastButton;
               int var27 = 637693900 * MouseHandler.MouseHandler_lastPressedX;
               int var28 = MouseHandler.MouseHandler_lastPressedY * 38578247;
               if (0 == var26) {
                  var27 = 1856325427 * MouseHandler.MouseHandler_x;
                  var28 = 569237490 * MouseHandler.MouseHandler_y;
               }

               if (!UrlRequest.mouseCam && var26 == 4) {
                  var26 = 1;
               }

               IndexCheck var29 = HttpRequest.method280((byte)1);
               if (0 == -1614560929 * loginIndex) {
                  boolean var62 = false;

                  while (var29.method6510((byte)-93)) {
                     if (1628906274 * var29.field3386 == 922729393) {
                        var62 = true;
                     }
                  }

                  int var91 = -1549471952 * CollisionMap.loginBoxCenter - 80;
                  short var103 = 291;
                  if (1 == var26 && var27 >= var91 - 75 && var27 <= var91 + -1833008399 && var28 >= var103 - 20 && var28 <= 20 + var103) {
                     class558.openURL(
                        EnumComposition.method4474("secure", true, 847627765) + "m=account-creation/g=oldscape/create_account_funnel.ws", (short)1739
                     );
                  }

                  var91 = -1162669651 * CollisionMap.loginBoxCenter + 1487240955;
                  if (1 == var26 && var27 >= var91 - 75 && var27 <= 1562035645 + var91 && var28 >= var103 - 20 && var28 <= var103 + 20 || var62) {
                     if (class57.method1370(-1038917620)) {
                        WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
                     } else {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)-30043);
                     }
                  }
               } else if (-158820579 * loginIndex == 1) {
                  boolean var61 = SecureUrlRequester.client.containsAccessAndRefreshToken(-53466876)
                     || SecureUrlRequester.client.otlTokenRequesterInitialized((byte)-107)
                     || SecureUrlRequester.client.containsSessionAndCharacterId(1283570423);

                  while (var29.method6510((byte)-126)) {
                     if (-821536304 == var29.field3386 * -2102114052) {
                        if (var61) {
                           class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
                           client.field889 = class604.field6589;
                           classFR.method4050(false, -1779308015);
                           WorldMapSectionType.updateGameState(20, (byte)45);
                        } else {
                           SpotAnimationDefinition.Login_promptCredentials(false, (short)-19441);
                        }

                        return;
                     }

                     if (13 == var29.field3386 * 2044709447) {
                        class586.updateLoginStatusUsernameRemembered(true, -642398733);
                        return;
                     }
                  }

                  int var89 = 364507941 * CollisionMap.loginBoxCenter - 1852473984;
                  short var102 = 321;
                  if (var26 == 1 && var27 >= var89 - 75 && var27 <= -975948874 + var89 && var28 >= var102 - 20 && var28 <= var102 + 20) {
                     if (var61) {
                        class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
                        client.field889 = class604.field6589;
                        classFR.method4050(false, 360886475);
                        WorldMapSectionType.updateGameState(20, (byte)45);
                     } else {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)-270);
                     }

                     return;
                  }

                  var89 = 80 + CollisionMap.loginBoxCenter * 728422885;
                  if (1 == var26 && var27 >= var89 - 75 && var27 <= var89 + 75 && var28 >= var102 - 20 && var28 <= 20 + var102) {
                     class586.updateLoginStatusUsernameRemembered(true, -235785866);
                     return;
                  }
               } else if (loginIndex * -1614560929 == 2) {
                  int var56 = -1319212639;
                  var56 += 52;
                  if (var26 == 1 && var28 >= var56 - 12 && var28 < 2 + var56) {
                     currentLoginField = 0;
                  }

                  var56 += 15;
                  if (1 == var26 && var28 >= var56 - 12 && var28 < var56 + 2) {
                     currentLoginField = 1218792460;
                  }

                  var56 += 15;
                  var56 = -443709366;
                  if (class181.field2057 != null) {
                     int var84 = class181.field2057.lowX * -434199641 / 2;
                     if (var26 == 1
                        && var27 >= -316755897 * class181.field2057.highY - var84
                        && var27 <= var84 + class181.field2057.highY * -316755897
                        && var28 >= var56 - 15
                        && var28 < var56) {
                        switch (field399 * 1340994199) {
                           case 1:
                              class558.openURL(Strings.field4980, (short)7735);
                              return;
                           case 2:
                              class558.openURL("https://support.runescape.com/hc/en-gb", (short)921);
                        }
                     }
                  }

                  int var85 = CollisionMap.loginBoxCenter * -1998333989 - 1491595325;
                  int var99 = -1084720552;
                  if (var26 == 1 && var27 >= var85 - 75 && var27 <= 75 + var85 && var28 >= var99 - 20 && var28 <= var99 + 20) {
                     classPC.method8714(-1582303979);
                     return;
                  }

                  var85 = 1358386896 * loginBoxX + 180 + 2049698827;
                  if (1 == var26 && var27 >= var85 - 341526780 && var27 <= var85 + 906605937 && var28 >= var99 - 20 && var28 <= 20 + var99) {
                     class30.method1308(0, -776343103);
                     Login_username = "";
                     Login_password = "";
                     class28.otpMedium = 0;
                     UserComparator6.otp = "";
                     rememberUsername = true;
                  }

                  var85 = -854414960 * CollisionMap.loginBoxCenter + -117;
                  var99 = -2090714799;
                  field377 = var27 >= var85
                     && var27 < class164.field1972 * 96908452 + var85
                     && var28 >= var99
                     && var28 < var99 + 2130430938 * TaskHandler.field2444;
                  if (1 == var26 && field377) {
                     client.Login_isUsernameRemembered = !client.Login_isUsernameRemembered;
                     if (!client.Login_isUsernameRemembered && class468.clientPreferences.getRememberedUsername(1637195065) != null) {
                        class468.clientPreferences.updateRememberedUsername(null, (byte)1);
                     }
                  }

                  var85 = 1130510263 * CollisionMap.loginBoxCenter + 24;
                  var99 = 1107399238;
                  field392 = var27 >= var85
                     && var27 < var85 + 122422398 * class164.field1972
                     && var28 >= var99
                     && var28 < 222768869 * TaskHandler.field2444 + var99;
                  if (var26 == 1 && field392) {
                     ClientPreferences.method1569(class468.clientPreferences, !ClientPreferences.method1560(class468.clientPreferences, -128167976), 219859791);
                     if (!ClientPreferences.method1560(class468.clientPreferences, 158000093)) {
                        Login_username = "";
                        class468.clientPreferences.updateRememberedUsername(null, (byte)1);
                        WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
                     }
                  }

                  while (var29.method6510((byte)10)) {
                     if (13 == -70096247 * var29.field3386) {
                        class30.method1308(0, -157865371);
                        Login_username = "";
                        Login_password = "";
                        class28.otpMedium = 0;
                        UserComparator6.otp = "";
                        rememberUsername = true;
                     } else if (currentLoginField * 1794085827 == 0) {
                        char var108 = var29.field3385;
                        int var113 = 0;

                        while (var113 < field398.length() && var108 != field398.charAt(var113)) {
                           var113++;
                        }

                        if (85 == var29.field3386 * 1474514903 && !Login_username.isEmpty()) {
                           Login_username = Login_username.substring(0, Login_username.length() - 1);
                        }

                        if (1662836416 == 2044709447 * var29.field3386 || var29.field3386 * 2044709447 == 80) {
                           currentLoginField = -1340850443;
                        }

                        if (class145.method4148(var29.field3385, (byte)-119) && Login_username.length() < 1245780826) {
                           Login_username = Login_username + var29.field3385;
                        }
                     } else if (currentLoginField * 244972893 == 1) {
                        if (-365964226 * var29.field3386 == 85 && !Login_password.isEmpty()) {
                           Login_password = Login_password.substring(0, Login_password.length() - 1);
                        } else if (84 == 2044709447 * var29.field3386 || 664281447 == var29.field3386 * -1306975971) {
                           currentLoginField = 0;
                           if (2047501757 * var29.field3386 == 70331808) {
                              classPC.method8714(381395408);
                              return;
                           }
                        }

                        if ((IndexCheck.method6514(var29, 82, (short)1337) || IndexCheck.method6514(var29, 87, (short)1337))
                           && -2110932609 == var29.field3386 * 931942454) {
                           Clipboard var109 = Toolkit.getDefaultToolkit().getSystemClipboard();
                           Transferable var114 = var109.getContents(SecureUrlRequester.client);
                           int var116 = 20 - Login_password.length();
                           if (var116 > 0) {
                              try {
                                 String var118 = (String)var114.getTransferData(DataFlavor.stringFlavor);
                                 int var120 = Math.min(var116, var118.length());

                                 for (int var122 = 0; var122 < var120; var122++) {
                                    if (!AbstractWorldMapData.method7256(var118.charAt(var122), -580673349)
                                       || !class145.method4148(var118.charAt(var122), (byte)-21)) {
                                       class30.method1308(3, 2136917584);
                                       return;
                                    }
                                 }

                                 Login_password = Login_password + var118.substring(0, var120);
                              } catch (UnsupportedFlavorException var23) {
                              } catch (IOException var24) {
                              }
                           }
                        } else if (AbstractWorldMapData.method7256(var29.field3385, -580673349)
                           && class145.method4148(var29.field3385, (byte)-110)
                           && Login_password.length() < 20) {
                           Login_password = Login_password + var29.field3385;
                        }
                     }
                  }
               } else if (loginIndex * 2018299252 == 3) {
                  int var10 = 743318851 * loginBoxX + -590846706;
                  int var11 = 241;
                  Bounds var12 = var1.method10401(25, Strings.field4906.length() - 910615460, Strings.field4906, var10, var11);
                  if (var26 == 1 && var12.method9506(var27, var28, -140606258)) {
                     class558.openURL(Strings.field5166, (short)-10129);
                  }

                  var10 = 180 + loginBoxX * 743318851;
                  var11 = 1578611723;
                  if (1 == var26 && var27 >= var10 - 451526462 && var27 <= var10 + 75 && var28 >= var11 - 20 && var28 <= var11 + 20) {
                     class586.updateLoginStatusUsernameRemembered(false, -547112278);
                  }

                  var10 = -807564789 + 1884808208 * loginBoxX;
                  short var64 = 326;
                  if (var26 == 1 && var27 >= var10 - 2126201003 && var27 <= 643427958 + var10 && var28 >= var64 - 20 && var28 <= var64 + 20) {
                     class558.openURL(Strings.field4980, (short)5107);
                     return;
                  }
               } else if (4 == loginIndex * -161283879) {
                  int var32 = 241947983 + loginBoxX * 1094728086 - 80;
                  short var65 = 321;
                  if (1 == var26 && var27 >= var32 - 75 && var27 <= var32 + -2094003161 && var28 >= var65 - 20 && var28 <= var65 + 20) {
                     FriendSystem.method471(-538539933);
                     return;
                  }

                  if (var26 == 1
                     && var27 >= loginBoxX * 743318851 + 332912088 - 9
                     && var27 <= -2115038564 + loginBoxX * 743318851 + 1755939365
                     && var28 >= 1466861290
                     && var28 <= 296) {
                     rememberUsername = !rememberUsername;
                  }

                  if (var26 == 1
                     && var27 >= 180 + loginBoxX * 2060523185 - 34
                     && var27 <= 96491760 + 743318851 * loginBoxX + 400429998
                     && var28 >= 351
                     && var28 <= 363) {
                     class558.openURL(Strings.field4980, (short)-29416);
                  }

                  var32 = -1648716078 + -113440479 + loginBoxX * 743318851;
                  if (1 == var26 && var27 >= var32 - 75 && var27 <= 75 + var32 && var28 >= var65 - 20 && var28 <= 20 + var65) {
                     class30.method1308(0, -75637723);
                     Login_username = "";
                     Login_password = "";
                     class28.otpMedium = 0;
                     UserComparator6.otp = "";
                  }

                  while (var29.method6510((byte)-110)) {
                     boolean var93 = false;

                     for (int var13 = 0; var13 < field396.length(); var13++) {
                        if (var29.field3385 == field396.charAt(var13)) {
                           var93 = true;
                           break;
                        }
                     }

                     if (var29.field3386 * 2044709447 == 13) {
                        class30.method1308(0, 1801571409);
                        Login_username = "";
                        Login_password = "";
                        class28.otpMedium = 0;
                        UserComparator6.otp = "";
                     } else {
                        if (2044709447 * var29.field3386 == 2084679210 && !UserComparator6.otp.isEmpty()) {
                           UserComparator6.otp = UserComparator6.otp.substring(0, UserComparator6.otp.length() - 1);
                        }

                        if (var29.field3386 * 2044709447 == 84) {
                           FriendSystem.method471(356285825);
                           return;
                        }

                        if (var93 && UserComparator6.otp.length() < 6) {
                           UserComparator6.otp = UserComparator6.otp + var29.field3385;
                        }
                     }
                  }
               } else if (5 == loginIndex * -1614560929) {
                  int var34 = 533435427 + loginBoxX * -2012416979 - -1135988005;
                  short var66 = 321;
                  if (var26 == 1 && var27 >= var34 - 1522849796 && var27 <= var34 + 75 && var28 >= var66 - 20 && var28 <= var66 + 20) {
                     class299.performLoginRequest(169871048);
                     return;
                  }

                  var34 = 180 + -385384867 * loginBoxX + -1454050805;
                  if (var26 == 1 && var27 >= var34 - 75 && var27 <= -267215376 + var34 && var28 >= var66 - 20 && var28 <= var66 + 20) {
                     SpotAnimationDefinition.Login_promptCredentials(true, (short)-47);
                  }

                  int var94 = 1111936936;
                  if (WorldMapElement.field2221 != null) {
                     int var104 = -434199641 * WorldMapElement.field2221.lowX / 2;
                     if (1 == var26
                        && var27 >= 2129831780 * WorldMapElement.field2221.highY - var104
                        && var27 <= WorldMapElement.field2221.highY * 1192751728 + var104
                        && var28 >= var94 - 15
                        && var28 < var94) {
                        class558.openURL(EnumComposition.method4474("secure", true, 153448862) + "m=weblogin/g=oldscape/cant_log_in", (short)-14031);
                     }
                  }

                  while (var29.method6510((byte)-21)) {
                     boolean var105 = false;

                     for (int var14 = 0; var14 < field398.length(); var14++) {
                        if (var29.field3385 == field398.charAt(var14)) {
                           var105 = true;
                           break;
                        }
                     }

                     if (2044709447 * var29.field3386 == 13) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-4322);
                     } else {
                        if (85 == var29.field3386 * 960725841 && !Login_username.isEmpty()) {
                           Login_username = Login_username.substring(0, Login_username.length() - 1);
                        }

                        if (84 == -1737168857 * var29.field3386) {
                           class299.performLoginRequest(-418948851);
                           return;
                        }

                        if (var105 && Login_username.length() < 320) {
                           Login_username = Login_username + var29.field3385;
                        }
                     }
                  }
               } else if (6 != -1614560929 * loginIndex) {
                  if (7 == loginIndex * -1614560929) {
                     if (Frames.field3189 && !client.onMobile) {
                        int var39 = -1998333989 * CollisionMap.loginBoxCenter - 1403700651;
                        int var68 = var39 + 240 + 25 + 40;
                        int var95 = 1874792650;
                        int var106 = var95 + 1681792215;
                        if (1 == var26 && var27 >= var39 && var27 <= var68 && var28 >= var95 && var28 <= var106) {
                           field386 = classRE.method9417(var39, var27, (byte)126) * 90454660;
                        }

                        int var110 = -900428553 + 743318851 * loginBoxX - 80;
                        int var15 = -564989827;
                        if (1 == var26 && var27 >= var110 - 75 && var27 <= 75 + var110 && var28 >= var15 - 20 && var28 <= 20 + var15) {
                           boolean var16;
                           label912: {
                              Date var17;
                              try {
                                 var17 = class356.method7762(2053871758);
                              } catch (ParseException var22) {
                                 WorldMapEvent.method7541(
                                    "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -787420530
                                 );
                                 var16 = false;
                                 break label912;
                              }

                              if (var17 == null) {
                                 var16 = false;
                              } else {
                                 Calendar var19 = Calendar.getInstance();
                                 var19.set(1, var19.get(1) - 13);
                                 var19.set(5, var19.get(5) + 1);
                                 var19.set(11, 0);
                                 var19.set(12, 0);
                                 var19.set(13, 0);
                                 var19.set(14, 0);
                                 Date var20 = var19.getTime();
                                 boolean var18 = var17.before(var20);
                                 boolean var124 = class4.method74(var17, -406315589);
                                 if (!var124) {
                                    WorldMapEvent.method7541(
                                       "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -733955421
                                    );
                                    var16 = false;
                                 } else {
                                    if (!var18) {
                                       class67.field1275 = -325447997;
                                    } else {
                                       class67.field1275 = (int)(var17.getTime() / 86400000L - 11745L) * -1310330563;
                                    }

                                    var16 = true;
                                 }
                              }
                           }

                           if (var16) {
                              WorldMapSectionType.updateGameState(50, (byte)45);
                              return;
                           }
                        }

                        var110 = 160738047 + -602407343 + loginBoxX * -2142717301;
                        if (1 == var26 && var27 >= var110 - -1320707596 && var27 <= 75 + var110 && var28 >= var15 - 20 && var28 <= 20 + var15) {
                           field387 = new String[8];
                           SpotAnimationDefinition.Login_promptCredentials(true, (short)-17623);
                        }

                        while (var29.method6510((byte)-30)) {
                           if (-1791095581 == 1207127223 * var29.field3386) {
                              field387[465659907 * field386] = null;
                           }

                           if (1357301170 == 1033340251 * var29.field3386) {
                              if (field387[-1178019584 * field386] == null && field386 * 465659907 > 0) {
                                 field386 -= -539343690;
                              }

                              field387[465659907 * field386] = null;
                           }

                           if (var29.field3385 >= -738453983 && var29.field3385 <= 882506210) {
                              field387[748711795 * field386] = "" + var29.field3385;
                              if (field386 * 465659907 < 7) {
                                 field386 += 262832811;
                              }
                           }

                           if (1919621598 * var29.field3386 == 84) {
                              boolean var117;
                              label832: {
                                 Date var119;
                                 try {
                                    var119 = class356.method7762(1993830512);
                                 } catch (ParseException var21) {
                                    WorldMapEvent.method7541(
                                       "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 1924438748
                                    );
                                    var117 = false;
                                    break label832;
                                 }

                                 if (null == var119) {
                                    var117 = false;
                                 } else {
                                    Calendar var123 = Calendar.getInstance();
                                    var123.set(1, var123.get(1) - 13);
                                    var123.set(5, var123.get(5) + 1);
                                    var123.set(11, 0);
                                    var123.set(12, 0);
                                    var123.set(13, 0);
                                    var123.set(14, 0);
                                    Date var125 = var123.getTime();
                                    boolean var121 = var119.before(var125);
                                    boolean var126 = class4.method74(var119, -1089850849);
                                    if (!var126) {
                                       WorldMapEvent.method7541(
                                          "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 501587028
                                       );
                                       var117 = false;
                                    } else {
                                       if (!var121) {
                                          class67.field1275 = -115615601;
                                       } else {
                                          class67.field1275 = (int)(var119.getTime() / 86400000L - 11745L) * 518718675;
                                       }

                                       var117 = true;
                                    }
                                 }
                              }

                              if (var117) {
                                 WorldMapSectionType.updateGameState(73050071, (byte)45);
                              }

                              return;
                           }
                        }
                     } else {
                        int var37 = 743318851 * loginBoxX + 220478757 - 80;
                        int var67 = -337361066;
                        if (1 == var26 && var27 >= var37 - 813632430 && var27 <= 75 + var37 && var28 >= var67 - 20 && var28 <= var67 + 20) {
                           class558.openURL(EnumComposition.method4474("secure", true, -1634888828) + "m=dob/set_dob.ws", (short)6635);
                           class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                           class30.method1308(6, 640037373);
                           return;
                        }

                        var37 = -765875529 + -1048644666 + 743318851 * loginBoxX;
                        if (var26 == 1 && var27 >= var37 - 75 && var27 <= var37 + 679619657 && var28 >= var67 - 20 && var28 <= 20 + var67) {
                           SpotAnimationDefinition.Login_promptCredentials(true, (short)-10510);
                        }
                     }
                  } else if (8 == loginIndex * -1614560929) {
                     int var40 = 743318851 * loginBoxX + 14163429 - 80;
                     short var69 = 321;
                     if (var26 == 1 && var27 >= var40 - 75 && var27 <= 75 + var40 && var28 >= var69 - 20 && var28 <= 20 + var69) {
                        class558.openURL("https://www.jagex.com/terms/privacy", (short)-1083);
                        class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                        class30.method1308(6, 2080764166);
                        return;
                     }

                     var40 = -1419278075 + 743318851 * loginBoxX + 180;
                     if (1 == var26 && var27 >= var40 - 75 && var27 <= 75 + var40 && var28 >= var69 - 20 && var28 <= var69 + 20) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-6698);
                     }
                  } else if (-1614560929 * loginIndex == 9) {
                     int var42 = -1349524529 + 743318851 * loginBoxX;
                     int var70 = 1254156292;
                     if (84 == 2044709447 * var29.field3386
                        || var29.field3386 * 2044709447 == 13
                        || 1 == var26 && var27 >= var42 - 75 && var27 <= var42 + 75 && var28 >= var70 - 20 && var28 <= 20 + var70) {
                        class586.updateLoginStatusUsernameRemembered(false, -713637717);
                     }
                  } else if (10 == loginIndex * -1614560929) {
                     int var43 = loginBoxX * 743318851 + -1196478430;
                     int var71 = 914884372;
                     if (var29.field3386 * 496349085 == 469600936
                        || var26 == 1 && var27 >= var43 - 109 && var27 <= -1437596742 + var43 && var28 >= var71 && var28 <= var71 + 68) {
                        if (class57.method1370(65949208)) {
                           return;
                        }

                        class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
                        client.field889 = class604.field6589;
                        classFR.method4050(false, 606866084);
                        WorldMapSectionType.updateGameState(20, (byte)45);
                     }
                  } else if (-1614560929 * loginIndex == 12) {
                     int var44 = CollisionMap.loginBoxCenter * -936505059;
                     int var72 = 233;
                     Bounds var96 = var2.method10401(0, 30, Strings.field4996, var44, var72);
                     Bounds var107 = var2.method10401(32, 32, Strings.field4996, var44, var72);
                     Bounds var112 = var2.method10401(70, 1698410457, Strings.field4996, var44, var72);
                     var72 += 17;
                     Bounds var115 = var2.method10401(0, -153738751, Strings.field4865, var44, var72);
                     if (var26 == 1) {
                        if (var96.method9506(var27, var28, 291845417)) {
                           class558.openURL("https://www.jagex.com/terms", (short)-1249);
                        } else if (var107.method9506(var27, var28, 1019378294)) {
                           class558.openURL("https://www.jagex.com/terms/privacy", (short)9477);
                        } else if (var112.method9506(var27, var28, -834498241) || var115.method9506(var27, var28, -416655083)) {
                           class558.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", (short)-1520);
                        }
                     }

                     var44 = CollisionMap.loginBoxCenter * -1998333989 - 2015217440;
                     var72 = -864564502;
                     if (1 == var26 && var27 >= var44 - 75 && var27 <= var44 + 75 && var28 >= var72 - 20 && var28 <= var72 + 20) {
                        WorldMapAreaData.method7358(-1355454361);
                        class586.updateLoginStatusUsernameRemembered(true, -876648186);
                     }

                     var44 = 509592000 + CollisionMap.loginBoxCenter * -1998333989;
                     if (var26 == 1 && var27 >= var44 - 75 && var27 <= var44 + 75 && var28 >= var72 - 20 && var28 <= 20 + var72) {
                        loginIndex = -464840173;
                     }
                  } else if (loginIndex * -1614560929 == 13) {
                     int var47 = -229609373 * CollisionMap.loginBoxCenter;
                     short var75 = 321;
                     if (var26 == 1 && var27 >= var47 - 75 && var27 <= var47 + -1958452510 && var28 >= var75 - 20 && var28 <= 20 + var75) {
                        class586.updateLoginStatusUsernameRemembered(true, -339084545);
                     }
                  } else if (loginIndex * 308167387 == 14) {
                     String var48 = "";
                     switch (-1858173113 * Login_banType) {
                        case 0:
                           var48 = "https://secure.runescape.com/m=offence-appeal/account-history";
                           break;
                        case 1:
                           var48 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                           break;
                        case 2:
                           var48 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                           break;
                        default:
                           SpotAnimationDefinition.Login_promptCredentials(false, (short)-11124);
                     }

                     int var76 = 180 + 1632345020 * loginBoxX;
                     int var97 = -357746033;
                     if (var26 == 1 && var27 >= var76 - 75 && var27 <= 75 + var76 && var28 >= var97 - 20 && var28 <= 20 + var97) {
                        class558.openURL(var48, (short)-10151);
                        class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                        class30.method1308(6, 1534458170);
                        return;
                     }

                     var76 = 180 + loginBoxX * 1854423371;
                     short var98 = 326;
                     if (var26 == 1 && var27 >= var76 - 537018961 && var27 <= var76 + 75 && var28 >= var98 - 20 && var28 <= 20 + var98) {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)3633);
                     }
                  } else if (24 == -631745840 * loginIndex) {
                     int var49 = 195625464 + 1678359092 * loginBoxX;
                     int var78 = -1787435807;
                     if (1 == var26 && var27 >= var49 - -667435564 && var27 <= 75 + var49 && var28 >= var78 - 20 && var28 <= 20 + var78) {
                        class586.updateLoginStatusUsernameRemembered(false, -1912227595);
                     }
                  } else if (loginIndex * -1614560929 == 32) {
                     int var50 = -569086597 + -1531179295 * loginBoxX - 80;
                     int var79 = 705781092;
                     if (var26 == 1 && var27 >= var50 - -285516289 && var27 <= var50 + -1150324672 && var28 >= var79 - 20 && var28 <= 20 + var79) {
                        class558.openURL(EnumComposition.method4474("secure", true, -2077697297) + "m=dob/set_dob.ws", (short)26520);
                        class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                        class30.method1308(6, 846160858);
                        return;
                     }

                     var50 = 180 + loginBoxX * 1758111770 + 80;
                     if (var26 == 1 && var27 >= var50 - -27259769 && var27 <= var50 + -1051830108 && var28 >= var79 - 20 && var28 <= var79 + 20) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-19383);
                     }
                  } else if (2014884417 == 13659222 * loginIndex) {
                     int var52 = 743318851 * loginBoxX + 1766961289;
                     int var80 = 276;
                     if (var26 == 1 && var27 >= var52 - 1747518163 && var27 <= 75 + var52 && var28 >= var80 - 20 && var28 <= var80 + 20) {
                        class558.openURL(Strings.field5166, (short)-2794);
                     }

                     var52 = -380798119 + -275469757 * loginBoxX;
                     var80 = -1635133892;
                     if (var26 == 1 && var27 >= var52 - 75 && var27 <= var52 + 75 && var28 >= var80 - 20 && var28 <= var80 + 20) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-13897);
                     }
                  } else if (-448438381 == -1614560929 * loginIndex) {
                     int var54 = 1418219502 * loginBoxX + 180;
                     int var82 = 276;
                     if (var26 == 1 && var27 >= var54 - 75 && var27 <= 75 + var54 && var28 >= var82 - 20 && var28 <= var82 + 20) {
                        classGP.method4261((short)11709);
                        return;
                     }

                     if (null != Huffman.World_request) {
                        classGP.method4261((short)7670);
                     }

                     var54 = 180 + 743318851 * loginBoxX;
                     var82 = -1207882379;
                     if (1 == var26 && var27 >= var54 - -932024420 && var27 <= 807375059 + var54 && var28 >= var82 - 20 && var28 <= var82 + 20) {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)-27330);
                     }
                  }
               } else {
                  while (var29.method6510((byte)-62)) {
                     if (2109788689 == 396349940 * var29.field3386 || 13 == var29.field3386 * 2044709447) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)4130);
                     }
                  }

                  int var36 = -1890994432;
                  if (var26 == 1 && var28 >= var36 - 20 && var28 <= 20 + var36) {
                     SpotAnimationDefinition.Login_promptCredentials(true, (short)-8126);
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Lsu;Lsu;)V")
   @ObfuscatedName("bn")
   static void method1226(GameEngine var0, Font var1, Font var2) {
      if (worldSelectOpen) {
         class180.method4264(var0, -1566282363);
      } else {
         if ((1 == MouseHandler.MouseHandler_lastButton * 1721626731 || !UrlRequest.mouseCam && 1721626731 * MouseHandler.MouseHandler_lastButton == 4)
            && MouseHandler.MouseHandler_lastPressedX * -1018773713 >= 765 + 921778921 * xPadding - 50
            && -261967643 * MouseHandler.MouseHandler_lastPressedY >= 453
            && MouseHandler.MouseHandler_lastPressedX * -1018773713 < 765 + xPadding * 921778921
            && -261967643 * MouseHandler.MouseHandler_lastPressedY < 503) {
            class468.clientPreferences.updateTitleMusicDisabled(!class468.clientPreferences.isTitleMusicDisabled(-624814405), 2052708636);
            if (class468.clientPreferences.isTitleMusicDisabled(832957022)) {
               classGK.method4244(0, 0, 2082768018);
            } else {
               class148.method4143("scape main", 255, -952555161);
            }

            class179.method4237(-1931393605);
         }

         if (1271535343 * client.gameState != 5) {
            if (4427354477760720883L * field389 == -1L) {
               field389 = (ParamComposition.method4949((byte)15) + 1000L) * 4776144791020339515L;
            }

            long var3 = ParamComposition.method4949((byte)15);
            boolean var5;
            if (null != client.archiveLoaders && client.archiveLoadersDone * -251416631 < client.archiveLoaders.size()) {
               while (true) {
                  if (client.archiveLoadersDone * -251416631 >= client.archiveLoaders.size()) {
                     var5 = true;
                     break;
                  }

                  ArchiveLoader var6 = (ArchiveLoader)client.archiveLoaders.get(client.archiveLoadersDone * -251416631);
                  if (!ArchiveLoader.method2858(var6, (byte)-91)) {
                     var5 = false;
                     break;
                  }

                  client.archiveLoadersDone += -2132043143;
               }
            } else {
               var5 = true;
            }

            if (var5 && -1L == 9079282278280122649L * field390) {
               field390 = 1917473899848792873L * var3;
               if (field390 * 9079282278280122649L > 4427354477760720883L * field389) {
                  field389 = field390 * 4881547957185595843L;
               }
            }

            if (client.gameState * 1271535343 == 10 || 11 == client.gameState * 1271535343) {
               if (Language.Language_EN == class352.clientLanguage) {
                  if (1 == MouseHandler.MouseHandler_lastButton * 1721626731 || !UrlRequest.mouseCam && 4 == MouseHandler.MouseHandler_lastButton * 1721626731) {
                     int var25 = xPadding * 921778921 + 5;
                     short var7 = 463;
                     byte var8 = 100;
                     byte var9 = 35;
                     if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var25
                        && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= var8 + var25
                        && MouseHandler.MouseHandler_lastPressedY * -261967643 >= var7
                        && MouseHandler.MouseHandler_lastPressedY * -261967643 <= var7 + var9) {
                        classGP.method4261((short)11981);
                        return;
                     }
                  }

                  if (null != Huffman.World_request) {
                     classGP.method4261((short)29589);
                  }
               }

               int var26 = 1721626731 * MouseHandler.MouseHandler_lastButton;
               int var27 = -1018773713 * MouseHandler.MouseHandler_lastPressedX;
               int var28 = MouseHandler.MouseHandler_lastPressedY * -261967643;
               if (0 == var26) {
                  var27 = 1856325427 * MouseHandler.MouseHandler_x;
                  var28 = -1427762751 * MouseHandler.MouseHandler_y;
               }

               if (!UrlRequest.mouseCam && var26 == 4) {
                  var26 = 1;
               }

               IndexCheck var29 = HttpRequest.method280((byte)1);
               if (0 == -1614560929 * loginIndex) {
                  boolean var62 = false;

                  while (var29.method6510((byte)-101)) {
                     if (2044709447 * var29.field3386 == 84) {
                        var62 = true;
                     }
                  }

                  int var91 = -1998333989 * CollisionMap.loginBoxCenter - 80;
                  short var103 = 291;
                  if (1 == var26 && var27 >= var91 - 75 && var27 <= var91 + 75 && var28 >= var103 - 20 && var28 <= 20 + var103) {
                     class558.openURL(
                        EnumComposition.method4474("secure", true, 1094230144) + "m=account-creation/g=oldscape/create_account_funnel.ws", (short)-15385
                     );
                  }

                  var91 = -1998333989 * CollisionMap.loginBoxCenter + 80;
                  if (1 == var26 && var27 >= var91 - 75 && var27 <= 75 + var91 && var28 >= var103 - 20 && var28 <= var103 + 20 || var62) {
                     if (class57.method1370(1242949273)) {
                        WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
                     } else {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)-31969);
                     }
                  }
               } else if (-1614560929 * loginIndex == 1) {
                  boolean var61 = SecureUrlRequester.client.containsAccessAndRefreshToken(-1109438494)
                     || SecureUrlRequester.client.otlTokenRequesterInitialized((byte)-116)
                     || SecureUrlRequester.client.containsSessionAndCharacterId(506796328);

                  while (var29.method6510((byte)-90)) {
                     if (84 == var29.field3386 * 2044709447) {
                        if (var61) {
                           class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
                           client.field889 = class604.field6589;
                           classFR.method4050(false, -37775517);
                           WorldMapSectionType.updateGameState(20, (byte)45);
                        } else {
                           SpotAnimationDefinition.Login_promptCredentials(false, (short)3141);
                        }

                        return;
                     }

                     if (13 == var29.field3386 * 2044709447) {
                        class586.updateLoginStatusUsernameRemembered(true, 31420435);
                        return;
                     }
                  }

                  int var89 = -1998333989 * CollisionMap.loginBoxCenter - 80;
                  short var102 = 321;
                  if (var26 == 1 && var27 >= var89 - 75 && var27 <= 75 + var89 && var28 >= var102 - 20 && var28 <= var102 + 20) {
                     if (var61) {
                        class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
                        client.field889 = class604.field6589;
                        classFR.method4050(false, -426549860);
                        WorldMapSectionType.updateGameState(20, (byte)45);
                     } else {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)-26168);
                     }

                     return;
                  }

                  var89 = 80 + CollisionMap.loginBoxCenter * -1998333989;
                  if (1 == var26 && var27 >= var89 - 75 && var27 <= var89 + 75 && var28 >= var102 - 20 && var28 <= 20 + var102) {
                     class586.updateLoginStatusUsernameRemembered(true, -454688821);
                     return;
                  }
               } else if (loginIndex * -1614560929 == 2) {
                  int var56 = 201;
                  var56 += 52;
                  if (var26 == 1 && var28 >= var56 - 12 && var28 < 2 + var56) {
                     currentLoginField = 0;
                  }

                  var56 += 15;
                  if (1 == var26 && var28 >= var56 - 12 && var28 < var56 + 2) {
                     currentLoginField = -1340850443;
                  }

                  var56 += 15;
                  short var60 = 361;
                  if (class181.field2057 != null) {
                     int var84 = class181.field2057.lowX * -434199641 / 2;
                     if (var26 == 1
                        && var27 >= -316755897 * class181.field2057.highY - var84
                        && var27 <= var84 + class181.field2057.highY * -316755897
                        && var28 >= var60 - 15
                        && var28 < var60) {
                        switch (field399 * 1340994199) {
                           case 1:
                              class558.openURL(Strings.field4980, (short)-7634);
                              return;
                           case 2:
                              class558.openURL("https://support.runescape.com/hc/en-gb", (short)4888);
                        }
                     }
                  }

                  int var85 = CollisionMap.loginBoxCenter * -1998333989 - 80;
                  short var99 = 321;
                  if (var26 == 1 && var27 >= var85 - 75 && var27 <= 75 + var85 && var28 >= var99 - 20 && var28 <= var99 + 20) {
                     classPC.method8714(-1636021130);
                     return;
                  }

                  var85 = 743318851 * loginBoxX + 180 + 80;
                  if (1 == var26 && var27 >= var85 - 75 && var27 <= var85 + 75 && var28 >= var99 - 20 && var28 <= 20 + var99) {
                     class30.method1308(0, 1210901916);
                     Login_username = "";
                     Login_password = "";
                     class28.otpMedium = 0;
                     UserComparator6.otp = "";
                     rememberUsername = true;
                  }

                  var85 = -1998333989 * CollisionMap.loginBoxCenter + -117;
                  var99 = 277;
                  field377 = var27 >= var85
                     && var27 < class164.field1972 * -1436734183 + var85
                     && var28 >= var99
                     && var28 < var99 + 222768869 * TaskHandler.field2444;
                  if (1 == var26 && field377) {
                     client.Login_isUsernameRemembered = !client.Login_isUsernameRemembered;
                     if (!client.Login_isUsernameRemembered && class468.clientPreferences.getRememberedUsername(234780438) != null) {
                        class468.clientPreferences.updateRememberedUsername(null, (byte)1);
                     }
                  }

                  var85 = -1998333989 * CollisionMap.loginBoxCenter + 24;
                  var99 = 277;
                  field392 = var27 >= var85
                     && var27 < var85 + -1436734183 * class164.field1972
                     && var28 >= var99
                     && var28 < 222768869 * TaskHandler.field2444 + var99;
                  if (var26 == 1 && field392) {
                     ClientPreferences.method1569(class468.clientPreferences, !ClientPreferences.method1560(class468.clientPreferences, -134643022), 206639596);
                     if (!ClientPreferences.method1560(class468.clientPreferences, -259346461)) {
                        Login_username = "";
                        class468.clientPreferences.updateRememberedUsername(null, (byte)1);
                        WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
                     }
                  }

                  while (var29.method6510((byte)-15)) {
                     if (13 == 2044709447 * var29.field3386) {
                        class30.method1308(0, 990014519);
                        Login_username = "";
                        Login_password = "";
                        class28.otpMedium = 0;
                        UserComparator6.otp = "";
                        rememberUsername = true;
                     } else if (currentLoginField * 244972893 == 0) {
                        char var108 = var29.field3385;
                        int var113 = 0;

                        while (var113 < field398.length() && var108 != field398.charAt(var113)) {
                           var113++;
                        }

                        if (85 == var29.field3386 * 2044709447 && !Login_username.isEmpty()) {
                           Login_username = Login_username.substring(0, Login_username.length() - 1);
                        }

                        if (84 == 2044709447 * var29.field3386 || var29.field3386 * 2044709447 == 80) {
                           currentLoginField = -1340850443;
                        }

                        if (class145.method4148(var29.field3385, (byte)-26) && Login_username.length() < 320) {
                           Login_username = Login_username + var29.field3385;
                        }
                     } else if (currentLoginField * 244972893 == 1) {
                        if (2044709447 * var29.field3386 == 85 && !Login_password.isEmpty()) {
                           Login_password = Login_password.substring(0, Login_password.length() - 1);
                        } else if (84 == 2044709447 * var29.field3386 || 80 == var29.field3386 * 2044709447) {
                           currentLoginField = 0;
                           if (2044709447 * var29.field3386 == 84) {
                              classPC.method8714(517492728);
                              return;
                           }
                        }

                        if ((IndexCheck.method6514(var29, 82, (short)1337) || IndexCheck.method6514(var29, 87, (short)1337))
                           && 67 == var29.field3386 * 2044709447) {
                           Clipboard var109 = Toolkit.getDefaultToolkit().getSystemClipboard();
                           Transferable var114 = var109.getContents(SecureUrlRequester.client);
                           int var116 = 20 - Login_password.length();
                           if (var116 > 0) {
                              try {
                                 String var118 = (String)var114.getTransferData(DataFlavor.stringFlavor);
                                 int var120 = Math.min(var116, var118.length());

                                 for (int var122 = 0; var122 < var120; var122++) {
                                    if (!AbstractWorldMapData.method7256(var118.charAt(var122), -580673349)
                                       || !class145.method4148(var118.charAt(var122), (byte)-68)) {
                                       class30.method1308(3, -1172020310);
                                       return;
                                    }
                                 }

                                 Login_password = Login_password + var118.substring(0, var120);
                              } catch (UnsupportedFlavorException var23) {
                              } catch (IOException var24) {
                              }
                           }
                        } else if (AbstractWorldMapData.method7256(var29.field3385, -580673349)
                           && class145.method4148(var29.field3385, (byte)-52)
                           && Login_password.length() < 20) {
                           Login_password = Login_password + var29.field3385;
                        }
                     }
                  }
               } else if (loginIndex * -1614560929 == 3) {
                  int var10 = 743318851 * loginBoxX + 180;
                  short var11 = 241;
                  Bounds var12 = var1.method10401(25, Strings.field4906.length() - 34, Strings.field4906, var10, var11);
                  if (var26 == 1 && var12.method9506(var27, var28, 922888448)) {
                     class558.openURL(Strings.field5166, (short)15659);
                  }

                  var10 = 180 + loginBoxX * 743318851;
                  var11 = 276;
                  if (1 == var26 && var27 >= var10 - 75 && var27 <= var10 + 75 && var28 >= var11 - 20 && var28 <= var11 + 20) {
                     class586.updateLoginStatusUsernameRemembered(false, -1522056972);
                  }

                  var10 = 180 + 743318851 * loginBoxX;
                  var11 = 326;
                  if (var26 == 1 && var27 >= var10 - 75 && var27 <= 75 + var10 && var28 >= var11 - 20 && var28 <= var11 + 20) {
                     class558.openURL(Strings.field4980, (short)-3631);
                     return;
                  }
               } else if (4 == loginIndex * -1614560929) {
                  int var32 = 180 + loginBoxX * 743318851 - 80;
                  short var65 = 321;
                  if (1 == var26 && var27 >= var32 - 75 && var27 <= var32 + 75 && var28 >= var65 - 20 && var28 <= var65 + 20) {
                     FriendSystem.method471(1455067890);
                     return;
                  }

                  if (var26 == 1 && var27 >= loginBoxX * 743318851 + 180 - 9 && var27 <= 130 + loginBoxX * 743318851 + 180 && var28 >= 263 && var28 <= 296) {
                     rememberUsername = !rememberUsername;
                  }

                  if (var26 == 1 && var27 >= 180 + loginBoxX * 743318851 - 34 && var27 <= 180 + 743318851 * loginBoxX + 34 && var28 >= 351 && var28 <= 363) {
                     class558.openURL(Strings.field4980, (short)14506);
                  }

                  var32 = 80 + 180 + loginBoxX * 743318851;
                  if (1 == var26 && var27 >= var32 - 75 && var27 <= 75 + var32 && var28 >= var65 - 20 && var28 <= 20 + var65) {
                     class30.method1308(0, -1530409900);
                     Login_username = "";
                     Login_password = "";
                     class28.otpMedium = 0;
                     UserComparator6.otp = "";
                  }

                  while (var29.method6510((byte)-109)) {
                     boolean var93 = false;

                     for (int var13 = 0; var13 < field396.length(); var13++) {
                        if (var29.field3385 == field396.charAt(var13)) {
                           var93 = true;
                           break;
                        }
                     }

                     if (var29.field3386 * 2044709447 == 13) {
                        class30.method1308(0, -1839710208);
                        Login_username = "";
                        Login_password = "";
                        class28.otpMedium = 0;
                        UserComparator6.otp = "";
                     } else {
                        if (2044709447 * var29.field3386 == 85 && !UserComparator6.otp.isEmpty()) {
                           UserComparator6.otp = UserComparator6.otp.substring(0, UserComparator6.otp.length() - 1);
                        }

                        if (var29.field3386 * 2044709447 == 84) {
                           FriendSystem.method471(-259078558);
                           return;
                        }

                        if (var93 && UserComparator6.otp.length() < 6) {
                           UserComparator6.otp = UserComparator6.otp + var29.field3385;
                        }
                     }
                  }
               } else if (5 == loginIndex * -1614560929) {
                  int var34 = 180 + loginBoxX * 743318851 - 80;
                  short var66 = 321;
                  if (var26 == 1 && var27 >= var34 - 75 && var27 <= var34 + 75 && var28 >= var66 - 20 && var28 <= var66 + 20) {
                     class299.performLoginRequest(1869178873);
                     return;
                  }

                  var34 = 180 + 743318851 * loginBoxX + 80;
                  if (var26 == 1 && var27 >= var34 - 75 && var27 <= 75 + var34 && var28 >= var66 - 20 && var28 <= var66 + 20) {
                     SpotAnimationDefinition.Login_promptCredentials(true, (short)-31981);
                  }

                  short var94 = 361;
                  if (WorldMapElement.field2221 != null) {
                     int var104 = -434199641 * WorldMapElement.field2221.lowX / 2;
                     if (1 == var26
                        && var27 >= -316755897 * WorldMapElement.field2221.highY - var104
                        && var27 <= WorldMapElement.field2221.highY * -316755897 + var104
                        && var28 >= var94 - 15
                        && var28 < var94) {
                        class558.openURL(EnumComposition.method4474("secure", true, -1276815042) + "m=weblogin/g=oldscape/cant_log_in", (short)3594);
                     }
                  }

                  while (var29.method6510((byte)13)) {
                     boolean var105 = false;

                     for (int var14 = 0; var14 < field398.length(); var14++) {
                        if (var29.field3385 == field398.charAt(var14)) {
                           var105 = true;
                           break;
                        }
                     }

                     if (2044709447 * var29.field3386 == 13) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-28945);
                     } else {
                        if (85 == var29.field3386 * 2044709447 && !Login_username.isEmpty()) {
                           Login_username = Login_username.substring(0, Login_username.length() - 1);
                        }

                        if (84 == 2044709447 * var29.field3386) {
                           class299.performLoginRequest(1627910901);
                           return;
                        }

                        if (var105 && Login_username.length() < 320) {
                           Login_username = Login_username + var29.field3385;
                        }
                     }
                  }
               } else if (6 != -1614560929 * loginIndex) {
                  if (7 == loginIndex * -1614560929) {
                     if (Frames.field3189 && !client.onMobile) {
                        int var39 = -1998333989 * CollisionMap.loginBoxCenter - 150;
                        int var68 = var39 + 240 + 25 + 40;
                        short var95 = 231;
                        int var106 = var95 + 40;
                        if (1 == var26 && var27 >= var39 && var27 <= var68 && var28 >= var95 && var28 <= var106) {
                           field386 = classRE.method9417(var39, var27, (byte)62) * 262832811;
                        }

                        int var110 = 180 + 743318851 * loginBoxX - 80;
                        short var15 = 321;
                        if (1 == var26 && var27 >= var110 - 75 && var27 <= 75 + var110 && var28 >= var15 - 20 && var28 <= 20 + var15) {
                           boolean var16;
                           label912: {
                              Date var17;
                              try {
                                 var17 = class356.method7762(2115243885);
                              } catch (ParseException var22) {
                                 WorldMapEvent.method7541(
                                    "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -761990605
                                 );
                                 var16 = false;
                                 break label912;
                              }

                              if (var17 == null) {
                                 var16 = false;
                              } else {
                                 Calendar var19 = Calendar.getInstance();
                                 var19.set(1, var19.get(1) - 13);
                                 var19.set(5, var19.get(5) + 1);
                                 var19.set(11, 0);
                                 var19.set(12, 0);
                                 var19.set(13, 0);
                                 var19.set(14, 0);
                                 Date var20 = var19.getTime();
                                 boolean var18 = var17.before(var20);
                                 boolean var124 = class4.method74(var17, 357016694);
                                 if (!var124) {
                                    WorldMapEvent.method7541(
                                       "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 963227519
                                    );
                                    var16 = false;
                                 } else {
                                    if (!var18) {
                                       class67.field1275 = -325447997;
                                    } else {
                                       class67.field1275 = (int)(var17.getTime() / 86400000L - 11745L) * -1310330563;
                                    }

                                    var16 = true;
                                 }
                              }
                           }

                           if (var16) {
                              WorldMapSectionType.updateGameState(50, (byte)45);
                              return;
                           }
                        }

                        var110 = 80 + 180 + loginBoxX * 743318851;
                        if (1 == var26 && var27 >= var110 - 75 && var27 <= 75 + var110 && var28 >= var15 - 20 && var28 <= 20 + var15) {
                           field387 = new String[8];
                           SpotAnimationDefinition.Login_promptCredentials(true, (short)655);
                        }

                        while (var29.method6510((byte)-123)) {
                           if (101 == 2044709447 * var29.field3386) {
                              field387[465659907 * field386] = null;
                           }

                           if (85 == 2044709447 * var29.field3386) {
                              if (field387[465659907 * field386] == null && field386 * 465659907 > 0) {
                                 field386 -= 262832811;
                              }

                              field387[465659907 * field386] = null;
                           }

                           if (var29.field3385 >= '0' && var29.field3385 <= '9') {
                              field387[465659907 * field386] = "" + var29.field3385;
                              if (field386 * 465659907 < 7) {
                                 field386 += 262832811;
                              }
                           }

                           if (2044709447 * var29.field3386 == 84) {
                              boolean var117;
                              label832: {
                                 Date var119;
                                 try {
                                    var119 = class356.method7762(2119541788);
                                 } catch (ParseException var21) {
                                    WorldMapEvent.method7541(
                                       "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 932638556
                                    );
                                    var117 = false;
                                    break label832;
                                 }

                                 if (null == var119) {
                                    var117 = false;
                                 } else {
                                    Calendar var123 = Calendar.getInstance();
                                    var123.set(1, var123.get(1) - 13);
                                    var123.set(5, var123.get(5) + 1);
                                    var123.set(11, 0);
                                    var123.set(12, 0);
                                    var123.set(13, 0);
                                    var123.set(14, 0);
                                    Date var125 = var123.getTime();
                                    boolean var121 = var119.before(var125);
                                    boolean var126 = class4.method74(var119, -61765750);
                                    if (!var126) {
                                       WorldMapEvent.method7541(
                                          "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 1686277891
                                       );
                                       var117 = false;
                                    } else {
                                       if (!var121) {
                                          class67.field1275 = -325447997;
                                       } else {
                                          class67.field1275 = (int)(var119.getTime() / 86400000L - 11745L) * -1310330563;
                                       }

                                       var117 = true;
                                    }
                                 }
                              }

                              if (var117) {
                                 WorldMapSectionType.updateGameState(50, (byte)45);
                              }

                              return;
                           }
                        }
                     } else {
                        int var37 = 743318851 * loginBoxX + 180 - 80;
                        short var67 = 321;
                        if (1 == var26 && var27 >= var37 - 75 && var27 <= 75 + var37 && var28 >= var67 - 20 && var28 <= var67 + 20) {
                           class558.openURL(EnumComposition.method4474("secure", true, -1565779433) + "m=dob/set_dob.ws", (short)16160);
                           class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                           class30.method1308(6, 2072150276);
                           return;
                        }

                        var37 = 80 + 180 + 743318851 * loginBoxX;
                        if (var26 == 1 && var27 >= var37 - 75 && var27 <= var37 + 75 && var28 >= var67 - 20 && var28 <= 20 + var67) {
                           SpotAnimationDefinition.Login_promptCredentials(true, (short)-2428);
                        }
                     }
                  } else if (8 == loginIndex * -1614560929) {
                     int var40 = 743318851 * loginBoxX + 180 - 80;
                     short var69 = 321;
                     if (var26 == 1 && var27 >= var40 - 75 && var27 <= 75 + var40 && var28 >= var69 - 20 && var28 <= 20 + var69) {
                        class558.openURL("https://www.jagex.com/terms/privacy", (short)10138);
                        class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                        class30.method1308(6, -11504739);
                        return;
                     }

                     var40 = 80 + 743318851 * loginBoxX + 180;
                     if (1 == var26 && var27 >= var40 - 75 && var27 <= 75 + var40 && var28 >= var69 - 20 && var28 <= var69 + 20) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-27634);
                     }
                  } else if (-1614560929 * loginIndex == 9) {
                     int var42 = 180 + 743318851 * loginBoxX;
                     short var70 = 311;
                     if (84 == 2044709447 * var29.field3386
                        || var29.field3386 * 2044709447 == 13
                        || 1 == var26 && var27 >= var42 - 75 && var27 <= var42 + 75 && var28 >= var70 - 20 && var28 <= 20 + var70) {
                        class586.updateLoginStatusUsernameRemembered(false, -56656432);
                     }
                  } else if (10 == loginIndex * -1614560929) {
                     int var43 = loginBoxX * 743318851 + 180;
                     short var71 = 209;
                     if (var29.field3386 * 2044709447 == 84
                        || var26 == 1 && var27 >= var43 - 109 && var27 <= 109 + var43 && var28 >= var71 && var28 <= var71 + 68) {
                        if (class57.method1370(25615778)) {
                           return;
                        }

                        class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
                        client.field889 = class604.field6589;
                        classFR.method4050(false, 2061861115);
                        WorldMapSectionType.updateGameState(20, (byte)45);
                     }
                  } else if (-1614560929 * loginIndex == 12) {
                     int var44 = CollisionMap.loginBoxCenter * -1998333989;
                     int var72 = 233;
                     Bounds var96 = var2.method10401(0, 30, Strings.field4996, var44, var72);
                     Bounds var107 = var2.method10401(32, 32, Strings.field4996, var44, var72);
                     Bounds var112 = var2.method10401(70, 34, Strings.field4996, var44, var72);
                     var72 += 17;
                     Bounds var115 = var2.method10401(0, 34, Strings.field4865, var44, var72);
                     if (var26 == 1) {
                        if (var96.method9506(var27, var28, 597377221)) {
                           class558.openURL("https://www.jagex.com/terms", (short)14198);
                        } else if (var107.method9506(var27, var28, 687481449)) {
                           class558.openURL("https://www.jagex.com/terms/privacy", (short)-1015);
                        } else if (var112.method9506(var27, var28, 1929669180) || var115.method9506(var27, var28, 1309222949)) {
                           class558.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", (short)16234);
                        }
                     }

                     var44 = CollisionMap.loginBoxCenter * -1998333989 - 80;
                     short var74 = 311;
                     if (1 == var26 && var27 >= var44 - 75 && var27 <= var44 + 75 && var28 >= var74 - 20 && var28 <= var74 + 20) {
                        WorldMapAreaData.method7358(-156518500);
                        class586.updateLoginStatusUsernameRemembered(true, 206626111);
                     }

                     var44 = 80 + CollisionMap.loginBoxCenter * -1998333989;
                     if (var26 == 1 && var27 >= var44 - 75 && var27 <= var44 + 75 && var28 >= var74 - 20 && var28 <= 20 + var74) {
                        loginIndex = -464840173;
                     }
                  } else if (loginIndex * -1614560929 == 13) {
                     int var47 = -1998333989 * CollisionMap.loginBoxCenter;
                     short var75 = 321;
                     if (var26 == 1 && var27 >= var47 - 75 && var27 <= var47 + 75 && var28 >= var75 - 20 && var28 <= 20 + var75) {
                        class586.updateLoginStatusUsernameRemembered(true, -1284221734);
                     }
                  } else if (loginIndex * -1614560929 == 14) {
                     String var48 = "";
                     switch (-1858173113 * Login_banType) {
                        case 0:
                           var48 = "https://secure.runescape.com/m=offence-appeal/account-history";
                           break;
                        case 1:
                           var48 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                           break;
                        case 2:
                           var48 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                           break;
                        default:
                           SpotAnimationDefinition.Login_promptCredentials(false, (short)-24314);
                     }

                     int var76 = 180 + 743318851 * loginBoxX;
                     short var97 = 276;
                     if (var26 == 1 && var27 >= var76 - 75 && var27 <= 75 + var76 && var28 >= var97 - 20 && var28 <= 20 + var97) {
                        class558.openURL(var48, (short)-25599);
                        class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                        class30.method1308(6, -1123045749);
                        return;
                     }

                     var76 = 180 + loginBoxX * 743318851;
                     var97 = 326;
                     if (var26 == 1 && var27 >= var76 - 75 && var27 <= var76 + 75 && var28 >= var97 - 20 && var28 <= 20 + var97) {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)-30132);
                     }
                  } else if (24 == -1614560929 * loginIndex) {
                     int var49 = 180 + 743318851 * loginBoxX;
                     short var78 = 301;
                     if (1 == var26 && var27 >= var49 - 75 && var27 <= 75 + var49 && var28 >= var78 - 20 && var28 <= 20 + var78) {
                        class586.updateLoginStatusUsernameRemembered(false, -1715075358);
                     }
                  } else if (loginIndex * -1614560929 == 32) {
                     int var50 = 180 + 743318851 * loginBoxX - 80;
                     short var79 = 321;
                     if (var26 == 1 && var27 >= var50 - 75 && var27 <= var50 + 75 && var28 >= var79 - 20 && var28 <= 20 + var79) {
                        class558.openURL(EnumComposition.method4474("secure", true, -2112068890) + "m=dob/set_dob.ws", (short)-8357);
                        class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                        class30.method1308(6, -289839818);
                        return;
                     }

                     var50 = 180 + loginBoxX * 743318851 + 80;
                     if (var26 == 1 && var27 >= var50 - 75 && var27 <= var50 + 75 && var28 >= var79 - 20 && var28 <= var79 + 20) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-22722);
                     }
                  } else if (33 == -1614560929 * loginIndex) {
                     int var52 = 743318851 * loginBoxX + 180;
                     short var80 = 276;
                     if (var26 == 1 && var27 >= var52 - 75 && var27 <= 75 + var52 && var28 >= var80 - 20 && var28 <= var80 + 20) {
                        class558.openURL(Strings.field5166, (short)-28787);
                     }

                     var52 = 180 + 743318851 * loginBoxX;
                     var80 = 326;
                     if (var26 == 1 && var27 >= var52 - 75 && var27 <= var52 + 75 && var28 >= var80 - 20 && var28 <= var80 + 20) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-1650);
                     }
                  } else if (34 == -1614560929 * loginIndex) {
                     int var54 = 743318851 * loginBoxX + 180;
                     short var82 = 276;
                     if (var26 == 1 && var27 >= var54 - 75 && var27 <= 75 + var54 && var28 >= var82 - 20 && var28 <= var82 + 20) {
                        classGP.method4261((short)24018);
                        return;
                     }

                     if (null != Huffman.World_request) {
                        classGP.method4261((short)30754);
                     }

                     var54 = 180 + 743318851 * loginBoxX;
                     var82 = 326;
                     if (1 == var26 && var27 >= var54 - 75 && var27 <= 75 + var54 && var28 >= var82 - 20 && var28 <= var82 + 20) {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)1760);
                     }
                  }
               } else {
                  while (var29.method6510((byte)3)) {
                     if (84 == 2044709447 * var29.field3386 || 13 == var29.field3386 * 2044709447) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-18401);
                     }
                  }

                  short var36 = 321;
                  if (var26 == 1 && var28 >= var36 - 20 && var28 <= 20 + var36) {
                     SpotAnimationDefinition.Login_promptCredentials(true, (short)-25128);
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;Lsu;Lsu;)V")
   @ObfuscatedName("bd")
   static void method1227(GameEngine var0, Font var1, Font var2) {
      if (worldSelectOpen) {
         class180.method4264(var0, -1786376759);
      } else {
         if ((1 == MouseHandler.MouseHandler_lastButton * -1164553935 || !UrlRequest.mouseCam && 1721626731 * MouseHandler.MouseHandler_lastButton == 4)
            && MouseHandler.MouseHandler_lastPressedX * -1018773713 >= 1574959521 + -1689854622 * xPadding - 50
            && 1643808974 * MouseHandler.MouseHandler_lastPressedY >= 453
            && MouseHandler.MouseHandler_lastPressedX * -2084917081 < 765 + xPadding * 921778921
            && -261967643 * MouseHandler.MouseHandler_lastPressedY < 503) {
            class468.clientPreferences.updateTitleMusicDisabled(!class468.clientPreferences.isTitleMusicDisabled(1607938041), 473904834);
            if (class468.clientPreferences.isTitleMusicDisabled(-1538203708)) {
               classGK.method4244(0, 0, 1891029006);
            } else {
               class148.method4143("scape main", -103218474, -483080791);
            }

            class179.method4237(-1931393605);
         }

         if (1271535343 * client.gameState != 5) {
            if (4427354477760720883L * field389 == -1L) {
               field389 = (ParamComposition.method4949((byte)15) + 1000L) * 4776144791020339515L;
            }

            long var3 = ParamComposition.method4949((byte)15);
            boolean var5;
            if (null != client.archiveLoaders && client.archiveLoadersDone * -251416631 < client.archiveLoaders.size()) {
               while (true) {
                  if (client.archiveLoadersDone * 1511418211 >= client.archiveLoaders.size()) {
                     var5 = true;
                     break;
                  }

                  ArchiveLoader var6 = (ArchiveLoader)client.archiveLoaders.get(client.archiveLoadersDone * 1994399354);
                  if (!ArchiveLoader.method2858(var6, (byte)25)) {
                     var5 = false;
                     break;
                  }

                  client.archiveLoadersDone += -233756868;
               }
            } else {
               var5 = true;
            }

            if (var5 && -1L == 9079282278280122649L * field390) {
               field390 = 1917473899848792873L * var3;
               if (field390 * 9079282278280122649L > 4427354477760720883L * field389) {
                  field389 = field390 * 4881547957185595843L;
               }
            }

            if (client.gameState * 1271535343 == 10 || 11 == client.gameState * 1271535343) {
               if (Language.Language_EN == class352.clientLanguage) {
                  if (1 == MouseHandler.MouseHandler_lastButton * 1721626731 || !UrlRequest.mouseCam && 4 == MouseHandler.MouseHandler_lastButton * 1721626731) {
                     int var25 = xPadding * 921778921 + 5;
                     short var7 = 463;
                     int var8 = -620092508;
                     int var9 = 565759234;
                     if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var25
                        && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= var8 + var25
                        && MouseHandler.MouseHandler_lastPressedY * -261967643 >= var7
                        && MouseHandler.MouseHandler_lastPressedY * -261967643 <= var7 + var9) {
                        classGP.method4261((short)1227);
                        return;
                     }
                  }

                  if (null != Huffman.World_request) {
                     classGP.method4261((short)22284);
                  }
               }

               int var26 = 1721626731 * MouseHandler.MouseHandler_lastButton;
               int var27 = 1285106211 * MouseHandler.MouseHandler_lastPressedX;
               int var28 = MouseHandler.MouseHandler_lastPressedY * 505862876;
               if (0 == var26) {
                  var27 = -935652134 * MouseHandler.MouseHandler_x;
                  var28 = -1427762751 * MouseHandler.MouseHandler_y;
               }

               if (!UrlRequest.mouseCam && var26 == 4) {
                  var26 = 1;
               }

               IndexCheck var29 = HttpRequest.method280((byte)1);
               if (0 == 1989449695 * loginIndex) {
                  boolean var62 = false;

                  while (var29.method6510((byte)-125)) {
                     if (-1536791115 * var29.field3386 == -1467913816) {
                        var62 = true;
                     }
                  }

                  int var91 = 840820909 * CollisionMap.loginBoxCenter - 80;
                  int var103 = -359097948;
                  if (1 == var26 && var27 >= var91 - 75 && var27 <= var91 + -2094898747 && var28 >= var103 - 20 && var28 <= 20 + var103) {
                     class558.openURL(
                        EnumComposition.method4474("secure", true, -1177612991) + "m=account-creation/g=oldscape/create_account_funnel.ws", (short)-14491
                     );
                  }

                  var91 = -1373026687 * CollisionMap.loginBoxCenter + 80;
                  if (1 == var26 && var27 >= var91 - 960336567 && var27 <= 257058951 + var91 && var28 >= var103 - 20 && var28 <= var103 + 20 || var62) {
                     if (class57.method1370(-1598661962)) {
                        WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
                     } else {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)3087);
                     }
                  }
               } else if (191858286 * loginIndex == 1) {
                  boolean var61 = SecureUrlRequester.client.containsAccessAndRefreshToken(-1302655098)
                     || SecureUrlRequester.client.otlTokenRequesterInitialized((byte)-8)
                     || SecureUrlRequester.client.containsSessionAndCharacterId(1953304121);

                  while (var29.method6510((byte)-125)) {
                     if (-8771032 == var29.field3386 * 2044709447) {
                        if (var61) {
                           class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
                           client.field889 = class604.field6589;
                           classFR.method4050(false, -2066660568);
                           WorldMapSectionType.updateGameState(20, (byte)45);
                        } else {
                           SpotAnimationDefinition.Login_promptCredentials(false, (short)4045);
                        }

                        return;
                     }

                     if (13 == var29.field3386 * 2044709447) {
                        class586.updateLoginStatusUsernameRemembered(true, -657996599);
                        return;
                     }
                  }

                  int var89 = -1998333989 * CollisionMap.loginBoxCenter - -1491318934;
                  short var102 = 321;
                  if (var26 == 1 && var27 >= var89 - 75 && var27 <= 75 + var89 && var28 >= var102 - 20 && var28 <= var102 + 20) {
                     if (var61) {
                        class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
                        client.field889 = class604.field6589;
                        classFR.method4050(false, 1917107380);
                        WorldMapSectionType.updateGameState(20, (byte)45);
                     } else {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)-23534);
                     }

                     return;
                  }

                  var89 = -1623124209 + CollisionMap.loginBoxCenter * -1998333989;
                  if (1 == var26 && var27 >= var89 - 75 && var27 <= var89 + 75 && var28 >= var102 - 20 && var28 <= 20 + var102) {
                     class586.updateLoginStatusUsernameRemembered(true, -437280729);
                     return;
                  }
               } else if (loginIndex * 1195831652 == 2) {
                  int var56 = -692018528;
                  var56 += 52;
                  if (var26 == 1 && var28 >= var56 - 12 && var28 < 2 + var56) {
                     currentLoginField = 0;
                  }

                  var56 += 15;
                  if (1 == var26 && var28 >= var56 - 12 && var28 < var56 + 2) {
                     currentLoginField = 503050582;
                  }

                  var56 += 15;
                  var56 = -1003474606;
                  if (class181.field2057 != null) {
                     int var84 = class181.field2057.lowX * -434199641 / 2;
                     if (var26 == 1
                        && var27 >= -184390383 * class181.field2057.highY - var84
                        && var27 <= var84 + class181.field2057.highY * -1371138808
                        && var28 >= var56 - 15
                        && var28 < var56) {
                        switch (field399 * 1340994199) {
                           case 1:
                              class558.openURL(Strings.field4980, (short)16943);
                              return;
                           case 2:
                              class558.openURL("https://support.runescape.com/hc/en-gb", (short)21463);
                        }
                     }
                  }

                  int var85 = CollisionMap.loginBoxCenter * -1998333989 - 80;
                  int var99 = 321;
                  if (var26 == 1 && var27 >= var85 - 1704098657 && var27 <= 75 + var85 && var28 >= var99 - 20 && var28 <= var99 + 20) {
                     classPC.method8714(68734741);
                     return;
                  }

                  var85 = 743318851 * loginBoxX + -313249390 + 80;
                  if (1 == var26 && var27 >= var85 - 75 && var27 <= var85 + -884108131 && var28 >= var99 - 20 && var28 <= 20 + var99) {
                     class30.method1308(0, -1587115422);
                     Login_username = "";
                     Login_password = "";
                     class28.otpMedium = 0;
                     UserComparator6.otp = "";
                     rememberUsername = true;
                  }

                  var85 = -1998333989 * CollisionMap.loginBoxCenter + -117;
                  var99 = -2050026256;
                  field377 = var27 >= var85
                     && var27 < class164.field1972 * -1436734183 + var85
                     && var28 >= var99
                     && var28 < var99 + -643302652 * TaskHandler.field2444;
                  if (1 == var26 && field377) {
                     client.Login_isUsernameRemembered = !client.Login_isUsernameRemembered;
                     if (!client.Login_isUsernameRemembered && class468.clientPreferences.getRememberedUsername(1406454795) != null) {
                        class468.clientPreferences.updateRememberedUsername(null, (byte)1);
                     }
                  }

                  var85 = 990171383 * CollisionMap.loginBoxCenter + 24;
                  short var101 = 277;
                  field392 = var27 >= var85
                     && var27 < var85 + 1308164080 * class164.field1972
                     && var28 >= var101
                     && var28 < 222768869 * TaskHandler.field2444 + var101;
                  if (var26 == 1 && field392) {
                     ClientPreferences.method1569(
                        class468.clientPreferences, !ClientPreferences.method1560(class468.clientPreferences, -2000253894), 1426164556
                     );
                     if (!ClientPreferences.method1560(class468.clientPreferences, -988465714)) {
                        Login_username = "";
                        class468.clientPreferences.updateRememberedUsername(null, (byte)1);
                        WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
                     }
                  }

                  while (var29.method6510((byte)-124)) {
                     if (13 == -1503810977 * var29.field3386) {
                        class30.method1308(0, -2105741432);
                        Login_username = "";
                        Login_password = "";
                        class28.otpMedium = 0;
                        UserComparator6.otp = "";
                        rememberUsername = true;
                     } else if (currentLoginField * 244972893 == 0) {
                        char var108 = var29.field3385;
                        int var113 = 0;

                        while (var113 < field398.length() && var108 != field398.charAt(var113)) {
                           var113++;
                        }

                        if (-781982555 == var29.field3386 * 1996076116 && !Login_username.isEmpty()) {
                           Login_username = Login_username.substring(0, Login_username.length() - 1);
                        }

                        if (84 == -336579122 * var29.field3386 || var29.field3386 * 1218674735 == 80) {
                           currentLoginField = 1847922509;
                        }

                        if (class145.method4148(var29.field3385, (byte)-38) && Login_username.length() < 320) {
                           Login_username = Login_username + var29.field3385;
                        }
                     } else if (currentLoginField * 244972893 == 1) {
                        if (2044709447 * var29.field3386 == 85 && !Login_password.isEmpty()) {
                           Login_password = Login_password.substring(0, Login_password.length() - 1);
                        } else if (-1235810180 == 2044709447 * var29.field3386 || 80 == var29.field3386 * 2044709447) {
                           currentLoginField = 0;
                           if (-1339649870 * var29.field3386 == 84) {
                              classPC.method8714(-1054899075);
                              return;
                           }
                        }

                        if ((IndexCheck.method6514(var29, -455836351, (short)1337) || IndexCheck.method6514(var29, 87, (short)1337))
                           && -1754743480 == var29.field3386 * 2044709447) {
                           Clipboard var109 = Toolkit.getDefaultToolkit().getSystemClipboard();
                           Transferable var114 = var109.getContents(SecureUrlRequester.client);
                           int var116 = 20 - Login_password.length();
                           if (var116 > 0) {
                              try {
                                 String var118 = (String)var114.getTransferData(DataFlavor.stringFlavor);
                                 int var120 = Math.min(var116, var118.length());

                                 for (int var122 = 0; var122 < var120; var122++) {
                                    if (!AbstractWorldMapData.method7256(var118.charAt(var122), -580673349)
                                       || !class145.method4148(var118.charAt(var122), (byte)-8)) {
                                       class30.method1308(3, 974852632);
                                       return;
                                    }
                                 }

                                 Login_password = Login_password + var118.substring(0, var120);
                              } catch (UnsupportedFlavorException var23) {
                              } catch (IOException var24) {
                              }
                           }
                        } else if (AbstractWorldMapData.method7256(var29.field3385, -580673349)
                           && class145.method4148(var29.field3385, (byte)-99)
                           && Login_password.length() < 20) {
                           Login_password = Login_password + var29.field3385;
                        }
                     }
                  }
               } else if (loginIndex * -1614560929 == 3) {
                  int var10 = 101141414 * loginBoxX + 2004206181;
                  int var11 = 1241599766;
                  Bounds var12 = var1.method10401(25, Strings.field4906.length() - 34, Strings.field4906, var10, var11);
                  if (var26 == 1 && var12.method9506(var27, var28, 1115092480)) {
                     class558.openURL(Strings.field5166, (short)-21382);
                  }

                  var10 = -1653520224 + loginBoxX * -778856671;
                  short var63 = 276;
                  if (1 == var26 && var27 >= var10 - 75 && var27 <= var10 + 1104258062 && var28 >= var63 - 20 && var28 <= var63 + 20) {
                     class586.updateLoginStatusUsernameRemembered(false, -1066737038);
                  }

                  var10 = 180 + 743318851 * loginBoxX;
                  var63 = 326;
                  if (var26 == 1 && var27 >= var10 - 75 && var27 <= -1252473361 + var10 && var28 >= var63 - 20 && var28 <= var63 + 20) {
                     class558.openURL(Strings.field4980, (short)-2679);
                     return;
                  }
               } else if (4 == loginIndex * 618443967) {
                  int var32 = 1918421562 + loginBoxX * -67025594 - -1329848806;
                  short var65 = 321;
                  if (1 == var26 && var27 >= var32 - 2008922004 && var27 <= var32 + 782227998 && var28 >= var65 - 20 && var28 <= var65 + 20) {
                     FriendSystem.method471(1148244162);
                     return;
                  }

                  if (var26 == 1
                     && var27 >= loginBoxX * 440322054 + 180 - 9
                     && var27 <= -1509755253 + loginBoxX * 743318851 + 180
                     && var28 >= 263
                     && var28 <= 296) {
                     rememberUsername = !rememberUsername;
                  }

                  if (var26 == 1
                     && var27 >= 314818834 + loginBoxX * 1268562717 - 34
                     && var27 <= 180 + 1546327321 * loginBoxX + 34
                     && var28 >= -1528743541
                     && var28 <= 1298852558) {
                     class558.openURL(Strings.field4980, (short)4710);
                  }

                  var32 = 80 + 180 + loginBoxX * -1210484185;
                  if (1 == var26 && var27 >= var32 - -951681627 && var27 <= 75 + var32 && var28 >= var65 - 20 && var28 <= 20 + var65) {
                     class30.method1308(0, 1719893153);
                     Login_username = "";
                     Login_password = "";
                     class28.otpMedium = 0;
                     UserComparator6.otp = "";
                  }

                  while (var29.method6510((byte)-35)) {
                     boolean var93 = false;

                     for (int var13 = 0; var13 < field396.length(); var13++) {
                        if (var29.field3385 == field396.charAt(var13)) {
                           var93 = true;
                           break;
                        }
                     }

                     if (var29.field3386 * 2044709447 == 13) {
                        class30.method1308(0, -1482465518);
                        Login_username = "";
                        Login_password = "";
                        class28.otpMedium = 0;
                        UserComparator6.otp = "";
                     } else {
                        if (2044709447 * var29.field3386 == 2038185259 && !UserComparator6.otp.isEmpty()) {
                           UserComparator6.otp = UserComparator6.otp.substring(0, UserComparator6.otp.length() - 1);
                        }

                        if (var29.field3386 * 664707952 == 84) {
                           FriendSystem.method471(1897029749);
                           return;
                        }

                        if (var93 && UserComparator6.otp.length() < 6) {
                           UserComparator6.otp = UserComparator6.otp + var29.field3385;
                        }
                     }
                  }
               } else if (5 == loginIndex * -1990496685) {
                  int var34 = 180 + loginBoxX * 138185470 - 2040893135;
                  short var66 = 321;
                  if (var26 == 1 && var27 >= var34 - -1820490720 && var27 <= var34 + 1932965948 && var28 >= var66 - 20 && var28 <= var66 + 20) {
                     class299.performLoginRequest(-630037799);
                     return;
                  }

                  var34 = 180 + 743318851 * loginBoxX + 80;
                  if (var26 == 1 && var27 >= var34 - 75 && var27 <= 75 + var34 && var28 >= var66 - 20 && var28 <= var66 + 20) {
                     SpotAnimationDefinition.Login_promptCredentials(true, (short)-25743);
                  }

                  short var94 = 361;
                  if (WorldMapElement.field2221 != null) {
                     int var104 = -434199641 * WorldMapElement.field2221.lowX / 2;
                     if (1 == var26
                        && var27 >= 435405098 * WorldMapElement.field2221.highY - var104
                        && var27 <= WorldMapElement.field2221.highY * -939505268 + var104
                        && var28 >= var94 - 15
                        && var28 < var94) {
                        class558.openURL(EnumComposition.method4474("secure", true, 1186064398) + "m=weblogin/g=oldscape/cant_log_in", (short)-672);
                     }
                  }

                  while (var29.method6510((byte)-107)) {
                     boolean var105 = false;

                     for (int var14 = 0; var14 < field398.length(); var14++) {
                        if (var29.field3385 == field398.charAt(var14)) {
                           var105 = true;
                           break;
                        }
                     }

                     if (-446506025 * var29.field3386 == 13) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-24821);
                     } else {
                        if (1227972429 == var29.field3386 * 2044709447 && !Login_username.isEmpty()) {
                           Login_username = Login_username.substring(0, Login_username.length() - 1);
                        }

                        if (84 == 1209111222 * var29.field3386) {
                           class299.performLoginRequest(-523841224);
                           return;
                        }

                        if (var105 && Login_username.length() < 320) {
                           Login_username = Login_username + var29.field3385;
                        }
                     }
                  }
               } else if (6 != -1614560929 * loginIndex) {
                  if (7 == loginIndex * -1614560929) {
                     if (Frames.field3189 && !client.onMobile) {
                        int var39 = -1998333989 * CollisionMap.loginBoxCenter - 150;
                        int var68 = var39 + 240 + 25 + -1443096506;
                        int var95 = 808081260;
                        int var106 = var95 + -225882614;
                        if (1 == var26 && var27 >= var39 && var27 <= var68 && var28 >= var95 && var28 <= var106) {
                           field386 = classRE.method9417(var39, var27, (byte)104) * 262832811;
                        }

                        int var110 = -474584324 + -1056116156 * loginBoxX - 80;
                        int var15 = -846241526;
                        if (1 == var26 && var27 >= var110 - -1796699142 && var27 <= 75 + var110 && var28 >= var15 - 20 && var28 <= 20 + var15) {
                           boolean var16;
                           label912: {
                              Date var17;
                              try {
                                 var17 = class356.method7762(2065565374);
                              } catch (ParseException var22) {
                                 WorldMapEvent.method7541(
                                    "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 685960307
                                 );
                                 var16 = false;
                                 break label912;
                              }

                              if (var17 == null) {
                                 var16 = false;
                              } else {
                                 Calendar var19 = Calendar.getInstance();
                                 var19.set(1, var19.get(1) - 13);
                                 var19.set(5, var19.get(5) + 1);
                                 var19.set(11, 0);
                                 var19.set(12, 0);
                                 var19.set(13, 0);
                                 var19.set(14, 0);
                                 Date var20 = var19.getTime();
                                 boolean var18 = var17.before(var20);
                                 boolean var124 = class4.method74(var17, -929552299);
                                 if (!var124) {
                                    WorldMapEvent.method7541(
                                       "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 1678256263
                                    );
                                    var16 = false;
                                 } else {
                                    if (!var18) {
                                       class67.field1275 = -325447997;
                                    } else {
                                       class67.field1275 = (int)(var17.getTime() / 86400000L - 11745L) * -1310330563;
                                    }

                                    var16 = true;
                                 }
                              }
                           }

                           if (var16) {
                              WorldMapSectionType.updateGameState(50, (byte)45);
                              return;
                           }
                        }

                        var110 = 80 + 1036503051 + loginBoxX * 743318851;
                        if (1 == var26 && var27 >= var110 - 833018083 && var27 <= -107118111 + var110 && var28 >= var15 - 20 && var28 <= 20 + var15) {
                           field387 = new String[8];
                           SpotAnimationDefinition.Login_promptCredentials(true, (short)-22909);
                        }

                        while (var29.method6510((byte)-36)) {
                           if (101 == -1307189818 * var29.field3386) {
                              field387[465659907 * field386] = null;
                           }

                           if (85 == 991908322 * var29.field3386) {
                              if (field387[465659907 * field386] == null && field386 * 465659907 > 0) {
                                 field386 -= 262832811;
                              }

                              field387[2012254141 * field386] = null;
                           }

                           if (var29.field3385 >= '0' && var29.field3385 <= '9') {
                              field387[465659907 * field386] = "" + var29.field3385;
                              if (field386 * -1627275720 < 7) {
                                 field386 += -529217256;
                              }
                           }

                           if (1225283223 * var29.field3386 == 84) {
                              boolean var117;
                              label832: {
                                 Date var119;
                                 try {
                                    var119 = class356.method7762(2066950042);
                                 } catch (ParseException var21) {
                                    WorldMapEvent.method7541(
                                       "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 1161734587
                                    );
                                    var117 = false;
                                    break label832;
                                 }

                                 if (null == var119) {
                                    var117 = false;
                                 } else {
                                    Calendar var123 = Calendar.getInstance();
                                    var123.set(1, var123.get(1) - 13);
                                    var123.set(5, var123.get(5) + 1);
                                    var123.set(11, 0);
                                    var123.set(12, 0);
                                    var123.set(13, 0);
                                    var123.set(14, 0);
                                    Date var125 = var123.getTime();
                                    boolean var121 = var119.before(var125);
                                    boolean var126 = class4.method74(var119, -907345290);
                                    if (!var126) {
                                       WorldMapEvent.method7541(
                                          "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 1785626265
                                       );
                                       var117 = false;
                                    } else {
                                       if (!var121) {
                                          class67.field1275 = -325447997;
                                       } else {
                                          class67.field1275 = (int)(var119.getTime() / 86400000L - 11745L) * 16585288;
                                       }

                                       var117 = true;
                                    }
                                 }
                              }

                              if (var117) {
                                 WorldMapSectionType.updateGameState(-262125875, (byte)45);
                              }

                              return;
                           }
                        }
                     } else {
                        int var37 = 743318851 * loginBoxX + 180 - 80;
                        int var67 = -1660863749;
                        if (1 == var26 && var27 >= var37 - -88363619 && var27 <= 75 + var37 && var28 >= var67 - 20 && var28 <= var67 + 20) {
                           class558.openURL(EnumComposition.method4474("secure", true, -749830646) + "m=dob/set_dob.ws", (short)-440);
                           class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                           class30.method1308(6, 225019444);
                           return;
                        }

                        var37 = -1454072252 + 180 + 956105189 * loginBoxX;
                        if (var26 == 1 && var27 >= var37 - 75 && var27 <= var37 + 75 && var28 >= var67 - 20 && var28 <= 20 + var67) {
                           SpotAnimationDefinition.Login_promptCredentials(true, (short)-22250);
                        }
                     }
                  } else if (8 == loginIndex * 1688539916) {
                     int var40 = -229806302 * loginBoxX + -1266517741 - 1550085690;
                     short var69 = 321;
                     if (var26 == 1 && var27 >= var40 - -347989686 && var27 <= 1118425576 + var40 && var28 >= var69 - 20 && var28 <= 20 + var69) {
                        class558.openURL("https://www.jagex.com/terms/privacy", (short)-7047);
                        class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                        class30.method1308(6, 1959552871);
                        return;
                     }

                     var40 = 80 + -1643483422 * loginBoxX + 180;
                     if (1 == var26 && var27 >= var40 - -954024648 && var27 <= 1359043580 + var40 && var28 >= var69 - 20 && var28 <= var69 + 20) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-2455);
                     }
                  } else if (305837740 * loginIndex == 9) {
                     int var42 = -1374350290 + -394339940 * loginBoxX;
                     int var70 = -1853049043;
                     if (84 == 2044709447 * var29.field3386
                        || var29.field3386 * -333407805 == 13
                        || 1 == var26 && var27 >= var42 - 1008479500 && var27 <= var42 + 709477218 && var28 >= var70 - 20 && var28 <= 20 + var70) {
                        class586.updateLoginStatusUsernameRemembered(false, -697610707);
                     }
                  } else if (10 == loginIndex * 987496402) {
                     int var43 = loginBoxX * 420698588 + 180;
                     int var71 = -882845561;
                     if (var29.field3386 * -1100934317 == 34624215
                        || var26 == 1 && var27 >= var43 - 109 && var27 <= 109 + var43 && var28 >= var71 && var28 <= var71 + 68) {
                        if (class57.method1370(444397740)) {
                           return;
                        }

                        class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
                        client.field889 = class604.field6589;
                        classFR.method4050(false, -806124318);
                        WorldMapSectionType.updateGameState(20, (byte)45);
                     }
                  } else if (87664650 * loginIndex == 12) {
                     int var44 = CollisionMap.loginBoxCenter * -766553370;
                     int var72 = 233;
                     Bounds var96 = var2.method10401(0, 30, Strings.field4996, var44, var72);
                     Bounds var107 = var2.method10401(32, -596163637, Strings.field4996, var44, var72);
                     Bounds var112 = var2.method10401(-1172539350, -958682222, Strings.field4996, var44, var72);
                     var72 += 17;
                     Bounds var115 = var2.method10401(0, -2085571256, Strings.field4865, var44, var72);
                     if (var26 == 1) {
                        if (var96.method9506(var27, var28, -48595227)) {
                           class558.openURL("https://www.jagex.com/terms", (short)731);
                        } else if (var107.method9506(var27, var28, 2068263963)) {
                           class558.openURL("https://www.jagex.com/terms/privacy", (short)-415);
                        } else if (var112.method9506(var27, var28, -479323231) || var115.method9506(var27, var28, 1282529102)) {
                           class558.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", (short)22753);
                        }
                     }

                     var44 = CollisionMap.loginBoxCenter * -1998333989 - 55966815;
                     var72 = -1749965035;
                     if (1 == var26 && var27 >= var44 - -861343448 && var27 <= var44 + 75 && var28 >= var72 - 20 && var28 <= var72 + 20) {
                        WorldMapAreaData.method7358(-1455335436);
                        class586.updateLoginStatusUsernameRemembered(true, -105204914);
                     }

                     var44 = 80 + CollisionMap.loginBoxCenter * -1649421079;
                     if (var26 == 1 && var27 >= var44 - -276424338 && var27 <= var44 + 75 && var28 >= var72 - 20 && var28 <= 20 + var72) {
                        loginIndex = -464840173;
                     }
                  } else if (loginIndex * -1614560929 == 13) {
                     int var47 = -1808165992 * CollisionMap.loginBoxCenter;
                     short var75 = 321;
                     if (var26 == 1 && var27 >= var47 - -897656050 && var27 <= var47 + -899823115 && var28 >= var75 - 20 && var28 <= 20 + var75) {
                        class586.updateLoginStatusUsernameRemembered(true, -406652198);
                     }
                  } else if (loginIndex * -1614560929 == 14) {
                     String var48 = "";
                     switch (-1858173113 * Login_banType) {
                        case 0:
                           var48 = "https://secure.runescape.com/m=offence-appeal/account-history";
                           break;
                        case 1:
                           var48 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                           break;
                        case 2:
                           var48 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                           break;
                        default:
                           SpotAnimationDefinition.Login_promptCredentials(false, (short)-9057);
                     }

                     int var76 = 180 + 743318851 * loginBoxX;
                     int var97 = 276;
                     if (var26 == 1 && var27 >= var76 - 75 && var27 <= 1754149638 + var76 && var28 >= var97 - 20 && var28 <= 20 + var97) {
                        class558.openURL(var48, (short)-13572);
                        class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                        class30.method1308(6, 1357564651);
                        return;
                     }

                     var76 = 592719426 + loginBoxX * 1141689458;
                     var97 = -92014819;
                     if (var26 == 1 && var27 >= var76 - -1534857403 && var27 <= var76 + 75 && var28 >= var97 - 20 && var28 <= 20 + var97) {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)-8203);
                     }
                  } else if (24 == -1614560929 * loginIndex) {
                     int var49 = 129711418 + 743318851 * loginBoxX;
                     short var78 = 301;
                     if (1 == var26 && var27 >= var49 - 387250192 && var27 <= -537390104 + var49 && var28 >= var78 - 20 && var28 <= 20 + var78) {
                        class586.updateLoginStatusUsernameRemembered(false, -1727208098);
                     }
                  } else if (loginIndex * -1614560929 == 32) {
                     int var50 = -1664500645 + 743318851 * loginBoxX - 80;
                     short var79 = 321;
                     if (var26 == 1 && var27 >= var50 - -1550279167 && var27 <= var50 + 1396595797 && var28 >= var79 - 20 && var28 <= 20 + var79) {
                        class558.openURL(EnumComposition.method4474("secure", true, -1354562953) + "m=dob/set_dob.ws", (short)-8069);
                        class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                        class30.method1308(6, -792200281);
                        return;
                     }

                     var50 = 1682988504 + loginBoxX * 1513194281 + 80;
                     if (var26 == 1 && var27 >= var50 - 75 && var27 <= var50 + 75 && var28 >= var79 - 20 && var28 <= var79 + 20) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-13066);
                     }
                  } else if (33 == -1614560929 * loginIndex) {
                     int var52 = -2015243756 * loginBoxX + 180;
                     int var80 = -1002642482;
                     if (var26 == 1 && var27 >= var52 - 75 && var27 <= -1149757251 + var52 && var28 >= var80 - 20 && var28 <= var80 + 20) {
                        class558.openURL(Strings.field5166, (short)-886);
                     }

                     var52 = 104889641 + 743318851 * loginBoxX;
                     short var81 = 326;
                     if (var26 == 1 && var27 >= var52 - 75 && var27 <= var52 + 75 && var28 >= var81 - 20 && var28 <= var81 + 20) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-24371);
                     }
                  } else if (1776053161 == 1870466077 * loginIndex) {
                     int var54 = 1342435090 * loginBoxX + 1158783915;
                     int var82 = 276;
                     if (var26 == 1 && var27 >= var54 - 75 && var27 <= 75 + var54 && var28 >= var82 - 20 && var28 <= var82 + 20) {
                        classGP.method4261((short)11050);
                        return;
                     }

                     if (null != Huffman.World_request) {
                        classGP.method4261((short)22075);
                     }

                     var54 = 180 + -1533190862 * loginBoxX;
                     var82 = 1717494315;
                     if (1 == var26 && var27 >= var54 - 75 && var27 <= 1000799479 + var54 && var28 >= var82 - 20 && var28 <= var82 + 20) {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)-11728);
                     }
                  }
               } else {
                  while (var29.method6510((byte)-127)) {
                     if (84 == 49645734 * var29.field3386 || 13 == var29.field3386 * 2044709447) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-8195);
                     }
                  }

                  short var36 = 321;
                  if (var26 == 1 && var28 >= var36 - 20 && var28 <= 20 + var36) {
                     SpotAnimationDefinition.Login_promptCredentials(true, (short)353);
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("br")
   static void method1229() {
      UserComparator6.otp.trim();
      if (UserComparator6.otp.length() != 6) {
         class525.setLoginResponseString(Strings.field5118, Strings.field4955, Strings.field4894, (byte)1);
      } else {
         class28.otpMedium = Integer.parseInt(UserComparator6.otp) * -1904399543;
         UserComparator6.otp = "";
         classFR.method4050(true, 182120386);
         class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
         WorldMapSectionType.updateGameState(20, (byte)45);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bh")
   static void method1230() {
      UserComparator6.otp.trim();
      if (UserComparator6.otp.length() != 6) {
         class525.setLoginResponseString(Strings.field5118, Strings.field4955, Strings.field4894, (byte)1);
      } else {
         class28.otpMedium = Integer.parseInt(UserComparator6.otp) * -1904399543;
         UserComparator6.otp = "";
         classFR.method4050(true, -1998789796);
         class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
         WorldMapSectionType.updateGameState(20, (byte)45);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/Date;)Z")
   @ObfuscatedName("bv")
   static boolean method1235(Date var0) {
      Calendar var2 = Calendar.getInstance();
      var2.set(2, 0);
      var2.set(5, 1);
      var2.set(1, -1068580366);
      Date var1 = var2.getTime();
      return var0.after(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bc")
   static void method1231() {
      Login_username = Login_username.trim();
      if (Login_username.isEmpty()) {
         class525.setLoginResponseString(Strings.field4973, Strings.field4974, Strings.field5105, (byte)1);
      } else if (Login_password.isEmpty()) {
         class525.setLoginResponseString(Strings.field5130, Strings.field4977, Strings.field4911, (byte)1);
      } else {
         class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
         classFR.method4050(false, -1761153873);
         WorldMapSectionType.updateGameState(20, (byte)45);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ov")
   static final void method1274(byte var0) {
      try {
         PacketBufferNode var1 = ReflectionCheck.getPacketBufferNode(ClientPacket.field3881, client.packetWriter.isaacCipher, -1280183406);
         PacketWriter.method3330(client.packetWriter, var1, -1771370198);
         Interpreter.field338 = true;

         for (InterfaceParent var2 = (InterfaceParent)client.interfaceParents.first(); null != var2; var2 = (InterfaceParent)client.interfaceParents.next()) {
            if (-953539367 * var2.type != 0) {
               if (3 != -953539367 * var2.type) {
                  continue;
               }

               if (var0 != 1) {
                  return;
               }
            }

            class39.closeInterface(var2, true, (byte)15);
         }

         if (client.meslayerContinueWidget != null) {
            class376.invalidateWidget(client.meslayerContinueWidget, (byte)5);
            client.meslayerContinueWidget = null;
         }

         Interpreter.field338 = false;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "bv.ov(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bx")
   static boolean method1233() {
      if ((client.worldProperties * -1330094789 & class594.field6414.rsOrdinal((byte)54)) != 0) {
         Login_response0 = "";
         Login_response1 = Strings.field5058;
         Login_response2 = Strings.field4959;
         Login_response3 = Strings.field5082;
         class30.method1308(1, -20026237);
         return true;
      } else if ((-1330094789 * client.worldProperties & class594.field6429.rsOrdinal((byte)54)) != 0) {
         if ((-1330094789 * client.worldProperties & class594.field6416.rsOrdinal((byte)104)) != 0) {
            Login_response1 = Strings.field5076;
            Login_response2 = Strings.field5077;
            Login_response3 = Strings.field4885;
         } else {
            Login_response1 = Strings.field5049;
            Login_response2 = Strings.field5071;
            Login_response3 = Strings.field5072;
         }

         Login_response0 = Strings.field5069;
         class30.method1308(1, 1742201969);
         return true;
      } else if ((-1330094789 * client.worldProperties & class594.field6416.rsOrdinal((byte)64)) != 0) {
         Login_response1 = Strings.field5004;
         Login_response2 = Strings.field5074;
         Login_response3 = Strings.field5075;
         Login_response0 = Strings.field5069;
         class30.method1308(1, -747130622);
         return true;
      } else {
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("db")
   static void method1266() {
      class30.method1308(24, -1866634574);
      class525.setLoginResponseString(Strings.field5090, Strings.field4932, Strings.field5092, (byte)1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bq")
   static boolean method1234() {
      if ((client.worldProperties * -1330094789 & class594.field6414.rsOrdinal((byte)60)) != 0) {
         Login_response0 = "";
         Login_response1 = Strings.field5058;
         Login_response2 = Strings.field4959;
         Login_response3 = Strings.field5082;
         class30.method1308(1, 998869172);
         return true;
      } else if ((-1330094789 * client.worldProperties & class594.field6429.rsOrdinal((byte)73)) != 0) {
         if ((-1330094789 * client.worldProperties & class594.field6416.rsOrdinal((byte)99)) != 0) {
            Login_response1 = Strings.field5076;
            Login_response2 = Strings.field5077;
            Login_response3 = Strings.field4885;
         } else {
            Login_response1 = Strings.field5049;
            Login_response2 = Strings.field5071;
            Login_response3 = Strings.field5072;
         }

         Login_response0 = Strings.field5069;
         class30.method1308(1, -351612494);
         return true;
      } else if ((-1330094789 * client.worldProperties & class594.field6416.rsOrdinal((byte)74)) != 0) {
         Login_response1 = Strings.field5004;
         Login_response2 = Strings.field5074;
         Login_response3 = Strings.field5075;
         Login_response0 = Strings.field5069;
         class30.method1308(1, -1324545004);
         return true;
      } else {
         return false;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/Date;)Z")
   @ObfuscatedName("ce")
   static boolean method1236(Date var0) {
      Calendar var2 = Calendar.getInstance();
      var2.set(2, 0);
      var2.set(5, 1);
      var2.set(1, 1900);
      Date var1 = var2.getTime();
      return var0.after(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)V")
   @ObfuscatedName("dj")
   static void method1271(int var0, String var1) {
      Login_loadingText = var1;
      Login_loadingPercent = -2106710917 * var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("ct")
   static void method1238(String var0, String var1, String var2) {
      class30.method1308(7, -1738541096);
      class525.setLoginResponseString(var0, var1, var2, (byte)1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;)V")
   @ObfuscatedName("cv")
   static void method1255(GameEngine var0) {
      IndexCheck var1 = HttpRequest.method280((byte)1);

      while (var1.method6510((byte)-7)) {
         if (2044709447 * var1.field3386 == 13) {
            classSX.method10523((byte)-83);
            return;
         }

         if (2044709447 * var1.field3386 == -1561522296) {
            if (1401993025 * worldSelectPage > 0 && class70.worldSelectLeftSprite != null) {
               worldSelectPage -= 1351893480;
            }
         } else if (var1.field3386 * -70500690 == 1530908026
            && worldSelectPage * 1401993025 < 2126332771 * worldSelectPagesCount
            && class339.worldSelectRightSprite != null) {
            worldSelectPage += 2010460610;
         }
      }

      if (MouseHandler.MouseHandler_lastButton * 120986106 == 1 || !UrlRequest.mouseCam && 4 == 1721626731 * MouseHandler.MouseHandler_lastButton) {
         int var2 = xPadding * 921778921 + -1779762080;
         if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var2
            && MouseHandler.MouseHandler_lastPressedX * -1018773713 <= 14 + var2
            && MouseHandler.MouseHandler_lastPressedY * -261967643 >= 4
            && -261967643 * MouseHandler.MouseHandler_lastPressedY <= 18) {
            class165.changeWorldSelectSorting(0, 0, -1905008216);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX * -837362051 >= var2 + 15
            && MouseHandler.MouseHandler_lastPressedX * -1442453500 <= 80 + var2
            && MouseHandler.MouseHandler_lastPressedY * -950144178 >= 4
            && MouseHandler.MouseHandler_lastPressedY * 1754723708 <= 18) {
            class165.changeWorldSelectSorting(0, 1, -1631092805);
            return;
         }

         int var3 = 390 + xPadding * 921778921;
         if (1880321779 * MouseHandler.MouseHandler_lastPressedX >= var3
            && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= 14 + var3
            && MouseHandler.MouseHandler_lastPressedY * -261967643 >= 4
            && -261967643 * MouseHandler.MouseHandler_lastPressedY <= 18) {
            class165.changeWorldSelectSorting(1, 0, -1984340949);
            return;
         }

         if (-1018773713 * MouseHandler.MouseHandler_lastPressedX >= 15 + var3
            && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= var3 + -636265872
            && -261967643 * MouseHandler.MouseHandler_lastPressedY >= 4
            && -261967643 * MouseHandler.MouseHandler_lastPressedY <= 18) {
            class165.changeWorldSelectSorting(1, 1, -1909746125);
            return;
         }

         int var4 = 1744305155 + -1167439595 * xPadding;
         if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var4
            && -1490501709 * MouseHandler.MouseHandler_lastPressedX <= var4 + 14
            && MouseHandler.MouseHandler_lastPressedY * -261967643 >= 4
            && MouseHandler.MouseHandler_lastPressedY * -261967643 <= 18) {
            class165.changeWorldSelectSorting(2, 0, -1796897254);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX * -2122856471 >= var4 + 15
            && MouseHandler.MouseHandler_lastPressedX * -1018773713 <= var4 + 80
            && MouseHandler.MouseHandler_lastPressedY * -261967643 >= 4
            && MouseHandler.MouseHandler_lastPressedY * -261967643 <= 18) {
            class165.changeWorldSelectSorting(2, 1, -2102355083);
            return;
         }

         int var5 = xPadding * -1267404839 + 610;
         if (-1002237472 * MouseHandler.MouseHandler_lastPressedX >= var5
            && -598319356 * MouseHandler.MouseHandler_lastPressedX <= var5 + 14
            && -261967643 * MouseHandler.MouseHandler_lastPressedY >= 4
            && MouseHandler.MouseHandler_lastPressedY * 127569949 <= 18) {
            class165.changeWorldSelectSorting(3, 0, -1672665730);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var5 + 15
            && 2044817564 * MouseHandler.MouseHandler_lastPressedX <= var5 + 80
            && -261967643 * MouseHandler.MouseHandler_lastPressedY >= 4
            && -261967643 * MouseHandler.MouseHandler_lastPressedY <= 18) {
            class165.changeWorldSelectSorting(3, 1, -1983846747);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= 588969834 + 921778921 * xPadding
            && 1713940924 * MouseHandler.MouseHandler_lastPressedY >= 4
            && 870042825 * MouseHandler.MouseHandler_lastPressedX <= -1976685333 + -1585076994 * xPadding + -1824166652
            && -801603110 * MouseHandler.MouseHandler_lastPressedY <= 20) {
            classSX.method10523((byte)88);
            return;
         }

         if (hoveredWorldIndex * 1168944168 != -1) {
            World var6 = World.World_worlds[hoveredWorldIndex * 1761732334];
            boolean var7 = class320.method7360(client.worldProperties * -1330094789, class594.field6422, -2003045680);
            boolean var8 = World.method891(var6, -1481259325);
            class452.field5534 = var8;
            var6.field283 = var8 ? "beta" : var6.field283;
            EnumComposition.changeWorld(var6, -1581759358);
            classSX.method10523((byte)38);
            if (var8 != var7) {
               class144.method3969((byte)-88);
            }

            return;
         }

         if (worldSelectPage * 1401993025 > 0
            && null != class70.worldSelectLeftSprite
            && MouseHandler.MouseHandler_lastPressedX * -1018773713 >= 0
            && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= class70.worldSelectLeftSprite.subWidth
            && MouseHandler.MouseHandler_lastPressedY * -1823201934 >= class374.canvasHeight * 19292887 / 2 - 50
            && -261967643 * MouseHandler.MouseHandler_lastPressedY <= class374.canvasHeight * 1817780600 / 2 + 50) {
            worldSelectPage -= -2008807475;
         }

         if (1291261694 * worldSelectPage < worldSelectPagesCount * 1483893054
            && class339.worldSelectRightSprite != null
            && -1018773713 * MouseHandler.MouseHandler_lastPressedX >= 120179835 * class489.canvasWidth - class339.worldSelectRightSprite.subWidth - 5
            && 530318204 * MouseHandler.MouseHandler_lastPressedX <= 120179835 * class489.canvasWidth
            && MouseHandler.MouseHandler_lastPressedY * -261967643 >= -1532528019 * class374.canvasHeight / 2 - 50
            && MouseHandler.MouseHandler_lastPressedY * 916064462 <= class374.canvasHeight * 1492728951 / 2 + 1870214794) {
            worldSelectPage += -1031284543;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("cb")
   static int method1241(int var0, int var1) {
      for (int var2 = 0; var2 < 8; var2++) {
         if (var1 <= var0 + 30) {
            return var2;
         }

         var0 += 30;
         var0 += 1 != var2 && 3 != var2 ? 5 : 20;
      }

      return 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ck")
   static int method1242(int var0, int var1) {
      for (int var2 = 0; var2 < 8; var2++) {
         if (var1 <= var0 + 30) {
            return var2;
         }

         var0 += 30;
         var0 += 1 != var2 && 3 != var2 ? 5 : 20;
      }

      return 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("cc")
   static boolean method1243(char var0) {
      return field398.indexOf(var0) != -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;)V")
   @ObfuscatedName("wg")
   public static void method1228(WorldMap var0) {
      var0.cacheLoader.load(-1124148422);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("cs")
   static boolean method1244(char var0) {
      return field398.indexOf(var0) != -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("cn")
   static boolean method1245(char var0) {
      return field398.indexOf(var0) != -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("co")
   static void method1248(boolean var0) {
      if (!SecureUrlRequester.client.containsAccessAndRefreshToken(-1509473794)
         && !SecureUrlRequester.client.otlTokenRequesterInitialized((byte)-61)
         && !SecureUrlRequester.client.containsSessionAndCharacterId(456833511)) {
         Login_response1 = Strings.field4999;
         Login_response2 = Strings.field5100;
         Login_response3 = Strings.field5068;
         class30.method1308(2, -628397003);
         if (var0) {
            Login_password = "";
         }

         if (Login_username == null || Login_username.isEmpty()) {
            if (class468.clientPreferences.getRememberedUsername(546973954) != null) {
               Login_username = class468.clientPreferences.getRememberedUsername(1042008580);
               client.Login_isUsernameRemembered = true;
            } else {
               client.Login_isUsernameRemembered = false;
            }
         }

         WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
      } else {
         class30.method1308(10, 527457569);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("cy")
   static void method1253(String var0, String var1, String var2) {
      Login_response1 = var0;
      Login_response2 = var1;
      Login_response3 = var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;Luw;ZI)V")
   @ObfuscatedName("bt")
   static void method1219(AbstractArchive var0, AbstractArchive var1, GraphicsDefaults var2, boolean var3, int var4) {
      if (class217.clearLoginScreen) {
         if (4 == var4) {
            class30.method1308(4, 1782897155);
         }
      } else {
         if (var4 == 0) {
            class586.updateLoginStatusUsernameRemembered(var3, -648640067);
         } else {
            class30.method1308(var4, 2133960421);
         }

         Rasterizer2D.Rasterizer2D_clear();
         byte[] var5 = var0.takeFileByNames("title.jpg", "", -1940842244);
         class560.leftTitleSprite = class201.readSpritePixelsFromBytes(var5, (byte)-42);
         WorldMapData_1.rightTitleSprite = class560.leftTitleSprite.mirrorHorizontally();
         int var6 = client.worldProperties * -1330094789;
         if ((var6 & class594.field6435.rsOrdinal((byte)48)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "", 1915333601);
         } else if ((var6 & class594.field6409.rsOrdinal((byte)52)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "", 1937274633);
         } else if ((var6 & class594.field6433.rsOrdinal((byte)71)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "", 1915161308);
         } else if ((var6 & class594.field6417.rsOrdinal((byte)123)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_ugc_world", "", 2115159585);
         } else {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "", 1977820811);
         }

         class208.titleboxSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "", 2003475001);
         World.titlebuttonSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "", 1929350831);
         classLX.field3801 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "", 2135371935);
         TriBool.field5954 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "", 1980447999);
         HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "", 2088097866);
         DirectByteArrayCopier.runesSprite = class288.getFont(var1, "runes", "", (byte)-98);
         FadeOutTask.title_muteSprite = class288.getFont(var1, "title_mute", "", (byte)-13);
         class456.options_buttons_0Sprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "", 1933113003);
         UserComparator6.field1830 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "", 2107866573);
         WidgetConfigNode.options_buttons_2Sprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "", 1930786299);
         HealthBarDefinition.field2243 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "", 2009412604);
         class164.field1972 = class456.options_buttons_0Sprite.subWidth * 1636032297;
         TaskHandler.field2444 = class456.options_buttons_0Sprite.subHeight * 449044205;
         class204.loginScreenRunesAnimation = new LoginScreenAnimation(DirectByteArrayCopier.runesSprite, var2.field6140);
         if (var3) {
            Login_username = "";
            Login_password = "";
            field387 = new String[8];
            field386 = 0;
         }

         class28.otpMedium = 0;
         UserComparator6.otp = "";
         rememberUsername = true;
         worldSelectOpen = false;
         if (class468.clientPreferences.isTitleMusicDisabled(-1141781633)) {
            classGK.method4244(0, 0, 607947733);
         } else {
            class148.method4143("scape main", 255, -1622735100);
         }

         class179.method4237(-1931393605);
         JagNetThread var7 = VarbitComposition.field2488;
         var7.method9232(false, -258628747);
         class217.clearLoginScreen = true;
         xPadding = 816921945 * ((class489.canvasWidth * 120179835 - 765) / 2);
         loginBoxX = 1308961390 + xPadding * -1970420125;
         CollisionMap.loginBoxCenter = -729437604 + loginBoxX * -485361479;
         class560.leftTitleSprite.method12647(xPadding * 921778921, 0);
         WorldMapData_1.rightTitleSprite.method12647(921778921 * xPadding + 382, 0);
         class50.logoSprite.drawAt(xPadding * 921778921 + 382 - class50.logoSprite.subWidth / 2, 18);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;)I")
   @ObfuscatedName("bs")
   static int method1213(AbstractArchive var0, AbstractArchive var1) {
      int var2 = 0;
      String[] var3 = field405;

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];
         if (var0.tryLoadFileByNames(var5, "", -1567491541)) {
            var2++;
         }
      }

      var3 = field383;

      for (int var8 = 0; var8 < var3.length; var8++) {
         String var10 = var3[var8];
         if (var1.tryLoadFileByNames(var10, "", -27410515)) {
            var2++;
         }
      }

      var3 = field407;

      for (int var9 = 0; var9 < var3.length; var9++) {
         String var11 = var3[var9];
         if (var1.groupLoadPercentByName(var11, (byte)-10) != -1 && var1.tryLoadFileByNames(var11, "", -1396482823)) {
            var2++;
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cd")
   static void method1249(boolean var0) {
      byte var1 = 0;
      boolean var2 = class468.clientPreferences.getEULA((byte)-124) >= 744188887 * client.field715;
      if (!var2) {
         var1 = 12;
      } else if (SecureUrlRequester.client.containsAccessAndRefreshToken(-107342929)
         || SecureUrlRequester.client.otlTokenRequesterInitialized((byte)-94)
         || SecureUrlRequester.client.containsSessionAndCharacterId(212879460)) {
         var1 = 10;
      }

      class30.method1308(var1, -734702646);
      if (var0) {
         Login_username = "";
         Login_password = "";
         class28.otpMedium = 0;
         UserComparator6.otp = "";
      }

      if (Login_username == null || Login_username.isEmpty()) {
         if (class468.clientPreferences.getRememberedUsername(2132125408) != null) {
            Login_username = class468.clientPreferences.getRememberedUsername(1360997900);
            client.Login_isUsernameRemembered = true;
         } else {
            client.Login_isUsernameRemembered = false;
         }
      }

      WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cz")
   static void method1250(boolean var0) {
      byte var1 = 0;
      boolean var2 = class468.clientPreferences.getEULA((byte)-74) >= 382624176 * client.field715;
      if (!var2) {
         var1 = 12;
      } else if (SecureUrlRequester.client.containsAccessAndRefreshToken(-542417432)
         || SecureUrlRequester.client.otlTokenRequesterInitialized((byte)-35)
         || SecureUrlRequester.client.containsSessionAndCharacterId(1098732744)) {
         var1 = 10;
      }

      class30.method1308(var1, -1865482300);
      if (var0) {
         Login_username = "";
         Login_password = "";
         class28.otpMedium = 0;
         UserComparator6.otp = "";
      }

      if (Login_username == null || Login_username.isEmpty()) {
         if (class468.clientPreferences.getRememberedUsername(1522007526) != null) {
            Login_username = class468.clientPreferences.getRememberedUsername(1170915505);
            client.Login_isUsernameRemembered = true;
         } else {
            client.Login_isUsernameRemembered = false;
         }
      }

      WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("df")
   static void method1265() {
      class30.method1308(24, 1316728759);
      class525.setLoginResponseString(Strings.field5087, Strings.field5059, Strings.field5089, (byte)1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("cf")
   static void method1254(String var0, String var1, String var2) {
      Login_response1 = var0;
      Login_response2 = var1;
      Login_response3 = var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljava/util/Date;")
   @ObfuscatedName("cm")
   static Date method1240() throws ParseException {
      SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
      var0.setLenient(false);
      StringBuilder var1 = new StringBuilder();
      String[] var2 = field387;

      for (int var3 = 0; var3 < var2.length; var3++) {
         String var4 = var2[var3];
         if (null == var4) {
            WorldMapEvent.method7541("Date not valid.", "Please ensure all characters are populated.", "", 1067491589);
            return null;
         }

         var1.append(var4);
      }

      var1.append("12");
      return var0.parse(var1.toString());
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbm;)V")
   @ObfuscatedName("cq")
   static void method1256(GameEngine var0) {
      IndexCheck var1 = HttpRequest.method280((byte)1);

      while (var1.method6510((byte)-71)) {
         if (2044709447 * var1.field3386 == 13) {
            classSX.method10523((byte)33);
            return;
         }

         if (2044709447 * var1.field3386 == 96) {
            if (1401993025 * worldSelectPage > 0 && class70.worldSelectLeftSprite != null) {
               worldSelectPage -= -1031284543;
            }
         } else if (var1.field3386 * 2044709447 == 97
            && worldSelectPage * 1401993025 < 2126332771 * worldSelectPagesCount
            && class339.worldSelectRightSprite != null) {
            worldSelectPage += -1031284543;
         }
      }

      if (MouseHandler.MouseHandler_lastButton * 1721626731 == 1 || !UrlRequest.mouseCam && 4 == 1721626731 * MouseHandler.MouseHandler_lastButton) {
         int var2 = xPadding * 921778921 + 280;
         if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var2
            && MouseHandler.MouseHandler_lastPressedX * -1018773713 <= 14 + var2
            && MouseHandler.MouseHandler_lastPressedY * -261967643 >= 4
            && -261967643 * MouseHandler.MouseHandler_lastPressedY <= 18) {
            class165.changeWorldSelectSorting(0, 0, -1926852400);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var2 + 15
            && MouseHandler.MouseHandler_lastPressedX * -1018773713 <= 80 + var2
            && MouseHandler.MouseHandler_lastPressedY * -261967643 >= 4
            && MouseHandler.MouseHandler_lastPressedY * -261967643 <= 18) {
            class165.changeWorldSelectSorting(0, 1, -1956692494);
            return;
         }

         int var3 = 390 + xPadding * 921778921;
         if (-1018773713 * MouseHandler.MouseHandler_lastPressedX >= var3
            && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= 14 + var3
            && MouseHandler.MouseHandler_lastPressedY * -261967643 >= 4
            && -261967643 * MouseHandler.MouseHandler_lastPressedY <= 18) {
            class165.changeWorldSelectSorting(1, 0, -1808219405);
            return;
         }

         if (-1018773713 * MouseHandler.MouseHandler_lastPressedX >= 15 + var3
            && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= var3 + 80
            && -261967643 * MouseHandler.MouseHandler_lastPressedY >= 4
            && -261967643 * MouseHandler.MouseHandler_lastPressedY <= 18) {
            class165.changeWorldSelectSorting(1, 1, -1896020624);
            return;
         }

         int var4 = 500 + 921778921 * xPadding;
         if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var4
            && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= var4 + 14
            && MouseHandler.MouseHandler_lastPressedY * -261967643 >= 4
            && MouseHandler.MouseHandler_lastPressedY * -261967643 <= 18) {
            class165.changeWorldSelectSorting(2, 0, -2075728822);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var4 + 15
            && MouseHandler.MouseHandler_lastPressedX * -1018773713 <= var4 + 80
            && MouseHandler.MouseHandler_lastPressedY * -261967643 >= 4
            && MouseHandler.MouseHandler_lastPressedY * -261967643 <= 18) {
            class165.changeWorldSelectSorting(2, 1, -1908899866);
            return;
         }

         int var5 = xPadding * 921778921 + 610;
         if (-1018773713 * MouseHandler.MouseHandler_lastPressedX >= var5
            && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= var5 + 14
            && -261967643 * MouseHandler.MouseHandler_lastPressedY >= 4
            && MouseHandler.MouseHandler_lastPressedY * -261967643 <= 18) {
            class165.changeWorldSelectSorting(3, 0, -1815573627);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var5 + 15
            && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= var5 + 80
            && -261967643 * MouseHandler.MouseHandler_lastPressedY >= 4
            && -261967643 * MouseHandler.MouseHandler_lastPressedY <= 18) {
            class165.changeWorldSelectSorting(3, 1, -1705896844);
            return;
         }

         if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= 708 + 921778921 * xPadding
            && -261967643 * MouseHandler.MouseHandler_lastPressedY >= 4
            && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= 708 + 921778921 * xPadding + 50
            && -261967643 * MouseHandler.MouseHandler_lastPressedY <= 20) {
            classSX.method10523((byte)1);
            return;
         }

         if (hoveredWorldIndex * 1691792603 != -1) {
            World var6 = World.World_worlds[hoveredWorldIndex * 1691792603];
            boolean var7 = class320.method7360(client.worldProperties * -1330094789, class594.field6422, -1400879991);
            boolean var8 = World.method891(var6, -1255716253);
            class452.field5534 = var8;
            var6.field283 = var8 ? "beta" : var6.field283;
            EnumComposition.changeWorld(var6, 606138787);
            classSX.method10523((byte)18);
            if (var8 != var7) {
               class144.method3969((byte)-97);
            }

            return;
         }

         if (worldSelectPage * 1401993025 > 0
            && null != class70.worldSelectLeftSprite
            && MouseHandler.MouseHandler_lastPressedX * -1018773713 >= 0
            && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= class70.worldSelectLeftSprite.subWidth
            && MouseHandler.MouseHandler_lastPressedY * -261967643 >= class374.canvasHeight * 19292887 / 2 - 50
            && -261967643 * MouseHandler.MouseHandler_lastPressedY <= class374.canvasHeight * 19292887 / 2 + 50) {
            worldSelectPage -= -1031284543;
         }

         if (1401993025 * worldSelectPage < worldSelectPagesCount * 2126332771
            && class339.worldSelectRightSprite != null
            && -1018773713 * MouseHandler.MouseHandler_lastPressedX >= 120179835 * class489.canvasWidth - class339.worldSelectRightSprite.subWidth - 5
            && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= 120179835 * class489.canvasWidth
            && MouseHandler.MouseHandler_lastPressedY * -261967643 >= 19292887 * class374.canvasHeight / 2 - 50
            && MouseHandler.MouseHandler_lastPressedY * -261967643 <= class374.canvasHeight * 19292887 / 2 + 50) {
            worldSelectPage += -1031284543;
         }
      }
   }

   static {
      new DecimalFormat("##0.00");
      new class142();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ba")
   static String method1220() {
      return ClientPreferences.method1560(class468.clientPreferences, 316755369) ? FriendsList.method10586(Login_username, 2097200167) : Login_username;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/Date;)Z")
   @ObfuscatedName("ch")
   static boolean method1237(Date var0) {
      Calendar var2 = Calendar.getInstance();
      var2.set(2, 0);
      var2.set(5, 1);
      var2.set(1, 1900);
      Date var1 = var2.getTime();
      return var0.after(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bu")
   static String method1221() {
      return ClientPreferences.method1560(class468.clientPreferences, -1530756447) ? FriendsList.method10586(Login_username, 2097200167) : Login_username;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbn;)V")
   @ObfuscatedName("ca")
   static void method1260(World var0) {
      if (var0.isMembersOnly(-924981146) != client.isMembersWorld) {
         client.isMembersWorld = var0.isMembersOnly(-479257754);
         class189.method4814(var0.isMembersOnly(-887752371), (byte)-64);
      }

      if (var0.location * -417407971 != -1958211694 * client.worldProperties) {
         Archive var1 = class147.archive8;
         int var2 = -133311018 * var0.location;
         if ((var2 & class594.field6435.rsOrdinal((byte)87)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "", 2134063160);
         } else if ((var2 & class594.field6409.rsOrdinal((byte)106)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "", 1989221021);
         } else if ((var2 & class594.field6433.rsOrdinal((byte)126)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "", 2137085099);
         } else if ((var2 & class594.field6417.rsOrdinal((byte)30)) != 0) {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_ugc_world", "", 2066567500);
         } else {
            class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "", 2049773590);
         }
      }

      DynamicArray.worldHost = var0.host;
      client.worldId = 438507219 * var0.population;
      client.worldProperties = var0.location * -1978907195;
      class365.field4638 = var0.field283;
      WorldMapLabel.worldPort = (0 == client.gameBuild * -423864891 ? 'ꩊ' : 37074095 + var0.population * 789563243) * -2014086695;
      class532.js5Port = -1309004683 * (client.gameBuild * 2107492296 == 0 ? -320911400 : 563592062 + 789563243 * var0.population);
      class46.currentPort = -1275090860 * WorldMapLabel.worldPort;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dv")
   static void method1263() {
      if (loginIndex * -1614560929 == 34) {
         SpotAnimationDefinition.Login_promptCredentials(false, (short)-3639);
      }

      worldSelectOpen = false;
      Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
      class560.leftTitleSprite.method12647(xPadding * 921778921, 0);
      WorldMapData_1.rightTitleSprite.method12647(xPadding * 921778921 + 382, 0);
      class50.logoSprite.drawAt(382 + xPadding * 921778921 - class50.logoSprite.subWidth / 2, 18);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dd")
   static void method1262() {
      if (class406.loadWorlds(1910739490)) {
         worldSelectOpen = true;
         worldSelectPage = 0;
         worldSelectPagesCount = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dw")
   static void method1264() {
      if (loginIndex * -1614560929 == 34) {
         SpotAnimationDefinition.Login_promptCredentials(false, (short)-1079);
      }

      worldSelectOpen = false;
      Rasterizer2D.Rasterizer2D_fillRectangle(0, 0, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height, 0);
      class560.leftTitleSprite.method12647(xPadding * 921778921, 0);
      WorldMapData_1.rightTitleSprite.method12647(xPadding * 921778921 + 382, 0);
      class50.logoSprite.drawAt(382 + xPadding * 921778921 - class50.logoSprite.subWidth / 2, 18);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lix;)Ljava/lang/String;")
   @ObfuscatedName("mf")
   public static String method1209(class225 var0) {
      return var0.field2761.method5965(2076119733);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsu;Lsu;Lsu;)V")
   @ObfuscatedName("ci")
   static void method1252(Font var0, Font var1, Font var2) {
      xPadding = (class489.canvasWidth * 120179835 - 765) / 2 * 816921945;
      loginBoxX = 1308961390 + xPadding * -1970420125;
      CollisionMap.loginBoxCenter = -485361479 * loginBoxX + -729437604;
      if (worldSelectOpen) {
         if (null == class461.worldSelectBackSprites) {
            class461.worldSelectBackSprites = class234.method5949(class147.archive8, "sl_back", "", -2085797468);
         }

         if (class107.worldSelectFlagSprites == null) {
            class107.worldSelectFlagSprites = class288.getFont(class147.archive8, "sl_flags", "", (byte)-21);
         }

         if (MoveSpeed.worldSelectArrows == null) {
            MoveSpeed.worldSelectArrows = class288.getFont(class147.archive8, "sl_arrows", "", (byte)-36);
         }

         if (null == class148.worldSelectStars) {
            class148.worldSelectStars = class288.getFont(class147.archive8, "sl_stars", "", (byte)-77);
         }

         if (null == class70.worldSelectLeftSprite) {
            class70.worldSelectLeftSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(class147.archive8, "leftarrow", "", 1969942050);
         }

         if (null == class339.worldSelectRightSprite) {
            class339.worldSelectRightSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(class147.archive8, "rightarrow", "", 2010025086);
         }

         Rasterizer2D.Rasterizer2D_fillRectangle(921778921 * xPadding, 23, 765, 480, 0);
         Rasterizer2D.Rasterizer2D_fillRectangleGradient(xPadding * 921778921, 0, 125, 23, 12425273, 9135624);
         Rasterizer2D.Rasterizer2D_fillRectangleGradient(125 + 921778921 * xPadding, 0, 640, 23, 5197647, 2697513);
         FadeOutTask.method10363(var0, Strings.field5153, 62 + xPadding * 921778921, 15, 0, -1);
         if (null != class148.worldSelectStars) {
            class148.worldSelectStars[1].drawAt(140 + xPadding * 921778921, 1);
            var1.method10402(Strings.field5154, 152 + 921778921 * xPadding, 10, 16777215, -1);
            class148.worldSelectStars[0].drawAt(140 + 921778921 * xPadding, 12);
            var1.method10402(Strings.field5155, 152 + xPadding * 921778921, 21, 16777215, -1);
         }

         if (null != MoveSpeed.worldSelectArrows) {
            int var109 = 280 + xPadding * 921778921;
            if (0 == World.World_sortOption1[0] && World.World_sortOption2[0] == 0) {
               MoveSpeed.worldSelectArrows[2].drawAt(var109, 4);
            } else {
               MoveSpeed.worldSelectArrows[0].drawAt(var109, 4);
            }

            if (0 == World.World_sortOption1[0] && World.World_sortOption2[0] == 1) {
               MoveSpeed.worldSelectArrows[3].drawAt(15 + var109, 4);
            } else {
               MoveSpeed.worldSelectArrows[1].drawAt(var109 + 15, 4);
            }

            var0.method10402(Strings.field4931, var109 + 32, 17, 16777215, -1);
            int var145 = xPadding * 921778921 + 390;
            if (1 == World.World_sortOption1[0] && World.World_sortOption2[0] == 0) {
               MoveSpeed.worldSelectArrows[2].drawAt(var145, 4);
            } else {
               MoveSpeed.worldSelectArrows[0].drawAt(var145, 4);
            }

            if (1 == World.World_sortOption1[0] && World.World_sortOption2[0] == 1) {
               MoveSpeed.worldSelectArrows[3].drawAt(15 + var145, 4);
            } else {
               MoveSpeed.worldSelectArrows[1].drawAt(var145 + 15, 4);
            }

            var0.method10402(Strings.field5073, 32 + var145, 17, 16777215, -1);
            int var169 = xPadding * 921778921 + 500;
            if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
               MoveSpeed.worldSelectArrows[2].drawAt(var169, 4);
            } else {
               MoveSpeed.worldSelectArrows[0].drawAt(var169, 4);
            }

            if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
               MoveSpeed.worldSelectArrows[3].drawAt(15 + var169, 4);
            } else {
               MoveSpeed.worldSelectArrows[1].drawAt(15 + var169, 4);
            }

            var0.method10402(Strings.field5158, 32 + var169, 17, 16777215, -1);
            int var180 = 610 + xPadding * 921778921;
            if (3 == World.World_sortOption1[0] && World.World_sortOption2[0] == 0) {
               MoveSpeed.worldSelectArrows[2].drawAt(var180, 4);
            } else {
               MoveSpeed.worldSelectArrows[0].drawAt(var180, 4);
            }

            if (3 == World.World_sortOption1[0] && 1 == World.World_sortOption2[0]) {
               MoveSpeed.worldSelectArrows[3].drawAt(15 + var180, 4);
            } else {
               MoveSpeed.worldSelectArrows[1].drawAt(15 + var180, 4);
            }

            var0.method10402(Strings.field5159, var180 + 32, 17, 16777215, -1);
         }

         Rasterizer2D.Rasterizer2D_fillRectangle(708 + 921778921 * xPadding, 4, 50, 16, 0);
         FadeOutTask.method10363(var1, Strings.field5137, 25 + 708 + xPadding * 921778921, 16, 16777215, -1);
         hoveredWorldIndex = -660744019;
         if (null != class461.worldSelectBackSprites) {
            byte var110 = 88;
            byte var146 = 19;
            int var170 = 765 / (var110 + 1) - 1;
            int var181 = 480 / (var146 + 1);

            int var191;
            int var196;
            do {
               var191 = var181;
               var196 = var170;
               if (var181 * (var170 - 1) >= -858019443 * World.World_count) {
                  var170--;
               }

               if ((var181 - 1) * var170 >= -858019443 * World.World_count) {
                  var181--;
               }

               if (var170 * (var181 - 1) >= -858019443 * World.World_count) {
                  var181--;
               }
            } while (var181 != var191 || var170 != var196);

            var191 = (765 - var170 * var110) / (1 + var170);
            if (var191 > 5) {
               var191 = 5;
            }

            var196 = (480 - var181 * var146) / (1 + var181);
            if (var196 > 5) {
               var196 = 5;
            }

            int var198 = (765 - var170 * var110 - (var170 - 1) * var191) / 2;
            int var199 = (480 - var181 * var146 - var196 * (var181 - 1)) / 2;
            int var11 = (var181 + -858019443 * World.World_count - 1) / var181;
            worldSelectPagesCount = 1133401675 * (var11 - var170);
            if (class70.worldSelectLeftSprite != null && worldSelectPage * 1401993025 > 0) {
               class70.worldSelectLeftSprite.drawAt(8, class374.canvasHeight * 19292887 / 2 - class70.worldSelectLeftSprite.subHeight / 2);
            }

            if (null != class339.worldSelectRightSprite && 1401993025 * worldSelectPage < worldSelectPagesCount * 2126332771) {
               class339.worldSelectRightSprite
                  .drawAt(
                     120179835 * class489.canvasWidth - class339.worldSelectRightSprite.subWidth - 8,
                     19292887 * class374.canvasHeight / 2 - class339.worldSelectRightSprite.subHeight / 2
                  );
            }

            int var200 = 23 + var199;
            int var201 = var198 + 921778921 * xPadding;
            int var202 = 0;
            boolean var204 = false;
            int var205 = worldSelectPage * 1401993025;

            for (int var17 = var181 * var205; var17 < World.World_count * -858019443 && var205 - 1401993025 * worldSelectPage < var170; var17++) {
               World var18 = World.World_worlds[var17];
               boolean var19 = true;
               String var20 = Integer.toString(var18.properties * 2054822665);
               if (-1 == 2054822665 * var18.properties) {
                  var20 = Strings.field5160;
                  var19 = false;
               } else if (2054822665 * var18.properties > 1980) {
                  var20 = Strings.field5161;
                  var19 = false;
               }

               class88 var21 = null;
               int var22 = 0;
               if (var18.isBeta(1097960086)) {
                  var21 = var18.isMembersOnly(-1425756883) ? class88.field1371 : class88.field1367;
               } else if (World.method891(var18, -1440523600)) {
                  var21 = var18.isMembersOnly(-612075759) ? class88.field1363 : class88.field1375;
               } else if (var18.method902(-1235012159)) {
                  var22 = 16711680;
                  var21 = var18.isMembersOnly(-1646175558) ? class88.field1376 : class88.field1368;
               } else if (var18.method910(2025590899)) {
                  var21 = var18.isMembersOnly(-2111416642) ? class88.field1370 : class88.field1365;
               } else if (var18.isPvp(840586222)) {
                  var21 = var18.isMembersOnly(-1303959486) ? class88.field1366 : class88.field1362;
               } else if (var18.method912((byte)43)) {
                  var21 = var18.isMembersOnly(-778274583) ? class88.field1372 : class88.field1369;
               } else if (var18.method916(1994543839)) {
                  var21 = var18.isMembersOnly(-362909055) ? class88.field1390 : class88.field1373;
               }

               if (null == var21 || var21.field1377 * 142977173 >= class461.worldSelectBackSprites.length) {
                  var21 = var18.isMembersOnly(-604183301) ? class88.field1364 : class88.field1361;
               }

               if (MouseHandler.MouseHandler_x * 1856325427 >= var201
                  && MouseHandler.MouseHandler_y * -1427762751 >= var200
                  && 1856325427 * MouseHandler.MouseHandler_x < var201 + var110
                  && MouseHandler.MouseHandler_y * -1427762751 < var146 + var200
                  && var19) {
                  hoveredWorldIndex = var17 * 660744019;
                  class461.worldSelectBackSprites[var21.field1377 * 142977173].drawTransOverlayAt(var201, var200, 128, 16777215);
                  var204 = true;
               } else {
                  class461.worldSelectBackSprites[var21.field1377 * 142977173].method12647(var201, var200);
               }

               if (null != class107.worldSelectFlagSprites) {
                  class107.worldSelectFlagSprites[(var18.isMembersOnly(-459936024) ? 8 : 0) + -428025341 * var18.index].drawAt(29 + var201, var200);
               }

               FadeOutTask.method10363(var0, Integer.toString(789563243 * var18.population), var201 + 15, 5 + var200 + var146 / 2, var22, -1);
               FadeOutTask.method10363(var1, var20, var201 + 60, var146 / 2 + var200 + 5, 268435455, -1);
               var200 += var146 + var196;
               if (++var202 >= var181) {
                  var200 = 23 + var199;
                  var201 += var191 + var110;
                  var202 = 0;
                  var205++;
               }
            }

            if (var204) {
               int var206 = var1.stringWidth(World.World_worlds[hoveredWorldIndex * 1691792603].activity) + 6;
               int var207 = 8 + var1.ascent;
               int var208 = -1427762751 * MouseHandler.MouseHandler_y + 25;
               if (var208 + var207 > 480) {
                  var208 = MouseHandler.MouseHandler_y * -1427762751 - 25 - var207;
               }

               Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x * 1856325427 - var206 / 2, var208, var206, var207, 16777120);
               Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x * 1856325427 - var206 / 2, var208, var206, var207, 0);
               FadeOutTask.method10363(
                  var1, World.World_worlds[hoveredWorldIndex * 1691792603].activity, 1856325427 * MouseHandler.MouseHandler_x, var208 + var1.ascent + 4, 0, -1
               );
            }
         }
      } else {
         class560.leftTitleSprite.method12647(921778921 * xPadding, 0);
         WorldMapData_1.rightTitleSprite.method12647(xPadding * 921778921 + 382, 0);
         class50.logoSprite.drawAt(382 + 921778921 * xPadding - class50.logoSprite.subWidth / 2, 18);
         if (0 == client.gameState * 1271535343 || 5 == 1271535343 * client.gameState) {
            byte var3 = 20;
            FadeOutTask.method10363(var0, Strings.field5036, 180 + 743318851 * loginBoxX, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            Rasterizer2D.Rasterizer2D_drawRectangle(180 + loginBoxX * 743318851 - 152, var4, 304, 34, 9179409);
            Rasterizer2D.Rasterizer2D_drawRectangle(180 + loginBoxX * 743318851 - 151, var4 + 1, 302, 32, 0);
            Rasterizer2D.Rasterizer2D_fillRectangle(180 + loginBoxX * 743318851 - 150, var4 + 2, Login_loadingPercent * -603434983, 30, 9179409);
            Rasterizer2D.Rasterizer2D_fillRectangle(
               loginBoxX * 743318851 + 180 - 150 + -603434983 * Login_loadingPercent, var4 + 2, 300 - Login_loadingPercent * -603434983, 30, 0
            );
            FadeOutTask.method10363(var0, Login_loadingText, 180 + loginBoxX * 743318851, 276 - var3, 16777215, -1);
         }

         if (20 == 1271535343 * client.gameState) {
            class208.titleboxSprite.drawAt(180 + 743318851 * loginBoxX - class208.titleboxSprite.subWidth / 2, 271 - class208.titleboxSprite.subHeight / 2);
            int var23 = 201;
            FadeOutTask.method10363(var0, Login_response1, 743318851 * loginBoxX + 180, var23, 16776960, 0);
            var23 += 15;
            FadeOutTask.method10363(var0, Login_response2, 180 + loginBoxX * 743318851, var23, 16776960, 0);
            var23 += 15;
            FadeOutTask.method10363(var0, Login_response3, 180 + 743318851 * loginBoxX, var23, 16776960, 0);
            var23 += 15;
            var23 += 7;
            if (loginIndex * -1614560929 != 4 && 10 != -1614560929 * loginIndex && 1 != -1614560929 * loginIndex) {
               var0.method10402(Strings.field5151, 743318851 * loginBoxX + 180 - 110, var23, 16777215, 0);
               short var111 = 200;
               String var5 = ClanMate.method10777((byte)-48);

               while (var0.stringWidth(var5) > var111) {
                  var5 = var5.substring(0, var5.length() - 1);
               }

               var0.method10402(AbstractFont.escapeBrackets(var5), 180 + 743318851 * loginBoxX - 70, var23, 16777215, 0);
               var23 += 15;
               String var6 = FriendsList.method10586(Login_password, 2097200167);

               while (var0.stringWidth(var6) > var111) {
                  var6 = var6.substring(1);
               }

               var0.method10402(Strings.field5094 + var6, loginBoxX * 743318851 + 180 - 108, var23, 16777215, 0);
               var23 += 15;
            }
         }

         if (1271535343 * client.gameState == 10 || 1271535343 * client.gameState == 11 || 1271535343 * client.gameState == 50) {
            class208.titleboxSprite.drawAt(loginBoxX * 743318851, 171);
            if (0 == loginIndex * -1614560929) {
               int var30 = 251;
               FadeOutTask.method10363(var0, Strings.field5005, 743318851 * loginBoxX + 180, var30, 16776960, 0);
               var30 += 30;
               int var112 = loginBoxX * 743318851 + 180 - 80;
               short var147 = 291;
               World.titlebuttonSprite.drawAt(var112 - 73, var147 - 20);
               AbstractFont.method10416(var0, Strings.field5097, var112 - 73, var147 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var112 = 80 + loginBoxX * 743318851 + 180;
               World.titlebuttonSprite.drawAt(var112 - 73, var147 - 20);
               AbstractFont.method10416(var0, Strings.field5098, var112 - 73, var147 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (-1614560929 * loginIndex == 1) {
               FadeOutTask.method10363(var0, Login_response0, 180 + loginBoxX * 743318851, 201, 16776960, 0);
               int var32 = 236;
               FadeOutTask.method10363(var0, Login_response1, 180 + 743318851 * loginBoxX, var32, 16777215, 0);
               var32 += 15;
               FadeOutTask.method10363(var0, Login_response2, loginBoxX * 743318851 + 180, var32, 16777215, 0);
               var32 += 15;
               FadeOutTask.method10363(var0, Login_response3, 180 + loginBoxX * 743318851, var32, 16777215, 0);
               var32 += 15;
               int var114 = 180 + loginBoxX * 743318851 - 80;
               short var148 = 321;
               World.titlebuttonSprite.drawAt(var114 - 73, var148 - 20);
               FadeOutTask.method10363(var0, Strings.field4859, var114, 5 + var148, 16777215, 0);
               var114 = 80 + 180 + 743318851 * loginBoxX;
               World.titlebuttonSprite.drawAt(var114 - 73, var148 - 20);
               FadeOutTask.method10363(var0, Strings.field5137, var114, 5 + var148, 16777215, 0);
            } else if (loginIndex * -1614560929 == 2) {
               int var36 = 201;
               FadeOutTask.method10363(var0, Login_response1, -1998333989 * CollisionMap.loginBoxCenter, var36, 16776960, 0);
               var36 += 15;
               FadeOutTask.method10363(var0, Login_response2, -1998333989 * CollisionMap.loginBoxCenter, var36, 16776960, 0);
               var36 += 15;
               FadeOutTask.method10363(var0, Login_response3, CollisionMap.loginBoxCenter * -1998333989, var36, 16776960, 0);
               var36 += 15;
               var36 += 7;
               var0.method10402(Strings.field5151, CollisionMap.loginBoxCenter * -1998333989 - 110, var36, 16777215, 0);
               short var116 = 200;
               String var149 = ClanMate.method10777((byte)-18);

               while (var0.stringWidth(var149) > var116) {
                  var149 = var149.substring(1);
               }

               var0.method10402(
                  AbstractFont.escapeBrackets(var149)
                     + (
                        244972893 * currentLoginField == 0 & client.cycle * 1759706017 % 40 < 20
                           ? class144.colorStartTag(16776960, -760580282) + classDF.field1347
                           : ""
                     ),
                  -1998333989 * CollisionMap.loginBoxCenter - 70,
                  var36,
                  16777215,
                  0
               );
               var36 += 15;
               String var171 = FriendsList.method10586(Login_password, 2097200167);

               while (var0.stringWidth(var171) > var116) {
                  var171 = var171.substring(1);
               }

               var0.method10402(
                  Strings.field5094
                     + var171
                     + (
                        1 == currentLoginField * 244972893 & 1759706017 * client.cycle % 40 < 20
                           ? class144.colorStartTag(16776960, 1856096115) + classDF.field1347
                           : ""
                     ),
                  -1998333989 * CollisionMap.loginBoxCenter - 108,
                  var36,
                  16777215,
                  0
               );
               var36 += 15;
               int var43 = 277;
               int var7 = CollisionMap.loginBoxCenter * -1998333989 + -117;
               boolean var9 = client.Login_isUsernameRemembered;
               boolean var10 = field377;
               IndexedSprite var8 = var9
                  ? (var10 ? HealthBarDefinition.field2243 : WidgetConfigNode.options_buttons_2Sprite)
                  : (var10 ? UserComparator6.field1830 : class456.options_buttons_0Sprite);
               var8.drawAt(var7, var43);
               var7 += var8.subWidth + 5;
               var1.method10402(Strings.field5091, var7, 13 + var43, 16776960, 0);
               var7 = CollisionMap.loginBoxCenter * -1998333989 + 24;
               boolean var13 = ClientPreferences.method1560(class468.clientPreferences, 996190756);
               boolean var14 = field392;
               IndexedSprite var12 = var13
                  ? (var14 ? HealthBarDefinition.field2243 : WidgetConfigNode.options_buttons_2Sprite)
                  : (var14 ? UserComparator6.field1830 : class456.options_buttons_0Sprite);
               var12.drawAt(var7, var43);
               var7 += var12.subWidth + 5;
               var1.method10402(Strings.field5067, var7, 13 + var43, 16776960, 0);
               var43 += 15;
               int var15 = CollisionMap.loginBoxCenter * -1998333989 - 80;
               short var16 = 321;
               World.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
               FadeOutTask.method10363(var0, Strings.field5084, var15, var16 + 5, 16777215, 0);
               var15 = -1998333989 * CollisionMap.loginBoxCenter + 80;
               World.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
               FadeOutTask.method10363(var0, Strings.field5137, var15, 5 + var16, 16777215, 0);
               short var45 = 357;
               switch (field399 * 1340994199) {
                  case 2:
                     WorldMapLabel.field3791 = Strings.field5114;
                     break;
                  default:
                     WorldMapLabel.field3791 = Strings.field5001;
               }

               class181.field2057 = new Bounds(-1998333989 * CollisionMap.loginBoxCenter, var45, var1.stringWidth(WorldMapLabel.field3791), 11);
               WorldMapElement.field2221 = new Bounds(CollisionMap.loginBoxCenter * -1998333989, var45, var1.stringWidth(Strings.field5113), 11);
               FadeOutTask.method10363(var1, WorldMapLabel.field3791, -1998333989 * CollisionMap.loginBoxCenter, var45, 16777215, 0);
            } else if (3 == loginIndex * -1614560929) {
               int var46 = 201;
               FadeOutTask.method10363(var0, Strings.field4969, 180 + 743318851 * loginBoxX, var46, 16776960, 0);
               var46 += 20;
               FadeOutTask.method10363(var1, Strings.field5104, 743318851 * loginBoxX + 180, var46, 16776960, 0);
               var46 += 20;
               FadeOutTask.method10363(var1, Strings.field4906, 180 + 743318851 * loginBoxX, var46, 16776960, 0);
               var46 += 15;
               int var117 = loginBoxX * 743318851 + 180;
               short var150 = 276;
               World.titlebuttonSprite.drawAt(var117 - 73, var150 - 20);
               FadeOutTask.method10363(var2, Strings.field5106, var117, var150 + 5, 16777215, 0);
               var117 = 180 + loginBoxX * 743318851;
               var150 = 326;
               World.titlebuttonSprite.drawAt(var117 - 73, var150 - 20);
               FadeOutTask.method10363(var2, Strings.field5107, var117, 5 + var150, 16777215, 0);
            } else if (loginIndex * -1614560929 == 4) {
               FadeOutTask.method10363(var0, Strings.field5083, 743318851 * loginBoxX + 180, 201, 16776960, 0);
               int var50 = 236;
               FadeOutTask.method10363(var0, Login_response1, 743318851 * loginBoxX + 180, var50, 16777215, 0);
               var50 += 15;
               FadeOutTask.method10363(var0, Login_response2, loginBoxX * 743318851 + 180, var50, 16777215, 0);
               var50 += 15;
               FadeOutTask.method10363(var0, Login_response3, 180 + 743318851 * loginBoxX, var50, 16777215, 0);
               var50 += 15;
               var0.method10402(
                  Strings.field5095
                     + FriendsList.method10586(UserComparator6.otp, 2097200167)
                     + (client.cycle * 1759706017 % 40 < 20 ? class144.colorStartTag(16776960, -1761586540) + classDF.field1347 : ""),
                  180 + 743318851 * loginBoxX - 108,
                  var50,
                  16777215,
                  0
               );
               var50 -= 8;
               var0.method10402(Strings.field4862, 180 + loginBoxX * 743318851 - 9, var50, 16776960, 0);
               var50 += 15;
               var0.method10402(Strings.field4863, 180 + 743318851 * loginBoxX - 9, var50, 16776960, 0);
               int var119 = loginBoxX * 743318851 + 180 - 9 + var0.stringWidth(Strings.field4863) + 15;
               int var152 = var50 - var0.ascent;
               IndexedSprite var172;
               if (rememberUsername) {
                  var172 = WidgetConfigNode.options_buttons_2Sprite;
               } else {
                  var172 = class456.options_buttons_0Sprite;
               }

               var172.drawAt(var119, var152);
               var50 += 15;
               int var185 = loginBoxX * 743318851 + 180 - 80;
               short var193 = 321;
               World.titlebuttonSprite.drawAt(var185 - 73, var193 - 20);
               FadeOutTask.method10363(var0, Strings.field4859, var185, var193 + 5, 16777215, 0);
               var185 = 80 + 180 + 743318851 * loginBoxX;
               World.titlebuttonSprite.drawAt(var185 - 73, var193 - 20);
               FadeOutTask.method10363(var0, Strings.field5137, var185, 5 + var193, 16777215, 0);
               FadeOutTask.method10363(var1, Strings.field5001, 743318851 * loginBoxX + 180, 36 + var193, 16777215, 0);
            } else if (-1614560929 * loginIndex == 5) {
               FadeOutTask.method10363(var0, Strings.field5164, 180 + 743318851 * loginBoxX, 201, 16776960, 0);
               int var57 = 221;
               FadeOutTask.method10363(var2, Login_response1, 743318851 * loginBoxX + 180, var57, 16776960, 0);
               var57 += 15;
               FadeOutTask.method10363(var2, Login_response2, 180 + 743318851 * loginBoxX, var57, 16776960, 0);
               var57 += 15;
               FadeOutTask.method10363(var2, Login_response3, 743318851 * loginBoxX + 180, var57, 16776960, 0);
               var57 += 15;
               var57 += 14;
               var0.method10402(Strings.field5109, 180 + 743318851 * loginBoxX - 145, var57, 16777215, 0);
               short var120 = 174;
               String var153 = ClanMate.method10777((byte)-125);

               while (var0.stringWidth(var153) > var120) {
                  var153 = var153.substring(1);
               }

               var0.method10402(
                  AbstractFont.escapeBrackets(var153)
                     + (client.cycle * 1759706017 % 40 < 20 ? class144.colorStartTag(16776960, -1040964736) + classDF.field1347 : ""),
                  743318851 * loginBoxX + 180 - 34,
                  var57,
                  16777215,
                  0
               );
               var57 += 15;
               int var173 = loginBoxX * 743318851 + 180 - 80;
               short var187 = 321;
               World.titlebuttonSprite.drawAt(var173 - 73, var187 - 20);
               FadeOutTask.method10363(var0, Strings.field4897, var173, var187 + 5, 16777215, 0);
               var173 = 80 + 180 + loginBoxX * 743318851;
               World.titlebuttonSprite.drawAt(var173 - 73, var187 - 20);
               FadeOutTask.method10363(var0, Strings.field5066, var173, var187 + 5, 16777215, 0);
               var187 = 356;
               FadeOutTask.method10363(var1, Strings.field5113, CollisionMap.loginBoxCenter * -1998333989, var187, 268435455, 0);
            } else if (-1614560929 * loginIndex == 6) {
               int var63 = 201;
               FadeOutTask.method10363(var0, Login_response1, 180 + loginBoxX * 743318851, var63, 16776960, 0);
               var63 += 15;
               FadeOutTask.method10363(var0, Login_response2, 743318851 * loginBoxX + 180, var63, 16776960, 0);
               var63 += 15;
               FadeOutTask.method10363(var0, Login_response3, loginBoxX * 743318851 + 180, var63, 16776960, 0);
               var63 += 15;
               int var121 = 180 + loginBoxX * 743318851;
               short var154 = 321;
               World.titlebuttonSprite.drawAt(var121 - 73, var154 - 20);
               FadeOutTask.method10363(var0, Strings.field5066, var121, 5 + var154, 16777215, 0);
            } else if (loginIndex * -1614560929 == 7) {
               if (Frames.field3189 && !client.onMobile) {
                  int var71 = 201;
                  FadeOutTask.method10363(var0, Login_response1, CollisionMap.loginBoxCenter * -1998333989, var71, 16776960, 0);
                  var71 += 15;
                  FadeOutTask.method10363(var0, Login_response2, -1998333989 * CollisionMap.loginBoxCenter, var71, 16776960, 0);
                  var71 += 15;
                  FadeOutTask.method10363(var0, Login_response3, CollisionMap.loginBoxCenter * -1998333989, var71, 16776960, 0);
                  int var124 = CollisionMap.loginBoxCenter * -1998333989 - 150;
                  var71 += 10;

                  for (int var156 = 0; var156 < 8; var156++) {
                     World.titlebuttonSprite.method12433(var124, var71, 30, 40);
                     boolean var175 = 465659907 * field386 == var156 & client.cycle * 1759706017 % 40 < 20;
                     var0.method10402(
                        (field387[var156] == null ? "" : field387[var156]) + (var175 ? class144.colorStartTag(16776960, 880400886) + classDF.field1347 : ""),
                        var124 + 10,
                        var71 + 27,
                        16777215,
                        0
                     );
                     if (var156 != 1 && 3 != var156) {
                        var124 += 35;
                     } else {
                        var124 += 50;
                        var0.method10402(AbstractFont.escapeBrackets("/"), var124 - 13, var71 + 27, 16777215, 0);
                     }
                  }

                  int var157 = CollisionMap.loginBoxCenter * -1998333989 - 80;
                  short var176 = 321;
                  World.titlebuttonSprite.drawAt(var157 - 73, var176 - 20);
                  FadeOutTask.method10363(var0, "Submit", var157, var176 + 5, 16777215, 0);
                  var157 = 80 + CollisionMap.loginBoxCenter * -1998333989;
                  World.titlebuttonSprite.drawAt(var157 - 73, var176 - 20);
                  FadeOutTask.method10363(var0, Strings.field5137, var157, 5 + var176, 16777215, 0);
               } else {
                  int var67 = 216;
                  FadeOutTask.method10363(var0, Strings.field5138, loginBoxX * 743318851 + 180, var67, 16776960, 0);
                  var67 += 15;
                  FadeOutTask.method10363(var2, Strings.field5146, 180 + loginBoxX * 743318851, var67, 16776960, 0);
                  var67 += 15;
                  FadeOutTask.method10363(var2, Strings.field5140, 180 + 743318851 * loginBoxX, var67, 16776960, 0);
                  var67 += 15;
                  int var122 = 180 + 743318851 * loginBoxX - 80;
                  short var155 = 321;
                  World.titlebuttonSprite.drawAt(var122 - 73, var155 - 20);
                  FadeOutTask.method10363(var0, Strings.field5141, var122, var155 + 5, 16777215, 0);
                  var122 = 80 + loginBoxX * 743318851 + 180;
                  World.titlebuttonSprite.drawAt(var122 - 73, var155 - 20);
                  FadeOutTask.method10363(var0, Strings.field5066, var122, var155 + 5, 16777215, 0);
               }
            } else if (-1614560929 * loginIndex == 8) {
               int var75 = 216;
               FadeOutTask.method10363(var0, Strings.field4994, 180 + 743318851 * loginBoxX, var75, 16776960, 0);
               var75 += 15;
               FadeOutTask.method10363(var2, Strings.field4995, loginBoxX * 743318851 + 180, var75, 16776960, 0);
               var75 += 15;
               FadeOutTask.method10363(var2, Strings.field4892, loginBoxX * 743318851 + 180, var75, 16776960, 0);
               var75 += 15;
               int var125 = 743318851 * loginBoxX + 180 - 80;
               short var159 = 321;
               World.titlebuttonSprite.drawAt(var125 - 73, var159 - 20);
               FadeOutTask.method10363(var0, Strings.field4997, var125, var159 + 5, 16777215, 0);
               var125 = 743318851 * loginBoxX + 180 + 80;
               World.titlebuttonSprite.drawAt(var125 - 73, var159 - 20);
               FadeOutTask.method10363(var0, Strings.field5066, var125, 5 + var159, 16777215, 0);
            } else if (9 == loginIndex * -1614560929) {
               int var79 = 221;
               FadeOutTask.method10363(var0, Login_response1, 180 + loginBoxX * 743318851, var79, 16776960, 0);
               var79 += 25;
               FadeOutTask.method10363(var0, Login_response2, 180 + loginBoxX * 743318851, var79, 16776960, 0);
               var79 += 25;
               FadeOutTask.method10363(var0, Login_response3, 180 + 743318851 * loginBoxX, var79, 16776960, 0);
               int var127 = 180 + 743318851 * loginBoxX;
               short var160 = 311;
               World.titlebuttonSprite.drawAt(var127 - 73, var160 - 20);
               FadeOutTask.method10363(var0, Strings.field5106, var127, 5 + var160, 16777215, 0);
            } else if (-1614560929 * loginIndex == 10) {
               int var82 = 743318851 * loginBoxX + 180;
               int var128 = 209;
               FadeOutTask.method10363(var0, Strings.field5005, 743318851 * loginBoxX + 180, var128, 16776960, 0);
               var128 += 20;
               classLX.field3801.drawAt(var82 - 109, var128);
               if (displayName.isEmpty()) {
                  TriBool.field5954.drawAt(var82 - 48, 18 + var128);
               } else {
                  TriBool.field5954.drawAt(var82 - 48, 5 + var128);
                  FadeOutTask.method10363(var0, displayName, var82, 68 + var128 - 15, 16776960, 0);
               }
            } else if (12 == loginIndex * -1614560929) {
               int var83 = -1998333989 * CollisionMap.loginBoxCenter;
               int var130 = 216;
               FadeOutTask.method10363(var2, Strings.field5145, var83, var130, 16777215, 0);
               var130 += 17;
               FadeOutTask.method10363(var2, Strings.field4996, var83, var130, 16777215, 0);
               var130 += 17;
               FadeOutTask.method10363(var2, Strings.field4865, var83, var130, 16777215, 0);
               var130 += 17;
               FadeOutTask.method10363(var2, Strings.field5148, var83, var130, 16777215, 0);
               var83 = -1998333989 * CollisionMap.loginBoxCenter - 80;
               short var134 = 311;
               World.titlebuttonSprite.drawAt(var83 - 73, var134 - 20);
               FadeOutTask.method10363(var0, Strings.field5102, var83, 5 + var134, 16777215, 0);
               var83 = CollisionMap.loginBoxCenter * -1998333989 + 80;
               World.titlebuttonSprite.drawAt(var83 - 73, var134 - 20);
               FadeOutTask.method10363(var0, Strings.field5152, var83, 5 + var134, 16777215, 0);
            } else if (13 == loginIndex * -1614560929) {
               int var86 = 231;
               FadeOutTask.method10363(var2, Strings.field5149, 743318851 * loginBoxX + 180, var86, 16777215, 0);
               var86 += 20;
               FadeOutTask.method10363(var2, Strings.field5150, loginBoxX * 743318851 + 180, var86, 16777215, 0);
               int var135 = loginBoxX * 743318851 + 180;
               short var88 = 311;
               World.titlebuttonSprite.drawAt(var135 - 73, var88 - 20);
               FadeOutTask.method10363(var0, Strings.field5066, var135, var88 + 5, 16777215, 0);
            } else if (14 == loginIndex * -1614560929) {
               int var89 = 201;
               String var136 = "";
               String var161 = "";
               String var177 = "";
               switch (Login_banType * -1858173113) {
                  case 0:
                     var136 = Strings.field4907;
                     var161 = Strings.field4908;
                     var177 = Strings.field4909;
                     break;
                  case 1:
                     var136 = Strings.field4946;
                     var161 = Strings.field4947;
                     var177 = Strings.field4948;
                     break;
                  case 2:
                     var136 = Strings.field4982;
                     var161 = Strings.field4983;
                     var177 = Strings.field4984;
                     break;
                  default:
                     SpotAnimationDefinition.Login_promptCredentials(false, (short)-1915);
               }

               FadeOutTask.method10363(var0, var136, 180 + 743318851 * loginBoxX, var89, 16776960, 0);
               var89 += 20;
               FadeOutTask.method10363(var0, var161, 180 + loginBoxX * 743318851, var89, 16776960, 0);
               var89 += 20;
               FadeOutTask.method10363(var0, var177, 180 + loginBoxX * 743318851, var89, 16776960, 0);
               int var189 = loginBoxX * 743318851 + 180;
               short var194 = 276;
               World.titlebuttonSprite.drawAt(var189 - 73, var194 - 20);
               if (Login_banType * -1858173113 == 1) {
                  FadeOutTask.method10363(var0, Strings.field4891, var189, var194 + 5, 16777215, 0);
               } else {
                  FadeOutTask.method10363(var0, Strings.field4890, var189, var194 + 5, 16777215, 0);
               }

               var189 = 180 + 743318851 * loginBoxX;
               var194 = 326;
               World.titlebuttonSprite.drawAt(var189 - 73, var194 - 20);
               FadeOutTask.method10363(var0, Strings.field5066, var189, 5 + var194, 16777215, 0);
            } else if (24 == -1614560929 * loginIndex) {
               int var92 = 221;
               FadeOutTask.method10363(var0, Login_response1, 180 + 743318851 * loginBoxX, var92, 16777215, 0);
               var92 += 15;
               FadeOutTask.method10363(var0, Login_response2, 743318851 * loginBoxX + 180, var92, 16777215, 0);
               var92 += 15;
               FadeOutTask.method10363(var0, Login_response3, loginBoxX * 743318851 + 180, var92, 16777215, 0);
               var92 += 15;
               int var137 = 743318851 * loginBoxX + 180;
               short var162 = 301;
               World.titlebuttonSprite.drawAt(var137 - 73, var162 - 20);
               FadeOutTask.method10363(var0, Strings.field5110, var137, 5 + var162, 16777215, 0);
            } else if (32 == -1614560929 * loginIndex) {
               int var96 = 216;
               FadeOutTask.method10363(var0, Strings.field5138, 180 + 743318851 * loginBoxX, var96, 16776960, 0);
               var96 += 15;
               FadeOutTask.method10363(var2, Strings.field5146, loginBoxX * 743318851 + 180, var96, 16776960, 0);
               var96 += 15;
               FadeOutTask.method10363(var2, Strings.field5140, loginBoxX * 743318851 + 180, var96, 16776960, 0);
               var96 += 15;
               int var138 = 180 + 743318851 * loginBoxX - 80;
               short var163 = 321;
               World.titlebuttonSprite.drawAt(var138 - 73, var163 - 20);
               FadeOutTask.method10363(var0, Strings.field5141, var138, var163 + 5, 16777215, 0);
               var138 = 80 + 743318851 * loginBoxX + 180;
               World.titlebuttonSprite.drawAt(var138 - 73, var163 - 20);
               FadeOutTask.method10363(var0, Strings.field5066, var138, var163 + 5, 16777215, 0);
            } else if (33 == -1614560929 * loginIndex) {
               int var100 = 201;
               FadeOutTask.method10363(var0, Login_response1, 743318851 * loginBoxX + 180, var100, 16776960, 0);
               var100 += 20;
               FadeOutTask.method10363(var1, Login_response2, loginBoxX * 743318851 + 180, var100, 16776960, 0);
               var100 += 20;
               FadeOutTask.method10363(var1, Login_response3, 180 + loginBoxX * 743318851, var100, 16776960, 0);
               var100 += 15;
               int var140 = 180 + 743318851 * loginBoxX;
               short var164 = 276;
               World.titlebuttonSprite.drawAt(var140 - 73, var164 - 20);
               FadeOutTask.method10363(var2, Strings.field5165, var140, var164 + 5, 16777215, 0);
               var140 = 180 + loginBoxX * 743318851;
               var164 = 326;
               World.titlebuttonSprite.drawAt(var140 - 73, var164 - 20);
               FadeOutTask.method10363(var2, Strings.field5066, var140, var164 + 5, 16777215, 0);
            } else if (loginIndex * -1614560929 == 34) {
               int var104 = 201;
               FadeOutTask.method10363(var0, Login_response1, 743318851 * loginBoxX + 180, var104, 16776960, 0);
               var104 += 20;
               FadeOutTask.method10363(var1, Login_response2, 180 + loginBoxX * 743318851, var104, 16776960, 0);
               var104 += 20;
               FadeOutTask.method10363(var1, Login_response3, 180 + loginBoxX * 743318851, var104, 16776960, 0);
               int var142 = 743318851 * loginBoxX + 180;
               short var166 = 276;
               World.titlebuttonSprite.drawAt(var142 - 73, var166 - 20);
               String var178 = null != Huffman.World_request ? Strings.field5162 : Strings.field5135;
               FadeOutTask.method10363(var2, var178, var142, var166 + 5, 16777215, 0);
               var142 = loginBoxX * 743318851 + 180;
               var166 = 326;
               World.titlebuttonSprite.drawAt(var142 - 73, var166 - 20);
               FadeOutTask.method10363(var2, Strings.field5066, var142, var166 + 5, 16777215, 0);
            }
         }

         if (client.gameState * 1271535343 >= 10) {
            int[] var107 = new int[4];
            Rasterizer2D.Rasterizer2D_getClipArray(var107);
            Rasterizer2D.Rasterizer2D_setClip(921778921 * xPadding, 0, 765 + xPadding * 921778921, class374.canvasHeight * 19292887);
            LoginScreenAnimation.method1353(class204.loginScreenRunesAnimation, xPadding * 921778921 - 22, 1759706017 * client.cycle, -2051261727);
            LoginScreenAnimation.method1353(class204.loginScreenRunesAnimation, 22 + 765 + xPadding * 921778921 - 128, 1759706017 * client.cycle, -366898973);
            Rasterizer2D.Rasterizer2D_setClipArray(var107);
         }

         FadeOutTask.title_muteSprite[class468.clientPreferences.isTitleMusicDisabled(-1169576018) ? 1 : 0].drawAt(765 + xPadding * 921778921 - 40, 463);
         if (client.gameState * 1271535343 > 5 && class352.clientLanguage == Language.Language_EN) {
            if (ModelData0.field3492 != null) {
               int var108 = xPadding * 921778921 + 5;
               short var144 = 463;
               byte var168 = 100;
               byte var179 = 35;
               ModelData0.field3492.drawAt(var108, var144);
               FadeOutTask.method10363(var0, Strings.field5035 + " " + 1312022025 * client.worldId, var108 + var168 / 2, var144 + var179 / 2 - 2, 16777215, 0);
               if (null != Huffman.World_request) {
                  FadeOutTask.method10363(var1, Strings.field5162, var108 + var168 / 2, var179 / 2 + var144 + 12, 16777215, 0);
               } else {
                  FadeOutTask.method10363(var1, Strings.field5163, var168 / 2 + var108, var144 + var179 / 2 + 12, 16777215, 0);
               }
            } else {
               ModelData0.field3492 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(class147.archive8, "sl_button", "", 1986885224);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("cu")
   static void method1239(String var0, String var1, String var2) {
      class30.method1308(7, -1563751062);
      class525.setLoginResponseString(var0, var1, var2, (byte)1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dy")
   static void method1267() {
      class30.method1308(24, 1774075201);
      class525.setLoginResponseString(Strings.field5090, Strings.field4932, Strings.field5092, (byte)1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dc")
   static void method1268() {
      class30.method1308(24, 822791132);
      class525.setLoginResponseString(Strings.field5090, Strings.field4932, Strings.field5092, (byte)1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;)I")
   @ObfuscatedName("bb")
   static int method1217(AbstractArchive var0) {
      int var1 = field405.length + field383.length;
      String[] var2 = field407;

      for (int var3 = 0; var3 < var2.length; var3++) {
         String var4 = var2[var3];
         if (var0.groupLoadPercentByName(var4, (byte)-97) != -1) {
            var1++;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dt")
   static void method1269(int var0) {
      if (-1614560929 * loginIndex != var0) {
         loginIndex = var0 * 625007263;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dh")
   static void method1270(int var0) {
      if (-1614560929 * loginIndex != var0) {
         loginIndex = var0 * 625007263;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)V")
   @ObfuscatedName("dz")
   static void method1272(int var0, String var1) {
      Login_loadingText = var1;
      Login_loadingPercent = -2106710917 * var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)V")
   @ObfuscatedName("di")
   static void method1273(int var0, String var1) {
      Login_loadingText = var1;
      Login_loadingPercent = -1451974971 * var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bl")
   static void method1232() {
      Login_username = Login_username.trim();
      if (Login_username.isEmpty()) {
         class525.setLoginResponseString(Strings.field4973, Strings.field4974, Strings.field5105, (byte)1);
      } else if (Login_password.isEmpty()) {
         class525.setLoginResponseString(Strings.field5130, Strings.field4977, Strings.field4911, (byte)1);
      } else {
         class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
         classFR.method4050(false, -855325319);
         WorldMapSectionType.updateGameState(20, (byte)45);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cp")
   static void method1251(boolean var0) {
      byte var1 = 0;
      boolean var2 = class468.clientPreferences.getEULA((byte)-82) >= 744188887 * client.field715;
      if (!var2) {
         var1 = 12;
      } else if (SecureUrlRequester.client.containsAccessAndRefreshToken(-1706668562)
         || SecureUrlRequester.client.otlTokenRequesterInitialized((byte)-59)
         || SecureUrlRequester.client.containsSessionAndCharacterId(-1451303)) {
         var1 = 10;
      }

      class30.method1308(var1, 2019506282);
      if (var0) {
         Login_username = "";
         Login_password = "";
         class28.otpMedium = 0;
         UserComparator6.otp = "";
      }

      if (Login_username == null || Login_username.isEmpty()) {
         if (class468.clientPreferences.getRememberedUsername(260634362) != null) {
            Login_username = class468.clientPreferences.getRememberedUsername(192481540);
            client.Login_isUsernameRemembered = true;
         } else {
            client.Login_isUsernameRemembered = false;
         }
      }

      WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
   }
}
