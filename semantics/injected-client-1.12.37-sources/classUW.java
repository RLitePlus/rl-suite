import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("uw")
public class classUW {
   @ObfuscatedName("az")
   float[] field6407;
   @ObfuscatedName("af")
   int field6406;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6408 = 4;
   @ObfuscatedName("px")
   static int field6409;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([FIF)F")
   @ObfuscatedName("as")
   static float method11674(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for (int var4 = var1 - 1; var4 >= 0; var4--) {
         var3 = var2 * var3 + var0[var4];
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([FIFZFZ[F)I")
   @ObfuscatedName("ae")
   public static int method11673(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var7 = 0.0F;

      for (int var8 = 0; var8 < var1 + 1; var8++) {
         var7 += Math.abs(var0[var8]);
      }

      float var41 = (Math.abs(var2) + Math.abs(var4)) * (1 + var1) * classST.field6039;
      if (var7 <= var41) {
         return -1;
      } else {
         float[] var9 = new float[1 + var1];

         for (int var10 = 0; var10 < var1 + 1; var10++) {
            var9[var10] = var0[var10] * (1.0F / var7);
         }

         while (Math.abs(var9[var1]) < var41) {
            var1--;
         }

         int var42 = 0;
         if (0 == var1) {
            return var42;
         } else if (var1 == 1) {
            var6[0] = -var9[0] / var9[1];
            boolean var44 = var3 ? var2 < var41 + var6[0] : var2 < var6[0] - var41;
            boolean var45 = var5 ? var4 > var6[0] - var41 : var4 > var41 + var6[0];
            var42 = var44 && var45 ? 1 : 0;
            if (var42 > 0) {
               if (var3 && var6[0] < var2) {
                  var6[0] = var2;
               } else if (var5 && var6[0] > var4) {
                  var6[0] = var4;
               }
            }

            return var42;
         } else {
            classUW var11 = new classUW(var9, var1);
            float[] var12 = new float[1 + var1];

            for (int var13 = 1; var13 <= var1; var13++) {
               var12[var13 - 1] = var9[var13] * var13;
            }

            float[] var46 = new float[1 + var1];
            int var14 = classEL.method3916(var12, var1 - 1, var2, false, var4, false, var46, 1212136566);
            if (var14 == -1) {
               return 0;
            } else {
               boolean var15 = false;
               float var17 = 0.0F;
               float var18 = 0.0F;
               float var19 = 0.0F;

               for (int var20 = 0; var20 <= var14; var20++) {
                  if (var42 > var1) {
                     return var42;
                  }

                  float var16;
                  if (0 == var20) {
                     var16 = var2;
                     var18 = classGF.method5427(var9, var1, var2, (byte)10);
                     if (Math.abs(var18) <= var41 && var3) {
                        var6[var42++] = var2;
                     }
                  } else {
                     var16 = var19;
                     var18 = var17;
                  }

                  if (var14 == var20) {
                     var19 = var4;
                     var15 = false;
                  } else {
                     var19 = var46[var20];
                  }

                  var17 = classGF.method5427(var9, var1, var19, (byte)10);
                  if (var15) {
                     var15 = false;
                  } else if (Math.abs(var17) < var41) {
                     if (var14 != var20 || var5) {
                        var6[var42++] = var19;
                        var15 = true;
                     }
                  } else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
                     int var22 = var42++;
                     float var24 = var16;
                     float var25 = var19;
                     float var26 = classGF.method5427(var11.field6407, var11.field6406 * -234790521, var16, (byte)10);
                     float var23;
                     if (Math.abs(var26) < classST.field6039) {
                        var23 = var16;
                     } else {
                        float var27 = classGF.method5427(var11.field6407, -234790521 * var11.field6406, var19, (byte)10);
                        if (Math.abs(var27) < classST.field6039) {
                           var23 = var19;
                        } else {
                           float var28 = 0.0F;
                           float var29 = 0.0F;
                           float var30 = 0.0F;
                           float var35 = 0.0F;
                           boolean var36 = true;
                           boolean var37 = false;

                           do {
                              var37 = false;
                              if (var36) {
                                 var28 = var24;
                                 var35 = var26;
                                 var29 = var25 - var24;
                                 var30 = var29;
                                 var36 = false;
                              }

                              if (Math.abs(var35) < Math.abs(var27)) {
                                 var24 = var25;
                                 var25 = var28;
                                 var28 = var24;
                                 var26 = var27;
                                 var27 = var35;
                                 var35 = var26;
                              }

                              float var38 = classST.field6040 * Math.abs(var25) + 0.0F;
                              float var39 = 0.5F * (var28 - var25);
                              boolean var40 = Math.abs(var39) > var38 && var27 != 0.0F;
                              if (var40) {
                                 if (!(Math.abs(var30) < var38) && !(Math.abs(var26) <= Math.abs(var27))) {
                                    float var34 = var27 / var26;
                                    float var31;
                                    float var32;
                                    if (var24 == var28) {
                                       var31 = var34 * (var39 * 2.0F);
                                       var32 = 1.0F - var34;
                                    } else {
                                       var32 = var26 / var35;
                                       float var33 = var27 / var35;
                                       var31 = var34 * (var39 * 2.0F * var32 * (var32 - var33) - (var25 - var24) * (var33 - 1.0F));
                                       var32 = (var33 - 1.0F) * (var32 - 1.0F) * (var34 - 1.0F);
                                    }

                                    if (var31 > 0.0) {
                                       var32 = -var32;
                                    } else {
                                       var31 = -var31;
                                    }

                                    var34 = var30;
                                    var30 = var29;
                                    if (var31 * 2.0F < var32 * (var39 * 3.0F) - Math.abs(var38 * var32) && var31 < Math.abs(0.5F * var34 * var32)) {
                                       var29 = var31 / var32;
                                    } else {
                                       var29 = var39;
                                       var30 = var39;
                                    }
                                 } else {
                                    var29 = var39;
                                    var30 = var39;
                                 }

                                 var24 = var25;
                                 var26 = var27;
                                 if (Math.abs(var29) > var38) {
                                    var25 += var29;
                                 } else if (var39 > 0.0) {
                                    var25 += var38;
                                 } else {
                                    var25 -= var38;
                                 }

                                 var27 = classGF.method5427(var11.field6407, -234790521 * var11.field6406, var25, (byte)10);
                                 if (var27 * (var35 / Math.abs(var35)) > 0.0) {
                                    var36 = true;
                                    var37 = true;
                                 } else {
                                    var37 = true;
                                 }
                              }
                           } while (var37);

                           var23 = var25;
                        }
                     }

                     var6[var22] = var23;
                     if (var42 > 1 && var6[var42 - 2] >= var6[var42 - 1] - var41) {
                        var6[var42 - 2] = 0.5F * (var6[var42 - 1] + var6[var42 - 2]);
                        var42--;
                     }
                  }
               }

               return var42;
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([FIF)F")
   @ObfuscatedName("ab")
   static float method11675(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for (int var4 = var1 - 1; var4 >= 0; var4--) {
         var3 = var2 * var3 + var0[var4];
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([FIF)F")
   @ObfuscatedName("ag")
   static float method11676(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for (int var4 = var1 - 1; var4 >= 0; var4--) {
         var3 = var2 * var3 + var0[var4];
      }

      return var3;
   }

   classUW(float[] var1, int var2) {
      this.field6407 = var1;
      this.field6406 = var2 * -593587145;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([FIF)F")
   @ObfuscatedName("ax")
   static float method11677(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for (int var4 = var1 - 1; var4 >= 0; var4--) {
         var3 = var2 * var3 + var0[var4];
      }

      return var3;
   }
}
