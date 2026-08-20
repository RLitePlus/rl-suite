import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sk")
public class classSK implements classXZ {
   @ObfuscatedSignature(descriptor = "Lsk;")
   @ObfuscatedName("ag")
   static final classSK field5972 = new classSK(4, 4, null, 1);
   @ObfuscatedSignature(descriptor = "Lsk;")
   @ObfuscatedName("af")
   static final classSK field5973 = new classSK(1, 1, null, 9);
   @ObfuscatedName("ac")
   final int field5966;
   @ObfuscatedSignature(descriptor = "Lsk;")
   @ObfuscatedName("ab")
   static final classSK field5971 = new classSK(3, 3, null, 6);
   @ObfuscatedSignature(descriptor = "Lsk;")
   @ObfuscatedName("az")
   static final classSK field5968 = new classSK(0, 0, null, 0);
   @ObfuscatedSignature(descriptor = "Lsk;")
   @ObfuscatedName("as")
   static final classSK field5969 = new classSK(5, 5, null, 3);
   @ObfuscatedName("ax")
   final int field5967;
   @ObfuscatedSignature(descriptor = "Lsk;")
   @ObfuscatedName("ae")
   static final classSK field5970 = new classSK(2, 2, null, 3);
   @ObfuscatedName("aa")
   final int field5965;

   @ObfuscatedSignature(descriptor = "(Lsk;I)I")
   @ObfuscatedName("jj")
   public static int method10461(classSK var0, int var1) {
      if (var0 == null) {
         var0.method10465(var1);
      }

      try {
         return -78036789 * var0.field5965;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sk.as(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   int method10462() {
      return -78036789 * this.field5965;
   }

   classSK(int var1, int var2, String var3, int var4) {
      this.field5967 = var1 * 987462429;
      this.field5966 = 896897993 * var2;
      this.field5965 = var4 * -77781789;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod8(byte var1) {
      try {
         return this.field5966 * 1427830393;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sk.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod10() {
      return this.field5966 * 1427830393;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod11() {
      return this.field5966 * 1427830393;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lsk;")
   @ObfuscatedName("ax")
   static classSK[] method10458() {
      return new classSK[]{field5968, field5973, field5970, field5971, field5972, field5969};
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "()[Lsk;")
   @ObfuscatedName("ac")
   static classSK[] method10459() {
      return new classSK[]{field5968, field5973, field5970, field5971, field5972, field5969};
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   int method10463() {
      return -78036789 * this.field5965;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("al")
   int method10464() {
      return -78036789 * this.field5965;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("af")
   @Override
   public int vmethod9() {
      return this.field5966 * 1427830393;
   }

   @ObfuscatedSignature(descriptor = "(II)Lbl;")
   @ObfuscatedName("az")
   static classBL method10460(int var0, int var1) {
      try {
         classBL var2 = (classBL)classBL.field491.method6422(var0);
         if (null != var2) {
            if (var1 == 57435997) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = classWN.field6759.method11867(var0, 0, -1379686198);
            if (var3 == null) {
               if (var1 == 57435997) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var2 = classLW.method7156(var3, -2042870765);
               classBL.field491.method6428(var2, var0);
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "sk.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("as")
   int method10465(int var1) {
      try {
         return -78036789 * this.field5965;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "sk.as(" + 41);
      }
   }
}
