import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yw")
public class classYW extends classVJ {
   @ObfuscatedName("aq")
   public static int field7101;
   @ObfuscatedName("aj")
   public static int[] field7104;
   @ObfuscatedName("ay")
   public static int field7102;
   @ObfuscatedName("ai")
   public static int field7097 = 0;
   @ObfuscatedName("ad")
   public static float[] field7103;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final float field7100 = 0.0F;
   @ObfuscatedName("au")
   public static int field7098 = 0;
   @ObfuscatedName("ap")
   public static int field7096 = 0;
   @ObfuscatedName("ar")
   public static int field7099 = 0;

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("dv")
   public static void method13674(int var0, int var1, int var2, int var3) {
      if (field7097 < var0) {
         field7097 = var0;
      }

      if (field7096 < var1) {
         field7096 = var1;
      }

      if (field7099 > var2) {
         field7099 = var2;
      }

      if (field7098 > var3) {
         field7098 = var3;
      }
   }

   @ObfuscatedSignature(descriptor = "([III[F)V")
   @ObfuscatedName("de")
   protected static void method13662(int[] var0, int var1, int var2, float[] var3) {
      field7104 = var0;
      field7102 = var1;
      field7101 = var2;
      field7103 = var3;
      method13671(0, 0, var1, var2);
   }

