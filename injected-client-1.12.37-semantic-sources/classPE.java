import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("pe")
public class classPE implements classXZ {
   @ObfuscatedName("ag")
   final int field5232;
   @ObfuscatedSignature(descriptor = "Lpe;")
   @ObfuscatedName("az")
   static final classPE field5228 = new classPE(0, 0);
   @ObfuscatedSignature(descriptor = "Lpe;")
   @ObfuscatedName("ae")
   static final classPE field5229 = new classPE(2, 2);
   @ObfuscatedName("ab")
   public final int field5231;
   @ObfuscatedSignature(descriptor = "Lpe;")
   @ObfuscatedName("af")
   static final classPE field5230 = new classPE(1, 1);
   @ToRemove(unused = "true")
   @ObfuscatedName("at")
   static final int field5233 = 8;
   @ObfuscatedSignature(descriptor = "[Lym;")
   @ObfuscatedName("aj")
   static SpritePixels[] field5234;

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return this.field5232 * -2126097231;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "pe.az(" + 41);
      }
   }

   classPE(int var1, int var2) {
      this.field5231 = var1 * -943669939;
      this.field5232 = var2 * -2079361967;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return this.field5232 * -2126097231;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return this.field5232 * -2126097231;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return this.field5232 * -2126097231;
   }
}
