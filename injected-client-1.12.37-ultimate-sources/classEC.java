import net.runelite.api.TextureProvider;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ec")
public class classEC implements classFG, TextureProvider {
   @ObfuscatedName("ag")
   double field1729;
   @ToRemove(unused = "true")
   @ObfuscatedName("ah")
   public static final int field1735 = 60;
   @ObfuscatedName("ae")
   int field1730;
   @ObfuscatedName("ab")
   int field1728;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final int field1736 = 1076101519;
   @ObfuscatedName("as")
   int field1732;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("ax")
   classVA field1731;
   @ObfuscatedName("ly")
   static String field1737;
   @ObfuscatedSignature(descriptor = "[Lfu;")
   @ObfuscatedName("az")
   classFU[] field1734;
   @ObfuscatedSignature(descriptor = "Lnn;")
   @ObfuscatedName("af")
   classNN field1733 = new classNN();

   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod408(int var1, int var2) {
      try {
         if (null != this.field1734[var1]) {
            if (var2 >= -934599992) {
               throw new IllegalStateException();
            } else {
               return this.field1734[var1].field2396;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ec.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()[Lfu;")
   @ObfuscatedName("hv")
   public classFU[] method3825() {
      return this.field1734;
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("af")
   public void method3811(double var1) {
      try {
         this.field1729 = var1;
         this.method3817((byte)-15);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ec.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)[I")
   @ObfuscatedName("ae")
   @Override
   public int[] vmethod402(int var1, byte var2) {
      try {
         classFU var3 = this.field1734[var1];
         if (var3 != null) {
            if (var2 >= 2) {
               throw new IllegalStateException();
            }

            if (null != var3.field2397) {
               if (var2 >= 2) {
                  throw new IllegalStateException();
               }

               this.field1733.method7902(var3);
               var3.field2398 = true;
               return var3.field2397;
            }

            boolean var4 = classFU.method5004(var3, this.field1729, 1127091647 * this.field1732, this.field1731);
            if (var4) {
               if (var2 >= 2) {
                  throw new IllegalStateException();
               }

               if (0 == this.field1728 * 500420469) {
                  if (var2 >= 2) {
                     throw new IllegalStateException();
                  }

                  classFU var5 = (classFU)this.field1733.method7914();
                  var5.method5011();
               } else {
                  this.field1728 -= -1309062947;
               }

               this.field1733.method7902(var3);
               var3.field2398 = true;
               return var3.field2397;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "ec.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;Lva;IDI)V")
   @ObfuscatedName("fq")
   public void method3823(classVA var1, classVA var2, int var3, double var4, int var6) {
      this.method3826(128);
      this.method3827(128);
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("ao")
   public void method3812(double var1) {
      this.field1729 = var1;
      this.method3817((byte)17);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod412(int var1, int var2) {
      try {
         return this.field1734[var1].field2399;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ec.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I[[[IIII[I[I[II)V")
   @ObfuscatedName("az")
   public static void method3804(int var0, int[][][] var1, int var2, int var3, int var4, int[] var5, int[] var6, int[] var7, int var8) {
      try {
         int[] var9 = classFJ.field2282[var0];

         for (int var10 = 0; var10 < var9.length; var10++) {
            if (var8 != 1181281029) {
               throw new IllegalStateException();
            }

            int var14 = var9[var10];
            int var13 = (var3 << 7) + classFJ.field2280[var14] * 128;
            var5[var10] = var13;
            var6[var10] = classPT.method9210(var9[var10], var1, var2, var3, var4, (byte)-60);
            var7[var10] = classFO.method4850(var9[var10], var4, 260031741);
         }
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "ec.az(" + ')');
      }
   }

   public void setBrightness(double var1) {
      this.method3811(var1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   public int method3805() {
      if (0 == this.field1734.length) {
         return 100;
      } else {
         int var1 = 0;
         int var2 = 0;
         classFU[] var3 = this.field1734;

         for (int var4 = 0; var4 < var3.length; var4++) {
            classFU var5 = var3[var4];
            if (var5 != null && var5.field2400 != -1) {
               var1++;
               if (this.field1731.method11807(var5.field2400, (byte)-1)) {
                  var2++;
               }
            }
         }

         return var1 == 0 ? 0 : var2 * 100 / var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ay")
   @Override
   public int[] vmethod403(int var1) {
      classFU var2 = this.field1734[var1];
      if (var2 != null) {
         if (null != var2.field2397) {
            this.field1733.method7902(var2);
            var2.field2398 = true;
            return var2.field2397;
         }

         boolean var3 = classFU.method5004(var2, this.field1729, 1127091647 * this.field1732, this.field1731);
         if (var3) {
            if (0 == this.field1728 * 500420469) {
               classFU var4 = (classFU)this.field1733.method7914();
               var4.method5011();
            } else {
               this.field1728 -= 395731437;
            }

            this.field1733.method7902(var2);
            var2.field2398 = true;
            return var2.field2397;
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   @Override
   public int vmethod409(int var1) {
      return null != this.field1734[var1] ? this.field1734[var1].field2396 : 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lec;D)V")
   @ObfuscatedName("nd")
   public static void method3813(classEC var0, double var1) {
      if (var0 == null) {
         var0.method3811(var1);
      } else {
         var0.field1729 = var1;
         var0.method3817((byte)33);
      }
   }

   @ObfuscatedSignature(descriptor = "(D)V")
   @ObfuscatedName("al")
   public void method3814(double var1) {
      this.field1729 = var1;
      this.method3817((byte)-5);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lez;IIII)Z")
   @ObfuscatedName("ge")
   public static boolean method3822(classEZ var0, int var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method4380(var1, var1, var1, var1);
      }

      if (!var0.method4374(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = var0.field2060[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 1185577113;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > var0.field2118) {
                  if (!var0.method4386(var5, var7, var6)) {
                     return false;
                  }

                  if (!var0.method4386(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!var0.method4386(var5, var8, var6)) {
                     return false;
                  }

                  if (!var0.method4386(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!var0.method4386(var5, var9, var6)) {
                  return false;
               }

               if (!var0.method4386(var5, var9, var6 + -1976571263)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < var0.field2116) {
                  if (!var0.method4386(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!var0.method4386(var5 + 128, var7, var6 + -854857873)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!var0.method4386(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!var0.method4386(var5 + 128, var8, var6 + -162860707)) {
                     return false;
                  }
               }

               if (!var0.method4386(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!var0.method4386(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < var0.field2118) {
                  if (!var0.method4386(var5 + -1829215160, var7, var6)) {
                     return false;
                  }

                  if (!var0.method4386(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!var0.method4386(var5 + -730909357, var8, var6)) {
                     return false;
                  }

                  if (!var0.method4386(var5 + -1138970473, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!var0.method4386(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!var0.method4386(var5 + 2064648336, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > var0.field2116) {
                  if (!var0.method4386(var5, var7, var6)) {
                     return false;
                  }

                  if (!var0.method4386(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!var0.method4386(var5, var8, var6)) {
                     return false;
                  }

                  if (!var0.method4386(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!var0.method4386(var5, var9, var6)) {
                  return false;
               }

               if (!var0.method4386(var5 + 1183211869, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!var0.method4386(var5 + 1783224692, var10, var6 + 57621730)) {
            return false;
         } else if (var4 == 16) {
            return var0.method4386(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return var0.method4386(var5 + 128, var9, var6 + 850464331);
         } else if (var4 == 497147507) {
            return var0.method4386(var5 + -2049992861, var9, var6);
         } else {
            return var4 == 1871189580 ? var0.method4386(var5, var9, var6) : true;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ap")
   @Override
   public int[] vmethod404(int var1) {
      classFU var2 = this.field1734[var1];
      if (var2 != null) {
         if (null != var2.field2397) {
            this.field1733.method7902(var2);
            var2.field2398 = true;
            return var2.field2397;
         }

         boolean var3 = classFU.method5004(var2, this.field1729, 1127091647 * this.field1732, this.field1731);
         if (var3) {
            if (0 == this.field1728 * 500420469) {
               classFU var4 = (classFU)this.field1733.method7914();
               var4.method5011();
            } else {
               this.field1728 -= -1309062947;
            }

            this.field1733.method7902(var2);
            var2.field2398 = true;
            return var2.field2397;
         }
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lec;)V")
   @ObfuscatedName("wu")
   public static void method3815(classEC var0) {
      if (var0 == null) {
         var0.method3816();
      } else {
         for (int var1 = 0; var1 < var0.field1734.length; var1++) {
            if (null != var0.field1734[var1]) {
               var0.field1734[var1].method5011();
            }
         }

         var0.field1733 = new classNN();
         var0.field1728 = 47825473 * var0.field1730;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ai")
   @Override
   public int vmethod410(int var1) {
      return null != this.field1734[var1] ? this.field1734[var1].field2396 : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ad")
   @Override
   public int[] vmethod405(int var1) {
      classFU var2 = this.field1734[var1];
      if (var2 != null) {
         if (null != var2.field2397) {
            this.field1733.method7902(var2);
            var2.field2398 = true;
            return var2.field2397;
         }

         boolean var3 = classFU.method5004(var2, this.field1729, 1127091647 * this.field1732, this.field1731);
         if (var3) {
            if (0 == this.field1728 * 976587482) {
               classFU var4 = (classFU)this.field1733.method7914();
               var4.method5011();
            } else {
               this.field1728 -= -1045807641;
            }

            this.field1733.method7902(var2);
            var2.field2398 = true;
            return var2.field2397;
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("aq")
   @Override
   public int[] vmethod406(int var1) {
      classFU var2 = this.field1734[var1];
      if (var2 != null) {
         if (null != var2.field2397) {
            this.field1733.method7902(var2);
            var2.field2398 = true;
            return var2.field2397;
         }

         boolean var3 = classFU.method5004(var2, this.field1729, 1127091647 * this.field1732, this.field1731);
         if (var3) {
            if (0 == this.field1728 * 500420469) {
               classFU var4 = (classFU)this.field1733.method7914();
               var4.method5011();
            } else {
               this.field1728 -= -1309062947;
            }

            this.field1733.method7902(var2);
            var2.field2398 = true;
            return var2.field2397;
         }
      }

      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lec;I)V")
   @ObfuscatedName("gt")
   public static void method3818(classEC var0, int var1) {
      if (var0 == null) {
         var0.vmethod403(var1);
      }

      for (int var2 = 0; var2 < var0.field1734.length; var2++) {
         classFU var3 = var0.field1734[var2];
         if (var3 != null && var3.field2401 != 0 && var3.field2398) {
            var3.method5016(var1);
            var3.field2398 = false;
         }
      }
   }

   public int getDefaultColor(int var1) {
      return this.vmethod408(var1, -1340787172);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsp;)Lqr;")
   @ObfuscatedName("wy")
   public static classQR method3809(classSP var0) {
      if (var0 == null) {
         var0.vmethod385();
      }

      return 0 == -1902770053 * var0.field6018 && var0.field6017.method9726(374233424) && var0.field6017.method9731((byte)41).method8785((byte)92)
         ? var0.field6017
         : null;
   }

   @ObfuscatedSignature(descriptor = "(Lec;II)V")
   @ObfuscatedName("bl")
   public static void method3819(classEC var0, int var1, int var2) {
      if (var0 == null) {
         var0.method3821(var1, var1);
      }

      try {
         for (int var3 = 0; var3 < var0.field1734.length; var3++) {
            if (var2 != -1467379791) {
               var0.method3824(var1);
               return;
            }

            classFU var4 = var0.field1734[var3];
            if (var4 != null) {
               if (var2 != -1467379791) {
                  var0.method3824(var1);
                  return;
               }

               if (var4.field2401 != 0 && var4.field2398) {
                  if (var2 != -1467379791) {
                     throw new IllegalStateException();
                  }

                  var4.method5016(var1);
                  var4.field2398 = false;
               }
            }
         }

         var0.method3824(var1);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ec.ax(" + ')');
      }
   }

   public classEC(classVA var1, classVA var2, int var3, double var4, int var6) {
      this.field1728 = 0;
      this.field1729 = 1.0;
      this.field1732 = 1014046592;
      this.field1731 = var2;
      this.field1730 = var3 * 168126365;
      this.field1728 = 47825473 * this.field1730;
      this.field1729 = var4;
      this.field1732 = var6 * 578347583;
      int[] var7 = var1.method11824(0, -1868977307);
      if (var7 != null) {
         int var8 = var7.length;
         this.field1734 = new classFU[var1.method11868(0, 1597643874)];

         for (int var9 = 0; var9 < var8; var9++) {
            classXY var10 = new classXY(var1.method11867(0, var7[var9], -1089106860));
            this.field1734[var7[var9]] = new classFU(var10);
         }
      } else {
         this.field1734 = new classFU[0];
      }

      this.method3823(var1, var2, var3, var4, var6);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lec;I)V")
   @ObfuscatedName("tk")
   public static void method3820(classEC var0, int var1) {
      if (var0 == null) {
         var0.method3825();
      }

      for (int var2 = 0; var2 < var0.field1734.length; var2++) {
         classFU var3 = var0.field1734[var2];
         if (var3 != null && var3.field2401 != 0 && var3.field2398) {
            var3.method5016(var1);
            var3.field2398 = false;
         }
      }
   }

   public double getBrightness() {
      return this.field1729;
   }

   @ObfuscatedSignature(descriptor = "(Lec;B)I")
   @ObfuscatedName("ep")
   public static int method3806(classEC var0, byte var1) {
      if (var0 == null) {
         return var0.method3808(var1);
      } else {
         try {
            if (0 == var0.field1734.length) {
               if (var1 >= 12) {
                  throw new IllegalStateException();
               } else {
                  return 100;
               }
            } else {
               int var2 = 0;
               int var3 = 0;
               classFU[] var4 = var0.field1734;

               for (int var5 = 0; var5 < var4.length; var5++) {
                  if (var1 >= 12) {
                     throw new IllegalStateException();
                  }

                  classFU var6 = var4[var5];
                  if (var6 != null) {
                     if (var1 >= 12) {
                        throw new IllegalStateException();
                     }

                     if (var6.field2400 != -1) {
                        var2++;
                        if (var0.field1731.method11807(var6.field2400, (byte)-1)) {
                           if (var1 >= 12) {
                              throw new IllegalStateException();
                           }

                           var3++;
                        }
                     }
                  }
               }

               if (var2 != 0) {
                  return var3 * 100 / var2;
               } else if (var1 >= 12) {
                  throw new IllegalStateException();
               } else {
                  return 0;
               }
            }
         } catch (RuntimeException var7) {
            throw classEG.method3884(var7, "ec.az(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aw")
   @Override
   public int vmethod411(int var1) {
      return null != this.field1734[var1] ? this.field1734[var1].field2396 : 0;
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("au")
   @Override
   public int[] vmethod407(int var1) {
      classFU var2 = this.field1734[var1];
      if (var2 != null) {
         if (null != var2.field2397) {
            this.field1733.method7902(var2);
            var2.field2398 = true;
            return var2.field2397;
         }

         boolean var3 = classFU.method5004(var2, this.field1729, 941287448 * this.field1732, this.field1731);
         if (var3) {
            if (0 == this.field1728 * 500420469) {
               classFU var4 = (classFU)this.field1733.method7914();
               var4.method5011();
            } else {
               this.field1728 -= -1275776620;
            }

            this.field1733.method7902(var2);
            var2.field2398 = true;
            return var2.field2397;
         }
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ak")
   @Override
   public boolean vmethod413(int var1) {
      return this.field1734[var1].field2399;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("at")
   public void method3816() {
      for (int var1 = 0; var1 < this.field1734.length; var1++) {
         if (null != this.field1734[var1]) {
            this.field1734[var1].method5011();
         }
      }

      this.field1733 = new classNN();
      this.field1728 = 47825473 * this.field1730;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   public int method3807() {
      if (0 == this.field1734.length) {
         return 100;
      } else {
         int var1 = 0;
         int var2 = 0;
         classFU[] var3 = this.field1734;

         for (int var4 = 0; var4 < var3.length; var4++) {
            classFU var5 = var3[var4];
            if (var5 != null && var5.field2400 != -1) {
               var1++;
               if (this.field1731.method11807(var5.field2400, (byte)-1)) {
                  var2++;
               }
            }
         }

         return var1 == 0 ? 0 : var2 * 100 / var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("tn")
   public void method3824(int var1) {
      classOE.field4843.getCallbacks().drawAboveOverheads();
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("as")
   public void method3817(byte var1) {
      try {
         for (int var2 = 0; var2 < this.field1734.length; var2++) {
            if (var1 == 1) {
               return;
            }

            if (null != this.field1734[var2]) {
               this.field1734[var2].method5011();
            }
         }

         this.field1733 = new classNN();
         this.field1728 = 47825473 * this.field1730;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ec.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljl;")
   @ObfuscatedName("ae")
   public static classJL method3810(int var0) {
      try {
         classJL var1 = classFJ.method4793(1717678848);
         var1.field3342 = null;
         var1.field3339 = 0;
         var1.field3343 = new classXS(5000);
         return var1;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ec.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ep")
   public void method3826(int var1) {
      this.field1730 = var1 * 168126365;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ja")
   public void method3827(int var1) {
      this.field1728 = var1 * -1309062947;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   public int method3808(byte var1) {
      try {
         if (0 == this.field1734.length) {
            if (var1 >= 12) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            int var2 = 0;
            int var3 = 0;
            classFU[] var4 = this.field1734;

            for (int var5 = 0; var5 < var4.length; var5++) {
               if (var1 >= 12) {
                  throw new IllegalStateException();
               }

               classFU var6 = var4[var5];
               if (var6 != null) {
                  if (var1 >= 12) {
                     throw new IllegalStateException();
                  }

                  if (var6.field2395 != -1) {
                     var2++;
                     if (this.field1731.method11807(var6.field2396, (byte)-1)) {
                        if (var1 >= 12) {
                           throw new IllegalStateException();
                        }

                        var3++;
                     }
                  }
               }
            }

            if (var2 != 0) {
               return var3 * 100 / var2;
            } else if (var1 >= 12) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         }
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "ec.az(" + 41);
      }
   }

   public int[] load(int var1) {
      return this.vmethod402(var1, (byte)-48);
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ax")
   public void method3821(int var1, int var2) {
      try {
         for (int var3 = 0; var3 < this.field1734.length; var3++) {
            if (var2 != -1467379791) {
               this.method3826(var1);
               return;
            }

            classFU var4 = this.field1734[var3];
            if (var4 != null) {
               if (var2 != -1467379791) {
                  this.method3827(var1);
                  return;
               }

               if (var4.field2400 != 0 && var4.field2398) {
                  if (var2 != -1467379791) {
                     throw new IllegalStateException();
                  }

                  var4.method5016(var1);
                  var4.field2399 = false;
               }
            }
         }

         this.method3826(var1);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "ec.ax(" + ')');
      }
   }
}
