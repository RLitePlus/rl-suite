import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ys")
public class classYS implements Comparator {
   @ObfuscatedName("az")
   final boolean field7075;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field7076 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field7078 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   public static final int field7077 = 76;

   @ObfuscatedSignature(descriptor = "(Lrr;Lrr;)I")
   @ObfuscatedName("af")
   int method13616(classRR var1, classRR var2) {
      return this.field7075
         ? classAAE.method182(var1.method10166((byte)16), var2.method10166((byte)16), 1600959519)
         : classAAE.method182(var2.method10166((byte)16), var1.method10166((byte)16), 1600959519);
   }

   @ObfuscatedSignature(descriptor = "(Lrr;Lrr;I)I")
   @ObfuscatedName("az")
   int method13617(classRR var1, classRR var2, int var3) {
      try {
         int var10000;
         if (this.field7075) {
            if (var3 >= -1886357123) {
               throw new IllegalStateException();
            }

            var10000 = classAAE.method182(var1.method10166((byte)16), var2.method10166((byte)16), 1600959519);
         } else {
            var10000 = classAAE.method182(var2.method10166((byte)16), var1.method10166((byte)16), 1600959519);
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ys.az(" + 41);
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method13617((classRR)var1, (classRR)var2, -1974561099);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ys.compare(" + 41);
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ys.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("as")
   public int method13618(Object var1, Object var2) {
      return this.method13617((classRR)var1, (classRR)var2, -2147024240);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public boolean method13620(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method13621(Object var1) {
      return super.equals(var1);
   }

   public classYS(boolean var1) {
      this.field7075 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method13619(Object var1, Object var2) {
      return this.method13617((classRR)var1, (classRR)var2, -2097789335);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldm;)I")
   @ObfuscatedName("yw")
   public static int method13622(classDM var0) {
      return var0 == null ? var0.method3427() : -12931133 * var0.field1564;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lze;I)[Ljava/lang/Object;")
   @ObfuscatedName("vw")
   public static Object[] method13623(classZE var0, int var1) {
      return var0.field7172 == null ? null : var0.field7172[var1];
   }

   @ObfuscatedSignature(descriptor = "([BI)V")
   @ObfuscatedName("aj")
   static void method13624(byte[] var0, int var1) {
      try {
         classXY var2 = new classXY(var0);
         var2.field6955 = (var0.length - 2) * -1095856699;
         classYL.field7001 = classXY.method13047(var2, 1707980289) * 1826761615;
         classYL.field7002 = new int[1616155503 * classYL.field7001];
         classYL.field7003 = new int[classYL.field7001 * 1616155503];
         classPO.field5371 = new int[1616155503 * classYL.field7001];
         classGG.field2578 = new int[1616155503 * classYL.field7001];
         classYL.field7004 = new byte[classYL.field7001 * 1616155503][];
         var2.field6955 = -1095856699 * (var0.length - 7 - classYL.field7001 * 44342136);
         classYL.field7000 = classXY.method13047(var2, 1410422866) * 1527476973;
         classYL.field6999 = classXY.method13047(var2, -767132224) * 1330952715;
         int var3 = (classXY.method13039(var2, -346779531) & 0xFF) + 1;

         for (int var4 = 0; var4 < classYL.field7001 * 1616155503; var4++) {
            if (var1 != -1108124092) {
               return;
            }

            classYL.field7002[var4] = classXY.method13047(var2, -436762751);
         }

         for (int var15 = 0; var15 < classYL.field7001 * 1616155503; var15++) {
            if (var1 != -1108124092) {
               return;
            }

            classYL.field7003[var15] = classXY.method13047(var2, -433462387);
         }

         for (int var16 = 0; var16 < classYL.field7001 * 1616155503; var16++) {
            if (var1 != -1108124092) {
               throw new IllegalStateException();
            }

            classPO.field5371[var16] = classXY.method13047(var2, -715078765);
         }

         for (int var17 = 0; var17 < classYL.field7001 * 1616155503; var17++) {
            if (var1 != -1108124092) {
               throw new IllegalStateException();
            }

            classGG.field2578[var17] = classXY.method13047(var2, -996484208);
         }

         var2.field6955 = (var0.length - 7 - classYL.field7001 * 44342136 - (var3 - 1) * 3) * -1095856699;
         classRB.field5639 = new int[var3];

         for (int var18 = 1; var18 < var3; var18++) {
            if (var1 != -1108124092) {
               return;
            }

            classRB.field5639[var18] = var2.method13051(-758448158);
            if (0 == classRB.field5639[var18]) {
               if (var1 != -1108124092) {
                  throw new IllegalStateException();
               }

               classRB.field5639[var18] = 1;
            }
         }

         var2.field6955 = 0;

         for (int var19 = 0; var19 < classYL.field7001 * 1616155503; var19++) {
            if (var1 != -1108124092) {
               return;
            }

            int var5 = classPO.field5371[var19];
            int var6 = classGG.field2578[var19];
            int var7 = var5 * var6;
            byte[] var8 = new byte[var7];
            classYL.field7004[var19] = var8;
            int var9 = classXY.method13039(var2, -346779531);
            boolean var10000;
            if ((var9 & 1) == 1) {
               if (var1 != -1108124092) {
                  return;
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var10 = var10000;
            if (2 == (var9 & 2)) {
               if (var1 != -1108124092) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var11 = var10000;
            if (!var10) {
               if (var1 != -1108124092) {
                  throw new IllegalStateException();
               }

               for (int var20 = 0; var20 < var7; var20++) {
                  if (var1 != -1108124092) {
                     throw new IllegalStateException();
                  }

                  var8[var20] = classXY.method13043(var2, (byte)17);
               }
            } else {
               for (int var12 = 0; var12 < var5; var12++) {
                  if (var1 != -1108124092) {
                     return;
                  }

                  for (int var13 = 0; var13 < var6; var13++) {
                     if (var1 != -1108124092) {
                        throw new IllegalStateException();
                     }

                     var8[var12 + var5 * var13] = classXY.method13043(var2, (byte)17);
                  }
               }
            }

            if (var11) {
               if (var1 != -1108124092) {
                  throw new IllegalStateException();
               }

               var2.field6955 += -1095856699 * var7;
            }
         }
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "ys.aj(" + ')');
      }
   }
}
