import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.nio.file.Paths;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vn")
public class PlatformInfo extends Node implements classEX {
   @ObfuscatedName("bc")
   boolean field4524;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final int field6217 = 2;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field6216 = 3;
   @ObfuscatedName("bx")
   int cpuCores;
   @ObfuscatedName("cn")
   String field4537;
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final int field6219 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field6220 = 21;
   @ObfuscatedName("co")
   String field5116;
   @ToRemove(unused = "true")
   @ObfuscatedName("am")
   static final int field6218 = 25;
   @ToRemove(unused = "true")
   @ObfuscatedName("bz")
   static final int field6223 = 33;
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field6214 = 11;
   @ObfuscatedName("bw")
   public int os;
   @ObfuscatedName("bn")
   int osVersion;
   @ObfuscatedName("bd")
   int vendor;
   @ObfuscatedName("br")
   int javaMajor;
   @ObfuscatedName("bh")
   int javaMinor;
   @ObfuscatedName("bl")
   int javaPatch;
   @ObfuscatedName("cc")
   int field5089;
   @ObfuscatedName("bq")
   int maxMemory;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final int field6215 = 0;
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field6221 = 2;
   @ObfuscatedName("ch")
   int clockSpeed;
   @ObfuscatedName("ce")
   String field4536;
   @ObfuscatedName("cu")
   String field4541;
   @ObfuscatedName("ct")
   String field5103;
   @ObfuscatedName("cm")
   String field5110;
   @ObfuscatedName("cb")
   int field4512;
   @ObfuscatedName("ck")
   int field5112;
   @ObfuscatedName("bv")
   int field5105;
   @ObfuscatedName("cd")
   String field5120;
   @ObfuscatedName("bf")
   boolean arch64;
   @ObfuscatedName("cs")
   int field5114;
   @ObfuscatedName("cx")
   int[] field4539 = new int[3];
   @ObfuscatedName("cg")
   int field4540;
   @ObfuscatedName("cp")
   String field5119;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field6222 = 1;

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("az")
   public String method11335(int var1) {
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
            if (null != var4) {
               var4.close();
            }
         } catch (IOException var16) {
         }
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;I)V")
   @ObfuscatedName("av")
   public void write(Buffer var1, int var2) {
      try {
         var1.writeByte(9, (short)-27911);
         var1.writeByte(this.os * -208903543, (short)-26176);
         byte var10001;
         if (this.arch64) {
            if (var2 <= 8641463) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         var1.writeByte(var10001, (short)-16273);
         var1.writeShort(-1081993137 * this.osVersion, -1498179250);
         var1.writeByte(this.vendor * -639246517, (short)-8389);
         var1.writeByte(448210999 * this.javaMajor, (short)-14464);
         var1.writeByte(132591797 * this.javaMinor, (short)-10805);
         var1.writeByte(-478159607 * this.javaPatch, (short)-30411);
         if (this.field4524) {
            if (var2 <= 8641463) {
               return;
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         var1.writeByte(var10001, (short)-4181);
         var1.writeShort(-600139767 * this.maxMemory, -1230777387);
         var1.writeByte(this.cpuCores * -1718995343, (short)-5558);
         var1.writeMedium(-1423069925 * this.field5105, 2141779758);
         var1.writeShort(701611621 * this.clockSpeed, -1779815537);
         var1.writeStringCp1252NullCircumfixed(this.field4536, 731661595);
         var1.writeStringCp1252NullCircumfixed(this.field4541, -1444259167);
         var1.writeStringCp1252NullCircumfixed(this.field5103, 1515225526);
         var1.writeStringCp1252NullCircumfixed(this.field5110, -1208891759);
         var1.writeByte(980285567 * this.field5112, (short)-11909);
         var1.writeShort(this.field4512 * -1613592189, -1999594072);
         var1.writeStringCp1252NullCircumfixed(this.field4537, 583980699);
         var1.writeStringCp1252NullCircumfixed(this.field5116, 358213261);
         var1.writeByte(-1928072387 * this.field5089, (short)-8367);
         var1.writeByte(this.field5114 * 1643159983, (short)-3335);

         for (int var3 = 0; var3 < this.field4539.length; var3++) {
            if (var2 <= 8641463) {
               return;
            }

            var1.writeInt(this.field4539[var3], 997585420);
         }

         var1.writeInt(1210319985 * this.field4540, 1233798925);
         var1.writeStringCp1252NullCircumfixed(this.field5119, 575430875);
         var1.writeStringCp1252NullCircumfixed(this.field5120, 1657557967);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vn.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvn;)I")
   @ObfuscatedName("hy")
   public static int method11330(PlatformInfo var0) {
      if (var0 == null) {
         var0.method11334();
      }

      int var1 = 39;
      var1 += classGW.method4375(var0.field4536, -1889223997);
      var1 += classGW.method4375(var0.field4541, -2078974741);
      var1 += classGW.method4375(var0.field5103, -2058282300);
      var1 += classGW.method4375(var0.field5110, -2105376112);
      var1 += classGW.method4375(var0.field4537, -2032162420);
      var1 += classGW.method4375(var0.field5116, -1993590715);
      var1 += classGW.method4375(var0.field5119, -2125790187);
      return var1 + classGW.method4375(var0.field5120, -1917005870);
   }

   PlatformInfo(
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
      this.os = -475024455 * var1;
      this.arch64 = var2;
      this.osVersion = var3 * 1864236719;
      this.vendor = var4 * -1900400029;
      this.javaMajor = 1226378631 * var5;
      this.javaMinor = 1538014621 * var6;
      this.javaPatch = var7 * -121323207;
      this.field4524 = var8;
      this.maxMemory = var9 * -975145415;
      this.cpuCores = -1964848495 * var10;
      this.field5105 = -1166416621 * var11;
      this.clockSpeed = -221265043 * var12;
      this.field4536 = var13;
      this.field4541 = var14;
      this.field5103 = var15;
      this.field5110 = var16;
      this.field4512 = -1671967445 * var17;
      this.field5112 = var18 * 1295632255;
      this.field5089 = var19 * -596509675;
      this.field5114 = 1856066895 * var20;
      this.field4537 = var21;
      this.field5116 = var22;
      this.field4539 = var23;
      this.field4540 = var24 * -1493222255;
      this.field5119 = var25;
      this.field5120 = var26;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   public int method11331() {
      int var1 = -880635206;
      var1 += classGW.method4375(this.field4536, -2074953226);
      var1 += classGW.method4375(this.field4541, -2127409236);
      var1 += classGW.method4375(this.field5103, -1996349878);
      var1 += classGW.method4375(this.field5110, -1945527170);
      var1 += classGW.method4375(this.field4537, -1933286992);
      var1 += classGW.method4375(this.field5116, -1963364094);
      var1 += classGW.method4375(this.field5119, -2075112559);
      return var1 + classGW.method4375(this.field5120, -1862180083);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("aj")
   public void method11327(Buffer var1) {
      var1.writeByte(9, (short)-9298);
      var1.writeByte(this.os * -208903543, (short)-27710);
      var1.writeByte(this.arch64 ? 1 : 0, (short)-26588);
      var1.writeShort(283307009 * this.osVersion, -1797052285);
      var1.writeByte(this.vendor * 1020579006, (short)-26535);
      var1.writeByte(448210999 * this.javaMajor, (short)-7459);
      var1.writeByte(968830359 * this.javaMinor, (short)-13313);
      var1.writeByte(167760082 * this.javaPatch, (short)-27123);
      var1.writeByte(this.field4524 ? 1 : 0, (short)-17122);
      var1.writeShort(-600139767 * this.maxMemory, -2023165779);
      var1.writeByte(this.cpuCores * 1657432629, (short)-16077);
      var1.writeMedium(-1423069925 * this.field5105, 2145396393);
      var1.writeShort(-1857095354 * this.clockSpeed, -1562732669);
      var1.writeStringCp1252NullCircumfixed(this.field4536, -1322371291);
      var1.writeStringCp1252NullCircumfixed(this.field4541, 805532592);
      var1.writeStringCp1252NullCircumfixed(this.field5103, 757882600);
      var1.writeStringCp1252NullCircumfixed(this.field5110, 312664591);
      var1.writeByte(651312280 * this.field5112, (short)-9071);
      var1.writeShort(this.field4512 * 1286537453, -1631590717);
      var1.writeStringCp1252NullCircumfixed(this.field4537, 1972043916);
      var1.writeStringCp1252NullCircumfixed(this.field5116, 1318120500);
      var1.writeByte(-1251205788 * this.field5089, (short)-29538);
      var1.writeByte(this.field5114 * 1643159983, (short)-8569);

      for (int var2 = 0; var2 < this.field4539.length; var2++) {
         var1.writeInt(this.field4539[var2], 1219159922);
      }

      var1.writeInt(-1114114218 * this.field4540, 1173095047);
      var1.writeStringCp1252NullCircumfixed(this.field5119, 1517956104);
      var1.writeStringCp1252NullCircumfixed(this.field5120, 1910627459);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   public void method11328(Buffer var1) {
      var1.writeByte(9, (short)-23733);
      var1.writeByte(this.os * -208903543, (short)-5426);
      var1.writeByte(this.arch64 ? 1 : 0, (short)-18627);
      var1.writeShort(-1081993137 * this.osVersion, -1767135766);
      var1.writeByte(this.vendor * -639246517, (short)-79);
      var1.writeByte(448210999 * this.javaMajor, (short)-19062);
      var1.writeByte(132591797 * this.javaMinor, (short)-25486);
      var1.writeByte(-478159607 * this.javaPatch, (short)-11952);
      var1.writeByte(this.field4524 ? 1 : 0, (short)-32189);
      var1.writeShort(-600139767 * this.maxMemory, -2017549066);
      var1.writeByte(this.cpuCores * -1718995343, (short)-32581);
      var1.writeMedium(-1423069925 * this.field5105, 2143261317);
      var1.writeShort(701611621 * this.clockSpeed, -1806038628);
      var1.writeStringCp1252NullCircumfixed(this.field4536, -1742588516);
      var1.writeStringCp1252NullCircumfixed(this.field4541, -1542934616);
      var1.writeStringCp1252NullCircumfixed(this.field5103, -2040949477);
      var1.writeStringCp1252NullCircumfixed(this.field5110, -802632592);
      var1.writeByte(980285567 * this.field5112, (short)-27461);
      var1.writeShort(this.field4512 * -1613592189, -1307646103);
      var1.writeStringCp1252NullCircumfixed(this.field4537, -749245891);
      var1.writeStringCp1252NullCircumfixed(this.field5116, 259614870);
      var1.writeByte(-1928072387 * this.field5089, (short)-4372);
      var1.writeByte(this.field5114 * 1643159983, (short)-18703);

      for (int var2 = 0; var2 < this.field4539.length; var2++) {
         var1.writeInt(this.field4539[var2], 475934314);
      }

      var1.writeInt(1210319985 * this.field4540, 2081784161);
      var1.writeStringCp1252NullCircumfixed(this.field5119, 375911919);
      var1.writeStringCp1252NullCircumfixed(this.field5120, -1610061172);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   public int method11332() {
      int var1 = 39;
      var1 += classGW.method4375(this.field4536, -1987631776);
      var1 += classGW.method4375(this.field4541, -2007719129);
      var1 += classGW.method4375(this.field5103, -2084419779);
      var1 += classGW.method4375(this.field5110, -1935852072);
      var1 += classGW.method4375(this.field4537, -2079416492);
      var1 += classGW.method4375(this.field5116, -2128568710);
      var1 += classGW.method4375(this.field5119, -2032132169);
      return var1 + classGW.method4375(this.field5120, -2023288643);
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("at")
   public int size(byte var1) {
      try {
         int var2 = 39;
         var2 += classGW.method4375(this.field4536, -1888941255);
         var2 += classGW.method4375(this.field4541, -2043889289);
         var2 += classGW.method4375(this.field5103, -2032890097);
         var2 += classGW.method4375(this.field5110, -2084241268);
         var2 += classGW.method4375(this.field4537, -1925236684);
         var2 += classGW.method4375(this.field5116, -1919421778);
         var2 += classGW.method4375(this.field5119, -2105035507);
         return var2 + classGW.method4375(this.field5120, -2065756944);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "vn.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ae")
   public void method11329(Buffer var1) {
      var1.writeByte(9, (short)-23401);
      var1.writeByte(this.os * -208903543, (short)-28621);
      var1.writeByte(this.arch64 ? 1 : 0, (short)-22297);
      var1.writeShort(-1081993137 * this.osVersion, -1961898762);
      var1.writeByte(this.vendor * -639246517, (short)-23803);
      var1.writeByte(448210999 * this.javaMajor, (short)-23900);
      var1.writeByte(132591797 * this.javaMinor, (short)-18294);
      var1.writeByte(-478159607 * this.javaPatch, (short)-7976);
      var1.writeByte(this.field4524 ? 1 : 0, (short)-24583);
      var1.writeShort(-600139767 * this.maxMemory, -1883012668);
      var1.writeByte(this.cpuCores * -1718995343, (short)-21008);
      var1.writeMedium(-1423069925 * this.field5105, 2138305972);
      var1.writeShort(701611621 * this.clockSpeed, -2085013937);
      var1.writeStringCp1252NullCircumfixed(this.field4536, -96257205);
      var1.writeStringCp1252NullCircumfixed(this.field4541, 1627942752);
      var1.writeStringCp1252NullCircumfixed(this.field5103, 1607103961);
      var1.writeStringCp1252NullCircumfixed(this.field5110, -1449070111);
      var1.writeByte(980285567 * this.field5112, (short)-14468);
      var1.writeShort(this.field4512 * -1613592189, -1772032359);
      var1.writeStringCp1252NullCircumfixed(this.field4537, 1995715026);
      var1.writeStringCp1252NullCircumfixed(this.field5116, -1280268189);
      var1.writeByte(-1928072387 * this.field5089, (short)-1423);
      var1.writeByte(this.field5114 * 1643159983, (short)-14874);

      for (int var2 = 0; var2 < this.field4539.length; var2++) {
         var1.writeInt(this.field4539[var2], 426757630);
      }

      var1.writeInt(1210319985 * this.field4540, 684810699);
      var1.writeStringCp1252NullCircumfixed(this.field5119, -565234882);
      var1.writeStringCp1252NullCircumfixed(this.field5120, 1504456245);
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ay")
   public String method11336(int var1) {
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

            if (var6.length() == 222708822) {
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
            if (null != var4) {
               var4.close();
            }
         } catch (IOException var16) {
         }
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("au")
   public String method11337(int var1) {
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
            if (null != var4) {
               var4.close();
            }
         } catch (IOException var16) {
         }
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Lwc;B)Ljava/lang/String;")
   @ObfuscatedName("ag")
   public static String method11325(CharSequence var0, LoginType var1, byte var2) {
      try {
         if (var0 == null) {
            if (var2 == 1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var3 = 0;

            int var4;
            for (var4 = var0.length(); var3 < var4; var3++) {
               if (var2 == 1) {
                  throw new IllegalStateException();
               }

               if (!classFO.method4032(var0.charAt(var3), (byte)-1)) {
                  break;
               }

               if (var2 == 1) {
                  throw new IllegalStateException();
               }
            }

            while (var4 > var3) {
               if (var2 == 1) {
                  throw new IllegalStateException();
               }

               if (!classFO.method4032(var0.charAt(var4 - 1), (byte)-1)) {
                  break;
               }

               if (var2 == 1) {
                  throw new IllegalStateException();
               }

               var4--;
            }

            int var5 = var4 - var3;
            if (var5 >= 1) {
               if (var2 == 1) {
                  throw new IllegalStateException();
               }

               byte var7;
               if (null == var1) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  var7 = 12;
               } else {
                  switch (-873290805 * var1.field6354) {
                     case 2:
                        var7 = 20;
                        break;
                     default:
                        var7 = 12;
                  }
               }

               if (var5 <= var7) {
                  StringBuilder var6 = new StringBuilder(var5);

                  for (int var12 = var3; var12 < var4; var12++) {
                     char var8 = var0.charAt(var12);
                     if (!class406.method8775(var8, (byte)112)) {
                        if (var2 == 1) {
                           throw new IllegalStateException();
                        }
                     } else {
                        char var9;
                        switch (var8) {
                           case ' ':
                           case '-':
                           case '_':
                           case ' ':
                              var9 = '_';
                              break;
                           case '#':
                           case '[':
                           case ']':
                              var9 = var8;
                              break;
                           case 'À':
                           case 'Á':
                           case 'Â':
                           case 'Ã':
                           case 'Ä':
                           case 'à':
                           case 'á':
                           case 'â':
                           case 'ã':
                           case 'ä':
                              var9 = 'a';
                              break;
                           case 'Ç':
                           case 'ç':
                              var9 = 'c';
                              break;
                           case 'È':
                           case 'É':
                           case 'Ê':
                           case 'Ë':
                           case 'è':
                           case 'é':
                           case 'ê':
                           case 'ë':
                              var9 = 'e';
                              break;
                           case 'Í':
                           case 'Î':
                           case 'Ï':
                           case 'í':
                           case 'î':
                           case 'ï':
                              var9 = 'i';
                              break;
                           case 'Ñ':
                           case 'ñ':
                              var9 = 'n';
                              break;
                           case 'Ò':
                           case 'Ó':
                           case 'Ô':
                           case 'Õ':
                           case 'Ö':
                           case 'ò':
                           case 'ó':
                           case 'ô':
                           case 'õ':
                           case 'ö':
                              var9 = 'o';
                              break;
                           case 'Ù':
                           case 'Ú':
                           case 'Û':
                           case 'Ü':
                           case 'ù':
                           case 'ú':
                           case 'û':
                           case 'ü':
                              var9 = 'u';
                              break;
                           case 'ß':
                              var9 = 'b';
                              break;
                           case 'ÿ':
                           case 'Ÿ':
                              var9 = 'y';
                              break;
                           default:
                              var9 = Character.toLowerCase(var8);
                        }

                        if (0 == var9) {
                           if (var2 == 1) {
                              throw new IllegalStateException();
                           }
                        } else {
                           var6.append(var9);
                        }
                     }
                  }

                  if (var6.length() == 0) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  return var6.toString();
               }
            }

            return null;
         }
      } catch (RuntimeException var11) {
         throw RestClientThreadFactory.newRunException(var11, "vn.ag(" + ')');
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "(Lvn;II)Ljava/lang/String;")
   @ObfuscatedName("li")
   public static String method11338(PlatformInfo var0, int var1, int var2) {
      if (var0 == null) {
         var0.getDeviceId(var1, var1);
      }

      try {
         String var3 = "";
         String var4 = "12345678-0000-0000-0000-123456789012";
         switch (var1) {
            case 1:
               var3 = "wmic csproduct get UUID";
               break;
            case 2:
               var3 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
               break;
            case 3:
               var3 = "cat /etc/machine-id";
               break;
            default:
               return "Unknown";
         }

         BufferedReader var5 = null;
         boolean var18 = false /* VF: Semaphore variable */;

         label181: {
            try {
               var18 = true;
               Process var6 = Runtime.getRuntime().exec(var3);
               var5 = new BufferedReader(new InputStreamReader(var6.getInputStream()));
               StringBuilder var7 = new StringBuilder();

               String var8;
               while ((var8 = var5.readLine()) != null) {
                  if (var2 != 168937541) {
                     throw new IllegalStateException();
                  }

                  var7.append(var8 + "\n");
               }

               if (var1 == 1) {
                  if (var2 != 168937541) {
                     throw new IllegalStateException();
                  }

                  var4 = var7.substring(var7.indexOf("\n"), var7.length()).trim();
                  var18 = false;
               } else if (2 == var1) {
                  if (var2 != 168937541) {
                     throw new IllegalStateException();
                  }

                  int var9 = var7.indexOf("UUID: ") + 36;
                  var4 = var7.substring(var7.indexOf("UUID: "), var9).replace("UUID: ", "");
                  var18 = false;
               } else if (var1 == 3) {
                  if (var2 != 168937541) {
                     throw new IllegalStateException();
                  }

                  if (var7.length() == 33) {
                     if (var2 != 168937541) {
                        throw new IllegalStateException();
                     }

                     var7 = new StringBuilder(var7.substring(0, var7.length() - 1));
                  }

                  if (var7.length() == 32) {
                     if (var2 != 168937541) {
                        throw new IllegalStateException();
                     }

                     var7.insert(20, "-");
                     var7.insert(16, "-");
                     var7.insert(12, "-");
                     var7.insert(8, "-");
                     var4 = var7.toString();
                     var18 = false;
                  } else {
                     var4 = "12345678-0000-0000-0000-123456789012";
                     var18 = false;
                  }
               } else {
                  var18 = false;
               }
               break label181;
            } catch (Exception var22) {
               var18 = false;
            } finally {
               if (var18) {
                  try {
                     if (null != var5) {
                        if (var2 != 168937541) {
                           throw new IllegalStateException();
                        }

                        var5.close();
                     }
                  } catch (IOException var19) {
                  }
               }
            }

            try {
               if (null != var5) {
                  if (var2 != 168937541) {
                     throw new IllegalStateException();
                  }

                  var5.close();
                  return var4;
               }
            } catch (IOException var20) {
            }

            return var4;
         }

         try {
            if (null != var5) {
               var5.close();
            }
         } catch (IOException var21) {
         }

         return var4;
      } catch (RuntimeException var24) {
         throw RestClientThreadFactory.newRunException(var24, "vn.ag(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("xd")
   public static void method11341(int var0) {
      try {
         if (var0 != -176913511) {
            IllegalStateException var10000 = new IllegalStateException();
            ProcessHandle var1 = ProcessHandle.current();
            if (var1.info().command().isPresent()) {
               WorldMapLabelSize.platformInfo.field5103 = Paths.get(var1.info().command().get()).getFileName().toString();
               if (WorldMapLabelSize.platformInfo.field5103.length() > 10) {
                  WorldMapLabelSize.platformInfo.field5103 = WorldMapLabelSize.platformInfo.field5103.substring(0, 10);
               }
            }

            ProcessHandle var2 = var1.parent().orElse(null);
            if (var2 != null && var2.info().command().isPresent()) {
               WorldMapLabelSize.platformInfo.field5110 = Paths.get(var2.info().command().get()).getFileName().toString();
               if (WorldMapLabelSize.platformInfo.field5110.length() > 10) {
                  WorldMapLabelSize.platformInfo.field5110 = WorldMapLabelSize.platformInfo.field5110.substring(0, 10);
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
                  WorldMapLabelSize.platformInfo.field5120 = var8;
                  if (WorldMapLabelSize.platformInfo.field5120.length() > 22) {
                     WorldMapLabelSize.platformInfo.field5120 = WorldMapLabelSize.platformInfo.field5120.substring(0, 22);
                  }
               }
            }

            throw var10000;
         }
      } catch (Exception var9) {
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;")
   @ObfuscatedName("ag")
   public String getDeviceId(int var1, int var2) {
      try {
         String var3 = "";
         String var4 = "12345678-0000-0000-0000-123456789012";
         switch (var1) {
            case 1:
               var3 = "wmic csproduct get UUID";
               break;
            case 2:
               var3 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
               break;
            case 3:
               var3 = "cat /etc/machine-id";
               break;
            default:
               return "Unknown";
         }

         BufferedReader var5 = null;
         boolean var18 = false /* VF: Semaphore variable */;

         label175: {
            try {
               var18 = true;
               Process var6 = Runtime.getRuntime().exec(var3);
               var5 = new BufferedReader(new InputStreamReader(var6.getInputStream()));
               StringBuilder var7 = new StringBuilder();

               String var8;
               while ((var8 = var5.readLine()) != null) {
                  if (var2 != 168937541) {
                     throw new IllegalStateException();
                  }

                  var7.append(var8 + "\n");
               }

               if (var1 == 1) {
                  if (var2 != 168937541) {
                     throw new IllegalStateException();
                  }

                  var4 = var7.substring(var7.indexOf("\n"), var7.length()).trim();
                  var18 = false;
               } else if (2 == var1) {
                  if (var2 != 168937541) {
                     throw new IllegalStateException();
                  }

                  int var9 = var7.indexOf("UUID: ") + 36;
                  var4 = var7.substring(var7.indexOf("UUID: "), var9).replace("UUID: ", "");
                  var18 = false;
               } else if (var1 == 3) {
                  if (var2 != 168937541) {
                     throw new IllegalStateException();
                  }

                  if (var7.length() == 33) {
                     if (var2 != 168937541) {
                        throw new IllegalStateException();
                     }

                     var7 = new StringBuilder(var7.substring(0, var7.length() - 1));
                  }

                  if (var7.length() == 32) {
                     if (var2 != 168937541) {
                        throw new IllegalStateException();
                     }

                     var7.insert(20, "-");
                     var7.insert(16, "-");
                     var7.insert(12, "-");
                     var7.insert(8, "-");
                     var4 = var7.toString();
                     var18 = false;
                  } else {
                     var4 = "12345678-0000-0000-0000-123456789012";
                     var18 = false;
                  }
               } else {
                  var18 = false;
               }
               break label175;
            } catch (Exception var22) {
               var18 = false;
            } finally {
               if (var18) {
                  try {
                     if (null != var5) {
                        if (var2 != 168937541) {
                           throw new IllegalStateException();
                        }

                        var5.close();
                     }
                  } catch (IOException var19) {
                  }
               }
            }

            try {
               if (null != var5) {
                  if (var2 != 168937541) {
                     throw new IllegalStateException();
                  }

                  var5.close();
                  return var4;
               }
            } catch (IOException var20) {
            }

            return var4;
         }

         try {
            if (null != var5) {
               var5.close();
            }
         } catch (IOException var21) {
         }

         return var4;
      } catch (RuntimeException var24) {
         throw RestClientThreadFactory.newRunException(var24, "vn.ag(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lvn;I)Ljava/lang/String;")
   @ObfuscatedName("he")
   public static String method11340(PlatformInfo var0, int var1) {
      if (var0 == null) {
         var0.method11331();
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
            if (var6.length() == 2043644574) {
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
            if (null != var4) {
               var4.close();
            }
         } catch (IOException var16) {
         }
      }

      return var3;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   public int method11334() {
      int var1 = 39;
      var1 += classGW.method4375(this.field4537, -1889223997);
      var1 += classGW.method4375(this.field5110, -2078974741);
      var1 += classGW.method4375(this.field5119, -2058282300);
      var1 += classGW.method4375(this.field5103, -2105376112);
      var1 += classGW.method4375(this.field5116, -2032162420);
      var1 += classGW.method4375(this.field5110, -1993590715);
      var1 += classGW.method4375(this.field5119, -2125790187);
      return var1 + classGW.method4375(this.field5116, -1917005870);
   }
}
