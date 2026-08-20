import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("br")
public class classBR {
   @ObfuscatedName("as")
   static int[][] field533 = new int[2][8];
   @ObfuscatedName("al")
   int[][][] field535;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field543 = 4;
   @ObfuscatedName("ao")
   int[][][] field534;
   @ObfuscatedName("ag")
   static float[][] field532 = new float[2][8];
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final float field538 = 32.703197F;
   @ObfuscatedName("ax")
   static float field541;
   @ObfuscatedName("ac")
   static int field542;
   @ObfuscatedName("aa")
   int[] field537 = new int[2];
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final float field540 = 100.0F;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final float field539 = 8.0F;
   @ObfuscatedName("aj")
   int[] field536;

   @ObfuscatedSignature(descriptor = "(Lxy;Laq;)V")
   @ObfuscatedName("aw")
   final void method1197(classXY var1, classAQ var2) {
      int var3 = classXY.method13039(var1, -346779531);
      this.field537[0] = var3 >> 4;
      this.field537[1] = var3 & 15;
      if (var3 != 0) {
         this.field536[0] = classXY.method13047(var1, -120821262);
         this.field536[1] = classXY.method13047(var1, -1050428271);
         int var4 = classXY.method13039(var1, -346779531);

         for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field537[var5]; var6++) {
               this.field534[var5][0][var6] = classXY.method13047(var1, 745889330);
               this.field535[var5][0][var6] = classXY.method13047(var1, 1039437292);
            }
         }

