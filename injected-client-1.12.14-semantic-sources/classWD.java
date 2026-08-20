import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wd")
final class classWD implements classWK {
   @ObfuscatedName("ly")
   static int field6365;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Integer;Lxa;)V")
   @ObfuscatedName("ay")
   void method11678(Integer var1, Buffer var2) {
      var2.writeInt(var1, 628017616);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Integer;Lxa;I)V")
   @ObfuscatedName("ak")
   void method11679(Integer var1, Buffer var2, int var3) {
      try {
         var2.writeInt(var1, 478047163);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "wd.ak(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)Ljava/lang/Object;")
   @ObfuscatedName("aj")
   @Override
   public Object vmethod442(Buffer var1) {
      return Buffer.method12015(var1, 28780683);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)Ljava/lang/Object;")
   @ObfuscatedName("at")
   @Override
   public Object vmethod443(Buffer var1, byte var2) {
      try {
         return Buffer.method12015(var1, 444901840);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "wd.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   public void vmethod444(Object var1, Buffer var2) {
      this.method11679((Integer)var1, var2, 1409099944);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("an")
   @Override
   public void vmethod445(Object var1, Buffer var2) {
      this.method11679((Integer)var1, var2, -5030596);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;)V")
   @ObfuscatedName("ae")
   @Override
   public void vmethod446(Object var1, Buffer var2) {
      this.method11679((Integer)var1, var2, 948860801);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Integer;Lxa;)V")
   @ObfuscatedName("aw")
   void method11680(Integer var1, Buffer var2) {
      var2.writeInt(var1, 1405465068);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Integer;Lxa;)V")
   @ObfuscatedName("ap")
   void method11681(Integer var1, Buffer var2) {
      var2.writeInt(var1, 1688175698);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lxa;I)V")
   @ObfuscatedName("av")
   @Override
   public void vmethod447(Object var1, Buffer var2, int var3) {
      try {
         this.method11679((Integer)var1, var2, -1035067516);
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "wd.av(" + ')');
      }
   }
}
