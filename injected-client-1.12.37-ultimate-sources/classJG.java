import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("jg")
public class classJG {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field3150 = 8388607;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field3149 = 32768;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field3151 = 8388607;
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   public static final int field3152 = 256;

   @ObfuscatedSignature(descriptor = "(ILbl;ZI)I")
   @ObfuscatedName("ah")
   static int method6367(int var0, classBL var1, boolean var2, int var3) {
      try {
         if (1927 != var0) {
            if (var3 == 159285469) {
               throw new IllegalStateException();
            }

            if (var0 != 2927) {
               if (var0 == 1928) {
                  classLW var22;
                  if (var2) {
                     if (var3 == 159285469) {
                        throw new IllegalStateException();
                     }

                     var22 = classSZ.field6110;
                  } else {
                     var22 = classDL.field1558;
                  }

                  classLW var13 = var22;
                  int var16 = classBB.field323[(classDY.field1679 -= 120041229) * -324749371];
                  if (var16 >= 1) {
                     if (var3 == 159285469) {
                        throw new IllegalStateException();
                     }

                     if (var16 <= 10) {
                        classDG var18 = new classDG(var16, var13.field4329 * -1163656551, var13.field4260 * 63131743, var13.field4319 * 2073671441);
                        classBB.field332.add(var18);
                        return 1;
                     }

                     if (var3 == 159285469) {
                        throw new IllegalStateException();
                     }
                  }

                  throw new RuntimeException();
               }

               if (2928 == var0) {
                  classDY.field1679 -= 360123687;
                  int var12 = classBB.field323[-324749371 * classDY.field1679];
                  int var15 = classBB.field323[classDY.field1679 * -324749371 + 1];
                  int var17 = classBB.field323[2 + -324749371 * classDY.field1679];
                  if (var17 >= 1) {
                     if (var17 <= 10) {
                        classLW var19 = classLY.method7378(classWK.field6691, var12, var15, (byte)2);
                        if (null == var19) {
                           if (var3 == 159285469) {
                              throw new IllegalStateException();
                           }

                           throw new RuntimeException();
                        }

                        classDG var21 = new classDG(var17, var12, var15, 2073671441 * var19.field4319);
                        classBB.field332.add(var21);
                        return 1;
                     }

                     if (var3 == 159285469) {
                        throw new IllegalStateException();
                     }
                  }

                  throw new RuntimeException();
               }

               if (2929 == var0) {
                  if (var3 == 159285469) {
                     throw new IllegalStateException();
                  }

                  Object[] var11 = classSY.method10721(1906084921);
                  classDY.field1679 -= 360123687;
                  int var14 = classBB.field323[-324749371 * classDY.field1679];
                  int var6 = classBB.field323[classDY.field1679 * -324749371 + 1];
                  int var7 = classBB.field323[2 + -324749371 * classDY.field1679];
                  int var8 = -1;
                  classLW var9 = classLY.method7378(classWK.field6691, var6, var7, (byte)-92);
                  if (null != var9) {
                     var8 = var9.field4319 * 2073671441;
                     classPF.method8856(var6, var7, var8, var14, var11, (byte)-11);
                     return 1;
                  }

                  throw new RuntimeException();
               }

               return 2;
            }

            if (var3 == 159285469) {
               throw new IllegalStateException();
            }
         }

         if (1733013719 * classBB.field324 >= 10) {
            if (var3 == 159285469) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            classLW var4;
            if (var0 >= 2000) {
               if (var3 == 159285469) {
                  throw new IllegalStateException();
               }

               var4 = classLY.method7375(classWK.field6691, classBB.field323[(classDY.field1679 -= 120041229) * -324749371], (byte)85);
            } else {
               classLW var10000;
               if (var2) {
                  if (var3 == 159285469) {
                     throw new IllegalStateException();
                  }

                  var10000 = classSZ.field6110;
               } else {
                  var10000 = classDL.field1558;
               }

               var4 = var10000;
            }

            if (var4.field4246 == null) {
               if (var3 == 159285469) {
                  throw new IllegalStateException();
               } else {
                  return 0;
               }
            } else {
               classZR var5 = classZS.method14182(
                  classZS.method14180(
                     classUQ.method11465(var4, 1822305667).method14145(var4.field4246, (byte)2), 1733013719 * classBB.field324 + 1, -1460249679
                  ),
                  (byte)22
               );
               client.field823.method9658(var5, 1697206599);
               return 1;
            }
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "jg.ah(" + 41);
      }
   }

   classJG() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("af")
   public static boolean method6366(int var0, int var1) {
      try {
         boolean var10000;
         if (var0 == 18) {
            if (var1 >= -324749371) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "jg.af(" + ')');
      }
   }
}
