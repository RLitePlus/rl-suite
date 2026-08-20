import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ps")
public class classPS {
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   static final int field5234 = 4;
   @ToRemove(unused = "true")
   @ObfuscatedName("au")
   static final int field5233 = 16;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldp;)V")
   @ObfuscatedName("ef")
   public static void method8804(SoundEnvelope var0) {
      if (var0 == null) {
         var0.method3406();
      }

      var0.ticks = 0;
      var0.phaseIndex = 0;
      var0.step = 0;
      var0.amplitude = 0;
      var0.max = 0;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lad;)Ljava/io/OutputStream;")
   @ObfuscatedName("nt")
   public static OutputStream method8805(SecureRandomSSLSocket var0) throws IOException {
      return var0.val$tlsClientProtocol.getOutputStream();
   }

   classPS() throws Throwable {
      throw new Error();
   }
}
