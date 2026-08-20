import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bf")
public class classBF {
   @ObfuscatedName("cx")
   static String field398 = "";
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field418 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field417 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field415 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field422 = 5;
   @ObfuscatedName("ds")
   static String[] field386 = new String[]{"logo_speedrunning", "logo_ugc_world"};
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field419 = 12;
   @ObfuscatedName("dq")
   static String[] field411 = new String[]{"title.jpg"};
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field421 = 38;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field423 = 2;
   @ObfuscatedName("dt")
   static boolean field413 = false;
   @ObfuscatedName("bb")
   static int field385 = 0;
   @ObfuscatedName("be")
   static int field395 = -1410227574;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field416 = 7;
   @ObfuscatedName("bq")
   static int field387 = -1431935615;
   @ObfuscatedName("by")
   static String field392 = "";
   @ToRemove(unused = "true")
   @ObfuscatedName("bu")
   static final int field426 = 5;
   @ObfuscatedName("bh")
   static String field390 = "";
   @ObfuscatedName("cr")
   static int field391 = 0;
   @ObfuscatedName("cu")
   static String[] field407 = new String[8];
   @ObfuscatedName("cp")
   static boolean field393 = true;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field420 = 32;
   @ObfuscatedName("cw")
   static int field384 = 0;
   @ObfuscatedName("cj")
   static String field396 = "";
   @ObfuscatedName("ci")
   static String field397 = "";
   @ObfuscatedName("di")
   static String field404 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
   @ObfuscatedName("ce")
   static String field399 = "";
   @ObfuscatedName("cm")
   static String field412 = "";
   @ObfuscatedName("dm")
   static boolean field401 = false;
   @ObfuscatedName("bv")
   static String field389 = "";
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("hu")
   static classVP field427;
   @ObfuscatedName("df")
   static String[] field414 = new String[]{
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
   @ObfuscatedName("du")
   static String field405 = "1234567890";
   @ObfuscatedName("cz")
   static int field394 = 1927755610 + 2007709401 * field385;
   @ObfuscatedName("dn")
   static int field400 = -520043415;
   @ObfuscatedName("dv")
   static int field408 = 0;
   @ObfuscatedName("do")
   static int field409 = 0;
   @ObfuscatedName("dg")
   static long field402 = -7971708337557546757L;
   @ObfuscatedName("dl")
   static long field410 = -3992049254271775187L;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field424 = 0;
   @ObfuscatedName("dy")
   static int field403 = 0;
   @ObfuscatedName("bf")
   static int field388 = -945703767;
   @ObfuscatedName("dx")
   static boolean field406 = false;
   @ToRemove(unused = "true")
   @ObfuscatedName("bp")
   static final int field425 = 32;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcm;)V")
   @ObfuscatedName("cj")
   static void method1044(classCM var0) {
      if (var0.method2482((byte)-77) != client.field932) {
         client.field932 = var0.method2482((byte)-53);
         classBD.method988(var0.method2482((byte)-25), 2147170986);
      }

      if (-2024190683 * client.field883 != var0.field1163 * -458552905) {
         classVP var1 = classHC.field2767;
         int var2 = var0.field1163 * -458552905;
         if ((var2 & classXE.field6840.vmethod8((byte)1)) != 0) {
            classFP.field2372 = classSU.method10680(var1, "logo_deadman_mode", "", -281278256);
         } else if ((var2 & classXE.field6851.vmethod8((byte)1)) != 0) {
            classFP.field2372 = classSU.method10680(var1, "logo_seasonal_mode", "", -635545411);
         } else if ((var2 & classXE.field6836.vmethod8((byte)1)) != 0) {
            classFP.field2372 = classSU.method10680(var1, "logo_speedrunning", "", 607941834);
         } else if ((var2 & classXE.field6839.vmethod8((byte)1)) != 0) {
            classFP.field2372 = classSU.method10680(var1, "logo_ugc_world", "", -488759571);
         } else {
            classFP.field2372 = classSU.method10680(var1, "logo", "", -1251419635);
         }
      }

      classLG.field4139 = var0.field1169;
      client.field827 = var0.field1162 * 894790041;
      client.field883 = var0.field1163 * -635970901;
      classGV.field2716 = var0.field1168;
      classRJ.field5681 = 721437403 * (0 == 2064080735 * client.field940 ? 'ꩊ' : var0.field1162 * 851246551 + 40000);
      classMB.field4478 = 309769881 * (0 == client.field940 * 2064080735 ? 443 : 50000 + var0.field1162 * 851246551);
      classAD.field141 = 1527064229 * classRJ.field5681;
   }

