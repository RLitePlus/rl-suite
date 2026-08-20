import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("ad")
class SecureRandomSSLSocket extends SSLSocket {
   @ObfuscatedName("av")
   Certificate[] field11;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ao")
   public boolean method46() {
      return false;
   }

   @Override
   public InputStream getInputStream() throws IOException {
      try {
         return this.val$tlsClientProtocol.getInputStream();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ad.getInputStream(" + ')');
      }
   }

   @Override
   public OutputStream getOutputStream() throws IOException {
      try {
         return this.val$tlsClientProtocol.getOutputStream();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ad.getOutputStream(" + ')');
      }
   }

   @Override
   public synchronized void close() throws IOException {
      try {
         this.val$tlsClientProtocol.close();
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ad.close(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ba")
   public boolean method63() {
      return false;
   }

   @Override
   public boolean getEnableSessionCreation() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ad.getEnableSessionCreation(" + ')');
      }
   }

   @Override
   public void setEnableSessionCreation(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ad.setEnableSessionCreation(" + ')');
      }
   }

   @Override
   public String[] getEnabledCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ad.getEnabledCipherSuites(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljavax/net/ssl/SSLSession;")
   @ObfuscatedName("bk")
   public SSLSession method55() {
      return new classAX(this);
   }

   @Override
   public String[] getEnabledProtocols() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ad.getEnabledProtocols(" + ')');
      }
   }

   @Override
   public void setEnabledProtocols(String[] var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ad.setEnabledProtocols(" + ')');
      }
   }

   @Override
   public boolean getNeedClientAuth() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ad.getNeedClientAuth(" + ')');
      }
   }

   @Override
   public void setNeedClientAuth(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ad.setNeedClientAuth(" + ')');
      }
   }

   @Override
   public SSLSession getSession() {
      try {
         return new classAX(this);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ad.getSession(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public synchronized void method33() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("bj")
   public String[] method58() {
      return null;
   }

   @Override
   public boolean getUseClientMode() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ad.getUseClientMode(" + ')');
      }
   }

   @Override
   public void setUseClientMode(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ad.setUseClientMode(" + ')');
      }
   }

   @Override
   public boolean getWantClientAuth() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ad.getWantClientAuth(" + ')');
      }
   }

   @Override
   public void setWantClientAuth(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ad.setWantClientAuth(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lad;)[Ljava/lang/String;")
   @ObfuscatedName("gq")
   public static String[] method43(SecureRandomSSLSocket var0) {
      if (var0 == null) {
         var0.method32();
      }

      return null;
   }

   @Override
   public void startHandshake() throws IOException {
      try {
         this.val$tlsClientProtocol.connect(new classAI(this));
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ad.startHandshake(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/io/InputStream;")
   @ObfuscatedName("at")
   public InputStream method30() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/io/InputStream;")
   @ObfuscatedName("av")
   public InputStream method31() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/io/OutputStream;")
   @ObfuscatedName("ag")
   public OutputStream method32() throws IOException {
      return this.val$tlsClientProtocol.getOutputStream();
   }

   @Override
   public String[] getSupportedCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ad.getSupportedCipherSuites(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("by")
   public boolean method64() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   public synchronized void method34() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   @ObfuscatedSignature(descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V")
   @ObfuscatedName("bl")
   public void method36(HandshakeCompletedListener var1) {
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ay")
   public boolean method37() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   public boolean method38() {
      return false;
   }

   @Override
   public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ad.removeHandshakeCompletedListener(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ad")
   public void method40(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("al")
   public boolean method47() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("be")
   public void method50(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("ac")
   public void method42(String[] var1) {
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("ab")
   public String[] method44() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bh")
   public void method68(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   public synchronized void method35() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("bb")
   public String[] method59() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("az")
   public boolean method39() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("am")
   public boolean method48() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("ah")
   public void method45(String[] var1) {
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("aa")
   public void method51(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("aq")
   public void method52(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bo")
   public void method53(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bg")
   public void method54(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "()Ljavax/net/ssl/SSLSession;")
   @ObfuscatedName("bs")
   public SSLSession method56() {
      return new classAX(this);
   }

   @ObfuscatedSignature(descriptor = "()Ljavax/net/ssl/SSLSession;")
   @ObfuscatedName("bz")
   public SSLSession method57() {
      return new classAX(this);
   }

   @Override
   public String[] getSupportedProtocols() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ad.getSupportedProtocols(" + ')');
      }
   }

   @Override
   public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ad.addHandshakeCompletedListener(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("bt")
   public String[] method60() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("af")
   public boolean method49() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("bp")
   public String[] method61() {
      return null;
   }

   @Override
   public void setEnabledCipherSuites(String[] var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "ad.setEnabledCipherSuites(" + ')');
      }
   }

   SecureRandomSSLSocket(SecureRandomSSLSocketFactory var1, TlsClientProtocol var2, String var3) {
      this.this$0 = var1;
      this.val$tlsClientProtocol = var2;
      this.val$host = var3;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bi")
   public boolean method65() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("as")
   public String[] method41() {
      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lad;)V")
   @ObfuscatedName("xg")
   public static void method72(SecureRandomSSLSocket var0) throws IOException {
      var0.val$tlsClientProtocol.connect(new classAI(var0));
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bw")
   public void method66(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bn")
   public boolean method67() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bd")
   public void method69(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("br")
   public void method70(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("bu")
   public String[] method62() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V")
   @ObfuscatedName("ap")
   public void method71(HandshakeCompletedListener var1) {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bq")
   public void method73() throws IOException {
      this.val$tlsClientProtocol.connect(new classAI(this));
   }
}
