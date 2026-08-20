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

@ObfuscatedName("qc")
class classQC extends SSLSocket {
   @ObfuscatedName("az")
   Certificate[] field5515;

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("bt")
   public String[] method9461() {
      return null;
   }

   @Override
   public InputStream getInputStream() throws IOException {
      try {
         return this.val$tlsClientProtocol.getInputStream();
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "qc.getInputStream(" + ')');
      }
   }

   @Override
   public OutputStream getOutputStream() throws IOException {
      try {
         return this.val$tlsClientProtocol.getOutputStream();
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "qc.getOutputStream(" + ')');
      }
   }

   @Override
   public synchronized void close() throws IOException {
      try {
         this.val$tlsClientProtocol.close();
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "qc.close(" + ')');
      }
   }

   @Override
   public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qc.addHandshakeCompletedListener(" + ')');
      }
   }

   @Override
   public boolean getEnableSessionCreation() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "qc.getEnableSessionCreation(" + ')');
      }
   }

   @Override
   public void setEnableSessionCreation(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qc.setEnableSessionCreation(" + ')');
      }
   }

   @Override
   public String[] getEnabledCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "qc.getEnabledCipherSuites(" + ')');
      }
   }

   @Override
   public void setEnabledCipherSuites(String[] var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qc.setEnabledCipherSuites(" + ')');
      }
   }

   @Override
   public String[] getEnabledProtocols() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "qc.getEnabledProtocols(" + ')');
      }
   }

   @Override
   public void setEnabledProtocols(String[] var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qc.setEnabledProtocols(" + ')');
      }
   }

   @Override
   public boolean getNeedClientAuth() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "qc.getNeedClientAuth(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("ar")
   public void method9447(String[] var1) {
   }

   classQC(classQL var1, TlsClientProtocol var2, String var3) {
      this.this$0 = var1;
      this.val$tlsClientProtocol = var2;
      this.val$host = var3;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cb")
   public void method9477() throws IOException {
      this.val$tlsClientProtocol.connect(new classQU(this));
   }

   @Override
   public String[] getSupportedCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "qc.getSupportedCipherSuites(" + ')');
      }
   }

   @Override
   public boolean getUseClientMode() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "qc.getUseClientMode(" + ')');
      }
   }

   @Override
   public void setUseClientMode(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qc.setUseClientMode(" + ')');
      }
   }

   @Override
   public boolean getWantClientAuth() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "qc.getWantClientAuth(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("by")
   public boolean method9470() {
      return false;
   }

   @Override
   public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qc.removeHandshakeCompletedListener(" + ')');
      }
   }

   @Override
   public void startHandshake() throws IOException {
      try {
         this.val$tlsClientProtocol.connect(new classQU(this));
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "qc.startHandshake(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ah")
   public void method9454(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "()Ljava/io/InputStream;")
   @ObfuscatedName("af")
   public InputStream method9435() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/io/OutputStream;")
   @ObfuscatedName("as")
   public OutputStream method9437() throws IOException {
      return this.val$tlsClientProtocol.getOutputStream();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/io/OutputStream;")
   @ObfuscatedName("ab")
   public OutputStream method9438() throws IOException {
      return this.val$tlsClientProtocol.getOutputStream();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqc;)V")
   @ObfuscatedName("cv")
   public static void method9478(classQC var0) throws IOException {
      var0.val$tlsClientProtocol.connect(new classQU(var0));
   }

   @Override
   public void setWantClientAuth(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qc.setWantClientAuth(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V")
   @ObfuscatedName("aa")
   public void method9440(HandshakeCompletedListener var1) {
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ao")
   public boolean method9441() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bi")
   public void method9466(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("aj")
   public void method9443(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("ay")
   public void method9444(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "()Ljava/io/InputStream;")
   @ObfuscatedName("az")
   public InputStream method9436() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("ad")
   public String[] method9445() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("at")
   public void method9450(String[] var1) {
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("ak")
   public void method9451(String[] var1) {
   }

   @Override
   public SSLSession getSession() {
      try {
         return new classQZ(this);
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "qc.getSession(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("aw")
   public String[] method9449() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("av")
   public void method9452(String[] var1) {
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;)V")
   @ObfuscatedName("au")
   public void method9448(String[] var1) {
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bn")
   public void method9455(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cu")
   public void method9479() throws IOException {
      this.val$tlsClientProtocol.connect(new classQU(this));
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bw")
   public void method9467(boolean var1) {
   }

   @Override
   public void setNeedClientAuth(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qc.setNeedClientAuth(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("al")
   public boolean method9442() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()Ljavax/net/ssl/SSLSession;")
   @ObfuscatedName("bx")
   public SSLSession method9456() {
      return new classQZ(this);
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("bp")
   public String[] method9458() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("br")
   public String[] method9459() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("bm")
   public String[] method9460() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bj")
   public boolean method9462() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bk")
   public boolean method9463() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bb")
   public void method9468(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bu")
   public boolean method9464() {
      return false;
   }

   @Override
   public String[] getSupportedProtocols() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "qc.getSupportedProtocols(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("am")
   public boolean method9453() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ax")
   public synchronized void method9439() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   @ObfuscatedSignature(descriptor = "()Ljavax/net/ssl/SSLSession;")
   @ObfuscatedName("bc")
   public SSLSession method9457() {
      return new classQZ(this);
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("be")
   public void method9469(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bq")
   public boolean method9471() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "(Z)V")
   @ObfuscatedName("bs")
   public void method9472(boolean var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V")
   @ObfuscatedName("bl")
   public void method9473(HandshakeCompletedListener var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V")
   @ObfuscatedName("bv")
   public void method9474(HandshakeCompletedListener var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V")
   @ObfuscatedName("bh")
   public void method9475(HandshakeCompletedListener var1) {
   }

   @ObfuscatedSignature(descriptor = "(Ljavax/net/ssl/HandshakeCompletedListener;)V")
   @ObfuscatedName("bz")
   public void method9476(HandshakeCompletedListener var1) {
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bo")
   public boolean method9465() {
      return false;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("cr")
   public void method9480() throws IOException {
      this.val$tlsClientProtocol.connect(new classQU(this));
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("ap")
   public String[] method9446() {
      return null;
   }
}
