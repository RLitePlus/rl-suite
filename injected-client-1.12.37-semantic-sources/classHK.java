import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("hk")
public class classHK implements classHM {
   @ObfuscatedName("aa")
   int field2815;
   @ObfuscatedName("ac")
   int field2817;
   @ObfuscatedName("af")
   int field2819;
   @ObfuscatedName("ab")
   int field2816;
   @ObfuscatedName("ag")
   int field2820;
   @ObfuscatedName("as")
   int field2826;
   @ObfuscatedName("ax")
   int field2827;
   @ObfuscatedName("aj")
   int field2821;
   @ToRemove(unused = "true")
   @ObfuscatedName("bh")
   static final int field2830 = 104;
   @ObfuscatedName("ay")
   int field2828;
   @ObfuscatedName("al")
   int field2822;
   @ObfuscatedName("az")
   int field2829;
   @ObfuscatedName("ao")
   int field2824;
   @ObfuscatedName("aq")
   int field2825;
   @ObfuscatedName("ae")
   int field2818;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field2823 = 26;

   @ObfuscatedSignature(descriptor = "(Lhg;I)V")
   @ObfuscatedName("az")
   @Override
   public void vmethod469(classHG var1, int var2) {
      try {
         if (-1293823145 * var1.field2789 > -1353143963 * this.field2820) {
            if (var2 <= -419997227) {
               throw new IllegalStateException();
            }

            var1.field2789 = 1545277347 * this.field2820;
         }

         if (var1.field2792 * 1597382741 < -1353143963 * this.field2820) {
            if (var2 <= -419997227) {
               throw new IllegalStateException();
            }

            var1.field2792 = this.field2820 * 2050700497;
         }

         if (var1.field2790 * 1546846349 > 2063526891 * this.field2826) {
            if (var2 <= -419997227) {
               throw new IllegalStateException();
            }

            var1.field2790 = this.field2826 * -1892176809;
         }

         if (252768043 * var1.field2791 < 2063526891 * this.field2826) {
            var1.field2791 = -1825728959 * this.field2826;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "hk.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIIB)[I")
   @ObfuscatedName("ab")
   @Override
   public int[] vmethod478(int var1, int var2, int var3, byte var4) {
      try {
         if (!this.vmethod472(var1, var2, var3, -929971652)) {
            if (var4 <= 2) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return new int[]{
               var2 + (this.field2820 * -701867712 - this.field2818 * 2057585728) + (2058561448 * this.field2822 - this.field2827 * 552125192),
               this.field2821 * -810536552 - 1165144616 * this.field2817 + var3 + (this.field2826 * -1078265152 - this.field2816 * -1244339392)
            };
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "hk.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("af")
   @Override
   public boolean vmethod472(int var1, int var2, int var3, int var4) {
      try {
         if (var1 >= 1417542939 * this.field2829) {
            if (var4 >= -651641119) {
               throw new IllegalStateException();
            }

            if (var1 < this.field2829 * 1417542939 + this.field2819 * 232648257) {
               if (var2 >= (-1511354095 * this.field2818 << 6) + (-1541597087 * this.field2827 << 3)
                  && var2 <= 7 + (this.field2818 * -1511354095 << 6) + (this.field2815 * -848311131 << 3)) {
                  if (var4 >= -651641119) {
                     throw new IllegalStateException();
                  }

                  if (var3 >= (this.field2816 * 114774925 << 6) + (1219384901 * this.field2817 << 3)
                     && var3 <= (47188037 * this.field2824 << 3) + (114774925 * this.field2816 << 6) + 7) {
                     if (var4 >= -651641119) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }

               return false;
            }

            if (var4 >= -651641119) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "hk.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIB)Z")
   @ObfuscatedName("ae")
   @Override
   public boolean vmethod476(int var1, int var2, byte var3) {
      try {
         if (var1 >= (this.field2822 * 794191093 << 3) + (this.field2820 * -1353143963 << 6)) {
            if (var3 != 60) {
               throw new IllegalStateException();
            }

            if (var1 <= (1679132345 * this.field2828 << 3) + (-1353143963 * this.field2820 << 6) + 7) {
               if (var3 != 60) {
                  throw new IllegalStateException();
               }

               if (var2 >= (2063526891 * this.field2826 << 6) + (1509295667 * this.field2821 << 3)) {
                  if (var3 != 60) {
                     throw new IllegalStateException();
                  }

                  if (var2 <= 7 + (2063526891 * this.field2826 << 6) + (this.field2825 * 1438726873 << 3)) {
                     if (var3 != 60) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "hk.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lte;I)I")
   @ObfuscatedName("ap")
   public static int method6069(classTE var0, int var1) {
      try {
         int var2 = 3;
         if (var0 == null) {
            return var2;
         } else if (var1 != 65280) {
            throw new IllegalStateException();
         } else {
            switch (var0.field6128.field7107 * -900901303) {
               case 2:
                  var2 += 815738868 * var0.field6131;
                  return var2;
               case 3:
                  var2 += var0.field6131 * 1631477736;
                  return var2;
               case 4:
                  for (int var3 = 0; var3 < var0.field6131 * -1943548931; var3++) {
                     if (var1 != 65280) {
                        throw new IllegalStateException();
                     }

                     var2 += classAU.method712((String)var0.field6125[var3], (byte)124);
                  }

                  return var2;
               default:
                  throw new IllegalArgumentException();
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "hk.ap(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhk;B)V")
   @ObfuscatedName("od")
   public static void method6065(classHK var0, byte var1) {
      if (var0 == null) {
         var0.method6067(var1);
      } else {
         try {
            ;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "hk.ax(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lky;")
   @ObfuscatedName("ar")
   @Override
   public classKY vmethod482(int var1, int var2) {
      if (!this.vmethod476(var1, var2, (byte)60)) {
         return null;
      } else {
         int var3 = this.field2818 * 2057585728 - this.field2820 * -701867712 + var1 + (552125192 * this.field2827 - this.field2822 * 2058561448);
         int var4 = -1244339392 * this.field2816 - -1078265152 * this.field2826 + var2 + (1165144616 * this.field2817 - -810536552 * this.field2821);
         return new classKY(1417542939 * this.field2829, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("as")
   @Override
   public void vmethod484(classXY var1, int var2) {
      try {
         this.field2829 = classXY.method13039(var1, -346779531) * 467211539;
         this.field2819 = classXY.method13039(var1, -346779531) * 62464449;
         this.field2818 = classXY.method13047(var1, 1474365486) * 1825996785;
         this.field2827 = classXY.method13039(var1, -346779531) * 81234849;
         this.field2815 = classXY.method13039(var1, -346779531) * 1346583341;
         this.field2816 = classXY.method13047(var1, 352073910) * 1982605125;
         this.field2817 = classXY.method13039(var1, -346779531) * -641315699;
         this.field2824 = classXY.method13039(var1, -346779531) * 203541133;
         this.field2820 = classXY.method13047(var1, 158385951) * -634232723;
         this.field2822 = classXY.method13039(var1, -346779531) * -842258595;
         this.field2828 = classXY.method13039(var1, -346779531) * 2034147209;
         this.field2826 = classXY.method13047(var1, 1922120835) * 1289741507;
         this.field2821 = classXY.method13039(var1, -346779531) * -717986565;
         this.field2825 = classXY.method13039(var1, -346779531) * -1833327255;
         method6065(this, (byte)11);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "hk.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lky;")
   @ObfuscatedName("ak")
   @Override
   public classKY vmethod481(int var1, int var2) {
      if (!this.vmethod476(var1, var2, (byte)60)) {
         return null;
      } else {
         int var3 = this.field2818 * 2015973946 - this.field2820 * -526188269 + var1 + (552125192 * this.field2827 - this.field2822 * 1130417844);
         int var4 = -1244339392 * this.field2816 - 1669342762 * this.field2826 + var2 + (-1489946012 * this.field2817 - 1628835550 * this.field2821);
         return new classKY(1750133462 * this.field2829, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhg;)V")
   @ObfuscatedName("ac")
   @Override
   public void vmethod470(classHG var1) {
      if (-1293823145 * var1.field2789 > 889893032 * this.field2820) {
         var1.field2789 = 1545277347 * this.field2820;
      }

      if (var1.field2792 * 1390674769 < -1353143963 * this.field2820) {
         var1.field2792 = this.field2820 * 2050700497;
      }

      if (var1.field2790 * 1546846349 > -175469054 * this.field2826) {
         var1.field2790 = this.field2826 * -1892176809;
      }

      if (-297465246 * var1.field2791 < 2063526891 * this.field2826) {
         var1.field2791 = -657268310 * this.field2826;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhg;)V")
   @ObfuscatedName("aa")
   @Override
   public void vmethod471(classHG var1) {
      if (-1976560687 * var1.field2789 > -1353143963 * this.field2820) {
         var1.field2789 = 1375900474 * this.field2820;
      }

      if (var1.field2792 * -869081745 < -1353143963 * this.field2820) {
         var1.field2792 = this.field2820 * 2050700497;
      }

      if (var1.field2790 * -663360808 > 2063526891 * this.field2826) {
         var1.field2790 = this.field2826 * -1892176809;
      }

      if (-1410543321 * var1.field2791 < 2063526891 * this.field2826) {
         var1.field2791 = -1825728959 * this.field2826;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("aj")
   @Override
   public boolean vmethod475(int var1, int var2) {
      return var1 >= (this.field2822 * 794191093 << 3) + (this.field2820 * -1353143963 << 6)
         && var1 <= (1679132345 * this.field2828 << 3) + (-1353143963 * this.field2820 << 6) + 7
         && var2 >= (2063526891 * this.field2826 << 6) + (1509295667 * this.field2821 << 3)
         && var2 <= 7 + (2063526891 * this.field2826 << 6) + (this.field2825 * 1438726873 << 3);
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ao")
   @Override
   public boolean vmethod473(int var1, int var2, int var3) {
      return var1 >= -358573633 * this.field2829 && var1 < this.field2829 * -738279293 + this.field2819 * -1887001121
         ? var2 >= (-1094760656 * this.field2818 << 6) + (-1541597087 * this.field2827 << 3)
            && var2 <= 7 + (this.field2818 * 887003286 << 6) + (this.field2815 * -848311131 << 3)
            && var3 >= (this.field2816 * 114774925 << 6) + (-1372843908 * this.field2817 << 3)
            && var3 <= (1032074613 * this.field2824 << 3) + (-1170072487 * this.field2816 << 6) + 7
         : false;
   }

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("aq")
   @Override
   public int[] vmethod479(int var1, int var2, int var3) {
      return !this.vmethod472(var1, var2, var3, -1446004234)
         ? null
         : new int[]{
            var2 + (this.field2820 * -701867712 - this.field2818 * 2057585728) + (2058561448 * this.field2822 - this.field2827 * 552125192),
            this.field2821 * -810536552 - 1165144616 * this.field2817 + var3 + (this.field2826 * -1078265152 - this.field2816 * -1244339392)
         };
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ay")
   @Override
   public boolean vmethod477(int var1, int var2) {
      return var1 >= (this.field2822 * 794191093 << 3) + (this.field2820 * -1353143963 << 6)
         && var1 <= (1679132345 * this.field2828 << 3) + (-1353143963 * this.field2820 << 6) + 7
         && var2 >= (2063526891 * this.field2826 << 6) + (1509295667 * this.field2821 << 3)
         && var2 <= 7 + (2063526891 * this.field2826 << 6) + (this.field2825 * 1438726873 << 3);
   }

   @ObfuscatedSignature(descriptor = "(III)Lky;")
   @ObfuscatedName("ag")
   @Override
   public classKY vmethod480(int var1, int var2, int var3) {
      try {
         if (!this.vmethod476(var1, var2, (byte)60)) {
            if (var3 != 2141092142) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = this.field2818 * 2057585728 - this.field2820 * -701867712 + var1 + (552125192 * this.field2827 - this.field2822 * 2058561448);
            int var5 = -1244339392 * this.field2816 - -1078265152 * this.field2826 + var2 + (1165144616 * this.field2817 - -810536552 * this.field2821);
            return new classKY(1417542939 * this.field2829, var4, var5);
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "hk.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ad")
   @Override
   public void vmethod485(classXY var1) {
      this.field2829 = classXY.method13039(var1, -346779531) * 217765975;
      this.field2819 = classXY.method13039(var1, -346779531) * -1504494449;
      this.field2818 = classXY.method13047(var1, 582928806) * -564296415;
      this.field2827 = classXY.method13039(var1, -346779531) * 524241497;
      this.field2815 = classXY.method13039(var1, -346779531) * 1346583341;
      this.field2816 = classXY.method13047(var1, 1932326752) * 503789846;
      this.field2817 = classXY.method13039(var1, -346779531) * -641315699;
      this.field2824 = classXY.method13039(var1, -346779531) * 1527260716;
      this.field2820 = classXY.method13047(var1, 1895967744) * -634232723;
      this.field2822 = classXY.method13039(var1, -346779531) * 707177529;
      this.field2828 = classXY.method13039(var1, -346779531) * 1653797282;
      this.field2826 = classXY.method13047(var1, -285689684) * 1289741507;
      this.field2821 = classXY.method13039(var1, -346779531) * -382456250;
      this.field2825 = classXY.method13039(var1, -346779531) * 599077772;
      method6065(this, (byte)-12);
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("al")
   @Override
   public boolean vmethod474(int var1, int var2, int var3) {
      return var1 >= -596789958 * this.field2829 && var1 < this.field2829 * 1414677321 + this.field2819 * -157588510
         ? var2 >= (-331829942 * this.field2818 << 6) + (-1541597087 * this.field2827 << 3)
            && var2 <= 7 + (this.field2818 * -1866449907 << 6) + (this.field2815 * 620843637 << 3)
            && var3 >= (this.field2816 * 114774925 << 6) + (1219384901 * this.field2817 << 3)
            && var3 <= (875411298 * this.field2824 << 3) + (114774925 * this.field2816 << 6) + 7
         : false;
   }

   classHK() {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   void method6066() {
   }

   @ObfuscatedSignature(descriptor = "(II)Lky;")
   @ObfuscatedName("aw")
   @Override
   public classKY vmethod483(int var1, int var2) {
      if (!this.vmethod476(var1, var2, (byte)60)) {
         return null;
      } else {
         int var3 = this.field2818 * 2057585728 - this.field2820 * -701867712 + var1 + (1763993299 * this.field2827 - this.field2822 * 2093011602);
         int var4 = -1244339392 * this.field2816 - 885925993 * this.field2826 + var2 + (1972317464 * this.field2817 - -1247389719 * this.field2821);
         return new classKY(1417542939 * this.field2829, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lva;IIB)Z")
   @ObfuscatedName("ao")
   public static boolean method6068(AbstractArchive var0, int var1, int var2, byte var3) {
      try {
         byte[] var4 = var0.method11867(var1, var2, -1048159122);
         if (null == var4) {
            if (var3 >= 9) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            classYS.method13624(var4, -1108124092);
            return true;
         }
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "hk.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ax")
   void method6067(byte var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "hk.ax(" + ')');
      }
   }
}
