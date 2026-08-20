import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vq")
public class class558 extends class560 {
   @ObfuscatedName("av")
   int field6232 = 0;
   @ObfuscatedName("at")
   int field6231 = 0;

   public class558(int var1, int var2, int var3, int var4) {
      super(var3, var4);
      this.field6232 = var1 * -551906721;
      this.field6231 = -353337723 * var2;
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/String;S)V")
   @ObfuscatedName("av")
   public static void openURL(String var0, short var1) {
      try {
         SecureUrlRequester.client.getCallbacks().openUrl(var0);
      } catch (Exception var3) {
         client.field938.error("unable to open url {}", var0, var3);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   public int method11355() {
      double var1 = class560.method11318(this, (byte)-30);
      return (int)Math.round(813582751 * this.field6232 + var1 * (this.field6231 * -284046771 - this.field6232 * 813582751));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   public int method11356() {
      double var1 = class560.method11318(this, (byte)-30);
      return (int)Math.round(-1402449192 * this.field6232 + var1 * (this.field6231 * -1602455146 - this.field6232 * 813582751));
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   public int method11357(byte var1) {
      try {
         double var2 = class560.method11318(this, (byte)-30);
         return (int)Math.round(813582751 * this.field6232 + var2 * (this.field6231 * -284046771 - this.field6232 * 813582751));
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vq.av(" + 41);
      }
   }
}
