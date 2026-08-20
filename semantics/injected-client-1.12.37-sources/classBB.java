import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bb")
public class classBB {
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field336 = 475000;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field337 = 5000000;
   @ObfuscatedName("aa")
   static final double field325 = Math.log(2.0);
   @ObfuscatedName("am")
   static Calendar field329 = Calendar.getInstance();
   @ObfuscatedName("bp")
   static int field324 = 0;
   @ObfuscatedName("ay")
   static int[] field323 = new int[1000];
   @ObfuscatedName("ad")
   static long[] field322 = new long[1000];
   @ObfuscatedName("au")
   static Object[] field328 = new Object[1000];
   @ObfuscatedName("ai")
   static int field338;
   @ObfuscatedName("ar")
   static int field331 = 0;
   @ObfuscatedSignature(descriptor = "[Lbj;")
   @ObfuscatedName("aw")
   static classBJ[] field321 = new classBJ[50];
   @ObfuscatedName("ak")
   static int field327 = 0;
   @ObfuscatedSignature(descriptor = "Llz;")
   @ObfuscatedName("an")
   static classLZ field326 = new classLZ();
   @ObfuscatedSignature(descriptor = "Lzv;")
   @ObfuscatedName("du")
   public static Font field341;
   @ObfuscatedName("bn")
   static boolean field330 = false;
   @ObfuscatedName("bx")
   static boolean field335 = false;
   @ObfuscatedName("bc")
   static ArrayList field332 = new ArrayList();
   @ObfuscatedName("ag")
   static final String[] field320 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   @ObfuscatedName("bg")
   static final StringBuilder field334 = new StringBuilder(1000);
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field340 = 500000;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field339 = 3;
   @ObfuscatedSignature(descriptor = "Lqi;")
   @ObfuscatedName("bj")
   static final classQI field333 = new classQI();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;)Lte;")
   @ObfuscatedName("dd")
   static classTE method790(int var0, Object var1) {
      classTE var2 = (classTE)var1;
      if (var2 == null) {
         throw new RuntimeException();
      } else {
         return var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("el")
   static int method822(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 1952701191) * -2080393778], (byte)105);
      } else {
         var3 = var2 ? classSZ.field6110 : TileItem.field1558;
      }

      String var4 = (String)field328[(field338 -= 1222866659) * -343744680];
      int[] var5 = null;
      if (!var4.isEmpty() && var4.charAt(var4.length() - 1) == 1009680524) {
         int var6 = field323[(DynamicObject.field1679 -= 1964095246) * -1381237322];
         if (var6 > 0) {
            var5 = new int[var6];

            while (var6-- > 0) {
               var5[var6] = field323[(DynamicObject.field1679 -= 120041229) * -28916586];
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var9 = new Object[var4.length() + 1];

      for (int var7 = var9.length - 1; var7 >= 1; var7--) {
         switch (var4.charAt(var7 - 1)) {
            case 'W':
            case 'X':
            case 's':
               var9[var7] = field328[(field338 -= 747730970) * 589751912];
               break;
            case 'Ï':
               var9[var7] = new Long(field322[(classXT.field6939 -= -1389393912) * 1052664794]);
               break;
            default:
               var9[var7] = new Integer(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         }
      }

      int var10 = field323[(DynamicObject.field1679 -= -430215207) * -324749371];
      if (-1 != var10) {
         var9[0] = new Integer(var10);
      } else {
         var9 = null;
      }

      if (var0 == 1400) {
         var3.field4359 = var9;
      } else if (1035184774 == var0) {
         var3.field4378 = var9;
      } else if (1402 == var0) {
         var3.field4357 = var9;
      } else if (1403 == var0) {
         var3.field4402 = var9;
      } else if (-1703841757 == var0) {
         var3.field4361 = var9;
      } else if (-68858507 == var0) {
         var3.field4379 = var9;
      } else if (var0 == 1406) {
         var3.field4350 = var9;
      } else if (var0 == 1407) {
         var3.field4382 = var9;
         var3.field4280 = var5;
      } else if (var0 == 1408) {
         var3.field4343 = var9;
      } else if (var0 == -84740572) {
         var3.field4386 = var9;
      } else if (var0 == 1410) {
         var3.field4380 = var9;
      } else if (1411 == var0) {
         var3.field4377 = var9;
      } else if (924859090 == var0) {
         var3.field4286 = var9;
      } else if (var0 == -1986397302) {
         var3.field4355 = var9;
         var3.field4267 = var5;
      } else if (var0 == -1974600398) {
         var3.field4384 = var9;
         var3.field4385 = var5;
      } else if (var0 == 1416) {
         var3.field4381 = var9;
      } else if (1553587625 == var0) {
         var3.field4387 = var9;
      } else if (1418 == var0) {
         var3.field4365 = var9;
      } else if (1419 == var0) {
         var3.field4388 = var9;
      } else if (156142948 == var0) {
         var3.field4383 = var9;
      } else if (var0 == 1421) {
         var3.field4391 = var9;
      } else if (var0 == 891102786) {
         var3.field4394 = var9;
      } else if (1435630008 == var0) {
         var3.field4406 = var9;
      } else if (1424 == var0) {
         var3.field4395 = var9;
      } else if (1425 == var0) {
         var3.field4396 = var9;
      } else if (425473232 == var0) {
         var3.field4397 = var9;
      } else if (var0 == 1427) {
         var3.field4246 = var9;
      } else if (var0 == -744413666) {
         var3.field4392 = var9;
      } else if (var0 == 1429) {
         var3.field4393 = var9;
      } else if (1430 == var0) {
         var3.field4389 = var9;
      } else if (1431 == var0) {
         var3.field4363 = var9;
      } else if (var0 == 1434) {
         var3.field4398 = var9;
      } else if (1435 == var0) {
         var3.field4254 = var9;
      } else {
         if (var0 < 1436 || var0 > 2109210019) {
            return 2;
         }

         classLX var8 = var3.method7294(607523442);
         if (var8 != null) {
            if (var0 == -2059135310) {
               var8.field4426 = var9;
            } else if (1437 == var0) {
               var8.field4427 = var9;
            } else if (var0 == 1768248331) {
               var8.field4428 = var9;
            } else if (var0 == 1439) {
               var8.field4425 = var9;
            }
         }
      }

      var3.field4315 = true;
      return 1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Llw;)V")
   @ObfuscatedName("jg")
   static void method946(Widget var0, Widget var1) {
      if (-1510882375 * var0.field4375 == 0) {
         for (int var2 = var0.field4265 * -1210177335; var2 <= var0.field4266 * 379541057; var2++) {
            Widget var3 = var1.field4340[var2];
            if (null != var3 && 63131743 * var0.field4260 == -135278446 * var3.field4263) {
               classDM.method3434(var3, var1, (byte)-14);
            }
         }
      }

      var1.field4340[var0.field4260 * 63131743] = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzr;II)V")
   @ObfuscatedName("cj")
   static void method782(ScriptEvent var0, int var1, int var2) {
      Object[] var3 = var0.method14091(1947277778);
      Script var4;
      if (classTS.method11131(var0.method14097(-1922397325), -324749371)) {
         classAC.field132 = (classHV)var3[0];
         WorldMapElement var5 = SceneTilePaint.method4796(classAC.field132.field2897 * -753629693, (byte)-106);
         var4 = classCE.method1439(var0.method14097(762662271), var5.field5405 * 872689451, 1254355271 * var5.field5404, (short)-6853);
      } else if (classJG.method6366(var0.method14097(632804757), -1538515701)) {
         int var6 = (Integer)var3[0];
         var4 = classCE.method1439(var0.method14097(-1562138617), var6, -1, (short)-802);
      } else if (classMZ.method7747(var0.method14097(1196296936), (byte)77)) {
         int var7 = (Integer)var3[0];
         var4 = classCE.method1439(var0.method14097(996556620), var7, -1, (short)1301);
      } else if (var0.method14097(1587511742) == 86) {
         int var8 = (Integer)var3[0];
         var4 = classCE.method1439(var0.method14097(-1860188409), var8, -1, (short)-3738);
      } else {
         int var9 = (Integer)var3[0];
         var4 = classSK.method10460(var9, -462737499);
      }

      if (null != var4) {
         classLD.method6748(var0, var4, var1, var2, 450741034);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzr;II)V")
   @ObfuscatedName("ci")
   static void method783(ScriptEvent var0, int var1, int var2) {
      Object[] var3 = var0.method14091(2135174936);
      Script var4;
      if (classTS.method11131(var0.method14097(-2063925404), -324749371)) {
         classAC.field132 = (classHV)var3[0];
         WorldMapElement var5 = SceneTilePaint.method4796(classAC.field132.field2897 * -753629693, (byte)-100);
         var4 = classCE.method1439(var0.method14097(-1596848282), var5.field5405 * 872689451, 1254355271 * var5.field5404, (short)-14888);
      } else if (classJG.method6366(var0.method14097(278631015), -927628321)) {
         int var6 = (Integer)var3[0];
         var4 = classCE.method1439(var0.method14097(-1662679061), var6, -1, (short)7512);
      } else if (classMZ.method7747(var0.method14097(-1116093975), (byte)3)) {
         int var7 = (Integer)var3[0];
         var4 = classCE.method1439(var0.method14097(-720431313), var7, -1, (short)18287);
      } else if (var0.method14097(1434345971) == 86) {
         int var8 = (Integer)var3[0];
         var4 = classCE.method1439(var0.method14097(-1921777731), var8, -1, (short)11941);
      } else {
         int var9 = (Integer)var3[0];
         var4 = classSK.method10460(var9, 878395197);
      }

      if (null != var4) {
         classLD.method6748(var0, var4, var1, var2, -421117545);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzr;II)V")
   @ObfuscatedName("cx")
   static void method784(ScriptEvent var0, int var1, int var2) {
      Object[] var3 = var0.method14091(1633947763);
      Script var4;
      if (classTS.method11131(var0.method14097(1718377667), -324749371)) {
         classAC.field132 = (classHV)var3[0];
         WorldMapElement var5 = SceneTilePaint.method4796(classAC.field132.field2897 * -753629693, (byte)-32);
         var4 = classCE.method1439(var0.method14097(2070591962), var5.field5405 * 1641098792, 777680520 * var5.field5404, (short)5444);
      } else if (classJG.method6366(var0.method14097(-505691877), -1769961088)) {
         int var6 = (Integer)var3[0];
         var4 = classCE.method1439(var0.method14097(-805115303), var6, -1, (short)-23467);
      } else if (classMZ.method7747(var0.method14097(-1930074735), (byte)6)) {
         int var7 = (Integer)var3[0];
         var4 = classCE.method1439(var0.method14097(-564363672), var7, -1, (short)16314);
      } else if (var0.method14097(1329819874) == 973210337) {
         int var8 = (Integer)var3[0];
         var4 = classCE.method1439(var0.method14097(-226315160), var8, -1, (short)-3454);
      } else {
         int var9 = (Integer)var3[0];
         var4 = classSK.method10460(var9, -1948714061);
      }

      if (null != var4) {
         classLD.method6748(var0, var4, var1, var2, 121683552);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzr;Lbl;II)V")
   @ObfuscatedName("ce")
   static void method785(ScriptEvent var0, Script var1, int var2, int var3) {
      Object[] var4 = var0.method14091(1856878350);
      DynamicObject.field1679 = 0;
      classXT.field6939 = 0;
      field338 = 0;
      int var5 = -1;
      int[] var6 = var1.field501;
      int[] var7 = var1.field502;
      int var8 = -1;
      field331 = 0;
      field330 = false;
      boolean var9 = false;
      field327 = 0;
      boolean var23 = false /* VF: Semaphore variable */;

      label734: {
         label735: {
            try {
               var23 = true;
               classDE.field1409 = new int[var1.field493 * -271078995];
               int var26 = 0;
               classDU.field1634 = new long[var1.field492 * 1141638279];
               int var27 = 0;
               classML.field4533 = new Object[145871583 * var1.field496];
               int var28 = 0;

               for (int var13 = 1; var13 < var4.length; var13++) {
                  if (var4[var13] instanceof Integer) {
                     int var14 = (Integer)var4[var13];
                     if (var14 == -2147483647) {
                        var14 = var0.method14100(-1631472609);
                     }

                     if (var14 == -2147483646) {
                        var14 = var0.method14103((short)-13005);
                     }

                     if (var14 == -2147483645) {
                        var14 = ScriptEvent.method14092(var0, -752631879) != null ? ScriptEvent.method14092(var0, -1182146425).field4329 * -1163656551 : -1;
                     }

                     if (-2147483644 == var14) {
                        var14 = ScriptEvent.method14108(var0, -1691910499);
                     }

                     if (var14 == -2147483643) {
                        var14 = ScriptEvent.method14092(var0, -796021626) != null ? ScriptEvent.method14092(var0, 1497364717).field4260 * 63131743 : -1;
                     }

                     if (-2147483642 == var14) {
                        var14 = ScriptEvent.method14111(var0, (byte)-2) != null ? ScriptEvent.method14111(var0, (byte)-18).field4329 * -1163656551 : -1;
                     }

                     if (-2147483641 == var14) {
                        var14 = ScriptEvent.method14111(var0, (byte)-60) != null ? ScriptEvent.method14111(var0, (byte)38).field4260 * 63131743 : -1;
                     }

                     if (-2147483640 == var14) {
                        var14 = ScriptEvent.method14114(var0, -773759683);
                     }

                     if (var14 == -2147483639) {
                        var14 = var0.method14120((short)3141);
                     }

                     if (-2147483638 == var14) {
                        var14 = var0.method14124(-1159097278);
                     }

                     classDE.field1409[var26++] = var14;
                  } else if (var4[var13] instanceof String) {
                     String var45 = (String)var4[var13];
                     if (var45.equals("event_opbase")) {
                        var45 = var0.method14125(811280628);
                     }

                     classML.field4533[var28++] = var45;
                  } else if (var4[var13] instanceof classTE) {
                     classML.field4533[var28++] = var4[var13];
                  } else if (var4[var13] instanceof Long) {
                     long var46 = (Long)var4[var13];
                     classDU.field1634[var27++] = var46;
                  }
               }

               field324 = var0.method14127(-889775093) * 1648640743;

               label723:
               while (true) {
                  field327 += 33484609;
                  if (1023779009 * field327 > var2) {
                     throw new RuntimeException();
                  }

                  var8 = var6[++var5];
                  if (var8 < 100) {
                     if (var8 == 0) {
                        field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var7[var5];
                     } else if (1 == var8) {
                        int var44 = var7[var5];
                        field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classLB.field4090[var44];
                     } else if (var8 == 2) {
                        int var43 = var7[var5];
                        classLB.field4090[var43] = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                        classXQ.method12876(var43, -734232893);
                     } else if (var8 == 3) {
                        field328[(field338 += 1222866659) * 1375698635 - 1] = var1.method1136(var5, 1160357364);
                     } else if (6 == var8) {
                        var5 += var7[var5];
                     } else if (7 == var8) {
                        DynamicObject.field1679 -= 240082458;
                        if (field323[DynamicObject.field1679 * -324749371 + 1] != field323[-324749371 * DynamicObject.field1679]) {
                           var5 += var7[var5];
                        }
                     } else if (8 == var8) {
                        DynamicObject.field1679 -= 240082458;
                        if (field323[DynamicObject.field1679 * -324749371] == field323[1 + DynamicObject.field1679 * -324749371]) {
                           var5 += var7[var5];
                        }
                     } else if (9 == var8) {
                        DynamicObject.field1679 -= 240082458;
                        if (field323[-324749371 * DynamicObject.field1679] < field323[1 + DynamicObject.field1679 * -324749371]) {
                           var5 += var7[var5];
                        }
                     } else if (10 == var8) {
                        DynamicObject.field1679 -= 240082458;
                        if (field323[-324749371 * DynamicObject.field1679] > field323[DynamicObject.field1679 * -324749371 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (68 == var8) {
                        classXT.field6939 -= 1699258970;
                        if (field322[18294437 * classXT.field6939 + 1] != field322[18294437 * classXT.field6939]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 69) {
                        classXT.field6939 -= 1699258970;
                        if (field322[18294437 * classXT.field6939 + 1] == field322[classXT.field6939 * 18294437]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 70) {
                        classXT.field6939 -= 1699258970;
                        if (field322[18294437 * classXT.field6939] < field322[18294437 * classXT.field6939 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 71) {
                        classXT.field6939 -= 1699258970;
                        if (field322[18294437 * classXT.field6939] > field322[18294437 * classXT.field6939 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (21 == var8) {
                        if (-1626238019 * field331 == 0) {
                           var23 = false;
                           break label735;
                        }

                        classBJ var41 = field321[(field331 -= -689455211) * -1626238019];
                        var1 = var41.field482;
                        var6 = var1.field501;
                        var7 = var1.field502;
                        var5 = var41.field478 * 1565617813;
                        classDE.field1409 = var41.field484;
                        classML.field4533 = var41.field486;
                        classDU.field1634 = var41.field485;
                     } else if (var8 == 25) {
                        int var40 = var7[var5];
                        field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classEM.method3922(var40, -655351698);
                     } else if (var8 == 27) {
                        int var39 = var7[var5];
                        classGP.method5546(var39, field323[(DynamicObject.field1679 -= 120041229) * -324749371], 1037164465);
                     } else if (var8 == 31) {
                        DynamicObject.field1679 -= 240082458;
                        if (field323[DynamicObject.field1679 * -324749371] <= field323[DynamicObject.field1679 * -324749371 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (32 == var8) {
                        DynamicObject.field1679 -= 240082458;
                        if (field323[DynamicObject.field1679 * -324749371] >= field323[-324749371 * DynamicObject.field1679 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (72 == var8) {
                        classXT.field6939 -= 1699258970;
                        if (field322[18294437 * classXT.field6939] <= field322[1 + classXT.field6939 * 18294437]) {
                           var5 += var7[var5];
                        }
                     } else if (73 == var8) {
                        classXT.field6939 -= 1699258970;
                        if (field322[classXT.field6939 * 18294437] >= field322[1 + classXT.field6939 * 18294437]) {
                           var5 += var7[var5];
                        }
                     } else if (33 == var8) {
                        field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classDE.field1409[var7[var5]];
                     } else if (34 == var8) {
                        classDE.field1409[var7[var5]] = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                     } else if (var8 == 35) {
                        field328[(field338 += 1222866659) * 1375698635 - 1] = classML.field4533[var7[var5]];
                     } else if (var8 == 36) {
                        classML.field4533[var7[var5]] = field328[(field338 -= 1222866659) * 1375698635];
                     } else if (var8 == 37) {
                        int var38 = var7[var5];
                        field338 -= 1222866659 * var38;
                        String var55 = classFO.method4849(field328, field338 * 1375698635, var38, (byte)-39);
                        field328[(field338 += 1222866659) * 1375698635 - 1] = var55;
                     } else if (38 == var8) {
                        DynamicObject.field1679 -= 120041229;
                     } else if (39 == var8) {
                        field338 -= 1222866659;
                     } else if (40 == var8) {
                        if (50 == -1626238019 * field331) {
                           throw new RuntimeException();
                        }

                        int var37 = var7[var5];
                        Script var54 = classSK.method10460(var37, -886150226);
                        int[] var57 = new int[-271078995 * var54.field493];
                        Object[] var16 = new Object[var54.field496 * 145871583];
                        long[] var17 = new long[1141638279 * var54.field492];
                        if (306770163 * var54.field495 >= 0) {
                           System.arraycopy(
                              field323, -324749371 * DynamicObject.field1679 - var54.field495 * 306770163 + 0, var57, 0, 306770163 * var54.field495
                           );
                        }

                        if (var54.field494 * 2120664535 >= 0) {
                           System.arraycopy(field328, field338 * 1375698635 - 2120664535 * var54.field494 + 0, var16, 0, var54.field494 * 2120664535);
                        }

                        if (var54.field497 * -1713070491 >= 0) {
                           System.arraycopy(field322, 0 + (18294437 * classXT.field6939 - var54.field497 * -1713070491), var17, 0, var54.field497 * -1713070491);
                        }

                        DynamicObject.field1679 = DynamicObject.field1679 - var54.field495 * 611277143;
                        field338 = field338 - var54.field494 * 1509394341;
                        classXT.field6939 = classXT.field6939 - var54.field497 * 369216705;
                        classBJ var18 = new classBJ();
                        var18.field482 = var1;
                        var18.field478 = var5 * -651105091;
                        var18.field484 = classDE.field1409;
                        var18.field486 = classML.field4533;
                        var18.field485 = classDU.field1634;
                        field321[(field331 += -689455211) * -1626238019 - 1] = var18;
                        var1 = var54;
                        var6 = var54.field501;
                        var7 = var54.field502;
                        var5 = -1;
                        classDE.field1409 = var57;
                        classML.field4533 = var16;
                        classDU.field1634 = var17;
                     } else if (var8 == 42) {
                        field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classSX.field6096.method3541(var7[var5], -1660362900);
                     } else if (var8 == 43) {
                        classSX.field6096.method3538(var7[var5], field323[(DynamicObject.field1679 -= 120041229) * -324749371], -337017536);
                     } else if (51 == var8) {
                        field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classSX.field6096.method3546(var7[var5], -741533901);
                     } else if (var8 == 52) {
                        classDS.method3543(classSX.field6096, var7[var5], field322[(classXT.field6939 -= -1297854163) * 18294437]);
                     } else if (44 == var8) {
                        int var36 = var7[var5] >> 16;
                        int var53 = var7[var5] & 65535;
                        int var56 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                        if (var56 < 0 || var56 > 5000) {
                           throw new RuntimeException();
                        }

                        if (115 == var53) {
                           classML.field4533[var36] = new classTE(classYY.field7113, "", var56, var56);
                        } else if (var53 != 105 && var53 != 49) {
                           classML.field4533[var36] = new classTE(classYY.field7111, -1, var56, var56);
                        } else {
                           classML.field4533[var36] = new classTE(classYY.field7111, 0, var56, var56);
                        }
                     } else if (var8 == 45) {
                        classTE var30 = classJY.method6421(var7[var5], classML.field4533[var7[var5]], (byte)-43);
                        int var48 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                        classMA.method7501(var30, var48, 933961625);
                        if (classYY.field7111 == var30.field6128) {
                           field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var30.method10748(965845332)[var48];
                        } else if (classYY.field7115 == var30.field6128) {
                           field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var30.method10750(-339594965)[var48];
                        } else {
                           field328[(field338 += 1222866659) * 1375698635 - 1] = classTE.method10753(var30, 926921655)[var48];
                        }
                     } else if (var8 == 46) {
                        classTE var31 = classJY.method6421(var7[var5], classML.field4533[var7[var5]], (byte)-82);
                        if (!var31.field6124) {
                           throw new RuntimeException();
                        }

                        if (classYY.field7111 == var31.field6128) {
                           DynamicObject.field1679 -= 240082458;
                           int var49 = field323[DynamicObject.field1679 * -324749371];
                           classMA.method7501(var31, var49, 410306857);
                           var31.method10748(-26647715)[var49] = field323[1 + -324749371 * DynamicObject.field1679];
                        } else if (var31.field6128 == classYY.field7115) {
                           int var50 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                           classMA.method7501(var31, var50, 1937517992);
                           var31.method10750(-1763176986)[var50] = field322[(classXT.field6939 -= -1297854163) * 18294437];
                        } else {
                           int var51 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                           classMA.method7501(var31, var51, 935001819);
                           classTE.method10753(var31, 1288954486)[var51] = field328[(field338 -= 1222866659) * 1375698635];
                        }

                        var31.field6133 = true;
                     } else if (var8 == 49) {
                        Object var32 = classSX.field6096.method3564(var7[var5], (byte)21);
                        field328[(field338 += 1222866659) * 1375698635 - 1] = var32;
                     } else if (50 == var8) {
                        classSX.field6096.method3551(var7[var5], field328[(field338 -= 1222866659) * 1375698635], 1513213059);
                     } else if (var8 == 60) {
                        IterableNodeHashTable var33 = var1.field505[var7[var5]];
                        IntegerNode var52 = (IntegerNode)var33.method13595(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
                        if (null != var52) {
                           var5 += var52.integer;
                        }
                     } else if (var8 == 63) {
                        field328[(field338 += 1222866659) * 1375698635 - 1] = null;
                     } else if (61 == var8) {
                        field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var1.method1138(var5, (byte)82);
                     } else if (62 == var8) {
                        classXT.field6939 -= -1297854163;
                     } else if (66 == var8) {
                        field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classDU.field1634[var7[var5]];
                     } else if (var8 == 67) {
                        classDU.field1634[var7[var5]] = field322[(classXT.field6939 -= -1297854163) * 18294437];
                     } else if (var8 == 74) {
                        Integer var34 = classNJ.field4678.method6247(var7[var5], (byte)75);
                        if (var34 == null) {
                           field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
                        } else {
                           field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var34;
                        }
                     } else {
                        if (var8 != 76) {
                           throw new IllegalStateException();
                        }

                        Integer var35 = classOH.field4871.method11235(var7[var5], 2007729679);
                        if (var35 == null) {
                           field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
                        } else {
                           field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var35;
                        }
                     }
                  } else {
                     boolean var29 = 1 == var1.field502[var5];
                     int var47 = classQR.method9781(var8, var1, var29, (byte)11);
                     switch (var47) {
                        case 0:
                           var23 = false;
                           break label723;
                        case 1:
                        default:
                           break;
                        case 2:
                           throw new IllegalStateException();
                     }
                  }
               }
            } catch (Exception var24) {
               var9 = true;
               StringBuilder var11 = new StringBuilder(30);
               var11.append("").append(var1.field6552).append(" ");

               for (int var12 = field331 * -1626238019 - 1; var12 >= 0; var12--) {
                  var11.append("").append(field321[var12].field482.field6552).append(" ");
               }

               var11.append("").append(var8);
               classAAU.method275(var11.toString(), var24, (byte)100);
               var23 = false;
               break label734;
            } finally {
               if (var23) {
                  while (!field332.isEmpty()) {
                     classDG var20 = (classDG)field332.remove(0);
                     classEA.method3799(
                        var20.method3058((short)167),
                        classDG.method3062(var20, -65455964),
                        classDG.method3066(var20, -554920910),
                        var20.method3070((byte)40),
                        "",
                        -1210718365
                     );
                  }

                  if (field330) {
                     field330 = false;
                     classTB.method10737((byte)109);
                  }

                  if (!var9 && var3 > 0 && 1023779009 * field327 >= var3) {
                     classAAU.method275(
                        "Warning: Script " + var1.field500 + " finished at op count " + 1023779009 * field327 + " of max " + var2, null, (byte)34
                     );
                  }
               }
            }

            while (!field332.isEmpty()) {
               classDG var15 = (classDG)field332.remove(0);
               classEA.method3799(
                  var15.method3058((short)167),
                  classDG.method3062(var15, -65455964),
                  classDG.method3066(var15, -554920910),
                  var15.method3070((byte)31),
                  "",
                  -358716335
               );
            }

            if (field330) {
               field330 = false;
               classTB.method10737((byte)24);
            }

            if (!var9 && var3 > 0 && 1023779009 * field327 >= var3) {
               classAAU.method275("Warning: Script " + var1.field500 + " finished at op count " + 1023779009 * field327 + " of max " + var2, null, (byte)91);
            }

            return;
         }

         while (!field332.isEmpty()) {
            classDG var42 = (classDG)field332.remove(0);
            classEA.method3799(
               var42.method3058((short)167),
               classDG.method3062(var42, -65455964),
               classDG.method3066(var42, -554920910),
               var42.method3070((byte)54),
               "",
               -338290085
            );
         }

         if (field330) {
            field330 = false;
            classTB.method10737((byte)-25);
         }

         if (!var9 && var3 > 0 && 1023779009 * field327 >= var3) {
            classAAU.method275("Warning: Script " + var1.field500 + " finished at op count " + 1023779009 * field327 + " of max " + var2, null, (byte)101);
         }

         return;
      }

      while (!field332.isEmpty()) {
         classDG var10 = (classDG)field332.remove(0);
         classEA.method3799(
            var10.method3058((short)167),
            classDG.method3062(var10, -65455964),
            classDG.method3066(var10, -554920910),
            var10.method3070((byte)34),
            "",
            -1135387484
         );
      }

      if (field330) {
         field330 = false;
         classTB.method10737((byte)-107);
      }

      if (!var9 && var3 > 0 && 1023779009 * field327 >= var3) {
         classAAU.method275("Warning: Script " + var1.field500 + " finished at op count " + 1023779009 * field327 + " of max " + var2, null, (byte)17);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzr;Lbl;II)V")
   @ObfuscatedName("cm")
   static void method786(ScriptEvent var0, Script var1, int var2, int var3) {
      Object[] var4 = var0.method14091(1609464131);
      DynamicObject.field1679 = 0;
      classXT.field6939 = 0;
      field338 = 0;
      int var5 = -1;
      int[] var6 = var1.field501;
      int[] var7 = var1.field502;
      int var8 = -1;
      field331 = 0;
      field330 = false;
      boolean var9 = false;
      field327 = 0;
      boolean var23 = false /* VF: Semaphore variable */;

      label734: {
         label735: {
            try {
               var23 = true;
               classDE.field1409 = new int[var1.field493 * -271078995];
               int var26 = 0;
               classDU.field1634 = new long[var1.field492 * 1141638279];
               int var27 = 0;
               classML.field4533 = new Object[80563174 * var1.field496];
               int var28 = 0;

               for (int var13 = 1; var13 < var4.length; var13++) {
                  if (var4[var13] instanceof Integer) {
                     int var14 = (Integer)var4[var13];
                     if (var14 == -2147483647) {
                        var14 = var0.method14100(-1573834581);
                     }

                     if (var14 == -815097731) {
                        var14 = var0.method14103((short)8972);
                     }

                     if (var14 == 1098948894) {
                        var14 = ScriptEvent.method14092(var0, -1766357314) != null ? ScriptEvent.method14092(var0, 1723829274).field4329 * -624218450 : -1;
                     }

                     if (1125914785 == var14) {
                        var14 = ScriptEvent.method14108(var0, -614877952);
                     }

                     if (var14 == 252105002) {
                        var14 = ScriptEvent.method14092(var0, 1948365451) != null ? ScriptEvent.method14092(var0, -1843498106).field4260 * 63131743 : -1;
                     }

                     if (-2147483642 == var14) {
                        var14 = ScriptEvent.method14111(var0, (byte)27) != null ? ScriptEvent.method14111(var0, (byte)30).field4329 * -1163656551 : -1;
                     }

                     if (-2147483641 == var14) {
                        var14 = ScriptEvent.method14111(var0, (byte)52) != null ? ScriptEvent.method14111(var0, (byte)4).field4260 * 63131743 : -1;
                     }

                     if (-2147483640 == var14) {
                        var14 = ScriptEvent.method14114(var0, -773759683);
                     }

                     if (var14 == -984612890) {
                        var14 = var0.method14120((short)1859);
                     }

                     if (-2147483638 == var14) {
                        var14 = var0.method14124(1624420158);
                     }

                     classDE.field1409[var26++] = var14;
                  } else if (var4[var13] instanceof String) {
                     String var45 = (String)var4[var13];
                     if (var45.equals("event_opbase")) {
                        var45 = var0.method14125(811280628);
                     }

                     classML.field4533[var28++] = var45;
                  } else if (var4[var13] instanceof classTE) {
                     classML.field4533[var28++] = var4[var13];
                  } else if (var4[var13] instanceof Long) {
                     long var46 = (Long)var4[var13];
                     classDU.field1634[var27++] = var46;
                  }
               }

               field324 = var0.method14127(-565398019) * -230604851;

               label723:
               while (true) {
                  field327 += 212090667;
                  if (882340257 * field327 > var2) {
                     throw new RuntimeException();
                  }

                  var8 = var6[++var5];
                  if (var8 < 100) {
                     if (var8 == 0) {
                        field323[(DynamicObject.field1679 += -1276206441) * 1466673619 - 1] = var7[var5];
                     } else if (1 == var8) {
                        int var44 = var7[var5];
                        field323[(DynamicObject.field1679 += -519061910) * -324749371 - 1] = classLB.field4090[var44];
                     } else if (var8 == 2) {
                        int var43 = var7[var5];
                        classLB.field4090[var43] = field323[(DynamicObject.field1679 -= 1341070264) * -324749371];
                        classXQ.method12876(var43, -186523970);
                     } else if (var8 == 3) {
                        field328[(field338 += 1222866659) * 1375698635 - 1] = var1.method1136(var5, 1160357364);
                     } else if (6 == var8) {
                        var5 += var7[var5];
                     } else if (7 == var8) {
                        DynamicObject.field1679 -= -1209217907;
                        if (field323[DynamicObject.field1679 * -201490008 + 1] != field323[-324749371 * DynamicObject.field1679]) {
                           var5 += var7[var5];
                        }
                     } else if (8 == var8) {
                        DynamicObject.field1679 -= 240082458;
                        if (field323[DynamicObject.field1679 * -324749371] == field323[1 + DynamicObject.field1679 * -858952187]) {
                           var5 += var7[var5];
                        }
                     } else if (9 == var8) {
                        DynamicObject.field1679 -= 1642640771;
                        if (field323[-324749371 * DynamicObject.field1679] < field323[1 + DynamicObject.field1679 * -324749371]) {
                           var5 += var7[var5];
                        }
                     } else if (10 == var8) {
                        DynamicObject.field1679 -= 240082458;
                        if (field323[-324749371 * DynamicObject.field1679] > field323[DynamicObject.field1679 * -753850771 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (-210924307 == var8) {
                        classXT.field6939 -= -354107851;
                        if (field322[18294437 * classXT.field6939 + 1] != field322[-970020382 * classXT.field6939]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 69) {
                        classXT.field6939 -= 1699258970;
                        if (field322[93263385 * classXT.field6939 + 1] == field322[classXT.field6939 * 18294437]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == -645141013) {
                        classXT.field6939 -= -636806645;
                        if (field322[-1188153768 * classXT.field6939] < field322[260436365 * classXT.field6939 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 71) {
                        classXT.field6939 -= 1699258970;
                        if (field322[18294437 * classXT.field6939] > field322[865321470 * classXT.field6939 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (21 == var8) {
                        if (-1626238019 * field331 == 0) {
                           var23 = false;
                           break label735;
                        }

                        classBJ var41 = field321[(field331 -= -689455211) * 1152707468];
                        var1 = var41.field482;
                        var6 = var1.field501;
                        var7 = var1.field502;
                        var5 = var41.field478 * 1565617813;
                        classDE.field1409 = var41.field484;
                        classML.field4533 = var41.field486;
                        classDU.field1634 = var41.field485;
                     } else if (var8 == 25) {
                        int var40 = var7[var5];
                        field323[(DynamicObject.field1679 += 120041229) * 903007164 - 1] = classEM.method3922(var40, -841031098);
                     } else if (var8 == 27) {
                        int var39 = var7[var5];
                        classGP.method5546(var39, field323[(DynamicObject.field1679 -= 1518803804) * -604217885], 945928920);
                     } else if (var8 == 1804228146) {
                        DynamicObject.field1679 -= 240082458;
                        if (field323[DynamicObject.field1679 * 888351712] <= field323[DynamicObject.field1679 * -324749371 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (568565039 == var8) {
                        DynamicObject.field1679 -= 240082458;
                        if (field323[DynamicObject.field1679 * -1134003259] >= field323[-295577052 * DynamicObject.field1679 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (72 == var8) {
                        classXT.field6939 -= 1699258970;
                        if (field322[18294437 * classXT.field6939] <= field322[1 + classXT.field6939 * 18294437]) {
                           var5 += var7[var5];
                        }
                     } else if (1989981247 == var8) {
                        classXT.field6939 -= 1699258970;
                        if (field322[classXT.field6939 * -465176052] >= field322[1 + classXT.field6939 * 1726647660]) {
                           var5 += var7[var5];
                        }
                     } else if (-1499395383 == var8) {
                        field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classDE.field1409[var7[var5]];
                     } else if (-2074540619 == var8) {
                        classDE.field1409[var7[var5]] = field323[(DynamicObject.field1679 -= 181018504) * -665811191];
                     } else if (var8 == 35) {
                        field328[(field338 += 1222866659) * -1302360017 - 1] = classML.field4533[var7[var5]];
                     } else if (var8 == -1455672022) {
                        classML.field4533[var7[var5]] = field328[(field338 -= 1860322487) * 1375698635];
                     } else if (var8 == 1130637361) {
                        int var38 = var7[var5];
                        field338 -= 1222866659 * var38;
                        String var55 = classFO.method4849(field328, field338 * 903216261, var38, (byte)-53);
                        field328[(field338 += 1222866659) * -540216378 - 1] = var55;
                     } else if (-844858498 == var8) {
                        DynamicObject.field1679 -= -1234234971;
                     } else if (39 == var8) {
                        field338 -= 1222866659;
                     } else if (40 == var8) {
                        if (50 == -1142470472 * field331) {
                           throw new RuntimeException();
                        }

                        int var37 = var7[var5];
                        Script var54 = classSK.method10460(var37, 300716222);
                        int[] var57 = new int[-2030303423 * var54.field493];
                        Object[] var16 = new Object[var54.field496 * 145871583];
                        long[] var17 = new long[-1507810368 * var54.field492];
                        if (1136798029 * var54.field495 >= 0) {
                           System.arraycopy(
                              field323, -324749371 * DynamicObject.field1679 - var54.field495 * -1315256660 + 0, var57, 0, 306770163 * var54.field495
                           );
                        }

                        if (var54.field494 * -1511783084 >= 0) {
                           System.arraycopy(field328, field338 * 1355766277 - 2120664535 * var54.field494 + 0, var16, 0, var54.field494 * 1403195156);
                        }

                        if (var54.field497 * -1713070491 >= 0) {
                           System.arraycopy(
                              field322, 0 + (360401068 * classXT.field6939 - var54.field497 * -1713070491), var17, 0, var54.field497 * -1713070491
                           );
                        }

                        DynamicObject.field1679 = DynamicObject.field1679 - var54.field495 * 611277143;
                        field338 = field338 - var54.field494 * 1509394341;
                        classXT.field6939 = classXT.field6939 - var54.field497 * 1790996914;
                        classBJ var18 = new classBJ();
                        var18.field482 = var1;
                        var18.field478 = var5 * -651105091;
                        var18.field484 = classDE.field1409;
                        var18.field486 = classML.field4533;
                        var18.field485 = classDU.field1634;
                        field321[(field331 += -689455211) * -1626238019 - 1] = var18;
                        var1 = var54;
                        var6 = var54.field501;
                        var7 = var54.field502;
                        var5 = -1;
                        classDE.field1409 = var57;
                        classML.field4533 = var16;
                        classDU.field1634 = var17;
                     } else if (var8 == 42) {
                        field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classSX.field6096.method3541(var7[var5], -1821267263);
                     } else if (var8 == 43) {
                        classSX.field6096.method3538(var7[var5], field323[(DynamicObject.field1679 -= -1606767071) * -324749371], -1915143563);
                     } else if (51 == var8) {
                        field322[(classXT.field6939 += -1728531998) * 18294437 - 1] = classSX.field6096.method3546(var7[var5], -722058971);
                     } else if (var8 == 52) {
                        classDS.method3543(classSX.field6096, var7[var5], field322[(classXT.field6939 -= -1297854163) * 18294437]);
                     } else if (-1018523969 == var8) {
                        int var36 = var7[var5] >> 16;
                        int var53 = var7[var5] & 65535;
                        int var56 = field323[(DynamicObject.field1679 -= -1065720644) * -1034154830];
                        if (var56 < 0 || var56 > 630345785) {
                           throw new RuntimeException();
                        }

                        if (-512449489 == var53) {
                           classML.field4533[var36] = new classTE(classYY.field7113, "", var56, var56);
                        } else if (var53 != 105 && var53 != 49) {
                           classML.field4533[var36] = new classTE(classYY.field7111, -1, var56, var56);
                        } else {
                           classML.field4533[var36] = new classTE(classYY.field7111, 0, var56, var56);
                        }
                     } else if (var8 == -938964351) {
                        classTE var30 = classJY.method6421(var7[var5], classML.field4533[var7[var5]], (byte)-43);
                        int var48 = field323[(DynamicObject.field1679 -= 120041229) * -1143939908];
                        classMA.method7501(var30, var48, 529431081);
                        if (classYY.field7111 == var30.field6128) {
                           field323[(DynamicObject.field1679 += -1737471059) * -324749371 - 1] = var30.method10748(452131836)[var48];
                        } else if (classYY.field7115 == var30.field6128) {
                           field322[(classXT.field6939 += -801686508) * 879808183 - 1] = var30.method10750(-2062018031)[var48];
                        } else {
                           field328[(field338 += -244875053) * 1375698635 - 1] = classTE.method10753(var30, 649404664)[var48];
                        }
                     } else if (var8 == 46) {
                        classTE var31 = classJY.method6421(var7[var5], classML.field4533[var7[var5]], (byte)-115);
                        if (!var31.field6124) {
                           throw new RuntimeException();
                        }

                        if (classYY.field7111 == var31.field6128) {
                           DynamicObject.field1679 -= 240082458;
                           int var49 = field323[DynamicObject.field1679 * -324749371];
                           classMA.method7501(var31, var49, 749050781);
                           var31.method10748(-371615882)[var49] = field323[1 + -2009248313 * DynamicObject.field1679];
                        } else if (var31.field6128 == classYY.field7115) {
                           int var50 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                           classMA.method7501(var31, var50, 1800880694);
                           var31.method10750(-1008834557)[var50] = field322[(classXT.field6939 -= -1297854163) * 1999900007];
                        } else {
                           int var51 = field323[(DynamicObject.field1679 -= -128321742) * -962996656];
                           classMA.method7501(var31, var51, 607632256);
                           classTE.method10753(var31, 1977595815)[var51] = field328[(field338 -= 1222866659) * 1375698635];
                        }

                        var31.field6133 = true;
                     } else if (var8 == 49) {
                        Object var32 = classSX.field6096.method3564(var7[var5], (byte)43);
                        field328[(field338 += -513865370) * 1671785368 - 1] = var32;
                     } else if (50 == var8) {
                        classSX.field6096.method3551(var7[var5], field328[(field338 -= -636030331) * 1375698635], 1374879399);
                     } else if (var8 == 60) {
                        IterableNodeHashTable var33 = var1.field505[var7[var5]];
                        IntegerNode var52 = (IntegerNode)var33.method13595(field323[(DynamicObject.field1679 -= 120041229) * -1249488706]);
                        if (null != var52) {
                           var5 += var52.integer;
                        }
                     } else if (var8 == 63) {
                        field328[(field338 += 1222866659) * 464627090 - 1] = null;
                     } else if (-1528282808 == var8) {
                        field322[(classXT.field6939 += -1297854163) * -830303185 - 1] = var1.method1138(var5, (byte)55);
                     } else if (827502029 == var8) {
                        classXT.field6939 -= -1297854163;
                     } else if (66 == var8) {
                        field322[(classXT.field6939 += -472149306) * 18294437 - 1] = classDU.field1634[var7[var5]];
                     } else if (var8 == 955200520) {
                        classDU.field1634[var7[var5]] = field322[(classXT.field6939 -= -221231357) * -174590404];
                     } else if (var8 == -2064685472) {
                        Integer var34 = classNJ.field4678.method6247(var7[var5], (byte)75);
                        if (var34 == null) {
                           field323[(DynamicObject.field1679 += 2126649602) * 437275180 - 1] = -1;
                        } else {
                           field323[(DynamicObject.field1679 += -1648625880) * -324749371 - 1] = var34;
                        }
                     } else {
                        if (var8 != 76) {
                           throw new IllegalStateException();
                        }

                        Integer var35 = classOH.field4871.method11235(var7[var5], 1924078856);
                        if (var35 == null) {
                           field323[(DynamicObject.field1679 += 1561597425) * 959108440 - 1] = -1;
                        } else {
                           field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var35;
                        }
                     }
                  } else {
                     boolean var29 = 1 == var1.field502[var5];
                     int var47 = classQR.method9781(var8, var1, var29, (byte)-22);
                     switch (var47) {
                        case 0:
                           var23 = false;
                           break label723;
                        case 1:
                        default:
                           break;
                        case 2:
                           throw new IllegalStateException();
                     }
                  }
               }
            } catch (Exception var24) {
               var9 = true;
               StringBuilder var11 = new StringBuilder(30);
               var11.append("").append(var1.field6552).append(" ");

               for (int var12 = field331 * -1626238019 - 1; var12 >= 0; var12--) {
                  var11.append("").append(field321[var12].field482.field6552).append(" ");
               }

               var11.append("").append(var8);
               classAAU.method275(var11.toString(), var24, (byte)5);
               var23 = false;
               break label734;
            } finally {
               if (var23) {
                  while (!field332.isEmpty()) {
                     classDG var20 = (classDG)field332.remove(0);
                     classEA.method3799(
                        var20.method3058((short)167),
                        classDG.method3062(var20, -65455964),
                        classDG.method3066(var20, -554920910),
                        var20.method3070((byte)4),
                        "",
                        -1460126386
                     );
                  }

                  if (field330) {
                     field330 = false;
                     classTB.method10737((byte)-13);
                  }

                  if (!var9 && var3 > 0 && 1023779009 * field327 >= var3) {
                     classAAU.method275(
                        "Warning: Script " + var1.field500 + " finished at op count " + 1023779009 * field327 + " of max " + var2, null, (byte)113
                     );
                  }
               }
            }

            while (!field332.isEmpty()) {
               classDG var15 = (classDG)field332.remove(0);
               classEA.method3799(
                  var15.method3058((short)167),
                  classDG.method3062(var15, -65455964),
                  classDG.method3066(var15, -554920910),
                  var15.method3070((byte)19),
                  "",
                  1233500432
               );
            }

            if (field330) {
               field330 = false;
               classTB.method10737((byte)22);
            }

            if (!var9 && var3 > 0 && 695788488 * field327 >= var3) {
               classAAU.method275("Warning: Script " + var1.field500 + " finished at op count " + 688294531 * field327 + " of max " + var2, null, (byte)32);
            }

            return;
         }

         while (!field332.isEmpty()) {
            classDG var42 = (classDG)field332.remove(0);
            classEA.method3799(
               var42.method3058((short)167),
               classDG.method3062(var42, -65455964),
               classDG.method3066(var42, -554920910),
               var42.method3070((byte)36),
               "",
               -639054338
            );
         }

         if (field330) {
            field330 = false;
            classTB.method10737((byte)35);
         }

         if (!var9 && var3 > 0 && 1023779009 * field327 >= var3) {
            classAAU.method275("Warning: Script " + var1.field500 + " finished at op count " + -381661640 * field327 + " of max " + var2, null, (byte)124);
         }

         return;
      }

      while (!field332.isEmpty()) {
         classDG var10 = (classDG)field332.remove(0);
         classEA.method3799(
            var10.method3058((short)167),
            classDG.method3062(var10, -65455964),
            classDG.method3066(var10, -554920910),
            var10.method3070((byte)121),
            "",
            693116969
         );
      }

      if (field330) {
         field330 = false;
         classTB.method10737((byte)-36);
      }

      if (!var9 && var3 > 0 && -1088849780 * field327 >= var3) {
         classAAU.method275("Warning: Script " + var1.field500 + " finished at op count " + 696766243 * field327 + " of max " + var2, null, (byte)85);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzr;Lbl;II)V")
   @ObfuscatedName("dc")
   static void method787(ScriptEvent var0, Script var1, int var2, int var3) {
      Object[] var4 = var0.method14091(1780233749);
      DynamicObject.field1679 = 0;
      classXT.field6939 = 0;
      field338 = 0;
      int var5 = -1;
      int[] var6 = var1.field501;
      int[] var7 = var1.field502;
      int var8 = -1;
      field331 = 0;
      field330 = false;
      boolean var9 = false;
      field327 = 0;
      boolean var23 = false /* VF: Semaphore variable */;

      label734: {
         label735: {
            try {
               var23 = true;
               classDE.field1409 = new int[var1.field493 * -700311094];
               int var26 = 0;
               classDU.field1634 = new long[var1.field492 * 1141638279];
               int var27 = 0;
               classML.field4533 = new Object[1704204880 * var1.field496];
               int var28 = 0;

               for (int var13 = 1; var13 < var4.length; var13++) {
                  if (var4[var13] instanceof Integer) {
                     int var14 = (Integer)var4[var13];
                     if (var14 == -1945732620) {
                        var14 = var0.method14100(-2014493477);
                     }

                     if (var14 == -2147483646) {
                        var14 = var0.method14103((short)-1568);
                     }

                     if (var14 == 2014084116) {
                        var14 = ScriptEvent.method14092(var0, -1059868056) != null ? ScriptEvent.method14092(var0, -606693922).field4329 * -1163656551 : -1;
                     }

                     if (-833202233 == var14) {
                        var14 = ScriptEvent.method14108(var0, -1458160564);
                     }

                     if (var14 == -794945931) {
                        var14 = ScriptEvent.method14092(var0, 525796777) != null ? ScriptEvent.method14092(var0, 601248769).field4260 * 63131743 : -1;
                     }

                     if (-2147483642 == var14) {
                        var14 = ScriptEvent.method14111(var0, (byte)59) != null ? ScriptEvent.method14111(var0, (byte)-22).field4329 * -1163656551 : -1;
                     }

                     if (-1115735025 == var14) {
                        var14 = ScriptEvent.method14111(var0, (byte)38) != null ? ScriptEvent.method14111(var0, (byte)-25).field4260 * 63131743 : -1;
                     }

                     if (185562658 == var14) {
                        var14 = ScriptEvent.method14114(var0, -773759683);
                     }

                     if (var14 == 518479543) {
                        var14 = var0.method14120((short)25410);
                     }

                     if (-437991336 == var14) {
                        var14 = var0.method14124(1391339974);
                     }

                     classDE.field1409[var26++] = var14;
                  } else if (var4[var13] instanceof String) {
                     String var45 = (String)var4[var13];
                     if (var45.equals("event_opbase")) {
                        var45 = var0.method14125(811280628);
                     }

                     classML.field4533[var28++] = var45;
                  } else if (var4[var13] instanceof classTE) {
                     classML.field4533[var28++] = var4[var13];
                  } else if (var4[var13] instanceof Long) {
                     long var46 = (Long)var4[var13];
                     classDU.field1634[var27++] = var46;
                  }
               }

               field324 = var0.method14127(1784060491) * 687798650;

               label723:
               while (true) {
                  field327 += 33484609;
                  if (1023779009 * field327 > var2) {
                     throw new RuntimeException();
                  }

                  var8 = var6[++var5];
                  if (var8 < -1158691705) {
                     if (var8 == 0) {
                        field323[(DynamicObject.field1679 += 1134353155) * -324749371 - 1] = var7[var5];
                     } else if (1 == var8) {
                        int var44 = var7[var5];
                        field323[(DynamicObject.field1679 += -1491664638) * -266454898 - 1] = classLB.field4090[var44];
                     } else if (var8 == 2) {
                        int var43 = var7[var5];
                        classLB.field4090[var43] = field323[(DynamicObject.field1679 -= 120041229) * -492464126];
                        classXQ.method12876(var43, -1791732368);
                     } else if (var8 == 3) {
                        field328[(field338 += 1222866659) * 1375698635 - 1] = var1.method1136(var5, 1160357364);
                     } else if (6 == var8) {
                        var5 += var7[var5];
                     } else if (7 == var8) {
                        DynamicObject.field1679 -= 919548229;
                        if (field323[DynamicObject.field1679 * -324749371 + 1] != field323[1515045057 * DynamicObject.field1679]) {
                           var5 += var7[var5];
                        }
                     } else if (8 == var8) {
                        DynamicObject.field1679 -= 240082458;
                        if (field323[DynamicObject.field1679 * -324749371] == field323[1 + DynamicObject.field1679 * 992154553]) {
                           var5 += var7[var5];
                        }
                     } else if (9 == var8) {
                        DynamicObject.field1679 -= 240082458;
                        if (field323[1557225441 * DynamicObject.field1679] < field323[1 + DynamicObject.field1679 * -1418673902]) {
                           var5 += var7[var5];
                        }
                     } else if (10 == var8) {
                        DynamicObject.field1679 -= 240082458;
                        if (field323[-1913432872 * DynamicObject.field1679] > field323[DynamicObject.field1679 * -324749371 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (68 == var8) {
                        classXT.field6939 -= 137269379;
                        if (field322[1774259626 * classXT.field6939 + 1] != field322[18294437 * classXT.field6939]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == -713189624) {
                        classXT.field6939 -= 922785926;
                        if (field322[18294437 * classXT.field6939 + 1] == field322[classXT.field6939 * 1981405603]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == 1727112165) {
                        classXT.field6939 -= -1409911156;
                        if (field322[18294437 * classXT.field6939] < field322[-607848576 * classXT.field6939 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (var8 == -69710509) {
                        classXT.field6939 -= -1788239496;
                        if (field322[18294437 * classXT.field6939] > field322[-1535701001 * classXT.field6939 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (21 == var8) {
                        if (-685270966 * field331 == 0) {
                           var23 = false;
                           break label735;
                        }

                        classBJ var41 = field321[(field331 -= -689455211) * -395727100];
                        var1 = var41.field482;
                        var6 = var1.field501;
                        var7 = var1.field502;
                        var5 = var41.field478 * -1907403132;
                        classDE.field1409 = var41.field484;
                        classML.field4533 = var41.field486;
                        classDU.field1634 = var41.field485;
                     } else if (var8 == 25) {
                        int var40 = var7[var5];
                        field323[(DynamicObject.field1679 += 1149061177) * -297632607 - 1] = classEM.method3922(var40, -761011178);
                     } else if (var8 == 27) {
                        int var39 = var7[var5];
                        classGP.method5546(var39, field323[(DynamicObject.field1679 -= 120041229) * -641802271], 298508168);
                     } else if (var8 == 1008572778) {
                        DynamicObject.field1679 -= -1346699294;
                        if (field323[DynamicObject.field1679 * -1032502817] <= field323[DynamicObject.field1679 * -478687104 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (32 == var8) {
                        DynamicObject.field1679 -= 240082458;
                        if (field323[DynamicObject.field1679 * 1722330275] >= field323[-324749371 * DynamicObject.field1679 + 1]) {
                           var5 += var7[var5];
                        }
                     } else if (1339254189 == var8) {
                        classXT.field6939 -= -409156604;
                        if (field322[18294437 * classXT.field6939] <= field322[1 + classXT.field6939 * 18294437]) {
                           var5 += var7[var5];
                        }
                     } else if (73 == var8) {
                        classXT.field6939 -= 1699258970;
                        if (field322[classXT.field6939 * 18294437] >= field322[1 + classXT.field6939 * 18294437]) {
                           var5 += var7[var5];
                        }
                     } else if (33 == var8) {
                        field323[(DynamicObject.field1679 += 133210703) * -324749371 - 1] = classDE.field1409[var7[var5]];
                     } else if (-699029889 == var8) {
                        classDE.field1409[var7[var5]] = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                     } else if (var8 == 35) {
                        field328[(field338 += 1222866659) * 179800320 - 1] = classML.field4533[var7[var5]];
                     } else if (var8 == 645216617) {
                        classML.field4533[var7[var5]] = field328[(field338 -= 1426452391) * 1375698635];
                     } else if (var8 == 1783191442) {
                        int var38 = var7[var5];
                        field338 -= 1222866659 * var38;
                        String var55 = classFO.method4849(field328, field338 * 1375698635, var38, (byte)-91);
                        field328[(field338 += -6804692) * 1375698635 - 1] = var55;
                     } else if (38 == var8) {
                        DynamicObject.field1679 -= 1072846446;
                     } else if (-2051242639 == var8) {
                        field338 -= -574360795;
                     } else if (-66762996 == var8) {
                        if (50 == 414399844 * field331) {
                           throw new RuntimeException();
                        }

                        int var37 = var7[var5];
                        Script var54 = classSK.method10460(var37, 1833195168);
                        int[] var57 = new int[1143837281 * var54.field493];
                        Object[] var16 = new Object[var54.field496 * -242784014];
                        long[] var17 = new long[1141638279 * var54.field492];
                        if (306770163 * var54.field495 >= 0) {
                           System.arraycopy(
                              field323, 78749144 * DynamicObject.field1679 - var54.field495 * -1173273934 + 0, var57, 0, 306770163 * var54.field495
                           );
                        }

                        if (var54.field494 * 2120664535 >= 0) {
                           System.arraycopy(field328, field338 * 1375698635 - -1187978009 * var54.field494 + 0, var16, 0, var54.field494 * 2120664535);
                        }

                        if (var54.field497 * -1713070491 >= 0) {
                           System.arraycopy(field322, 0 + (18294437 * classXT.field6939 - var54.field497 * -537133327), var17, 0, var54.field497 * -1239152986);
                        }

                        DynamicObject.field1679 = DynamicObject.field1679 - var54.field495 * -557431392;
                        field338 = field338 - var54.field494 * 1962685174;
                        classXT.field6939 = classXT.field6939 - var54.field497 * 369216705;
                        classBJ var18 = new classBJ();
                        var18.field482 = var1;
                        var18.field478 = var5 * -651105091;
                        var18.field484 = classDE.field1409;
                        var18.field486 = classML.field4533;
                        var18.field485 = classDU.field1634;
                        field321[(field331 += -689455211) * -1626238019 - 1] = var18;
                        var1 = var54;
                        var6 = var54.field501;
                        var7 = var54.field502;
                        var5 = -1;
                        classDE.field1409 = var57;
                        classML.field4533 = var16;
                        classDU.field1634 = var17;
                     } else if (var8 == 280994973) {
                        field323[(DynamicObject.field1679 += -1075424780) * -324749371 - 1] = classSX.field6096.method3541(var7[var5], 592206636);
                     } else if (var8 == 684023247) {
                        classSX.field6096.method3538(var7[var5], field323[(DynamicObject.field1679 -= 120041229) * -324749371], 321899100);
                     } else if (658338912 == var8) {
                        field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classSX.field6096.method3546(var7[var5], -315159895);
                     } else if (var8 == 52) {
                        classDS.method3543(classSX.field6096, var7[var5], field322[(classXT.field6939 -= 1188589656) * 18294437]);
                     } else if (1275326142 == var8) {
                        int var36 = var7[var5] >> 16;
                        int var53 = var7[var5] & -2128451370;
                        int var56 = field323[(DynamicObject.field1679 -= 120041229) * -220799534];
                        if (var56 < 0 || var56 > 339318755) {
                           throw new RuntimeException();
                        }

                        if (115 == var53) {
                           classML.field4533[var36] = new classTE(classYY.field7113, "", var56, var56);
                        } else if (var53 != 381930628 && var53 != 49) {
                           classML.field4533[var36] = new classTE(classYY.field7111, -1, var56, var56);
                        } else {
                           classML.field4533[var36] = new classTE(classYY.field7111, 0, var56, var56);
                        }
                     } else if (var8 == 45) {
                        classTE var30 = classJY.method6421(var7[var5], classML.field4533[var7[var5]], (byte)-94);
                        int var48 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                        classMA.method7501(var30, var48, 1974248448);
                        if (classYY.field7111 == var30.field6128) {
                           field323[(DynamicObject.field1679 += 120041229) * -689415933 - 1] = var30.method10748(2110436933)[var48];
                        } else if (classYY.field7115 == var30.field6128) {
                           field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var30.method10750(-558284492)[var48];
                        } else {
                           field328[(field338 += 1222866659) * 1375698635 - 1] = classTE.method10753(var30, 1835543680)[var48];
                        }
                     } else if (var8 == 1373883379) {
                        classTE var31 = classJY.method6421(var7[var5], classML.field4533[var7[var5]], (byte)-30);
                        if (!var31.field6124) {
                           throw new RuntimeException();
                        }

                        if (classYY.field7111 == var31.field6128) {
                           DynamicObject.field1679 -= 1160465984;
                           int var49 = field323[DynamicObject.field1679 * -1264731217];
                           classMA.method7501(var31, var49, 1254955576);
                           var31.method10748(39420573)[var49] = field323[1 + -126577321 * DynamicObject.field1679];
                        } else if (var31.field6128 == classYY.field7115) {
                           int var50 = field323[(DynamicObject.field1679 -= 1578369223) * -324749371];
                           classMA.method7501(var31, var50, 478311697);
                           var31.method10750(-1095750896)[var50] = field322[(classXT.field6939 -= -28496135) * -267701873];
                        } else {
                           int var51 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
                           classMA.method7501(var31, var51, 1840433502);
                           classTE.method10753(var31, -1560666914)[var51] = field328[(field338 -= -249030227) * -1466017264];
                        }

                        var31.field6133 = true;
                     } else if (var8 == 49) {
                        Object var32 = classSX.field6096.method3564(var7[var5], (byte)79);
                        field328[(field338 += 597820926) * -624837380 - 1] = var32;
                     } else if (50 == var8) {
                        classSX.field6096.method3551(var7[var5], field328[(field338 -= 1222866659) * 1375698635], 694457904);
                     } else if (var8 == 60) {
                        IterableNodeHashTable var33 = var1.field505[var7[var5]];
                        IntegerNode var52 = (IntegerNode)var33.method13595(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
                        if (null != var52) {
                           var5 += var52.integer;
                        }
                     } else if (var8 == 63) {
                        field328[(field338 += 1222866659) * 1375698635 - 1] = null;
                     } else if (61 == var8) {
                        field322[(classXT.field6939 += -1288022710) * -342968954 - 1] = var1.method1138(var5, (byte)29);
                     } else if (-113852564 == var8) {
                        classXT.field6939 -= -16632367;
                     } else if (176696139 == var8) {
                        field322[(classXT.field6939 += -1766748629) * 18294437 - 1] = classDU.field1634[var7[var5]];
                     } else if (var8 == 1710058868) {
                        classDU.field1634[var7[var5]] = field322[(classXT.field6939 -= -1297854163) * 1337463849];
                     } else if (var8 == -811267473) {
                        Integer var34 = classNJ.field4678.method6247(var7[var5], (byte)75);
                        if (var34 == null) {
                           field323[(DynamicObject.field1679 += 120041229) * -262254103 - 1] = -1;
                        } else {
                           field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var34;
                        }
                     } else {
                        if (var8 != -1121486088) {
                           throw new IllegalStateException();
                        }

                        Integer var35 = classOH.field4871.method11235(var7[var5], 1814919021);
                        if (var35 == null) {
                           field323[(DynamicObject.field1679 += -801042461) * -324749371 - 1] = -1;
                        } else {
                           field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var35;
                        }
                     }
                  } else {
                     boolean var29 = 1 == var1.field502[var5];
                     int var47 = classQR.method9781(var8, var1, var29, (byte)5);
                     switch (var47) {
                        case 0:
                           var23 = false;
                           break label723;
                        case 1:
                        default:
                           break;
                        case 2:
                           throw new IllegalStateException();
                     }
                  }
               }
            } catch (Exception var24) {
               var9 = true;
               StringBuilder var11 = new StringBuilder(30);
               var11.append("").append(var1.field6552).append(" ");

               for (int var12 = field331 * -392767298 - 1; var12 >= 0; var12--) {
                  var11.append("").append(field321[var12].field482.field6552).append(" ");
               }

               var11.append("").append(var8);
               classAAU.method275(var11.toString(), var24, (byte)70);
               var23 = false;
               break label734;
            } finally {
               if (var23) {
                  while (!field332.isEmpty()) {
                     classDG var20 = (classDG)field332.remove(0);
                     classEA.method3799(
                        var20.method3058((short)167),
                        classDG.method3062(var20, -65455964),
                        classDG.method3066(var20, -554920910),
                        var20.method3070((byte)13),
                        "",
                        -1271983779
                     );
                  }

                  if (field330) {
                     field330 = false;
                     classTB.method10737((byte)65);
                  }

                  if (!var9 && var3 > 0 && -1887088601 * field327 >= var3) {
                     classAAU.method275(
                        "Warning: Script " + var1.field500 + " finished at op count " + -589603896 * field327 + " of max " + var2, null, (byte)74
                     );
                  }
               }
            }

            while (!field332.isEmpty()) {
               classDG var15 = (classDG)field332.remove(0);
               classEA.method3799(
                  var15.method3058((short)167),
                  classDG.method3062(var15, -65455964),
                  classDG.method3066(var15, -554920910),
                  var15.method3070((byte)126),
                  "",
                  -1454277144
               );
            }

            if (field330) {
               field330 = false;
               classTB.method10737((byte)-15);
            }

            if (!var9 && var3 > 0 && 654372322 * field327 >= var3) {
               classAAU.method275("Warning: Script " + var1.field500 + " finished at op count " + 1497580585 * field327 + " of max " + var2, null, (byte)64);
            }

            return;
         }

         while (!field332.isEmpty()) {
            classDG var42 = (classDG)field332.remove(0);
            classEA.method3799(
               var42.method3058((short)167),
               classDG.method3062(var42, -65455964),
               classDG.method3066(var42, -554920910),
               var42.method3070((byte)5),
               "",
               256353720
            );
         }

         if (field330) {
            field330 = false;
            classTB.method10737((byte)19);
         }

         if (!var9 && var3 > 0 && 1023779009 * field327 >= var3) {
            classAAU.method275("Warning: Script " + var1.field500 + " finished at op count " + -1956717618 * field327 + " of max " + var2, null, (byte)117);
         }

         return;
      }

      while (!field332.isEmpty()) {
         classDG var10 = (classDG)field332.remove(0);
         classEA.method3799(
            var10.method3058((short)167), classDG.method3062(var10, -65455964), classDG.method3066(var10, -554920910), var10.method3070((byte)4), "", 434304698
         );
      }

      if (field330) {
         field330 = false;
         classTB.method10737((byte)31);
      }

      if (!var9 && var3 > 0 && 1023779009 * field327 >= var3) {
         classAAU.method275("Warning: Script " + var1.field500 + " finished at op count " + 1023779009 * field327 + " of max " + var2, null, (byte)116);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gz")
   static int method872(int var0, Script var1, boolean var2) {
      if (3903 == var0) {
         int var33 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field864[var33].method7613(-335477945);
         return 1;
      } else if (3904 == var0) {
         int var32 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field864[var32].field4535 * 1561057361;
         return 1;
      } else if (var0 == 3905) {
         int var31 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field864[var31].field4534 * -1718041163;
         return 1;
      } else if (3906 == var0) {
         int var30 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 29846541 * client.field864[var30].field4536;
         return 1;
      } else if (3907 == var0) {
         int var29 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field864[var29].field4537 * 834365773;
         return 1;
      } else if (var0 == 3908) {
         int var28 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 464461553 * client.field864[var28].field4538;
         return 1;
      } else if (3910 == var0) {
         int var27 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         int var44 = GrandExchangeOffer.method7607(client.field864[var27], (short)3906);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var44 == 0 ? 1 : 0;
         return 1;
      } else if (var0 == 3911) {
         int var26 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         int var43 = GrandExchangeOffer.method7607(client.field864[var26], (short)3906);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var43 == 2 ? 1 : 0;
         return 1;
      } else if (3912 == var0) {
         int var25 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         int var42 = GrandExchangeOffer.method7607(client.field864[var25], (short)3906);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 5 == var42 ? 1 : 0;
         return 1;
      } else if (3913 == var0) {
         int var24 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         int var41 = GrandExchangeOffer.method7607(client.field864[var24], (short)3906);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var41 == 1 ? 1 : 0;
         return 1;
      } else if (var0 == 3914) {
         boolean var23 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         if (null != classON.field4994) {
            classON.field4994.method7730(classMV.field4606, var23, (byte)-41);
         }

         return 1;
      } else if (3915 == var0) {
         boolean var22 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         if (null != classON.field4994) {
            classON.field4994.method7730(classMV.field4605, var22, (byte)-31);
         }

         return 1;
      } else if (var0 == 3916) {
         DynamicObject.field1679 -= 240082458;
         boolean var21 = 1 == field323[-324749371 * DynamicObject.field1679];
         boolean var40 = field323[1 + -324749371 * DynamicObject.field1679] == 1;
         if (classON.field4994 != null) {
            client.field829.field744 = var40;
            classON.field4994.method7730(client.field829, var21, (byte)-95);
         }

         return 1;
      } else if (var0 == 3917) {
         boolean var20 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         if (null != classON.field4994) {
            classON.field4994.method7730(classMV.field4604, var20, (byte)-77);
         }

         return 1;
      } else if (3918 == var0) {
         boolean var19 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         if (null != classON.field4994) {
            classON.field4994.method7730(classMV.field4607, var19, (byte)-81);
         }

         return 1;
      } else if (3919 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classON.field4994 == null ? 0 : classON.field4994.field4608.size();
         return 1;
      } else if (var0 == 3920) {
         int var18 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classNM var39 = (classNM)classON.field4994.field4608.get(var18);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var39.field4686 * -906797091;
         return 1;
      } else if (var0 == 3921) {
         int var17 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classNM var38 = (classNM)classON.field4994.field4608.get(var17);
         field328[(field338 += 1222866659) * 1375698635 - 1] = var38.method7889(985767106);
         return 1;
      } else if (var0 == 3922) {
         int var16 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classNM var37 = (classNM)classON.field4994.field4608.get(var16);
         field328[(field338 += 1222866659) * 1375698635 - 1] = var37.method7891(49193);
         return 1;
      } else if (3923 == var0) {
         int var15 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classNM var36 = (classNM)classON.field4994.field4608.get(var15);
         long var5 = classDD.method2983(16711680) - classXO.field6905 - 4044309507405125089L * var36.field4687;
         int var7 = (int)(var5 / 3600000L);
         int var8 = (int)((var5 - var7 * 3600000) / 60000L);
         int var9 = (int)((var5 - 3600000 * var7 - 60000 * var8) / 1000L);
         String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
         field328[(field338 += 1222866659) * 1375698635 - 1] = var10;
         return 1;
      } else if (var0 == 3924) {
         int var14 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classNM var35 = (classNM)classON.field4994.field4608.get(var14);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 29846541 * var35.field4685.field4536;
         return 1;
      } else if (3925 == var0) {
         int var13 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classNM var34 = (classNM)classON.field4994.field4608.get(var13);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var34.field4685.field4534 * -1718041163;
         return 1;
      } else if (var0 == 3926) {
         int var12 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classNM var4 = (classNM)classON.field4994.field4608.get(var12);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field4685.field4535 * 1561057361;
         return 1;
      } else if (3931 == var0) {
         int var11 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classOB.method8299(var11, (byte)93).field5062 ? 1 : 0;
         return 1;
      } else if (3939 == var0) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classOB.method8299(var3, (byte)-19).field5063 ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;I)V")
   @ObfuscatedName("dm")
   static void method791(classTE var0, int var1) {
      if (var1 < 0 || var1 >= var0.method10756(-269194371)) {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("dx")
   static int method792(int var0, Script var1, boolean var2) {
      if (var0 < 1000) {
         return classGD.method5401(var0, var1, var2, (byte)-25);
      } else if (var0 < -887762931) {
         return classIG.method6210(var0, var1, var2, -1306305670);
      } else if (var0 < -1358681628) {
         return classCD.method1433(var0, var1, var2, (byte)0);
      } else if (var0 < 1300) {
         return classKD.method6466(var0, var1, var2, -1373877426);
      } else if (var0 < 1916562392) {
         return classQI.method9588(var0, var1, var2, (byte)7);
      } else if (var0 < -467309545) {
         return classGP.method5590(var0, var1, var2, 1839316601);
      } else if (var0 < 1600) {
         return classME.method7561(var0, var1, var2, (byte)62);
      } else if (var0 < 1700) {
         return classQM.method9653(var0, var1, var2, -1869587709);
      } else if (var0 < 1800) {
         return class468.method9413(var0, var1, var2, -495989347);
      } else if (var0 < 1900) {
         return classLI.method7109(var0, var1, var2, -650833097);
      } else if (var0 < 1653478401) {
         return classJG.method6367(var0, var1, var2, 2141916065);
      } else if (var0 < 2100) {
         return classIG.method6210(var0, var1, var2, -1306305670);
      } else if (var0 < 685148316) {
         return classCD.method1433(var0, var1, var2, (byte)0);
      } else if (var0 < 2300) {
         return classKD.method6466(var0, var1, var2, -474940668);
      } else if (var0 < 532819153) {
         return classQI.method9588(var0, var1, var2, (byte)-48);
      } else if (var0 < 2118020295) {
         return classGP.method5590(var0, var1, var2, 1839316601);
      } else if (var0 < 2600) {
         return classIP.method6232(var0, var1, var2, 1804259678);
      } else if (var0 < 2700) {
         return classML.method7598(var0, var1, var2, 544148111);
      } else if (var0 < 2800) {
         return classGA.method5292(var0, var1, var2, 36544118);
      } else if (var0 < -1467024353) {
         return Actor.method3268(var0, var1, var2, 1036139755);
      } else if (var0 < 3000) {
         return classJG.method6367(var0, var1, var2, -631631339);
      } else if (var0 < 3200) {
         return classKU.method6567(var0, var1, var2, 272527735);
      } else if (var0 < 977248951) {
         return Renderable.method3837(var0, var1, var2, (byte)-14);
      } else if (var0 < 1371780542) {
         return AbstractRasterProvider.method13321(var0, var1, var2, (short)13412);
      } else if (var0 < 3500) {
         return classEF.method3870(var0, var1, var2, -624595747);
      } else if (var0 < 216347567) {
         return classHR.method6099(var0, var1, var2, (byte)-38);
      } else if (var0 < 3700) {
         return classHU.method6118(var0, var1, var2, (byte)-28);
      } else if (var0 < -1971801560) {
         return BoundaryObject.method4614(var0, var1, var2, (byte)3);
      } else if (var0 < 995797472) {
         return WorldEntityConfig.method8503(var0, var1, var2, 23544037);
      } else if (var0 < 4000) {
         return classGL.method5496(var0, var1, var2, 1766697740);
      } else if (var0 < -447453081) {
         return classMC.method7533(var0, var1, var2, (byte)-59);
      } else if (var0 < -329776388) {
         return classJF.method6364(var0, var1, var2, (byte)4);
      } else if (var0 < 172846420) {
         return classKI.method6487(var0, var1, var2, 1592082944);
      } else if (var0 < -1748834779) {
         return classQO.method9698(var0, var1, var2, -1265604593);
      } else if (var0 < -189223527) {
         return classXO.method12866(var0, var1, var2, 1860044566);
      } else if (var0 < 5600) {
         return classFC.method4590(var0, var1, var2, -1165804573);
      } else if (var0 < -487617866) {
         return classTK.method10932(var0, var1, var2, 1229099773);
      } else if (var0 < 6300) {
         return classLO.method7135(var0, var1, var2, -1503643048);
      } else if (var0 < -1598093482) {
         return classSU.method10688(var0, var1, var2, (byte)-42);
      } else if (var0 < 6700) {
         return classHS.method6103(var0, var1, var2, (byte)-90);
      } else if (var0 < 6800) {
         return classOY.method8822(var0, var1, var2, -1102730606);
      } else if (var0 < -311564069) {
         return classCX.method2700(var0, var1, var2, (byte)-42);
      } else if (var0 < 7000) {
         return PacketWriter.method3389(var0, var1, var2, 541378504);
      } else if (var0 < 1495873716) {
         return classDI.method3357(var0, var1, var2, -1746214506);
      } else if (var0 < 7200) {
         return Projectile.method1222(var0, var1, var2, -1568720720);
      } else if (var0 < -416350757) {
         return classFK.method4821(var0, var1, var2, (byte)76);
      } else if (var0 < 7600) {
         return Friend.method10154(var0, var1, var2, (byte)-67);
      } else if (var0 < 741411422) {
         return classNF.method7835(var0, var1, var2, -1222860907);
      } else if (var0 < 8000) {
         return classKR.method6558(var0, var1, var2, (byte)-58);
      } else if (var0 < -1075001973) {
         return classFW.method5067(var0, var1, var2, 1141331763);
      } else if (var0 < 8600) {
         return classFS.method4980(var0, var1, var2, (byte)-9);
      } else {
         return var0 >= 13000 && var0 < 14000 ? classTR.method11126(var0, var1, var2, 1679510857) : 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;IZLbl;)V")
   @ObfuscatedName("dy")
   static void method793(Widget var0, int var1, boolean var2, Script var3) {
      if (null == var0.field4340) {
         var0.field4340 = new Widget[1 + var1];
      }

      if (var0.field4340.length <= var1) {
         Widget[] var4 = new Widget[var1 + 1];
         System.arraycopy(var0.field4340, 0, var4, 0, var0.field4340.length);
         var0.field4340 = var4;
      } else {
         Widget var5 = var0.field4340[var1];
         if (var5 != null) {
            if (var2) {
               throw new RuntimeException("");
            }

            classDM.method3434(var5, var0, (byte)-85);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;IZLbl;)V")
   @ObfuscatedName("di")
   static void method794(Widget var0, int var1, boolean var2, Script var3) {
      if (null == var0.field4340) {
         var0.field4340 = new Widget[1 + var1];
      }

      if (var0.field4340.length <= var1) {
         Widget[] var4 = new Widget[var1 + 1];
         System.arraycopy(var0.field4340, 0, var4, 0, var0.field4340.length);
         var0.field4340 = var4;
      } else {
         Widget var5 = var0.field4340[var1];
         if (var5 != null) {
            if (var2) {
               throw new RuntimeException("");
            }

            classDM.method3434(var5, var0, (byte)-128);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;IZLbl;)V")
   @ObfuscatedName("du")
   static void method795(Widget var0, int var1, boolean var2, Script var3) {
      if (null == var0.field4340) {
         var0.field4340 = new Widget[1 + var1];
      }

      if (var0.field4340.length <= var1) {
         Widget[] var4 = new Widget[var1 + 1];
         System.arraycopy(var0.field4340, 0, var4, 0, var0.field4340.length);
         var0.field4340 = var4;
      } else {
         Widget var5 = var0.field4340[var1];
         if (var5 != null) {
            if (var2) {
               throw new RuntimeException("");
            }

            classDM.method3434(var5, var0, (byte)-92);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyy;)Ljava/lang/Object;")
   @ObfuscatedName("iv")
   static Object method934(classYY var0) {
      if (var0 == null) {
         throw new IllegalStateException("popValueOfType() failure - null baseVarType");
      } else {
         switch (-900901303 * var0.field7107) {
            case 2:
               return field323[(DynamicObject.field1679 -= 1291633024) * -324749371];
            case 3:
               return field322[(classXT.field6939 -= -1297854163) * 48854757];
            case 4:
               return field328[(field338 -= 430369393) * 1954496423];
            default:
               throw new IllegalStateException("popValueOfType() failure - unsupported type");
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;I)V")
   @ObfuscatedName("dr")
   static void method797(Widget var0, int var1) {
      if (0 == var0.field4375 * -1510882375 && 63131743 * var0.field4260 > -1) {
         if (var1 > 379541057 * var0.field4266) {
            var0.field4266 = var1 * -1479820863;
         }

         if (var1 < var0.field4265 * -1210177335) {
            var0.field4265 = -452038279 * var1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("dk")
   static int method798(int var0, Script var1, boolean var2) {
      if (var0 == 100) {
         DynamicObject.field1679 -= 480164916;
         int var36 = field323[DynamicObject.field1679 * -324749371];
         int var56 = field323[-324749371 * DynamicObject.field1679 + 1];
         int var71 = field323[DynamicObject.field1679 * -324749371 + 2];
         boolean var84 = field323[DynamicObject.field1679 * -324749371 + 3] != 0;
         if (var71 < 0) {
            throw new RuntimeException("");
         } else {
            Widget var96 = classLY.method7375(classWK.field6691, var36, (byte)38);
            if (-1510882375 * var96.field4375 != 0) {
               throw new RuntimeException("");
            } else {
               classLJ.method7115(var96, var71, var84, var1, -1788834788);
               Widget var100 = new Widget();
               var100.field4375 = var56 * 685068937;
               var100.field4342 = (var100.field4329 = 1 * var96.field4329) * 498391781;
               var100.field4260 = -1612510305 * var71;
               var100.field4275 = true;
               if (12 == var56) {
                  classCH.method1502(var100, 2048206112);
               }

               var96.field4340[var71] = var100;
               if (var2) {
                  classSZ.field6110 = var100;
               } else {
                  TileItem.field1558 = var100;
               }

               return 1;
            }
         }
      } else if (var0 == 101) {
         Widget var35 = var2 ? classSZ.field6110 : TileItem.field1558;
         Widget var55 = classLY.method7375(classWK.field6691, var35.field4329 * -1163656551, (byte)17);
         classDM.method3434(var35, var55, (byte)-107);
         return 1;
      } else if (102 == var0) {
         DynamicObject.field1679 -= 120041229;
         int var34 = field323[DynamicObject.field1679 * -324749371];
         Widget var54 = classLY.method7375(classWK.field6691, var34, (byte)52);
         var54.field4340 = null;
         return 1;
      } else if (105 == var0) {
         DynamicObject.field1679 -= 360123687;
         int var33 = field323[-324749371 * DynamicObject.field1679];
         int var53 = field323[1 + -324749371 * DynamicObject.field1679];
         int var70 = field323[2 + -324749371 * DynamicObject.field1679];
         Widget var83 = classLY.method7375(classWK.field6691, var33, (byte)45);
         Widget var95 = classLY.method7378(classWK.field6691, var33, var53, (byte)-84);
         if (null == var83) {
            throw new RuntimeException("");
         } else if (var53 < 0) {
            throw new RuntimeException("");
         } else if (var95 == null) {
            throw new RuntimeException("");
         } else if (0 == -1510882375 * var95.field4375) {
            throw new RuntimeException("");
         } else {
            classLJ.method7115(var83, var70, true, var1, -1406502925);
            if (var95.field4263 * 653784551 != -1) {
               Widget var98 = classLY.method7378(classWK.field6691, var33, 653784551 * var95.field4263, (byte)-28);
               classOB.method8301(var98, var70, 427421377);
            }

            Widget var99 = new Widget(var95);
            var99.field4260 = -1612510305 * var70;
            if (var95.field4375 * -1510882375 == 12) {
               classCH.method1502(var99, 2033461259);
            }

            var83.field4340[var70] = var99;
            if (var2) {
               classSZ.field6110 = var99;
            } else {
               TileItem.field1558 = var99;
            }

            return 1;
         }
      } else if (106 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var32 = field323[-324749371 * DynamicObject.field1679];
         int var52 = field323[1 + -324749371 * DynamicObject.field1679];
         Widget var69 = var2 ? classSZ.field6110 : TileItem.field1558;
         if (var69 == null) {
            throw new RuntimeException("");
         } else {
            Widget var82 = classLY.method7375(classWK.field6691, var69.field4342 * -1502647899, (byte)76);
            if (-1510882375 * var69.field4375 != 0) {
               throw new RuntimeException("");
            } else if (0 != -1510882375 * var82.field4375) {
               throw new RuntimeException();
            } else {
               classLJ.method7115(var82, var52, true, var1, -1173263439);
               classOB.method8301(var69, var52, 427421377);
               Widget var94 = new Widget();
               var94.field4375 = 685068937 * var32;
               var94.field4342 = (var94.field4329 = 1 * var82.field4329) * 498391781;
               var94.field4263 = -355527991 * var69.field4260;
               var94.field4260 = var52 * -1612510305;
               var94.field4275 = true;
               if (12 == var32) {
                  classCH.method1502(var94, 1964015289);
               }

               var82.field4340[var52] = var94;
               if (var2) {
                  classSZ.field6110 = var94;
               } else {
                  TileItem.field1558 = var94;
               }

               return 1;
            }
         }
      } else if (107 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var31 = field323[-324749371 * DynamicObject.field1679];
         int var51 = field323[1 + DynamicObject.field1679 * -324749371];
         Widget var68 = var2 ? classSZ.field6110 : TileItem.field1558;
         if (null == var68) {
            throw new RuntimeException("");
         } else {
            Widget var81 = classLY.method7378(classWK.field6691, var68.field4342 * -1502647899, var68.field4263 * 653784551, (byte)-66);
            Widget var93 = classLY.method7375(classWK.field6691, -1502647899 * var81.field4342, (byte)99);
            if (var81.field4375 * -1510882375 != 0) {
               throw new RuntimeException("");
            } else if (0 != -1510882375 * var93.field4375) {
               throw new RuntimeException();
            } else {
               classLJ.method7115(var93, var51, true, var1, -622554536);
               classOB.method8301(var81, var51, 427421377);
               Widget var97 = new Widget();
               var97.field4375 = var31 * 685068937;
               var97.field4342 = (var97.field4329 = var93.field4329 * 1) * 498391781;
               var97.field4263 = -355527991 * var81.field4260;
               var97.field4260 = -1612510305 * var51;
               var97.field4275 = true;
               if (var31 == 12) {
                  classCH.method1502(var97, 2105219214);
               }

               var93.field4340[var51] = var97;
               if (var2) {
                  classSZ.field6110 = var97;
               } else {
                  TileItem.field1558 = var97;
               }

               return 1;
            }
         }
      } else if (var0 == 200) {
         DynamicObject.field1679 -= 240082458;
         int var30 = field323[DynamicObject.field1679 * -324749371];
         int var50 = field323[DynamicObject.field1679 * -324749371 + 1];
         Widget var67 = var50 != -1 ? classLY.method7378(classWK.field6691, var30, var50, (byte)24) : null;
         client.method1677(var67, var2, -357729052);
         return 1;
      } else if (var0 == 201) {
         client.method1677(classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)109), var2, -1056737044);
         return 1;
      } else if (var0 == 204) {
         Widget var29 = var2 ? classSZ.field6110 : TileItem.field1558;
         Widget var49 = var29 != null ? classLY.method7378(classWK.field6691, var29.field4342 * -1502647899, 653784551 * var29.field4263, (byte)-77) : null;
         client.method1677(var49, var2, 201504238);
         return 1;
      } else if (205 == var0) {
         Widget var28 = var2 ? classSZ.field6110 : TileItem.field1558;
         Widget var48 = var28 != null ? classLY.method7375(classWK.field6691, -1502647899 * var28.field4342, (byte)88) : null;
         client.method1677(var48, var2, 1881012718);
         return 1;
      } else if (206 == var0) {
         Widget var27 = var2 ? classSZ.field6110 : TileItem.field1558;
         if (null == var27) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else if (63131743 * var27.field4260 == -1) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else {
            Widget var47 = classLY.method7375(classWK.field6691, var27.field4342 * -1502647899, (byte)40);
            Widget var66 = null;

            for (int var80 = 1 + 63131743 * var27.field4260; var80 < var47.field4340.length; var80++) {
               Widget var92 = var47.field4340[var80];
               if (null != var92 && var92.field4263 * 653784551 == var27.field4263 * 653784551) {
                  var66 = var92;
                  break;
               }
            }

            client.method1677(var66, var2, 228939131);
            return 1;
         }
      } else if (207 == var0) {
         Widget var26 = var2 ? classSZ.field6110 : TileItem.field1558;
         if (var26 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else if (var26.field4260 * 63131743 == -1) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else {
            Widget var46 = classLY.method7375(classWK.field6691, var26.field4342 * -1502647899, (byte)21);
            Widget var65 = null;

            for (int var79 = 63131743 * var26.field4260 - 1; var79 >= 0; var79--) {
               Widget var91 = var46.field4340[var79];
               if (var91 != null && 653784551 * var26.field4263 == 653784551 * var91.field4263) {
                  var65 = var91;
                  break;
               }
            }

            client.method1677(var65, var2, 2051682480);
            return 1;
         }
      } else if (208 == var0) {
         Widget var25 = var2 ? classSZ.field6110 : TileItem.field1558;
         if (null == var25) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else if (var25.field4375 * -1510882375 != 0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else {
            Widget var45 = classLY.method7375(classWK.field6691, -1502647899 * var25.field4342, (byte)19);
            if (var45.field4340 == null) {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            } else {
               int var64 = 0;

               for (int var78 = 0; var78 < var45.field4340.length; var78++) {
                  Widget var90 = var45.field4340[var78];
                  if (null != var90 && var90.field4263 * 653784551 == var25.field4260 * 63131743) {
                     var64++;
                  }
               }

               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var64;
               return 1;
            }
         }
      } else if (var0 == 209) {
         Widget var24 = var2 ? classSZ.field6110 : TileItem.field1558;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var24 != null ? 653784551 * var24.field4263 : -1;
         return 1;
      } else if (var0 == 210) {
         int var23 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         int var44 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         Object var63 = classKN.method6500(var23, -902845513);
         int var77 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         Object var89 = classKN.method6500(var44, 989995794);
         int var8 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classPN var9 = classNE.method7829(var8, (byte)-9);
         Object var10 = var9.method9031((byte)-53);
         Object var11 = null;
         if (var77 >= 0) {
            classPN var12 = classNE.method7829(var77, (byte)-30);
            var11 = var12.method9031((byte)-42);
         }

         Widget var101 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)92);
         Widget var13 = null;
         if (var101 != null && var101.field4340 != null) {
            for (int var14 = 0; var14 < var101.field4340.length; var14++) {
               Widget var15 = var101.field4340[var14];
               if (var15 != null
                  && (var8 < 0 || var15.method7220(var8, var10, 1534784886).equals(var89))
                  && (var77 < 0 || var15.method7220(var77, var11, 1343633731).equals(var63))) {
                  var13 = var15;
                  break;
               }
            }
         }

         client.method1677(var13, var2, 1646161759);
         return 1;
      } else if (211 == var0) {
         DynamicObject.field1679 -= 360123687;
         int var22 = field323[-324749371 * DynamicObject.field1679];
         Widget var43 = classLY.method7375(classWK.field6691, field323[1 + -324749371 * DynamicObject.field1679], (byte)74);
         int var62 = field323[2 + -324749371 * DynamicObject.field1679];
         field326.method7399(var22, var43, var62, 1453250184);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classLZ.method7412(field326, 1316598878);
         return 1;
      } else if (var0 == 212) {
         int var21 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         Widget var42 = var2 ? classSZ.field6110 : TileItem.field1558;
         if (63131743 * var42.field4260 == -1) {
            field326.method7399(var21, var42, -1, 1453250184);
         } else {
            field326.method7399(var21, classLY.method7375(classWK.field6691, var42.field4342 * -1502647899, (byte)72), 63131743 * var42.field4260, 1453250184);
         }

         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classLZ.method7412(field326, 1547345271);
         return 1;
      } else if (213 == var0) {
         client.method1677(field326.method7415(-1992217275), var2, 1354686091);
         return 1;
      } else if (214 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = field326.method7420(-734085851);
         return 1;
      } else if (215 == var0) {
         field328[(field338 += 1222866659) * 1375698635 - 1] = classKH.method6476(field326.method7423(-1713040332), (byte)99);
         return 1;
      } else if (var0 == 216) {
         int var20 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         Object var41 = classKN.method6500(var20, 1726174847);
         int var61 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classPN var76 = classNE.method7829(var61, (byte)61);
         Object var88 = var76.method9031((byte)81);
         field326.method7424(var61, var41, var88, (byte)-24);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classLZ.method7412(field326, 1153153549);
         return 1;
      } else if (217 == var0) {
         int var19 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         Widget var40 = var2 ? classSZ.field6110 : TileItem.field1558;
         if (null == var40) {
            throw new RuntimeException("");
         } else if (var40.field4375 * -1510882375 != 0) {
            throw new RuntimeException("");
         } else {
            Widget var60 = classLY.method7375(classWK.field6691, -1502647899 * var40.field4342, (byte)48);
            if (-1510882375 * var60.field4375 != 0) {
               throw new RuntimeException();
            } else {
               Widget var75 = GraphicsObject.method1100(var19, var60, var40, (byte)0);
               client.method1677(var75, var2, 558557211);
               return 1;
            }
         }
      } else if (var0 == 218) {
         Widget var18 = var2 ? classSZ.field6110 : TileItem.field1558;
         if (var18 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else {
            Widget var39 = classLY.method7375(classWK.field6691, -1502647899 * var18.field4342, (byte)18);
            if (var39 != null && null != var39.field4340) {
               Widget var59 = null;

               for (int var74 = 0; var74 < var39.field4340.length; var74++) {
                  Widget var87 = var39.field4340[var74];
                  if (var87 != null && var18.field4263 * 653784551 == var87.field4263 * 653784551) {
                     var59 = var87;
                     break;
                  }
               }

               client.method1677(var59, var2, -345972057);
               return 1;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         }
      } else if (219 == var0) {
         Widget var17 = var2 ? classSZ.field6110 : TileItem.field1558;
         if (null == var17) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else {
            Widget var38 = classLY.method7375(classWK.field6691, var17.field4342 * -1502647899, (byte)24);
            if (var38 != null && var38.field4340 != null) {
               Widget var58 = null;

               for (int var73 = var38.field4340.length - 1; var73 >= 0; var73--) {
                  Widget var86 = var38.field4340[var73];
                  if (null != var86 && var17.field4263 * 653784551 == 653784551 * var86.field4263) {
                     var58 = var86;
                     break;
                  }
               }

               client.method1677(var58, var2, 487061115);
               return 1;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         }
      } else if (220 == var0) {
         Widget var16 = var2 ? classSZ.field6110 : TileItem.field1558;
         if (null == var16) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else if (var16.field4375 * -1510882375 != 0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else {
            Widget var37 = classLY.method7375(classWK.field6691, -1502647899 * var16.field4342, (byte)70);
            if (var37 != null && null != var37.field4340) {
               Widget var57 = null;

               for (int var72 = 0; var72 < var37.field4340.length; var72++) {
                  Widget var85 = var37.field4340[var72];
                  if (var85 != null && var16.field4260 * 63131743 == var85.field4263 * 653784551) {
                     var57 = var85;
                     break;
                  }
               }

               client.method1677(var57, var2, -600049098);
               return 1;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         }
      } else if (var0 == 221) {
         Widget var3 = var2 ? classSZ.field6110 : TileItem.field1558;
         if (null == var3) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else if (0 != var3.field4375 * -1510882375) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else {
            Widget var4 = classLY.method7375(classWK.field6691, -1502647899 * var3.field4342, (byte)103);
            if (null != var4 && null != var4.field4340) {
               Widget var5 = null;

               for (int var6 = var4.field4340.length - 1; var6 >= 0; var6--) {
                  Widget var7 = var4.field4340[var6];
                  if (var7 != null && 63131743 * var3.field4260 == var7.field4263 * 653784551) {
                     var5 = var7;
                     break;
                  }
               }

               client.method1677(var5, var2, 1177115010);
               return 1;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            }
         }
      } else if (222 == var0) {
         if (null == (var2 ? classSZ.field6110 : TileItem.field1558)) {
            throw new RuntimeException("");
         } else {
            return 1;
         }
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILlw;Llw;)Llw;")
   @ObfuscatedName("db")
   static Widget method799(int var0, Widget var1, Widget var2) {
      int var3 = 0;
      Widget var4 = null;

      for (int var5 = 1 + 63131743 * var2.field4260; var5 < var1.field4340.length; var5++) {
         Widget var6 = var1.field4340[var5];
         if (null != var6 && var6.field4263 * -765695383 == var2.field4260 * 63131743) {
            if (++var3 - 1 == var0) {
               var4 = var6;
               break;
            }
         }
      }

      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILlw;Llw;)Llw;")
   @ObfuscatedName("dw")
   static Widget method800(int var0, Widget var1, Widget var2) {
      int var3 = 0;
      Widget var4 = null;

      for (int var5 = 1 + -858527767 * var2.field4260; var5 < var1.field4340.length; var5++) {
         Widget var6 = var1.field4340[var5];
         if (null != var6 && var6.field4263 * 653784551 == var2.field4260 * 2091651169) {
            if (++var3 - 1 == var0) {
               var4 = var6;
               break;
            }
         }
      }

      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILlw;Llw;)Llw;")
   @ObfuscatedName("dh")
   static Widget method801(int var0, Widget var1, Widget var2) {
      int var3 = 0;
      Widget var4 = null;

      for (int var5 = 1 + 63131743 * var2.field4260; var5 < var1.field4340.length; var5++) {
         Widget var6 = var1.field4340[var5];
         if (null != var6 && var6.field4263 * 653784551 == var2.field4260 * 63131743) {
            if (++var3 - 1 == var0) {
               var4 = var6;
               break;
            }
         }
      }

      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILlw;Llw;)Llw;")
   @ObfuscatedName("de")
   static Widget method802(int var0, Widget var1, Widget var2) {
      int var3 = 0;
      Widget var4 = null;

      for (int var5 = 1 + -561420891 * var2.field4260; var5 < var1.field4340.length; var5++) {
         Widget var6 = var1.field4340[var5];
         if (null != var6 && var6.field4263 * -1494040603 == var2.field4260 * 88041472) {
            if (++var3 - 1 == var0) {
               var4 = var6;
               break;
            }
         }
      }

      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Z)V")
   @ObfuscatedName("dz")
   static void method803(Widget var0, boolean var1) {
      if (var0 != null) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
         if (var1) {
            classSZ.field6110 = var0;
         } else {
            TileItem.field1558 = var0;
         }
      } else {
         field323[(DynamicObject.field1679 += -1660957595) * -1928346505 - 1] = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyy;Ljava/lang/Object;)V")
   @ObfuscatedName("id")
   static void method940(classYY var0, Object var1) {
      if (var0 == null) {
         throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
      } else {
         switch (-125970184 * var0.field7107) {
            case 2:
               field323[(DynamicObject.field1679 += 1646224659) * -2108837671 - 1] = (Integer)var1;
               break;
            case 3:
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = (Long)var1;
               break;
            case 4:
               field328[(field338 += 1222866659) * 2059894390 - 1] = var1;
               break;
            default:
               throw new IllegalStateException("pushValueOfType() failure - unsupported type");
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("io")
   static int method929(int var0, Script var1, boolean var2) {
      if (var0 == 13337) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1023779009 * field327;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;)V")
   @ObfuscatedName("jz")
   static void method944(Widget var0) {
      var0.method7281(1655070984);
      var0.method7283(-742369557).method6969(new classDQ(var0), -1391347972);
      classLH.method6962(var0.method7283(-257303994), new classCA(var0), (byte)3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("dg")
   static int method807(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= -1721406832) {
         var0 -= 1000;
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -2100615436];
         var3 = classLY.method7375(classWK.field6691, var4, (byte)70);
      } else {
         var3 = var2 ? classSZ.field6110 : TileItem.field1558;
      }

      if (var0 == 1100) {
         DynamicObject.field1679 -= 240082458;
         int var40 = field323[DynamicObject.field1679 * -1074599221];
         int var48 = field323[1 + -324749371 * DynamicObject.field1679];
         if (12 == 811592151 * var3.field4375) {
            classLH var49 = var3.method7283(-836056232);
            if (null != var49 && var49.method6834(var40, var48, -707431920)) {
            }
         } else {
            var3.field4341 = var40 * 1728598736;
            if (-34809441 * var3.field4341 > var3.field4258 * -610251842 - var3.field4249 * -1212869714) {
               var3.field4341 = var3.field4258 * -1437415729 - 2134006567 * var3.field4249;
            }

            if (var3.field4341 * -34809441 < 0) {
               var3.field4341 = 0;
            }

            var3.field4331 = -1148676629 * var48;
            if (var3.field4331 * -41424189 > -714521463 * var3.field4269 - var3.field4259 * 293773697) {
               var3.field4331 = var3.field4269 * 410381218 - var3.field4259 * 873813025;
            }

            if (-485590265 * var3.field4331 < 0) {
               var3.field4331 = 0;
            }
         }

         return 1;
      } else if (1101 == var0) {
         var3.field4270 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] * 1590850751;
         return 1;
      } else if (var0 == 1272095251) {
         var3.field4271 = field323[(DynamicObject.field1679 -= 120041229) * -915879194] == 1;
         return 1;
      } else if (1103 == var0) {
         var3.field4347 = field323[(DynamicObject.field1679 -= 120041229) * 173708325] * -1344683423;
         return 1;
      } else if (1947849759 == var0) {
         var3.field4277 = field323[(DynamicObject.field1679 -= 1047535097) * -98015686] * 327091521;
         return 1;
      } else if (var0 == 1105) {
         var3.field4348 = field323[(DynamicObject.field1679 -= 120041229) * -144158977] * -1891566273;
         return 1;
      } else if (var0 == 1893996107) {
         var3.field4351 = field323[(DynamicObject.field1679 -= -797879334) * -324749371] * 86320869;
         return 1;
      } else if (1107 == var0) {
         var3.field4282 = field323[(DynamicObject.field1679 -= 120041229) * 1190865873] == 1;
         return 1;
      } else if (-1175068093 == var0) {
         var3.field4333 = 286159542;
         var3.field4374 = field323[(DynamicObject.field1679 -= -2077916892) * -324749371] * -1848606902;
         return 1;
      } else if (-712406652 == var0) {
         DynamicObject.field1679 -= 720247374;
         var3.field4290 = -822812866 * field323[-324749371 * DynamicObject.field1679];
         var3.field4291 = -979983383 * field323[1 + -187316347 * DynamicObject.field1679];
         var3.field4356 = 1724693258 * field323[2 + 1375502373 * DynamicObject.field1679];
         var3.field4292 = field323[3 + 1869580808 * DynamicObject.field1679] * 993003239;
         var3.field4294 = field323[237848824 * DynamicObject.field1679 + 4] * 863028557;
         var3.field4338 = field323[DynamicObject.field1679 * -324749371 + 5] * 1556726191;
         return 1;
      } else if (1729558291 == var0) {
         int var39 = field323[(DynamicObject.field1679 -= -1387197896) * 1036163857];
         if (var3.field4288 * 2114568197 != var39) {
            var3.field4288 = 2122616465 * var39;
            var3.field4321 = 0;
            var3.field4327 = 0;
         }

         return 1;
      } else if (var0 == -1374050667) {
         var3.field4297 = field323[(DynamicObject.field1679 -= 120041229) * 1132213998] == 1;
         return 1;
      } else if (1112 == var0) {
         String var37 = (String)field328[(field338 -= 2037893256) * 1375698635];
         var37 = classUP.method11420(var37, User.method10179(-2141059080), field334, field333, (byte)0);
         if (12 == 1417638640 * var3.field4375) {
            classLH var47 = var3.method7283(-1257238111);
            if (var47 != null && var47.method6998((byte)-8)) {
               classLH.method6804(var47, var37, -403367355);
            } else {
               var3.field4301 = var37;
            }
         } else if (!var37.equals(var3.field4301)) {
            var3.field4301 = var37;
         }

         return 1;
      } else if (1113 == var0) {
         var3.field4245 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] * -2129081966;
         if (-1510882375 * var3.field4375 == 12) {
            classLH var36 = var3.method7283(-47738767);
            if (null != var36) {
               var36.method6849(718765576);
            }
         }

         return 1;
      } else if (var0 == 1114) {
         DynamicObject.field1679 -= 360123687;
         if (12 == var3.field4375 * -1510882375) {
            classLH var35 = var3.method7283(-1897764765);
            if (null != var35) {
               classLH.method6840(var35, field323[DynamicObject.field1679 * 26223087], field323[1 + -324749371 * DynamicObject.field1679], -12231092);
               var35.method6841(field323[DynamicObject.field1679 * -324749371 + 2], 879336967);
            }
         } else {
            var3.field4304 = 571804797 * field323[DynamicObject.field1679 * -324749371];
            var3.field4305 = -2106140265 * field323[-324749371 * DynamicObject.field1679 + 1];
            var3.field4303 = field323[2 + DynamicObject.field1679 * -324749371] * 1555848863;
         }

         return 1;
      } else if (1115 == var0) {
         var3.field4306 = field323[(DynamicObject.field1679 -= 257588487) * -64393735] == 1;
         return 1;
      } else if (var0 == 1116) {
         var3.field4283 = field323[(DynamicObject.field1679 -= -2082130684) * -324749371] * -1993421947;
         return 1;
      } else if (var0 == -1394133397) {
         var3.field4284 = field323[(DynamicObject.field1679 -= -1742971340) * -324749371] * 37017731;
         return 1;
      } else if (1160403009 == var0) {
         var3.field4352 = field323[(DynamicObject.field1679 -= 120041229) * 402530318] == 1;
         return 1;
      } else if (var0 == 1448048848) {
         var3.field4256 = field323[(DynamicObject.field1679 -= -293450945) * 1586051726] == 1;
         return 1;
      } else if (-763987955 == var0) {
         DynamicObject.field1679 -= 240082458;
         var3.field4258 = -803344527 * field323[DynamicObject.field1679 * 1971008745];
         var3.field4269 = 1892883510 * field323[-1622388559 * DynamicObject.field1679 + 1];
         if (0 == var3.field4375 * -1510882375) {
            Widget[] var34 = -1 == var3.field4260 * 63131743
               ? classWK.field6691.field4440[-1163656551 * var3.field4329 >> 16]
               : classLY.method7375(classWK.field6691, var3.field4342 * -1502647899, (byte)65).field4340;
            classFC.method4586(var34, var3, false, classWK.field6691, client.field823, -1199737652);
         }

         return 1;
      } else if (var0 == 1121) {
         classUL.method11401(-619482583 * var3.field4329, var3.field4260 * 63131743, 1283248075);
         classVV.method12163(classWK.field6691, var3, 787177554);
         return 1;
      } else if (var0 == 1122) {
         var3.field4349 = field323[(DynamicObject.field1679 -= -1629276254) * 2125930219] * 1515656587;
         return 1;
      } else if (var0 == 1123) {
         var3.field4295 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] * 1495107918;
         return 1;
      } else if (var0 == 1124) {
         var3.field4276 = field323[(DynamicObject.field1679 -= -499824893) * 20074437] * 61705535;
         return 1;
      } else if (var0 == 1125) {
         int var33 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classYE var46 = (classYE)classOF.method8404(classCX.method2696(1652158916), var33, -1742563420);
         if (var46 != null) {
            var3.field4307 = var46;
         }

         return 1;
      } else if (var0 == 1126) {
         boolean var32 = field323[(DynamicObject.field1679 -= 2031232601) * 880004852] == 1;
         var3.field4278 = var32;
         return 1;
      } else if (1471710407 == var0) {
         boolean var31 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         var3.field4298 = var31;
         return 1;
      } else if (var0 == -1475392699) {
         var3.field4339 = (String)field328[(field338 -= 1222866659) * -356984496];
         return 1;
      } else if (var0 == 1130) {
         var3.method7232((String)field328[(field338 -= 171227036) * 1375698635], "", classAV.field294, classBF.method1041(-810524262));
         return 1;
      } else if (1131 == var0) {
         DynamicObject.field1679 -= 240082458;
         var3.method7241(field323[DynamicObject.field1679 * -324749371], field323[DynamicObject.field1679 * 1305733127 + 1], -1844055709);
         return 1;
      } else if (1132 == var0) {
         Widget.method7243(
            var3, (String)field328[(field338 -= 1868757039) * -1504496220], field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)3
         );
         return 1;
      } else if (1810423057 == var0) {
         DynamicObject.field1679 -= 120041229;
         classLI var30 = Widget.method7285(var3, 621796003);
         if (var30 != null) {
            var30.field4172 = 2144711541 * field323[DynamicObject.field1679 * 501400477];
         }

         return 1;
      } else if (1134 == var0) {
         DynamicObject.field1679 -= -767715045;
         classLI var29 = Widget.method7285(var3, 1422380272);
         if (null != var29) {
            var29.field4170 = field323[DynamicObject.field1679 * -324749371] * 154731097;
         }

         return 1;
      } else if (var0 == 1867273767) {
         field338 -= -659781834;
         classLH var28 = var3.method7283(-1798793422);
         if (var28 != null) {
            String var44 = (String)field328[field338 * 1383291046];
            var44 = classUP.method11420(var44, User.method10179(-1894774780), field334, field333, (byte)0);
            var3.field4302 = var44;
         }

         return 1;
      } else if (var0 == 1136) {
         DynamicObject.field1679 -= -185317168;
         classLI var27 = Widget.method7285(var3, 1093693718);
         if (null != var27) {
            var27.field4169 = field323[DynamicObject.field1679 * -50671235] * -493540047;
         }

         return 1;
      } else if (1137 == var0) {
         DynamicObject.field1679 -= -1471228865;
         classLH var26 = var3.method7283(-1541986404);
         if (var26 != null && var26.method6820(field323[DynamicObject.field1679 * -1964883565], -1939658212)) {
         }

         return 1;
      } else if (1138 == var0) {
         DynamicObject.field1679 -= -542638130;
         classLH var25 = var3.method7283(-410273083);
         if (var25 != null && var25.method6827(field323[-324749371 * DynamicObject.field1679], (byte)1)) {
         }

         return 1;
      } else if (1139 == var0) {
         DynamicObject.field1679 -= -1680497796;
         classLH var24 = var3.method7283(-88662890);
         if (null != var24 && classLH.method6832(var24, field323[DynamicObject.field1679 * -324749371], (byte)71)) {
         }

         return 1;
      } else if (1140 == var0) {
         boolean var23 = field323[(DynamicObject.field1679 -= -521303739) * -324749371] == 1;
         client.field908.method4582((byte)30);
         classLH var43 = var3.method7283(-1140395779);
         if (var43 != null && var43.method6798(var23, 1379975907) && var23) {
            client.field908.method4576(var3, (byte)-30);
         }

         return 1;
      } else if (490382241 == var0) {
         boolean var22 = field323[(DynamicObject.field1679 -= 1533683548) * -324749371] == 1;
         if (!var22 && client.field908.method4571(2065058758) == var3) {
            client.field908.method4582((byte)75);
         }

         classLH var42 = var3.method7283(-2041119208);
         if (null != var42) {
            classLH.method6800(var42, var22, -486559969);
         }

         return 1;
      } else if (419987781 == var0) {
         DynamicObject.field1679 -= 240082458;
         classLH var21 = var3.method7283(-789075035);
         if (null != var21
            && classLH.method6882(var21, field323[DynamicObject.field1679 * -324749371], field323[DynamicObject.field1679 * -324749371 + 1], 1122842785)) {
         }

         return 1;
      } else if (1143 == var0) {
         DynamicObject.field1679 -= 1295454436;
         classLH var20 = var3.method7283(-487485999);
         if (var20 != null
            && classLH.method6882(var20, field323[DynamicObject.field1679 * -324749371], field323[DynamicObject.field1679 * 768372261], 1122842785)) {
         }

         return 1;
      } else if (403135756 == var0) {
         DynamicObject.field1679 -= 120041229;
         classLH var19 = var3.method7283(-621721422);
         if (null != var19) {
            classLH.method7031(var19, field323[-324749371 * DynamicObject.field1679], (short)248);
         }

         return 1;
      } else if (1145 == var0) {
         DynamicObject.field1679 -= -1096540647;
         classLH var18 = var3.method7283(-1830561029);
         if (var18 != null) {
            var18.method7020(field323[-696421298 * DynamicObject.field1679], (byte)0);
         }

         return 1;
      } else if (var0 == 1146) {
         DynamicObject.field1679 -= 120041229;
         classLH var17 = var3.method7283(-14266661);
         if (var17 != null) {
            var17.method6845(field323[DynamicObject.field1679 * -324749371], 1116199833);
         }

         return 1;
      } else if (1147 == var0) {
         DynamicObject.field1679 -= 120041229;
         classLH var16 = var3.method7283(-969410528);
         if (null != var16) {
            classLH.method7043(var16, field323[-324749371 * DynamicObject.field1679], 2117141590);
         }

         return 1;
      } else if (1148 == var0) {
         DynamicObject.field1679 -= 240082458;
         classTT var15 = Widget.method7287(var3, 1289741507);
         if (var15 != null) {
            var15.method11132(field323[DynamicObject.field1679 * -590089605], field323[-324749371 * DynamicObject.field1679 + 1], 2057083221);
         }

         return 1;
      } else if (var0 == -2113247721) {
         DynamicObject.field1679 -= 240082458;
         classTT var14 = Widget.method7287(var3, 1289741507);
         if (null != var14) {
            var14.method11136((char)field323[DynamicObject.field1679 * -324749371], field323[1 + -324749371 * DynamicObject.field1679], (byte)57);
         }

         return 1;
      } else if (-842653649 == var0) {
         var3.method7236((String)field328[(field338 -= -211312725) * 1692090955], classAV.field294, -414739435);
         return 1;
      } else if (1151 == var0) {
         field338 -= -626367319;
         String var13 = (String)field328[-273350803 * field338];
         String var41 = (String)field328[1 + field338 * 1571519498];
         String var6 = (String)field328[1104902114 * field338 + 2];
         long var7 = classBF.method1041(429858666);
         long var9 = classKN.method6498(1632302393);
         String var11 = classAW.method723(classEA.method3798(-1760237229), classEA.method3798(1842250913).field6573 * -812634406, -827368693);
         if (var7 != -1L) {
            var13 = var13.replaceAll("%userid%", Long.toString(var7));
         }

         if (var9 != -1L) {
            var13 = var13.replaceAll("%userhash%", Long.toString(var9));
         }

         if (!var11.isEmpty()) {
            var13 = var13.replaceAll("%deviceid%", var11);
         }

         Widget.method7233(var3, var13, var41, var6, var11, Long.toString(var9), classAV.field294, -1826226851);
         return 1;
      } else if (1152 == var0) {
         if (-1142429326 * var3.field4375 != 11) {
            throw new RuntimeException();
         } else {
            classMA var12 = var3.method7270(-1626603432);
            boolean var5 = var12 != null
               && classMA.method7444(var12, (byte)0)
               && classMU.method7722(classHS.method6101(32803369), var12.method7478(-130376478), -481547442);
            field323[(DynamicObject.field1679 += 1670949746) * 1322464294 - 1] = var5 ? 1 : 0;
            return 1;
         }
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("dl")
   static int method808(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= -1724852635) {
         var0 -= 1000;
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var3 = classLY.method7375(classWK.field6691, var4, (byte)102);
      } else {
         var3 = var2 ? classSZ.field6110 : TileItem.field1558;
      }

      if (var0 == 1100) {
         DynamicObject.field1679 -= 240082458;
         int var40 = field323[DynamicObject.field1679 * 900175099];
         int var48 = field323[1 + -994173618 * DynamicObject.field1679];
         if (12 == 1019489736 * var3.field4375) {
            classLH var49 = var3.method7283(-206112155);
            if (null != var49 && var49.method6834(var40, var48, -1597330312)) {
            }
         } else {
            var3.field4341 = var40 * -1863399842;
            if (-1422490976 * var3.field4341 > var3.field4258 * 1556641368 - var3.field4249 * 1115597881) {
               var3.field4341 = var3.field4258 * -39215665 - -195016671 * var3.field4249;
            }

            if (var3.field4341 * 1178143889 < 0) {
               var3.field4341 = 0;
            }

            var3.field4331 = -1148676629 * var48;
            if (var3.field4331 * -41424189 > -2004210539 * var3.field4269 - var3.field4259 * 1983774353) {
               var3.field4331 = var3.field4269 * 1900311310 - var3.field4259 * 577918571;
            }

            if (-41424189 * var3.field4331 < 0) {
               var3.field4331 = 0;
            }
         }

         return 1;
      } else if (-926498148 == var0) {
         var3.field4270 = field323[(DynamicObject.field1679 -= -822129325) * -324749371] * 1405920076;
         return 1;
      } else if (var0 == 1102) {
         var3.field4271 = field323[(DynamicObject.field1679 -= 142631888) * -324749371] == 1;
         return 1;
      } else if (-31726606 == var0) {
         var3.field4347 = field323[(DynamicObject.field1679 -= 120041229) * -54338647] * -2056841747;
         return 1;
      } else if (1104 == var0) {
         var3.field4277 = field323[(DynamicObject.field1679 -= 1878373383) * -1121865458] * 1189417369;
         return 1;
      } else if (var0 == 702688513) {
         var3.field4348 = field323[(DynamicObject.field1679 -= 120041229) * 263311023] * 857041169;
         return 1;
      } else if (var0 == -1937027245) {
         var3.field4351 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] * -727683123;
         return 1;
      } else if (-1537106806 == var0) {
         var3.field4282 = field323[(DynamicObject.field1679 -= 120041229) * 79704116] == 1;
         return 1;
      } else if (1108 == var0) {
         var3.field4333 = -2100205513;
         var3.field4374 = field323[(DynamicObject.field1679 -= 1444844967) * 93103703] * -330090497;
         return 1;
      } else if (1109 == var0) {
         DynamicObject.field1679 -= -974256682;
         var3.field4290 = 1981476425 * field323[-716623745 * DynamicObject.field1679];
         var3.field4291 = 823557116 * field323[1 + -324749371 * DynamicObject.field1679];
         var3.field4356 = 1703663435 * field323[2 + 1371539767 * DynamicObject.field1679];
         var3.field4292 = field323[3 + -1160802496 * DynamicObject.field1679] * 1525639549;
         var3.field4294 = field323[1363012538 * DynamicObject.field1679 + 4] * 2006225524;
         var3.field4338 = field323[DynamicObject.field1679 * -1571772454 + 5] * 1556726191;
         return 1;
      } else if (1772955730 == var0) {
         int var39 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (var3.field4288 * 2114568197 != var39) {
            var3.field4288 = 742198477 * var39;
            var3.field4321 = 0;
            var3.field4327 = 0;
         }

         return 1;
      } else if (var0 == 1111) {
         var3.field4297 = field323[(DynamicObject.field1679 -= 120041229) * 319303122] == 1;
         return 1;
      } else if (1112 == var0) {
         String var37 = (String)field328[(field338 -= 1222866659) * 1375698635];
         var37 = classUP.method11420(var37, User.method10179(-1103208544), field334, field333, (byte)0);
         if (12 == -1510882375 * var3.field4375) {
            classLH var47 = var3.method7283(-282439807);
            if (var47 != null && var47.method6998((byte)-48)) {
               classLH.method6804(var47, var37, -1833050059);
            } else {
               var3.field4301 = var37;
            }
         } else if (!var37.equals(var3.field4301)) {
            var3.field4301 = var37;
         }

         return 1;
      } else if (1113 == var0) {
         var3.field4245 = field323[(DynamicObject.field1679 -= 904698734) * -197637817] * -698474631;
         if (-1510882375 * var3.field4375 == 12) {
            classLH var36 = var3.method7283(-42579492);
            if (null != var36) {
               var36.method6849(672061473);
            }
         }

         return 1;
      } else if (var0 == 1114) {
         DynamicObject.field1679 -= -173133717;
         if (12 == var3.field4375 * -1510882375) {
            classLH var35 = var3.method7283(-1779395488);
            if (null != var35) {
               classLH.method6840(var35, field323[DynamicObject.field1679 * -324749371], field323[1 + -324749371 * DynamicObject.field1679], -775590308);
               var35.method6841(field323[DynamicObject.field1679 * -324749371 + 2], 879336967);
            }
         } else {
            var3.field4304 = -1459913953 * field323[DynamicObject.field1679 * -1563711614];
            var3.field4305 = -2106140265 * field323[-1111060407 * DynamicObject.field1679 + 1];
            var3.field4303 = field323[2 + DynamicObject.field1679 * -563808097] * -1109480713;
         }

         return 1;
      } else if (1115 == var0) {
         var3.field4306 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else if (var0 == 1116) {
         var3.field4283 = field323[(DynamicObject.field1679 -= 2085020717) * -610077911] * -1993421947;
         return 1;
      } else if (var0 == -1976499693) {
         var3.field4284 = field323[(DynamicObject.field1679 -= 120041229) * 1191211238] * -11917394;
         return 1;
      } else if (1118 == var0) {
         var3.field4352 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else if (var0 == 1119) {
         var3.field4256 = field323[(DynamicObject.field1679 -= 120041229) * 1755028950] == 1;
         return 1;
      } else if (1120 == var0) {
         DynamicObject.field1679 -= 589670577;
         var3.field4258 = 337822265 * field323[DynamicObject.field1679 * -1179016450];
         var3.field4269 = -251301447 * field323[639786524 * DynamicObject.field1679 + 1];
         if (0 == var3.field4375 * -1510882375) {
            Widget[] var34 = -1 == var3.field4260 * -636455016
               ? classWK.field6691.field4440[-1539265071 * var3.field4329 >> 16]
               : classLY.method7375(classWK.field6691, var3.field4342 * -1502647899, (byte)86).field4340;
            classFC.method4586(var34, var3, false, classWK.field6691, client.field823, 1721148269);
         }

         return 1;
      } else if (var0 == 319940878) {
         classUL.method11401(1605380890 * var3.field4329, var3.field4260 * 63131743, 1283248075);
         classVV.method12163(classWK.field6691, var3, -45239676);
         return 1;
      } else if (var0 == -509386478) {
         var3.field4349 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] * -924664669;
         return 1;
      } else if (var0 == 1005212412) {
         var3.field4295 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] * -1286284179;
         return 1;
      } else if (var0 == 1634713565) {
         var3.field4276 = field323[(DynamicObject.field1679 -= 636379083) * 1202737614] * -2001035771;
         return 1;
      } else if (var0 == 1125) {
         int var33 = field323[(DynamicObject.field1679 -= 120041229) * -96374198];
         classYE var46 = (classYE)classOF.method8404(classCX.method2696(1705415087), var33, 1760457974);
         if (var46 != null) {
            var3.field4307 = var46;
         }

         return 1;
      } else if (var0 == 1126) {
         boolean var32 = field323[(DynamicObject.field1679 -= 180592651) * -324749371] == 1;
         var3.field4278 = var32;
         return 1;
      } else if (1844727484 == var0) {
         boolean var31 = field323[(DynamicObject.field1679 -= 120041229) * 1368672641] == 1;
         var3.field4298 = var31;
         return 1;
      } else if (var0 == -1466766296) {
         var3.field4339 = (String)field328[(field338 -= 1590196115) * 1375698635];
         return 1;
      } else if (var0 == 2006702639) {
         var3.method7232((String)field328[(field338 -= 1222866659) * 1061593691], "", classAV.field294, classBF.method1041(-156129989));
         return 1;
      } else if (1131 == var0) {
         DynamicObject.field1679 -= 1393251948;
         var3.method7241(field323[DynamicObject.field1679 * -324749371], field323[DynamicObject.field1679 * 882964031 + 1], -1844055709);
         return 1;
      } else if (1132 == var0) {
         Widget.method7243(
            var3, (String)field328[(field338 -= 1173108838) * 793412450], field323[(DynamicObject.field1679 -= -1494628064) * -1070768007], (byte)49
         );
         return 1;
      } else if (1133 == var0) {
         DynamicObject.field1679 -= 120041229;
         classLI var30 = Widget.method7285(var3, 1337927743);
         if (var30 != null) {
            var30.field4172 = 1594234983 * field323[DynamicObject.field1679 * 65261908];
         }

         return 1;
      } else if (1134 == var0) {
         DynamicObject.field1679 -= 1801202717;
         classLI var29 = Widget.method7285(var3, 472664962);
         if (null != var29) {
            var29.field4170 = field323[DynamicObject.field1679 * 504725617] * 27298427;
         }

         return 1;
      } else if (var0 == 1135) {
         field338 -= 1693480834;
         classLH var28 = var3.method7283(-358332839);
         if (var28 != null) {
            String var44 = (String)field328[field338 * 923780949];
            var44 = classUP.method11420(var44, User.method10179(-847497295), field334, field333, (byte)0);
            var3.field4302 = var44;
         }

         return 1;
      } else if (var0 == 227277949) {
         DynamicObject.field1679 -= 120041229;
         classLI var27 = Widget.method7285(var3, 1441484886);
         if (null != var27) {
            var27.field4169 = field323[DynamicObject.field1679 * -1817554726] * 798448585;
         }

         return 1;
      } else if (-931585680 == var0) {
         DynamicObject.field1679 -= 317539749;
         classLH var26 = var3.method7283(-1303330922);
         if (var26 != null && var26.method6820(field323[DynamicObject.field1679 * -2017591007], -1327792330)) {
         }

         return 1;
      } else if (1706697132 == var0) {
         DynamicObject.field1679 -= 120041229;
         classLH var25 = var3.method7283(-1854716360);
         if (var25 != null && var25.method6827(field323[-324749371 * DynamicObject.field1679], (byte)1)) {
         }

         return 1;
      } else if (304271996 == var0) {
         DynamicObject.field1679 -= -640158438;
         classLH var24 = var3.method7283(-847108426);
         if (null != var24 && classLH.method6832(var24, field323[DynamicObject.field1679 * -324749371], (byte)9)) {
         }

         return 1;
      } else if (1937435740 == var0) {
         boolean var23 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         client.field908.method4582((byte)101);
         classLH var43 = var3.method7283(-1043139055);
         if (var43 != null && var43.method6798(var23, 2140822014) && var23) {
            client.field908.method4576(var3, (byte)-58);
         }

         return 1;
      } else if (-2037438733 == var0) {
         boolean var22 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         if (!var22 && client.field908.method4571(2118376135) == var3) {
            client.field908.method4582((byte)28);
         }

         classLH var42 = var3.method7283(-1129192361);
         if (null != var42) {
            classLH.method6800(var42, var22, -526523135);
         }

         return 1;
      } else if (1142 == var0) {
         DynamicObject.field1679 -= 1069791377;
         classLH var21 = var3.method7283(-6491263);
         if (null != var21
            && classLH.method6882(var21, field323[DynamicObject.field1679 * -324749371], field323[DynamicObject.field1679 * -324749371 + 1], 1122842785)) {
         }

         return 1;
      } else if (1143 == var0) {
         DynamicObject.field1679 -= 120041229;
         classLH var20 = var3.method7283(-657357703);
         if (var20 != null
            && classLH.method6882(var20, field323[DynamicObject.field1679 * -324749371], field323[DynamicObject.field1679 * -324749371], 1122842785)) {
         }

         return 1;
      } else if (1144 == var0) {
         DynamicObject.field1679 -= -1865050400;
         classLH var19 = var3.method7283(-762911109);
         if (null != var19) {
            classLH.method7031(var19, field323[-2144091405 * DynamicObject.field1679], (short)248);
         }

         return 1;
      } else if (1145 == var0) {
         DynamicObject.field1679 -= 1961521255;
         classLH var18 = var3.method7283(-773605078);
         if (var18 != null) {
            var18.method7020(field323[-324749371 * DynamicObject.field1679], (byte)0);
         }

         return 1;
      } else if (var0 == 1250931028) {
         DynamicObject.field1679 -= 120041229;
         classLH var17 = var3.method7283(-743771003);
         if (var17 != null) {
            var17.method6845(field323[DynamicObject.field1679 * -324749371], 1950695493);
         }

         return 1;
      } else if (1147 == var0) {
         DynamicObject.field1679 -= 1018963924;
         classLH var16 = var3.method7283(-2091988417);
         if (null != var16) {
            classLH.method7043(var16, field323[-324749371 * DynamicObject.field1679], 2117141590);
         }

         return 1;
      } else if (1148 == var0) {
         DynamicObject.field1679 -= 240082458;
         classTT var15 = Widget.method7287(var3, 1289741507);
         if (var15 != null) {
            var15.method11132(field323[DynamicObject.field1679 * -1538534481], field323[-1138042664 * DynamicObject.field1679 + 1], 2039547634);
         }

         return 1;
      } else if (var0 == -869085300) {
         DynamicObject.field1679 -= 240082458;
         classTT var14 = Widget.method7287(var3, 1289741507);
         if (null != var14) {
            var14.method11136((char)field323[DynamicObject.field1679 * -1168783202], field323[1 + -324749371 * DynamicObject.field1679], (byte)70);
         }

         return 1;
      } else if (-41339029 == var0) {
         var3.method7236((String)field328[(field338 -= -436154643) * 658350234], classAV.field294, 2131788487);
         return 1;
      } else if (1151 == var0) {
         field338 -= -626367319;
         String var13 = (String)field328[1375698635 * field338];
         String var41 = (String)field328[1 + field338 * 1375698635];
         String var6 = (String)field328[-409027274 * field338 + 2];
         long var7 = classBF.method1041(-1180607338);
         long var9 = classKN.method6498(1718057991);
         String var11 = classAW.method723(classEA.method3798(-1501805147), classEA.method3798(-1855160948).field6573 * 857134555, 167476201);
         if (var7 != -1L) {
            var13 = var13.replaceAll("%userid%", Long.toString(var7));
         }

         if (var9 != -1L) {
            var13 = var13.replaceAll("%userhash%", Long.toString(var9));
         }

         if (!var11.isEmpty()) {
            var13 = var13.replaceAll("%deviceid%", var11);
         }

         Widget.method7233(var3, var13, var41, var6, var11, Long.toString(var9), classAV.field294, -2142549346);
         return 1;
      } else if (1152 == var0) {
         if (185896316 * var3.field4375 != 11) {
            throw new RuntimeException();
         } else {
            classMA var12 = var3.method7270(-1626603432);
            boolean var5 = var12 != null
               && classMA.method7444(var12, (byte)0)
               && classMU.method7722(classHS.method6101(-2057858876), var12.method7478(1147190847), 2029450817);
            field323[(DynamicObject.field1679 += 120041229) * -666831728 - 1] = var5 ? 1 : 0;
            return 1;
         }
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/String;)Lte;")
   @ObfuscatedName("jn")
   static classTE method949(Object var0, String var1) {
      if (var0 == null) {
         throw new RuntimeException();
      } else {
         return (classTE)var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("df")
   static int method809(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)94);
      } else {
         var3 = var2 ? classSZ.field6110 : TileItem.field1558;
      }

      if (1200 == var0 || var0 == -1136387143 || var0 == 1212) {
         DynamicObject.field1679 -= 240082458;
         int var11 = field323[DynamicObject.field1679 * -324749371];
         int var14 = field323[DynamicObject.field1679 * -324749371 + 1];
         var3.field4319 = 1321867761 * var11;
         var3.field4344 = 1743329227 * var14;
         ItemComposition var16 = classOB.method8299(var11, (byte)-12);
         var3.field4356 = 366752800 * var16.field5035;
         var3.field4292 = var16.field5036 * -944220485;
         var3.field4294 = var16.field5054 * -2019216183;
         var3.field4290 = 141623689 * var16.field5038;
         var3.field4291 = 238742844 * var16.field5039;
         var3.field4338 = var16.field5034 * -379927707;
         if (var0 == 1888042324) {
            var3.field4299 = 0;
         } else if (var0 == 1212 | 1 == 764553431 * var16.field5055) {
            var3.field4299 = 1562954556;
         } else {
            var3.field4299 = -753644342;
         }

         if (var3.field4296 * -1210298363 > 0) {
            var3.field4338 = var3.field4338 * 410967300 / (613100595 * var3.field4296) * 1556726191;
         } else if (var3.field4255 * 1523460725 > 0) {
            var3.field4338 = var3.field4338 * -1634796223 / (var3.field4255 * -1304807414) * 159059608;
         }

         return 1;
      } else if (1201 == var0) {
         var3.field4333 = 1312656782;
         var3.field4374 = field323[(DynamicObject.field1679 -= 120041229) * -1946393383] * -774437403;
         return 1;
      } else if (var0 == -2107894319) {
         var3.field4333 = 1968985173;
         Player var10 = classMB.method7521(-491975127);
         var3.field4374 = (var10 != null ? var10.field1285.method6707(170077571) : -1) * 434741949;
         return 1;
      } else if (var0 == 1207) {
         boolean var9 = field323[(DynamicObject.field1679 -= 120041229) * 572374235] == 1;
         Player var13 = classMB.method7521(1083651178);
         PlayerComposition var15 = null != var13 ? var13.field1285 : null;
         Widget.method7306(var3, var15, var9, (byte)122);
         return 1;
      } else if (1863453644 == var0) {
         int var8 = field323[(DynamicObject.field1679 -= -1796818220) * -1282006335];
         if (var3.field4358 == null) {
            throw new RuntimeException("");
         } else {
            PlayerComposition.method6726(var3.field4358, var8, 2012739297);
            return 1;
         }
      } else if (var0 == -831915499) {
         DynamicObject.field1679 -= 240082458;
         int var7 = field323[1678953679 * DynamicObject.field1679];
         int var12 = field323[-340609021 * DynamicObject.field1679 + 1];
         if (var3.field4358 == null) {
            throw new RuntimeException("");
         } else {
            var3.field4358.method6723(var7, var12, -1337101188);
            return 1;
         }
      } else if (var0 == 1373455775) {
         int var4 = field323[(DynamicObject.field1679 -= 457648117) * -651727403];
         if (var3.field4358 == null) {
            throw new RuntimeException("");
         } else {
            Player var5 = classMB.method7521(815880942);
            int var6 = null != var5 ? var5.field1285.field4094 * -1045445800 : 0;
            var3.field4358.method6716(var6, var4, 974118299);
            return 1;
         }
      } else if (var0 == 1227837151) {
         var3.field4333 = -2084510439;
         var3.field4374 = field323[(DynamicObject.field1679 -= 1358181487) * -324749371] * 1835099915;
         return 1;
      } else if (229299252 == var0) {
         var3.field4333 = 1611988223;
         var3.field4374 = field323[(DynamicObject.field1679 -= -1036166555) * -1610979072] * 434741949;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ds")
   static int method811(int var0, Script var1, boolean var2) {
      boolean var3 = true;
      Widget var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= -1377711045) * 302121039], (byte)99);
         var3 = false;
      } else {
         var4 = var2 ? classSZ.field6110 : TileItem.field1558;
      }

      if (var0 == 1300) {
         int var21 = field323[(DynamicObject.field1679 -= 120041229) * 860415679] - 1;
         if (var21 >= 0 && var21 < -1365289305) {
            String var27 = (String)field328[(field338 -= -305696522) * 1375698635];
            var27 = classUP.method11420(var27, User.method10179(-1212887545), field334, field333, (byte)0);
            var4.method7207(var21, var27, (byte)-47);
            return 1;
         } else {
            field338 -= -1523306921;
            return 1;
         }
      } else if (1301 == var0) {
         DynamicObject.field1679 -= 2040663187;
         int var20 = field323[DynamicObject.field1679 * -2047235106];
         int var26 = field323[1 + 553623951 * DynamicObject.field1679];
         var4.field4311 = classLY.method7378(classWK.field6691, var20, var26, (byte)8);
         return 1;
      } else if (var0 == -1291515483) {
         var4.field4314 = field323[(DynamicObject.field1679 -= 120041229) * -761200604] == 1;
         return 1;
      } else if (var0 == 1722545522) {
         var4.field4368 = field323[(DynamicObject.field1679 -= 120041229) * -486905186] * 230129403;
         return 1;
      } else if (var0 == 1304) {
         var4.field4313 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] * -646772889;
         return 1;
      } else if (var0 == 1305) {
         String var18 = (String)field328[(field338 -= 1848285390) * 1375698635];
         var18 = classUP.method11420(var18, User.method10179(268143776), field334, field333, (byte)0);
         var4.field4309 = var18;
         return 1;
      } else if (var0 == 1306) {
         String var16 = (String)field328[(field338 -= -913184903) * 1375698635];
         var16 = classUP.method11420(var16, User.method10179(-152598642), field334, field333, (byte)0);
         var4.field4345 = var16;
         return 1;
      } else if (-1811654097 == var0) {
         var4.actions = null;
         var4.field4353 = (String[][])null;
         return 1;
      } else if (1308 == var0) {
         var4.field4373 = field323[(DynamicObject.field1679 -= 637226791) * -324749371] == 1;
         return 1;
      } else if (2103165163 == var0) {
         DynamicObject.field1679 -= 692031163;
         return 1;
      } else if (var0 == -699334482) {
         int var15 = field323[(DynamicObject.field1679 -= 1736981723) * -324749371] - 1;
         if (var15 >= 0 && var15 <= 9 && var4.field4353 != null) {
            var4.field4353[var15] = null;
            return 1;
         } else {
            return 1;
         }
      } else if (var0 == 1311) {
         int var14 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] - 1;
         int var25 = field323[(DynamicObject.field1679 -= -1155217960) * -2090861796] - 1;
         if (var25 >= 0 && var25 <= 9 && var14 >= 0) {
            String var34 = (String)field328[(field338 -= 1222866659) * -1507259450];
            var34 = classUP.method11420(var34, User.method10179(55040700), field334, field333, (byte)0);
            var4.method7210(var25, var14, var34, -512976453);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 1119558218) {
         int var13 = field323[(DynamicObject.field1679 -= 1124888668) * -324749371];
         if (var13 == -1) {
            var4.field4310 = -743679519;
         } else if (var13 >= 1 && var13 <= 774523045) {
            var4.field4310 = 173826253 * (var13 - 1);
         }

         return 1;
      } else if (-1509921042 != var0) {
         if (var0 == 1351) {
            DynamicObject.field1679 -= 240082458;
            byte var12 = 10;
            byte[] var24 = new byte[]{(byte)field323[-324749371 * DynamicObject.field1679]};
            byte[] var33 = new byte[]{(byte)field323[DynamicObject.field1679 * 1863052862 + 1]};
            classMK.method7595(var4, var12, var24, var33, (byte)-112);
            return 1;
         } else if (1352 == var0) {
            DynamicObject.field1679 -= 1663852647;
            int var11 = field323[DynamicObject.field1679 * -324749371] - 1;
            int var23 = field323[1 + DynamicObject.field1679 * 19347357];
            int var32 = field323[775414633 * DynamicObject.field1679 + 2];
            if (var11 >= 0 && var11 <= 9) {
               CollisionMap.method5382(var4, var11, var23, var32, 178476725);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (1353 == var0) {
            byte var10 = 10;
            int var22 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            int var31 = field323[(DynamicObject.field1679 -= -584164787) * -2082479723];
            CollisionMap.method5382(var4, var10, var22, var31, 510171963);
            return 1;
         } else if (var0 == 1354) {
            DynamicObject.field1679 -= -1070875036;
            int var9 = field323[DynamicObject.field1679 * -324749371] - 1;
            if (var9 >= 0 && var9 <= 9) {
               classMT.method7691(var4, var9, 2063916631);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == -1092315762) {
            byte var8 = 10;
            classMT.method7691(var4, var8, 2102032331);
            return 1;
         } else {
            return 2;
         }
      } else {
         byte[] var5 = null;
         byte[] var6 = null;
         if (var3) {
            DynamicObject.field1679 -= 1200412290;
            byte var7 = 0;

            while (var7 < 10 && field323[DynamicObject.field1679 * -324749371 + var7] >= 0) {
               var7 += 2;
            }

            if (var7 > 0) {
               var5 = new byte[var7 / 2];
               var6 = new byte[var7 / 2];

               for (int var29 = var7 - 2; var29 >= 0; var29 -= 2) {
                  var5[var29 / 2] = (byte)field323[DynamicObject.field1679 * -2061248564 + var29];
                  var6[var29 / 2] = (byte)field323[1 + DynamicObject.field1679 * 1799192841 + var29];
               }
            }
         } else {
            DynamicObject.field1679 -= 366642333;
            var5 = new byte[]{(byte)field323[DynamicObject.field1679 * -184139241]};
            var6 = new byte[]{(byte)field323[DynamicObject.field1679 * -324749371 + 1]};
         }

         int var30 = field323[(DynamicObject.field1679 -= 120041229) * 1485542655] - 1;
         if (var30 >= 0 && var30 <= 9) {
            classMK.method7595(var4, var30, var5, var6, (byte)2);
            return 1;
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyy;Ljava/lang/Object;)V")
   @ObfuscatedName("ju")
   static void method941(classYY var0, Object var1) {
      if (var0 == null) {
         throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
      } else {
         switch (-900901303 * var0.field7107) {
            case 2:
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (Integer)var1;
               break;
            case 3:
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = (Long)var1;
               break;
            case 4:
               field328[(field338 += 1222866659) * 1375698635 - 1] = var1;
               break;
            default:
               throw new IllegalStateException("pushValueOfType() failure - unsupported type");
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("da")
   static int method812(int var0, Script var1, boolean var2) {
      boolean var3 = true;
      Widget var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)47);
         var3 = false;
      } else {
         var4 = var2 ? classSZ.field6110 : TileItem.field1558;
      }

      if (var0 == 1300) {
         int var21 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] - 1;
         if (var21 >= 0 && var21 < 32) {
            String var27 = (String)field328[(field338 -= 1222866659) * 1375698635];
            var27 = classUP.method11420(var27, User.method10179(84869236), field334, field333, (byte)0);
            var4.method7207(var21, var27, (byte)-14);
            return 1;
         } else {
            field338 -= 1222866659;
            return 1;
         }
      } else if (1301 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var20 = field323[DynamicObject.field1679 * -324749371];
         int var26 = field323[1 + -324749371 * DynamicObject.field1679];
         var4.field4311 = classLY.method7378(classWK.field6691, var20, var26, (byte)-70);
         return 1;
      } else if (var0 == 1302) {
         var4.field4314 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else if (var0 == 1303) {
         var4.field4368 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] * 230129403;
         return 1;
      } else if (var0 == 1304) {
         var4.field4313 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] * -2074329479;
         return 1;
      } else if (var0 == 1305) {
         String var18 = (String)field328[(field338 -= 1222866659) * 1375698635];
         var18 = classUP.method11420(var18, User.method10179(-1708474457), field334, field333, (byte)0);
         var4.field4309 = var18;
         return 1;
      } else if (var0 == 1306) {
         String var16 = (String)field328[(field338 -= 1222866659) * 1375698635];
         var16 = classUP.method11420(var16, User.method10179(-561438656), field334, field333, (byte)0);
         var4.field4345 = var16;
         return 1;
      } else if (1307 == var0) {
         var4.actions = null;
         var4.field4353 = (String[][])null;
         return 1;
      } else if (1308 == var0) {
         var4.field4373 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else if (1309 == var0) {
         DynamicObject.field1679 -= 120041229;
         return 1;
      } else if (var0 == 1310) {
         int var15 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] - 1;
         if (var15 >= 0 && var15 <= 9 && var4.field4353 != null) {
            var4.field4353[var15] = null;
            return 1;
         } else {
            return 1;
         }
      } else if (var0 == 1311) {
         int var14 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] - 1;
         int var25 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] - 1;
         if (var25 >= 0 && var25 <= 9 && var14 >= 0) {
            String var34 = (String)field328[(field338 -= 1222866659) * 1375698635];
            var34 = classUP.method11420(var34, User.method10179(-2133148222), field334, field333, (byte)0);
            var4.method7210(var25, var14, var34, -512976453);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 1312) {
         int var13 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (var13 == -1) {
            var4.field4310 = 695305012;
         } else if (var13 >= 1 && var13 <= 32) {
            var4.field4310 = 173826253 * (var13 - 1);
         }

         return 1;
      } else if (1350 != var0) {
         if (var0 == 1351) {
            DynamicObject.field1679 -= 240082458;
            byte var12 = 10;
            byte[] var24 = new byte[]{(byte)field323[-324749371 * DynamicObject.field1679]};
            byte[] var33 = new byte[]{(byte)field323[DynamicObject.field1679 * -324749371 + 1]};
            classMK.method7595(var4, var12, var24, var33, (byte)-19);
            return 1;
         } else if (1352 == var0) {
            DynamicObject.field1679 -= 360123687;
            int var11 = field323[DynamicObject.field1679 * -324749371] - 1;
            int var23 = field323[1 + DynamicObject.field1679 * -324749371];
            int var32 = field323[-324749371 * DynamicObject.field1679 + 2];
            if (var11 >= 0 && var11 <= 9) {
               CollisionMap.method5382(var4, var11, var23, var32, 398566623);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (1353 == var0) {
            byte var10 = 10;
            int var22 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            int var31 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            CollisionMap.method5382(var4, var10, var22, var31, 54978048);
            return 1;
         } else if (var0 == 1354) {
            DynamicObject.field1679 -= 120041229;
            int var9 = field323[DynamicObject.field1679 * -324749371] - 1;
            if (var9 >= 0 && var9 <= 9) {
               classMT.method7691(var4, var9, 2131395201);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 1355) {
            byte var8 = 10;
            classMT.method7691(var4, var8, 2137681112);
            return 1;
         } else {
            return 2;
         }
      } else {
         byte[] var5 = null;
         byte[] var6 = null;
         if (var3) {
            DynamicObject.field1679 -= 1200412290;
            byte var7 = 0;

            while (var7 < 10 && field323[DynamicObject.field1679 * -324749371 + var7] >= 0) {
               var7 += 2;
            }

            if (var7 > 0) {
               var5 = new byte[var7 / 2];
               var6 = new byte[var7 / 2];

               for (int var29 = var7 - 2; var29 >= 0; var29 -= 2) {
                  var5[var29 / 2] = (byte)field323[DynamicObject.field1679 * -324749371 + var29];
                  var6[var29 / 2] = (byte)field323[1 + DynamicObject.field1679 * -324749371 + var29];
               }
            }
         } else {
            DynamicObject.field1679 -= 240082458;
            var5 = new byte[]{(byte)field323[DynamicObject.field1679 * -324749371]};
            var6 = new byte[]{(byte)field323[DynamicObject.field1679 * -324749371 + 1]};
         }

         int var30 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] - 1;
         if (var30 >= 0 && var30 <= 9) {
            classMK.method7595(var4, var30, var5, var6, (byte)15);
            return 1;
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;I[B[B)V")
   @ObfuscatedName("dp")
   static final void method814(Widget var0, int var1, byte[] var2, byte[] var3) {
      if (null == var0.field4312) {
         if (var2 == null) {
            return;
         }

         var0.field4312 = new byte[11][];
         var0.field4346 = new byte[11][];
         var0.field4370 = new int[11];
         var0.field4371 = new int[11];
      }

      var0.field4312[var1] = var2;
      if (null != var2) {
         var0.field4360 = true;
      } else {
         var0.field4360 = false;

         for (int var4 = 0; var4 < var0.field4312.length; var4++) {
            if (var0.field4312[var4] != null) {
               var0.field4360 = true;
               break;
            }
         }
      }

      var0.field4346[var1] = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;I[B[B)V")
   @ObfuscatedName("ey")
   static final void method815(Widget var0, int var1, byte[] var2, byte[] var3) {
      if (null == var0.field4312) {
         if (var2 == null) {
            return;
         }

         var0.field4312 = new byte[11][];
         var0.field4346 = new byte[11][];
         var0.field4370 = new int[11];
         var0.field4371 = new int[11];
      }

      var0.field4312[var1] = var2;
      if (null != var2) {
         var0.field4360 = true;
      } else {
         var0.field4360 = false;

         for (int var4 = 0; var4 < var0.field4312.length; var4++) {
            if (var0.field4312[var4] != null) {
               var0.field4360 = true;
               break;
            }
         }
      }

      var0.field4346[var1] = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;I[B[B)V")
   @ObfuscatedName("ea")
   static final void method816(Widget var0, int var1, byte[] var2, byte[] var3) {
      if (null == var0.field4312) {
         if (var2 == null) {
            return;
         }

         var0.field4312 = new byte[11][];
         var0.field4346 = new byte[11][];
         var0.field4370 = new int[11];
         var0.field4371 = new int[11];
      }

      var0.field4312[var1] = var2;
      if (null != var2) {
         var0.field4360 = true;
      } else {
         var0.field4360 = false;

         for (int var4 = 0; var4 < var0.field4312.length; var4++) {
            if (var0.field4312[var4] != null) {
               var0.field4360 = true;
               break;
            }
         }
      }

      var0.field4346[var1] = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;III)V")
   @ObfuscatedName("ek")
   static final void method817(Widget var0, int var1, int var2, int var3) {
      if (null == var0.field4370) {
         throw new RuntimeException();
      } else {
         var0.field4370[var1] = var2;
         var0.field4371[var1] = var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Z)V")
   @ObfuscatedName("dn")
   static void method804(Widget var0, boolean var1) {
      if (var0 != null) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
         if (var1) {
            classSZ.field6110 = var0;
         } else {
            TileItem.field1558 = var0;
         }
      } else {
         field323[(DynamicObject.field1679 += 938515731) * 575177714 - 1] = 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;III)V")
   @ObfuscatedName("ej")
   static final void method818(Widget var0, int var1, int var2, int var3) {
      if (null == var0.field4370) {
         throw new RuntimeException();
      } else {
         var0.field4370[var1] = var2;
         var0.field4371[var1] = var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;I)V")
   @ObfuscatedName("ed")
   static final void method820(Widget var0, int var1) {
      if (null == var0.field4312) {
         throw new RuntimeException();
      } else {
         if (var0.field4404 == null) {
            var0.field4404 = new int[var0.field4312.length];
         }

         var0.field4404[var1] = Integer.MAX_VALUE;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;I)V")
   @ObfuscatedName("ev")
   static final void method821(Widget var0, int var1) {
      if (null == var0.field4312) {
         throw new RuntimeException();
      } else {
         if (var0.field4404 == null) {
            var0.field4404 = new int[var0.field4312.length];
         }

         var0.field4404[var1] = Integer.MAX_VALUE;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fh")
   static int method849(int var0, Script var1, boolean var2) {
      Widget var3 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)88);
      if (var0 == 2800) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classCK.method1575(classWK.field6691.method12173(var3, (byte)0), -2126473502);
         return 1;
      } else if (var0 != 2801) {
         if (var0 == 2802) {
            if (var3.field4309 == null) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            } else {
               field328[(field338 += 1222866659) * 1375698635 - 1] = var3.field4309;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var4--;
         if (null != var3.actions && var4 < var3.actions.length && null != var3.actions[var4]) {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var3.actions[var4];
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ha")
   static int method901(int var0, Script var1, boolean var2) {
      if (var0 == 6754) {
         int var6 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classPL var7 = classOH.method8448(var6, -610814703);
         field328[(field338 += 1222866659) * 1375698635 - 1] = null != var7 ? var7.method8994((byte)30) : "";
         return 1;
      } else if (6764 == var0) {
         DynamicObject.field1679 -= 240082458;
         classPL var5 = classOH.method8448(field323[-324749371 * DynamicObject.field1679], 1716800168);
         int var4 = field323[1 + DynamicObject.field1679 * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var5.method8977(var4, (byte)-64);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var5.method8984(var4, (byte)-98);
         return 1;
      } else if (var0 == 6765) {
         classPL var3 = classOH.method8448(field323[(DynamicObject.field1679 -= 120041229) * -324749371], -163368655);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3 != null ? 1781570005 * var3.field5320 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("eg")
   static int method823(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? classSZ.field6110 : TileItem.field1558;
      if (-1980052475 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4281 * 744286069;
         return 1;
      } else if (-1660988438 == var0) {
         field323[(DynamicObject.field1679 += -467798991) * -324749371 - 1] = 187764100 * var3.field4257;
         return 1;
      } else if (1502 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -2072829414 - 1] = 1115597881 * var3.field4249;
         return 1;
      } else if (1503 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 293773697 * var3.field4259;
         return 1;
      } else if (-894682419 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4289 ? 1 : 0;
         return 1;
      } else if (var0 == 1505) {
         field323[(DynamicObject.field1679 += 120041229) * 112604841 - 1] = -1502647899 * var3.field4342;
         return 1;
      } else if (var0 != 1506) {
         return 2;
      } else {
         int var4 = var3.field4342 * 1793376837;
         if (var4 == -1) {
            classVV var5 = classWK.field6691;

            for (InterfaceParent var6 = (InterfaceParent)var5.field6613.method13375();
               null != var6;
               var6 = (InterfaceParent)IndexedObjectSet.method13401(var5.field6613)
            ) {
               if (var3.field4329 * -1163656551 >> 16 == var6.field5276 * 2023647411) {
                  var4 = (int)var6.field6552;
                  break;
               }
            }
         }

         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("en")
   static int method825(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? classSZ.field6110 : TileItem.field1558;
      if (1600 == var0) {
         field323[(DynamicObject.field1679 += 1481637359) * -522448017 - 1] = -106017492 * var3.field4341;
         return 1;
      } else if (871742764 == var0) {
         field323[(DynamicObject.field1679 += 784380738) * -410029524 - 1] = var3.field4331 * -41424189;
         return 1;
      } else if (1602 == var0) {
         if (-1510882375 * var3.field4375 == 12) {
            classLH var24 = var3.method7283(-2033583248);
            if (null != var24) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = var24.method6970(-1775158343).method13854((byte)-105);
               return 1;
            }
         }

         field328[(field338 += 1222866659) * 1375698635 - 1] = var3.field4301;
         return 1;
      } else if (-310662904 == var0) {
         field323[(DynamicObject.field1679 += 1128304709) * -1048085608 - 1] = var3.field4258 * -1916537754;
         return 1;
      } else if (var0 == -1871667858) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -714521463 * var3.field4269;
         return 1;
      } else if (var0 == 1673462083) {
         field323[(DynamicObject.field1679 += 234056155) * -324749371 - 1] = var3.field4338 * 245118287;
         return 1;
      } else if (var0 == 740558734) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4356 * -1246332317;
         return 1;
      } else if (var0 == 1607) {
         field323[(DynamicObject.field1679 += -1430968177) * 616326817 - 1] = var3.field4294 * -784528422;
         return 1;
      } else if (var0 == 1608) {
         field323[(DynamicObject.field1679 += 1184345651) * -324749371 - 1] = -1008620329 * var3.field4292;
         return 1;
      } else if (var0 == 511076977) {
         field323[(DynamicObject.field1679 += 1151728804) * -324749371 - 1] = 1517457381 * var3.field4347;
         return 1;
      } else if (var0 == 1610) {
         field323[(DynamicObject.field1679 += 120041229) * 1388200046 - 1] = var3.field4276 * 1991172799;
         return 1;
      } else if (var0 == 2122799837) {
         field323[(DynamicObject.field1679 += -1751258666) * 2038611753 - 1] = var3.field4270 * 1740831551;
         return 1;
      } else if (var0 == 1612) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 948260113 * var3.field4295;
         return 1;
      } else if (1937503227 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4307.vmethod8((byte)1);
         return 1;
      } else if (var0 == -2063486492) {
         field323[(DynamicObject.field1679 += 536310156) * 595185329 - 1] = var3.field4298 ? 1 : 0;
         return 1;
      } else {
         if (1617 == var0) {
            classLI var4 = Widget.method7285(var3, 219661796);
            field323[(DynamicObject.field1679 += -1371598865) * 520061892 - 1] = null != var4 ? var4.field4172 * -211319977 : 0;
         }

         if (1618 == var0) {
            classLI var23 = Widget.method7285(var3, 1990073612);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var23 != null ? -1133757615 * var23.field4170 : 0;
            return 1;
         } else if (1619 == var0) {
            classLH var22 = var3.method7283(-697191212);
            field328[(field338 += 912909895) * 963693994 - 1] = null != var22 ? classLH.method6973(var22, 2035288278).method13854((byte)-87) : "";
            return 1;
         } else if (1620 == var0) {
            classLI var21 = Widget.method7285(var3, 1707728843);
            field323[(DynamicObject.field1679 += 1850583272) * 1850293094 - 1] = null != var21 ? 1159892013 * var21.field4169 : 0;
            return 1;
         } else if (var0 == 1621) {
            classLH var20 = var3.method7283(-1556009089);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var20 != null ? var20.method7011((byte)-103) : 0;
            return 1;
         } else if (1229154824 == var0) {
            classLH var19 = var3.method7283(-1518634824);
            field323[(DynamicObject.field1679 += 120041229) * 1068192303 - 1] = var19 != null ? classLH.method7014(var19, -2118783281) : 0;
            return 1;
         } else if (-576768463 == var0) {
            classLH var18 = var3.method7283(-209593591);
            field323[(DynamicObject.field1679 += 120041229) * 1589248801 - 1] = null != var18 ? var18.method7017(-482758556) : 0;
            return 1;
         } else if (1624 == var0) {
            classLH var17 = var3.method7283(-1191062063);
            field323[(DynamicObject.field1679 += -1956550858) * -324749371 - 1] = var17 != null && var17.method6982(1223971190) ? 1 : 0;
            return 1;
         } else if (1625 != var0) {
            if (389228901 == var0) {
               classLH var16 = var3.method7283(-1217126872);
               field328[(field338 += 1222866659) * -1874748422 - 1] = var16 != null ? classLH.method6977(var16, 1447661178).method195(1877680173) : "";
               return 1;
            } else if (-1720135889 == var0) {
               classLH var15 = var3.method7283(-1530281419);
               int var5 = null != var15 ? var15.method6995(1845672421) : 0;
               int var6 = var15 != null ? var15.method6994((byte)-123) : 0;
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = Math.min(var5, var6);
               field323[(DynamicObject.field1679 += -2024488414) * -1065019371 - 1] = Math.max(var5, var6);
               return 1;
            } else if (var0 == 1628) {
               classLH var14 = var3.method7283(-381459293);
               field323[(DynamicObject.field1679 += 120041229) * 1763329208 - 1] = null != var14 ? var14.method6994((byte)-11) : 0;
               return 1;
            } else if (var0 == 1629) {
               classLH var13 = var3.method7283(-2048905803);
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != var13 ? var13.method7025(386128139) : 0;
               return 1;
            } else if (var0 == 35653452) {
               classLH var12 = var3.method7283(-743302827);
               field323[(DynamicObject.field1679 += 120041229) * 99192682 - 1] = null != var12 ? var12.method7018(279294364) : 0;
               return 1;
            } else if (var0 == -1770056526) {
               classLH var11 = var3.method7283(-199897727);
               field323[(DynamicObject.field1679 += 2088879526) * -324749371 - 1] = null != var11 ? var11.method7034((byte)3) : 0;
               return 1;
            } else if (347205737 == var0) {
               classLH var10 = var3.method7283(-845030203);
               field323[(DynamicObject.field1679 += 120041229) * 1746562390 - 1] = var10 != null ? var10.method7039((byte)-109) : 0;
               return 1;
            } else if (var0 == 1633) {
               classTT var9 = Widget.method7287(var3, 1289741507);
               field323[-324749371 * DynamicObject.field1679 - 1] = null != var9
                  ? var9.method11138(field323[DynamicObject.field1679 * -324749371 - 1], 1535437531)
                  : 0;
               return 1;
            } else if (var0 == -512461321) {
               classTT var8 = Widget.method7287(var3, 1289741507);
               field323[DynamicObject.field1679 * -324749371 - 1] = null != var8
                  ? var8.method11143((char)field323[1147029164 * DynamicObject.field1679 - 1], 1461979331)
                  : 0;
               return 1;
            } else {
               return 2;
            }
         } else {
            classLH var7 = var3.method7283(-645296384);
            field323[(DynamicObject.field1679 += 898599302) * 1592595994 - 1] = var7 != null && var7.method6985(-880967958) ? 1 : 0;
            return 1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ex")
   static int method826(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? classSZ.field6110 : TileItem.field1558;
      if (-1902281676 == var0) {
         field323[(DynamicObject.field1679 += -1586836482) * -1334723741 - 1] = -1110275253 * var3.field4341;
         return 1;
      } else if (1601 == var0) {
         field323[(DynamicObject.field1679 += -520267547) * -324749371 - 1] = var3.field4331 * -41424189;
         return 1;
      } else if (1602 == var0) {
         if (-1510882375 * var3.field4375 == 12) {
            classLH var24 = var3.method7283(-413489267);
            if (null != var24) {
               field328[(field338 += -881377930) * 707221609 - 1] = var24.method6970(-7322182).method13854((byte)-95);
               return 1;
            }
         }

         field328[(field338 += -315833907) * 1375698635 - 1] = var3.field4301;
         return 1;
      } else if (-1523947508 == var0) {
         field323[(DynamicObject.field1679 += -1794431680) * -324749371 - 1] = var3.field4258 * -842862191;
         return 1;
      } else if (var0 == 1486699466) {
         field323[(DynamicObject.field1679 += -1010357714) * -324749371 - 1] = -714521463 * var3.field4269;
         return 1;
      } else if (var0 == 1605) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4338 * 245118287;
         return 1;
      } else if (var0 == -2042961093) {
         field323[(DynamicObject.field1679 += -1229066318) * 435238446 - 1] = var3.field4356 * -1246332317;
         return 1;
      } else if (var0 == 1607) {
         field323[(DynamicObject.field1679 += 1574413182) * -324749371 - 1] = var3.field4294 * -700091476;
         return 1;
      } else if (var0 == 1608) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -431816727 * var3.field4292;
         return 1;
      } else if (var0 == 1609) {
         field323[(DynamicObject.field1679 += 120041229) * -1442399854 - 1] = 1517457381 * var3.field4347;
         return 1;
      } else if (var0 == -2059711910) {
         field323[(DynamicObject.field1679 += 120041229) * 497644101 - 1] = var3.field4276 * 372110893;
         return 1;
      } else if (var0 == 246702290) {
         field323[(DynamicObject.field1679 += 633360175) * -324749371 - 1] = var3.field4270 * -1029047640;
         return 1;
      } else if (var0 == 1483311886) {
         field323[(DynamicObject.field1679 += -2020256207) * 1793880434 - 1] = -1446997925 * var3.field4295;
         return 1;
      } else if (729878518 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4307.vmethod8((byte)1);
         return 1;
      } else if (var0 == -1833376129) {
         field323[(DynamicObject.field1679 += 120041229) * 1937148798 - 1] = var3.field4298 ? 1 : 0;
         return 1;
      } else {
         if (1617 == var0) {
            classLI var4 = Widget.method7285(var3, 1933155667);
            field323[(DynamicObject.field1679 += 1828943119) * 769027573 - 1] = null != var4 ? var4.field4172 * -211319977 : 0;
         }

         if (1618 == var0) {
            classLI var23 = Widget.method7285(var3, 1408893759);
            field323[(DynamicObject.field1679 += 120041229) * 1595248351 - 1] = var23 != null ? 1532740787 * var23.field4170 : 0;
            return 1;
         } else if (-333430992 == var0) {
            classLH var22 = var3.method7283(-1916086650);
            field328[(field338 += 1636948279) * 415489985 - 1] = null != var22 ? classLH.method6973(var22, -666648128).method13854((byte)-4) : "";
            return 1;
         } else if (951048649 == var0) {
            classLI var21 = Widget.method7285(var3, 765195033);
            field323[(DynamicObject.field1679 += 120041229) * 767698639 - 1] = null != var21 ? -563603521 * var21.field4169 : 0;
            return 1;
         } else if (var0 == 1090873849) {
            classLH var20 = var3.method7283(-652172741);
            field323[(DynamicObject.field1679 += 2115168542) * -324749371 - 1] = var20 != null ? var20.method7011((byte)-67) : 0;
            return 1;
         } else if (-603486780 == var0) {
            classLH var19 = var3.method7283(-346116162);
            field323[(DynamicObject.field1679 += 907285943) * -324749371 - 1] = var19 != null ? classLH.method7014(var19, -2118783281) : 0;
            return 1;
         } else if (2096875987 == var0) {
            classLH var18 = var3.method7283(-2105386040);
            field323[(DynamicObject.field1679 += 120041229) * 645237035 - 1] = null != var18 ? var18.method7017(-57768633) : 0;
            return 1;
         } else if (1624 == var0) {
            classLH var17 = var3.method7283(-845170109);
            field323[(DynamicObject.field1679 += 120041229) * 430490028 - 1] = var17 != null && var17.method6982(1931367734) ? 1 : 0;
            return 1;
         } else if (-938129087 != var0) {
            if (-2082847501 == var0) {
               classLH var16 = var3.method7283(-347664990);
               field328[(field338 += -618506078) * 2084289333 - 1] = var16 != null ? classLH.method6977(var16, 1447661178).method195(1137153684) : "";
               return 1;
            } else if (1613498001 == var0) {
               classLH var15 = var3.method7283(-161884012);
               int var5 = null != var15 ? var15.method6995(799561861) : 0;
               int var6 = var15 != null ? var15.method6994((byte)-105) : 0;
               field323[(DynamicObject.field1679 += 120041229) * 1453009726 - 1] = Math.min(var5, var6);
               field323[(DynamicObject.field1679 += -540367546) * -867462356 - 1] = Math.max(var5, var6);
               return 1;
            } else if (var0 == 1628) {
               classLH var14 = var3.method7283(-1610372649);
               field323[(DynamicObject.field1679 += -301505739) * -324749371 - 1] = null != var14 ? var14.method6994((byte)-56) : 0;
               return 1;
            } else if (var0 == 908863977) {
               classLH var13 = var3.method7283(-744828122);
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != var13 ? var13.method7025(-2121094626) : 0;
               return 1;
            } else if (var0 == 1630) {
               classLH var12 = var3.method7283(-806746720);
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != var12 ? var12.method7018(798435147) : 0;
               return 1;
            } else if (var0 == 1631) {
               classLH var11 = var3.method7283(-2126816354);
               field323[(DynamicObject.field1679 += -1568411920) * -324749371 - 1] = null != var11 ? var11.method7034((byte)3) : 0;
               return 1;
            } else if (-149535218 == var0) {
               classLH var10 = var3.method7283(-1567697612);
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var10 != null ? var10.method7039((byte)-111) : 0;
               return 1;
            } else if (var0 == 1633) {
               classTT var9 = Widget.method7287(var3, 1289741507);
               field323[-324749371 * DynamicObject.field1679 - 1] = null != var9
                  ? var9.method11138(field323[DynamicObject.field1679 * 179817647 - 1], 828226593)
                  : 0;
               return 1;
            } else if (var0 == 1634) {
               classTT var8 = Widget.method7287(var3, 1289741507);
               field323[DynamicObject.field1679 * -854216369 - 1] = null != var8
                  ? var8.method11143((char)field323[956739809 * DynamicObject.field1679 - 1], 1400929721)
                  : 0;
               return 1;
            } else {
               return 2;
            }
         } else {
            classLH var7 = var3.method7283(-731112836);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var7 != null && var7.method6985(-880967958) ? 1 : 0;
            return 1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("eq")
   static int method827(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? classSZ.field6110 : TileItem.field1558;
      if (var0 == 1700) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4319 * 2073671441;
         return 1;
      } else if (var0 == 1701) {
         if (var3.field4319 * 2073671441 != -1) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1190987649 * var3.field4344;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (var0 == 1702) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4260 * 63131743;
         return 1;
      } else if (var0 == 1703) {
         int var7 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classPN var8 = classNE.method7829(var7, (byte)47);
         if (classPN.method9026(var8, (byte)2)) {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var3.method7220(var7, var8.field5351, 752219569);
         } else if (var8.method9028((byte)40)) {
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var3.method7228(var7, 3335646069137558745L * var8.field5354);
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = Widget.method7226(var3, var7, -1601970641 * var8.field5352, (byte)-67);
         }

         return 1;
      } else if (var0 == 1704) {
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         Object var5 = classKN.method6500(var4, -1422345592);
         int var6 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var3.method7230(var6, var5, (byte)-45);
         return 1;
      } else if (1707 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.method7249(1355775728) ? 1 : 0;
         return 1;
      } else if (1708 == var0) {
         return classEG.method3883(var3, 498798805);
      } else {
         return 1709 == var0 ? classIC.method6142(var3, (byte)-6) : 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;)I")
   @ObfuscatedName("er")
   static int method828(Widget var0) {
      if (11 != var0.field4375 * -1510882375) {
         field338 -= 1222866659;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         return 1;
      } else {
         String var1 = (String)field328[(field338 -= 1222866659) * 1375698635];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var0.method7250(var1, 456902039);
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ir")
   static int method914(int var0, Script var1, boolean var2) {
      if (7463 == var0) {
         boolean var3 = field323[(DynamicObject.field1679 -= 1700860996) * 910801595] == 1;
         classON.method8615(var3, (byte)1);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;)I")
   @ObfuscatedName("et")
   static int method829(Widget var0) {
      if (11 != var0.field4375 * -1510882375) {
         field338 -= 1222866659;
         field323[(DynamicObject.field1679 += 675660069) * 815663113 - 1] = -1;
         return 1;
      } else {
         String var1 = (String)field328[(field338 -= 1451227894) * 1375698635];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var0.method7250(var1, 1294165277);
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hr")
   static int method902(int var0, Script var1, boolean var2) {
      if (var0 == 6754) {
         int var6 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classPL var7 = classOH.method8448(var6, -1377062162);
         field328[(field338 += 1222866659) * 1375698635 - 1] = null != var7 ? var7.method8994((byte)-2) : "";
         return 1;
      } else if (6764 == var0) {
         DynamicObject.field1679 -= 240082458;
         classPL var5 = classOH.method8448(field323[-324749371 * DynamicObject.field1679], 1146683299);
         int var4 = field323[1 + DynamicObject.field1679 * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var5.method8977(var4, (byte)-34);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var5.method8984(var4, (byte)-102);
         return 1;
      } else if (var0 == 6765) {
         classPL var3 = classOH.method8448(field323[(DynamicObject.field1679 -= 120041229) * -324749371], -675414422);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3 != null ? 1781570005 * var3.field5320 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hm")
   static int method894(int var0, Script var1, boolean var2) {
      if (var0 == 6200) {
         DynamicObject.field1679 -= 240082458;
         client.field867 = (short)classZL.method14064(field323[-697413855 * DynamicObject.field1679], -1839923046);
         if (client.field867 <= 0) {
            client.field867 = (short)-367203465;
         }

         client.field868 = (short)classZL.method14064(field323[1 + DynamicObject.field1679 * -324749371], -1997009724);
         if (client.field868 <= 0) {
            client.field868 = (short)1379653682;
         }

         return 1;
      } else if (6201 == var0) {
         DynamicObject.field1679 -= 1442204181;
         client.field869 = (short)field323[-324749371 * DynamicObject.field1679];
         if (client.field869 <= 0) {
            client.field869 = 256;
         }

         client.field862 = (short)field323[DynamicObject.field1679 * -210379696 + 1];
         if (client.field862 <= 0) {
            client.field862 = 320;
         }

         return 1;
      } else if (-1147539682 == var0) {
         DynamicObject.field1679 -= -1617540943;
         client.field876 = (short)field323[DynamicObject.field1679 * 791046320];
         if (client.field876 <= 0) {
            client.field876 = 1;
         }

         client.field872 = (short)field323[DynamicObject.field1679 * -324749371 + 1];
         if (client.field872 <= 0) {
            client.field872 = 32767;
         } else if (client.field872 < client.field876) {
            client.field872 = client.field876;
         }

         client.field873 = (short)field323[2 + -332107793 * DynamicObject.field1679];
         if (client.field873 <= 0) {
            client.field873 = 1;
         }

         client.field874 = (short)field323[DynamicObject.field1679 * -1826987799 + 3];
         if (client.field874 <= 0) {
            client.field874 = 32767;
         } else if (client.field874 < client.field873) {
            client.field874 = client.field873;
         }

         return 1;
      } else if (var0 == 6203) {
         if (null != classWK.field6691.field6620) {
            classRL.method10027(0, 0, 1145579715 * classWK.field6691.field6620.field4249, classWK.field6691.field6620.field4259 * 293773697, false, 317527437);
            field323[(DynamicObject.field1679 += 884134292) * -324749371 - 1] = client.field990 * 1257846319;
            field323[(DynamicObject.field1679 += 834224802) * 933164793 - 1] = 1158148203 * client.field982;
         } else {
            field323[(DynamicObject.field1679 += -1365587626) * 1437277227 - 1] = -1;
            field323[(DynamicObject.field1679 += -1437364951) * -324749371 - 1] = -1;
         }

         return 1;
      } else if (2130579952 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * 739795471 - 1] = client.field869;
         field323[(DynamicObject.field1679 += 1658943656) * -324749371 - 1] = client.field862;
         return 1;
      } else if (6205 == var0) {
         field323[(DynamicObject.field1679 += -643746981) * -324749371 - 1] = classIK.method6220(client.field867, (byte)-1);
         field323[(DynamicObject.field1679 += 120041229) * 960049290 - 1] = classIK.method6220(client.field868, (byte)-1);
         return 1;
      } else if (-977111693 == var0) {
         field323[(DynamicObject.field1679 += 911880800) * 733476239 - 1] = 0;
         return 1;
      } else if (var0 == -699129397) {
         field323[(DynamicObject.field1679 += -526735598) * -861213432 - 1] = 0;
         return 1;
      } else if (6222 == var0) {
         field323[(DynamicObject.field1679 += 765985416) * -324749371 - 1] = 773246731 * classSA.field5897;
         return 1;
      } else if (6223 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = IntProjection.field1938 * 8379747;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;)I")
   @ObfuscatedName("eo")
   static int method830(Widget var0) {
      if (11 != var0.field4375 * -1510882375) {
         field338 -= 1222866659;
         field323[(DynamicObject.field1679 += 1712799695) * -112688729 - 1] = -1;
         return 1;
      } else {
         String var1 = (String)field328[(field338 -= -1527806862) * 1659519235];
         field323[(DynamicObject.field1679 += 120041229) * 1312991304 - 1] = var0.method7250(var1, 1980890414);
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("em")
   static int method834(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? classSZ.field6110 : TileItem.field1558;
      if (-2045108217 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classCK.method1575(classWK.field6691.method12173(var3, (byte)0), -2143159283);
         return 1;
      } else if (var0 != -1236118035) {
         if (var0 == 1162664634) {
            if (var3.field4309 == null) {
               field328[(field338 += -1166568712) * 1375698635 - 1] = "";
            } else {
               field328[(field338 += -1759615347) * 1650355555 - 1] = var3.field4309;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = field323[(DynamicObject.field1679 -= -1412339701) * -324749371];
         var4--;
         if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var3.actions[var4];
         } else {
            field328[(field338 += -840120859) * 1375698635 - 1] = "";
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ez")
   static int method835(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? classSZ.field6110 : TileItem.field1558;
      if (1800 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -357169883 - 1] = classCK.method1575(classWK.field6691.method12173(var3, (byte)0), -2102954586);
         return 1;
      } else if (var0 != 1801) {
         if (var0 == 1802) {
            if (var3.field4309 == null) {
               field328[(field338 += 1222866659) * 391722167 - 1] = "";
            } else {
               field328[(field338 += 1222866659) * 1808606681 - 1] = var3.field4309;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * 792588067];
         var4--;
         if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var3.actions[var4];
         } else {
            field328[(field338 += -1149239340) * 1375698635 - 1] = "";
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hs")
   static int method915(int var0, Script var1, boolean var2) {
      if (7463 == var0) {
         boolean var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         classON.method8615(var3, (byte)1);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ee")
   static int method837(int var0, Script var1, boolean var2) {
      if (1927 == var0 || var0 == 421239430) {
         if (1733013719 * field324 >= 10) {
            throw new RuntimeException();
         } else {
            Widget var11;
            if (var0 >= 2000) {
               var11 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)36);
            } else {
               var11 = var2 ? classSZ.field6110 : TileItem.field1558;
            }

            if (var11.field4246 == null) {
               return 0;
            } else {
               ScriptEvent var14 = classZS.method14182(
                  classZS.method14180(classUQ.method11465(var11, 2069005759).method14145(var11.field4246, (byte)2), 1733013719 * field324 + 1, -1256179292),
                  (byte)81
               );
               client.field823.method9658(var14, 1697206599);
               return 1;
            }
         }
      } else if (var0 == 680463984) {
         Widget var10 = var2 ? classSZ.field6110 : TileItem.field1558;
         int var13 = field323[(DynamicObject.field1679 -= 151639655) * -324749371];
         if (var13 >= 1 && var13 <= 10) {
            classDG var16 = new classDG(var13, var10.field4329 * 675775612, var10.field4260 * 63131743, var10.field4319 * 2073671441);
            field332.add(var16);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (273733090 == var0) {
         DynamicObject.field1679 -= 360123687;
         int var9 = field323[-946207657 * DynamicObject.field1679];
         int var12 = field323[DynamicObject.field1679 * -324749371 + 1];
         int var15 = field323[2 + -324749371 * DynamicObject.field1679];
         if (var15 >= 1 && var15 <= 10) {
            Widget var17 = classLY.method7378(classWK.field6691, var9, var12, (byte)3);
            if (null == var17) {
               throw new RuntimeException();
            } else {
               classDG var19 = new classDG(var15, var9, var12, 1682828259 * var17.field4319);
               field332.add(var19);
               return 1;
            }
         } else {
            throw new RuntimeException();
         }
      } else if (2929 == var0) {
         Object[] var3 = classSY.method10721(1423894988);
         DynamicObject.field1679 -= 360123687;
         int var4 = field323[-377659232 * DynamicObject.field1679];
         int var5 = field323[DynamicObject.field1679 * -341420755 + 1];
         int var6 = field323[2 + 116506950 * DynamicObject.field1679];
         int var7 = -1;
         Widget var8 = classLY.method7378(classWK.field6691, var5, var6, (byte)21);
         if (null != var8) {
            var7 = var8.field4319 * -226033197;
            classPF.method8856(var5, var6, var7, var4, var3, (byte)-119);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else {
         return 2;
      }
   }

   classBB() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ep")
   static int method838(int var0, Script var1, boolean var2) {
      if (1927 == var0 || var0 == 2927) {
         if (1733013719 * field324 >= 10) {
            throw new RuntimeException();
         } else {
            Widget var11;
            if (var0 >= 1763141914) {
               var11 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 418387247) * -324749371], (byte)67);
            } else {
               var11 = var2 ? classSZ.field6110 : TileItem.field1558;
            }

            if (var11.field4246 == null) {
               return 0;
            } else {
               ScriptEvent var14 = classZS.method14182(
                  classZS.method14180(classUQ.method11465(var11, 714440214).method14145(var11.field4246, (byte)2), 1733013719 * field324 + 1, 1575898387),
                  (byte)94
               );
               client.field823.method9658(var14, 1697206599);
               return 1;
            }
         }
      } else if (var0 == 634862267) {
         Widget var10 = var2 ? classSZ.field6110 : TileItem.field1558;
         int var13 = field323[(DynamicObject.field1679 -= 1268022981) * 565809995];
         if (var13 >= 1 && var13 <= 10) {
            classDG var16 = new classDG(var13, var10.field4329 * -1163656551, var10.field4260 * 63131743, var10.field4319 * 2073671441);
            field332.add(var16);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (2928 == var0) {
         DynamicObject.field1679 -= 360123687;
         int var9 = field323[-324749371 * DynamicObject.field1679];
         int var12 = field323[DynamicObject.field1679 * -324749371 + 1];
         int var15 = field323[2 + -324749371 * DynamicObject.field1679];
         if (var15 >= 1 && var15 <= 10) {
            Widget var17 = classLY.method7378(classWK.field6691, var9, var12, (byte)-82);
            if (null == var17) {
               throw new RuntimeException();
            } else {
               classDG var19 = new classDG(var15, var9, var12, -472504924 * var17.field4319);
               field332.add(var19);
               return 1;
            }
         } else {
            throw new RuntimeException();
         }
      } else if (1061097319 == var0) {
         Object[] var3 = classSY.method10721(2051533164);
         DynamicObject.field1679 -= 1346357119;
         int var4 = field323[-324749371 * DynamicObject.field1679];
         int var5 = field323[DynamicObject.field1679 * 1481973677 + 1];
         int var6 = field323[2 + 987217132 * DynamicObject.field1679];
         int var7 = -1;
         Widget var8 = classLY.method7378(classWK.field6691, var5, var6, (byte)-7);
         if (null != var8) {
            var7 = var8.field4319 * 2073671441;
            classPF.method8856(var5, var6, var7, var4, var3, (byte)-5);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ljava/lang/Object;")
   @ObfuscatedName("ec")
   static Object[] method840() {
      String var0 = (String)field328[(field338 -= 1222866659) * -1799522393];
      Object[] var1 = new Object[var0.length()];

      for (int var2 = var0.length() - 1; var2 >= 0; var2--) {
         if (var0.charAt(var2) == -1575826433) {
            var1[var2] = field323[(DynamicObject.field1679 -= 120041229) * -708656919];
         } else {
            var1[var2] = field328[(field338 -= 1222866659) * 35405762];
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ljava/lang/Object;")
   @ObfuscatedName("fo")
   static Object[] method841() {
      String var0 = (String)field328[(field338 -= 1222866659) * 1375698635];
      Object[] var1 = new Object[var0.length()];

      for (int var2 = var0.length() - 1; var2 >= 0; var2--) {
         if (var0.charAt(var2) == 'i') {
            var1[var2] = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         } else {
            var1[var2] = field328[(field338 -= 1222866659) * 1375698635];
         }
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fl")
   static int method842(int var0, Script var1, boolean var2) {
      Widget var3 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -1290584835], (byte)56);
      if (var0 == -181331954) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4281 * -193166471;
         return 1;
      } else if (-344697811 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -1521809363 - 1] = -1146441644 * var3.field4257;
         return 1;
      } else if (var0 == -1848443840) {
         field323[(DynamicObject.field1679 += -1378611356) * -276419633 - 1] = var3.field4249 * 561027299;
         return 1;
      } else if (2503 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1974357388 * var3.field4259;
         return 1;
      } else if (var0 == -92698483) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4289 ? 1 : 0;
         return 1;
      } else if (313212946 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4342 * -155005755;
         return 1;
      } else if (2506 != var0) {
         return 2;
      } else {
         int var4 = var3.field4342 * -1502647899;
         if (-1 == var4) {
            classVV var5 = classWK.field6691;

            for (InterfaceParent var6 = (InterfaceParent)var5.field6613.method13375();
               null != var6;
               var6 = (InterfaceParent)IndexedObjectSet.method13401(var5.field6613)
            ) {
               if (-1163656551 * var3.field4329 >> 16 == var6.field5276 * 2023647411) {
                  var4 = (int)var6.field6552;
                  break;
               }
            }
         }

         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lzr;)V")
   @ObfuscatedName("cw")
   public static void method781(ScriptEvent var0) {
      ItemLayer.method3952(var0, 1389198255, 332502277, (byte)-24);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gv")
   static int method869(int var0, Script var1, boolean var2) {
      if (3800 == var0) {
         if (null != classBM.field513) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
            classNJ.field4678 = classBM.field513;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (3801 == var0) {
         int var18 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (client.field865[var18] != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
            classNJ.field4678 = client.field865[var18];
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (var0 == 3802) {
         field328[(field338 += 1222866659) * 1375698635 - 1] = classNJ.field4678.field3016;
         return 1;
      } else if (var0 == 3803) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3034 ? 1 : 0;
         return 1;
      } else if (var0 == 3804) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3023;
         return 1;
      } else if (3805 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3025;
         return 1;
      } else if (var0 == 3806) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3024;
         return 1;
      } else if (var0 == 3807) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3019;
         return 1;
      } else if (3809 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3028 * -1967686263;
         return 1;
      } else if (3810 == var0) {
         int var17 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field328[(field338 += 1222866659) * 1375698635 - 1] = classNJ.field4678.field3043[var17];
         return 1;
      } else if (var0 == 3811) {
         int var16 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3037[var16];
         return 1;
      } else if (var0 == 3812) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3027 * -845393113;
         return 1;
      } else if (var0 == 3813) {
         int var15 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field328[(field338 += 1222866659) * 1375698635 - 1] = classNJ.field4678.field3044[var15];
         return 1;
      } else if (3814 == var0) {
         DynamicObject.field1679 -= 360123687;
         int var14 = field323[-324749371 * DynamicObject.field1679];
         int var20 = field323[1 + DynamicObject.field1679 * -324749371];
         int var21 = field323[DynamicObject.field1679 * -324749371 + 2];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ClanSettings.method6244(classNJ.field4678, var14, var20, var21, -654225686);
         return 1;
      } else if (var0 == 3815) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3014 * -577292071;
         return 1;
      } else if (var0 == 3816) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1725108575 * classNJ.field4678.field3017;
         return 1;
      } else if (var0 == 3817) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classBE.method993(
            classNJ.field4678, (String)field328[(field338 -= 1222866659) * 1375698635], -1554197813
         );
         return 1;
      } else if (3818 == var0) {
         field323[DynamicObject.field1679 * -324749371 - 1] = classNJ.field4678.method6249((byte)-127)[field323[DynamicObject.field1679 * -324749371 - 1]];
         return 1;
      } else if (var0 == 3819) {
         DynamicObject.field1679 -= 240082458;
         int var13 = field323[-324749371 * DynamicObject.field1679];
         int var19 = field323[-324749371 * DynamicObject.field1679 + 1];
         classVX.method12263(var19, var13, (byte)85);
         return 1;
      } else if (var0 == 3820) {
         int var12 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3039[var12];
         return 1;
      } else {
         if (3821 == var0) {
            DynamicObject.field1679 -= 360123687;
            int var3 = field323[DynamicObject.field1679 * -324749371];
            boolean var4 = field323[1 + DynamicObject.field1679 * -324749371] == 1;
            int var5 = field323[DynamicObject.field1679 * -324749371 + 2];
            VarbitComposition.method9217(var5, var3, var4, -887967099);
         }

         if (3822 == var0) {
            int var11 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3045[var11] ? 1 : 0;
            return 1;
         } else if (var0 == 3850) {
            if (classKA.field3513 != null) {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
               classPO.field5368 = classKA.field3513;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3851) {
            int var10 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            if (null != client.field866[var10]) {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
               classPO.field5368 = client.field866[var10];
               classHU.field2891 = 1507670665 * var10;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3852) {
            field328[(field338 += 1222866659) * 1375698635 - 1] = classPO.field5368.field2948;
            return 1;
         } else if (3853 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classPO.field5368.field2950;
            return 1;
         } else if (3854 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classPO.field5368.field2949;
            return 1;
         } else if (3855 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ClanChannel.method6183(classPO.field5368, (byte)-54);
            return 1;
         } else if (var0 == 3856) {
            int var9 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            field328[(field338 += 1222866659) * 1375698635 - 1] = ((ClanChannelMember)classPO.field5368.field2955.get(var9)).field2846.method164(1214770306);
            return 1;
         } else if (3857 == var0) {
            int var8 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ((ClanChannelMember)classPO.field5368.field2955.get(var8)).field2841;
            return 1;
         } else if (3858 == var0) {
            int var7 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ((ClanChannelMember)classPO.field5368.field2955.get(var7)).field2842
               * -906550845;
            return 1;
         } else if (3859 == var0) {
            int var6 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            Message.method1496(-1270719559 * classHU.field2891, var6, -1718938348);
            return 1;
         } else if (var0 == 3860) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classPO.field5368
               .method6186((String)field328[(field338 -= 1222866659) * 1375698635], (byte)33);
            return 1;
         } else if (3861 == var0) {
            field323[DynamicObject.field1679 * -324749371 - 1] = ClanChannel.method6169(classPO.field5368, -2145642455)[field323[-324749371
                  * DynamicObject.field1679
               - 1]];
            return 1;
         } else if (3890 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != classOH.field4871 ? 1 : 0;
            return 1;
         } else {
            return 2;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fy")
   static int method845(int var0, Script var1, boolean var2) {
      Widget var3 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 783283850) * -324749371], (byte)18);
      if (2600 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -849292187 - 1] = -34809441 * var3.field4341;
         return 1;
      } else if (2601 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * 1638793389 - 1] = var3.field4331 * -637605872;
         return 1;
      } else if (2602 == var0) {
         field328[(field338 += 1222866659) * 691572121 - 1] = var3.field4301;
         return 1;
      } else if (var0 == 2603) {
         field323[(DynamicObject.field1679 += 1546163425) * -324749371 - 1] = var3.field4258 * 1516925062;
         return 1;
      } else if (2604 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * 2109400767 - 1] = var3.field4269 * 285423576;
         return 1;
      } else if (2605 == var0) {
         field323[(DynamicObject.field1679 += -1695513763) * 580901084 - 1] = var3.field4338 * 1814010327;
         return 1;
      } else if (-220138251 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1246332317 * var3.field4356;
         return 1;
      } else if (824478225 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -1533262429 - 1] = var3.field4294 * 827587461;
         return 1;
      } else if (-438620213 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1408373652 * var3.field4292;
         return 1;
      } else if (1206818860 == var0) {
         field323[(DynamicObject.field1679 += 175405817) * 175206179 - 1] = 845387751 * var3.field4347;
         return 1;
      } else if (var0 == 2610) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4276 * 1991172799;
         return 1;
      } else if (var0 == -945721246) {
         field323[(DynamicObject.field1679 += 120041229) * -1464956356 - 1] = 1740831551 * var3.field4270;
         return 1;
      } else if (2612 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * 1595800301 - 1] = var3.field4295 * 948260113;
         return 1;
      } else if (2613 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -1401235172 - 1] = var3.field4307.vmethod8((byte)1);
         return 1;
      } else if (var0 == 2614) {
         field323[(DynamicObject.field1679 += 1562907454) * -324749371 - 1] = var3.field4298 ? 1 : 0;
         return 1;
      } else {
         if (var0 == 2617) {
            classLI var4 = Widget.method7285(var3, 713944948);
            field323[(DynamicObject.field1679 += 120041229) * 708295499 - 1] = var4 != null ? var4.field4172 * -211319977 : 0;
         }

         if (2618 == var0) {
            classLI var23 = Widget.method7285(var3, 161414845);
            field323[(DynamicObject.field1679 += 120041229) * 1181031999 - 1] = var23 != null ? var23.field4170 * 1532740787 : 0;
            return 1;
         } else if (2619 == var0) {
            classLH var22 = var3.method7283(-979349242);
            field328[(field338 += 1222866659) * 575127336 - 1] = var22 != null ? classLH.method6973(var22, -1171577307).method13854((byte)-126) : "";
            return 1;
         } else if (1401612392 == var0) {
            classLI var21 = Widget.method7285(var3, 1441829450);
            field323[(DynamicObject.field1679 += 120041229) * 958997369 - 1] = null != var21 ? -1633029114 * var21.field4169 : 0;
            return 1;
         } else if (var0 == 341341108) {
            classLH var20 = var3.method7283(-1865992832);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != var20 ? var20.method7011((byte)-128) : 0;
            return 1;
         } else if (var0 == 2622) {
            classLH var19 = var3.method7283(-1242632680);
            field323[(DynamicObject.field1679 += 1626445928) * -324749371 - 1] = var19 != null ? classLH.method7014(var19, -2118783281) : 0;
            return 1;
         } else if (2623 == var0) {
            classLH var18 = var3.method7283(-656305024);
            field323[(DynamicObject.field1679 += -318921958) * -324749371 - 1] = var18 != null ? var18.method7017(-1454181141) : 0;
            return 1;
         } else if (var0 == 1170491052) {
            classLH var17 = var3.method7283(-27665037);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var17 != null && var17.method6982(1572944374) ? 1 : 0;
            return 1;
         } else if (var0 != 2625) {
            if (2626 == var0) {
               classLH var16 = var3.method7283(-993822312);
               field328[(field338 += 762164183) * 1453076001 - 1] = null != var16 ? classLH.method6977(var16, 1447661178).method195(1044354114) : "";
               return 1;
            } else if (1261383789 == var0) {
               classLH var15 = var3.method7283(-699711363);
               int var5 = var15 != null ? var15.method6995(-745300074) : 0;
               int var6 = null != var15 ? var15.method6994((byte)-82) : 0;
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = Math.min(var5, var6);
               field323[(DynamicObject.field1679 += 1530429798) * -1472972059 - 1] = Math.max(var5, var6);
               return 1;
            } else if (var0 == 2628) {
               classLH var14 = var3.method7283(-2034026509);
               field323[(DynamicObject.field1679 += 1936925215) * -324749371 - 1] = null != var14 ? var14.method6994((byte)-72) : 0;
               return 1;
            } else if (var0 == -174661255) {
               classLH var13 = var3.method7283(-1420008667);
               field323[(DynamicObject.field1679 += 1871552887) * -1061952646 - 1] = null != var13 ? var13.method7025(494958179) : 0;
               return 1;
            } else if (var0 == 2630) {
               classLH var12 = var3.method7283(-196774202);
               field323[(DynamicObject.field1679 += 120041229) * 1798226936 - 1] = null != var12 ? var12.method7018(783434467) : 0;
               return 1;
            } else if (var0 == 2631) {
               classLH var11 = var3.method7283(-1218411660);
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != var11 ? var11.method7034((byte)3) : 0;
               return 1;
            } else if (830655648 == var0) {
               classLH var10 = var3.method7283(-2002564193);
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != var10 ? var10.method7039((byte)-41) : 0;
               return 1;
            } else if (2633 == var0) {
               classTT var9 = Widget.method7287(var3, 1289741507);
               field323[-1088903403 * DynamicObject.field1679 - 1] = var9 != null
                  ? var9.method11138(field323[-324749371 * DynamicObject.field1679 - 1], -282921873)
                  : 0;
               return 1;
            } else if (-1132047370 == var0) {
               classTT var8 = Widget.method7287(var3, 1289741507);
               field323[DynamicObject.field1679 * -324749371 - 1] = null != var8
                  ? var8.method11143((char)field323[DynamicObject.field1679 * -324749371 - 1], -74313651)
                  : 0;
               return 1;
            } else {
               return 2;
            }
         } else {
            classLH var7 = var3.method7283(-527054165);
            field323[(DynamicObject.field1679 += 120041229) * -1884591836 - 1] = var7 != null && var7.method6985(-880967958) ? 1 : 0;
            return 1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fg")
   static int method846(int var0, Script var1, boolean var2) {
      if (var0 == -388124235) {
         Widget var13 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= -795225934) * -93208621], (byte)47);
         field323[(DynamicObject.field1679 += 120041229) * -1987228274 - 1] = 975902525 * var13.field4319;
         return 1;
      } else if (var0 == -1539564177) {
         Widget var12 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)51);
         if (2073671441 * var12.field4319 != -1) {
            field323[(DynamicObject.field1679 += 120041229) * -1334155200 - 1] = 1190987649 * var12.field4344;
         } else {
            field323[(DynamicObject.field1679 += 1202566483) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (2702 == var0) {
         int var11 = field323[(DynamicObject.field1679 -= 1389255524) * 605816471];
         InterfaceParent var15 = (InterfaceParent)classWK.field6691.field6613.method13363(var11);
         if (var15 != null) {
            field323[(DynamicObject.field1679 += -120919703) * -876138828 - 1] = 1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -835357582 - 1] = 0;
         }

         return 1;
      } else if (var0 == -898758442) {
         DynamicObject.field1679 -= 784947357;
         int var10 = field323[DynamicObject.field1679 * -324749371];
         Widget var14 = classLY.method7378(
            classWK.field6691, field323[1 + 964751954 * DynamicObject.field1679], field323[2 + DynamicObject.field1679 * -324749371], (byte)-92
         );
         classPN var16 = classNE.method7829(var10, (byte)-57);
         if (classPN.method9026(var16, (byte)2)) {
            field328[(field338 += -2013803250) * 1206252921 - 1] = var14.method7220(var10, var16.field5351, 765794889);
         } else if (var16.method9028((byte)83)) {
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var14.method7228(var10, 3335646069137558745L * var16.field5354);
         } else {
            field323[(DynamicObject.field1679 += 2127604217) * -811272602 - 1] = Widget.method7226(var14, var10, var16.field5352 * -1601970641, (byte)44);
         }

         return 1;
      } else if (var0 == -1969963657) {
         DynamicObject.field1679 -= -1327498637;
         Widget var9 = classLY.method7378(
            classWK.field6691, field323[DynamicObject.field1679 * -324749371], field323[1 + -1520861578 * DynamicObject.field1679], (byte)-121
         );
         int var4 = field323[2 + DynamicObject.field1679 * -324749371];
         Object var5 = classKN.method6500(var4, -683653121);
         int var6 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var9.method7230(var6, var5, (byte)-13);
         return 1;
      } else if (2706 == var0) {
         field323[(DynamicObject.field1679 += 432790124) * 1035129252 - 1] = -77072447 * classWK.field6691.field6612;
         return 1;
      } else if (2707 == var0) {
         Widget var8 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 1028639710) * -324749371], (byte)88);
         field323[(DynamicObject.field1679 += 426845436) * -1557138718 - 1] = var8.method7249(1355775728) ? 1 : 0;
         return 1;
      } else if (2708 == var0) {
         Widget var7 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)98);
         return classEG.method3883(var7, -37961453);
      } else if (var0 == 2709) {
         Widget var3 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 344870273) * 1281964182], (byte)34);
         return classIC.method6142(var3, (byte)-28);
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fi")
   static int method847(int var0, Script var1, boolean var2) {
      if (var0 == -1160402398) {
         Widget var13 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= -510966411) * 1427056908], (byte)100);
         field323[(DynamicObject.field1679 += 983793865) * -324749371 - 1] = -1722897941 * var13.field4319;
         return 1;
      } else if (var0 == 2701) {
         Widget var12 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 1404475209) * 671645879], (byte)43);
         if (1014995028 * var12.field4319 != -1) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -2068559258 * var12.field4344;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (2702 == var0) {
         int var11 = field323[(DynamicObject.field1679 -= 120041229) * 1944476495];
         InterfaceParent var15 = (InterfaceParent)classWK.field6691.field6613.method13363(var11);
         if (var15 != null) {
            field323[(DynamicObject.field1679 += -1733522439) * -324749371 - 1] = 1;
         } else {
            field323[(DynamicObject.field1679 += -465767716) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2703) {
         DynamicObject.field1679 -= 360123687;
         int var10 = field323[DynamicObject.field1679 * 398527074];
         Widget var14 = classLY.method7378(
            classWK.field6691, field323[1 + -324749371 * DynamicObject.field1679], field323[2 + DynamicObject.field1679 * 551230586], (byte)2
         );
         classPN var16 = classNE.method7829(var10, (byte)-60);
         if (classPN.method9026(var16, (byte)2)) {
            field328[(field338 += -1269322508) * 1375698635 - 1] = var14.method7220(var10, var16.field5351, 1083236993);
         } else if (var16.method9028((byte)102)) {
            field322[(classXT.field6939 += -714596438) * -239805069 - 1] = var14.method7228(var10, 3335646069137558745L * var16.field5354);
         } else {
            field323[(DynamicObject.field1679 += 120041229) * 1772537457 - 1] = Widget.method7226(var14, var10, var16.field5352 * -1601970641, (byte)-18);
         }

         return 1;
      } else if (var0 == 939378518) {
         DynamicObject.field1679 -= 1080959845;
         Widget var9 = classLY.method7378(
            classWK.field6691, field323[DynamicObject.field1679 * 692915190], field323[1 + -1411520915 * DynamicObject.field1679], (byte)-110
         );
         int var4 = field323[2 + DynamicObject.field1679 * 866458975];
         Object var5 = classKN.method6500(var4, -1095305967);
         int var6 = field323[(DynamicObject.field1679 -= 120041229) * -590417533];
         var9.method7230(var6, var5, (byte)0);
         return 1;
      } else if (1259846086 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * 1082249080 - 1] = -77072447 * classWK.field6691.field6612;
         return 1;
      } else if (-1707618302 == var0) {
         Widget var8 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= -588132) * -324749371], (byte)62);
         field323[(DynamicObject.field1679 += -1952803376) * -324749371 - 1] = var8.method7249(1355775728) ? 1 : 0;
         return 1;
      } else if (2708 == var0) {
         Widget var7 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * 710406329], (byte)54);
         return classEG.method3883(var7, -132732747);
      } else if (var0 == 2709) {
         Widget var3 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * 79278200], (byte)24);
         return classIC.method6142(var3, (byte)-24);
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fb")
   static int method848(int var0, Script var1, boolean var2) {
      if (var0 == -1999019343) {
         Widget var13 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -1512676781], (byte)121);
         field323[(DynamicObject.field1679 += 1757421409) * -324749371 - 1] = 17376936 * var13.field4319;
         return 1;
      } else if (var0 == 2701) {
         Widget var12 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)60);
         if (2073671441 * var12.field4319 != -1) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 2075939431 * var12.field4344;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -1122607122 - 1] = 0;
         }

         return 1;
      } else if (-1937618762 == var0) {
         int var11 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         InterfaceParent var15 = (InterfaceParent)classWK.field6691.field6613.method13363(var11);
         if (var15 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
         } else {
            field323[(DynamicObject.field1679 += -271397113) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2703) {
         DynamicObject.field1679 -= 1691360452;
         int var10 = field323[DynamicObject.field1679 * -1144283464];
         Widget var14 = classLY.method7378(
            classWK.field6691, field323[1 + -324749371 * DynamicObject.field1679], field323[2 + DynamicObject.field1679 * -324749371], (byte)-72
         );
         classPN var16 = classNE.method7829(var10, (byte)-1);
         if (classPN.method9026(var16, (byte)2)) {
            field328[(field338 += 206766864) * -1011194514 - 1] = var14.method7220(var10, var16.field5351, 719099751);
         } else if (var16.method9028((byte)74)) {
            field322[(classXT.field6939 += -1297854163) * 1208856395 - 1] = var14.method7228(var10, 3335646069137558745L * var16.field5354);
         } else {
            field323[(DynamicObject.field1679 += -625999918) * -324749371 - 1] = Widget.method7226(var14, var10, var16.field5352 * -533433442, (byte)-66);
         }

         return 1;
      } else if (var0 == -177697307) {
         DynamicObject.field1679 -= -1113709981;
         Widget var9 = classLY.method7378(
            classWK.field6691, field323[DynamicObject.field1679 * -1773184806], field323[1 + -539376572 * DynamicObject.field1679], (byte)-87
         );
         int var4 = field323[2 + DynamicObject.field1679 * 146562870];
         Object var5 = classKN.method6500(var4, 457916548);
         int var6 = field323[(DynamicObject.field1679 -= 519398041) * -1921486973];
         var9.method7230(var6, var5, (byte)-90);
         return 1;
      } else if (765528524 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -77072447 * classWK.field6691.field6612;
         return 1;
      } else if (2707 == var0) {
         Widget var8 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 1289526337) * -324749371], (byte)34);
         field323[(DynamicObject.field1679 += -460454985) * -986443243 - 1] = var8.method7249(1355775728) ? 1 : 0;
         return 1;
      } else if (2708 == var0) {
         Widget var7 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -1932660678], (byte)69);
         return classEG.method3883(var7, 1523745565);
      } else if (var0 == 1659927895) {
         Widget var3 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)98);
         return classIC.method6142(var3, (byte)-13);
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;)I")
   @ObfuscatedName("ew")
   static int method831(Widget var0) {
      if (11 != var0.field4375 * -1510882375) {
         field328[field338 * 1375698635 - 1] = "";
         return 1;
      } else {
         String var1 = (String)field328[(field338 -= 1222866659) * 1375698635];
         field328[(field338 += 1222866659) * 1375698635 - 1] = Widget.method7253(var0, var1, -303353185);
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fz")
   static int method850(int var0, Script var1, boolean var2) {
      Widget var3 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)74);
      if (var0 == 2800) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classCK.method1575(classWK.field6691.method12173(var3, (byte)0), -2103862068);
         return 1;
      } else if (var0 != 2801) {
         if (var0 == 2802) {
            if (var3.field4309 == null) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            } else {
               field328[(field338 += 1222866659) * 1375698635 - 1] = var3.field4309;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var4--;
         if (null != var3.actions && var4 < var3.actions.length && null != var3.actions[var4]) {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var3.actions[var4];
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Llw;)V")
   @ObfuscatedName("jf")
   static void method947(Widget var0, Widget var1) {
      if (-1510882375 * var0.field4375 == 0) {
         for (int var2 = var0.field4265 * -1210177335; var2 <= var0.field4266 * 379541057; var2++) {
            Widget var3 = var1.field4340[var2];
            if (null != var3 && 63131743 * var0.field4260 == 653784551 * var3.field4263) {
               classDM.method3434(var3, var1, (byte)-106);
            }
         }
      }

      var1.field4340[var0.field4260 * 63131743] = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fq")
   static int method852(int var0, Script var1, boolean var2) {
      if (var0 == 3100) {
         String var22 = (String)field328[(field338 -= 1222866659) * 645712107];
         var22 = classUP.method11420(var22, User.method10179(-2092137458), field334, field333, (byte)0);
         classPH.method8883(0, "", var22, 1826232454);
         return 1;
      } else if (var0 == 3101) {
         DynamicObject.field1679 -= 240082458;
         classCU.method2676(
            classMB.method7521(1067060855), field323[1875223922 * DynamicObject.field1679], field323[1 + -324749371 * DynamicObject.field1679], -805494808
         );
         return 1;
      } else if (var0 == 971541820) {
         if (!field335) {
            field330 = true;
         }

         return 1;
      } else if (var0 == -1158418406) {
         String var21 = (String)field328[(field338 -= 1222866659) * 1375698635];
         int var31 = 0;
         if (IntProjection.method4078(var21, (byte)-1)) {
            var31 = classJF.method6360(var21, -641404764);
         }

         PacketBufferNode var34 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_COUNTDIALOG, client.packetWriter.isaacCipher, (byte)-39);
         var34.packetBuffer.method12979(var31, 660440932);
         client.packetWriter.addNode(var34, -1301097035);
         return 1;
      } else if (var0 == 572093545) {
         String var20 = (String)field328[(field338 -= 1222866659) * 1375698635];
         PacketBufferNode var30 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_NAMEDIALOG, client.packetWriter.isaacCipher, (byte)-46);
         Buffer.method12971(var30.packetBuffer, var20.length() + 1, (byte)-113);
         Buffer.method12997(var30.packetBuffer, var20, (short)6831);
         client.packetWriter.addNode(var30, -1301097035);
         return 1;
      } else if (var0 == -62382313) {
         String var19 = (String)field328[(field338 -= 1222866659) * 160740285];
         PacketBufferNode var29 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_STRINGDIALOG, client.packetWriter.isaacCipher, (byte)85);
         Buffer.method12971(var29.packetBuffer, var19.length() + 1, (byte)-82);
         Buffer.method12997(var29.packetBuffer, var19, (short)16200);
         client.packetWriter.addNode(var29, -1301097035);
         return 1;
      } else if (var0 == -1223709818) {
         int var18 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         String var28 = (String)field328[(field338 -= 1222866659) * 1375698635];
         classLN.method7127(var18, var28, 1733409423);
         return 1;
      } else if (var0 == 3108) {
         DynamicObject.field1679 -= -1768716092;
         int var17 = field323[566055874 * DynamicObject.field1679];
         int var27 = field323[1 + DynamicObject.field1679 * -672402985];
         int var33 = field323[1981797614 * DynamicObject.field1679 + 2];
         Widget var36 = classLY.method7375(classWK.field6691, var33, (byte)125);
         if (!client.field973 && classWK.field6691.method12157(var36, var17, var27, -37798675)) {
            classBT.method1244(1058061672);
         }

         return 1;
      } else if (3109 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var16 = field323[1752018297 * DynamicObject.field1679];
         int var26 = field323[-943103786 * DynamicObject.field1679 + 1];
         Widget var32 = var2 ? classSZ.field6110 : TileItem.field1558;
         if (!client.field973 && classWK.field6691.method12157(var32, var16, var26, 1014434332)) {
            classBT.method1244(917788607);
         }

         return 1;
      } else if (3110 == var0) {
         classON.field4995 = field323[(DynamicObject.field1679 -= 1179212934) * -324749371] == 1;
         return 1;
      } else if (3111 == var0) {
         field323[(DynamicObject.field1679 += 194816482) * -324749371 - 1] = ClientPreferences.method2720(classAB.field122, -1315528093) ? 1 : 0;
         return 1;
      } else if (1857374870 == var0) {
         classAB.field122.method2721(field323[(DynamicObject.field1679 -= 120041229) * -289467602] == 1, -1810756472);
         return 1;
      } else if (var0 == 189942248) {
         String var15 = (String)field328[(field338 -= 992579272) * 1375698635];
         DynamicObject.field1679 -= 120041229;
         classUF.method11299(var15, (byte)1);
         return 1;
      } else if (var0 == -1331464555) {
         String var14 = (String)field328[(field338 -= 1599805347) * 2095008426];
         long var25 = 0L;
         if (classQE.method9498(var14, (byte)100)) {
            var25 = classDM.method3432(var14, 1668696346);
         }

         PacketBufferNode var35 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_COUNTDIALOG_LONG, client.packetWriter.isaacCipher, (byte)-117);
         var35.packetBuffer.method12987(var25);
         client.packetWriter.addNode(var35, -1301097035);
         return 1;
      } else if (var0 == 3115) {
         int var13 = field323[(DynamicObject.field1679 -= 1810055310) * -324749371];
         PacketBufferNode var24 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_OBJDIALOG, client.packetWriter.isaacCipher, (byte)-74);
         var24.packetBuffer.method12973(var13, -1542382992);
         client.packetWriter.addNode(var24, -1301097035);
         return 1;
      } else if (var0 == -1647558718) {
         int var12 = field323[(DynamicObject.field1679 -= 1785430782) * 976367328];
         field338 -= -1329436942;
         String var4 = (String)field328[1697527048 * field338];
         String var5 = (String)field328[1375698635 * field338 + 1];
         if (var4.length() > 805813762) {
            return 1;
         } else if (var5.length() > 426659022) {
            return 1;
         } else {
            PacketBufferNode var6 = classEF.getPacketBufferNode(ClientPacket.BUG_REPORT, client.packetWriter.isaacCipher, (byte)2);
            var6.packetBuffer.method12973(1 + classAU.method712(var4, (byte)94) + classAU.method712(var5, (byte)65), -1542382992);
            Buffer.method12997(var6.packetBuffer, var4, (short)3112);
            Buffer.method12997(var6.packetBuffer, var5, (short)1588);
            var6.packetBuffer.method13156(var12, (byte)-57);
            client.packetWriter.addNode(var6, -1301097035);
            return 1;
         }
      } else if (825726354 == var0) {
         DynamicObject.field1679 -= 120041229;
         return 1;
      } else if (var0 == 3118) {
         client.field858 = field323[(DynamicObject.field1679 -= -559907004) * -1482703508] == 1;
         return 1;
      } else if (var0 == 3119) {
         client.field851 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else if (var0 == 3120) {
         if (field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
            client.field852 = 1917938073 * (client.field852 * -189334880 | 1);
         } else {
            client.field852 = (client.field852 * -1072700981 & -1359833260) * 2023353978;
         }

         return 1;
      } else if (632071938 == var0) {
         if (field323[(DynamicObject.field1679 -= 120041229) * 972850786] == 1) {
            client.field852 = (-1072700981 * client.field852 | 2) * 1050161996;
         } else {
            client.field852 = -1165804573 * (-1460987468 * client.field852 & 1205363590);
         }

         return 1;
      } else if (3122 == var0) {
         if (field323[(DynamicObject.field1679 -= 120041229) * -404858101] == 1) {
            client.field852 = (-1072700981 * client.field852 | 4) * -52327736;
         } else {
            client.field852 = (-1072700981 * client.field852 & 97076021) * -1165804573;
         }

         return 1;
      } else if (-801173540 == var0) {
         if (field323[(DynamicObject.field1679 -= -1037900222) * 830761936] == 1) {
            client.field852 = (-1901891921 * client.field852 | 8) * -573383342;
         } else {
            client.field852 = (client.field852 * -1980011248 & 376460176) * -1959503462;
         }

         return 1;
      } else if (3124 == var0) {
         client.field852 = 0;
         return 1;
      } else if (var0 == 809153888) {
         client.field842 = field323[(DynamicObject.field1679 -= 847424751) * -324749371] == 1;
         return 1;
      } else if (3126 == var0) {
         client.field844 = field323[(DynamicObject.field1679 -= -790030225) * -563598172] == 1;
         return 1;
      } else if (var0 == 3127) {
         classHH.method6056(field323[(DynamicObject.field1679 -= 1850179564) * -324749371] == 1, -1508860107);
         return 1;
      } else if (var0 == -1737824732) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classTT.method11166(420390735) ? 1 : 0;
         return 1;
      } else if (var0 == 3129) {
         DynamicObject.field1679 -= 240082458;
         client.field841 = field323[-1023942162 * DynamicObject.field1679] * 1993421016;
         client.field951 = field323[333392969 * DynamicObject.field1679 + 1] * 1422039702;
         return 1;
      } else if (var0 == 3130) {
         DynamicObject.field1679 -= 217866993;
         return 1;
      } else if (var0 == 3131) {
         DynamicObject.field1679 -= 1490521025;
         return 1;
      } else if (var0 == 3132) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 773246731 * classSA.field5897;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = IntProjection.field1938 * -1413529144;
         return 1;
      } else if (3133 == var0) {
         DynamicObject.field1679 -= 120041229;
         return 1;
      } else if (var0 == -442809983) {
         return 1;
      } else if (3135 == var0) {
         DynamicObject.field1679 -= 1226748199;
         return 1;
      } else if (3136 == var0) {
         classWK.field6691.field6615 = 2138382953;
         classWK.field6691.field6616 = field323[(DynamicObject.field1679 -= 865565983) * -324749371] * 1264941915;
         return 1;
      } else if (3137 == var0) {
         classWK.field6691.field6615 = -6067130;
         classWK.field6691.field6616 = field323[(DynamicObject.field1679 -= 1259862913) * -324749371] * 1264941915;
         return 1;
      } else if (915430741 == var0) {
         classWK.field6691.field6615 = 0;
         return 1;
      } else if (1059564625 == var0) {
         classWK.field6691.field6615 = 2144450083;
         return 1;
      } else if (var0 == 719158603) {
         classWK.field6691.field6615 = 1479108645;
         classWK.field6691.field6616 = (var2 ? classSZ.field6110.field4329 * 1744024251 : 2064524024 * TileItem.field1558.field4329) * 1264941915;
         return 1;
      } else if (var0 == 3141) {
         boolean var11 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         classAB.field122.method2727(var11, -1291749829);
         return 1;
      } else if (-1852317539 == var0) {
         field323[(DynamicObject.field1679 += -233358056) * -386330361 - 1] = ClientPreferences.method2724(classAB.field122, (short)-6099) ? 1 : 0;
         return 1;
      } else if (3143 == var0) {
         boolean var10 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         client.field832 = var10;
         if (!var10) {
            classAB.field122.method2789("", 630908125);
         }

         return 1;
      } else if (3144 == var0) {
         field323[(DynamicObject.field1679 += 1084923344) * -324749371 - 1] = client.field832 ? 1 : 0;
         return 1;
      } else if (var0 == 1856737570) {
         return 1;
      } else if (var0 == 3146) {
         boolean var9 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         ClientPreferences.method2736(classAB.field122, !var9, (byte)16);
         return 1;
      } else if (3147 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAB.field122.method2732((byte)22) ? 0 : 1;
         return 1;
      } else if (3148 == var0) {
         return 1;
      } else if (3149 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * 707804751 - 1] = 0;
         return 1;
      } else if (var0 == 3150) {
         field323[(DynamicObject.field1679 += 120041229) * -948376076 - 1] = 0;
         return 1;
      } else if (528330116 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (1631586810 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -1683499 - 1] = 0;
         return 1;
      } else if (var0 == 3153) {
         field323[(DynamicObject.field1679 += -251467502) * -324749371 - 1] = -1586232457 * classBF.field395;
         return 1;
      } else if (var0 == -442431776) {
         field323[(DynamicObject.field1679 += -1788918141) * -1779523963 - 1] = classXW.method12952(734329922);
         return 1;
      } else if (var0 == 3155) {
         field338 -= -1876859620;
         return 1;
      } else if (3156 == var0) {
         return 1;
      } else if (3157 == var0) {
         DynamicObject.field1679 -= 240082458;
         return 1;
      } else if (-1613058582 == var0) {
         field323[(DynamicObject.field1679 += -1303375665) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == 3159) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == 3160) {
         field323[(DynamicObject.field1679 += 1564832954) * -37350884 - 1] = 0;
         return 1;
      } else if (var0 == -1381575641) {
         DynamicObject.field1679 -= 120041229;
         field323[(DynamicObject.field1679 += 1557902074) * 841872650 - 1] = 0;
         return 1;
      } else if (-2049385599 == var0) {
         DynamicObject.field1679 -= -201060766;
         field323[(DynamicObject.field1679 += 52058405) * -324749371 - 1] = 0;
         return 1;
      } else if (3163 == var0) {
         field338 -= 1222866659;
         field323[(DynamicObject.field1679 += 120041229) * -1648454567 - 1] = 0;
         return 1;
      } else if (1170513302 == var0) {
         DynamicObject.field1679 -= 872559415;
         field328[(field338 += 716247212) * 1309603795 - 1] = "";
         return 1;
      } else if (var0 == 3165) {
         DynamicObject.field1679 -= -517147230;
         field323[(DynamicObject.field1679 += -295719618) * -324749371 - 1] = 0;
         return 1;
      } else if (3166 == var0) {
         DynamicObject.field1679 -= 707285089;
         field323[(DynamicObject.field1679 += -260131332) * 1037314999 - 1] = 0;
         return 1;
      } else if (var0 == 3167) {
         DynamicObject.field1679 -= 240082458;
         field323[(DynamicObject.field1679 += 120041229) * 1715513978 - 1] = 0;
         return 1;
      } else if (var0 == 1056943983) {
         DynamicObject.field1679 -= -210055079;
         field328[(field338 += 1292394642) * -1862484089 - 1] = "";
         field328[(field338 += -364141932) * -1061203958 - 1] = "";
         field328[(field338 += 1222866659) * -1865703268 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += 928926332) * 1375698635 - 1] = "";
         field328[(field338 += 1222866659) * 1649903105 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += -2105062166) * 890954404 - 1] = "";
         return 1;
      } else if (2082230297 == var0) {
         return 1;
      } else if (3170 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == 3171) {
         field323[(DynamicObject.field1679 += 120041229) * 139104968 - 1] = 0;
         return 1;
      } else if (-1952394813 == var0) {
         DynamicObject.field1679 -= 1179118081;
         return 1;
      } else if (var0 == 3173) {
         DynamicObject.field1679 -= 1072677562;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (3174 == var0) {
         DynamicObject.field1679 -= -1652298543;
         return 1;
      } else if (var0 == 3175) {
         field323[(DynamicObject.field1679 += 120041229) * -1133499056 - 1] = 0;
         return 1;
      } else if (3176 == var0) {
         return 1;
      } else if (3177 == var0) {
         return 1;
      } else if (-1538065331 == var0) {
         field338 -= 1222866659;
         return 1;
      } else if (855594454 == var0) {
         return 1;
      } else if (-657868766 == var0) {
         field338 -= 1222866659;
         return 1;
      } else if (1484231212 == var0) {
         classBY.method1359(field323[(DynamicObject.field1679 -= 120041229) * 455001548], (byte)0);
         return 1;
      } else if (var0 == 767338998) {
         field323[(DynamicObject.field1679 += 120041229) * -615091273 - 1] = Projectile.method1223(-2000680629);
         return 1;
      } else if (var0 == 3185) {
         int var8 = field323[(DynamicObject.field1679 -= 1101549362) * -1001658087];
         classAB.field122.method2812(var8, 1790905510);
         return 1;
      } else if (var0 == 3186) {
         int var7 = classAB.field122.method2817((byte)0);
         field323[(DynamicObject.field1679 += 75029593) * -324749371 - 1] = var7;
         return 1;
      } else if (var0 == 1227548783) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -1406617421];
         classDF.method3053(var3, (byte)0);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fp")
   static int method853(int var0, Script var1, boolean var2) {
      if (var0 == 3100) {
         String var22 = (String)field328[(field338 -= 1222866659) * 1375698635];
         var22 = classUP.method11420(var22, User.method10179(-1487175623), field334, field333, (byte)0);
         classPH.method8883(0, "", var22, 1816610188);
         return 1;
      } else if (var0 == 3101) {
         DynamicObject.field1679 -= 240082458;
         classCU.method2676(
            classMB.method7521(-1594335823), field323[-324749371 * DynamicObject.field1679], field323[1 + -324749371 * DynamicObject.field1679], -444546924
         );
         return 1;
      } else if (var0 == 3103) {
         if (!field335) {
            field330 = true;
         }

         return 1;
      } else if (var0 == 3104) {
         String var21 = (String)field328[(field338 -= 1222866659) * 1375698635];
         int var31 = 0;
         if (IntProjection.method4078(var21, (byte)-1)) {
            var31 = classJF.method6360(var21, -171013988);
         }

         PacketBufferNode var34 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_COUNTDIALOG, client.packetWriter.isaacCipher, (byte)111);
         var34.packetBuffer.method12979(var31, 1018295098);
         client.packetWriter.addNode(var34, -1301097035);
         return 1;
      } else if (var0 == 3105) {
         String var20 = (String)field328[(field338 -= 1222866659) * 1375698635];
         PacketBufferNode var30 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_NAMEDIALOG, client.packetWriter.isaacCipher, (byte)8);
         Buffer.method12971(var30.packetBuffer, var20.length() + 1, (byte)-75);
         Buffer.method12997(var30.packetBuffer, var20, (short)2307);
         client.packetWriter.addNode(var30, -1301097035);
         return 1;
      } else if (var0 == 3106) {
         String var19 = (String)field328[(field338 -= 1222866659) * 1375698635];
         PacketBufferNode var29 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_STRINGDIALOG, client.packetWriter.isaacCipher, (byte)-52);
         Buffer.method12971(var29.packetBuffer, var19.length() + 1, (byte)-87);
         Buffer.method12997(var29.packetBuffer, var19, (short)21607);
         client.packetWriter.addNode(var29, -1301097035);
         return 1;
      } else if (var0 == 3107) {
         int var18 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         String var28 = (String)field328[(field338 -= 1222866659) * 1375698635];
         classLN.method7127(var18, var28, 2075697419);
         return 1;
      } else if (var0 == 3108) {
         DynamicObject.field1679 -= 360123687;
         int var17 = field323[-324749371 * DynamicObject.field1679];
         int var27 = field323[1 + DynamicObject.field1679 * -324749371];
         int var33 = field323[-324749371 * DynamicObject.field1679 + 2];
         Widget var36 = classLY.method7375(classWK.field6691, var33, (byte)42);
         if (!client.field973 && classWK.field6691.method12157(var36, var17, var27, 1778987571)) {
            classBT.method1244(1195437783);
         }

         return 1;
      } else if (3109 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var16 = field323[-324749371 * DynamicObject.field1679];
         int var26 = field323[-324749371 * DynamicObject.field1679 + 1];
         Widget var32 = var2 ? classSZ.field6110 : TileItem.field1558;
         if (!client.field973 && classWK.field6691.method12157(var32, var16, var26, 1253683320)) {
            classBT.method1244(339616848);
         }

         return 1;
      } else if (3110 == var0) {
         classON.field4995 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else if (3111 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ClientPreferences.method2720(classAB.field122, -1315528093) ? 1 : 0;
         return 1;
      } else if (3112 == var0) {
         classAB.field122.method2721(field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1, -1930853351);
         return 1;
      } else if (var0 == 3113) {
         String var15 = (String)field328[(field338 -= 1222866659) * 1375698635];
         DynamicObject.field1679 -= 120041229;
         classUF.method11299(var15, (byte)13);
         return 1;
      } else if (var0 == 3114) {
         String var14 = (String)field328[(field338 -= 1222866659) * 1375698635];
         long var25 = 0L;
         if (classQE.method9498(var14, (byte)83)) {
            var25 = classDM.method3432(var14, 1668696346);
         }

         PacketBufferNode var35 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_COUNTDIALOG_LONG, client.packetWriter.isaacCipher, (byte)-37);
         var35.packetBuffer.method12987(var25);
         client.packetWriter.addNode(var35, -1301097035);
         return 1;
      } else if (var0 == 3115) {
         int var13 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         PacketBufferNode var24 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_OBJDIALOG, client.packetWriter.isaacCipher, (byte)-84);
         var24.packetBuffer.method12973(var13, -1542382992);
         client.packetWriter.addNode(var24, -1301097035);
         return 1;
      } else if (var0 == 3116) {
         int var12 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field338 -= -1849233978;
         String var4 = (String)field328[1375698635 * field338];
         String var5 = (String)field328[1375698635 * field338 + 1];
         if (var4.length() > 500) {
            return 1;
         } else if (var5.length() > 500) {
            return 1;
         } else {
            PacketBufferNode var6 = classEF.getPacketBufferNode(ClientPacket.BUG_REPORT, client.packetWriter.isaacCipher, (byte)32);
            var6.packetBuffer.method12973(1 + classAU.method712(var4, (byte)59) + classAU.method712(var5, (byte)63), -1542382992);
            Buffer.method12997(var6.packetBuffer, var4, (short)945);
            Buffer.method12997(var6.packetBuffer, var5, (short)28927);
            var6.packetBuffer.method13156(var12, (byte)28);
            client.packetWriter.addNode(var6, -1301097035);
            return 1;
         }
      } else if (3117 == var0) {
         DynamicObject.field1679 -= 120041229;
         return 1;
      } else if (var0 == 3118) {
         client.field858 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else if (var0 == 3119) {
         client.field851 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else if (var0 == 3120) {
         if (field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
            client.field852 = -1165804573 * (client.field852 * -1072700981 | 1);
         } else {
            client.field852 = (client.field852 * -1072700981 & -2) * -1165804573;
         }

         return 1;
      } else if (3121 == var0) {
         if (field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
            client.field852 = (-1072700981 * client.field852 | 2) * -1165804573;
         } else {
            client.field852 = -1165804573 * (-1072700981 * client.field852 & -3);
         }

         return 1;
      } else if (3122 == var0) {
         if (field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
            client.field852 = (-1072700981 * client.field852 | 4) * -1165804573;
         } else {
            client.field852 = (-1072700981 * client.field852 & -5) * -1165804573;
         }

         return 1;
      } else if (3123 == var0) {
         if (field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
            client.field852 = (-1072700981 * client.field852 | 8) * -1165804573;
         } else {
            client.field852 = (client.field852 * -1072700981 & -9) * -1165804573;
         }

         return 1;
      } else if (3124 == var0) {
         client.field852 = 0;
         return 1;
      } else if (var0 == 3125) {
         client.field842 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else if (3126 == var0) {
         client.field844 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else if (var0 == 3127) {
         classHH.method6056(field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1, 695540015);
         return 1;
      } else if (var0 == 3128) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classTT.method11166(2040093248) ? 1 : 0;
         return 1;
      } else if (var0 == 3129) {
         DynamicObject.field1679 -= 240082458;
         client.field841 = field323[-324749371 * DynamicObject.field1679] * 1702334145;
         client.field951 = field323[-324749371 * DynamicObject.field1679 + 1] * 1847803151;
         return 1;
      } else if (var0 == 3130) {
         DynamicObject.field1679 -= 240082458;
         return 1;
      } else if (var0 == 3131) {
         DynamicObject.field1679 -= 120041229;
         return 1;
      } else if (var0 == 3132) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 773246731 * classSA.field5897;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = IntProjection.field1938 * 8379747;
         return 1;
      } else if (3133 == var0) {
         DynamicObject.field1679 -= 120041229;
         return 1;
      } else if (var0 == 3134) {
         return 1;
      } else if (3135 == var0) {
         DynamicObject.field1679 -= 240082458;
         return 1;
      } else if (3136 == var0) {
         classWK.field6691.field6615 = 2138382953;
         classWK.field6691.field6616 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] * 1264941915;
         return 1;
      } else if (3137 == var0) {
         classWK.field6691.field6615 = -6067130;
         classWK.field6691.field6616 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] * 1264941915;
         return 1;
      } else if (3138 == var0) {
         classWK.field6691.field6615 = 0;
         return 1;
      } else if (3139 == var0) {
         classWK.field6691.field6615 = 2144450083;
         return 1;
      } else if (var0 == 3140) {
         classWK.field6691.field6615 = 2138382953;
         classWK.field6691.field6616 = (var2 ? classSZ.field6110.field4329 * -1163656551 : -1163656551 * TileItem.field1558.field4329) * 1264941915;
         return 1;
      } else if (var0 == 3141) {
         boolean var11 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         classAB.field122.method2727(var11, -1266866406);
         return 1;
      } else if (3142 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ClientPreferences.method2724(classAB.field122, (short)-13215) ? 1 : 0;
         return 1;
      } else if (3143 == var0) {
         boolean var10 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         client.field832 = var10;
         if (!var10) {
            classAB.field122.method2789("", 308295154);
         }

         return 1;
      } else if (3144 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field832 ? 1 : 0;
         return 1;
      } else if (var0 == 3145) {
         return 1;
      } else if (var0 == 3146) {
         boolean var9 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         ClientPreferences.method2736(classAB.field122, !var9, (byte)16);
         return 1;
      } else if (3147 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAB.field122.method2732((byte)4) ? 0 : 1;
         return 1;
      } else if (3148 == var0) {
         return 1;
      } else if (3149 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == 3150) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (3151 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (3152 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == 3153) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 2017820609 * classBF.field395;
         return 1;
      } else if (var0 == 3154) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classXW.method12952(-161447499);
         return 1;
      } else if (var0 == 3155) {
         field338 -= 1222866659;
         return 1;
      } else if (3156 == var0) {
         return 1;
      } else if (3157 == var0) {
         DynamicObject.field1679 -= 240082458;
         return 1;
      } else if (3158 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == 3159) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == 3160) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == 3161) {
         DynamicObject.field1679 -= 120041229;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (3162 == var0) {
         DynamicObject.field1679 -= 120041229;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (3163 == var0) {
         field338 -= 1222866659;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (3164 == var0) {
         DynamicObject.field1679 -= 120041229;
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         return 1;
      } else if (var0 == 3165) {
         DynamicObject.field1679 -= 120041229;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (3166 == var0) {
         DynamicObject.field1679 -= 240082458;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == 3167) {
         DynamicObject.field1679 -= 240082458;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == 3168) {
         DynamicObject.field1679 -= 240082458;
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         return 1;
      } else if (3169 == var0) {
         return 1;
      } else if (3170 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == 3171) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (3172 == var0) {
         DynamicObject.field1679 -= 120041229;
         return 1;
      } else if (var0 == 3173) {
         DynamicObject.field1679 -= 120041229;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (3174 == var0) {
         DynamicObject.field1679 -= 120041229;
         return 1;
      } else if (var0 == 3175) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (3176 == var0) {
         return 1;
      } else if (3177 == var0) {
         return 1;
      } else if (3178 == var0) {
         field338 -= 1222866659;
         return 1;
      } else if (3179 == var0) {
         return 1;
      } else if (3180 == var0) {
         field338 -= 1222866659;
         return 1;
      } else if (3181 == var0) {
         classBY.method1359(field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)0);
         return 1;
      } else if (var0 == 3182) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = Projectile.method1223(-779652836);
         return 1;
      } else if (var0 == 3185) {
         int var8 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classAB.field122.method2812(var8, 1818630591);
         return 1;
      } else if (var0 == 3186) {
         int var7 = classAB.field122.method2817((byte)0);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var7;
         return 1;
      } else if (var0 == 3189) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classDF.method3053(var3, (byte)0);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fs")
   static int method854(int var0, Script var1, boolean var2) {
      if (var0 == -618005324) {
         String var22 = (String)field328[(field338 -= 1222866659) * 1375698635];
         var22 = classUP.method11420(var22, User.method10179(-1559084298), field334, field333, (byte)0);
         classPH.method8883(0, "", var22, 1908192403);
         return 1;
      } else if (var0 == -392148703) {
         DynamicObject.field1679 -= 240082458;
         classCU.method2676(
            classMB.method7521(2009714515), field323[-324749371 * DynamicObject.field1679], field323[1 + -324749371 * DynamicObject.field1679], -1850371619
         );
         return 1;
      } else if (var0 == 3103) {
         if (!field335) {
            field330 = true;
         }

         return 1;
      } else if (var0 == 3104) {
         String var21 = (String)field328[(field338 -= 1222866659) * -34288447];
         int var31 = 0;
         if (IntProjection.method4078(var21, (byte)-1)) {
            var31 = classJF.method6360(var21, 727335811);
         }

         PacketBufferNode var34 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_COUNTDIALOG, client.packetWriter.isaacCipher, (byte)-25);
         var34.packetBuffer.method12979(var31, 1927854021);
         client.packetWriter.addNode(var34, -1301097035);
         return 1;
      } else if (var0 == 3105) {
         String var20 = (String)field328[(field338 -= 1222866659) * -389672296];
         PacketBufferNode var30 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_NAMEDIALOG, client.packetWriter.isaacCipher, (byte)-12);
         Buffer.method12971(var30.packetBuffer, var20.length() + 1, (byte)-128);
         Buffer.method12997(var30.packetBuffer, var20, (short)32232);
         client.packetWriter.addNode(var30, -1301097035);
         return 1;
      } else if (var0 == -849181594) {
         String var19 = (String)field328[(field338 -= 1134267864) * 1956476466];
         PacketBufferNode var29 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_STRINGDIALOG, client.packetWriter.isaacCipher, (byte)-37);
         Buffer.method12971(var29.packetBuffer, var19.length() + 1, (byte)-73);
         Buffer.method12997(var29.packetBuffer, var19, (short)12918);
         client.packetWriter.addNode(var29, -1301097035);
         return 1;
      } else if (var0 == 3107) {
         int var18 = field323[(DynamicObject.field1679 -= 120041229) * 338907362];
         String var28 = (String)field328[(field338 -= -337399187) * -778693487];
         classLN.method7127(var18, var28, 1880515327);
         return 1;
      } else if (var0 == 1351073233) {
         DynamicObject.field1679 -= 360123687;
         int var17 = field323[150607843 * DynamicObject.field1679];
         int var27 = field323[1 + DynamicObject.field1679 * -324749371];
         int var33 = field323[-324749371 * DynamicObject.field1679 + 2];
         Widget var36 = classLY.method7375(classWK.field6691, var33, (byte)92);
         if (!client.field973 && classWK.field6691.method12157(var36, var17, var27, 1131719793)) {
            classBT.method1244(1414141912);
         }

         return 1;
      } else if (3109 == var0) {
         DynamicObject.field1679 -= -1625310087;
         int var16 = field323[-324749371 * DynamicObject.field1679];
         int var26 = field323[-797265022 * DynamicObject.field1679 + 1];
         Widget var32 = var2 ? classSZ.field6110 : TileItem.field1558;
         if (!client.field973 && classWK.field6691.method12157(var32, var16, var26, 1231482592)) {
            classBT.method1244(165327204);
         }

         return 1;
      } else if (147460316 == var0) {
         classON.field4995 = field323[(DynamicObject.field1679 -= 19289072) * 2131096178] == 1;
         return 1;
      } else if (-30513325 == var0) {
         field323[(DynamicObject.field1679 += -1581521269) * -278136139 - 1] = ClientPreferences.method2720(classAB.field122, -1315528093) ? 1 : 0;
         return 1;
      } else if (177084460 == var0) {
         classAB.field122.method2721(field323[(DynamicObject.field1679 -= -1611592909) * -324749371] == 1, -452157761);
         return 1;
      } else if (var0 == -742716839) {
         String var15 = (String)field328[(field338 -= -187043756) * 1375698635];
         DynamicObject.field1679 -= 2074094000;
         classUF.method11299(var15, (byte)29);
         return 1;
      } else if (var0 == 3114) {
         String var14 = (String)field328[(field338 -= 1222866659) * -416683104];
         long var25 = 0L;
         if (classQE.method9498(var14, (byte)100)) {
            var25 = classDM.method3432(var14, 1668696346);
         }

         PacketBufferNode var35 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_COUNTDIALOG_LONG, client.packetWriter.isaacCipher, (byte)-71);
         var35.packetBuffer.method12987(var25);
         client.packetWriter.addNode(var35, -1301097035);
         return 1;
      } else if (var0 == 3115) {
         int var13 = field323[(DynamicObject.field1679 -= 887936200) * 23607326];
         PacketBufferNode var24 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_OBJDIALOG, client.packetWriter.isaacCipher, (byte)-25);
         var24.packetBuffer.method12973(var13, -1542382992);
         client.packetWriter.addNode(var24, -1301097035);
         return 1;
      } else if (var0 == 3116) {
         int var12 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field338 -= -1849233978;
         String var4 = (String)field328[1375698635 * field338];
         String var5 = (String)field328[-924020898 * field338 + 1];
         if (var4.length() > 500) {
            return 1;
         } else if (var5.length() > 500) {
            return 1;
         } else {
            PacketBufferNode var6 = classEF.getPacketBufferNode(ClientPacket.BUG_REPORT, client.packetWriter.isaacCipher, (byte)-27);
            var6.packetBuffer.method12973(1 + classAU.method712(var4, (byte)74) + classAU.method712(var5, (byte)102), -1542382992);
            Buffer.method12997(var6.packetBuffer, var4, (short)12966);
            Buffer.method12997(var6.packetBuffer, var5, (short)12908);
            var6.packetBuffer.method13156(var12, (byte)-35);
            client.packetWriter.addNode(var6, -1301097035);
            return 1;
         }
      } else if (1202691952 == var0) {
         DynamicObject.field1679 -= 120041229;
         return 1;
      } else if (var0 == 3118) {
         client.field858 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else if (var0 == 3119) {
         client.field851 = field323[(DynamicObject.field1679 -= -2041392387) * 93276386] == 1;
         return 1;
      } else if (var0 == 3120) {
         if (field323[(DynamicObject.field1679 -= 1442082298) * -324749371] == 1) {
            client.field852 = -1165804573 * (client.field852 * 1162564030 | 1);
         } else {
            client.field852 = (client.field852 * -1744177780 & 1105803488) * -2107182793;
         }

         return 1;
      } else if (-456383781 == var0) {
         if (field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
            client.field852 = (-1072700981 * client.field852 | 2) * -657243910;
         } else {
            client.field852 = -1165804573 * (-1072700981 * client.field852 & -1120730149);
         }

         return 1;
      } else if (934180531 == var0) {
         if (field323[(DynamicObject.field1679 -= 1081150301) * 806914442] == 1) {
            client.field852 = (-1072700981 * client.field852 | 4) * -1165804573;
         } else {
            client.field852 = (-290427305 * client.field852 & -5) * -1165804573;
         }

         return 1;
      } else if (3123 == var0) {
         if (field323[(DynamicObject.field1679 -= -1968943468) * -324749371] == 1) {
            client.field852 = (-1072700981 * client.field852 | 8) * 2136041746;
         } else {
            client.field852 = (client.field852 * -1072700981 & -2087052658) * -1165804573;
         }

         return 1;
      } else if (2108807377 == var0) {
         client.field852 = 0;
         return 1;
      } else if (var0 == 1493018886) {
         client.field842 = field323[(DynamicObject.field1679 -= 1341687463) * -324749371] == 1;
         return 1;
      } else if (3126 == var0) {
         client.field844 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else if (var0 == -516566573) {
         classHH.method6056(field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1, -994464469);
         return 1;
      } else if (var0 == 3128) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classTT.method11166(1026355357) ? 1 : 0;
         return 1;
      } else if (var0 == 3129) {
         DynamicObject.field1679 -= 240082458;
         client.field841 = field323[419169351 * DynamicObject.field1679] * -1406389943;
         client.field951 = field323[939374756 * DynamicObject.field1679 + 1] * 1847803151;
         return 1;
      } else if (var0 == 1649528509) {
         DynamicObject.field1679 -= 240082458;
         return 1;
      } else if (var0 == 3131) {
         DynamicObject.field1679 -= 1357139742;
         return 1;
      } else if (var0 == 971940003) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1222781785 * classSA.field5897;
         field323[(DynamicObject.field1679 += -960159106) * 2104860326 - 1] = IntProjection.field1938 * 8379747;
         return 1;
      } else if (3133 == var0) {
         DynamicObject.field1679 -= 120041229;
         return 1;
      } else if (var0 == 3134) {
         return 1;
      } else if (1555893595 == var0) {
         DynamicObject.field1679 -= -51607019;
         return 1;
      } else if (3136 == var0) {
         classWK.field6691.field6615 = 2138382953;
         classWK.field6691.field6616 = field323[(DynamicObject.field1679 -= 531716258) * -324749371] * -496782314;
         return 1;
      } else if (3137 == var0) {
         classWK.field6691.field6615 = -6067130;
         classWK.field6691.field6616 = field323[(DynamicObject.field1679 -= -1363313564) * -324749371] * -1184866675;
         return 1;
      } else if (3138 == var0) {
         classWK.field6691.field6615 = 0;
         return 1;
      } else if (3139 == var0) {
         classWK.field6691.field6615 = -1408041959;
         return 1;
      } else if (var0 == 3140) {
         classWK.field6691.field6615 = 2138382953;
         classWK.field6691.field6616 = (var2 ? classSZ.field6110.field4329 * -1163656551 : -1037791645 * TileItem.field1558.field4329) * -1711000138;
         return 1;
      } else if (var0 == 1883040211) {
         boolean var11 = field323[(DynamicObject.field1679 -= 120041229) * -1614732458] == 1;
         classAB.field122.method2727(var11, -1166183739);
         return 1;
      } else if (-1215732689 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ClientPreferences.method2724(classAB.field122, (short)9679) ? 1 : 0;
         return 1;
      } else if (3143 == var0) {
         boolean var10 = field323[(DynamicObject.field1679 -= -1682101612) * -1791386178] == 1;
         client.field832 = var10;
         if (!var10) {
            classAB.field122.method2789("", 594352223);
         }

         return 1;
      } else if (-691384840 == var0) {
         field323[(DynamicObject.field1679 += 487074148) * -324749371 - 1] = client.field832 ? 1 : 0;
         return 1;
      } else if (var0 == 3145) {
         return 1;
      } else if (var0 == 3146) {
         boolean var9 = field323[(DynamicObject.field1679 -= 1461892107) * 1454275336] == 1;
         ClientPreferences.method2736(classAB.field122, !var9, (byte)16);
         return 1;
      } else if (3147 == var0) {
         field323[(DynamicObject.field1679 += -1047908165) * 677401138 - 1] = classAB.field122.method2732((byte)86) ? 0 : 1;
         return 1;
      } else if (3148 == var0) {
         return 1;
      } else if (3149 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -1936478214 - 1] = 0;
         return 1;
      } else if (var0 == 1842160827) {
         field323[(DynamicObject.field1679 += -1081884763) * -1188847507 - 1] = 0;
         return 1;
      } else if (626774634 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * 867868257 - 1] = 0;
         return 1;
      } else if (3152 == var0) {
         field323[(DynamicObject.field1679 += 1720291959) * 273744096 - 1] = 0;
         return 1;
      } else if (var0 == 3153) {
         field323[(DynamicObject.field1679 += 120041229) * 1301880502 - 1] = 2017820609 * classBF.field395;
         return 1;
      } else if (var0 == 3154) {
         field323[(DynamicObject.field1679 += 2079175530) * -781478994 - 1] = classXW.method12952(993609810);
         return 1;
      } else if (var0 == 184170555) {
         field338 -= 1222866659;
         return 1;
      } else if (3156 == var0) {
         return 1;
      } else if (3157 == var0) {
         DynamicObject.field1679 -= -1000585773;
         return 1;
      } else if (3158 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -2501349 - 1] = 0;
         return 1;
      } else if (var0 == -650462938) {
         field323[(DynamicObject.field1679 += -1901399598) * 832995578 - 1] = 0;
         return 1;
      } else if (var0 == 3160) {
         field323[(DynamicObject.field1679 += 1023945825) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == 1479845283) {
         DynamicObject.field1679 -= 120041229;
         field323[(DynamicObject.field1679 += 1979471750) * -1780442071 - 1] = 0;
         return 1;
      } else if (-614676383 == var0) {
         DynamicObject.field1679 -= 2040711844;
         field323[(DynamicObject.field1679 += -51069822) * -324749371 - 1] = 0;
         return 1;
      } else if (1955371420 == var0) {
         field338 -= 1222866659;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (3164 == var0) {
         DynamicObject.field1679 -= 120041229;
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         return 1;
      } else if (var0 == 3165) {
         DynamicObject.field1679 -= 120041229;
         field323[(DynamicObject.field1679 += -707340074) * 1895191960 - 1] = 0;
         return 1;
      } else if (2033875127 == var0) {
         DynamicObject.field1679 -= 1143769727;
         field323[(DynamicObject.field1679 += 120041229) * 1934635904 - 1] = 0;
         return 1;
      } else if (var0 == 3167) {
         DynamicObject.field1679 -= 834732416;
         field323[(DynamicObject.field1679 += 120041229) * 1078542394 - 1] = 0;
         return 1;
      } else if (var0 == 3168) {
         DynamicObject.field1679 -= 240082458;
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += 1497527118) * -445824875 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += 1101160728) * 1593700569 - 1] = "";
         field328[(field338 += -2003305955) * 1375698635 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         return 1;
      } else if (419476442 == var0) {
         return 1;
      } else if (-1227528955 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == 726368503) {
         field323[(DynamicObject.field1679 += 1914993332) * -371814167 - 1] = 0;
         return 1;
      } else if (3172 == var0) {
         DynamicObject.field1679 -= 2107619218;
         return 1;
      } else if (var0 == 3173) {
         DynamicObject.field1679 -= 1252456942;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (-1467493109 == var0) {
         DynamicObject.field1679 -= -1931186385;
         return 1;
      } else if (var0 == 3175) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (3176 == var0) {
         return 1;
      } else if (372781252 == var0) {
         return 1;
      } else if (-795542422 == var0) {
         field338 -= -1451167057;
         return 1;
      } else if (-934132133 == var0) {
         return 1;
      } else if (-1482786002 == var0) {
         field338 -= 1222866659;
         return 1;
      } else if (422435736 == var0) {
         classBY.method1359(field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)0);
         return 1;
      } else if (var0 == 3182) {
         field323[(DynamicObject.field1679 += 120041229) * -836687496 - 1] = Projectile.method1223(-111354540);
         return 1;
      } else if (var0 == 3185) {
         int var8 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classAB.field122.method2812(var8, 1909728332);
         return 1;
      } else if (var0 == -661558345) {
         int var7 = classAB.field122.method2817((byte)0);
         field323[(DynamicObject.field1679 += -2038061729) * -1036422122 - 1] = var7;
         return 1;
      } else if (var0 == 3189) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classDF.method3053(var3, (byte)0);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fv")
   static int method855(int var0, Script var1, boolean var2) {
      if (var0 == -289876151) {
         String var22 = (String)field328[(field338 -= -1477441969) * 1375698635];
         var22 = classUP.method11420(var22, User.method10179(39086725), field334, field333, (byte)0);
         classPH.method8883(0, "", var22, 1710269087);
         return 1;
      } else if (var0 == 3101) {
         DynamicObject.field1679 -= 240082458;
         classCU.method2676(
            classMB.method7521(-916879969), field323[1481483818 * DynamicObject.field1679], field323[1 + 1527009716 * DynamicObject.field1679], 108538434
         );
         return 1;
      } else if (var0 == 3103) {
         if (!field335) {
            field330 = true;
         }

         return 1;
      } else if (var0 == 3104) {
         String var21 = (String)field328[(field338 -= 112755054) * 1375698635];
         int var31 = 0;
         if (IntProjection.method4078(var21, (byte)-1)) {
            var31 = classJF.method6360(var21, 384423123);
         }

         PacketBufferNode var34 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_COUNTDIALOG, client.packetWriter.isaacCipher, (byte)-68);
         var34.packetBuffer.method12979(var31, -641125360);
         client.packetWriter.addNode(var34, -1301097035);
         return 1;
      } else if (var0 == 3105) {
         String var20 = (String)field328[(field338 -= -561035424) * 1324751067];
         PacketBufferNode var30 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_NAMEDIALOG, client.packetWriter.isaacCipher, (byte)-36);
         Buffer.method12971(var30.packetBuffer, var20.length() + 1, (byte)-1);
         Buffer.method12997(var30.packetBuffer, var20, (short)5937);
         client.packetWriter.addNode(var30, -1301097035);
         return 1;
      } else if (var0 == 3106) {
         String var19 = (String)field328[(field338 -= -1674305625) * -322299931];
         PacketBufferNode var29 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_STRINGDIALOG, client.packetWriter.isaacCipher, (byte)22);
         Buffer.method12971(var29.packetBuffer, var19.length() + 1, (byte)-118);
         Buffer.method12997(var29.packetBuffer, var19, (short)19432);
         client.packetWriter.addNode(var29, -1301097035);
         return 1;
      } else if (var0 == 3107) {
         int var18 = field323[(DynamicObject.field1679 -= 1737869790) * -324749371];
         String var28 = (String)field328[(field338 -= -2121084442) * 1375698635];
         classLN.method7127(var18, var28, 1863812839);
         return 1;
      } else if (var0 == 33317833) {
         DynamicObject.field1679 -= 360123687;
         int var17 = field323[416751170 * DynamicObject.field1679];
         int var27 = field323[1 + DynamicObject.field1679 * -324749371];
         int var33 = field323[-324749371 * DynamicObject.field1679 + 2];
         Widget var36 = classLY.method7375(classWK.field6691, var33, (byte)25);
         if (!client.field973 && classWK.field6691.method12157(var36, var17, var27, 52432958)) {
            classBT.method1244(700090479);
         }

         return 1;
      } else if (-1317943259 == var0) {
         DynamicObject.field1679 -= 106532482;
         int var16 = field323[1540231023 * DynamicObject.field1679];
         int var26 = field323[726759763 * DynamicObject.field1679 + 1];
         Widget var32 = var2 ? classSZ.field6110 : TileItem.field1558;
         if (!client.field973 && classWK.field6691.method12157(var32, var16, var26, 98677519)) {
            classBT.method1244(-125047810);
         }

         return 1;
      } else if (274485320 == var0) {
         classON.field4995 = field323[(DynamicObject.field1679 -= 1274337130) * 1926488073] == 1;
         return 1;
      } else if (874261970 == var0) {
         field323[(DynamicObject.field1679 += -1299328800) * -324749371 - 1] = ClientPreferences.method2720(classAB.field122, -1315528093) ? 1 : 0;
         return 1;
      } else if (-1051994545 == var0) {
         classAB.field122.method2721(field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1, 472468650);
         return 1;
      } else if (var0 == 3113) {
         String var15 = (String)field328[(field338 -= -969585309) * -2102279861];
         DynamicObject.field1679 -= -2013388933;
         classUF.method11299(var15, (byte)75);
         return 1;
      } else if (var0 == -1040176433) {
         String var14 = (String)field328[(field338 -= 1222866659) * 1778294856];
         long var25 = 0L;
         if (classQE.method9498(var14, (byte)72)) {
            var25 = classDM.method3432(var14, 1668696346);
         }

         PacketBufferNode var35 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_COUNTDIALOG_LONG, client.packetWriter.isaacCipher, (byte)98);
         var35.packetBuffer.method12987(var25);
         client.packetWriter.addNode(var35, -1301097035);
         return 1;
      } else if (var0 == -508037556) {
         int var13 = field323[(DynamicObject.field1679 -= 120041229) * -248147288];
         PacketBufferNode var24 = classEF.getPacketBufferNode(ClientPacket.RESUME_P_OBJDIALOG, client.packetWriter.isaacCipher, (byte)15);
         var24.packetBuffer.method12973(var13, -1542382992);
         client.packetWriter.addNode(var24, -1301097035);
         return 1;
      } else if (var0 == -740523074) {
         int var12 = field323[(DynamicObject.field1679 -= -1725812762) * -324749371];
         field338 -= -1893362314;
         String var4 = (String)field328[1375698635 * field338];
         String var5 = (String)field328[1375698635 * field338 + 1];
         if (var4.length() > 500) {
            return 1;
         } else if (var5.length() > -1845980553) {
            return 1;
         } else {
            PacketBufferNode var6 = classEF.getPacketBufferNode(ClientPacket.BUG_REPORT, client.packetWriter.isaacCipher, (byte)45);
            var6.packetBuffer.method12973(1 + classAU.method712(var4, (byte)100) + classAU.method712(var5, (byte)79), -1542382992);
            Buffer.method12997(var6.packetBuffer, var4, (short)5898);
            Buffer.method12997(var6.packetBuffer, var5, (short)13819);
            var6.packetBuffer.method13156(var12, (byte)-20);
            client.packetWriter.addNode(var6, -1301097035);
            return 1;
         }
      } else if (3117 == var0) {
         DynamicObject.field1679 -= 120041229;
         return 1;
      } else if (var0 == 3118) {
         client.field858 = field323[(DynamicObject.field1679 -= 1712960444) * -324749371] == 1;
         return 1;
      } else if (var0 == -727615566) {
         client.field851 = field323[(DynamicObject.field1679 -= -171003164) * -1049866931] == 1;
         return 1;
      } else if (var0 == 1360521943) {
         if (field323[(DynamicObject.field1679 -= 1801796280) * -324749371] == 1) {
            client.field852 = -1472152151 * (client.field852 * 1846527184 | 1);
         } else {
            client.field852 = (client.field852 * 1276121658 & -351802720) * -1165804573;
         }

         return 1;
      } else if (3121 == var0) {
         if (field323[(DynamicObject.field1679 -= 120041229) * 1311656422] == 1) {
            client.field852 = (-1472767370 * client.field852 | 2) * -318241215;
         } else {
            client.field852 = -1165804573 * (-321527362 * client.field852 & -1484110652);
         }

         return 1;
      } else if (3122 == var0) {
         if (field323[(DynamicObject.field1679 -= -115377181) * -324749371] == 1) {
            client.field852 = (-1072700981 * client.field852 | 4) * -1165804573;
         } else {
            client.field852 = (-1150784997 * client.field852 & -53483536) * 1719353550;
         }

         return 1;
      } else if (-643554959 == var0) {
         if (field323[(DynamicObject.field1679 -= -29488366) * -324749371] == 1) {
            client.field852 = (-1072700981 * client.field852 | 8) * 174209631;
         } else {
            client.field852 = (client.field852 * -1072700981 & -9) * -1165804573;
         }

         return 1;
      } else if (1798246499 == var0) {
         client.field852 = 0;
         return 1;
      } else if (var0 == 1521592786) {
         client.field842 = field323[(DynamicObject.field1679 -= -1054805429) * 457685120] == 1;
         return 1;
      } else if (-369554941 == var0) {
         client.field844 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else if (var0 == -1307361867) {
         classHH.method6056(field323[(DynamicObject.field1679 -= 853974021) * -324749371] == 1, -1868034054);
         return 1;
      } else if (var0 == 1077158306) {
         field323[(DynamicObject.field1679 += -739133926) * -324749371 - 1] = classTT.method11166(347181846) ? 1 : 0;
         return 1;
      } else if (var0 == 3129) {
         DynamicObject.field1679 -= 240082458;
         client.field841 = field323[-340124618 * DynamicObject.field1679] * -1638506490;
         client.field951 = field323[-324749371 * DynamicObject.field1679 + 1] * -1358088805;
         return 1;
      } else if (var0 == 3130) {
         DynamicObject.field1679 -= -1954654887;
         return 1;
      } else if (var0 == 1808610215) {
         DynamicObject.field1679 -= 120041229;
         return 1;
      } else if (var0 == 1889266854) {
         field323[(DynamicObject.field1679 += -2083875658) * -324749371 - 1] = 773246731 * classSA.field5897;
         field323[(DynamicObject.field1679 += -2077730606) * -761171993 - 1] = IntProjection.field1938 * -673528367;
         return 1;
      } else if (-2143850409 == var0) {
         DynamicObject.field1679 -= 1210885803;
         return 1;
      } else if (var0 == 142074572) {
         return 1;
      } else if (-1015002453 == var0) {
         DynamicObject.field1679 -= 240082458;
         return 1;
      } else if (3136 == var0) {
         classWK.field6691.field6615 = -1032749085;
         classWK.field6691.field6616 = field323[(DynamicObject.field1679 -= 120041229) * -475227746] * 1966967337;
         return 1;
      } else if (3137 == var0) {
         classWK.field6691.field6615 = -6067130;
         classWK.field6691.field6616 = field323[(DynamicObject.field1679 -= -1964257405) * -324749371] * -497918902;
         return 1;
      } else if (3138 == var0) {
         classWK.field6691.field6615 = 0;
         return 1;
      } else if (2098890007 == var0) {
         classWK.field6691.field6615 = 1195841617;
         return 1;
      } else if (var0 == 265511802) {
         classWK.field6691.field6615 = 2138382953;
         classWK.field6691.field6616 = (var2 ? classSZ.field6110.field4329 * 1335336718 : -1163656551 * TileItem.field1558.field4329) * 950842765;
         return 1;
      } else if (var0 == 3141) {
         boolean var11 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         classAB.field122.method2727(var11, 778852785);
         return 1;
      } else if (3142 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ClientPreferences.method2724(classAB.field122, (short)-24503) ? 1 : 0;
         return 1;
      } else if (-895464879 == var0) {
         boolean var10 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         client.field832 = var10;
         if (!var10) {
            classAB.field122.method2789("", 444235511);
         }

         return 1;
      } else if (1806141385 == var0) {
         field323[(DynamicObject.field1679 += -82822542) * -324749371 - 1] = client.field832 ? 1 : 0;
         return 1;
      } else if (var0 == -791280256) {
         return 1;
      } else if (var0 == 3146) {
         boolean var9 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         ClientPreferences.method2736(classAB.field122, !var9, (byte)16);
         return 1;
      } else if (1975144916 == var0) {
         field323[(DynamicObject.field1679 += -1471743757) * -1148875769 - 1] = classAB.field122.method2732((byte)125) ? 0 : 1;
         return 1;
      } else if (1979039936 == var0) {
         return 1;
      } else if (-82784892 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * 38029294 - 1] = 0;
         return 1;
      } else if (var0 == 3150) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (534439074 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * 1542971428 - 1] = 0;
         return 1;
      } else if (-86014182 == var0) {
         field323[(DynamicObject.field1679 += 1433827950) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == 3153) {
         field323[(DynamicObject.field1679 += 807243459) * -1709023162 - 1] = -2052000177 * classBF.field395;
         return 1;
      } else if (var0 == 968860797) {
         field323[(DynamicObject.field1679 += 630374541) * -324749371 - 1] = classXW.method12952(-850557570);
         return 1;
      } else if (var0 == 3155) {
         field338 -= 1222866659;
         return 1;
      } else if (3156 == var0) {
         return 1;
      } else if (3157 == var0) {
         DynamicObject.field1679 -= 138542827;
         return 1;
      } else if (3158 == var0) {
         field323[(DynamicObject.field1679 += -959342581) * 941378495 - 1] = 0;
         return 1;
      } else if (var0 == 3159) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == -759792073) {
         field323[(DynamicObject.field1679 += 120041229) * 2095157232 - 1] = 0;
         return 1;
      } else if (var0 == 3161) {
         DynamicObject.field1679 -= -843114610;
         field323[(DynamicObject.field1679 += -1010423689) * -324749371 - 1] = 0;
         return 1;
      } else if (3162 == var0) {
         DynamicObject.field1679 -= -975183596;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (3163 == var0) {
         field338 -= 1183985988;
         field323[(DynamicObject.field1679 += -251416696) * -324749371 - 1] = 0;
         return 1;
      } else if (3164 == var0) {
         DynamicObject.field1679 -= 120041229;
         field328[(field338 += 1488528215) * 228133535 - 1] = "";
         return 1;
      } else if (var0 == -1707060913) {
         DynamicObject.field1679 -= -1573099100;
         field323[(DynamicObject.field1679 += -684618886) * -324749371 - 1] = 0;
         return 1;
      } else if (3166 == var0) {
         DynamicObject.field1679 -= -1747243688;
         field323[(DynamicObject.field1679 += 120041229) * -964329392 - 1] = 0;
         return 1;
      } else if (var0 == 3167) {
         DynamicObject.field1679 -= 240082458;
         field323[(DynamicObject.field1679 += -457528502) * 92258163 - 1] = 0;
         return 1;
      } else if (var0 == -932468388) {
         DynamicObject.field1679 -= 1797663729;
         field328[(field338 += 1222866659) * 1316928312 - 1] = "";
         field328[(field338 += 1078631537) * 424576914 - 1] = "";
         field328[(field338 += 1222866659) * -803677312 - 1] = "";
         field328[(field338 += 60994965) * -48788614 - 1] = "";
         field328[(field338 += 1222866659) * -866950826 - 1] = "";
         field328[(field338 += 1072406108) * 1375698635 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         field328[(field338 += 1222866659) * -328844811 - 1] = "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         return 1;
      } else if (556333788 == var0) {
         return 1;
      } else if (3170 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == 252017934) {
         field323[(DynamicObject.field1679 += 120041229) * 1900879166 - 1] = 0;
         return 1;
      } else if (3172 == var0) {
         DynamicObject.field1679 -= 120041229;
         return 1;
      } else if (var0 == -1450670727) {
         DynamicObject.field1679 -= 120041229;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (346309891 == var0) {
         DynamicObject.field1679 -= 120041229;
         return 1;
      } else if (var0 == 3175) {
         field323[(DynamicObject.field1679 += 154773727) * -324749371 - 1] = 0;
         return 1;
      } else if (-1410257512 == var0) {
         return 1;
      } else if (8687749 == var0) {
         return 1;
      } else if (-352406179 == var0) {
         field338 -= 1222866659;
         return 1;
      } else if (1394062994 == var0) {
         return 1;
      } else if (3180 == var0) {
         field338 -= 1222866659;
         return 1;
      } else if (1067521618 == var0) {
         classBY.method1359(field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)0);
         return 1;
      } else if (var0 == 106444713) {
         field323[(DynamicObject.field1679 += -1022633639) * -324749371 - 1] = Projectile.method1223(641815574);
         return 1;
      } else if (var0 == 3185) {
         int var8 = field323[(DynamicObject.field1679 -= 1580463506) * -324749371];
         classAB.field122.method2812(var8, 2065298207);
         return 1;
      } else if (var0 == 89659603) {
         int var7 = classAB.field122.method2817((byte)0);
         field323[(DynamicObject.field1679 += 133273781) * 1284359100 - 1] = var7;
         return 1;
      } else if (var0 == 8437439) {
         int var3 = field323[(DynamicObject.field1679 -= 1726943112) * -324749371];
         classDF.method3053(var3, (byte)0);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("eh")
   static int method824(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? classSZ.field6110 : TileItem.field1558;
      if (1500 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4281 * -508264285;
         return 1;
      } else if (858391740 == var0) {
         field323[(DynamicObject.field1679 += -43794492) * 1852023590 - 1] = 1570844829 * var3.field4257;
         return 1;
      } else if (-715206510 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -1986485507 - 1] = 1115597881 * var3.field4249;
         return 1;
      } else if (-82969828 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -1838295902 - 1] = 293773697 * var3.field4259;
         return 1;
      } else if (-713949272 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4289 ? 1 : 0;
         return 1;
      } else if (var0 == 1505) {
         field323[(DynamicObject.field1679 += 120041229) * 294518576 - 1] = 1506131289 * var3.field4342;
         return 1;
      } else if (var0 != 1506) {
         return 2;
      } else {
         int var4 = var3.field4342 * -364910032;
         if (var4 == -1) {
            classVV var5 = classWK.field6691;

            for (InterfaceParent var6 = (InterfaceParent)var5.field6613.method13375();
               null != var6;
               var6 = (InterfaceParent)IndexedObjectSet.method13401(var5.field6613)
            ) {
               if (var3.field4329 * 1722430912 >> 16 == var6.field5276 * 2023647411) {
                  var4 = (int)var6.field6552;
                  break;
               }
            }
         }

         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fk")
   static int method856(int var0, Script var1, boolean var2) {
      if (var0 == -1515301918) {
         DynamicObject.field1679 -= -954978487;
         GraphicsObject.field475
            .method10472(
               field323[DynamicObject.field1679 * 338922503],
               field323[124171473 * DynamicObject.field1679 + 1],
               field323[DynamicObject.field1679 * -324749371 + 2],
               (byte)0
            );
         return 1;
      } else if (var0 == 3201) {
         DynamicObject.field1679 -= -1277236338;
         int var18 = field323[DynamicObject.field1679 * -324749371];
         int var27 = field323[1 + 1163308807 * DynamicObject.field1679];
         int var36 = field323[2 + 1404232938 * DynamicObject.field1679];
         int var50 = field323[-644839921 * DynamicObject.field1679 + 3];
         int var55 = field323[4 + 1942811747 * DynamicObject.field1679];
         ArrayList var56 = new ArrayList();
         var56.add(var18);
         classRJ.method9998(var56, var27, var36, var50, var55, (byte)111);
         return 1;
      } else if (var0 == -767377621) {
         DynamicObject.field1679 -= 238287191;
         Script.method1148(field323[-324749371 * DynamicObject.field1679], field323[-2051207539 * DynamicObject.field1679 + 1], 503808878);
         return 1;
      } else if (3212 == var0 || -1459503273 == var0 || 3209 == var0 || 1832154558 == var0 || -1101496056 == var0 || var0 == 3205 || var0 == 3207) {
         classCB var17 = classCB.field638;
         classCU var26 = classCU.field1286;
         int var35 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (3212 == var0) {
            int var45 = field323[(DynamicObject.field1679 -= -792865584) * -594059941];
            var17 = (classCB)classOF.method8404(classAF.method335((byte)10), var45, -559588401);
            if (var17 == null) {
               throw new RuntimeException(String.format("Unrecognized device option %d", var45));
            }
         }

         if (var0 == 3213) {
            int var46 = field323[(DynamicObject.field1679 -= 326264475) * -324749371];
            var26 = (classCU)classOF.method8404(classHA.method5953((byte)-91), var46, 1071857938);
            if (var26 == null) {
               throw new RuntimeException(String.format("Unrecognized game option %d", var46));
            }
         }

         if (3209 == var0) {
            int var47 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            var17 = (classCB)classOF.method8404(classAF.method335((byte)83), var47, 731560967);
            if (var17 == null) {
               var26 = (classCU)classOF.method8404(classHA.method5953((byte)53), var47, 1482614602);
               if (var26 == null) {
                  throw new RuntimeException(String.format("Unrecognized client option %d", var47));
               }
            }
         } else if (var0 == -1917289284) {
            var17 = classCB.field643;
         } else if (3203 == var0) {
            var26 = classCU.field1290;
         } else if (var0 == 1699615345) {
            var26 = classCU.field1287;
         } else if (627113755 == var0) {
            var26 = classCU.field1289;
         }

         if (classCU.field1286 == var26) {
            switch (var17.field648 * -1086242044) {
               case 1:
                  classAB.field122.method2727(1 == var35, -1711485702);
                  break;
               case 2:
                  ClientPreferences.method2736(classAB.field122, var35 == 1, (byte)16);
                  break;
               case 3:
                  classAB.field122.method2743(var35 == 1, (byte)-8);
                  break;
               case 4:
                  if (var35 < 0) {
                     var35 = 0;
                  }

                  ClientPreferences.method2752(classAB.field122, var35, (byte)12);
                  break;
               case 5:
                  classBY.method1359(var35, (byte)0);
                  break;
               case 6:
                  classAB.field122.method2812(var35, 1262156121);
                  break;
               case 7:
                  classAB.field122.method2822(var35, 1357195072);
                  classEM.method3929((byte)-27);
                  break;
               case 8:
                  ClientPreferences.method2829(classAB.field122, var35 == 1, 6460006);
                  break;
               default:
                  String var48 = String.format("Unkown device option: %s.", var17);
                  throw new RuntimeException(var48);
            }
         } else {
            switch (-1228541282 * var26.field1292) {
               case 1:
                  classAB.field122.method2721(1 == var35, -1026584697);
                  break;
               case 2:
                  ClientPreferences.method2765(classAB.field122, var35, 1222866659);
                  classKL.method6494(-1268639308);
                  break;
               case 3:
                  ClientPreferences.method2774(classAB.field122, var35, -772949167);
                  classGI.method5464(-2129150758);
                  break;
               case 4:
                  classAB.field122.method2781(var35, (byte)32);
                  classDO.method3509((byte)54);
                  break;
               default:
                  String var49 = String.format("Unkown game option: %s.", var26);
                  throw new RuntimeException(var49);
            }
         }

         return 1;
      } else if (var0 == -705638474 || 1205826723 == var0 || var0 == 3210 || var0 == 3182 || -1567890211 == var0 || var0 == -370504878 || var0 == 1589225228) {
         classCB var16 = classCB.field638;
         classCU var25 = classCU.field1286;
         int var33 = 0;
         if (var0 == 1404574189) {
            int var40 = field323[(DynamicObject.field1679 -= 120041229) * -632567160];
            var16 = (classCB)classOF.method8404(classAF.method335((byte)106), var40, 1739298016);
            if (null == var16) {
               throw new RuntimeException(String.format("Unrecognized device option %d", var40));
            }
         }

         if (-1202393392 == var0) {
            int var41 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            var25 = (classCU)classOF.method8404(classHA.method5953((byte)-2), var41, -1939884175);
            if (var25 == null) {
               throw new RuntimeException(String.format("Unrecognized game option %d", var41));
            }
         }

         if (3210 == var0) {
            int var42 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            var16 = (classCB)classOF.method8404(classAF.method335((byte)3), var42, -1484828350);
            if (var16 == null) {
               var25 = (classCU)classOF.method8404(classHA.method5953((byte)12), var42, 553884502);
               if (null == var25) {
                  throw new RuntimeException(String.format("Unrecognized client option %d", var42));
               }
            }
         } else if (var0 == 3182) {
            var16 = classCB.field643;
         } else if (var0 == 3204) {
            var25 = classCU.field1290;
         } else if (3206 == var0) {
            var25 = classCU.field1287;
         } else if (3208 == var0) {
            var25 = classCU.field1289;
         }

         if (var25 == classCU.field1286) {
            switch (var16.field648 * 611340289) {
               case 1:
                  var33 = ClientPreferences.method2724(classAB.field122, (short)1419) ? 1 : 0;
                  break;
               case 2:
                  var33 = classAB.field122.method2732((byte)90) ? 1 : 0;
                  break;
               case 3:
                  var33 = classAB.field122.method2741(1910940360) ? 1 : 0;
                  break;
               case 4:
                  var33 = classAB.field122.method2750(58519005);
                  break;
               case 5:
                  var33 = Projectile.method1223(1020622774);
                  break;
               case 6:
                  var33 = classAB.field122.method2817((byte)0);
                  break;
               case 7:
                  var33 = (int)(classAB.field122.method2820(501289580) * 100.0F);
                  break;
               case 8:
                  var33 = ClientPreferences.method2824(classAB.field122, -6213655) ? 1 : 0;
                  break;
               default:
                  String var43 = String.format("Unkown device option: %s.", var16);
                  throw new RuntimeException(var43);
            }
         } else {
            switch (var25.field1292 * 1184393696) {
               case 1:
                  var33 = ClientPreferences.method2720(classAB.field122, -1315528093) ? 1 : 0;
                  break;
               case 2:
                  var33 = classMH.method7572((byte)11);
                  break;
               case 3:
                  var33 = classCA.method1396(-156373576);
                  break;
               case 4:
                  var33 = classEA.method3800((byte)89);
                  break;
               default:
                  String var44 = String.format("Unkown game option: %s.", var25);
                  throw new RuntimeException(var44);
            }
         }

         field323[(DynamicObject.field1679 += 3152976) * -324749371 - 1] = var33;
         return 1;
      } else if (1757167547 == var0) {
         return 1;
      } else if (3216 == var0) {
         int var15 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         int var24 = 0;
         classCB var32 = (classCB)classOF.method8404(classAF.method335((byte)94), var15, 1513285768);
         if (null != var32) {
            var24 = classCB.field638 != var32 ? 1 : 0;
         }

         field323[(DynamicObject.field1679 += 120041229) * -159313351 - 1] = var24;
         return 1;
      } else if (var0 == 3218) {
         int var14 = field323[(DynamicObject.field1679 -= 120041229) * -749848087];
         int var23 = 0;
         classCU var31 = (classCU)classOF.method8404(classHA.method5953((byte)-54), var14, 729514271);
         if (var31 != null) {
            var23 = classCU.field1286 != var31 ? 1 : 0;
         }

         field323[(DynamicObject.field1679 += -1581889807) * -324749371 - 1] = var23;
         return 1;
      } else if (73924566 == var0 || 3219 == var0) {
         classCB var13 = classCB.field638;
         classCU var22 = classCU.field1286;
         byte var29 = -1;
         int var38 = -1;
         if (222288651 == var0) {
            int var51 = field323[(DynamicObject.field1679 -= -1112803639) * -324749371];
            var13 = (classCB)classOF.method8404(classAF.method335((byte)55), var51, 976983177);
            if (null == var13) {
               throw new RuntimeException(String.format("Unrecognized device option %d", var51));
            }
         }

         if (3219 == var0) {
            int var52 = field323[(DynamicObject.field1679 -= -305322005) * -138987151];
            var22 = (classCU)classOF.method8404(classHA.method5953((byte)57), var52, -1088116772);
            if (null == var22) {
               throw new RuntimeException(String.format("Unrecognized game option %d", var52));
            }
         }

         if (classCU.field1286 == var22) {
            switch (var13.field648 * 611340289) {
               case 1:
               case 2:
               case 3:
                  var29 = 0;
                  var38 = 1;
                  break;
               case 4:
                  var29 = 0;
                  var38 = Integer.MAX_VALUE;
                  break;
               case 5:
                  var29 = 0;
                  var38 = -1876746551;
                  break;
               case 6:
                  var29 = 25;
                  var38 = -222517907;
                  break;
               default:
                  String var53 = String.format("Unkown device option: %s.", var13);
                  throw new RuntimeException(var53);
            }
         } else {
            switch (455947886 * var22.field1292) {
               case 1:
                  var29 = 0;
                  var38 = 1;
                  break;
               case 2:
               case 3:
               case 4:
                  var29 = 0;
                  var38 = -1463122084;
                  break;
               default:
                  String var54 = String.format("Unkown game option: %s.", var22);
                  throw new RuntimeException(var54);
            }
         }

         field323[(DynamicObject.field1679 += 405641716) * -324749371 - 1] = var29;
         field323[(DynamicObject.field1679 += 120041229) * -2007766175 - 1] = var38;
         return 1;
      } else if (var0 == -1357003030) {
         DynamicObject.field1679 -= 177050441;
         int var12 = field323[-1563465632 * DynamicObject.field1679];
         int var21 = field323[DynamicObject.field1679 * -324749371 + 1];
         classBK.method1118(var12, var21, (byte)77);
         return 1;
      } else if (3221 == var0) {
         DynamicObject.field1679 -= 720247374;
         int var11 = field323[DynamicObject.field1679 * 1997780422];
         int var20 = field323[1 + DynamicObject.field1679 * -324749371];
         int var28 = field323[2 + DynamicObject.field1679 * 1583061767];
         int var37 = field323[3 + DynamicObject.field1679 * 1811343955];
         int var7 = field323[4 + DynamicObject.field1679 * -324749371];
         int var8 = field323[5 + -324749371 * DynamicObject.field1679];
         ArrayList var9 = new ArrayList();
         var9.add(var11);
         var9.add(var20);
         classRJ.method9998(var9, var28, var37, var7, var8, (byte)-15);
         return 1;
      } else if (var0 == -2076977444) {
         DynamicObject.field1679 -= 480164916;
         int var10 = field323[-1268694353 * DynamicObject.field1679];
         int var19 = field323[DynamicObject.field1679 * 712732792 + 1];
         int var5 = field323[2 + DynamicObject.field1679 * -422532992];
         int var6 = field323[3 + DynamicObject.field1679 * -324749371];
         classIM.method6224(var10, var19, var5, var6, -1714082608);
         return 1;
      } else if (var0 == 1504967351) {
         String var3 = (String)field328[(field338 -= 1222866659) * 1375698635];
         String var4 = (String)field328[(field338 -= -529285433) * 326999825];
         classED.method3832(var4, var3, -1651054082);
         return 1;
      } else if (208954114 == var0) {
         Projection.method5024((byte)-16);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fx")
   static int method857(int var0, Script var1, boolean var2) {
      if (var0 == 302647986) {
         DynamicObject.field1679 -= 360123687;
         GraphicsObject.field475
            .method10472(
               field323[DynamicObject.field1679 * -324749371],
               field323[-2055310530 * DynamicObject.field1679 + 1],
               field323[DynamicObject.field1679 * -2081405323 + 2],
               (byte)0
            );
         return 1;
      } else if (var0 == 702169920) {
         DynamicObject.field1679 -= 600206145;
         int var18 = field323[DynamicObject.field1679 * -360143431];
         int var27 = field323[1 + -372641110 * DynamicObject.field1679];
         int var36 = field323[2 + -324749371 * DynamicObject.field1679];
         int var50 = field323[-324749371 * DynamicObject.field1679 + 3];
         int var55 = field323[4 + -324749371 * DynamicObject.field1679];
         ArrayList var56 = new ArrayList();
         var56.add(var18);
         classRJ.method9998(var56, var27, var36, var50, var55, (byte)40);
         return 1;
      } else if (var0 == 1280552648) {
         DynamicObject.field1679 -= -1492517209;
         Script.method1148(field323[-324749371 * DynamicObject.field1679], field323[-324749371 * DynamicObject.field1679 + 1], 1282490405);
         return 1;
      } else if (3212 == var0 || -1502682729 == var0 || 3209 == var0 || 3181 == var0 || 3203 == var0 || var0 == 3205 || var0 == 3207) {
         classCB var17 = classCB.field638;
         classCU var26 = classCU.field1286;
         int var35 = field323[(DynamicObject.field1679 -= 120041229) * -1901560155];
         if (3212 == var0) {
            int var45 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            var17 = (classCB)classOF.method8404(classAF.method335((byte)38), var45, 683989171);
            if (var17 == null) {
               throw new RuntimeException(String.format("Unrecognized device option %d", var45));
            }
         }

         if (var0 == 1940057150) {
            int var46 = field323[(DynamicObject.field1679 -= 120041229) * -1288026964];
            var26 = (classCU)classOF.method8404(classHA.method5953((byte)-4), var46, 2036344089);
            if (var26 == null) {
               throw new RuntimeException(String.format("Unrecognized game option %d", var46));
            }
         }

         if (-682395879 == var0) {
            int var47 = field323[(DynamicObject.field1679 -= 1780557036) * -324749371];
            var17 = (classCB)classOF.method8404(classAF.method335((byte)93), var47, 1246620177);
            if (var17 == null) {
               var26 = (classCU)classOF.method8404(classHA.method5953((byte)41), var47, -1439485081);
               if (var26 == null) {
                  throw new RuntimeException(String.format("Unrecognized client option %d", var47));
               }
            }
         } else if (var0 == 3181) {
            var17 = classCB.field643;
         } else if (-750785072 == var0) {
            var26 = classCU.field1290;
         } else if (var0 == 3205) {
            var26 = classCU.field1287;
         } else if (3207 == var0) {
            var26 = classCU.field1289;
         }

         if (classCU.field1286 == var26) {
            switch (var17.field648 * 611340289) {
               case 1:
                  classAB.field122.method2727(1 == var35, 1687483915);
                  break;
               case 2:
                  ClientPreferences.method2736(classAB.field122, var35 == 1, (byte)16);
                  break;
               case 3:
                  classAB.field122.method2743(var35 == 1, (byte)-65);
                  break;
               case 4:
                  if (var35 < 0) {
                     var35 = 0;
                  }

                  ClientPreferences.method2752(classAB.field122, var35, (byte)12);
                  break;
               case 5:
                  classBY.method1359(var35, (byte)0);
                  break;
               case 6:
                  classAB.field122.method2812(var35, 1796286122);
                  break;
               case 7:
                  classAB.field122.method2822(var35, 883149164);
                  classEM.method3929((byte)22);
                  break;
               case 8:
                  ClientPreferences.method2829(classAB.field122, var35 == 1, -1234853411);
                  break;
               default:
                  String var48 = String.format("Unkown device option: %s.", var17);
                  throw new RuntimeException(var48);
            }
         } else {
            switch (321038383 * var26.field1292) {
               case 1:
                  classAB.field122.method2721(1 == var35, 277104372);
                  break;
               case 2:
                  ClientPreferences.method2765(classAB.field122, var35, 1222866659);
                  classKL.method6494(-1741551696);
                  break;
               case 3:
                  ClientPreferences.method2774(classAB.field122, var35, -697395431);
                  classGI.method5464(-1932003976);
                  break;
               case 4:
                  classAB.field122.method2781(var35, (byte)-18);
                  classDO.method3509((byte)65);
                  break;
               default:
                  String var49 = String.format("Unkown game option: %s.", var26);
                  throw new RuntimeException(var49);
            }
         }

         return 1;
      } else if (var0 == 1145856143 || -1360819586 == var0 || var0 == 1949010545 || var0 == -193174035 || 3204 == var0 || var0 == 1545746678 || var0 == 3208) {
         classCB var16 = classCB.field638;
         classCU var25 = classCU.field1286;
         int var33 = 0;
         if (var0 == 1885964319) {
            int var40 = field323[(DynamicObject.field1679 -= 778293537) * -324749371];
            var16 = (classCB)classOF.method8404(classAF.method335((byte)15), var40, -1451521953);
            if (null == var16) {
               throw new RuntimeException(String.format("Unrecognized device option %d", var40));
            }
         }

         if (1875916644 == var0) {
            int var41 = field323[(DynamicObject.field1679 -= 120041229) * 1359833434];
            var25 = (classCU)classOF.method8404(classHA.method5953((byte)34), var41, -187442702);
            if (var25 == null) {
               throw new RuntimeException(String.format("Unrecognized game option %d", var41));
            }
         }

         if (-853485955 == var0) {
            int var42 = field323[(DynamicObject.field1679 -= 120041229) * -1152249800];
            var16 = (classCB)classOF.method8404(classAF.method335((byte)74), var42, -1521199075);
            if (var16 == null) {
               var25 = (classCU)classOF.method8404(classHA.method5953((byte)-57), var42, -403800819);
               if (null == var25) {
                  throw new RuntimeException(String.format("Unrecognized client option %d", var42));
               }
            }
         } else if (var0 == -1118071283) {
            var16 = classCB.field643;
         } else if (var0 == 3204) {
            var25 = classCU.field1290;
         } else if (442916381 == var0) {
            var25 = classCU.field1287;
         } else if (1115838615 == var0) {
            var25 = classCU.field1289;
         }

         if (var25 == classCU.field1286) {
            switch (var16.field648 * 1020574206) {
               case 1:
                  var33 = ClientPreferences.method2724(classAB.field122, (short)5808) ? 1 : 0;
                  break;
               case 2:
                  var33 = classAB.field122.method2732((byte)64) ? 1 : 0;
                  break;
               case 3:
                  var33 = classAB.field122.method2741(1728537705) ? 1 : 0;
                  break;
               case 4:
                  var33 = classAB.field122.method2750(1372561062);
                  break;
               case 5:
                  var33 = Projectile.method1223(588453874);
                  break;
               case 6:
                  var33 = classAB.field122.method2817((byte)0);
                  break;
               case 7:
                  var33 = (int)(classAB.field122.method2820(-1414306837) * 100.0F);
                  break;
               case 8:
                  var33 = ClientPreferences.method2824(classAB.field122, 1508916147) ? 1 : 0;
                  break;
               default:
                  String var43 = String.format("Unkown device option: %s.", var16);
                  throw new RuntimeException(var43);
            }
         } else {
            switch (var25.field1292 * 321038383) {
               case 1:
                  var33 = ClientPreferences.method2720(classAB.field122, -1315528093) ? 1 : 0;
                  break;
               case 2:
                  var33 = classMH.method7572((byte)11);
                  break;
               case 3:
                  var33 = classCA.method1396(-697612548);
                  break;
               case 4:
                  var33 = classEA.method3800((byte)-51);
                  break;
               default:
                  String var44 = String.format("Unkown game option: %s.", var25);
                  throw new RuntimeException(var44);
            }
         }

         field323[(DynamicObject.field1679 += 120041229) * 1608778938 - 1] = var33;
         return 1;
      } else if (-2106502831 == var0) {
         return 1;
      } else if (3216 == var0) {
         int var15 = field323[(DynamicObject.field1679 -= -1049299388) * 967794859];
         int var24 = 0;
         classCB var32 = (classCB)classOF.method8404(classAF.method335((byte)51), var15, -1821454951);
         if (null != var32) {
            var24 = classCB.field638 != var32 ? 1 : 0;
         }

         field323[(DynamicObject.field1679 += 120041229) * 1856274036 - 1] = var24;
         return 1;
      } else if (var0 == 3218) {
         int var14 = field323[(DynamicObject.field1679 -= 120041229) * -441495351];
         int var23 = 0;
         classCU var31 = (classCU)classOF.method8404(classHA.method5953((byte)-33), var14, -1280710712);
         if (var31 != null) {
            var23 = classCU.field1286 != var31 ? 1 : 0;
         }

         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var23;
         return 1;
      } else if (2137401294 == var0 || 397086184 == var0) {
         classCB var13 = classCB.field638;
         classCU var22 = classCU.field1286;
         byte var29 = -1;
         int var38 = -1;
         if (414614476 == var0) {
            int var51 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            var13 = (classCB)classOF.method8404(classAF.method335((byte)77), var51, 1710799107);
            if (null == var13) {
               throw new RuntimeException(String.format("Unrecognized device option %d", var51));
            }
         }

         if (3219 == var0) {
            int var52 = field323[(DynamicObject.field1679 -= 120041229) * -2070087204];
            var22 = (classCU)classOF.method8404(classHA.method5953((byte)-5), var52, 1412980345);
            if (null == var22) {
               throw new RuntimeException(String.format("Unrecognized game option %d", var52));
            }
         }

         if (classCU.field1286 == var22) {
            switch (var13.field648 * 611340289) {
               case 1:
               case 2:
               case 3:
                  var29 = 0;
                  var38 = 1;
                  break;
               case 4:
                  var29 = 0;
                  var38 = Integer.MAX_VALUE;
                  break;
               case 5:
                  var29 = 0;
                  var38 = -107661473;
                  break;
               case 6:
                  var29 = 25;
                  var38 = 90;
                  break;
               default:
                  String var53 = String.format("Unkown device option: %s.", var13);
                  throw new RuntimeException(var53);
            }
         } else {
            switch (-712498753 * var22.field1292) {
               case 1:
                  var29 = 0;
                  var38 = 1;
                  break;
               case 2:
               case 3:
               case 4:
                  var29 = 0;
                  var38 = 1100917215;
                  break;
               default:
                  String var54 = String.format("Unkown game option: %s.", var22);
                  throw new RuntimeException(var54);
            }
         }

         field323[(DynamicObject.field1679 += 2006170412) * -324749371 - 1] = var29;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var38;
         return 1;
      } else if (var0 == 65441519) {
         DynamicObject.field1679 -= -1881809068;
         int var12 = field323[-1264705452 * DynamicObject.field1679];
         int var21 = field323[DynamicObject.field1679 * 59335792 + 1];
         classBK.method1118(var12, var21, (byte)126);
         return 1;
      } else if (3221 == var0) {
         DynamicObject.field1679 -= 720247374;
         int var11 = field323[DynamicObject.field1679 * 1082866376];
         int var20 = field323[1 + DynamicObject.field1679 * -324749371];
         int var28 = field323[2 + DynamicObject.field1679 * -324749371];
         int var37 = field323[3 + DynamicObject.field1679 * -1704369667];
         int var7 = field323[4 + DynamicObject.field1679 * -324749371];
         int var8 = field323[5 + -324749371 * DynamicObject.field1679];
         ArrayList var9 = new ArrayList();
         var9.add(var11);
         var9.add(var20);
         classRJ.method9998(var9, var28, var37, var7, var8, (byte)86);
         return 1;
      } else if (var0 == 135838825) {
         DynamicObject.field1679 -= 480164916;
         int var10 = field323[918970539 * DynamicObject.field1679];
         int var19 = field323[DynamicObject.field1679 * -351892334 + 1];
         int var5 = field323[2 + DynamicObject.field1679 * 2089974028];
         int var6 = field323[3 + DynamicObject.field1679 * -324749371];
         classIM.method6224(var10, var19, var5, var6, -1555229242);
         return 1;
      } else if (var0 == 3228) {
         String var3 = (String)field328[(field338 -= 1222866659) * -1000260634];
         String var4 = (String)field328[(field338 -= -1887947447) * -364790018];
         classED.method3832(var4, var3, -1139443702);
         return 1;
      } else if (511161089 == var0) {
         Projection.method5024((byte)-26);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fr")
   static int method859(int var0, Script var1, boolean var2) {
      if (var0 == 3400) {
         DynamicObject.field1679 -= 240082458;
         int var9 = field323[289333612 * DynamicObject.field1679];
         int var11 = field323[1 + DynamicObject.field1679 * 1505604367];
         EnumComposition var12 = classKD.method6461(var9, 600675046);
         if (!var12.method8348('s', (byte)-57)) {
         }

         field328[(field338 += 1153108961) * 1375698635 - 1] = var12.method8330(var11, -1652195152);
         return 1;
      } else if (-1035948257 == var0) {
         DynamicObject.field1679 -= 1258966269;
         char var8 = (char)field323[DynamicObject.field1679 * -324749371];
         char var10 = (char)field323[1 + DynamicObject.field1679 * -324749371];
         int var5 = field323[630159643 * DynamicObject.field1679 + 2];
         int var6 = field323[3 + DynamicObject.field1679 * 870410646];
         EnumComposition var7 = classKD.method6461(var5, 1715104009);
         if (EnumComposition.method8345(var7, var8, 2027601827) && var7.method8348(var10, (byte)-124)) {
            if (var7.method8348('s', (byte)-7)) {
               field328[(field338 += 274061374) * -164456190 - 1] = var7.method8330(var6, -1652195152);
            } else if (var7.method8348('Ï', (byte)-14)) {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = EnumComposition.method8341(var7, var6, 1053954012);
            } else {
               field323[(DynamicObject.field1679 += 120041229) * 401569453 - 1] = var7.method8334(var6, -1739848449);
            }

            return 1;
         } else {
            if (var10 == 's') {
               field328[(field338 += -338450436) * 1375698635 - 1] = classKK.field3615;
            } else if (var10 == 1894626283) {
               field322[(classXT.field6939 += -962143642) * -1658275147 - 1] = 0L;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            }

            return 1;
         }
      } else if (var0 == 3411) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         EnumComposition var4 = classKD.method6461(var3, 1211207098);
         field323[(DynamicObject.field1679 += -1076118671) * -324749371 - 1] = var4.method8316(911735815);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ft")
   static int method860(int var0, Script var1, boolean var2) {
      if (var0 == 3400) {
         DynamicObject.field1679 -= 240082458;
         int var9 = field323[1049259472 * DynamicObject.field1679];
         int var11 = field323[1 + DynamicObject.field1679 * 946076226];
         EnumComposition var12 = classKD.method6461(var9, 825145559);
         if (!var12.method8348((char)1164425481, (byte)-120)) {
         }

         field328[(field338 += 948436073) * 626402277 - 1] = var12.method8330(var11, -1652195152);
         return 1;
      } else if (3408 == var0) {
         DynamicObject.field1679 -= 1980125310;
         char var8 = (char)field323[DynamicObject.field1679 * -1630408497];
         char var10 = (char)field323[1 + DynamicObject.field1679 * 855861099];
         int var5 = field323[-324749371 * DynamicObject.field1679 + 2];
         int var6 = field323[3 + DynamicObject.field1679 * -324749371];
         EnumComposition var7 = classKD.method6461(var5, 1423338115);
         if (EnumComposition.method8345(var7, var8, 1801552841) && var7.method8348(var10, (byte)-1)) {
            if (var7.method8348('s', (byte)-111)) {
               field328[(field338 += 1894401092) * 1375698635 - 1] = var7.method8330(var6, -1652195152);
            } else if (var7.method8348((char)387367948, (byte)-4)) {
               field322[(classXT.field6939 += 374197126) * 18294437 - 1] = EnumComposition.method8341(var7, var6, 2139405684);
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var7.method8334(var6, -1739848449);
            }

            return 1;
         } else {
            if (var10 == 's') {
               field328[(field338 += 1222866659) * 1811561467 - 1] = classKK.field3615;
            } else if (var10 == -67216954) {
               field322[(classXT.field6939 += 1060074914) * 18294437 - 1] = 0L;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            }

            return 1;
         }
      } else if (var0 == 897084542) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         EnumComposition var4 = classKD.method6461(var3, 241519440);
         field323[(DynamicObject.field1679 += 1731052377) * -324749371 - 1] = var4.method8316(-1010794235);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ff")
   static int method861(int var0, Script var1, boolean var2) {
      if (var0 == 3400) {
         DynamicObject.field1679 -= 240082458;
         int var9 = field323[-324749371 * DynamicObject.field1679];
         int var11 = field323[1 + DynamicObject.field1679 * -324749371];
         EnumComposition var12 = classKD.method6461(var9, 1163442156);
         if (!var12.method8348('s', (byte)-24)) {
         }

         field328[(field338 += 1222866659) * 1375698635 - 1] = var12.method8330(var11, -1652195152);
         return 1;
      } else if (3408 == var0) {
         DynamicObject.field1679 -= 480164916;
         char var8 = (char)field323[DynamicObject.field1679 * -324749371];
         char var10 = (char)field323[1 + DynamicObject.field1679 * -324749371];
         int var5 = field323[-324749371 * DynamicObject.field1679 + 2];
         int var6 = field323[3 + DynamicObject.field1679 * -324749371];
         EnumComposition var7 = classKD.method6461(var5, 1324897223);
         if (EnumComposition.method8345(var7, var8, 1846251033) && var7.method8348(var10, (byte)-17)) {
            if (var7.method8348('s', (byte)-76)) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = var7.method8330(var6, -1652195152);
            } else if (var7.method8348('Ï', (byte)-29)) {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = EnumComposition.method8341(var7, var6, 1559388767);
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var7.method8334(var6, -1739848449);
            }

            return 1;
         } else {
            if (var10 == 's') {
               field328[(field338 += 1222866659) * 1375698635 - 1] = classKK.field3615;
            } else if (var10 == 207) {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = 0L;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            }

            return 1;
         }
      } else if (var0 == 3411) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         EnumComposition var4 = classKD.method6461(var3, 347788879);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.method8316(-1406050384);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fe")
   static int method862(int var0, Script var1, boolean var2) {
      if (var0 == -1050677056) {
         DynamicObject.field1679 -= -644885714;
         int var9 = field323[-35622785 * DynamicObject.field1679];
         int var11 = field323[1 + DynamicObject.field1679 * -324749371];
         EnumComposition var12 = classKD.method6461(var9, 423300390);
         if (!var12.method8348('s', (byte)-13)) {
         }

         field328[(field338 += 1222866659) * 1375698635 - 1] = var12.method8330(var11, -1652195152);
         return 1;
      } else if (3408 == var0) {
         DynamicObject.field1679 -= 519486901;
         char var8 = (char)field323[DynamicObject.field1679 * -984109542];
         char var10 = (char)field323[1 + DynamicObject.field1679 * 1203609111];
         int var5 = field323[-324749371 * DynamicObject.field1679 + 2];
         int var6 = field323[3 + DynamicObject.field1679 * -45097507];
         EnumComposition var7 = classKD.method6461(var5, 1512572473);
         if (EnumComposition.method8345(var7, var8, 1681767150) && var7.method8348(var10, (byte)-91)) {
            if (var7.method8348((char)2061988436, (byte)-16)) {
               field328[(field338 += 1222866659) * -916032422 - 1] = var7.method8330(var6, -1652195152);
            } else if (var7.method8348('Ï', (byte)-47)) {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = EnumComposition.method8341(var7, var6, -613680677);
            } else {
               field323[(DynamicObject.field1679 += -366792534) * -324749371 - 1] = var7.method8334(var6, -1739848449);
            }

            return 1;
         } else {
            if (var10 == 's') {
               field328[(field338 += 1733036671) * -190687627 - 1] = classKK.field3615;
            } else if (var10 == 207) {
               field322[(classXT.field6939 += -1297854163) * 1539709905 - 1] = 0L;
            } else {
               field323[(DynamicObject.field1679 += -322463778) * -324749371 - 1] = 0;
            }

            return 1;
         }
      } else if (var0 == 57179743) {
         int var3 = field323[(DynamicObject.field1679 -= -58987395) * -338039396];
         EnumComposition var4 = classKD.method6461(var3, 976181433);
         field323[(DynamicObject.field1679 += 120041229) * 978516271 - 1] = var4.method8316(-2118148159);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fc")
   static int method863(int var0, Script var1, boolean var2) {
      if (-615168875 == var0) {
         int var5 = field323[(DynamicObject.field1679 -= 1525475746) * 1329616241];
         field323[(DynamicObject.field1679 += -542102844) * -324749371 - 1] = classFA.method4540(client.field931, var5, 717247857) ? 1 : 0;
         return 1;
      } else if (var0 == 1359114862) {
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -468492063];
         field323[(DynamicObject.field1679 += 120041229) * 1531629462 - 1] = client.field931.method4533(var4, -825597204) ? 1 : 0;
         return 1;
      } else if (var0 == 3502) {
         int var3 = field323[(DynamicObject.field1679 -= 868410998) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field931.method4543(var3, (byte)-57) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fm")
   static int method864(int var0, Script var1, boolean var2) {
      if (-466770990 == var0) {
         int var5 = field323[(DynamicObject.field1679 -= 120041229) * -911808669];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classFA.method4540(client.field931, var5, 317972675) ? 1 : 0;
         return 1;
      } else if (var0 == 3501) {
         int var4 = field323[(DynamicObject.field1679 -= -893111660) * 1002757669];
         field323[(DynamicObject.field1679 += -1815673152) * -324749371 - 1] = client.field931.method4533(var4, -535389767) ? 1 : 0;
         return 1;
      } else if (var0 == 1965341654) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 1258646919) * 1825044285 - 1] = client.field931.method4543(var3, (byte)-11) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("he")
   static int method907(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fw")
   static int method866(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gq")
   static int method867(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gb")
   static int method868(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gc")
   static int method874(int var0, Script var1, boolean var2) {
      if (var0 == -2011541060) {
         String var40 = (String)field328[(field338 -= 1222866659) * -1950208454];
         int var52 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field328[(field338 += 1373076047) * 1375698635 - 1] = var40 + var52;
         return 1;
      } else if (var0 == 4101) {
         field338 -= -1849233978;
         String var39 = (String)field328[field338 * 1375698635];
         String var51 = (String)field328[1 + field338 * 1375698635];
         field328[(field338 += 838827194) * 1756682492 - 1] = var39 + var51;
         return 1;
      } else if (var0 == 4102) {
         String var38 = (String)field328[(field338 -= 1222866659) * 1375698635];
         int var50 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field328[(field338 += 1222866659) * 1084359362 - 1] = var38 + classOJ.method8507(var50, true, (byte)-17);
         return 1;
      } else if (var0 == -1264662364) {
         String var37 = (String)field328[(field338 -= -1215057338) * 407544314];
         field328[(field338 += 1222866659) * 1375698635 - 1] = var37.toLowerCase();
         return 1;
      } else if (-2045168290 == var0) {
         int var36 = field323[(DynamicObject.field1679 -= 690088744) * -324749371];
         long var49 = 86400000L * (var36 + 11745L);
         field329.setTime(new Date(var49));
         int var63 = field329.get(5);
         int var67 = field329.get(2);
         int var69 = field329.get(1);
         field328[(field338 += 368077940) * 1375698635 - 1] = var63 + "-" + field320[var67] + "-" + var69;
         return 1;
      } else if (996068967 == var0) {
         int var35 = field323[(DynamicObject.field1679 -= 1053410963) * -1332636292];
         field328[(field338 += -435553674) * 1375698635 - 1] = Integer.toString(var35);
         return 1;
      } else if (-1069809246 == var0) {
         field338 -= -1849233978;
         field323[(DynamicObject.field1679 += 120041229) * -371470703 - 1] = classCH.method1500(
            Actor.method3081((String)field328[349788897 * field338], (String)field328[field338 * 1375698635 + 1], classLU.field4232, -202999127), 469144570
         );
         return 1;
      } else if (4108 == var0) {
         String var33 = (String)field328[(field338 -= 1222866659) * 1375698635];
         DynamicObject.field1679 -= 240082458;
         int var48 = field323[-324749371 * DynamicObject.field1679];
         int var58 = field323[-1739063298 * DynamicObject.field1679 + 1];
         byte[] var62 = classYO.field7023.method11867(var58, 0, -1851910635);
         Font var66 = new Font(var62);
         var33 = classUP.method11420(var33, User.method10179(-2099426208), field334, field333, (byte)0);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var66.method43(var33, var48);
         return 1;
      } else if (var0 == 4109) {
         String var31 = (String)field328[(field338 -= -1239590895) * 1375698635];
         DynamicObject.field1679 -= 240082458;
         int var47 = field323[-324749371 * DynamicObject.field1679];
         int var57 = field323[1 + DynamicObject.field1679 * -324749371];
         byte[] var61 = classYO.field7023.method11867(var57, 0, -774584571);
         Font var65 = new Font(var61);
         var31 = classUP.method11420(var31, User.method10179(-1903647600), field334, field333, (byte)0);
         field323[(DynamicObject.field1679 += -1980394416) * -458188253 - 1] = var65.method41(var31, var47);
         return 1;
      } else if (292130484 == var0) {
         field338 -= -1849233978;
         String var30 = (String)field328[field338 * 1375698635];
         String var46 = (String)field328[field338 * 1375698635 + 1];
         if (field323[(DynamicObject.field1679 -= -981391446) * -1548074870] == 1) {
            field328[(field338 += 1222866659) * 110672717 - 1] = var30;
         } else {
            field328[(field338 += 1242269825) * 902617816 - 1] = var46;
         }

         return 1;
      } else if (4111 == var0) {
         String var29 = (String)field328[(field338 -= -1758870076) * 1375698635];
         field328[(field338 += -1246578466) * 1375698635 - 1] = AbstractFont.method8(var29);
         return 1;
      } else if (4112 == var0) {
         String var28 = (String)field328[(field338 -= 1462355099) * 1375698635];
         int var45 = field323[(DynamicObject.field1679 -= 120041229) * -119892931];
         field328[(field338 += 452134284) * 1375698635 - 1] = var28 + (char)var45;
         return 1;
      } else if (4113 == var0) {
         int var27 = field323[(DynamicObject.field1679 -= 120041229) * 2099284670];
         field323[(DynamicObject.field1679 += 120041229) * -1591093929 - 1] = classCJ.method1573((char)var27, -2067018673) ? 1 : 0;
         return 1;
      } else if (var0 == 4114) {
         int var26 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -565104278 - 1] = classSN.method10532((char)var26, 222042789) ? 1 : 0;
         return 1;
      } else if (var0 == 4115) {
         int var25 = field323[(DynamicObject.field1679 -= 95973442) * 1914290401];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classTT.method11165((char)var25, -1666429688) ? 1 : 0;
         return 1;
      } else if (2124979869 == var0) {
         int var24 = field323[(DynamicObject.field1679 -= -1956303298) * -324749371];
         field323[(DynamicObject.field1679 += 441897315) * 752816633 - 1] = classEB.method3802((char)var24, (byte)-48) ? 1 : 0;
         return 1;
      } else if (var0 == 4117) {
         String var23 = (String)field328[(field338 -= 481709328) * 1701182008];
         if (null != var23) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var23.length();
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (4118 == var0) {
         String var22 = (String)field328[(field338 -= 1222866659) * -649139694];
         DynamicObject.field1679 -= 240082458;
         int var44 = field323[DynamicObject.field1679 * 2063580204];
         int var56 = field323[1 + DynamicObject.field1679 * -324749371];
         field328[(field338 += 389980183) * 1268110044 - 1] = var22.substring(var44, var56);
         return 1;
      } else if (-1795649117 == var0) {
         String var20 = (String)field328[(field338 -= 1222866659) * 1375698635];
         var20 = classUP.method11420(var20, User.method10179(-1800085983), field334, field333, (byte)0);
         StringBuilder var43 = new StringBuilder(var20.length());
         boolean var55 = false;

         for (int var60 = 0; var60 < var20.length(); var60++) {
            char var64 = var20.charAt(var60);
            if (var64 == '<') {
               var55 = true;
            } else if ('>' == var64) {
               var55 = false;
            } else if ('@' == var64) {
               int var68 = var20.indexOf(864113149, 1 + var60);
               if (var68 != -1) {
                  var60 = var68;
               }
            } else if (!var55) {
               var43.append(var64);
            }
         }

         field328[(field338 += 1222866659) * -391053666 - 1] = var43.toString();
         return 1;
      } else if (4120 == var0) {
         String var19 = (String)field328[(field338 -= -915675485) * -1200542046];
         int var42 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 615080190) * -324749371 - 1] = var19.indexOf(var42);
         return 1;
      } else if (-1030838038 == var0) {
         field338 -= -1849233978;
         String var18 = (String)field328[field338 * -1669726033];
         String var41 = (String)field328[field338 * 1375698635 + 1];
         int var54 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var18.indexOf(var41, var54);
         return 1;
      } else if (var0 == 4122) {
         String var17 = (String)field328[(field338 -= -282724527) * -758974008];
         field328[(field338 += 1222866659) * 1198975202 - 1] = var17.toUpperCase();
         return 1;
      } else if (var0 == 4123) {
         field338 -= -626367319;
         String var16 = (String)field328[1375698635 * field338];
         String var4 = (String)field328[1375698635 * field338 + 1];
         String var53 = (String)field328[2 + -1841547937 * field338];
         Player var59 = classMB.method7521(-1129463688);
         if (null != var59 && var59.field1285 != null) {
            switch (var59.field1285.field4093 * -513083879) {
               case 0:
                  field328[(field338 += 39503747) * 1375698635 - 1] = var16;
                  break;
               case 1:
                  field328[(field338 += 854426047) * -1010378998 - 1] = var4;
                  break;
               case 2:
               default:
                  field328[(field338 += 1222866659) * 1375698635 - 1] = var53;
            }

            return 1;
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var53;
            return 1;
         }
      } else if (4124 == var0) {
         Player var15 = classMB.method7521(-1806569421);
         if (var15 != null && var15.field1285 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -1564411719 - 1] = var15.field1285.field4093 * -513083879;
         } else {
            field323[(DynamicObject.field1679 += 679292547) * -741279725 - 1] = -1;
         }

         return 1;
      } else if (var0 == 638087954) {
         long var14 = field322[(classXT.field6939 -= -848574705) * -608793324];
         field328[(field338 += 1222866659) * -270934553 - 1] = Long.toString(var14);
         return 1;
      } else if (4126 != var0) {
         if (var0 == 4127) {
            String var13 = (String)field328[(field338 -= 1222866659) * 1697612744];

            try {
               field323[(DynamicObject.field1679 += -821979446) * -1459613187 - 1] = Integer.parseInt(var13);
               field323[(DynamicObject.field1679 += -373669983) * -324749371 - 1] = 1;
            } catch (NumberFormatException var12) {
               field323[(DynamicObject.field1679 += 120041229) * -2090055014 - 1] = 0;
               field323[(DynamicObject.field1679 += 1001639228) * 1276676932 - 1] = 0;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         long var3 = field322[(classXT.field6939 -= -1297854163) * 18294437];
         String var5 = (String)field328[(field338 -= 1222866659) * 2135900792];
         String var6;
         if (var3 == 0L) {
            var6 = "0";
         } else if (!var5.isEmpty()) {
            boolean var7 = var3 < 0L;
            long var8 = var7 ? -var3 : var3;
            StringBuilder var10 = new StringBuilder();

            for (int var11 = 1; var8 > 0L; var11++) {
               var10.insert(0, var8 % 10L);
               var8 /= 10L;
               if (var8 > 0L && 0 == var11 % 3) {
                  var10.insert(0, ",");
               }
            }

            if (var7) {
               var10.insert(0, '-');
            }

            var6 = var10.toString();
         } else {
            var6 = Long.toString(var3);
         }

         field328[(field338 += 1128742049) * -1066958710 - 1] = var6;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fj")
   static int method843(int var0, Script var1, boolean var2) {
      Widget var3 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)120);
      if (var0 == 2500) {
         field323[(DynamicObject.field1679 += 1753748146) * -324749371 - 1] = var3.field4281 * 744286069;
         return 1;
      } else if (1441889476 == var0) {
         field323[(DynamicObject.field1679 += -648447841) * 1602759628 - 1] = 1113427791 * var3.field4257;
         return 1;
      } else if (var0 == 1064610882) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4249 * -282414687;
         return 1;
      } else if (1773036068 == var0) {
         field323[(DynamicObject.field1679 += -1650943532) * -979798882 - 1] = 293773697 * var3.field4259;
         return 1;
      } else if (var0 == 2504) {
         field323[(DynamicObject.field1679 += 49008003) * -841743065 - 1] = var3.field4289 ? 1 : 0;
         return 1;
      } else if (2505 == var0) {
         field323[(DynamicObject.field1679 += 867552760) * 341006041 - 1] = var3.field4342 * 719107682;
         return 1;
      } else if (2506 != var0) {
         return 2;
      } else {
         int var4 = var3.field4342 * -1502647899;
         if (-1 == var4) {
            classVV var5 = classWK.field6691;

            for (InterfaceParent var6 = (InterfaceParent)var5.field6613.method13375();
               null != var6;
               var6 = (InterfaceParent)IndexedObjectSet.method13401(var5.field6613)
            ) {
               if (-1163656551 * var3.field4329 >> 16 == var6.field5276 * 2023647411) {
                  var4 = (int)var6.field6552;
                  break;
               }
            }
         }

         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("go")
   static int method870(int var0, Script var1, boolean var2) {
      if (132696560 == var0) {
         if (null != classBM.field513) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
            classNJ.field4678 = classBM.field513;
         } else {
            field323[(DynamicObject.field1679 += 2017306686) * 664477156 - 1] = 0;
         }

         return 1;
      } else if (3801 == var0) {
         int var18 = field323[(DynamicObject.field1679 -= -2051909340) * -379252066];
         if (client.field865[var18] != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
            classNJ.field4678 = client.field865[var18];
         } else {
            field323[(DynamicObject.field1679 += 1475599019) * -1025722067 - 1] = 0;
         }

         return 1;
      } else if (var0 == -1295693628) {
         field328[(field338 += 996391911) * -892108577 - 1] = classNJ.field4678.field3016;
         return 1;
      } else if (var0 == 3803) {
         field323[(DynamicObject.field1679 += -286827558) * -324749371 - 1] = classNJ.field4678.field3034 ? 1 : 0;
         return 1;
      } else if (var0 == 3804) {
         field323[(DynamicObject.field1679 += 1778501046) * -324749371 - 1] = classNJ.field4678.field3023;
         return 1;
      } else if (3805 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * 1881367970 - 1] = classNJ.field4678.field3025;
         return 1;
      } else if (var0 == 3806) {
         field323[(DynamicObject.field1679 += 120041229) * -1250793670 - 1] = classNJ.field4678.field3024;
         return 1;
      } else if (var0 == 3807) {
         field323[(DynamicObject.field1679 += 1332113111) * -1305835373 - 1] = classNJ.field4678.field3019;
         return 1;
      } else if (-1034891576 == var0) {
         field323[(DynamicObject.field1679 += 518286187) * 546522547 - 1] = classNJ.field4678.field3028 * -2004292043;
         return 1;
      } else if (1411206972 == var0) {
         int var17 = field323[(DynamicObject.field1679 -= -8423373) * -324749371];
         field328[(field338 += 1222866659) * 268915703 - 1] = classNJ.field4678.field3043[var17];
         return 1;
      } else if (var0 == 1557436312) {
         int var16 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -1008902912 - 1] = classNJ.field4678.field3037[var16];
         return 1;
      } else if (var0 == 3812) {
         field323[(DynamicObject.field1679 += 120041229) * 365537226 - 1] = classNJ.field4678.field3027 * -845393113;
         return 1;
      } else if (var0 == 3813) {
         int var15 = field323[(DynamicObject.field1679 -= 1916623855) * -324749371];
         field328[(field338 += -1237298688) * -1339603198 - 1] = classNJ.field4678.field3044[var15];
         return 1;
      } else if (3814 == var0) {
         DynamicObject.field1679 -= 360123687;
         int var14 = field323[251523756 * DynamicObject.field1679];
         int var20 = field323[1 + DynamicObject.field1679 * -324749371];
         int var21 = field323[DynamicObject.field1679 * -1860728311 + 2];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ClanSettings.method6244(classNJ.field4678, var14, var20, var21, -2112917583);
         return 1;
      } else if (var0 == 1162062959) {
         field323[(DynamicObject.field1679 += -456845311) * 1913605908 - 1] = classNJ.field4678.field3014 * -577292071;
         return 1;
      } else if (var0 == -757512595) {
         field323[(DynamicObject.field1679 += 120041229) * -289951926 - 1] = -1725108575 * classNJ.field4678.field3017;
         return 1;
      } else if (var0 == 723349285) {
         field323[(DynamicObject.field1679 += 120041229) * 1310172995 - 1] = classBE.method993(
            classNJ.field4678, (String)field328[(field338 -= 1222866659) * -1371607396], -1899615001
         );
         return 1;
      } else if (3818 == var0) {
         field323[DynamicObject.field1679 * -324749371 - 1] = classNJ.field4678.method6249((byte)-53)[field323[DynamicObject.field1679 * -324749371 - 1]];
         return 1;
      } else if (var0 == 3819) {
         DynamicObject.field1679 -= 240082458;
         int var13 = field323[-869718859 * DynamicObject.field1679];
         int var19 = field323[-324749371 * DynamicObject.field1679 + 1];
         classVX.method12263(var19, var13, (byte)85);
         return 1;
      } else if (var0 == 736123417) {
         int var12 = field323[(DynamicObject.field1679 -= 2036056741) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -339422958 - 1] = classNJ.field4678.field3039[var12];
         return 1;
      } else {
         if (3821 == var0) {
            DynamicObject.field1679 -= 360123687;
            int var3 = field323[DynamicObject.field1679 * -324749371];
            boolean var4 = field323[1 + DynamicObject.field1679 * -324749371] == 1;
            int var5 = field323[DynamicObject.field1679 * -1507727305 + 2];
            VarbitComposition.method9217(var5, var3, var4, 494176769);
         }

         if (965622429 == var0) {
            int var11 = field323[(DynamicObject.field1679 -= 529226516) * -440876801];
            field323[(DynamicObject.field1679 += -1268257873) * -324749371 - 1] = classNJ.field4678.field3045[var11] ? 1 : 0;
            return 1;
         } else if (var0 == 1588226414) {
            if (classKA.field3513 != null) {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
               classPO.field5368 = classKA.field3513;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -453304659 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3851) {
            int var10 = field323[(DynamicObject.field1679 -= 120041229) * -1254156238];
            if (null != client.field866[var10]) {
               field323[(DynamicObject.field1679 += -636779309) * 1659018406 - 1] = 1;
               classPO.field5368 = client.field866[var10];
               classHU.field2891 = 1507670665 * var10;
            } else {
               field323[(DynamicObject.field1679 += -531451263) * -324749371 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3852) {
            field328[(field338 += 854486593) * 1375698635 - 1] = classPO.field5368.field2948;
            return 1;
         } else if (3853 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classPO.field5368.field2950;
            return 1;
         } else if (3854 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classPO.field5368.field2949;
            return 1;
         } else if (3855 == var0) {
            field323[(DynamicObject.field1679 += -1835582725) * -324749371 - 1] = ClanChannel.method6183(classPO.field5368, (byte)27);
            return 1;
         } else if (var0 == 530447696) {
            int var9 = field323[(DynamicObject.field1679 -= 120041229) * -357350472];
            field328[(field338 += 895027635) * -1093302217 - 1] = ((ClanChannelMember)classPO.field5368.field2955.get(var9)).field2846.method164(1298230403);
            return 1;
         } else if (3857 == var0) {
            int var8 = field323[(DynamicObject.field1679 -= -726149497) * 790105001];
            field323[(DynamicObject.field1679 += 1612238747) * 125250740 - 1] = ((ClanChannelMember)classPO.field5368.field2955.get(var8)).field2841;
            return 1;
         } else if (-441629216 == var0) {
            int var7 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ((ClanChannelMember)classPO.field5368.field2955.get(var7)).field2842
               * 1467325224;
            return 1;
         } else if (3859 == var0) {
            int var6 = field323[(DynamicObject.field1679 -= 120041229) * 256962468];
            Message.method1496(746875014 * classHU.field2891, var6, 2145492734);
            return 1;
         } else if (var0 == 3860) {
            field323[(DynamicObject.field1679 += 120041229) * 1247914307 - 1] = classPO.field5368
               .method6186((String)field328[(field338 -= 1222866659) * 1375698635], (byte)33);
            return 1;
         } else if (-1446216900 == var0) {
            field323[DynamicObject.field1679 * 319963753 - 1] = ClanChannel.method6169(classPO.field5368, -1672774064)[field323[299164227
                  * DynamicObject.field1679
               - 1]];
            return 1;
         } else if (-1395395486 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != classOH.field4871 ? 1 : 0;
            return 1;
         } else {
            return 2;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("dq")
   static int method810(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)77);
      } else {
         var3 = var2 ? classSZ.field6110 : TileItem.field1558;
      }

      if (1200 == var0 || var0 == 1205 || var0 == 1212) {
         DynamicObject.field1679 -= 240082458;
         int var11 = field323[DynamicObject.field1679 * -324749371];
         int var14 = field323[DynamicObject.field1679 * -324749371 + 1];
         var3.field4319 = 1321867761 * var11;
         var3.field4344 = 911947905 * var14;
         ItemComposition var16 = classOB.method8299(var11, (byte)-51);
         var3.field4356 = -882581749 * var16.field5035;
         var3.field4292 = var16.field5036 * -1704932525;
         var3.field4294 = var16.field5054 * -2019216183;
         var3.field4290 = 141623689 * var16.field5038;
         var3.field4291 = -614150625 * var16.field5039;
         var3.field4338 = var16.field5034 * -379927707;
         if (var0 == 1205) {
            var3.field4299 = 0;
         } else if (var0 == 1212 | 1 == 1633663665 * var16.field5055) {
            var3.field4299 = -349833341;
         } else {
            var3.field4299 = -699666682;
         }

         if (var3.field4296 * 613100595 > 0) {
            var3.field4338 = var3.field4338 * -746149408 / (613100595 * var3.field4296) * 1556726191;
         } else if (var3.field4255 * 1523460725 > 0) {
            var3.field4338 = var3.field4338 * -746149408 / (var3.field4255 * 1523460725) * 1556726191;
         }

         return 1;
      } else if (1201 == var0) {
         var3.field4333 = 1312656782;
         var3.field4374 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] * 434741949;
         return 1;
      } else if (var0 == 1202) {
         var3.field4333 = 1968985173;
         Player var10 = classMB.method7521(-55599338);
         var3.field4374 = (var10 != null ? var10.field1285.method6707(170077571) : -1) * 434741949;
         return 1;
      } else if (var0 == 1207) {
         boolean var9 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         Player var13 = classMB.method7521(1037813251);
         PlayerComposition var15 = null != var13 ? var13.field1285 : null;
         Widget.method7306(var3, var15, var9, (byte)25);
         return 1;
      } else if (1208 == var0) {
         int var8 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (var3.field4358 == null) {
            throw new RuntimeException("");
         } else {
            PlayerComposition.method6726(var3.field4358, var8, 967173277);
            return 1;
         }
      } else if (var0 == 1209) {
         DynamicObject.field1679 -= 240082458;
         int var7 = field323[-324749371 * DynamicObject.field1679];
         int var12 = field323[-324749371 * DynamicObject.field1679 + 1];
         if (var3.field4358 == null) {
            throw new RuntimeException("");
         } else {
            var3.field4358.method6723(var7, var12, -1832772040);
            return 1;
         }
      } else if (var0 == 1210) {
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (var3.field4358 == null) {
            throw new RuntimeException("");
         } else {
            Player var5 = classMB.method7521(-1674717959);
            int var6 = null != var5 ? var5.field1285.field4094 * 1705409403 : 0;
            var3.field4358.method6716(var6, var4, 1836660388);
            return 1;
         }
      } else if (var0 == 1214) {
         var3.field4333 = 955659832;
         var3.field4374 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] * 434741949;
         return 1;
      } else if (1215 == var0) {
         var3.field4333 = 1611988223;
         var3.field4374 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] * 434741949;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ho")
   static int method904(int var0, Script var1, boolean var2) {
      if (6809 == var0) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -859874270];
         classOM var4 = classMU.method7729(var3, 1555084904);
         field328[(field338 += 1222866659) * 1375698635 - 1] = null != var4 ? var4.method8590((short)-9902) : "";
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gm")
   static int method878(int var0, Script var1, boolean var2) {
      if (5000 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 2102667627 * client.field870;
         return 1;
      } else if (5001 == var0) {
         DynamicObject.field1679 -= 360123687;
         client.field870 = field323[-324749371 * DynamicObject.field1679] * -1071072445;
         classBJ.field483 = classWN.method12603(field323[1 + -324749371 * DynamicObject.field1679], 2099439544);
         if (classBJ.field483 == null) {
            classBJ.field483 = classZF.field7179;
         }

         client.field843 = field323[773937533 * DynamicObject.field1679 + 2] * -617530642;
         PacketBufferNode var20 = classEF.getPacketBufferNode(ClientPacket.SET_CHATFILTERSETTINGS, client.packetWriter.isaacCipher, (byte)84);
         Buffer.method12971(var20.packetBuffer, client.field870 * 2102667627, (byte)-108);
         Buffer.method12971(var20.packetBuffer, classBJ.field483.field7181 * -1382377909, (byte)-30);
         Buffer.method12971(var20.packetBuffer, 960234197 * client.field843, (byte)-89);
         client.packetWriter.addNode(var20, -1301097035);
         return 1;
      } else if (5002 == var0) {
         String var19 = (String)field328[(field338 -= 1222866659) * 46118413];
         DynamicObject.field1679 -= 240082458;
         int var28 = field323[1539784292 * DynamicObject.field1679];
         int var33 = field323[-324749371 * DynamicObject.field1679 + 1];
         PacketBufferNode var35 = classEF.getPacketBufferNode(ClientPacket.SEND_SNAPSHOT, client.packetWriter.isaacCipher, (byte)-5);
         Buffer.method12971(var35.packetBuffer, classAU.method712(var19, (byte)92) + 2, (byte)-60);
         Buffer.method12997(var35.packetBuffer, var19, (short)9353);
         Buffer.method12971(var35.packetBuffer, var28 - 1, (byte)-26);
         Buffer.method12971(var35.packetBuffer, var33, (byte)-7);
         client.packetWriter.addNode(var35, -1301097035);
         return 1;
      } else if (5003 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var18 = field323[-324749371 * DynamicObject.field1679];
         int var27 = field323[-462755559 * DynamicObject.field1679 + 1];
         Message var32 = classGF.method5408(var18, var27, (byte)50);
         if (var32 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -45678506 - 1] = 707758669 * var32.field725;
            field323[(DynamicObject.field1679 += 2008540618) * -324749371 - 1] = -1484193250 * var32.field724;
            field328[(field338 += 1222866659) * 1542831595 - 1] = var32.field729 != null ? var32.field729 : "";
            field328[(field338 += 1015860395) * 911667458 - 1] = null != var32.field730 ? var32.field730 : "";
            field328[(field338 += -1637938849) * -2061560237 - 1] = var32.field731 != null ? var32.field731 : "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var32.method1473(1703785374)
               ? 1
               : (Message.method1486(var32, 2086392249) ? 2 : 0);
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 102620860) * 1375698635 - 1] = "";
            field328[(field338 += 47607164) * 1375698635 - 1] = "";
            field328[(field338 += 588787032) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 726507107) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (var0 == 5004) {
         int var17 = field323[(DynamicObject.field1679 -= -1810602336) * 1346761891];
         Message var26 = classBQ.method1176(var17, 977843767);
         if (var26 != null) {
            field323[(DynamicObject.field1679 += -1332376537) * 24977247 - 1] = -601203557 * var26.field727;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1023095928 * var26.field724;
            field328[(field338 += 1543807147) * 1375698635 - 1] = var26.field729 != null ? var26.field729 : "";
            field328[(field338 += -1090664257) * 625345568 - 1] = null != var26.field730 ? var26.field730 : "";
            field328[(field338 += -1931768579) * 1375698635 - 1] = null != var26.field731 ? var26.field731 : "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var26.method1473(2044819852)
               ? 1
               : (Message.method1486(var26, 1809167876) ? 2 : 0);
         } else {
            field323[(DynamicObject.field1679 += 1676648970) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += -251301294) * 1375698635 - 1] = "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field328[(field338 += 1222866659) * 670821458 - 1] = "";
            field323[(DynamicObject.field1679 += 1314241971) * 813198044 - 1] = 0;
         }

         return 1;
      } else if (5005 == var0) {
         if (classBJ.field483 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -450352003 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -2085163722 - 1] = classBJ.field483.field7181 * -1676832621;
         }

         return 1;
      } else if (var0 == 5008) {
         String var16 = (String)field328[(field338 -= 1222866659) * 1375698635];
         int var25 = field323[(DynamicObject.field1679 -= -2031701093) * -884119433];
         PacketBufferNode var31 = classCX.constructChat(var25, var16, classLU.field4232, -1, 1261262135);
         client.packetWriter.addNode(var31, -1301097035);
         return 1;
      } else if (1950134453 == var0) {
         field338 -= -1849233978;
         String var15 = (String)field328[-130983451 * field338];
         String var24 = (String)field328[1 + field338 * 924691918];
         PacketBufferNode var30 = classEF.getPacketBufferNode(ClientPacket.MESSAGE_PRIVATE, client.packetWriter.isaacCipher, (byte)13);
         var30.packetBuffer.method12973(0, -1542382992);
         int var34 = 702114061 * var30.packetBuffer.offset;
         Buffer.method12997(var30.packetBuffer, var15, (short)30828);
         Menu.method12644(var30.packetBuffer, var24, -80937617);
         var30.packetBuffer.method13016(var30.packetBuffer.offset * 209516700 - var34, -1433091262);
         client.packetWriter.addNode(var30, -1301097035);
         return 1;
      } else if (5010 == var0) {
         String var14 = (String)field328[(field338 -= 1222866659) * 1375698635];
         DynamicObject.field1679 -= -1561352304;
         int var23 = field323[-324749371 * DynamicObject.field1679];
         int var29 = field323[1 + DynamicObject.field1679 * -1843879989];
         PacketBufferNode var6 = classCX.constructChat(var23, var14, classLU.field4232, var29, 775380030);
         client.packetWriter.addNode(var6, -1301097035);
         return 1;
      } else if (-609858203 == var0) {
         classAAE var13 = classOE.client.vmethod255((byte)89);
         String var22 = var13 != null ? var13.method164(1214471122) : "";
         field328[(field338 += -1517094897) * 1375698635 - 1] = var22;
         return 1;
      } else if (-1039056094 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1651046013 * client.field843;
         return 1;
      } else if (var0 == 504821850) {
         int var12 = field323[(DynamicObject.field1679 -= 1815187562) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNS.method7997(var12, 376821445);
         return 1;
      } else if (5018 == var0) {
         int var11 = field323[(DynamicObject.field1679 -= 2002207790) * -1989852004];
         field323[(DynamicObject.field1679 += 1931432949) * -324749371 - 1] = classVX.method12261(var11, (byte)2);
         return 1;
      } else if (5019 == var0) {
         int var10 = field323[(DynamicObject.field1679 -= -1126380448) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * 886093654 - 1] = classIW.method6323(var10, (byte)-17);
         return 1;
      } else if (var0 == -1182789747) {
         String var9 = (String)field328[(field338 -= -1170467751) * -139948421];
         VarbitComposition.method9216(var9, (byte)-47);
         return 1;
      } else if (var0 == 5021) {
         client.field929 = ((String)field328[(field338 -= 1222866659) * 1375698635]).toLowerCase().trim();
         return 1;
      } else if (var0 == 1190760469) {
         field328[(field338 += 198244069) * 1966755035 - 1] = client.field929;
         return 1;
      } else if (var0 == -846661338) {
         String var8 = (String)field328[(field338 -= -1786555298) * 1375698635];
         System.out.println(var8);
         return 1;
      } else if (var0 == 5030) {
         DynamicObject.field1679 -= 240082458;
         int var7 = field323[-324749371 * DynamicObject.field1679];
         int var21 = field323[-324749371 * DynamicObject.field1679 + 1];
         Message var5 = classGF.method5408(var7, var21, (byte)14);
         if (var5 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 707758669 * var5.field725;
            field323[(DynamicObject.field1679 += 619683245) * -324749371 - 1] = 1911984449 * var5.field724;
            field328[(field338 += 1222866659) * 1411720721 - 1] = null != var5.field729 ? var5.field729 : "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = var5.field730 != null ? var5.field730 : "";
            field328[(field338 += 1222866659) * 1706539640 - 1] = var5.field731 != null ? var5.field731 : "";
            field323[(DynamicObject.field1679 += 344426731) * -324749371 - 1] = var5.method1473(1847120415)
               ? 1
               : (Message.method1486(var5, 2067267386) ? 2 : 0);
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * 1121164020 - 1] = 0;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -1198472574 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field328[(field338 += -1680166804) * 1375698635 - 1] = "";
            field328[(field338 += 1222866659) * -25988543 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * 1432228481 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 1882338476) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (5031 == var0) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * 505340101];
         Message var4 = classBQ.method1176(var3, 977843767);
         if (var4 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -498415209 - 1] = 2010358259 * var4.field727;
            field323[(DynamicObject.field1679 += 1622699147) * -1799757789 - 1] = -1184725694 * var4.field724;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var4.field729 != null ? var4.field729 : "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = var4.field730 != null ? var4.field730 : "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = null != var4.field731 ? var4.field731 : "";
            field323[(DynamicObject.field1679 += 120041229) * -1730118448 - 1] = var4.method1473(897330125)
               ? 1
               : (Message.method1486(var4, 2012059659) ? 2 : 0);
            field328[(field338 += 27508620) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * 1642095310 - 1] = -1;
            field323[(DynamicObject.field1679 += -33846234) * 496810046 - 1] = 0;
            field328[(field338 += -1569327756) * 992967494 - 1] = "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += -995751356) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gw")
   static int method875(int var0, Script var1, boolean var2) {
      if (var0 == 4100) {
         String var40 = (String)field328[(field338 -= 1222866659) * 1375698635];
         int var52 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field328[(field338 += 1222866659) * 1375698635 - 1] = var40 + var52;
         return 1;
      } else if (var0 == 4101) {
         field338 -= -1849233978;
         String var39 = (String)field328[field338 * 1375698635];
         String var51 = (String)field328[1 + field338 * 1375698635];
         field328[(field338 += 1222866659) * 1375698635 - 1] = var39 + var51;
         return 1;
      } else if (var0 == 4102) {
         String var38 = (String)field328[(field338 -= 1222866659) * 1375698635];
         int var50 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field328[(field338 += 1222866659) * 1375698635 - 1] = var38 + classOJ.method8507(var50, true, (byte)-32);
         return 1;
      } else if (var0 == 4103) {
         String var37 = (String)field328[(field338 -= 1222866659) * 1375698635];
         field328[(field338 += 1222866659) * 1375698635 - 1] = var37.toLowerCase();
         return 1;
      } else if (4104 == var0) {
         int var36 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         long var49 = 86400000L * (var36 + 11745L);
         field329.setTime(new Date(var49));
         int var63 = field329.get(5);
         int var67 = field329.get(2);
         int var69 = field329.get(1);
         field328[(field338 += 1222866659) * 1375698635 - 1] = var63 + "-" + field320[var67] + "-" + var69;
         return 1;
      } else if (4106 == var0) {
         int var35 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field328[(field338 += 1222866659) * 1375698635 - 1] = Integer.toString(var35);
         return 1;
      } else if (4107 == var0) {
         field338 -= -1849233978;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classCH.method1500(
            Actor.method3081((String)field328[1375698635 * field338], (String)field328[field338 * 1375698635 + 1], classLU.field4232, 924994580), -1703978464
         );
         return 1;
      } else if (4108 == var0) {
         String var33 = (String)field328[(field338 -= 1222866659) * 1375698635];
         DynamicObject.field1679 -= 240082458;
         int var48 = field323[-324749371 * DynamicObject.field1679];
         int var58 = field323[-324749371 * DynamicObject.field1679 + 1];
         byte[] var62 = classYO.field7023.method11867(var58, 0, -1723448980);
         Font var66 = new Font(var62);
         var33 = classUP.method11420(var33, User.method10179(313945495), field334, field333, (byte)0);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var66.method43(var33, var48);
         return 1;
      } else if (var0 == 4109) {
         String var31 = (String)field328[(field338 -= 1222866659) * 1375698635];
         DynamicObject.field1679 -= 240082458;
         int var47 = field323[-324749371 * DynamicObject.field1679];
         int var57 = field323[1 + DynamicObject.field1679 * -324749371];
         byte[] var61 = classYO.field7023.method11867(var57, 0, -1635254185);
         Font var65 = new Font(var61);
         var31 = classUP.method11420(var31, User.method10179(-1164590077), field334, field333, (byte)0);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var65.method41(var31, var47);
         return 1;
      } else if (4110 == var0) {
         field338 -= -1849233978;
         String var30 = (String)field328[field338 * 1375698635];
         String var46 = (String)field328[field338 * 1375698635 + 1];
         if (field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var30;
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var46;
         }

         return 1;
      } else if (4111 == var0) {
         String var29 = (String)field328[(field338 -= 1222866659) * 1375698635];
         field328[(field338 += 1222866659) * 1375698635 - 1] = AbstractFont.method8(var29);
         return 1;
      } else if (4112 == var0) {
         String var28 = (String)field328[(field338 -= 1222866659) * 1375698635];
         int var45 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field328[(field338 += 1222866659) * 1375698635 - 1] = var28 + (char)var45;
         return 1;
      } else if (4113 == var0) {
         int var27 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classCJ.method1573((char)var27, -2094265158) ? 1 : 0;
         return 1;
      } else if (var0 == 4114) {
         int var26 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classSN.method10532((char)var26, 1398018181) ? 1 : 0;
         return 1;
      } else if (var0 == 4115) {
         int var25 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classTT.method11165((char)var25, -1413039415) ? 1 : 0;
         return 1;
      } else if (4116 == var0) {
         int var24 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classEB.method3802((char)var24, (byte)92) ? 1 : 0;
         return 1;
      } else if (var0 == 4117) {
         String var23 = (String)field328[(field338 -= 1222866659) * 1375698635];
         if (null != var23) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var23.length();
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (4118 == var0) {
         String var22 = (String)field328[(field338 -= 1222866659) * 1375698635];
         DynamicObject.field1679 -= 240082458;
         int var44 = field323[DynamicObject.field1679 * -324749371];
         int var56 = field323[1 + DynamicObject.field1679 * -324749371];
         field328[(field338 += 1222866659) * 1375698635 - 1] = var22.substring(var44, var56);
         return 1;
      } else if (4119 == var0) {
         String var20 = (String)field328[(field338 -= 1222866659) * 1375698635];
         var20 = classUP.method11420(var20, User.method10179(-1376320418), field334, field333, (byte)0);
         StringBuilder var43 = new StringBuilder(var20.length());
         boolean var55 = false;

         for (int var60 = 0; var60 < var20.length(); var60++) {
            char var64 = var20.charAt(var60);
            if (var64 == '<') {
               var55 = true;
            } else if ('>' == var64) {
               var55 = false;
            } else if ('@' == var64) {
               int var68 = var20.indexOf(64, 1 + var60);
               if (var68 != -1) {
                  var60 = var68;
               }
            } else if (!var55) {
               var43.append(var64);
            }
         }

         field328[(field338 += 1222866659) * 1375698635 - 1] = var43.toString();
         return 1;
      } else if (4120 == var0) {
         String var19 = (String)field328[(field338 -= 1222866659) * 1375698635];
         int var42 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var19.indexOf(var42);
         return 1;
      } else if (4121 == var0) {
         field338 -= -1849233978;
         String var18 = (String)field328[field338 * 1375698635];
         String var41 = (String)field328[field338 * 1375698635 + 1];
         int var54 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var18.indexOf(var41, var54);
         return 1;
      } else if (var0 == 4122) {
         String var17 = (String)field328[(field338 -= 1222866659) * 1375698635];
         field328[(field338 += 1222866659) * 1375698635 - 1] = var17.toUpperCase();
         return 1;
      } else if (var0 == 4123) {
         field338 -= -626367319;
         String var16 = (String)field328[1375698635 * field338];
         String var4 = (String)field328[1375698635 * field338 + 1];
         String var53 = (String)field328[2 + 1375698635 * field338];
         Player var59 = classMB.method7521(549602312);
         if (null != var59 && var59.field1285 != null) {
            switch (var59.field1285.field4093 * -513083879) {
               case 0:
                  field328[(field338 += 1222866659) * 1375698635 - 1] = var16;
                  break;
               case 1:
                  field328[(field338 += 1222866659) * 1375698635 - 1] = var4;
                  break;
               case 2:
               default:
                  field328[(field338 += 1222866659) * 1375698635 - 1] = var53;
            }

            return 1;
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var53;
            return 1;
         }
      } else if (4124 == var0) {
         Player var15 = classMB.method7521(1501042650);
         if (var15 != null && var15.field1285 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var15.field1285.field4093 * -513083879;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         }

         return 1;
      } else if (var0 == 4125) {
         long var14 = field322[(classXT.field6939 -= -1297854163) * 18294437];
         field328[(field338 += 1222866659) * 1375698635 - 1] = Long.toString(var14);
         return 1;
      } else if (4126 != var0) {
         if (var0 == 4127) {
            String var13 = (String)field328[(field338 -= 1222866659) * 1375698635];

            try {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = Integer.parseInt(var13);
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
            } catch (NumberFormatException var12) {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         long var3 = field322[(classXT.field6939 -= -1297854163) * 18294437];
         String var5 = (String)field328[(field338 -= 1222866659) * 1375698635];
         String var6;
         if (var3 == 0L) {
            var6 = "0";
         } else if (!var5.isEmpty()) {
            boolean var7 = var3 < 0L;
            long var8 = var7 ? -var3 : var3;
            StringBuilder var10 = new StringBuilder();

            for (int var11 = 1; var8 > 0L; var11++) {
               var10.insert(0, var8 % 10L);
               var8 /= 10L;
               if (var8 > 0L && 0 == var11 % 3) {
                  var10.insert(0, ",");
               }
            }

            if (var7) {
               var10.insert(0, '-');
            }

            var6 = var10.toString();
         } else {
            var6 = Long.toString(var3);
         }

         field328[(field338 += 1222866659) * 1375698635 - 1] = var6;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gg")
   static int method877(int var0, Script var1, boolean var2) {
      if (4200 == var0) {
         int var27 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field328[(field338 += 1222866659) * 1375698635 - 1] = ItemComposition.method8704(classOB.method8299(var27, (byte)-49), 1248604557);
         return 1;
      } else if (4201 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var26 = field323[DynamicObject.field1679 * -324749371];
         int var36 = field323[1 + DynamicObject.field1679 * -324749371];
         ItemComposition var38 = classOB.method8299(var26, (byte)23);
         if (var36 >= 1 && var36 <= 5 && ItemComposition.method8631(var38, (byte)44).vmethod540(var36 - 1, 1563449020)) {
            field328[(field338 += 1222866659) * 1375698635 - 1] = ItemComposition.method8631(var38, (byte)60)
               .vmethod551(var36 - 1, classLB.field4090, (byte)33);
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         }

         return 1;
      } else if (4202 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var25 = field323[-324749371 * DynamicObject.field1679];
         int var35 = field323[-324749371 * DynamicObject.field1679 + 1];
         ItemComposition var37 = classOB.method8299(var25, (byte)23);
         if (var35 >= 1 && var35 <= 5 && null != var37.groundActions[var35 - 1]) {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var37.groundActions[var35 - 1];
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         }

         return 1;
      } else if (var0 == 4222) {
         DynamicObject.field1679 -= 360123687;
         int var24 = field323[DynamicObject.field1679 * -324749371];
         int var34 = field323[DynamicObject.field1679 * -324749371 + 1];
         int var5 = field323[2 + DynamicObject.field1679 * -324749371];
         ItemComposition var6 = classOB.method8299(var24, (byte)13);
         String var7 = null;
         if (var34 >= 1
            && var34 <= 5
            && var6.groundActions[var34 - 1] != null
            && var6.field5050 != null
            && var6.field5050[var34 - 1] != null
            && var5 >= 1
            && var5 <= var6.field5050[var34 - 1].length) {
            var7 = var6.field5050[var34 - 1][var5 - 1];
         }

         field328[(field338 += 1222866659) * 1375698635 - 1] = var7 != null ? var7 : "";
         return 1;
      } else if (4203 == var0) {
         int var23 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classOB.method8299(var23, (byte)-17).field5043 * 665046345;
         return 1;
      } else if (var0 == 4204) {
         int var22 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classOB.method8299(var22, (byte)12).field5055 * 1633663665 == 1 ? 1 : 0;
         return 1;
      } else if (4205 == var0) {
         int var21 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         ItemComposition var33 = classOB.method8299(var21, (byte)100);
         if (var33.field5051 * 1236138331 == -1 && 1357747305 * var33.field5058 >= 0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1357747305 * var33.field5058;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var21;
         }

         return 1;
      } else if (4206 == var0) {
         int var20 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         ItemComposition var32 = classOB.method8299(var20, (byte)-3);
         if (1236138331 * var32.field5051 >= 0 && var32.field5058 * 1357747305 >= 0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1357747305 * var32.field5058;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var20;
         }

         return 1;
      } else if (4207 == var0) {
         int var19 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classOB.method8299(var19, (byte)44).field5016 ? 1 : 0;
         return 1;
      } else if (var0 == 4208) {
         int var18 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         ItemComposition var31 = classOB.method8299(var18, (byte)-49);
         if (-1 == var31.field5065 * -2023616411 && 1197673963 * var31.field5013 >= 0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var31.field5013 * 1197673963;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var18;
         }

         return 1;
      } else if (var0 == 4209) {
         int var17 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         ItemComposition var30 = classOB.method8299(var17, (byte)-57);
         if (var30.field5065 * -2023616411 >= 0 && var30.field5013 * 1197673963 >= 0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1197673963 * var30.field5013;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var17;
         }

         return 1;
      } else if (4210 == var0) {
         String var16 = (String)field328[(field338 -= 1222866659) * 1375698635];
         int var29 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classOG.method8437(var16, var29 == 1, (short)9962);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 807205665 * World.field1166;
         return 1;
      } else if (4211 == var0) {
         if (classDI.field1516 != null && 509024185 * classMI.field4510 < World.field1166 * 807205665) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classDI.field1516[(classMI.field4510 += 814857865) * 509024185 - 1] & '\uffff';
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         }

         return 1;
      } else if (4212 == var0) {
         classMI.field4510 = 0;
         return 1;
      } else if (var0 == 4213) {
         int var15 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         int var28 = ItemComposition.method8713(classOB.method8299(var15, (byte)-2), (byte)-6);
         if (-1 == var28) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var28;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1 + var28;
         }

         return 1;
      } else if (var0 == 4214) {
         int var14 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classOB.method8299(var14, (byte)-48).field5044 * 1481543581;
         return 1;
      } else if (var0 == 4215) {
         int var13 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classOB.method8299(var13, (byte)-8).field5010 * -1462570117;
         return 1;
      } else if (4216 == var0) {
         int var12 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classOB.method8299(var12, (byte)51).field5021 * -1681179861;
         return 1;
      } else if (4217 == var0) {
         int var11 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         ItemComposition var4 = classOB.method8299(var11, (byte)-29);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -692383701 * var4.field5011;
         return 1;
      } else if (var0 == 4218) {
         int var10 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field328[(field338 += 1222866659) * 1375698635 - 1] = classOB.method8299(var10, (byte)24).field5033;
         return 1;
      } else if (4219 == var0) {
         int var9 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classOB.method8299(var9, (byte)-8).field5049 * -807855685;
         return 1;
      } else if (var0 == 4220) {
         int var8 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classOB.method8299(var8, (byte)30).method8709(1569834720) ? 1 : 0;
         return 1;
      } else if (var0 == 4223) {
         return 1;
      } else if (4224 != var0) {
         return 2;
      } else {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (var3 < 0 || var3 > ChatChannel.method1258(411574163)) {
            var3 = -1;
         }

         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ge")
   static int method884(int var0, Script var1, boolean var2) {
      if (var0 == 5504) {
         DynamicObject.field1679 -= 240082458;
         int var5 = field323[DynamicObject.field1679 * -324749371];
         int var4 = field323[-324749371 * DynamicObject.field1679 + 1];
         if (!client.graphicsGuard) {
            client.field942.method11434(classEG.method3882(var5, (byte)-19), -1447188087);
            client.field994.method11434(classEG.method3882(var4, (byte)-8), -2135576927);
         }

         return 1;
      } else if (5505 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field942.method11454(811913192);
         return 1;
      } else if (var0 == 5506) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field994.method11454(242721761);
         return 1;
      } else if (var0 == 5530) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (var3 < 0) {
            var3 = 0;
         }

         client.field840 = var3 * 643105531;
         return 1;
      } else if (var0 == 5531) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -184240077 * client.field840;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gt")
   static int method879(int var0, Script var1, boolean var2) {
      if (5000 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 2102667627 * client.field870;
         return 1;
      } else if (5001 == var0) {
         DynamicObject.field1679 -= 360123687;
         client.field870 = field323[-324749371 * DynamicObject.field1679] * -1071072445;
         classBJ.field483 = classWN.method12603(field323[1 + -324749371 * DynamicObject.field1679], 2037876663);
         if (classBJ.field483 == null) {
            classBJ.field483 = classZF.field7179;
         }

         client.field843 = field323[-324749371 * DynamicObject.field1679 + 2] * -1112856963;
         PacketBufferNode var20 = classEF.getPacketBufferNode(ClientPacket.SET_CHATFILTERSETTINGS, client.packetWriter.isaacCipher, (byte)-47);
         Buffer.method12971(var20.packetBuffer, client.field870 * 2102667627, (byte)-19);
         Buffer.method12971(var20.packetBuffer, classBJ.field483.field7181 * -1382377909, (byte)-116);
         Buffer.method12971(var20.packetBuffer, 960234197 * client.field843, (byte)-16);
         client.packetWriter.addNode(var20, -1301097035);
         return 1;
      } else if (5002 == var0) {
         String var19 = (String)field328[(field338 -= 1222866659) * 1375698635];
         DynamicObject.field1679 -= 240082458;
         int var28 = field323[-324749371 * DynamicObject.field1679];
         int var33 = field323[-324749371 * DynamicObject.field1679 + 1];
         PacketBufferNode var35 = classEF.getPacketBufferNode(ClientPacket.SEND_SNAPSHOT, client.packetWriter.isaacCipher, (byte)-1);
         Buffer.method12971(var35.packetBuffer, classAU.method712(var19, (byte)85) + 2, (byte)-62);
         Buffer.method12997(var35.packetBuffer, var19, (short)24584);
         Buffer.method12971(var35.packetBuffer, var28 - 1, (byte)-35);
         Buffer.method12971(var35.packetBuffer, var33, (byte)-113);
         client.packetWriter.addNode(var35, -1301097035);
         return 1;
      } else if (5003 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var18 = field323[-324749371 * DynamicObject.field1679];
         int var27 = field323[-324749371 * DynamicObject.field1679 + 1];
         Message var32 = classGF.method5408(var18, var27, (byte)15);
         if (var32 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 707758669 * var32.field725;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1967508779 * var32.field724;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var32.field729 != null ? var32.field729 : "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = null != var32.field730 ? var32.field730 : "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = var32.field731 != null ? var32.field731 : "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var32.method1473(782737497)
               ? 1
               : (Message.method1486(var32, 1940338770) ? 2 : 0);
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (var0 == 5004) {
         int var17 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         Message var26 = classBQ.method1176(var17, 977843767);
         if (var26 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -601203557 * var26.field727;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1967508779 * var26.field724;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var26.field729 != null ? var26.field729 : "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = null != var26.field730 ? var26.field730 : "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = null != var26.field731 ? var26.field731 : "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var26.method1473(1475016256)
               ? 1
               : (Message.method1486(var26, 1868887241) ? 2 : 0);
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (5005 == var0) {
         if (classBJ.field483 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classBJ.field483.field7181 * -1382377909;
         }

         return 1;
      } else if (var0 == 5008) {
         String var16 = (String)field328[(field338 -= 1222866659) * 1375698635];
         int var25 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         PacketBufferNode var31 = classCX.constructChat(var25, var16, classLU.field4232, -1, 1500599710);
         client.packetWriter.addNode(var31, -1301097035);
         return 1;
      } else if (5009 == var0) {
         field338 -= -1849233978;
         String var15 = (String)field328[1375698635 * field338];
         String var24 = (String)field328[1 + field338 * 1375698635];
         PacketBufferNode var30 = classEF.getPacketBufferNode(ClientPacket.MESSAGE_PRIVATE, client.packetWriter.isaacCipher, (byte)-73);
         var30.packetBuffer.method12973(0, -1542382992);
         int var34 = 702114061 * var30.packetBuffer.offset;
         Buffer.method12997(var30.packetBuffer, var15, (short)559);
         Menu.method12644(var30.packetBuffer, var24, 64320104);
         var30.packetBuffer.method13016(var30.packetBuffer.offset * 702114061 - var34, 104404975);
         client.packetWriter.addNode(var30, -1301097035);
         return 1;
      } else if (5010 == var0) {
         String var14 = (String)field328[(field338 -= 1222866659) * 1375698635];
         DynamicObject.field1679 -= 240082458;
         int var23 = field323[-324749371 * DynamicObject.field1679];
         int var29 = field323[1 + DynamicObject.field1679 * -324749371];
         PacketBufferNode var6 = classCX.constructChat(var23, var14, classLU.field4232, var29, 787497546);
         client.packetWriter.addNode(var6, -1301097035);
         return 1;
      } else if (5015 == var0) {
         classAAE var13 = classOE.client.vmethod255((byte)81);
         String var22 = var13 != null ? var13.method164(1543013171) : "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = var22;
         return 1;
      } else if (5016 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 960234197 * client.field843;
         return 1;
      } else if (var0 == 5017) {
         int var12 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNS.method7997(var12, 124894901);
         return 1;
      } else if (5018 == var0) {
         int var11 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classVX.method12261(var11, (byte)2);
         return 1;
      } else if (5019 == var0) {
         int var10 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classIW.method6323(var10, (byte)112);
         return 1;
      } else if (var0 == 5020) {
         String var9 = (String)field328[(field338 -= 1222866659) * 1375698635];
         VarbitComposition.method9216(var9, (byte)-41);
         return 1;
      } else if (var0 == 5021) {
         client.field929 = ((String)field328[(field338 -= 1222866659) * 1375698635]).toLowerCase().trim();
         return 1;
      } else if (var0 == 5022) {
         field328[(field338 += 1222866659) * 1375698635 - 1] = client.field929;
         return 1;
      } else if (var0 == 5023) {
         String var8 = (String)field328[(field338 -= 1222866659) * 1375698635];
         System.out.println(var8);
         return 1;
      } else if (var0 == 5030) {
         DynamicObject.field1679 -= 240082458;
         int var7 = field323[-324749371 * DynamicObject.field1679];
         int var21 = field323[-324749371 * DynamicObject.field1679 + 1];
         Message var5 = classGF.method5408(var7, var21, (byte)68);
         if (var5 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 707758669 * var5.field725;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1967508779 * var5.field724;
            field328[(field338 += 1222866659) * 1375698635 - 1] = null != var5.field729 ? var5.field729 : "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = var5.field730 != null ? var5.field730 : "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = var5.field731 != null ? var5.field731 : "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var5.method1473(1328746612)
               ? 1
               : (Message.method1486(var5, 2053924187) ? 2 : 0);
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (5031 == var0) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         Message var4 = classBQ.method1176(var3, 977843767);
         if (var4 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -601203557 * var4.field727;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1967508779 * var4.field724;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var4.field729 != null ? var4.field729 : "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = var4.field730 != null ? var4.field730 : "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = null != var4.field731 ? var4.field731 : "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.method1473(884994475) ? 1 : (Message.method1486(var4, 1928654277) ? 2 : 0);
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("iz")
   static int method925(int var0, Script var1, boolean var2) {
      if (var0 != 8501) {
         if (var0 == 8520) {
            classXG var10 = classOE.client.field790.method12768(field323[(DynamicObject.field1679 -= 120041229) * -324749371], 82562597);
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var10 != null ? -5931402327633732889L * var10.field6866 : -1L;
            return 1;
         } else if (var0 == 8521) {
            classXG var9 = classXH.method12772(classOE.client.field790, field322[(classXT.field6939 -= -1297854163) * 18294437]);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != var9 ? var9.field6863 * 1743701503 : -1;
            return 1;
         } else if (var0 == 8560) {
            int var8 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            classXG var12 = classXH.method12772(classOE.client.field790, field322[(classXT.field6939 -= -1297854163) * 18294437]);
            if (null == var12) {
               classPC var14 = WorldView.method3717(classIZ.method6339(var8, (byte)6), -1481262033);
               classBD.method990(classBW.method1267(var8, (byte)-116), var14.field5216[classCF.method1461(var8, (byte)57)], (byte)76);
            } else {
               if (var12.field6864 * -38539607 != classIZ.method6339(var8, (byte)9)) {
                  throw new RuntimeException("");
               }

               classBD.method990(classBW.method1267(var8, (byte)-102), var12.field6862[classCF.method1461(var8, (byte)52)], (byte)102);
            }

            return 1;
         } else if (8570 == var0) {
            int var7 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            classXG var11 = classXH.method12772(classOE.client.field790, field322[(classXT.field6939 -= -1297854163) * 18294437]);
            if (var11 == null) {
               classPC var5 = WorldView.method3717(classIZ.method6339(var7, (byte)116), -250484887);
               Object[] var6 = classJW.method6417(var7, (byte)49) == classOG.field4864 ? var5.field5218 : var5.field5217;
               classBD.method990(classBW.method1267(var7, (byte)-48), var6[classCF.method1461(var7, (byte)92)], (byte)85);
            } else {
               if (var11.field6864 * -38539607 != classIZ.method6339(var7, (byte)98)) {
                  throw new RuntimeException("");
               }

               Object[] var13 = classJW.method6417(var7, (byte)-34) == classOG.field4864 ? var11.field6861 : var11.field6865;
               classBD.method990(classBW.method1267(var7, (byte)-47), var13[classCF.method1461(var7, (byte)-6)], (byte)115);
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         classXG var3 = classXH.method12772(classOE.client.field790, field322[(classXT.field6939 -= -1297854163) * 18294437]);
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3 != null && var4 == var3.field6864 * -38539607 ? 1 : 0;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gy")
   static int method881(int var0, Script var1, boolean var2) {
      if (var0 == 5306) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classLH.method7105(-1898118113);
         return 1;
      } else if (5307 == var0) {
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (1 == var4 || 2 == var4) {
            classUO.method11414(var4, -2056934790);
         }

         return 1;
      } else if (5308 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAB.field122.method2797(-1348973104);
         return 1;
      } else if (var0 != 5309) {
         if (var0 == 5310) {
            DynamicObject.field1679 -= 120041229;
            return 1;
         } else {
            return 2;
         }
      } else {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (1 == var3 || var3 == 2) {
            classAB.field122.method2800(var3, -1958874891);
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fa")
   static int method865(int var0, Script var1, boolean var2) {
      if (var0 == 87649845) {
         if (0 == 1592976602 * classQQ.field5597.field594) {
            field323[(DynamicObject.field1679 += 120041229) * -1276834663 - 1] = -2;
         } else if (-1220197333 * classQQ.field5597.field594 == 1) {
            field323[(DynamicObject.field1679 += -404452530) * -1884094559 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classQQ.field5597.field593.method10191(-1624078121);
         }

         return 1;
      } else if (3601 == var0) {
         int var48 = field323[(DynamicObject.field1679 -= -1891739353) * 942535644];
         if (classQQ.field5597.method1277(40636717) && var48 >= 0 && var48 < classQQ.field5597.field593.method10191(-1342759963)) {
            Friend var51 = (Friend)UserList.method10231(classQQ.field5597.field593, var48, 1601045480);
            field328[(field338 += -1360035437) * 1375698635 - 1] = User.method10170(var51, (byte)1);
            field328[(field338 += 1222866659) * 1199596822 - 1] = User.method10171(var51, (byte)16);
         } else {
            field328[(field338 += -2146156875) * 1375698635 - 1] = "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         }

         return 1;
      } else if (953545331 == var0) {
         int var47 = field323[(DynamicObject.field1679 -= 120041229) * -548555139];
         if (classQQ.field5597.method1277(-2038210691) && var47 >= 0 && var47 < classQQ.field5597.field593.method10191(-922548589)) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ((Buddy)UserList.method10231(classQQ.field5597.field593, var47, 1666173651)).field5669
               * -760305529;
         } else {
            field323[(DynamicObject.field1679 += -1275466681) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (230930270 == var0) {
         int var46 = field323[(DynamicObject.field1679 -= 1471337768) * -324749371];
         if (classQQ.field5597.method1277(-502402943) && var46 >= 0 && var46 < classQQ.field5597.field593.method10191(-987540970)) {
            field323[(DynamicObject.field1679 += 120041229) * -1583519036 - 1] = ((Buddy)UserList.method10231(classQQ.field5597.field593, var46, 1975433977)).field5671
               * 1248888837;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * 152817963 - 1] = 0;
         }

         return 1;
      } else if (3604 == var0) {
         String var45 = (String)field328[(field338 -= 1222866659) * 472823504];
         int var50 = field323[(DynamicObject.field1679 -= 120041229) * -1746635130];
         classCR.method2573(var45, var50, 1953554262);
         return 1;
      } else if (3605 == var0) {
         String var44 = (String)field328[(field338 -= -1965986713) * 1526645927];
         classQQ.field5597.method1303(var44, 423439250);
         return 1;
      } else if (var0 == 3606) {
         String var43 = (String)field328[(field338 -= 1222866659) * -2040822358];
         classQQ.field5597.method1325(var43, (byte)-81);
         return 1;
      } else if (-243615717 == var0) {
         String var42 = (String)field328[(field338 -= -1544177059) * 1375698635];
         classQQ.field5597.method1320(var42, -169290065);
         return 1;
      } else if (-229264013 == var0) {
         String var41 = (String)field328[(field338 -= 1577178262) * 1375698635];
         boolean var49 = true;
         classQQ.field5597.method1331(var41, var49, 1409525606);
         return 1;
      } else if (3609 == var0) {
         String var39 = (String)field328[(field338 -= -526823174) * 1375698635];
         var39 = classKW.method6577(var39, -1910499797);
         field323[(DynamicObject.field1679 += -1249621677) * 1706529413 - 1] = classQQ.field5597
               .method1296(new classAAE(var39, InterfaceParent.field5279), false, 1971953993)
            ? 1
            : 0;
         return 1;
      } else if (3611 == var0) {
         if (classIB.field2935 != null) {
            field328[(field338 += -938293008) * 1375698635 - 1] = classIB.field2935.field5860;
         } else {
            field328[(field338 += -1027889879) * 1375698635 - 1] = "";
         }

         return 1;
      } else if (1548045235 == var0) {
         if (null != classIB.field2935) {
            field323[(DynamicObject.field1679 += 120041229) * 1591513964 - 1] = classIB.field2935.method10191(-1369211358);
         } else {
            field323[(DynamicObject.field1679 += 1162432702) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (1114665304 == var0) {
         int var38 = field323[(DynamicObject.field1679 -= -1877040756) * -1488166280];
         if (classIB.field2935 != null && var38 < classIB.field2935.method10191(-1388318947)) {
            field328[(field338 += 1222866659) * 1375698635 - 1] = UserList.method10231(classIB.field2935, var38, 1694977559)
               .method10166((byte)16)
               .method164(1594980235);
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         }

         return 1;
      } else if (-1454299063 == var0) {
         int var37 = field323[(DynamicObject.field1679 -= -624269650) * 1508069879];
         if (null != classIB.field2935 && var37 < classIB.field2935.method10191(-1263379344)) {
            field323[(DynamicObject.field1679 += -989202108) * -515968750 - 1] = ((Buddy)UserList.method10231(classIB.field2935, var37, 1529054050))
               .method9970(1967750962);
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (3615 == var0) {
         int var36 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (null != classIB.field2935 && var36 < classIB.field2935.method10191(-1519583931)) {
            field323[(DynamicObject.field1679 += -1029079266) * -324749371 - 1] = ((Buddy)UserList.method10231(classIB.field2935, var36, 1410874091)).field5671
               * -1260607263;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (1185428693 == var0) {
         field323[(DynamicObject.field1679 += 1693212668) * -324749371 - 1] = null != classIB.field2935 ? classIB.field2935.field5865 : 0;
         return 1;
      } else if (var0 == -1762455465) {
         String var35 = (String)field328[(field338 -= 1222866659) * 1375698635];
         classCV.method2685(var35, (byte)48);
         return 1;
      } else if (-679010003 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -358958231 - 1] = classIB.field2935 != null ? classIB.field2935.field5866 * 1723777174 : 0;
         return 1;
      } else if (3619 == var0) {
         String var34 = (String)field328[(field338 -= 1924071622) * -463986424];
         classIJ.method6216(var34, -1142457594);
         return 1;
      } else if (3620 == var0) {
         classIO.method6231((byte)-91);
         return 1;
      } else if (var0 == 3621) {
         if (!classQQ.field5597.method1277(-1433309953)) {
            field323[(DynamicObject.field1679 += 1523175241) * -1158540649 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -191178737 - 1] = classQQ.field5597.field591.method10191(-1446074836);
         }

         return 1;
      } else if (var0 == 3622) {
         int var33 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (classQQ.field5597.method1277(-643958877) && var33 >= 0 && var33 < classQQ.field5597.field591.method10191(-1676677097)) {
            Ignored var4 = (Ignored)UserList.method10231(classQQ.field5597.field591, var33, 1937365048);
            field328[(field338 += 696658718) * 1375698635 - 1] = User.method10170(var4, (byte)1);
            field328[(field338 += 1222866659) * 657877419 - 1] = User.method10171(var4, (byte)-85);
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field328[(field338 += 1222866659) * -763309522 - 1] = "";
         }

         return 1;
      } else if (var0 == 3623) {
         String var31 = (String)field328[(field338 -= -824625469) * 155740882];
         var31 = classKW.method6577(var31, -1920181073);
         field323[(DynamicObject.field1679 += 120041229) * -144002663 - 1] = classQQ.field5597
               .method1299(new classAAE(var31, InterfaceParent.field5279), -1181618808)
            ? 1
            : 0;
         return 1;
      } else if (3624 == var0) {
         int var30 = field323[(DynamicObject.field1679 -= -1410815684) * -324749371];
         if (null != classIB.field2935
            && var30 < classIB.field2935.method10191(-410572364)
            && UserList.method10231(classIB.field2935, var30, 2076561512).method10166((byte)16).equals(classOE.client.vmethod255((byte)75))) {
            field323[(DynamicObject.field1679 += 120041229) * -291093236 - 1] = 1;
         } else {
            field323[(DynamicObject.field1679 += -1736261678) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (var0 == 3625) {
         if (null != classIB.field2935 && classIB.field2935.field5864 != null) {
            field328[(field338 += -1917531255) * 1674865206 - 1] = classIB.field2935.field5864;
         } else {
            field328[(field338 += -2110818894) * 1375698635 - 1] = "";
         }

         return 1;
      } else if (45067999 == var0) {
         int var29 = field323[(DynamicObject.field1679 -= 120041229) * -1430572497];
         if (classIB.field2935 != null
            && var29 < classIB.field2935.method10191(-2115998802)
            && ClanMate.method10272((ClanMate)UserList.method10231(classIB.field2935, var29, 1953710364), 1274831131)) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -1514917930 - 1] = 0;
         }

         return 1;
      } else if (3627 != var0) {
         if (var0 == 3628) {
            UserList.method10256(classQQ.field5597.field593, -2131694580);
            return 1;
         } else if (3629 == var0) {
            boolean var28 = field323[(DynamicObject.field1679 -= 120041229) * 1620214042] == 1;
            classQQ.field5597.field593.method10262(new classYC(var28), 1271118354);
            return 1;
         } else if (-1524639976 == var0) {
            boolean var27 = field323[(DynamicObject.field1679 -= 620185282) * -324749371] == 1;
            classQQ.field5597.field593.method10262(new classYS(var27), 77639682);
            return 1;
         } else if (3631 == var0) {
            boolean var26 = field323[(DynamicObject.field1679 -= 120041229) * 1933246486] == 1;
            classQQ.field5597.field593.method10262(new classEV(var26), -1546655630);
            return 1;
         } else if (var0 == 3632) {
            boolean var25 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
            classQQ.field5597.field593.method10262(new classEA(var25), 25565067);
            return 1;
         } else if (3633 == var0) {
            boolean var24 = field323[(DynamicObject.field1679 -= -199195411) * 1265824625] == 1;
            classQQ.field5597.field593.method10262(new classED(var24), 1432717456);
            return 1;
         } else if (3634 == var0) {
            boolean var23 = field323[(DynamicObject.field1679 -= -238890447) * -324749371] == 1;
            classQQ.field5597.field593.method10262(new classES(var23), 71856861);
            return 1;
         } else if (var0 == 3635) {
            boolean var22 = field323[(DynamicObject.field1679 -= -1573749879) * -292397453] == 1;
            classQQ.field5597.field593.method10262(new classEK(var22), 700439577);
            return 1;
         } else if (3636 == var0) {
            boolean var21 = field323[(DynamicObject.field1679 -= -2059290540) * -324749371] == 1;
            classQQ.field5597.field593.method10262(new classEJ(var21), -1348178748);
            return 1;
         } else if (-44756901 == var0) {
            boolean var20 = field323[(DynamicObject.field1679 -= -311743468) * -1614477795] == 1;
            classQQ.field5597.field593.method10262(new classEL(var20), 1308291374);
            return 1;
         } else if (492507937 == var0) {
            boolean var19 = field323[(DynamicObject.field1679 -= 1418520236) * -1117426281] == 1;
            classQQ.field5597.field593.method10262(new classEH(var19), 1432821258);
            return 1;
         } else if (3639 == var0) {
            classQQ.field5597.field593.method10234((byte)72);
            return 1;
         } else if (-301517150 == var0) {
            UserList.method10256(classQQ.field5597.field591, -2131694580);
            return 1;
         } else if (-967413590 == var0) {
            boolean var18 = field323[(DynamicObject.field1679 -= 120041229) * -928362252] == 1;
            classQQ.field5597.field591.method10262(new classYC(var18), -2078550860);
            return 1;
         } else if (563680920 == var0) {
            boolean var17 = field323[(DynamicObject.field1679 -= 1269941829) * 2070732023] == 1;
            classQQ.field5597.field591.method10262(new classYS(var17), -2101227449);
            return 1;
         } else if (3643 == var0) {
            classQQ.field5597.field591.method10234((byte)5);
            return 1;
         } else if (var0 == -1562171784) {
            if (classIB.field2935 != null) {
               UserList.method10256(classIB.field2935, -2131694580);
            }

            return 1;
         } else if (var0 == 3645) {
            boolean var16 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
            if (null != classIB.field2935) {
               classIB.field2935.method10262(new classYC(var16), 1158125992);
            }

            return 1;
         } else if (3646 == var0) {
            boolean var15 = field323[(DynamicObject.field1679 -= 120041229) * -511512045] == 1;
            if (null != classIB.field2935) {
               classIB.field2935.method10262(new classYS(var15), -1830478419);
            }

            return 1;
         } else if (217211855 == var0) {
            boolean var14 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
            if (null != classIB.field2935) {
               classIB.field2935.method10262(new classEV(var14), 526484842);
            }

            return 1;
         } else if (3648 == var0) {
            boolean var13 = field323[(DynamicObject.field1679 -= 239276655) * -324749371] == 1;
            if (null != classIB.field2935) {
               classIB.field2935.method10262(new classEA(var13), 601636317);
            }

            return 1;
         } else if (var0 == -985146627) {
            boolean var12 = field323[(DynamicObject.field1679 -= 1060932167) * -324749371] == 1;
            if (classIB.field2935 != null) {
               classIB.field2935.method10262(new classED(var12), 1149088014);
            }

            return 1;
         } else if (3650 == var0) {
            boolean var11 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
            if (classIB.field2935 != null) {
               classIB.field2935.method10262(new classES(var11), 509497271);
            }

            return 1;
         } else if (var0 == 3651) {
            boolean var10 = field323[(DynamicObject.field1679 -= 120041229) * -1630974347] == 1;
            if (classIB.field2935 != null) {
               classIB.field2935.method10262(new classEK(var10), -669356112);
            }

            return 1;
         } else if (1345509480 == var0) {
            boolean var9 = field323[(DynamicObject.field1679 -= -47933088) * -324749371] == 1;
            if (null != classIB.field2935) {
               classIB.field2935.method10262(new classEJ(var9), 1155035172);
            }

            return 1;
         } else if (var0 == 3653) {
            boolean var8 = field323[(DynamicObject.field1679 -= 120041229) * -1133935379] == 1;
            if (null != classIB.field2935) {
               classIB.field2935.method10262(new classEL(var8), -832058945);
            }

            return 1;
         } else if (3654 == var0) {
            boolean var7 = field323[(DynamicObject.field1679 -= -563265689) * 768393788] == 1;
            if (classIB.field2935 != null) {
               classIB.field2935.method10262(new classEH(var7), 223374828);
            }

            return 1;
         } else if (3655 == var0) {
            if (classIB.field2935 != null) {
               classIB.field2935.method10234((byte)21);
            }

            return 1;
         } else if (var0 == 3656) {
            boolean var6 = field323[(DynamicObject.field1679 -= -1818346101) * -324749371] == 1;
            classQQ.field5597.field593.method10262(new classEG(var6), -754361010);
            return 1;
         } else if (var0 == 1712216833) {
            boolean var5 = field323[(DynamicObject.field1679 -= 888239050) * -324749371] == 1;
            if (null != classIB.field2935) {
               classIB.field2935.method10262(new classEG(var5), -773002620);
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var3 = field323[(DynamicObject.field1679 -= -1839711978) * -324749371];
         if (classIB.field2935 != null
            && var3 < classIB.field2935.method10191(-284150654)
            && ((ClanMate)UserList.method10231(classIB.field2935, var3, 2073267293)).method10282(-433938146)) {
            field323[(DynamicObject.field1679 += 120041229) * -1663465589 - 1] = 1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gj")
   static int method882(int var0, Script var1, boolean var2) {
      if (var0 == 5306) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classLH.method7105(-1777577833);
         return 1;
      } else if (5307 == var0) {
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (1 == var4 || 2 == var4) {
            classUO.method11414(var4, -2117003805);
         }

         return 1;
      } else if (5308 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAB.field122.method2797(-352062032);
         return 1;
      } else if (var0 != 5309) {
         if (var0 == 5310) {
            DynamicObject.field1679 -= 120041229;
            return 1;
         } else {
            return 2;
         }
      } else {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (1 == var3 || var3 == 2) {
            classAB.field122.method2800(var3, 1374702631);
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gx")
   static int method885(int var0, Script var1, boolean var2) {
      if (var0 == 5504) {
         DynamicObject.field1679 -= 240082458;
         int var5 = field323[DynamicObject.field1679 * -324749371];
         int var4 = field323[-324749371 * DynamicObject.field1679 + 1];
         if (!client.graphicsGuard) {
            client.field942.method11434(classEG.method3882(var5, (byte)56), -1579455494);
            client.field994.method11434(classEG.method3882(var4, (byte)77), -1507380256);
         }

         return 1;
      } else if (5505 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field942.method11454(84152830);
         return 1;
      } else if (var0 == 5506) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field994.method11454(1284900612);
         return 1;
      } else if (var0 == 5530) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (var3 < 0) {
            var3 = 0;
         }

         client.field840 = var3 * 643105531;
         return 1;
      } else if (var0 == 5531) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -184240077 * client.field840;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fn")
   static int method858(int var0, Script var1, boolean var2) {
      if (var0 == 3200) {
         DynamicObject.field1679 -= 360123687;
         GraphicsObject.field475
            .method10472(
               field323[DynamicObject.field1679 * -324749371],
               field323[-324749371 * DynamicObject.field1679 + 1],
               field323[DynamicObject.field1679 * -324749371 + 2],
               (byte)0
            );
         return 1;
      } else if (var0 == 3201) {
         DynamicObject.field1679 -= 600206145;
         int var18 = field323[DynamicObject.field1679 * -324749371];
         int var27 = field323[1 + -324749371 * DynamicObject.field1679];
         int var36 = field323[2 + -324749371 * DynamicObject.field1679];
         int var50 = field323[-324749371 * DynamicObject.field1679 + 3];
         int var55 = field323[4 + -324749371 * DynamicObject.field1679];
         ArrayList var56 = new ArrayList();
         var56.add(var18);
         classRJ.method9998(var56, var27, var36, var50, var55, (byte)-3);
         return 1;
      } else if (var0 == 3202) {
         DynamicObject.field1679 -= 240082458;
         Script.method1148(field323[-324749371 * DynamicObject.field1679], field323[-324749371 * DynamicObject.field1679 + 1], -2122145474);
         return 1;
      } else if (3212 == var0 || 3213 == var0 || 3209 == var0 || 3181 == var0 || 3203 == var0 || var0 == 3205 || var0 == 3207) {
         classCB var17 = classCB.field638;
         classCU var26 = classCU.field1286;
         int var35 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (3212 == var0) {
            int var45 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            var17 = (classCB)classOF.method8404(classAF.method335((byte)22), var45, -295161121);
            if (var17 == null) {
               throw new RuntimeException(String.format("Unrecognized device option %d", var45));
            }
         }

         if (var0 == 3213) {
            int var46 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            var26 = (classCU)classOF.method8404(classHA.method5953((byte)-12), var46, -1409299667);
            if (var26 == null) {
               throw new RuntimeException(String.format("Unrecognized game option %d", var46));
            }
         }

         if (3209 == var0) {
            int var47 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            var17 = (classCB)classOF.method8404(classAF.method335((byte)25), var47, -2120447107);
            if (var17 == null) {
               var26 = (classCU)classOF.method8404(classHA.method5953((byte)-96), var47, -2122112215);
               if (var26 == null) {
                  throw new RuntimeException(String.format("Unrecognized client option %d", var47));
               }
            }
         } else if (var0 == 3181) {
            var17 = classCB.field643;
         } else if (3203 == var0) {
            var26 = classCU.field1290;
         } else if (var0 == 3205) {
            var26 = classCU.field1287;
         } else if (3207 == var0) {
            var26 = classCU.field1289;
         }

         if (classCU.field1286 == var26) {
            switch (var17.field648 * 611340289) {
               case 1:
                  classAB.field122.method2727(1 == var35, -1532525816);
                  break;
               case 2:
                  ClientPreferences.method2736(classAB.field122, var35 == 1, (byte)16);
                  break;
               case 3:
                  classAB.field122.method2743(var35 == 1, (byte)-44);
                  break;
               case 4:
                  if (var35 < 0) {
                     var35 = 0;
                  }

                  ClientPreferences.method2752(classAB.field122, var35, (byte)12);
                  break;
               case 5:
                  classBY.method1359(var35, (byte)0);
                  break;
               case 6:
                  classAB.field122.method2812(var35, 1664773051);
                  break;
               case 7:
                  classAB.field122.method2822(var35, 585965863);
                  classEM.method3929((byte)-11);
                  break;
               case 8:
                  ClientPreferences.method2829(classAB.field122, var35 == 1, -1446073361);
                  break;
               default:
                  String var48 = String.format("Unkown device option: %s.", var17);
                  throw new RuntimeException(var48);
            }
         } else {
            switch (321038383 * var26.field1292) {
               case 1:
                  classAB.field122.method2721(1 == var35, -912155425);
                  break;
               case 2:
                  ClientPreferences.method2765(classAB.field122, var35, 1222866659);
                  classKL.method6494(-256704549);
                  break;
               case 3:
                  ClientPreferences.method2774(classAB.field122, var35, -1976715971);
                  classGI.method5464(-1763734266);
                  break;
               case 4:
                  classAB.field122.method2781(var35, (byte)31);
                  classDO.method3509((byte)117);
                  break;
               default:
                  String var49 = String.format("Unkown game option: %s.", var26);
                  throw new RuntimeException(var49);
            }
         }

         return 1;
      } else if (var0 == 3214 || 3215 == var0 || var0 == 3210 || var0 == 3182 || 3204 == var0 || var0 == 3206 || var0 == 3208) {
         classCB var16 = classCB.field638;
         classCU var25 = classCU.field1286;
         int var33 = 0;
         if (var0 == 3214) {
            int var40 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            var16 = (classCB)classOF.method8404(classAF.method335((byte)123), var40, -1817400557);
            if (null == var16) {
               throw new RuntimeException(String.format("Unrecognized device option %d", var40));
            }
         }

         if (3215 == var0) {
            int var41 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            var25 = (classCU)classOF.method8404(classHA.method5953((byte)23), var41, -877194232);
            if (var25 == null) {
               throw new RuntimeException(String.format("Unrecognized game option %d", var41));
            }
         }

         if (3210 == var0) {
            int var42 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            var16 = (classCB)classOF.method8404(classAF.method335((byte)107), var42, 1061275953);
            if (var16 == null) {
               var25 = (classCU)classOF.method8404(classHA.method5953((byte)81), var42, -1607131819);
               if (null == var25) {
                  throw new RuntimeException(String.format("Unrecognized client option %d", var42));
               }
            }
         } else if (var0 == 3182) {
            var16 = classCB.field643;
         } else if (var0 == 3204) {
            var25 = classCU.field1290;
         } else if (3206 == var0) {
            var25 = classCU.field1287;
         } else if (3208 == var0) {
            var25 = classCU.field1289;
         }

         if (var25 == classCU.field1286) {
            switch (var16.field648 * 611340289) {
               case 1:
                  var33 = ClientPreferences.method2724(classAB.field122, (short)23331) ? 1 : 0;
                  break;
               case 2:
                  var33 = classAB.field122.method2732((byte)55) ? 1 : 0;
                  break;
               case 3:
                  var33 = classAB.field122.method2741(160811746) ? 1 : 0;
                  break;
               case 4:
                  var33 = classAB.field122.method2750(1705645338);
                  break;
               case 5:
                  var33 = Projectile.method1223(212584122);
                  break;
               case 6:
                  var33 = classAB.field122.method2817((byte)0);
                  break;
               case 7:
                  var33 = (int)(classAB.field122.method2820(-1324767022) * 100.0F);
                  break;
               case 8:
                  var33 = ClientPreferences.method2824(classAB.field122, 1349794310) ? 1 : 0;
                  break;
               default:
                  String var43 = String.format("Unkown device option: %s.", var16);
                  throw new RuntimeException(var43);
            }
         } else {
            switch (var25.field1292 * 321038383) {
               case 1:
                  var33 = ClientPreferences.method2720(classAB.field122, -1315528093) ? 1 : 0;
                  break;
               case 2:
                  var33 = classMH.method7572((byte)11);
                  break;
               case 3:
                  var33 = classCA.method1396(1454273535);
                  break;
               case 4:
                  var33 = classEA.method3800((byte)10);
                  break;
               default:
                  String var44 = String.format("Unkown game option: %s.", var25);
                  throw new RuntimeException(var44);
            }
         }

         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var33;
         return 1;
      } else if (3211 == var0) {
         return 1;
      } else if (3216 == var0) {
         int var15 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         int var24 = 0;
         classCB var32 = (classCB)classOF.method8404(classAF.method335((byte)55), var15, 935496314);
         if (null != var32) {
            var24 = classCB.field638 != var32 ? 1 : 0;
         }

         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var24;
         return 1;
      } else if (var0 == 3218) {
         int var14 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         int var23 = 0;
         classCU var31 = (classCU)classOF.method8404(classHA.method5953((byte)-70), var14, -85252977);
         if (var31 != null) {
            var23 = classCU.field1286 != var31 ? 1 : 0;
         }

         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var23;
         return 1;
      } else if (3217 == var0 || 3219 == var0) {
         classCB var13 = classCB.field638;
         classCU var22 = classCU.field1286;
         byte var29 = -1;
         int var38 = -1;
         if (3217 == var0) {
            int var51 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            var13 = (classCB)classOF.method8404(classAF.method335((byte)20), var51, 1183785138);
            if (null == var13) {
               throw new RuntimeException(String.format("Unrecognized device option %d", var51));
            }
         }

         if (3219 == var0) {
            int var52 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            var22 = (classCU)classOF.method8404(classHA.method5953((byte)44), var52, -1157284926);
            if (null == var22) {
               throw new RuntimeException(String.format("Unrecognized game option %d", var52));
            }
         }

         if (classCU.field1286 == var22) {
            switch (var13.field648 * 611340289) {
               case 1:
               case 2:
               case 3:
                  var29 = 0;
                  var38 = 1;
                  break;
               case 4:
                  var29 = 0;
                  var38 = Integer.MAX_VALUE;
                  break;
               case 5:
                  var29 = 0;
                  var38 = 100;
                  break;
               case 6:
                  var29 = 25;
                  var38 = 90;
                  break;
               default:
                  String var53 = String.format("Unkown device option: %s.", var13);
                  throw new RuntimeException(var53);
            }
         } else {
            switch (321038383 * var22.field1292) {
               case 1:
                  var29 = 0;
                  var38 = 1;
                  break;
               case 2:
               case 3:
               case 4:
                  var29 = 0;
                  var38 = 100;
                  break;
               default:
                  String var54 = String.format("Unkown game option: %s.", var22);
                  throw new RuntimeException(var54);
            }
         }

         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var29;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var38;
         return 1;
      } else if (var0 == 3220) {
         DynamicObject.field1679 -= 240082458;
         int var12 = field323[-324749371 * DynamicObject.field1679];
         int var21 = field323[DynamicObject.field1679 * -324749371 + 1];
         classBK.method1118(var12, var21, (byte)98);
         return 1;
      } else if (3221 == var0) {
         DynamicObject.field1679 -= 720247374;
         int var11 = field323[DynamicObject.field1679 * -324749371];
         int var20 = field323[1 + DynamicObject.field1679 * -324749371];
         int var28 = field323[2 + DynamicObject.field1679 * -324749371];
         int var37 = field323[3 + DynamicObject.field1679 * -324749371];
         int var7 = field323[4 + DynamicObject.field1679 * -324749371];
         int var8 = field323[5 + -324749371 * DynamicObject.field1679];
         ArrayList var9 = new ArrayList();
         var9.add(var11);
         var9.add(var20);
         classRJ.method9998(var9, var28, var37, var7, var8, (byte)-81);
         return 1;
      } else if (var0 == 3222) {
         DynamicObject.field1679 -= 480164916;
         int var10 = field323[-324749371 * DynamicObject.field1679];
         int var19 = field323[DynamicObject.field1679 * -324749371 + 1];
         int var5 = field323[2 + DynamicObject.field1679 * -324749371];
         int var6 = field323[3 + DynamicObject.field1679 * -324749371];
         classIM.method6224(var10, var19, var5, var6, -1142177520);
         return 1;
      } else if (var0 == 3228) {
         String var3 = (String)field328[(field338 -= 1222866659) * 1375698635];
         String var4 = (String)field328[(field338 -= 1222866659) * 1375698635];
         classED.method3832(var4, var3, -1612223114);
         return 1;
      } else if (3229 == var0) {
         Projection.method5024((byte)-19);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyy;Ljava/lang/Object;)V")
   @ObfuscatedName("ii")
   static void method942(classYY var0, Object var1) {
      if (var0 == null) {
         throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
      } else {
         switch (-900901303 * var0.field7107) {
            case 2:
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (Integer)var1;
               break;
            case 3:
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = (Long)var1;
               break;
            case 4:
               field328[(field338 += 1222866659) * 1375698635 - 1] = var1;
               break;
            default:
               throw new IllegalStateException("pushValueOfType() failure - unsupported type");
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gu")
   static int method887(int var0, Script var1, boolean var2) {
      if (5630 == var0) {
         client.field820 = -878412626;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gf")
   static int method888(int var0, Script var1, boolean var2) {
      if (5630 == var0) {
         client.field820 = -878412626;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gh")
   static int method889(int var0, Script var1, boolean var2) {
      if (5630 == var0) {
         client.field820 = -1457195508;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("hz")
   static int method890(int var0) {
      return (int)Math.pow(2.0, var0 / 256.0F + 7.0F);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("hw")
   static int method891(int var0) {
      return (int)Math.pow(2.0, var0 / 256.0F + 7.0F);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("hi")
   static int method892(int var0) {
      return (int)Math.pow(2.0, var0 / 256.0F + 7.0F);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ht")
   static int method893(int var0) {
      return (int)((Math.log(var0) / field325 - 7.0) * 256.0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hd")
   static int method895(int var0, Script var1, boolean var2) {
      if (var0 == 6200) {
         DynamicObject.field1679 -= 240082458;
         client.field867 = (short)classZL.method14064(field323[-324749371 * DynamicObject.field1679], -1797133451);
         if (client.field867 <= 0) {
            client.field867 = 256;
         }

         client.field868 = (short)classZL.method14064(field323[1 + DynamicObject.field1679 * -324749371], -1985492654);
         if (client.field868 <= 0) {
            client.field868 = 256;
         }

         return 1;
      } else if (6201 == var0) {
         DynamicObject.field1679 -= 240082458;
         client.field869 = (short)field323[-324749371 * DynamicObject.field1679];
         if (client.field869 <= 0) {
            client.field869 = 256;
         }

         client.field862 = (short)field323[DynamicObject.field1679 * -324749371 + 1];
         if (client.field862 <= 0) {
            client.field862 = 320;
         }

         return 1;
      } else if (6202 == var0) {
         DynamicObject.field1679 -= 480164916;
         client.field876 = (short)field323[DynamicObject.field1679 * -324749371];
         if (client.field876 <= 0) {
            client.field876 = 1;
         }

         client.field872 = (short)field323[DynamicObject.field1679 * -324749371 + 1];
         if (client.field872 <= 0) {
            client.field872 = 32767;
         } else if (client.field872 < client.field876) {
            client.field872 = client.field876;
         }

         client.field873 = (short)field323[2 + -324749371 * DynamicObject.field1679];
         if (client.field873 <= 0) {
            client.field873 = 1;
         }

         client.field874 = (short)field323[DynamicObject.field1679 * -324749371 + 3];
         if (client.field874 <= 0) {
            client.field874 = 32767;
         } else if (client.field874 < client.field873) {
            client.field874 = client.field873;
         }

         return 1;
      } else if (var0 == 6203) {
         if (null != classWK.field6691.field6620) {
            classRL.method10027(0, 0, 1115597881 * classWK.field6691.field6620.field4249, classWK.field6691.field6620.field4259 * 293773697, false, 317527437);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field990 * 27064125;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1158148203 * client.field982;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         }

         return 1;
      } else if (6204 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field869;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field862;
         return 1;
      } else if (6205 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classIK.method6220(client.field867, (byte)-1);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classIK.method6220(client.field868, (byte)-1);
         return 1;
      } else if (6220 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (var0 == 6221) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         return 1;
      } else if (6222 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 773246731 * classSA.field5897;
         return 1;
      } else if (6223 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = IntProjection.field1938 * 8379747;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ga")
   static int method876(int var0, Script var1, boolean var2) {
      if (var0 == 4100) {
         String var40 = (String)field328[(field338 -= 1222866659) * 1375698635];
         int var52 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field328[(field338 += 1222866659) * 1375698635 - 1] = var40 + var52;
         return 1;
      } else if (var0 == 4101) {
         field338 -= -1849233978;
         String var39 = (String)field328[field338 * 1375698635];
         String var51 = (String)field328[1 + field338 * 1375698635];
         field328[(field338 += 1222866659) * 1375698635 - 1] = var39 + var51;
         return 1;
      } else if (var0 == 4102) {
         String var38 = (String)field328[(field338 -= 1222866659) * 1375698635];
         int var50 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field328[(field338 += 1222866659) * 1375698635 - 1] = var38 + classOJ.method8507(var50, true, (byte)-48);
         return 1;
      } else if (var0 == 4103) {
         String var37 = (String)field328[(field338 -= 1222866659) * 1375698635];
         field328[(field338 += 1222866659) * 1375698635 - 1] = var37.toLowerCase();
         return 1;
      } else if (4104 == var0) {
         int var36 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         long var49 = 86400000L * (var36 + 11745L);
         field329.setTime(new Date(var49));
         int var63 = field329.get(5);
         int var67 = field329.get(2);
         int var69 = field329.get(1);
         field328[(field338 += 1222866659) * 1375698635 - 1] = var63 + "-" + field320[var67] + "-" + var69;
         return 1;
      } else if (4106 == var0) {
         int var35 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field328[(field338 += 1222866659) * 1375698635 - 1] = Integer.toString(var35);
         return 1;
      } else if (4107 == var0) {
         field338 -= -1849233978;
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classCH.method1500(
            Actor.method3081((String)field328[1375698635 * field338], (String)field328[field338 * 1375698635 + 1], classLU.field4232, 749354621), 6911287
         );
         return 1;
      } else if (4108 == var0) {
         String var33 = (String)field328[(field338 -= 1222866659) * 1375698635];
         DynamicObject.field1679 -= 240082458;
         int var48 = field323[-324749371 * DynamicObject.field1679];
         int var58 = field323[-324749371 * DynamicObject.field1679 + 1];
         byte[] var62 = classYO.field7023.method11867(var58, 0, -1617836700);
         Font var66 = new Font(var62);
         var33 = classUP.method11420(var33, User.method10179(-601835146), field334, field333, (byte)0);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var66.method43(var33, var48);
         return 1;
      } else if (var0 == 4109) {
         String var31 = (String)field328[(field338 -= 1222866659) * 1375698635];
         DynamicObject.field1679 -= 240082458;
         int var47 = field323[-324749371 * DynamicObject.field1679];
         int var57 = field323[1 + DynamicObject.field1679 * -324749371];
         byte[] var61 = classYO.field7023.method11867(var57, 0, -1816294739);
         Font var65 = new Font(var61);
         var31 = classUP.method11420(var31, User.method10179(-1977636184), field334, field333, (byte)0);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var65.method41(var31, var47);
         return 1;
      } else if (4110 == var0) {
         field338 -= -1849233978;
         String var30 = (String)field328[field338 * 1375698635];
         String var46 = (String)field328[field338 * 1375698635 + 1];
         if (field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1) {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var30;
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var46;
         }

         return 1;
      } else if (4111 == var0) {
         String var29 = (String)field328[(field338 -= 1222866659) * 1375698635];
         field328[(field338 += 1222866659) * 1375698635 - 1] = AbstractFont.method8(var29);
         return 1;
      } else if (4112 == var0) {
         String var28 = (String)field328[(field338 -= 1222866659) * 1375698635];
         int var45 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field328[(field338 += 1222866659) * 1375698635 - 1] = var28 + (char)var45;
         return 1;
      } else if (4113 == var0) {
         int var27 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classCJ.method1573((char)var27, -1652006132) ? 1 : 0;
         return 1;
      } else if (var0 == 4114) {
         int var26 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classSN.method10532((char)var26, 444729670) ? 1 : 0;
         return 1;
      } else if (var0 == 4115) {
         int var25 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classTT.method11165((char)var25, -1619955161) ? 1 : 0;
         return 1;
      } else if (4116 == var0) {
         int var24 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classEB.method3802((char)var24, (byte)54) ? 1 : 0;
         return 1;
      } else if (var0 == 4117) {
         String var23 = (String)field328[(field338 -= 1222866659) * 1375698635];
         if (null != var23) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var23.length();
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (4118 == var0) {
         String var22 = (String)field328[(field338 -= 1222866659) * 1375698635];
         DynamicObject.field1679 -= 240082458;
         int var44 = field323[DynamicObject.field1679 * -324749371];
         int var56 = field323[1 + DynamicObject.field1679 * -324749371];
         field328[(field338 += 1222866659) * 1375698635 - 1] = var22.substring(var44, var56);
         return 1;
      } else if (4119 == var0) {
         String var20 = (String)field328[(field338 -= 1222866659) * 1375698635];
         var20 = classUP.method11420(var20, User.method10179(-972871300), field334, field333, (byte)0);
         StringBuilder var43 = new StringBuilder(var20.length());
         boolean var55 = false;

         for (int var60 = 0; var60 < var20.length(); var60++) {
            char var64 = var20.charAt(var60);
            if (var64 == '<') {
               var55 = true;
            } else if ('>' == var64) {
               var55 = false;
            } else if ('@' == var64) {
               int var68 = var20.indexOf(64, 1 + var60);
               if (var68 != -1) {
                  var60 = var68;
               }
            } else if (!var55) {
               var43.append(var64);
            }
         }

         field328[(field338 += 1222866659) * 1375698635 - 1] = var43.toString();
         return 1;
      } else if (4120 == var0) {
         String var19 = (String)field328[(field338 -= 1222866659) * 1375698635];
         int var42 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var19.indexOf(var42);
         return 1;
      } else if (4121 == var0) {
         field338 -= -1849233978;
         String var18 = (String)field328[field338 * 1375698635];
         String var41 = (String)field328[field338 * 1375698635 + 1];
         int var54 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var18.indexOf(var41, var54);
         return 1;
      } else if (var0 == 4122) {
         String var17 = (String)field328[(field338 -= 1222866659) * 1375698635];
         field328[(field338 += 1222866659) * 1375698635 - 1] = var17.toUpperCase();
         return 1;
      } else if (var0 == 4123) {
         field338 -= -626367319;
         String var16 = (String)field328[1375698635 * field338];
         String var4 = (String)field328[1375698635 * field338 + 1];
         String var53 = (String)field328[2 + 1375698635 * field338];
         Player var59 = classMB.method7521(-1643059220);
         if (null != var59 && var59.field1285 != null) {
            switch (var59.field1285.field4093 * -513083879) {
               case 0:
                  field328[(field338 += 1222866659) * 1375698635 - 1] = var16;
                  break;
               case 1:
                  field328[(field338 += 1222866659) * 1375698635 - 1] = var4;
                  break;
               case 2:
               default:
                  field328[(field338 += 1222866659) * 1375698635 - 1] = var53;
            }

            return 1;
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var53;
            return 1;
         }
      } else if (4124 == var0) {
         Player var15 = classMB.method7521(1756130251);
         if (var15 != null && var15.field1285 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var15.field1285.field4093 * -513083879;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         }

         return 1;
      } else if (var0 == 4125) {
         long var14 = field322[(classXT.field6939 -= -1297854163) * 18294437];
         field328[(field338 += 1222866659) * 1375698635 - 1] = Long.toString(var14);
         return 1;
      } else if (4126 != var0) {
         if (var0 == 4127) {
            String var13 = (String)field328[(field338 -= 1222866659) * 1375698635];

            try {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = Integer.parseInt(var13);
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
            } catch (NumberFormatException var12) {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         long var3 = field322[(classXT.field6939 -= -1297854163) * 18294437];
         String var5 = (String)field328[(field338 -= 1222866659) * 1375698635];
         String var6;
         if (var3 == 0L) {
            var6 = "0";
         } else if (!var5.isEmpty()) {
            boolean var7 = var3 < 0L;
            long var8 = var7 ? -var3 : var3;
            StringBuilder var10 = new StringBuilder();

            for (int var11 = 1; var8 > 0L; var11++) {
               var10.insert(0, var8 % 10L);
               var8 /= 10L;
               if (var8 > 0L && 0 == var11 % 3) {
                  var10.insert(0, ",");
               }
            }

            if (var7) {
               var10.insert(0, '-');
            }

            var6 = var10.toString();
         } else {
            var6 = Long.toString(var3);
         }

         field328[(field338 += 1222866659) * 1375698635 - 1] = var6;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hl")
   static int method896(int var0, Script var1, boolean var2) {
      if (6500 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classKB.method6447(1882095306) ? 1 : 0;
         return 1;
      } else if (var0 == 6501) {
         World var15 = classIV.method6319(-1141157668);
         if (var15 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 851246551 * var15.field1162;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -458552905 * var15.field1163;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var15.field1167;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -288138629 * var15.field1160;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 597852065 * var15.field1161;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var15.field1169;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         }

         return 1;
      } else if (6502 == var0) {
         World var14 = classSX.method10711(-1953402072);
         if (null != var14) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var14.field1162 * 851246551;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var14.field1163 * -458552905;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var14.field1167;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -288138629 * var14.field1160;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var14.field1161 * 597852065;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var14.field1169;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         }

         return 1;
      } else if (var0 == 6506) {
         int var13 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         World var22 = null;

         for (int var28 = 0; var28 < World.field1153 * -622036481; var28++) {
            if (World.field1170[var28].field1162 * 851246551 == var13) {
               var22 = World.field1170[var28];
               break;
            }
         }

         if (var22 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var22.field1162 * 851246551;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -458552905 * var22.field1163;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var22.field1167;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -288138629 * var22.field1160;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 597852065 * var22.field1161;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var22.field1169;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         }

         return 1;
      } else if (6507 == var0) {
         DynamicObject.field1679 -= 480164916;
         int var12 = field323[DynamicObject.field1679 * -324749371];
         boolean var21 = field323[DynamicObject.field1679 * -324749371 + 1] == 1;
         int var27 = field323[2 + DynamicObject.field1679 * -324749371];
         boolean var6 = field323[3 + -324749371 * DynamicObject.field1679] == 1;
         classRD.method9948(var12, var21, var27, var6, -83503059);
         return 1;
      } else if (6511 != var0) {
         if (6512 == var0) {
            client.field1003 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
            return 1;
         } else if (var0 == 6513) {
            DynamicObject.field1679 -= 240082458;
            int var11 = field323[-324749371 * DynamicObject.field1679];
            int var20 = field323[1 + DynamicObject.field1679 * -324749371];
            classPN var26 = classNE.method7829(var20, (byte)14);
            if (classPN.method9026(var26, (byte)2)) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = classOH.method8448(var11, -2022500978).method8967(var20, var26.field5351, -1754540313);
            } else if (var26.method9028((byte)7)) {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classOH.method8448(var11, -940691613)
                  .method8963(var20, 3335646069137558745L * var26.field5354);
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classPL.method8961(
                  classOH.method8448(var11, 85958043), var20, var26.field5352 * -1601970641, 510866680
               );
            }

            return 1;
         } else if (var0 == 6514) {
            DynamicObject.field1679 -= 240082458;
            int var10 = field323[-324749371 * DynamicObject.field1679];
            int var19 = field323[-324749371 * DynamicObject.field1679 + 1];
            classPN var25 = classNE.method7829(var19, (byte)-40);
            if (classPN.method9026(var25, (byte)2)) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = classMU.method7729(var10, 1491095755).method8563(var19, var25.field5351, 1238797461);
            } else if (var25.method9028((byte)92)) {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classMU.method7729(var10, 1262301564)
                  .method8558(var19, var25.field5354 * 3335646069137558745L);
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classMU.method7729(var10, 1956157381)
                  .method8556(var19, -1601970641 * var25.field5352, -536650331);
            }

            return 1;
         } else if (var0 == 6515) {
            DynamicObject.field1679 -= 240082458;
            int var9 = field323[-324749371 * DynamicObject.field1679];
            int var18 = field323[1 + DynamicObject.field1679 * -324749371];
            classPN var24 = classNE.method7829(var18, (byte)-65);
            if (classPN.method9026(var24, (byte)2)) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = classOB.method8299(var9, (byte)-3).method8694(var18, var24.field5351, -315805732);
            } else if (var24.method9028((byte)13)) {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classOB.method8299(var9, (byte)13)
                  .method8691(var18, 3335646069137558745L * var24.field5354);
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classOB.method8299(var9, (byte)6)
                  .method8687(var18, -1601970641 * var24.field5352, 1402939911);
            }

            return 1;
         } else if (6516 == var0) {
            DynamicObject.field1679 -= 240082458;
            int var8 = field323[DynamicObject.field1679 * -324749371];
            int var17 = field323[1 + DynamicObject.field1679 * -324749371];
            classPN var23 = classNE.method7829(var17, (byte)32);
            if (classPN.method9026(var23, (byte)2)) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = classUY.method11710(var8, 64572192).method9177(var17, var23.field5351, (short)-10646);
            } else if (var23.method9028((byte)9)) {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classPR.method9173(
                  classUY.method11710(var8, 64572192), var17, 3335646069137558745L * var23.field5354
               );
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classUY.method11710(var8, 64572192)
                  .method9169(var17, var23.field5352 * -1601970641, (byte)126);
            }

            return 1;
         } else if (6518 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field890 ? 1 : 0;
            return 1;
         } else if (var0 == 6519) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field888 * 461082519;
            return 1;
         } else if (var0 == 6520) {
            return 1;
         } else if (6521 == var0) {
            return 1;
         } else if (var0 == 6522) {
            field338 -= 1222866659;
            DynamicObject.field1679 -= 120041229;
            return 1;
         } else if (6523 == var0) {
            field338 -= 1222866659;
            DynamicObject.field1679 -= 120041229;
            return 1;
         } else if (6524 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            return 1;
         } else if (6525 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
            return 1;
         } else if (var0 == 6526) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
            return 1;
         } else if (6527 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -372108587 * client.field889;
            return 1;
         } else if (var0 == 6528) {
            DynamicObject.field1679 -= 240082458;
            int var7 = field323[-324749371 * DynamicObject.field1679];
            int var16 = field323[-324749371 * DynamicObject.field1679 + 1];
            classPN var5 = classNE.method7829(var16, (byte)-78);
            if (classPN.method9026(var5, (byte)2)) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = classMR.method7647(var7, (byte)-20).method8308(var16, var5.field5351, (byte)-55);
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classMR.method7647(var7, (byte)93)
                  .method8306(var16, -1601970641 * var5.field5352, (byte)0);
            }

            return 1;
         } else if (var0 == 6531) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 240;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
            return 1;
         } else {
            return 2;
         }
      } else {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (var3 >= 0 && var3 < -622036481 * World.field1153) {
            World var4 = World.field1170[var3];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field1162 * 851246551;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -458552905 * var4.field1163;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var4.field1167;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -288138629 * var4.field1160;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 597852065 * var4.field1161;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var4.field1169;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fd")
   static int method844(int var0, Script var1, boolean var2) {
      Widget var3 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)104);
      if (var0 == 2500) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4281 * 744286069;
         return 1;
      } else if (2501 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1570844829 * var3.field4257;
         return 1;
      } else if (var0 == 2502) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4249 * 1115597881;
         return 1;
      } else if (2503 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 293773697 * var3.field4259;
         return 1;
      } else if (var0 == 2504) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4289 ? 1 : 0;
         return 1;
      } else if (2505 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.field4342 * -1502647899;
         return 1;
      } else if (2506 != var0) {
         return 2;
      } else {
         int var4 = var3.field4342 * -1502647899;
         if (-1 == var4) {
            classVV var5 = classWK.field6691;

            for (InterfaceParent var6 = (InterfaceParent)var5.field6613.method13375();
               null != var6;
               var6 = (InterfaceParent)IndexedObjectSet.method13401(var5.field6613)
            ) {
               if (-1163656551 * var3.field4329 >> 16 == var6.field5276 * 2023647411) {
                  var4 = (int)var6.field6552;
                  break;
               }
            }
         }

         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hg")
   static int method898(int var0, Script var1, boolean var2) {
      WorldMap var3 = classIO.method6230((byte)-111);
      if (-254585554 == var0) {
         classKY var39 = classOA.method8290(1544651080);
         if (classKY.method6630(var39, -1989588571)) {
            var3.method12418(1521176014 * var39.field4057, var39.field4055 * -1915164571, 819227381 * var39.field4056, true, (short)28249);
         }

         return 1;
      } else if (var0 == -1432904082) {
         int var38 = field323[(DynamicObject.field1679 -= -1913222186) * -324749371];
         String var56 = "";
         WorldMapArea var60 = var3.method12486(var38, 1984837917);
         if (null != var60) {
            var56 = var60.method5861(-500044624);
         }

         field328[(field338 += 1222866659) * -925384193 - 1] = var56;
         return 1;
      } else if (var0 == 6602) {
         int var37 = field323[(DynamicObject.field1679 -= 577204732) * 61911758];
         var3.method12423(var37, -1402024340);
         return 1;
      } else if (6603 == var0) {
         field323[(DynamicObject.field1679 += 851233192) * -324749371 - 1] = var3.method12477((byte)-117);
         return 1;
      } else if (-1580995345 == var0) {
         int var36 = field323[(DynamicObject.field1679 -= 120041229) * 424116826];
         var3.method12478(var36, 945231587);
         return 1;
      } else if (6605 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.method12483(1397324973) ? 1 : 0;
         return 1;
      } else if (-1922548812 == var0) {
         classKY var35 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         var3.method12491(var35.field4055 * 1870919123, 315846311 * var35.field4056, (byte)-52);
         return 1;
      } else if (6607 == var0) {
         classKY var34 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         WorldMap.method12500(var3, var34.field4055 * 1870919123, var34.field4056 * -227995111, -546443172);
         return 1;
      } else if (var0 == 6608) {
         classKY var33 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -1981454048]);
         var3.method12503(var33.field4057 * -210579119, var33.field4055 * 1361963339, 201756244 * var33.field4056, (byte)1);
         return 1;
      } else if (6609 == var0) {
         classKY var32 = new classKY(field323[(DynamicObject.field1679 -= -1992311739) * -324749371]);
         var3.method12504(var32.field4057 * -92552629, var32.field4055 * 1870919123, var32.field4056 * 819227381, (byte)0);
         return 1;
      } else if (1282560672 == var0) {
         field323[(DynamicObject.field1679 += -464347104) * -324749371 - 1] = var3.method12509(1449770385);
         field323[(DynamicObject.field1679 += -1440534735) * -897951307 - 1] = var3.method12511(-1101142705);
         return 1;
      } else if (var0 == 83550764) {
         int var31 = field323[(DynamicObject.field1679 -= -311915123) * 1429418384];
         WorldMapArea var55 = var3.method12486(var31, 2053758614);
         if (null == var55) {
            field323[(DynamicObject.field1679 += 1530697345) * -324749371 - 1] = 0;
         } else {
            field323[(DynamicObject.field1679 += 716811713) * 885259564 - 1] = var55.method5902(-1965218289).method6619(-2087128888);
         }

         return 1;
      } else if (6612 == var0) {
         int var30 = field323[(DynamicObject.field1679 -= -1004610300) * -1639699008];
         WorldMapArea var54 = var3.method12486(var30, 1779002610);
         if (var54 == null) {
            field323[(DynamicObject.field1679 += 1863242653) * -377926863 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (WorldMapArea.method5873(var54, -2035376396) - var54.method5871(2131377841) + 1)
               * 64;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (
                  WorldMapArea.method5884(var54, -2143732857) - WorldMapArea.method5880(var54, (short)-20481) + 1
               )
               * 622334563;
         }

         return 1;
      } else if (6613 == var0) {
         int var29 = field323[(DynamicObject.field1679 -= 120041229) * -1159228946];
         WorldMapArea var53 = var3.method12486(var29, 1703810888);
         if (var53 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -871374550 - 1] = 0;
         } else {
            field323[(DynamicObject.field1679 += -1889268905) * -324749371 - 1] = var53.method5871(2101282665) * 64;
            field323[(DynamicObject.field1679 += 861481895) * 633710263 - 1] = WorldMapArea.method5880(var53, (short)-15808) * 2082309453;
            field323[(DynamicObject.field1679 += 1316757710) * -324749371 - 1] = WorldMapArea.method5873(var53, -2088396647) * -1690510151 + -1404985922 - 1;
            field323[(DynamicObject.field1679 += -1713483710) * -324749371 - 1] = WorldMapArea.method5884(var53, -2124718295) * -1691655621 + 64 - 1;
         }

         return 1;
      } else if (-596527628 == var0) {
         int var28 = field323[(DynamicObject.field1679 -= 562144761) * -585227827];
         WorldMapArea var52 = var3.method12486(var28, 1689565643);
         if (null == var52) {
            field323[(DynamicObject.field1679 += 120041229) * 1538954970 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 1035035177) * 21913303 - 1] = WorldMapArea.method5867(var52, (byte)71);
         }

         return 1;
      } else if (926226450 == var0) {
         classKY var27 = var3.method12513(2007324413);
         if (null == var27) {
            field323[(DynamicObject.field1679 += 120041229) * -606983999 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var27.field4055 * 555416082;
            field323[(DynamicObject.field1679 += 1548724473) * -324749371 - 1] = var27.field4056 * 1614482201;
         }

         return 1;
      } else if (6616 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.method12424(-1156313656);
         return 1;
      } else if (748691609 == var0) {
         classKY var26 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * 1386693359]);
         WorldMapArea var51 = var3.method12427(-539086250);
         if (var51 == null) {
            field323[(DynamicObject.field1679 += 640039973) * -2089494490 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            return 1;
         } else {
            int[] var59 = WorldMapArea.method5841(var51, -210579119 * var26.field4057, -1896209908 * var26.field4055, 819227381 * var26.field4056, (short)18920);
            if (var59 == null) {
               field323[(DynamicObject.field1679 += 403638508) * -2081256334 - 1] = -1;
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var59[0];
               field323[(DynamicObject.field1679 += 120041229) * -1903003364 - 1] = var59[1];
            }

            return 1;
         }
      } else if (var0 == 1758542873) {
         classKY var25 = new classKY(field323[(DynamicObject.field1679 -= -1767966916) * -324749371]);
         WorldMapArea var50 = var3.method12427(-539086250);
         if (var50 == null) {
            field323[(DynamicObject.field1679 += -554387316) * -790144979 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            return 1;
         } else {
            classKY var58 = var50.method5844(1377489806 * var25.field4055, 819227381 * var25.field4056, (byte)15);
            if (null == var58) {
               field323[(DynamicObject.field1679 += 120041229) * -1529069527 - 1] = -1;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -1897797382 - 1] = var58.method6619(-2103665130);
            }

            return 1;
         }
      } else if (var0 == 6619) {
         DynamicObject.field1679 -= -109837538;
         int var24 = field323[DynamicObject.field1679 * 785279435];
         classKY var49 = new classKY(field323[-324749371 * DynamicObject.field1679 + 1]);
         classPC.method8841(var24, var49, false, -369294327);
         return 1;
      } else if (6620 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var23 = field323[27944692 * DynamicObject.field1679];
         classKY var48 = new classKY(field323[DynamicObject.field1679 * -324749371 + 1]);
         classPC.method8841(var23, var48, true, -156794231);
         return 1;
      } else if (var0 == 6621) {
         DynamicObject.field1679 -= 240082458;
         int var22 = field323[DynamicObject.field1679 * -324749371];
         classKY var47 = new classKY(field323[-484364491 * DynamicObject.field1679 + 1]);
         WorldMapArea var57 = var3.method12486(var22, 1900575039);
         if (null == var57) {
            field323[(DynamicObject.field1679 += -438247836) * -324749371 - 1] = 0;
            return 1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMapArea.method5835(
                  var57, var47.field4057 * -210579119, 1092286439 * var47.field4055, 819227381 * var47.field4056, (byte)78
               )
               ? 1
               : 0;
            return 1;
         }
      } else if (6622 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * 777034918 - 1] = WorldMap.method12518(var3, (byte)84);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.method12519(577276626);
         return 1;
      } else if (var0 == 6623) {
         classKY var21 = new classKY(field323[(DynamicObject.field1679 -= -2135360) * -324749371]);
         WorldMapArea var46 = var3.method12416(-210579119 * var21.field4057, -1254583660 * var21.field4055, 819227381 * var21.field4056, (byte)23);
         if (null == var46) {
            field323[(DynamicObject.field1679 += 800832208) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * 1436878203 - 1] = var46.method5848(-608589044);
         }

         return 1;
      } else if (var0 == 6624) {
         var3.method12523(field323[(DynamicObject.field1679 -= 492384153) * 1483129726], (byte)22);
         return 1;
      } else if (var0 == 843432640) {
         var3.method12525((byte)42);
         return 1;
      } else if (6626 == var0) {
         WorldMap.method12528(var3, field323[(DynamicObject.field1679 -= 120041229) * -2128208730], -251530176);
         return 1;
      } else if (var0 == 16836299) {
         var3.method12533((byte)68);
         return 1;
      } else if (var0 == -922550102) {
         boolean var20 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         var3.method12537(var20, -1205676160);
         return 1;
      } else if (var0 == 948833963) {
         int var19 = field323[(DynamicObject.field1679 -= 437721693) * -953634808];
         var3.method12541(var19, (byte)-1);
         return 1;
      } else if (6630 == var0) {
         int var18 = field323[(DynamicObject.field1679 -= 501456681) * -1616740958];
         var3.method12544(var18, 2128877423);
         return 1;
      } else if (6631 == var0) {
         var3.method12546(2085062067);
         return 1;
      } else if (var0 == -1035494105) {
         boolean var17 = field323[(DynamicObject.field1679 -= 120041229) * -1955595987] == 1;
         WorldMap.method12556(var3, var17, (byte)20);
         return 1;
      } else if (-2126985243 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var16 = field323[1602732339 * DynamicObject.field1679];
         boolean var45 = 1 == field323[1 + DynamicObject.field1679 * 268770901];
         var3.method12549(var16, var45, -1394017539);
         return 1;
      } else if (6634 == var0) {
         DynamicObject.field1679 -= 909042474;
         int var15 = field323[-324749371 * DynamicObject.field1679];
         boolean var44 = field323[DynamicObject.field1679 * -324749371 + 1] == 1;
         var3.method12552(var15, var44, (byte)51);
         return 1;
      } else if (6635 == var0) {
         field323[(DynamicObject.field1679 += 845413021) * -324749371 - 1] = WorldMap.method12555(var3, -1496912100) ? 1 : 0;
         return 1;
      } else if (-1115700253 == var0) {
         int var14 = field323[(DynamicObject.field1679 -= -603646372) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -780067720 - 1] = WorldMap.method12559(var3, var14, (byte)14) ? 1 : 0;
         return 1;
      } else if (var0 == 6637) {
         int var13 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMap.method12563(var3, var13, -1896320993) ? 1 : 0;
         return 1;
      } else if (6638 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var12 = field323[1918425521 * DynamicObject.field1679];
         classKY var43 = new classKY(field323[1 + -324749371 * DynamicObject.field1679]);
         classKY var6 = var3.method12579(var12, var43, 241883862);
         if (null == var6) {
            field323[(DynamicObject.field1679 += -1413256087) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 1382361685) * -324749371 - 1] = var6.method6619(-1585678019);
         }

         return 1;
      } else if (-22359978 == var0) {
         AbstractWorldMapIcon var11 = var3.method12585((short)-12522);
         if (null == var11) {
            field323[(DynamicObject.field1679 += -1862251660) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 385631773) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -246341470 - 1] = var11.vmethod486((byte)-12);
            field323[(DynamicObject.field1679 += 1343066565) * -324749371 - 1] = var11.field2769.method6619(-2060516089);
         }

         return 1;
      } else if (var0 == 6640) {
         AbstractWorldMapIcon var10 = var3.method12588((byte)-43);
         if (var10 == null) {
            field323[(DynamicObject.field1679 += 2043135034) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 1032964891) * 258057310 - 1] = var10.vmethod486((byte)-126);
            field323[(DynamicObject.field1679 += 2054981546) * 1232784029 - 1] = var10.field2769.method6619(-1905755174);
         }

         return 1;
      } else if (1369068363 == var0) {
         int var9 = field323[(DynamicObject.field1679 -= -1139165737) * -324749371];
         WorldMapElement var42 = SceneTilePaint.method4796(var9, (byte)-108);
         if (null == var42.field5412) {
            field328[(field338 += 1222866659) * 640692663 - 1] = "";
         } else {
            field328[(field338 += 1222866659) * 815115385 - 1] = var42.field5412;
         }

         return 1;
      } else if (var0 == 6694) {
         int var8 = field323[(DynamicObject.field1679 -= 1915839176) * -324749371];
         WorldMapElement var41 = SceneTilePaint.method4796(var8, (byte)-61);
         field323[(DynamicObject.field1679 += 120041229) * -608901176 - 1] = var41.field5394 * 1299135442;
         return 1;
      } else if (var0 == 6695) {
         int var7 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapElement var40 = SceneTilePaint.method4796(var7, (byte)-8);
         if (var40 == null) {
            field323[(DynamicObject.field1679 += 120041229) * 237972675 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1254355271 * var40.field5404;
         }

         return 1;
      } else if (var0 == 567123306) {
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapElement var5 = SceneTilePaint.method4796(var4, (byte)-76);
         if (var5 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var5.field5395 * 1274039073;
         }

         return 1;
      } else if (var0 == 6697) {
         field323[(DynamicObject.field1679 += 708879820) * 715912944 - 1] = classAC.field132.field2897 * 1510195254;
         return 1;
      } else if (var0 == 1488988245) {
         field323[(DynamicObject.field1679 += 120041229) * -1623490425 - 1] = classAC.field132.field2896.method6619(-1904281595);
         return 1;
      } else if (var0 == 6699) {
         field323[(DynamicObject.field1679 += -1006475855) * -550963452 - 1] = classAC.field132.field2895.method6619(-2124807090);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hx")
   static int method899(int var0, Script var1, boolean var2) {
      WorldMap var3 = classIO.method6230((byte)-119);
      if (6600 == var0) {
         classKY var39 = classOA.method8290(1544651080);
         if (classKY.method6630(var39, -1922635782)) {
            var3.method12418(-210579119 * var39.field4057, var39.field4055 * 1870919123, 819227381 * var39.field4056, true, (short)28249);
         }

         return 1;
      } else if (var0 == 6601) {
         int var38 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         String var56 = "";
         WorldMapArea var60 = var3.method12486(var38, 2008355889);
         if (null != var60) {
            var56 = var60.method5861(-500044624);
         }

         field328[(field338 += 1222866659) * 1375698635 - 1] = var56;
         return 1;
      } else if (var0 == 6602) {
         int var37 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var3.method12423(var37, -449136923);
         return 1;
      } else if (6603 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.method12477((byte)-75);
         return 1;
      } else if (6604 == var0) {
         int var36 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var3.method12478(var36, 945231587);
         return 1;
      } else if (6605 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.method12483(2135764771) ? 1 : 0;
         return 1;
      } else if (6606 == var0) {
         classKY var35 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         var3.method12491(var35.field4055 * 1870919123, 819227381 * var35.field4056, (byte)-103);
         return 1;
      } else if (6607 == var0) {
         classKY var34 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         WorldMap.method12500(var3, var34.field4055 * 1870919123, var34.field4056 * 819227381, -1632108990);
         return 1;
      } else if (var0 == 6608) {
         classKY var33 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         var3.method12503(var33.field4057 * -210579119, var33.field4055 * 1870919123, 819227381 * var33.field4056, (byte)1);
         return 1;
      } else if (6609 == var0) {
         classKY var32 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         var3.method12504(var32.field4057 * -210579119, var32.field4055 * 1870919123, var32.field4056 * 819227381, (byte)0);
         return 1;
      } else if (6610 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.method12509(1919911739);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.method12511(2137963350);
         return 1;
      } else if (var0 == 6611) {
         int var31 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapArea var55 = var3.method12486(var31, 2131580796);
         if (null == var55) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var55.method5902(-1710079210).method6619(-1799047031);
         }

         return 1;
      } else if (6612 == var0) {
         int var30 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapArea var54 = var3.method12486(var30, 1997544426);
         if (var54 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (WorldMapArea.method5873(var54, -2128764213) - var54.method5871(2059062389) + 1)
               * 64;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (
                  WorldMapArea.method5884(var54, -1686123238) - WorldMapArea.method5880(var54, (short)-28176) + 1
               )
               * 64;
         }

         return 1;
      } else if (6613 == var0) {
         int var29 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapArea var53 = var3.method12486(var29, 2104006714);
         if (var53 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var53.method5871(2108667991) * 64;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMapArea.method5880(var53, (short)-13853) * 64;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMapArea.method5873(var53, -2137373868) * 64 + 64 - 1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMapArea.method5884(var53, -1455256935) * 64 + 64 - 1;
         }

         return 1;
      } else if (6614 == var0) {
         int var28 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapArea var52 = var3.method12486(var28, 2131525154);
         if (null == var52) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMapArea.method5867(var52, (byte)115);
         }

         return 1;
      } else if (6615 == var0) {
         classKY var27 = var3.method12513(2138212384);
         if (null == var27) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var27.field4055 * 1870919123;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var27.field4056 * 819227381;
         }

         return 1;
      } else if (6616 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.method12424(-1703596786);
         return 1;
      } else if (6617 == var0) {
         classKY var26 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         WorldMapArea var51 = var3.method12427(-539086250);
         if (var51 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            return 1;
         } else {
            int[] var59 = WorldMapArea.method5841(var51, -210579119 * var26.field4057, 1870919123 * var26.field4055, 819227381 * var26.field4056, (short)-10883);
            if (var59 == null) {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var59[0];
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var59[1];
            }

            return 1;
         }
      } else if (var0 == 6618) {
         classKY var25 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         WorldMapArea var50 = var3.method12427(-539086250);
         if (var50 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            return 1;
         } else {
            classKY var58 = var50.method5844(1870919123 * var25.field4055, 819227381 * var25.field4056, (byte)77);
            if (null == var58) {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var58.method6619(-1808726179);
            }

            return 1;
         }
      } else if (var0 == 6619) {
         DynamicObject.field1679 -= 240082458;
         int var24 = field323[DynamicObject.field1679 * -324749371];
         classKY var49 = new classKY(field323[-324749371 * DynamicObject.field1679 + 1]);
         classPC.method8841(var24, var49, false, -1026119653);
         return 1;
      } else if (6620 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var23 = field323[-324749371 * DynamicObject.field1679];
         classKY var48 = new classKY(field323[DynamicObject.field1679 * -324749371 + 1]);
         classPC.method8841(var23, var48, true, -1785673367);
         return 1;
      } else if (var0 == 6621) {
         DynamicObject.field1679 -= 240082458;
         int var22 = field323[DynamicObject.field1679 * -324749371];
         classKY var47 = new classKY(field323[-324749371 * DynamicObject.field1679 + 1]);
         WorldMapArea var57 = var3.method12486(var22, 1843058872);
         if (null == var57) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMapArea.method5835(
                  var57, var47.field4057 * -210579119, 1870919123 * var47.field4055, 819227381 * var47.field4056, (byte)91
               )
               ? 1
               : 0;
            return 1;
         }
      } else if (6622 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMap.method12518(var3, (byte)7);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.method12519(-321736779);
         return 1;
      } else if (var0 == 6623) {
         classKY var21 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         WorldMapArea var46 = var3.method12416(-210579119 * var21.field4057, 1870919123 * var21.field4055, 819227381 * var21.field4056, (byte)37);
         if (null == var46) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var46.method5848(-608589044);
         }

         return 1;
      } else if (var0 == 6624) {
         var3.method12523(field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)53);
         return 1;
      } else if (var0 == 6625) {
         var3.method12525((byte)22);
         return 1;
      } else if (6626 == var0) {
         WorldMap.method12528(var3, field323[(DynamicObject.field1679 -= 120041229) * -324749371], -163110085);
         return 1;
      } else if (var0 == 6627) {
         var3.method12533((byte)9);
         return 1;
      } else if (var0 == 6628) {
         boolean var20 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         var3.method12537(var20, -746285686);
         return 1;
      } else if (var0 == 6629) {
         int var19 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var3.method12541(var19, (byte)-1);
         return 1;
      } else if (6630 == var0) {
         int var18 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var3.method12544(var18, 1832173976);
         return 1;
      } else if (6631 == var0) {
         var3.method12546(1969789293);
         return 1;
      } else if (var0 == 6632) {
         boolean var17 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         WorldMap.method12556(var3, var17, (byte)3);
         return 1;
      } else if (6633 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var16 = field323[-324749371 * DynamicObject.field1679];
         boolean var45 = 1 == field323[1 + DynamicObject.field1679 * -324749371];
         var3.method12549(var16, var45, -1852172260);
         return 1;
      } else if (6634 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var15 = field323[-324749371 * DynamicObject.field1679];
         boolean var44 = field323[DynamicObject.field1679 * -324749371 + 1] == 1;
         var3.method12552(var15, var44, (byte)51);
         return 1;
      } else if (6635 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMap.method12555(var3, 1729559117) ? 1 : 0;
         return 1;
      } else if (6636 == var0) {
         int var14 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMap.method12559(var3, var14, (byte)5) ? 1 : 0;
         return 1;
      } else if (var0 == 6637) {
         int var13 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMap.method12563(var3, var13, -1803781693) ? 1 : 0;
         return 1;
      } else if (6638 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var12 = field323[-324749371 * DynamicObject.field1679];
         classKY var43 = new classKY(field323[1 + -324749371 * DynamicObject.field1679]);
         classKY var6 = var3.method12579(var12, var43, 241883862);
         if (null == var6) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var6.method6619(-1681885139);
         }

         return 1;
      } else if (6639 == var0) {
         AbstractWorldMapIcon var11 = var3.method12585((short)-10864);
         if (null == var11) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var11.vmethod486((byte)-77);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var11.field2769.method6619(-1594666774);
         }

         return 1;
      } else if (var0 == 6640) {
         AbstractWorldMapIcon var10 = var3.method12588((byte)-86);
         if (var10 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var10.vmethod486((byte)-90);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var10.field2769.method6619(-1586303161);
         }

         return 1;
      } else if (6693 == var0) {
         int var9 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapElement var42 = SceneTilePaint.method4796(var9, (byte)-56);
         if (null == var42.field5412) {
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var42.field5412;
         }

         return 1;
      } else if (var0 == 6694) {
         int var8 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapElement var41 = SceneTilePaint.method4796(var8, (byte)-104);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var41.field5394 * 1698532127;
         return 1;
      } else if (var0 == 6695) {
         int var7 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapElement var40 = SceneTilePaint.method4796(var7, (byte)-27);
         if (var40 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1254355271 * var40.field5404;
         }

         return 1;
      } else if (var0 == 6696) {
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapElement var5 = SceneTilePaint.method4796(var4, (byte)-63);
         if (var5 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var5.field5395 * 1274039073;
         }

         return 1;
      } else if (var0 == 6697) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAC.field132.field2897 * -753629693;
         return 1;
      } else if (var0 == 6698) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAC.field132.field2896.method6619(-1955541511);
         return 1;
      } else if (var0 == 6699) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAC.field132.field2895.method6619(-1637603493);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;III)V")
   @ObfuscatedName("es")
   static final void method819(Widget var0, int var1, int var2, int var3) {
      if (null == var0.field4370) {
         throw new RuntimeException();
      } else {
         var0.field4370[var1] = var2;
         var0.field4371[var1] = var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hk")
   static int method903(int var0, Script var1, boolean var2) {
      if (var0 == 6754) {
         int var6 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classPL var7 = classOH.method8448(var6, 2124589499);
         field328[(field338 += 1222866659) * 1375698635 - 1] = null != var7 ? var7.method8994((byte)-75) : "";
         return 1;
      } else if (6764 == var0) {
         DynamicObject.field1679 -= 240082458;
         classPL var5 = classOH.method8448(field323[-324749371 * DynamicObject.field1679], -1220143525);
         int var4 = field323[1 + DynamicObject.field1679 * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var5.method8977(var4, (byte)-18);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var5.method8984(var4, (byte)-77);
         return 1;
      } else if (var0 == 6765) {
         classPL var3 = classOH.method8448(field323[(DynamicObject.field1679 -= 120041229) * -324749371], 1677062666);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3 != null ? 1781570005 * var3.field5320 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("ic")
   static Object method936(int var0) {
      return -1 == var0 ? null : classAB.method308((classYY)classOF.method8404(classYY.method13782((byte)-76), var0, 32605052), -1683858605);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hv")
   static int method911(int var0, Script var1, boolean var2) {
      if (7108 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classTB.method10736(807311155) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gk")
   static int method871(int var0, Script var1, boolean var2) {
      if (3800 == var0) {
         if (null != classBM.field513) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
            classNJ.field4678 = classBM.field513;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (3801 == var0) {
         int var18 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (client.field865[var18] != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
            classNJ.field4678 = client.field865[var18];
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (var0 == 3802) {
         field328[(field338 += 1222866659) * 1375698635 - 1] = classNJ.field4678.field3016;
         return 1;
      } else if (var0 == 3803) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3034 ? 1 : 0;
         return 1;
      } else if (var0 == 3804) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3023;
         return 1;
      } else if (3805 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3025;
         return 1;
      } else if (var0 == 3806) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3024;
         return 1;
      } else if (var0 == 3807) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3019;
         return 1;
      } else if (3809 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3028 * -1967686263;
         return 1;
      } else if (3810 == var0) {
         int var17 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field328[(field338 += 1222866659) * 1375698635 - 1] = classNJ.field4678.field3043[var17];
         return 1;
      } else if (var0 == 3811) {
         int var16 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3037[var16];
         return 1;
      } else if (var0 == 3812) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3027 * -845393113;
         return 1;
      } else if (var0 == 3813) {
         int var15 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field328[(field338 += 1222866659) * 1375698635 - 1] = classNJ.field4678.field3044[var15];
         return 1;
      } else if (3814 == var0) {
         DynamicObject.field1679 -= 360123687;
         int var14 = field323[-324749371 * DynamicObject.field1679];
         int var20 = field323[1 + DynamicObject.field1679 * -324749371];
         int var21 = field323[DynamicObject.field1679 * -324749371 + 2];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ClanSettings.method6244(classNJ.field4678, var14, var20, var21, -883211101);
         return 1;
      } else if (var0 == 3815) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3014 * -577292071;
         return 1;
      } else if (var0 == 3816) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1725108575 * classNJ.field4678.field3017;
         return 1;
      } else if (var0 == 3817) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classBE.method993(
            classNJ.field4678, (String)field328[(field338 -= 1222866659) * 1375698635], -725746906
         );
         return 1;
      } else if (3818 == var0) {
         field323[DynamicObject.field1679 * -324749371 - 1] = classNJ.field4678.method6249((byte)-99)[field323[DynamicObject.field1679 * -324749371 - 1]];
         return 1;
      } else if (var0 == 3819) {
         DynamicObject.field1679 -= 240082458;
         int var13 = field323[-324749371 * DynamicObject.field1679];
         int var19 = field323[-324749371 * DynamicObject.field1679 + 1];
         classVX.method12263(var19, var13, (byte)85);
         return 1;
      } else if (var0 == 3820) {
         int var12 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3039[var12];
         return 1;
      } else {
         if (3821 == var0) {
            DynamicObject.field1679 -= 360123687;
            int var3 = field323[DynamicObject.field1679 * -324749371];
            boolean var4 = field323[1 + DynamicObject.field1679 * -324749371] == 1;
            int var5 = field323[DynamicObject.field1679 * -324749371 + 2];
            VarbitComposition.method9217(var5, var3, var4, 1243158810);
         }

         if (3822 == var0) {
            int var11 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classNJ.field4678.field3045[var11] ? 1 : 0;
            return 1;
         } else if (var0 == 3850) {
            if (classKA.field3513 != null) {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
               classPO.field5368 = classKA.field3513;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3851) {
            int var10 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            if (null != client.field866[var10]) {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
               classPO.field5368 = client.field866[var10];
               classHU.field2891 = 1507670665 * var10;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3852) {
            field328[(field338 += 1222866659) * 1375698635 - 1] = classPO.field5368.field2948;
            return 1;
         } else if (3853 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classPO.field5368.field2950;
            return 1;
         } else if (3854 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classPO.field5368.field2949;
            return 1;
         } else if (3855 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ClanChannel.method6183(classPO.field5368, (byte)-82);
            return 1;
         } else if (var0 == 3856) {
            int var9 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            field328[(field338 += 1222866659) * 1375698635 - 1] = ((ClanChannelMember)classPO.field5368.field2955.get(var9)).field2846.method164(850006013);
            return 1;
         } else if (3857 == var0) {
            int var8 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ((ClanChannelMember)classPO.field5368.field2955.get(var8)).field2841;
            return 1;
         } else if (3858 == var0) {
            int var7 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = ((ClanChannelMember)classPO.field5368.field2955.get(var7)).field2842
               * -906550845;
            return 1;
         } else if (3859 == var0) {
            int var6 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            Message.method1496(-1270719559 * classHU.field2891, var6, 1454688642);
            return 1;
         } else if (var0 == 3860) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classPO.field5368
               .method6186((String)field328[(field338 -= 1222866659) * 1375698635], (byte)33);
            return 1;
         } else if (3861 == var0) {
            field323[DynamicObject.field1679 * -324749371 - 1] = ClanChannel.method6169(classPO.field5368, -1615407771)[field323[-324749371
                  * DynamicObject.field1679
               - 1]];
            return 1;
         } else if (3890 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != classOH.field4871 ? 1 : 0;
            return 1;
         } else {
            return 2;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hu")
   static int method905(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hj")
   static int method906(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hq")
   static int method908(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("il")
   static int method923(int var0, Script var1, boolean var2) {
      if (8000 == var0) {
         field338 -= -1197029938;
         classTE var37 = classJM.method6398(field328[1375698635 * field338], null, 1578948926);
         classTE var62 = (classTE)field328[1 + field338 * -505680404];
         classNI.method7860(var37, var62, -1362090046);
         return 1;
      } else if (8001 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var36 = field323[-324749371 * DynamicObject.field1679];
         int var61 = field323[1 + -324749371 * DynamicObject.field1679];
         classTE var79 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         classAS.method663(var79, var36, var61, (byte)0);
         return 1;
      } else if (var0 == 8002) {
         classTE var35 = (classTE)field328[(field338 -= 352226921) * 1375698635];
         field323[(DynamicObject.field1679 += -1583297741) * -1325762582 - 1] = null == var35 ? 1 : 0;
         return 1;
      } else if (var0 == 806037742) {
         classTE var34 = (classTE)field328[(field338 -= 1222866659) * 83177909];
         field323[(DynamicObject.field1679 += 120041229) * -1354075513 - 1] = var34 != null ? var34.method10756(-119902301) : 0;
         return 1;
      } else if (var0 == 1458222352) {
         field338 -= -1849233978;
         classTE var33 = (classTE)field328[field338 * -1284278575];
         classTE var60 = (classTE)field328[1 + field338 * 1375698635];
         field323[(DynamicObject.field1679 += 818187895) * -324749371 - 1] = classSY.method10714(var33, var60, -325353510);
         return 1;
      } else if (var0 == 8005) {
         DynamicObject.field1679 -= -1935226577;
         int var32 = field323[DynamicObject.field1679 * -324749371];
         int var59 = field323[DynamicObject.field1679 * -1417290181 + 1];
         int var78 = field323[DynamicObject.field1679 * -324749371 + 2];
         Object var85 = classKN.method6500(var78, -319912036);
         classTE var89 = (classTE)field328[(field338 -= -300375943) * -391605029];
         field323[(DynamicObject.field1679 += -706210501) * -324749371 - 1] = null != var89 ? classVS.method12082(var89, var85, var32, var59, 1782791469) : -1;
         return 1;
      } else if (222010161 == var0) {
         DynamicObject.field1679 -= 360123687;
         int var31 = field323[-324749371 * DynamicObject.field1679];
         int var58 = field323[1 + DynamicObject.field1679 * -324749371];
         int var77 = field323[-324749371 * DynamicObject.field1679 + 2];
         Object var84 = classKN.method6500(var77, 557722206);
         classTE var88 = (classTE)field328[(field338 -= 1222866659) * 748082787];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var88 != null ? classQP.method9699(var88, var84, var31, var58, (byte)0) : -1;
         return 1;
      } else if (8007 == var0) {
         DynamicObject.field1679 -= 360123687;
         int var30 = field323[DynamicObject.field1679 * -1426450693];
         int var57 = field323[1 + DynamicObject.field1679 * -324749371];
         int var76 = field323[DynamicObject.field1679 * -324749371 + 2];
         Object var83 = classKN.method6500(var76, -1377037930);
         classTE var87 = (classTE)field328[(field338 -= -1214369269) * 1488783007];
         field323[(DynamicObject.field1679 += -890644093) * 673684463 - 1] = var87 != null ? classGK.method5481(var87, var83, var30, var57, -746124030) : 0;
         return 1;
      } else if (var0 == 8008) {
         classTE var29 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         int var56 = classKV.method6570(var29, -1984844413);
         if (var29.field6128 == classYY.field7111) {
            field323[(DynamicObject.field1679 += 1426922196) * 467486249 - 1] = var56 >= 0 ? var29.method10748(956038110)[var56] : -1;
         } else {
            if (classYY.field7113 != var29.field6128) {
               throw new IllegalStateException();
            }

            String var75 = (String)(var56 >= 0 ? classTE.method10753(var29, -529258674)[var56] : null);
            field328[(field338 += 1222866659) * 1375698635 - 1] = null != var75 ? var75 : "";
         }

         return 1;
      } else if (var0 == 8009) {
         classTE var28 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         int var55 = classMB.method7520(var28, -485304721);
         if (classYY.field7111 == var28.field6128) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var55 >= 0 ? var28.method10748(-79807856)[var55] : -1;
         } else {
            if (classYY.field7113 != var28.field6128) {
               throw new IllegalStateException();
            }

            String var74 = (String)(var55 >= 0 ? classTE.method10753(var28, 818177523)[var55] : null);
            field328[(field338 += 1222866659) * 976443089 - 1] = null != var74 ? var74 : "";
         }

         return 1;
      } else if (59149634 == var0) {
         DynamicObject.field1679 -= 2056516634;
         int var27 = field323[-324749371 * DynamicObject.field1679];
         int var54 = field323[1 + -324749371 * DynamicObject.field1679];
         int var73 = field323[2 + -324749371 * DynamicObject.field1679];
         Object var82 = classKN.method6500(var73, -1711226485);
         classTE var86 = classJM.method6398(field328[(field338 -= -1997140862) * 1375698635], null, 1578948926);
         classAF.method340(var86, var82, var27, var54, -130796974);
         return 1;
      } else if (var0 == 1970589351) {
         DynamicObject.field1679 -= 1146357624;
         int var26 = field323[-324749371 * DynamicObject.field1679];
         int var53 = field323[1 + -1127711544 * DynamicObject.field1679];
         int var72 = field323[DynamicObject.field1679 * -324749371 + 2];
         classTE var81 = classJM.method6398(field328[(field338 -= 824492529) * 2034598131], null, 1578948926);
         classCN.method2553(var81, var26, 1, var53, var72, (byte)0);
         return 1;
      } else if (-1292466282 == var0) {
         classTE var25 = classJM.method6398(field328[(field338 -= 815938448) * 1711953690], null, 1578948926);
         classPH.method8891(var25, -1163247848);
         return 1;
      } else if (8013 == var0) {
         int var24 = field323[(DynamicObject.field1679 -= 418078707) * -324749371];
         classTE var52 = classJM.method6398(field328[(field338 -= -938928444) * -1752190959], null, 1578948926);
         classLD.method6745(var52, var24, (byte)50);
         return 1;
      } else if (var0 == 8014) {
         DynamicObject.field1679 -= -1695552613;
         int var23 = field323[-444604557 * DynamicObject.field1679];
         int var51 = field323[1 + DynamicObject.field1679 * -324749371];
         classTE var71 = classJM.method6398(field328[(field338 -= 1042477563) * 1375698635], null, 1578948926);
         classSG.method10417(var71, var23, var51, (byte)-8);
         return 1;
      } else if (8015 == var0) {
         DynamicObject.field1679 -= 360123687;
         int var22 = field323[DynamicObject.field1679 * -368759188];
         int var50 = field323[1609531768 * DynamicObject.field1679 + 1];
         int var70 = field323[DynamicObject.field1679 * 688239172 + 2];
         field338 -= -1665780687;
         classTE var80 = classJM.method6398(field328[field338 * 1375698635], null, 1578948926);
         classTE var7 = classJM.method6398(field328[1375698635 * field338 + 1], null, 1578948926);
         ObjectSound.method3676(var80, var7, var22, var50, var70, 1099327703);
         return 1;
      } else if (8016 == var0) {
         classTE var21 = classJM.method6398(field328[(field338 -= 1222866659) * 1284950431], null, 1578948926);
         field323[(DynamicObject.field1679 += 1619694893) * 535494652 - 1] = (int)classQA.method9429(var21, 816039510);
         return 1;
      } else if (var0 == 8017) {
         classTE var20 = classJM.method6398(field328[(field338 -= 1222866659) * 1334823215], null, 1578948926);
         int var49 = field323[(DynamicObject.field1679 -= 120041229) * 890790485];
         field323[(DynamicObject.field1679 += -1644540580) * -1787773083 - 1] = classFK.method4819(var20, var49, (byte)-46);
         return 1;
      } else if (535858071 == var0) {
         field338 -= -1849233978;
         String var18 = (String)field328[1375698635 * field338];
         String var48 = (String)field328[1 + field338 * -1534377488];
         var18 = classUP.method11420(var18, User.method10179(-789099236), field334, field333, (byte)0);
         field328[(field338 += 1222866659) * 2115175204 - 1] = classRK.method10013(var18, var48, 1641325450);
         return 1;
      } else if (var0 == 1530244662) {
         field338 -= -1849233978;
         classTE var17 = classJM.method6398(field328[1375698635 * field338], null, 1578948926);
         String var47 = (String)field328[field338 * 1088224333 + 1];
         field328[(field338 += 1222866659) * -1620306121 - 1] = classLI.method7107(var17, var47, -1644804114);
         return 1;
      } else if (8020 == var0) {
         DynamicObject.field1679 -= 240082458;
         char var16 = (char)field323[DynamicObject.field1679 * -324749371];
         int var46 = field323[-324749371 * DynamicObject.field1679 + 1];
         EnumComposition var69 = classKD.method6461(var46, 1883047481);
         if (!EnumComposition.method8345(var69, var16, 1967678048)) {
            throw new RuntimeException();
         } else {
            field328[(field338 += 865405754) * 1375698635 - 1] = var69.method8319((short)24269);
            return 1;
         }
      } else if (var0 == 8021) {
         DynamicObject.field1679 -= 240082458;
         int var15 = field323[-324749371 * DynamicObject.field1679];
         int var45 = field323[-856753441 * DynamicObject.field1679 + 1];
         EnumComposition var68 = classKD.method6461(var45, 1652474675);
         if (!var68.method8348((char)var15, (byte)-93)) {
            throw new RuntimeException();
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = EnumComposition.method8324(var68, (byte)3);
            return 1;
         }
      } else if (631177127 == var0) {
         DynamicObject.field1679 -= 360123687;
         int var14 = field323[400052697 * DynamicObject.field1679];
         int var44 = field323[DynamicObject.field1679 * -324749371 + 1];
         int var67 = field323[DynamicObject.field1679 * -324749371 + 2];
         if (var67 < var44) {
            var67 = var44;
         }

         if (var44 >= 0 && var44 <= -1161375009 && var67 >= 0 && var67 <= -1835049336) {
            if (var14 == 1076251848) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = new classTE(classYY.field7113, "", var44, var67);
            } else if (var14 != 105 && var14 != 49) {
               field328[(field338 += -895327380) * -662521979 - 1] = new classTE(classYY.field7111, -1, var44, var67);
            } else {
               field328[(field338 += 1222866659) * 1375698635 - 1] = new classTE(classYY.field7111, 0, var44, var67);
            }

            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 869224684) {
         int var13 = field323[(DynamicObject.field1679 -= -1146545206) * -594425903];
         classTE var43 = classJM.method6398(field328[(field338 -= 59836459) * 1375698635], null, 1578948926);
         if (var13 >= 0 && var13 <= -1126169896) {
            var43.method10767(var13, 2102702330);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (1035324032 == var0) {
         int var12 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         Object var42 = classKN.method6500(var12, 345961829);
         classTE var66 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         classOB.method8300(var66, var66.method10756(-390242444), var42, 1388014591);
         return 1;
      } else if (379059518 == var0) {
         DynamicObject.field1679 -= 499280953;
         int var11 = field323[DynamicObject.field1679 * 40993305];
         int var41 = field323[-321955260 * DynamicObject.field1679 + 1];
         Object var65 = classKN.method6500(var41, 281336239);
         classTE var6 = classJM.method6398(field328[(field338 -= -1806031787) * 680290010], null, 1578948926);
         classOB.method8300(var6, var11, var65, 2140806692);
         return 1;
      } else if (8026 == var0) {
         int var10 = field323[(DynamicObject.field1679 -= 120041229) * 1481572081];
         classTE var40 = classJM.method6398(field328[(field338 -= 1222866659) * -697439793], null, 1578948926);
         Object var64 = classLH.method7023(var40, var10, 1488490563);
         classBD.method990(var40.field6128, var64, (byte)57);
         return 1;
      } else if (var0 == 8027) {
         field338 -= -1849233978;
         classTE var9 = classJM.method6398(field328[-1065969364 * field338], null, 1578948926);
         classTE var39 = classJM.method6398(field328[1375698635 * field338 + 1], null, 1578948926);
         classKU.method6566(var9, var39, var9.method10756(-26781667), (byte)-53);
         return 1;
      } else if (var0 == 1896954483) {
         int var8 = field323[(DynamicObject.field1679 -= 120041229) * 1913959326];
         field338 -= 1243584076;
         classTE var38 = classJM.method6398(field328[field338 * 837371741], null, 1578948926);
         classTE var63 = classJM.method6398(field328[1 + 1375698635 * field338], null, 1578948926);
         classKU.method6566(var38, var63, var8, (byte)-105);
         return 1;
      } else if (-956391250 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var3 = field323[DynamicObject.field1679 * -324749371];
         int var4 = field323[1 + -324749371 * DynamicObject.field1679];
         classTE var5 = classJM.method6398(field328[(field338 -= 655935414) * 1457059811], null, 1578948926);
         VarbitComposition.method9215(var5, var3, var4, 1487907647);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hy")
   static int method909(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("jc")
   static int method951() {
      int var0 = 2;
      Player var1 = classMB.method7521(768850899);
      if (null != var1 && null != var1.field1285) {
         var0 = -513083879 * var1.field1285.field4093;
      }

      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hp")
   static int method897(int var0, Script var1, boolean var2) {
      if (6500 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classKB.method6447(1621468834) ? 1 : 0;
         return 1;
      } else if (var0 == 6501) {
         World var15 = classIV.method6319(-325056119);
         if (var15 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 851246551 * var15.field1162;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -458552905 * var15.field1163;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var15.field1167;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -288138629 * var15.field1160;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 597852065 * var15.field1161;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var15.field1169;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         }

         return 1;
      } else if (6502 == var0) {
         World var14 = classSX.method10711(-1953402072);
         if (null != var14) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var14.field1162 * 851246551;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var14.field1163 * -458552905;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var14.field1167;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -288138629 * var14.field1160;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var14.field1161 * 597852065;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var14.field1169;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         }

         return 1;
      } else if (var0 == 6506) {
         int var13 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         World var22 = null;

         for (int var28 = 0; var28 < World.field1153 * -622036481; var28++) {
            if (World.field1170[var28].field1162 * 851246551 == var13) {
               var22 = World.field1170[var28];
               break;
            }
         }

         if (var22 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var22.field1162 * 851246551;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -458552905 * var22.field1163;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var22.field1167;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -288138629 * var22.field1160;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 597852065 * var22.field1161;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var22.field1169;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         }

         return 1;
      } else if (6507 == var0) {
         DynamicObject.field1679 -= 480164916;
         int var12 = field323[DynamicObject.field1679 * -324749371];
         boolean var21 = field323[DynamicObject.field1679 * -324749371 + 1] == 1;
         int var27 = field323[2 + DynamicObject.field1679 * -324749371];
         boolean var6 = field323[3 + -324749371 * DynamicObject.field1679] == 1;
         classRD.method9948(var12, var21, var27, var6, -566552394);
         return 1;
      } else if (6511 != var0) {
         if (6512 == var0) {
            client.field1003 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
            return 1;
         } else if (var0 == 6513) {
            DynamicObject.field1679 -= 240082458;
            int var11 = field323[-324749371 * DynamicObject.field1679];
            int var20 = field323[1 + DynamicObject.field1679 * -324749371];
            classPN var26 = classNE.method7829(var20, (byte)90);
            if (classPN.method9026(var26, (byte)2)) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = classOH.method8448(var11, 1470151919).method8967(var20, var26.field5351, -1200655309);
            } else if (var26.method9028((byte)41)) {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classOH.method8448(var11, 1412863281)
                  .method8963(var20, 3335646069137558745L * var26.field5354);
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classPL.method8961(
                  classOH.method8448(var11, -1086569503), var20, var26.field5352 * -1601970641, 1154954219
               );
            }

            return 1;
         } else if (var0 == 6514) {
            DynamicObject.field1679 -= 240082458;
            int var10 = field323[-324749371 * DynamicObject.field1679];
            int var19 = field323[-324749371 * DynamicObject.field1679 + 1];
            classPN var25 = classNE.method7829(var19, (byte)6);
            if (classPN.method9026(var25, (byte)2)) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = classMU.method7729(var10, 2055307137).method8563(var19, var25.field5351, 1238797461);
            } else if (var25.method9028((byte)108)) {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classMU.method7729(var10, 1779480158)
                  .method8558(var19, var25.field5354 * 3335646069137558745L);
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classMU.method7729(var10, 1823505102)
                  .method8556(var19, -1601970641 * var25.field5352, 1123381755);
            }

            return 1;
         } else if (var0 == 6515) {
            DynamicObject.field1679 -= 240082458;
            int var9 = field323[-324749371 * DynamicObject.field1679];
            int var18 = field323[1 + DynamicObject.field1679 * -324749371];
            classPN var24 = classNE.method7829(var18, (byte)2);
            if (classPN.method9026(var24, (byte)2)) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = classOB.method8299(var9, (byte)17).method8694(var18, var24.field5351, 1169359823);
            } else if (var24.method9028((byte)64)) {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classOB.method8299(var9, (byte)56)
                  .method8691(var18, 3335646069137558745L * var24.field5354);
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classOB.method8299(var9, (byte)82)
                  .method8687(var18, -1601970641 * var24.field5352, 1127871366);
            }

            return 1;
         } else if (6516 == var0) {
            DynamicObject.field1679 -= 240082458;
            int var8 = field323[DynamicObject.field1679 * -324749371];
            int var17 = field323[1 + DynamicObject.field1679 * -324749371];
            classPN var23 = classNE.method7829(var17, (byte)-53);
            if (classPN.method9026(var23, (byte)2)) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = classUY.method11710(var8, 64572192).method9177(var17, var23.field5351, (short)-9088);
            } else if (var23.method9028((byte)117)) {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classPR.method9173(
                  classUY.method11710(var8, 64572192), var17, 3335646069137558745L * var23.field5354
               );
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classUY.method11710(var8, 64572192)
                  .method9169(var17, var23.field5352 * -1601970641, (byte)68);
            }

            return 1;
         } else if (6518 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field890 ? 1 : 0;
            return 1;
         } else if (var0 == 6519) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = client.field888 * 461082519;
            return 1;
         } else if (var0 == 6520) {
            return 1;
         } else if (6521 == var0) {
            return 1;
         } else if (var0 == 6522) {
            field338 -= 1222866659;
            DynamicObject.field1679 -= 120041229;
            return 1;
         } else if (6523 == var0) {
            field338 -= 1222866659;
            DynamicObject.field1679 -= 120041229;
            return 1;
         } else if (6524 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            return 1;
         } else if (6525 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
            return 1;
         } else if (var0 == 6526) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
            return 1;
         } else if (6527 == var0) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -372108587 * client.field889;
            return 1;
         } else if (var0 == 6528) {
            DynamicObject.field1679 -= 240082458;
            int var7 = field323[-324749371 * DynamicObject.field1679];
            int var16 = field323[-324749371 * DynamicObject.field1679 + 1];
            classPN var5 = classNE.method7829(var16, (byte)57);
            if (classPN.method9026(var5, (byte)2)) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = classMR.method7647(var7, (byte)-24).method8308(var16, var5.field5351, (byte)-1);
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classMR.method7647(var7, (byte)-71)
                  .method8306(var16, -1601970641 * var5.field5352, (byte)-4);
            }

            return 1;
         } else if (var0 == 6531) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 240;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1;
            return 1;
         } else {
            return 2;
         }
      } else {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (var3 >= 0 && var3 < -622036481 * World.field1153) {
            World var4 = World.field1170[var3];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var4.field1162 * 851246551;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -458552905 * var4.field1163;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var4.field1167;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -288138629 * var4.field1160;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 597852065 * var4.field1161;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var4.field1169;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hc")
   static int method912(int var0, Script var1, boolean var2) {
      if (7108 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classTB.method10736(-1826135286) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;IZLbl;)V")
   @ObfuscatedName("dt")
   static void method796(Widget var0, int var1, boolean var2, Script var3) {
      if (null == var0.field4340) {
         var0.field4340 = new Widget[1 + var1];
      }

      if (var0.field4340.length <= var1) {
         Widget[] var4 = new Widget[var1 + 1];
         System.arraycopy(var0.field4340, 0, var4, 0, var0.field4340.length);
         var0.field4340 = var4;
      } else {
         Widget var5 = var0.field4340[var1];
         if (var5 != null) {
            if (var2) {
               throw new RuntimeException("");
            }

            classDM.method3434(var5, var0, (byte)-114);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hn")
   static int method916(int var0, Script var1, boolean var2) {
      if (7463 == var0) {
         boolean var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         classON.method8615(var3, (byte)1);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("dv")
   static int method805(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var3 = classLY.method7375(classWK.field6691, var4, (byte)44);
      } else {
         var3 = var2 ? classSZ.field6110 : TileItem.field1558;
      }

      if (1000 == var0) {
         DynamicObject.field1679 -= 480164916;
         var3.field4248 = field323[DynamicObject.field1679 * -324749371] * -1076753689;
         var3.field4285 = 1989424741 * field323[1 + DynamicObject.field1679 * -324749371];
         var3.field4264 = 1632281619 * field323[DynamicObject.field1679 * -324749371 + 2];
         var3.field4250 = field323[3 + DynamicObject.field1679 * -324749371] * 454876301;
         classCD.method1430(var3, classSA.field5897 * 773246731, IntProjection.field1938 * 8379747, classWK.field6691, client.field823, -2147110439);
         if (-1510882375 * var3.field4375 == 0) {
            Widget[] var7 = -1 == var3.field4260 * 63131743
               ? classWK.field6691.field4440[var3.field4329 * -1163656551 >> 16]
               : classLY.method7375(classWK.field6691, var3.field4342 * -1502647899, (byte)102).field4340;
            classFC.method4586(var7, var3, false, classWK.field6691, client.field823, 1497469796);
         }

         return 1;
      } else if (1001 == var0) {
         DynamicObject.field1679 -= 480164916;
         var3.field4255 = field323[DynamicObject.field1679 * -324749371] * 1034606045;
         var3.field4335 = -259501473 * field323[1 + DynamicObject.field1679 * -324749371];
         var3.field4251 = field323[2 + DynamicObject.field1679 * -324749371] * -1430539503;
         var3.field4252 = field323[DynamicObject.field1679 * -324749371 + 3] * -565540095;
         classCD.method1430(var3, 773246731 * classSA.field5897, IntProjection.field1938 * 8379747, classWK.field6691, client.field823, -2056166641);
         if (0 == var3.field4375 * -1510882375) {
            Widget[] var6 = -1 == 63131743 * var3.field4260
               ? classWK.field6691.field4440[var3.field4329 * -1163656551 >> 16]
               : classLY.method7375(classWK.field6691, -1502647899 * var3.field4342, (byte)119).field4340;
            classFC.method4586(var6, var3, false, classWK.field6691, client.field823, 932847357);
         }

         return 1;
      } else if (var0 == 1003) {
         boolean var5 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         if (var3.field4289 != var5) {
            var3.field4289 = var5;
         }

         return 1;
      } else if (var0 == 1005) {
         var3.field4403 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else if (1006 == var0) {
         var3.field4328 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;)I")
   @ObfuscatedName("eu")
   static int method832(Widget var0) {
      if (11 != var0.field4375 * 899340671) {
         field328[field338 * -1265206387 - 1] = "";
         return 1;
      } else {
         String var1 = (String)field328[(field338 -= 1222866659) * 1375698635];
         field328[(field338 += 1222866659) * -1673414937 - 1] = Widget.method7253(var0, var1, -691359809);
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ib")
   static int method917(int var0, Script var1, boolean var2) {
      if (var0 == 7500) {
         int var24 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         Object var30 = classKN.method6500(var24, -705129041);
         int var34 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classZC var37 = classBA.method779(var34, 2019875570);
         if (null == var37) {
            throw new RuntimeException();
         } else {
            int var40 = FloatProjection.method3895(var34, -856928294);
            classAB.field125 = var37.method13834(var30, var40, (byte)-4);
            if (null != classAB.field125) {
               client.field807 = classSA.method10354(var34, -1349355275) * -925333359;
               classCH.field741 = classAB.field125.iterator();
               if (var0 == 7500) {
                  field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAB.field125.size();
               }
            } else {
               client.field807 = 925333359;
               classCH.field741 = null;
               if (var0 == 7500) {
                  field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               }
            }

            return 1;
         }
      } else if (7501 != var0) {
         if (7502 == var0) {
            DynamicObject.field1679 -= 360123687;
            int var23 = field323[-324749371 * DynamicObject.field1679];
            int var29 = field323[1 + -324749371 * DynamicObject.field1679];
            int var33 = field323[2 + -324749371 * DynamicObject.field1679];
            int var36 = classSA.method10354(var29, 951191016);
            int var39 = classKT.method6561(var29, (byte)56);
            int var42 = FloatProjection.method3895(var29, 854483002);
            classZU var43 = method780(var36, 1192240829);
            int[] var44 = var43.field7274[var39];
            int var45 = 0;
            int var12 = var44.length;
            if (-1 == var23) {
               for (int var46 = var45; var46 < var12; var46++) {
                  classYY var47 = FriendsList.method10130(var44[var46], 1335719882);
                  if (var47 == classYY.field7113) {
                     field328[(field338 += 1222866659) * 1375698635 - 1] = "";
                  } else if (classYY.field7115 == var47) {
                     field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = -1L;
                  } else {
                     field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classTM.method10934(var44[var46], -973324355);
                  }
               }

               return 1;
            } else {
               DbRowType var13 = classFA.method4532(var23, (byte)35);
               if (var42 >= 0) {
                  if (var42 >= var12) {
                     throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var42 + ", Max: " + var12);
                  }

                  var45 = var42;
                  var12 = 1 + var42;
               }

               Object[] var14 = var13.method13989(var39, -1788542634);
               if (null == var14 && null != var43.field7272) {
                  var14 = var43.field7272[var39];
               }

               if (var14 == null) {
                  for (int var48 = var45; var48 < var12; var48++) {
                     int var49 = var44[var48];
                     classYY var50 = FriendsList.method10130(var49, -138671373);
                     if (var50 == classYY.field7113) {
                        field328[(field338 += 1222866659) * 1375698635 - 1] = "";
                     } else {
                        field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classTM.method10934(var49, -973324355);
                     }
                  }

                  return 1;
               } else {
                  int var15 = var14.length / var44.length;
                  if (var33 >= 0 && var33 < var15) {
                     for (int var16 = var45; var16 < var12; var16++) {
                        int var17 = var44.length * var33 + var16;
                        classYY var18 = FriendsList.method10130(var44[var16], -507735532);
                        if (classYY.field7113 == var18) {
                           field328[(field338 += 1222866659) * 1375698635 - 1] = var14[var17];
                        } else {
                           field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (Integer)var14[var17];
                        }
                     }

                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               }
            }
         } else if (var0 == 7503) {
            DynamicObject.field1679 -= 240082458;
            int var22 = field323[-324749371 * DynamicObject.field1679];
            int var28 = field323[1 + -324749371 * DynamicObject.field1679];
            int var32 = 0;
            int var35 = classSA.method10354(var28, 457296471);
            int var38 = classKT.method6561(var28, (byte)54);
            DbRowType var41 = classFA.method4532(var22, (byte)-97);
            classZU var9 = method780(var35, 514744209);
            int[] var10 = var9.field7274[var38];
            Object[] var11 = var41.method13989(var38, -2008539555);
            if (var11 == null && var9.field7272 != null) {
               var11 = var9.field7272[var38];
            }

            if (var11 != null) {
               var32 = var11.length / var10.length;
            }

            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var32;
            return 1;
         } else if (7504 == var0) {
            DynamicObject.field1679 -= 120041229;
            int var21 = field323[-324749371 * DynamicObject.field1679];
            classZC var27 = classHT.method6112(var21, -1765104593);
            if (null == var27) {
               throw new RuntimeException();
            } else {
               classAB.field125 = var27.method13834(0, 0, (byte)18);
               int var31 = 0;
               if (null != classAB.field125) {
                  client.field807 = var21 * -925333359;
                  classCH.field741 = classAB.field125.iterator();
                  var31 = classAB.field125.size();
               }

               if (7504 == var0) {
                  field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var31;
               }

               return 1;
            }
         } else if (7505 == var0) {
            int var20 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            DbRowType var26 = classFA.method4532(var20, (byte)-10);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var26.field7173 * 1026569721;
            return 1;
         } else if (7506 == var0) {
            int var19 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            int var25 = -1;
            if (null != classAB.field125 && var19 >= 0 && var19 < classAB.field125.size()) {
               var25 = (Integer)classAB.field125.get(var19);
            }

            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var25;
            return 1;
         } else if (var0 == 7507) {
            int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            Object var4 = classKN.method6500(var3, 551239910);
            int var5 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            classZC var6 = classBA.method779(var5, 2069760323);
            if (null == var6) {
               throw new RuntimeException();
            } else if (classSA.method10354(var5, -2044982036) != client.field807 * 936130673) {
               throw new RuntimeException();
            } else if (classAB.field125 == null && classAB.field125.isEmpty()) {
               throw new RuntimeException();
            } else {
               int var7 = FloatProjection.method3895(var5, 489893791);
               List var8 = var6.method13834(var4, var7, (byte)-40);
               classAB.field125 = new LinkedList(classAB.field125);
               if (var8 != null) {
                  classAB.field125.retainAll(var8);
               } else {
                  classAB.field125.clear();
               }

               classCH.field741 = classAB.field125.iterator();
               if (7507 == var0) {
                  field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAB.field125.size();
               }

               return 1;
            }
         } else {
            return 2;
         }
      } else {
         if (null != classCH.field741 && classCH.field741.hasNext()) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (Integer)classCH.field741.next();
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("is")
   static int method918(int var0, Script var1, boolean var2) {
      if (var0 == 7500) {
         int var24 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         Object var30 = classKN.method6500(var24, 1033602266);
         int var34 = field323[(DynamicObject.field1679 -= 348598425) * -2081456740];
         classZC var37 = classBA.method779(var34, 2037426630);
         if (null == var37) {
            throw new RuntimeException();
         } else {
            int var40 = FloatProjection.method3895(var34, 1469371166);
            classAB.field125 = var37.method13834(var30, var40, (byte)6);
            if (null != classAB.field125) {
               client.field807 = classSA.method10354(var34, 903415613) * 1814935044;
               classCH.field741 = classAB.field125.iterator();
               if (var0 == -1713860690) {
                  field323[(DynamicObject.field1679 += -1023653731) * 1512554101 - 1] = classAB.field125.size();
               }
            } else {
               client.field807 = -2033623119;
               classCH.field741 = null;
               if (var0 == 7500) {
                  field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               }
            }

            return 1;
         }
      } else if (1473610595 != var0) {
         if (-790545533 == var0) {
            DynamicObject.field1679 -= 360123687;
            int var23 = field323[-842983631 * DynamicObject.field1679];
            int var29 = field323[1 + -1399477368 * DynamicObject.field1679];
            int var33 = field323[2 + -1848688270 * DynamicObject.field1679];
            int var36 = classSA.method10354(var29, -625941356);
            int var39 = classKT.method6561(var29, (byte)97);
            int var42 = FloatProjection.method3895(var29, 1712286627);
            classZU var43 = method780(var36, 799070955);
            int[] var44 = var43.field7274[var39];
            int var45 = 0;
            int var12 = var44.length;
            if (-1 == var23) {
               for (int var46 = var45; var46 < var12; var46++) {
                  classYY var47 = FriendsList.method10130(var44[var46], 1420250198);
                  if (var47 == classYY.field7113) {
                     field328[(field338 += -2515071) * 1375698635 - 1] = "";
                  } else if (classYY.field7115 == var47) {
                     field322[(classXT.field6939 += -1861917373) * 966752677 - 1] = -1L;
                  } else {
                     field323[(DynamicObject.field1679 += 120041229) * 1454099159 - 1] = classTM.method10934(var44[var46], -973324355);
                  }
               }

               return 1;
            } else {
               DbRowType var13 = classFA.method4532(var23, (byte)59);
               if (var42 >= 0) {
                  if (var42 >= var12) {
                     throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var42 + ", Max: " + var12);
                  }

                  var45 = var42;
                  var12 = 1 + var42;
               }

               Object[] var14 = var13.method13989(var39, -1947783398);
               if (null == var14 && null != var43.field7272) {
                  var14 = var43.field7272[var39];
               }

               if (var14 == null) {
                  for (int var48 = var45; var48 < var12; var48++) {
                     int var49 = var44[var48];
                     classYY var50 = FriendsList.method10130(var49, 1457195084);
                     if (var50 == classYY.field7113) {
                        field328[(field338 += 1222866659) * -1640133740 - 1] = "";
                     } else {
                        field323[(DynamicObject.field1679 += -2112445846) * 1579238049 - 1] = classTM.method10934(var49, -973324355);
                     }
                  }

                  return 1;
               } else {
                  int var15 = var14.length / var44.length;
                  if (var33 >= 0 && var33 < var15) {
                     for (int var16 = var45; var16 < var12; var16++) {
                        int var17 = var44.length * var33 + var16;
                        classYY var18 = FriendsList.method10130(var44[var16], 195830266);
                        if (classYY.field7113 == var18) {
                           field328[(field338 += -847023140) * 1364075776 - 1] = var14[var17];
                        } else {
                           field323[(DynamicObject.field1679 += -66728400) * -4375929 - 1] = (Integer)var14[var17];
                        }
                     }

                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               }
            }
         } else if (var0 == 7503) {
            DynamicObject.field1679 -= 240082458;
            int var22 = field323[-324749371 * DynamicObject.field1679];
            int var28 = field323[1 + -1924836072 * DynamicObject.field1679];
            int var32 = 0;
            int var35 = classSA.method10354(var28, 583691331);
            int var38 = classKT.method6561(var28, (byte)111);
            DbRowType var41 = classFA.method4532(var22, (byte)87);
            classZU var9 = method780(var35, -239229617);
            int[] var10 = var9.field7274[var38];
            Object[] var11 = var41.method13989(var38, -1768826978);
            if (var11 == null && var9.field7272 != null) {
               var11 = var9.field7272[var38];
            }

            if (var11 != null) {
               var32 = var11.length / var10.length;
            }

            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var32;
            return 1;
         } else if (-661715464 == var0) {
            DynamicObject.field1679 -= 120041229;
            int var21 = field323[915124572 * DynamicObject.field1679];
            classZC var27 = classHT.method6112(var21, -1765104593);
            if (null == var27) {
               throw new RuntimeException();
            } else {
               classAB.field125 = var27.method13834(0, 0, (byte)-21);
               int var31 = 0;
               if (null != classAB.field125) {
                  client.field807 = var21 * -1697446071;
                  classCH.field741 = classAB.field125.iterator();
                  var31 = classAB.field125.size();
               }

               if (-2127982102 == var0) {
                  field323[(DynamicObject.field1679 += -462387895) * -1934335894 - 1] = var31;
               }

               return 1;
            }
         } else if (-981473599 == var0) {
            int var20 = field323[(DynamicObject.field1679 -= 120041229) * 2084032641];
            DbRowType var26 = classFA.method4532(var20, (byte)-15);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var26.field7173 * -952254061;
            return 1;
         } else if (7506 == var0) {
            int var19 = field323[(DynamicObject.field1679 -= 1645156577) * -309899226];
            int var25 = -1;
            if (null != classAB.field125 && var19 >= 0 && var19 < classAB.field125.size()) {
               var25 = (Integer)classAB.field125.get(var19);
            }

            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var25;
            return 1;
         } else if (var0 == 7507) {
            int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            Object var4 = classKN.method6500(var3, 647979684);
            int var5 = field323[(DynamicObject.field1679 -= 120041229) * -435394874];
            classZC var6 = classBA.method779(var5, 2066928484);
            if (null == var6) {
               throw new RuntimeException();
            } else if (classSA.method10354(var5, 860423245) != client.field807 * -257702773) {
               throw new RuntimeException();
            } else if (classAB.field125 == null && classAB.field125.isEmpty()) {
               throw new RuntimeException();
            } else {
               int var7 = FloatProjection.method3895(var5, -456494245);
               List var8 = var6.method13834(var4, var7, (byte)-58);
               classAB.field125 = new LinkedList(classAB.field125);
               if (var8 != null) {
                  classAB.field125.retainAll(var8);
               } else {
                  classAB.field125.clear();
               }

               classCH.field741 = classAB.field125.iterator();
               if (7507 == var0) {
                  field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAB.field125.size();
               }

               return 1;
            }
         } else {
            return 2;
         }
      } else {
         if (null != classCH.field741 && classCH.field741.hasNext()) {
            field323[(DynamicObject.field1679 += 440220790) * -324749371 - 1] = (Integer)classCH.field741.next();
         } else {
            field323[(DynamicObject.field1679 += -1080807244) * 479104639 - 1] = -1;
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ix")
   static int method919(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ie")
   static int method920(int var0, Script var1, boolean var2) {
      if (7900 == var0) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         client.field882 = Math.max(var3, 0) * 1054231967;
         return 1;
      } else if (var0 == 7901) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1387630175 * client.field882;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ih")
   static int method921(int var0, Script var1, boolean var2) {
      if (7900 == var0) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         client.field882 = Math.max(var3, 0) * 232004099;
         return 1;
      } else if (var0 == 7901) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1387630175 * client.field882;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ig")
   static int method922(int var0, Script var1, boolean var2) {
      if (7900 == var0) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         client.field882 = Math.max(var3, 0) * 1054231967;
         return 1;
      } else if (var0 == 7901) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1387630175 * client.field882;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("it")
   static int method924(int var0, Script var1, boolean var2) {
      if (8000 == var0) {
         field338 -= -1849233978;
         classTE var37 = classJM.method6398(field328[1375698635 * field338], null, 1578948926);
         classTE var62 = (classTE)field328[1 + field338 * 1375698635];
         classNI.method7860(var37, var62, 1682365730);
         return 1;
      } else if (8001 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var36 = field323[-324749371 * DynamicObject.field1679];
         int var61 = field323[1 + -324749371 * DynamicObject.field1679];
         classTE var79 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         classAS.method663(var79, var36, var61, (byte)0);
         return 1;
      } else if (var0 == 8002) {
         classTE var35 = (classTE)field328[(field338 -= 1222866659) * 1375698635];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null == var35 ? 1 : 0;
         return 1;
      } else if (var0 == 8003) {
         classTE var34 = (classTE)field328[(field338 -= 1222866659) * 1375698635];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var34 != null ? var34.method10756(-1323724893) : 0;
         return 1;
      } else if (var0 == 8004) {
         field338 -= -1849233978;
         classTE var33 = (classTE)field328[field338 * 1375698635];
         classTE var60 = (classTE)field328[1 + field338 * 1375698635];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classSY.method10714(var33, var60, -325353510);
         return 1;
      } else if (var0 == 8005) {
         DynamicObject.field1679 -= 360123687;
         int var32 = field323[DynamicObject.field1679 * -324749371];
         int var59 = field323[DynamicObject.field1679 * -324749371 + 1];
         int var78 = field323[DynamicObject.field1679 * -324749371 + 2];
         Object var85 = classKN.method6500(var78, 1278611222);
         classTE var89 = (classTE)field328[(field338 -= 1222866659) * 1375698635];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != var89 ? classVS.method12082(var89, var85, var32, var59, 1782791469) : -1;
         return 1;
      } else if (8006 == var0) {
         DynamicObject.field1679 -= 360123687;
         int var31 = field323[-324749371 * DynamicObject.field1679];
         int var58 = field323[1 + DynamicObject.field1679 * -324749371];
         int var77 = field323[-324749371 * DynamicObject.field1679 + 2];
         Object var84 = classKN.method6500(var77, 225452267);
         classTE var88 = (classTE)field328[(field338 -= 1222866659) * 1375698635];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var88 != null ? classQP.method9699(var88, var84, var31, var58, (byte)0) : -1;
         return 1;
      } else if (8007 == var0) {
         DynamicObject.field1679 -= 360123687;
         int var30 = field323[DynamicObject.field1679 * -324749371];
         int var57 = field323[1 + DynamicObject.field1679 * -324749371];
         int var76 = field323[DynamicObject.field1679 * -324749371 + 2];
         Object var83 = classKN.method6500(var76, -1886880643);
         classTE var87 = (classTE)field328[(field338 -= 1222866659) * 1375698635];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var87 != null ? classGK.method5481(var87, var83, var30, var57, -746124030) : 0;
         return 1;
      } else if (var0 == 8008) {
         classTE var29 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         int var56 = classKV.method6570(var29, 703556005);
         if (var29.field6128 == classYY.field7111) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var56 >= 0 ? var29.method10748(702726671)[var56] : -1;
         } else {
            if (classYY.field7113 != var29.field6128) {
               throw new IllegalStateException();
            }

            String var75 = (String)(var56 >= 0 ? classTE.method10753(var29, -1131321928)[var56] : null);
            field328[(field338 += 1222866659) * 1375698635 - 1] = null != var75 ? var75 : "";
         }

         return 1;
      } else if (var0 == 8009) {
         classTE var28 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         int var55 = classMB.method7520(var28, -647066559);
         if (classYY.field7111 == var28.field6128) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var55 >= 0 ? var28.method10748(1265594406)[var55] : -1;
         } else {
            if (classYY.field7113 != var28.field6128) {
               throw new IllegalStateException();
            }

            String var74 = (String)(var55 >= 0 ? classTE.method10753(var28, -1917976211)[var55] : null);
            field328[(field338 += 1222866659) * 1375698635 - 1] = null != var74 ? var74 : "";
         }

         return 1;
      } else if (8010 == var0) {
         DynamicObject.field1679 -= 360123687;
         int var27 = field323[-324749371 * DynamicObject.field1679];
         int var54 = field323[1 + -324749371 * DynamicObject.field1679];
         int var73 = field323[2 + -324749371 * DynamicObject.field1679];
         Object var82 = classKN.method6500(var73, -409853273);
         classTE var86 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         classAF.method340(var86, var82, var27, var54, -45443290);
         return 1;
      } else if (var0 == 8011) {
         DynamicObject.field1679 -= 360123687;
         int var26 = field323[-324749371 * DynamicObject.field1679];
         int var53 = field323[1 + -324749371 * DynamicObject.field1679];
         int var72 = field323[DynamicObject.field1679 * -324749371 + 2];
         classTE var81 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         classCN.method2553(var81, var26, 1, var53, var72, (byte)0);
         return 1;
      } else if (8012 == var0) {
         classTE var25 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         classPH.method8891(var25, 1465429471);
         return 1;
      } else if (8013 == var0) {
         int var24 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classTE var52 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         classLD.method6745(var52, var24, (byte)28);
         return 1;
      } else if (var0 == 8014) {
         DynamicObject.field1679 -= 240082458;
         int var23 = field323[-324749371 * DynamicObject.field1679];
         int var51 = field323[1 + DynamicObject.field1679 * -324749371];
         classTE var71 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         classSG.method10417(var71, var23, var51, (byte)-15);
         return 1;
      } else if (8015 == var0) {
         DynamicObject.field1679 -= 360123687;
         int var22 = field323[DynamicObject.field1679 * -324749371];
         int var50 = field323[-324749371 * DynamicObject.field1679 + 1];
         int var70 = field323[DynamicObject.field1679 * -324749371 + 2];
         field338 -= -1849233978;
         classTE var80 = classJM.method6398(field328[field338 * 1375698635], null, 1578948926);
         classTE var7 = classJM.method6398(field328[1375698635 * field338 + 1], null, 1578948926);
         ObjectSound.method3676(var80, var7, var22, var50, var70, 1193452639);
         return 1;
      } else if (8016 == var0) {
         classTE var21 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (int)classQA.method9429(var21, 1260046605);
         return 1;
      } else if (var0 == 8017) {
         classTE var20 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         int var49 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classFK.method4819(var20, var49, (byte)-47);
         return 1;
      } else if (8018 == var0) {
         field338 -= -1849233978;
         String var18 = (String)field328[1375698635 * field338];
         String var48 = (String)field328[1 + field338 * 1375698635];
         var18 = classUP.method11420(var18, User.method10179(-638214621), field334, field333, (byte)0);
         field328[(field338 += 1222866659) * 1375698635 - 1] = classRK.method10013(var18, var48, 1372503384);
         return 1;
      } else if (var0 == 8019) {
         field338 -= -1849233978;
         classTE var17 = classJM.method6398(field328[1375698635 * field338], null, 1578948926);
         String var47 = (String)field328[field338 * 1375698635 + 1];
         field328[(field338 += 1222866659) * 1375698635 - 1] = classLI.method7107(var17, var47, 1841691322);
         return 1;
      } else if (8020 == var0) {
         DynamicObject.field1679 -= 240082458;
         char var16 = (char)field323[DynamicObject.field1679 * -324749371];
         int var46 = field323[-324749371 * DynamicObject.field1679 + 1];
         EnumComposition var69 = classKD.method6461(var46, 1751094191);
         if (!EnumComposition.method8345(var69, var16, 1670882778)) {
            throw new RuntimeException();
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var69.method8319((short)17790);
            return 1;
         }
      } else if (var0 == 8021) {
         DynamicObject.field1679 -= 240082458;
         int var15 = field323[-324749371 * DynamicObject.field1679];
         int var45 = field323[-324749371 * DynamicObject.field1679 + 1];
         EnumComposition var68 = classKD.method6461(var45, 1026055707);
         if (!var68.method8348((char)var15, (byte)-103)) {
            throw new RuntimeException();
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = EnumComposition.method8324(var68, (byte)-100);
            return 1;
         }
      } else if (8022 == var0) {
         DynamicObject.field1679 -= 360123687;
         int var14 = field323[-324749371 * DynamicObject.field1679];
         int var44 = field323[DynamicObject.field1679 * -324749371 + 1];
         int var67 = field323[DynamicObject.field1679 * -324749371 + 2];
         if (var67 < var44) {
            var67 = var44;
         }

         if (var44 >= 0 && var44 <= 5000 && var67 >= 0 && var67 <= 5000) {
            if (var14 == 115) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = new classTE(classYY.field7113, "", var44, var67);
            } else if (var14 != 105 && var14 != 49) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = new classTE(classYY.field7111, -1, var44, var67);
            } else {
               field328[(field338 += 1222866659) * 1375698635 - 1] = new classTE(classYY.field7111, 0, var44, var67);
            }

            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 8023) {
         int var13 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classTE var43 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         if (var13 >= 0 && var13 <= 5000) {
            var43.method10767(var13, 2023823017);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (8024 == var0) {
         int var12 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         Object var42 = classKN.method6500(var12, 818319702);
         classTE var66 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         classOB.method8300(var66, var66.method10756(621024644), var42, 1806174773);
         return 1;
      } else if (8025 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var11 = field323[DynamicObject.field1679 * -324749371];
         int var41 = field323[-324749371 * DynamicObject.field1679 + 1];
         Object var65 = classKN.method6500(var41, 1877054872);
         classTE var6 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         classOB.method8300(var6, var11, var65, 2102635359);
         return 1;
      } else if (8026 == var0) {
         int var10 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         classTE var40 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         Object var64 = classLH.method7023(var40, var10, 595418698);
         classBD.method990(var40.field6128, var64, (byte)92);
         return 1;
      } else if (var0 == 8027) {
         field338 -= -1849233978;
         classTE var9 = classJM.method6398(field328[1375698635 * field338], null, 1578948926);
         classTE var39 = classJM.method6398(field328[1375698635 * field338 + 1], null, 1578948926);
         classKU.method6566(var9, var39, var9.method10756(-554857650), (byte)-48);
         return 1;
      } else if (var0 == 8028) {
         int var8 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field338 -= -1849233978;
         classTE var38 = classJM.method6398(field328[field338 * 1375698635], null, 1578948926);
         classTE var63 = classJM.method6398(field328[1 + 1375698635 * field338], null, 1578948926);
         classKU.method6566(var38, var63, var8, (byte)-68);
         return 1;
      } else if (8029 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var3 = field323[DynamicObject.field1679 * -324749371];
         int var4 = field323[1 + -324749371 * DynamicObject.field1679];
         classTE var5 = classJM.method6398(field328[(field338 -= 1222866659) * 1375698635], null, 1578948926);
         VarbitComposition.method9215(var5, var3, var4, 1487907647);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gp")
   static int method873(int var0, Script var1, boolean var2) {
      if (4000 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var61 = field323[-324749371 * DynamicObject.field1679];
         int var84 = field323[1 + -324749371 * DynamicObject.field1679];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var84 + var61;
         return 1;
      } else if (4001 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var60 = field323[-324749371 * DynamicObject.field1679];
         int var83 = field323[1 + -324749371 * DynamicObject.field1679];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var60 - var83;
         return 1;
      } else if (4002 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var59 = field323[-324749371 * DynamicObject.field1679];
         int var82 = field323[1 + DynamicObject.field1679 * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var59 * var82;
         return 1;
      } else if (var0 == 4003) {
         DynamicObject.field1679 -= 240082458;
         int var58 = field323[DynamicObject.field1679 * -324749371];
         int var81 = field323[DynamicObject.field1679 * -324749371 + 1];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var58 / var81;
         return 1;
      } else if (var0 == 4004) {
         int var57 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (int)(Math.random() * var57);
         return 1;
      } else if (4005 == var0) {
         int var56 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (int)(Math.random() * (1 + var56));
         return 1;
      } else if (4006 == var0) {
         DynamicObject.field1679 -= 600206145;
         int var55 = field323[-324749371 * DynamicObject.field1679];
         int var80 = field323[DynamicObject.field1679 * -324749371 + 1];
         int var109 = field323[-324749371 * DynamicObject.field1679 + 2];
         int var115 = field323[3 + -324749371 * DynamicObject.field1679];
         int var122 = field323[4 + DynamicObject.field1679 * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (var122 - var109) * (var80 - var55) / (var115 - var109) + var55;
         return 1;
      } else if (4007 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var54 = field323[DynamicObject.field1679 * -324749371];
         int var79 = field323[-324749371 * DynamicObject.field1679 + 1];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var54 * var79 / 100 + var54;
         return 1;
      } else if (var0 == 4008) {
         DynamicObject.field1679 -= 240082458;
         int var53 = field323[-324749371 * DynamicObject.field1679];
         int var78 = field323[DynamicObject.field1679 * -324749371 + 1];
         if (var78 >= 0 && var78 <= 31) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var53 | 1 << var78;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var53;
         }

         return 1;
      } else if (var0 == 4009) {
         DynamicObject.field1679 -= 240082458;
         int var52 = field323[DynamicObject.field1679 * -324749371];
         int var77 = field323[DynamicObject.field1679 * -324749371 + 1];
         if (var77 >= 0 && var77 <= 31) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var52 & -1 - (1 << var77);
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var52;
         }

         return 1;
      } else if (4010 != var0) {
         if (var0 == 4011) {
            DynamicObject.field1679 -= 240082458;
            int var51 = field323[DynamicObject.field1679 * -324749371];
            int var76 = field323[DynamicObject.field1679 * -324749371 + 1];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var51 % var76;
            return 1;
         } else if (4012 == var0) {
            DynamicObject.field1679 -= 240082458;
            int var50 = field323[DynamicObject.field1679 * -324749371];
            int var75 = field323[-324749371 * DynamicObject.field1679 + 1];
            if (var50 == 0) {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (int)Math.pow(var50, var75);
            }

            return 1;
         } else if (var0 == 4013) {
            DynamicObject.field1679 -= 240082458;
            int var49 = field323[DynamicObject.field1679 * -324749371];
            int var74 = field323[1 + DynamicObject.field1679 * -324749371];
            if (0 == var49) {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
               return 1;
            } else {
               switch (var74) {
                  case 0:
                     field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = Integer.MAX_VALUE;
                     break;
                  case 1:
                     field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var49;
                     break;
                  case 2:
                     field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (int)Math.sqrt(var49);
                     break;
                  case 3:
                     field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (int)Math.cbrt(var49);
                     break;
                  case 4:
                     field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (int)Math.sqrt(Math.sqrt(var49));
                     break;
                  default:
                     field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (int)Math.pow(var49, 1.0 / var74);
               }

               return 1;
            }
         } else if (var0 == 4014) {
            DynamicObject.field1679 -= 240082458;
            int var48 = field323[DynamicObject.field1679 * -324749371];
            int var73 = field323[DynamicObject.field1679 * -324749371 + 1];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var48 & var73;
            return 1;
         } else if (var0 == 4015) {
            DynamicObject.field1679 -= 240082458;
            int var47 = field323[-324749371 * DynamicObject.field1679];
            int var72 = field323[DynamicObject.field1679 * -324749371 + 1];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var47 | var72;
            return 1;
         } else if (var0 == 4016) {
            DynamicObject.field1679 -= 240082458;
            int var46 = field323[DynamicObject.field1679 * -324749371];
            int var71 = field323[1 + DynamicObject.field1679 * -324749371];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var46 < var71 ? var46 : var71;
            return 1;
         } else if (4017 == var0) {
            DynamicObject.field1679 -= 240082458;
            int var45 = field323[-324749371 * DynamicObject.field1679];
            int var70 = field323[1 + -324749371 * DynamicObject.field1679];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var45 > var70 ? var45 : var70;
            return 1;
         } else if (4018 == var0) {
            DynamicObject.field1679 -= 360123687;
            long var44 = field323[DynamicObject.field1679 * -324749371];
            long var108 = field323[1 + DynamicObject.field1679 * -324749371];
            long var121 = field323[-324749371 * DynamicObject.field1679 + 2];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (int)(var121 * var44 / var108);
            return 1;
         } else if (4025 == var0) {
            int var43 = classPN.method9024(field323[(DynamicObject.field1679 -= 120041229) * -324749371], 1401683278);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var43;
            return 1;
         } else if (4026 == var0) {
            DynamicObject.field1679 -= 240082458;
            int var42 = field323[-324749371 * DynamicObject.field1679];
            int var69 = field323[1 + -324749371 * DynamicObject.field1679];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var42 ^ 1 << var69;
            return 1;
         } else if (var0 == 4027) {
            DynamicObject.field1679 -= 360123687;
            int var41 = field323[-324749371 * DynamicObject.field1679];
            int var68 = field323[1 + DynamicObject.field1679 * -324749371];
            int var107 = field323[DynamicObject.field1679 * -324749371 + 2];
            if (var68 >= 0 && var68 <= 31 && var107 >= 0 && var107 <= 31) {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classMQ.method7642(var41, var68, var107, -1687991555);
               return 1;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var41;
               return 1;
            }
         } else if (4028 == var0) {
            DynamicObject.field1679 -= 360123687;
            int var40 = field323[-324749371 * DynamicObject.field1679];
            int var67 = field323[1 + -324749371 * DynamicObject.field1679];
            int var106 = field323[DynamicObject.field1679 * -324749371 + 2];
            if (var67 >= 0 && var67 <= 31 && var106 >= 0 && var106 <= 31) {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classJP.method6402(var40, var67, var106, 1044619746);
               return 1;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var40;
               return 1;
            }
         } else if (var0 == 4029) {
            DynamicObject.field1679 -= 360123687;
            int var39 = field323[-324749371 * DynamicObject.field1679];
            int var66 = field323[1 + DynamicObject.field1679 * -324749371];
            int var105 = field323[DynamicObject.field1679 * -324749371 + 2];
            if (var66 >= 0 && var66 <= 31 && var105 >= 0 && var105 <= 31) {
               int var114 = 31 - var105;
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var39 << var114 >>> var66 + var114;
               return 1;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var39;
               return 1;
            }
         } else if (4030 == var0) {
            DynamicObject.field1679 -= 480164916;
            int var37 = field323[DynamicObject.field1679 * -324749371];
            int var65 = field323[1 + -324749371 * DynamicObject.field1679];
            int var104 = field323[2 + -324749371 * DynamicObject.field1679];
            int var113 = field323[-324749371 * DynamicObject.field1679 + 3];
            if (var104 >= 0 && var104 <= 31 && var113 >= 0 && var113 <= 31) {
               var37 = classJP.method6402(var37, var104, var113, -1196638054);
               int var120 = (int)classOW.method8807(var113 - var104 + 1, 739139566);
               if (var65 > var120) {
                  var65 = var120;
               }

               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var37 | var65 << var104;
               return 1;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var37;
               return 1;
            }
         } else if (4032 == var0) {
            field323[-324749371 * DynamicObject.field1679 - 1] = classBF.method997(field323[DynamicObject.field1679 * -324749371 - 1], (byte)-111) >> 2;
            return 1;
         } else if (4033 == var0) {
            field323[-324749371 * DynamicObject.field1679 - 1] = Actor.method3082(field323[-324749371 * DynamicObject.field1679 - 1], 2049311388) >> 2;
            return 1;
         } else if (var0 == 4034) {
            DynamicObject.field1679 -= 240082458;
            int var36 = field323[-324749371 * DynamicObject.field1679];
            int var64 = field323[-324749371 * DynamicObject.field1679 + 1];
            int var103 = classRO.method10142(var36, var64, -1790758291);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var103;
            return 1;
         } else if (var0 == 4035) {
            field323[-324749371 * DynamicObject.field1679 - 1] = Math.abs(field323[-324749371 * DynamicObject.field1679 - 1]);
            return 1;
         } else if (4036 == var0) {
            String var35 = (String)field328[(field338 -= 1222866659) * 1375698635];
            int var63 = -1;
            if (IntProjection.method4078(var35, (byte)-1)) {
               var63 = classJF.method6360(var35, 139128282);
            }

            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var63;
            return 1;
         } else if (4037 == var0) {
            classXT.field6939 -= 1699258970;
            long var34 = field322[18294437 * classXT.field6939];
            long var102 = field322[1 + classXT.field6939 * 18294437];
            long var119 = var102 + var34;
            if (var102 > 0L != var119 > var34) {
               throw new RuntimeException("");
            } else {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var119;
               return 1;
            }
         } else if (4038 == var0) {
            classXT.field6939 -= 1699258970;
            long var33 = field322[classXT.field6939 * 18294437];
            long var101 = field322[1 + 18294437 * classXT.field6939];
            long var118 = var33 - var101;
            if (var101 < 0L != var118 > var33) {
               throw new RuntimeException("");
            } else {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var118;
               return 1;
            }
         } else if (var0 == 4039) {
            classXT.field6939 -= 1699258970;
            long var32 = field322[18294437 * classXT.field6939];
            long var100 = field322[1 + classXT.field6939 * 18294437];
            long var117 = var100 * var32;
            if (0L != var100 && var32 != var117 / var100) {
               throw new RuntimeException("");
            } else {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var117;
               return 1;
            }
         } else if (4040 == var0) {
            classXT.field6939 -= 1699258970;
            long var31 = field322[18294437 * classXT.field6939];
            long var99 = field322[1 + classXT.field6939 * 18294437];
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var31 / var99;
            return 1;
         } else if (4041 == var0) {
            classXT.field6939 -= 1699258970;
            long var30 = field322[classXT.field6939 * 18294437];
            long var98 = field322[18294437 * classXT.field6939 + 1];
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var30 < var98 ? var30 : var98;
            return 1;
         } else if (4042 == var0) {
            classXT.field6939 -= 1699258970;
            long var29 = field322[classXT.field6939 * 18294437];
            long var97 = field322[1 + 18294437 * classXT.field6939];
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var29 > var97 ? var29 : var97;
            return 1;
         } else if (var0 == 4043) {
            classXT.field6939 -= 401404807;
            BigInteger var28 = BigInteger.valueOf(field322[18294437 * classXT.field6939]);
            BigInteger var62 = BigInteger.valueOf(field322[1 + classXT.field6939 * 18294437]);
            BigInteger var96 = BigInteger.valueOf(field322[classXT.field6939 * 18294437 + 2]);
            if (BigInteger.ZERO == var62) {
               throw new RuntimeException("");
            } else {
               BigInteger var112 = var28.multiply(var96).divide(var62);
               if (var112.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && var112.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                  field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var112.longValue();
                  return 1;
               } else {
                  throw new RuntimeException("");
               }
            }
         } else if (4044 == var0) {
            DynamicObject.field1679 -= 120041229;
            int var27 = field323[DynamicObject.field1679 * -324749371];
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var27;
            return 1;
         } else if (var0 == 4047) {
            classXT.field6939 -= -1297854163;
            DynamicObject.field1679 -= 120041229;
            long var26 = field322[18294437 * classXT.field6939];
            int var95 = field323[-324749371 * DynamicObject.field1679];
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var26 | 1L << var95;
            return 1;
         } else if (4048 == var0) {
            classXT.field6939 -= -1297854163;
            DynamicObject.field1679 -= 120041229;
            long var25 = field322[classXT.field6939 * 18294437];
            int var94 = field323[DynamicObject.field1679 * -324749371];
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var25 & -1L - (1L << var94);
            return 1;
         } else if (4049 == var0) {
            classXT.field6939 -= -1297854163;
            DynamicObject.field1679 -= 120041229;
            long var24 = field322[18294437 * classXT.field6939];
            int var93 = field323[DynamicObject.field1679 * -324749371];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (var24 & 1L << var93) != 0L ? 1 : 0;
            return 1;
         } else if (var0 == 4050) {
            int var23 = classXE.method12747(field322[(classXT.field6939 -= -1297854163) * 18294437]);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var23;
            return 1;
         } else if (4051 == var0) {
            classXT.field6939 -= -1297854163;
            DynamicObject.field1679 -= 120041229;
            long var22 = field322[classXT.field6939 * 18294437];
            int var92 = field323[-324749371 * DynamicObject.field1679];
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var22 ^ 1L << var92;
            return 1;
         } else if (var0 == 4052) {
            classXT.field6939 -= -1297854163;
            DynamicObject.field1679 -= 240082458;
            long var21 = field322[18294437 * classXT.field6939];
            int var91 = classEK.method3908(0, 63, field323[DynamicObject.field1679 * -324749371], (byte)13);
            int var111 = classEK.method3908(0, 63, field323[DynamicObject.field1679 * -324749371 + 1], (byte)-49);
            if (var111 < var91) {
               throw new RuntimeException("");
            } else {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classTW.method11207(var21, var91, var111, (byte)-97);
               return 1;
            }
         } else if (4053 == var0) {
            classXT.field6939 -= -1297854163;
            DynamicObject.field1679 -= 240082458;
            long var20 = field322[classXT.field6939 * 18294437];
            int var90 = classEK.method3908(0, 63, field323[-324749371 * DynamicObject.field1679], (byte)-26);
            int var110 = classEK.method3908(0, 63, field323[1 + -324749371 * DynamicObject.field1679], (byte)-30);
            if (var110 < var90) {
               throw new RuntimeException("");
            } else {
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = classSA.method10355(var20, var90, var110, 43107232);
               return 1;
            }
         } else if (var0 == 4054) {
            classXT.field6939 -= -1297854163;
            DynamicObject.field1679 -= 240082458;
            long var19 = field322[classXT.field6939 * 18294437];
            int var89 = classEK.method3908(0, 63, field323[-324749371 * DynamicObject.field1679], (byte)-114);
            int var6 = classEK.method3908(0, 63, field323[DynamicObject.field1679 * -324749371 + 1], (byte)-40);
            if (var6 < var89) {
               throw new RuntimeException("");
            } else {
               int var116 = 63 - var6;
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var19 << var116 >>> var89 + var116;
               return 1;
            }
         } else if (4055 == var0) {
            classXT.field6939 -= 1699258970;
            long var18 = field322[classXT.field6939 * 18294437];
            long var88 = field322[18294437 * classXT.field6939 + 1];
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var18 % var88;
            return 1;
         } else if (var0 == 4056) {
            classXT.field6939 -= 1699258970;
            long var17 = field322[classXT.field6939 * 18294437];
            long var87 = field322[classXT.field6939 * 18294437 + 1];
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var17 & var87;
            return 1;
         } else if (var0 == 4057) {
            classXT.field6939 -= 1699258970;
            long var16 = field322[classXT.field6939 * 18294437];
            long var86 = field322[classXT.field6939 * 18294437 + 1];
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var16 | var86;
            return 1;
         } else if (4058 == var0) {
            classXT.field6939 -= -1297854163;
            long var15 = field322[18294437 * classXT.field6939];
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = ~var15;
            return 1;
         } else if (var0 == 4059) {
            DynamicObject.field1679 -= 240082458;
            classXT.field6939 -= 1699258970;
            long var13 = field322[18294437 * classXT.field6939];
            long var85 = field322[18294437 * classXT.field6939 + 1];
            int var7 = field323[-324749371 * DynamicObject.field1679];
            int var8 = field323[DynamicObject.field1679 * -324749371 + 1];
            var13 = classSA.method10355(var13, var7, var8, 43107232);
            long var9 = classOW.method8807(1 + (var8 - var7), 110550030);
            if (var85 > var9) {
               var85 = var9;
            }

            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var13 | var85 << var7;
            return 1;
         } else if (var0 == 4060) {
            DynamicObject.field1679 -= 240082458;
            long var12 = field323[-324749371 * DynamicObject.field1679];
            long var5 = field323[1 + -324749371 * DynamicObject.field1679];
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var12 << 32 | var5 & 4294967295L;
            return 1;
         } else if (4061 == var0) {
            classXT.field6939 -= -1297854163;
            long var11 = field322[classXT.field6939 * 18294437];
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (int)(var11 >> 32);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (int)var11;
            return 1;
         } else {
            return 2;
         }
      } else {
         DynamicObject.field1679 -= 240082458;
         int var3 = field323[DynamicObject.field1679 * -324749371];
         int var4 = field323[-324749371 * DynamicObject.field1679 + 1];
         if (var4 >= 0 && var4 <= 31) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0 != (var3 & 1 << var4) ? 1 : 0;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gs")
   static int method883(int var0, Script var1, boolean var2) {
      if (var0 == 5306) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classLH.method7105(-2016940580);
         return 1;
      } else if (5307 == var0) {
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (1 == var4 || 2 == var4) {
            classUO.method11414(var4, -2100757159);
         }

         return 1;
      } else if (5308 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAB.field122.method2797(-1414312710);
         return 1;
      } else if (var0 != 5309) {
         if (var0 == 5310) {
            DynamicObject.field1679 -= 120041229;
            return 1;
         } else {
            return 2;
         }
      } else {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (1 == var3 || var3 == 2) {
            classAB.field122.method2800(var3, 1093085541);
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ij")
   static int method926(int var0, Script var1, boolean var2) {
      if (var0 != -384732676) {
         if (var0 == 433255290) {
            classXG var10 = classOE.client.field790.method12768(field323[(DynamicObject.field1679 -= -628120408) * 1468336201], 979267578);
            field322[(classXT.field6939 += -1297854163) * 1432408747 - 1] = var10 != null ? -5931402327633732889L * var10.field6866 : -1L;
            return 1;
         } else if (var0 == 8521) {
            classXG var9 = classXH.method12772(classOE.client.field790, field322[(classXT.field6939 -= -1297854163) * 1402748753]);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != var9 ? var9.field6863 * 1743701503 : -1;
            return 1;
         } else if (var0 == -1857741833) {
            int var8 = field323[(DynamicObject.field1679 -= 120041229) * -151348081];
            classXG var12 = classXH.method12772(classOE.client.field790, field322[(classXT.field6939 -= -538059310) * 18294437]);
            if (null == var12) {
               classPC var14 = WorldView.method3717(classIZ.method6339(var8, (byte)45), 117210444);
               classBD.method990(classBW.method1267(var8, (byte)-20), var14.field5216[classCF.method1461(var8, (byte)-13)], (byte)113);
            } else {
               if (var12.field6864 * -38539607 != classIZ.method6339(var8, (byte)117)) {
                  throw new RuntimeException("");
               }

               classBD.method990(classBW.method1267(var8, (byte)-92), var12.field6862[classCF.method1461(var8, (byte)-7)], (byte)93);
            }

            return 1;
         } else if (-1935866618 == var0) {
            int var7 = field323[(DynamicObject.field1679 -= -1760582425) * 515653191];
            classXG var11 = classXH.method12772(classOE.client.field790, field322[(classXT.field6939 -= -1297854163) * -1932447967]);
            if (var11 == null) {
               classPC var5 = WorldView.method3717(classIZ.method6339(var7, (byte)99), -1923426415);
               Object[] var6 = classJW.method6417(var7, (byte)30) == classOG.field4864 ? var5.field5218 : var5.field5217;
               classBD.method990(classBW.method1267(var7, (byte)-36), var6[classCF.method1461(var7, (byte)-3)], (byte)52);
            } else {
               if (var11.field6864 * -38539607 != classIZ.method6339(var7, (byte)93)) {
                  throw new RuntimeException("");
               }

               Object[] var13 = classJW.method6417(var7, (byte)-40) == classOG.field4864 ? var11.field6861 : var11.field6865;
               classBD.method990(classBW.method1267(var7, (byte)-33), var13[classCF.method1461(var7, (byte)82)], (byte)81);
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         classXG var3 = classXH.method12772(classOE.client.field790, field322[(classXT.field6939 -= -1297854163) * 18294437]);
         int var4 = field323[(DynamicObject.field1679 -= 1524422526) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -1759398667 - 1] = var3 != null && var4 == var3.field6864 * 2041038620 ? 1 : 0;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("dj")
   static int method813(int var0, Script var1, boolean var2) {
      boolean var3 = true;
      Widget var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= -1594629153) * -324749371], (byte)23);
         var3 = false;
      } else {
         var4 = var2 ? classSZ.field6110 : TileItem.field1558;
      }

      if (var0 == -1587050927) {
         int var21 = field323[(DynamicObject.field1679 -= -960999713) * -324749371] - 1;
         if (var21 >= 0 && var21 < 322921604) {
            String var27 = (String)field328[(field338 -= 1222866659) * 1375698635];
            var27 = classUP.method11420(var27, User.method10179(-677336257), field334, field333, (byte)0);
            var4.method7207(var21, var27, (byte)-120);
            return 1;
         } else {
            field338 -= -349063983;
            return 1;
         }
      } else if (624585735 == var0) {
         DynamicObject.field1679 -= 541088061;
         int var20 = field323[DynamicObject.field1679 * -1122573840];
         int var26 = field323[1 + -324749371 * DynamicObject.field1679];
         var4.field4311 = classLY.method7378(classWK.field6691, var20, var26, (byte)1);
         return 1;
      } else if (var0 == 1302) {
         var4.field4314 = field323[(DynamicObject.field1679 -= 537875229) * -324749371] == 1;
         return 1;
      } else if (var0 == 1303) {
         var4.field4368 = field323[(DynamicObject.field1679 -= -1574590450) * 1024506678] * 230129403;
         return 1;
      } else if (var0 == 1304) {
         var4.field4313 = field323[(DynamicObject.field1679 -= 120041229) * -208775786] * -2074329479;
         return 1;
      } else if (var0 == 1305) {
         String var18 = (String)field328[(field338 -= 1222866659) * 1972043257];
         var18 = classUP.method11420(var18, User.method10179(-1801955357), field334, field333, (byte)0);
         var4.field4309 = var18;
         return 1;
      } else if (var0 == 813795138) {
         String var16 = (String)field328[(field338 -= 1222866659) * -285746183];
         var16 = classUP.method11420(var16, User.method10179(-1188585718), field334, field333, (byte)0);
         var4.field4345 = var16;
         return 1;
      } else if (1307 == var0) {
         var4.actions = null;
         var4.field4353 = (String[][])null;
         return 1;
      } else if (1308 == var0) {
         var4.field4373 = field323[(DynamicObject.field1679 -= -389048570) * -324749371] == 1;
         return 1;
      } else if (1309 == var0) {
         DynamicObject.field1679 -= 1610453672;
         return 1;
      } else if (var0 == 1310) {
         int var15 = field323[(DynamicObject.field1679 -= 1387899603) * -762421721] - 1;
         if (var15 >= 0 && var15 <= 9 && var4.field4353 != null) {
            var4.field4353[var15] = null;
            return 1;
         } else {
            return 1;
         }
      } else if (var0 == 1311) {
         int var14 = field323[(DynamicObject.field1679 -= 120041229) * 1018470544] - 1;
         int var25 = field323[(DynamicObject.field1679 -= 120041229) * -1278858903] - 1;
         if (var25 >= 0 && var25 <= 9 && var14 >= 0) {
            String var34 = (String)field328[(field338 -= 522256462) * 1375698635];
            var34 = classUP.method11420(var34, User.method10179(-1535354854), field334, field333, (byte)0);
            var4.method7210(var25, var14, var34, -512976453);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (var0 == 1538634980) {
         int var13 = field323[(DynamicObject.field1679 -= 120041229) * -1286633492];
         if (var13 == -1) {
            var4.field4310 = 1791526317;
         } else if (var13 >= 1 && var13 <= 1890396863) {
            var4.field4310 = 173826253 * (var13 - 1);
         }

         return 1;
      } else if (1350 != var0) {
         if (var0 == 1351) {
            DynamicObject.field1679 -= 240082458;
            byte var12 = 10;
            byte[] var24 = new byte[]{(byte)field323[1498064805 * DynamicObject.field1679]};
            byte[] var33 = new byte[]{(byte)field323[DynamicObject.field1679 * -324749371 + 1]};
            classMK.method7595(var4, var12, var24, var33, (byte)-59);
            return 1;
         } else if (1352 == var0) {
            DynamicObject.field1679 -= -726709714;
            int var11 = field323[DynamicObject.field1679 * -418322822] - 1;
            int var23 = field323[1 + DynamicObject.field1679 * -324749371];
            int var32 = field323[-324749371 * DynamicObject.field1679 + 2];
            if (var11 >= 0 && var11 <= 9) {
               CollisionMap.method5382(var4, var11, var23, var32, 1762314190);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (693577258 == var0) {
            byte var10 = 10;
            int var22 = field323[(DynamicObject.field1679 -= -1685058065) * -1871331146];
            int var31 = field323[(DynamicObject.field1679 -= 1079468413) * -324749371];
            CollisionMap.method5382(var4, var10, var22, var31, 1007350162);
            return 1;
         } else if (var0 == 1354) {
            DynamicObject.field1679 -= -135136692;
            int var9 = field323[DynamicObject.field1679 * -324749371] - 1;
            if (var9 >= 0 && var9 <= 9) {
               classMT.method7691(var4, var9, 2042706649);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 1355) {
            byte var8 = 10;
            classMT.method7691(var4, var8, 2132669689);
            return 1;
         } else {
            return 2;
         }
      } else {
         byte[] var5 = null;
         byte[] var6 = null;
         if (var3) {
            DynamicObject.field1679 -= 1056023636;
            byte var7 = 0;

            while (var7 < 10 && field323[DynamicObject.field1679 * -324749371 + var7] >= 0) {
               var7 += 2;
            }

            if (var7 > 0) {
               var5 = new byte[var7 / 2];
               var6 = new byte[var7 / 2];

               for (int var29 = var7 - 2; var29 >= 0; var29 -= 2) {
                  var5[var29 / 2] = (byte)field323[DynamicObject.field1679 * -324749371 + var29];
                  var6[var29 / 2] = (byte)field323[1 + DynamicObject.field1679 * -324749371 + var29];
               }
            }
         } else {
            DynamicObject.field1679 -= 240082458;
            var5 = new byte[]{(byte)field323[DynamicObject.field1679 * -324749371]};
            var6 = new byte[]{(byte)field323[DynamicObject.field1679 * -324749371 + 1]};
         }

         int var30 = field323[(DynamicObject.field1679 -= 120041229) * -222328538] - 1;
         if (var30 >= 0 && var30 <= 9) {
            classMK.method7595(var4, var30, var5, var6, (byte)-36);
            return 1;
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("if")
   static int method927(int var0, Script var1, boolean var2) {
      if (var0 != 8501) {
         if (var0 == 8520) {
            classXG var10 = classOE.client.field790.method12768(field323[(DynamicObject.field1679 -= 120041229) * -324749371], -811580927);
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var10 != null ? -5931402327633732889L * var10.field6866 : -1L;
            return 1;
         } else if (var0 == 8521) {
            classXG var9 = classXH.method12772(classOE.client.field790, field322[(classXT.field6939 -= -1297854163) * 18294437]);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = null != var9 ? var9.field6863 * 1743701503 : -1;
            return 1;
         } else if (var0 == 8560) {
            int var8 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            classXG var12 = classXH.method12772(classOE.client.field790, field322[(classXT.field6939 -= -1297854163) * 18294437]);
            if (null == var12) {
               classPC var14 = WorldView.method3717(classIZ.method6339(var8, (byte)85), -476026535);
               classBD.method990(classBW.method1267(var8, (byte)-44), var14.field5216[classCF.method1461(var8, (byte)83)], (byte)77);
            } else {
               if (var12.field6864 * -38539607 != classIZ.method6339(var8, (byte)119)) {
                  throw new RuntimeException("");
               }

               classBD.method990(classBW.method1267(var8, (byte)-126), var12.field6862[classCF.method1461(var8, (byte)-43)], (byte)109);
            }

            return 1;
         } else if (8570 == var0) {
            int var7 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            classXG var11 = classXH.method12772(classOE.client.field790, field322[(classXT.field6939 -= -1297854163) * 18294437]);
            if (var11 == null) {
               classPC var5 = WorldView.method3717(classIZ.method6339(var7, (byte)24), -1645481348);
               Object[] var6 = classJW.method6417(var7, (byte)22) == classOG.field4864 ? var5.field5218 : var5.field5217;
               classBD.method990(classBW.method1267(var7, (byte)-40), var6[classCF.method1461(var7, (byte)85)], (byte)127);
            } else {
               if (var11.field6864 * -38539607 != classIZ.method6339(var7, (byte)53)) {
                  throw new RuntimeException("");
               }

               Object[] var13 = classJW.method6417(var7, (byte)88) == classOG.field4864 ? var11.field6861 : var11.field6865;
               classBD.method990(classBW.method1267(var7, (byte)-126), var13[classCF.method1461(var7, (byte)-81)], (byte)61);
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         classXG var3 = classXH.method12772(classOE.client.field790, field322[(classXT.field6939 -= -1297854163) * 18294437]);
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3 != null && var4 == var3.field6864 * -38539607 ? 1 : 0;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("iw")
   static int method930(int var0, Script var1, boolean var2) {
      if (var0 == 13337) {
         field323[(DynamicObject.field1679 += 120041229) * 472293363 - 1] = 497839364 * field327;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hb")
   static int method913(int var0, Script var1, boolean var2) {
      if (7108 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classTB.method10736(131060229) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ia")
   static int method931(int var0, Script var1, boolean var2) {
      if (var0 == 13337) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1023779009 * field327;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILky;Z)V")
   @ObfuscatedName("im")
   static void method932(int var0, classKY var1, boolean var2) {
      WorldMap var3 = classIO.method6230((byte)-3);
      WorldMapArea var4 = var3.method12486(var0, 2080739186);
      classKY var5 = classOA.method8290(1544651080);
      var3.method12441(var4, var5, var1, var2, (byte)40);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILky;Z)V")
   @ObfuscatedName("iu")
   static void method933(int var0, classKY var1, boolean var2) {
      WorldMap var3 = classIO.method6230((byte)-18);
      WorldMapArea var4 = var3.method12486(var0, 1791396980);
      classKY var5 = classOA.method8290(1544651080);
      var3.method12441(var4, var5, var1, var2, (byte)117);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;)I")
   @ObfuscatedName("ef")
   static int method833(Widget var0) {
      if (11 != var0.field4375 * -1510882375) {
         field328[field338 * 1375698635 - 1] = "";
         return 1;
      } else {
         String var1 = (String)field328[(field338 -= 1222866659) * 1375698635];
         field328[(field338 += 1222866659) * 1375698635 - 1] = Widget.method7253(var0, var1, 1396275949);
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyy;)Ljava/lang/Object;")
   @ObfuscatedName("iq")
   static Object method935(classYY var0) {
      if (var0 == null) {
         throw new IllegalStateException("popValueOfType() failure - null baseVarType");
      } else {
         switch (202745275 * var0.field7107) {
            case 2:
               return field323[(DynamicObject.field1679 -= 1039163956) * -324749371];
            case 3:
               return field322[(classXT.field6939 -= 95986436) * -1098118547];
            case 4:
               return field328[(field338 -= 1222866659) * 1375698635];
            default:
               throw new IllegalStateException("popValueOfType() failure - unsupported type");
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gr")
   static int method886(int var0, Script var1, boolean var2) {
      if (var0 == 1207178112) {
         DynamicObject.field1679 -= 240082458;
         int var5 = field323[DynamicObject.field1679 * 1905974212];
         int var4 = field323[-324749371 * DynamicObject.field1679 + 1];
         if (!client.graphicsGuard) {
            client.field942.method11434(classEG.method3882(var5, (byte)16), -1499472454);
            client.field994.method11434(classEG.method3882(var4, (byte)13), -2089432945);
         }

         return 1;
      } else if (-1994423261 == var0) {
         field323[(DynamicObject.field1679 += 446326805) * 576359686 - 1] = client.field942.method11454(886901752);
         return 1;
      } else if (var0 == 74034947) {
         field323[(DynamicObject.field1679 += -1109252218) * -324749371 - 1] = client.field994.method11454(-1759224624);
         return 1;
      } else if (var0 == -220000587) {
         int var3 = field323[(DynamicObject.field1679 -= 316678671) * -2139764988];
         if (var3 < 0) {
            var3 = 0;
         }

         client.field840 = var3 * 643105531;
         return 1;
      } else if (var0 == 5531) {
         field323[(DynamicObject.field1679 += 120041229) * 1610084495 - 1] = -184240077 * client.field840;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("iy")
   static Object method937(int var0) {
      return -1 == var0 ? null : classAB.method308((classYY)classOF.method8404(classYY.method13782((byte)29), var0, 1545423438), 812032656);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("ik")
   static Object method938(int var0) {
      return -1 == var0 ? null : classAB.method308((classYY)classOF.method8404(classYY.method13782((byte)30), var0, -2072957659), -811156094);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/Object;")
   @ObfuscatedName("ip")
   static Object method939(int var0) {
      return -1 == var0 ? null : classAB.method308((classYY)classOF.method8404(classYY.method13782((byte)57), var0, -1439167006), -818348542);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("fu")
   static int method851(int var0, Script var1, boolean var2) {
      Widget var3 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)106);
      if (var0 == 2800) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classCK.method1575(classWK.field6691.method12173(var3, (byte)0), -2095553297);
         return 1;
      } else if (var0 != 2801) {
         if (var0 == 2802) {
            if (var3.field4309 == null) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            } else {
               field328[(field338 += 1222866659) * 1375698635 - 1] = var3.field4309;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var4--;
         if (null != var3.actions && var4 < var3.actions.length && null != var3.actions[var4]) {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var3.actions[var4];
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("in")
   static int method928(int var0, Script var1, boolean var2) {
      if (var0 != 8501) {
         if (var0 == 8520) {
            classXG var10 = classOE.client.field790.method12768(field323[(DynamicObject.field1679 -= 120041229) * -324749371], -793717631);
            field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = var10 != null ? -5931402327633732889L * var10.field6866 : -1L;
            return 1;
         } else if (var0 == -63808430) {
            classXG var9 = classXH.method12772(classOE.client.field790, field322[(classXT.field6939 -= -1297854163) * 18294437]);
            field323[(DynamicObject.field1679 += 120041229) * 2108663332 - 1] = null != var9 ? var9.field6863 * 515266477 : -1;
            return 1;
         } else if (var0 == 604758670) {
            int var8 = field323[(DynamicObject.field1679 -= 120041229) * 1471546802];
            classXG var12 = classXH.method12772(classOE.client.field790, field322[(classXT.field6939 -= -1297854163) * 18294437]);
            if (null == var12) {
               classPC var14 = WorldView.method3717(classIZ.method6339(var8, (byte)70), -100665298);
               classBD.method990(classBW.method1267(var8, (byte)-72), var14.field5216[classCF.method1461(var8, (byte)-9)], (byte)82);
            } else {
               if (var12.field6864 * -2112355677 != classIZ.method6339(var8, (byte)4)) {
                  throw new RuntimeException("");
               }

               classBD.method990(classBW.method1267(var8, (byte)-36), var12.field6862[classCF.method1461(var8, (byte)96)], (byte)124);
            }

            return 1;
         } else if (8570 == var0) {
            int var7 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
            classXG var11 = classXH.method12772(classOE.client.field790, field322[(classXT.field6939 -= -702159492) * -226154619]);
            if (var11 == null) {
               classPC var5 = WorldView.method3717(classIZ.method6339(var7, (byte)49), -96251893);
               Object[] var6 = classJW.method6417(var7, (byte)25) == classOG.field4864 ? var5.field5218 : var5.field5217;
               classBD.method990(classBW.method1267(var7, (byte)-51), var6[classCF.method1461(var7, (byte)-63)], (byte)89);
            } else {
               if (var11.field6864 * -38539607 != classIZ.method6339(var7, (byte)114)) {
                  throw new RuntimeException("");
               }

               Object[] var13 = classJW.method6417(var7, (byte)-66) == classOG.field4864 ? var11.field6861 : var11.field6865;
               classBD.method990(classBW.method1267(var7, (byte)-32), var13[classCF.method1461(var7, (byte)10)], (byte)107);
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         classXG var3 = classXH.method12772(classOE.client.field790, field322[(classXT.field6939 -= -1297854163) * 1011005399]);
         int var4 = field323[(DynamicObject.field1679 -= 863609358) * 1233948651];
         field323[(DynamicObject.field1679 += 120041229) * 866150119 - 1] = var3 != null && var4 == var3.field6864 * 2100136777 ? 1 : 0;
         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("gn")
   static int method880(int var0, Script var1, boolean var2) {
      if (-945067625 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -565155710 - 1] = 2102667627 * client.field870;
         return 1;
      } else if (2018349245 == var0) {
         DynamicObject.field1679 -= 360123687;
         client.field870 = field323[-488656378 * DynamicObject.field1679] * 425167372;
         classBJ.field483 = classWN.method12603(field323[1 + -1037895320 * DynamicObject.field1679], 1835458299);
         if (classBJ.field483 == null) {
            classBJ.field483 = classZF.field7179;
         }

         client.field843 = field323[-324749371 * DynamicObject.field1679 + 2] * 864953272;
         PacketBufferNode var20 = classEF.getPacketBufferNode(ClientPacket.SET_CHATFILTERSETTINGS, client.packetWriter.isaacCipher, (byte)-54);
         Buffer.method12971(var20.packetBuffer, client.field870 * 2024575912, (byte)-1);
         Buffer.method12971(var20.packetBuffer, classBJ.field483.field7181 * 671643104, (byte)-114);
         Buffer.method12971(var20.packetBuffer, -1155182283 * client.field843, (byte)-39);
         client.packetWriter.addNode(var20, -1301097035);
         return 1;
      } else if (5002 == var0) {
         String var19 = (String)field328[(field338 -= 1222866659) * 1375698635];
         DynamicObject.field1679 -= 240082458;
         int var28 = field323[-324749371 * DynamicObject.field1679];
         int var33 = field323[2528310 * DynamicObject.field1679 + 1];
         PacketBufferNode var35 = classEF.getPacketBufferNode(ClientPacket.SEND_SNAPSHOT, client.packetWriter.isaacCipher, (byte)-69);
         Buffer.method12971(var35.packetBuffer, classAU.method712(var19, (byte)76) + 2, (byte)-75);
         Buffer.method12997(var35.packetBuffer, var19, (short)24957);
         Buffer.method12971(var35.packetBuffer, var28 - 1, (byte)-9);
         Buffer.method12971(var35.packetBuffer, var33, (byte)-39);
         client.packetWriter.addNode(var35, -1301097035);
         return 1;
      } else if (5003 == var0) {
         DynamicObject.field1679 -= 630945326;
         int var18 = field323[-324749371 * DynamicObject.field1679];
         int var27 = field323[529274929 * DynamicObject.field1679 + 1];
         Message var32 = classGF.method5408(var18, var27, (byte)47);
         if (var32 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 707758669 * var32.field725;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1967508779 * var32.field724;
            field328[(field338 += 1222866659) * 578022411 - 1] = var32.field729 != null ? var32.field729 : "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = null != var32.field730 ? var32.field730 : "";
            field328[(field338 += 1222866659) * -678474987 - 1] = var32.field731 != null ? var32.field731 : "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var32.method1473(-446862375)
               ? 1
               : (Message.method1486(var32, 1939971706) ? 2 : 0);
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 311123603) * 1506130697 - 1] = 0;
            field328[(field338 += -1182058635) * 1375698635 - 1] = "";
            field328[(field338 += 1400605061) * 1375698635 - 1] = "";
            field328[(field338 += -337249141) * -825345609 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * 8575906 - 1] = 0;
         }

         return 1;
      } else if (var0 == 5004) {
         int var17 = field323[(DynamicObject.field1679 -= 1500801144) * -1556397558];
         Message var26 = classBQ.method1176(var17, 977843767);
         if (var26 != null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -322769967 * var26.field727;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1967508779 * var26.field724;
            field328[(field338 += -883318497) * 1375698635 - 1] = var26.field729 != null ? var26.field729 : "";
            field328[(field338 += -835168848) * 1355603216 - 1] = null != var26.field730 ? var26.field730 : "";
            field328[(field338 += 1293547976) * 1375698635 - 1] = null != var26.field731 ? var26.field731 : "";
            field323[(DynamicObject.field1679 += 552191675) * -324749371 - 1] = var26.method1473(983008138)
               ? 1
               : (Message.method1486(var26, 1857949104) ? 2 : 0);
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += -734184696) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * -363644131 - 1] = "";
            field328[(field338 += 383277594) * 1375698635 - 1] = "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 774533288) * -324749371 - 1] = 0;
         }

         return 1;
      } else if (5005 == var0) {
         if (classBJ.field483 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classBJ.field483.field7181 * -1382377909;
         }

         return 1;
      } else if (var0 == 5008) {
         String var16 = (String)field328[(field338 -= -1501225322) * 1375698635];
         int var25 = field323[(DynamicObject.field1679 -= 120041229) * 1556263210];
         PacketBufferNode var31 = classCX.constructChat(var25, var16, classLU.field4232, -1, 1694557147);
         client.packetWriter.addNode(var31, -1301097035);
         return 1;
      } else if (-1132242044 == var0) {
         field338 -= -1849233978;
         String var15 = (String)field328[57211109 * field338];
         String var24 = (String)field328[1 + field338 * 1375698635];
         PacketBufferNode var30 = classEF.getPacketBufferNode(ClientPacket.MESSAGE_PRIVATE, client.packetWriter.isaacCipher, (byte)47);
         var30.packetBuffer.method12973(0, -1542382992);
         int var34 = 298926687 * var30.packetBuffer.offset;
         Buffer.method12997(var30.packetBuffer, var15, (short)5638);
         Menu.method12644(var30.packetBuffer, var24, 2134931586);
         var30.packetBuffer.method13016(var30.packetBuffer.offset * -1728235034 - var34, -1073657062);
         client.packetWriter.addNode(var30, -1301097035);
         return 1;
      } else if (5010 == var0) {
         String var14 = (String)field328[(field338 -= 1222866659) * 436604365];
         DynamicObject.field1679 -= 240082458;
         int var23 = field323[-324749371 * DynamicObject.field1679];
         int var29 = field323[1 + DynamicObject.field1679 * -996630243];
         PacketBufferNode var6 = classCX.constructChat(var23, var14, classLU.field4232, var29, 1809808109);
         client.packetWriter.addNode(var6, -1301097035);
         return 1;
      } else if (1570176542 == var0) {
         classAAE var13 = classOE.client.vmethod255((byte)45);
         String var22 = var13 != null ? var13.method164(663351729) : "";
         field328[(field338 += 1222866659) * 1375698635 - 1] = var22;
         return 1;
      } else if (5016 == var0) {
         field323[(DynamicObject.field1679 += 1868502665) * -324749371 - 1] = 960234197 * client.field843;
         return 1;
      } else if (var0 == 1657553808) {
         int var12 = field323[(DynamicObject.field1679 -= -1373948082) * -303700005];
         field323[(DynamicObject.field1679 += 120041229) * 46882791 - 1] = classNS.method7997(var12, 70068403);
         return 1;
      } else if (-1092065601 == var0) {
         int var11 = field323[(DynamicObject.field1679 -= 1829562965) * -1345666361];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classVX.method12261(var11, (byte)2);
         return 1;
      } else if (5019 == var0) {
         int var10 = field323[(DynamicObject.field1679 -= 120041229) * 1768040370];
         field323[(DynamicObject.field1679 += 120041229) * 2001222523 - 1] = classIW.method6323(var10, (byte)35);
         return 1;
      } else if (var0 == 5020) {
         String var9 = (String)field328[(field338 -= 1222866659) * 1375698635];
         VarbitComposition.method9216(var9, (byte)-13);
         return 1;
      } else if (var0 == 5021) {
         client.field929 = ((String)field328[(field338 -= 1222866659) * 1375698635]).toLowerCase().trim();
         return 1;
      } else if (var0 == 5022) {
         field328[(field338 += 1222866659) * 1375698635 - 1] = client.field929;
         return 1;
      } else if (var0 == 1261003963) {
         String var8 = (String)field328[(field338 -= -667260507) * 1375698635];
         System.out.println(var8);
         return 1;
      } else if (var0 == 5030) {
         DynamicObject.field1679 -= 240082458;
         int var7 = field323[-546512308 * DynamicObject.field1679];
         int var21 = field323[-324749371 * DynamicObject.field1679 + 1];
         Message var5 = classGF.method5408(var7, var21, (byte)-27);
         if (var5 != null) {
            field323[(DynamicObject.field1679 += 1444612500) * -324749371 - 1] = 707758669 * var5.field725;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1383773034 * var5.field724;
            field328[(field338 += 675592052) * 1375698635 - 1] = null != var5.field729 ? var5.field729 : "";
            field328[(field338 += -1743554741) * 1375698635 - 1] = var5.field730 != null ? var5.field730 : "";
            field328[(field338 += 1222866659) * -1207248579 - 1] = var5.field731 != null ? var5.field731 : "";
            field323[(DynamicObject.field1679 += -522152062) * -324749371 - 1] = var5.method1473(-341820060)
               ? 1
               : (Message.method1486(var5, 1917348444) ? 2 : 0);
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         } else {
            field323[(DynamicObject.field1679 += 1255462516) * -1228300348 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1520832086) * 1375698635 - 1] = "";
            field328[(field338 += -838015094) * -311404435 - 1] = "";
            field328[(field338 += -415764618) * -1685060557 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -434922828 - 1] = 0;
            field328[(field338 += -1137965310) * -1834576570 - 1] = "";
            field323[(DynamicObject.field1679 += -919583772) * 1813682650 - 1] = 0;
         }

         return 1;
      } else if (1434235428 == var0) {
         int var3 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         Message var4 = classBQ.method1176(var3, 977843767);
         if (var4 != null) {
            field323[(DynamicObject.field1679 += -764375255) * -324749371 - 1] = -601203557 * var4.field727;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1926387430 * var4.field724;
            field328[(field338 += 1222866659) * 1375698635 - 1] = var4.field729 != null ? var4.field729 : "";
            field328[(field338 += 1222866659) * 1375698635 - 1] = var4.field730 != null ? var4.field730 : "";
            field328[(field338 += 763010132) * -1003633515 - 1] = null != var4.field731 ? var4.field731 : "";
            field323[(DynamicObject.field1679 += 2115440778) * -324749371 - 1] = var4.method1473(1184724425)
               ? 1
               : (Message.method1486(var4, 2096848697) ? 2 : 0);
            field328[(field338 += -2032928105) * 1375698635 - 1] = "";
            field323[(DynamicObject.field1679 += 1564124576) * -1940407804 - 1] = 0;
         } else {
            field323[(DynamicObject.field1679 += -2062760305) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * 676891308 - 1] = 0;
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            field328[(field338 += 1222866659) * -977915694 - 1] = "";
            field328[(field338 += -327228273) * -725403220 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field328[(field338 += 1222866659) * -234789067 - 1] = "";
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         }

         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyy;Ljava/lang/Object;)V")
   @ObfuscatedName("jd")
   static void method943(classYY var0, Object var1) {
      if (var0 == null) {
         throw new IllegalStateException("pushValueOfType() failure - null baseVarType");
      } else {
         switch (-567977750 * var0.field7107) {
            case 2:
               field323[(DynamicObject.field1679 += 1086674085) * 1530995886 - 1] = (Integer)var1;
               break;
            case 3:
               field322[(classXT.field6939 += -1297854163) * 18294437 - 1] = (Long)var1;
               break;
            case 4:
               field328[(field338 += 373809828) * 1375698635 - 1] = var1;
               break;
            default:
               throw new IllegalStateException("pushValueOfType() failure - unsupported type");
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("do")
   static int method806(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var3 = classLY.method7375(classWK.field6691, var4, (byte)94);
      } else {
         var3 = var2 ? classSZ.field6110 : TileItem.field1558;
      }

      if (1000 == var0) {
         DynamicObject.field1679 -= 480164916;
         var3.field4248 = field323[DynamicObject.field1679 * -324749371] * -1076753689;
         var3.field4285 = 1989424741 * field323[1 + DynamicObject.field1679 * -324749371];
         var3.field4264 = 1632281619 * field323[DynamicObject.field1679 * -324749371 + 2];
         var3.field4250 = field323[3 + DynamicObject.field1679 * -324749371] * 454876301;
         classCD.method1430(var3, classSA.field5897 * 773246731, IntProjection.field1938 * 8379747, classWK.field6691, client.field823, -1609577457);
         if (-1510882375 * var3.field4375 == 0) {
            Widget[] var7 = -1 == var3.field4260 * 63131743
               ? classWK.field6691.field4440[var3.field4329 * -1163656551 >> 16]
               : classLY.method7375(classWK.field6691, var3.field4342 * -1502647899, (byte)100).field4340;
            classFC.method4586(var7, var3, false, classWK.field6691, client.field823, -117836760);
         }

         return 1;
      } else if (1001 == var0) {
         DynamicObject.field1679 -= 480164916;
         var3.field4255 = field323[DynamicObject.field1679 * -324749371] * 1034606045;
         var3.field4335 = -259501473 * field323[1 + DynamicObject.field1679 * -324749371];
         var3.field4251 = field323[2 + DynamicObject.field1679 * -324749371] * -1430539503;
         var3.field4252 = field323[DynamicObject.field1679 * -324749371 + 3] * -565540095;
         classCD.method1430(var3, 773246731 * classSA.field5897, IntProjection.field1938 * 8379747, classWK.field6691, client.field823, -854360211);
         if (0 == var3.field4375 * -1510882375) {
            Widget[] var6 = -1 == 63131743 * var3.field4260
               ? classWK.field6691.field4440[var3.field4329 * -1163656551 >> 16]
               : classLY.method7375(classWK.field6691, -1502647899 * var3.field4342, (byte)98).field4340;
            classFC.method4586(var6, var3, false, classWK.field6691, client.field823, 842877489);
         }

         return 1;
      } else if (var0 == 1003) {
         boolean var5 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         if (var3.field4289 != var5) {
            var3.field4289 = var5;
         }

         return 1;
      } else if (var0 == 1005) {
         var3.field4403 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else if (1006 == var0) {
         var3.field4328 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;)V")
   @ObfuscatedName("jq")
   static void method945(Widget var0) {
      var0.method7281(1861233624);
      var0.method7283(-341040556).method6969(new classDQ(var0), -320106137);
      classLH.method6962(var0.method7283(-1441154324), new classCA(var0), (byte)3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hh")
   static int method910(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;Llw;)V")
   @ObfuscatedName("ja")
   static void method948(Widget var0, Widget var1) {
      if (-1510882375 * var0.field4375 == 0) {
         for (int var2 = var0.field4265 * -1210177335; var2 <= var0.field4266 * 379541057; var2++) {
            Widget var3 = var1.field4340[var2];
            if (null != var3 && 63131743 * var0.field4260 == 653784551 * var3.field4263) {
               classDM.method3434(var3, var1, (byte)-57);
            }
         }
      }

      var1.field4340[var0.field4260 * 63131743] = null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("hf")
   static int method900(int var0, Script var1, boolean var2) {
      WorldMap var3 = classIO.method6230((byte)-50);
      if (6600 == var0) {
         classKY var39 = classOA.method8290(1544651080);
         if (classKY.method6630(var39, -1969794215)) {
            var3.method12418(-210579119 * var39.field4057, var39.field4055 * 1870919123, 819227381 * var39.field4056, true, (short)28249);
         }

         return 1;
      } else if (var0 == 6601) {
         int var38 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         String var56 = "";
         WorldMapArea var60 = var3.method12486(var38, 2031775043);
         if (null != var60) {
            var56 = var60.method5861(-500044624);
         }

         field328[(field338 += 1222866659) * 1375698635 - 1] = var56;
         return 1;
      } else if (var0 == 6602) {
         int var37 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var3.method12423(var37, 392464350);
         return 1;
      } else if (6603 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.method12477((byte)-114);
         return 1;
      } else if (6604 == var0) {
         int var36 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var3.method12478(var36, 945231587);
         return 1;
      } else if (6605 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.method12483(1149942951) ? 1 : 0;
         return 1;
      } else if (6606 == var0) {
         classKY var35 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         var3.method12491(var35.field4055 * 1870919123, 819227381 * var35.field4056, (byte)-32);
         return 1;
      } else if (6607 == var0) {
         classKY var34 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         WorldMap.method12500(var3, var34.field4055 * 1870919123, var34.field4056 * 819227381, -1575978124);
         return 1;
      } else if (var0 == 6608) {
         classKY var33 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         var3.method12503(var33.field4057 * -210579119, var33.field4055 * 1870919123, 819227381 * var33.field4056, (byte)1);
         return 1;
      } else if (6609 == var0) {
         classKY var32 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         var3.method12504(var32.field4057 * -210579119, var32.field4055 * 1870919123, var32.field4056 * 819227381, (byte)0);
         return 1;
      } else if (6610 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.method12509(-1512882709);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.method12511(-1986315788);
         return 1;
      } else if (var0 == 6611) {
         int var31 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapArea var55 = var3.method12486(var31, 2133527688);
         if (null == var55) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var55.method5902(-1726020361).method6619(-1733715326);
         }

         return 1;
      } else if (6612 == var0) {
         int var30 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapArea var54 = var3.method12486(var30, 1671259080);
         if (var54 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (WorldMapArea.method5873(var54, -2085441038) - var54.method5871(2064790846) + 1)
               * 64;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = (
                  WorldMapArea.method5884(var54, -1694514616) - WorldMapArea.method5880(var54, (short)-719) + 1
               )
               * 64;
         }

         return 1;
      } else if (6613 == var0) {
         int var29 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapArea var53 = var3.method12486(var29, 1938921945);
         if (var53 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var53.method5871(2025486420) * 64;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMapArea.method5880(var53, (short)-10481) * 64;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMapArea.method5873(var53, -2009323835) * 64 + 64 - 1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMapArea.method5884(var53, -1655383765) * 64 + 64 - 1;
         }

         return 1;
      } else if (6614 == var0) {
         int var28 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapArea var52 = var3.method12486(var28, 1751253332);
         if (null == var52) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMapArea.method5867(var52, (byte)91);
         }

         return 1;
      } else if (6615 == var0) {
         classKY var27 = var3.method12513(1944926691);
         if (null == var27) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var27.field4055 * 1870919123;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var27.field4056 * 819227381;
         }

         return 1;
      } else if (6616 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.method12424(-1321349448);
         return 1;
      } else if (6617 == var0) {
         classKY var26 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         WorldMapArea var51 = var3.method12427(-539086250);
         if (var51 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            return 1;
         } else {
            int[] var59 = WorldMapArea.method5841(var51, -210579119 * var26.field4057, 1870919123 * var26.field4055, 819227381 * var26.field4056, (short)27786);
            if (var59 == null) {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var59[0];
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var59[1];
            }

            return 1;
         }
      } else if (var0 == 6618) {
         classKY var25 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         WorldMapArea var50 = var3.method12427(-539086250);
         if (var50 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            return 1;
         } else {
            classKY var58 = var50.method5844(1870919123 * var25.field4055, 819227381 * var25.field4056, (byte)112);
            if (null == var58) {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            } else {
               field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var58.method6619(-1957635530);
            }

            return 1;
         }
      } else if (var0 == 6619) {
         DynamicObject.field1679 -= 240082458;
         int var24 = field323[DynamicObject.field1679 * -324749371];
         classKY var49 = new classKY(field323[-324749371 * DynamicObject.field1679 + 1]);
         classPC.method8841(var24, var49, false, -936926764);
         return 1;
      } else if (6620 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var23 = field323[-324749371 * DynamicObject.field1679];
         classKY var48 = new classKY(field323[DynamicObject.field1679 * -324749371 + 1]);
         classPC.method8841(var23, var48, true, -1825341671);
         return 1;
      } else if (var0 == 6621) {
         DynamicObject.field1679 -= 240082458;
         int var22 = field323[DynamicObject.field1679 * -324749371];
         classKY var47 = new classKY(field323[-324749371 * DynamicObject.field1679 + 1]);
         WorldMapArea var57 = var3.method12486(var22, 2083540814);
         if (null == var57) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 0;
            return 1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMapArea.method5835(
                  var57, var47.field4057 * -210579119, 1870919123 * var47.field4055, 819227381 * var47.field4056, (byte)74
               )
               ? 1
               : 0;
            return 1;
         }
      } else if (6622 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMap.method12518(var3, (byte)-15);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var3.method12519(1226585580);
         return 1;
      } else if (var0 == 6623) {
         classKY var21 = new classKY(field323[(DynamicObject.field1679 -= 120041229) * -324749371]);
         WorldMapArea var46 = var3.method12416(-210579119 * var21.field4057, 1870919123 * var21.field4055, 819227381 * var21.field4056, (byte)2);
         if (null == var46) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var46.method5848(-608589044);
         }

         return 1;
      } else if (var0 == 6624) {
         var3.method12523(field323[(DynamicObject.field1679 -= 120041229) * -324749371], (byte)-10);
         return 1;
      } else if (var0 == 6625) {
         var3.method12525((byte)107);
         return 1;
      } else if (6626 == var0) {
         WorldMap.method12528(var3, field323[(DynamicObject.field1679 -= 120041229) * -324749371], 1245362641);
         return 1;
      } else if (var0 == 6627) {
         var3.method12533((byte)38);
         return 1;
      } else if (var0 == 6628) {
         boolean var20 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         var3.method12537(var20, -1052320544);
         return 1;
      } else if (var0 == 6629) {
         int var19 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var3.method12541(var19, (byte)-1);
         return 1;
      } else if (6630 == var0) {
         int var18 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var3.method12544(var18, 2119434799);
         return 1;
      } else if (6631 == var0) {
         var3.method12546(230187814);
         return 1;
      } else if (var0 == 6632) {
         boolean var17 = field323[(DynamicObject.field1679 -= 120041229) * -324749371] == 1;
         WorldMap.method12556(var3, var17, (byte)4);
         return 1;
      } else if (6633 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var16 = field323[-324749371 * DynamicObject.field1679];
         boolean var45 = 1 == field323[1 + DynamicObject.field1679 * -324749371];
         var3.method12549(var16, var45, -1304095367);
         return 1;
      } else if (6634 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var15 = field323[-324749371 * DynamicObject.field1679];
         boolean var44 = field323[DynamicObject.field1679 * -324749371 + 1] == 1;
         var3.method12552(var15, var44, (byte)51);
         return 1;
      } else if (6635 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMap.method12555(var3, -360219268) ? 1 : 0;
         return 1;
      } else if (6636 == var0) {
         int var14 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMap.method12559(var3, var14, (byte)28) ? 1 : 0;
         return 1;
      } else if (var0 == 6637) {
         int var13 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = WorldMap.method12563(var3, var13, -36551230) ? 1 : 0;
         return 1;
      } else if (6638 == var0) {
         DynamicObject.field1679 -= 240082458;
         int var12 = field323[-324749371 * DynamicObject.field1679];
         classKY var43 = new classKY(field323[1 + -324749371 * DynamicObject.field1679]);
         classKY var6 = var3.method12579(var12, var43, 241883862);
         if (null == var6) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var6.method6619(-1972620747);
         }

         return 1;
      } else if (6639 == var0) {
         AbstractWorldMapIcon var11 = var3.method12585((short)-29184);
         if (null == var11) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var11.vmethod486((byte)-7);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var11.field2769.method6619(-1680044140);
         }

         return 1;
      } else if (var0 == 6640) {
         AbstractWorldMapIcon var10 = var3.method12588((byte)-40);
         if (var10 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var10.vmethod486((byte)-62);
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var10.field2769.method6619(-1743633919);
         }

         return 1;
      } else if (6693 == var0) {
         int var9 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapElement var42 = SceneTilePaint.method4796(var9, (byte)-108);
         if (null == var42.field5412) {
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var42.field5412;
         }

         return 1;
      } else if (var0 == 6694) {
         int var8 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapElement var41 = SceneTilePaint.method4796(var8, (byte)7);
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var41.field5394 * 1698532127;
         return 1;
      } else if (var0 == 6695) {
         int var7 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapElement var40 = SceneTilePaint.method4796(var7, (byte)-31);
         if (var40 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = 1254355271 * var40.field5404;
         }

         return 1;
      } else if (var0 == 6696) {
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         WorldMapElement var5 = SceneTilePaint.method4796(var4, (byte)-16);
         if (var5 == null) {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = -1;
         } else {
            field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = var5.field5395 * 1274039073;
         }

         return 1;
      } else if (var0 == 6697) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAC.field132.field2897 * -753629693;
         return 1;
      } else if (var0 == 6698) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAC.field132.field2896.method6619(-2126168954);
         return 1;
      } else if (var0 == 6699) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classAC.field132.field2895.method6619(-1529573837);
         return 1;
      } else {
         return 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/String;)Lte;")
   @ObfuscatedName("ji")
   static classTE method950(Object var0, String var1) {
      if (var0 == null) {
         throw new RuntimeException();
      } else {
         return (classTE)var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("ei")
   static int method836(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? classSZ.field6110 : TileItem.field1558;
      if (1800 == var0) {
         field323[(DynamicObject.field1679 += 120041229) * -324749371 - 1] = classCK.method1575(classWK.field6691.method12173(var3, (byte)0), -2117331721);
         return 1;
      } else if (var0 != 1801) {
         if (var0 == 1802) {
            if (var3.field4309 == null) {
               field328[(field338 += 1222866659) * 1375698635 - 1] = "";
            } else {
               field328[(field338 += 1222866659) * 1375698635 - 1] = var3.field4309;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         var4--;
         if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
            field328[(field338 += 1222866659) * 1375698635 - 1] = var3.actions[var4];
         } else {
            field328[(field338 += 1222866659) * 1375698635 - 1] = "";
         }

         return 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("js")
   static int method952() {
      int var0 = 2;
      Player var1 = classMB.method7521(1382454548);
      if (null != var1 && null != var1.field1285) {
         var0 = -817016455 * var1.field1285.field4093;
      }

      return var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILbl;Z)I")
   @ObfuscatedName("eb")
   static int method839(int var0, Script var1, boolean var2) {
      if (1927 == var0 || var0 == 2927) {
         if (1733013719 * field324 >= 10) {
            throw new RuntimeException();
         } else {
            Widget var11;
            if (var0 >= 2060765699) {
               var11 = classLY.method7375(classWK.field6691, field323[(DynamicObject.field1679 -= -346309692) * -149660102], (byte)22);
            } else {
               var11 = var2 ? classSZ.field6110 : TileItem.field1558;
            }

            if (var11.field4246 == null) {
               return 0;
            } else {
               ScriptEvent var14 = classZS.method14182(
                  classZS.method14180(classUQ.method11465(var11, 689152933).method14145(var11.field4246, (byte)2), 1733013719 * field324 + 1, -1574874019),
                  (byte)114
               );
               client.field823.method9658(var14, 1697206599);
               return 1;
            }
         }
      } else if (var0 == -1959757305) {
         Widget var10 = var2 ? classSZ.field6110 : TileItem.field1558;
         int var13 = field323[(DynamicObject.field1679 -= 120041229) * -324749371];
         if (var13 >= 1 && var13 <= 10) {
            classDG var16 = new classDG(var13, var10.field4329 * -1163656551, var10.field4260 * 198775271, var10.field4319 * 1830875942);
            field332.add(var16);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else if (2928 == var0) {
         DynamicObject.field1679 -= -1588035054;
         int var9 = field323[-324749371 * DynamicObject.field1679];
         int var12 = field323[DynamicObject.field1679 * 1123330730 + 1];
         int var15 = field323[2 + -324749371 * DynamicObject.field1679];
         if (var15 >= 1 && var15 <= 10) {
            Widget var17 = classLY.method7378(classWK.field6691, var9, var12, (byte)-39);
            if (null == var17) {
               throw new RuntimeException();
            } else {
               classDG var19 = new classDG(var15, var9, var12, 2073671441 * var17.field4319);
               field332.add(var19);
               return 1;
            }
         } else {
            throw new RuntimeException();
         }
      } else if (-870887789 == var0) {
         Object[] var3 = classSY.method10721(2018456718);
         DynamicObject.field1679 -= -411970170;
         int var4 = field323[1990139255 * DynamicObject.field1679];
         int var5 = field323[DynamicObject.field1679 * -324749371 + 1];
         int var6 = field323[2 + -324749371 * DynamicObject.field1679];
         int var7 = -1;
         Widget var8 = classLY.method7378(classWK.field6691, var5, var6, (byte)-38);
         if (null != var8) {
            var7 = var8.field4319 * 2073671441;
            classPF.method8856(var5, var6, var7, var4, var3, (byte)-12);
            return 1;
         } else {
            throw new RuntimeException();
         }
      } else {
         return 2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ltq;Lzv;Lzv;B)V")
   @ObfuscatedName("as")
   static void method789(GameEngine var0, Font var1, Font var2, byte var3) {
      try {
         if (classBF.field413) {
            classDP.method3520(var0, -644062932);
         } else {
            if ((1229235359 * MouseHandler.field6261 == 1 || !classON.field4995 && 1229235359 * MouseHandler.field6261 == 4)
               && MouseHandler.field6266 * 1422993977 >= classBF.field385 * -329898575 + 765 - 50
               && MouseHandler.field6257 * 1243590197 >= 453
               && 1422993977 * MouseHandler.field6266 < 765 + -329898575 * classBF.field385
               && MouseHandler.field6257 * 1243590197 < 503) {
               ClientPreferences.method2736(classAB.field122, !classAB.field122.method2732((byte)79), (byte)16);
               classUR.method11526((byte)0);
               Actor.method3122(-1612757241);
            }

            if (-44590225 * client.field828 != 5) {
               if (-1L == classBF.field402 * -6105922944827093555L) {
                  classBF.field402 = (classDD.method2983(16711680) + 1000L) * 7971708337557546757L;
               }

               long var4 = classDD.method2983(16711680);
               if (classOL.method8513(-614124632) && -1L == classBF.field410 * -5269972525589787045L) {
                  if (var3 == 32) {
                     return;
                  }

                  classBF.field410 = 3992049254271775187L * var4;
                  if (-5269972525589787045L * classBF.field410 > -6105922944827093555L * classBF.field402) {
                     classBF.field402 = classBF.field410 * -3963514021849324345L;
                  }
               }

               if (10 == -44590225 * client.field828 || client.field828 * -44590225 == 11) {
                  if (classLU.field4232 == classXO.field6892) {
                     label1440: {
                        if (MouseHandler.field6261 * 1229235359 != 1) {
                           if (classON.field4995) {
                              break label1440;
                           }

                           if (var3 == 32) {
                              return;
                           }

                           if (MouseHandler.field6261 * 1229235359 != 4) {
                              break label1440;
                           }
                        }

                        int var6 = classBF.field385 * -329898575 + 5;
                        short var7 = 463;
                        byte var8 = 100;
                        byte var9 = 35;
                        if (MouseHandler.field6266 * 1422993977 >= var6 && MouseHandler.field6266 * 1422993977 <= var8 + var6) {
                           if (var3 == 32) {
                              return;
                           }

                           if (1243590197 * MouseHandler.field6257 >= var7) {
                              if (var3 == 32) {
                                 return;
                              }

                              if (MouseHandler.field6257 * 1243590197 <= var7 + var9) {
                                 if (classKB.method6447(2029681366)) {
                                    if (var3 == 32) {
                                       return;
                                    }

                                    classBF.field413 = true;
                                    classBF.field408 = 0;
                                    classBF.field409 = 0;
                                 }

                                 return;
                              }
                           }
                        }
                     }

                     if (classIS.field3054 != null && classKB.method6447(1059840079)) {
                        classBF.field413 = true;
                        classBF.field408 = 0;
                        classBF.field409 = 0;
                     }
                  }

                  int var25 = 1229235359 * MouseHandler.field6261;
                  int var26 = MouseHandler.field6266 * 1422993977;
                  int var27 = 1243590197 * MouseHandler.field6257;
                  if (0 == var25) {
                     var26 = -38255113 * MouseHandler.MouseHandler_x;
                     var27 = MouseHandler.MouseHandler_y * -2144333897;
                  }

                  if (!classON.field4995 && var25 == 4) {
                     var25 = 1;
                  }

                  classFA var28 = client.field931;
                  classFA var10 = var28;
                  if (-47366135 * classBF.field384 == 0) {
                     boolean var64 = false;

                     while (var10.method4531((short)-13465)) {
                        if (var3 == 32) {
                           return;
                        }

                        if (84 == var10.field2181 * 1363213817) {
                           var64 = true;
                        }
                     }

                     int var95 = 1429288549 * Ignored.field5838 - 80;
                     short var110 = 291;
                     if (1 == var25 && var26 >= var95 - 75) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var26 <= var95 + 75 && var27 >= var110 - 20 && var27 <= 20 + var110) {
                           classUF.method11299(
                              classLZ.method7427("secure", true, 1521439196) + "m=account-creation/g=oldscape/create_account_funnel.ws", (byte)31
                           );
                        }
                     }

                     var95 = Ignored.field5838 * 1429288549 + 80;
                     if (var25 == 1 && var26 >= var95 - 75 && var26 <= 75 + var95 && var27 >= var110 - 20 && var27 <= 20 + var110 || var64) {
                        if (classNU.method8146(-1438597235)) {
                           if (var3 == 32) {
                              return;
                           }

                           if (client.field832) {
                              if (var3 == 32) {
                                 return;
                              }

                              if (classBF.JX_CHARACTER_ID != null && !classBF.JX_CHARACTER_ID.isEmpty()) {
                                 classBF.field403 = -878854915;
                                 return;
                              }
                           }

                           classBF.field403 = 0;
                        } else {
                           classGG.method5430(457301346);
                        }
                     }
                  } else if (-47366135 * classBF.field384 == 1) {
                     if (var3 == 32) {
                        return;
                     }

                     boolean var133;
                     label1184: {
                        if (!classOE.client.method2149(1985617997) && !classOE.client.method2154((byte)79)) {
                           if (var3 == 32) {
                              return;
                           }

                           if (!client.method2152(classOE.client, -1428233075)) {
                              var133 = false;
                              break label1184;
                           }
                        }

                        var133 = true;
                     }

                     boolean var63 = var133;

                     while (var10.method4531((short)-12215)) {
                        if (var10.field2181 * 1363213817 == 84) {
                           if (var63) {
                              WorldEntity.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-75);
                              client.accountTypeCheck = AccountType.jagexType;
                              classXQ.method12875(false, 402128428);
                              classJB.method6345(20, -1192966987);
                           } else {
                              classGG.method5430(732697514);
                           }

                           return;
                        }

                        if (13 == var10.field2181 * 1363213817) {
                           if (var3 == 32) {
                              return;
                           }

                           classIV.method6320(true, (byte)-74);
                           return;
                        }
                     }

                     int var93 = 1429288549 * Ignored.field5838 - 80;
                     short var109 = 321;
                     if (var25 == 1 && var26 >= var93 - 75 && var26 <= var93 + 75) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var27 >= var109 - 20 && var27 <= 20 + var109) {
                           if (var63) {
                              WorldEntity.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-96);
                              client.accountTypeCheck = AccountType.jagexType;
                              classXQ.method12875(false, 402128428);
                              classJB.method6345(20, -1192966987);
                           } else {
                              classGG.method5430(1923979557);
                           }

                           return;
                        }
                     }

                     var93 = 80 + Ignored.field5838 * 1429288549;
                     if (1 == var25 && var26 >= var93 - 75 && var26 <= 75 + var93 && var27 >= var109 - 20 && var27 <= 20 + var109) {
                        classIV.method6320(true, (byte)58);
                        return;
                     }
                  } else if (classBF.field384 * -47366135 == 2) {
                     int var58 = 201;
                     var58 += 52;
                     if (1 == var25 && var27 >= var58 - 12 && var27 < 2 + var58) {
                        classBF.field403 = 0;
                     }

                     var58 += 15;
                     if (1 == var25 && var27 >= var58 - 12 && var27 < var58 + 2) {
                        classBF.field403 = -878854915;
                     }

                     var58 += 15;
                     short var62 = 361;
                     if (classWR.field6770 != null) {
                        int var88 = classWR.field6770.field6370 * 518523273 / 2;
                        if (1 == var25) {
                           if (var3 == 32) {
                              return;
                           }

                           if (var26 >= -1357616065 * classWR.field6770.field6368 - var88 && var26 <= classWR.field6770.field6368 * -1357616065 + var88) {
                              if (var3 == 32) {
                                 return;
                              }

                              if (var27 >= var62 - 15 && var27 < var62) {
                                 switch (-323997799 * classBF.field388) {
                                    case 1:
                                       classUF.method11299(classKK.field3926, (byte)-41);
                                       return;
                                    case 2:
                                       classUF.method11299("https://support.runescape.com/hc/en-gb", (byte)77);
                                 }
                              }
                           }
                        }
                     }

                     int var89 = 1429288549 * Ignored.field5838 - 80;
                     short var106 = 321;
                     if (1 == var25) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var26 >= var89 - 75 && var26 <= 75 + var89 && var27 >= var106 - 20 && var27 <= 20 + var106) {
                           classBF.JX_CHARACTER_ID = classBF.JX_CHARACTER_ID.trim();
                           client.method2363(-1);
                           if (classBF.JX_CHARACTER_ID.isEmpty()) {
                              WorldEntity.method10624(classKK.field3658, classKK.field3728, classKK.field3916, (byte)-101);
                           } else if (classBF.field390.isEmpty()) {
                              WorldEntity.method10624(classKK.field3730, classKK.field3644, classKK.field3732, (byte)-33);
                           } else {
                              WorldEntity.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-3);
                              classXQ.method12875(false, 402128428);
                              classJB.method6345(20, -1192966987);
                           }

                           return;
                        }
                     }

                     var89 = 80 + 180 + -511275367 * classBF.field394;
                     if (var25 == 1 && var26 >= var89 - 75 && var26 <= 75 + var89 && var27 >= var106 - 20 && var27 <= var106 + 20) {
                        classAC.method326(0, 2031921971);
                        classBF.JX_CHARACTER_ID = "";
                        client.method2363(-1);
                        classBF.field390 = "";
                        classEV.field1944 = 0;
                        classQP.field5586 = "";
                        classBF.field393 = true;
                     }

                     boolean var129;
                     label1415: {
                        var89 = 1429288549 * Ignored.field5838 + -117;
                        var106 = 277;
                        if (var26 >= var89 && var26 < var89 + 1381434113 * classXR.field6925 && var27 >= var106) {
                           if (var3 == 32) {
                              return;
                           }

                           if (var27 < classKP.field3985 * -580844865 + var106) {
                              var129 = true;
                              break label1415;
                           }
                        }

                        var129 = false;
                     }

                     classBF.field401 = var129;
                     if (1 == var25 && classBF.field401) {
                        if (!client.field832) {
                           if (var3 == 32) {
                              return;
                           }

                           var129 = true;
                        } else {
                           var129 = false;
                        }

                        client.field832 = var129;
                        if (!client.field832 && ClientPreferences.method2782(classAB.field122, (byte)8) != null) {
                           if (var3 == 32) {
                              return;
                           }

                           classAB.field122.method2789(null, 2139161334);
                        }
                     }

                     label1406: {
                        var89 = 24 + 1429288549 * Ignored.field5838;
                        var106 = 277;
                        if (var26 >= var89 && var26 < classXR.field6925 * 1381434113 + var89) {
                           if (var3 == 32) {
                              return;
                           }

                           if (var27 >= var106 && var27 < var106 + -580844865 * classKP.field3985) {
                              var129 = true;
                              break label1406;
                           }
                        }

                        var129 = false;
                     }

                     classBF.field406 = var129;
                     if (var25 == 1 && classBF.field406) {
                        classAB.field122.method2727(!ClientPreferences.method2724(classAB.field122, (short)4936), 1971325554);
                        if (!ClientPreferences.method2724(classAB.field122, (short)10932)) {
                           classBF.JX_CHARACTER_ID = "";
                           client.method2363(-1);
                           classAB.field122.method2789(null, 1474462174);
                           if (client.field832 && null != classBF.JX_CHARACTER_ID && !classBF.JX_CHARACTER_ID.isEmpty()) {
                              classBF.field403 = -878854915;
                           } else {
                              classBF.field403 = 0;
                           }
                        }
                     }

                     while (var10.method4531((short)4254)) {
                        if (var10.field2181 * 1363213817 == 13) {
                           classAC.method326(0, 2050857568);
                           classBF.JX_CHARACTER_ID = "";
                           client.method2363(-1);
                           classBF.field390 = "";
                           classEV.field1944 = 0;
                           classQP.field5586 = "";
                           classBF.field393 = true;
                        } else if (-1187692459 * classBF.field403 == 0) {
                           classOG.method8436(var10.field2175, (byte)-110);
                           if (var10.field2181 * 1363213817 == 85 && !classBF.JX_CHARACTER_ID.isEmpty()) {
                              classBF.JX_CHARACTER_ID = classBF.JX_CHARACTER_ID.substring(0, classBF.JX_CHARACTER_ID.length() - 1);
                              client.method2363(-1);
                           }

                           if (1363213817 * var10.field2181 == 84 || 1363213817 * var10.field2181 == 80) {
                              classBF.field403 = -878854915;
                           }

                           char var121 = var10.field2175;
                           boolean var115 = classBF.field404.indexOf(var121) != -1;
                           if (var115 && classBF.JX_CHARACTER_ID.length() < 320) {
                              classBF.JX_CHARACTER_ID = classBF.JX_CHARACTER_ID + var10.field2175;
                              client.method2363(-1);
                           }
                        } else if (classBF.field403 * -1187692459 == 1) {
                           if (85 == var10.field2181 * 1363213817 && !classBF.field390.isEmpty()) {
                              if (var3 == 32) {
                                 return;
                              }

                              classBF.field390 = classBF.field390.substring(0, classBF.field390.length() - 1);
                           } else if (1363213817 * var10.field2181 == 84 || 80 == 1363213817 * var10.field2181) {
                              classBF.field403 = 0;
                              if (1363213817 * var10.field2181 == 84) {
                                 classBF.JX_CHARACTER_ID = classBF.JX_CHARACTER_ID.trim();
                                 client.method2363(-1);
                                 if (classBF.JX_CHARACTER_ID.isEmpty()) {
                                    WorldEntity.method10624(classKK.field3658, classKK.field3728, classKK.field3916, (byte)-111);
                                 } else if (classBF.field390.isEmpty()) {
                                    if (var3 == 32) {
                                       return;
                                    }

                                    WorldEntity.method10624(classKK.field3730, classKK.field3644, classKK.field3732, (byte)-25);
                                 } else {
                                    WorldEntity.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-50);
                                    classXQ.method12875(false, 402128428);
                                    classJB.method6345(20, -1192966987);
                                 }

                                 return;
                              }
                           }

                           if ((classFA.method4540(var10, 82, 1361535292) || classFA.method4540(var10, 87, 2011220334)) && 67 == 1363213817 * var10.field2181) {
                              Clipboard var117 = Toolkit.getDefaultToolkit().getSystemClipboard();
                              Transferable var123 = var117.getContents(classOE.client);
                              int var125 = 20 - classBF.field390.length();
                              if (var125 > 0) {
                                 if (var3 == 32) {
                                    return;
                                 }

                                 try {
                                    String var127 = (String)var123.getTransferData(DataFlavor.stringFlavor);
                                    int var18 = Math.min(var125, var127.length());
                                    int var19 = 0;

                                    while (var19 < var18) {
                                       if (classIB.method6139(var127.charAt(var19), 364490056)) {
                                          if (var3 == 32) {
                                             return;
                                          }

                                          char var21 = var127.charAt(var19);
                                          boolean var20 = classBF.field404.indexOf(var21) != -1;
                                          if (var20) {
                                             var19++;
                                             continue;
                                          }
                                       }

                                       classAC.method326(3, 2092926123);
                                       return;
                                    }

                                    classBF.field390 = classBF.field390 + var127.substring(0, var18);
                                 } catch (UnsupportedFlavorException var22) {
                                 } catch (IOException var23) {
                                 }
                              }
                           } else if (classIB.method6139(var10.field2175, -72991136)) {
                              char var122 = var10.field2175;
                              if (classBF.field404.indexOf(var122) != -1) {
                                 if (var3 == 32) {
                                    return;
                                 }

                                 var129 = true;
                              } else {
                                 var129 = false;
                              }

                              boolean var116 = var129;
                              if (var116 && classBF.field390.length() < 20) {
                                 classBF.field390 = classBF.field390 + var10.field2175;
                              }
                           }
                        }
                     }
                  } else if (3 == -47366135 * classBF.field384) {
                     int var11 = 180 + -511275367 * classBF.field394;
                     short var12 = 241;
                     classUQ var13 = var1.method49(25, classKK.field3859.length() - 34, classKK.field3859, var11, var12);
                     if (var25 == 1) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var13.method11474(var26, var27, -594779443)) {
                           classUF.method11299(classKK.field3925, (byte)68);
                        }
                     }

                     var11 = 180 + classBF.field394 * -511275367;
                     var12 = 276;
                     if (1 == var25 && var26 >= var11 - 75 && var26 <= var11 + 75 && var27 >= var12 - 20 && var27 <= var12 + 20) {
                        if (var3 == 32) {
                           return;
                        }

                        classIV.method6320(false, (byte)17);
                     }

                     var11 = 180 + -511275367 * classBF.field394;
                     var12 = 326;
                     if (1 == var25 && var26 >= var11 - 75 && var26 <= 75 + var11 && var27 >= var12 - 20) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var27 <= var12 + 20) {
                           classUF.method11299(classKK.field3926, (byte)-3);
                           return;
                        }
                     }
                  } else if (4 == -47366135 * classBF.field384) {
                     int var31 = 180 + -511275367 * classBF.field394 - 80;
                     short var67 = 321;
                     if (var25 == 1 && var26 >= var31 - 75 && var26 <= var31 + 75 && var27 >= var67 - 20) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var27 <= var67 + 20) {
                           classQP.field5586.trim();
                           if (classQP.field5586.length() != 6) {
                              WorldEntity.method10624(classKK.field3646, classKK.field3850, classKK.field3745, (byte)-8);
                           } else {
                              classEV.field1944 = Integer.parseInt(classQP.field5586) * 400348643;
                              classQP.field5586 = "";
                              classXQ.method12875(true, 402128428);
                              WorldEntity.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-64);
                              classJB.method6345(20, -1192966987);
                           }

                           return;
                        }
                     }

                     if (var25 == 1 && var26 >= 180 + classBF.field394 * -511275367 - 9 && var26 <= 180 + -511275367 * classBF.field394 + 130) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var27 >= 263 && var27 <= 296) {
                           if (var3 == 32) {
                              return;
                           }

                           classBF.field393 = !classBF.field393;
                        }
                     }

                     if (1 == var25
                        && var26 >= 180 + classBF.field394 * -511275367 - 34
                        && var26 <= 34 + -511275367 * classBF.field394 + 180
                        && var27 >= 351
                        && var27 <= 363) {
                        classUF.method11299(classKK.field3926, (byte)51);
                     }

                     var31 = 80 + -511275367 * classBF.field394 + 180;
                     if (var25 == 1 && var26 >= var31 - 75) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var26 <= 75 + var31) {
                           if (var3 == 32) {
                              return;
                           }

                           if (var27 >= var67 - 20 && var27 <= 20 + var67) {
                              classAC.method326(0, 2114864040);
                              classBF.JX_CHARACTER_ID = "";
                              client.method2363(-1);
                              classBF.field390 = "";
                              classEV.field1944 = 0;
                              classQP.field5586 = "";
                           }
                        }
                     }

                     while (var10.method4531((short)4071)) {
                        boolean var97 = false;

                        for (int var14 = 0; var14 < classBF.field405.length(); var14++) {
                           if (var10.field2175 == classBF.field405.charAt(var14)) {
                              var97 = true;
                              break;
                           }
                        }

                        if (var10.field2181 * 1363213817 == 13) {
                           classAC.method326(0, 2140661881);
                           classBF.JX_CHARACTER_ID = "";
                           client.method2363(-1);
                           classBF.field390 = "";
                           classEV.field1944 = 0;
                           classQP.field5586 = "";
                        } else {
                           if (1363213817 * var10.field2181 == 85 && !classQP.field5586.isEmpty()) {
                              classQP.field5586 = classQP.field5586.substring(0, classQP.field5586.length() - 1);
                           }

                           if (1363213817 * var10.field2181 == 84) {
                              classQP.field5586.trim();
                              if (classQP.field5586.length() != 6) {
                                 WorldEntity.method10624(classKK.field3646, classKK.field3850, classKK.field3745, (byte)-95);
                              } else {
                                 classEV.field1944 = Integer.parseInt(classQP.field5586) * 400348643;
                                 classQP.field5586 = "";
                                 classXQ.method12875(true, 402128428);
                                 WorldEntity.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)-24);
                                 classJB.method6345(20, -1192966987);
                              }

                              return;
                           }

                           if (var97 && classQP.field5586.length() < 6) {
                              if (var3 == 32) {
                                 return;
                              }

                              classQP.field5586 = classQP.field5586 + var10.field2175;
                           }
                        }
                     }
                  } else if (-47366135 * classBF.field384 == 5) {
                     int var33 = -511275367 * classBF.field394 + 180 - 80;
                     short var68 = 321;
                     if (1 == var25 && var26 >= var33 - 75 && var26 <= 75 + var33 && var27 >= var68 - 20 && var27 <= 20 + var68) {
                        classHC.method5992(-486975020);
                        return;
                     }

                     var33 = 80 + classBF.field394 * -511275367 + 180;
                     if (1 == var25 && var26 >= var33 - 75 && var26 <= var33 + 75 && var27 >= var68 - 20 && var27 <= var68 + 20) {
                        classBJ.method1117(true, -347989319);
                     }

                     short var98 = 361;
                     if (null != classLB.field4089) {
                        int var111 = 518523273 * classLB.field4089.field6370 / 2;
                        if (var25 == 1
                           && var26 >= classLB.field4089.field6368 * -1357616065 - var111
                           && var26 <= classLB.field4089.field6368 * -1357616065 + var111
                           && var27 >= var98 - 15
                           && var27 < var98) {
                           classUF.method11299(classLZ.method7427("secure", true, 891975411) + "m=weblogin/g=oldscape/cant_log_in", (byte)-83);
                        }
                     }

                     while (var10.method4531((short)1930)) {
                        boolean var112 = false;

                        for (int var15 = 0; var15 < classBF.field404.length(); var15++) {
                           if (var10.field2175 == classBF.field404.charAt(var15)) {
                              var112 = true;
                              break;
                           }
                        }

                        if (1363213817 * var10.field2181 == 13) {
                           classBJ.method1117(true, -347989319);
                        } else {
                           if (85 == var10.field2181 * 1363213817 && !classBF.JX_CHARACTER_ID.isEmpty()) {
                              if (var3 == 32) {
                                 return;
                              }

                              classBF.JX_CHARACTER_ID = classBF.JX_CHARACTER_ID.substring(0, classBF.JX_CHARACTER_ID.length() - 1);
                              client.method2363(-1);
                           }

                           if (84 == var10.field2181 * 1363213817) {
                              classHC.method5992(-486975020);
                              return;
                           }

                           if (var112 && classBF.JX_CHARACTER_ID.length() < 320) {
                              classBF.JX_CHARACTER_ID = classBF.JX_CHARACTER_ID + var10.field2175;
                              client.method2363(-1);
                           }
                        }
                     }
                  } else if (6 == classBF.field384 * -47366135) {
                     if (var3 == 32) {
                        return;
                     }

                     while (var10.method4531((short)6469)) {
                        if (var10.field2181 * 1363213817 != 84) {
                           if (var3 == 32) {
                              return;
                           }

                           if (13 != 1363213817 * var10.field2181) {
                              continue;
                           }

                           if (var3 == 32) {
                              return;
                           }
                        }

                        classBJ.method1117(true, -347989319);
                     }

                     short var35 = 321;
                     if (1 == var25 && var27 >= var35 - 20 && var27 <= 20 + var35) {
                        if (var3 == 32) {
                           return;
                        }

                        classBJ.method1117(true, -347989319);
                     }
                  } else if (-47366135 * classBF.field384 == 7) {
                     if (var3 == 32) {
                        return;
                     }

                     if (client.field1134 && !client.field890) {
                        int var38 = 1429288549 * Ignored.field5838 - 150;
                        int var70 = 25 + var38 + 240 + 40;
                        short var99 = 231;
                        int var113 = 40 + var99;
                        if (var25 == 1 && var26 >= var38 && var26 <= var70 && var27 >= var99 && var27 <= var113) {
                           if (var3 == 32) {
                              return;
                           }

                           classBF.field391 = classBJ.method1116(var38, var26, (byte)1) * 523390187;
                        }

                        int var118 = classBF.field394 * -511275367 + 180 - 80;
                        short var16 = 321;
                        if (1 == var25 && var26 >= var118 - 75 && var26 <= 75 + var118 && var27 >= var16 - 20 && var27 <= 20 + var16) {
                           boolean var17 = classCN.method2555((byte)-3);
                           if (var17) {
                              if (var3 == 32) {
                                 return;
                              }

                              classJB.method6345(50, -1192966987);
                              return;
                           }
                        }

                        var118 = 180 + -511275367 * classBF.field394 + 80;
                        if (var25 == 1 && var26 >= var118 - 75 && var26 <= var118 + 75 && var27 >= var16 - 20 && var27 <= var16 + 20) {
                           classBF.field407 = new String[8];
                           classBJ.method1117(true, -347989319);
                        }

                        while (var10.method4531((short)6876)) {
                           if (101 == var10.field2181 * 1363213817) {
                              classBF.field407[-594543677 * classBF.field391] = null;
                           }

                           if (85 == var10.field2181 * 1363213817) {
                              if (classBF.field407[classBF.field391 * -594543677] == null && classBF.field391 * -594543677 > 0) {
                                 if (var3 == 32) {
                                    return;
                                 }

                                 classBF.field391 -= 523390187;
                              }

                              classBF.field407[classBF.field391 * -594543677] = null;
                           }

                           if (var10.field2175 >= '0' && var10.field2175 <= '9') {
                              if (var3 == 32) {
                                 return;
                              }

                              classBF.field407[-594543677 * classBF.field391] = "" + var10.field2175;
                              if (-594543677 * classBF.field391 < 7) {
                                 classBF.field391 += 523390187;
                              }
                           }

                           if (var10.field2181 * 1363213817 == 84) {
                              boolean var126 = classCN.method2555((byte)105);
                              if (var126) {
                                 if (var3 == 32) {
                                    return;
                                 }

                                 classJB.method6345(50, -1192966987);
                              }

                              return;
                           }
                        }
                     } else {
                        int var36 = 180 + classBF.field394 * -511275367 - 80;
                        short var69 = 321;
                        if (1 == var25 && var26 >= var36 - 75 && var26 <= 75 + var36 && var27 >= var69 - 20 && var27 <= 20 + var69) {
                           classUF.method11299(classLZ.method7427("secure", true, -264422914) + "m=dob/set_dob.ws", (byte)-38);
                           WorldEntity.method10624(classKK.field3869, classKK.field3870, classKK.field3762, (byte)-32);
                           classAC.method326(6, 2095865883);
                           return;
                        }

                        var36 = 80 + 180 + classBF.field394 * -511275367;
                        if (1 == var25 && var26 >= var36 - 75 && var26 <= var36 + 75 && var27 >= var69 - 20 && var27 <= 20 + var69) {
                           classBJ.method1117(true, -347989319);
                        }
                     }
                  } else if (8 == classBF.field384 * -47366135) {
                     int var39 = classBF.field394 * -511275367 + 180 - 80;
                     short var71 = 321;
                     if (1 == var25 && var26 >= var39 - 75 && var26 <= 75 + var39 && var27 >= var71 - 20 && var27 <= 20 + var71) {
                        classUF.method11299("https://legal.jagex.com/docs/policies/privacy", (byte)14);
                        WorldEntity.method10624(classKK.field3869, classKK.field3870, classKK.field3762, (byte)-23);
                        classAC.method326(6, 2103982220);
                        return;
                     }

                     var39 = -511275367 * classBF.field394 + 180 + 80;
                     if (var25 == 1 && var26 >= var39 - 75 && var26 <= var39 + 75 && var27 >= var71 - 20 && var27 <= var71 + 20) {
                        classBJ.method1117(true, -347989319);
                     }
                  } else if (classBF.field384 * -47366135 == 9) {
                     boolean var10000;
                     label1217: {
                        int var41 = -511275367 * classBF.field394 + 180;
                        short var72 = 311;
                        if (1 == var25 && var26 >= var41 - 75) {
                           if (var3 == 32) {
                              return;
                           }

                           if (var26 <= 75 + var41 && var27 >= var72 - 20) {
                              if (var3 == 32) {
                                 return;
                              }

                              if (var27 <= 20 + var72) {
                                 var10000 = true;
                                 break label1217;
                              }
                           }
                        }

                        var10000 = false;
                     }

                     boolean var100 = var10000;

                     while (var10.method4531((short)12268)) {
                        if (84 == var10.field2181 * 1363213817 || 13 == 1363213817 * var10.field2181) {
                           var100 = true;
                        }
                     }

                     if (var100) {
                        if (var3 == 32) {
                           return;
                        }

                        classIV.method6320(false, (byte)76);
                     }
                  } else if (classBF.field384 * -47366135 == 10) {
                     boolean var128;
                     label1232: {
                        int var42 = classBF.field394 * -511275367 + 180;
                        short var73 = 209;
                        if (1 == var25 && var26 >= var42 - 109 && var26 <= 109 + var42) {
                           if (var3 == 32) {
                              return;
                           }

                           if (var27 >= var73 && var27 <= var73 + 68) {
                              var128 = true;
                              break label1232;
                           }
                        }

                        var128 = false;
                     }

                     boolean var101 = var128;

                     while (var10.method4531((short)10195)) {
                        if (var3 == 32) {
                           return;
                        }

                        if (1363213817 * var10.field2181 == 84) {
                           var101 = true;
                        }
                     }

                     if (var101) {
                        if (classNU.method8146(-1904447953)) {
                           if (var3 == 32) {
                              return;
                           }

                           return;
                        }

                        WorldEntity.method10624(classKK.field3822, classKK.field3801, classKK.field3840, (byte)0);
                        client.accountTypeCheck = AccountType.jagexType;
                        classXQ.method12875(false, 402128428);
                        classJB.method6345(20, -1192966987);
                     }
                  } else if (12 == -47366135 * classBF.field384) {
                     int var43 = Ignored.field5838 * 1429288549;
                     int var74 = 233;
                     classUQ var102 = var2.method49(0, 30, classKK.field3900, var43, var74);
                     classUQ var114 = var2.method49(32, 32, classKK.field3900, var43, var74);
                     classUQ var120 = var2.method49(70, 34, classKK.field3900, var43, var74);
                     var74 += 17;
                     classUQ var124 = var2.method49(0, 34, classKK.field3901, var43, var74);
                     if (var25 == 1) {
                        if (var102.method11474(var26, var27, -594779443)) {
                           if (var3 == 32) {
                              return;
                           }

                           classUF.method11299("https://legal.jagex.com/docs/terms", (byte)71);
                        } else if (var114.method11474(var26, var27, -594779443)) {
                           classUF.method11299("https://legal.jagex.com/docs/policies/privacy", (byte)-15);
                        } else if (var120.method11474(var26, var27, -594779443) || var124.method11474(var26, var27, -594779443)) {
                           classUF.method11299("https://legal.jagex.com/docs/terms/eula", (byte)73);
                        }
                     }

                     var43 = Ignored.field5838 * 1429288549 - 80;
                     short var76 = 311;
                     if (1 == var25 && var26 >= var43 - 75 && var26 <= 75 + var43) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var27 >= var76 - 20 && var27 <= var76 + 20) {
                           if (var3 == 32) {
                              return;
                           }

                           classYY.method13791(-118761103);
                           classIV.method6320(true, (byte)12);
                        }
                     }

                     var43 = 80 + 1429288549 * Ignored.field5838;
                     if (var25 == 1 && var26 >= var43 - 75) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var26 <= 75 + var43 && var27 >= var76 - 20 && var27 <= 20 + var76) {
                           classBF.field384 = 1641412837;
                        }
                     }
                  } else if (13 == -47366135 * classBF.field384) {
                     int var46 = Ignored.field5838 * 1429288549;
                     short var77 = 321;
                     if (var25 == 1) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var26 >= var46 - 75 && var26 <= 75 + var46 && var27 >= var77 - 20 && var27 <= var77 + 20) {
                           classIV.method6320(true, (byte)35);
                        }
                     }
                  } else if (14 == classBF.field384 * -47366135) {
                     String var47 = "";
                     switch (-20437633 * classBF.field387) {
                        case 0:
                           var47 = "https://secure.runescape.com/m=offence-appeal/account-history";
                           break;
                        case 1:
                           var47 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                           break;
                        case 2:
                           var47 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                           break;
                        default:
                           classBJ.method1117(false, -347989319);
                     }

                     int var78 = classBF.field394 * -511275367 + 180;
                     short var103 = 276;
                     if (1 == var25 && var26 >= var78 - 75 && var26 <= 75 + var78 && var27 >= var103 - 20) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var27 <= 20 + var103) {
                           classUF.method11299(var47, (byte)-2);
                           WorldEntity.method10624(classKK.field3869, classKK.field3870, classKK.field3762, (byte)-3);
                           classAC.method326(6, 2024540476);
                           return;
                        }
                     }

                     var78 = -511275367 * classBF.field394 + 180;
                     var103 = 326;
                     if (1 == var25 && var26 >= var78 - 75 && var26 <= 75 + var78) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var27 >= var103 - 20 && var27 <= var103 + 20) {
                           classBJ.method1117(false, -347989319);
                        }
                     }
                  } else if (-47366135 * classBF.field384 == 24) {
                     if (var3 == 32) {
                        return;
                     }

                     int var48 = -511275367 * classBF.field394 + 180;
                     short var80 = 301;
                     if (1 == var25 && var26 >= var48 - 75 && var26 <= 75 + var48 && var27 >= var80 - 20 && var27 <= 20 + var80) {
                        if (var3 == 32) {
                           return;
                        }

                        classIV.method6320(false, (byte)-2);
                     }
                  } else if (32 == classBF.field384 * -47366135) {
                     int var49 = 180 + classBF.field394 * -511275367 - 80;
                     short var81 = 321;
                     if (var25 == 1) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var26 >= var49 - 75) {
                           if (var3 == 32) {
                              return;
                           }

                           if (var26 <= 75 + var49) {
                              if (var3 == 32) {
                                 return;
                              }

                              if (var27 >= var81 - 20 && var27 <= 20 + var81) {
                                 classUF.method11299(classLZ.method7427("secure", true, -1581832459) + "m=dob/set_dob.ws", (byte)14);
                                 WorldEntity.method10624(classKK.field3869, classKK.field3870, classKK.field3762, (byte)-114);
                                 classAC.method326(6, 2031516628);
                                 return;
                              }
                           }
                        }
                     }

                     var49 = 180 + -511275367 * classBF.field394 + 80;
                     if (1 == var25 && var26 >= var49 - 75 && var26 <= 75 + var49 && var27 >= var81 - 20 && var27 <= 20 + var81) {
                        classBJ.method1117(true, -347989319);
                     }
                  } else if (33 == -47366135 * classBF.field384) {
                     int var51 = classBF.field394 * -511275367 + 180;
                     short var82 = 276;
                     if (1 == var25 && var26 >= var51 - 75) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var26 <= 75 + var51 && var27 >= var82 - 20 && var27 <= var82 + 20) {
                           classUF.method11299(classKK.field3925, (byte)-61);
                        }
                     }

                     var51 = -511275367 * classBF.field394 + 180;
                     var82 = 326;
                     if (1 == var25 && var26 >= var51 - 75 && var26 <= 75 + var51 && var27 >= var82 - 20 && var27 <= 20 + var82) {
                        classBJ.method1117(true, -347989319);
                     }
                  } else if (34 == classBF.field384 * -47366135) {
                     int var53 = -511275367 * classBF.field394 + 180;
                     short var84 = 276;
                     if (1 == var25) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var26 >= var53 - 75 && var26 <= var53 + 75) {
                           if (var3 == 32) {
                              return;
                           }

                           if (var27 >= var84 - 20 && var27 <= var84 + 20) {
                              if (classKB.method6447(55644781)) {
                                 classBF.field413 = true;
                                 classBF.field408 = 0;
                                 classBF.field409 = 0;
                              }

                              return;
                           }
                        }
                     }

                     if (null != classIS.field3054 && classKB.method6447(568918758)) {
                        if (var3 == 32) {
                           return;
                        }

                        classBF.field413 = true;
                        classBF.field408 = 0;
                        classBF.field409 = 0;
                     }

                     var53 = 180 + classBF.field394 * -511275367;
                     var84 = 326;
                     if (var25 == 1 && var26 >= var53 - 75) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var26 <= 75 + var53 && var27 >= var84 - 20) {
                           if (var3 == 32) {
                              return;
                           }

                           if (var27 <= 20 + var84) {
                              classBJ.method1117(false, -347989319);
                           }
                        }
                     }
                  } else if (38 == -47366135 * classBF.field384) {
                     int var55 = Ignored.field5838 * 1429288549;
                     short var86 = 281;
                     classUQ var105 = var1.method51(classKK.field3908, var55, var86);
                     if (1 == var25 && var105.method11474(var26, var27, -594779443)) {
                        classUF.method11299(classKK.field3909, (byte)-65);
                        return;
                     }

                     var105.method11467((byte)-81);
                     var55 = Ignored.field5838 * 1429288549 - 80;
                     var86 = 321;
                     if (var25 == 1 && var26 >= var55 - 75) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var26 <= 75 + var55 && var27 >= var86 - 20) {
                           if (var3 == 32) {
                              return;
                           }

                           if (var27 <= 20 + var86) {
                              classUF.method11299(classKK.field3925, (byte)-7);
                              return;
                           }
                        }
                     }

                     var55 = 80 + 1429288549 * Ignored.field5838;
                     if (var25 == 1 && var26 >= var55 - 75 && var26 <= var55 + 75) {
                        if (var3 == 32) {
                           return;
                        }

                        if (var27 >= var86 - 20) {
                           if (var3 == 32) {
                              return;
                           }

                           if (var27 <= var86 + 20) {
                              classBJ.method1117(true, -347989319);
                              return;
                           }
                        }
                     }

                     while (var10.method4531((short)12331)) {
                        if (var10.field2181 * 1363213817 == 84) {
                           classBJ.method1117(true, -347989319);
                           return;
                        }

                        if (var10.field2181 * 1363213817 == 13) {
                           classIV.method6320(true, (byte)32);
                           return;
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var24) {
         throw classEG.newRunException(var24, "bb.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/io/File;ZI)Z")
   @ObfuscatedName("af")
   static boolean method788(File var0, boolean var1, int var2) {
      try {
         try {
            RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
            int var4 = var3.read();
            var3.seek(0L);
            var3.write(var4);
            var3.seek(0L);
            var3.close();
            if (var1) {
               if (var2 == 934237077) {
                  throw new IllegalStateException();
               }

               var0.delete();
            }

            return true;
         } catch (Exception var5) {
            return false;
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "bb.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lzu;")
   @ObfuscatedName("af")
   public static classZU method780(int var0, int var1) {
      try {
         classZU var2 = (classZU)classZU.field7271.method6422(var0);
         if (null != var2) {
            return var2;
         } else {
            byte[] var3 = classZU.field7277.method11867(39, var0, -1016794375);
            var2 = new classZU(new Buffer(var3), var0, -1);
            classZU.field7271.method6428(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "bb.af(" + ')');
      }
   }
}
