import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xb")
public class classXB {
   @ToRemove(unused = "true")
   @ObfuscatedName("bq")
   public static final int field6821 = 51;
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   public static final int field6820 = 49;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[III)V")
   @ObfuscatedName("bt")
   public static void method12727(int[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var8 = var6 == 1160141103 ? 0 : 1;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var0[var9] < (var9 & var8) + var6) {
               int var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classHL.method6072(var0, var1, var2, var5 - 1, (byte)-10);
         classHL.method6072(var0, var1, var5 + 1, var3, (byte)17);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([J[Ljava/lang/Object;II)V")
   @ObfuscatedName("by")
   public static void method12739(long[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         long var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var8 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var8;
         int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

         for (int var10 = var2; var10 < var3; var10++) {
            if (var0[var10] < var6 + (var10 & var9)) {
               long var11 = var0[var10];
               var0[var10] = var0[var5];
               var0[var5] = var11;
               Object var13 = var1[var10];
               var1[var10] = var1[var5];
               var1[var5++] = var13;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var8;
         classTJ.method10873(var0, var1, var2, var5 - 1, (byte)4);
         classTJ.method10873(var0, var1, var5 + 1, var3, (byte)4);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[SII)V")
   @ObfuscatedName("ap")
   static void method12713(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (null == var6 || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classQA.method9414(var0, var1, var2, var5 - 1, 612271396);
         classQA.method9414(var0, var1, var5 + 1, var3, 846641034);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[SII)V")
   @ObfuscatedName("au")
   static void method12714(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (null == var6 || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classQA.method9414(var0, var1, var2, var5 - 1, 731990662);
         classQA.method9414(var0, var1, var5 + 1, var3, -75450246);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([J[Ljava/lang/Object;II)V")
   @ObfuscatedName("be")
   public static void method12740(long[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         long var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var8 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var8;
         int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

         for (int var10 = var2; var10 < var3; var10++) {
            if (var0[var10] < var6 + (var10 & var9)) {
               long var11 = var0[var10];
               var0[var10] = var0[var5];
               var0[var5] = var11;
               Object var13 = var1[var10];
               var1[var10] = var1[var5];
               var1[var5++] = var13;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var8;
         classTJ.method10873(var0, var1, var2, var5 - 1, (byte)4);
         classTJ.method10873(var0, var1, var5 + 1, var3, (byte)4);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[III)V")
   @ObfuscatedName("aw")
   public static void method12717(String[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (null == var6 || null != var0[var8] && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               int var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classCZ.method2848(var0, var1, var2, var5 - 1, -541759014);
         classCZ.method2848(var0, var1, var5 + 1, var3, 1237170444);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[S)V")
   @ObfuscatedName("ad")
   public static void method12712(String[] var0, short[] var1) {
      classQA.method9414(var0, var1, 0, var0.length - 1, 82893554);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[III)V")
   @ObfuscatedName("ak")
   public static void method12718(String[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (null == var6 || null != var0[var8] && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               int var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classCZ.method2848(var0, var1, var2, var5 - 1, -829495599);
         classCZ.method2848(var0, var1, var5 + 1, var3, -1332799148);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[JII)V")
   @ObfuscatedName("am")
   public static void method12719(String[] var0, long[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         long var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var6 == null || null != var0[var9] && var0[var9].compareTo(var6) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               long var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classKH.method6475(var0, var1, var2, var5 - 1, 1952667902);
         classKH.method6475(var0, var1, var5 + 1, var3, -308634962);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[JII)V")
   @ObfuscatedName("at")
   public static void method12720(String[] var0, long[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         long var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var6 == null || null != var0[var9] && var0[var9].compareTo(var6) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               long var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classKH.method6475(var0, var1, var2, var5 - 1, 1356723892);
         classKH.method6475(var0, var1, var5 + 1, var3, -945525341);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[Ljava/lang/Object;II)V")
   @ObfuscatedName("bb")
   public static void method12737(int[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var0[var9] < var6 + (var9 & var8)) {
               int var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               Object var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classAT.method693(var0, var1, var2, var5 - 1, (byte)-9);
         classAT.method693(var0, var1, var5 + 1, var3, (byte)-13);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[JII)V")
   @ObfuscatedName("bj")
   public static void method12731(int[] var0, long[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         long var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var9 = Integer.MAX_VALUE == var6 ? 0 : 1;

         for (int var10 = var2; var10 < var3; var10++) {
            if (var0[var10] < var6 + (var10 & var9)) {
               int var11 = var0[var10];
               var0[var10] = var0[var5];
               var0[var5] = var11;
               long var12 = var1[var10];
               var1[var10] = var1[var5];
               var1[var5++] = var12;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classGS.method5744(var0, var1, var2, var5 - 1, -304436081);
         classGS.method5744(var0, var1, var5 + 1, var3, -1657294920);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[Ljava/lang/Object;II)V")
   @ObfuscatedName("ah")
   public static void method12723(String[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               Object var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         KeyHandler.method10835(var0, var1, var2, var5 - 1, 951539698);
         KeyHandler.method10835(var0, var1, var5 + 1, var3, -620874748);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[Ljava/lang/Object;II)V")
   @ObfuscatedName("bn")
   public static void method12724(String[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               Object var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         KeyHandler.method10835(var0, var1, var2, var5 - 1, 214467480);
         KeyHandler.method10835(var0, var1, var5 + 1, var3, -1996867154);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[Ljava/lang/Object;II)V")
   @ObfuscatedName("bx")
   public static void method12725(String[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               Object var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         KeyHandler.method10835(var0, var1, var2, var5 - 1, -1972437214);
         KeyHandler.method10835(var0, var1, var5 + 1, var3, 363133587);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[I)V")
   @ObfuscatedName("ar")
   public static void method12715(String[] var0, int[] var1) {
      classCZ.method2848(var0, var1, 0, var0.length - 1, 2077699049);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[III)V")
   @ObfuscatedName("bp")
   public static void method12728(int[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var0[var9] < (var9 & var8) + var6) {
               int var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classHL.method6072(var0, var1, var2, var5 - 1, (byte)37);
         classHL.method6072(var0, var1, var5 + 1, var3, (byte)66);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[III)V")
   @ObfuscatedName("br")
   public static void method12729(int[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var0[var9] < (var9 & var8) + var6) {
               int var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classHL.method6072(var0, var1, var2, var5 - 1, (byte)-59);
         classHL.method6072(var0, var1, var5 + 1, var3, (byte)-88);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[III)V")
   @ObfuscatedName("bm")
   public static void method12730(int[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var8 = var6 == -1779538233 ? 0 : 1;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var0[var9] < (var9 & var8) + var6) {
               int var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classHL.method6072(var0, var1, var2, var5 - 1, (byte)22);
         classHL.method6072(var0, var1, var5 + 1, var3, (byte)-69);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[JII)V")
   @ObfuscatedName("an")
   public static void method12721(String[] var0, long[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         long var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var6 == null || null != var0[var9] && var0[var9].compareTo(var6) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               long var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classKH.method6475(var0, var1, var2, var5 - 1, -543353509);
         classKH.method6475(var0, var1, var5 + 1, var3, 1620709027);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[JII)V")
   @ObfuscatedName("bg")
   public static void method12732(int[] var0, long[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         long var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var9 = Integer.MAX_VALUE == var6 ? 0 : 1;

         for (int var10 = var2; var10 < var3; var10++) {
            if (var0[var10] < var6 + (var10 & var9)) {
               int var11 = var0[var10];
               var0[var10] = var0[var5];
               var0[var5] = var11;
               long var12 = var1[var10];
               var1[var10] = var1[var5];
               var1[var5++] = var12;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classGS.method5744(var0, var1, var2, var5 - 1, -619211646);
         classGS.method5744(var0, var1, var5 + 1, var3, 228590554);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[I)V")
   @ObfuscatedName("ai")
   public static void method12716(String[] var0, int[] var1) {
      classCZ.method2848(var0, var1, 0, var0.length - 1, -2025619717);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([J[JII)V")
   @ObfuscatedName("bk")
   public static void method12733(long[] var0, long[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         long var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         long var8 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var8;
         long var10 = var6 == Long.MAX_VALUE ? 0L : 1L;

         for (int var12 = var2; var12 < var3; var12++) {
            if (var0[var12] < (var12 & var10) + var6) {
               long var13 = var0[var12];
               var0[var12] = var0[var5];
               var0[var5] = var13;
               long var15 = var1[var12];
               var1[var12] = var1[var5];
               var1[var5++] = var15;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var8;
         classMQ.method7645(var0, var1, var2, var5 - 1, (byte)1);
         classMQ.method7645(var0, var1, var5 + 1, var3, (byte)1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([F[I)V")
   @ObfuscatedName("bo")
   public static void method12734(float[] var0, int[] var1) {
      Actor.method3128(var0, var1, 0, var0.length - 1, 1893992943);
   }

   classXB() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([F[III)V")
   @ObfuscatedName("ba")
   static void method12736(float[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         float var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var0[var8] < var6) {
               float var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               int var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         Actor.method3128(var0, var1, var2, var5 - 1, 2139290213);
         Actor.method3128(var0, var1, var5 + 1, var3, 1911589379);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[JII)V")
   @ObfuscatedName("av")
   public static void method12722(String[] var0, long[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         long var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var6 == null || null != var0[var9] && var0[var9].compareTo(var6) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               long var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classKH.method6475(var0, var1, var2, var5 - 1, -1290261144);
         classKH.method6475(var0, var1, var5 + 1, var3, 1392852017);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[Ljava/lang/Object;II)V")
   @ObfuscatedName("bw")
   public static void method12738(int[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for (int var9 = var2; var9 < var3; var9++) {
            if (var0[var9] < var6 + (var9 & var8)) {
               int var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               Object var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         classAT.method693(var0, var1, var2, var5 - 1, (byte)-21);
         classAT.method693(var0, var1, var5 + 1, var3, (byte)-25);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([J[Ljava/lang/Object;II)V")
   @ObfuscatedName("bi")
   public static void method12741(long[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         long var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var8 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var8;
         int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

         for (int var10 = var2; var10 < var3; var10++) {
            if (var0[var10] < var6 + (var10 & var9)) {
               long var11 = var0[var10];
               var0[var10] = var0[var5];
               var0[var5] = var11;
               Object var13 = var1[var10];
               var1[var10] = var1[var5];
               var1[var5++] = var13;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var8;
         classTJ.method10873(var0, var1, var2, var5 - 1, (byte)4);
         classTJ.method10873(var0, var1, var5 + 1, var3, (byte)4);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([F[I)V")
   @ObfuscatedName("bu")
   public static void method12735(float[] var0, int[] var1) {
      Actor.method3128(var0, var1, 0, var0.length - 1, 1959678485);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[Ljava/lang/Object;II)V")
   @ObfuscatedName("bc")
   public static void method12726(String[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for (int var8 = var2; var8 < var3; var8++) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               Object var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         KeyHandler.method10835(var0, var1, var2, var5 - 1, 329455459);
         KeyHandler.method10835(var0, var1, var5 + 1, var3, -1551612321);
      }
   }
}
