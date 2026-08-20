import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("al")
public class HttpResponse {
   @ToRemove(unused = "true")
   @ObfuscatedName("en")
   static final int field36 = 12;
   @ObfuscatedName("at")
   final String headerFields;
   @ObfuscatedName("ag")
   final Map field33;
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   static final int field35 = 40;
   @ObfuscatedName("av")
   final int responseCode;
   @ObfuscatedName("an")
   final String responseBody;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   public static final int field34 = 11;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   public static final String field37 = "persists, please contact Jagex Support.";

   @ObfuscatedSignature(descriptor = "(Lal;I)Ljava/lang/String;")
   @ObfuscatedName("zs")
   public static String method125(HttpResponse var0, int var1) {
      if (var0 == null) {
         return var0.getResponseBody(var1);
      } else {
         try {
            return var0.headerFields;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "al.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lut;ILut;IIB)V")
   @ObfuscatedName("bs")
   static void method142(DynamicArray var0, int var1, DynamicArray var2, int var3, int var4, byte var5) {
      try {
         if (class586.field6376 == var0.field6107) {
            if (var5 != 2) {
               throw new IllegalStateException();
            }

            System.arraycopy(var0.array, var1, var2.array, var3, var4);
         } else if (var0.field6107 == class586.field6377) {
            if (var5 != 2) {
               return;
            }

            System.arraycopy(var0.field6110, var1, var2.field6110, var3, var4);
         } else {
            System.arraycopy(var0.field6111, var1, var2.field6111, var3, var4);
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "al.bs(" + ')');
      }
   }

   HttpResponse(String var1) {
      this.responseCode = 466806576;
      this.headerFields = var1;
      this.field33 = null;
      this.responseBody = "";
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   public int getResponseCode(int var1) {
      try {
         return -62797757 * this.responseCode;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "al.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lal;I)Ljava/lang/String;")
   @ObfuscatedName("cg")
   public static String method132(HttpResponse var0, int var1) {
      if (var0 == null) {
         return var0.method137(var1);
      } else {
         try {
            return var0.responseBody;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "al.an(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(S)Ljava/util/Map;")
   @ObfuscatedName("ag")
   public Map getHeaderFields(short var1) {
      try {
         return this.field33;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "al.ag(" + ')');
      }
   }

   HttpResponse(HttpURLConnection var1) throws IOException {
      this.responseCode = var1.getResponseCode() * -1673870229;
      this.headerFields = var1.getResponseMessage();
      this.field33 = var1.getHeaderFields();
      StringBuilder var2 = new StringBuilder();
      InputStream var3 = this.responseCode * -62797757 >= 300 ? var1.getErrorStream() : var1.getInputStream();
      if (var3 != null) {
         InputStreamReader var4 = new InputStreamReader(var3);
         BufferedReader var5 = new BufferedReader(var4);

         String var6;
         while ((var6 = var5.readLine()) != null) {
            var2.append(var6);
         }

         var3.close();
      }

      this.responseBody = var2.toString();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("az")
   public String method133() {
      return this.responseBody;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ak")
   public String method126() {
      return this.headerFields;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("aw")
   public String method127() {
      return this.headerFields;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ap")
   public String method128() {
      return this.headerFields;
   }

   @ObfuscatedSignature(descriptor = "([JIII)V")
   @ObfuscatedName("bo")
   static void method141(long[] var0, int var1, int var2, int var3) {
      try {
         while (var1 < var2) {
            if (var3 == -625911497) {
               throw new IllegalStateException();
            }

            long var4 = var0[var1];
            var0[var1] = var0[var2];
            var0[var2] = var4;
            var1++;
            var2--;
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "al.bo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ad")
   public String method134() {
      return this.responseBody;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ai")
   public String method135() {
      return this.responseBody;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   public int method124() {
      return -62797757 * this.responseCode;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;)V")
   @ObfuscatedName("ac")
   public static void method140(WorldMap var0) {
      if (var0 == null) {
         var0.getWorldMapData();
      }

      WorldMapRegion.WorldMapRegion_cachedSprites.clear();
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;Luw;ZII)V")
   @ObfuscatedName("ag")
   static void method139(AbstractArchive var0, AbstractArchive var1, GraphicsDefaults var2, boolean var3, int var4, int var5) {
      try {
         if (class217.clearLoginScreen) {
            if (var5 >= 1864590417) {
               throw new IllegalStateException();
            } else {
               if (4 == var4) {
                  class30.method1308(4, -2109893777);
               }
            }
         } else {
            if (var4 == 0) {
               if (var5 >= 1864590417) {
                  return;
               }

               class586.updateLoginStatusUsernameRemembered(var3, 163354058);
            } else {
               class30.method1308(var4, 377509231);
            }

            Rasterizer2D.Rasterizer2D_clear();
            byte[] var6 = var0.takeFileByNames("title.jpg", "", -1087775772);
            class560.leftTitleSprite = class201.readSpritePixelsFromBytes(var6, (byte)-37);
            client.method2471(-1);
            WorldMapData_1.rightTitleSprite = class560.leftTitleSprite.mirrorHorizontally();
            client.method2484(-1);
            int var7 = client.worldProperties * -1330094789;
            if ((var7 & class594.field6435.rsOrdinal((byte)11)) != 0) {
               if (var5 >= 1864590417) {
                  throw new IllegalStateException();
               }

               class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "", 1928630096);
            } else if ((var7 & class594.field6409.rsOrdinal((byte)78)) != 0) {
               if (var5 >= 1864590417) {
                  throw new IllegalStateException();
               }

               class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "", 2039926028);
            } else if ((var7 & class594.field6433.rsOrdinal((byte)88)) != 0) {
               if (var5 >= 1864590417) {
                  throw new IllegalStateException();
               }

               class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "", 2091245065);
            } else if ((var7 & class594.field6417.rsOrdinal((byte)99)) != 0) {
               if (var5 >= 1864590417) {
                  throw new IllegalStateException();
               }

               class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo_ugc_world", "", 2017175721);
            } else {
               class50.logoSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "", 1960997971);
            }

            class208.titleboxSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "", 2066047025);
            World.titlebuttonSprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "", 1963731485);
            classLX.field3801 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "", 2036721730);
            TriBool.field5954 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "", 1990676481);
            HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "", 2009167421);
            DirectByteArrayCopier.runesSprite = class288.getFont(var1, "runes", "", (byte)-120);
            FadeOutTask.title_muteSprite = class288.getFont(var1, "title_mute", "", (byte)-56);
            class456.options_buttons_0Sprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "", 1935058398);
            UserComparator6.field1830 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "", 2061318172);
            WidgetConfigNode.options_buttons_2Sprite = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "", 1987586247);
            HealthBarDefinition.field2243 = HttpRequestTask.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "", 1955134229);
            class164.field1972 = class456.options_buttons_0Sprite.subWidth * 1636032297;
            TaskHandler.field2444 = class456.options_buttons_0Sprite.subHeight * 449044205;
            class204.loginScreenRunesAnimation = new LoginScreenAnimation(DirectByteArrayCopier.runesSprite, var2.field6140);
            if (var3) {
               if (var5 >= 1864590417) {
                  throw new IllegalStateException();
               }

               Login.Login_username = "";
               client.method2115(-1);
               Login.Login_password = "";
               Login.field387 = new String[8];
               Login.field386 = 0;
            }

            class28.otpMedium = 0;
            UserComparator6.otp = "";
            Login.rememberUsername = true;
            Login.worldSelectOpen = false;
            if (class468.clientPreferences.isTitleMusicDisabled(-1059468046)) {
               if (var5 >= 1864590417) {
                  return;
               }

               classGK.method4244(0, 0, 1897180572);
            } else {
               class148.method4143("scape main", 255, -992808550);
            }

            class179.method4237(-1931393605);
            JagNetThread var8 = VarbitComposition.field2488;
            var8.method9232(false, -2045214212);
            class217.clearLoginScreen = true;
            Login.xPadding = 816921945 * ((class489.canvasWidth * 120179835 - 765) / 2);
            Login.loginBoxX = 1308961390 + Login.xPadding * -1970420125;
            CollisionMap.loginBoxCenter = -729437604 + Login.loginBoxX * -485361479;
            class560.leftTitleSprite.method12647(Login.xPadding * 921778921, 0);
            WorldMapData_1.rightTitleSprite.method12647(921778921 * Login.xPadding + 382, 0);
            class50.logoSprite.drawAt(Login.xPadding * 921778921 + 382 - class50.logoSprite.subWidth / 2, 18);
         }
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "al.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILcu;ZI)I")
   @ObfuscatedName("af")
   static int method144(int var0, Script var1, boolean var2, int var3) {
      try {
         Widget var4 = var2 ? UserComparator3.scriptDotWidget : class222.scriptActiveWidget;
         if (1700 == var0) {
            if (var3 >= 306135809) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = -231674939 * var4.itemId;
               return 1;
            }
         } else if (var0 == 1701) {
            if (var3 >= 306135809) {
               throw new IllegalStateException();
            } else {
               if (-1 != var4.itemId * -231674939) {
                  if (var3 >= 306135809) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 1070452379 * var4.itemQuantity;
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = 0;
               }

               return 1;
            }
         } else if (var0 == 1702) {
            if (var3 >= 306135809) {
               throw new IllegalStateException();
            } else {
               Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.childIndex * 2077538819;
               return 1;
            }
         } else if (var0 == 1703) {
            if (var3 >= 306135809) {
               throw new IllegalStateException();
            } else {
               int var9 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               ParamComposition var10 = WorldMap.getParamDefinition(var9, -1681888005);
               if (ParamComposition.method4969(var10, 1955936681)) {
                  if (var3 >= 306135809) {
                     throw new IllegalStateException();
                  }

                  Interpreter.Interpreter_objectStack[(SecureRandomFuture.Interpreter_objectStackSize += 831964661) * -1595015587 - 1] = var4.method8068(
                     var9, var10.defaultStr, (byte)53
                  );
               } else {
                  Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1] = var4.method8071(
                     var9, -822826545 * var10.defaultInt, -482568902
                  );
               }

               return 1;
            }
         } else if (1704 == var0) {
            if (var3 >= 306135809) {
               throw new IllegalStateException();
            } else {
               int var5 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Object var6 = class39.method651(var5, 2064600242);
               int var7 = Interpreter.Interpreter_intStack[(class408.Interpreter_intStackSize -= -1793120611) * 327716789];
               Widget.method8079(var4, var7, var6, (byte)-28);
               return 1;
            }
         } else if (var0 == 1707) {
            if (var3 >= 306135809) {
               throw new IllegalStateException();
            } else {
               int[] var10000 = Interpreter.Interpreter_intStack;
               int var10001 = (class408.Interpreter_intStackSize += -1793120611) * 327716789 - 1;
               byte var10002;
               if (var4.method8113((byte)14)) {
                  if (var3 >= 306135809) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else if (1708 == var0) {
            if (var3 >= 306135809) {
               throw new IllegalStateException();
            } else {
               return FriendSystem.method472(var4, 2038785067);
            }
         } else if (1709 == var0) {
            if (var3 >= 306135809) {
               throw new IllegalStateException();
            } else {
               return class28.method532(var4, (byte)-77);
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "al.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldd;B)V")
   @ObfuscatedName("ai")
   static void method143(WorldView var0, byte var1) {
      try {
         int var2 = var0.sizeX * 2010544793;
         int var3 = var0.sizeY * 1823353167;
         int[][][] var4 = var0.tileHeights;
         Scene var5 = var0.scene;
         byte var6 = 1;
         byte var7 = 2;
         byte var8 = 4;

         for (int var9 = 0; var9 < 4; var9++) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            if (var9 > 0) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               var6 <<= 3;
               var7 <<= 3;
               var8 <<= 3;
            }

            for (int var10 = 0; var10 <= var9; var10++) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               for (int var11 = 0; var11 <= var3; var11++) {
                  if (var1 != 1) {
                     throw new IllegalStateException();
                  }

                  for (int var12 = 0; var12 <= var2; var12++) {
                     if (var1 != 1) {
                        return;
                     }

                     if (0 != (class148.field1911[var10][var12][var11] & var6)) {
                        if (var1 != 1) {
                           return;
                        }

                        int var13 = var11;
                        int var14 = var11;
                        int var15 = var10;

                        int var16;
                        for (var16 = var10; var13 > 0; var13--) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           if ((class148.field1911[var10][var12][var13 - 1] & var6) == 0) {
                              break;
                           }

                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }
                        }

                        while (var14 < var3) {
                           if (var1 != 1) {
                              return;
                           }

                           if ((class148.field1911[var10][var12][var14 + 1] & var6) == 0) {
                              break;
                           }

                           var14++;
                        }

                        label312:
                        while (var15 > 0) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           for (int var17 = var13; var17 <= var14; var17++) {
                              if (var1 != 1) {
                                 return;
                              }

                              if ((class148.field1911[var15 - 1][var12][var17] & var6) == 0) {
                                 if (var1 != 1) {
                                    throw new IllegalStateException();
                                 }
                                 break label312;
                              }
                           }

                           var15--;
                        }

                        label299:
                        while (var16 < var9) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           for (int var32 = var13; var32 <= var14; var32++) {
                              if (0 == (class148.field1911[1 + var16][var12][var32] & var6)) {
                                 break label299;
                              }
                           }

                           var16++;
                        }

                        int var33 = (1 + var16 - var15) * (1 + (var14 - var13));
                        if (var33 >= 8) {
                           if (var1 != 1) {
                              return;
                           }

                           short var18 = 240;
                           int var19 = var4[var16][var12][var13] - var18;
                           int var20 = var4[var15][var12][var13];
                           var5.Scene_addOccluder(var9, 1, var12 * 128, var12 * 128, var13 * 128, 128 + 128 * var14, var19, var20);

                           for (int var21 = var15; var21 <= var16; var21++) {
                              for (int var22 = var13; var22 <= var14; var22++) {
                                 class148.field1911[var21][var12][var22] = class148.field1911[var21][var12][var22] & ~var6;
                              }
                           }
                        }
                     }

                     if ((class148.field1911[var10][var12][var11] & var7) != 0) {
                        if (var1 != 1) {
                           throw new IllegalStateException();
                        }

                        int var24 = var12;
                        int var26 = var12;
                        int var28 = var10;

                        int var30;
                        for (var30 = var10; var24 > 0; var24--) {
                           if (var1 != 1) {
                              return;
                           }

                           if (0 == (class148.field1911[var10][var24 - 1][var11] & var7)) {
                              break;
                           }
                        }

                        while (var26 < var2) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           if (0 == (class148.field1911[var10][var26 + 1][var11] & var7)) {
                              break;
                           }

                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           var26++;
                        }

                        label371:
                        while (var28 > 0) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           for (int var34 = var24; var34 <= var26; var34++) {
                              if (var1 != 1) {
                                 throw new IllegalStateException();
                              }

                              if ((class148.field1911[var28 - 1][var34][var11] & var7) == 0) {
                                 break label371;
                              }
                           }

                           var28--;
                        }

                        label358:
                        while (var30 < var9) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           for (int var35 = var24; var35 <= var26; var35++) {
                              if (var1 != 1) {
                                 throw new IllegalStateException();
                              }

                              if ((class148.field1911[var30 + 1][var35][var11] & var7) == 0) {
                                 if (var1 != 1) {
                                    throw new IllegalStateException();
                                 }
                                 break label358;
                              }
                           }

                           var30++;
                        }

                        int var36 = (1 + var30 - var28) * (var26 - var24 + 1);
                        if (var36 >= 8) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           short var40 = 240;
                           int var42 = var4[var30][var24][var11] - var40;
                           int var44 = var4[var28][var24][var11];
                           var5.Scene_addOccluder(var9, 2, 128 * var24, 128 * var26 + 128, var11 * 128, var11 * 128, var42, var44);

                           for (int var45 = var28; var45 <= var30; var45++) {
                              if (var1 != 1) {
                                 throw new IllegalStateException();
                              }

                              for (int var46 = var24; var46 <= var26; var46++) {
                                 if (var1 != 1) {
                                    throw new IllegalStateException();
                                 }

                                 class148.field1911[var45][var46][var11] = class148.field1911[var45][var46][var11] & ~var7;
                              }
                           }
                        }
                     }

