import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("ac")
public class SecureRandomSSLSocketFactory extends SSLSocketFactory {
   @ObfuscatedSignature(descriptor = "Lac;")
   @ObfuscatedName("av")
   static SecureRandomSSLSocketFactory INSTANCE;
   @ObfuscatedName("at")
   SecureRandom field9 = new SecureRandom();

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;")
   @ObfuscatedName("ai")
   public Socket method18(String var1, int var2) throws IOException, UnknownHostException {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;B)Ljavax/net/ssl/SSLSocket;")
   @ObfuscatedName("at")
   SSLSocket createSocket(String var1, TlsClientProtocol var2, byte var3) {
      try {
         return new SecureRandomSSLSocket(this, var2, var1);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "ac.at(" + ')');
      }
   }

   @Override
   public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
      try {
         if (null == var1) {
            var1 = new Socket();
         }

         if (!var1.isConnected()) {
            var1.connect(new InetSocketAddress(var2, var3));
         }

         TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field9);
         return this.createSocket(var2, var5, (byte)89);
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "ac.createSocket(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lac;")
   @ObfuscatedName("an")
   public static SecureRandomSSLSocketFactory method6() {
      if (INSTANCE == null) {
         INSTANCE = new SecureRandomSSLSocketFactory();
      }

      return INSTANCE;
   }

   SecureRandomSSLSocketFactory() {
   }

   @Override
   public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
      try {
         return null;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ac.createSocket(" + ')');
      }
   }

   @Override
   public Socket createSocket(InetAddress var1, int var2) throws IOException {
      try {
         return null;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "ac.createSocket(" + ')');
      }
   }

   @Override
   public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
      try {
         return null;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ac.createSocket(" + ')');
      }
   }

   @Override
   public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
      try {
         return null;
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "ac.createSocket(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/InetAddress;I)Ljava/net/Socket;")
   @ObfuscatedName("ab")
   public Socket method21(InetAddress var1, int var2) throws IOException {
      return null;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()Lac;")
   @ObfuscatedName("ag")
   public static SecureRandomSSLSocketFactory method7() {
      if (INSTANCE == null) {
         INSTANCE = new SecureRandomSSLSocketFactory();
      }

      return INSTANCE;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;")
   @ObfuscatedName("ae")
   public Socket method9(Socket var1, String var2, int var3, boolean var4) throws IOException {
      if (null == var1) {
         var1 = new Socket();
      }

      if (!var1.isConnected()) {
         var1.connect(new InetSocketAddress(var2, var3));
      }

      TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field9);
      return this.createSocket(var2, var5, (byte)95);
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("ad")
   public String[] method14() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;")
   @ObfuscatedName("ak")
   public Socket method10(Socket var1, String var2, int var3, boolean var4) throws IOException {
      if (null == var1) {
         var1 = new Socket();
      }

      if (!var1.isConnected()) {
         var1.connect(new InetSocketAddress(var2, var3));
      }

      TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field9);
      return this.createSocket(var2, var5, (byte)71);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;")
   @ObfuscatedName("aj")
   public Socket method11(Socket var1, String var2, int var3, boolean var4) throws IOException {
      if (null == var1) {
         var1 = new Socket();
      }

      if (!var1.isConnected()) {
         var1.connect(new InetSocketAddress(var2, var3));
      }

      TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field9);
      return this.createSocket(var2, var5, (byte)76);
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("ap")
   public String[] method12() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("au")
   public String[] method13() {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("aw")
   public String[] method15() {
      return null;
   }

   @Override
   public String[] getSupportedCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ac.getSupportedCipherSuites(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Lac;")
   @ObfuscatedName("av")
   public static SecureRandomSSLSocketFactory method8(int var0) {
      try {
         if (INSTANCE == null) {
            if (var0 <= -330541934) {
               throw new IllegalStateException();
            }

            INSTANCE = new SecureRandomSSLSocketFactory();
         }

         return INSTANCE;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ac.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("az")
   public String[] method16() {
      return null;
   }

   @Override
   public String[] getDefaultCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ac.getDefaultCipherSuites(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;)Ljavax/net/ssl/SSLSocket;")
   @ObfuscatedName("am")
   SSLSocket method28(String var1, TlsClientProtocol var2) {
      return new SecureRandomSSLSocket(this, var2, var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;")
   @ObfuscatedName("ac")
   public Socket method19(String var1, int var2) throws IOException, UnknownHostException {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;)Ljavax/net/ssl/SSLSocket;")
   @ObfuscatedName("ao")
   SSLSocket method29(String var1, TlsClientProtocol var2) {
      return new SecureRandomSSLSocket(this, var2, var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/InetAddress;I)Ljava/net/Socket;")
   @ObfuscatedName("ax")
   public Socket method22(InetAddress var1, int var2) throws IOException {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;")
   @ObfuscatedName("ar")
   public Socket method23(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;")
   @ObfuscatedName("ah")
   public Socket method24(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;")
   @ObfuscatedName("al")
   public Socket method25(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;")
   @ObfuscatedName("af")
   public Socket method26(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/net/Socket;")
   @ObfuscatedName("as")
   public Socket method20(String var1, int var2) throws IOException, UnknownHostException {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("ay")
   public String[] method17() {
      return null;
   }
}
