import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("my")
final class classMY implements Comparator {
   @ToRemove(unused = "true")
   @ObfuscatedName("az")
   static final int field4620 = 10;
   @ToRemove(unused = "true")
   @ObfuscatedName("bb")
   static final int field4621 = 81;
   @ToRemove(unused = "true")
   @ObfuscatedName("ab")
   public static final int field4618 = 7;
   @ToRemove(unused = "true")
   @ObfuscatedName("af")
   static final int field4619 = 4;

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jl")
   public boolean method7744(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Lnm;Lnm;I)I")
   @ObfuscatedName("az")
   int method7741(classNM var1, classNM var2, int var3) {
      try {
         return var1.method7889(985767106).compareTo(var2.method7889(985767106));
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "my.az(" + 41);
      }
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method7741((classNM)var1, (classNM)var2, 6041249);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "my.compare(" + 41);
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "my.equals(" + ')');
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lgh;)V")
   @ObfuscatedName("fu")
   public static void method7746(classGH var0) {
      if (var0 == null) {
         var0.method5435();
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;)Z")
   @ObfuscatedName("jr")
   public boolean method7745(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("as")
   public int method7742(Object var1, Object var2) {
      return this.method7741((classNM)var1, (classNM)var2, -1798948815);
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method7743(Object var1, Object var2) {
      return this.method7741((classNM)var1, (classNM)var2, 853304648);
   }

   @ObfuscatedSignature(descriptor = "(II)Z")
   @ObfuscatedName("as")
   public static boolean method7740(int var0, int var1) {
      try {
         boolean var10000;
         if (var0 >= classKB.field3527.field3538 * 78062377 && var0 <= classKB.field3530.field3538 * 78062377) {
            if (var1 <= -49744082) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "my.as(" + ')');
      }
   }
}
