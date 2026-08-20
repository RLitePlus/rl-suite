import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("lr")
public class classLR {
   @ToRemove(unused = "true")
   @ObfuscatedName("aa")
   static final int field4214 = 11;
   @ObfuscatedName("af")
   byte[] field4211;
   @ObfuscatedName("ae")
   int[] field4213;
   @ObfuscatedName("az")
   int[] field4212;
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   static final int field4215 = 7680;

   public classLR(byte[] var1) {
      int var2 = var1.length;
      this.field4212 = new int[var2];
      this.field4211 = var1;
      int[] var3 = new int[33];
      this.field4213 = new int[8];
      int var4 = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         byte var6 = var1[var5];
         if (var6 != 0) {
            int var7 = 1 << 32 - var6;
            int var8 = var3[var6];
            this.field4212[var5] = var8;
            int var9;
            if ((var8 & var7) != 0) {
               var9 = var3[var6 - 1];
            } else {
               var9 = var8 | var7;

               for (int var10 = var6 - 1; var10 >= 1; var10--) {
                  int var11 = var3[var10];
                  if (var11 != var8) {
                     break;
                  }

                  int var12 = 1 << 32 - var10;
                  if (0 != (var11 & var12)) {
                     var3[var10] = var3[var10 - 1];
                     break;
                  }

                  var3[var10] = var11 | var12;
               }
            }

            var3[var6] = var9;

            for (int var15 = var6 + 1; var15 <= 32; var15++) {
               if (var8 == var3[var15]) {
                  var3[var15] = var9;
               }
            }

            int var16 = 0;

            for (int var17 = 0; var17 < var6; var17++) {
               int var18 = Integer.MIN_VALUE >>> var17;
               if (0 != (var8 & var18)) {
                  if (0 == this.field4213[var16]) {
                     this.field4213[var16] = var4;
                  }

                  var16 = this.field4213[var16];
               } else {
                  var16++;
               }

               if (var16 >= this.field4213.length) {
                  int[] var13 = new int[this.field4213.length * 2];

                  for (int var14 = 0; var14 < this.field4213.length; var14++) {
                     var13[var14] = this.field4213[var14];
                  }

                  this.field4213 = var13;
               }

               var18 >>>= 1;
            }

            this.field4213[var16] = ~var5;
            if (var16 >= var4) {
               var4 = var16 + 1;
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Llr;[BI[BIII)I")
   @ObfuscatedName("ub")
   public static int method7145(classLR var0, byte[] var1, int var2, byte[] var3, int var4, int var5, int var6) {
      if (var0 == null) {
         return var0.method7147(var1, var2, var1, var2, var2, var2);
      } else {
         try {
            if (0 == var5) {
               if (var6 == -655491627) {
                  throw new IllegalStateException();
               } else {
                  return 0;
               }
            } else {
               int var7 = 0;
               var5 += var4;
               int var8 = var2;

               while (true) {
                  byte var9 = var1[var8];
                  if (var9 < 0) {
                     var7 = var0.field4213[var7];
                  } else {
                     var7++;
                  }

                  int var10;
                  if ((var10 = var0.field4213[var7]) < 0) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }

                     var3[var4++] = (byte)(~var10);
                     if (var4 >= var5) {
                        if (var6 == -655491627) {
                           throw new IllegalStateException();
                        }
                        break;
                     }

                     var7 = 0;
                  }

                  if (0 != (var9 & 64)) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }

                     var7 = var0.field4213[var7];
                  } else {
                     var7++;
                  }

                  if ((var10 = var0.field4213[var7]) < 0) {
                     var3[var4++] = (byte)(~var10);
                     if (var4 >= var5) {
                        if (var6 == -655491627) {
                           throw new IllegalStateException();
                        }
                        break;
                     }

                     var7 = 0;
                  }

                  if (0 != (var9 & 32)) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }

                     var7 = var0.field4213[var7];
                  } else {
                     var7++;
                  }

                  if ((var10 = var0.field4213[var7]) < 0) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }

                     var3[var4++] = (byte)(~var10);
                     if (var4 >= var5) {
                        break;
                     }

                     var7 = 0;
                  }

                  if (0 != (var9 & 16)) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }

