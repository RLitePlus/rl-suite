import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ax")
class classAX implements SSLSession {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lax;)J")
   @ObfuscatedName("iw")
   public static long method306(classAX var0) {
      if (var0 == null) {
         var0.method333();
      }

      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bk")
   public int method333() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bx")
   public boolean method353() {
      throw new UnsupportedOperationException();
   }

   @Override
   public String getCipherSuite() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.getCipherSuite(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bv")
   public boolean method354() {
      throw new UnsupportedOperationException();
   }

   @Override
   public byte[] getId() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.getId(" + ')');
      }
   }

   @Override
   public long getLastAccessedTime() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.getLastAccessedTime(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("au")
   public byte[] method311() {
      throw new UnsupportedOperationException();
   }

   @Override
   public Principal getLocalPrincipal() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.getLocalPrincipal(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   public int method301() {
      return 0;
   }

   @Override
   public Certificate[] getLocalCertificates() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.getLocalCertificates(" + ')');
      }
   }

   @Override
   public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
      try {
         return this.this$1.field11;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.getPeerCertificates(" + ')');
      }
   }

   @Override
   public String getPeerHost() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.getPeerHost(" + ')');
      }
   }

   @Override
   public int getPeerPort() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.getPeerPort(" + 41);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lax;)I")
   @ObfuscatedName("eb")
   public static int method324(classAX var0) {
      if (var0 == null) {
         var0.getValueNames();
      }

      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/security/cert/Certificate;")
   @ObfuscatedName("be")
   public Certificate[] method328() throws SSLPeerUnverifiedException {
      return this.this$1.field11;
   }

   @Override
   public String getProtocol() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.getProtocol(" + ')');
      }
   }

   @Override
   public SSLSessionContext getSessionContext() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.getSessionContext(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lax;)Ljavax/net/ssl/SSLSessionContext;")
   @ObfuscatedName("ul")
   public static SSLSessionContext method340(classAX var0) {
      if (var0 == null) {
         var0.method343();
      }

      throw new UnsupportedOperationException();
   }

   @Override
   public Object getValue(String var1) {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ax.getValue(" + ')');
      }
   }

   @Override
   public String[] getValueNames() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.getValueNames(" + ')');
      }
   }

   @Override
   public void invalidate() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.invalidate(" + ')');
      }
   }

   @Override
   public void putValue(String var1, Object var2) {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ax.putValue(" + ')');
      }
   }

   @Override
   public void removeValue(String var1) {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ax.removeValue(" + ')');
      }
   }

   @Override
   public long getCreationTime() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.getCreationTime(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/security/cert/Certificate;")
   @ObfuscatedName("ah")
   public Certificate[] method318() {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lax;)Ljavax/net/ssl/SSLSessionContext;")
   @ObfuscatedName("ig")
   public static SSLSessionContext method341(classAX var0) {
      if (var0 == null) {
         var0.isValid();
      }

      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   public int method302() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ae")
   public String method304() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("aw")
   public long method307() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("ap")
   public long method308() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("az")
   public byte[] method312() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bb")
   public int method334() {
      return 0;
   }

   @Override
   public boolean isValid() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.isValid(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("ac")
   public long method316() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/security/cert/Certificate;")
   @ObfuscatedName("ax")
   public Certificate[] method319() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/security/cert/Certificate;")
   @ObfuscatedName("ar")
   public Certificate[] method320() {
      throw new UnsupportedOperationException();
   }

   @Override
   public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.getPeerPrincipal(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/security/Principal;")
   @ObfuscatedName("am")
   public Principal method321() {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lax;)I")
   @ObfuscatedName("wr")
   public static int method325(classAX var0) {
      if (var0 == null) {
         var0.method327();
      }

      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/security/Principal;")
   @ObfuscatedName("bj")
   public Principal method322() {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lax;)Ljava/lang/String;")
   @ObfuscatedName("kj")
   public static String method330(classAX var0) {
      if (var0 == null) {
         var0.getPeerPort();
      }

      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lax;)[B")
   @ObfuscatedName("bg")
   public static byte[] method313(classAX var0) {
      if (var0 == null) {
         var0.method339();
      }

      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   public int method326() {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lax;Ljava/lang/String;Ljava/lang/Object;)V")
   @ObfuscatedName("un")
   public static void method355(classAX var0, String var1, Object var2) {
      if (var0 == null) {
         var0.method338();
      }

      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ai")
   public byte[] method314() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bz")
   public String method331() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bg")
   public String method332() {
      throw new UnsupportedOperationException();
   }

   classAX(SecureRandomSSLSocket var1) {
      this.this$1 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lax;)J")
   @ObfuscatedName("it")
   public static long method309(classAX var0) {
      if (var0 == null) {
         var0.method310();
      }

      throw new UnsupportedOperationException();
   }

   @Override
   public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.getPeerCertificateChain(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lax;)V")
   @ObfuscatedName("tt")
   public static void method350(classAX var0) {
      if (var0 == null) {
         var0.getProtocol();
      }

      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   public int method303() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/security/Principal;")
   @ObfuscatedName("al")
   public Principal method335() throws SSLPeerUnverifiedException {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("aj")
   public String method305() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bp")
   public String method336() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bt")
   public String method337() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Ljavax/net/ssl/SSLSessionContext;")
   @ObfuscatedName("ba")
   public SSLSessionContext method342() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/Object;")
   @ObfuscatedName("bw")
   public Object method344(String var1) {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/Object;")
   @ObfuscatedName("bf")
   public Object method345(String var1) {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("bn")
   public String[] method346() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("bd")
   public String[] method347() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("br")
   public String[] method348() {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lax;)Ljava/security/Principal;")
   @ObfuscatedName("ch")
   public static Principal method323(classAX var0) {
      if (var0 == null) {
         var0.method339();
      }

      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("bh")
   public String[] method349() {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lfy;)I")
   @ObfuscatedName("xx")
   public static int method300(classFY var0) {
      return var0.field1929 * -157771145;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bl")
   public void method351() {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lax;)J")
   @ObfuscatedName("qu")
   public static long method317(classAX var0) {
      if (var0 == null) {
         var0.isValid();
      }

      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bc")
   public void method352() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bu")
   public String method338() {
      throw new UnsupportedOperationException();
   }

   @Override
   public int getApplicationBufferSize() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.getApplicationBufferSize(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bm")
   public String method339() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Object;)V")
   @ObfuscatedName("ce")
   public void method356(String var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)V")
   @ObfuscatedName("cu")
   public void method357(String var1) {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lax;Ljava/lang/String;)V")
   @ObfuscatedName("nf")
   public static void method358(classAX var0, String var1) {
      if (var0 == null) {
         var0.method321();
      }

      throw new UnsupportedOperationException();
   }

   @Override
   public int getPacketBufferSize() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ax.getPacketBufferSize(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("ak")
   public long method310() {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lax;)[B")
   @ObfuscatedName("gj")
   public static byte[] method315(classAX var0) {
      if (var0 == null) {
         var0.getValueNames();
      }

      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aq")
   public int method327() {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lax;)[Ljava/security/cert/Certificate;")
   @ObfuscatedName("xy")
   public static Certificate[] method329(classAX var0) throws SSLPeerUnverifiedException {
      if (var0 == null) {
         var0.method349();
      }

      return var0.this$1.field11;
   }

   @ObfuscatedSignature(descriptor = "()Ljavax/net/ssl/SSLSessionContext;")
   @ObfuscatedName("by")
   public SSLSessionContext method343() {
      throw new UnsupportedOperationException();
   }
}
