import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("rw")
public class classRW {
   @ObfuscatedName("av")
   float[] field5708;
   @ObfuscatedName("at")
   int field5709;
   @ToRemove(unused = "true")
   @ObfuscatedName("bg")
   static final int field5712 = 30;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field5710 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field5711 = 15;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([FIFZFZ[F)I")
   @ObfuscatedName("ag")
   public static int method9847(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var7 = 0.0F;

      for (int var8 = 0; var8 < 1 + var1; var8++) {
         var7 += Math.abs(var0[var8]);
      }

      float var41 = (Math.abs(var2) + Math.abs(var4)) * (1 + var1) * classFH.field1780;
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
         if (var1 == 0) {
            return var42;
         } else if (1 == var1) {
            var6[0] = -var9[0] / var9[1];
            boolean var44 = var3 ? var2 < var41 + var6[0] : var2 < var6[0] - var41;
            boolean var45 = var5 ? var4 > var6[0] - var41 : var4 > var6[0] + var41;
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
            classRW var11 = new classRW(var9, var1);
            float[] var12 = new float[var1 + 1];

            for (int var13 = 1; var13 <= var1; var13++) {
               var12[var13 - 1] = var9[var13] * var13;
            }

            float[] var46 = new float[var1 + 1];
            int var14 = class157.method4367(var12, var1 - 1, var2, false, var4, false, var46, -1793120611);
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
                  if (var20 == 0) {
                     var16 = var2;
                     var18 = ArchiveDiskActionHandler.method8885(var9, var1, var2, (byte)-20);
                     if (Math.abs(var18) <= var41 && var3) {
                        var6[var42++] = var2;
                     }
                  } else {
                     var16 = var19;
                     var18 = var17;
                  }

                  if (var20 == var14) {
                     var19 = var4;
                     var15 = false;
                  } else {
                     var19 = var46[var20];
                  }

                  var17 = ArchiveDiskActionHandler.method8885(var9, var1, var19, (byte)-118);
                  if (var15) {
                     var15 = false;
                  } else if (Math.abs(var17) < var41) {
                     if (var20 != var14 || var5) {
                        var6[var42++] = var19;
                        var15 = true;
                     }
                  } else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
                     int var22 = var42++;
                     float var24 = var16;
                     float var25 = var19;
                     float var26 = ArchiveDiskActionHandler.method8885(var11.field5708, var11.field5709 * 1718555529, var16, (byte)-100);
                     float var23;
                     if (Math.abs(var26) < classFH.field1780) {
                        var23 = var16;
                     } else {
                        float var27 = ArchiveDiskActionHandler.method8885(var11.field5708, 1718555529 * var11.field5709, var19, (byte)-67);
                        if (Math.abs(var27) < classFH.field1780) {
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

                              float var38 = classFH.field1781 * Math.abs(var25) + 0.0F;
                              float var39 = (var28 - var25) * 0.5F;
                              boolean var40 = Math.abs(var39) > var38 && 0.0F != var27;
                              if (var40) {
                                 if (!(Math.abs(var30) < var38) && !(Math.abs(var26) <= Math.abs(var27))) {
                                    float var34 = var27 / var26;
                                    float var31;
                                    float var32;
                                    if (var28 == var24) {
                                       var31 = var34 * (var39 * 2.0F);
                                       var32 = 1.0F - var34;
                                    } else {
                                       var32 = var26 / var35;
                                       float var33 = var27 / var35;
                                       var31 = var34 * (var32 * (2.0F * var39) * (var32 - var33) - (var33 - 1.0F) * (var25 - var24));
                                       var32 = (var33 - 1.0F) * (var32 - 1.0F) * (var34 - 1.0F);
                                    }

                                    if (var31 > 0.0) {
                                       var32 = -var32;
                                    } else {
                                       var31 = -var31;
                                    }

                                    var34 = var30;
                                    var30 = var29;
                                    if (2.0F * var31 < 3.0F * var39 * var32 - Math.abs(var38 * var32) && var31 < Math.abs(var34 * 0.5F * var32)) {
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

                                 var27 = ArchiveDiskActionHandler.method8885(var11.field5708, 1718555529 * var11.field5709, var25, (byte)-113);
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
                        var6[var42 - 2] = (var6[var42 - 2] + var6[var42 - 1]) * 0.5F;
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
   @ObfuscatedSignature(descriptor = "([FIFZFZ[F)I")
   @ObfuscatedName("an")
   public static int method9848(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var7 = 0.0F;

      for (int var8 = 0; var8 < 1 + var1; var8++) {
         var7 += Math.abs(var0[var8]);
      }

      float var41 = (Math.abs(var2) + Math.abs(var4)) * (1 + var1) * classFH.field1780;
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
         if (var1 == 0) {
            return var42;
         } else if (1 == var1) {
            var6[0] = -var9[0] / var9[1];
            boolean var44 = var3 ? var2 < var41 + var6[0] : var2 < var6[0] - var41;
            boolean var45 = var5 ? var4 > var6[0] - var41 : var4 > var6[0] + var41;
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
            classRW var11 = new classRW(var9, var1);
            float[] var12 = new float[var1 + 1];

            for (int var13 = 1; var13 <= var1; var13++) {
               var12[var13 - 1] = var9[var13] * var13;
            }

            float[] var46 = new float[var1 + 1];
            int var14 = class157.method4367(var12, var1 - 1, var2, false, var4, false, var46, -1793120611);
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
                  if (var20 == 0) {
                     var16 = var2;
                     var18 = ArchiveDiskActionHandler.method8885(var9, var1, var2, (byte)-43);
                     if (Math.abs(var18) <= var41 && var3) {
                        var6[var42++] = var2;
                     }
                  } else {
                     var16 = var19;
                     var18 = var17;
                  }

                  if (var20 == var14) {
                     var19 = var4;
                     var15 = false;
                  } else {
                     var19 = var46[var20];
                  }

                  var17 = ArchiveDiskActionHandler.method8885(var9, var1, var19, (byte)-44);
                  if (var15) {
                     var15 = false;
                  } else if (Math.abs(var17) < var41) {
                     if (var20 != var14 || var5) {
                        var6[var42++] = var19;
                        var15 = true;
                     }
                  } else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
                     int var22 = var42++;
                     float var24 = var16;
                     float var25 = var19;
                     float var26 = ArchiveDiskActionHandler.method8885(var11.field5708, var11.field5709 * 1718555529, var16, (byte)-75);
                     float var23;
                     if (Math.abs(var26) < classFH.field1780) {
                        var23 = var16;
                     } else {
                        float var27 = ArchiveDiskActionHandler.method8885(var11.field5708, 1718555529 * var11.field5709, var19, (byte)-43);
                        if (Math.abs(var27) < classFH.field1780) {
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

                              float var38 = classFH.field1781 * Math.abs(var25) + 0.0F;
                              float var39 = (var28 - var25) * 0.5F;
                              boolean var40 = Math.abs(var39) > var38 && 0.0F != var27;
                              if (var40) {
                                 if (!(Math.abs(var30) < var38) && !(Math.abs(var26) <= Math.abs(var27))) {
                                    float var34 = var27 / var26;
                                    float var31;
                                    float var32;
                                    if (var28 == var24) {
                                       var31 = var34 * (var39 * 2.0F);
                                       var32 = 1.0F - var34;
                                    } else {
                                       var32 = var26 / var35;
                                       float var33 = var27 / var35;
                                       var31 = var34 * (var32 * (2.0F * var39) * (var32 - var33) - (var33 - 1.0F) * (var25 - var24));
                                       var32 = (var33 - 1.0F) * (var32 - 1.0F) * (var34 - 1.0F);
                                    }

                                    if (var31 > 0.0) {
                                       var32 = -var32;
                                    } else {
                                       var31 = -var31;
                                    }

                                    var34 = var30;
                                    var30 = var29;
                                    if (2.0F * var31 < 3.0F * var39 * var32 - Math.abs(var38 * var32) && var31 < Math.abs(var34 * 0.5F * var32)) {
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

                                 var27 = ArchiveDiskActionHandler.method8885(var11.field5708, 1718555529 * var11.field5709, var25, (byte)-27);
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
                        var6[var42 - 2] = (var6[var42 - 2] + var6[var42 - 1]) * 0.5F;
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
   @ObfuscatedName("ak")
   static float method9850(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for (int var4 = var1 - 1; var4 >= 0; var4--) {
         var3 = var0[var4] + var3 * var2;
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([FIFZFZ[F)I")
   @ObfuscatedName("ae")
   public static int method9849(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var7 = 0.0F;

      for (int var8 = 0; var8 < 1 + var1; var8++) {
         var7 += Math.abs(var0[var8]);
      }

      float var41 = (Math.abs(var2) + Math.abs(var4)) * (1 + var1) * classFH.field1780;
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
         if (var1 == 0) {
            return var42;
         } else if (1 == var1) {
            var6[0] = -var9[0] / var9[1];
            boolean var44 = var3 ? var2 < var41 + var6[0] : var2 < var6[0] - var41;
            boolean var45 = var5 ? var4 > var6[0] - var41 : var4 > var6[0] + var41;
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
            classRW var11 = new classRW(var9, var1);
            float[] var12 = new float[var1 + 1];

            for (int var13 = 1; var13 <= var1; var13++) {
               var12[var13 - 1] = var9[var13] * var13;
            }

            float[] var46 = new float[var1 + 1];
            int var14 = class157.method4367(var12, var1 - 1, var2, false, var4, false, var46, -1793120611);
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
                  if (var20 == 0) {
                     var16 = var2;
                     var18 = ArchiveDiskActionHandler.method8885(var9, var1, var2, (byte)-99);
                     if (Math.abs(var18) <= var41 && var3) {
                        var6[var42++] = var2;
                     }
                  } else {
                     var16 = var19;
                     var18 = var17;
                  }

                  if (var20 == var14) {
                     var19 = var4;
                     var15 = false;
                  } else {
                     var19 = var46[var20];
                  }

                  var17 = ArchiveDiskActionHandler.method8885(var9, var1, var19, (byte)-109);
                  if (var15) {
                     var15 = false;
                  } else if (Math.abs(var17) < var41) {
                     if (var20 != var14 || var5) {
                        var6[var42++] = var19;
                        var15 = true;
                     }
                  } else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
                     int var22 = var42++;
                     float var24 = var16;
                     float var25 = var19;
                     float var26 = ArchiveDiskActionHandler.method8885(var11.field5708, var11.field5709 * 1718555529, var16, (byte)-122);
                     float var23;
                     if (Math.abs(var26) < classFH.field1780) {
                        var23 = var16;
                     } else {
                        float var27 = ArchiveDiskActionHandler.method8885(var11.field5708, 1718555529 * var11.field5709, var19, (byte)-40);
                        if (Math.abs(var27) < classFH.field1780) {
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

                              float var38 = classFH.field1781 * Math.abs(var25) + 0.0F;
                              float var39 = (var28 - var25) * 0.5F;
                              boolean var40 = Math.abs(var39) > var38 && 0.0F != var27;
                              if (var40) {
                                 if (!(Math.abs(var30) < var38) && !(Math.abs(var26) <= Math.abs(var27))) {
                                    float var34 = var27 / var26;
                                    float var31;
                                    float var32;
                                    if (var28 == var24) {
                                       var31 = var34 * (var39 * 2.0F);
                                       var32 = 1.0F - var34;
                                    } else {
                                       var32 = var26 / var35;
                                       float var33 = var27 / var35;
                                       var31 = var34 * (var32 * (2.0F * var39) * (var32 - var33) - (var33 - 1.0F) * (var25 - var24));
                                       var32 = (var33 - 1.0F) * (var32 - 1.0F) * (var34 - 1.0F);
                                    }

                                    if (var31 > 0.0) {
                                       var32 = -var32;
                                    } else {
                                       var31 = -var31;
                                    }

                                    var34 = var30;
                                    var30 = var29;
                                    if (2.0F * var31 < 3.0F * var39 * var32 - Math.abs(var38 * var32) && var31 < Math.abs(var34 * 0.5F * var32)) {
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

                                 var27 = ArchiveDiskActionHandler.method8885(var11.field5708, 1718555529 * var11.field5709, var25, (byte)-46);
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
                        var6[var42 - 2] = (var6[var42 - 2] + var6[var42 - 1]) * 0.5F;
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
   @ObfuscatedName("aj")
   static float method9851(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for (int var4 = var1 - 1; var4 >= 0; var4--) {
         var3 = var0[var4] + var3 * var2;
      }

      return var3;
   }

   classRW(float[] var1, int var2) {
      this.field5708 = var1;
      this.field5709 = var2 * 376525497;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([FIF)F")
   @ObfuscatedName("aw")
   static float method9852(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for (int var4 = var1 - 1; var4 >= 0; var4--) {
         var3 = var0[var4] + var3 * var2;
      }

      return var3;
   }
}
