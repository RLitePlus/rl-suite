import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vd")
public class classVD extends classVI {
   @ObfuscatedName("ae")
   double field6495;
   @ObfuscatedName("af")
   int field6492;
   @ObfuscatedName("az")
   int field6491 = 0;
   @ObfuscatedName("ab")
   double field6493;
   @ObfuscatedName("as")
   double field6496;
   @ObfuscatedName("ag")
   double field6497;
   @ObfuscatedName("ax")
   double field6494;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ac")
   @Override
   public int vmethod619() {
      double var1 = this.method12270(-1512872119);
      return (int)Math.round(this.field6491 * 927423779 + (this.field6492 * -1692126265 - this.field6491 * 927423779) * var1);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("af")
   @Override
   public int vmethod614(int var1) {
      try {
         double var2 = this.method12270(-1578685937);
         double var4 = var2 * (this.field6494 - this.field6496) + this.field6496;
         return (int)Math.round(this.field6495 + this.field6497 * Math.cos(var4));
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "vd.az(" + 41);
      }
   }

   public classVD(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var9, var10);
      this.field6492 = 0;
      this.field6495 = 0.0;
      this.field6493 = 0.0;
      this.field6497 = 0.0;
      this.field6496 = 0.0;
      this.field6494 = 0.0;
      this.field6491 = var3 * 149404299;
      this.field6492 = -14180873 * var6;
      if ((var7 - var1) * (var5 - var8) == (var8 - var2) * (var4 - var7)) {
         this.field6495 = var4;
         this.field6493 = var5;
      } else {
         double var11 = (var7 + var1) / 2.0;
         double var13 = (var8 + var2) / 2.0;
         double var15 = (var4 + var7) / 2.0;
         double var17 = (var5 + var8) / 2.0;
         double var19 = (var7 - var1) * -1.0 / (var8 - var2);
         double var21 = (var4 - var7) * -1.0 / (var5 - var8);
         this.field6495 = (var19 * var11 - var15 * var21 + var17 - var13) / (var19 - var21);
         this.field6493 = var13 + var19 * (this.field6495 - var11);
         this.field6497 = Math.sqrt(Math.pow(this.field6495 - var1, 2.0) + Math.pow(this.field6493 - var2, 2.0));
         this.field6496 = Math.atan2(var2 - this.field6493, var1 - this.field6495);
         double var23 = Math.atan2(var8 - this.field6493, var7 - this.field6495);
         this.field6494 = Math.atan2(var5 - this.field6493, var4 - this.field6495);
         boolean var25 = this.field6496 <= var23 && var23 <= this.field6494 || this.field6494 <= var23 && var23 <= this.field6496;
         if (!var25) {
            this.field6494 = this.field6494 + Math.PI * (this.field6496 - this.field6494 > 0.0 ? 2 : -2);
         }
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("az")
   @Override
   public int vmethod620(int var1) {
      try {
         double var2 = this.method12270(720466528);
         return (int)Math.round(this.field6491 * 927423779 + (this.field6492 * -1692126265 - this.field6491 * 927423779) * var2);
      } catch (RuntimeException var4) {
         throw classEG.newRunException(var4, "vd.ae(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ab")
   @Override
   public int vmethod615() {
      double var1 = this.method12270(1347245592);
      double var3 = var1 * (this.field6494 - this.field6496) + this.field6496;
      return (int)Math.round(this.field6495 + this.field6497 * Math.cos(var3));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod616() {
      double var1 = this.method12270(2046342084);
      double var3 = var1 * (this.field6494 - this.field6496) + this.field6496;
      return (int)Math.round(this.field6495 + this.field6497 * Math.cos(var3));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("as")
   @Override
   public int vmethod617() {
      double var1 = this.method12270(88876734);
      double var3 = (this.field6494 - this.field6496) * var1 + this.field6496;
      return (int)Math.round(this.field6493 + this.field6497 * Math.sin(var3));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ax")
   @Override
   public int vmethod621() {
      double var1 = this.method12270(-1806251537);
      return (int)Math.round(this.field6491 * -665796932 + (this.field6492 * -487832104 - this.field6491 * -105263203) * var1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ao")
   @Override
   public int vmethod622() {
      double var1 = this.method12270(1711907911);
      return (int)Math.round(this.field6491 * 927423779 + (this.field6492 * -1692126265 - this.field6491 * 927423779) * var1);
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aa")
   @Override
   public int vmethod623() {
      double var1 = this.method12270(260312400);
      return (int)Math.round(this.field6491 * 927423779 + (this.field6492 * -1692126265 - this.field6491 * 927423779) * var1);
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod618(int var1) {
      try {
         double var2 = this.method12270(2037435047);
         double var4 = (this.field6494 - this.field6496) * var2 + this.field6496;
         return (int)Math.round(this.field6493 + this.field6497 * Math.sin(var4));
      } catch (RuntimeException var6) {
         throw classEG.newRunException(var6, "vd.af(" + 41);
      }
   }
}
