import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bl")
public class Script extends classVJ implements net.runelite.api.Script {
   @ObfuscatedName("ax")
   long[] field503;
   @ObfuscatedSignature(descriptor = "[Lyn;")
   @ObfuscatedName("af")
   IterableNodeHashTable[] field505;
   @ObfuscatedName("ad")
   static String field499;
   @ObfuscatedName("ae")
   String field500;
   @ObfuscatedName("ab")
   int[] field501;
   @ObfuscatedName("as")
   String[] field504;
   @ObfuscatedName("aj")
   int field494;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("az")
   static EvictingDualNodeHashTable field491 = new EvictingDualNodeHashTable(128);
   @ObfuscatedName("aa")
   int field492;
   @ObfuscatedName("ao")
   int field496;
   @ObfuscatedName("al")
   int field495;
   @ObfuscatedName("ac")
   int field493;
   @ObfuscatedName("ay")
   int field497;
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   static final int field498 = 503;
   @ObfuscatedName("ag")
   int[] field502;

   public int[] getInstructions() {
      return this.field501;
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;")
   @ObfuscatedName("ag")
   String method1136(int var1, int var2) {
      try {
         return this.field504[var1];
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "bl.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bc")
   static void method1141() {
      EvictingDualNodeHashTable.method6431(field491);
   }

   @ObfuscatedSignature(descriptor = "(IB)J")
   @ObfuscatedName("as")
   long method1138(int var1, byte var2) {
      try {
         return this.field503[var1];
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "bl.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)[Lyn;")
   @ObfuscatedName("ac")
   IterableNodeHashTable[] method1144(int var1, byte var2) {
      try {
         return new IterableNodeHashTable[var1];
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "bl.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFLsu;I)V")
   @ObfuscatedName("as")
   static void method1147(float var0, float var1, float var2, float var3, classSU var4, int var5) {
      try {
         float var6 = var1 - var0;
         float var7 = var2 - var1;
         float var8 = var3 - var2;
         float var9 = var7 - var6;
         var4.field6050 = var8 - var7 - var9;
         var4.field6051 = var9 + var9 + var9;
         var4.field6052 = var6 + (var6 + var6);
         var4.field6047 = var0;
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "bl.as(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lbl;")
   @ObfuscatedName("aa")
   static Script method1120(int var0) {
      Script var1 = (Script)field491.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classWN.field6759.method11867(var0, 0, -1075415501);
         if (var2 == null) {
            return null;
         } else {
            var1 = Widget.method7156(var2, -652641174);
            field491.method6428(var1, var0);
            return var1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Lbl;")
   @ObfuscatedName("ap")
   static Script method1126(int var0, int var1) {
      Script var2 = (Script)field491.method6422(var0 << 16);
      if (null != var2) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = classWN.field6759.method11848(var3, 1502181481);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = AbstractArchive.method11814(classWN.field6759, var4, 1229660067);
            if (null != var5) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = Widget.method7156(var5, -755539074);
               if (var2 != null) {
                  field491.method6428(var2, var0 << 16);
                  return var2;
               }
            }

            return null;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lbl;")
   @ObfuscatedName("al")
   static Script method1121(int var0) {
      Script var1 = (Script)field491.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classWN.field6759.method11867(var0, 0, -1957903762);
         if (var2 == null) {
            return null;
         } else {
            var1 = Widget.method7156(var2, -660300074);
            field491.method6428(var1, var0);
            return var1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)Lbl;")
   @ObfuscatedName("aj")
   static Script method1123(int var0, int var1, int var2) {
      int var3 = var0 + (var1 << 8);
      Script var5 = classQW.method9830(var3, var0, -1324601792);
      if (var5 != null) {
         return var5;
      } else {
         int var4 = classCO.method2558(var2, var0, -1895007308);
         var5 = classQW.method9830(var4, var0, -1959413482);
         if (null != var5) {
            return var5;
         } else {
            var4 = classMB.method7502(var0, (byte)33);
            var5 = classQW.method9830(var4, var0, -1265400786);
            return null != var5 ? var5 : null;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)Lbl;")
   @ObfuscatedName("av")
   static Script method1131(byte[] var0) {
      Script var1 = new Script();
      classXY var2 = new classXY(var0);
      var2.field6955 = (var2.field6954.length - 2) * 591824939;
      int var3 = classXY.method13047(var2, -1997748751);
      int var4 = var2.field6954.length - 2 - var3 - 16;
      var2.field6955 = var4 * 863910035;
      int var5 = var2.method13056((byte)1);
      var1.field493 = classXY.method13047(var2, -687423316) * -96297281;
      var1.field496 = classXY.method13047(var2, 1640438330) * -728515915;
      var1.field492 = classXY.method13047(var2, 956906237) * 2139455799;
      var1.field495 = classXY.method13047(var2, -777980594) * 1424730171;
      var1.field494 = classXY.method13047(var2, -1616901640) * 1267443041;
      var1.field497 = classXY.method13047(var2, 950104031) * 1116857197;
      int var6 = classXY.method13039(var2, -346779531);
      if (var6 > 0) {
         var1.field505 = var1.method1144(var6, (byte)111);

         for (int var7 = 0; var7 < var6; var7++) {
            int var8 = classXY.method13047(var2, 934050826);
            IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? classBZ.method1385(var8, -1565080523) : 1);
            var1.field505[var7] = var9;

            while (var8-- > 0) {
               int var10 = var2.method13056((byte)1);
               int var11 = var2.method13056((byte)1);
               IterableNodeHashTable.method13576(var9, new IntegerNode(var11), var10);
            }
         }
      }

      var2.field6955 = 0;
      var1.field500 = var2.method13069((byte)-81);
      var1.field501 = new int[var5];
      var1.field502 = new int[var5];
      var1.field504 = new String[var5];
      var1.field503 = new long[var5];
      int var12 = 0;

      while (var2.field6955 * -746506163 < var4) {
         int var13 = classXY.method13047(var2, -553357535);
         switch (var13) {
            case 3:
               var1.field504[var12] = var2.method13071(1333785886);
               break;
            case 21:
            case 38:
            case 39:
            case 62:
            case 63:
               var1.field502[var12] = classXY.method13039(var2, -346779531);
               break;
            case 61:
               var1.field503[var12] = var2.method13059(1111005302);
               break;
            default:
               if (var13 <= 1684263969) {
                  var1.field502[var12] = var2.method13056((byte)1);
               } else {
                  var1.field502[var12] = classXY.method13039(var2, -346779531);
               }
         }

         var1.field501[var12++] = var13;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lbl;")
   @ObfuscatedName("ao")
   static Script method1122(int var0) {
      Script var1 = (Script)field491.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = classWN.field6759.method11867(var0, 0, -1540402098);
         if (var2 == null) {
            return null;
         } else {
            var1 = Widget.method7156(var2, 301197489);
            field491.method6428(var1, var0);
            return var1;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Lbl;")
   @ObfuscatedName("ad")
   static Script method1127(int var0, int var1) {
      Script var2 = (Script)field491.method6422(var0 << 16);
      if (null != var2) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = classWN.field6759.method11848(var3, 1387792887);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = AbstractArchive.method11814(classWN.field6759, var4, 93317186);
            if (null != var5) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = Widget.method7156(var5, 378970215);
               if (var2 != null) {
                  field491.method6428(var2, var0 << 16);
                  return var2;
               }
            }

            return null;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)Lbl;")
   @ObfuscatedName("at")
   static Script method1132(byte[] var0) {
      Script var1 = new Script();
      classXY var2 = new classXY(var0);
      var2.field6955 = (var2.field6954.length - 2) * -831905392;
      int var3 = classXY.method13047(var2, 1735685840);
      int var4 = var2.field6954.length - 2 - var3 - 16;
      var2.field6955 = var4 * -1971317387;
      int var5 = var2.method13056((byte)1);
      var1.field493 = classXY.method13047(var2, -2054581581) * -420896219;
      var1.field496 = classXY.method13047(var2, -462106200) * -431593185;
      var1.field492 = classXY.method13047(var2, -253414877) * 296206261;
      var1.field495 = classXY.method13047(var2, 1744834755) * 1489098409;
      var1.field494 = classXY.method13047(var2, -1239296121) * -1788347878;
      var1.field497 = classXY.method13047(var2, -528961325) * 1116857197;
      int var6 = classXY.method13039(var2, -346779531);
      if (var6 > 0) {
         var1.field505 = var1.method1144(var6, (byte)44);

         for (int var7 = 0; var7 < var6; var7++) {
            int var8 = classXY.method13047(var2, -1701507871);
            IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? classBZ.method1385(var8, -1920534847) : 1);
            var1.field505[var7] = var9;

            while (var8-- > 0) {
               int var10 = var2.method13056((byte)1);
               int var11 = var2.method13056((byte)1);
               IterableNodeHashTable.method13576(var9, new IntegerNode(var11), var10);
            }
         }
      }

      var2.field6955 = 0;
      var1.field500 = var2.method13069((byte)99);
      var1.field501 = new int[var5];
      var1.field502 = new int[var5];
      var1.field504 = new String[var5];
      var1.field503 = new long[var5];
      int var12 = 0;

      while (var2.field6955 * -615329442 < var4) {
         int var13 = classXY.method13047(var2, -1248895536);
         switch (var13) {
            case 3:
               var1.field504[var12] = var2.method13071(1357366526);
               break;
            case 21:
            case 38:
            case 39:
            case 62:
            case 63:
               var1.field502[var12] = classXY.method13039(var2, -346779531);
               break;
            case 61:
               var1.field503[var12] = var2.method13059(1938807004);
               break;
            default:
               if (var13 <= 99) {
                  var1.field502[var12] = var2.method13056((byte)1);
               } else {
                  var1.field502[var12] = classXY.method13039(var2, -346779531);
               }
         }

         var1.field501[var12++] = var13;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Lbl;")
   @ObfuscatedName("au")
   static Script method1128(int var0, int var1) {
      Script var2 = (Script)field491.method6422(var0 << 16);
      if (null != var2) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = classWN.field6759.method11848(var3, 578334800);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = AbstractArchive.method11814(classWN.field6759, var4, 1071886326);
            if (null != var5) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = Widget.method7156(var5, -357754762);
               if (var2 != null) {
                  field491.method6428(var2, var0 << 16);
                  return var2;
               }
            }

            return null;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)Lbl;")
   @ObfuscatedName("aq")
   static Script method1124(int var0, int var1, int var2) {
      int var3 = var0 + (var1 << 8);
      Script var5 = classQW.method9830(var3, var0, -1770482952);
      if (var5 != null) {
         return var5;
      } else {
         int var4 = classCO.method2558(var2, var0, -571922427);
         var5 = classQW.method9830(var4, var0, -2111790260);
         if (null != var5) {
            return var5;
         } else {
            var4 = classMB.method7502(var0, (byte)-30);
            var5 = classQW.method9830(var4, var0, -1773944107);
            return null != var5 ? var5 : null;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Lbl;")
   @ObfuscatedName("ar")
   static Script method1129(int var0, int var1) {
      Script var2 = (Script)field491.method6422(var0 << 16);
      if (null != var2) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = classWN.field6759.method11848(var3, 859654941);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = AbstractArchive.method11814(classWN.field6759, var4, 968147341);
            if (null != var5) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = Widget.method7156(var5, -1084359021);
               if (var2 != null) {
                  field491.method6428(var2, var0 << 16);
                  return var2;
               }
            }

            return null;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)Lbl;")
   @ObfuscatedName("aw")
   static Script method1133(byte[] var0) {
      Script var1 = new Script();
      classXY var2 = new classXY(var0);
      var2.field6955 = (var2.field6954.length - 2) * 1075468663;
      int var3 = classXY.method13047(var2, 969181288);
      int var4 = var2.field6954.length - 2 - var3 - 16;
      var2.field6955 = var4 * -1095856699;
      int var5 = var2.method13056((byte)1);
      var1.field493 = classXY.method13047(var2, -409833244) * -1837812610;
      var1.field496 = classXY.method13047(var2, 1329446624) * -431593185;
      var1.field492 = classXY.method13047(var2, -608959795) * -2093708809;
      var1.field495 = classXY.method13047(var2, -320326370) * 1629253394;
      var1.field494 = classXY.method13047(var2, 1922177295) * 712179175;
      var1.field497 = classXY.method13047(var2, 243402036) * 1116857197;
      int var6 = classXY.method13039(var2, -346779531);
      if (var6 > 0) {
         var1.field505 = var1.method1144(var6, (byte)50);

         for (int var7 = 0; var7 < var6; var7++) {
            int var8 = classXY.method13047(var2, 221096906);
            IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? classBZ.method1385(var8, 29664065) : 1);
            var1.field505[var7] = var9;

            while (var8-- > 0) {
               int var10 = var2.method13056((byte)1);
               int var11 = var2.method13056((byte)1);
               IterableNodeHashTable.method13576(var9, new IntegerNode(var11), var10);
            }
         }
      }

      var2.field6955 = 0;
      var1.field500 = var2.method13069((byte)31);
      var1.field501 = new int[var5];
      var1.field502 = new int[var5];
      var1.field504 = new String[var5];
      var1.field503 = new long[var5];
      int var12 = 0;

      while (var2.field6955 * 702114061 < var4) {
         int var13 = classXY.method13047(var2, 16925233);
         switch (var13) {
            case 3:
               var1.field504[var12] = var2.method13071(-804935468);
               break;
            case 21:
            case 38:
            case 39:
            case 62:
            case 63:
               var1.field502[var12] = classXY.method13039(var2, -346779531);
               break;
            case 61:
               var1.field503[var12] = var2.method13059(-392287227);
               break;
            default:
               if (var13 <= 99) {
                  var1.field502[var12] = var2.method13056((byte)1);
               } else {
                  var1.field502[var12] = classXY.method13039(var2, -346779531);
               }
         }

         var1.field501[var12++] = var13;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)Lbl;")
   @ObfuscatedName("ak")
   static Script method1134(byte[] var0) {
      Script var1 = new Script();
      classXY var2 = new classXY(var0);
      var2.field6955 = (var2.field6954.length - 2) * -1095856699;
      int var3 = classXY.method13047(var2, 839616590);
      int var4 = var2.field6954.length - 2 - var3 - 16;
      var2.field6955 = var4 * -1095856699;
      int var5 = var2.method13056((byte)1);
      var1.field493 = classXY.method13047(var2, -1479087212) * -420896219;
      var1.field496 = classXY.method13047(var2, -1028103447) * -431593185;
      var1.field492 = classXY.method13047(var2, 208388031) * 2139455799;
      var1.field495 = classXY.method13047(var2, -1956778276) * 1424730171;
      var1.field494 = classXY.method13047(var2, 1924510187) * 712179175;
      var1.field497 = classXY.method13047(var2, -1007543406) * 1116857197;
      int var6 = classXY.method13039(var2, -346779531);
      if (var6 > 0) {
         var1.field505 = var1.method1144(var6, (byte)4);

         for (int var7 = 0; var7 < var6; var7++) {
            int var8 = classXY.method13047(var2, 980725575);
            IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? classBZ.method1385(var8, -1203260193) : 1);
            var1.field505[var7] = var9;

            while (var8-- > 0) {
               int var10 = var2.method13056((byte)1);
               int var11 = var2.method13056((byte)1);
               IterableNodeHashTable.method13576(var9, new IntegerNode(var11), var10);
            }
         }
      }

      var2.field6955 = 0;
      var1.field500 = var2.method13069((byte)-8);
      var1.field501 = new int[var5];
      var1.field502 = new int[var5];
      var1.field504 = new String[var5];
      var1.field503 = new long[var5];
      int var12 = 0;

      while (var2.field6955 * 702114061 < var4) {
         int var13 = classXY.method13047(var2, -1371653577);
         switch (var13) {
            case 3:
               var1.field504[var12] = var2.method13071(1515649554);
               break;
            case 21:
            case 38:
            case 39:
            case 62:
            case 63:
               var1.field502[var12] = classXY.method13039(var2, -346779531);
               break;
            case 61:
               var1.field503[var12] = var2.method13059(747555993);
               break;
            default:
               if (var13 <= 99) {
                  var1.field502[var12] = var2.method13056((byte)1);
               } else {
                  var1.field502[var12] = classXY.method13039(var2, -346779531);
               }
         }

         var1.field501[var12++] = var13;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bx")
   static void method1142() {
      EvictingDualNodeHashTable.method6431(field491);
   }

   Script() {
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("an")
   String method1137(int var1) {
      return this.field504[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("ah")
   long method1139(int var1) {
      return this.field503[var1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bn")
   static void method1143() {
      EvictingDualNodeHashTable.method6431(field491);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)Lbl;")
   @ObfuscatedName("ai")
   static Script method1130(int var0, int var1) {
      Script var2 = (Script)field491.method6422(var0 << 16);
      if (null != var2) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = classWN.field6759.method11848(var3, 2114244702);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = AbstractArchive.method11814(classWN.field6759, var4, -1100792790);
            if (null != var5) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = Widget.method7156(var5, -452129036);
               if (var2 != null) {
                  field491.method6428(var2, var0 << 16);
                  return var2;
               }
            }

            return null;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("am")
   long method1140(int var1) {
      return this.field503[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)[Lyn;")
   @ObfuscatedName("br")
   IterableNodeHashTable[] method1145(int var1) {
      return new IterableNodeHashTable[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)[Lyn;")
   @ObfuscatedName("bp")
   IterableNodeHashTable[] method1146(int var1) {
      return new IterableNodeHashTable[var1];
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("bp")
   static void method1148(int var0, int var1, int var2) {
      try {
         if (classMH.method7572((byte)11) != 0) {
            if (var2 >= 1705238207) {
               throw new IllegalStateException();
            }

            if (var0 != -1) {
               if (var2 >= 1705238207) {
                  throw new IllegalStateException();
               }

               ArrayList var3 = new ArrayList();
               var3.add(new MidiRequest(classCB.field650, var0, 0, classMH.method7572((byte)11), false));
               classIJ.method6215(var3, 0, 0, 0, 0, true, -2034567971);
               client.field989 = true;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "bl.bp(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)Lbl;")
   @ObfuscatedName("ay")
   static Script method1125(int var0, int var1, int var2) {
      int var3 = var0 + (var1 << 8);
      Script var5 = classQW.method9830(var3, var0, -1084871735);
      if (var5 != null) {
         return var5;
      } else {
         int var4 = classCO.method2558(var2, var0, -1868152834);
         var5 = classQW.method9830(var4, var0, -1389230491);
         if (null != var5) {
            return var5;
         } else {
            var4 = classMB.method7502(var0, (byte)-37);
            var5 = classQW.method9830(var4, var0, -1911860678);
            return null != var5 ? var5 : null;
         }
      }
   }

   public int[] getIntOperands() {
      return this.field502;
   }

   @ObfuscatedSignature(descriptor = "(Luz;FI)Luz;")
   @ObfuscatedName("ax")
   public static final classUZ method1135(classUZ var0, float var1, int var2) {
      try {
         classUZ var3 = WorldMapArea.method5840(var0, (byte)19);
         var3.method11775(var1, -898429787);
         return var3;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "bl.ax(" + ')');
      }
   }
}
