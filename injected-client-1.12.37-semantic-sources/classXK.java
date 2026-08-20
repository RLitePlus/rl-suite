import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xk")
public class classXK {
   @ObfuscatedName("ae")
   final int[][][] field6885;
   @ObfuscatedName("af")
   int[] field6887;
   @ObfuscatedName("az")
   boolean field6884 = false;
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   static final int field6886 = 38;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxk;Lxs;III)V")
   @ObfuscatedName("lr")
   public static void method12829(classXK var0, PacketBuffer var1, int var2, int var3, int var4) {
      if (var0 == null) {
         var0.method12827(var1, var2);
      } else {
         var0.field6884 = true;
         int var5 = classXY.method13047(var1, -1772956017);
         PacketBuffer.method12921(var1, (byte)88);

         for (int var6 = 0; var6 < var2; var6++) {
            for (int var7 = 0; var7 < var3; var7++) {
               for (int var8 = 0; var8 < var4; var8++) {
                  int var9 = PacketBuffer.method12923(var1, 1, 1958226558);
                  if (1 == var9) {
                     var0.field6885[var6][var7][var8] = PacketBuffer.method12923(var1, 26, 1859449697);
                  } else {
                     var0.field6885[var6][var7][var8] = -1;
                  }
               }
            }
         }

         PacketBuffer.method12926(var1, -2124279271);
         var0.field6887 = new int[var5];
         Arrays.fill(var0.field6887, -1);
         var5 = 0;

         for (int var17 = 0; var17 < var2; var17++) {
            for (int var18 = 0; var18 < var3; var18++) {
               for (int var19 = 0; var19 < var4; var19++) {
                  int var20 = var0.field6885[var17][var18][var19];
                  if (-1 != var20) {
                     int var10 = classHA.method5955(var20, -2088305504);
                     int var11 = classKT.method6562(var20, -2067324039);
                     int var12 = classKY.method6602(var10, (byte)65);
                     int var13 = classKY.method6602(var11, (byte)-64);
                     int var14 = classMH.method7570(var12, var13, (byte)59);

                     for (int var15 = 0; var15 < var5; var15++) {
                        if (var0.field6887[var15] == var14) {
                           var14 = -1;
                           break;
                        }
                     }

                     if (var14 != -1) {
                        var0.field6887[var5] = var14;
                        var5++;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxk;Lxs;I)V")
   @ObfuscatedName("kz")
   public static void method12824(classXK var0, PacketBuffer var1, int var2) {
      if (var0 == null) {
         var0.method12827(var1, var2);
      } else {
         try {
            var0.method12830(var1, 4, 13, 13, -1906825040);
         } catch (RuntimeException var3) {
            throw classEG.method3884(var3, "xk.aa(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(III)I")
   @ObfuscatedName("br")
   public int method12816(int var1, int var2, int var3) {
      return this.field6885[var1][var2][var3];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aj")
   public static int method12797(int var0, int var1) {
      return (var0 << 8) + var1;
   }

   public classXK() {
      this.field6885 = new int[4][13][13];
   }

   @ObfuscatedSignature(descriptor = "(IIII)I")
   @ObfuscatedName("ax")
   public int method12817(int var1, int var2, int var3, int var4) {
      try {
         return this.field6885[var1][var2][var3];
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "xk.ax(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpn;)Z")
   @ObfuscatedName("fx")
   public static boolean method12834(classPN var0) {
      return var0 == null ? var0.method9029() : FriendsList.method10130(var0.field5353 * 1468976603, -68556490) == classYY.field7115;
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("ac")
   public void method12818(int var1, int var2, int var3) {
      try {
         this.field6884 = false;
         int var4 = classKY.method6602(var1 - 6, (byte)9);
         int var5 = classKY.method6602(6 + var1, (byte)-93);
         int var6 = classKY.method6602(var2 - 6, (byte)-19);
         int var7 = classKY.method6602(var2 + 6, (byte)-5);
         int var8 = (var5 - var4 + 1) * (var7 - var6 + 1);
         this.field6887 = new int[var8];
         int var9 = 0;

         for (int var10 = var4; var10 <= var5; var10++) {
            if (var3 == 762685179) {
               return;
            }

            for (int var11 = var6; var11 <= var7; var11++) {
               this.field6887[var9] = classMH.method7570(var10, var11, (byte)17);
               var9++;
            }
         }
      } catch (RuntimeException var12) {
         throw classEG.method3884(var12, "xk.ac(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;IIB)V")
   @ObfuscatedName("ao")
   public void method12828(PacketBuffer var1, int var2, int var3, byte var4) {
      try {
         this.method12830(var1, 4, var2, var3, 635592237);
      } catch (RuntimeException var5) {
         throw classEG.method3884(var5, "xk.ao(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxk;II)V")
   @ObfuscatedName("qp")
   public static void method12819(classXK var0, int var1, int var2) {
      if (var0 == null) {
         var0.method12811();
      }

      var0.field6884 = false;
      int var3 = classKY.method6602(var1 - 6, (byte)-52);
      int var4 = classKY.method6602(6 + var1, (byte)-21);
      int var5 = classKY.method6602(var2 - 6, (byte)27);
      int var6 = classKY.method6602(var2 + 6, (byte)-87);
      int var7 = (var4 - var3 + 1) * (var6 - var5 + 1);
      var0.field6887 = new int[var7];
      int var8 = 0;

      for (int var9 = var3; var9 <= var4; var9++) {
         for (int var10 = var5; var10 <= var6; var10++) {
            var0.field6887[var8] = classMH.method7570(var9, var10, (byte)12);
            var8++;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;IIII)V")
   @ObfuscatedName("al")
   void method12830(PacketBuffer var1, int var2, int var3, int var4, int var5) {
      try {
         this.field6884 = true;
         int var6 = classXY.method13047(var1, -1737903474);
         PacketBuffer.method12921(var1, (byte)120);

         for (int var7 = 0; var7 < var2; var7++) {
            if (var5 == -1926460509) {
               throw new IllegalStateException();
            }

            for (int var8 = 0; var8 < var3; var8++) {
               if (var5 == -1926460509) {
                  throw new IllegalStateException();
               }

               for (int var9 = 0; var9 < var4; var9++) {
                  if (var5 == -1926460509) {
                     throw new IllegalStateException();
                  }

                  int var10 = PacketBuffer.method12923(var1, 1, -607133939);
                  if (1 == var10) {
                     if (var5 == -1926460509) {
                        throw new IllegalStateException();
                     }

                     this.field6885[var7][var8][var9] = PacketBuffer.method12923(var1, 26, 2052400899);
                  } else {
                     this.field6885[var7][var8][var9] = -1;
                  }
               }
            }
         }

         PacketBuffer.method12926(var1, -2145664019);
         this.field6887 = new int[var6];
         Arrays.fill(this.field6887, -1);
         var6 = 0;

         for (int var19 = 0; var19 < var2; var19++) {
            if (var5 == -1926460509) {
               return;
            }

            for (int var20 = 0; var20 < var3; var20++) {
               if (var5 == -1926460509) {
                  return;
               }

               for (int var21 = 0; var21 < var4; var21++) {
                  if (var5 == -1926460509) {
                     throw new IllegalStateException();
                  }

                  int var22 = this.field6885[var19][var20][var21];
                  if (-1 != var22) {
                     int var11 = classHA.method5955(var22, -2088305504);
                     int var12 = classKT.method6562(var22, -2097626076);
                     int var13 = classKY.method6602(var11, (byte)54);
                     int var14 = classKY.method6602(var12, (byte)0);
                     int var15 = classMH.method7570(var13, var14, (byte)54);

                     for (int var16 = 0; var16 < var6; var16++) {
                        if (var5 == -1926460509) {
                           throw new IllegalStateException();
                        }

                        if (this.field6887[var16] == var15) {
                           if (var5 == -1926460509) {
                              return;
                           }

                           var15 = -1;
                           break;
                        }
                     }

                     if (var15 != -1) {
                        if (var5 == -1926460509) {
                           return;
                        }

                        this.field6887[var6] = var15;
                        var6++;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var17) {
         throw classEG.method3884(var17, "xk.al(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ay")
   public static int method12798(int var0, int var1) {
      return (var0 << 8) + var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aq")
   public static int method12799(int var0) {
      return var0 >> 8;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ak")
   public static int method12803(int var0) {
      return var0 & 0xFF;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ap")
   public static int method12800(int var0) {
      return var0 >> 8;
   }

   @ObfuscatedSignature(descriptor = "(Lxk;I)I")
   @ObfuscatedName("xx")
   public static int method12809(classXK var0, int var1) {
      if (var0 == null) {
         return var0.method12812(var1);
      } else {
         try {
            return var0.field6887.length;
         } catch (RuntimeException var2) {
            throw classEG.method3884(var2, "xk.ag(" + 41);
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("au")
   public static int method12801(int var0) {
      return var0 >> 8;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ai")
   public static int method12804(int var0) {
      return var0 & 0xFF;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ar")
   public static int method12805(int var0) {
      return var0 & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bx")
   public int method12813(int var1) {
      return this.field6887[var1];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ad")
   public static int method12802(int var0) {
      return var0 >> 8;
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("as")
   public int method12814(int var1, byte var2) {
      try {
         return this.field6887[var1];
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xk.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("an")
   public boolean method12807() {
      return this.field6884;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ah")
   public int method12810() {
      return this.field6887.length;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bn")
   public int method12811() {
      return this.field6887.length;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxk;II)V")
   @ObfuscatedName("bn")
   public static void method12820(classXK var0, int var1, int var2) {
      if (var0 == null) {
         var0.method12818(var1, var1, var1);
      }

      var0.field6884 = false;
      int var3 = classKY.method6602(var1 - 6, (byte)-4);
      int var4 = classKY.method6602(6 + var1, (byte)59);
      int var5 = classKY.method6602(var2 - 6, (byte)35);
      int var6 = classKY.method6602(var2 + 6, (byte)3);
      int var7 = (var4 - var3 + 1) * (var6 - var5 + 1);
      var0.field6887 = new int[var7];
      int var8 = 0;

      for (int var9 = var3; var9 <= var4; var9++) {
         for (int var10 = var5; var10 <= var6; var10++) {
            var0.field6887[var8] = classMH.method7570(var9, var10, (byte)29);
            var8++;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Z")
   @ObfuscatedName("ab")
   public boolean method12808(int var1) {
      try {
         return this.field6884;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xk.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("bc")
   public int method12815(int var1) {
      return this.field6887[var1];
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bm")
   public void method12821(int var1, int var2) {
      this.field6884 = false;
      int var3 = classKY.method6602(var1 - 6, (byte)-30);
      int var4 = classKY.method6602(6 + var1, (byte)83);
      int var5 = classKY.method6602(var2 - 6, (byte)10);
      int var6 = classKY.method6602(var2 + 6, (byte)-48);
      int var7 = (var4 - var3 + 1) * (var6 - var5 + 1);
      this.field6887 = new int[var7];
      int var8 = 0;

      for (int var9 = var3; var9 <= var4; var9++) {
         for (int var10 = var5; var10 <= var6; var10++) {
            this.field6887[var8] = classMH.method7570(var9, var10, (byte)7);
            var8++;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;)V")
   @ObfuscatedName("bu")
   public void method12825(PacketBuffer var1) {
      this.method12830(var1, 4, 13, 13, 519399154);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxk;II)V")
   @ObfuscatedName("jt")
   public static void method12822(classXK var0, int var1, int var2) {
      if (var0 == null) {
         var0.method12810();
      }

      var0.field6884 = false;
      int var3 = classKY.method6602(var1 - 6, (byte)-46);
      int var4 = classKY.method6602(6 + var1, (byte)-87);
      int var5 = classKY.method6602(var2 - 6, (byte)-36);
      int var6 = classKY.method6602(var2 + 6, (byte)-34);
      int var7 = (var4 - var3 + 1) * (var6 - var5 + 1);
      var0.field6887 = new int[var7];
      int var8 = 0;

      for (int var9 = var3; var9 <= var4; var9++) {
         for (int var10 = var5; var10 <= var6; var10++) {
            var0.field6887[var8] = classMH.method7570(var9, var10, (byte)109);
            var8++;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;)V")
   @ObfuscatedName("bo")
   public void method12826(PacketBuffer var1) {
      this.method12830(var1, 4, 13, 13, -78621124);
   }

   @ObfuscatedSignature(descriptor = "(Lxs;III)V")
   @ObfuscatedName("bi")
   void method12831(PacketBuffer var1, int var2, int var3, int var4) {
      this.field6884 = true;
      int var5 = classXY.method13047(var1, -80072341);
      PacketBuffer.method12921(var1, (byte)4);

      for (int var6 = 0; var6 < var2; var6++) {
         for (int var7 = 0; var7 < var3; var7++) {
            for (int var8 = 0; var8 < var4; var8++) {
               int var9 = PacketBuffer.method12923(var1, 1, -910046796);
               if (1 == var9) {
                  this.field6885[var6][var7][var8] = PacketBuffer.method12923(var1, 26, 654595080);
               } else {
                  this.field6885[var6][var7][var8] = -1;
               }
            }
         }
      }

      PacketBuffer.method12926(var1, -2037731173);
      this.field6887 = new int[var5];
      Arrays.fill(this.field6887, -1);
      var5 = 0;

      for (int var17 = 0; var17 < var2; var17++) {
         for (int var18 = 0; var18 < var3; var18++) {
            for (int var19 = 0; var19 < var4; var19++) {
               int var20 = this.field6885[var17][var18][var19];
               if (-1 != var20) {
                  int var10 = classHA.method5955(var20, -2088305504);
                  int var11 = classKT.method6562(var20, -2130649328);
                  int var12 = classKY.method6602(var10, (byte)104);
                  int var13 = classKY.method6602(var11, (byte)-62);
                  int var14 = classMH.method7570(var12, var13, (byte)21);

                  for (int var15 = 0; var15 < var5; var15++) {
                     if (this.field6887[var15] == var14) {
                        var14 = -1;
                        break;
                     }
                  }

                  if (var14 != -1) {
                     this.field6887[var5] = var14;
                     var5++;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;III)V")
   @ObfuscatedName("ba")
   void method12832(PacketBuffer var1, int var2, int var3, int var4) {
      this.field6884 = true;
      int var5 = classXY.method13047(var1, -1055517426);
      PacketBuffer.method12921(var1, (byte)87);

      for (int var6 = 0; var6 < var2; var6++) {
         for (int var7 = 0; var7 < var3; var7++) {
            for (int var8 = 0; var8 < var4; var8++) {
               int var9 = PacketBuffer.method12923(var1, 1, -866579681);
               if (1 == var9) {
                  this.field6885[var6][var7][var8] = PacketBuffer.method12923(var1, 26, 1948589036);
               } else {
                  this.field6885[var6][var7][var8] = -1;
               }
            }
         }
      }

      PacketBuffer.method12926(var1, -2001055688);
      this.field6887 = new int[var5];
      Arrays.fill(this.field6887, -1);
      var5 = 0;

      for (int var17 = 0; var17 < var2; var17++) {
         for (int var18 = 0; var18 < var3; var18++) {
            for (int var19 = 0; var19 < var4; var19++) {
               int var20 = this.field6885[var17][var18][var19];
               if (-1 != var20) {
                  int var10 = classHA.method5955(var20, -2088305504);
                  int var11 = classKT.method6562(var20, -2090640557);
                  int var12 = classKY.method6602(var10, (byte)-13);
                  int var13 = classKY.method6602(var11, (byte)-23);
                  int var14 = classMH.method7570(var12, var13, (byte)120);

                  for (int var15 = 0; var15 < var5; var15++) {
                     if (this.field6887[var15] == var14) {
                        var14 = -1;
                        break;
                     }
                  }

                  if (var14 != -1) {
                     this.field6887[var5] = var14;
                     var5++;
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aw")
   public static int method12806(int var0) {
      return var0 & 0xFF;
   }

   @ObfuscatedSignature(descriptor = "(Lxs;III)V")
   @ObfuscatedName("bb")
   void method12833(PacketBuffer var1, int var2, int var3, int var4) {
      this.field6884 = true;
      int var5 = classXY.method13047(var1, -85887301);
      PacketBuffer.method12921(var1, (byte)51);

      for (int var6 = 0; var6 < var2; var6++) {
         for (int var7 = 0; var7 < var3; var7++) {
            for (int var8 = 0; var8 < var4; var8++) {
               int var9 = PacketBuffer.method12923(var1, 1, -935446910);
               if (1 == var9) {
                  this.field6885[var6][var7][var8] = PacketBuffer.method12923(var1, 26, -508447026);
               } else {
                  this.field6885[var6][var7][var8] = -1;
               }
            }
         }
      }

      PacketBuffer.method12926(var1, -2101878870);
      this.field6887 = new int[var5];
      Arrays.fill(this.field6887, -1);
      var5 = 0;

      for (int var17 = 0; var17 < var2; var17++) {
         for (int var18 = 0; var18 < var3; var18++) {
            for (int var19 = 0; var19 < var4; var19++) {
               int var20 = this.field6885[var17][var18][var19];
               if (-1 != var20) {
                  int var10 = classHA.method5955(var20, -2088305504);
                  int var11 = classKT.method6562(var20, -2082202631);
                  int var12 = classKY.method6602(var10, (byte)90);
                  int var13 = classKY.method6602(var11, (byte)-30);
                  int var14 = classMH.method7570(var12, var13, (byte)122);

                  for (int var15 = 0; var15 < var5; var15++) {
                     if (this.field6887[var15] == var14) {
                        var14 = -1;
                        break;
                     }
                  }

                  if (var14 != -1) {
                     this.field6887[var5] = var14;
                     var5++;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public static void method12823(int var0) {
      try {
         EvictingDualNodeHashTable.method6431(classOR.field5098);
         EvictingDualNodeHashTable.method6431(classOR.field5099);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "xk.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public int method12812(int var1) {
      try {
         return this.field6887.length;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "xk.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxs;I)V")
   @ObfuscatedName("aa")
   public void method12827(PacketBuffer var1, int var2) {
      try {
         this.method12830(var1, 4, 13, 13, -1906825040);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "xk.aa(" + ')');
      }
   }
}
