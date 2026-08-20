import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("tn")
public class classTN implements classXZ {
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   static final int field6176 = 34;
   @ObfuscatedName("ab")
   final int field6169;
   @ObfuscatedSignature(descriptor = "Ltn;")
   @ObfuscatedName("af")
   public static final classTN field6172 = new classTN(1, 1);
   @ToRemove(unused = "true")
   @ObfuscatedName("bw")
   public static final int field6175 = 50;
   @ObfuscatedName("ag")
   final int field6170;
   @ObfuscatedSignature(descriptor = "Ltn;")
   @ObfuscatedName("ae")
   public static final classTN field6173 = new classTN(2, 2);
   @ObfuscatedSignature(descriptor = "Ltn;")
   @ObfuscatedName("az")
   static final classTN field6171 = new classTN(0, 0);
   @ToRemove(unused = "true")
   @ObfuscatedName("as")
   public static final int field6174 = 10000;

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return 328973957 * this.field6170;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "tn.az(" + 41);
      }
   }

   classTN(int var1, int var2) {
      this.field6169 = var1 * 1026322027;
      this.field6170 = var2 * -874214835;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return -108641300 * this.field6170;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return -143993294 * this.field6170;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return 328973957 * this.field6170;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Ltn;")
   @ObfuscatedName("as")
   public static classTN[] method10936() {
      return new classTN[]{field6171, field6172, field6173};
   }
}
