import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ft")
public class classFT {
   @ObfuscatedName("aw")
   float field1877;
   @ObfuscatedName("ad")
   float field1869;
   @ObfuscatedName("ab")
   boolean field1866 = true;
   @ObfuscatedName("at")
   boolean field1885;
   @ObfuscatedSignature(descriptor = "[Lfl;")
   @ObfuscatedName("ae")
   class134[] field1888;
   @ObfuscatedSignature(descriptor = "Lfi;")
   @ObfuscatedName("an")
   class137 field1883;
   @ObfuscatedName("ak")
   float field1872;
   @ObfuscatedName("ap")
   float field1874;
   @ObfuscatedName("ax")
   int field1881;
   @ObfuscatedName("ay")
   float field1878;
   @ObfuscatedName("au")
   float field1876;
   @ObfuscatedName("az")
   float field1879;
   @ObfuscatedName("aj")
   boolean field1884;
   @ObfuscatedName("ai")
   float field1871;
   @ObfuscatedName("av")
   boolean field1886;
   @ObfuscatedName("ac")
   float field1868;
   @ObfuscatedSignature(descriptor = "Lfi;")
   @ObfuscatedName("ag")
   class137 field1882;
   @ObfuscatedName("al")
   int field1867 = 0;
   @ObfuscatedName("ar")
   float[] field1887;
   @ObfuscatedName("as")
   float field1875;
   @ObfuscatedName("ah")
   int field1880;
   @ObfuscatedName("af")
   float field1870;
   @ObfuscatedName("am")
   float field1873;

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ap")
   public static final void method4125(int var0) {
      try {
         ViewportMouse.ViewportMouse_isInViewport = false;
         ViewportMouse.ViewportMouse_entityCount = 0;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ft.ap(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;IB)I")
   @ObfuscatedName("av")
   int method4100(Buffer var1, int var2, byte var3) {
      try {
         int var4 = Buffer.method12008(var1, (byte)5);
         int var5 = var1.readUnsignedByte(1370825033);
         class147 var6 = (class147)GrandExchangeOffer.findEnumerated(WorldMapID.method7173(-1895878343), var5, (byte)1);
         if (var6 == null) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            var6 = class147.field1897;
         }

         this.field1882 = UrlRequest.method3929(var1.readUnsignedByte(668039951), (byte)2);
         this.field1883 = UrlRequest.method3929(var1.readUnsignedByte(1269335491), (byte)-5);
         boolean var10001;
         if (var1.readUnsignedByte(1270783113) != 0) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.field1886 = var10001;
         this.field1888 = new class134[var4];
         class134 var11 = null;

         for (int var7 = 0; var7 < var4; var7++) {
            class134 var8 = new class134();
            var8.method4018(var1, var2, -1793120611);
            this.field1888[var7] = var8;
            if (null != var11) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               var11.field1820 = var8;
            }

            var11 = var8;
         }

         return var4;
      } catch (RuntimeException var9) {
         throw RestClientThreadFactory.newRunException(var9, "ft.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)F")
   @ObfuscatedName("ag")
   public float method4110(int var1, byte var2) {
      try {
         if (var1 < method4113(this, 778412743)) {
            if (var2 == 1) {
               throw new IllegalStateException();
            } else {
               return this.field1870;
            }
         } else if (var1 > this.method4115(570529957)) {
            if (var2 == 1) {
               throw new IllegalStateException();
            } else {
               return this.field1873;
            }
         } else {
            return this.field1887[var1 - method4113(this, 1346826704)];
         }
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ft.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   int method4115(int var1) {
      try {
         return this.field1880 * 1391052631;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ft.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)I")
   @ObfuscatedName("au")
   int method4101(Buffer var1, int var2) {
      int var3 = Buffer.method12008(var1, (byte)5);
      int var4 = var1.readUnsignedByte(879612083);
      class147 var5 = (class147)GrandExchangeOffer.findEnumerated(WorldMapID.method7173(-1928178709), var4, (byte)1);
      if (var5 == null) {
         var5 = class147.field1897;
      }

      this.field1882 = UrlRequest.method3929(var1.readUnsignedByte(-1534962428), (byte)36);
      this.field1883 = UrlRequest.method3929(var1.readUnsignedByte(117078534), (byte)-41);
      this.field1886 = var1.readUnsignedByte(-434131014) != 0;
      this.field1888 = new class134[var3];
      class134 var9 = null;

      for (int var6 = 0; var6 < var3; var6++) {
         class134 var7 = new class134();
         var7.method4018(var1, var2, -1793120611);
         this.field1888[var6] = var7;
         if (null != var9) {
            var9.field1820 = var7;
         }

         var9 = var7;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(FI)Lfl;")
   @ObfuscatedName("aw")
   class134 method4126(float var1, int var2) {
      try {
         int var3 = method4122(this, var1, -950150636);
         if (var3 < 0 || var3 >= this.field1888.length) {
            return null;
         } else if (var2 >= -418081744) {
            throw new IllegalStateException();
         } else {
            return this.field1888[var3];
         }
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ft.aw(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   void method4105() {
      this.field1881 = -1832403357 * this.field1888[0].field1818;
      this.field1880 = this.field1888[method4131(this, (byte)-53) - 1].field1818 * 676849495;
      this.field1887 = new float[this.method4121(147322503) + 1];

      for (int var1 = method4113(this, 1349548257); var1 <= this.method4115(570529957); var1++) {
         this.field1887[var1 - method4113(this, 765172944)] = HintArrow.method8726(this, var1, -1644257037);
      }

      this.field1888 = null;
      this.field1870 = HintArrow.method8726(this, method4113(this, 313122990) - 1, -1644257037);
      this.field1873 = HintArrow.method8726(this, this.method4115(570529957) + 1, -1644257037);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bg")
   int method4130() {
      return this.field1888 == null ? 0 : this.field1888.length;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   void method4106() {
      this.field1881 = -1832403357 * this.field1888[0].field1818;
      this.field1880 = this.field1888[method4131(this, (byte)7) - 1].field1818 * -508290804;
      this.field1887 = new float[this.method4121(-1297946015) + 1];

      for (int var1 = method4113(this, 1212561690); var1 <= this.method4115(570529957); var1++) {
         this.field1887[var1 - method4113(this, 1415489713)] = HintArrow.method8726(this, var1, -1644257037);
      }

      this.field1888 = null;
      this.field1870 = HintArrow.method8726(this, method4113(this, 509438067) - 1, -1644257037);
      this.field1873 = HintArrow.method8726(this, this.method4115(570529957) + 1, -1644257037);
   }

   @ObfuscatedSignature(descriptor = "(I)F")
   @ObfuscatedName("as")
   public float method4111(int var1) {
      if (var1 < method4113(this, 1072098207)) {
         return this.field1870;
      } else {
         return var1 > this.method4115(570529957) ? this.field1873 : this.field1887[var1 - method4113(this, 1776151460)];
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   int method4112() {
      return this.field1881 * 1966735995;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvu;)I")
   @ObfuscatedName("md")
   public static int method4109(classVU var0) {
      return var0.field6309 * 1190339569;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   int method4116() {
      return this.field1880 * 1391052631;
   }

   @ObfuscatedSignature(descriptor = "(Lft;B)I")
   @ObfuscatedName("xs")
   public static int method4131(classFT var0, byte var1) {
      if (var0 == null) {
         var0.method4133(var1);
      }

      try {
         if (var0.field1888 == null) {
            if (var1 == -2) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return var0.field1888.length;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ft.ap(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lft;I)I")
   @ObfuscatedName("xp")
   public static int method4113(classFT var0, int var1) {
      if (var0 == null) {
         return var0.method4114(var1);
      } else {
         try {
            return var0.field1881 * 1966735995;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "ft.an(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ar")
   int method4117() {
      return this.field1880 * 1391052631;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   int method4118() {
      return this.field1880 * 1565053824;
   }

   @ObfuscatedSignature(descriptor = "(Lft;FI)I")
   @ObfuscatedName("gx")
   public static int method4122(classFT var0, float var1, int var2) {
      if (var0 == null) {
         return var0.method4124(var1, var2);
      } else {
         try {
            if (var0.field1867 * -86703831 >= 0) {
               if (var2 == -1801794360) {
                  throw new IllegalStateException();
               }

               if (var0.field1888[-86703831 * var0.field1867].field1818 * 1994604433 <= var1) {
                  if (var2 == -1801794360) {
                     throw new IllegalStateException();
                  }

                  if (null == var0.field1888[var0.field1867 * -86703831].field1820) {
                     return -86703831 * var0.field1867;
                  }

                  if (var2 == -1801794360) {
                     throw new IllegalStateException();
                  }

                  if (var0.field1888[-86703831 * var0.field1867].field1820.field1818 * 1994604433 > var1) {
                     if (var2 == -1801794360) {
                        throw new IllegalStateException();
                     }

                     return -86703831 * var0.field1867;
                  }
               }
            }

            if (!(var1 < method4113(var0, 376953886))) {
               if (var2 == -1801794360) {
                  throw new IllegalStateException();
               }

               if (!(var1 > var0.method4115(570529957))) {
                  int var3 = method4131(var0, (byte)23);
                  int var4 = var0.field1867 * -86703831;
                  if (var3 > 0) {
                     if (var2 == -1801794360) {
                        throw new IllegalStateException();
                     }

                     int var5 = 0;
                     int var6 = var3 - 1;

                     while (true) {
                        int var7 = var6 + var5 >> 1;
                        if (var1 < 1994604433 * var0.field1888[var7].field1818) {
                           if (var2 == -1801794360) {
                              throw new IllegalStateException();
                           }

                           if (var1 > 1994604433 * var0.field1888[var7 - 1].field1818) {
                              if (var2 == -1801794360) {
                                 throw new IllegalStateException();
                              }

                              var4 = var7 - 1;
                              break;
                           }

                           var6 = var7 - 1;
                        } else {
                           if (!(var1 > var0.field1888[var7].field1818 * 1994604433)) {
                              var4 = var7;
                              break;
                           }

                           if (var2 == -1801794360) {
                              throw new IllegalStateException();
                           }

                           if (var1 < 1994604433 * var0.field1888[1 + var7].field1818) {
                              if (var2 == -1801794360) {
                                 throw new IllegalStateException();
                              }

                              var4 = var7;
                              break;
                           }

                           var5 = 1 + var7;
                        }

                        if (var5 > var6) {
                           if (var2 == -1801794360) {
                              throw new IllegalStateException();
                           }
                           break;
                        }
                     }
                  }

                  if (-86703831 * var0.field1867 != var4) {
                     var0.field1867 = var4 * 1427712793;
                     var0.field1866 = true;
                  }

                  return var0.field1867 * -86703831;
               }
            }

            return -1;
         } catch (RuntimeException var8) {
            throw RestClientThreadFactory.newRunException(var8, "ft.ak(" + 41);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;F)Lfl;")
   @ObfuscatedName("pz")
   public static class134 method4127(classFT var0, float var1) {
      if (var0 == null) {
         return var0.method4129(var1);
      } else {
         int var2 = method4122(var0, var1, 2062206952);
         return var2 >= 0 && var2 < var0.field1888.length ? var0.field1888[var2] : null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lft;B)V")
   @ObfuscatedName("gb")
   public static void method4107(classFT var0, byte var1) {
      if (var0 == null) {
         var0.method4108(var1);
      }

      try {
         var0.field1881 = -1832403357 * var0.field1888[0].field1818;
         var0.field1880 = var0.field1888[method4131(var0, (byte)-71) - 1].field1818 * 676849495;
         var0.field1887 = new float[var0.method4121(830628460) + 1];

         for (int var2 = method4113(var0, 1536981458); var2 <= var0.method4115(570529957); var2++) {
            if (var1 >= 20) {
               throw new IllegalStateException();
            }

            var0.field1887[var2 - method4113(var0, 1745981511)] = HintArrow.method8726(var0, var2, -1644257037);
         }

         var0.field1888 = null;
         var0.field1870 = HintArrow.method8726(var0, method4113(var0, 1203073414) - 1, -1644257037);
         var0.field1873 = HintArrow.method8726(var0, var0.method4115(570529957) + 1, -1644257037);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ft.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   int method4119() {
      return this.method4115(570529957) - method4113(this, 584865294);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   int method4120() {
      return this.method4115(570529957) - method4113(this, 1211855085);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   int method4121(int var1) {
      try {
         return this.method4115(570529957) - method4113(this, 413819159);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ft.aj(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(F)I")
   @ObfuscatedName("ao")
   int method4123(float var1) {
      if (this.field1867 * -86703831 < 0
         || !(this.field1888[-86703831 * this.field1867].field1818 * 1994604433 <= var1)
         || null != this.field1888[this.field1867 * -86703831].field1820
            && !(this.field1888[-86703831 * this.field1867].field1820.field1818 * 1994604433 > var1)) {
         if (!(var1 < method4113(this, 906647908)) && !(var1 > this.method4115(570529957))) {
            int var2 = method4131(this, (byte)94);
            int var3 = this.field1867 * -86703831;
            if (var2 > 0) {
               int var4 = 0;
               int var5 = var2 - 1;

               do {
                  int var6 = var5 + var4 >> 1;
                  if (var1 < 1994604433 * this.field1888[var6].field1818) {
                     if (var1 > 1994604433 * this.field1888[var6 - 1].field1818) {
                        var3 = var6 - 1;
                        break;
                     }

                     var5 = var6 - 1;
                  } else {
                     if (!(var1 > this.field1888[var6].field1818 * 1994604433)) {
                        var3 = var6;
                        break;
                     }

                     if (var1 < 1994604433 * this.field1888[1 + var6].field1818) {
                        var3 = var6;
                        break;
                     }

                     var4 = 1 + var6;
                  }
               } while (var4 <= var5);
            }

            if (-86703831 * this.field1867 != var3) {
               this.field1867 = var3 * 1427712793;
               this.field1866 = true;
            }

            return this.field1867 * -86703831;
         } else {
            return -1;
         }
      } else {
         return -86703831 * this.field1867;
      }
   }

   @ObfuscatedSignature(descriptor = "(FFFFB)Lra;")
   @ObfuscatedName("at")
   static class461 method4104(float var0, float var1, float var2, float var3, byte var4) {
      try {
         synchronized (class461.field5498) {
            if (0 == -603351739 * class461.field5496) {
               if (var4 == 9) {
                  throw new IllegalStateException();
               } else {
                  return new class461(var0, var1, var2, var3);
               }
            } else {
               class461.field5498[(class461.field5496 -= -1125927539) * -603351739].method9294(var0, var1, var2, var3, (byte)59);
               return class461.field5498[-603351739 * class461.field5496];
            }
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "ft.at(" + ')');
      }
   }

   classFT() {
   }

   @ObfuscatedSignature(descriptor = "(F)Lfl;")
   @ObfuscatedName("aa")
   class134 method4128(float var1) {
      int var2 = method4122(this, var1, -785888990);
      return var2 >= 0 && var2 < this.field1888.length ? this.field1888[var2] : null;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("av")
   public static void method4099(int var0) {
      try {
         class212.field1909.clear();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ft.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;Lxa;I)I")
   @ObfuscatedName("zv")
   public static int method4102(classFT var0, Buffer var1, int var2) {
      if (var0 == null) {
         var0.method4118();
      }

      int var3 = Buffer.method12008(var1, (byte)5);
      int var4 = var1.readUnsignedByte(1850896853);
      class147 var5 = (class147)GrandExchangeOffer.findEnumerated(WorldMapID.method7173(-1408744868), var4, (byte)1);
      if (var5 == null) {
         var5 = class147.field1897;
      }

      var0.field1882 = UrlRequest.method3929(var1.readUnsignedByte(-68768112), (byte)-11);
      var0.field1883 = UrlRequest.method3929(var1.readUnsignedByte(-455229246), (byte)85);
      var0.field1886 = var1.readUnsignedByte(307098455) != 0;
      var0.field1888 = new class134[var3];
      class134 var9 = null;

      for (int var6 = 0; var6 < var3; var6++) {
         class134 var7 = new class134();
         var7.method4018(var1, var2, -1793120611);
         var0.field1888[var6] = var7;
         if (null != var9) {
            var9.field1820 = var7;
         }

         var9 = var7;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)I")
   @ObfuscatedName("ay")
   int method4103(Buffer var1, int var2) {
      int var3 = Buffer.method12008(var1, (byte)5);
      int var4 = var1.readUnsignedByte(1443863117);
      class147 var5 = (class147)GrandExchangeOffer.findEnumerated(WorldMapID.method7173(-1813665258), var4, (byte)1);
      if (var5 == null) {
         var5 = class147.field1897;
      }

      this.field1882 = UrlRequest.method3929(var1.readUnsignedByte(1525213463), (byte)-30);
      this.field1883 = UrlRequest.method3929(var1.readUnsignedByte(1186828205), (byte)-11);
      this.field1886 = var1.readUnsignedByte(1836974135) != 0;
      this.field1888 = new class134[var3];
      class134 var9 = null;

      for (int var6 = 0; var6 < var3; var6++) {
         class134 var7 = new class134();
         var7.method4018(var1, var2, -1793120611);
         this.field1888[var6] = var7;
         if (null != var9) {
            var9.field1820 = var7;
         }

         var9 = var7;
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("an")
   int method4114(int var1) {
      try {
         return this.field1881 * 1966735995;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ft.an(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;)I")
   @ObfuscatedName("kf")
   public static int method4132(classFT var0) {
      if (var0 == null) {
         return var0.method4130();
      } else {
         return var0.field1888 == null ? 0 : var0.field1888.length;
      }
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("ap")
   int method4133(byte var1) {
      try {
         if (this.field1888 == null) {
            if (var1 == -2) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return this.field1888.length;
         }
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ft.ap(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lft;)I")
   @ObfuscatedName("lh")
   public static int method4134(classFT var0) {
      return var0.field1888 == null ? 0 : var0.field1888.length;
   }

   @ObfuscatedSignature(descriptor = "(FI)I")
   @ObfuscatedName("ak")
   int method4124(float var1, int var2) {
      try {
         if (this.field1880 * -86703831 >= 0) {
            if (var2 == -1801794360) {
               throw new IllegalStateException();
            }

            if (this.field1888[-86703831 * this.field1881].field1818 * 1994604433 <= var1) {
               if (var2 == -1801794360) {
                  throw new IllegalStateException();
               }

               if (null == this.field1888[this.field1880 * -86703831].field1820) {
                  return -86703831 * this.field1867;
               }

               if (var2 == -1801794360) {
                  throw new IllegalStateException();
               }

               if (this.field1888[-86703831 * this.field1880].field1820.field1818 * 1994604433 > var1) {
                  if (var2 == -1801794360) {
                     throw new IllegalStateException();
                  }

                  return -86703831 * this.field1867;
               }
            }
         }

         if (!(var1 < method4113(this, 376953886))) {
            if (var2 == -1801794360) {
               throw new IllegalStateException();
            }

            if (!(var1 > this.method4115(570529957))) {
               int var3 = method4131(this, (byte)23);
               int var4 = this.field1867 * -86703831;
               if (var3 > 0) {
                  if (var2 == -1801794360) {
                     throw new IllegalStateException();
                  }

                  int var5 = 0;
                  int var6 = var3 - 1;

                  while (true) {
                     int var7 = var6 + var5 >> 1;
                     if (var1 < 1994604433 * this.field1888[var7].field1818) {
                        if (var2 == -1801794360) {
                           throw new IllegalStateException();
                        }

                        if (var1 > 1994604433 * this.field1888[var7 - 1].field1818) {
                           if (var2 == -1801794360) {
                              throw new IllegalStateException();
                           }

                           var4 = var7 - 1;
                           break;
                        }

                        var6 = var7 - 1;
                     } else {
                        if (!(var1 > this.field1888[var7].field1818 * 1994604433)) {
                           var4 = var7;
                           break;
                        }

                        if (var2 == -1801794360) {
                           throw new IllegalStateException();
                        }

                        if (var1 < 1994604433 * this.field1888[1 + var7].field1818) {
                           if (var2 == -1801794360) {
                              throw new IllegalStateException();
                           }

                           var4 = var7;
                           break;
                        }

                        var5 = 1 + var7;
                     }

                     if (var5 > var6) {
                        if (var2 == -1801794360) {
                           throw new IllegalStateException();
                        }
                        break;
                     }
                  }
               }

               if (-86703831 * this.field1867 != var4) {
                  this.field1880 = var4 * 1427712793;
                  this.field1866 = true;
               }

               return this.field1867 * -86703831;
            }
         }

         return -1;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "ft.ak(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("at")
   void method4108(byte var1) {
      try {
         this.field1880 = -1832403357 * this.field1888[0].field1818;
         this.field1881 = this.field1888[method4131(this, (byte)-71) - 1].field1818 * 676849495;
         this.field1887 = new float[this.method4115(830628460) + 1];

         for (int var2 = method4113(this, 1536981458); var2 <= this.method4121(570529957); var2++) {
            if (var1 >= 20) {
               throw new IllegalStateException();
            }

            this.field1887[var2 - method4113(this, 1745981511)] = HintArrow.method8726(this, var2, -1644257037);
         }

         this.field1888 = null;
         this.field1872 = HintArrow.method8726(this, method4113(this, 1203073414) - 1, -1644257037);
         this.field1879 = HintArrow.method8726(this, this.method4114(570529957) + 1, -1644257037);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ft.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(F)Lfl;")
   @ObfuscatedName("aq")
   class134 method4129(float var1) {
      int var2 = method4122(this, var1, 2062206952);
      return var2 >= 0 && var2 < this.field1888.length ? this.field1888[var2] : null;
   }
}
