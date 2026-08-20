import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jc")
public class classJC {
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("ac")
   public static final classJC field3128 = new classJC(17);
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("aj")
   public static final classJC field3131 = new classJC(7);
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("ae")
   public static final classJC field3123 = new classJC(37);
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("ag")
   public static final classJC field3125 = new classJC(24);
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("af")
   public static final classJC field3127 = new classJC(18);
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("aq")
   public static final classJC field3134 = new classJC(7);
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("ax")
   public static final classJC field3133 = new classJC(14);
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("as")
   public static final classJC field3124 = new classJC(14);
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("aa")
   public static final classJC field3129 = new classJC(11);
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("ao")
   public static final classJC field3130 = new classJC(2);
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("al")
   public static final classJC field3126 = new classJC(4);
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("ab")
   public static final classJC field3132 = new classJC(4);
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("ay")
   public static final classJC field3122 = new classJC(7);
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field3136 = 34;
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("ad")
   public static final classJC field3135 = new classJC(6);
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("az")
   public static final classJC field3121 = new classJC(-2);
   @ObfuscatedName("ix")
   static int field3137;

   @ObfuscatedSignature(descriptor = "(CII)Ljava/lang/String;")
   @ObfuscatedName("au")
   static String method6352(char var0, int var1, int var2) {
      try {
         char[] var3 = new char[var1];

         for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = var0;
         }

         return new String(var3);
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "jc.au(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ljc;")
   @ObfuscatedName("ag")
   public static classJC[] method6347() {
      return new classJC[]{
         field3121,
         field3127,
         field3123,
         field3132,
         field3125,
         field3124,
         field3133,
         field3128,
         field3129,
         field3130,
         field3126,
         field3131,
         field3122,
         field3134,
         field3135
      };
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ljc;")
   @ObfuscatedName("af")
   public static classJC[] method6348() {
      return new classJC[]{
         field3121,
         field3127,
         field3123,
         field3132,
         field3125,
         field3124,
         field3133,
         field3128,
         field3129,
         field3130,
         field3126,
         field3131,
         field3122,
         field3134,
         field3135
      };
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ljc;")
   @ObfuscatedName("ae")
   public static classJC[] method6349() {
      return new classJC[]{
         field3121,
         field3127,
         field3123,
         field3132,
         field3125,
         field3124,
         field3133,
         field3128,
         field3129,
         field3130,
         field3126,
         field3131,
         field3122,
         field3134,
         field3135
      };
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ljc;")
   @ObfuscatedName("ab")
   public static classJC[] method6350() {
      return new classJC[]{
         field3121,
         field3127,
         field3123,
         field3132,
         field3125,
         field3124,
         field3133,
         field3128,
         field3129,
         field3130,
         field3126,
         field3131,
         field3122,
         field3134,
         field3135
      };
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lff;[I[IIIIIIIIFFIIIIII)V")
   @ObfuscatedName("yd")
   public static void method6353(
      classFF var0,
      int[] var1,
      int[] var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17
   ) {
      if (var0 == null) {
         var0.method4674(var1, var3, var3, var3, var3, var3, var10, var10);
      }

      if (var0.field2378.field2211) {
         if (var7 > var0.field2378.field2227) {
            var7 = var0.field2378.field2227;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         var10 += var11 * var6;
         int var20 = var7 - var6;
         int var26 = var6 - var0.field2378.field2232;
         var12 += var15 * var26;
         var13 += var16 * var26;
         var14 += var17 * var26;
         int var25 = var14 >> 14;
         int var21;
         int var22;
         if (var25 != 0) {
            var21 = var12 / var25;
            var22 = var13 / var25;
         } else {
            var21 = 0;
            var22 = 0;
         }

         var12 += var15 * var20;
         var13 += var16 * var20;
         var14 += var17 * var20;
         var25 = var14 >> 14;
         int var23;
         int var24;
         if (var25 != 0) {
            var23 = var12 / var25;
            var24 = var13 / var25;
         } else {
            var23 = 0;
            var24 = 0;
         }

         var3 = (var21 << 18) + var22;
         int var19 = ((var23 - var21) / var20 << 18) + (var24 - var22) / var20;
         var20 >>= 3;
         var9 <<= 3;
         int var18 = var8 >> 8;
         if (var0.field2376) {
            while (var20-- > 0) {
               var0.method4640(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4640(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4640(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4640(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4640(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4640(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4640(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4640(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var82 = var7 - var6 & 7; var82-- > 0; var10 += var11) {
               var0.method4640(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         } else {
            while (var20-- > 0) {
               var0.method4644(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var0.method4644(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
               var10 += var11;
               var8 += var9;
               var18 = var8 >> 8;
            }

            for (int var81 = var7 - var6 & 7; var81-- > 0; var10 += var11) {
               var0.method4644(var1, classFF.field7103, var2, var5, var18, var3, var10);
               var5++;
               var3 += var19;
            }
         }
      }
   }

   classJC(int var1) {
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ag")
   static final boolean method6351(int var0, int var1) {
      try {
         if (var0 >= 61) {
            if (var1 == -581143508) {
               throw new IllegalStateException();
            }

            if (var0 <= 67) {
               if (var1 == -581143508) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "jc.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(ILoz;ILjava/lang/String;IIIIII)V")
   @ObfuscatedName("fs")
   static void method6354(int var0, classOZ var1, int var2, String var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         if (-1 != var0) {
            if (var9 != -1533141989) {
               throw new IllegalStateException();
            }

            classOZ var10 = var1.vmethod542(var2, -166157468);
            if (null != var10) {
               if (var9 != -1533141989) {
                  throw new IllegalStateException();
               }

               for (int var11 = var10.vmethod539((short)-18872); var11 >= 0; var11--) {
                  if (var9 != -1533141989) {
                     return;
                  }

                  int var12 = classLD.method6747(var11, var5, (byte)4);
                  String var13 = var10.vmethod551(var11, classLB.field4090, (byte)95);
                  if (var13 != null) {
                     classZO.method14078(var0, var13, var3, var4, var12, var6, var7, -1, var8, -1739941876);
                  }
               }
            }

            if (client.field822) {
               if (var9 != -1533141989) {
                  throw new IllegalStateException();
               }

               for (byte var15 = 1; var15 < 26; var15 += 5) {
                  if (var9 != -1533141989) {
                     throw new IllegalStateException();
                  }

                  int var16 = classLD.method6747(var15, var5, (byte)4);
                  String var17 = classQM.method9652(null, var15, (byte)-123);
                  classZO.method14078(var0, var17, var3, var4, var16, var6, var7, -1, var8, -1739941876);
               }
            }
         }
      } catch (RuntimeException var14) {
         throw classEG.newRunException(var14, "jc.fs(" + ')');
      }
   }
}
