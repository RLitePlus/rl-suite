import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("yx")
public class classYX {
   @ObfuscatedName("af")
   short[] field7105;
   @ObfuscatedName("az")
   int[] field7106 = new int[8];

   @ObfuscatedSignature(descriptor = "([I[S)V")
   @ObfuscatedName("aj")
   public void method13773(int[] var1, short[] var2) {
      this.field7106 = var1;
      this.field7105 = var2;
   }

   public classYX(classPL var1) {
      this.field7105 = new short[8];
      int var2 = 0;
      if (var1.method8971(-267153217)) {
         var2 = var1.method8974((byte)112).length;
         System.arraycopy(var1.method8974((byte)105), 0, this.field7106, 0, var2);
         System.arraycopy(var1.method8981(-908907734), 0, this.field7105, 0, var2);
      }

      for (int var3 = var2; var3 < 8; var3++) {
         this.field7106[var3] = -1;
         this.field7105[var3] = -1;
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[S")
   @ObfuscatedName("af")
   public short[] method13767(int var1) {
      try {
         return this.field7105;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "yx.af(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IISI)V")
   @ObfuscatedName("ae")
   public void method13769(int var1, int var2, short var3, int var4) {
      try {
         this.field7106[var1] = var2;
         this.field7105[var1] = var3;
      } catch (RuntimeException var5) {
         throw classEG.newRunException(var5, "yx.ae(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)[I")
   @ObfuscatedName("az")
   public int[] method13766(int var1) {
      try {
         return this.field7106;
      } catch (RuntimeException var2) {
         throw classEG.newRunException(var2, "yx.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()[S")
   @ObfuscatedName("as")
   public short[] method13768() {
      return this.field7105;
   }

   @ObfuscatedSignature(descriptor = "(IIS)V")
   @ObfuscatedName("ac")
   public void method13770(int var1, int var2, short var3) {
      this.field7106[var1] = var2;
      this.field7105[var1] = var3;
   }

   @ObfuscatedSignature(descriptor = "(IIS)V")
   @ObfuscatedName("aa")
   public void method13771(int var1, int var2, short var3) {
      this.field7106[var1] = var2;
      this.field7105[var1] = var3;
   }

   @ObfuscatedSignature(descriptor = "([I[SI)V")
   @ObfuscatedName("ab")
   public void method13774(int[] var1, short[] var2, int var3) {
      try {
         this.field7106 = var1;
         this.field7105 = var2;
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "yx.ab(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(IIS)V")
   @ObfuscatedName("ao")
   public void method13772(int var1, int var2, short var3) {
      this.field7106[var1] = var2;
      this.field7105[var1] = var3;
   }

   @ObfuscatedSignature(descriptor = "([I[S)V")
   @ObfuscatedName("al")
   public void method13775(int[] var1, short[] var2) {
      this.field7106 = var1;
      this.field7105 = var2;
   }
}
