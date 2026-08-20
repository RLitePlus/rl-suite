import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wk")
public interface classWK {
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;I)V")
   @ObfuscatedName("av")
   void vmethod447(Object var1, Buffer var2, int var3);

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("ae")
   void vmethod446(Object var1, Buffer var2);

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("ag")
   void vmethod444(Object var1, Buffer var2);

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("an")
   void vmethod445(Object var1, Buffer var2);

   @ObfuscatedSignature(descriptor = "(Lxa;)Ljava/lang/Object;")
   @ObfuscatedName("aj")
   Object vmethod442(Buffer var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ltx;Ljavax/net/ssl/HttpsURLConnection;)V")
   @ObfuscatedName("lb")
   static void method11744(HttpHeaders var0, HttpsURLConnection var1) {
      for (Entry var3 : var0.acceptHeaderValues.entrySet()) {
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)Ljava/lang/Object;")
   @ObfuscatedName("at")
   Object vmethod443(Buffer var1, byte var2);
}
