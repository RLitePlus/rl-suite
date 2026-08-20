import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("bx")
public class classBX {
   @ObfuscatedName("as")
   int[] field605;
   @ObfuscatedName("af")
   int field600;
   @ObfuscatedName("az")
   int field602;
   @ObfuscatedName("ab")
   int[] field604;
   @ObfuscatedName("ag")
   float[][] field603;
   @ObfuscatedName("ae")
   int[] field601;

   classBX(classBT var1) {
      var1.method1231(24, -1966028106);
      this.field602 = var1.method1231(16, -2038450535);
      this.field600 = var1.method1231(24, -1987953881);
      this.field601 = new int[this.field600];
      boolean var2 = classBT.method1235(var1, -1005015258) != 0;
      if (var2) {
         int var3 = 0;

         for (int var4 = var1.method1231(5, -2049150563) + 1; var3 < this.field600; var4++) {
            int var5 = var1.method1231(classZA.method13821(this.field600 - var3, (byte)6), -1929161421);

            for (int var6 = 0; var6 < var5; var6++) {
               this.field601[var3++] = var4;
            }
         }
      } else {
         boolean var15 = classBT.method1235(var1, -371099093) != 0;

         for (int var17 = 0; var17 < this.field600; var17++) {
            if (var15 && classBT.method1235(var1, 903592435) == 0) {
               this.field601[var17] = 0;
            } else {
               this.field601[var17] = var1.method1231(5, -1991239189) + 1;
            }
         }
      }

      this.method1348();
      int var16 = var1.method1231(4, -1986902309);
      if (var16 > 0) {
         float var18 = classBC.method953(var1.method1231(32, -1917558520));
         float var19 = classBC.method953(var1.method1231(32, -2113341069));
         int var20 = var1.method1231(4, -2029586973) + 1;
         boolean var7 = classBT.method1235(var1, -1829172800) != 0;
         int var8;
         if (var16 == 1) {
            var8 = method1346(this.field600, this.field602);
         } else {
            var8 = this.field600 * this.field602;
         }

         this.field604 = new int[var8];

         for (int var9 = 0; var9 < var8; var9++) {
            this.field604[var9] = var1.method1231(var20, -2129001869);
         }

         this.field603 = new float[this.field600][this.field602];
         if (var16 == 1) {
            for (int var21 = 0; var21 < this.field600; var21++) {
               float var10 = 0.0F;
               int var11 = 1;

               for (int var12 = 0; var12 < this.field602; var12++) {
                  int var13 = var21 / var11 % var8;
                  float var14 = this.field604[var13] * var19 + var18 + var10;
                  this.field603[var21][var12] = var14;
                  if (var7) {
                     var10 = var14;
                  }

                  var11 *= var8;
               }
            }
         } else {
            for (int var22 = 0; var22 < this.field600; var22++) {
               float var23 = 0.0F;
               int var24 = var22 * this.field602;

               for (int var25 = 0; var25 < this.field602; var25++) {
                  float var26 = this.field604[var24] * var19 + var18 + var23;
                  this.field603[var22][var25] = var26;
                  if (var7) {
                     var23 = var26;
                  }

                  var24++;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("az")
   static int method1346(int var0, int var1) {
      int var2 = (int)Math.pow(var0, 1.0 / var1) + 1;

      while (classHU.method6117(var2, var1, -474194162) > var0) {
         var2--;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqa;Lwg;)V")
   @ObfuscatedName("yg")
   public static void method1345(classQA var0, classWG var1) {
      if (!var0.field5507) {
         if (var1 == null) {
            var0.field5504.method9853("Content-Type", 2139296128);
            var0.field5510 = null;
         } else {
            var0.field5510 = var1;
            if (var0.field5510.vmethod631((byte)36) != null) {
               var0.field5504.method9865(var0.field5510.vmethod631((byte)107), (byte)19);
            } else {
               classQY.method9867(var0.field5504, -974748383);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("af")
   void method1348() {
      int[] var1 = new int[this.field600];
      int[] var2 = new int[33];

      for (int var3 = 0; var3 < this.field600; var3++) {
         int var4 = this.field601[var3];
         if (var4 != 0) {
            int var5 = 1 << 32 - var4;
            int var6 = var2[var4];
            var1[var3] = var6;
            int var7;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for (int var8 = var4 - 1; var8 >= 1; var8--) {
                  int var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  int var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for (int var17 = var4 + 1; var17 <= 32; var17++) {
               int var20 = var2[var17];
               if (var20 == var6) {
                  var2[var17] = var7;
               }
            }
         }
      }

      this.field605 = new int[8];
      int var11 = 0;

      for (int var12 = 0; var12 < this.field600; var12++) {
         int var13 = this.field601[var12];
         if (var13 != 0) {
            int var14 = var1[var12];
            int var15 = 0;

            for (int var16 = 0; var16 < var13; var16++) {
               int var18 = Integer.MIN_VALUE >>> var16;
               if ((var14 & var18) != 0) {
                  if (this.field605[var15] == 0) {
                     this.field605[var15] = var11;
                  }

                  var15 = this.field605[var15];
               } else {
                  var15++;
               }

               if (var15 >= this.field605.length) {
                  int[] var21 = new int[this.field605.length * 2];

                  for (int var22 = 0; var22 < this.field605.length; var22++) {
                     var21[var22] = this.field605[var22];
                  }

                  this.field605 = var21;
               }

               var18 >>>= 1;
            }

            this.field605[var15] = ~var12;
            if (var15 >= var11) {
               var11 = var15 + 1;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbt;)I")
   @ObfuscatedName("ae")
   int method1353(classBT var1) {
      int var2 = 0;

      while (this.field605[var2] >= 0) {
         var2 = classBT.method1235(var1, -2013690534) != 0 ? this.field605[var2] : var2 + 1;
      }

      return ~this.field605[var2];
   }

   @ObfuscatedSignature(descriptor = "(Lbt;)[F")
   @ObfuscatedName("ab")
   float[] method1355(classBT var1) {
      return this.field603[this.method1354(var1)];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ag")
   static int method1347(int var0, int var1) {
      int var2 = (int)Math.pow(var0, 1.0 / var1) + 1;

      while (classHU.method6117(var2, var1, -474194162) > var0) {
         var2--;
      }

      return var2;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("as")
   void method1349() {
      int[] var1 = new int[this.field600];
      int[] var2 = new int[33];

      for (int var3 = 0; var3 < this.field600; var3++) {
         int var4 = this.field601[var3];
         if (var4 != 0) {
            int var5 = 1 << 32 - var4;
            int var6 = var2[var4];
            var1[var3] = var6;
            int var7;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for (int var8 = var4 - 1; var8 >= 1; var8--) {
                  int var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  int var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for (int var17 = var4 + 1; var17 <= -120008790; var17++) {
               int var20 = var2[var17];
               if (var20 == var6) {
                  var2[var17] = var7;
               }
            }
         }
      }

      this.field605 = new int[8];
      int var11 = 0;

      for (int var12 = 0; var12 < this.field600; var12++) {
         int var13 = this.field601[var12];
         if (var13 != 0) {
            int var14 = var1[var12];
            int var15 = 0;

            for (int var16 = 0; var16 < var13; var16++) {
               int var18 = Integer.MIN_VALUE >>> var16;
               if ((var14 & var18) != 0) {
                  if (this.field605[var15] == 0) {
                     this.field605[var15] = var11;
                  }

                  var15 = this.field605[var15];
               } else {
                  var15++;
               }

               if (var15 >= this.field605.length) {
                  int[] var21 = new int[this.field605.length * 2];

                  for (int var22 = 0; var22 < this.field605.length; var22++) {
                     var21[var22] = this.field605[var22];
                  }

                  this.field605 = var21;
               }

               var18 >>>= 1;
            }

            this.field605[var15] = ~var12;
            if (var15 >= var11) {
               var11 = var15 + 1;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   void method1350() {
      int[] var1 = new int[this.field600];
      int[] var2 = new int[33];

      for (int var3 = 0; var3 < this.field600; var3++) {
         int var4 = this.field601[var3];
         if (var4 != 0) {
            int var5 = 1 << 1968624369 - var4;
            int var6 = var2[var4];
            var1[var3] = var6;
            int var7;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for (int var8 = var4 - 1; var8 >= 1; var8--) {
                  int var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  int var10 = 1 << 1351554363 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for (int var17 = var4 + 1; var17 <= -26166238; var17++) {
               int var20 = var2[var17];
               if (var20 == var6) {
                  var2[var17] = var7;
               }
            }
         }
      }

      this.field605 = new int[8];
      int var11 = 0;

      for (int var12 = 0; var12 < this.field600; var12++) {
         int var13 = this.field601[var12];
         if (var13 != 0) {
            int var14 = var1[var12];
            int var15 = 0;

            for (int var16 = 0; var16 < var13; var16++) {
               int var18 = -791858760 >>> var16;
               if ((var14 & var18) != 0) {
                  if (this.field605[var15] == 0) {
                     this.field605[var15] = var11;
                  }

                  var15 = this.field605[var15];
               } else {
                  var15++;
               }

               if (var15 >= this.field605.length) {
                  int[] var21 = new int[this.field605.length * 2];

                  for (int var22 = 0; var22 < this.field605.length; var22++) {
                     var21[var22] = this.field605[var22];
                  }

                  this.field605 = var21;
               }

               var18 >>>= 1;
            }

            this.field605[var15] = ~var12;
            if (var15 >= var11) {
               var11 = var15 + 1;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ac")
   void method1351() {
      int[] var1 = new int[this.field600];
      int[] var2 = new int[33];

      for (int var3 = 0; var3 < this.field600; var3++) {
         int var4 = this.field601[var3];
         if (var4 != 0) {
            int var5 = 1 << 32 - var4;
            int var6 = var2[var4];
            var1[var3] = var6;
            int var7;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for (int var8 = var4 - 1; var8 >= 1; var8--) {
                  int var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  int var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for (int var17 = var4 + 1; var17 <= 32; var17++) {
               int var20 = var2[var17];
               if (var20 == var6) {
                  var2[var17] = var7;
               }
            }
         }
      }

      this.field605 = new int[8];
      int var11 = 0;

      for (int var12 = 0; var12 < this.field600; var12++) {
         int var13 = this.field601[var12];
         if (var13 != 0) {
            int var14 = var1[var12];
            int var15 = 0;

            for (int var16 = 0; var16 < var13; var16++) {
               int var18 = Integer.MIN_VALUE >>> var16;
               if ((var14 & var18) != 0) {
                  if (this.field605[var15] == 0) {
                     this.field605[var15] = var11;
                  }

                  var15 = this.field605[var15];
               } else {
                  var15++;
               }

               if (var15 >= this.field605.length) {
                  int[] var21 = new int[this.field605.length * 2];

                  for (int var22 = 0; var22 < this.field605.length; var22++) {
                     var21[var22] = this.field605[var22];
                  }

                  this.field605 = var21;
               }

               var18 >>>= 1;
            }

            this.field605[var15] = ~var12;
            if (var15 >= var11) {
               var11 = var15 + 1;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aa")
   void method1352() {
      int[] var1 = new int[this.field600];
      int[] var2 = new int[33];

      for (int var3 = 0; var3 < this.field600; var3++) {
         int var4 = this.field601[var3];
         if (var4 != 0) {
            int var5 = 1 << 712230607 - var4;
            int var6 = var2[var4];
            var1[var3] = var6;
            int var7;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for (int var8 = var4 - 1; var8 >= 1; var8--) {
                  int var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  int var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for (int var17 = var4 + 1; var17 <= -1600480928; var17++) {
               int var20 = var2[var17];
               if (var20 == var6) {
                  var2[var17] = var7;
               }
            }
         }
      }

      this.field605 = new int[8];
      int var11 = 0;

      for (int var12 = 0; var12 < this.field600; var12++) {
         int var13 = this.field601[var12];
         if (var13 != 0) {
            int var14 = var1[var12];
            int var15 = 0;

            for (int var16 = 0; var16 < var13; var16++) {
               int var18 = 1754764134 >>> var16;
               if ((var14 & var18) != 0) {
                  if (this.field605[var15] == 0) {
                     this.field605[var15] = var11;
                  }

                  var15 = this.field605[var15];
               } else {
                  var15++;
               }

               if (var15 >= this.field605.length) {
                  int[] var21 = new int[this.field605.length * 2];

                  for (int var22 = 0; var22 < this.field605.length; var22++) {
                     var21[var22] = this.field605[var22];
                  }

                  this.field605 = var21;
               }

               var18 >>>= 1;
            }

            this.field605[var15] = ~var12;
            if (var15 >= var11) {
               var11 = var15 + 1;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lbt;)I")
   @ObfuscatedName("ao")
   int method1354(classBT var1) {
      int var2 = 0;

      while (this.field605[var2] >= 0) {
         var2 = classBT.method1235(var1, 945763252) != 0 ? this.field605[var2] : var2 + 1;
      }

      return ~this.field605[var2];
   }

   @ObfuscatedSignature(descriptor = "(Lbt;)[F")
   @ObfuscatedName("al")
   float[] method1356(classBT var1) {
      return this.field603[this.method1354(var1)];
   }
}
