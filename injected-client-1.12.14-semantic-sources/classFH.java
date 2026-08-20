import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fh")
public class classFH {
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field1786 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final float field1783 = 0.6666667F;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final float field1784 = 0.33333334F;
   @ObfuscatedName("an")
   public static final float field1780 = Math.ulp(1.0F);
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final float field1782 = 1.3333334F;
   @ObfuscatedName("ii")
   static long field1789;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field1787 = 15;
   @ObfuscatedName("ae")
   public static final float field1781 = field1780 * 2.0F;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   public static final int field1785 = 1402;
   @ToRemove(unused = "true")
   @ObfuscatedName("cd")
   static final int field1788 = 59;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;FFFFFFFF)V")
   @ObfuscatedName("as")
   static void method3989(classFT var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         float var9 = var4 - var1;
         if (0.0F != var9) {
            float var10 = var2 - var1;
            float var11 = var3 - var1;
            float[] var12 = new float[]{var10 / var9, var11 / var9};
            var0.field1884 = var12[0] == 0.33333334F && 0.6666667F == var12[1];
            float var13 = var12[0];
            float var14 = var12[1];
            if (var12[0] < 0.0F) {
               var12[0] = 0.0F;
            }

            if (var12[1] > 1.0F) {
               var12[1] = 1.0F;
            }

            if (var12[0] > 1.0F || var12[1] < -1.0F) {
               var12[1] = 1.0F - var12[1];
               if (var12[0] < 0.0F) {
                  var12[0] = 0.0F;
               }

               if (var12[1] < 0.0F) {
                  var12[1] = 0.0F;
               }

               if (var12[0] > 1.0F || var12[1] > 1.0F) {
                  float var15 = (var12[0] - 2.0F + var12[1]) * var12[0] + (var12[1] - 2.0F) * var12[1] + 1.0F;
                  if (var15 + field1780 > 0.0F) {
                     InterfaceParent.method3002(var12, 16887399);
                  }
               }

               var12[1] = 1.0F - var12[1];
            }

            if (var12[0] != var13) {
               var2 = var1 + var12[0] * var9;
               if (var13 != 0.0F) {
                  var6 = var5 + var12[0] * (var6 - var5) / var13;
               }
            }

            if (var14 != var12[1]) {
               var3 = var9 * var12[1] + var1;
               if (var14 != 1.0F) {
                  var7 = var8 - (1.0F - var12[1]) * (var8 - var7) / (1.0F - var14);
               }
            }

            var0.field1872 = var1;
            var0.field1877 = var4;
            class142.method4015(0.0F, var12[0], var12[1], 1.0F, var0, 393782435);
            float var21 = var6 - var5;
            float var16 = var7 - var6;
            float var17 = var8 - var7;
            float var18 = var16 - var21;
            var0.field1868 = var17 - var16 - var18;
            var0.field1875 = var18 + var18 + var18;
            var0.field1871 = var21 + var21 + var21;
            var0.field1869 = var5;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;F)F")
   @ObfuscatedName("ak")
   static float method3984(classFT var0, float var1) {
      if (var0 == null || classFT.method4131(var0, (byte)-43) == 0) {
         return 0.0F;
      } else if (!(var1 < var0.field1888[0].field1818 * 1463778254)) {
         if (var1 > var0.field1888[classFT.method4131(var0, (byte)5) - 1].field1818 * -275522466) {
            return var0.field1883 == class137.field1790
               ? var0.field1888[classFT.method4131(var0, (byte)-67) - 1].field1816
               : class175.method4230(var0, var1, false, 332738647);
         } else if (var0.field1885) {
            return var0.field1888[0].field1816;
         } else {
            class134 var2 = var0.method4126(var1, -1521032351);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
               return 0.0F;
            } else {
               if (0.0F == var2.field1814 && 0.0F == var2.field1815) {
                  var3 = true;
               } else if (var2.field1814 == Float.MAX_VALUE && var2.field1815 == Float.MAX_VALUE) {
                  var4 = true;
               } else if (null != var2.field1820) {
                  if (var0.field1866) {
                     float var5 = 1994604433 * var2.field1818;
                     float var9 = var2.field1816;
                     float var6 = var5 + var2.field1814 * 0.33333334F;
                     float var10 = var9 + 0.33333334F * var2.field1815;
                     float var8 = var2.field1820.field1818 * 1994604433;
                     float var12 = var2.field1820.field1816;
                     float var7 = var8 - 0.33333334F * var2.field1820.field1812;
                     float var11 = var12 - var2.field1820.field1813 * 0.33333334F;
                     if (var0.field1886) {
                        ItemComposition.method5026(var0, var5, var6, var7, var8, var9, var10, var11, var12, 721815198);
                     } else {
                        ObjectSound.method2678(var0, var5, var6, var7, var8, var9, var10, var11, var12, -509240052);
                     }

                     var0.field1866 = false;
                  }
               } else {
                  var3 = true;
               }

               if (var3) {
                  return var2.field1816;
               } else if (var4) {
                  return var1 != -859226723 * var2.field1818 && null != var2.field1820 ? var2.field1820.field1816 : var2.field1816;
               } else if (var0.field1886) {
                  float var14;
                  if (null == var0) {
                     var14 = 0.0F;
                  } else {
                     float var16;
                     if (var1 == var0.field1872) {
                        var16 = 0.0F;
                     } else if (var0.field1877 == var1) {
                        var16 = 1.0F;
                     } else {
                        var16 = (var1 - var0.field1872) / (var0.field1877 - var0.field1872);
                     }

                     float var17;
                     if (var0.field1884) {
                        var17 = var16;
                     } else {
                        float[] var18 = new float[4];
                        var18[3] = var0.field1879;
                        var18[2] = var0.field1876;
                        var18[1] = var0.field1878;
                        var18[0] = var0.field1874 - var16;
                        float[] var19 = new float[5];
                        int var20 = class157.method4367(var18, 3, 0.0F, true, 1.0F, true, var19, -1793120611);
                        if (var20 == 1) {
                           var17 = var19[0];
                        } else {
                           var17 = 0.0F;
                        }
                     }

                     var14 = (var0.field1871 + var17 * (var0.field1868 * var17 + var0.field1875)) * var17 + var0.field1869;
                  }

                  return var14;
               } else {
                  float var13;
                  if (var0 == null) {
                     var13 = 0.0F;
                  } else {
                     float var15 = var1 - var0.field1872;
                     var13 = var0.field1879 + var15 * (var0.field1876 + (var0.field1874 * var15 + var0.field1878) * var15);
                  }

                  return var13;
               }
            }
         }
      } else {
         return class137.field1790 == var0.field1882 ? var0.field1888[0].field1816 : class175.method4230(var0, var1, true, -478370112);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;F)F")
   @ObfuscatedName("aw")
   static float method3985(classFT var0, float var1) {
      if (var0 == null || classFT.method4131(var0, (byte)-6) == 0) {
         return 0.0F;
      } else if (!(var1 < var0.field1888[0].field1818 * 1994604433)) {
         if (var1 > var0.field1888[classFT.method4131(var0, (byte)-57) - 1].field1818 * 1994604433) {
            return var0.field1883 == class137.field1790
               ? var0.field1888[classFT.method4131(var0, (byte)10) - 1].field1816
               : class175.method4230(var0, var1, false, -1645948338);
         } else if (var0.field1885) {
            return var0.field1888[0].field1816;
         } else {
            class134 var2 = var0.method4126(var1, -2030743022);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
               return 0.0F;
            } else {
               if (0.0F == var2.field1814 && 0.0F == var2.field1815) {
                  var3 = true;
               } else if (var2.field1814 == Float.MAX_VALUE && var2.field1815 == Float.MAX_VALUE) {
                  var4 = true;
               } else if (null != var2.field1820) {
                  if (var0.field1866) {
                     float var5 = 1994604433 * var2.field1818;
                     float var9 = var2.field1816;
                     float var6 = var5 + var2.field1814 * 0.33333334F;
                     float var10 = var9 + 0.33333334F * var2.field1815;
                     float var8 = var2.field1820.field1818 * 1994604433;
                     float var12 = var2.field1820.field1816;
                     float var7 = var8 - 0.33333334F * var2.field1820.field1812;
                     float var11 = var12 - var2.field1820.field1813 * 0.33333334F;
                     if (var0.field1886) {
                        ItemComposition.method5026(var0, var5, var6, var7, var8, var9, var10, var11, var12, 1833387899);
                     } else {
                        ObjectSound.method2678(var0, var5, var6, var7, var8, var9, var10, var11, var12, -509240052);
                     }

                     var0.field1866 = false;
                  }
               } else {
                  var3 = true;
               }

               if (var3) {
                  return var2.field1816;
               } else if (var4) {
                  return var1 != 1994604433 * var2.field1818 && null != var2.field1820 ? var2.field1820.field1816 : var2.field1816;
               } else if (var0.field1886) {
                  float var14;
                  if (null == var0) {
                     var14 = 0.0F;
                  } else {
                     float var16;
                     if (var1 == var0.field1872) {
                        var16 = 0.0F;
                     } else if (var0.field1877 == var1) {
                        var16 = 1.0F;
                     } else {
                        var16 = (var1 - var0.field1872) / (var0.field1877 - var0.field1872);
                     }

                     float var17;
                     if (var0.field1884) {
                        var17 = var16;
                     } else {
                        float[] var18 = new float[4];
                        var18[3] = var0.field1879;
                        var18[2] = var0.field1876;
                        var18[1] = var0.field1878;
                        var18[0] = var0.field1874 - var16;
                        float[] var19 = new float[5];
                        int var20 = class157.method4367(var18, 3, 0.0F, true, 1.0F, true, var19, -1793120611);
                        if (var20 == 1) {
                           var17 = var19[0];
                        } else {
                           var17 = 0.0F;
                        }
                     }

                     var14 = (var0.field1871 + var17 * (var0.field1868 * var17 + var0.field1875)) * var17 + var0.field1869;
                  }

                  return var14;
               } else {
                  float var13;
                  if (var0 == null) {
                     var13 = 0.0F;
                  } else {
                     float var15 = var1 - var0.field1872;
                     var13 = var0.field1879 + var15 * (var0.field1876 + (var0.field1874 * var15 + var0.field1878) * var15);
                  }

                  return var13;
               }
            }
         }
      } else {
         return class137.field1790 == var0.field1882 ? var0.field1888[0].field1816 : class175.method4230(var0, var1, true, -1830943283);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([F)V")
   @ObfuscatedName("al")
   static void method3996(float[] var0) {
      if (field1780 + var0[0] < 1.3333334F) {
         float var1 = var0[0] - 2.0F;
         float var2 = var0[0] - 1.0F;
         float var3 = (float)Math.sqrt(var1 * var1 - var2 * 4.0F * var2);
         float var4 = (var3 + -var1) * 0.5F;
         if (field1780 + var0[1] > var4) {
            var0[1] = var4 - field1780;
         } else {
            var4 = 0.5F * (-var1 - var3);
            if (var0[1] < var4 + field1780) {
               var0[1] = field1780 + var4;
            }
         }
      } else {
         var0[0] = 1.3333334F - field1780;
         var0[1] = 0.33333334F - field1780;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;FZ)F")
   @ObfuscatedName("ay")
   static float method3986(classFT var0, float var1, boolean var2) {
      float var3 = 0.0F;
      if (var0 != null && classFT.method4131(var0, (byte)-19) != 0) {
         float var4 = 1723649089 * var0.field1888[0].field1818;
         float var5 = var0.field1888[classFT.method4131(var0, (byte)53) - 1].field1818 * -423216779;
         float var6 = var5 - var4;
         if (0.0F == var6) {
            return var0.field1888[0].field1816;
         } else {
            float var7 = 0.0F;
            if (var1 > var5) {
               var7 = (var1 - var5) / var6;
            } else {
               var7 = (var1 - var4) / var6;
            }

            float var8 = (int)var7;
            float var9 = Math.abs(var7 - var8);
            float var10 = var6 * var9;
            var8 = Math.abs(1.0F + var8);
            float var11 = var8 / 2.0F;
            float var12 = (int)var11;
            var9 = var11 - var12;
            if (var2) {
               if (class137.field1793 == var0.field1882) {
                  if (0.0F != var9) {
                     var10 += var4;
                  } else {
                     var10 = var5 - var10;
                  }
               } else if (class137.field1792 != var0.field1882 && class137.field1791 != var0.field1882) {
                  if (var0.field1882 == class137.field1794) {
                     var10 = var4 - var1;
                     float var13 = var0.field1888[0].field1812;
                     float var14 = var0.field1888[0].field1813;
                     var3 = var0.field1888[0].field1816;
                     if (0.0F != var13) {
                        var3 -= var14 * var10 / var13;
                     }

                     return var3;
                  }
               } else {
                  var10 = var5 - var10;
               }
            } else if (var0.field1883 == class137.field1793) {
               if (0.0F != var9) {
                  var10 = var5 - var10;
               } else {
                  var10 += var4;
               }
            } else if (class137.field1792 != var0.field1883 && var0.field1883 != class137.field1791) {
               if (class137.field1794 == var0.field1883) {
                  var10 = var1 - var5;
                  float var24 = var0.field1888[classFT.method4131(var0, (byte)34) - 1].field1814;
                  float var25 = var0.field1888[classFT.method4131(var0, (byte)24) - 1].field1815;
                  var3 = var0.field1888[classFT.method4131(var0, (byte)-78) - 1].field1816;
                  if (var24 != 0.0F) {
                     var3 += var25 * var10 / var24;
                  }

                  return var3;
               }
            } else {
               var10 += var4;
            }

            var3 = HintArrow.method8726(var0, var10, -1644257037);
            if (var2 && class137.field1791 == var0.field1882) {
               float var26 = var0.field1888[classFT.method4131(var0, (byte)27) - 1].field1816 - var0.field1888[0].field1816;
               var3 -= var8 * var26;
            } else if (!var2 && var0.field1883 == class137.field1791) {
               float var15 = var0.field1888[classFT.method4131(var0, (byte)-25) - 1].field1816 - var0.field1888[0].field1816;
               var3 += var15 * var8;
            }

            return var3;
         }
      } else {
         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;FZ)F")
   @ObfuscatedName("au")
   static float method3987(classFT var0, float var1, boolean var2) {
      float var3 = 0.0F;
      if (var0 != null && classFT.method4131(var0, (byte)-79) != 0) {
         float var4 = 1994604433 * var0.field1888[0].field1818;
         float var5 = var0.field1888[classFT.method4131(var0, (byte)45) - 1].field1818 * 1994604433;
         float var6 = var5 - var4;
         if (0.0F == var6) {
            return var0.field1888[0].field1816;
         } else {
            float var7 = 0.0F;
            if (var1 > var5) {
               var7 = (var1 - var5) / var6;
            } else {
               var7 = (var1 - var4) / var6;
            }

            float var8 = (int)var7;
            float var9 = Math.abs(var7 - var8);
            float var10 = var6 * var9;
            var8 = Math.abs(1.0F + var8);
            float var11 = var8 / 2.0F;
            float var12 = (int)var11;
            var9 = var11 - var12;
            if (var2) {
               if (class137.field1793 == var0.field1882) {
                  if (0.0F != var9) {
                     var10 += var4;
                  } else {
                     var10 = var5 - var10;
                  }
               } else if (class137.field1792 != var0.field1882 && class137.field1791 != var0.field1882) {
                  if (var0.field1882 == class137.field1794) {
                     var10 = var4 - var1;
                     float var13 = var0.field1888[0].field1812;
                     float var14 = var0.field1888[0].field1813;
                     var3 = var0.field1888[0].field1816;
                     if (0.0F != var13) {
                        var3 -= var14 * var10 / var13;
                     }

                     return var3;
                  }
               } else {
                  var10 = var5 - var10;
               }
            } else if (var0.field1883 == class137.field1793) {
               if (0.0F != var9) {
                  var10 = var5 - var10;
               } else {
                  var10 += var4;
               }
            } else if (class137.field1792 != var0.field1883 && var0.field1883 != class137.field1791) {
               if (class137.field1794 == var0.field1883) {
                  var10 = var1 - var5;
                  float var24 = var0.field1888[classFT.method4131(var0, (byte)63) - 1].field1814;
                  float var25 = var0.field1888[classFT.method4131(var0, (byte)89) - 1].field1815;
                  var3 = var0.field1888[classFT.method4131(var0, (byte)-49) - 1].field1816;
                  if (var24 != 0.0F) {
                     var3 += var25 * var10 / var24;
                  }

                  return var3;
               }
            } else {
               var10 += var4;
            }

            var3 = HintArrow.method8726(var0, var10, -1644257037);
            if (var2 && class137.field1791 == var0.field1882) {
               float var26 = var0.field1888[classFT.method4131(var0, (byte)-50) - 1].field1816 - var0.field1888[0].field1816;
               var3 -= var8 * var26;
            } else if (!var2 && var0.field1883 == class137.field1791) {
               float var15 = var0.field1888[classFT.method4131(var0, (byte)-17) - 1].field1816 - var0.field1888[0].field1816;
               var3 += var15 * var8;
            }

            return var3;
         }
      } else {
         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;FFFFFFFF)V")
   @ObfuscatedName("az")
   static void method3990(classFT var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         float var9 = var4 - var1;
         if (0.0F != var9) {
            float var10 = var2 - var1;
            float var11 = var3 - var1;
            float[] var12 = new float[]{var10 / var9, var11 / var9};
            var0.field1884 = var12[0] == 0.33333334F && 0.6666667F == var12[1];
            float var13 = var12[0];
            float var14 = var12[1];
            if (var12[0] < 0.0F) {
               var12[0] = 0.0F;
            }

            if (var12[1] > 1.0F) {
               var12[1] = 1.0F;
            }

            if (var12[0] > 1.0F || var12[1] < -1.0F) {
               var12[1] = 1.0F - var12[1];
               if (var12[0] < 0.0F) {
                  var12[0] = 0.0F;
               }

               if (var12[1] < 0.0F) {
                  var12[1] = 0.0F;
               }

               if (var12[0] > 1.0F || var12[1] > 1.0F) {
                  float var15 = (var12[0] - 2.0F + var12[1]) * var12[0] + (var12[1] - 2.0F) * var12[1] + 1.0F;
                  if (var15 + field1780 > 0.0F) {
                     InterfaceParent.method3002(var12, 1050023034);
                  }
               }

               var12[1] = 1.0F - var12[1];
            }

            if (var12[0] != var13) {
               var2 = var1 + var12[0] * var9;
               if (var13 != 0.0F) {
                  var6 = var5 + var12[0] * (var6 - var5) / var13;
               }
            }

            if (var14 != var12[1]) {
               var3 = var9 * var12[1] + var1;
               if (var14 != 1.0F) {
                  var7 = var8 - (1.0F - var12[1]) * (var8 - var7) / (1.0F - var14);
               }
            }

            var0.field1872 = var1;
            var0.field1877 = var4;
            class142.method4015(0.0F, var12[0], var12[1], 1.0F, var0, -245299832);
            float var21 = var6 - var5;
            float var16 = var7 - var6;
            float var17 = var8 - var7;
            float var18 = var16 - var21;
            var0.field1868 = var17 - var16 - var18;
            var0.field1875 = var18 + var18 + var18;
            var0.field1871 = var21 + var21 + var21;
            var0.field1869 = var5;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;FFFFFFFF)V")
   @ObfuscatedName("ad")
   static void method3991(classFT var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         float var9 = var4 - var1;
         if (0.0F != var9) {
            float var10 = var2 - var1;
            float var11 = var3 - var1;
            float[] var12 = new float[]{var10 / var9, var11 / var9};
            var0.field1884 = var12[0] == 0.33333334F && 0.6666667F == var12[1];
            float var13 = var12[0];
            float var14 = var12[1];
            if (var12[0] < 0.0F) {
               var12[0] = 0.0F;
            }

            if (var12[1] > 1.0F) {
               var12[1] = 1.0F;
            }

            if (var12[0] > 1.0F || var12[1] < -1.0F) {
               var12[1] = 1.0F - var12[1];
               if (var12[0] < 0.0F) {
                  var12[0] = 0.0F;
               }

               if (var12[1] < 0.0F) {
                  var12[1] = 0.0F;
               }

               if (var12[0] > 1.0F || var12[1] > 1.0F) {
                  float var15 = (var12[0] - 2.0F + var12[1]) * var12[0] + (var12[1] - 2.0F) * var12[1] + 1.0F;
                  if (var15 + field1780 > 0.0F) {
                     InterfaceParent.method3002(var12, -1315923089);
                  }
               }

               var12[1] = 1.0F - var12[1];
            }

            if (var12[0] != var13) {
               var2 = var1 + var12[0] * var9;
               if (var13 != 0.0F) {
                  var6 = var5 + var12[0] * (var6 - var5) / var13;
               }
            }

            if (var14 != var12[1]) {
               var3 = var9 * var12[1] + var1;
               if (var14 != 1.0F) {
                  var7 = var8 - (1.0F - var12[1]) * (var8 - var7) / (1.0F - var14);
               }
            }

            var0.field1872 = var1;
            var0.field1877 = var4;
            class142.method4015(0.0F, var12[0], var12[1], 1.0F, var0, 1554453217);
            float var21 = var6 - var5;
            float var16 = var7 - var6;
            float var17 = var8 - var7;
            float var18 = var16 - var21;
            var0.field1868 = var17 - var16 - var18;
            var0.field1875 = var18 + var18 + var18;
            var0.field1871 = var21 + var21 + var21;
            var0.field1869 = var5;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;FFFFFFFF)V")
   @ObfuscatedName("ai")
   static void method3992(classFT var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         float var9 = var4 - var1;
         if (0.0F != var9) {
            float var10 = var2 - var1;
            float var11 = var3 - var1;
            float[] var12 = new float[]{var10 / var9, var11 / var9};
            var0.field1884 = var12[0] == 0.33333334F && 0.6666667F == var12[1];
            float var13 = var12[0];
            float var14 = var12[1];
            if (var12[0] < 0.0F) {
               var12[0] = 0.0F;
            }

            if (var12[1] > 1.0F) {
               var12[1] = 1.0F;
            }

            if (var12[0] > 1.0F || var12[1] < -1.0F) {
               var12[1] = 1.0F - var12[1];
               if (var12[0] < 0.0F) {
                  var12[0] = 0.0F;
               }

               if (var12[1] < 0.0F) {
                  var12[1] = 0.0F;
               }

               if (var12[0] > 1.0F || var12[1] > 1.0F) {
                  float var15 = (var12[0] - 2.0F + var12[1]) * var12[0] + (var12[1] - 2.0F) * var12[1] + 1.0F;
                  if (var15 + field1780 > 0.0F) {
                     InterfaceParent.method3002(var12, 459124266);
                  }
               }

               var12[1] = 1.0F - var12[1];
            }

            if (var12[0] != var13) {
               var2 = var1 + var12[0] * var9;
               if (var13 != 0.0F) {
                  var6 = var5 + var12[0] * (var6 - var5) / var13;
               }
            }

            if (var14 != var12[1]) {
               var3 = var9 * var12[1] + var1;
               if (var14 != 1.0F) {
                  var7 = var8 - (1.0F - var12[1]) * (var8 - var7) / (1.0F - var14);
               }
            }

            var0.field1872 = var1;
            var0.field1877 = var4;
            class142.method4015(0.0F, var12[0], var12[1], 1.0F, var0, -1272720372);
            float var21 = var6 - var5;
            float var16 = var7 - var6;
            float var17 = var8 - var7;
            float var18 = var16 - var21;
            var0.field1868 = var17 - var16 - var18;
            var0.field1875 = var18 + var18 + var18;
            var0.field1871 = var21 + var21 + var21;
            var0.field1869 = var5;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;FZ)F")
   @ObfuscatedName("ap")
   static float method3988(classFT var0, float var1, boolean var2) {
      float var3 = 0.0F;
      if (var0 != null && classFT.method4131(var0, (byte)-22) != 0) {
         float var4 = -390824795 * var0.field1888[0].field1818;
         float var5 = var0.field1888[classFT.method4131(var0, (byte)65) - 1].field1818 * -31295979;
         float var6 = var5 - var4;
         if (0.0F == var6) {
            return var0.field1888[0].field1816;
         } else {
            float var7 = 0.0F;
            if (var1 > var5) {
               var7 = (var1 - var5) / var6;
            } else {
               var7 = (var1 - var4) / var6;
            }

            float var8 = (int)var7;
            float var9 = Math.abs(var7 - var8);
            float var10 = var6 * var9;
            var8 = Math.abs(1.0F + var8);
            float var11 = var8 / 2.0F;
            float var12 = (int)var11;
            var9 = var11 - var12;
            if (var2) {
               if (class137.field1793 == var0.field1882) {
                  if (0.0F != var9) {
                     var10 += var4;
                  } else {
                     var10 = var5 - var10;
                  }
               } else if (class137.field1792 != var0.field1882 && class137.field1791 != var0.field1882) {
                  if (var0.field1882 == class137.field1794) {
                     var10 = var4 - var1;
                     float var13 = var0.field1888[0].field1812;
                     float var14 = var0.field1888[0].field1813;
                     var3 = var0.field1888[0].field1816;
                     if (0.0F != var13) {
                        var3 -= var14 * var10 / var13;
                     }

                     return var3;
                  }
               } else {
                  var10 = var5 - var10;
               }
            } else if (var0.field1883 == class137.field1793) {
               if (0.0F != var9) {
                  var10 = var5 - var10;
               } else {
                  var10 += var4;
               }
            } else if (class137.field1792 != var0.field1883 && var0.field1883 != class137.field1791) {
               if (class137.field1794 == var0.field1883) {
                  var10 = var1 - var5;
                  float var24 = var0.field1888[classFT.method4131(var0, (byte)-19) - 1].field1814;
                  float var25 = var0.field1888[classFT.method4131(var0, (byte)92) - 1].field1815;
                  var3 = var0.field1888[classFT.method4131(var0, (byte)0) - 1].field1816;
                  if (var24 != 0.0F) {
                     var3 += var25 * var10 / var24;
                  }

                  return var3;
               }
            } else {
               var10 += var4;
            }

            var3 = HintArrow.method8726(var0, var10, -1644257037);
            if (var2 && class137.field1791 == var0.field1882) {
               float var26 = var0.field1888[classFT.method4131(var0, (byte)-33) - 1].field1816 - var0.field1888[0].field1816;
               var3 -= var8 * var26;
            } else if (!var2 && var0.field1883 == class137.field1791) {
               float var15 = var0.field1888[classFT.method4131(var0, (byte)62) - 1].field1816 - var0.field1888[0].field1816;
               var3 += var15 * var8;
            }

            return var3;
         }
      } else {
         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;FFFFFFFF)V")
   @ObfuscatedName("ac")
   static void method3993(classFT var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         var0.field1872 = var1;
         float var9 = var4 - var1;
         float var10 = var8 - var5;
         float var11 = var2 - var1;
         float var12 = 0.0F;
         float var13 = 0.0F;
         if (0.0F != var11) {
            var12 = (var6 - var5) / var11;
         }

         var11 = var4 - var3;
         if (var11 != 0.0F) {
            var13 = (var8 - var7) / var11;
         }

         float var14 = 1.0F / (var9 * var9);
         float var15 = var12 * var9;
         float var16 = var9 * var13;
         var0.field1874 = var14 * (var16 + var15 - var10 - var10) / var9;
         var0.field1878 = (var10 + (var10 + var10) - var15 - var15 - var16) * var14;
         var0.field1876 = var12;
         var0.field1879 = var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;FFFFFFFF)V")
   @ObfuscatedName("ab")
   static void method3994(classFT var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         var0.field1872 = var1;
         float var9 = var4 - var1;
         float var10 = var8 - var5;
         float var11 = var2 - var1;
         float var12 = 0.0F;
         float var13 = 0.0F;
         if (0.0F != var11) {
            var12 = (var6 - var5) / var11;
         }

         var11 = var4 - var3;
         if (var11 != 0.0F) {
            var13 = (var8 - var7) / var11;
         }

         float var14 = 1.0F / (var9 * var9);
         float var15 = var12 * var9;
         float var16 = var9 * var13;
         var0.field1874 = var14 * (var16 + var15 - var10 - var10) / var9;
         var0.field1878 = (var10 + (var10 + var10) - var15 - var15 - var16) * var14;
         var0.field1876 = var12;
         var0.field1879 = var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;FFFFFFFF)V")
   @ObfuscatedName("ax")
   static void method3995(classFT var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         var0.field1872 = var1;
         float var9 = var4 - var1;
         float var10 = var8 - var5;
         float var11 = var2 - var1;
         float var12 = 0.0F;
         float var13 = 0.0F;
         if (0.0F != var11) {
            var12 = (var6 - var5) / var11;
         }

         var11 = var4 - var3;
         if (var11 != 0.0F) {
            var13 = (var8 - var7) / var11;
         }

         float var14 = 1.0F / (var9 * var9);
         float var15 = var12 * var9;
         float var16 = var9 * var13;
         var0.field1874 = var14 * (var16 + var15 - var10 - var10) / var9;
         var0.field1878 = (var10 + (var10 + var10) - var15 - var15 - var16) * var14;
         var0.field1876 = var12;
         var0.field1879 = var5;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([F)V")
   @ObfuscatedName("ar")
   static void method3997(float[] var0) {
      if (field1780 + var0[0] < 1.3333334F) {
         float var1 = var0[0] - 2.0F;
         float var2 = var0[0] - 1.0F;
         float var3 = (float)Math.sqrt(var1 * var1 - var2 * 4.0F * var2);
         float var4 = (var3 + -var1) * 0.5F;
         if (field1780 + var0[1] > var4) {
            var0[1] = var4 - field1780;
         } else {
            var4 = 0.5F * (-var1 - var3);
            if (var0[1] < var4 + field1780) {
               var0[1] = field1780 + var4;
            }
         }
      } else {
         var0[0] = 1.3333334F - field1780;
         var0[1] = 0.33333334F - field1780;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([F)V")
   @ObfuscatedName("ah")
   static void method3998(float[] var0) {
      if (field1780 + var0[0] < 1.3333334F) {
         float var1 = var0[0] - 2.0F;
         float var2 = var0[0] - 1.0F;
         float var3 = (float)Math.sqrt(var1 * var1 - var2 * 4.0F * var2);
         float var4 = (var3 + -var1) * 0.5F;
         if (field1780 + var0[1] > var4) {
            var0[1] = var4 - field1780;
         } else {
            var4 = 0.5F * (-var1 - var3);
            if (var0[1] < var4 + field1780) {
               var0[1] = field1780 + var4;
            }
         }
      } else {
         var0[0] = 1.3333334F - field1780;
         var0[1] = 0.33333334F - field1780;
      }
   }

   classFH() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFLft;)V")
   @ObfuscatedName("af")
   static void method3999(float var0, float var1, float var2, float var3, classFT var4) {
      float var5 = var1 - var0;
      float var6 = var2 - var1;
      float var7 = var3 - var2;
      float var8 = var6 - var5;
      var4.field1879 = var7 - var6 - var8;
      var4.field1876 = var8 + var8 + var8;
      var4.field1878 = var5 + (var5 + var5);
      var4.field1874 = var0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(FFFFLft;)V")
   @ObfuscatedName("am")
   static void method4000(float var0, float var1, float var2, float var3, classFT var4) {
      float var5 = var1 - var0;
      float var6 = var2 - var1;
      float var7 = var3 - var2;
      float var8 = var6 - var5;
      var4.field1879 = var7 - var6 - var8;
      var4.field1876 = var8 + var8 + var8;
      var4.field1878 = var5 + (var5 + var5);
      var4.field1874 = var0;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lof;I)Ljava/lang/String;")
   @ObfuscatedName("mh")
   static String method4001(String var0, Widget var1, int var2) {
      try {
         if (var0.indexOf("%") != -1) {
            if (var2 != 2108391709) {
               throw new IllegalStateException();
            }

            for (int var3 = 1; var3 <= 5; var3++) {
               while (true) {
                  int var4 = var0.indexOf("%" + var3);
                  if (var4 == -1) {
                     if (var2 != 2108391709) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  String var5 = var0.substring(0, var4);
                  int var7 = class147.method4140(var1, var3 - 1, -4861709);
                  String var6;
                  if (var7 < 999999999) {
                     if (var2 != 2108391709) {
                        throw new IllegalStateException();
                     }

                     var6 = Integer.toString(var7);
                  } else {
                     var6 = "*";
                  }

                  var0 = var5 + var6 + var0.substring(var4 + 2);
               }
            }
         }

         return var0;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "fh.mh(" + ')');
      }
   }
}