         for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field537[var8]; var9++) {
               if ((var4 & 1 << var8 * 4 << var9) != 0) {
                  this.field534[var8][1][var9] = classXY.method13047(var1, 600275122);
                  this.field535[var8][1][var9] = classXY.method13047(var1, 191312679);
               } else {
                  this.field534[var8][1][var9] = this.field534[var8][0][var9];
                  this.field535[var8][1][var9] = this.field535[var8][0][var9];
               }
            }
         }

         if (var4 != 0 || this.field536[1] != this.field536[0]) {
            var2.method651(var1);
         }
      } else {
         int[] var7 = this.field536;
         this.field536[1] = 0;
         var7[0] = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIF)F")
   @ObfuscatedName("al")
   float method1184(int var1, int var2, float var3) {
      float var4 = this.field535[var1][0][var2] + var3 * (this.field535[var1][1][var2] - this.field535[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, -var4 / 20.0F);
   }

   @ObfuscatedSignature(descriptor = "(IIFI)F")
   @ObfuscatedName("ae")
   float method1188(int var1, int var2, float var3, int var4) {
      float var5 = this.field534[var1][0][var2] + var3 * (this.field534[var1][1][var2] - this.field534[var1][0][var2]);
      var5 *= 1.2207031E-4F;
      return method1183(var5, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FI)F")
   @ObfuscatedName("as")
   static float method1179(float var0, int var1) {
      float var2 = 32.703197F * (float)Math.pow(2.0, var0);
      return var2 * (float) Math.PI / (var1 / 2);
   }

   @ObfuscatedSignature(descriptor = "(IIFI)F")
   @ObfuscatedName("aq")
   float method1189(int var1, int var2, float var3, int var4) {
      float var5 = this.field534[var1][0][var2] + var3 * (this.field534[var1][1][var2] - this.field534[var1][0][var2]);
      var5 *= 1.2207031E-4F;
      return method1183(var5, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FI)F")
   @ObfuscatedName("ac")
   static float method1180(float var0, int var1) {
      float var2 = 32.703197F * (float)Math.pow(2.0, var0);
      return var2 * (float) Math.PI / (var1 / 2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FI)F")
   @ObfuscatedName("ax")
   static float method1181(float var0, int var1) {
      float var2 = 32.703197F * (float)Math.pow(2.0, var0);
      return var2 * (float) Math.PI / (var1 / 2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbr;Lxy;Laq;)V")
   @ObfuscatedName("wc")
   public static void method1198(classBR var0, classXY var1, classAQ var2) {
      if (var0 == null) {
         var0.method1199(var1, var2);
      }

      int var3 = classXY.method13039(var1, -346779531);
      var0.field537[0] = var3 >> 4;
      var0.field537[1] = var3 & 15;
      if (var3 != 0) {
         var0.field536[0] = classXY.method13047(var1, -2121147162);
         var0.field536[1] = classXY.method13047(var1, -1877691436);
         int var4 = classXY.method13039(var1, -346779531);

         for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < var0.field537[var5]; var6++) {
               var0.field534[var5][0][var6] = classXY.method13047(var1, 1263451732);
               var0.field535[var5][0][var6] = classXY.method13047(var1, 52295180);
            }
         }

         for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < var0.field537[var8]; var9++) {
               if ((var4 & 1 << var8 * 4 << var9) != 0) {
                  var0.field534[var8][1][var9] = classXY.method13047(var1, 591703181);
                  var0.field535[var8][1][var9] = classXY.method13047(var1, 1290869053);
               } else {
                  var0.field534[var8][1][var9] = var0.field534[var8][0][var9];
                  var0.field535[var8][1][var9] = var0.field535[var8][0][var9];
               }
            }
         }

         if (var4 != 0 || var0.field536[1] != var0.field536[0]) {
            var2.method651(var1);
         }
      } else {
         int[] var7 = var0.field536;
         var0.field536[1] = 0;
         var7[0] = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIFI)F")
   @ObfuscatedName("ap")
   float method1190(int var1, int var2, float var3, int var4) {
      float var5 = this.field534[var1][0][var2] + var3 * (this.field534[var1][1][var2] - this.field534[var1][0][var2]);
      var5 *= 1.2207031E-4F;
      return method1183(var5, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FI)F")
   @ObfuscatedName("aa")
   static float method1182(float var0, int var1) {
      float var2 = 32.703197F * (float)Math.pow(2.0, var0);
      return var2 * (float) Math.PI / (var1 / 2);
   }

   @ObfuscatedSignature(descriptor = "(IIF)F")
   @ObfuscatedName("aj")
   float method1185(int var1, int var2, float var3) {
      float var4 = this.field535[var1][0][var2] + var3 * (this.field535[var1][1][var2] - this.field535[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, -var4 / 20.0F);
   }

   @ObfuscatedSignature(descriptor = "(IIF)F")
   @ObfuscatedName("af")
   float method1186(int var1, int var2, float var3) {
      float var4 = this.field535[var1][0][var2] + var3 * (this.field535[var1][1][var2] - this.field535[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, -var4 / 20.0F);
   }

   @ObfuscatedSignature(descriptor = "(IIFI)F")
   @ObfuscatedName("ay")
   float method1191(int var1, int var2, float var3, int var4) {
      float var5 = this.field534[var1][0][var2] + var3 * (this.field534[var1][1][var2] - this.field534[var1][0][var2]);
      var5 *= 1.2207031E-4F;
      return method1183(var5, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llw;)Llh;")
   @ObfuscatedName("rd")
   public static classLH method1201(Widget var0) {
      return null != var0.field4369 ? var0.field4369.field4419 : null;
   }

   @ObfuscatedSignature(descriptor = "(IFI)I")
   @ObfuscatedName("au")
   int method1193(int var1, float var2, int var3) {
      if (var1 == 0) {
         float var4 = this.field536[0] + (this.field536[1] - this.field536[0]) * var2;
         var4 *= 0.0030517578F;
         field541 = (float)Math.pow(0.1, var4 / 20.0F);
         field542 = (int)(field541 * 65536.0F);
      }

      if (this.field537[var1] == 0) {
         return 0;
      } else {
         float var10 = this.method1184(var1, 0, var2);
         field532[var1][0] = -2.0F * var10 * (float)Math.cos(this.method1188(var1, 0, var2, var3));
         field532[var1][1] = var10 * var10;

         for (int var5 = 1; var5 < this.field537[var1]; var5++) {
            var10 = this.method1184(var1, var5, var2);
            float var6 = -2.0F * var10 * (float)Math.cos(this.method1188(var1, var5, var2, var3));
            float var7 = var10 * var10;
            field532[var1][var5 * 2 + 1] = field532[var1][var5 * 2 - 1] * var7;
            field532[var1][var5 * 2] = field532[var1][var5 * 2 - 1] * var6 + field532[var1][var5 * 2 - 2] * var7;

            for (int var8 = var5 * 2 - 1; var8 >= 2; var8--) {
               field532[var1][var8] = field532[var1][var8] + (field532[var1][var8 - 1] * var6 + field532[var1][var8 - 2] * var7);
            }

            field532[var1][1] = field532[var1][1] + (field532[var1][0] * var6 + var7);
            field532[var1][0] = field532[var1][0] + var6;
         }

         if (var1 == 0) {
            for (int var12 = 0; var12 < this.field537[0] * 2; var12++) {
               field532[0][var12] = field532[0][var12] * field541;
            }
         }

         for (int var13 = 0; var13 < this.field537[var1] * 2; var13++) {
            field533[var1][var13] = (int)(field532[var1][var13] * 65536.0F);
         }

         return this.field537[var1] * 2;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIFI)F")
   @ObfuscatedName("ad")
   float method1192(int var1, int var2, float var3, int var4) {
      float var5 = this.field534[var1][0][var2] + var3 * (this.field534[var1][1][var2] - this.field534[var1][0][var2]);
      var5 *= 1.2207031E-4F;
      return method1183(var5, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbr;IIF)F")
   @ObfuscatedName("vo")
   public static float method1187(classBR var0, int var1, int var2, float var3) {
      float var4 = var0.field535[var1][0][var2] + var3 * (var0.field535[var1][1][var2] - var0.field535[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0, -var4 / 20.0F);
   }

   classBR() {
      this.field534 = new int[2][2][4];
      this.field535 = new int[2][2][4];
      this.field536 = new int[2];
   }

   @ObfuscatedSignature(descriptor = "(IFI)I")
   @ObfuscatedName("ai")
   int method1194(int var1, float var2, int var3) {
      if (var1 == 0) {
         float var4 = this.field536[0] + (this.field536[1] - this.field536[0]) * var2;
         var4 *= 0.0030517578F;
         field541 = (float)Math.pow(0.1, var4 / 20.0F);
         field542 = (int)(field541 * 65536.0F);
      }

      if (this.field537[var1] == 0) {
         return 0;
      } else {
         float var10 = this.method1184(var1, 0, var2);
         field532[var1][0] = -2.0F * var10 * (float)Math.cos(this.method1188(var1, 0, var2, var3));
         field532[var1][1] = var10 * var10;

         for (int var5 = 1; var5 < this.field537[var1]; var5++) {
            var10 = this.method1184(var1, var5, var2);
            float var6 = -2.0F * var10 * (float)Math.cos(this.method1188(var1, var5, var2, var3));
            float var7 = var10 * var10;
            field532[var1][var5 * 2 + 1] = field532[var1][var5 * 2 - 1] * var7;
            field532[var1][var5 * 2] = field532[var1][var5 * 2 - 1] * var6 + field532[var1][var5 * 2 - 2] * var7;

            for (int var8 = var5 * 2 - 1; var8 >= 2; var8--) {
               field532[var1][var8] = field532[var1][var8] + (field532[var1][var8 - 1] * var6 + field532[var1][var8 - 2] * var7);
            }

            field532[var1][1] = field532[var1][1] + (field532[var1][0] * var6 + var7);
            field532[var1][0] = field532[var1][0] + var6;
         }

         if (var1 == 0) {
            for (int var12 = 0; var12 < this.field537[0] * 2; var12++) {
               field532[0][var12] = field532[0][var12] * field541;
            }
         }

         for (int var13 = 0; var13 < this.field537[var1] * 2; var13++) {
            field533[var1][var13] = (int)(field532[var1][var13] * 65536.0F);
         }

         return this.field537[var1] * 2;
      }
   }

   @ObfuscatedSignature(descriptor = "(IFI)I")
   @ObfuscatedName("ab")
   int method1195(int var1, float var2, int var3) {
      if (var1 == 0) {
         float var4 = this.field536[0] + (this.field536[1] - this.field536[0]) * var2;
         var4 *= 0.0030517578F;
         field541 = (float)Math.pow(0.1, var4 / 20.0F);
         field542 = (int)(field541 * 65536.0F);
      }

      if (this.field537[var1] == 0) {
         return 0;
      } else {
         float var10 = this.method1184(var1, 0, var2);
         field532[var1][0] = -2.0F * var10 * (float)Math.cos(this.method1188(var1, 0, var2, var3));
         field532[var1][1] = var10 * var10;

         for (int var5 = 1; var5 < this.field537[var1]; var5++) {
            var10 = this.method1184(var1, var5, var2);
            float var6 = -2.0F * var10 * (float)Math.cos(this.method1188(var1, var5, var2, var3));
            float var7 = var10 * var10;
            field532[var1][var5 * 2 + 1] = field532[var1][var5 * 2 - 1] * var7;
            field532[var1][var5 * 2] = field532[var1][var5 * 2 - 1] * var6 + field532[var1][var5 * 2 - 2] * var7;

            for (int var8 = var5 * 2 - 1; var8 >= 2; var8--) {
               field532[var1][var8] = field532[var1][var8] + (field532[var1][var8 - 1] * var6 + field532[var1][var8 - 2] * var7);
            }

            field532[var1][1] = field532[var1][1] + (field532[var1][0] * var6 + var7);
            field532[var1][0] = field532[var1][0] + var6;
         }

         if (var1 == 0) {
            for (int var12 = 0; var12 < this.field537[0] * 2; var12++) {
               field532[0][var12] = field532[0][var12] * field541;
            }
         }

         for (int var13 = 0; var13 < this.field537[var1] * 2; var13++) {
            field533[var1][var13] = (int)(field532[var1][var13] * 65536.0F);
         }

         return this.field537[var1] * 2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)I")
   @ObfuscatedName("li")
   public static int method1200(Actor var0) {
      return var0.field1463.field632 * -155647625;
   }

   @ObfuscatedSignature(descriptor = "(FI)F")
   @ObfuscatedName("az")
   static float method1183(float var0, int var1) {
      float var2 = 32.703197F * (float)Math.pow(2.0, var0);
      return var2 * (float) Math.PI / (var1 / 2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lbr;IFI)I")
   @ObfuscatedName("pu")
   public static int method1196(classBR var0, int var1, float var2, int var3) {
      if (var0 == null) {
         var0.method1186(var1, var1, var2);
      }

      if (var1 == 0) {
         float var4 = var0.field536[0] + (var0.field536[1] - var0.field536[0]) * var2;
         var4 *= 0.0030517578F;
         field541 = (float)Math.pow(0.1, var4 / 20.0F);
         field542 = (int)(field541 * 65536.0F);
      }

      if (var0.field537[var1] == 0) {
         return 0;
      } else {
         float var10 = var0.method1184(var1, 0, var2);
         field532[var1][0] = -2.0F * var10 * (float)Math.cos(var0.method1188(var1, 0, var2, var3));
         field532[var1][1] = var10 * var10;

         for (int var5 = 1; var5 < var0.field537[var1]; var5++) {
            var10 = var0.method1184(var1, var5, var2);
            float var6 = -2.0F * var10 * (float)Math.cos(var0.method1188(var1, var5, var2, var3));
            float var7 = var10 * var10;
            field532[var1][var5 * 2 + 1] = field532[var1][var5 * 2 - 1] * var7;
            field532[var1][var5 * 2] = field532[var1][var5 * 2 - 1] * var6 + field532[var1][var5 * 2 - 2] * var7;

            for (int var8 = var5 * 2 - 1; var8 >= 2; var8--) {
               field532[var1][var8] = field532[var1][var8] + (field532[var1][var8 - 1] * var6 + field532[var1][var8 - 2] * var7);
            }

            field532[var1][1] = field532[var1][1] + (field532[var1][0] * var6 + var7);
            field532[var1][0] = field532[var1][0] + var6;
         }

         if (var1 == 0) {
            for (int var12 = 0; var12 < var0.field537[0] * 2; var12++) {
               field532[0][var12] = field532[0][var12] * field541;
            }
         }

         for (int var13 = 0; var13 < var0.field537[var1] * 2; var13++) {
            field533[var1][var13] = (int)(field532[var1][var13] * 65536.0F);
         }

         return var0.field537[var1] * 2;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;Laq;)V")
   @ObfuscatedName("ag")
   final void method1199(classXY var1, classAQ var2) {
      int var3 = classXY.method13039(var1, -346779531);
      this.field537[0] = var3 >> 4;
      this.field537[1] = var3 & 15;
      if (var3 != 0) {
         this.field536[0] = classXY.method13047(var1, 1894169737);
         this.field536[1] = classXY.method13047(var1, -1903153327);
         int var4 = classXY.method13039(var1, -346779531);

         for (int var5 = 0; var5 < 2; var5++) {
            for (int var6 = 0; var6 < this.field537[var5]; var6++) {
               this.field534[var5][0][var6] = classXY.method13047(var1, 1408665254);
               this.field535[var5][0][var6] = classXY.method13047(var1, 1852375077);
            }
         }

         for (int var8 = 0; var8 < 2; var8++) {
            for (int var9 = 0; var9 < this.field537[var8]; var9++) {
               if ((var4 & 1 << var8 * 4 << var9) != 0) {
                  this.field534[var8][1][var9] = classXY.method13047(var1, -2127207615);
                  this.field535[var8][1][var9] = classXY.method13047(var1, -386772588);
               } else {
                  this.field534[var8][1][var9] = this.field534[var8][0][var9];
                  this.field535[var8][1][var9] = this.field535[var8][0][var9];
               }
            }
         }

         if (var4 != 0 || this.field536[1] != this.field536[0]) {
            var2.method651(var1);
         }
      } else {
         int[] var7 = this.field536;
         this.field536[1] = 0;
         var7[0] = 0;
      }
   }
}
