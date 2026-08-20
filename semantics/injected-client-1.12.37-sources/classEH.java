import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("eh")
public class classEH extends classRD {
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field1759 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("ad")
   static final int field1755 = 19;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field1756 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("an")
   public static final int field1757 = 22;
   @ToRemove(unused = "true")
   @ObfuscatedName("bn")
   public static final int field1760 = 128;
   @ObfuscatedName("as")
   public static short[][] field1762;
   @ToRemove(unused = "true")
   @ObfuscatedName("ch")
   static final int field1761 = 202;
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field1758 = 1;
   @ObfuscatedName("az")
   final boolean field1754;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lmo;Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ya")
   public static int method3891(classMO var0, Object var1, Object var2) {
      if (var0 == null) {
         var0.method7632(var1, var1);
      }

      return var0.method7628((classNM)var1, (classNM)var2, -956761337);
   }

   public classEH(boolean var1) {
      this.field1754 = var1;
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;I)I")
   @ObfuscatedName("az")
   int method3885(Buddy var1, Buddy var2, int var3) {
      try {
         if (-760305529 * var1.field5669 != client.field827 * 1311484143 || -760305529 * var2.field5669 != 1311484143 * client.field827) {
            return classRD.method9942(this, var1, var2, 1819123354);
         } else if (var3 != -337435821) {
            throw new IllegalStateException();
         } else {
            return this.field1754 ? 1145202131 * var1.field5670 - 1145202131 * var2.field5670 : 1145202131 * var2.field5670 - var1.field5670 * 1145202131;
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "eh.az(" + 41);
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method3885((Buddy)var1, (Buddy)var2, -337435821);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "eh.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;)I")
   @ObfuscatedName("ab")
   int method3886(Buddy var1, Buddy var2) {
      if (1763591106 * var1.field5669 == client.field827 * 901689432 && -43484980 * var2.field5669 == 312953962 * client.field827) {
         return this.field1754 ? -1622948779 * var1.field5670 - 1145202131 * var2.field5670 : 1145202131 * var2.field5670 - var1.field5670 * -1599641788;
      } else {
         return classRD.method9942(this, var1, var2, 2105728655);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("as")
   public int method3889(Object var1, Object var2) {
      return this.method3885((Buddy)var1, (Buddy)var2, -337435821);
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;)I")
   @ObfuscatedName("af")
   int method3887(Buddy var1, Buddy var2) {
      if (-760305529 * var1.field5669 == client.field827 * 523476633 && -760305529 * var2.field5669 == 1631949240 * client.field827) {
         return this.field1754 ? 1567039570 * var1.field5670 - 1145202131 * var2.field5670 : 1145202131 * var2.field5670 - var1.field5670 * 1145202131;
      } else {
         return classRD.method9942(this, var1, var2, 1890119796);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;)I")
   @ObfuscatedName("ae")
   int method3888(Buddy var1, Buddy var2) {
      if (-760305529 * var1.field5669 == client.field827 * 1311484143 && -760305529 * var2.field5669 == 1311484143 * client.field827) {
         return this.field1754 ? 1145202131 * var1.field5670 - 1145202131 * var2.field5670 : 1145202131 * var2.field5670 - var1.field5670 * 1145202131;
      } else {
         return classRD.method9942(this, var1, var2, 2121106288);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method3890(Object var1, Object var2) {
      return this.method3885((Buddy)var1, (Buddy)var2, -337435821);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("af")
   public static void method3892(int var0) {
      try {
         EvictingDualNodeHashTable.method6431(PlayerComposition.field4100);
         classRJ.method9993(PlayerComposition.field4103, (byte)40);
         PlayerComposition.field4101 = 0;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "eh.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Lcm;II[I[II)V")
   @ObfuscatedName("ae")
   static void method3893(World[] var0, int var1, int var2, int[] var3, int[] var4, int var5) {
      try {
         if (var1 < var2) {
            if (var5 >= -184159606) {
               throw new IllegalStateException();
            }

            int var6 = var1 - 1;
            int var7 = var2 + 1;
            int var8 = (var2 + var1) / 2;
            World var9 = var0[var8];
            var0[var8] = var0[var1];
            var0[var1] = var9;

            while (var6 < var7) {
               if (var5 >= -184159606) {
                  throw new IllegalStateException();
               }

               boolean var10 = true;

               do {
                  var7--;

                  for (int var11 = 0; var11 < 4; var11++) {
                     if (var5 >= -184159606) {
                        throw new IllegalStateException();
                     }

                     int var12;
                     int var13;
                     if (2 == var3[var11]) {
                        if (var5 >= -184159606) {
                           throw new IllegalStateException();
                        }

                        var12 = var0[var7].field1159 * -1690959211;
                        var13 = var9.field1159 * -1690959211;
                     } else if (var3[var11] == 1) {
                        if (var5 >= -184159606) {
                           throw new IllegalStateException();
                        }

                        var12 = 597852065 * var0[var7].field1161;
                        var13 = var9.field1161 * 597852065;
                        if (var12 == -1) {
                           if (var5 >= -184159606) {
                              return;
                           }

                           if (1 == var4[var11]) {
                              if (var5 >= -184159606) {
                                 throw new IllegalStateException();
                              }

                              var12 = 2001;
                           }
                        }

                        if (-1 == var13) {
                           if (var5 >= -184159606) {
                              throw new IllegalStateException();
                           }

                           if (var4[var11] == 1) {
                              var13 = 2001;
                           }
                        }
                     } else if (3 == var3[var11]) {
                        if (var5 >= -184159606) {
                           throw new IllegalStateException();
                        }

                        byte var10000;
                        if (var0[var7].method2482((byte)-108)) {
                           if (var5 >= -184159606) {
                              throw new IllegalStateException();
                           }

                           var10000 = 1;
                        } else {
                           var10000 = 0;
                        }

                        var12 = var10000;
                        if (var9.method2482((byte)-93)) {
                           if (var5 >= -184159606) {
                              return;
                           }

                           var10000 = 1;
                        } else {
                           var10000 = 0;
                        }

                        var13 = var10000;
                     } else {
                        var12 = var0[var7].field1162 * 851246551;
                        var13 = var9.field1162 * 851246551;
                     }

                     if (var13 != var12) {
                        if (var4[var11] == 1) {
                           if (var5 >= -184159606) {
                              return;
                           }

                           if (var12 > var13) {
                              if (var5 >= -184159606) {
                                 throw new IllegalStateException();
                              }
                              break;
                           }
                        }

                        if (var4[var11] == 0) {
                           if (var5 >= -184159606) {
                              throw new IllegalStateException();
                           }

                           if (var12 < var13) {
                              if (var5 >= -184159606) {
                                 throw new IllegalStateException();
                              }
                              break;
                           }
                        }

                        var10 = false;
                        break;
                     }

                     if (var5 >= -184159606) {
                        throw new IllegalStateException();
                     }

                     if (var11 == 3) {
                        if (var5 >= -184159606) {
                           throw new IllegalStateException();
                        }

                        var10 = false;
                     }
                  }
               } while (var10);

               if (var5 >= -184159606) {
                  throw new IllegalStateException();
               }

               var10 = true;

               do {
                  var6++;

                  for (int var16 = 0; var16 < 4; var16++) {
                     if (var5 >= -184159606) {
                        throw new IllegalStateException();
                     }

                     int var18;
                     int var19;
                     if (2 == var3[var16]) {
                        if (var5 >= -184159606) {
                           throw new IllegalStateException();
                        }

                        var18 = var0[var6].field1159 * -1690959211;
                        var19 = var9.field1159 * -1690959211;
                     } else if (1 == var3[var16]) {
                        if (var5 >= -184159606) {
                           throw new IllegalStateException();
                        }

                        var18 = 597852065 * var0[var6].field1161;
                        var19 = var9.field1161 * 597852065;
                        if (var18 == -1) {
                           if (var5 >= -184159606) {
                              throw new IllegalStateException();
                           }

                           if (var4[var16] == 1) {
                              if (var5 >= -184159606) {
                                 throw new IllegalStateException();
                              }

                              var18 = 2001;
                           }
                        }

                        if (-1 == var19) {
                           if (var5 >= -184159606) {
                              return;
                           }

                           if (var4[var16] == 1) {
                              if (var5 >= -184159606) {
                                 throw new IllegalStateException();
                              }

                              var19 = 2001;
                           }
                        }
                     } else if (3 == var3[var16]) {
                        if (var5 >= -184159606) {
                           throw new IllegalStateException();
                        }

                        byte var21;
                        if (var0[var6].method2482((byte)-117)) {
                           if (var5 >= -184159606) {
                              throw new IllegalStateException();
                           }

                           var21 = 1;
                        } else {
                           var21 = 0;
                        }

                        var18 = var21;
                        if (var9.method2482((byte)-5)) {
                           if (var5 >= -184159606) {
                              throw new IllegalStateException();
                           }

                           var21 = 1;
                        } else {
                           var21 = 0;
                        }

                        var19 = var21;
                     } else {
                        var18 = 851246551 * var0[var6].field1162;
                        var19 = var9.field1162 * 851246551;
                     }

                     if (var18 != var19) {
                        if (var4[var16] == 1) {
                           if (var5 >= -184159606) {
                              return;
                           }

                           if (var18 < var19) {
                              break;
                           }
                        }

                        if (var4[var16] == 0) {
                           if (var5 >= -184159606) {
                              throw new IllegalStateException();
                           }

                           if (var18 > var19) {
                              if (var5 >= -184159606) {
                                 return;
                              }
                              break;
                           }
                        }

                        var10 = false;
                        break;
                     }

                     if (var5 >= -184159606) {
                        throw new IllegalStateException();
                     }

                     if (3 == var16) {
                        if (var5 >= -184159606) {
                           throw new IllegalStateException();
                        }

                        var10 = false;
                     }
                  }
               } while (var10);

               if (var5 >= -184159606) {
                  throw new IllegalStateException();
               }

               if (var6 < var7) {
                  World var17 = var0[var6];
                  var0[var6] = var0[var7];
                  var0[var7] = var17;
               }
            }

            method3893(var0, var1, var7, var3, var4, -1081397767);
            method3893(var0, 1 + var7, var2, var3, var4, -2042841665);
         }
      } catch (RuntimeException var14) {
         throw classEG.newRunException(var14, "eh.ae(" + ')');
      }
   }
}
