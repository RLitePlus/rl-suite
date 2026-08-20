import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lz")
public class classLZ {
   @ObfuscatedName("ax")
   int[] field4444;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field4447 = 3;
   @ObfuscatedSignature(descriptor = "Llw;")
   @ObfuscatedName("ab")
   Widget field4451;
   @ObfuscatedSignature(descriptor = "Lvp;")
   @ObfuscatedName("ij")
   static classVP field4452;
   @ObfuscatedName("as")
   int[] field4445 = new int[32];
   @ObfuscatedName("ag")
   int field4449;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field4448 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field4450 = 0;
   @ObfuscatedName("ac")
   int field4446;

   @ObfuscatedSignature(descriptor = "(ILlw;II)V")
   @ObfuscatedName("az")
   public void method7399(int var1, Widget var2, int var3, int var4) {
      try {
         this.field4451 = var2;
         this.field4449 = 0;
         this.field4446 = 0;
         if (var1 >= 0) {
            if (var4 != 1453250184) {
               return;
            }

            if (var1 < 3) {
               if (null != var2) {
                  if (var2.field4260 * 63131743 != -1) {
                     throw new RuntimeException("");
                  }

                  if (var4 != 1453250184) {
                     throw new IllegalStateException();
                  }

                  if (var2.field4375 * -1510882375 != 0) {
                     if (var4 != 1453250184) {
                        throw new IllegalStateException();
                     }

                     throw new RuntimeException("");
                  }
               }

               if (var2 != null) {
                  if (var4 != 1453250184) {
                     throw new IllegalStateException();
                  }

                  if (var2.field4340 != null) {
                     if (var1 == 0) {
                        if (var4 != 1453250184) {
                           return;
                        }

                        Widget[] var5 = var2.field4340;

                        for (int var6 = 0; var6 < var5.length; var6++) {
                           Widget var7 = var5[var6];
                           if (null != var7) {
                              if (var4 != 1453250184) {
                                 throw new IllegalStateException();
                              }

                              this.method7403(63131743 * var7.field4260, (byte)29);
                           }
                        }
                     } else {
                        boolean var10000;
                        if (1 != var1) {
                           if (var4 != 1453250184) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                        } else {
                           var10000 = false;
                        }

                        boolean var9 = var10000;
                        if (-1 == var3) {
                           this.method7406(var2, var9, -1397243012);
                        } else if (var3 >= 0 && var3 < var2.field4340.length) {
                           if (var4 != 1453250184) {
                              throw new IllegalStateException();
                           }

                           if (null != var2.field4340[var3]) {
                              if (var4 != 1453250184) {
                                 throw new IllegalStateException();
                              }

                              this.method7406(var2.field4340[var3], var9, -1895341729);
                           }
                        }
                     }

                     return;
                  }

                  if (var4 != 1453250184) {
                     return;
                  }
               }

               return;
            }

            if (var4 != 1453250184) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "lz.az(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llz;)[I")
   @ObfuscatedName("od")
   public static int[] method7421(classLZ var0) {
      return Arrays.copyOf(var0.field4445, -1725791933 * var0.field4449);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   public int method7420(int var1) {
      try {
         if (this.field4446 * -1791640697 >= this.field4449 * -1725791933) {
            if (var1 >= -414689364) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return this.field4445[(this.field4446 += 1687099959) * -1791640697 - 1];
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "lz.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;ZI)V")
   @ObfuscatedName("ae")
   final void method7406(Widget var1, boolean var2, int var3) {
      try {
         int var10000;
         if (var1 == this.field4451) {
            if (var3 >= -179907272) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = var1.field4265 * -1210177335;
         }

         int var4 = var10000;
         int var5 = this.field4451 == var1 ? var1.field4340.length - 1 : var1.field4266 * 379541057;

         for (int var6 = var4; var6 <= var5; var6++) {
            if (var3 >= -179907272) {
               return;
            }

            Widget var7 = this.field4451.field4340[var6];
            if (null != var7) {
               if (var3 >= -179907272) {
                  throw new IllegalStateException();
               }

               if (var7.field4263 * 653784551 == var1.field4260 * 63131743) {
                  if (var3 >= -179907272) {
                     throw new IllegalStateException();
                  }

                  this.method7403(var7.field4260 * 63131743, (byte)41);
                  if (var2) {
                     if (var3 >= -179907272) {
                        throw new IllegalStateException();
                     }

                     if (var7.field4265 * -1210177335 <= 379541057 * var7.field4266) {
                        if (var3 >= -179907272) {
                           throw new IllegalStateException();
                        }

                        this.method7406(var7, true, -1870760730);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw classEG.newRunException(var8, "lz.ae(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llz;Llw;Z)V")
   @ObfuscatedName("ou")
   public static void method7407(classLZ var0, Widget var1, boolean var2) {
      int var3 = var1 == var0.field4451 ? 0 : var1.field4265 * -1210177335;
      int var4 = var0.field4451 == var1 ? var1.field4340.length - 1 : var1.field4266 * 1871894748;

      for (int var5 = var3; var5 <= var4; var5++) {
         Widget var6 = var0.field4451.field4340[var5];
         if (null != var6 && var6.field4263 * 653784551 == var1.field4260 * 63131743) {
            var0.method7403(var6.field4260 * 63131743, (byte)45);
            if (var2 && var6.field4265 * -1210177335 <= 379541057 * var6.field4266) {
               var0.method7406(var6, true, -1206036438);
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxy;[III)V")
   @ObfuscatedName("sh")
   public static void method7426(Buffer var0, int[] var1, int var2, int var3) {
      int var4 = var0.offset * 702114061;
      var0.offset = var2 * -1095856699;
      int var5 = (var3 - var2) / 8;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = var0.method13056((byte)1);
         int var8 = var0.method13056((byte)1);
         int var9 = -957401312;
         int var10 = -1640531527;
         int var11 = 32;

         while (var11-- > 0) {
            var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var9 + var1[var9 >>> 11 & 3];
            var9 -= var10;
            var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
         }

         var0.offset -= -176919000;
         var0.method12979(var7, 2109995366);
         var0.method12979(var8, 1438356079);
      }

      var0.offset = var4 * -1095856699;
   }

   @ObfuscatedSignature(descriptor = "(I)Llw;")
   @ObfuscatedName("ag")
   public Widget method7415(int var1) {
      try {
         int var2 = this.method7420(-800637093);
         Widget var10000;
         if (var2 >= 0) {
            if (var1 != -1992217275) {
               throw new IllegalStateException();
            }

            var10000 = this.field4451.field4340[var2];
         } else {
            var10000 = null;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "lz.ag(" + ')');
      }
   }

   public classLZ() {
      this.field4444 = new int[32];
      this.field4446 = 0;
   }

   @ObfuscatedSignature(descriptor = "(ILlw;I)V")
   @ObfuscatedName("ao")
   public void method7400(int var1, Widget var2, int var3) {
      this.field4451 = var2;
      this.field4449 = 0;
      this.field4446 = 0;
      if (var1 >= 0 && var1 < 3) {
         if (null == var2 || var2.field4260 * 63131743 == -1 && var2.field4375 * -1510882375 == 0) {
            if (var2 != null && var2.field4340 != null) {
               if (var1 == 0) {
                  Widget[] var4 = var2.field4340;

                  for (int var5 = 0; var5 < var4.length; var5++) {
                     Widget var6 = var4[var5];
                     if (null != var6) {
                        this.method7403(63131743 * var6.field4260, (byte)88);
                     }
                  }
               } else {
                  boolean var7 = 1 != var1;
                  if (-1 == var3) {
                     this.method7406(var2, var7, -1296840327);
                  } else if (var3 >= 0 && var3 < var2.field4340.length && null != var2.field4340[var3]) {
                     this.method7406(var2.field4340[var3], var7, -2090951979);
                  }
               }
            }
         } else {
            throw new RuntimeException("");
         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(ILlw;I)V")
   @ObfuscatedName("aa")
   public void method7401(int var1, Widget var2, int var3) {
      this.field4451 = var2;
      this.field4449 = 0;
      this.field4446 = 0;
      if (var1 >= 0 && var1 < 3) {
         if (null == var2 || var2.field4260 * 63131743 == -1 && var2.field4375 * -1510882375 == 0) {
            if (var2 != null && var2.field4340 != null) {
               if (var1 == 0) {
                  Widget[] var4 = var2.field4340;

                  for (int var5 = 0; var5 < var4.length; var5++) {
                     Widget var6 = var4[var5];
                     if (null != var6) {
                        this.method7403(344174041 * var6.field4260, (byte)91);
                     }
                  }
               } else {
                  boolean var7 = 1 != var1;
                  if (-1 == var3) {
                     this.method7406(var2, var7, -1272060004);
                  } else if (var3 >= 0 && var3 < var2.field4340.length && null != var2.field4340[var3]) {
                     this.method7406(var2.field4340[var3], var7, -707375077);
                  }
               }
            }
         } else {
            throw new RuntimeException("");
         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedSignature(descriptor = "(ILjava/lang/Object;Ljava/lang/Object;B)V")
   @ObfuscatedName("ac")
   public void method7424(int var1, Object var2, Object var3, byte var4) {
      try {
         int[] var5 = this.field4445;
         int var6 = -1725791933 * this.field4449;
         this.field4445 = this.field4444;
         this.field4449 = 0;
         this.field4444 = var5;

         for (int var7 = 0; var7 < var6; var7++) {
            Widget var8 = this.field4451.field4340[var5[var7]];
            if (null != var8) {
               if (var4 >= 71) {
                  throw new IllegalStateException();
               }

               Object var9 = var8.method7220(var1, var3, 1993641127);
               if (var9 != var2) {
                  if (var4 >= 71) {
                     throw new IllegalStateException();
                  }

                  if (var9 == null) {
                     continue;
                  }

                  if (var4 >= 71) {
                     throw new IllegalStateException();
                  }

                  if (!var9.equals(var2)) {
                     continue;
                  }

                  if (var4 >= 71) {
                     throw new IllegalStateException();
                  }
               }

               this.method7403(var5[var7], (byte)36);
            }
         }
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "lz.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llz;I)V")
   @ObfuscatedName("uo")
   public static void method7402(classLZ var0, int var1) {
      if (var0.field4449 * -1725791933 == var0.field4445.length) {
         var0.field4445 = Arrays.copyOf(var0.field4445, var0.field4445.length * 2);
      }

      var0.field4445[(var0.field4449 += 391385963) * -1725791933 - 1] = var1;
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("af")
   final void method7403(int var1, byte var2) {
      try {
         if (this.field4449 * -1725791933 == this.field4445.length) {
            if (var2 <= 20) {
               throw new IllegalStateException();
            }

            this.field4445 = Arrays.copyOf(this.field4445, this.field4445.length * 2);
         }

         this.field4445[(this.field4449 += 391385963) * -1725791933 - 1] = var1;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "lz.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Z)V")
   @ObfuscatedName("ad")
   final void method7408(Widget var1, boolean var2) {
      int var3 = var1 == this.field4451 ? 0 : var1.field4265 * -1210177335;
      int var4 = this.field4451 == var1 ? var1.field4340.length - 1 : var1.field4266 * 379541057;

      for (int var5 = var3; var5 <= var4; var5++) {
         Widget var6 = this.field4451.field4340[var5];
         if (null != var6 && var6.field4263 * 653784551 == var1.field4260 * 63131743) {
            this.method7403(var6.field4260 * 63131743, (byte)93);
            if (var2 && var6.field4265 * -1210177335 <= 379541057 * var6.field4266) {
               this.method7406(var6, true, -1174421858);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;Z)V")
   @ObfuscatedName("ap")
   final void method7409(Widget var1, boolean var2) {
      int var3 = var1 == this.field4451 ? 0 : var1.field4265 * -1210177335;
      int var4 = this.field4451 == var1 ? var1.field4340.length - 1 : var1.field4266 * -1821963048;

      for (int var5 = var3; var5 <= var4; var5++) {
         Widget var6 = this.field4451.field4340[var5];
         if (null != var6 && var6.field4263 * -494335492 == var1.field4260 * -1524269907) {
            this.method7403(var6.field4260 * -767283484, (byte)55);
            if (var2 && var6.field4265 * -1210177335 <= 379541057 * var6.field4266) {
               this.method7406(var6, true, -1625789106);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;")
   @ObfuscatedName("gx")
   static String method7427(String var0, boolean var1, int var2) {
      try {
         String var10000;
         if (var1) {
            if (var2 >= 1899288588) {
               throw new IllegalStateException();
            }

            var10000 = "https://";
         } else {
            var10000 = "http://";
         }

         String var3 = var10000;
         if (client.field940 * 2064080735 == 1) {
            var0 = var0 + "-wtrc";
         } else if (2 == client.field940 * 2064080735) {
            if (var2 >= 1899288588) {
               throw new IllegalStateException();
            }

            var0 = var0 + "-wtqa";
         } else if (3 == client.field940 * 2064080735) {
            var0 = var0 + "-wtwip";
         } else if (5 == client.field940 * 2064080735) {
            if (var2 >= 1899288588) {
               throw new IllegalStateException();
            }

            var0 = var0 + "-wti";
         } else if (client.field940 * 2064080735 == 4) {
            if (var2 >= 1899288588) {
               throw new IllegalStateException();
            }

            var0 = "local";
         }

         String var4 = "";
         if (classQW.field5622 != null) {
            if (var2 >= 1899288588) {
               throw new IllegalStateException();
            }

            var4 = "/p=" + classQW.field5622;
         }

         String var5 = "runescape.com";
         return var3 + var0 + "." + var5 + "/l=" + classLU.field4232 + "/a=" + Projectile.field570 * 606350751 + var4 + "/";
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "lz.gx(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ai")
   public int method7410() {
      return this.field4449 * -1725791933;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   public int method7411() {
      return this.field4449 * -1725791933;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llz;I)V")
   @ObfuscatedName("um")
   public static void method7404(classLZ var0, int var1) {
      if (var0.field4449 * 747387314 == var0.field4445.length) {
         var0.field4445 = Arrays.copyOf(var0.field4445, var0.field4445.length * 2);
      }

      var0.field4445[(var0.field4449 += 391385963) * -1725791933 - 1] = var1;
   }

   @ObfuscatedSignature(descriptor = "(Llz;I)I")
   @ObfuscatedName("jk")
   public static int method7412(classLZ var0, int var1) {
      if (var0 == null) {
         var0.method7414(var1);
      }

      try {
         return var0.field4449 * -1725791933;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "lz.ab(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Llw;")
   @ObfuscatedName("av")
   public Widget method7416() {
      int var1 = this.method7420(-865800882);
      return var1 >= 0 ? this.field4451.field4340[var1] : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llz;)I")
   @ObfuscatedName("hl")
   public static int method7413(classLZ var0) {
      return var0.field4449 * -1725791933;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llz;)Llw;")
   @ObfuscatedName("si")
   public static Widget method7417(classLZ var0) {
      if (var0 == null) {
         var0.method7422();
      }

      int var1 = var0.method7420(-2088605868);
      return var1 >= 0 ? var0.field4451.field4340[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "()Llw;")
   @ObfuscatedName("at")
   public Widget method7418() {
      int var1 = this.method7420(-1566879046);
      return var1 >= 0 ? this.field4451.field4340[var1] : null;
   }

   @ObfuscatedSignature(descriptor = "()Llw;")
   @ObfuscatedName("an")
   public Widget method7419() {
      int var1 = this.method7420(-1714516639);
      return var1 >= 0 ? this.field4451.field4340[var1] : null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llz;ILjava/lang/Object;Ljava/lang/Object;)V")
   @ObfuscatedName("gd")
   public static void method7425(classLZ var0, int var1, Object var2, Object var3) {
      int[] var4 = var0.field4445;
      int var5 = -1725791933 * var0.field4449;
      var0.field4445 = var0.field4444;
      var0.field4449 = 0;
      var0.field4444 = var4;

      for (int var6 = 0; var6 < var5; var6++) {
         Widget var7 = var0.field4451.field4340[var4[var6]];
         if (null != var7) {
            Object var8 = var7.method7220(var1, var3, 1469006910);
            if (var8 == var2 || var8 != null && var8.equals(var2)) {
               var0.method7403(var4[var6], (byte)55);
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()[I")
   @ObfuscatedName("am")
   public int[] method7422() {
      return Arrays.copyOf(this.field4445, 1342430018 * this.field4449);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llz;I)V")
   @ObfuscatedName("kj")
   public static void method7405(classLZ var0, int var1) {
      if (var0 == null) {
         var0.method7418();
      }

      if (var0.field4449 * -1725791933 == var0.field4445.length) {
         var0.field4445 = Arrays.copyOf(var0.field4445, var0.field4445.length * 2);
      }

      var0.field4445[(var0.field4449 += 391385963) * -1725791933 - 1] = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("ax")
   public int[] method7423(int var1) {
      try {
         return Arrays.copyOf(this.field4445, -1725791933 * this.field4449);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "lz.ax(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ab")
   public int method7414(int var1) {
      try {
         return this.field4446 * -1725791933;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "lz.ab(" + 41);
      }
   }
}
