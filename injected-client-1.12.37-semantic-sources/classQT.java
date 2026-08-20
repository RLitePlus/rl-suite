import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("qt")
class classQT implements TlsAuthentication {
   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqn;Lfm;)V")
   @ObfuscatedName("ln")
   public static void method9813(classQN var0, classFM var1) {
      if (var0 == null) {
         var0.method9678();
      }

      IterableNodeDeque.method8156(var0.field5569, var1);
   }

   classQT(classQU var1) {
      this.this$2 = var1;
   }

   public void notifyServerCertificate(Certificate var1) throws IOException {
      try {
         try {
            CertificateFactory var2 = CertificateFactory.getInstance("X.509");
            LinkedList var3 = new LinkedList();
            org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

            for (int var5 = 0; var5 < var4.length; var5++) {
               org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
               var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
            }

            this.this$2.this$1.field5515 = var3.toArray(new java.security.cert.Certificate[0]);
         } catch (CertificateException var7) {
            throw new IOException(var7);
         }
      } catch (RuntimeException var8) {
         throw classEG.method3884(var8, "qt.notifyServerCertificate(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/bouncycastle/crypto/tls/CertificateRequest;)Lorg/bouncycastle/crypto/tls/TlsCredentials;")
   @ObfuscatedName("ae")
   public TlsCredentials method9816(CertificateRequest var1) throws IOException {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Lorg/bouncycastle/crypto/tls/Certificate;)V")
   @ObfuscatedName("az")
   public void method9815(Certificate var1) throws IOException {
      try {
         CertificateFactory var2 = CertificateFactory.getInstance("X.509");
         LinkedList var3 = new LinkedList();
         org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

         for (int var5 = 0; var5 < var4.length; var5++) {
            org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
            var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
         }

         this.this$2.this$1.field5515 = var3.toArray(new java.security.cert.Certificate[0]);
      } catch (CertificateException var7) {
         throw new IOException(var7);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lup;II)V")
   @ObfuscatedName("re")
   public static void method9814(classUP var0, int var1, int var2) {
      if (var0 == null) {
         var0.method11429(var1, var1);
      } else {
         var1 &= classCS.method2576(-1520924805);
         var2 &= classCS.method2576(-1520924805);
         var0.field6362 = Math.max(var1, Math.min(var2, 1379695375 * var0.field6362)) * -1993796625;
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/bouncycastle/crypto/tls/CertificateRequest;)Lorg/bouncycastle/crypto/tls/TlsCredentials;")
   @ObfuscatedName("af")
   public TlsCredentials method9817(CertificateRequest var1) throws IOException {
      return null;
   }

   public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
      try {
         return null;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "qt.getClientCredentials(" + ')');
      }
   }
}
