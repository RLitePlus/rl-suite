import java.util.Arrays;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ci")
public class classCI implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field742 = 31;
   @ObfuscatedName("az")
   boolean field744;
   @ToRemove(unused = "true")
   @ObfuscatedName("by")
   public static final int field743 = 68;

   @ObfuscatedSignature(descriptor = "(Lnm;Lnm;)I")
   @ObfuscatedName("af")
   int method1509(classNM var1, classNM var2) {
      if (var2.field4686 * 825289476 == 437735073 * var1.field4686) {
         return 0;
      } else {
         if (this.field744) {
            if (-906797091 * var1.field4686 == 1311484143 * client.field827) {
               return -1;
            }

            if (-658041769 * var2.field4686 == client.field827 * 1311484143) {
               return 1;
            }
         }

         return var1.field4686 * -906797091 < -906797091 * var2.field4686 ? -1 : 1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnm;Lnm;B)I")
   @ObfuscatedName("az")
   int method1510(classNM var1, classNM var2, byte var3) {
      try {
         if (var2.field4686 * -906797091 == -906797091 * var1.field4686) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            if (this.field744) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               if (-906797091 * var1.field4686 == 1311484143 * client.field827) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  return -1;
               }

               if (-906797091 * var2.field4686 == client.field827 * 1311484143) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  return 1;
               }
            }

            byte var10000;
            if (var1.field4686 * -906797091 < -906797091 * var2.field4686) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               var10000 = -1;
            } else {
               var10000 = 1;
            }

            return var10000;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ci.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldh;)V")
   @ObfuscatedName("yp")
   public static void method1505(Actor var0) {
      classQR.method9720(var0.field1465, -1054459121);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpz;)V")
   @ObfuscatedName("tv")
   public static void method1503(class468 var0) {
      int var1 = 1 + (var0.field5495.length << 1);
      var0.field5495 = Arrays.copyOf(var0.field5495, var1);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method1510((classNM)var1, (classNM)var2, (byte)-60);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ci.compare(" + 41);
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ci.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;IIIIIILgc;I)V")
   @ObfuscatedName("aq")
   static final void method1518(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, CollisionMap var7, int var8) {
      rl4 var9 = var0.isTopLevel() ? client.field1122 : client.field1124;
      if (var1 < classDI.field1511 * -791964067) {
         classDI.field1511 = var1 * 360312309;
      }

      Scene var10 = var9.field5790;
      classOM var11 = classOM.method8603(var4);
      int var12;
      int var13;
      if (var5 != 1 && var5 != 3) {
         var12 = var11.field4944 * -582306509;
         var13 = var11.field4924 * 402876423;
      } else {
         var12 = var11.field4924 * 402876423;
         var13 = var11.field4944 * -582306509;
      }

      int var14;
      int var15;
      if (var12 + var2 <= var10.field2145) {
         var14 = (var12 >> 1) + var2;
         var15 = (var12 + 1 >> 1) + var2;
      } else {
         var14 = var2;
         var15 = var2 + 1;
      }

      var14 += var10.field2147;
      var15 += var10.field2147;
      int var16;
      int var17;
      if (var13 + var3 <= var10.field2111) {
         var16 = (var13 >> 1) + var3;
         var17 = (var13 + 1 >> 1) + var3;
      } else {
         var16 = var3;
         var17 = var3 + 1;
      }

      var16 += var10.field2147;
      var17 += var10.field2147;
      int var18 = var2 + var10.field2147;
      int var19 = var3 + var10.field2147;
      boolean var20 = var2 > 0 && var2 < 103 && var3 > 0 && var3 < 103;
      int[][] var21 = var9.field5799[var1];
      int var22 = var21[var14][var17] + var21[var14][var16] + var21[var15][var16] + var21[var15][var17] >> 2;
      int var23 = (var18 << 7) + (var12 << 6);
      int var24 = (var19 << 7) + (var13 << 6);
      boolean var25 = var11.field4923 * 1663954033 != 0 && var2 >= 0 && var2 < 128 && var3 >= 0 && var3 < 128;
      long var26 = client.method2401(var1, var2, var3, 2, !var25, var4, var0.field1699 * 2140889407);
      int var28 = var6 + (var5 << 6);
      if (var11.field4956 * 1291058669 == 1) {
         var28 += 256;
      }

      if (var11.method8598()) {
         client.method1867(var9, var1, var2, var3, var11, var5);
      }

      if (var6 == 22) {
         boolean var29 = !client.field885 || var11.field4923 * 1663954033 != 0 || var11.field4946 * -2040437663 == 1 || var11.field4933;
         if (!var29) {
            if (!client.$assertionsDisabled && !client.field885) {
               throw new AssertionError();
            }

            int var30 = var10.field2017[var1][var18][var19] & 32767;
            if (var30 > 0) {
               classOW var31 = var9.method10100(var30 - 1);
               if (var31.method8810() < 0 && var31.method8818() == 16711935) {
                  var29 = true;
               }
            }
         }

         if (var29) {
            Object var54;
            if (var11.field4951 * -1542230501 == -1 && var11.field4930 == null) {
               var54 = client.method2267(var0.scene, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
            } else {
               DynamicObject var67 = new DynamicObject(var0, var4, 22, var5, var1, var2, var3, var11.field4951 * -1542230501, var11.field4964, null);
               var67.field1667 = var10;
               var54 = var67;
            }

            var10.method4518(var1, var2, var3, var22, (Renderable)var54, var26, var28);
            if (var11.field4946 * -2040437663 == 1 && var7 != null && var20) {
               var7.method5385(var2, var3);
            }
         }
      } else if (var6 >= 12) {
         Object var40;
         if (var11.field4951 * -1542230501 == -1 && var11.field4930 == null) {
            var40 = client.method2267(var0.scene, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var55 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var11.field4951 * -1542230501, var11.field4964, null);
            var55.field1667 = var10;
            var40 = var55;
         }

         var10.method4513(var1, var2, var3, var22, 1, 1, (Renderable)var40, 0, var26, var28);
         if (var6 <= 17 && var6 != 13 && var1 > 0) {
            var9.field5776[var1][var18][var19] = var9.field5776[var1][var18][var19] | 2340;
         }

         if (var11.field4946 * -2040437663 != 0 && var7 != null && var20) {
            var7.method5386(var2, var3, var12, var13, var11.field4933);
         }
      } else if (var6 == 10 || var6 == 11) {
         Object var53;
         if (var11.field4951 * -1542230501 == -1 && var11.field4930 == null) {
            var53 = client.method2267(var0.scene, var10, var11, var21, var6, var5, 10, var5, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var65 = new DynamicObject(var0, var4, 10, var5, var1, var2, var3, var11.field4951 * -1542230501, var11.field4964, null);
            var65.field1667 = var10;
            var53 = var65;
         }

         if (var53 != null && var10.method4513(var1, var2, var3, var22, var12, var13, (Renderable)var53, var6 == 11 ? 256 : 0, var26, var28) && var11.field4938
            )
          {
            int var66 = 15;
            if (var53 instanceof Model) {
               Model var73 = (Model)var53;
               var73.calculateBoundsCylinder();
               var66 = var73.getXYZMag() / 4;
               if (var66 > 30) {
                  var66 = 30;
               }
            }

            for (int var74 = 0; var74 <= var12; var74++) {
               for (int var78 = 0; var78 <= var13; var78++) {
                  if (var66 > var9.field5777[var1][var74 + var18][var78 + var19]) {
                     var9.field5777[var1][var74 + var18][var78 + var19] = (byte)var66;
                  }
               }
            }
         }

         if (var11.field4946 * -2040437663 != 0 && var7 != null && var20) {
            var7.method5386(var2, var3, var12, var13, var11.field4947);
         }
      } else if (var6 == 0) {
         Object var41;
         if (var11.field4951 * -1542230501 == -1 && var11.field4930 == null) {
            var41 = client.method2267(var0.scene, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var56 = new DynamicObject(var0, var4, 0, var5, var1, var2, var3, var11.field4951 * -1542230501, var11.field4964, null);
            var56.field1667 = var10;
            var41 = var56;
         }

         var10.method4524(var1, var2, var3, var22, (Renderable)var41, null, 1 << var5, 0, var26, var28);
         if (var5 == 0) {
            if (var11.field4938) {
               var9.field5777[var1][var18][var19] = 50;
               var9.field5777[var1][var18][var19 + 1] = 50;
            }

            if (var11.field4950) {
               var9.field5776[var1][var18][var19] = var9.field5776[var1][var18][var19] | 585;
            }
         } else if (var5 == 1) {
            if (var11.field4938) {
               var9.field5777[var1][var18][var19 + 1] = 50;
               var9.field5777[var1][var18 + 1][var19 + 1] = 50;
            }

            if (var11.field4950) {
               var9.field5776[var1][var18][var19 + 1] = var9.field5776[var1][var18][var19 + 1] | 1170;
            }
         } else if (var5 == 2) {
            if (var11.field4938) {
               var9.field5777[var1][var18 + 1][var19] = 50;
               var9.field5777[var1][var18 + 1][var19 + 1] = 50;
            }

            if (var11.field4950) {
               var9.field5776[var1][var18 + 1][var19] = var9.field5776[var1][var18 + 1][var19] | 585;
            }
         } else if (var5 == 3) {
            if (var11.field4938) {
               var9.field5777[var1][var18][var19] = 50;
               var9.field5777[var1][var18 + 1][var19] = 50;
            }

            if (var11.field4950) {
               var9.field5776[var1][var18][var19] = var9.field5776[var1][var18][var19] | 1170;
            }
         }

         if (var11.field4946 * -2040437663 != 0 && var7 != null && var20) {
            var7.method5384(var2, var3, var6, var5, var11.field4947);
         }

         if (var11.field4927 * -1659674841 != 16) {
            var10.method4515(var1, var2, var3, var11.field4927 * -1659674841 + 1);
         }
      } else if (var6 == 1 || var6 == 3) {
         Object var52;
         if (var11.field4951 * -1542230501 == -1 && var11.field4930 == null) {
            var52 = client.method2267(var0.scene, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var64 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var11.field4951 * -1542230501, var11.field4964, null);
            var64.field1667 = var10;
            var52 = var64;
         }

         var10.method4524(var1, var2, var3, var22, (Renderable)var52, null, 16 << var5, 0, var26, var28);
         if (var11.field4938) {
            if (var5 == 0) {
               var9.field5777[var1][var18][var19 + 1] = 50;
            } else if (var5 == 1) {
               var9.field5777[var1][var18 + 1][var19 + 1] = 50;
            } else if (var5 == 2) {
               var9.field5777[var1][var18 + 1][var19] = 50;
            } else if (var5 == 3) {
               var9.field5777[var1][var18][var19] = 50;
            }
         }

         if (var11.field4946 * -2040437663 != 0 && var7 != null && var20) {
            var7.method5384(var2, var3, var6, var5, var11.field4947);
         }
      } else if (var6 == 2) {
         int var42 = var5 + 1 & 3;
         Object var57;
         Object var68;
         if (var11.field4951 * -1542230501 == -1 && var11.field4930 == null) {
            var68 = var11.method8599(2, var5 + 4, var21, var23, var22, var24);
            var57 = var11.method8599(2, var42, var21, var23, var22, var24);
         } else {
            DynamicObject var32 = new DynamicObject(var0, var4, 2, var5 + 4, var1, var2, var3, var11.field4951 * -1542230501, var11.field4964, null);
            DynamicObject var33 = new DynamicObject(var0, var4, 2, var42, var1, var2, var3, var11.field4951 * -1542230501, var11.field4964, null);
            var32.field1667 = var33.field1667 = var10;
            var57 = var32;
            var68 = var33;
         }

         var10.method4524(var1, var2, var3, var22, (Renderable)var68, (Renderable)var57, 1 << var5, 1 << var42, var26, var28);
         if (var11.field4950) {
            if (var5 == 0) {
               var9.field5776[var1][var18][var19] = var9.field5776[var1][var18][var19] | 585;
               var9.field5776[var1][var18][var19 + 1] = var9.field5776[var1][var18][var19 + 1] | 1170;
            } else if (var5 == 1) {
               var9.field5776[var1][var18][var19 + 1] = var9.field5776[var1][var18][var19 + 1] | 1170;
               var9.field5776[var1][var18 + 1][var19] = var9.field5776[var1][var18 + 1][var19] | 585;
            } else if (var5 == 2) {
               var9.field5776[var1][var18 + 1][var19] = var9.field5776[var1][var18 + 1][var19] | 585;
               var9.field5776[var1][var18][var19] = var9.field5776[var1][var18][var19] | 1170;
            } else if (var5 == 3) {
               var9.field5776[var1][var18][var19] = var9.field5776[var1][var18][var19] | 1170;
               var9.field5776[var1][var18][var19] = var9.field5776[var1][var18][var19] | 585;
            }
         }

         if (var11.field4946 * -2040437663 != 0 && var7 != null && var20) {
            var7.method5384(var2, var3, var6, var5, var11.field4947);
         }

         if (var11.field4927 * -1659674841 != 16) {
            var10.method4515(var1, var2, var3, var11.field4927 * -1659674841 + 1);
         }
      } else if (var6 == 9) {
         Object var43;
         if (var11.field4951 * -1542230501 == -1 && var11.field4930 == null) {
            var43 = client.method2267(var0.scene, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var58 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var11.field4951 * -1542230501, var11.field4964, null);
            var58.field1667 = var10;
            var43 = var58;
         }

         var10.method4513(var1, var2, var3, var22, 1, 1, (Renderable)var43, 0, var26, var28);
         if (var11.field4946 * -2040437663 != 0 && var7 != null && var20) {
            var7.method5386(var2, var3, var12, var13, var11.field4947);
         }

         if (var11.field4927 * -1659674841 != 16) {
            var10.method4515(var1, var2, var3, var11.field4927 * -1659674841 / 2 + 1);
         }
      } else if (var6 == 4) {
         Object var44;
         if (var11.field4951 * -1542230501 == -1 && var11.field4930 == null) {
            var44 = client.method2267(var0.scene, var10, var11, var21, var6, var5, var6, var5, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var59 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var11.field4951 * -1542230501, var11.field4964, null);
            var59.field1667 = var10;
            var44 = var59;
         }

         var10.method4504(var1, var2, var3, var22, (Renderable)var44, null, 1 << var5, 0, classDI.field1507[var5], classDI.field1508[var5], 0, 0, var26, var28);
      } else if (var6 == 5) {
         int var45 = 16;
         BoundaryObject var60 = var10.method4501(var1, var2, var3);
         if (var60 != null) {
            var45 = classOM.method8603(var60.getId()).field4927 * -1659674841;
         }

         var45++;
         Object var69;
         if (var11.field4951 * -1542230501 == -1 && var11.field4930 == null) {
            var69 = client.method2267(var0.scene, var10, var11, var21, var6, var5, 4, var5, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var75 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var11.field4951 * -1542230501, var11.field4964, null);
            var75.field1667 = var10;
            var69 = var75;
         }

         var10.method4504(
            var1,
            var2,
            var3,
            var22,
            (Renderable)var69,
            null,
            1 << var5,
            0,
            var45 * classDI.field1507[var5],
            var45 * classDI.field1508[var5],
            0,
            0,
            var26,
            var28
         );
      } else if (var6 == 6) {
         int var47 = 8;
         GameObject var61 = var10.method4519(var1, var2, var3);
         if (var61 != null) {
            var47 = classOM.method8603(var61.getId()).field4927 * -1659674841 / 2;
         }

         var47++;
         Object var70;
         if (var11.field4951 * -1542230501 == -1 && var11.field4930 == null) {
            var70 = client.method2267(var0.scene, var10, var11, var21, var6, var5, 4, var5 + 4, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var76 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, var11.field4951 * -1542230501, var11.field4964, null);
            var76.field1667 = var10;
            var70 = var76;
         }

         var10.method4504(
            var1, var2, var3, var22, (Renderable)var70, null, 256, var5, var47 * classDI.field1509[var5], var47 * classDI.field1510[var5], 0, 0, var26, var28
         );
      } else if (var6 == 7) {
         int var49 = var5 + 2 & 3;
         Object var62;
         if (var11.field4951 * -1542230501 == -1 && var11.field4930 == null) {
            var62 = client.method2267(var0.scene, var10, var11, var21, var6, var5, 4, var49 + 4, var1, var2, var3, var23, var22, var24);
         } else {
            DynamicObject var71 = new DynamicObject(var0, var4, 4, var49 + 4, var1, var2, var3, var11.field4951 * -1542230501, var11.field4964, null);
            var71.field1667 = var10;
            var62 = var71;
         }

         var10.method4504(var1, var2, var3, var22, (Renderable)var62, null, 256, var49, classDI.field1509[var49], classDI.field1510[var49], 0, 0, var26, var28);
      } else if (var6 == 8) {
         int var50 = 8;
         GameObject var63 = var10.method4519(var1, var2, var3);
         if (var63 != null) {
            var50 = classOM.method8603(var63.getId()).field4927 * -1659674841 / 2;
         }

         var50++;
         int var72 = var5 + 2 & 3;
         Object var77;
         Object var79;
         if (var11.field4951 * -1542230501 == -1 && var11.field4930 == null) {
            var77 = var11.method8599(4, var5 + 4, var21, var23, var22, var24);
            var79 = var11.method8599(4, var72 + 4, var21, var23, var22, var24);
         } else {
            DynamicObject var34 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, var11.field4951 * -1542230501, var11.field4964, null);
            DynamicObject var35 = new DynamicObject(var0, var4, 4, var72 + 4, var1, var2, var3, var11.field4951 * -1542230501, var11.field4964, null);
            var34.field1667 = var35.field1667 = var10;
            var77 = var34;
            var79 = var35;
         }

         var10.method4504(
            var1,
            var2,
            var3,
            var22,
            (Renderable)var77,
            (Renderable)var79,
            256,
            var5,
            var50 * classDI.field1509[var5],
            var50 * classDI.field1510[var5],
            classDI.field1509[var72],
            classDI.field1510[var72],
            var26,
            var28
         );
      } else {
         client.field1026.debug("unknown loc type {}", var6);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnm;Lnm;)I")
   @ObfuscatedName("ae")
   int method1511(classNM var1, classNM var2) {
      if (var2.field4686 * 1684346448 == -906797091 * var1.field4686) {
         return 0;
      } else {
         if (this.field744) {
            if (-208785858 * var1.field4686 == 1311484143 * client.field827) {
               return -1;
            }

            if (105879339 * var2.field4686 == client.field827 * 1311484143) {
               return 1;
            }
         }

         return var1.field4686 * -1029759094 < -906797091 * var2.field4686 ? -1 : 1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnm;Lnm;)I")
   @ObfuscatedName("ab")
   int method1512(classNM var1, classNM var2) {
      if (var2.field4686 * -906797091 == -906797091 * var1.field4686) {
         return 0;
      } else {
         if (this.field744) {
            if (-906797091 * var1.field4686 == 1311484143 * client.field827) {
               return -1;
            }

            if (-906797091 * var2.field4686 == client.field827 * 1311484143) {
               return 1;
            }
         }

         return var1.field4686 * -906797091 < -906797091 * var2.field4686 ? -1 : 1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lnm;Lnm;)I")
   @ObfuscatedName("ag")
   int method1513(classNM var1, classNM var2) {
      if (var2.field4686 * -906797091 == -906797091 * var1.field4686) {
         return 0;
      } else {
         if (this.field744) {
            if (-906797091 * var1.field4686 == 1311484143 * client.field827) {
               return -1;
            }

            if (-906797091 * var2.field4686 == client.field827 * 1311484143) {
               return 1;
            }
         }

         return var1.field4686 * -906797091 < -906797091 * var2.field4686 ? -1 : 1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("as")
   public int method1514(Object var1, Object var2) {
      return this.method1510((classNM)var1, (classNM)var2, (byte)-80);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqi;Ljava/lang/String;)Ljava/lang/Boolean;")
   @ObfuscatedName("qe")
   public static Boolean method1504(classQI var0, String var1) {
      return (Boolean)var0.field5547.get(var1);
   }

   @ObfuscatedSignature(descriptor = "(IIIIIII)V")
   @ObfuscatedName("au")
   static void method1506(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         client.field1069 = var0 * -1232180137;
         classDX.field1662 = -339051177 * var1;
         classDU.field1633 = -2072039747 * var2;
         classDB.field1375 = var3 * 1321524983;
         classYJ.field6994 = 1289423847 * var4;
         World.field1165 = -1152046927 * var5;
         classLS.field4219 = (var3 + var0) / 2 * -28035055;
         classKT.field4022 = 2097852467 * ((var4 + var1) / 2);
         classHQ.field2868 = (var5 + var2) / 2 * -1040762067;
         classBY.field614 = (var3 - var0) / 2 * -551665805;
         classDK.field1542 = 15977997 * ((var4 - var1) / 2);
         FloorDecoration.field1811 = (var5 - var2) / 2 * -1577570207;
         classVI.field6513 = Math.abs(classBY.field614 * -331219525) * 255059385;
         classJI.field3164 = Math.abs(classDK.field1542 * 348139717) * 1863713019;
         classEV.field1943 = Math.abs(-1947307103 * FloorDecoration.field1811) * -36859613;
         classFO.field2345.method11728(var3 - var0, var4 - var1, var5 - var2, 1764530601);
         classFO.field2345.method11747(-114514689);
         classFO.field2346 = true;
      } catch (RuntimeException var7) {
         throw classEG.method3884(var7, "ci.au(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public boolean method1516(Object var1) {
      return super.equals(var1);
   }

   classCI() {
   }

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("ar")
   static void method1507(int var0, byte var1) {
      client.method2222(var0);

      try {
         if (var0 != 56 && var0 != 57) {
            classJB.method6345(10, -1192966987);
            classAC.method326(9, 2007366360);
         } else {
            classJB.method6345(11, -1192966987);
         }

         if (var0 == -3) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            WorldEntity.method10624(classKK.field3708, classKK.field3653, classKK.field3811, (byte)-26);
         } else if (var0 == -2) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            WorldEntity.method10624(classKK.field3737, classKK.field3920, classKK.field3789, (byte)-61);
         } else if (var0 == -1) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            WorldEntity.method10624(classKK.field3699, classKK.field3687, classKK.field3660, (byte)-5);
         } else if (var0 == 3) {
            classAC.method326(3, 2073840155);
            classBF.field388 = -945703767;
         } else if (var0 == 4) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            classAC.method326(14, 2021207162);
            classBF.field387 = 0;
         } else if (var0 == 5) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            classBF.field388 = -1891407534;
            WorldEntity.method10624(classKK.field3664, classKK.field3665, classKK.field3666, (byte)-55);
         } else if (68 == var0) {
            if (var1 <= 0) {
               return;
            }

            if (!client.field831) {
               if (var1 <= 0) {
                  return;
               }

               client.field831 = true;
               classAC.method325((byte)11);
               return;
            }

            WorldEntity.method10624(classKK.field3667, classKK.field3668, classKK.field3611, (byte)-60);
         } else {
            if (!client.field890) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               if (var0 == 6) {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  WorldEntity.method10624(classKK.field3667, classKK.field3668, classKK.field3611, (byte)-66);
                  return;
               }
            }

            if (var0 == 7) {
               WorldEntity.method10624(classKK.field3670, classKK.field3671, classKK.field3748, (byte)-16);
            } else if (var0 == 8) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               WorldEntity.method10624(classKK.field3673, classKK.field3674, classKK.field3675, (byte)-8);
            } else if (9 == var0) {
               WorldEntity.method10624(classKK.field3676, classKK.field3704, classKK.field3678, (byte)-103);
            } else if (10 == var0) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               WorldEntity.method10624(classKK.field3835, classKK.field3680, classKK.field3681, (byte)-41);
            } else if (11 == var0) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               WorldEntity.method10624(classKK.field3624, classKK.field3683, classKK.field3684, (byte)-16);
            } else if (12 == var0) {
               if (var1 <= 0) {
                  return;
               }

               WorldEntity.method10624(classKK.field3685, classKK.field3686, classKK.field3738, (byte)-89);
               classAC.method326(34, 2039091207);
            } else if (13 == var0) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               WorldEntity.method10624(classKK.field3661, classKK.field3915, classKK.field3690, (byte)-121);
            } else if (14 == var0) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               WorldEntity.method10624(classKK.field3691, classKK.field3692, classKK.field3731, (byte)-49);
            } else if (var0 == 16) {
               if (var1 <= 0) {
                  return;
               }

               WorldEntity.method10624(classKK.field3694, classKK.field3695, classKK.field3696, (byte)-113);
               classAC.method326(33, 2001585971);
            } else if (var0 == 17) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               WorldEntity.method10624(classKK.field3808, classKK.field3698, classKK.field3905, (byte)-113);
            } else if (var0 == 18) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               classAC.method326(14, 2006625909);
               classBF.field387 = 1431935615;
            } else if (19 == var0) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               WorldEntity.method10624(classKK.field3703, classKK.field3614, classKK.field3705, (byte)-121);
            } else if (var0 == 20) {
               if (var1 <= 0) {
                  return;
               }

               WorldEntity.method10624(classKK.field3627, classKK.field3707, classKK.field3659, (byte)-6);
            } else if (22 == var0) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               WorldEntity.method10624(classKK.field3729, classKK.field3914, classKK.field3810, (byte)-115);
            } else if (var0 == 23) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               WorldEntity.method10624(classKK.field3712, classKK.field3693, classKK.field3714, (byte)-4);
            } else if (24 == var0) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               WorldEntity.method10624(classKK.field3715, classKK.field3716, classKK.field3717, (byte)-20);
            } else if (25 == var0) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               WorldEntity.method10624(classKK.field3718, classKK.field3719, classKK.field3720, (byte)-81);
            } else if (var0 == 26) {
               WorldEntity.method10624(classKK.field3721, classKK.field3722, classKK.field3723, (byte)-75);
            } else if (var0 == 27) {
               WorldEntity.method10624(classKK.field3724, classKK.field3725, classKK.field3726, (byte)-50);
            } else if (31 == var0) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               WorldEntity.method10624(classKK.field3733, classKK.field3791, classKK.field3848, (byte)-38);
            } else if (var0 == 32) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               classAC.method326(14, 2012149136);
               classBF.field387 = -1431096066;
            } else if (37 == var0) {
               if (var1 <= 0) {
                  return;
               }

               WorldEntity.method10624(classKK.field3739, classKK.field3740, classKK.field3828, (byte)-20);
            } else if (var0 == 38) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               WorldEntity.method10624(classKK.field3742, classKK.field3743, classKK.field3744, (byte)-56);
            } else if (var0 == 74) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               WorldEntity.method10624(classKK.field3873, classKK.field3876, classKK.field3746, (byte)-4);
            } else if (55 == var0) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               classAC.method326(8, 2063350143);
            } else if (var0 == 56) {
               if (var1 <= 0) {
                  return;
               }

               WorldEntity.method10624(classKK.field3752, classKK.field3753, classKK.field3754, (byte)-9);
            } else if (var0 == 57) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               WorldEntity.method10624(classKK.field3755, classKK.field3756, classKK.field3757, (byte)-1);
            } else if (var0 == 61) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               WorldEntity.method10624("", "Please enter your date of birth (DD/MM/YYYY)", "", (byte)-63);
               classAC.method326(7, 2133821696);
            } else if (var0 == 62) {
               WorldEntity.method10624(classKK.field3758, classKK.field3761, classKK.field3760, (byte)-85);
            } else if (63 == var0) {
               WorldEntity.method10624(classKK.field3833, classKK.field3711, classKK.field3764, (byte)-38);
            } else {
               if (var0 != 65) {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (67 != var0) {
                     if (var0 == 71) {
                        if (var1 <= 0) {
                           throw new IllegalStateException();
                        }

                        classAC.method326(7, 2031839193);
                        WorldEntity.method10624(
                           "There was a problem updating your DOB.",
                           "Please try again later. If the problem ",
                           "persists, please contact Jagex Support.",
                           (byte)-9
                        );
                        return;
                     } else if (73 == var0) {
                        if (var1 <= 0) {
                           throw new IllegalStateException();
                        }

                        classAC.method326(6, 2031150934);
                        WorldEntity.method10624(classKK.field3672, classKK.field3773, classKK.field3863, (byte)-101);
                        return;
                     } else {
                        if (var0 == 72) {
                           if (var1 <= 0) {
                              throw new IllegalStateException();
                           }

                           classAC.method326(32, 2093167256);
                        } else {
                           WorldEntity.method10624(classKK.field3652, classKK.field3734, classKK.field3770, (byte)-35);
                        }

                        return;
                     }
                  }

                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }
               }

               WorldEntity.method10624(classKK.field3765, classKK.field3766, classKK.field3767, (byte)-99);
            }
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "ci.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method1517(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ldz;ILfx;B)V")
   @ObfuscatedName("cp")
   static void method1508(WorldView var0, int var1, Model var2, byte var3) {
      try {
         short var4 = 512;
         float var5 = client.field982 * 1158148203 / 334.0F;
         float var6 = 1129651895 * client.field878 * 4.0F / var5;
         int var7 = Math.max(512, (int)(1400.0F - var6));
         int var8 = client.field962 * 2106329293 - (int)(classWW.method12631(var1, -518891120) * var7);
         int var9 = -2126074583 * client.field986;
         double var10 = classGP.method5548(var1, 1136716073) / 65536.0;
         int var12 = var9 - (int)(var10 * var7);
         long var13 = classRF.method9961(
            var0.field1710 * -483624883,
            classKY.method6608(var8, (byte)-1),
            classKY.method6608(var12, (byte)4),
            5,
            false,
            -1,
            var0.field1699 * 2140889407,
            (short)4429
         );
         Scene.method4477(var0.scene, -483624883 * var0.field1710, var8, var12, client.field884 * -452033647, 60, var2, var1, var13, false);
      } catch (RuntimeException var15) {
         throw classEG.method3884(var15, "ci.cp(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method1515(Object var1, Object var2) {
      return this.method1510((classNM)var1, (classNM)var2, (byte)-56);
   }
}
