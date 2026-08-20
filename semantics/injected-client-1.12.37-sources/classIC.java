import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ic")
public class classIC extends classHB {
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   static final int field2939 = -117;
   @ObfuscatedName("az")
   int field2936;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field2938 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ev")
   static final int field2940 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field2937 = 2;
   @ObfuscatedName("ak")
   static int[] field2941;

   @ObfuscatedSignature(descriptor = "(JJLzl;B)D")
   @ObfuscatedName("as")
   public static double method6141(long var0, long var2, classZL var4, byte var5) {
      try {
         double var10000;
         if (var2 > 0L) {
            if (var5 != 64) {
               throw new IllegalStateException();
            }

            var10000 = classBF.method998(0.0F, 1.0F, (float)var0 / (float)var2, -187251410);
         } else {
            var10000 = 1.0;
         }

         double var6 = var10000;
         if (!(var6 <= 0.0)) {
            if (var5 != 64) {
               throw new IllegalStateException();
            }

            if (!(var6 >= 1.0)) {
               switch (var4.field7224 * 328542679) {
                  case 0:
                  default:
                     return var6;
                  case 1:
                     return 1.0 - Math.cos(var6 * Math.PI / 2.0);
                  case 2:
                     return Math.sin(var6 * Math.PI / 2.0);
                  case 3:
                     return -(Math.cos(Math.PI * var6) - 1.0) / 2.0;
                  case 4:
                     return var6 * var6;
                  case 5:
                     return 1.0 - (1.0 - var6) * (1.0 - var6);
                  case 6:
                     if (var6 < 0.5) {
                        if (var5 != 64) {
                           throw new IllegalStateException();
                        }

                        var10000 = 2.0 * var6 * var6;
                     } else {
                        var10000 = 1.0 - Math.pow(2.0 + -2.0 * var6, 2.0) / 2.0;
                     }

                     return var10000;
                  case 7:
                     return var6 * (var6 * var6);
                  case 8:
                     return 1.0 - Math.pow(1.0 - var6, 3.0);
                  case 9:
                     return var6 < 0.5 ? var6 * (4.0 * var6) * var6 : 1.0 - Math.pow(2.0 + -2.0 * var6, 3.0) / 2.0;
                  case 10:
                     return var6 * (var6 * var6 * var6);
                  case 11:
                     return 1.0 - Math.pow(1.0 - var6, 4.0);
                  case 12:
                     if (var6 < 0.5) {
                        if (var5 != 64) {
                           throw new IllegalStateException();
                        }

                        var10000 = var6 * 8.0 * var6 * var6 * var6;
                     } else {
                        var10000 = 1.0 - Math.pow(-2.0 * var6 + 2.0, 4.0) / 2.0;
                     }

                     return var10000;
                  case 13:
                     return var6 * (var6 * var6 * var6 * var6);
                  case 14:
                     return 1.0 - Math.pow(1.0 - var6, 5.0);
                  case 15:
                     if (var6 < 0.5) {
                        if (var5 != 64) {
                           throw new IllegalStateException();
                        }

                        var10000 = var6 * (var6 * (var6 * (8.0 * var6))) * var6;
                     } else {
                        var10000 = 1.0 - Math.pow(2.0 + -2.0 * var6, 5.0) / 2.0;
                     }

                     return var10000;
                  case 16:
                     return Math.pow(2.0, 10.0 * var6 - 10.0);
                  case 17:
                     return 1.0 - Math.pow(2.0, var6 * -10.0);
                  case 18:
                     if (var6 < 0.5) {
                        if (var5 != 64) {
                           throw new IllegalStateException();
                        }

                        var10000 = Math.pow(2.0, 10.0 + var6 * 20.0) / 2.0;
                     } else {
                        var10000 = (2.0 - Math.pow(2.0, var6 * -20.0 + 10.0)) / 2.0;
                     }

                     return var10000;
                  case 19:
                     return 1.0 - Math.sqrt(1.0 - Math.pow(var6, 2.0));
                  case 20:
                     return Math.sqrt(1.0 - Math.pow(var6 - 1.0, 2.0));
                  case 21:
                     return var6 < 0.5
                        ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * var6, 2.0))) / 2.0
                        : (Math.sqrt(1.0 - Math.pow(2.0 + var6 * -2.0, 2.0)) + 1.0) / 2.0;
                  case 22:
                     double var17 = 1.70158;
                     double var20 = 2.70158;
                     return var6 * 2.70158 * var6 * var6 - 1.70158 * var6 * var6;
                  case 23:
                     double var16 = 1.70158;
                     double var19 = 2.70158;
                     return 1.0 + 2.70158 * Math.pow(var6 - 1.0, 3.0) + 1.70158 * Math.pow(var6 - 1.0, 2.0);
                  case 24:
                     double var15 = 1.70158;
                     double var18 = 2.5949095;
                     if (var6 < 0.5) {
                        if (var5 != 64) {
                           throw new IllegalStateException();
                        }

                        var10000 = Math.pow(2.0 * var6, 2.0) * (7.189819 * var6 - 2.5949095) / 2.0;
                     } else {
                        var10000 = (Math.pow(var6 * 2.0 - 2.0, 2.0) * (2.5949095 + (var6 * 2.0 - 2.0) * 3.5949095) + 2.0) / 2.0;
                     }

                     return var10000;
                  case 25:
                     double var14 = Math.PI * 2.0 / 3.0;
                     return -Math.pow(2.0, 10.0 * var6 - 10.0) * Math.sin((var6 * 10.0 - 10.75) * (Math.PI * 2.0 / 3.0));
                  case 26:
                     double var13 = Math.PI * 2.0 / 3.0;
                     return Math.pow(2.0, var6 * -10.0) * Math.sin((Math.PI * 2.0 / 3.0) * (var6 * 10.0 - 0.75)) + 1.0;
                  case 27:
                     double var8 = Math.PI * 4.0 / 9.0;
                     double var10 = Math.sin((var6 * 20.0 - 11.125) * (Math.PI * 4.0 / 9.0));
                     if (var6 < 0.5) {
                        if (var5 != 64) {
                           throw new IllegalStateException();
                        }

                        var10000 = -(Math.pow(2.0, 20.0 * var6 - 10.0) * var10) / 2.0;
                     } else {
                        var10000 = Math.pow(2.0, var6 * -20.0 + 10.0) * var10 / 2.0 + 1.0;
                     }

                     return var10000;
               }
            }

