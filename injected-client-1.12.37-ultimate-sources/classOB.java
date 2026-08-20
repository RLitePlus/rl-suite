import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ob")
public final class classOB {
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   static final int field4813 = 30;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   public static final int field4810 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   public static final int field4811 = 12;
   @ObfuscatedName("az")
   static final char[] field4808 = new char[]{
      '_',
      'a',
      'b',
      'c',
      'd',
      'e',
      'f',
      'g',
      'h',
      'i',
      'j',
      'k',
      'l',
      'm',
      'n',
      'o',
      'p',
      'q',
      'r',
      's',
      't',
      'u',
      'v',
      'w',
      'x',
      'y',
      'z',
      '0',
      '1',
      '2',
      '3',
      '4',
      '5',
      '6',
      '7',
      '8',
      '9'
   };
   @ToRemove(unused = "true")
   @ObfuscatedName("be")
   public static final int field4812 = 67;
   @ObfuscatedName("af")
   static long[] field4809 = new long[12];

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("as")
   public static String method8295(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for (long var3 = var0; 0L != var3; var3 /= 37L) {
               var2++;
            }

            StringBuilder var5 = new StringBuilder(var2);

            while (0L != var0) {
               long var6 = var0;
               var0 /= 37L;
               int var8 = field4808[(int)(var6 - 37L * var0)];
               if (312251424 == var8) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 746348644;
               }

               var5.append((char)var8);
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   static {
      for (int var0 = 0; var0 < field4809.length; var0++) {
         field4809[var0] = (long)Math.pow(37.0, var0);
      }
   }

   @ObfuscatedSignature(descriptor = "(Llw;II)V")
   @ObfuscatedName("ac")
   static void method8301(classLW var0, int var1, int var2) {
      try {
         if (0 == var0.field4375 * -1510882375) {
            if (var2 != 427421377) {
               throw new IllegalStateException();
            }

            if (63131743 * var0.field4260 > -1) {
               if (var2 != 427421377) {
                  return;
               }

               if (var1 > 379541057 * var0.field4266) {
                  if (var2 != 427421377) {
                     throw new IllegalStateException();
                  }

                  var0.field4266 = var1 * -1479820863;
               }

               if (var1 < var0.field4265 * -1210177335) {
                  if (var2 != 427421377) {
                     throw new IllegalStateException();
                  }

                  var0.field4265 = -452038279 * var1;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ob.ac(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("ab")
   public static String method8293(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for (long var3 = var0; var3 != 0L; var3 /= 37L) {
               var2++;
            }

            StringBuilder var5 = new StringBuilder(var2);

            while (var0 != 0L) {
               long var6 = var0;
               var0 /= 37L;
               var5.append(field4808[(int)(var6 - var0 * 37L)]);
            }

            return var5.reverse().toString();
         }
      } else {
         return null;
      }
   }

   classOB() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("ag")
   public static String method8296(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for (long var3 = var0; 0L != var3; var3 /= 37L) {
               var2++;
            }

            StringBuilder var5 = new StringBuilder(var2);

            while (0L != var0) {
               long var6 = var0;
               var0 /= 37L;
               char var8 = field4808[(int)(var6 - 37L * var0)];
               if ('_' == var8) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }

               var5.append(var8);
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("ax")
   public static String method8297(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for (long var3 = var0; 0L != var3; var3 /= 37L) {
               var2++;
            }

            StringBuilder var5 = new StringBuilder(var2);

            while (0L != var0) {
               long var6 = var0;
               var0 /= 37L;
               char var8 = field4808[(int)(var6 - 37L * var0)];
               if ('_' == var8) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }

               var5.append(var8);
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)Lop;")
   @ObfuscatedName("ae")
   public static classOP method8299(int var0, byte var1) {
      try {
         classOP var2 = (classOP)classOP.field5006.method6422(var0);
         if (null != var2) {
            if (var1 == 64) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = classOT.field5117.method11867(10, var0, -1651052842);
            if (null == var3) {
               if (var1 == 64) {
                  throw new IllegalStateException();
               }

               var2 = new classOP(null, var0, null, null, true);
            } else {
               classXY var4;
               int[] var6;
               label61: {
                  var4 = new classXY(var3);
                  var6 = new int[2];
                  int var7 = classXY.method13039(var4, -346779531);
                  if (var7 != 97) {
                     if (var1 == 64) {
                        throw new IllegalStateException();
                     }

                     if (139 != var7) {
                        if (var1 == 64) {
                           throw new IllegalStateException();
                        }

                        if (148 != var7) {
                           Arrays.fill(var6, -1);
                           break label61;
                        }
                     }
                  }

                  var6[0] = classXY.method13047(var4, 945959292);
                  classXY.method13039(var4, -346779531);
                  var6[1] = classXY.method13047(var4, 130405734);
               }

               var4.field6955 = 0;
               classOP var11 = var6[0] == -1 ? null : method8299(var6[0], (byte)13);
               classOP var8 = var6[1] == -1 ? null : method8299(var6[1], (byte)-52);
               var2 = new classOP(var4, var0, var11, var8, true);
            }

            classOP.field5006.method6428(var2, var0);
            return var2;
         }
      } catch (RuntimeException var9) {
         throw classEG.method3884(var9, "ob.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Lse;")
   @ObfuscatedName("as")
   static classSE method8298(int var0, int var1) {
      try {
         classSE var2 = (classSE)classOF.method8404(classQD.method9493(-379692846), var0, -1950997571);
         if (var2 == null) {
            if (var1 != -47642443) {
               throw new IllegalStateException();
            }

            var2 = classSE.field5911;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ob.as(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(J)Ljava/lang/String;")
   @ObfuscatedName("ae")
   public static String method8294(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for (long var3 = var0; var3 != 0L; var3 /= 37L) {
               var2++;
            }

            StringBuilder var5 = new StringBuilder(var2);

            while (var0 != 0L) {
               long var6 = var0;
               var0 /= 37L;
               var5.append(field4808[(int)(var6 - var0 * 37L)]);
            }

            return var5.reverse().toString();
         }
      } else {
         return null;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lte;ILjava/lang/Object;I)V")
   @ObfuscatedName("ar")
   public static void method8300(classTE var0, int var1, Object var2, int var3) {
      try {
         classOL.method8512(var0, 1327640383);
         if (var1 >= 0) {
            if (var3 <= 1252777968) {
               throw new IllegalStateException();
            }

            if (var1 <= -1943548931 * var0.field6131) {
               var0.method10774(1 + -1943548931 * var0.field6131, 1304866981);
               if (var1 < -1943548931 * var0.field6131) {
                  classMX.method7739(var0, var1, var0, var1 + 1, var0.field6131 * -1943548931 - var1, -2128084676);
               }

               var0.method10765(var1, var2, 1976963692);
               var0.field6131 += -1063196331;
               var0.field6133 = true;
               return;
            }

            if (var3 <= 1252777968) {
               return;
            }
         }

         throw new RuntimeException();
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ob.ar(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;Lgy;III)V")
   @ObfuscatedName("az")
   public static void method8291(classXY var0, classGY var1, int var2, int var3, int var4) {
      try {
         classGY.method5929(var1, classKY.method6605(var2, 1577372180), classKY.method6605(var3, 861181486), (byte)5);
         classGY.method5933(var1, 0, (short)255);
         var1.method5923(0, 841791791);
         byte var5 = classXY.method13043(var0, (byte)17);
         if (var5 != 0) {
            int var6 = classQK.method9604(var0, var5, 0, (byte)69);
            int var7 = classQK.method9604(var0, var5, 2, (byte)76);
            int var8 = classQK.method9604(var0, var5, 4, (byte)77);
            int var9 = classQK.method9604(var0, var5, 6, (byte)114);
            var1.method5939(var6, var7, var8, var9, -390000412);
         }
      } catch (RuntimeException var10) {
         throw classEG.method3884(var10, "ob.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[Lkr;")
   @ObfuscatedName("ag")
   public static classKR[] method8292(byte var0) {
      try {
         return new classKR[]{classKR.field4006, classKR.field4008, classKR.field4007};
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "ob.ag(" + ')');
      }
   }
}
