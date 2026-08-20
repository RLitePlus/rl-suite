import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("ev")
public class classEV extends classRD {
   @ToRemove(unused = "true")
   @ObfuscatedName("ao")
   public static final int field1941 = 12;
   @ObfuscatedName("az")
   final boolean field1940;
   @ObfuscatedName("gt")
   static String field1947;
   @ObfuscatedName("id")
   static String field1948;
   @ToRemove(unused = "true")
   @ObfuscatedName("ak")
   static final String field1946 = "decimal_";
   @ObfuscatedName("bz")
   static int field1943;
   @ToRemove(unused = "true")
   @ObfuscatedName("bm")
   static final int field1942 = 46;
   @ToRemove(unused = "true")
   @ObfuscatedName("ct")
   static final int field1945 = 150;
   @ObfuscatedName("cb")
   static int field1944;

   @ObfuscatedSignature(descriptor = "(FFFFIIIB)V")
   @ObfuscatedName("ad")
   public static final void method4087(float var0, float var1, float var2, float var3, int var4, int var5, int var6, byte var7) {
      try {
         if (classFO.field2346) {
            if (var7 >= 0) {
               throw new IllegalStateException();
            }
         } else {
            float var12 = 50.0F;
            float var13 = classFQ.method4929();
            float var14 = var12 * (1376644555 * classFO.field2349 - var4) / var6;
            float var15 = (classFO.field2348 * 1170217135 - var5) * var12 / var6;
            float var16 = (1376644555 * classFO.field2349 - var4) * var13 / var6;
            float var17 = (1170217135 * classFO.field2348 - var5) * var13 / var6;
            float var19 = var15 * var1 + var0 * var12;
            var12 = classDX.method3681(var15, var12, var1, var0, (byte)-3);
            float var20 = var1 * var17 + var13 * var0;
            var13 = classDX.method3681(var17, var13, var1, var0, (byte)-105);
            float var18 = classFY.method5271(var14, var12, var3, var2, (byte)45);
            float var21 = var14 * var2 + var3 * var12;
            float var27 = classFY.method5271(var16, var13, var3, var2, (byte)64);
            float var22 = var3 * var13 + var16 * var2;
            classCI.method1506((int)var18, (int)var19, (int)var21, (int)var27, (int)var20, (int)var22, -99698685);
         }
      } catch (RuntimeException var23) {
         throw classEG.method3884(var23, "ev.ad(" + ')');
      }
   }

   public classEV(boolean var1) {
      this.field1940 = var1;
   }

   @Override
   public int compare(Object var1, Object var2) {
      try {
         return this.method4082((Buddy)var1, (Buddy)var2, 1972356957);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ev.compare(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("as")
   public int method4085(Object var1, Object var2) {
      return this.method4082((Buddy)var1, (Buddy)var2, 1972356957);
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;I)I")
   @ObfuscatedName("az")
   int method4082(Buddy var1, Buddy var2, int var3) {
      try {
         if (var2.field5669 * -760305529 != var1.field5669 * -760305529) {
            int var10000;
            if (this.field1940) {
               if (var3 != 1972356957) {
                  throw new IllegalStateException();
               }

               var10000 = -760305529 * var1.field5669 - var2.field5669 * -760305529;
            } else {
               var10000 = -760305529 * var2.field5669 - var1.field5669 * -760305529;
            }

            return var10000;
         } else {
            return classRD.method9942(this, var1, var2, 1604251939);
         }
      } catch (RuntimeException var4) {
         throw classEG.method3884(var4, "ev.az(" + 41);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;)I")
   @ObfuscatedName("ae")
   int method4083(Buddy var1, Buddy var2) {
      if (var2.field5669 * -760305529 != var1.field5669 * -760305529) {
         return this.field1940 ? -760305529 * var1.field5669 - var2.field5669 * -760305529 : -760305529 * var2.field5669 - var1.field5669 * -760305529;
      } else {
         return classRD.method9942(this, var1, var2, 1329000402);
      }
   }

   @ObfuscatedSignature(descriptor = "(Lri;Lri;)I")
   @ObfuscatedName("af")
   int method4084(Buddy var1, Buddy var2) {
      if (var2.field5669 * -760305529 != var1.field5669 * -760305529) {
         return this.field1940 ? -760305529 * var1.field5669 - var2.field5669 * -760305529 : -760305529 * var2.field5669 - var1.field5669 * -760305529;
      } else {
         return classRD.method9942(this, var1, var2, 1986026414);
      }
   }

   @ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I")
   @ObfuscatedName("ax")
   public int method4086(Object var1, Object var2) {
      try {
         return this.method4082((Buddy)var1, (Buddy)var2, 1972356957);
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "ev.compare(" + 41);
      }
   }
}
