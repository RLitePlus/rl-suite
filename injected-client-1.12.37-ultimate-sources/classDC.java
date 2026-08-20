import java.util.ArrayList;
import java.util.Arrays;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("dc")
public class classDC implements classSJ {
   @ObfuscatedName("aj")
   int field1387;
   @ObfuscatedName("af")
   int field1381;
   @ObfuscatedSignature(descriptor = "Lky;")
   @ObfuscatedName("ae")
   classKY field1382;
   @ObfuscatedSignature(descriptor = "Lct;")
   @ObfuscatedName("lp")
   public static classCT field1393;
   @ObfuscatedName("ab")
   byte field1390;
   @ObfuscatedSignature(descriptor = "Lfl;")
   @ObfuscatedName("ao")
   final classFL field1385;
   @ObfuscatedSignature(descriptor = "Lxy;")
   @ObfuscatedName("as")
   classXY field1395;
   @ObfuscatedName("ax")
   String[] field1384;
   @ObfuscatedSignature(descriptor = "Lgt;")
   @ObfuscatedName("ag")
   classGT field1394;
   @ObfuscatedName("ac")
   int field1383;
   @ObfuscatedName("al")
   int field1388;
   @ObfuscatedName("az")
   final ArrayList field1389 = new ArrayList(1);
   @ObfuscatedSignature(descriptor = "Lbz;")
   @ObfuscatedName("aa")
   classBZ field1380;
   @ObfuscatedSignature(descriptor = "Laav;")
   @ObfuscatedName("ay")
   classAAV field1386;
   @ToRemove(unused = "true")
   @ObfuscatedName("bd")
   public static final int field1392 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   public static final int field1391 = 0;

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("az")
   void method2888(byte var1) {
      this.method2982();

      try {
         this.field1386 = null;
         classFL.method4836(this.field1385);
         this.field1395 = null;
         this.field1389.clear();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dc.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lct;I)V")
   @ObfuscatedName("ab")
   void method2900(classCT var1, int var2) {
      this.method2980(var1);

      try {
         this.field1389.add(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dc.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("de")
   void method2963(String[] var1) {
      this.field1384 = Arrays.copyOf(var1, var1.length);

      for (int var2 = 0; var2 < this.field1389.size(); var2++) {
         ((classCT)this.field1389.get(var2)).field1270 = Arrays.copyOf(var1, var1.length);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldc;ILkl;ZLjava/lang/String;[B)V")
   @ObfuscatedName("rf")
   public static void method2953(classDC var0, int var1, classKL var2, boolean var3, String var4, byte[] var5) {
      if (var0 == null) {
         var0.method2908();
      } else {
         boolean var6 = false;
         String var7 = null;

         for (int var8 = 0; var8 < var0.field1389.size(); var8++) {
            classCT var9 = (classCT)var0.field1389.get(var8);
            if (var9.field1283 != null && null != var9.field1285) {
               boolean var10 = false;
               if (var2.field3938 && classQQ.field5597.method1299(var9.field1283, -1181618808)) {
                  var10 = true;
               }

               if (!var10 && 1746877283 * client.field836 == 0 && !var9.field1259) {
                  var6 = true;
                  var7 = var9.field1283.method164(959181506);
                  var9.field1461 = var4.trim();
                  var9.field1460 = (var1 >> 8) * -371272079;
                  var9.field1481 = (var1 & -1627261145) * 77157821;
                  var9.field1459 = 885762115;
                  var9.field1438 = classKV.method6569(var5, (byte)0);
                  var9.field1503 = var3;
                  var9.field1458 = var9.field1480 * 2089132006 != -1873862651 * client.field845
                     && var2.field3938
                     && !client.field929.isEmpty()
                     && var4.toLowerCase().indexOf(client.field929) == -1;
               }
            }
         }

         if (var6 && null != var7) {
            int var11;
            if (var2.field3940) {
               var11 = var3 ? 1760207677 : 1;
            } else {
               var11 = var3 ? 2004733920 : 2;
            }

            if (var2.field3939 * 1654631897 != -1) {
               classPH.method8883(var11, classDG.method3061(-645272838 * var2.field3939, (byte)-25) + var7, var4, 1604011846);
            } else {
               classPH.method8883(var11, var7, var4, 1208268826);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("as")
   void method2907(byte var1) {
      try {
         this.field1389.clear();
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dc.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aq")
   void method2918(int var1, int var2) {
      try {
         this.field1382.field4057 = -1004595279 * var1;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dc.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILkl;ZLjava/lang/String;[B)V")
   @ObfuscatedName("du")
   void method2954(int var1, classKL var2, boolean var3, String var4, byte[] var5) {
      boolean var6 = false;
      String var7 = null;

      for (int var8 = 0; var8 < this.field1389.size(); var8++) {
         classCT var9 = (classCT)this.field1389.get(var8);
         if (var9.field1283 != null && null != var9.field1285) {
            boolean var10 = false;
            if (var2.field3938 && classQQ.field5597.method1299(var9.field1283, -1181618808)) {
               var10 = true;
            }

            if (!var10 && 1746877283 * client.field836 == 0 && !var9.field1259) {
               var6 = true;
               var7 = var9.field1283.method164(1039959427);
               var9.field1461 = var4.trim();
               var9.field1460 = (var1 >> 8) * 743710599;
               var9.field1481 = (var1 & 0xFF) * 77157821;
               var9.field1459 = 136918638;
               var9.field1438 = classKV.method6569(var5, (byte)0);
               var9.field1503 = var3;
               var9.field1458 = var9.field1480 * -1315528093 != -2130951373 * client.field845
                  && var2.field3938
                  && !client.field929.isEmpty()
                  && var4.toLowerCase().indexOf(client.field929) == -1;
            }
         }
      }

      if (var6 && null != var7) {
         int var11;
         if (var2.field3940) {
            var11 = var3 ? 91 : 1;
         } else {
            var11 = var3 ? 90 : 2;
         }

         if (var2.field3939 * 1654631897 != -1) {
            classPH.method8883(var11, classDG.method3061(1654631897 * var2.field3939, (byte)-48) + var7, var4, 1802083530);
         } else {
            classPH.method8883(var11, var7, var4, 1246997290);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("dx")
   void method2946(int var1, int var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < this.field1389.size(); var6++) {
         ((classDH)this.field1389.get(var6)).method3130(var1, client.field855 * 1612595797, var2, var3, var4, var5, 1874940363);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("dh")
   void method2957(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for (int var8 = 0; var8 < this.field1389.size(); var8++) {
         classCT var9 = (classCT)this.field1389.get(var8);
         classDZ var10 = var9.method3166((byte)98);
         int var11 = this.field1382.field4055 * 1870919123 - var10.field1709 * -1866111489;
         int var12 = 819227381 * this.field1382.field4056 - -93506941 * var10.field1708;
         var9.field1491 = -896779669 * (var11 + var1);
         var9.field1493 = (var12 + var2) * 749833987;
         var9.field1492 = 1685383399 * (var3 + var11);
         var9.field1495 = (var12 + var4) * 1065360726;
         var9.field1497 = var5 * -1146707731;
         var9.field1498 = var6 * -1991014563;
         var9.field1494 = 843162844 * var7;
         var9.field1478 = 0;
         var9.method2654(-1805971573 * var9.field1492, -1067628647 * var9.field1495, -1891441366);
         var9.field1274 = this.field1382.field4057 * 294971065;
      }
   }

   classDC(int var1) {
      this.field1381 = 0;
      this.field1382 = new classKY();
      this.field1384 = new String[3];
      this.field1383 = 1618281969;
      this.field1380 = new classBZ();
      this.field1385 = new classFL();
      this.field1388 = 1704655051;
      this.field1387 = -1854144323;
      this.field1386 = null;
      this.field1383 = var1 * -1618281969;
      Arrays.fill(this.field1384, "");
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("aa")
   void method2896(int var1) {
      try {
         this.field1386 = null;
         this.field1388 = 1704655051;
         this.field1387 = -1854144323;
         classFL.method4836(this.field1385);
         this.field1395 = null;
         this.field1394 = classGT.field2680;
         this.field1380.method1376((byte)12);
         Arrays.fill(this.field1384, "");

         for (int var2 = 0; var2 < this.field1389.size(); var2++) {
            classCT var3 = (classCT)this.field1389.get(var2);
            var3.field1477 = null;
            classDH.method3189(var3, -1, -1, this.field1385, 1267335609);
            var3.field1476[0] = this.field1394;
            var3.method3215(this.field1380, -1590653909);
            var3.field1270 = Arrays.copyOf(this.field1384, 3);
            classCU.method2676(var3, -1, 0, -835845865);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dc.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ay")
   @Override
   public int vmethod314(int var1) {
      try {
         return this.field1382.field4057 * -210579119;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dc.ay(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("dw")
   void method2958(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for (int var8 = 0; var8 < this.field1389.size(); var8++) {
         classCT var9 = (classCT)this.field1389.get(var8);
         classDZ var10 = var9.method3166((byte)46);
         int var11 = this.field1382.field4055 * 1870919123 - var10.field1709 * -1444178379;
         int var12 = 819227381 * this.field1382.field4056 - -351145363 * var10.field1708;
         var9.field1491 = -896779669 * (var11 + var1);
         var9.field1493 = (var12 + var2) * 749833987;
         var9.field1492 = 1685383399 * (var3 + var11);
         var9.field1495 = (var12 + var4) * -441508695;
         var9.field1497 = var5 * -1146707731;
         var9.field1498 = var6 * -590932479;
         var9.field1494 = 1569538929 * var7;
         var9.field1478 = 0;
         var9.method2654(801221335 * var9.field1492, -1067628647 * var9.field1495, -1530252674);
         var9.field1274 = this.field1382.field4057 * 294971065;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("ap")
   void method2927(classXY var1, int var2) {
      try {
         this.field1395 = var1;

         for (int var3 = 0; var3 < this.field1389.size(); var3++) {
            if (var2 != 1555374895) {
               return;
            }

            ((classCT)this.field1389.get(var3)).method2620(this.field1395, -1316125685);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dc.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ac")
   @Override
   public boolean vmethod302(byte var1) {
      try {
         boolean var10000;
         if (-157772533 * this.field1381 == -1) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dc.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILxs;I)V")
   @ObfuscatedName("ai")
   void method2934(int var1, classXS var2, int var3) {
      try {
         this.field1380.method1382(var1, var2, (byte)2);
         this.method2936(1041343536);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dc.ai(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("am")
   void method2959(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         for (int var9 = 0; var9 < this.field1389.size(); var9++) {
            if (var8 >= 1409101674) {
               throw new IllegalStateException();
            }

            classCT var10 = (classCT)this.field1389.get(var9);
            classDZ var11 = var10.method3166((byte)8);
            int var12 = this.field1382.field4055 * 1870919123 - var11.field1709 * -1444178379;
            int var13 = 819227381 * this.field1382.field4056 - -351145363 * var11.field1708;
            var10.field1491 = -896779669 * (var12 + var1);
            var10.field1493 = (var13 + var2) * 749833987;
            var10.field1492 = 1685383399 * (var3 + var12);
            var10.field1495 = (var13 + var4) * -441508695;
            var10.field1497 = var5 * -1146707731;
            var10.field1498 = var6 * -590932479;
            var10.field1494 = 1569538929 * var7;
            var10.field1478 = 0;
            var10.method2654(801221335 * var10.field1492, -1067628647 * var10.field1495, -1893287312);
            var10.field1274 = this.field1382.field4057 * 294971065;
         }
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "dc.am(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIZ)V")
   @ObfuscatedName("ds")
   void method2976(int var1, int var2, boolean var3) {
      for (int var4 = 0; var4 < this.field1389.size(); var4++) {
         classCT var5 = classEN.method3930(((classDH)this.field1389.get(var4)).field1480 * -1315528093, client.field814, 142211213);
         if (var5 != null) {
            if (-1 != var1 && var2 != -1) {
               var5.method3090(var1, var2, var3, (byte)1);
            } else {
               var5.method3096(2140242708);
               if (var3) {
                  classDH.method3101(var5, 112932728);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIB)V")
   @ObfuscatedName("ak")
   void method2942(int var1, int var2, int var3, int var4, byte var5) {
      try {
         for (int var6 = 0; var6 < this.field1389.size(); var6++) {
            ((classDH)this.field1389.get(var6)).method3126(var1, var2, client.field855 * 1612595797, var3, var4, 1694102512);
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "dc.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("av")
   void method2947(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         for (int var7 = 0; var7 < this.field1389.size(); var7++) {
            ((classDH)this.field1389.get(var7)).method3130(var1, client.field855 * 1612595797, var2, var3, var4, var5, 1874940363);
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "dc.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bm")
   void method2919(int var1) {
      this.field1382.field4057 = 1062960674 * var1;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("dz")
   void method2964(String[] var1) {
      this.field1384 = Arrays.copyOf(var1, var1.length);

      for (int var2 = 0; var2 < this.field1389.size(); var2++) {
         ((classCT)this.field1389.get(var2)).field1270 = Arrays.copyOf(var1, var1.length);
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;B)V")
   @ObfuscatedName("ah")
   void method2965(String[] var1, byte var2) {
      try {
         this.field1384 = Arrays.copyOf(var1, var1.length);

         for (int var3 = 0; var3 < this.field1389.size(); var3++) {
            if (var2 == 9) {
               throw new IllegalStateException();
            }

            ((classCT)this.field1389.get(var3)).field1270 = Arrays.copyOf(var1, var1.length);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dc.ah(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIBBBBI)V")
   @ObfuscatedName("bn")
   void method2968(int var1, int var2, byte var3, byte var4, byte var5, byte var6, int var7) {
      try {
         this.field1388 = var1 * -1704655051;
         this.field1387 = var2 * 1854144323;
         classFL.method4832(this.field1385, var3, var4, var5, var6);

         for (int var8 = 0; var8 < this.field1389.size(); var8++) {
            classCT var9 = (classCT)this.field1389.get(var8);
            classDH.method3189(var9, this.field1388 * 190337821, this.field1387 * -800586389, this.field1385, 833690333);
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "dc.bn(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIBBZB)V")
   @ObfuscatedName("bx")
   void method2970(int var1, int var2, int var3, byte var4, byte var5, boolean var6, byte var7) {
      try {
         if (null == this.field1386) {
            if (var7 != 0) {
               return;
            }

            this.field1386 = new classAAV();
         }

         classAAV.method276(this.field1386, var1, var2, var3, var4, var5, var6);

         for (int var8 = 0; var8 < this.field1389.size(); var8++) {
            if (var7 != 0) {
               throw new IllegalStateException();
            }

            classCT var9 = (classCT)this.field1389.get(var8);
            if (var9.field1477 == null) {
               if (var7 != 0) {
                  throw new IllegalStateException();
               }

               var9.field1477 = new classAAV();
            }

            classAAV.method276(var9.field1477, var1, var2, var3, var4, var5, var6);
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "dc.bx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   @Override
   public int vmethod309(int var1) {
      try {
         return this.field1382.field4056 * 819227381;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dc.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ao")
   void method2915(int var1, int var2, int var3) {
      try {
         classKY.method6628(this.field1382, -157772533 * this.field1381, var1, var2, 571746028);
         this.field1381 = -1621593763;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dc.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("at")
   void method2950(int var1, int var2) {
      try {
         for (int var3 = 0; var3 < this.field1389.size(); var3++) {
            if (var2 <= 1597272529) {
               throw new IllegalStateException();
            }

            ((classDH)this.field1389.get(var3)).method3132(var1, 1511865987);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "dc.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("co")
   void method2889(int var1) {
      this.field1381 = var1 * 795064858;
      this.field1380.method1376((byte)71);
      this.field1390 = 0;
      this.field1394 = classGT.field2680;
      this.field1395 = null;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("cn")
   void method2930(int var1, int var2) {
      for (int var3 = 0; var3 < this.field1389.size(); var3++) {
         classCU.method2676((classCT)this.field1389.get(var3), var1, var2, -632450447);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cy")
   void method2890(int var1) {
      this.field1381 = var1 * -417712940;
      this.field1380.method1376((byte)85);
      this.field1390 = 0;
      this.field1394 = classGT.field2680;
      this.field1395 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bo")
   void method2897() {
      this.field1386 = null;
      this.field1388 = 1704655051;
      this.field1387 = -1854144323;
      classFL.method4836(this.field1385);
      this.field1395 = null;
      this.field1394 = classGT.field2680;
      this.field1380.method1376((byte)94);
      Arrays.fill(this.field1384, "");

      for (int var1 = 0; var1 < this.field1389.size(); var1++) {
         classCT var2 = (classCT)this.field1389.get(var1);
         var2.field1477 = null;
         classDH.method3189(var2, -1, -1, this.field1385, 924566172);
         var2.field1476[0] = this.field1394;
         var2.method3215(this.field1380, -1281555746);
         var2.field1270 = Arrays.copyOf(this.field1384, 3);
         classCU.method2676(var2, -1, 0, 557357417);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bu")
   void method2898() {
      this.field1386 = null;
      this.field1388 = 1704655051;
      this.field1387 = -1854144323;
      classFL.method4836(this.field1385);
      this.field1395 = null;
      this.field1394 = classGT.field2680;
      this.field1380.method1376((byte)15);
      Arrays.fill(this.field1384, "");

      for (int var1 = 0; var1 < this.field1389.size(); var1++) {
         classCT var2 = (classCT)this.field1389.get(var1);
         var2.field1477 = null;
         classDH.method3189(var2, -1, -1, this.field1385, 272102676);
         var2.field1476[0] = this.field1394;
         var2.method3215(this.field1380, -920730258);
         var2.field1270 = Arrays.copyOf(this.field1384, 3);
         classCU.method2676(var2, -1, 0, 269507892);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cd")
   @Override
   public int vmethod315() {
      return this.field1382.field4057 * -210579119;
   }

   @ObfuscatedSignature(descriptor = "(Lct;)V")
   @ObfuscatedName("bw")
   void method2901(classCT var1) {
      this.field1389.add(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lct;)V")
   @ObfuscatedName("bb")
   void method2903(classCT var1) {
      this.field1389.remove(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldc;IIZ)V")
   @ObfuscatedName("yu")
   public static void method2977(classDC var0, int var1, int var2, boolean var3) {
      if (var0 == null) {
         var0.method2961(var1, var1, var1, var1, var1, var1, var1);
      }

      for (int var4 = 0; var4 < var0.field1389.size(); var4++) {
         classCT var5 = classEN.method3930(((classDH)var0.field1389.get(var4)).field1480 * -1315528093, client.field814, 148539161);
         if (var5 != null) {
            if (-1 != var1 && var2 != -1) {
               var5.method3090(var1, var2, var3, (byte)1);
            } else {
               var5.method3096(2142808769);
               if (var3) {
                  classDH.method3101(var5, 1879378737);
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   void method2891(int var1) {
      this.field1381 = var1 * 1939007803;
      this.field1380.method1376((byte)90);
      this.field1390 = 0;
      this.field1394 = classGT.field2680;
      this.field1395 = null;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("by")
   void method2908() {
      this.field1389.clear();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bq")
   void method2909() {
      this.field1389.clear();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bf")
   void method2910() {
      this.field1389.clear();
   }

   @ObfuscatedSignature(descriptor = "(ILdz;)Lct;")
   @ObfuscatedName("bs")
   classCT method2911(int var1, classDZ var2) {
      classCT var3 = new classCT(var1);
      if (null != this.field1395) {
         var3.method2620(this.field1395, -1316125685);
      }

      var3.field1496 = 0;
      var3.method3215(this.field1380, -1267181609);
      classDH.method3189(var3, this.field1388 * 190337821, this.field1387 * -800586389, this.field1385, 1867802641);
      if (null != this.field1386) {
         var3.field1477 = new classAAV(this.field1386);
      }

      var3.field1476[0] = this.field1394;
      var3.field1274 = this.field1382.field4057 * 294971065;
      var3.field1439 = -1063547535 * var2.field1699;
      var3.field1270 = Arrays.copyOf(var3.field1270, var3.field1270.length);
      var3.method3113(
         1870919123 * this.field1382.field4055 - var2.field1709 * -1444178379, 819227381 * this.field1382.field4056 - var2.field1708 * -351145363, 527441438
      );
      return var3;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bd")
   @Override
   public boolean vmethod303() {
      return -157772533 * this.field1381 == -1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bl")
   @Override
   public boolean vmethod304() {
      return 1153293943 * this.field1381 == -1;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bv")
   void method2913() {
      this.field1381 = this.field1382.method6623(39949557) * 1621593763;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bg")
   void method2936(int var1) {
      try {
         for (int var2 = 0; var2 < this.field1389.size(); var2++) {
            if (var1 <= 1002757669) {
               throw new IllegalStateException();
            }

            ((classDH)this.field1389.get(var2)).method3215(this.field1380, -429093985);
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dc.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldc;ILkl;ZLjava/lang/String;[BI)V")
   @ObfuscatedName("wj")
   public static void method2955(classDC var0, int var1, classKL var2, boolean var3, String var4, byte[] var5, int var6) {
      if (var0 == null) {
         var0.method2956(var1, var2, var3, var4, var5, var1);
      } else {
         try {
            boolean var7 = false;
            String var8 = null;

            for (int var9 = 0; var9 < var0.field1389.size(); var9++) {
               if (var6 >= -374161745) {
                  return;
               }

               classCT var10 = (classCT)var0.field1389.get(var9);
               if (var10.field1283 != null) {
                  if (var6 >= -374161745) {
                     throw new IllegalStateException();
                  }

                  if (null != var10.field1285) {
                     if (var6 >= -374161745) {
                        return;
                     }

                     boolean var11 = false;
                     if (var2.field3938 && classQQ.field5597.method1299(var10.field1283, -1181618808)) {
                        if (var6 >= -374161745) {
                           throw new IllegalStateException();
                        }

                        var11 = true;
                     }

                     if (!var11) {
                        if (var6 >= -374161745) {
                           throw new IllegalStateException();
                        }

                        if (1746877283 * client.field836 == 0 && !var10.field1259) {
                           if (var6 >= -374161745) {
                              throw new IllegalStateException();
                           }

                           boolean var10001;
                           label131: {
                              var7 = true;
                              var8 = var10.field1283.method164(1902618827);
                              var10.field1461 = var4.trim();
                              var10.method3285(-1);
                              var10.field1460 = (var1 >> 8) * 743710599;
                              var10.field1481 = (var1 & 0xFF) * 77157821;
                              var10.field1459 = 136918638;
                              var10.field1438 = classKV.method6569(var5, (byte)0);
                              var10.field1503 = var3;
                              if (var10.field1480 * -1315528093 != -2130951373 * client.field845) {
                                 if (var6 >= -374161745) {
                                    throw new IllegalStateException();
                                 }

                                 if (var2.field3938) {
                                    if (var6 >= -374161745) {
                                       throw new IllegalStateException();
                                    }

                                    if (!client.field929.isEmpty()) {
                                       if (var6 >= -374161745) {
                                          throw new IllegalStateException();
                                       }

                                       if (var4.toLowerCase().indexOf(client.field929) == -1) {
                                          if (var6 >= -374161745) {
                                             throw new IllegalStateException();
                                          }

                                          var10001 = true;
                                          break label131;
                                       }
                                    }
                                 }
                              }

                              var10001 = false;
                           }

                           var10.field1458 = var10001;
                        }
                     }
                  }
               }
            }

            if (var7) {
               if (var6 >= -374161745) {
                  return;
               }

               if (null != var8) {
                  if (var6 >= -374161745) {
                     throw new IllegalStateException();
                  }

                  byte var13;
                  if (var2.field3940) {
                     if (var6 >= -374161745) {
                        throw new IllegalStateException();
                     }

                     byte var10000;
                     if (var3) {
                        if (var6 >= -374161745) {
                           throw new IllegalStateException();
                        }

                        var10000 = 91;
                     } else {
                        var10000 = 1;
                     }

                     var13 = var10000;
                  } else {
                     byte var14;
                     if (var3) {
                        if (var6 >= -374161745) {
                           return;
                        }

                        var14 = 90;
                     } else {
                        var14 = 2;
                     }

                     var13 = var14;
                  }

                  if (var2.field3939 * 1654631897 != -1) {
                     if (var6 >= -374161745) {
                        throw new IllegalStateException();
                     }

                     classPH.method8883(var13, classDG.method3061(1654631897 * var2.field3939, (byte)-21) + var8, var4, 1742813307);
                  } else {
                     classPH.method8883(var13, var8, var4, 2094937243);
                  }
               }
            }
         } catch (RuntimeException var12) {
            throw classEG.method3884(var12, "dc.an(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bz")
   void method2916(int var1, int var2) {
      classKY.method6628(this.field1382, -157772533 * this.field1381, var1, var2, 235990715);
      this.field1381 = -1621593763;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ar")
   void method2892(int var1) {
      this.field1381 = var1 * 1621593763;
      this.field1380.method1376((byte)43);
      this.field1390 = 0;
      this.field1394 = classGT.field2680;
      this.field1395 = null;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cu")
   @Override
   public int vmethod305() {
      return this.field1382.field4055 * 1870919123;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cb")
   @Override
   public int vmethod306() {
      return this.field1382.field4055 * 1870919123;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ct")
   @Override
   public int vmethod310() {
      return this.field1382.field4056 * -417766795;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cp")
   @Override
   public int vmethod311() {
      return this.field1382.field4056 * 60546842;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cq")
   @Override
   public int vmethod312() {
      return this.field1382.field4056 * -921446027;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cl")
   @Override
   public int vmethod313() {
      return this.field1382.field4056 * 819227381;
   }

   @ObfuscatedSignature(descriptor = "(IIZI)V")
   @ObfuscatedName("bp")
   void method2978(int var1, int var2, boolean var3, int var4) {
      try {
         for (int var5 = 0; var5 < this.field1389.size(); var5++) {
            if (var4 == 811047921) {
               return;
            }

            classCT var6 = classEN.method3930(((classDH)this.field1389.get(var5)).field1480 * -1315528093, client.field814, 408323482);
            if (var6 != null) {
               if (var4 == 811047921) {
                  throw new IllegalStateException();
               }

               if (-1 != var1) {
                  if (var4 == 811047921) {
                     return;
                  }

                  if (var2 != -1) {
                     var6.method3090(var1, var2, var3, (byte)1);
                     continue;
                  }

                  if (var4 == 811047921) {
                     throw new IllegalStateException();
                  }
               }

               var6.method3096(2128205205);
               if (var3) {
                  classDH.method3101(var6, -292214652);
               }
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "dc.bp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ce")
   void method2943(int var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < this.field1389.size(); var5++) {
         ((classDH)this.field1389.get(var5)).method3126(var1, var2, client.field855 * 1612595797, var3, var4, 731061816);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bt")
   void method2920(int var1) {
      this.field1382.field4057 = -1004595279 * var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cr")
   @Override
   public int vmethod307() {
      return this.field1382.field4055 * -880483854;
   }

   @ObfuscatedSignature(descriptor = "(Lgt;)V")
   @ObfuscatedName("ck")
   void method2922(classGT var1) {
      for (int var2 = 0; var2 < this.field1389.size(); var2++) {
         classCT var3 = (classCT)this.field1389.get(var2);
         classDZ var4 = var3.method3166((byte)-100);
         int var5 = -1954501885 * this.field1382.field4055 - var4.field1709 * -1444178379;
         int var6 = -1164115375 * this.field1382.field4056 - -351145363 * var4.field1708;
         classGT var7 = var1;
         int var8 = 1260918818;
         short var9 = 11776;
         if (0 == var4.field1699 * 2140889407
            && client.field849 * 682945008 == this.field1383 * 431142127
            && classKU.field4025 == classLE.field4126
            && (
               var3.field1487 * -1547553299 < -1252169666
                  || var3.field1489 * -1998736940 < -1527215957
                  || 221723667 * var3.field1487 >= -910152856
                  || var3.field1489 * -1272026483 >= -2048117110
            )) {
            var7 = classGT.field2678;
         }

         var3.field1274 = 294971065 * this.field1382.field4057;
         if (var7 == classGT.field2678) {
            var3.method3113(var5, var6, 527441438);
         } else {
            var3.method2650(var4, var5, var6, var7, -28362462);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("cs")
   void method2921(int var1) {
      this.field1382.field4057 = -1004595279 * var1;
   }

   @ObfuscatedSignature(descriptor = "(Lgt;)V")
   @ObfuscatedName("ca")
   void method2923(classGT var1) {
      for (int var2 = 0; var2 < this.field1389.size(); var2++) {
         classCT var3 = (classCT)this.field1389.get(var2);
         classDZ var4 = var3.method3166((byte)-78);
         int var5 = 1870919123 * this.field1382.field4055 - var4.field1709 * -1444178379;
         int var6 = 819227381 * this.field1382.field4056 - -351145363 * var4.field1708;
         classGT var7 = var1;
         short var8 = 1536;
         short var9 = 11776;
         if (0 == var4.field1699 * 2140889407
            && client.field849 * 1778071523 == this.field1383 * 431142127
            && classKU.field4025 == classLE.field4126
            && (
               var3.field1487 * -1547553299 < 1536
                  || var3.field1489 * -1272026483 < 1536
                  || -1547553299 * var3.field1487 >= 11776
                  || var3.field1489 * -1272026483 >= 11776
            )) {
            var7 = classGT.field2678;
         }

         var3.field1274 = 294971065 * this.field1382.field4057;
         if (var7 == classGT.field2678) {
            var3.method3113(var5, var6, 527441438);
         } else {
            var3.method2650(var4, var5, var6, var7, 1763235575);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldc;II)V")
   @ObfuscatedName("pz")
   public static void method2893(classDC var0, int var1, int var2) {
      if (var0 == null) {
         var0.method2895(var1, var1);
      } else {
         try {
            var0.field1381 = var1 * 1621593763;
            var0.field1380.method1376((byte)126);
            var0.field1390 = 0;
            var0.field1394 = classGT.field2680;
            var0.field1395 = null;
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "dc.af(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("cc")
   void method2928(classXY var1) {
      this.field1395 = var1;

      for (int var2 = 0; var2 < this.field1389.size(); var2++) {
         ((classCT)this.field1389.get(var2)).method2620(this.field1395, -1316125685);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("cf")
   void method2929(classXY var1) {
      this.field1395 = var1;

      for (int var2 = 0; var2 < this.field1389.size(); var2++) {
         ((classCT)this.field1389.get(var2)).method2620(this.field1395, -1316125685);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldc;IIIBBZ)V")
   @ObfuscatedName("ms")
   public static void method2971(classDC var0, int var1, int var2, int var3, byte var4, byte var5, boolean var6) {
      if (null == var0.field1386) {
         var0.field1386 = new classAAV();
      }

      classAAV.method276(var0.field1386, var1, var2, var3, var4, var5, var6);

      for (int var7 = 0; var7 < var0.field1389.size(); var7++) {
         classCT var8 = (classCT)var0.field1389.get(var7);
         if (var8.field1477 == null) {
            var8.field1477 = new classAAV();
         }

         classAAV.method276(var8.field1477, var1, var2, var3, var4, var5, var6);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lct;)V")
   @ObfuscatedName("ba")
   void method2902(classCT var1) {
      this.field1389.add(var1);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ch")
   void method2931(int var1, int var2) {
      for (int var3 = 0; var3 < this.field1389.size(); var3++) {
         classCU.method2676((classCT)this.field1389.get(var3), var1, var2, 555794902);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILxs;)V")
   @ObfuscatedName("cz")
   void method2935(int var1, classXS var2) {
      this.field1380.method1382(var1, var2, (byte)2);
      this.method2936(1591066591);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cg")
   void method2937() {
      for (int var1 = 0; var1 < this.field1389.size(); var1++) {
         ((classDH)this.field1389.get(var1)).method3215(this.field1380, -1243005492);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cw")
   void method2938() {
      for (int var1 = 0; var1 < this.field1389.size(); var1++) {
         ((classDH)this.field1389.get(var1)).method3215(this.field1380, -571836897);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("cj")
   void method2939(String var1) {
      boolean var2 = var1.charAt(0) == '~';
      if (var2) {
         var1 = var1.substring(1);
      }

      classAAE var3 = null;

      for (int var4 = 0; var4 < this.field1389.size(); var4++) {
         classCT var5 = (classCT)this.field1389.get(var4);
         var5.field1503 = false;
         var5.field1460 = 0;
         var5.field1481 = 0;
         var5.field1459 = 136918638;
         var5.field1461 = var1;
         var3 = var5.field1283;
      }

      if (var3 != null) {
         if (var2 || -2130951373 * client.field845 == 431142127 * this.field1383) {
            classPH.method8883(2, var3.method164(1579558494), var1, 1519206609);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lct;)V")
   @ObfuscatedName("be")
   void method2904(classCT var1) {
      this.field1389.remove(var1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cv")
   @Override
   public int vmethod316() {
      return this.field1382.field4057 * -210579119;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("al")
   @Override
   public int vmethod308(int var1) {
      try {
         return this.field1382.field4055 * 1870919123;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dc.al(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldc;I)V")
   @ObfuscatedName("pi")
   public static void method2951(classDC var0, int var1) {
      for (int var2 = 0; var2 < var0.field1389.size(); var2++) {
         ((classDH)var0.field1389.get(var2)).method3132(var1, -1950012684);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("cm")
   void method2944(int var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < this.field1389.size(); var5++) {
         ((classDH)this.field1389.get(var5)).method3126(var1, var2, client.field855 * 1612595797, var3, var4, 2138307786);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cp")
   public void method2982() {
      field1393 = null;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("dd")
   void method2948(int var1, int var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < this.field1389.size(); var6++) {
         ((classDH)this.field1389.get(var6)).method3130(var1, client.field855 * 1612595797, var2, var3, var4, var5, 1874940363);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lct;)V")
   @ObfuscatedName("bk")
   public void method2981(classCT var1) {
      classOE.field4843.getCallbacks().post(new PlayerDespawned(var1));
      if (field1393 == var1) {
         field1393 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("dm")
   void method2949(int var1, int var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 < this.field1389.size(); var6++) {
         ((classDH)this.field1389.get(var6)).method3130(var1, client.field855 * 1612595797, var2, var3, var4, var5, 1874940363);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bh")
   void method2917(int var1, int var2) {
      classKY.method6628(this.field1382, -157772533 * this.field1381, var1, var2, -715956810);
      this.field1381 = -1621593763;
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("dr")
   void method2960(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for (int var8 = 0; var8 < this.field1389.size(); var8++) {
         classCT var9 = (classCT)this.field1389.get(var8);
         classDZ var10 = var9.method3166((byte)41);
         int var11 = this.field1382.field4055 * 1870919123 - var10.field1709 * -1444178379;
         int var12 = 819227381 * this.field1382.field4056 - -351145363 * var10.field1708;
         var9.field1491 = -896779669 * (var11 + var1);
         var9.field1493 = (var12 + var2) * 749833987;
         var9.field1492 = 1685383399 * (var3 + var11);
         var9.field1495 = (var12 + var4) * -441508695;
         var9.field1497 = var5 * -1146707731;
         var9.field1498 = var6 * -590932479;
         var9.field1494 = 1569538929 * var7;
         var9.field1478 = 0;
         var9.method2654(801221335 * var9.field1492, -1067628647 * var9.field1495, 624185393);
         var9.field1274 = this.field1382.field4057 * 294971065;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldc;III)V")
   @ObfuscatedName("zw")
   public static void method2932(classDC var0, int var1, int var2, int var3) {
      if (var0 == null) {
         var0.method2933(var1, var1, var1);
      } else {
         try {
            for (int var4 = 0; var4 < var0.field1389.size(); var4++) {
               classCU.method2676((classCT)var0.field1389.get(var4), var1, var2, -1274605594);
            }
         } catch (RuntimeException var5) {
            throw classEG.method3884(var5, "dc.au(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("dk")
   void method2961(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for (int var8 = 0; var8 < this.field1389.size(); var8++) {
         classCT var9 = (classCT)this.field1389.get(var8);
         classDZ var10 = var9.method3166((byte)-113);
         int var11 = this.field1382.field4055 * 1870919123 - var10.field1709 * -1444178379;
         int var12 = 819227381 * this.field1382.field4056 - -351145363 * var10.field1708;
         var9.field1491 = -896779669 * (var11 + var1);
         var9.field1493 = (var12 + var2) * 749833987;
         var9.field1492 = 1685383399 * (var3 + var11);
         var9.field1495 = (var12 + var4) * -441508695;
         var9.field1497 = var5 * -1146707731;
         var9.field1498 = var6 * -590932479;
         var9.field1494 = 1569538929 * var7;
         var9.field1478 = 0;
         var9.method2654(801221335 * var9.field1492, -1067628647 * var9.field1495, -2129529733);
         var9.field1274 = this.field1382.field4057 * 294971065;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldc;I)V")
   @ObfuscatedName("wv")
   public static void method2952(classDC var0, int var1) {
      if (var0 == null) {
         var0.vmethod308(var1);
      }

      for (int var2 = 0; var2 < var0.field1389.size(); var2++) {
         ((classDH)var0.field1389.get(var2)).method3132(var1, 496850727);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("aw")
   void method2940(String var1, int var2) {
      try {
         boolean var10000;
         if (var1.charAt(0) == '~') {
            if (var2 == -1017549562) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var3 = var10000;
         if (var3) {
            if (var2 == -1017549562) {
               throw new IllegalStateException();
            }

            var1 = var1.substring(1);
         }

         classAAE var4 = null;

         for (int var5 = 0; var5 < this.field1389.size(); var5++) {
            if (var2 == -1017549562) {
               throw new IllegalStateException();
            }

            classCT var6 = (classCT)this.field1389.get(var5);
            var6.field1503 = false;
            var6.field1460 = 0;
            var6.field1481 = 0;
            var6.field1459 = 136918638;
            var6.field1461 = var1;
            var6.method3285(-1);
            var4 = var6.field1283;
         }

         if (var4 == null) {
            if (var2 != -1017549562) {
               ;
            }
         } else {
            if (!var3) {
               if (var2 == -1017549562) {
                  throw new IllegalStateException();
               }

               if (-2130951373 * client.field845 != 431142127 * this.field1383) {
                  return;
               }

               if (var2 == -1017549562) {
                  throw new IllegalStateException();
               }
            }

            classPH.method8883(2, var4.method164(1965974550), var1, 1858926038);
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "dc.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ci")
   void method2941(String var1) {
      boolean var2 = var1.charAt(0) == '~';
      if (var2) {
         var1 = var1.substring(1);
      }

      classAAE var3 = null;

      for (int var4 = 0; var4 < this.field1389.size(); var4++) {
         classCT var5 = (classCT)this.field1389.get(var4);
         var5.field1503 = false;
         var5.field1460 = 0;
         var5.field1481 = 0;
         var5.field1459 = 136918638;
         var5.field1461 = var1;
         var3 = var5.field1283;
      }

      if (var3 != null) {
         if (var2 || -1567029375 * client.field845 == 431142127 * this.field1383) {
            classPH.method8883(2, var3.method164(1646002436), var1, 1754074239);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILdz;I)Lct;")
   @ObfuscatedName("ax")
   classCT method2912(int var1, classDZ var2, int var3) {
      try {
         classCT var4 = new classCT(var1);
         if (null != this.field1395) {
            if (var3 != 844956059) {
               throw new IllegalStateException();
            }

            var4.method2620(this.field1395, -1316125685);
         }

         var4.field1496 = 0;
         var4.method3215(this.field1380, 1307355397);
         classDH.method3189(var4, this.field1388 * 190337821, this.field1387 * -800586389, this.field1385, 2032678852);
         if (null != this.field1386) {
            if (var3 != 844956059) {
               throw new IllegalStateException();
            }

            var4.field1477 = new classAAV(this.field1386);
         }

         var4.field1476[0] = this.field1394;
         var4.field1274 = this.field1382.field4057 * 294971065;
         var4.field1439 = -1063547535 * var2.field1699;
         var4.field1270 = Arrays.copyOf(var4.field1270, var4.field1270.length);
         var4.method3113(
            1870919123 * this.field1382.field4055 - var2.field1709 * -1444178379, 819227381 * this.field1382.field4056 - var2.field1708 * -351145363, 527441438
         );
         return var4;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "dc.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bk")
   void method2899() {
      this.field1386 = null;
      this.field1388 = 1704655051;
      this.field1387 = -1854144323;
      classFL.method4836(this.field1385);
      this.field1395 = null;
      this.field1394 = classGT.field2680;
      this.field1380.method1376((byte)45);
      Arrays.fill(this.field1384, "");

      for (int var1 = 0; var1 < this.field1389.size(); var1++) {
         classCT var2 = (classCT)this.field1389.get(var1);
         var2.field1477 = null;
         classDH.method3189(var2, -1, -1, this.field1385, 1394613206);
         var2.field1476[0] = this.field1394;
         var2.method3215(this.field1380, -540660818);
         var2.field1270 = Arrays.copyOf(this.field1384, 3);
         classCU.method2676(var2, -1, 0, -177813505);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldc;Lgt;B)V")
   @ObfuscatedName("rx")
   public static void method2924(classDC var0, classGT var1, byte var2) {
      if (var0 == null) {
         var0.method2925(var1, var2);
      } else {
         try {
            for (int var3 = 0; var3 < var0.field1389.size(); var3++) {
               if (var2 >= 6) {
                  throw new IllegalStateException();
               }

               classCT var4 = (classCT)var0.field1389.get(var3);
               classDZ var5 = var4.method3166((byte)-87);
               int var6 = 1870919123 * var0.field1382.field4055 - var5.field1709 * -1444178379;
               int var7 = 819227381 * var0.field1382.field4056 - -351145363 * var5.field1708;
               classGT var8 = var1;
               short var9 = 1536;
               short var10 = 11776;
               if (0 == var5.field1699 * 2140889407) {
                  if (var2 >= 6) {
                     throw new IllegalStateException();
                  }

                  label64:
                  if (client.field849 * 1778071523 == var0.field1383 * 431142127 && classKU.field4025 == classLE.field4126) {
                     if (var2 >= 6) {
                        return;
                     }

                     if (var4.field1487 * -1547553299 >= 1536) {
                        if (var2 >= 6) {
                           throw new IllegalStateException();
                        }

                        if (var4.field1489 * -1272026483 >= 1536 && -1547553299 * var4.field1487 < 11776) {
                           if (var2 >= 6) {
                              throw new IllegalStateException();
                           }

                           if (var4.field1489 * -1272026483 < 11776) {
                              break label64;
                           }
                        }
                     }

                     var8 = classGT.field2678;
                  }
               }

               var4.field1274 = 294971065 * var0.field1382.field4057;
               if (var8 == classGT.field2678) {
                  if (var2 >= 6) {
                     throw new IllegalStateException();
                  }

                  var4.method3113(var6, var7, 527441438);
               } else {
                  var4.method2650(var5, var6, var7, var8, 1287090741);
               }
            }
         } catch (RuntimeException var11) {
            throw classEG.method3884(var11, "dc.ad(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("dv")
   void method2966(String[] var1) {
      this.field1384 = Arrays.copyOf(var1, var1.length);

      for (int var2 = 0; var2 < this.field1389.size(); var2++) {
         ((classCT)this.field1389.get(var2)).field1270 = Arrays.copyOf(var1, var1.length);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIBBBB)V")
   @ObfuscatedName("do")
   void method2969(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
      this.field1388 = var1 * -1704655051;
      this.field1387 = var2 * -2104600102;
      classFL.method4832(this.field1385, var3, var4, var5, var6);

      for (int var7 = 0; var7 < this.field1389.size(); var7++) {
         classCT var8 = (classCT)this.field1389.get(var7);
         classDH.method3189(var8, this.field1388 * 190337821, this.field1387 * 814151382, this.field1385, 1706564511);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldc;[Ljava/lang/String;)V")
   @ObfuscatedName("ep")
   public static void method2967(classDC var0, String[] var1) {
      if (var0 == null) {
         var0.vmethod311();
      }

      var0.field1384 = Arrays.copyOf(var1, var1.length);

      for (int var2 = 0; var2 < var0.field1389.size(); var2++) {
         ((classCT)var0.field1389.get(var2)).field1270 = Arrays.copyOf(var1, var1.length);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bj")
   void method2914(int var1) {
      try {
         this.field1381 = this.field1382.method6623(39949557) * 1621593763;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dc.aa(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIBBZ)V")
   @ObfuscatedName("dl")
   void method2972(int var1, int var2, int var3, byte var4, byte var5, boolean var6) {
      if (null == this.field1386) {
         this.field1386 = new classAAV();
      }

      classAAV.method276(this.field1386, var1, var2, var3, var4, var5, var6);

      for (int var7 = 0; var7 < this.field1389.size(); var7++) {
         classCT var8 = (classCT)this.field1389.get(var7);
         if (var8.field1477 == null) {
            var8.field1477 = new classAAV();
         }

         classAAV.method276(var8.field1477, var1, var2, var3, var4, var5, var6);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldc;IIIIIII)V")
   @ObfuscatedName("og")
   public static void method2962(classDC var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var0 == null) {
         var0.method2960(var1, var1, var1, var1, var1, var1, var1);
      }

      for (int var8 = 0; var8 < var0.field1389.size(); var8++) {
         classCT var9 = (classCT)var0.field1389.get(var8);
         classDZ var10 = var9.method3166((byte)-100);
         int var11 = var0.field1382.field4055 * 1870919123 - var10.field1709 * -1444178379;
         int var12 = 819227381 * var0.field1382.field4056 - -351145363 * var10.field1708;
         var9.field1491 = -896779669 * (var11 + var1);
         var9.field1493 = (var12 + var2) * 749833987;
         var9.field1492 = 1685383399 * (var3 + var11);
         var9.field1495 = (var12 + var4) * -441508695;
         var9.field1497 = var5 * -1146707731;
         var9.field1498 = var6 * -590932479;
         var9.field1494 = 1569538929 * var7;
         var9.field1478 = 0;
         var9.method2654(801221335 * var9.field1492, -1067628647 * var9.field1495, -1669662179);
         var9.field1274 = var0.field1382.field4057 * 294971065;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZ)V")
   @ObfuscatedName("df")
   void method2973(int var1, int var2, int var3, int var4, boolean var5) {
      for (int var6 = 0; var6 < this.field1389.size(); var6++) {
         classDH.method3134((classDH)this.field1389.get(var6), var1, var2, var3, var4, var5, (byte)71);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIZI)V")
   @ObfuscatedName("bc")
   void method2974(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         for (int var7 = 0; var7 < this.field1389.size(); var7++) {
            if (var6 <= 802196222) {
               throw new IllegalStateException();
            }

            classDH.method3134((classDH)this.field1389.get(var7), var1, var2, var3, var4, var5, (byte)-42);
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "dc.bc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("cx")
   void method2945(int var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < this.field1389.size(); var5++) {
         ((classDH)this.field1389.get(var5)).method3126(var1, var2, client.field855 * 1612595797, var3, var4, 1181887244);
      }
   }

   @ObfuscatedSignature(descriptor = "(S)V")
   @ObfuscatedName("ab")
   public static void method2926(short var0) {
      try {
         classJZ.method6431(classOM.field4966);
         classJZ.method6431(classOM.field4968);
         classJZ.method6431(classOM.field4972);
         classJZ.method6431(classOM.field4967);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "dc.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldc;Lct;B)V")
   @ObfuscatedName("yj")
   public static void method2905(classDC var0, classCT var1, byte var2) {
      if (var0 == null) {
         var0.method2906(var1, var2);
      }

      var0.method2981(var1);

      try {
         var0.field1389.remove(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dc.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("ge")
   static void method2979(String var0, byte var1) {
      try {
         classQW.field5622 = var0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "dc.ge(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lct;)V")
   @ObfuscatedName("cv")
   public void method2980(classCT var1) {
      if (var1.getId() == client.field845 * -2130951373) {
         field1393 = var1;
      }

      classOE.field4843.getCallbacks().postDeferred(new PlayerSpawned(var1));
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("au")
   void method2933(int var1, int var2, int var3) {
      try {
         for (int var4 = 0; var4 < this.field1389.size(); var4++) {
            classCU.method2676((classCT)this.field1389.get(var4), var1, var2, -1274605594);
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "dc.au(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldc;I)V")
   @ObfuscatedName("wg")
   public static void method2894(classDC var0, int var1) {
      if (var0 == null) {
         var0.method2948(var1, var1, var1, var1, var1);
      } else {
         var0.field1381 = var1 * 1621593763;
         var0.field1380.method1376((byte)73);
         var0.field1390 = 0;
         var0.field1394 = classGT.field2680;
         var0.field1395 = null;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("af")
   void method2895(int var1, int var2) {
      try {
         this.field1387 = var1 * 1621593763;
         this.field1380.method1376((byte)126);
         this.field1390 = 0;
         this.field1394 = classGT.field2679;
         this.field1395 = null;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dc.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgt;B)V")
   @ObfuscatedName("ad")
   void method2925(classGT var1, byte var2) {
      try {
         for (int var3 = 0; var3 < this.field1389.size(); var3++) {
            if (var2 >= 6) {
               throw new IllegalStateException();
            }

            classCT var4 = (classCT)this.field1389.get(var3);
            classDZ var5 = var4.method3166((byte)-87);
            int var6 = 1870919123 * this.field1382.field4055 - var5.field1708 * -1444178379;
            int var7 = 819227381 * this.field1382.field4057 - -351145363 * var5.field1709;
            classGT var8 = var1;
            short var9 = 1536;
            short var10 = 11776;
            if (0 == var5.field1699 * 2140889407) {
               if (var2 >= 6) {
                  throw new IllegalStateException();
               }

               label62:
               if (client.field957 * 1778071523 == this.field1387 * 431142127 && classKU.field4025 == classLE.field4126) {
                  if (var2 >= 6) {
                     return;
                  }

                  if (var4.field1455 * -1547553299 >= 1536) {
                     if (var2 >= 6) {
                        throw new IllegalStateException();
                     }

                     if (var4.field1449 * -1272026483 >= 1536 && -1547553299 * var4.field1448 < 11776) {
                        if (var2 >= 6) {
                           throw new IllegalStateException();
                        }

                        if (var4.field1452 * -1272026483 < 11776) {
                           break label62;
                        }
                     }
                  }

                  var8 = classGT.field2680;
               }
            }

            var4.field1277 = 294971065 * this.field1382.field4056;
            if (var8 == classGT.field2681) {
               if (var2 >= 6) {
                  throw new IllegalStateException();
               }

               var4.method3113(var6, var7, 527441438);
            } else {
               var4.method2650(var5, var6, var7, var8, 1287090741);
            }
         }
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "dc.ad(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldc;IIIIZ)V")
   @ObfuscatedName("gk")
   public static void method2975(classDC var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var0 == null) {
         var0.method2943(var1, var1, var1, var1);
      }

      for (int var6 = 0; var6 < var0.field1389.size(); var6++) {
         classDH.method3134((classDH)var0.field1389.get(var6), var1, var2, var3, var4, var5, (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "(ILkl;ZLjava/lang/String;[BI)V")
   @ObfuscatedName("an")
   void method2956(int var1, classKL var2, boolean var3, String var4, byte[] var5, int var6) {
      try {
         boolean var7 = false;
         String var8 = null;

         for (int var9 = 0; var9 < this.field1389.size(); var9++) {
            if (var6 >= -374161745) {
               return;
            }

            classCT var10 = (classCT)this.field1389.get(var9);
            if (var10.field1283 != null) {
               if (var6 >= -374161745) {
                  throw new IllegalStateException();
               }

               if (null != var10.field1285) {
                  if (var6 >= -374161745) {
                     return;
                  }

                  boolean var11 = false;
                  if (var2.field3940 && classQQ.field5597.method1299(var10.field1283, -1181618808)) {
                     if (var6 >= -374161745) {
                        throw new IllegalStateException();
                     }

                     var11 = true;
                  }

                  if (!var11) {
                     if (var6 >= -374161745) {
                        throw new IllegalStateException();
                     }

                     if (1746877283 * client.field894 == 0 && !var10.field1264) {
                        if (var6 >= -374161745) {
                           throw new IllegalStateException();
                        }

                        boolean var10001;
                        label129: {
                           var7 = true;
                           var8 = var10.field1283.method166(1902618827);
                           var10.field1461 = var4.trim();
                           var10.setAnimation(-1);
                           var10.field1478 = (var1 >> 8) * 743710599;
                           var10.field1448 = (var1 & 0xFF) * 77157821;
                           var10.field1493 = 136918638;
                           var10.field1474 = classKV.method6569(var5, (byte)0);
                           var10.field1503 = var3;
                           if (var10.field1491 * -1315528093 != -2130951373 * client.field815) {
                              if (var6 >= -374161745) {
                                 throw new IllegalStateException();
                              }

                              if (var2.field3940) {
                                 if (var6 >= -374161745) {
                                    throw new IllegalStateException();
                                 }

                                 if (!client.field880.isEmpty()) {
                                    if (var6 >= -374161745) {
                                       throw new IllegalStateException();
                                    }

                                    if (var4.toLowerCase().indexOf(client.field983) == -1) {
                                       if (var6 >= -374161745) {
                                          throw new IllegalStateException();
                                       }

                                       var10001 = true;
                                       break label129;
                                    }
                                 }
                              }
                           }

                           var10001 = false;
                        }

                        var10.field1503 = var10001;
                     }
                  }
               }
            }
         }

         if (var7) {
            if (var6 >= -374161745) {
               return;
            }

            if (null != var8) {
               if (var6 >= -374161745) {
                  throw new IllegalStateException();
               }

               byte var13;
               if (var2.field3940) {
                  if (var6 >= -374161745) {
                     throw new IllegalStateException();
                  }

                  byte var10000;
                  if (var3) {
                     if (var6 >= -374161745) {
                        throw new IllegalStateException();
                     }

                     var10000 = 91;
                  } else {
                     var10000 = 1;
                  }

                  var13 = var10000;
               } else {
                  byte var14;
                  if (var3) {
                     if (var6 >= -374161745) {
                        return;
                     }

                     var14 = 90;
                  } else {
                     var14 = 2;
                  }

                  var13 = var14;
               }

               if (var2.field3939 * 1654631897 != -1) {
                  if (var6 >= -374161745) {
                     throw new IllegalStateException();
                  }

                  classPH.method8883(var13, classDG.method3061(1654631897 * var2.field3939, (byte)-21) + var8, var4, 1742813307);
               } else {
                  classPH.method8883(var13, var8, var4, 2094937243);
               }
            }
         }
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "dc.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lct;B)V")
   @ObfuscatedName("ag")
   void method2906(classCT var1, byte var2) {
      this.method2981(var1);

      try {
         this.field1389.remove(var1);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "dc.ag(" + ')');
      }
   }
}
