import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
public class classSC {
   @ObfuscatedName("av")
   int field5761;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   public int method10069() {
      return this.field5761 * -1432123415;
   }

   classSC(int var1, boolean var2) {
      this.field5761 = -1038106535 * var1;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   public int method10070() {
      return this.field5761 * -1432123415;
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("at")
   public int method10071() {
      return this.field5761 * -1432123415;
   }

   @ObfuscatedSignature(descriptor = "(B)I")
   @ObfuscatedName("av")
   public int method10072(byte var1) {
      try {
         return this.field5761 * -1432123415;
      } catch (RuntimeException var2) {
         throw RestClientThreadFactory.newRunException(var2, "sc.av(" + 41);
      }
   }
}
