import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("ai")
class classAI extends DefaultTlsClient {
   classAI(SecureRandomSSLSocket var1) {
      this.this$1 = var1;
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
         throw RestClientThreadFactory.newRunException(var5, "ai.getClientExtensions(" + ')');
      }
   }

   public TlsAuthentication getAuthentication() throws IOException {
      try {
         return new classAZ(this);
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "ai.getAuthentication(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Hashtable;")
   @ObfuscatedName("av")
   public Hashtable method94() throws IOException {
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
   @ObfuscatedName("ae")
   public TlsAuthentication method98() throws IOException {
      return new classAZ(this);
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Hashtable;")
   @ObfuscatedName("ag")
   public Hashtable method95() throws IOException {
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
   @ObfuscatedName("an")
   public Hashtable method96() throws IOException {
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
   @ObfuscatedName("aj")
   public TlsAuthentication method99() throws IOException {
      return new classAZ(this);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lnc;)V")
   @ObfuscatedName("go")
   public static void method100(MidiPcmStream var0) {
      if (var0 == null) {
         var0.method7655();
      }

      var0.method7689(-1, (byte)80);
      var0.method7691(-1, 2025023543);

      for (int var1 = 0; var1 < 16; var1++) {
         var0.field4216[var1] = var0.field4215[var1];
      }

      for (int var2 = 0; var2 < 16; var2++) {
         var0.field4217[var2] = var0.field4215[var2] & -128;
      }
   }

   @ObfuscatedSignature(descriptor = "()Ljava/util/Hashtable;")
   @ObfuscatedName("at")
   public Hashtable method97() throws IOException {
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
}
