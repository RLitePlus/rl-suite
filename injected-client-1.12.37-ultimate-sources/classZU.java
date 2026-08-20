import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("zu")
public class classZU extends classVJ {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field7276 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field7275 = 255;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ae")
   static classVA field7277;
   @ObfuscatedSignature(descriptor = "Ljz;")
   @ObfuscatedName("ab")
   static classJZ field7271 = new classJZ(64);
   @ObfuscatedName("ag")
   public final int[][] field7274;
   @ObfuscatedName("as")
   public final Object[][] field7272;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field7273 = 4;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lop;Lpi;)Lfx;")
   @ObfuscatedName("vf")
   public static classFX method14207(classOP var0, classPI var1) {
      if (var0 == null) {
         var0.method8699();
      }

      classFX var2 = var1.field5268;
      if (var2 != null) {
         return var2;
      } else {
         classER var3 = classER.method4047(classGU.field2702, 1320690989 * var1.field5263, 0);
         if (null == var3) {
            return null;
         } else {
            if (128 != -1567835707 * var0.field5023 || -1367777757 * var0.field5059 != 128 || 128 != var0.field5027 * 58165945) {
               var3.method4035(var0.field5023 * -1567835707, var0.field5059 * -1367777757, var0.field5027 * 58165945);
            }

            var0.method8686(var3, var1, -2062266506);
            var2 = var3.method4045(1845819663 * var0.field5060 + 64, 768 + var0.field5030 * -1636300529, -50, -10, -50);
            var2.field2421 = true;
            var1.field5268 = var2;
            return var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()[[Ljava/lang/Object;")
   @ObfuscatedName("kw")
   public Object[][] method14208() {
      return this.field7272;
   }

   @ObfuscatedSignature(descriptor = "()[[I")
   @ObfuscatedName("ss")
   public int[][] method14209() {
      return this.field7274;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ao")
   public static void method14204() {
      classJZ.method6431(field7271);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ab")
   public static void method14198(classVA var0) {
      field7277 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("al")
   public static void method14205() {
      classJZ.method6431(field7271);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("as")
   public static void method14199(classVA var0) {
      field7277 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ax")
   public static void method14200(classVA var0) {
      field7277 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lzu;")
   @ObfuscatedName("ac")
   public static classZU method14202(int var0) {
      classZU var1 = (classZU)field7271.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field7277.method11867(-1466087862, var0, -644551988);
         var1 = new classZU(new classXY(var2), var0, -1);
         field7271.method6428(var1, var0);
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lzu;")
   @ObfuscatedName("aa")
   public static classZU method14203(int var0) {
      classZU var1 = (classZU)field7271.method6422(var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = field7277.method11867(39, var0, -1938956184);
         var1 = new classZU(new classXY(var2), var0, -1);
         field7271.method6428(var1, var0);
         return var1;
      }
   }

   classZU(classXY var1, int var2, int var3) {
      int[][] var4 = (int[][])null;
      Object[][] var5 = (Object[][])null;
      if (null != var1 && null != var1.field6954) {
         label106:
         while (true) {
            int var6 = classXY.method13039(var1, -346779531);
            switch (var6) {
               case 0:
                  break label106;
               case 1:
                  int var7 = Math.max(classXY.method13039(var1, -346779531), var3);
                  var4 = new int[var7][];
                  Object[][] var9 = var5;

                  for (int var10 = classXY.method13039(var1, -346779531); 255 != var10; var10 = classXY.method13039(var1, -346779531)) {
                     int var11 = var10 & 127;
                     boolean var12 = 0 != (var10 & 128);
                     int[] var13 = new int[classXY.method13039(var1, -346779531)];

                     for (int var14 = 0; var14 < var13.length; var14++) {
                        var13[var14] = var1.method13094((short)26360);
                     }

                     var4[var11] = var13;
                     if (var12) {
                        if (null == var9) {
                           var9 = new Object[var4.length][];
                        }

                        int var17 = var1.method13094((short)32343);
                        Object[] var18 = new Object[var13.length * var17];

                        for (int var19 = 0; var19 < var17; var19++) {
                           for (int var20 = 0; var20 < var13.length; var20++) {
                              int var21 = var20 + var19 * var13.length;
                              classYY var22 = classRN.method10130(var13[var20], 447096713);
                              var18[var21] = var22.method13787(var1, 827988912);
                           }
                        }

                        var9[var11] = var18;
                     }
                  }

                  var5 = var9;
            }
         }
      }

      if (null == var4 && var3 >= 0) {
         var4 = new int[var3][];
      }

      if (null == var5 && var3 >= 0) {
         var5 = new Object[var3][];
      }

      this.field7274 = var4;
      this.field7272 = var5;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqc;Z)V")
   @ObfuscatedName("tc")
   public static void method14206(classQC var0, boolean var1) {
      if (var0 == null) {
         var0.method9466(var1);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lva;)V")
   @ObfuscatedName("ag")
   public static void method14201(classVA var0) {
      field7277 = var0;
   }
}
