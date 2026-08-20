import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jf")
public class classJF {
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   public static final int field3147 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field3146 = 20;
   @ToRemove(unused = "true")
   @ObfuscatedName("cw")
   public static final int field3148 = 1;

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ew")
   static final boolean method6365(int var0, int var1) {
      try {
         if (var0 >= 2000) {
            var0 -= 2000;
         }

         return var0 == 1007;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "jf.ew(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;)V")
   @ObfuscatedName("je")
   public static void method6362(Scene var0) {
      if (var0 == null) {
         var0.method4331();
      } else {
         var0.field2036 = -1;
         var0.field2033 = false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)I")
   @ObfuscatedName("ag")
   public static int method6360(CharSequence var0, int var1) {
      try {
         return classOH.method8449(var0, 10, true, -791528727);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "jf.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("ae")
   static int method6359(int var0, int var1, int var2) {
      try {
         ItemContainer var3 = (ItemContainer)ItemContainer.field454.method13363(var0);
         if (var3 == null) {
            if (var2 != 397563969) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else if (-1 == var1) {
            if (var2 != 397563969) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            int var4 = 0;

            for (int var5 = 0; var5 < var3.ids.length; var5++) {
               if (var2 != 397563969) {
                  throw new IllegalStateException();
               }

               if (var1 == var3.quantities[var5]) {
                  if (var2 != 397563969) {
                     throw new IllegalStateException();
                  }

                  var4 += var3.ids[var5];
               }
            }

            return var4;
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "jf.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;Lva;Laam;ZII)V")
   @ObfuscatedName("ae")
   static void method6361(AbstractArchive var0, AbstractArchive var1, classAAM var2, boolean var3, int var4, int var5) {
      client.method2182(var0, var1, var2, var3, var4);

      try {
         if (classPA.field5209) {
            if (var5 != 1600397897) {
               throw new IllegalStateException();
            } else {
               if (var4 == 4) {
                  if (var5 != 1600397897) {
                     throw new IllegalStateException();
                  }

                  classAC.method326(4, 2004407080);
               }

               client.method2351(var0, var1, var2, var3, var4);
            }
         } else {
            if (0 == var4) {
               if (var5 != 1600397897) {
                  throw new IllegalStateException();
               }

               classIV.method6320(var3, (byte)-14);
            } else {
               classAC.method326(var4, 2025031763);
            }

            classYW.method13683();
            byte[] var6 = var0.method11854("title.jpg", "", 1857645463);
            classNI.field4673 = classIT.method6314(var6, 1951476339);
            classFR.field2391 = classNI.field4673.method13470();
            int var7 = -2024190683 * client.field883;
            if ((var7 & classXE.field6840.vmethod8((byte)1)) != 0) {
               AABB.field2372 = classSU.method10680(var1, "logo_deadman_mode", "", 418903120);
            } else if ((var7 & classXE.field6851.vmethod8((byte)1)) != 0) {
               if (var5 != 1600397897) {
                  throw new IllegalStateException();
               }

               AABB.field2372 = classSU.method10680(var1, "logo_seasonal_mode", "", -595284173);
            } else if ((var7 & classXE.field6836.vmethod8((byte)1)) != 0) {
               AABB.field2372 = classSU.method10680(var1, "logo_speedrunning", "", 703015556);
            } else if ((var7 & classXE.field6839.vmethod8((byte)1)) != 0) {
               if (var5 != 1600397897) {
                  throw new IllegalStateException();
               }

               AABB.field2372 = classSU.method10680(var1, "logo_ugc_world", "", -953181053);
            } else {
               AABB.field2372 = classSU.method10680(var1, "logo", "", -1898186027);
            }

            classJB.field3120 = classSU.method10680(var1, "titlebox", "", -85570335);
            classKA.field3514 = classSU.method10680(var1, "titlebutton", "", -1270442887);
            classGQ.field2655 = classSU.method10680(var1, "titlebutton_large", "", -808038067);
            classQH.field5544 = classSU.method10680(var1, "play_now_text", "", -762440429);
            classSU.method10680(var1, "titlebutton_wide42,1", "", 348991205);
            classBM.field514 = classOT.method8732(var1, "runes", "", (byte)97);
            Message.field733 = classOT.method8732(var1, "title_mute", "", (byte)125);
            classCK.field778 = classSU.method10680(var1, "options_radio_buttons,0", "", -576001427);
            classHC.field2768 = classSU.method10680(var1, "options_radio_buttons,4", "", -381897963);
            classEK.field1779 = classSU.method10680(var1, "options_radio_buttons,2", "", -866264116);
            classQN.field5573 = classSU.method10680(var1, "options_radio_buttons,6", "", -1851553502);
            classXR.field6925 = classCK.field778.field7121 * -1666056959;
            classKP.field3985 = -682922689 * classCK.field778.field7119;
            classML.field4531 = new classCS(classBM.field514, var2.field62);
            if (var3) {
               if (var5 != 1600397897) {
                  throw new IllegalStateException();
               }

               classBF.field389 = "";
               client.method2363(-1);
               classBF.field390 = "";
               classBF.field407 = new String[8];
               classBF.field391 = 0;
            }

            classEV.field1944 = 0;
            classQP.field5586 = "";
            classBF.field393 = true;
            classBF.field413 = false;
            classUR.method11526((byte)0);
            Actor.method3122(-1612757241);
            classWU.method12629((byte)106).method11887(false, 116730183);
            classPA.field5209 = true;
            client.method2310(-1);
            classBF.field385 = 358417233 * ((classSA.field5897 * 773246731 - 765) / 2);
            classBF.field394 = 1927755610 + 2007709401 * classBF.field385;
            Ignored.field5838 = 273549476 + -1415132635 * classBF.field394;
            classNI.field4673.method13508(classBF.field385 * -329898575, 0);
            classFR.field2391.method13508(382 + -329898575 * classBF.field385, 0);
            IndexedSprite.method13810(AABB.field2372, -329898575 * classBF.field385 + 382 - AABB.field2372.field7121 / 2, 18);
            client.method2351(var0, var1, var2, var3, var4);
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "jf.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILbl;ZB)I")
   @ObfuscatedName("bi")
   static int method6364(int var0, Script var1, boolean var2, byte var3) {
      try {
         if (var0 == 4100) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               String var42 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               int var54 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var42 + var54;
               return 1;
            }
         } else if (var0 == 4101) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= -1849233978;
               String var41 = (String)classBB.field328[classBB.field338 * 1375698635];
               String var53 = (String)classBB.field328[1 + classBB.field338 * 1375698635];
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var41 + var53;
               return 1;
            }
         } else if (var0 == 4102) {
            String var40 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
            int var52 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var40 + classOJ.method8507(var52, true, (byte)-61);
            return 1;
         } else if (var0 == 4103) {
            String var39 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
            classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var39.toLowerCase();
            return 1;
         } else if (4104 == var0) {
            int var38 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            long var51 = 86400000L * (var38 + 11745L);
            classBB.field329.setTime(new Date(var51));
            int var65 = classBB.field329.get(5);
            int var69 = classBB.field329.get(2);
            int var71 = classBB.field329.get(1);
            classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var65 + "-" + classBB.field320[var69] + "-" + var71;
            return 1;
         } else if (4106 == var0) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               int var37 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = Integer.toString(var37);
               return 1;
            }
         } else if (4107 == var0) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= -1849233978;
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classCH.method1500(
                  Actor.method3081(
                     (String)classBB.field328[1375698635 * classBB.field338],
                     (String)classBB.field328[classBB.field338 * 1375698635 + 1],
                     classLU.field4232,
                     64832479
                  ),
                  -1000625009
               );
               return 1;
            }
         } else if (4108 == var0) {
            String var35 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
            DynamicObject.field1679 -= 240082458;
            int var50 = classBB.field323[-324749371 * DynamicObject.field1679];
            int var60 = classBB.field323[-324749371 * DynamicObject.field1679 + 1];
            byte[] var64 = classYO.field7023.method11867(var60, 0, -848893336);
            Font var68 = new Font(var64);
            var35 = classUP.method11420(var35, User.method10179(14584714), classBB.field334, classBB.field333, (byte)0);
            classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var68.method43(var35, var50);
            return 1;
         } else if (var0 == 4109) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               String var33 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               DynamicObject.field1679 -= 240082458;
               int var49 = classBB.field323[-324749371 * DynamicObject.field1679];
               int var59 = classBB.field323[1 + DynamicObject.field1679 * -324749371];
               byte[] var63 = classYO.field7023.method11867(var59, 0, -2024763478);
               Font var67 = new Font(var63);
               var33 = classUP.method11420(var33, User.method10179(-1534687957), classBB.field334, classBB.field333, (byte)0);
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var67.method41(var33, var49);
               return 1;
            }
         } else if (4110 == var0) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= -1849233978;
               String var32 = (String)classBB.field328[classBB.field338 * 1375698635];
               String var48 = (String)classBB.field328[classBB.field338 * 1375698635 + 1];
               if (classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var32;
               } else {
                  classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var48;
               }

               return 1;
            }
         } else if (4111 == var0) {
            String var31 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
            classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = AbstractFont.method8(var31);
            return 1;
         } else if (4112 == var0) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               String var30 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               int var47 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var30 + (char)var47;
               return 1;
            }
         } else if (4113 == var0) {
            int var29 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            int[] var74 = classBB.field323;
            int var75 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
            byte var76;
            if (classCJ.method1573((char)var29, -1724108930)) {
               if (var3 != 4) {
                  throw new IllegalStateException();
               }

               var76 = 1;
            } else {
               var76 = 0;
            }

            var74[var75] = var76;
            return 1;
         } else if (var0 == 4114) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               int var28 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               int[] var73 = classBB.field323;
               int var10001 = (DynamicObject.field1679 += 120041229) * -324749371 - 1;
               byte var10002;
               if (classSN.method10532((char)var28, 501045962)) {
                  if (var3 != 4) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var73[var10001] = var10002;
               return 1;
            }
         } else if (var0 == 4115) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               int var27 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classTT.method11165((char)var27, -2118205091) ? 1 : 0;
               return 1;
            }
         } else if (4116 == var0) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               int var26 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classEB.method3802((char)var26, (byte)47) ? 1 : 0;
               return 1;
            }
         } else if (var0 == 4117) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               String var25 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               if (null != var25) {
                  if (var3 != 4) {
                     throw new IllegalStateException();
                  }

                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var25.length();
               } else {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               }

               return 1;
            }
         } else if (4118 == var0) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               String var24 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               DynamicObject.field1679 -= 240082458;
               int var46 = classBB.field323[DynamicObject.field1679 * -324749371];
               int var58 = classBB.field323[1 + DynamicObject.field1679 * -324749371];
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var24.substring(var46, var58);
               return 1;
            }
         } else if (4119 == var0) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               String var22 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               var22 = classUP.method11420(var22, User.method10179(-1474623602), classBB.field334, classBB.field333, (byte)0);
               StringBuilder var45 = new StringBuilder(var22.length());
               boolean var57 = false;

               for (int var62 = 0; var62 < var22.length(); var62++) {
                  if (var3 != 4) {
                     throw new IllegalStateException();
                  }

                  char var66 = var22.charAt(var62);
                  if (var66 == '<') {
                     var57 = true;
                  } else if ('>' == var66) {
                     var57 = false;
                  } else if ('@' == var66) {
                     int var70 = var22.indexOf(64, 1 + var62);
                     if (var70 != -1) {
                        if (var3 != 4) {
                           throw new IllegalStateException();
                        }

                        var62 = var70;
                     }
                  } else if (!var57) {
                     var45.append(var66);
                  }
               }

               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var45.toString();
               return 1;
            }
         } else if (4120 == var0) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               String var21 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               int var44 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var21.indexOf(var44);
               return 1;
            }
         } else if (4121 == var0) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= -1849233978;
               String var20 = (String)classBB.field328[classBB.field338 * 1375698635];
               String var43 = (String)classBB.field328[classBB.field338 * 1375698635 + 1];
               int var56 = classBB.field323[(DynamicObject.field1679 -= 120041229) * -324749371];
               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var20.indexOf(var43, var56);
               return 1;
            }
         } else if (var0 == 4122) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               String var19 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var19.toUpperCase();
               return 1;
            }
         } else if (var0 == 4123) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               classBB.field338 -= -626367319;
               String var18 = (String)classBB.field328[1375698635 * classBB.field338];
               String var5 = (String)classBB.field328[1375698635 * classBB.field338 + 1];
               String var55 = (String)classBB.field328[2 + 1375698635 * classBB.field338];
               Player var61 = classMB.method7521(518324687);
               if (null != var61) {
                  if (var3 != 4) {
                     throw new IllegalStateException();
                  }

                  if (var61.field1285 != null) {
                     switch (var61.field1285.field4093 * -513083879) {
                        case 0:
                           classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var18;
                           break;
                        case 1:
                           classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var5;
                           break;
                        case 2:
                        default:
                           classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var55;
                     }

                     return 1;
                  }

                  if (var3 != 4) {
                     throw new IllegalStateException();
                  }
               }

               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var55;
               return 1;
            }
         } else if (4124 == var0) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               Player var17 = classMB.method7521(1857940561);
               if (var17 != null) {
                  if (var3 != 4) {
                     throw new IllegalStateException();
                  }

                  if (var17.field1285 != null) {
                     if (var3 != 4) {
                        throw new IllegalStateException();
                     }

                     classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var17.field1285.field4093 * -513083879;
                     return 1;
                  }
               }

               classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
               return 1;
            }
         } else if (var0 == 4125) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               long var16 = classBB.field322[(classXT.field6939 -= -1297854163) * 18294437];
               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = Long.toString(var16);
               return 1;
            }
         } else if (4126 == var0) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               long var15 = classBB.field322[(classXT.field6939 -= -1297854163) * 18294437];
               String var6 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
               String var7;
               if (var15 == 0L) {
                  if (var3 != 4) {
                     throw new IllegalStateException();
                  }

                  var7 = "0";
               } else if (!var6.isEmpty()) {
                  if (var3 != 4) {
                     throw new IllegalStateException();
                  }

                  boolean var10000;
                  if (var15 < 0L) {
                     if (var3 != 4) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var8 = var10000;
                  long var72;
                  if (var8) {
                     if (var3 != 4) {
                        throw new IllegalStateException();
                     }

                     var72 = -var15;
                  } else {
                     var72 = var15;
                  }

                  long var9 = var72;
                  StringBuilder var11 = new StringBuilder();

                  for (int var12 = 1; var9 > 0L; var12++) {
                     var11.insert(0, var9 % 10L);
                     var9 /= 10L;
                     if (var9 > 0L) {
                        if (var3 != 4) {
                           throw new IllegalStateException();
                        }

                        if (0 == var12 % 3) {
                           if (var3 != 4) {
                              throw new IllegalStateException();
                           }

                           var11.insert(0, ",");
                        }
                     }
                  }

                  if (var8) {
                     var11.insert(0, '-');
                  }

                  var7 = var11.toString();
               } else {
                  var7 = Long.toString(var15);
               }

               classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = var7;
               return 1;
            }
         } else if (var0 == 4127) {
            if (var3 != 4) {
               throw new IllegalStateException();
            } else {
               String var4 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];

               try {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = Integer.parseInt(var4);
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
               } catch (NumberFormatException var13) {
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
                  classBB.field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               }

               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "jf.bi(" + 41);
      }
   }

   classJF() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)V")
   @ObfuscatedName("dc")
   static final void method6363(PacketBuffer var0, int var1) {
      client.method2263(var0);

      try {
         int var2 = classXY.method13197(var0, 1090260691);
         int var3 = classXY.method13194(var0, 2046667400);
         boolean var10000;
         if (var0.method13159((byte)-5) == 1) {
            if (var1 == -1578398787) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var4 = var10000;
         classXK.method12824(client.field1041, var0, -1514985092);
         classKK.method6491(client.field1041, var3, var2, var4, (byte)0);
         client.method2246(var0);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "jf.dc(" + ')');
      }
   }
}
