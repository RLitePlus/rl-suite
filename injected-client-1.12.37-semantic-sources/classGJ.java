import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gj")
public class classGJ implements classHM {
   @ObfuscatedName("ab")
   int field2596;
   @ObfuscatedName("af")
   int field2599;
   @ObfuscatedName("aa")
   int field2595;
   @ObfuscatedName("ac")
   int field2597;
   @ObfuscatedName("ag")
   int field2600;
   @ObfuscatedName("az")
   int field2606;
   @ObfuscatedName("ax")
   int field2605;
   @ObfuscatedName("ae")
   int field2598;
   @ObfuscatedName("ao")
   int field2602;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field2603 = 14;
   @ObfuscatedName("as")
   int field2604;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   static final int field2601 = 1;

   @ObfuscatedSignature(descriptor = "(Lva;I)V")
   @ObfuscatedName("az")
   public static void method5465(AbstractArchive var0, int var1) {
      try {
         classPN.field5362 = var0;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gj.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhg;I)V")
   @ObfuscatedName("az")
   @Override
   public void vmethod469(classHG var1, int var2) {
      try {
         if (-1293823145 * var1.field2789 > this.field2605 * 1715061181) {
            if (var2 <= -419997227) {
               return;
            }

            var1.field2789 = -1225745653 * this.field2605;
         }

         if (1597382741 * var1.field2792 < this.field2595 * -879293243) {
            var1.field2792 = 271182513 * this.field2595;
         }

         if (var1.field2790 * 1546846349 > this.field2597 * 1749585137) {
            if (var2 <= -419997227) {
               throw new IllegalStateException();
            }

            var1.field2790 = this.field2597 * -2111136011;
         }

         if (252768043 * var1.field2791 < this.field2602 * -575393479) {
            if (var2 <= -419997227) {
               return;
            }

            var1.field2791 = -2025222357 * this.field2602;
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "gj.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)Z")
   @ObfuscatedName("af")
   @Override
   public boolean vmethod472(int var1, int var2, int var3, int var4) {
      try {
         if (var1 >= this.field2606 * -977032489) {
            if (var4 >= -651641119) {
               throw new IllegalStateException();
            }

            if (var1 < -977032489 * this.field2606 + this.field2599 * -1520162709) {
               if (var2 >> 6 >= this.field2598 * 2033424185) {
                  if (var4 >= -651641119) {
                     throw new IllegalStateException();
                  }

                  if (var2 >> 6 <= this.field2600 * 6816621) {
                     if (var4 >= -651641119) {
                        throw new IllegalStateException();
                     }

                     if (var3 >> 6 >= this.field2596 * -2099985487) {
                        if (var4 >= -651641119) {
                           throw new IllegalStateException();
                        }

                        if (var3 >> 6 <= -969820241 * this.field2604) {
                           if (var4 >= -651641119) {
                              throw new IllegalStateException();
                           }

                           return true;
                        }
                     }
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
         throw classEG.method3884(var5, "gj.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("ay")
   @Override
   public boolean vmethod477(int var1, int var2) {
      return var1 >> 6 >= 1715061181 * this.field2605
         && var1 >> 6 <= -879293243 * this.field2595
         && var2 >> 6 >= 1749585137 * this.field2597
         && var2 >> 6 <= -575393479 * this.field2602;
   }

   @ObfuscatedSignature(descriptor = "(IIIB)[I")
   @ObfuscatedName("ab")
   @Override
   public int[] vmethod478(int var1, int var2, int var3, byte var4) {
      try {
         if (!this.vmethod472(var1, var2, var3, -1584093993)) {
            if (var4 <= 2) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return new int[]{
               var2 + (-1905234112 * this.field2605 - this.field2598 * 1290128960), var3 + (this.field2597 * 304299072 - -1255084992 * this.field2596)
            };
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "gj.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lky;")
   @ObfuscatedName("ak")
   @Override
   public classKY vmethod481(int var1, int var2) {
      if (!this.vmethod476(var1, var2, (byte)60)) {
         return null;
      } else {
         int var3 = this.field2598 * -1993836909 - 1612151602 * this.field2605 + var1;
         int var4 = this.field2596 * 361854417 - this.field2597 * 304299072 + var2;
         return new classKY(this.field2606 * -1144576483, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("as")
   @Override
   public void vmethod484(classXY var1, int var2) {
      try {
         this.field2606 = classXY.method13039(var1, -346779531) * 764602599;
         this.field2599 = classXY.method13039(var1, -346779531) * -882424765;
         this.field2598 = classXY.method13047(var1, 513730862) * -1269422327;
         this.field2596 = classXY.method13047(var1, -826755470) * 94217553;
         this.field2600 = classXY.method13047(var1, 1882809038) * 654540389;
         this.field2604 = classXY.method13047(var1, 856188930) * 899678031;
         this.field2605 = classXY.method13047(var1, 1974015843) * -68517483;
         this.field2597 = classXY.method13047(var1, 1407337964) * 1881728017;
         this.field2595 = classXY.method13047(var1, 1090107343) * -1935896051;
         this.field2602 = classXY.method13047(var1, 1463824616) * 1784507657;
         this.method5469((byte)68);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "gj.as(" + ')');
      }
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
            int var4 = this.field2598 * 1290128960 - -1905234112 * this.field2605 + var1;
            int var5 = this.field2596 * -1255084992 - this.field2597 * 304299072 + var2;
            return new classKY(this.field2606 * -977032489, var4, var5);
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "gj.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhg;)V")
   @ObfuscatedName("ac")
   @Override
   public void vmethod470(classHG var1) {
      if (-1293823145 * var1.field2789 > this.field2605 * -377161875) {
         var1.field2789 = -1225745653 * this.field2605;
      }

      if (-1287440008 * var1.field2792 < this.field2595 * -879293243) {
         var1.field2792 = 555120282 * this.field2595;
      }

      if (var1.field2790 * 1546846349 > this.field2597 * -1863949235) {
         var1.field2790 = this.field2597 * -2111136011;
      }

      if (-1849420742 * var1.field2791 < this.field2602 * -575393479) {
         var1.field2791 = -2025222357 * this.field2602;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lhg;)V")
   @ObfuscatedName("aa")
   @Override
   public void vmethod471(classHG var1) {
      if (1630948501 * var1.field2789 > this.field2605 * 1715061181) {
         var1.field2789 = -1225745653 * this.field2605;
      }

      if (-553376867 * var1.field2792 < this.field2595 * -879293243) {
         var1.field2792 = 271182513 * this.field2595;
      }

      if (var1.field2790 * -852014902 > this.field2597 * 1749585137) {
         var1.field2790 = this.field2597 * -2111136011;
      }

      if (252768043 * var1.field2791 < this.field2602 * 281154320) {
         var1.field2791 = -2025222357 * this.field2602;
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("al")
   @Override
   public boolean vmethod474(int var1, int var2, int var3) {
      return var1 >= this.field2606 * -977032489 && var1 < -977032489 * this.field2606 + this.field2599 * -1520162709
         ? var2 >> 6 >= this.field2598 * -128663862
            && var2 >> 6 <= this.field2600 * 6816621
            && var3 >> 6 >= this.field2596 * -984447491
            && var3 >> 6 <= -969820241 * this.field2604
         : false;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvw;)I")
   @ObfuscatedName("wz")
   public static int method5470(classVW var0) {
      if (var0 == null) {
         var0.method12204();
      }

      return var0.field6632 * 1850358451;
   }

   @ObfuscatedSignature(descriptor = "(III)Z")
   @ObfuscatedName("ao")
   @Override
   public boolean vmethod473(int var1, int var2, int var3) {
      return var1 >= this.field2606 * -222267470 && var1 < 1686407213 * this.field2606 + this.field2599 * -1520162709
         ? var2 >> 6 >= this.field2598 * -300896342
            && var2 >> 6 <= this.field2600 * 6816621
            && var3 >> 6 >= this.field2596 * 1193723299
            && var3 >> 6 <= -969820241 * this.field2604
         : false;
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ad")
   @Override
   public void vmethod485(classXY var1) {
      this.field2606 = classXY.method13039(var1, -346779531) * 764602599;
      this.field2599 = classXY.method13039(var1, -346779531) * -882424765;
      this.field2598 = classXY.method13047(var1, 1086922347) * -1269422327;
      this.field2596 = classXY.method13047(var1, -258846604) * -893933113;
      this.field2600 = classXY.method13047(var1, -1897665918) * 654540389;
      this.field2604 = classXY.method13047(var1, -55539999) * 899678031;
      this.field2605 = classXY.method13047(var1, 1292108813) * -743576161;
      this.field2597 = classXY.method13047(var1, 96242450) * -2081182426;
      this.field2595 = classXY.method13047(var1, 350670022) * 1876259037;
      this.field2602 = classXY.method13047(var1, 1408015074) * -1094717737;
      this.method5469((byte)125);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ai")
   void method5466() {
   }

   @ObfuscatedSignature(descriptor = "(III)[I")
   @ObfuscatedName("aq")
   @Override
   public int[] vmethod479(int var1, int var2, int var3) {
      return !this.vmethod472(var1, var2, var3, -2003259957)
         ? null
         : new int[]{var2 + (-1905234112 * this.field2605 - this.field2598 * 1290128960), var3 + (this.field2597 * 304299072 - -1255084992 * this.field2596)};
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("au")
   void method5467() {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   void method5468() {
   }

   @ObfuscatedSignature(descriptor = "(IIB)Z")
   @ObfuscatedName("ae")
   @Override
   public boolean vmethod476(int var1, int var2, byte var3) {
      try {
         if (var1 >> 6 >= 1715061181 * this.field2605) {
            if (var3 != 60) {
               throw new IllegalStateException();
            }

            if (var1 >> 6 <= -879293243 * this.field2595) {
               if (var3 != 60) {
                  throw new IllegalStateException();
               }

               if (var2 >> 6 >= 1749585137 * this.field2597 && var2 >> 6 <= -575393479 * this.field2602) {
                  if (var3 != 60) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "gj.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("aj")
   @Override
   public boolean vmethod475(int var1, int var2) {
      return var1 >> 6 >= 1715061181 * this.field2605
         && var1 >> 6 <= -879293243 * this.field2595
         && var2 >> 6 >= 1749585137 * this.field2597
         && var2 >> 6 <= -575393479 * this.field2602;
   }

   @ObfuscatedSignature(descriptor = "(II)Lky;")
   @ObfuscatedName("ar")
   @Override
   public classKY vmethod482(int var1, int var2) {
      if (!this.vmethod476(var1, var2, (byte)60)) {
         return null;
      } else {
         int var3 = this.field2598 * 1290128960 - -1905234112 * this.field2605 + var1;
         int var4 = this.field2596 * -1255084992 - this.field2597 * 304299072 + var2;
         return new classKY(this.field2606 * -977032489, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lky;")
   @ObfuscatedName("aw")
   @Override
   public classKY vmethod483(int var1, int var2) {
      if (!this.vmethod476(var1, var2, (byte)60)) {
         return null;
      } else {
         int var3 = this.field2598 * 1290128960 - -1905234112 * this.field2605 + var1;
         int var4 = this.field2596 * -1255084992 - this.field2597 * 304299072 + var2;
         return new classKY(this.field2606 * -977032489, var3, var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("ax")
   void method5469(byte var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "gj.ax(" + ')');
      }
   }

   classGJ() {
   }
}
