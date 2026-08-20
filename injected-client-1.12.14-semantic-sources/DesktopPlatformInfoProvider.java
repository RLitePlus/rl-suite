import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vi")
public class DesktopPlatformInfoProvider implements classVM {
   @ObfuscatedName("rk")
   static int selectedSpellFlags;
   @ObfuscatedName("aj")
   int field6168;
   @ObfuscatedName("an")
   int field6169;
   @ObfuscatedName("ae")
   int field6167;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final String field6172 = "\\.";
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field6170 = 0;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ig")
   public void method11303(String var1) {
      String[] var2 = var1.split(".");

      try {
         this.field6169 = Integer.parseInt(var2[0]) * -965599541;
         this.field6167 = Integer.parseInt(var2[1]) * 1545588975;
         this.field6168 = Integer.parseInt(var2[2]) * 105412717;
      } catch (RuntimeException var8) {
         RuntimeMXBean var4 = ManagementFactory.getRuntimeMXBean();
         byte var5 = 1;

         for (String var7 : var4.getInputArguments()) {
            if (var7.hashCode() == -1770782710) {
               var5 = 0;
            }
         }

         this.field6167 = var5 * 1545588975;
      } catch (Exception var9) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvi;Ljava/lang/String;I)V")
   @ObfuscatedName("um")
   public static void method11296(DesktopPlatformInfoProvider var0, String var1, int var2) {
      if (var0 == null) {
         var0.method11298(var1, var2);
      } else {
         try {
            String[] var3 = var1.split("\\.");

            try {
               var0.field6169 = Integer.parseInt(var3[1]) * -965599541;
               var3 = var3[2].split("_");
               var0.field6167 = Integer.parseInt(var3[0]) * 1545588975;
               var0.field6168 = Integer.parseInt(var3[1]) * 105412717;
            } catch (Exception var5) {
            }
         } catch (RuntimeException var6) {
            throw RestClientThreadFactory.newRunException(var6, "vi.ag(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("aw")
   void method11297(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.field6169 = Integer.parseInt(var2[1]) * -965599541;
         var2 = var2[2].split("_");
         this.field6167 = Integer.parseInt(var2[0]) * 1545588975;
         this.field6168 = Integer.parseInt(var2[1]) * 105412717;
      } catch (Exception var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Lvi;Ljava/lang/String;I)V")
   @ObfuscatedName("mg")
   public static void method11293(DesktopPlatformInfoProvider var0, String var1, int var2) {
      if (var0 == null) {
         var0.method11295(var1, var2);
      } else {
         try {
            if (var1.startsWith("1.")) {
               method11296(var0, var1, -1813701978);
            } else {
               var0.method11299(var1, 1888855098);
            }

            var0.method11302(var1);
         } catch (RuntimeException var3) {
            throw RestClientThreadFactory.newRunException(var3, "vi.at(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("an")
   void method11299(String var1, int var2) {
      try {
         String[] var3 = var1.split("\\.");

         try {
            this.field6169 = Integer.parseInt(var3[0]) * -965599541;
            this.field6167 = Integer.parseInt(var3[1]) * 1545588975;
            this.field6168 = Integer.parseInt(var3[2]) * 105412717;
         } catch (Exception var5) {
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "vi.an(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lvn;")
   @ObfuscatedName("av")
   @Override
   public PlatformInfo get(int var1) {
      try {
         byte var2;
         if (AttackOption.osNameLowercase.startsWith("win")) {
            if (var1 >= -2003067923) {
               throw new IllegalStateException();
            }

            var2 = 1;
         } else if (AttackOption.osNameLowercase.startsWith("mac")) {
            if (var1 >= -2003067923) {
               throw new IllegalStateException();
            }

            var2 = 2;
         } else if (AttackOption.osNameLowercase.startsWith("linux")) {
            if (var1 >= -2003067923) {
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
         label302: {
            if (!var3.startsWith("amd64")) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               if (!var3.startsWith("x86_64")) {
                  var8 = false;
                  break label302;
               }

               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }
            }

            var8 = true;
         }

         byte var9 = 0;
         if (1 == var2) {
            if (var1 >= -2003067923) {
               throw new IllegalStateException();
            }

            if (var4.indexOf("4.0") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 1;
            } else if (var4.indexOf("4.1") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 2;
            } else if (var4.indexOf("4.9") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 3;
            } else if (var4.indexOf("5.0") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 4;
            } else if (var4.indexOf("5.1") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 5;
            } else if (var4.indexOf("5.2") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 8;
            } else if (var4.indexOf("6.0") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 6;
            } else if (var4.indexOf("6.1") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 7;
            } else if (var4.indexOf("6.2") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 9;
            } else if (var4.indexOf("6.3") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 10;
            } else if (var4.indexOf("10.0") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               if (var5.indexOf("11") != -1) {
                  var9 = 12;
               } else {
                  var9 = 11;
               }
            } else if (var4.indexOf("11.0") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 12;
            }
         } else if (2 == var2) {
            if (var1 >= -2003067923) {
               throw new IllegalStateException();
            }

            if (var4.indexOf("10.4") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 20;
            } else if (var4.indexOf("10.5") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 21;
            } else if (var4.indexOf("10.6") != -1) {
               var9 = 22;
            } else if (var4.indexOf("10.7") != -1) {
               var9 = 23;
            } else if (var4.indexOf("10.8") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 24;
            } else if (var4.indexOf("10.9") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 25;
            } else if (var4.indexOf("10.10") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 26;
            } else if (var4.indexOf("10.11") != -1) {
               var9 = 27;
            } else if (var4.indexOf("10.12") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 28;
            } else if (var4.indexOf("10.13") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 29;
            } else if (var4.indexOf("10.14") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 30;
            } else if (var4.indexOf("10.15") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 31;
            } else if (var4.indexOf("11.") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 32;
            } else if (var4.indexOf("12.") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 33;
            } else if (var4.indexOf("13.") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 34;
            } else if (var4.indexOf("14.") != -1) {
               if (var1 >= -2003067923) {
                  throw new IllegalStateException();
               }

               var9 = 35;
            }
         }

         byte var10;
         if (var6.toLowerCase().indexOf("sun") != -1) {
            if (var1 >= -2003067923) {
               throw new IllegalStateException();
            }

            var10 = 1;
         } else if (var6.toLowerCase().indexOf("microsoft") == -1) {
            if (var1 >= -2003067923) {
               throw new IllegalStateException();
            }

            var10 = 2;
         } else if (var6.toLowerCase().indexOf("apple") != -1) {
            var10 = 3;
         } else if (var6.toLowerCase().indexOf("oracle") != -1) {
            var10 = 5;
         } else {
            var10 = 4;
         }

         method11293(this, var7, -1292875486);
         boolean var11 = false;
         int var12 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
         int var13;
         if (this.field6169 * -837560605 > 3) {
            if (var1 >= -2003067923) {
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
            this.field6169 * -837560605,
            this.field6167 * 356867599,
            this.field6168 * 1606832485,
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
         throw RestClientThreadFactory.newRunException(var35, "vi.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("un")
   public void method11302(String var1) {
      this.method11303(var1);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvi;Ljava/lang/String;)V")
   @ObfuscatedName("yy")
   public static void method11294(DesktopPlatformInfoProvider var0, String var1) {
      if (var0 == null) {
         var0.method11302(var1);
      } else {
         if (var1.startsWith("1.")) {
            method11296(var0, var1, -1813701978);
         } else {
            var0.method11299(var1, 1390027241);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Lvn;")
   @ObfuscatedName("aj")
   @Override
   public PlatformInfo vmethod440() {
      byte var1;
      if (AttackOption.osNameLowercase.startsWith("win")) {
         var1 = 1;
      } else if (AttackOption.osNameLowercase.startsWith("mac")) {
         var1 = 2;
      } else if (AttackOption.osNameLowercase.startsWith("linux")) {
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

      byte var8 = 0;
      if (1 == var1) {
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
            var8 = 32;
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

      method11293(this, var6, -1792816835);
      boolean var10 = false;
      int var11 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      int var12;
      if (this.field6169 * -837560605 > 3) {
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
         this.field6169 * -837560605,
         this.field6167 * 356867599,
         this.field6168 * 1606832485,
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

   @ObfuscatedSignature(descriptor = "()Lvn;")
   @ObfuscatedName("ae")
   @Override
   public PlatformInfo vmethod441() {
      byte var1;
      if (AttackOption.osNameLowercase.startsWith("win")) {
         var1 = 1;
      } else if (AttackOption.osNameLowercase.startsWith("mac")) {
         var1 = 2;
      } else if (AttackOption.osNameLowercase.startsWith("linux")) {
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

      byte var8 = 0;
      if (1 == var1) {
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
            var8 = 32;
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

      method11293(this, var6, 328646463);
      boolean var10 = false;
      int var11 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      int var12;
      if (this.field6169 * -837560605 > 3) {
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
         this.field6169 * -837560605,
         this.field6167 * 356867599,
         this.field6168 * 1606832485,
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

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvs;I)V")
   @ObfuscatedName("br")
   public static void method11301(WorldMap var0, int var1) {
      if (var0 == null) {
         var0.method11549(var1);
      }

      var0.zoomTarget = var0.getZoomFromPercentage(var1, -1091583679);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("ay")
   void method11300(String var1) {
      String[] var2 = var1.split("\\.");

      try {
         this.field6169 = Integer.parseInt(var2[0]) * -965599541;
         this.field6167 = Integer.parseInt(var2[1]) * 1545588975;
         this.field6168 = Integer.parseInt(var2[2]) * 105412717;
      } catch (Exception var4) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("at")
   void method11295(String var1, int var2) {
      try {
         if (var1.startsWith("1.")) {
            method11296(this, var1, -1813701978);
         } else {
            this.method11299(var1, 1888855098);
         }

         this.method11302(var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vi.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V")
   @ObfuscatedName("ag")
   void method11298(String var1, int var2) {
      try {
         String[] var3 = var1.split("\\.");

         try {
            this.field6169 = Integer.parseInt(var3[1]) * -965599541;
            var3 = var3[2].split("_");
            this.field6168 = Integer.parseInt(var3[0]) * 1545588975;
            this.field6167 = Integer.parseInt(var3[1]) * 105412717;
         } catch (Exception var5) {
         }
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "vi.ag(" + ')');
      }
   }
}
