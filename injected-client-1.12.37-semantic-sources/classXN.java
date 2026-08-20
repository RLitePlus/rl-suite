import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("xn")
public final class classXN {
   @ObfuscatedName("af")
   static ThreadPoolExecutor field6891;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lai;)I")
   @ObfuscatedName("bj")
   public static int method12850(classAI var0) {
      return -1908782452 * var0.field161;
   }

   classXN() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)I")
   @ObfuscatedName("ae")
   public static int method12845(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if (var4 <= 127) {
            var2++;
         } else if (var4 <= 2047) {
            var2 += 2;
         } else {
            var2 += 3;
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lhh;)V")
   @ObfuscatedName("ez")
   public static void method12852(classHH var0) {
      byte[] var1 = new byte[var0.field2795 * 1966526081 * 1966526081 * var0.field2795];
      int var2 = 0;

      for (int var3 = 1966526081 * var0.field2795 - 1; var3 >= 0; var3--) {
         for (int var4 = 0; var4 < var0.field2795 * -986072301; var4++) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.field2800[1][0] = var1;
      var1 = new byte[var0.field2795 * 766595857 * 805251320 * var0.field2795];
      var2 = 0;

      for (int var11 = 0; var11 < 1966526081 * var0.field2795; var11++) {
         for (int var14 = 0; var14 < 1966526081 * var0.field2795; var14++) {
            if (var2 >= 0 && var2 < var1.length) {
               if (var14 >= var11 << 1) {
                  var1[var2] = -1;
               }

               var2++;
            } else {
               var2++;
            }
         }
      }

      var0.field2800[1][1] = var1;
      var1 = new byte[-2125093505 * var0.field2795 * var0.field2795 * 1151256729];
      var2 = 0;

      for (int var12 = 0; var12 < var0.field2795 * 706579257; var12++) {
         for (int var15 = var0.field2795 * -551478393 - 1; var15 >= 0; var15--) {
            if (var15 <= var12 >> 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.field2800[1][2] = var1;
      var1 = new byte[var0.field2795 * 1966526081 * 1966526081 * var0.field2795];
      var2 = 0;

      for (int var13 = 1966526081 * var0.field2795 - 1; var13 >= 0; var13--) {
         for (int var16 = 1966526081 * var0.field2795 - 1; var16 >= 0; var16--) {
            if (var16 >= var13 << 1) {
               var1[var2] = -1;
            }

            var2++;
         }
      }

      var0.field2800[1][3] = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcy;)I")
   @ObfuscatedName("fn")
   public static int method12853(ClientPreferences var0) {
      return var0.field1344 * -1030221399;
   }

   @ObfuscatedSignature(descriptor = "(II)Lpa;")
   @ObfuscatedName("af")
   public static classPA method12847(int var0, int var1) {
      try {
         classPA var2 = (classPA)classPA.field5203.method6422(var0);
         if (null != var2) {
            if (var1 <= 1503693208) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = classPA.field5208.method11867(19, var0, -1983156126);
            var2 = new classPA(new classXY(var3));
            classPA.field5203.method6428(var2, var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "xn.af(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BII)Ljava/lang/String;")
   @ObfuscatedName("ag")
   public static String method12848(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;
      int var5 = var1;
      int var6 = var2 + var1;

      while (var5 < var6) {
         int var7 = var0[var5++] & 255;
         int var8;
         if (var7 < 128) {
            if (0 == var7) {
               var8 = 65533;
            } else {
               var8 = var7;
            }
         } else if (var7 < 192) {
            var8 = 65533;
         } else if (var7 < 224) {
            if (var5 < var6 && 128 == (var0[var5] & 192)) {
               var8 = (var7 & 31) << 6 | var0[var5++] & 63;
               if (var8 < 128) {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else if (var7 < 240) {
            if (var5 + 1 < var6 && 128 == (var0[var5] & 192) && 128 == (var0[1 + var5] & 192)) {
               var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
               if (var8 < 2048) {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else if (var7 < 248) {
            if (2 + var5 < var6 && 128 == (var0[var5] & 192) && 128 == (var0[var5 + 1] & 192) && 128 == (var0[var5 + 2] & 192)) {
               var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
               if (var8 >= 65536 && var8 <= 1114111) {
                  var8 = 65533;
               } else {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else {
            var8 = 65533;
         }

         var3[var4++] = (char)var8;
      }

      return new String(var3, 0, var4);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrt;Laae;)Lrr;")
   @ObfuscatedName("gr")
   public static User method12851(UserList var0, classAAE var1) {
      if (var0 == null) {
         var0.method10198();
      }

      return !var1.method171(-919842158) ? null : (User)var0.field5844.get(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;)I")
   @ObfuscatedName("ab")
   public static int method12846(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if (var4 <= -820644025) {
            var2++;
         } else if (var4 <= 2132470776) {
            var2 += 2;
         } else {
            var2 += 3;
         }
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BII)Ljava/lang/String;")
   @ObfuscatedName("as")
   public static String method12849(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;
      int var5 = var1;
      int var6 = var2 + var1;

      while (var5 < var6) {
         int var7 = var0[var5++] & 255;
         int var8;
         if (var7 < 128) {
            if (0 == var7) {
               var8 = 65533;
            } else {
               var8 = var7;
            }
         } else if (var7 < 192) {
            var8 = 65533;
         } else if (var7 < 224) {
            if (var5 < var6 && 128 == (var0[var5] & 192)) {
               var8 = (var7 & 31) << 6 | var0[var5++] & 63;
               if (var8 < 128) {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else if (var7 < 240) {
            if (var5 + 1 < var6 && 128 == (var0[var5] & 192) && 128 == (var0[1 + var5] & 192)) {
               var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
               if (var8 < 2048) {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else if (var7 < 248) {
            if (2 + var5 < var6 && 128 == (var0[var5] & 192) && 128 == (var0[var5 + 1] & 192) && 128 == (var0[var5 + 2] & 192)) {
               var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
               if (var8 >= 65536 && var8 <= 1114111) {
                  var8 = 65533;
               } else {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else {
            var8 = 65533;
         }

         var3[var4++] = (char)var8;
      }

      return new String(var3, 0, var4);
   }
}
