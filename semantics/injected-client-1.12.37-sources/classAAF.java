import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aaf")
public class classAAF extends RuntimeException {
   @ObfuscatedName("ax")
   Throwable field44;
   @ObfuscatedName("af")
   public static String field48;
   @ObfuscatedName("as")
   String field45;
   @ObfuscatedName("ab")
   public static int field46;
   @ObfuscatedName("az")
   public static URL field49;
   @ToRemove(unused = "true")
   @ObfuscatedName("ai")
   public static final int field47 = 34;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Laaf;")
   @ObfuscatedName("ax")
   public static classAAF method191(Throwable var0, String var1) {
      classAAF var2;
      if (var0 instanceof classAAF) {
         var2 = (classAAF)var0;
         var2.field45 = var2.field45 + ' ' + var1;
      } else {
         var2 = new classAAF(var0, var1);
      }

      return var2;
   }

   @Override
   public String getMessage() {
      return this.field45;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V")
   @ObfuscatedName("ae")
   public static void processError(String var0, Throwable var1) {
      try {
         String var2 = "";
         if (null != var1) {
            Throwable var4 = var1;
            String var5;
            if (var1 instanceof classAAF) {
               classAAF var6 = (classAAF)var1;
               var5 = var6.field45 + " | ";
               var4 = var6.field44;
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
               int var13 = var11.indexOf(1997970856, 1 + var12);
               if (var12 >= 0 && var13 >= 0) {
                  String var14 = var11.substring(1 + var12, var13);
                  int var15 = var14.indexOf(".java:");
                  if (var15 >= 0) {
                     var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
                     var5 = var5 + var14 + -127773996;
                     continue;
                  }

                  var11 = var11.substring(0, var12);
               }

               var11 = var11.trim();
               var11 = var11.substring(var11.lastIndexOf(900561482) + 1);
               var11 = var11.substring(var11.lastIndexOf(9) + 1);
               var5 = var5 + var11 + ' ';
            }
         }

         if (var0 != null) {
            if (null != var1) {
               var2 = var2 + " | ";
            }

            var2 = var2 + var0;
         }

         System.out.println("Error: " + var2);
         var2 = var2.replace(':', '.');
         var2 = var2.replace((char)1468304866, '_');
         var2 = var2.replace((char)-1628069351, (char)1459199573);
         var2 = var2.replace('#', '_');
         if (null == field49) {
            return;
         }

         URL var3 = new URL(
            field49,
            "clienterror.ws?cv="
               + 1850729989 * classAAL.field57
               + "&cs="
               + -1622029425 * field46
               + "&u="
               + field48
               + "&v1="
               + classDQ.field1604
               + "&v2="
               + classMB.field4479
               + "&ct="
               + classAV.field290 * -611049396
               + "&e="
               + var2
         );
         DataInputStream var21 = new DataInputStream(var3.openStream());
         var21.read();
         var21.close();
      } catch (Exception var16) {
      }
   }

   classAAF(Throwable var1, String var2) {
      this.field45 = var2;
      this.field44 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V")
   @ObfuscatedName("ab")
   public static void method188(String var0, Throwable var1) {
      try {
         String var2 = "";
         if (null != var1) {
            Throwable var4 = var1;
            String var5;
            if (var1 instanceof classAAF) {
               classAAF var6 = (classAAF)var1;
               var5 = var6.field45 + " | ";
               var4 = var6.field44;
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
               int var13 = var11.indexOf(-1623230432, 1 + var12);
               if (var12 >= 0 && var13 >= 0) {
                  String var14 = var11.substring(1 + var12, var13);
                  int var15 = var14.indexOf(".java:");
                  if (var15 >= 0) {
                     var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
                     var5 = var5 + var14 + ' ';
                     continue;
                  }

                  var11 = var11.substring(0, var12);
               }

               var11 = var11.trim();
               var11 = var11.substring(var11.lastIndexOf(1484522179) + 1);
               var11 = var11.substring(var11.lastIndexOf(9) + 1);
               var5 = var5 + var11 + ' ';
            }
         }

         if (var0 != null) {
            if (null != var1) {
               var2 = var2 + " | ";
            }

            var2 = var2 + var0;
         }

         System.out.println("Error: " + var2);
         var2 = var2.replace((char)-51008512, '.');
         var2 = var2.replace('@', (char)-923390421);
         var2 = var2.replace((char)154713185, '_');
         var2 = var2.replace((char)-2007398891, (char)257464208);
         if (null == field49) {
            return;
         }

         URL var3 = new URL(
            field49,
            "clienterror.ws?cv="
               + 2098754687 * classAAL.field57
               + "&cs="
               + -1622029425 * field46
               + "&u="
               + field48
               + "&v1="
               + classDQ.field1604
               + "&v2="
               + classMB.field4479
               + "&ct="
               + classAV.field290 * -549621011
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
   public Throwable getCause() {
      return this.field44;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V")
   @ObfuscatedName("as")
   public static void method189(String var0, Throwable var1) {
      try {
         String var2 = "";
         if (null != var1) {
            Throwable var4 = var1;
            String var5;
            if (var1 instanceof classAAF) {
               classAAF var6 = (classAAF)var1;
               var5 = var6.field45 + " | ";
               var4 = var6.field44;
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
               int var13 = var11.indexOf(41, 1 + var12);
               if (var12 >= 0 && var13 >= 0) {
                  String var14 = var11.substring(1 + var12, var13);
                  int var15 = var14.indexOf(".java:");
                  if (var15 >= 0) {
                     var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
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

         if (var0 != null) {
            if (null != var1) {
               var2 = var2 + " | ";
            }

            var2 = var2 + var0;
         }

         System.out.println("Error: " + var2);
         var2 = var2.replace(':', '.');
         var2 = var2.replace('@', '_');
         var2 = var2.replace('&', '_');
         var2 = var2.replace('#', '_');
         if (null == field49) {
            return;
         }

         URL var3 = new URL(
            field49,
            "clienterror.ws?cv="
               + 2098754687 * classAAL.field57
               + "&cs="
               + -1622029425 * field46
               + "&u="
               + field48
               + "&v1="
               + classDQ.field1604
               + "&v2="
               + classMB.field4479
               + "&ct="
               + classAV.field290 * -549621011
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
   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;)V")
   @ObfuscatedName("ag")
   public static void method190(String var0, Throwable var1) {
      try {
         String var2 = "";
         if (null != var1) {
            Throwable var4 = var1;
            String var5;
            if (var1 instanceof classAAF) {
               classAAF var6 = (classAAF)var1;
               var5 = var6.field45 + " | ";
               var4 = var6.field44;
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
               int var13 = var11.indexOf(41, 1 + var12);
               if (var12 >= 0 && var13 >= 0) {
                  String var14 = var11.substring(1 + var12, var13);
                  int var15 = var14.indexOf(".java:");
                  if (var15 >= 0) {
                     var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
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

         if (var0 != null) {
            if (null != var1) {
               var2 = var2 + " | ";
            }

            var2 = var2 + var0;
         }

         System.out.println("Error: " + var2);
         var2 = var2.replace(':', '.');
         var2 = var2.replace('@', '_');
         var2 = var2.replace('&', '_');
         var2 = var2.replace('#', '_');
         if (null == field49) {
            return;
         }

         URL var3 = new URL(
            field49,
            "clienterror.ws?cv="
               + 2098754687 * classAAL.field57
               + "&cs="
               + -1622029425 * field46
               + "&u="
               + field48
               + "&v1="
               + classDQ.field1604
               + "&v2="
               + classMB.field4479
               + "&ct="
               + classAV.field290 * -549621011
               + "&e="
               + var2
         );
         DataInputStream var21 = new DataInputStream(var3.openStream());
         var21.read();
         var21.close();
      } catch (Exception var16) {
      }
   }
}
