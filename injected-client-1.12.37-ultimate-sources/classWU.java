import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("wu")
public class classWU extends classWT {
   @ObfuscatedName("az")
   long field6781;
   @ObfuscatedName("af")
   int field6780;

   @ObfuscatedSignature(descriptor = "(B)Lvb;")
   @ObfuscatedName("ha")
   static classVB method12629(byte var0) {
      try {
         return classEB.field1726;
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "wu.ha(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(B)Z")
   @ObfuscatedName("az")
   @Override
   public boolean vmethod627(byte var1) {
      try {
         if (this.field6781 * -5771031896953023857L < 283153243 * this.field6780) {
            if (var1 <= 1) {
               throw new IllegalStateException();
            } else {
               this.field6781 += 2912728134211619951L;
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "wu.az(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ag")
   @Override
   public boolean vmethod628() {
      if (this.field6781 * -5771031896953023857L < 283153243 * this.field6780) {
         this.field6781 += 2912728134211619951L;
         return false;
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("af")
   @Override
   public boolean vmethod629() {
      if (this.field6781 * -5771031896953023857L < 847285166 * this.field6780) {
         this.field6781 += 2912728134211619951L;
         return false;
      } else {
         return true;
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ae")
   @Override
   public boolean vmethod626() {
      if (this.field6781 * -5771031896953023857L < -364655615 * this.field6780) {
         this.field6781 += 2912728134211619951L;
         return false;
      } else {
         return true;
      }
   }

   public classWU(classWT var1, int var2) {
      super(var1);
      this.field6780 = var2 * -357210925;
      this.field6777 = "DelayFadeTask";
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lef;)V")
   @ObfuscatedName("jl")
   public static void method12628(classEF var0) {
      classSG[] var1 = var0.field1745;

      for (int var2 = 0; var2 < var1.length; var2++) {
         classSG var3 = var1[var2];
         if (-521703669 * var3.field5924 >= 0) {
            var3.field5929 = var0.field1745[var3.field5924 * -521703669];
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()Z")
   @ObfuscatedName("ab")
   @Override
   public boolean vmethod630() {
      if (this.field6781 * -5771031896953023857L < 283153243 * this.field6780) {
         this.field6781 += 2912728134211619951L;
         return false;
      } else {
         return true;
      }
   }
}
