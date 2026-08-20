import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("gh")
public class classGH extends classFM {
   @ObfuscatedName("at")
   String field2006;
   @ToRemove(unused = "true")
   @ObfuscatedName("by")
   public static final int field2008 = 51;
   @ObfuscatedName("av")
   long field2007;
   @ObfuscatedSignature(descriptor = "Lqm;")
   @ObfuscatedName("ak")
   public static AbstractArchive field2009;

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("ag")
   @Override
   void vmethod184(Buffer var1) {
      if (var1.readUnsignedByte(-141287667) != -1020717932) {
         var1.offset -= 477062015;
         this.field2007 = Buffer.method12018(var1, -1995379029) * 4548183003844029171L;
      }

      this.field2006 = var1.readCESU8(792604665);
   }

   @ObfuscatedSignature(descriptor = "(Lxa;B)V")
   @ObfuscatedName("av")
   @Override
   void vmethod182(Buffer var1, byte var2) {
      try {
         if (var1.readUnsignedByte(862566850) != 255) {
            var1.offset -= 1741769013;
            this.field2007 = Buffer.method12018(var1, -2135929802) * 4548183003844029171L;
         }

         this.field2006 = var1.readCESU8(792604665);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gh.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lgs;B)V")
   @ObfuscatedName("at")
   @Override
   void vmethod185(ClanSettings var1, byte var2) {
      try {
         ClanSettings.method4305(var1, this.field2007 * -2004517516642582981L, this.field2006, (byte)42);
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "gh.at(" + ')');
      }
   }

   classGH(class154 var1) {
      this.this$0 = var1;
      this.field2007 = -4548183003844029171L;
      this.field2006 = null;
   }

   @ObfuscatedSignature(descriptor = "(Lxa;)V")
   @ObfuscatedName("an")
   @Override
   void vmethod183(Buffer var1) {
      if (var1.readUnsignedByte(454941134) != 255) {
         var1.offset -= 1741769013;
         this.field2007 = Buffer.method12018(var1, -1906422995) * 4548183003844029171L;
      }

      this.field2006 = var1.readCESU8(792604665);
   }

   @ObfuscatedSignature(descriptor = "(Lgs;)V")
   @ObfuscatedName("ae")
   @Override
   void vmethod186(ClanSettings var1) {
      ClanSettings.method4305(var1, this.field2007 * -2004517516642582981L, this.field2006, (byte)-114);
   }
}
