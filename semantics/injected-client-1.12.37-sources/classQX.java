import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qx")
class classQX implements Comparator {
   @ObfuscatedSignature(descriptor = "Lus;")
   @ObfuscatedName("pr")
   static classUS field5623;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqx;Ljava/util/Map$Entry;Ljava/util/Map$Entry;)I")
   @ObfuscatedName("wj")
   public static int method9836(classQX var0, Entry var1, Entry var2) {
      return var0 == null ? var0.method9838(var1, var1) : ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method9839(Object var1, Object var2) {
      return this.method9837((Entry)var1, (Entry)var2, 1183408284);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;I)I")
   @ObfuscatedName("az")
   int method9837(Entry var1, Entry var2, int var3) {
      try {
         return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "qx.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqx;Ljava/lang/Object;)Z")
   @ObfuscatedName("jn")
   public static boolean method9841(classQX var0, Object var1) {
      if (var0 == null) {
         var0.method9840(var1, var1);
      }

      return var0.equals(var1);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method9837((Entry)var1, (Entry)var2, 1848410095);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "qx.compare(" + 41);
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qx.equals(" + ')');
      }
   }

   classQX(classQY var1) {
      this.this$0 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("as")
   public int method9840(Object var1, Object var2) {
      return this.method9837((Entry)var1, (Entry)var2, 1578185826);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public boolean method9842(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;)I")
   @ObfuscatedName("af")
   int method9838(Entry var1, Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   @ObfuscatedSignature(descriptor = "(III)V")
   @ObfuscatedName("fy")
   static final void method9843(int var0, int var1, int var2) {
      try {
         int[] var3 = new int[client.field814.method1604((byte)0)];
         float[] var4 = new float[client.field814.method1604((byte)0)];
         int var5 = 0;

         for (Iterator var6 = client.field814.iterator(); var6.hasNext(); var5++) {
            if (var2 == -1439422728) {
               return;
            }

            WorldView var7 = (WorldView)var6.next();
            var3[var5] = var7.field1699 * 2140889407;
            var4[var5] = var7.scene.field2042;
         }

         classKD.method6462(var4, var3, 2092092092);
         HashMap var31 = new HashMap();

         for (int var29 = var3.length - 1; var29 >= 0; var29--) {
            if (var2 == -1439422728) {
               return;
            }

            if (!(var4[var29] > 0.0F)) {
               if (var2 == -1439422728) {
                  return;
               }

               if (0 != var3[var29]) {
                  continue;
               }

               if (var2 == -1439422728) {
                  return;
               }
            }

            classTN var32 = client.field814.method1620(var3[var29], 206128317);
            if (!var31.containsKey(var32)) {
               if (var2 == -1439422728) {
                  throw new IllegalStateException();
               }

               var31.put(var32, var3[var29]);
            }
         }

         for (int var30 = 0; var30 < var3.length; var30++) {
            if (var2 == -1439422728) {
               throw new IllegalStateException();
            }

            int var33 = var3[var30];
            classTN var8 = client.field814.method1620(var33, 206128317);
            Integer var9 = (Integer)var31.get(var8);
            if (var9 != null) {
               if (var2 == -1439422728) {
                  throw new IllegalStateException();
               }

               if (!var9.equals(var33)) {
                  if (var2 == -1439422728) {
                     return;
                  }
               } else if (classTN.field6172 == var8) {
                  if (var2 == -1439422728) {
                     throw new IllegalStateException();
                  }

                  Friend.method10155(classKK.field3779, "", 23, 0, var0, var1, 0, false, var33, -324749371);
               } else if (var8 == classTN.field6173) {
                  if (var2 == -1439422728) {
                     throw new IllegalStateException();
                  }

                  int var10 = 27064125 * client.field990 / 2;
                  int var11 = client.field982 * 1158148203 / 2;
                  int var12 = client.field878 * 1129651895;
                  Scene var14 = classIS.field3053.scene;
                  int var15 = -452033647 * client.field884;
                  int var16 = classKI.field3598 * -325062789;
                  int var17 = 1615527037 * classNL.field4684;
                  int var18 = 1343311673 * classAI.field167;
                  float var19 = 1.0E-5F;
                  classTW.method11209((byte)-51);
                  classEV.method4087(var14.field2087, var14.field2088, var14.field2089, var14.field2090, var10, var11, var12, (byte)-114);
                  classUZ var20 = classIK.method6218(0.0F, 1.0F, 0.0F, (byte)76);
                  float var21 = classLV.method7154(var20, classFO.field2345, (byte)-59);
                  classUZ var13;
                  if (Math.abs(var21) < 1.0E-5F) {
                     if (var2 == -1439422728) {
                        return;
                     }

                     classUZ.method11727(var20, 2124130229);
                     var13 = null;
                  } else {
                     classUZ var22 = classIK.method6218(var16, var17, var18, (byte)44);
                     classUZ var23 = classIK.method6218(var22.field6427, var22.field6425 - var15, var22.field6426, (byte)58);
                     float var24 = -classLV.method7154(var20, var23, (byte)-111) / var21;
                     classUZ.method11727(var20, 1688078599);
                     if (var24 < 0.0F) {
                        if (var2 == -1439422728) {
                           throw new IllegalStateException();
                        }

                        classUZ.method11727(var23, 1873798979);
                        classUZ.method11727(var22, 1883209680);
                        var13 = null;
                     } else {
                        classUZ var25 = Script.method1135(classFO.field2345, var24, -1280452024);
                        classUZ var27 = WorldMapArea.method5840(var22, (byte)61);
                        var27.method11753(var25, -457597272);
                        classUZ.method11727(var25, 1865024924);
                        classUZ.method11727(var23, 2146296988);
                        classUZ.method11727(var22, 2057987562);
                        var13 = var27;
                     }
                  }

                  if (var13 != null) {
                     if (var2 == -1439422728) {
                        throw new IllegalStateException();
                     }

                     var20 = classIK.method6218(2106329293 * client.field962, -452033647 * client.field884, client.field986 * -2126074583, (byte)-62);
                     classUZ var35 = classWN.method12606(var13, var20, (byte)1);
                     classUZ var36 = classIZ.method6340(classUZ.field6431, var35, -1635324929);
                     float var37 = (float)Math.atan2(
                        classLV.method7154(var36, classUZ.field6432, (byte)-53), classLV.method7154(classUZ.field6431, var35, (byte)-52)
                     );
                     int var38 = (int)(var37 / (Math.PI * 2) * 2048.0) & 2047;
                     int var39 = var38 + 64;
                     int var26 = (var39 & 2047) / 128;
                     Friend.method10155(classKK.field3781, "", 60, var26, 0, 0, 0, false, var33, -324749371);
                     classUZ.method11727(var20, 2025799119);
                     classUZ.method11727(var35, 2056660213);
                     classUZ.method11727(var36, 1690364234);
                     classUZ.method11727(var13, 1846231364);
                  }
               }
            }
         }
      } catch (RuntimeException var28) {
         throw classEG.newRunException(var28, "qx.fy(" + ')');
      }
   }
}
