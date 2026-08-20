import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vx")
public class class556 extends classVB {
   @ObfuscatedName("ak")
   double field6328;
   @ObfuscatedName("at")
   int field6324;
   @ObfuscatedName("ag")
   double field6325;
   @ObfuscatedName("aj")
   double field6330;
   @ObfuscatedName("ae")
   double field6327;
   @ObfuscatedName("av")
   int field6329 = 0;
   @ObfuscatedName("an")
   double field6326;

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("an")
   @Override
   public int vmethod420() {
      double var1 = class560.method11318(this, (byte)-30);
      double var3 = var1 * (this.field6328 - this.field6330) + this.field6330;
      return (int)Math.round(this.field6325 + this.field6327 * Math.cos(var3));
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("av")
   @Override
   public int vmethod418(int var1) {
      try {
         double var2 = class560.method11318(this, (byte)-30);
         double var4 = var2 * (this.field6328 - this.field6330) + this.field6330;
         return (int)Math.round(this.field6325 + this.field6327 * Math.cos(var4));
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "vx.av(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("at")
   @Override
   public int vmethod421(int var1) {
      try {
         double var2 = class560.method11318(this, (byte)-30);
         double var4 = (this.field6328 - this.field6330) * var2 + this.field6330;
         return (int)Math.round(this.field6326 + this.field6327 * Math.sin(var4));
      } catch (RuntimeException var6) {
         throw RestClientThreadFactory.newRunException(var6, "vx.at(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(I)I")
   @ObfuscatedName("ag")
   @Override
   public int vmethod417(int var1) {
      try {
         double var2 = class560.method11318(this, (byte)-30);
         return (int)Math.round(-922834783 * this.field6329 + var2 * (this.field6324 * -193648427 - -922834783 * this.field6329));
      } catch (RuntimeException var4) {
         throw RestClientThreadFactory.newRunException(var4, "vx.ag(" + 41);
      }
   }

   public class556(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      super(var9, var10);
      this.field6324 = 0;
      this.field6325 = 0.0;
      this.field6326 = 0.0;
      this.field6327 = 0.0;
      this.field6330 = 0.0;
      this.field6328 = 0.0;
      this.field6329 = -1417331871 * var3;
      this.field6324 = var6 * -634990467;
      if ((var7 - var1) * (var5 - var8) == (var8 - var2) * (var4 - var7)) {
         this.field6325 = var4;
         this.field6326 = var5;
      } else {
         double var11 = (var1 + var7) / 2.0;
         double var13 = (var2 + var8) / 2.0;
         double var15 = (var7 + var4) / 2.0;
         double var17 = (var8 + var5) / 2.0;
         double var19 = (var7 - var1) * -1.0 / (var8 - var2);
         double var21 = (var4 - var7) * -1.0 / (var5 - var8);
         this.field6325 = (var17 + (var11 * var19 - var15 * var21) - var13) / (var19 - var21);
         this.field6326 = var19 * (this.field6325 - var11) + var13;
         this.field6327 = Math.sqrt(Math.pow(this.field6325 - var1, 2.0) + Math.pow(this.field6326 - var2, 2.0));
         this.field6330 = Math.atan2(var2 - this.field6326, var1 - this.field6325);
         double var23 = Math.atan2(var8 - this.field6326, var7 - this.field6325);
         this.field6328 = Math.atan2(var5 - this.field6326, var4 - this.field6325);
         boolean var25 = this.field6330 <= var23 && var23 <= this.field6328 || this.field6328 <= var23 && var23 <= this.field6330;
         if (!var25) {
            this.field6328 = this.field6328 + (this.field6330 - this.field6328 > 0.0 ? 2 : -2) * Math.PI;
         }
      }
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ae")
   @Override
   public int vmethod424() {
      double var1 = class560.method11318(this, (byte)-30);
      double var3 = var1 * (this.field6328 - this.field6330) + this.field6330;
      return (int)Math.round(this.field6325 + this.field6327 * Math.cos(var3));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("au")
   @Override
   public int vmethod427() {
      double var1 = class560.method11318(this, (byte)-30);
      return (int)Math.round(-187976034 * this.field6329 + var1 * (this.field6324 * -920532864 - -1675090931 * this.field6329));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ak")
   @Override
   public int vmethod423() {
      double var1 = class560.method11318(this, (byte)-30);
      double var3 = (this.field6328 - this.field6330) * var1 + this.field6330;
      return (int)Math.round(this.field6326 + this.field6327 * Math.sin(var3));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aj")
   @Override
   public int vmethod422() {
      double var1 = class560.method11318(this, (byte)-30);
      double var3 = (this.field6328 - this.field6330) * var1 + this.field6330;
      return (int)Math.round(this.field6326 + this.field6327 * Math.sin(var3));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ap")
   @Override
   public int vmethod425() {
      double var1 = class560.method11318(this, (byte)-30);
      return (int)Math.round(-1836855308 * this.field6329 + var1 * (this.field6324 * -994004269 - -879164414 * this.field6329));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("ay")
   @Override
   public int vmethod419() {
      double var1 = class560.method11318(this, (byte)-30);
      return (int)Math.round(-922834783 * this.field6329 + var1 * (this.field6324 * -284914229 - -109928474 * this.field6329));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("aw")
   @Override
   public int vmethod426() {
      double var1 = class560.method11318(this, (byte)-30);
      double var3 = (this.field6328 - this.field6330) * var1 + this.field6330;
      return (int)Math.round(this.field6326 + this.field6327 * Math.sin(var3));
   }

   @ObfuscatedSignature(descriptor = "()I")
   @ObfuscatedName("az")
   @Override
   public int vmethod428() {
      double var1 = class560.method11318(this, (byte)-30);
      return (int)Math.round(-922834783 * this.field6329 + var1 * (this.field6324 * -193648427 - -922834783 * this.field6329));
   }

   @ObfuscatedSignature(descriptor = "(Lof;I)Z")
   @ObfuscatedName("no")
   static final boolean runCs1(Widget var0, int var1) {
      try {
         if (null == var0.cs1Comparisons) {
            if (var1 != -1333135934) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            for (int var2 = 0; var2 < var0.cs1Comparisons.length; var2++) {
               if (var1 != -1333135934) {
                  throw new IllegalStateException();
               }

               int var3 = class147.method4140(var0, var2, 850322810);
               int var4 = var0.cs1ComparisonValues[var2];
               if (2 == var0.cs1Comparisons[var2]) {
                  if (var3 >= var4) {
                     if (var1 != -1333135934) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
               } else if (var0.cs1Comparisons[var2] == 3) {
                  if (var1 != -1333135934) {
                     throw new IllegalStateException();
                  }

                  if (var3 <= var4) {
                     if (var1 != -1333135934) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
               } else if (var0.cs1Comparisons[var2] == 4) {
                  if (var1 != -1333135934) {
                     throw new IllegalStateException();
                  }

                  if (var4 == var3) {
                     return false;
                  }
               } else if (var3 != var4) {
                  if (var1 != -1333135934) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw RestClientThreadFactory.newRunException(var5, "vx.no(" + ')');
      }
   }
}