                     var7 = var0.field4213[var7];
                  } else {
                     var7++;
                  }

                  if ((var10 = var0.field4213[var7]) < 0) {
                     var3[var4++] = (byte)(~var10);
                     if (var4 >= var5) {
                        break;
                     }

                     var7 = 0;
                  }

                  if (0 != (var9 & 8)) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }

                     var7 = var0.field4213[var7];
                  } else {
                     var7++;
                  }

                  if ((var10 = var0.field4213[var7]) < 0) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }

                     var3[var4++] = (byte)(~var10);
                     if (var4 >= var5) {
                        break;
                     }

                     var7 = 0;
                  }

                  if (0 != (var9 & 4)) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }

                     var7 = var0.field4213[var7];
                  } else {
                     var7++;
                  }

                  if ((var10 = var0.field4213[var7]) < 0) {
                     var3[var4++] = (byte)(~var10);
                     if (var4 >= var5) {
                        if (var6 == -655491627) {
                           throw new IllegalStateException();
                        }
                        break;
                     }

                     var7 = 0;
                  }

                  if ((var9 & 2) != 0) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }

                     var7 = var0.field4213[var7];
                  } else {
                     var7++;
                  }

                  if ((var10 = var0.field4213[var7]) < 0) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }

                     var3[var4++] = (byte)(~var10);
                     if (var4 >= var5) {
                        if (var6 == -655491627) {
                           throw new IllegalStateException();
                        }
                        break;
                     }

                     var7 = 0;
                  }

                  if (0 != (var9 & 1)) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }

                     var7 = var0.field4213[var7];
                  } else {
                     var7++;
                  }

                  if ((var10 = var0.field4213[var7]) < 0) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }

                     var3[var4++] = (byte)(~var10);
                     if (var4 >= var5) {
                        if (var6 == -655491627) {
                           throw new IllegalStateException();
                        }
                        break;
                     }

                     var7 = 0;
                  }

                  var8++;
               }

               return var8 + 1 - var2;
            }
         } catch (RuntimeException var11) {
            throw classEG.newRunException(var11, "lr.af(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([BII[BII)I")
   @ObfuscatedName("az")
   int method7143(byte[] var1, int var2, int var3, byte[] var4, int var5, int var6) {
      try {
         int var7 = 0;
         int var8 = var5 << 3;

         for (int var16 = var3 + var2; var2 < var16; var2++) {
            int var9 = var1[var2] & 255;
            int var10 = this.field4212[var9];
            byte var11 = this.field4211[var9];
            if (var11 == 0) {
               if (var6 == 497504400) {
                  throw new IllegalStateException();
               }

               throw new RuntimeException("" + var9);
            }

            int var12 = var8 >> 3;
            int var13 = var8 & 7;
            int var17 = var7 & -var13 >> 31;
            int var14 = var12 + (var11 + var13 - 1 >> 3);
            var13 += 24;
            var4[var12] = (byte)(var7 = var17 | var10 >>> var13);
            if (var12 >= var14) {
               if (var6 == 497504400) {
                  throw new IllegalStateException();
               }
            } else {
               var12++;
               var13 -= 8;
               var4[var12] = (byte)(var7 = var10 >>> var13);
               if (var12 < var14) {
                  var12++;
                  var13 -= 8;
                  var4[var12] = (byte)(var7 = var10 >>> var13);
                  if (var12 >= var14) {
                     if (var6 == 497504400) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var12++;
                     var13 -= 8;
                     var4[var12] = (byte)(var7 = var10 >>> var13);
                     if (var12 >= var14) {
                        if (var6 == 497504400) {
                           throw new IllegalStateException();
                        }
                     } else {
                        var12++;
                        var13 -= 8;
                        var4[var12] = (byte)(var7 = var10 << -var13);
                     }
                  }
               }
            }

            var8 += var11;
         }

         return (7 + var8 >> 3) - var5;
      } catch (RuntimeException var15) {
         throw classEG.newRunException(var15, "lr.az(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llr;[BII[BI)I")
   @ObfuscatedName("ce")
   public static int method7144(classLR var0, byte[] var1, int var2, int var3, byte[] var4, int var5) {
      if (var0 == null) {
         return var0.method7143(var1, var2, var2, var1, var2, var2);
      } else {
         int var6 = 0;
         int var7 = var5 << 3;

         for (int var14 = var3 + var2; var2 < var14; var2++) {
            int var8 = var1[var2] & 255;
            int var9 = var0.field4212[var8];
            byte var10 = var0.field4211[var8];
            if (var10 == 0) {
               throw new RuntimeException("" + var8);
            }

            int var11 = var7 >> 3;
            int var12 = var7 & 7;
            int var15 = var6 & -var12 >> 31;
            int var13 = var11 + (var10 + var12 - 1 >> 3);
            var12 += 24;
            var4[var11] = (byte)(var6 = var15 | var9 >>> var12);
            if (var11 < var13) {
               var11++;
               var12 -= 8;
               var4[var11] = (byte)(var6 = var9 >>> var12);
               if (var11 < var13) {
                  var11++;
                  var12 -= 8;
                  var4[var11] = (byte)(var6 = var9 >>> var12);
                  if (var11 < var13) {
                     var11++;
                     var12 -= 8;
                     var4[var11] = (byte)(var6 = var9 >>> var12);
                     if (var11 < var13) {
                        var11++;
                        var12 -= 8;
                        var4[var11] = (byte)(var6 = var9 << -var12);
                     }
                  }
               }
            }

            var7 += var10;
         }

         return (7 + var7 >> 3) - var5;
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("ab")
   public static int method7142(int var0, byte var1) {
      try {
         return var0 >> 1 & 3;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "lr.ab(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llr;[BI[BII)I")
   @ObfuscatedName("ss")
   public static int method7146(classLR var0, byte[] var1, int var2, byte[] var3, int var4, int var5) {
      if (var0 == null) {
         var0.method7143(var1, var2, var2, var1, var2, var2);
      }

      if (0 == var5) {
         return 0;
      } else {
         int var6 = 0;
         var5 += var4;
         int var7 = var2;

         while (true) {
            byte var8 = var1[var7];
            if (var8 < 0) {
               var6 = var0.field4213[var6];
            } else {
               var6++;
            }

            int var9;
            if ((var9 = var0.field4213[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 64)) {
               var6 = var0.field4213[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.field4213[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 32)) {
               var6 = var0.field4213[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.field4213[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 16)) {
               var6 = var0.field4213[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.field4213[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 8)) {
               var6 = var0.field4213[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.field4213[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 4)) {
               var6 = var0.field4213[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.field4213[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if ((var8 & 2) != 0) {
               var6 = var0.field4213[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.field4213[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            if (0 != (var8 & 1)) {
               var6 = var0.field4213[var6];
            } else {
               var6++;
            }

            if ((var9 = var0.field4213[var6]) < 0) {
               var3[var4++] = (byte)(~var9);
               if (var4 >= var5) {
                  break;
               }

               var6 = 0;
            }

            var7++;
         }

         return var7 + 1 - var2;
      }
   }

   @ObfuscatedSignature(descriptor = "([BI[BIII)I")
   @ObfuscatedName("af")
   int method7147(byte[] var1, int var2, byte[] var3, int var4, int var5, int var6) {
      try {
         if (0 == var5) {
            if (var6 == -655491627) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            int var7 = 0;
            var5 += var4;
            int var8 = var2;

            while (true) {
               byte var9 = var1[var8];
               if (var9 < 0) {
                  var7 = this.field4213[var7];
               } else {
                  var7++;
               }

               int var10;
               if ((var10 = this.field4213[var7]) < 0) {
                  if (var6 == -655491627) {
                     throw new IllegalStateException();
                  }

                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if (0 != (var9 & 64)) {
                  if (var6 == -655491627) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field4213[var7];
               } else {
                  var7++;
               }

               if ((var10 = this.field4212[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if (0 != (var9 & 32)) {
                  if (var6 == -655491627) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field4212[var7];
               } else {
                  var7++;
               }

               if ((var10 = this.field4212[var7]) < 0) {
                  if (var6 == -655491627) {
                     throw new IllegalStateException();
                  }

                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     break;
                  }

                  var7 = 0;
               }

               if (0 != (var9 & 16)) {
                  if (var6 == -655491627) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field4212[var7];
               } else {
                  var7++;
               }

               if ((var10 = this.field4212[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     break;
                  }

                  var7 = 0;
               }

               if (0 != (var9 & 8)) {
                  if (var6 == -655491627) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field4212[var7];
               } else {
                  var7++;
               }

               if ((var10 = this.field4212[var7]) < 0) {
                  if (var6 == -655491627) {
                     throw new IllegalStateException();
                  }

                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     break;
                  }

                  var7 = 0;
               }

               if (0 != (var9 & 4)) {
                  if (var6 == -655491627) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field4212[var7];
               } else {
                  var7++;
               }

               if ((var10 = this.field4213[var7]) < 0) {
                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if ((var9 & 2) != 0) {
                  if (var6 == -655491627) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field4213[var7];
               } else {
                  var7++;
               }

               if ((var10 = this.field4212[var7]) < 0) {
                  if (var6 == -655491627) {
                     throw new IllegalStateException();
                  }

                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               if (0 != (var9 & 1)) {
                  if (var6 == -655491627) {
                     throw new IllegalStateException();
                  }

                  var7 = this.field4213[var7];
               } else {
                  var7++;
               }

               if ((var10 = this.field4212[var7]) < 0) {
                  if (var6 == -655491627) {
                     throw new IllegalStateException();
                  }

                  var3[var4++] = (byte)(~var10);
                  if (var4 >= var5) {
                     if (var6 == -655491627) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  var7 = 0;
               }

               var8++;
            }

            return var8 + 1 - var2;
         }
      } catch (RuntimeException var11) {
         throw classEG.newRunException(var11, "lr.af(" + 41);
      }
   }
}
