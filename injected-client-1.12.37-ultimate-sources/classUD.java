import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ud")
public class classUD {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final float field6287 = 9.765625E-4F;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   public static final int field6289 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ct")
   static final int field6290 = 71;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field6288 = 12;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("aa")
   public static int method11263(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;
      if (var0 < var2) {
         var6 += var2 - var0;
      } else if (var0 > var4) {
         var6 += var0 - var4;
      }

      if (var1 < var3) {
         var6 += var3 - var1;
      } else if (var1 > var5) {
         var6 += var1 - var5;
      }

      return var6;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)I")
   @ObfuscatedName("ac")
   public static int method11264(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;
      if (var0 < var2) {
         var6 += var2 - var0;
      } else if (var0 > var4) {
         var6 += var0 - var4;
      }

      if (var1 < var3) {
         var6 += var3 - var1;
      } else if (var1 > var5) {
         var6 += var1 - var5;
      }

      return var6;
   }

   classUD() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(Laav;I)B")
   @ObfuscatedName("vt")
   public static byte method11268(classAAV var0, int var1) {
      if (var0 == null) {
         var0.method281(var1);
      }

      if (var1 < var0.field105) {
         return var0.field108;
      } else if (var1 >= var0.field104) {
         var0.field108 = var0.field106;
         return var0.field108;
      } else {
         int var2 = var0.field107 & 255;
         int var3 = var0.field106 & 255;
         float var4 = (float)(var1 - var0.field105) / (var0.field104 - var0.field105);
         var0.field108 = (byte)classLU.method7149(var2, var3, var4, 120041229);
         return var0.field108;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("ao")
   public static boolean method11265(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return !classAK.method402(var0, var1, var2, var3, var4, var5, (byte)-70) ? false : classAK.method402(var0, var1, var4, var5, var6, var7, (byte)-15);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("al")
   public static boolean method11266(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      return !classAK.method402(var0, var1, var2, var3, var4, var5, (byte)-43) ? false : classAK.method402(var0, var1, var4, var5, var6, var7, (byte)-1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ap")
   static int method11273(int var0, int var1, int var2, int var3) {
      return var0 * var2 + var1 * var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("ay")
   static boolean method11269(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var4 - var2;
      int var7 = var5 - var3;
      int var8 = var0 - var2;
      int var9 = var1 - var3;
      int var10 = classBY.method1358(var6, var7, var8, var9, (byte)2);
      int var11 = classBY.method1358(var6, var7, var6, var7, (byte)2);
      return 0 <= var10 && var10 <= var11;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("ak")
   public static boolean method11277(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      long var8 = classKV.method6568(var0, var1, var2, var3, -989935836);
      long var10 = classKV.method6568(var4, var5, var6, var7, -556186399);
      if (var10 == var8) {
         return false;
      } else {
         long var12 = ((long)var1 << 15) - var0 * var8;
         long var14 = ((long)var5 << 15) - var10 * var4;
         int var16 = -((int)((var12 - var14) / (var8 - var10)));
         if (Math.min(var0, var2) <= var16 && Math.max(var0, var2) >= var16 && Math.min(var4, var6) <= var16 && Math.max(var4, var6) >= var16) {
            long var17;
            if (Math.abs(var8) < Math.abs(var10)) {
               var17 = var12 + var16 * var8 >> 15;
            } else {
               var17 = var10 * var16 + var14 >> 15;
            }

            return Math.min(var1, var3) <= var17 && Math.max(var1, var3) >= var17 && Math.min(var5, var7) <= var17 && Math.max(var5, var7) >= var17;
         } else {
            return false;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("ad")
   static boolean method11270(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var4 - var2;
      int var7 = var5 - var3;
      int var8 = var0 - var2;
      int var9 = var1 - var3;
      int var10 = classBY.method1358(var6, var7, var8, var9, (byte)2);
      int var11 = classBY.method1358(var6, var7, var6, var7, (byte)2);
      return 0 <= var10 && var10 <= var11;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("aj")
   static boolean method11271(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var4 - var2;
      int var7 = var5 - var3;
      int var8 = var0 - var2;
      int var9 = var1 - var3;
      int var10 = classBY.method1358(var6, var7, var8, var9, (byte)2);
      int var11 = classBY.method1358(var6, var7, var6, var7, (byte)2);
      return 0 <= var10 && var10 <= var11;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("au")
   static int method11274(int var0, int var1, int var2, int var3) {
      return var0 * var2 + var1 * var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ai")
   static int method11275(int var0, int var1, int var2, int var3) {
      return var0 * var2 + var1 * var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)J")
   @ObfuscatedName("ar")
   static long method11276(int var0, int var1, int var2, int var3) {
      long var4 = 1073741824L;
      long var6 = -1073741824L;
      if (var2 != var0) {
         long var8 = var3 - var1;
         long var10 = (var8 << 15) / (var2 - var0);
         return Math.min(1073741824L, Math.max(-1073741824L, var10));
      } else {
         return var1 > var3 ? -1073741824L : 1073741824L;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)Z")
   @ObfuscatedName("aw")
   public static boolean method11278(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      long var8 = classKV.method6568(var0, var1, var2, var3, -674380440);
      long var10 = classKV.method6568(var4, var5, var6, var7, -1121857626);
      if (var10 == var8) {
         return false;
      } else {
         long var12 = ((long)var1 << 15) - var0 * var8;
         long var14 = ((long)var5 << 15) - var10 * var4;
         int var16 = -((int)((var12 - var14) / (var8 - var10)));
         if (Math.min(var0, var2) <= var16 && Math.max(var0, var2) >= var16 && Math.min(var4, var6) <= var16 && Math.max(var4, var6) >= var16) {
            long var17;
            if (Math.abs(var8) < Math.abs(var10)) {
               var17 = var12 + var16 * var8 >> 15;
            } else {
               var17 = var10 * var16 + var14 >> 15;
            }

            return Math.min(var1, var3) <= var17 && Math.max(var1, var3) >= var17 && Math.min(var5, var7) <= var17 && Math.max(var5, var7) >= var17;
         } else {
            return false;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgn;II)V")
   @ObfuscatedName("fs")
   public static void method11267(classGN var0, int var1, int var2) {
      if (var0 == null) {
         var0.method5532();
      }

      var0.field2630 = var1 * -1574930361;
      var0.field2631 = var2 * 2101118595;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIF)I")
   @ObfuscatedName("at")
   public static int method11279(int var0, int var1, float var2) {
      return (int)(var2 * (var1 - var0)) + var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIF)I")
   @ObfuscatedName("av")
   public static int method11280(int var0, int var1, float var2) {
      return (int)(var2 * (var1 - var0)) + var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)Z")
   @ObfuscatedName("aq")
   static boolean method11272(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var4 - var2;
      int var7 = var5 - var3;
      int var8 = var0 - var2;
      int var9 = var1 - var3;
      int var10 = classBY.method1358(var6, var7, var8, var9, (byte)2);
      int var11 = classBY.method1358(var6, var7, var6, var7, (byte)2);
      return 0 <= var10 && var10 <= var11;
   }
}
