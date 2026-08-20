import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ea")
public class classEA implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("bh")
   static final int field1718 = 65536;
   @ToRemove(unused = "true")
   @ObfuscatedName("aq")
   static final int field1716 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field1717 = 1;
   @ObfuscatedName("az")
   final boolean field1715;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("as")
   public int method3793(Object var1, Object var2) {
      return this.method3790((classRI)var1, (classRI)var2, -1530233874);
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;I)I")
   @ObfuscatedName("az")
   int method3790(classRI var1, classRI var2, int var3) {
      try {
         int var10000;
         if (this.field1715) {
            if (var3 != -1530233874) {
               throw new IllegalStateException();
            }

            var10000 = var1.field5670 * 1145202131 - 1145202131 * var2.field5670;
         } else {
            var10000 = var2.field5670 * 1145202131 - var1.field5670 * 1145202131;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ea.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lea;Ljava/lang/Object;)Z")
   @ObfuscatedName("au")
   public static boolean method3795(classEA var0, Object var1) {
      return var0 == null ? var0.method3796(var1) : var0.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(I)[Lgw;")
   @ObfuscatedName("az")
   static classGW[] method3797(int var0) {
      try {
         return new classGW[]{
            classGW.field2718, classGW.field2723, classGW.field2720, classGW.field2717, classGW.field2721, classGW.field2722, classGW.field2719
         };
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "ea.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public boolean method3796(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method3794(Object var1, Object var2) {
      return this.method3790((classRI)var1, (classRI)var2, -1530233874);
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ea.equals(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lea;Lri;Lri;)I")
   @ObfuscatedName("oh")
   public static int method3791(classEA var0, classRI var1, classRI var2) {
      return var0.field1715 ? var1.field5670 * 1145202131 - 1145202131 * var2.field5670 : var2.field5670 * 1145202131 - var1.field5670 * -1934088667;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lea;Lri;Lri;)I")
   @ObfuscatedName("dt")
   public static int method3792(classEA var0, classRI var1, classRI var2) {
      return var0.field1715 ? var1.field5670 * 1145202131 - 1145202131 * var2.field5670 : var2.field5670 * 1145202131 - var1.field5670 * 1145202131;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("gk")
   static final int method3800(byte var0) {
      try {
         return classKF.field3571.vmethod388(-662124149);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "ea.gk(" + 41);
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method3790((classRI)var1, (classRI)var2, -1530233874);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ea.compare(" + 41);
      }
   }

   public classEA(boolean var1) {
      this.field1715 = var1;
   }

   @ObfuscatedSignature(descriptor = "(IIIILjava/lang/String;I)V")
   @ObfuscatedName("fo")
   static void method3799(int var0, int var1, int var2, int var3, String var4, int var5) {
      try {
         int var6 = var0 >>> 16;
         int var7 = var0 & 65535;
         classLW var8 = classLY.method7378(classWK.field6691, var1, var2, (byte)-32);
         if (null == var8) {
            if (var5 < 1311907745) {
               ;
            }
         } else {
            if (null != var8.field4386) {
               if (var5 >= 1311907745) {
                  throw new IllegalStateException();
               }

               classZR var9 = classZS.method14182(
                  classUQ.method11465(var8, 1123605922)
                     .method14145(var8.field4386, (byte)2)
                     .method14156(var7, -2038314960)
                     .method14163(var6, -1403051862)
                     .method14165(var4, (byte)19),
                  (byte)127
               );
               classSZ.method10729(var9, -1484194837);
            }

            boolean var15 = true;
            if (var8.field4334 * -90794217 > 0) {
               if (var5 >= 1311907745) {
                  throw new IllegalStateException();
               }

               var15 = classCR.method2575(var8, 926553544);
            }

            if (!var15) {
               if (var5 >= 1311907745) {
                  throw new IllegalStateException();
               }
            } else {
               int var11 = classWK.field6691.method12136(var8, (short)255);
               int var12 = var7 - 1;
               boolean var10 = 0 != (var11 >> var12 & 1);
               if (!var10) {
                  if (var5 < 1311907745) {
                     ;
                  }
               } else {
                  if (var6 == 0) {
                     if (var5 >= 1311907745) {
                        throw new IllegalStateException();
                     }

                     classJL var13 = classEF.method3849(classJS.IF_BUTTONX, client.field795.field1535, (byte)88);
                     var13.field3343.method12979(var1, 616039869);
                     var13.field3343.method12973(var2, -1542382992);
                     var13.field3343.method12973(var3, -1542382992);
                     classXY.method12971(var13.field3343, var7, (byte)-52);
                     client.field795.method3367(var13, -1301097035);
                  } else {
                     classJL var16 = classEF.method3849(classJS.IF_SUBOP, client.field795.field1535, (byte)20);
                     var16.field3343.method12979(var1, 104651136);
                     var16.field3343.method12973(var2, -1542382992);
                     var16.field3343.method12973(var3, -1542382992);
                     classXY.method12971(var16.field3343, var7, (byte)-122);
                     classXY.method12971(var16.field3343, var6 - 1, (byte)-127);
                     client.field795.method3367(var16, -1301097035);
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "ea.fo(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lvt;")
   @ObfuscatedName("ab")
   static classVT method3798(int var0) {
      try {
         return classEB.field1727;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "ea.ab(" + ')');
      }
   }
}
