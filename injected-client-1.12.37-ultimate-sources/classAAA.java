import java.util.Random;
import net.runelite.api.FontTypeFace;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aaa")
public abstract class classAAA extends classYW implements FontTypeFace {
   @ObfuscatedName("ah")
   byte[][] field4;
   @ObfuscatedName("at")
   public int field8 = 0;
   @ObfuscatedName("ae")
   static int field11 = -1;
   @ObfuscatedName("ab")
   static int field15 = -1;
   @ObfuscatedName("aa")
   static int field13 = 256;
   @ObfuscatedName("as")
   static int field14 = -1;
   @ObfuscatedName("am")
   public int field10;
   @ObfuscatedName("ac")
   static int field12 = 0;
   @ObfuscatedName("bx")
   int[] field6;
   @ObfuscatedName("ao")
   static int field18 = 0;
   @ObfuscatedName("aw")
   static int field19 = 0;
   @ObfuscatedName("ak")
   static Random field20 = new Random();
   @ObfuscatedName("av")
   static String[] field21 = new String[100];
   @ObfuscatedName("an")
   public int field9;
   @ObfuscatedName("ag")
   static int field16 = -1;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field22 = 256;
   @ObfuscatedName("bn")
   int[] field24;
   @ObfuscatedName("ax")
   static int field17 = 0;
   @ObfuscatedSignature(descriptor = "[Lyz;")
   @ObfuscatedName("af")
   public static classYZ[] field25;
   @ObfuscatedName("bc")
   int[] field7;
   @ObfuscatedName("bp")
   int[] field5;
   @ObfuscatedName("br")
   int[] field3;
   @ObfuscatedName("bm")
   byte[] field23;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("cg")
   public void method54(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         method104(this, var4, var5);
         this.method116(var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Laaa;Ljava/lang/String;IIIII)V")
   @ObfuscatedName("yv")
   public static void method58(classAAA var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var0 == null) {
         var0.method62(var1, var2, var2, var2, var2, var2);
      } else if (var1 != null) {
         method104(var0, var4, var5);
         field13 = var6;
         var0.method116(var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
   @ObfuscatedName("ap")
   public int method38(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         boolean var10 = false;
         boolean var11 = false;
         int var12 = -1;
         int var13 = 0;
         byte var14 = 0;
         int var15 = -1;
         char var16 = 0;
         int var17 = 0;
         int var18 = var1.length();

         for (int var19 = 0; var19 < var18; var19++) {
            boolean var20 = false;
            char var21 = var1.charAt(var19);
            if (var21 == '<') {
               var15 = var19;
            } else {
               if (var21 == '>' && var15 != -1) {
                  String var22 = var1.substring(var15 + 1, var19);
                  var15 = -1;
                  var6.append('<');
                  var6.append(var22);
                  var6.append('>');
                  if (var22.equals("br") || var22.equals("n")) {
                     var3[var17++] = var6.substring(var5);
                     var6.setLength(0);
                     var5 = 0;
                     var4 = 0;
                     var7 = -1;
                     var16 = 0;
                     var12 = -1;
                     var10 = false;
                     var11 = false;
                  }

                  if (var22.equals("shy")) {
                     var12 = var7;
                     var13 = var8;
                     var11 = var10;
                     var14 = var9;
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                     var10 = true;
                  } else if (var22.equals("lt")) {
                     var4 += this.method33('<');
                     if (this.field23 != null && var16 != -1) {
                        var4 += this.field23[(var16 << '\b') + 60];
                     }

                     var16 = '<';
                  } else if (var22.equals("gt")) {
                     var4 += this.method33('>');
                     if (this.field23 != null && var16 != -1) {
                        var4 += this.field23[(var16 << '\b') + 62];
                     }

                     var16 = '>';
                  } else if (var22.equals("at")) {
                     var4 += this.method33('@');
                     if (this.field23 != null && var16 != -1) {
                        var4 += this.field23[(var16 << '\b') + 64];
                     }

                     var16 = '@';
                  } else if (var22.startsWith("img=")) {
                     try {
                        int var23 = classJF.method6360(var22.substring(4), 759413967);
                        var4 += field25[var23].field7124;
                        var16 = 0;
                     } catch (Exception var26) {
                     }
                  } else if (var22.equals("nbh")) {
                     var4 += this.method33('-');
                     if (this.field23 != null && var16 != -1) {
                        var4 += this.field23[(var16 << '\b') + 45];
                     }

                     var20 = true;
                     var16 = '-';
                  }

                  var21 = 0;
               }

               if (var21 == '@') {
                  int var27 = var1.indexOf(64, var19 + 1);
                  if (var27 != -1 && var27 > var19 + 1) {
                     String var29 = var1.substring(var19 + 1, var27);
                     if (var29.matches("[a-zA-Z0-9_]+") && classMI.method7575(var29, 1787709973) != null) {
                        var6.append(var1, var19, var27 + 1);
                        var19 = var27;
                        continue;
                     }
                  }
               }

               if (var15 == -1) {
                  if (var21 != 0) {
                     var6.append(var21);
                     var4 += this.method33(var21);
                     if (this.field23 != null && var16 != -1) {
                        var4 += this.field23[(var16 << '\b') + var21];
                     }

                     var16 = var21;
                  }

                  if (var21 == ' ') {
                     var12 = var7;
                     var13 = var8;
                     var11 = var10;
                     var14 = var9;
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                     var10 = false;
                  }

                  if (var2 != null && var4 > var2[var17 < var2.length ? var17 : var2.length - 1] && var7 >= 0) {
                     if (var10) {
                        int var28 = var2[var17 < var2.length ? var17 : var2.length - 1];
                        String var30 = var6.substring(var5, var7);
                        boolean var24 = this.method36(var30 + '-') <= var28;
                        boolean var25 = !var24 && var12 >= 0 && this.method36(var6.substring(var5, var12) + (var11 ? "-" : "")) <= var28;
                        if (var25) {
                           var3[var17++] = var11 ? var6.substring(var5, var12) + '-' : var6.substring(var5, var12 - var14);
                           var5 = var12;
                           var4 -= var13;
                        } else {
                           var3[var17++] = var30 + '-';
                           var5 = var7;
                           var4 -= var8;
                        }
                     } else {
                        var3[var17++] = var6.substring(var5, var7 - var9);
                        var5 = var7;
                        var4 -= var8;
                     }

                     var7 = -1;
                     var16 = 0;
                     var10 = false;
                     var12 = -1;
                     var11 = false;
                  }

                  if (var21 == '-' && !var20) {
                     var12 = var7;
                     var13 = var8;
                     var11 = var10;
                     var14 = var9;
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                     var10 = false;
                  }
               }
            }
         }

         if (var6.length() > var5) {
            var3[var17++] = var6.substring(var5);
         }

         return var17;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII[I)V")
   @ObfuscatedName("db")
   public void method79(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         method104(this, var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method94(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for (int var11 = 0; var11 < var1.length(); var11++) {
            var9[var11] = (int)(Math.sin(var11 / 5.0 + var6 / 5.0) * 5.0);
            var10[var11] = (int)(Math.sin(var11 / 3.0 + var6 / 5.0) * 5.0);
         }

         this.method121(var1, var2 - this.method36(var1) / 2, var3, var8, var9, var10);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("ax")
   public static String method8(String var0) {
      int var1 = var0.length();
      byte var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if (var4 == '<' || var4 == '>') {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for (int var7 = 0; var7 < var1; var7++) {
         char var5 = var0.charAt(var7);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else if (var5 == '@') {
            var6.append("<at>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("ac")
   public static boolean method11(String var0) {
      if (var0.startsWith("col=")) {
         return true;
      } else if (var0.equals("/col")) {
         return true;
      } else if (var0.startsWith("u=")) {
         return true;
      } else if (var0.equals("u")) {
         return true;
      } else if (var0.equals("/u")) {
         return true;
      } else if (var0.startsWith("shad=")) {
         return true;
      } else if (var0.equals("shad")) {
         return true;
      } else if (var0.equals("/shad")) {
         return true;
      } else if (var0.startsWith("str=")) {
         return true;
      } else if (var0.equals("str")) {
         return true;
      } else if (var0.equals("/str")) {
         return true;
      } else if (var0.equals("br")) {
         return true;
      } else if (var0.equals("lt")) {
         return true;
      } else if (var0.equals("gt")) {
         return true;
      } else {
         return var0.startsWith("img=") ? true : var0.equals("at");
      }
   }

   @ObfuscatedSignature(descriptor = "(C)I")
   @ObfuscatedName("ip")
   public int method122(char var1) {
      return this.method33(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laaa;IIII)V")
   @ObfuscatedName("ie")
   public static void method99(classAAA var0, int var1, int var2, int var3, int var4) {
      var3 -= var0.field8;
      int var5 = var1 & 0xFF;
      if (var5 != 32) {
         var0.vmethod1(var0.field4[var5], var2 + var0.field5[var5], var3 + var0.field3[var5], var0.field6[var5], var0.field7[var5], var4);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laaa;Ljava/lang/String;IIIIIIIIII)I")
   @ObfuscatedName("dt")
   public static int method68(classAAA var0, String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var0 == null) {
         var0.method62(var1, var2, var2, var2, var2, var2);
      }

      if (var1 == null) {
         return 0;
      } else {
         if (var8 == -2051429969) {
            var8 = 256;
         }

         method104(var0, var6, var7);
         field13 = var8;
         if (var11 == 0) {
            var11 = var0.field8;
         }

         int[] var12 = new int[]{var4};
         if (var5 < var0.field9 + var0.field10 + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = var0.method38(var1, var12, field21);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         if (var10 == 0) {
            var14 = var3 + var0.field9;
         } else if (var10 == 1) {
            var14 = var3 + var0.field9 + (var5 - var0.field9 - var0.field10 - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - var0.field10 - (var13 - 1) * var11;
         } else {
            int var15 = (var5 - var0.field9 - var0.field10 - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + var0.field9 + var15;
            var11 += var15;
         }

         for (int var16 = 0; var16 < var13; var16++) {
            if (var9 == 0) {
               var0.method116(field21[var16], var2, var14);
            } else if (var9 == 1) {
               var0.method116(field21[var16], var2 + (var4 - var0.method36(field21[var16])) / 2, var14);
            } else if (var9 == 2) {
               var0.method116(field21[var16], var2 + var4 - var0.method36(field21[var16]), var14);
            } else if (var16 == var13 - 1) {
               var0.method116(field21[var16], var2, var14);
            } else {
               var0.method113(field21[var16], var4);
               var0.method116(field21[var16], var2, var14);
               field18 = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laaa;Ljava/lang/String;IIII[I)V")
   @ObfuscatedName("rf")
   public static void method87(classAAA var0, String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var0 == null) {
         var0.method53(var1, var2, var2);
      }

      if (var1 != null) {
         method104(var0, var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = var0.method94(var6, var1.length());
         }

         var0.method121(var1, var2 - var0.method36(var1) / 2, var3, var7, null, null);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("cw")
   public void method55(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         method104(this, var4, var5);
         this.method116(var1, var2, var3);
      }
   }

   public int getTextWidth(String var1) {
      return this.method36(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("bi")
   public static String method9(String var0) {
      int var1 = var0.length();
      byte var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if (var4 == '<' || var4 == '>') {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for (int var7 = 0; var7 < var1; var7++) {
         char var5 = var0.charAt(var7);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else if (var5 == '@') {
            var6.append("<at>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II[I[I[I)V")
   @ObfuscatedName("iu")
   void method120(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
      var3 -= this.field8;
      int var7 = -1;
      int var8 = -1;
      int var9 = 0;

      for (int var10 = 0; var10 < var1.length(); var10++) {
         if (var1.charAt(var10) != 0) {
            char var11 = (char)(classOG.method8434(var1.charAt(var10), (byte)63) & 255);
            if (var11 == '<') {
               var7 = var10;
            } else {
               if (var11 == '>' && var7 != -1) {
                  String var12 = var1.substring(var7 + 1, var10);
                  var7 = -1;
                  if (var12.equals("lt")) {
                     var11 = '<';
                  } else if (var12.equals("gt")) {
                     var11 = '>';
                  } else if (var12.equals("at")) {
                     var11 = '@';
                  } else {
                     if (!var12.equals("nbh")) {
                        if (var12.startsWith("img=")) {
                           try {
                              int var23;
                              if (var5 != null) {
                                 var23 = var5[var9];
                              } else {
                                 var23 = 0;
                              }

                              int var25;
                              if (var6 != null) {
                                 var25 = var6[var9];
                              } else {
                                 var25 = 0;
                              }

                              var9++;
                              int var26 = classJF.method6360(var12.substring(4), 513171061);
                              classYZ var27 = field25[var26];
                              classYZ.method13810(var27, var2 + var23, var3 + this.field8 - var27.field7120 + var25);
                              var2 += var27.field7124;
                              var8 = -1;
                           } catch (Exception var18) {
                           }
                        } else {
                           this.method110(var12);
                        }
                        continue;
                     }

                     var11 = '-';
                  }
               }

               if (var11 == 160) {
                  var11 = ' ';
               }

               if (var11 == '@') {
                  int var20 = var1.indexOf(64, var10 + 1);
                  if (var20 != -1 && var20 > var10 + 1) {
                     String var13 = var1.substring(var10 + 1, var20);
                     if (var13.matches("[a-zA-Z0-9_]+")) {
                        String var14 = classMI.method7575(var13, 1439950517);
                        if (var14 != null) {
                           var1 = var1.substring(0, var10) + var14 + var1.substring(var20 + 1);
                           var10--;
                           continue;
                        }
                     }
                  }
               }

               if (var7 == -1) {
                  if (this.field23 != null && var8 != -1) {
                     var2 += this.field23[(var8 << 8) + var11];
                  }

                  int var21 = this.field6[var11];
                  int var22 = this.field7[var11];
                  int var24;
                  if (var5 != null) {
                     var24 = var5[var9];
                  } else {
                     var24 = 0;
                  }

                  int var15;
                  if (var6 != null) {
                     var15 = var6[var9];
                  } else {
                     var15 = 0;
                  }

                  int var16;
                  if (var4 != null) {
                     var16 = var4[var9];
                  } else {
                     var16 = field12;
                  }

                  var9++;
                  if (var11 != ' ') {
                     if (field13 == 256) {
                        if (field14 != -1) {
                           method15(this.field4[var11], var2 + this.field5[var11] + 1 + var24, var3 + this.field3[var11] + 1 + var15, var21, var22, field14);
                        }

                        this.vmethod1(this.field4[var11], var2 + this.field5[var11] + var24, var3 + this.field3[var11] + var15, var21, var22, var16);
                     } else {
                        if (field14 != -1) {
                           method24(
                              this.field4[var11], var2 + this.field5[var11] + 1 + var24, var3 + this.field3[var11] + 1 + var15, var21, var22, field14, field13
                           );
                        }

                        this.vmethod0(this.field4[var11], var2 + this.field5[var11] + var24, var3 + this.field3[var11] + var15, var21, var22, var16, field13);
                     }
                  } else if (field18 > 0) {
                     field19 = field19 + field18;
                     var2 += field19 >> 8;
                     field19 &= 255;
                  }

                  int var17 = this.field24[var11];
                  if (field11 != -1) {
                     method13717(var2, var3 + (int)(this.field8 * 0.7), var17, field11);
                  }

                  if (field15 != -1) {
                     method13717(var2, var3 + this.field8, var17, field15);
                  }

                  var2 += var17;
                  var8 = var11;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("cy")
   public int method43(String var1, int var2) {
      return this.method38(var1, new int[]{var2}, field21);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("hf")
   public void method123(String var1, int var2, int var3, int var4, int var5) {
      this.method56(var1, var2, var3, var4, var5);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
   @ObfuscatedName("ah")
   public int method69(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == -1209164099) {
            var8 = 256;
         }

         method104(this, var6, var7);
         field13 = var8;
         if (var11 == 0) {
            var11 = this.field8;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.field9 + this.field10 + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.method38(var1, var12, field21);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         if (var10 == 0) {
            var14 = var3 + this.field9;
         } else if (var10 == 1) {
            var14 = var3 + this.field9 + (var5 - this.field9 - this.field10 - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this.field10 - (var13 - 1) * var11;
         } else {
            int var15 = (var5 - this.field9 - this.field10 - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + this.field9 + var15;
            var11 += var15;
         }

         for (int var16 = 0; var16 < var13; var16++) {
            if (var9 == 0) {
               this.method116(field21[var16], var2, var14);
            } else if (var9 == 1) {
               this.method116(field21[var16], var2 + (var4 - this.method36(field21[var16])) / 2, var14);
            } else if (var9 == 2) {
               this.method116(field21[var16], var2 + var4 - this.method36(field21[var16]), var14);
            } else if (var16 == var13 - 1) {
               this.method116(field21[var16], var2, var14);
            } else {
               this.method113(field21[var16], var4);
               this.method116(field21[var16], var2, var14);
               field18 = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   @ObfuscatedSignature(descriptor = "(C)I")
   @ObfuscatedName("aq")
   public int method33(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.field24[classOG.method8434(var1, (byte)-110) & 0xFF];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laaa;IIII)V")
   @ObfuscatedName("be")
   public static void method100(classAAA var0, int var1, int var2, int var3, int var4) {
      var3 -= var0.field8;
      int var5 = var1 & 0xFF;
      if (var5 != 32) {
         var0.vmethod1(var0.field4[var5], var2 + var0.field5[var5], var3 + var0.field3[var5], var0.field6[var5], var0.field7[var5], var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)Luq;")
   @ObfuscatedName("cn")
   public classUQ method50(String var1, int var2, int var3) {
      if (var1 != null && !var1.isEmpty()) {
         int var4 = this.method36(var1);
         int var5 = this.field9 + this.field10;
         int var6 = var2 - var4 / 2;
         int var7 = var3 - this.field9;
         return classPW.method9325(var6, var7, var4, var5, 1444081395);
      } else {
         return classPW.method9325(var2, var3, 0, 0, 1444081395);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("ad")
   public int method36(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for (int var5 = 0; var5 < var1.length(); var5++) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
               var2 = var5;
            } else {
               if (var6 == '>' && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var6 = '<';
                  } else if (var7.equals("gt")) {
                     var6 = '>';
                  } else if (var7.equals("at")) {
                     var6 = '@';
                  } else {
                     if (!var7.equals("nbh")) {
                        if (var7.startsWith("img=")) {
                           try {
                              int var11 = classJF.method6360(var7.substring(4), -1292548731);
                              var4 += field25[var11].field7124;
                              var3 = -1;
                           } catch (Exception var9) {
                           }
                        }
                        continue;
                     }

                     var6 = '-';
                  }
               }

               if (var6 == 160) {
                  var6 = ' ';
               }

               if (var6 == '@') {
                  int var10 = var1.indexOf(64, var5 + 1);
                  if (var10 != -1 && var10 > var5 + 1) {
                     String var8 = var1.substring(var5 + 1, var10);
                     if (var8.matches("[a-zA-Z0-9_]+") && classMI.method7575(var8, 1794977827) != null) {
                        var5 = var10;
                        continue;
                     }
                  }
               }

               if (var2 == -1) {
                  var4 += this.field24[(char)(classOG.method8434(var6, (byte)37) & 255)];
                  if (this.field23 != null && var3 != -1) {
                     var4 += this.field23[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("ck")
   public int method41(String var1, int var2) {
      int var3 = this.method38(var1, new int[]{var2}, field21);
      int var4 = 0;

      for (int var5 = 0; var5 < var3; var5++) {
         int var6 = this.method36(field21[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luz;)F")
   @ObfuscatedName("to")
   public static float method22(classUZ var0) {
      return (float)Math.sqrt(var0.field6426 * var0.field6426 + (var0.field6425 * var0.field6425 + var0.field6427 * var0.field6427));
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II[I[I[I)V")
   @ObfuscatedName("bw")
   void method121(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
      var3 -= this.field8;
      int var7 = -1;
      int var8 = -1;
      int var9 = 0;

      for (int var10 = 0; var10 < var1.length(); var10++) {
         if (var1.charAt(var10) != 0) {
            char var11 = (char)(classOG.method8434(var1.charAt(var10), (byte)-33) & 255);
            if (var11 == '<') {
               var7 = var10;
            } else {
               if (var11 == '>' && var7 != -1) {
                  String var12 = var1.substring(var7 + 1, var10);
                  var7 = -1;
                  if (var12.equals("lt")) {
                     var11 = '<';
                  } else if (var12.equals("gt")) {
                     var11 = '>';
                  } else if (var12.equals("at")) {
                     var11 = '@';
                  } else {
                     if (!var12.equals("nbh")) {
                        if (var12.startsWith("img=")) {
                           try {
                              int var23;
                              if (var5 != null) {
                                 var23 = var5[var9];
                              } else {
                                 var23 = 0;
                              }

                              int var25;
                              if (var6 != null) {
                                 var25 = var6[var9];
                              } else {
                                 var25 = 0;
                              }

                              var9++;
                              int var26 = classJF.method6360(var12.substring(4), -391589905);
                              classYZ var27 = field25[var26];
                              classYZ.method13810(var27, var2 + var23, var3 + this.field8 - var27.field7120 + var25);
                              var2 += var27.field7124;
                              var8 = -1;
                           } catch (Exception var18) {
                           }
                        } else {
                           this.method110(var12);
                        }
                        continue;
                     }

                     var11 = '-';
                  }
               }

               if (var11 == 160) {
                  var11 = ' ';
               }

               if (var11 == '@') {
                  int var20 = var1.indexOf(64, var10 + 1);
                  if (var20 != -1 && var20 > var10 + 1) {
                     String var13 = var1.substring(var10 + 1, var20);
                     if (var13.matches("[a-zA-Z0-9_]+")) {
                        String var14 = classMI.method7575(var13, 1376251450);
                        if (var14 != null) {
                           var1 = var1.substring(0, var10) + var14 + var1.substring(var20 + 1);
                           var10--;
                           continue;
                        }
                     }
                  }
               }

               if (var7 == -1) {
                  if (this.field23 != null && var8 != -1) {
                     var2 += this.field23[(var8 << 8) + var11];
                  }

                  int var21 = this.field6[var11];
                  int var22 = this.field7[var11];
                  int var24;
                  if (var5 != null) {
                     var24 = var5[var9];
                  } else {
                     var24 = 0;
                  }

                  int var15;
                  if (var6 != null) {
                     var15 = var6[var9];
                  } else {
                     var15 = 0;
                  }

                  int var16;
                  if (var4 != null) {
                     var16 = var4[var9];
                  } else {
                     var16 = field12;
                  }

                  var9++;
                  if (var11 != ' ') {
                     if (field13 == 256) {
                        if (field14 != -1) {
                           method15(this.field4[var11], var2 + this.field5[var11] + 1 + var24, var3 + this.field3[var11] + 1 + var15, var21, var22, field14);
                        }

                        this.vmethod1(this.field4[var11], var2 + this.field5[var11] + var24, var3 + this.field3[var11] + var15, var21, var22, var16);
                     } else {
                        if (field14 != -1) {
                           method24(
                              this.field4[var11], var2 + this.field5[var11] + 1 + var24, var3 + this.field3[var11] + 1 + var15, var21, var22, field14, field13
                           );
                        }

                        this.vmethod0(this.field4[var11], var2 + this.field5[var11] + var24, var3 + this.field3[var11] + var15, var21, var22, var16, field13);
                     }
                  } else if (field18 > 0) {
                     field19 = field19 + field18;
                     var2 += field19 >> 8;
                     field19 &= 255;
                  }

                  int var17 = this.field24[var11];
                  if (field11 != -1) {
                     method13717(var2, var3 + (int)(this.field8 * 0.7), var17, field11);
                  }

                  if (field15 != -1) {
                     method13717(var2, var3 + this.field8, var17, field15);
                  }

                  var2 += var17;
                  var8 = var11;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII[I)V")
   @ObfuscatedName("hb")
   public void method88(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         method104(this, var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.method94(var6, var1.length());
         }

         this.method121(var1, var2 - this.method36(var1) / 2, var3, var7, null, null);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)Luq;")
   @ObfuscatedName("cz")
   public classUQ method51(String var1, int var2, int var3) {
      if (var1 != null && !var1.isEmpty()) {
         int var4 = this.method36(var1);
         int var5 = this.field9 + this.field10;
         int var6 = var2 - var4 / 2;
         int var7 = var3 - this.field9;
         return classPW.method9325(var6, var7, var4, var5, 1444081395);
      } else {
         return classPW.method9325(var2, var3, 0, 0, 1444081395);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("ak")
   public void method56(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         method104(this, var4, var5);
         this.method116(var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("at")
   public void method63(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         method104(this, var4, var5);
         this.method116(var1, var2 - this.method36(var1), var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("an")
   public void method65(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         method104(this, var4, var5);
         this.method116(var1, var2 - this.method36(var1) / 2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIIIIIII)I")
   @ObfuscatedName("am")
   public int method66(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return method70(this, var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   @ObfuscatedSignature(descriptor = "([[B[[B[I[I[III)I")
   @ObfuscatedName("as")
   static int method6(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for (int var18 = var11; var18 < var12; var18++) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)V")
   @ObfuscatedName("ba")
   void method116(String var1, int var2, int var3) {
      var3 -= this.field8;
      int var4 = -1;
      int var5 = -1;

      for (int var6 = 0; var6 < var1.length(); var6++) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(classOG.method8434(var1.charAt(var6), (byte)-5) & 255);
            if (var7 == '<') {
               var4 = var6;
            } else {
               if (var7 == '@') {
                  int var8 = var1.indexOf(64, var6 + 1);
                  if (var8 != -1 && var8 > var6 + 1) {
                     String var9 = var1.substring(var6 + 1, var8);
                     if (var9.matches("[a-zA-Z0-9_]+")) {
                        String var10 = classMI.method7575(var9, 1447386009);
                        if (var10 != null) {
                           var1 = var1.substring(0, var6) + var10 + var1.substring(var8 + 1);
                           var6--;
                           continue;
                        }
                     }
                  }
               }

               if (var7 == '>' && var4 != -1) {
                  String var13 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var13.equals("lt")) {
                     var7 = '<';
                  } else if (var13.equals("gt")) {
                     var7 = '>';
                  } else if (var13.equals("at")) {
                     var7 = '@';
                  } else {
                     if (var13.startsWith("img=")) {
                        try {
                           int var16 = classJF.method6360(var13.substring(4), -502667014);
                           classYZ var18 = field25[var16];
                           classYZ.method13810(var18, var2, var3 + this.field8 - var18.field7120);
                           var2 += var18.field7124;
                           var5 = -1;
                        } catch (Exception var11) {
                        }
                        continue;
                     }

                     if (!var13.startsWith("nbh")) {
                        this.method110(var13);
                        continue;
                     }

                     var7 = '-';
                  }
               }

               if (var7 == 160) {
                  var7 = ' ';
               }

               if (var4 == -1) {
                  if (this.field23 != null && var5 != -1) {
                     var2 += this.field23[(var5 << 8) + var7];
                  }

                  int var14 = this.field6[var7];
                  int var15 = this.field7[var7];
                  if (var7 != ' ') {
                     if (field13 == 256) {
                        if (field14 != -1) {
                           method15(this.field4[var7], var2 + this.field5[var7] + 1, var3 + this.field3[var7] + 1, var14, var15, field14);
                        }

                        this.vmethod1(this.field4[var7], var2 + this.field5[var7], var3 + this.field3[var7], var14, var15, field12);
                     } else {
                        if (field14 != -1) {
                           method24(this.field4[var7], var2 + this.field5[var7] + 1, var3 + this.field3[var7] + 1, var14, var15, field14, field13);
                        }

                        this.vmethod0(this.field4[var7], var2 + this.field5[var7], var3 + this.field3[var7], var14, var15, field12, field13);
                     }
                  } else if (field18 > 0) {
                     field19 = field19 + field18;
                     var2 += field19 >> 8;
                     field19 &= 255;
                  }

                  int var17 = this.field24[var7];
                  if (field11 != -1) {
                     method13717(var2, var3 + (int)(this.field8 * 0.7), var17, field11);
                  }

                  if (field15 != -1) {
                     method13717(var2, var3 + this.field8 + 1, var17, field15);
                  }

                  var2 += var17;
                  var5 = var7;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII[I)V")
   @ObfuscatedName("bx")
   public void method76(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         method104(this, var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method94(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];

         for (int var10 = 0; var10 < var1.length(); var10++) {
            var9[var10] = (int)(Math.sin(var10 / 2.0 + var6 / 5.0) * 5.0);
         }

         this.method121(var1, var2 - this.method36(var1) / 2, var3, var8, null, var9);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIIII[I)V")
   @ObfuscatedName("bp")
   public void method85(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
      if (var1 != null) {
         method104(this, var4, var5);
         int[] var9 = null;
         if (var8 != null) {
            var9 = this.method94(var8, var1.length());
         }

         double var10 = 7.0 - var7 / 8.0;
         if (var10 < 0.0) {
            var10 = 0.0;
         }

         int[] var12 = new int[var1.length()];

         for (int var13 = 0; var13 < var1.length(); var13++) {
            var12[var13] = (int)(Math.sin(var13 / 1.5 + var6 / 1.0) * var10);
         }

         this.method121(var1, var2 - this.method36(var1) / 2, var3, var9, null, var12);
      }
   }

   @ObfuscatedSignature(descriptor = "(Laaa;II)V")
   @ObfuscatedName("it")
   public static void method104(classAAA var0, int var1, int var2) {
      if (var0 == null) {
         var0.method109(var1, var1);
      }

      field11 = -1;
      field15 = -1;
      field16 = var2;
      field14 = var2;
      field17 = var1;
      field12 = var1;
      field13 = 256;
      field18 = 0;
      field19 = 0;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("in")
   void method105(int var1, int var2) {
      field11 = -1;
      field15 = -1;
      field16 = var2;
      field14 = var2;
      field17 = var1;
      field12 = var1;
      field13 = 256;
      field18 = 0;
      field19 = 0;
   }

   classAAA(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, byte[][] var6) {
      this.field4 = new byte[256][];
      this.field5 = var2;
      this.field3 = var3;
      this.field6 = var4;
      this.field7 = var5;
      this.method30(var1);
      this.field4 = var6;
      int var7 = Integer.MAX_VALUE;
      int var8 = Integer.MIN_VALUE;

      for (int var9 = 0; var9 < 256; var9++) {
         if (this.field3[var9] < var7 && this.field7[var9] != 0) {
            var7 = this.field3[var9];
         }

         if (this.field3[var9] + this.field7[var9] > var8) {
            var8 = this.field3[var9] + this.field7[var9];
         }
      }

      this.field9 = this.field8 - var7;
      this.field10 = var8 - this.field8;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
   @ObfuscatedName("cs")
   public int method39(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         boolean var10 = false;
         boolean var11 = false;
         int var12 = -1;
         int var13 = 0;
         byte var14 = 0;
         int var15 = -1;
         int var16 = 0;
         int var17 = 0;
         int var18 = var1.length();

         for (int var19 = 0; var19 < var18; var19++) {
            boolean var20 = false;
            char var21 = var1.charAt(var19);
            if (var21 == 1065059540) {
               var15 = var19;
            } else {
               if (var21 == 753719724 && var15 != -1) {
                  String var22 = var1.substring(var15 + 1, var19);
                  var15 = -1;
                  var6.append('<');
                  var6.append(var22);
                  var6.append((char)441602009);
                  if (var22.equals("br") || var22.equals("n")) {
                     var3[var17++] = var6.substring(var5);
                     var6.setLength(0);
                     var5 = 0;
                     var4 = 0;
                     var7 = -1;
                     var16 = 0;
                     var12 = -1;
                     var10 = false;
                     var11 = false;
                  }

                  if (var22.equals("shy")) {
                     var12 = var7;
                     var13 = var8;
                     var11 = var10;
                     var14 = var9;
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                     var10 = true;
                  } else if (var22.equals("lt")) {
                     var4 += this.method33('<');
                     if (this.field23 != null && var16 != -1) {
                        var4 += this.field23[(var16 << 8) + -129604452];
                     }

                     var16 = -1106811396;
                  } else if (var22.equals("gt")) {
                     var4 += this.method33((char)-1774265490);
                     if (this.field23 != null && var16 != -1) {
                        var4 += this.field23[(var16 << 8) + -1222133715];
                     }

                     var16 = -492422575;
                  } else if (var22.equals("at")) {
                     var4 += this.method33('@');
                     if (this.field23 != null && var16 != -1) {
                        var4 += this.field23[(var16 << 8) + 383849428];
                     }

                     var16 = 1893186817;
                  } else if (var22.startsWith("img=")) {
                     try {
                        int var23 = classJF.method6360(var22.substring(4), 1667249669);
                        var4 += field25[var23].field7124;
                        var16 = 0;
                     } catch (Exception var26) {
                     }
                  } else if (var22.equals("nbh")) {
                     var4 += this.method33('-');
                     if (this.field23 != null && var16 != -1) {
                        var4 += this.field23[(var16 << 8) + 1997395992];
                     }

                     var20 = true;
                     var16 = 578384454;
                  }

                  var21 = 0;
               }

               if (var21 == 617769849) {
                  int var27 = var1.indexOf(64, var19 + 1);
                  if (var27 != -1 && var27 > var19 + 1) {
                     String var29 = var1.substring(var19 + 1, var27);
                     if (var29.matches("[a-zA-Z0-9_]+") && classMI.method7575(var29, 1378426314) != null) {
                        var6.append(var1, var19, var27 + 1);
                        var19 = var27;
                        continue;
                     }
                  }
               }

               if (var15 == -1) {
                  if (var21 != 0) {
                     var6.append(var21);
                     var4 += this.method33(var21);
                     if (this.field23 != null && var16 != -1) {
                        var4 += this.field23[(var16 << 8) + var21];
                     }

                     var16 = var21;
                  }

                  if (var21 == ' ') {
                     var12 = var7;
                     var13 = var8;
                     var11 = var10;
                     var14 = var9;
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                     var10 = false;
                  }

                  if (var2 != null && var4 > var2[var17 < var2.length ? var17 : var2.length - 1] && var7 >= 0) {
                     if (var10) {
                        int var28 = var2[var17 < var2.length ? var17 : var2.length - 1];
                        String var30 = var6.substring(var5, var7);
                        boolean var24 = this.method36(var30 + '-') <= var28;
                        boolean var25 = !var24 && var12 >= 0 && this.method36(var6.substring(var5, var12) + (var11 ? "-" : "")) <= var28;
                        if (var25) {
                           var3[var17++] = var11 ? var6.substring(var5, var12) + '-' : var6.substring(var5, var12 - var14);
                           var5 = var12;
                           var4 -= var13;
                        } else {
                           var3[var17++] = var30 + 1717667313;
                           var5 = var7;
                           var4 -= var8;
                        }
                     } else {
                        var3[var17++] = var6.substring(var5, var7 - var9);
                        var5 = var7;
                        var4 -= var8;
                     }

                     var7 = -1;
                     var16 = 0;
                     var10 = false;
                     var12 = -1;
                     var11 = false;
                  }

                  if (var21 == -1820782268 && !var20) {
                     var12 = var7;
                     var13 = var8;
                     var11 = var10;
                     var14 = var9;
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                     var10 = false;
                  }
               }
            }
         }

         if (var6.length() > var5) {
            var3[var17++] = var6.substring(var5);
         }

         return var17;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII)V")
   @ObfuscatedName("av")
   public void method97(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         method104(this, var4, var5);
         field20.setSeed(var6);
         field13 = 192 + (field20.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for (int var9 = 0; var9 < var1.length(); var9++) {
            var7[var9] = var8;
            if ((field20.nextInt() & 3) == 0) {
               var8++;
            }
         }

         this.method121(var1, var2, var3, null, var7, null);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("bj")
   public void method101(int var1, int var2, int var3, int var4) {
      var3 -= this.field8;
      int var5 = var1 & 0xFF;
      if (var5 != 32) {
         this.vmethod1(this.field4[var5], var2 + this.field5[var5], var3 + this.field3[var5], this.field6[var5], this.field7[var5], var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("bo")
   void method110(String var1) {
      try {
         if (var1.startsWith("col=")) {
            String var3 = var1.substring(4);
            int var2 = classOH.method8449(var3, 16, true, -425993597);
            field12 = var2;
         } else if (var1.equals("/col")) {
            field12 = field17;
         } else if (var1.startsWith("str=")) {
            String var8 = var1.substring(4);
            int var5 = classOH.method8449(var8, 16, true, -467849606);
            field11 = var5;
         } else if (var1.equals("str")) {
            field11 = 8388608;
         } else if (var1.equals("/str")) {
            field11 = -1;
         } else if (var1.startsWith("u=")) {
            String var9 = var1.substring(2);
            int var6 = classOH.method8449(var9, 16, true, 914178151);
            field15 = var6;
         } else if (var1.equals("u")) {
            field15 = 0;
         } else if (var1.equals("/u")) {
            field15 = -1;
         } else if (var1.startsWith("shad=")) {
            String var10 = var1.substring(5);
            int var7 = classOH.method8449(var10, 16, true, 2065929245);
            field14 = var7;
         } else if (var1.equals("shad")) {
            field14 = 0;
         } else if (var1.equals("/shad")) {
            field14 = field16;
         } else if (var1.equals("br")) {
            method104(this, field17, field16);
         }
      } catch (Exception var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("bu")
   void method113(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for (int var5 = 0; var5 < var1.length(); var5++) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            var3++;
         }
      }

      if (var3 > 0) {
         field18 = (var2 - this.method36(var1) << 8) / var3;
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("aa")
   static void method15(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * field7102;
      int var7 = field7102 - var3;
      int var8 = 0;
      int var9 = 0;
      if (var2 < field7096) {
         int var10 = field7096 - var2;
         var4 -= var10;
         var2 = field7096;
         var9 += var10 * var3;
         var6 += var10 * field7102;
      }

      if (var2 + var4 > field7098) {
         var4 -= var2 + var4 - field7098;
      }

      if (var1 < field7097) {
         int var11 = field7097 - var1;
         var3 -= var11;
         var1 = field7097;
         var9 += var11;
         var6 += var11;
         var8 += var11;
         var7 += var11;
      }

      if (var1 + var3 > field7099) {
         int var12 = var1 + var3 - field7099;
         var3 -= var12;
         var8 += var12;
         var7 += var12;
      }

      if (var3 > 0 && var4 > 0) {
         method21(field7104, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("ig")
   void method106(int var1, int var2) {
      field11 = -1;
      field15 = -1;
      field16 = var2;
      field14 = var2;
      field17 = var1;
      field12 = var1;
      field13 = 256;
      field18 = 0;
      field19 = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laaa;[B)V")
   @ObfuscatedName("nw")
   public static void method27(classAAA var0, byte[] var1) {
      if (var0 == null) {
         var0.method32(var1);
      } else {
         var0.field24 = new int[256];
         if (var1.length == 257) {
            for (int var2 = 0; var2 < var0.field24.length; var2++) {
               var0.field24[var2] = var1[var2] & 255;
            }

            var0.field8 = var1[256] & 255;
         } else {
            int var10 = 0;

            for (int var3 = 0; var3 < 256; var3++) {
               var0.field24[var3] = var1[var10++] & 255;
            }

            int[] var11 = new int[256];
            int[] var4 = new int[256];

            for (int var5 = 0; var5 < 256; var5++) {
               var11[var5] = var1[var10++] & 255;
            }

            for (int var12 = 0; var12 < 256; var12++) {
               var4[var12] = var1[var10++] & 255;
            }

            byte[][] var13 = new byte[256][];

            for (int var6 = 0; var6 < 256; var6++) {
               var13[var6] = new byte[var11[var6]];
               byte var7 = 0;

               for (int var8 = 0; var8 < var13[var6].length; var8++) {
                  var7 += var1[var10++];
                  var13[var6][var8] = var7;
               }
            }

            byte[][] var14 = new byte[256][];

            for (int var15 = 0; var15 < 256; var15++) {
               var14[var15] = new byte[var11[var15]];
               byte var17 = 0;

               for (int var9 = 0; var9 < var14[var15].length; var9++) {
                  var17 += var1[var10++];
                  var14[var15][var9] = var17;
               }
            }

            var0.field23 = new byte[65536];

            for (int var16 = 0; var16 < 256; var16++) {
               if (var16 != 32 && var16 != 160) {
                  for (int var18 = 0; var18 < 256; var18++) {
                     if (var18 != 32 && var18 != 160) {
                        var0.field23[(var16 << 8) + var18] = (byte)method6(var13, var14, var4, var0.field24, var11, var16, var18);
                     }
                  }
               }
            }

            var0.field8 = var4[32] + var11[32];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("af")
   abstract void vmethod0(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("az")
   abstract void vmethod1(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("ae")
   abstract void vmethod2(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("ab")
   abstract void vmethod3(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("ag")
   abstract void vmethod4(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public int getBaseline() {
      return this.field8;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([[B[[B[I[I[III)I")
   @ObfuscatedName("bb")
   static int method7(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for (int var18 = var11; var18 < var12; var18++) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("it")
   void method107(int var1, int var2) {
      field11 = -1;
      field15 = -1;
      field16 = var2;
      field14 = var2;
      field17 = var1;
      field12 = var1;
      field13 = 256;
      field18 = 0;
      field19 = 0;
   }

   @ObfuscatedSignature(descriptor = "([II)[I")
   @ObfuscatedName("hs")
   int[] method93(int[] var1, int var2) {
      if (var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];
         float var4 = (float)var1.length / var2;

         for (int var5 = 0; var5 < var2; var5++) {
            var3[var5] = var1[(int)(var5 * var4)];
         }

         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("il")
   void method108(int var1, int var2) {
      field11 = -1;
      field15 = -1;
      field16 = var2;
      field14 = var2;
      field17 = var1;
      field12 = var1;
      field13 = 256;
      field18 = 0;
      field19 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Laaa;Ljava/lang/String;IIIIIIIIII)I")
   @ObfuscatedName("qu")
   public static int method70(classAAA var0, String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var0 == null) {
         return var0.method71(var1, var2, var2, var2, var2, var2, var2, var2, var2, var2, var2);
      } else if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = 256;
         }

         method104(var0, var6, var7);
         field13 = var8;
         if (var11 == 0) {
            var11 = var0.field8;
         }

         int[] var12 = new int[]{var4};
         if (var5 < var0.field9 + var0.field10 + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = var0.method38(var1, var12, field21);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         if (var10 == 0) {
            var14 = var3 + var0.field9;
         } else if (var10 == 1) {
            var14 = var3 + var0.field9 + (var5 - var0.field9 - var0.field10 - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - var0.field10 - (var13 - 1) * var11;
         } else {
            int var15 = (var5 - var0.field9 - var0.field10 - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + var0.field9 + var15;
            var11 += var15;
         }

         for (int var16 = 0; var16 < var13; var16++) {
            if (var9 == 0) {
               var0.method116(field21[var16], var2, var14);
            } else if (var9 == 1) {
               var0.method116(field21[var16], var2 + (var4 - var0.method36(field21[var16])) / 2, var14);
            } else if (var9 == 2) {
               var0.method116(field21[var16], var2 + var4 - var0.method36(field21[var16]), var14);
            } else if (var16 == var13 - 1) {
               var0.method116(field21[var16], var2, var14);
            } else {
               var0.method113(field21[var16], var4);
               var0.method116(field21[var16], var2, var14);
               field18 = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("bq")
   public static boolean method12(String var0) {
      if (var0.startsWith("col=")) {
         return true;
      } else if (var0.equals("/col")) {
         return true;
      } else if (var0.startsWith("u=")) {
         return true;
      } else if (var0.equals("u")) {
         return true;
      } else if (var0.equals("/u")) {
         return true;
      } else if (var0.startsWith("shad=")) {
         return true;
      } else if (var0.equals("shad")) {
         return true;
      } else if (var0.equals("/shad")) {
         return true;
      } else if (var0.startsWith("str=")) {
         return true;
      } else if (var0.equals("str")) {
         return true;
      } else if (var0.equals("/str")) {
         return true;
      } else if (var0.equals("br")) {
         return true;
      } else if (var0.equals("lt")) {
         return true;
      } else if (var0.equals("gt")) {
         return true;
      } else {
         return var0.startsWith("img=") ? true : var0.equals("at");
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("bf")
   public static boolean method13(String var0) {
      if (var0.startsWith("col=")) {
         return true;
      } else if (var0.equals("/col")) {
         return true;
      } else if (var0.startsWith("u=")) {
         return true;
      } else if (var0.equals("u")) {
         return true;
      } else if (var0.equals("/u")) {
         return true;
      } else if (var0.startsWith("shad=")) {
         return true;
      } else if (var0.equals("shad")) {
         return true;
      } else if (var0.equals("/shad")) {
         return true;
      } else if (var0.startsWith("str=")) {
         return true;
      } else if (var0.equals("str")) {
         return true;
      } else if (var0.equals("/str")) {
         return true;
      } else if (var0.equals("br")) {
         return true;
      } else if (var0.equals("lt")) {
         return true;
      } else if (var0.equals("gt")) {
         return true;
      } else {
         return var0.startsWith("img=") ? true : var0.equals("at");
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("bs")
   static void method16(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * field7102;
      int var7 = field7102 - var3;
      int var8 = 0;
      int var9 = 0;
      if (var2 < field7096) {
         int var10 = field7096 - var2;
         var4 -= var10;
         var2 = field7096;
         var9 += var10 * var3;
         var6 += var10 * field7102;
      }

      if (var2 + var4 > field7098) {
         var4 -= var2 + var4 - field7098;
      }

      if (var1 < field7097) {
         int var11 = field7097 - var1;
         var3 -= var11;
         var1 = field7097;
         var9 += var11;
         var6 += var11;
         var8 += var11;
         var7 += var11;
      }

      if (var1 + var3 > field7099) {
         int var12 = var1 + var3 - field7099;
         var3 -= var12;
         var8 += var12;
         var7 += var12;
      }

      if (var3 > 0 && var4 > 0) {
         method21(field7104, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laaa;Ljava/lang/String;II)V")
   @ObfuscatedName("vx")
   public static void method117(classAAA var0, String var1, int var2, int var3) {
      var3 -= var0.field8;
      int var4 = -1;
      int var5 = -1;

      for (int var6 = 0; var6 < var1.length(); var6++) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(classOG.method8434(var1.charAt(var6), (byte)-10) & 255);
            if (var7 == '<') {
               var4 = var6;
            } else {
               if (var7 == '@') {
                  int var8 = var1.indexOf(64, var6 + 1);
                  if (var8 != -1 && var8 > var6 + 1) {
                     String var9 = var1.substring(var6 + 1, var8);
                     if (var9.matches("[a-zA-Z0-9_]+")) {
                        String var10 = classMI.method7575(var9, 829664098);
                        if (var10 != null) {
                           var1 = var1.substring(0, var6) + var10 + var1.substring(var8 + 1);
                           var6--;
                           continue;
                        }
                     }
                  }
               }

               if (var7 == '>' && var4 != -1) {
                  String var13 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var13.equals("lt")) {
                     var7 = '<';
                  } else if (var13.equals("gt")) {
                     var7 = '>';
                  } else if (var13.equals("at")) {
                     var7 = '@';
                  } else {
                     if (var13.startsWith("img=")) {
                        try {
                           int var16 = classJF.method6360(var13.substring(4), -1154886137);
                           classYZ var18 = field25[var16];
                           classYZ.method13810(var18, var2, var3 + var0.field8 - var18.field7120);
                           var2 += var18.field7124;
                           var5 = -1;
                        } catch (Exception var11) {
                        }
                        continue;
                     }

                     if (!var13.startsWith("nbh")) {
                        var0.method110(var13);
                        continue;
                     }

                     var7 = '-';
                  }
               }

               if (var7 == 160) {
                  var7 = ' ';
               }

               if (var4 == -1) {
                  if (var0.field23 != null && var5 != -1) {
                     var2 += var0.field23[(var5 << 8) + var7];
                  }

                  int var14 = var0.field6[var7];
                  int var15 = var0.field7[var7];
                  if (var7 != ' ') {
                     if (field13 == 256) {
                        if (field14 != -1) {
                           method15(var0.field4[var7], var2 + var0.field5[var7] + 1, var3 + var0.field3[var7] + 1, var14, var15, field14);
                        }

                        var0.vmethod1(var0.field4[var7], var2 + var0.field5[var7], var3 + var0.field3[var7], var14, var15, field12);
                     } else {
                        if (field14 != -1) {
                           method24(var0.field4[var7], var2 + var0.field5[var7] + 1, var3 + var0.field3[var7] + 1, var14, var15, field14, field13);
                        }

                        var0.vmethod0(var0.field4[var7], var2 + var0.field5[var7], var3 + var0.field3[var7], var14, var15, field12, field13);
                     }
                  } else if (field18 > 0) {
                     field19 = field19 + field18;
                     var2 += field19 >> 8;
                     field19 &= 255;
                  }

                  int var17 = var0.field24[var7];
                  if (field11 != -1) {
                     method13717(var2, var3 + (int)(var0.field8 * 0.7), var17, field11);
                  }

                  if (field15 != -1) {
                     method13717(var2, var3 + var0.field8 + 1, var17, field15);
                  }

                  var2 += var17;
                  var5 = var7;
               }
            }
         }
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("bd")
   static void method17(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * field7102;
      int var7 = field7102 - var3;
      int var8 = 0;
      int var9 = 0;
      if (var2 < field7096) {
         int var10 = field7096 - var2;
         var4 -= var10;
         var2 = field7096;
         var9 += var10 * var3;
         var6 += var10 * field7102;
      }

      if (var2 + var4 > field7098) {
         var4 -= var2 + var4 - field7098;
      }

      if (var1 < field7097) {
         int var11 = field7097 - var1;
         var3 -= var11;
         var1 = field7097;
         var9 += var11;
         var6 += var11;
         var8 += var11;
         var7 += var11;
      }

      if (var1 + var3 > field7099) {
         int var12 = var1 + var3 - field7099;
         var3 -= var12;
         var8 += var12;
         var7 += var12;
      }

      if (var3 > 0 && var4 > 0) {
         method21(field7104, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BIIIII)V")
   @ObfuscatedName("bl")
   static void method18(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * field7102;
      int var7 = field7102 - var3;
      int var8 = 0;
      int var9 = 0;
      if (var2 < field7096) {
         int var10 = field7096 - var2;
         var4 -= var10;
         var2 = field7096;
         var9 += var10 * var3;
         var6 += var10 * field7102;
      }

      if (var2 + var4 > field7098) {
         var4 -= var2 + var4 - field7098;
      }

      if (var1 < field7097) {
         int var11 = field7097 - var1;
         var3 -= var11;
         var1 = field7097;
         var9 += var11;
         var6 += var11;
         var8 += var11;
         var7 += var11;
      }

      if (var1 + var3 > field7099) {
         int var12 = var1 + var3 - field7099;
         var3 -= var12;
         var8 += var12;
         var7 += var12;
      }

      if (var3 > 0 && var4 > 0) {
         method21(field7104, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[BIIIIIII)V")
   @ObfuscatedName("bv")
   static void method19(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }
         }

         for (int var19 = var5; var19 < 0; var19++) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[BIIIIIII)V")
   @ObfuscatedName("bh")
   static void method20(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }
         }

         for (int var19 = var5; var19 < 0; var19++) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("bz")
   static void method23(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * field7102;
      int var8 = field7102 - var3;
      int var9 = 0;
      int var10 = 0;
      if (var2 < field7096) {
         int var11 = field7096 - var2;
         var4 -= var11;
         var2 = field7096;
         var10 += var11 * var3;
         var7 += var11 * field7102;
      }

      if (var2 + var4 > field7098) {
         var4 -= var2 + var4 - field7098;
      }

      if (var1 < field7097) {
         int var12 = field7097 - var1;
         var3 -= var12;
         var1 = field7097;
         var10 += var12;
         var7 += var12;
         var9 += var12;
         var8 += var12;
      }

      if (var1 + var3 > field7099) {
         int var13 = var1 + var3 - field7099;
         var3 -= var13;
         var9 += var13;
         var8 += var13;
      }

      if (var3 > 0 && var4 > 0) {
         method26(field7104, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "([I[BIIIIIIII)V")
   @ObfuscatedName("cr")
   static void method25(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & -1538875245) * var9 & -2088909319) + ((var2 & 1207973400) * var9 & 0xFF0000) >> 8;
      var9 = -562600044 - var9;

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = -var5; var11 < 0; var11++) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 16711935) * var9 & -1098048938) + ((var12 & 0xFF00) * var9 & -818560280) >> 8) + var2;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ObfuscatedSignature(descriptor = "([II)[I")
   @ObfuscatedName("bt")
   int[] method94(int[] var1, int var2) {
      if (var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];
         float var4 = (float)var1.length / var2;

         for (int var5 = 0; var5 < var2; var5++) {
            var3[var5] = var1[(int)(var5 * var4)];
         }

         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laaa;Ljava/lang/String;IIIIII[I)V")
   @ObfuscatedName("ko")
   public static void method86(classAAA var0, String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
      if (var0 == null) {
         var0.method91(var1, var2, var2, var2, var2, var8);
      }

      if (var1 != null) {
         method104(var0, var4, var5);
         int[] var9 = null;
         if (var8 != null) {
            var9 = var0.method94(var8, var1.length());
         }

         double var10 = 7.0 - var7 / 8.0;
         if (var10 < 0.0) {
            var10 = 0.0;
         }

         int[] var12 = new int[var1.length()];

         for (int var13 = 0; var13 < var1.length(); var13++) {
            var12[var13] = (int)(Math.sin(var13 / 1.5 + var6 / 1.0) * var10);
         }

         var0.method121(var1, var2 - var0.method36(var1) / 2, var3, var9, null, var12);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laaa;[II)[I")
   @ObfuscatedName("qm")
   public static int[] method95(classAAA var0, int[] var1, int var2) {
      if (var0 == null) {
         var0.method105(var2, var2);
      }

      if (var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];
         float var4 = (float)var1.length / var2;

         for (int var5 = 0; var5 < var2; var5++) {
            var3[var5] = var1[(int)(var5 * var4)];
         }

         return var3;
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laq;)V")
   @ObfuscatedName("eo")
   public static void method5(classAQ var0) {
      if (var0 == null) {
         var0.method654();
      } else {
         var0.field253 = 0;
         var0.field257 = 0;
         var0.field255 = 0;
         var0.field256 = 0;
         var0.field252 = 0;
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ct")
   void method28(byte[] var1) {
      this.field24 = new int[256];
      if (var1.length == 257) {
         for (int var2 = 0; var2 < this.field24.length; var2++) {
            this.field24[var2] = var1[var2] & 255;
         }

         this.field8 = var1[256] & 255;
      } else {
         int var10 = 0;

         for (int var3 = 0; var3 < 256; var3++) {
            this.field24[var3] = var1[var10++] & 255;
         }

         int[] var11 = new int[256];
         int[] var4 = new int[256];

         for (int var5 = 0; var5 < 256; var5++) {
            var11[var5] = var1[var10++] & 255;
         }

         for (int var12 = 0; var12 < 256; var12++) {
            var4[var12] = var1[var10++] & 255;
         }

         byte[][] var13 = new byte[256][];

         for (int var6 = 0; var6 < 256; var6++) {
            var13[var6] = new byte[var11[var6]];
            byte var7 = 0;

            for (int var8 = 0; var8 < var13[var6].length; var8++) {
               var7 += var1[var10++];
               var13[var6][var8] = var7;
            }
         }

         byte[][] var14 = new byte[256][];

         for (int var15 = 0; var15 < 256; var15++) {
            var14[var15] = new byte[var11[var15]];
            byte var17 = 0;

            for (int var9 = 0; var9 < var14[var15].length; var9++) {
               var17 += var1[var10++];
               var14[var15][var9] = var17;
            }
         }

         this.field23 = new byte[65536];

         for (int var16 = 0; var16 < 256; var16++) {
            if (var16 != 32 && var16 != 160) {
               for (int var18 = 0; var18 < 256; var18++) {
                  if (var18 != 32 && var18 != 160) {
                     this.field23[(var16 << 8) + var18] = (byte)method6(var13, var14, var4, this.field24, var11, var16, var18);
                  }
               }
            }
         }

         this.field8 = var4[32] + var11[32];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laaa;Ljava/lang/String;I)V")
   @ObfuscatedName("hh")
   public static void method114(classAAA var0, String var1, int var2) {
      if (var0 == null) {
         var0.method60(var1, var2, var2, var2, var2, var2);
      }

      int var3 = 0;
      boolean var4 = false;

      for (int var5 = 0; var5 < var1.length(); var5++) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            var3++;
         }
      }

      if (var3 > 0) {
         field18 = (var2 - var0.method36(var1) << 8) / var3;
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("cu")
   void method29(byte[] var1) {
      this.field24 = new int[-1172444853];
      if (var1.length == 257) {
         for (int var2 = 0; var2 < this.field24.length; var2++) {
            this.field24[var2] = var1[var2] & 86187801;
         }

         this.field8 = var1[256] & 255;
      } else {
         int var10 = 0;

         for (int var3 = 0; var3 < 1910073224; var3++) {
            this.field24[var3] = var1[var10++] & 255;
         }

         int[] var11 = new int[-1010503531];
         int[] var4 = new int[1975603299];

         for (int var5 = 0; var5 < 256; var5++) {
            var11[var5] = var1[var10++] & 255;
         }

         for (int var12 = 0; var12 < 256; var12++) {
            var4[var12] = var1[var10++] & 884786397;
         }

         byte[][] var13 = new byte[256][];

         for (int var6 = 0; var6 < -698515725; var6++) {
            var13[var6] = new byte[var11[var6]];
            byte var7 = 0;

            for (int var8 = 0; var8 < var13[var6].length; var8++) {
               var7 += var1[var10++];
               var13[var6][var8] = var7;
            }
         }

         byte[][] var14 = new byte[-1604088496][];

         for (int var15 = 0; var15 < 256; var15++) {
            var14[var15] = new byte[var11[var15]];
            byte var17 = 0;

            for (int var9 = 0; var9 < var14[var15].length; var9++) {
               var17 += var1[var10++];
               var14[var15][var9] = var17;
            }
         }

         this.field23 = new byte[65536];

         for (int var16 = 0; var16 < 256; var16++) {
            if (var16 != 32 && var16 != 1683998287) {
               for (int var18 = 0; var18 < -318024517; var18++) {
                  if (var18 != -185047505 && var18 != 160) {
                     this.field23[(var16 << 8) + var18] = (byte)method6(var13, var14, var4, this.field24, var11, var16, var18);
                  }
               }
            }
         }

         this.field8 = var4[1353554333] + var11[-1183213315];
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Z")
   @ObfuscatedName("by")
   public static boolean method14(String var0) {
      if (var0.startsWith("col=")) {
         return true;
      } else if (var0.equals("/col")) {
         return true;
      } else if (var0.startsWith("u=")) {
         return true;
      } else if (var0.equals("u")) {
         return true;
      } else if (var0.equals("/u")) {
         return true;
      } else if (var0.startsWith("shad=")) {
         return true;
      } else if (var0.equals("shad")) {
         return true;
      } else if (var0.equals("/shad")) {
         return true;
      } else if (var0.startsWith("str=")) {
         return true;
      } else if (var0.equals("str")) {
         return true;
      } else if (var0.equals("/str")) {
         return true;
      } else if (var0.equals("br")) {
         return true;
      } else if (var0.equals("lt")) {
         return true;
      } else if (var0.equals("gt")) {
         return true;
      } else {
         return var0.startsWith("img=") ? true : var0.equals("at");
      }
   }

   public void drawWidgetText(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      method70(this, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ObfuscatedSignature(descriptor = "(C)I")
   @ObfuscatedName("cq")
   public int method34(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.field24[classOG.method8434(var1, (byte)106) & 0xFF];
   }

   @ObfuscatedSignature(descriptor = "(C)I")
   @ObfuscatedName("cl")
   public int method35(char var1) {
      if (var1 == -804971561) {
         var1 = 987730910;
      }

      return this.field24[classOG.method8434((char)var1, (byte)2) & -156050424];
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)I")
   @ObfuscatedName("cd")
   public int method37(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for (int var5 = 0; var5 < var1.length(); var5++) {
            int var6 = var1.charAt(var5);
            if (var6 == -1306945254) {
               var2 = var5;
            } else {
               if (var6 == 62 && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var6 = 689259753;
                  } else if (var7.equals("gt")) {
                     var6 = 62;
                  } else if (var7.equals("at")) {
                     var6 = -141538784;
                  } else {
                     if (!var7.equals("nbh")) {
                        if (var7.startsWith("img=")) {
                           try {
                              int var11 = classJF.method6360(var7.substring(4), 1514872175);
                              var4 += field25[var11].field7124;
                              var3 = -1;
                           } catch (Exception var9) {
                           }
                        }
                        continue;
                     }

                     var6 = 1886180310;
                  }
               }

               if (var6 == 160) {
                  var6 = -689914951;
               }

               if (var6 == 64) {
                  int var10 = var1.indexOf(184105838, var5 + 1);
                  if (var10 != -1 && var10 > var5 + 1) {
                     String var8 = var1.substring(var5 + 1, var10);
                     if (var8.matches("[a-zA-Z0-9_]+") && classMI.method7575(var8, 1468218026) != null) {
                        var5 = var10;
                        continue;
                     }
                  }
               }

               if (var2 == -1) {
                  var4 += this.field24[(char)(classOG.method8434((char)var6, (byte)31) & -2119086763)];
                  if (this.field23 != null && var3 != -1) {
                     var4 += this.field23[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
   @ObfuscatedName("cv")
   public int method40(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         boolean var10 = false;
         boolean var11 = false;
         int var12 = -1;
         int var13 = 0;
         byte var14 = 0;
         int var15 = -1;
         char var16 = 0;
         int var17 = 0;
         int var18 = var1.length();

         for (int var19 = 0; var19 < var18; var19++) {
            boolean var20 = false;
            char var21 = var1.charAt(var19);
            if (var21 == '<') {
               var15 = var19;
            } else {
               if (var21 == '>' && var15 != -1) {
                  String var22 = var1.substring(var15 + 1, var19);
                  var15 = -1;
                  var6.append('<');
                  var6.append(var22);
                  var6.append('>');
                  if (var22.equals("br") || var22.equals("n")) {
                     var3[var17++] = var6.substring(var5);
                     var6.setLength(0);
                     var5 = 0;
                     var4 = 0;
                     var7 = -1;
                     var16 = 0;
                     var12 = -1;
                     var10 = false;
                     var11 = false;
                  }

                  if (var22.equals("shy")) {
                     var12 = var7;
                     var13 = var8;
                     var11 = var10;
                     var14 = var9;
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                     var10 = true;
                  } else if (var22.equals("lt")) {
                     var4 += this.method33('<');
                     if (this.field23 != null && var16 != -1) {
                        var4 += this.field23[(var16 << '\b') + 60];
                     }

                     var16 = '<';
                  } else if (var22.equals("gt")) {
                     var4 += this.method33('>');
                     if (this.field23 != null && var16 != -1) {
                        var4 += this.field23[(var16 << '\b') + 62];
                     }

                     var16 = '>';
                  } else if (var22.equals("at")) {
                     var4 += this.method33('@');
                     if (this.field23 != null && var16 != -1) {
                        var4 += this.field23[(var16 << '\b') + 64];
                     }

                     var16 = '@';
                  } else if (var22.startsWith("img=")) {
                     try {
                        int var23 = classJF.method6360(var22.substring(4), -1343760267);
                        var4 += field25[var23].field7124;
                        var16 = 0;
                     } catch (Exception var26) {
                     }
                  } else if (var22.equals("nbh")) {
                     var4 += this.method33('-');
                     if (this.field23 != null && var16 != -1) {
                        var4 += this.field23[(var16 << '\b') + 45];
                     }

                     var20 = true;
                     var16 = '-';
                  }

                  var21 = 0;
               }

               if (var21 == '@') {
                  int var27 = var1.indexOf(64, var19 + 1);
                  if (var27 != -1 && var27 > var19 + 1) {
                     String var29 = var1.substring(var19 + 1, var27);
                     if (var29.matches("[a-zA-Z0-9_]+") && classMI.method7575(var29, 1328941031) != null) {
                        var6.append(var1, var19, var27 + 1);
                        var19 = var27;
                        continue;
                     }
                  }
               }

               if (var15 == -1) {
                  if (var21 != 0) {
                     var6.append(var21);
                     var4 += this.method33(var21);
                     if (this.field23 != null && var16 != -1) {
                        var4 += this.field23[(var16 << '\b') + var21];
                     }

                     var16 = var21;
                  }

                  if (var21 == ' ') {
                     var12 = var7;
                     var13 = var8;
                     var11 = var10;
                     var14 = var9;
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                     var10 = false;
                  }

                  if (var2 != null && var4 > var2[var17 < var2.length ? var17 : var2.length - 1] && var7 >= 0) {
                     if (var10) {
                        int var28 = var2[var17 < var2.length ? var17 : var2.length - 1];
                        String var30 = var6.substring(var5, var7);
                        boolean var24 = this.method36(var30 + '-') <= var28;
                        boolean var25 = !var24 && var12 >= 0 && this.method36(var6.substring(var5, var12) + (var11 ? "-" : "")) <= var28;
                        if (var25) {
                           var3[var17++] = var11 ? var6.substring(var5, var12) + '-' : var6.substring(var5, var12 - var14);
                           var5 = var12;
                           var4 -= var13;
                        } else {
                           var3[var17++] = var30 + '-';
                           var5 = var7;
                           var4 -= var8;
                        }
                     } else {
                        var3[var17++] = var6.substring(var5, var7 - var9);
                        var5 = var7;
                        var4 -= var8;
                     }

                     var7 = -1;
                     var16 = 0;
                     var10 = false;
                     var12 = -1;
                     var11 = false;
                  }

                  if (var21 == '-' && !var20) {
                     var12 = var7;
                     var13 = var8;
                     var11 = var10;
                     var14 = var9;
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                     var10 = false;
                  }
               }
            }
         }

         if (var6.length() > var5) {
            var3[var17++] = var6.substring(var5);
         }

         return var17;
      }
   }

   @ObfuscatedSignature(descriptor = "(Laag;IIIII)Lwb;")
   @ObfuscatedName("dy")
   public classWB method72(classAAG var1, int var2, int var3, int var4, int var5, int var6) {
      if (!classAAG.method202(var1, 1294244343)) {
         method104(this, var4, var5);
         var3 -= this.field8;

         for (int var7 = 0; var7 < var1.method204(401237421); var7++) {
            classAAY var8 = var1.method217(var7, -1642318023);
            if (var6 != -1 && var8.field115 * 1839316601 > var6) {
               return new classWB(var8.field116 * -724223965, var8.field115 * 1839316601);
            }

            char var9 = var8.field117;
            if (var9 != '\n') {
               if (var1.method198(var7, 802134516)) {
                  var9 = '*';
               }

               if (var9 != '\t') {
                  if (var9 == 160) {
                     var9 = ' ';
                  }

                  int var10 = var2 + var8.field116 * -724223965;
                  int var11 = var3 + var8.field115 * 1839316601;
                  int var12 = this.field6[var9];
                  int var13 = this.field7[var9];
                  if (field14 != -1) {
                     this.vmethod1(this.field4[var9], var10 + this.field5[var9] + 1, var11 + this.field3[var9] + 1, var12, var13, field14);
                  }

                  this.vmethod1(this.field4[var9], var10 + this.field5[var9], var11 + this.field3[var9], var12, var13, field12);
               }
            }
         }
      }

      return var1.method214((byte)-43);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("co")
   public int method42(String var1, int var2) {
      int var3 = this.method38(var1, new int[]{var2}, field21);
      int var4 = 0;

      for (int var5 = 0; var5 < var3; var5++) {
         int var6 = this.method36(field21[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   classAAA(byte[] var1) {
      this.field4 = new byte[256][];
      this.method30(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("au")
   public int method44(String var1, int var2) {
      return this.method38(var1, new int[]{var2}, field21);
   }

   @ObfuscatedSignature(descriptor = "(IILjava/lang/String;II)Luq;")
   @ObfuscatedName("ca")
   public classUQ method46(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.method36(var3) / 2;
         var6 += this.method36(var3.substring(0, var1));
         int var7 = var5 - this.field9;
         int var8 = this.method36(var3.substring(var1, var1 + var2));
         int var9 = this.field9 + this.field10;
         return new classUQ(var6, var7, var8, var9);
      } else {
         return new classUQ(var4, var5, 0, 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(IILjava/lang/String;II)Luq;")
   @ObfuscatedName("cc")
   public classUQ method47(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.method36(var3) / 2;
         var6 += this.method36(var3.substring(0, var1));
         int var7 = var5 - this.field9;
         int var8 = this.method36(var3.substring(var1, var1 + var2));
         int var9 = this.field9 + this.field10;
         return new classUQ(var6, var7, var8, var9);
      } else {
         return new classUQ(var4, var5, 0, 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(IILjava/lang/String;II)Luq;")
   @ObfuscatedName("cf")
   public classUQ method48(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.method36(var3) / 2;
         var6 += this.method36(var3.substring(0, var1));
         int var7 = var5 - this.field9;
         int var8 = this.method36(var3.substring(var1, var1 + var2));
         int var9 = this.field9 + this.field10;
         return new classUQ(var6, var7, var8, var9);
      } else {
         return new classUQ(var4, var5, 0, 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)Luq;")
   @ObfuscatedName("ch")
   public classUQ method52(String var1, int var2, int var3) {
      if (var1 != null && !var1.isEmpty()) {
         int var4 = this.method36(var1);
         int var5 = this.field9 + this.field10;
         int var6 = var2 - var4 / 2;
         int var7 = var3 - this.field9;
         return classPW.method9325(var6, var7, var4, var5, 1444081395);
      } else {
         return classPW.method9325(var2, var3, 0, 0, 1444081395);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)Luq;")
   @ObfuscatedName("aw")
   public classUQ method53(String var1, int var2, int var3) {
      if (var1 != null && !var1.isEmpty()) {
         int var4 = this.method36(var1);
         int var5 = this.field9 + this.field10;
         int var6 = var2 - var4 / 2;
         int var7 = var3 - this.field9;
         return classPW.method9325(var6, var7, var4, var5, 1444081395);
      } else {
         return classPW.method9325(var2, var3, 0, 0, 1444081395);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII[I)V")
   @ObfuscatedName("du")
   public void method77(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         method104(this, var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method94(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];

         for (int var10 = 0; var10 < var1.length(); var10++) {
            var9[var10] = (int)(Math.sin(var10 / 2.0 + var6 / 5.0) * 5.0);
         }

         this.method121(var1, var2 - this.method36(var1) / 2, var3, var8, null, var9);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)V")
   @ObfuscatedName("im")
   void method118(String var1, int var2, int var3) {
      var3 -= this.field8;
      int var4 = -1;
      int var5 = -1;

      for (int var6 = 0; var6 < var1.length(); var6++) {
         if (var1.charAt(var6) != 0) {
            int var7 = (char)(classOG.method8434(var1.charAt(var6), (byte)-72) & 255);
            if (var7 == 60) {
               var4 = var6;
            } else {
               if (var7 == 1365879164) {
                  int var8 = var1.indexOf(1020546308, var6 + 1);
                  if (var8 != -1 && var8 > var6 + 1) {
                     String var9 = var1.substring(var6 + 1, var8);
                     if (var9.matches("[a-zA-Z0-9_]+")) {
                        String var10 = classMI.method7575(var9, 623398947);
                        if (var10 != null) {
                           var1 = var1.substring(0, var6) + var10 + var1.substring(var8 + 1);
                           var6--;
                           continue;
                        }
                     }
                  }
               }

               if (var7 == -881617251 && var4 != -1) {
                  String var13 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var13.equals("lt")) {
                     var7 = -1437740256;
                  } else if (var13.equals("gt")) {
                     var7 = -1620358305;
                  } else if (var13.equals("at")) {
                     var7 = 64;
                  } else {
                     if (var13.startsWith("img=")) {
                        try {
                           int var16 = classJF.method6360(var13.substring(4), -1052716083);
                           classYZ var18 = field25[var16];
                           classYZ.method13810(var18, var2, var3 + this.field8 - var18.field7120);
                           var2 += var18.field7124;
                           var5 = -1;
                        } catch (Exception var11) {
                        }
                        continue;
                     }

                     if (!var13.startsWith("nbh")) {
                        this.method110(var13);
                        continue;
                     }

                     var7 = 45;
                  }
               }

               if (var7 == 41294638) {
                  var7 = 32;
               }

               if (var4 == -1) {
                  if (this.field23 != null && var5 != -1) {
                     var2 += this.field23[(var5 << 8) + var7];
                  }

                  int var14 = this.field6[var7];
                  int var15 = this.field7[var7];
                  if (var7 != 126101234) {
                     if (field13 == -112537552) {
                        if (field14 != -1) {
                           method15(this.field4[var7], var2 + this.field5[var7] + 1, var3 + this.field3[var7] + 1, var14, var15, field14);
                        }

                        this.vmethod1(this.field4[var7], var2 + this.field5[var7], var3 + this.field3[var7], var14, var15, field12);
                     } else {
                        if (field14 != -1) {
                           method24(this.field4[var7], var2 + this.field5[var7] + 1, var3 + this.field3[var7] + 1, var14, var15, field14, field13);
                        }

                        this.vmethod0(this.field4[var7], var2 + this.field5[var7], var3 + this.field3[var7], var14, var15, field12, field13);
                     }
                  } else if (field18 > 0) {
                     field19 = field19 + field18;
                     var2 += field19 >> 8;
                     field19 &= 255;
                  }

                  int var17 = this.field24[var7];
                  if (field11 != -1) {
                     method13717(var2, var3 + (int)(this.field8 * 0.7), var17, field11);
                  }

                  if (field15 != -1) {
                     method13717(var2, var3 + this.field8 + 1, var17, field15);
                  }

                  var2 += var17;
                  var5 = var7;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("cj")
   public void method57(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         method104(this, var4, var5);
         this.method116(var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII)V")
   @ObfuscatedName("bg")
   public void method59(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         method104(this, var4, var5);
         field13 = var6;
         this.method116(var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII)V")
   @ObfuscatedName("ce")
   public void method60(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         method104(this, var4, var5);
         field13 = var6;
         this.method116(var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I")
   @ObfuscatedName("ai")
   public int method45(String var1, int var2) {
      return this.method38(var1, new int[]{var2}, field21);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
   @ObfuscatedName("be")
   public static String method10(String var0) {
      int var1 = var0.length();
      byte var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         char var4 = var0.charAt(var3);
         if (var4 == 1545568725 || var4 == 1514617787) {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for (int var7 = 0; var7 < var1; var7++) {
         char var5 = var0.charAt(var7);
         if (var5 == -1184188765) {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else if (var5 == '@') {
            var6.append("<at>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ij")
   void method111(String var1) {
      try {
         if (var1.startsWith("col=")) {
            String var3 = var1.substring(4);
            int var2 = classOH.method8449(var3, 16, true, 1242848540);
            field12 = var2;
         } else if (var1.equals("/col")) {
            field12 = field17;
         } else if (var1.startsWith("str=")) {
            String var8 = var1.substring(4);
            int var5 = classOH.method8449(var8, 16, true, -109049566);
            field11 = var5;
         } else if (var1.equals("str")) {
            field11 = 8388608;
         } else if (var1.equals("/str")) {
            field11 = -1;
         } else if (var1.startsWith("u=")) {
            String var9 = var1.substring(2);
            int var6 = classOH.method8449(var9, 16, true, -18026103);
            field15 = var6;
         } else if (var1.equals("u")) {
            field15 = 0;
         } else if (var1.equals("/u")) {
            field15 = -1;
         } else if (var1.startsWith("shad=")) {
            String var10 = var1.substring(5);
            int var7 = classOH.method8449(var10, 16, true, 326520203);
            field14 = var7;
         } else if (var1.equals("shad")) {
            field14 = 0;
         } else if (var1.equals("/shad")) {
            field14 = field16;
         } else if (var1.equals("br")) {
            method104(this, field17, field16);
         }
      } catch (Exception var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "(IILjava/lang/String;II)Luq;")
   @ObfuscatedName("ar")
   public classUQ method49(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.method36(var3) / 2;
         var6 += this.method36(var3.substring(0, var1));
         int var7 = var5 - this.field9;
         int var8 = this.method36(var3.substring(var1, var1 + var2));
         int var9 = this.field9 + this.field10;
         return new classUQ(var6, var7, var8, var9);
      } else {
         return new classUQ(var4, var5, 0, 0);
      }
   }

   @ObfuscatedSignature(descriptor = "(Laag;IIIII)Lwb;")
   @ObfuscatedName("bn")
   public classWB method73(classAAG var1, int var2, int var3, int var4, int var5, int var6) {
      if (!classAAG.method202(var1, 2077457990)) {
         method104(this, var4, var5);
         var3 -= this.field8;

         for (int var7 = 0; var7 < var1.method204(715221700); var7++) {
            classAAY var8 = var1.method217(var7, -2110156119);
            if (var6 != -1 && var8.field115 * -1080031531 > var6) {
               return new classWB(var8.field116 * 1034575948, var8.field115 * 1839316601);
            }

            char var9 = var8.field117;
            if (var9 != '\n') {
               if (var1.method198(var7, 802134516)) {
                  var9 = '*';
               }

               if (var9 != '\t') {
                  if (var9 == 160) {
                     var9 = ' ';
                  }

                  int var10 = var2 + var8.field116 * -724223965;
                  int var11 = var3 + var8.field115 * -1621993670;
                  int var12 = this.field6[var9];
                  int var13 = this.field7[var9];
                  if (field14 != -1) {
                     this.vmethod1(this.field4[var9], var10 + this.field5[var9] + 1, var11 + this.field3[var9] + 1, var12, var13, field14);
                  }

                  this.vmethod1(this.field4[var9], var10 + this.field5[var9], var11 + this.field3[var9], var12, var13, field12);
               }
            }
         }
      }

      return var1.method214((byte)-126);
   }

   @ObfuscatedSignature(descriptor = "(Laag;IIIII)Lwb;")
   @ObfuscatedName("di")
   public classWB method74(classAAG var1, int var2, int var3, int var4, int var5, int var6) {
      if (!classAAG.method202(var1, 1899661764)) {
         method104(this, var4, var5);
         var3 -= this.field8;

         for (int var7 = 0; var7 < var1.method204(-1057517889); var7++) {
            classAAY var8 = var1.method217(var7, -1978598187);
            if (var6 != -1 && var8.field115 * 1839316601 > var6) {
               return new classWB(var8.field116 * -724223965, var8.field115 * 1839316601);
            }

            char var9 = var8.field117;
            if (var9 != '\n') {
               if (var1.method198(var7, 802134516)) {
                  var9 = '*';
               }

               if (var9 != '\t') {
                  if (var9 == 160) {
                     var9 = ' ';
                  }

                  int var10 = var2 + var8.field116 * -724223965;
                  int var11 = var3 + var8.field115 * 1839316601;
                  int var12 = this.field6[var9];
                  int var13 = this.field7[var9];
                  if (field14 != -1) {
                     this.vmethod1(this.field4[var9], var10 + this.field5[var9] + 1, var11 + this.field3[var9] + 1, var12, var13, field14);
                  }

                  this.vmethod1(this.field4[var9], var10 + this.field5[var9], var11 + this.field3[var9], var12, var13, field12);
               }
            }
         }
      }

      return var1.method214((byte)-3);
   }

   @ObfuscatedSignature(descriptor = "(Laag;IIIII)Lwb;")
   @ObfuscatedName("dx")
   public classWB method75(classAAG var1, int var2, int var3, int var4, int var5, int var6) {
      if (!classAAG.method202(var1, 1763813273)) {
         method104(this, var4, var5);
         var3 -= this.field8;

         for (int var7 = 0; var7 < var1.method204(531372321); var7++) {
            classAAY var8 = var1.method217(var7, -1829522588);
            if (var6 != -1 && var8.field115 * 1839316601 > var6) {
               return new classWB(var8.field116 * -592327394, var8.field115 * 1839316601);
            }

            int var9 = var8.field117;
            if (var9 != 10) {
               if (var1.method198(var7, 802134516)) {
                  var9 = 42;
               }

               if (var9 != 9) {
                  if (var9 == -680659129) {
                     var9 = 1067631275;
                  }

                  int var10 = var2 + var8.field116 * -724223965;
                  int var11 = var3 + var8.field115 * -135647677;
                  int var12 = this.field6[var9];
                  int var13 = this.field7[var9];
                  if (field14 != -1) {
                     this.vmethod1(this.field4[var9], var10 + this.field5[var9] + 1, var11 + this.field3[var9] + 1, var12, var13, field14);
                  }

                  this.vmethod1(this.field4[var9], var10 + this.field5[var9], var11 + this.field3[var9], var12, var13, field12);
               }
            }
         }
      }

      return var1.method214((byte)-127);
   }

   @ObfuscatedSignature(descriptor = "(Laaa;Ljava/lang/String;IIIII[I)V")
   @ObfuscatedName("hr")
   public static void method80(classAAA var0, String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var0 == null) {
         var0.method84(var1, var2, var2, var2, var2, var2, var7);
      }

      if (var1 != null) {
         method104(var0, var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = var0.method94(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for (int var11 = 0; var11 < var1.length(); var11++) {
            var9[var11] = (int)(Math.sin(var11 / 5.0 + var6 / 5.0) * 5.0);
            var10[var11] = (int)(Math.sin(var11 / 3.0 + var6 / 5.0) * 5.0);
         }

         var0.method121(var1, var2 - var0.method36(var1) / 2, var3, var8, var9, var10);
      }
   }

   @ObfuscatedSignature(descriptor = "([I[BIIIIIIII)V")
   @ObfuscatedName("aj")
   static void method26(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & 0xFF00) * var9 & 0xFF0000) >> 8;
      var9 = 256 - var9;

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = -var5; var11 < 0; var11++) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               client.method2316(var0, var4++, (((var12 & 16711935) * var9 & -16711936) + ((var12 & 0xFF00) * var9 & 0xFF0000) >> 8) + var2, 256 - var9);
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII[I)V")
   @ObfuscatedName("dt")
   public void method78(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         method104(this, var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method94(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];

         for (int var10 = 0; var10 < var1.length(); var10++) {
            var9[var10] = (int)(Math.sin(var10 / 2.0 + var6 / 5.0) * 5.0);
         }

         this.method121(var1, var2 - this.method36(var1) / 2, var3, var8, null, var9);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII[I)V")
   @ObfuscatedName("dr")
   public void method81(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         method104(this, var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method94(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for (int var11 = 0; var11 < var1.length(); var11++) {
            var9[var11] = (int)(Math.sin(var11 / 5.0 + var6 / 5.0) * 5.0);
            var10[var11] = (int)(Math.sin(var11 / 3.0 + var6 / 5.0) * 5.0);
         }

         this.method121(var1, var2 - this.method36(var1) / 2, var3, var8, var9, var10);
      }
   }

   @ObfuscatedSignature(descriptor = "([I[BIIIIIII)V")
   @ObfuscatedName("ao")
   static void method21(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for (int var10 = -var6; var10 < 0; var10++) {
         for (int var11 = var9; var11 < 0; var11++) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2 | 0xFF000000;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2 | 0xFF000000;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2 | 0xFF000000;
            } else {
               var4++;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2 | 0xFF000000;
            } else {
               var4++;
            }
         }

         for (int var19 = var5; var19 < 0; var19++) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2 | 0xFF000000;
            } else {
               var4++;
            }
         }

         var4 += var7;
         var3 += var8;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII[I)V")
   @ObfuscatedName("dw")
   public void method82(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         method104(this, var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method94(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for (int var11 = 0; var11 < var1.length(); var11++) {
            var9[var11] = (int)(Math.sin(var11 / 5.0 + var6 / 5.0) * 5.0);
            var10[var11] = (int)(Math.sin(var11 / 3.0 + var6 / 5.0) * 5.0);
         }

         this.method121(var1, var2 - this.method36(var1) / 2, var3, var8, var9, var10);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laaa;Ljava/lang/String;IIIIIIIII)I")
   @ObfuscatedName("se")
   public static int method67(classAAA var0, String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if (var0 == null) {
         var0.drawWidgetText(var1, var2, var2, var2, var2, var2, var2, var2, var2, var2, var2);
      }

      return method70(var0, var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("cp")
   void method30(byte[] var1) {
      this.field24 = new int[256];
      if (var1.length == 257) {
         for (int var2 = 0; var2 < this.field24.length; var2++) {
            this.field24[var2] = var1[var2] & 255;
         }

         this.field8 = var1[256] & 255;
      } else {
         int var10 = 0;

         for (int var3 = 0; var3 < 256; var3++) {
            this.field24[var3] = var1[var10++] & 255;
         }

         int[] var11 = new int[256];
         int[] var4 = new int[256];

         for (int var5 = 0; var5 < 256; var5++) {
            var11[var5] = var1[var10++] & 255;
         }

         for (int var12 = 0; var12 < 256; var12++) {
            var4[var12] = var1[var10++] & 255;
         }

         byte[][] var13 = new byte[256][];

         for (int var6 = 0; var6 < 256; var6++) {
            var13[var6] = new byte[var11[var6]];
            byte var7 = 0;

            for (int var8 = 0; var8 < var13[var6].length; var8++) {
               var7 += var1[var10++];
               var13[var6][var8] = var7;
            }
         }

         byte[][] var14 = new byte[256][];

         for (int var15 = 0; var15 < 256; var15++) {
            var14[var15] = new byte[var11[var15]];
            byte var17 = 0;

            for (int var9 = 0; var9 < var14[var15].length; var9++) {
               var17 += var1[var10++];
               var14[var15][var9] = var17;
            }
         }

         this.field23 = new byte[65536];

         for (int var16 = 0; var16 < 256; var16++) {
            if (var16 != 32 && var16 != 160) {
               for (int var18 = 0; var18 < 256; var18++) {
                  if (var18 != 32 && var18 != 160) {
                     this.field23[(var16 << 8) + var18] = (byte)method6(var13, var14, var4, this.field24, var11, var16, var18);
                  }
               }
            }
         }

         this.field8 = var4[32] + var11[32];
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII)V")
   @ObfuscatedName("cm")
   public void method64(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         method104(this, var4, var5);
         this.method116(var1, var2 - this.method36(var1), var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII[I)V")
   @ObfuscatedName("bm")
   public void method90(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         method104(this, var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.method94(var6, var1.length());
         }

         this.method121(var1, var2, var3, var7, null, null);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII[I)V")
   @ObfuscatedName("hv")
   public void method91(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         method104(this, var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.method94(var6, var1.length());
         }

         this.method121(var1, var2, var3, var7, null, null);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laaa;Ljava/lang/String;IIIII[I)V")
   @ObfuscatedName("ld")
   public static void method83(classAAA var0, String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var0 == null) {
         var0.method60(var1, var2, var2, var2, var2, var2);
      } else if (var1 != null) {
         method104(var0, var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = var0.method94(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for (int var11 = 0; var11 < var1.length(); var11++) {
            var9[var11] = (int)(Math.sin(var11 / 5.0 + var6 / 5.0) * 5.0);
            var10[var11] = (int)(Math.sin(var11 / 3.0 + var6 / 5.0) * 5.0);
         }

         var0.method121(var1, var2 - var0.method36(var1) / 2, var3, var8, var9, var10);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII[I)V")
   @ObfuscatedName("br")
   public void method92(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         method104(this, var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.method94(var6, var1.length());
         }

         this.method121(var1, var2, var3, var7, null, null);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII)V")
   @ObfuscatedName("ib")
   public void method61(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         method104(this, var4, var5);
         field13 = var6;
         this.method116(var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII)V")
   @ObfuscatedName("ci")
   public void method98(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         method104(this, var4, var5);
         field20.setSeed(var6);
         field13 = 1634892534 + (field20.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for (int var9 = 0; var9 < var1.length(); var9++) {
            var7[var9] = var8;
            if ((field20.nextInt() & 3) == 0) {
               var8++;
            }
         }

         this.method121(var1, var2, var3, null, var7, null);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("is")
   public void method102(int var1, int var2, int var3, int var4) {
      var3 -= this.field8;
      int var5 = var1 & 0xFF;
      if (var5 != 32) {
         this.vmethod1(this.field4[var5], var2 + this.field5[var5], var3 + this.field3[var5], this.field6[var5], this.field7[var5], var4);
      }
   }

   @ObfuscatedSignature(descriptor = "(IIII)V")
   @ObfuscatedName("ie")
   public void method103(int var1, int var2, int var3, int var4) {
      var3 -= this.field8;
      int var5 = var1 & 0xFF;
      if (var5 != 32) {
         this.vmethod1(this.field4[var5], var2 + this.field5[var5], var3 + this.field3[var5], this.field6[var5], this.field7[var5], var4);
      }
   }

   @ObfuscatedSignature(descriptor = "([II)[I")
   @ObfuscatedName("ir")
   int[] method96(int[] var1, int var2) {
      if (var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];
         float var4 = (float)var1.length / var2;

         for (int var5 = 0; var5 < var2; var5++) {
            var3[var5] = var1[(int)(var5 * var4)];
         }

         return var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIII[I)V")
   @ObfuscatedName("hc")
   public void method89(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         method104(this, var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.method94(var6, var1.length());
         }

         this.method121(var1, var2 - this.method36(var1) / 2, var3, var7, null, null);
      }
   }

   @ObfuscatedSignature(descriptor = "([BIIIIII)V")
   @ObfuscatedName("al")
   static void method24(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * field7102;
      int var8 = field7102 - var3;
      int var9 = 0;
      int var10 = 0;
      if (var2 < field7096) {
         int var11 = field7096 - var2;
         var4 -= var11;
         var2 = field7096;
         var10 += var11 * var3;
         var7 += var11 * field7102;
      }

      if (var2 + var4 > field7098) {
         var4 -= var2 + var4 - field7098;
      }

      if (var1 < field7097) {
         int var12 = field7097 - var1;
         var3 -= var12;
         var1 = field7097;
         var10 += var12;
         var7 += var12;
         var9 += var12;
         var8 += var12;
      }

      if (var1 + var3 > field7099) {
         int var13 = var1 + var3 - field7099;
         var3 -= var13;
         var9 += var13;
         var8 += var13;
      }

      if (var3 > 0 && var4 > 0) {
         method26(field7104, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("iz")
   void method112(String var1) {
      try {
         if (var1.startsWith("col=")) {
            String var3 = var1.substring(4);
            int var2 = classOH.method8449(var3, 16, true, 19369596);
            field12 = var2;
         } else if (var1.equals("/col")) {
            field12 = field17;
         } else if (var1.startsWith("str=")) {
            String var8 = var1.substring(4);
            int var5 = classOH.method8449(var8, 16, true, 29285220);
            field11 = var5;
         } else if (var1.equals("str")) {
            field11 = -1710979020;
         } else if (var1.equals("/str")) {
            field11 = -1;
         } else if (var1.startsWith("u=")) {
            String var9 = var1.substring(2);
            int var6 = classOH.method8449(var9, 16, true, 56881939);
            field15 = var6;
         } else if (var1.equals("u")) {
            field15 = 0;
         } else if (var1.equals("/u")) {
            field15 = -1;
         } else if (var1.startsWith("shad=")) {
            String var10 = var1.substring(5);
            int var7 = classOH.method8449(var10, 16, true, 1964230001);
            field14 = var7;
         } else if (var1.equals("shad")) {
            field14 = 0;
         } else if (var1.equals("/shad")) {
            field14 = field16;
         } else if (var1.equals("br")) {
            method104(this, field17, field16);
         }
      } catch (Exception var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("iw")
   void method115(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for (int var5 = 0; var5 < var1.length(); var5++) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == -1440170507) {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            var3++;
         }
      }

      if (var3 > 0) {
         field18 = (var2 - this.method36(var1) << 8) / var3;
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)V")
   @ObfuscatedName("io")
   void method119(String var1, int var2, int var3) {
      var3 -= this.field8;
      int var4 = -1;
      int var5 = -1;

      for (int var6 = 0; var6 < var1.length(); var6++) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(classOG.method8434(var1.charAt(var6), (byte)-38) & 255);
            if (var7 == '<') {
               var4 = var6;
            } else {
               if (var7 == '@') {
                  int var8 = var1.indexOf(64, var6 + 1);
                  if (var8 != -1 && var8 > var6 + 1) {
                     String var9 = var1.substring(var6 + 1, var8);
                     if (var9.matches("[a-zA-Z0-9_]+")) {
                        String var10 = classMI.method7575(var9, 1727161286);
                        if (var10 != null) {
                           var1 = var1.substring(0, var6) + var10 + var1.substring(var8 + 1);
                           var6--;
                           continue;
                        }
                     }
                  }
               }

               if (var7 == '>' && var4 != -1) {
                  String var13 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var13.equals("lt")) {
                     var7 = '<';
                  } else if (var13.equals("gt")) {
                     var7 = '>';
                  } else if (var13.equals("at")) {
                     var7 = '@';
                  } else {
                     if (var13.startsWith("img=")) {
                        try {
                           int var16 = classJF.method6360(var13.substring(4), 1020715378);
                           classYZ var18 = field25[var16];
                           classYZ.method13810(var18, var2, var3 + this.field8 - var18.field7120);
                           var2 += var18.field7124;
                           var5 = -1;
                        } catch (Exception var11) {
                        }
                        continue;
                     }

                     if (!var13.startsWith("nbh")) {
                        this.method110(var13);
                        continue;
                     }

                     var7 = '-';
                  }
               }

               if (var7 == 160) {
                  var7 = ' ';
               }

               if (var4 == -1) {
                  if (this.field23 != null && var5 != -1) {
                     var2 += this.field23[(var5 << 8) + var7];
                  }

                  int var14 = this.field6[var7];
                  int var15 = this.field7[var7];
                  if (var7 != ' ') {
                     if (field13 == 256) {
                        if (field14 != -1) {
                           method15(this.field4[var7], var2 + this.field5[var7] + 1, var3 + this.field3[var7] + 1, var14, var15, field14);
                        }

                        this.vmethod1(this.field4[var7], var2 + this.field5[var7], var3 + this.field3[var7], var14, var15, field12);
                     } else {
                        if (field14 != -1) {
                           method24(this.field4[var7], var2 + this.field5[var7] + 1, var3 + this.field3[var7] + 1, var14, var15, field14, field13);
                        }

                        this.vmethod0(this.field4[var7], var2 + this.field5[var7], var3 + this.field3[var7], var14, var15, field12, field13);
                     }
                  } else if (field18 > 0) {
                     field19 = field19 + field18;
                     var2 += field19 >> 8;
                     field19 &= 255;
                  }

                  int var17 = this.field24[var7];
                  if (field11 != -1) {
                     method13717(var2, var3 + (int)(this.field8 * 0.7), var17, field11);
                  }

                  if (field15 != -1) {
                     method13717(var2, var3 + this.field8 + 1, var17, field15);
                  }

                  var2 += var17;
                  var5 = var7;
               }
            }
         }
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("ay")
   void method31(byte[] var1) {
      this.field24 = new int[256];
      if (var1.length == 257) {
         for (int var2 = 0; var2 < this.field24.length; var2++) {
            this.field24[var2] = var1[var2] & 255;
         }

         this.field8 = var1[256] & 255;
      } else {
         int var10 = 0;

         for (int var3 = 0; var3 < 256; var3++) {
            this.field24[var3] = var1[var10++] & 255;
         }

         int[] var11 = new int[256];
         int[] var4 = new int[256];

         for (int var5 = 0; var5 < 256; var5++) {
            var11[var5] = var1[var10++] & 255;
         }

         for (int var12 = 0; var12 < 256; var12++) {
            var4[var12] = var1[var10++] & 255;
         }

         byte[][] var13 = new byte[256][];

         for (int var6 = 0; var6 < 256; var6++) {
            var13[var6] = new byte[var11[var6]];
            byte var7 = 0;

            for (int var8 = 0; var8 < var13[var6].length; var8++) {
               var7 += var1[var10++];
               var13[var6][var8] = var7;
            }
         }

         byte[][] var14 = new byte[256][];

         for (int var15 = 0; var15 < 256; var15++) {
            var14[var15] = new byte[var11[var15]];
            byte var17 = 0;

            for (int var9 = 0; var9 < var14[var15].length; var9++) {
               var17 += var1[var10++];
               var14[var15][var9] = var17;
            }
         }

         this.field23 = new byte[65536];

         for (int var16 = 0; var16 < 256; var16++) {
            if (var16 != 32 && var16 != 160) {
               for (int var18 = 0; var18 < 256; var18++) {
                  if (var18 != 32 && var18 != 160) {
                     this.field23[(var16 << 8) + var18] = (byte)method6(var13, var14, var4, this.field24, var11, var16, var18);
                  }
               }
            }
         }

         this.field8 = var4[32] + var11[32];
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII)V")
   @ObfuscatedName("cx")
   public void method62(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         method104(this, var4, var5);
         field12 = var6;
         this.method119(var1, var2, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIII[I)V")
   @ObfuscatedName("bc")
   public void method84(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         method104(this, var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method96(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for (int var11 = 0; var11 < var1.length(); var11++) {
            var9[var11] = (int)(Math.sin(var11 / 5.0 + var6 / 5.0) * 5.0);
            var10[var11] = (int)(Math.sin(var11 / 3.0 + var6 / 5.0) * 5.0);
         }

         this.method120(var1, var2 - this.method36(var1) / 2, var3, var8, var9, var10);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)V")
   @ObfuscatedName("bk")
   void method109(int var1, int var2) {
      field11 = -1;
      field17 = -1;
      field19 = var2;
      field14 = var2;
      field17 = var1;
      field16 = var1;
      field16 = 256;
      field18 = 0;
      field13 = 0;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IIIIIIIIII)I")
   @ObfuscatedName("dm")
   public int method71(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = 256;
         }

         method104(this, var6, var7);
         field18 = var8;
         if (var11 == 0) {
            var11 = this.field9;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.field10 + this.field8 + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.method39(var1, var12, field21);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         if (var10 == 0) {
            var14 = var3 + this.field8;
         } else if (var10 == 1) {
            var14 = var3 + this.field8 + (var5 - this.field9 - this.field9 - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this.field9 - (var13 - 1) * var11;
         } else {
            int var15 = (var5 - this.field9 - this.field10 - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + this.field10 + var15;
            var11 += var15;
         }

         for (int var16 = 0; var16 < var13; var16++) {
            if (var9 == 0) {
               this.method118(field21[var16], var2, var14);
            } else if (var9 == 1) {
               this.method116(field21[var16], var2 + (var4 - this.getTextWidth(field21[var16])) / 2, var14);
            } else if (var9 == 2) {
               this.method119(field21[var16], var2 + var4 - this.method37(field21[var16]), var14);
            } else if (var16 == var13 - 1) {
               this.method118(field21[var16], var2, var14);
            } else {
               this.method113(field21[var16], var4);
               this.method118(field21[var16], var2, var14);
               field12 = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   @ObfuscatedSignature(descriptor = "([B)V")
   @ObfuscatedName("cb")
   void method32(byte[] var1) {
      this.field7 = new int[256];
      if (var1.length == 257) {
         for (int var2 = 0; var2 < this.field5.length; var2++) {
            this.field5[var2] = var1[var2] & 255;
         }

         this.field9 = var1[256] & 255;
      } else {
         int var10 = 0;

         for (int var3 = 0; var3 < 256; var3++) {
            this.field5[var3] = var1[var10++] & 255;
         }

         int[] var11 = new int[256];
         int[] var4 = new int[256];

         for (int var5 = 0; var5 < 256; var5++) {
            var11[var5] = var1[var10++] & 255;
         }

         for (int var12 = 0; var12 < 256; var12++) {
            var4[var12] = var1[var10++] & 255;
         }

         byte[][] var13 = new byte[256][];

         for (int var6 = 0; var6 < 256; var6++) {
            var13[var6] = new byte[var11[var6]];
            byte var7 = 0;

            for (int var8 = 0; var8 < var13[var6].length; var8++) {
               var7 += var1[var10++];
               var13[var6][var8] = var7;
            }
         }

         byte[][] var14 = new byte[256][];

         for (int var15 = 0; var15 < 256; var15++) {
            var14[var15] = new byte[var11[var15]];
            byte var17 = 0;

            for (int var9 = 0; var9 < var14[var15].length; var9++) {
               var17 += var1[var10++];
               var14[var15][var9] = var17;
            }
         }

         this.field23 = new byte[65536];

         for (int var16 = 0; var16 < 256; var16++) {
            if (var16 != 32 && var16 != 160) {
               for (int var18 = 0; var18 < 256; var18++) {
                  if (var18 != 32 && var18 != 160) {
                     this.field23[(var16 << 8) + var18] = (byte)method6(var13, var14, var4, this.field6, var11, var16, var18);
                  }
               }
            }
         }

         this.field10 = var4[32] + var11[32];
      }
   }
}
