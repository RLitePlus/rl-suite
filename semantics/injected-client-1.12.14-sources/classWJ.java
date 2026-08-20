import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wj")
final class classWJ implements classWK {
   @ObfuscatedSignature(descriptor = "(Ljava/lang/Long;Lxa;B)V")
   @ObfuscatedName("ak")
   void method11740(Long var1, Buffer var2, byte var3) {
      try {
         var2.writeLongMedium(var1);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "wj.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod446(Object var1, Buffer var2) {
      this.method11740((Long)var1, var2, (byte)8);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)Ljava/lang/Object;")
   @ObfuscatedName("at")
   @Override
   public Object vmethod443(Buffer var1, byte var2) {
      try {
         return Buffer.method12018(var1, -1969744305);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "wj.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;I)V")
   @ObfuscatedName("av")
   @Override
   public void vmethod447(Object var1, Buffer var2, int var3) {
      try {
         this.method11740((Long)var1, var2, (byte)-116);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "wj.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Long;Lxa;)V")
   @ObfuscatedName("ap")
   void method11741(Long var1, Buffer var2) {
      var2.writeLongMedium(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("an")
   @Override
   public void vmethod445(Object var1, Buffer var2) {
      this.method11740((Long)var1, var2, (byte)-24);
   }

   @ObfuscatedSignature(descriptor = "(Lut;B)V")
   @ObfuscatedName("ao")
   static void method11743(DynamicArray var0, byte var1) {
      try {
         class461.method9338(var0, null, false, -928498657);
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "wj.ao(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)Ljava/lang/Object;")
   @ObfuscatedName("aj")
   @Override
   public Object vmethod442(Buffer var1) {
      return Buffer.method12018(var1, -2018588148);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Long;Lxa;)V")
   @ObfuscatedName("aw")
   void method11742(Long var1, Buffer var2) {
      var2.writeLongMedium(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   public void vmethod444(Object var1, Buffer var2) {
      this.method11740((Long)var1, var2, (byte)-91);
   }
}
