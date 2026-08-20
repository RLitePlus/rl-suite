import net.runelite.api.Perspective;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fh")
public class classFH {
   @ObfuscatedSignature(descriptor = "Lfq;")
   @ObfuscatedName("az")
   static final classFQ field2260;
   @ObfuscatedSignature(descriptor = "Lfq;")
   @ObfuscatedName("af")
   static final classFQ field2258;
   @ObfuscatedName("ae")
   public static int[] field2251 = new int[65536];
   @ObfuscatedName("ab")
   static int[] field2256 = new int[512];
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field2264 = 254;
   @ObfuscatedName("as")
   public static int[] field2253 = new int[2048];
   @ObfuscatedName("ax")
   public static int[] field2254 = new int[2048];
   @ObfuscatedName("ac")
   static float[] field2255 = new float[2048];
   @ObfuscatedName("aa")
   static float[] field2259 = new float[2048];
   @ObfuscatedSignature(descriptor = "Lfd;")
   @ObfuscatedName("ao")
   public static classFD field2257;
   @ObfuscatedSignature(descriptor = "Lfq;")
   @ObfuscatedName("aj")
   static classFQ field2261;
   @ObfuscatedName("ag")
   static int[] field2252 = new int[2048];
   @ObfuscatedName("al")
   static double field2262;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field2263 = 253;

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("ak")
   static void method4758(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      field2261.vmethod452(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("az")
   public static void method4684(boolean var0) {
      if (var0 && classYW.field7103 != null) {
         field2261 = field2258;
      } else {
         field2261 = field2260;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfg;)V")
   @ObfuscatedName("bp")
   public static void method4688(classFG var0) {
      field2257.field2239 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("bt")
   public static void method4692(double var0) {
      method4696(var0, 0, 512);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dd")
   public static void method4755(int var0, int var1) {
      int var2 = field2257.field2214[0];
      int var3 = var2 / classYW.field7102;
      int var4 = var2 - var3 * classYW.field7102;
      classFD.method4597(field2257, var0, var4, var1, var3);
   }

   @ObfuscatedSignature(descriptor = "(ID)I")
   @ObfuscatedName("ag")
   static int method4698(int var0, double var1) {
      double var3 = (var0 >> 16) / 256.0;
      double var5 = (var0 >> 8 & 0xFF) / 256.0;
      double var7 = (var0 & 0xFF) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(var7 * 256.0);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("as")
   public static double method4702() {
      return field2262;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   static int method4705() {
      return field2257.field2232;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   static int method4710() {
      return field2257.field2235;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   static int method4712() {
      return field2257.field2233;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   static int method4716() {
      return field2257.field2230;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   static int method4720() {
      return field2257.field2226;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cu")
   static int method4722() {
      return field2257.field2229;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   public static int method4727() {
      return field2257.field2209;
   }

   @ObfuscatedSignature(descriptor = "(Lfg;)V")
   @ObfuscatedName("af")
   public static void method4689(classFG var0) {
      field2257.field2239 = var0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ad")
   static boolean method4735() {
      return field2261.vmethod449();
   }

   @ObfuscatedSignature(descriptor = "([III[F)V")
   @ObfuscatedName("ap")
   public static void method4738(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && field2261 == field2258) {
         field2261 = field2260;
      }

      field2261.method4940(var0, var1, var2, var3);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   public static void method4740() {
      method4744(classYW.field7097, classYW.field7096, classYW.field7099, classYW.field7098);
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ai")
   static void method4744(int var0, int var1, int var2, int var3) {
      field2257.field2227 = var2 - var0;
      field2257.field2234 = var3 - var1;
      method4754();
      if (field2257.field2214.length < field2257.field2234) {
         field2257.field2214 = new int[classBZ.method1385(field2257.field2234, -1302004563)];
      }

      int var4 = var1 * classYW.field7102 + var0;

      for (int var5 = 0; var5 < field2257.field2234; var5++) {
         field2257.field2214[var5] = var4;
         var4 += classYW.field7102;
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("an")
   static void method4769(
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
      field2261.vmethod460(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("aw")
   public static void method4756(int var0, int var1) {
      int var2 = field2257.field2214[0];
      int var3 = var2 / classYW.field7102;
      int var4 = var2 - var3 * classYW.field7102;
      classFD.method4597(field2257, var0, var4, var1, var3);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("ah")
   static void method4773(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      field2261.method4946(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("av")
   static void method4762(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      field2261.vmethod455(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("at")
   static void method4767(
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
      field2261.vmethod457(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cp")
   static int method4723() {
      return field2257.field2229;
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("am")
   static void method4772(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      field2261.method4944(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("de")
   static void method4774(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      field2261.method4946(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   static {
      for (int var0 = 1; var0 < 512; var0++) {
         field2256[var0] = 32768 / var0;
      }

      for (int var5 = 1; var5 < field2252.length; var5++) {
         field2252[var5] = 65536 / var5;
      }

      for (int var6 = 0; var6 < 2048; var6++) {
         double var1 = Math.sin(var6 * 0.0030679615);
         double var3 = Math.cos(var6 * 0.0030679615);
         field2253[var6] = (int)(65536.0 * var1);
         field2254[var6] = (int)(65536.0 * var3);
         field2255[var6] = (float)var1;
         field2259[var6] = (float)var3;
      }

      field2257 = new classFD();
      field2260 = new classFT(field2257);
      field2258 = new classFF(field2257);
      field2261 = field2260;
      field2253 = Perspective.SINE;
      field2254 = Perspective.COSINE;
      field2255 = Perspective.SINEF;
      field2259 = Perspective.COSINEF;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   static int method4731() {
      return field2257.field2227;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bx")
   public static void method4685(boolean var0) {
      if (var0 && classYW.field7103 != null) {
         field2261 = field2258;
      } else {
         field2261 = field2260;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bc")
   public static void method4686(boolean var0) {
      if (var0 && classYW.field7103 != null) {
         field2261 = field2258;
      } else {
         field2261 = field2260;
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   static int method4724() {
      return field2257.field2229;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(DII)V")
   @ObfuscatedName("bk")
   static void method4695(double var0, int var2, int var3) {
      field2262 = var0;
      int var4 = var2 * 128;

      for (int var5 = var2; var5 < var3; var5++) {
         double var6 = (var5 >> 3) / 64.0 + 0.0078125;
         double var8 = (var5 & 7) / 8.0 + 0.0625;

         for (int var10 = 0; var10 < 128; var10++) {
            double var11 = var10 / 128.0;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0) {
               double var19;
               if (var11 < 0.5) {
                  var19 = var11 * (1.0 + var8);
               } else {
                  var19 = var11 + var8 - var11 * var8;
               }

               double var21 = 2.0 * var11 - var19;
               double var23 = var6 + 0.3333333333333333;
               if (var23 > 1.0) {
                  var23--;
               }

               double var27 = var6 - 0.3333333333333333;
               if (var27 < 0.0) {
                  var27++;
               }

               if (6.0 * var23 < 1.0) {
                  var13 = var21 + (var19 - var21) * 6.0 * var23;
               } else if (2.0 * var23 < 1.0) {
                  var13 = var19;
               } else if (3.0 * var23 < 2.0) {
                  var13 = var21 + (var19 - var21) * (0.6666666666666666 - var23) * 6.0;
               } else {
                  var13 = var21;
               }

               if (6.0 * var6 < 1.0) {
                  var15 = var21 + (var19 - var21) * 6.0 * var6;
               } else if (2.0 * var6 < 1.0) {
                  var15 = var19;
               } else if (3.0 * var6 < 2.0) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666 - var6) * 6.0;
               } else {
                  var15 = var21;
               }

               if (6.0 * var27 < 1.0) {
                  var17 = var21 + (var19 - var21) * 6.0 * var27;
               } else if (2.0 * var27 < 1.0) {
                  var17 = var19;
               } else if (3.0 * var27 < 2.0) {
                  var17 = var21 + (var19 - var21) * (0.6666666666666666 - var27) * 6.0;
               } else {
                  var17 = var21;
               }
            }

            int var29 = (int)(var13 * 256.0);
            int var20 = (int)(var15 * 256.0);
            int var30 = (int)(var17 * 256.0);
            int var22 = (var29 << 16) + (var20 << 8) + var30;
            var22 = method4698(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            field2251[var4++] = var22;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfg;)V")
   @ObfuscatedName("bm")
   public static void method4690(classFG var0) {
      field2257.field2239 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ch")
   static void method4745(int var0, int var1, int var2, int var3) {
      field2257.field2227 = var2 - var0;
      field2257.field2234 = var3 - var1;
      method4754();
      if (field2257.field2214.length < field2257.field2234) {
         field2257.field2214 = new int[classBZ.method1385(field2257.field2234, 1402450308)];
      }

      int var4 = var1 * classYW.field7102 + var0;

      for (int var5 = 0; var5 < field2257.field2234; var5++) {
         field2257.field2214[var5] = var4;
         var4 += classYW.field7102;
      }
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("bg")
   public static void method4693(double var0) {
      method4696(var0, 0, 512);
   }

   @ObfuscatedSignature(descriptor = "(DII)V")
   @ObfuscatedName("ab")
   static void method4696(double var0, int var2, int var3) {
      field2262 = var0;
      int var4 = var2 * 128;

      for (int var5 = var2; var5 < var3; var5++) {
         double var6 = (var5 >> 3) / 64.0 + 0.0078125;
         double var8 = (var5 & 7) / 8.0 + 0.0625;

         for (int var10 = 0; var10 < 128; var10++) {
            double var11 = var10 / 128.0;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0) {
               double var19;
               if (var11 < 0.5) {
                  var19 = var11 * (1.0 + var8);
               } else {
                  var19 = var11 + var8 - var11 * var8;
               }

               double var21 = 2.0 * var11 - var19;
               double var23 = var6 + 0.3333333333333333;
               if (var23 > 1.0) {
                  var23--;
               }

               double var27 = var6 - 0.3333333333333333;
               if (var27 < 0.0) {
                  var27++;
               }

               if (6.0 * var23 < 1.0) {
                  var13 = var21 + (var19 - var21) * 6.0 * var23;
               } else if (2.0 * var23 < 1.0) {
                  var13 = var19;
               } else if (3.0 * var23 < 2.0) {
                  var13 = var21 + (var19 - var21) * (0.6666666666666666 - var23) * 6.0;
               } else {
                  var13 = var21;
               }

               if (6.0 * var6 < 1.0) {
                  var15 = var21 + (var19 - var21) * 6.0 * var6;
               } else if (2.0 * var6 < 1.0) {
                  var15 = var19;
               } else if (3.0 * var6 < 2.0) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666 - var6) * 6.0;
               } else {
                  var15 = var21;
               }

               if (6.0 * var27 < 1.0) {
                  var17 = var21 + (var19 - var21) * 6.0 * var27;
               } else if (2.0 * var27 < 1.0) {
                  var17 = var19;
               } else if (3.0 * var27 < 2.0) {
                  var17 = var21 + (var19 - var21) * (0.6666666666666666 - var27) * 6.0;
               } else {
                  var17 = var21;
               }
            }

            int var29 = (int)(var13 * 256.0);
            int var20 = (int)(var15 * 256.0);
            int var30 = (int)(var17 * 256.0);
            int var22 = (var29 << 16) + (var20 << 8) + var30;
            var22 = method4698(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            field2251[var4++] = var22;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("dw")
   static void method4770(
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
      field2261.vmethod460(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ID)I")
   @ObfuscatedName("bo")
   static int method4699(int var0, double var1) {
      double var3 = (var0 >> 16) / 256.0;
      double var5 = (var0 >> 8 & -1222517291) / 256.0;
      double var7 = (var0 & 0xFF) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(var7 * 256.0);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ID)I")
   @ObfuscatedName("bu")
   static int method4700(int var0, double var1) {
      double var3 = (var0 >> 16) / 256.0;
      double var5 = (var0 >> 8 & 0xFF) / 256.0;
      double var7 = (var0 & 0xFF) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(var7 * 256.0);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cv")
   static int method4732() {
      return field2257.field2227;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("bw")
   public static double method4703() {
      return field2262;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cm")
   public static void method4750() {
      classFD.method4593(field2257);
   }

   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("bb")
   public static double method4704() {
      return field2262;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("be")
   static int method4706() {
      return field2257.field2232;
   }

   classFH() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("co")
   static boolean method4736() {
      return field2261.vmethod449();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bf")
   static int method4711() {
      return field2257.field2235;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   static int method4713() {
      return field2257.field2233;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bd")
   static int method4714() {
      return field2257.field2233;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bl")
   static int method4715() {
      return field2257.field2233;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bv")
   static int method4717() {
      return field2257.field2230;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bh")
   static int method4718() {
      return field2257.field2230;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bz")
   static int method4719() {
      return field2257.field2230;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("cz")
   static void method4746(int var0, int var1, int var2, int var3) {
      field2257.field2227 = var2 - var0;
      field2257.field2234 = var3 - var1;
      method4754();
      if (field2257.field2214.length < field2257.field2234) {
         field2257.field2214 = new int[classBZ.method1385(field2257.field2234, -195760272)];
      }

      int var4 = var1 * classYW.field7102 + var0;

      for (int var5 = 0; var5 < field2257.field2234; var5++) {
         field2257.field2214[var5] = var4;
         var4 += classYW.field7102;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("dc")
   public static void method4757(int var0, int var1) {
      int var2 = field2257.field2214[0];
      int var3 = var2 / classYW.field7102;
      int var4 = var2 - var3 * classYW.field7102;
      classFD.method4597(field2257, var0, var4, var1, var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cb")
   static int method4725() {
      return field2257.field2229;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cs")
   static int method4733() {
      return field2257.field2227;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ci")
   public static void method4751() {
      classFD.method4593(field2257);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cq")
   public static int method4728() {
      return field2257.field2209;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cl")
   public static int method4729() {
      return field2257.field2209;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cd")
   public static int method4730() {
      return field2257.field2209;
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("ae")
   public static void method4694(double var0) {
      method4696(var0, 0, 512);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("dr")
   static void method4763(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      field2261.vmethod455(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bq")
   static int method4707() {
      return field2257.field2232;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bn")
   public static void method4687(boolean var0) {
      if (var0 && classYW.field7103 != null) {
         field2261 = field2258;
      } else {
         field2261 = field2260;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ck")
   static boolean method4737() {
      return field2261.vmethod449();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([III[F)V")
   @ObfuscatedName("ca")
   public static void method4739(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && field2261 == field2258) {
         field2261 = field2260;
      }

      field2261.method4940(var0, var1, var2, var3);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cc")
   public static void method4741() {
      method4744(classYW.field7097, classYW.field7096, classYW.field7099, classYW.field7098);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cf")
   public static void method4742() {
      method4744(classYW.field7097, classYW.field7096, classYW.field7099, classYW.field7098);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cn")
   public static void method4743() {
      method4744(classYW.field7097, classYW.field7096, classYW.field7099, classYW.field7098);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("by")
   static int method4708() {
      return field2257.field2232;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ID)I")
   @ObfuscatedName("ba")
   static int method4701(int var0, double var1) {
      double var3 = (var0 >> 16) / 256.0;
      double var5 = (var0 >> 8 & 993066255) / 256.0;
      double var7 = (var0 & 398615773) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(var7 * 256.0);
      return (var9 << 16) + (var10 << 8) + var11;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("cg")
   static void method4747(int var0, int var1, int var2, int var3) {
      field2257.field2227 = var2 - var0;
      field2257.field2234 = var3 - var1;
      method4754();
      if (field2257.field2214.length < field2257.field2234) {
         field2257.field2214 = new int[classBZ.method1385(field2257.field2234, -393870383)];
      }

      int var4 = var1 * classYW.field7102 + var0;

      for (int var5 = 0; var5 < field2257.field2234; var5++) {
         field2257.field2214[var5] = var4;
         var4 += classYW.field7102;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ct")
   static int method4726() {
      return field2257.field2229;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("cj")
   static void method4748(int var0, int var1, int var2, int var3) {
      field2257.field2227 = var2 - var0;
      field2257.field2234 = var3 - var1;
      method4754();
      if (field2257.field2214.length < field2257.field2234) {
         field2257.field2214 = new int[classBZ.method1385(field2257.field2234, -1593368818)];
      }

      int var4 = var1 * classYW.field7102 + var0;

      for (int var5 = 0; var5 < field2257.field2234; var5++) {
         field2257.field2214[var5] = var4;
         var4 += classYW.field7102;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bi")
   static int method4709() {
      return field2257.field2232;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cx")
   public static void method4752() {
      classFD.method4593(field2257);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ce")
   public static void method4753() {
      classFD.method4593(field2257);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfg;)V")
   @ObfuscatedName("br")
   public static void method4691(classFG var0) {
      field2257.field2239 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(DII)V")
   @ObfuscatedName("bj")
   static void method4697(double var0, int var2, int var3) {
      field2262 = var0;
      int var4 = var2 * -612406923;

      for (int var5 = var2; var5 < var3; var5++) {
         double var6 = (var5 >> 3) / 64.0 + 0.0078125;
         double var8 = (var5 & 7) / 8.0 + 0.0625;

         for (int var10 = 0; var10 < 128; var10++) {
            double var11 = var10 / 128.0;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0) {
               double var19;
               if (var11 < 0.5) {
                  var19 = var11 * (1.0 + var8);
               } else {
                  var19 = var11 + var8 - var11 * var8;
               }

               double var21 = 2.0 * var11 - var19;
               double var23 = var6 + 0.3333333333333333;
               if (var23 > 1.0) {
                  var23--;
               }

               double var27 = var6 - 0.3333333333333333;
               if (var27 < 0.0) {
                  var27++;
               }

               if (6.0 * var23 < 1.0) {
                  var13 = var21 + (var19 - var21) * 6.0 * var23;
               } else if (2.0 * var23 < 1.0) {
                  var13 = var19;
               } else if (3.0 * var23 < 2.0) {
                  var13 = var21 + (var19 - var21) * (0.6666666666666666 - var23) * 6.0;
               } else {
                  var13 = var21;
               }

               if (6.0 * var6 < 1.0) {
                  var15 = var21 + (var19 - var21) * 6.0 * var6;
               } else if (2.0 * var6 < 1.0) {
                  var15 = var19;
               } else if (3.0 * var6 < 2.0) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666 - var6) * 6.0;
               } else {
                  var15 = var21;
               }

               if (6.0 * var27 < 1.0) {
                  var17 = var21 + (var19 - var21) * 6.0 * var27;
               } else if (2.0 * var27 < 1.0) {
                  var17 = var19;
               } else if (3.0 * var27 < 2.0) {
                  var17 = var21 + (var19 - var21) * (0.6666666666666666 - var27) * 6.0;
               } else {
                  var17 = var21;
               }
            }

            int var29 = (int)(var13 * 256.0);
            int var20 = (int)(var15 * 256.0);
            int var30 = (int)(var17 * 256.0);
            int var22 = (var29 << 16) + (var20 << 8) + var30;
            var22 = method4698(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            field2251[var4++] = var22;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ar")
   public static void method4754() {
      classFD.method4593(field2257);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("dm")
   static void method4759(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      field2261.vmethod452(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("dx")
   static void method4760(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      field2261.vmethod452(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIII)V")
   @ObfuscatedName("dy")
   static void method4761(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11
   ) {
      field2261.vmethod452(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("di")
   static void method4764(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      field2261.vmethod455(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("du")
   static void method4765(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      field2261.vmethod455(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("dt")
   static void method4766(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      field2261.vmethod455(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cy")
   static int method4734() {
      return field2257.field2227;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("dk")
   static void method4768(
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
      field2261.vmethod457(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFIIIIIIIIIIIII)V")
   @ObfuscatedName("db")
   static void method4771(
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
      field2261.vmethod460(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21
      );
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("cr")
   static int method4721() {
      return field2257.field2226;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("dh")
   static void method4775(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      field2261.method4946(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("cw")
   static void method4749(int var0, int var1, int var2, int var3) {
      field2257.field2227 = var2 - var0;
      field2257.field2234 = var3 - var1;
      method4754();
      if (field2257.field2214.length < field2257.field2234) {
         field2257.field2214 = new int[classBZ.method1385(field2257.field2234, 667682975)];
      }

      int var4 = var1 * classYW.field7102 + var0;

      for (int var5 = 0; var5 < field2257.field2234; var5++) {
         field2257.field2214[var5] = var4;
         var4 += classYW.field7102;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFFFFFFI)V")
   @ObfuscatedName("dz")
   static void method4776(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      field2261.method4946(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }
}
