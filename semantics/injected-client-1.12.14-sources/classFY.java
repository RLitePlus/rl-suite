import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fy")
public class classFY extends DualNode {
   @ObfuscatedName("tg")
   public static final float[] field1926 = new float[5];
   @ObfuscatedName("ag")
   int field1929;
   @ObfuscatedSignature(descriptor = "[[Lft;")
   @ObfuscatedName("ae")
   classFT[][] field1944;
   @ObfuscatedName("ak")
   int field1920;
   @ObfuscatedName("wd")
   public float[] field1936;
   @ObfuscatedName("hf")
   public int[] field1940;
   @ObfuscatedSignature(descriptor = "Lmc;")
   @ObfuscatedName("vq")
   public static EvictingDualNodeHashTable field1928 = new EvictingDualNodeHashTable(128);
   @ObfuscatedName("wn")
   public float[] field1937;
   @ObfuscatedName("sh")
   public short[] field1943;
   @ObfuscatedSignature(descriptor = "[[Lft;")
   @ObfuscatedName("an")
   public classFT[][] field1945;
   @ObfuscatedName("av")
   public static int field1930;
   @ObfuscatedSignature(descriptor = "Ljc;")
   @ObfuscatedName("aj")
   public Skeleton field1921;
   @ObfuscatedName("at")
   public static ThreadPoolExecutor field1932;
   @ObfuscatedName("al")
   public int[] field1939;
   @ObfuscatedName("it")
   public static final float[] field1925 = new float[4];
   @ObfuscatedName("im")
   public int[] field1941;
   @ObfuscatedName("aw")
   boolean field1933;
   @ObfuscatedName("af")
   public int[] field1938;
   @ObfuscatedName("ap")
   Future field1922;
   @ObfuscatedName("lm")
   public float[] field1935;
   @ObfuscatedName("nv")
   public int[] field1942;
   @ObfuscatedName("he")
   public static final float field1927 = Math.ulp(1.0F);
   @ObfuscatedName("ay")
   List field1923;
   @ObfuscatedName("cs")
   public byte[] field1934;
   @ObfuscatedName("bw")
   static int field1931;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   public int method4164() {
      return this.field1929 * -157771145;
   }

   @ObfuscatedSignature(descriptor = "(Lry;ILfs;I)V")
   @ObfuscatedName("bj")
   void method4182(TransformationMatrix var1, int var2, class136 var3, int var4) {
      float[] var5 = var3.method4080(this.field1929 * -157771145, (byte)-100);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1944[var2] != null) {
         classFT var9 = this.field1944[var2][6];
         classFT var10 = this.field1944[var2][7];
         classFT var11 = this.field1944[var2][8];
         if (var9 != null) {
            var6 = var9.method4110(var4, (byte)120);
         }

         if (null != var10) {
            var7 = var10.method4110(var4, (byte)64);
         }

         if (var11 != null) {
            var8 = var11.method4110(var4, (byte)-57);
         }
      }

