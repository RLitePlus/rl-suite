import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("vy")
public abstract class classVY {
   @ObfuscatedName("aa")
   int field6643 = 0;
   @ObfuscatedName("ao")
   int field6641 = 0;
   @ObfuscatedName("al")
   double field6642 = 0.0;
   @ObfuscatedName("aj")
   int field6644 = 0;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lcy;)I")
   @ObfuscatedName("mf")
   public static int method12272(ClientPreferences var0) {
      return -1250316135 * var0.field1340;
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ap")
   public void method12264() {
      if (1883191353 * this.field6641 < this.field6643 * -665926205) {
         this.field6641 += 155399689;
         int var1 = this.field6641 * 1883191353;
         int var2 = -665926205 * this.field6643;
         int var4 = 684177813 * this.field6644;
         classZL var3 = classZL.field7201[var4];
         this.field6642 = classIC.method6141(var1, var2, var3, (byte)64);
      }
   }

   @ObfuscatedSignature(descriptor = "(B)V")
   @ObfuscatedName("al")
   public void method12265(byte var1) {
      try {
         if (1883191353 * this.field6641 < this.field6643 * -665926205) {
            this.field6641 += 155399689;
            int var2 = this.field6641 * 1883191353;
            int var3 = -665926205 * this.field6643;
            int var5 = 684177813 * this.field6644;
            classZL var4 = classZL.field7201[var5];
            this.field6642 = classIC.method6141(var2, var3, var4, (byte)64);
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "vy.al(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("aj")
   public boolean method12268(byte var1) {
      try {
         boolean var10000;
         if (this.field6641 * 1883191353 >= this.field6643 * -665926205) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "vy.aj(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)D")
   @ObfuscatedName("ay")
   double method12270(int var1) {
      try {
         return this.field6642;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "vy.ay(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("aq")
   public void method12266() {
      if (1883191353 * this.field6641 < this.field6643 * -665926205) {
         this.field6641 += -272485565;
         int var1 = this.field6641 * 1883191353;
         int var2 = -665926205 * this.field6643;
         int var4 = -1035534286 * this.field6644;
         classZL var3 = classZL.field7201[var4];
         this.field6642 = classIC.method6141(var1, var2, var3, (byte)64);
      }
   }

   @ObfuscatedSignature(descriptor = "()V")
   @ObfuscatedName("ad")
   public void method12267() {
      if (1883191353 * this.field6641 < this.field6643 * -665926205) {
         this.field6641 += 155399689;
         int var1 = this.field6641 * 1883191353;
         int var2 = -665926205 * this.field6643;
         int var4 = 684177813 * this.field6644;
         classZL var3 = classZL.field7201[var4];
         this.field6642 = classIC.method6141(var1, var2, var3, (byte)64);
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("au")
   public boolean method12269() {
      return this.field6641 * 1883191353 >= this.field6643 * -665926205;
   }

   classVY(int var1, int var2) {
      this.field6643 = var1 * 1019761387;
      this.field6641 = 0;
      this.field6644 = (var2 >= 0 && var2 <= 27 ? var2 : 0) * -1426142787;
      int var4 = this.field6641 * 1883191353;
      int var5 = this.field6643 * -665926205;
      int var7 = this.field6644 * 684177813;
      classZL var6 = classZL.field7201[var7];
      this.field6642 = classIC.method6141(var4, var5, var6, (byte)64);
   }

   @ObfuscatedSignature(descriptor = "()D")
   @ObfuscatedName("ar")
   double method12271() {
      return this.field6642;
   }
}
