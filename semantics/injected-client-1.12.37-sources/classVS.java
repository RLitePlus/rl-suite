import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vs")
public class classVS implements classVN {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field6564 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final String field6566 = "\\.";
   @ObfuscatedName("ag")
   int field6562;
   @ObfuscatedName("ab")
   int field6561;
   @ObfuscatedName("as")
   int field6563;
   @ToRemove(unused = "true")
   @ObfuscatedName("bj")
   static final int field6565 = 49;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;Ljava/lang/String;)V")
   @ObfuscatedName("aw")
   public static void method12091(classVS var0, String var1) {
      if (var0 == null) {
         var0.method12083(var1);
      } else {
         String[] var2 = var1.split("\\.");

         try {
            var0.field6561 = Integer.parseInt(var2[0]) * 531774863;
            var0.field6562 = Integer.parseInt(var2[1]) * 1045659901;
            var0.field6563 = Integer.parseInt(var2[2]) * 731092867;
         } catch (Exception var4) {
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ax")
   void method12083(String var1) {
      if (var1.startsWith("1.")) {
         this.method12088(var1, (byte)6);
      } else {
         method12092(this, var1, 1931697325);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ac")
   void method12087(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.field6561 = Integer.parseInt(var2[1]) * 531774863;
         var2 = var2[2].split("_");
         this.field6562 = Integer.parseInt(var2[0]) * 1045659901;
         this.field6563 = Integer.parseInt(var2[1]) * 1078428294;
      } catch (Exception var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("cm")
   public void method12097(String var1) {
      this.method12096(var1);
   }

   @ObfuscatedSignature(descriptor = "()Lvt;")
   @ObfuscatedName("ag")
   @Override
   public PlatformInfo vmethod624() {
      byte var1;
      if (classZW.field7284.startsWith("win")) {
         var1 = 1;
      } else if (classZW.field7284.startsWith("mac")) {
         var1 = 2;
      } else if (classZW.field7284.startsWith("linux")) {
         var1 = 3;
      } else {
         var1 = 4;
      }

      String var2;
      try {
         var2 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var33) {
         var2 = "";
      }

      String var4;
      try {
         var4 = System.getProperty("os.name").toLowerCase();
      } catch (Exception var32) {
         var4 = "";
      }

      String var3;
      try {
         var3 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var31) {
         var3 = "";
      }

      String var5 = "Unknown";
      String var6 = "1.1";

      try {
         var5 = System.getProperty("java.vendor");
         var6 = System.getProperty("java.version");
      } catch (Exception var30) {
      }

      boolean var7;
      if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
         var7 = false;
      } else {
         var7 = true;
      }

      int var8 = 0;
      if (var1 == 1) {
         if (var3.indexOf("4.0") != -1) {
            var8 = 1;
         } else if (var3.indexOf("4.1") != -1) {
            var8 = 2;
         } else if (var3.indexOf("4.9") != -1) {
            var8 = 3;
         } else if (var3.indexOf("5.0") != -1) {
            var8 = 4;
         } else if (var3.indexOf("5.1") != -1) {
            var8 = 5;
         } else if (var3.indexOf("5.2") != -1) {
            var8 = 8;
         } else if (var3.indexOf("6.0") != -1) {
            var8 = 6;
         } else if (var3.indexOf("6.1") != -1) {
            var8 = 7;
         } else if (var3.indexOf("6.2") != -1) {
            var8 = 9;
         } else if (var3.indexOf("6.3") != -1) {
            var8 = 10;
         } else if (var3.indexOf("10.0") != -1) {
            if (var4.indexOf("11") != -1) {
               var8 = 12;
            } else {
               var8 = 11;
            }
         } else if (var3.indexOf("11.0") != -1) {
            var8 = 12;
         }
      } else if (2 == var1) {
         if (var3.indexOf("10.4") != -1) {
            var8 = 20;
         } else if (var3.indexOf("10.5") != -1) {
            var8 = 21;
         } else if (var3.indexOf("10.6") != -1) {
            var8 = 22;
         } else if (var3.indexOf("10.7") != -1) {
            var8 = 23;
         } else if (var3.indexOf("10.8") != -1) {
            var8 = 24;
         } else if (var3.indexOf("10.9") != -1) {
            var8 = 25;
         } else if (var3.indexOf("10.10") != -1) {
            var8 = 26;
         } else if (var3.indexOf("10.11") != -1) {
            var8 = 27;
         } else if (var3.indexOf("10.12") != -1) {
            var8 = 28;
         } else if (var3.indexOf("10.13") != -1) {
            var8 = 29;
         } else if (var3.indexOf("10.14") != -1) {
            var8 = 30;
         } else if (var3.indexOf("10.15") != -1) {
            var8 = 31;
         } else if (var3.indexOf("11.") != -1) {
            var8 = -751500865;
         } else if (var3.indexOf("12.") != -1) {
            var8 = 33;
         } else if (var3.indexOf("13.") != -1) {
            var8 = 34;
         } else if (var3.indexOf("14.") != -1) {
            var8 = 35;
         }
      }

      byte var9;
      if (var5.toLowerCase().indexOf("sun") != -1) {
         var9 = 1;
      } else if (var5.toLowerCase().indexOf("microsoft") != -1) {
         var9 = 2;
      } else if (var5.toLowerCase().indexOf("apple") != -1) {
         var9 = 3;
      } else if (var5.toLowerCase().indexOf("oracle") != -1) {
         var9 = 5;
      } else {
         var9 = 4;
      }

      method12085(this, var6, (byte)-50);
      boolean var10 = false;
      int var11 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      int var12;
      if (this.field6561 * -1618329233 > 3) {
         var12 = Runtime.getRuntime().availableProcessors();
      } else {
         var12 = 0;
      }

      byte var13 = 0;
      String var14 = "";
      String var15 = "";
      String var16 = "";
      String var17 = "";
      String var18 = "";
      String var19 = "";
      boolean var20 = false;
      boolean var21 = false;
      boolean var22 = false;
      boolean var23 = false;
      int[] var24 = new int[3];
      boolean var25 = false;
      String var26 = "";
      String var27 = "";
      String var28 = "";
      boolean var29 = false;
      return new PlatformInfo(
         var1,
         var7,
         var8,
         var9,
         this.field6561 * -1618329233,
         -666187013 * this.field6562,
         1264693035 * this.field6563,
         false,
         var11,
         var12,
         var13,
         0,
         var14,
         var15,
         var16,
         var17,
         0,
         0,
         0,
         0,
         var18,
         var19,
         var24,
         0,
         "",
         "",
         var28
      );
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("as")
   void method12084(String var1) {
      if (var1.startsWith("1.")) {
         this.method12088(var1, (byte)6);
      } else {
         method12092(this, var1, 2096824704);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcd;I)Z")
   @ObfuscatedName("oh")
   public static boolean method12081(classCD var0, int var1) {
      return var0.field688 != null && var1 >= 0 && var1 < var0.field688.length && var0.field688[var1] != null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("ae")
   void method12088(String var1, byte var2) {
      try {
         String[] var3 = var1.split("\\.");

         try {
            this.field6561 = Integer.parseInt(var3[1]) * 531774863;
            var3 = var3[2].split("_");
            this.field6562 = Integer.parseInt(var3[0]) * 1045659901;
            this.field6563 = Integer.parseInt(var3[1]) * 731092867;
         } catch (Exception var5) {
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "vs.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvs;Ljava/lang/String;I)V")
   @ObfuscatedName("cd")
   public static void method12092(classVS var0, String var1, int var2) {
      if (var0 == null) {
         var0.method12095(var1, var2);
      }

      try {
         String[] var3 = var1.split("\\.");

         try {
            var0.field6561 = Integer.parseInt(var3[0]) * 531774863;
            var0.field6562 = Integer.parseInt(var3[1]) * 1045659901;
            var0.field6563 = Integer.parseInt(var3[2]) * 731092867;
         } catch (Exception var5) {
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "vs.ab(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;Ljava/lang/String;)V")
   @ObfuscatedName("rv")
   public static void method12093(classVS var0, String var1) {
      if (var0 == null) {
         var0.method12096(var1);
      }

      String[] var2 = var1.split("\\.");

      try {
         var0.field6561 = Integer.parseInt(var2[0]) * 531774863;
         var0.field6562 = Integer.parseInt(var2[1]) * 1045659901;
         var0.field6563 = Integer.parseInt(var2[2]) * 731092867;
      } catch (Exception var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lvt;")
   @ObfuscatedName("az")
   @Override
   public PlatformInfo vmethod625(int var1) {
      try {
         byte var2;
         if (classZW.field7284.startsWith("win")) {
            if (var1 == 1456249821) {
               throw new IllegalStateException();
            }

            var2 = 1;
         } else if (classZW.field7284.startsWith("mac")) {
            if (var1 == 1456249821) {
               throw new IllegalStateException();
            }

            var2 = 2;
         } else if (classZW.field7284.startsWith("linux")) {
            if (var1 == 1456249821) {
               throw new IllegalStateException();
            }

            var2 = 3;
         } else {
            var2 = 4;
         }

         String var3;
         try {
            var3 = System.getProperty("os.arch").toLowerCase();
         } catch (Exception var34) {
            var3 = "";
         }

         String var5;
         try {
            var5 = System.getProperty("os.name").toLowerCase();
         } catch (Exception var33) {
            var5 = "";
         }

         String var4;
         try {
            var4 = System.getProperty("os.version").toLowerCase();
         } catch (Exception var32) {
            var4 = "";
         }

         String var6 = "Unknown";
         String var7 = "1.1";

         try {
            var6 = System.getProperty("java.vendor");
            var7 = System.getProperty("java.version");
         } catch (Exception var31) {
         }

         boolean var8;
         label298: {
            if (!var3.startsWith("amd64")) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               if (!var3.startsWith("x86_64")) {
                  var8 = false;
                  break label298;
               }

               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }
            }

            var8 = true;
         }

         byte var9 = 0;
         if (var2 == 1) {
            if (var4.indexOf("4.0") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 1;
            } else if (var4.indexOf("4.1") != -1) {
               var9 = 2;
            } else if (var4.indexOf("4.9") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 3;
            } else if (var4.indexOf("5.0") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 4;
            } else if (var4.indexOf("5.1") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 5;
            } else if (var4.indexOf("5.2") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 8;
            } else if (var4.indexOf("6.0") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 6;
            } else if (var4.indexOf("6.1") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 7;
            } else if (var4.indexOf("6.2") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 9;
            } else if (var4.indexOf("6.3") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 10;
            } else if (var4.indexOf("10.0") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               if (var5.indexOf("11") != -1) {
                  if (var1 == 1456249821) {
                     throw new IllegalStateException();
                  }

                  var9 = 12;
               } else {
                  var9 = 11;
               }
            } else if (var4.indexOf("11.0") != -1) {
               var9 = 12;
            }
         } else if (2 == var2) {
            if (var4.indexOf("10.4") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 20;
            } else if (var4.indexOf("10.5") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 21;
            } else if (var4.indexOf("10.6") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 22;
            } else if (var4.indexOf("10.7") != -1) {
               var9 = 23;
            } else if (var4.indexOf("10.8") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 24;
            } else if (var4.indexOf("10.9") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 25;
            } else if (var4.indexOf("10.10") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 26;
            } else if (var4.indexOf("10.11") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 27;
            } else if (var4.indexOf("10.12") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 28;
            } else if (var4.indexOf("10.13") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 29;
            } else if (var4.indexOf("10.14") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 30;
            } else if (var4.indexOf("10.15") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 31;
            } else if (var4.indexOf("11.") != -1) {
               var9 = 32;
            } else if (var4.indexOf("12.") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 33;
            } else if (var4.indexOf("13.") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 34;
            } else if (var4.indexOf("14.") != -1) {
               if (var1 == 1456249821) {
                  throw new IllegalStateException();
               }

               var9 = 35;
            }
         }

         byte var10;
         if (var6.toLowerCase().indexOf("sun") != -1) {
            if (var1 == 1456249821) {
               throw new IllegalStateException();
            }

            var10 = 1;
         } else if (var6.toLowerCase().indexOf("microsoft") == -1) {
            var10 = 2;
         } else if (var6.toLowerCase().indexOf("apple") != -1) {
            if (var1 == 1456249821) {
               throw new IllegalStateException();
            }

            var10 = 3;
         } else if (var6.toLowerCase().indexOf("oracle") != -1) {
            if (var1 == 1456249821) {
               throw new IllegalStateException();
            }

            var10 = 5;
         } else {
            var10 = 4;
         }

         method12085(this, var7, (byte)-93);
         boolean var11 = false;
         int var12 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
         int var13;
         if (this.field6561 * -1618329233 > 3) {
            if (var1 == 1456249821) {
               throw new IllegalStateException();
            }

            var13 = Runtime.getRuntime().availableProcessors();
         } else {
            var13 = 0;
         }

         byte var14 = 0;
         String var15 = "";
         String var16 = "";
         String var17 = "";
         String var18 = "";
         String var19 = "";
         String var20 = "";
         boolean var21 = false;
         boolean var22 = false;
         boolean var23 = false;
         boolean var24 = false;
         int[] var25 = new int[3];
         boolean var26 = false;
         String var27 = "";
         String var28 = "";
         String var29 = "";
         boolean var30 = false;
         return new PlatformInfo(
            var2,
            var8,
            var9,
            var10,
            this.field6561 * -1618329233,
            -1877173163 * this.field6562,
            1264693035 * this.field6563,
            false,
            var12,
            var13,
            var14,
            0,
            var15,
            var16,
            var17,
            var18,
            0,
            0,
            0,
            0,
            var19,
            var20,
            var25,
            0,
            "",
            "",
            var29
         );
      } catch (RuntimeException var35) {
         throw classEG.newRunException(var35, "vs.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvs;Ljava/lang/String;B)V")
   @ObfuscatedName("rz")
   public static void method12085(classVS var0, String var1, byte var2) {
      if (var0 == null) {
         var0.method12086(var1, var2);
      } else {
         try {
            if (var1.startsWith("1.")) {
               var0.method12088(var1, (byte)6);
            } else {
               method12092(var0, var1, -1939796773);
            }

            var0.method12097(var1);
         } catch (RuntimeException var3) {
            throw classEG.newRunException(var3, "vs.af(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("aa")
   void method12089(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.field6561 = Integer.parseInt(var2[1]) * 531774863;
         var2 = var2[2].split("_");
         this.field6562 = Integer.parseInt(var2[0]) * 1045659901;
         this.field6563 = Integer.parseInt(var2[1]) * 731092867;
      } catch (Exception var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ao")
   void method12090(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.field6561 = Integer.parseInt(var2[1]) * 1146348709;
         var2 = var2[2].split("_");
         this.field6562 = Integer.parseInt(var2[0]) * -1182872104;
         this.field6563 = Integer.parseInt(var2[1]) * 731092867;
      } catch (Exception var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("tm")
   public void method12096(String var1) {
      String[] var2 = var1.split(".");

      try {
         this.field6561 = Integer.parseInt(var2[0]) * 531774863;
         this.field6562 = Integer.parseInt(var2[1]) * 1045659901;
         this.field6563 = Integer.parseInt(var2[2]) * 731092867;
      } catch (RuntimeException var8) {
         RuntimeMXBean var4 = ManagementFactory.getRuntimeMXBean();
         byte var5 = 1;

         for (String var7 : var4.getInputArguments()) {
            if (var7.hashCode() == -1770782710) {
               var5 = 0;
            }
         }

         this.field6562 = var5 * 1045659901;
      } catch (Exception var9) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ay")
   void method12094(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.field6561 = Integer.parseInt(var2[0]) * 531774863;
         this.field6562 = Integer.parseInt(var2[1]) * 1045659901;
         this.field6563 = Integer.parseInt(var2[2]) * 731092867;
      } catch (Exception var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Lte;Ljava/lang/Object;III)I")
   @ObfuscatedName("af")
   public static int method12082(classTE var0, Object var1, int var2, int var3, int var4) {
      try {
         if (var2 < 0) {
            var2 = 0;
         }

         label120: {
            if (var3 >= 0) {
               if (var4 != 1782791469) {
                  throw new IllegalStateException();
               }

               if (var3 <= var0.method10756(-100213279)) {
                  break label120;
               }

               if (var4 != 1782791469) {
                  throw new IllegalStateException();
               }
            }

            var3 = var0.method10756(465615141);
         }

         if (var0.field6128 == classYY.field7111) {
            if (var4 != 1782791469) {
               throw new IllegalStateException();
            }

            int[] var5 = var0.method10748(-269155425);
            int var6 = (Integer)var1;

            for (int var7 = var2; var7 < var3; var7++) {
               if (var4 != 1782791469) {
                  throw new IllegalStateException();
               }

               if (var5[var7] == var6) {
                  if (var4 != 1782791469) {
                     throw new IllegalStateException();
                  }

                  return var7;
               }
            }
         } else if (var0.field6128 == classYY.field7115) {
            if (var4 != 1782791469) {
               throw new IllegalStateException();
            }

            long[] var10 = var0.method10750(-1163950028);
            long var12 = (Long)var1;

            for (int var8 = var2; var8 < var3; var8++) {
               if (var4 != 1782791469) {
                  throw new IllegalStateException();
               }

               if (var12 == var10[var8]) {
                  if (var4 != 1782791469) {
                     throw new IllegalStateException();
                  }

                  return var8;
               }
            }
         } else {
            Object[] var11 = classTE.method10753(var0, -2078726263);

            for (int var13 = var2; var13 < var3; var13++) {
               if (var4 != 1782791469) {
                  throw new IllegalStateException();
               }

               if (var1 == var11[var13]) {
                  return var13;
               }

               if (var4 != 1782791469) {
                  throw new IllegalStateException();
               }

               if (var11[var13] != null) {
                  if (var4 != 1782791469) {
                     throw new IllegalStateException();
                  }

                  if (var11[var13].equals(var1)) {
                     if (var4 != 1782791469) {
                        throw new IllegalStateException();
                     }

                     return var13;
                  }
               }
            }
         }

         return -1;
      } catch (RuntimeException var9) {
         throw classEG.newRunException(var9, "vs.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V")
   @ObfuscatedName("af")
   void method12086(String var1, byte var2) {
      try {
         if (var1.startsWith("1.")) {
            this.method12088(var1, (byte)6);
         } else {
            method12092(this, var1, -1939796773);
         }

         this.method12096(var1);
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "vs.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ab")
   void method12095(String var1, int var2) {
      try {
         String[] var3 = var1.split("\\.");

         try {
            this.field6562 = Integer.parseInt(var3[0]) * 531774863;
            this.field6562 = Integer.parseInt(var3[1]) * 1045659901;
            this.field6562 = Integer.parseInt(var3[2]) * 731092867;
         } catch (Exception var5) {
         }
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "vs.ab(" + ')');
      }
   }
}
