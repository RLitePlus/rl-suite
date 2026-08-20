import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ni")
public class classNI {
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field4672 = 249;
   @ObfuscatedSignature(descriptor = "Lym;")
   @ObfuscatedName("cy")
   static SpritePixels field4673;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CLxo;)C")
   @ObfuscatedName("ao")
   static char method7852(char var0, classXO var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (199 == var0) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (209 == var0 && classXO.field6894 != var1) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (var0 == 221) {
            return 'Y';
         }

         if (var0 == 223) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (231 == var0) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (241 == var0 && classXO.field6894 != var1) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (253 == var0 || var0 == 255) {
            return 'y';
         }
      }

      if (338 == var0) {
         return 'O';
      } else if (var0 == 339) {
         return 'o';
      } else {
         return var0 == 376 ? 'Y' : var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lxo;)I")
   @ObfuscatedName("ab")
   public static int method7848(CharSequence var0, CharSequence var1, classXO var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      while (var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         int var9;
         if (0 != var7) {
            var9 = var7;
            boolean var16 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         int var10;
         if (var8 != 0) {
            var10 = var8;
            boolean var17 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         int var11;
         if (var9 == 198) {
            var11 = 69;
         } else if (var9 == 1828834683) {
            var11 = 101;
         } else if (-1289419175 == var9) {
            var11 = 115;
         } else if (var9 == 1733118014) {
            var11 = 69;
         } else if (var9 == 339) {
            var11 = 1168192927;
         } else {
            var11 = 0;
         }

         var7 = var11;
         int var12;
         if (var10 == -1097766243) {
            var12 = -1522612102;
         } else if (1558552882 == var10) {
            var12 = 101;
         } else if (var10 == 375130386) {
            var12 = 847487191;
         } else if (338 == var10) {
            var12 = 69;
         } else if (339 == var10) {
            var12 = -778531009;
         } else {
            var12 = 0;
         }

         var8 = var12;
         char var18 = classKR.method6556((char)var9, var2, (byte)-59);
         char var21 = classKR.method6556((char)var10, var2, (byte)-56);
         if (var18 != var21 && Character.toUpperCase(var18) != Character.toUpperCase(var21)) {
            var18 = Character.toLowerCase(var18);
            var21 = Character.toLowerCase(var21);
            if (var18 != var21) {
               return classCA.method1394(var18, var2, (byte)90) - classCA.method1394(var21, var2, (byte)114);
            }
         }
      }

      int var20 = Math.min(var3, var4);

      for (int var23 = 0; var23 < var20; var23++) {
         if (classXO.field6895 == var2) {
            var5 = var3 - 1 - var23;
            var6 = var4 - 1 - var23;
         } else {
            var6 = var23;
            var5 = var23;
         }

         char var25 = var0.charAt(var5);
         char var28 = var1.charAt(var6);
         if (var28 != var25 && Character.toUpperCase(var25) != Character.toUpperCase(var28)) {
            var25 = Character.toLowerCase(var25);
            var28 = Character.toLowerCase(var28);
            if (var25 != var28) {
               return classCA.method1394(var25, var2, (byte)111) - classCA.method1394(var28, var2, (byte)88);
            }
         }
      }

      int var24 = var3 - var4;
      if (var24 != 0) {
         return var24;
      } else {
         for (int var27 = 0; var27 < var20; var27++) {
            char var30 = var0.charAt(var27);
            char var13 = var1.charAt(var27);
            if (var30 != var13) {
               return classCA.method1394(var30, var2, (byte)54) - classCA.method1394(var13, var2, (byte)118);
            }
         }

         return 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lxo;)I")
   @ObfuscatedName("ax")
   public static int method7849(CharSequence var0, CharSequence var1, classXO var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      byte var8 = 0;

      while (var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         int var9;
         if (0 != var7) {
            var9 = var7;
            boolean var16 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if (var8 != 0) {
            var10 = (char)var8;
            boolean var17 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         int var11;
         if (var9 == 198) {
            var11 = 1274792902;
         } else if (var9 == -562183734) {
            var11 = -537665641;
         } else if (223 == var9) {
            var11 = 115;
         } else if (var9 == 1594192823) {
            var11 = 69;
         } else if (var9 == 553882152) {
            var11 = -1577988275;
         } else {
            var11 = 0;
         }

         var7 = var11;
         byte var12;
         if (var10 == 198) {
            var12 = 69;
         } else if (230 == var10) {
            var12 = 101;
         } else if (var10 == -158155616) {
            var12 = 115;
         } else if (1125204690 == var10) {
            var12 = 69;
         } else if (-638831765 == var10) {
            var12 = 101;
         } else {
            var12 = 0;
         }

         var8 = var12;
         char var18 = classKR.method6556((char)var9, var2, (byte)-22);
         var10 = classKR.method6556(var10, var2, (byte)-103);
         if (var18 != var10 && Character.toUpperCase(var18) != Character.toUpperCase(var10)) {
            var18 = Character.toLowerCase(var18);
            var10 = Character.toLowerCase(var10);
            if (var18 != var10) {
               return classCA.method1394(var18, var2, (byte)70) - classCA.method1394(var10, var2, (byte)66);
            }
         }
      }

      int var20 = Math.min(var3, var4);

      for (int var23 = 0; var23 < var20; var23++) {
         if (classXO.field6895 == var2) {
            var5 = var3 - 1 - var23;
            var6 = var4 - 1 - var23;
         } else {
            var6 = var23;
            var5 = var23;
         }

         char var25 = var0.charAt(var5);
         char var28 = var1.charAt(var6);
         if (var28 != var25 && Character.toUpperCase(var25) != Character.toUpperCase(var28)) {
            var25 = Character.toLowerCase(var25);
            var28 = Character.toLowerCase(var28);
            if (var25 != var28) {
               return classCA.method1394(var25, var2, (byte)116) - classCA.method1394(var28, var2, (byte)83);
            }
         }
      }

      int var24 = var3 - var4;
      if (var24 != 0) {
         return var24;
      } else {
         for (int var27 = 0; var27 < var20; var27++) {
            char var30 = var0.charAt(var27);
            char var13 = var1.charAt(var27);
            if (var30 != var13) {
               return classCA.method1394(var30, var2, (byte)99) - classCA.method1394(var13, var2, (byte)105);
            }
         }

         return 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lxo;)I")
   @ObfuscatedName("as")
   public static int method7850(CharSequence var0, CharSequence var1, classXO var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      byte var7 = 0;
      byte var8 = 0;

      while (var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         char var9;
         if (0 != var7) {
            var9 = (char)var7;
            boolean var16 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if (var8 != 0) {
            var10 = (char)var8;
            boolean var17 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         byte var11;
         if (var9 == 198) {
            var11 = 69;
         } else if (var9 == 230) {
            var11 = 101;
         } else if (223 == var9) {
            var11 = 115;
         } else if (var9 == 338) {
            var11 = 69;
         } else if (var9 == 339) {
            var11 = 101;
         } else {
            var11 = 0;
         }

         var7 = var11;
         byte var12;
         if (var10 == 198) {
            var12 = 69;
         } else if (230 == var10) {
            var12 = 101;
         } else if (var10 == 223) {
            var12 = 115;
         } else if (338 == var10) {
            var12 = 69;
         } else if (339 == var10) {
            var12 = 101;
         } else {
            var12 = 0;
         }

         var8 = var12;
         var9 = classKR.method6556(var9, var2, (byte)-3);
         var10 = classKR.method6556(var10, var2, (byte)-102);
         if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if (var9 != var10) {
               return classCA.method1394(var9, var2, (byte)60) - classCA.method1394(var10, var2, (byte)88);
            }
         }
      }

      int var20 = Math.min(var3, var4);

      for (int var23 = 0; var23 < var20; var23++) {
         if (classXO.field6895 == var2) {
            var5 = var3 - 1 - var23;
            var6 = var4 - 1 - var23;
         } else {
            var6 = var23;
            var5 = var23;
         }

         char var25 = var0.charAt(var5);
         char var28 = var1.charAt(var6);
         if (var28 != var25 && Character.toUpperCase(var25) != Character.toUpperCase(var28)) {
            var25 = Character.toLowerCase(var25);
            var28 = Character.toLowerCase(var28);
            if (var25 != var28) {
               return classCA.method1394(var25, var2, (byte)104) - classCA.method1394(var28, var2, (byte)52);
            }
         }
      }

      int var24 = var3 - var4;
      if (var24 != 0) {
         return var24;
      } else {
         for (int var27 = 0; var27 < var20; var27++) {
            char var30 = var0.charAt(var27);
            char var13 = var1.charAt(var27);
            if (var30 != var13) {
               return classCA.method1394(var30, var2, (byte)120) - classCA.method1394(var13, var2, (byte)112);
            }
         }

         return 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lxo;)I")
   @ObfuscatedName("ag")
   public static int method7851(CharSequence var0, CharSequence var1, classXO var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      byte var7 = 0;
      byte var8 = 0;

      while (var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         char var9;
         if (0 != var7) {
            var9 = (char)var7;
            boolean var16 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if (var8 != 0) {
            var10 = (char)var8;
            boolean var17 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         byte var11;
         if (var9 == 198) {
            var11 = 69;
         } else if (var9 == 230) {
            var11 = 101;
         } else if (223 == var9) {
            var11 = 115;
         } else if (var9 == 338) {
            var11 = 69;
         } else if (var9 == 339) {
            var11 = 101;
         } else {
            var11 = 0;
         }

         var7 = var11;
         byte var12;
         if (var10 == 198) {
            var12 = 69;
         } else if (230 == var10) {
            var12 = 101;
         } else if (var10 == 223) {
            var12 = 115;
         } else if (338 == var10) {
            var12 = 69;
         } else if (339 == var10) {
            var12 = 101;
         } else {
            var12 = 0;
         }

         var8 = var12;
         var9 = classKR.method6556(var9, var2, (byte)-63);
         var10 = classKR.method6556(var10, var2, (byte)-24);
         if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if (var9 != var10) {
               return classCA.method1394(var9, var2, (byte)69) - classCA.method1394(var10, var2, (byte)95);
            }
         }
      }

      int var20 = Math.min(var3, var4);

      for (int var23 = 0; var23 < var20; var23++) {
         if (classXO.field6895 == var2) {
            var5 = var3 - 1 - var23;
            var6 = var4 - 1 - var23;
         } else {
            var6 = var23;
            var5 = var23;
         }

         char var25 = var0.charAt(var5);
         char var28 = var1.charAt(var6);
         if (var28 != var25 && Character.toUpperCase(var25) != Character.toUpperCase(var28)) {
            var25 = Character.toLowerCase(var25);
            var28 = Character.toLowerCase(var28);
            if (var25 != var28) {
               return classCA.method1394(var25, var2, (byte)101) - classCA.method1394(var28, var2, (byte)102);
            }
         }
      }

      int var24 = var3 - var4;
      if (var24 != 0) {
         return var24;
      } else {
         for (int var27 = 0; var27 < var20; var27++) {
            char var30 = var0.charAt(var27);
            char var13 = var1.charAt(var27);
            if (var30 != var13) {
               return classCA.method1394(var30, var2, (byte)106) - classCA.method1394(var13, var2, (byte)79);
            }
         }

         return 0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CLxo;)C")
   @ObfuscatedName("ac")
   static char method7853(char var0, classXO var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (199 == var0) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (209 == var0 && classXO.field6894 != var1) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (var0 == 221) {
            return 'Y';
         }

         if (var0 == 223) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (231 == var0) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (241 == var0 && classXO.field6894 != var1) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (253 == var0 || var0 == 255) {
            return 'y';
         }
      }

      if (338 == var0) {
         return 'O';
      } else if (var0 == 339) {
         return 'o';
      } else {
         return var0 == 376 ? 'Y' : var0;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CLxo;)C")
   @ObfuscatedName("aa")
   static char method7854(char var0, classXO var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (199 == var0) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (209 == var0 && classXO.field6894 != var1) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (var0 == 221) {
            return 'Y';
         }

         if (var0 == 223) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (231 == var0) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (241 == var0 && classXO.field6894 != var1) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (253 == var0 || var0 == 255) {
            return 'y';
         }
      }

      if (338 == var0) {
         return 'O';
      } else if (var0 == 339) {
         return 'o';
      } else {
         return var0 == 376 ? 'Y' : var0;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lte;Lte;I)V")
   @ObfuscatedName("ay")
   public static void method7860(classTE var0, classTE var1, int var2) {
      try {
         if (null != var0) {
            if (var2 == 2120450224) {
               throw new IllegalStateException();
            }

            if (var0.method10756(-479801780) > 1) {
               classOL.method8512(var0, 1327640383);
               if (null != var1) {
                  if (var2 == 2120450224) {
                     throw new IllegalStateException();
                  }

                  classOL.method8512(var1, 1327640383);
               }

               int var3 = var0.method10756(202973017);
               if (null != var1) {
                  if (var2 == 2120450224) {
                     throw new IllegalStateException();
                  }

                  if (var1.method10756(-1404915437) < var3) {
                     if (var2 == 2120450224) {
                        return;
                     }

                     throw new RuntimeException();
                  }
               }

               if (classYY.field7111 == var0.field6128) {
                  if (var2 == 2120450224) {
                     throw new IllegalStateException();
                  }

                  if (null == var1) {
                     if (var2 == 2120450224) {
                        throw new IllegalStateException();
                     }

                     classHL.method6072(var0.method10748(1861223224), classTJ.field6147, 0, var3 - 1, (byte)58);
                  } else if (var1.field6128 == classYY.field7111) {
                     if (var2 == 2120450224) {
                        throw new IllegalStateException();
                     }

                     classHL.method6072(var0.method10748(381197946), var1.method10748(584709366), 0, var3 - 1, (byte)111);
                  } else if (classYY.field7115 == var1.field6128) {
                     if (var2 == 2120450224) {
                        throw new IllegalStateException();
                     }

                     classGS.method5744(var0.method10748(1399291640), var1.method10750(-102085300), 0, var3 - 1, 1983624506);
                  } else {
                     classAT.method693(var0.method10748(499668634), classTE.method10753(var1, -478576208), 0, var3 - 1, (byte)-95);
                  }
               } else if (classYY.field7115 == var0.field6128) {
                  if (var2 == 2120450224) {
                     return;
                  }

                  if (var1 == null) {
                     Arrays.sort(var0.method10750(-2065873779), 0, var3);
                  } else if (var1.field6128 == classYY.field7111) {
                     if (var2 == 2120450224) {
                        throw new IllegalStateException();
                     }

                     classAS.method661(var0.method10750(137034745), var1.method10748(1315750124), 0, var3 - 1, 391550517);
                  } else if (classYY.field7115 == var1.field6128) {
                     if (var2 == 2120450224) {
                        throw new IllegalStateException();
                     }

                     classMQ.method7645(var0.method10750(-1930769033), var1.method10750(-1307337707), 0, var3 - 1, (byte)1);
                  } else {
                     classTJ.method10873(var0.method10750(-891140661), classTE.method10753(var1, -2077367058), 0, var3 - 1, (byte)4);
                  }
               } else {
                  if (var0.field6128 != classYY.field7113) {
                     throw new RuntimeException();
                  }

                  if (var2 == 2120450224) {
                     throw new IllegalStateException();
                  }

                  if (var1 == null) {
                     if (var2 == 2120450224) {
                        throw new IllegalStateException();
                     }

                     Arrays.sort(classTE.method10753(var0, 1853602102), 0, var3);
                  } else if (classYY.field7111 == var1.field6128) {
                     if (var2 == 2120450224) {
                        throw new IllegalStateException();
                     }

                     classCZ.method2848((String[])classTE.method10753(var0, 1547523444), var1.method10748(-463929966), 0, var3 - 1, 2107305661);
                  } else if (var1.field6128 == classYY.field7115) {
                     if (var2 == 2120450224) {
                        return;
                     }

                     classKH.method6475((String[])classTE.method10753(var0, -1516095490), var1.method10750(-251022299), 0, var3 - 1, 1760799689);
                  } else {
                     KeyHandler.method10835((String[])classTE.method10753(var0, 1333750313), classTE.method10753(var1, 752603625), 0, var3 - 1, -452915977);
                  }
               }

               var0.field6133 = true;
               return;
            }

            if (var2 == 2120450224) {
               throw new IllegalStateException();
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "ni.ay(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CLxo;)I")
   @ObfuscatedName("aj")
   static int method7855(char var0, classXO var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = 1 + (var0 << 4);
      }

      if (241 == var0 && classXO.field6894 == var1) {
         var2 = -417993962;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CLxo;)I")
   @ObfuscatedName("al")
   static int method7856(char var0, classXO var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = 1 + (var0 << 4);
      }

      if (1802010009 == var0 && classXO.field6894 == var1) {
         var2 = -1790758291;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CLxo;)I")
   @ObfuscatedName("ay")
   static int method7857(char var0, classXO var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = 1 + (var0 << 4);
      }

      if (241 == var0 && classXO.field6894 == var1) {
         var2 = -1080675160;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CLxo;)I")
   @ObfuscatedName("aq")
   static int method7858(char var0, classXO var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = 1 + (var0 << 4);
      }

      if (-959242202 == var0 && classXO.field6894 == var1) {
         var2 = 1816836212;
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(CLxo;)I")
   @ObfuscatedName("ad")
   static int method7859(char var0, classXO var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = 1 + (var0 << 4);
      }

      if (-1339985841 == var0 && classXO.field6894 == var1) {
         var2 = 1762;
      }

      return var2;
   }

   classNI() throws Throwable {
      throw new Error();
   }
}
