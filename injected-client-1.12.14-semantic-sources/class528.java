import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ua")
public class class528 {
   @ObfuscatedName("lm")
   static int cameraZ;
   @ObfuscatedName("av")
   static final int[] field6008 = new int[5000];
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field6009 = 1792;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lwh;)V")
   @ObfuscatedName("ds")
   static void method11065(DynamicArray var0, class586 var1) {
      class461.method9338(var0, var1, false, -928498657);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;II)V")
   @ObfuscatedName("cz")
   public static void method11033(DynamicArray var0, int var1, int var2) {
      if (null != var0 && var0.method11215((byte)5) > 1) {
         class461.method9338(var0, null, true, -928498657);
         if (class586.field6376 == var0.field6107) {
            class488.method10108(var0.method11207(2053374425), var0.method11215((byte)115), var1, var2);
         } else if (class586.field6377 == var0.field6107) {
            class488.method10110(DynamicArray.method11211(var0, (byte)85), var0.method11215((byte)4), var1, var2);
         } else {
            class488.method10113(var0.method11214((byte)-88), var0.method11215((byte)6), var1, var2);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lut;)I")
   @ObfuscatedName("bz")
   public static int method10998(DynamicArray var0, DynamicArray var1) {
      if (var0 == var1) {
         return 0;
      } else if (var0 == null) {
         return -1;
      } else if (var1 == null) {
         return 1;
      } else {
         int var2 = var0.method11215((byte)60);
         int var3 = var1.method11215((byte)1);
         int var4 = Math.min(var2, var3);
         if (var0.field6107 == class586.field6376 && var1.field6107 == class586.field6376) {
            int[] var10 = var0.method11207(2053374425);
            int[] var12 = var1.method11207(2053374425);

            for (int var14 = 0; var14 < var4; var14++) {
               if (var10[var14] < var12[var14]) {
                  return -1;
               }

               if (var10[var14] > var12[var14]) {
                  return 1;
               }
            }
         } else if (class586.field6377 == var0.field6107 && var1.field6107 == class586.field6377) {
            long[] var9 = DynamicArray.method11211(var0, (byte)121);
            long[] var11 = DynamicArray.method11211(var1, (byte)35);

            for (int var13 = 0; var13 < var4; var13++) {
               if (var9[var13] < var11[var13]) {
                  return -1;
               }

               if (var9[var13] > var11[var13]) {
                  return 1;
               }
            }
         } else {
            if (var0.field6107 != class586.field6379 || class586.field6379 != var1.field6107) {
               throw new RuntimeException();
            }

            Object[] var5 = var0.method11214((byte)-50);
            Object[] var6 = var1.method11214((byte)-24);

            for (int var7 = 0; var7 < var4; var7++) {
               int var8 = ((String)var5[var7]).compareTo((String)var6[var7]);
               if (var8 < 0) {
                  return -1;
               }

               if (var8 > 0) {
                  return 1;
               }
            }
         }

         return var2 < var3 ? -1 : (var3 == var2 ? 0 : 1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lut;)I")
   @ObfuscatedName("bk")
   public static int method10999(DynamicArray var0, DynamicArray var1) {
      if (var0 == var1) {
         return 0;
      } else if (var0 == null) {
         return -1;
      } else if (var1 == null) {
         return 1;
      } else {
         int var2 = var0.method11215((byte)95);
         int var3 = var1.method11215((byte)48);
         int var4 = Math.min(var2, var3);
         if (var0.field6107 == class586.field6376 && var1.field6107 == class586.field6376) {
            int[] var10 = var0.method11207(2053374425);
            int[] var12 = var1.method11207(2053374425);

            for (int var14 = 0; var14 < var4; var14++) {
               if (var10[var14] < var12[var14]) {
                  return -1;
               }

               if (var10[var14] > var12[var14]) {
                  return 1;
               }
            }
         } else if (class586.field6377 == var0.field6107 && var1.field6107 == class586.field6377) {
            long[] var9 = DynamicArray.method11211(var0, (byte)1);
            long[] var11 = DynamicArray.method11211(var1, (byte)-90);

            for (int var13 = 0; var13 < var4; var13++) {
               if (var9[var13] < var11[var13]) {
                  return -1;
               }

               if (var9[var13] > var11[var13]) {
                  return 1;
               }
            }
         } else {
            if (var0.field6107 != class586.field6379 || class586.field6379 != var1.field6107) {
               throw new RuntimeException();
            }

            Object[] var5 = var0.method11214((byte)-80);
            Object[] var6 = var1.method11214((byte)-107);

            for (int var7 = 0; var7 < var4; var7++) {
               int var8 = ((String)var5[var7]).compareTo((String)var6[var7]);
               if (var8 < 0) {
                  return -1;
               }

               if (var8 > 0) {
                  return 1;
               }
            }
         }

         return var2 < var3 ? -1 : (var3 == var2 ? 0 : 1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lut;)I")
   @ObfuscatedName("bb")
   public static int method11000(DynamicArray var0, DynamicArray var1) {
      if (var0 == var1) {
         return 0;
      } else if (var0 == null) {
         return -1;
      } else if (var1 == null) {
         return 1;
      } else {
         int var2 = var0.method11215((byte)68);
         int var3 = var1.method11215((byte)110);
         int var4 = Math.min(var2, var3);
         if (var0.field6107 == class586.field6376 && var1.field6107 == class586.field6376) {
            int[] var10 = var0.method11207(2053374425);
            int[] var12 = var1.method11207(2053374425);

            for (int var14 = 0; var14 < var4; var14++) {
               if (var10[var14] < var12[var14]) {
                  return -1;
               }

               if (var10[var14] > var12[var14]) {
                  return 1;
               }
            }
         } else if (class586.field6377 == var0.field6107 && var1.field6107 == class586.field6377) {
            long[] var9 = DynamicArray.method11211(var0, (byte)-1);
            long[] var11 = DynamicArray.method11211(var1, (byte)-26);

            for (int var13 = 0; var13 < var4; var13++) {
               if (var9[var13] < var11[var13]) {
                  return -1;
               }

               if (var9[var13] > var11[var13]) {
                  return 1;
               }
            }
         } else {
            if (var0.field6107 != class586.field6379 || class586.field6379 != var1.field6107) {
               throw new RuntimeException();
            }

            Object[] var5 = var0.method11214((byte)-108);
            Object[] var6 = var1.method11214((byte)-32);

            for (int var7 = 0; var7 < var4; var7++) {
               int var8 = ((String)var5[var7]).compareTo((String)var6[var7]);
               if (var8 < 0) {
                  return -1;
               }

               if (var8 > 0) {
                  return 1;
               }
            }
         }

         return var2 < var3 ? -1 : (var3 == var2 ? 0 : 1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;ILut;II)V")
   @ObfuscatedName("eg")
   static void method11082(DynamicArray var0, int var1, DynamicArray var2, int var3, int var4) {
      if (class586.field6376 == var0.field6107) {
         System.arraycopy(var0.array, var1, var2.array, var3, var4);
      } else if (var0.field6107 == class586.field6377) {
         System.arraycopy(var0.field6110, var1, var2.field6110, var3, var4);
      } else {
         System.arraycopy(var0.field6111, var1, var2.field6111, var3, var4);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/Object;II)I")
   @ObfuscatedName("bm")
   public static int method11001(DynamicArray var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method11215((byte)78)) {
         var3 = var0.method11215((byte)63);
      }

      if (class586.field6376 == var0.field6107) {
         int[] var9 = var0.method11207(2053374425);
         int var11 = (Integer)var1;

         for (int var6 = var2; var6 < var3; var6++) {
            if (var9[var6] == var11) {
               return var6;
            }
         }
      } else if (var0.field6107 == class586.field6377) {
         long[] var8 = DynamicArray.method11211(var0, (byte)126);
         long var10 = (Long)var1;

         for (int var7 = var2; var7 < var3; var7++) {
            if (var10 == var8[var7]) {
               return var7;
            }
         }
      } else {
         Object[] var4 = var0.method11214((byte)-113);

         for (int var5 = var2; var5 < var3; var5++) {
            if (var4[var5] == var1 || null != var4[var5] && var4[var5].equals(var1)) {
               return var5;
            }
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/Object;II)I")
   @ObfuscatedName("bp")
   public static int method11002(DynamicArray var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method11215((byte)90)) {
         var3 = var0.method11215((byte)89);
      }

      if (class586.field6376 == var0.field6107) {
         int[] var4 = var0.method11207(2053374425);
         int var5 = (Integer)var1;

         for (int var6 = var2; var6 < var3; var6++) {
            if (var4[var6] == var5) {
               return var6;
            }
         }
      } else if (var0.field6107 == class586.field6377) {
         long[] var8 = DynamicArray.method11211(var0, (byte)-8);
         long var10 = (Long)var1;

         for (int var7 = var2; var7 < var3; var7++) {
            if (var10 == var8[var7]) {
               return var7;
            }
         }
      } else {
         Object[] var9 = var0.method11214((byte)33);

         for (int var11 = var2; var11 < var3; var11++) {
            if (var9[var11] == var1 || null != var9[var11] && var9[var11].equals(var1)) {
               return var11;
            }
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/Object;II)I")
   @ObfuscatedName("bt")
   public static int method11003(DynamicArray var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method11215((byte)32)) {
         var3 = var0.method11215((byte)80);
      }

      if (class586.field6376 == var0.field6107) {
         int[] var4 = var0.method11207(2053374425);
         int var5 = (Integer)var1;

         for (int var6 = var2; var6 < var3; var6++) {
            if (var4[var6] == var5) {
               return var6;
            }
         }
      } else if (var0.field6107 == class586.field6377) {
         long[] var8 = DynamicArray.method11211(var0, (byte)-14);
         long var10 = (Long)var1;

         for (int var7 = var2; var7 < var3; var7++) {
            if (var10 == var8[var7]) {
               return var7;
            }
         }
      } else {
         Object[] var9 = var0.method11214((byte)-111);

         for (int var11 = var2; var11 < var3; var11++) {
            if (var9[var11] == var1 || null != var9[var11] && var9[var11].equals(var1)) {
               return var11;
            }
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/Object;II)I")
   @ObfuscatedName("bu")
   public static int method11005(DynamicArray var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method11215((byte)70)) {
         var3 = var0.method11215((byte)121);
      }

      if (var0.field6107 == class586.field6376) {
         int[] var4 = var0.method11207(2053374425);
         int var5 = (Integer)var1;

         for (int var6 = var3 - 1; var6 >= var2; var6--) {
            if (var5 == var4[var6]) {
               return var6;
            }
         }
      } else if (class586.field6377 == var0.field6107) {
         long[] var8 = DynamicArray.method11211(var0, (byte)-14);
         long var10 = (Long)var1;

         for (int var7 = var3 - 1; var7 >= var2; var7--) {
            if (var10 == var8[var7]) {
               return var7;
            }
         }
      } else {
         Object[] var9 = var0.method11214((byte)-59);

         for (int var11 = var3 - 1; var11 >= var2; var11--) {
            if (var1 == var9[var11] || var9[var11] != null && var9[var11].equals(var1)) {
               return var11;
            }
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/Object;II)I")
   @ObfuscatedName("ba")
   public static int method11006(DynamicArray var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method11215((byte)43)) {
         var3 = var0.method11215((byte)45);
      }

      int var4 = 0;
      if (var0.field6107 == class586.field6376) {
         int[] var5 = var0.method11207(2053374425);
         int var6 = (Integer)var1;

         for (int var7 = var2; var7 < var3; var7++) {
            if (var6 == var5[var7]) {
               var4++;
            }
         }
      } else if (class586.field6377 == var0.field6107) {
         long[] var9 = DynamicArray.method11211(var0, (byte)72);
         long var11 = (Long)var1;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var9[var8] == var11) {
               var4++;
            }
         }
      } else {
         Object[] var10 = var0.method11214((byte)-2);

         for (int var12 = var2; var12 < var3; var12++) {
            if (var1 == var10[var12] || var10[var12] != null && var10[var12].equals(var1)) {
               var4++;
            }
         }
      }

      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/Object;II)I")
   @ObfuscatedName("bi")
   public static int method11007(DynamicArray var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method11215((byte)120)) {
         var3 = var0.method11215((byte)66);
      }

      int var4 = 0;
      if (var0.field6107 == class586.field6376) {
         int[] var5 = var0.method11207(2053374425);
         int var6 = (Integer)var1;

         for (int var7 = var2; var7 < var3; var7++) {
            if (var6 == var5[var7]) {
               var4++;
            }
         }
      } else if (class586.field6377 == var0.field6107) {
         long[] var9 = DynamicArray.method11211(var0, (byte)52);
         long var11 = (Long)var1;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var9[var8] == var11) {
               var4++;
            }
         }
      } else {
         Object[] var10 = var0.method11214((byte)27);

         for (int var12 = var2; var12 < var3; var12++) {
            if (var1 == var10[var12] || var10[var12] != null && var10[var12].equals(var1)) {
               var4++;
            }
         }
      }

      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lwh;Z)V")
   @ObfuscatedName("dr")
   static void method11058(DynamicArray var0, class586 var1, boolean var2) {
      if (var0 == null) {
         throw new RuntimeException();
      } else if (null != var1 && var1 != var0.field6107) {
         throw new RuntimeException();
      } else if (var2 && !var0.field6109) {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lwh;)V")
   @ObfuscatedName("do")
   static void method11069(DynamicArray var0, class586 var1) {
      class461.method9338(var0, var1, true, -928498657);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;)I")
   @ObfuscatedName("bf")
   public static int method11009(DynamicArray var0) {
      classWJ.method11743(var0, (byte)22);
      byte var1 = 0;
      int var2 = var0.method11215((byte)114);
      int var3 = -1;
      if (class586.field6376 == var0.field6107) {
         int[] var4 = var0.method11207(2053374425);

         for (int var5 = var1; var5 < var2; var5++) {
            if (-1 == var3 || var4[var5] < var4[var3]) {
               var3 = var5;
            }
         }
      } else if (class586.field6377 == var0.field6107) {
         long[] var8 = DynamicArray.method11211(var0, (byte)-96);

         for (int var10 = var1; var10 < var2; var10++) {
            if (var3 == -1 || var8[var10] < var8[var3]) {
               var3 = var10;
            }
         }
      } else if (class586.field6379 == var0.field6107) {
         String var9 = null;
         Object[] var11 = var0.method11214((byte)24);

         for (int var6 = var1; var6 < var2; var6++) {
            String var7 = (String)var11[var6];
            if (-1 == var3 || null != var7 && var7.compareTo(var9) < 0) {
               var3 = var6;
               var9 = var7;
            }
         }
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;)I")
   @ObfuscatedName("bn")
   public static int method11010(DynamicArray var0) {
      classWJ.method11743(var0, (byte)-110);
      byte var1 = 0;
      int var2 = var0.method11215((byte)2);
      int var3 = -1;
      if (class586.field6376 == var0.field6107) {
         int[] var4 = var0.method11207(2053374425);

         for (int var5 = var1; var5 < var2; var5++) {
            if (-1 == var3 || var4[var5] < var4[var3]) {
               var3 = var5;
            }
         }
      } else if (class586.field6377 == var0.field6107) {
         long[] var8 = DynamicArray.method11211(var0, (byte)85);

         for (int var10 = var1; var10 < var2; var10++) {
            if (var3 == -1 || var8[var10] < var8[var3]) {
               var3 = var10;
            }
         }
      } else if (class586.field6379 == var0.field6107) {
         String var9 = null;
         Object[] var11 = var0.method11214((byte)-55);

         for (int var6 = var1; var6 < var2; var6++) {
            String var7 = (String)var11[var6];
            if (-1 == var3 || null != var7 && var7.compareTo(var9) < 0) {
               var3 = var6;
               var9 = var7;
            }
         }
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;)I")
   @ObfuscatedName("bd")
   public static int method11011(DynamicArray var0) {
      classWJ.method11743(var0, (byte)-13);
      byte var1 = 0;
      int var2 = var0.method11215((byte)107);
      int var3 = -1;
      if (class586.field6376 == var0.field6107) {
         int[] var4 = var0.method11207(2053374425);

         for (int var5 = var1; var5 < var2; var5++) {
            if (-1 == var3 || var4[var5] < var4[var3]) {
               var3 = var5;
            }
         }
      } else if (class586.field6377 == var0.field6107) {
         long[] var8 = DynamicArray.method11211(var0, (byte)-78);

         for (int var10 = var1; var10 < var2; var10++) {
            if (var3 == -1 || var8[var10] < var8[var3]) {
               var3 = var10;
            }
         }
      } else if (class586.field6379 == var0.field6107) {
         String var9 = null;
         Object[] var11 = var0.method11214((byte)-1);

         for (int var6 = var1; var6 < var2; var6++) {
            String var7 = (String)var11[var6];
            if (-1 == var3 || null != var7 && var7.compareTo(var9) < 0) {
               var3 = var6;
               var9 = var7;
            }
         }
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;)I")
   @ObfuscatedName("br")
   public static int method11013(DynamicArray var0) {
      classWJ.method11743(var0, (byte)-41);
      byte var1 = 0;
      int var2 = var0.method11215((byte)67);
      int var3 = -1;
      if (class586.field6376 == var0.field6107) {
         int[] var4 = var0.method11207(2053374425);

         for (int var5 = var1; var5 < var2; var5++) {
            if (var3 == -1 || var4[var5] > var4[var3]) {
               var3 = var5;
            }
         }
      } else if (var0.field6107 == class586.field6377) {
         long[] var8 = DynamicArray.method11211(var0, (byte)13);

         for (int var10 = var1; var10 < var2; var10++) {
            if (var3 == -1 || var8[var10] > var8[var3]) {
               var3 = var10;
            }
         }
      } else if (var0.field6107 == class586.field6379) {
         String var9 = null;
         Object[] var11 = var0.method11214((byte)-6);

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
   @ObfuscatedSignature(descriptor = "(Lut;)I")
   @ObfuscatedName("bh")
   public static int method11014(DynamicArray var0) {
      classWJ.method11743(var0, (byte)54);
      byte var1 = 0;
      int var2 = var0.method11215((byte)91);
      int var3 = -1;
      if (class586.field6376 == var0.field6107) {
         int[] var4 = var0.method11207(2053374425);

         for (int var5 = var1; var5 < var2; var5++) {
            if (var3 == -1 || var4[var5] > var4[var3]) {
               var3 = var5;
            }
         }
      } else if (var0.field6107 == class586.field6377) {
         long[] var8 = DynamicArray.method11211(var0, (byte)86);

         for (int var10 = var1; var10 < var2; var10++) {
            if (var3 == -1 || var8[var10] > var8[var3]) {
               var3 = var10;
            }
         }
      } else if (var0.field6107 == class586.field6379) {
         String var9 = null;
         Object[] var11 = var0.method11214((byte)28);

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
   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/Object;II)V")
   @ObfuscatedName("bl")
   public static void method11015(DynamicArray var0, Object var1, int var2, int var3) {
      class461.method9338(var0, null, true, -928498657);
      if (var2 < 0) {
         var2 = 0;
      }

      int var4 = var3 + var2;
      if (var3 < 0 || var4 < 0 || var4 > var0.method11215((byte)75)) {
         var4 = var0.method11215((byte)33);
      }

      if (class586.field6376 == var0.field6107) {
         Arrays.fill(var0.method11207(2053374425), var2, var4, ((Integer)var1).intValue());
      } else if (var0.field6107 == class586.field6377) {
         Arrays.fill(DynamicArray.method11211(var0, (byte)58), var2, var4, ((Long)var1).longValue());
      } else {
         Arrays.fill(var0.method11214((byte)-3), var2, var4, var1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lut;I)V")
   @ObfuscatedName("dh")
   public static void method11054(DynamicArray var0, DynamicArray var1, int var2) {
      class461.method9338(var0, null, true, -928498657);
      ProjectionCoord.method9919(var1, var0.field6107, -860554461);
      if (var2 < 0 || var2 > var0.size * 1583568339) {
         throw new RuntimeException();
      } else if (0 != 1583568339 * var1.size) {
         DynamicArray.method11228(var0, var1.size * 1583568339 + -1618238712 * var0.size, 759022181);
         if (var2 < var0.size * 1285988392) {
            HttpResponse.method142(var0, var2, var0, var2 + var1.size * 1583568339, var0.size * -167432323 - var2, (byte)2);
         }

         HttpResponse.method142(var1, 0, var0, var2, 1165901455 * var1.size, (byte)2);
         var0.size = var0.size + var1.size * 1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;IIII)V")
   @ObfuscatedName("bq")
   public static void method11016(DynamicArray var0, int var1, int var2, int var3, int var4) {
      ArchiveDiskActionHandler.method8886(var0, class586.field6376, 1647066105);
      if (var3 < 0) {
         var3 = 0;
      }

      int var5 = var4 + var3;
      if (var4 < 0 || var5 < 0 || var5 > var0.method11215((byte)62)) {
         var5 = var0.method11215((byte)9);
      }

      int[] var6 = var0.method11207(2053374425);
      int var7 = var1;

      for (int var8 = var3; var8 < var5; var8++) {
         var6[var8] = var7;
         var7 += var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lwh;)V")
   @ObfuscatedName("dg")
   static void method11066(DynamicArray var0, class586 var1) {
      class461.method9338(var0, var1, false, -928498657);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;IIII)V")
   @ObfuscatedName("bv")
   public static void method11017(DynamicArray var0, int var1, int var2, int var3, int var4) {
      ArchiveDiskActionHandler.method8886(var0, class586.field6376, 1970891657);
      if (var3 < 0) {
         var3 = 0;
      }

      int var5 = var4 + var3;
      if (var4 < 0 || var5 < 0 || var5 > var0.method11215((byte)96)) {
         var5 = var0.method11215((byte)17);
      }

      int[] var6 = var0.method11207(2053374425);
      int var7 = var1;

      for (int var8 = var3; var8 < var5; var8++) {
         var6[var8] = var7;
         var7 += var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;)V")
   @ObfuscatedName("ch")
   public static void method11020(DynamicArray var0) {
      class461.method9338(var0, null, true, -928498657);
      int var1 = var0.method11215((byte)80);
      if (var1 > 1) {
         if (class586.field6376 == var0.field6107) {
            LoginScreenAnimation.method1352(var0.method11207(2053374425), 0, var1 - 1, (byte)24);
         } else if (var0.field6107 == class586.field6377) {
            HttpResponse.method141(DynamicArray.method11211(var0, (byte)-66), 0, var1 - 1, 1036840473);
         } else {
            classFM.method4029(var0.method11214((byte)-33), 0, var1 - 1, 2108391709);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;)V")
   @ObfuscatedName("ce")
   public static void method11021(DynamicArray var0) {
      class461.method9338(var0, null, true, -928498657);
      int var1 = var0.method11215((byte)101);
      if (var1 > 1) {
         if (class586.field6376 == var0.field6107) {
            LoginScreenAnimation.method1352(var0.method11207(2053374425), 0, var1 - 1, (byte)-94);
         } else if (var0.field6107 == class586.field6377) {
            HttpResponse.method141(DynamicArray.method11211(var0, (byte)112), 0, var1 - 1, 2022973912);
         } else {
            classFM.method4029(var0.method11214((byte)-85), 0, var1 - 1, 2108391709);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;)V")
   @ObfuscatedName("cu")
   public static void method11022(DynamicArray var0) {
      class461.method9338(var0, null, true, -928498657);
      int var1 = var0.method11215((byte)115);
      if (var1 > 1) {
         if (class586.field6376 == var0.field6107) {
            LoginScreenAnimation.method1352(var0.method11207(2053374425), 0, var1 - 1, (byte)43);
         } else if (var0.field6107 == class586.field6377) {
            HttpResponse.method141(DynamicArray.method11211(var0, (byte)7), 0, var1 - 1, -968513469);
         } else {
            classFM.method4029(var0.method11214((byte)-51), 0, var1 - 1, 2108391709);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;I)V")
   @ObfuscatedName("ct")
   public static void method11023(DynamicArray var0, int var1) {
      class461.method9338(var0, null, true, -928498657);
      int var2 = var0.method11215((byte)71);
      if (var2 > 1) {
         var1 %= var2;
         if (var1 != 0) {
            if (var1 < 0) {
               var1 += var2;
            }

            if (class586.field6376 == var0.field6107) {
               int[] var3 = var0.method11207(2053374425);
               LoginScreenAnimation.method1352(var3, 0, var2 - 1, (byte)78);
               LoginScreenAnimation.method1352(var3, 0, var1 - 1, (byte)-30);
               LoginScreenAnimation.method1352(var3, var1, var2 - 1, (byte)62);
            } else if (class586.field6377 == var0.field6107) {
               long[] var5 = DynamicArray.method11211(var0, (byte)-18);
               HttpResponse.method141(var5, 0, var2 - 1, 1482892679);
               HttpResponse.method141(var5, 0, var1 - 1, 1671329718);
               HttpResponse.method141(var5, var1, var2 - 1, 1585062924);
            } else {
               Object[] var6 = var0.method11214((byte)-114);
               classFM.method4029(var6, 0, var2 - 1, 2108391709);
               classFM.method4029(var6, 0, var1 - 1, 2108391709);
               classFM.method4029(var6, var1, var2 - 1, 2108391709);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;IIII)V")
   @ObfuscatedName("bc")
   public static void method11018(DynamicArray var0, int var1, int var2, int var3, int var4) {
      ArchiveDiskActionHandler.method8886(var0, class586.field6376, 1488077084);
      if (var3 < 0) {
         var3 = 0;
      }

      int var5 = var4 + var3;
      if (var4 < 0 || var5 < 0 || var5 > var0.method11215((byte)91)) {
         var5 = var0.method11215((byte)91);
      }

      int[] var6 = var0.method11207(2053374425);
      int var7 = var1;

      for (int var8 = var3; var8 < var5; var8++) {
         var6[var8] = var7;
         var7 += var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;II)V")
   @ObfuscatedName("di")
   public static void method11055(DynamicArray var0, int var1, int var2) {
      class461.method9338(var0, null, true, -928498657);
      if (0 != var1) {
         if (var2 >= 0 && var2 < 1583568339 * var0.size && var1 >= 0 && var2 + var1 <= var0.size * 1583568339) {
            if (var2 < 1583568339 * var0.size - var1) {
               HttpResponse.method142(var0, var2 + var1, var0, var2, 1583568339 * var0.size - (var1 + var2), (byte)2);
            }

            var0.method11236(var0.size * 1583568339 - var1, (byte)-2);
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;II)V")
   @ObfuscatedName("ck")
   public static void method11026(DynamicArray var0, int var1, int var2) {
      class461.method9338(var0, null, true, -928498657);
      if (var1 >= 0 && var2 >= 0 && var1 < var0.method11215((byte)46) && var2 < var0.method11215((byte)17)) {
         if (var1 != var2) {
            if (class586.field6376 == var0.field6107) {
               int[] var3 = var0.method11207(2053374425);
               int var4 = var3[var1];
               var3[var1] = var3[var2];
               var3[var2] = var4;
            } else if (var0.field6107 == class586.field6377) {
               long[] var6 = DynamicArray.method11211(var0, (byte)-95);
               long var8 = var6[var1];
               var6[var1] = var6[var2];
               var6[var2] = var8;
            } else {
               Object[] var7 = var0.method11214((byte)-10);
               Object var9 = var7[var1];
               var7[var1] = var7[var2];
               var7[var2] = var9;
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;II)V")
   @ObfuscatedName("cc")
   public static void method11027(DynamicArray var0, int var1, int var2) {
      class461.method9338(var0, null, true, -928498657);
      if (var1 >= 0 && var2 >= 0 && var1 < var0.method11215((byte)75) && var2 < var0.method11215((byte)106)) {
         if (var1 != var2) {
            if (class586.field6376 == var0.field6107) {
               int[] var3 = var0.method11207(2053374425);
               int var4 = var3[var1];
               var3[var1] = var3[var2];
               var3[var2] = var4;
            } else if (var0.field6107 == class586.field6377) {
               long[] var6 = DynamicArray.method11211(var0, (byte)65);
               long var8 = var6[var1];
               var6[var1] = var6[var2];
               var6[var2] = var8;
            } else {
               Object[] var7 = var0.method11214((byte)-33);
               Object var9 = var7[var1];
               var7[var1] = var7[var2];
               var7[var2] = var9;
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;II)V")
   @ObfuscatedName("cs")
   public static void method11028(DynamicArray var0, int var1, int var2) {
      class461.method9338(var0, null, true, -928498657);
      if (var1 >= 0 && var2 >= 0 && var1 < var0.method11215((byte)18) && var2 < var0.method11215((byte)9)) {
         if (var1 != var2) {
            if (class586.field6376 == var0.field6107) {
               int[] var3 = var0.method11207(2053374425);
               int var4 = var3[var1];
               var3[var1] = var3[var2];
               var3[var2] = var4;
            } else if (var0.field6107 == class586.field6377) {
               long[] var6 = DynamicArray.method11211(var0, (byte)97);
               long var8 = var6[var1];
               var6[var1] = var6[var2];
               var6[var2] = var8;
            } else {
               Object[] var7 = var0.method11214((byte)-38);
               Object var9 = var7[var1];
               var7[var1] = var7[var2];
               var7[var2] = var9;
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;II)V")
   @ObfuscatedName("cn")
   public static void method11029(DynamicArray var0, int var1, int var2) {
      class461.method9338(var0, null, true, -928498657);
      if (var1 >= 0 && var2 >= 0 && var1 < var0.method11215((byte)100) && var2 < var0.method11215((byte)63)) {
         if (var1 != var2) {
            if (class586.field6376 == var0.field6107) {
               int[] var3 = var0.method11207(2053374425);
               int var4 = var3[var1];
               var3[var1] = var3[var2];
               var3[var2] = var4;
            } else if (var0.field6107 == class586.field6377) {
               long[] var6 = DynamicArray.method11211(var0, (byte)-75);
               long var8 = var6[var1];
               var6[var1] = var6[var2];
               var6[var2] = var8;
            } else {
               Object[] var7 = var0.method11214((byte)-68);
               Object var9 = var7[var1];
               var7[var1] = var7[var2];
               var7[var2] = var9;
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lut;III)V")
   @ObfuscatedName("co")
   public static void method11030(DynamicArray var0, DynamicArray var1, int var2, int var3, int var4) {
      classWJ.method11743(var0, (byte)23);
      ArchiveDiskActionHandler.method8886(var1, var0.field6107, 1836441547);
      int var5 = var0.method11215((byte)118);
      int var6 = var1.method11215((byte)40);
      if (-1 == var4) {
         var4 = var0.method11215((byte)103) - var2;
      }

      if (var4 != 0 && (var0 != var1 || var2 != var3)) {
         if (var2 >= 0 && var2 + var4 <= var5 && var3 >= 0 && var3 + var4 <= var6) {
            HttpResponse.method142(var0, var2, var1, var3, var4, (byte)2);
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;)I")
   @ObfuscatedName("bw")
   public static int method11012(DynamicArray var0) {
      classWJ.method11743(var0, (byte)-14);
      byte var1 = 0;
      int var2 = var0.method11215((byte)60);
      int var3 = -1;
      if (class586.field6376 == var0.field6107) {
         int[] var4 = var0.method11207(2053374425);

         for (int var5 = var1; var5 < var2; var5++) {
            if (-1 == var3 || var4[var5] < var4[var3]) {
               var3 = var5;
            }
         }
      } else if (class586.field6377 == var0.field6107) {
         long[] var8 = DynamicArray.method11211(var0, (byte)-97);

         for (int var10 = var1; var10 < var2; var10++) {
            if (var3 == -1 || var8[var10] < var8[var3]) {
               var3 = var10;
            }
         }
      } else if (class586.field6379 == var0.field6107) {
         String var9 = null;
         Object[] var11 = var0.method11214((byte)-5);

         for (int var6 = var1; var6 < var2; var6++) {
            String var7 = (String)var11[var6];
            if (-1 == var3 || null != var7 && var7.compareTo(var9) < 0) {
               var3 = var6;
               var9 = var7;
            }
         }
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lut;)V")
   @ObfuscatedName("cg")
   public static void method11032(DynamicArray var0, DynamicArray var1) {
      if (var0 != null && var0.method11215((byte)90) > 1) {
         class461.method9338(var0, null, true, -928498657);
         if (null != var1) {
            class461.method9338(var1, null, true, -928498657);
         }

         int var2 = var0.method11215((byte)47);
         if (null != var1 && var1.method11215((byte)81) < var2) {
            throw new RuntimeException();
         } else {
            if (class586.field6376 == var0.field6107) {
               if (var1 == null) {
                  class134.method4022(var0.method11207(2053374425), field6008, 0, var2 - 1, -817675254);
               } else if (var1.field6107 == class586.field6376) {
                  class134.method4022(var0.method11207(2053374425), var1.method11207(2053374425), 0, var2 - 1, -817675254);
               } else if (class586.field6377 == var1.field6107) {
                  classFO.method4033(var0.method11207(2053374425), DynamicArray.method11211(var1, (byte)-22), 0, var2 - 1, (byte)126);
               } else {
                  class69.method1400(var0.method11207(2053374425), var1.method11214((byte)-30), 0, var2 - 1, 1772939328);
               }
            } else if (var0.field6107 == class586.field6377) {
               if (var1 == null) {
                  Arrays.sort(DynamicArray.method11211(var0, (byte)-11), 0, var2);
               } else if (class586.field6376 == var1.field6107) {
                  class341.method7852(DynamicArray.method11211(var0, (byte)70), var1.method11207(2053374425), 0, var2 - 1, 2098987333);
               } else if (class586.field6377 == var1.field6107) {
                  ChatChannel.method2611(DynamicArray.method11211(var0, (byte)109), DynamicArray.method11211(var1, (byte)-9), 0, var2 - 1, (byte)-70);
               } else {
                  HorizontalAlignment.method4600(DynamicArray.method11211(var0, (byte)33), var1.method11214((byte)-34), 0, var2 - 1, 241339949);
               }
            } else {
               if (class586.field6379 != var0.field6107) {
                  throw new RuntimeException();
               }

               if (var1 == null) {
                  Arrays.sort(var0.method11214((byte)11), 0, var2);
               } else if (var1.field6107 == class586.field6376) {
                  WorldMapID.quicksortStringsWithCorrespondingIntegers(
                     (String[])var0.method11214((byte)-97), var1.method11207(2053374425), 0, var2 - 1, 487720432
                  );
               } else if (class586.field6377 == var1.field6107) {
                  class161.method4254((String[])var0.method11214((byte)-120), DynamicArray.method11211(var1, (byte)92), 0, var2 - 1, (byte)124);
               } else {
                  Renderable.method6217((String[])var0.method11214((byte)51), var1.method11214((byte)56), 0, var2 - 1, (byte)83);
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;ILjava/lang/Object;)V")
   @ObfuscatedName("dv")
   public static void method11047(DynamicArray var0, int var1, Object var2) {
      class461.method9338(var0, null, true, -928498657);
      if (var1 >= 0 && var1 <= 1583568339 * var0.size) {
         DynamicArray.method11228(var0, 1 + 1583568339 * var0.size, 196324581);
         if (var1 < 1583568339 * var0.size) {
            HttpResponse.method142(var0, var1, var0, var1 + 1, var0.size * -217819703 - var1, (byte)2);
         }

         var0.method11221(var1, var2, -2004678185);
         var0.size += 1366375368;
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([JII)V")
   @ObfuscatedName("eq")
   static void method11075(long[] var0, int var1, int var2) {
      while (var1 < var2) {
         long var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         var1++;
         var2--;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;)J")
   @ObfuscatedName("cy")
   public static long method11037(DynamicArray var0) {
      ProjectionCoord.method9919(var0, class586.field6376, 1488470618);
      int[] var1 = var0.method11207(2053374425);
      int var2 = var0.method11215((byte)21);
      long var3 = 0L;

      for (int var5 = 0; var5 < var2; var5++) {
         var3 += var1[var5];
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;II)V")
   @ObfuscatedName("ci")
   public static void method11034(DynamicArray var0, int var1, int var2) {
      if (null != var0 && var0.method11215((byte)21) > 1) {
         class461.method9338(var0, null, true, -928498657);
         if (class586.field6376 == var0.field6107) {
            class488.method10108(var0.method11207(2053374425), var0.method11215((byte)87), var1, var2);
         } else if (class586.field6377 == var0.field6107) {
            class488.method10110(DynamicArray.method11211(var0, (byte)20), var0.method11215((byte)67), var1, var2);
         } else {
            class488.method10113(var0.method11214((byte)-128), var0.method11215((byte)86), var1, var2);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;)J")
   @ObfuscatedName("cf")
   public static long method11038(DynamicArray var0) {
      ProjectionCoord.method9919(var0, class586.field6376, -1093329209);
      int[] var1 = var0.method11207(2053374425);
      int var2 = var0.method11215((byte)90);
      long var3 = 0L;

      for (int var5 = 0; var5 < var2; var5++) {
         var3 += var1[var5];
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/Object;II)I")
   @ObfuscatedName("bj")
   public static int method11004(DynamicArray var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method11215((byte)50)) {
         var3 = var0.method11215((byte)51);
      }

      if (class586.field6376 == var0.field6107) {
         int[] var4 = var0.method11207(2053374425);
         int var5 = (Integer)var1;

         for (int var6 = var2; var6 < var3; var6++) {
            if (var4[var6] == var5) {
               return var6;
            }
         }
      } else if (var0.field6107 == class586.field6377) {
         long[] var8 = DynamicArray.method11211(var0, (byte)74);
         long var10 = (Long)var1;

         for (int var7 = var2; var7 < var3; var7++) {
            if (var10 == var8[var7]) {
               return var7;
            }
         }
      } else {
         Object[] var9 = var0.method11214((byte)-100);

         for (int var11 = var2; var11 < var3; var11++) {
            if (var9[var11] == var1 || null != var9[var11] && var9[var11].equals(var1)) {
               return var11;
            }
         }
      }

      return -1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;I)I")
   @ObfuscatedName("cq")
   public static int method11039(DynamicArray var0, int var1) {
      ProjectionCoord.method9919(var0, class586.field6376, 23594687);
      if (var1 >= 0) {
         int[] var2 = var0.method11207(2053374425);
         int var3 = var0.method11215((byte)31);

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
   @ObfuscatedSignature(descriptor = "(Lut;)V")
   @ObfuscatedName("dm")
   static void method11061(DynamicArray var0) {
      class461.method9338(var0, null, false, -928498657);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;)V")
   @ObfuscatedName("dx")
   static void method11062(DynamicArray var0) {
      class461.method9338(var0, null, false, -928498657);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;)Lut;")
   @ObfuscatedName("cr")
   public static DynamicArray method11042(String var0, String var1) {
      if (var1 != null && !var1.isEmpty()) {
         int var2 = var1.length();
         int var3 = 1;
         int var4 = 0;

         while ((var4 = var0.indexOf(var1, var4)) != -1) {
            var3++;
            var4 += var2;
         }

         DynamicArray var5 = new DynamicArray(class586.field6379, null, var3, var3);
         int var6 = 0;
         var4 = 0;

         for (var3 = 0; (var4 = var0.indexOf(var1, var4)) != -1; var6 = var4) {
            var5.method11214((byte)-12)[var3++] = var0.substring(var6, var4);
            var4 += var2;
         }

         var5.method11214((byte)24)[var3] = var0.substring(var6);
         return var5;
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("cj")
   public static String method11043(DynamicArray var0, String var1) {
      ProjectionCoord.method9919(var0, class586.field6379, 1204207858);
      int var2 = var0.method11215((byte)22);
      String[] var3 = (String[])var0.method11214((byte)-48);
      if (var2 == 0) {
         return "";
      } else if (1 == var2) {
         return var3[0];
      } else {
         int var4 = var1.length();
         int var5 = var4 * (var2 - 1);

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
   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ca")
   public static String method11044(DynamicArray var0, String var1) {
      ProjectionCoord.method9919(var0, class586.field6379, 566344866);
      int var2 = var0.method11215((byte)96);
      String[] var3 = (String[])var0.method11214((byte)-8);
      if (var2 == 0) {
         return "";
      } else if (1 == var2) {
         return var3[0];
      } else {
         int var4 = var1.length();
         int var5 = var4 * (var2 - 1);

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
   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("cl")
   public static String method11045(DynamicArray var0, String var1) {
      ProjectionCoord.method9919(var0, class586.field6379, 458037627);
      int var2 = var0.method11215((byte)0);
      String[] var3 = (String[])var0.method11214((byte)-119);
      if (var2 == 0) {
         return "";
      } else if (1 == var2) {
         return var3[0];
      } else {
         int var4 = var1.length();
         int var5 = var4 * (var2 - 1);

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
   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("dd")
   public static String method11046(DynamicArray var0, String var1) {
      ProjectionCoord.method9919(var0, class586.field6379, 127738189);
      int var2 = var0.method11215((byte)53);
      String[] var3 = (String[])var0.method11214((byte)-79);
      if (var2 == 0) {
         return "";
      } else if (1 == var2) {
         return var3[0];
      } else {
         int var4 = var1.length();
         int var5 = var4 * (var2 - 1);

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
   @ObfuscatedSignature(descriptor = "(Lut;ILjava/lang/Object;)V")
   @ObfuscatedName("dw")
   public static void method11048(DynamicArray var0, int var1, Object var2) {
      class461.method9338(var0, null, true, -928498657);
      if (var1 >= 0 && var1 <= 220383220 * var0.size) {
         DynamicArray.method11228(var0, 1 + 1176940011 * var0.size, -825528619);
         if (var1 < -2051206270 * var0.size) {
            HttpResponse.method142(var0, var1, var0, var1 + 1, var0.size * 1583568339 - var1, (byte)2);
         }

         var0.method11221(var1, var2, -1488912979);
         var0.size += -1205286309;
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;I)I")
   @ObfuscatedName("cv")
   public static int method11040(DynamicArray var0, int var1) {
      ProjectionCoord.method9919(var0, class586.field6376, -1200136113);
      if (var1 >= 0) {
         int[] var2 = var0.method11207(2053374425);
         int var3 = var0.method11215((byte)125);

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
   @ObfuscatedSignature(descriptor = "(Lut;ILjava/lang/Object;)V")
   @ObfuscatedName("df")
   public static void method11049(DynamicArray var0, int var1, Object var2) {
      class461.method9338(var0, null, true, -928498657);
      if (var1 >= 0 && var1 <= 1583568339 * var0.size) {
         DynamicArray.method11228(var0, 1 + 1583568339 * var0.size, -1091157381);
         if (var1 < 1583568339 * var0.size) {
            HttpResponse.method142(var0, var1, var0, var1 + 1, var0.size * 1470012793 - var1, (byte)2);
         }

         var0.method11221(var1, var2, -1990821875);
         var0.size += -1546384221;
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([III)V")
   @ObfuscatedName("ee")
   static void method11073(int[] var0, int var1, int var2) {
      while (var1 < var2) {
         int var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         var1++;
         var2--;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;I)Ljava/lang/Object;")
   @ObfuscatedName("dc")
   public static Object method11051(DynamicArray var0, int var1) {
      class461.method9338(var0, null, true, -928498657);
      if (var1 >= 0 && var1 < 1583568339 * var0.size) {
         Object var2 = var0.method11219(var1, (short)-19580);
         if (var1 < var0.size * 1583568339 - 1) {
            HttpResponse.method142(var0, var1 + 1, var0, var1, 720903306 * var0.size - (var1 + 1), (byte)2);
         }

         var0.method11236(var0.size * 1583568339 - 1, (byte)-117);
         return var2;
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;I)Ljava/lang/Object;")
   @ObfuscatedName("db")
   public static Object method11052(DynamicArray var0, int var1) {
      class461.method9338(var0, null, true, -928498657);
      if (var1 >= 0 && var1 < 1583568339 * var0.size) {
         Object var2 = var0.method11219(var1, (short)-5526);
         if (var1 < var0.size * -1613882395 - 1) {
            HttpResponse.method142(var0, var1 + 1, var0, var1, 1583568339 * var0.size - (var1 + 1), (byte)2);
         }

         var0.method11236(var0.size * 1583568339 - 1, (byte)-27);
         return var2;
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;I)Ljava/lang/Object;")
   @ObfuscatedName("dt")
   public static Object method11053(DynamicArray var0, int var1) {
      class461.method9338(var0, null, true, -928498657);
      if (var1 >= 0 && var1 < 1583568339 * var0.size) {
         Object var2 = var0.method11219(var1, (short)-21892);
         if (var1 < var0.size * 1583568339 - 1) {
            HttpResponse.method142(var0, var1 + 1, var0, var1, 1583568339 * var0.size - (var1 + 1), (byte)2);
         }

         var0.method11236(var0.size * 1583568339 - 1, (byte)-86);
         return var2;
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lwh;)V")
   @ObfuscatedName("dp")
   static void method11067(DynamicArray var0, class586 var1) {
      class461.method9338(var0, var1, false, -928498657);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lwh;Z)V")
   @ObfuscatedName("dl")
   static void method11059(DynamicArray var0, class586 var1, boolean var2) {
      if (var0 == null) {
         throw new RuntimeException();
      } else if (null != var1 && var1 != var0.field6107) {
         throw new RuntimeException();
      } else if (var2 && !var0.field6109) {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;II)V")
   @ObfuscatedName("dj")
   public static void method11056(DynamicArray var0, int var1, int var2) {
      class461.method9338(var0, null, true, -928498657);
      if (0 != var1) {
         if (var2 >= 0 && var2 < 1583568339 * var0.size && var1 >= 0 && var2 + var1 <= var0.size * 1774555805) {
            if (var2 < 1583568339 * var0.size - var1) {
               HttpResponse.method142(var0, var2 + var1, var0, var2, -2128173700 * var0.size - (var1 + var2), (byte)2);
            }

            var0.method11236(var0.size * 1583568339 - var1, (byte)-96);
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lwh;Z)V")
   @ObfuscatedName("da")
   static void method11060(DynamicArray var0, class586 var1, boolean var2) {
      if (var0 == null) {
         throw new RuntimeException();
      } else if (null != var1 && var1 != var0.field6107) {
         throw new RuntimeException();
      } else if (var2 && !var0.field6109) {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;I)V")
   @ObfuscatedName("cm")
   public static void method11024(DynamicArray var0, int var1) {
      class461.method9338(var0, null, true, -928498657);
      int var2 = var0.method11215((byte)63);
      if (var2 > 1) {
         var1 %= var2;
         if (var1 != 0) {
            if (var1 < 0) {
               var1 += var2;
            }

            if (class586.field6376 == var0.field6107) {
               int[] var3 = var0.method11207(2053374425);
               LoginScreenAnimation.method1352(var3, 0, var2 - 1, (byte)14);
               LoginScreenAnimation.method1352(var3, 0, var1 - 1, (byte)-27);
               LoginScreenAnimation.method1352(var3, var1, var2 - 1, (byte)-68);
            } else if (class586.field6377 == var0.field6107) {
               long[] var5 = DynamicArray.method11211(var0, (byte)24);
               HttpResponse.method141(var5, 0, var2 - 1, -2117408292);
               HttpResponse.method141(var5, 0, var1 - 1, -2020987465);
               HttpResponse.method141(var5, var1, var2 - 1, 180600971);
            } else {
               Object[] var6 = var0.method11214((byte)1);
               classFM.method4029(var6, 0, var2 - 1, 2108391709);
               classFM.method4029(var6, 0, var1 - 1, 2108391709);
               classFM.method4029(var6, var1, var2 - 1, 2108391709);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;II)V")
   @ObfuscatedName("dz")
   public static void method11057(DynamicArray var0, int var1, int var2) {
      class461.method9338(var0, null, true, -928498657);
      if (0 != var1) {
         if (var2 >= 0 && var2 < -2592591 * var0.size && var1 >= 0 && var2 + var1 <= var0.size * 1583568339) {
            if (var2 < 1583568339 * var0.size - var1) {
               HttpResponse.method142(var0, var2 + var1, var0, var2, 1879514745 * var0.size - (var1 + var2), (byte)2);
            }

            var0.method11236(var0.size * -260320172 - var1, (byte)-55);
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([JII)V")
   @ObfuscatedName("ef")
   static void method11076(long[] var0, int var1, int var2) {
      while (var1 < var2) {
         long var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         var1++;
         var2--;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;)V")
   @ObfuscatedName("dq")
   static void method11063(DynamicArray var0) {
      class461.method9338(var0, null, false, -928498657);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;)V")
   @ObfuscatedName("du")
   static void method11064(DynamicArray var0) {
      class461.method9338(var0, null, false, -928498657);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lwh;)V")
   @ObfuscatedName("ec")
   static void method11070(DynamicArray var0, class586 var1) {
      class461.method9338(var0, var1, true, -928498657);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Ljava/lang/Object;II)I")
   @ObfuscatedName("by")
   public static int method11008(DynamicArray var0, Object var1, int var2, int var3) {
      if (var2 < 0) {
         var2 = 0;
      }

      if (var3 < 0 || var3 > var0.method11215((byte)42)) {
         var3 = var0.method11215((byte)127);
      }

      int var4 = 0;
      if (var0.field6107 == class586.field6376) {
         int[] var5 = var0.method11207(2053374425);
         int var6 = (Integer)var1;

         for (int var7 = var2; var7 < var3; var7++) {
            if (var6 == var5[var7]) {
               var4++;
            }
         }
      } else if (class586.field6377 == var0.field6107) {
         long[] var9 = DynamicArray.method11211(var0, (byte)-8);
         long var11 = (Long)var1;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var9[var8] == var11) {
               var4++;
            }
         }
      } else {
         Object[] var10 = var0.method11214((byte)-46);

         for (int var12 = var2; var12 < var3; var12++) {
            if (var1 == var10[var12] || var10[var12] != null && var10[var12].equals(var1)) {
               var4++;
            }
         }
      }

      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;ILut;II)V")
   @ObfuscatedName("em")
   static void method11083(DynamicArray var0, int var1, DynamicArray var2, int var3, int var4) {
      if (class586.field6376 == var0.field6107) {
         System.arraycopy(var0.array, var1, var2.array, var3, var4);
      } else if (var0.field6107 == class586.field6377) {
         System.arraycopy(var0.field6110, var1, var2.field6110, var3, var4);
      } else {
         System.arraycopy(var0.field6111, var1, var2.field6111, var3, var4);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;II)V")
   @ObfuscatedName("cd")
   public static void method11035(DynamicArray var0, int var1, int var2) {
      if (null != var0 && var0.method11215((byte)107) > 1) {
         class461.method9338(var0, null, true, -928498657);
         if (class586.field6376 == var0.field6107) {
            class488.method10108(var0.method11207(2053374425), var0.method11215((byte)42), var1, var2);
         } else if (class586.field6377 == var0.field6107) {
            class488.method10110(DynamicArray.method11211(var0, (byte)-61), var0.method11215((byte)30), var1, var2);
         } else {
            class488.method10113(var0.method11214((byte)34), var0.method11215((byte)46), var1, var2);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lwh;)V")
   @ObfuscatedName("de")
   static void method11068(DynamicArray var0, class586 var1) {
      class461.method9338(var0, var1, false, -928498657);
   }

   class528() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lwh;)V")
   @ObfuscatedName("dk")
   static void method11071(DynamicArray var0, class586 var1) {
      class461.method9338(var0, var1, true, -928498657);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lwh;)V")
   @ObfuscatedName("dn")
   static void method11072(DynamicArray var0, class586 var1) {
      class461.method9338(var0, var1, true, -928498657);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;I)I")
   @ObfuscatedName("cw")
   public static int method11041(DynamicArray var0, int var1) {
      ProjectionCoord.method9919(var0, class586.field6376, -297740686);
      if (var1 >= 0) {
         int[] var2 = var0.method11207(2053374425);
         int var3 = var0.method11215((byte)56);

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
   @ObfuscatedName("ea")
   static void method11074(int[] var0, int var1, int var2) {
      while (var1 < var2) {
         int var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         var1++;
         var2--;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;Lut;III)V")
   @ObfuscatedName("cx")
   public static void method11031(DynamicArray var0, DynamicArray var1, int var2, int var3, int var4) {
      classWJ.method11743(var0, (byte)1);
      ArchiveDiskActionHandler.method8886(var1, var0.field6107, 950629978);
      int var5 = var0.method11215((byte)30);
      int var6 = var1.method11215((byte)37);
      if (-1 == var4) {
         var4 = var0.method11215((byte)41) - var2;
      }

      if (var4 != 0 && (var0 != var1 || var2 != var3)) {
         if (var2 >= 0 && var2 + var4 <= var5 && var3 >= 0 && var3 + var4 <= var6) {
            HttpResponse.method142(var0, var2, var1, var3, var4, (byte)2);
         } else {
            throw new RuntimeException();
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;ILjava/lang/Object;)V")
   @ObfuscatedName("dy")
   public static void method11050(DynamicArray var0, int var1, Object var2) {
      class461.method9338(var0, null, true, -928498657);
      if (var1 >= 0 && var1 <= -2144676821 * var0.size) {
         DynamicArray.method11228(var0, 1 + 481908867 * var0.size, -1245496169);
         if (var1 < -1861722495 * var0.size) {
            HttpResponse.method142(var0, var1, var0, var1 + 1, var0.size * 1583568339 - var1, (byte)2);
         }

         var0.method11221(var1, var2, -1550412535);
         var0.size += 137853747;
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([JII)V")
   @ObfuscatedName("es")
   static void method11077(long[] var0, int var1, int var2) {
      while (var1 < var2) {
         long var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         var1++;
         var2--;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([JII)V")
   @ObfuscatedName("er")
   static void method11078(long[] var0, int var1, int var2) {
      while (var1 < var2) {
         long var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         var1++;
         var2--;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([JII)V")
   @ObfuscatedName("ek")
   static void method11079(long[] var0, int var1, int var2) {
      while (var1 < var2) {
         long var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         var1++;
         var2--;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;IIII)V")
   @ObfuscatedName("bx")
   public static void method11019(DynamicArray var0, int var1, int var2, int var3, int var4) {
      ArchiveDiskActionHandler.method8886(var0, class586.field6376, 1795839794);
      if (var3 < 0) {
         var3 = 0;
      }

      int var5 = var4 + var3;
      if (var4 < 0 || var5 < 0 || var5 > var0.method11215((byte)46)) {
         var5 = var0.method11215((byte)73);
      }

      int[] var6 = var0.method11207(2053374425);
      int var7 = var1;

      for (int var8 = var3; var8 < var5; var8++) {
         var6[var8] = var7;
         var7 += var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;II)V")
   @ObfuscatedName("ej")
   static void method11080(Object[] var0, int var1, int var2) {
      while (var1 < var2) {
         Object var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         var1++;
         var2--;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/Object;II)V")
   @ObfuscatedName("ew")
   static void method11081(Object[] var0, int var1, int var2) {
      while (var1 < var2) {
         Object var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         var1++;
         var2--;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;I)V")
   @ObfuscatedName("cb")
   public static void method11025(DynamicArray var0, int var1) {
      class461.method9338(var0, null, true, -928498657);
      int var2 = var0.method11215((byte)59);
      if (var2 > 1) {
         var1 %= var2;
         if (var1 != 0) {
            if (var1 < 0) {
               var1 += var2;
            }

            if (class586.field6376 == var0.field6107) {
               int[] var3 = var0.method11207(2053374425);
               LoginScreenAnimation.method1352(var3, 0, var2 - 1, (byte)12);
               LoginScreenAnimation.method1352(var3, 0, var1 - 1, (byte)10);
               LoginScreenAnimation.method1352(var3, var1, var2 - 1, (byte)37);
            } else if (class586.field6377 == var0.field6107) {
               long[] var5 = DynamicArray.method11211(var0, (byte)71);
               HttpResponse.method141(var5, 0, var2 - 1, -757907666);
               HttpResponse.method141(var5, 0, var1 - 1, -1078188001);
               HttpResponse.method141(var5, var1, var2 - 1, 1930694146);
            } else {
               Object[] var6 = var0.method11214((byte)52);
               classFM.method4029(var6, 0, var2 - 1, 2108391709);
               classFM.method4029(var6, 0, var1 - 1, 2108391709);
               classFM.method4029(var6, var1, var2 - 1, 2108391709);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lut;II)V")
   @ObfuscatedName("cp")
   public static void method11036(DynamicArray var0, int var1, int var2) {
      if (null != var0 && var0.method11215((byte)83) > 1) {
         class461.method9338(var0, null, true, -928498657);
         if (class586.field6376 == var0.field6107) {
            class488.method10108(var0.method11207(2053374425), var0.method11215((byte)109), var1, var2);
         } else if (class586.field6377 == var0.field6107) {
            class488.method10110(DynamicArray.method11211(var0, (byte)-69), var0.method11215((byte)89), var1, var2);
         } else {
            class488.method10113(var0.method11214((byte)17), var0.method11215((byte)42), var1, var2);
         }
      }
   }
}
