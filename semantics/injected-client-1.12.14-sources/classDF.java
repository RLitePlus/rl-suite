import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("df")
public class classDF {
   @ObfuscatedName("aw")
   static String field1352 = "</col>";
   @ObfuscatedName("aj")
   static String field1350 = "->";
   @ObfuscatedName("ag")
   static String field1347 = "|";
   @ObfuscatedName("an")
   static String field1351 = " (";
   @ObfuscatedName("ae")
   static String field1349 = ")";
   @ObfuscatedName("av")
   static String field1345 = "true";
   @ObfuscatedName("ak")
   static String field1348 = "<br>";
   @ObfuscatedName("at")
   static String field1346 = ",";

   classDF() throws Throwable {
      throw new Error();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Loe;)I")
   @ObfuscatedName("bx")
   public static int method3109(WidgetConfigNode var0) {
      return var0.clickMask * -669483855;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ag")
   static String method3108(int var0) {
      return "<img=" + var0 + ">";
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("an")
   static String method3110(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("ae")
   static String method3111(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }
}
