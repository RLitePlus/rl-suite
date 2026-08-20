import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yg")
public final class classYG {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field6981 = 16;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field6984 = 50;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6980 = 23;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field6979 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6982 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field6983 = 6;
   @ObfuscatedSignature(descriptor = "Lyq;")
   @ObfuscatedName("ac")
   static classYQ field6978 = new classYQ();
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field6985 = 4096;

   @ObfuscatedSignature(descriptor = "(Lyq;)V")
   @ObfuscatedName("ax")
   static void method13354(classYQ var0) {
      var0.field7065 = 0;

      for (int var1 = 0; var1 < 256; var1++) {
         if (var0.field7029[var1]) {
            var0.field7042[var0.field7065 * 1989436113] = (byte)var1;
            var0.field7065 += -621726159;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([BI[BII)I")
   @ObfuscatedName("az")
   public static int method13331(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized (field6978) {
         field6978.field7066 = var2;
         field6978.field7037 = var4 * -1683646107;
         field6978.field7067 = var0;
         field6978.field7038 = 0;
         field6978.field7052 = var1 * 1234607077;
         field6978.field7062 = 0;
         field6978.field7059 = 0;
         field6978.field7055 = 0;
         field6978.field7058 = 0;
         method13341(field6978);
         var1 -= field6978.field7052 * -124638739;
         field6978.field7066 = null;
         field6978.field7067 = null;
         return var1;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lyq;)V")
   @ObfuscatedName("af")
   static void method13336(classYQ var0) {
      byte var2 = var0.field7051;
      int var3 = var0.field7054 * 1031374819;
      int var4 = var0.field7053 * -624505433;
      int var5 = var0.field7057 * 1323825317;
      int[] var6 = classYQ.field7068;
      int var7 = var0.field7060 * 485359187;
      byte[] var8 = var0.field7067;
      int var9 = var0.field7038 * -770368799;
      int var10 = var0.field7052 * -124638739;
      int var11 = var10;
      int var12 = var0.field7063 * 2100469473 + 1;

      label114:
      while (true) {
         if (var3 > 0) {
            while (true) {
               if (var10 == 0) {
                  break label114;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label114;
                  }

                  var8[var9] = var2;
                  var9++;
                  var10--;
                  break;
               }

               var8[var9] = var2;
               var3--;
               var9++;
               var10--;
            }
         }

         while (var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            var4++;
            if (var1 != var5) {
               var5 = var1;
               if (var10 == 0) {
                  var3 = 1;
                  break label114;
               }

               var8[var9] = var2;
               var9++;
               var10--;
            } else {
               if (var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  if (++var4 != var12) {
                     if (var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        if (++var4 != var12) {
                           if (var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              var4++;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              var4++;
                           }
                        }
                     }
                  }
                  continue label114;
               }

               if (var10 == 0) {
                  var3 = 1;
                  break label114;
               }

               var8[var9] = var2;
               var9++;
               var10--;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.field7058 * 1871876607;
      var0.field7058 += (var11 - var10) * -316051969;
      if (var0.field7058 * 1871876607 < var13) {
      }

      var0.field7051 = var2;
      var0.field7054 = var3 * 707261899;
      var0.field7053 = var4 * 1550649879;
      var0.field7057 = var5 * 1490497325;
      classYQ.field7068 = var6;
      var0.field7060 = var7 * -4786725;
      var0.field7067 = var8;
      var0.field7038 = var9 * -22435551;
      var0.field7052 = var10 * 1234607077;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyq;)B")
   @ObfuscatedName("ar")
   static byte method13342(classYQ var0) {
      return (byte)method13350(8, var0);
   }

   @ObfuscatedSignature(descriptor = "(Lyq;)B")
   @ObfuscatedName("ag")
   static byte method13346(classYQ var0) {
      return (byte)method13350(1, var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[I[I[BIII)V")
   @ObfuscatedName("bc")
   static void method13358(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      for (int var8 = var4; var8 <= var5; var8++) {
         for (int var9 = 0; var9 < var6; var9++) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               var7++;
            }
         }
      }

      for (int var11 = 0; var11 < 23; var11++) {
         var1[var11] = 0;
      }

      for (int var12 = 0; var12 < var6; var12++) {
         var1[var3[var12] + 1]++;
      }

      for (int var13 = 1; var13 < 23; var13++) {
         var1[var13] += var1[var13 - 1];
      }

      for (int var14 = 0; var14 < 23; var14++) {
         var0[var14] = 0;
      }

      int var10 = 0;

      for (int var15 = var4; var15 <= var5; var15++) {
         var10 += var1[var15 + 1] - var1[var15];
         var0[var15] = var10 - 1;
         var10 <<= 1;
      }

      for (int var16 = var4 + 1; var16 <= var5; var16++) {
         var1[var16] = (var0[var16 - 1] + 1 << 1) - var1[var16];
      }
   }

   @ObfuscatedSignature(descriptor = "(ILyq;)I")
   @ObfuscatedName("as")
   static int method13350(int var0, classYQ var1) {
      while (var1.field7062 * 800258251 < var0) {
         var1.field7059 = (var1.field7059 * -2122275965 << 8 | var1.field7066[var1.field7037 * 1283715181] & 255) * 1098777387;
         var1.field7062 += -562206952;
         var1.field7037 += -1683646107;
         var1.field7055 += 1209151759;
         if (var1.field7055 * 1714593263 == 0) {
         }
      }

      int var2 = var1.field7059 * -2122275965 >> var1.field7062 * 800258251 - var0 & (1 << var0) - 1;
      var1.field7062 -= var0 * -1144017693;
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyq;)B")
   @ObfuscatedName("av")
   static byte method13347(classYQ var0) {
      return (byte)method13350(1, var0);
   }

   @ObfuscatedSignature(descriptor = "(Lyq;)B")
   @ObfuscatedName("ab")
   static byte method13343(classYQ var0) {
      return (byte)method13350(8, var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyq;)V")
   @ObfuscatedName("ah")
   static void method13355(classYQ var0) {
      var0.field7065 = 0;

      for (int var1 = 0; var1 < 256; var1++) {
         if (var0.field7029[var1]) {
            var0.field7042[var0.field7065 * 1989436113] = (byte)var1;
            var0.field7065 += -621726159;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BI[BII)I")
   @ObfuscatedName("aa")
   public static int method13332(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized (field6978) {
         field6978.field7066 = var2;
         field6978.field7037 = var4 * -1683646107;
         field6978.field7067 = var0;
         field6978.field7038 = 0;
         field6978.field7052 = var1 * 32499539;
         field6978.field7062 = 0;
         field6978.field7059 = 0;
         field6978.field7055 = 0;
         field6978.field7058 = 0;
         method13341(field6978);
         var1 -= field6978.field7052 * -124638739;
         field6978.field7066 = null;
         field6978.field7067 = null;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BI[BII)I")
   @ObfuscatedName("al")
   public static int method13333(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized (field6978) {
         field6978.field7066 = var2;
         field6978.field7037 = var4 * -1683646107;
         field6978.field7067 = var0;
         field6978.field7038 = 0;
         field6978.field7052 = var1 * 1234607077;
         field6978.field7062 = 0;
         field6978.field7059 = 0;
         field6978.field7055 = 0;
         field6978.field7058 = 0;
         method13341(field6978);
         var1 -= field6978.field7052 * -124638739;
         field6978.field7066 = null;
         field6978.field7067 = null;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BI[BII)I")
   @ObfuscatedName("aj")
   public static int method13334(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized (field6978) {
         field6978.field7066 = var2;
         field6978.field7037 = var4 * -1683646107;
         field6978.field7067 = var0;
         field6978.field7038 = 0;
         field6978.field7052 = var1 * 1234607077;
         field6978.field7062 = 0;
         field6978.field7059 = 0;
         field6978.field7055 = 0;
         field6978.field7058 = 0;
         method13341(field6978);
         var1 -= field6978.field7052 * -124638739;
         field6978.field7066 = null;
         field6978.field7067 = null;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyq;)V")
   @ObfuscatedName("ay")
   static void method13337(classYQ var0) {
      byte var2 = var0.field7051;
      int var3 = var0.field7054 * 1031374819;
      int var4 = var0.field7053 * -624505433;
      int var5 = var0.field7057 * 1323825317;
      int[] var6 = classYQ.field7068;
      int var7 = var0.field7060 * 485359187;
      byte[] var8 = var0.field7067;
      int var9 = var0.field7038 * -770368799;
      int var10 = var0.field7052 * -124638739;
      int var11 = var10;
      int var12 = var0.field7063 * 2100469473 + 1;

      label106:
      while (true) {
         if (var3 > 0) {
            while (true) {
               if (var10 == 0) {
                  break label106;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label106;
                  }

                  var8[var9] = var2;
                  var9++;
                  var10--;
                  break;
               }

               var8[var9] = var2;
               var3--;
               var9++;
               var10--;
            }
         }

         while (var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            var4++;
            if (var1 != var5) {
               var5 = var1;
               if (var10 == 0) {
                  var3 = 1;
                  break label106;
               }

               var8[var9] = var2;
               var9++;
               var10--;
            } else {
               if (var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  if (++var4 != var12) {
                     if (var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        if (++var4 != var12) {
                           if (var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              var4++;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              var4++;
                           }
                        }
                     }
                  }
                  continue label106;
               }

               if (var10 == 0) {
                  var3 = 1;
                  break label106;
               }

               var8[var9] = var2;
               var9++;
               var10--;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.field7058 * 1871876607;
      var0.field7058 += (var11 - var10) * -316051969;
      if (var0.field7058 * 1871876607 < var13) {
      }

      var0.field7051 = var2;
      var0.field7054 = var3 * 707261899;
      var0.field7053 = var4 * 1550649879;
      var0.field7057 = var5 * 1490497325;
      classYQ.field7068 = var6;
      var0.field7060 = var7 * -4786725;
      var0.field7067 = var8;
      var0.field7038 = var9 * -22435551;
      var0.field7052 = var10 * 1234607077;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyq;)V")
   @ObfuscatedName("aq")
   static void method13338(classYQ var0) {
      byte var2 = var0.field7051;
      int var3 = var0.field7054 * 1031374819;
      int var4 = var0.field7053 * -624505433;
      int var5 = var0.field7057 * 1323825317;
      int[] var6 = classYQ.field7068;
      int var7 = var0.field7060 * 485359187;
      byte[] var8 = var0.field7067;
      int var9 = var0.field7038 * -770368799;
      int var10 = var0.field7052 * -124638739;
      int var11 = var10;
      int var12 = var0.field7063 * 2100469473 + 1;

      label104:
      while (true) {
         if (var3 > 0) {
            while (true) {
               if (var10 == 0) {
                  break label104;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label104;
                  }

                  var8[var9] = var2;
                  var9++;
                  var10--;
                  break;
               }

               var8[var9] = var2;
               var3--;
               var9++;
               var10--;
            }
         }

         while (var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            var4++;
            if (var1 != var5) {
               var5 = var1;
               if (var10 == 0) {
                  var3 = 1;
                  break label104;
               }

               var8[var9] = var2;
               var9++;
               var10--;
            } else {
               if (var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  if (++var4 != var12) {
                     if (var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        if (++var4 != var12) {
                           if (var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              var4++;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              var4++;
                           }
                        }
                     }
                  }
                  continue label104;
               }

               if (var10 == 0) {
                  var3 = 1;
                  break label104;
               }

               var8[var9] = var2;
               var9++;
               var10--;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.field7058 * 1871876607;
      var0.field7058 += (var11 - var10) * -316051969;
      if (var0.field7058 * 1871876607 < var13) {
      }

      var0.field7051 = var2;
      var0.field7054 = var3 * 707261899;
      var0.field7053 = var4 * 1550649879;
      var0.field7057 = var5 * 1490497325;
      classYQ.field7068 = var6;
      var0.field7060 = var7 * -4786725;
      var0.field7067 = var8;
      var0.field7038 = var9 * -22435551;
      var0.field7052 = var10 * 1234607077;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyq;)V")
   @ObfuscatedName("ad")
   static void method13339(classYQ var0) {
      boolean var4 = false;
      int var5 = 0;
      boolean var6 = false;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      byte var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      byte var20 = 0;
      byte var21 = 0;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.field7056 = -71543157;
      if (classYQ.field7068 == null) {
         classYQ.field7068 = new int[var0.field7056 * 830998496];
      }

      boolean var26 = true;

      while (var26) {
         byte var1 = method13343(var0);
         if (var1 == 23) {
            return;
         }

         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13346(var0);
         if (var1 != 0) {
         }

         var0.field7061 = 0;
         var1 = method13343(var0);
         var0.field7061 = (var0.field7061 * -919103419 << 8 | var1 & 255) * -902579571;
         var1 = method13343(var0);
         var0.field7061 = (var0.field7061 * -919103419 << 8 | var1 & 255) * -902579571;
         var1 = method13343(var0);
         var0.field7061 = (var0.field7061 * -919103419 << 8 | var1 & 255) * -902579571;

         for (int var56 = 0; var56 < 16; var56++) {
            var1 = method13346(var0);
            if (var1 == 1) {
               var0.field7048[var56] = true;
            } else {
               var0.field7048[var56] = false;
            }
         }

         for (int var57 = 0; var57 < 256; var57++) {
            var0.field7029[var57] = false;
         }

         for (int var58 = 0; var58 < 16; var58++) {
            if (var0.field7048[var58]) {
               for (int var67 = 0; var67 < 16; var67++) {
                  var1 = method13346(var0);
                  if (var1 == 1) {
                     var0.field7029[var58 * 16 + var67] = true;
                  }
               }
            }
         }

         method13354(var0);
         var7 = var0.field7065 * 1989436113 + 2;
         var8 = method13350(3, var0);
         var9 = method13350(15, var0);

         for (int var59 = 0; var59 < var9; var59++) {
            var5 = 0;

            while (true) {
               var1 = method13346(var0);
               if (var1 == 0) {
                  var0.field7036[var59] = (byte)var5;
                  break;
               }

               var5++;
            }
         }

         byte[] var27 = new byte[6];
         int var29 = 0;

         while (var29 < var8) {
            var27[var29] = var29++;
         }

         for (int var60 = 0; var60 < var9; var60++) {
            var29 = var0.field7036[var60];

            byte var28;
            for (var28 = var27[var29]; var29 > 0; var29--) {
               var27[var29] = var27[var29 - 1];
            }

            var27[0] = var28;
            var0.field7035[var60] = var28;
         }

         for (int var69 = 0; var69 < var8; var69++) {
            var17 = method13350(5, var0);

            for (int var61 = 0; var61 < var7; var61++) {
               while (true) {
                  var1 = method13346(var0);
                  if (var1 == 0) {
                     var0.field7046[var69][var61] = (byte)var17;
                     break;
                  }

                  var1 = method13346(var0);
                  if (var1 == 0) {
                     var17++;
                  } else {
                     var17--;
                  }
               }
            }
         }

         for (int var70 = 0; var70 < var8; var70++) {
            byte var2 = 32;
            byte var3 = 0;

            for (int var62 = 0; var62 < var7; var62++) {
               if (var0.field7046[var70][var62] > var3) {
                  var3 = var0.field7046[var70][var62];
               }

               if (var0.field7046[var70][var62] < var2) {
                  var2 = var0.field7046[var70][var62];
               }
            }

            method13359(var0.field7047[var70], var0.field7033[var70], var0.field7031[var70], var0.field7046[var70], var2, var3, var7);
            var0.field7050[var70] = var2;
         }

         var10 = var0.field7065 * 1989436113 + 1;
         var11 = -1;
         var12 = 0;

         for (int var63 = 0; var63 <= 255; var63++) {
            var0.field7039[var63] = 0;
         }

         var29 = 4095;

         for (int var96 = 15; var96 >= 0; var96--) {
            for (int var98 = 15; var98 >= 0; var98--) {
               var0.field7044[var29] = (byte)(var96 * 16 + var98);
               var29--;
            }

            var0.field7045[var96] = var29 + 1;
         }

         var14 = 0;
         if (var12 == 0) {
            var11++;
            var12 = 50;
            var21 = var0.field7035[var11];
            var22 = var0.field7050[var21];
            var23 = var0.field7047[var21];
            var25 = var0.field7031[var21];
            var24 = var0.field7033[var21];
         }

         var12--;
         var18 = var22;
         var19 = method13350(var22, var0);

         while (var19 > var23[var18]) {
            var18++;
            var20 = method13346(var0);
            var19 = var19 << 1 | var20;
         }

         var13 = var25[var19 - var24[var18]];

         while (var13 != var10) {
            if (var13 != 0 && var13 != 1) {
               int var33 = var13 - 1;
               if (var33 < 16) {
                  int var103 = var0.field7045[0];

                  for (var1 = var0.field7044[var103 + var33]; var33 > 3; var33 -= 4) {
                     int var34 = var103 + var33;
                     var0.field7044[var34] = var0.field7044[var34 - 1];
                     var0.field7044[var34 - 1] = var0.field7044[var34 - 2];
                     var0.field7044[var34 - 2] = var0.field7044[var34 - 3];
                     var0.field7044[var34 - 3] = var0.field7044[var34 - 4];
                  }

                  while (var33 > 0) {
                     var0.field7044[var103 + var33] = var0.field7044[var103 + var33 - 1];
                     var33--;
                  }

                  var0.field7044[var103] = var1;
               } else {
                  int var31 = var33 / 16;
                  int var32 = var33 % 16;
                  int var30 = var0.field7045[var31] + var32;

                  for (var1 = var0.field7044[var30]; var30 > var0.field7045[var31]; var30--) {
                     var0.field7044[var30] = var0.field7044[var30 - 1];
                  }

                  var0.field7045[var31]++;

                  while (var31 > 0) {
                     var0.field7045[var31]--;
                     var0.field7044[var0.field7045[var31]] = var0.field7044[var0.field7045[var31 - 1] + 16 - 1];
                     var31--;
                  }

                  var0.field7045[0]--;
                  var0.field7044[var0.field7045[0]] = var1;
                  if (var0.field7045[0] == 0) {
                     var29 = 4095;

                     for (int var97 = 15; var97 >= 0; var97--) {
                        for (int var99 = 15; var99 >= 0; var99--) {
                           var0.field7044[var29] = var0.field7044[var0.field7045[var97] + var99];
                           var29--;
                        }

                        var0.field7045[var97] = var29 + 1;
                     }
                  }
               }

               var0.field7039[var0.field7042[var1 & 255] & 255]++;
               classYQ.field7068[var14] = var0.field7042[var1 & 255] & 255;
               var14++;
               if (var12 == 0) {
                  var11++;
                  var12 = 50;
                  var21 = var0.field7035[var11];
                  var22 = var0.field7050[var21];
                  var23 = var0.field7047[var21];
                  var25 = var0.field7031[var21];
                  var24 = var0.field7033[var21];
               }

               var12--;
               var18 = var22;
               var19 = method13350(var22, var0);

               while (var19 > var23[var18]) {
                  var18++;
                  var20 = method13346(var0);
                  var19 = var19 << 1 | var20;
               }

               var13 = var25[var19 - var24[var18]];
            } else {
               var15 = -1;
               var16 = 1;

               do {
                  if (var13 == 0) {
                     var15 += 1 * var16;
                  } else if (var13 == 1) {
                     var15 += 2 * var16;
                  }

                  var16 *= 2;
                  if (var12 == 0) {
                     var11++;
                     var12 = 50;
                     var21 = var0.field7035[var11];
                     var22 = var0.field7050[var21];
                     var23 = var0.field7047[var21];
                     var25 = var0.field7031[var21];
                     var24 = var0.field7033[var21];
                  }

                  var12--;
                  var18 = var22;
                  var19 = method13350(var22, var0);

                  while (var19 > var23[var18]) {
                     var18++;
                     var20 = method13346(var0);
                     var19 = var19 << 1 | var20;
                  }

                  var13 = var25[var19 - var24[var18]];
               } while (var13 == 0 || var13 == 1);

               var15++;
               var1 = var0.field7042[var0.field7044[var0.field7045[0]] & 255];

               for (var0.field7039[var1 & 255] = var0.field7039[var1 & 255] + var15; var15 > 0; var15--) {
                  classYQ.field7068[var14] = var1 & 255;
                  var14++;
               }
            }
         }

         var0.field7054 = 0;
         var0.field7051 = 0;
         var0.field7040[0] = 0;

         for (int var64 = 1; var64 <= 256; var64++) {
            var0.field7040[var64] = var0.field7039[var64 - 1];
         }

         for (int var65 = 1; var65 <= 256; var65++) {
            var0.field7040[var65] = var0.field7040[var65] + var0.field7040[var65 - 1];
         }

         for (int var66 = 0; var66 < var14; var66++) {
            var1 = (byte)(classYQ.field7068[var66] & 0xFF);
            classYQ.field7068[var0.field7040[var1 & 255]] = classYQ.field7068[var0.field7040[var1 & 255]] | var66 << 8;
            var0.field7040[var1 & 255]++;
         }

         var0.field7060 = (classYQ.field7068[var0.field7061 * -919103419] >> 8) * -4786725;
         var0.field7053 = 0;
         var0.field7060 = classYQ.field7068[var0.field7060 * 485359187] * -4786725;
         var0.field7057 = (byte)(var0.field7060 * 485359187 & 0xFF) * 1490497325;
         var0.field7060 = (var0.field7060 * 485359187 >> 8) * -4786725;
         var0.field7053 += 1550649879;
         var0.field7063 = var14 * -354212575;
         method13336(var0);
         if (var0.field7053 * -624505433 == var0.field7063 * 2100469473 + 1 && var0.field7054 * 1031374819 == 0) {
            var26 = true;
         } else {
            var26 = false;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyq;)V")
   @ObfuscatedName("ap")
   static void method13340(classYQ var0) {
      boolean var4 = false;
      int var5 = 0;
      boolean var6 = false;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      byte var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      byte var20 = 0;
      byte var21 = 0;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.field7056 = -71543157;
      if (classYQ.field7068 == null) {
         classYQ.field7068 = new int[var0.field7056 * 830998496];
      }

      boolean var26 = true;

      while (var26) {
         byte var1 = method13343(var0);
         if (var1 == 23) {
            return;
         }

         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13346(var0);
         if (var1 != 0) {
         }

         var0.field7061 = 0;
         var1 = method13343(var0);
         var0.field7061 = (var0.field7061 * -919103419 << 8 | var1 & 255) * -902579571;
         var1 = method13343(var0);
         var0.field7061 = (var0.field7061 * -919103419 << 8 | var1 & 255) * -902579571;
         var1 = method13343(var0);
         var0.field7061 = (var0.field7061 * -919103419 << 8 | var1 & 255) * -902579571;

         for (int var56 = 0; var56 < 16; var56++) {
            var1 = method13346(var0);
            if (var1 == 1) {
               var0.field7048[var56] = true;
            } else {
               var0.field7048[var56] = false;
            }
         }

         for (int var57 = 0; var57 < 256; var57++) {
            var0.field7029[var57] = false;
         }

         for (int var58 = 0; var58 < 16; var58++) {
            if (var0.field7048[var58]) {
               for (int var67 = 0; var67 < 16; var67++) {
                  var1 = method13346(var0);
                  if (var1 == 1) {
                     var0.field7029[var58 * 16 + var67] = true;
                  }
               }
            }
         }

         method13354(var0);
         var7 = var0.field7065 * 1989436113 + 2;
         var8 = method13350(3, var0);
         var9 = method13350(15, var0);

         for (int var59 = 0; var59 < var9; var59++) {
            var5 = 0;

            while (true) {
               var1 = method13346(var0);
               if (var1 == 0) {
                  var0.field7036[var59] = (byte)var5;
                  break;
               }

               var5++;
            }
         }

         byte[] var27 = new byte[6];
         int var29 = 0;

         while (var29 < var8) {
            var27[var29] = var29++;
         }

         for (int var60 = 0; var60 < var9; var60++) {
            var29 = var0.field7036[var60];

            byte var28;
            for (var28 = var27[var29]; var29 > 0; var29--) {
               var27[var29] = var27[var29 - 1];
            }

            var27[0] = var28;
            var0.field7035[var60] = var28;
         }

         for (int var69 = 0; var69 < var8; var69++) {
            var17 = method13350(5, var0);

            for (int var61 = 0; var61 < var7; var61++) {
               while (true) {
                  var1 = method13346(var0);
                  if (var1 == 0) {
                     var0.field7046[var69][var61] = (byte)var17;
                     break;
                  }

                  var1 = method13346(var0);
                  if (var1 == 0) {
                     var17++;
                  } else {
                     var17--;
                  }
               }
            }
         }

         for (int var70 = 0; var70 < var8; var70++) {
            byte var2 = 32;
            byte var3 = 0;

            for (int var62 = 0; var62 < var7; var62++) {
               if (var0.field7046[var70][var62] > var3) {
                  var3 = var0.field7046[var70][var62];
               }

               if (var0.field7046[var70][var62] < var2) {
                  var2 = var0.field7046[var70][var62];
               }
            }

            method13359(var0.field7047[var70], var0.field7033[var70], var0.field7031[var70], var0.field7046[var70], var2, var3, var7);
            var0.field7050[var70] = var2;
         }

         var10 = var0.field7065 * 1989436113 + 1;
         var11 = -1;
         var12 = 0;

         for (int var63 = 0; var63 <= 255; var63++) {
            var0.field7039[var63] = 0;
         }

         var29 = 4095;

         for (int var96 = 15; var96 >= 0; var96--) {
            for (int var98 = 15; var98 >= 0; var98--) {
               var0.field7044[var29] = (byte)(var96 * 16 + var98);
               var29--;
            }

            var0.field7045[var96] = var29 + 1;
         }

         var14 = 0;
         if (var12 == 0) {
            var11++;
            var12 = 50;
            var21 = var0.field7035[var11];
            var22 = var0.field7050[var21];
            var23 = var0.field7047[var21];
            var25 = var0.field7031[var21];
            var24 = var0.field7033[var21];
         }

         var12--;
         var18 = var22;
         var19 = method13350(var22, var0);

         while (var19 > var23[var18]) {
            var18++;
            var20 = method13346(var0);
            var19 = var19 << 1 | var20;
         }

         var13 = var25[var19 - var24[var18]];

         while (var13 != var10) {
            if (var13 != 0 && var13 != 1) {
               int var33 = var13 - 1;
               if (var33 < 16) {
                  int var103 = var0.field7045[0];

                  for (var1 = var0.field7044[var103 + var33]; var33 > 3; var33 -= 4) {
                     int var34 = var103 + var33;
                     var0.field7044[var34] = var0.field7044[var34 - 1];
                     var0.field7044[var34 - 1] = var0.field7044[var34 - 2];
                     var0.field7044[var34 - 2] = var0.field7044[var34 - 3];
                     var0.field7044[var34 - 3] = var0.field7044[var34 - 4];
                  }

                  while (var33 > 0) {
                     var0.field7044[var103 + var33] = var0.field7044[var103 + var33 - 1];
                     var33--;
                  }

                  var0.field7044[var103] = var1;
               } else {
                  int var31 = var33 / 16;
                  int var32 = var33 % 16;
                  int var30 = var0.field7045[var31] + var32;

                  for (var1 = var0.field7044[var30]; var30 > var0.field7045[var31]; var30--) {
                     var0.field7044[var30] = var0.field7044[var30 - 1];
                  }

                  var0.field7045[var31]++;

                  while (var31 > 0) {
                     var0.field7045[var31]--;
                     var0.field7044[var0.field7045[var31]] = var0.field7044[var0.field7045[var31 - 1] + 16 - 1];
                     var31--;
                  }

                  var0.field7045[0]--;
                  var0.field7044[var0.field7045[0]] = var1;
                  if (var0.field7045[0] == 0) {
                     var29 = 4095;

                     for (int var97 = 15; var97 >= 0; var97--) {
                        for (int var99 = 15; var99 >= 0; var99--) {
                           var0.field7044[var29] = var0.field7044[var0.field7045[var97] + var99];
                           var29--;
                        }

                        var0.field7045[var97] = var29 + 1;
                     }
                  }
               }

               var0.field7039[var0.field7042[var1 & 255] & 255]++;
               classYQ.field7068[var14] = var0.field7042[var1 & 255] & 255;
               var14++;
               if (var12 == 0) {
                  var11++;
                  var12 = 50;
                  var21 = var0.field7035[var11];
                  var22 = var0.field7050[var21];
                  var23 = var0.field7047[var21];
                  var25 = var0.field7031[var21];
                  var24 = var0.field7033[var21];
               }

               var12--;
               var18 = var22;
               var19 = method13350(var22, var0);

               while (var19 > var23[var18]) {
                  var18++;
                  var20 = method13346(var0);
                  var19 = var19 << 1 | var20;
               }

               var13 = var25[var19 - var24[var18]];
            } else {
               var15 = -1;
               var16 = 1;

               do {
                  if (var13 == 0) {
                     var15 += 1 * var16;
                  } else if (var13 == 1) {
                     var15 += 2 * var16;
                  }

                  var16 *= 2;
                  if (var12 == 0) {
                     var11++;
                     var12 = 50;
                     var21 = var0.field7035[var11];
                     var22 = var0.field7050[var21];
                     var23 = var0.field7047[var21];
                     var25 = var0.field7031[var21];
                     var24 = var0.field7033[var21];
                  }

                  var12--;
                  var18 = var22;
                  var19 = method13350(var22, var0);

                  while (var19 > var23[var18]) {
                     var18++;
                     var20 = method13346(var0);
                     var19 = var19 << 1 | var20;
                  }

                  var13 = var25[var19 - var24[var18]];
               } while (var13 == 0 || var13 == 1);

               var15++;
               var1 = var0.field7042[var0.field7044[var0.field7045[0]] & 255];

               for (var0.field7039[var1 & 255] = var0.field7039[var1 & 255] + var15; var15 > 0; var15--) {
                  classYQ.field7068[var14] = var1 & 255;
                  var14++;
               }
            }
         }

         var0.field7054 = 0;
         var0.field7051 = 0;
         var0.field7040[0] = 0;

         for (int var64 = 1; var64 <= 256; var64++) {
            var0.field7040[var64] = var0.field7039[var64 - 1];
         }

         for (int var65 = 1; var65 <= 256; var65++) {
            var0.field7040[var65] = var0.field7040[var65] + var0.field7040[var65 - 1];
         }

         for (int var66 = 0; var66 < var14; var66++) {
            var1 = (byte)(classYQ.field7068[var66] & 0xFF);
            classYQ.field7068[var0.field7040[var1 & 255]] = classYQ.field7068[var0.field7040[var1 & 255]] | var66 << 8;
            var0.field7040[var1 & 255]++;
         }

         var0.field7060 = (classYQ.field7068[var0.field7061 * -919103419] >> 8) * -4786725;
         var0.field7053 = 0;
         var0.field7060 = classYQ.field7068[var0.field7060 * 485359187] * -4786725;
         var0.field7057 = (byte)(var0.field7060 * 485359187 & 0xFF) * 1490497325;
         var0.field7060 = (var0.field7060 * 485359187 >> 8) * -4786725;
         var0.field7053 += 1550649879;
         var0.field7063 = var14 * -354212575;
         method13336(var0);
         if (var0.field7053 * -624505433 == var0.field7063 * 2100469473 + 1 && var0.field7054 * 1031374819 == 0) {
            var26 = true;
         } else {
            var26 = false;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyq;)B")
   @ObfuscatedName("au")
   static byte method13344(classYQ var0) {
      return (byte)method13350(8, var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyq;)B")
   @ObfuscatedName("ai")
   static byte method13345(classYQ var0) {
      return (byte)method13350(8, var0);
   }

   @ObfuscatedSignature(descriptor = "(Lyq;)V")
   @ObfuscatedName("ae")
   static void method13341(classYQ var0) {
      boolean var4 = false;
      int var5 = 0;
      boolean var6 = false;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      byte var16 = 0;
      int var17 = 0;
      int var18 = 0;
      int var19 = 0;
      byte var20 = 0;
      byte var21 = 0;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.field7056 = -71543157;
      if (classYQ.field7068 == null) {
         classYQ.field7068 = new int[var0.field7056 * 830998496];
      }

      boolean var26 = true;

      while (var26) {
         byte var1 = method13343(var0);
         if (var1 == 23) {
            return;
         }

         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13343(var0);
         var1 = method13346(var0);
         if (var1 != 0) {
         }

         var0.field7061 = 0;
         var1 = method13343(var0);
         var0.field7061 = (var0.field7061 * -919103419 << 8 | var1 & 255) * -902579571;
         var1 = method13343(var0);
         var0.field7061 = (var0.field7061 * -919103419 << 8 | var1 & 255) * -902579571;
         var1 = method13343(var0);
         var0.field7061 = (var0.field7061 * -919103419 << 8 | var1 & 255) * -902579571;

         for (int var56 = 0; var56 < 16; var56++) {
            var1 = method13346(var0);
            if (var1 == 1) {
               var0.field7048[var56] = true;
            } else {
               var0.field7048[var56] = false;
            }
         }

         for (int var57 = 0; var57 < 256; var57++) {
            var0.field7029[var57] = false;
         }

         for (int var58 = 0; var58 < 16; var58++) {
            if (var0.field7048[var58]) {
               for (int var67 = 0; var67 < 16; var67++) {
                  var1 = method13346(var0);
                  if (var1 == 1) {
                     var0.field7029[var58 * 16 + var67] = true;
                  }
               }
            }
         }

         method13354(var0);
         var7 = var0.field7065 * 1989436113 + 2;
         var8 = method13350(3, var0);
         var9 = method13350(15, var0);

         for (int var59 = 0; var59 < var9; var59++) {
            var5 = 0;

            while (true) {
               var1 = method13346(var0);
               if (var1 == 0) {
                  var0.field7036[var59] = (byte)var5;
                  break;
               }

               var5++;
            }
         }

         byte[] var27 = new byte[6];
         int var29 = 0;

         while (var29 < var8) {
            var27[var29] = var29++;
         }

         for (int var60 = 0; var60 < var9; var60++) {
            var29 = var0.field7036[var60];

            byte var28;
            for (var28 = var27[var29]; var29 > 0; var29--) {
               var27[var29] = var27[var29 - 1];
            }

            var27[0] = var28;
            var0.field7035[var60] = var28;
         }

         for (int var69 = 0; var69 < var8; var69++) {
            var17 = method13350(5, var0);

            for (int var61 = 0; var61 < var7; var61++) {
               while (true) {
                  var1 = method13346(var0);
                  if (var1 == 0) {
                     var0.field7046[var69][var61] = (byte)var17;
                     break;
                  }

                  var1 = method13346(var0);
                  if (var1 == 0) {
                     var17++;
                  } else {
                     var17--;
                  }
               }
            }
         }

         for (int var70 = 0; var70 < var8; var70++) {
            byte var2 = 32;
            byte var3 = 0;

            for (int var62 = 0; var62 < var7; var62++) {
               if (var0.field7046[var70][var62] > var3) {
                  var3 = var0.field7046[var70][var62];
               }

               if (var0.field7046[var70][var62] < var2) {
                  var2 = var0.field7046[var70][var62];
               }
            }

            method13359(var0.field7047[var70], var0.field7033[var70], var0.field7031[var70], var0.field7046[var70], var2, var3, var7);
            var0.field7050[var70] = var2;
         }

         var10 = var0.field7065 * 1989436113 + 1;
         var11 = -1;
         var12 = 0;

         for (int var63 = 0; var63 <= 255; var63++) {
            var0.field7039[var63] = 0;
         }

         var29 = 4095;

         for (int var96 = 15; var96 >= 0; var96--) {
            for (int var98 = 15; var98 >= 0; var98--) {
               var0.field7044[var29] = (byte)(var96 * 16 + var98);
               var29--;
            }

            var0.field7045[var96] = var29 + 1;
         }

         var14 = 0;
         if (var12 == 0) {
            var11++;
            var12 = 50;
            var21 = var0.field7035[var11];
            var22 = var0.field7050[var21];
            var23 = var0.field7047[var21];
            var25 = var0.field7031[var21];
            var24 = var0.field7033[var21];
         }

         var12--;
         var18 = var22;
         var19 = method13350(var22, var0);

         while (var19 > var23[var18]) {
            var18++;
            var20 = method13346(var0);
            var19 = var19 << 1 | var20;
         }

         var13 = var25[var19 - var24[var18]];

         while (var13 != var10) {
            if (var13 != 0 && var13 != 1) {
               int var33 = var13 - 1;
               if (var33 < 16) {
                  int var103 = var0.field7045[0];

                  for (var1 = var0.field7044[var103 + var33]; var33 > 3; var33 -= 4) {
                     int var34 = var103 + var33;
                     var0.field7044[var34] = var0.field7044[var34 - 1];
                     var0.field7044[var34 - 1] = var0.field7044[var34 - 2];
                     var0.field7044[var34 - 2] = var0.field7044[var34 - 3];
                     var0.field7044[var34 - 3] = var0.field7044[var34 - 4];
                  }

                  while (var33 > 0) {
                     var0.field7044[var103 + var33] = var0.field7044[var103 + var33 - 1];
                     var33--;
                  }

                  var0.field7044[var103] = var1;
               } else {
                  int var31 = var33 / 16;
                  int var32 = var33 % 16;
                  int var30 = var0.field7045[var31] + var32;

                  for (var1 = var0.field7044[var30]; var30 > var0.field7045[var31]; var30--) {
                     var0.field7044[var30] = var0.field7044[var30 - 1];
                  }

                  var0.field7045[var31]++;

                  while (var31 > 0) {
                     var0.field7045[var31]--;
                     var0.field7044[var0.field7045[var31]] = var0.field7044[var0.field7045[var31 - 1] + 16 - 1];
                     var31--;
                  }

                  var0.field7045[0]--;
                  var0.field7044[var0.field7045[0]] = var1;
                  if (var0.field7045[0] == 0) {
                     var29 = 4095;

                     for (int var97 = 15; var97 >= 0; var97--) {
                        for (int var99 = 15; var99 >= 0; var99--) {
                           var0.field7044[var29] = var0.field7044[var0.field7045[var97] + var99];
                           var29--;
                        }

                        var0.field7045[var97] = var29 + 1;
                     }
                  }
               }

               var0.field7039[var0.field7042[var1 & 255] & 255]++;
               classYQ.field7068[var14] = var0.field7042[var1 & 255] & 255;
               var14++;
               if (var12 == 0) {
                  var11++;
                  var12 = 50;
                  var21 = var0.field7035[var11];
                  var22 = var0.field7050[var21];
                  var23 = var0.field7047[var21];
                  var25 = var0.field7031[var21];
                  var24 = var0.field7033[var21];
               }

               var12--;
               var18 = var22;
               var19 = method13350(var22, var0);

               while (var19 > var23[var18]) {
                  var18++;
                  var20 = method13346(var0);
                  var19 = var19 << 1 | var20;
               }

               var13 = var25[var19 - var24[var18]];
            } else {
               var15 = -1;
               var16 = 1;

               do {
                  if (var13 == 0) {
                     var15 += 1 * var16;
                  } else if (var13 == 1) {
                     var15 += 2 * var16;
                  }

                  var16 *= 2;
                  if (var12 == 0) {
                     var11++;
                     var12 = 50;
                     var21 = var0.field7035[var11];
                     var22 = var0.field7050[var21];
                     var23 = var0.field7047[var21];
                     var25 = var0.field7031[var21];
                     var24 = var0.field7033[var21];
                  }

                  var12--;
                  var18 = var22;
                  var19 = method13350(var22, var0);

                  while (var19 > var23[var18]) {
                     var18++;
                     var20 = method13346(var0);
                     var19 = var19 << 1 | var20;
                  }

                  var13 = var25[var19 - var24[var18]];
               } while (var13 == 0 || var13 == 1);

               var15++;
               var1 = var0.field7042[var0.field7044[var0.field7045[0]] & 255];

               for (var0.field7039[var1 & 255] = var0.field7039[var1 & 255] + var15; var15 > 0; var15--) {
                  classYQ.field7068[var14] = var1 & 255;
                  var14++;
               }
            }
         }

         var0.field7054 = 0;
         var0.field7051 = 0;
         var0.field7040[0] = 0;

         for (int var64 = 1; var64 <= 256; var64++) {
            var0.field7040[var64] = var0.field7039[var64 - 1];
         }

         for (int var65 = 1; var65 <= 256; var65++) {
            var0.field7040[var65] = var0.field7040[var65] + var0.field7040[var65 - 1];
         }

         for (int var66 = 0; var66 < var14; var66++) {
            var1 = (byte)(classYQ.field7068[var66] & 0xFF);
            classYQ.field7068[var0.field7040[var1 & 255]] = classYQ.field7068[var0.field7040[var1 & 255]] | var66 << 8;
            var0.field7040[var1 & 255]++;
         }

         var0.field7060 = (classYQ.field7068[var0.field7061 * -919103419] >> 8) * -4786725;
         var0.field7053 = 0;
         var0.field7060 = classYQ.field7068[var0.field7060 * 485359187] * -4786725;
         var0.field7057 = (byte)(var0.field7060 * 485359187 & 0xFF) * 1490497325;
         var0.field7060 = (var0.field7060 * 485359187 >> 8) * -4786725;
         var0.field7053 += 1550649879;
         var0.field7063 = var14 * -354212575;
         method13336(var0);
         if (var0.field7053 * -624505433 == var0.field7063 * 2100469473 + 1 && var0.field7054 * 1031374819 == 0) {
            var26 = true;
         } else {
            var26 = false;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyq;)B")
   @ObfuscatedName("aw")
   static byte method13348(classYQ var0) {
      return (byte)method13350(1, var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyq;)B")
   @ObfuscatedName("ak")
   static byte method13349(classYQ var0) {
      return (byte)method13350(1, var0);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BI[BII)I")
   @ObfuscatedName("ao")
   public static int method13335(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized (field6978) {
         field6978.field7066 = var2;
         field6978.field7037 = var4 * -1683646107;
         field6978.field7067 = var0;
         field6978.field7038 = 0;
         field6978.field7052 = var1 * 1234607077;
         field6978.field7062 = 0;
         field6978.field7059 = 0;
         field6978.field7055 = 0;
         field6978.field7058 = 0;
         method13341(field6978);
         var1 -= field6978.field7052 * -124638739;
         field6978.field7066 = null;
         field6978.field7067 = null;
         return var1;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILyq;)I")
   @ObfuscatedName("at")
   static int method13351(int var0, classYQ var1) {
      while (var1.field7062 * 800258251 < var0) {
         var1.field7059 = (var1.field7059 * -1551539735 << 8 | var1.field7066[var1.field7037 * 18598876] & -933443897) * 1098777387;
         var1.field7062 += -1602752916;
         var1.field7037 += -1035591307;
         var1.field7055 += 962407791;
         if (var1.field7055 * 1714593263 == 0) {
         }
      }

      int var2 = var1.field7059 * 1015947966 >> var1.field7062 * 800258251 - var0 & (1 << var0) - 1;
      var1.field7062 -= var0 * -1643147413;
      return var2;
   }

   classYG() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILyq;)I")
   @ObfuscatedName("am")
   static int method13352(int var0, classYQ var1) {
      while (var1.field7062 * 800258251 < var0) {
         var1.field7059 = (var1.field7059 * -2122275965 << 8 | var1.field7066[var1.field7037 * 1283715181] & 255) * 1098777387;
         var1.field7062 += -562206952;
         var1.field7037 += -1683646107;
         var1.field7055 += 1209151759;
         if (var1.field7055 * 1714593263 == 0) {
         }
      }

      int var2 = var1.field7059 * -2122275965 >> var1.field7062 * 800258251 - var0 & (1 << var0) - 1;
      var1.field7062 -= var0 * -1144017693;
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(ILyq;)I")
   @ObfuscatedName("an")
   static int method13353(int var0, classYQ var1) {
      while (var1.field7062 * 800258251 < var0) {
         var1.field7059 = (var1.field7059 * -2122275965 << 8 | var1.field7066[var1.field7037 * -226862999] & 255) * 1098777387;
         var1.field7062 += 249885665;
         var1.field7037 += -1683646107;
         var1.field7055 += 1209151759;
         if (var1.field7055 * 1714593263 == 0) {
         }
      }

      int var2 = var1.field7059 * -2122275965 >> var1.field7062 * 800258251 - var0 & (1 << var0) - 1;
      var1.field7062 -= var0 * -792502602;
      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyq;)V")
   @ObfuscatedName("bn")
   static void method13356(classYQ var0) {
      var0.field7065 = 0;

      for (int var1 = 0; var1 < 256; var1++) {
         if (var0.field7029[var1]) {
            var0.field7042[var0.field7065 * 1989436113] = (byte)var1;
            var0.field7065 += -621726159;
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lyq;)V")
   @ObfuscatedName("bx")
   static void method13357(classYQ var0) {
      var0.field7065 = 0;

      for (int var1 = 0; var1 < 1690755031; var1++) {
         if (var0.field7029[var1]) {
            var0.field7042[var0.field7065 * 1989436113] = (byte)var1;
            var0.field7065 += -364966380;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([I[I[I[BIII)V")
   @ObfuscatedName("ac")
   static void method13359(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      for (int var8 = var4; var8 <= var5; var8++) {
         for (int var9 = 0; var9 < var6; var9++) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               var7++;
            }
         }
      }

      for (int var11 = 0; var11 < 23; var11++) {
         var1[var11] = 0;
      }

      for (int var12 = 0; var12 < var6; var12++) {
         var1[var3[var12] + 1]++;
      }

      for (int var13 = 1; var13 < 23; var13++) {
         var1[var13] += var1[var13 - 1];
      }

      for (int var14 = 0; var14 < 23; var14++) {
         var0[var14] = 0;
      }

      int var10 = 0;

      for (int var15 = var4; var15 <= var5; var15++) {
         var10 += var1[var15 + 1] - var1[var15];
         var0[var15] = var10 - 1;
         var10 <<= 1;
      }

      for (int var16 = var4 + 1; var16 <= var5; var16++) {
         var1[var16] = (var0[var16 - 1] + 1 << 1) - var1[var16];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[I[I[BIII)V")
   @ObfuscatedName("bp")
   static void method13360(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      for (int var8 = var4; var8 <= var5; var8++) {
         for (int var9 = 0; var9 < var6; var9++) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               var7++;
            }
         }
      }

      for (int var11 = 0; var11 < 23; var11++) {
         var1[var11] = 0;
      }

      for (int var12 = 0; var12 < var6; var12++) {
         var1[var3[var12] + 1]++;
      }

      for (int var13 = 1; var13 < 23; var13++) {
         var1[var13] += var1[var13 - 1];
      }

      for (int var14 = 0; var14 < 23; var14++) {
         var0[var14] = 0;
      }

      int var10 = 0;

      for (int var15 = var4; var15 <= var5; var15++) {
         var10 += var1[var15 + 1] - var1[var15];
         var0[var15] = var10 - 1;
         var10 <<= 1;
      }

      for (int var16 = var4 + 1; var16 <= var5; var16++) {
         var1[var16] = (var0[var16 - 1] + 1 << 1) - var1[var16];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[I[I[BIII)V")
   @ObfuscatedName("br")
   static void method13361(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      for (int var8 = var4; var8 <= var5; var8++) {
         for (int var9 = 0; var9 < var6; var9++) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               var7++;
            }
         }
      }

      for (int var11 = 0; var11 < 23; var11++) {
         var1[var11] = 0;
      }

      for (int var12 = 0; var12 < var6; var12++) {
         var1[var3[var12] + 1]++;
      }

      for (int var13 = 1; var13 < 23; var13++) {
         var1[var13] += var1[var13 - 1];
      }

      for (int var14 = 0; var14 < 23; var14++) {
         var0[var14] = 0;
      }

      int var10 = 0;

      for (int var15 = var4; var15 <= var5; var15++) {
         var10 += var1[var15 + 1] - var1[var15];
         var0[var15] = var10 - 1;
         var10 <<= 1;
      }

      for (int var16 = var4 + 1; var16 <= var5; var16++) {
         var1[var16] = (var0[var16 - 1] + 1 << 1) - var1[var16];
      }
   }
}
