import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("at")
public class classAT {
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field275 = 6;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("af")
   AbstractArchive field273;
   @ObfuscatedSignature(descriptor = "Lyi;")
   @ObfuscatedName("ae")
   NodeHashTable field272;
   @ObfuscatedSignature(descriptor = "Laax;")
   @ObfuscatedName("kt")
   static classAAX field277;
   @ObfuscatedSignature(descriptor = "Lva;")
   @ObfuscatedName("az")
   AbstractArchive field274;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field276 = 1;
   @ObfuscatedName("lb")
   static String JX_SESSION_ID;
   @ObfuscatedName("ru")
   static GarbageCollectorMXBean field279;

   @ObfuscatedSignature(descriptor = "(IIZ)J")
   @ObfuscatedName("an")
   long method686(int var1, int var2, boolean var3) {
      int var4 = var2 ^ (var1 << 4 & 558166860 | var1 >> 12);
      var4 |= var1 << 16;
      return var3 ? var4 ^ 4294967296L : var4;
   }

   @ObfuscatedSignature(descriptor = "(II[II)Laj;")
   @ObfuscatedName("az")
   classAJ method667(int var1, int var2, int[] var3, int var4) {
      try {
         long var5 = method687(this, var1, var2, false, -324749371);
         classAU var7 = (classAU)this.field272.method13363(var5);
         if (null != var7) {
            if (var4 == 527203475) {
               throw new IllegalStateException();
            } else {
               return var7.method706(1883873013);
            }
         } else if (var3 == null || var3[0] > 0) {
            classAL var8 = classAL.method435(this.field274, var1, var2);
            if (var8 == null) {
               if (var4 == 527203475) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               classAJ var9 = var8.method443();
               this.field272.method13372(new classAU(var9), var5);
               if (var3 != null) {
                  if (var4 == 527203475) {
                     throw new IllegalStateException();
                  }

                  var3[0] -= var9.field189.length;
               }

               return var9;
            }
         } else if (var4 == 527203475) {
            throw new IllegalStateException();
         } else {
            return null;
         }
      } catch (RuntimeException var10) {
         throw classEG.newRunException(var10, "at.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I[II)Laj;")
   @ObfuscatedName("ae")
   classAJ method674(int var1, int[] var2, int var3) {
      try {
         if (this.field274.method11832((byte)7) == 1) {
            if (var3 >= 883916908) {
               throw new IllegalStateException();
            } else {
               return this.method667(0, var1, var2, -1174898449);
            }
         } else if (this.field274.method11868(var1, 1667889244) - 1 == 1) {
            if (var3 >= 883916908) {
               throw new IllegalStateException();
            } else {
               return this.method667(var1, 1, var2, -1356656945);
            }
         } else if (this.field274.method11868(var1, 1362387104) - 1 == 0) {
            return this.method667(var1, 0, var2, -1740706524);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "at.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II[I)Laj;")
   @ObfuscatedName("ax")
   classAJ method668(int var1, int var2, int[] var3) {
      long var4 = method687(this, var1, var2, false, -324749371);
      classAU var6 = (classAU)this.field272.method13363(var4);
      if (null != var6) {
         return var6.method706(1234866133);
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         classAL var7 = classAL.method435(this.field274, var1, var2);
         if (var7 == null) {
            return null;
         } else {
            classAJ var8 = var7.method443();
            this.field272.method13372(new classAU(var8), var4);
            if (var3 != null) {
               var3[0] -= var8.field189.length;
            }

            return var8;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Lat;IIZI)J")
   @ObfuscatedName("pl")
   public static long method687(classAT var0, int var1, int var2, boolean var3, int var4) {
      if (var0 == null) {
         return var0.method691(var1, var1, var3, var1);
      } else {
         try {
            int var5 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
            var5 |= var1 << 16;
            if (var3) {
               if (var4 != -324749371) {
                  throw new IllegalStateException();
               } else {
                  return var5 ^ 4294967296L;
               }
            } else {
               return var5;
            }
         } catch (RuntimeException var6) {
            throw classEG.newRunException(var6, "at.as(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lau;")
   @ObfuscatedName("ab")
   public classAU method678(int var1, byte var2) {
      try {
         if (this.field273.method11832((byte)24) == 1) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            } else {
               return this.method673(0, var1, -1598517524);
            }
         } else if (this.field273.method11868(var1, 1947040726) == 1) {
            return this.method673(var1, 0, -95157126);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "at.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Laj;")
   @ObfuscatedName("ag")
   public classAJ method684(int var1, byte var2) {
      try {
         return this.method674(var1, null, -628099839);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "at.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([I[Ljava/lang/Object;IIB)V")
   @ObfuscatedName("ay")
   public static void method693(int[] var0, Object[] var1, int var2, int var3, byte var4) {
      try {
         if (var2 < var3) {
            if (var4 >= 16) {
               throw new IllegalStateException();
            }

            int var5 = (var3 + var2) / 2;
            int var6 = var2;
            int var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            Object var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;
            byte var10000;
            if (var7 == Integer.MAX_VALUE) {
               if (var4 >= 16) {
                  throw new IllegalStateException();
               }

               var10000 = 0;
            } else {
               var10000 = 1;
            }

            byte var9 = var10000;

            for (int var10 = var2; var10 < var3; var10++) {
               if (var0[var10] < var7 + (var10 & var9)) {
                  if (var4 >= 16) {
                     throw new IllegalStateException();
                  }

                  int var11 = var0[var10];
                  var0[var10] = var0[var6];
                  var0[var6] = var11;
                  Object var12 = var1[var10];
                  var1[var10] = var1[var6];
                  var1[var6++] = var12;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method693(var0, var1, var2, var6 - 1, (byte)-97);
            method693(var0, var1, var6 + 1, var3, (byte)11);
         }
      } catch (RuntimeException var13) {
         throw classEG.newRunException(var13, "at.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II[I)Laj;")
   @ObfuscatedName("ac")
   classAJ method669(int var1, int var2, int[] var3) {
      long var4 = method687(this, var1, var2, false, -324749371);
      classAU var6 = (classAU)this.field272.method13363(var4);
      if (null != var6) {
         return var6.method706(1619345383);
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         classAL var7 = classAL.method435(this.field274, var1, var2);
         if (var7 == null) {
            return null;
         } else {
            classAJ var8 = var7.method443();
            this.field272.method13372(new classAU(var8), var4);
            if (var3 != null) {
               var3[0] -= var8.field189.length;
            }

            return var8;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lat;IIZ)J")
   @ObfuscatedName("oy")
   public static long method688(classAT var0, int var1, int var2, boolean var3) {
      if (var0 == null) {
         var0.method683(var1);
      }

      int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
      var4 |= var1 << 16;
      return var3 ? var4 ^ 4294967296L : var4;
   }

   @ObfuscatedSignature(descriptor = "(II[I)Laj;")
   @ObfuscatedName("aa")
   classAJ method670(int var1, int var2, int[] var3) {
      long var4 = method687(this, var1, var2, false, -324749371);
      classAU var6 = (classAU)this.field272.method13363(var4);
      if (null != var6) {
         return var6.method706(1781936887);
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         classAL var7 = classAL.method435(this.field274, var1, var2);
         if (var7 == null) {
            return null;
         } else {
            classAJ var8 = var7.method443();
            this.field272.method13372(new classAU(var8), var4);
            if (var3 != null) {
               var3[0] -= var8.field189.length;
            }

            return var8;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lau;")
   @ObfuscatedName("ao")
   classAU method671(int var1, int var2) {
      long var3 = method687(this, var1, var2, true, -324749371);
      classAU var5 = (classAU)this.field272.method13363(var3);
      if (var5 != null) {
         return var5;
      } else {
         classBC var6 = classBC.method965(this.field273, var1, var2);
         if (null == var6) {
            return new classAU();
         } else {
            classAU var7 = new classAU(var6);
            this.field272.method13372(var7, var3);
            return var7;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lau;")
   @ObfuscatedName("al")
   classAU method672(int var1, int var2) {
      long var3 = method687(this, var1, var2, true, -324749371);
      classAU var5 = (classAU)this.field272.method13363(var3);
      if (var5 != null) {
         return var5;
      } else {
         classBC var6 = classBC.method965(this.field273, var1, var2);
         if (null == var6) {
            return new classAU();
         } else {
            classAU var7 = new classAU(var6);
            this.field272.method13372(var7, var3);
            return var7;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lau;")
   @ObfuscatedName("ap")
   public classAU method679(int var1) {
      if (this.field273.method11832((byte)-60) == 1) {
         return this.method673(0, var1, -1881252892);
      } else if (this.field273.method11868(var1, 1854517926) == 1) {
         return this.method673(var1, 0, -153040565);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I[I)Laj;")
   @ObfuscatedName("aq")
   classAJ method675(int var1, int[] var2) {
      if (this.field274.method11832((byte)-7) == 1) {
         return this.method667(0, var1, var2, 565695776);
      } else if (this.field274.method11868(var1, -1789401920) - 1 == 1) {
         return this.method667(var1, 1, var2, -531316542);
      } else if (this.field274.method11868(var1, 675901634) - 1 == 0) {
         return this.method667(var1, 0, var2, -1454787832);
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lat;I)Lau;")
   @ObfuscatedName("gx")
   public static classAU method680(classAT var0, int var1) {
      if (var0.field273.method11832((byte)-12) == 1) {
         return var0.method673(0, var1, -2010951986);
      } else if (var0.field273.method11868(var1, 323515098) == 1) {
         return var0.method673(var1, 0, -229959199);
      } else {
         throw new RuntimeException();
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lat;I[I)Laj;")
   @ObfuscatedName("fx")
   public static classAJ method676(classAT var0, int var1, int[] var2) {
      if (var0.field274.method11832((byte)58) == 1) {
         return var0.method667(0, var1, var2, 1313118414);
      } else if (var0.field274.method11868(var1, 1016737313) - 1 == 1) {
         return var0.method667(var1, 1, var2, 313605552);
      } else if (var0.field274.method11868(var1, -2121259855) - 1 == 0) {
         return var0.method667(var1, 0, var2, -1283041161);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(III)Lau;")
   @ObfuscatedName("af")
   classAU method673(int var1, int var2, int var3) {
      try {
         long var4 = method687(this, var1, var2, true, -324749371);
         classAU var6 = (classAU)this.field272.method13363(var4);
         if (var6 != null) {
            if (var3 == 327680) {
               throw new IllegalStateException();
            } else {
               return var6;
            }
         } else {
            classBC var7 = classBC.method965(this.field273, var1, var2);
            if (null == var7) {
               if (var3 == 327680) {
                  throw new IllegalStateException();
               } else {
                  return new classAU();
               }
            } else {
               classAU var8 = new classAU(var7);
               this.field272.method13372(var8, var4);
               return var8;
            }
         }
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "at.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lat;I[I)Laj;")
   @ObfuscatedName("ps")
   public static classAJ method677(classAT var0, int var1, int[] var2) {
      if (var0.field274.method11832((byte)-60) == 1) {
         return var0.method667(0, var1, var2, -55011595);
      } else if (var0.field274.method11868(var1, -1421869600) - 1 == 1) {
         return var0.method667(var1, 1, var2, -2049098596);
      } else if (var0.field274.method11868(var1, -620690546) - 1 == 0) {
         return var0.method667(var1, 0, var2, -1541070406);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lau;")
   @ObfuscatedName("au")
   public classAU method681(int var1) {
      if (this.field273.method11832((byte)3) == 1) {
         return this.method673(0, var1, -780101730);
      } else if (this.field273.method11868(var1, 1680607836) == 1) {
         return this.method673(var1, 0, -543957683);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lau;")
   @ObfuscatedName("ai")
   public classAU method682(int var1) {
      if (this.field273.method11832((byte)19) == 1) {
         return this.method673(0, var1, 796055944);
      } else if (this.field273.method11868(var1, -2118666004) == 1) {
         return this.method673(var1, 0, -998362018);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lau;")
   @ObfuscatedName("ar")
   public classAU method683(int var1) {
      if (this.field273.method11832((byte)-29) == 1) {
         return this.method673(0, var1, -1805642726);
      } else if (this.field273.method11868(var1, 960287565) == 1) {
         return this.method673(var1, 0, 1925446187);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Laj;")
   @ObfuscatedName("aw")
   public classAJ method685(int var1) {
      return this.method674(var1, null, 606166701);
   }

   @ObfuscatedSignature(descriptor = "(IIZ)J")
   @ObfuscatedName("ak")
   long method689(int var1, int var2, boolean var3) {
      int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
      var4 |= var1 << 16;
      return var3 ? var4 ^ 4294967296L : var4;
   }

   @ObfuscatedSignature(descriptor = "(Lnc;I)I")
   @ObfuscatedName("lu")
   public static int method692(classNC var0, int var1) {
      if (var0 == null) {
         var0.method7795(var1);
      }

      return var0.method7791(var1);
   }

   @ObfuscatedSignature(descriptor = "(IIZ)J")
   @ObfuscatedName("av")
   long method690(int var1, int var2, boolean var3) {
      int var4 = var2 ^ (var1 << 4 & 1241988359 | var1 >> 12);
      var4 |= var1 << 16;
      return var3 ? var4 ^ 4294967296L : var4;
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIIIIIII[Ljava/lang/String;III)V")
   @ObfuscatedName("df")
   static void method694(
      WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, String[] var9, int var10, int var11, int var12
   ) {
      try {
         classNN var13 = var0.field1690;
         classCD var14 = null;

         for (classCD var15 = (classCD)var13.method7915(); null != var15; var15 = (classCD)classNN.method7924(var13)) {
            if (var1 == var15.field679 * -1436432311 && -1779660971 * var15.field676 == var2) {
               if (var12 >= 910580657) {
                  throw new IllegalStateException();
               }

               if (var3 == var15.field680 * -522576623) {
                  if (var12 >= 910580657) {
                     throw new IllegalStateException();
                  }

                  if (var15.field678 * 2125153617 == var4) {
                     if (var12 >= 910580657) {
                        throw new IllegalStateException();
                     }

                     var14 = var15;
                     break;
                  }
               }
            }
         }

         if (var14 == null) {
            if (var12 >= 910580657) {
               throw new IllegalStateException();
            }

            var14 = new classCD();
            var14.field679 = 609004025 * var1;
            var14.field678 = 1957372849 * var4;
            var14.field676 = 1459830269 * var2;
            var14.field680 = -1914932239 * var3;
            var14.field682 = 643835989;
            classCU.method2677(var0, var14, -324749371);
            classNN.method7900(var13, var14);
         }

         var14.field675 = var5 * -1211208107;
         var14.field683 = var6 * 862858409;
         var14.field684 = var7 * -1062352069;
         var14.field673 = 1512991639 * var10;
         var14.field672 = -22663797 * var11;
         var14.method1411(var8, (byte)2);
         var14.method1415(var9, -2063180058);
      } catch (RuntimeException var16) {
         throw classEG.newRunException(var16, "at.df(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Las;I)Lae;")
   @ObfuscatedName("az")
   public static classAE method666(classAS var0, int var1) {
      try {
         switch (var0.field263 * 1928617345) {
            case 0:
               return new classAZ();
            default:
               throw new IllegalArgumentException();
         }
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "at.az(" + ')');
      }
   }

   public classAT(AbstractArchive var1, AbstractArchive var2) {
      new NodeHashTable(256);
      this.field272 = new NodeHashTable(256);
      this.field274 = var1;
      this.field273 = var2;
   }

   @ObfuscatedSignature(descriptor = "(IIZI)J")
   @ObfuscatedName("as")
   long method691(int var1, int var2, boolean var3, int var4) {
      try {
         int var5 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
         var5 |= var1 << 16;
         if (var3) {
            if (var4 != -324749371) {
               throw new IllegalStateException();
            } else {
               return var5 ^ 4294967296L;
            }
         } else {
            return var5;
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "at.as(" + ')');
      }
   }
}
