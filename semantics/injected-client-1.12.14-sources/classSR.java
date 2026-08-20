import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
public class classSR {
   @ObfuscatedName("at")
   int field5860;
   @ObfuscatedName("av")
   final int[] field5859;

   @ObfuscatedSignature(descriptor = "(IB)V")
   @ObfuscatedName("av")
   public void method10495(int var1, byte var2) {
      try {
         this.field5859[(this.field5860 += -131846291) * 1653486181 - 1] = var1;
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sr.av(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IB)I")
   @ObfuscatedName("at")
   public int method10498(int var1, byte var2) {
      try {
         return this.field5859[var1];
      } catch (RuntimeException var3) {
         throw RestClientThreadFactory.newRunException(var3, "sr.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   public int method10502(int var1) {
      try {
         return this.field5860 * 1653486181;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sr.ag(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ap")
   public int method10499(int var1) {
      return this.field5859[var1];
   }

   @ObfuscatedSignature(descriptor = "(Lsr;I)V")
   @ObfuscatedName("jc")
   public static void method10505(classSR var0, int var1) {
      if (var0 == null) {
         var0.method10497(var1);
      } else {
         try {
            var0.field5860 = 0;
         } catch (RuntimeException var2) {
            throw RestClientThreadFactory.newRunException(var2, "sr.an(" + ')');
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   public int method10503() {
      return this.field5860 * 1653486181;
   }

   public classSR(int var1) {
      this.field5859 = new int[var1];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("sz")
   public int method10506() {
      return this.method10502(-2050652984);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aj")
   public int method10500(int var1) {
      return this.field5859[var1];
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("aw")
   public int method10501(int var1) {
      return this.field5859[var1];
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   public int method10504() {
      return this.field5860 * -1185371360;
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("ae")
   public void method10496(int var1) {
      this.field5859[(this.field5860 += 595647182) * 1091359231 - 1] = var1;
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ak")
   public int method10507(int var1) {
      return this.method10498(var1, (byte)24);
   }

   @ObfuscatedSignature(descriptor = "(I)V")
   @ObfuscatedName("an")
   public void method10497(int var1) {
      this.field5859[(this.field5860 += 595647182) * 1091359231 - 1] = var1;
   }
}
