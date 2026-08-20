import net.runelite.api.Rasterizer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fq")
public abstract class classFQ extends classYW {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field2381 = 3500;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field2380 = 210;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field2382 = 14;
   @ObfuscatedName("ax")
   static int field2374 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final float field2379 = 1.5F;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field2383 = 3;
   @ObfuscatedName("hc")
   public static final Rasterizer field2375 = new rl13();
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field2384 = 50;
   @ObfuscatedName("ac")
   boolean field2376 = false;
   @ObfuscatedName("aa")
   int[] field2377 = classFH.field2251;
   @ObfuscatedSignature(descriptor = "Lfd;")
   @ObfuscatedName("ao")
   classFD field2378;

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("bg")
   void method4942(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      byte var13 = this.field2378.field2215.field2303;
      if (var13 > 0) {
         byte var14 = this.field2378.field2215.field2300;
         byte var15 = this.field2378.field2215.field2301;
         byte var16 = this.field2378.field2215.field2302;
         var10 = method4920(var10, var14, var15, var16, var13);
         var11 = method4920(var11, var14, var15, var16, var13);
         var12 = method4920(var12, var14, var15, var16, var13);
      }

      this.vmethod452(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   @ObfuscatedSignature(descriptor = "(IBBBB)I")
   @ObfuscatedName("az")
   static int method4920(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += (var1 - var5) * var8 >> 7;
      }

      if (var2 != -1) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += (var3 - var7) * var8 >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & 65535;
   }

   @ObfuscatedSignature(descriptor = "(III[I[I)V")
   @ObfuscatedName("be")
   public static void method4949(int var0, int var1, int var2, int[] var3, int[] var4) {
      classYW.method13752(var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("eg")
   public static void method4950(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      classFH.method4762(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("uh")
   public static void method4951() {
      classYW.method13669();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("af")
   static final int method4925(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("aj")
   abstract void vmethod457(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22
   );

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("wk")
   public static void method4952(int var0, int var1, int var2, int var3) {
      classYW.method13671(var0, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   public static void method4953() {
      classFH.method4740();
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("qv")
   public static void method4954(int var0, int var1, int var2, int var3, int var4) {
      classYW.method13698(var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ag")
   public static void method4936(int var0) {
      int var1 = var0 * 210;
      method4933(var1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bc")
   abstract boolean vmethod449();

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ey")
   public boolean method4955() {
      return this.vmethod449();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   static final int method4929() {
      return field2374;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("at")
   static void method4931(int var0) {
      field2374 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("am")
   static void method4932(int var0) {
      field2374 = var0;
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("ao")
   abstract void vmethod452(
      float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12
   );

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("al")
   abstract void vmethod455(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10);

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ft")
   public static void method4956(int var0, int var1, int var2, int var3, int var4) {
      classYW.method13732(var0, var1, var2, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("bn")
   public static void method4937(int var0) {
      int var1 = var0 * 210;
      method4933(var1);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ns")
   public static void method4957(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      classYW.method13765(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ab")
   static void method4933(int var0) {
      field2374 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IBBBB)I")
   @ObfuscatedName("aq")
   static int method4921(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += (var1 - var5) * var8 >> 7;
      }

      if (var2 != -1) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += (var3 - var7) * var8 >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & 65535;
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("xq")
   public static void method4958(int var0, int var1, int var2, int var3, int var4, int var5) {
      classYW.method13711(var0, var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "([III[F)V")
   @ObfuscatedName("bp")
   void method4939(int[] var1, int var2, int var3, float[] var4) {
      method13662(var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ta")
   public static void method4959(int var0, int var1, int var2, int var3) {
      classYW.method13723(var0, var1, var2, var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IBBBB)I")
   @ObfuscatedName("ap")
   static int method4922(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 1265869542;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & -1237119813;
      if (var1 != -1) {
         var5 += (var1 - var5) * var8 >> 7;
      }

      if (var2 != -1) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += (var3 - var7) * var8 >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & 65535;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("vd")
   public static void method4960(int var0, int var1, int var2, int var3, int var4) {
      classYW.method13726(var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ue")
   public static void method4948() {
      classWO.field6763.method13322();
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ow")
   public static void method4961(int var0, int var1, int var2, int var3, int var4, int var5) {
      classYW.method13694(var0, var1, var2, var3, var4, var5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IBBBB)I")
   @ObfuscatedName("au")
   static int method4923(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += (var1 - var5) * var8 >> 7;
      }

      if (var2 != -1) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += (var3 - var7) * var8 >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & 65535;
   }

   @ObfuscatedSignature(descriptor = "(F)F")
   @ObfuscatedName("pi")
   public static float method4947(float var0) {
      var0 = (var0 - 75.0F) * 1.0100503F;
      return 1.0100503F + 150.75377F / var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ai")
   static final int method4926(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ar")
   static final int method4927(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 65408) + var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfq;FFFFFFFFFIII)V")
   @ObfuscatedName("ja")
   public static void method4943(
      classFQ var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12
   ) {
      byte var13 = var0.field2378.field2215.field2303;
      if (var13 > 0) {
         byte var14 = var0.field2378.field2215.field2300;
         byte var15 = var0.field2378.field2215.field2301;
         byte var16 = var0.field2378.field2215.field2302;
         var10 = method4920(var10, var14, var15, var16, var13);
         var11 = method4920(var11, var14, var15, var16, var13);
         var12 = method4920(var12, var14, var15, var16, var13);
      }

      var0.vmethod452(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aw")
   static final int method4928(int var0, int var1) {
      var1 = var1 * (var0 & 1825587246) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 356556254) {
         var1 = 1360573921;
      }

      return (var0 & 65408) + var1;
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("bm")
   void method4944(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      byte var13 = this.field2378.field2215.field2303;
      if (var13 > 0) {
         byte var14 = this.field2378.field2215.field2300;
         byte var15 = this.field2378.field2215.field2301;
         byte var16 = this.field2378.field2215.field2302;
         var10 = method4920(var10, var14, var15, var16, var13);
         var11 = method4920(var11, var14, var15, var16, var13);
         var12 = method4920(var12, var14, var15, var16, var13);
      }

      this.vmethod452(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   static void method4934(int var0) {
      field2374 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IBBBB)I")
   @ObfuscatedName("ad")
   static int method4924(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += (var1 - var5) * var8 >> 7;
      }

      if (var2 != -1) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += (var3 - var7) * var8 >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & 65535;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   static void method4935(int var0) {
      field2374 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   static final int method4930() {
      return field2374;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ah")
   public static void method4938(int var0) {
      int var1 = var0 * -1783356637;
      method4933(var1);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("od")
   public static void method4962(
      float var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21
   ) {
      classFH.method4769(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   @ObfuscatedSignature(descriptor = "([III[F)V")
   @ObfuscatedName("ax")
   void method4940(int[] var1, int var2, int var3, float[] var4) {
      method13662(var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("aa")
   void method4946(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      byte var11 = this.field2378.field2215.field2303;
      if (var11 > 0) {
         int var12 = method4920(
            var10,
            this.field2378.field2215.field2300,
            this.field2378.field2215.field2301,
            this.field2378.field2215.field2302,
            this.field2378.field2215.field2303
         );
         var10 = this.field2377[var12];
      }

      this.vmethod455(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("ey")
   public static void method4963(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      classFH.method4758(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bx")
   abstract boolean vmethod450();

   classFQ(classFD var1) {
      this.field2378 = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("kh")
   public static void method4964(int var0, int var1, int var2, int var3) {
      classYW.method13717(var0, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "([III[F)V")
   @ObfuscatedName("br")
   void method4941(int[] var1, int var2, int var3, float[] var4) {
      method13662(var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bw")
   abstract void vmethod458(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22
   );

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("bu")
   abstract void vmethod456(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10);

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("ac")
   void method4945(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      byte var13 = this.field2378.field2215.field2303;
      if (var13 > 0) {
         byte var14 = this.field2378.field2215.field2300;
         byte var15 = this.field2378.field2215.field2301;
         byte var16 = this.field2378.field2215.field2302;
         var10 = method4920(var10, var14, var15, var16, var13);
         var11 = method4920(var11, var14, var15, var16, var13);
         var12 = method4920(var12, var14, var15, var16, var13);
      }

      this.vmethod452(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("bk")
   abstract void vmethod453(
      float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12
   );

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("lv")
   public static void method4965(int var0, int var1, int var2, int var3, int var4) {
      classYW.method13689(var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("bo")
   abstract void vmethod454(
      float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12
   );

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("dm")
   public static void method4966(int var0, int var1, int var2, int var3, int var4) {
      classYW.method13722(var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("bm")
   public static void method4967(int var0, int var1, int var2, int var3, int var4) {
      classYW.method13707(var0, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   abstract boolean vmethod451();

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("ba")
   abstract void vmethod459(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22
   );

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("ay")
   abstract void vmethod460(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22
   );

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bb")
   abstract void vmethod461(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22
   );

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("bi")
   abstract void vmethod462(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21,
      int var22
   );
}
