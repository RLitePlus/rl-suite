import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("df")
public class classDF {
   @ObfuscatedName("ae")
   final int[] field1423 = new int[2048];
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field1424 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field1426 = 2;
   @ObfuscatedSignature(descriptor = "[Ldc;")
   @ObfuscatedName("ab")
   final classDC[] field1411 = new classDC[2048];
   @ObfuscatedName("ag")
   final boolean[] field1416 = new boolean[2048];
   @ObfuscatedName("ac")
   final String[] field1415;
   @ObfuscatedSignature(descriptor = "Lxy;")
   @ObfuscatedName("ax")
   final classXY field1414;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field1425 = 7759444;
   @ObfuscatedName("aa")
   final int[] field1418;
   @ObfuscatedName("ao")
   final int[] field1412;
   @ObfuscatedName("al")
   final int[] field1417;
   @ObfuscatedName("aj")
   int field1419;
   @ObfuscatedName("ay")
   int field1420;
   @ObfuscatedName("aq")
   int field1421;
   @ObfuscatedName("ad")
   int field1413;
   @ObfuscatedSignature(descriptor = "[Lgt;")
   @ObfuscatedName("as")
   final classGT[] field1422 = new classGT[2048];
   @ObfuscatedName("ic")
   static int field1427;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldf;)V")
   @ObfuscatedName("cd")
   public static void method3033(classDF var0) {
      if (var0 == null) {
         var0.method3048();
      }

      for (int var1 = 0; var1 < var0.field1419 * -2087374717; var1++) {
         int var2 = var0.field1423[var1];
         if (var0.field1416[var2]) {
            classDC var3 = var0.field1411[var2];
            classDC.method2924(var3, var0.field1422[var2], (byte)-69);
            var0.field1416[var2] = false;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldf;Lxs;)V")
   @ObfuscatedName("vf")
   public static void method3005(classDF var0, PacketBuffer var1) {
      if (var0 == null) {
         var0.method3023();
      }

      var0.field1421 = 0;
      int var2 = 0;
      PacketBuffer.method12921(var1, (byte)124);

      for (int var3 = 0; var3 < -2087374717 * var0.field1419; var3++) {
         int var4 = var0.field1423[var3];
         if (0 == (var0.field1411[var4].field1390 & 1)) {
            if (var2 > 0) {
               var2--;
               var0.field1411[var4].field1390 = (byte)(var0.field1411[var4].field1390 | 2);
            } else {
               int var5 = PacketBuffer.method12923(var1, 1, 1303445017);
               if (0 == var5) {
                  var2 = method3009(var0, var1, 1139867796);
                  var0.field1411[var4].field1390 = (byte)(var0.field1411[var4].field1390 | 2);
               } else {
                  method3015(var0, var1, var4, (byte)-46);
               }
            }
         }
      }

      PacketBuffer.method12926(var1, -2041514663);
      if (0 != var2) {
         throw new RuntimeException();
      } else {
         PacketBuffer.method12921(var1, (byte)84);

         for (int var6 = 0; var6 < var0.field1419 * -2087374717; var6++) {
            int var10 = var0.field1423[var6];
            if (0 != (var0.field1411[var10].field1390 & 1)) {
               if (var2 > 0) {
                  var2--;
                  var0.field1411[var10].field1390 = (byte)(var0.field1411[var10].field1390 | 2);
               } else {
                  int var13 = PacketBuffer.method12923(var1, 1, 687097639);
                  if (0 == var13) {
                     var2 = method3009(var0, var1, -1803878521);
                     var0.field1411[var10].field1390 = (byte)(var0.field1411[var10].field1390 | 2);
                  } else {
                     method3015(var0, var1, var10, (byte)-68);
                  }
               }
            }
         }

         PacketBuffer.method12926(var1, -2098706057);
         if (0 != var2) {
            throw new RuntimeException();
         } else {
            PacketBuffer.method12921(var1, (byte)100);

            for (int var7 = 0; var7 < -392147439 * var0.field1420; var7++) {
               int var11 = var0.field1418[var7];
               if ((var0.field1411[var11].field1390 & 1) != 0) {
                  if (var2 > 0) {
                     var2--;
                     var0.field1411[var11].field1390 = (byte)(var0.field1411[var11].field1390 | 2);
                  } else {
                     int var14 = PacketBuffer.method12923(var1, 1, 1023345228);
                     if (0 == var14) {
                        var2 = method3009(var0, var1, 197963512);
                        var0.field1411[var11].field1390 = (byte)(var0.field1411[var11].field1390 | 2);
                     } else if (var0.method3017(var1, var11, (byte)-31)) {
                        var0.field1411[var11].field1390 = (byte)(var0.field1411[var11].field1390 | 2);
                     }
                  }
               }
            }

            PacketBuffer.method12926(var1, -2084469240);
            if (0 != var2) {
               throw new RuntimeException();
            } else {
               PacketBuffer.method12921(var1, (byte)74);

               for (int var8 = 0; var8 < -392147439 * var0.field1420; var8++) {
                  int var12 = var0.field1418[var8];
                  if ((var0.field1411[var12].field1390 & 1) == 0) {
                     if (var2 > 0) {
                        var2--;
                        var0.field1411[var12].field1390 = (byte)(var0.field1411[var12].field1390 | 2);
                     } else {
                        int var15 = PacketBuffer.method12923(var1, 1, 1078779395);
                        if (0 == var15) {
                           var2 = method3009(var0, var1, 1359451656);
                           var0.field1411[var12].field1390 = (byte)(var0.field1411[var12].field1390 | 2);
                        } else if (var0.method3017(var1, var12, (byte)-34)) {
                           var0.field1411[var12].field1390 = (byte)(var0.field1411[var12].field1390 | 2);
                        }
                     }
                  }
               }

               PacketBuffer.method12926(var1, -1997811777);
               if (var2 != 0) {
                  throw new RuntimeException();
               } else {
                  var0.field1419 = 0;
                  var0.field1420 = 0;

                  for (int var9 = 1; var9 < 2048; var9++) {
                     var0.field1411[var9].field1390 = (byte)(var0.field1411[var9].field1390 >> 1);
                     if (var0.field1411[var9].vmethod302((byte)63)) {
                        var0.field1423[(var0.field1419 += -2001112030) * 455837513 - 1] = var9;
                     } else {
                        var0.field1418[(var0.field1420 += -1946918159) * 741123794 - 1] = var9;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;)V")
   @ObfuscatedName("ak")
   final void method2998(PacketBuffer var1) {
      this.method3047((byte)-26);
      PacketBuffer.method12921(var1, (byte)73);
      int var2 = client.field845 * -2130951373;
      classDC var3 = this.field1411[var2];
      int var4 = PacketBuffer.method12923(var1, 30, -902348308);
      classDC.method2893(var3, -1, -387955630);
      var3.field1382.method6616(var4, (byte)34);
      var3.field1390 = 0;
      this.field1419 = 0;
      this.field1423[(this.field1419 += 1174445611) * -2087374717 - 1] = var2;
      this.field1420 = 0;

      for (int var5 = 1; var5 < -1229865211; var5++) {
         if (var2 != var5) {
            int var6 = PacketBuffer.method12923(var1, 18, 694404393);
            int var7 = var6 >> 16;
            int var8 = var6 >> 8 & 0xFF;
            int var9 = var6 & -260161175;
            classDC.method2893(this.field1411[var5], classKY.method6579(var7, var8, var9, -167100032), -387955630);
            this.field1418[(this.field1420 += 1203539982) * -392147439 - 1] = var5;
         }
      }

      PacketBuffer.method12926(var1, -2065401702);
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("hr")
   static void method3053(int var0, byte var1) {
      try {
         SequenceDefinition var2 = classQA.method9430(var0, 1151859829);
         if (!var2.method8768((byte)0)) {
            if (var1 == 0) {
               ;
            }
         } else {
            int var4 = 982132619 * var2.field5128;
            classSN var5 = classUG.method11321(var4, 54843502);
            byte var3;
            if (var5 == null) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               var3 = 2;
            } else {
               byte var10000;
               if (var5.method10543((byte)-25)) {
                  if (var1 != 0) {
                     throw new IllegalStateException();
                  }

                  var10000 = 0;
               } else {
                  var10000 = 1;
               }

               var3 = var10000;
            }

            if (var3 == 2) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               client.field928.add(982132619 * var2.field5128);
            }
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "df.hr(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)V")
   @ObfuscatedName("af")
   final void method2999(PacketBuffer var1, int var2) {
      try {
         this.method3047((byte)37);
         PacketBuffer.method12921(var1, (byte)106);
         int var3 = client.field845 * -2130951373;
         classDC var4 = this.field1411[var3];
         int var5 = PacketBuffer.method12923(var1, 30, 507360607);
         classDC.method2893(var4, -1, -387955630);
         var4.field1382.method6616(var5, (byte)46);
         var4.field1390 = 0;
         this.field1419 = 0;
         this.field1423[(this.field1419 += 1174445611) * -2087374717 - 1] = var3;
         this.field1420 = 0;

         for (int var6 = 1; var6 < 2048; var6++) {
            if (var2 != -2024723222) {
               throw new IllegalStateException();
            }

            if (var3 != var6) {
               int var7 = PacketBuffer.method12923(var1, 18, -876826065);
               int var8 = var7 >> 16;
               int var9 = var7 >> 8 & 0xFF;
               int var10 = var7 & 0xFF;
               classDC.method2893(this.field1411[var6], classKY.method6579(var8, var9, var10, 470006983), -387955630);
               this.field1418[(this.field1420 += -1946918159) * -392147439 - 1] = var6;
            }
         }

         PacketBuffer.method12926(var1, -2131718181);
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "df.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cu")
   int method3049(int var1) {
      for (int var2 = 0; var2 < this.field1419 * -2087374717; var2++) {
         if (this.field1423[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldf;)V")
   @ObfuscatedName("ro")
   public static void method3046(classDF var0) {
      if (var0 == null) {
         var0.method3048();
      }

      var0.field1419 = 0;

      for (int var1 = 0; var1 < 2048; var1++) {
         var0.field1411[var1].method2888((byte)2);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;I)V")
   @ObfuscatedName("ao")
   void method3028(WorldView var1, int var2) {
      try {
         for (int var3 = 0; var3 < -2087374717 * this.field1419; var3++) {
            if (var2 != -545217909) {
               throw new IllegalStateException();
            }

            int var4;
            classDC var5;
            Player var7;
            boolean var10000;
            label92: {
               var4 = this.field1423[var3];
               var5 = this.field1411[var4];
               classKY var6 = var5.field1382;
               var7 = (Player)var1.field1694.method13404(var4);
               if (var6.field4055 * 1870919123 > -1444178379 * var1.field1709) {
                  if (var2 != -545217909) {
                     throw new IllegalStateException();
                  }

                  if (819227381 * var6.field4056 > var1.field1708 * -351145363) {
                     if (var2 != -545217909) {
                        throw new IllegalStateException();
                     }

                     if (var6.field4055 * 1870919123 < var1.field1709 * -1444178379 + var1.field1696 * 1296729483
                        && var6.field4056 * 819227381 < -351145363 * var1.field1708 + var1.field1692 * -1269171107) {
                        if (var2 != -545217909) {
                           return;
                        }

                        var10000 = true;
                        break label92;
                     }
                  }
               }

               var10000 = false;
            }

            boolean var8 = var10000;
            if (-2130951373 * client.field845 == var4) {
               if (var2 != -545217909) {
                  throw new IllegalStateException();
               }

               if (var8 && 2140889407 * var1.field1699 != 0) {
                  if (var2 != -545217909) {
                     throw new IllegalStateException();
                  }

                  client.field846 = var1.field1699 * 1538034569;
               }
            }

            if (var8) {
               if (var2 != -545217909) {
                  return;
               }

               if (var7 == null) {
                  if (var2 != -545217909) {
                     throw new IllegalStateException();
                  }

                  var7 = var5.method2912(var4, var1, 844956059);
                  var5.method2900(var7, -2140743621);
                  IndexedObjectSet.method13392(var1.field1694, var7, var4);
                  continue;
               }
            }

            if (!var8) {
               if (var2 != -545217909) {
                  throw new IllegalStateException();
               }

               if (var7 != null) {
                  if (var2 != -545217909) {
                     throw new IllegalStateException();
                  }

                  classDC.method2905(var5, var7, (byte)4);
                  var7.method12005();
               }
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "df.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;IB)Z")
   @ObfuscatedName("ax")
   boolean method3017(PacketBuffer var1, int var2, byte var3) {
      try {
         classDC var4 = this.field1411[var2];
         int var5 = PacketBuffer.method12923(var1, 2, 142189890);
         if (0 == var5) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               if (PacketBuffer.method12923(var1, 1, 141540366) != 0) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  this.method3017(var1, var2, (byte)-41);
               }

               int var17 = PacketBuffer.method12923(var1, 13, 534680227);
               int var20 = PacketBuffer.method12923(var1, 13, 1255518308);
               boolean var10000;
               if (PacketBuffer.method12923(var1, 1, 1535870282) == 1) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var23 = var10000;
               if (var23) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  this.field1417[(this.field1413 += -2126160331) * -764574691 - 1] = var2;
               }

               if (var4.vmethod302((byte)80)) {
                  throw new RuntimeException();
               } else {
                  var4.method2915(var17, var20, -1611524916);
                  this.field1416[var2] = false;
                  return true;
               }
            }
         } else if (var5 == 1) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var16 = PacketBuffer.method12923(var1, 2, 1499016338);
               int var19 = var4.field1381 * -157772533;
               int var22 = classKY.method6582(var19, -505859136) + var16 & 3;
               var4.method2918(var22, -937611613);
               var4.field1381 = ((var22 << 28) + (var19 & 268435455)) * 1621593763;
               return false;
            }
         } else if (2 == var5) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var15 = PacketBuffer.method12923(var1, 5, -215102774);
               int var18 = var15 >> 3;
               int var21 = var15 & 7;
               int var24 = var4.field1381 * -157772533;
               int var25 = classKY.method6582(var24, -1126303099) + var18 & 3;
               int var26 = var24 >> 14 & 0xFF;
               int var27 = var24 & 0xFF;
               if (var21 == 0) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var26--;
                  var27--;
               }

               if (1 == var21) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var27--;
               }

               if (2 == var21) {
                  var26++;
                  var27--;
               }

               if (var21 == 3) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var26--;
               }

               if (4 == var21) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var26++;
               }

               if (5 == var21) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var26--;
                  var27++;
               }

               if (6 == var21) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var27++;
               }

               if (var21 == 7) {
                  if (var3 >= 1) {
                     throw new IllegalStateException();
                  }

                  var26++;
                  var27++;
               }

               var4.method2918(var25, -937611613);
               var4.field1381 = classKY.method6579(var25, var26, var27, 26202886) * 1621593763;
               return false;
            }
         } else {
            int var6 = PacketBuffer.method12923(var1, 18, -482688450);
            int var7 = var6 >> 16;
            int var8 = var6 >> 8 & 0xFF;
            int var9 = var6 & 0xFF;
            int var10 = var4.field1381 * -157772533;
            int var11 = classKY.method6582(var10, -1180194057) + var7 & 3;
            var4.method2918(var11, -937611613);
            int var12 = classKY.method6594(var10, (byte)-94) + var8 & 0xFF;
            int var13 = classKY.method6596(var10, -560268380) + var9 & 0xFF;
            var4.field1381 = classKY.method6579(var4.vmethod314(-1351382173), var12, var13, 1784284005) * 1621593763;
            return false;
         }
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "df.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ad")
   void method3019(byte var1) {
      try {
         for (int var2 = 0; var2 < -117780849 * this.field1421; var2++) {
            if (var1 != 13) {
               return;
            }

            int var3 = this.field1412[var2];
            classDC var4 = this.field1411[var3];
            Iterator var5 = client.field814.iterator();

            while (var5.hasNext()) {
               if (var1 != 13) {
                  throw new IllegalStateException();
               }

               WorldView var6 = (WorldView)var5.next();
               Player var7 = (Player)var6.field1694.method13404(var3);
               if (null != var7) {
                  if (var1 != 13) {
                     throw new IllegalStateException();
                  }

                  classDC.method2905(var4, var7, (byte)4);
                  var7.method12005();
               }
            }

            var4.method2907((byte)1);
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "df.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)V")
   @ObfuscatedName("xu")
   public void method3056(PacketBuffer var1, int var2) {
      Actor.field1483 = true;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   void method3022(int var1) {
      try {
         client.field846 = 0;
         Iterator var2 = client.field814.iterator();

         while (var2.hasNext()) {
            if (var1 <= 497808236) {
               return;
            }

            WorldView var3 = (WorldView)var2.next();
            this.method3028(var3, -545217909);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "df.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("be")
   void method3034() {
      for (int var1 = 0; var1 < this.field1419 * -1206972795; var1++) {
         int var2 = this.field1423[var1];
         if (this.field1416[var2]) {
            classDC var3 = this.field1411[var2];
            classDC.method2924(var3, this.field1422[var2], (byte)-115);
            this.field1416[var2] = false;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)V")
   @ObfuscatedName("al")
   void method3032(PacketBuffer var1, int var2) {
      try {
         for (int var3 = 0; var3 < this.field1413 * -764574691; var3++) {
            if (var2 >= 1251463235) {
               return;
            }

            int var4 = this.field1417[var3];
            int var5 = classXY.method13039(var1, -346779531);
            if ((var5 & 128) != 0) {
               var5 += classXY.method13039(var1, -346779531) << 8;
            }

            if (0 != (var5 & 8192)) {
               if (var2 >= 1251463235) {
                  throw new IllegalStateException();
               }

               var5 += classXY.method13039(var1, -346779531) << 16;
            }

            this.method3037(var1, var4, var5, -774455835);
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "df.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;II)V")
   @ObfuscatedName("bs")
   void method3036(PacketBuffer var1, int var2, int var3) {
      classDC var4 = this.field1411[var2];
      int var5 = Integer.MAX_VALUE;
      if ((var3 & 8) != 0) {
         var4.method2896(-1165124257);
      }

      if ((var3 & 2) != 0) {
         classXY.method13194(var1, -1242549664);
         classXY.method13039(var1, -346779531);
         var1.method13159((byte)-21);
         int var6 = var1.method13159((byte)-86);
         this.field1414.field6955 = 0;
         var1.method13084(this.field1414.field6954, 0, var6, (byte)111);
         this.field1414.field6955 = 0;
      }

      if ((var3 & 32) != 0) {
         int var16 = var1.method13159((byte)-32);

         for (int var7 = 0; var7 < var16; var7++) {
            int var8 = var1.method13164(-833660429);
            int var9 = classXY.method13194(var1, 1808170009);
            int var10 = var1.method13056((byte)1);
            boolean var11 = var1.method13165(-1353480015) == 1;
            var4.method2974(var8, var9, var10 >> 16, var10 & 65535, var11, 1476528617);
         }
      }

      if ((var3 & 4096) != 0) {
         int var17 = classXY.method13047(var1, -1519016485);
         int var30 = var17 >> 8;
         int var40 = var30 >= 13 && var30 <= 20 ? var30 - 12 : 0;
         classKL var49 = (classKL)classOF.method8404(classGH.method5431((byte)79), var1.method13159((byte)-2), 851433396);
         boolean var56 = var1.method13164(-1703256790) == 1;
         int var63 = var1.method13159((byte)-22);
         this.field1414.field6955 = 0;
         var1.method13255(this.field1414.field6954, 0, var63, 1726036428);
         this.field1414.field6955 = 0;
         String var12 = AbstractFont.method8(classJE.method6358(classND.method7818(this.field1414, 1593979022), (byte)-53));
         byte[] var13 = null;
         if (var40 > 0 && var40 <= 8) {
            var13 = new byte[var40];

            for (int var14 = 0; var14 < var40; var14++) {
               var13[var14] = var1.method13175((byte)-53);
            }
         }

         classDC.method2955(var4, var17, var49, var56, var12, var13, -1044209059);
      }

      if ((var3 & 131072) != 0) {
         int var18 = var1.method13165(-1612004748);
         if (var18 > 0) {
            for (int var31 = 0; var31 < var18; var31++) {
               int var41 = var1.method13094((short)10580);
               int var50 = var1.method13094((short)23288);
               if (32767 != var50) {
                  int var57 = var1.method13094((short)20860);
                  int var64 = classXY.method13039(var1, -346779531);
                  int var68 = var50 > 0 ? var1.method13164(-1830769282) : var64;
                  var4.method2947(var41, var50, var57, var64, var68, 1280731734);
               } else {
                  var4.method2950(var41, 2066731250);
               }
            }
         }
      }

      if ((var3 & 4) != 0) {
         int var19 = var1.method13165(-1912656576);
         byte[] var32 = new byte[var19];
         classXY var42 = new classXY(var32);
         var1.method13252(var32, 0, var19, -1366881648);
         var4.method2927(var42, 1555374895);
      }

      if (0 != (var3 & 262144)) {
         int var20 = classXY.method13197(var1, -491609919);
         if (65535 == var20) {
            var20 = -1;
         }

         int var33 = classXY.method13194(var1, 634982806);
         if (var33 == 65535) {
            var33 = -1;
         }

         boolean var43 = var1.method13164(-296469634) != 0;
         var4.method2978(var20, var33, var43, -1763088579);
      }

      if ((var3 & 64) != 0) {
         int var21 = classXY.method13039(var1, -346779531);
         var4.method2934(var21, var1, 1771013292);
      }

      if (0 != (var3 & 512)) {
         for (int var22 = 0; var22 < 3; var22++) {
            this.field1415[var22] = var1.method13071(1933602736);
         }

         var4.method2965(this.field1415, (byte)21);
      }

      if (0 != (var3 & 16384)) {
         var4.field1394 = (classGT)classOF.method8404(classDT.method3596(743332942), var1.method13179((byte)-4), 1150647597);
         if (Integer.MAX_VALUE == var5) {
            this.field1422[var2] = var4.field1394;
         }
      }

      if ((var3 & 2048) != 0) {
         byte var15 = var1.method13175((byte)-111);
         if (127 == var15) {
            this.field1422[var2] = classGT.field2678;
         } else {
            this.field1422[var2] = (classGT)classOF.method8404(classDT.method3596(1888426470), var15, -1001960712);
         }
      }

      if ((var3 & 524288) != 0) {
         int var23 = var1.method13165(-804141220);

         for (int var34 = 0; var34 < var23; var34++) {
            int var44 = var1.method13159((byte)-4);
            int var51 = classXY.method13194(var1, -1437556953);
            int var58 = var1.method13241(-2100807916);
            var4.method2974(var44, var51, var58 >> 16, var58 & 65535, false, 2039636010);
         }
      }

      if ((var3 & 65536) != 0) {
         int var24 = 1612595797 * client.field855 + var1.method13207((byte)65);
         int var35 = 1612595797 * client.field855 + var1.method13211(1722823915);
         byte var45 = var1.method13179((byte)10);
         byte var52 = var1.method13179((byte)-93);
         boolean var59 = var1.method13165(-1216698306) != 0;
         var4.method2970(client.field855 * 1612595797, var24, var35, var45, var52, var59, (byte)0);
      }

      if (0 != (var3 & 1048576)) {
         int var25 = classXY.method13039(var1, -346779531);
         if (var25 > 0) {
            for (int var36 = 0; var36 < var25; var36++) {
               int var46 = var1.method13094((short)11096);
               int var53 = var1.method13094((short)3875);
               int var60 = var1.method13094((short)6155);
               int var65 = var1.method13094((short)30517);
               var4.method2942(var46, var53, var60, var65, (byte)-124);
            }
         }
      }

      if ((var3 & 32768) != 0) {
         byte var26 = classXY.method13043(var1, (byte)17);
         byte var37 = var1.method13179((byte)73);
         byte var47 = classXY.method13043(var1, (byte)17);
         byte var54 = classXY.method13043(var1, (byte)17);
         int var61 = var1.method13198(-1303340196) + client.field855 * 1612595797;
         int var66 = var1.method13198(-985859801) + 1612595797 * client.field855;
         int var69 = var1.method13198(-2052335553);
         var4.method2959(var26, var37, var47, var54, var61, var66, var69, -862037961);
         this.field1416[var2] = false;
      }

      if ((var3 & 16) != 0) {
         int var27 = var1.method13198(149425794);
         if (65535 == var27) {
            var27 = -1;
         }

         int var38 = var1.method13159((byte)-122);
         classDC.method2932(var4, var27, var38, 962987352);
      }

      if ((var3 & 1024) != 0) {
         int var28 = client.field855 * 1612595797 + var1.method13202((byte)81);
         int var39 = 1612595797 * client.field855 + var1.method13211(1589423145);
         byte var48 = var1.method13175((byte)-41);
         byte var55 = classXY.method13169(var1, (byte)120);
         byte var62 = classXY.method13043(var1, (byte)17);
         byte var67 = (byte)var1.method13159((byte)-126);
         var4.method2968(var28, var39, var48, var55, var62, var67, 2046930437);
      }

      if ((var3 & 8) != 0) {
         var1.method13164(-806798542);
      }

      if ((var3 & 1) != 0) {
         String var29 = var1.method13071(-475935875);
         var4.method2940(var29, 1109176665);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lct;)V")
   @ObfuscatedName("xi")
   public void method3055(Player var1) {
      if (var1 != null) {
         classOE.field4843.getCallbacks().post(new PlayerDespawned(var1));
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ac")
   void method3047(byte var1) {
      try {
         this.field1419 = 0;

         for (int var2 = 0; var2 < 2048; var2++) {
            if (var1 == 2) {
               throw new IllegalStateException();
            }

            this.field1411[var2].method2888((byte)2);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "df.ad(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lsj;")
   @ObfuscatedName("au")
   classSJ method2995(int var1) {
      return var1 >= 0 && var1 < this.field1411.length ? this.field1411[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(Lxs;III)V")
   @ObfuscatedName("ay")
   void method3037(PacketBuffer var1, int var2, int var3, int var4) {
      try {
         classDC var5 = this.field1411[var2];
         int var6 = Integer.MAX_VALUE;
         if ((var3 & 8) != 0) {
            if (var4 != -774455835) {
               throw new IllegalStateException();
            }

            var5.method2896(-927351339);
         }

         if ((var3 & 2) != 0) {
            if (var4 != -774455835) {
               throw new IllegalStateException();
            }

            classXY.method13194(var1, 673858310);
            classXY.method13039(var1, -346779531);
            var1.method13159((byte)-83);
            int var7 = var1.method13159((byte)-56);
            this.field1414.field6955 = 0;
            var1.method13084(this.field1414.field6954, 0, var7, (byte)28);
            this.field1414.field6955 = 0;
         }

         if ((var3 & 32) != 0) {
            if (var4 != -774455835) {
               throw new IllegalStateException();
            }

            int var18 = var1.method13159((byte)-6);

            for (int var8 = 0; var8 < var18; var8++) {
               if (var4 != -774455835) {
                  throw new IllegalStateException();
               }

               int var9 = var1.method13164(-726513862);
               int var10 = classXY.method13194(var1, 358439582);
               int var11 = var1.method13056((byte)1);
               boolean var10000;
               if (var1.method13165(-1872786517) == 1) {
                  if (var4 != -774455835) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var12 = var10000;
               var5.method2974(var9, var10, var11 >> 16, var11 & 65535, var12, 1590387661);
            }
         }

         if ((var3 & 4096) != 0) {
            if (var4 != -774455835) {
               throw new IllegalStateException();
            }

            int var19 = classXY.method13047(var1, -1252432806);
            int var32 = var19 >> 8;
            int var42 = var32 >= 13 && var32 <= 20 ? var32 - 12 : 0;
            classKL var51 = (classKL)classOF.method8404(classGH.method5431((byte)63), var1.method13159((byte)-120), -794787568);
            boolean var72;
            if (var1.method13164(-670187189) == 1) {
               if (var4 != -774455835) {
                  return;
               }

               var72 = true;
            } else {
               var72 = false;
            }

            boolean var58 = var72;
            int var65 = var1.method13159((byte)-122);
            this.field1414.field6955 = 0;
            var1.method13255(this.field1414.field6954, 0, var65, 2020962747);
            this.field1414.field6955 = 0;
            String var13 = AbstractFont.method8(classJE.method6358(classND.method7818(this.field1414, 2085654973), (byte)-41));
            byte[] var14 = null;
            if (var42 > 0) {
               if (var4 != -774455835) {
                  throw new IllegalStateException();
               }

               if (var42 <= 8) {
                  var14 = new byte[var42];

                  for (int var15 = 0; var15 < var42; var15++) {
                     if (var4 != -774455835) {
                        throw new IllegalStateException();
                     }

                     var14[var15] = var1.method13175((byte)-8);
                  }
               }
            }

            classDC.method2955(var5, var19, var51, var58, var13, var14, -1905738312);
         }

         if ((var3 & 131072) != 0) {
            int var20 = var1.method13165(-1389774437);
            if (var20 > 0) {
               if (var4 != -774455835) {
                  throw new IllegalStateException();
               }

               for (int var33 = 0; var33 < var20; var33++) {
                  if (var4 != -774455835) {
                     throw new IllegalStateException();
                  }

                  int var43 = var1.method13094((short)28054);
                  int var52 = var1.method13094((short)17028);
                  if (32767 != var52) {
                     if (var4 != -774455835) {
                        throw new IllegalStateException();
                     }

                     int var59 = var1.method13094((short)20431);
                     int var66 = classXY.method13039(var1, -346779531);
                     int var73;
                     if (var52 > 0) {
                        if (var4 != -774455835) {
                           throw new IllegalStateException();
                        }

                        var73 = var1.method13164(-278514219);
                     } else {
                        var73 = var66;
                     }

                     int var70 = var73;
                     var5.method2947(var43, var52, var59, var66, var70, 999731735);
                  } else {
                     var5.method2950(var43, 1606248302);
                  }
               }
            }
         }

         if ((var3 & 4) != 0) {
            int var21 = var1.method13165(-1555052299);
            byte[] var34 = new byte[var21];
            classXY var44 = new classXY(var34);
            var1.method13252(var34, 0, var21, -1366881648);
            var5.method2927(var44, 1555374895);
         }

         if (0 != (var3 & 262144)) {
            if (var4 != -774455835) {
               return;
            }

            int var22 = classXY.method13197(var1, 1154591916);
            if (65535 == var22) {
               if (var4 != -774455835) {
                  throw new IllegalStateException();
               }

               var22 = -1;
            }

            int var35 = classXY.method13194(var1, -453141936);
            if (var35 == 65535) {
               if (var4 != -774455835) {
                  throw new IllegalStateException();
               }

               var35 = -1;
            }

            boolean var74;
            if (var1.method13164(-201591331) != 0) {
               if (var4 != -774455835) {
                  throw new IllegalStateException();
               }

               var74 = true;
            } else {
               var74 = false;
            }

            boolean var45 = var74;
            var5.method2978(var22, var35, var45, 883165830);
         }

         if ((var3 & 64) != 0) {
            if (var4 != -774455835) {
               throw new IllegalStateException();
            }

            int var23 = classXY.method13039(var1, -346779531);
            var5.method2934(var23, var1, -1133484209);
         }

         if (0 != (var3 & 512)) {
            if (var4 != -774455835) {
               return;
            }

            for (int var24 = 0; var24 < 3; var24++) {
               if (var4 != -774455835) {
                  return;
               }

               this.field1415[var24] = var1.method13071(-781967000);
            }

            var5.method2965(this.field1415, (byte)28);
         }

         if (0 != (var3 & 16384)) {
            var5.field1394 = (classGT)classOF.method8404(classDT.method3596(1702371013), var1.method13179((byte)2), -1840657991);
            if (Integer.MAX_VALUE == var6) {
               if (var4 != -774455835) {
                  throw new IllegalStateException();
               }

               this.field1422[var2] = var5.field1394;
            }
         }

         if ((var3 & 2048) != 0) {
            if (var4 != -774455835) {
               throw new IllegalStateException();
            }

            byte var17 = var1.method13175((byte)-71);
            if (127 == var17) {
               this.field1422[var2] = classGT.field2678;
            } else {
               this.field1422[var2] = (classGT)classOF.method8404(classDT.method3596(1919172392), var17, -897463770);
            }
         }

         if ((var3 & 524288) != 0) {
            if (var4 != -774455835) {
               return;
            }

            int var25 = var1.method13165(-1337494162);

            for (int var36 = 0; var36 < var25; var36++) {
               if (var4 != -774455835) {
                  throw new IllegalStateException();
               }

               int var46 = var1.method13159((byte)-126);
               int var53 = classXY.method13194(var1, 825001690);
               int var60 = var1.method13241(-2100807916);
               var5.method2974(var46, var53, var60 >> 16, var60 & 65535, false, 1963548899);
            }
         }

         if ((var3 & 65536) != 0) {
            if (var4 != -774455835) {
               return;
            }

            int var26 = 1612595797 * client.field855 + var1.method13207((byte)104);
            int var37 = 1612595797 * client.field855 + var1.method13211(1156605391);
            byte var47 = var1.method13179((byte)16);
            byte var54 = var1.method13179((byte)-17);
            boolean var75;
            if (var1.method13165(-1695361153) != 0) {
               if (var4 != -774455835) {
                  return;
               }

               var75 = true;
            } else {
               var75 = false;
            }

            boolean var61 = var75;
            var5.method2970(client.field855 * 1612595797, var26, var37, var47, var54, var61, (byte)0);
         }

         if (0 != (var3 & 1048576)) {
            if (var4 != -774455835) {
               throw new IllegalStateException();
            }

            int var27 = classXY.method13039(var1, -346779531);
            if (var27 > 0) {
               if (var4 != -774455835) {
                  throw new IllegalStateException();
               }

               for (int var38 = 0; var38 < var27; var38++) {
                  if (var4 != -774455835) {
                     throw new IllegalStateException();
                  }

                  int var48 = var1.method13094((short)7893);
                  int var55 = var1.method13094((short)31317);
                  int var62 = var1.method13094((short)26972);
                  int var67 = var1.method13094((short)8133);
                  var5.method2942(var48, var55, var62, var67, (byte)-27);
               }
            }
         }

         if ((var3 & 32768) != 0) {
            if (var4 != -774455835) {
               throw new IllegalStateException();
            }

            byte var28 = classXY.method13043(var1, (byte)17);
            byte var39 = var1.method13179((byte)-17);
            byte var49 = classXY.method13043(var1, (byte)17);
            byte var56 = classXY.method13043(var1, (byte)17);
            int var63 = var1.method13198(-1094498700) + client.field855 * 1612595797;
            int var68 = var1.method13198(-741160589) + 1612595797 * client.field855;
            int var71 = var1.method13198(-519129264);
            var5.method2959(var28, var39, var49, var56, var63, var68, var71, -1623075505);
            this.field1416[var2] = false;
         }

         if ((var3 & 16) != 0) {
            if (var4 != -774455835) {
               throw new IllegalStateException();
            }

            int var29 = var1.method13198(-1990383383);
            if (65535 == var29) {
               if (var4 != -774455835) {
                  throw new IllegalStateException();
               }

               var29 = -1;
            }

            int var40 = var1.method13159((byte)-123);
            classDC.method2932(var5, var29, var40, 957188288);
         }

         if ((var3 & 1024) != 0) {
            if (var4 != -774455835) {
               throw new IllegalStateException();
            }

            int var30 = client.field855 * 1612595797 + var1.method13202((byte)49);
            int var41 = 1612595797 * client.field855 + var1.method13211(2013971809);
            byte var50 = var1.method13175((byte)-84);
            byte var57 = classXY.method13169(var1, (byte)29);
            byte var64 = classXY.method13043(var1, (byte)17);
            byte var69 = (byte)var1.method13159((byte)-43);
            var5.method2968(var30, var41, var50, var57, var64, var69, 2132881070);
         }

         if ((var3 & 8) != 0) {
            var1.method13164(-1829031614);
         }

         if ((var3 & 1) != 0) {
            if (var4 != -774455835) {
               throw new IllegalStateException();
            }

            String var31 = var1.method13071(-448155793);
            var5.method2940(var31, -758505959);
         }
      } catch (RuntimeException var16) {
         throw classEG.method3884(var16, "df.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;)V")
   @ObfuscatedName("aw")
   final void method3000(PacketBuffer var1) {
      this.method3047((byte)61);
      PacketBuffer.method12921(var1, (byte)25);
      int var2 = client.field845 * -2130951373;
      classDC var3 = this.field1411[var2];
      int var4 = PacketBuffer.method12923(var1, 30, 1113671095);
      classDC.method2893(var3, -1, -387955630);
      var3.field1382.method6616(var4, (byte)81);
      var3.field1390 = 0;
      this.field1419 = 0;
      this.field1423[(this.field1419 += 1174445611) * -2087374717 - 1] = var2;
      this.field1420 = 0;

      for (int var5 = 1; var5 < 2048; var5++) {
         if (var2 != var5) {
            int var6 = PacketBuffer.method12923(var1, 18, -164466485);
            int var7 = var6 >> 16;
            int var8 = var6 >> 8 & 0xFF;
            int var9 = var6 & 0xFF;
            classDC.method2893(this.field1411[var5], classKY.method6579(var7, var8, var9, 88003733), -387955630);
            this.field1418[(this.field1420 += -1946918159) * -392147439 - 1] = var5;
         }
      }

      PacketBuffer.method12926(var1, -2044633650);
   }

   classDF() {
      this.field1414 = new classXY(new byte[5000]);
      this.field1415 = new String[3];
      this.field1418 = new int[2048];
      this.field1412 = new int[2048];
      this.field1417 = new int[2048];
      this.field1419 = 0;
      this.field1420 = 0;
      this.field1421 = 0;
      this.field1413 = 0;

      for (int var1 = 0; var1 < 2048; var1++) {
         this.field1411[var1] = new classDC(var1);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldf;Lct;I)V")
   @ObfuscatedName("lj")
   public static void method3041(classDF var0, Player var1, int var2) {
      if (var0 == null) {
         var0.method3045(var1, var2);
      }

      var0.method3055(var1);

      try {
         if (var1 == null) {
            if (var2 >= 344844140) {
               throw new IllegalStateException();
            }
         } else {
            classDC.method2905(var0.field1411[-1315528093 * var1.field1480], var1, (byte)4);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "df.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)V")
   @ObfuscatedName("at")
   final void method3001(PacketBuffer var1, int var2) {
      int var3 = 702114061 * var1.field6955;
      this.field1413 = 0;
      method3008(this, var1, 448842070);
      this.method3019((byte)13);
      this.method3022(641325203);
      this.method3032(var1, -1802336965);
      method3035(this, -2027326321);
      if (702114061 * var1.field6955 - var3 != var2) {
         throw new RuntimeException(832602734 * var1.field6955 - var3 + " " + var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lsj;")
   @ObfuscatedName("az")
   classSJ method2996(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 >= -88827727) {
               throw new IllegalStateException();
            }

            if (var1 < this.field1411.length) {
               return this.field1411[var1];
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "df.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;)V")
   @ObfuscatedName("ah")
   void method3006(PacketBuffer var1) {
      this.field1421 = 0;
      int var2 = 0;
      PacketBuffer.method12921(var1, (byte)11);

      for (int var3 = 0; var3 < -2087374717 * this.field1419; var3++) {
         int var4 = this.field1423[var3];
         if (0 == (this.field1411[var4].field1390 & 1)) {
            if (var2 > 0) {
               var2--;
               this.field1411[var4].field1390 = (byte)(this.field1411[var4].field1390 | 2);
            } else {
               int var5 = PacketBuffer.method12923(var1, 1, -696129177);
               if (0 == var5) {
                  var2 = method3009(this, var1, -1784132642);
                  this.field1411[var4].field1390 = (byte)(this.field1411[var4].field1390 | 2);
               } else {
                  method3015(this, var1, var4, (byte)-16);
               }
            }
         }
      }

      PacketBuffer.method12926(var1, -2073075344);
      if (0 != var2) {
         throw new RuntimeException();
      } else {
         PacketBuffer.method12921(var1, (byte)44);

         for (int var6 = 0; var6 < this.field1419 * -2087374717; var6++) {
            int var10 = this.field1423[var6];
            if (0 != (this.field1411[var10].field1390 & 1)) {
               if (var2 > 0) {
                  var2--;
                  this.field1411[var10].field1390 = (byte)(this.field1411[var10].field1390 | 2);
               } else {
                  int var13 = PacketBuffer.method12923(var1, 1, 1726458331);
                  if (0 == var13) {
                     var2 = method3009(this, var1, -1609364863);
                     this.field1411[var10].field1390 = (byte)(this.field1411[var10].field1390 | 2);
                  } else {
                     method3015(this, var1, var10, (byte)-63);
                  }
               }
            }
         }

         PacketBuffer.method12926(var1, -2014856266);
         if (0 != var2) {
            throw new RuntimeException();
         } else {
            PacketBuffer.method12921(var1, (byte)56);

            for (int var7 = 0; var7 < -392147439 * this.field1420; var7++) {
               int var11 = this.field1418[var7];
               if ((this.field1411[var11].field1390 & 1) != 0) {
                  if (var2 > 0) {
                     var2--;
                     this.field1411[var11].field1390 = (byte)(this.field1411[var11].field1390 | 2);
                  } else {
                     int var14 = PacketBuffer.method12923(var1, 1, 1267311306);
                     if (0 == var14) {
                        var2 = method3009(this, var1, -1180137408);
                        this.field1411[var11].field1390 = (byte)(this.field1411[var11].field1390 | 2);
                     } else if (this.method3017(var1, var11, (byte)-119)) {
                        this.field1411[var11].field1390 = (byte)(this.field1411[var11].field1390 | 2);
                     }
                  }
               }
            }

            PacketBuffer.method12926(var1, -2049945442);
            if (0 != var2) {
               throw new RuntimeException();
            } else {
               PacketBuffer.method12921(var1, (byte)7);

               for (int var8 = 0; var8 < -392147439 * this.field1420; var8++) {
                  int var12 = this.field1418[var8];
                  if ((this.field1411[var12].field1390 & 1) == 0) {
                     if (var2 > 0) {
                        var2--;
                        this.field1411[var12].field1390 = (byte)(this.field1411[var12].field1390 | 2);
                     } else {
                        int var15 = PacketBuffer.method12923(var1, 1, 1322352265);
                        if (0 == var15) {
                           var2 = method3009(this, var1, -905868316);
                           this.field1411[var12].field1390 = (byte)(this.field1411[var12].field1390 | 2);
                        } else if (this.method3017(var1, var12, (byte)-73)) {
                           this.field1411[var12].field1390 = (byte)(this.field1411[var12].field1390 | 2);
                        }
                     }
                  }
               }

               PacketBuffer.method12926(var1, -2105646061);
               if (var2 != 0) {
                  throw new RuntimeException();
               } else {
                  this.field1419 = 0;
                  this.field1420 = 0;

                  for (int var9 = 1; var9 < 2048; var9++) {
                     this.field1411[var9].field1390 = (byte)(this.field1411[var9].field1390 >> 1);
                     if (this.field1411[var9].vmethod302((byte)26)) {
                        this.field1423[(this.field1419 += 1174445611) * -2087374717 - 1] = var9;
                     } else {
                        this.field1418[(this.field1420 += -1946918159) * -392147439 - 1] = var9;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lsj;")
   @ObfuscatedName("ai")
   classSJ method2997(int var1) {
      return var1 >= 0 && var1 < this.field1411.length ? this.field1411[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "(Lct;)V")
   @ObfuscatedName("bl")
   void method3042(Player var1) {
      if (var1 != null) {
         classDC.method2905(this.field1411[-1315528093 * var1.field1480], var1, (byte)4);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bg")
   void method3023() {
      client.field846 = 0;

      for (WorldView var2 : client.field814) {
         this.method3028(var2, -545217909);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)Z")
   @ObfuscatedName("br")
   boolean method3018(PacketBuffer var1, int var2) {
      classDC var3 = this.field1411[var2];
      int var4 = PacketBuffer.method12923(var1, 2, -593790965);
      if (0 == var4) {
         if (PacketBuffer.method12923(var1, 1, 309772517) != 0) {
            this.method3017(var1, var2, (byte)-119);
         }

         int var15 = PacketBuffer.method12923(var1, 13, 1553307871);
         int var18 = PacketBuffer.method12923(var1, 13, -636824328);
         boolean var21 = PacketBuffer.method12923(var1, 1, 1450494940) == 1;
         if (var21) {
            this.field1417[(this.field1413 += -2126160331) * -764574691 - 1] = var2;
         }

         if (var3.vmethod302((byte)74)) {
            throw new RuntimeException();
         } else {
            var3.method2915(var15, var18, -906892659);
            this.field1416[var2] = false;
            return true;
         }
      } else if (var4 == 1) {
         int var14 = PacketBuffer.method12923(var1, 2, 359155538);
         int var17 = var3.field1381 * -157772533;
         int var20 = classKY.method6582(var17, -1577580188) + var14 & 3;
         var3.method2918(var20, -937611613);
         var3.field1381 = ((var20 << 28) + (var17 & 268435455)) * 1621593763;
         return false;
      } else if (2 == var4) {
         int var13 = PacketBuffer.method12923(var1, 5, 240078741);
         int var16 = var13 >> 3;
         int var19 = var13 & 7;
         int var22 = var3.field1381 * -157772533;
         int var23 = classKY.method6582(var22, -1152951012) + var16 & 3;
         int var24 = var22 >> 14 & 0xFF;
         int var25 = var22 & 0xFF;
         if (var19 == 0) {
            var24--;
            var25--;
         }

         if (1 == var19) {
            var25--;
         }

         if (2 == var19) {
            var24++;
            var25--;
         }

         if (var19 == 3) {
            var24--;
         }

         if (4 == var19) {
            var24++;
         }

         if (5 == var19) {
            var24--;
            var25++;
         }

         if (6 == var19) {
            var25++;
         }

         if (var19 == 7) {
            var24++;
            var25++;
         }

         var3.method2918(var23, -937611613);
         var3.field1381 = classKY.method6579(var23, var24, var25, 593708063) * 1621593763;
         return false;
      } else {
         int var5 = PacketBuffer.method12923(var1, 18, 16412291);
         int var6 = var5 >> 16;
         int var7 = var5 >> 8 & 0xFF;
         int var8 = var5 & 0xFF;
         int var9 = var3.field1381 * -157772533;
         int var10 = classKY.method6582(var9, -941387241) + var6 & 3;
         var3.method2918(var10, -937611613);
         int var11 = classKY.method6594(var9, (byte)-13) + var7 & 0xFF;
         int var12 = classKY.method6596(var9, -560268380) + var8 & 0xFF;
         var3.field1381 = classKY.method6579(var3.vmethod314(-1351382173), var11, var12, 1180221338) * 1621593763;
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bm")
   void method3020() {
      for (int var1 = 0; var1 < -117780849 * this.field1421; var1++) {
         int var2 = this.field1412[var1];
         classDC var3 = this.field1411[var2];

         for (WorldView var5 : client.field814) {
            Player var6 = (Player)var5.field1694.method13404(var2);
            if (null != var6) {
               classDC.method2905(var3, var6, (byte)4);
               var6.method12005();
            }
         }

         var3.method2907((byte)1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldf;Lxs;)V")
   @ObfuscatedName("ng")
   public static void method3007(classDF var0, PacketBuffer var1) {
      if (var0 == null) {
         var0.method3024();
      } else {
         var0.field1421 = 0;
         int var2 = 0;
         PacketBuffer.method12921(var1, (byte)103);

         for (int var3 = 0; var3 < -2087374717 * var0.field1419; var3++) {
            int var4 = var0.field1423[var3];
            if (0 == (var0.field1411[var4].field1390 & 1)) {
               if (var2 > 0) {
                  var2--;
                  var0.field1411[var4].field1390 = (byte)(var0.field1411[var4].field1390 | 2);
               } else {
                  int var5 = PacketBuffer.method12923(var1, 1, 257954179);
                  if (0 == var5) {
                     var2 = method3009(var0, var1, 1445528931);
                     var0.field1411[var4].field1390 = (byte)(var0.field1411[var4].field1390 | 2);
                  } else {
                     method3015(var0, var1, var4, (byte)-5);
                  }
               }
            }
         }

         PacketBuffer.method12926(var1, -2076567891);
         if (0 != var2) {
            throw new RuntimeException();
         } else {
            PacketBuffer.method12921(var1, (byte)15);

            for (int var6 = 0; var6 < var0.field1419 * -2087374717; var6++) {
               int var10 = var0.field1423[var6];
               if (0 != (var0.field1411[var10].field1390 & 1)) {
                  if (var2 > 0) {
                     var2--;
                     var0.field1411[var10].field1390 = (byte)(var0.field1411[var10].field1390 | 2);
                  } else {
                     int var13 = PacketBuffer.method12923(var1, 1, 1860421692);
                     if (0 == var13) {
                        var2 = method3009(var0, var1, 44521456);
                        var0.field1411[var10].field1390 = (byte)(var0.field1411[var10].field1390 | 2);
                     } else {
                        method3015(var0, var1, var10, (byte)-55);
                     }
                  }
               }
            }

            PacketBuffer.method12926(var1, -2061190182);
            if (0 != var2) {
               throw new RuntimeException();
            } else {
               PacketBuffer.method12921(var1, (byte)47);

               for (int var7 = 0; var7 < -392147439 * var0.field1420; var7++) {
                  int var11 = var0.field1418[var7];
                  if ((var0.field1411[var11].field1390 & 1) != 0) {
                     if (var2 > 0) {
                        var2--;
                        var0.field1411[var11].field1390 = (byte)(var0.field1411[var11].field1390 | 2);
                     } else {
                        int var14 = PacketBuffer.method12923(var1, 1, 764267746);
                        if (0 == var14) {
                           var2 = method3009(var0, var1, 1543956604);
                           var0.field1411[var11].field1390 = (byte)(var0.field1411[var11].field1390 | 2);
                        } else if (var0.method3017(var1, var11, (byte)-13)) {
                           var0.field1411[var11].field1390 = (byte)(var0.field1411[var11].field1390 | 2);
                        }
                     }
                  }
               }

               PacketBuffer.method12926(var1, -2071313335);
               if (0 != var2) {
                  throw new RuntimeException();
               } else {
                  PacketBuffer.method12921(var1, (byte)19);

                  for (int var8 = 0; var8 < -392147439 * var0.field1420; var8++) {
                     int var12 = var0.field1418[var8];
                     if ((var0.field1411[var12].field1390 & 1) == 0) {
                        if (var2 > 0) {
                           var2--;
                           var0.field1411[var12].field1390 = (byte)(var0.field1411[var12].field1390 | 2);
                        } else {
                           int var15 = PacketBuffer.method12923(var1, 1, 1017593654);
                           if (0 == var15) {
                              var2 = method3009(var0, var1, 462086034);
                              var0.field1411[var12].field1390 = (byte)(var0.field1411[var12].field1390 | 2);
                           } else if (var0.method3017(var1, var12, (byte)-48)) {
                              var0.field1411[var12].field1390 = (byte)(var0.field1411[var12].field1390 | 2);
                           }
                        }
                     }
                  }

                  PacketBuffer.method12926(var1, -1991036730);
                  if (var2 != 0) {
                     throw new RuntimeException();
                  } else {
                     var0.field1419 = 0;
                     var0.field1420 = 0;

                     for (int var9 = 1; var9 < 2048; var9++) {
                        var0.field1411[var9].field1390 = (byte)(var0.field1411[var9].field1390 >> 1);
                        if (var0.field1411[var9].vmethod302((byte)23)) {
                           var0.field1423[(var0.field1419 += 1174445611) * -2087374717 - 1] = var9;
                        } else {
                           var0.field1418[(var0.field1420 += -1946918159) * -392147439 - 1] = var9;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bt")
   void method3021() {
      for (int var1 = 0; var1 < -117780849 * this.field1421; var1++) {
         int var2 = this.field1412[var1];
         classDC var3 = this.field1411[var2];

         for (WorldView var5 : client.field814) {
            Player var6 = (Player)var5.field1694.method13404(var2);
            if (null != var6) {
               classDC.method2905(var3, var6, (byte)4);
               var6.method12005();
            }
         }

         var3.method2907((byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   void method3024() {
      client.field846 = 0;

      for (WorldView var2 : client.field814) {
         this.method3028(var2, -545217909);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   void method3025() {
      client.field846 = 0;

      for (WorldView var2 : client.field814) {
         this.method3028(var2, -545217909);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;)V")
   @ObfuscatedName("bu")
   void method3029(WorldView var1) {
      for (int var2 = 0; var2 < -2087374717 * this.field1419; var2++) {
         int var3 = this.field1423[var2];
         classDC var4 = this.field1411[var3];
         classKY var5 = var4.field1382;
         Player var6 = (Player)var1.field1694.method13404(var3);
         boolean var7 = var5.field4055 * -1823276395 > -1570159775 * var1.field1709
            && 819227381 * var5.field4056 > var1.field1708 * -351145363
            && var5.field4055 * -1444830242 < var1.field1709 * -1351998292 + var1.field1696 * 505364302
            && var5.field4056 * 819227381 < 577490025 * var1.field1708 + var1.field1692 * -1269171107;
         if (-2130951373 * client.field845 == var3 && var7 && 1930276999 * var1.field1699 != 0) {
            client.field846 = var1.field1699 * 1538034569;
         }

         if (var7 && var6 == null) {
            var6 = var4.method2912(var3, var1, 844956059);
            var4.method2900(var6, -2147116812);
            IndexedObjectSet.method13392(var1.field1694, var6, var3);
         } else if (!var7 && var6 != null) {
            classDC.method2905(var4, var6, (byte)4);
            var6.method12005();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldf;Lxs;I)I")
   @ObfuscatedName("uu")
   public static int method3009(classDF var0, PacketBuffer var1, int var2) {
      if (var0 == null) {
         return var0.method3012(var1, var2);
      } else {
         try {
            int var3 = PacketBuffer.method12923(var1, 2, -566844910);
            int var4;
            if (0 == var3) {
               if (var2 == 825241857) {
                  throw new IllegalStateException();
               }

               var4 = 0;
            } else if (1 == var3) {
               var4 = PacketBuffer.method12923(var1, 5, 1966523972);
            } else if (var3 == 2) {
               if (var2 == 825241857) {
                  throw new IllegalStateException();
               }

               var4 = PacketBuffer.method12923(var1, 8, 1770189469);
            } else {
               var4 = PacketBuffer.method12923(var1, 11, -276199589);
            }

            return var4;
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "df.ag(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;)I")
   @ObfuscatedName("bp")
   int method3010(PacketBuffer var1) {
      int var2 = PacketBuffer.method12923(var1, 2, 1090199453);
      int var3;
      if (0 == var2) {
         var3 = 0;
      } else if (1 == var2) {
         var3 = PacketBuffer.method12923(var1, 5, 842667183);
      } else if (var2 == 2) {
         var3 = PacketBuffer.method12923(var1, 8, 1302897533);
      } else {
         var3 = PacketBuffer.method12923(var1, 11, 1501356260);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;)V")
   @ObfuscatedName("bw")
   void method3030(WorldView var1) {
      for (int var2 = 0; var2 < -2087374717 * this.field1419; var2++) {
         int var3 = this.field1423[var2];
         classDC var4 = this.field1411[var3];
         classKY var5 = var4.field1382;
         Player var6 = (Player)var1.field1694.method13404(var3);
         boolean var7 = var5.field4055 * 1870919123 > -1444178379 * var1.field1709
            && 819227381 * var5.field4056 > var1.field1708 * -351145363
            && var5.field4055 * 1870919123 < var1.field1709 * -1444178379 + var1.field1696 * 1296729483
            && var5.field4056 * 819227381 < -351145363 * var1.field1708 + var1.field1692 * -1269171107;
         if (-2130951373 * client.field845 == var3 && var7 && 2140889407 * var1.field1699 != 0) {
            client.field846 = var1.field1699 * 1538034569;
         }

         if (var7 && var6 == null) {
            var6 = var4.method2912(var3, var1, 844956059);
            var4.method2900(var6, -2142518613);
            IndexedObjectSet.method13392(var1.field1694, var6, var3);
         } else if (!var7 && var6 != null) {
            classDC.method2905(var4, var6, (byte)4);
            var6.method12005();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;)V")
   @ObfuscatedName("bb")
   void method3031(WorldView var1) {
      for (int var2 = 0; var2 < -2087374717 * this.field1419; var2++) {
         int var3 = this.field1423[var2];
         classDC var4 = this.field1411[var3];
         classKY var5 = var4.field1382;
         Player var6 = (Player)var1.field1694.method13404(var3);
         boolean var7 = var5.field4055 * 1870919123 > -1444178379 * var1.field1709
            && 819227381 * var5.field4056 > var1.field1708 * -351145363
            && var5.field4055 * 1870919123 < var1.field1709 * -1444178379 + var1.field1696 * 1296729483
            && var5.field4056 * 819227381 < -351145363 * var1.field1708 + var1.field1692 * -1269171107;
         if (-2130951373 * client.field845 == var3 && var7 && 2140889407 * var1.field1699 != 0) {
            client.field846 = var1.field1699 * 1538034569;
         }

         if (var7 && var6 == null) {
            var6 = var4.method2912(var3, var1, 844956059);
            var4.method2900(var6, -2138571799);
            IndexedObjectSet.method13392(var1.field1694, var6, var3);
         } else if (!var7 && var6 != null) {
            classDC.method2905(var4, var6, (byte)4);
            var6.method12005();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;II)V")
   @ObfuscatedName("by")
   void method3038(PacketBuffer var1, int var2, int var3) {
      classDC var4 = this.field1411[var2];
      int var5 = -922988928;
      if ((var3 & 8) != 0) {
         var4.method2896(-1871868670);
      }

      if ((var3 & 2) != 0) {
         classXY.method13194(var1, 1507836287);
         classXY.method13039(var1, -346779531);
         var1.method13159((byte)-101);
         int var6 = var1.method13159((byte)-67);
         this.field1414.field6955 = 0;
         var1.method13084(this.field1414.field6954, 0, var6, (byte)96);
         this.field1414.field6955 = 0;
      }

      if ((var3 & 32) != 0) {
         int var16 = var1.method13159((byte)-55);

         for (int var7 = 0; var7 < var16; var7++) {
            int var8 = var1.method13164(-445396719);
            int var9 = classXY.method13194(var1, -1704471726);
            int var10 = var1.method13056((byte)1);
            boolean var11 = var1.method13165(-1480689588) == 1;
            var4.method2974(var8, var9, var10 >> 16, var10 & 1311642714, var11, 1618482567);
         }
      }

      if ((var3 & 4096) != 0) {
         int var17 = classXY.method13047(var1, 1843894807);
         int var30 = var17 >> 8;
         int var40 = var30 >= 13 && var30 <= 20 ? var30 - 12 : 0;
         classKL var49 = (classKL)classOF.method8404(classGH.method5431((byte)55), var1.method13159((byte)-111), -1830540410);
         boolean var56 = var1.method13164(-636962014) == 1;
         int var63 = var1.method13159((byte)-58);
         this.field1414.field6955 = 0;
         var1.method13255(this.field1414.field6954, 0, var63, 1408281021);
         this.field1414.field6955 = 0;
         String var12 = AbstractFont.method8(classJE.method6358(classND.method7818(this.field1414, -961480929), (byte)32));
         byte[] var13 = null;
         if (var40 > 0 && var40 <= 8) {
            var13 = new byte[var40];

            for (int var14 = 0; var14 < var40; var14++) {
               var13[var14] = var1.method13175((byte)-28);
            }
         }

         classDC.method2955(var4, var17, var49, var56, var12, var13, -2065805758);
      }

      if ((var3 & -2006546546) != 0) {
         int var18 = var1.method13165(-1911460249);
         if (var18 > 0) {
            for (int var31 = 0; var31 < var18; var31++) {
               int var41 = var1.method13094((short)8905);
               int var50 = var1.method13094((short)7022);
               if (32767 != var50) {
                  int var57 = var1.method13094((short)5594);
                  int var64 = classXY.method13039(var1, -346779531);
                  int var68 = var50 > 0 ? var1.method13164(-606102227) : var64;
                  var4.method2947(var41, var50, var57, var64, var68, 1007185069);
               } else {
                  var4.method2950(var41, 1758065949);
               }
            }
         }
      }

      if ((var3 & 4) != 0) {
         int var19 = var1.method13165(-917316527);
         byte[] var32 = new byte[var19];
         classXY var42 = new classXY(var32);
         var1.method13252(var32, 0, var19, -1366881648);
         var4.method2927(var42, 1555374895);
      }

      if (0 != (var3 & 262144)) {
         int var20 = classXY.method13197(var1, 536431689);
         if (65535 == var20) {
            var20 = -1;
         }

         int var33 = classXY.method13194(var1, 1457152750);
         if (var33 == 1487282291) {
            var33 = -1;
         }

         boolean var43 = var1.method13164(-307644800) != 0;
         var4.method2978(var20, var33, var43, -1331067733);
      }

      if ((var3 & 64) != 0) {
         int var21 = classXY.method13039(var1, -346779531);
         var4.method2934(var21, var1, 1789220073);
      }

      if (0 != (var3 & 512)) {
         for (int var22 = 0; var22 < 3; var22++) {
            this.field1415[var22] = var1.method13071(-311138017);
         }

         var4.method2965(this.field1415, (byte)-53);
      }

      if (0 != (var3 & -2039409864)) {
         var4.field1394 = (classGT)classOF.method8404(classDT.method3596(1337012375), var1.method13179((byte)77), -1859068386);
         if (Integer.MAX_VALUE == var5) {
            this.field1422[var2] = var4.field1394;
         }
      }

      if ((var3 & 2048) != 0) {
         byte var15 = var1.method13175((byte)-21);
         if (1819274119 == var15) {
            this.field1422[var2] = classGT.field2678;
         } else {
            this.field1422[var2] = (classGT)classOF.method8404(classDT.method3596(1141838931), var15, -451548237);
         }
      }

      if ((var3 & -461195278) != 0) {
         int var23 = var1.method13165(-936570768);

         for (int var34 = 0; var34 < var23; var34++) {
            int var44 = var1.method13159((byte)-9);
            int var51 = classXY.method13194(var1, -1284793398);
            int var58 = var1.method13241(-2100807916);
            var4.method2974(var44, var51, var58 >> 16, var58 & 65535, false, 1886027637);
         }
      }

      if ((var3 & 65536) != 0) {
         int var24 = -829536609 * client.field855 + var1.method13207((byte)32);
         int var35 = 1612595797 * client.field855 + var1.method13211(1459620897);
         byte var45 = var1.method13179((byte)51);
         byte var52 = var1.method13179((byte)-8);
         boolean var59 = var1.method13165(-1615672639) != 0;
         var4.method2970(client.field855 * -1165659452, var24, var35, var45, var52, var59, (byte)0);
      }

      if (0 != (var3 & -890467862)) {
         int var25 = classXY.method13039(var1, -346779531);
         if (var25 > 0) {
            for (int var36 = 0; var36 < var25; var36++) {
               int var46 = var1.method13094((short)27533);
               int var53 = var1.method13094((short)21046);
               int var60 = var1.method13094((short)22638);
               int var65 = var1.method13094((short)15856);
               var4.method2942(var46, var53, var60, var65, (byte)-8);
            }
         }
      }

      if ((var3 & -845834665) != 0) {
         byte var26 = classXY.method13043(var1, (byte)17);
         byte var37 = var1.method13179((byte)-66);
         byte var47 = classXY.method13043(var1, (byte)17);
         byte var54 = classXY.method13043(var1, (byte)17);
         int var61 = var1.method13198(-144981807) + client.field855 * -237189028;
         int var66 = var1.method13198(-343794544) + 1612595797 * client.field855;
         int var69 = var1.method13198(-1295133327);
         var4.method2959(var26, var37, var47, var54, var61, var66, var69, 1186923984);
         this.field1416[var2] = false;
      }

      if ((var3 & 16) != 0) {
         int var27 = var1.method13198(-404261945);
         if (65535 == var27) {
            var27 = -1;
         }

         int var38 = var1.method13159((byte)-65);
         classDC.method2932(var4, var27, var38, 2134049341);
      }

      if ((var3 & -1497164894) != 0) {
         int var28 = client.field855 * 1453050168 + var1.method13202((byte)40);
         int var39 = -1610190358 * client.field855 + var1.method13211(299335991);
         byte var48 = var1.method13175((byte)-41);
         byte var55 = classXY.method13169(var1, (byte)21);
         byte var62 = classXY.method13043(var1, (byte)17);
         byte var67 = (byte)var1.method13159((byte)-115);
         var4.method2968(var28, var39, var48, var55, var62, var67, -157342920);
      }

      if ((var3 & 8) != 0) {
         var1.method13164(-655659425);
      }

      if ((var3 & 1) != 0) {
         String var29 = var1.method13071(2003671513);
         var4.method2940(var29, -374128546);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;II)V")
   @ObfuscatedName("bq")
   void method3039(PacketBuffer var1, int var2, int var3) {
      classDC var4 = this.field1411[var2];
      int var5 = Integer.MAX_VALUE;
      if ((var3 & 8) != 0) {
         var4.method2896(-662660961);
      }

      if ((var3 & 2) != 0) {
         classXY.method13194(var1, 2119349051);
         classXY.method13039(var1, -346779531);
         var1.method13159((byte)-46);
         int var6 = var1.method13159((byte)-65);
         this.field1414.field6955 = 0;
         var1.method13084(this.field1414.field6954, 0, var6, (byte)105);
         this.field1414.field6955 = 0;
      }

      if ((var3 & 32) != 0) {
         int var16 = var1.method13159((byte)-26);

         for (int var7 = 0; var7 < var16; var7++) {
            int var8 = var1.method13164(-733274189);
            int var9 = classXY.method13194(var1, 392602703);
            int var10 = var1.method13056((byte)1);
            boolean var11 = var1.method13165(-1498036237) == 1;
            var4.method2974(var8, var9, var10 >> 16, var10 & 65535, var11, 1487592641);
         }
      }

      if ((var3 & 4096) != 0) {
         int var17 = classXY.method13047(var1, -1552996856);
         int var30 = var17 >> 8;
         int var40 = var30 >= 13 && var30 <= 20 ? var30 - 12 : 0;
         classKL var49 = (classKL)classOF.method8404(classGH.method5431((byte)102), var1.method13159((byte)-123), -1969306478);
         boolean var56 = var1.method13164(-1894493001) == 1;
         int var63 = var1.method13159((byte)-110);
         this.field1414.field6955 = 0;
         var1.method13255(this.field1414.field6954, 0, var63, 905340165);
         this.field1414.field6955 = 0;
         String var12 = AbstractFont.method8(classJE.method6358(classND.method7818(this.field1414, -1865475282), (byte)94));
         byte[] var13 = null;
         if (var40 > 0 && var40 <= 8) {
            var13 = new byte[var40];

            for (int var14 = 0; var14 < var40; var14++) {
               var13[var14] = var1.method13175((byte)-65);
            }
         }

         classDC.method2955(var4, var17, var49, var56, var12, var13, -1665630174);
      }

      if ((var3 & 131072) != 0) {
         int var18 = var1.method13165(-1185756647);
         if (var18 > 0) {
            for (int var31 = 0; var31 < var18; var31++) {
               int var41 = var1.method13094((short)23318);
               int var50 = var1.method13094((short)15448);
               if (32767 != var50) {
                  int var57 = var1.method13094((short)6686);
                  int var64 = classXY.method13039(var1, -346779531);
                  int var68 = var50 > 0 ? var1.method13164(-251908472) : var64;
                  var4.method2947(var41, var50, var57, var64, var68, 789645602);
               } else {
                  var4.method2950(var41, 2066176701);
               }
            }
         }
      }

      if ((var3 & 4) != 0) {
         int var19 = var1.method13165(-1761158160);
         byte[] var32 = new byte[var19];
         classXY var42 = new classXY(var32);
         var1.method13252(var32, 0, var19, -1366881648);
         var4.method2927(var42, 1555374895);
      }

      if (0 != (var3 & 262144)) {
         int var20 = classXY.method13197(var1, 2132536915);
         if (65535 == var20) {
            var20 = -1;
         }

         int var33 = classXY.method13194(var1, 971878551);
         if (var33 == 65535) {
            var33 = -1;
         }

         boolean var43 = var1.method13164(-340129022) != 0;
         var4.method2978(var20, var33, var43, 1302111129);
      }

      if ((var3 & 64) != 0) {
         int var21 = classXY.method13039(var1, -346779531);
         var4.method2934(var21, var1, -1435266777);
      }

      if (0 != (var3 & 512)) {
         for (int var22 = 0; var22 < 3; var22++) {
            this.field1415[var22] = var1.method13071(1674302299);
         }

         var4.method2965(this.field1415, (byte)5);
      }

      if (0 != (var3 & 16384)) {
         var4.field1394 = (classGT)classOF.method8404(classDT.method3596(1698357558), var1.method13179((byte)-14), 1489846754);
         if (Integer.MAX_VALUE == var5) {
            this.field1422[var2] = var4.field1394;
         }
      }

      if ((var3 & 2048) != 0) {
         byte var15 = var1.method13175((byte)-124);
         if (127 == var15) {
            this.field1422[var2] = classGT.field2678;
         } else {
            this.field1422[var2] = (classGT)classOF.method8404(classDT.method3596(1098533561), var15, 2011343057);
         }
      }

      if ((var3 & 524288) != 0) {
         int var23 = var1.method13165(-2106230486);

         for (int var34 = 0; var34 < var23; var34++) {
            int var44 = var1.method13159((byte)-114);
            int var51 = classXY.method13194(var1, -193908467);
            int var58 = var1.method13241(-2100807916);
            var4.method2974(var44, var51, var58 >> 16, var58 & 65535, false, 939277031);
         }
      }

      if ((var3 & 65536) != 0) {
         int var24 = 1612595797 * client.field855 + var1.method13207((byte)21);
         int var35 = 1612595797 * client.field855 + var1.method13211(431906281);
         byte var45 = var1.method13179((byte)-117);
         byte var52 = var1.method13179((byte)10);
         boolean var59 = var1.method13165(-1541603908) != 0;
         var4.method2970(client.field855 * 1612595797, var24, var35, var45, var52, var59, (byte)0);
      }

      if (0 != (var3 & 1048576)) {
         int var25 = classXY.method13039(var1, -346779531);
         if (var25 > 0) {
            for (int var36 = 0; var36 < var25; var36++) {
               int var46 = var1.method13094((short)1330);
               int var53 = var1.method13094((short)13955);
               int var60 = var1.method13094((short)21651);
               int var65 = var1.method13094((short)14060);
               var4.method2942(var46, var53, var60, var65, (byte)-65);
            }
         }
      }

      if ((var3 & 32768) != 0) {
         byte var26 = classXY.method13043(var1, (byte)17);
         byte var37 = var1.method13179((byte)-34);
         byte var47 = classXY.method13043(var1, (byte)17);
         byte var54 = classXY.method13043(var1, (byte)17);
         int var61 = var1.method13198(-99097995) + client.field855 * 1612595797;
         int var66 = var1.method13198(-1775201549) + 1612595797 * client.field855;
         int var69 = var1.method13198(-1647793313);
         var4.method2959(var26, var37, var47, var54, var61, var66, var69, 295932873);
         this.field1416[var2] = false;
      }

      if ((var3 & 16) != 0) {
         int var27 = var1.method13198(-114965004);
         if (65535 == var27) {
            var27 = -1;
         }

         int var38 = var1.method13159((byte)-120);
         classDC.method2932(var4, var27, var38, 1405168957);
      }

      if ((var3 & 1024) != 0) {
         int var28 = client.field855 * 1612595797 + var1.method13202((byte)127);
         int var39 = 1612595797 * client.field855 + var1.method13211(1353489494);
         byte var48 = var1.method13175((byte)-3);
         byte var55 = classXY.method13169(var1, (byte)11);
         byte var62 = classXY.method13043(var1, (byte)17);
         byte var67 = (byte)var1.method13159((byte)-72);
         var4.method2968(var28, var39, var48, var55, var62, var67, 1322541999);
      }

      if ((var3 & 8) != 0) {
         var1.method13164(-1451926120);
      }

      if ((var3 & 1) != 0) {
         String var29 = var1.method13071(-1216552594);
         var4.method2940(var29, -964747571);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;II)V")
   @ObfuscatedName("bf")
   void method3040(PacketBuffer var1, int var2, int var3) {
      classDC var4 = this.field1411[var2];
      int var5 = Integer.MAX_VALUE;
      if ((var3 & 8) != 0) {
         var4.method2896(-1890674240);
      }

      if ((var3 & 2) != 0) {
         classXY.method13194(var1, -1023998179);
         classXY.method13039(var1, -346779531);
         var1.method13159((byte)-59);
         int var6 = var1.method13159((byte)-4);
         this.field1414.field6955 = 0;
         var1.method13084(this.field1414.field6954, 0, var6, (byte)122);
         this.field1414.field6955 = 0;
      }

      if ((var3 & 32) != 0) {
         int var16 = var1.method13159((byte)-30);

         for (int var7 = 0; var7 < var16; var7++) {
            int var8 = var1.method13164(-342036772);
            int var9 = classXY.method13194(var1, 1621871389);
            int var10 = var1.method13056((byte)1);
            boolean var11 = var1.method13165(-813060856) == 1;
            var4.method2974(var8, var9, var10 >> 16, var10 & 65535, var11, 828555588);
         }
      }

      if ((var3 & 4096) != 0) {
         int var17 = classXY.method13047(var1, -1726221169);
         int var30 = var17 >> 8;
         int var40 = var30 >= 13 && var30 <= 20 ? var30 - 12 : 0;
         classKL var49 = (classKL)classOF.method8404(classGH.method5431((byte)125), var1.method13159((byte)-95), 1952576335);
         boolean var56 = var1.method13164(-1793351424) == 1;
         int var63 = var1.method13159((byte)-67);
         this.field1414.field6955 = 0;
         var1.method13255(this.field1414.field6954, 0, var63, 851186209);
         this.field1414.field6955 = 0;
         String var12 = AbstractFont.method8(classJE.method6358(classND.method7818(this.field1414, -590118962), (byte)58));
         byte[] var13 = null;
         if (var40 > 0 && var40 <= 8) {
            var13 = new byte[var40];

            for (int var14 = 0; var14 < var40; var14++) {
               var13[var14] = var1.method13175((byte)-1);
            }
         }

         classDC.method2955(var4, var17, var49, var56, var12, var13, -1567070328);
      }

      if ((var3 & 131072) != 0) {
         int var18 = var1.method13165(-1089945342);
         if (var18 > 0) {
            for (int var31 = 0; var31 < var18; var31++) {
               int var41 = var1.method13094((short)29447);
               int var50 = var1.method13094((short)20770);
               if (32767 != var50) {
                  int var57 = var1.method13094((short)17385);
                  int var64 = classXY.method13039(var1, -346779531);
                  int var68 = var50 > 0 ? var1.method13164(-885822378) : var64;
                  var4.method2947(var41, var50, var57, var64, var68, -604752916);
               } else {
                  var4.method2950(var41, 2127708529);
               }
            }
         }
      }

      if ((var3 & 4) != 0) {
         int var19 = var1.method13165(-1057877850);
         byte[] var32 = new byte[var19];
         classXY var42 = new classXY(var32);
         var1.method13252(var32, 0, var19, -1366881648);
         var4.method2927(var42, 1555374895);
      }

      if (0 != (var3 & 262144)) {
         int var20 = classXY.method13197(var1, 968514833);
         if (65535 == var20) {
            var20 = -1;
         }

         int var33 = classXY.method13194(var1, 1303374362);
         if (var33 == 65535) {
            var33 = -1;
         }

         boolean var43 = var1.method13164(-1753055436) != 0;
         var4.method2978(var20, var33, var43, 1596057936);
      }

      if ((var3 & 64) != 0) {
         int var21 = classXY.method13039(var1, -346779531);
         var4.method2934(var21, var1, -873073269);
      }

      if (0 != (var3 & 512)) {
         for (int var22 = 0; var22 < 3; var22++) {
            this.field1415[var22] = var1.method13071(1391508901);
         }

         var4.method2965(this.field1415, (byte)70);
      }

      if (0 != (var3 & 16384)) {
         var4.field1394 = (classGT)classOF.method8404(classDT.method3596(321330125), var1.method13179((byte)-71), -1203321881);
         if (Integer.MAX_VALUE == var5) {
            this.field1422[var2] = var4.field1394;
         }
      }

      if ((var3 & 2048) != 0) {
         byte var15 = var1.method13175((byte)-35);
         if (127 == var15) {
            this.field1422[var2] = classGT.field2678;
         } else {
            this.field1422[var2] = (classGT)classOF.method8404(classDT.method3596(755590764), var15, 2080764766);
         }
      }

      if ((var3 & 524288) != 0) {
         int var23 = var1.method13165(-792934623);

         for (int var34 = 0; var34 < var23; var34++) {
            int var44 = var1.method13159((byte)-53);
            int var51 = classXY.method13194(var1, -267156906);
            int var58 = var1.method13241(-2100807916);
            var4.method2974(var44, var51, var58 >> 16, var58 & 65535, false, 996192814);
         }
      }

      if ((var3 & 65536) != 0) {
         int var24 = 1612595797 * client.field855 + var1.method13207((byte)79);
         int var35 = 1612595797 * client.field855 + var1.method13211(1215657430);
         byte var45 = var1.method13179((byte)-75);
         byte var52 = var1.method13179((byte)-21);
         boolean var59 = var1.method13165(-1235855441) != 0;
         var4.method2970(client.field855 * 1612595797, var24, var35, var45, var52, var59, (byte)0);
      }

      if (0 != (var3 & 1048576)) {
         int var25 = classXY.method13039(var1, -346779531);
         if (var25 > 0) {
            for (int var36 = 0; var36 < var25; var36++) {
               int var46 = var1.method13094((short)10048);
               int var53 = var1.method13094((short)12628);
               int var60 = var1.method13094((short)18527);
               int var65 = var1.method13094((short)27452);
               var4.method2942(var46, var53, var60, var65, (byte)-85);
            }
         }
      }

      if ((var3 & 32768) != 0) {
         byte var26 = classXY.method13043(var1, (byte)17);
         byte var37 = var1.method13179((byte)13);
         byte var47 = classXY.method13043(var1, (byte)17);
         byte var54 = classXY.method13043(var1, (byte)17);
         int var61 = var1.method13198(-556843985) + client.field855 * 1612595797;
         int var66 = var1.method13198(-351966531) + 1612595797 * client.field855;
         int var69 = var1.method13198(-2109464248);
         var4.method2959(var26, var37, var47, var54, var61, var66, var69, -1981998749);
         this.field1416[var2] = false;
      }

      if ((var3 & 16) != 0) {
         int var27 = var1.method13198(-515140432);
         if (65535 == var27) {
            var27 = -1;
         }

         int var38 = var1.method13159((byte)-31);
         classDC.method2932(var4, var27, var38, 1989171100);
      }

      if ((var3 & 1024) != 0) {
         int var28 = client.field855 * 1612595797 + var1.method13202((byte)30);
         int var39 = 1612595797 * client.field855 + var1.method13211(838270603);
         byte var48 = var1.method13175((byte)-111);
         byte var55 = classXY.method13169(var1, (byte)61);
         byte var62 = classXY.method13043(var1, (byte)17);
         byte var67 = (byte)var1.method13159((byte)-37);
         var4.method2968(var28, var39, var48, var55, var62, var67, -956134137);
      }

      if ((var3 & 8) != 0) {
         var1.method13164(-510213432);
      }

      if ((var3 & 1) != 0) {
         String var29 = var1.method13071(26487488);
         var4.method2940(var29, -187275948);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;II)V")
   @ObfuscatedName("ae")
   final void method3002(PacketBuffer var1, int var2, int var3) {
      this.method3056(var1, var2);

      try {
         int var4 = 702114061 * var1.field6955;
         this.field1413 = 0;
         method3008(this, var1, 448842070);
         this.method3019((byte)13);
         this.method3022(1367471731);
         this.method3032(var1, -1284256561);
         method3035(this, -2130212532);
         if (702114061 * var1.field6955 - var4 != var2) {
            if (var3 >= 1992762500) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException(702114061 * var1.field6955 - var4 + " " + var2);
            }
         } else {
            this.method3054(var1, var2);
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "df.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldf;)V")
   @ObfuscatedName("ir")
   public static void method3026(classDF var0) {
      if (var0 == null) {
         var0.method3024();
      }

      client.field846 = 0;

      for (WorldView var2 : client.field814) {
         var0.method3028(var2, -545217909);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldf;II)I")
   @ObfuscatedName("yd")
   public static int method3050(classDF var0, int var1, int var2) {
      if (var0 == null) {
         var0.method3052(var1, var1);
      }

      try {
         for (int var3 = 0; var3 < var0.field1419 * -2087374717; var3++) {
            if (var2 != 1043668321) {
               throw new IllegalStateException();
            }

            if (var0.field1423[var3] == var1) {
               if (var2 != 1043668321) {
                  throw new IllegalStateException();
               }

               return var3;
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "df.ap(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lct;)V")
   @ObfuscatedName("bd")
   void method3043(Player var1) {
      if (var1 != null) {
         classDC.method2905(this.field1411[-1315528093 * var1.field1480], var1, (byte)4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldf;Lxs;IB)V")
   @ObfuscatedName("dr")
   public static void method3015(classDF var0, PacketBuffer var1, int var2, byte var3) {
      if (var0 == null) {
         var0.method3016(var1, var2, var3);
      } else {
         try {
            boolean var10000;
            if (PacketBuffer.method12923(var1, 1, -998577547) == 1) {
               if (var3 >= 6) {
                  return;
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var4 = var10000;
            if (var4) {
               if (var3 >= 6) {
                  throw new IllegalStateException();
               }

               var0.field1417[(var0.field1413 += -2126160331) * -764574691 - 1] = var2;
            }

            int var5 = PacketBuffer.method12923(var1, 2, 328478500);
            classDC var6 = var0.field1411[var2];
            if (var5 == 0) {
               if (var4) {
                  if (var3 < 6) {
                     var0.field1416[var2] = false;
                  }
               } else if (-2130951373 * client.field845 == var2) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException();
                  }
               } else {
                  var6.method2914(-549909894);
                  if (PacketBuffer.method12923(var1, 1, -748527848) != 0) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     var0.method3017(var1, var2, (byte)-127);
                  }

                  var0.field1412[(var0.field1421 += 535859311) * -117780849 - 1] = var2;
               }
            } else if (var5 == 1) {
               if (var3 >= 6) {
                  throw new IllegalStateException();
               } else {
                  int var15 = PacketBuffer.method12923(var1, 3, 779393692);
                  classKY var18 = var6.field1382;
                  if (0 == var15) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     var18.field4055 -= -1705956773;
                     var18.field4056 -= -1950125731;
                  } else if (1 == var15) {
                     var18.field4056 -= -1950125731;
                  } else if (var15 == 2) {
                     var18.field4055 += -1705956773;
                     var18.field4056 -= -1950125731;
                  } else if (3 == var15) {
                     if (var3 >= 6) {
                        return;
                     }

                     var18.field4055 -= -1705956773;
                  } else if (var15 == 4) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     var18.field4055 += -1705956773;
                  } else if (5 == var15) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     var18.field4055 -= -1705956773;
                     var18.field4056 += -1950125731;
                  } else if (6 == var15) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     var18.field4056 += -1950125731;
                  } else if (7 == var15) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     var18.field4055 += -1705956773;
                     var18.field4056 += -1950125731;
                  }

                  var0.field1416[var2] = true;
                  var0.field1422[var2] = var6.field1394;
               }
            } else if (var5 == 2) {
               if (var3 >= 6) {
                  throw new IllegalStateException();
               } else {
                  int var14 = PacketBuffer.method12923(var1, 4, 173498494);
                  classKY var17 = var6.field1382;
                  if (0 == var14) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     var17.field4055 -= 883053750;
                     var17.field4056 -= 394715834;
                  } else if (1 == var14) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     var17.field4055 -= -1705956773;
                     var17.field4056 -= 394715834;
                  } else if (var14 == 2) {
                     if (var3 >= 6) {
                        return;
                     }

                     var17.field4056 -= 394715834;
                  } else if (3 == var14) {
                     var17.field4055 += -1705956773;
                     var17.field4056 -= 394715834;
                  } else if (4 == var14) {
                     var17.field4055 += 883053750;
                     var17.field4056 -= 394715834;
                  } else if (5 == var14) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     var17.field4055 -= 883053750;
                     var17.field4056 -= -1950125731;
                  } else if (6 == var14) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     var17.field4055 += 883053750;
                     var17.field4056 -= -1950125731;
                  } else if (7 == var14) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     var17.field4055 -= 883053750;
                  } else if (var14 == 8) {
                     var17.field4055 += 883053750;
                  } else if (9 == var14) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     var17.field4055 -= 883053750;
                     var17.field4056 += -1950125731;
                  } else if (10 == var14) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     var17.field4055 += 883053750;
                     var17.field4056 += -1950125731;
                  } else if (var14 == 11) {
                     if (var3 >= 6) {
                        return;
                     }

                     var17.field4055 -= 883053750;
                     var17.field4056 += 394715834;
                  } else if (12 == var14) {
                     var17.field4055 -= -1705956773;
                     var17.field4056 += 394715834;
                  } else if (13 == var14) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     var17.field4056 += 394715834;
                  } else if (14 == var14) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     var17.field4055 += -1705956773;
                     var17.field4056 += 394715834;
                  } else if (var14 == 15) {
                     var17.field4055 += 883053750;
                     var17.field4056 += 394715834;
                  }

                  var0.field1416[var2] = true;
                  var0.field1422[var2] = var6.field1394;
               }
            } else {
               int var7 = PacketBuffer.method12923(var1, 1, 1344124283);
               if (var7 == 0) {
                  if (var3 < 6) {
                     int var16 = PacketBuffer.method12923(var1, 12, -234384970);
                     int var19 = var16 >> 10;
                     int var20 = var16 >> 5 & 31;
                     if (var20 > 15) {
                        var20 -= 32;
                     }

                     int var21 = var16 & 31;
                     if (var21 > 15) {
                        if (var3 >= 6) {
                           throw new IllegalStateException();
                        }

                        var21 -= 32;
                     }

                     classKY var22 = var6.field1382;
                     var22.field4057 = (byte)(var19 + var22.field4057 * -210579119 & 3) * -1004595279;
                     var22.field4055 += var20 * -1705956773;
                     var22.field4056 += var21 * -1950125731;
                     var0.field1416[var2] = true;
                     var0.field1422[var2] = var6.field1394;
                  }
               } else {
                  int var8 = PacketBuffer.method12923(var1, 30, 1513831361);
                  int var9 = classKY.method6582(var8, -1678294639);
                  int var10 = classKY.method6594(var8, (byte)-79);
                  int var11 = classKY.method6596(var8, -560268380);
                  classKY var12 = var6.field1382;
                  var12.field4057 = -1004595279 * (byte)(-210579119 * var12.field4057 + var9 & 3);
                  var12.field4055 = -1705956773 * (1870919123 * var12.field4055 + var10 & 16383);
                  var12.field4056 = -1950125731 * (var12.field4056 * 819227381 + var11 & 16383);
                  var0.field1416[var2] = true;
                  var0.field1422[var2] = var6.field1394;
               }
            }
         } catch (RuntimeException var13) {
            throw classEG.method3884(var13, "df.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;)I")
   @ObfuscatedName("bx")
   int method3011(PacketBuffer var1) {
      int var2 = PacketBuffer.method12923(var1, 2, 1144488309);
      int var3;
      if (0 == var2) {
         var3 = 0;
      } else if (1 == var2) {
         var3 = PacketBuffer.method12923(var1, 5, -800988753);
      } else if (var2 == 2) {
         var3 = PacketBuffer.method12923(var1, 8, 1082666753);
      } else {
         var3 = PacketBuffer.method12923(var1, 11, 279502634);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Lct;)V")
   @ObfuscatedName("bv")
   void method3044(Player var1) {
      if (var1 != null) {
         classDC.method2905(this.field1411[-1315528093 * var1.field1480], var1, (byte)4);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bz")
   void method3048() {
      this.field1419 = 0;

      for (int var1 = 0; var1 < -1655153995; var1++) {
         this.field1411[var1].method2888((byte)2);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)V")
   @ObfuscatedName("av")
   final void method3003(PacketBuffer var1, int var2) {
      int var3 = 702114061 * var1.field6955;
      this.field1413 = 0;
      method3008(this, var1, 448842070);
      this.method3019((byte)13);
      this.method3022(777932988);
      this.method3032(var1, -2024427274);
      method3035(this, -2136362088);
      if (702114061 * var1.field6955 - var3 != var2) {
         throw new RuntimeException(702114061 * var1.field6955 - var3 + " " + var2);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("cr")
   int method3051(int var1) {
      for (int var2 = 0; var2 < this.field1419 * -2087374717; var2++) {
         if (this.field1423[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedSignature(descriptor = "(Ldf;I)V")
   @ObfuscatedName("om")
   public static void method3035(classDF var0, int var1) {
      if (var0 == null) {
         var0.method3027(var1);
      } else {
         try {
            for (int var2 = 0; var2 < var0.field1419 * -2087374717; var2++) {
               int var3 = var0.field1423[var2];
               if (var0.field1416[var3]) {
                  if (var1 >= -2013442296) {
                     throw new IllegalStateException();
                  }

                  classDC var4 = var0.field1411[var3];
                  classDC.method2924(var4, var0.field1422[var3], (byte)-96);
                  var0.field1416[var3] = false;
               }
            }
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "df.aj(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lke;")
   @ObfuscatedName("az")
   public static classKE method2994(int var0, byte var1) {
      try {
         classKE[] var2 = new classKE[]{classKE.field3558, classKE.field3560, classKE.field3557, classKE.field3559};
         classKE[] var3 = var2;

         for (int var4 = 0; var4 < var3.length; var4++) {
            if (var1 <= 9) {
               throw new IllegalStateException();
            }

            classKE var5 = var3[var4];
            if (1160269797 * var5.field3555 == var0) {
               if (var1 <= 9) {
                  throw new IllegalStateException();
               }

               return var5;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "df.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)I")
   @ObfuscatedName("ag")
   int method3012(PacketBuffer var1, int var2) {
      try {
         int var3 = PacketBuffer.method12923(var1, 2, -566844910);
         int var4;
         if (0 == var3) {
            if (var2 == 825241857) {
               throw new IllegalStateException();
            }

            var4 = 0;
         } else if (1 == var3) {
            var4 = PacketBuffer.method12923(var1, 5, 1966523972);
         } else if (var3 == 2) {
            if (var2 == 825241857) {
               throw new IllegalStateException();
            }

            var4 = PacketBuffer.method12923(var1, 8, 1770189469);
         } else {
            var4 = PacketBuffer.method12923(var1, 11, -276199589);
         }

         return var4;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "df.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aj")
   void method3027(int var1) {
      try {
         client.field981 = 0;
         Iterator var2 = client.field814.method1625();

         while (var2.hasNext()) {
            if (var1 <= 497808236) {
               return;
            }

            WorldView var3 = (WorldView)var2.next();
            this.method3028(var3, -545217909);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "df.aa(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldf;Lxs;)I")
   @ObfuscatedName("wc")
   public static int method3013(classDF var0, PacketBuffer var1) {
      if (var0 == null) {
         var0.method3025();
      }

      int var2 = PacketBuffer.method12923(var1, 2, 216882995);
      int var3;
      if (0 == var2) {
         var3 = 0;
      } else if (1 == var2) {
         var3 = PacketBuffer.method12923(var1, 5, 813753866);
      } else if (var2 == 2) {
         var3 = PacketBuffer.method12923(var1, 8, 596870314);
      } else {
         var3 = PacketBuffer.method12923(var1, 11, 928967232);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Lct;I)V")
   @ObfuscatedName("aq")
   void method3045(Player var1, int var2) {
      this.method3055(var1);

      try {
         if (var1 == null) {
            if (var2 >= 344844140) {
               throw new IllegalStateException();
            }
         } else {
            classDC.method2905(this.field1411[-1315528093 * var1.field1498], var1, (byte)4);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "df.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)V")
   @ObfuscatedName("ul")
   public void method3054(PacketBuffer var1, int var2) {
      Actor.field1483 = false;

      for (int var3 = 0; var3 < this.field1419 * -2087374717; var3++) {
         ArrayList var4 = this.field1411[this.field1423[var3]].field1389;

         for (int var5 = 0; var5 < var4.size(); var5++) {
            ((Player)var4.get(var5)).method3165();
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ap")
   int method3052(int var1, int var2) {
      try {
         for (int var3 = 0; var3 < this.field1421 * -2087374717; var3++) {
            if (var2 != 1043668321) {
               throw new IllegalStateException();
            }

            if (this.field1423[var3] == var1) {
               if (var2 != 1043668321) {
                  throw new IllegalStateException();
               }

               return var3;
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "df.ap(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldf;Lxs;)I")
   @ObfuscatedName("me")
   public static int method3014(classDF var0, PacketBuffer var1) {
      if (var0 == null) {
         var0.method3021();
      }

      int var2 = PacketBuffer.method12923(var1, 2, 1668416360);
      int var3;
      if (0 == var2) {
         var3 = 0;
      } else if (1 == var2) {
         var3 = PacketBuffer.method12923(var1, 5, 1840317125);
      } else if (var2 == 2) {
         var3 = PacketBuffer.method12923(var1, 8, -469014597);
      } else {
         var3 = PacketBuffer.method12923(var1, 11, 1636662552);
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Ldf;Lxs;I)V")
   @ObfuscatedName("lw")
   public static void method3008(classDF var0, PacketBuffer var1, int var2) {
      if (var0 == null) {
         var0.method3004(var1, var2);
      }

      try {
         var0.field1421 = 0;
         int var3 = 0;
         PacketBuffer.method12921(var1, (byte)39);

         for (int var4 = 0; var4 < -2087374717 * var0.field1419; var4++) {
            if (var2 != 448842070) {
               throw new IllegalStateException();
            }

            int var5 = var0.field1423[var4];
            if (0 == (var0.field1411[var5].field1390 & 1)) {
               if (var2 != 448842070) {
                  throw new IllegalStateException();
               }

               if (var3 > 0) {
                  if (var2 != 448842070) {
                     return;
                  }

                  var3--;
                  var0.field1411[var5].field1390 = (byte)(var0.field1411[var5].field1390 | 2);
               } else {
                  int var6 = PacketBuffer.method12923(var1, 1, -925340340);
                  if (0 == var6) {
                     if (var2 != 448842070) {
                        throw new IllegalStateException();
                     }

                     var3 = method3009(var0, var1, 1772059587);
                     var0.field1411[var5].field1390 = (byte)(var0.field1411[var5].field1390 | 2);
                  } else {
                     method3015(var0, var1, var5, (byte)-39);
                  }
               }
            }
         }

         PacketBuffer.method12926(var1, -2113762511);
         if (0 != var3) {
            throw new RuntimeException();
         } else {
            PacketBuffer.method12921(var1, (byte)110);

            for (int var8 = 0; var8 < var0.field1419 * -2087374717; var8++) {
               int var12 = var0.field1423[var8];
               if (0 != (var0.field1411[var12].field1390 & 1)) {
                  if (var2 != 448842070) {
                     throw new IllegalStateException();
                  }

                  if (var3 > 0) {
                     var3--;
                     var0.field1411[var12].field1390 = (byte)(var0.field1411[var12].field1390 | 2);
                  } else {
                     int var15 = PacketBuffer.method12923(var1, 1, 802148163);
                     if (0 == var15) {
                        if (var2 != 448842070) {
                           throw new IllegalStateException();
                        }

                        var3 = method3009(var0, var1, -1318362133);
                        var0.field1411[var12].field1390 = (byte)(var0.field1411[var12].field1390 | 2);
                     } else {
                        method3015(var0, var1, var12, (byte)-75);
                     }
                  }
               }
            }

            PacketBuffer.method12926(var1, -2086296611);
            if (0 != var3) {
               if (var2 != 448842070) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException();
               }
            } else {
               PacketBuffer.method12921(var1, (byte)71);

               for (int var9 = 0; var9 < -392147439 * var0.field1420; var9++) {
                  int var13 = var0.field1418[var9];
                  if ((var0.field1411[var13].field1390 & 1) != 0) {
                     if (var2 != 448842070) {
                        throw new IllegalStateException();
                     }

                     if (var3 > 0) {
                        if (var2 != 448842070) {
                           throw new IllegalStateException();
                        }

                        var3--;
                        var0.field1411[var13].field1390 = (byte)(var0.field1411[var13].field1390 | 2);
                     } else {
                        int var16 = PacketBuffer.method12923(var1, 1, 1159021329);
                        if (0 == var16) {
                           var3 = method3009(var0, var1, 1488259100);
                           var0.field1411[var13].field1390 = (byte)(var0.field1411[var13].field1390 | 2);
                        } else if (var0.method3017(var1, var13, (byte)-38)) {
                           if (var2 != 448842070) {
                              return;
                           }

                           var0.field1411[var13].field1390 = (byte)(var0.field1411[var13].field1390 | 2);
                        }
                     }
                  }
               }

               PacketBuffer.method12926(var1, -2019821228);
               if (0 != var3) {
                  if (var2 != 448842070) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException();
                  }
               } else {
                  PacketBuffer.method12921(var1, (byte)70);

                  for (int var10 = 0; var10 < -392147439 * var0.field1420; var10++) {
                     if (var2 != 448842070) {
                        throw new IllegalStateException();
                     }

                     int var14 = var0.field1418[var10];
                     if ((var0.field1411[var14].field1390 & 1) == 0) {
                        if (var2 != 448842070) {
                           throw new IllegalStateException();
                        }

                        if (var3 > 0) {
                           if (var2 != 448842070) {
                              return;
                           }

                           var3--;
                           var0.field1411[var14].field1390 = (byte)(var0.field1411[var14].field1390 | 2);
                        } else {
                           int var17 = PacketBuffer.method12923(var1, 1, 136234705);
                           if (0 == var17) {
                              if (var2 != 448842070) {
                                 return;
                              }

                              var3 = method3009(var0, var1, 324541005);
                              var0.field1411[var14].field1390 = (byte)(var0.field1411[var14].field1390 | 2);
                           } else if (var0.method3017(var1, var14, (byte)-93)) {
                              if (var2 != 448842070) {
                                 return;
                              }

                              var0.field1411[var14].field1390 = (byte)(var0.field1411[var14].field1390 | 2);
                           }
                        }
                     }
                  }

                  PacketBuffer.method12926(var1, -2076587269);
                  if (var3 == 0) {
                     var0.field1419 = 0;
                     var0.field1420 = 0;

                     for (int var11 = 1; var11 < 2048; var11++) {
                        if (var2 != 448842070) {
                           throw new IllegalStateException();
                        }

                        var0.field1411[var11].field1390 = (byte)(var0.field1411[var11].field1390 >> 1);
                        if (var0.field1411[var11].vmethod302((byte)11)) {
                           if (var2 != 448842070) {
                              throw new IllegalStateException();
                           }

                           var0.field1423[(var0.field1419 += 1174445611) * -2087374717 - 1] = var11;
                        } else {
                           var0.field1418[(var0.field1420 += -1946918159) * -392147439 - 1] = var11;
                        }
                     }
                  } else if (var2 != 448842070) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException();
                  }
               }
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "df.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;IB)V")
   @ObfuscatedName("as")
   void method3016(PacketBuffer var1, int var2, byte var3) {
      try {
         boolean var10000;
         if (PacketBuffer.method12923(var1, 1, -998577547) == 1) {
            if (var3 >= 6) {
               return;
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var4 = var10000;
         if (var4) {
            if (var3 >= 6) {
               throw new IllegalStateException();
            }

            this.field1418[(this.field1420 += -2126160331) * -764574691 - 1] = var2;
         }

         int var5 = PacketBuffer.method12923(var1, 2, 328478500);
         classDC var6 = this.field1411[var2];
         if (var5 == 0) {
            if (var4) {
               if (var3 < 6) {
                  this.field1416[var2] = false;
               }
            } else if (-2130951373 * client.field920 == var2) {
               if (var3 >= 6) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException();
               }
            } else {
               var6.method2936(-549909894);
               if (PacketBuffer.method12923(var1, 1, -748527848) != 0) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  this.method3017(var1, var2, (byte)-127);
               }

               this.field1418[(this.field1421 = this.field1420 + 535859311) * -117780849 - 1] = var2;
            }
         } else if (var5 == 1) {
            if (var3 >= 6) {
               throw new IllegalStateException();
            } else {
               int var15 = PacketBuffer.method12923(var1, 3, 779393692);
               classKY var18 = var6.field1382;
               if (0 == var15) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  var18.field4055 = var18.field4056 - -1705956773;
                  var18.field4055 -= -1950125731;
               } else if (1 == var15) {
                  var18.field4056 = var18.field4057 - -1950125731;
               } else if (var15 == 2) {
                  var18.field4057 = var18.field4056 + -1705956773;
                  var18.field4057 -= -1950125731;
               } else if (3 == var15) {
                  if (var3 >= 6) {
                     return;
                  }

                  var18.field4056 -= -1705956773;
               } else if (var15 == 4) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  var18.field4056 = var18.field4057 + -1705956773;
               } else if (5 == var15) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  var18.field4055 = var18.field4056 - -1705956773;
                  var18.field4055 += -1950125731;
               } else if (6 == var15) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  var18.field4057 += -1950125731;
               } else if (7 == var15) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  var18.field4056 = var18.field4057 + -1705956773;
                  var18.field4056 = var18.field4057 + -1950125731;
               }

               this.field1416[var2] = true;
               this.field1422[var2] = var6.field1394;
            }
         } else if (var5 == 2) {
            if (var3 >= 6) {
               throw new IllegalStateException();
            } else {
               int var14 = PacketBuffer.method12923(var1, 4, 173498494);
               classKY var17 = var6.field1382;
               if (0 == var14) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  var17.field4055 = var17.field4057 - 883053750;
                  var17.field4055 = var17.field4057 - 394715834;
               } else if (1 == var14) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  var17.field4057 -= -1705956773;
                  var17.field4056 = var17.field4055 - 394715834;
               } else if (var14 == 2) {
                  if (var3 >= 6) {
                     return;
                  }

                  var17.field4055 -= 394715834;
               } else if (3 == var14) {
                  var17.field4057 = var17.field4056 + -1705956773;
                  var17.field4055 = var17.field4057 - 394715834;
               } else if (4 == var14) {
                  var17.field4057 = var17.field4055 + 883053750;
                  var17.field4056 = var17.field4055 - 394715834;
               } else if (5 == var14) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  var17.field4055 = var17.field4056 - 883053750;
                  var17.field4055 = var17.field4056 - -1950125731;
               } else if (6 == var14) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  var17.field4056 += 883053750;
                  var17.field4057 = var17.field4055 - -1950125731;
               } else if (7 == var14) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  var17.field4055 = var17.field4057 - 883053750;
               } else if (var14 == 8) {
                  var17.field4057 = var17.field4056 + 883053750;
               } else if (9 == var14) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  var17.field4056 -= 883053750;
                  var17.field4056 = var17.field4055 + -1950125731;
               } else if (10 == var14) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  var17.field4055 = var17.field4057 + 883053750;
                  var17.field4056 = var17.field4057 + -1950125731;
               } else if (var14 == 11) {
                  if (var3 >= 6) {
                     return;
                  }

                  var17.field4057 = var17.field4055 - 883053750;
                  var17.field4055 = var17.field4057 + 394715834;
               } else if (12 == var14) {
                  var17.field4057 -= -1705956773;
                  var17.field4057 = var17.field4055 + 394715834;
               } else if (13 == var14) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  var17.field4056 = var17.field4055 + 394715834;
               } else if (14 == var14) {
                  if (var3 >= 6) {
                     throw new IllegalStateException();
                  }

                  var17.field4057 = var17.field4056 + -1705956773;
                  var17.field4057 = var17.field4056 + 394715834;
               } else if (var14 == 15) {
                  var17.field4056 = var17.field4055 + 883053750;
                  var17.field4055 = var17.field4057 + 394715834;
               }

               this.field1416[var2] = true;
               this.field1422[var2] = var6.field1394;
            }
         } else {
            int var7 = PacketBuffer.method12923(var1, 1, 1344124283);
            if (var7 == 0) {
               if (var3 < 6) {
                  int var16 = PacketBuffer.method12923(var1, 12, -234384970);
                  int var19 = var16 >> 10;
                  int var20 = var16 >> 5 & 31;
                  if (var20 > 15) {
                     var20 -= 32;
                  }

                  int var21 = var16 & 31;
                  if (var21 > 15) {
                     if (var3 >= 6) {
                        throw new IllegalStateException();
                     }

                     var21 -= 32;
                  }

                  classKY var22 = var6.field1382;
                  var22.field4056 = (byte)(var19 + var22.field4055 * -210579119 & 3) * -1004595279;
                  var22.field4057 = var22.field4056 + var20 * -1705956773;
                  var22.field4056 = var22.field4057 + var21 * -1950125731;
                  this.field1416[var2] = true;
                  this.field1422[var2] = var6.field1394;
               }
            } else {
               int var8 = PacketBuffer.method12923(var1, 30, 1513831361);
               int var9 = classKY.method6605(var8, -1678294639);
               int var10 = classKY.method6594(var8, (byte)-79);
               int var11 = classKY.method6605(var8, -560268380);
               classKY var12 = var6.field1382;
               var12.field4056 = -1004595279 * (byte)(-210579119 * var12.field4055 + var9 & 3);
               var12.field4055 = -1705956773 * (1870919123 * var12.field4055 + var10 & 16383);
               var12.field4055 = -1950125731 * (var12.field4055 * 819227381 + var11 & 16383);
               this.field1416[var2] = true;
               this.field1422[var2] = var6.field1394;
            }
         }
      } catch (RuntimeException var13) {
         throw classEG.method3884(var13, "df.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)V")
   @ObfuscatedName("ab")
   void method3004(PacketBuffer var1, int var2) {
      int var3 = 702114061 * var1.field6955;
      this.field1420 = 0;
      method3008(this, var1, 448842070);
      this.method3047((byte)13);
      this.method3022(641325203);
      this.method3032(var1, -1802336965);
      method3035(this, -2027326321);
      if (702114061 * var1.field6955 - var3 != var2) {
         throw new RuntimeException(832602734 * var1.field6955 - var3 + " " + var2);
      }
   }
}
