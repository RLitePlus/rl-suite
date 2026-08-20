import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.nio.file.Paths;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vt")
public class classVT extends classVQ implements classZG {
   @ObfuscatedName("be")
   boolean field6569;
   @ObfuscatedName("bi")
   public int field6573;
   @ObfuscatedName("cl")
   int field6578;
   @ObfuscatedName("cc")
   String field6585;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6596 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   static final int field6601 = 1;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final int field6593 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("al")
   static final int field6599 = 6;
   @ToRemove(unused = "true")
   @ObfuscatedName("aj")
   static final int field6597 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field6600 = 11;
   @ObfuscatedName("bv")
   int field6584;
   @ObfuscatedName("bq")
   int field6571;
   @ToRemove(unused = "true")
   @ObfuscatedName("ax")
   static final int field6602 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field6604 = 1;
   @ObfuscatedName("bf")
   int field6572;
   @ObfuscatedName("ca")
   String field6582;
   @ObfuscatedName("bs")
   int field6568;
   @ObfuscatedName("bd")
   int field6574;
   @ObfuscatedName("bl")
   boolean field6575;
   @ObfuscatedName("ck")
   int field6591;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6594 = 3;
   @ObfuscatedName("bz")
   int field6579;
   @ObfuscatedName("cr")
   int field6576;
   @ObfuscatedName("cb")
   String field6580;
   @ObfuscatedName("cy")
   String field6577;
   @ObfuscatedName("cq")
   int field6587;
   @ObfuscatedName("cs")
   String field6589;
   @ObfuscatedName("bh")
   int field6567;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field6595 = 2;
   @ObfuscatedName("cd")
   int field6586;
   @ObfuscatedName("cv")
   int field6581;
   @ObfuscatedName("ct")
   String field6588;
   @ObfuscatedName("by")
   int field6570;
   @ObfuscatedName("co")
   int[] field6590 = new int[3];
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field6598 = 23;
   @ObfuscatedName("cp")
   String field6583;
   @ObfuscatedName("cu")
   String field6592;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field6603 = 13;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   public int method12099() {
      int var1 = 39;
      String var4 = this.field6580;
      int var3 = var4.length() + 2;
      var1 = var3 + var1;
      String var7 = this.field6577;
      int var6 = var7.length() + 2;
      var1 = var6 + var1;
      String var10 = this.field6585;
      int var9 = var10.length() + 2;
      var1 += var9;
      String var13 = this.field6589;
      int var12 = var13.length() + 2;
      var1 += var12;
      String var16 = this.field6588;
      int var15 = var16.length() + 2;
      var1 = var15 + var1;
      String var19 = this.field6582;
      int var18 = var19.length() + 2;
      var1 += var18;
      String var22 = this.field6583;
      int var21 = var22.length() + 2;
      var1 += var21;
      String var25 = this.field6592;
      int var24 = var25.length() + 2;
      return var24 + var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   public int method12100() {
      int var1 = 39;
      String var4 = this.field6580;
      int var3 = var4.length() + 2;
      var1 = var3 + var1;
      String var7 = this.field6577;
      int var6 = var7.length() + 2;
      var1 = var6 + var1;
      String var10 = this.field6585;
      int var9 = var10.length() + 2;
      var1 += var9;
      String var13 = this.field6589;
      int var12 = var13.length() + 2;
      var1 += var12;
      String var16 = this.field6588;
      int var15 = var16.length() + 2;
      var1 = var15 + var1;
      String var19 = this.field6582;
      int var18 = var19.length() + 2;
      var1 += var18;
      String var22 = this.field6583;
      int var21 = var22.length() + 2;
      var1 += var21;
      String var25 = this.field6592;
      int var24 = var25.length() + 2;
      return var24 + var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvt;I)Ljava/lang/String;")
   @ObfuscatedName("re")
   public static String method12104(classVT var0, int var1) {
      if (var0 == null) {
         var0.method12103(var1);
      }

      String var2 = "";
      String var3 = "12345678-0000-0000-0000-123456789012";
      switch (var1) {
         case 1:
            var2 = "wmic csproduct get UUID";
            break;
         case 2:
            var2 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
            break;
         case 3:
            var2 = "cat /etc/machine-id";
            break;
         default:
            return "Unknown";
      }

      BufferedReader var4 = null;

      try {
         Process var5 = Runtime.getRuntime().exec(var2);
         var4 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
         StringBuilder var6 = new StringBuilder();

         String var7;
         while ((var7 = var4.readLine()) != null) {
            var6.append(var7 + "\n");
         }

         if (var1 == 1) {
            var3 = var6.substring(var6.indexOf("\n"), var6.length()).trim();
         } else if (2 == var1) {
            int var8 = var6.indexOf("UUID: ") + 36;
            var3 = var6.substring(var6.indexOf("UUID: "), var8).replace("UUID: ", "");
         } else if (var1 == 3) {
            if (var6.length() == 33) {
               var6 = new StringBuilder(var6.substring(0, var6.length() - 1));
            }

            if (var6.length() == 32) {
               var6.insert(20, "-");
               var6.insert(16, "-");
               var6.insert(12, "-");
               var6.insert(8, "-");
               var3 = var6.toString();
            } else {
               var3 = "12345678-0000-0000-0000-123456789012";
            }
         }
      } catch (Exception var17) {
      } finally {
         try {
            if (var4 != null) {
               var4.close();
            }
         } catch (IOException var16) {
         }
      }

      return var3;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Llc;I)I")
   @ObfuscatedName("ng")
   public static int method12106(classLC var0, int var1) {
      if (var0 == null) {
         var0.method6732(var1);
      }

      return var1 - 512 + 1343688928;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("kg")
   public static void method12108(int var0) {
      try {
         if (var0 != -176913511) {
            IllegalStateException var10000 = new IllegalStateException();
            ProcessHandle var1 = ProcessHandle.current();
            if (var1.info().command().isPresent()) {
               classEB.field1727.field6585 = Paths.get(var1.info().command().get()).getFileName().toString();
               if (classEB.field1727.field6585.length() > 10) {
                  classEB.field1727.field6585 = classEB.field1727.field6585.substring(0, 10);
               }
            }

            ProcessHandle var2 = var1.parent().orElse(null);
            if (var2 != null && var2.info().command().isPresent()) {
               classEB.field1727.field6589 = Paths.get(var2.info().command().get()).getFileName().toString();
               if (classEB.field1727.field6589.length() > 10) {
                  classEB.field1727.field6589 = classEB.field1727.field6589.substring(0, 10);
               }
            }

            RuntimeMXBean var3 = ManagementFactory.getRuntimeMXBean();

            for (String var5 : var3.getInputArguments()) {
               if (var5.length() > 10 && var5.substring(0, 10).hashCode() == -1094877034) {
                  int var6 = var5.indexOf(61);
                  if (var6 == -1) {
                     var6 = var5.length();
                  }

                  int var7 = var5.lastIndexOf(47, var6);
                  if (var7 == -1) {
                     var7 = var5.lastIndexOf(92, var6);
                  }

                  if (var7 == -1) {
                     var7 = var5.lastIndexOf(58);
                  }

                  String var8 = var5.substring(var7 + 1, var6);
                  classEB.field1727.field6592 = var8;
                  if (classEB.field1727.field6592.length() > 22) {
                     classEB.field1727.field6592 = classEB.field1727.field6592.substring(0, 22);
                  }
               }
            }

            throw var10000;
         }
      } catch (Exception var9) {
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;I)V")
   @ObfuscatedName("az")
   public void method12098(classXY var1, int var2) {
      try {
         classXY.method12971(var1, 9, (byte)-118);
         classXY.method12971(var1, this.field6573 * 857134555, (byte)-5);
         byte var10001;
         if (this.field6569) {
            if (var2 >= -1018984066) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         classXY.method12971(var1, var10001, (byte)-73);
         var1.method12973(this.field6570 * -1531936339, -1542382992);
         classXY.method12971(var1, 846122123 * this.field6571, (byte)-86);
         classXY.method12971(var1, -198600713 * this.field6572, (byte)-105);
         classXY.method12971(var1, this.field6568 * 2058030431, (byte)-50);
         classXY.method12971(var1, 540215665 * this.field6574, (byte)-115);
         if (this.field6575) {
            if (var2 >= -1018984066) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         classXY.method12971(var1, var10001, (byte)-89);
         var1.method12973(1158232215 * this.field6584, -1542382992);
         classXY.method12971(var1, -1837601275 * this.field6567, (byte)-46);
         classXY.method12978(var1, this.field6579 * 1077828361, (byte)-105);
         var1.method12973(this.field6576 * -799972875, -1542382992);
         var1.method12999(this.field6580, -966414083);
         var1.method12999(this.field6577, -966414083);
         var1.method12999(this.field6585, -966414083);
         var1.method12999(this.field6589, -966414083);
         classXY.method12971(var1, 1274675311 * this.field6578, (byte)-34);
         var1.method12973(this.field6587 * 1347703095, -1542382992);
         var1.method12999(this.field6588, -966414083);
         var1.method12999(this.field6582, -966414083);
         classXY.method12971(var1, this.field6586 * -429369269, (byte)-102);
         classXY.method12971(var1, this.field6581 * 2029548605, (byte)-126);

         for (int var3 = 0; var3 < this.field6590.length; var3++) {
            if (var2 >= -1018984066) {
               return;
            }

            var1.method12979(this.field6590[var3], -675380245);
         }

         var1.method12979(1323641761 * this.field6591, -861517239);
         var1.method12999(this.field6583, -966414083);
         var1.method12999(this.field6592, -966414083);
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "vt.az(" + ')');
      }
   }

   classVT(
      int var1,
      boolean var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      boolean var8,
      int var9,
      int var10,
      int var11,
      int var12,
      String var13,
      String var14,
      String var15,
      String var16,
      int var17,
      int var18,
      int var19,
      int var20,
      String var21,
      String var22,
      int[] var23,
      int var24,
      String var25,
      String var26,
      String var27
   ) {
      this.field6573 = var1 * 543891027;
      this.field6569 = var2;
      this.field6570 = var3 * -1381070299;
      this.field6571 = -572376285 * var4;
      this.field6572 = var5 * -145073721;
      this.field6568 = -660042081 * var6;
      this.field6574 = 2112264081 * var7;
      this.field6575 = var8;
      this.field6584 = -996292825 * var9;
      this.field6567 = -1181798707 * var10;
      this.field6579 = 1806672697 * var11;
      this.field6576 = 1749910109 * var12;
      this.field6580 = var13;
      this.field6577 = var14;
      this.field6585 = var15;
      this.field6589 = var16;
      this.field6587 = var17 * 575026311;
      this.field6578 = var18 * 106913423;
      this.field6586 = var19 * -175197853;
      this.field6581 = var20 * -1935359211;
      this.field6588 = var21;
      this.field6582 = var22;
      this.field6590 = var23;
      this.field6591 = -78153631 * var24;
      this.field6583 = var25;
      this.field6592 = var26;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   public int method12101() {
      int var1 = 39;
      String var4 = this.field6580;
      int var3 = var4.length() + 2;
      var1 = var3 + var1;
      String var7 = this.field6577;
      int var6 = var7.length() + 2;
      var1 = var6 + var1;
      String var10 = this.field6585;
      int var9 = var10.length() + 2;
      var1 += var9;
      String var13 = this.field6589;
      int var12 = var13.length() + 2;
      var1 += var12;
      String var16 = this.field6588;
      int var15 = var16.length() + 2;
      var1 = var15 + var1;
      String var19 = this.field6582;
      int var18 = var19.length() + 2;
      var1 += var18;
      String var22 = this.field6583;
      int var21 = var22.length() + 2;
      var1 += var21;
      String var25 = this.field6592;
      int var24 = var25.length() + 2;
      return var24 + var1;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ac")
   public String method12105(int var1) {
      String var2 = "";
      String var3 = "12345678-0000-0000-0000-123456789012";
      switch (var1) {
         case 1:
            var2 = "wmic csproduct get UUID";
            break;
         case 2:
            var2 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
            break;
         case 3:
            var2 = "cat /etc/machine-id";
            break;
         default:
            return "Unknown";
      }

      BufferedReader var4 = null;

      try {
         Process var5 = Runtime.getRuntime().exec(var2);
         var4 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
         StringBuilder var6 = new StringBuilder();

         String var7;
         while ((var7 = var4.readLine()) != null) {
            var6.append(var7 + "\n");
         }

         if (var1 == 1) {
            var3 = var6.substring(var6.indexOf("\n"), var6.length()).trim();
         } else if (2 == var1) {
            int var8 = var6.indexOf("UUID: ") + 36;
            var3 = var6.substring(var6.indexOf("UUID: "), var8).replace("UUID: ", "");
         } else if (var1 == 3) {
            if (var6.length() == 33) {
               var6 = new StringBuilder(var6.substring(0, var6.length() - 1));
            }

            if (var6.length() == 32) {
               var6.insert(20, "-");
               var6.insert(16, "-");
               var6.insert(12, "-");
               var6.insert(8, "-");
               var3 = var6.toString();
            } else {
               var3 = "12345678-0000-0000-0000-123456789012";
            }
         }
      } catch (Exception var17) {
      } finally {
         try {
            if (var4 != null) {
               var4.close();
            }
         } catch (IOException var16) {
         }
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Lvt;I)I")
   @ObfuscatedName("uc")
   public static int method12102(classVT var0, int var1) {
      if (var0 == null) {
         return var0.method12103(var1);
      } else {
         try {
            int var2 = 39;
            String var5 = var0.field6580;
            int var4 = var5.length() + 2;
            var2 = var4 + var2;
            String var8 = var0.field6577;
            int var7 = var8.length() + 2;
            var2 = var7 + var2;
            String var11 = var0.field6585;
            int var10 = var11.length() + 2;
            var2 += var10;
            String var14 = var0.field6589;
            int var13 = var14.length() + 2;
            var2 += var13;
            String var17 = var0.field6588;
            int var16 = var17.length() + 2;
            var2 = var16 + var2;
            String var20 = var0.field6582;
            int var19 = var20.length() + 2;
            var2 += var19;
            String var23 = var0.field6583;
            int var22 = var23.length() + 2;
            var2 += var22;
            String var26 = var0.field6592;
            int var25 = var26.length() + 2;
            return var25 + var2;
         } catch (RuntimeException var27) {
            throw classEG.method3884(var27, "vt.af(" + 41);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   public int method12103(int var1) {
      try {
         int var2 = 39;
         String var5 = this.field6577;
         int var4 = var5.length() + 2;
         var2 = var4 + var2;
         String var8 = this.field6589;
         int var7 = var8.length() + 2;
         var2 = var7 + var2;
         String var11 = this.field6583;
         int var10 = var11.length() + 2;
         var2 += var10;
         String var14 = this.field6589;
         int var13 = var14.length() + 2;
         var2 += var13;
         String var17 = this.field6582;
         int var16 = var17.length() + 2;
         var2 = var16 + var2;
         String var20 = this.field6592;
         int var19 = var20.length() + 2;
         var2 += var19;
         String var23 = this.field6582;
         int var22 = var23.length() + 2;
         var2 += var22;
         String var26 = this.field6580;
         int var25 = var26.length() + 2;
         return var25 + var2;
      } catch (RuntimeException var27) {
         throw classEG.method3884(var27, "vt.af(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;")
   @ObfuscatedName("ae")
   public String method12107(int var1, int var2) {
      return "12345678-0000-0000-0000-123456789012";
   }
}
