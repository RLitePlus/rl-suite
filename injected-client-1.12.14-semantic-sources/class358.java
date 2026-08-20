import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("nx")
public class class358 extends Node {
   @ObfuscatedName("at")
   int field4363;
   @ToRemove(unused = "true")
   @ObfuscatedName("ds")
   static final int field4365 = 4;
   @ObfuscatedName("ae")
   public static short[] field4366;
   @ObfuscatedName("av")
   BitSet field4362;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field4364 = 16384;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltz;)Lxv;")
   @ObfuscatedName("tl")
   public static Username method7865(User var0) {
      return var0.username;
   }

   @ObfuscatedSignature(descriptor = "(II)Lnb;")
   @ObfuscatedName("ak")
   public static class343 method7866(int var0, int var1) {
      try {
         return class343.field4182[var0];
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "nx.ak(" + ')');
      }
   }

   class358(int var1) {
      this.field4363 = var1 * -1052420909;
      this.field4362 = new BitSet(128);
   }

   @ObfuscatedSignature(descriptor = "(Lbm;Lsu;Lsu;B)V")
   @ObfuscatedName("aj")
   static void loginScreen(GameEngine var0, Font var1, Font var2, byte var3) {
      try {
         if (Login.worldSelectOpen) {
            if (var3 == 0) {
               class180.method4264(var0, -971373656);
            }
         } else {
            if ((1 == MouseHandler.MouseHandler_lastButton * 1721626731 || !UrlRequest.mouseCam && 1721626731 * MouseHandler.MouseHandler_lastButton == 4)
               && MouseHandler.MouseHandler_lastPressedX * -1018773713 >= 765 + 921778921 * Login.xPadding - 50
               && -261967643 * MouseHandler.MouseHandler_lastPressedY >= 453) {
               if (var3 != 0) {
                  return;
               }

               if (MouseHandler.MouseHandler_lastPressedX * -1018773713 < 765 + Login.xPadding * 921778921
                  && -261967643 * MouseHandler.MouseHandler_lastPressedY < 503) {
                  class468.clientPreferences.updateTitleMusicDisabled(!class468.clientPreferences.isTitleMusicDisabled(2002323805), 164501916);
                  if (class468.clientPreferences.isTitleMusicDisabled(1471391266)) {
                     classGK.method4244(0, 0, 969246232);
                  } else {
                     class148.method4143("scape main", 255, -423241027);
                  }

                  class179.method4237(-1931393605);
               }
            }

            if (1271535343 * client.gameState != 5) {
               if (4427354477760720883L * Login.field389 == -1L) {
                  Login.field389 = (ParamComposition.method4949((byte)15) + 1000L) * 4776144791020339515L;
               }

               long var4;
               boolean var6;
               label1395: {
                  var4 = ParamComposition.method4949((byte)15);
                  if (null != client.archiveLoaders) {
                     if (client.archiveLoadersDone * -251416631 < client.archiveLoaders.size()) {
                        while (client.archiveLoadersDone * -251416631 < client.archiveLoaders.size()) {
                           ArchiveLoader var7 = (ArchiveLoader)client.archiveLoaders.get(client.archiveLoadersDone * -251416631);
                           if (!ArchiveLoader.method2858(var7, (byte)-33)) {
                              var6 = false;
                              break label1395;
                           }

                           client.archiveLoadersDone += -2132043143;
                        }

                        var6 = true;
                        break label1395;
                     }

                     if (var3 != 0) {
                        return;
                     }
                  }

                  var6 = true;
               }

               if (var6 && -1L == 9079282278280122649L * Login.field390) {
                  Login.field390 = 1917473899848792873L * var4;
                  if (Login.field390 * 9079282278280122649L > 4427354477760720883L * Login.field389) {
                     if (var3 != 0) {
                        return;
                     }

                     Login.field389 = Login.field390 * 4881547957185595843L;
                  }
               }

               if (client.gameState * 1271535343 != 10) {
                  if (var3 != 0) {
                     return;
                  }

                  if (11 != client.gameState * 1271535343) {
                     return;
                  }
               }

               if (Language.Language_EN == class352.clientLanguage) {
                  label1379: {
                     if (1 != MouseHandler.MouseHandler_lastButton * 1721626731) {
                        if (UrlRequest.mouseCam || 4 != MouseHandler.MouseHandler_lastButton * 1721626731) {
                           break label1379;
                        }

                        if (var3 != 0) {
                           return;
                        }
                     }

                     int var27 = Login.xPadding * 921778921 + 5;
                     short var8 = 463;
                     byte var9 = 100;
                     byte var10 = 35;
                     if (MouseHandler.MouseHandler_lastPressedX * -1018773713 >= var27 && -1018773713 * MouseHandler.MouseHandler_lastPressedX <= var9 + var27) {
                        if (var3 != 0) {
                           return;
                        }

                        if (MouseHandler.MouseHandler_lastPressedY * -261967643 >= var8) {
                           if (var3 != 0) {
                              return;
                           }

                           if (MouseHandler.MouseHandler_lastPressedY * -261967643 <= var8 + var10) {
                              classGP.method4261((short)10015);
                              return;
                           }
                        }
                     }
                  }

                  if (null != Huffman.World_request) {
                     classGP.method4261((short)21533);
                  }
               }

               int var28 = 1721626731 * MouseHandler.MouseHandler_lastButton;
               int var29 = -1018773713 * MouseHandler.MouseHandler_lastPressedX;
               int var30 = MouseHandler.MouseHandler_lastPressedY * -261967643;
               if (0 == var28) {
                  var29 = 1856325427 * MouseHandler.MouseHandler_x;
                  var30 = -1427762751 * MouseHandler.MouseHandler_y;
               }

               if (!UrlRequest.mouseCam && var28 == 4) {
                  var28 = 1;
               }

               IndexCheck var31 = HttpRequest.method280((byte)1);
               if (0 == -1614560929 * Login.loginIndex) {
                  if (var3 != 0) {
                     return;
                  }

                  boolean var64 = false;

                  while (var31.method6510((byte)-74)) {
                     if (2044709447 * var31.field3386 == 84) {
                        var64 = true;
                     }
                  }

                  int var93 = -1998333989 * CollisionMap.loginBoxCenter - 80;
                  short var105 = 291;
                  if (1 == var28 && var29 >= var93 - 75 && var29 <= var93 + 75 && var30 >= var105 - 20 && var30 <= 20 + var105) {
                     if (var3 != 0) {
                        return;
                     }

                     class558.openURL(
                        EnumComposition.method4474("secure", true, 712653874) + "m=account-creation/g=oldscape/create_account_funnel.ws", (short)578
                     );
                  }

                  label1258: {
                     var93 = -1998333989 * CollisionMap.loginBoxCenter + 80;
                     if (1 == var28) {
                        if (var3 != 0) {
                           return;
                        }

                        if (var29 >= var93 - 75 && var29 <= 75 + var93 && var30 >= var105 - 20 && var30 <= var105 + 20) {
                           break label1258;
                        }
                     }

                     if (!var64) {
                        return;
                     }
                  }

                  if (class57.method1370(1003323912)) {
                     WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
                  } else {
                     SpotAnimationDefinition.Login_promptCredentials(false, (short)-4134);
                  }
               } else if (-1614560929 * Login.loginIndex == 1) {
                  boolean var129;
                  label1131: {
                     if (!SecureUrlRequester.client.containsAccessAndRefreshToken(-729716057)) {
                        if (var3 != 0) {
                           return;
                        }

                        if (!SecureUrlRequester.client.otlTokenRequesterInitialized((byte)-10)) {
                           if (var3 != 0) {
                              return;
                           }

                           if (!SecureUrlRequester.client.containsSessionAndCharacterId(1755357419)) {
                              var129 = false;
                              break label1131;
                           }

                           if (var3 != 0) {
                              return;
                           }
                        }
                     }

                     var129 = true;
                  }

                  boolean var63 = var129;

                  while (var31.method6510((byte)-87)) {
                     if (84 == var31.field3386 * 2044709447) {
                        if (var63) {
                           class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
                           client.field889 = class604.field6589;
                           classFR.method4050(false, 228245989);
                           WorldMapSectionType.updateGameState(20, (byte)45);
                        } else {
                           SpotAnimationDefinition.Login_promptCredentials(false, (short)-23468);
                        }

                        return;
                     }

                     if (13 == var31.field3386 * 2044709447) {
                        if (var3 != 0) {
                           return;
                        }

                        class586.updateLoginStatusUsernameRemembered(true, -509020060);
                        return;
                     }
                  }

                  int var91 = -1998333989 * CollisionMap.loginBoxCenter - 80;
                  short var104 = 321;
                  if (var28 == 1 && var29 >= var91 - 75 && var29 <= 75 + var91) {
                     if (var3 != 0) {
                        return;
                     }

                     if (var30 >= var104 - 20 && var30 <= var104 + 20) {
                        if (var63) {
                           if (var3 != 0) {
                              return;
                           }

                           class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
                           client.field889 = class604.field6589;
                           classFR.method4050(false, -1507599734);
                           WorldMapSectionType.updateGameState(20, (byte)45);
                        } else {
                           SpotAnimationDefinition.Login_promptCredentials(false, (short)-12924);
                        }

                        return;
                     }
                  }

                  var91 = 80 + CollisionMap.loginBoxCenter * -1998333989;
                  if (1 == var28 && var29 >= var91 - 75) {
                     if (var3 != 0) {
                        return;
                     }

                     if (var29 <= var91 + 75) {
                        if (var3 != 0) {
                           return;
                        }

                        if (var30 >= var104 - 20 && var30 <= 20 + var104) {
                           if (var3 != 0) {
                              return;
                           }

                           class586.updateLoginStatusUsernameRemembered(true, -17190455);
                           return;
                        }
                     }
                  }
               } else if (Login.loginIndex * -1614560929 == 2) {
                  int var58 = 201;
                  var58 += 52;
                  if (var28 == 1) {
                     if (var3 != 0) {
                        return;
                     }

                     if (var30 >= var58 - 12 && var30 < 2 + var58) {
                        Login.currentLoginField = 0;
                     }
                  }

                  var58 += 15;
                  if (1 == var28 && var30 >= var58 - 12 && var30 < var58 + 2) {
                     Login.currentLoginField = -1340850443;
                  }

                  var58 += 15;
                  short var62 = 361;
                  if (class181.field2057 != null) {
                     if (var3 != 0) {
                        return;
                     }

                     int var86 = class181.field2057.lowX * -434199641 / 2;
                     if (var28 == 1 && var29 >= -316755897 * class181.field2057.highY - var86 && var29 <= var86 + class181.field2057.highY * -316755897) {
                        if (var3 != 0) {
                           return;
                        }

                        if (var30 >= var62 - 15 && var30 < var62) {
                           switch (Login.field399 * 1340994199) {
                              case 1:
                                 class558.openURL(Strings.field4980, (short)4952);
                                 return;
                              case 2:
                                 class558.openURL("https://support.runescape.com/hc/en-gb", (short)696);
                           }
                        }
                     }
                  }

                  int var87 = CollisionMap.loginBoxCenter * -1998333989 - 80;
                  short var101 = 321;
                  if (var28 == 1) {
                     if (var3 != 0) {
                        return;
                     }

                     if (var29 >= var87 - 75 && var29 <= 75 + var87 && var30 >= var101 - 20 && var30 <= var101 + 20) {
                        classPC.method8714(-983768802);
                        return;
                     }
                  }

                  var87 = 743318851 * Login.loginBoxX + 180 + 80;
                  if (1 == var28 && var29 >= var87 - 75 && var29 <= var87 + 75 && var30 >= var101 - 20) {
                     if (var3 != 0) {
                        return;
                     }

                     if (var30 <= 20 + var101) {
                        class30.method1308(0, -587319620);
                        Login.Login_username = "";
                        client.method2115(-1);
                        Login.Login_password = "";
                        class28.otpMedium = 0;
                        UserComparator6.otp = "";
                        Login.rememberUsername = true;
                     }
                  }

                  var87 = -1998333989 * CollisionMap.loginBoxCenter + -117;
                  var101 = 277;
                  Login.field377 = var29 >= var87
                     && var29 < class164.field1972 * -1436734183 + var87
                     && var30 >= var101
                     && var30 < var101 + 222768869 * TaskHandler.field2444;
                  if (1 == var28 && Login.field377) {
                     client.Login_isUsernameRemembered = !client.Login_isUsernameRemembered;
                     if (!client.Login_isUsernameRemembered) {
                        if (var3 != 0) {
                           return;
                        }

                        if (class468.clientPreferences.getRememberedUsername(566409831) != null) {
                           class468.clientPreferences.updateRememberedUsername(null, (byte)1);
                        }
                     }
                  }

                  var87 = -1998333989 * CollisionMap.loginBoxCenter + 24;
                  var101 = 277;
                  Login.field392 = var29 >= var87
                     && var29 < var87 + -1436734183 * class164.field1972
                     && var30 >= var101
                     && var30 < 222768869 * TaskHandler.field2444 + var101;
                  if (var28 == 1 && Login.field392) {
                     ClientPreferences var10000 = class468.clientPreferences;
                     boolean var10001;
                     if (!ClientPreferences.method1560(class468.clientPreferences, -1176718989)) {
                        if (var3 != 0) {
                           return;
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     ClientPreferences.method1569(var10000, var10001, 1155517918);
                     if (!ClientPreferences.method1560(class468.clientPreferences, 1937044908)) {
                        if (var3 != 0) {
                           return;
                        }

                        Login.Login_username = "";
                        client.method2115(-1);
                        class468.clientPreferences.updateRememberedUsername(null, (byte)1);
                        WorldMapDecoration.focusPasswordWhenUsernameFilled((byte)8);
                     }
                  }

                  label1339:
                  while (var31.method6510((byte)-122)) {
                     if (13 == 2044709447 * var31.field3386) {
                        class30.method1308(0, 792815205);
                        Login.Login_username = "";
                        client.method2115(-1);
                        Login.Login_password = "";
                        class28.otpMedium = 0;
                        UserComparator6.otp = "";
                        Login.rememberUsername = true;
                     } else if (Login.currentLoginField * 244972893 == 0) {
                        char var110 = var31.field3385;
                        int var115 = 0;

                        while (var115 < Login.field398.length() && var110 != Login.field398.charAt(var115)) {
                           var115++;
                        }

                        if (85 == var31.field3386 * 2044709447 && !Login.Login_username.isEmpty()) {
                           if (var3 != 0) {
                              return;
                           }

                           Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                           client.method2115(-1);
                        }

                        if (84 == 2044709447 * var31.field3386 || var31.field3386 * 2044709447 == 80) {
                           Login.currentLoginField = -1340850443;
                        }

                        if (class145.method4148(var31.field3385, (byte)-112)) {
                           if (var3 != 0) {
                              return;
                           }

                           if (Login.Login_username.length() < 320) {
                              Login.Login_username = Login.Login_username + var31.field3385;
                              client.method2115(-1);
                           }
                        }
                     } else if (Login.currentLoginField * 244972893 == 1) {
                        if (var3 != 0) {
                           return;
                        }

                        if (2044709447 * var31.field3386 == 85 && !Login.Login_password.isEmpty()) {
                           Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
                        } else if (84 == 2044709447 * var31.field3386 || 80 == var31.field3386 * 2044709447) {
                           Login.currentLoginField = 0;
                           if (2044709447 * var31.field3386 == 84) {
                              classPC.method8714(-853489998);
                              return;
                           }
                        }

                        label1316: {
                           if (!IndexCheck.method6514(var31, 82, (short)1337)) {
                              if (!IndexCheck.method6514(var31, 87, (short)1337)) {
                                 break label1316;
                              }

                              if (var3 != 0) {
                                 return;
                              }
                           }

                           if (67 == var31.field3386 * 2044709447) {
                              Clipboard var111 = Toolkit.getDefaultToolkit().getSystemClipboard();
                              Transferable var116 = var111.getContents(SecureUrlRequester.client);
                              int var118 = 20 - Login.Login_password.length();
                              if (var118 > 0) {
                                 if (var3 != 0) {
                                    return;
                                 }

                                 try {
                                    String var120 = (String)var116.getTransferData(DataFlavor.stringFlavor);
                                    int var122 = Math.min(var118, var120.length());
                                    int var124 = 0;

                                    while (true) {
                                       if (var124 >= var122) {
                                          Login.Login_password = Login.Login_password + var120.substring(0, var122);
                                          continue label1339;
                                       }

                                       if (!AbstractWorldMapData.method7256(var120.charAt(var124), -580673349)) {
                                          break;
                                       }

                                       if (var3 != 0) {
                                          return;
                                       }

                                       if (!class145.method4148(var120.charAt(var124), (byte)-26)) {
                                          break;
                                       }

                                       var124++;
                                    }

                                    class30.method1308(3, 411992021);
                                    return;
                                 } catch (UnsupportedFlavorException var24) {
                                 } catch (IOException var25) {
                                 }
                              }
                              continue;
                           }
                        }

                        if (AbstractWorldMapData.method7256(var31.field3385, -580673349)) {
                           if (var3 != 0) {
                              return;
                           }

                           if (class145.method4148(var31.field3385, (byte)-121) && Login.Login_password.length() < 20) {
                              Login.Login_password = Login.Login_password + var31.field3385;
                           }
                        }
                     }
                  }
               } else if (Login.loginIndex * -1614560929 == 3) {
                  int var11 = 743318851 * Login.loginBoxX + 180;
                  short var12 = 241;
                  Bounds var13 = var1.method10401(25, Strings.field4906.length() - 34, Strings.field4906, var11, var12);
                  if (var28 == 1 && var13.method9506(var29, var30, 1088416383)) {
                     class558.openURL(Strings.field5166, (short)18818);
                  }

                  var11 = 180 + Login.loginBoxX * 743318851;
                  var12 = 276;
                  if (1 == var28 && var29 >= var11 - 75 && var29 <= var11 + 75 && var30 >= var12 - 20) {
                     if (var3 != 0) {
                        return;
                     }

                     if (var30 <= var12 + 20) {
                        class586.updateLoginStatusUsernameRemembered(false, -1053469112);
                     }
                  }

                  var11 = 180 + 743318851 * Login.loginBoxX;
                  var12 = 326;
                  if (var28 == 1 && var29 >= var11 - 75 && var29 <= 75 + var11 && var30 >= var12 - 20 && var30 <= var12 + 20) {
                     class558.openURL(Strings.field4980, (short)4605);
                     return;
                  }
               } else if (4 == Login.loginIndex * -1614560929) {
                  int var34 = 180 + Login.loginBoxX * 743318851 - 80;
                  short var67 = 321;
                  if (1 == var28 && var29 >= var34 - 75 && var29 <= var34 + 75 && var30 >= var67 - 20 && var30 <= var67 + 20) {
                     if (var3 != 0) {
                        return;
                     }

                     FriendSystem.method471(-396958816);
                     return;
                  }

                  if (var28 == 1 && var29 >= Login.loginBoxX * 743318851 + 180 - 9 && var29 <= 130 + Login.loginBoxX * 743318851 + 180) {
                     if (var3 != 0) {
                        return;
                     }

                     if (var30 >= 263) {
                        if (var3 != 0) {
                           return;
                        }

                        if (var30 <= 296) {
                           Login.rememberUsername = !Login.rememberUsername;
                        }
                     }
                  }

                  if (var28 == 1 && var29 >= 180 + Login.loginBoxX * 743318851 - 34 && var29 <= 180 + 743318851 * Login.loginBoxX + 34) {
                     if (var3 != 0) {
                        return;
                     }

                     if (var30 >= 351 && var30 <= 363) {
                        class558.openURL(Strings.field4980, (short)6997);
                     }
                  }

                  var34 = 80 + 180 + Login.loginBoxX * 743318851;
                  if (1 == var28) {
                     if (var3 != 0) {
                        return;
                     }

                     if (var29 >= var34 - 75 && var29 <= 75 + var34 && var30 >= var67 - 20 && var30 <= 20 + var67) {
                        class30.method1308(0, 531252606);
                        Login.Login_username = "";
                        client.method2115(-1);
                        Login.Login_password = "";
                        class28.otpMedium = 0;
                        UserComparator6.otp = "";
                     }
                  }

                  while (var31.method6510((byte)22)) {
                     boolean var95 = false;

                     for (int var14 = 0; var14 < Login.field396.length(); var14++) {
                        if (var31.field3385 == Login.field396.charAt(var14)) {
                           var95 = true;
                           break;
                        }
                     }

                     if (var31.field3386 * 2044709447 == 13) {
                        class30.method1308(0, 1777179467);
                        Login.Login_username = "";
                        client.method2115(-1);
                        Login.Login_password = "";
                        class28.otpMedium = 0;
                        UserComparator6.otp = "";
                     } else {
                        if (2044709447 * var31.field3386 == 85 && !UserComparator6.otp.isEmpty()) {
                           UserComparator6.otp = UserComparator6.otp.substring(0, UserComparator6.otp.length() - 1);
                        }

                        if (var31.field3386 * 2044709447 == 84) {
                           FriendSystem.method471(1851311611);
                           return;
                        }

                        if (var95 && UserComparator6.otp.length() < 6) {
                           if (var3 != 0) {
                              return;
                           }

                           UserComparator6.otp = UserComparator6.otp + var31.field3385;
                        }
                     }
                  }
               } else if (5 == Login.loginIndex * -1614560929) {
                  int var36 = 180 + Login.loginBoxX * 743318851 - 80;
                  short var68 = 321;
                  if (var28 == 1 && var29 >= var36 - 75) {
                     if (var3 != 0) {
                        return;
                     }

                     if (var29 <= var36 + 75 && var30 >= var68 - 20 && var30 <= var68 + 20) {
                        class299.performLoginRequest(1398379748);
                        return;
                     }
                  }

                  var36 = 180 + 743318851 * Login.loginBoxX + 80;
                  if (var28 == 1 && var29 >= var36 - 75 && var29 <= 75 + var36 && var30 >= var68 - 20 && var30 <= var68 + 20) {
                     SpotAnimationDefinition.Login_promptCredentials(true, (short)-30566);
                  }

                  short var96 = 361;
                  if (WorldMapElement.field2221 != null) {
                     if (var3 != 0) {
                        return;
                     }

                     int var106 = -434199641 * WorldMapElement.field2221.lowX / 2;
                     if (1 == var28
                        && var29 >= -316755897 * WorldMapElement.field2221.highY - var106
                        && var29 <= WorldMapElement.field2221.highY * -316755897 + var106
                        && var30 >= var96 - 15) {
                        if (var3 != 0) {
                           return;
                        }

                        if (var30 < var96) {
                           class558.openURL(EnumComposition.method4474("secure", true, -793247914) + "m=weblogin/g=oldscape/cant_log_in", (short)-611);
                        }
                     }
                  }

                  while (var31.method6510((byte)-124)) {
                     boolean var107 = false;

                     for (int var15 = 0; var15 < Login.field398.length(); var15++) {
                        if (var3 != 0) {
                           return;
                        }

                        if (var31.field3385 == Login.field398.charAt(var15)) {
                           var107 = true;
                           break;
                        }
                     }

                     if (2044709447 * var31.field3386 == 13) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-12428);
                     } else {
                        if (85 == var31.field3386 * 2044709447 && !Login.Login_username.isEmpty()) {
                           Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                           client.method2115(-1);
                        }

                        if (84 == 2044709447 * var31.field3386) {
                           class299.performLoginRequest(-1074385355);
                           return;
                        }

                        if (var107 && Login.Login_username.length() < 320) {
                           Login.Login_username = Login.Login_username + var31.field3385;
                           client.method2115(-1);
                        }
                     }
                  }
               } else if (6 != -1614560929 * Login.loginIndex) {
                  if (7 == Login.loginIndex * -1614560929) {
                     if (Frames.field3189) {
                        if (var3 != 0) {
                           return;
                        }

                        if (!client.onMobile) {
                           int var41 = -1998333989 * CollisionMap.loginBoxCenter - 150;
                           int var70 = var41 + 240 + 25 + 40;
                           short var97 = 231;
                           int var108 = var97 + 40;
                           if (1 == var28) {
                              if (var3 != 0) {
                                 return;
                              }

                              if (var29 >= var41 && var29 <= var70 && var30 >= var97 && var30 <= var108) {
                                 Login.field386 = classRE.method9417(var41, var29, (byte)90) * 262832811;
                              }
                           }

                           int var112 = 180 + 743318851 * Login.loginBoxX - 80;
                           short var16 = 321;
                           if (1 == var28 && var29 >= var112 - 75 && var29 <= 75 + var112 && var30 >= var16 - 20 && var30 <= 20 + var16) {
                              boolean var17;
                              label1200: {
                                 Date var18;
                                 try {
                                    var18 = class356.method7762(2011786078);
                                 } catch (ParseException var23) {
                                    WorldMapEvent.method7541(
                                       "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 737657141
                                    );
                                    var17 = false;
                                    break label1200;
                                 }

                                 if (var18 == null) {
                                    var17 = false;
                                 } else {
                                    Calendar var20 = Calendar.getInstance();
                                    var20.set(1, var20.get(1) - 13);
                                    var20.set(5, var20.get(5) + 1);
                                    var20.set(11, 0);
                                    var20.set(12, 0);
                                    var20.set(13, 0);
                                    var20.set(14, 0);
                                    Date var21 = var20.getTime();
                                    boolean var19 = var18.before(var21);
                                    boolean var126 = class4.method74(var18, -848273070);
                                    if (!var126) {
                                       WorldMapEvent.method7541(
                                          "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 1401647963
                                       );
                                       var17 = false;
                                    } else {
                                       if (!var19) {
                                          class67.field1275 = -325447997;
                                       } else {
                                          class67.field1275 = (int)(var18.getTime() / 86400000L - 11745L) * -1310330563;
                                       }

                                       var17 = true;
                                    }
                                 }
                              }

                              if (var17) {
                                 WorldMapSectionType.updateGameState(50, (byte)45);
                                 return;
                              }
                           }

                           var112 = 80 + 180 + Login.loginBoxX * 743318851;
                           if (1 == var28 && var29 >= var112 - 75) {
                              if (var3 != 0) {
                                 return;
                              }

                              if (var29 <= 75 + var112) {
                                 if (var3 != 0) {
                                    return;
                                 }

                                 if (var30 >= var16 - 20 && var30 <= 20 + var16) {
                                    if (var3 != 0) {
                                       return;
                                    }

                                    Login.field387 = new String[8];
                                    SpotAnimationDefinition.Login_promptCredentials(true, (short)3109);
                                 }
                              }
                           }

                           do {
                              if (!var31.method6510((byte)-75)) {
                                 return;
                              }

                              if (101 == 2044709447 * var31.field3386) {
                                 Login.field387[465659907 * Login.field386] = null;
                              }

                              if (85 == 2044709447 * var31.field3386) {
                                 if (Login.field387[465659907 * Login.field386] == null && Login.field386 * 465659907 > 0) {
                                    Login.field386 -= 262832811;
                                 }

                                 Login.field387[465659907 * Login.field386] = null;
                              }

                              if (var31.field3385 >= '0' && var31.field3385 <= '9') {
                                 Login.field387[465659907 * Login.field386] = "" + var31.field3385;
                                 if (Login.field386 * 465659907 < 7) {
                                    Login.field386 += 262832811;
                                 }
                              }
                           } while (2044709447 * var31.field3386 != 84);

                           boolean var119;
                           label1111: {
                              Date var121;
                              try {
                                 var121 = class356.method7762(2073894590);
                              } catch (ParseException var22) {
                                 WorldMapEvent.method7541(
                                    "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 1379007562
                                 );
                                 var119 = false;
                                 break label1111;
                              }

                              if (null == var121) {
                                 var119 = false;
                              } else {
                                 Calendar var125 = Calendar.getInstance();
                                 var125.set(1, var125.get(1) - 13);
                                 var125.set(5, var125.get(5) + 1);
                                 var125.set(11, 0);
                                 var125.set(12, 0);
                                 var125.set(13, 0);
                                 var125.set(14, 0);
                                 Date var127 = var125.getTime();
                                 boolean var123 = var121.before(var127);
                                 boolean var128 = class4.method74(var121, -1893111680);
                                 if (!var128) {
                                    WorldMapEvent.method7541(
                                       "Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -560765723
                                    );
                                    var119 = false;
                                 } else {
                                    if (!var123) {
                                       class67.field1275 = -325447997;
                                    } else {
                                       class67.field1275 = (int)(var121.getTime() / 86400000L - 11745L) * -1310330563;
                                    }

                                    var119 = true;
                                 }
                              }
                           }

                           if (var119) {
                              WorldMapSectionType.updateGameState(50, (byte)45);
                           }

                           return;
                        }
                     }

                     int var39 = 743318851 * Login.loginBoxX + 180 - 80;
                     short var69 = 321;
                     if (1 == var28 && var29 >= var39 - 75) {
                        if (var3 != 0) {
                           return;
                        }

                        if (var29 <= 75 + var39 && var30 >= var69 - 20 && var30 <= var69 + 20) {
                           class558.openURL(EnumComposition.method4474("secure", true, 1994630270) + "m=dob/set_dob.ws", (short)-5919);
                           class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                           class30.method1308(6, -1922042094);
                           return;
                        }
                     }

                     var39 = 80 + 180 + 743318851 * Login.loginBoxX;
                     if (var28 == 1 && var29 >= var39 - 75 && var29 <= var39 + 75) {
                        if (var3 != 0) {
                           return;
                        }

                        if (var30 >= var69 - 20) {
                           if (var3 != 0) {
                              return;
                           }

                           if (var30 <= 20 + var69) {
                              SpotAnimationDefinition.Login_promptCredentials(true, (short)-4969);
                           }
                        }
                     }
                  } else if (8 == Login.loginIndex * -1614560929) {
                     int var42 = 743318851 * Login.loginBoxX + 180 - 80;
                     short var71 = 321;
                     if (var28 == 1 && var29 >= var42 - 75) {
                        if (var3 != 0) {
                           return;
                        }

                        if (var29 <= 75 + var42 && var30 >= var71 - 20 && var30 <= 20 + var71) {
                           class558.openURL("https://www.jagex.com/terms/privacy", (short)-2976);
                           class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                           class30.method1308(6, -545015280);
                           return;
                        }
                     }

                     var42 = 80 + 743318851 * Login.loginBoxX + 180;
                     if (1 == var28 && var29 >= var42 - 75 && var29 <= 75 + var42 && var30 >= var71 - 20) {
                        if (var3 != 0) {
                           return;
                        }

                        if (var30 <= var71 + 20) {
                           SpotAnimationDefinition.Login_promptCredentials(true, (short)-8238);
                        }
                     }
                  } else if (-1614560929 * Login.loginIndex == 9) {
                     int var44 = 180 + 743318851 * Login.loginBoxX;
                     short var72 = 311;
                     if (84 != 2044709447 * var31.field3386 && var31.field3386 * 2044709447 != 13) {
                        if (var3 != 0) {
                           return;
                        }

                        if (1 != var28) {
                           return;
                        }

                        if (var3 != 0) {
                           return;
                        }

                        if (var29 < var44 - 75 || var29 > var44 + 75 || var30 < var72 - 20) {
                           return;
                        }

                        if (var3 != 0) {
                           return;
                        }

                        if (var30 > 20 + var72) {
                           return;
                        }
                     }

                     class586.updateLoginStatusUsernameRemembered(false, -1652043961);
                  } else if (10 == Login.loginIndex * -1614560929) {
                     if (var3 != 0) {
                        return;
                     }

                     int var45 = Login.loginBoxX * 743318851 + 180;
                     short var73 = 209;
                     if (var31.field3386 * 2044709447 != 84) {
                        if (var28 != 1 || var29 < var45 - 109 || var29 > 109 + var45 || var30 < var73) {
                           return;
                        }

                        if (var3 != 0) {
                           return;
                        }

                        if (var30 > var73 + 68) {
                           return;
                        }
                     }

                     if (class57.method1370(-1262320538)) {
                        return;
                     }

                     class525.setLoginResponseString(Strings.field4951, Strings.field5085, Strings.field5086, (byte)1);
                     client.field889 = class604.field6589;
                     classFR.method4050(false, -1201389255);
                     WorldMapSectionType.updateGameState(20, (byte)45);
                  } else if (-1614560929 * Login.loginIndex == 12) {
                     if (var3 != 0) {
                        return;
                     }

                     int var46 = CollisionMap.loginBoxCenter * -1998333989;
                     int var74 = 233;
                     Bounds var98 = var2.method10401(0, 30, Strings.field4996, var46, var74);
                     Bounds var109 = var2.method10401(32, 32, Strings.field4996, var46, var74);
                     Bounds var114 = var2.method10401(70, 34, Strings.field4996, var46, var74);
                     var74 += 17;
                     Bounds var117 = var2.method10401(0, 34, Strings.field4865, var46, var74);
                     if (var28 == 1) {
                        if (var98.method9506(var29, var30, 1219504736)) {
                           class558.openURL("https://www.jagex.com/terms", (short)-794);
                        } else if (var109.method9506(var29, var30, 707383644)) {
                           class558.openURL("https://www.jagex.com/terms/privacy", (short)-3209);
                        } else if (var114.method9506(var29, var30, 2011871125) || var117.method9506(var29, var30, -37419661)) {
                           class558.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", (short)-24344);
                        }
                     }

                     var46 = CollisionMap.loginBoxCenter * -1998333989 - 80;
                     short var76 = 311;
                     if (1 == var28 && var29 >= var46 - 75 && var29 <= var46 + 75 && var30 >= var76 - 20 && var30 <= var76 + 20) {
                        WorldMapAreaData.method7358(-1419623560);
                        class586.updateLoginStatusUsernameRemembered(true, -1913267517);
                     }

                     var46 = 80 + CollisionMap.loginBoxCenter * -1998333989;
                     if (var28 == 1 && var29 >= var46 - 75) {
                        if (var3 != 0) {
                           return;
                        }

                        if (var29 <= var46 + 75 && var30 >= var76 - 20 && var30 <= 20 + var76) {
                           Login.loginIndex = -464840173;
                        }
                     }
                  } else if (Login.loginIndex * -1614560929 == 13) {
                     int var49 = -1998333989 * CollisionMap.loginBoxCenter;
                     short var77 = 321;
                     if (var28 == 1 && var29 >= var49 - 75 && var29 <= var49 + 75 && var30 >= var77 - 20 && var30 <= 20 + var77) {
                        if (var3 != 0) {
                           return;
                        }

                        class586.updateLoginStatusUsernameRemembered(true, -938114478);
                     }
                  } else if (Login.loginIndex * -1614560929 == 14) {
                     if (var3 != 0) {
                        return;
                     }

                     String var50 = "";
                     switch (-1858173113 * Login.Login_banType) {
                        case 0:
                           var50 = "https://secure.runescape.com/m=offence-appeal/account-history";
                           break;
                        case 1:
                           var50 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                           break;
                        case 2:
                           var50 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                           break;
                        default:
                           SpotAnimationDefinition.Login_promptCredentials(false, (short)-24652);
                     }

                     int var78 = 180 + 743318851 * Login.loginBoxX;
                     short var99 = 276;
                     if (var28 == 1) {
                        if (var3 != 0) {
                           return;
                        }

                        if (var29 >= var78 - 75 && var29 <= 75 + var78 && var30 >= var99 - 20 && var30 <= 20 + var99) {
                           class558.openURL(var50, (short)-2101);
                           class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                           class30.method1308(6, 1801841566);
                           return;
                        }
                     }

                     var78 = 180 + Login.loginBoxX * 743318851;
                     var99 = 326;
                     if (var28 == 1 && var29 >= var78 - 75 && var29 <= var78 + 75 && var30 >= var99 - 20 && var30 <= 20 + var99) {
                        SpotAnimationDefinition.Login_promptCredentials(false, (short)-7093);
                     }
                  } else if (24 == -1614560929 * Login.loginIndex) {
                     int var51 = 180 + 743318851 * Login.loginBoxX;
                     short var80 = 301;
                     if (1 == var28) {
                        if (var3 != 0) {
                           return;
                        }

                        if (var29 >= var51 - 75 && var29 <= 75 + var51) {
                           if (var3 != 0) {
                              return;
                           }

                           if (var30 >= var80 - 20 && var30 <= 20 + var80) {
                              class586.updateLoginStatusUsernameRemembered(false, -232098814);
                           }
                        }
                     }
                  } else if (Login.loginIndex * -1614560929 == 32) {
                     int var52 = 180 + 743318851 * Login.loginBoxX - 80;
                     short var81 = 321;
                     if (var28 == 1 && var29 >= var52 - 75 && var29 <= var52 + 75 && var30 >= var81 - 20) {
                        if (var3 != 0) {
                           return;
                        }

                        if (var30 <= 20 + var81) {
                           class558.openURL(EnumComposition.method4474("secure", true, 115332299) + "m=dob/set_dob.ws", (short)-218);
                           class525.setLoginResponseString(Strings.field5115, Strings.field5079, Strings.field5116, (byte)1);
                           class30.method1308(6, -347284930);
                           return;
                        }
                     }

                     var52 = 180 + Login.loginBoxX * 743318851 + 80;
                     if (var28 == 1 && var29 >= var52 - 75 && var29 <= var52 + 75 && var30 >= var81 - 20 && var30 <= var81 + 20) {
                        if (var3 != 0) {
                           return;
                        }

                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-3395);
                     }
                  } else if (33 == -1614560929 * Login.loginIndex) {
                     int var54 = 743318851 * Login.loginBoxX + 180;
                     short var82 = 276;
                     if (var28 == 1) {
                        if (var3 != 0) {
                           return;
                        }

                        if (var29 >= var54 - 75 && var29 <= 75 + var54 && var30 >= var82 - 20 && var30 <= var82 + 20) {
                           class558.openURL(Strings.field5166, (short)-14111);
                        }
                     }

                     var54 = 180 + 743318851 * Login.loginBoxX;
                     var82 = 326;
                     if (var28 == 1 && var29 >= var54 - 75 && var29 <= var54 + 75 && var30 >= var82 - 20 && var30 <= var82 + 20) {
                        if (var3 != 0) {
                           return;
                        }

                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-7263);
                     }
                  } else if (34 == -1614560929 * Login.loginIndex) {
                     if (var3 != 0) {
                        return;
                     }

                     int var56 = 743318851 * Login.loginBoxX + 180;
                     short var84 = 276;
                     if (var28 == 1 && var29 >= var56 - 75 && var29 <= 75 + var56 && var30 >= var84 - 20 && var30 <= var84 + 20) {
                        classGP.method4261((short)25020);
                        return;
                     }

                     if (null != Huffman.World_request) {
                        classGP.method4261((short)18118);
                     }

                     var56 = 180 + 743318851 * Login.loginBoxX;
                     var84 = 326;
                     if (1 == var28) {
                        if (var3 != 0) {
                           return;
                        }

                        if (var29 >= var56 - 75 && var29 <= 75 + var56 && var30 >= var84 - 20 && var30 <= var84 + 20) {
                           SpotAnimationDefinition.Login_promptCredentials(false, (short)-10123);
                        }
                     }
                  }
               } else {
                  while (var31.method6510((byte)-93)) {
                     if (84 == 2044709447 * var31.field3386 || 13 == var31.field3386 * 2044709447) {
                        SpotAnimationDefinition.Login_promptCredentials(true, (short)-373);
                     }
                  }

                  short var38 = 321;
                  if (var28 == 1 && var30 >= var38 - 20 && var30 <= 20 + var38) {
                     SpotAnimationDefinition.Login_promptCredentials(true, (short)-13242);
                  }
               }
            }
         }
      } catch (RuntimeException var26) {
         throw RestClientThreadFactory.newRunException(var26, "nx.aj(" + ')');
      }
   }
}
