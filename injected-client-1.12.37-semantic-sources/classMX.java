import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("mx")
final class classMX implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   static final String field4616 = "(?<!\\\\),";
   @ToRemove(unused = "true")
   @ObfuscatedName("cv")
   static final int field4615 = 114;
   @ToRemove(unused = "true")
   @ObfuscatedName("cr")
   static final int field4614 = 102;
   @ToRemove(unused = "true")
   @ObfuscatedName("ae")
   static final String field4617 = "Authorization";
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   static final int field4613 = 9;

   @ObfuscatedSignature(descriptor = "(Lnm;Lnm;I)I")
   @ObfuscatedName("az")
   int method7733(classNM var1, classNM var2, int var3) {
      try {
         byte var10000;
         if (var1.field4687 * 4044309507405125089L < 4044309507405125089L * var2.field4687) {
            if (var3 == 731437002) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else if (4044309507405125089L * var1.field4687 == 4044309507405125089L * var2.field4687) {
            if (var3 == 731437002) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "mx.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method7737(Object var1) {
      return super.equals(var1);
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method7733((classNM)var1, (classNM)var2, 1997029192);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "mx.compare(" + 41);
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "mx.equals(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("as")
   public int method7735(Object var1, Object var2) {
      return this.method7733((classNM)var1, (classNM)var2, -320542281);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public boolean method7738(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method7736(Object var1, Object var2) {
      return this.method7733((classNM)var1, (classNM)var2, 500367300);
   }

   @ObfuscatedSignature(descriptor = "(Lnm;Lnm;)I")
   @ObfuscatedName("af")
   int method7734(classNM var1, classNM var2) {
      return var1.field4687 * 4044309507405125089L < 4044309507405125089L * var2.field4687
         ? -1
         : (4044309507405125089L * var1.field4687 == 4044309507405125089L * var2.field4687 ? 0 : 1);
   }

   @ObfuscatedSignature(descriptor = "(Lte;ILte;III)V")
   @ObfuscatedName("br")
   static void method7739(classTE var0, int var1, classTE var2, int var3, int var4, int var5) {
      try {
         if (classYY.field7111 == var0.field6128) {
            System.arraycopy(var0.field6126, var1, var2.field6126, var3, var4);
         } else if (var0.field6128 == classYY.field7115) {
            if (var5 >= -2122634010) {
               throw new IllegalStateException();
            }

            System.arraycopy(var0.field6127, var1, var2.field6127, var3, var4);
         } else {
            System.arraycopy(var0.field6125, var1, var2.field6125, var3, var4);
         }
      } catch (RuntimeException var6) {
         throw classEG.method3884(var6, "mx.br(" + ')');
      }
   }
}
