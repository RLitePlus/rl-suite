import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("aj")
public class classAJ extends classAW {
   @ObfuscatedName("ab")
   int field191;
   @ObfuscatedName("af")
   public short[] field189;
   @ObfuscatedName("ag")
   public boolean field190;
   @ObfuscatedName("ae")
   public int field192;
   @ObfuscatedName("az")
   public int field187;
   @ObfuscatedName("as")
   boolean field188 = false;

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("az")
   boolean method399() {
      return this.field188;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Ldz;I)Lct;")
   @ObfuscatedName("ag")
   public static classCT method401(classDZ var0, int var1) {
      return (classCT)var0.field1694.method13404(var1);
   }

   classAJ(int var1, short[] var2, int var3, int var4, boolean var5, boolean var6) {
      this.field187 = var1;
      this.field189 = var2;
      this.field192 = var3;
      this.field191 = var4;
      this.field190 = var5;
      this.field188 = var6;
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("af")
   boolean method400() {
      return this.field188;
   }
}
