import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qf")
public class classQF {
   @ToRemove(unused = "true")
   @ObfuscatedName("aw")
   static final int field5530 = 34;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   public static final int field5531 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field5527 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field5526 = 8;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field5529 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field5528 = 2;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqr;ILqv;)I")
   @ObfuscatedName("ae")
   public static int method9499(classQR var0, int var1, classQV var2) {
      int var3 = 0;
      if (!var0.method9726(374233424)) {
         classQR.method9759(var0, 0, 253144314);
         return var3;
      } else {
         SequenceDefinition var4 = var0.method9731((byte)72);
         if (-1 == var4.field5134 * 1665914959) {
            var3 |= 8;
         }

         if (var4.method8785((byte)40)) {
            classQR.method9759(var0, 0, 725966552);
         } else {
            classQR.method9759(var0, var0.method9755((byte)54) + var1, -25048779);
         }

         if (!var4.method8768((byte)0)) {
            int var7 = var1;
            byte var8 = 0;
            SequenceDefinition var9 = var0.method9731((byte)116);
            if (1665914959 * var9.field5134 > 0 && var9.field5133 * -826664243 > 0) {
               var7 = var1 % (var9.field5133 * -826664243);
            }

            int var10 = var0.method9738(1846822057);
            int var11 = var0.method9739(696323460);
            int var12 = classQR.method9743(var0, 22636646);
            if (var10 >= var9.field5127.length) {
               var10 = 0;
               var11 = 0;
            }

            var11 += var7;

            while (var11 > var9.field5125[var10]) {
               var11 -= var9.field5125[var10];
               var10++;
               var8 |= 4;
               if (0 == (var8 & 2) && null != var2) {
                  var2.vmethod13(var9, var10, -63743416);
               }

               if (var10 >= var9.field5127.length) {
                  var12++;
                  var8 |= 1;
                  var10 -= var9.field5134 * 1665914959;
                  if (var12 >= 2035920365 * var9.field5124) {
                     var8 |= 2;
                  }

                  if (var10 < 0 || var10 >= var9.field5127.length) {
                     var8 |= 2;
                     var10 = 0;
                  }

                  if (0 == (var8 & 2) && null != var2) {
                     var2.vmethod13(var9, var10, 142519476);
                  }
               }
            }

            var0.method9769(var10, var11, var12, 1956245255);
            var3 |= var8;
         } else {
            var3 |= classEJ.method3903(var0, var1, var2, 1923378449);
         }

         return var3;
      }
   }

   classQF() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqr;ILqv;)I")
   @ObfuscatedName("ab")
   public static int method9500(classQR var0, int var1, classQV var2) {
      int var3 = 0;
      if (!var0.method9726(374233424)) {
         classQR.method9759(var0, 0, 548649845);
         return var3;
      } else {
         SequenceDefinition var4 = var0.method9731((byte)103);
         if (-1 == var4.field5134 * 1665914959) {
            var3 |= 8;
         }

         if (var4.method8785((byte)-22)) {
            classQR.method9759(var0, 0, 1801985248);
         } else {
            classQR.method9759(var0, var0.method9755((byte)27) + var1, 1142600234);
         }

         if (!var4.method8768((byte)0)) {
            int var7 = var1;
            byte var8 = 0;
            SequenceDefinition var9 = var0.method9731((byte)41);
            if (1665914959 * var9.field5134 > 0 && var9.field5133 * -826664243 > 0) {
               var7 = var1 % (var9.field5133 * -826664243);
            }

            int var10 = var0.method9738(1823690830);
            int var11 = var0.method9739(587855772);
            int var12 = classQR.method9743(var0, 22636646);
            if (var10 >= var9.field5127.length) {
               var10 = 0;
               var11 = 0;
            }

            var11 += var7;

            while (var11 > var9.field5125[var10]) {
               var11 -= var9.field5125[var10];
               var10++;
               var8 |= 4;
               if (0 == (var8 & 2) && null != var2) {
                  var2.vmethod13(var9, var10, 1920250572);
               }

               if (var10 >= var9.field5127.length) {
                  var12++;
                  var8 |= 1;
                  var10 -= var9.field5134 * 1665914959;
                  if (var12 >= 2035920365 * var9.field5124) {
                     var8 |= 2;
                  }

                  if (var10 < 0 || var10 >= var9.field5127.length) {
                     var8 |= 2;
                     var10 = 0;
                  }

                  if (0 == (var8 & 2) && null != var2) {
                     var2.vmethod13(var9, var10, 1677034273);
                  }
               }
            }

            var0.method9769(var10, var11, var12, 1877869217);
            var3 |= var8;
         } else {
            var3 |= classEJ.method3903(var0, var1, var2, 1627099000);
         }

         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqr;ILqv;)I")
   @ObfuscatedName("ag")
   static int method9501(classQR var0, int var1, classQV var2) {
      byte var3 = 0;
      SequenceDefinition var4 = var0.method9731((byte)86);
      if (var4.field5134 * 1665914959 > 0 && var1 > 0) {
         var1 -= 1665914959 * var4.field5134 * ((var1 - 1) / (1665914959 * var4.field5134));
      }

      int var5 = var0.method9738(1717213552);
      int var6 = classQR.method9743(var0, 22636646);

      while (var1 > 0) {
         var1--;
         var5++;
         var3 |= 4;
         if (0 == (var3 & 2) && null != var2) {
            var2.vmethod13(var4, var5, 1584121578);
         }

         int var7 = var4.method8771(1737158690);
         if (var5 >= var7) {
            var6++;
            var3 |= 1;
            var5 -= var4.field5134 * 1665914959;
            if (var6 >= 2035920365 * var4.field5124) {
               var3 |= 2;
            }

            if (var5 < 0 || var5 >= var7) {
               var3 |= 2;
               var5 = 0;
            }

            if (0 == (var3 & 2) && var2 != null) {
               var2.vmethod13(var4, var5, 225032459);
            }
         }
      }

      var0.method9770(var5, var6, -102492219);
      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqr;ILqv;)I")
   @ObfuscatedName("as")
   static int method9502(classQR var0, int var1, classQV var2) {
      byte var3 = 0;
      SequenceDefinition var4 = var0.method9731((byte)68);
      if (var4.field5134 * 1665914959 > 0 && var1 > 0) {
         var1 -= 1903017736 * var4.field5134 * ((var1 - 1) / (1237741048 * var4.field5134));
      }

      int var5 = var0.method9738(2023036261);
      int var6 = classQR.method9743(var0, 22636646);

      while (var1 > 0) {
         var1--;
         var5++;
         var3 |= 4;
         if (0 == (var3 & 2) && null != var2) {
            var2.vmethod13(var4, var5, 1067728869);
         }

         int var7 = var4.method8771(2083681372);
         if (var5 >= var7) {
            var6++;
            var3 |= 1;
            var5 -= var4.field5134 * -387955630;
            if (var6 >= 2035920365 * var4.field5124) {
               var3 |= 2;
            }

            if (var5 < 0 || var5 >= var7) {
               var3 |= 2;
               var5 = 0;
            }

            if (0 == (var3 & 2) && var2 != null) {
               var2.vmethod13(var4, var5, 1146783624);
            }
         }
      }

      var0.method9770(var5, var6, -102492219);
      return var3;
   }
}