                     if ((class148.field1911[var10][var12][var11] & var8) != 0) {
                        if (var1 != 1) {
                           return;
                        }

                        int var25 = var12;
                        int var27 = var12;
                        int var29 = var11;

                        int var31;
                        for (var31 = var11; var29 > 0; var29--) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           if ((class148.field1911[var10][var12][var29 - 1] & var8) == 0) {
                              break;
                           }

                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }
                        }

                        while (var31 < var3 && (class148.field1911[var10][var12][var31 + 1] & var8) != 0) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           var31++;
                        }

                        label428:
                        while (var25 > 0) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           for (int var37 = var29; var37 <= var31; var37++) {
                              if ((class148.field1911[var10][var25 - 1][var37] & var8) == 0) {
                                 break label428;
                              }
                           }

                           var25--;
                        }

                        label417:
                        while (var27 < var2) {
                           for (int var38 = var29; var38 <= var31; var38++) {
                              if (var1 != 1) {
                                 throw new IllegalStateException();
                              }

                              if ((class148.field1911[var10][1 + var27][var38] & var8) == 0) {
                                 break label417;
                              }
                           }

                           var27++;
                        }

                        if ((1 + (var27 - var25)) * (1 + (var31 - var29)) >= 4) {
                           if (var1 != 1) {
                              throw new IllegalStateException();
                           }

                           int var39 = var4[var10][var25][var29];
                           var5.Scene_addOccluder(var9, 4, var25 * 128, 128 * var27 + 128, 128 * var29, 128 + 128 * var31, var39, var39);

                           for (int var41 = var25; var41 <= var27; var41++) {
                              for (int var43 = var29; var43 <= var31; var43++) {
                                 if (var1 != 1) {
                                    throw new IllegalStateException();
                                 }

                                 class148.field1911[var10][var41][var43] = class148.field1911[var10][var41][var43] & ~var8;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var23) {
         throw RestClientThreadFactory.newRunException(var23, "al.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aw")
   protected static final void method138(int var0) {
      try {
         class389.clock.mark(796597613);

         for (int var1 = 0; var1 < 32; var1++) {
            if (var0 == 356867599) {
               return;
            }

            GameEngine.graphicsTickTimes[var1] = 0L;
         }

         for (int var3 = 0; var3 < 32; var3++) {
            if (var0 == 356867599) {
               throw new IllegalStateException();
            }

            GameEngine.clientTickTimes[var3] = 0L;
         }

         class142.gameCyclesToDo = 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "al.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("aj")
   public String method129() {
      return this.headerFields;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("as")
   public String method136() {
      return this.responseBody;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("an")
   public String getResponseBody(int var1) {
      try {
         return this.responseBody;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "al.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("at")
   public String method137(int var1) {
      try {
         return this.responseBody;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "al.an(" + ')');
      }
   }
}