      TransformationMatrix var12 = SecureUrlRequester.method3893(-919509685);
      TransformationMatrix.method9953(var12, var6, var7, var8, 2097617185);
      TransformationMatrix.method9959(var1, var12, (byte)-44);
      TransformationMatrix.method9929(var12, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ag")
   public boolean method4186(int var1) {
      Future var2 = this.field1922;
      if (var2 == null) {
         return true;
      } else if (var2.isDone()) {
         this.field1922 = null;
         this.field1923 = null;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lrl19;ILfs;II)V")
   @ObfuscatedName("nh")
   public void method4199(rl19 var1, int var2, class136 var3, int var4, int var5) {
      float var6 = var2 + (float)NanoClock.field2569;
      TransformationMatrix var7 = TransformationMatrix.method10019();
      this.method4188(var7, var4, var3, var6);
      this.method4193(var7, var4, var3, var6);
      this.method4200(var7, var4, var3, var6);
      var1.method9550(var7, var4);
      var7.method10028();
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("an")
   public int method4165(byte var1) {
      try {
         return this.field1929 * -157771145;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fy.an(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;I)Z")
   @ObfuscatedName("au")
   public static boolean method4153(AbstractArchive var0, AbstractArchive var1, int var2) {
      byte[] var3 = AbstractArchive.method9044(var0, var2 >> 16 & 1321449565, var2 & -686079856, -2017427744);
      if (var3 == null) {
         return false;
      } else {
         int var4 = (var3[1] & 255) << 8 | var3[2] & -1564449702;
         byte[] var5 = AbstractArchive.method9044(var1, var4, 0, -2106937261);
         return var5 != null;
      }
   }

   @ObfuscatedSignature(descriptor = "(IFZ)F")
   @ObfuscatedName("xc")
   public float method4191(int var1, float var2, boolean var3) {
      byte var4 = this.field1934[var1 * 2];
      byte var5 = this.field1934[var1 * 2 + 1];
      int var6 = this.field1940[var1 * 2];
      int var7 = this.field1940[var1 * 2 + 1];
      float var8 = 0.0F;
      int var9 = var7 - var6;
      if (var9 == 0) {
         return var8;
      } else {
         float var10 = this.field1943[var6];
         float var11 = this.field1943[var7 - 1];
         float var12 = var11 - var10;
         if (0.0F == var12) {
            return this.field1935[var6 * 5 + 0];
         } else {
            float var13;
            if (var2 > var11) {
               var13 = (var2 - var11) / var12;
            } else {
               var13 = (var2 - var10) / var12;
            }

            float var14 = (int)var13;
            float var15 = Math.abs(var13 - var14);
            float var16 = var15 * var12;
            var14 = Math.abs(var14 + 1.0F);
            float var17 = var14 / 2.0F;
            float var18 = (int)var17;
            var15 = var17 - var18;
            if (var3) {
               if (var4 == 4) {
                  if (0.0F != var15) {
                     var16 += var10;
                  } else {
                     var16 = var11 - var16;
                  }
               } else if (var4 != 2 && var4 != 3) {
                  if (var4 == 1) {
                     var16 = var10 - var2;
                     float var19 = this.field1935[var6 * 5 + 1];
                     float var20 = this.field1935[var6 * 5 + 2];
                     var8 = this.field1935[var6 * 5 + 0];
                     if (0.0F != var19) {
                        var8 -= var20 * var16 / var19;
                     }

                     return var8;
                  }
               } else {
                  var16 = var11 - var16;
               }
            } else if (var5 == 4) {
               if (var15 != 0.0F) {
                  var16 = var11 - var16;
               } else {
                  var16 += var10;
               }
            } else if (var5 != 2 && var5 != 3) {
               if (var5 == 1) {
                  var16 = var2 - var11;
                  float var29 = this.field1935[(var7 - 1) * 5 + 3];
                  float var30 = this.field1935[(var7 - 1) * 5 + 4];
                  var8 = this.field1935[(var7 - 1) * 5 + 0];
                  if (0.0F != var29) {
                     var8 += var30 * var16 / var29;
                  }

                  return var8;
               }
            } else {
               var16 += var10;
            }

            var8 = this.method4197(var1, var16);
            if (var3 && var4 == 3) {
               float var31 = this.field1935[(var7 - 1) * 5 + 0] - this.field1935[var6 * 5 + 0];
               var8 -= var14 * var31;
            } else if (!var3 && var5 == 3) {
               float var21 = this.field1935[(var7 - 1) * 5 + 0] - this.field1935[var6 * 5 + 0];
               var8 += var21 * var14;
            }

            return var8;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IF)F")
   @ObfuscatedName("yo")
   public float method4197(int var1, float var2) {
      int var3 = this.field1940[var1 * 2];
      int var4 = this.field1940[var1 * 2 + 1];
      short var5 = this.field1943[var3];
      short var6 = this.field1943[var4 - 1];
      if (var2 < var5) {
         byte var40 = this.field1934[var1 * 2];
         return var40 == 0 ? this.field1935[var3 * 5 + 0] : this.method4191(var1, var2, true);
      } else if (var2 > var6) {
         byte var39 = this.field1934[var1 * 2 + 1];
         return var39 == 0 ? this.field1935[(var4 - 1) * 5 + 0] : this.method4191(var1, var2, false);
      } else {
         boolean var7 = this.method4198(var1, (int)var2, var3, var4);
         int var8 = this.field1938[var1];
         int var9 = this.field1942[var1];
         int var10 = var4 - var3;
         if (var10 <= 0) {
            return 0.0F;
         } else {
            float var11 = this.field1935[var8 * 5 + 3];
            float var12 = this.field1935[var8 * 5 + 4];
            boolean var13 = false;
            boolean var14 = false;
            if (0.0F == var11 && 0.0F == var12) {
               var13 = true;
            } else if (Float.MAX_VALUE == var11 && Float.MAX_VALUE == var12) {
               var14 = true;
            } else if (var8 + 1 < var4) {
               if (var7) {
                  float var16 = this.field1943[var8];
                  float var17 = this.field1935[var8 * 5 + 0];
                  float var18 = var16 + 0.33333334F * var11;
                  float var19 = var12 * 0.33333334F + var17;
                  float var20 = this.field1943[var8 + 1];
                  float var21 = this.field1935[(var8 + 1) * 5 + 0];
                  float var22 = var20 - 0.33333334F * this.field1935[var8 * 5 + 6];
                  float var23 = var21 - this.field1935[(var8 + 1) * 5 + 2] * 0.33333334F;
                  if (var9 != -1) {
                     float var24 = var20 - var16;
                     if (var24 != 0.0F) {
                        float var25 = var18 - var16;
                        float var26 = var22 - var16;
                        float var27 = var25 / var24;
                        float var28 = var26 / var24;
                        this.field1937[var9 + 5] = var27 == 0.33333334F && var28 == 0.6666667F ? 1.0F : 0.0F;
                        float var29 = var27;
                        float var30 = var28;
                        if (var27 < 0.0F) {
                           var27 = 0.0F;
                        }

                        if (var28 > 1.0F) {
                           var28 = 1.0F;
                        }

                        if (var27 > 1.0F || var28 < -1.0F) {
                           var28 = 1.0F - var28;
                           if (var28 < 0.0F) {
                              var28 = 0.0F;
                           }

                           if (var27 > 1.0F || var28 > 1.0F) {
                              float var31 = 1.0F + var27 * (var27 - 2.0F + var28) + (var28 - 2.0F) * var28;
                              if (var31 + field1927 > 0.0F) {
                                 if (field1927 + var27 < 1.3333334F) {
                                    float var32 = var27 - 2.0F;
                                    float var33 = var27 - 1.0F;
                                    float var34 = (float)Math.sqrt(var32 * var32 - var33 * 4.0F * var33);
                                    float var35 = (-var32 + var34) * 0.5F;
                                    if (var28 + field1927 > var35) {
                                       var28 = var35 - field1927;
                                    } else {
                                       var35 = 0.5F * (-var32 - var34);
                                       if (var28 < var35 + field1927) {
                                          var28 = var35 + field1927;
                                       }
                                    }
                                 } else {
                                    var27 = 1.3333334F - field1927;
                                    var28 = 0.33333334F - field1927;
                                 }
                              }
                           }

                           var28 = 1.0F - var28;
                        }

                        if (var27 != var29 && var29 != 0.0F) {
                           var19 = var17 + (var19 - var17) * var27 / var29;
                        }

                        if (var28 != var30 && var30 != 0.0F) {
                           var23 = var21 - (var21 - var23) * (1.0F - var28) / (1.0F - var30);
                        }

                        this.field1936[var1 * 5 + 4] = var16;
                        this.field1937[var9 + 4] = var20;
                        float var54 = var27 - 0.0F;
                        float var55 = var28 - var27;
                        float var56 = 1.0F - var28;
                        float var57 = var55 - var54;
                        this.field1936[var1 * 5 + 3] = var56 - var55 - var57;
                        this.field1936[var1 * 5 + 2] = var57 + var57 + var57;
                        this.field1936[var1 * 5 + 1] = var54 + var54 + var54;
                        this.field1936[var1 * 5 + 0] = 0.0F;
                        float var59 = var19 - var17;
                        float var36 = var23 - var19;
                        float var37 = var21 - var23;
                        float var38 = var36 - var59;
                        this.field1937[var9 + 3] = var37 - var36 - var38;
                        this.field1937[var9 + 2] = var38 + var38 + var38;
                        this.field1937[var9 + 1] = var59 + var59 + var59;
                        this.field1937[var9 + 0] = var17;
                     }
                  } else {
                     this.field1936[var1 * 5 + 4] = var16;
                     float var15 = var20 - var16;
                     float var45 = var21 - var17;
                     float var46 = var18 - var16;
                     float var48 = 0.0F;
                     float var49 = 0.0F;
                     if (var46 != 0.0F) {
                        var48 = (var19 - var17) / var46;
                     }

                     var46 = var20 - var22;
                     if (var46 != 0.0F) {
                        var49 = (var21 - var23) / var46;
                     }

                     float var51 = 1.0F / (var15 * var15);
                     float var52 = var15 * var48;
                     float var53 = var15 * var49;
                     this.field1936[var1 * 5 + 0] = var51 * (var52 + var53 - var45 - var45) / var15;
                     this.field1936[var1 * 5 + 1] = (var45 + var45 + var45 - var52 - var52 - var53) * var51;
                     this.field1936[var1 * 5 + 2] = var48;
                     this.field1936[var1 * 5 + 3] = var17;
                  }
               }
            } else {
               var13 = true;
            }

            if (var13) {
               return this.field1935[var8 * 5 + 0];
            } else if (!var14) {
               if (var9 != -1) {
                  float var43;
                  if (this.field1936[var1 * 5 + 4] == var2) {
                     var43 = 0.0F;
                  } else if (var2 == this.field1937[var9 + 4]) {
                     var43 = 1.0F;
                  } else {
                     var43 = (var2 - this.field1936[var1 * 5 + 4]) / (this.field1937[var9 + 4] - this.field1936[var1 * 5 + 4]);
                  }

                  float var42;
                  if (this.field1937[var9 + 5] != 0.0F) {
                     var42 = var43;
                  } else {
                     field1925[3] = this.field1936[var1 * 5 + 3];
                     field1925[2] = this.field1936[var1 * 5 + 2];
                     field1925[1] = this.field1936[var1 * 5 + 1];
                     field1925[0] = this.field1936[var1 * 5 + 0] - var43;
                     Arrays.fill(field1926, 0.0F);
                     int var44 = method4203(field1925, 3, 0.0F, true, 1.0F, true, field1926);
                     if (var44 == 1) {
                        var42 = field1926[0];
                     } else {
                        var42 = 0.0F;
                     }
                  }

                  return var42 * (this.field1937[var9 + 1] + (var42 * this.field1937[var9 + 3] + this.field1937[var9 + 2]) * var42) + this.field1937[var9 + 0];
               } else {
                  float var41 = var2 - this.field1936[var1 * 5 + 4];
                  return this.field1936[var1 * 5 + 3]
                     + var41 * (this.field1936[var1 * 5 + 2] + (this.field1936[var1 * 5 + 1] + var41 * this.field1936[var1 * 5 + 0]) * var41);
               }
            } else {
               return this.field1943[var8] != var2 && var8 + 1 < var4 ? this.field1935[(var8 + 1) * 5 + 0] : this.field1935[var8 * 5 + 0];
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(ILfs;III)V")
   @ObfuscatedName("aj")
   public void method4194(int var1, class136 var2, int var3, int var4, int var5) {
      this.method4199(rl19.field5583, var1, var2, var3, var4);
   }

   @ObfuscatedSignature(descriptor = "(Lry;ILfs;II)V")
   @ObfuscatedName("ak")
   void method4173(TransformationMatrix var1, int var2, class136 var3, int var4, int var5) {
      try {
         float[] var6 = var3.method4077(-157771145 * this.field1929, (byte)-1);
         float var7 = var6[0];
         float var8 = var6[1];
         float var9 = var6[2];
         if (null != this.field1944[var2]) {
            classFT var10 = this.field1944[var2][0];
            classFT var11 = this.field1944[var2][1];
            classFT var12 = this.field1944[var2][2];
            if (var10 != null) {
               if (var5 == 728739877) {
                  return;
               }

               var7 = var10.method4110(var4, (byte)3);
            }

            if (var11 != null) {
               if (var5 == 728739877) {
                  throw new IllegalStateException();
               }

               var8 = var11.method4110(var4, (byte)20);
            }

            if (var12 != null) {
               if (var5 == 728739877) {
                  throw new IllegalStateException();
               }

               var9 = var12.method4110(var4, (byte)-102);
            }
         }

         class461 var16 = classFM.method4026(1936960846);
         var16.method9302(1.0F, 0.0F, 0.0F, var7, 1761663644);
         class461 var17 = classFM.method4026(968935445);
         var17.method9302(0.0F, 1.0F, 0.0F, var8, 1445128372);
         class461 var18 = classFM.method4026(776008512);
         var18.method9302(0.0F, 0.0F, 1.0F, var9, 1424813512);
         class461 var13 = classFM.method4026(-819756926);
         class461.method9328(var13, var18, (byte)125);
         class461.method9328(var13, var16, (byte)30);
         class461.method9328(var13, var17, (byte)73);
         TransformationMatrix var14 = SecureUrlRequester.method3893(1069711435);
         var14.method9967(var13, (byte)1);
         TransformationMatrix.method9959(var1, var14, (byte)-52);
         class461.method9289(var16, (byte)3);
         class461.method9289(var17, (byte)-62);
         class461.method9289(var18, (byte)-1);
         class461.method9289(var13, (byte)-116);
         TransformationMatrix.method9929(var14, (byte)1);
      } catch (RuntimeException var15) {
         throw RestClientThreadFactory.newRunException(var15, "fy.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lry;ILfs;II)V")
   @ObfuscatedName("ap")
   void method4183(TransformationMatrix var1, int var2, class136 var3, int var4, int var5) {
      try {
         float[] var6 = var3.method4080(this.field1929 * -157771145, (byte)29);
         float var7 = var6[0];
         float var8 = var6[1];
         float var9 = var6[2];
         if (this.field1944[var2] != null) {
            classFT var10 = this.field1944[var2][6];
            classFT var11 = this.field1944[var2][7];
            classFT var12 = this.field1944[var2][8];
            if (var10 != null) {
               if (var5 >= 357458518) {
                  throw new IllegalStateException();
               }

               var7 = var10.method4110(var4, (byte)20);
            }

            if (null != var11) {
               if (var5 >= 357458518) {
                  throw new IllegalStateException();
               }

               var8 = var11.method4110(var4, (byte)-84);
            }

            if (var12 != null) {
               var9 = var12.method4110(var4, (byte)82);
            }
         }

         TransformationMatrix var14 = SecureUrlRequester.method3893(-1448410601);
         TransformationMatrix.method9953(var14, var7, var8, var9, 2131873250);
         TransformationMatrix.method9959(var1, var14, (byte)-20);
         TransformationMatrix.method9929(var14, (byte)1);
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "fy.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lry;ILfs;F)V")
   @ObfuscatedName("wt")
   public void method4200(TransformationMatrix var1, int var2, class136 var3, float var4) {
      float[] var5 = var3.method4094(this.field1929 * -157771145);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      int var9 = this.field1941[var2 * 9 + 3];
      int var10 = this.field1941[var2 * 9 + 4];
      int var11 = this.field1941[var2 * 9 + 5];
      if (var9 != 0) {
         var6 = this.method4190(var9, var4);
      }

      if (var10 != 0) {
         var7 = this.method4190(var10, var4);
      }

      if (var11 != 0) {
         var8 = this.method4190(var11, var4);
      }

      var1.field5742 = var6;
      var1.field5737 = var7;
      var1.field5734 = var8;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;I)Z")
   @ObfuscatedName("ay")
   public static boolean method4154(AbstractArchive var0, AbstractArchive var1, int var2) {
      byte[] var3 = AbstractArchive.method9044(var0, var2 >> 16 & 1592204224, var2 & 65535, -2123399989);
      if (var3 == null) {
         return false;
      } else {
         int var4 = (var3[1] & 147887386) << 8 | var3[2] & 255;
         byte[] var5 = AbstractArchive.method9044(var1, var4, 0, -2026732322);
         return var5 != null;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("wy")
   public static int method4189(int var0) {
      if (var0 >= 0 && var0 <= 9) {
         return var0 - 1;
      } else if (var0 >= 10 && var0 <= 15) {
         return var0 - 10;
      } else {
         return var0 == 16 ? 0 : -1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("al")
   public boolean method4167() {
      return this.field1933;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ai")
   void method4157(Buffer var1, int var2) {
      Buffer.method12008(var1, (byte)5);
      Buffer.method12008(var1, (byte)5);
      this.field1929 = var1.readUnsignedByte(1378442734) * 876437319;
      int var3 = Buffer.method12008(var1, (byte)5);
      this.field1944 = new classFT[class251.method6154(this.field1921.method5403(-510419997), 1380770968)][];
      this.field1945 = new classFT[this.field1921.method5399((byte)-26)][];
      class138[] var4 = new class138[var3];

      for (int var5 = 0; var5 < var3; var5++) {
         class140 var6 = WorldMapSection1.method7447(var1.readUnsignedByte(638405115), (byte)-13);
         int var7 = var1.readShortSmart(1436610776);
         class141 var8 = SoundCache.method3468(var1.readUnsignedByte(1380575377), (byte)-100);
         classFT var9 = new classFT();
         var9.method4100(var1, var2, (byte)81);
         var4[var5] = new class138(this, var9, var6, var8, var7);
         int var10 = var6.method4048((byte)79);
         classFT[][] var11;
         if (class140.field1834 == var6) {
            var11 = this.field1944;
         } else {
            var11 = this.field1945;
         }

         if (null == var11[var7]) {
            var11[var7] = new classFT[var10];
         }

         if (var6 == class140.field1835) {
            this.field1933 = true;
         }
      }

      int var12 = var3 / (232605531 * field1930);
      int var13 = var3 % (field1930 * -1386836621);
      int var15 = 0;

      for (int var16 = 0; var16 < field1930 * 302663626; var16++) {
         int var14 = var15;
         var15 += var12;
         if (var13 > 0) {
            var15++;
            var13--;
         }

         if (var14 == var15) {
            break;
         }

         this.field1923.add(field1932.submit(new class145(this, var14, var15, var4)));
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;I)Z")
   @ObfuscatedName("ad")
   public static boolean method4155(AbstractArchive var0, AbstractArchive var1, int var2) {
      byte[] var3 = AbstractArchive.method9044(var0, var2 >> 16 & 65535, var2 & 65535, -2108530872);
      if (var3 == null) {
         return false;
      } else {
         int var4 = (var3[1] & 255) << 8 | var3[2] & 255;
         byte[] var5 = AbstractArchive.method9044(var1, var4, 0, -2110643098);
         return var5 != null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lry;ILfs;I)V")
   @ObfuscatedName("aq")
   void method4174(TransformationMatrix var1, int var2, class136 var3, int var4) {
      float[] var5 = var3.method4077(-157771145 * this.field1929, (byte)-1);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.field1944[var2]) {
         classFT var9 = this.field1944[var2][0];
         classFT var10 = this.field1944[var2][1];
         classFT var11 = this.field1944[var2][2];
         if (var9 != null) {
            var6 = var9.method4110(var4, (byte)16);
         }

         if (var10 != null) {
            var7 = var10.method4110(var4, (byte)-105);
         }

         if (var11 != null) {
            var8 = var11.method4110(var4, (byte)114);
         }
      }

      class461 var14 = classFM.method4026(-1721978287);
      var14.method9302(1.0F, 0.0F, 0.0F, var6, 1981463023);
      class461 var15 = classFM.method4026(-1167258336);
      var15.method9302(0.0F, 1.0F, 0.0F, var7, 1819960209);
      class461 var16 = classFM.method4026(-1770115112);
      var16.method9302(0.0F, 0.0F, 1.0F, var8, 1615335520);
      class461 var12 = classFM.method4026(6039713);
      class461.method9328(var12, var16, (byte)46);
      class461.method9328(var12, var14, (byte)51);
      class461.method9328(var12, var15, (byte)17);
      TransformationMatrix var13 = SecureUrlRequester.method3893(1057652180);
      var13.method9967(var12, (byte)1);
      TransformationMatrix.method9959(var1, var13, (byte)-41);
      class461.method9289(var14, (byte)-83);
      class461.method9289(var15, (byte)-62);
      class461.method9289(var16, (byte)-51);
      class461.method9289(var12, (byte)-73);
      TransformationMatrix.method9929(var13, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(I)Lfy;")
   @ObfuscatedName("ae")
   public static synchronized classFY method4195(int var0) {
      classFY var1 = (classFY)field1928.method7390(var0);
      if (var1 != null) {
         return var1;
      } else if (!method4204(client.field939[22], client.field939[1], var0)) {
         return null;
      } else {
         if (field1932 == null) {
            field1930 = Runtime.getRuntime().availableProcessors() * -425026985;
            field1932 = new ThreadPoolExecutor(
               0, field1930 * 1886450023, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(field1930 * 1886450023 * 100 + 100), new class195(null)
            );
         }

         var1 = new classFY(client.field939[22], client.field939[1], var0);
         field1928.method7391(var1, var0);
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ac")
   public boolean method4160() {
      if (this.field1922 == null && this.field1923 == null) {
         return true;
      } else {
         if (this.field1922 != null) {
            if (!this.field1922.isDone()) {
               return false;
            }

            this.field1922 = null;
         }

         boolean var1 = true;

         for (int var2 = 0; var2 < this.field1923.size(); var2++) {
            if (!((Future)this.field1923.get(var2)).isDone()) {
               var1 = false;
            } else {
               this.field1923.remove(var2);
               var2--;
            }
         }

         if (!var1) {
            return false;
         } else {
            this.field1923 = null;
            return true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("qv")
   public void method4196(Buffer var1) {
      try {
         int var2 = var1.method12219();
         int var3 = var1.method12219();
         this.field1929 = var1.method12221() * 876437319;
         this.field1941 = new int[this.field1921.field2814.method6175() * 9];
         this.field1939 = new int[this.field1921.count * 1593543125 * 1];
         int var4 = var1.method12219();
         int[] var5 = new int[var4];
         this.field1940 = new int[var4 * 2];
         this.field1938 = new int[var4];
         Arrays.fill(this.field1938, -1);
         this.field1942 = new int[var4];
         this.field1936 = new float[var4 * 5];
         this.field1934 = new byte[var4 * 2];
         int var6 = 0;
         int var7 = 0;

         for (int var8 = 0; var8 < var4; var8++) {
            int var9 = var1.method12221();
            int var10 = var1.method12234();
            int var11 = var1.method12221();
            int var12 = var1.method12219();
            var1.method12221();
            this.field1934[var8 * 2] = var1.method12220();
            this.field1934[var8 * 2 + 1] = var1.method12220();
            byte var13 = var1.method12221() != 0;
            this.field1942[var8] = var13 ? 6 * var7++ : -1;
            var5[var8] = var1.method12223();
            this.field1940[var8 * 2] = var6;
            this.field1940[var8 * 2 + 1] = var6 + var12;
            var6 += var12;
            var1.method12229(var1.method12223() + 22 * var12);
            int[] var20;
            if (var9 == 1) {
               var20 = this.field1941;
               var13 = 9;
            } else {
               var20 = this.field1939;
               var13 = 1;
            }

            int var14 = method4189(var11);
            if (var14 < var13) {
               var20[var10 * var13 + var14] = var8 + 1;
            }

            if (var9 == 4) {
               this.field1933 = true;
            }
         }

         this.field1937 = new float[6 * var7];
         this.field1943 = new short[var6];
         this.field1935 = new float[var6 * 5];

         for (int var16 = 0; var16 < var4; var16++) {
            var1.method12229(var5[var16]);
            int var17 = this.field1940[var16 * 2];

            for (int var18 = this.field1940[var16 * 2 + 1]; var17 < var18; var17++) {
               this.field1943[var17] = (short)var1.method12230();

               for (int var19 = 0; var19 < 5; var19++) {
                  this.field1935[var17 * 5 + var19] = var1.method12227();
               }
            }
         }
      } catch (Exception var15) {
         client.field938.error("AnimMaya{}", this.field1920 * 1843348099, var15);
         throw var15;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ab")
   public boolean method4161() {
      if (this.field1922 == null && this.field1923 == null) {
         return true;
      } else {
         if (this.field1922 != null) {
            if (!this.field1922.isDone()) {
               return false;
            }

            this.field1922 = null;
         }

         boolean var1 = true;

         for (int var2 = 0; var2 < this.field1923.size(); var2++) {
            if (!((Future)this.field1923.get(var2)).isDone()) {
               var1 = false;
            } else {
               this.field1923.remove(var2);
               var2--;
            }
         }

         if (!var1) {
            return false;
         } else {
            this.field1923 = null;
            return true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ar")
   public int method4166() {
      return this.field1929 * -157771145;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfy;Lry;ILfs;I)V")
   @ObfuscatedName("ff")
   public static void method4177(classFY var0, TransformationMatrix var1, int var2, class136 var3, int var4) {
      float[] var5 = var3.method4079(-157771145 * var0.field1929, -159563035);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (var0.field1944[var2] != null) {
         classFT var9 = var0.field1944[var2][3];
         classFT var10 = var0.field1944[var2][4];
         classFT var11 = var0.field1944[var2][5];
         if (null != var9) {
            var6 = var9.method4110(var4, (byte)12);
         }

         if (null != var10) {
            var7 = var10.method4110(var4, (byte)-98);
         }

         if (var11 != null) {
            var8 = var11.method4110(var4, (byte)34);
         }
      }

      var1.field5742 = var6;
      var1.field5737 = var7;
      var1.field5734 = var8;
   }

   @ObfuscatedSignature(descriptor = "(Lry;ILfs;I)V")
   @ObfuscatedName("bm")
   void method4184(TransformationMatrix var1, int var2, class136 var3, int var4) {
      float[] var5 = var3.method4080(this.field1929 * -1425117315, (byte)-34);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1944[var2] != null) {
         classFT var9 = this.field1944[var2][6];
         classFT var10 = this.field1944[var2][7];
         classFT var11 = this.field1944[var2][8];
         if (var9 != null) {
            var6 = var9.method4110(var4, (byte)58);
         }

         if (null != var10) {
            var7 = var10.method4110(var4, (byte)-30);
         }

         if (var11 != null) {
            var8 = var11.method4110(var4, (byte)-105);
         }
      }

      TransformationMatrix var12 = SecureUrlRequester.method3893(720948126);
      TransformationMatrix.method9953(var12, var6, var7, var8, 1969038988);
      TransformationMatrix.method9959(var1, var12, (byte)-105);
      TransformationMatrix.method9929(var12, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("af")
   public boolean method4168() {
      return this.field1933;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfy;)Z")
   @ObfuscatedName("kw")
   public static boolean method4162(classFY var0) {
      if (var0 == null) {
         return var0.method4163();
      } else if (var0.field1922 == null && var0.field1923 == null) {
         return true;
      } else {
         if (var0.field1922 != null) {
            if (!var0.field1922.isDone()) {
               return false;
            }

            var0.field1922 = null;
         }

         boolean var1 = true;

         for (int var2 = 0; var2 < var0.field1923.size(); var2++) {
            if (!((Future)var0.field1923.get(var2)).isDone()) {
               var1 = false;
            } else {
               var0.field1923.remove(var2);
               var2--;
            }
         }

         if (!var1) {
            return false;
         } else {
            var0.field1923 = null;
            return true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("kf")
   public boolean method4202() {
      return this.method4186(-1632678446);
   }

   public classFY(AbstractArchive var1, AbstractArchive var2, int var3) {
      this.field1920 = var3 * 1940429867;
      Buffer var4 = new Buffer(var1.loadData(this.field1920 * 1843348099 >> 16 & 65535, this.field1920 * 1843348099 & 65535));
      int var5 = var4.method12221();
      int var6 = var4.method12219();
      byte[] var7 = var2.method9062(var6, 0);
      this.field1921 = new Skeleton(var6, var7);
      this.field1922 = field1932.submit(() -> this.method4196(var4));
      field1932.submit(() -> this.field1921.field2814.method6174());
      this.field1923 = Collections.emptyList();
   }

   @ObfuscatedSignature(descriptor = "(Lry;ILfs;F)V")
   @ObfuscatedName("ig")
   public void method4188(TransformationMatrix var1, int var2, class136 var3, float var4) {
      float[] var5 = var3.method4092(this.field1929 * -157771145);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      int var9 = this.field1941[var2 * 9 + 0];
      int var10 = this.field1941[var2 * 9 + 1];
      int var11 = this.field1941[var2 * 9 + 2];
      if (var9 != 0) {
         var6 = this.method4190(var9, var4);
      }

      if (var10 != 0) {
         var7 = this.method4190(var10, var4);
      }

      if (var11 != 0) {
         var8 = this.method4190(var11, var4);
      }

      class461 var12 = class461.method9341();
      class461 var13 = class461.method9341();
      var13.method9343(0.0F, 0.0F, 1.0F, var8);
      var12.method9340(var13);
      var13.method9343(1.0F, 0.0F, 0.0F, var6);
      var12.method9340(var13);
      var13.method9343(0.0F, 1.0F, 0.0F, var7);
      var12.method9340(var13);
      TransformationMatrix var14 = TransformationMatrix.method10019();
      var14.method10021(var12);
      var1.method10024(var14);
      var14.method10028();
      var12.method9342();
      var13.method9342();
   }

   @ObfuscatedSignature(descriptor = "(ILfs;II)V")
   @ObfuscatedName("am")
   public void method4170(int var1, class136 var2, int var3, int var4) {
      TransformationMatrix var5 = SecureUrlRequester.method3893(1419503869);
      this.method4173(var5, var3, var2, var1, 133337084);
      this.method4183(var5, var3, var2, var1, -2042067692);
      method4180(this, var5, var3, var2, var1, -1822952840);
      var2.method4068(var5, -1793120611);
      TransformationMatrix.method9929(var5, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(Lry;ILfs;F)V")
   @ObfuscatedName("nt")
   public void method4193(TransformationMatrix var1, int var2, class136 var3, float var4) {
      float[] var5 = var3.method4095(this.field1929 * -157771145);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      int var9 = this.field1941[var2 * 9 + 6];
      int var10 = this.field1941[var2 * 9 + 7];
      int var11 = this.field1941[var2 * 9 + 8];
      if (var9 != 0) {
         var6 = this.method4190(var9, var4);
      }

      if (var10 != 0) {
         var7 = this.method4190(var10, var4);
      }

      if (var11 != 0) {
         var8 = this.method4190(var11, var4);
      }

      TransformationMatrix var12 = TransformationMatrix.method10019();
      var12.method10036(var6, var7, var8);
      var1.method10024(var12);
      var12.method10028();
   }

   @ObfuscatedSignature(descriptor = "(ILfs;II)V")
   @ObfuscatedName("ao")
   public void method4171(int var1, class136 var2, int var3, int var4) {
      TransformationMatrix var5 = SecureUrlRequester.method3893(1844662222);
      this.method4173(var5, var3, var2, var1, -239380565);
      this.method4183(var5, var3, var2, var1, -954392146);
      method4180(this, var5, var3, var2, var1, -2114227291);
      var2.method4068(var5, -1793120611);
      TransformationMatrix.method9929(var5, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(ILfs;II)V")
   @ObfuscatedName("aa")
   public void method4172(int var1, class136 var2, int var3, int var4) {
      TransformationMatrix var5 = SecureUrlRequester.method3893(47385142);
      this.method4173(var5, var3, var2, var1, -653487086);
      this.method4183(var5, var3, var2, var1, -2022995043);
      method4180(this, var5, var3, var2, var1, -1616145124);
      var2.method4068(var5, -1793120611);
      TransformationMatrix.method9929(var5, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(Lry;ILfs;I)V")
   @ObfuscatedName("be")
   void method4175(TransformationMatrix var1, int var2, class136 var3, int var4) {
      float[] var5 = var3.method4077(-157771145 * this.field1929, (byte)-1);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.field1944[var2]) {
         classFT var9 = this.field1944[var2][0];
         classFT var10 = this.field1944[var2][1];
         classFT var11 = this.field1944[var2][2];
         if (var9 != null) {
            var6 = var9.method4110(var4, (byte)9);
         }

         if (var10 != null) {
            var7 = var10.method4110(var4, (byte)-91);
         }

         if (var11 != null) {
            var8 = var11.method4110(var4, (byte)54);
         }
      }

      class461 var14 = classFM.method4026(-1321660387);
      var14.method9302(1.0F, 0.0F, 0.0F, var6, 1636781308);
      class461 var15 = classFM.method4026(-861400521);
      var15.method9302(0.0F, 1.0F, 0.0F, var7, 1417158028);
      class461 var16 = classFM.method4026(-1189334866);
      var16.method9302(0.0F, 0.0F, 1.0F, var8, 1443035176);
      class461 var12 = classFM.method4026(-80791454);
      class461.method9328(var12, var16, (byte)98);
      class461.method9328(var12, var14, (byte)35);
      class461.method9328(var12, var15, (byte)43);
      TransformationMatrix var13 = SecureUrlRequester.method3893(-1943329460);
      var13.method9967(var12, (byte)1);
      TransformationMatrix.method9959(var1, var13, (byte)-62);
      class461.method9289(var14, (byte)-64);
      class461.method9289(var15, (byte)-12);
      class461.method9289(var16, (byte)-10);
      class461.method9289(var12, (byte)-96);
      TransformationMatrix.method9929(var13, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(IF)F")
   @ObfuscatedName("ko")
   public float method4190(int var1, float var2) {
      return this.method4197(var1 - 1, var2);
   }

   @ObfuscatedSignature(descriptor = "(Lry;ILfs;I)V")
   @ObfuscatedName("bo")
   void method4176(TransformationMatrix var1, int var2, class136 var3, int var4) {
      float[] var5 = var3.method4077(-157771145 * this.field1929, (byte)-1);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.field1944[var2]) {
         classFT var9 = this.field1944[var2][0];
         classFT var10 = this.field1944[var2][1];
         classFT var11 = this.field1944[var2][2];
         if (var9 != null) {
            var6 = var9.method4110(var4, (byte)5);
         }

         if (var10 != null) {
            var7 = var10.method4110(var4, (byte)70);
         }

         if (var11 != null) {
            var8 = var11.method4110(var4, (byte)8);
         }
      }

      class461 var14 = classFM.method4026(646043567);
      var14.method9302(1.0F, 0.0F, 0.0F, var6, 1765506663);
      class461 var15 = classFM.method4026(-1858879298);
      var15.method9302(0.0F, 1.0F, 0.0F, var7, 2051384412);
      class461 var16 = classFM.method4026(1605470248);
      var16.method9302(0.0F, 0.0F, 1.0F, var8, 2142410773);
      class461 var12 = classFM.method4026(1216789716);
      class461.method9328(var12, var16, (byte)28);
      class461.method9328(var12, var14, (byte)50);
      class461.method9328(var12, var15, (byte)15);
      TransformationMatrix var13 = SecureUrlRequester.method3893(608279978);
      var13.method9967(var12, (byte)1);
      TransformationMatrix.method9959(var1, var13, (byte)-98);
      class461.method9289(var14, (byte)-124);
      class461.method9289(var15, (byte)-114);
      class461.method9289(var16, (byte)-3);
      class461.method9289(var12, (byte)-29);
      TransformationMatrix.method9929(var13, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(Lry;ILfs;I)V")
   @ObfuscatedName("bg")
   void method4178(TransformationMatrix var1, int var2, class136 var3, int var4) {
      float[] var5 = var3.method4079(-157771145 * this.field1929, -1060038710);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1944[var2] != null) {
         classFT var9 = this.field1944[var2][3];
         classFT var10 = this.field1944[var2][4];
         classFT var11 = this.field1944[var2][5];
         if (null != var9) {
            var6 = var9.method4110(var4, (byte)-17);
         }

         if (null != var10) {
            var7 = var10.method4110(var4, (byte)-85);
         }

         if (var11 != null) {
            var8 = var11.method4110(var4, (byte)12);
         }
      }

      var1.field5742 = var6;
      var1.field5737 = var7;
      var1.field5734 = var8;
   }

   @ObfuscatedSignature(descriptor = "([FIFZFZ[F)I")
   @ObfuscatedName("xk")
   public static int method4203(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      return class157.method4367(var0, var1, var2, var3, var4, var5, var6, -1793120611);
   }

   @ObfuscatedSignature(descriptor = "(Lry;ILfs;I)V")
   @ObfuscatedName("bs")
   void method4179(TransformationMatrix var1, int var2, class136 var3, int var4) {
      float[] var5 = var3.method4079(-604560710 * this.field1929, -293813526);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1944[var2] != null) {
         classFT var9 = this.field1944[var2][3];
         classFT var10 = this.field1944[var2][4];
         classFT var11 = this.field1944[var2][5];
         if (null != var9) {
            var6 = var9.method4110(var4, (byte)-13);
         }

         if (null != var10) {
            var7 = var10.method4110(var4, (byte)53);
         }

         if (var11 != null) {
            var8 = var11.method4110(var4, (byte)17);
         }
      }

      var1.field5742 = var6;
      var1.field5737 = var7;
      var1.field5734 = var8;
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("eu")
   public boolean method4198(int var1, int var2, int var3, int var4) {
      int var5 = this.field1938[var1];
      if (var5 < 0 || this.field1943[var5] > var2 || var5 + 1 < var4 && this.field1943[var5 + 1] <= var2) {
         int var6 = var4 - var3;
         if (var6 > 0) {
            int var7 = var3;
            int var8 = var4 - 1;

            do {
               int var9 = var8 + var7 >> 1;
               if (var2 < this.field1943[var9]) {
                  if (var2 > this.field1943[var9 - 1]) {
                     var5 = var9 - 1;
                     break;
                  }

                  var8 = var9 - 1;
               } else {
                  if (var2 <= this.field1943[var9]) {
                     var5 = var9;
                     break;
                  }

                  if (var2 < this.field1943[var9 + 1]) {
                     var5 = var9;
                     break;
                  }

                  var7 = var9 + 1;
               }
            } while (var7 <= var8);
         }

         assert var5 != -1;

         if (var5 != this.field1938[var1]) {
            this.field1938[var1] = var5;
            return true;
         }
      }

      return false;
   }

   @ObfuscatedSignature(descriptor = "(Lry;ILfs;I)V")
   @ObfuscatedName("bk")
   void method4185(TransformationMatrix var1, int var2, class136 var3, int var4) {
      float[] var5 = var3.method4080(this.field1929 * -810107650, (byte)-67);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1944[var2] != null) {
         classFT var9 = this.field1944[var2][6];
         classFT var10 = this.field1944[var2][7];
         classFT var11 = this.field1944[var2][8];
         if (var9 != null) {
            var6 = var9.method4110(var4, (byte)-58);
         }

         if (null != var10) {
            var7 = var10.method4110(var4, (byte)7);
         }

         if (var11 != null) {
            var8 = var11.method4110(var4, (byte)-39);
         }
      }

      TransformationMatrix var12 = SecureUrlRequester.method3893(-470717697);
      TransformationMatrix.method9953(var12, var6, var7, var8, 1932494199);
      TransformationMatrix.method9959(var1, var12, (byte)-116);
      TransformationMatrix.method9929(var12, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("ae")
   public boolean method4169(byte var1) {
      try {
         return this.field1933;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "fy.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;I)Z")
   @ObfuscatedName("az")
   public static boolean method4156(AbstractArchive var0, AbstractArchive var1, int var2) {
      byte[] var3 = AbstractArchive.method9044(var0, var2 >> 16 & 65535, var2 & -299778670, -2030555468);
      if (var3 == null) {
         return false;
      } else {
         int var4 = (var3[1] & -1409926167) << 8 | var3[2] & -1755720293;
         byte[] var5 = AbstractArchive.method9044(var1, var4, 0, -2122921073);
         return var5 != null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lqm;Lqm;I)Z")
   @ObfuscatedName("fg")
   public static boolean method4204(AbstractArchive var0, AbstractArchive var1, int var2) {
      return WorldMapSectionType.method7176(var0, var1, var2, -1267610787);
   }

   @ObfuscatedSignature(descriptor = "(Lbq;III)V")
   @ObfuscatedName("lf")
   static final void method4187(MenuAction var0, int var1, int var2, int var3) {
      try {
         if (var0 != null) {
            if (var3 == 16711680) {
               throw new IllegalStateException();
            }

            class101.menuAction(
               var0.param0 * -785822587,
               var0.param1 * 1849589045,
               var0.opcode * -261637247,
               var0.identifier * -1309657229,
               679501541 * var0.itemId,
               var0.worldViewId * -1357223757,
               var0.action,
               var0.target,
               var1,
               var2,
               (byte)8
            );
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "fy.lf(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfy;Lxa;II)V")
   @ObfuscatedName("sy")
   public static void method4158(classFY var0, Buffer var1, int var2, int var3) {
      if (var0 == null) {
         var0.method4159(var1, var2, var2);
      } else {
         try {
            Buffer.method12008(var1, (byte)5);
            Buffer.method12008(var1, (byte)5);
            var0.field1929 = var1.readUnsignedByte(-11030725) * 876437319;
            int var4 = Buffer.method12008(var1, (byte)5);
            var0.field1944 = new classFT[class251.method6154(var0.field1921.method5403(-510419997), 1305165838)][];
            var0.field1945 = new classFT[var0.field1921.method5399((byte)-10)][];
            class138[] var5 = new class138[var4];

            for (int var6 = 0; var6 < var4; var6++) {
               if (var3 >= 1735634051) {
                  throw new IllegalStateException();
               }

               class140 var7 = WorldMapSection1.method7447(var1.readUnsignedByte(1441254757), (byte)-97);
               int var8 = var1.readShortSmart(-1344439755);
               class141 var9 = SoundCache.method3468(var1.readUnsignedByte(919950643), (byte)-4);
               classFT var10 = new classFT();
               var10.method4100(var1, var2, (byte)102);
               var5[var6] = new class138(var0, var10, var7, var9, var8);
               int var11 = var7.method4048((byte)-72);
               classFT[][] var12;
               if (class140.field1834 == var7) {
                  if (var3 >= 1735634051) {
                     throw new IllegalStateException();
                  }

                  var12 = var0.field1944;
               } else {
                  var12 = var0.field1945;
               }

               if (null == var12[var8]) {
                  if (var3 >= 1735634051) {
                     throw new IllegalStateException();
                  }

                  var12[var8] = new classFT[var11];
               }

               if (var7 == class140.field1835) {
                  if (var3 >= 1735634051) {
                     return;
                  }

                  var0.field1933 = true;
               }
            }

            int var14 = var4 / (1886450023 * field1930);
            int var15 = var4 % (field1930 * 1886450023);
            int var17 = 0;

            for (int var18 = 0; var18 < field1930 * 1886450023; var18++) {
               if (var3 >= 1735634051) {
                  throw new IllegalStateException();
               }

               int var16 = var17;
               var17 += var14;
               if (var15 > 0) {
                  var17++;
                  var15--;
               }

               if (var16 == var17) {
                  if (var3 >= 1735634051) {
                     return;
                  }
                  break;
               }

               var0.field1923.add(field1932.submit(new class145(var0, var16, var17, var5)));
            }

            return;
         } catch (RuntimeException var13) {
            throw RestClientThreadFactory.newRunException(var13, "fy.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lfy;Lry;ILfs;II)V")
   @ObfuscatedName("og")
   public static void method4180(classFY var0, TransformationMatrix var1, int var2, class136 var3, int var4, int var5) {
      if (var0 == null) {
         var0.method4181(var1, var2, var3, var2, var2);
      } else {
         try {
            float[] var6 = var3.method4079(-157771145 * var0.field1929, -1314912615);
            float var7 = var6[0];
            float var8 = var6[1];
            float var9 = var6[2];
            if (var0.field1944[var2] != null) {
               classFT var10 = var0.field1944[var2][3];
               classFT var11 = var0.field1944[var2][4];
               classFT var12 = var0.field1944[var2][5];
               if (null != var10) {
                  if (var5 >= -1555527582) {
                     return;
                  }

                  var7 = var10.method4110(var4, (byte)-34);
               }

               if (null != var11) {
                  if (var5 >= -1555527582) {
                     throw new IllegalStateException();
                  }

                  var8 = var11.method4110(var4, (byte)28);
               }

               if (var12 != null) {
                  if (var5 >= -1555527582) {
                     throw new IllegalStateException();
                  }

                  var9 = var12.method4110(var4, (byte)58);
               }
            }

            var1.field5742 = var7;
            var1.field5737 = var8;
            var1.field5734 = var9;
         } catch (RuntimeException var13) {
            throw RestClientThreadFactory.newRunException(var13, "fy.aw(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lry;ILfs;II)V")
   @ObfuscatedName("aw")
   void method4181(TransformationMatrix var1, int var2, class136 var3, int var4, int var5) {
      try {
         float[] var6 = var3.method4079(-157771145 * this.field1920, -1314912615);
         float var7 = var6[0];
         float var8 = var6[1];
         float var9 = var6[2];
         if (this.field1944[var2] != null) {
            classFT var10 = this.field1944[var2][3];
            classFT var11 = this.field1944[var2][4];
            classFT var12 = this.field1944[var2][5];
            if (null != var10) {
               if (var5 >= -1555527582) {
                  return;
               }

               var7 = var10.method4110(var4, (byte)-34);
            }

            if (null != var11) {
               if (var5 >= -1555527582) {
                  throw new IllegalStateException();
               }

               var8 = var11.method4110(var4, (byte)28);
            }

            if (var12 != null) {
               if (var5 >= -1555527582) {
                  throw new IllegalStateException();
               }

               var9 = var12.method4110(var4, (byte)58);
            }
         }

         var1.field5740 = var7;
         var1.field5734 = var8;
         var1.field5740 = var9;
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "fy.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   public boolean method4163() {
      if (this.field1922 == null && this.field1923 == null) {
         return true;
      } else {
         if (this.field1922 != null) {
            if (!this.field1922.isDone()) {
               return false;
            }

            this.field1922 = null;
         }

         boolean var1 = true;

         for (int var2 = 0; var2 < this.field1923.size(); var2++) {
            if (!((Future)this.field1923.get(var2)).isDone()) {
               var1 = false;
            } else {
               this.field1923.remove(var2);
               var2--;
            }
         }

         if (!var1) {
            return false;
         } else {
            this.field1923 = null;
            return true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;II)V")
   @ObfuscatedName("at")
   void method4159(Buffer var1, int var2, int var3) {
      try {
         Buffer.method12008(var1, (byte)5);
         Buffer.method12008(var1, (byte)5);
         this.field1920 = var1.readVarInt(-11030725) * 876437319;
         int var4 = Buffer.method12008(var1, (byte)5);
         this.field1944 = new classFT[class251.method6154(this.field1921.method5403(-510419997), 1305165838)][];
         this.field1945 = new classFT[this.field1921.method5399((byte)-10)][];
         class138[] var5 = new class138[var4];

         for (int var6 = 0; var6 < var4; var6++) {
            if (var3 >= 1735634051) {
               throw new IllegalStateException();
            }

            class140 var7 = WorldMapSection1.method7447(var1.method12181(1441254757), (byte)-97);
            int var8 = var1.method12183(-1344439755);
            class141 var9 = SoundCache.method3468(var1.readUnsignedByte(919950643), (byte)-4);
            classFT var10 = new classFT();
            var10.method4100(var1, var2, (byte)102);
            var5[var6] = new class138(this, var10, var7, var9, var8);
            int var11 = var7.method4048((byte)-72);
            classFT[][] var12;
            if (class140.field1834 == var7) {
               if (var3 >= 1735634051) {
                  throw new IllegalStateException();
               }

               var12 = this.field1944;
            } else {
               var12 = this.field1945;
            }

            if (null == var12[var8]) {
               if (var3 >= 1735634051) {
                  throw new IllegalStateException();
               }

               var12[var8] = new classFT[var11];
            }

            if (var7 == class140.field1834) {
               if (var3 >= 1735634051) {
                  return;
               }

               this.field1933 = true;
            }
         }

         int var14 = var4 / (1886450023 * field1930);
         int var15 = var4 % (field1930 * 1886450023);
         int var17 = 0;

         for (int var18 = 0; var18 < field1930 * 1886450023; var18++) {
            if (var3 >= 1735634051) {
               throw new IllegalStateException();
            }

            int var16 = var17;
            var17 += var14;
            if (var15 > 0) {
               var17++;
               var15--;
            }

            if (var16 == var17) {
               if (var3 >= 1735634051) {
                  return;
               }
               break;
            }

            this.field1923.add(field1932.submit(new class145(this, var16, var17, var5)));
         }
      } catch (RuntimeException var13) {
         throw RestClientThreadFactory.newRunException(var13, "fy.at(" + ')');
      }
   }
}
