import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("kn")
public class classKN {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   public static final int field3967 = 128;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field3968 = 2048;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field3970 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final int field3969 = 27;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   public static final int field3966 = 64;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field3965 = 0;

   classKN() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "(I)J")
   @ObfuscatedName("at")
   static long method6498(int var0) {
      try {
         return 1026637691757090767L * client.field961;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "kn.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ldz;Ldh;II)V")
   @ObfuscatedName("bq")
   static final void method6499(classDZ var0, classDH var1, int var2, int var3) {
      classDH.method3275(var0, var1, var2);

      try {
         if (var1.field1468) {
            if (var3 != -1128559099) {
               throw new IllegalStateException();
            }
         } else {
            int var8 = 677773095 * var1.field1496 - 1457033841 * var1.field1488 & 2047;
            if (var8 != 0) {
               byte var9 = -1;
               boolean var10 = true;
               var1.field1471 += -1813526965;
               byte var10000;
               if (var8 > 1024) {
                  if (var3 != -1128559099) {
                     throw new IllegalStateException();
                  }

                  var10000 = -1;
               } else {
                  var10000 = 1;
               }

               byte var11;
               boolean var12;
               label465: {
                  var11 = var10000;
                  var1.field1488 = var1.field1488 + -909895021 * var1.field1472 * var11 * 573632145;
                  var12 = true;
                  if (var8 >= -909895021 * var1.field1472) {
                     if (var3 != -1128559099) {
                        throw new IllegalStateException();
                     }

                     if (var8 <= 2048 - var1.field1472 * -909895021) {
                        break label465;
                     }

                     if (var3 != -1128559099) {
                        classDH.method3271(var0, var1, var2);
                        return;
                     }
                  }

                  var1.field1488 = -1169438953 * var1.field1496;
                  var12 = false;
               }

               if (-909895021 * var1.field1472 > 0) {
                  if (var3 != -1128559099) {
                     throw new IllegalStateException();
                  }

                  label454:
                  if (var1.method3083(-1521983044) == var1.field1436 * 1457308725) {
                     if (var3 != -1128559099) {
                        throw new IllegalStateException();
                     }

                     if (var1.field1471 * 2075939683 <= 25) {
                        if (!var12) {
                           break label454;
                        }

                        if (var3 != -1128559099) {
                           throw new IllegalStateException();
                        }
                     }

                     if (-1 == var11) {
                        if (var3 != -1128559099) {
                           throw new IllegalStateException();
                        }

                        if (1201940803 * var1.field1444 != -1) {
                           if (var3 != -1128559099) {
                              classDH.method3271(var0, var1, var2);
                              return;
                           }

                           var1.method3087(1201940803 * var1.field1444, -2066439426);
                           break label454;
                        }
                     }

                     if (1 == var11) {
                        if (var3 != -1128559099) {
                           throw new IllegalStateException();
                        }

                        if (var1.field1457 * -47525405 != -1) {
                           if (var3 != -1128559099) {
                              throw new IllegalStateException();
                           }

                           var1.method3087(var1.field1457 * -47525405, -1088755749);
                           break label454;
                        }
                     }

                     var1.method3087(var1.field1445 * -1657575887, -1009977976);
                  }
               }

               var1.field1488 = 573632145 * (var1.field1488 * 1457033841 & 2047);
            } else {
               if (var1.field1475) {
                  var1.method3241((byte)-34);
                  var1.field1475 = false;
               }

               var1.field1471 = 0;
            }
         }

         classKB.method6454(var0, var1, (byte)5);
         classDH.method3271(var0, var1, var2);
      } catch (RuntimeException var14) {
         throw classEG.method3884(var14, "kn.bq(" + ')');
      }
   }

   static {
      Math.sqrt(8192.0);
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/Object;")
   @ObfuscatedName("cc")
   static Object method6500(int var0, int var1) {
      try {
         if (-1 == var0) {
            if (var1 == 16777215) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return classAB.method308((classYY)classOF.method8404(classYY.method13782((byte)54), var0, 635415869), 1465889783);
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "kn.cc(" + ')');
      }
   }
}
