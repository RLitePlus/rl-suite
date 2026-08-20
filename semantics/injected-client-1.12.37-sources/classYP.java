import java.io.IOException;
import java.security.Principal;
import javax.net.ssl.SSLPeerUnverifiedException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("yp")
final class classYP implements classYH {
   @ToRemove(unused = "true")
   @ObfuscatedName("ap")
   static final float field7024 = 325.9493F;
   @ToRemove(unused = "true")
   @ObfuscatedName("ag")
   static final int field7025 = 3;
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field7026 = 12;
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field7027 = 31;
   @ObfuscatedSignature(descriptor = "Lkx;")
   @ObfuscatedName("gc")
   static classKX field7028;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lqz;)Ljava/security/Principal;")
   @ObfuscatedName("iz")
   public static Principal method13608(classQZ var0) throws SSLPeerUnverifiedException {
      if (var0 == null) {
         var0.method9902();
      }

      return null;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxy;)V")
   @ObfuscatedName("aa")
   @Override
   public void vmethod657(Object var1, Buffer var2) {
      throw new UnsupportedOperationException("Cannot serialise this object type");
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxy;I)V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod656(Object var1, Buffer var2, int var3) {
      try {
         throw new UnsupportedOperationException("Cannot serialise this object type");
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "yp.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;B)Ljava/lang/Object;")
   @ObfuscatedName("af")
   @Override
   public Object vmethod653(Buffer var1, byte var2) {
      try {
         throw new UnsupportedOperationException("Cannot deserialise this object type");
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "yp.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Object;")
   @ObfuscatedName("ac")
   @Override
   public Object vmethod655(Buffer var1) {
      throw new UnsupportedOperationException("Cannot deserialise this object type");
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Laac;)V")
   @ObfuscatedName("of")
   public static void method13607(classAAC var0) throws IOException {
      if (var0 == null) {
         var0.method133();
      }

      var0.method160(1788244273);
      classAAR.method247(var0.field31, (byte)1);
   }

   @ObfuscatedSignature(descriptor = "(Lxy;)Ljava/lang/Object;")
   @ObfuscatedName("ax")
   @Override
   public Object vmethod654(Buffer var1) {
      throw new UnsupportedOperationException("Cannot deserialise this object type");
   }
}
