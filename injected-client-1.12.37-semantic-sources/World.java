import java.net.URL;
import java.util.EnumSet;
import net.runelite.api.WorldType;
import net.runelite.api.events.WorldListLoad;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("cm")
public class World implements net.runelite.api.World {
   @ObfuscatedName("al")
   int field1160;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field1158 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field1157 = 0;
   @ObfuscatedName("aa")
   static int[] field1154 = new int[]{0, 1, 2, 3};
   @ObfuscatedSignature(descriptor = "[Lcm;")
   @ObfuscatedName("ag")
   static World[] field1170;
   @ObfuscatedName("ax")
   static int field1156 = 0;
   @ObfuscatedName("ac")
   static int[] field1155 = new int[]{1, 1, 1, 1};
   @ObfuscatedName("aq")
   String field1169;
   @ObfuscatedName("as")
   static int field1153 = 0;
   @ObfuscatedName("ay")
   int field1163;
   @ObfuscatedName("ap")
   int field1161;
   @ObfuscatedName("au")
   int field1162;
   @ObfuscatedName("ad")
   String field1167;
   @ObfuscatedName("be")
   static int field1165;
   @ObfuscatedName("aj")
   int field1159;
   @ObfuscatedName("ai")
   String field1168;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field1164 = 3;
   @ObfuscatedName("gb")
   static int field1166;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IZIZ)V")
   @ObfuscatedName("bn")
   static void method2470(int var0, boolean var1, int var2, boolean var3) {
      if (field1170 != null) {
         classLV.method7155(0, field1170.length - 1, var0, var1, var2, var3, (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("aa")
   boolean method2482(byte var1) {
      try {
         boolean var10000;
         if ((classXE.field6828.vmethod8((byte)1) & -458552905 * this.field1163) != 0) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cm.aa(" + ')');
      }
   }

   public void setActivity(String var1) {
      this.field1167 = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("sm")
   public int method2528() {
      return this.field1163 * -458552905;
   }

   public int getLocation() {
      return this.field1160 * -288138629;
   }

   @ObfuscatedSignature(descriptor = "(Lcm;B)Z")
   @ObfuscatedName("qb")
   public static boolean method2514(World var0, byte var1) {
      if (var0 == null) {
         var0.method2520(var1);
      }

      try {
         boolean var10000;
         if ((classXE.field6836.vmethod8((byte)1) & -458552905 * var0.field1163) != 0) {
            if (var1 == 4) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cm.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cd")
   boolean method2509() {
      return (classXE.field6851.vmethod8((byte)1) & this.field1163 * -458552905) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ak")
   static void method2463(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for (int var5 = 0; var5 < 4; var5++) {
         if (var0 != field1154[var5]) {
            var2[var4] = field1154[var5];
            var3[var4] = field1155[var5];
            var4++;
         }
      }

      field1154 = var2;
      field1155 = var3;
      classEH.method3893(field1170, 0, field1170.length - 1, field1154, field1155, -708121701);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aj")
   boolean method2493(int var1) {
      try {
         return (classXE.field6830.vmethod8((byte)1) & -458552905 * this.field1163) != 0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cm.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ay")
   boolean method2497(int var1) {
      try {
         boolean var10000;
         if ((classXE.field6831.vmethod8((byte)1) & this.field1163 * -458552905) != 0) {
            if (var1 != 787579061) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cm.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ck")
   boolean method2515() {
      return (classXE.field6836.vmethod8((byte)1) & -458552905 * this.field1163) != 0;
   }

   public void setPlayerCount(int var1) {
      this.field1161 = var1 * -6609823;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ad")
   boolean method2506(int var1) {
      try {
         boolean var10000;
         if ((classXE.field6833.vmethod8((byte)1) & this.field1163 * -458552905) != 0) {
            if (var1 >= 1870919123) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cm.ad(" + ')');
      }
   }

   public void setId(int var1) {
      this.field1162 = var1 * 1473529319;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ap")
   boolean method2510(int var1) {
      try {
         boolean var10000;
         if ((classXE.field6851.vmethod8((byte)1) & this.field1163 * -458552905) != 0) {
            if (var1 == -342707056) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cm.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ai")
   boolean method2521(int var1) {
      try {
         boolean var10000;
         if ((classXE.field6855.vmethod8((byte)1) & this.field1163 * -458552905) != 0) {
            if (var1 == 1879977691) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cm.ai(" + ')');
      }
   }

   public String getActivity() {
      return this.field1167;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcy;Z)V")
   @ObfuscatedName("ir")
   public static void method2526(ClientPreferences var0, boolean var1) {
      if (var0 == null) {
         var0.method2710();
      }

      var0.field1348 = var1;
      classMW.method7732(1041414693);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cz")
   boolean method2522() {
      return (classXE.field6855.vmethod8((byte)1) & this.field1163 * -458552905) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lcm;")
   @ObfuscatedName("bk")
   static World method2479() {
      return -932636273 * field1156 < field1153 * -622036481 ? field1170[(field1156 += 2111825263) * -932636273 - 1] : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("aw")
   static boolean method2460() {
      try {
         if (classIS.field3054 == null) {
            classIS.field3054 = classAV.field294.method2872(new URL(classEV.field1947), -583356724);
         } else if (classIS.field3054.method4106(1514527003)) {
            byte[] var0 = classIS.field3054.method4112(1145062404);
            classXY var1 = new classXY(var0);
            var1.method13056((byte)1);
            field1153 = classXY.method13047(var1, -664788828) * -756054529;
            field1170 = new World[-622036481 * field1153];

            for (int var2 = 0; var2 < field1153 * 1005185384; var2++) {
               World var3 = field1170[var2] = new World();
               var3.field1162 = classXY.method13047(var1, 457816137) * 959043897;
               var3.field1163 = var1.method13056((byte)1) * 1370694663;
               var3.field1169 = var1.method13071(1417573315);
               var3.field1167 = var1.method13071(1852487945);
               var3.field1160 = classXY.method13039(var1, -346779531) * 774403251;
               var3.field1161 = var1.method13050((byte)16) * 11698499;
               var3.field1159 = -2120942284 * var2;
            }

            classEH.method3893(field1170, 0, field1170.length - 1, field1154, field1155, -831637975);
            classIS.field3054 = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         classIS.field3054 = null;
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(Lcm;I)Z")
   @ObfuscatedName("iu")
   public static boolean method2487(World var0, int var1) {
      if (var0 == null) {
         var0.method2505(var1);
      }

      try {
         return (classXE.field6844.vmethod8((byte)1) & -458552905 * var0.field1163) != 0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cm.ao(" + ')');
      }
   }

   World() {
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("av")
   static void method2464(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for (int var5 = 0; var5 < 4; var5++) {
         if (var0 != field1154[var5]) {
            var2[var4] = field1154[var5];
            var3[var4] = field1155[var5];
            var4++;
         }
      }

      field1154 = var2;
      field1155 = var3;
      classEH.method3893(field1170, 0, field1170.length - 1, field1154, field1155, -1599762257);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcm;)Z")
   @ObfuscatedName("sb")
   public static boolean method2483(World var0) {
      if (var0 == null) {
         var0.method2503();
      }

      return (classXE.field6828.vmethod8((byte)1) & -458552905 * var0.field1163) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bl")
   boolean method2494() {
      return (classXE.field6830.vmethod8((byte)1) & -1521705516 * this.field1163) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Lcm;II[I[I)V")
   @ObfuscatedName("an")
   static void method2466(World[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var5 = var1 - 1;
         int var6 = var2 + 1;
         int var7 = (var2 + var1) / 2;
         World var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while (var5 < var6) {
            boolean var9 = true;

            do {
               var6--;

               for (int var10 = 0; var10 < 4; var10++) {
                  int var11;
                  int var12;
                  if (2 == var3[var10]) {
                     var11 = var0[var6].field1159 * -1690959211;
                     var12 = var8.field1159 * -1690959211;
                  } else if (var3[var10] == 1) {
                     var11 = -2130350814 * var0[var6].field1161;
                     var12 = var8.field1161 * 490202886;
                     if (var11 == -1 && 1 == var4[var10]) {
                        var11 = 2001;
                     }

                     if (-1 == var12 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if (3 == var3[var10]) {
                     var11 = var0[var6].method2482((byte)-63) ? 1 : 0;
                     var12 = var8.method2482((byte)-16) ? 1 : 0;
                  } else {
                     var11 = var0[var6].field1162 * 851246551;
                     var12 = var8.field1162 * 851246551;
                  }

                  if (var12 != var11) {
                     if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while (var9);

            var9 = true;

            do {
               var5++;

               for (int var14 = 0; var14 < 4; var14++) {
                  int var16;
                  int var17;
                  if (2 == var3[var14]) {
                     var16 = var0[var5].field1159 * -1690959211;
                     var17 = var8.field1159 * -1053626286;
                  } else if (1 == var3[var14]) {
                     var16 = 869266390 * var0[var5].field1161;
                     var17 = var8.field1161 * 597852065;
                     if (var16 == -1 && var4[var14] == 1) {
                        var16 = 2001;
                     }

                     if (-1 == var17 && var4[var14] == 1) {
                        var17 = 2001;
                     }
                  } else if (3 == var3[var14]) {
                     var16 = var0[var5].method2482((byte)-41) ? 1 : 0;
                     var17 = var8.method2482((byte)-44) ? 1 : 0;
                  } else {
                     var16 = 851246551 * var0[var5].field1162;
                     var17 = var8.field1162 * 1360952651;
                  }

                  if (var16 != var17) {
                     if ((var4[var14] != 1 || var16 >= var17) && (var4[var14] != 0 || var16 <= var17)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (3 == var14) {
                     var9 = false;
                  }
               }
            } while (var9);

            if (var5 < var6) {
               World var15 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var15;
            }
         }

         classEH.method3893(var0, var1, var6, var3, var4, -1124390134);
         classEH.method3893(var0, 1 + var6, var2, var3, var4, -1323305075);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Lcm;II[I[I)V")
   @ObfuscatedName("am")
   static void method2467(World[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var5 = var1 - 1;
         int var6 = var2 + 1;
         int var7 = (var2 + var1) / 2;
         World var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while (var5 < var6) {
            boolean var9 = true;

            do {
               var6--;

               for (int var10 = 0; var10 < 4; var10++) {
                  int var11;
                  int var12;
                  if (2 == var3[var10]) {
                     var11 = var0[var6].field1159 * -1690959211;
                     var12 = var8.field1159 * -1690959211;
                  } else if (var3[var10] == 1) {
                     var11 = 597852065 * var0[var6].field1161;
                     var12 = var8.field1161 * 597852065;
                     if (var11 == -1 && 1 == var4[var10]) {
                        var11 = 2001;
                     }

                     if (-1 == var12 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if (3 == var3[var10]) {
                     var11 = var0[var6].method2482((byte)-41) ? 1 : 0;
                     var12 = var8.method2482((byte)-87) ? 1 : 0;
                  } else {
                     var11 = var0[var6].field1162 * 851246551;
                     var12 = var8.field1162 * 851246551;
                  }

                  if (var12 != var11) {
                     if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while (var9);

            var9 = true;

            do {
               var5++;

               for (int var14 = 0; var14 < 4; var14++) {
                  int var16;
                  int var17;
                  if (2 == var3[var14]) {
                     var16 = var0[var5].field1159 * -1690959211;
                     var17 = var8.field1159 * -1690959211;
                  } else if (1 == var3[var14]) {
                     var16 = 597852065 * var0[var5].field1161;
                     var17 = var8.field1161 * 597852065;
                     if (var16 == -1 && var4[var14] == 1) {
                        var16 = 2001;
                     }

                     if (-1 == var17 && var4[var14] == 1) {
                        var17 = 2001;
                     }
                  } else if (3 == var3[var14]) {
                     var16 = var0[var5].method2482((byte)-36) ? 1 : 0;
                     var17 = var8.method2482((byte)-119) ? 1 : 0;
                  } else {
                     var16 = 851246551 * var0[var5].field1162;
                     var17 = var8.field1162 * 851246551;
                  }

                  if (var16 != var17) {
                     if ((var4[var14] != 1 || var16 >= var17) && (var4[var14] != 0 || var16 <= var17)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (3 == var14) {
                     var9 = false;
                  }
               }
            } while (var9);

            if (var5 < var6) {
               World var15 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var15;
            }
         }

         classEH.method3893(var0, var1, var6, var3, var4, -495044258);
         classEH.method3893(var0, 1 + var6, var2, var3, var4, -447150933);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cn")
   boolean method2523() {
      return (classXE.field6855.vmethod8((byte)1) & this.field1163 * -1331514710) != 0;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("tg")
   public void method2527(int var1) {
      World[] var2 = classOE.field4843.method2454();
      if (var2 != null && var2.length > 0 && var2[var2.length - 1] == this) {
         WorldListLoad var3 = new WorldListLoad(var2);
         classOE.field4843.getCallbacks().post(var3);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcl;)Ldz;")
   @ObfuscatedName("ru")
   public static WorldView method2462(classCL var0) {
      if (var0 == null) {
         var0.method1593();
      }

      return var0.field785;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Lcm;II[I[I)V")
   @ObfuscatedName("ah")
   static void method2468(World[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var5 = var1 - 1;
         int var6 = var2 + 1;
         int var7 = (var2 + var1) / 2;
         World var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while (var5 < var6) {
            boolean var9 = true;

            do {
               var6--;

               for (int var10 = 0; var10 < 4; var10++) {
                  int var11;
                  int var12;
                  if (2 == var3[var10]) {
                     var11 = var0[var6].field1159 * -1690959211;
                     var12 = var8.field1159 * -1690959211;
                  } else if (var3[var10] == 1) {
                     var11 = 1698528457 * var0[var6].field1161;
                     var12 = var8.field1161 * 298125490;
                     if (var11 == -1 && 1 == var4[var10]) {
                        var11 = -63168020;
                     }

                     if (-1 == var12 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if (3 == var3[var10]) {
                     var11 = var0[var6].method2482((byte)-121) ? 1 : 0;
                     var12 = var8.method2482((byte)-14) ? 1 : 0;
                  } else {
                     var11 = var0[var6].field1162 * 851246551;
                     var12 = var8.field1162 * 851246551;
                  }

                  if (var12 != var11) {
                     if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while (var9);

            var9 = true;

            do {
               var5++;

               for (int var14 = 0; var14 < 4; var14++) {
                  int var16;
                  int var17;
                  if (2 == var3[var14]) {
                     var16 = var0[var5].field1159 * 873277658;
                     var17 = var8.field1159 * -54070458;
                  } else if (1 == var3[var14]) {
                     var16 = 597852065 * var0[var5].field1161;
                     var17 = var8.field1161 * -1529974824;
                     if (var16 == -1 && var4[var14] == 1) {
                        var16 = 2001;
                     }

                     if (-1 == var17 && var4[var14] == 1) {
                        var17 = 1129151798;
                     }
                  } else if (3 == var3[var14]) {
                     var16 = var0[var5].method2482((byte)-114) ? 1 : 0;
                     var17 = var8.method2482((byte)-3) ? 1 : 0;
                  } else {
                     var16 = -1315793413 * var0[var5].field1162;
                     var17 = var8.field1162 * 851246551;
                  }

                  if (var16 != var17) {
                     if ((var4[var14] != 1 || var16 >= var17) && (var4[var14] != 0 || var16 <= var17)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (3 == var14) {
                     var9 = false;
                  }
               }
            } while (var9);

            if (var5 < var6) {
               World var15 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var15;
            }
         }

         classEH.method3893(var0, var1, var6, var3, var4, -1217881847);
         classEH.method3893(var0, 1 + var6, var2, var3, var4, -756300278);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IZIZ)V")
   @ObfuscatedName("bx")
   static void method2471(int var0, boolean var1, int var2, boolean var3) {
      if (field1170 != null) {
         classLV.method7155(0, field1170.length - 1, var0, var1, var2, var3, (byte)1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IZIZ)V")
   @ObfuscatedName("bc")
   static void method2472(int var0, boolean var1, int var2, boolean var3) {
      if (field1170 != null) {
         classLV.method7155(0, field1170.length - 1, var0, var1, var2, var3, (byte)1);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ca")
   boolean method2516() {
      return (classXE.field6836.vmethod8((byte)1) & 1699851480 * this.field1163) != 0;
   }

   public int getIndex() {
      return this.field1159 * -1690959211;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcm;Lcm;IZ)I")
   @ObfuscatedName("br")
   static int method2474(World var0, World var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.field1161 * -273910630;
         int var5 = var1.field1161 * -1775146536;
         if (!var3) {
            if (var4 == -1) {
               var4 = 648449280;
            }

            if (var5 == -1) {
               var5 = -1979477134;
            }
         }

         return var4 - var5;
      } else if (2 == var2) {
         return var0.field1160 * -288138629 - var1.field1160 * 47740889;
      } else if (3 == var2) {
         if (var0.field1167.equals("-")) {
            if (var1.field1167.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.field1167.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.field1167.compareTo(var1.field1167);
         }
      } else if (var2 == 4) {
         return var0.method2497(787579061) ? (var1.method2497(787579061) ? 0 : 1) : (var1.method2497(787579061) ? -1 : 0);
      } else if (5 == var2) {
         return method2491(var0, -546454728) ? (method2491(var1, 962745217) ? 0 : 1) : (method2491(var1, -1485261039) ? -1 : 0);
      } else if (var2 == 6) {
         return var0.method2493(23162323) ? (var1.method2493(23162323) ? 0 : 1) : (var1.method2493(23162323) ? -1 : 0);
      } else if (7 == var2) {
         return var0.method2482((byte)-81) ? (var1.method2482((byte)-70) ? 0 : 1) : (var1.method2482((byte)-20) ? -1 : 0);
      } else {
         return var0.field1162 * 851246551 - 1054910152 * var1.field1162;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bi")
   boolean method2484() {
      return (classXE.field6828.vmethod8((byte)1) & -458552905 * this.field1163) != 0;
   }

   public void setTypes(EnumSet var1) {
      this.method2529(WorldType.toMask(var1));
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcm;Lcm;IZ)I")
   @ObfuscatedName("bt")
   static int method2475(World var0, World var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.field1161 * 2015570151;
         int var5 = var1.field1161 * 55529114;
         if (!var3) {
            if (var4 == -1) {
               var4 = 2001;
            }

            if (var5 == -1) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else if (2 == var2) {
         return var0.field1160 * -1215680141 - var1.field1160 * -1685449791;
      } else if (3 == var2) {
         if (var0.field1167.equals("-")) {
            if (var1.field1167.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.field1167.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.field1167.compareTo(var1.field1167);
         }
      } else if (var2 == 4) {
         return var0.method2497(787579061) ? (var1.method2497(787579061) ? 0 : 1) : (var1.method2497(787579061) ? -1 : 0);
      } else if (5 == var2) {
         return method2491(var0, 781581778) ? (method2491(var1, -19656711) ? 0 : 1) : (method2491(var1, 1491365115) ? -1 : 0);
      } else if (var2 == 6) {
         return var0.method2493(23162323) ? (var1.method2493(23162323) ? 0 : 1) : (var1.method2493(23162323) ? -1 : 0);
      } else if (7 == var2) {
         return var0.method2482((byte)-124) ? (var1.method2482((byte)-66) ? 0 : 1) : (var1.method2482((byte)-121) ? -1 : 0);
      } else {
         return var0.field1162 * 684147817 - -1728467098 * var1.field1162;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lcm;")
   @ObfuscatedName("bg")
   static World method2477() {
      field1156 = 0;
      return classSX.method10711(-1953402072);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lcm;")
   @ObfuscatedName("bj")
   static World method2478() {
      field1156 = 0;
      return classSX.method10711(-1953402072);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcm;Lcm;IZ)I")
   @ObfuscatedName("bm")
   static int method2476(World var0, World var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.field1161 * 597852065;
         int var5 = var1.field1161 * 597852065;
         if (!var3) {
            if (var4 == -1) {
               var4 = 2001;
            }

            if (var5 == -1) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else if (2 == var2) {
         return var0.field1160 * -288138629 - var1.field1160 * -288138629;
      } else if (3 == var2) {
         if (var0.field1167.equals("-")) {
            if (var1.field1167.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.field1167.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.field1167.compareTo(var1.field1167);
         }
      } else if (var2 == 4) {
         return var0.method2497(787579061) ? (var1.method2497(787579061) ? 0 : 1) : (var1.method2497(787579061) ? -1 : 0);
      } else if (5 == var2) {
         return method2491(var0, 1006797047) ? (method2491(var1, 1503155335) ? 0 : 1) : (method2491(var1, 1191787479) ? -1 : 0);
      } else if (var2 == 6) {
         return var0.method2493(23162323) ? (var1.method2493(23162323) ? 0 : 1) : (var1.method2493(23162323) ? -1 : 0);
      } else if (7 == var2) {
         return var0.method2482((byte)-104) ? (var1.method2482((byte)-13) ? 0 : 1) : (var1.method2482((byte)-11) ? -1 : 0);
      } else {
         return var0.field1162 * 851246551 - 851246551 * var1.field1162;
      }
   }

   public EnumSet getTypes() {
      return WorldType.fromMask(this.method2528());
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bh")
   boolean method2498() {
      return (classXE.field6831.vmethod8((byte)1) & this.field1163 * -458552905) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lcm;")
   @ObfuscatedName("bu")
   static World method2480() {
      return -932636273 * field1156 < field1153 * -622036481 ? field1170[(field1156 += 1111074769) * 1429306000 - 1] : null;
   }

   public void setAddress(String var1) {
      this.field1169 = var1;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cq")
   boolean method2507() {
      return (classXE.field6833.vmethod8((byte)1) & this.field1163 * -458552905) != 0;
   }

   public String getAddress() {
      return this.field1169;
   }

   public void setIndex(int var1) {
      this.field1159 = var1 * 1173469373;
   }

   @ObfuscatedSignature(descriptor = "(Lcm;I)Z")
   @ObfuscatedName("hj")
   public static boolean method2491(World var0, int var1) {
      if (var0 == null) {
         return var0.method2496(var1);
      } else {
         try {
            return (classXE.field6848.vmethod8((byte)1) & -458552905 * var0.field1163) != 0;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "cm.al(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bb")
   boolean method2485() {
      return (classXE.field6828.vmethod8((byte)1) & -458552905 * this.field1163) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIZIZ)V")
   @ObfuscatedName("bp")
   static void method2473(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var6 = (var1 + var0) / 2;
         int var7 = var0;
         World var8 = field1170[var6];
         field1170[var6] = field1170[var1];
         field1170[var1] = var8;

         for (int var9 = var0; var9 < var1; var9++) {
            World var11 = field1170[var9];
            int var12 = classLI.method7106(var11, var8, var2, var3, -1431181428);
            int var10;
            if (0 != var12) {
               if (var3) {
                  var10 = -var12;
               } else {
                  var10 = var12;
               }
            } else if (var4 == -1) {
               var10 = 0;
            } else {
               int var13 = classLI.method7106(var11, var8, var4, var5, -153413575);
               if (var5) {
                  var10 = -var13;
               } else {
                  var10 = var13;
               }
            }

            if (var10 <= 0) {
               World var14 = field1170[var9];
               field1170[var9] = field1170[var7];
               field1170[var7++] = var14;
            }
         }

         field1170[var1] = field1170[var7];
         field1170[var7] = var8;
         classLV.method7155(var0, var7 - 1, var2, var3, var4, var5, (byte)1);
         classLV.method7155(var7 + 1, var1, var2, var3, var4, var5, (byte)1);
      }
   }

   public int getPlayerCount() {
      return this.field1161 * 597852065;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("be")
   boolean method2488() {
      return (classXE.field6844.vmethod8((byte)1) & -458552905 * this.field1163) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("by")
   boolean method2489() {
      return (classXE.field6844.vmethod8((byte)1) & -458552905 * this.field1163) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bq")
   boolean method2490() {
      return (classXE.field6844.vmethod8((byte)1) & -458552905 * this.field1163) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bf")
   boolean method2492() {
      return (classXE.field6848.vmethod8((byte)1) & -458552905 * this.field1163) != 0;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("aq")
   boolean method2502(int var1) {
      try {
         return (classXE.field6840.vmethod8((byte)1) & this.field1163 * -458552905) != 0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cm.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bd")
   boolean method2495() {
      return (classXE.field6830.vmethod8((byte)1) & 280191658 * this.field1163) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bv")
   boolean method2499() {
      return (classXE.field6831.vmethod8((byte)1) & this.field1163 * -458552905) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cc")
   boolean method2517() {
      return (classXE.field6836.vmethod8((byte)1) & -458552905 * this.field1163) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bz")
   boolean method2500() {
      return (classXE.field6831.vmethod8((byte)1) & this.field1163 * -458552905) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cr")
   boolean method2501() {
      return (classXE.field6831.vmethod8((byte)1) & this.field1163 * 961790654) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cu")
   boolean method2503() {
      return (classXE.field6840.vmethod8((byte)1) & this.field1163 * -1344398439) != 0;
   }

   public void setLocation(int var1) {
      this.field1160 = var1 * 774403251;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cb")
   boolean method2504() {
      return (classXE.field6840.vmethod8((byte)1) & this.field1163 * -458552905) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cp")
   boolean method2508() {
      return (classXE.field6833.vmethod8((byte)1) & this.field1163 * 12782519) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ar")
   static boolean method2461() {
      try {
         if (classIS.field3054 == null) {
            classIS.field3054 = classAV.field294.method2872(new URL(classEV.field1947), 387365112);
         } else if (classIS.field3054.method4106(1365492735)) {
            byte[] var0 = classIS.field3054.method4112(1145062404);
            classXY var1 = new classXY(var0);
            var1.method13056((byte)1);
            field1153 = classXY.method13047(var1, 698189488) * -756054529;
            field1170 = new World[-622036481 * field1153];

            for (int var2 = 0; var2 < field1153 * -622036481; var2++) {
               World var3 = field1170[var2] = new World();
               var3.field1162 = classXY.method13047(var1, -1507193305) * 1473529319;
               var3.field1163 = var1.method13056((byte)1) * 1370694663;
               var3.field1169 = var1.method13071(-120235200);
               var3.field1167 = var1.method13071(-370357384);
               var3.field1160 = classXY.method13039(var1, -346779531) * 774403251;
               var3.field1161 = var1.method13050((byte)16) * -6609823;
               var3.field1159 = 1173469373 * var2;
            }

            classEH.method3893(field1170, 0, field1170.length - 1, field1154, field1155, -1496606902);
            classIS.field3054 = null;
            return true;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         classIS.field3054 = null;
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cl")
   boolean method2511() {
      return (classXE.field6851.vmethod8((byte)1) & this.field1163 * -458552905) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bw")
   boolean method2486() {
      return (classXE.field6828.vmethod8((byte)1) & -458552905 * this.field1163) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cv")
   boolean method2512() {
      return (classXE.field6851.vmethod8((byte)1) & this.field1163 * -458552905) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cs")
   boolean method2513() {
      return (classXE.field6851.vmethod8((byte)1) & this.field1163 * -458552905) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cy")
   boolean method2518() {
      return (classXE.field6836.vmethod8((byte)1) & -458552905 * this.field1163) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("co")
   boolean method2519() {
      return (classXE.field6836.vmethod8((byte)1) & -458552905 * this.field1163) != 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lcm;")
   @ObfuscatedName("bo")
   static World method2481() {
      return -800098030 * field1156 < field1153 * -622036481 ? field1170[(field1156 += 372216847) * 296239448 - 1] : null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("cf")
   boolean method2524() {
      return (classXE.field6855.vmethod8((byte)1) & this.field1163 * -458552905) != 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ch")
   boolean method2525() {
      return (classXE.field6855.vmethod8((byte)1) & this.field1163 * -458552905) != 0;
   }

   public int getId() {
      return this.field1162 * 851246551;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("at")
   static void method2465(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for (int var5 = 0; var5 < 4; var5++) {
         if (var0 != field1154[var5]) {
            var2[var4] = field1154[var5];
            var3[var4] = field1155[var5];
            var4++;
         }
      }

      field1154 = var2;
      field1155 = var3;
      classEH.method3893(field1170, 0, field1170.length - 1, field1154, field1155, -1086444376);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("lq")
   public void method2529(int var1) {
      this.field1163 = var1 * 1370694663;
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("au")
   boolean method2520(byte var1) {
      try {
         boolean var10000;
         if ((classXE.field6839.vmethod8((byte)1) & -458552905 * this.field1163) != 0) {
            if (var1 == 4) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cm.au(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsh;)I")
   @ObfuscatedName("qd")
   public static int method2469(classSH var0) {
      return -1877745129 * var0.field5955;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ao")
   boolean method2505(int var1) {
      try {
         return (classXE.field6844.vmethod8((byte)1) & this.field1162 * -458552905) != 0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cm.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("al")
   boolean method2496(int var1) {
      try {
         return (classXE.field6836.vmethod8((byte)1) & -458552905 * this.field1162) != 0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "cm.aj(" + ')');
      }
   }
}
