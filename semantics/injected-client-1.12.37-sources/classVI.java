import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vi")
public abstract class classVI extends classVY {
   @ObfuscatedName("bv")
   static int field6513;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   public abstract int vmethod617();

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   public abstract int vmethod614(int var1);

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   public abstract int vmethod618(int var1);

   @ObfuscatedSignature(descriptor = "(IIIIIIIIFFFI)F")
   @ObfuscatedName("aq")
   public static float method11957(
      int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11
   ) {
      try {
         float var12 = (var5 - var7) * (var4 - var3) + (var2 - var4) * (var6 - var7);
         float var13 = ((var0 - var4) * (var6 - var7) + (var1 - var7) * (var4 - var3)) / var12;
         float var14 = ((var2 - var4) * (var1 - var7) + (var0 - var4) * (var7 - var5)) / var12;
         float var15 = 1.0F - var13 - var14;
         return var14 * var9 + var13 * var8 + var15 * var10;
      } catch (RuntimeException var16) {
         throw classEG.newRunException(var16, "vi.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   public abstract int vmethod615();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   public abstract int vmethod616();

   classVI(int var1, int var2) {
      super(var1, var2);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   public abstract int vmethod621();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   public abstract int vmethod619();

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   public abstract int vmethod620(int var1);

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   public abstract int vmethod622();

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   public abstract int vmethod623();
}
