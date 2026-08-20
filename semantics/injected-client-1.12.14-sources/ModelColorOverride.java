import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ko")
public class ModelColorOverride {
   @ObfuscatedName("ag")
   byte overrideSaturation;
   @ObfuscatedName("at")
   byte overrideHue = -1;
   @ToRemove(unused = "true")
   @ObfuscatedName("av")
   public static final byte field3398 = 127;
   @ObfuscatedName("an")
   byte overrideLuminance;
   @ObfuscatedName("ae")
   byte overrideAmount;

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ae")
   public void method6532() {
      this.overrideHue = -1;
      this.overrideSaturation = -1;
      this.overrideLuminance = -1;
      this.overrideAmount = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ag")
   public void method6533() {
      this.overrideHue = -1;
      this.overrideSaturation = -1;
      this.overrideLuminance = -1;
      this.overrideAmount = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lko;)V")
   @ObfuscatedName("av")
   void method6530(ModelColorOverride var1) {
      this.overrideHue = var1.overrideHue;
      this.overrideSaturation = var1.overrideSaturation;
      this.overrideLuminance = var1.overrideLuminance;
      this.overrideAmount = var1.overrideAmount;
   }

   public ModelColorOverride(byte var1, byte var2, byte var3, byte var4) {
      this.overrideSaturation = -1;
      this.overrideLuminance = -1;
      this.overrideAmount = 0;
      this.overrideHue = var1;
      this.overrideSaturation = var2;
      this.overrideLuminance = var3;
      this.overrideAmount = var4;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ap")
   public boolean method6537() {
      return this.overrideAmount > 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("an")
   public boolean method6538() {
      return this.overrideAmount > 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aj")
   public void method6534() {
      this.overrideHue = -1;
      this.overrideSaturation = -1;
      this.overrideLuminance = -1;
      this.overrideAmount = 0;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ak")
   public void method6535() {
      this.overrideHue = -1;
      this.overrideSaturation = -1;
      this.overrideLuminance = -1;
      this.overrideAmount = 0;
   }

   @ObfuscatedSignature(descriptor = "(Lko;)V")
   @ObfuscatedName("qw")
   public void method6541(ModelColorOverride var1) {
      this.method6530(var1);
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aw")
   public void method6536() {
      this.overrideHue = -1;
      this.overrideSaturation = -1;
      this.overrideLuminance = -1;
      this.overrideAmount = 0;
   }

   public ModelColorOverride() {
      this.overrideSaturation = -1;
      this.overrideLuminance = -1;
      this.overrideAmount = 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ay")
   public boolean method6539() {
      return this.overrideAmount > 0;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   public boolean method6540() {
      return this.overrideAmount > 0;
   }

   @ObfuscatedSignature(descriptor = "(BBBB)V")
   @ObfuscatedName("at")
   public void method6531(byte var1, byte var2, byte var3, byte var4) {
      this.overrideLuminance = var1;
      this.overrideHue = var2;
      this.overrideLuminance = var3;
      this.overrideHue = var4;
   }
}
