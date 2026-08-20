import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tj")
public class classTJ {
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field6148 = 16;
   @ObfuscatedName("az")
   static final int[] field6147 = new int[5000];

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;II)V")
   @ObfuscatedName("cu")
   public static void method10874(classTE var0, int var1, int var2) {
      classOL.method8512(var0, 1327640383);
      if (var1 >= 0 && var2 >= 0 && var1 < var0.method10756(-559299269) && var2 < var0.method10756(692556177)) {
         if (var2 != var1) {
            if (var0.field6128 == classYY.field7111) {
               int[] var3 = var0.method10748(1138611084);
               int var4 = var3[var1];
               var3[var1] = var3[var2];
               var3[var2] = var4;
            } else if (classYY.field7115 == var0.field6128) {
               long[] var6 = var0.method10750(-114602476);
               long var8 = var6[var1];
               var6[var1] = var6[var2];
               var6[var2] = var8;
            } else {
               Object[] var7 = classTE.method10753(var0, -2109094078);
               Object var9 = var7[var1];
               var7[var1] = var7[var2];
               var7[var2] = var9;
            }

            var0.field6133 = true;
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "([J[Ljava/lang/Object;IIB)V")
   @ObfuscatedName("aq")
   public static void method10873(long[] var0, Object[] var1, int var2, int var3, byte var4) {
      try {
         if (var2 < var3) {
            if (var4 != 4) {
               throw new IllegalStateException();
            }

            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            long var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            Object var9 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var9;
            byte var10000;
            if (var7 == Long.MAX_VALUE) {
               if (var4 != 4) {
                  throw new IllegalStateException();
               }

               var10000 = 0;
            } else {
               var10000 = 1;
            }

            byte var10 = var10000;

            for (int var11 = var2; var11 < var3; var11++) {
               if (var4 != 4) {
                  return;
               }

               if (var0[var11] < var7 + (var11 & var10)) {
                  if (var4 != 4) {
                     throw new IllegalStateException();
                  }

                  long var12 = var0[var11];
                  var0[var11] = var0[var6];
                  var0[var6] = var12;
                  Object var14 = var1[var11];
                  var1[var11] = var1[var6];
                  var1[var6++] = var14;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var9;
            method10873(var0, var1, var2, var6 - 1, (byte)4);
            method10873(var0, var1, var6 + 1, var3, (byte)4);
         }
      } catch (RuntimeException var15) {
         throw classEG.newRunException(var15, "tj.aq(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;II)I")
   @ObfuscatedName("bt")
   public static int method10849(classTE var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method10756(153394038)) {
         var3 = var0.method10756(141712528);
      }

      if (var0.field6128 == classYY.field7111) {
         int[] var9 = var0.method10748(-238738922);
         int var11 = (Integer)var1;

         for (int var6 = var2; var6 < var3; var6++) {
            if (var9[var6] == var11) {
               return var6;
            }
         }
      } else if (var0.field6128 == classYY.field7115) {
         long[] var8 = var0.method10750(22079298);
         long var10 = (Long)var1;

         for (int var7 = var2; var7 < var3; var7++) {
            if (var10 == var8[var7]) {
               return var7;
            }
         }
      } else {
         Object[] var4 = classTE.method10753(var0, -642568268);

         for (int var5 = var2; var5 < var3; var5++) {
            if (var1 == var4[var5] || var4[var5] != null && var4[var5].equals(var1)) {
               return var5;
            }
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;II)I")
   @ObfuscatedName("bg")
   public static int method10850(classTE var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method10756(-220444807)) {
         var3 = var0.method10756(455416275);
      }

      if (var0.field6128 == classYY.field7111) {
         int[] var9 = var0.method10748(1981921028);
         int var11 = (Integer)var1;

         for (int var6 = var2; var6 < var3; var6++) {
            if (var9[var6] == var11) {
               return var6;
            }
         }
      } else if (var0.field6128 == classYY.field7115) {
         long[] var8 = var0.method10750(-1265827251);
         long var10 = (Long)var1;

         for (int var7 = var2; var7 < var3; var7++) {
            if (var10 == var8[var7]) {
               return var7;
            }
         }
      } else {
         Object[] var4 = classTE.method10753(var0, -1203496537);

         for (int var5 = var2; var5 < var3; var5++) {
            if (var1 == var4[var5] || var4[var5] != null && var4[var5].equals(var1)) {
               return var5;
            }
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)I")
   @ObfuscatedName("bd")
   public static int method10864(classTE var0) {
      classCQ.method2572(var0, -903801304);
      byte var1 = 0;
      int var2 = var0.method10756(488970258);
      int var3 = -1;
      if (classYY.field7111 == var0.field6128) {
         int[] var4 = var0.method10748(1487734438);

         for (int var5 = var1; var5 < var2; var5++) {
            if (var3 == -1 || var4[var5] > var4[var3]) {
               var3 = var5;
            }
         }
      } else if (classYY.field7115 == var0.field6128) {
         long[] var8 = var0.method10750(-2049445819);

         for (int var10 = var1; var10 < var2; var10++) {
            if (-1 == var3 || var8[var10] > var8[var3]) {
               var3 = var10;
            }
         }
      } else if (classYY.field7113 == var0.field6128) {
         String var9 = null;
         Object[] var11 = classTE.method10753(var0, -801381533);

         for (int var6 = var1; var6 < var2; var6++) {
            String var7 = (String)var11[var6];
            if (var3 == -1 || var7 != null && var7.compareTo(var9) > 0) {
               var3 = var6;
               var9 = var7;
            }
         }
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;II)I")
   @ObfuscatedName("bk")
   public static int method10854(classTE var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method10756(-776646336)) {
         var3 = var0.method10756(-322756349);
      }

      if (classYY.field7111 == var0.field6128) {
         int[] var9 = var0.method10748(-324719503);
         int var11 = (Integer)var1;

         for (int var6 = var3 - 1; var6 >= var2; var6--) {
            if (var11 == var9[var6]) {
               return var6;
            }
         }
      } else if (classYY.field7115 == var0.field6128) {
         long[] var8 = var0.method10750(-713552922);
         long var10 = (Long)var1;

         for (int var7 = var3 - 1; var7 >= var2; var7--) {
            if (var10 == var8[var7]) {
               return var7;
            }
         }
      } else {
         Object[] var4 = classTE.method10753(var0, 1348624536);

         for (int var5 = var3 - 1; var5 >= var2; var5--) {
            if (var1 == var4[var5] || null != var4[var5] && var4[var5].equals(var1)) {
               return var5;
            }
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;II)I")
   @ObfuscatedName("bo")
   public static int method10855(classTE var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method10756(-349444905)) {
         var3 = var0.method10756(-1502573251);
      }

      if (classYY.field7111 == var0.field6128) {
         int[] var9 = var0.method10748(-428776682);
         int var11 = (Integer)var1;

         for (int var6 = var3 - 1; var6 >= var2; var6--) {
            if (var11 == var9[var6]) {
               return var6;
            }
         }
      } else if (classYY.field7115 == var0.field6128) {
         long[] var8 = var0.method10750(-1783656178);
         long var10 = (Long)var1;

         for (int var7 = var3 - 1; var7 >= var2; var7--) {
            if (var10 == var8[var7]) {
               return var7;
            }
         }
      } else {
         Object[] var4 = classTE.method10753(var0, -168345054);

         for (int var5 = var3 - 1; var5 >= var2; var5--) {
            if (var1 == var4[var5] || null != var4[var5] && var4[var5].equals(var1)) {
               return var5;
            }
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;II)I")
   @ObfuscatedName("bu")
   public static int method10857(classTE var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method10756(-837571102)) {
         var3 = var0.method10756(-495030206);
      }

      int var4 = 0;
      if (var0.field6128 == classYY.field7111) {
         int[] var5 = var0.method10748(-355638115);
         int var6 = (Integer)var1;

         for (int var7 = var2; var7 < var3; var7++) {
            if (var6 == var5[var7]) {
               var4++;
            }
         }
      } else if (classYY.field7115 == var0.field6128) {
         long[] var9 = var0.method10750(158231153);
         long var11 = (Long)var1;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var9[var8] == var11) {
               var4++;
            }
         }
      } else {
         Object[] var10 = classTE.method10753(var0, -1318440715);

         for (int var12 = var2; var12 < var3; var12++) {
            if (var10[var12] == var1 || null != var10[var12] && var10[var12].equals(var1)) {
               var4++;
            }
         }
      }

      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;II)I")
   @ObfuscatedName("ba")
   public static int method10858(classTE var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method10756(-2079127493)) {
         var3 = var0.method10756(-1973558352);
      }

      int var4 = 0;
      if (var0.field6128 == classYY.field7111) {
         int[] var5 = var0.method10748(1787344257);
         int var6 = (Integer)var1;

         for (int var7 = var2; var7 < var3; var7++) {
            if (var6 == var5[var7]) {
               var4++;
            }
         }
      } else if (classYY.field7115 == var0.field6128) {
         long[] var9 = var0.method10750(-1079772151);
         long var11 = (Long)var1;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var9[var8] == var11) {
               var4++;
            }
         }
      } else {
         Object[] var10 = classTE.method10753(var0, 726441811);

         for (int var12 = var2; var12 < var3; var12++) {
            if (var10[var12] == var1 || null != var10[var12] && var10[var12].equals(var1)) {
               var4++;
            }
         }
      }

      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)I")
   @ObfuscatedName("bs")
   public static int method10865(classTE var0) {
      classCQ.method2572(var0, -389123593);
      byte var1 = 0;
      int var2 = var0.method10756(-1462207210);
      int var3 = -1;
      if (classYY.field7111 == var0.field6128) {
         int[] var4 = var0.method10748(1116826689);

         for (int var5 = var1; var5 < var2; var5++) {
            if (var3 == -1 || var4[var5] > var4[var3]) {
               var3 = var5;
            }
         }
      } else if (classYY.field7115 == var0.field6128) {
         long[] var8 = var0.method10750(-1150241449);

         for (int var10 = var1; var10 < var2; var10++) {
            if (-1 == var3 || var8[var10] > var8[var3]) {
               var3 = var10;
            }
         }
      } else if (classYY.field7113 == var0.field6128) {
         String var9 = null;
         Object[] var11 = classTE.method10753(var0, 2075857651);

         for (int var6 = var1; var6 < var2; var6++) {
            String var7 = (String)var11[var6];
            if (var3 == -1 || var7 != null && var7.compareTo(var9) > 0) {
               var3 = var6;
               var9 = var7;
            }
         }
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)I")
   @ObfuscatedName("bb")
   public static int method10860(classTE var0) {
      classCQ.method2572(var0, -216928007);
      byte var1 = 0;
      int var2 = var0.method10756(-1857929963);
      int var3 = -1;
      if (var0.field6128 == classYY.field7111) {
         int[] var4 = var0.method10748(421617217);

         for (int var5 = var1; var5 < var2; var5++) {
            if (var3 == -1 || var4[var5] < var4[var3]) {
               var3 = var5;
            }
         }
      } else if (var0.field6128 == classYY.field7115) {
         long[] var8 = var0.method10750(-1882169372);

         for (int var10 = var1; var10 < var2; var10++) {
            if (-1 == var3 || var8[var10] < var8[var3]) {
               var3 = var10;
            }
         }
      } else if (classYY.field7113 == var0.field6128) {
         String var9 = null;
         Object[] var11 = classTE.method10753(var0, 1307968080);

         for (int var6 = var1; var6 < var2; var6++) {
            String var7 = (String)var11[var6];
            if (var3 == -1 || null != var7 && var7.compareTo(var9) < 0) {
               var3 = var6;
               var9 = var7;
            }
         }
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)I")
   @ObfuscatedName("bi")
   public static int method10861(classTE var0) {
      classCQ.method2572(var0, 271285590);
      byte var1 = 0;
      int var2 = var0.method10756(-297585931);
      int var3 = -1;
      if (var0.field6128 == classYY.field7111) {
         int[] var4 = var0.method10748(1875853038);

         for (int var5 = var1; var5 < var2; var5++) {
            if (var3 == -1 || var4[var5] < var4[var3]) {
               var3 = var5;
            }
         }
      } else if (var0.field6128 == classYY.field7115) {
         long[] var8 = var0.method10750(-1165004985);

         for (int var10 = var1; var10 < var2; var10++) {
            if (-1 == var3 || var8[var10] < var8[var3]) {
               var3 = var10;
            }
         }
      } else if (classYY.field7113 == var0.field6128) {
         String var9 = null;
         Object[] var11 = classTE.method10753(var0, 343313286);

         for (int var6 = var1; var6 < var2; var6++) {
            String var7 = (String)var11[var6];
            if (var3 == -1 || null != var7 && var7.compareTo(var9) < 0) {
               var3 = var6;
               var9 = var7;
            }
         }
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)I")
   @ObfuscatedName("be")
   public static int method10862(classTE var0) {
      classCQ.method2572(var0, -874617911);
      byte var1 = 0;
      int var2 = var0.method10756(-686004501);
      int var3 = -1;
      if (var0.field6128 == classYY.field7111) {
         int[] var4 = var0.method10748(1139138386);

         for (int var5 = var1; var5 < var2; var5++) {
            if (var3 == -1 || var4[var5] < var4[var3]) {
               var3 = var5;
            }
         }
      } else if (var0.field6128 == classYY.field7115) {
         long[] var8 = var0.method10750(-1795046814);

         for (int var10 = var1; var10 < var2; var10++) {
            if (-1 == var3 || var8[var10] < var8[var3]) {
               var3 = var10;
            }
         }
      } else if (classYY.field7113 == var0.field6128) {
         String var9 = null;
         Object[] var11 = classTE.method10753(var0, 1843498276);

         for (int var6 = var1; var6 < var2; var6++) {
            String var7 = (String)var11[var6];
            if (var3 == -1 || null != var7 && var7.compareTo(var9) < 0) {
               var3 = var6;
               var9 = var7;
            }
         }
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)I")
   @ObfuscatedName("by")
   public static int method10863(classTE var0) {
      classCQ.method2572(var0, 1138956166);
      byte var1 = 0;
      int var2 = var0.method10756(-1812296084);
      int var3 = -1;
      if (var0.field6128 == classYY.field7111) {
         int[] var4 = var0.method10748(1708594229);

         for (int var5 = var1; var5 < var2; var5++) {
            if (var3 == -1 || var4[var5] < var4[var3]) {
               var3 = var5;
            }
         }
      } else if (var0.field6128 == classYY.field7115) {
         long[] var8 = var0.method10750(-8882690);

         for (int var10 = var1; var10 < var2; var10++) {
            if (-1 == var3 || var8[var10] < var8[var3]) {
               var3 = var10;
            }
         }
      } else if (classYY.field7113 == var0.field6128) {
         String var9 = null;
         Object[] var11 = classTE.method10753(var0, 2137584581);

         for (int var6 = var1; var6 < var2; var6++) {
            String var7 = (String)var11[var6];
            if (var3 == -1 || null != var7 && var7.compareTo(var9) < 0) {
               var3 = var6;
               var9 = var7;
            }
         }
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)I")
   @ObfuscatedName("bq")
   public static int method10866(classTE var0) {
      classCQ.method2572(var0, -122898140);
      byte var1 = 0;
      int var2 = var0.method10756(-2014476259);
      int var3 = -1;
      if (classYY.field7111 == var0.field6128) {
         int[] var4 = var0.method10748(-435754377);

         for (int var5 = var1; var5 < var2; var5++) {
            if (var3 == -1 || var4[var5] > var4[var3]) {
               var3 = var5;
            }
         }
      } else if (classYY.field7115 == var0.field6128) {
         long[] var8 = var0.method10750(203129838);

         for (int var10 = var1; var10 < var2; var10++) {
            if (-1 == var3 || var8[var10] > var8[var3]) {
               var3 = var10;
            }
         }
      } else if (classYY.field7113 == var0.field6128) {
         String var9 = null;
         Object[] var11 = classTE.method10753(var0, 1077519560);

         for (int var6 = var1; var6 < var2; var6++) {
            String var7 = (String)var11[var6];
            if (var3 == -1 || var7 != null && var7.compareTo(var9) > 0) {
               var3 = var6;
               var9 = var7;
            }
         }
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("cj")
   public static String method10894(classTE var0, String var1) {
      classON.method8613(var0, classYY.field7113, 235030251);
      int var2 = var0.method10756(291306396);
      String[] var3 = (String[])classTE.method10753(var0, -510941755);
      if (0 == var2) {
         return "";
      } else if (var2 == 1) {
         return var3[0];
      } else {
         int var4 = var1.length();
         int var5 = (var2 - 1) * var4;

         for (int var6 = 0; var6 < var2; var6++) {
            var5 += var3[var6].length();
         }

         char[] var9 = new char[var5];
         int var7 = 0;

         for (int var8 = 0; var8 < var2; var8++) {
            if (var8 > 0) {
               var1.getChars(0, var4, var9, var7);
               var7 += var4;
            }

            var3[var8].getChars(0, var3[var8].length(), var9, var7);
            var7 += var3[var8].length();
         }

         return new String(var9);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;II)V")
   @ObfuscatedName("dt")
   public static void method10904(classTE var0, int var1, int var2) {
      classOL.method8512(var0, 1327640383);
      if (0 != var1) {
         if (var2 >= 0 && var2 < -1943548931 * var0.field6131 && var1 >= 0 && var1 + var2 <= -1943548931 * var0.field6131) {
            if (var2 < -1943548931 * var0.field6131 - var1) {
               classMX.method7739(var0, var1 + var2, var0, var2, var0.field6131 * -1943548931 - (var1 + var2), -2133828131);
            }

            classTE.method10782(var0, -1943548931 * var0.field6131 - var1, (byte)2);
            var0.field6133 = true;
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([JII)V")
   @ObfuscatedName("dl")
   static void method10918(long[] var0, int var1, int var2) {
      while (var1 < var2) {
         long var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         var1++;
         var2--;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;II)V")
   @ObfuscatedName("bl")
   public static void method10868(classTE var0, Object var1, int var2, int var3) {
      classOL.method8512(var0, 1327640383);
      if (var2 < 0) {
         var2 = 0;
      }

      int var4 = var2 + var3;
      if (var3 < 0 || var4 < 0 || var4 > var0.method10756(173077039)) {
         var4 = var0.method10756(-1749254087);
      }

      if (classYY.field7111 == var0.field6128) {
         Arrays.fill(var0.method10748(-53645582), var2, var4, ((Integer)var1).intValue());
      } else if (classYY.field7115 == var0.field6128) {
         Arrays.fill(var0.method10750(-1276850149), var2, var4, ((Long)var1).longValue());
      } else {
         Arrays.fill(classTE.method10753(var0, 1891202278), var2, var4, var1);
      }

      var0.field6133 = true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;II)V")
   @ObfuscatedName("bv")
   public static void method10869(classTE var0, Object var1, int var2, int var3) {
      classOL.method8512(var0, 1327640383);
      if (var2 < 0) {
         var2 = 0;
      }

      int var4 = var2 + var3;
      if (var3 < 0 || var4 < 0 || var4 > var0.method10756(-693804018)) {
         var4 = var0.method10756(276335497);
      }

      if (classYY.field7111 == var0.field6128) {
         Arrays.fill(var0.method10748(808039234), var2, var4, ((Integer)var1).intValue());
      } else if (classYY.field7115 == var0.field6128) {
         Arrays.fill(var0.method10750(-332130388), var2, var4, ((Long)var1).longValue());
      } else {
         Arrays.fill(classTE.method10753(var0, -1382523652), var2, var4, var1);
      }

      var0.field6133 = true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;IIII)V")
   @ObfuscatedName("bh")
   public static void method10870(classTE var0, int var1, int var2, int var3, int var4) {
      classHO.method6078(var0, classYY.field7111, (byte)-94);
      if (var3 < 0) {
         var3 = 0;
      }

      int var5 = var4 + var3;
      if (var4 < 0 || var5 < 0 || var5 > var0.method10756(468709934)) {
         var5 = var0.method10756(-1042390458);
      }

      int[] var6 = var0.method10748(783606973);
      int var7 = var1;

      for (int var8 = var3; var8 < var5; var8++) {
         var6[var8] = var7;
         var7 += var2;
      }

      var0.field6133 = true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Lte;I)V")
   @ObfuscatedName("dm")
   public static void method10900(classTE var0, classTE var1, int var2) {
      classOL.method8512(var0, 1327640383);
      classON.method8613(var1, var0.field6128, -501509966);
      if (var2 < 0 || var2 > var0.field6131 * -1943548931) {
         throw new RuntimeException();
      } else if (0 != var1.field6131 * -1943548931) {
         var0.method10774(var1.field6131 * -1943548931 + var0.field6131 * -1943548931, 1830134388);
         if (var2 < var0.field6131 * -1943548931) {
            classMX.method7739(var0, var2, var0, -1943548931 * var1.field6131 + var2, var0.field6131 * -1943548931 - var2, -2134933299);
         }

         classMX.method7739(var1, 0, var0, var2, -1943548931 * var1.field6131, -2132319800);
         var0.field6131 = var0.field6131 + var1.field6131 * 1;
         var0.field6133 = true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;IIII)V")
   @ObfuscatedName("cr")
   public static void method10871(classTE var0, int var1, int var2, int var3, int var4) {
      classHO.method6078(var0, classYY.field7111, (byte)-66);
      if (var3 < 0) {
         var3 = 0;
      }

      int var5 = var4 + var3;
      if (var4 < 0 || var5 < 0 || var5 > var0.method10756(-1678092991)) {
         var5 = var0.method10756(-1642720916);
      }

      int[] var6 = var0.method10748(1143562361);
      int var7 = var1;

      for (int var8 = var3; var8 < var5; var8++) {
         var6[var8] = var7;
         var7 += var2;
      }

      var0.field6133 = true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)I")
   @ObfuscatedName("bf")
   public static int method10867(classTE var0) {
      classCQ.method2572(var0, -98812553);
      byte var1 = 0;
      int var2 = var0.method10756(284128549);
      int var3 = -1;
      if (classYY.field7111 == var0.field6128) {
         int[] var4 = var0.method10748(1199807670);

         for (int var5 = var1; var5 < var2; var5++) {
            if (var3 == -1 || var4[var5] > var4[var3]) {
               var3 = var5;
            }
         }
      } else if (classYY.field7115 == var0.field6128) {
         long[] var8 = var0.method10750(-1956112692);

         for (int var10 = var1; var10 < var2; var10++) {
            if (-1 == var3 || var8[var10] > var8[var3]) {
               var3 = var10;
            }
         }
      } else if (classYY.field7113 == var0.field6128) {
         String var9 = null;
         Object[] var11 = classTE.method10753(var0, 605429545);

         for (int var6 = var1; var6 < var2; var6++) {
            String var7 = (String)var11[var6];
            if (var3 == -1 || var7 != null && var7.compareTo(var9) > 0) {
               var3 = var6;
               var9 = var7;
            }
         }
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;II)V")
   @ObfuscatedName("cb")
   public static void method10875(classTE var0, int var1, int var2) {
      classOL.method8512(var0, 1327640383);
      if (var1 >= 0 && var2 >= 0 && var1 < var0.method10756(-435811692) && var2 < var0.method10756(-422725414)) {
         if (var2 != var1) {
            if (var0.field6128 == classYY.field7111) {
               int[] var3 = var0.method10748(1111478963);
               int var4 = var3[var1];
               var3[var1] = var3[var2];
               var3[var2] = var4;
            } else if (classYY.field7115 == var0.field6128) {
               long[] var6 = var0.method10750(-513342227);
               long var8 = var6[var1];
               var6[var1] = var6[var2];
               var6[var2] = var8;
            } else {
               Object[] var7 = classTE.method10753(var0, 1272145823);
               Object var9 = var7[var1];
               var7[var1] = var7[var2];
               var7[var2] = var9;
            }

            var0.field6133 = true;
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;II)V")
   @ObfuscatedName("ct")
   public static void method10876(classTE var0, int var1, int var2) {
      classOL.method8512(var0, 1327640383);
      if (var1 >= 0 && var2 >= 0 && var1 < var0.method10756(703498283) && var2 < var0.method10756(-1638943816)) {
         if (var2 != var1) {
            if (var0.field6128 == classYY.field7111) {
               int[] var3 = var0.method10748(1482720995);
               int var4 = var3[var1];
               var3[var1] = var3[var2];
               var3[var2] = var4;
            } else if (classYY.field7115 == var0.field6128) {
               long[] var6 = var0.method10750(84560584);
               long var8 = var6[var1];
               var6[var1] = var6[var2];
               var6[var2] = var8;
            } else {
               Object[] var7 = classTE.method10753(var0, -1279795502);
               Object var9 = var7[var1];
               var7[var1] = var7[var2];
               var7[var2] = var9;
            }

            var0.field6133 = true;
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;II)V")
   @ObfuscatedName("cp")
   public static void method10877(classTE var0, int var1, int var2) {
      classOL.method8512(var0, 1327640383);
      if (var1 >= 0 && var2 >= 0 && var1 < var0.method10756(-831965345) && var2 < var0.method10756(-1415009766)) {
         if (var2 != var1) {
            if (var0.field6128 == classYY.field7111) {
               int[] var3 = var0.method10748(2132951836);
               int var4 = var3[var1];
               var3[var1] = var3[var2];
               var3[var2] = var4;
            } else if (classYY.field7115 == var0.field6128) {
               long[] var6 = var0.method10750(-355291590);
               long var8 = var6[var1];
               var6[var1] = var6[var2];
               var6[var2] = var8;
            } else {
               Object[] var7 = classTE.method10753(var0, -899331218);
               Object var9 = var7[var1];
               var7[var1] = var7[var2];
               var7[var2] = var9;
            }

            var0.field6133 = true;
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Lte;III)V")
   @ObfuscatedName("cq")
   public static void method10878(classTE var0, classTE var1, int var2, int var3, int var4) {
      classCQ.method2572(var0, -1027785047);
      classHO.method6078(var1, var0.field6128, (byte)10);
      int var5 = var0.method10756(-1633285667);
      int var6 = var1.method10756(-1237204303);
      if (-1 == var4) {
         var4 = var0.method10756(-1711318752) - var2;
      }

      if (0 != var4 && (var1 != var0 || var2 != var3)) {
         if (var2 >= 0 && var4 + var2 <= var5 && var3 >= 0 && var4 + var3 <= var6) {
            classMX.method7739(var0, var2, var1, var3, var4, -2137745175);
            var1.field6133 = true;
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Lte;III)V")
   @ObfuscatedName("cl")
   public static void method10879(classTE var0, classTE var1, int var2, int var3, int var4) {
      classCQ.method2572(var0, 1004878186);
      classHO.method6078(var1, var0.field6128, (byte)63);
      int var5 = var0.method10756(-1633817732);
      int var6 = var1.method10756(661539299);
      if (-1 == var4) {
         var4 = var0.method10756(-1129725952) - var2;
      }

      if (0 != var4 && (var1 != var0 || var2 != var3)) {
         if (var2 >= 0 && var4 + var2 <= var5 && var3 >= 0 && var4 + var3 <= var6) {
            classMX.method7739(var0, var2, var1, var3, var4, -2146973285);
            var1.field6133 = true;
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Lte;)V")
   @ObfuscatedName("cd")
   public static void method10880(classTE var0, classTE var1) {
      if (null != var0 && var0.method10756(-985258628) > 1) {
         classOL.method8512(var0, 1327640383);
         if (null != var1) {
            classOL.method8512(var1, 1327640383);
         }

         int var2 = var0.method10756(361402992);
         if (null != var1 && var1.method10756(-1934152677) < var2) {
            throw new RuntimeException();
         } else {
            if (classYY.field7111 == var0.field6128) {
               if (null == var1) {
                  classHL.method6072(var0.method10748(596753969), field6147, 0, var2 - 1, (byte)6);
               } else if (var1.field6128 == classYY.field7111) {
                  classHL.method6072(var0.method10748(252834441), var1.method10748(-481894659), 0, var2 - 1, (byte)60);
               } else if (classYY.field7115 == var1.field6128) {
                  classGS.method5744(var0.method10748(1670766000), var1.method10750(-2046066298), 0, var2 - 1, -1058460236);
               } else {
                  classAT.method693(var0.method10748(584818464), classTE.method10753(var1, 417898083), 0, var2 - 1, (byte)-29);
               }
            } else if (classYY.field7115 == var0.field6128) {
               if (var1 == null) {
                  Arrays.sort(var0.method10750(-510173572), 0, var2);
               } else if (var1.field6128 == classYY.field7111) {
                  classAS.method661(var0.method10750(117409224), var1.method10748(618096962), 0, var2 - 1, 1264522262);
               } else if (classYY.field7115 == var1.field6128) {
                  classMQ.method7645(var0.method10750(-469682778), var1.method10750(-792953670), 0, var2 - 1, (byte)1);
               } else {
                  method10873(var0.method10750(-1063433437), classTE.method10753(var1, 888729422), 0, var2 - 1, (byte)4);
               }
            } else {
               if (var0.field6128 != classYY.field7113) {
                  throw new RuntimeException();
               }

               if (var1 == null) {
                  Arrays.sort(classTE.method10753(var0, -1365788279), 0, var2);
               } else if (classYY.field7111 == var1.field6128) {
                  classCZ.method2848((String[])classTE.method10753(var0, -329457604), var1.method10748(772528247), 0, var2 - 1, 491151711);
               } else if (var1.field6128 == classYY.field7115) {
                  classKH.method6475((String[])classTE.method10753(var0, -847457159), var1.method10750(-1028627346), 0, var2 - 1, -1118501531);
               } else {
                  KeyHandler.method10835((String[])classTE.method10753(var0, -2114224744), classTE.method10753(var1, -1101999915), 0, var2 - 1, -894259080);
               }
            }

            var0.field6133 = true;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Lte;)V")
   @ObfuscatedName("cs")
   public static void method10881(classTE var0, classTE var1) {
      if (null != var0 && var0.method10756(-1850063778) > 1) {
         classOL.method8512(var0, 1327640383);
         if (null != var1) {
            classOL.method8512(var1, 1327640383);
         }

         int var2 = var0.method10756(-1509264125);
         if (null != var1 && var1.method10756(265293717) < var2) {
            throw new RuntimeException();
         } else {
            if (classYY.field7111 == var0.field6128) {
               if (null == var1) {
                  classHL.method6072(var0.method10748(1298242953), field6147, 0, var2 - 1, (byte)46);
               } else if (var1.field6128 == classYY.field7111) {
                  classHL.method6072(var0.method10748(-94387251), var1.method10748(1414542570), 0, var2 - 1, (byte)33);
               } else if (classYY.field7115 == var1.field6128) {
                  classGS.method5744(var0.method10748(419473856), var1.method10750(-1129262762), 0, var2 - 1, 2099004532);
               } else {
                  classAT.method693(var0.method10748(315636902), classTE.method10753(var1, 1181526114), 0, var2 - 1, (byte)-49);
               }
            } else if (classYY.field7115 == var0.field6128) {
               if (var1 == null) {
                  Arrays.sort(var0.method10750(-276900552), 0, var2);
               } else if (var1.field6128 == classYY.field7111) {
                  classAS.method661(var0.method10750(-119057170), var1.method10748(-343212278), 0, var2 - 1, 471190539);
               } else if (classYY.field7115 == var1.field6128) {
                  classMQ.method7645(var0.method10750(31362771), var1.method10750(-1474139170), 0, var2 - 1, (byte)1);
               } else {
                  method10873(var0.method10750(-931589704), classTE.method10753(var1, -1845525001), 0, var2 - 1, (byte)4);
               }
            } else {
               if (var0.field6128 != classYY.field7113) {
                  throw new RuntimeException();
               }

               if (var1 == null) {
                  Arrays.sort(classTE.method10753(var0, 75591942), 0, var2);
               } else if (classYY.field7111 == var1.field6128) {
                  classCZ.method2848((String[])classTE.method10753(var0, 969187907), var1.method10748(706545785), 0, var2 - 1, 1915145892);
               } else if (var1.field6128 == classYY.field7115) {
                  classKH.method6475((String[])classTE.method10753(var0, 1335239241), var1.method10750(-1980502672), 0, var2 - 1, 1717078275);
               } else {
                  KeyHandler.method10835((String[])classTE.method10753(var0, 1961840106), classTE.method10753(var1, -81783157), 0, var2 - 1, -579184311);
               }
            }

            var0.field6133 = true;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;II)V")
   @ObfuscatedName("ds")
   static void method10920(Object[] var0, int var1, int var2) {
      while (var1 < var2) {
         Object var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         var1++;
         var2--;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;II)V")
   @ObfuscatedName("cy")
   public static void method10883(classTE var0, int var1, int var2) {
      if (var0 != null && var0.method10756(-1448914796) > 1) {
         classOL.method8512(var0, 1327640383);
         if (classYY.field7111 == var0.field6128) {
            classZZ.method14282(var0.method10748(1607979587), var0.method10756(-1642182440), var1, var2);
         } else if (var0.field6128 == classYY.field7115) {
            classZZ.method14285(var0.method10750(-2064181415), var0.method10756(-1401132433), var1, var2);
         } else {
            classZZ.method14292(classTE.method10753(var0, 81211063), var0.method10756(-1761829196), var1, var2);
         }

         var0.field6133 = true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;II)V")
   @ObfuscatedName("co")
   public static void method10884(classTE var0, int var1, int var2) {
      if (var0 != null && var0.method10756(-782639832) > 1) {
         classOL.method8512(var0, 1327640383);
         if (classYY.field7111 == var0.field6128) {
            classZZ.method14282(var0.method10748(1413366110), var0.method10756(-1236860132), var1, var2);
         } else if (var0.field6128 == classYY.field7115) {
            classZZ.method14285(var0.method10750(-923124370), var0.method10756(-2000745365), var1, var2);
         } else {
            classZZ.method14292(classTE.method10753(var0, -1008066544), var0.method10756(-1186577394), var1, var2);
         }

         var0.field6133 = true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)J")
   @ObfuscatedName("ck")
   public static long method10885(classTE var0) {
      classON.method8613(var0, classYY.field7111, -915766392);
      int[] var1 = var0.method10748(1409315253);
      int var2 = var0.method10756(-640733000);
      long var3 = 0L;

      for (int var5 = 0; var5 < var2; var5++) {
         var3 += var1[var5];
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;II)V")
   @ObfuscatedName("du")
   public static void method10905(classTE var0, int var1, int var2) {
      classOL.method8512(var0, 1327640383);
      if (0 != var1) {
         if (var2 >= 0 && var2 < -1943548931 * var0.field6131 && var1 >= 0 && var1 + var2 <= -1943548931 * var0.field6131) {
            if (var2 < -1943548931 * var0.field6131 - var1) {
               classMX.method7739(var0, var1 + var2, var0, var2, var0.field6131 * -1943548931 - (var1 + var2), -2128745723);
            }

            classTE.method10782(var0, -1943548931 * var0.field6131 - var1, (byte)2);
            var0.field6133 = true;
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)J")
   @ObfuscatedName("cc")
   public static long method10886(classTE var0) {
      classON.method8613(var0, classYY.field7111, 1296170669);
      int[] var1 = var0.method10748(1320132006);
      int var2 = var0.method10756(-237670110);
      long var3 = 0L;

      for (int var5 = 0; var5 < var2; var5++) {
         var3 += var1[var5];
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;IIII)V")
   @ObfuscatedName("bz")
   public static void method10872(classTE var0, int var1, int var2, int var3, int var4) {
      classHO.method6078(var0, classYY.field7111, (byte)-35);
      if (var3 < 0) {
         var3 = 0;
      }

      int var5 = var4 + var3;
      if (var4 < 0 || var5 < 0 || var5 > var0.method10756(-681596837)) {
         var5 = var0.method10756(-208933765);
      }

      int[] var6 = var0.method10748(-133905885);
      int var7 = var1;

      for (int var8 = var3; var8 < var5; var8++) {
         var6[var8] = var7;
         var7 += var2;
      }

      var0.field6133 = true;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;I)I")
   @ObfuscatedName("cn")
   public static int method10888(classTE var0, int var1) {
      classON.method8613(var0, classYY.field7111, 1715342575);
      if (var1 >= 0) {
         int[] var2 = var0.method10748(1094270918);
         int var3 = var0.method10756(-1352323464);

         for (int var4 = 0; var4 < var3; var4++) {
            if (var1 < var2[var4]) {
               return var4;
            }

            var1 -= var2[var4];
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;I)I")
   @ObfuscatedName("ch")
   public static int method10889(classTE var0, int var1) {
      classON.method8613(var0, classYY.field7111, -944106217);
      if (var1 >= 0) {
         int[] var2 = var0.method10748(189535761);
         int var3 = var0.method10756(289753742);

         for (int var4 = 0; var4 < var3; var4++) {
            if (var1 < var2[var4]) {
               return var4;
            }

            var1 -= var2[var4];
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("dg")
   static void method10917(int[] var0, int var1, int var2) {
      while (var1 < var2) {
         int var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         var1++;
         var2--;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)Lte;")
   @ObfuscatedName("cw")
   public static classTE method10891(String var0, String var1) {
      if (null != var1 && !var1.isEmpty()) {
         int var2 = var1.length();
         int var3 = 1;
         int var4 = 0;

         while ((var4 = var0.indexOf(var1, var4)) != -1) {
            var3++;
            var4 += var2;
         }

         classTE var5 = new classTE(classYY.field7113, null, var3, var3);
         int var6 = 0;
         var4 = 0;

         for (var3 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var6 = var4) {
            classTE.method10753(var5, -398613055)[var3++] = var0.substring(var6, var4);
            var4 += var2;
         }

         classTE.method10753(var5, 243481355)[var3] = var0.substring(var6);
         return var5;
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;II)V")
   @ObfuscatedName("df")
   static void method10921(Object[] var0, int var1, int var2) {
      while (var1 < var2) {
         Object var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         var1++;
         var2--;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;II)I")
   @ObfuscatedName("bw")
   public static int method10859(classTE var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method10756(-1331318930)) {
         var3 = var0.method10756(204720946);
      }

      int var4 = 0;
      if (var0.field6128 == classYY.field7111) {
         int[] var5 = var0.method10748(-324981793);
         int var6 = (Integer)var1;

         for (int var7 = var2; var7 < var3; var7++) {
            if (var6 == var5[var7]) {
               var4++;
            }
         }
      } else if (classYY.field7115 == var0.field6128) {
         long[] var9 = var0.method10750(-763089196);
         long var11 = (Long)var1;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var9[var8] == var11) {
               var4++;
            }
         }
      } else {
         Object[] var10 = classTE.method10753(var0, 492553278);

         for (int var12 = var2; var12 < var3; var12++) {
            if (var10[var12] == var1 || null != var10[var12] && var10[var12].equals(var1)) {
               var4++;
            }
         }
      }

      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;ILjava/lang/Object;)V")
   @ObfuscatedName("ci")
   public static void method10895(classTE var0, int var1, Object var2) {
      classOL.method8512(var0, 1327640383);
      if (var1 >= 0 && var1 <= -1943548931 * var0.field6131) {
         var0.method10774(1 + -1943548931 * var0.field6131, 1486380233);
         if (var1 < -1943548931 * var0.field6131) {
            classMX.method7739(var0, var1, var0, var1 + 1, var0.field6131 * -1943548931 - var1, -2125849826);
         }

         var0.method10765(var1, var2, 1252666942);
         var0.field6131 += -1063196331;
         var0.field6133 = true;
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)Lte;")
   @ObfuscatedName("cz")
   public static classTE method10892(String var0, String var1) {
      if (null != var1 && !var1.isEmpty()) {
         int var2 = var1.length();
         int var3 = 1;
         int var4 = 0;

         while ((var4 = var0.indexOf(var1, var4)) != -1) {
            var3++;
            var4 += var2;
         }

         classTE var5 = new classTE(classYY.field7113, null, var3, var3);
         int var6 = 0;
         var4 = 0;

         for (var3 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var6 = var4) {
            classTE.method10753(var5, 1383160996)[var3++] = var0.substring(var6, var4);
            var4 += var2;
         }

         classTE.method10753(var5, 1688795873)[var3] = var0.substring(var6);
         return var5;
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;I)Ljava/lang/Object;")
   @ObfuscatedName("ce")
   public static Object method10897(classTE var0, int var1) {
      classOL.method8512(var0, 1327640383);
      if (var1 >= 0 && var1 < -1943548931 * var0.field6131) {
         Object var2 = var0.method10759(var1, (byte)-1);
         if (var1 < -1943548931 * var0.field6131 - 1) {
            classMX.method7739(var0, var1 + 1, var0, var1, -176918110 * var0.field6131 - (var1 + 1), -2137769219);
         }

         classTE.method10782(var0, -1943548931 * var0.field6131 - 1, (byte)2);
         var0.field6133 = true;
         return var2;
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;I)I")
   @ObfuscatedName("cf")
   public static int method10890(classTE var0, int var1) {
      classON.method8613(var0, classYY.field7111, -915593817);
      if (var1 >= 0) {
         int[] var2 = var0.method10748(1296669717);
         int var3 = var0.method10756(412720054);

         for (int var4 = 0; var4 < var3; var4++) {
            if (var1 < var2[var4]) {
               return var4;
            }

            var1 -= var2[var4];
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;I)Ljava/lang/Object;")
   @ObfuscatedName("dc")
   public static Object method10898(classTE var0, int var1) {
      classOL.method8512(var0, 1327640383);
      if (var1 >= 0 && var1 < 770592581 * var0.field6131) {
         Object var2 = var0.method10759(var1, (byte)-1);
         if (var1 < -1943548931 * var0.field6131 - 1) {
            classMX.method7739(var0, var1 + 1, var0, var1, -1943548931 * var0.field6131 - (var1 + 1), -2125028035);
         }

         classTE.method10782(var0, -1943548931 * var0.field6131 - 1, (byte)2);
         var0.field6133 = true;
         return var2;
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Lte;I)V")
   @ObfuscatedName("dd")
   public static void method10901(classTE var0, classTE var1, int var2) {
      classOL.method8512(var0, 1327640383);
      classON.method8613(var1, var0.field6128, -2006969982);
      if (var2 < 0 || var2 > var0.field6131 * -1943548931) {
         throw new RuntimeException();
      } else if (0 != var1.field6131 * -1943548931) {
         var0.method10774(var1.field6131 * -1943548931 + var0.field6131 * -1943548931, 1046588744);
         if (var2 < var0.field6131 * -1943548931) {
            classMX.method7739(var0, var2, var0, -1943548931 * var1.field6131 + var2, var0.field6131 * -1943548931 - var2, -2146281066);
         }

         classMX.method7739(var1, 0, var0, var2, -1943548931 * var1.field6131, -2125147182);
         var0.field6131 = var0.field6131 + var1.field6131 * 1;
         var0.field6133 = true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;II)I")
   @ObfuscatedName("bj")
   public static int method10851(classTE var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method10756(-1980240691)) {
         var3 = var0.method10756(697374845);
      }

      if (var0.field6128 == classYY.field7111) {
         int[] var4 = var0.method10748(1050313);
         int var5 = (Integer)var1;

         for (int var6 = var2; var6 < var3; var6++) {
            if (var4[var6] == var5) {
               return var6;
            }
         }
      } else if (var0.field6128 == classYY.field7115) {
         long[] var8 = var0.method10750(-175287440);
         long var10 = (Long)var1;

         for (int var7 = var2; var7 < var3; var7++) {
            if (var10 == var8[var7]) {
               return var7;
            }
         }
      } else {
         Object[] var9 = classTE.method10753(var0, 973170381);

         for (int var11 = var2; var11 < var3; var11++) {
            if (var1 == var9[var11] || var9[var11] != null && var9[var11].equals(var1)) {
               return var11;
            }
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Lte;I)V")
   @ObfuscatedName("dx")
   public static void method10902(classTE var0, classTE var1, int var2) {
      classOL.method8512(var0, 1327640383);
      classON.method8613(var1, var0.field6128, -573615324);
      if (var2 < 0 || var2 > var0.field6131 * -1943548931) {
         throw new RuntimeException();
      } else if (0 != var1.field6131 * -1943548931) {
         var0.method10774(var1.field6131 * -1943548931 + var0.field6131 * -1943548931, 252653205);
         if (var2 < var0.field6131 * -1943548931) {
            classMX.method7739(var0, var2, var0, -1943548931 * var1.field6131 + var2, var0.field6131 * -1943548931 - var2, -2131368887);
         }

         classMX.method7739(var1, 0, var0, var2, -1943548931 * var1.field6131, -2141946575);
         var0.field6131 = var0.field6131 + var1.field6131 * 1;
         var0.field6133 = true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Lte;I)V")
   @ObfuscatedName("dy")
   public static void method10903(classTE var0, classTE var1, int var2) {
      classOL.method8512(var0, 1327640383);
      classON.method8613(var1, var0.field6128, 1353792537);
      if (var2 < 0 || var2 > var0.field6131 * -1943548931) {
         throw new RuntimeException();
      } else if (0 != var1.field6131 * -1943548931) {
         var0.method10774(var1.field6131 * -1943548931 + var0.field6131 * -1943548931, 375639819);
         if (var2 < var0.field6131 * -1943548931) {
            classMX.method7739(var0, var2, var0, -1943548931 * var1.field6131 + var2, var0.field6131 * -1943548931 - var2, -2137655304);
         }

         classMX.method7739(var1, 0, var0, var2, -1943548931 * var1.field6131, -2134546976);
         var0.field6131 = var0.field6131 + var1.field6131 * 1;
         var0.field6133 = true;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;II)V")
   @ObfuscatedName("di")
   public static void method10906(classTE var0, int var1, int var2) {
      classOL.method8512(var0, 1327640383);
      if (0 != var1) {
         if (var2 >= 0 && var2 < -1943548931 * var0.field6131 && var1 >= 0 && var1 + var2 <= -286765932 * var0.field6131) {
            if (var2 < 1754060069 * var0.field6131 - var1) {
               classMX.method7739(var0, var1 + var2, var0, var2, var0.field6131 * 2113338014 - (var1 + var2), -2122973791);
            }

            classTE.method10782(var0, -499641159 * var0.field6131 - var1, (byte)2);
            var0.field6133 = true;
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Lyy;)V")
   @ObfuscatedName("dv")
   static void method10914(classTE var0, classYY var1) {
      classOL.method8511(var0, var1, true, (byte)108);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Lte;)V")
   @ObfuscatedName("cv")
   public static void method10882(classTE var0, classTE var1) {
      if (null != var0 && var0.method10756(-719169725) > 1) {
         classOL.method8512(var0, 1327640383);
         if (null != var1) {
            classOL.method8512(var1, 1327640383);
         }

         int var2 = var0.method10756(-1836737653);
         if (null != var1 && var1.method10756(646782686) < var2) {
            throw new RuntimeException();
         } else {
            if (classYY.field7111 == var0.field6128) {
               if (null == var1) {
                  classHL.method6072(var0.method10748(1974635062), field6147, 0, var2 - 1, (byte)-60);
               } else if (var1.field6128 == classYY.field7111) {
                  classHL.method6072(var0.method10748(202186093), var1.method10748(1763866887), 0, var2 - 1, (byte)37);
               } else if (classYY.field7115 == var1.field6128) {
                  classGS.method5744(var0.method10748(282200812), var1.method10750(-1644862069), 0, var2 - 1, 1940015118);
               } else {
                  classAT.method693(var0.method10748(586629563), classTE.method10753(var1, -1324901770), 0, var2 - 1, (byte)-2);
               }
            } else if (classYY.field7115 == var0.field6128) {
               if (var1 == null) {
                  Arrays.sort(var0.method10750(-650410406), 0, var2);
               } else if (var1.field6128 == classYY.field7111) {
                  classAS.method661(var0.method10750(-825045178), var1.method10748(58095195), 0, var2 - 1, 675908807);
               } else if (classYY.field7115 == var1.field6128) {
                  classMQ.method7645(var0.method10750(-870738996), var1.method10750(-313010413), 0, var2 - 1, (byte)1);
               } else {
                  method10873(var0.method10750(-1610870902), classTE.method10753(var1, 1768494967), 0, var2 - 1, (byte)4);
               }
            } else {
               if (var0.field6128 != classYY.field7113) {
                  throw new RuntimeException();
               }

               if (var1 == null) {
                  Arrays.sort(classTE.method10753(var0, 1678762994), 0, var2);
               } else if (classYY.field7111 == var1.field6128) {
                  classCZ.method2848((String[])classTE.method10753(var0, 2862927), var1.method10748(1409709239), 0, var2 - 1, 693205256);
               } else if (var1.field6128 == classYY.field7115) {
                  classKH.method6475((String[])classTE.method10753(var0, -1937744773), var1.method10750(-1933082152), 0, var2 - 1, 707176444);
               } else {
                  KeyHandler.method10835((String[])classTE.method10753(var0, -302255839), classTE.method10753(var1, -524403677), 0, var2 - 1, 32546055);
               }
            }

            var0.field6133 = true;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Lyy;Z)V")
   @ObfuscatedName("dr")
   static void method10907(classTE var0, classYY var1, boolean var2) {
      if (var0 == null) {
         throw new RuntimeException();
      } else if (var1 != null && var0.field6128 != var1) {
         throw new RuntimeException();
      } else if (var2 && !var0.field6124) {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)V")
   @ObfuscatedName("dk")
   static void method10908(classTE var0) {
      classOL.method8511(var0, null, false, (byte)98);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;ILjava/lang/Object;)V")
   @ObfuscatedName("cx")
   public static void method10896(classTE var0, int var1, Object var2) {
      classOL.method8512(var0, 1327640383);
      if (var1 >= 0 && var1 <= -1943548931 * var0.field6131) {
         var0.method10774(1 + -1943548931 * var0.field6131, 1487181511);
         if (var1 < -1943548931 * var0.field6131) {
            classMX.method7739(var0, var1, var0, var1 + 1, var0.field6131 * -1943548931 - var1, -2142597616);
         }

         var0.method10765(var1, var2, -985643778);
         var0.field6131 += -1063196331;
         var0.field6133 = true;
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)V")
   @ObfuscatedName("dw")
   static void method10910(classTE var0) {
      classOL.method8511(var0, null, true, (byte)127);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)V")
   @ObfuscatedName("dh")
   static void method10911(classTE var0) {
      classOL.method8511(var0, null, true, (byte)16);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)Lte;")
   @ObfuscatedName("cg")
   public static classTE method10893(String var0, String var1) {
      if (null != var1 && !var1.isEmpty()) {
         int var2 = var1.length();
         int var3 = 1;
         int var4 = 0;

         while ((var4 = var0.indexOf(var1, var4)) != -1) {
            var3++;
            var4 += var2;
         }

         classTE var5 = new classTE(classYY.field7113, null, var3, var3);
         int var6 = 0;
         var4 = 0;

         for (var3 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var6 = var4) {
            classTE.method10753(var5, -1717227467)[var3++] = var0.substring(var6, var4);
            var4 += var2;
         }

         classTE.method10753(var5, 1238567823)[var3] = var0.substring(var6);
         return var5;
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Lyy;)V")
   @ObfuscatedName("dz")
   static void method10912(classTE var0, classYY var1) {
      classOL.method8511(var0, var1, false, (byte)101);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Lyy;)V")
   @ObfuscatedName("dn")
   static void method10915(classTE var0, classYY var1) {
      classOL.method8511(var0, var1, true, (byte)94);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;II)V")
   @ObfuscatedName("dj")
   static void method10922(Object[] var0, int var1, int var2) {
      while (var1 < var2) {
         Object var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         var1++;
         var2--;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Lyy;)V")
   @ObfuscatedName("do")
   static void method10916(classTE var0, classYY var1) {
      classOL.method8511(var0, var1, true, (byte)22);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;II)I")
   @ObfuscatedName("bm")
   public static int method10852(classTE var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method10756(-838221706)) {
         var3 = var0.method10756(-1253264433);
      }

      if (var0.field6128 == classYY.field7111) {
         int[] var4 = var0.method10748(1498432185);
         int var5 = (Integer)var1;

         for (int var6 = var2; var6 < var3; var6++) {
            if (var4[var6] == var5) {
               return var6;
            }
         }
      } else if (var0.field6128 == classYY.field7115) {
         long[] var8 = var0.method10750(-1781041508);
         long var10 = (Long)var1;

         for (int var7 = var2; var7 < var3; var7++) {
            if (var10 == var8[var7]) {
               return var7;
            }
         }
      } else {
         Object[] var9 = classTE.method10753(var0, -143705365);

         for (int var11 = var2; var11 < var3; var11++) {
            if (var1 == var9[var11] || var9[var11] != null && var9[var11].equals(var1)) {
               return var11;
            }
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([JII)V")
   @ObfuscatedName("dq")
   static void method10919(long[] var0, int var1, int var2) {
      while (var1 < var2) {
         long var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         var1++;
         var2--;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)J")
   @ObfuscatedName("ca")
   public static long method10887(classTE var0) {
      classON.method8613(var0, classYY.field7111, -1567911945);
      int[] var1 = var0.method10748(-471112677);
      int var2 = var0.method10756(-2144086807);
      long var3 = 0L;

      for (int var5 = 0; var5 < var2; var5++) {
         var3 += var1[var5];
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;Lyy;)V")
   @ObfuscatedName("de")
   static void method10913(classTE var0, classYY var1) {
      classOL.method8511(var0, var1, false, (byte)2);
   }

   classTJ() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;I)Ljava/lang/Object;")
   @ObfuscatedName("cm")
   public static Object method10899(classTE var0, int var1) {
      classOL.method8512(var0, 1327640383);
      if (var1 >= 0 && var1 < -1943548931 * var0.field6131) {
         Object var2 = var0.method10759(var1, (byte)-1);
         if (var1 < -1943548931 * var0.field6131 - 1) {
            classMX.method7739(var0, var1 + 1, var0, var1, 1396396664 * var0.field6131 - (var1 + 1), -2129104125);
         }

         classTE.method10782(var0, -1943548931 * var0.field6131 - 1, (byte)2);
         var0.field6133 = true;
         return var2;
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("afc")
   protected static final void method10853(int var0) {
      try {
         classTW.field6250.vmethod530((byte)5);

         for (int var1 = 0; var1 < 32; var1++) {
            if (var0 >= -1091109483) {
               throw new IllegalStateException();
            }

            GameEngine.field6197[var1] = 0L;
         }

         for (int var3 = 0; var3 < 32; var3++) {
            if (var0 >= -1091109483) {
               throw new IllegalStateException();
            }

            GameEngine.field6195[var3] = 0L;
         }

         ActorSpotAnim.field5964 = 0;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "tj.afc(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([I[Ljava/lang/Object;Lxs;I)V")
   @ObfuscatedName("ac")
   static void method10856(int[] var0, Object[] var1, PacketBuffer var2, int var3) {
      try {
         for (int var4 = 0; var4 < var0.length; var4++) {
            switch (FriendsList.method10130(var0[var4], 1542835111).field7107 * -900901303) {
               case 2:
                  var1[var4] = var2.method13122((byte)-6);
                  break;
               case 3:
                  var1[var4] = var2.method13059(1469149240);
                  break;
               case 4:
                  var1[var4] = var2.method13071(756904597);
            }
         }
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "tj.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lte;)V")
   @ObfuscatedName("db")
   static void method10909(classTE var0) {
      classOL.method8511(var0, null, false, (byte)17);
   }
}
