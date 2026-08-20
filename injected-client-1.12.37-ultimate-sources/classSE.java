import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("se")
public class classSE implements classXZ {
   @ToRemove(unused = "true")
   @ObfuscatedName("bx")
   static final int field5919 = 171;
   @ObfuscatedSignature(descriptor = "Lse;")
   @ObfuscatedName("af")
   static final classSE field5913 = new classSE(1, 1);
   @ObfuscatedSignature(descriptor = "Lse;")
   @ObfuscatedName("ae")
   static final classSE field5915 = new classSE(2, 2);
   @ObfuscatedSignature(descriptor = "Lse;")
   @ObfuscatedName("az")
   static final classSE field5911 = new classSE(0, 0);
   @ObfuscatedSignature(descriptor = "Lse;")
   @ObfuscatedName("ag")
   static final classSE field5912 = new classSE(4, 4);
   @ObfuscatedName("as")
   final int field5916;
   @ObfuscatedName("ax")
   final int field5917;
   @ObfuscatedSignature(descriptor = "Lse;")
   @ObfuscatedName("ab")
   static final classSE field5914 = new classSE(3, 3);
   @ToRemove(unused = "true")
   @ObfuscatedName("ac")
   static final int field5918 = 1;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return 1514051917 * this.field5917;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return 1514051917 * this.field5917;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "se.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return 1514051917 * this.field5917;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return -461943984 * this.field5917;
   }

   classSE(int var1, int var2) {
      this.field5916 = var1 * 299756773;
      this.field5917 = var2 * 2043561861;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lse;")
   @ObfuscatedName("ax")
   static classSE[] method10372() {
      return new classSE[]{field5911, field5913, field5915, field5914, field5912};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lse;")
   @ObfuscatedName("ac")
   static classSE[] method10373() {
      return new classSE[]{field5911, field5913, field5915, field5914, field5912};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lse;")
   @ObfuscatedName("aa")
   static classSE method10374(int var0) {
      classSE var1 = (classSE)classOF.method8404(classQD.method9493(-1831398947), var0, 95108565);
      if (var1 == null) {
         var1 = field5911;
      }

      return var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I)Lse;")
   @ObfuscatedName("ao")
   static classSE method10375(int var0) {
      classSE var1 = (classSE)classOF.method8404(classQD.method9493(-1697277799), var0, -1734029783);
      if (var1 == null) {
         var1 = field5911;
      }

      return var1;
   }
}
