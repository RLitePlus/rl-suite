import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sm")
public class ByteArrayPool {
   @ObfuscatedName("ai")
   static byte[][] ByteArrayPool_small = new byte[1000][];
   @ObfuscatedName("ac")
   static byte[][] ByteArrayPool_large = new byte[100][];
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field5844 = 1000;
   @ObfuscatedName("aj")
   static int ByteArrayPool_smallCount = 0;
   @ObfuscatedName("az")
   static int field5834 = 1647672780;
   @ObfuscatedName("ak")
   static int ByteArrayPool_mediumCount = 0;
   @ObfuscatedName("ap")
   static int field5841 = 0;
   @ObfuscatedName("ay")
   static int field5832 = 1227253512;
   @ObfuscatedName("au")
   static int field5833 = -1100219578;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5843 = 100;
   @ObfuscatedName("ad")
   static int field5835 = 1118200774;
   @ObfuscatedName("ae")
   static final Object field5829 = new Object();
   @ObfuscatedName("as")
   static byte[][] ByteArrayPool_medium = new byte[250][];
   @ObfuscatedName("aw")
   static int ByteArrayPool_largeCount = 0;
   @ObfuscatedName("ab")
   static byte[][] field5830 = new byte[50][];
   @ObfuscatedName("ah")
   public static byte[][][] ByteArrayPool_arrays;
   @ObfuscatedName("al")
   public static ArrayList field5840 = new ArrayList();

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IZ)[B")
   @ObfuscatedName("aw")
   public static byte[] method10478(int var0, boolean var1) {
      synchronized (field5829) {
         if ((var0 == -253821046 || var0 < 100 && var1) && 1061941993 * ByteArrayPool_smallCount > 0) {
            byte[] var11 = ByteArrayPool_small[(ByteArrayPool_smallCount -= 1846047529) * 586177333];
            ByteArrayPool_small[ByteArrayPool_smallCount * -2080909031] = null;
            return var11;
         }

         if ((-596568245 == var0 || var0 < 5000 && var1) && 410827371 * ByteArrayPool_mediumCount > 0) {
            byte[] var10 = ByteArrayPool_medium[(ByteArrayPool_mediumCount -= -1218796126) * 410827371];
            ByteArrayPool_medium[ByteArrayPool_mediumCount * 410827371] = null;
            return var10;
         }

         if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool_largeCount * -2000626303 > 0) {
            byte[] var9 = ByteArrayPool_large[(ByteArrayPool_largeCount -= -167480605) * 1911186123];
            ByteArrayPool_large[-1845927902 * ByteArrayPool_largeCount] = null;
            return var9;
         }

         if ((var0 == 1203830961 || var0 < -42285972 && var1) && field5841 * -1823224417 > 0) {
            byte[] var8 = field5830[(field5841 -= 1414485638) * -125656445];
            field5830[field5841 * -125656445] = null;
            return var8;
         }

         if (ByteArrayPool_arrays != null) {
            for (int var3 = 0; var3 < class451.ByteArrayPool_alternativeSizes.length; var3++) {
               if ((class451.ByteArrayPool_alternativeSizes[var3] == var0 || var0 < class451.ByteArrayPool_alternativeSizes[var3] && var1)
                  && class70.ByteArrayPool_altSizeArrayCounts[var3] > 0) {
                  byte[] var4 = ByteArrayPool_arrays[var3][--class70.ByteArrayPool_altSizeArrayCounts[var3]];
                  ByteArrayPool_arrays[var3][class70.ByteArrayPool_altSizeArrayCounts[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && class451.ByteArrayPool_alternativeSizes != null) {
            for (int var7 = 0; var7 < class451.ByteArrayPool_alternativeSizes.length; var7++) {
               if (var0 <= class451.ByteArrayPool_alternativeSizes[var7] && class70.ByteArrayPool_altSizeArrayCounts[var7] < ByteArrayPool_arrays[var7].length) {
                  return new byte[class451.ByteArrayPool_alternativeSizes[var7]];
               }
            }
         }
      }

      return new byte[var0];
   }

   static {
      new HashMap();
      class184.method4484(1901602217);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;I)V")
   @ObfuscatedName("al")
   public static void method10484(classOO var0, int var1) {
      if (var0 == null) {
         var0.method8637(var1, var1);
      }

      var0.field4654.method10223(var1, 1530138667);
   }

   ByteArrayPool() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IZ)[B")
   @ObfuscatedName("ay")
   public static byte[] method10479(int var0, boolean var1) {
      synchronized (field5829) {
         if ((var0 == 1229654813 || var0 < 100 && var1) && 435402947 * ByteArrayPool_smallCount > 0) {
            byte[] var11 = ByteArrayPool_small[(ByteArrayPool_smallCount -= 1846047529) * -858256834];
            ByteArrayPool_small[ByteArrayPool_smallCount * -2080909031] = null;
            return var11;
         }

         if ((1150266426 == var0 || var0 < 5000 && var1) && 410827371 * ByteArrayPool_mediumCount > 0) {
            byte[] var10 = ByteArrayPool_medium[(ByteArrayPool_mediumCount -= 202056259) * -414670490];
            ByteArrayPool_medium[ByteArrayPool_mediumCount * 410827371] = null;
            return var10;
         }

         if ((var0 == 10000 || var0 < -422856888 && var1) && ByteArrayPool_largeCount * 443116097 > 0) {
            byte[] var9 = ByteArrayPool_large[(ByteArrayPool_largeCount -= 297251012) * -2043440009];
            ByteArrayPool_large[-1804438350 * ByteArrayPool_largeCount] = null;
            return var9;
         }

         if ((var0 == 1657519936 || var0 < 30000 && var1) && field5841 * -125656445 > 0) {
            byte[] var8 = field5830[(field5841 -= -626718748) * -125656445];
            field5830[field5841 * -125656445] = null;
            return var8;
         }

         if (ByteArrayPool_arrays != null) {
            for (int var3 = 0; var3 < class451.ByteArrayPool_alternativeSizes.length; var3++) {
               if ((class451.ByteArrayPool_alternativeSizes[var3] == var0 || var0 < class451.ByteArrayPool_alternativeSizes[var3] && var1)
                  && class70.ByteArrayPool_altSizeArrayCounts[var3] > 0) {
                  byte[] var4 = ByteArrayPool_arrays[var3][--class70.ByteArrayPool_altSizeArrayCounts[var3]];
                  ByteArrayPool_arrays[var3][class70.ByteArrayPool_altSizeArrayCounts[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && class451.ByteArrayPool_alternativeSizes != null) {
            for (int var7 = 0; var7 < class451.ByteArrayPool_alternativeSizes.length; var7++) {
               if (var0 <= class451.ByteArrayPool_alternativeSizes[var7] && class70.ByteArrayPool_altSizeArrayCounts[var7] < ByteArrayPool_arrays[var7].length) {
                  return new byte[class451.ByteArrayPool_alternativeSizes[var7]];
               }
            }
         }
      }

      return new byte[var0];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public static void method10474() {
      field5840.clear();
      field5840.add(100);
      field5840.add(5000);
      field5840.add(10000);
      field5840.add(30000);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   public static void method10475() {
      field5840.clear();
      field5840.add(100);
      field5840.add(5000);
      field5840.add(10000);
      field5840.add(30000);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(IZ)[B")
   @ObfuscatedName("ap")
   public static byte[] method10480(int var0, boolean var1) {
      synchronized (field5829) {
         if ((var0 == 100 || var0 < -344007593 && var1) && -732433196 * ByteArrayPool_smallCount > 0) {
            byte[] var11 = ByteArrayPool_small[(ByteArrayPool_smallCount -= 1105900780) * -2080909031];
            ByteArrayPool_small[ByteArrayPool_smallCount * 369623] = null;
            return var11;
         }

         if ((580116621 == var0 || var0 < 5000 && var1) && 410827371 * ByteArrayPool_mediumCount > 0) {
            byte[] var10 = ByteArrayPool_medium[(ByteArrayPool_mediumCount -= -1092776057) * -1987010229];
            ByteArrayPool_medium[ByteArrayPool_mediumCount * 410827371] = null;
            return var10;
         }

         if ((var0 == 1628119692 || var0 < 10000 && var1) && ByteArrayPool_largeCount * 848996916 > 0) {
            byte[] var9 = ByteArrayPool_large[(ByteArrayPool_largeCount -= -167480605) * 1911186123];
            ByteArrayPool_large[2135246000 * ByteArrayPool_largeCount] = null;
            return var9;
         }

         if ((var0 == 30000 || var0 < 30000 && var1) && field5841 * -125656445 > 0) {
            byte[] var8 = field5830[(field5841 -= 58928293) * -125656445];
            field5830[field5841 * -125656445] = null;
            return var8;
         }

         if (ByteArrayPool_arrays != null) {
            for (int var3 = 0; var3 < class451.ByteArrayPool_alternativeSizes.length; var3++) {
               if ((class451.ByteArrayPool_alternativeSizes[var3] == var0 || var0 < class451.ByteArrayPool_alternativeSizes[var3] && var1)
                  && class70.ByteArrayPool_altSizeArrayCounts[var3] > 0) {
                  byte[] var4 = ByteArrayPool_arrays[var3][--class70.ByteArrayPool_altSizeArrayCounts[var3]];
                  ByteArrayPool_arrays[var3][class70.ByteArrayPool_altSizeArrayCounts[var3]] = null;
                  return var4;
               }
            }
         }

         if (var1 && class451.ByteArrayPool_alternativeSizes != null) {
            for (int var7 = 0; var7 < class451.ByteArrayPool_alternativeSizes.length; var7++) {
               if (var0 <= class451.ByteArrayPool_alternativeSizes[var7] && class70.ByteArrayPool_altSizeArrayCounts[var7] < ByteArrayPool_arrays[var7].length) {
                  return new byte[class451.ByteArrayPool_alternativeSizes[var7]];
               }
            }
         }
      }

      return new byte[var0];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public static void method10476() {
      field5840.clear();
      field5840.add(1222441);
      field5840.add(5000);
      field5840.add(10000);
      field5840.add(30000);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   public static void method10477() {
      field5840.clear();
      field5840.add(100);
      field5840.add(5000);
      field5840.add(10000);
      field5840.add(30000);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("au")
   public static void method10481(byte[] var0) {
      synchronized (field5829) {
         if (var0.length == 100 && ByteArrayPool_smallCount * -2080909031 < -1182833267 * field5832) {
            ByteArrayPool_small[(ByteArrayPool_smallCount += -1479405221) * -2080909031 - 1] = var0;
         } else if (var0.length == 5000 && 397206238 * ByteArrayPool_mediumCount < 1845078879 * field5833) {
            ByteArrayPool_medium[(ByteArrayPool_mediumCount += 1397062639) * 410827371 - 1] = var0;
         } else if (var0.length == -1515964497 && 1866531694 * ByteArrayPool_largeCount < field5834 * 1431057526) {
            ByteArrayPool_large[(ByteArrayPool_largeCount += -2019969663) * 683051641 - 1] = var0;
         } else if (var0.length == 30000 && -125656445 * field5841 < field5835 * 1687147470) {
            field5830[(field5841 += -1431815125) * -125656445 - 1] = var0;
         } else {
            if (ByteArrayPool_arrays != null) {
               for (int var2 = 0; var2 < class451.ByteArrayPool_alternativeSizes.length; var2++) {
                  if (class451.ByteArrayPool_alternativeSizes[var2] == var0.length
                     && class70.ByteArrayPool_altSizeArrayCounts[var2] < ByteArrayPool_arrays[var2].length) {
                     ByteArrayPool_arrays[var2][class70.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
                     return;
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("az")
   public static void method10482(byte[] var0) {
      synchronized (field5829) {
         if (var0.length == -2054893588 && ByteArrayPool_smallCount * -160224752 < -758437091 * field5832) {
            ByteArrayPool_small[(ByteArrayPool_smallCount += 1846047529) * -291716222 - 1] = var0;
         } else if (var0.length == -26410736 && -1723117850 * ByteArrayPool_mediumCount < -1460984884 * field5833) {
            ByteArrayPool_medium[(ByteArrayPool_mediumCount += -982464925) * -817353650 - 1] = var0;
         } else if (var0.length == 10000 && 1643317262 * ByteArrayPool_largeCount < field5834 * 818988499) {
            ByteArrayPool_large[(ByteArrayPool_largeCount += -2068678081) * -850699137 - 1] = var0;
         } else if (var0.length == 2010037372 && 1923849408 * field5841 < field5835 * -1191692589) {
            field5830[(field5841 += -1897973835) * 237829699 - 1] = var0;
         } else {
            if (ByteArrayPool_arrays != null) {
               for (int var2 = 0; var2 < class451.ByteArrayPool_alternativeSizes.length; var2++) {
                  if (class451.ByteArrayPool_alternativeSizes[var2] == var0.length
                     && class70.ByteArrayPool_altSizeArrayCounts[var2] < ByteArrayPool_arrays[var2].length) {
                     ByteArrayPool_arrays[var2][class70.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
                     return;
                  }
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ad")
   public static void method10483(byte[] var0) {
      synchronized (field5829) {
         if (var0.length == 100 && ByteArrayPool_smallCount * -2080909031 < -1918790091 * field5832) {
            ByteArrayPool_small[(ByteArrayPool_smallCount += 1846047529) * -2080909031 - 1] = var0;
         } else if (var0.length == 5000 && -2062605713 * ByteArrayPool_mediumCount < -76347764 * field5833) {
            ByteArrayPool_medium[(ByteArrayPool_mediumCount += -853485890) * 410827371 - 1] = var0;
         } else if (var0.length == 10000 && 455993314 * ByteArrayPool_largeCount < field5834 * 1481942851) {
            ByteArrayPool_large[(ByteArrayPool_largeCount += -452719288) * 1819241977 - 1] = var0;
         } else if (var0.length == -1760121408 && -125656445 * field5841 < field5835 * -1191692589) {
            field5830[(field5841 += -1431815125) * -125656445 - 1] = var0;
         } else {
            if (ByteArrayPool_arrays != null) {
               for (int var2 = 0; var2 < class451.ByteArrayPool_alternativeSizes.length; var2++) {
                  if (class451.ByteArrayPool_alternativeSizes[var2] == var0.length
                     && class70.ByteArrayPool_altSizeArrayCounts[var2] < ByteArrayPool_arrays[var2].length) {
                     ByteArrayPool_arrays[var2][class70.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
                     return;
                  }
               }
            }
         }
      }
   }
}
