import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sg")
public class class489 {
   @ToRemove(unused = "true")
   @ObfuscatedName("cy")
   static final int field5786 = 88;
   @ObfuscatedName("av")
   int field5785;
   @ObfuscatedName("ag")
   int field5782;
   @ObfuscatedName("an")
   int field5783;
   @ObfuscatedName("aw")
   protected static boolean hasFocus;
   @ObfuscatedName("at")
   int field5784;
   @ObfuscatedName("ae")
   public static int canvasWidth;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loo;)Z")
   @ObfuscatedName("ne")
   public static boolean method10269(classOO var0) {
      return var0.field4666;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsg;)Ljava/lang/String;")
   @ObfuscatedName("cx")
   public static String method10266(class489 var0) {
      if (var0 == null) {
         var0.toString();
      }

      byte var1 = 10;
      int var2 = 10 - Integer.toString(366003319 * var0.field5785).length();
      int var3 = 10 - Integer.toString(-682217117 * var0.field5782).length();
      int var4 = 10 - Integer.toString(74375141 * var0.field5784).length();
      String var5 = "          ".substring(10 - var2);
      String var6 = "          ".substring(10 - var3);
      String var7 = "          ".substring(10 - var4);
      return "    Size: "
         + var0.field5785 * 366003319
         + var5
         + "Created: "
         + var0.field5784 * 74375141
         + var7
         + "Total used: "
         + var0.field5782 * -682217117
         + var6
         + "Max-In-Use: "
         + -341250883 * var0.field5783;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apc")
   public String method10267() {
      byte var1 = 10;
      int var2 = 10 - Integer.toString(366003319 * this.field5785).length();
      int var3 = 10 - Integer.toString(-682217117 * this.field5782).length();
      int var4 = 10 - Integer.toString(74375141 * this.field5784).length();
      String var5 = "          ".substring(10 - var2);
      String var6 = "          ".substring(10 - var3);
      String var7 = "          ".substring(10 - var4);
      return "    Size: "
         + this.field5785 * 366003319
         + var5
         + "Created: "
         + this.field5784 * 330182562
         + var7
         + "Total used: "
         + this.field5782 * 1612333381
         + var6
         + "Max-In-Use: "
         + -863863315 * this.field5783;
   }

   @Override
   public String toString() {
      try {
         byte var1 = 10;
         int var2 = 10 - Integer.toString(366003319 * this.field5785).length();
         int var3 = 10 - Integer.toString(-682217117 * this.field5782).length();
         int var4 = 10 - Integer.toString(74375141 * this.field5784).length();
         String var5 = "          ".substring(10 - var2);
         String var6 = "          ".substring(10 - var3);
         String var7 = "          ".substring(10 - var4);
         return "    Size: "
            + this.field5785 * 366003319
            + var5
            + "Created: "
            + this.field5784 * 74375141
            + var7
            + "Total used: "
            + this.field5782 * -682217117
            + var6
            + "Max-In-Use: "
            + -341250883 * this.field5783;
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "sg.toString(" + ')');
      }
   }

   class489() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("apd")
   public String method10268() {
      byte var1 = 10;
      int var2 = 10 - Integer.toString(366003319 * this.field5785).length();
      int var3 = 10 - Integer.toString(-682217117 * this.field5782).length();
      int var4 = 10 - Integer.toString(74375141 * this.field5784).length();
      String var5 = "          ".substring(10 - var2);
      String var6 = "          ".substring(10 - var3);
      String var7 = "          ".substring(10 - var4);
      return "    Size: "
         + this.field5785 * 366003319
         + var5
         + "Created: "
         + this.field5784 * 74375141
         + var7
         + "Total used: "
         + this.field5782 * -682217117
         + var6
         + "Max-In-Use: "
         + -341250883 * this.field5783;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/Socket;IIB)Ltd;")
   @ObfuscatedName("av")
   public static AbstractSocket method10265(Socket var0, int var1, int var2, byte var3) throws IOException {
      try {
         return new BufferedNetSocket(var0, var1, var2);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "sg.av(" + ')');
      }
   }
}
