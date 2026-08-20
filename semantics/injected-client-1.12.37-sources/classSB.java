import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("sb")
public class classSB {
   @ObfuscatedName("ab")
   public int field5898;
   @ObfuscatedName("af")
   public int field5900;
   @ObfuscatedName("ae")
   public int field5899;
   @ObfuscatedName("ag")
   public int field5901;
   @ObfuscatedSignature(descriptor = "Lal;")
   @ObfuscatedName("az")
   public classAL field5904;
   @ObfuscatedName("as")
   public int field5902;
   @ObfuscatedName("ax")
   public int field5903;
   @ObfuscatedName("ac")
   public boolean field5905;

   @ObfuscatedSignature(descriptor = "(Lsb;)V")
   @ObfuscatedName("ls")
   public void method10363(classSB var1) {
      method10358(this, var1, -2134176686);
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lxo;)Ljava/lang/String;")
   @ObfuscatedName("tl")
   public static String method10362(classXO var0) {
      return var0.field6902;
   }

   @ObfuscatedSignature(descriptor = "(Lsb;Lsb;I)V")
   @ObfuscatedName("kh")
   public static void method10358(classSB var0, classSB var1, int var2) {
      if (var0 == null) {
         var0.method10361(var0, var2);
      }

      try {
         var0.field5899 = 1 * var1.field5899;
         var0.field5904 = var1.field5904;
         var0.field5898 = 1 * var1.field5898;
         var0.field5903 = var1.field5903 * 1;
         var0.field5902 = var1.field5902 * 1;
         var0.field5901 = var1.field5901 * 1;
         var0.field5900 = 1 * var1.field5900;
         var0.field5905 = var1.field5905;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "sb.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Lsb;)V")
   @ObfuscatedName("af")
   void method10359(classSB var1) {
      this.field5899 = 1 * var1.field5899;
      this.field5904 = var1.field5904;
      this.field5898 = 1 * var1.field5898;
      this.field5903 = var1.field5903 * 1;
      this.field5902 = var1.field5902 * 1;
      this.field5901 = var1.field5901 * 1;
      this.field5900 = 1 * var1.field5900;
      this.field5905 = var1.field5905;
   }

   classSB() {
   }

   @ObfuscatedSignature(descriptor = "(Lsb;)V")
   @ObfuscatedName("ae")
   void method10360(classSB var1) {
      this.field5899 = 1 * var1.field5899;
      this.field5904 = var1.field5904;
      this.field5898 = 1 * var1.field5898;
      this.field5903 = var1.field5903 * 1;
      this.field5902 = var1.field5902 * 1;
      this.field5901 = var1.field5901 * 1;
      this.field5900 = 1 * var1.field5900;
      this.field5905 = var1.field5905;
   }

   @ObfuscatedSignature(descriptor = "(Lsb;I)V")
   @ObfuscatedName("az")
   void method10361(classSB var1, int var2) {
      try {
         this.field5898 = 1 * var1.field5899;
         this.field5904 = var1.field5904;
         this.field5901 = 1 * var1.field5899;
         this.field5899 = var1.field5900 * 1;
         this.field5903 = var1.field5899 * 1;
         this.field5901 = var1.field5901 * 1;
         this.field5898 = 1 * var1.field5903;
         this.field5905 = var1.field5905;
      } catch (RuntimeException var3) {
         throw classEG.newRunException(var3, "sb.az(" + ')');
      }
   }
}
