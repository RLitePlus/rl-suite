import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yg")
public class RunException extends RuntimeException {
   @ObfuscatedName("at")
   public static String field6660;
   @ObfuscatedName("ag")
   public static int RunException_revision;
   @ObfuscatedName("aj")
   String message;
   @ObfuscatedName("ak")
   Throwable throwable;
   @ToRemove(unused = "true")
   @ObfuscatedName("bo")
   public static final int field6659 = 26;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V")
   @ObfuscatedName("an")
   public static void method12763(String var0, Throwable var1) {
      try {
         String var2 = "";
         if (null != var1) {
            Throwable var4 = var1;
            String var5;
            if (var1 instanceof RunException) {
               RunException var6 = (RunException)var1;
               var5 = var6.message + " | ";
               var4 = var6.throwable;
            } else {
               var5 = "";
            }

            StringWriter var23 = new StringWriter();
            PrintWriter var7 = new PrintWriter(var23);
            var4.printStackTrace(var7);
            var7.close();
            String var8 = var23.toString();
            BufferedReader var9 = new BufferedReader(new StringReader(var8));
            String var10 = var9.readLine();

            while (true) {
               String var11 = var9.readLine();
               if (var11 == null) {
                  var5 = var5 + "| " + var10;
                  var2 = var5;
                  break;
               }

               int var12 = var11.indexOf(40);
               int var13 = var11.indexOf(41, var12 + 1);
               if (var12 >= 0 && var13 >= 0) {
                  String var14 = var11.substring(1 + var12, var13);
                  int var15 = var14.indexOf(".java:");
                  if (var15 >= 0) {
                     var14 = var14.substring(0, var15) + var14.substring(5 + var15);
                     var5 = var5 + var14 + ' ';
                     continue;
                  }

                  var11 = var11.substring(0, var12);
               }

               var11 = var11.trim();
               var11 = var11.substring(var11.lastIndexOf(32) + 1);
               var11 = var11.substring(var11.lastIndexOf(9) + 1);
               var5 = var5 + var11 + ' ';
            }
         }

         if (null != var0) {
            if (var1 != null) {
               var2 = var2 + " | ";
            }

            var2 = var2 + var0;
         }

         System.out.println("Error: " + var2);
         var2 = var2.replace(':', '.');
         var2 = var2.replace('@', '_');
         var2 = var2.replace('&', '_');
         var2 = var2.replace('#', '_');
         if (null == class225.RunException_applet) {
            return;
         }

         URL var3 = new URL(
            class225.RunException_applet,
            "clienterror.ws?cv="
               + RunException_revision * 1528671493
               + "&cs="
               + classRZ.field5750 * -1048563111
               + "&u="
               + field6660
               + "&v1="
               + class373.javaVendor
               + "&v2="
               + TaskHandler.javaVersion
               + "&ct="
               + class142.field1808 * -1683466465
               + "&e="
               + var2
         );
         DataInputStream var21 = new DataInputStream(var3.openStream());
         var21.read();
         var21.close();
      } catch (Exception var16) {
      }
   }

   @Override
   public String getMessage() {
      return this.message;
   }

   @Override
   public Throwable getCause() {
      return this.throwable;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V")
   @ObfuscatedName("ag")
   public static void method12764(String var0, Throwable var1) {
      try {
         String var2 = "";
         if (null != var1) {
            Throwable var4 = var1;
            String var5;
            if (var1 instanceof RunException) {
               RunException var6 = (RunException)var1;
               var5 = var6.message + " | ";
               var4 = var6.throwable;
            } else {
               var5 = "";
            }

            StringWriter var23 = new StringWriter();
            PrintWriter var7 = new PrintWriter(var23);
            var4.printStackTrace(var7);
            var7.close();
            String var8 = var23.toString();
            BufferedReader var9 = new BufferedReader(new StringReader(var8));
            String var10 = var9.readLine();

            while (true) {
               String var11 = var9.readLine();
               if (var11 == null) {
                  var5 = var5 + "| " + var10;
                  var2 = var5;
                  break;
               }

               int var12 = var11.indexOf(40);
               int var13 = var11.indexOf(41, var12 + 1);
               if (var12 >= 0 && var13 >= 0) {
                  String var14 = var11.substring(1 + var12, var13);
                  int var15 = var14.indexOf(".java:");
                  if (var15 >= 0) {
                     var14 = var14.substring(0, var15) + var14.substring(5 + var15);
                     var5 = var5 + var14 + ' ';
                     continue;
                  }

                  var11 = var11.substring(0, var12);
               }

               var11 = var11.trim();
               var11 = var11.substring(var11.lastIndexOf(32) + 1);
               var11 = var11.substring(var11.lastIndexOf(9) + 1);
               var5 = var5 + var11 + ' ';
            }
         }

         if (null != var0) {
            if (var1 != null) {
               var2 = var2 + " | ";
            }

            var2 = var2 + var0;
         }

         System.out.println("Error: " + var2);
         var2 = var2.replace(':', '.');
         var2 = var2.replace('@', '_');
         var2 = var2.replace('&', '_');
         var2 = var2.replace('#', '_');
         if (null == class225.RunException_applet) {
            return;
         }

         URL var3 = new URL(
            class225.RunException_applet,
            "clienterror.ws?cv="
               + RunException_revision * 1528671493
               + "&cs="
               + classRZ.field5750 * -1048563111
               + "&u="
               + field6660
               + "&v1="
               + class373.javaVendor
               + "&v2="
               + TaskHandler.javaVersion
               + "&ct="
               + class142.field1808 * -1683466465
               + "&e="
               + var2
         );
         DataInputStream var21 = new DataInputStream(var3.openStream());
         var21.read();
         var21.close();
      } catch (Exception var16) {
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lyg;")
   @ObfuscatedName("aj")
   public static RunException method12765(Throwable var0, String var1) {
      RunException var2;
      if (var0 instanceof RunException) {
         var2 = (RunException)var0;
         var2.message = var2.message + ' ' + var1;
      } else {
         var2 = new RunException(var0, var1);
      }

      return var2;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lyg;")
   @ObfuscatedName("ae")
   public static RunException method12766(Throwable var0, String var1) {
      RunException var2;
      if (var0 instanceof RunException) {
         var2 = (RunException)var0;
         var2.message = var2.message + ' ' + var1;
      } else {
         var2 = new RunException(var0, var1);
      }

      return var2;
   }

   RunException(Throwable var1, String var2) {
      this.message = var2;
      this.throwable = var1;
   }
}
