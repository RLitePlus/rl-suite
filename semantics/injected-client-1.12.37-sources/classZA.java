import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("za")
public class classZA {
   @ObfuscatedName("ax")
   static int field7129 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field7141 = 100;
   @ObfuscatedName("ag")
   static final Object field7127 = new Object();
   @ObfuscatedName("ao")
   static int field7132 = 916013528;
   @ObfuscatedName("aq")
   static byte[][] field7136 = new byte[1000][];
   @ObfuscatedName("ac")
   static int field7140 = 0;
   @ObfuscatedName("aw")
   public static byte[][][] field7144;
   @ObfuscatedName("ar")
   public static int[] field7143;
   @ObfuscatedName("al")
   static int field7133 = -949024178;
   @ObfuscatedName("aj")
   static int field7134 = 69756740;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field7142 = 1000;
   @ObfuscatedName("aa")
   static int field7131 = 0;
   @ObfuscatedName("ad")
   static byte[][] field7137 = new byte[250][];
   @ObfuscatedName("ap")
   static byte[][] field7128 = new byte[100][];
   @ObfuscatedName("au")
   static byte[][] field7138 = new byte[50][];
   @ObfuscatedName("ay")
   static int field7130 = -2144731954;
   @ObfuscatedName("as")
   static int field7135 = 0;
   @ObfuscatedName("ak")
   public static ArrayList field7139 = new ArrayList();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IZ)[B")
   @ObfuscatedName("ab")
   public static byte[] method13816(int var0, boolean var1) {
      synchronized (field7127) {
         if ((100 == var0 || var0 < 100 && var1) && 1951739973 * field7135 > 0) {
            byte[] var11 = field7136[(field7135 -= 1490182797) * 1951739973];
            field7136[1951739973 * field7135] = null;
            return var11;
         }

         if ((var0 == 5000 || var0 < 5000 && var1) && 1052148383 * field7129 > 0) {
            byte[] var10 = field7137[(field7129 -= -839116449) * 1052148383];
            field7137[field7129 * 1052148383] = null;
            return var10;
         }

         if ((var0 == 10000 || var0 < 10000 && var1) && -2070154251 * field7140 > 0) {
            byte[] var9 = field7128[(field7140 -= -618995619) * -2070154251];
            field7128[field7140 * -2070154251] = null;
            return var9;
         }

         if ((30000 == var0 || var0 < 30000 && var1) && field7131 * 1155531987 > 0) {
            byte[] var8 = field7138[(field7131 -= 1255076699) * 1155531987];
            field7138[field7131 * 1155531987] = null;
            return var8;
         }

         if (field7144 != null) {
            for (int var3 = 0; var3 < classSQ.field6028.length; var3++) {
               if ((classSQ.field6028[var3] == var0 || var0 < classSQ.field6028[var3] && var1) && field7143[var3] > 0) {
                  byte[] var4 = field7144[var3][--field7143[var3]];
                  field7144[var3][field7143[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && null != classSQ.field6028) {
            for (int var7 = 0; var7 < classSQ.field6028.length; var7++) {
               if (var0 <= classSQ.field6028[var7] && field7143[var7] < field7144[var7].length) {
                  return new byte[classSQ.field6028[var7]];
               }
            }
         }
      }

      return new byte[var0];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ax")
   public static void method13819(byte[] var0) {
      synchronized (field7127) {
         if (1378118898 == var0.length && -251579560 * field7135 < -580548761 * field7132) {
            field7136[(field7135 += -452367456) * -854979104 - 1] = var0;
         } else if (var0.length == -1962979956 && field7129 * 719110813 < -1190009700 * field7133) {
            field7137[(field7129 += 1518430893) * 1052148383 - 1] = var0;
         } else if (var0.length == 1550123002 && 1589541802 * field7140 < field7134 * 273271753) {
            field7128[(field7140 += -618995619) * -2070154251 - 1] = var0;
         } else if (var0.length == 30000 && field7131 * 2004468253 < -1438188161 * field7130) {
            field7138[(field7131 += 728297699) * 1155531987 - 1] = var0;
         } else {
            if (null != field7144) {
               for (int var2 = 0; var2 < classSQ.field6028.length; var2++) {
                  if (classSQ.field6028[var2] == var0.length && field7143[var2] < field7144[var2].length) {
                     field7144[var2][field7143[var2]++] = var0;
                     return;
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IZ)[B")
   @ObfuscatedName("ae")
   public static byte[] method13817(int var0, boolean var1) {
      synchronized (field7127) {
         if ((100 == var0 || var0 < 100 && var1) && 1951739973 * field7135 > 0) {
            byte[] var11 = field7136[(field7135 -= 1490182797) * 1951739973];
            field7136[1951739973 * field7135] = null;
            return var11;
         }

         if ((var0 == 5000 || var0 < 5000 && var1) && 1052148383 * field7129 > 0) {
            byte[] var10 = field7137[(field7129 -= -839116449) * 1052148383];
            field7137[field7129 * 1052148383] = null;
            return var10;
         }

         if ((var0 == 10000 || var0 < 10000 && var1) && -2070154251 * field7140 > 0) {
            byte[] var9 = field7128[(field7140 -= -618995619) * -2070154251];
            field7128[field7140 * -2070154251] = null;
            return var9;
         }

         if ((30000 == var0 || var0 < 30000 && var1) && field7131 * 1155531987 > 0) {
            byte[] var8 = field7138[(field7131 -= 1255076699) * 1155531987];
            field7138[field7131 * 1155531987] = null;
            return var8;
         }

         if (field7144 != null) {
            for (int var3 = 0; var3 < classSQ.field6028.length; var3++) {
               if ((classSQ.field6028[var3] == var0 || var0 < classSQ.field6028[var3] && var1) && field7143[var3] > 0) {
                  byte[] var4 = field7144[var3][--field7143[var3]];
                  field7144[var3][field7143[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && null != classSQ.field6028) {
            for (int var7 = 0; var7 < classSQ.field6028.length; var7++) {
               if (var0 <= classSQ.field6028[var7] && field7143[var7] < field7144[var7].length) {
                  return new byte[classSQ.field6028[var7]];
               }
            }
         }
      }

      return new byte[var0];
   }

   static {
      new HashMap();
      field7139.clear();
      field7139.add(100);
      field7139.add(5000);
      field7139.add(10000);
      field7139.add(30000);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IZ)[B")
   @ObfuscatedName("ag")
   public static byte[] method13818(int var0, boolean var1) {
      synchronized (field7127) {
         if ((100 == var0 || var0 < 100 && var1) && 1951739973 * field7135 > 0) {
            byte[] var11 = field7136[(field7135 -= 1490182797) * 1951739973];
            field7136[1951739973 * field7135] = null;
            return var11;
         }

         if ((var0 == 5000 || var0 < 5000 && var1) && 1052148383 * field7129 > 0) {
            byte[] var10 = field7137[(field7129 -= -839116449) * 1052148383];
            field7137[field7129 * 1052148383] = null;
            return var10;
         }

         if ((var0 == 10000 || var0 < 10000 && var1) && -2070154251 * field7140 > 0) {
            byte[] var9 = field7128[(field7140 -= -618995619) * -2070154251];
            field7128[field7140 * -2070154251] = null;
            return var9;
         }

         if ((30000 == var0 || var0 < 30000 && var1) && field7131 * 1155531987 > 0) {
            byte[] var8 = field7138[(field7131 -= 1255076699) * 1155531987];
            field7138[field7131 * 1155531987] = null;
            return var8;
         }

         if (field7144 != null) {
            for (int var3 = 0; var3 < classSQ.field6028.length; var3++) {
               if ((classSQ.field6028[var3] == var0 || var0 < classSQ.field6028[var3] && var1) && field7143[var3] > 0) {
                  byte[] var4 = field7144[var3][--field7143[var3]];
                  field7144[var3][field7143[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && null != classSQ.field6028) {
            for (int var7 = 0; var7 < classSQ.field6028.length; var7++) {
               if (var0 <= classSQ.field6028[var7] && field7143[var7] < field7144[var7].length) {
                  return new byte[classSQ.field6028[var7]];
               }
            }
         }
      }

      return new byte[var0];
   }

   classZA() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("as")
   public static void method13820(byte[] var0) {
      synchronized (field7127) {
         if (100 == var0.length && 1951739973 * field7135 < 1705466377 * field7132) {
            field7136[(field7135 += 1490182797) * 1951739973 - 1] = var0;
         } else if (var0.length == 925413559 && field7129 * 1740174764 < -817333317 * field7133) {
            field7137[(field7129 += -737751195) * -992087567 - 1] = var0;
         } else if (var0.length == 10000 && -2070154251 * field7140 < field7134 * -764707363) {
            field7128[(field7140 += -732192052) * 29008908 - 1] = var0;
         } else if (var0.length == -440115098 && field7131 * -2099359757 < -1438188161 * field7130) {
            field7138[(field7131 += 1851433213) * 982426427 - 1] = var0;
         } else {
            if (null != field7144) {
               for (int var2 = 0; var2 < classSQ.field6028.length; var2++) {
                  if (classSQ.field6028[var2] == var0.length && field7143[var2] < field7144[var2].length) {
                     field7144[var2][field7143[var2]++] = var0;
                     return;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ao")
   public static int method13821(int var0, byte var1) {
      try {
         int var2;
         label55: {
            var2 = 0;
            if (var0 >= 0) {
               if (var1 <= 3) {
                  throw new IllegalStateException();
               }

               if (var0 < 65536) {
                  break label55;
               }

               if (var1 <= 3) {
                  throw new IllegalStateException();
               }
            }

            var0 >>>= 16;
            var2 += 16;
         }

         if (var0 >= 256) {
            if (var1 <= 3) {
               throw new IllegalStateException();
            }

            var0 >>>= 8;
            var2 += 8;
         }

         if (var0 >= 16) {
            var0 >>>= 4;
            var2 += 4;
         }

         if (var0 >= 4) {
            if (var1 <= 3) {
               throw new IllegalStateException();
            }

            var0 >>>= 2;
            var2 += 2;
         }

         if (var0 >= 1) {
            if (var1 <= 3) {
               throw new IllegalStateException();
            }

            var0 >>>= 1;
            var2++;
         }

         return var2 + var0;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "za.ao(" + 41);
      }
   }
}
