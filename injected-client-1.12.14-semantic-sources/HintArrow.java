import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pj")
public class HintArrow {
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field4843 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   public static final int field4841 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field4835 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field4834 = 4;
   @ObfuscatedName("ax")
   int subX;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field4838 = 4;
   @ObfuscatedName("ai")
   int targetType;
   @ObfuscatedName("tw")
   static boolean ClanChat_inClanChat;
   @ObfuscatedName("ac")
   int x;
   @ObfuscatedName("wa")
   public int field4845;
   @ObfuscatedName("ab")
   int y;
   @ObfuscatedName("as")
   int targetIndex;
   @ObfuscatedName("ar")
   int subY;
   @ObfuscatedName("ah")
   int height;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field4842 = 0;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   public int method8744() {
      return 1327275491 * this.y;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("az")
   public void method8727() {
      this.targetType = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lpj;I)I")
   @ObfuscatedName("zq")
   public static int method8739(HintArrow var0, int var1) {
      if (var0 == null) {
         var0.method8742(var1);
      }

      try {
         return var0.targetIndex * -1237904385;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pj.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("at")
   public boolean method8731(byte var1) {
      try {
         boolean var10000;
         if (0 != -81304289 * this.targetType) {
            if (var1 == 6) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pj.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public int method8736(int var1) {
      try {
         return this.targetType * -81304289;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pj.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   public void method8728() {
      this.targetType = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpj;)Z")
   @ObfuscatedName("ht")
   public static boolean method8732(HintArrow var0) {
      return var0 == null ? var0.method8735() : 0 != -81304289 * var0.targetType;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bk")
   public int method8756() {
      return this.height * 2050442785;
   }

   @ObfuscatedSignature(descriptor = "(Lpj;I)I")
   @ObfuscatedName("zp")
   public static int method8745(HintArrow var0, int var1) {
      if (var0 == null) {
         return var0.method8748(var1);
      } else {
         try {
            return 1327275491 * var0.y;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "pj.aj(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   public int method8740() {
      return this.targetIndex * -1237904385;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ak")
   public int method8749(int var1) {
      try {
         return this.subX * 1076175705;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pj.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aw")
   public int method8752(int var1) {
      try {
         return 1339969195 * this.subY;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pj.aw(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ap")
   public int method8757(int var1) {
      try {
         return this.height * 2050442785;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pj.ap(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("zm")
   public void method8765(Buffer var1) {
      this.field4845 = SecureUrlRequester.client.getPlane();
   }

   @ObfuscatedSignature(descriptor = "(Lft;FI)F")
   @ObfuscatedName("av")
   static float method8726(classFT var0, float var1, int var2) {
      try {
         if (var0 != null) {
            if (var2 != -1644257037) {
               throw new IllegalStateException();
            }

            if (classFT.method4131(var0, (byte)-25) != 0) {
               if (var1 < var0.field1888[0].field1818 * 1994604433) {
                  if (class137.field1790 == var0.field1882) {
                     if (var2 != -1644257037) {
                        throw new IllegalStateException();
                     }

                     return var0.field1888[0].field1816;
                  }

                  return class175.method4230(var0, var1, true, -12397854);
               }

               if (var1 > var0.field1888[classFT.method4131(var0, (byte)-10) - 1].field1818 * 1994604433) {
                  if (var2 != -1644257037) {
                     throw new IllegalStateException();
                  }

                  if (var0.field1883 == class137.field1790) {
                     if (var2 != -1644257037) {
                        throw new IllegalStateException();
                     }

                     return var0.field1888[classFT.method4131(var0, (byte)1) - 1].field1816;
                  }

                  return class175.method4230(var0, var1, false, -594937373);
               }

               if (var0.field1885) {
                  return var0.field1888[0].field1816;
               }

               class134 var3 = var0.method4126(var1, -599508916);
               boolean var4 = false;
               boolean var5 = false;
               if (var3 != null) {
                  if (var2 != -1644257037) {
                     throw new IllegalStateException();
                  }

                  if (0.0F == var3.field1814 && 0.0F == var3.field1815) {
                     if (var2 != -1644257037) {
                        throw new IllegalStateException();
                     }

                     var4 = true;
                  } else {
                     label214: {
                        if (var3.field1814 == Float.MAX_VALUE) {
                           if (var2 != -1644257037) {
                              throw new IllegalStateException();
                           }

                           if (var3.field1815 == Float.MAX_VALUE) {
                              if (var2 != -1644257037) {
                                 throw new IllegalStateException();
                              }

                              var5 = true;
                              break label214;
                           }
                        }

                        if (null != var3.field1820) {
                           if (var2 != -1644257037) {
                              throw new IllegalStateException();
                           }

                           if (var0.field1866) {
                              if (var2 != -1644257037) {
                                 throw new IllegalStateException();
                              }

                              float var6 = 1994604433 * var3.field1818;
                              float var10 = var3.field1816;
                              float var7 = var6 + var3.field1814 * 0.33333334F;
                              float var11 = var10 + 0.33333334F * var3.field1815;
                              float var9 = var3.field1820.field1818 * 1994604433;
                              float var13 = var3.field1820.field1816;
                              float var8 = var9 - 0.33333334F * var3.field1820.field1812;
                              float var12 = var13 - var3.field1820.field1813 * 0.33333334F;
                              if (var0.field1886) {
                                 ItemComposition.method5026(var0, var6, var7, var8, var9, var10, var11, var12, var13, 707122614);
                              } else {
                                 ObjectSound.method2678(var0, var6, var7, var8, var9, var10, var11, var12, var13, -509240052);
                              }

                              var0.field1866 = false;
                           }
                        } else {
                           var4 = true;
                        }
                     }
                  }

                  if (var4) {
                     if (var2 != -1644257037) {
                        throw new IllegalStateException();
                     }

                     return var3.field1816;
                  }

                  if (var5) {
                     if (var2 != -1644257037) {
                        throw new IllegalStateException();
                     }

                     if (var1 != 1994604433 * var3.field1818) {
                        if (null != var3.field1820) {
                           return var3.field1820.field1816;
                        }

                        if (var2 != -1644257037) {
                           throw new IllegalStateException();
                        }
                     }

                     return var3.field1816;
                  }

                  if (var0.field1886) {
                     if (var2 != -1644257037) {
                        throw new IllegalStateException();
                     }

                     float var16;
                     if (null == var0) {
                        if (var2 != -1644257037) {
                           throw new IllegalStateException();
                        }

                        var16 = 0.0F;
                     } else {
                        float var18;
                        if (var1 == var0.field1872) {
                           var18 = 0.0F;
                        } else if (var0.field1877 == var1) {
                           if (var2 != -1644257037) {
                              throw new IllegalStateException();
                           }

                           var18 = 1.0F;
                        } else {
                           var18 = (var1 - var0.field1872) / (var0.field1877 - var0.field1872);
                        }

                        float var19;
                        if (var0.field1884) {
                           if (var2 != -1644257037) {
                              throw new IllegalStateException();
                           }

                           var19 = var18;
                        } else {
                           float[] var20 = new float[4];
                           var20[3] = var0.field1879;
                           var20[2] = var0.field1876;
                           var20[1] = var0.field1878;
                           var20[0] = var0.field1874 - var18;
                           float[] var21 = new float[5];
                           int var22 = class157.method4367(var20, 3, 0.0F, true, 1.0F, true, var21, -1793120611);
                           if (var22 == 1) {
                              if (var2 != -1644257037) {
                                 throw new IllegalStateException();
                              }

                              var19 = var21[0];
                           } else {
                              var19 = 0.0F;
                           }
                        }

                        var16 = (var0.field1871 + var19 * (var0.field1868 * var19 + var0.field1875)) * var19 + var0.field1869;
                     }

                     return var16;
                  }

                  float var15;
                  if (var0 == null) {
                     if (var2 != -1644257037) {
                        throw new IllegalStateException();
                     }

                     var15 = 0.0F;
                  } else {
                     float var17 = var1 - var0.field1872;
                     var15 = var0.field1879 + var17 * (var0.field1876 + (var0.field1874 * var17 + var0.field1878) * var17);
                  }

                  return var15;
               }

               return 0.0F;
            }
         }

         return 0.0F;
      } catch (RuntimeException var14) {
         throw RestClientThreadFactory.newRunException(var14, "pj.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   public void method8729() {
      this.targetType = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bm")
   public void method8759(Buffer var1) {
      int var2 = var1.readUnsignedByte(-215572617);
      switch (var2) {
         case 1:
            this.targetType = 838457055;
            break;
         case 2:
            this.subX = -1799538112;
            this.subY = 2010054848;
            this.targetType = 1676914110;
            break;
         case 3:
            this.subX = 0;
            this.subY = 2010054848;
            this.targetType = 1676914110;
            break;
         case 4:
            this.subX = 695891072;
            this.subY = 2010054848;
            this.targetType = 1676914110;
            break;
         case 5:
            this.subX = -1799538112;
            this.subY = 0;
            this.targetType = 1676914110;
            break;
         case 6:
            this.subX = -1799538112;
            this.subY = -274857600;
            this.targetType = 1676914110;
         case 7:
         case 8:
         case 9:
         default:
            break;
         case 10:
            this.targetType = -1779596131;
            break;
         case 11:
            this.targetType = -941139076;
      }

      switch (this.targetType * -81304289) {
         case 0:
            break;
         case 1:
         case 3:
            this.targetIndex = Buffer.method12008(var1, (byte)5) * 1882778623;
            break;
         case 2:
            this.x = Buffer.method12008(var1, (byte)5) * -1617612093;
            this.y = Buffer.method12008(var1, (byte)5) * 1644138443;
            this.height = var1.readUnsignedByte(-1604688745) * 1745206753;
            break;
         case 4:
            this.targetIndex = Buffer.method12008(var1, (byte)5) * 1882778623;
            this.height = var1.readMedium(2155009) * 1745206753;
            break;
         default:
            throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(Lpj;Lxa;I)V")
   @ObfuscatedName("or")
   public static void method8760(HintArrow var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method8764(var1, var2);
      } else {
         var0.method8765(var1);

         try {
            int var3 = var1.readUnsignedByte(-1558334196);
            switch (var3) {
               case 1:
                  var0.targetType = 838457055;
                  break;
               case 2:
                  var0.subX = -1799538112;
                  var0.subY = 2010054848;
                  var0.targetType = 1676914110;
                  break;
               case 3:
                  var0.subX = 0;
                  var0.subY = 2010054848;
                  var0.targetType = 1676914110;
                  break;
               case 4:
                  var0.subX = 695891072;
                  var0.subY = 2010054848;
                  var0.targetType = 1676914110;
                  break;
               case 5:
                  var0.subX = -1799538112;
                  var0.subY = 0;
                  var0.targetType = 1676914110;
                  break;
               case 6:
                  var0.subX = -1799538112;
                  var0.subY = -274857600;
                  var0.targetType = 1676914110;
               case 7:
               case 8:
               case 9:
               default:
                  break;
               case 10:
                  var0.targetType = -1779596131;
                  break;
               case 11:
                  var0.targetType = -941139076;
            }

            switch (var0.targetType * -81304289) {
               case 0:
                  break;
               case 1:
               case 3:
                  var0.targetIndex = Buffer.method12008(var1, (byte)5) * 1882778623;
                  break;
               case 2:
                  var0.x = Buffer.method12008(var1, (byte)5) * -1617612093;
                  var0.y = Buffer.method12008(var1, (byte)5) * 1644138443;
                  var0.height = var1.readUnsignedByte(1663814167) * 1745206753;
                  break;
               case 4:
                  var0.targetIndex = Buffer.method12008(var1, (byte)5) * 1882778623;
                  var0.height = var1.readMedium(-746499325) * 1745206753;
                  break;
               default:
                  throw new RuntimeException("");
            }
         } catch (RuntimeException var4) {
            throw RestClientThreadFactory.newRunException(var4, "pj.ay(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ai")
   public boolean method8733() {
      return 0 != -81304289 * this.targetType;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   public void method8730(int var1) {
      try {
         this.targetType = 0;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pj.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public int method8743(int var1) {
      try {
         return this.x * -1421373973;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pj.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   public int method8737() {
      return this.targetType * -81304289;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ac")
   public boolean method8734() {
      return 0 != -81304289 * this.targetType;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bp")
   public void method8761(Buffer var1) {
      int var2 = var1.readUnsignedByte(-1681652696);
      switch (var2) {
         case 1:
            this.targetType = 838457055;
            break;
         case 2:
            this.subX = -623080081;
            this.subY = 33387553;
            this.targetType = -1818834720;
            break;
         case 3:
            this.subX = 0;
            this.subY = 2010054848;
            this.targetType = 224054654;
            break;
         case 4:
            this.subX = 695891072;
            this.subY = -687101960;
            this.targetType = -1987405524;
            break;
         case 5:
            this.subX = -1799538112;
            this.subY = 0;
            this.targetType = 1313543638;
            break;
         case 6:
            this.subX = 1966752679;
            this.subY = -274857600;
            this.targetType = 1676914110;
         case 7:
         case 8:
         case 9:
         default:
            break;
         case 10:
            this.targetType = -41301360;
            break;
         case 11:
            this.targetType = -883681056;
      }

      switch (this.targetType * -1296406737) {
         case 0:
            break;
         case 1:
         case 3:
            this.targetIndex = Buffer.method12008(var1, (byte)5) * 1882778623;
            break;
         case 2:
            this.x = Buffer.method12008(var1, (byte)5) * 379728319;
            this.y = Buffer.method12008(var1, (byte)5) * -1165825840;
            this.height = var1.readUnsignedByte(740100752) * -1702407958;
            break;
         case 4:
            this.targetIndex = Buffer.method12008(var1, (byte)5) * -1179863458;
            this.height = var1.readMedium(-173026293) * 1745206753;
            break;
         default:
            throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   public int method8741() {
      return this.targetIndex * -1237904385;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpj;)I")
   @ObfuscatedName("su")
   public static int method8750(HintArrow var0) {
      return var0.subX * 863546616;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("am")
   public int method8746() {
      return -1760786859 * this.y;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   public int method8747() {
      return 1327275491 * this.y;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("be")
   public int method8751() {
      return this.subX * 1076175705;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bg")
   public int method8753() {
      return 1339969195 * this.subY;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bs")
   public int method8754() {
      return 1339969195 * this.subY;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bz")
   public int method8755() {
      return 1339969195 * this.subY;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bb")
   public int method8758() {
      return this.height * 2050442785;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bj")
   public void method8762(Buffer var1) {
      int var2 = var1.readUnsignedByte(256817171);
      switch (var2) {
         case 1:
            this.targetType = 838457055;
            break;
         case 2:
            this.subX = -1799538112;
            this.subY = -1906126175;
            this.targetType = -1863311670;
            break;
         case 3:
            this.subX = 0;
            this.subY = -1653224391;
            this.targetType = 1676914110;
            break;
         case 4:
            this.subX = 559690631;
            this.subY = 2010054848;
            this.targetType = 1676914110;
            break;
         case 5:
            this.subX = -1799538112;
            this.subY = 0;
            this.targetType = -1133256679;
            break;
         case 6:
            this.subX = -1206423086;
            this.subY = -274857600;
            this.targetType = 1676914110;
         case 7:
         case 8:
         case 9:
         default:
            break;
         case 10:
            this.targetType = 1994511918;
            break;
         case 11:
            this.targetType = -941139076;
      }

      switch (this.targetType * -171814375) {
         case 0:
            break;
         case 1:
         case 3:
            this.targetIndex = Buffer.method12008(var1, (byte)5) * 1882778623;
            break;
         case 2:
            this.x = Buffer.method12008(var1, (byte)5) * -2144337660;
            this.y = Buffer.method12008(var1, (byte)5) * 1677169391;
            this.height = var1.readUnsignedByte(-1548523778) * -104777266;
            break;
         case 4:
            this.targetIndex = Buffer.method12008(var1, (byte)5) * 1882778623;
            this.height = var1.readMedium(337691454) * 1745206753;
            break;
         default:
            throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("bt")
   public void method8763(Buffer var1) {
      int var2 = var1.readUnsignedByte(169096201);
      switch (var2) {
         case 1:
            this.targetType = 838457055;
            break;
         case 2:
            this.subX = -1799538112;
            this.subY = 2010054848;
            this.targetType = 1676914110;
            break;
         case 3:
            this.subX = 0;
            this.subY = 2010054848;
            this.targetType = 1676914110;
            break;
         case 4:
            this.subX = 695891072;
            this.subY = 2010054848;
            this.targetType = 1676914110;
            break;
         case 5:
            this.subX = -1799538112;
            this.subY = 0;
            this.targetType = 1676914110;
            break;
         case 6:
            this.subX = -1799538112;
            this.subY = -274857600;
            this.targetType = 1676914110;
         case 7:
         case 8:
         case 9:
         default:
            break;
         case 10:
            this.targetType = -1779596131;
            break;
         case 11:
            this.targetType = -941139076;
      }

      switch (this.targetType * -81304289) {
         case 0:
            break;
         case 1:
         case 3:
            this.targetIndex = Buffer.method12008(var1, (byte)5) * 1882778623;
            break;
         case 2:
            this.x = Buffer.method12008(var1, (byte)5) * -1617612093;
            this.y = Buffer.method12008(var1, (byte)5) * 1644138443;
            this.height = var1.readUnsignedByte(856312885) * 1745206753;
            break;
         case 4:
            this.targetIndex = Buffer.method12008(var1, (byte)5) * 1882778623;
            this.height = var1.readMedium(1132223010) * 1745206753;
            break;
         default:
            throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ar")
   public int method8738() {
      return this.targetType * 1147566237;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("as")
   public boolean method8735() {
      return 0 != -81304289 * this.height;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   public int method8748(int var1) {
      try {
         return 1327275491 * this.subX;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pj.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   public int method8742(int var1) {
      try {
         return this.targetIndex * -1237904385;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "pj.an(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("ay")
   public void method8764(Buffer var1, int var2) {
      this.method8759(var1);

      try {
         int var3 = var1.readUnsignedShortAdd(-1558334196);
         switch (var3) {
            case 1:
               this.subY = 838457055;
               break;
            case 2:
               this.subX = -1799538112;
               this.height = 2010054848;
               this.targetIndex = 1676914110;
               break;
            case 3:
               this.subX = 0;
               this.subX = 2010054848;
               this.subX = 1676914110;
               break;
            case 4:
               this.subX = 695891072;
               this.x = 2010054848;
               this.subY = 1676914110;
               break;
            case 5:
               this.x = -1799538112;
               this.subY = 0;
               this.y = 1676914110;
               break;
            case 6:
               this.subY = -1799538112;
               this.x = -274857600;
               this.subY = 1676914110;
            case 7:
            case 8:
            case 9:
            default:
               break;
            case 10:
               this.targetType = -1779596131;
               break;
            case 11:
               this.x = -941139076;
         }

         switch (this.subX * -81304289) {
            case 0:
               break;
            case 1:
            case 3:
               this.subY = Buffer.method12008(var1, (byte)5) * 1882778623;
               break;
            case 2:
               this.y = Buffer.method12008(var1, (byte)5) * -1617612093;
               this.targetIndex = Buffer.method12008(var1, (byte)5) * 1644138443;
               this.subY = var1.readUnsignedByte(1663814167) * 1745206753;
               break;
            case 4:
               this.y = Buffer.method12008(var1, (byte)5) * 1882778623;
               this.y = var1.readShortLE(-746499325) * 1745206753;
               break;
            default:
               throw new RuntimeException("");
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "pj.ay(" + ')');
      }
   }
}
