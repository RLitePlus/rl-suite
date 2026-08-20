import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ce")
public class classCE {
   @ObfuscatedName("au")
   static int[] field693 = new int[-1479123829 * classCE.field691];
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field707 = 5;
   @ObfuscatedSignature(descriptor = "[Lym;")
   @ObfuscatedName("ao")
   static SpritePixels[] field714;
   @ObfuscatedName("aj")
   static int field691 = 801926358;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field708 = 14;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field711 = 15;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field705 = 4;
   @ObfuscatedName("ay")
   static int[] field692 = new int[field691 * -1479123829];
   @ObfuscatedName("al")
   static int field689 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field701 = -2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field706 = 2;
   @ObfuscatedName("aq")
   static int[] field703 = new int[field691 * -1479123829];
   @ObfuscatedName("ad")
   static int[] field694 = new int[-1479123829 * field691];
   @ObfuscatedSignature(descriptor = "[Lym;")
   @ObfuscatedName("aa")
   static SpritePixels[] field713;
   @ObfuscatedName("aw")
   static int[] field696 = new int[-1479123829 * field691];
   @ObfuscatedName("ai")
   static int[] field697 = new int[field691 * -1479123829];
   @ObfuscatedName("ar")
   static int[][] field698 = new int[field691 * -1479123829][];
   @ObfuscatedName("ap")
   static int[] field695 = new int[field691 * -1479123829];
   @ObfuscatedName("ak")
   static String[] field699 = new String[field691 * -1479123829];
   @ObfuscatedName("av")
   static int[] field704 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
   @ObfuscatedSignature(descriptor = "Lrj;")
   @ObfuscatedName("at")
   static classRJ field702 = new classRJ(8, classRB.field5635);
   @ObfuscatedName("an")
   static int field690 = -562042963;
   @ObfuscatedName("am")
   static int field700 = -854419263;
   @ToRemove(unused = "true")
   @ObfuscatedName("ba")
   static final int field712 = 53;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field710 = 9;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   static final int field709 = 78;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bx")
   static void method1459(int var0, int var1, int var2) {
      short var3 = 128;
      int var4 = 281366889;
      int var5 = classKY.method6605(classIS.field3053.field1696 * -77855207 - 2, 558170130);
      int var6 = classKY.method6605(classIS.field3053.field1692 * -1269171107 - 2, -39475170);
      if (var0 >= var3 && var5 >= var0 && var1 >= var4 && var6 >= var1) {
         var0 -= 1727697576 * classKI.field3598;
         var2 -= classNL.field4684 * 1615527037;
         var1 -= classAI.field167 * 1343311673;
         int var7 = client.field914.method11443(531035634);
         int var8 = classUP.method11445(client.field914, (byte)115);
         int var9 = client.field796.method11443(1958436694);
         int var10 = classUP.method11445(client.field796, (byte)-59);
         int var11 = var9 * var1 + var0 * var10 >> 16;
         var1 = var10 * var1 - var0 * var9 >> 16;
         var11 = var8 * var2 - var7 * var1 >> 16;
         var1 = var8 * var1 + var7 * var2 >> 16;
         if (var1 >= -2003575562) {
            field690 = 359398362 * (client.field878 * 631186636 * var11 / var1 + client.field990 * 27064125 / 2);
            field700 = 1754485594 * (1158148203 * client.field982 / 2 + client.field878 * 202841416 * var11 / var1);
         } else {
            field690 = 1356138369;
            field700 = -854419263;
         }
      } else {
         field690 = -851754456;
         field700 = -854419263;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Lym;)V")
   @ObfuscatedName("ao")
   static void method1440(SpritePixels[] var0) {
      field713 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Lym;)V")
   @ObfuscatedName("al")
   static void method1441(SpritePixels[] var0) {
      field713 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aj")
   static boolean method1442() {
      return null != classUO.field6361;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lct;I)Lop;")
   @ObfuscatedName("ev")
   public static ItemComposition method1454(Player var0, int var1) {
      if (var0 == null) {
         var0.method2647();
      }

      return classOB.method8299(var1 - 2048, (byte)-30);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;IIIII)V")
   @ObfuscatedName("au")
   static void method1446(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
      field689 = 0;
      classES.method4075(var0, var1, var2, var3, var4, var5, -628406163);

      for (int var6 = 0; var6 < classZH.method14003(var0.field1693, (byte)10); var6++) {
         WorldEntity var7 = (WorldEntity)var0.worldEntities.method13595(var0.field1693.method14001(var6, 1589842176));
         if (null != var7) {
            classES.method4075(var7.field6012, var1, var2, var3, var4, var5, 1052381569);
         }
      }

      boolean var22 = client.field851;
      if (var22) {
         int var23 = client.field845 * -2130951373;
         if (var23 >= 0) {
            WorldView var8 = classQB.method9434(var23, client.field814, 490948431);
            Player var9 = var8.method3737(var23, (byte)1);
            if (null != var9) {
               int var10 = classDF.method3050(client.field837, var23, 1043668321);
               classAU.method715(var8, var9, var10, var1, var2, var3, var4, var5, (byte)121);
            }
         }
      }

      int var24 = client.field971 * 927693091;
      if (var24 >= 0) {
         WorldView var25 = classQB.method9434(var24, client.field814, -403269539);
         Player var27 = var25.method3737(var24, (byte)1);
         if (null != var27) {
            int var29 = classDF.method3050(client.field837, var24, 1043668321);
            classAU.method715(var25, var27, var29, var1, var2, var3, var4, var5, (byte)94);
         }
      }

      int var26 = -2114839507 * client.field984;
      Font var28 = classBB.field341;

      for (int var30 = 0; var30 < field689 * 1111851887; var30++) {
         int var11 = field692[var30];
         int var12 = field703[var30];
         int var13 = field695[var30];
         int var14 = field694[var30];
         boolean var15 = true;

         while (var15) {
            var15 = false;

            for (int var16 = 0; var16 < var30; var16++) {
               if (var12 + 2 > field703[var16] - field694[var16]
                  && var12 - var14 < 2 + field703[var16]
                  && var11 - var13 < field692[var16] + field695[var16]
                  && var11 + var13 > field692[var16] - field695[var16]
                  && field703[var16] - field694[var16] < var12) {
                  var12 = field703[var16] - field694[var16];
                  var15 = true;
               }
            }
         }

         field690 = field692[var30] * 562042963;
         field700 = (field703[var30] = var12) * 854419263;
         String var31 = field699[var30];
         if (0 == var26) {
            int var17 = 16776960;
            if (field693[var30] < 6) {
               var17 = field704[field693[var30]];
            }

            if (field693[var30] == 6) {
               var17 = var5 % 20 < 10 ? 16711680 : 16776960;
            }

            if (field693[var30] == 7) {
               var17 = var5 % 20 < 10 ? 255 : '\uffff';
            }

            if (field693[var30] == 8) {
               var17 = var5 % 20 < 10 ? '뀀' : 8454016;
            }

            if (field693[var30] == 9) {
               int var18 = 150 - field696[var30];
               if (var18 < 50) {
                  var17 = var18 * 1280 + 16711680;
               } else if (var18 < 100) {
                  var17 = 16776960 - (var18 - 50) * 327680;
               } else if (var18 < 150) {
                  var17 = 5 * (var18 - 100) + 65280;
               }
            }

            if (10 == field693[var30]) {
               int var32 = 150 - field696[var30];
               if (var32 < 50) {
                  var17 = 5 * var32 + 16711680;
               } else if (var32 < 100) {
                  var17 = 16711935 - (var32 - 50) * 327680;
               } else if (var32 < 150) {
                  var17 = 255 + 327680 * (var32 - 100) - (var32 - 100) * 5;
               }
            }

            if (11 == field693[var30]) {
               int var33 = 150 - field696[var30];
               if (var33 < 50) {
                  var17 = 16777215 - 327685 * var33;
               } else if (var33 < 100) {
                  var17 = 65280 + 327685 * (var33 - 50);
               } else if (var33 < 150) {
                  var17 = 16777215 - (var33 - 100) * 327680;
               }
            }

            if (12 == field693[var30] && null == field698[var30]) {
               int var34 = var31.length();
               field698[var30] = new int[var34];

               for (int var19 = 0; var19 < var34; var19++) {
                  int var20 = (int)(64.0F * ((float)var19 / var34));
                  int var21 = var20 << 10 | 896 | 64;
                  field698[var30][var19] = classGK.field2617[var21];
               }
            }

            if (field697[var30] == 0) {
               var28.method88(var31, field690 * 1269689307 + var1, -690353985 * field700 + var2, var17, 0, field698[var30]);
            }

            if (field697[var30] == 1) {
               var28.method76(var31, var1 + 1269689307 * field690, var2 + field700 * -690353985, var17, 0, var5, field698[var30]);
            }

            if (2 == field697[var30]) {
               AbstractFont.method80(var28, var31, 1269689307 * field690 + var1, field700 * -690353985 + var2, var17, 0, var5, field698[var30]);
            }

            if (field697[var30] == 3) {
               var28.method85(var31, 1269689307 * field690 + var1, var2 + -690353985 * field700, var17, 0, var5, 150 - field696[var30], field698[var30]);
            }

            if (4 == field697[var30]) {
               int var35 = (150 - field696[var30]) * (var28.method36(var31) + 100) / 150;
               classYW.method13674(var1 + field690 * 1269689307 - 50, var2, var1 + field690 * 1269689307 + 50, var4 + var2);
               var28.method92(var31, field690 * 1269689307 + var1 + 50 - var35, var2 + -690353985 * field700, var17, 0, field698[var30]);
               classYW.method13671(var1, var2, var1 + var3, var2 + var4);
            }

            if (field697[var30] == 5) {
               int var36 = 150 - field696[var30];
               int var37 = 0;
               if (var36 < 25) {
                  var37 = var36 - 25;
               } else if (var36 > 125) {
                  var37 = var36 - 125;
               }

               classYW.method13674(var1, var2 + field700 * -690353985 - var28.field8 - 1, var3 + var1, 5 + field700 * -690353985 + var2);
               var28.method88(var31, field690 * 1269689307 + var1, var2 + -690353985 * field700 + var37, var17, 0, field698[var30]);
               classYW.method13671(var1, var2, var1 + var3, var4 + var2);
            }
         } else {
            var28.method65(var31, var1 + 1269689307 * field690, -690353985 * field700 + var2, 16776960, 0);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aq")
   static boolean method1443() {
      return null != classUO.field6361;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Ldh;IIIIII)V")
   @ObfuscatedName("at")
   static void method1451(WorldView var0, Actor var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 != null && var1.vmethod262((byte)96)) {
         if (var1 instanceof NPC) {
            classPL var8 = ((NPC)var1).definition;
            if (var8.field5325 != null) {
               var8 = var8.method8955(652890385);
            }

            if (null == var8) {
               return;
            }
         }

         classDF var50 = client.field837;
         Font var9 = classBB.field341;
         Font var10 = classVP.field6550;
         int var11 = client.field870 * 2102667627;
         classKQ var12 = client.field941;
         int var13 = -2087374717 * client.field837.field1419;
         int[] var14 = var50.field1423;
         boolean var15 = var2 < var13;
         int var16 = -2;
         if (null != var1.overheadText
            && (
               !var15
                  || !var1.field1458 && (var11 == 4 || !var1.field1503 && (var11 == 0 || 3 == var11 || 1 == var11 && ((Player)var1).method2622(2103217451)))
            )) {
            GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006), 2054255495);
            if (1269689307 * field690 > -1 && field689 * 1111851887 < -1479123829 * field691) {
               field695[field689 * 1111851887] = var9.method36(var1.overheadText) / 2;
               field694[field689 * 1111851887] = var9.field8;
               field692[1111851887 * field689] = 1269689307 * field690;
               field703[field689 * 1111851887] = -690353985 * field700 - var16;
               field693[1111851887 * field689] = 414414391 * var1.field1460;
               field697[1111851887 * field689] = 1831374229 * var1.field1481;
               field696[1111851887 * field689] = 317527437 * var1.field1459;
               field698[field689 * 1111851887] = var1.field1438;
               field699[field689 * 1111851887] = var1.overheadText;
               field689 += 867122063;
               var16 += 12;
            }
         }

         WorldEntity var17 = classCL.method1601(client.field814, -1105444433 * var1.field1439, -673053785);
         if (null == var17 || !var17.method10558(1357832888)) {
            if (!var1.field1442.method8179()) {
               GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);

               for (classCO var18 = (classCO)var1.field1442.method8167(); var18 != null; var18 = (classCO)classAAX.method294(var1.field1442)) {
                  classCV var19 = var18.method2562(var7, -1309201769);
                  if (var19 != null) {
                     HealthBarDefinition var20 = var18.field1177;
                     SpritePixels var21 = var20.method9368((byte)45);
                     SpritePixels var22 = var20.method9365(-602404693);
                     int var24 = 0;
                     int var23;
                     if (var21 != null && null != var22) {
                        if (545947590 * var20.field5486 < var22.field7007) {
                           var24 = -1874509853 * var20.field5486;
                        }

                        var23 = var22.field7007 - 2 * var24;
                     } else {
                        var23 = var20.field5485 * -1485258143;
                     }

                     int var25 = 255;
                     int var26 = -1;
                     int var27 = var7 - 1576496181 * var19.field1300;
                     int var28 = var19.field1299 * -808970489 * var23 / (-1485258143 * var20.field5485);
                     if (-425086145 * var19.field1297 > var27) {
                        int var29 = var20.field5483 * -822457041 == 0 ? 0 : var27 / (var20.field5483 * -822457041) * var20.field5483 * -822457041;
                        int var30 = var23 * var19.field1298 * -545900307 / (-1485258143 * var20.field5485);
                        var26 = var30 + (var28 - var30) * var29 / (-425086145 * var19.field1297);
                     } else {
                        var26 = var28;
                        int var81 = var19.field1297 * -425086145 + -1486866911 * var20.field5480 - var27;
                        if (597861161 * var20.field5477 >= 0) {
                           var25 = (var81 << 8) / (var20.field5480 * -1486866911 - 597861161 * var20.field5477);
                        }
                     }

                     if (var19.field1299 * -808970489 > 0 && var26 < 1) {
                        var26 = 1;
                     }

                     if (null != var21 && var22 != null) {
                        if (var23 == var26) {
                           var26 += var24 * 2;
                        } else {
                           var26 += var24;
                        }

                        int var83 = var21.field7009;
                        var16 += var83;
                        int var86 = var3 + field690 * 1269689307 - (var23 >> 1);
                        int var31 = -690353985 * field700 + var4 - var16;
                        var86 -= var24;
                        if (var25 >= 0 && var25 < 255) {
                           SpritePixels.method13523(var21, var86, var31, var25);
                           classYW.method13674(var86, var31, var26 + var86, var31 + var83);
                           SpritePixels.method13523(var22, var86, var31, var25);
                        } else {
                           SpritePixels.method13511(var21, var86, var31);
                           classYW.method13674(var86, var31, var26 + var86, var31 + var83);
                           SpritePixels.method13511(var22, var86, var31);
                        }

                        classYW.method13671(var3, var4, var3 + var5, var4 + var6);
                        var16 += 2;
                     } else {
                        var16 += 5;
                        if (field690 * 1269689307 > -1) {
                           int var82 = field690 * 1269689307 + var3 - (var23 >> 1);
                           int var85 = field700 * -690353985 + var4 - var16;
                           classYW.method13698(var82, var85, var26, 5, 65280);
                           classYW.method13698(var26 + var82, var85, var23 - var26, 5, 16711680);
                        }

                        var16 += 2;
                     }
                  } else if (var18.method2566((byte)32)) {
                     var18.vmethod398();
                  }
               }
            }

            if (var16 == -2) {
               var16 += 7;
            }

            if (var15 && var7 == -741500243 * var1.field1490) {
               Player var59 = (Player)var1;
               boolean var55;
               if (0 == -1072700981 * client.field852) {
                  var55 = false;
               } else if (-1315528093 * var59.field1480 == client.field845 * -2130951373) {
                  var55 = classKC.method6459(-2092872672);
               } else {
                  boolean var62 = classDB.method2887((byte)-120);
                  if (!var62) {
                     boolean var66 = (client.field852 * -1072700981 & 1) != 0;
                     var62 = var66 && var59.method2622(-132959633);
                  }

                  var55 = var62 || classTW.method11210(-811881628) && Player.method2629(var59, 1234889536);
               }

               if (var55) {
                  Player var63 = (Player)var1;
                  if (var15) {
                     GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);
                     var16 += 4;
                     var10.method65(var63.field1283.method164(1412126807), 1269689307 * field690 + var3, field700 * -690353985 + var4 - var16, 16777215, 0);
                     var16 += 18;
                  }
               }
            }

            if (var15) {
               Player var56 = (Player)var1;
               if (var56.field1259) {
                  return;
               }

               if (-1 != var56.field1271 * 1605395471 || -325171935 * var56.field1266 != -1) {
                  GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);
                  if (field690 * 1269689307 > -1) {
                     if (1605395471 * var56.field1271 != -1) {
                        var16 += 25;
                        SpritePixels.method13511(
                           classUO.field6361[var56.field1271 * 1605395471], 1269689307 * field690 + var3 - 12, var4 + -690353985 * field700 - var16
                        );
                     }

                     if (-1 != var56.field1266 * -325171935) {
                        var16 += 25;
                        SpritePixels.method13511(
                           field713[-325171935 * var56.field1266], field690 * 1269689307 + var3 - 12, field700 * -690353985 + var4 - var16
                        );
                     }
                  }
               }

               if (var2 >= 0 && var12.method6529(-1108867402) == 3 && var12.method6533(-195497966) == var14[var2]) {
                  GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);
                  if (1269689307 * field690 > -1) {
                     var16 += field714[1].field7009;
                     SpritePixels.method13511(field714[1], var3 + 1269689307 * field690 - 12, -690353985 * field700 + var4 - var16);
                  }
               }
            } else {
               NPC var57 = (NPC)var1;
               int[] var60 = var57.method3460(-1062534839);
               short[] var64 = NPC.method3462(var57, 1914000105);
               if (null != var64 && null != var60) {
                  for (int var67 = 0; var67 < var64.length; var67++) {
                     if (var64[var67] >= 0 && var60[var67] >= 0) {
                        long var69 = (long)var60[var67] << 8 | var64[var67];
                        SpritePixels var72 = (SpritePixels)field702.method9981(var69, (byte)-81);
                        if (null == var72) {
                           SpritePixels[] var74 = classIR.method6307(classHC.field2767, var60[var67], 0, -1253680523);
                           if (null != var74 && var64[var67] < var74.length) {
                              var72 = var74[var64[var67]];
                              field702.method9982(var69, var72, (byte)1);
                           }
                        }

                        if (null != var72) {
                           GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);
                           if (1269689307 * field690 > -1) {
                              SpritePixels.method13511(
                                 var72,
                                 var3 + 1269689307 * field690 - (var72.field7007 >> 1),
                                 -690353985 * field700 + ((var4 - var72.field7009 - 2) * (1 + var67) - var72.field7009) - 4
                              );
                           }
                        }
                     }
                  }
               }

               if (var12.method6529(1324088624) == 1 && var12.method6533(-2104076397) == var0.field1697.method14001(var2 - var13, 1943759388) && var7 % 20 < 10
                  )
                {
                  GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);
                  if (field690 * 1269689307 > -1) {
                     SpritePixels.method13511(field714[0], field690 * 1269689307 + var3 - 12, -690353985 * field700 + var4 - 28);
                  }
               }
            }

            if (!var1.field1434.isEmpty()) {
               GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) / 2, 2054255495);

               for (int var58 = 0; var58 < var1.field1434.size(); var58++) {
                  classDV var61 = (classDV)var1.field1434.get(var58);
                  if (var61.method3619(169190403) > var7) {
                     classPW var65 = PacketWriter.method3373(var61.method3615(-1499119738), (byte)37);
                     if (var65.field5455 != null) {
                        var65 = classPW.method9331(var65, (byte)-49);
                        if (var65 == null) {
                           continue;
                        }
                     }

                     if (var61.method3619(-1412368764) - var65.field5448 * -265436849 <= var7) {
                        byte var68 = 2;
                        SpritePixels var70 = var65.method9339(-528056669);
                        SpritePixels var71 = var65.method9346(1009762333);
                        SpritePixels var73 = var65.method9342(846563473);
                        SpritePixels var75 = classPW.method9351(var65, 21303142);
                        Font var78 = var65.method9354(1341008597);
                        if (null == var78) {
                           var78 = classQJ.field5556;
                        }

                        int var79 = var61.method3622((short)-22540);
                        String var80 = classPW.method9336(var65, var79, -937512196);
                        int var84 = var78.method36(var80);
                        int var88 = 0;
                        if (null != var73) {
                           if (var71 == null && null == var75) {
                              var88 = 1;
                           } else {
                              var88 = var84 / var73.field7007 + 1;
                           }
                        }

                        int var89 = 0;
                        if (var70 != null) {
                           var89 = var70.field7007;
                        }

                        var89 += 2;
                        int var32 = var89;
                        if (null != var71) {
                           var89 += var71.field7007;
                        }

                        int var33 = var89;
                        int var34 = var89;
                        if (var73 != null) {
                           int var35 = var73.field7007 * var88;
                           var89 += var35;
                           var34 = var89 + (var35 - var84) / 2;
                        } else {
                           var89 += var84;
                        }

                        int var92 = var89;
                        if (null != var75) {
                           var89 += var75.field7007;
                        }

                        byte var36 = classWV.field6782[var58 << 1];
                        byte var38 = classWV.field6782[var58 << 1 | 1];
                        int var40 = field690 * 1269689307 + var36;
                        int var41 = var38 + -690353985 * field700;
                        int var42 = var61.method3619(-744174708) - var7;
                        int var43 = -175799565 * var65.field5453 - var42 * -175799565 * var65.field5453 / (-265436849 * var65.field5448);
                        int var44 = -(525276423 * var65.field5449) + 525276423 * var65.field5449 * var42 / (var65.field5448 * -265436849);
                        int var45 = var40 + var3 - (var89 >> 1) + var43;
                        int var46 = var44 + (var41 + var4 - 12);
                        int var47 = var46 + 15 + var65.field5461 * 1496284667;
                        int var48 = 255;
                        if (585026425 * var65.field5458 >= 0) {
                           var48 = (var42 << 8) / (var65.field5448 * -265436849 - var65.field5458 * 585026425);
                        }

                        if (var48 >= 0 && var48 < 255) {
                           if (null != var70) {
                              SpritePixels.method13523(var70, var45 - var70.field7010, var46, var48);
                           }

                           if (var71 != null) {
                              SpritePixels.method13523(var71, var45 + var32 - var71.field7010, var46, var48);
                           }

                           if (null != var73) {
                              for (int var93 = 0; var93 < var88; var93++) {
                                 SpritePixels.method13523(var73, var93 * var73.field7007 + (var33 + var45 - var73.field7010), var46, var48);
                              }
                           }

                           if (null != var75) {
                              SpritePixels.method13523(var75, var45 + var92 - var75.field7010, var46, var48);
                           }

                           AbstractFont.method58(
                              var78,
                              classPW.method9336(var65, var61.method3622((short)9729), 1212256876),
                              var34 + var45,
                              var47,
                              682377569 * var65.field5454,
                              0,
                              var48
                           );
                        } else {
                           if (var70 != null) {
                              SpritePixels.method13511(var70, var45 - var70.field7010, var46);
                           }

                           if (null != var71) {
                              SpritePixels.method13511(var71, var32 + var45 - var71.field7010, var46);
                           }

                           if (null != var73) {
                              for (int var49 = 0; var49 < var88; var49++) {
                                 SpritePixels.method13511(var73, var73.field7007 * var49 + (var33 + var45 - var73.field7010), var46);
                              }
                           }

                           if (var75 != null) {
                              SpritePixels.method13511(var75, var45 + var92 - var75.field7010, var46);
                           }

                           var78.method56(
                              classPW.method9336(var65, var61.method3622((short)3801), 2102614563),
                              var45 + var34,
                              var47,
                              682377569 * var65.field5454 | 0xFF000000,
                              0
                           );
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;IIIII)V")
   @ObfuscatedName("ap")
   static void method1447(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
      field689 = 0;
      classES.method4075(var0, var1, var2, var3, var4, var5, -914217287);

      for (int var6 = 0; var6 < classZH.method14003(var0.field1693, (byte)10); var6++) {
         WorldEntity var7 = (WorldEntity)var0.worldEntities.method13595(var0.field1693.method14001(var6, 1671056373));
         if (null != var7) {
            classES.method4075(var7.field6012, var1, var2, var3, var4, var5, -1919606862);
         }
      }

      boolean var22 = client.field851;
      if (var22) {
         int var23 = client.field845 * -2130951373;
         if (var23 >= 0) {
            WorldView var8 = classQB.method9434(var23, client.field814, 231229535);
            Player var9 = var8.method3737(var23, (byte)1);
            if (null != var9) {
               int var10 = classDF.method3050(client.field837, var23, 1043668321);
               classAU.method715(var8, var9, var10, var1, var2, var3, var4, var5, (byte)11);
            }
         }
      }

      int var24 = client.field971 * 927693091;
      if (var24 >= 0) {
         WorldView var25 = classQB.method9434(var24, client.field814, -2023492624);
         Player var27 = var25.method3737(var24, (byte)1);
         if (null != var27) {
            int var29 = classDF.method3050(client.field837, var24, 1043668321);
            classAU.method715(var25, var27, var29, var1, var2, var3, var4, var5, (byte)19);
         }
      }

      int var26 = -2114839507 * client.field984;
      Font var28 = classBB.field341;

      for (int var30 = 0; var30 < field689 * 1111851887; var30++) {
         int var11 = field692[var30];
         int var12 = field703[var30];
         int var13 = field695[var30];
         int var14 = field694[var30];
         boolean var15 = true;

         while (var15) {
            var15 = false;

            for (int var16 = 0; var16 < var30; var16++) {
               if (var12 + 2 > field703[var16] - field694[var16]
                  && var12 - var14 < 2 + field703[var16]
                  && var11 - var13 < field692[var16] + field695[var16]
                  && var11 + var13 > field692[var16] - field695[var16]
                  && field703[var16] - field694[var16] < var12) {
                  var12 = field703[var16] - field694[var16];
                  var15 = true;
               }
            }
         }

         field690 = field692[var30] * 562042963;
         field700 = (field703[var30] = var12) * 854419263;
         String var31 = field699[var30];
         if (0 == var26) {
            int var17 = 16776960;
            if (field693[var30] < 6) {
               var17 = field704[field693[var30]];
            }

            if (field693[var30] == 6) {
               var17 = var5 % 20 < 10 ? 16711680 : 16776960;
            }

            if (field693[var30] == 7) {
               var17 = var5 % 20 < 10 ? 255 : '\uffff';
            }

            if (field693[var30] == 8) {
               var17 = var5 % 20 < 10 ? '뀀' : 8454016;
            }

            if (field693[var30] == 9) {
               int var18 = 150 - field696[var30];
               if (var18 < 50) {
                  var17 = var18 * 1280 + 16711680;
               } else if (var18 < 100) {
                  var17 = 16776960 - (var18 - 50) * 327680;
               } else if (var18 < 150) {
                  var17 = 5 * (var18 - 100) + 65280;
               }
            }

            if (10 == field693[var30]) {
               int var32 = 150 - field696[var30];
               if (var32 < 50) {
                  var17 = 5 * var32 + 16711680;
               } else if (var32 < 100) {
                  var17 = 16711935 - (var32 - 50) * 327680;
               } else if (var32 < 150) {
                  var17 = 255 + 327680 * (var32 - 100) - (var32 - 100) * 5;
               }
            }

            if (11 == field693[var30]) {
               int var33 = 150 - field696[var30];
               if (var33 < 50) {
                  var17 = 16777215 - 327685 * var33;
               } else if (var33 < 100) {
                  var17 = 65280 + 327685 * (var33 - 50);
               } else if (var33 < 150) {
                  var17 = 16777215 - (var33 - 100) * 327680;
               }
            }

            if (12 == field693[var30] && null == field698[var30]) {
               int var34 = var31.length();
               field698[var30] = new int[var34];

               for (int var19 = 0; var19 < var34; var19++) {
                  int var20 = (int)(64.0F * ((float)var19 / var34));
                  int var21 = var20 << 10 | 896 | 64;
                  field698[var30][var19] = classGK.field2617[var21];
               }
            }

            if (field697[var30] == 0) {
               var28.method88(var31, field690 * 1269689307 + var1, -690353985 * field700 + var2, var17, 0, field698[var30]);
            }

            if (field697[var30] == 1) {
               var28.method76(var31, var1 + 1269689307 * field690, var2 + field700 * -690353985, var17, 0, var5, field698[var30]);
            }

            if (2 == field697[var30]) {
               AbstractFont.method80(var28, var31, 1269689307 * field690 + var1, field700 * -690353985 + var2, var17, 0, var5, field698[var30]);
            }

            if (field697[var30] == 3) {
               var28.method85(var31, 1269689307 * field690 + var1, var2 + -690353985 * field700, var17, 0, var5, 150 - field696[var30], field698[var30]);
            }

            if (4 == field697[var30]) {
               int var35 = (150 - field696[var30]) * (var28.method36(var31) + 100) / 150;
               classYW.method13674(var1 + field690 * 1269689307 - 50, var2, var1 + field690 * 1269689307 + 50, var4 + var2);
               var28.method92(var31, field690 * 1269689307 + var1 + 50 - var35, var2 + -690353985 * field700, var17, 0, field698[var30]);
               classYW.method13671(var1, var2, var1 + var3, var2 + var4);
            }

            if (field697[var30] == 5) {
               int var36 = 150 - field696[var30];
               int var37 = 0;
               if (var36 < 25) {
                  var37 = var36 - 25;
               } else if (var36 > 125) {
                  var37 = var36 - 125;
               }

               classYW.method13674(var1, var2 + field700 * -690353985 - var28.field8 - 1, var3 + var1, 5 + field700 * -690353985 + var2);
               var28.method88(var31, field690 * 1269689307 + var1, var2 + -690353985 * field700 + var37, var17, 0, field698[var30]);
               classYW.method13671(var1, var2, var1 + var3, var4 + var2);
            }
         } else {
            var28.method65(var31, var1 + 1269689307 * field690, -690353985 * field700 + var2, 16776960, 0);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   static boolean method1445() {
      return null != field714;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;IIIII)V")
   @ObfuscatedName("ai")
   static void method1448(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
      classDF var6 = client.field837;
      int var7 = 927693091 * client.field971;
      int var8 = -2130951373 * client.field845;
      int var9 = -2087374717 * var6.field1419;
      int[] var10 = var6.field1423;

      for (int var11 = 0; var11 < var9 + classZH.method14003(var0.field1697, (byte)10); var11++) {
         Actor var12;
         if (var11 < var9) {
            var12 = (Actor)var0.field1694.method13404(var10[var11]);
            if (var10[var11] == var7 || var10[var11] == var8) {
               continue;
            }
         } else {
            var12 = (Actor)var0.field1698.method13404(var0.field1697.method14001(var11 - var9, 1776024636));
         }

         classAU.method715(var0, var12, var11, var1, var2, var3, var4, var5, (byte)60);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Ldh;IIIIII)V")
   @ObfuscatedName("ak")
   static void method1452(WorldView var0, Actor var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 != null && var1.vmethod262((byte)27)) {
         if (var1 instanceof NPC) {
            classPL var8 = ((NPC)var1).definition;
            if (var8.field5325 != null) {
               var8 = var8.method8955(652890385);
            }

            if (null == var8) {
               return;
            }
         }

         classDF var50 = client.field837;
         Font var9 = classBB.field341;
         Font var10 = classVP.field6550;
         int var11 = client.field870 * 2102667627;
         classKQ var12 = client.field941;
         int var13 = -2087374717 * client.field837.field1419;
         int[] var14 = var50.field1423;
         boolean var15 = var2 < var13;
         int var16 = -2;
         if (null != var1.overheadText
            && (
               !var15
                  || !var1.field1458 && (var11 == 4 || !var1.field1503 && (var11 == 0 || 3 == var11 || 1 == var11 && ((Player)var1).method2622(-851958079)))
            )) {
            GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006), 2054255495);
            if (1269689307 * field690 > -1 && field689 * 1111851887 < -1479123829 * field691) {
               field695[field689 * 1111851887] = var9.method36(var1.overheadText) / 2;
               field694[field689 * 1111851887] = var9.field8;
               field692[1111851887 * field689] = 1269689307 * field690;
               field703[field689 * 1111851887] = -690353985 * field700 - var16;
               field693[1111851887 * field689] = 414414391 * var1.field1460;
               field697[1111851887 * field689] = 1831374229 * var1.field1481;
               field696[1111851887 * field689] = 317527437 * var1.field1459;
               field698[field689 * 1111851887] = var1.field1438;
               field699[field689 * 1111851887] = var1.overheadText;
               field689 += 867122063;
               var16 += 12;
            }
         }

         WorldEntity var17 = classCL.method1601(client.field814, -1105444433 * var1.field1439, 517694822);
         if (null == var17 || !var17.method10558(1434687569)) {
            if (!var1.field1442.method8179()) {
               GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);

               for (classCO var18 = (classCO)var1.field1442.method8167(); var18 != null; var18 = (classCO)classAAX.method294(var1.field1442)) {
                  classCV var19 = var18.method2562(var7, -1723428655);
                  if (var19 != null) {
                     HealthBarDefinition var20 = var18.field1177;
                     SpritePixels var21 = var20.method9368((byte)-22);
                     SpritePixels var22 = var20.method9365(-1577534439);
                     int var24 = 0;
                     int var23;
                     if (var21 != null && null != var22) {
                        if (545947590 * var20.field5486 < var22.field7007) {
                           var24 = -1874509853 * var20.field5486;
                        }

                        var23 = var22.field7007 - 2 * var24;
                     } else {
                        var23 = var20.field5485 * -1485258143;
                     }

                     int var25 = 255;
                     int var26 = -1;
                     int var27 = var7 - 1576496181 * var19.field1300;
                     int var28 = var19.field1299 * -808970489 * var23 / (-1485258143 * var20.field5485);
                     if (-425086145 * var19.field1297 > var27) {
                        int var29 = var20.field5483 * -822457041 == 0 ? 0 : var27 / (var20.field5483 * -822457041) * var20.field5483 * -822457041;
                        int var30 = var23 * var19.field1298 * -545900307 / (-1485258143 * var20.field5485);
                        var26 = var30 + (var28 - var30) * var29 / (-425086145 * var19.field1297);
                     } else {
                        var26 = var28;
                        int var81 = var19.field1297 * -425086145 + -1486866911 * var20.field5480 - var27;
                        if (597861161 * var20.field5477 >= 0) {
                           var25 = (var81 << 8) / (var20.field5480 * -1486866911 - 597861161 * var20.field5477);
                        }
                     }

                     if (var19.field1299 * -808970489 > 0 && var26 < 1) {
                        var26 = 1;
                     }

                     if (null != var21 && var22 != null) {
                        if (var23 == var26) {
                           var26 += var24 * 2;
                        } else {
                           var26 += var24;
                        }

                        int var83 = var21.field7009;
                        var16 += var83;
                        int var86 = var3 + field690 * 1269689307 - (var23 >> 1);
                        int var31 = -690353985 * field700 + var4 - var16;
                        var86 -= var24;
                        if (var25 >= 0 && var25 < 255) {
                           SpritePixels.method13523(var21, var86, var31, var25);
                           classYW.method13674(var86, var31, var26 + var86, var31 + var83);
                           SpritePixels.method13523(var22, var86, var31, var25);
                        } else {
                           SpritePixels.method13511(var21, var86, var31);
                           classYW.method13674(var86, var31, var26 + var86, var31 + var83);
                           SpritePixels.method13511(var22, var86, var31);
                        }

                        classYW.method13671(var3, var4, var3 + var5, var4 + var6);
                        var16 += 2;
                     } else {
                        var16 += 5;
                        if (field690 * 1269689307 > -1) {
                           int var82 = field690 * 1269689307 + var3 - (var23 >> 1);
                           int var85 = field700 * -690353985 + var4 - var16;
                           classYW.method13698(var82, var85, var26, 5, 65280);
                           classYW.method13698(var26 + var82, var85, var23 - var26, 5, 16711680);
                        }

                        var16 += 2;
                     }
                  } else if (var18.method2566((byte)32)) {
                     var18.vmethod398();
                  }
               }
            }

            if (var16 == -2) {
               var16 += 7;
            }

            if (var15 && var7 == -741500243 * var1.field1490) {
               Player var59 = (Player)var1;
               boolean var55;
               if (0 == -1072700981 * client.field852) {
                  var55 = false;
               } else if (-1315528093 * var59.field1480 == client.field845 * -2130951373) {
                  var55 = classKC.method6459(945415820);
               } else {
                  boolean var62 = classDB.method2887((byte)-116);
                  if (!var62) {
                     boolean var66 = (client.field852 * -1072700981 & 1) != 0;
                     var62 = var66 && var59.method2622(-2117926543);
                  }

                  var55 = var62 || classTW.method11210(-811881628) && Player.method2629(var59, 1523927756);
               }

               if (var55) {
                  Player var63 = (Player)var1;
                  if (var15) {
                     GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);
                     var16 += 4;
                     var10.method65(var63.field1283.method164(1941170805), 1269689307 * field690 + var3, field700 * -690353985 + var4 - var16, 16777215, 0);
                     var16 += 18;
                  }
               }
            }

            if (var15) {
               Player var56 = (Player)var1;
               if (var56.field1259) {
                  return;
               }

               if (-1 != var56.field1271 * 1605395471 || -325171935 * var56.field1266 != -1) {
                  GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);
                  if (field690 * 1269689307 > -1) {
                     if (1605395471 * var56.field1271 != -1) {
                        var16 += 25;
                        SpritePixels.method13511(
                           classUO.field6361[var56.field1271 * 1605395471], 1269689307 * field690 + var3 - 12, var4 + -690353985 * field700 - var16
                        );
                     }

                     if (-1 != var56.field1266 * -325171935) {
                        var16 += 25;
                        SpritePixels.method13511(
                           field713[-325171935 * var56.field1266], field690 * 1269689307 + var3 - 12, field700 * -690353985 + var4 - var16
                        );
                     }
                  }
               }

               if (var2 >= 0 && var12.method6529(-1208058263) == 3 && var12.method6533(-2043021058) == var14[var2]) {
                  GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);
                  if (1269689307 * field690 > -1) {
                     var16 += field714[1].field7009;
                     SpritePixels.method13511(field714[1], var3 + 1269689307 * field690 - 12, -690353985 * field700 + var4 - var16);
                  }
               }
            } else {
               NPC var57 = (NPC)var1;
               int[] var60 = var57.method3460(-1575128728);
               short[] var64 = NPC.method3462(var57, 1155087847);
               if (null != var64 && null != var60) {
                  for (int var67 = 0; var67 < var64.length; var67++) {
                     if (var64[var67] >= 0 && var60[var67] >= 0) {
                        long var69 = (long)var60[var67] << 8 | var64[var67];
                        SpritePixels var72 = (SpritePixels)field702.method9981(var69, (byte)-58);
                        if (null == var72) {
                           SpritePixels[] var74 = classIR.method6307(classHC.field2767, var60[var67], 0, -1253680523);
                           if (null != var74 && var64[var67] < var74.length) {
                              var72 = var74[var64[var67]];
                              field702.method9982(var69, var72, (byte)1);
                           }
                        }

                        if (null != var72) {
                           GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);
                           if (1269689307 * field690 > -1) {
                              SpritePixels.method13511(
                                 var72,
                                 var3 + 1269689307 * field690 - (var72.field7007 >> 1),
                                 -690353985 * field700 + ((var4 - var72.field7009 - 2) * (1 + var67) - var72.field7009) - 4
                              );
                           }
                        }
                     }
                  }
               }

               if (var12.method6529(1415620940) == 1 && var12.method6533(-902924834) == var0.field1697.method14001(var2 - var13, 2061689756) && var7 % 20 < 10) {
                  GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);
                  if (field690 * 1269689307 > -1) {
                     SpritePixels.method13511(field714[0], field690 * 1269689307 + var3 - 12, -690353985 * field700 + var4 - 28);
                  }
               }
            }

            if (!var1.field1434.isEmpty()) {
               GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) / 2, 2054255495);

               for (int var58 = 0; var58 < var1.field1434.size(); var58++) {
                  classDV var61 = (classDV)var1.field1434.get(var58);
                  if (var61.method3619(471284364) > var7) {
                     classPW var65 = PacketWriter.method3373(var61.method3615(-1499119738), (byte)83);
                     if (var65.field5455 != null) {
                        var65 = classPW.method9331(var65, (byte)-68);
                        if (var65 == null) {
                           continue;
                        }
                     }

                     if (var61.method3619(1828089011) - var65.field5448 * -265436849 <= var7) {
                        byte var68 = 2;
                        SpritePixels var70 = var65.method9339(-528056669);
                        SpritePixels var71 = var65.method9346(1009762333);
                        SpritePixels var73 = var65.method9342(-1971593430);
                        SpritePixels var75 = classPW.method9351(var65, 21303142);
                        Font var78 = var65.method9354(1999999751);
                        if (null == var78) {
                           var78 = classQJ.field5556;
                        }

                        int var79 = var61.method3622((short)15690);
                        String var80 = classPW.method9336(var65, var79, 1843743667);
                        int var84 = var78.method36(var80);
                        int var88 = 0;
                        if (null != var73) {
                           if (var71 == null && null == var75) {
                              var88 = 1;
                           } else {
                              var88 = var84 / var73.field7007 + 1;
                           }
                        }

                        int var89 = 0;
                        if (var70 != null) {
                           var89 = var70.field7007;
                        }

                        var89 += 2;
                        int var32 = var89;
                        if (null != var71) {
                           var89 += var71.field7007;
                        }

                        int var33 = var89;
                        int var34 = var89;
                        if (var73 != null) {
                           int var35 = var73.field7007 * var88;
                           var89 += var35;
                           var34 = var89 + (var35 - var84) / 2;
                        } else {
                           var89 += var84;
                        }

                        int var92 = var89;
                        if (null != var75) {
                           var89 += var75.field7007;
                        }

                        byte var36 = classWV.field6782[var58 << 1];
                        byte var38 = classWV.field6782[var58 << 1 | 1];
                        int var40 = field690 * 1269689307 + var36;
                        int var41 = var38 + -690353985 * field700;
                        int var42 = var61.method3619(657125187) - var7;
                        int var43 = -175799565 * var65.field5453 - var42 * -175799565 * var65.field5453 / (-265436849 * var65.field5448);
                        int var44 = -(525276423 * var65.field5449) + 525276423 * var65.field5449 * var42 / (var65.field5448 * -265436849);
                        int var45 = var40 + var3 - (var89 >> 1) + var43;
                        int var46 = var44 + (var41 + var4 - 12);
                        int var47 = var46 + 15 + var65.field5461 * 1496284667;
                        int var48 = 255;
                        if (585026425 * var65.field5458 >= 0) {
                           var48 = (var42 << 8) / (var65.field5448 * -265436849 - var65.field5458 * 585026425);
                        }

                        if (var48 >= 0 && var48 < 255) {
                           if (null != var70) {
                              SpritePixels.method13523(var70, var45 - var70.field7010, var46, var48);
                           }

                           if (var71 != null) {
                              SpritePixels.method13523(var71, var45 + var32 - var71.field7010, var46, var48);
                           }

                           if (null != var73) {
                              for (int var93 = 0; var93 < var88; var93++) {
                                 SpritePixels.method13523(var73, var93 * var73.field7007 + (var33 + var45 - var73.field7010), var46, var48);
                              }
                           }

                           if (null != var75) {
                              SpritePixels.method13523(var75, var45 + var92 - var75.field7010, var46, var48);
                           }

                           AbstractFont.method58(
                              var78,
                              classPW.method9336(var65, var61.method3622((short)3161), 754297948),
                              var34 + var45,
                              var47,
                              682377569 * var65.field5454,
                              0,
                              var48
                           );
                        } else {
                           if (var70 != null) {
                              SpritePixels.method13511(var70, var45 - var70.field7010, var46);
                           }

                           if (null != var71) {
                              SpritePixels.method13511(var71, var32 + var45 - var71.field7010, var46);
                           }

                           if (null != var73) {
                              for (int var49 = 0; var49 < var88; var49++) {
                                 SpritePixels.method13511(var73, var73.field7007 * var49 + (var33 + var45 - var73.field7010), var46);
                              }
                           }

                           if (var75 != null) {
                              SpritePixels.method13511(var75, var45 + var92 - var75.field7010, var46);
                           }

                           var78.method56(
                              classPW.method9336(var65, var61.method3622((short)-918), -351062836),
                              var45 + var34,
                              var47,
                              682377569 * var65.field5454 | 0xFF000000,
                              0
                           );
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;IIIII)V")
   @ObfuscatedName("aw")
   static void method1449(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
      classDF var6 = client.field837;
      int var7 = 927693091 * client.field971;
      int var8 = -919964211 * client.field845;
      int var9 = 1910975583 * var6.field1419;
      int[] var10 = var6.field1423;

      for (int var11 = 0; var11 < var9 + classZH.method14003(var0.field1697, (byte)10); var11++) {
         Actor var12;
         if (var11 < var9) {
            var12 = (Actor)var0.field1694.method13404(var10[var11]);
            if (var10[var11] == var7 || var10[var11] == var8) {
               continue;
            }
         } else {
            var12 = (Actor)var0.field1698.method13404(var0.field1697.method14001(var11 - var9, 1810329661));
         }

         classAU.method715(var0, var12, var11, var1, var2, var3, var4, var5, (byte)73);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Ldh;I)V")
   @ObfuscatedName("ah")
   static void method1455(WorldView var0, Actor var1, int var2) {
      classLL.method7120(var0, var1.field1487 * -1547553299, var1.field1489 * -1272026483, var2, var1.vmethod267(-1423776655), -831018947);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Ldh;IIIIII)V")
   @ObfuscatedName("av")
   static void method1453(WorldView var0, Actor var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 != null && var1.vmethod262((byte)122)) {
         if (var1 instanceof NPC) {
            classPL var8 = ((NPC)var1).definition;
            if (var8.field5325 != null) {
               var8 = var8.method8955(652890385);
            }

            if (null == var8) {
               return;
            }
         }

         classDF var50 = client.field837;
         Font var9 = classBB.field341;
         Font var10 = classVP.field6550;
         int var11 = client.field870 * 2102667627;
         classKQ var12 = client.field941;
         int var13 = -2087374717 * client.field837.field1419;
         int[] var14 = var50.field1423;
         boolean var15 = var2 < var13;
         int var16 = -2;
         if (null != var1.overheadText
            && (
               !var15
                  || !var1.field1458 && (var11 == 4 || !var1.field1503 && (var11 == 0 || 3 == var11 || 1 == var11 && ((Player)var1).method2622(-1589382155)))
            )) {
            GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006), 2054255495);
            if (1269689307 * field690 > -1 && field689 * 1111851887 < -1479123829 * field691) {
               field695[field689 * 1111851887] = var9.method36(var1.overheadText) / 2;
               field694[field689 * 1111851887] = var9.field8;
               field692[1111851887 * field689] = 1269689307 * field690;
               field703[field689 * 1111851887] = -690353985 * field700 - var16;
               field693[1111851887 * field689] = 414414391 * var1.field1460;
               field697[1111851887 * field689] = 1831374229 * var1.field1481;
               field696[1111851887 * field689] = 317527437 * var1.field1459;
               field698[field689 * 1111851887] = var1.field1438;
               field699[field689 * 1111851887] = var1.overheadText;
               field689 += 867122063;
               var16 += 12;
            }
         }

         WorldEntity var17 = classCL.method1601(client.field814, -1105444433 * var1.field1439, -1606101895);
         if (null == var17 || !var17.method10558(1437002803)) {
            if (!var1.field1442.method8179()) {
               GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);

               for (classCO var18 = (classCO)var1.field1442.method8167(); var18 != null; var18 = (classCO)classAAX.method294(var1.field1442)) {
                  classCV var19 = var18.method2562(var7, -2022366159);
                  if (var19 != null) {
                     HealthBarDefinition var20 = var18.field1177;
                     SpritePixels var21 = var20.method9368((byte)-72);
                     SpritePixels var22 = var20.method9365(327871137);
                     int var24 = 0;
                     int var23;
                     if (var21 != null && null != var22) {
                        if (545947590 * var20.field5486 < var22.field7007) {
                           var24 = -1874509853 * var20.field5486;
                        }

                        var23 = var22.field7007 - 2 * var24;
                     } else {
                        var23 = var20.field5485 * -1485258143;
                     }

                     int var25 = 255;
                     int var26 = -1;
                     int var27 = var7 - 1576496181 * var19.field1300;
                     int var28 = var19.field1299 * -808970489 * var23 / (-1485258143 * var20.field5485);
                     if (-425086145 * var19.field1297 > var27) {
                        int var29 = var20.field5483 * -822457041 == 0 ? 0 : var27 / (var20.field5483 * -822457041) * var20.field5483 * -822457041;
                        int var30 = var23 * var19.field1298 * -545900307 / (-1485258143 * var20.field5485);
                        var26 = var30 + (var28 - var30) * var29 / (-425086145 * var19.field1297);
                     } else {
                        var26 = var28;
                        int var81 = var19.field1297 * -425086145 + -1486866911 * var20.field5480 - var27;
                        if (597861161 * var20.field5477 >= 0) {
                           var25 = (var81 << 8) / (var20.field5480 * -1486866911 - 597861161 * var20.field5477);
                        }
                     }

                     if (var19.field1299 * -808970489 > 0 && var26 < 1) {
                        var26 = 1;
                     }

                     if (null != var21 && var22 != null) {
                        if (var23 == var26) {
                           var26 += var24 * 2;
                        } else {
                           var26 += var24;
                        }

                        int var83 = var21.field7009;
                        var16 += var83;
                        int var86 = var3 + field690 * 1269689307 - (var23 >> 1);
                        int var31 = -690353985 * field700 + var4 - var16;
                        var86 -= var24;
                        if (var25 >= 0 && var25 < 255) {
                           SpritePixels.method13523(var21, var86, var31, var25);
                           classYW.method13674(var86, var31, var26 + var86, var31 + var83);
                           SpritePixels.method13523(var22, var86, var31, var25);
                        } else {
                           SpritePixels.method13511(var21, var86, var31);
                           classYW.method13674(var86, var31, var26 + var86, var31 + var83);
                           SpritePixels.method13511(var22, var86, var31);
                        }

                        classYW.method13671(var3, var4, var3 + var5, var4 + var6);
                        var16 += 2;
                     } else {
                        var16 += 5;
                        if (field690 * 1269689307 > -1) {
                           int var82 = field690 * 1269689307 + var3 - (var23 >> 1);
                           int var85 = field700 * -690353985 + var4 - var16;
                           classYW.method13698(var82, var85, var26, 5, 65280);
                           classYW.method13698(var26 + var82, var85, var23 - var26, 5, 16711680);
                        }

                        var16 += 2;
                     }
                  } else if (var18.method2566((byte)32)) {
                     var18.vmethod398();
                  }
               }
            }

            if (var16 == -2) {
               var16 += 7;
            }

            if (var15 && var7 == -741500243 * var1.field1490) {
               Player var59 = (Player)var1;
               boolean var55;
               if (0 == -1072700981 * client.field852) {
                  var55 = false;
               } else if (-1315528093 * var59.field1480 == client.field845 * -2130951373) {
                  var55 = classKC.method6459(1220994350);
               } else {
                  boolean var62 = classDB.method2887((byte)-117);
                  if (!var62) {
                     boolean var66 = (client.field852 * -1072700981 & 1) != 0;
                     var62 = var66 && var59.method2622(1699711653);
                  }

                  var55 = var62 || classTW.method11210(-811881628) && Player.method2629(var59, 2086352086);
               }

               if (var55) {
                  Player var63 = (Player)var1;
                  if (var15) {
                     GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);
                     var16 += 4;
                     var10.method65(var63.field1283.method164(621988466), 1269689307 * field690 + var3, field700 * -690353985 + var4 - var16, 16777215, 0);
                     var16 += 18;
                  }
               }
            }

            if (var15) {
               Player var56 = (Player)var1;
               if (var56.field1259) {
                  return;
               }

               if (-1 != var56.field1271 * 1605395471 || -325171935 * var56.field1266 != -1) {
                  GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);
                  if (field690 * 1269689307 > -1) {
                     if (1605395471 * var56.field1271 != -1) {
                        var16 += 25;
                        SpritePixels.method13511(
                           classUO.field6361[var56.field1271 * 1605395471], 1269689307 * field690 + var3 - 12, var4 + -690353985 * field700 - var16
                        );
                     }

                     if (-1 != var56.field1266 * -325171935) {
                        var16 += 25;
                        SpritePixels.method13511(
                           field713[-325171935 * var56.field1266], field690 * 1269689307 + var3 - 12, field700 * -690353985 + var4 - var16
                        );
                     }
                  }
               }

               if (var2 >= 0 && var12.method6529(-1465639345) == 3 && var12.method6533(-648460385) == var14[var2]) {
                  GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);
                  if (1269689307 * field690 > -1) {
                     var16 += field714[1].field7009;
                     SpritePixels.method13511(field714[1], var3 + 1269689307 * field690 - 12, -690353985 * field700 + var4 - var16);
                  }
               }
            } else {
               NPC var57 = (NPC)var1;
               int[] var60 = var57.method3460(-1478262104);
               short[] var64 = NPC.method3462(var57, 1519681246);
               if (null != var64 && null != var60) {
                  for (int var67 = 0; var67 < var64.length; var67++) {
                     if (var64[var67] >= 0 && var60[var67] >= 0) {
                        long var69 = (long)var60[var67] << 8 | var64[var67];
                        SpritePixels var72 = (SpritePixels)field702.method9981(var69, (byte)-57);
                        if (null == var72) {
                           SpritePixels[] var74 = classIR.method6307(classHC.field2767, var60[var67], 0, -1253680523);
                           if (null != var74 && var64[var67] < var74.length) {
                              var72 = var74[var64[var67]];
                              field702.method9982(var69, var72, (byte)1);
                           }
                        }

                        if (null != var72) {
                           GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);
                           if (1269689307 * field690 > -1) {
                              SpritePixels.method13511(
                                 var72,
                                 var3 + 1269689307 * field690 - (var72.field7007 >> 1),
                                 -690353985 * field700 + ((var4 - var72.field7009 - 2) * (1 + var67) - var72.field7009) - 4
                              );
                           }
                        }
                     }
                  }
               }

               if (var12.method6529(-1315440949) == 1 && var12.method6533(-322076388) == var0.field1697.method14001(var2 - var13, 1658285881) && var7 % 20 < 10
                  )
                {
                  GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) + 15, 2054255495);
                  if (field690 * 1269689307 > -1) {
                     SpritePixels.method13511(field714[0], field690 * 1269689307 + var3 - 12, -690353985 * field700 + var4 - 28);
                  }
               }
            }

            if (!var1.field1434.isEmpty()) {
               GrandExchangeOffer.method7620(var0, var1, var1.vmethod373(1468278006) / 2, 2054255495);

               for (int var58 = 0; var58 < var1.field1434.size(); var58++) {
                  classDV var61 = (classDV)var1.field1434.get(var58);
                  if (var61.method3619(-985681073) > var7) {
                     classPW var65 = PacketWriter.method3373(var61.method3615(-1499119738), (byte)44);
                     if (var65.field5455 != null) {
                        var65 = classPW.method9331(var65, (byte)-50);
                        if (var65 == null) {
                           continue;
                        }
                     }

                     if (var61.method3619(1125329558) - var65.field5448 * -265436849 <= var7) {
                        byte var68 = 2;
                        SpritePixels var70 = var65.method9339(-528056669);
                        SpritePixels var71 = var65.method9346(1009762333);
                        SpritePixels var73 = var65.method9342(1294579348);
                        SpritePixels var75 = classPW.method9351(var65, 21303142);
                        Font var78 = var65.method9354(611668537);
                        if (null == var78) {
                           var78 = classQJ.field5556;
                        }

                        int var79 = var61.method3622((short)15862);
                        String var80 = classPW.method9336(var65, var79, 1892418637);
                        int var84 = var78.method36(var80);
                        int var88 = 0;
                        if (null != var73) {
                           if (var71 == null && null == var75) {
                              var88 = 1;
                           } else {
                              var88 = var84 / var73.field7007 + 1;
                           }
                        }

                        int var89 = 0;
                        if (var70 != null) {
                           var89 = var70.field7007;
                        }

                        var89 += 2;
                        int var32 = var89;
                        if (null != var71) {
                           var89 += var71.field7007;
                        }

                        int var33 = var89;
                        int var34 = var89;
                        if (var73 != null) {
                           int var35 = var73.field7007 * var88;
                           var89 += var35;
                           var34 = var89 + (var35 - var84) / 2;
                        } else {
                           var89 += var84;
                        }

                        int var92 = var89;
                        if (null != var75) {
                           var89 += var75.field7007;
                        }

                        byte var36 = classWV.field6782[var58 << 1];
                        byte var38 = classWV.field6782[var58 << 1 | 1];
                        int var40 = field690 * 1269689307 + var36;
                        int var41 = var38 + -690353985 * field700;
                        int var42 = var61.method3619(914893160) - var7;
                        int var43 = -175799565 * var65.field5453 - var42 * -175799565 * var65.field5453 / (-265436849 * var65.field5448);
                        int var44 = -(525276423 * var65.field5449) + 525276423 * var65.field5449 * var42 / (var65.field5448 * -265436849);
                        int var45 = var40 + var3 - (var89 >> 1) + var43;
                        int var46 = var44 + (var41 + var4 - 12);
                        int var47 = var46 + 15 + var65.field5461 * 1496284667;
                        int var48 = 255;
                        if (585026425 * var65.field5458 >= 0) {
                           var48 = (var42 << 8) / (var65.field5448 * -265436849 - var65.field5458 * 585026425);
                        }

                        if (var48 >= 0 && var48 < 255) {
                           if (null != var70) {
                              SpritePixels.method13523(var70, var45 - var70.field7010, var46, var48);
                           }

                           if (var71 != null) {
                              SpritePixels.method13523(var71, var45 + var32 - var71.field7010, var46, var48);
                           }

                           if (null != var73) {
                              for (int var93 = 0; var93 < var88; var93++) {
                                 SpritePixels.method13523(var73, var93 * var73.field7007 + (var33 + var45 - var73.field7010), var46, var48);
                              }
                           }

                           if (null != var75) {
                              SpritePixels.method13523(var75, var45 + var92 - var75.field7010, var46, var48);
                           }

                           AbstractFont.method58(
                              var78,
                              classPW.method9336(var65, var61.method3622((short)1696), 832584782),
                              var34 + var45,
                              var47,
                              682377569 * var65.field5454,
                              0,
                              var48
                           );
                        } else {
                           if (var70 != null) {
                              SpritePixels.method13511(var70, var45 - var70.field7010, var46);
                           }

                           if (null != var71) {
                              SpritePixels.method13511(var71, var32 + var45 - var71.field7010, var46);
                           }

                           if (null != var73) {
                              for (int var49 = 0; var49 < var88; var49++) {
                                 SpritePixels.method13511(var73, var73.field7007 * var49 + (var33 + var45 - var73.field7010), var46);
                              }
                           }

                           if (var75 != null) {
                              SpritePixels.method13511(var75, var45 + var92 - var75.field7010, var46);
                           }

                           var78.method56(
                              classPW.method9336(var65, var61.method3622((short)3364), 1302367584),
                              var45 + var34,
                              var47,
                              682377569 * var65.field5454 | 0xFF000000,
                              0
                           );
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ay")
   static boolean method1444() {
      return null != classUO.field6361;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Ldh;I)V")
   @ObfuscatedName("an")
   static void method1456(WorldView var0, Actor var1, int var2) {
      classLL.method7120(var0, var1.field1487 * -1547553299, var1.field1489 * -1272026483, var2, var1.vmethod267(-1423776655), 1290913277);
   }

   classCE() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;Ldh;I)V")
   @ObfuscatedName("am")
   static void method1457(WorldView var0, Actor var1, int var2) {
      classLL.method7120(var0, var1.field1487 * 1327696022, var1.field1489 * 2133841363, var2, var1.vmethod267(-1423776655), 172292858);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;IIII)V")
   @ObfuscatedName("bn")
   static void method1458(WorldView var0, int var1, int var2, int var3, int var4) {
      int var5 = var1;
      int var6 = var2;
      int var7 = classKC.method6460(var0, var1, var2, var0.field1710 * -483624883, var4, (short)-31476) - var3;
      if (!var0.method3719(-2087374717)) {
         WorldEntity var8 = (WorldEntity)classIS.field3053.worldEntities.method13595(var0.field1699 * 2140889407);
         if (null != var8) {
            classUZ var9 = classYY.method13790(var0, var1, var2, (byte)113);
            var5 = (int)var9.field6427;
            var6 = (int)var9.field6426;
            var7 += classKV.method6571(
               classIS.field3053, var8.vmethod368(311606126), var8.vmethod371(-58550128), classIS.field3053.field1710 * -1128418278, (byte)122
            );
            classUZ.method11727(var9, 1893704017);
         }
      }

      classAU.method713(var5, var6, var7, 793238645);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;IIIII)V")
   @ObfuscatedName("ar")
   static void method1450(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
      classDF var6 = client.field837;
      int var7 = 927693091 * client.field971;
      int var8 = -2130951373 * client.field845;
      int var9 = -2087374717 * var6.field1419;
      int[] var10 = var6.field1423;

      for (int var11 = 0; var11 < var9 + classZH.method14003(var0.field1697, (byte)10); var11++) {
         Actor var12;
         if (var11 < var9) {
            var12 = (Actor)var0.field1694.method13404(var10[var11]);
            if (var10[var11] == var7 || var10[var11] == var8) {
               continue;
            }
         } else {
            var12 = (Actor)var0.field1698.method13404(var0.field1697.method14001(var11 - var9, 1829636378));
         }

         classAU.method715(var0, var12, var11, var1, var2, var3, var4, var5, (byte)93);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bc")
   static void method1460(int var0, int var1, int var2) {
      short var3 = 128;
      short var4 = 128;
      int var5 = classKY.method6605(classIS.field3053.field1696 * 1296729483 - 2, 440020713);
      int var6 = classKY.method6605(classIS.field3053.field1692 * -1269171107 - 2, -423121777);
      if (var0 >= var3 && var5 >= var0 && var1 >= var4 && var6 >= var1) {
         var0 -= -325062789 * classKI.field3598;
         var2 -= classNL.field4684 * 1615527037;
         var1 -= classAI.field167 * 1343311673;
         int var7 = client.field914.method11443(777056850);
         int var8 = classUP.method11445(client.field914, (byte)2);
         int var9 = client.field796.method11443(-314696500);
         int var10 = classUP.method11445(client.field796, (byte)-51);
         int var11 = var9 * var1 + var0 * var10 >> 16;
         var1 = var10 * var1 - var0 * var9 >> 16;
         var11 = var8 * var2 - var7 * var1 >> 16;
         var1 = var8 * var1 + var7 * var2 >> 16;
         if (var1 >= 50) {
            field690 = 562042963 * (client.field878 * 1129651895 * var11 / var1 + client.field990 * 27064125 / 2);
            field700 = 854419263 * (1158148203 * client.field982 / 2 + client.field878 * 1129651895 * var11 / var1);
         } else {
            field690 = -562042963;
            field700 = -854419263;
         }
      } else {
         field690 = -562042963;
         field700 = -854419263;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIS)Lbl;")
   @ObfuscatedName("af")
   static Script method1439(int var0, int var1, int var2, short var3) {
      try {
         int var4 = var0 + (var1 << 8);
         Script var6 = classQW.method9830(var4, var0, -1549414087);
         if (var6 != null) {
            return var6;
         } else {
            int var5 = classCO.method2558(var2, var0, -1184071760);
            var6 = classQW.method9830(var5, var0, -1339043867);
            if (null != var6) {
               if (var3 == 253) {
                  throw new IllegalStateException();
               } else {
                  return var6;
               }
            } else {
               var5 = classMB.method7502(var0, (byte)14);
               var6 = classQW.method9830(var5, var0, -1226656895);
               if (null != var6) {
                  if (var3 == 253) {
                     throw new IllegalStateException();
                  } else {
                     return var6;
                  }
               } else {
                  return null;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.newRunException(var7, "ce.af(" + ')');
      }
   }
}