   protected classYW() {
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("dn")
   public static void method13671(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > field7102) {
         var2 = field7102;
      }

      if (var3 > field7101) {
         var3 = field7101;
      }

      field7097 = var0;
      field7096 = var1;
      field7099 = var2;
      field7098 = var3;
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ek")
   public static void method13711(int var0, int var1, int var2, int var3, int var4, int var5) {
      method13722(var0, var1, var2, var4, var5);
      method13722(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         method13726(var0, var1 + 1, var3 - 2, var4, var5);
         method13726(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("do")
   public static void method13675(int[] var0) {
      var0[0] = field7097;
      var0[1] = field7096;
      var0[2] = field7099;
      var0[3] = field7098;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("df")
   public static void method13689(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            method13686(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 0xFF) * var4;
            int var7 = (var3 >> 8 & 0xFF) * var4;
            int var8 = (var3 & 0xFF) * var4;
            int var12 = var1 - var2;
            if (var12 < field7096) {
               var12 = field7096;
            }

            int var13 = var1 + var2 + 1;
            if (var13 > field7098) {
               var13 = field7098;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            while (var14 < var1) {
               while (var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               int var20 = var0 - var16 + 1;
               if (var20 < field7097) {
                  var20 = field7097;
               }

               int var21 = var0 + var16;
               if (var21 > field7099) {
                  var21 = field7099;
               }

               int var22 = var20 + var14 * field7102;

               for (int var23 = var20; var23 < var21; var23++) {
                  int var9 = (field7104[var22] >> 16 & 0xFF) * var5;
                  int var10 = (field7104[var22] >> 8 & 0xFF) * var5;
                  int var11 = (field7104[var22] & 0xFF) * var5;
                  int var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  client.method2316(field7104, var22++, var24, var4);
               }

               var14++;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for (int var32 = var19 - var17; var14 < var13; var18 += var17++ + var17) {
               while (var32 > var15 && var18 > var15) {
                  var32 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               int var33 = var0 - var16;
               if (var33 < field7097) {
                  var33 = field7097;
               }

               int var34 = var0 + var16;
               if (var34 > field7099 - 1) {
                  var34 = field7099 - 1;
               }

               int var35 = var33 + var14 * field7102;

               for (int var36 = var33; var36 <= var34; var36++) {
                  int var25 = (field7104[var35] >> 16 & 0xFF) * var5;
                  int var26 = (field7104[var35] >> 8 & 0xFF) * var5;
                  int var27 = (field7104[var35] & 0xFF) * var5;
                  int var37 = (var6 + var25 >> 8 << 16) + (var7 + var26 >> 8 << 8) + (var8 + var27 >> 8);
                  client.method2316(field7104, var35++, var37, var4);
               }

               var14++;
               var32 += var17 + var17;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dl")
   public static void method13683() {
      int var0 = 0;

      int var1;
      for (var1 = field7102 * field7101 - 7; var0 < var1; field7104[var0++] = 0) {
         field7104[var0++] = 0;
         field7104[var0++] = 0;
         field7104[var0++] = 0;
         field7104[var0++] = 0;
         field7104[var0++] = 0;
         field7104[var0++] = 0;
         field7104[var0++] = 0;
      }

      var1 += 7;

      while (var0 < var1) {
         field7104[var0++] = 0;
      }

      method13763();
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("dq")
   static void method13686(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         method13749(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < field7096) {
            var4 = field7096;
         }

         int var5 = var1 + var2 + 1;
         if (var5 > field7098) {
            var5 = field7098;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         while (var6 < var1) {
            while (var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            int var12 = var0 - var8 + 1;
            if (var12 < field7097) {
               var12 = field7097;
            }

            int var13 = var0 + var8;
            if (var13 > field7099) {
               var13 = field7099;
            }

            int var14 = var12 + var6 * field7102;

            for (int var15 = var12; var15 < var13; var15++) {
               field7104[var14++] = var3 | 0xFF000000;
            }

            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for (int var20 = var11 - var9; var6 < var5; var10 += var9++ + var9) {
            while (var20 > var7 && var10 > var7) {
               var20 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            int var21 = var0 - var8;
            if (var21 < field7097) {
               var21 = field7097;
            }

            int var22 = var0 + var8;
            if (var22 > field7099 - 1) {
               var22 = field7099 - 1;
            }

            int var23 = var21 + var6 * field7102;

            for (int var24 = var21; var24 <= var22; var24++) {
               field7104[var23++] = var3 | 0xFF000000;
            }

            var6++;
            var20 += var9 + var9;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ev")
   static void method13726(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= field7097 && var0 < field7099) {
         if (var1 < field7096) {
            var2 -= field7096 - var1;
            var1 = field7096;
         }

         if (var1 + var2 > field7098) {
            var2 = field7098 - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var12 = var0 + var1 * field7102;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (field7104[var12] >> 16 & 0xFF) * var5;
            int var10 = (field7104[var12] >> 8 & 0xFF) * var5;
            int var11 = (field7104[var12] & 0xFF) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            client.method2316(field7104, var12, var14, var4);
            var12 += field7102;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII[BIZ)V")
   @ObfuscatedName("ff")
   public static void method13704(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < field7102 && var1 < field7101) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > field7102) {
               var2 = field7102 - var0;
            }

            if (var1 + var3 > field7101) {
               var3 = field7101 - var1;
            }

            int var11 = var6.length / var7;
            int var12 = field7102 - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            if (!var8 || var13 == 330675018 && var14 == 255) {
               int var25 = (var1 + var10) * field7102 + var0 + var9;

               for (int var26 = var1 + var10; var26 < var1 + var10 + var3; var26++) {
                  for (int var27 = var0 + var9; var27 < var0 + var9 + var2; var27++) {
                     int var28 = (var26 - var1) % var11;
                     int var29 = (var27 - var0) % var7;
                     if (var6[var28 * var7 + var29] != 0) {
                        field7104[var25++] = var5;
                     } else {
                        field7104[var25++] = var4;
                     }
                  }

                  var25 += var12;
               }
            } else {
               int var15 = (var1 + var10) * field7102 + var0 + var9;

               for (int var16 = var1 + var10; var16 < var1 + var10 + var3; var16++) {
                  for (int var17 = var0 + var9; var17 < var0 + var9 + var2; var17++) {
                     int var18 = (var16 - var1) % var11;
                     int var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if (var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = field7104[var15];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 1257328034) * var22 & -785639331)
                           + ((var20 & -514987986) * var21 + (var23 & 0xFF00) * var22 & 0xFF0000)
                        >> 8;
                     field7104[var15++] = var24;
                  }

                  var15 += var12;
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("ft")
   public static void method13703(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if (var0 < field7097) {
            var2 -= field7097 - var0;
            var0 = field7097;
         }

         if (var1 < field7096) {
            var8 += (field7096 - var1) * var9;
            var3 -= field7096 - var1;
            var1 = field7096;
         }

         if (var0 + var2 > field7099) {
            var2 = field7099 - var0;
         }

         if (var1 + var3 > field7098) {
            var3 = field7098 - var1;
         }

         int var10 = field7102 - var2;
         int var11 = var0 + var1 * field7102;

         for (int var12 = -var3; var12 < 0; var12++) {
            int var13 = 975312037 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var6 * var13 + var7 * var14 & 811791846) >>> 8;
            if (var15 == 0) {
               var11 += field7102;
               var8 += var9;
            } else {
               int var16 = ((var4 & -104574854) * var13 + (var5 & 922826893) * var14 & -16711936)
                     + ((var4 & 0xFF00) * var13 + (var5 & -1945587461) * var14 & -709619272)
                  >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & -1813106330) + ((var16 & -1394766488) * var15 >> 8 & -355169562);

               for (int var19 = -var2; var19 < 0; var19++) {
                  int var20 = field7104[var11];
                  if (var20 == 0) {
                     field7104[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & -1652810693) + ((var20 & 1049259757) * var17 >> 8 & 1698595949);
                     field7104[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("da")
   public static void method13699(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < field7097) {
            var2 -= field7097 - var0;
            var0 = field7097;
         }

         if (var1 < field7096) {
            var6 += (field7096 - var1) * var7;
            var3 -= field7096 - var1;
            var1 = field7096;
         }

         if (var0 + var2 > field7099) {
            var2 = field7099 - var0;
         }

         if (var1 + var3 > field7098) {
            var3 = field7098 - var1;
         }

         int var8 = field7102 - var2;
         int var9 = var0 + var1 * field7102;

         for (int var10 = -var3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & 0xFF00) * var11 + (var5 & 0xFF00) * var12 & 0xFF0000)
               >>> 8;

            for (int var14 = -var2; var14 < 0; var14++) {
               field7104[var9++] = var13 | 0xFF000000;
            }

            var9 += var8;
            var6 += var7;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("fp")
   public static void method13693(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < field7097) {
         var2 -= field7097 - var0;
         var0 = field7097;
      }

      if (var1 < field7096) {
         var3 -= field7096 - var1;
         var1 = field7096;
      }

      if (var0 + var2 > field7099) {
         var2 = field7099 - var0;
      }

      if (var1 + var3 > field7098) {
         var3 = field7098 - var1;
      }

      var4 = ((var4 & -881268426) * var5 >> 8 & 1904105012) + ((var4 & 1728883231) * var5 >> 8 & -1506804376);
      int var6 = 256 - var5;
      int var7 = field7102 - var2;
      int var8 = var0 + var1 * field7102;

      for (int var9 = 0; var9 < var3; var9++) {
         for (int var10 = -var2; var10 < 0; var10++) {
            int var11 = field7104[var8];
            var11 = ((var11 & -1820297928) * var6 >> 8 & 16711935) + ((var11 & 571524748) * var6 >> 8 & 0xFF00);
            field7104[var8++] = var4 + var11;
         }

         var8 += var7;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("fn")
   public static void method13696(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < field7097) {
         var2 -= field7097 - var0;
         var0 = field7097;
      }

      if (var1 < field7096) {
         var3 -= field7096 - var1;
         var1 = field7096;
      }

      if (var0 + var2 > field7099) {
         var2 = field7099 - var0;
      }

      if (var1 + var3 > field7098) {
         var3 = field7098 - var1;
      }

      int var5 = field7102 - var2;
      int var6 = var0 + var1 * field7102;

      for (int var7 = -var3; var7 < 0; var7++) {
         for (int var8 = -var2; var8 < 0; var8++) {
            field7104[var6++] = var4;
         }

         var6 += var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ea")
   public static void method13707(int var0, int var1, int var2, int var3, int var4) {
      method13717(var0, var1, var2, var4);
      method13717(var0, var1 + var3 - 1, var2, var4);
      method13723(var0, var1, var3, var4);
      method13723(var0 + var2 - 1, var1, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("hw")
   static void method13737(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= field7097 && var0 < field7099) {
         int var5 = var1 - var2;
         int var6 = var1 + var3;
         var5 = Math.max(var5, field7096);
         var6 = Math.min(var6, field7098 - 1);
         if (var5 <= var6) {
            method13723(var0, var5, var6 - var5 + 1, var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ds")
   public static void method13694(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < field7097) {
         var2 -= field7097 - var0;
         var0 = field7097;
      }

      if (var1 < field7096) {
         var3 -= field7096 - var1;
         var1 = field7096;
      }

      if (var0 + var2 > field7099) {
         var2 = field7099 - var0;
      }

      if (var1 + var3 > field7098) {
         var3 = field7098 - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var6 = 256 - var5;
      int var7 = field7102 - var2;
      int var8 = var0 + var1 * field7102;

      for (int var9 = 0; var9 < var3; var9++) {
         for (int var10 = -var2; var10 < 0; var10++) {
            int var11 = field7104[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 0xFF00) * var6 >> 8 & 0xFF00);
            client.method2316(field7104, var8++, var4 + var11, var5);
         }

         var8 += var7;
      }
   }

   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("dg")
   public static void method13679(int[] var0) {
      field7097 = var0[0];
      field7096 = var0[1];
      field7099 = var0[2];
      field7098 = var0[3];
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ed")
   public static void method13723(int var0, int var1, int var2, int var3) {
      if (var0 >= field7097 && var0 < field7099) {
         if (var1 < field7096) {
            var2 -= field7096 - var1;
            var1 = field7096;
         }

         if (var1 + var2 > field7098) {
            var2 = field7098 - var1;
         }

         int var4 = var0 + var1 * field7102;

         for (int var5 = 0; var5 < var2; var5++) {
            field7104[var4 + var5 * field7102] = var3 | 0xFF000000;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("he")
   public static void method13760() {
      if (field7103 != null) {
         int var0 = field7103.length;

         for (int var1 = 0; var1 < var0; var1++) {
            if (var1 % field7102 < field7102 / 2 && field7103[var1] > 0.0F) {
               float var3 = field7103[var1];
               float var4 = 150.75377F / (var3 - 1.0100503F);
               float var2 = var4 / 14925.0F / 1.0100503F;
               int var5 = (int)(255.0F * var2);
               field7104[var1] = var5 << 16 | var5 << 8 | var5;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIII[BIZ)V")
   @ObfuscatedName("ey")
   public static void method13764(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      int var9 = field7102;
      int var10 = field7101;
      int[] var11 = field7104;
      if (!classOE.field4843.isGpu()) {
         int var35 = var7;
         byte[] var34 = var6;
         int var33 = var5;
         int var32 = var4;
         int var31 = var3;
         int var30 = var2;
         int var29 = var1;
         int var28 = var0;
         boolean var36 = true;
         if (var0 + var2 >= 0 && var1 + var3 >= 0 && var0 < field7102 && var1 < field7101) {
            int var37 = 0;
            int var38 = 0;
            if (var0 < 0) {
               var37 -= var0;
               var30 = var2 + var0;
            }

            if (var1 < 0) {
               var38 -= var1;
               var31 = var3 + var1;
            }

            if (var0 + var30 > field7102) {
               var30 = field7102 - var0;
            }

            if (var1 + var31 > field7101) {
               var31 = field7101 - var1;
            }

            int var39 = var6.length / var7;
            int var40 = field7102 - var30;
            int var41 = var4 >>> 24;
            int var42 = var5 >>> 24;
            if (var36 && (var41 != 255 || var42 != 255)) {
               int var58 = (var1 + var38) * field7102 + var0 + var37;

               for (int var59 = var1 + var38; var59 < var29 + var38 + var31; var59++) {
                  for (int var60 = var28 + var37; var60 < var28 + var37 + var30; var60++) {
                     int var61 = (var59 - var29) % var39;
                     int var62 = (var60 - var28) % var35;
                     int var48 = var32;
                     if (var34[var61 * var35 + var62] != 0) {
                        var48 = var33;
                     }

                     int var49 = var48 >>> 24;
                     int var50 = 255 - var49;
                     int var51 = field7104[var58];
                     int var52 = ((var48 & 16711935) * var49 + (var51 & 16711935) * var50 & -16711936)
                           + ((var48 & 0xFF00) * var49 + (var51 & 0xFF00) * var50 & 0xFF0000)
                        >> 8;
                     field7104[var58++] = var52;
                  }

                  var58 += var40;
               }
            } else {
               int var43 = (var1 + var38) * field7102 + var0 + var37;

               for (int var44 = var1 + var38; var44 < var29 + var38 + var31; var44++) {
                  for (int var45 = var28 + var37; var45 < var28 + var37 + var30; var45++) {
                     int var46 = (var44 - var29) % var39;
                     int var47 = (var45 - var28) % var35;
                     if (var34[var46 * var35 + var47] != 0) {
                        field7104[var43++] = var33;
                     } else {
                        field7104[var43++] = var32;
                     }
                  }

                  var43 += var40;
               }
            }
         }
      } else {
         if (var0 + var2 >= 0 && var3 + var1 >= 0 && var0 < var9 && var1 < var10) {
            int var12 = 0;
            int var13 = 0;
            if (var0 < 0) {
               var12 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var13 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > var9) {
               var2 = var9 - var0;
            }

            if (var3 + var1 > var10) {
               var3 = var10 - var1;
            }

            int var14 = var6.length / var7;
            int var15 = var9 - var2;
            int var16 = var4 >>> 24;
            int var17 = var5 >>> 24;
            if (var16 == 255 && var17 == 255) {
               int var53 = var0 + var12 + (var13 + var1) * var9;

               for (int var54 = var13 + var1; var54 < var3 + var13 + var1; var54++) {
                  for (int var55 = var0 + var12; var55 < var0 + var12 + var2; var55++) {
                     int var56 = (var54 - var1) % var14;
                     int var57 = (var55 - var0) % var7;
                     if (var6[var57 + var56 * var7] != 0) {
                        var11[var53++] = var5;
                     } else {
                        var11[var53++] = var4;
                     }
                  }

                  var53 += var15;
               }
            } else {
               int var18 = var0 + var12 + (var13 + var1) * var9;

               for (int var19 = var13 + var1; var19 < var3 + var13 + var1; var19++) {
                  for (int var20 = var0 + var12; var20 < var0 + var12 + var2; var20++) {
                     int var21 = (var19 - var1) % var14;
                     int var22 = (var20 - var0) % var7;
                     int var23 = var4;
                     if (var6[var22 + var21 * var7] != 0) {
                        var23 = var5;
                     }

                     int var24 = var23 >>> 24;
                     int var25 = 255 - var24;
                     int var26 = var11[var18];
                     int var27 = ((var23 & 16711935) * var24 + (var26 & 16711935) * var25 & -16711936)
                           + (var24 * (var23 & 0xFF00) + var25 * (var26 & 0xFF00) & 0xFF0000)
                        >> 8;
                     client.method2316(var11, var18++, var27, var24);
                  }

                  var18 += var15;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("eh")
   static void method13733(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= field7096 && var1 < field7098) {
         int var5 = var0 - var2;
         int var6 = var0 + var3;
         var5 = Math.max(var5, field7097);
         var6 = Math.min(var6, field7099 - 1);
         if (var5 <= var6) {
            method13717(var5, var1, var6 - var5 + 1, var4);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("hl")
   public static void method13744(int var0, int var1, int var2, int var3, int var4, int var5) {
      var5 |= -16777216;
      if (var4 <= 1) {
         method13732(var0, var1, var2, var3, var5);
      } else {
         int var6 = var4 / 2;
         int var7 = var4 - var6;
         int var8 = var2 - var0;
         int var9 = var3 - var1;
         if (var9 == 0) {
            int var30 = var0;
            int var34 = var2;
            if (var0 > var2) {
               var30 = var2;
               var34 = var0;
            }

            int var44 = var1 - var6;
            int var50 = var1 + var7;
            var44 = Math.max(var44, field7096);
            var50 = Math.min(var50, field7098 - 1);
            if (var44 <= var50) {
               var30 = Math.max(var30, field7097);
               var34 = Math.min(var34, field7099 - 1);
               if (var30 <= var34) {
                  for (int var55 = var44; var55 <= var50; var55++) {
                     method13717(var30, var55, var34 - var30 + 1, var5);
                  }
               }
            }
         } else if (var8 == 0) {
            int var28 = var1;
            int var32 = var3;
            if (var1 > var3) {
               var28 = var3;
               var32 = var1;
            }

            int var42 = var0 - var6;
            int var48 = var0 + var7;
            var42 = Math.max(var42, field7097);
            var48 = Math.min(var48, field7099 - 1);
            if (var42 <= var48) {
               var28 = Math.max(var28, field7096);
               var32 = Math.min(var32, field7098 - 1);
               if (var28 <= var32) {
                  for (int var54 = var42; var54 <= var48; var54++) {
                     method13723(var54, var28, var32 - var28 + 1, var5);
                  }
               }
            }
         } else {
            int var10 = Math.abs(var8);
            int var11 = Math.abs(var9);
            if (var10 == var11) {
               int var41 = var8 >= 0 ? 1 : -1;
               int var47 = var9 >= 0 ? 1 : -1;
               int var53 = -var47;
               int var57 = var41;
               int var59 = var0;
               int var61 = var1;

               for (int var63 = 0; var63 <= var10; var63++) {
                  for (int var65 = -var6; var65 <= var7 - 1; var65++) {
                     int var20 = var53 * var65;
                     int var21 = var57 * var65;
                     method13740(var59 + var20, var61 + var21, var5);
                     boolean var22 = (var63 & 1) != 0;
                     if (var22) {
                        method13740(var59 + var20 + 1, var61 + var21, var5);
                     }

                     method13740(var59 + var20 + var41, var61 + var21, var5);
                  }

                  var59 += var41;
                  var61 += var47;
               }
            } else {
               if (var10 >= var11) {
                  if (var2 < var0) {
                     int var12 = var0;
                     var0 = var2;
                     var2 = var12;
                     var12 = var1;
                     var1 = var3;
                     var3 = var12;
                  }

                  var8 = var2 - var0;
                  var9 = var3 - var1;
                  int var37 = (var1 << 16) + 32768;
                  int var14 = var9 << 16;
                  int var13;
                  if (var14 >= 0) {
                     var13 = (var14 + var8 / 2) / var8;
                  } else {
                     var13 = -((-var14 + var8 / 2) / var8);
                  }

                  int var15 = var13;
                  int var16 = var0;
                  if (var0 < field7097) {
                     var37 += var13 * (field7097 - var0);
                     var16 = field7097;
                  }

                  int var17 = Math.min(var2, field7099 - 1);

                  for (int var18 = var16; var18 <= var17; var18++) {
                     int var19 = var37 >> 16;
                     method13738(var18, var19, var6, var7, var5);
                     var37 += var15;
                  }
               } else {
                  if (var3 < var1) {
                     int var38 = var0;
                     var0 = var2;
                     var2 = var38;
                     var38 = var1;
                     var1 = var3;
                     var3 = var38;
                  }

                  var8 = var2 - var0;
                  var9 = var3 - var1;
                  int var40 = (var0 << 16) + 1963403411;
                  int var52 = var8 << 16;
                  int var46;
                  if (var52 >= 0) {
                     var46 = (var9 / 2 + var52) / var9;
                  } else {
                     var46 = -((var9 / 2 + -var52) / var9);
                  }

                  int var56 = var46;
                  int var58 = var1;
                  if (var1 < field7096) {
                     var40 += var46 * (field7096 - var1);
                     var58 = field7096;
                  }

                  int var60 = Math.min(var3, field7098 - 1);

                  for (int var62 = var58; var62 <= var60; var62++) {
                     int var64 = var40 >> 16;
                     method13733(var64, var62, var6, var7, var5);
                     var40 += var56;
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("fs")
   public static void method13695(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < field7097) {
         var2 -= field7097 - var0;
         var0 = field7097;
      }

      if (var1 < field7096) {
         var3 -= field7096 - var1;
         var1 = field7096;
      }

      if (var0 + var2 > field7099) {
         var2 = field7099 - var0;
      }

      if (var1 + var3 > field7098) {
         var3 = field7098 - var1;
      }

      var4 = ((var4 & 16711935) * var5 >> 8 & 16711935) + ((var4 & 0xFF00) * var5 >> 8 & 0xFF00);
      int var6 = 256 - var5;
      int var7 = field7102 - var2;
      int var8 = var0 + var1 * field7102;

      for (int var9 = 0; var9 < var3; var9++) {
         for (int var10 = -var2; var10 < 0; var10++) {
            int var11 = field7104[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 0xFF00) * var6 >> 8 & 0xFF00);
            field7104[var8++] = var4 + var11;
         }

         var8 += var7;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("eg")
   static void method13738(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= field7097 && var0 < field7099) {
         int var5 = var1 - var2;
         int var6 = var1 + var3;
         var5 = Math.max(var5, field7096);
         var6 = Math.min(var6, field7098 - 1);
         if (var5 <= var6) {
            method13723(var0, var5, var6 - var5 + 1, var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("eq")
   static void method13749(int var0, int var1, int var2) {
      if (var0 >= field7097 && var1 >= field7096 && var0 < field7099 && var1 < field7098) {
         field7104[var0 + var1 * field7102] = var2 | 0xFF000000;
      }
   }

   @ObfuscatedSignature(descriptor = "(III[I[I)V")
   @ObfuscatedName("er")
   public static void method13752(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * field7102;

      for (int var8 = 0; var8 < var3.length; var8++) {
         int var6 = var5 + var3[var8];

         for (int var7 = -var4[var8]; var7 < 0; var7++) {
            field7104[var6++] = var2 | 0xFF000000;
         }

         var5 += field7102;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("en")
   static void method13740(int var0, int var1, int var2) {
      if (var1 >= field7096 && var1 < field7098) {
         if (var0 >= field7097 && var0 < field7099) {
            field7104[var0 + var1 * field7102] = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("et")
   public static void method13761() {
      if (field7103 != null) {
         int var0 = field7103.length;

         for (int var1 = 0; var1 < var0; var1++) {
            if (var1 % field7102 < field7102 / 2 && field7103[var1] > 0.0F) {
               float var3 = field7103[var1];
               float var4 = 150.75377F / (var3 - 1.0100503F);
               float var2 = var4 / 14925.0F / 1.0100503F;
               int var5 = (int)(255.0F * var2);
               field7104[var1] = var5 << 16 | var5 << 8 | var5;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([III[F)V")
   @ObfuscatedName("ew")
   protected static void method13663(int[] var0, int var1, int var2, float[] var3) {
      field7104 = var0;
      field7102 = var1;
      field7101 = var2;
      field7103 = var3;
      method13671(0, 0, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "([III[F)V")
   @ObfuscatedName("eu")
   protected static void method13664(int[] var0, int var1, int var2, float[] var3) {
      field7104 = var0;
      field7102 = var1;
      field7101 = var2;
      field7103 = var3;
      method13671(0, 0, var1, var2);
   }

   @ObfuscatedSignature(descriptor = "([III[F)V")
   @ObfuscatedName("ef")
   protected static void method13665(int[] var0, int var1, int var2, float[] var3) {
      field7104 = var0;
      field7102 = var1;
      field7101 = var2;
      field7103 = var3;
      method13671(0, 0, var1, var2);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("em")
   public static void method13666() {
      field7097 = 0;
      field7096 = 0;
      field7099 = field7102;
      field7098 = field7101;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III[I[I)V")
   @ObfuscatedName("ha")
   public static void method13753(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * field7102;

      for (int var8 = 0; var8 < var3.length; var8++) {
         int var6 = var5 + var3[var8];

         for (int var7 = -var4[var8]; var7 < 0; var7++) {
            field7104[var6++] = var2;
         }

         var5 += field7102;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ei")
   public static void method13667() {
      field7097 = 0;
      field7096 = 0;
      field7099 = field7102;
      field7098 = field7101;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ee")
   public static void method13668() {
      field7097 = 0;
      field7096 = 0;
      field7099 = field7102;
      field7098 = field7101;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("eb")
   public static void method13672(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > field7102) {
         var2 = field7102;
      }

      if (var3 > field7101) {
         var3 = field7101;
      }

      field7097 = var0;
      field7096 = var1;
      field7099 = var2;
      field7098 = var3;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ep")
   public static void method13673(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > field7102) {
         var2 = field7102;
      }

      if (var3 > field7101) {
         var3 = field7101;
      }

      field7097 = var0;
      field7096 = var1;
      field7099 = var2;
      field7098 = var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("ec")
   public static void method13676(int[] var0) {
      var0[0] = field7097;
      var0[1] = field7096;
      var0[2] = field7099;
      var0[3] = field7098;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("fo")
   public static void method13677(int[] var0) {
      var0[0] = field7097;
      var0[1] = field7096;
      var0[2] = field7099;
      var0[3] = field7098;
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("es")
   public static void method13717(int var0, int var1, int var2, int var3) {
      if (var1 >= field7096 && var1 < field7098) {
         if (var0 < field7097) {
            var2 -= field7097 - var0;
            var0 = field7097;
         }

         if (var0 + var2 > field7099) {
            var2 = field7099 - var0;
         }

         int var4 = var0 + var1 * field7102;

         for (int var5 = 0; var5 < var2; var5++) {
            field7104[var4 + var5] = var3 | 0xFF000000;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("fj")
   public static void method13680(int[] var0) {
      field7097 = var0[0];
      field7096 = var0[1];
      field7099 = var0[2];
      field7098 = var0[3];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("fd")
   public static void method13681(int[] var0) {
      field7097 = var0[0];
      field7096 = var0[1];
      field7099 = var0[2];
      field7098 = var0[3];
   }

   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("ex")
   public static void method13745(int var0, int var1, int var2, int var3, int var4, int var5) {
      var5 |= -16777216;
      if (var4 <= 1) {
         method13732(var0, var1, var2, var3, var5);
      } else {
         int var6 = var4 / 2;
         int var7 = var4 - var6;
         int var8 = var2 - var0;
         int var9 = var3 - var1;
         if (var9 == 0) {
            int var30 = var0;
            int var34 = var2;
            if (var0 > var2) {
               var30 = var2;
               var34 = var0;
            }

            int var44 = var1 - var6;
            int var50 = var1 + var7;
            var44 = Math.max(var44, field7096);
            var50 = Math.min(var50, field7098 - 1);
            if (var44 <= var50) {
               var30 = Math.max(var30, field7097);
               var34 = Math.min(var34, field7099 - 1);
               if (var30 <= var34) {
                  for (int var55 = var44; var55 <= var50; var55++) {
                     method13717(var30, var55, var34 - var30 + 1, var5);
                  }
               }
            }
         } else if (var8 == 0) {
            int var28 = var1;
            int var32 = var3;
            if (var1 > var3) {
               var28 = var3;
               var32 = var1;
            }

            int var42 = var0 - var6;
            int var48 = var0 + var7;
            var42 = Math.max(var42, field7097);
            var48 = Math.min(var48, field7099 - 1);
            if (var42 <= var48) {
               var28 = Math.max(var28, field7096);
               var32 = Math.min(var32, field7098 - 1);
               if (var28 <= var32) {
                  for (int var54 = var42; var54 <= var48; var54++) {
                     method13723(var54, var28, var32 - var28 + 1, var5);
                  }
               }
            }
         } else {
            int var10 = Math.abs(var8);
            int var11 = Math.abs(var9);
            if (var10 == var11) {
               int var41 = var8 >= 0 ? 1 : -1;
               int var47 = var9 >= 0 ? 1 : -1;
               int var53 = -var47;
               int var57 = var41;
               int var59 = var0;
               int var61 = var1;

               for (int var63 = 0; var63 <= var10; var63++) {
                  for (int var65 = -var6; var65 <= var7 - 1; var65++) {
                     int var20 = var53 * var65;
                     int var21 = var57 * var65;
                     method13740(var59 + var20, var61 + var21, var5);
                     boolean var22 = (var63 & 1) != 0;
                     if (var22) {
                        method13740(var59 + var20 + 1, var61 + var21, var5);
                     }

                     method13740(var59 + var20 + var41, var61 + var21, var5);
                  }

                  var59 += var41;
                  var61 += var47;
               }
            } else {
               if (var10 >= var11) {
                  if (var2 < var0) {
                     int var12 = var0;
                     var0 = var2;
                     var2 = var12;
                     var12 = var1;
                     var1 = var3;
                     var3 = var12;
                  }

                  var8 = var2 - var0;
                  var9 = var3 - var1;
                  int var37 = (var1 << 16) + 32768;
                  int var14 = var9 << 16;
                  int var13;
                  if (var14 >= 0) {
                     var13 = (var14 + var8 / 2) / var8;
                  } else {
                     var13 = -((-var14 + var8 / 2) / var8);
                  }

                  int var15 = var13;
                  int var16 = var0;
                  if (var0 < field7097) {
                     var37 += var13 * (field7097 - var0);
                     var16 = field7097;
                  }

                  int var17 = Math.min(var2, field7099 - 1);

                  for (int var18 = var16; var18 <= var17; var18++) {
                     int var19 = var37 >> 16;
                     method13738(var18, var19, var6, var7, var5);
                     var37 += var15;
                  }
               } else {
                  if (var3 < var1) {
                     int var38 = var0;
                     var0 = var2;
                     var2 = var38;
                     var38 = var1;
                     var1 = var3;
                     var3 = var38;
                  }

                  var8 = var2 - var0;
                  var9 = var3 - var1;
                  int var40 = (var0 << 16) + 32768;
                  int var52 = var8 << 16;
                  int var46;
                  if (var52 >= 0) {
                     var46 = (var9 / 2 + var52) / var9;
                  } else {
                     var46 = -((var9 / 2 + -var52) / var9);
                  }

                  int var56 = var46;
                  int var58 = var1;
                  if (var1 < field7096) {
                     var40 += var46 * (field7096 - var1);
                     var58 = field7096;
                  }

                  int var60 = Math.min(var3, field7098 - 1);

                  for (int var62 = var58; var62 <= var60; var62++) {
                     int var64 = var40 >> 16;
                     method13733(var64, var62, var6, var7, var5);
                     var40 += var56;
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hy")
   public static void method13762() {
      if (field7103 != null) {
         int var0 = field7103.length;

         for (int var1 = 0; var1 < var0; var1++) {
            if (var1 % field7102 < field7102 / 2 && field7103[var1] > 0.0F) {
               float var3 = field7103[var1];
               float var4 = 150.75377F / (var3 - 1.0100503F);
               float var2 = var4 / 14925.0F / 1.0100503F;
               int var5 = (int)(255.0F * var2);
               field7104[var1] = var5 << 16 | var5 << 8 | var5;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fi")
   public static void method13684() {
      int var0 = 0;

      int var1;
      for (var1 = field7102 * field7101 - 7; var0 < var1; field7104[var0++] = 0) {
         field7104[var0++] = 0;
         field7104[var0++] = 0;
         field7104[var0++] = 0;
         field7104[var0++] = 0;
         field7104[var0++] = 0;
         field7104[var0++] = 0;
         field7104[var0++] = 0;
      }

      var1 += 7;

      while (var0 < var1) {
         field7104[var0++] = 0;
      }

      method13763();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("fb")
   static void method13687(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         method13749(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < field7096) {
            var4 = field7096;
         }

         int var5 = var1 + var2 + 1;
         if (var5 > field7098) {
            var5 = field7098;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         while (var6 < var1) {
            while (var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            int var12 = var0 - var8 + 1;
            if (var12 < field7097) {
               var12 = field7097;
            }

            int var13 = var0 + var8;
            if (var13 > field7099) {
               var13 = field7099;
            }

            int var14 = var12 + var6 * field7102;

            for (int var15 = var12; var15 < var13; var15++) {
               field7104[var14++] = var3;
            }

            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for (int var20 = var11 - var9; var6 < var5; var10 += var9++ + var9) {
            while (var20 > var7 && var10 > var7) {
               var20 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            int var21 = var0 - var8;
            if (var21 < field7097) {
               var21 = field7097;
            }

            int var22 = var0 + var8;
            if (var22 > field7099 - 1) {
               var22 = field7099 - 1;
            }

            int var23 = var21 + var6 * field7102;

            for (int var24 = var21; var24 <= var22; var24++) {
               field7104[var23++] = var3;
            }

            var6++;
            var20 += var9 + var9;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("fu")
   static void method13688(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         method13749(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < field7096) {
            var4 = field7096;
         }

         int var5 = var1 + var2 + 1;
         if (var5 > field7098) {
            var5 = field7098;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         while (var6 < var1) {
            while (var11 <= var7 || var10 <= var7) {
               var10 += var8 + var8;
               var11 += var8++ + var8;
            }

            int var12 = var0 - var8 + 1;
            if (var12 < field7097) {
               var12 = field7097;
            }

            int var13 = var0 + var8;
            if (var13 > field7099) {
               var13 = field7099;
            }

            int var14 = var12 + var6 * field7102;

            for (int var15 = var12; var15 < var13; var15++) {
               field7104[var14++] = var3;
            }

            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var9 * var9 + var7;
         var10 = var11 - var2;

         for (int var20 = var11 - var9; var6 < var5; var10 += var9++ + var9) {
            while (var20 > var7 && var10 > var7) {
               var20 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            int var21 = var0 - var8;
            if (var21 < field7097) {
               var21 = field7097;
            }

            int var22 = var0 + var8;
            if (var22 > field7099 - 1) {
               var22 = field7099 - 1;
            }

            int var23 = var21 + var6 * field7102;

            for (int var24 = var21; var24 <= var22; var24++) {
               field7104[var23++] = var3;
            }

            var6++;
            var20 += var9 + var9;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("fy")
   public static void method13682(int[] var0) {
      field7097 = var0[0];
      field7096 = var0[1];
      field7099 = var0[2];
      field7098 = var0[3];
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("fh")
   public static void method13690(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == -1969676568) {
            method13686(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = -40138706 - var4;
            int var6 = (var3 >> 16 & 0xFF) * var4;
            int var7 = (var3 >> 8 & 1362666771) * var4;
            int var8 = (var3 & -1521397522) * var4;
            int var12 = var1 - var2;
            if (var12 < field7096) {
               var12 = field7096;
            }

            int var13 = var1 + var2 + 1;
            if (var13 > field7098) {
               var13 = field7098;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            while (var14 < var1) {
               while (var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               int var20 = var0 - var16 + 1;
               if (var20 < field7097) {
                  var20 = field7097;
               }

               int var21 = var0 + var16;
               if (var21 > field7099) {
                  var21 = field7099;
               }

               int var22 = var20 + var14 * field7102;

               for (int var23 = var20; var23 < var21; var23++) {
                  int var9 = (field7104[var22] >> 16 & 0xFF) * var5;
                  int var10 = (field7104[var22] >> 8 & 0xFF) * var5;
                  int var11 = (field7104[var22] & 0xFF) * var5;
                  int var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  field7104[var22++] = var24;
               }

               var14++;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for (int var32 = var19 - var17; var14 < var13; var18 += var17++ + var17) {
               while (var32 > var15 && var18 > var15) {
                  var32 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               int var33 = var0 - var16;
               if (var33 < field7097) {
                  var33 = field7097;
               }

               int var34 = var0 + var16;
               if (var34 > field7099 - 1) {
                  var34 = field7099 - 1;
               }

               int var35 = var33 + var14 * field7102;

               for (int var36 = var33; var36 <= var34; var36++) {
                  int var25 = (field7104[var35] >> 16 & 0xFF) * var5;
                  int var26 = (field7104[var35] >> 8 & 888914291) * var5;
                  int var27 = (field7104[var35] & 0xFF) * var5;
                  int var37 = (var6 + var25 >> 8 << 16) + (var7 + var26 >> 8 << 8) + (var8 + var27 >> 8);
                  field7104[var35++] = var37;
               }

               var14++;
               var32 += var17 + var17;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("fq")
   public static void method13691(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == -98256181) {
            method13686(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 0xFF) * var4;
            int var7 = (var3 >> 8 & 0xFF) * var4;
            int var8 = (var3 & 1057685537) * var4;
            int var12 = var1 - var2;
            if (var12 < field7096) {
               var12 = field7096;
            }

            int var13 = var1 + var2 + 1;
            if (var13 > field7098) {
               var13 = field7098;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            while (var14 < var1) {
               while (var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               int var20 = var0 - var16 + 1;
               if (var20 < field7097) {
                  var20 = field7097;
               }

               int var21 = var0 + var16;
               if (var21 > field7099) {
                  var21 = field7099;
               }

               int var22 = var20 + var14 * field7102;

               for (int var23 = var20; var23 < var21; var23++) {
                  int var9 = (field7104[var22] >> 16 & -800630495) * var5;
                  int var10 = (field7104[var22] >> 8 & -320459936) * var5;
                  int var11 = (field7104[var22] & 1286427065) * var5;
                  int var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  field7104[var22++] = var24;
               }

               var14++;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for (int var32 = var19 - var17; var14 < var13; var18 += var17++ + var17) {
               while (var32 > var15 && var18 > var15) {
                  var32 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               int var33 = var0 - var16;
               if (var33 < field7097) {
                  var33 = field7097;
               }

               int var34 = var0 + var16;
               if (var34 > field7099 - 1) {
                  var34 = field7099 - 1;
               }

               int var35 = var33 + var14 * field7102;

               for (int var36 = var33; var36 <= var34; var36++) {
                  int var25 = (field7104[var35] >> 16 & 0xFF) * var5;
                  int var26 = (field7104[var35] >> 8 & 172350409) * var5;
                  int var27 = (field7104[var35] & 1086388237) * var5;
                  int var37 = (var6 + var25 >> 8 << 16) + (var7 + var26 >> 8 << 8) + (var8 + var27 >> 8);
                  field7104[var35++] = var37;
               }

               var14++;
               var32 += var17 + var17;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("go")
   public static void method13712(int var0, int var1, int var2, int var3, int var4, int var5) {
      method13722(var0, var1, var2, var4, var5);
      method13722(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         method13726(var0, var1 + 1, var3 - 2, var4, var5);
         method13726(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("gw")
   public static void method13724(int var0, int var1, int var2, int var3) {
      if (var0 >= field7097 && var0 < field7099) {
         if (var1 < field7096) {
            var2 -= field7096 - var1;
            var1 = field7096;
         }

         if (var1 + var2 > field7098) {
            var2 = field7098 - var1;
         }

         int var4 = var0 + var1 * field7102;

         for (int var5 = 0; var5 < var2; var5++) {
            field7104[var4 + var5 * field7102] = var3;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("fv")
   public static void method13697(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < field7097) {
         var2 -= field7097 - var0;
         var0 = field7097;
      }

      if (var1 < field7096) {
         var3 -= field7096 - var1;
         var1 = field7096;
      }

      if (var0 + var2 > field7099) {
         var2 = field7099 - var0;
      }

      if (var1 + var3 > field7098) {
         var3 = field7098 - var1;
      }

      int var5 = field7102 - var2;
      int var6 = var0 + var1 * field7102;

      for (int var7 = -var3; var7 < 0; var7++) {
         for (int var8 = -var2; var8 < 0; var8++) {
            field7104[var6++] = var4;
         }

         var6 += var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("hz")
   static void method13739(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= field7097 && var0 < field7099) {
         int var5 = var1 - var2;
         int var6 = var1 + var3;
         var5 = Math.max(var5, field7096);
         var6 = Math.min(var6, field7098 - 1);
         if (var5 <= var6) {
            method13723(var0, var5, var6 - var5 + 1, var4);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("fk")
   public static void method13700(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < field7097) {
            var2 -= field7097 - var0;
            var0 = field7097;
         }

         if (var1 < field7096) {
            var6 += (field7096 - var1) * var7;
            var3 -= field7096 - var1;
            var1 = field7096;
         }

         if (var0 + var2 > field7099) {
            var2 = field7099 - var0;
         }

         if (var1 + var3 > field7098) {
            var3 = field7098 - var1;
         }

         int var8 = field7102 - var2;
         int var9 = var0 + var1 * field7102;

         for (int var10 = -var3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & 0xFF00) * var11 + (var5 & 0xFF00) * var12 & 0xFF0000)
               >>> 8;

            for (int var14 = -var2; var14 < 0; var14++) {
               field7104[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("fx")
   public static void method13701(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < field7097) {
            var2 -= field7097 - var0;
            var0 = field7097;
         }

         if (var1 < field7096) {
            var6 += (field7096 - var1) * var7;
            var3 -= field7096 - var1;
            var1 = field7096;
         }

         if (var0 + var2 > field7099) {
            var2 = field7099 - var0;
         }

         if (var1 + var3 > field7098) {
            var3 = field7098 - var1;
         }

         int var8 = field7102 - var2;
         int var9 = var0 + var1 * field7102;

         for (int var10 = -var3; var10 < 0; var10++) {
            int var11 = -1538077871 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 1839508799) * var12 & -16711936)
                  + ((var4 & 0xFF00) * var11 + (var5 & 2108932512) * var12 & 0xFF0000)
               >>> 8;

            for (int var14 = -var2; var14 < 0; var14++) {
               field7104[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("fr")
   public static void method13702(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < field7097) {
            var2 -= field7097 - var0;
            var0 = field7097;
         }

         if (var1 < field7096) {
            var6 += (field7096 - var1) * var7;
            var3 -= field7096 - var1;
            var1 = field7096;
         }

         if (var0 + var2 > field7099) {
            var2 = field7099 - var0;
         }

         if (var1 + var3 > field7098) {
            var3 = field7098 - var1;
         }

         int var8 = field7102 - var2;
         int var9 = var0 + var1 * field7102;

         for (int var10 = -var3; var10 < 0; var10++) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = ((var4 & 16711935) * var11 + (var5 & 16711935) * var12 & -16711936) + ((var4 & 0xFF00) * var11 + (var5 & 0xFF00) * var12 & 0xFF0000)
               >>> 8;

            for (int var14 = -var2; var14 < 0; var14++) {
               field7104[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII[BIZ)V")
   @ObfuscatedName("fe")
   public static void method13705(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < field7102 && var1 < field7101) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > field7102) {
               var2 = field7102 - var0;
            }

            if (var1 + var3 > field7101) {
               var3 = field7101 - var1;
            }

            int var11 = var6.length / var7;
            int var12 = field7102 - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            if (!var8 || var13 == -1179605814 && var14 == 255) {
               int var25 = (var1 + var10) * field7102 + var0 + var9;

               for (int var26 = var1 + var10; var26 < var1 + var10 + var3; var26++) {
                  for (int var27 = var0 + var9; var27 < var0 + var9 + var2; var27++) {
                     int var28 = (var26 - var1) % var11;
                     int var29 = (var27 - var0) % var7;
                     if (var6[var28 * var7 + var29] != 0) {
                        field7104[var25++] = var5;
                     } else {
                        field7104[var25++] = var4;
                     }
                  }

                  var25 += var12;
               }
            } else {
               int var15 = (var1 + var10) * field7102 + var0 + var9;

               for (int var16 = var1 + var10; var16 < var1 + var10 + var3; var16++) {
                  for (int var17 = var0 + var9; var17 < var0 + var9 + var2; var17++) {
                     int var18 = (var16 - var1) % var11;
                     int var19 = (var17 - var0) % var7;
                     int var20 = var4;
                     if (var6[var18 * var7 + var19] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = field7104[var15];
                     int var24 = ((var20 & -74664821) * var21 + (var23 & -1586568485) * var22 & -16711936)
                           + ((var20 & 0xFF00) * var21 + (var23 & 1099160487) * var22 & -1515870253)
                        >> 8;
                     field7104[var15++] = var24;
                  }

                  var15 += var12;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("dz")
   public static void method13669() {
      field7097 = 0;
      field7096 = 0;
      field7099 = field7102;
      field7098 = field7101;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("dj")
   public static void method13698(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < field7097) {
         var2 -= field7097 - var0;
         var0 = field7097;
      }

      if (var1 < field7096) {
         var3 -= field7096 - var1;
         var1 = field7096;
      }

      if (var0 + var2 > field7099) {
         var2 = field7099 - var0;
      }

      if (var1 + var3 > field7098) {
         var3 = field7098 - var1;
      }

      int var5 = field7102 - var2;
      int var6 = var0 + var1 * field7102;

      for (int var7 = -var3; var7 < 0; var7++) {
         for (int var8 = -var2; var8 < 0; var8++) {
            field7104[var6++] = var4 | 0xFF000000;
         }

         var6 += var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII[BIZ)V")
   @ObfuscatedName("fc")
   public static void method13706(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, boolean var8) {
      if (var0 + var2 >= 0 && var1 + var3 >= 0) {
         if (var0 < field7102 && var1 < field7101) {
            int var9 = 0;
            int var10 = 0;
            if (var0 < 0) {
               var9 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var10 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > field7102) {
               var2 = field7102 - var0;
            }

            if (var1 + var3 > field7101) {
               var3 = field7101 - var1;
            }

            int var11 = var6.length / var7;
            int var12 = field7102 - var2;
            int var13 = var4 >>> 24;
            int var14 = var5 >>> 24;
            if (var8 && (var13 != 255 || var14 != 255)) {
               int var25 = (var1 + var10) * field7102 + var0 + var9;

               for (int var26 = var1 + var10; var26 < var1 + var10 + var3; var26++) {
                  for (int var27 = var0 + var9; var27 < var0 + var9 + var2; var27++) {
                     int var28 = (var26 - var1) % var11;
                     int var29 = (var27 - var0) % var7;
                     int var20 = var4;
                     if (var6[var28 * var7 + var29] != 0) {
                        var20 = var5;
                     }

                     int var21 = var20 >>> 24;
                     int var22 = 255 - var21;
                     int var23 = field7104[var25];
                     int var24 = ((var20 & 16711935) * var21 + (var23 & 16711935) * var22 & -16711936)
                           + ((var20 & 0xFF00) * var21 + (var23 & 0xFF00) * var22 & 0xFF0000)
                        >> 8;
                     field7104[var25++] = var24;
                  }

                  var25 += var12;
               }
            } else {
               int var15 = (var1 + var10) * field7102 + var0 + var9;

               for (int var16 = var1 + var10; var16 < var1 + var10 + var3; var16++) {
                  for (int var17 = var0 + var9; var17 < var0 + var9 + var2; var17++) {
                     int var18 = (var16 - var1) % var11;
                     int var19 = (var17 - var0) % var7;
                     if (var6[var18 * var7 + var19] != 0) {
                        field7104[var15++] = var5;
                     } else {
                        field7104[var15++] = var4;
                     }
                  }

                  var15 += var12;
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("fm")
   public static void method13708(int var0, int var1, int var2, int var3, int var4) {
      method13717(var0, var1, var2, var4);
      method13717(var0, var1 + var3 - 1, var2, var4);
      method13723(var0, var1, var3, var4);
      method13723(var0 + var2 - 1, var1, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("fa")
   public static void method13709(int var0, int var1, int var2, int var3, int var4) {
      method13717(var0, var1, var2, var4);
      method13717(var0, var1 + var3 - 1, var2, var4);
      method13723(var0, var1, var3, var4);
      method13723(var0 + var2 - 1, var1, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("hm")
   public static void method13746(int var0, int var1, int var2, int var3, int var4, int var5) {
      var5 |= -16777216;
      if (var4 <= 1) {
         method13732(var0, var1, var2, var3, var5);
      } else {
         int var6 = var4 / 2;
         int var7 = var4 - var6;
         int var8 = var2 - var0;
         int var9 = var3 - var1;
         if (var9 == 0) {
            int var30 = var0;
            int var34 = var2;
            if (var0 > var2) {
               var30 = var2;
               var34 = var0;
            }

            int var44 = var1 - var6;
            int var50 = var1 + var7;
            var44 = Math.max(var44, field7096);
            var50 = Math.min(var50, field7098 - 1);
            if (var44 <= var50) {
               var30 = Math.max(var30, field7097);
               var34 = Math.min(var34, field7099 - 1);
               if (var30 <= var34) {
                  for (int var55 = var44; var55 <= var50; var55++) {
                     method13717(var30, var55, var34 - var30 + 1, var5);
                  }
               }
            }
         } else if (var8 == 0) {
            int var28 = var1;
            int var32 = var3;
            if (var1 > var3) {
               var28 = var3;
               var32 = var1;
            }

            int var42 = var0 - var6;
            int var48 = var0 + var7;
            var42 = Math.max(var42, field7097);
            var48 = Math.min(var48, field7099 - 1);
            if (var42 <= var48) {
               var28 = Math.max(var28, field7096);
               var32 = Math.min(var32, field7098 - 1);
               if (var28 <= var32) {
                  for (int var54 = var42; var54 <= var48; var54++) {
                     method13723(var54, var28, var32 - var28 + 1, var5);
                  }
               }
            }
         } else {
            int var10 = Math.abs(var8);
            int var11 = Math.abs(var9);
            if (var10 == var11) {
               int var41 = var8 >= 0 ? 1 : -1;
               int var47 = var9 >= 0 ? 1 : -1;
               int var53 = -var47;
               int var57 = var41;
               int var59 = var0;
               int var61 = var1;

               for (int var63 = 0; var63 <= var10; var63++) {
                  for (int var65 = -var6; var65 <= var7 - 1; var65++) {
                     int var20 = var53 * var65;
                     int var21 = var57 * var65;
                     method13740(var59 + var20, var61 + var21, var5);
                     boolean var22 = (var63 & 1) != 0;
                     if (var22) {
                        method13740(var59 + var20 + 1, var61 + var21, var5);
                     }

                     method13740(var59 + var20 + var41, var61 + var21, var5);
                  }

                  var59 += var41;
                  var61 += var47;
               }
            } else {
               if (var10 >= var11) {
                  if (var2 < var0) {
                     int var12 = var0;
                     var0 = var2;
                     var2 = var12;
                     var12 = var1;
                     var1 = var3;
                     var3 = var12;
                  }

                  var8 = var2 - var0;
                  var9 = var3 - var1;
                  int var37 = (var1 << 16) + 32768;
                  int var14 = var9 << 16;
                  int var13;
                  if (var14 >= 0) {
                     var13 = (var14 + var8 / 2) / var8;
                  } else {
                     var13 = -((-var14 + var8 / 2) / var8);
                  }

                  int var15 = var13;
                  int var16 = var0;
                  if (var0 < field7097) {
                     var37 += var13 * (field7097 - var0);
                     var16 = field7097;
                  }

                  int var17 = Math.min(var2, field7099 - 1);

                  for (int var18 = var16; var18 <= var17; var18++) {
                     int var19 = var37 >> 16;
                     method13738(var18, var19, var6, var7, var5);
                     var37 += var15;
                  }
               } else {
                  if (var3 < var1) {
                     int var38 = var0;
                     var0 = var2;
                     var2 = var38;
                     var38 = var1;
                     var1 = var3;
                     var3 = var38;
                  }

                  var8 = var2 - var0;
                  var9 = var3 - var1;
                  int var40 = (var0 << 16) + 32768;
                  int var52 = var8 << 16;
                  int var46;
                  if (var52 >= 0) {
                     var46 = (var9 / 2 + var52) / var9;
                  } else {
                     var46 = -((var9 / 2 + -var52) / var9);
                  }

                  int var56 = var46;
                  int var58 = var1;
                  if (var1 < field7096) {
                     var40 += var46 * (field7096 - var1);
                     var58 = field7096;
                  }

                  int var60 = Math.min(var3, field7098 - 1);

                  for (int var62 = var58; var62 <= var60; var62++) {
                     int var64 = var40 >> 16;
                     method13733(var64, var62, var6, var7, var5);
                     var40 += var56;
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("gq")
   public static void method13713(int var0, int var1, int var2, int var3, int var4, int var5) {
      method13722(var0, var1, var2, var4, var5);
      method13722(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         method13726(var0, var1 + 1, var3 - 2, var4, var5);
         method13726(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("gb")
   public static void method13714(int var0, int var1, int var2, int var3, int var4, int var5) {
      method13722(var0, var1, var2, var4, var5);
      method13722(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         method13726(var0, var1 + 1, var3 - 2, var4, var5);
         method13726(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("gv")
   public static void method13715(int var0, int var1, int var2, int var3, int var4, int var5) {
      method13722(var0, var1, var2, var4, var5);
      method13722(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         method13726(var0, var1 + 1, var3 - 2, var4, var5);
         method13726(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("gk")
   public static void method13716(int var0, int var1, int var2, int var3, int var4, int var5) {
      method13722(var0, var1, var2, var4, var5);
      method13722(var0, var1 + var3 - 1, var2, var4, var5);
      if (var3 >= 3) {
         method13726(var0, var1 + 1, var3 - 2, var4, var5);
         method13726(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIIIIII)V")
   @ObfuscatedName("dp")
   public static void method13765(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = field7102;
      int var9 = field7097;
      int var10 = field7096;
      int var11 = field7099;
      int var12 = field7098;
      int[] var13 = field7104;
      if (!classOE.field4843.isGpu()) {
         int var34 = var7;
         int var33 = var6;
         int var32 = var5;
         int var31 = var4;
         int var30 = var3;
         int var29 = var2;
         int var28 = var1;
         int var27 = var0;
         if (var2 > 0 && var3 > 0) {
            int var35 = 0;
            int var36 = 65536 / var3;
            if (var0 < field7097) {
               var29 = var2 - (field7097 - var0);
               var27 = field7097;
            }

            if (var1 < field7096) {
               var35 += (field7096 - var1) * var36;
               var30 = var3 - (field7096 - var1);
               var28 = field7096;
            }

            if (var27 + var29 > field7099) {
               var29 = field7099 - var27;
            }

            if (var28 + var30 > field7098) {
               var30 = field7098 - var28;
            }

            int var37 = field7102 - var29;
            int var38 = var27 + var28 * field7102;

            for (int var39 = -var30; var39 < 0; var39++) {
               int var40 = 65536 - var35 >> 8;
               int var41 = var35 >> 8;
               int var42 = (var33 * var40 + var34 * var41 & 0xFF00) >>> 8;
               if (var42 == 0) {
                  var38 += field7102;
                  var35 += var36;
               } else {
                  int var43 = ((var31 & 16711935) * var40 + (var32 & 16711935) * var41 & -16711936)
                        + ((var31 & 0xFF00) * var40 + (var32 & 0xFF00) * var41 & 0xFF0000)
                     >>> 8;
                  int var44 = 255 - var42;
                  int var45 = ((var43 & 16711935) * var42 >> 8 & 16711935) + ((var43 & 0xFF00) * var42 >> 8 & 0xFF00);

                  for (int var46 = -var29; var46 < 0; var46++) {
                     int var47 = field7104[var38];
                     if (var47 == 0) {
                        field7104[var38++] = var45;
                     } else {
                        var47 = ((var47 & 16711935) * var44 >> 8 & 16711935) + ((var47 & 0xFF00) * var44 >> 8 & 0xFF00);
                        field7104[var38++] = var45 + var47;
                     }
                  }

                  var38 += var37;
                  var35 += var36;
               }
            }
         }
      } else {
         if (var2 > 0 && var3 > 0) {
            int var14 = 0;
            int var15 = 65536 / var3;
            if (var0 < var9) {
               var2 -= var9 - var0;
               var0 = var9;
            }

            if (var1 < var10) {
               var14 += (var10 - var1) * var15;
               var3 -= var10 - var1;
               var1 = var10;
            }

            if (var0 + var2 > var11) {
               var2 = var11 - var0;
            }

            if (var3 + var1 > var12) {
               var3 = var12 - var1;
            }

            int var16 = var8 - var2;
            int var17 = var0 + var8 * var1;

            for (int var18 = -var3; var18 < 0; var18++) {
               int var19 = 65536 - var14 >> 8;
               int var20 = var14 >> 8;
               int var21 = (var19 * var6 + var20 * var7 & 0xFF00) >>> 8;
               if (var21 == 0) {
                  var17 += var8;
                  var14 += var15;
               } else {
                  int var22 = (var20 * (var5 & 16711935) + var19 * (var4 & 16711935) & -16711936)
                        + (var20 * (var5 & 0xFF00) + var19 * (var4 & 0xFF00) & 0xFF0000)
                     >>> 8;
                  int var23 = 255 - var21;
                  int var24 = ((var22 & 16711935) * var21 >> 8 & 16711935) + (var21 * (var22 & 0xFF00) >> 8 & 0xFF00);

                  for (int var25 = -var2; var25 < 0; var25++) {
                     int var26 = var13[var17];
                     var26 = ((var26 & 16711935) * var23 >> 8 & 16711935) + (var23 * (var26 & 0xFF00) >> 8 & 0xFF00);
                     client.method2316(var13, var17++, var24 + var26, var21);
                  }

                  var17 += var16;
                  var14 += var15;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("gz")
   public static void method13718(int var0, int var1, int var2, int var3) {
      if (var1 >= field7096 && var1 < field7098) {
         if (var0 < field7097) {
            var2 -= field7097 - var0;
            var0 = field7097;
         }

         if (var0 + var2 > field7099) {
            var2 = field7099 - var0;
         }

         int var4 = var0 + var1 * field7102;

         for (int var5 = 0; var5 < var2; var5++) {
            field7104[var4 + var5] = var3;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gp")
   static void method13719(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= field7096 && var1 < field7098) {
         if (var0 < field7097) {
            var2 -= field7097 - var0;
            var0 = field7097;
         }

         if (var0 + var2 > field7099) {
            var2 = field7099 - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var12 = var0 + var1 * field7102;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (field7104[var12] >> 16 & 0xFF) * var5;
            int var10 = (field7104[var12] >> 8 & 0xFF) * var5;
            int var11 = (field7104[var12] & 0xFF) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field7104[var12++] = var14;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ga")
   static void method13720(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= field7096 && var1 < field7098) {
         if (var0 < field7097) {
            var2 -= field7097 - var0;
            var0 = field7097;
         }

         if (var0 + var2 > field7099) {
            var2 = field7099 - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var12 = var0 + var1 * field7102;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (field7104[var12] >> 16 & 0xFF) * var5;
            int var10 = (field7104[var12] >> 8 & 0xFF) * var5;
            int var11 = (field7104[var12] & 0xFF) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field7104[var12++] = var14;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gc")
   static void method13721(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= field7096 && var1 < field7098) {
         if (var0 < field7097) {
            var2 -= field7097 - var0;
            var0 = field7097;
         }

         if (var0 + var2 > field7099) {
            var2 = field7099 - var0;
         }

         int var5 = 375935749 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & -1646433636) * var4;
         int var12 = var0 + var1 * field7102;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (field7104[var12] >> 16 & 570638922) * var5;
            int var10 = (field7104[var12] >> 8 & -357701234) * var5;
            int var11 = (field7104[var12] & 0xFF) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field7104[var12++] = var14;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hf")
   static void method13750(int var0, int var1, int var2) {
      if (var0 >= field7097 && var1 >= field7096 && var0 < field7099 && var1 < field7098) {
         field7104[var0 + var1 * field7102] = var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ht")
   static void method13741(int var0, int var1, int var2) {
      if (var1 >= field7096 && var1 < field7098) {
         if (var0 >= field7097 && var0 < field7099) {
            field7104[var0 + var1 * field7102] = var2;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gn")
   static void method13727(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= field7097 && var0 < field7099) {
         if (var1 < field7096) {
            var2 -= field7096 - var1;
            var1 = field7096;
         }

         if (var1 + var2 > field7098) {
            var2 = field7098 - var1;
         }

         int var5 = 351626801 - var4;
         int var6 = (var3 >> 16 & 1472940376) * var4;
         int var7 = (var3 >> 8 & -462528268) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var12 = var0 + var1 * field7102;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (field7104[var12] >> 16 & 0xFF) * var5;
            int var10 = (field7104[var12] >> 8 & 440789947) * var5;
            int var11 = (field7104[var12] & -923438323) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field7104[var12] = var14;
            var12 += field7102;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gt")
   static void method13728(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= field7097 && var0 < field7099) {
         if (var1 < field7096) {
            var2 -= field7096 - var1;
            var1 = field7096;
         }

         if (var1 + var2 > field7098) {
            var2 = field7098 - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var12 = var0 + var1 * field7102;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (field7104[var12] >> 16 & 0xFF) * var5;
            int var10 = (field7104[var12] >> 8 & 0xFF) * var5;
            int var11 = (field7104[var12] & 0xFF) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field7104[var12] = var14;
            var12 += field7102;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gm")
   public static void method13729(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            method13717(var0, var1, var2 + 1, var4);
         } else {
            method13717(var0 + var2, var1, -var2 + 1, var4);
         }
      } else if (var2 == 0) {
         if (var3 >= 0) {
            method13723(var0, var1, var3 + 1, var4);
         } else {
            method13723(var0, var1 + var3, -var3 + 1, var4);
         }
      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         if (var2 > var3) {
            var1 <<= 16;
            var1 += 1969441020;
            var3 <<= 16;
            int var5 = (int)Math.floor((double)var3 / var2 + 0.5);
            var2 += var0;
            if (var0 < field7097) {
               var1 += var5 * (field7097 - var0);
               var0 = field7097;
            }

            if (var2 >= field7099) {
               var2 = field7099 - 1;
            }

            while (var0 <= var2) {
               int var6 = var1 >> 16;
               if (var6 >= field7096 && var6 < field7098) {
                  field7104[var0 + var6 * field7102] = var4;
               }

               var1 += var5;
               var0++;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            int var17 = (int)Math.floor((double)var2 / var3 + 0.5);
            var3 += var1;
            if (var1 < field7096) {
               var0 += var17 * (field7096 - var1);
               var1 = field7096;
            }

            if (var3 >= field7098) {
               var3 = field7098 - 1;
            }

            while (var1 <= var3) {
               int var18 = var0 >> 16;
               if (var18 >= field7097 && var18 < field7099) {
                  field7104[var18 + var1 * field7102] = var4;
               }

               var0 += var17;
               var1++;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gy")
   public static void method13730(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            method13717(var0, var1, var2 + 1, var4);
         } else {
            method13717(var0 + var2, var1, -var2 + 1, var4);
         }
      } else if (var2 == 0) {
         if (var3 >= 0) {
            method13723(var0, var1, var3 + 1, var4);
         } else {
            method13723(var0, var1 + var3, -var3 + 1, var4);
         }
      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            int var5 = (int)Math.floor((double)var3 / var2 + 0.5);
            var2 += var0;
            if (var0 < field7097) {
               var1 += var5 * (field7097 - var0);
               var0 = field7097;
            }

            if (var2 >= field7099) {
               var2 = field7099 - 1;
            }

            while (var0 <= var2) {
               int var6 = var1 >> 16;
               if (var6 >= field7096 && var6 < field7098) {
                  field7104[var0 + var6 * field7102] = var4;
               }

               var1 += var5;
               var0++;
            }
         } else {
            var0 <<= 16;
            var0 += 345029391;
            var2 <<= 16;
            int var17 = (int)Math.floor((double)var2 / var3 + 0.5);
            var3 += var1;
            if (var1 < field7096) {
               var0 += var17 * (field7096 - var1);
               var1 = field7096;
            }

            if (var3 >= field7098) {
               var3 = field7098 - 1;
            }

            while (var1 <= var3) {
               int var18 = var0 >> 16;
               if (var18 >= field7097 && var18 < field7099) {
                  field7104[var18 + var1 * field7102] = var4;
               }

               var0 += var17;
               var1++;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gs")
   public static void method13731(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            method13717(var0, var1, var2 + 1, var4);
         } else {
            method13717(var0 + var2, var1, -var2 + 1, var4);
         }
      } else if (var2 == 0) {
         if (var3 >= 0) {
            method13723(var0, var1, var3 + 1, var4);
         } else {
            method13723(var0, var1 + var3, -var3 + 1, var4);
         }
      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            int var5 = (int)Math.floor((double)var3 / var2 + 0.5);
            var2 += var0;
            if (var0 < field7097) {
               var1 += var5 * (field7097 - var0);
               var0 = field7097;
            }

            if (var2 >= field7099) {
               var2 = field7099 - 1;
            }

            while (var0 <= var2) {
               int var6 = var1 >> 16;
               if (var6 >= field7096 && var6 < field7098) {
                  field7104[var0 + var6 * field7102] = var4;
               }

               var1 += var5;
               var0++;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            int var17 = (int)Math.floor((double)var2 / var3 + 0.5);
            var3 += var1;
            if (var1 < field7096) {
               var0 += var17 * (field7096 - var1);
               var1 = field7096;
            }

            if (var3 >= field7098) {
               var3 = field7098 - 1;
            }

            while (var1 <= var3) {
               int var18 = var0 >> 16;
               if (var18 >= field7097 && var18 < field7099) {
                  field7104[var18 + var1 * field7102] = var4;
               }

               var0 += var17;
               var1++;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gj")
   static void method13734(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= field7096 && var1 < field7098) {
         int var5 = var0 - var2;
         int var6 = var0 + var3;
         var5 = Math.max(var5, field7097);
         var6 = Math.min(var6, field7099 - 1);
         if (var5 <= var6) {
            method13717(var5, var1, var6 - var5 + 1, var4);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("fg")
   public static void method13685() {
      int var0 = 0;

      int var1;
      for (var1 = field7102 * field7101 - 7; var0 < var1; field7104[var0++] = 0) {
         field7104[var0++] = 0;
         field7104[var0++] = 0;
         field7104[var0++] = 0;
         field7104[var0++] = 0;
         field7104[var0++] = 0;
         field7104[var0++] = 0;
         field7104[var0++] = 0;
      }

      var1 += 7;

      while (var0 < var1) {
         field7104[var0++] = 0;
      }

      method13763();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ge")
   static void method13735(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= field7096 && var1 < field7098) {
         int var5 = var0 - var2;
         int var6 = var0 + var3;
         var5 = Math.max(var5, field7097);
         var6 = Math.min(var6, field7099 - 1);
         if (var5 <= var6) {
            method13717(var5, var1, var6 - var5 + 1, var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("gg")
   public static void method13725(int var0, int var1, int var2, int var3) {
      if (var0 >= field7097 && var0 < field7099) {
         if (var1 < field7096) {
            var2 -= field7096 - var1;
            var1 = field7096;
         }

         if (var1 + var2 > field7098) {
            var2 = field7098 - var1;
         }

         int var4 = var0 + var1 * field7102;

         for (int var5 = 0; var5 < var2; var5++) {
            field7104[var4 + var5 * field7102] = var3;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I)V")
   @ObfuscatedName("fl")
   public static void method13678(int[] var0) {
      var0[0] = field7097;
      var0[1] = field7096;
      var0[2] = field7099;
      var0[3] = field7098;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hi")
   static void method13742(int var0, int var1, int var2) {
      if (var1 >= field7096 && var1 < field7098) {
         if (var0 >= field7097 && var0 < field7099) {
            field7104[var0 + var1 * field7102] = var2;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("eo")
   public static void method13763() {
      if (!classOE.field4843.isGpu() && field7103 != null) {
         if (field7097 == 0 && field7099 == field7102 && field7096 == 0 && field7098 == field7101) {
            int var16 = field7103.length;
            int var17 = var16 - (var16 & 7);

            int var18;
            for (var18 = 0; var18 < var17; field7103[var18++] = 0.0F) {
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
            }

            while (var18 < var16) {
               field7103[var18++] = 0.0F;
            }
         } else {
            int var0 = field7099 - field7097;
            int var1 = field7098 - field7096;
            int var2 = field7102 - var0;
            int var3 = field7097 + field7096 * field7102;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for (int var7 = -var1; var7 < 0; var7++) {
               if (var4 > 0) {
                  int var6 = var4;

                  do {
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                  } while (--var6 > 0);
               }

               if (var5 > 0) {
                  int var26 = var5;

                  do {
                     field7103[++var0] = 0.0F;
                  } while (--var26 > 0);
               }

               var0 += var2;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hd")
   static void method13743(int var0, int var1, int var2) {
      if (var1 >= field7096 && var1 < field7098) {
         if (var0 >= field7097 && var0 < field7099) {
            field7104[var0 + var1 * field7102] = var2;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ez")
   public static void method13670() {
      field7097 = 0;
      field7096 = 0;
      field7099 = field7102;
      field7098 = field7101;
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("fz")
   public static void method13692(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            method13686(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 0xFF) * var4;
            int var7 = (var3 >> 8 & 0xFF) * var4;
            int var8 = (var3 & 0xFF) * var4;
            int var12 = var1 - var2;
            if (var12 < field7096) {
               var12 = field7096;
            }

            int var13 = var1 + var2 + 1;
            if (var13 > field7098) {
               var13 = field7098;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            while (var14 < var1) {
               while (var19 <= var15 || var18 <= var15) {
                  var18 += var16 + var16;
                  var19 += var16++ + var16;
               }

               int var20 = var0 - var16 + 1;
               if (var20 < field7097) {
                  var20 = field7097;
               }

               int var21 = var0 + var16;
               if (var21 > field7099) {
                  var21 = field7099;
               }

               int var22 = var20 + var14 * field7102;

               for (int var23 = var20; var23 < var21; var23++) {
                  int var9 = (field7104[var22] >> 16 & 0xFF) * var5;
                  int var10 = (field7104[var22] >> 8 & 0xFF) * var5;
                  int var11 = (field7104[var22] & 0xFF) * var5;
                  int var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                  field7104[var22++] = var24;
               }

               var14++;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var17 * var17 + var15;
            var18 = var19 - var2;

            for (int var32 = var19 - var17; var14 < var13; var18 += var17++ + var17) {
               while (var32 > var15 && var18 > var15) {
                  var32 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               int var33 = var0 - var16;
               if (var33 < field7097) {
                  var33 = field7097;
               }

               int var34 = var0 + var16;
               if (var34 > field7099 - 1) {
                  var34 = field7099 - 1;
               }

               int var35 = var33 + var14 * field7102;

               for (int var36 = var33; var36 <= var34; var36++) {
                  int var25 = (field7104[var35] >> 16 & 0xFF) * var5;
                  int var26 = (field7104[var35] >> 8 & 0xFF) * var5;
                  int var27 = (field7104[var35] & 0xFF) * var5;
                  int var37 = (var6 + var25 >> 8 << 16) + (var7 + var26 >> 8 << 8) + (var8 + var27 >> 8);
                  field7104[var35++] = var37;
               }

               var14++;
               var32 += var17 + var17;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("fw")
   public static void method13710(int var0, int var1, int var2, int var3, int var4) {
      method13717(var0, var1, var2, var4);
      method13717(var0, var1 + var3 - 1, var2, var4);
      method13723(var0, var1, var3, var4);
      method13723(var0 + var2 - 1, var1, var3, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("hg")
   public static void method13747(int var0, int var1, int var2, int var3, int var4, int var5) {
      var5 |= -16777216;
      if (var4 <= 1) {
         method13732(var0, var1, var2, var3, var5);
      } else {
         int var6 = var4 / 2;
         int var7 = var4 - var6;
         int var8 = var2 - var0;
         int var9 = var3 - var1;
         if (var9 == 0) {
            int var30 = var0;
            int var34 = var2;
            if (var0 > var2) {
               var30 = var2;
               var34 = var0;
            }

            int var44 = var1 - var6;
            int var50 = var1 + var7;
            var44 = Math.max(var44, field7096);
            var50 = Math.min(var50, field7098 - 1);
            if (var44 <= var50) {
               var30 = Math.max(var30, field7097);
               var34 = Math.min(var34, field7099 - 1);
               if (var30 <= var34) {
                  for (int var55 = var44; var55 <= var50; var55++) {
                     method13717(var30, var55, var34 - var30 + 1, var5);
                  }
               }
            }
         } else if (var8 == 0) {
            int var28 = var1;
            int var32 = var3;
            if (var1 > var3) {
               var28 = var3;
               var32 = var1;
            }

            int var42 = var0 - var6;
            int var48 = var0 + var7;
            var42 = Math.max(var42, field7097);
            var48 = Math.min(var48, field7099 - 1);
            if (var42 <= var48) {
               var28 = Math.max(var28, field7096);
               var32 = Math.min(var32, field7098 - 1);
               if (var28 <= var32) {
                  for (int var54 = var42; var54 <= var48; var54++) {
                     method13723(var54, var28, var32 - var28 + 1, var5);
                  }
               }
            }
         } else {
            int var10 = Math.abs(var8);
            int var11 = Math.abs(var9);
            if (var10 == var11) {
               int var41 = var8 >= 0 ? 1 : -1;
               int var47 = var9 >= 0 ? 1 : -1;
               int var53 = -var47;
               int var57 = var41;
               int var59 = var0;
               int var61 = var1;

               for (int var63 = 0; var63 <= var10; var63++) {
                  for (int var65 = -var6; var65 <= var7 - 1; var65++) {
                     int var20 = var53 * var65;
                     int var21 = var57 * var65;
                     method13740(var59 + var20, var61 + var21, var5);
                     boolean var22 = (var63 & 1) != 0;
                     if (var22) {
                        method13740(var59 + var20 + 1, var61 + var21, var5);
                     }

                     method13740(var59 + var20 + var41, var61 + var21, var5);
                  }

                  var59 += var41;
                  var61 += var47;
               }
            } else {
               if (var10 >= var11) {
                  if (var2 < var0) {
                     int var12 = var0;
                     var0 = var2;
                     var2 = var12;
                     var12 = var1;
                     var1 = var3;
                     var3 = var12;
                  }

                  var8 = var2 - var0;
                  var9 = var3 - var1;
                  int var37 = (var1 << 16) + 32768;
                  int var14 = var9 << 16;
                  int var13;
                  if (var14 >= 0) {
                     var13 = (var14 + var8 / 2) / var8;
                  } else {
                     var13 = -((-var14 + var8 / 2) / var8);
                  }

                  int var15 = var13;
                  int var16 = var0;
                  if (var0 < field7097) {
                     var37 += var13 * (field7097 - var0);
                     var16 = field7097;
                  }

                  int var17 = Math.min(var2, field7099 - 1);

                  for (int var18 = var16; var18 <= var17; var18++) {
                     int var19 = var37 >> 16;
                     method13738(var18, var19, var6, var7, var5);
                     var37 += var15;
                  }
               } else {
                  if (var3 < var1) {
                     int var38 = var0;
                     var0 = var2;
                     var2 = var38;
                     var38 = var1;
                     var1 = var3;
                     var3 = var38;
                  }

                  var8 = var2 - var0;
                  var9 = var3 - var1;
                  int var40 = (var0 << 16) + 32768;
                  int var52 = var8 << 16;
                  int var46;
                  if (var52 >= 0) {
                     var46 = (var9 / 2 + var52) / var9;
                  } else {
                     var46 = -((var9 / 2 + -var52) / var9);
                  }

                  int var56 = var46;
                  int var58 = var1;
                  if (var1 < field7096) {
                     var40 += var46 * (field7096 - var1);
                     var58 = field7096;
                  }

                  int var60 = Math.min(var3, field7098 - 1);

                  for (int var62 = var58; var62 <= var60; var62++) {
                     int var64 = var40 >> 16;
                     method13733(var64, var62, var6, var7, var5);
                     var40 += var56;
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("hx")
   static void method13751(int var0, int var1, int var2) {
      if (var0 >= field7097 && var1 >= field7096 && var0 < field7099 && var1 < field7098) {
         field7104[var0 + var1 * field7102] = var2;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIIII)V")
   @ObfuscatedName("hp")
   public static void method13748(int var0, int var1, int var2, int var3, int var4, int var5) {
      var5 |= -16777216;
      if (var4 <= 1) {
         method13732(var0, var1, var2, var3, var5);
      } else {
         int var6 = var4 / 2;
         int var7 = var4 - var6;
         int var8 = var2 - var0;
         int var9 = var3 - var1;
         if (var9 == 0) {
            int var30 = var0;
            int var34 = var2;
            if (var0 > var2) {
               var30 = var2;
               var34 = var0;
            }

            int var44 = var1 - var6;
            int var50 = var1 + var7;
            var44 = Math.max(var44, field7096);
            var50 = Math.min(var50, field7098 - 1);
            if (var44 <= var50) {
               var30 = Math.max(var30, field7097);
               var34 = Math.min(var34, field7099 - 1);
               if (var30 <= var34) {
                  for (int var55 = var44; var55 <= var50; var55++) {
                     method13717(var30, var55, var34 - var30 + 1, var5);
                  }
               }
            }
         } else if (var8 == 0) {
            int var28 = var1;
            int var32 = var3;
            if (var1 > var3) {
               var28 = var3;
               var32 = var1;
            }

            int var42 = var0 - var6;
            int var48 = var0 + var7;
            var42 = Math.max(var42, field7097);
            var48 = Math.min(var48, field7099 - 1);
            if (var42 <= var48) {
               var28 = Math.max(var28, field7096);
               var32 = Math.min(var32, field7098 - 1);
               if (var28 <= var32) {
                  for (int var54 = var42; var54 <= var48; var54++) {
                     method13723(var54, var28, var32 - var28 + 1, var5);
                  }
               }
            }
         } else {
            int var10 = Math.abs(var8);
            int var11 = Math.abs(var9);
            if (var10 == var11) {
               int var41 = var8 >= 0 ? 1 : -1;
               int var47 = var9 >= 0 ? 1 : -1;
               int var53 = -var47;
               int var57 = var41;
               int var59 = var0;
               int var61 = var1;

               for (int var63 = 0; var63 <= var10; var63++) {
                  for (int var65 = -var6; var65 <= var7 - 1; var65++) {
                     int var20 = var53 * var65;
                     int var21 = var57 * var65;
                     method13740(var59 + var20, var61 + var21, var5);
                     boolean var22 = (var63 & 1) != 0;
                     if (var22) {
                        method13740(var59 + var20 + 1, var61 + var21, var5);
                     }

                     method13740(var59 + var20 + var41, var61 + var21, var5);
                  }

                  var59 += var41;
                  var61 += var47;
               }
            } else {
               if (var10 >= var11) {
                  if (var2 < var0) {
                     int var12 = var0;
                     var0 = var2;
                     var2 = var12;
                     var12 = var1;
                     var1 = var3;
                     var3 = var12;
                  }

                  var8 = var2 - var0;
                  var9 = var3 - var1;
                  int var37 = (var1 << 16) + 32768;
                  int var14 = var9 << 16;
                  int var13;
                  if (var14 >= 0) {
                     var13 = (var14 + var8 / 2) / var8;
                  } else {
                     var13 = -((-var14 + var8 / 2) / var8);
                  }

                  int var15 = var13;
                  int var16 = var0;
                  if (var0 < field7097) {
                     var37 += var13 * (field7097 - var0);
                     var16 = field7097;
                  }

                  int var17 = Math.min(var2, field7099 - 1);

                  for (int var18 = var16; var18 <= var17; var18++) {
                     int var19 = var37 >> 16;
                     method13738(var18, var19, var6, var7, var5);
                     var37 += var15;
                  }
               } else {
                  if (var3 < var1) {
                     int var38 = var0;
                     var0 = var2;
                     var2 = var38;
                     var38 = var1;
                     var1 = var3;
                     var3 = var38;
                  }

                  var8 = var2 - var0;
                  var9 = var3 - var1;
                  int var40 = (var0 << 16) + 32768;
                  int var52 = var8 << 16;
                  int var46;
                  if (var52 >= 0) {
                     var46 = (var9 / 2 + var52) / var9;
                  } else {
                     var46 = -((var9 / 2 + -var52) / var9);
                  }

                  int var56 = var46;
                  int var58 = var1;
                  if (var1 < field7096) {
                     var40 += var46 * (field7096 - var1);
                     var58 = field7096;
                  }

                  int var60 = Math.min(var3, field7098 - 1);

                  for (int var62 = var58; var62 <= var60; var62++) {
                     int var64 = var40 >> 16;
                     method13733(var64, var62, var6, var7, var5);
                     var40 += var56;
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III[I[I)V")
   @ObfuscatedName("hk")
   public static void method13754(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * field7102;

      for (int var8 = 0; var8 < var3.length; var8++) {
         int var6 = var5 + var3[var8];

         for (int var7 = -var4[var8]; var7 < 0; var7++) {
            field7104[var6++] = var2;
         }

         var5 += field7102;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III[I[I)V")
   @ObfuscatedName("hr")
   public static void method13755(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * field7102;

      for (int var8 = 0; var8 < var3.length; var8++) {
         int var6 = var5 + var3[var8];

         for (int var7 = -var4[var8]; var7 < 0; var7++) {
            field7104[var6++] = var2;
         }

         var5 += field7102;
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("el")
   public static void method13732(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            method13717(var0, var1, var2 + 1, var4);
         } else {
            method13717(var0 + var2, var1, -var2 + 1, var4);
         }
      } else if (var2 == 0) {
         if (var3 >= 0) {
            method13723(var0, var1, var3 + 1, var4);
         } else {
            method13723(var0, var1 + var3, -var3 + 1, var4);
         }
      } else {
         if (var2 + var3 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            int var5 = (int)Math.floor((double)var3 / var2 + 0.5);
            var2 += var0;
            if (var0 < field7097) {
               var1 += var5 * (field7097 - var0);
               var0 = field7097;
            }

            if (var2 >= field7099) {
               var2 = field7099 - 1;
            }

            while (var0 <= var2) {
               int var6 = var1 >> 16;
               if (var6 >= field7096 && var6 < field7098) {
                  field7104[var0 + var6 * field7102] = var4 | 0xFF000000;
               }

               var1 += var5;
               var0++;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            int var17 = (int)Math.floor((double)var2 / var3 + 0.5);
            var3 += var1;
            if (var1 < field7096) {
               var0 += var17 * (field7096 - var1);
               var1 = field7096;
            }

            if (var3 >= field7098) {
               var3 = field7098 - 1;
            }

            while (var1 <= var3) {
               int var18 = var0 >> 16;
               if (var18 >= field7097 && var18 < field7099) {
                  field7104[var18 + var1 * field7102] = var4 | 0xFF000000;
               }

               var0 += var17;
               var1++;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(III[I[I)V")
   @ObfuscatedName("ho")
   public static void method13756(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + var1 * field7102;

      for (int var8 = 0; var8 < var3.length; var8++) {
         int var6 = var5 + var3[var8];

         for (int var7 = -var4[var8]; var7 < 0; var7++) {
            field7104[var6++] = var2;
         }

         var5 += field7102;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hu")
   public static void method13757() {
      if (field7103 != null) {
         if (field7097 == 0 && field7099 == field7102 && field7096 == 0 && field7098 == field7101) {
            int var16 = field7103.length;
            int var17 = var16 - (var16 & 7);

            int var18;
            for (var18 = 0; var18 < var17; field7103[var18++] = 0.0F) {
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
            }

            while (var18 < var16) {
               field7103[var18++] = 0.0F;
            }
         } else {
            int var0 = field7099 - field7097;
            int var1 = field7098 - field7096;
            int var2 = field7102 - var0;
            int var3 = field7097 + field7096 * field7102;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for (int var7 = -var1; var7 < 0; var7++) {
               if (var4 > 0) {
                  int var6 = var4;

                  do {
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                  } while (--var6 > 0);
               }

               if (var5 > 0) {
                  int var26 = var5;

                  do {
                     field7103[++var0] = 0.0F;
                  } while (--var26 > 0);
               }

               var0 += var2;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hj")
   public static void method13758() {
      if (field7103 != null) {
         if (field7097 == 0 && field7099 == field7102 && field7096 == 0 && field7098 == field7101) {
            int var16 = field7103.length;
            int var17 = var16 - (var16 & 7);

            int var18;
            for (var18 = 0; var18 < var17; field7103[var18++] = 0.0F) {
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
            }

            while (var18 < var16) {
               field7103[var18++] = 0.0F;
            }
         } else {
            int var0 = field7099 - field7097;
            int var1 = field7098 - field7096;
            int var2 = field7102 - var0;
            int var3 = field7097 + field7096 * field7102;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for (int var7 = -var1; var7 < 0; var7++) {
               if (var4 > 0) {
                  int var6 = var4;

                  do {
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                  } while (--var6 > 0);
               }

               if (var5 > 0) {
                  int var26 = var5;

                  do {
                     field7103[++var0] = 0.0F;
                  } while (--var26 > 0);
               }

               var0 += var2;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("hq")
   public static void method13759() {
      if (field7103 != null) {
         if (field7097 == 0 && field7099 == field7102 && field7096 == 0 && field7098 == field7101) {
            int var16 = field7103.length;
            int var17 = var16 - (var16 & 7);

            int var18;
            for (var18 = 0; var18 < var17; field7103[var18++] = 0.0F) {
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
               field7103[var18++] = 0.0F;
            }

            while (var18 < var16) {
               field7103[var18++] = 0.0F;
            }
         } else {
            int var0 = field7099 - field7097;
            int var1 = field7098 - field7096;
            int var2 = field7102 - var0;
            int var3 = field7097 + field7096 * field7102;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for (int var7 = -var1; var7 < 0; var7++) {
               if (var4 > 0) {
                  int var6 = var4;

                  do {
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                     field7103[++var0] = 0.0F;
                  } while (--var6 > 0);
               }

               if (var5 > 0) {
                  int var26 = var5;

                  do {
                     field7103[++var0] = 0.0F;
                  } while (--var26 > 0);
               }

               var0 += var2;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("gx")
   static void method13736(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= field7096 && var1 < field7098) {
         int var5 = var0 - var2;
         int var6 = var0 + var3;
         var5 = Math.max(var5, field7097);
         var6 = Math.min(var6, field7099 - 1);
         if (var5 <= var6) {
            method13717(var5, var1, var6 - var5 + 1, var4);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIII)V")
   @ObfuscatedName("ej")
   static void method13722(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= field7096 && var1 < field7098) {
         if (var0 < field7097) {
            var2 -= field7097 - var0;
            var0 = field7097;
         }

         if (var0 + var2 > field7099) {
            var2 = field7099 - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 0xFF) * var4;
         int var7 = (var3 >> 8 & 0xFF) * var4;
         int var8 = (var3 & 0xFF) * var4;
         int var12 = var0 + var1 * field7102;

         for (int var13 = 0; var13 < var2; var13++) {
            int var9 = (field7104[var12] >> 16 & 0xFF) * var5;
            int var10 = (field7104[var12] >> 8 & 0xFF) * var5;
            int var11 = (field7104[var12] & 0xFF) * var5;
            int var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            client.method2316(field7104, var12++, var14, var4);
         }
      }
   }
}
