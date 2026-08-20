import java.io.IOException;
import java.net.URLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ef")
public abstract class PcmStreamMixerListener extends Node {
   @ObfuscatedName("av")
   int field1567;

   @ObfuscatedSignature(descriptor = "(Ldr;)I")
   @ObfuscatedName("at")
   abstract int update(PcmStreamMixer var1);

   @ObfuscatedSignature(descriptor = "(Ldr;)I")
   @ObfuscatedName("aw")
   abstract int method3706(PcmStreamMixer var1);

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Leu;Ley;)Ljava/net/URLConnection;")
   @ObfuscatedName("sy")
   public static URLConnection method3704(SecureUrlRequester var0, UrlRequest var1) throws IOException {
      if (var0 == null) {
         var0.vmethod180(var1);
      }

      URLConnection var2 = var1.field1727.openConnection();
      var0.setDefaultRequestProperties(var2, 2146753197);
      return var2;
   }

   PcmStreamMixerListener() throws Throwable {
      throw new Error();
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   abstract void method3707();

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("av")
   abstract void remove2();

   @ObfuscatedSignature(descriptor = "(Ldr;)I")
   @ObfuscatedName("ak")
   abstract int method3709(PcmStreamMixer var1);

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("an")
   abstract void method3710();

   @ObfuscatedSignature(descriptor = "(Ldr;)I")
   @ObfuscatedName("ae")
   abstract int method3711(PcmStreamMixer var1);

   @ObfuscatedSignature(descriptor = "(Ldr;)I")
   @ObfuscatedName("aj")
   abstract int method3712(PcmStreamMixer var1);
}