   static {
      new DecimalFormat("##0.00");
      new classTO();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)I")
   @ObfuscatedName("bc")
   static int method999(classVA var0) {
      int var1 = field414.length + field411.length;
      String[] var2 = field386;

      for (int var3 = 0; var3 < var2.length; var3++) {
         String var4 = var2[var3];
         if (var0.method11848(var4, 1278857994) != -1) {
            var1++;
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Lva;Laam;ZI)V")
   @ObfuscatedName("bp")
   static void method1000(classVA var0, classVA var1, classAAM var2, boolean var3, int var4) {
      if (classPA.field5209) {
         if (var4 == 4) {
            classAC.method326(4, 2115423794);
         }
      } else {
         if (0 == var4) {
            classIV.method6320(var3, (byte)-66);
         } else {
            classAC.method326(var4, 2037796446);
         }

         classYW.method13683();
         byte[] var5 = var0.method11854("title.jpg", "", 1857645463);
         classNI.field4673 = classIT.method6314(var5, 1445159355);
         classFR.field2391 = classNI.field4673.method13470();
         int var6 = 1202735713 * client.field883;
         if ((var6 & classXE.field6840.vmethod8((byte)1)) != 0) {
            classFP.field2372 = classSU.method10680(var1, "logo_deadman_mode", "", 387721232);
         } else if ((var6 & classXE.field6851.vmethod8((byte)1)) != 0) {
            classFP.field2372 = classSU.method10680(var1, "logo_seasonal_mode", "", 123681237);
         } else if ((var6 & classXE.field6836.vmethod8((byte)1)) != 0) {
            classFP.field2372 = classSU.method10680(var1, "logo_speedrunning", "", 148185783);
         } else if ((var6 & classXE.field6839.vmethod8((byte)1)) != 0) {
            classFP.field2372 = classSU.method10680(var1, "logo_ugc_world", "", -242359272);
         } else {
            classFP.field2372 = classSU.method10680(var1, "logo", "", 692140644);
         }

         classJB.field3120 = classSU.method10680(var1, "titlebox", "", -646323230);
         classKA.field3514 = classSU.method10680(var1, "titlebutton", "", 297778815);
         classGQ.field2655 = classSU.method10680(var1, "titlebutton_large", "", -2122673704);
         classQH.field5544 = classSU.method10680(var1, "play_now_text", "", 520685273);
         classSU.method10680(var1, "titlebutton_wide42,1", "", -89716226);
         classBM.field514 = classOT.method8732(var1, "runes", "", (byte)70);
         classCG.field733 = classOT.method8732(var1, "title_mute", "", (byte)74);
         classCK.field778 = classSU.method10680(var1, "options_radio_buttons,0", "", -100564125);
         classHC.field2768 = classSU.method10680(var1, "options_radio_buttons,4", "", -695250291);
         classEK.field1779 = classSU.method10680(var1, "options_radio_buttons,2", "", -1002252120);
         classQN.field5573 = classSU.method10680(var1, "options_radio_buttons,6", "", -1928335979);
         classXR.field6925 = classCK.field778.field7121 * -1666056959;
         classKP.field3985 = -682922689 * classCK.field778.field7119;
         classML.field4531 = new classCS(classBM.field514, var2.field62);
         if (var3) {
            field389 = "";
            field390 = "";
            field407 = new String[8];
            field391 = 0;
         }

         classEV.field1944 = 0;
         classQP.field5586 = "";
         field393 = true;
         field413 = false;
         classUR.method11526((byte)0);
         classDH.method3122(-1612757241);
         classWU.method12629((byte)84).method11887(false, 116730183);
         classPA.field5209 = true;
         field385 = -2138661170 * ((classSA.field5897 * 773246731 - -2058373054) / 2);
         field394 = 1927755610 + -2005030050 * field385;
         classRS.field5838 = 273549476 + 180132130 * field394;
         classNI.field4673.method13508(field385 * -329898575, 0);
         classFR.field2391.method13508(382 + 1050435522 * field385, 0);
         classYZ.method13810(classFP.field2372, -329898575 * field385 + -641358656 - classFP.field2372.field7121 / 2, 18);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;Lva;Laam;ZI)V")
   @ObfuscatedName("br")
   static void method1001(classVA var0, classVA var1, classAAM var2, boolean var3, int var4) {
      if (classPA.field5209) {
         if (var4 == 4) {
            classAC.method326(4, 2086614621);
         }
      } else {
         if (0 == var4) {
            classIV.method6320(var3, (byte)32);
         } else {
            classAC.method326(var4, 2115175663);
         }

         classYW.method13683();
         byte[] var5 = var0.method11854("title.jpg", "", 1857645463);
         classNI.field4673 = classIT.method6314(var5, 1406013956);
         classFR.field2391 = classNI.field4673.method13470();
         int var6 = -2024190683 * client.field883;
         if ((var6 & classXE.field6840.vmethod8((byte)1)) != 0) {
            classFP.field2372 = classSU.method10680(var1, "logo_deadman_mode", "", -443951802);
         } else if ((var6 & classXE.field6851.vmethod8((byte)1)) != 0) {
            classFP.field2372 = classSU.method10680(var1, "logo_seasonal_mode", "", -559264894);
         } else if ((var6 & classXE.field6836.vmethod8((byte)1)) != 0) {
            classFP.field2372 = classSU.method10680(var1, "logo_speedrunning", "", 533303044);
         } else if ((var6 & classXE.field6839.vmethod8((byte)1)) != 0) {
            classFP.field2372 = classSU.method10680(var1, "logo_ugc_world", "", 40527408);
         } else {
            classFP.field2372 = classSU.method10680(var1, "logo", "", -1585545407);
         }

         classJB.field3120 = classSU.method10680(var1, "titlebox", "", -1206512656);
         classKA.field3514 = classSU.method10680(var1, "titlebutton", "", -1812469939);
         classGQ.field2655 = classSU.method10680(var1, "titlebutton_large", "", -2043665658);
         classQH.field5544 = classSU.method10680(var1, "play_now_text", "", -770931823);
         classSU.method10680(var1, "titlebutton_wide42,1", "", -758968968);
         classBM.field514 = classOT.method8732(var1, "runes", "", (byte)38);
         classCG.field733 = classOT.method8732(var1, "title_mute", "", (byte)67);
         classCK.field778 = classSU.method10680(var1, "options_radio_buttons,0", "", -625147784);
         classHC.field2768 = classSU.method10680(var1, "options_radio_buttons,4", "", 586092587);
         classEK.field1779 = classSU.method10680(var1, "options_radio_buttons,2", "", 441232737);
         classQN.field5573 = classSU.method10680(var1, "options_radio_buttons,6", "", -888775260);
         classXR.field6925 = classCK.field778.field7121 * -1666056959;
         classKP.field3985 = -682922689 * classCK.field778.field7119;
         classML.field4531 = new classCS(classBM.field514, var2.field62);
         if (var3) {
            field389 = "";
            field390 = "";
            field407 = new String[8];
            field391 = 0;
         }

         classEV.field1944 = 0;
         classQP.field5586 = "";
         field393 = true;
         field413 = false;
         classUR.method11526((byte)0);
         classDH.method3122(-1612757241);
         classWU.method12629((byte)122).method11887(false, 116730183);
         classPA.field5209 = true;
         field385 = 358417233 * ((classSA.field5897 * 773246731 - 765) / 2);
         field394 = 1927755610 + 2007709401 * field385;
         classRS.field5838 = 273549476 + -1415132635 * field394;
         classNI.field4673.method13508(field385 * -329898575, 0);
         classFR.field2391.method13508(382 + -329898575 * field385, 0);
         classYZ.method13810(classFP.field2372, -329898575 * field385 + 382 - classFP.field2372.field7121 / 2, 18);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ZZ)Lyz;")
   @ObfuscatedName("bm")
   static classYZ method1002(boolean var0, boolean var1) {
      return var0 ? (var1 ? classQN.field5573 : classEK.field1779) : (var1 ? classHC.field2768 : classCK.field778);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ZZ)Lyz;")
   @ObfuscatedName("bt")
   static classYZ method1003(boolean var0, boolean var1) {
      return var0 ? (var1 ? classQN.field5573 : classEK.field1779) : (var1 ? classHC.field2768 : classCK.field778);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ZZ)Lyz;")
   @ObfuscatedName("bg")
   static classYZ method1004(boolean var0, boolean var1) {
      return var0 ? (var1 ? classQN.field5573 : classEK.field1779) : (var1 ? classHC.field2768 : classCK.field778);
   }

   classBF() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("cc")
   static void method1037(String var0, String var1, String var2) {
      field397 = var0;
      field398 = var1;
      field399 = var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bj")
   static String method1005() {
      return classCY.method2724(classAB.field122, (short)21364) ? classSL.method10470(field389, (short)21809) : field389;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;Lzv;Lzv;)V")
   @ObfuscatedName("bu")
   static void method1007(classTQ var0, classZV var1, classZV var2) {
      if (field413) {
         classDP.method3520(var0, -644062932);
      } else {
         if ((1229235359 * classTZ.field6261 == 1 || !classON.field4995 && 1229235359 * classTZ.field6261 == 4)
            && classTZ.field6266 * 1422993977 >= field385 * -329898575 + 765 - 50
            && classTZ.field6257 * 1243590197 >= 453
            && 1422993977 * classTZ.field6266 < 765 + -329898575 * field385
            && classTZ.field6257 * 1243590197 < 503) {
            classCY.method2736(classAB.field122, !classAB.field122.method2732((byte)36), (byte)16);
            classUR.method11526((byte)0);
            classDH.method3122(-1612757241);
         }

         if (-44590225 * client.field828 != 5) {
            if (-1L == field402 * -6105922944827093555L) {
               field402 = (classDD.method2983(16711680) + 1000L) * 7971708337557546757L;
            }

            long var3 = classDD.method2983(16711680);
            if (classOL.method8513(-1571893942) && -1L == field410 * -5269972525589787045L) {
               field410 = 3992049254271775187L * var3;
               if (-5269972525589787045L * field410 > -6105922944827093555L * field402) {
                  field402 = field410 * -3963514021849324345L;
               }
            }

            if (10 == -44590225 * client.field828 || client.field828 * -44590225 == 11) {
               if (classLU.field4232 == classXO.field6892) {
                  if (classTZ.field6261 * 1229235359 == 1 || !classON.field4995 && classTZ.field6261 * 1229235359 == 4) {
                     int var5 = field385 * -329898575 + 5;
                     short var6 = 463;
                     byte var7 = 100;
                     byte var8 = 35;
                     if (classTZ.field6266 * 1422993977 >= var5
                        && classTZ.field6266 * 1422993977 <= var7 + var5
                        && 1243590197 * classTZ.field6257 >= var6
                        && classTZ.field6257 * 1243590197 <= var6 + var8) {
                        if (classKB.method6447(1725920694)) {
                           field413 = true;
                           field408 = 0;
                           field409 = 0;
                        }

                        return;
                     }
                  }

                  if (classIS.field3054 != null && classKB.method6447(-546066146)) {
                     field413 = true;
                     field408 = 0;
                     field409 = 0;
                  }
               }

               int var23 = 1229235359 * classTZ.field6261;
               int var24 = classTZ.field6266 * 1422993977;
               int var25 = 1243590197 * classTZ.field6257;
               if (0 == var23) {
                  var24 = -38255113 * classTZ.field6255;
                  var25 = classTZ.field6264 * -2144333897;
               }

               if (!classON.field4995 && var23 == 4) {
                  var23 = 1;
               }

               classFA var26 = client.field931;
               classFA var9 = var26;
               if (-47366135 * field384 == 0) {
                  boolean var62 = false;

                  while (var9.method4531((short)8755)) {
                     if (84 == var9.field2181 * 1363213817) {
                        var62 = true;
                     }
                  }

                  int var93 = 1429288549 * classRS.field5838 - 80;
                  short var108 = 291;
                  if (1 == var23 && var24 >= var93 - 75 && var24 <= var93 + 75 && var25 >= var108 - 20 && var25 <= 20 + var108) {
                     classUF.method11299(classLZ.method7427("secure", true, 461270152) + "m=account-creation/g=oldscape/create_account_funnel.ws", (byte)27);
                  }

                  var93 = classRS.field5838 * 1429288549 + 80;
                  if (var23 == 1 && var24 >= var93 - 75 && var24 <= 75 + var93 && var25 >= var108 - 20 && var25 <= 20 + var108 || var62) {
                     if (classNU.method8146(-1192583193)) {
                        if (client.field832 && field389 != null && !field389.isEmpty()) {
                           field403 = -878854915;
                        } else {
                           field403 = 0;
                        }
                     } else {
                        classGG.method5430(1602566351);
                     }
                  }
               } else if (-47366135 * field384 == 1) {
                  boolean var61 = classOE.field4843.method2149(1985617997)
                     || classOE.field4843.method2154((byte)110)
                     || client.method2152(classOE.field4843, -1058609207);

                  while (var9.method4531((short)-11244)) {
                     if (var9.field2181 * 1363213817 == 84) {
                        if (var61) {
                           classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-109);
                           client.field898 = classAAP.field92;
                           classXQ.method12875(false, 402128428);
                           classJB.method6345(20, -1192966987);
                        } else {
                           classGG.method5430(1822178355);
                        }

                        return;
                     }

                     if (13 == var9.field2181 * 1363213817) {
                        classIV.method6320(true, (byte)103);
                        return;
                     }
                  }

                  int var91 = 1429288549 * classRS.field5838 - 80;
                  short var107 = 321;
                  if (var23 == 1 && var24 >= var91 - 75 && var24 <= var91 + 75 && var25 >= var107 - 20 && var25 <= 20 + var107) {
                     if (var61) {
                        classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-119);
                        client.field898 = classAAP.field92;
                        classXQ.method12875(false, 402128428);
                        classJB.method6345(20, -1192966987);
                     } else {
                        classGG.method5430(14017380);
                     }

                     return;
                  }

                  var91 = 80 + classRS.field5838 * 1429288549;
                  if (1 == var23 && var24 >= var91 - 75 && var24 <= 75 + var91 && var25 >= var107 - 20 && var25 <= 20 + var107) {
                     classIV.method6320(true, (byte)118);
                     return;
                  }
               } else if (field384 * -47366135 == 2) {
                  int var56 = 201;
                  var56 += 52;
                  if (1 == var23 && var25 >= var56 - 12 && var25 < 2 + var56) {
                     field403 = 0;
                  }

                  var56 += 15;
                  if (1 == var23 && var25 >= var56 - 12 && var25 < var56 + 2) {
                     field403 = -878854915;
                  }

                  var56 += 15;
                  short var60 = 361;
                  if (classWR.field6770 != null) {
                     int var86 = classWR.field6770.field6370 * 518523273 / 2;
                     if (1 == var23
                        && var24 >= -1357616065 * classWR.field6770.field6368 - var86
                        && var24 <= classWR.field6770.field6368 * -1357616065 + var86
                        && var25 >= var60 - 15
                        && var25 < var60) {
                        switch (-323997799 * field388) {
                           case 1:
                              classUF.method11299(classKK.field3926, (byte)-72);
                              return;
                           case 2:
                              classUF.method11299("https://support.runescape.com/hc/en-gb", (byte)-21);
                        }
                     }
                  }

                  int var87 = 1429288549 * classRS.field5838 - 80;
                  short var104 = 321;
                  if (1 == var23 && var24 >= var87 - 75 && var24 <= 75 + var87 && var25 >= var104 - 20 && var25 <= 20 + var104) {
                     field389 = field389.trim();
                     if (field389.isEmpty()) {
                        classSP.method10624(classKK.field3658, classKK.field3728, classKK.field3916, (byte)-97);
                     } else if (field390.isEmpty()) {
                        classSP.method10624(classKK.field3730, classKK.field3644, classKK.field3732, (byte)-44);
                     } else {
                        classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-63);
                        classXQ.method12875(false, 402128428);
                        classJB.method6345(20, -1192966987);
                     }

                     return;
                  }

                  var87 = 80 + 180 + -511275367 * field394;
                  if (var23 == 1 && var24 >= var87 - 75 && var24 <= 75 + var87 && var25 >= var104 - 20 && var25 <= var104 + 20) {
                     classAC.method326(0, 2119970406);
                     field389 = "";
                     field390 = "";
                     classEV.field1944 = 0;
                     classQP.field5586 = "";
                     field393 = true;
                  }

                  var87 = 1429288549 * classRS.field5838 + -117;
                  var104 = 277;
                  field401 = var24 >= var87
                     && var24 < var87 + 1381434113 * classXR.field6925
                     && var25 >= var104
                     && var25 < classKP.field3985 * -580844865 + var104;
                  if (1 == var23 && field401) {
                     client.field832 = !client.field832;
                     if (!client.field832 && classCY.method2782(classAB.field122, (byte)8) != null) {
                        classAB.field122.method2789(null, -1127326555);
                     }
                  }

                  var87 = 24 + 1429288549 * classRS.field5838;
                  var104 = 277;
                  field406 = var24 >= var87
                     && var24 < classXR.field6925 * 1381434113 + var87
                     && var25 >= var104
                     && var25 < var104 + -580844865 * classKP.field3985;
                  if (var23 == 1 && field406) {
                     classAB.field122.method2727(!classCY.method2724(classAB.field122, (short)10040), -2057509504);
                     if (!classCY.method2724(classAB.field122, (short)-1756)) {
                        field389 = "";
                        classAB.field122.method2789(null, 1609800813);
                        if (client.field832 && null != field389 && !field389.isEmpty()) {
                           field403 = -878854915;
                        } else {
                           field403 = 0;
                        }
                     }
                  }

                  label1101:
                  while (var9.method4531((short)1339)) {
                     if (var9.field2181 * 1363213817 == 13) {
                        classAC.method326(0, 2007357290);
                        field389 = "";
                        field390 = "";
                        classEV.field1944 = 0;
                        classQP.field5586 = "";
                        field393 = true;
                     } else if (-1187692459 * field403 == 0) {
                        classOG.method8436(var9.field2175, (byte)-38);
                        if (var9.field2181 * 1363213817 == 85 && !field389.isEmpty()) {
                           field389 = field389.substring(0, field389.length() - 1);
                        }

                        if (1363213817 * var9.field2181 == 84 || 1363213817 * var9.field2181 == 80) {
                           field403 = -878854915;
                        }

                        char var119 = var9.field2175;
                        boolean var113 = field404.indexOf(var119) != -1;
                        if (var113 && field389.length() < 320) {
                           field389 = field389 + var9.field2175;
                        }
                     } else if (field403 * -1187692459 == 1) {
                        if (85 == var9.field2181 * 1363213817 && !field390.isEmpty()) {
                           field390 = field390.substring(0, field390.length() - 1);
                        } else if (1363213817 * var9.field2181 == 84 || 80 == 1363213817 * var9.field2181) {
                           field403 = 0;
                           if (1363213817 * var9.field2181 == 84) {
                              field389 = field389.trim();
                              if (field389.isEmpty()) {
                                 classSP.method10624(classKK.field3658, classKK.field3728, classKK.field3916, (byte)-16);
                              } else if (field390.isEmpty()) {
                                 classSP.method10624(classKK.field3730, classKK.field3644, classKK.field3732, (byte)-33);
                              } else {
                                 classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-92);
                                 classXQ.method12875(false, 402128428);
                                 classJB.method6345(20, -1192966987);
                              }

                              return;
                           }
                        }

                        if ((classFA.method4540(var9, 82, -175454537) || classFA.method4540(var9, 87, 1916482088)) && 67 == 1363213817 * var9.field2181) {
                           Clipboard var115 = Toolkit.getDefaultToolkit().getSystemClipboard();
                           Transferable var121 = var115.getContents(classOE.field4843);
                           int var123 = 20 - field390.length();
                           if (var123 > 0) {
                              try {
                                 String var125 = (String)var121.getTransferData(DataFlavor.stringFlavor);
                                 int var17 = Math.min(var123, var125.length());
                                 int var18 = 0;

                                 while (true) {
                                    if (var18 >= var17) {
                                       field390 = field390 + var125.substring(0, var17);
                                       continue label1101;
                                    }

                                    if (!classIB.method6139(var125.charAt(var18), 492373917)) {
                                       break;
                                    }

                                    char var20 = var125.charAt(var18);
                                    boolean var19 = field404.indexOf(var20) != -1;
                                    if (!var19) {
                                       break;
                                    }

                                    var18++;
                                 }

                                 classAC.method326(3, 2020226715);
                                 return;
                              } catch (UnsupportedFlavorException var21) {
                              } catch (IOException var22) {
                              }
                           }
                        } else if (classIB.method6139(var9.field2175, 1984879040)) {
                           char var120 = var9.field2175;
                           boolean var114 = field404.indexOf(var120) != -1;
                           if (var114 && field390.length() < 20) {
                              field390 = field390 + var9.field2175;
                           }
                        }
                     }
                  }
               } else if (3 == -47366135 * field384) {
                  int var10 = 180 + -511275367 * field394;
                  short var11 = 241;
                  classUQ var12 = var1.method49(25, classKK.field3859.length() - 34, classKK.field3859, var10, var11);
                  if (var23 == 1 && var12.method11474(var24, var25, -594779443)) {
                     classUF.method11299(classKK.field3925, (byte)47);
                  }

                  var10 = 180 + field394 * -511275367;
                  var11 = 276;
                  if (1 == var23 && var24 >= var10 - 75 && var24 <= var10 + 75 && var25 >= var11 - 20 && var25 <= var11 + 20) {
                     classIV.method6320(false, (byte)-24);
                  }

                  var10 = 180 + -511275367 * field394;
                  var11 = 326;
                  if (1 == var23 && var24 >= var10 - 75 && var24 <= 75 + var10 && var25 >= var11 - 20 && var25 <= var11 + 20) {
                     classUF.method11299(classKK.field3926, (byte)-101);
                     return;
                  }
               } else if (4 == -47366135 * field384) {
                  int var29 = 180 + -511275367 * field394 - 80;
                  short var65 = 321;
                  if (var23 == 1 && var24 >= var29 - 75 && var24 <= var29 + 75 && var25 >= var65 - 20 && var25 <= var65 + 20) {
                     classQP.field5586.trim();
                     if (classQP.field5586.length() != 6) {
                        classSP.method10624(classKK.field3646, classKK.field3850, classKK.field3745, (byte)-66);
                     } else {
                        classEV.field1944 = Integer.parseInt(classQP.field5586) * 400348643;
                        classQP.field5586 = "";
                        classXQ.method12875(true, 402128428);
                        classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-62);
                        classJB.method6345(20, -1192966987);
                     }

                     return;
                  }

                  if (var23 == 1 && var24 >= 180 + field394 * -511275367 - 9 && var24 <= 180 + -511275367 * field394 + 130 && var25 >= 263 && var25 <= 296) {
                     field393 = !field393;
                  }

                  if (1 == var23 && var24 >= 180 + field394 * -511275367 - 34 && var24 <= 34 + -511275367 * field394 + 180 && var25 >= 351 && var25 <= 363) {
                     classUF.method11299(classKK.field3926, (byte)-17);
                  }

                  var29 = 80 + -511275367 * field394 + 180;
                  if (var23 == 1 && var24 >= var29 - 75 && var24 <= 75 + var29 && var25 >= var65 - 20 && var25 <= 20 + var65) {
                     classAC.method326(0, 2135587509);
                     field389 = "";
                     field390 = "";
                     classEV.field1944 = 0;
                     classQP.field5586 = "";
                  }

                  while (var9.method4531((short)20797)) {
                     boolean var95 = false;

                     for (int var13 = 0; var13 < field405.length(); var13++) {
                        if (var9.field2175 == field405.charAt(var13)) {
                           var95 = true;
                           break;
                        }
                     }

                     if (var9.field2181 * 1363213817 == 13) {
                        classAC.method326(0, 2128475217);
                        field389 = "";
                        field390 = "";
                        classEV.field1944 = 0;
                        classQP.field5586 = "";
                     } else {
                        if (1363213817 * var9.field2181 == 85 && !classQP.field5586.isEmpty()) {
                           classQP.field5586 = classQP.field5586.substring(0, classQP.field5586.length() - 1);
                        }

                        if (1363213817 * var9.field2181 == 84) {
                           classQP.field5586.trim();
                           if (classQP.field5586.length() != 6) {
                              classSP.method10624(classKK.field3646, classKK.field3850, classKK.field3745, (byte)-110);
                           } else {
                              classEV.field1944 = Integer.parseInt(classQP.field5586) * 400348643;
                              classQP.field5586 = "";
                              classXQ.method12875(true, 402128428);
                              classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-111);
                              classJB.method6345(20, -1192966987);
                           }

                           return;
                        }

                        if (var95 && classQP.field5586.length() < 6) {
                           classQP.field5586 = classQP.field5586 + var9.field2175;
                        }
                     }
                  }
               } else if (-47366135 * field384 == 5) {
                  int var31 = -511275367 * field394 + 180 - 80;
                  short var66 = 321;
                  if (1 == var23 && var24 >= var31 - 75 && var24 <= 75 + var31 && var25 >= var66 - 20 && var25 <= 20 + var66) {
                     classHC.method5992(-486975020);
                     return;
                  }

                  var31 = 80 + field394 * -511275367 + 180;
                  if (1 == var23 && var24 >= var31 - 75 && var24 <= var31 + 75 && var25 >= var66 - 20 && var25 <= var66 + 20) {
                     classBJ.method1117(true, -347989319);
                  }

                  short var96 = 361;
                  if (null != classLB.field4089) {
                     int var109 = 518523273 * classLB.field4089.field6370 / 2;
                     if (var23 == 1
                        && var24 >= classLB.field4089.field6368 * -1357616065 - var109
                        && var24 <= classLB.field4089.field6368 * -1357616065 + var109
                        && var25 >= var96 - 15
                        && var25 < var96) {
                        classUF.method11299(classLZ.method7427("secure", true, -115128950) + "m=weblogin/g=oldscape/cant_log_in", (byte)-5);
                     }
                  }

                  while (var9.method4531((short)-16094)) {
                     boolean var110 = false;

                     for (int var14 = 0; var14 < field404.length(); var14++) {
                        if (var9.field2175 == field404.charAt(var14)) {
                           var110 = true;
                           break;
                        }
                     }

                     if (1363213817 * var9.field2181 == 13) {
                        classBJ.method1117(true, -347989319);
                     } else {
                        if (85 == var9.field2181 * 1363213817 && !field389.isEmpty()) {
                           field389 = field389.substring(0, field389.length() - 1);
                        }

                        if (84 == var9.field2181 * 1363213817) {
                           classHC.method5992(-486975020);
                           return;
                        }

                        if (var110 && field389.length() < 320) {
                           field389 = field389 + var9.field2175;
                        }
                     }
                  }
               } else if (6 != field384 * -47366135) {
                  if (-47366135 * field384 == 7) {
                     if (client.field1134 && !client.field890) {
                        int var36 = 1429288549 * classRS.field5838 - 150;
                        int var68 = 25 + var36 + 240 + 40;
                        short var97 = 231;
                        int var111 = 40 + var97;
                        if (var23 == 1 && var24 >= var36 && var24 <= var68 && var25 >= var97 && var25 <= var111) {
                           field391 = classBJ.method1116(var36, var24, (byte)1) * 523390187;
                        }

                        int var116 = field394 * -511275367 + 180 - 80;
                        short var15 = 321;
                        if (1 == var23 && var24 >= var116 - 75 && var24 <= 75 + var116 && var25 >= var15 - 20 && var25 <= 20 + var15) {
                           boolean var16 = classCN.method2555((byte)39);
                           if (var16) {
                              classJB.method6345(50, -1192966987);
                              return;
                           }
                        }

                        var116 = 180 + -511275367 * field394 + 80;
                        if (var23 == 1 && var24 >= var116 - 75 && var24 <= var116 + 75 && var25 >= var15 - 20 && var25 <= var15 + 20) {
                           field407 = new String[8];
                           classBJ.method1117(true, -347989319);
                        }

                        while (var9.method4531((short)-12675)) {
                           if (101 == var9.field2181 * 1363213817) {
                              field407[-594543677 * field391] = null;
                           }

                           if (85 == var9.field2181 * 1363213817) {
                              if (field407[field391 * -594543677] == null && field391 * -594543677 > 0) {
                                 field391 -= 523390187;
                              }

                              field407[field391 * -594543677] = null;
                           }

                           if (var9.field2175 >= '0' && var9.field2175 <= '9') {
                              field407[-594543677 * field391] = "" + var9.field2175;
                              if (-594543677 * field391 < 7) {
                                 field391 += 523390187;
                              }
                           }

                           if (var9.field2181 * 1363213817 == 84) {
                              boolean var124 = classCN.method2555((byte)99);
                              if (var124) {
                                 classJB.method6345(50, -1192966987);
                              }

                              return;
                           }
                        }
                     } else {
                        int var34 = 180 + field394 * -511275367 - 80;
                        short var67 = 321;
                        if (1 == var23 && var24 >= var34 - 75 && var24 <= 75 + var34 && var25 >= var67 - 20 && var25 <= 20 + var67) {
                           classUF.method11299(classLZ.method7427("secure", true, 186518940) + "m=dob/set_dob.ws", (byte)12);
                           classSP.method10624(classKK.field3869, classKK.field3870, classKK.field3762, (byte)-5);
                           classAC.method326(6, 2071935358);
                           return;
                        }

                        var34 = 80 + 180 + field394 * -511275367;
                        if (1 == var23 && var24 >= var34 - 75 && var24 <= var34 + 75 && var25 >= var67 - 20 && var25 <= 20 + var67) {
                           classBJ.method1117(true, -347989319);
                        }
                     }
                  } else if (8 == field384 * -47366135) {
                     int var37 = field394 * -511275367 + 180 - 80;
                     short var69 = 321;
                     if (1 == var23 && var24 >= var37 - 75 && var24 <= 75 + var37 && var25 >= var69 - 20 && var25 <= 20 + var69) {
                        classUF.method11299("https://legal.jagex.com/docs/policies/privacy", (byte)-42);
                        classSP.method10624(classKK.field3869, classKK.field3870, classKK.field3762, (byte)-76);
                        classAC.method326(6, 2120096749);
                        return;
                     }

                     var37 = -511275367 * field394 + 180 + 80;
                     if (var23 == 1 && var24 >= var37 - 75 && var24 <= var37 + 75 && var25 >= var69 - 20 && var25 <= var69 + 20) {
                        classBJ.method1117(true, -347989319);
                     }
                  } else if (field384 * -47366135 == 9) {
                     int var39 = -511275367 * field394 + 180;
                     short var70 = 311;
                     boolean var98 = 1 == var23 && var24 >= var39 - 75 && var24 <= 75 + var39 && var25 >= var70 - 20 && var25 <= 20 + var70;

                     while (var9.method4531((short)23380)) {
                        if (84 == var9.field2181 * 1363213817 || 13 == 1363213817 * var9.field2181) {
                           var98 = true;
                        }
                     }

                     if (var98) {
                        classIV.method6320(false, (byte)80);
                     }
                  } else if (field384 * -47366135 == 10) {
                     int var40 = field394 * -511275367 + 180;
                     short var71 = 209;
                     boolean var99 = 1 == var23 && var24 >= var40 - 109 && var24 <= 109 + var40 && var25 >= var71 && var25 <= var71 + 68;

                     while (var9.method4531((short)-11891)) {
                        if (1363213817 * var9.field2181 == 84) {
                           var99 = true;
                        }
                     }

                     if (var99) {
                        if (classNU.method8146(-1313003698)) {
                           return;
                        }

                        classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-91);
                        client.field898 = classAAP.field92;
                        classXQ.method12875(false, 402128428);
                        classJB.method6345(20, -1192966987);
                     }
                  } else if (12 == -47366135 * field384) {
                     int var41 = classRS.field5838 * 1429288549;
                     int var72 = 233;
                     classUQ var100 = var2.method49(0, 30, classKK.field3900, var41, var72);
                     classUQ var112 = var2.method49(32, 32, classKK.field3900, var41, var72);
                     classUQ var118 = var2.method49(70, 34, classKK.field3900, var41, var72);
                     var72 += 17;
                     classUQ var122 = var2.method49(0, 34, classKK.field3901, var41, var72);
                     if (var23 == 1) {
                        if (var100.method11474(var24, var25, -594779443)) {
                           classUF.method11299("https://legal.jagex.com/docs/terms", (byte)9);
                        } else if (var112.method11474(var24, var25, -594779443)) {
                           classUF.method11299("https://legal.jagex.com/docs/policies/privacy", (byte)79);
                        } else if (var118.method11474(var24, var25, -594779443) || var122.method11474(var24, var25, -594779443)) {
                           classUF.method11299("https://legal.jagex.com/docs/terms/eula", (byte)-46);
                        }
                     }

                     var41 = classRS.field5838 * 1429288549 - 80;
                     short var74 = 311;
                     if (1 == var23 && var24 >= var41 - 75 && var24 <= 75 + var41 && var25 >= var74 - 20 && var25 <= var74 + 20) {
                        classYY.method13791(84314098);
                        classIV.method6320(true, (byte)36);
                     }

                     var41 = 80 + 1429288549 * classRS.field5838;
                     if (var23 == 1 && var24 >= var41 - 75 && var24 <= 75 + var41 && var25 >= var74 - 20 && var25 <= 20 + var74) {
                        field384 = 1641412837;
                     }
                  } else if (13 == -47366135 * field384) {
                     int var44 = classRS.field5838 * 1429288549;
                     short var75 = 321;
                     if (var23 == 1 && var24 >= var44 - 75 && var24 <= 75 + var44 && var25 >= var75 - 20 && var25 <= var75 + 20) {
                        classIV.method6320(true, (byte)-3);
                     }
                  } else if (14 == field384 * -47366135) {
                     String var45 = "";
                     switch (-20437633 * field387) {
                        case 0:
                           var45 = "https://secure.runescape.com/m=offence-appeal/account-history";
                           break;
                        case 1:
                           var45 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                           break;
                        case 2:
                           var45 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                           break;
                        default:
                           classBJ.method1117(false, -347989319);
                     }

                     int var76 = field394 * -511275367 + 180;
                     short var101 = 276;
                     if (1 == var23 && var24 >= var76 - 75 && var24 <= 75 + var76 && var25 >= var101 - 20 && var25 <= 20 + var101) {
                        classUF.method11299(var45, (byte)60);
                        classSP.method10624(classKK.field3869, classKK.field3870, classKK.field3762, (byte)-12);
                        classAC.method326(6, 2020460469);
                        return;
                     }

                     var76 = -511275367 * field394 + 180;
                     var101 = 326;
                     if (1 == var23 && var24 >= var76 - 75 && var24 <= 75 + var76 && var25 >= var101 - 20 && var25 <= var101 + 20) {
                        classBJ.method1117(false, -347989319);
                     }
                  } else if (-47366135 * field384 == 24) {
                     int var46 = -511275367 * field394 + 180;
                     short var78 = 301;
                     if (1 == var23 && var24 >= var46 - 75 && var24 <= 75 + var46 && var25 >= var78 - 20 && var25 <= 20 + var78) {
                        classIV.method6320(false, (byte)-23);
                     }
                  } else if (32 == field384 * -47366135) {
                     int var47 = 180 + field394 * -511275367 - 80;
                     short var79 = 321;
                     if (var23 == 1 && var24 >= var47 - 75 && var24 <= 75 + var47 && var25 >= var79 - 20 && var25 <= 20 + var79) {
                        classUF.method11299(classLZ.method7427("secure", true, -217420635) + "m=dob/set_dob.ws", (byte)68);
                        classSP.method10624(classKK.field3869, classKK.field3870, classKK.field3762, (byte)-97);
                        classAC.method326(6, 2002810577);
                        return;
                     }

                     var47 = 180 + -511275367 * field394 + 80;
                     if (1 == var23 && var24 >= var47 - 75 && var24 <= 75 + var47 && var25 >= var79 - 20 && var25 <= 20 + var79) {
                        classBJ.method1117(true, -347989319);
                     }
                  } else if (33 == -47366135 * field384) {
                     int var49 = field394 * -511275367 + 180;
                     short var80 = 276;
                     if (1 == var23 && var24 >= var49 - 75 && var24 <= 75 + var49 && var25 >= var80 - 20 && var25 <= var80 + 20) {
                        classUF.method11299(classKK.field3925, (byte)6);
                     }

                     var49 = -511275367 * field394 + 180;
                     var80 = 326;
                     if (1 == var23 && var24 >= var49 - 75 && var24 <= 75 + var49 && var25 >= var80 - 20 && var25 <= 20 + var80) {
                        classBJ.method1117(true, -347989319);
                     }
                  } else if (34 == field384 * -47366135) {
                     int var51 = -511275367 * field394 + 180;
                     short var82 = 276;
                     if (1 == var23 && var24 >= var51 - 75 && var24 <= var51 + 75 && var25 >= var82 - 20 && var25 <= var82 + 20) {
                        if (classKB.method6447(-612098240)) {
                           field413 = true;
                           field408 = 0;
                           field409 = 0;
                        }

                        return;
                     }

                     if (null != classIS.field3054 && classKB.method6447(1313353799)) {
                        field413 = true;
                        field408 = 0;
                        field409 = 0;
                     }

                     var51 = 180 + field394 * -511275367;
                     var82 = 326;
                     if (var23 == 1 && var24 >= var51 - 75 && var24 <= 75 + var51 && var25 >= var82 - 20 && var25 <= 20 + var82) {
                        classBJ.method1117(false, -347989319);
                     }
                  } else if (38 == -47366135 * field384) {
                     int var53 = classRS.field5838 * 1429288549;
                     short var84 = 281;
                     classUQ var103 = var1.method51(classKK.field3908, var53, var84);
                     if (1 == var23 && var103.method11474(var24, var25, -594779443)) {
                        classUF.method11299(classKK.field3909, (byte)46);
                        return;
                     }

                     var103.method11467((byte)-67);
                     var53 = classRS.field5838 * 1429288549 - 80;
                     var84 = 321;
                     if (var23 == 1 && var24 >= var53 - 75 && var24 <= 75 + var53 && var25 >= var84 - 20 && var25 <= 20 + var84) {
                        classUF.method11299(classKK.field3925, (byte)12);
                        return;
                     }

                     var53 = 80 + 1429288549 * classRS.field5838;
                     if (var23 == 1 && var24 >= var53 - 75 && var24 <= var53 + 75 && var25 >= var84 - 20 && var25 <= var84 + 20) {
                        classBJ.method1117(true, -347989319);
                        return;
                     }

                     while (var9.method4531((short)-19592)) {
                        if (var9.field2181 * 1363213817 == 84) {
                           classBJ.method1117(true, -347989319);
                           return;
                        }

                        if (var9.field2181 * 1363213817 == 13) {
                           classIV.method6320(true, (byte)-97);
                           return;
                        }
                     }
                  }
               } else {
                  while (var9.method4531((short)11201)) {
                     if (var9.field2181 * 1363213817 == 84 || 13 == 1363213817 * var9.field2181) {
                        classBJ.method1117(true, -347989319);
                     }
                  }

                  short var33 = 321;
                  if (1 == var23 && var25 >= var33 - 20 && var25 <= 20 + var33) {
                     classBJ.method1117(true, -347989319);
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/String;)V")
   @ObfuscatedName("db")
   static void method1060(int var0, String var1) {
      field392 = var1;
      field395 = -570519487 * var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dd")
   static void method1051() {
      classAC.method326(24, 2134236033);
      classSP.method10624(classKK.field3844, classKK.field3845, classKK.field3803, (byte)-12);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bb")
   static boolean method1010() {
      Date var0;
      try {
         SimpleDateFormat var2 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
         var2.setLenient(false);
         StringBuilder var3 = new StringBuilder();
         String[] var4 = field407;
         int var5 = 0;

         Date var1;
         while (true) {
            if (var5 >= var4.length) {
               var3.append("12");
               var1 = var2.parse(var3.toString());
               break;
            }

            String var6 = var4[var5];
            if (null == var6) {
               classAB.method307("Date not valid.", "Please ensure all characters are populated.", "", 577955118);
               var1 = null;
               break;
            }

            var3.append(var6);
            var5++;
         }

         var0 = var1;
      } catch (ParseException var7) {
         classAB.method307("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 1374987089);
         return false;
      }

      if (null == var0) {
         return false;
      } else {
         Calendar var9 = Calendar.getInstance();
         var9.set(1, var9.get(1) - 13);
         var9.set(5, var9.get(5) + 1);
         var9.set(11, 0);
         var9.set(12, 0);
         var9.set(13, 0);
         var9.set(14, 0);
         Date var10 = var9.getTime();
         boolean var8 = var0.before(var10);
         boolean var11 = classLX.method7373(var0, 1671196928);
         if (!var11) {
            classAB.method307("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -1894342562);
            return false;
         } else {
            if (!var8) {
               classEU.field1937 = 485945013;
            } else {
               classEU.field1937 = (int)(var0.getTime() / 86400000L - 11745L) * -2004283061;
            }

            return true;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/util/Date;)Z")
   @ObfuscatedName("bi")
   static boolean method1012(Date var0) {
      Date var1 = classSV.method10695(53480384);
      return var0.after(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljava/util/Date;")
   @ObfuscatedName("be")
   static Date method1013() {
      Calendar var0 = Calendar.getInstance();
      var0.set(2, 0);
      var0.set(5, 1);
      var0.set(1, 1900);
      return var0.getTime();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljava/util/Date;")
   @ObfuscatedName("by")
   static Date method1014() {
      Calendar var0 = Calendar.getInstance();
      var0.set(2, 0);
      var0.set(5, 1);
      var0.set(1, -162590629);
      return var0.getTime();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljava/util/Date;")
   @ObfuscatedName("bq")
   static Date method1015() {
      Calendar var0 = Calendar.getInstance();
      var0.set(2, 0);
      var0.set(5, 1);
      var0.set(1, 1233203016);
      return var0.getTime();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("bf")
   static void method1016(String var0, String var1, String var2) {
      classAC.method326(7, 2094222607);
      classSP.method10624(var0, var1, var2, (byte)-119);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("bs")
   static void method1017(String var0, String var1, String var2) {
      classAC.method326(7, 2021562050);
      classSP.method10624(var0, var1, var2, (byte)-47);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("cr")
   static boolean method1021(char var0) {
      for (int var1 = 0; var1 < field404.length(); var1++) {
         if (var0 == field404.charAt(var1)) {
            return true;
         }
      }

      return false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("bl")
   static void method1018(String var0, String var1, String var2) {
      classAC.method326(7, 2032216560);
      classSP.method10624(var0, var1, var2, (byte)-106);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("bv")
   static int method1020(int var0, int var1) {
      for (int var2 = 0; var2 < 8; var2++) {
         if (var1 <= 30 + var0) {
            return var2;
         }

         var0 += 30;
         var0 += 1 != var2 && var2 != 3 ? 5 : 20;
      }

      return 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bh")
   static boolean method1022(char var0) {
      for (int var1 = 0; var1 < field404.length(); var1++) {
         if (var0 == field404.charAt(var1)) {
            return true;
         }
      }

      return false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("bz")
   static boolean method1023(char var0) {
      for (int var1 = 0; var1 < field404.length(); var1++) {
         if (var0 == field404.charAt(var1)) {
            return true;
         }
      }

      return false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("du")
   static void method1054(int var0) {
      if (-47366135 * field384 != var0) {
         field384 = 1117408825 * var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(C)Z")
   @ObfuscatedName("cu")
   static boolean method1024(char var0) {
      for (int var1 = 0; var1 < field404.length(); var1++) {
         if (var0 == field404.charAt(var1)) {
            return true;
         }
      }

      return false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cb")
   static void method1025(boolean var0) {
      if (!classOE.field4843.method2149(1985617997) && !classOE.field4843.method2154((byte)46) && !client.method2152(classOE.field4843, -951473990)) {
         field397 = classKK.field3821;
         field398 = classKK.field3780;
         field399 = classKK.field3823;
         classAC.method326(2, 2146421984);
         if (var0) {
            field390 = "";
         }

         if (field389 == null || field389.isEmpty()) {
            if (classCY.method2782(classAB.field122, (byte)8) != null) {
               field389 = classCY.method2782(classAB.field122, (byte)8);
               client.field832 = true;
            } else {
               client.field832 = false;
            }
         }

         if (client.field832 && field389 != null && !field389.isEmpty()) {
            field403 = -878854915;
         } else {
            field403 = 0;
         }
      } else {
         classAC.method326(10, 2107485936);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dx")
   static void method1052() {
      classAC.method326(24, 2078336123);
      classSP.method10624(classKK.field3844, classKK.field3845, classKK.field3803, (byte)-70);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cp")
   static void method1027() {
      int var0 = classAB.field122.method2833(1873816533);
      int var1 = client.field977 * -1239932395 + var0;
      long var4 = System.currentTimeMillis();
      int var3 = (int)(var4 / 86400000L) - 11745;
      if (var1 <= var3) {
         classAB.field122.method2835(var3, (byte)96);
         classAC.method326(38, 2126361507);
      } else {
         classBJ.method1117(true, -347989319);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dr")
   static void method1058() {
      if (classAB.field122.method2732((byte)100)) {
         classBK.method1118(0, 0, (byte)122);
      } else {
         classPD.method8845("scape main", 255, (byte)32);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cl")
   static void method1028() {
      int var0 = classAB.field122.method2833(1873816533);
      int var1 = client.field977 * -1239932395 + var0;
      long var4 = System.currentTimeMillis();
      int var3 = (int)(var4 / 86400000L) - 11745;
      if (var1 <= var3) {
         classAB.field122.method2835(var3, (byte)119);
         classAC.method326(527865296, 2071481689);
      } else {
         classBJ.method1117(true, -347989319);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("av")
   static long method1041(int var0) {
      try {
         return client.field960 * 1625812779590823737L;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "bf.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cv")
   static void method1030(boolean var0) {
      byte var1 = 0;
      if (!classVA.method11864(-2053271753)) {
         var1 = 12;
      } else if (classOE.field4843.method2149(1985617997) || classOE.field4843.method2154((byte)122) || client.method2152(classOE.field4843, -1939642510)) {
         var1 = 10;
      }

      classAC.method326(var1, 2005160569);
      if (var0) {
         field389 = "";
         field390 = "";
         classEV.field1944 = 0;
         classQP.field5586 = "";
      }

      if (null == field389 || field389.isEmpty()) {
         if (classCY.method2782(classAB.field122, (byte)8) != null) {
            field389 = classCY.method2782(classAB.field122, (byte)8);
            client.field832 = true;
         } else {
            client.field832 = false;
         }
      }

      if (client.field832 && null != field389 && !field389.isEmpty()) {
         field403 = -878854915;
      } else {
         field403 = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cs")
   static void method1032() {
      field389 = field389.trim();
      if (field389.isEmpty()) {
         classSP.method10624(classKK.field3713, classKK.field3769, classKK.field3679, (byte)-94);
      } else {
         long var1;
         try {
            URL var3 = new URL(classLZ.method7427("services", false, -1515016473) + "m=accountappeal/login.ws");
            URLConnection var4 = var3.openConnection();
            var4.setRequestProperty("connection", "close");
            var4.setDoInput(true);
            var4.setDoOutput(true);
            var4.setConnectTimeout(5000);
            OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream());
            var5.write("data1=req");
            var5.flush();
            InputStream var6 = var4.getInputStream();
            classXY var7 = new classXY(new byte[1000]);

            while (true) {
               int var8 = var6.read(var7.field6954, var7.field6955 * 702114061, 1000 - var7.field6955 * 702114061);
               if (-1 == var8) {
                  var7.field6955 = 0;
                  long var11 = var7.method13059(1897605979);
                  var1 = var11;
                  break;
               }

               var7.field6955 += var8 * -1095856699;
               if (702114061 * var7.field6955 >= 1000) {
                  var1 = 0L;
                  break;
               }
            }
         } catch (Exception var10) {
            var1 = 0L;
         }

         int var0;
         if (0L == var1) {
            var0 = 5;
         } else {
            var0 = classGY.method5922(var1, field389, (byte)-10);
         }

         switch (var0) {
            case 2:
               classSP.method10624(classKK.field3874, classKK.field3906, classKK.field3763, (byte)-6);
               classAC.method326(6, 2141136401);
               break;
            case 3:
               classSP.method10624(classKK.field3727, classKK.field3607, classKK.field3879, (byte)-50);
               break;
            case 4:
               classSP.method10624(classKK.field3880, classKK.field3881, classKK.field3882, (byte)-21);
               break;
            case 5:
               classSP.method10624(classKK.field3883, classKK.field3884, classKK.field3885, (byte)-96);
               break;
            case 6:
               classSP.method10624(classKK.field3886, classKK.field3887, classKK.field3888, (byte)-46);
               break;
            case 7:
               classSP.method10624(classKK.field3768, classKK.field3890, classKK.field3891, (byte)-124);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bw")
   static boolean method1011() {
      Date var0;
      try {
         SimpleDateFormat var2 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
         var2.setLenient(false);
         StringBuilder var3 = new StringBuilder();
         String[] var4 = field407;
         int var5 = 0;

         Date var1;
         while (true) {
            if (var5 >= var4.length) {
               var3.append("12");
               var1 = var2.parse(var3.toString());
               break;
            }

            String var6 = var4[var5];
            if (null == var6) {
               classAB.method307("Date not valid.", "Please ensure all characters are populated.", "", 1922237284);
               var1 = null;
               break;
            }

            var3.append(var6);
            var5++;
         }

         var0 = var1;
      } catch (ParseException var7) {
         classAB.method307("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", 801547909);
         return false;
      }

      if (null == var0) {
         return false;
      } else {
         Calendar var9 = Calendar.getInstance();
         var9.set(1, var9.get(1) - 13);
         var9.set(5, var9.get(5) + 1);
         var9.set(11, 0);
         var9.set(12, 0);
         var9.set(13, 0);
         var9.set(14, 0);
         Date var10 = var9.getTime();
         boolean var8 = var0.before(var10);
         boolean var11 = classLX.method7373(var0, -1375654832);
         if (!var11) {
            classAB.method307("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", -1856828969);
            return false;
         } else {
            if (!var8) {
               classEU.field1937 = 485945013;
            } else {
               classEU.field1937 = (int)(var0.getTime() / 86400000L - 11745L) * -2004283061;
            }

            return true;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;Lzv;Lzv;)V")
   @ObfuscatedName("ba")
   static void method1008(classTQ var0, classZV var1, classZV var2) {
      if (field413) {
         classDP.method3520(var0, -644062932);
      } else {
         if ((1229235359 * classTZ.field6261 == 1 || !classON.field4995 && 1229235359 * classTZ.field6261 == 4)
            && classTZ.field6266 * 1422993977 >= field385 * -329898575 + 765 - 50
            && classTZ.field6257 * 1243590197 >= 453
            && 1422993977 * classTZ.field6266 < 765 + -329898575 * field385
            && classTZ.field6257 * 1243590197 < 503) {
            classCY.method2736(classAB.field122, !classAB.field122.method2732((byte)31), (byte)16);
            classUR.method11526((byte)0);
            classDH.method3122(-1612757241);
         }

         if (-44590225 * client.field828 != 5) {
            if (-1L == field402 * -6105922944827093555L) {
               field402 = (classDD.method2983(16711680) + 1000L) * 7971708337557546757L;
            }

            long var3 = classDD.method2983(16711680);
            if (classOL.method8513(1405545962) && -1L == field410 * -5269972525589787045L) {
               field410 = 3992049254271775187L * var3;
               if (-5269972525589787045L * field410 > -6105922944827093555L * field402) {
                  field402 = field410 * -3963514021849324345L;
               }
            }

            if (10 == -44590225 * client.field828 || client.field828 * -44590225 == 11) {
               if (classLU.field4232 == classXO.field6892) {
                  if (classTZ.field6261 * 1229235359 == 1 || !classON.field4995 && classTZ.field6261 * 1229235359 == 4) {
                     int var5 = field385 * -329898575 + 5;
                     short var6 = 463;
                     byte var7 = 100;
                     byte var8 = 35;
                     if (classTZ.field6266 * 1422993977 >= var5
                        && classTZ.field6266 * 1422993977 <= var7 + var5
                        && 1243590197 * classTZ.field6257 >= var6
                        && classTZ.field6257 * 1243590197 <= var6 + var8) {
                        if (classKB.method6447(206914850)) {
                           field413 = true;
                           field408 = 0;
                           field409 = 0;
                        }

                        return;
                     }
                  }

                  if (classIS.field3054 != null && classKB.method6447(927135030)) {
                     field413 = true;
                     field408 = 0;
                     field409 = 0;
                  }
               }

               int var23 = 1229235359 * classTZ.field6261;
               int var24 = classTZ.field6266 * 1422993977;
               int var25 = 1243590197 * classTZ.field6257;
               if (0 == var23) {
                  var24 = -38255113 * classTZ.field6255;
                  var25 = classTZ.field6264 * -2144333897;
               }

               if (!classON.field4995 && var23 == 4) {
                  var23 = 1;
               }

               classFA var26 = client.field931;
               classFA var9 = var26;
               if (-47366135 * field384 == 0) {
                  boolean var62 = false;

                  while (var9.method4531((short)4921)) {
                     if (84 == var9.field2181 * 1363213817) {
                        var62 = true;
                     }
                  }

                  int var93 = 1429288549 * classRS.field5838 - 80;
                  short var108 = 291;
                  if (1 == var23 && var24 >= var93 - 75 && var24 <= var93 + 75 && var25 >= var108 - 20 && var25 <= 20 + var108) {
                     classUF.method11299(classLZ.method7427("secure", true, -425771032) + "m=account-creation/g=oldscape/create_account_funnel.ws", (byte)49);
                  }

                  var93 = classRS.field5838 * 1429288549 + 80;
                  if (var23 == 1 && var24 >= var93 - 75 && var24 <= 75 + var93 && var25 >= var108 - 20 && var25 <= 20 + var108 || var62) {
                     if (classNU.method8146(-2068021330)) {
                        if (client.field832 && field389 != null && !field389.isEmpty()) {
                           field403 = -878854915;
                        } else {
                           field403 = 0;
                        }
                     } else {
                        classGG.method5430(1048463493);
                     }
                  }
               } else if (-47366135 * field384 == 1) {
                  boolean var61 = classOE.field4843.method2149(1985617997)
                     || classOE.field4843.method2154((byte)106)
                     || client.method2152(classOE.field4843, -1486663592);

                  while (var9.method4531((short)-3262)) {
                     if (var9.field2181 * 1363213817 == 84) {
                        if (var61) {
                           classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-107);
                           client.field898 = classAAP.field92;
                           classXQ.method12875(false, 402128428);
                           classJB.method6345(20, -1192966987);
                        } else {
                           classGG.method5430(-132655086);
                        }

                        return;
                     }

                     if (13 == var9.field2181 * 1363213817) {
                        classIV.method6320(true, (byte)8);
                        return;
                     }
                  }

                  int var91 = 1429288549 * classRS.field5838 - 80;
                  short var107 = 321;
                  if (var23 == 1 && var24 >= var91 - 75 && var24 <= var91 + 75 && var25 >= var107 - 20 && var25 <= 20 + var107) {
                     if (var61) {
                        classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-37);
                        client.field898 = classAAP.field92;
                        classXQ.method12875(false, 402128428);
                        classJB.method6345(20, -1192966987);
                     } else {
                        classGG.method5430(440538868);
                     }

                     return;
                  }

                  var91 = 80 + classRS.field5838 * 1429288549;
                  if (1 == var23 && var24 >= var91 - 75 && var24 <= 75 + var91 && var25 >= var107 - 20 && var25 <= 20 + var107) {
                     classIV.method6320(true, (byte)-50);
                     return;
                  }
               } else if (field384 * -47366135 == 2) {
                  int var56 = 201;
                  var56 += 52;
                  if (1 == var23 && var25 >= var56 - 12 && var25 < 2 + var56) {
                     field403 = 0;
                  }

                  var56 += 15;
                  if (1 == var23 && var25 >= var56 - 12 && var25 < var56 + 2) {
                     field403 = -878854915;
                  }

                  var56 += 15;
                  short var60 = 361;
                  if (classWR.field6770 != null) {
                     int var86 = classWR.field6770.field6370 * 518523273 / 2;
                     if (1 == var23
                        && var24 >= -1357616065 * classWR.field6770.field6368 - var86
                        && var24 <= classWR.field6770.field6368 * -1357616065 + var86
                        && var25 >= var60 - 15
                        && var25 < var60) {
                        switch (-323997799 * field388) {
                           case 1:
                              classUF.method11299(classKK.field3926, (byte)-71);
                              return;
                           case 2:
                              classUF.method11299("https://support.runescape.com/hc/en-gb", (byte)-68);
                        }
                     }
                  }

                  int var87 = 1429288549 * classRS.field5838 - 80;
                  short var104 = 321;
                  if (1 == var23 && var24 >= var87 - 75 && var24 <= 75 + var87 && var25 >= var104 - 20 && var25 <= 20 + var104) {
                     field389 = field389.trim();
                     if (field389.isEmpty()) {
                        classSP.method10624(classKK.field3658, classKK.field3728, classKK.field3916, (byte)-69);
                     } else if (field390.isEmpty()) {
                        classSP.method10624(classKK.field3730, classKK.field3644, classKK.field3732, (byte)-18);
                     } else {
                        classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-98);
                        classXQ.method12875(false, 402128428);
                        classJB.method6345(20, -1192966987);
                     }

                     return;
                  }

                  var87 = 80 + 180 + -511275367 * field394;
                  if (var23 == 1 && var24 >= var87 - 75 && var24 <= 75 + var87 && var25 >= var104 - 20 && var25 <= var104 + 20) {
                     classAC.method326(0, 2086875933);
                     field389 = "";
                     field390 = "";
                     classEV.field1944 = 0;
                     classQP.field5586 = "";
                     field393 = true;
                  }

                  var87 = 1429288549 * classRS.field5838 + -117;
                  var104 = 277;
                  field401 = var24 >= var87
                     && var24 < var87 + 1381434113 * classXR.field6925
                     && var25 >= var104
                     && var25 < classKP.field3985 * -580844865 + var104;
                  if (1 == var23 && field401) {
                     client.field832 = !client.field832;
                     if (!client.field832 && classCY.method2782(classAB.field122, (byte)8) != null) {
                        classAB.field122.method2789(null, -1640684454);
                     }
                  }

                  var87 = 24 + 1429288549 * classRS.field5838;
                  var104 = 277;
                  field406 = var24 >= var87
                     && var24 < classXR.field6925 * 1381434113 + var87
                     && var25 >= var104
                     && var25 < var104 + -580844865 * classKP.field3985;
                  if (var23 == 1 && field406) {
                     classAB.field122.method2727(!classCY.method2724(classAB.field122, (short)16872), -1003388898);
                     if (!classCY.method2724(classAB.field122, (short)1706)) {
                        field389 = "";
                        classAB.field122.method2789(null, 1575496339);
                        if (client.field832 && null != field389 && !field389.isEmpty()) {
                           field403 = -878854915;
                        } else {
                           field403 = 0;
                        }
                     }
                  }

                  label1101:
                  while (var9.method4531((short)4530)) {
                     if (var9.field2181 * 1363213817 == 13) {
                        classAC.method326(0, 2142095109);
                        field389 = "";
                        field390 = "";
                        classEV.field1944 = 0;
                        classQP.field5586 = "";
                        field393 = true;
                     } else if (-1187692459 * field403 == 0) {
                        classOG.method8436(var9.field2175, (byte)0);
                        if (var9.field2181 * 1363213817 == 85 && !field389.isEmpty()) {
                           field389 = field389.substring(0, field389.length() - 1);
                        }

                        if (1363213817 * var9.field2181 == 84 || 1363213817 * var9.field2181 == 80) {
                           field403 = -878854915;
                        }

                        char var119 = var9.field2175;
                        boolean var113 = field404.indexOf(var119) != -1;
                        if (var113 && field389.length() < 320) {
                           field389 = field389 + var9.field2175;
                        }
                     } else if (field403 * -1187692459 == 1) {
                        if (85 == var9.field2181 * 1363213817 && !field390.isEmpty()) {
                           field390 = field390.substring(0, field390.length() - 1);
                        } else if (1363213817 * var9.field2181 == 84 || 80 == 1363213817 * var9.field2181) {
                           field403 = 0;
                           if (1363213817 * var9.field2181 == 84) {
                              field389 = field389.trim();
                              if (field389.isEmpty()) {
                                 classSP.method10624(classKK.field3658, classKK.field3728, classKK.field3916, (byte)-61);
                              } else if (field390.isEmpty()) {
                                 classSP.method10624(classKK.field3730, classKK.field3644, classKK.field3732, (byte)-111);
                              } else {
                                 classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-55);
                                 classXQ.method12875(false, 402128428);
                                 classJB.method6345(20, -1192966987);
                              }

                              return;
                           }
                        }

                        if ((classFA.method4540(var9, 82, 150717402) || classFA.method4540(var9, 87, 2066997730)) && 67 == 1363213817 * var9.field2181) {
                           Clipboard var115 = Toolkit.getDefaultToolkit().getSystemClipboard();
                           Transferable var121 = var115.getContents(classOE.field4843);
                           int var123 = 20 - field390.length();
                           if (var123 > 0) {
                              try {
                                 String var125 = (String)var121.getTransferData(DataFlavor.stringFlavor);
                                 int var17 = Math.min(var123, var125.length());
                                 int var18 = 0;

                                 while (true) {
                                    if (var18 >= var17) {
                                       field390 = field390 + var125.substring(0, var17);
                                       continue label1101;
                                    }

                                    if (!classIB.method6139(var125.charAt(var18), 1447125769)) {
                                       break;
                                    }

                                    char var20 = var125.charAt(var18);
                                    boolean var19 = field404.indexOf(var20) != -1;
                                    if (!var19) {
                                       break;
                                    }

                                    var18++;
                                 }

                                 classAC.method326(3, 2027766083);
                                 return;
                              } catch (UnsupportedFlavorException var21) {
                              } catch (IOException var22) {
                              }
                           }
                        } else if (classIB.method6139(var9.field2175, 1440645145)) {
                           char var120 = var9.field2175;
                           boolean var114 = field404.indexOf(var120) != -1;
                           if (var114 && field390.length() < 20) {
                              field390 = field390 + var9.field2175;
                           }
                        }
                     }
                  }
               } else if (3 == -47366135 * field384) {
                  int var10 = 180 + -511275367 * field394;
                  short var11 = 241;
                  classUQ var12 = var1.method49(25, classKK.field3859.length() - 34, classKK.field3859, var10, var11);
                  if (var23 == 1 && var12.method11474(var24, var25, -594779443)) {
                     classUF.method11299(classKK.field3925, (byte)-113);
                  }

                  var10 = 180 + field394 * -511275367;
                  var11 = 276;
                  if (1 == var23 && var24 >= var10 - 75 && var24 <= var10 + 75 && var25 >= var11 - 20 && var25 <= var11 + 20) {
                     classIV.method6320(false, (byte)-56);
                  }

                  var10 = 180 + -511275367 * field394;
                  var11 = 326;
                  if (1 == var23 && var24 >= var10 - 75 && var24 <= 75 + var10 && var25 >= var11 - 20 && var25 <= var11 + 20) {
                     classUF.method11299(classKK.field3926, (byte)-55);
                     return;
                  }
               } else if (4 == -47366135 * field384) {
                  int var29 = 180 + -511275367 * field394 - 80;
                  short var65 = 321;
                  if (var23 == 1 && var24 >= var29 - 75 && var24 <= var29 + 75 && var25 >= var65 - 20 && var25 <= var65 + 20) {
                     classQP.field5586.trim();
                     if (classQP.field5586.length() != 6) {
                        classSP.method10624(classKK.field3646, classKK.field3850, classKK.field3745, (byte)-31);
                     } else {
                        classEV.field1944 = Integer.parseInt(classQP.field5586) * 400348643;
                        classQP.field5586 = "";
                        classXQ.method12875(true, 402128428);
                        classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-96);
                        classJB.method6345(20, -1192966987);
                     }

                     return;
                  }

                  if (var23 == 1 && var24 >= 180 + field394 * -511275367 - 9 && var24 <= 180 + -511275367 * field394 + 130 && var25 >= 263 && var25 <= 296) {
                     field393 = !field393;
                  }

                  if (1 == var23 && var24 >= 180 + field394 * -511275367 - 34 && var24 <= 34 + -511275367 * field394 + 180 && var25 >= 351 && var25 <= 363) {
                     classUF.method11299(classKK.field3926, (byte)64);
                  }

                  var29 = 80 + -511275367 * field394 + 180;
                  if (var23 == 1 && var24 >= var29 - 75 && var24 <= 75 + var29 && var25 >= var65 - 20 && var25 <= 20 + var65) {
                     classAC.method326(0, 2009592349);
                     field389 = "";
                     field390 = "";
                     classEV.field1944 = 0;
                     classQP.field5586 = "";
                  }

                  while (var9.method4531((short)-5024)) {
                     boolean var95 = false;

                     for (int var13 = 0; var13 < field405.length(); var13++) {
                        if (var9.field2175 == field405.charAt(var13)) {
                           var95 = true;
                           break;
                        }
                     }

                     if (var9.field2181 * 1363213817 == 13) {
                        classAC.method326(0, 2003674242);
                        field389 = "";
                        field390 = "";
                        classEV.field1944 = 0;
                        classQP.field5586 = "";
                     } else {
                        if (1363213817 * var9.field2181 == 85 && !classQP.field5586.isEmpty()) {
                           classQP.field5586 = classQP.field5586.substring(0, classQP.field5586.length() - 1);
                        }

                        if (1363213817 * var9.field2181 == 84) {
                           classQP.field5586.trim();
                           if (classQP.field5586.length() != 6) {
                              classSP.method10624(classKK.field3646, classKK.field3850, classKK.field3745, (byte)-126);
                           } else {
                              classEV.field1944 = Integer.parseInt(classQP.field5586) * 400348643;
                              classQP.field5586 = "";
                              classXQ.method12875(true, 402128428);
                              classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-106);
                              classJB.method6345(20, -1192966987);
                           }

                           return;
                        }

                        if (var95 && classQP.field5586.length() < 6) {
                           classQP.field5586 = classQP.field5586 + var9.field2175;
                        }
                     }
                  }
               } else if (-47366135 * field384 == 5) {
                  int var31 = -511275367 * field394 + 180 - 80;
                  short var66 = 321;
                  if (1 == var23 && var24 >= var31 - 75 && var24 <= 75 + var31 && var25 >= var66 - 20 && var25 <= 20 + var66) {
                     classHC.method5992(-486975020);
                     return;
                  }

                  var31 = 80 + field394 * -511275367 + 180;
                  if (1 == var23 && var24 >= var31 - 75 && var24 <= var31 + 75 && var25 >= var66 - 20 && var25 <= var66 + 20) {
                     classBJ.method1117(true, -347989319);
                  }

                  short var96 = 361;
                  if (null != classLB.field4089) {
                     int var109 = 518523273 * classLB.field4089.field6370 / 2;
                     if (var23 == 1
                        && var24 >= classLB.field4089.field6368 * -1357616065 - var109
                        && var24 <= classLB.field4089.field6368 * -1357616065 + var109
                        && var25 >= var96 - 15
                        && var25 < var96) {
                        classUF.method11299(classLZ.method7427("secure", true, 1026054998) + "m=weblogin/g=oldscape/cant_log_in", (byte)-112);
                     }
                  }

                  while (var9.method4531((short)-16088)) {
                     boolean var110 = false;

                     for (int var14 = 0; var14 < field404.length(); var14++) {
                        if (var9.field2175 == field404.charAt(var14)) {
                           var110 = true;
                           break;
                        }
                     }

                     if (1363213817 * var9.field2181 == 13) {
                        classBJ.method1117(true, -347989319);
                     } else {
                        if (85 == var9.field2181 * 1363213817 && !field389.isEmpty()) {
                           field389 = field389.substring(0, field389.length() - 1);
                        }

                        if (84 == var9.field2181 * 1363213817) {
                           classHC.method5992(-486975020);
                           return;
                        }

                        if (var110 && field389.length() < 320) {
                           field389 = field389 + var9.field2175;
                        }
                     }
                  }
               } else if (6 != field384 * -47366135) {
                  if (-47366135 * field384 == 7) {
                     if (client.field1134 && !client.field890) {
                        int var36 = 1429288549 * classRS.field5838 - 150;
                        int var68 = 25 + var36 + 240 + 40;
                        short var97 = 231;
                        int var111 = 40 + var97;
                        if (var23 == 1 && var24 >= var36 && var24 <= var68 && var25 >= var97 && var25 <= var111) {
                           field391 = classBJ.method1116(var36, var24, (byte)1) * 523390187;
                        }

                        int var116 = field394 * -511275367 + 180 - 80;
                        short var15 = 321;
                        if (1 == var23 && var24 >= var116 - 75 && var24 <= 75 + var116 && var25 >= var15 - 20 && var25 <= 20 + var15) {
                           boolean var16 = classCN.method2555((byte)35);
                           if (var16) {
                              classJB.method6345(50, -1192966987);
                              return;
                           }
                        }

                        var116 = 180 + -511275367 * field394 + 80;
                        if (var23 == 1 && var24 >= var116 - 75 && var24 <= var116 + 75 && var25 >= var15 - 20 && var25 <= var15 + 20) {
                           field407 = new String[8];
                           classBJ.method1117(true, -347989319);
                        }

                        while (var9.method4531((short)-14938)) {
                           if (101 == var9.field2181 * 1363213817) {
                              field407[-594543677 * field391] = null;
                           }

                           if (85 == var9.field2181 * 1363213817) {
                              if (field407[field391 * -594543677] == null && field391 * -594543677 > 0) {
                                 field391 -= 523390187;
                              }

                              field407[field391 * -594543677] = null;
                           }

                           if (var9.field2175 >= '0' && var9.field2175 <= '9') {
                              field407[-594543677 * field391] = "" + var9.field2175;
                              if (-594543677 * field391 < 7) {
                                 field391 += 523390187;
                              }
                           }

                           if (var9.field2181 * 1363213817 == 84) {
                              boolean var124 = classCN.method2555((byte)-59);
                              if (var124) {
                                 classJB.method6345(50, -1192966987);
                              }

                              return;
                           }
                        }
                     } else {
                        int var34 = 180 + field394 * -511275367 - 80;
                        short var67 = 321;
                        if (1 == var23 && var24 >= var34 - 75 && var24 <= 75 + var34 && var25 >= var67 - 20 && var25 <= 20 + var67) {
                           classUF.method11299(classLZ.method7427("secure", true, -1440110447) + "m=dob/set_dob.ws", (byte)13);
                           classSP.method10624(classKK.field3869, classKK.field3870, classKK.field3762, (byte)-73);
                           classAC.method326(6, 2026455776);
                           return;
                        }

                        var34 = 80 + 180 + field394 * -511275367;
                        if (1 == var23 && var24 >= var34 - 75 && var24 <= var34 + 75 && var25 >= var67 - 20 && var25 <= 20 + var67) {
                           classBJ.method1117(true, -347989319);
                        }
                     }
                  } else if (8 == field384 * -47366135) {
                     int var37 = field394 * -511275367 + 180 - 80;
                     short var69 = 321;
                     if (1 == var23 && var24 >= var37 - 75 && var24 <= 75 + var37 && var25 >= var69 - 20 && var25 <= 20 + var69) {
                        classUF.method11299("https://legal.jagex.com/docs/policies/privacy", (byte)-86);
                        classSP.method10624(classKK.field3869, classKK.field3870, classKK.field3762, (byte)-15);
                        classAC.method326(6, 2092138792);
                        return;
                     }

                     var37 = -511275367 * field394 + 180 + 80;
                     if (var23 == 1 && var24 >= var37 - 75 && var24 <= var37 + 75 && var25 >= var69 - 20 && var25 <= var69 + 20) {
                        classBJ.method1117(true, -347989319);
                     }
                  } else if (field384 * -47366135 == 9) {
                     int var39 = -511275367 * field394 + 180;
                     short var70 = 311;
                     boolean var98 = 1 == var23 && var24 >= var39 - 75 && var24 <= 75 + var39 && var25 >= var70 - 20 && var25 <= 20 + var70;

                     while (var9.method4531((short)10417)) {
                        if (84 == var9.field2181 * 1363213817 || 13 == 1363213817 * var9.field2181) {
                           var98 = true;
                        }
                     }

                     if (var98) {
                        classIV.method6320(false, (byte)-42);
                     }
                  } else if (field384 * -47366135 == 10) {
                     int var40 = field394 * -511275367 + 180;
                     short var71 = 209;
                     boolean var99 = 1 == var23 && var24 >= var40 - 109 && var24 <= 109 + var40 && var25 >= var71 && var25 <= var71 + 68;

                     while (var9.method4531((short)11205)) {
                        if (1363213817 * var9.field2181 == 84) {
                           var99 = true;
                        }
                     }

                     if (var99) {
                        if (classNU.method8146(-1537811462)) {
                           return;
                        }

                        classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-76);
                        client.field898 = classAAP.field92;
                        classXQ.method12875(false, 402128428);
                        classJB.method6345(20, -1192966987);
                     }
                  } else if (12 == -47366135 * field384) {
                     int var41 = classRS.field5838 * 1429288549;
                     int var72 = 233;
                     classUQ var100 = var2.method49(0, 30, classKK.field3900, var41, var72);
                     classUQ var112 = var2.method49(32, 32, classKK.field3900, var41, var72);
                     classUQ var118 = var2.method49(70, 34, classKK.field3900, var41, var72);
                     var72 += 17;
                     classUQ var122 = var2.method49(0, 34, classKK.field3901, var41, var72);
                     if (var23 == 1) {
                        if (var100.method11474(var24, var25, -594779443)) {
                           classUF.method11299("https://legal.jagex.com/docs/terms", (byte)108);
                        } else if (var112.method11474(var24, var25, -594779443)) {
                           classUF.method11299("https://legal.jagex.com/docs/policies/privacy", (byte)-70);
                        } else if (var118.method11474(var24, var25, -594779443) || var122.method11474(var24, var25, -594779443)) {
                           classUF.method11299("https://legal.jagex.com/docs/terms/eula", (byte)47);
                        }
                     }

                     var41 = classRS.field5838 * 1429288549 - 80;
                     short var74 = 311;
                     if (1 == var23 && var24 >= var41 - 75 && var24 <= 75 + var41 && var25 >= var74 - 20 && var25 <= var74 + 20) {
                        classYY.method13791(44185423);
                        classIV.method6320(true, (byte)60);
                     }

                     var41 = 80 + 1429288549 * classRS.field5838;
                     if (var23 == 1 && var24 >= var41 - 75 && var24 <= 75 + var41 && var25 >= var74 - 20 && var25 <= 20 + var74) {
                        field384 = 1641412837;
                     }
                  } else if (13 == -47366135 * field384) {
                     int var44 = classRS.field5838 * 1429288549;
                     short var75 = 321;
                     if (var23 == 1 && var24 >= var44 - 75 && var24 <= 75 + var44 && var25 >= var75 - 20 && var25 <= var75 + 20) {
                        classIV.method6320(true, (byte)-31);
                     }
                  } else if (14 == field384 * -47366135) {
                     String var45 = "";
                     switch (-20437633 * field387) {
                        case 0:
                           var45 = "https://secure.runescape.com/m=offence-appeal/account-history";
                           break;
                        case 1:
                           var45 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                           break;
                        case 2:
                           var45 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                           break;
                        default:
                           classBJ.method1117(false, -347989319);
                     }

                     int var76 = field394 * -511275367 + 180;
                     short var101 = 276;
                     if (1 == var23 && var24 >= var76 - 75 && var24 <= 75 + var76 && var25 >= var101 - 20 && var25 <= 20 + var101) {
                        classUF.method11299(var45, (byte)4);
                        classSP.method10624(classKK.field3869, classKK.field3870, classKK.field3762, (byte)-14);
                        classAC.method326(6, 2021582746);
                        return;
                     }

                     var76 = -511275367 * field394 + 180;
                     var101 = 326;
                     if (1 == var23 && var24 >= var76 - 75 && var24 <= 75 + var76 && var25 >= var101 - 20 && var25 <= var101 + 20) {
                        classBJ.method1117(false, -347989319);
                     }
                  } else if (-47366135 * field384 == 24) {
                     int var46 = -511275367 * field394 + 180;
                     short var78 = 301;
                     if (1 == var23 && var24 >= var46 - 75 && var24 <= 75 + var46 && var25 >= var78 - 20 && var25 <= 20 + var78) {
                        classIV.method6320(false, (byte)-23);
                     }
                  } else if (32 == field384 * -47366135) {
                     int var47 = 180 + field394 * -511275367 - 80;
                     short var79 = 321;
                     if (var23 == 1 && var24 >= var47 - 75 && var24 <= 75 + var47 && var25 >= var79 - 20 && var25 <= 20 + var79) {
                        classUF.method11299(classLZ.method7427("secure", true, -41079728) + "m=dob/set_dob.ws", (byte)-49);
                        classSP.method10624(classKK.field3869, classKK.field3870, classKK.field3762, (byte)-40);
                        classAC.method326(6, 2125473289);
                        return;
                     }

                     var47 = 180 + -511275367 * field394 + 80;
                     if (1 == var23 && var24 >= var47 - 75 && var24 <= 75 + var47 && var25 >= var79 - 20 && var25 <= 20 + var79) {
                        classBJ.method1117(true, -347989319);
                     }
                  } else if (33 == -47366135 * field384) {
                     int var49 = field394 * -511275367 + 180;
                     short var80 = 276;
                     if (1 == var23 && var24 >= var49 - 75 && var24 <= 75 + var49 && var25 >= var80 - 20 && var25 <= var80 + 20) {
                        classUF.method11299(classKK.field3925, (byte)-49);
                     }

                     var49 = -511275367 * field394 + 180;
                     var80 = 326;
                     if (1 == var23 && var24 >= var49 - 75 && var24 <= 75 + var49 && var25 >= var80 - 20 && var25 <= 20 + var80) {
                        classBJ.method1117(true, -347989319);
                     }
                  } else if (34 == field384 * -47366135) {
                     int var51 = -511275367 * field394 + 180;
                     short var82 = 276;
                     if (1 == var23 && var24 >= var51 - 75 && var24 <= var51 + 75 && var25 >= var82 - 20 && var25 <= var82 + 20) {
                        if (classKB.method6447(790233952)) {
                           field413 = true;
                           field408 = 0;
                           field409 = 0;
                        }

                        return;
                     }

                     if (null != classIS.field3054 && classKB.method6447(520143731)) {
                        field413 = true;
                        field408 = 0;
                        field409 = 0;
                     }

                     var51 = 180 + field394 * -511275367;
                     var82 = 326;
                     if (var23 == 1 && var24 >= var51 - 75 && var24 <= 75 + var51 && var25 >= var82 - 20 && var25 <= 20 + var82) {
                        classBJ.method1117(false, -347989319);
                     }
                  } else if (38 == -47366135 * field384) {
                     int var53 = classRS.field5838 * 1429288549;
                     short var84 = 281;
                     classUQ var103 = var1.method51(classKK.field3908, var53, var84);
                     if (1 == var23 && var103.method11474(var24, var25, -594779443)) {
                        classUF.method11299(classKK.field3909, (byte)37);
                        return;
                     }

                     var103.method11467((byte)-79);
                     var53 = classRS.field5838 * 1429288549 - 80;
                     var84 = 321;
                     if (var23 == 1 && var24 >= var53 - 75 && var24 <= 75 + var53 && var25 >= var84 - 20 && var25 <= 20 + var84) {
                        classUF.method11299(classKK.field3925, (byte)37);
                        return;
                     }

                     var53 = 80 + 1429288549 * classRS.field5838;
                     if (var23 == 1 && var24 >= var53 - 75 && var24 <= var53 + 75 && var25 >= var84 - 20 && var25 <= var84 + 20) {
                        classBJ.method1117(true, -347989319);
                        return;
                     }

                     while (var9.method4531((short)-13221)) {
                        if (var9.field2181 * 1363213817 == 84) {
                           classBJ.method1117(true, -347989319);
                           return;
                        }

                        if (var9.field2181 * 1363213817 == 13) {
                           classIV.method6320(true, (byte)50);
                           return;
                        }
                     }
                  }
               } else {
                  while (var9.method4531((short)-6861)) {
                     if (var9.field2181 * 1363213817 == 84 || 13 == 1363213817 * var9.field2181) {
                        classBJ.method1117(true, -347989319);
                     }
                  }

                  short var33 = 321;
                  if (1 == var23 && var25 >= var33 - 20 && var25 <= 20 + var33) {
                     classBJ.method1117(true, -347989319);
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzv;Lzv;Lzv;)V")
   @ObfuscatedName("ck")
   static void method1034(classZV var0, classZV var1, classZV var2) {
      field385 = (773246731 * classSA.field5897 - 1131084549) / 2 * 720492222;
      field394 = 2007709401 * field385 + 1927755610;
      classRS.field5838 = 273549476 + -1487048516 * field394;
      if (field413) {
         classCS.method2618(var0, var1, (byte)126);
      } else {
         classNI.field4673.method13508(field385 * -918010466, 0);
         classFR.field2391.method13508(-457580149 + field385 * -329898575, 0);
         classYZ.method13810(classFP.field2372, 1759241362 + field385 * -329898575 - classFP.field2372.field7121 / 2, 18);
         if (client.field828 * -280874990 == 0 || client.field828 * -44590225 == 5) {
            byte var3 = 20;
            var0.method65(classKK.field3820, 1480045799 * field394 + 180, 245 - var3, 807935480, -1);
            int var4 = -2006335938 - var3;
            classYW.method13707(1196830319 + 1590241782 * field394 - -1701498398, var4, 310167133, 34, 9179409);
            classYW.method13707(180 + field394 * -511275367 - 151, var4 + 1, 302, -485228553, 0);
            classYW.method13698(-1449015562 + field394 * -1977207312 - 1283803281, var4 + 2, field395 * 1758494531, 30, 9179409);
            classYW.method13698(745626899 * field395 + (field394 * -511275367 + 180 - 150), var4 + 2, 2048821098 - field395 * -293129138, 30, 0);
            var0.method65(field392, 180 + -1036442483 * field394, 276 - var3, -792817489, -1);
         }

         if (20 == -44590225 * client.field828) {
            classYZ.method13810(
               classJB.field3120, field394 * -570871336 + -699716641 - classJB.field3120.field7121 / 2, 785169587 - classJB.field3120.field7119 / 2
            );
            int var11 = 201;
            var0.method65(field397, field394 * -511275367 + 255512494, var11, 16776960, 0);
            var11 += 15;
            var0.method65(field398, 262276244 * field394 + 124602931, var11, 2016689982, 0);
            var11 += 15;
            var0.method65(field399, field394 * -511275367 + 180, var11, 16776960, 0);
            var11 += 15;
            var11 += 7;
            if (field384 * -47366135 != 4 && field384 * -434040578 != 10 && 1 != -47366135 * field384) {
               var0.method56(classKK.field3788, -224992398 + field394 * -511275367 - -1951315623, var11, 934925706, 0);
               int var100 = 251703767;
               String var5 = classBQ.method1177(662521639);

               while (var0.method36(var5) > var100) {
                  var5 = var5.substring(0, var5.length() - 1);
               }

               var0.method56(classAAA.method8(var5), 180 + -511275367 * field394 - 2101702998, var11, 16777215, 0);
               var11 += 15;
               String var6 = classSL.method10470(field390, (short)9996);

               while (var0.method36(var6) > var100) {
                  var6 = var6.substring(1);
               }

               var0.method56(classKK.field3838 + var6, 47412999 + -1692522129 * field394 - 108, var11, 874092593, 0);
               var11 += 15;
            }
         }

         if (10 == client.field828 * -44590225 || -44590225 * client.field828 == 11 || client.field828 * -44590225 == 1594984110) {
            classYZ.method13810(classJB.field3120, -511275367 * field394, -48457514);
            if (1294782112 * field384 == 0) {
               int var18 = 251;
               var0.method65(classKK.field3878, 1784322 + field394 * -511275367, var18, 16776960, 0);
               var18 += 30;
               int var101 = 180 + field394 * 1420202706 - 1429922573;
               short var139 = 291;
               classYZ.method13810(classKA.field3514, var101 - 73, var139 - 20);
               var0.method66(classKK.field3851, var101 - 73, var139 - 20, -589051593, 40, -1895873899, 0, 1, 1, 0);
               var101 = -2090731978 + -511275367 * field394 + 80;
               classYZ.method13810(classKA.field3514, var101 - 73, var139 - 20);
               var0.method66(classKK.field3852, var101 - 1042619399, var139 - 20, -1141962396, -1267570485, 515675746, 0, 1, 1, 0);
            } else if (-47366135 * field384 == 1) {
               var0.method65(field396, -335116810 + 477722604 * field394, 201, 1639424637, 0);
               int var20 = 236;
               var0.method65(field397, 471596656 + field394 * -390706832, var20, 16777215, 0);
               var20 += 15;
               var0.method65(field398, field394 * 203226939 + 180, var20, 520283740, 0);
               var20 += 15;
               var0.method65(field399, field394 * -511275367 + 126916962, var20, 297794538, 0);
               var20 += 15;
               int var103 = -1036394557 * field394 + 434324923 - -847433384;
               short var140 = 321;
               classYZ.method13810(classKA.field3514, var103 - -1936434406, var140 - 20);
               var0.method65(classKK.field3777, var103, var140 + 5, 1790138908, 0);
               var103 = 965392693 + 180 + 1321051376 * field394;
               classYZ.method13810(classKA.field3514, var103 - 560104424, var140 - 20);
               var0.method65(classKK.field3854, var103, 5 + var140, 16777215, 0);
            } else if (-47366135 * field384 == 2) {
               int var24 = 201;
               var0.method65(field397, 1182407941 * classRS.field5838, var24, -1923227900, 0);
               var24 += 15;
               var0.method65(field398, 1429288549 * classRS.field5838, var24, 337335160, 0);
               var24 += 15;
               var0.method65(field399, classRS.field5838 * -1339748935, var24, 16776960, 0);
               var24 += 15;
               var24 += 7;
               var0.method56(classKK.field3788, 1429288549 * classRS.field5838 - 1826396620, var24, -597470380, 0);
               int var105 = 1945561724;
               String var141 = classBQ.method1177(-1910047082);

               while (var0.method36(var141) > var105) {
                  var141 = var141.substring(1);
               }

               var0.method56(
                  classAAA.method8(var141)
                     + (
                        0 == field403 * 916717190 & 1857471468 * client.field855 % -118364587 < 20
                           ? classQY.method9847(591329361, (byte)32) + classDO.field1589
                           : ""
                     ),
                  classRS.field5838 * -935640214 - 816150437,
                  var24,
                  16777215,
                  0
               );
               var24 += 15;
               String var161 = classSL.method10470(field390, (short)-11117);

               while (var0.method36(var161) > var105) {
                  var161 = var161.substring(1);
               }

               var0.method56(
                  classKK.field3838
                     + var161
                     + (
                        field403 * -1187692459 == 1 & 1612595797 * client.field855 % 1898320819 < 20
                           ? classQY.method9847(1121394401, (byte)38) + classDO.field1589
                           : ""
                     ),
                  234732962 * classRS.field5838 - 1537343270,
                  var24,
                  16777215,
                  0
               );
               var24 += 15;
               var24 = 2034140217;
               int var7 = -117 + -821193709 * classRS.field5838;
               classYZ var8 = classLF.method6779(client.field832, field401, 1714764314);
               classYZ.method13810(var8, var7, var24);
               var7 += var8.field7121 + 5;
               var1.method56(classKK.field3669, var7, 13 + var24, 16776960, 0);
               var7 = classRS.field5838 * 1429288549 + 24;
               var8 = classLF.method6779(classCY.method2724(classAB.field122, (short)-5967), field406, 164948057);
               classYZ.method13810(var8, var7, var24);
               var7 += var8.field7121 + 5;
               var1.method56(classKK.field3648, var7, 13 + var24, -615649471, 0);
               var24 += 15;
               int var9 = 1429288549 * classRS.field5838 - 80;
               short var10 = 321;
               classYZ.method13810(classKA.field3514, var9 - -1335687776, var10 - 20);
               var0.method65(classKK.field3709, var9, 5 + var10, 16777215, 0);
               var9 = -1125313134 * classRS.field5838 + -758855877;
               classYZ.method13810(classKA.field3514, var9 - -1359430765, var10 - 20);
               var0.method65(classKK.field3854, var9, 5 + var10, 360659426, 0);
               short var33 = 357;
               switch (-323997799 * field388) {
                  case 2:
                     classJH.field3158 = classKK.field3868;
                     break;
                  default:
                     classJH.field3158 = classKK.field3866;
               }

               classWR.field6770 = new classUQ(1429288549 * classRS.field5838, var33, var1.method36(classJH.field3158), 11);
               classLB.field4089 = new classUQ(1429288549 * classRS.field5838, var33, var1.method36(classKK.field3867), 11);
               var1.method65(classJH.field3158, classRS.field5838 * 1429288549, var33, 1597580725, 0);
            } else if (3 == 744479829 * field384) {
               int var34 = -812916649;
               var0.method65(classKK.field3924, -511275367 * field394 + -449923283, var34, -912342096, 0);
               var34 += 20;
               var1.method65(classKK.field3858, -511275367 * field394 + -1780143085, var34, 16776960, 0);
               var34 += 20;
               var1.method65(classKK.field3859, 1906241305 + field394 * -511275367, var34, 16776960, 0);
               var34 += 15;
               int var106 = 473221849 + field394 * -511275367;
               int var142 = 259257879;
               classYZ.method13810(classKA.field3514, var106 - 73, var142 - 20);
               var2.method65(classKK.field3860, var106, 5 + var142, 160558504, 0);
               var106 = 180 + field394 * -110202849;
               short var143 = 326;
               classYZ.method13810(classKA.field3514, var106 - 73, var143 - 20);
               var2.method65(classKK.field3861, var106, 5 + var143, -846584686, 0);
            } else if (-47366135 * field384 == 4) {
               var0.method65(classKK.field3837, -511275367 * field394 + -1992233241, 1941028772, 16776960, 0);
               int var38 = 236;
               var0.method65(field397, 1949303819 + field394 * 1489063158, var38, -851308657, 0);
               var38 += 15;
               var0.method65(field398, field394 * -511275367 + 180, var38, -1321538616, 0);
               var38 += 15;
               var0.method65(field399, -640598417 + field394 * -1294010063, var38, 16777215, 0);
               var38 += 15;
               var0.method56(
                  classKK.field3849
                     + classSL.method10470(classQP.field5586, (short)10712)
                     + (client.field855 * -854700000 % 40 < 20 ? classQY.method9847(-1475982407, (byte)50) + classDO.field1589 : ""),
                  -2120068131 * field394 + 180 - 108,
                  var38,
                  -267642608,
                  0
               );
               var38 -= 8;
               var0.method56(classKK.field3616, -511275367 * field394 + 267054851 - 9, var38, 16776960, 0);
               var38 += 15;
               var0.method56(classKK.field3617, -511275367 * field394 + 180 - 9, var38, 16776960, 0);
               int var108 = -1140636516 + field394 * -511275367 - 9 + var0.method36(classKK.field3617) + 15;
               int var144 = var38 - var0.field8;
               classYZ var162;
               if (field393) {
                  var162 = classEK.field1779;
               } else {
                  var162 = classCK.field778;
               }

               classYZ.method13810(var162, var108, var144);
               var38 += 15;
               int var173 = 180 + -511275367 * field394 - 80;
               int var180 = -1810191382;
               classYZ.method13810(classKA.field3514, var173 - -1602904552, var180 - 20);
               var0.method65(classKK.field3777, var173, 5 + var180, 16777215, 0);
               var173 = -579453502 + field394 * -511275367 + 180;
               classYZ.method13810(classKA.field3514, var173 - -1428110483, var180 - 20);
               var0.method65(classKK.field3854, var173, var180 + 5, -672554990, 0);
               var1.method65(classKK.field3866, 180 + -511275367 * field394, 1171286367 + var180, 16777215, 0);
            } else if (field384 * 1379847843 == 5) {
               var0.method65(classKK.field3862, -511275367 * field394 + 180, 644242555, -801972086, 0);
               int var45 = 221;
               var2.method65(field397, -1714141921 * field394 + 180, var45, 16776960, 0);
               var45 += 15;
               var2.method65(field398, -625247436 * field394 + 180, var45, 16776960, 0);
               var45 += 15;
               var2.method65(field399, 180 + 1532601068 * field394, var45, 16776960, 0);
               var45 += 15;
               var45 += 14;
               var0.method56(classKK.field3875, 1727484029 * field394 + 180 - -716288027, var45, 16777215, 0);
               short var109 = 174;
               String var145 = classBQ.method1177(-1706828169);

               while (var0.method36(var145) > var109) {
                  var145 = var145.substring(1);
               }

               var0.method56(
                  classAAA.method8(var145)
                     + (1612595797 * client.field855 % -916548152 < 20 ? classQY.method9847(-1203829417, (byte)52) + classDO.field1589 : ""),
                  139053051 * field394 + 180 - 1498494551,
                  var45,
                  -1387998647,
                  0
               );
               var45 += 15;
               int var163 = field394 * 829972991 + 1498050109 - -596233114;
               int var175 = -481485593;
               classYZ.method13810(classKA.field3514, var163 - 1502714650, var175 - 20);
               var0.method65(classKK.field3864, var163, 5 + var175, 16777215, 0);
               var163 = 80 + field394 * 2100436785 + -1345649424;
               classYZ.method13810(classKA.field3514, var163 - 204515538, var175 - 20);
               var0.method65(classKK.field3865, var163, 5 + var175, -970168494, 0);
               short var176 = 356;
               var1.method65(classKK.field3867, classRS.field5838 * 1429288549, var176, 268435455, 0);
            } else if (field384 * 1626626773 == 6) {
               int var51 = -2046700811;
               var0.method65(field397, 1718595516 * field394 + 180, var51, -1003468442, 0);
               var51 += 15;
               var0.method65(field398, field394 * 1817062624 + 180, var51, -448395677, 0);
               var51 += 15;
               var0.method65(field399, field394 * 1212807811 + 697833220, var51, -1621319646, 0);
               var51 += 15;
               int var110 = -689087509 * field394 + 180;
               short var146 = 321;
               classYZ.method13810(classKA.field3514, var110 - 73, var146 - 20);
               var0.method65(classKK.field3865, var110, 5 + var146, 16777215, 0);
            } else if (7 == 1383821149 * field384) {
               if (client.field1134 && !client.field890) {
                  int var59 = 1500538496;
                  var0.method65(field397, 1429288549 * classRS.field5838, var59, -1659270328, 0);
                  var59 += 15;
                  var0.method65(field398, 1429288549 * classRS.field5838, var59, 575222146, 0);
                  var59 += 15;
                  var0.method65(field399, 1429288549 * classRS.field5838, var59, -1542193426, 0);
                  int var113 = 1362152428 * classRS.field5838 - 150;
                  var59 += 10;

                  for (int var148 = 0; var148 < 8; var148++) {
                     classKA.field3514.method13812(var113, var59, 30, 645364600);
                     boolean var165 = field391 * -594543677 == var148 & 593081986 * client.field855 % -1711181804 < 20;
                     var0.method56(
                        (field407[var148] == null ? "" : field407[var148]) + (var165 ? classQY.method9847(1390750973, (byte)114) + classDO.field1589 : ""),
                        10 + var113,
                        27 + var59,
                        16777215,
                        0
                     );
                     if (var148 != 1 && 3 != var148) {
                        var113 += 35;
                     } else {
                        var113 += 50;
                        var0.method56(classAAA.method8("/"), var113 - 13, 27 + var59, 766942275, 0);
                     }
                  }

                  int var149 = classRS.field5838 * 1429288549 - 80;
                  int var166 = 913704320;
                  classYZ.method13810(classKA.field3514, var149 - -1939460916, var166 - 20);
                  var0.method65("Submit", var149, 5 + var166, 16777215, 0);
                  var149 = 1429288549 * classRS.field5838 + 80;
                  classYZ.method13810(classKA.field3514, var149 - 73, var166 - 20);
                  var0.method65(classKK.field3854, var149, 5 + var166, 289005222, 0);
               } else {
                  int var55 = 216;
                  var0.method65(classKK.field3892, field394 * -511275367 + -1590372234, var55, 1310195382, 0);
                  var55 += 15;
                  var2.method65(classKK.field3893, field394 * -511275367 + 1837931750, var55, 185958801, 0);
                  var55 += 15;
                  var2.method65(classKK.field3633, 180 + -511275367 * field394, var55, -1365038012, 0);
                  var55 += 15;
                  int var111 = 180 + field394 * 228791866 - 80;
                  short var147 = 321;
                  classYZ.method13810(classKA.field3514, var111 - -2041692605, var147 - 20);
                  var0.method65(classKK.field3895, var111, var147 + 5, -782094473, 0);
                  var111 = 180 + -511275367 * field394 + 80;
                  classYZ.method13810(classKA.field3514, var111 - 1280422970, var147 - 20);
                  var0.method65(classKK.field3865, var111, 5 + var147, -735079344, 0);
               }
            } else if (8 == -47366135 * field384) {
               int var63 = 1333139687;
               var0.method65(classKK.field3613, 1707910678 + field394 * 212825472, var63, 16776960, 0);
               var63 += 15;
               var2.method65(classKK.field3749, 180 + -511275367 * field394, var63, 16776960, 0);
               var63 += 15;
               var2.method65(classKK.field3750, 180 + 675646157 * field394, var63, 16776960, 0);
               var63 += 15;
               int var114 = -511275367 * field394 + 180 - 80;
               short var151 = 321;
               classYZ.method13810(classKA.field3514, var114 - 73, var151 - 20);
               var0.method65(classKK.field3751, var114, var151 + 5, -2001349019, 0);
               var114 = 80 + -511275367 * field394 + 180;
               classYZ.method13810(classKA.field3514, var114 - 974495066, var151 - 20);
               var0.method65(classKK.field3865, var114, 5 + var151, 16777215, 0);
            } else if (9 == -1357373007 * field384) {
               int var67 = 2123022369;
               var0.method65(field397, -1073913936 + 1719962724 * field394, var67, 16776960, 0);
               var67 += 25;
               var0.method65(field398, -1030067331 + -511275367 * field394, var67, -2015000797, 0);
               var67 += 25;
               var0.method65(field399, -1098811491 + -511275367 * field394, var67, 880788078, 0);
               int var116 = field394 * 2122465052 + 180;
               int var152 = 1420588668;
               classYZ.method13810(classKA.field3514, var116 - 73, var152 - 20);
               var0.method65(classKK.field3860, var116, var152 + 5, 16777215, 0);
            } else if (10 == 1859767338 * field384) {
               int var70 = 180 + -511275367 * field394;
               int var117 = 209;
               var0.method65(classKK.field3878, field394 * -1015984853 + -615449417, var117, -628135529, 0);
               var117 += 20;
               classYZ.method13810(classGQ.field2655, var70 - 109, var117);
               if (field412.isEmpty()) {
                  classYZ.method13810(classQH.field5544, var70 - 1683566575, 18 + var117);
               } else {
                  classYZ.method13810(classQH.field5544, var70 - 48, var117 + 5);
                  var0.method65(field412, var70, 784228926 + var117 - 15, 16776960, 0);
               }
            } else if (1231588691 * field384 == 12) {
               int var71 = -659052429 * classRS.field5838;
               int var119 = 216;
               var2.method65(classKK.field3899, var71, var119, 16777215, 0);
               var119 += 17;
               var2.method65(classKK.field3900, var71, var119, 16777215, 0);
               var119 += 17;
               var2.method65(classKK.field3901, var71, var119, 16777215, 0);
               var119 += 17;
               var2.method65(classKK.field3902, var71, var119, 16777215, 0);
               var71 = -1511449902 * classRS.field5838 - 80;
               var119 = 1319791617;
               classYZ.method13810(classKA.field3514, var71 - 73, var119 - 20);
               var0.method65(classKK.field3910, var71, var119 + 5, 1628073010, 0);
               var71 = classRS.field5838 * 1429288549 + 80;
               classYZ.method13810(classKA.field3514, var71 - 73, var119 - 20);
               var0.method65(classKK.field3911, var71, 5 + var119, 16777215, 0);
            } else if (13 == field384 * -47366135) {
               int var74 = 1086076284;
               var2.method65(classKK.field3903, -1954857712 + -511275367 * field394, var74, 16777215, 0);
               var74 += 20;
               var2.method65(classKK.field3904, 795096365 * field394 + 180, var74, 16777215, 0);
               int var124 = -109147146 + -719546725 * field394;
               var74 = 1662992570;
               classYZ.method13810(classKA.field3514, var124 - 73, var74 - 20);
               var0.method65(classKK.field3865, var124, var74 + 5, 16777215, 0);
            } else if (14 == field384 * -101961388) {
               int var77 = 201;
               String var125 = "";
               String var153 = "";
               String var167 = "";
               switch (-20437633 * field387) {
                  case 0:
                     var125 = classKK.field3907;
                     var153 = classKK.field3662;
                     var167 = classKK.field3663;
                     break;
                  case 1:
                     var125 = classKK.field3700;
                     var153 = classKK.field3701;
                     var167 = classKK.field3702;
                     break;
                  case 2:
                     var125 = classKK.field3784;
                     var153 = classKK.field3897;
                     var167 = classKK.field3622;
                     break;
                  default:
                     classBJ.method1117(false, -347989319);
               }

               var0.method65(var125, field394 * 1525469810 + 180, var77, 16776960, 0);
               var77 += 20;
               var0.method65(var153, 180 + field394 * -511275367, var77, 1835528424, 0);
               var77 += 20;
               var0.method65(var167, 180 + field394 * 1830065618, var77, 16776960, 0);
               int var177 = 180 + field394 * 1742724931;
               int var181 = -1422727666;
               classYZ.method13810(classKA.field3514, var177 - 1836375793, var181 - 20);
               if (1 == -20437633 * field387) {
                  var0.method65(classKK.field3645, var177, var181 + 5, 527666446, 0);
               } else {
                  var0.method65(classKK.field3710, var177, 5 + var181, 16777215, 0);
               }

               var177 = 136475424 * field394 + 180;
               short var182 = 326;
               classYZ.method13810(classKA.field3514, var177 - 73, var182 - 20);
               var0.method65(classKK.field3865, var177, 5 + var182, -797881469, 0);
            } else if (24 == -47366135 * field384) {
               int var80 = 126920361;
               var0.method65(field397, -97731202 * field394 + 180, var80, 16777215, 0);
               var80 += 15;
               var0.method65(field398, field394 * -314548694 + 180, var80, 16777215, 0);
               var80 += 15;
               var0.method65(field399, -511275367 * field394 + 180, var80, 16777215, 0);
               var80 += 15;
               int var126 = -707192948 * field394 + 180;
               int var154 = 1571813227;
               classYZ.method13810(classKA.field3514, var126 - -1907455797, var154 - 20);
               var0.method65(classKK.field3795, var126, 5 + var154, 16777215, 0);
            } else if (32 == field384 * -1638485176) {
               int var84 = 216;
               var0.method65(classKK.field3892, field394 * 1773237363 + 38680934, var84, 16776960, 0);
               var84 += 15;
               var2.method65(classKK.field3893, field394 * -1842270291 + 180, var84, 16776960, 0);
               var84 += 15;
               var2.method65(classKK.field3633, -1772001207 + field394 * -1761888455, var84, 16776960, 0);
               var84 += 15;
               int var127 = -1548992256 + field394 * -511275367 - -1811343017;
               int var155 = -1096467379;
               classYZ.method13810(classKA.field3514, var127 - 1760477534, var155 - 20);
               var0.method65(classKK.field3895, var127, 5 + var155, 16777215, 0);
               var127 = 1391245649 * field394 + 180 + -742532449;
               classYZ.method13810(classKA.field3514, var127 - -755815113, var155 - 20);
               var0.method65(classKK.field3865, var127, 5 + var155, 16777215, 0);
            } else if (33 == -1137910153 * field384) {
               int var88 = 201;
               var0.method65(field397, 337117778 * field394 + 180, var88, 1298173261, 0);
               var88 += 20;
               var1.method65(field398, -48552344 + -511275367 * field394, var88, 16776960, 0);
               var88 += 20;
               var1.method65(field399, 1537870605 * field394 + 180, var88, 1027137124, 0);
               var88 += 15;
               int var129 = field394 * 129767771 + 180;
               int var156 = 276;
               classYZ.method13810(classKA.field3514, var129 - 73, var156 - 20);
               var2.method65(classKK.field3736, var129, var156 + 5, 16777215, 0);
               var129 = field394 * -511275367 + -1536818220;
               var156 = 178394409;
               classYZ.method13810(classKA.field3514, var129 - 73, var156 - 20);
               var2.method65(classKK.field3865, var129, 5 + var156, 1155510458, 0);
            } else if (field384 * -47366135 == -863443001) {
               int var92 = -1168271830;
               var0.method65(field397, 140468799 + field394 * -511275367, var92, 1248320482, 0);
               var92 += 20;
               var1.method65(field398, 180 + field394 * 1068749598, var92, 16776960, 0);
               var92 += 20;
               var1.method65(field399, field394 * -511275367 + -608961884, var92, 16776960, 0);
               int var131 = 180 + field394 * 302218409;
               int var158 = 1074409470;
               classYZ.method13810(classKA.field3514, var131 - 1092248761, var158 - 20);
               String var168 = classIS.field3054 != null ? classKK.field3921 : classKK.field3786;
               var2.method65(var168, var131, var158 + 5, 16777215, 0);
               var131 = -511275367 * field394 + 180;
               short var159 = 326;
               classYZ.method13810(classKA.field3514, var131 - 383617617, var159 - 20);
               var2.method65(classKK.field3865, var131, var159 + 5, -1627316566, 0);
            } else if (38 == field384 * -1445805556) {
               int var95 = classRS.field5838 * 1429288549;
               int var133 = -535944833;
               var0.method65(classKK.field3759, var95, var133, 16776960, 0);
               var133 += 25;
               var1.method65(classKK.field3656, var95, var133, -916142410, 0);
               var133 += 20;
               var1.method65(classKK.field3877, var95, var133, 1828930689, 0);
               var133 += 20;
               var1.method65(classKK.field3908, var95, var133, 522873385, 0);
               var95 = 1429288549 * classRS.field5838 - 573417590;
               var133 = -156538164;
               classYZ.method13810(classKA.field3514, var95 - 518342554, var133 - 20);
               var0.method65(classKK.field3736, var95, 5 + var133, 16777215, 0);
               var95 = -504219350 + -675166993 * classRS.field5838;
               classYZ.method13810(classKA.field3514, var95 - 903396607, var133 - 20);
               var0.method65(classKK.field3709, var95, 5 + var133, 16777215, 0);
            }
         }

         if (-1341454611 * client.field828 >= 10) {
            int[] var98 = new int[4];
            classYW.method13675(var98);
            classYW.method13671(field385 * -2032062330, 0, -329898575 * field385 + 765, -2069016894 * classEU.field1938);
            classML.field4531.method2619(field385 * -329898575 - 22, client.field855 * 708061574, 1698595949);
            classML.field4531.method2619(765 + -329898575 * field385 + 22 - 128, client.field855 * 2101438123, 1698595949);
            classYW.method13679(var98);
         }

         classYZ.method13810(classCG.field733[classAB.field122.method2732((byte)109) ? 1 : 0], -700798436 + -329898575 * field385 - -1002065549, 463);
         if (-44590225 * client.field828 > 5 && classLU.field4232 == classXO.field6892) {
            if (classFJ.field2294 != null) {
               int var99 = 1442291896 * field385 + 5;
               int var138 = 1498922825;
               byte var160 = 100;
               byte var169 = 35;
               classYZ.method13810(classFJ.field2294, var99, var138);
               var0.method65(classKK.field3790 + " " + client.field827 * 1311484143, var99 + var160 / 2, var138 + var169 / 2 - 2, 16777215, 0);
               if (null != classIS.field3054) {
                  var1.method65(classKK.field3921, var99 + var160 / 2, 12 + var169 / 2 + var138, -1846162309, 0);
               } else {
                  var1.method65(classKK.field3817, var99 + var160 / 2, var138 + var169 / 2 + 12, 16777215, 0);
               }
            } else {
               classFJ.field2294 = classSU.method10680(classHC.field2767, "sl_button", "", -1771673613);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzv;Lzv;Lzv;)V")
   @ObfuscatedName("ca")
   static void method1035(classZV var0, classZV var1, classZV var2) {
      field385 = (773246731 * classSA.field5897 - -393078566) / 2 * 87864371;
      field394 = 2007709401 * field385 + 1927755610;
      classRS.field5838 = -1746170077 + -948983239 * field394;
      if (field413) {
         classCS.method2618(var0, var1, (byte)4);
      } else {
         classNI.field4673.method13508(field385 * -1661456004, 0);
         classFR.field2391.method13508(-663818722 + field385 * -732336348, 0);
         classYZ.method13810(classFP.field2372, 1684415470 + field385 * 408960670 - classFP.field2372.field7121 / 2, 18);
         if (client.field828 * -204561754 == 0 || client.field828 * 1646822502 == 5) {
            byte var3 = 20;
            var0.method65(classKK.field3820, -1800123830 * field394 + 180, 245 - var3, -1116489866, -1);
            int var4 = 253 - var3;
            classYW.method13707(180 + -511275367 * field394 - 2144452806, var4, 304, 34, -562605477);
            classYW.method13707(180 + field394 * 741948583 - 151, var4 + 1, -2113878038, 32, 0);
            classYW.method13698(180 + field394 * 13419645 - 150, var4 + 2, field395 * -1633092332, 30, 9179409);
            classYW.method13698(-956929708 * field395 + (field394 * -511275367 + 180 - 88341582), var4 + 2, -16816697 - field395 * 1758494531, 30, 0);
            var0.method65(field392, 1232105783 + 2133838199 * field394, 1015364052 - var3, -63003792, -1);
         }

         if (20 == 1828858704 * client.field828) {
            classYZ.method13810(classJB.field3120, field394 * -511275367 + 180 - classJB.field3120.field7121 / 2, 271 - classJB.field3120.field7119 / 2);
            int var11 = 201;
            var0.method65(field397, field394 * -511275367 + 358056881, var11, 16776960, 0);
            var11 += 15;
            var0.method65(field398, 1425151201 * field394 + 180, var11, 476479948, 0);
            var11 += 15;
            var0.method65(field399, field394 * -511275367 + 180, var11, 16776960, 0);
            var11 += 15;
            var11 += 7;
            if (field384 * -47366135 != 4 && field384 * 979309161 != 10 && 1 != -47366135 * field384) {
               var0.method56(classKK.field3788, -1840947873 + field394 * -511275367 - 110, var11, 16777215, 0);
               int var100 = 1573429823;
               String var5 = classBQ.method1177(-1137886805);

               while (var0.method36(var5) > var100) {
                  var5 = var5.substring(0, var5.length() - 1);
               }

               var0.method56(classAAA.method8(var5), 1773298741 + -511275367 * field394 - 70, var11, -1346391396, 0);
               var11 += 15;
               String var6 = classSL.method10470(field390, (short)-13248);

               while (var0.method36(var6) > var100) {
                  var6 = var6.substring(1);
               }

               var0.method56(classKK.field3838 + var6, 1169300183 + -899133898 * field394 - 1433306790, var11, -1791937421, 0);
               var11 += 15;
            }
         }

         if (10 == client.field828 * -44590225 || -44590225 * client.field828 == 11 || client.field828 * -44590225 == 50) {
            classYZ.method13810(classJB.field3120, 1346605585 * field394, 955202033);
            if (1221978837 * field384 == 0) {
               int var18 = 251;
               var0.method65(classKK.field3878, 180 + field394 * -511275367, var18, 16776960, 0);
               var18 += 30;
               int var101 = 180 + field394 * -511275367 - 1697082701;
               int var139 = -1783105289;
               classYZ.method13810(classKA.field3514, var101 - 1963485774, var139 - 20);
               var0.method66(classKK.field3851, var101 - 1520160389, var139 - 20, 144, 1715784783, 16777215, 0, 1, 1, 0);
               var101 = 180 + 502126206 * field394 + 80;
               classYZ.method13810(classKA.field3514, var101 - 73, var139 - 20);
               var0.method66(classKK.field3852, var101 - 73, var139 - 20, 144, 40, -1878386831, 0, 1, 1, 0);
            } else if (-47366135 * field384 == 1) {
               var0.method65(field396, 180 + -511275367 * field394, 201, 619902813, 0);
               int var20 = -1683578874;
               var0.method65(field397, 1827188165 + field394 * -511275367, var20, 331754410, 0);
               var20 += 15;
               var0.method65(field398, field394 * -511275367 + 180, var20, -50469683, 0);
               var20 += 15;
               var0.method65(field399, field394 * -2023198662 + 391357984, var20, 305744876, 0);
               var20 += 15;
               int var103 = 1579477914 * field394 + 180 - -1677046028;
               short var140 = 321;
               classYZ.method13810(classKA.field3514, var103 - 1103392854, var140 - 20);
               var0.method65(classKK.field3777, var103, var140 + 5, 16777215, 0);
               var103 = 80 + 180 + 1652940705 * field394;
               classYZ.method13810(classKA.field3514, var103 - -1696637224, var140 - 20);
               var0.method65(classKK.field3854, var103, 5 + var140, 387468185, 0);
            } else if (-47366135 * field384 == 2) {
               int var24 = 201;
               var0.method65(field397, -824161127 * classRS.field5838, var24, -265265166, 0);
               var24 += 15;
               var0.method65(field398, 1429288549 * classRS.field5838, var24, 16776960, 0);
               var24 += 15;
               var0.method65(field399, classRS.field5838 * -1035525718, var24, 16776960, 0);
               var24 += 15;
               var24 += 7;
               var0.method56(classKK.field3788, -907051800 * classRS.field5838 - -497047783, var24, 16777215, 0);
               short var105 = 200;
               String var141 = classBQ.method1177(-251419245);

               while (var0.method36(var141) > var105) {
                  var141 = var141.substring(1);
               }

               var0.method56(
                  classAAA.method8(var141)
                     + (0 == field403 * 1711624139 & -1512452017 * client.field855 % 40 < 20 ? classQY.method9847(16776960, (byte)23) + classDO.field1589 : ""),
                  classRS.field5838 * 1429288549 - 70,
                  var24,
                  16777215,
                  0
               );
               var24 += 15;
               String var161 = classSL.method10470(field390, (short)-5319);

               while (var0.method36(var161) > var105) {
                  var161 = var161.substring(1);
               }

               var0.method56(
                  classKK.field3838
                     + var161
                     + (
                        field403 * -1187692459 == 1 & -1720131858 * client.field855 % -561185502 < 20
                           ? classQY.method9847(-2838962, (byte)9) + classDO.field1589
                           : ""
                     ),
                  1429288549 * classRS.field5838 - -1963381044,
                  var24,
                  16777215,
                  0
               );
               var24 += 15;
               var24 = -1695284784;
               int var7 = -1788063647 + 91654015 * classRS.field5838;
               classYZ var8 = classLF.method6779(client.field832, field401, 2006070908);
               classYZ.method13810(var8, var7, var24);
               var7 += var8.field7121 + 5;
               var1.method56(classKK.field3669, var7, 13 + var24, 16776960, 0);
               var7 = classRS.field5838 * 1429288549 + 24;
               var8 = classLF.method6779(classCY.method2724(classAB.field122, (short)-914), field406, 786111277);
               classYZ.method13810(var8, var7, var24);
               var7 += var8.field7121 + 5;
               var1.method56(classKK.field3648, var7, 13 + var24, 638894803, 0);
               var24 += 15;
               int var9 = 1019763638 * classRS.field5838 - 1732578827;
               int var10 = -34966949;
               classYZ.method13810(classKA.field3514, var9 - 73, var10 - 20);
               var0.method65(classKK.field3709, var9, 5 + var10, 16777215, 0);
               var9 = 1429288549 * classRS.field5838 + -1225238543;
               classYZ.method13810(classKA.field3514, var9 - 73, var10 - 20);
               var0.method65(classKK.field3854, var9, 5 + var10, 16777215, 0);
               var24 = 1033168789;
               switch (717824562 * field388) {
                  case 2:
                     classJH.field3158 = classKK.field3868;
                     break;
                  default:
                     classJH.field3158 = classKK.field3866;
               }

               classWR.field6770 = new classUQ(1429288549 * classRS.field5838, var24, var1.method36(classJH.field3158), 11);
               classLB.field4089 = new classUQ(-90520304 * classRS.field5838, var24, var1.method36(classKK.field3867), 11);
               var1.method65(classJH.field3158, classRS.field5838 * 1728212662, var24, 16777215, 0);
            } else if (3 == -47366135 * field384) {
               int var34 = 1857541199;
               var0.method65(classKK.field3924, 187083812 * field394 + 2044534973, var34, -2114728598, 0);
               var34 += 20;
               var1.method65(classKK.field3858, 295250536 * field394 + 180, var34, 16776960, 0);
               var34 += 20;
               var1.method65(classKK.field3859, 180 + field394 * -1143057377, var34, 16776960, 0);
               var34 += 15;
               int var106 = 180 + field394 * -511275367;
               short var142 = 276;
               classYZ.method13810(classKA.field3514, var106 - -1265774712, var142 - 20);
               var2.method65(classKK.field3860, var106, 5 + var142, 16777215, 0);
               var106 = 290350579 + field394 * -511275367;
               var142 = 326;
               classYZ.method13810(classKA.field3514, var106 - 1446134918, var142 - 20);
               var2.method65(classKK.field3861, var106, 5 + var142, 1798221629, 0);
            } else if (-47366135 * field384 == 4) {
               var0.method65(classKK.field3837, -170091408 * field394 + 1653024785, -21581335, 16776960, 0);
               int var38 = -1961378536;
               var0.method65(field397, 462381125 + field394 * -511275367, var38, 16777215, 0);
               var38 += 15;
               var0.method65(field398, field394 * -511275367 + 206750515, var38, 16777215, 0);
               var38 += 15;
               var0.method65(field399, -1538920462 + field394 * 1248030699, var38, 159160697, 0);
               var38 += 15;
               var0.method56(
                  classKK.field3849
                     + classSL.method10470(classQP.field5586, (short)5637)
                     + (client.field855 * 1612595797 % -49229367 < 20 ? classQY.method9847(16776960, (byte)91) + classDO.field1589 : ""),
                  -511275367 * field394 + 180 - 108,
                  var38,
                  16777215,
                  0
               );
               var38 -= 8;
               var0.method56(classKK.field3616, -511275367 * field394 + 180 - 9, var38, 356112289, 0);
               var38 += 15;
               var0.method56(classKK.field3617, -1399595207 * field394 + -1952396490 - 9, var38, 16776960, 0);
               int var108 = 2105170028 + field394 * -511275367 - 9 + var0.method36(classKK.field3617) + 15;
               int var144 = var38 - var0.field8;
               classYZ var162;
               if (field393) {
                  var162 = classEK.field1779;
               } else {
                  var162 = classCK.field778;
               }

               classYZ.method13810(var162, var108, var144);
               var38 += 15;
               int var173 = 1715198656 + -985898001 * field394 - 80;
               short var180 = 321;
               classYZ.method13810(classKA.field3514, var173 - -2021581440, var180 - 20);
               var0.method65(classKK.field3777, var173, 5 + var180, 1204651148, 0);
               var173 = 80 + field394 * -511275367 + 180;
               classYZ.method13810(classKA.field3514, var173 - 155037486, var180 - 20);
               var0.method65(classKK.field3854, var173, var180 + 5, 16777215, 0);
               var1.method65(classKK.field3866, 180 + 2095141580 * field394, 1515263394 + var180, 16777215, 0);
            } else if (field384 * -47366135 == 5) {
               var0.method65(classKK.field3862, 2125049647 * field394 + 180, -574319089, 16776960, 0);
               int var45 = -523747447;
               var2.method65(field397, -511275367 * field394 + 1625804614, var45, -1322761325, 0);
               var45 += 15;
               var2.method65(field398, -511275367 * field394 + 180, var45, 16776960, 0);
               var45 += 15;
               var2.method65(field399, 180 + -511275367 * field394, var45, 16776960, 0);
               var45 += 15;
               var45 += 14;
               var0.method56(classKK.field3875, -511275367 * field394 + 180 - -645192264, var45, 16777215, 0);
               int var109 = 1642534314;
               String var145 = classBQ.method1177(-704056907);

               while (var0.method36(var145) > var109) {
                  var145 = var145.substring(1);
               }

               var0.method56(
                  classAAA.method8(var145) + (1612595797 * client.field855 % 40 < 20 ? classQY.method9847(16776960, (byte)120) + classDO.field1589 : ""),
                  -714763971 * field394 + -1817634479 - -1980305972,
                  var45,
                  16777215,
                  0
               );
               var45 += 15;
               int var163 = field394 * 1768726134 + -654557357 - 14371923;
               int var175 = 321;
               classYZ.method13810(classKA.field3514, var163 - -1536213540, var175 - 20);
               var0.method65(classKK.field3864, var163, 5 + var175, 1953989140, 0);
               var163 = 80 + field394 * -511275367 + -680253731;
               classYZ.method13810(classKA.field3514, var163 - 1447789795, var175 - 20);
               var0.method65(classKK.field3865, var163, 5 + var175, 16777215, 0);
               var175 = 1115888953;
               var1.method65(classKK.field3867, classRS.field5838 * 1429288549, var175, -1815676335, 0);
            } else if (field384 * 1162027119 == 6) {
               int var51 = 201;
               var0.method65(field397, -511275367 * field394 + 180, var51, -568395628, 0);
               var51 += 15;
               var0.method65(field398, field394 * -1084175471 + 180, var51, 16776960, 0);
               var51 += 15;
               var0.method65(field399, field394 * -511275367 + 180, var51, 16776960, 0);
               var51 += 15;
               int var110 = -511275367 * field394 + 180;
               short var146 = 321;
               classYZ.method13810(classKA.field3514, var110 - -1875850978, var146 - 20);
               var0.method65(classKK.field3865, var110, 5 + var146, 441740110, 0);
            } else if (7 == -172705316 * field384) {
               if (client.field1134 && !client.field890) {
                  int var59 = -720936282;
                  var0.method65(field397, 893563964 * classRS.field5838, var59, 16776960, 0);
                  var59 += 15;
                  var0.method65(field398, -1845900433 * classRS.field5838, var59, 16776960, 0);
                  var59 += 15;
                  var0.method65(field399, 1429288549 * classRS.field5838, var59, 1899120270, 0);
                  int var113 = 1429288549 * classRS.field5838 - 150;
                  var59 += 10;

                  for (int var148 = 0; var148 < 8; var148++) {
                     classKA.field3514.method13812(var113, var59, 30, -107024482);
                     boolean var165 = field391 * -931091765 == var148 & 1679193360 * client.field855 % 40 < 20;
                     var0.method56(
                        (field407[var148] == null ? "" : field407[var148]) + (var165 ? classQY.method9847(16776960, (byte)38) + classDO.field1589 : ""),
                        10 + var113,
                        27 + var59,
                        -641169853,
                        0
                     );
                     if (var148 != 1 && 3 != var148) {
                        var113 += 35;
                     } else {
                        var113 += 50;
                        var0.method56(classAAA.method8("/"), var113 - 13, 27 + var59, 16777215, 0);
                     }
                  }

                  int var149 = classRS.field5838 * 1900106266 - 80;
                  int var166 = -1419200643;
                  classYZ.method13810(classKA.field3514, var149 - 73, var166 - 20);
                  var0.method65("Submit", var149, 5 + var166, 16777215, 0);
                  var149 = 1170816912 * classRS.field5838 + 369258911;
                  classYZ.method13810(classKA.field3514, var149 - 73, var166 - 20);
                  var0.method65(classKK.field3854, var149, 5 + var166, -1844146957, 0);
               } else {
                  int var55 = 216;
                  var0.method65(classKK.field3892, field394 * -511275367 + 180, var55, 649798975, 0);
                  var55 += 15;
                  var2.method65(classKK.field3893, field394 * -511275367 + -614520860, var55, 1161901729, 0);
                  var55 += 15;
                  var2.method65(classKK.field3633, 180 + -511275367 * field394, var55, 577806491, 0);
                  var55 += 15;
                  int var111 = 180 + field394 * -511275367 - -1629909034;
                  int var147 = 388838143;
                  classYZ.method13810(classKA.field3514, var111 - -29731424, var147 - 20);
                  var0.method65(classKK.field3895, var111, var147 + 5, -1093148175, 0);
                  var111 = -694501825 + -511275367 * field394 + 465176421;
                  classYZ.method13810(classKA.field3514, var111 - 73, var147 - 20);
                  var0.method65(classKK.field3865, var111, 5 + var147, -54413256, 0);
               }
            } else if (8 == 772106922 * field384) {
               int var63 = -1214115699;
               var0.method65(classKK.field3613, 913636183 + field394 * -511275367, var63, -620624619, 0);
               var63 += 15;
               var2.method65(classKK.field3749, 1244143167 + -511275367 * field394, var63, 990798714, 0);
               var63 += 15;
               var2.method65(classKK.field3750, -1225533623 + -1391942100 * field394, var63, -1910127859, 0);
               var63 += 15;
               int var114 = -511275367 * field394 + 180 - 80;
               int var151 = -400332451;
               classYZ.method13810(classKA.field3514, var114 - 73, var151 - 20);
               var0.method65(classKK.field3751, var114, var151 + 5, 16777215, 0);
               var114 = -838802762 + 359598786 * field394 + 180;
               classYZ.method13810(classKA.field3514, var114 - -1823040408, var151 - 20);
               var0.method65(classKK.field3865, var114, 5 + var151, 16777215, 0);
            } else if (9 == -863104027 * field384) {
               int var67 = 1609440972;
               var0.method65(field397, 180 + -148324430 * field394, var67, 16776960, 0);
               var67 += 25;
               var0.method65(field398, -970244395 + 1383567684 * field394, var67, -458294223, 0);
               var67 += 25;
               var0.method65(field399, -2140754890 + -511275367 * field394, var67, -761755852, 0);
               int var116 = field394 * -511275367 + 1359848002;
               short var152 = 311;
               classYZ.method13810(classKA.field3514, var116 - 73, var152 - 20);
               var0.method65(classKK.field3860, var116, var152 + 5, 257728183, 0);
            } else if (10 == -833969982 * field384) {
               int var70 = -1286347813 + 646338359 * field394;
               int var117 = 1401975209;
               var0.method65(classKK.field3878, field394 * -670803411 + 180, var117, 16776960, 0);
               var117 += 20;
               classYZ.method13810(classGQ.field2655, var70 - 109, var117);
               if (field412.isEmpty()) {
                  classYZ.method13810(classQH.field5544, var70 - 48, 18 + var117);
               } else {
                  classYZ.method13810(classQH.field5544, var70 - 48, var117 + 5);
                  var0.method65(field412, var70, 68 + var117 - 15, -1501831828, 0);
               }
            } else if (-47366135 * field384 == 12) {
               int var71 = -2113953229 * classRS.field5838;
               int var119 = 2422931;
               var2.method65(classKK.field3899, var71, var119, -195367091, 0);
               var119 += 17;
               var2.method65(classKK.field3900, var71, var119, 665692147, 0);
               var119 += 17;
               var2.method65(classKK.field3901, var71, var119, 1823465220, 0);
               var119 += 17;
               var2.method65(classKK.field3902, var71, var119, 16777215, 0);
               var71 = 1429288549 * classRS.field5838 - 80;
               var119 = -1715746713;
               classYZ.method13810(classKA.field3514, var71 - -1284464430, var119 - 20);
               var0.method65(classKK.field3910, var71, var119 + 5, 1217777909, 0);
               var71 = classRS.field5838 * -1555620546 + 1260045081;
               classYZ.method13810(classKA.field3514, var71 - 73, var119 - 20);
               var0.method65(classKK.field3911, var71, 5 + var119, 16777215, 0);
            } else if (13 == field384 * -47366135) {
               int var74 = 231;
               var2.method65(classKK.field3903, 180 + -511275367 * field394, var74, -2004155333, 0);
               var74 += 20;
               var2.method65(classKK.field3904, -511275367 * field394 + -239622835, var74, 1122053297, 0);
               int var124 = 509866463 + -511275367 * field394;
               short var76 = 311;
               classYZ.method13810(classKA.field3514, var124 - 238606610, var76 - 20);
               var0.method65(classKK.field3865, var124, var76 + 5, -1892131135, 0);
            } else if (14 == field384 * -47366135) {
               int var77 = -12980557;
               String var125 = "";
               String var153 = "";
               String var167 = "";
               switch (-20437633 * field387) {
                  case 0:
                     var125 = classKK.field3907;
                     var153 = classKK.field3662;
                     var167 = classKK.field3663;
                     break;
                  case 1:
                     var125 = classKK.field3700;
                     var153 = classKK.field3701;
                     var167 = classKK.field3702;
                     break;
                  case 2:
                     var125 = classKK.field3784;
                     var153 = classKK.field3897;
                     var167 = classKK.field3622;
                     break;
                  default:
                     classBJ.method1117(false, -347989319);
               }

               var0.method65(var125, field394 * -511275367 + 180, var77, 284352156, 0);
               var77 += 20;
               var0.method65(var153, -421823158 + field394 * -2064310469, var77, 16776960, 0);
               var77 += 20;
               var0.method65(var167, 1384953444 + field394 * -545092534, var77, 16776960, 0);
               int var177 = -144991654 + field394 * -511275367;
               int var181 = 2107749877;
               classYZ.method13810(classKA.field3514, var177 - 294314471, var181 - 20);
               if (1 == -804950986 * field387) {
                  var0.method65(classKK.field3645, var177, var181 + 5, 1585695217, 0);
               } else {
                  var0.method65(classKK.field3710, var177, 5 + var181, -1366598637, 0);
               }

               var177 = -171422969 * field394 + 180;
               short var182 = 326;
               classYZ.method13810(classKA.field3514, var177 - 1455846849, var182 - 20);
               var0.method65(classKK.field3865, var177, 5 + var182, 16777215, 0);
            } else if (24 == 1578944131 * field384) {
               int var80 = 221;
               var0.method65(field397, 919711853 * field394 + 180, var80, 16777215, 0);
               var80 += 15;
               var0.method65(field398, field394 * -511275367 + 506470823, var80, 16777215, 0);
               var80 += 15;
               var0.method65(field399, -2038469138 * field394 + -1575318116, var80, 16777215, 0);
               var80 += 15;
               int var126 = -1745869860 * field394 + 180;
               short var154 = 301;
               classYZ.method13810(classKA.field3514, var126 - 73, var154 - 20);
               var0.method65(classKK.field3795, var126, 5 + var154, 16777215, 0);
            } else if (32 == field384 * 202525764) {
               int var84 = 216;
               var0.method65(classKK.field3892, field394 * -511275367 + 180, var84, 16776960, 0);
               var84 += 15;
               var2.method65(classKK.field3893, field394 * 119387157 + -146316328, var84, -749875995, 0);
               var84 += 15;
               var2.method65(classKK.field3633, 740769130 + field394 * -2146973214, var84, 16776960, 0);
               var84 += 15;
               int var127 = 712708009 + field394 * -511275367 - 57435997;
               short var155 = 321;
               classYZ.method13810(classKA.field3514, var127 - 73, var155 - 20);
               var0.method65(classKK.field3895, var127, 5 + var155, 16777215, 0);
               var127 = -1717993404 * field394 + 1911416655 + 41302470;
               classYZ.method13810(classKA.field3514, var127 - 1931597179, var155 - 20);
               var0.method65(classKK.field3865, var127, 5 + var155, 16777215, 0);
            } else if (33 == -1986227415 * field384) {
               int var88 = 201;
               var0.method65(field397, -511275367 * field394 + 984535463, var88, 16776960, 0);
               var88 += 20;
               var1.method65(field398, -604842428 + -1742423523 * field394, var88, 16776960, 0);
               var88 += 20;
               var1.method65(field399, -511275367 * field394 + -1750274845, var88, 812235482, 0);
               var88 += 15;
               int var129 = field394 * -511275367 + 180;
               short var156 = 276;
               classYZ.method13810(classKA.field3514, var129 - 73, var156 - 20);
               var2.method65(classKK.field3736, var129, var156 + 5, 16777215, 0);
               var129 = field394 * 662125190 + 1092460286;
               var156 = 326;
               classYZ.method13810(classKA.field3514, var129 - 73, var156 - 20);
               var2.method65(classKK.field3865, var129, 5 + var156, 16777215, 0);
            } else if (field384 * 1439002773 == -1648240729) {
               int var92 = 201;
               var0.method65(field397, 180 + field394 * 1831567165, var92, 16776960, 0);
               var92 += 20;
               var1.method65(field398, 180 + field394 * 310877973, var92, 16776960, 0);
               var92 += 20;
               var1.method65(field399, field394 * -511275367 + 180, var92, 1357590366, 0);
               int var131 = 180 + field394 * -511275367;
               int var158 = 276;
               classYZ.method13810(classKA.field3514, var131 - 73, var158 - 20);
               String var168 = classIS.field3054 != null ? classKK.field3921 : classKK.field3786;
               var2.method65(var168, var131, var158 + 5, 16777215, 0);
               var131 = -511275367 * field394 + 180;
               var158 = -1347794614;
               classYZ.method13810(classKA.field3514, var131 - 686048351, var158 - 20);
               var2.method65(classKK.field3865, var131, var158 + 5, -853738084, 0);
            } else if (710310462 == field384 * -47366135) {
               int var95 = classRS.field5838 * -1681858232;
               int var133 = 216;
               var0.method65(classKK.field3759, var95, var133, 16776960, 0);
               var133 += 25;
               var1.method65(classKK.field3656, var95, var133, 1837876649, 0);
               var133 += 20;
               var1.method65(classKK.field3877, var95, var133, 2118671739, 0);
               var133 += 20;
               var1.method65(classKK.field3908, var95, var133, 154922240, 0);
               var95 = -885874591 * classRS.field5838 - 2131782399;
               var133 = 1364266281;
               classYZ.method13810(classKA.field3514, var95 - -1469015291, var133 - 20);
               var0.method65(classKK.field3736, var95, 5 + var133, 16777215, 0);
               var95 = -1885980304 + 1628999005 * classRS.field5838;
               classYZ.method13810(classKA.field3514, var95 - 73, var133 - 20);
               var0.method65(classKK.field3709, var95, 5 + var133, 16777215, 0);
            }
         }

         if (-44590225 * client.field828 >= 10) {
            int[] var98 = new int[4];
            classYW.method13675(var98);
            classYW.method13671(field385 * 285922872, 0, 942462676 * field385 + -1272088244, 1338898835 * classEU.field1938);
            classML.field4531.method2619(field385 * -329898575 - 22, client.field855 * 1869342842, 1698595949);
            classML.field4531.method2619(765 + -329898575 * field385 + 22 - 128, client.field855 * 1069357750, 1698595949);
            classYW.method13679(var98);
         }

         classYZ.method13810(classCG.field733[classAB.field122.method2732((byte)69) ? 1 : 0], 765 + -329898575 * field385 - 40, 463);
         if (-44590225 * client.field828 > 5 && classLU.field4232 == classXO.field6892) {
            if (classFJ.field2294 != null) {
               int var99 = -329898575 * field385 + 5;
               short var138 = 463;
               int var160 = 1559473695;
               byte var169 = 35;
               classYZ.method13810(classFJ.field2294, var99, var138);
               var0.method65(classKK.field3790 + " " + client.field827 * 1311484143, var99 + var160 / 2, var138 + var169 / 2 - 2, 16777215, 0);
               if (null != classIS.field3054) {
                  var1.method65(classKK.field3921, var99 + var160 / 2, 12 + var169 / 2 + var138, -327956719, 0);
               } else {
                  var1.method65(classKK.field3817, var99 + var160 / 2, var138 + var169 / 2 + 12, 16777215, 0);
               }
            } else {
               classFJ.field2294 = classSU.method10680(classHC.field2767, "sl_button", "", -410510138);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("cd")
   static void method1031(boolean var0) {
      byte var1 = 0;
      if (!classVA.method11864(-2053271753)) {
         var1 = 12;
      } else if (classOE.field4843.method2149(1985617997) || classOE.field4843.method2154((byte)67) || client.method2152(classOE.field4843, -1040901232)) {
         var1 = 10;
      }

      classAC.method326(var1, 2044466286);
      if (var0) {
         field389 = "";
         field390 = "";
         classEV.field1944 = 0;
         classQP.field5586 = "";
      }

      if (null == field389 || field389.isEmpty()) {
         if (classCY.method2782(classAB.field122, (byte)8) != null) {
            field389 = classCY.method2782(classAB.field122, (byte)8);
            client.field832 = true;
         } else {
            client.field832 = false;
         }
      }

      if (client.field832 && null != field389 && !field389.isEmpty()) {
         field403 = -878854915;
      } else {
         field403 = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("cf")
   static void method1038(String var0, String var1, String var2) {
      field397 = var0;
      field398 = var1;
      field399 = var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzv;Lzv;)V")
   @ObfuscatedName("cn")
   static void method1039(classZV var0, classZV var1) {
      if (classCR.field1230 == null) {
         classVP var3 = classHC.field2767;
         classYM[] var2;
         if (!classVA.method11853(var3, "sl_back", "", 1997067984)) {
            var2 = null;
         } else {
            int var4 = var3.method11848("sl_back", 1356503413);
            int var5 = var3.method11851(var4, "", (byte)-77);
            var2 = classIR.method6307(var3, var4, var5, -1253680523);
         }

         classCR.field1230 = var2;
      }

      if (null == classCF.field720) {
         classCF.field720 = classOT.method8732(classHC.field2767, "sl_flags", "", (byte)43);
      }

      if (classPM.field5349 == null) {
         classPM.field5349 = classOT.method8732(classHC.field2767, "sl_arrows", "", (byte)19);
      }

      if (null == classPD.field5227) {
         classPD.field5227 = classOT.method8732(classHC.field2767, "sl_stars", "", (byte)43);
      }

      if (null == classBV.field590) {
         classBV.field590 = classSU.method10680(classHC.field2767, "leftarrow", "", -479000825);
      }

      if (classUR.field6374 == null) {
         classUR.field6374 = classSU.method10680(classHC.field2767, "rightarrow", "", -428153920);
      }

      classYW.method13698(field385 * -329898575, 23, 765, 480, 0);
      classYW.method13699(-329898575 * field385, 0, 125, 23, 12425273, 9135624);
      classYW.method13699(125 + -329898575 * field385, 0, 640, 23, 5197647, 2697513);
      var0.method65(classKK.field3912, 62 + field385 * -329898575, 15, 0, -1);
      if (null != classPD.field5227) {
         classYZ.method13810(classPD.field5227[1], 140 + -329898575 * field385, 1);
         var1.method56(classKK.field3913, 152 + field385 * -329898575, 10, 16777215, -1);
         classYZ.method13810(classPD.field5227[0], 140 + -329898575 * field385, 12);
         var1.method56(classKK.field3856, 152 + -329898575 * field385, 21, 16777215, -1);
      }

      if (null != classPM.field5349) {
         int var22 = 280 + -329898575 * field385;
         if (0 == classCM.field1154[0] && 0 == classCM.field1155[0]) {
            classYZ.method13810(classPM.field5349[2], var22, 4);
         } else {
            classYZ.method13810(classPM.field5349[0], var22, 4);
         }

         if (classCM.field1154[0] == 0 && 1 == classCM.field1155[0]) {
            classYZ.method13810(classPM.field5349[3], var22 + 15, 4);
         } else {
            classYZ.method13810(classPM.field5349[1], var22 + 15, 4);
         }

         var0.method56(classKK.field3697, var22 + 32, 17, 16777215, -1);
         int var24 = field385 * -329898575 + 390;
         if (classCM.field1154[0] == 1 && 0 == classCM.field1155[0]) {
            classYZ.method13810(classPM.field5349[2], var24, 4);
         } else {
            classYZ.method13810(classPM.field5349[0], var24, 4);
         }

         if (classCM.field1154[0] == 1 && 1 == classCM.field1155[0]) {
            classYZ.method13810(classPM.field5349[3], 15 + var24, 4);
         } else {
            classYZ.method13810(classPM.field5349[1], 15 + var24, 4);
         }

         var0.method56(classKK.field3898, 32 + var24, 17, 16777215, -1);
         int var26 = 500 + -329898575 * field385;
         if (classCM.field1154[0] == 2 && 0 == classCM.field1155[0]) {
            classYZ.method13810(classPM.field5349[2], var26, 4);
         } else {
            classYZ.method13810(classPM.field5349[0], var26, 4);
         }

         if (classCM.field1154[0] == 2 && classCM.field1155[0] == 1) {
            classYZ.method13810(classPM.field5349[3], var26 + 15, 4);
         } else {
            classYZ.method13810(classPM.field5349[1], var26 + 15, 4);
         }

         var0.method56(classKK.field3917, var26 + 32, 17, 16777215, -1);
         int var28 = 610 + field385 * -329898575;
         if (3 == classCM.field1154[0] && 0 == classCM.field1155[0]) {
            classYZ.method13810(classPM.field5349[2], var28, 4);
         } else {
            classYZ.method13810(classPM.field5349[0], var28, 4);
         }

         if (classCM.field1154[0] == 3 && classCM.field1155[0] == 1) {
            classYZ.method13810(classPM.field5349[3], 15 + var28, 4);
         } else {
            classYZ.method13810(classPM.field5349[1], 15 + var28, 4);
         }

         var0.method56(classKK.field3918, 32 + var28, 17, 16777215, -1);
      }

      classYW.method13698(708 + field385 * -329898575, 4, 50, 16, 0);
      var1.method65(classKK.field3854, 708 + field385 * -329898575 + 25, 16, 16777215, -1);
      field400 = -520043415;
      if (classCR.field1230 != null) {
         byte var23 = 88;
         byte var25 = 19;
         int var27 = 765 / (var23 + 1) - 1;
         int var29 = 480 / (var25 + 1);

         int var6;
         int var7;
         do {
            var6 = var29;
            var7 = var27;
            if (var29 * (var27 - 1) >= -622036481 * classCM.field1153) {
               var27--;
            }

            if ((var29 - 1) * var27 >= classCM.field1153 * -622036481) {
               var29--;
            }

            if (var27 * (var29 - 1) >= classCM.field1153 * -622036481) {
               var29--;
            }
         } while (var29 != var6 || var27 != var7);

         var6 = (765 - var27 * var23) / (var27 + 1);
         if (var6 > 5) {
            var6 = 5;
         }

         var7 = (480 - var25 * var29) / (var29 + 1);
         if (var7 > 5) {
            var7 = 5;
         }

         int var8 = (765 - var23 * var27 - (var27 - 1) * var6) / 2;
         int var9 = (480 - var29 * var25 - var7 * (var29 - 1)) / 2;
         int var10 = (classCM.field1153 * -622036481 + var29 - 1) / var29;
         field409 = -1501820553 * (var10 - var27);
         if (classBV.field590 != null && field408 * -942812997 > 0) {
            classYZ.method13810(classBV.field590, 8, 8379747 * classEU.field1938 / 2 - classBV.field590.field7119 / 2);
         }

         if (null != classUR.field6374 && field408 * -942812997 < field409 * -343302073) {
            classYZ.method13810(
               classUR.field6374,
               773246731 * classSA.field5897 - classUR.field6374.field7121 - 8,
               8379747 * classEU.field1938 / 2 - classUR.field6374.field7119 / 2
            );
         }

         int var11 = var9 + 23;
         int var12 = field385 * -329898575 + var8;
         int var13 = 0;
         boolean var14 = false;
         int var15 = -942812997 * field408;

         for (int var16 = var29 * var15; var16 < -622036481 * classCM.field1153 && var15 - -942812997 * field408 < var27; var16++) {
            classCM var17 = classCM.field1170[var16];
            boolean var18 = true;
            String var19 = Integer.toString(597852065 * var17.field1161);
            if (-1 == var17.field1161 * 597852065) {
               var19 = classKK.field3919;
               var18 = false;
            } else if (var17.field1161 * 597852065 > 1980) {
               var19 = classKK.field3839;
               var18 = false;
            }

            classCC var20 = null;
            int var21 = 0;
            if (var17.method2506(1753323294)) {
               var20 = var17.method2482((byte)-46) ? classCC.field666 : classCC.field658;
            } else if (classCM.method2487(var17, -1753035646)) {
               var20 = var17.method2482((byte)-41) ? classCC.field667 : classCC.field662;
            } else if (var17.method2502(-617496241)) {
               var21 = 16711680;
               var20 = var17.method2482((byte)-92) ? classCC.field657 : classCC.field656;
            } else if (var17.method2510(-756563957)) {
               var20 = var17.method2482((byte)-77) ? classCC.field665 : classCC.field663;
            } else if (var17.method2493(23162323)) {
               var20 = var17.method2482((byte)-21) ? classCC.field655 : classCC.field654;
            } else if (classCM.method2514(var17, (byte)-8)) {
               var20 = var17.method2482((byte)-106) ? classCC.field653 : classCC.field659;
            } else if (var17.method2521(-1604570763)) {
               var20 = var17.method2482((byte)-35) ? classCC.field660 : classCC.field664;
            }

            if (null == var20 || 371320039 * var20.field651 >= classCR.field1230.length) {
               var20 = var17.method2482((byte)-37) ? classCC.field661 : classCC.field652;
            }

            if (classTZ.field6255 * -38255113 >= var12
               && classTZ.field6264 * -2144333897 >= var11
               && -38255113 * classTZ.field6255 < var23 + var12
               && -2144333897 * classTZ.field6264 < var25 + var11
               && var18) {
               field400 = 520043415 * var16;
               classCR.field1230[var20.field651 * 371320039].method13518(var12, var11, 128, 16777215);
               var14 = true;
            } else {
               classCR.field1230[371320039 * var20.field651].method13508(var12, var11);
            }

            if (classCF.field720 != null) {
               classYZ.method13810(
                  classCF.field720[(var17.method2482((byte)-106) ? classCF.field720.length / 2 : 0) + var17.field1160 * -288138629], 29 + var12, var11
               );
            }

            var0.method65(Integer.toString(851246551 * var17.field1162), var12 + 15, var25 / 2 + var11 + 5, var21, -1);
            var1.method65(var19, 60 + var12, var11 + var25 / 2 + 5, 268435455, -1);
            var11 += var25 + var7;
            if (++var13 >= var29) {
               var11 = 23 + var9;
               var12 += var23 + var6;
               var13 = 0;
               var15++;
            }
         }

         if (var14) {
            int var32 = var1.method36(classCM.field1170[field400 * -2105609177].field1167) + 6;
            int var33 = var1.field8 + 8;
            int var34 = classTZ.field6264 * -2144333897 + 25;
            if (var33 + var34 > 480) {
               var34 = -2144333897 * classTZ.field6264 - 25 - var33;
            }

            classYW.method13698(-38255113 * classTZ.field6255 - var32 / 2, var34, var32, var33, 16777120);
            classYW.method13707(classTZ.field6255 * -38255113 - var32 / 2, var34, var32, var33, 0);
            var1.method65(classCM.field1170[field400 * -2105609177].field1167, classTZ.field6255 * -38255113, var34 + var1.field8 + 4, 0, -1);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
   @ObfuscatedName("bd")
   static void method1019(String var0, String var1, String var2) {
      classAC.method326(7, 2104449694);
      classSP.method10624(var0, var1, var2, (byte)-126);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cm")
   static void method1046() {
      if (2063628354 * field384 == 379727144) {
         classBJ.method1117(false, -347989319);
      }

      field413 = false;
      classYW.method13698(0, 0, classYW.field7102, classYW.field7101, 0);
      classNI.field4673.method13508(field385 * -329898575, 0);
      classFR.field2391.method13508(382 + field385 * -720975381, 0);
      classYZ.method13810(classFP.field2372, 382 + field385 * 1086434260 - classFP.field2372.field7121 / 2, 18);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("cg")
   static void method1042(classTQ var0) {
      classFA var1 = client.field931;
      classFA var2 = var1;

      while (var2.method4531((short)-3649)) {
         if (var2.field2181 * 739919660 == 13) {
            classEM.method3928(Integer.MAX_VALUE);
            return;
         }

         if (var2.field2181 * -286674850 == 96) {
            if (field408 * -942812997 > 0 && classBV.field590 != null) {
               field408 -= -1581517709;
            }
         } else if (-1399164500 * var2.field2181 == -823495140 && -942812997 * field408 < field409 * 836768721 && classUR.field6374 != null) {
            field408 += 2070747137;
         }
      }

      if (154148356 * classTZ.field6261 == 1 || !classON.field4995 && 4 == classTZ.field6261 * 1229235359) {
         int var3 = -1903252928 * field385 + 280;
         if (classTZ.field6266 * 1442465600 >= var3
            && classTZ.field6266 * 552830255 <= var3 + 14
            && -402979977 * classTZ.field6257 >= 4
            && 1243590197 * classTZ.field6257 <= 18) {
            classJJ.method6373(0, 0, (byte)-11);
            return;
         }

         if (161178251 * classTZ.field6266 >= var3 + 15
            && classTZ.field6266 * -1413507813 <= var3 + 80
            && -1330020650 * classTZ.field6257 >= 4
            && classTZ.field6257 * -1804119492 <= 18) {
            classJJ.method6373(0, 1, (byte)48);
            return;
         }

         int var4 = field385 * -1680835732 + 390;
         if (classTZ.field6266 * 1422993977 >= var4
            && 1422993977 * classTZ.field6266 <= 14 + var4
            && 1163535322 * classTZ.field6257 >= 4
            && 1243590197 * classTZ.field6257 <= 18) {
            classJJ.method6373(1, 0, (byte)-73);
            return;
         }

         if (1994034193 * classTZ.field6266 >= var4 + 15
            && 1422993977 * classTZ.field6266 <= var4 + 806228008
            && 1243590197 * classTZ.field6257 >= 4
            && 1243590197 * classTZ.field6257 <= 18) {
            classJJ.method6373(1, 1, (byte)0);
            return;
         }

         int var5 = field385 * 1950739998 + -304912514;
         if (classTZ.field6266 * -1736028880 >= var5
            && classTZ.field6266 * 853234109 <= 14 + var5
            && classTZ.field6257 * 1243590197 >= 4
            && 1243590197 * classTZ.field6257 <= 18) {
            classJJ.method6373(2, 0, (byte)36);
            return;
         }

         if (1422993977 * classTZ.field6266 >= 15 + var5
            && classTZ.field6266 * -953250094 <= var5 + 80
            && classTZ.field6257 * 1243590197 >= 4
            && 935564372 * classTZ.field6257 <= 18) {
            classJJ.method6373(2, 1, (byte)-9);
            return;
         }

         int var6 = field385 * 1836060769 + 610;
         if (classTZ.field6266 * 1422993977 >= var6
            && 1147792625 * classTZ.field6266 <= var6 + 14
            && classTZ.field6257 * -1870230858 >= 4
            && 1243590197 * classTZ.field6257 <= 18) {
            classJJ.method6373(3, 0, (byte)5);
            return;
         }

         if (classTZ.field6266 * -1598940599 >= var6 + 15
            && classTZ.field6266 * 1420565110 <= 80 + var6
            && -701549702 * classTZ.field6257 >= 4
            && classTZ.field6257 * 1243590197 <= 18) {
            classJJ.method6373(3, 1, (byte)27);
            return;
         }

         if (classTZ.field6266 * 1621467182 >= 708 + field385 * -329898575
            && 1243590197 * classTZ.field6257 >= 4
            && classTZ.field6266 * 1422993977 <= field385 * -329898575 + 1228694131 + -971521412
            && 1928637451 * classTZ.field6257 <= 20) {
            classEM.method3928(Integer.MAX_VALUE);
            return;
         }

         if (-1 != field400 * -1085877072) {
            classCM var7 = classCM.field1170[field400 * 2095144563];
            int var9 = client.field883 * -1118148055;
            classXE var10 = classXE.field6844;
            boolean var8 = (var9 & var10.vmethod8((byte)1)) != 0;
            boolean var12 = classCM.method2487(var7, -2147036600);
            classAC.field135 = var12;
            var7.field1168 = var12 ? "beta" : var7.field1168;
            classDB.method2886(var7, 1660308192);
            classEM.method3928(Integer.MAX_VALUE);
            if (var8 != var12) {
               classAC.method325((byte)11);
            }

            return;
         }

         if (field408 * -942812997 > 0
            && classBV.field590 != null
            && classTZ.field6266 * -727880556 >= 0
            && classTZ.field6266 * -52331447 <= classBV.field590.field7121
            && 1243590197 * classTZ.field6257 >= -238232495 * classEU.field1938 / 2 - 50
            && classTZ.field6257 * 1243590197 <= -159592883 + 8379747 * classEU.field1938 / 2) {
            field408 -= -1581517709;
         }

         if (-1308401332 * field408 < field409 * 1461951653
            && classUR.field6374 != null
            && 1422993977 * classTZ.field6266 >= -29631688 * classSA.field5897 - classUR.field6374.field7121 - 5
            && 1656332288 * classTZ.field6266 <= classSA.field5897 * 633256081
            && classTZ.field6257 * 1243590197 >= classEU.field1938 * -233661939 / 2 - -544179678
            && classTZ.field6257 * 1243590197 <= -584884724 + classEU.field1938 * 8379747 / 2) {
            field408 += -1553020110;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcm;)V")
   @ObfuscatedName("cw")
   static void method1045(classCM var0) {
      if (var0.method2482((byte)-4) != client.field932) {
         client.field932 = var0.method2482((byte)-97);
         classBD.method988(var0.method2482((byte)-107), 2087340555);
      }

      if (-2024190683 * client.field883 != var0.field1163 * -458552905) {
         classVP var1 = classHC.field2767;
         int var2 = var0.field1163 * -458552905;
         if ((var2 & classXE.field6840.vmethod8((byte)1)) != 0) {
            classFP.field2372 = classSU.method10680(var1, "logo_deadman_mode", "", -286114710);
         } else if ((var2 & classXE.field6851.vmethod8((byte)1)) != 0) {
            classFP.field2372 = classSU.method10680(var1, "logo_seasonal_mode", "", -463853229);
         } else if ((var2 & classXE.field6836.vmethod8((byte)1)) != 0) {
            classFP.field2372 = classSU.method10680(var1, "logo_speedrunning", "", 72343254);
         } else if ((var2 & classXE.field6839.vmethod8((byte)1)) != 0) {
            classFP.field2372 = classSU.method10680(var1, "logo_ugc_world", "", 473900537);
         } else {
            classFP.field2372 = classSU.method10680(var1, "logo", "", -1776360547);
         }
      }

      classLG.field4139 = var0.field1169;
      client.field827 = var0.field1162 * 894790041;
      client.field883 = var0.field1163 * -635970901;
      classGV.field2716 = var0.field1168;
      classRJ.field5681 = 721437403 * (0 == 2064080735 * client.field940 ? 'ꩊ' : var0.field1162 * 851246551 + 40000);
      classMB.field4478 = 309769881 * (0 == client.field940 * 2064080735 ? 443 : 50000 + var0.field1162 * 851246551);
      classAD.field141 = 1527064229 * classRJ.field5681;
   }

   @ObfuscatedSignature(descriptor = "(Llr;I)V")
   @ObfuscatedName("az")
   public static void method994(classLR var0, int var1) {
      try {
         classLF.field4133 = var0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "bf.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cq")
   static void method1029() {
      int var0 = classAB.field122.method2833(1873816533);
      int var1 = client.field977 * -1239932395 + var0;
      long var4 = System.currentTimeMillis();
      int var3 = (int)(var4 / 86400000L) - 11745;
      if (var1 <= var3) {
         classAB.field122.method2835(var3, (byte)58);
         classAC.method326(38, 2119116190);
      } else {
         classBJ.method1117(true, -347989319);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cx")
   static void method1047() {
      if (-47366135 * field384 == 1598149455) {
         classBJ.method1117(false, -347989319);
      }

      field413 = false;
      classYW.method13698(0, 0, classYW.field7102, classYW.field7101, 0);
      classNI.field4673.method13508(field385 * -2111910936, 0);
      classFR.field2391.method13508(382 + field385 * -683628496, 0);
      classYZ.method13810(classFP.field2372, 382 + field385 * -329898575 - classFP.field2372.field7121 / 2, 18);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;Lzv;Lzv;)V")
   @ObfuscatedName("bo")
   static void method1009(classTQ var0, classZV var1, classZV var2) {
      if (field413) {
         classDP.method3520(var0, -644062932);
      } else {
         if ((1229235359 * classTZ.field6261 == 1 || !classON.field4995 && 1359145934 * classTZ.field6261 == 4)
            && classTZ.field6266 * -1139324730 >= field385 * 1720903393 + 550712427 - 1805898257
            && classTZ.field6257 * -1412799194 >= 453
            && 1422993977 * classTZ.field6266 < 1008887936 + -329898575 * field385
            && classTZ.field6257 * 1243590197 < 503) {
            classCY.method2736(classAB.field122, !classAB.field122.method2732((byte)82), (byte)16);
            classUR.method11526((byte)0);
            classDH.method3122(-1612757241);
         }

         if (-44590225 * client.field828 != 5) {
            if (-1L == field402 * -6105922944827093555L) {
               field402 = (classDD.method2983(16711680) + 1000L) * 7971708337557546757L;
            }

            long var3 = classDD.method2983(16711680);
            if (classOL.method8513(-2033130147) && -1L == field410 * -5269972525589787045L) {
               field410 = 3992049254271775187L * var3;
               if (-5269972525589787045L * field410 > -6105922944827093555L * field402) {
                  field402 = field410 * -3963514021849324345L;
               }
            }

            if (10 == -1860761836 * client.field828 || client.field828 * -1339897702 == 11) {
               if (classLU.field4232 == classXO.field6892) {
                  if (classTZ.field6261 * 1229235359 == 1 || !classON.field4995 && classTZ.field6261 * 1229235359 == 4) {
                     int var5 = field385 * -329898575 + 5;
                     short var6 = 463;
                     int var7 = 1484700305;
                     byte var8 = 35;
                     if (classTZ.field6266 * 1422993977 >= var5
                        && classTZ.field6266 * 1422993977 <= var7 + var5
                        && 39550494 * classTZ.field6257 >= var6
                        && classTZ.field6257 * -682377838 <= var6 + var8) {
                        if (classKB.method6447(1332436661)) {
                           field413 = true;
                           field408 = 0;
                           field409 = 0;
                        }

                        return;
                     }
                  }

                  if (classIS.field3054 != null && classKB.method6447(-612852792)) {
                     field413 = true;
                     field408 = 0;
                     field409 = 0;
                  }
               }

               int var23 = 236832758 * classTZ.field6261;
               int var24 = classTZ.field6266 * 448194243;
               int var25 = 1243590197 * classTZ.field6257;
               if (0 == var23) {
                  var24 = -38255113 * classTZ.field6255;
                  var25 = classTZ.field6264 * 1302034714;
               }

               if (!classON.field4995 && var23 == 4) {
                  var23 = 1;
               }

               classFA var26 = client.field931;
               classFA var9 = var26;
               if (1625750286 * field384 == 0) {
                  boolean var62 = false;

                  while (var9.method4531((short)-1416)) {
                     if (-902637037 == var9.field2181 * -974855247) {
                        var62 = true;
                     }
                  }

                  int var93 = 1429288549 * classRS.field5838 - 80;
                  short var108 = 291;
                  if (1 == var23 && var24 >= var93 - -628207131 && var24 <= var93 + -1706230465 && var25 >= var108 - 20 && var25 <= 20 + var108) {
                     classUF.method11299(classLZ.method7427("secure", true, -1321944883) + "m=account-creation/g=oldscape/create_account_funnel.ws", (byte)-10);
                  }

                  var93 = classRS.field5838 * 1303657693 + 1342440534;
                  if (var23 == 1 && var24 >= var93 - 75 && var24 <= 75 + var93 && var25 >= var108 - 20 && var25 <= 20 + var108 || var62) {
                     if (classNU.method8146(-1776965439)) {
                        if (client.field832 && field389 != null && !field389.isEmpty()) {
                           field403 = 428030236;
                        } else {
                           field403 = 0;
                        }
                     } else {
                        classGG.method5430(1866772962);
                     }
                  }
               } else if (-1319635226 * field384 == 1) {
                  boolean var61 = classOE.field4843.method2149(1985617997)
                     || classOE.field4843.method2154((byte)104)
                     || client.method2152(classOE.field4843, -1381307172);

                  while (var9.method4531((short)-2642)) {
                     if (var9.field2181 * -684141473 == -83463341) {
                        if (var61) {
                           classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-82);
                           client.field898 = classAAP.field92;
                           classXQ.method12875(false, 402128428);
                           classJB.method6345(20, -1192966987);
                        } else {
                           classGG.method5430(1107364831);
                        }

                        return;
                     }

                     if (13 == var9.field2181 * -1483022045) {
                        classIV.method6320(true, (byte)21);
                        return;
                     }
                  }

                  int var91 = 1429288549 * classRS.field5838 - -465605772;
                  short var107 = 321;
                  if (var23 == 1 && var24 >= var91 - 730755858 && var24 <= var91 + 75 && var25 >= var107 - 20 && var25 <= 20 + var107) {
                     if (var61) {
                        classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-74);
                        client.field898 = classAAP.field92;
                        classXQ.method12875(false, 402128428);
                        classJB.method6345(20, -1192966987);
                     } else {
                        classGG.method5430(1628864943);
                     }

                     return;
                  }

                  var91 = 80 + classRS.field5838 * -1152738126;
                  if (1 == var23 && var24 >= var91 - 75 && var24 <= 1458735593 + var91 && var25 >= var107 - 20 && var25 <= 20 + var107) {
                     classIV.method6320(true, (byte)-88);
                     return;
                  }
               } else if (field384 * -1817989616 == 2) {
                  int var56 = -2053538525;
                  var56 += 52;
                  if (1 == var23 && var25 >= var56 - 12 && var25 < 2 + var56) {
                     field403 = 0;
                  }

                  var56 += 15;
                  if (1 == var23 && var25 >= var56 - 12 && var25 < var56 + 2) {
                     field403 = -878854915;
                  }

                  var56 += 15;
                  var56 = -1688169168;
                  if (classWR.field6770 != null) {
                     int var86 = classWR.field6770.field6370 * -346053386 / 2;
                     if (1 == var23
                        && var24 >= -1357616065 * classWR.field6770.field6368 - var86
                        && var24 <= classWR.field6770.field6368 * 1855573374 + var86
                        && var25 >= var56 - 15
                        && var25 < var56) {
                        switch (392576319 * field388) {
                           case 1:
                              classUF.method11299(classKK.field3926, (byte)1);
                              return;
                           case 2:
                              classUF.method11299("https://support.runescape.com/hc/en-gb", (byte)-108);
                        }
                     }
                  }

                  int var87 = 1429288549 * classRS.field5838 - 80;
                  int var104 = 211894065;
                  if (1 == var23 && var24 >= var87 - 1058382545 && var24 <= 75 + var87 && var25 >= var104 - 20 && var25 <= 20 + var104) {
                     field389 = field389.trim();
                     if (field389.isEmpty()) {
                        classSP.method10624(classKK.field3658, classKK.field3728, classKK.field3916, (byte)-53);
                     } else if (field390.isEmpty()) {
                        classSP.method10624(classKK.field3730, classKK.field3644, classKK.field3732, (byte)-102);
                     } else {
                        classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-76);
                        classXQ.method12875(false, 402128428);
                        classJB.method6345(20, -1192966987);
                     }

                     return;
                  }

                  var87 = 1126830573 + 180 + -511275367 * field394;
                  if (var23 == 1 && var24 >= var87 - -1614283240 && var24 <= -632320259 + var87 && var25 >= var104 - 20 && var25 <= var104 + 20) {
                     classAC.method326(0, 2043895790);
                     field389 = "";
                     field390 = "";
                     classEV.field1944 = 0;
                     classQP.field5586 = "";
                     field393 = true;
                  }

                  var87 = -639096332 * classRS.field5838 + -117;
                  int var105 = 277;
                  field401 = var24 >= var87
                     && var24 < var87 + -1509287392 * classXR.field6925
                     && var25 >= var105
                     && var25 < classKP.field3985 * 1334825587 + var105;
                  if (1 == var23 && field401) {
                     client.field832 = !client.field832;
                     if (!client.field832 && classCY.method2782(classAB.field122, (byte)8) != null) {
                        classAB.field122.method2789(null, -967389894);
                     }
                  }

                  var87 = 24 + -707053768 * classRS.field5838;
                  var105 = -1201629622;
                  field406 = var24 >= var87
                     && var24 < classXR.field6925 * 2131376837 + var87
                     && var25 >= var105
                     && var25 < var105 + -580844865 * classKP.field3985;
                  if (var23 == 1 && field406) {
                     classAB.field122.method2727(!classCY.method2724(classAB.field122, (short)26560), -1782315598);
                     if (!classCY.method2724(classAB.field122, (short)-7956)) {
                        field389 = "";
                        classAB.field122.method2789(null, -2129857981);
                        if (client.field832 && null != field389 && !field389.isEmpty()) {
                           field403 = 1823517727;
                        } else {
                           field403 = 0;
                        }
                     }
                  }

                  label1101:
                  while (var9.method4531((short)11021)) {
                     if (var9.field2181 * 1363213817 == 13) {
                        classAC.method326(0, 2116818325);
                        field389 = "";
                        field390 = "";
                        classEV.field1944 = 0;
                        classQP.field5586 = "";
                        field393 = true;
                     } else if (-1187692459 * field403 == 0) {
                        classOG.method8436(var9.field2175, (byte)-68);
                        if (var9.field2181 * -689207868 == -1417963844 && !field389.isEmpty()) {
                           field389 = field389.substring(0, field389.length() - 1);
                        }

                        if (1363213817 * var9.field2181 == 1448708164 || -1730754956 * var9.field2181 == 80) {
                           field403 = -878854915;
                        }

                        char var119 = var9.field2175;
                        boolean var113 = field404.indexOf(var119) != -1;
                        if (var113 && field389.length() < 1574847964) {
                           field389 = field389 + var9.field2175;
                        }
                     } else if (field403 * 6526651 == 1) {
                        if (85 == var9.field2181 * 1363213817 && !field390.isEmpty()) {
                           field390 = field390.substring(0, field390.length() - 1);
                        } else if (1363213817 * var9.field2181 == -225469872 || 80 == 800297576 * var9.field2181) {
                           field403 = 0;
                           if (1363213817 * var9.field2181 == 420897511) {
                              field389 = field389.trim();
                              if (field389.isEmpty()) {
                                 classSP.method10624(classKK.field3658, classKK.field3728, classKK.field3916, (byte)-31);
                              } else if (field390.isEmpty()) {
                                 classSP.method10624(classKK.field3730, classKK.field3644, classKK.field3732, (byte)-23);
                              } else {
                                 classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-1);
                                 classXQ.method12875(false, 402128428);
                                 classJB.method6345(20, -1192966987);
                              }

                              return;
                           }
                        }

                        if ((classFA.method4540(var9, 82, 652719716) || classFA.method4540(var9, 87, 1377073407)) && 67 == 1363213817 * var9.field2181) {
                           Clipboard var115 = Toolkit.getDefaultToolkit().getSystemClipboard();
                           Transferable var121 = var115.getContents(classOE.field4843);
                           int var123 = 20 - field390.length();
                           if (var123 > 0) {
                              try {
                                 String var125 = (String)var121.getTransferData(DataFlavor.stringFlavor);
                                 int var17 = Math.min(var123, var125.length());
                                 int var18 = 0;

                                 while (true) {
                                    if (var18 >= var17) {
                                       field390 = field390 + var125.substring(0, var17);
                                       continue label1101;
                                    }

                                    if (!classIB.method6139(var125.charAt(var18), -875935692)) {
                                       break;
                                    }

                                    char var20 = var125.charAt(var18);
                                    boolean var19 = field404.indexOf(var20) != -1;
                                    if (!var19) {
                                       break;
                                    }

                                    var18++;
                                 }

                                 classAC.method326(3, 2074725843);
                                 return;
                              } catch (UnsupportedFlavorException var21) {
                              } catch (IOException var22) {
                              }
                           }
                        } else if (classIB.method6139(var9.field2175, 899362435)) {
                           char var120 = var9.field2175;
                           boolean var114 = field404.indexOf(var120) != -1;
                           if (var114 && field390.length() < 20) {
                              field390 = field390 + var9.field2175;
                           }
                        }
                     }
                  }
               } else if (3 == -47366135 * field384) {
                  int var10 = 180 + -1098687177 * field394;
                  int var11 = 241;
                  classUQ var12 = var1.method49(25, classKK.field3859.length() - -841759507, classKK.field3859, var10, var11);
                  if (var23 == 1 && var12.method11474(var24, var25, -594779443)) {
                     classUF.method11299(classKK.field3925, (byte)45);
                  }

                  var10 = 180 + field394 * 681042829;
                  var11 = 101558450;
                  if (1 == var23 && var24 >= var10 - 75 && var24 <= var10 + 191093716 && var25 >= var11 - 20 && var25 <= var11 + 20) {
                     classIV.method6320(false, (byte)56);
                  }

                  var10 = 180 + -511275367 * field394;
                  short var64 = 326;
                  if (1 == var23 && var24 >= var10 - 75 && var24 <= 75 + var10 && var25 >= var64 - 20 && var25 <= var64 + 20) {
                     classUF.method11299(classKK.field3926, (byte)-29);
                     return;
                  }
               } else if (4 == -47366135 * field384) {
                  int var29 = 180 + -511275367 * field394 - -1001676585;
                  short var65 = 321;
                  if (var23 == 1 && var24 >= var29 - 51709693 && var24 <= var29 + -327815314 && var25 >= var65 - 20 && var25 <= var65 + 20) {
                     classQP.field5586.trim();
                     if (classQP.field5586.length() != 6) {
                        classSP.method10624(classKK.field3646, classKK.field3850, classKK.field3745, (byte)-20);
                     } else {
                        classEV.field1944 = Integer.parseInt(classQP.field5586) * 400348643;
                        classQP.field5586 = "";
                        classXQ.method12875(true, 402128428);
                        classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-32);
                        classJB.method6345(20, -1192966987);
                     }

                     return;
                  }

                  if (var23 == 1
                     && var24 >= 180 + field394 * -511275367 - 9
                     && var24 <= 180 + -1157965610 * field394 + -1273209407
                     && var25 >= 14051166
                     && var25 <= 296) {
                     field393 = !field393;
                  }

                  if (1 == var23
                     && var24 >= 1854789085 + field394 * -511275367 - 34
                     && var24 <= 1060039836 + 5740226 * field394 + 180
                     && var25 >= 351
                     && var25 <= 363) {
                     classUF.method11299(classKK.field3926, (byte)51);
                  }

                  var29 = 80 + 1983538686 * field394 + -665983311;
                  if (var23 == 1 && var24 >= var29 - 75 && var24 <= 493425369 + var29 && var25 >= var65 - 20 && var25 <= 20 + var65) {
                     classAC.method326(0, 2028130125);
                     field389 = "";
                     field390 = "";
                     classEV.field1944 = 0;
                     classQP.field5586 = "";
                  }

                  while (var9.method4531((short)2530)) {
                     boolean var95 = false;

                     for (int var13 = 0; var13 < field405.length(); var13++) {
                        if (var9.field2175 == field405.charAt(var13)) {
                           var95 = true;
                           break;
                        }
                     }

                     if (var9.field2181 * 1363213817 == 13) {
                        classAC.method326(0, 2043136252);
                        field389 = "";
                        field390 = "";
                        classEV.field1944 = 0;
                        classQP.field5586 = "";
                     } else {
                        if (-1535123030 * var9.field2181 == 227266693 && !classQP.field5586.isEmpty()) {
                           classQP.field5586 = classQP.field5586.substring(0, classQP.field5586.length() - 1);
                        }

                        if (1106423215 * var9.field2181 == 892964457) {
                           classQP.field5586.trim();
                           if (classQP.field5586.length() != 6) {
                              classSP.method10624(classKK.field3646, classKK.field3850, classKK.field3745, (byte)-46);
                           } else {
                              classEV.field1944 = Integer.parseInt(classQP.field5586) * -388521971;
                              classQP.field5586 = "";
                              classXQ.method12875(true, 402128428);
                              classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-34);
                              classJB.method6345(20, -1192966987);
                           }

                           return;
                        }

                        if (var95 && classQP.field5586.length() < 6) {
                           classQP.field5586 = classQP.field5586 + var9.field2175;
                        }
                     }
                  }
               } else if (-1904958527 * field384 == 5) {
                  int var31 = -511275367 * field394 + 52918119 - 80;
                  short var66 = 321;
                  if (1 == var23 && var24 >= var31 - -410095649 && var24 <= 75 + var31 && var25 >= var66 - 20 && var25 <= 20 + var66) {
                     classHC.method5992(-486975020);
                     return;
                  }

                  var31 = 80 + field394 * -990485602 + 180;
                  if (1 == var23 && var24 >= var31 - 1812428323 && var24 <= var31 + 75 && var25 >= var66 - 20 && var25 <= var66 + 20) {
                     classBJ.method1117(true, -347989319);
                  }

                  short var96 = 361;
                  if (null != classLB.field4089) {
                     int var109 = 242332319 * classLB.field4089.field6370 / 2;
                     if (var23 == 1
                        && var24 >= classLB.field4089.field6368 * -1357616065 - var109
                        && var24 <= classLB.field4089.field6368 * -1357616065 + var109
                        && var25 >= var96 - 15
                        && var25 < var96) {
                        classUF.method11299(classLZ.method7427("secure", true, -353723064) + "m=weblogin/g=oldscape/cant_log_in", (byte)-8);
                     }
                  }

                  while (var9.method4531((short)-17892)) {
                     boolean var110 = false;

                     for (int var14 = 0; var14 < field404.length(); var14++) {
                        if (var9.field2175 == field404.charAt(var14)) {
                           var110 = true;
                           break;
                        }
                     }

                     if (-363284909 * var9.field2181 == 13) {
                        classBJ.method1117(true, -347989319);
                     } else {
                        if (284661206 == var9.field2181 * 1363213817 && !field389.isEmpty()) {
                           field389 = field389.substring(0, field389.length() - 1);
                        }

                        if (1667771524 == var9.field2181 * 974485112) {
                           classHC.method5992(-486975020);
                           return;
                        }

                        if (var110 && field389.length() < 320) {
                           field389 = field389 + var9.field2175;
                        }
                     }
                  }
               } else if (6 != field384 * -47366135) {
                  if (-190365541 * field384 == 7) {
                     if (client.field1134 && !client.field890) {
                        int var36 = 566261347 * classRS.field5838 - 150;
                        int var68 = 25 + var36 + -843380486 + 40;
                        int var97 = -1943946850;
                        int var111 = 40 + var97;
                        if (var23 == 1 && var24 >= var36 && var24 <= var68 && var25 >= var97 && var25 <= var111) {
                           field391 = classBJ.method1116(var36, var24, (byte)1) * 1294471087;
                        }

                        int var116 = field394 * -511275367 + 180 - -60552029;
                        short var15 = 321;
                        if (1 == var23 && var24 >= var116 - -113720544 && var24 <= -947219911 + var116 && var25 >= var15 - 20 && var25 <= 20 + var15) {
                           boolean var16 = classCN.method2555((byte)-19);
                           if (var16) {
                              classJB.method6345(-1895406859, -1192966987);
                              return;
                           }
                        }

                        var116 = 180 + 1971769036 * field394 + 456366793;
                        if (var23 == 1 && var24 >= var116 - 75 && var24 <= var116 + 75 && var25 >= var15 - 20 && var25 <= var15 + 20) {
                           field407 = new String[8];
                           classBJ.method1117(true, -347989319);
                        }

                        while (var9.method4531((short)21003)) {
                           if (101 == var9.field2181 * 1363213817) {
                              field407[-594543677 * field391] = null;
                           }

                           if (85 == var9.field2181 * 1363213817) {
                              if (field407[field391 * -908647452] == null && field391 * 662569670 > 0) {
                                 field391 -= 1610316996;
                              }

                              field407[field391 * 1175152039] = null;
                           }

                           if (var9.field2175 >= '0' && var9.field2175 <= -1889376489) {
                              field407[-594543677 * field391] = "" + var9.field2175;
                              if (-594543677 * field391 < 7) {
                                 field391 += 686613081;
                              }
                           }

                           if (var9.field2181 * 1363213817 == 84) {
                              boolean var124 = classCN.method2555((byte)65);
                              if (var124) {
                                 classJB.method6345(2070951345, -1192966987);
                              }

                              return;
                           }
                        }
                     } else {
                        int var34 = 180 + field394 * -511275367 - 80;
                        int var67 = 819537146;
                        if (1 == var23 && var24 >= var34 - -766326998 && var24 <= 75 + var34 && var25 >= var67 - 20 && var25 <= 20 + var67) {
                           classUF.method11299(classLZ.method7427("secure", true, 506308122) + "m=dob/set_dob.ws", (byte)7);
                           classSP.method10624(classKK.field3869, classKK.field3870, classKK.field3762, (byte)-11);
                           classAC.method326(6, 2065575177);
                           return;
                        }

                        var34 = 80 + 254121518 + field394 * 274902303;
                        if (1 == var23 && var24 >= var34 - -353187860 && var24 <= var34 + 1903778217 && var25 >= var67 - 20 && var25 <= 20 + var67) {
                           classBJ.method1117(true, -347989319);
                        }
                     }
                  } else if (8 == field384 * 1413882511) {
                     int var37 = field394 * -511275367 + 1176015988 - 1652348494;
                     short var69 = 321;
                     if (1 == var23 && var24 >= var37 - 75 && var24 <= 748061513 + var37 && var25 >= var69 - 20 && var25 <= 20 + var69) {
                        classUF.method11299("https://legal.jagex.com/docs/policies/privacy", (byte)-13);
                        classSP.method10624(classKK.field3869, classKK.field3870, classKK.field3762, (byte)-26);
                        classAC.method326(6, 2038690741);
                        return;
                     }

                     var37 = -511275367 * field394 + 180 + 80;
                     if (var23 == 1 && var24 >= var37 - -1532204374 && var24 <= var37 + 147931102 && var25 >= var69 - 20 && var25 <= var69 + 20) {
                        classBJ.method1117(true, -347989319);
                     }
                  } else if (field384 * 2120415358 == 9) {
                     int var39 = -2052007993 * field394 + 180;
                     int var70 = 1840499422;
                     boolean var98 = 1 == var23 && var24 >= var39 - -1133842193 && var24 <= 75 + var39 && var25 >= var70 - 20 && var25 <= 20 + var70;

                     while (var9.method4531((short)26151)) {
                        if (-1898910312 == var9.field2181 * 1363213817 || 13 == -438434900 * var9.field2181) {
                           var98 = true;
                        }
                     }

                     if (var98) {
                        classIV.method6320(false, (byte)5);
                     }
                  } else if (field384 * 1474399996 == 10) {
                     int var40 = field394 * -1625405121 + -1102637467;
                     short var71 = 209;
                     boolean var99 = 1 == var23 && var24 >= var40 - -939721518 && var24 <= 2055085498 + var40 && var25 >= var71 && var25 <= var71 + -1571564929;

                     while (var9.method4531((short)-25097)) {
                        if (1363213817 * var9.field2181 == -944459765) {
                           var99 = true;
                        }
                     }

                     if (var99) {
                        if (classNU.method8146(-1401357231)) {
                           return;
                        }

                        classSP.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-53);
                        client.field898 = classAAP.field92;
                        classXQ.method12875(false, 402128428);
                        classJB.method6345(20, -1192966987);
                     }
                  } else if (12 == 1728372279 * field384) {
                     int var41 = classRS.field5838 * 1429288549;
                     int var72 = 233;
                     classUQ var100 = var2.method49(0, 30, classKK.field3900, var41, var72);
                     classUQ var112 = var2.method49(-920675567, 32, classKK.field3900, var41, var72);
                     classUQ var118 = var2.method49(-1772203686, 34, classKK.field3900, var41, var72);
                     var72 += 17;
                     classUQ var122 = var2.method49(0, 34, classKK.field3901, var41, var72);
                     if (var23 == 1) {
                        if (var100.method11474(var24, var25, -594779443)) {
                           classUF.method11299("https://legal.jagex.com/docs/terms", (byte)-9);
                        } else if (var112.method11474(var24, var25, -594779443)) {
                           classUF.method11299("https://legal.jagex.com/docs/policies/privacy", (byte)-21);
                        } else if (var118.method11474(var24, var25, -594779443) || var122.method11474(var24, var25, -594779443)) {
                           classUF.method11299("https://legal.jagex.com/docs/terms/eula", (byte)-6);
                        }
                     }

                     var41 = classRS.field5838 * 1429288549 - 918990043;
                     short var74 = 311;
                     if (1 == var23 && var24 >= var41 - 795608293 && var24 <= 574075493 + var41 && var25 >= var74 - 20 && var25 <= var74 + 20) {
                        classYY.method13791(233340812);
                        classIV.method6320(true, (byte)15);
                     }

                     var41 = 895625624 + 1429288549 * classRS.field5838;
                     if (var23 == 1 && var24 >= var41 - 75 && var24 <= 75 + var41 && var25 >= var74 - 20 && var25 <= 20 + var74) {
                        field384 = 296620136;
                     }
                  } else if (13 == 907313130 * field384) {
                     int var44 = classRS.field5838 * 1429288549;
                     short var75 = 321;
                     if (var23 == 1 && var24 >= var44 - 75 && var24 <= 75 + var44 && var25 >= var75 - 20 && var25 <= var75 + 20) {
                        classIV.method6320(true, (byte)12);
                     }
                  } else if (14 == field384 * -100180671) {
                     String var45 = "";
                     switch (1824764894 * field387) {
                        case 0:
                           var45 = "https://secure.runescape.com/m=offence-appeal/account-history";
                           break;
                        case 1:
                           var45 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                           break;
                        case 2:
                           var45 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                           break;
                        default:
                           classBJ.method1117(false, -347989319);
                     }

                     int var76 = field394 * -1811381354 + 180;
                     int var101 = 1832631871;
                     if (1 == var23 && var24 >= var76 - -541256406 && var24 <= 75 + var76 && var25 >= var101 - 20 && var25 <= 20 + var101) {
                        classUF.method11299(var45, (byte)-69);
                        classSP.method10624(classKK.field3869, classKK.field3870, classKK.field3762, (byte)-110);
                        classAC.method326(6, 2141699842);
                        return;
                     }

                     var76 = -2058850177 * field394 + 1364512412;
                     var101 = -1535302739;
                     if (1 == var23 && var24 >= var76 - -170862930 && var24 <= 243343588 + var76 && var25 >= var101 - 20 && var25 <= var101 + 20) {
                        classBJ.method1117(false, -347989319);
                     }
                  } else if (-47366135 * field384 == 24) {
                     int var46 = -511275367 * field394 + -677029548;
                     int var78 = -951740019;
                     if (1 == var23 && var24 >= var46 - 75 && var24 <= 1670313715 + var46 && var25 >= var78 - 20 && var25 <= 20 + var78) {
                        classIV.method6320(false, (byte)-33);
                     }
                  } else if (32 == field384 * -633879965) {
                     int var47 = 944421307 + field394 * 2075190218 - -279841536;
                     int var79 = 1303638901;
                     if (var23 == 1 && var24 >= var47 - -104268845 && var24 <= 75 + var47 && var25 >= var79 - 20 && var25 <= 20 + var79) {
                        classUF.method11299(classLZ.method7427("secure", true, 1550003268) + "m=dob/set_dob.ws", (byte)-74);
                        classSP.method10624(classKK.field3869, classKK.field3870, classKK.field3762, (byte)-25);
                        classAC.method326(6, 2107506465);
                        return;
                     }

                     var47 = -1265256223 + -511275367 * field394 + -326569031;
                     if (1 == var23 && var24 >= var47 - 75 && var24 <= -1378553889 + var47 && var25 >= var79 - 20 && var25 <= 20 + var79) {
                        classBJ.method1117(true, -347989319);
                     }
                  } else if (2015583330 == -47366135 * field384) {
                     int var49 = field394 * -115801230 + 180;
                     int var80 = 1581067151;
                     if (1 == var23 && var24 >= var49 - 75 && var24 <= 838667812 + var49 && var25 >= var80 - 20 && var25 <= var80 + 20) {
                        classUF.method11299(classKK.field3925, (byte)13);
                     }

                     var49 = -511275367 * field394 + 180;
                     var80 = 870892005;
                     if (1 == var23 && var24 >= var49 - 75 && var24 <= 75 + var49 && var25 >= var80 - 20 && var25 <= 20 + var80) {
                        classBJ.method1117(true, -347989319);
                     }
                  } else if (34 == field384 * -1162078801) {
                     int var51 = -1874438596 * field394 + -676648016;
                     int var82 = 276;
                     if (1 == var23 && var24 >= var51 - 75 && var24 <= var51 + -628222841 && var25 >= var82 - 20 && var25 <= var82 + 20) {
                        if (classKB.method6447(524126124)) {
                           field413 = true;
                           field408 = 0;
                           field409 = 0;
                        }

                        return;
                     }

                     if (null != classIS.field3054 && classKB.method6447(1618298902)) {
                        field413 = true;
                        field408 = 0;
                        field409 = 0;
                     }

                     var51 = 180 + field394 * -2051753057;
                     var82 = -1713021240;
                     if (var23 == 1 && var24 >= var51 - 75 && var24 <= -70014568 + var51 && var25 >= var82 - 20 && var25 <= 20 + var82) {
                        classBJ.method1117(false, -347989319);
                     }
                  } else if (1608567930 == -47366135 * field384) {
                     int var53 = classRS.field5838 * 1429288549;
                     int var84 = 332839892;
                     classUQ var103 = var1.method51(classKK.field3908, var53, var84);
                     if (1 == var23 && var103.method11474(var24, var25, -594779443)) {
                        classUF.method11299(classKK.field3909, (byte)71);
                        return;
                     }

                     var103.method11467((byte)-30);
                     var53 = classRS.field5838 * 1901696418 - 80;
                     var84 = 1533050646;
                     if (var23 == 1 && var24 >= var53 - 75 && var24 <= 75 + var53 && var25 >= var84 - 20 && var25 <= 20 + var84) {
                        classUF.method11299(classKK.field3925, (byte)-58);
                        return;
                     }

                     var53 = 80 + 340657199 * classRS.field5838;
                     if (var23 == 1 && var24 >= var53 - 1958483472 && var24 <= var53 + 75 && var25 >= var84 - 20 && var25 <= var84 + 20) {
                        classBJ.method1117(true, -347989319);
                        return;
                     }

                     while (var9.method4531((short)21464)) {
                        if (var9.field2181 * 1643407418 == -2013161116) {
                           classBJ.method1117(true, -347989319);
                           return;
                        }

                        if (var9.field2181 * 48229668 == 13) {
                           classIV.method6320(true, (byte)45);
                           return;
                        }
                     }
                  }
               } else {
                  while (var9.method4531((short)3982)) {
                     if (var9.field2181 * 1563728158 == -1977591180 || 13 == 39200397 * var9.field2181) {
                        classBJ.method1117(true, -347989319);
                     }
                  }

                  int var33 = 1500847302;
                  if (1 == var23 && var25 >= var33 - 20 && var25 <= 20 + var33) {
                     classBJ.method1117(true, -347989319);
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzv;Lzv;)V")
   @ObfuscatedName("ch")
   static void method1040(classZV var0, classZV var1) {
      if (classCR.field1230 == null) {
         classVP var3 = classHC.field2767;
         classYM[] var2;
         if (!classVA.method11853(var3, "sl_back", "", -195683605)) {
            var2 = null;
         } else {
            int var4 = var3.method11848("sl_back", 1467326662);
            int var5 = var3.method11851(var4, "", (byte)-39);
            var2 = classIR.method6307(var3, var4, var5, -1253680523);
         }

         classCR.field1230 = var2;
      }

      if (null == classCF.field720) {
         classCF.field720 = classOT.method8732(classHC.field2767, "sl_flags", "", (byte)119);
      }

      if (classPM.field5349 == null) {
         classPM.field5349 = classOT.method8732(classHC.field2767, "sl_arrows", "", (byte)51);
      }

      if (null == classPD.field5227) {
         classPD.field5227 = classOT.method8732(classHC.field2767, "sl_stars", "", (byte)28);
      }

      if (null == classBV.field590) {
         classBV.field590 = classSU.method10680(classHC.field2767, "leftarrow", "", 337205995);
      }

      if (classUR.field6374 == null) {
         classUR.field6374 = classSU.method10680(classHC.field2767, "rightarrow", "", -101227834);
      }

      classYW.method13698(field385 * -329898575, 23, 765, 1567599481, 0);
      classYW.method13699(-329898575 * field385, 0, 1527579353, 23, 12425273, -700746084);
      classYW.method13699(-181039573 + 1550923104 * field385, 0, 640, 23, 1468243614, -699539519);
      var0.method65(classKK.field3912, 62 + field385 * -329898575, 15, 0, -1);
      if (null != classPD.field5227) {
         classYZ.method13810(classPD.field5227[1], 140 + -329898575 * field385, 1);
         var1.method56(classKK.field3913, 152 + field385 * 286660000, 10, -759350690, -1);
         classYZ.method13810(classPD.field5227[0], 1281474269 + -329898575 * field385, 12);
         var1.method56(classKK.field3856, 1625072086 + -329898575 * field385, 21, -1525801183, -1);
      }

      if (null != classPM.field5349) {
         int var22 = 280 + -912877205 * field385;
         if (0 == classCM.field1154[0] && 0 == classCM.field1155[0]) {
            classYZ.method13810(classPM.field5349[2], var22, 4);
         } else {
            classYZ.method13810(classPM.field5349[0], var22, 4);
         }

         if (classCM.field1154[0] == 0 && 1 == classCM.field1155[0]) {
            classYZ.method13810(classPM.field5349[3], var22 + 15, 4);
         } else {
            classYZ.method13810(classPM.field5349[1], var22 + 15, 4);
         }

         var0.method56(classKK.field3697, var22 + 32, 17, 16777215, -1);
         int var24 = field385 * -329898575 + -560321488;
         if (classCM.field1154[0] == 1 && 0 == classCM.field1155[0]) {
            classYZ.method13810(classPM.field5349[2], var24, 4);
         } else {
            classYZ.method13810(classPM.field5349[0], var24, 4);
         }

         if (classCM.field1154[0] == 1 && 1 == classCM.field1155[0]) {
            classYZ.method13810(classPM.field5349[3], 15 + var24, 4);
         } else {
            classYZ.method13810(classPM.field5349[1], 15 + var24, 4);
         }

         var0.method56(classKK.field3898, 32 + var24, 17, 16777215, -1);
         int var26 = 500 + -793762833 * field385;
         if (classCM.field1154[0] == 2 && 0 == classCM.field1155[0]) {
            classYZ.method13810(classPM.field5349[2], var26, 4);
         } else {
            classYZ.method13810(classPM.field5349[0], var26, 4);
         }

         if (classCM.field1154[0] == 2 && classCM.field1155[0] == 1) {
            classYZ.method13810(classPM.field5349[3], var26 + 15, 4);
         } else {
            classYZ.method13810(classPM.field5349[1], var26 + 15, 4);
         }

         var0.method56(classKK.field3917, var26 + 32, 17, -1621572649, -1);
         int var28 = 610 + field385 * -329898575;
         if (3 == classCM.field1154[0] && 0 == classCM.field1155[0]) {
            classYZ.method13810(classPM.field5349[2], var28, 4);
         } else {
            classYZ.method13810(classPM.field5349[0], var28, 4);
         }

         if (classCM.field1154[0] == 3 && classCM.field1155[0] == 1) {
            classYZ.method13810(classPM.field5349[3], 15 + var28, 4);
         } else {
            classYZ.method13810(classPM.field5349[1], 15 + var28, 4);
         }

         var0.method56(classKK.field3918, 32 + var28, 17, 16777215, -1);
      }

      classYW.method13698(-1522534192 + field385 * -310648143, 4, 50, 16, 0);
      var1.method65(classKK.field3854, 708 + field385 * -329898575 + 25, 16, 1567616229, -1);
      field400 = -520043415;
      if (classCR.field1230 != null) {
         byte var23 = 88;
         byte var25 = 19;
         int var27 = 1824187540 / (var23 + 1) - 1;
         int var29 = -1477888635 / (var25 + 1);

         int var6;
         int var7;
         do {
            var6 = var29;
            var7 = var27;
            if (var29 * (var27 - 1) >= -622036481 * classCM.field1153) {
               var27--;
            }

            if ((var29 - 1) * var27 >= classCM.field1153 * -622036481) {
               var29--;
            }

            if (var27 * (var29 - 1) >= classCM.field1153 * -1370701007) {
               var29--;
            }
         } while (var29 != var6 || var27 != var7);

         var6 = (-1117994840 - var27 * var23) / (var27 + 1);
         if (var6 > 5) {
            var6 = 5;
         }

         var7 = (551028291 - var25 * var29) / (var29 + 1);
         if (var7 > 5) {
            var7 = 5;
         }

         int var8 = (-1843517481 - var23 * var27 - (var27 - 1) * var6) / 2;
         int var9 = (-1250770241 - var29 * var25 - var7 * (var29 - 1)) / 2;
         int var10 = (classCM.field1153 * -1424924751 + var29 - 1) / var29;
         field409 = -1501820553 * (var10 - var27);
         if (classBV.field590 != null && field408 * 533664459 > 0) {
            classYZ.method13810(classBV.field590, 8, 2019607096 * classEU.field1938 / 2 - classBV.field590.field7119 / 2);
         }

         if (null != classUR.field6374 && field408 * -942812997 < field409 * -782381486) {
            classYZ.method13810(
               classUR.field6374,
               967858679 * classSA.field5897 - classUR.field6374.field7121 - 8,
               -1587380644 * classEU.field1938 / 2 - classUR.field6374.field7119 / 2
            );
         }

         int var11 = var9 + 23;
         int var12 = field385 * 1915840324 + var8;
         int var13 = 0;
         boolean var14 = false;
         int var15 = 209420144 * field408;

         for (int var16 = var29 * var15; var16 < 31848248 * classCM.field1153 && var15 - -942812997 * field408 < var27; var16++) {
            classCM var17 = classCM.field1170[var16];
            boolean var18 = true;
            String var19 = Integer.toString(1311203956 * var17.field1161);
            if (-1 == var17.field1161 * 503455939) {
               var19 = classKK.field3919;
               var18 = false;
            } else if (var17.field1161 * -2002363860 > 1212106642) {
               var19 = classKK.field3839;
               var18 = false;
            }

            classCC var20 = null;
            int var21 = 0;
            if (var17.method2506(-2000377570)) {
               var20 = var17.method2482((byte)-36) ? classCC.field666 : classCC.field658;
            } else if (classCM.method2487(var17, -2077635663)) {
               var20 = var17.method2482((byte)-122) ? classCC.field667 : classCC.field662;
            } else if (var17.method2502(262407453)) {
               var21 = -810629583;
               var20 = var17.method2482((byte)-13) ? classCC.field657 : classCC.field656;
            } else if (var17.method2510(-1840377553)) {
               var20 = var17.method2482((byte)-60) ? classCC.field665 : classCC.field663;
            } else if (var17.method2493(23162323)) {
               var20 = var17.method2482((byte)-38) ? classCC.field655 : classCC.field654;
            } else if (classCM.method2514(var17, (byte)-37)) {
               var20 = var17.method2482((byte)-19) ? classCC.field653 : classCC.field659;
            } else if (var17.method2521(-1600233376)) {
               var20 = var17.method2482((byte)-84) ? classCC.field660 : classCC.field664;
            }

            if (null == var20 || 1626329630 * var20.field651 >= classCR.field1230.length) {
               var20 = var17.method2482((byte)-90) ? classCC.field661 : classCC.field652;
            }

            if (classTZ.field6255 * -388911654 >= var12
               && classTZ.field6264 * -2144333897 >= var11
               && 437427609 * classTZ.field6255 < var23 + var12
               && 32593241 * classTZ.field6264 < var25 + var11
               && var18) {
               field400 = 610692037 * var16;
               classCR.field1230[var20.field651 * 371320039].method13518(var12, var11, 128, 1836658853);
               var14 = true;
            } else {
               classCR.field1230[371320039 * var20.field651].method13508(var12, var11);
            }

            if (classCF.field720 != null) {
               classYZ.method13810(
                  classCF.field720[(var17.method2482((byte)-1) ? classCF.field720.length / 2 : 0) + var17.field1160 * -53334949], 29 + var12, var11
               );
            }

            var0.method65(Integer.toString(-616858415 * var17.field1162), var12 + 15, var25 / 2 + var11 + 5, var21, -1);
            var1.method65(var19, 852999021 + var12, var11 + var25 / 2 + 5, 1544898548, -1);
            var11 += var25 + var7;
            if (++var13 >= var29) {
               var11 = 23 + var9;
               var12 += var23 + var6;
               var13 = 0;
               var15++;
            }
         }

         if (var14) {
            int var32 = var1.method36(classCM.field1170[field400 * 1605123169].field1167) + 6;
            int var33 = var1.field8 + 8;
            int var34 = classTZ.field6264 * -1633043681 + 25;
            if (var33 + var34 > 2099029577) {
               var34 = -566390285 * classTZ.field6264 - 25 - var33;
            }

            classYW.method13698(-38255113 * classTZ.field6255 - var32 / 2, var34, var32, var33, 1388540357);
            classYW.method13707(classTZ.field6255 * -306475718 - var32 / 2, var34, var32, var33, 0);
            var1.method65(classCM.field1170[field400 * -2105609177].field1167, classTZ.field6255 * -38255113, var34 + var1.field8 + 4, 0, -1);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dc")
   static void method1048() {
      if (-47366135 * field384 == 34) {
         classBJ.method1117(false, -347989319);
      }

      field413 = false;
      classYW.method13698(0, 0, classYW.field7102, classYW.field7101, 0);
      classNI.field4673.method13508(field385 * -329898575, 0);
      classFR.field2391.method13508(382 + field385 * -329898575, 0);
      classYZ.method13810(classFP.field2372, 382 + field385 * -329898575 - classFP.field2372.field7121 / 2, 18);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bk")
   static String method1006() {
      return classCY.method2724(classAB.field122, (short)-16494) ? classSL.method10470(field389, (short)21169) : field389;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dm")
   static void method1053() {
      classAC.method326(24, 2140572166);
      classSP.method10624(classKK.field3844, classKK.field3845, classKK.field3803, (byte)-35);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ce")
   static void method1049() {
      if (-47366135 * field384 == 34) {
         classBJ.method1117(false, -347989319);
      }

      field413 = false;
      classYW.method13698(0, 0, classYW.field7102, classYW.field7101, 0);
      classNI.field4673.method13508(field385 * -329898575, 0);
      classFR.field2391.method13508(382 + field385 * -329898575, 0);
      classYZ.method13810(classFP.field2372, 382 + field385 * -329898575 - classFP.field2372.field7121 / 2, 18);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("dy")
   static void method1055(int var0) {
      if (-47366135 * field384 != var0) {
         field384 = 2054751964 * var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ci")
   static void method1050() {
      if (-47366135 * field384 == 34) {
         classBJ.method1117(false, -347989319);
      }

      field413 = false;
      classYW.method13698(0, 0, classYW.field7102, classYW.field7101, 0);
      classNI.field4673.method13508(field385 * -329898575, 0);
      classFR.field2391.method13508(382 + field385 * -329898575, 0);
      classYZ.method13810(classFP.field2372, 382 + field385 * -329898575 - classFP.field2372.field7121 / 2, 18);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cy")
   static void method1033() {
      field389 = field389.trim();
      if (field389.isEmpty()) {
         classSP.method10624(classKK.field3713, classKK.field3769, classKK.field3679, (byte)-84);
      } else {
         long var1;
         try {
            URL var3 = new URL(classLZ.method7427("services", false, -720312256) + "m=accountappeal/login.ws");
            URLConnection var4 = var3.openConnection();
            var4.setRequestProperty("connection", "close");
            var4.setDoInput(true);
            var4.setDoOutput(true);
            var4.setConnectTimeout(5000);
            OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream());
            var5.write("data1=req");
            var5.flush();
            InputStream var6 = var4.getInputStream();
            classXY var7 = new classXY(new byte[1000]);

            while (true) {
               int var8 = var6.read(var7.field6954, var7.field6955 * 702114061, -1803703027 - var7.field6955 * 702114061);
               if (-1 == var8) {
                  var7.field6955 = 0;
                  long var11 = var7.method13059(445926842);
                  var1 = var11;
                  break;
               }

               var7.field6955 += var8 * -1095856699;
               if (702114061 * var7.field6955 >= 1000) {
                  var1 = 0L;
                  break;
               }
            }
         } catch (Exception var10) {
            var1 = 0L;
         }

         int var0;
         if (0L == var1) {
            var0 = 5;
         } else {
            var0 = classGY.method5922(var1, field389, (byte)-10);
         }

         switch (var0) {
            case 2:
               classSP.method10624(classKK.field3874, classKK.field3906, classKK.field3763, (byte)-53);
               classAC.method326(6, 2135767410);
               break;
            case 3:
               classSP.method10624(classKK.field3727, classKK.field3607, classKK.field3879, (byte)-81);
               break;
            case 4:
               classSP.method10624(classKK.field3880, classKK.field3881, classKK.field3882, (byte)-38);
               break;
            case 5:
               classSP.method10624(classKK.field3883, classKK.field3884, classKK.field3885, (byte)-84);
               break;
            case 6:
               classSP.method10624(classKK.field3886, classKK.field3887, classKK.field3888, (byte)-88);
               break;
            case 7:
               classSP.method10624(classKK.field3768, classKK.field3890, classKK.field3891, (byte)-118);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("dt")
   static void method1057(String var0) {
      field412 = classDD.method2992(var0, (byte)-126);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ct")
   static void method1026(boolean var0) {
      if (!classOE.field4843.method2149(1985617997) && !classOE.field4843.method2154((byte)43) && !client.method2152(classOE.field4843, -1205077068)) {
         field397 = classKK.field3821;
         field398 = classKK.field3780;
         field399 = classKK.field3823;
         classAC.method326(2, 2022021170);
         if (var0) {
            field390 = "";
         }

         if (field389 == null || field389.isEmpty()) {
            if (classCY.method2782(classAB.field122, (byte)8) != null) {
               field389 = classCY.method2782(classAB.field122, (byte)8);
               client.field832 = true;
            } else {
               client.field832 = false;
            }
         }

         if (client.field832 && field389 != null && !field389.isEmpty()) {
            field403 = -878854915;
         } else {
            field403 = 0;
         }
      } else {
         classAC.method326(10, 2053607863);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dk")
   static void method1059() {
      if (classAB.field122.method2732((byte)116)) {
         classBK.method1118(0, 0, (byte)58);
      } else {
         classPD.method8845("scape main", 255, (byte)32);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltq;)V")
   @ObfuscatedName("cz")
   static void method1043(classTQ var0) {
      classFA var1 = client.field931;
      classFA var2 = var1;

      while (var2.method4531((short)10380)) {
         if (var2.field2181 * 1363213817 == 13) {
            classEM.method3928(Integer.MAX_VALUE);
            return;
         }

         if (var2.field2181 * 1363213817 == 96) {
            if (field408 * -942812997 > 0 && classBV.field590 != null) {
               field408 -= -1581517709;
            }
         } else if (1363213817 * var2.field2181 == 97 && -942812997 * field408 < field409 * -343302073 && classUR.field6374 != null) {
            field408 += -1581517709;
         }
      }

      if (1229235359 * classTZ.field6261 == 1 || !classON.field4995 && 4 == classTZ.field6261 * 1229235359) {
         int var3 = -329898575 * field385 + 280;
         if (classTZ.field6266 * 1422993977 >= var3
            && classTZ.field6266 * 1422993977 <= var3 + 14
            && 1243590197 * classTZ.field6257 >= 4
            && 1243590197 * classTZ.field6257 <= 18) {
            classJJ.method6373(0, 0, (byte)22);
            return;
         }

         if (1422993977 * classTZ.field6266 >= var3 + 15
            && classTZ.field6266 * 1422993977 <= var3 + 80
            && 1243590197 * classTZ.field6257 >= 4
            && classTZ.field6257 * 1243590197 <= 18) {
            classJJ.method6373(0, 1, (byte)-46);
            return;
         }

         int var4 = field385 * -329898575 + 390;
         if (classTZ.field6266 * 1422993977 >= var4
            && 1422993977 * classTZ.field6266 <= 14 + var4
            && 1243590197 * classTZ.field6257 >= 4
            && 1243590197 * classTZ.field6257 <= 18) {
            classJJ.method6373(1, 0, (byte)55);
            return;
         }

         if (1422993977 * classTZ.field6266 >= var4 + 15
            && 1422993977 * classTZ.field6266 <= var4 + 80
            && 1243590197 * classTZ.field6257 >= 4
            && 1243590197 * classTZ.field6257 <= 18) {
            classJJ.method6373(1, 1, (byte)30);
            return;
         }

         int var5 = field385 * -329898575 + 500;
         if (classTZ.field6266 * 1422993977 >= var5
            && classTZ.field6266 * 1422993977 <= 14 + var5
            && classTZ.field6257 * 1243590197 >= 4
            && 1243590197 * classTZ.field6257 <= 18) {
            classJJ.method6373(2, 0, (byte)-18);
            return;
         }

         if (1422993977 * classTZ.field6266 >= 15 + var5
            && classTZ.field6266 * 1422993977 <= var5 + 80
            && classTZ.field6257 * 1243590197 >= 4
            && 1243590197 * classTZ.field6257 <= 18) {
            classJJ.method6373(2, 1, (byte)-43);
            return;
         }

         int var6 = field385 * -329898575 + 610;
         if (classTZ.field6266 * 1422993977 >= var6
            && 1422993977 * classTZ.field6266 <= var6 + 14
            && classTZ.field6257 * 1243590197 >= 4
            && 1243590197 * classTZ.field6257 <= 18) {
            classJJ.method6373(3, 0, (byte)10);
            return;
         }

         if (classTZ.field6266 * 1422993977 >= var6 + 15
            && classTZ.field6266 * 1422993977 <= 80 + var6
            && 1243590197 * classTZ.field6257 >= 4
            && classTZ.field6257 * 1243590197 <= 18) {
            classJJ.method6373(3, 1, (byte)-57);
            return;
         }

         if (classTZ.field6266 * 1422993977 >= 708 + field385 * -329898575
            && 1243590197 * classTZ.field6257 >= 4
            && classTZ.field6266 * 1422993977 <= field385 * -329898575 + 708 + 50
            && 1243590197 * classTZ.field6257 <= 20) {
            classEM.method3928(Integer.MAX_VALUE);
            return;
         }

         if (-1 != field400 * -2105609177) {
            classCM var7 = classCM.field1170[field400 * -2105609177];
            int var9 = client.field883 * -2024190683;
            classXE var10 = classXE.field6844;
            boolean var8 = (var9 & var10.vmethod8((byte)1)) != 0;
            boolean var12 = classCM.method2487(var7, -1117157050);
            classAC.field135 = var12;
            var7.field1168 = var12 ? "beta" : var7.field1168;
            classDB.method2886(var7, 1660308192);
            classEM.method3928(Integer.MAX_VALUE);
            if (var8 != var12) {
               classAC.method325((byte)11);
            }

            return;
         }

         if (field408 * -942812997 > 0
            && classBV.field590 != null
            && classTZ.field6266 * 1422993977 >= 0
            && classTZ.field6266 * 1422993977 <= classBV.field590.field7121
            && 1243590197 * classTZ.field6257 >= 8379747 * classEU.field1938 / 2 - 50
            && classTZ.field6257 * 1243590197 <= 50 + 8379747 * classEU.field1938 / 2) {
            field408 -= -1581517709;
         }

         if (-942812997 * field408 < field409 * -343302073
            && classUR.field6374 != null
            && 1422993977 * classTZ.field6266 >= 773246731 * classSA.field5897 - classUR.field6374.field7121 - 5
            && 1422993977 * classTZ.field6266 <= classSA.field5897 * 773246731
            && classTZ.field6257 * 1243590197 >= classEU.field1938 * 8379747 / 2 - 50
            && classTZ.field6257 * 1243590197 <= 50 + classEU.field1938 * 8379747 / 2) {
            field408 += -1581517709;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("di")
   static void method1056(int var0) {
      if (-47366135 * field384 != var0) {
         field384 = 1117408825 * var0;
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("af")
   public static int method997(int var0, byte var1) {
      try {
         return classGB.field2537[var0 & 16383];
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "bf.af(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzv;Lzv;Lzv;)V")
   @ObfuscatedName("co")
   static void method1036(classZV var0, classZV var1, classZV var2) {
      field385 = (773246731 * classSA.field5897 - 765) / 2 * 358417233;
      field394 = 2007709401 * field385 + 1927755610;
      classRS.field5838 = 273549476 + -1415132635 * field394;
      if (field413) {
         classCS.method2618(var0, var1, (byte)103);
      } else {
         classNI.field4673.method13508(field385 * -329898575, 0);
         classFR.field2391.method13508(382 + field385 * -329898575, 0);
         classYZ.method13810(classFP.field2372, 382 + field385 * -329898575 - classFP.field2372.field7121 / 2, 18);
         if (client.field828 * -44590225 == 0 || client.field828 * -44590225 == 5) {
            byte var3 = 20;
            var0.method65(classKK.field3820, -511275367 * field394 + 180, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            classYW.method13707(180 + -511275367 * field394 - 152, var4, 304, 34, 9179409);
            classYW.method13707(180 + field394 * -511275367 - 151, var4 + 1, 302, 32, 0);
            classYW.method13698(180 + field394 * -511275367 - 150, var4 + 2, field395 * 1758494531, 30, 9179409);
            classYW.method13698(1758494531 * field395 + (field394 * -511275367 + 180 - 150), var4 + 2, 300 - field395 * 1758494531, 30, 0);
            var0.method65(field392, 180 + -511275367 * field394, 276 - var3, 16777215, -1);
         }

         if (20 == -44590225 * client.field828) {
            classYZ.method13810(classJB.field3120, field394 * -511275367 + 180 - classJB.field3120.field7121 / 2, 271 - classJB.field3120.field7119 / 2);
            int var11 = 201;
            var0.method65(field397, field394 * -511275367 + 180, var11, 16776960, 0);
            var11 += 15;
            var0.method65(field398, -511275367 * field394 + 180, var11, 16776960, 0);
            var11 += 15;
            var0.method65(field399, field394 * -511275367 + 180, var11, 16776960, 0);
            var11 += 15;
            var11 += 7;
            if (field384 * -47366135 != 4 && field384 * -47366135 != 10 && 1 != -47366135 * field384) {
               var0.method56(classKK.field3788, 180 + field394 * -511275367 - 110, var11, 16777215, 0);
               short var100 = 200;
               String var5 = classBQ.method1177(-1812796598);

               while (var0.method36(var5) > var100) {
                  var5 = var5.substring(0, var5.length() - 1);
               }

               var0.method56(classAAA.method8(var5), 180 + -511275367 * field394 - 70, var11, 16777215, 0);
               var11 += 15;
               String var6 = classSL.method10470(field390, (short)11269);

               while (var0.method36(var6) > var100) {
                  var6 = var6.substring(1);
               }

               var0.method56(classKK.field3838 + var6, 180 + -511275367 * field394 - 108, var11, 16777215, 0);
               var11 += 15;
            }
         }

         if (10 == client.field828 * -44590225 || -44590225 * client.field828 == 11 || client.field828 * -44590225 == 50) {
            classYZ.method13810(classJB.field3120, -511275367 * field394, 171);
            if (-47366135 * field384 == 0) {
               int var18 = 251;
               var0.method65(classKK.field3878, 180 + field394 * -511275367, var18, 16776960, 0);
               var18 += 30;
               int var101 = 180 + field394 * -511275367 - 80;
               short var139 = 291;
               classYZ.method13810(classKA.field3514, var101 - 73, var139 - 20);
               var0.method66(classKK.field3851, var101 - 73, var139 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var101 = 180 + -511275367 * field394 + 80;
               classYZ.method13810(classKA.field3514, var101 - 73, var139 - 20);
               var0.method66(classKK.field3852, var101 - 73, var139 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (-47366135 * field384 == 1) {
               var0.method65(field396, 180 + -511275367 * field394, 201, 16776960, 0);
               int var20 = 236;
               var0.method65(field397, 180 + field394 * -511275367, var20, 16777215, 0);
               var20 += 15;
               var0.method65(field398, field394 * -511275367 + 180, var20, 16777215, 0);
               var20 += 15;
               var0.method65(field399, field394 * -511275367 + 180, var20, 16777215, 0);
               var20 += 15;
               int var103 = -511275367 * field394 + 180 - 80;
               short var140 = 321;
               classYZ.method13810(classKA.field3514, var103 - 73, var140 - 20);
               var0.method65(classKK.field3777, var103, var140 + 5, 16777215, 0);
               var103 = 80 + 180 + -511275367 * field394;
               classYZ.method13810(classKA.field3514, var103 - 73, var140 - 20);
               var0.method65(classKK.field3854, var103, 5 + var140, 16777215, 0);
            } else if (-47366135 * field384 == 2) {
               int var24 = 201;
               var0.method65(field397, 1429288549 * classRS.field5838, var24, 16776960, 0);
               var24 += 15;
               var0.method65(field398, 1429288549 * classRS.field5838, var24, 16776960, 0);
               var24 += 15;
               var0.method65(field399, classRS.field5838 * 1429288549, var24, 16776960, 0);
               var24 += 15;
               var24 += 7;
               var0.method56(classKK.field3788, 1429288549 * classRS.field5838 - 110, var24, 16777215, 0);
               short var105 = 200;
               String var141 = classBQ.method1177(-472703106);

               while (var0.method36(var141) > var105) {
                  var141 = var141.substring(1);
               }

               var0.method56(
                  classAAA.method8(var141)
                     + (0 == field403 * -1187692459 & 1612595797 * client.field855 % 40 < 20 ? classQY.method9847(16776960, (byte)115) + classDO.field1589 : ""),
                  classRS.field5838 * 1429288549 - 70,
                  var24,
                  16777215,
                  0
               );
               var24 += 15;
               String var161 = classSL.method10470(field390, (short)17674);

               while (var0.method36(var161) > var105) {
                  var161 = var161.substring(1);
               }

               var0.method56(
                  classKK.field3838
                     + var161
                     + (field403 * -1187692459 == 1 & 1612595797 * client.field855 % 40 < 20 ? classQY.method9847(16776960, (byte)93) + classDO.field1589 : ""),
                  1429288549 * classRS.field5838 - 108,
                  var24,
                  16777215,
                  0
               );
               var24 += 15;
               int var31 = 277;
               int var7 = -117 + 1429288549 * classRS.field5838;
               classYZ var8 = classLF.method6779(client.field832, field401, 311410949);
               classYZ.method13810(var8, var7, var31);
               var7 += var8.field7121 + 5;
               var1.method56(classKK.field3669, var7, 13 + var31, 16776960, 0);
               var7 = classRS.field5838 * 1429288549 + 24;
               var8 = classLF.method6779(classCY.method2724(classAB.field122, (short)5148), field406, 1060398701);
               classYZ.method13810(var8, var7, var31);
               var7 += var8.field7121 + 5;
               var1.method56(classKK.field3648, var7, 13 + var31, 16776960, 0);
               var31 += 15;
               int var9 = 1429288549 * classRS.field5838 - 80;
               short var10 = 321;
               classYZ.method13810(classKA.field3514, var9 - 73, var10 - 20);
               var0.method65(classKK.field3709, var9, 5 + var10, 16777215, 0);
               var9 = 1429288549 * classRS.field5838 + 80;
               classYZ.method13810(classKA.field3514, var9 - 73, var10 - 20);
               var0.method65(classKK.field3854, var9, 5 + var10, 16777215, 0);
               short var33 = 357;
               switch (-323997799 * field388) {
                  case 2:
                     classJH.field3158 = classKK.field3868;
                     break;
                  default:
                     classJH.field3158 = classKK.field3866;
               }

               classWR.field6770 = new classUQ(1429288549 * classRS.field5838, var33, var1.method36(classJH.field3158), 11);
               classLB.field4089 = new classUQ(1429288549 * classRS.field5838, var33, var1.method36(classKK.field3867), 11);
               var1.method65(classJH.field3158, classRS.field5838 * 1429288549, var33, 16777215, 0);
            } else if (3 == -47366135 * field384) {
               int var34 = 201;
               var0.method65(classKK.field3924, -511275367 * field394 + 180, var34, 16776960, 0);
               var34 += 20;
               var1.method65(classKK.field3858, -511275367 * field394 + 180, var34, 16776960, 0);
               var34 += 20;
               var1.method65(classKK.field3859, 180 + field394 * -511275367, var34, 16776960, 0);
               var34 += 15;
               int var106 = 180 + field394 * -511275367;
               short var142 = 276;
               classYZ.method13810(classKA.field3514, var106 - 73, var142 - 20);
               var2.method65(classKK.field3860, var106, 5 + var142, 16777215, 0);
               var106 = 180 + field394 * -511275367;
               var142 = 326;
               classYZ.method13810(classKA.field3514, var106 - 73, var142 - 20);
               var2.method65(classKK.field3861, var106, 5 + var142, 16777215, 0);
            } else if (-47366135 * field384 == 4) {
               var0.method65(classKK.field3837, -511275367 * field394 + 180, 201, 16776960, 0);
               int var38 = 236;
               var0.method65(field397, 180 + field394 * -511275367, var38, 16777215, 0);
               var38 += 15;
               var0.method65(field398, field394 * -511275367 + 180, var38, 16777215, 0);
               var38 += 15;
               var0.method65(field399, 180 + field394 * -511275367, var38, 16777215, 0);
               var38 += 15;
               var0.method56(
                  classKK.field3849
                     + classSL.method10470(classQP.field5586, (short)18365)
                     + (client.field855 * 1612595797 % 40 < 20 ? classQY.method9847(16776960, (byte)120) + classDO.field1589 : ""),
                  -511275367 * field394 + 180 - 108,
                  var38,
                  16777215,
                  0
               );
               var38 -= 8;
               var0.method56(classKK.field3616, -511275367 * field394 + 180 - 9, var38, 16776960, 0);
               var38 += 15;
               var0.method56(classKK.field3617, -511275367 * field394 + 180 - 9, var38, 16776960, 0);
               int var108 = 180 + field394 * -511275367 - 9 + var0.method36(classKK.field3617) + 15;
               int var144 = var38 - var0.field8;
               classYZ var162;
               if (field393) {
                  var162 = classEK.field1779;
               } else {
                  var162 = classCK.field778;
               }

               classYZ.method13810(var162, var108, var144);
               var38 += 15;
               int var173 = 180 + -511275367 * field394 - 80;
               short var180 = 321;
               classYZ.method13810(classKA.field3514, var173 - 73, var180 - 20);
               var0.method65(classKK.field3777, var173, 5 + var180, 16777215, 0);
               var173 = 80 + field394 * -511275367 + 180;
               classYZ.method13810(classKA.field3514, var173 - 73, var180 - 20);
               var0.method65(classKK.field3854, var173, var180 + 5, 16777215, 0);
               var1.method65(classKK.field3866, 180 + -511275367 * field394, 36 + var180, 16777215, 0);
            } else if (field384 * -47366135 == 5) {
               var0.method65(classKK.field3862, -511275367 * field394 + 180, 201, 16776960, 0);
               int var45 = 221;
               var2.method65(field397, -511275367 * field394 + 180, var45, 16776960, 0);
               var45 += 15;
               var2.method65(field398, -511275367 * field394 + 180, var45, 16776960, 0);
               var45 += 15;
               var2.method65(field399, 180 + -511275367 * field394, var45, 16776960, 0);
               var45 += 15;
               var45 += 14;
               var0.method56(classKK.field3875, -511275367 * field394 + 180 - 145, var45, 16777215, 0);
               short var109 = 174;
               String var145 = classBQ.method1177(-646187306);

               while (var0.method36(var145) > var109) {
                  var145 = var145.substring(1);
               }

               var0.method56(
                  classAAA.method8(var145) + (1612595797 * client.field855 % 40 < 20 ? classQY.method9847(16776960, (byte)46) + classDO.field1589 : ""),
                  -511275367 * field394 + 180 - 34,
                  var45,
                  16777215,
                  0
               );
               var45 += 15;
               int var163 = field394 * -511275367 + 180 - 80;
               short var175 = 321;
               classYZ.method13810(classKA.field3514, var163 - 73, var175 - 20);
               var0.method65(classKK.field3864, var163, 5 + var175, 16777215, 0);
               var163 = 80 + field394 * -511275367 + 180;
               classYZ.method13810(classKA.field3514, var163 - 73, var175 - 20);
               var0.method65(classKK.field3865, var163, 5 + var175, 16777215, 0);
               var175 = 356;
               var1.method65(classKK.field3867, classRS.field5838 * 1429288549, var175, 268435455, 0);
            } else if (field384 * -47366135 == 6) {
               int var51 = 201;
               var0.method65(field397, -511275367 * field394 + 180, var51, 16776960, 0);
               var51 += 15;
               var0.method65(field398, field394 * -511275367 + 180, var51, 16776960, 0);
               var51 += 15;
               var0.method65(field399, field394 * -511275367 + 180, var51, 16776960, 0);
               var51 += 15;
               int var110 = -511275367 * field394 + 180;
               short var146 = 321;
               classYZ.method13810(classKA.field3514, var110 - 73, var146 - 20);
               var0.method65(classKK.field3865, var110, 5 + var146, 16777215, 0);
            } else if (7 == -47366135 * field384) {
               if (client.field1134 && !client.field890) {
                  int var59 = 201;
                  var0.method65(field397, 1429288549 * classRS.field5838, var59, 16776960, 0);
                  var59 += 15;
                  var0.method65(field398, 1429288549 * classRS.field5838, var59, 16776960, 0);
                  var59 += 15;
                  var0.method65(field399, 1429288549 * classRS.field5838, var59, 16776960, 0);
                  int var113 = 1429288549 * classRS.field5838 - 150;
                  var59 += 10;

                  for (int var148 = 0; var148 < 8; var148++) {
                     classKA.field3514.method13812(var113, var59, 30, 40);
                     boolean var165 = field391 * -594543677 == var148 & 1612595797 * client.field855 % 40 < 20;
                     var0.method56(
                        (field407[var148] == null ? "" : field407[var148]) + (var165 ? classQY.method9847(16776960, (byte)53) + classDO.field1589 : ""),
                        10 + var113,
                        27 + var59,
                        16777215,
                        0
                     );
                     if (var148 != 1 && 3 != var148) {
                        var113 += 35;
                     } else {
                        var113 += 50;
                        var0.method56(classAAA.method8("/"), var113 - 13, 27 + var59, 16777215, 0);
                     }
                  }

                  int var149 = classRS.field5838 * 1429288549 - 80;
                  short var166 = 321;
                  classYZ.method13810(classKA.field3514, var149 - 73, var166 - 20);
                  var0.method65("Submit", var149, 5 + var166, 16777215, 0);
                  var149 = 1429288549 * classRS.field5838 + 80;
                  classYZ.method13810(classKA.field3514, var149 - 73, var166 - 20);
                  var0.method65(classKK.field3854, var149, 5 + var166, 16777215, 0);
               } else {
                  int var55 = 216;
                  var0.method65(classKK.field3892, field394 * -511275367 + 180, var55, 16776960, 0);
                  var55 += 15;
                  var2.method65(classKK.field3893, field394 * -511275367 + 180, var55, 16776960, 0);
                  var55 += 15;
                  var2.method65(classKK.field3633, 180 + -511275367 * field394, var55, 16776960, 0);
                  var55 += 15;
                  int var111 = 180 + field394 * -511275367 - 80;
                  short var147 = 321;
                  classYZ.method13810(classKA.field3514, var111 - 73, var147 - 20);
                  var0.method65(classKK.field3895, var111, var147 + 5, 16777215, 0);
                  var111 = 180 + -511275367 * field394 + 80;
                  classYZ.method13810(classKA.field3514, var111 - 73, var147 - 20);
                  var0.method65(classKK.field3865, var111, 5 + var147, 16777215, 0);
               }
            } else if (8 == -47366135 * field384) {
               int var63 = 216;
               var0.method65(classKK.field3613, 180 + field394 * -511275367, var63, 16776960, 0);
               var63 += 15;
               var2.method65(classKK.field3749, 180 + -511275367 * field394, var63, 16776960, 0);
               var63 += 15;
               var2.method65(classKK.field3750, 180 + -511275367 * field394, var63, 16776960, 0);
               var63 += 15;
               int var114 = -511275367 * field394 + 180 - 80;
               short var151 = 321;
               classYZ.method13810(classKA.field3514, var114 - 73, var151 - 20);
               var0.method65(classKK.field3751, var114, var151 + 5, 16777215, 0);
               var114 = 80 + -511275367 * field394 + 180;
               classYZ.method13810(classKA.field3514, var114 - 73, var151 - 20);
               var0.method65(classKK.field3865, var114, 5 + var151, 16777215, 0);
            } else if (9 == -47366135 * field384) {
               int var67 = 221;
               var0.method65(field397, 180 + -511275367 * field394, var67, 16776960, 0);
               var67 += 25;
               var0.method65(field398, 180 + -511275367 * field394, var67, 16776960, 0);
               var67 += 25;
               var0.method65(field399, 180 + -511275367 * field394, var67, 16776960, 0);
               int var116 = field394 * -511275367 + 180;
               short var152 = 311;
               classYZ.method13810(classKA.field3514, var116 - 73, var152 - 20);
               var0.method65(classKK.field3860, var116, var152 + 5, 16777215, 0);
            } else if (10 == -47366135 * field384) {
               int var70 = 180 + -511275367 * field394;
               int var117 = 209;
               var0.method65(classKK.field3878, field394 * -511275367 + 180, var117, 16776960, 0);
               var117 += 20;
               classYZ.method13810(classGQ.field2655, var70 - 109, var117);
               if (field412.isEmpty()) {
                  classYZ.method13810(classQH.field5544, var70 - 48, 18 + var117);
               } else {
                  classYZ.method13810(classQH.field5544, var70 - 48, var117 + 5);
                  var0.method65(field412, var70, 68 + var117 - 15, 16776960, 0);
               }
            } else if (-47366135 * field384 == 12) {
               int var71 = 1429288549 * classRS.field5838;
               int var119 = 216;
               var2.method65(classKK.field3899, var71, var119, 16777215, 0);
               var119 += 17;
               var2.method65(classKK.field3900, var71, var119, 16777215, 0);
               var119 += 17;
               var2.method65(classKK.field3901, var71, var119, 16777215, 0);
               var119 += 17;
               var2.method65(classKK.field3902, var71, var119, 16777215, 0);
               var71 = 1429288549 * classRS.field5838 - 80;
               short var123 = 311;
               classYZ.method13810(classKA.field3514, var71 - 73, var123 - 20);
               var0.method65(classKK.field3910, var71, var123 + 5, 16777215, 0);
               var71 = classRS.field5838 * 1429288549 + 80;
               classYZ.method13810(classKA.field3514, var71 - 73, var123 - 20);
               var0.method65(classKK.field3911, var71, 5 + var123, 16777215, 0);
            } else if (13 == field384 * -47366135) {
               int var74 = 231;
               var2.method65(classKK.field3903, 180 + -511275367 * field394, var74, 16777215, 0);
               var74 += 20;
               var2.method65(classKK.field3904, -511275367 * field394 + 180, var74, 16777215, 0);
               int var124 = 180 + -511275367 * field394;
               short var76 = 311;
               classYZ.method13810(classKA.field3514, var124 - 73, var76 - 20);
               var0.method65(classKK.field3865, var124, var76 + 5, 16777215, 0);
            } else if (14 == field384 * -47366135) {
               int var77 = 201;
               String var125 = "";
               String var153 = "";
               String var167 = "";
               switch (-20437633 * field387) {
                  case 0:
                     var125 = classKK.field3907;
                     var153 = classKK.field3662;
                     var167 = classKK.field3663;
                     break;
                  case 1:
                     var125 = classKK.field3700;
                     var153 = classKK.field3701;
                     var167 = classKK.field3702;
                     break;
                  case 2:
                     var125 = classKK.field3784;
                     var153 = classKK.field3897;
                     var167 = classKK.field3622;
                     break;
                  default:
                     classBJ.method1117(false, -347989319);
               }

               var0.method65(var125, field394 * -511275367 + 180, var77, 16776960, 0);
               var77 += 20;
               var0.method65(var153, 180 + field394 * -511275367, var77, 16776960, 0);
               var77 += 20;
               var0.method65(var167, 180 + field394 * -511275367, var77, 16776960, 0);
               int var177 = 180 + field394 * -511275367;
               short var181 = 276;
               classYZ.method13810(classKA.field3514, var177 - 73, var181 - 20);
               if (1 == -20437633 * field387) {
                  var0.method65(classKK.field3645, var177, var181 + 5, 16777215, 0);
               } else {
                  var0.method65(classKK.field3710, var177, 5 + var181, 16777215, 0);
               }

               var177 = -511275367 * field394 + 180;
               var181 = 326;
               classYZ.method13810(classKA.field3514, var177 - 73, var181 - 20);
               var0.method65(classKK.field3865, var177, 5 + var181, 16777215, 0);
            } else if (24 == -47366135 * field384) {
               int var80 = 221;
               var0.method65(field397, -511275367 * field394 + 180, var80, 16777215, 0);
               var80 += 15;
               var0.method65(field398, field394 * -511275367 + 180, var80, 16777215, 0);
               var80 += 15;
               var0.method65(field399, -511275367 * field394 + 180, var80, 16777215, 0);
               var80 += 15;
               int var126 = -511275367 * field394 + 180;
               short var154 = 301;
               classYZ.method13810(classKA.field3514, var126 - 73, var154 - 20);
               var0.method65(classKK.field3795, var126, 5 + var154, 16777215, 0);
            } else if (32 == field384 * -47366135) {
               int var84 = 216;
               var0.method65(classKK.field3892, field394 * -511275367 + 180, var84, 16776960, 0);
               var84 += 15;
               var2.method65(classKK.field3893, field394 * -511275367 + 180, var84, 16776960, 0);
               var84 += 15;
               var2.method65(classKK.field3633, 180 + field394 * -511275367, var84, 16776960, 0);
               var84 += 15;
               int var127 = 180 + field394 * -511275367 - 80;
               short var155 = 321;
               classYZ.method13810(classKA.field3514, var127 - 73, var155 - 20);
               var0.method65(classKK.field3895, var127, 5 + var155, 16777215, 0);
               var127 = -511275367 * field394 + 180 + 80;
               classYZ.method13810(classKA.field3514, var127 - 73, var155 - 20);
               var0.method65(classKK.field3865, var127, 5 + var155, 16777215, 0);
            } else if (33 == -47366135 * field384) {
               int var88 = 201;
               var0.method65(field397, -511275367 * field394 + 180, var88, 16776960, 0);
               var88 += 20;
               var1.method65(field398, 180 + -511275367 * field394, var88, 16776960, 0);
               var88 += 20;
               var1.method65(field399, -511275367 * field394 + 180, var88, 16776960, 0);
               var88 += 15;
               int var129 = field394 * -511275367 + 180;
               short var156 = 276;
               classYZ.method13810(classKA.field3514, var129 - 73, var156 - 20);
               var2.method65(classKK.field3736, var129, var156 + 5, 16777215, 0);
               var129 = field394 * -511275367 + 180;
               var156 = 326;
               classYZ.method13810(classKA.field3514, var129 - 73, var156 - 20);
               var2.method65(classKK.field3865, var129, 5 + var156, 16777215, 0);
            } else if (field384 * -47366135 == 34) {
               int var92 = 201;
               var0.method65(field397, 180 + field394 * -511275367, var92, 16776960, 0);
               var92 += 20;
               var1.method65(field398, 180 + field394 * -511275367, var92, 16776960, 0);
               var92 += 20;
               var1.method65(field399, field394 * -511275367 + 180, var92, 16776960, 0);
               int var131 = 180 + field394 * -511275367;
               short var158 = 276;
               classYZ.method13810(classKA.field3514, var131 - 73, var158 - 20);
               String var168 = classIS.field3054 != null ? classKK.field3921 : classKK.field3786;
               var2.method65(var168, var131, var158 + 5, 16777215, 0);
               var131 = -511275367 * field394 + 180;
               var158 = 326;
               classYZ.method13810(classKA.field3514, var131 - 73, var158 - 20);
               var2.method65(classKK.field3865, var131, var158 + 5, 16777215, 0);
            } else if (38 == field384 * -47366135) {
               int var95 = classRS.field5838 * 1429288549;
               int var133 = 216;
               var0.method65(classKK.field3759, var95, var133, 16776960, 0);
               var133 += 25;
               var1.method65(classKK.field3656, var95, var133, 16777215, 0);
               var133 += 20;
               var1.method65(classKK.field3877, var95, var133, 16777215, 0);
               var133 += 20;
               var1.method65(classKK.field3908, var95, var133, 16765440, 0);
               var95 = 1429288549 * classRS.field5838 - 80;
               short var137 = 321;
               classYZ.method13810(classKA.field3514, var95 - 73, var137 - 20);
               var0.method65(classKK.field3736, var95, 5 + var137, 16777215, 0);
               var95 = 80 + 1429288549 * classRS.field5838;
               classYZ.method13810(classKA.field3514, var95 - 73, var137 - 20);
               var0.method65(classKK.field3709, var95, 5 + var137, 16777215, 0);
            }
         }

         if (-44590225 * client.field828 >= 10) {
            int[] var98 = new int[4];
            classYW.method13675(var98);
            classYW.method13671(field385 * -329898575, 0, -329898575 * field385 + 765, 8379747 * classEU.field1938);
            classML.field4531.method2619(field385 * -329898575 - 22, client.field855 * 1612595797, 1698595949);
            classML.field4531.method2619(765 + -329898575 * field385 + 22 - 128, client.field855 * 1612595797, 1698595949);
            classYW.method13679(var98);
         }

         classYZ.method13810(classCG.field733[classAB.field122.method2732((byte)29) ? 1 : 0], 765 + -329898575 * field385 - 40, 463);
         if (-44590225 * client.field828 > 5 && classLU.field4232 == classXO.field6892) {
            if (classFJ.field2294 != null) {
               int var99 = -329898575 * field385 + 5;
               short var138 = 463;
               byte var160 = 100;
               byte var169 = 35;
               classYZ.method13810(classFJ.field2294, var99, var138);
               var0.method65(classKK.field3790 + " " + client.field827 * 1311484143, var99 + var160 / 2, var138 + var169 / 2 - 2, 16777215, 0);
               if (null != classIS.field3054) {
                  var1.method65(classKK.field3921, var99 + var160 / 2, 12 + var169 / 2 + var138, 16777215, 0);
               } else {
                  var1.method65(classKK.field3817, var99 + var160 / 2, var138 + var169 / 2 + 12, 16777215, 0);
               }
            } else {
               classFJ.field2294 = classSU.method10680(classHC.field2767, "sl_button", "", -1260709029);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[Ltn;")
   @ObfuscatedName("ag")
   public static classTN[] method995(byte var0) {
      try {
         return new classTN[]{classTN.field6171, classTN.field6172, classTN.field6173};
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "bf.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIB)Ljava/lang/String;")
   @ObfuscatedName("af")
   public static String method996(byte[] var0, int var1, int var2, byte var3) {
      try {
         char[] var4 = new char[var2];
         int var5 = 0;
         int var6 = var1;
         int var7 = var2 + var1;

         while (var6 < var7) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            int var8 = var0[var6++] & 255;
            int var9;
            if (var8 < 128) {
               if (0 == var8) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var9 = 65533;
               } else {
                  var9 = var8;
               }
            } else if (var8 < 192) {
               var9 = 65533;
            } else {
               label140:
               if (var8 < 224) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  if (var6 < var7) {
                     if (var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     if (128 == (var0[var6] & 192)) {
                        if (var3 >= 1) {
                           throw new IllegalStateException();
                        }

                        var9 = (var8 & 31) << 6 | var0[var6++] & 63;
                        if (var9 < 128) {
                           var9 = 65533;
                        }
                        break label140;
                     }
                  }

                  var9 = 65533;
               } else {
                  label139:
                  if (var8 < 240) {
                     if (var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     if (var6 + 1 < var7) {
                        if (var3 >= 1) {
                           throw new IllegalStateException();
                        }

                        if (128 == (var0[var6] & 192)) {
                           if (var3 >= 1) {
                              throw new IllegalStateException();
                           }

                           if (128 == (var0[1 + var6] & 192)) {
                              if (var3 >= 1) {
                                 throw new IllegalStateException();
                              }

                              var9 = (var8 & 15) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
                              if (var9 < 2048) {
                                 if (var3 >= 1) {
                                    throw new IllegalStateException();
                                 }

                                 var9 = 65533;
                              }
                              break label139;
                           }
                        }
                     }

                     var9 = 65533;
                  } else {
                     label138:
                     if (var8 < 248) {
                        if (var3 >= 1) {
                           throw new IllegalStateException();
                        }

                        if (2 + var6 < var7 && 128 == (var0[var6] & 192) && 128 == (var0[var6 + 1] & 192)) {
                           if (var3 >= 1) {
                              throw new IllegalStateException();
                           }

                           if (128 == (var0[var6 + 2] & 192)) {
                              var9 = (var8 & 7) << 18 | (var0[var6++] & 63) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
                              if (var9 >= 65536) {
                                 if (var3 >= 1) {
                                    throw new IllegalStateException();
                                 }

                                 if (var9 <= 1114111) {
                                    var9 = 65533;
                                    break label138;
                                 }

                                 if (var3 >= 1) {
                                    throw new IllegalStateException();
                                 }
                              }

                              var9 = 65533;
                              break label138;
                           }
                        }

                        var9 = 65533;
                     } else {
                        var9 = 65533;
                     }
                  }
               }
            }

            var4[var5++] = (char)var9;
         }

         return new String(var4, 0, var5);
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "bf.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFI)F")
   @ObfuscatedName("ay")
   public static float method998(float var0, float var1, float var2, int var3) {
      try {
         if (var1 < var0) {
            if (var3 == 1877849950) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
            }
         } else {
            return Math.max(var0, Math.min(var2, var1));
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "bf.ay(" + ')');
      }
   }
}
