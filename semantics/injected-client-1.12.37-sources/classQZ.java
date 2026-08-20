import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("qz")
class classQZ implements SSLSession {
   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   public int method9903() {
      throw new UnsupportedOperationException();
   }

   @Override
   public int getApplicationBufferSize() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.getApplicationBufferSize(" + 41);
      }
   }

   @Override
   public String getCipherSuite() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.getCipherSuite(" + ')');
      }
   }

   @Override
   public long getCreationTime() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.getCreationTime(" + ')');
      }
   }

   @Override
   public byte[] getId() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.getId(" + ')');
      }
   }

   @Override
   public long getLastAccessedTime() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.getLastAccessedTime(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqz;)V")
   @ObfuscatedName("qx")
   public static void method9929(classQZ var0) {
      if (var0 == null) {
         var0.getSessionContext();
      }

      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bn")
   public String method9910() {
      throw new UnsupportedOperationException();
   }

   @Override
   public int getPacketBufferSize() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.getPacketBufferSize(" + 41);
      }
   }

   @Override
   public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.getPeerCertificateChain(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/Object;")
   @ObfuscatedName("bo")
   public Object method9920(String var1) {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqz;)[Ljava/lang/String;")
   @ObfuscatedName("eo")
   public static String[] method9925(classQZ var0) {
      if (var0 == null) {
         var0.method9892();
      }

      throw new UnsupportedOperationException();
   }

   @Override
   public String getPeerHost() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.getPeerHost(" + ')');
      }
   }

   @Override
   public int getPeerPort() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.getPeerPort(" + 41);
      }
   }

   @Override
   public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.getPeerPrincipal(" + ')');
      }
   }

   @Override
   public String getProtocol() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.getProtocol(" + ')');
      }
   }

   @Override
   public SSLSessionContext getSessionContext() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.getSessionContext(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/security/cert/Certificate;")
   @ObfuscatedName("ad")
   public Certificate[] method9897() {
      throw new UnsupportedOperationException();
   }

   @Override
   public String[] getValueNames() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.getValueNames(" + ')');
      }
   }

   @Override
   public void invalidate() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.invalidate(" + ')');
      }
   }

   @Override
   public boolean isValid() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.isValid(" + ')');
      }
   }

   @Override
   public void putValue(String var1, Object var2) {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "qz.putValue(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqz;Ljava/lang/String;)Ljava/lang/Object;")
   @ObfuscatedName("uh")
   public static Object method9921(classQZ var0, String var1) {
      if (var0 == null) {
         var0.method9889();
      }

      throw new UnsupportedOperationException();
   }

   @Override
   public void removeValue(String var1) {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qz.removeValue(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("ac")
   public long method9890() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ab")
   public String method9888() {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqz;)J")
   @ObfuscatedName("xc")
   public static long method9891(classQZ var0) {
      if (var0 == null) {
         var0.method9894();
      }

      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqz;)Ljavax/net/ssl/SSLSessionContext;")
   @ObfuscatedName("es")
   public static SSLSessionContext method9916(classQZ var0) {
      if (var0 == null) {
         var0.method9902();
      }

      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ag")
   public String method9889() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("as")
   public long method9892() {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqz;Ljava/lang/String;)V")
   @ObfuscatedName("vd")
   public static void method9935(classQZ var0, String var1) {
      if (var0 == null) {
         var0.method9909();
      }

      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqz;)[Ljava/security/cert/Certificate;")
   @ObfuscatedName("uz")
   public static Certificate[] method9898(classQZ var0) {
      if (var0 == null) {
         var0.method9914();
      }

      throw new UnsupportedOperationException();
   }

   @Override
   public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
      try {
         return this.this$1.field5515;
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.getPeerCertificates(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("aa")
   public byte[] method9893() {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Luq;II)Z")
   @ObfuscatedName("hr")
   public static boolean method9886(classUQ var0, int var1, int var2) {
      return var1 >= -1357616065 * var0.field6368
         && var1 < var0.field6368 * -1357616065 + 518523273 * var0.field6370
         && var2 >= 926655743 * var0.field6369
         && var2 < -874893249 * var0.field6371 + 926655743 * var0.field6369;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   public int method9904() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("al")
   public long method9895() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()J")
   @ObfuscatedName("aj")
   public long method9896() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("bi")
   public String[] method9926() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/security/cert/Certificate;")
   @ObfuscatedName("an")
   public Certificate[] method9899() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/security/Principal;")
   @ObfuscatedName("ap")
   public Principal method9900() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ar")
   public int method9905() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("bb")
   public String[] method9927() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/Object;)V")
   @ObfuscatedName("bv")
   public void method9934(String var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public Object getValue(String var1) {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "qz.getValue(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/security/Principal;")
   @ObfuscatedName("au")
   public Principal method9901() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("av")
   public int method9906() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()[Ljavax/security/cert/X509Certificate;")
   @ObfuscatedName("at")
   public X509Certificate[] method9908() throws SSLPeerUnverifiedException {
      return null;
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/security/cert/Certificate;")
   @ObfuscatedName("ay")
   public Certificate[] method9909() throws SSLPeerUnverifiedException {
      return this.this$1.field5515;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("am")
   public String method9911() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   public int method9887() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("bx")
   public String method9912() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("bc")
   public int method9914() {
      return 0;
   }

   @ObfuscatedSignature(descriptor = "()[B")
   @ObfuscatedName("ao")
   public byte[] method9894() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("br")
   public String method9915() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Ljavax/net/ssl/SSLSessionContext;")
   @ObfuscatedName("bm")
   public SSLSessionContext method9917() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Ljavax/net/ssl/SSLSessionContext;")
   @ObfuscatedName("bg")
   public SSLSessionContext method9918() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ah")
   public String method9913() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/Object;")
   @ObfuscatedName("bk")
   public Object method9922(String var1) {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqz;)Ljavax/net/ssl/SSLSessionContext;")
   @ObfuscatedName("fx")
   public static SSLSessionContext method9919(classQZ var0) {
      if (var0 == null) {
         var0.method9927();
      }

      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/Object;")
   @ObfuscatedName("bu")
   public Object method9923(String var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public Certificate[] getLocalCertificates() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.getLocalCertificates(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/security/Principal;")
   @ObfuscatedName("ai")
   public Principal method9902() {
      throw new UnsupportedOperationException();
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqz;)V")
   @ObfuscatedName("nd")
   public static void method9930(classQZ var0) {
      if (var0 == null) {
         var0.method9917();
      }

      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()[Ljava/lang/String;")
   @ObfuscatedName("by")
   public String[] method9928() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("bf")
   public void method9931() {
      throw new UnsupportedOperationException();
   }

   @Override
   public Principal getLocalPrincipal() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qz.getLocalPrincipal(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bd")
   public boolean method9932() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("bl")
   public boolean method9933() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;)Ljava/lang/Object;")
   @ObfuscatedName("ba")
   public Object method9924(String var1) {
      throw new UnsupportedOperationException();
   }

   classQZ(SecureRandomSSLSocket var1) {
      this.this$1 = var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   public int method9907() {
      throw new UnsupportedOperationException();
   }
}
