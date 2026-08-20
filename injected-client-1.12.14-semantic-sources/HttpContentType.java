import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ur")
public class HttpContentType {
   @ObfuscatedSignature(descriptor = "Lur;")
   @ObfuscatedName("at")
   static final HttpContentType TEXT_PLAIN = new HttpContentType("text/plain");
   @ObfuscatedSignature(descriptor = "Lur;")
   @ObfuscatedName("ag")
   static final HttpContentType APPLICATION_X_WWW_FORM_URLENCODED = new HttpContentType("application/x-www-form-urlencoded");
   @ObfuscatedSignature(descriptor = "Lur;")
   @ObfuscatedName("av")
   public static final HttpContentType APPLICATION_JSON = new HttpContentType("application/json");
   @ObfuscatedName("an")
   String contentType;

   @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;")
   @ObfuscatedName("av")
   public String getValue(int var1) {
      try {
         return this.contentType;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ur.av(" + ')');
      }
   }

   HttpContentType(String var1) {
      this.contentType = var1;
   }
}
