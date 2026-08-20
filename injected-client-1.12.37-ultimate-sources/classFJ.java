import net.runelite.api.SceneTilePaint;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ToRemove;

@ObfuscatedName("fj")
public final class classFJ implements SceneTilePaint {
   @ToRemove(unused = "true")
   @ObfuscatedName("ay")
   static final int field2290 = 2;
   @ObfuscatedName("af")
   int field2288;
   @ObfuscatedName("ae")
   int field2286;
   @ObfuscatedName("ab")
   int field2284;
   @ObfuscatedName("az")
   int field2285;
   @ObfuscatedName("as")
   public boolean field2283 = true;
   @ObfuscatedName("py")
   public int field2291;
   @ObfuscatedName("zp")
   public int field2293;
   @ObfuscatedName("ao")
   static final int[][] field2282 = new int[][]{{2, 3, 1}, {0, 1, 3}};
   @ObfuscatedName("xf")
   public int field2292;
   @ObfuscatedName("ac")
   static final int[] field2280 = new int[]{0, 1, 1, 0};
   @ObfuscatedName("aa")
   static final int[] field2281 = new int[]{0, 0, 1, 1};
   @ObfuscatedName("ag")
   int field2287;
   @ObfuscatedSignature(descriptor = "Lyz;")
   @ObfuscatedName("dh")
   static classYZ field2294;
   @ObfuscatedName("ax")
   int field2289;

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lrt;Lrr;)V")
   @ObfuscatedName("ro")
   public static void method4803(classRT var0, classRR var1) {
      var0.field5843[(var0.field5842 += 2063367951) * 1744080879 - 1] = var1;
   }

   public int getBufferOffset() {
      return this.field2293;
   }

   @ObfuscatedSignature(descriptor = "(IB)Lps;")
   @ObfuscatedName("az")
   public static classPS method4796(int var0, byte var1) {
      try {
         if (var0 >= 0 && var0 < classYV.field7095.length) {
            if (var1 >= 13) {
               throw new IllegalStateException();
            }

            if (classYV.field7095[var0] != null) {
               if (var1 >= 13) {
                  throw new IllegalStateException();
               }

               return classYV.field7095[var0];
            }
         }

         return new classPS(var0);
      } catch (RuntimeException var2) {
         throw classEG.method3884(var2, "fj.az(" + ')');
      }
   }

   public int getNwColor() {
      return this.field2284 * 1860831095;
   }

   public int getBufferLen() {
      return this.field2291;
   }

   public int getSwColor() {
      return this.field2285 * 1145127777;
   }

   public void setUvBufferOffset(int var1) {
      this.field2292 = var1;
   }

   public boolean isFlat() {
      return this.field2283;
   }

   public void setTexture(int var1) {
      this.field2287 = var1 * -2018322747;
   }

   public void setSwColor(int var1) {
      this.field2285 = var1 * -807886687;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[[[IIII[I[I[I)V")
   @ObfuscatedName("ab")
   public static void method4794(int var0, int[][][] var1, int var2, int var3, int var4, int[] var5, int[] var6, int[] var7) {
      int[] var8 = field2282[var0];

      for (int var9 = 0; var9 < var8.length; var9++) {
         int var13 = var8[var9];
         int var12 = (var3 << 7) + field2280[var13] * 128;
         var5[var9] = var12;
         var6[var9] = classPT.method9210(var8[var9], var1, var2, var3, var4, (byte)9);
         var7[var9] = classFO.method4850(var8[var9], var4, -45520089);
      }
   }

   classFJ(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.field2285 = -807886687 * var1;
      this.field2288 = var2 * -241249223;
      this.field2286 = -862484089 * var3;
      this.field2284 = var4 * 863961671;
      this.field2287 = -2018322747 * var5;
      this.field2289 = var6 * 1664388433;
      this.field2283 = var7;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(Lpr;IJ)J")
   @ObfuscatedName("bg")
   public static long method4802(classPR var0, int var1, long var2) {
      return classBW.method1276(var0.field5387, var1, var2);
   }

   public int getSeColor() {
      return this.field2288 * -633153015;
   }

   public int getTexture() {
      return this.field2287 * 1479555085;
   }

   public void setSeColor(int var1) {
      this.field2288 = var1 * -241249223;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[[[IIII[I[I[I)V")
   @ObfuscatedName("ag")
   public static void method4795(int var0, int[][][] var1, int var2, int var3, int var4, int[] var5, int[] var6, int[] var7) {
      int[] var8 = field2282[var0];

      for (int var9 = 0; var9 < var8.length; var9++) {
         int var13 = var8[var9];
         int var12 = (var3 << 7) + field2280[var13] * 128;
         var5[var9] = var12;
         var6[var9] = classPT.method9210(var8[var9], var1, var2, var3, var4, (byte)-32);
         var7[var9] = classFO.method4850(var8[var9], var4, 1512551737);
      }
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("as")
   static int method4797(int var0, int var1) {
      return (var1 << 7) + 128 * field2281[var0];
   }

   public void setBufferLen(int var1) {
      this.field2291 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ac")
   static int method4798(int var0, int var1) {
      return (var1 << 7) + 128 * field2281[var0];
   }

   public void setNeColor(int var1) {
      this.field2286 = var1 * -862484089;
   }

   public void setNwColor(int var1) {
      this.field2284 = var1 * 863961671;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("aa")
   static int method4799(int var0, int var1) {
      return (var1 << 7) + 1234770612 * field2281[var0];
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(I[[[IIII)I")
   @ObfuscatedName("ao")
   static int method4801(int var0, int[][][] var1, int var2, int var3, int var4) {
      return var1[var2][field2280[var0] + var3][field2281[var0] + var4];
   }

   public int getRBG() {
      return this.field2289 * 1843846065;
   }

   @ObfuscatedSignature(descriptor = "(IIIIISISIII)V")
   @ObfuscatedName("db")
   static void method4805(int var0, int var1, int var2, int var3, int var4, short var5, int var6, short var7, int var8, int var9, int var10) {
      try {
         classDZ.method3773(classCQ.field1220, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, 1465980917);
      } catch (RuntimeException var11) {
         throw classEG.method3884(var11, "fj.db(" + ')');
      }
   }

   public void setBufferOffset(int var1) {
      this.field2293 = var1;
   }

   @ToRemove(unused = "true")
   @ObfuscatedSignature(descriptor = "(II)I")
   @ObfuscatedName("ax")
   static int method4800(int var0, int var1) {
      return (var1 << 7) + 128 * field2281[var0];
   }

   public int getNeColor() {
      return this.field2286 * -665850825;
   }

   public int getUvBufferOffset() {
      return this.field2292;
   }

   @ObfuscatedSignature(descriptor = "([Ljava/lang/String;I)Lte;")
   @ObfuscatedName("aq")
   static classTE method4804(String[] var0, int var1) {
      try {
         classTE var2 = new classTE(classYY.field7113, true);
         var2.field6125 = var0;
         var2.field6131 = -1063196331 * var0.length;
         var2.field6123 = var0.length * 404453943;
         return var2;
      } catch (RuntimeException var3) {
         throw classEG.method3884(var3, "fj.aq(" + ')');
      }
   }

   @ObfuscatedSignature(descriptor = "(I)Ljl;")
   @ObfuscatedName("az")
   static classJL method4793(int var0) {
      try {
         if (1275112637 * classJL.field3334 == 0) {
            if (var0 <= 1375698635) {
               throw new IllegalStateException();
            } else {
               return new classJL();
            }
         } else {
            return classJL.field3333[(classJL.field3334 -= 766488213) * 1275112637];
         }
      } catch (RuntimeException var1) {
         throw classEG.method3884(var1, "fj.az(" + ')');
      }
   }
}
