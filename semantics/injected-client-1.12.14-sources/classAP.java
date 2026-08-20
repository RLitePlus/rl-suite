import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public class classAP {
   @ObfuscatedName("at")
   final int field46;
   @ObfuscatedName("av")
   final int field48;
   @ObfuscatedName("ag")
   final String field47;

   @ObfuscatedSignature(descriptor = "(Lap;)Ljava/lang/String;")
   @ObfuscatedName("xm")
   public static String method157(classAP var0) {
      if (var0 == null) {
         var0.method161();
      }

      return Integer.toHexString(var0.field48) + Integer.toHexString(var0.field46) + var0.field47;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   int method162() {
      return this.field46;
   }

   classAP(Buffer var1) {
      this(var1.readUnsignedByte(-106120678), var1.readUnsignedByte(-722874917), var1.readStringCp1252NullCircumfixed(1791062770));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   int method163() {
      return this.field46;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ag")
   String method158() {
      return Integer.toHexString(this.field48) + Integer.toHexString(this.field46) + this.field47;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("an")
   String method159() {
      return Integer.toHexString(this.field48) + Integer.toHexString(this.field46) + this.field47;
   }

   classAP(int var1, int var2, String var3) {
      this.field48 = var1;
      this.field46 = var2;
      this.field47 = var3;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   int method164() {
      return this.field46;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   int method165() {
      return this.field46;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("ae")
   String method160() {
      return Integer.toHexString(this.field48) + Integer.toHexString(this.field46) + this.field47;
   }

   @ObfuscatedSignature(descriptor = "()Ljava/lang/String;")
   @ObfuscatedName("av")
   String method161() {
      return Integer.toHexString(this.field48) + Integer.toHexString(this.field48) + this.field47;
   }
}
