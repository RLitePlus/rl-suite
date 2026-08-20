import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gb")
public class classGB extends classFM {
   @ToRemove(unused = "true")
   @ObfuscatedName("ea")
   static final int field1977 = 14;
   @ObfuscatedName("av")
   int field1975;
   @ToRemove(unused = "true")
   @ObfuscatedName("ar")
   static final int field1976 = 40;

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod185(ClanSettings var1, byte var2) {
      try {
         var1.method4316(this.field1975 * 1849507685, 1623441177);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gb.at(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod182(Buffer var1, byte var2) {
      try {
         this.field1975 = Buffer.method12008(var1, (byte)5) * 556849773;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gb.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)[Lpn;")
   @ObfuscatedName("ae")
   public static class406[] method4216(byte var0) {
      try {
         return new class406[]{class406.field5182, class406.field5183, class406.field5184, class406.field5185};
      } catch (RuntimeException var1) {
         throw RestClientThreadFactory.newRunException(var1, "gb.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod184(Buffer var1) {
      this.field1975 = Buffer.method12008(var1, (byte)5) * 556849773;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod183(Buffer var1) {
      this.field1975 = Buffer.method12008(var1, (byte)5) * -1365591109;
   }

   classGB(class154 var1) {
      this.this$0 = var1;
      this.field1975 = -556849773;
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod186(ClanSettings var1) {
      var1.method4316(this.field1975 * 1849507685, 1623441177);
   }
}
