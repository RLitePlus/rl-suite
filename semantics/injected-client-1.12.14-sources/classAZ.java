import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("az")
class classAZ implements TlsAuthentication {
   public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
      try {
         return null;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "az.getClientCredentials(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lsf;)I")
   @ObfuscatedName("hc")
   public static int method377(classSF var0) {
      return var0.field5765 * 2134183747;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ljl;J)V")
   @ObfuscatedName("ov")
   public static void method373(FloatProjection var0, long var1) {
      if (var0 == null) {
         var0.method6010(var1);
      }

      var0.field3079 = var1 * 1113747779295338803L;
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

            this.this$2.this$1.field11 = var3.toArray(new java.security.cert.Certificate[0]);
         } catch (CertificateException var7) {
            throw new IOException(var7);
         }
      } catch (RuntimeException var8) {
         throw RestClientThreadFactory.newRunException(var8, "az.notifyServerCertificate(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/bouncycastle/crypto/tls/CertificateRequest;)Lorg/bouncycastle/crypto/tls/TlsCredentials;")
   @ObfuscatedName("ag")
   public TlsCredentials method378(CertificateRequest var1) throws IOException {
      return null;
   }

   @ObfuscatedSignature(descriptor = "(Lorg/bouncycastle/crypto/tls/Certificate;)V")
   @ObfuscatedName("av")
   public void method376(Certificate var1) throws IOException {
      try {
         CertificateFactory var2 = CertificateFactory.getInstance("X.509");
         LinkedList var3 = new LinkedList();
         org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

         for (int var5 = 0; var5 < var4.length; var5++) {
            org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
            var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
         }

         this.this$2.this$1.field11 = var3.toArray(new java.security.cert.Certificate[0]);
      } catch (CertificateException var7) {
         throw new IOException(var7);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lorg/bouncycastle/crypto/tls/CertificateRequest;)Lorg/bouncycastle/crypto/tls/TlsCredentials;")
   @ObfuscatedName("at")
   public TlsCredentials method379(CertificateRequest var1) throws IOException {
      return null;
   }

   classAZ(classAI var1) {
      this.this$2 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldv;)Lha;")
   @ObfuscatedName("gq")
   public static NpcOverrides method375(NPC var0) {
      return var0.chatheadOverrides;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lal;)Ljava/util/Map;")
   @ObfuscatedName("ag")
   public static Map method374(HttpResponse var0) {
      return var0.field33;
   }

   @ObfuscatedSignature(descriptor = "(Lorg/bouncycastle/crypto/tls/CertificateRequest;)Lorg/bouncycastle/crypto/tls/TlsCredentials;")
   @ObfuscatedName("an")
   public TlsCredentials method380(CertificateRequest var1) throws IOException {
      return null;
   }
}
