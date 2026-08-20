import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("qu")
class classQU extends DefaultTlsClient {
   @ObfuscatedSignature(descriptor = "()Ljava/util/Hashtable;")
   @ObfuscatedName("az")
   public Hashtable method9818() throws IOException {
      Hashtable var1 = super.getClientExtensions();
      if (var1 == null) {
         var1 = new Hashtable();
      }

      byte[] var2 = this.this$1.val$host.getBytes();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);
      var4.writeShort(var2.length + 3);
      var4.writeByte(0);
      var4.writeShort(var2.length);
      var4.write(var2);
      var4.close();
      var1.put(0, var3.toByteArray());
      return var1;
   }

   @Override
   public Hashtable getClientExtensions() throws IOException {
      try {
         Hashtable var1 = super.getClientExtensions();
         if (var1 == null) {
            var1 = new Hashtable();
         }

         byte[] var2 = this.this$1.val$host.getBytes();
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();
         DataOutputStream var4 = new DataOutputStream(var3);
         var4.writeShort(var2.length + 3);
         var4.writeByte(0);
         var4.writeShort(var2.length);
         var4.write(var2);
         var4.close();
         var1.put(0, var3.toByteArray());
         return var1;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "qu.getClientExtensions(" + ')');
      }
   }

   public TlsAuthentication getAuthentication() throws IOException {
      try {
         return new classQT(this);
      } catch (RuntimeException var1) {
         throw classEG.newRunException(var1, "qu.getAuthentication(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Lorg/bouncycastle/crypto/tls/TlsAuthentication;")
   @ObfuscatedName("ab")
   public TlsAuthentication method9821() throws IOException {
      return new classQT(this);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Hashtable;")
   @ObfuscatedName("af")
   public Hashtable method9819() throws IOException {
      Hashtable var1 = super.getClientExtensions();
      if (var1 == null) {
         var1 = new Hashtable();
      }

      byte[] var2 = this.this$1.val$host.getBytes();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);
      var4.writeShort(var2.length + 3);
      var4.writeByte(0);
      var4.writeShort(var2.length);
      var4.write(var2);
      var4.close();
      var1.put(0, var3.toByteArray());
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Hashtable;")
   @ObfuscatedName("ae")
   public Hashtable method9820() throws IOException {
      Hashtable var1 = super.getClientExtensions();
      if (var1 == null) {
         var1 = new Hashtable();
      }

      byte[] var2 = this.this$1.val$host.getBytes();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);
      var4.writeShort(var2.length + 3);
      var4.writeByte(0);
      var4.writeShort(var2.length);
      var4.write(var2);
      var4.close();
      var1.put(0, var3.toByteArray());
      return var1;
   }

   @ObfuscatedSignature(descriptor = "()Lorg/bouncycastle/crypto/tls/TlsAuthentication;")
   @ObfuscatedName("as")
   public TlsAuthentication method9822() throws IOException {
      return new classQT(this);
   }

   @ObfuscatedSignature(descriptor = "()Lorg/bouncycastle/crypto/tls/TlsAuthentication;")
   @ObfuscatedName("ag")
   public TlsAuthentication method9823() throws IOException {
      return new classQT(this);
   }

   @ObfuscatedSignature(descriptor = "()Lorg/bouncycastle/crypto/tls/TlsAuthentication;")
   @ObfuscatedName("ax")
   public TlsAuthentication method9824() throws IOException {
      return new classQT(this);
   }

   classQU(SecureRandomSSLSocket var1) {
      this.this$1 = var1;
   }
}
