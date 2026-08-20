import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import netscape.javascript.JSObject;

@ObfuscatedName("be")
public class classBE {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V")
   @ObfuscatedName("at")
   public static void method480(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V")
   @ObfuscatedName("av")
   public static void method481(Applet var0, String var1, int var2) throws Throwable {
      try {
         JSObject.getWindow(var0).eval(var1);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "be.av(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V")
   @ObfuscatedName("ag")
   public static void method482(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   classBE() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljava/applet/Applet;Ljava/lang/String;)V")
   @ObfuscatedName("an")
   public static void method483(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }
}