            if (var5 != 64) {
               throw new IllegalStateException();
            }
         }

         return var6 <= 0.0 ? 0.0 : 1.0;
      } catch (RuntimeException var12) {
         throw classEG.newRunException(var12, "ic.as(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   @Override
   void vmethod498(Buffer var1, int var2) {
      try {
         this.field2936 = Buffer.method13047(var1, -1728546026) * -96232793;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ic.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Liq;B)V")
   @ObfuscatedName("af")
   @Override
   void vmethod499(ClanSettings var1, byte var2) {
      try {
         var1.method6268(this.field2936 * 1389128983, 1379062372);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ic.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod500(Buffer var1) {
      this.field2936 = Buffer.method13047(var1, -1545239879) * -96232793;
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ax")
   @Override
   void vmethod504(ClanSettings var1) {
      var1.method6268(this.field2936 * -1266376167, 2087702845);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod502(ClanSettings var1) {
      var1.method6268(this.field2936 * 1279107380, 114436573);
   }

   @ObfuscatedSignature(descriptor = "(Liq;)V")
   @ObfuscatedName("as")
   @Override
   void vmethod503(ClanSettings var1) {
      var1.method6268(this.field2936 * 413704063, 164264691);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)V")
   @ObfuscatedName("ab")
   @Override
   void vmethod501(Buffer var1) {
      this.field2936 = Buffer.method13047(var1, 184274539) * -96232793;
   }

   @ObfuscatedSignature(descriptor = "(Llw;B)I")
   @ObfuscatedName("an")
   static int method6142(Widget var0, byte var1) {
      try {
         if (11 != var0.field4375 * -1510882375) {
            if (var1 == 2) {
               throw new IllegalStateException();
            } else {
               classBB.field328[classBB.field338 * 1375698635 - 1] = "";
               return 1;
            }
         } else {
            String var2 = (String)classBB.field328[(classBB.field338 -= 1222866659) * 1375698635];
            classBB.field328[(classBB.field338 += 1222866659) * 1375698635 - 1] = Widget.method7253(var0, var2, 589739084);
            return 1;
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "ic.an(" + 41);
      }
   }

   classIC(classIF var1) {
      this.this$0 = var1;
      this.field2936 = 96232793;
   }
}
